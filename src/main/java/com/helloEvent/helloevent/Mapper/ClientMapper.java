package com.helloEvent.helloevent.Mapper;


import com.helloEvent.helloevent.dto.ClientDto;
import com.helloEvent.helloevent.entity.Client;
import org.springframework.stereotype.Component;

@Component
public class ClientMapper {

    public static ClientDto toDTO(Client client) {
        if(client == null) return null;
        ClientDto clientDto = new ClientDto();
        clientDto.setEmail(client.getEmail());
        clientDto.setUserName(client.getUserName());
        clientDto.setPassWord(client.getPassWord());
        clientDto.setRole(client.getRole());
        return clientDto;
    }


    public static Client toEntity(ClientDto dto) {
        if (dto == null) return null;

        Client client = new Client();
        client.setEmail(dto.getEmail());
        client.setUserName(dto.getUserName());
        client.setPassWord(dto.getPassWord());
        client.setRole(dto.getRole());
        return client;
    }
}
