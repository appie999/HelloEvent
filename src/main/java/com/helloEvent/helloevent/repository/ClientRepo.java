package com.helloEvent.helloevent.repository;

import com.helloEvent.helloevent.entity.Client;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ClientRepo extends JpaRepository<Client,Long> {

}
