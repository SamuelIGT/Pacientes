package ufc.br.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.validation.constraints.NotNull;

@Entity
public class Paciente {
	@Id
	@GeneratedValue
	private Integer id;
	@NotNull
	private String matricula;
	@NotNull
	private String nome;
	@NotNull
	private String telefone;
	@NotNull
	private String parente;
	@NotNull
	private String contatoParente;
	@NotNull
	private int progresso;
	
	public Paciente(){
		this.progresso = 1;
	}
	
	public Paciente(String matricula, String nome, String telefone, String parente, String contatoParente){
		this.matricula = matricula;
		this.nome = nome;
		this.telefone = telefone;
		this.parente = parente;
		this.contatoParente = contatoParente;
		this.progresso = 1;
	}

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}
	
	public String getMatricula() {
		return matricula;
	}

	public void setMatricula(String matricula) {
		this.matricula = matricula;
	}

	public String getTelefone() {
		return telefone;
	}

	public void setTelefone(String telefone) {
		this.telefone = telefone;
	}

	public String getParente() {
		return parente;
	}

	public void setParente(String parente) {
		this.parente = parente;
	}

	public String getContatoParente() {
		return contatoParente;
	}

	public void setContatoParente(String contatoParente) {
		this.contatoParente = contatoParente;
	}

	public int getProgresso() {
		return progresso;
	}

	public void setProgresso(int progresso) {
		this.progresso = progresso;
	}
	
}
