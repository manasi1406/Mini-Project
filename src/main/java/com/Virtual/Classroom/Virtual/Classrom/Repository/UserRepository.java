package com.Virtual.Classroom.Virtual.Classrom.Repository;
import com.Virtual.Classroom.Virtual.Classrom.Entity.UserEntity;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface UserRepository extends JpaRepository<UserEntity, Integer> {

    UserEntity findByUsername(String username);
    List<UserEntity> findByRole(String role); // Updated method name
}







