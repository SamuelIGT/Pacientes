package ufc.br.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.validation.constraints.NotNull;

@Entity
public class Atividade {
	@Id
	@GeneratedValue
	private Integer id;
	@NotNull
	private int nivel;
	@NotNull
	private String nome;
	@NotNull
	private int duracao;
	
	public Atividade(){
		
	}
	
	public Atividade(int nivel, String nome, int duracao){
		this.nivel = nivel;
		this.nome = nome;
		this.duracao = duracao;
	}
	
	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public int getNivel() {
		return nivel;
	}
	public void setNivel(int nivel) {
		this.nivel = nivel;
	}
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}

	public int getDuracao() {
		return duracao;
	}

	public void setDuracao(int duracao) {
		this.duracao = duracao;
	}
	
}
