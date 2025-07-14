package androidx.navigation;

import kotlin.Metadata;
import kotlin.Pair;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Lambda;

@Metadata(d1 = {"\u0000\b\n\u0000\n\u0002\u0010\u000e\n\u0000\u0010\u0000\u001a\u0004\u0018\u00010\u0001H\n¢\u0006\u0002\b\u0002"}, d2 = {"<anonymous>", "", "invoke"}, k = 3, mv = {1, 8, 0}, xi = 48)
/* compiled from: NavDeepLink.kt */
final class NavDeepLink$fragRegex$2 extends Lambda implements Function0<String> {
    final /* synthetic */ NavDeepLink this$0;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    NavDeepLink$fragRegex$2(NavDeepLink navDeepLink) {
        super(0);
        this.this$0 = navDeepLink;
    }

    public final String invoke() {
        Pair access$getFragArgsAndRegex = this.this$0.getFragArgsAndRegex();
        if (access$getFragArgsAndRegex != null) {
            return (String) access$getFragArgsAndRegex.getSecond();
        }
        return null;
    }
}
