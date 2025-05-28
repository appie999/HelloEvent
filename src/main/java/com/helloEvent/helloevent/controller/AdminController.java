package com.helloEvent.helloevent.controller;

import com.helloEvent.helloevent.dto.ClientDto;
import com.helloEvent.helloevent.enums.Role;
import com.helloEvent.helloevent.repository.ClientRepo;
import com.helloEvent.helloevent.service.AdminService;
import com.helloEvent.helloevent.service.ClientService;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("client")
public class AdminController {

    private final ClientService clientService;
    private AdminService adminService;
    private Role role;

    public AdminController(ClientService clientService, AdminService adminService) {
        this.clientService = clientService;
        this.adminService = adminService;
    }

    @PostMapping("/")
    public ClientDto addClient(@RequestBody ClientDto clientDto){
        return adminService.saveClient(clientDto);
    }
    @GetMapping("/")
    public List<ClientDto> getAllClient(){
        return adminService.getAllClient();
    }

    @PutMapping("/{id}")
    public ClientDto modifierClient (@PathVariable Long id, @RequestBody ClientDto clientDto){
        return adminService.modifierClient(id , clientDto);
    }

    @DeleteMapping("/{id}")
    public void deleteClient(@PathVariable Long id){
        adminService.deleteClient(id);
    }


}
