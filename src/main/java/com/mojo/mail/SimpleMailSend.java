package com.mojo.mail;

import javax.mail.*;
import javax.mail.internet.InternetAddress;
import javax.mail.internet.MimeMessage;
import java.util.Properties;

public class SimpleMailSend {
//    public  static  final  String pass = "Parishkar@1992";
    public static void main(String[] args) {
        System.out.println("test!");
        mailSend();
    }
    public static void mailSend() {

        final String username = "parishkar.nagrikar@inspiraenterprise.com";
        final String password = "Parishkar@1992";

        Properties prop = new Properties();
        prop.put("mail.smtp.host", "smtp.gmail.com");
        prop.put("mail.smtp.port", "587");
        prop.put("mail.smtp.auth", "true");
        prop.put("mail.smtp.starttls.enable", "true"); //TLS

        Session session = Session.getInstance(prop,
                new javax.mail.Authenticator() {
                    protected PasswordAuthentication getPasswordAuthentication() {
                        return new PasswordAuthentication(username, password);
                    }
                });

        try {
                Message message = new MimeMessage(session);
                message.setFrom(new InternetAddress("test@testing.com"));
                message.setRecipients(
                        Message.RecipientType.TO,
                        InternetAddress.parse("parishkar.nagrikar@inspiraenterprise.com")
                );
                message.setSubject("Testing Gmail TLS");
                message.setText("Dear Mail Crawler,"
                        + "\n\n Please do not spam my email!");

                Transport.send(message);
                System.out.println("Done");
        } catch (MessagingException e) {
            e.printStackTrace();
        }
    }
}