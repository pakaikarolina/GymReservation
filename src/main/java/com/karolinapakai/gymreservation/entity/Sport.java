package com.karolinapakai.gymreservation.entity;

import jakarta.persistence.*;

@Entity
@Inheritance(strategy = InheritanceType.TABLE_PER_CLASS)
public abstract class Sport {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;
}
