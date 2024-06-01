package com.Virtual.Classroom.Virtual.Classrom.Entity;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class AuthRequestEntity  {

    private String userName;
    private String password;
}