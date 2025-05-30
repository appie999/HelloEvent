package com.helloEvent.helloevent.config;


import com.helloEvent.helloevent.repository.UserRepo;
import lombok.RequiredArgsConstructor;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;

@Configuration
@RequiredArgsConstructor

public class AppConfig {

    private final UserRepo userRepo;

    @Bean
    public UserDetailsService userDetailsService (){

        return  username -> userRepo.findByUsername(username)
                .orElseThrow(()-> new  UsernameNotFoundException("User not found"));
    }
}
