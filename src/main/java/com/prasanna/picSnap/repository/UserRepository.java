package com.prasanna.picSnap.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.prasanna.picSnap.model.User;
@Repository
public interface UserRepository extends JpaRepository<User, Long> {

}
