import is.ru.honn.domain.User;
import is.ru.honn.service.ServiceException;
import is.ru.honn.service.VideoServiceStub;
import is.ru.honn.domain.Video;
import org.junit.Before;
import org.junit.Test;

import static is.ru.honn.service.UserService.users;
import static org.junit.Assert.*;
/**
 * Class to test the VideoService and VideoServiceStub
 */
public class TestVideoService extends VideoServiceStub{

    VideoServiceStub test = new VideoServiceStub();
    /**
     *  Add the user into the list so it isn't empty
     */
    @Before
    public void Setup()
    {
        User user = new User(1,"Laufey","Gudmundsdottir","lubbbacool@hotmail.com","lubba","1994-02-21");
        users.add(user);
    }

    /**
     * Add to see if the user can sucessfully add a video
     * Then test to see if the Id,Title and Source are correct
     */
    @Test
    public void addVideo()
    {
        //Add a video with userId,titleSrc
        Video vid = new Video(2,"lol","funny","youtube.com","Fun",null);
        try
        {
            test.addVideo(vid,1);
        }
        catch (ServiceException ex)
        {

        }
        Video temp = test.getVideo(2);
        assertEquals(2, temp.getVideoId());
        assertEquals("lol", temp.getTitle());
        assertEquals("youtube.com",temp.getSource());
    }

    /**
     * Test to see what happens when adding a video fials
     * Returns a ServiceException
     */
    @Test
    public void addVideoFail()
    {
        Video vid = new Video(0,null,null,null,null,null);
        try
        {
            test.addVideo(vid,2);
        }
        catch (ServiceException ex)
        {
            assertEquals("The values aren't valid",ex.getMessage());
        }
    }

    /**
     * Test to see if getting a video that doesn't exist fails
     * Should return null
     */
    @Test
    public void getVideo()
    {
       Video temp =  test.getVideo(10);
        assertEquals(null, temp);
    }
}
