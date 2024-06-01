package com.Virtual.Classroom.Virtual.Classrom.ServiceImpl;
import com.Virtual.Classroom.Virtual.Classrom.Entity.UserEntity;
import com.Virtual.Classroom.Virtual.Classrom.Service.UserDetailService;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class UserDetailServiceImpl implements UserDetailService, UserDetailsService {

    @Override
    public UserDetails loadUserByUsername(String username) throws UsernameNotFoundException {

        return null;
    }

    @Override
    public UserEntity getUserByUsername(String username) {
        return null;
    }

    @Override
    public List<UserEntity> getInstructors() {
        return List.of();
    }

    @Override
    public List<UserEntity> getStudents() {
        return List.of();
    }
}
