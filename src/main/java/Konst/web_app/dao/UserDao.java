package Konst.web_app.dao;

import Konst.web_app.model.User;

import java.util.List;

public interface UserDao {

    List<User> showAllUsers();

    User showUserById(int id);

    void saveUser(User user);

    void updateUser(int id, User user);

    void deleteUserById(int id);
}
