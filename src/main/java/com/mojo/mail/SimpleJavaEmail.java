package com.mojo.mail;

import java.util.Properties;
import javax.mail.Message;
import javax.mail.MessagingException;
import javax.mail.Session;
import javax.mail.Transport;
import javax.mail.internet.AddressException;
import javax.mail.internet.InternetAddress;
import javax.mail.internet.MimeMessage;

public class SimpleJavaEmail
{
    Session mailSession;

    public static void main(String args[]) throws AddressException, MessagingException
    {
        SimpleJavaEmail javaEmail = new SimpleJavaEmail();
        javaEmail.setMailServerProperties();
        javaEmail.draftEmailMessage();
        javaEmail.sendEmail();
    }

    private void setMailServerProperties()
    {
        Properties emailProperties = System.getProperties();
        emailProperties.put("mail.smtp.port", "587");
        emailProperties.put("mail.smtp.auth", "true");
        emailProperties.put("mail.smtp.starttls.enable", "true");
        mailSession = Session.getDefaultInstance(emailProperties, null);
    }

    private MimeMessage draftEmailMessage() throws AddressException, MessagingException
    {
        String[] toEmails = { "parishkar.nagrikar@inspiraenterprise.com" };
        String emailSubject = "Test email subject";
        String emailBody = "This is an email sent by <b>//parishkar.nagrikar@testing.com</b>.";
        MimeMessage emailMessage = new MimeMessage(mailSession);
        /*** Set the mail recipients ***/
        for (int i = 0; i < toEmails.length; i++)
        {
            emailMessage.addRecipient(Message.RecipientType.TO, new InternetAddress(toEmails[i]));
        }
        emailMessage.setSubject(emailSubject);
        /*** If sending HTML mail ***/
        emailMessage.setContent(emailBody, "text/html");
        /*** If sending only text mail ***/
        //emailMessage.setText(emailBody);// for a text email
        return emailMessage;
    }

    private void sendEmail() throws AddressException, MessagingException
    {
        /*** Sender's credentials ***/
        String fromUser = "parishkar.nagrikar@inspiraenterprise.com";
        String fromUserEmailPassword = "Parishkar@1992";

        String emailHost = "smtp.gmail.com";
        Transport transport = mailSession.getTransport("smtp");
        transport.connect(emailHost, fromUser, fromUserEmailPassword);
        /*** Draft the message ***/
        MimeMessage emailMessage = draftEmailMessage();
        /*** Send the mail ***/
        transport.sendMessage(emailMessage, emailMessage.getAllRecipients());
        transport.close();
        System.out.println("Email sent successfully.");
    }
}