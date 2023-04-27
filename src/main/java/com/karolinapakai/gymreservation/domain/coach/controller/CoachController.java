package com.karolinapakai.gymreservation.domain.coach.controller;

import com.karolinapakai.gymreservation.domain.coach.dto.CoachDTO;
import com.karolinapakai.gymreservation.domain.coach.service.CoachService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/coach")
public class CoachController {

    @Autowired
    CoachService coachService;

    @PostMapping()
    public ResponseEntity<HttpStatus> addCoach(@RequestBody CoachDTO coach) {
        coachService.addCoach(coach);
        return ResponseEntity.ok(HttpStatus.OK);
    }
}
