package androidx.collection;

import androidx.collection.internal.ContainerHelpersKt;
import java.util.Collection;
import java.util.Map;
import java.util.Set;
import java.util.function.BiFunction;
import java.util.function.Function;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.markers.KMappedMarker;

@Metadata(d1 = {"\u0000r\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0005\n\u0002\u0010\u0011\n\u0002\b\u0003\n\u0002\u0010\u0016\n\u0002\b\u0006\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010$\n\u0002\b\r\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\r\n\u0002\b\b\n\u0002\u0018\u0002\n\u0000\b6\u0018\u0000*\u0004\b\u0000\u0010\u0001*\u0004\b\u0001\u0010\u00022\u00020\u0003:\u0001KB\u0007\b\u0004¢\u0006\u0002\u0010\u0004J&\u0010\u0016\u001a\u00020\u00172\u0018\u0010\u0018\u001a\u0014\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u0001\u0012\u0004\u0012\u00020\u00170\u0019H\bø\u0001\u0000J\u0006\u0010\u001a\u001a\u00020\u0017J&\u0010\u001a\u001a\u00020\u00172\u0018\u0010\u0018\u001a\u0014\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u0001\u0012\u0004\u0012\u00020\u00170\u0019H\bø\u0001\u0000J\r\u0010\u001b\u001a\u00020\u001cH\u0000¢\u0006\u0002\b\u001dJ\u0012\u0010\u001e\u001a\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\u001fJ\u0016\u0010 \u001a\u00020\u00172\u0006\u0010!\u001a\u00028\u0000H\u0002¢\u0006\u0002\u0010\"J\u0013\u0010#\u001a\u00020\u00172\u0006\u0010!\u001a\u00028\u0000¢\u0006\u0002\u0010\"J\u0013\u0010$\u001a\u00020\u00172\u0006\u0010%\u001a\u00028\u0001¢\u0006\u0002\u0010\"J\u0006\u0010&\u001a\u00020\u0006J&\u0010&\u001a\u00020\u00062\u0018\u0010\u0018\u001a\u0014\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u0001\u0012\u0004\u0012\u00020\u00170\u0019H\bø\u0001\u0000J\u0013\u0010'\u001a\u00020\u00172\b\u0010(\u001a\u0004\u0018\u00010\u0003H\u0002J\u0018\u0010)\u001a\u00020\u00062\u0006\u0010!\u001a\u00028\u0000H\b¢\u0006\u0004\b*\u0010+JD\u0010,\u001a\u00020-26\u0010.\u001a2\u0012\u0013\u0012\u00118\u0000¢\u0006\f\b/\u0012\b\b0\u0012\u0004\b\b(!\u0012\u0013\u0012\u00118\u0001¢\u0006\f\b/\u0012\b\b0\u0012\u0004\b\b(%\u0012\u0004\u0012\u00020-0\u0019H\bø\u0001\u0000J/\u00101\u001a\u00020-2!\u0010.\u001a\u001d\u0012\u0013\u0012\u00110\u0006¢\u0006\f\b/\u0012\b\b0\u0012\u0004\b\b(3\u0012\u0004\u0012\u00020-02H\bø\u0001\u0000J/\u00104\u001a\u00020-2!\u0010.\u001a\u001d\u0012\u0013\u0012\u00118\u0000¢\u0006\f\b/\u0012\b\b0\u0012\u0004\b\b(!\u0012\u0004\u0012\u00020-02H\bø\u0001\u0000J/\u00105\u001a\u00020-2!\u0010.\u001a\u001d\u0012\u0013\u0012\u00118\u0001¢\u0006\f\b/\u0012\b\b0\u0012\u0004\b\b(%\u0012\u0004\u0012\u00020-02H\bø\u0001\u0000J\u0018\u00106\u001a\u0004\u0018\u00018\u00012\u0006\u0010!\u001a\u00028\u0000H\u0002¢\u0006\u0002\u00107J\u001b\u00108\u001a\u00028\u00012\u0006\u0010!\u001a\u00028\u00002\u0006\u00109\u001a\u00028\u0001¢\u0006\u0002\u0010:J'\u0010;\u001a\u00028\u00012\u0006\u0010!\u001a\u00028\u00002\f\u00109\u001a\b\u0012\u0004\u0012\u00028\u00010<H\bø\u0001\u0000¢\u0006\u0002\u0010=J\b\u0010>\u001a\u00020\u0006H\u0016J\u0006\u0010?\u001a\u00020\u0017J\u0006\u0010@\u001a\u00020\u0017Jv\u0010A\u001a\u00020\u001c2\b\b\u0002\u0010B\u001a\u00020C2\b\b\u0002\u0010D\u001a\u00020C2\b\b\u0002\u0010E\u001a\u00020C2\b\b\u0002\u0010F\u001a\u00020\u00062\b\b\u0002\u0010G\u001a\u00020C2:\b\u0002\u0010H\u001a4\u0012\u0013\u0012\u00118\u0000¢\u0006\f\b/\u0012\b\b0\u0012\u0004\b\b(!\u0012\u0013\u0012\u00118\u0001¢\u0006\f\b/\u0012\b\b0\u0012\u0004\b\b(%\u0012\u0004\u0012\u00020C\u0018\u00010\u0019H\u0007J\u0006\u0010I\u001a\u00020\u0017J\b\u0010J\u001a\u00020\u001cH\u0016R\u0012\u0010\u0005\u001a\u00020\u00068\u0000@\u0000X\u000e¢\u0006\u0002\n\u0000R\u0012\u0010\u0007\u001a\u00020\u00068\u0000@\u0000X\u000e¢\u0006\u0002\n\u0000R\u0011\u0010\b\u001a\u00020\u00068F¢\u0006\u0006\u001a\u0004\b\t\u0010\nR\"\u0010\u000b\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00030\f8\u0000@\u0000X\u000e¢\u0006\n\n\u0002\u0010\u000e\u0012\u0004\b\r\u0010\u0004R\u0018\u0010\u000f\u001a\u00020\u00108\u0000@\u0000X\u000e¢\u0006\b\n\u0000\u0012\u0004\b\u0011\u0010\u0004R\u0011\u0010\u0012\u001a\u00020\u00068F¢\u0006\u0006\u001a\u0004\b\u0013\u0010\nR\"\u0010\u0014\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00030\f8\u0000@\u0000X\u000e¢\u0006\n\n\u0002\u0010\u000e\u0012\u0004\b\u0015\u0010\u0004\u0001\u0001L\u0002\u0007\n\u0005\b20\u0001¨\u0006M"}, d2 = {"Landroidx/collection/ScatterMap;", "K", "V", "", "()V", "_capacity", "", "_size", "capacity", "getCapacity", "()I", "keys", "", "getKeys$annotations", "[Ljava/lang/Object;", "metadata", "", "getMetadata$annotations", "size", "getSize", "values", "getValues$annotations", "all", "", "predicate", "Lkotlin/Function2;", "any", "asDebugString", "", "asDebugString$collection", "asMap", "", "contains", "key", "(Ljava/lang/Object;)Z", "containsKey", "containsValue", "value", "count", "equals", "other", "findKeyIndex", "findKeyIndex$collection", "(Ljava/lang/Object;)I", "forEach", "", "block", "Lkotlin/ParameterName;", "name", "forEachIndexed", "Lkotlin/Function1;", "index", "forEachKey", "forEachValue", "get", "(Ljava/lang/Object;)Ljava/lang/Object;", "getOrDefault", "defaultValue", "(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;", "getOrElse", "Lkotlin/Function0;", "(Ljava/lang/Object;Lkotlin/jvm/functions/Function0;)Ljava/lang/Object;", "hashCode", "isEmpty", "isNotEmpty", "joinToString", "separator", "", "prefix", "postfix", "limit", "truncated", "transform", "none", "toString", "MapWrapper", "Landroidx/collection/MutableScatterMap;", "collection"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* compiled from: ScatterMap.kt */
public abstract class ScatterMap<K, V> {
    public int _capacity;
    public int _size;
    public Object[] keys;
    public long[] metadata;
    public Object[] values;

    public /* synthetic */ ScatterMap(DefaultConstructorMarker defaultConstructorMarker) {
        this();
    }

    public static /* synthetic */ void getKeys$annotations() {
    }

    public static /* synthetic */ void getMetadata$annotations() {
    }

    public static /* synthetic */ void getValues$annotations() {
    }

    public final String joinToString() {
        return joinToString$default(this, (CharSequence) null, (CharSequence) null, (CharSequence) null, 0, (CharSequence) null, (Function2) null, 63, (Object) null);
    }

    public final String joinToString(CharSequence charSequence) {
        Intrinsics.checkNotNullParameter(charSequence, "separator");
        return joinToString$default(this, charSequence, (CharSequence) null, (CharSequence) null, 0, (CharSequence) null, (Function2) null, 62, (Object) null);
    }

    public final String joinToString(CharSequence charSequence, CharSequence charSequence2) {
        Intrinsics.checkNotNullParameter(charSequence, "separator");
        Intrinsics.checkNotNullParameter(charSequence2, "prefix");
        return joinToString$default(this, charSequence, charSequence2, (CharSequence) null, 0, (CharSequence) null, (Function2) null, 60, (Object) null);
    }

    public final String joinToString(CharSequence charSequence, CharSequence charSequence2, CharSequence charSequence3) {
        Intrinsics.checkNotNullParameter(charSequence, "separator");
        Intrinsics.checkNotNullParameter(charSequence2, "prefix");
        Intrinsics.checkNotNullParameter(charSequence3, "postfix");
        return joinToString$default(this, charSequence, charSequence2, charSequence3, 0, (CharSequence) null, (Function2) null, 56, (Object) null);
    }

    public final String joinToString(CharSequence charSequence, CharSequence charSequence2, CharSequence charSequence3, int i) {
        Intrinsics.checkNotNullParameter(charSequence, "separator");
        Intrinsics.checkNotNullParameter(charSequence2, "prefix");
        Intrinsics.checkNotNullParameter(charSequence3, "postfix");
        return joinToString$default(this, charSequence, charSequence2, charSequence3, i, (CharSequence) null, (Function2) null, 48, (Object) null);
    }

    public final String joinToString(CharSequence charSequence, CharSequence charSequence2, CharSequence charSequence3, int i, CharSequence charSequence4) {
        Intrinsics.checkNotNullParameter(charSequence, "separator");
        Intrinsics.checkNotNullParameter(charSequence2, "prefix");
        Intrinsics.checkNotNullParameter(charSequence3, "postfix");
        Intrinsics.checkNotNullParameter(charSequence4, "truncated");
        return joinToString$default(this, charSequence, charSequence2, charSequence3, i, charSequence4, (Function2) null, 32, (Object) null);
    }

    private ScatterMap() {
        this.metadata = ScatterMapKt.EmptyGroup;
        this.keys = ContainerHelpersKt.EMPTY_OBJECTS;
        this.values = ContainerHelpersKt.EMPTY_OBJECTS;
    }

    public final int getCapacity() {
        return this._capacity;
    }

    public final int getSize() {
        return this._size;
    }

    public final boolean any() {
        return this._size != 0;
    }

    public final boolean none() {
        return this._size == 0;
    }

    public final boolean isEmpty() {
        return this._size == 0;
    }

    public final boolean isNotEmpty() {
        return this._size != 0;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:14:0x0090, code lost:
        r9 = r4;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:15:0x009e, code lost:
        if (((((~r9) << 6) & r9) & -9187201950435737472L) == 0) goto L_0x00b0;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:16:0x00a0, code lost:
        r9 = -1;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final V get(K r24) {
        /*
            r23 = this;
            r0 = r24
            r1 = r23
            r2 = 0
            r3 = 0
            if (r0 == 0) goto L_0x000d
            int r5 = r24.hashCode()
            goto L_0x000e
        L_0x000d:
            r5 = 0
        L_0x000e:
            r6 = -862048943(0xffffffffcc9e2d51, float:-8.2930312E7)
            int r5 = r5 * r6
            int r6 = r5 << 16
            r3 = r5 ^ r6
            r5 = 0
            r5 = r3 & 127(0x7f, float:1.78E-43)
            int r6 = r1._capacity
            r7 = 0
            int r7 = r3 >>> 7
            r7 = r7 & r6
            r8 = 0
        L_0x0022:
            long[] r9 = r1.metadata
            r10 = 0
            int r11 = r7 >> 3
            r12 = r7 & 7
            int r12 = r12 << 3
            r13 = r9[r11]
            long r13 = r13 >>> r12
            int r15 = r11 + 1
            r15 = r9[r15]
            int r17 = 64 - r12
            long r15 = r15 << r17
            r18 = r5
            long r4 = (long) r12
            long r4 = -r4
            r19 = 63
            long r4 = r4 >> r19
            long r4 = r4 & r15
            long r4 = r4 | r13
            r9 = r4
            r11 = 0
            r12 = r18
            long r13 = (long) r12
            r15 = 72340172838076673(0x101010101010101, double:7.748604185489348E-304)
            long r13 = r13 * r15
            long r13 = r13 ^ r9
            long r15 = r13 - r15
            r18 = r2
            r19 = r3
            long r2 = ~r13
            long r2 = r2 & r15
            r15 = -9187201950435737472(0x8080808080808080, double:-2.937446524422997E-306)
            long r2 = r2 & r15
        L_0x005d:
            r9 = r2
            r11 = 0
            r13 = 0
            int r20 = (r9 > r13 ? 1 : (r9 == r13 ? 0 : -1))
            if (r20 == 0) goto L_0x0068
            r20 = 1
            goto L_0x006a
        L_0x0068:
            r20 = 0
        L_0x006a:
            if (r20 == 0) goto L_0x0090
            r9 = r2
            r11 = 0
            r13 = r9
            r20 = 0
            int r21 = java.lang.Long.numberOfTrailingZeros(r13)
            int r13 = r21 >> 3
            int r13 = r13 + r7
            r9 = r13 & r6
            java.lang.Object[] r10 = r1.keys
            r10 = r10[r9]
            boolean r10 = kotlin.jvm.internal.Intrinsics.areEqual((java.lang.Object) r10, (java.lang.Object) r0)
            if (r10 == 0) goto L_0x0086
            goto L_0x00a2
        L_0x0086:
            r10 = r2
            r13 = 0
            r20 = 1
            long r20 = r10 - r20
            long r10 = r10 & r20
            r2 = r10
            goto L_0x005d
        L_0x0090:
            r9 = r4
            r11 = 0
            long r13 = ~r9
            r22 = 6
            long r13 = r13 << r22
            long r13 = r13 & r9
            long r9 = r13 & r15
            r13 = 0
            int r9 = (r9 > r13 ? 1 : (r9 == r13 ? 0 : -1))
            if (r9 == 0) goto L_0x00b0
            r9 = -1
        L_0x00a2:
            r1 = r9
            if (r1 < 0) goto L_0x00ac
            r9 = r23
            java.lang.Object[] r2 = r9.values
            r2 = r2[r1]
            goto L_0x00af
        L_0x00ac:
            r9 = r23
            r2 = 0
        L_0x00af:
            return r2
        L_0x00b0:
            r9 = r23
            int r8 = r8 + 8
            int r10 = r7 + r8
            r7 = r10 & r6
            r5 = r12
            r2 = r18
            r3 = r19
            goto L_0x0022
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.collection.ScatterMap.get(java.lang.Object):java.lang.Object");
    }

    /* JADX WARNING: Code restructure failed: missing block: B:14:0x0090, code lost:
        r9 = r4;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:15:0x009e, code lost:
        if (((((~r9) << 6) & r9) & -9187201950435737472L) == 0) goto L_0x00af;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:16:0x00a0, code lost:
        r9 = -1;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final V getOrDefault(K r24, V r25) {
        /*
            r23 = this;
            r0 = r24
            r1 = r23
            r2 = 0
            r3 = 0
            if (r0 == 0) goto L_0x000d
            int r5 = r24.hashCode()
            goto L_0x000e
        L_0x000d:
            r5 = 0
        L_0x000e:
            r6 = -862048943(0xffffffffcc9e2d51, float:-8.2930312E7)
            int r5 = r5 * r6
            int r6 = r5 << 16
            r3 = r5 ^ r6
            r5 = 0
            r5 = r3 & 127(0x7f, float:1.78E-43)
            int r6 = r1._capacity
            r7 = 0
            int r7 = r3 >>> 7
            r7 = r7 & r6
            r8 = 0
        L_0x0022:
            long[] r9 = r1.metadata
            r10 = 0
            int r11 = r7 >> 3
            r12 = r7 & 7
            int r12 = r12 << 3
            r13 = r9[r11]
            long r13 = r13 >>> r12
            int r15 = r11 + 1
            r15 = r9[r15]
            int r17 = 64 - r12
            long r15 = r15 << r17
            r18 = r5
            long r4 = (long) r12
            long r4 = -r4
            r19 = 63
            long r4 = r4 >> r19
            long r4 = r4 & r15
            long r4 = r4 | r13
            r9 = r4
            r11 = 0
            r12 = r18
            long r13 = (long) r12
            r15 = 72340172838076673(0x101010101010101, double:7.748604185489348E-304)
            long r13 = r13 * r15
            long r13 = r13 ^ r9
            long r15 = r13 - r15
            r18 = r2
            r19 = r3
            long r2 = ~r13
            long r2 = r2 & r15
            r15 = -9187201950435737472(0x8080808080808080, double:-2.937446524422997E-306)
            long r2 = r2 & r15
        L_0x005d:
            r9 = r2
            r11 = 0
            r13 = 0
            int r20 = (r9 > r13 ? 1 : (r9 == r13 ? 0 : -1))
            if (r20 == 0) goto L_0x0068
            r20 = 1
            goto L_0x006a
        L_0x0068:
            r20 = 0
        L_0x006a:
            if (r20 == 0) goto L_0x0090
            r9 = r2
            r11 = 0
            r13 = r9
            r20 = 0
            int r21 = java.lang.Long.numberOfTrailingZeros(r13)
            int r13 = r21 >> 3
            int r13 = r13 + r7
            r9 = r13 & r6
            java.lang.Object[] r10 = r1.keys
            r10 = r10[r9]
            boolean r10 = kotlin.jvm.internal.Intrinsics.areEqual((java.lang.Object) r10, (java.lang.Object) r0)
            if (r10 == 0) goto L_0x0086
            goto L_0x00a2
        L_0x0086:
            r10 = r2
            r13 = 0
            r20 = 1
            long r20 = r10 - r20
            long r10 = r10 & r20
            r2 = r10
            goto L_0x005d
        L_0x0090:
            r9 = r4
            r11 = 0
            long r13 = ~r9
            r22 = 6
            long r13 = r13 << r22
            long r13 = r13 & r9
            long r9 = r13 & r15
            r13 = 0
            int r9 = (r9 > r13 ? 1 : (r9 == r13 ? 0 : -1))
            if (r9 == 0) goto L_0x00af
            r9 = -1
        L_0x00a2:
            r1 = r9
            if (r1 < 0) goto L_0x00ac
            r9 = r23
            java.lang.Object[] r2 = r9.values
            r2 = r2[r1]
            return r2
        L_0x00ac:
            r9 = r23
            return r25
        L_0x00af:
            r9 = r23
            int r8 = r8 + 8
            int r10 = r7 + r8
            r7 = r10 & r6
            r5 = r12
            r2 = r18
            r3 = r19
            goto L_0x0022
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.collection.ScatterMap.getOrDefault(java.lang.Object, java.lang.Object):java.lang.Object");
    }

    public final V getOrElse(K key, Function0<? extends V> defaultValue) {
        Intrinsics.checkNotNullParameter(defaultValue, "defaultValue");
        V v = get(key);
        return v == null ? defaultValue.invoke() : v;
    }

    public final void forEachIndexed(Function1<? super Integer, Unit> block) {
        Intrinsics.checkNotNullParameter(block, "block");
        long[] m = this.metadata;
        int lastIndex = m.length - 2;
        int i = 0;
        if (0 <= lastIndex) {
            while (true) {
                long slot = m[i];
                long $this$maskEmptyOrDeleted$iv = slot;
                if ((((~$this$maskEmptyOrDeleted$iv) << 7) & $this$maskEmptyOrDeleted$iv & -9187201950435737472L) != -9187201950435737472L) {
                    int bitCount = 8 - ((~(i - lastIndex)) >>> 31);
                    for (int j = 0; j < bitCount; j++) {
                        if ((255 & slot) < 128) {
                            block.invoke(Integer.valueOf((i << 3) + j));
                        }
                        slot >>= 8;
                    }
                    if (bitCount != 8) {
                        return;
                    }
                }
                if (i != lastIndex) {
                    i++;
                } else {
                    return;
                }
            }
        }
    }

    public final void forEach(Function2<? super K, ? super V, Unit> block) {
        Function2<? super K, ? super V, Unit> function2 = block;
        Intrinsics.checkNotNullParameter(function2, "block");
        Object[] k = this.keys;
        Object[] v = this.values;
        ScatterMap this_$iv = this;
        int $i$f$forEachIndexed = 0;
        long[] m$iv = this_$iv.metadata;
        int lastIndex$iv = m$iv.length - 2;
        int i$iv = 0;
        if (0 <= lastIndex$iv) {
            while (true) {
                long slot$iv = m$iv[i$iv];
                long $this$maskEmptyOrDeleted$iv$iv = slot$iv;
                ScatterMap this_$iv2 = this_$iv;
                int $i$f$forEachIndexed2 = $i$f$forEachIndexed;
                if ((((~$this$maskEmptyOrDeleted$iv$iv) << 7) & $this$maskEmptyOrDeleted$iv$iv & -9187201950435737472L) != -9187201950435737472L) {
                    int i = 8;
                    int bitCount$iv = 8 - ((~(i$iv - lastIndex$iv)) >>> 31);
                    int j$iv = 0;
                    while (j$iv < bitCount$iv) {
                        if ((255 & slot$iv) < 128) {
                            int index = (i$iv << 3) + j$iv;
                            function2.invoke(k[index], v[index]);
                        }
                        slot$iv >>= 8;
                        j$iv++;
                        i = 8;
                    }
                    if (bitCount$iv != i) {
                        return;
                    }
                }
                if (i$iv != lastIndex$iv) {
                    i$iv++;
                    this_$iv = this_$iv2;
                    $i$f$forEachIndexed = $i$f$forEachIndexed2;
                } else {
                    return;
                }
            }
        }
    }

    public final void forEachKey(Function1<? super K, Unit> block) {
        Function1<? super K, Unit> function1 = block;
        Intrinsics.checkNotNullParameter(function1, "block");
        Object[] k = this.keys;
        long[] m$iv = this.metadata;
        int lastIndex$iv = m$iv.length - 2;
        int i$iv = 0;
        if (0 <= lastIndex$iv) {
            while (true) {
                long slot$iv = m$iv[i$iv];
                long $this$maskEmptyOrDeleted$iv$iv = slot$iv;
                if ((((~$this$maskEmptyOrDeleted$iv$iv) << 7) & $this$maskEmptyOrDeleted$iv$iv & -9187201950435737472L) != -9187201950435737472L) {
                    int i = 8;
                    int bitCount$iv = 8 - ((~(i$iv - lastIndex$iv)) >>> 31);
                    for (int j$iv = 0; j$iv < bitCount$iv; j$iv++) {
                        if ((255 & slot$iv) < 128) {
                            function1.invoke(k[(i$iv << 3) + j$iv]);
                        }
                        i = 8;
                        slot$iv >>= 8;
                    }
                    if (bitCount$iv != i) {
                        return;
                    }
                }
                if (i$iv != lastIndex$iv) {
                    i$iv++;
                } else {
                    return;
                }
            }
        }
    }

    public final void forEachValue(Function1<? super V, Unit> block) {
        Function1<? super V, Unit> function1 = block;
        Intrinsics.checkNotNullParameter(function1, "block");
        Object[] v = this.values;
        long[] m$iv = this.metadata;
        int lastIndex$iv = m$iv.length - 2;
        int i$iv = 0;
        if (0 <= lastIndex$iv) {
            while (true) {
                long slot$iv = m$iv[i$iv];
                long $this$maskEmptyOrDeleted$iv$iv = slot$iv;
                if ((((~$this$maskEmptyOrDeleted$iv$iv) << 7) & $this$maskEmptyOrDeleted$iv$iv & -9187201950435737472L) != -9187201950435737472L) {
                    int i = 8;
                    int bitCount$iv = 8 - ((~(i$iv - lastIndex$iv)) >>> 31);
                    for (int j$iv = 0; j$iv < bitCount$iv; j$iv++) {
                        if ((255 & slot$iv) < 128) {
                            function1.invoke(v[(i$iv << 3) + j$iv]);
                        }
                        i = 8;
                        slot$iv >>= 8;
                    }
                    if (bitCount$iv != i) {
                        return;
                    }
                }
                if (i$iv != lastIndex$iv) {
                    i$iv++;
                } else {
                    return;
                }
            }
        }
    }

    public final boolean all(Function2<? super K, ? super V, Boolean> predicate) {
        int $i$f$all;
        int $i$f$all2;
        Function2<? super K, ? super V, Boolean> function2 = predicate;
        Intrinsics.checkNotNullParameter(function2, "predicate");
        int $i$f$all3 = 0;
        Object[] k$iv = this.keys;
        Object[] v$iv = this.values;
        long[] m$iv$iv = this.metadata;
        int lastIndex$iv$iv = m$iv$iv.length - 2;
        int i$iv$iv = 0;
        if (0 > lastIndex$iv$iv) {
            return true;
        }
        while (true) {
            long slot$iv$iv = m$iv$iv[i$iv$iv];
            long $this$maskEmptyOrDeleted$iv$iv$iv = slot$iv$iv;
            long slot$iv$iv2 = slot$iv$iv;
            if ((((~$this$maskEmptyOrDeleted$iv$iv$iv) << 7) & $this$maskEmptyOrDeleted$iv$iv$iv & -9187201950435737472L) != -9187201950435737472L) {
                int $i$f$all4 = 8;
                int bitCount$iv$iv = 8 - ((~(i$iv$iv - lastIndex$iv$iv)) >>> 31);
                int j$iv$iv = 0;
                while (j$iv$iv < bitCount$iv$iv) {
                    if ((slot$iv$iv2 & 255) < 128) {
                        int index$iv = (i$iv$iv << 3) + j$iv$iv;
                        $i$f$all2 = $i$f$all3;
                        if (!function2.invoke(k$iv[index$iv], v$iv[index$iv]).booleanValue()) {
                            return false;
                        }
                    } else {
                        $i$f$all2 = $i$f$all3;
                    }
                    slot$iv$iv2 >>= 8;
                    j$iv$iv++;
                    $i$f$all4 = 8;
                    $i$f$all3 = $i$f$all2;
                }
                $i$f$all = $i$f$all3;
                if (bitCount$iv$iv != $i$f$all4) {
                    return true;
                }
            } else {
                $i$f$all = $i$f$all3;
            }
            if (i$iv$iv == lastIndex$iv$iv) {
                return true;
            }
            i$iv$iv++;
            $i$f$all3 = $i$f$all;
        }
    }

    public final boolean any(Function2<? super K, ? super V, Boolean> predicate) {
        int $i$f$any;
        int $i$f$any2;
        Function2<? super K, ? super V, Boolean> function2 = predicate;
        Intrinsics.checkNotNullParameter(function2, "predicate");
        int $i$f$any3 = 0;
        Object[] k$iv = this.keys;
        Object[] v$iv = this.values;
        long[] m$iv$iv = this.metadata;
        int lastIndex$iv$iv = m$iv$iv.length - 2;
        int i$iv$iv = 0;
        if (0 > lastIndex$iv$iv) {
            return false;
        }
        while (true) {
            long slot$iv$iv = m$iv$iv[i$iv$iv];
            long $this$maskEmptyOrDeleted$iv$iv$iv = slot$iv$iv;
            long slot$iv$iv2 = slot$iv$iv;
            if ((((~$this$maskEmptyOrDeleted$iv$iv$iv) << 7) & $this$maskEmptyOrDeleted$iv$iv$iv & -9187201950435737472L) != -9187201950435737472L) {
                int $i$f$any4 = 8;
                int bitCount$iv$iv = 8 - ((~(i$iv$iv - lastIndex$iv$iv)) >>> 31);
                int j$iv$iv = 0;
                while (j$iv$iv < bitCount$iv$iv) {
                    if ((slot$iv$iv2 & 255) < 128) {
                        int index$iv = (i$iv$iv << 3) + j$iv$iv;
                        $i$f$any2 = $i$f$any3;
                        if (function2.invoke(k$iv[index$iv], v$iv[index$iv]).booleanValue()) {
                            return true;
                        }
                    } else {
                        $i$f$any2 = $i$f$any3;
                    }
                    slot$iv$iv2 >>= 8;
                    j$iv$iv++;
                    $i$f$any4 = 8;
                    $i$f$any3 = $i$f$any2;
                }
                $i$f$any = $i$f$any3;
                if (bitCount$iv$iv != $i$f$any4) {
                    return false;
                }
            } else {
                $i$f$any = $i$f$any3;
            }
            if (i$iv$iv == lastIndex$iv$iv) {
                return false;
            }
            i$iv$iv++;
            $i$f$any3 = $i$f$any;
        }
    }

    public final int count() {
        return getSize();
    }

    public final int count(Function2<? super K, ? super V, Boolean> predicate) {
        ScatterMap this_$iv;
        ScatterMap this_$iv2;
        Function2<? super K, ? super V, Boolean> function2 = predicate;
        Intrinsics.checkNotNullParameter(function2, "predicate");
        int $i$f$count = 0;
        int count = 0;
        ScatterMap this_$iv3 = this;
        Object[] k$iv = this_$iv3.keys;
        Object[] v$iv = this_$iv3.values;
        long[] m$iv$iv = this_$iv3.metadata;
        int lastIndex$iv$iv = m$iv$iv.length - 2;
        int i$iv$iv = 0;
        if (0 <= lastIndex$iv$iv) {
            while (true) {
                long slot$iv$iv = m$iv$iv[i$iv$iv];
                long $this$maskEmptyOrDeleted$iv$iv$iv = slot$iv$iv;
                int $i$f$count2 = $i$f$count;
                int count2 = count;
                if ((((~$this$maskEmptyOrDeleted$iv$iv$iv) << 7) & $this$maskEmptyOrDeleted$iv$iv$iv & -9187201950435737472L) != -9187201950435737472L) {
                    int i = 8;
                    int bitCount$iv$iv = 8 - ((~(i$iv$iv - lastIndex$iv$iv)) >>> 31);
                    int j$iv$iv = 0;
                    while (j$iv$iv < bitCount$iv$iv) {
                        if ((255 & slot$iv$iv) < 128) {
                            int index$iv = (i$iv$iv << 3) + j$iv$iv;
                            this_$iv2 = this_$iv3;
                            if (((Boolean) function2.invoke(k$iv[index$iv], v$iv[index$iv])).booleanValue()) {
                                count2++;
                            }
                        } else {
                            this_$iv2 = this_$iv3;
                        }
                        i = 8;
                        slot$iv$iv >>= 8;
                        j$iv$iv++;
                        this_$iv3 = this_$iv2;
                    }
                    this_$iv = this_$iv3;
                    if (bitCount$iv$iv != i) {
                        return count2;
                    }
                    count = count2;
                } else {
                    this_$iv = this_$iv3;
                    count = count2;
                }
                if (i$iv$iv == lastIndex$iv$iv) {
                    break;
                }
                i$iv$iv++;
                $i$f$count = $i$f$count2;
                this_$iv3 = this_$iv;
            }
        } else {
            ScatterMap scatterMap = this_$iv3;
        }
        return count;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:14:0x0091, code lost:
        r9 = r4;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:15:0x009f, code lost:
        if (((((~r9) << 6) & r9) & -9187201950435737472L) == 0) goto L_0x00aa;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:16:0x00a1, code lost:
        r9 = -1;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final boolean contains(K r24) {
        /*
            r23 = this;
            r0 = r24
            r1 = r23
            r2 = 0
            r3 = 0
            if (r0 == 0) goto L_0x000d
            int r5 = r24.hashCode()
            goto L_0x000e
        L_0x000d:
            r5 = 0
        L_0x000e:
            r6 = -862048943(0xffffffffcc9e2d51, float:-8.2930312E7)
            int r5 = r5 * r6
            int r6 = r5 << 16
            r3 = r5 ^ r6
            r5 = 0
            r5 = r3 & 127(0x7f, float:1.78E-43)
            int r6 = r1._capacity
            r7 = 0
            int r7 = r3 >>> 7
            r7 = r7 & r6
            r8 = 0
        L_0x0022:
            long[] r9 = r1.metadata
            r10 = 0
            int r11 = r7 >> 3
            r12 = r7 & 7
            int r12 = r12 << 3
            r13 = r9[r11]
            long r13 = r13 >>> r12
            int r15 = r11 + 1
            r15 = r9[r15]
            int r17 = 64 - r12
            long r15 = r15 << r17
            r18 = r5
            long r4 = (long) r12
            long r4 = -r4
            r19 = 63
            long r4 = r4 >> r19
            long r4 = r4 & r15
            long r4 = r4 | r13
            r9 = r4
            r11 = 0
            r12 = r18
            long r13 = (long) r12
            r15 = 72340172838076673(0x101010101010101, double:7.748604185489348E-304)
            long r13 = r13 * r15
            long r13 = r13 ^ r9
            long r15 = r13 - r15
            r18 = r2
            r19 = r3
            long r2 = ~r13
            long r2 = r2 & r15
            r15 = -9187201950435737472(0x8080808080808080, double:-2.937446524422997E-306)
            long r2 = r2 & r15
        L_0x005d:
            r9 = r2
            r11 = 0
            r13 = 0
            int r20 = (r9 > r13 ? 1 : (r9 == r13 ? 0 : -1))
            r21 = 1
            if (r20 == 0) goto L_0x006a
            r9 = r21
            goto L_0x006b
        L_0x006a:
            r9 = 0
        L_0x006b:
            if (r9 == 0) goto L_0x0091
            r9 = r2
            r11 = 0
            r13 = r9
            r20 = 0
            int r22 = java.lang.Long.numberOfTrailingZeros(r13)
            int r13 = r22 >> 3
            int r13 = r13 + r7
            r9 = r13 & r6
            java.lang.Object[] r10 = r1.keys
            r10 = r10[r9]
            boolean r10 = kotlin.jvm.internal.Intrinsics.areEqual((java.lang.Object) r10, (java.lang.Object) r0)
            if (r10 == 0) goto L_0x0087
            goto L_0x00a3
        L_0x0087:
            r10 = r2
            r13 = 0
            r20 = 1
            long r20 = r10 - r20
            long r10 = r10 & r20
            r2 = r10
            goto L_0x005d
        L_0x0091:
            r9 = r4
            r11 = 0
            long r13 = ~r9
            r20 = 6
            long r13 = r13 << r20
            long r13 = r13 & r9
            long r9 = r13 & r15
            r13 = 0
            int r9 = (r9 > r13 ? 1 : (r9 == r13 ? 0 : -1))
            if (r9 == 0) goto L_0x00aa
            r9 = -1
        L_0x00a3:
            if (r9 < 0) goto L_0x00a8
            r4 = r21
            goto L_0x00a9
        L_0x00a8:
            r4 = 0
        L_0x00a9:
            return r4
        L_0x00aa:
            int r8 = r8 + 8
            int r9 = r7 + r8
            r7 = r9 & r6
            r5 = r12
            r2 = r18
            r3 = r19
            goto L_0x0022
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.collection.ScatterMap.contains(java.lang.Object):boolean");
    }

    /* JADX WARNING: Code restructure failed: missing block: B:14:0x0091, code lost:
        r9 = r4;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:15:0x009f, code lost:
        if (((((~r9) << 6) & r9) & -9187201950435737472L) == 0) goto L_0x00aa;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:16:0x00a1, code lost:
        r9 = -1;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final boolean containsKey(K r24) {
        /*
            r23 = this;
            r0 = r24
            r1 = r23
            r2 = 0
            r3 = 0
            if (r0 == 0) goto L_0x000d
            int r5 = r24.hashCode()
            goto L_0x000e
        L_0x000d:
            r5 = 0
        L_0x000e:
            r6 = -862048943(0xffffffffcc9e2d51, float:-8.2930312E7)
            int r5 = r5 * r6
            int r6 = r5 << 16
            r3 = r5 ^ r6
            r5 = 0
            r5 = r3 & 127(0x7f, float:1.78E-43)
            int r6 = r1._capacity
            r7 = 0
            int r7 = r3 >>> 7
            r7 = r7 & r6
            r8 = 0
        L_0x0022:
            long[] r9 = r1.metadata
            r10 = 0
            int r11 = r7 >> 3
            r12 = r7 & 7
            int r12 = r12 << 3
            r13 = r9[r11]
            long r13 = r13 >>> r12
            int r15 = r11 + 1
            r15 = r9[r15]
            int r17 = 64 - r12
            long r15 = r15 << r17
            r18 = r5
            long r4 = (long) r12
            long r4 = -r4
            r19 = 63
            long r4 = r4 >> r19
            long r4 = r4 & r15
            long r4 = r4 | r13
            r9 = r4
            r11 = 0
            r12 = r18
            long r13 = (long) r12
            r15 = 72340172838076673(0x101010101010101, double:7.748604185489348E-304)
            long r13 = r13 * r15
            long r13 = r13 ^ r9
            long r15 = r13 - r15
            r18 = r2
            r19 = r3
            long r2 = ~r13
            long r2 = r2 & r15
            r15 = -9187201950435737472(0x8080808080808080, double:-2.937446524422997E-306)
            long r2 = r2 & r15
        L_0x005d:
            r9 = r2
            r11 = 0
            r13 = 0
            int r20 = (r9 > r13 ? 1 : (r9 == r13 ? 0 : -1))
            r21 = 1
            if (r20 == 0) goto L_0x006a
            r9 = r21
            goto L_0x006b
        L_0x006a:
            r9 = 0
        L_0x006b:
            if (r9 == 0) goto L_0x0091
            r9 = r2
            r11 = 0
            r13 = r9
            r20 = 0
            int r22 = java.lang.Long.numberOfTrailingZeros(r13)
            int r13 = r22 >> 3
            int r13 = r13 + r7
            r9 = r13 & r6
            java.lang.Object[] r10 = r1.keys
            r10 = r10[r9]
            boolean r10 = kotlin.jvm.internal.Intrinsics.areEqual((java.lang.Object) r10, (java.lang.Object) r0)
            if (r10 == 0) goto L_0x0087
            goto L_0x00a3
        L_0x0087:
            r10 = r2
            r13 = 0
            r20 = 1
            long r20 = r10 - r20
            long r10 = r10 & r20
            r2 = r10
            goto L_0x005d
        L_0x0091:
            r9 = r4
            r11 = 0
            long r13 = ~r9
            r20 = 6
            long r13 = r13 << r20
            long r13 = r13 & r9
            long r9 = r13 & r15
            r13 = 0
            int r9 = (r9 > r13 ? 1 : (r9 == r13 ? 0 : -1))
            if (r9 == 0) goto L_0x00aa
            r9 = -1
        L_0x00a3:
            if (r9 < 0) goto L_0x00a8
            r4 = r21
            goto L_0x00a9
        L_0x00a8:
            r4 = 0
        L_0x00a9:
            return r4
        L_0x00aa:
            int r8 = r8 + 8
            int r9 = r7 + r8
            r7 = r9 & r6
            r5 = r12
            r2 = r18
            r3 = r19
            goto L_0x0022
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.collection.ScatterMap.containsKey(java.lang.Object):boolean");
    }

    public final boolean containsValue(V value) {
        Object[] v$iv = this.values;
        long[] m$iv$iv = this.metadata;
        int lastIndex$iv$iv = m$iv$iv.length - 2;
        int i$iv$iv = 0;
        if (0 <= lastIndex$iv$iv) {
            while (true) {
                long slot$iv$iv = m$iv$iv[i$iv$iv];
                long $this$maskEmptyOrDeleted$iv$iv$iv = slot$iv$iv;
                if ((((~$this$maskEmptyOrDeleted$iv$iv$iv) << 7) & $this$maskEmptyOrDeleted$iv$iv$iv & -9187201950435737472L) != -9187201950435737472L) {
                    int i = 8;
                    int bitCount$iv$iv = 8 - ((~(i$iv$iv - lastIndex$iv$iv)) >>> 31);
                    int j$iv$iv = 0;
                    while (j$iv$iv < bitCount$iv$iv) {
                        if ((255 & slot$iv$iv) < 128) {
                            if (Intrinsics.areEqual((Object) value, v$iv[(i$iv$iv << 3) + j$iv$iv])) {
                                return true;
                            }
                        } else {
                            V v = value;
                        }
                        slot$iv$iv >>= 8;
                        j$iv$iv++;
                        i = 8;
                    }
                    int i2 = i;
                    V v2 = value;
                    if (bitCount$iv$iv != i2) {
                        return false;
                    }
                } else {
                    V v3 = value;
                }
                if (i$iv$iv == lastIndex$iv$iv) {
                    return false;
                }
                i$iv$iv++;
            }
        } else {
            V v4 = value;
            return false;
        }
    }

    public static /* synthetic */ String joinToString$default(ScatterMap scatterMap, CharSequence charSequence, CharSequence charSequence2, CharSequence charSequence3, int i, CharSequence charSequence4, Function2 function2, int i2, Object obj) {
        int i3;
        CharSequence charSequence5;
        if (obj == null) {
            if ((i2 & 1) != 0) {
            }
            String str = (i2 & 2) != 0 ? "" : charSequence2;
            String str2 = (i2 & 4) != 0 ? "" : charSequence3;
            if ((i2 & 8) != 0) {
                i3 = -1;
            } else {
                i3 = i;
            }
            if ((i2 & 16) != 0) {
                charSequence5 = "...";
            } else {
                charSequence5 = charSequence4;
            }
            return scatterMap.joinToString(charSequence, str, str2, i3, charSequence5, (i2 & 32) != 0 ? null : function2);
        }
        throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: joinToString");
    }

    public final String joinToString(CharSequence separator, CharSequence prefix, CharSequence postfix, int limit, CharSequence truncated, Function2<? super K, ? super V, ? extends CharSequence> transform) {
        Object[] k$iv;
        int $i$f$forEach;
        Object[] k$iv2;
        int $i$f$forEach2;
        CharSequence charSequence = separator;
        CharSequence charSequence2 = prefix;
        CharSequence charSequence3 = postfix;
        CharSequence charSequence4 = truncated;
        Function2<? super K, ? super V, ? extends CharSequence> function2 = transform;
        Intrinsics.checkNotNullParameter(charSequence, "separator");
        Intrinsics.checkNotNullParameter(charSequence2, "prefix");
        Intrinsics.checkNotNullParameter(charSequence3, "postfix");
        Intrinsics.checkNotNullParameter(charSequence4, "truncated");
        StringBuilder sb = new StringBuilder();
        StringBuilder $this$joinToString_u24lambda_u248 = sb;
        $this$joinToString_u24lambda_u248.append(charSequence2);
        int bitCount$iv$iv = 0;
        ScatterMap this_$iv = this;
        int $i$f$forEach3 = 0;
        Object[] k$iv3 = this_$iv.keys;
        Object[] v$iv = this_$iv.values;
        ScatterMap this_$iv$iv = this_$iv;
        int $i$f$forEachIndexed = 0;
        long[] m$iv$iv = this_$iv$iv.metadata;
        int lastIndex$iv$iv = m$iv$iv.length - 2;
        int i$iv$iv = 0;
        if (0 <= lastIndex$iv$iv) {
            loop0:
            while (true) {
                long slot$iv$iv = m$iv$iv[i$iv$iv];
                int index = bitCount$iv$iv;
                ScatterMap this_$iv2 = this_$iv;
                long $this$maskEmptyOrDeleted$iv$iv$iv = slot$iv$iv;
                ScatterMap this_$iv$iv2 = this_$iv$iv;
                int $i$f$forEachIndexed2 = $i$f$forEachIndexed;
                if ((((~$this$maskEmptyOrDeleted$iv$iv$iv) << 7) & $this$maskEmptyOrDeleted$iv$iv$iv & -9187201950435737472L) != -9187201950435737472L) {
                    int i = 8;
                    int bitCount$iv$iv2 = 8 - ((~(i$iv$iv - lastIndex$iv$iv)) >>> 31);
                    int j$iv$iv = 0;
                    int index2 = index;
                    while (j$iv$iv < bitCount$iv$iv2) {
                        if ((slot$iv$iv & 255) < 128) {
                            int index$iv = (i$iv$iv << 3) + j$iv$iv;
                            Object key = k$iv3[index$iv];
                            $i$f$forEach2 = $i$f$forEach3;
                            Object value = v$iv[index$iv];
                            k$iv2 = k$iv3;
                            if (index2 == limit) {
                                $this$joinToString_u24lambda_u248.append(charSequence4);
                                break loop0;
                            }
                            if (index2 != 0) {
                                $this$joinToString_u24lambda_u248.append(charSequence);
                            }
                            if (function2 == null) {
                                $this$joinToString_u24lambda_u248.append(key);
                                $this$joinToString_u24lambda_u248.append('=');
                                $this$joinToString_u24lambda_u248.append(value);
                            } else {
                                $this$joinToString_u24lambda_u248.append((CharSequence) function2.invoke(key, value));
                            }
                            index2++;
                        } else {
                            $i$f$forEach2 = $i$f$forEach3;
                            k$iv2 = k$iv3;
                            int i2 = limit;
                        }
                        slot$iv$iv >>= 8;
                        j$iv$iv++;
                        i = 8;
                        $i$f$forEach3 = $i$f$forEach2;
                        k$iv3 = k$iv2;
                        charSequence = separator;
                    }
                    $i$f$forEach = $i$f$forEach3;
                    k$iv = k$iv3;
                    int i3 = limit;
                    if (bitCount$iv$iv2 != i) {
                        break;
                    }
                    bitCount$iv$iv = index2;
                } else {
                    $i$f$forEach = $i$f$forEach3;
                    k$iv = k$iv3;
                    int i4 = limit;
                    bitCount$iv$iv = index;
                }
                if (i$iv$iv == lastIndex$iv$iv) {
                    break;
                }
                i$iv$iv++;
                charSequence = separator;
                this_$iv$iv = this_$iv$iv2;
                $i$f$forEachIndexed = $i$f$forEachIndexed2;
                this_$iv = this_$iv2;
                $i$f$forEach3 = $i$f$forEach;
                k$iv3 = k$iv;
            }
        } else {
            Object[] objArr = k$iv3;
            ScatterMap scatterMap = this_$iv$iv;
            int i5 = limit;
        }
        int i6 = bitCount$iv$iv;
        $this$joinToString_u24lambda_u248.append(charSequence3);
        String sb2 = sb.toString();
        Intrinsics.checkNotNullExpressionValue(sb2, "StringBuilder().apply(builderAction).toString()");
        return sb2;
    }

    public int hashCode() {
        int bitCount$iv$iv = 0;
        ScatterMap this_$iv = this;
        Object[] k$iv = this_$iv.keys;
        Object[] v$iv = this_$iv.values;
        long[] m$iv$iv = this_$iv.metadata;
        int lastIndex$iv$iv = m$iv$iv.length - 2;
        int i$iv$iv = 0;
        if (0 <= lastIndex$iv$iv) {
            while (true) {
                long slot$iv$iv = m$iv$iv[i$iv$iv];
                long $this$maskEmptyOrDeleted$iv$iv$iv = slot$iv$iv;
                int hash = bitCount$iv$iv;
                ScatterMap this_$iv2 = this_$iv;
                if ((((~$this$maskEmptyOrDeleted$iv$iv$iv) << 7) & $this$maskEmptyOrDeleted$iv$iv$iv & -9187201950435737472L) != -9187201950435737472L) {
                    int bitCount$iv$iv2 = 8 - ((~(i$iv$iv - lastIndex$iv$iv)) >>> 31);
                    for (int j$iv$iv = 0; j$iv$iv < bitCount$iv$iv2; j$iv$iv++) {
                        int i = 0;
                        if ((255 & slot$iv$iv) < 128) {
                            int index$iv = (i$iv$iv << 3) + j$iv$iv;
                            Object key = k$iv[index$iv];
                            Object value = v$iv[index$iv];
                            int hashCode = key != null ? key.hashCode() : 0;
                            if (value != null) {
                                i = value.hashCode();
                            }
                            hash += hashCode ^ i;
                        }
                        slot$iv$iv >>= 8;
                    }
                    if (bitCount$iv$iv2 != 8) {
                        return hash;
                    }
                    bitCount$iv$iv = hash;
                } else {
                    bitCount$iv$iv = hash;
                }
                if (i$iv$iv == lastIndex$iv$iv) {
                    break;
                }
                i$iv$iv++;
                this_$iv = this_$iv2;
            }
        }
        return bitCount$iv$iv;
    }

    public boolean equals(Object other) {
        boolean z;
        ScatterMap scatterMap = other;
        if (scatterMap == this) {
            return true;
        }
        if (!(scatterMap instanceof ScatterMap) || scatterMap.getSize() != getSize()) {
            return false;
        }
        ScatterMap o = scatterMap;
        ScatterMap this_$iv = this;
        Object[] k$iv = this_$iv.keys;
        Object[] v$iv = this_$iv.values;
        long[] m$iv$iv = this_$iv.metadata;
        int lastIndex$iv$iv = m$iv$iv.length - 2;
        int i$iv$iv = 0;
        if (0 <= lastIndex$iv$iv) {
            while (true) {
                long slot$iv$iv = m$iv$iv[i$iv$iv];
                long $this$maskEmptyOrDeleted$iv$iv$iv = slot$iv$iv;
                ScatterMap this_$iv2 = this_$iv;
                if ((((~$this$maskEmptyOrDeleted$iv$iv$iv) << 7) & $this$maskEmptyOrDeleted$iv$iv$iv & -9187201950435737472L) != -9187201950435737472L) {
                    int i = 8;
                    int bitCount$iv$iv = 8 - ((~(i$iv$iv - lastIndex$iv$iv)) >>> 31);
                    int j$iv$iv = 0;
                    while (j$iv$iv < bitCount$iv$iv) {
                        if (((slot$iv$iv & 255) < 128 ? 1 : 0) != 0) {
                            int index$iv$iv = (i$iv$iv << 3) + j$iv$iv;
                            int index$iv = index$iv$iv;
                            Object key = k$iv[index$iv];
                            Object value = v$iv[index$iv];
                            if (value != null) {
                                int i2 = index$iv$iv;
                                if (!Intrinsics.areEqual(value, o.get(key))) {
                                    return false;
                                }
                            } else if (o.get(key) != null || !o.containsKey(key)) {
                                return false;
                            } else {
                                int i3 = index$iv$iv;
                            }
                        }
                        slot$iv$iv >>= 8;
                        j$iv$iv++;
                        i = 8;
                        Object obj = other;
                    }
                    z = false;
                    if (bitCount$iv$iv != i) {
                        return true;
                    }
                } else {
                    z = false;
                }
                if (i$iv$iv == lastIndex$iv$iv) {
                    return true;
                }
                i$iv$iv++;
                Object obj2 = other;
                boolean z2 = z;
                this_$iv = this_$iv2;
            }
        } else {
            return true;
        }
    }

    public String toString() {
        int $i$f$forEach;
        int $i$f$forEach2;
        Object obj;
        ScatterMap scatterMap = this;
        if (isEmpty()) {
            return "{}";
        }
        StringBuilder s = new StringBuilder().append('{');
        int bitCount$iv$iv = 0;
        ScatterMap this_$iv = this;
        int $i$f$forEach3 = 0;
        Object[] k$iv = this_$iv.keys;
        Object[] v$iv = this_$iv.values;
        long[] m$iv$iv = this_$iv.metadata;
        int lastIndex$iv$iv = m$iv$iv.length - 2;
        int i$iv$iv = 0;
        if (0 <= lastIndex$iv$iv) {
            while (true) {
                long slot$iv$iv = m$iv$iv[i$iv$iv];
                long $this$maskEmptyOrDeleted$iv$iv$iv = slot$iv$iv;
                int i = bitCount$iv$iv;
                ScatterMap this_$iv2 = this_$iv;
                if ((((~$this$maskEmptyOrDeleted$iv$iv$iv) << 7) & $this$maskEmptyOrDeleted$iv$iv$iv & -9187201950435737472L) != -9187201950435737472L) {
                    int i2 = 8;
                    int bitCount$iv$iv2 = 8 - ((~(i$iv$iv - lastIndex$iv$iv)) >>> 31);
                    int j$iv$iv = 0;
                    while (j$iv$iv < bitCount$iv$iv2) {
                        if ((255 & slot$iv$iv) < 128) {
                            int index$iv = (i$iv$iv << 3) + j$iv$iv;
                            Object key = k$iv[index$iv];
                            $i$f$forEach2 = $i$f$forEach3;
                            Object value = v$iv[index$iv];
                            Object obj2 = key;
                            if (key == scatterMap) {
                                key = "(this)";
                            }
                            s.append(key);
                            s.append("=");
                            if (value == scatterMap) {
                                obj = "(this)";
                            } else {
                                obj = value;
                            }
                            s.append(obj);
                            int i3 = i + 1;
                            Object obj3 = value;
                            if (i3 < scatterMap._size) {
                                s.append(',').append(' ');
                            }
                            i = i3;
                        } else {
                            $i$f$forEach2 = $i$f$forEach3;
                        }
                        slot$iv$iv >>= 8;
                        j$iv$iv++;
                        i2 = 8;
                        $i$f$forEach3 = $i$f$forEach2;
                        scatterMap = this;
                    }
                    $i$f$forEach = $i$f$forEach3;
                    if (bitCount$iv$iv2 != i2) {
                        break;
                    }
                    bitCount$iv$iv = i;
                } else {
                    $i$f$forEach = $i$f$forEach3;
                    bitCount$iv$iv = i;
                }
                if (i$iv$iv == lastIndex$iv$iv) {
                    break;
                }
                i$iv$iv++;
                scatterMap = this;
                this_$iv = this_$iv2;
                $i$f$forEach3 = $i$f$forEach;
            }
        }
        int i4 = bitCount$iv$iv;
        String sb = s.append('}').toString();
        Intrinsics.checkNotNullExpressionValue(sb, "s.append('}').toString()");
        return sb;
    }

    public final String asDebugString$collection() {
        StringBuilder sb = new StringBuilder();
        StringBuilder $this$asDebugString_u24lambda_u2412 = sb;
        $this$asDebugString_u24lambda_u2412.append('{');
        $this$asDebugString_u24lambda_u2412.append("metadata=[");
        int capacity = getCapacity();
        for (int i = 0; i < capacity; i++) {
            long metadata2 = (this.metadata[i >> 3] >> ((i & 7) << 3)) & 255;
            if (metadata2 == 128) {
                $this$asDebugString_u24lambda_u2412.append("Empty");
            } else if (metadata2 == 254) {
                $this$asDebugString_u24lambda_u2412.append("Deleted");
            } else {
                $this$asDebugString_u24lambda_u2412.append(metadata2);
            }
            $this$asDebugString_u24lambda_u2412.append(", ");
        }
        $this$asDebugString_u24lambda_u2412.append("], ");
        $this$asDebugString_u24lambda_u2412.append("keys=[");
        for (Object append : this.keys) {
            $this$asDebugString_u24lambda_u2412.append(append);
            $this$asDebugString_u24lambda_u2412.append(", ");
        }
        $this$asDebugString_u24lambda_u2412.append("], ");
        $this$asDebugString_u24lambda_u2412.append("values=[");
        for (Object append2 : this.values) {
            $this$asDebugString_u24lambda_u2412.append(append2);
            $this$asDebugString_u24lambda_u2412.append(", ");
        }
        $this$asDebugString_u24lambda_u2412.append("]");
        $this$asDebugString_u24lambda_u2412.append('}');
        String sb2 = sb.toString();
        Intrinsics.checkNotNullExpressionValue(sb2, "StringBuilder().apply(builderAction).toString()");
        return sb2;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:15:0x0090, code lost:
        r9 = r4;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:16:0x009e, code lost:
        if (((((~r9) << 6) & r9) & -9187201950435737472L) == 0) goto L_0x00a3;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:17:0x00a0, code lost:
        return -1;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final int findKeyIndex$collection(K r24) {
        /*
            r23 = this;
            r0 = r23
            r1 = r24
            r2 = 0
            r3 = 0
            if (r1 == 0) goto L_0x000d
            int r5 = r24.hashCode()
            goto L_0x000e
        L_0x000d:
            r5 = 0
        L_0x000e:
            r6 = -862048943(0xffffffffcc9e2d51, float:-8.2930312E7)
            int r5 = r5 * r6
            int r6 = r5 << 16
            r3 = r5 ^ r6
            r5 = 0
            r5 = r3 & 127(0x7f, float:1.78E-43)
            int r6 = r0._capacity
            r7 = 0
            int r7 = r3 >>> 7
            r7 = r7 & r6
            r8 = 0
        L_0x0022:
            long[] r9 = r0.metadata
            r10 = 0
            int r11 = r7 >> 3
            r12 = r7 & 7
            int r12 = r12 << 3
            r13 = r9[r11]
            long r13 = r13 >>> r12
            int r15 = r11 + 1
            r15 = r9[r15]
            int r17 = 64 - r12
            long r15 = r15 << r17
            r18 = r5
            long r4 = (long) r12
            long r4 = -r4
            r19 = 63
            long r4 = r4 >> r19
            long r4 = r4 & r15
            long r4 = r4 | r13
            r9 = r4
            r11 = 0
            r12 = r18
            long r13 = (long) r12
            r15 = 72340172838076673(0x101010101010101, double:7.748604185489348E-304)
            long r13 = r13 * r15
            long r13 = r13 ^ r9
            long r15 = r13 - r15
            r18 = r2
            r19 = r3
            long r2 = ~r13
            long r2 = r2 & r15
            r15 = -9187201950435737472(0x8080808080808080, double:-2.937446524422997E-306)
            long r2 = r2 & r15
        L_0x005d:
            r9 = r2
            r11 = 0
            r13 = 0
            int r20 = (r9 > r13 ? 1 : (r9 == r13 ? 0 : -1))
            if (r20 == 0) goto L_0x0068
            r20 = 1
            goto L_0x006a
        L_0x0068:
            r20 = 0
        L_0x006a:
            if (r20 == 0) goto L_0x0090
            r9 = r2
            r11 = 0
            r13 = r9
            r20 = 0
            int r21 = java.lang.Long.numberOfTrailingZeros(r13)
            int r13 = r21 >> 3
            int r13 = r13 + r7
            r9 = r13 & r6
            java.lang.Object[] r10 = r0.keys
            r10 = r10[r9]
            boolean r10 = kotlin.jvm.internal.Intrinsics.areEqual((java.lang.Object) r10, (java.lang.Object) r1)
            if (r10 == 0) goto L_0x0086
            return r9
        L_0x0086:
            r10 = r2
            r13 = 0
            r20 = 1
            long r20 = r10 - r20
            long r10 = r10 & r20
            r2 = r10
            goto L_0x005d
        L_0x0090:
            r9 = r4
            r11 = 0
            long r13 = ~r9
            r22 = 6
            long r13 = r13 << r22
            long r13 = r13 & r9
            long r9 = r13 & r15
            r13 = 0
            int r9 = (r9 > r13 ? 1 : (r9 == r13 ? 0 : -1))
            if (r9 == 0) goto L_0x00a3
            r2 = -1
            return r2
        L_0x00a3:
            int r8 = r8 + 8
            int r9 = r7 + r8
            r7 = r9 & r6
            r5 = r12
            r2 = r18
            r3 = r19
            goto L_0x0022
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.collection.ScatterMap.findKeyIndex$collection(java.lang.Object):int");
    }

    public final Map<K, V> asMap() {
        return new MapWrapper();
    }

    @Metadata(d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0010$\n\u0002\b\u0002\n\u0002\u0010\"\n\u0002\u0010&\n\u0002\b\u0005\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u001e\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\b\b\u0004\u0018\u00002\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\u0001B\u0005¢\u0006\u0002\u0010\u0002J\u0015\u0010\u0012\u001a\u00020\u00132\u0006\u0010\u0014\u001a\u00028\u0000H\u0016¢\u0006\u0002\u0010\u0015J\u0015\u0010\u0016\u001a\u00020\u00132\u0006\u0010\u0017\u001a\u00028\u0001H\u0016¢\u0006\u0002\u0010\u0015J\u0018\u0010\u0018\u001a\u0004\u0018\u00018\u00012\u0006\u0010\u0014\u001a\u00028\u0000H\u0002¢\u0006\u0002\u0010\u0019J\b\u0010\u001a\u001a\u00020\u0013H\u0016R&\u0010\u0003\u001a\u0014\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\u00050\u00048VX\u0004¢\u0006\u0006\u001a\u0004\b\u0006\u0010\u0007R\u001a\u0010\b\u001a\b\u0012\u0004\u0012\u00028\u00000\u00048VX\u0004¢\u0006\u0006\u001a\u0004\b\t\u0010\u0007R\u0014\u0010\n\u001a\u00020\u000b8VX\u0004¢\u0006\u0006\u001a\u0004\b\f\u0010\rR\u001a\u0010\u000e\u001a\b\u0012\u0004\u0012\u00028\u00010\u000f8VX\u0004¢\u0006\u0006\u001a\u0004\b\u0010\u0010\u0011¨\u0006\u001b"}, d2 = {"Landroidx/collection/ScatterMap$MapWrapper;", "", "(Landroidx/collection/ScatterMap;)V", "entries", "", "", "getEntries", "()Ljava/util/Set;", "keys", "getKeys", "size", "", "getSize", "()I", "values", "", "getValues", "()Ljava/util/Collection;", "containsKey", "", "key", "(Ljava/lang/Object;)Z", "containsValue", "value", "get", "(Ljava/lang/Object;)Ljava/lang/Object;", "isEmpty", "collection"}, k = 1, mv = {1, 8, 0}, xi = 48)
    /* compiled from: ScatterMap.kt */
    public class MapWrapper implements Map<K, V>, KMappedMarker {
        public void clear() {
            throw new UnsupportedOperationException("Operation is not supported for read-only collection");
        }

        public V compute(K k, BiFunction<? super K, ? super V, ? extends V> biFunction) {
            throw new UnsupportedOperationException("Operation is not supported for read-only collection");
        }

        public V computeIfAbsent(K k, Function<? super K, ? extends V> function) {
            throw new UnsupportedOperationException("Operation is not supported for read-only collection");
        }

        public V computeIfPresent(K k, BiFunction<? super K, ? super V, ? extends V> biFunction) {
            throw new UnsupportedOperationException("Operation is not supported for read-only collection");
        }

        public V merge(K k, V v, BiFunction<? super V, ? super V, ? extends V> biFunction) {
            throw new UnsupportedOperationException("Operation is not supported for read-only collection");
        }

        public V put(K k, V v) {
            throw new UnsupportedOperationException("Operation is not supported for read-only collection");
        }

        public void putAll(Map<? extends K, ? extends V> map) {
            throw new UnsupportedOperationException("Operation is not supported for read-only collection");
        }

        public V putIfAbsent(K k, V v) {
            throw new UnsupportedOperationException("Operation is not supported for read-only collection");
        }

        public V remove(Object obj) {
            throw new UnsupportedOperationException("Operation is not supported for read-only collection");
        }

        public boolean remove(Object obj, Object obj2) {
            throw new UnsupportedOperationException("Operation is not supported for read-only collection");
        }

        public V replace(K k, V v) {
            throw new UnsupportedOperationException("Operation is not supported for read-only collection");
        }

        public boolean replace(K k, V v, V v2) {
            throw new UnsupportedOperationException("Operation is not supported for read-only collection");
        }

        public void replaceAll(BiFunction<? super K, ? super V, ? extends V> biFunction) {
            throw new UnsupportedOperationException("Operation is not supported for read-only collection");
        }

        public MapWrapper() {
        }

        public final /* bridge */ Set<Map.Entry<K, V>> entrySet() {
            return getEntries();
        }

        public final /* bridge */ Set<K> keySet() {
            return getKeys();
        }

        public final /* bridge */ int size() {
            return getSize();
        }

        public final /* bridge */ Collection<V> values() {
            return getValues();
        }

        public Set<Map.Entry<K, V>> getEntries() {
            return new ScatterMap$MapWrapper$entries$1(ScatterMap.this);
        }

        public Set<K> getKeys() {
            return new ScatterMap$MapWrapper$keys$1(ScatterMap.this);
        }

        public Collection<V> getValues() {
            return new ScatterMap$MapWrapper$values$1(ScatterMap.this);
        }

        public int getSize() {
            return ScatterMap.this._size;
        }

        public boolean isEmpty() {
            return ScatterMap.this.isEmpty();
        }

        public V get(Object key) {
            return ScatterMap.this.get(key);
        }

        public boolean containsValue(Object value) {
            return ScatterMap.this.containsValue(value);
        }

        public boolean containsKey(Object key) {
            return ScatterMap.this.containsKey(key);
        }
    }
}
