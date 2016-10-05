package is.ru.honn.service;

import java.util.ArrayList;
import java.util.List;
import java.util.Observer;

/**
 * Created by Ingthor on 5.10.2016.
 */
public class ObserveUsers implements UserObserverInterface {

    private List<Observer> observers = new ArrayList<Observer>();
    public void AddObserver(Observer ob)
    {
        observers.add(ob);
    }
    public void DeleteObserver(Observer ob)
    {
        int i = observers.indexOf(ob);
        if(i>=0)
        {
            observers.remove(i);
        }
    }
    public void NotifyUsers()
    {
        for(int i = 0; i < observers.size(); i++)
        {
            //update or notify?
            Observer observ =  observers.get(i);
            //Let know user has been added
            observ.notify();
        }
    }
}
