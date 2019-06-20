package it.synclab.stage.cogeweb.entities;

import java.io.Serializable;
import java.util.HashSet;
import java.util.Set;

import javax.persistence.*;

@Entity
@Table(name="COMMESSE")
public class Commessa implements Serializable {	
	private static final long serialVersionUID = 1L;
	@Id
	private Integer id;
	@ManyToOne
	@JoinColumn(name="ID_COMPANY")
	private Company company;
	private int durata;
	private String indirizzo;
	@OneToMany(mappedBy="commessa",cascade=CascadeType.ALL)
	private Set<Employee>employees= new HashSet<>();
	public Commessa() {
	}
	public Commessa(int id, Company company, int durata, String indirizzo) {
		this.id = id;
		this.company = company;
		this.durata = durata;
		this.indirizzo = indirizzo;
	}
	public int getId() {
		return id;
	}
	public Company getCompany() {
		return company;
	}
	public int getDurata() {
		return durata;
	}
	public String getIndirizzo() {
		return indirizzo;
	}
	public void setId(int i) {
		this.id = i;
	}
	public void setCompany(Company company) {
		this.company = company;
	}
	public void setDurata(int durata) {
		this.durata = durata;
	}
	public void setIndirizzo(String indirizzo) {
		this.indirizzo = indirizzo;
	}
	
}
