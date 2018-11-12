package com.upc.controller;

import java.text.ParseException;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.upc.model.Reserva;
import com.upc.model.Servicio;
import com.upc.repository.IClienteDao;
import com.upc.repository.IReservaDao;
import com.upc.repository.IServicioDao;
import com.upc.repository.IVehiculoDao;

@RestController
@RequestMapping("/api")
public class ReservaController {

	@Autowired
	IClienteDao clienteDao;

	@Autowired
	IReservaDao reservaDao;

	@Autowired
	IVehiculoDao vehiculoDao;

	@Autowired
	IServicioDao servicioDao;

	@PostMapping("/reserva/{idvehiculo}/{idservicio}/save")
	public Reserva registrarReserva(@Valid @RequestBody Reserva reserva, @PathVariable String idvehiculo,
			@PathVariable String idservicio) throws ParseException {
		reserva.setEstado("Activo");
		reserva.setVehiculo(vehiculoDao.findById(Integer.parseInt(idvehiculo)));
		reserva.setServicio(servicioDao.findById(Integer.parseInt(idservicio)));

		return reservaDao.save(reserva);
	}

	@GetMapping("/reserva/{id}")
	public Reserva getReserva(@PathVariable String id) {
		return reservaDao.findById(Integer.parseInt(id));
	}

}