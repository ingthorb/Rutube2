package is.ru.honn.reader;

/**
 * TODO:Document
 */
public interface Reader {
     Object read() throws ReaderException;
     Object parse(String content);
     void setURI(String URI);
     void setReadHandler(ReadHandler readHandler);
}
