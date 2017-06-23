package ufc.br.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import ufc.br.model.Usuario;

public interface UsuarioRepository extends JpaRepository<Usuario, Integer>{
	
}
