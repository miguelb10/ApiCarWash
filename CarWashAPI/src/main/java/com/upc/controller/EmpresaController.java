package com.upc.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.upc.model.Empresa;

import com.upc.repository.IEmpresaDao;

@RestController
@RequestMapping("/api")
public class EmpresaController {
	@Autowired
	IEmpresaDao empresaDao;
	
	@GetMapping("/empresas")
	public Iterable<Empresa> listServicios() {
		return empresaDao.findAll();
	}
}
