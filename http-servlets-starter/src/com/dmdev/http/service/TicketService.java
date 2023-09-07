package com.dmdev.http.service;

import com.dmdev.http.dao.TicketDao;
import com.dmdev.http.dto.TicketDto;

import java.util.List;

import static java.util.stream.Collectors.*;

public class TicketService {

    private static final TicketService INSTANCE = new TicketService();

    private final TicketDao ticketDao = TicketDao.getInstance();

    public static TicketService getInstance() {
        return INSTANCE;
    }

    public List<TicketDto> findAllByFlightId(Long flightId) {
        return ticketDao.findAllByFlightId(flightId).stream()
                .map(ticket -> TicketDto.builder()
                        .id(ticket.getId())
                        .flightId(ticket.getFlight_id())
                        .seatNo(ticket.getSeat_no())
                        .build()
                )
                .collect(toList());
    }

    private TicketService() {
    }
}
