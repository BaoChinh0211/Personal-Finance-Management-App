/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.ptithcm.pe.utilities;

import java.util.Date;
import java.util.Properties;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.mail.*;
import javax.mail.internet.InternetAddress;
import javax.mail.internet.MimeMessage;


/**
 *
 * @author tezca
 */
public class MailerUtilities {
    public static String code;
    private static final String emailFrom = "baochinh000210@gmail.com";
    private static final String password = "qxdugurrhndcpzhx";
    //Email: baochinh000210@gmail.com
    //Password: qxdu gurr hndc pzhx

//    String emailTo;

    public static String getCode() {
        return code;
    }

    public static void setCode(String code) {
        MailerUtilities.code = code;
    }

    
    public static boolean sendEmail(String emailTo, String subject, String context, String code) {
        /* Khai báo các thuộc tính*/
        Properties props = new Properties();
        props.put("mail.smtp.host", "smtp.gmail.com"); // SMTP host
        props.put("mail.smtp.port", 587); // TLS-587, SSL-465
        props.put("mail.smtp.auth", "true");
        props.put("mail.smtp.starttls.enable", "true"); // TLS-587, SSL-465

        /*Create Authenticator*/
        Authenticator auth = new Authenticator(){
            @Override
            protected PasswordAuthentication getPasswordAuthentication() {
                return new PasswordAuthentication(emailFrom, password);
            }

        };

        /*Phiên làm việc*/
        Session session = Session.getInstance(props, auth);

        /*Gửi email*/

            // Tạo tin nhắn
        MimeMessage msg = new MimeMessage(session);
        try {
            msg.addHeader("Content-type", "text/html; charset = UTF-8");
            msg.setFrom(emailFrom); // -> Người gửi
            msg.setRecipients(Message.RecipientType.TO, InternetAddress.parse(emailTo, false)); //-> Người nhận
            msg.setSubject(subject, "UTF-8"); // -> Title email
            msg.setSentDate(new Date()); // -> Ngày gửi
            msg.setReplyTo(InternetAddress.parse("no-reply@service.com", false)); //-> Quy định gửi phản hồi
            msg.setContent(context + code, "text/html; charset = UTF-8"); // -> Nội dung Email

            // Gửi email
            Transport.send(msg);
            setCode(code);
            return true;
        } catch (MessagingException ex) {
            Logger.getLogger(MailerUtilities.class.getName()).log(Level.SEVERE, null, ex);
            return false;
        }
    }
}
