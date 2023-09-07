package ru.yandex.practicum.catsgram.service;

import org.springframework.stereotype.Service;
import ru.yandex.practicum.catsgram.exception.InvalidEmailException;
import ru.yandex.practicum.catsgram.exception.UserAlreadyExistException;
import ru.yandex.practicum.catsgram.model.User;

import java.util.*;

@Service
public class UserService {

    private final Map<String, User> userMap = new HashMap<>();

    public List<User> getAllUsers() {
        return new ArrayList<>(userMap.values());
    }

    public User createUser(User user) {

        if (userMap.containsKey(user.getEmail())) {
            throw new UserAlreadyExistException("Пользователь с таким " + user.getEmail() + " уже существует");
        }

        if (user.getEmail() == null || user.getEmail().isEmpty()) {
            throw new InvalidEmailException("Отсутствует email");
        }

        userMap.put(user.getEmail(), user);
        return user;
    }

    public User updateUser(User user) {
        if (user.getEmail().isEmpty()) {
            throw new InvalidEmailException("Отсутствует email");
        }
        userMap.put(user.getEmail(), user);
        return user;
    }

    public User findUserByEmail(String email) {
        if (email == null) {
            return null;
        }
        return userMap.get(email);
    }


}
