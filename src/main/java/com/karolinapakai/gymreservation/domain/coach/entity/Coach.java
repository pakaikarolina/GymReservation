package com.karolinapakai.gymreservation.domain.coach.entity;

import com.karolinapakai.gymreservation.entity.Sport;
import jakarta.persistence.*;
import lombok.Builder;

import java.util.List;

@Entity(name = "Coach")
@Table
public class Coach {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;

    @Column
    private String name;

    @OneToMany(cascade = CascadeType.ALL)
    private List<Sport> sports;

}
