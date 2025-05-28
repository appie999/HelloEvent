package com.helloEvent.helloevent.controller;

import com.helloEvent.helloevent.dto.ClientDto;
import com.helloEvent.helloevent.service.ClientService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;


@RestController
@RequestMapping("/client")
public class ClientController {


    @Autowired
    private ClientService clientService;


    @GetMapping("/{email}")
    public ClientDto getCleintByEmail(@PathVariable String email){
        return clientService.getClientByEmail(email);
    }





    @GetMapping("/{username}")
    public ClientDto getClientByUserName (@PathVariable String username){
        return clientService.getClientByUserName(username);
    }

    @GetMapping("/")
    public Long getAllClientByRole (@RequestParam String role){
        return clientService.getAllClientByRole(role);
    }
}
