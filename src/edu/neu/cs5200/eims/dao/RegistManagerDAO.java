package edu.neu.cs5200.eims.dao;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

import edu.neu.cs5200.eims.models.RegistManager;

public class RegistManagerDAO {

	EntityManagerFactory factory = Persistence.createEntityManagerFactory("EmployeeSystem");
	EntityManager em = factory.createEntityManager();
	
	//crud
	//add user
	public RegistManager adduser(RegistManager user){
		em.getTransaction().begin();
		em.persist(user);
		em.getTransaction().commit(); 
		return user;
	}
	//delete user
	public void deleteuser(int id){
		em.getTransaction().begin();
		RegistManager user = em.find(RegistManager.class, id);
		em.remove(user);
		em.getTransaction().commit();
	}
	//check name and password
	public int checkuser(RegistManager user){
		em.getTransaction().begin();
		int id = user.getId();
		String name = user.getName();
		String password = user.getPassword();
		RegistManager user_0 = em.find(RegistManager.class, id);
		String name0 = user_0.getName();
		String password0 = user_0.getPassword();
		int a = 0;
		if (name.equals(name0) && password.equals(password0))
			a = 1;
		em.getTransaction().commit();
		return a;
	}
	
	public static void main(String[] args) {
		RegistManagerDAO dao = new RegistManagerDAO();
//add-user test
	//	RegistManager user = new RegistManager(801, "Zhiqiang", "abcd");
	//	user = dao.adduser(user);
//		System.out.println(user.getId());
//delete-user test
		//dao.deleteuser(106);
//check-user test
//		RegisEmployee user1 = new RegisEmployee(101,"Xiaojin Liu","891215");
//		int b = 0;
//		b = dao.checkuser(user1);
//		System.out.println(b);
//		System.out.println("Hello from DAO main");
	}

}
