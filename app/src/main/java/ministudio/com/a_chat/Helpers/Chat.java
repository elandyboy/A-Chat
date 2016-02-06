package ministudio.com.a_chat.Helpers;

import com.parse.ParseObject;

/**
 * Created by elandy on 2/5/16.
 */
public class Chat extends ParseObject {
    public void setMessage(String message){
        put("message",message);

    }
    public String getMessage(){
        return getString("message");

    }

}
