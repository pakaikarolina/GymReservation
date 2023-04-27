package com.karolinapakai.gymreservation.domain.coach.entity;

import jakarta.persistence.*;

import java.util.List;

@Entity(name = "Coach")
@Table
public class Coach {

    @Id
    private Long id;

    @Column
    private String name;

    @OneToMany
    private List<Sport> sports;

}
