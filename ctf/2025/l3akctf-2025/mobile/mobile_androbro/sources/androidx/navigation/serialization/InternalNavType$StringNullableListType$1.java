package androidx.navigation.serialization;

import android.net.Uri;
import android.os.Bundle;
import androidx.navigation.CollectionNavType;
import androidx.navigation.NavType;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import kotlin.Metadata;
import kotlin.collections.ArraysKt;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.Intrinsics;

@Metadata(d1 = {"\u0000-\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0010\u000e\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0002*\u0001\u0000\b\n\u0018\u00002\u0012\u0012\u000e\u0012\f\u0012\u0006\u0012\u0004\u0018\u00010\u0003\u0018\u00010\u00020\u0001J\u0010\u0010\u0007\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00030\u0002H\u0016J#\u0010\b\u001a\f\u0012\u0006\u0012\u0004\u0018\u00010\u0003\u0018\u00010\u00022\u0006\u0010\t\u001a\u00020\n2\u0006\u0010\u000b\u001a\u00020\u0003H\u0002J\u0018\u0010\f\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00030\u00022\u0006\u0010\r\u001a\u00020\u0003H\u0016J,\u0010\f\u001a\f\u0012\u0006\u0012\u0004\u0018\u00010\u0003\u0018\u00010\u00022\u0006\u0010\r\u001a\u00020\u00032\u0010\u0010\u000e\u001a\f\u0012\u0006\u0012\u0004\u0018\u00010\u0003\u0018\u00010\u0002H\u0016J*\u0010\u000f\u001a\u00020\u00102\u0006\u0010\t\u001a\u00020\n2\u0006\u0010\u000b\u001a\u00020\u00032\u0010\u0010\r\u001a\f\u0012\u0006\u0012\u0004\u0018\u00010\u0003\u0018\u00010\u0002H\u0016J \u0010\u0011\u001a\b\u0012\u0004\u0012\u00020\u00030\u00022\u0010\u0010\r\u001a\f\u0012\u0006\u0012\u0004\u0018\u00010\u0003\u0018\u00010\u0002H\u0016J,\u0010\u0012\u001a\u00020\u00132\u0010\u0010\r\u001a\f\u0012\u0006\u0012\u0004\u0018\u00010\u0003\u0018\u00010\u00022\u0010\u0010\u0014\u001a\f\u0012\u0006\u0012\u0004\u0018\u00010\u0003\u0018\u00010\u0002H\u0016R\u0014\u0010\u0004\u001a\u00020\u00038VX\u0004¢\u0006\u0006\u001a\u0004\b\u0005\u0010\u0006¨\u0006\u0015"}, d2 = {"androidx/navigation/serialization/InternalNavType$StringNullableListType$1", "Landroidx/navigation/CollectionNavType;", "", "", "name", "getName", "()Ljava/lang/String;", "emptyCollection", "get", "bundle", "Landroid/os/Bundle;", "key", "parseValue", "value", "previousValue", "put", "", "serializeAsValues", "valueEquals", "", "other", "navigation-common_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* compiled from: NavTypeConverter.kt */
public final class InternalNavType$StringNullableListType$1 extends CollectionNavType<List<? extends String>> {
    InternalNavType$StringNullableListType$1() {
        super(true);
    }

    public String getName() {
        return "List<String?>";
    }

    public void put(Bundle bundle, String key, List<String> value) {
        String[] strArr;
        Intrinsics.checkNotNullParameter(bundle, "bundle");
        Intrinsics.checkNotNullParameter(key, "key");
        if (value != null) {
            strArr = (String[]) value.toArray(new String[0]);
        } else {
            strArr = null;
        }
        bundle.putStringArray(key, strArr);
    }

    public List<String> get(Bundle bundle, String key) {
        Intrinsics.checkNotNullParameter(bundle, "bundle");
        Intrinsics.checkNotNullParameter(key, "key");
        String[] strArr = (String[]) bundle.get(key);
        if (strArr != null) {
            return ArraysKt.toList((T[]) strArr);
        }
        return null;
    }

    public List<String> parseValue(String value) {
        Intrinsics.checkNotNullParameter(value, "value");
        return CollectionsKt.listOf(NavType.StringType.parseValue(value));
    }

    /* JADX WARNING: Code restructure failed: missing block: B:2:0x0008, code lost:
        r0 = kotlin.collections.CollectionsKt.plus(r4, parseValue(r3));
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public java.util.List<java.lang.String> parseValue(java.lang.String r3, java.util.List<java.lang.String> r4) {
        /*
            r2 = this;
            java.lang.String r0 = "value"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r3, r0)
            if (r4 == 0) goto L_0x0017
            r0 = r4
            java.util.Collection r0 = (java.util.Collection) r0
            java.util.List r1 = r2.parseValue((java.lang.String) r3)
            java.lang.Iterable r1 = (java.lang.Iterable) r1
            java.util.List r0 = kotlin.collections.CollectionsKt.plus(r0, r1)
            if (r0 != 0) goto L_0x001b
        L_0x0017:
            java.util.List r0 = r2.parseValue((java.lang.String) r3)
        L_0x001b:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.navigation.serialization.InternalNavType$StringNullableListType$1.parseValue(java.lang.String, java.util.List):java.util.List");
    }

    /* JADX WARNING: type inference failed for: r0v3, types: [java.lang.Object[]] */
    /* JADX WARNING: Multi-variable type inference failed */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public boolean valueEquals(java.util.List<java.lang.String> r7, java.util.List<java.lang.String> r8) {
        /*
            r6 = this;
            r0 = 0
            r1 = 0
            if (r7 == 0) goto L_0x0012
            r2 = r7
            java.util.Collection r2 = (java.util.Collection) r2
            r3 = 0
            r4 = r2
            java.lang.String[] r5 = new java.lang.String[r0]
            java.lang.Object[] r2 = r4.toArray(r5)
            java.lang.String[] r2 = (java.lang.String[]) r2
            goto L_0x0013
        L_0x0012:
            r2 = r1
        L_0x0013:
            if (r8 == 0) goto L_0x0024
            r1 = r8
            java.util.Collection r1 = (java.util.Collection) r1
            r3 = 0
            r4 = r1
            java.lang.String[] r0 = new java.lang.String[r0]
            java.lang.Object[] r0 = r4.toArray(r0)
            r1 = r0
            java.lang.String[] r1 = (java.lang.String[]) r1
        L_0x0024:
            r0 = r1
            boolean r1 = kotlin.collections.ArraysKt.contentDeepEquals(r2, r0)
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.navigation.serialization.InternalNavType$StringNullableListType$1.valueEquals(java.util.List, java.util.List):boolean");
    }

    public List<String> serializeAsValues(List<String> value) {
        if (value == null) {
            return CollectionsKt.emptyList();
        }
        Iterable<String> $this$map$iv = value;
        Collection destination$iv$iv = new ArrayList(CollectionsKt.collectionSizeOrDefault($this$map$iv, 10));
        for (String it : $this$map$iv) {
            destination$iv$iv.add(Uri.encode(it));
        }
        return (List) destination$iv$iv;
    }

    public List<String> emptyCollection() {
        return CollectionsKt.emptyList();
    }
}
