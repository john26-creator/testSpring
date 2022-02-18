package com.automata.testing.framework.post.repository;

import org.springframework.data.repository.CrudRepository;

import com.automata.testing.framework.post.model.UserEntity;

public interface IUserRepository extends CrudRepository<UserEntity, Integer> {

}
