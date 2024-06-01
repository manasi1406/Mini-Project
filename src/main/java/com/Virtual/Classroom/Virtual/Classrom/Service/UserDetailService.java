package com.Virtual.Classroom.Virtual.Classrom.Service;

import com.Virtual.Classroom.Virtual.Classrom.Entity.UserEntity;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UsernameNotFoundException;

import java.util.List;

public interface UserDetailService{
    UserDetails loadUserByUsername(String username);

    UserEntity getUserByUsername(String username);
    List<UserEntity> getInstructors();
    List<UserEntity> getStudents();
}
