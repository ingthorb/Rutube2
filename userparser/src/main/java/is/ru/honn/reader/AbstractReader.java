package is.ru.honn.reader;

import is.ru.honn.domain.User;
import org.json.simple.JSONObject;

import java.util.List;

/**
 * Created by Laufey on 28/09/16.
 */
public class AbstractReader {
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

    public static void main(String args[]){

        VideoReader videoReader = new VideoReader();
        UserReader userReader = new UserReader(videoReader);
        ClientRequest clientRequest = new ClientRequest();
        String content = clientRequest.getRequest("http://mockaroo.com/f13b8200/download?count=1&key=e79a3650");
        List<User> users = (List<User>)userReader.parse(content);

    }

}
