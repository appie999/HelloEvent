package com.helloEvent.helloevent.service;


import com.helloEvent.helloevent.Mapper.ClientMapper;
import com.helloEvent.helloevent.dto.ClientDto;
import com.helloEvent.helloevent.entity.Client;
import com.helloEvent.helloevent.repository.ClientRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ClientService {


    private final ClientRepo clientRepo;

    @Autowired
    private ClientMapper clientMapper;


    public ClientService(ClientRepo clientRepo) {
        this.clientRepo = clientRepo;
    }

    public ClientDto getClientByEmail(String email){
       return ClientMapper.toDTO(clientRepo.getClientByEmail(email));
    }




    public ClientDto getClientByUserName(String userName){
        return ClientMapper.toDTO(clientRepo.getClientByUserName(userName));
    }

    public Long getAllClientByRole (String role){
        return clientRepo.getAllClientByRole(role);
    }


}
