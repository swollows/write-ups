package com.defensys.androbro;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;

public class Server extends BroadcastReceiver {
    public native void gg(Context context, Intent intent);

    static {
        System.loadLibrary("ragnar");
    }

    public void onReceive(Context context, Intent intent) {
        gg(context, intent);
    }
}
