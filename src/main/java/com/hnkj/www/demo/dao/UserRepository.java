package com.hnkj.www.demo.dao;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.hnkj.www.demo.bean.UserPO;

@Repository
public interface UserRepository extends CrudRepository<UserPO, Long> {

}
