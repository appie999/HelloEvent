package com.helloEvent.helloevent.repository;

import com.helloEvent.helloevent.entity.Client;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import java.util.List;

public interface ClientRepo extends JpaRepository<Client,Long> {

    Client getClientByEmail(String email);



    // get client by username
    Client getClientByUserName (String username);



    // count client by role "client"
    @Query(value = "SELECT COUNT(*) FROM client WHERE role = 'client'", nativeQuery = true)
   Long getAllClientByRole(String role);




}
