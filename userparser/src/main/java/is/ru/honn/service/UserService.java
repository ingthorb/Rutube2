package is.ru.honn.service;

import is.ru.honn.domain.User;

import java.util.ArrayList;
import java.util.List;

/**
 *TODO:Document
 */
public interface UserService
{
    List<User> users = new ArrayList<User>();
    int addUser(User user) throws is.ru.honn.service.ServiceException;
    List<User> getUsers();
    User getUser(int userid);
}