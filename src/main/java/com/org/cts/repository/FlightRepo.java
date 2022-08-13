package com.org.cts.repository;

import com.org.cts.model.Flight;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import javax.transaction.Transactional;
@Repository
public interface FlightRepo extends JpaRepository<Flight,Integer> {

    @Transactional
    String deleteByName( String name);
    @Transactional
    String deleteBySource(String source);
}
