package com.karolinapakai.gymreservation.entity;


import jakarta.persistence.*;

import java.util.List;

@Entity(name = "Gym")
@Table
public class Gym {

    @Id
    private Long id;

    @OneToMany()
    private List<Room> rooms;

    @OneToMany
    private List<Coach> coaches;

    @OneToMany
    private List<Member> members;
}
