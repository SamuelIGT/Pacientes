package ufc.br.repository;

import java.util.Date;
import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import ufc.br.model.Atividade;
import ufc.br.model.Paciente;
import ufc.br.model.PacienteAtividade;

public interface PacienteAtividadeRepository extends JpaRepository<PacienteAtividade, Integer>{
	
	List<PacienteAtividade> findByPaciente(Paciente paciente);
	
	List<PacienteAtividade> findByStatus(boolean status);
	
	List<PacienteAtividade> findByAtividade(Atividade atividade);
	
	PacienteAtividade findByPacienteAndData(Paciente paciente,Date data);
}
