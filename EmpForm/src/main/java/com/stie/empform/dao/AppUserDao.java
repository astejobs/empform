package com.stie.empform.dao;

import org.springframework.data.repository.CrudRepository;

import com.stie.empform.model.AppUser;

public interface AppUserDao extends CrudRepository<AppUser, Long> {

	AppUser findByUsername(String username);

}
