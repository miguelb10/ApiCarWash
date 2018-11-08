package com.upc.repository;

import org.springframework.data.repository.CrudRepository;

import com.upc.model.Cliente;

public interface IClienteDao extends CrudRepository<Cliente, Integer>{
	Cliente findByEmailAndContrasenia(String Email, String Contrasenia);
	Cliente findById(int id);
}
