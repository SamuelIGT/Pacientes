package ufc.br.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import ufc.br.model.Paciente;

public interface PacienteRepository extends JpaRepository<Paciente, Integer>{
	
	Paciente findByMatricula(String matricula);
	
}
