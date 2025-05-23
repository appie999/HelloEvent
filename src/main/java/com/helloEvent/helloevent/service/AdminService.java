package com.helloEvent.helloevent.service;

import com.helloEvent.helloevent.Mapper.AdminMapper;
import com.helloEvent.helloevent.dto.AdminDto;
import com.helloEvent.helloevent.dto.ClientDto;
import com.helloEvent.helloevent.entity.Admin;
import com.helloEvent.helloevent.entity.Client;
import com.helloEvent.helloevent.entity.Event;
import com.helloEvent.helloevent.repository.AdminRepo;
import lombok.AllArgsConstructor;
import org.mapstruct.Mapper;
import org.springframework.stereotype.Service;

@Service

public class AdminService {


    private final AdminMapper adminMapper;
    private final AdminRepo adminRepo;

    public AdminService(AdminMapper adminMapper, AdminRepo adminRepo) {
        this.adminMapper = adminMapper;
        this.adminRepo = adminRepo;
    }




//    public AdminDto createEvent (Event event){
//        return AdminMapper(adminRepo.save(event));
//    }

}
