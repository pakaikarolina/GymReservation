package com.karolinapakai.gymreservation.entity;

import jakarta.persistence.*;

import java.util.List;

@Entity(name = "Room")
@Table
public class Room {

    @Id
    private Long id;

    @Column
    private String location;

    @Column
    private Integer capacity;

    @Enumerated(value = EnumType.STRING)
    @ElementCollection(targetClass = Tool.class)
    private List<Tool> tools;
}
