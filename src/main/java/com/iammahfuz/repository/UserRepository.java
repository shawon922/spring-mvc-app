package com.iammahfuz.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.iammahfuz.model.User;

@Repository("userRepository")
public interface UserRepository extends JpaRepository<User, Long> {
	List<User> findAll();
	User findById(int id);
	User findByEmail(String email);
}
