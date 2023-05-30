package com.karolinapakai.gymreservation.domain.coach.service;

import com.karolinapakai.gymreservation.domain.coach.dto.CoachDTO;
import com.karolinapakai.gymreservation.domain.coach.entity.Coach;
import com.karolinapakai.gymreservation.domain.coach.repository.CoachRepository;
import com.karolinapakai.gymreservation.domain.coach.repository.SportRepository;
import com.karolinapakai.gymreservation.domain.sport.service.SportService;
import com.karolinapakai.gymreservation.entity.Sport;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.stream.Collectors;


@Service
public class CoachServiceImpl implements CoachService {

    @Autowired
    SportService sportService;

    Logger log = LoggerFactory.getLogger(CoachServiceImpl.class);

    @Autowired
    CoachRepository coachRepository;

    @Autowired
    SportRepository sportRepository;

    @Override
    public Coach addCoach(CoachDTO coachDto) {

        List<Sport> sports = coachDto.getSportIDs()
                .stream()
                .map(id -> sportRepository.getReferenceById(id))
                .collect(Collectors.toList());

        Coach coach = Coach.builder()
                .name(coachDto.getName())
                .sports(sports)
                .build();
        return coachRepository.save(coach);

    }
}
