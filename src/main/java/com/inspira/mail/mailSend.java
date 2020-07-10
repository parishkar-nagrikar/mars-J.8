package com.inspira.mail;

import java.util.*;
import javax.mail.*;
import javax.mail.internet.*;

public class mailSend
{
    public static void main(String [] args){
        String to = "parishkar.nagrikar@inspiraenterprise.com";//change accordingly
        String from = "parishkar.nagrikar@inspiraenterprise.com";//change accordingly
        String host = "smtp.gmail.com";//or IP address
        final String username = "parishkar.nagrikar@inspiraenterprise.com";
        final String password = "Parishkar@1992";

        //Get the session object
        Properties properties = System.getProperties();
        properties.setProperty("mail.smtp.host", host);
        properties.setProperty("mail.smtp.port", "587");
        properties.setProperty("mail.smtp.auth", "true");
        properties.setProperty("mail.smtp.starttls.enable", "true"); //TLS
        Session session = Session.getInstance(properties,
                new javax.mail.Authenticator() {
                    protected PasswordAuthentication getPasswordAuthentication() {
                        return new PasswordAuthentication(username, password);
                    }
                });

        //compose the message
        try{
            MimeMessage message = new MimeMessage(session);
            message.setFrom(new InternetAddress(from));
            message.addRecipient(Message.RecipientType.TO,new InternetAddress(to));
            message.setSubject("Ping");
            message.setText("Hello, this is example of sending email  -"+from);

            // Send message
            Transport.send(message);
            System.out.println("message sent successfully....");

        }catch (MessagingException mex) {mex.printStackTrace();}
    }
}