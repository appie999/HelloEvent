package com.helloEvent.helloevent.entity;

import com.helloEvent.helloevent.enums.Role;
import jakarta.persistence.Entity;
import jakarta.persistence.OneToMany;
import lombok.*;
import org.springframework.security.core.GrantedAuthority;

import java.util.Collection;
import java.util.List;

@Entity


public class Client extends User{



    @OneToMany(mappedBy ="client" )
    private List<Booking> bookings;

    public Client() {
    }

    public Client(Long id, String userName, String passWord, String email, Role role, List<Booking> bookings) {
        super(id, userName, passWord, email, role);
        this.bookings = bookings;
    }

    public Client(List<Booking> bookings) {
        this.bookings = bookings;
    }

    @Override
    public Collection<? extends GrantedAuthority> getAuthorities() {
        return List.of();
    }

    @Override
    public String getPassword() {
        return "";
    }

    @Override
    public String getUsername() {
        return "";
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
