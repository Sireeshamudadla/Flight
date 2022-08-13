package com.org.cts.service;

import com.org.cts.model.Flight;
import com.org.cts.repository.FlightRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class FlightServiceImpl implements FlightService {
    @Autowired
    FlightRepo flightRepo;
    @Override
    public void createFlight(Flight flight) {
        flightRepo.save(flight);
    }
    @Override
    public List<Flight> getAll() {
        List<Flight> ee= flightRepo.findAll();
        return ee;
    }@Override
    public void updateFlight(Flight flight) {
        flightRepo.save(flight);
    }@Override
    public String deleteByName(String name) {
        flightRepo.deleteByName(name);
        return "deletesuccessfully";
    }@Override
    public void createFlightAll(List<Flight> flight) {
        flightRepo.saveAll(flight);
    }
    @Override
    public String deleteBySource(String source) {
        flightRepo.deleteBySource(source);
        return "deletedsuccessfully";
    }

    @Override
    public Optional<Flight> getById(Integer id) {
        Optional<Flight> kk  = flightRepo.findById(id);
        return kk;
    }
}
