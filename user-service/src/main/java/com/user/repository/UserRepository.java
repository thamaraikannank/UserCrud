package com.user.repository;

import java.util.List;
import java.util.Optional;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.user.model.User;

@Repository
public interface UserRepository extends CrudRepository<User, Long> {

	List<User> findByEmail(String email);

	Optional<User> findById(long userId);

}
