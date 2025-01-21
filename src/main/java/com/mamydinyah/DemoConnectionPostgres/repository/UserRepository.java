package com.mamydinyah.DemoConnectionPostgres.repository;

import com.mamydinyah.DemoConnectionPostgres.entity.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface UserRepository extends JpaRepository<User, Integer> {
}
