package androidx.navigation.serialization;

import android.os.Bundle;
import androidx.navigation.NavType;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

@Metadata(d1 = {"\u0000%\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0006\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\u0002\n\u0000*\u0001\u0000\b\n\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001J\u001e\u0010\u0007\u001a\u00020\u00022\u0006\u0010\b\u001a\u00020\t2\u0006\u0010\n\u001a\u00020\u0004H\u0002¢\u0006\u0002\u0010\u000bJ\u0015\u0010\f\u001a\u00020\u00022\u0006\u0010\r\u001a\u00020\u0004H\u0016¢\u0006\u0002\u0010\u000eJ \u0010\u000f\u001a\u00020\u00102\u0006\u0010\b\u001a\u00020\t2\u0006\u0010\n\u001a\u00020\u00042\u0006\u0010\r\u001a\u00020\u0002H\u0016R\u0014\u0010\u0003\u001a\u00020\u00048VX\u0004¢\u0006\u0006\u001a\u0004\b\u0005\u0010\u0006¨\u0006\u0011"}, d2 = {"androidx/navigation/serialization/InternalNavType$DoubleType$1", "Landroidx/navigation/NavType;", "", "name", "", "getName", "()Ljava/lang/String;", "get", "bundle", "Landroid/os/Bundle;", "key", "(Landroid/os/Bundle;Ljava/lang/String;)Ljava/lang/Double;", "parseValue", "value", "(Ljava/lang/String;)Ljava/lang/Double;", "put", "", "navigation-common_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* compiled from: NavTypeConverter.kt */
public final class InternalNavType$DoubleType$1 extends NavType<Double> {
    InternalNavType$DoubleType$1() {
        super(false);
    }

    public /* bridge */ /* synthetic */ void put(Bundle bundle, String key, Object value) {
        put(bundle, key, ((Number) value).doubleValue());
    }

    public String getName() {
        return "double";
    }

    public void put(Bundle bundle, String key, double value) {
        Intrinsics.checkNotNullParameter(bundle, "bundle");
        Intrinsics.checkNotNullParameter(key, "key");
        bundle.putDouble(key, value);
    }

    public Double get(Bundle bundle, String key) {
        Intrinsics.checkNotNullParameter(bundle, "bundle");
        Intrinsics.checkNotNullParameter(key, "key");
        Object obj = bundle.get(key);
        Intrinsics.checkNotNull(obj, "null cannot be cast to non-null type kotlin.Double");
        return (Double) obj;
    }

    public Double parseValue(String value) {
        Intrinsics.checkNotNullParameter(value, "value");
        return Double.valueOf(Double.parseDouble(value));
    }
}
