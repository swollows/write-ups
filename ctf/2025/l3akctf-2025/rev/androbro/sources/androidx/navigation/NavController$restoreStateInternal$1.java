package androidx.navigation;

import kotlin.Metadata;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;

@Metadata(d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u00012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, d2 = {"<anonymous>", "", "it", "", "invoke", "(Ljava/lang/String;)Ljava/lang/Boolean;"}, k = 3, mv = {1, 8, 0}, xi = 48)
/* compiled from: NavController.kt */
final class NavController$restoreStateInternal$1 extends Lambda implements Function1<String, Boolean> {
    final /* synthetic */ String $backStackId;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    NavController$restoreStateInternal$1(String str) {
        super(1);
        this.$backStackId = str;
    }

    public final Boolean invoke(String it) {
        return Boolean.valueOf(Intrinsics.areEqual((Object) it, (Object) this.$backStackId));
    }
}
