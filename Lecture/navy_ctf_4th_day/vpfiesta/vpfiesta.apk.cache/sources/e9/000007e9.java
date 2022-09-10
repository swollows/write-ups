package com.ctf.vpfiesta;

import android.app.Activity;
import android.content.Context;
import android.os.Build;
import android.os.Process;
import android.provider.Settings;
import android.text.TextUtils;
import java.io.BufferedReader;
import java.io.File;
import java.io.InputStreamReader;
import java.net.NetworkInterface;
import java.util.Collections;
import java.util.Enumeration;
import java.util.Iterator;

/* renamed from: com.ctf.vpfiesta.a */
/* loaded from: classes.dex */
public class ActivityC0433a extends Activity {
    public static void check(Context context) {
        if (adb_enabled(context) || isDevMode(context) || root() || testkeys() || superusercheck() || vpn() || httpproxy()) {
            Process.killProcess(Process.myPid());
        }
    }

    public static boolean adb_enabled(Context context) {
        try {
            return Settings.Secure.getInt(context.getContentResolver(), "adb_enabled", 0) > 0;
        } catch (Exception unused) {
            return false;
        }
    }

    public static boolean isDevMode(Context context) {
        System.exit(0);
        return Build.VERSION.SDK_INT >= 17 && Settings.Secure.getInt(context.getContentResolver(), "development_settings_enabled", 0) != 0;
    }

    public static boolean root() {
        String[] strArr = {"/system/app/Superuser.apk", "/sbin/su", "/system/bin/su", "/system/xbin/su", "/data/local/xbin/su", "/data/local/bin/su", "/system/sd/xbin/su", "/system/bin/failsafe/su", "/data/local/su", "/su/bin/su"};
        for (int i = 0; i < 10; i++) {
            if (new File(strArr[i]).exists()) {
                return true;
            }
        }
        return new BufferedReader(new InputStreamReader(Runtime.getRuntime().exec(new String[]{"/system/xbin/which", "su"}).getInputStream())).readLine() != null;
    }

    public static boolean testkeys() {
        System.out.println(Build.TAGS);
        return Build.TAGS != null && Build.TAGS.contains("test-keys");
    }

    public static boolean superusercheck() {
        try {
            return new File("system/app/Spuseruser.apk").exists();
        } catch (Exception unused) {
            return false;
        }
    }

    public static boolean httpproxy() {
        if (Build.VERSION.SDK_INT >= 14) {
            try {
                String property = System.getProperty("http.proxyHost");
                System.out.println(property);
                String property2 = System.getProperty("http.proxyPort");
                if (property2 == null) {
                    property2 = "-1";
                }
                return !TextUtils.isEmpty(property) && Integer.parseInt(property2) != -1;
            } catch (Exception e) {
                e.printStackTrace();
            }
        }
        return false;
    }

    public static boolean vpn() {
        try {
            Enumeration<NetworkInterface> networkInterfaces = NetworkInterface.getNetworkInterfaces();
            if (networkInterfaces != null) {
                Iterator it = Collections.list(networkInterfaces).iterator();
                while (it.hasNext()) {
                    NetworkInterface networkInterface = (NetworkInterface) it.next();
                    if (networkInterface.isUp() && networkInterface.getInterfaceAddresses().size() != 0) {
                        if ("tun0".equals(networkInterface.getName())) {
                            return true;
                        }
                        return "ppp0".equals(networkInterface.getName());
                    }
                }
                return false;
            }
        } catch (Throwable th) {
            th.printStackTrace();
        }
        return false;
    }

    /* renamed from: x */
    public static String m2x(String str, int i) {
        String str2 = "";
        for (int i2 = 0; i2 < str.length(); i2++) {
            str2 = str2 + Character.toString((char) (str.charAt(i2) ^ i));
        }
        return str2;
    }
}