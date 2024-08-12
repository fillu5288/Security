package com.example.fillu.Security.dto;

import lombok.Getter;
import lombok.Setter;

import javax.persistence.Column;
import javax.validation.constraints.Min;
import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.Size;
import java.time.LocalDateTime;

@Getter
@Setter
public class PersonDTO {
    @NotEmpty(message = "Naim is not empty")
    @Size(min = 2, max = 100, message = "Name ot 2 do 100")
    private String username;

    @Min(value = 1900, message = "Year is dolzno bolshe 1900")
    private int yearOfBirth;

    private String password;

    private String role;
}
