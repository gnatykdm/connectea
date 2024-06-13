package com.connect.connect.model.service.user;

import com.connect.connect.model.entity.User;
import jakarta.persistence.criteria.CriteriaBuilder;

import java.util.List;
import java.util.Optional;

public interface IUserService {
    void createUser(User user);

    void updateUser(User user);

    void deleteUserById(Integer userId);

    User getUserById(Integer userId);

    User getUserByUsername(String username);

    List<User> getAllUsers();

    boolean loginUserValidation(String userName, String userPassword);

    Optional<Integer> getUserIdByUsername(String username);
}
