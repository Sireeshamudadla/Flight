package com.org.cts.controller;

import com.org.cts.model.Flight;
import com.org.cts.service.FlightService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/api")
public class Controller {
    @Autowired
    FlightService flightService;
    //CRUD//
    @PostMapping("/create")
    public void createFlight(@RequestBody Flight flight){
        flightService.createFlight(flight);
    }
    @GetMapping("/getAll")
    public List<Flight> getAll(){
        List<Flight> ff=   flightService.getAll();
       return ff;
    }
   @PutMapping("/update")
   public void updateFlight(@RequestBody Flight flight){
       flightService.updateFlight(flight);
   }
   @DeleteMapping("/deleteByName/{name}")
    public String deleteById(@PathVariable String name){
       String ss=  flightService.deleteByName(name);
       return ss;
   }
    @PostMapping("/createAll")
    public void createFlightAll(@RequestBody List<Flight> flight){
        flightService.createFlightAll(flight);
    }
    @DeleteMapping("/deleteBySource/{source}")
    public String deleteBySource(@PathVariable String source) {
        String zz=   flightService.deleteBySource(source);
        return zz;
    }
    @GetMapping("/getById/{id}")
    public Optional<Flight> getById(@PathVariable Integer id){
        Optional<Flight> ll= flightService.getById(id);
        return ll;

    }
}
