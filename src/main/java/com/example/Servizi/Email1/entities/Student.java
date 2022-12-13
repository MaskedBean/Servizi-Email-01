package com.example.Servizi.Email1.entities;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class Student {


    private String id;
    private String name;
    private String surname;
    private String email;

}
