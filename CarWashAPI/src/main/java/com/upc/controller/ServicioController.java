package com.upc.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.upc.model.Servicio;

import com.upc.repository.IServicioDao;

@RestController
@RequestMapping("/api")
public class ServicioController {

	@Autowired
	IServicioDao servicioDao;
	
	@GetMapping("/servicios")
	public Iterable<Servicio> listServicios() {
		return servicioDao.findAll();
	}
	
	@GetMapping("/servicios/empresa/{id}")
	public List<Servicio> vehiculosByCliente(@PathVariable String id) {
		return servicioDao.findByEmpresaId(Integer.parseInt(id));
	}
}
