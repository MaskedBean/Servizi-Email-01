package com.example.Servizi.Email1.email;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.mail.SimpleMailMessage;
import org.springframework.mail.javamail.JavaMailSender;
import org.springframework.stereotype.Service;


@Service
public class NotificationService {

    @Autowired
    private JavaMailSender mailSender;


    public void sendTo(String email, String title, String text){
        SimpleMailMessage sms = new SimpleMailMessage();
        sms.setTo(email);
        sms.setSubject(title);
        sms.setText(text);
        mailSender.send(sms);
    }
}
