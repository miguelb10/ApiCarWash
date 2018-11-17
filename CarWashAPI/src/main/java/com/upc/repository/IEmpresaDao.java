package com.upc.repository;

import org.springframework.data.repository.CrudRepository;

import com.upc.model.Empresa;

public interface IEmpresaDao extends CrudRepository<Empresa, Integer>{
	
}
