package com.wavemaker.dao;

import com.wavemaker.model.User;
import org.springframework.transaction.annotation.Transactional;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.util.List;

public interface UserDao {
    String userRegister(User user);

    User validateUser(String username);

    @Transactional
    List<User> getAllUsers();

    User getUserById(int userId);

    String addBooksToUsers(int bookId, int userId);

    void logout(HttpServletRequest request, HttpServletResponse response);
}
