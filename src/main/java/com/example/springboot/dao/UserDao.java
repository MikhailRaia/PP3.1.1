package com.example.springboot.dao;

import com.example.springboot.model.User;


import java.util.List;

public interface UserDao {
    List<User> getAllUsers();

    void saveUser(User user);

    User getUserById(int id);

    void editUser(User user);

    void removeUser(int id);
}