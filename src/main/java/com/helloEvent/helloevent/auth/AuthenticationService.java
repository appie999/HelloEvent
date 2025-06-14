package com.helloEvent.helloevent.auth;


import com.helloEvent.helloevent.entity.Admin;
import com.helloEvent.helloevent.enums.Role;
import com.helloEvent.helloevent.repository.UserRepo;
import com.helloEvent.helloevent.service.JwtService;
import lombok.RequiredArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.authentication.AuthenticationManager;
import org.springframework.security.authentication.UsernamePasswordAuthenticationToken;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class AuthenticationService {



    @Autowired
    private final UserRepo Repository;

    @Autowired
    private final PasswordEncoder passwordEncoder;

    @Autowired
    private final JwtService jwtService;

    @Autowired
    private final AuthenticationManager authenticationManager;


    public AuthenticationResponse register(RegisterRequest request) {
        Admin user = new Admin();
        user.setUserName( request.getUsername());
         user.setEmail(request.getEmail());
         user.setPassWord(passwordEncoder.encode(request.getPassword()));
         user.setRole(Role.ADMIN);

        Repository.save(user);

        var jwtToken = jwtService.generateToken(user);
        return AuthenticationResponse.builder()
                .token(jwtToken)
                .build();
    }

    public AuthenticationResponse authenticate(AuthenticationRequest request) {

        authenticationManager.authenticate(
                new UsernamePasswordAuthenticationToken(
                        request.getUserName()
                        ,request.getPassWord()
                )
        );

        var user = Repository.findByUsername(request.getUserName())
                .orElseThrow();

        var jwtToken = jwtService.generateToken(user);
        return AuthenticationResponse.builder()
                .token(jwtToken)
                .build();
    }
}
