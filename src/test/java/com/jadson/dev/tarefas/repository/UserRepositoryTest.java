package com.jadson.dev.tarefas.repository;

import static org.junit.Assert.*;

import javax.persistence.EntityManager;
import javax.persistence.Persistence;

import org.junit.AfterClass;
import org.junit.BeforeClass;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.jadson.dev.tarefas.domain.User;

public class UserRepositoryTest {

	private static UserRepository repository;
	private static ApplicationContext ctx;
	
	@BeforeClass
	public static void prepare() {
		//reset();
		ctx = new ClassPathXmlApplicationContext(new String[] {
				"applicationContext.xml", "testDomainContext.xml" });
		repository = (UserRepository) ctx.getBean("userRepository");
	}
	
	@AfterClass
	public static void reset(){
		EntityManager em = Persistence.createEntityManagerFactory("tarefas").createEntityManager();
        em.getTransaction().begin();       
        em.createNativeQuery("DELETE FROM TAREFAS.USER").executeUpdate();
        em.getTransaction().commit();
        em.close();
	}
	
	private User getUser() {		
		return (User) ctx.getBean("userExample");
	}
	
	@Test
	public void success() {
		saveNewUser();
	}
	
	private void saveNewUser() {
		User user = getUser();
		repository.save(user);
		assertNotNull(user);
		//assertEquals(10, user.getId());
		assertEquals("Usuário", user.getName());
	}

	

}
