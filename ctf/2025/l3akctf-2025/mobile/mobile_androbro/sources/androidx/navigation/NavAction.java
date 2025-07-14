package androidx.navigation;

import android.os.Bundle;
import java.util.Set;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

@Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\f\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\u0018\u00002\u00020\u0001B)\b\u0007\u0012\b\b\u0001\u0010\u0002\u001a\u00020\u0003\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0005\u0012\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0007¢\u0006\u0002\u0010\bJ\u0013\u0010\u0013\u001a\u00020\u00142\b\u0010\u0015\u001a\u0004\u0018\u00010\u0001H\u0002J\b\u0010\u0016\u001a\u00020\u0003H\u0016J\b\u0010\u0017\u001a\u00020\u0018H\u0016R\u001c\u0010\u0006\u001a\u0004\u0018\u00010\u0007X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\t\u0010\n\"\u0004\b\u000b\u0010\fR\u0016\u0010\u0002\u001a\u00020\u00038\u0006X\u0004¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\u000eR\u001c\u0010\u0004\u001a\u0004\u0018\u00010\u0005X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u000f\u0010\u0010\"\u0004\b\u0011\u0010\u0012¨\u0006\u0019"}, d2 = {"Landroidx/navigation/NavAction;", "", "destinationId", "", "navOptions", "Landroidx/navigation/NavOptions;", "defaultArguments", "Landroid/os/Bundle;", "(ILandroidx/navigation/NavOptions;Landroid/os/Bundle;)V", "getDefaultArguments", "()Landroid/os/Bundle;", "setDefaultArguments", "(Landroid/os/Bundle;)V", "getDestinationId", "()I", "getNavOptions", "()Landroidx/navigation/NavOptions;", "setNavOptions", "(Landroidx/navigation/NavOptions;)V", "equals", "", "other", "hashCode", "toString", "", "navigation-common_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* compiled from: NavAction.kt */
public final class NavAction {
    private Bundle defaultArguments;
    private final int destinationId;
    private NavOptions navOptions;

    public NavAction(int destinationId2, NavOptions navOptions2, Bundle defaultArguments2) {
        this.destinationId = destinationId2;
        this.navOptions = navOptions2;
        this.defaultArguments = defaultArguments2;
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public /* synthetic */ NavAction(int i, NavOptions navOptions2, Bundle bundle, int i2, DefaultConstructorMarker defaultConstructorMarker) {
        this(i, (i2 & 2) != 0 ? null : navOptions2, (i2 & 4) != 0 ? null : bundle);
    }

    public final int getDestinationId() {
        return this.destinationId;
    }

    public final NavOptions getNavOptions() {
        return this.navOptions;
    }

    public final void setNavOptions(NavOptions navOptions2) {
        this.navOptions = navOptions2;
    }

    public final Bundle getDefaultArguments() {
        return this.defaultArguments;
    }

    public final void setDefaultArguments(Bundle bundle) {
        this.defaultArguments = bundle;
    }

    public NavAction(int destinationId2) {
        this(destinationId2, (NavOptions) null, (Bundle) null, 6, (DefaultConstructorMarker) null);
    }

    public NavAction(int destinationId2, NavOptions navOptions2) {
        this(destinationId2, navOptions2, (Bundle) null, 4, (DefaultConstructorMarker) null);
    }

    /* JADX WARNING: Removed duplicated region for block: B:46:? A[RETURN, SYNTHETIC] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public boolean equals(java.lang.Object r12) {
        /*
            r11 = this;
            r0 = 1
            if (r11 != r12) goto L_0x0004
            return r0
        L_0x0004:
            r1 = 0
            if (r12 == 0) goto L_0x0088
            boolean r2 = r12 instanceof androidx.navigation.NavAction
            if (r2 != 0) goto L_0x000d
            goto L_0x0088
        L_0x000d:
            int r2 = r11.destinationId
            r3 = r12
            androidx.navigation.NavAction r3 = (androidx.navigation.NavAction) r3
            int r3 = r3.destinationId
            if (r2 != r3) goto L_0x0086
            androidx.navigation.NavOptions r2 = r11.navOptions
            r3 = r12
            androidx.navigation.NavAction r3 = (androidx.navigation.NavAction) r3
            androidx.navigation.NavOptions r3 = r3.navOptions
            boolean r2 = kotlin.jvm.internal.Intrinsics.areEqual((java.lang.Object) r2, (java.lang.Object) r3)
            if (r2 == 0) goto L_0x0086
            android.os.Bundle r2 = r11.defaultArguments
            r3 = r12
            androidx.navigation.NavAction r3 = (androidx.navigation.NavAction) r3
            android.os.Bundle r3 = r3.defaultArguments
            boolean r2 = kotlin.jvm.internal.Intrinsics.areEqual((java.lang.Object) r2, (java.lang.Object) r3)
            if (r2 != 0) goto L_0x0085
            android.os.Bundle r2 = r11.defaultArguments
            if (r2 == 0) goto L_0x0082
            java.util.Set r2 = r2.keySet()
            if (r2 == 0) goto L_0x0082
            java.lang.Iterable r2 = (java.lang.Iterable) r2
            r3 = 0
            boolean r4 = r2 instanceof java.util.Collection
            if (r4 == 0) goto L_0x004c
            r4 = r2
            java.util.Collection r4 = (java.util.Collection) r4
            boolean r4 = r4.isEmpty()
            if (r4 == 0) goto L_0x004c
            r2 = r0
            goto L_0x007d
        L_0x004c:
            java.util.Iterator r4 = r2.iterator()
        L_0x0050:
            boolean r5 = r4.hasNext()
            if (r5 == 0) goto L_0x007c
            java.lang.Object r5 = r4.next()
            r6 = r5
            java.lang.String r6 = (java.lang.String) r6
            r7 = 0
            android.os.Bundle r8 = r11.defaultArguments
            r9 = 0
            if (r8 == 0) goto L_0x0068
            java.lang.Object r8 = r8.get(r6)
            goto L_0x0069
        L_0x0068:
            r8 = r9
        L_0x0069:
            r10 = r12
            androidx.navigation.NavAction r10 = (androidx.navigation.NavAction) r10
            android.os.Bundle r10 = r10.defaultArguments
            if (r10 == 0) goto L_0x0074
            java.lang.Object r9 = r10.get(r6)
        L_0x0074:
            boolean r6 = kotlin.jvm.internal.Intrinsics.areEqual((java.lang.Object) r8, (java.lang.Object) r9)
            if (r6 != 0) goto L_0x0050
            r2 = r1
            goto L_0x007d
        L_0x007c:
            r2 = r0
        L_0x007d:
            if (r2 != r0) goto L_0x0082
            r2 = r0
            goto L_0x0083
        L_0x0082:
            r2 = r1
        L_0x0083:
            if (r2 == 0) goto L_0x0086
        L_0x0085:
            goto L_0x0087
        L_0x0086:
            r0 = r1
        L_0x0087:
            return r0
        L_0x0088:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.navigation.NavAction.equals(java.lang.Object):boolean");
    }

    public int hashCode() {
        Set<String> $this$forEach$iv;
        int hashCode = Integer.hashCode(this.destinationId) * 31;
        NavOptions navOptions2 = this.navOptions;
        int result = hashCode + (navOptions2 != null ? navOptions2.hashCode() : 0);
        Bundle bundle = this.defaultArguments;
        if (!(bundle == null || ($this$forEach$iv = bundle.keySet()) == null)) {
            for (String it : $this$forEach$iv) {
                int i = result * 31;
                Bundle bundle2 = this.defaultArguments;
                Object obj = bundle2 != null ? bundle2.get(it) : null;
                result = i + (obj != null ? obj.hashCode() : 0);
            }
        }
        return result;
    }

    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append("(0x");
        sb.append(Integer.toHexString(this.destinationId));
        sb.append(")");
        if (this.navOptions != null) {
            sb.append(" navOptions=");
            sb.append(this.navOptions);
        }
        String sb2 = sb.toString();
        Intrinsics.checkNotNullExpressionValue(sb2, "sb.toString()");
        return sb2;
    }
}
