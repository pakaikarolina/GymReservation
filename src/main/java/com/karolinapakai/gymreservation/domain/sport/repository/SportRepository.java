package com.karolinapakai.gymreservation.domain.sport.repository;

import com.karolinapakai.gymreservation.domain.sport.entity.Sport;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface SportRepository extends JpaRepository<Sport, Long> {
}
