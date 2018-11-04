package com.example.easynotes.repository;

import java.util.List;

import org.springframework.data.repository.CrudRepository;

import com.example.easynotes.model.Vehiculo;

public interface IVehiculoDao extends CrudRepository<Vehiculo, Integer>{
	
	List<Vehiculo> findByClienteId(int id); 

}
