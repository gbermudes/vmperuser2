package com.doti2c.vmperuser.app.controller;

import java.util.ArrayList;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.doti2c.vmperuser.app.dao.MaquinaDAO;
import com.doti2c.vmperuser.app.model.Maquina;

@RestController
public class MaquinaController {

	@Autowired
	MaquinaDAO mdao;
	
	@PostMapping("/maquina/novo")
	public ResponseEntity<Maquina> adicionarMaquina(@RequestBody Maquina nova){
		return ResponseEntity.ok(nova);
		
	}
	
	@GetMapping("/maquinas")
	public ResponseEntity<ArrayList<Maquina>> buscarTodos() {
		ArrayList<Maquina> lista = (ArrayList<Maquina>) mdao.findAll();
		return ResponseEntity.ok(lista);
	}
	
}
