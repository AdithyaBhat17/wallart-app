package com.example.adithya.wallart;

import android.util.Log;

import com.google.firebase.iid.FirebaseInstanceId;
import com.google.firebase.iid.FirebaseInstanceIdService;

/**
 * Created by Adithya on 2/27/2018.
 */

public class WallArtFirebaseInstanceIdService extends FirebaseInstanceIdService {
    @Override
    public void onTokenRefresh() {
        // Get updated InstanceID token.
        String refreshedToken = FirebaseInstanceId.getInstance().getToken();
        Log.d(WallArtFirebaseInstanceIdService.class.getSimpleName(), "Refreshed token: " + refreshedToken);
    }
}
