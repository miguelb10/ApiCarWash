package com.upc.repository;

import org.springframework.data.repository.CrudRepository;

import com.upc.model.Servicio;

public interface IServicioDao extends CrudRepository<Servicio, Integer>{
	Servicio findById(int id);
}
