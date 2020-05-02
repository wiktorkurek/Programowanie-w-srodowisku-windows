/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package login_register;

/**
 *
 * @author Patryk
 */
import javax.mail.*;
import javax.mail.internet.InternetAddress;
import javax.mail.internet.MimeMessage;
import java.util.Properties;
import java.util.logging.Level;
import java.util.logging.Logger;



public class EmailClass {

    public static void sendMail(String recepient) throws Exception{
        Properties properties = new Properties();

        properties.put("mail.smtp.starttls.enable", "true");
        properties.put("mail.smtp.starttls.enable", "true");
        properties.put("mail.smtp.host", "smtp.gmail.com");
        properties.put("mail.smtp.port", "587");

        String myAccountEmail = "utpmailtest@gmail.com";
        String password = "utpmailtest12";

        Session session = Session.getInstance(properties, new Authenticator() {
            @Override
            protected PasswordAuthentication getPasswordAuthentication(){
                return new PasswordAuthentication(myAccountEmail, password);
            }
        });

        Message message = prepareMessage(session,myAccountEmail, password);

        Transport.send(message);
        System.out.println("messege sent successful");

    }

    private static Message prepareMessage(Session session,String myAccountEmail,String recepient){
        try{
            Message message = new MimeMessage(session);
            message.setFrom(new InternetAddress(myAccountEmail));
            message.setRecipient(Message.RecipientType.TO, new InternetAddress(recepient));
            message.setSubject("Resjestracaj pomyslana");
            message.setText("Witaj zarejestrowales sie");
            return message;
        } catch (Exception ex){
            Logger.getLogger(Register_Pane.class.getName()).log(Level.SEVERE, null, ex);
        }
        return null;
    }

    

}
