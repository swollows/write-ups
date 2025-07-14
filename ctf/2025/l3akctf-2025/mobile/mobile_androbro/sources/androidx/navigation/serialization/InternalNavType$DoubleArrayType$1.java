package androidx.navigation.serialization;

import android.os.Bundle;
import androidx.navigation.CollectionNavType;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import kotlin.Metadata;
import kotlin.collections.ArraysKt;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.Intrinsics;

@Metadata(d1 = {"\u00003\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0013\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010 \n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002*\u0001\u0000\b\n\u0018\u00002\n\u0012\u0006\u0012\u0004\u0018\u00010\u00020\u0001J\b\u0010\u0007\u001a\u00020\u0002H\u0016J\u001b\u0010\b\u001a\u0004\u0018\u00010\u00022\u0006\u0010\t\u001a\u00020\n2\u0006\u0010\u000b\u001a\u00020\u0004H\u0002J\u0010\u0010\f\u001a\u00020\u00022\u0006\u0010\r\u001a\u00020\u0004H\u0016J\u001a\u0010\f\u001a\u00020\u00022\u0006\u0010\r\u001a\u00020\u00042\b\u0010\u000e\u001a\u0004\u0018\u00010\u0002H\u0016J\"\u0010\u000f\u001a\u00020\u00102\u0006\u0010\t\u001a\u00020\n2\u0006\u0010\u000b\u001a\u00020\u00042\b\u0010\r\u001a\u0004\u0018\u00010\u0002H\u0016J\u0018\u0010\u0011\u001a\b\u0012\u0004\u0012\u00020\u00040\u00122\b\u0010\r\u001a\u0004\u0018\u00010\u0002H\u0016J\u001c\u0010\u0013\u001a\u00020\u00142\b\u0010\r\u001a\u0004\u0018\u00010\u00022\b\u0010\u0015\u001a\u0004\u0018\u00010\u0002H\u0016R\u0014\u0010\u0003\u001a\u00020\u00048VX\u0004¢\u0006\u0006\u001a\u0004\b\u0005\u0010\u0006¨\u0006\u0016"}, d2 = {"androidx/navigation/serialization/InternalNavType$DoubleArrayType$1", "Landroidx/navigation/CollectionNavType;", "", "name", "", "getName", "()Ljava/lang/String;", "emptyCollection", "get", "bundle", "Landroid/os/Bundle;", "key", "parseValue", "value", "previousValue", "put", "", "serializeAsValues", "", "valueEquals", "", "other", "navigation-common_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* compiled from: NavTypeConverter.kt */
public final class InternalNavType$DoubleArrayType$1 extends CollectionNavType<double[]> {
    InternalNavType$DoubleArrayType$1() {
        super(true);
    }

    public String getName() {
        return "double[]";
    }

    public void put(Bundle bundle, String key, double[] value) {
        Intrinsics.checkNotNullParameter(bundle, "bundle");
        Intrinsics.checkNotNullParameter(key, "key");
        bundle.putDoubleArray(key, value);
    }

    public double[] get(Bundle bundle, String key) {
        Intrinsics.checkNotNullParameter(bundle, "bundle");
        Intrinsics.checkNotNullParameter(key, "key");
        return (double[]) bundle.get(key);
    }

    public double[] parseValue(String value) {
        Intrinsics.checkNotNullParameter(value, "value");
        return new double[]{InternalNavType.INSTANCE.getDoubleType().parseValue(value).doubleValue()};
    }

    /* JADX WARNING: Code restructure failed: missing block: B:2:0x0008, code lost:
        r0 = kotlin.collections.ArraysKt.plus(r3, parseValue(r2));
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public double[] parseValue(java.lang.String r2, double[] r3) {
        /*
            r1 = this;
            java.lang.String r0 = "value"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r2, r0)
            if (r3 == 0) goto L_0x0012
            double[] r0 = r1.parseValue((java.lang.String) r2)
            double[] r0 = kotlin.collections.ArraysKt.plus((double[]) r3, (double[]) r0)
            if (r0 != 0) goto L_0x0016
        L_0x0012:
            double[] r0 = r1.parseValue((java.lang.String) r2)
        L_0x0016:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.navigation.serialization.InternalNavType$DoubleArrayType$1.parseValue(java.lang.String, double[]):double[]");
    }

    public boolean valueEquals(double[] value, double[] other) {
        Double[] otherArray = null;
        Double[] valueArray = value != null ? ArraysKt.toTypedArray(value) : null;
        if (other != null) {
            otherArray = ArraysKt.toTypedArray(other);
        }
        return ArraysKt.contentDeepEquals(valueArray, otherArray);
    }

    public List<String> serializeAsValues(double[] value) {
        List<Double> list;
        if (value == null || (list = ArraysKt.toList(value)) == null) {
            return CollectionsKt.emptyList();
        }
        Iterable<Number> $this$map$iv = list;
        Collection destination$iv$iv = new ArrayList(CollectionsKt.collectionSizeOrDefault($this$map$iv, 10));
        for (Number doubleValue : $this$map$iv) {
            destination$iv$iv.add(String.valueOf(doubleValue.doubleValue()));
        }
        return (List) destination$iv$iv;
    }

    public double[] emptyCollection() {
        return new double[0];
    }
}
