package com.karolinapakai.gymreservation.entity;

import jakarta.persistence.DiscriminatorValue;
import jakarta.persistence.Entity;
import jakarta.persistence.Table;
import lombok.Setter;
import lombok.experimental.SuperBuilder;

@Entity
@DiscriminatorValue("Spinning")
@Table
@Setter
@SuperBuilder(toBuilder = true)
public class Spinning extends Sport{

}