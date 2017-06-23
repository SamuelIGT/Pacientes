package ufc.br.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import ufc.br.model.Atividade;
import ufc.br.service.AtividadeService;

@RestController
@RequestMapping("/atividades")
@CrossOrigin(origins = "*")
public class AtividadeController {
	@Autowired
	private AtividadeService service;

	@PostMapping
	public ResponseEntity<String> save(@RequestBody Atividade atividade){
		return service.save(atividade);
	}

	@DeleteMapping("/{id}")
	public ResponseEntity<String> delete(@PathVariable Integer id){
		return service.delete(id);
	}

	@PutMapping
	public ResponseEntity<String> update(@RequestBody Atividade atividade){
		return service.update(atividade);
	}

	@GetMapping("/{id}")
	public ResponseEntity<Atividade> get(@PathVariable Integer id){
		return service.get(id);
	}

	@GetMapping
	public ResponseEntity<List<Atividade>> get(){
		return service.get();
	}
}
