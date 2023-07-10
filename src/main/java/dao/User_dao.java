package dao;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

import dto.User_dto;

public class User_dao 
{
	EntityManagerFactory factory=Persistence.createEntityManagerFactory("dev");
	EntityManager entityManager=factory.createEntityManager();
	EntityTransaction transaction=entityManager.getTransaction();
	public void save(User_dto dto)
	{
		transaction.begin();
		entityManager.persist(dto);
		transaction.commit();
	}
	
	public User_dto login(long mob)
	{
		return entityManager.find(User_dto.class, mob);
	}
	
	public User_dto login1(String email)
	{
		// entityManager.createNativeQuery("select * from User_dto where email=?").setParameter(1, email);
	List<User_dto> list=entityManager.createQuery("select X from User_dto X where email=?1").setParameter(1, email).getResultList();
	
	if(list.isEmpty())
	{
		return null;
	}
	else
	{
		return list.get(0);
		
	}
}
	public List<User_dto> fetchAll()
	{
	return	entityManager.createQuery("select x from User_dto x").getResultList();
	}
	public User_dto find(long mob)
	{
		return entityManager.find(User_dto.class, mob);
	}
	public void delete(User_dto userdto)
	{
		transaction.begin();
		entityManager.remove(userdto);
		transaction.commit();
	}
	public void update(User_dto dto)
	{
		transaction.begin();
		entityManager.merge(dto);
		transaction.commit();
	}
	
}

