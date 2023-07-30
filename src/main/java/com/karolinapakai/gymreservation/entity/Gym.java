package com.karolinapakai.gymreservation.entity;


import com.karolinapakai.gymreservation.domain.coach.entity.Coach;
import com.karolinapakai.gymreservation.domain.member.entity.Member;
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
