package com.helloEvent.helloevent.entity;

import jakarta.persistence.*;
import lombok.*;

import java.time.LocalDate;
import java.util.List;

@Entity

public class Event {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
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
    private Admin admin;


    public Event(Long id, String title, String description, LocalDate date, String location, String category, String price, List<Booking> bookings, Admin admin) {
        this.id = id;
        this.title = title;
        this.description = description;
        this.date = date;
        this.location = location;
        this.category = category;
        this.price = price;
        this.bookings = bookings;
        this.admin = admin;
    }

    public Event() {
    }

    public Long getId() {
        return id;
    }

    public String getTitle() {
        return title;
    }

    public String getDescription() {
        return description;
    }

    public LocalDate getDate() {
        return date;
    }

    public String getLocation() {
        return location;
    }

    public String getCategory() {
        return category;
    }

    public String getPrice() {
        return price;
    }

    public List<Booking> getBookings() {
        return bookings;
    }

    public Admin getAdmin() {
        return admin;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public void setDate(LocalDate date) {
        this.date = date;
    }

    public void setLocation(String location) {
        this.location = location;
    }

    public void setCategory(String category) {
        this.category = category;
    }

    public void setPrice(String price) {
        this.price = price;
    }

    public void setBookings(List<Booking> bookings) {
        this.bookings = bookings;
    }

    public void setAdmin(Admin admin) {
        this.admin = admin;
    }


}
