package com.example.easynotes.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.validation.Valid;
import java.text.ParseException;
import com.example.easynotes.model.Cliente;
import com.example.easynotes.repository.IClienteDao;

@RestController
@RequestMapping("/api")
public class ClienteController {

	@Autowired
	IClienteDao clienteDao;

	@GetMapping("/cliente/{email}/{contrasenia}")
	public Cliente obtenerCliente(@PathVariable String email, @PathVariable String contrasenia) {
		Cliente cliente = clienteDao.findByEmailAndContrasenia(email, contrasenia);
		return cliente;
	}

	@PostMapping("/cliente/register")
	public Cliente crearMedida(@Valid @RequestBody Cliente cliente) throws ParseException {
		cliente.setEstado("ACTIVO");
		return clienteDao.save(cliente);
	}

}
