package CLASES;
import java.io.ByteArrayOutputStream;

import java.util.Date;
import javax.mail.Message;
import javax.mail.Session;
import java.util.Properties;
import javax.activation.DataHandler;
import javax.activation.FileDataSource;
import javax.mail.*;
import javax.swing.JOptionPane;
import javax.mail.internet.MimeMessage;
import javax.mail.internet.MimeBodyPart;
import javax.mail.internet.MimeMultipart;
import javax.mail.internet.InternetAddress;
import javax.mail.internet.AddressException;


public class JCMail {

    private String from = "";//tu_correo@gmail.com
    private String password = "";//tu password: 123456 :)
    // destinatario1@hotmail.com,destinatario2@hotmail.com, destinatario_n@hotmail.com
    private InternetAddress[] addressTo;
    private String Subject = "";//titulo del mensaje
    private String MessageMail = "";//contenido del mensaje

    public JCMail(){}

    public void SEND()
    {
        try {
            Properties props = new Properties();
            props.put("mail.smtp.ssl.trust","smtp.gmail.com");
            props.put("mail.smtp.ssl.enable","true"); 
            props.put("mail.smtp.host", "smtp.gmail.com");
            props.put("mail.smtp.starttls.enable","true");                
            props.put("mail.smtp.auth","true");
            props.put("mail.smtp.user","usuario");
            props.put("mail.smtp.port","465");            
            //
            SMTPAuthenticator auth = new SMTPAuthenticator(getFrom(), getPassword() );
            Session session = Session.getDefaultInstance(props,auth);
            session.setDebug(true);
            //Se crea destino y origen del mensaje
            MimeMessage mimemessage = new MimeMessage(session);
            InternetAddress addressFrom = new InternetAddress( getFrom() );
            mimemessage.setFrom(addressFrom);
            mimemessage.setRecipients(Message.RecipientType.TO,addressTo);
            mimemessage.setSubject(getSubject());
            // Se crea el contenido del mensaje
            MimeBodyPart mimebodypart = new MimeBodyPart();
            
//            MimeBodyPart texto=new MimeBodyPart();
//            texto.setText("2222");
            String ubicacion=System.getProperty("user.dir")+"\\Vacunaciones y Desparasitacion Pendientes.txt";
            FileDataSource fdatasource = new FileDataSource(ubicacion);
            mimebodypart.setDataHandler(new DataHandler(fdatasource));
//            mimebodypart.setDataHandler(new DataHandler(new FileDataSource(path)));
//            mimebodypart.setContent(getMessage(),"text/html");
            mimebodypart.setFileName(ubicacion);
            
            Multipart multipart = new MimeMultipart(); 
            multipart.addBodyPart(mimebodypart);
//            multipart.addBodyPart(texto); 
             
            
            mimemessage.setContent(multipart);             
//            mimemessage.setSentDate(new Date());
            
            Transport.send(mimemessage);
       
            System.out.println("El Correo fue enviado Exitosamente!!");
        } catch (MessagingException ex) {
            System.out.println(ex.getMessage());
        }

    }
    //remitente
    public void setFrom(String mail){ this.from = mail; }
    public String getFrom(){ return this.from; }
    //Contraseña
    public void setPassword(char[] value){
        this.password = new String(value);
    }
    public String getPassword(){ return this.password; }
    //destinatarios
    public void setTo(String mails){
        String[] tmp =mails.split(",");
        addressTo = new InternetAddress[tmp.length];
        for (int i = 0; i < tmp.length; i++) {
            try {
                addressTo[i] = new InternetAddress(tmp[i]);
            } catch (AddressException ex) {
                System.out.println(ex);
            }
        }
    }
    public InternetAddress[] getTo(){ return this.addressTo; }
    //titulo correo
    public void setSubject(String value){ this.Subject = value; }
    public String getSubject(){ return this.Subject; }
    //contenido del mensaje
    public void setMessage(String value){ this.MessageMail = value; }
    public String getMessage(){ return this.MessageMail; }

}
