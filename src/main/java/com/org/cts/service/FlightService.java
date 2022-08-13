package com.org.cts.service;

import com.org.cts.model.Flight;

import java.util.List;
import java.util.Optional;

public interface FlightService {
    public void createFlight(Flight flight);
    public List<Flight> getAll();
    public void updateFlight( Flight flight);
    public String deleteByName( String name);
    public void createFlightAll( List<Flight> flight);
    public String deleteBySource( String source);
    public Optional<Flight> getById(Integer id);
}
