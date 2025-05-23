package com.helloEvent.helloevent.repository;

import com.helloEvent.helloevent.entity.Admin;
import com.helloEvent.helloevent.entity.Event;
import org.springframework.data.jpa.repository.JpaRepository;

public interface AdminRepo extends JpaRepository<Admin, Long> {


}
