package is.ru.honn.reader;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.FileSystemXmlApplicationContext;

/**
 * TODO:Document
 */
public class ReaderFactory {

    Reader readerR ;

    public Reader getReader(String reader){
        ApplicationContext ctx = new FileSystemXmlApplicationContext("classpath:reader.xml");
        readerR = (Reader)ctx.getBean(reader);
        //readerR.setReadHandler();
        return readerR;
    }
}
