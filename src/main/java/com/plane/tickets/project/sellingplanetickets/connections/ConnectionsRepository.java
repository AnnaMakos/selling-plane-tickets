package com.plane.tickets.project.sellingplanetickets.connections;

import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface ConnectionsRepository extends JpaRepository<Connections, Integer> {

    List<Connections> findByArrivalAirportAirportID(int id);
    List<Connections> findByDepartureAirportAirportID(int id);
}
