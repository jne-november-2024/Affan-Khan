package com.test.restful_web_services;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;
import org.springframework.stereotype.Service;

@Service
public class UserDaoService {

    private static List<User> users = new ArrayList<>();
    private static int usersCount = 10;


    static {
        users.add(new User(++usersCount, "John Doe", LocalDate.of(1990, 1, 15)));
        users.add(new User(++usersCount, "Jane Smith", LocalDate.of(1985, 5, 25)));
        users.add(new User(++usersCount, "Alice Johnson", LocalDate.of(1992, 8, 30)));
        users.add(new User(++usersCount, "Bob Brown", LocalDate.of(1988, 3, 22)));
        users.add(new User(++usersCount, "Charlie Davis", LocalDate.of(1995, 12, 5)));
        users.add(new User(++usersCount, "David White", LocalDate.of(2000, 7, 10)));
        users.add(new User(++usersCount, "Eva Green", LocalDate.of(1987, 4, 17)));
        users.add(new User(++usersCount, "Frank Harris", LocalDate.of(1993, 11, 2)));
        users.add(new User(++usersCount, "Grace Lee", LocalDate.of(1991, 6, 19)));
        users.add(new User(++usersCount, "Henry King", LocalDate.of(1989, 9, 14)));
    }


    public List<User> findAll() {
        return users;
    }


    public User findById(int id) {
        return users.stream()
                .filter(user -> user.getId() == id)
                .findFirst()
                .orElse(null);
    }


    public User save(User user) {

        user.setId(++usersCount);
        users.add(user);
        return user;
    }

    public boolean deleteById(int id) {
        User user = findById(id);
        if (user != null) {
            users.remove(user);
            return true;
        }
        return false;
    }
}
