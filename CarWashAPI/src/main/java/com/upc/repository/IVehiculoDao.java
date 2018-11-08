package com.upc.repository;

import java.util.List;

import org.springframework.data.repository.CrudRepository;

import com.upc.model.Vehiculo;

public interface IVehiculoDao extends CrudRepository<Vehiculo, Integer>{
	
	List<Vehiculo> findByClienteId(int id); 

}
