package ministudio.com.a_chat;

import android.app.Application;

import com.parse.Parse;

/**
 * Created by elandy on 2/5/16.
 */
public class App extends Application {

    @Override
    public void onCreate() {
        super.onCreate();
        // [Optional] Power your app with Local Datastore. For more info, go to
// https://parse.com/docs/android/guide#local-datastore
        Parse.enableLocalDatastore(this);

        Parse.initialize(this);
    }
}
