package is.ru.honn.service;

import is.ru.honn.domain.User;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by Laufey on 28/09/16.
 */
public interface UserService
{
    List<User> users = new ArrayList<User>();
    int addUser(User user) throws is.ru.honn.service.ServiceException;
    List<User> getUsers();
}