package com.helloEvent.helloevent.dto;


import com.helloEvent.helloevent.enums.Role;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class AdminDto{
    private Long id;
    private String userName;
    private String passWord;
    private String email;

    private Role role;

}
