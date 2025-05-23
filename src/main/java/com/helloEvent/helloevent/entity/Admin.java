package com.helloEvent.helloevent.entity;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.util.List;


@Entity

public class Admin extends User {

    @OneToMany(mappedBy = "admin")
    private List<Event> events;
}
