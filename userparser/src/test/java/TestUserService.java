import is.ru.honn.service.UserServiceStub;

import org.junit.Test;
import static org.junit.Assert.*;
/**
 * Created by Ingthorb on 9/28/2016.
 */
public class TestUserService extends UserServiceStub{


    //@before

    @Test
    public void testAddUser()
    {
        //Add a user that works
    }


    @Test
    public void testAddUserFail()
    {
        //User that fails
    }

    @Test
    public void userAlreadyInList()
    {
        //Get user that exists
    }
    @Test
    public void userNotInList()
    {
        //Get user that doesn't exists
    }

}
