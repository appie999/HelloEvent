package com.helloEvent.helloevent.auth;

import lombok.Getter;
import lombok.Setter;

@Setter
@Getter
public class AuthenticationRequest {
    private String userName;
    private String passWord;

    public AuthenticationRequest(){}
    public AuthenticationRequest(String userName,String passWord){
        this.userName = userName;
        this.passWord = passWord;
    }

}
