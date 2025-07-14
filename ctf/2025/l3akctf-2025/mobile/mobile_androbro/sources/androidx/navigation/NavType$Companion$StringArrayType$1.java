package androidx.navigation;

import android.net.Uri;
import android.os.Bundle;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import kotlin.Metadata;
import kotlin.collections.ArraysKt;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.Intrinsics;

@Metadata(d1 = {"\u00005\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0011\n\u0002\u0010\u000e\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0003*\u0001\u0000\b\n\u0018\u00002\u0010\u0012\f\u0012\n\u0012\u0004\u0012\u00020\u0003\u0018\u00010\u00020\u0001J\u0013\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002H\u0016¢\u0006\u0002\u0010\bJ&\u0010\t\u001a\n\u0012\u0004\u0012\u00020\u0003\u0018\u00010\u00022\u0006\u0010\n\u001a\u00020\u000b2\u0006\u0010\f\u001a\u00020\u0003H\u0002¢\u0006\u0002\u0010\rJ\u001b\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\u00030\u00022\u0006\u0010\u000f\u001a\u00020\u0003H\u0016¢\u0006\u0002\u0010\u0010J-\u0010\u000e\u001a\n\u0012\u0004\u0012\u00020\u0003\u0018\u00010\u00022\u0006\u0010\u000f\u001a\u00020\u00032\u000e\u0010\u0011\u001a\n\u0012\u0004\u0012\u00020\u0003\u0018\u00010\u0002H\u0016¢\u0006\u0002\u0010\u0012J-\u0010\u0013\u001a\u00020\u00142\u0006\u0010\n\u001a\u00020\u000b2\u0006\u0010\f\u001a\u00020\u00032\u000e\u0010\u000f\u001a\n\u0012\u0004\u0012\u00020\u0003\u0018\u00010\u0002H\u0016¢\u0006\u0002\u0010\u0015J#\u0010\u0016\u001a\b\u0012\u0004\u0012\u00020\u00030\u00172\u000e\u0010\u000f\u001a\n\u0012\u0004\u0012\u00020\u0003\u0018\u00010\u0002H\u0016¢\u0006\u0002\u0010\u0018J-\u0010\u0019\u001a\u00020\u001a2\u000e\u0010\u000f\u001a\n\u0012\u0004\u0012\u00020\u0003\u0018\u00010\u00022\u000e\u0010\u001b\u001a\n\u0012\u0004\u0012\u00020\u0003\u0018\u00010\u0002H\u0016¢\u0006\u0002\u0010\u001cR\u0014\u0010\u0004\u001a\u00020\u00038VX\u0004¢\u0006\u0006\u001a\u0004\b\u0005\u0010\u0006¨\u0006\u001d"}, d2 = {"androidx/navigation/NavType$Companion$StringArrayType$1", "Landroidx/navigation/CollectionNavType;", "", "", "name", "getName", "()Ljava/lang/String;", "emptyCollection", "()[Ljava/lang/String;", "get", "bundle", "Landroid/os/Bundle;", "key", "(Landroid/os/Bundle;Ljava/lang/String;)[Ljava/lang/String;", "parseValue", "value", "(Ljava/lang/String;)[Ljava/lang/String;", "previousValue", "(Ljava/lang/String;[Ljava/lang/String;)[Ljava/lang/String;", "put", "", "(Landroid/os/Bundle;Ljava/lang/String;[Ljava/lang/String;)V", "serializeAsValues", "", "([Ljava/lang/String;)Ljava/util/List;", "valueEquals", "", "other", "([Ljava/lang/String;[Ljava/lang/String;)Z", "navigation-common_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* compiled from: NavType.kt */
public final class NavType$Companion$StringArrayType$1 extends CollectionNavType<String[]> {
    NavType$Companion$StringArrayType$1() {
        super(true);
    }

    public String getName() {
        return "string[]";
    }

    public void put(Bundle bundle, String key, String[] value) {
        Intrinsics.checkNotNullParameter(bundle, "bundle");
        Intrinsics.checkNotNullParameter(key, "key");
        bundle.putStringArray(key, value);
    }

    public String[] get(Bundle bundle, String key) {
        Intrinsics.checkNotNullParameter(bundle, "bundle");
        Intrinsics.checkNotNullParameter(key, "key");
        return (String[]) bundle.get(key);
    }

    public String[] parseValue(String value) {
        Intrinsics.checkNotNullParameter(value, "value");
        return new String[]{value};
    }

    /* JADX WARNING: Code restructure failed: missing block: B:2:0x0008, code lost:
        r0 = (java.lang.String[]) kotlin.collections.ArraysKt.plus((T[]) r3, (T[]) parseValue(r2));
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public java.lang.String[] parseValue(java.lang.String r2, java.lang.String[] r3) {
        /*
            r1 = this;
            java.lang.String r0 = "value"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r2, r0)
            if (r3 == 0) goto L_0x0014
            java.lang.String[] r0 = r1.parseValue((java.lang.String) r2)
            java.lang.Object[] r0 = kotlin.collections.ArraysKt.plus((T[]) r3, (T[]) r0)
            java.lang.String[] r0 = (java.lang.String[]) r0
            if (r0 != 0) goto L_0x0018
        L_0x0014:
            java.lang.String[] r0 = r1.parseValue((java.lang.String) r2)
        L_0x0018:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.navigation.NavType$Companion$StringArrayType$1.parseValue(java.lang.String, java.lang.String[]):java.lang.String[]");
    }

    public boolean valueEquals(String[] value, String[] other) {
        return ArraysKt.contentDeepEquals(value, other);
    }

    public List<String> serializeAsValues(String[] value) {
        if (value == null) {
            return CollectionsKt.emptyList();
        }
        String[] strArr = value;
        Collection destination$iv$iv = new ArrayList(strArr.length);
        for (String it : strArr) {
            destination$iv$iv.add(Uri.encode(it));
        }
        return (List) destination$iv$iv;
    }

    public String[] emptyCollection() {
        return new String[0];
    }
}
