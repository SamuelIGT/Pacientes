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

import ufc.br.model.Usuario;
import ufc.br.service.UsuarioService;

@RestController
@RequestMapping("/usuarios")
@CrossOrigin(origins = "*")
public class UsuarioController {

	@Autowired
	private UsuarioService service;

	@PostMapping
	public ResponseEntity<String> save(@RequestBody Usuario usuario){
		return service.save(usuario);
	}

	@DeleteMapping("/{id}")
	public ResponseEntity<String> delete(@PathVariable Integer id){
		return service.delete(id);
	}

	@PutMapping
	public ResponseEntity<String> update(@RequestBody Usuario usuario){
		return service.update(usuario);
	}

	@GetMapping("/{id}")
	public ResponseEntity<Usuario> get(@PathVariable Integer id){
		return service.get(id);
	}

	@GetMapping
	public ResponseEntity<List<Usuario>> get(){
		return service.get();
	}

}
