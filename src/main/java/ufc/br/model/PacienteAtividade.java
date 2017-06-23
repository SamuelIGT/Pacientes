package ufc.br.model;

import java.util.Date;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.OneToOne;

@Entity
public class PacienteAtividade {
	@Id
	@GeneratedValue
	private Integer id;
	@OneToOne
	private Paciente paciente;
	@OneToOne
	private Atividade atividade;
	private int duracaoTotal;
	private boolean status;
	private String mensagem;
	private int escala;
	private Date data; 
	
	public PacienteAtividade(){
		this.status = false;
	}
	
	public PacienteAtividade(Paciente paciente, Atividade atividade){
		this.paciente = paciente;
		this.atividade = atividade;
		this.status = false;
	}

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public Paciente getPaciente() {
		return paciente;
	}

	public void setPaciente(Paciente paciente) {
		this.paciente = paciente;
	}

	public Atividade getAtividade() {
		return atividade;
	}

	public void setAtividade(Atividade atividade) {
		this.atividade = atividade;
	}

	public int getDuracaoTotal() {
		return duracaoTotal;
	}

	public void setDuracaoTotal(int duracaoTotal) {
		this.duracaoTotal = duracaoTotal;
	}

	public boolean isStatus() {
		return status;
	}

	public void setStatus(boolean status) {
		this.status = status;
	}

	public String getMensagem() {
		return mensagem;
	}

	public void setMensagem(String mensagem) {
		this.mensagem = mensagem;
	}

	public int getEscala() {
		return escala;
	}

	public void setEscala(int escala) {
		this.escala = escala;
	}

	public Date getData() {
		return data;
	}

	public void setData(Date data) {
		this.data = data;
	}
	
}
