package com.karolinapakai.gymreservation.domain.coach.entity;

import com.karolinapakai.gymreservation.entity.Sport;
import jakarta.persistence.*;
import lombok.Builder;

import java.util.List;

@Entity(name = "Coach")
@Table
@Builder
public class Coach {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;

    @Column
    private String name;

    @ManyToMany(cascade = CascadeType.ALL)
    private List<Sport> sports;

}
