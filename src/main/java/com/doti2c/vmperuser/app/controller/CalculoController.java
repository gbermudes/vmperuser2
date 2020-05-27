package com.doti2c.vmperuser.app.controller;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;

import com.doti2c.vmperuser.app.model.Calculo;




public class CalculoController {

	@PostMapping("/maquina/calculo")
	public ResponseEntity<Calculo>  calculoPrevio(@RequestBody Calculo novo){
		try {
			int i;
			i = (novo.getProc() * 10 ) + (novo.getMem() * 5) + novo.getDisc() + novo.getBand() + novo.getSoft();
			novo.setTotal(i);
			return ResponseEntity.ok(novo);
			}
		catch (Exception ex) {
			return ResponseEntity.status(500).build();
		}
	
	}
		
		
	
	
}
