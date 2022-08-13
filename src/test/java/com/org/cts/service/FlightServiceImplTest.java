package com.org.cts.service;

import com.org.cts.model.Flight;
import com.org.cts.repository.FlightRepo;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.Mockito;
import org.springframework.boot.test.context.SpringBootTest;

import java.util.ArrayList;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

@SpringBootTest
class FlightServiceImplTest {
    @InjectMocks

  private FlightServiceImpl flightServiceImpl;

    @Mock
   private FlightRepo flightRepo;

    @Test
     public void createFlight() {
     Flight flight=new Flight();
     flight.setId(100);
     flight.setName("roja");
     flight.setSource("vizag");
     flightServiceImpl.createFlight(flight);
     Mockito.verify(flightRepo,Mockito.times(1)).save(flight);
    }
    @Test
    void getAll() {
     List<Flight> list=new ArrayList<>();
     Flight flight= new Flight();
     flight.setId(100);
     flight.setName("roja");
     flight.setSource("vizag");
     list.add(flight);
     Flight flight1= new Flight();
     flight1.setId(102);
     flight1.setName("raja");
     flight1.setSource("blr");
     list.add(flight1);
     Mockito.when(flightRepo.findAll()).thenReturn(list);
     List<Flight> list2=  flightServiceImpl.getAll();
     Assertions.assertEquals(list.size(),list2.size());


    }

    @Test
    void updateFlight() {
     Flight flight=new Flight();
     flight.setId(100);
     flight.setName("roja");
     flight.setSource("vizag");
     flightServiceImpl.updateFlight(flight);
     Mockito.verify(flightRepo,Mockito.times(1)).save(flight);
    }

    @Test
    void deleteByName() {
    }

    @Test
    void createFlightAll() {
    }

    @Test
    void deleteBySource() {
    }

    @Test
    void getById() {
    }
}