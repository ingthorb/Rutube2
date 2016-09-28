package is.ru.honn.service;

import is.ru.honn.domain.Video;

import java.util.List;

/**
 * Created by Laufey on 28/09/16.
 */
public interface VideoService
{
    Video getVideo(int videoId);
    List<Video> getVideosbyUser(int userId);
    int addVideo(Video video, int userId) throws ServiceException;
}
