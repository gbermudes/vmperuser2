package com.doti2c.vmperuser.app.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.doti2c.vmperuser.app.dao.SolicitacaoDAO;
import com.doti2c.vmperuser.app.model.Item;
import com.doti2c.vmperuser.app.model.Solicitacao;

@RestController
@CrossOrigin("*")
public class SolicitacaoController {
	
	@Autowired
	SolicitacaoDAO sdao;
	
	@PostMapping("/solicitacoes/nova")
	public ResponseEntity<Solicitacao> adicionarSolicitacao(@RequestBody Solicitacao nova){
		try {
			// aqui eu vinculo a solicitacao de cada item
			for (Item it : nova.getItensSolicitacao()) {
				it.setSolicitacao(nova);
			}
			System.out.println(nova.getData());
			sdao.save(nova);
			return ResponseEntity.ok(nova);
		}
		catch(Exception ex) {
			return ResponseEntity.status(400).build();
		}
	}
	
	@GetMapping("/solicitacao/{id}")
	public ResponseEntity<Solicitacao> buscarPeloId(@PathVariable int id){
		Solicitacao solicit = sdao.findById(id).orElse(null);
		if (solicit != null) {
			return ResponseEntity.ok(solicit);
		}
		else {
			return ResponseEntity.notFound().build();
		}
	}

}
