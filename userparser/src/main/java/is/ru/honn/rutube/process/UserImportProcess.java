/**
 * TODO : DOCUMENTA BETUR
 */

package is.ru.honn.rutube.process;

import is.ru.honn.domain.User;
import is.ru.honn.reader.*;
import is.ru.honn.service.ServiceException;
import is.ru.honn.service.UserService;
import is.ruframework.process.RuAbstractProcess;
import org.springframework.context.ApplicationContext;
import org.springframework.context.MessageSource;
import org.springframework.context.support.FileSystemXmlApplicationContext;

import java.util.List;
import java.util.Locale;
import java.util.logging.Logger;

/**
 * Created by Laufey on 05/10/16.
 */
public class UserImportProcess extends RuAbstractProcess implements ReadHandler {

    Logger log = Logger.getLogger(this.getClass().getName());
    protected UserService userService;
    Reader reader;
    MessageSource msg;

    /**
     *
     */
    @Override
    public void beforeProcess() {
        log.info(msg.getMessage("beforeProcess", new Object[] {getProcessContext().getProcessName()}, Locale.getDefault()));

        ApplicationContext ctx = new FileSystemXmlApplicationContext("classpath:app.xml");
        userService = (UserService)ctx.getBean("userService");
//        reader = (UserReader)ctx.getBean("UserReader");
//        reader.setReadHandler(this);
        msg = (MessageSource)ctx.getBean("messageSource");

        ReaderFactory factory = new ReaderFactory();
        reader = factory.getReader("userReader");

        reader.setReadHandler(this);

    }

//    public void processContent(User user)
//    {
//        try {
//            userService.addUser(user);
//        } catch (ServiceException e) {
//            e.printStackTrace();
//        }
//    }


    /**
     * Sets the URI to read from and reads
     */
    @Override
    public void startProcess() {
        log.info(msg.getMessage("startprocess", new Object[] {getProcessContext().getProcessName()}, Locale.getDefault()));

        reader.setURI(getProcessContext().getImportURL());

        try {
            reader.read();
        } catch (ReaderException e) {
            log.severe(msg.getMessage("processreaderror", new Object[] {getProcessContext().getProcessName()}, Locale.getDefault()));

            log.severe(e.getMessage());
        }

    }

    /**
     * Prints out the users
     */
    @Override
    public void afterProcess() {
        log.info(msg.getMessage("afterProcess", new Object[] {getProcessContext().getProcessName()}, Locale.getDefault()));

        List<User> col = userService.getUsers();
        for (User user: col)
        {
            System.out.println(user);
        }
    }

    /**
     * Funtion that takes one object, converts it to User and adds the User
     * @param count ???
     * @param object object that keeps the user data
     */
    @Override
    public void read(int count, Object object) {
        User user = (User)object;

        try {
            userService.addUser(user);
        } catch (ServiceException e) {
            log.severe("Adding user failed");
            log.severe(e.getMessage());
        }

    }
}
