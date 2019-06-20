package it.synclab.stage.cogeweb.entities;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;
@Entity
@Table(name="DEPARTMENTS")
public class Department implements Serializable{	
	private static final long serialVersionUID = 5259534659727659232L;
	@Id
	private Long idDep;
	private String nomeDep;
	@OneToMany(mappedBy="department",cascade=CascadeType.ALL)
	private List<Employee> employees =new ArrayList<>();
	public Department() {
	}
	public Department(Long iddep, String nomedep) {
		this.idDep = iddep;
		this.nomeDep = nomedep;
	}
	public List<Employee> getEmployees() {
		return employees;
	}
	public void setEmployees(List<Employee> employees) {
		this.employees = employees;
	}
	public Long getIdDep() {
		return idDep;
	}
	public void setIdDep(Long iddep) {
		this.idDep = iddep;
	}
	public String getNomeDep() {
		return nomeDep;
	}
	public void setNomeDep(String nomedep) {
		this.nomeDep = nomedep;
	}
	@Override
	public String toString() {
		return "iddep=" + idDep + ", nomedep=" + nomeDep ;
	}
}
