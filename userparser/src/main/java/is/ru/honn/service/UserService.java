package is.ru.honn.service;

import is.ru.honn.domain.User;
import is.ru.honn.observer.UserObserverInterface;

import java.util.ArrayList;
import java.util.List;
import java.util.Observer;

/**
 * Initializes the User and is implemented in UserServiceStub
 * Extends the UserObserverInterface so that we can notify when a new user is added
 */
public interface UserService
{
    List<User> users = new ArrayList<User>();
    int addUser(User user) throws is.ru.honn.service.ServiceException;
    List<User> getUsers();
    User getUser(int userid);
}