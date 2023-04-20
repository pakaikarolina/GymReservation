package com.karolinapakai.gymreservation;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
@EnableAutoConfiguration
public class GymReservationApplication {

	public static void main(String[] args) {
		SpringApplication.run(GymReservationApplication.class, args);
	}

}
