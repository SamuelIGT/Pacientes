package ufc.br.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

import ufc.br.model.PacienteAtividade;
import ufc.br.repository.PacienteAtividadeRepository;

@Service
public class PacienteAtividadeService {
	@Autowired
	PacienteAtividadeRepository repository;

	public ResponseEntity<String> save(PacienteAtividade pacienteAtividade){
		repository.save(pacienteAtividade);
		return new ResponseEntity<String>("sucesso", HttpStatus.OK);		
	}

	public ResponseEntity<String> delete(Integer id){
		repository.delete(id);
		return new ResponseEntity<String>("sucesso", HttpStatus.OK);
	}

	public ResponseEntity<String> update(PacienteAtividade pacienteAtividade){
		repository.save(pacienteAtividade);
		return new ResponseEntity<String>("sucesso", HttpStatus.OK);
	}

	public ResponseEntity<PacienteAtividade> get(Integer id){
		return new ResponseEntity<PacienteAtividade>(this.repository.findOne(id), HttpStatus.OK);
	}

	public ResponseEntity<List<PacienteAtividade>> get(){
		return new ResponseEntity<List<PacienteAtividade>>(this.repository.findAll(), HttpStatus.OK);
	}
}
