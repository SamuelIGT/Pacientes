package ufc.br.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

import ufc.br.model.Usuario;
import ufc.br.repository.UsuarioRepository;

@Service
public class UsuarioService {
	@Autowired
	UsuarioRepository repository;

	public ResponseEntity<String> save(Usuario usuario){
		repository.save(usuario);
		return new ResponseEntity<String>("sucesso", HttpStatus.OK);		
	}

	public ResponseEntity<String> delete(Integer id){
		repository.delete(id);
		return new ResponseEntity<String>("sucesso", HttpStatus.OK);
	}

	public ResponseEntity<String> update(Usuario usuario){
		repository.save(usuario);
		return new ResponseEntity<String>("sucesso", HttpStatus.OK);
	}

	public ResponseEntity<Usuario> get(Integer id){
		return new ResponseEntity<Usuario>(this.repository.findOne(id), HttpStatus.OK);
	}

	public ResponseEntity<List<Usuario>> get(){
		return new ResponseEntity<List<Usuario>>(this.repository.findAll(), HttpStatus.OK);
	}
}
