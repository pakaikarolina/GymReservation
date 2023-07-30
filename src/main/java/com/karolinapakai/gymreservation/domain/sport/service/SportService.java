package com.karolinapakai.gymreservation.domain.sport.service;

import com.karolinapakai.gymreservation.domain.sport.dto.SportDTO;
import com.karolinapakai.gymreservation.domain.sport.entity.Sport;

public interface SportService {


    Sport convertDtoToEntity (SportDTO dto);
    SportDTO convertEntityToDto (Sport sport);
}
