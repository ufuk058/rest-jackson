package com.restJackson.dto;

import com.fasterxml.jackson.annotation.JsonBackReference;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonInclude;
import jakarta.persistence.Column;
import jakarta.persistence.OneToOne;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
@JsonIgnoreProperties(value={"city","state","age"}) //hide provided properties by the class level
@JsonInclude(JsonInclude.Include.NON_NULL)
public class AccountDTO {

    private String name;
    private String address;
    private String country;
    private String state;
    @JsonIgnore //this field will be hold up for serialization and de-serialization does no shown in the api call
    private String city;
    private int age;
    private String postCode;

    @JsonBackReference//this field is not going to be serialised
    private UserDTO user;
}
