package impl;

import company.Exception;
import dao.UserDao;
import model.User;
import service.UserService;

public class UserServiceImpl implements UserService {

    UserDao  userDao = new UserDao();

    @Override
    public void addUser(User user) {
        userDao.getUsers().add(user);
    }

    @Override
    public User findById(int id) {
        User user = userDao.getUsers().stream().filter(x -> x.getId()== id).findFirst().orElseThrow(() -> new Exception("Not user with id"+ id));
        return user;
    }

    @Override
    public String deleteUserById(int id) {
        User user = userDao.getUsers().stream().filter(x -> x.getId()== id).findFirst().orElseThrow(() ->new Exception(" Not fount user with id"+ id));
        userDao.getUsers().remove(user);
        return" Successfully deleted"+user;


    }
    @Override
    public void getAllUsers() {
       userDao.getUsers().forEach(System.out::println);

    }

    @Override
    public String toString() {
        return "UserServiceImpl:" +
                "userDao :" + userDao;
    }
}
