package com.dmdev.jdbc.starter.entity;

import java.time.LocalDateTime;

public record Flight(Long id,
                     String flight_no,
                     LocalDateTime departure_date,
                     String departure_airport_code,
                     LocalDateTime arrival_date,
                     String arrival_airport_code,
                     Integer aircraft_id,
                     String status) {


}
