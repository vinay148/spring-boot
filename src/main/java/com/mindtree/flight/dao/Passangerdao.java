package com.mindtree.flight.dao;

import org.springframework.data.jpa.repository.JpaRepository;

import com.mindtree.flight.entities.Passanger;

public interface Passangerdao extends JpaRepository<Passanger, Integer> {

}
