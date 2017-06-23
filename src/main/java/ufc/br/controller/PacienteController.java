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

import ufc.br.model.Paciente;
import ufc.br.service.PacienteService;

@RestController
@RequestMapping("/pacientes")
@CrossOrigin(origins = "*")
public class PacienteController {

	@Autowired
	private PacienteService service;

	@PostMapping
	public ResponseEntity<String> save(@RequestBody Paciente paciente){
		return service.save(paciente);
	}

	@DeleteMapping("/{id}")
	public ResponseEntity<String> delete(@PathVariable Integer id){
		return service.delete(id);
	}

	@PutMapping
	public ResponseEntity<String> update(@RequestBody Paciente paciente){
		return service.update(paciente);
	}

	@GetMapping("/{id}")
	public ResponseEntity<Paciente> get(@PathVariable Integer id){
		return service.get(id);
	}

	@GetMapping
	public ResponseEntity<List<Paciente>> get(){
		return service.get();
	}
}
