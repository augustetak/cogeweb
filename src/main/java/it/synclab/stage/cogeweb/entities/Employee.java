package it.synclab.stage.cogeweb.entities;

import java.io.Serializable;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.GregorianCalendar;
import java.util.HashSet;
import java.util.Set;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.JoinTable;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.Table;

@Entity
@Table(name="EMPLOYEES")
public class Employee implements Serializable {
	private static final long serialVersionUID = 1L;
	@Id
	private String cf;
	@Column(nullable=false)
	private String matricule;
	private String nam;
	private String surname;
	private String roll;
	private GregorianCalendar birthday;
	private String residence;
	private double salary;
	private String partner;
	@Column(length=1)		
	private String sex;
	@ManyToOne
	@JoinColumn(name="ID_DEPARTMENT")
	private Department department;
	@ManyToOne
	@JoinColumn(name="ID_COMMESSA")
	private Commessa commessa;
	@OneToMany(cascade=CascadeType.ALL)
	@JoinTable(
			name="SKILL_EMPLOYEES",
			joinColumns=@JoinColumn(
					name="EMPLOYEE_CF",
					referencedColumnName="CF"
					),
			inverseJoinColumns=@JoinColumn(
					name="SKILL_ID",
					referencedColumnName="iDSkill"					
					)
			)
	private Set<Skills> skills =new HashSet<>();
	public Employee() {
		super();
	}
	public Employee(String cf, String matricule, String nam, String surname, String roll, GregorianCalendar birthday,
			String residence, double salary, String partner, Department department, Commessa commessa, String sex) {
		super();
		this.cf = cf;
		this.matricule = matricule;
		this.nam = nam;
		this.surname = surname;
		this.roll = roll;
		this.birthday = birthday;
		this.residence = residence;
		this.salary = salary;
		this.partner = partner;
		this.department = department;
		this.commessa = commessa;
		this.sex = sex;
	}
	public String getSex() {
		return sex;
	}
	public void setSex(String sex) {
		this.sex = sex;
	}
	public Set<Skills> getSkills() {
		return skills;
	}
	public void setSkills(Set<Skills> skills) {
		this.skills = skills;
	}
	public String getCf() {
		return cf;
	}
	public void setCf(String cf) {
		this.cf = cf;
	}
	public String getMatricule() {
		return matricule;
	}
	public void setMatricule(String matricule) {
		this.matricule = matricule;
	}
	public String getNam() {
		return nam;
	}
	public void setNam(String nam) {
		this.nam = nam;
	}
	public String getSurname() {
		return surname;
	}
	public void setSurname(String surname) {
		this.surname = surname;
	}
	public String getRoll() {
		return roll;
	}
	public void setRoll(String roll) {
		this.roll = roll;
	}
	public GregorianCalendar getBirthday() {
		return birthday;
	}
	public void setBirthday(GregorianCalendar birthday) {
		this.birthday = birthday;
	}
	public String getResidence() {
		return residence;
	}
	public void setResidence(String residence) {
		this.residence = residence;
	}
	public double getSalary() {
		return salary;
	}
	public void setSalary(double salary) {
		this.salary = salary;
	}
	public String getPartner() {
		return partner;
	}
	public void setPartner(String partner) {
		this.partner = partner;
	}
	public Department getDepartment() {
		return department;
	}
	public void setDepartment(Department department) {
		this.department = department;
	}
	public Commessa getCommessa() {
		return commessa;
	}
	public void setCommessa(Commessa commessa) {
		this.commessa = commessa;
	}
	public String birthdayToStringConverter(){
		DateFormat dateFormat = new SimpleDateFormat("yyyy-MM-dd");
		Date date=birthday.getTime();
		return dateFormat.format(date);
	}
	public void addSkill(Skills skill) {
    	skills.add(skill);
    }
}
