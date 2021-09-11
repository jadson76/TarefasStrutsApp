package com.jadson.dev.tarefas.repository;

import static org.junit.Assert.*;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.Persistence;

import org.junit.AfterClass;
import org.junit.BeforeClass;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.jadson.dev.tarefas.domain.User;
import com.jadson.dev.tarefas.domain.enuns.UserRole;

public class UserRepositoryTest {

	private static UserRepository repository;
	private static ApplicationContext ctx;
	
	@BeforeClass
	public static void prepare() {
		reset();
		ctx = new ClassPathXmlApplicationContext(new String[] {
				"applicationContext.xml", "testDomainContext.xml" });
		repository = (UserRepository) ctx.getBean("userRepository");
	}
	
	
	@AfterClass
	public static void reset() {
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
		User user = saveNewUser();
		savedManeged(user);
		saveUpdate();
		userwithLogin();
		allUsers();
		remove();
		
	}

	private User saveNewUser() {
		User user = getUser();
		repository.save(user);
		assertNotNull(user);
		assertEquals(9, user.getId());
		assertEquals("Usuário", user.getName());
		return user;
	}
	
	private void savedManeged(User user) {
		user.setName("Jadson");
		user = repository.save(user);
		assertEquals("Jadson", user.getName());
		
	}
	
	private void saveUpdate() {
		User u2 = repository.userWithId(6);
		u2.setName("Carla");
		u2.setLogin("15");
		u2 = repository.save(u2);
		assertNotNull(u2);
		assertEquals(6, u2.getId());
	}
	
	private void userwithLogin() {
		User u3 = repository.userWithLogin("loginUser","password");
		assertNotNull(u3);
		assertEquals(4, u3.getId());
		assertEquals(UserRole.ADMIN, u3.getRole());
		assertEquals("password", u3.getPassword());
		
	}
	
	private void allUsers() {
		List<User> list = repository.allUsers();
		assertNotNull(list);
		assertEquals(3, list.size());
		
	}

	private void remove() {
		User u4 = repository.userWithId(3);		
		repository.remove(u4);
		assertNotNull(u4);
		assertNull(repository.userWithId(3));
	}

}
