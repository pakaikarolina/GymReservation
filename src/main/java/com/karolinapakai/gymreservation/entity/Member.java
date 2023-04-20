package com.karolinapakai.gymreservation.entity;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity(name = "Member")
@Table
public class Member {

    @Id
    private Long id;
    @Column
    private String name;
    @Column
    private Boolean isMembershipValid;
    @Column
    private Integer pass;
}
