package com.helloEvent.helloevent.Mapper;


import com.helloEvent.helloevent.dto.AdminDto;
import com.helloEvent.helloevent.dto.ClientDto;
import com.helloEvent.helloevent.entity.Admin;
import com.helloEvent.helloevent.entity.Client;
import com.helloEvent.helloevent.repository.ClientRepo;
import org.mapstruct.Mapper;

@Mapper(componentModel = "spring")
public interface ClientMapper {

    ClientDto toDto(Client client);
    Client toEntity(ClientDto clientDto);
}
