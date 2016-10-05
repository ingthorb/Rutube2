package is.ru.honn.service;


import java.util.ArrayList;
import java.util.List;
import java.util.Observer;


/**
 * Created by Ingthor on 5.10.2016.
 */
public interface UserObserverInterface {

    public void AddObserver(Observer ob);
    public void DeleteObserver(Observer ob);
    public void NotifyUsers();
}
