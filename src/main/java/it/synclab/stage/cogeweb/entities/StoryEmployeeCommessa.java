package it.synclab.stage.cogeweb.entities;

import java.io.Serializable;
import java.util.Date;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.OneToOne;
import javax.persistence.Table;

@SuppressWarnings("serial")
@Entity
@Table(name="STORY_EMPLOYEE_COMMESSE")
public class StoryEmployeeCommessa implements Serializable {
	@Id
	private Long id;
	@OneToOne
	private Employee employee;
	@OneToOne
	private Commessa commessa;
	private String refContract;
	private Date begining;
	private Date endContract;
	private int duration;
	private double cost;
	private String feelback;
	public StoryEmployeeCommessa() {
		super();
	}
	public StoryEmployeeCommessa(Employee employee, Commessa commessa, String refContract, Date begining,
			Date endContract, int duration, double cost, String feelback) {
		super();
		this.employee = employee;
		this.commessa = commessa;
		this.refContract = refContract;
		this.begining = begining;
		this.endContract = endContract;
		this.duration = duration;
		this.cost = cost;
		this.feelback = feelback;
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
	public Commessa getCommessa() {
		return commessa;
	}
	public void setCommessa(Commessa commessa) {
		this.commessa = commessa;
	}
	public String getRefContract() {
		return refContract;
	}
	public void setRefContract(String refContract) {
		this.refContract = refContract;
	}
	public Date getBegining() {
		return begining;
	}
	public void setBegining(Date begining) {
		this.begining = begining;
	}
	public Date getEndContract() {
		return endContract;
	}
	public void setEndContract(Date endContract) {
		this.endContract = endContract;
	}
	public int getDuration() {
		return duration;
	}
	public void setDuration(int duration) {
		this.duration = duration;
	}
	public double getCost() {
		return cost;
	}
	public void setCost(double cost) {
		this.cost = cost;
	}
	public String getFeelback() {
		return feelback;
	}
	public void setFeelback(String feelback) {
		this.feelback = feelback;
	}

}
