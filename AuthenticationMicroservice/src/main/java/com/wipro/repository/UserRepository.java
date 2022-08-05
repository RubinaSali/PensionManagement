package com.wipro.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.wipro.model.UserRegister;

@Repository
public interface UserRepository extends JpaRepository<UserRegister, Integer> {

	UserRegister findByUserNameAndPassword(String username, String password);

}
