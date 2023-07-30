package com.karolinapakai.gymreservation.domain.sport.dto;

import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;

@Getter
@NoArgsConstructor
public class SportDTO {

    Long id;


    @Builder
    public SportDTO (Long id) {
        this.id = id;

    }
}
