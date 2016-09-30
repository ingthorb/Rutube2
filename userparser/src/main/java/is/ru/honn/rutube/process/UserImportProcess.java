package is.ru.honn.rutube.process;

import is.ru.honn.reader.ReadHandler;
import is.ru.honn.reader.Reader;
import is.ru.honn.reader.UserReader;
import is.ru.honn.service.UserServiceStub;
import is.ruframework.process.RuAbstractProcess;
import is.ru.honn.domain.User;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.FileSystemXmlApplicationContext;

import java.util.List;

/**
 * TODO: Document
 */
public class UserImportProcess extends RuAbstractProcess implements ReadHandler {
    //Use spring framework to get the UserSerivce and add to the service
    //Get the userservice and add a user?
    //hafa bæði á ensku og íslensku?

    //þurfum bara að na í userreader þar sem hann kallar á videoreader
    UserReader userread;
    Reader reader;
    //hann er með service fyrir 1 service
    //þurfum við ekki 2?
    UserServiceStub userstub;
    //Tekur inn lista af users og video þeirra
    //byrjar á að fá user með öllum attributes
    //þar seinast er listinn af videoum sem þú færð með usernum
    //Notar reader til að lesa þetta inn og færð hvað tilbaka?
    //færð eh tilbaka og setur það inn í adduser

    @Override
    public void read(int count, Object object) {
        //What should we do hereÐ
    }
    @Override
    public void  beforeProcess()
   {
       ApplicationContext ctx = new FileSystemXmlApplicationContext("classpath:reader.xml");
       userstub = (UserServiceStub)ctx.getBean("UserService");

       userread = (UserReader)ctx.getBean("userReader");
        //Copy paste ur lab 4 abstract factory

       //Reader factory extendar abstract


      // userread.setReadHandler(this);
       //Get the url
       //Send it to the reader

       //  reader = (FeedReader)ctx.getBean("feedReader");

   }

    @Override
   public void startProcess()
    {
       /* try
        {
            reader.read(getProcessContext().getImportURL());
        }
        catch (FeedException e)
        {
            reader.read
        }*/

   }
    @Override
   public void afterProcess()
   {
       //print out in english or icelandic

       List<User> user = userstub.getUsers();
       for(int i = 0;  i < user.size(); i++)
       {
           System.out.println(user);
       }
   }

}
