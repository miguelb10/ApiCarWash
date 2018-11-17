package com.upc.repository;

import java.util.List;

import org.springframework.data.repository.CrudRepository;

import com.upc.model.Servicio;


public interface IServicioDao extends CrudRepository<Servicio, Integer>{
	Servicio findById(int id);
	
	List<Servicio> findByEmpresaId(int id);
}
