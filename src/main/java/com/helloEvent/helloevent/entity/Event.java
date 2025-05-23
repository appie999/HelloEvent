package com.helloEvent.helloevent.entity;

import jakarta.persistence.*;
import lombok.*;

import java.time.LocalDate;
import java.util.List;

@Entity
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class Event {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(nullable = false)
    private Long id;
    private String title;
    private String description;
    private LocalDate date;
    private String location;
    private String category;
    private String price;

    @OneToMany(mappedBy = "event", orphanRemoval = true)
    private List<Booking> bookings;

    @ManyToOne
    private Event event;
}
