package is.ru.honn.service;

import is.ru.honn.domain.User;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by Laufey on 28/09/16.
 */
public class UserServiceStub implements UserService{

    private static List<User> users = new ArrayList<User>();


    public List<User> getUsers() {
        return users;
    }

    public int addUser(User user) throws ServiceException {

        users.add(user);

        return user.userId;
    }
}
