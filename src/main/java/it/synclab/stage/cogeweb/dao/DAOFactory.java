package it.synclab.stage.cogeweb.dao;

import it.synclab.stage.cogeweb.dao.Oracle.OracleDAOFactory;

public abstract class DAOFactory {
	//-- List of  Supported DAO types
	public static final int MYSQL =0;
	public static final int POSTGRESQL =1;
	public static final int ORACLE =2;
	public static DAOFactory getDAOFAactory(int wichFactory) {
		switch (wichFactory) {
		case MYSQL:
			
			return null;
        case POSTGRESQL:
			
        	return null;
         case ORACLE:
			
        	return OracleDAOFactory.getInstance();
		default:
			return null;
		}	  	
	}
	public abstract IEmployeeDAO getIEmployeeDAO();
	public abstract ICommessaDAO getICommessaDAO();
	public abstract ICompanyDAO getICompanyDAO();
	public abstract IDepartmentDAO getIDepartmentDAO();
	public abstract ISkillEmployeeDAO getISkillEmployeeDAO();
	public abstract ISkillsDAO getISkillsDAO();
	public abstract IStoryEmployeeCommessaDAO getIStoryEmployeeCommessaDAO();

}
