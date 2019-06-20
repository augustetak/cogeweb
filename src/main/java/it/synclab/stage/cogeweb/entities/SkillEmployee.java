package it.synclab.stage.cogeweb.entities;

import java.io.Serializable;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
@SuppressWarnings("serial")
@Entity
public class SkillEmployee implements Serializable {
	@Id
   private Long id;
	@ManyToOne()
	//@JoinColumn(name="CF")
   private Employee employee;
	@ManyToOne()
	//@JoinColumn(name="IDSKILL")
   private Skills skill ;
	public SkillEmployee(Employee employee, Skills skill) {
		super();
		this.employee = employee;
		this.skill = skill;
	}
	public SkillEmployee() {
		super();
	}
	public Long getId() {
		return id;
	}
	public void setId(Long id) {
		this.id = id;
	}
	public Employee getEmployee() {
		return employee;
	}
	public void setEmployee(Employee employee) {
		this.employee = employee;
	}
	public Skills getSkill() {
		return skill;
	}
	public void setSkill(Skills skill) {
		this.skill = skill;
	}
}
