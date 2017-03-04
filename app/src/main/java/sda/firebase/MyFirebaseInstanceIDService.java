package sda.firebase;

import android.util.Log;

import com.google.firebase.iid.FirebaseInstanceId;
import com.google.firebase.iid.FirebaseInstanceIdService;



/**
 * Created by RENT on 2017-03-04.
 */
public class MyFirebaseInstanceIDService extends FirebaseInstanceIdService {


    private static final String TAG = MyFirebaseInstanceIDService.class.getSimpleName();

    @Override
        public void onTokenRefresh() {
            // Get updated InstanceID token.
            String refreshedToken = FirebaseInstanceId.getInstance().getToken();
            Log.d(TAG, "Refreshed token: " + refreshedToken);


        }
}
