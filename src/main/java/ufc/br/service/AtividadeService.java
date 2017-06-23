package ufc.br.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

import ufc.br.model.Atividade;
import ufc.br.repository.AtividadeRepository;

@Service
public class AtividadeService {
	@Autowired
	AtividadeRepository repository;

	public ResponseEntity<String> save(Atividade atividade){
		repository.save(atividade);
		return new ResponseEntity<String>("sucesso", HttpStatus.OK);		
	}

	public ResponseEntity<String> delete(Integer id){
		repository.delete(id);
		return new ResponseEntity<String>("sucesso", HttpStatus.OK);
	}

	public ResponseEntity<String> update(Atividade atividade){
		repository.save(atividade);
		return new ResponseEntity<String>("sucesso", HttpStatus.OK);
	}

	public ResponseEntity<Atividade> get(Integer id){
		return new ResponseEntity<Atividade>(this.repository.findOne(id), HttpStatus.OK);
	}

	public ResponseEntity<List<Atividade>> get(){
		return new ResponseEntity<List<Atividade>>(this.repository.findAll(), HttpStatus.OK);
	}
}
