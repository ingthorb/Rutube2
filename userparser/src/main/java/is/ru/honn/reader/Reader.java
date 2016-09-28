package is.ru.honn.reader;

/**
 * Created by Ingthor on 28.9.2016.
 */
public interface Reader {
     Object read();
     Object parse(String content);
     void setURI(String URI);
     void setReadHandler(ReadHandler readHandler);

}
