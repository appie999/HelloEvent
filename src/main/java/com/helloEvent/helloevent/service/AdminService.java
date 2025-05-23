package com.helloEvent.helloevent.service;

import com.helloEvent.helloevent.dto.AdminDto;
import com.helloEvent.helloevent.dto.ClientDto;
import com.helloEvent.helloevent.entity.Admin;
import com.helloEvent.helloevent.entity.Client;
import com.helloEvent.helloevent.entity.Event;
import com.helloEvent.helloevent.repository.AdminRepo;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@AllArgsConstructor
public class AdminService {



    private final AdminRepo adminRepo;

    private Admin toEntity (AdminDto dto){
        Admin admin = new Admin();
        admin.setEmail(dto.getEmail());
        admin.setUserName(dto.getUserName());
        admin.setPassWord(dto.getPassWord());
        admin.setRole(dto.getRole());
        return admin ;
    }

    private AdminDto toDto (Admin entity){
        AdminDto adminDto = new AdminDto();
        adminDto.setEmail(entity.getEmail());
        adminDto.setUserName(entity.getUserName());
        adminDto.setPassWord(entity.getPassWord());
        adminDto.setRole(entity.getRole());

        return adminDto;
    }


//    public AdminDto createEvent (Event event){
//
//    }

}
