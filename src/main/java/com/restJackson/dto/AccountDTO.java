package com.restJackson.dto;

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
    @Column(name="postCode")
    private String postalCode;
    @OneToOne(mappedBy = "account")
    private UserDTO user;
}
