package is.ru.honn.domain;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

/**
 * Class for each User
 */
public class User {


  protected int userId;
  protected String firstName;
  protected String lastName;
  protected String email;
  protected String displayName;
  protected LocalDate birthDate;
  protected List<Video> videos;

  /**
   * Constructor for User and initializes the variables
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
   * Getter and setters of the variables that the User has
   *
   */

  public int getUserId() {
    return userId;
  }


  public void setUserId(int userId) {

    this.userId = userId;
  }


  public String getFirstName() {

    return firstName;
  }


  public void setFirstName(String firstName) {

    this.firstName = firstName;
  }


  public String getLastName() {

    return lastName;
  }


  public void setLastName(String lastName) {

    this.lastName = lastName;
  }


  public String getEmail() {
    return email;
  }


  public void setEmail(String email) {
    this.email = email;
  }


  public String getDisplayName() {
    return displayName;
  }


  public void setDisplayName(String displayName) {
    this.displayName = displayName;
  }


  public LocalDate getBirthDate() {
    return birthDate;
  }

  public void setBirthDate(LocalDate birthDate) {
    this.birthDate = birthDate;
  }

  public List<Video> getVideos() {
    return videos;
  }

  public void setVideos(List<Video> videos){
    this.videos = videos;
  }
}
