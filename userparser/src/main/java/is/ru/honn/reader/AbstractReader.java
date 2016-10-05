package is.ru.honn.reader;

import is.ru.honn.domain.User;
import org.json.simple.JSONObject;

import java.net.URISyntaxException;
import java.net.URL;
import java.util.List;
import org.apache.commons.validator.routines.UrlValidator;

/**
 * Created by Laufey on 28/09/16.
 */
public abstract class AbstractReader implements Reader {

    private String URI;
    private ReadHandler readHandler;
    public abstract Object parse(String content);

    public static void main(String args[]){

        VideoReader videoReader = new VideoReader();
        UserReader userReader = new UserReader(videoReader);
        ClientRequest clientRequest = new ClientRequest();
        String content = clientRequest.getRequest("http://mockaroo.com/f13b8200/download?count=1&key=e79a3650");
        List<User> users = (List<User>)userReader.parse(content);
    }

    @Override
    public Object read() throws ReaderException{

        if( readHandler != null )
        {
            ClientRequest clientRequest = new ClientRequest();

            UrlValidator  url = new UrlValidator();
            if(!url.isValid(URI)){
                throw new ReaderException();
            }
//Kalla á read hitt fallið 
            return parse(clientRequest.getRequest(URI));
        }
        throw new ReaderException();
    }

    @Override
    public void setURI(String URI) {

        this.URI = URI;
    }

    @Override
    public void setReadHandler(ReadHandler readHandler) {
        this.readHandler = readHandler;
    }

    /**
     *
     * @param jParent Json parent containing an integer field.
     * @param name name of the integer field
     * @return int value of the json int in the jParent object.
     */
    protected static int getInt(JSONObject jParent, String name)
    {
        if(jParent == null)
            return 0;
        Long value = (Long)jParent.get(name);
        if(value == null)
            return 0;
        return value.intValue();
    }
}
