package cn.netcenter.datacenter.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;

import cn.netcenter.datacenter.entity.User;
import cn.netcenter.datacenter.repository.UserRepository;
import cn.netcenter.datacenter.service.UserService;

@Service
@Transactional(propagation = Propagation.SUPPORTS, readOnly = true)
public class UserServiceImpl implements UserService {

	@Autowired
	private UserRepository  userRepository ;
	@Transactional(propagation = Propagation.REQUIRED, readOnly = false)
	public void save(User user) {
		userRepository.save(user);
	}

}
