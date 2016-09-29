package is.ru.honn.reader;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.FileSystemXmlApplicationContext;

/**
 * Created by Laufey on 28/09/16.
 */
public class ReaderFactory {

    Reader readerR ;

    public Reader reader(String reader){
        ApplicationContext ctx = new FileSystemXmlApplicationContext("classpath:reader.xml");
        readerR = (Reader)ctx.getBean(reader);
        //readerR.setReadHandler();
        return readerR;
    }
}
