/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Mail;

import java.util.ArrayList;
import java.util.Properties;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.mail.Authenticator;
import javax.mail.Message;
import javax.mail.PasswordAuthentication;
import javax.mail.Session;
import javax.mail.Transport;
import javax.mail.internet.InternetAddress;
import javax.mail.internet.MimeMessage;

/**
 *
 * @author Atmani
 */
public class MailUtil {

    public static void sendMail(String recepient, String mensaje, String Type) throws Exception {

        //Set up the protocols/settings of the SMTP server using JavaMail API and (javax.mail) JAR.
        Properties properties = new Properties();
        properties.put("mail.smtp.auth", "true");
        properties.put("mail.smtp.starttls.enable", "true");
        properties.put("mail.smtp.host", "smtp.office365.com"); //It is given by the Outlook settings system.
        properties.put("mail.smtp.port", "587"); //Outlook access port

        String myAccountEmail = "cs.ia.emaling@outlook.com"; //Email address used to email users.
        String password = "Mehdi12122004"; //Password to access the email address account through Outlook.

        //create the "Session" object
        Session session = Session.getInstance(properties, new Authenticator() {
            @Override
            protected PasswordAuthentication getPasswordAuthentication() {
                return new PasswordAuthentication(myAccountEmail, password);
            }
        });

        //Those control flow statements allow having one "Send email function" for several types of emails -> 
        //In this case, there can be four types: "Password", "ChangePassword", "ChangeUserName", and "ChangeEmail" ->
        //Each type will lead to a different "Prepare Message" including a unique "Subject" and "Message" per email.
        if (Type.equals("Password")) {
            Message message = prepareMessage(session, myAccountEmail, recepient, mensaje);
            Transport.send(message);
            System.out.println("Email sent"); //Allows to confirm the sending of an email. 
        }

        if (Type.equals("ChangePassword")) {
            Message message = prepareMessage2(session, myAccountEmail, recepient, mensaje);
            Transport.send(message);
            System.out.println("Email sent"); //Allows to confirm the sending of an email.   
        }

        if (Type.equals("ChangeUserName")) {
            Message message = prepareMessage3(session, myAccountEmail, recepient, mensaje);
            Transport.send(message);
            System.out.println("Email sent"); //Allows to confirm the sending of an email.   
        }

        if (Type.equals("ChangeEmail")) {
            Message message = prepareMessage4(session, myAccountEmail, recepient, mensaje);
            Transport.send(message);
            System.out.println("Email sent"); //Allows to confirm the sending of an email.    
        }
    }

    public static void sendMailListPeople(ArrayList<String> recepients, String mensaje, String Type) throws Exception {

        //Set up the protocols/settings of the SMTP server using JavaMail API and (javax.mail) JAR.
        Properties properties = new Properties();
        properties.put("mail.smtp.auth", "true");
        properties.put("mail.smtp.starttls.enable", "true");
        properties.put("mail.smtp.host", "smtp.office365.com"); //It is given by the Outlook settings system.
        properties.put("mail.smtp.port", "587"); //Outlook access port

        String myAccountEmail = "cs.ia.emaling@outlook.com"; //Email address used to email users.
        String password = "Mehdi12122004"; //Password to access the email address account through Outlook.

        //create the "Session" object
        Session session = Session.getInstance(properties, new Authenticator() {
            @Override
            protected PasswordAuthentication getPasswordAuthentication() {
                return new PasswordAuthentication(myAccountEmail, password);
            }
        });

        //Those control flow statements allow having one "Send email function" for several types of emails -> 
        //In this case, there can be two types: "Groups" and "Tutoring" ->
        //Each type will lead to a different "Prepare Message" including a unique "Subject" and "Message" per email.
        if (Type.equals("Groups")) {
            Message message = prepareMessageGroups(session, myAccountEmail, recepients, mensaje);
            Transport.send(message);
            System.out.println("Email sent"); //Allows to confirm the sending of an email. 
        }
        if (Type.equals("Tutoring")) {
            Message message = prepareMessageTutoring1(session, myAccountEmail, recepients, mensaje);
            Transport.send(message);
            System.out.println("Email sent"); //Allows to confirm the sending of an email. 
        }
    }

    public static void sendMailListPeople1(ArrayList<String> recepients, String mensaje, String Type, String emitentUserName, String recipientUserName) throws Exception {

        //Set up the protocols/settings of the SMTP server using JavaMail API and (javax.mail) JAR.
        Properties properties = new Properties();
        properties.put("mail.smtp.auth", "true");
        properties.put("mail.smtp.starttls.enable", "true");
        properties.put("mail.smtp.host", "smtp.office365.com"); //It is given by the Outlook settings system.
        properties.put("mail.smtp.port", "587"); //Outlook access port

        String myAccountEmail = "cs.ia.emaling@outlook.com"; //Email address used to email users.
        String password = "Mehdi12122004"; //Password to access the email address account through Outlook.

        //create the "Session" object
        Session session = Session.getInstance(properties, new Authenticator() {
            @Override
            protected PasswordAuthentication getPasswordAuthentication() {
                return new PasswordAuthentication(myAccountEmail, password);
            }
        });

        //In this case there is only one control flow statement added for the "Tutoring" type ->
        //While this conditional is not indispensable, future versions of the system might require additional types of the "sendMailListPeople1" function.
        if (Type.equals("Tutoring")) {
            Message message = prepareMessageTutoring2(session, myAccountEmail, recepients, mensaje, emitentUserName, recipientUserName);
            Transport.send(message);
            System.out.println("Email sent"); //Allows to confirm the sending of an email.      
        }
    }

    private static Message prepareMessage(Session session, String myAccountEmail, String recepient, String mensaje) {
        try {
            Message message = new MimeMessage(session);
            message.setFrom(new InternetAddress(myAccountEmail));
            message.setRecipient(Message.RecipientType.TO, new InternetAddress(recepient));
            message.setSubject("Retrive Password"); //Sets the "Subject" of the email.
            //Sets the message of the email:
            message.setText("Your password is [" + mensaje + "]");
            return message;
            //If for any reason the previous steps end up not working, the error handling catch method is activated:
        } catch (Exception e) {
            Logger.getLogger(MailUtil.class.getName()).log(Level.SEVERE, null, e);
        }
        return null;
    }

    private static Message prepareMessageGroups(Session session, String myAccountEmail, ArrayList<String> recepients, String mensaje) {
        try {
            Message message = new MimeMessage(session);
            message.setFrom(new InternetAddress(myAccountEmail));
            //This loop allows sending emails to a group of users, by iterating through the Array List of "recepients":
            for (int i = 0; i < recepients.size(); i++) {
                message.addRecipient(Message.RecipientType.TO, new InternetAddress(recepients.get(i)));
            }
            message.setSubject("New group"); //Sets the "Subject" of the email.
            //Sets the message of the email:
            message.setText("A new group has been created including at least one of your subjects: [" + mensaje + "]");
            return message;
            //If for any reason the previous steps end up not working, the error handling catch method is activated:
        } catch (Exception e) {
            Logger.getLogger(MailUtil.class.getName()).log(Level.SEVERE, null, e);
        }
        return null;
    }

    private static Message prepareMessageTutoring1(Session session, String myAccountEmail, ArrayList<String> recepients, String mensaje) {
        try {
            Message message = new MimeMessage(session);
            message.setFrom(new InternetAddress(myAccountEmail));
            //This loop allows sending emails to a group of users, by iterating through the Array List of "recepients":
            for (int i = 0; i < recepients.size(); i++) {
                message.addRecipient(Message.RecipientType.TO, new InternetAddress(recepients.get(i)));
            }
            message.setSubject("New Tutoring Demand"); //Sets the "Subject" of the email.
            //Sets the message of the email:
            message.setText("A new demand for help has been created including at least one of your subjects. Message from user: [" + mensaje + "]");
            return message;
            //If for any reason the previous steps end up not working, the error handling catch method is activated:
        } catch (Exception e) {
            Logger.getLogger(MailUtil.class.getName()).log(Level.SEVERE, null, e);
        }
        return null;
    }

    private static Message prepareMessageTutoring2(Session session, String myAccountEmail, ArrayList<String> recepients, String mensaje, String emitentUserName, String recipientUserName) {
        try {

            Message message = new MimeMessage(session);
            message.setFrom(new InternetAddress(myAccountEmail));
            //This loop allows sending emails to a group of users, by iterating through the Array List of "recepients":
            for (int i = 0; i < recepients.size(); i++) {
                message.addRecipient(Message.RecipientType.TO, new InternetAddress(recepients.get(i)));
            }
            message.setSubject("Help Recieved!"); //Sets the "Subject" of the email.
            //Sets the message of the email:
            message.setText("" + emitentUserName + " has offered his help! this is a message from the emitent: [" + mensaje + "]");
            return message;
            //If for any reason the previous steps end up not working, the error handling catch method is activated:
        } catch (Exception e) {
            Logger.getLogger(MailUtil.class.getName()).log(Level.SEVERE, null, e);
        }
        return null;
    }

    private static Message prepareMessage2(Session session, String myAccountEmail, String recepient, String mensaje) {
        try {
            Message message = new MimeMessage(session);
            message.setFrom(new InternetAddress(myAccountEmail));
            message.setRecipient(Message.RecipientType.TO, new InternetAddress(recepient));
            message.setSubject("New Password"); //Sets the "Subject" of the email.
            //Sets the message of the email:
            message.setText("Your new password is [" + mensaje + "]");
            return message;
            //If for any reason the previous steps end up not working, the error handling catch method is activated:
        } catch (Exception e) {
            Logger.getLogger(MailUtil.class.getName()).log(Level.SEVERE, null, e);
        }
        return null;
    }

    private static Message prepareMessage3(Session session, String myAccountEmail, String recepient, String mensaje) {
        try {
            Message message = new MimeMessage(session);
            message.setFrom(new InternetAddress(myAccountEmail));
            message.setRecipient(Message.RecipientType.TO, new InternetAddress(recepient));
            message.setSubject("New UserName"); //Sets the "Subject" of the email.
            //Sets the message of the email:
            message.setText("Your new UserName is [" + mensaje + "]");
            return message;
            //If for any reason the previous steps end up not working, the error handling catch method is activated:
        } catch (Exception e) {
            Logger.getLogger(MailUtil.class.getName()).log(Level.SEVERE, null, e);
        }
        return null;
    }

    private static Message prepareMessage4(Session session, String myAccountEmail, String recepient, String mensaje) {
        try {
            Message message = new MimeMessage(session);
            message.setFrom(new InternetAddress(myAccountEmail));
            message.setRecipient(Message.RecipientType.TO, new InternetAddress(recepient));
            message.setSubject("New Email"); //Sets the "Subject" of the email.
            //Sets the message of the email:
            message.setText("Your new  registered Email is [" + mensaje + "]");
            return message;
            //If for any reason the previous steps end up not working, the error handling catch method is activated:
        } catch (Exception e) {
            Logger.getLogger(MailUtil.class.getName()).log(Level.SEVERE, null, e);
        }
        return null;
    }

}
