package com.defensys.androbro;

import android.content.Context;
import android.os.Build;
import android.os.Bundle;
import android.util.Log;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.os.EnvironmentCompat;
import androidx.navigation.NavController;
import androidx.navigation.Navigation;
import androidx.navigation.ui.AppBarConfiguration;
import androidx.navigation.ui.NavigationUI;
import com.defensys.androbro.databinding.ActivityMainBinding;
import com.google.android.material.snackbar.Snackbar;
import java.io.BufferedReader;
import java.io.InputStreamReader;

public class MainActivity extends AppCompatActivity {
    private static final String TAG = "MainActivity";
    private AppBarConfiguration appBarConfiguration;
    private ActivityMainBinding binding;

    public native void e();

    public native void z(Context context);

    /* access modifiers changed from: protected */
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        this.binding = ActivityMainBinding.inflate(getLayoutInflater());
        setContentView((View) this.binding.getRoot());
        setSupportActionBar(this.binding.toolbar);
        NavController navController = Navigation.findNavController(this, R.id.nav_host_fragment_content_main);
        this.appBarConfiguration = new AppBarConfiguration.Builder(navController.getGraph()).build();
        NavigationUI.setupActionBarWithNavController((AppCompatActivity) this, navController, this.appBarConfiguration);
        this.binding.fab.setOnClickListener(new View.OnClickListener() {
            public void onClick(View view) {
                ((Snackbar) Snackbar.make(view, (CharSequence) "Replace with your own action", 0).setAnchorView(R.id.fab)).setAction((CharSequence) "Action", (View.OnClickListener) null).show();
            }
        });
        z(this);
    }

    public boolean onCreateOptionsMenu(Menu menu) {
        getMenuInflater().inflate(R.menu.menu_main, menu);
        return true;
    }

    public boolean onOptionsItemSelected(MenuItem item) {
        if (item.getItemId() == R.id.action_settings) {
            return true;
        }
        return super.onOptionsItemSelected(item);
    }

    public boolean onSupportNavigateUp() {
        return NavigationUI.navigateUp(Navigation.findNavController(this, R.id.nav_host_fragment_content_main), this.appBarConfiguration) || super.onSupportNavigateUp();
    }

    public static boolean isEmulator() {
        return Build.FINGERPRINT.startsWith("generic") || Build.FINGERPRINT.startsWith(EnvironmentCompat.MEDIA_UNKNOWN) || Build.MODEL.contains("google_sdk") || Build.MODEL.contains("Emulator") || Build.MODEL.contains("Android SDK built for x86") || Build.MANUFACTURER.contains("Genymotion") || (Build.BRAND.startsWith("generic") && Build.DEVICE.startsWith("generic")) || "google_sdk".equals(Build.PRODUCT);
    }

    public static boolean isRooted() {
        Process process = null;
        try {
            Process process2 = Runtime.getRuntime().exec(new String[]{"/system/bin/which", "su"});
            if (new BufferedReader(new InputStreamReader(process2.getInputStream())).readLine() != null) {
                if (process2 != null) {
                    process2.destroy();
                }
                return true;
            }
            if (process2 != null) {
                process2.destroy();
            }
            return false;
        } catch (Throwable th) {
            if (process != null) {
                process.destroy();
            }
            return false;
        }
    }

    /* access modifiers changed from: protected */
    public void onDestroy() {
        e();
        super.onDestroy();
    }

    static {
        System.loadLibrary("ragnar");
        Log.d(TAG, "Native library 'ragnar' has been successfully loaded.");
    }
}
