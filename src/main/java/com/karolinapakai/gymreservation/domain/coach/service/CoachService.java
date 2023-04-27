package com.karolinapakai.gymreservation.domain.coach.service;

import com.karolinapakai.gymreservation.domain.coach.dto.CoachDTO;
import com.karolinapakai.gymreservation.domain.coach.entity.Coach;

public interface CoachService {


    Coach addCoach(CoachDTO coach);
}
