package com.restJackson.dto;

import com.fasterxml.jackson.annotation.JsonBackReference;
import jakarta.persistence.Column;
import jakarta.persistence.OneToOne;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class AccountDTO {

    private String name;
    private String address;
    private String country;
    private String state;
    private String city;
    private int age;
    private String postCode;

    @JsonBackReference//this field is not going to be serialised
    private UserDTO user;
}
