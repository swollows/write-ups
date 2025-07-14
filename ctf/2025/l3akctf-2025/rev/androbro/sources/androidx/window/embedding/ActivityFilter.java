package androidx.window.embedding;

import android.app.Activity;
import android.content.ComponentName;
import android.content.Intent;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt;

@Metadata(d1 = {"\u00008\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0006\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0007\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0005¢\u0006\u0002\u0010\u0006J\u0013\u0010\u000b\u001a\u00020\f2\b\u0010\r\u001a\u0004\u0018\u00010\u0001H\u0002J\b\u0010\u000e\u001a\u00020\u000fH\u0016J\u000e\u0010\u0010\u001a\u00020\f2\u0006\u0010\u0011\u001a\u00020\u0012J\u000e\u0010\u0013\u001a\u00020\f2\u0006\u0010\u0014\u001a\u00020\u0015J\b\u0010\u0016\u001a\u00020\u0005H\u0016R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\bR\u0013\u0010\u0004\u001a\u0004\u0018\u00010\u0005¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\n¨\u0006\u0017"}, d2 = {"Landroidx/window/embedding/ActivityFilter;", "", "componentName", "Landroid/content/ComponentName;", "intentAction", "", "(Landroid/content/ComponentName;Ljava/lang/String;)V", "getComponentName", "()Landroid/content/ComponentName;", "getIntentAction", "()Ljava/lang/String;", "equals", "", "other", "hashCode", "", "matchesActivity", "activity", "Landroid/app/Activity;", "matchesIntent", "intent", "Landroid/content/Intent;", "toString", "window_release"}, k = 1, mv = {1, 6, 0}, xi = 48)
/* compiled from: ActivityFilter.kt */
public final class ActivityFilter {
    private final ComponentName componentName;
    private final String intentAction;

    public ActivityFilter(ComponentName componentName2, String intentAction2) {
        ComponentName componentName3 = componentName2;
        Intrinsics.checkNotNullParameter(componentName3, "componentName");
        this.componentName = componentName3;
        this.intentAction = intentAction2;
        String packageName = this.componentName.getPackageName();
        Intrinsics.checkNotNullExpressionValue(packageName, "componentName.packageName");
        String className = this.componentName.getClassName();
        Intrinsics.checkNotNullExpressionValue(className, "componentName.className");
        boolean z = true;
        if (packageName.length() > 0) {
            if (className.length() > 0) {
                if (!StringsKt.contains$default((CharSequence) packageName, (CharSequence) "*", false, 2, (Object) null) || StringsKt.indexOf$default((CharSequence) packageName, "*", 0, false, 6, (Object) null) == packageName.length() - 1) {
                    if (StringsKt.contains$default((CharSequence) className, (CharSequence) "*", false, 2, (Object) null) && StringsKt.indexOf$default((CharSequence) className, "*", 0, false, 6, (Object) null) != className.length() - 1) {
                        z = false;
                    }
                    if (!z) {
                        throw new IllegalArgumentException("Wildcard in class name is only allowed at the end.".toString());
                    }
                    return;
                }
                throw new IllegalArgumentException("Wildcard in package name is only allowed at the end.".toString());
            }
            throw new IllegalArgumentException("Activity class name must not be empty.".toString());
        }
        throw new IllegalArgumentException("Package name must not be empty".toString());
    }

    public final ComponentName getComponentName() {
        return this.componentName;
    }

    public final String getIntentAction() {
        return this.intentAction;
    }

    public final boolean matchesIntent(Intent intent) {
        Intrinsics.checkNotNullParameter(intent, "intent");
        boolean match = false;
        if (MatcherUtils.INSTANCE.areComponentsMatching$window_release(intent.getComponent(), this.componentName) && (this.intentAction == null || Intrinsics.areEqual((Object) this.intentAction, (Object) intent.getAction()))) {
            match = true;
        }
        return match;
    }

    public final boolean matchesActivity(Activity activity) {
        Intrinsics.checkNotNullParameter(activity, "activity");
        if (MatcherUtils.INSTANCE.areActivityOrIntentComponentsMatching$window_release(activity, this.componentName)) {
            if (this.intentAction != null) {
                String str = this.intentAction;
                Intent intent = activity.getIntent();
                if (Intrinsics.areEqual((Object) str, (Object) intent == null ? null : intent.getAction())) {
                    return true;
                }
            }
            return true;
        }
        return false;
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if ((other instanceof ActivityFilter) && Intrinsics.areEqual((Object) this.componentName, (Object) ((ActivityFilter) other).componentName) && Intrinsics.areEqual((Object) this.intentAction, (Object) ((ActivityFilter) other).intentAction)) {
            return true;
        }
        return false;
    }

    public int hashCode() {
        int hashCode = this.componentName.hashCode() * 31;
        String str = this.intentAction;
        return hashCode + (str == null ? 0 : str.hashCode());
    }

    public String toString() {
        return "ActivityFilter(componentName=" + this.componentName + ", intentAction=" + this.intentAction + ')';
    }
}
