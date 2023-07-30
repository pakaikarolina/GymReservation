package com.karolinapakai.gymreservation.domain.member.repository;

import com.karolinapakai.gymreservation.domain.member.entity.Member;
import org.springframework.data.jpa.repository.JpaRepository;

public interface MemberRepository extends JpaRepository<Member, Long> {
}
