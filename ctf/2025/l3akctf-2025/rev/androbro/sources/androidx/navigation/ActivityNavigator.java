package androidx.navigation;

import android.app.Activity;
import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.net.Uri;
import android.os.Bundle;
import android.util.AttributeSet;
import android.util.Log;
import androidx.core.app.ActivityCompat;
import androidx.core.app.ActivityOptionsCompat;
import androidx.navigation.Navigator;
import java.util.Iterator;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import kotlin.Metadata;
import kotlin.jvm.JvmStatic;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.ranges.RangesKt;
import kotlin.sequences.SequencesKt;
import kotlin.text.StringsKt;

@Metadata(d1 = {"\u0000@\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0004\b\u0017\u0018\u0000 \u00162\b\u0012\u0004\u0012\u00020\u00020\u0001:\u0003\u0016\u0017\u0018B\r\u0012\u0006\u0010\u0003\u001a\u00020\u0004¢\u0006\u0002\u0010\u0005J\b\u0010\n\u001a\u00020\u0002H\u0016J0\u0010\u000b\u001a\u0004\u0018\u00010\f2\u0006\u0010\r\u001a\u00020\u00022\b\u0010\u000e\u001a\u0004\u0018\u00010\u000f2\b\u0010\u0010\u001a\u0004\u0018\u00010\u00112\b\u0010\u0012\u001a\u0004\u0018\u00010\u0013H\u0016J\b\u0010\u0014\u001a\u00020\u0015H\u0016R\u0013\u0010\u0003\u001a\u00020\u00048\u0007¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007R\u0010\u0010\b\u001a\u0004\u0018\u00010\tX\u0004¢\u0006\u0002\n\u0000¨\u0006\u0019"}, d2 = {"Landroidx/navigation/ActivityNavigator;", "Landroidx/navigation/Navigator;", "Landroidx/navigation/ActivityNavigator$Destination;", "context", "Landroid/content/Context;", "(Landroid/content/Context;)V", "getContext", "()Landroid/content/Context;", "hostActivity", "Landroid/app/Activity;", "createDestination", "navigate", "Landroidx/navigation/NavDestination;", "destination", "args", "Landroid/os/Bundle;", "navOptions", "Landroidx/navigation/NavOptions;", "navigatorExtras", "Landroidx/navigation/Navigator$Extras;", "popBackStack", "", "Companion", "Destination", "Extras", "navigation-runtime_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
@Navigator.Name("activity")
/* compiled from: ActivityNavigator.kt */
public class ActivityNavigator extends Navigator<Destination> {
    public static final Companion Companion = new Companion((DefaultConstructorMarker) null);
    private static final String EXTRA_NAV_CURRENT = "android-support-navigation:ActivityNavigator:current";
    private static final String EXTRA_NAV_SOURCE = "android-support-navigation:ActivityNavigator:source";
    private static final String EXTRA_POP_ENTER_ANIM = "android-support-navigation:ActivityNavigator:popEnterAnim";
    private static final String EXTRA_POP_EXIT_ANIM = "android-support-navigation:ActivityNavigator:popExitAnim";
    private static final String LOG_TAG = "ActivityNavigator";
    private final Context context;
    private final Activity hostActivity;

    public final Context getContext() {
        return this.context;
    }

    public ActivityNavigator(Context context2) {
        Object element$iv;
        Intrinsics.checkNotNullParameter(context2, "context");
        this.context = context2;
        Iterator it = SequencesKt.generateSequence(this.context, ActivityNavigator$hostActivity$1.INSTANCE).iterator();
        while (true) {
            if (!it.hasNext()) {
                element$iv = null;
                break;
            }
            element$iv = it.next();
            if (((Context) element$iv) instanceof Activity) {
                break;
            }
        }
        this.hostActivity = (Activity) element$iv;
    }

    public Destination createDestination() {
        return new Destination((Navigator<? extends Destination>) this);
    }

    public boolean popBackStack() {
        if (this.hostActivity == null) {
            return false;
        }
        this.hostActivity.finish();
        return true;
    }

    public NavDestination navigate(Destination destination, Bundle args, NavOptions navOptions, Navigator.Extras navigatorExtras) {
        Intent hostIntent;
        int hostCurrentId;
        Intrinsics.checkNotNullParameter(destination, "destination");
        if (destination.getIntent() != null) {
            Intent intent = new Intent(destination.getIntent());
            if (args != null) {
                intent.putExtras(args);
                String dataPattern = destination.getDataPattern();
                CharSequence charSequence = dataPattern;
                if (!(charSequence == null || charSequence.length() == 0)) {
                    StringBuffer data = new StringBuffer();
                    Matcher matcher = Pattern.compile("\\{(.+?)\\}").matcher(dataPattern);
                    while (matcher.find()) {
                        String argName = matcher.group(1);
                        if (args.containsKey(argName)) {
                            matcher.appendReplacement(data, "");
                            data.append(Uri.encode(String.valueOf(args.get(argName))));
                        } else {
                            throw new IllegalArgumentException("Could not find " + argName + " in " + args + " to fill data pattern " + dataPattern);
                        }
                    }
                    matcher.appendTail(data);
                    intent.setData(Uri.parse(data.toString()));
                }
            }
            if (navigatorExtras instanceof Extras) {
                intent.addFlags(((Extras) navigatorExtras).getFlags());
            }
            if (this.hostActivity == null) {
                intent.addFlags(268435456);
            }
            if (navOptions != null && navOptions.shouldLaunchSingleTop()) {
                intent.addFlags(536870912);
            }
            if (!(this.hostActivity == null || (hostIntent = this.hostActivity.getIntent()) == null || (hostCurrentId = hostIntent.getIntExtra(EXTRA_NAV_CURRENT, 0)) == 0)) {
                intent.putExtra(EXTRA_NAV_SOURCE, hostCurrentId);
            }
            intent.putExtra(EXTRA_NAV_CURRENT, destination.getId());
            Resources resources = this.context.getResources();
            if (navOptions != null) {
                int popEnterAnim = navOptions.getPopEnterAnim();
                int popExitAnim = navOptions.getPopExitAnim();
                if ((popEnterAnim <= 0 || !Intrinsics.areEqual((Object) resources.getResourceTypeName(popEnterAnim), (Object) "animator")) && (popExitAnim <= 0 || !Intrinsics.areEqual((Object) resources.getResourceTypeName(popExitAnim), (Object) "animator"))) {
                    intent.putExtra(EXTRA_POP_ENTER_ANIM, popEnterAnim);
                    intent.putExtra(EXTRA_POP_EXIT_ANIM, popExitAnim);
                } else {
                    Log.w(LOG_TAG, "Activity destinations do not support Animator resource. Ignoring popEnter resource " + resources.getResourceName(popEnterAnim) + " and popExit resource " + resources.getResourceName(popExitAnim) + " when launching " + destination);
                }
            }
            if ((navigatorExtras instanceof Extras) != 0) {
                ActivityOptionsCompat activityOptions = ((Extras) navigatorExtras).getActivityOptions();
                if (activityOptions != null) {
                    ActivityCompat.startActivity(this.context, intent, activityOptions.toBundle());
                } else {
                    this.context.startActivity(intent);
                }
            } else {
                this.context.startActivity(intent);
            }
            if (navOptions == null || this.hostActivity == null) {
                return null;
            }
            int enterAnim = navOptions.getEnterAnim();
            int exitAnim = navOptions.getExitAnim();
            if ((enterAnim > 0 && Intrinsics.areEqual((Object) resources.getResourceTypeName(enterAnim), (Object) "animator")) || (exitAnim > 0 && Intrinsics.areEqual((Object) resources.getResourceTypeName(exitAnim), (Object) "animator"))) {
                Log.w(LOG_TAG, "Activity destinations do not support Animator resource. Ignoring enter resource " + resources.getResourceName(enterAnim) + " and exit resource " + resources.getResourceName(exitAnim) + "when launching " + destination);
                return null;
            } else if (enterAnim < 0 && exitAnim < 0) {
                return null;
            } else {
                this.hostActivity.overridePendingTransition(RangesKt.coerceAtLeast(enterAnim, 0), RangesKt.coerceAtLeast(exitAnim, 0));
                return null;
            }
        } else {
            throw new IllegalStateException(("Destination " + destination.getId() + " does not have an Intent set.").toString());
        }
    }

    @Metadata(d1 = {"\u0000`\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\r\b\u0017\u0018\u00002\u00020\u0001B\u000f\b\u0016\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004B\u0015\u0012\u000e\u0010\u0005\u001a\n\u0012\u0006\b\u0001\u0012\u00020\u00000\u0006¢\u0006\u0002\u0010\u0007J\u0013\u0010\u001d\u001a\u00020\u001e2\b\u0010\u001f\u001a\u0004\u0018\u00010 H\u0002J\b\u0010!\u001a\u00020\"H\u0016J\u0018\u0010#\u001a\u00020$2\u0006\u0010%\u001a\u00020&2\u0006\u0010'\u001a\u00020(H\u0017J\u001c\u0010)\u001a\u0004\u0018\u00010\t2\u0006\u0010%\u001a\u00020&2\b\u0010*\u001a\u0004\u0018\u00010\tH\u0002J\u0010\u0010+\u001a\u00020\u00002\b\u0010\n\u001a\u0004\u0018\u00010\tJ\u0010\u0010,\u001a\u00020\u00002\b\u0010-\u001a\u0004\u0018\u00010\rJ\u0010\u0010.\u001a\u00020\u00002\b\u0010\u0012\u001a\u0004\u0018\u00010\u0011J\u0010\u0010/\u001a\u00020\u00002\b\u0010\u0015\u001a\u0004\u0018\u00010\tJ\u0010\u00100\u001a\u00020\u00002\b\u0010\u0018\u001a\u0004\u0018\u00010\u0017J\u0010\u00101\u001a\u00020\u00002\b\u00102\u001a\u0004\u0018\u00010\tJ\b\u00103\u001a\u00020\u001eH\u0017J\b\u00104\u001a\u00020\tH\u0016R$\u0010\n\u001a\u0004\u0018\u00010\t2\b\u0010\b\u001a\u0004\u0018\u00010\t8F@BX\u000e¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\fR$\u0010\u000e\u001a\u0004\u0018\u00010\r2\b\u0010\b\u001a\u0004\u0018\u00010\r8F@BX\u000e¢\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\u0010R$\u0010\u0012\u001a\u0004\u0018\u00010\u00112\b\u0010\b\u001a\u0004\u0018\u00010\u00118F@BX\u000e¢\u0006\b\n\u0000\u001a\u0004\b\u0013\u0010\u0014R\"\u0010\u0015\u001a\u0004\u0018\u00010\t2\b\u0010\b\u001a\u0004\u0018\u00010\t@BX\u000e¢\u0006\b\n\u0000\u001a\u0004\b\u0016\u0010\fR\"\u0010\u0018\u001a\u0004\u0018\u00010\u00172\b\u0010\b\u001a\u0004\u0018\u00010\u0017@BX\u000e¢\u0006\b\n\u0000\u001a\u0004\b\u0019\u0010\u001aR$\u0010\u001b\u001a\u0004\u0018\u00010\t2\b\u0010\b\u001a\u0004\u0018\u00010\t8F@BX\u000e¢\u0006\b\n\u0000\u001a\u0004\b\u001c\u0010\f¨\u00065"}, d2 = {"Landroidx/navigation/ActivityNavigator$Destination;", "Landroidx/navigation/NavDestination;", "navigatorProvider", "Landroidx/navigation/NavigatorProvider;", "(Landroidx/navigation/NavigatorProvider;)V", "activityNavigator", "Landroidx/navigation/Navigator;", "(Landroidx/navigation/Navigator;)V", "<set-?>", "", "action", "getAction", "()Ljava/lang/String;", "Landroid/content/ComponentName;", "component", "getComponent", "()Landroid/content/ComponentName;", "Landroid/net/Uri;", "data", "getData", "()Landroid/net/Uri;", "dataPattern", "getDataPattern", "Landroid/content/Intent;", "intent", "getIntent", "()Landroid/content/Intent;", "targetPackage", "getTargetPackage", "equals", "", "other", "", "hashCode", "", "onInflate", "", "context", "Landroid/content/Context;", "attrs", "Landroid/util/AttributeSet;", "parseApplicationId", "pattern", "setAction", "setComponentName", "name", "setData", "setDataPattern", "setIntent", "setTargetPackage", "packageName", "supportsActions", "toString", "navigation-runtime_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
    /* compiled from: ActivityNavigator.kt */
    public static class Destination extends NavDestination {
        private String action;
        private ComponentName component;
        private Uri data;
        private String dataPattern;
        private Intent intent;
        private String targetPackage;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public Destination(Navigator<? extends Destination> activityNavigator) {
            super((Navigator<? extends NavDestination>) activityNavigator);
            Intrinsics.checkNotNullParameter(activityNavigator, "activityNavigator");
        }

        public final Intent getIntent() {
            return this.intent;
        }

        public final String getDataPattern() {
            return this.dataPattern;
        }

        public final Destination setIntent(Intent intent2) {
            this.intent = intent2;
            return this;
        }

        public final Destination setDataPattern(String dataPattern2) {
            this.dataPattern = dataPattern2;
            return this;
        }

        /* JADX INFO: this call moved to the top of the method (can break code semantics) */
        public Destination(NavigatorProvider navigatorProvider) {
            this((Navigator<? extends Destination>) navigatorProvider.getNavigator(ActivityNavigator.class));
            Intrinsics.checkNotNullParameter(navigatorProvider, "navigatorProvider");
        }

        public void onInflate(Context context, AttributeSet attrs) {
            Intrinsics.checkNotNullParameter(context, "context");
            Intrinsics.checkNotNullParameter(attrs, "attrs");
            super.onInflate(context, attrs);
            TypedArray $this$use$iv = context.getResources().obtainAttributes(attrs, R.styleable.ActivityNavigator);
            Intrinsics.checkNotNullExpressionValue($this$use$iv, "context.resources.obtain…leable.ActivityNavigator)");
            TypedArray array = $this$use$iv;
            setTargetPackage(parseApplicationId(context, array.getString(R.styleable.ActivityNavigator_targetPackage)));
            String className = array.getString(R.styleable.ActivityNavigator_android_name);
            if (className != null) {
                if (className.charAt(0) == '.') {
                    className = context.getPackageName() + className;
                }
                setComponentName(new ComponentName(context, className));
            }
            setAction(array.getString(R.styleable.ActivityNavigator_action));
            String data2 = parseApplicationId(context, array.getString(R.styleable.ActivityNavigator_data));
            if (data2 != null) {
                setData(Uri.parse(data2));
            }
            Destination dataPattern2 = setDataPattern(parseApplicationId(context, array.getString(R.styleable.ActivityNavigator_dataPattern)));
            $this$use$iv.recycle();
        }

        private final String parseApplicationId(Context context, String pattern) {
            if (pattern == null) {
                return null;
            }
            String packageName = context.getPackageName();
            Intrinsics.checkNotNullExpressionValue(packageName, "context.packageName");
            return StringsKt.replace$default(pattern, NavInflater.APPLICATION_ID_PLACEHOLDER, packageName, false, 4, (Object) null);
        }

        public final String getTargetPackage() {
            Intent intent2 = this.intent;
            if (intent2 != null) {
                return intent2.getPackage();
            }
            return null;
        }

        public final Destination setTargetPackage(String packageName) {
            if (this.intent == null) {
                this.intent = new Intent();
            }
            Intent intent2 = this.intent;
            Intrinsics.checkNotNull(intent2);
            intent2.setPackage(packageName);
            return this;
        }

        public final ComponentName getComponent() {
            Intent intent2 = this.intent;
            if (intent2 != null) {
                return intent2.getComponent();
            }
            return null;
        }

        public final Destination setComponentName(ComponentName name) {
            if (this.intent == null) {
                this.intent = new Intent();
            }
            Intent intent2 = this.intent;
            Intrinsics.checkNotNull(intent2);
            intent2.setComponent(name);
            return this;
        }

        public final String getAction() {
            Intent intent2 = this.intent;
            if (intent2 != null) {
                return intent2.getAction();
            }
            return null;
        }

        public final Destination setAction(String action2) {
            if (this.intent == null) {
                this.intent = new Intent();
            }
            Intent intent2 = this.intent;
            Intrinsics.checkNotNull(intent2);
            intent2.setAction(action2);
            return this;
        }

        public final Uri getData() {
            Intent intent2 = this.intent;
            if (intent2 != null) {
                return intent2.getData();
            }
            return null;
        }

        public final Destination setData(Uri data2) {
            if (this.intent == null) {
                this.intent = new Intent();
            }
            Intent intent2 = this.intent;
            Intrinsics.checkNotNull(intent2);
            intent2.setData(data2);
            return this;
        }

        public boolean supportsActions() {
            return false;
        }

        public String toString() {
            ComponentName componentName = getComponent();
            StringBuilder sb = new StringBuilder();
            sb.append(super.toString());
            if (componentName != null) {
                sb.append(" class=");
                sb.append(componentName.getClassName());
            } else {
                String action2 = getAction();
                if (action2 != null) {
                    sb.append(" action=");
                    sb.append(action2);
                }
            }
            String action3 = sb.toString();
            Intrinsics.checkNotNullExpressionValue(action3, "sb.toString()");
            return action3;
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (other == null || !(other instanceof Destination)) {
                return false;
            }
            if (super.equals(other)) {
                Intent intent2 = this.intent;
                if ((intent2 != null ? intent2.filterEquals(((Destination) other).intent) : ((Destination) other).intent == null) && Intrinsics.areEqual((Object) this.dataPattern, (Object) ((Destination) other).dataPattern)) {
                    return true;
                }
            }
            return false;
        }

        public int hashCode() {
            int hashCode = super.hashCode() * 31;
            Intent intent2 = this.intent;
            int i = 0;
            int result = (hashCode + (intent2 != null ? intent2.filterHashCode() : 0)) * 31;
            String str = this.dataPattern;
            if (str != null) {
                i = str.hashCode();
            }
            return result + i;
        }
    }

    @Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\u0018\u00002\u00020\u0001:\u0001\u000bB\u0019\b\u0000\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0005¢\u0006\u0002\u0010\u0006R\u0013\u0010\u0004\u001a\u0004\u0018\u00010\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\bR\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\n¨\u0006\f"}, d2 = {"Landroidx/navigation/ActivityNavigator$Extras;", "Landroidx/navigation/Navigator$Extras;", "flags", "", "activityOptions", "Landroidx/core/app/ActivityOptionsCompat;", "(ILandroidx/core/app/ActivityOptionsCompat;)V", "getActivityOptions", "()Landroidx/core/app/ActivityOptionsCompat;", "getFlags", "()I", "Builder", "navigation-runtime_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
    /* compiled from: ActivityNavigator.kt */
    public static final class Extras implements Navigator.Extras {
        private final ActivityOptionsCompat activityOptions;
        private final int flags;

        public Extras(int flags2, ActivityOptionsCompat activityOptions2) {
            this.flags = flags2;
            this.activityOptions = activityOptions2;
        }

        public final int getFlags() {
            return this.flags;
        }

        public final ActivityOptionsCompat getActivityOptions() {
            return this.activityOptions;
        }

        @Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0018\u00002\u00020\u0001B\u0005¢\u0006\u0002\u0010\u0002J\u000e\u0010\u0007\u001a\u00020\u00002\u0006\u0010\u0005\u001a\u00020\u0006J\u0006\u0010\b\u001a\u00020\tJ\u000e\u0010\n\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u0004R\u0010\u0010\u0003\u001a\u0004\u0018\u00010\u0004X\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0006X\u000e¢\u0006\u0002\n\u0000¨\u0006\u000b"}, d2 = {"Landroidx/navigation/ActivityNavigator$Extras$Builder;", "", "()V", "activityOptions", "Landroidx/core/app/ActivityOptionsCompat;", "flags", "", "addFlags", "build", "Landroidx/navigation/ActivityNavigator$Extras;", "setActivityOptions", "navigation-runtime_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
        /* compiled from: ActivityNavigator.kt */
        public static final class Builder {
            private ActivityOptionsCompat activityOptions;
            private int flags;

            public final Builder addFlags(int flags2) {
                this.flags |= flags2;
                return this;
            }

            public final Builder setActivityOptions(ActivityOptionsCompat activityOptions2) {
                Intrinsics.checkNotNullParameter(activityOptions2, "activityOptions");
                this.activityOptions = activityOptions2;
                return this;
            }

            public final Extras build() {
                return new Extras(this.flags, this.activityOptions);
            }
        }
    }

    @Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\b\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u0010\u0010\t\u001a\u00020\n2\u0006\u0010\u000b\u001a\u00020\fH\u0007R\u000e\u0010\u0003\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000R\u000e\u0010\u0007\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000R\u000e\u0010\b\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000¨\u0006\r"}, d2 = {"Landroidx/navigation/ActivityNavigator$Companion;", "", "()V", "EXTRA_NAV_CURRENT", "", "EXTRA_NAV_SOURCE", "EXTRA_POP_ENTER_ANIM", "EXTRA_POP_EXIT_ANIM", "LOG_TAG", "applyPopAnimationsToPendingTransition", "", "activity", "Landroid/app/Activity;", "navigation-runtime_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
    /* compiled from: ActivityNavigator.kt */
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }

        @JvmStatic
        public final void applyPopAnimationsToPendingTransition(Activity activity) {
            Intrinsics.checkNotNullParameter(activity, "activity");
            Intent intent = activity.getIntent();
            if (intent != null) {
                int popEnterAnim = intent.getIntExtra(ActivityNavigator.EXTRA_POP_ENTER_ANIM, -1);
                int popExitAnim = intent.getIntExtra(ActivityNavigator.EXTRA_POP_EXIT_ANIM, -1);
                if (popEnterAnim != -1 || popExitAnim != -1) {
                    int popExitAnim2 = 0;
                    int popEnterAnim2 = popEnterAnim != -1 ? popEnterAnim : 0;
                    if (popExitAnim != -1) {
                        popExitAnim2 = popExitAnim;
                    }
                    activity.overridePendingTransition(popEnterAnim2, popExitAnim2);
                }
            }
        }
    }

    @JvmStatic
    public static final void applyPopAnimationsToPendingTransition(Activity activity) {
        Companion.applyPopAnimationsToPendingTransition(activity);
    }
}
