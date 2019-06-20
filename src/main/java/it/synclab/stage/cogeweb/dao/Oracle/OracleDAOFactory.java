package it.synclab.stage.cogeweb.dao.Oracle;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

import it.synclab.stage.cogeweb.dao.DAOFactory;
import it.synclab.stage.cogeweb.dao.ICommessaDAO;
import it.synclab.stage.cogeweb.dao.ICompanyDAO;
import it.synclab.stage.cogeweb.dao.IDepartmentDAO;
import it.synclab.stage.cogeweb.dao.IEmployeeDAO;
import it.synclab.stage.cogeweb.dao.ISkillEmployeeDAO;
import it.synclab.stage.cogeweb.dao.ISkillsDAO;
import it.synclab.stage.cogeweb.dao.IStoryEmployeeCommessaDAO;

public class OracleDAOFactory extends DAOFactory {
	
	private static OracleDAOFactory instance=null;

	private static String driver="oracle.jdbc.driver.OracleDriver";
	private static String url="jdbc:oracle:thin:@localhost:1521:xe";
	private static String user="system";
	private static String password="admin";
	private OracleDAOFactory(){
		try{
			 Class.forName(driver);       
			}catch (ClassNotFoundException e) {
				e.printStackTrace();
			}
			}
	public Connection getConnection() throws SQLException{
		Connection conn = null;		 
	       conn = DriverManager.getConnection(url, user, password);		
	        return conn;	
	}
	public static OracleDAOFactory getInstance() {
		if(instance == null) instance = new OracleDAOFactory();
		return instance;
	}
	
	

	@Override
	public IEmployeeDAO getIEmployeeDAO() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public ICommessaDAO getICommessaDAO() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public ICompanyDAO getICompanyDAO() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public IDepartmentDAO getIDepartmentDAO() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public ISkillEmployeeDAO getISkillEmployeeDAO() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public ISkillsDAO getISkillsDAO() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public IStoryEmployeeCommessaDAO getIStoryEmployeeCommessaDAO() {
		// TODO Auto-generated method stub
		return null;
	}

}
