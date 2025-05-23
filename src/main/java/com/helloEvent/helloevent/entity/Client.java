package com.helloEvent.helloevent.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.OneToMany;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.util.List;

@Entity

public class Client extends User{



    @OneToMany(mappedBy ="client" )
    private List<Booking> bookings;

}
