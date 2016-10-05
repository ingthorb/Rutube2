package is.ru.honn.observer;

import is.ru.honn.domain.User;


/**
 * Created by Ingthor on 5.10.2016.
 */

public class ObserverUsers extends Observer{
    @Override
    public void update(User us) {
        //Print out the information
        System.out.print("A new User has been added, the information about him is below: \n" +
                         "Name: "+ us.getFirstName() + " " + us.getLastName() + ",\n" +
                         "Email: " + us.getEmail() + ",\n" +
                         "Display Name: " + us.getDisplayName() + ",\n" +
                         "Birthday: " + us.getBirthDate());
    }
}


