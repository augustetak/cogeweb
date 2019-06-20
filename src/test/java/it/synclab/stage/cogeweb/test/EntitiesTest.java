package it.synclab.stage.cogeweb.test;

import static org.junit.Assert.*;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

import org.junit.Before;
import org.junit.Test;

public class EntitiesTest {
	private EntityManagerFactory entityManagerFactory;

	@Before
	public void setUp() throws Exception {
	}

	@Test
	public void test() {
		try {
		entityManagerFactory = Persistence.createEntityManagerFactory("COGEWEB_PU");
		EntityManager entityManager =entityManagerFactory.createEntityManager();
		assertTrue(true);
		}catch (Exception e) {
			fail(e.getMessage());
			e.printStackTrace();
		}
		
	}

}
