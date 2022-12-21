package cl.golan.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import cl.golan.services.ServicioApi;

@RestController
@RequestMapping("/golan-api/v1")
public class Api {
	
	@Autowired
	ServicioApi servicio;
	
	@GetMapping("/prueba")
	public ResponseEntity<Object> cliente_sursales(){
		
		return new ResponseEntity<Object>(servicio.data("JOSE TORRES"), HttpStatus.OK);
		
	}
}