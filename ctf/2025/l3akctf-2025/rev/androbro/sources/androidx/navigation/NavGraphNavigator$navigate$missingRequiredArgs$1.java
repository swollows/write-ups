package androidx.navigation;

import android.os.Bundle;
import kotlin.Metadata;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import kotlin.jvm.internal.Ref;

@Metadata(d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, d2 = {"<anonymous>", "", "key", "", "invoke", "(Ljava/lang/String;)Ljava/lang/Boolean;"}, k = 3, mv = {1, 8, 0}, xi = 48)
/* compiled from: NavGraphNavigator.kt */
final class NavGraphNavigator$navigate$missingRequiredArgs$1 extends Lambda implements Function1<String, Boolean> {
    final /* synthetic */ Ref.ObjectRef<Bundle> $args;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    NavGraphNavigator$navigate$missingRequiredArgs$1(Ref.ObjectRef<Bundle> objectRef) {
        super(1);
        this.$args = objectRef;
    }

    public final Boolean invoke(String key) {
        Intrinsics.checkNotNullParameter(key, "key");
        boolean z = true;
        if (this.$args.element != null && ((Bundle) this.$args.element).containsKey(key)) {
            z = false;
        }
        return Boolean.valueOf(z);
    }
}
