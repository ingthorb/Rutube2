package is.ru.honn.domain;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

public class User {


  protected int userId;
  protected String firstName;
  protected String lastName;
  protected String email;
  protected String displayName;
  protected LocalDate birthDate;
  protected List<Video> videos;

  /**
   *
   * @param userId
   * @param firstName
   * @param lastName
   * @param email
   * @param displayName
   * @param birthDate
   */
  public User(int userId, String firstName, String lastName, String email, String displayName, String birthDate) {
    this.userId = userId;
    this.firstName = firstName;
    this.lastName = lastName;
    this.email = email;
    this.displayName = displayName;
    this.birthDate = LocalDate.parse(birthDate);
    videos = new ArrayList<>();
  }

  /**
   *
   * @return
   */
  public int getUserId() {
    return userId;
  }

  /**
   *
   * @param userId
   */
  public void setUserId(int userId) {

    this.userId = userId;
  }

  /**
   *
   * @return
   */
  public String getFirstName() {

    return firstName;
  }

  /**
   *
   * @param firstName
   */
  public void setFirstName(String firstName) {

    this.firstName = firstName;
  }

  /**
   *
   * @return
   */
  public String getLastName() {

    return lastName;
  }

  /**
   *
   * @param lastName
   */
  public void setLastName(String lastName) {

    this.lastName = lastName;
  }

  /**
   *
   * @return
   */
  public String getEmail() {
    return email;
  }

  /**
   *
   * @param email
   */
  public void setEmail(String email) {
    this.email = email;
  }

  /**
   *
   * @return
   */
  public String getDisplayName() {
    return displayName;
  }

  /**
   *
   * @param displayName
   */
  public void setDisplayName(String displayName) {
    this.displayName = displayName;
  }

  /**
   *
   * @return the users birthdate
   */
  public LocalDate getBirthDate() {
    return birthDate;
  }

  /**
   *
   * @param birthDate the users birth date
   */
  public void setBirthDate(LocalDate birthDate) {
    this.birthDate = birthDate;
  }

  /**
   *
   * @return List of videos
   */
  public List<Video> getVideos() {
    return videos;
  }

  /**
   *
   * @param videos
   */
  public void setVideos(List<Video> videos){
    this.videos = videos;
  }
}
