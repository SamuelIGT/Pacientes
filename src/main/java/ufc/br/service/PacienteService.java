package ufc.br.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;


import ufc.br.model.Paciente;
import ufc.br.repository.PacienteRepository;

@Service
public class PacienteService {
	@Autowired
	PacienteRepository repository;

	public ResponseEntity<String> save(Paciente paciente){
		repository.save(paciente);
		return new ResponseEntity<String>("sucesso", HttpStatus.OK);		
	}

	public ResponseEntity<String> delete(Integer id){
		repository.delete(id);
		return new ResponseEntity<String>("sucesso", HttpStatus.OK);
	}

	public ResponseEntity<String> update(Paciente paciente){
		repository.save(paciente);
		return new ResponseEntity<String>("sucesso", HttpStatus.OK);
	}

	public ResponseEntity<Paciente> get(Integer id){
		return new ResponseEntity<Paciente>(this.repository.findOne(id), HttpStatus.OK);
	}

	public ResponseEntity<List<Paciente>> get(){
		return new ResponseEntity<List<Paciente>>(this.repository.findAll(), HttpStatus.OK);
	}
}
