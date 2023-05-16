package com.karolinapakai.gymreservation.entity;

import jakarta.persistence.DiscriminatorValue;
import jakarta.persistence.Entity;
import jakarta.persistence.Table;
import lombok.experimental.SuperBuilder;

@Entity
@DiscriminatorValue("Yoga")
@Table
@SuperBuilder(toBuilder = true)
public class Yoga extends Sport {

}
