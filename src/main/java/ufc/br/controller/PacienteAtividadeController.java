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

import ufc.br.model.PacienteAtividade;
import ufc.br.service.PacienteAtividadeService;

@RestController
@RequestMapping("/pacienteatividade")
@CrossOrigin(origins = "*")
public class PacienteAtividadeController {
	@Autowired
	private PacienteAtividadeService service;

	@PostMapping
	public ResponseEntity<String> save(@RequestBody PacienteAtividade pacienteAtividade){
		return service.save(pacienteAtividade);
	}

	@DeleteMapping("/{id}")
	public ResponseEntity<String> delete(@PathVariable Integer id){
		return service.delete(id);
	}

	@PutMapping
	public ResponseEntity<String> update(@RequestBody PacienteAtividade pacienteAtividade){
		return service.update(pacienteAtividade);
	}

	@GetMapping("/{id}")
	public ResponseEntity<PacienteAtividade> get(@PathVariable Integer id){
		return service.get(id);
	}

	@GetMapping
	public ResponseEntity<List<PacienteAtividade>> get(){
		return service.get();
	}
}
