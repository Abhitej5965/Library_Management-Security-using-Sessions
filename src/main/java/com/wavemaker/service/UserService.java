package com.wavemaker.service;

import com.wavemaker.dao.UserDao;
import com.wavemaker.daoImpl.UserDaoImpl;
import com.wavemaker.model.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.util.List;

@Service
public class UserService {
    @Autowired
    private UserDao userDaoImpl;


    public String userRegister(User user) {
        return userDaoImpl.userRegister(user);
    }

    public List<User> getAllUsers() {
        return userDaoImpl.getAllUsers();
    }

    public String addBooksToUsers(int bookId, int userId) {
        return userDaoImpl.addBooksToUsers(bookId, userId);
    }

    public User getUserById(int userId) {
        return userDaoImpl.getUserById(userId);
    }

    public void logout(HttpServletRequest request, HttpServletResponse response){
        userDaoImpl.logout(request,response);
    }
}


