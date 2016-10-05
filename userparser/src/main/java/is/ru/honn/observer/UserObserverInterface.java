package is.ru.honn.observer;
import is.ru.honn.domain.User;


/**
 * Created by Ingthor on 5.10.2016.
 */
public interface UserObserverInterface {

    public void AddObserver(Observer ob);
    public void DeleteObserver(Observer ob);
    public void NotifyUsers(User user);
}
