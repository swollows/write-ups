package com.example.summer;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.os.Bundle;
import android.view.View;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;
import androidx.appcompat.app.AppCompatActivity;
import com.example.summer.databinding.ActivityMainBinding;
import java.util.ArrayList;
import java.util.Arrays;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.StringCompanionObject;
import kotlin.math.MathKt;
import kotlin.text.StringsKt;

/* compiled from: MainActivity.kt */
@Metadata(d1 = {"\u0000J\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0006\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0005\u0018\u00002\u00020\u0001B\u0005¢\u0006\u0002\u0010\u0002J\u0010\u0010\r\u001a\u00020\u000e2\u0006\u0010\u000f\u001a\u00020\u0006H\u0002J\u0010\u0010\u0010\u001a\u00020\u00112\u0006\u0010\u0012\u001a\u00020\u0011H\u0002J\b\u0010\u0013\u001a\u00020\u0014H\u0002J\u0010\u0010\u0015\u001a\u00020\u00142\u0006\u0010\u0007\u001a\u00020\bH\u0002J \u0010\u0016\u001a\u00020\u00142\u0006\u0010\u0017\u001a\u00020\u00112\u0006\u0010\u0018\u001a\u00020\u00112\u0006\u0010\u0019\u001a\u00020\u0011H\u0002J\u0012\u0010\u001a\u001a\u00020\u000e2\b\u0010\u001b\u001a\u0004\u0018\u00010\u001cH\u0014J\b\u0010\u001d\u001a\u00020\u000eH\u0002J\b\u0010\u001e\u001a\u00020\u000eH\u0002J\b\u0010\u001f\u001a\u00020\u000eH\u0002J\b\u0010 \u001a\u00020\u000eH\u0002R\u000e\u0010\u0003\u001a\u00020\u0004X\u0082.¢\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0006X\u0082.¢\u0006\u0002\n\u0000R\u000e\u0010\u0007\u001a\u00020\bX\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\t\u001a\u00020\nX\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u000b\u001a\u00020\fX\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006!"}, d2 = {"Lcom/example/summer/MainActivity;", "Landroidx/appcompat/app/AppCompatActivity;", "()V", "binding", "Lcom/example/summer/databinding/ActivityMainBinding;", "serviceIntent", "Landroid/content/Intent;", "time", "", "timerStarted", "", "updateTime", "Landroid/content/BroadcastReceiver;", "checkTime", "", "intent", "gen", "", "i", "generateFlag", "", "getTimeStringFromDouble", "makeTimeString", "hour", "min", "sec", "onCreate", "savedInstanceState", "Landroid/os/Bundle;", "resetTimer", "startStopTimer", "startTimer", "stopTimer", "app_release"}, k = 1, mv = {1, 6, 0}, xi = 48)
/* loaded from: classes.dex */
public final class MainActivity extends AppCompatActivity {
    private ActivityMainBinding binding;
    private Intent serviceIntent;
    private double time;
    private boolean timerStarted;
    private final BroadcastReceiver updateTime = new BroadcastReceiver() { // from class: com.example.summer.MainActivity$updateTime$1
        @Override // android.content.BroadcastReceiver
        public void onReceive(Context context, Intent intent) {
            ActivityMainBinding activityMainBinding;
            double d;
            String timeStringFromDouble;
            Intrinsics.checkNotNullParameter(context, "context");
            Intrinsics.checkNotNullParameter(intent, "intent");
            MainActivity.this.time = intent.getDoubleExtra(TimerService.TIME_EXTRA, 0.0d);
            activityMainBinding = MainActivity.this.binding;
            if (activityMainBinding == null) {
                Intrinsics.throwUninitializedPropertyAccessException("binding");
                activityMainBinding = null;
            }
            TextView textView = activityMainBinding.timeTV;
            MainActivity mainActivity = MainActivity.this;
            d = mainActivity.time;
            timeStringFromDouble = mainActivity.getTimeStringFromDouble(d);
            textView.setText(timeStringFromDouble);
        }
    };

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity
    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        ActivityMainBinding inflate = ActivityMainBinding.inflate(getLayoutInflater());
        Intrinsics.checkNotNullExpressionValue(inflate, "inflate(layoutInflater)");
        this.binding = inflate;
        ActivityMainBinding activityMainBinding = null;
        if (inflate == null) {
            Intrinsics.throwUninitializedPropertyAccessException("binding");
            inflate = null;
        }
        setContentView(inflate.mo166getRoot());
        Button button = (Button) findViewById(R.id.flagButton);
        ActivityMainBinding activityMainBinding2 = this.binding;
        if (activityMainBinding2 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("binding");
            activityMainBinding2 = null;
        }
        activityMainBinding2.startStopButton.setOnClickListener(new View.OnClickListener() { // from class: com.example.summer.MainActivity$$ExternalSyntheticLambda2
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                MainActivity.m163onCreate$lambda0(MainActivity.this, view);
            }
        });
        ActivityMainBinding activityMainBinding3 = this.binding;
        if (activityMainBinding3 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("binding");
        } else {
            activityMainBinding = activityMainBinding3;
        }
        activityMainBinding.resetButton.setOnClickListener(new View.OnClickListener() { // from class: com.example.summer.MainActivity$$ExternalSyntheticLambda0
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                MainActivity.m164onCreate$lambda1(MainActivity.this, view);
            }
        });
        this.serviceIntent = new Intent(getApplicationContext(), TimerService.class);
        button.setOnClickListener(new View.OnClickListener() { // from class: com.example.summer.MainActivity$$ExternalSyntheticLambda1
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                MainActivity.m165onCreate$lambda2(MainActivity.this, view);
            }
        });
        registerReceiver(this.updateTime, new IntentFilter(TimerService.TIMER_UPDATED));
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: onCreate$lambda-0  reason: not valid java name */
    public static final void m163onCreate$lambda0(MainActivity this$0, View view) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        this$0.startStopTimer();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: onCreate$lambda-1  reason: not valid java name */
    public static final void m164onCreate$lambda1(MainActivity this$0, View view) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        this$0.resetTimer();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: onCreate$lambda-2  reason: not valid java name */
    public static final void m165onCreate$lambda2(MainActivity this$0, View view) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        Intent intent = this$0.serviceIntent;
        if (intent == null) {
            Intrinsics.throwUninitializedPropertyAccessException("serviceIntent");
            intent = null;
        }
        this$0.checkTime(intent);
    }

    private final void checkTime(Intent intent) {
        Toast.makeText(this, (((int) intent.getDoubleExtra(TimerService.TIME_EXTRA, 0.0d)) % 86400) / 3600 >= 31337 ? generateFlag() : "플래그를 주기엔 아직 너무 더운걸...", 0).show();
    }

    private final String generateFlag() {
        ArrayList arrayList = new ArrayList();
        int size = MainActivityKt.getFLAG().size();
        for (int i = 0; i < size; i++) {
            arrayList.add(Character.valueOf((char) ((MainActivityKt.getFLAG().get(i).intValue() ^ StringsKt.first(MainActivityKt.getKEY().get(i % MainActivityKt.getKEY().size()))) - gen(i))));
        }
        return CollectionsKt.joinToString$default(arrayList, "", null, null, 0, null, null, 62, null);
    }

    private final int gen(int i) {
        int size = MainActivityKt.getKEY().size();
        return (((int) Math.pow(i, 3.0d)) % 256) ^ StringsKt.first(MainActivityKt.getKEY().get(size - ((i % size) + 1)));
    }

    private final void resetTimer() {
        View findViewById = findViewById(R.id.fan_higher);
        Intrinsics.checkNotNullExpressionValue(findViewById, "findViewById(R.id.fan_higher)");
        ((ImageView) findViewById).clearAnimation();
        stopTimer();
        this.time = 0.0d;
        ActivityMainBinding activityMainBinding = this.binding;
        if (activityMainBinding == null) {
            Intrinsics.throwUninitializedPropertyAccessException("binding");
            activityMainBinding = null;
        }
        activityMainBinding.timeTV.setText(getTimeStringFromDouble(this.time));
    }

    private final void startStopTimer() {
        View findViewById = findViewById(R.id.fan_higher);
        Intrinsics.checkNotNullExpressionValue(findViewById, "findViewById(R.id.fan_higher)");
        ImageView imageView = (ImageView) findViewById;
        Animation loadAnimation = AnimationUtils.loadAnimation(this, R.anim.infinite_anim);
        if (this.timerStarted) {
            imageView.clearAnimation();
            stopTimer();
            return;
        }
        loadAnimation.setFillAfter(true);
        imageView.startAnimation(loadAnimation);
        startTimer();
    }

    private final void startTimer() {
        Intent intent = this.serviceIntent;
        ActivityMainBinding activityMainBinding = null;
        if (intent == null) {
            Intrinsics.throwUninitializedPropertyAccessException("serviceIntent");
            intent = null;
        }
        intent.putExtra(TimerService.TIME_EXTRA, this.time);
        Intent intent2 = this.serviceIntent;
        if (intent2 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("serviceIntent");
            intent2 = null;
        }
        startService(intent2);
        ActivityMainBinding activityMainBinding2 = this.binding;
        if (activityMainBinding2 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("binding");
            activityMainBinding2 = null;
        }
        activityMainBinding2.startStopButton.setText("Stop");
        ActivityMainBinding activityMainBinding3 = this.binding;
        if (activityMainBinding3 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("binding");
        } else {
            activityMainBinding = activityMainBinding3;
        }
        activityMainBinding.startStopButton.setIcon(getDrawable(R.drawable.ic_baseline_pause_24));
        this.timerStarted = true;
    }

    private final void stopTimer() {
        Intent intent = this.serviceIntent;
        ActivityMainBinding activityMainBinding = null;
        if (intent == null) {
            Intrinsics.throwUninitializedPropertyAccessException("serviceIntent");
            intent = null;
        }
        stopService(intent);
        ActivityMainBinding activityMainBinding2 = this.binding;
        if (activityMainBinding2 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("binding");
            activityMainBinding2 = null;
        }
        activityMainBinding2.startStopButton.setText("Start");
        ActivityMainBinding activityMainBinding3 = this.binding;
        if (activityMainBinding3 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("binding");
        } else {
            activityMainBinding = activityMainBinding3;
        }
        activityMainBinding.startStopButton.setIcon(getDrawable(R.drawable.ic_baseline_play_arrow_24));
        this.timerStarted = false;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final String getTimeStringFromDouble(double d) {
        int roundToInt = MathKt.roundToInt(d) % 86400;
        int i = roundToInt / 3600;
        int i2 = roundToInt % 3600;
        return makeTimeString(i, i2 / 60, i2 % 60);
    }

    private final String makeTimeString(int i, int i2, int i3) {
        StringCompanionObject stringCompanionObject = StringCompanionObject.INSTANCE;
        String format = String.format("%02d:%02d:%02d", Arrays.copyOf(new Object[]{Integer.valueOf(i), Integer.valueOf(i2), Integer.valueOf(i3)}, 3));
        Intrinsics.checkNotNullExpressionValue(format, "format(format, *args)");
        return format;
    }
}