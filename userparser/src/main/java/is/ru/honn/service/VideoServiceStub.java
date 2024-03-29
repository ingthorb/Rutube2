package is.ru.honn.service;
import is.ru.honn.domain.User;
import is.ru.honn.domain.Video;
import java.util.ArrayList;
import java.util.List;
    import static is.ru.honn.service.UserService.users;


/**
 * Implements getVideo to get a specific video,
 * Enables the user to get videos from a specific user and
 * add a video to his list
 */

public class VideoServiceStub implements VideoService{

    /***
     * Gets a video from the user with the given videoId
     * Run through the list of users and their videos to find the specific one
     * @param videoId the id of the video requested
     * @returns the video if found else null
     */
    public Video getVideo(int videoId) {

        for(int i = 0; i < users.size(); i++ )
        {
            User tempUser = users.get(i);
            for(int j = 0; j < tempUser.getVideos().size(); j++ )
            {
                Video tempVideo = tempUser.getVideos().get(j);
                if (tempVideo.getVideoId() ==  videoId) {
                    return tempVideo;
                }
            }
        }
        return null;
    }

    /**
     * Run through the list of users to find the right user.
     * Then return the list of videos the user owns.
     * @param userId
     * @return list of videos from the user if the user is found else a empty list
     */
    public List<Video> getVideosbyUser(int userId) {
        List<Video> userVideos = new ArrayList<Video>();
        for(int i = 0; i < users.size(); i++ )
        {
            User tempUser = users.get(i);
            if (tempUser.getUserId() ==  userId) {
                return tempUser.getVideos();
            }
        }
        return userVideos;
    }

    /***
     *  Finding the user with the userId and adding the video to his list
     *  If the user isn't found the function throws a ServiceExceptionx
     * @param video the video that should be added
     * @param userId the id of the user the video should add on to his list
     * @return the video id if successful else throws exception
     * @throws ServiceException if the user isn't found
     */
    public int addVideo(Video video, int userId) throws ServiceException {
        int id = video.getVideoId();
        String title = video.getTitle();
        String src   = video.getSource();
        //Can't be null
        if(id == 0|| title == null || src == null)
        {
            throw new ServiceException("The values aren't valid");
        }
        List<Video> templist = getVideosbyUser(userId);
        templist.add(video);
        for(int i = 0; i < users.size(); i++ )
        {
            User tempUser = users.get(i);
            if (tempUser.getUserId() ==  userId)
            {
                tempUser.setVideos(templist);
                System.out.println("Size of users"+ " " + users.size());
                return video.getVideoId();
            }
        }
        throw new ServiceException("The user doesn't exist");
    }

}
