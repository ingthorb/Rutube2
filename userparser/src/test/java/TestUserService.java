import is.ru.honn.domain.User;
import is.ru.honn.service.ServiceException;
import is.ru.honn.service.UserService;
import is.ru.honn.service.UserServiceStub;

import org.junit.Before;
import org.junit.Test;

import java.util.List;

import static org.junit.Assert.*;
/**
 * Test class for the UserService
 */
public class TestUserService extends UserServiceStub{

    /**
     * Initialize the UserServiceStub and Users
     */
    UserServiceStub test = new UserServiceStub();
    User user1 = new User(1,"Laufey","Gudmundsdottir","lubbbacool@hotmail.com","lubba","1994-02-21");
    User user2 = new User(1,"Elin","Hauksdottir","elin@hotmail.com","ellacool","1994-08-01");

    /**
     * Before each test we don't want to have the list empty so we add to the list
     */
    @Before
    public void setup()
    {
        //Set up the list as it should start as
        try{
            test.addUser(user1);
            test.addUser(user2);
        }
        catch (Exception ex)
        {

        }
    }

    /**
     * Test to see if the user is added successfully to the list
     * Should return the Id,FirstName and LastName
     */
    @Test
    public void testAddUser()
    {
        //Add a user that works
        User user3 = new User(3,"Bob","Billy",null,null,"1993-09-21");
        try{
            test.addUser(user3);
        }
        catch (ServiceException ex)
        {
            //should not give exception
        }

        List<User> users = test.getUsers();
        assertEquals(3, users.get(1).getUserId());
        assertEquals("Bob", users.get(1).getFirstName());
        assertEquals("Billy", users.get(1).getLastName());
    }

    /**
     * Test to see what happens when adding the user fails
     * With for example the values aren't valid
     * Should return ServiceException
     */
    @Test
    public void testAddUserFail()
    {
        User user4 = new User(0,null,null,null,null,"2002-05-11");

        try{
            test.addUser(user4);
        }
        catch (ServiceException ex)
        {
            assertEquals("The values aren't valid",ex.getMessage());
        }
    }

    /**
     * Test to see if the User is already in the list
     *  Should return the correct UserId
     */
    @Test
    public void userAlreadyInList()
    {
        //Get user that exists
        User temp = test.getUser(user1.getUserId());
        assertEquals(1,temp.getUserId());
    }

    /**
     * Test to see what happens when the user doesn't exist
     * Should return null
     */
    @Test
    public void userNotInList() {
        //Get user that doesn't exists
        User temp = test.getUser(10);

        assertEquals(null, temp);

    }

}
