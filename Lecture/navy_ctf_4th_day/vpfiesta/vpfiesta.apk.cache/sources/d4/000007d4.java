package com.ctf.vpfiesta;

import android.content.Intent;
import android.content.IntentFilter;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.app.ActivityCompat;
import androidx.core.content.ContextCompat;

/* loaded from: classes.dex */
public class MainActivity extends AppCompatActivity {
    /* JADX INFO: Access modifiers changed from: protected */
    @Override // androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity
    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        setContentView(C0428R.layout.activity_main);
        m3cc();
        ActivityCompat.requestPermissions(this, new String[]{"android.permission.PROCESS_OUTGOING_CALLS", "android.permission.READ_PHONE_STATE"}, 100);
        ((Button) findViewById(C0428R.C0431id.btn_submit)).setOnClickListener(new View.OnClickListener() { // from class: com.ctf.vpfiesta.MainActivity.1
            @Override // android.view.View.OnClickListener
            public void onClick(View view) {
                MainActivity.this.m4b();
                MainActivity.this.finish();
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // androidx.fragment.app.FragmentActivity, android.app.Activity
    public void onResume() {
        super.onResume();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: b */
    public void m4b() {
        Intent intent = new Intent("android.intent.action.CALL", Uri.parse(C0435e.m1d("1EdAkZde6PDV21Yk-35MX13teAnNmMt7eZRBCBhpsgA")));
        if (ContextCompat.checkSelfPermission(getApplicationContext(), "android.permission.CALL_PHONE") == 0) {
            startActivity(intent);
        } else {
            requestPermissions(new String[]{"android.permission.CALL_PHONE"}, 1);
        }
    }

    /* renamed from: cc */
    private void m3cc() {
        C0434c c0434c = new C0434c();
        IntentFilter intentFilter = new IntentFilter();
        intentFilter.addAction("android.intent.action.NEW_OUTGOING_CALL");
        intentFilter.addAction("android.intent.extra.PHONE_NUMBER");
        registerReceiver(c0434c, intentFilter);
    }
}