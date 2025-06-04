package com.helloEvent.helloevent.entity;

import com.helloEvent.helloevent.enums.Role;
import jakarta.persistence.*;
import lombok.*;
import org.springframework.security.core.GrantedAuthority;
import org.springframework.security.core.authority.SimpleGrantedAuthority;

import java.util.Collection;
import java.util.List;


@Entity
@Builder

public class Admin extends User {

    @OneToMany(mappedBy = "admin")
    private List<Event> events;


    public Admin(Long id, String userName, String passWord, String email, Role role, List<Event> events) {
        super(id, userName, passWord, email, role);
        this.events = events;
    }

    public Admin() {

    }

    public Admin(List<Event> events) {
        this.events = events;
    }

    @Override
    public Collection<? extends GrantedAuthority> getAuthorities() {
        return List.of(new SimpleGrantedAuthority(getRole().name()));
    }

    @Override
    public String getPassword() {
        return getPassWord();
    }

    @Override
    public String getUsername() {
        return getUserName();
    }

    @Override
    public boolean isAccountNonExpired() {
        return super.isAccountNonExpired();
    }

    @Override
    public boolean isAccountNonLocked() {
        return super.isAccountNonLocked();
    }

    @Override
    public boolean isCredentialsNonExpired() {
        return super.isCredentialsNonExpired();
    }

    @Override
    public boolean isEnabled() {
        return super.isEnabled();
    }
}
