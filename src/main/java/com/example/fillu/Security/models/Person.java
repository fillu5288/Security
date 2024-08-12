package com.example.fillu.Security.models;

import lombok.*;

import javax.persistence.*;
import javax.validation.constraints.Min;
import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.Size;
import java.time.LocalDateTime;

@Getter
@Setter
@Entity
@NoArgsConstructor
@AllArgsConstructor
@ToString
@Table(name = "Person")
public class Person {
    @Id
    @Column(name = "id")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;

    @NotEmpty(message = "Naim is not empty")
    @Size(min = 2, max = 100, message = "Name ot 2 do 100")
    @Column(name = "username")
    private String username;

    @Min(value = 1900, message = "Year is dolzno bolshe 1900")
    @Column(name = "year_Of_Birth")
    private int yearOfBirth;

    @Column(name = "password")
    private String password;

    @Column(name = "role")
    private String role;
}
