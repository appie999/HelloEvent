package com.helloEvent.helloevent.entity;


import com.helloEvent.helloevent.enums.Role;
import jakarta.persistence.*;
import lombok.*;
import org.springframework.security.core.userdetails.UserDetails;


@Setter
@Getter
@Entity
@Builder
@Inheritance(strategy = InheritanceType.JOINED)

public abstract class  User implements UserDetails {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String userName;
    private String passWord;
    private String email;

    @Enumerated(EnumType.STRING)
    private Role role;


    public User(Long id, String userName, String passWord, String email, Role role) {
        this.id = id;
        this.userName = userName;
        this.passWord = passWord;
        this.email = email;
        this.role = role;
    }

    public User() {
    }

}
