package com.karolinapakai.gymreservation.entity;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.experimental.SuperBuilder;

@Entity
@Inheritance(strategy = InheritanceType.SINGLE_TABLE)
@DiscriminatorColumn
@Getter
@Setter
@SuperBuilder(toBuilder = true)
@NoArgsConstructor
public class Sport {

    @Id
    Long id;

    String name;

    String description;

    int duration;

}
