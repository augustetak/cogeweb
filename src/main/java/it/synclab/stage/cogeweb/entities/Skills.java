package it.synclab.stage.cogeweb.entities;

import java.io.Serializable;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@SuppressWarnings("serial")
@Entity
@Table(name="SKILLSS")
public class Skills implements Serializable {
	@Id
	private Long iDSkill;
	private String nomeSkill;
	private String categoria;
	private String ambiente;
	private String description;
	//@OneToMany()
   // @JoinTable(name="SKILLEMPLOYEE")
	//private List<Employee> employee= new ArrayList<Employee>(); 
	public Skills() {		
	}
	public Skills(long iDSkill, String nomeSkill, String categoria, String ambiente, String description) {
		this.iDSkill = iDSkill;
		this.nomeSkill = nomeSkill;
		this.categoria = categoria;
		this.ambiente = ambiente;
		this.description = description;
	}
	/*public List<Employee> getEmployee() {
		return employee;
	}
	public void setEmployee(List<Employee> employee) {
		this.employee = employee;
	}*/
	public void setiDSkill(Long iDSkill) {
		this.iDSkill = iDSkill;
	}
	public long getiDSkill() {
		return iDSkill;
	}
	public void setiDSkill(long iDSkill) {
		this.iDSkill = iDSkill;
	}
	public String getNomeSkill() {
		return nomeSkill;
	}
	public void setNomeSkill(String nomeSkill) {
		this.nomeSkill = nomeSkill;
	}
	public String getCategoria() {
		return categoria;
	}
	public void setCategoria(String categoria) {
		this.categoria = categoria;
	}
	public String getAmbiente() {
		return ambiente;
	}
	public void setAmbiente(String ambiente) {
		this.ambiente = ambiente;
	}
	public String getDescription() {
		return description;
	}
	public void setDescription(String description) {
		this.description = description;
	}
	
}
