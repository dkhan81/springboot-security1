package com.dkhan.security1.repository;

import com.dkhan.security1.model.User;
import org.springframework.data.jpa.repository.JpaRepository;

// CRUD 함수를 JpaRepository가 들고 있음.
// @Repository 라는 어노테이션 없어도 loc 되요. 이유는 JpaRepository 를 상속했기 떄문에..
public interface UserRepository extends JpaRepository<User, Integer> {

    // findBy 규칙 -> Username 문법
    // select * from user where username = 1?
    public User findByUsername(String username); // Jpa query method

}
