package is.ru.honn.service;

import is.ru.honn.domain.Video;

import java.util.List;

/**
 *TODO:Document
 */
public interface VideoService
{
    Video getVideo(int videoId);
    List<Video> getVideosbyUser(int userId);
    int addVideo(Video video, int userId) throws ServiceException;
}
