package cn.netcenter.datacenter.service.impl;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import cn.netcenter.datacenter.service.ShareService;

@Service
public class ShareServiceImpl implements ShareService {

	@PersistenceContext
	private EntityManager entityManager;

	@Transactional
	public void save(Object object) {
		try {
			entityManager.persist(object);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	@Transactional
	public void delete(Object object) {
		entityManager.remove(entityManager.merge(object));
	}

	@Transactional
	public void update(Object object) {
		entityManager.merge(object);

	}

	public <T> T find(Class<T> classType, Integer id) {
		return entityManager.find(classType, id);
	}

}
