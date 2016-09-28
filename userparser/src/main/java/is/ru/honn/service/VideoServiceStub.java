package is.ru.honn.service;

import is.ru.honn.domain.User;
import is.ru.honn.domain.Video;
import is.ru.honn.service.UserService;


import java.util.ArrayList;
import java.util.List;

import static is.ru.honn.service.UserService.users;


/**
 * Created by Laufey on 28/09/16.
 */
public class VideoServiceStub implements VideoService{

    public Video getVideo(int videoId) {

        for(int i = 0; i < users.size(); i++ )
        {
            User tempUser = users.get(i);

            for(int j = 0; j < tempUser.videos.size(); j++ )
            {
                Video tempVideo = tempUser.videos.get(j);
                if (tempVideo.videoId ==  videoId) {
                    return tempVideo;
                }
            }
        }
        return null ;
    }

    /**
     *
     * @param userId
     * @return Retuns a list of user videos if the
     */
    public List<Video> getVideosbyUser(int userId) {
        List<Video> userVideos = new ArrayList<Video>();
        for(int i = 0; i < users.size(); i++ )
        {
            User tempUser = users.get(i);
            if (tempUser.userId ==  userId) {
                return tempUser.videos;
            }
        }
        return userVideos;
    }

    public int addVideo(Video video, int userId) throws ServiceException {
        for(int i = 0; i < users.size(); i++ )
        {
            User tempUser = users.get(i);
            if (tempUser.userId ==  userId) {
                tempUser.videos.add(video);
                return video.getVideoId();
            }
        }
        throw new ServiceException();
    }

}
