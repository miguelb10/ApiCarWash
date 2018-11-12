package com.upc.repository;

import org.springframework.data.repository.CrudRepository;

import com.upc.model.Reserva;

public interface IReservaDao extends CrudRepository<Reserva, Integer>{
	Reserva findById(int id); 
}
