package com.example.Servizi.Email1.entities;

import lombok.Data;

@Data
public class NotificationDTO {

    private String contactId;
    private String title;
    private String text;
}