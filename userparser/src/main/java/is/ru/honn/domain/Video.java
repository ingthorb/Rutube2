package is.ru.honn.domain;

import java.util.List;


public class Video {

  protected int videoId;
  protected String title;
  protected String description;
  protected String source;
  protected String videoType;
  protected List<String> tags;

  public Video(int videoId, String title, String description, String source, String videoType, List<String> tags) {
    this.videoId = videoId;
    this.title = title;
    this.description = description;
    this.source = source;
    this.videoType = videoType;
    this.tags = tags;
  }

  public int getVideoId() {
    return videoId;
  }

  public void setVideoId(int videoId) {
    this.videoId = videoId;
  }

  public String getTitle() {
    return title;
  }

  public void setTitle(String title) {
    this.title = title;
  }

  public String getDescription() {
    return description;
  }

  public void setDescription(String description) {
    this.description = description;
  }

  public String getSource() {
    return source;
  }

  public void setSource(String source) {
    this.source = source;
  }

  public String getVideoType() {
    return videoType;
  }

  public void setVideoType(String videoType) {
    this.videoType = videoType;
  }

  public List<String> getTags() {
    return tags;
  }

  public void setTags(List<String> tags) {
    this.tags = tags;
  }

  public void addTag(String tag){
    tags.add(tag);
  }
}

