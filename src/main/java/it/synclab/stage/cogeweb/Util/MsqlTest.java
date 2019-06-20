package it.synclab.stage.cogeweb.Util;

import org.hibernate.Session;

public class MsqlTest {

	public static void main(String[] args) {
		Session session = HibernateUtil.getSessionFactory().openSession();
		session.close();

	}

}
