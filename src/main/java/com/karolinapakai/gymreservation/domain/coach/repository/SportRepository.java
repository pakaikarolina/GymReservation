package com.karolinapakai.gymreservation.domain.coach.repository;

import com.karolinapakai.gymreservation.entity.Sport;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface SportRepository extends JpaRepository<Sport, Long> {
}
