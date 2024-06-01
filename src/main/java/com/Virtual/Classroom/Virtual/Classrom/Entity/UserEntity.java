package com.Virtual.Classroom.Virtual.Classrom.Entity;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.*;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Entity
@Table(name = "details")
public class UserEntity {
    @Id
    private int id;
    private String username;
    private String password;
    private String role; // Instructor/Student
    private String userType; // Add this line
}
