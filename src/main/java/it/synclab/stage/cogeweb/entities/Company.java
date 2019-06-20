package it.synclab.stage.cogeweb.entities;

import java.io.Serializable;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;


@Entity
@Table(name="COMPANIES")
public class Company implements Serializable {	
	private static final long serialVersionUID = 1L;
	@Id
	private String piva;
	private String nome;
	public Company() {
		super();
	}
	public Company(String piva, String nome) {
		this.piva = piva;
		this.nome = nome;
	}
	public String getPiva() {
		return piva;
	}
	public void setPiva(String piva) {
		this.piva = piva;
	}
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	@Override
	public String toString() {
		return  piva + ", " + nome ;
	}

}
