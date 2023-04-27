package com.karolinapakai.gymreservation.domain.coach.dto;

import com.karolinapakai.gymreservation.domain.sport.dto.SportDTO;
import lombok.Getter;

import java.util.List;

@Getter
public class CoachDTO {

    String name;
    List<SportDTO> sports;

}
