package com.mojo.mail;

import org.apache.commons.lang3.StringUtils;
import org.apache.commons.mail.DefaultAuthenticator;
import org.apache.commons.mail.Email;
import org.apache.commons.mail.EmailException;
import org.apache.commons.mail.HtmlEmail;
import org.flowable.common.engine.api.FlowableException;
import org.flowable.engine.cfg.MailServerInfo;
import org.flowable.engine.impl.util.CommandContextUtil;

import java.net.MalformedURLException;
import java.net.URL;
import java.util.Map;

public class ApacheMailer {
    static final String hostname ="smtp.gmail.com";
    static final Integer port =587;
    static final String username ="parishkar.nagrikar@inspiraenterprise.com";
    static final String password ="Parishkar@1992";
    static final String from ="parishkar.nagrikar@inspiraenterprise.com";
    static final String to ="parishkar.nagrikar@inspiraenterprise.com";
    static final String fromname ="parishkar.nagrikar";
    static final String getSubject ="this test mail";

    public static void main(String[] args) throws EmailException, MalformedURLException {

//        ApacheMailer.send();
//        ApacheMailer.send1();
        ApacheMailer.send2();
    }
    private static void method1() throws EmailException, MalformedURLException {
        // Create the email message
        HtmlEmail email = new HtmlEmail();
        email.setSmtpPort(587);
        email.setHostName("smtp.gmail.com");
        email.addTo("parishkar.nagrikar@inspiraenterprise.com", "John Doe");
        email.setFrom("parishkar.nagrikar@inspiraenterprise.com", "Me");
        email.setSubject("Test email with inline image");

        // embed the image and get the content id
        URL url = new URL("http://www.apache.org/images/asf_logo_wide.gif");
        String cid = email.embed(url, "Apache logo");

        // set the html message
        email.setHtmlMsg("<html>The apache logo - <img src=\"cid:"+cid+"\"></html>");

        // set the alternative message
        email.setTextMsg("Your email client does not support HTML messages");

        // send the email
        email.send();
    }
    private static void method2(Email email) {
        try {
            email.setSmtpPort(587);
            email.setHostName("parishkar.nagrikar@inspiraenterprise.com");
//            email.setCharset(CHARSET);
//            if (!GeneralUtils.isEmpty(SMTP_USER)) {
//                email.setAuthentication(
//                        SMTP_USER,
//                        SMTP_PASSWORD
//                );
//            }
//            email.setSSLOnConnect(SMTP_SSL);
//            email.setStartTLSEnabled(SMTP_TLS);
        } catch (Throwable ex) {
            System.out.println("Erro ao configurar o email."+ ex);
            throw new RuntimeException("Error configuring smtp connection.", ex);
        }
    }
//    private static void send(String mailAddress, String title, String content) {
    private static void send1() {
        try {
            // Create the email message
            HtmlEmail email = new HtmlEmail();
            email.setSmtpPort(port); //email.setSslSmtpPort("465");
            email.setSSL(true);
            email.setHostName("smtp.gmail.com");
            email.addTo(to, "test");
            email.setFrom(from, fromname);
            email.setSubject(getSubject);
            email.setHtmlMsg("<html>Test</html>"); // set the html message
            email.setTextMsg(" Please do not spam my email! ");// set the alternative message
            email.send();// send the email
        } catch (EmailException e) {
            System.out.println("Exception sending email: "+ e);
        } catch (Exception ex) {
            System.out.println("Exception sending email: "+ ex);
        }
    }
    private static void send2() {
        if (StringUtils.isBlank(to)) {
            return;
        }

        try {
            Email email = new HtmlEmail();
            email.setHostName(hostname);
            email.setAuthenticator(new DefaultAuthenticator(username, password));
            email.setSmtpPort(port);
            email.setFrom(from, fromname);
            email.setSubject("mymail");
            email.setMsg(" this is testing mailer!");//
            email.addTo(to);
//            email.setBounceAddress(to);
//            email.addTo(mailAddress.split(mailAddressEndSeparator));
            email.send();
            System.out.println(" !!! Send Mail !!! ");
        } catch (Exception e) {
            System.out.println("Send Mail Error"+ e);
        }
    }
    protected void setFrom(Email email, String from, String tenantId) {
        String fromAddress = null;

        if (from != null) {
            fromAddress = from;
        } else { // use default configured from address in process engine config
            if (tenantId != null && tenantId.length() > 0) {
                Map<String, MailServerInfo> mailServers = CommandContextUtil.getProcessEngineConfiguration().getMailServers();
                if (mailServers != null && mailServers.containsKey(tenantId)) {
                    MailServerInfo mailServerInfo = mailServers.get(tenantId);
                    fromAddress = mailServerInfo.getMailServerDefaultFrom();
                }
            }

            if (fromAddress == null) {
                fromAddress = CommandContextUtil.getProcessEngineConfiguration().getMailServerDefaultFrom();
            }
        }

        try {
            email.setFrom(fromAddress);
        } catch (EmailException e) {
            throw new FlowableException("Could not set " + from + " as from address in email", e);
        }
    }
}