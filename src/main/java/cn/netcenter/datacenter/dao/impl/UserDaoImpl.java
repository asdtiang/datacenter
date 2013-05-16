package cn.netcenter.datacenter.dao.impl;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

import org.springframework.stereotype.Repository;

import cn.netcenter.datacenter.dao.UserDao;
import cn.netcenter.datacenter.entity.User;

@Repository
public class UserDaoImpl implements UserDao {

	private EntityManager entityManager;
	
	@PersistenceContext
	public void setEntityManager(EntityManager entityManager) {
		this.entityManager = entityManager;
	}

	public User persist(User user) {
		entityManager.persist(user);
		return user;
	}

}
