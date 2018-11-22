package com.upc.repository;

import java.util.List;

import org.springframework.data.repository.CrudRepository;

import com.upc.model.Cliente;
import com.upc.model.Reserva;

public interface IReservaDao extends CrudRepository<Reserva, Integer>{
	Reserva findById(int id); 
	List<Reserva> findByVehiculoClienteId(int id);
}
