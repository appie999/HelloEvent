package com.helloEvent.helloevent.service;

import com.helloEvent.helloevent.Mapper.ClientMapper;
import com.helloEvent.helloevent.dto.ClientDto;
import com.helloEvent.helloevent.entity.Client;
import com.helloEvent.helloevent.repository.AdminRepo;
import com.helloEvent.helloevent.repository.ClientRepo;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class AdminService {


private final ClientMapper clientMapper;
private final ClientRepo clientRepo;

    public AdminService(ClientMapper clientMapper, ClientRepo clientRepo) {
        this.clientMapper = clientMapper;
        this.clientRepo = clientRepo;
    }

    public ClientDto saveClient(ClientDto clientDto){
        return ClientMapper.toDTO(clientRepo.save(ClientMapper.toEntity(clientDto)));
    }

    public List<ClientDto> getAllClient(){
        return clientRepo.findAll().stream().map(client -> ClientMapper.toDTO(client)).toList();
    }

    public ClientDto modifierClient(Long id, ClientDto clientDto){
        Client client = clientRepo.findById(id).orElseThrow(()->new RuntimeException("client not found with id "+id));
        client.setEmail(clientDto.getEmail());
        client.setPassWord(clientDto.getPassWord());
        client.setRole(clientDto.getRole());

        return ClientMapper.toDTO(clientRepo.save(client));
    }

    public void deleteClient(Long id){
        clientRepo.deleteById(id);
    }
}
