package com.restJackson.entity;

import com.restJackson.enums.UserRole;
import jakarta.persistence.*;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Data
@NoArgsConstructor
@Table(name="user_account")
public class User extends BaseEntity {

    private String email;
    private String password;
    private String username;

    @Enumerated(EnumType.STRING)
    private UserRole role=UserRole.USER;

    @OneToOne(fetch = FetchType.LAZY)
    @JoinColumn(name="account_details_id")
    private Account account;
}
