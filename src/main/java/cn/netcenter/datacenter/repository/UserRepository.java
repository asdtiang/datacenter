package cn.netcenter.datacenter.repository;

import org.springframework.data.repository.CrudRepository;

import cn.netcenter.datacenter.entity.User;

public interface UserRepository   extends CrudRepository<User,Integer>{
}
