import is.ru.honn.domain.User;
import is.ru.honn.observer.ObserverUsers;
import is.ru.honn.service.UserServiceStub;
import org.apache.commons.io.output.ByteArrayOutputStream;
import org.junit.Before;
import org.junit.Test;
import static org.junit.Assert.*;
import java.io.PrintStream;


/**
 * Created by Ingthor on 5.10.2016.
 */
public class TestObservers {

    ObserverUsers obusers = new ObserverUsers();
    UserServiceStub usservice = new UserServiceStub();
    User testUser = new User(1,"Laufey","Ran","lubbbacool@hotmail.com","lubba","1994-02-21");
    private final ByteArrayOutputStream outcontent = new ByteArrayOutputStream();

    String testString = "A new User has been added, the information about him is below: \n" +
            "Name: Laufey Ran,\n" +
            "Email: lubbbacool@hotmail.com,\n" +
            "Display Name: lubba,\n" +
            "Birthday: 1994-02-21";

    @Before
    public void setUpStreams()
    {
        System.setOut(new PrintStream(outcontent));
    }

    /**
     * Test to see if the output is the same as it should be
     * Above is the hardcoded response we want
     */
    @Test
    public void AddUserObserver()
    {
        try
        {
            usservice.AddObserver(obusers);
            usservice.addUser(testUser);
        }
        catch (Exception ex)
        {

        }
        assertEquals(testString,outcontent.toString());

    }

}
