import is.ru.honn.domain.User;
import is.ru.honn.service.ServiceException;
import is.ru.honn.service.VideoServiceStub;
import is.ru.honn.domain.Video;
import is.ru.honn.service.VideoService;
import is.ru.honn.service.VideoServiceStub;

import org.junit.Before;
import org.junit.Test;

import java.util.List;
import static is.ru.honn.service.UserService.users;
import static org.junit.Assert.*;
/**
 * Created by Ingthor on 29.9.2016.
 */
public class TestVideoService extends VideoServiceStub{

    VideoServiceStub test = new VideoServiceStub();

    @Before
    public void Setup()
    {
        User user = new User(1,"Laufey","Gudmundsdottir","lubbbacool@hotmail.com","lubba","1994-02-21");
        users.add(user);
    }

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
    @Test
    public void getVideo()
    {
       Video temp =  test.getVideo(10);
        assertEquals(null, temp);
    }
}
