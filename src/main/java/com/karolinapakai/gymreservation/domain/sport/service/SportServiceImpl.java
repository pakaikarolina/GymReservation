package com.karolinapakai.gymreservation.domain.sport.service;

import com.karolinapakai.gymreservation.domain.sport.dto.SportDTO;
import com.karolinapakai.gymreservation.domain.sport.entity.Sport;
import org.springframework.stereotype.Service;

@Service
public class SportServiceImpl implements SportService {

    @Override
    public Sport convertDtoToEntity(SportDTO dto) {
        return null;
    }

    @Override
    public SportDTO convertEntityToDto(Sport sport) {
        return SportDTO.builder()
                .build();
    }
}
