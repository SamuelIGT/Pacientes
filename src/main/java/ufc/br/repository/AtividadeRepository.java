package ufc.br.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import ufc.br.model.Atividade;

public interface AtividadeRepository extends JpaRepository<Atividade, Integer>{
	List<Atividade> findByNivel(int nivel);
	
	Atividade findByNome(String nome);
}
