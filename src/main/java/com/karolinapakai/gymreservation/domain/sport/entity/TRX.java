package com.karolinapakai.gymreservation.domain.sport.entity;

import jakarta.persistence.DiscriminatorValue;
import jakarta.persistence.Entity;
import jakarta.persistence.Table;
import lombok.experimental.SuperBuilder;

@Entity
@DiscriminatorValue("TRX")
@Table
@SuperBuilder(toBuilder = true)
public class TRX extends Sport {

}
