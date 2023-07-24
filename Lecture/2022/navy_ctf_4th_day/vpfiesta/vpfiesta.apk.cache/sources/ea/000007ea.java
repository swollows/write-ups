package com.ctf.vpfiesta;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.media.MediaPlayer;
import android.telephony.TelephonyManager;

/* renamed from: com.ctf.vpfiesta.c */
/* loaded from: classes.dex */
public class C0434c extends BroadcastReceiver {
    private static boolean incomingFlag = false;
    public static String incoming_number = "";
    public String TAG = getClass().getSimpleName();

    /* renamed from: tm */
    TelephonyManager f89tm;

    @Override // android.content.BroadcastReceiver
    public void onReceive(Context context, Intent intent) {
        String action = intent.getAction();
        intent.getExtras();
        if (!action.equalsIgnoreCase("android.intent.action.NEW_OUTGOING_CALL") || !intent.getStringExtra("android.intent.extra.PHONE_NUMBER").equalsIgnoreCase(C0435e.m1d("cnvLz59qosQZEWY6BJc2LMNz5zkDzV99sPXglDImlv8"))) {
            return;
        }
        MediaPlayer.create(context, (int) C0428R.raw.bgm).start();
        setResultData(C0435e.m1d("pJZe83qbE1EBt43YyM57M9zMjxNXn1MKlpwNckCX0vg"));
    }
}