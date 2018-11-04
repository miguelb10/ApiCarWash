package com.example.easynotes.controller;

import java.text.ParseException;
import java.util.List;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.easynotes.model.Cliente;
import com.example.easynotes.model.Vehiculo;
import com.example.easynotes.repository.IClienteDao;
import com.example.easynotes.repository.IVehiculoDao;

@RestController
@RequestMapping("/api")
public class VehiculoController {

	@Autowired
	IClienteDao clienteDao;
	
	@Autowired
	IVehiculoDao vehiculoDao;
	
	@PostMapping("/vehiculo/{id}/save")
	public Vehiculo registrarVehiculo(@PathVariable String id ,@Valid @RequestBody Vehiculo vehiculo) throws ParseException {
		Cliente cliente = clienteDao.findById(Integer.parseInt(id));
		vehiculo.setEstado("ACTIVO");
		vehiculo.setCliente(cliente);
		return vehiculoDao.save(vehiculo);
	}
	@GetMapping("/vehiculo/cliente/{id}")
	public List<Vehiculo> vehiculosByCliente(@PathVariable String id) {
		return vehiculoDao.findByClienteId(Integer.parseInt(id));
	}

}
