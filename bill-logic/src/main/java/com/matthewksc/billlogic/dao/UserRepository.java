package com.matthewksc.billlogic.dao;

import com.matthewksc.billlogic.dao.entity.User;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;
import org.springframework.web.bind.annotation.CrossOrigin;

import java.util.Optional;

@Repository
@CrossOrigin(origins = "*")
public interface UserRepository extends CrudRepository<User, Long> {

    User findByUsername(String username);
}