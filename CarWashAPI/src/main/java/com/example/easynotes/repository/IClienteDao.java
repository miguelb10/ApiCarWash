package com.example.easynotes.repository;

import org.springframework.data.repository.CrudRepository;

import com.example.easynotes.model.Cliente;

public interface IClienteDao extends CrudRepository<Cliente, Integer>{
	Cliente findByEmailAndContrasenia(String Email, String Contrasenia);
}
