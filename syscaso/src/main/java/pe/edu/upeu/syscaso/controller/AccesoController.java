package pe.edu.upeu.syscaso.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import jakarta.validation.Valid;
import pe.edu.upeu.syscaso.entity.Acceso;
import pe.edu.upeu.syscaso.service.AccesoService;

@RestController
@RequestMapping("/api/accesos")
public class AccesoController {
	
	@Autowired
	private AccesoService service;
	@GetMapping
	public ResponseEntity<List<Acceso>> readAll(){
		try {
			List<Acceso> lista = service.readAll();
			if(lista.isEmpty()) {
				return new ResponseEntity<>(HttpStatus.NO_CONTENT);
			}else{
				return new ResponseEntity<>(lista, HttpStatus.OK);
			}
			
		} catch (Exception e) {
			// TODO: handle exception
			return new ResponseEntity<>(null, HttpStatus.INTERNAL_SERVER_ERROR);
		}
		
	}
	@PostMapping
	public ResponseEntity<Acceso> create(@Valid @RequestBody Acceso obj){
		
		try {
			Acceso objeto = service.create(obj);
			return new ResponseEntity<Acceso>(objeto, HttpStatus.CREATED);
		} catch (Exception e) {
			// TODO: handle exception
			return new ResponseEntity<>(null, HttpStatus.INTERNAL_SERVER_ERROR);
		}
	}
	@PostMapping("/{accesoId}/roles/{rolId}")
	public ResponseEntity<Acceso> registroAccesoRol(@PathVariable Long accesoId, @PathVariable Long rolId){
		 Acceso ac = service.createAccesoRol(accesoId, rolId);
		 return ResponseEntity.ok(ac);
		
	}
	
	
	
}
