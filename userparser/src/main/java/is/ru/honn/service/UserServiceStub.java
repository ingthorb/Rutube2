package is.ru.honn.service;

import is.ru.honn.domain.User;
import java.util.ArrayList;
import java.util.List;

/**
 * Enables the user to get the list of users and
 * add a user
 */
public class UserServiceStub implements UserService{

    private static List<User> users = new ArrayList<User>();

    /**
     *  Returns a list of users
     * @return a list of users
     */
    public List<User> getUsers() {
        return users;
    }

    /**
     *  Adds a user to the user list
     * @param user
     * @return the user id if successful else throws exception
     * @throws ServiceException
     */
    public int addUser(User user) throws ServiceException {
        try
        {
            users.add(user);
        }
        catch (Exception ex)
        {
            throw new ServiceException();
        }
        return user.getUserId();
    }
}
