package androidx.navigation;

import android.app.Activity;
import android.content.Context;
import kotlin.Metadata;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;

@Metadata(d1 = {"\u0000\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u0004\u0018\u00010\u00012\u0006\u0010\u0002\u001a\u00020\u0003H\n¢\u0006\u0002\b\u0004"}, d2 = {"<anonymous>", "Landroid/app/Activity;", "it", "Landroid/content/Context;", "invoke"}, k = 3, mv = {1, 8, 0}, xi = 48)
/* compiled from: NavDeepLinkBuilder.kt */
final class NavDeepLinkBuilder$activity$2 extends Lambda implements Function1<Context, Activity> {
    public static final NavDeepLinkBuilder$activity$2 INSTANCE = new NavDeepLinkBuilder$activity$2();

    NavDeepLinkBuilder$activity$2() {
        super(1);
    }

    public final Activity invoke(Context it) {
        Intrinsics.checkNotNullParameter(it, "it");
        if (it instanceof Activity) {
            return (Activity) it;
        }
        return null;
    }
}
