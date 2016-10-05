package is.ru.honn.observer;

import is.ru.honn.domain.User;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by Ingthor on 5.10.2016.
 */
public class ObserverAbstract implements UserObserverInterface{
    List<Observer> observers = new ArrayList<Observer>();

    @Override
    public void AddObserver(Observer ob) {

        observers.add(ob);
    }

    @Override
    public void DeleteObserver(Observer ob) {
        int i = observers.indexOf(ob);
        if (i >= 0){
            observers.remove(i);
        }
    }

    @Override
    public void NotifyUsers(User user) {
        for(Observer ob: observers)
        {
            ob.update(user);
        }
    }
}
