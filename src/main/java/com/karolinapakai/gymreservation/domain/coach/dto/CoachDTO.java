package com.karolinapakai.gymreservation.domain.coach.dto;

import lombok.Getter;

import java.util.List;

@Getter
public class CoachDTO {

    String name;
    List<Long> sportIDs;

}
