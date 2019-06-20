package it.synclab.stage.cogeweb.dao;

import java.util.List;

import it.synclab.stage.cogeweb.entities.Employee;

public interface IEmployeeDAO {
	public void deleteEmployee(Employee employee);
	public void addEamployee(Employee employee);
	public void updateEmployee(Employee employee);
	public List<Employee> findAll();
	public List<Employee> findByKeyWord(Employee employee);
	public List<String> listaSkillImpiegatoBykey(String id);
	public List<String> listaImpiegatiConDeteminatoSkill(String id);
	public List<String> listaImpiegatiConDeteminatoSkillLavorandoCommessa(String idCommessa,String SkillName);

}
