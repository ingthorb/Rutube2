package is.ru.honn.domain;

import java.util.List;


public class Video {

  int videoId;
  String title;
  String description;
  String source;
  String videoType;
  List<String> tags;

  public Video(int videoId, String title, String description, String source, String videoType, List<String> tags) {
    this.videoId = videoId;
    this.title = title;
    this.description = description;
    this.source = source;
    this.videoType = videoType;
    this.tags = tags;
  }

  public void addTag(String tag){
    tags.add(tag);
  }
}

