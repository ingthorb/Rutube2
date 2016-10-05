package is.ru.honn.service;

import is.ru.honn.domain.User;
import java.util.ArrayList;
import java.util.List;

/**
 * Enables the user to get the list of users and
 * add a user, implements the UserService functions
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
    public int addUser(User user) throws ServiceException
    {
        //For the tests
        int id = user.getUserId();
        String firstn = user.getFirstName();
        String lastn  = user.getLastName();

        if(id == 0|| firstn == null|| lastn == null)
        {
            throw new ServiceException("The values aren't valid");
        }

        //Checking if the user is already in the list
        User tempuser = getUser(id);
        if(tempuser != null)
        {
            //He exists
            throw new ServiceException("The user is already in the list");
        }

        try
        {
            users.add(user);
        }
        catch (Exception ex)
        {
            throw new ServiceException("Failed to add user");
        }
        return user.getUserId();
    }

    /**
     * Function that returns a user if he exists
     * else returns exception
     * @param userid
     * @return the user or exception
     */
    public User getUser(int userid)
    {
        for(int i = 0; i < users.size(); i++)
        {
            User tempuser = users.get(i);
            if(userid == tempuser.getUserId())
            {
                return tempuser;
            }
        }
        return null;
    }
}
