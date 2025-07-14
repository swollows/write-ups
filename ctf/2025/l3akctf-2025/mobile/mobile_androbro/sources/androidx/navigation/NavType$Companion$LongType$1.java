package androidx.navigation;

import android.os.Bundle;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.CharsKt;
import kotlin.text.StringsKt;

@Metadata(d1 = {"\u0000%\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\t\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\u0002\n\u0000*\u0001\u0000\b\n\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001J\u001e\u0010\u0007\u001a\u00020\u00022\u0006\u0010\b\u001a\u00020\t2\u0006\u0010\n\u001a\u00020\u0004H\u0002¢\u0006\u0002\u0010\u000bJ\u0015\u0010\f\u001a\u00020\u00022\u0006\u0010\r\u001a\u00020\u0004H\u0016¢\u0006\u0002\u0010\u000eJ \u0010\u000f\u001a\u00020\u00102\u0006\u0010\b\u001a\u00020\t2\u0006\u0010\n\u001a\u00020\u00042\u0006\u0010\r\u001a\u00020\u0002H\u0016R\u0014\u0010\u0003\u001a\u00020\u00048VX\u0004¢\u0006\u0006\u001a\u0004\b\u0005\u0010\u0006¨\u0006\u0011"}, d2 = {"androidx/navigation/NavType$Companion$LongType$1", "Landroidx/navigation/NavType;", "", "name", "", "getName", "()Ljava/lang/String;", "get", "bundle", "Landroid/os/Bundle;", "key", "(Landroid/os/Bundle;Ljava/lang/String;)Ljava/lang/Long;", "parseValue", "value", "(Ljava/lang/String;)Ljava/lang/Long;", "put", "", "navigation-common_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* compiled from: NavType.kt */
public final class NavType$Companion$LongType$1 extends NavType<Long> {
    NavType$Companion$LongType$1() {
        super(false);
    }

    public /* bridge */ /* synthetic */ void put(Bundle bundle, String key, Object value) {
        put(bundle, key, ((Number) value).longValue());
    }

    public String getName() {
        return "long";
    }

    public void put(Bundle bundle, String key, long value) {
        Intrinsics.checkNotNullParameter(bundle, "bundle");
        Intrinsics.checkNotNullParameter(key, "key");
        bundle.putLong(key, value);
    }

    public Long get(Bundle bundle, String key) {
        Intrinsics.checkNotNullParameter(bundle, "bundle");
        Intrinsics.checkNotNullParameter(key, "key");
        Object obj = bundle.get(key);
        Intrinsics.checkNotNull(obj, "null cannot be cast to non-null type kotlin.Long");
        return (Long) obj;
    }

    public Long parseValue(String value) {
        long j;
        Intrinsics.checkNotNullParameter(value, "value");
        String localValue = value;
        if (StringsKt.endsWith$default(value, "L", false, 2, (Object) null)) {
            String substring = localValue.substring(0, value.length() - 1);
            Intrinsics.checkNotNullExpressionValue(substring, "substring(...)");
            localValue = substring;
        }
        if (StringsKt.startsWith$default(value, "0x", false, 2, (Object) null)) {
            String substring2 = localValue.substring(2);
            Intrinsics.checkNotNullExpressionValue(substring2, "substring(...)");
            j = Long.parseLong(substring2, CharsKt.checkRadix(16));
        } else {
            j = Long.parseLong(localValue);
        }
        return Long.valueOf(j);
    }
}
