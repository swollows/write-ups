package androidx.collection;

import androidx.collection.internal.ContainerHelpersKt;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

@Metadata(d1 = {"\u0000r\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0007\n\u0002\u0010\u0014\n\u0002\b\u0002\n\u0002\u0010\u0016\n\u0002\b\u0004\n\u0002\u0010\u0011\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0007\n\u0002\b\r\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\r\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0000\b6\u0018\u0000*\u0004\b\u0000\u0010\u00012\u00020\u0002B\u0007\b\u0004¢\u0006\u0002\u0010\u0003J&\u0010\u0018\u001a\u00020\u00192\u0018\u0010\u001a\u001a\u0014\u0012\u0004\u0012\u00020\u001c\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00020\u00190\u001bH\bø\u0001\u0000J\u0006\u0010\u001d\u001a\u00020\u0019J&\u0010\u001d\u001a\u00020\u00192\u0018\u0010\u001a\u001a\u0014\u0012\u0004\u0012\u00020\u001c\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00020\u00190\u001bH\bø\u0001\u0000J\u0011\u0010\u001e\u001a\u00020\u00192\u0006\u0010\u001f\u001a\u00020\u001cH\u0002J\u000e\u0010 \u001a\u00020\u00192\u0006\u0010\u001f\u001a\u00020\u001cJ\u0013\u0010!\u001a\u00020\u00192\u0006\u0010\"\u001a\u00028\u0000¢\u0006\u0002\u0010#J\u0006\u0010$\u001a\u00020\u0005J&\u0010$\u001a\u00020\u00052\u0018\u0010\u001a\u001a\u0014\u0012\u0004\u0012\u00020\u001c\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00020\u00190\u001bH\bø\u0001\u0000J\u0013\u0010%\u001a\u00020\u00192\b\u0010&\u001a\u0004\u0018\u00010\u0002H\u0002J\u0016\u0010'\u001a\u00020\u00052\u0006\u0010\u001f\u001a\u00020\u001cH\b¢\u0006\u0002\b(JD\u0010)\u001a\u00020*26\u0010+\u001a2\u0012\u0013\u0012\u00110\u001c¢\u0006\f\b,\u0012\b\b-\u0012\u0004\b\b(\u001f\u0012\u0013\u0012\u00118\u0000¢\u0006\f\b,\u0012\b\b-\u0012\u0004\b\b(\"\u0012\u0004\u0012\u00020*0\u001bH\bø\u0001\u0000J/\u0010.\u001a\u00020*2!\u0010+\u001a\u001d\u0012\u0013\u0012\u00110\u0005¢\u0006\f\b,\u0012\b\b-\u0012\u0004\b\b(0\u0012\u0004\u0012\u00020*0/H\bø\u0001\u0000J/\u00101\u001a\u00020*2!\u0010+\u001a\u001d\u0012\u0013\u0012\u00110\u001c¢\u0006\f\b,\u0012\b\b-\u0012\u0004\b\b(\u001f\u0012\u0004\u0012\u00020*0/H\bø\u0001\u0000J/\u00102\u001a\u00020*2!\u0010+\u001a\u001d\u0012\u0013\u0012\u00118\u0000¢\u0006\f\b,\u0012\b\b-\u0012\u0004\b\b(\"\u0012\u0004\u0012\u00020*0/H\bø\u0001\u0000J\u0018\u00103\u001a\u0004\u0018\u00018\u00002\u0006\u0010\u001f\u001a\u00020\u001cH\u0002¢\u0006\u0002\u00104J\u001b\u00105\u001a\u00028\u00002\u0006\u0010\u001f\u001a\u00020\u001c2\u0006\u00106\u001a\u00028\u0000¢\u0006\u0002\u00107J'\u00108\u001a\u00028\u00002\u0006\u0010\u001f\u001a\u00020\u001c2\f\u00106\u001a\b\u0012\u0004\u0012\u00028\u000009H\bø\u0001\u0000¢\u0006\u0002\u0010:J\b\u0010;\u001a\u00020\u0005H\u0016J\u0006\u0010<\u001a\u00020\u0019J\u0006\u0010=\u001a\u00020\u0019J:\u0010>\u001a\u00020?2\b\b\u0002\u0010@\u001a\u00020A2\b\b\u0002\u0010B\u001a\u00020A2\b\b\u0002\u0010C\u001a\u00020A2\b\b\u0002\u0010D\u001a\u00020\u00052\b\b\u0002\u0010E\u001a\u00020AH\u0007Jx\u0010>\u001a\u00020?2\b\b\u0002\u0010@\u001a\u00020A2\b\b\u0002\u0010B\u001a\u00020A2\b\b\u0002\u0010C\u001a\u00020A2\b\b\u0002\u0010D\u001a\u00020\u00052\b\b\u0002\u0010E\u001a\u00020A28\b\u0004\u0010F\u001a2\u0012\u0013\u0012\u00110\u001c¢\u0006\f\b,\u0012\b\b-\u0012\u0004\b\b(\u001f\u0012\u0013\u0012\u00118\u0000¢\u0006\f\b,\u0012\b\b-\u0012\u0004\b\b(\"\u0012\u0004\u0012\u00020A0\u001bH\bø\u0001\u0000J\u0006\u0010G\u001a\u00020\u0019J\b\u0010H\u001a\u00020?H\u0016R\u0018\u0010\u0004\u001a\u00020\u00058\u0000@\u0000X\u000e¢\u0006\b\n\u0000\u0012\u0004\b\u0006\u0010\u0003R\u0018\u0010\u0007\u001a\u00020\u00058\u0000@\u0000X\u000e¢\u0006\b\n\u0000\u0012\u0004\b\b\u0010\u0003R\u0011\u0010\t\u001a\u00020\u00058F¢\u0006\u0006\u001a\u0004\b\n\u0010\u000bR\u0018\u0010\f\u001a\u00020\r8\u0000@\u0000X\u000e¢\u0006\b\n\u0000\u0012\u0004\b\u000e\u0010\u0003R\u0018\u0010\u000f\u001a\u00020\u00108\u0000@\u0000X\u000e¢\u0006\b\n\u0000\u0012\u0004\b\u0011\u0010\u0003R\u0011\u0010\u0012\u001a\u00020\u00058F¢\u0006\u0006\u001a\u0004\b\u0013\u0010\u000bR\"\u0010\u0014\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00020\u00158\u0000@\u0000X\u000e¢\u0006\n\n\u0002\u0010\u0017\u0012\u0004\b\u0016\u0010\u0003\u0001\u0001I\u0002\u0007\n\u0005\b20\u0001¨\u0006J"}, d2 = {"Landroidx/collection/FloatObjectMap;", "V", "", "()V", "_capacity", "", "get_capacity$collection$annotations", "_size", "get_size$collection$annotations", "capacity", "getCapacity", "()I", "keys", "", "getKeys$annotations", "metadata", "", "getMetadata$annotations", "size", "getSize", "values", "", "getValues$annotations", "[Ljava/lang/Object;", "all", "", "predicate", "Lkotlin/Function2;", "", "any", "contains", "key", "containsKey", "containsValue", "value", "(Ljava/lang/Object;)Z", "count", "equals", "other", "findKeyIndex", "findKeyIndex$collection", "forEach", "", "block", "Lkotlin/ParameterName;", "name", "forEachIndexed", "Lkotlin/Function1;", "index", "forEachKey", "forEachValue", "get", "(F)Ljava/lang/Object;", "getOrDefault", "defaultValue", "(FLjava/lang/Object;)Ljava/lang/Object;", "getOrElse", "Lkotlin/Function0;", "(FLkotlin/jvm/functions/Function0;)Ljava/lang/Object;", "hashCode", "isEmpty", "isNotEmpty", "joinToString", "", "separator", "", "prefix", "postfix", "limit", "truncated", "transform", "none", "toString", "Landroidx/collection/MutableFloatObjectMap;", "collection"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* compiled from: FloatObjectMap.kt */
public abstract class FloatObjectMap<V> {
    public int _capacity;
    public int _size;
    public float[] keys;
    public long[] metadata;
    public Object[] values;

    public /* synthetic */ FloatObjectMap(DefaultConstructorMarker defaultConstructorMarker) {
        this();
    }

    public static /* synthetic */ void getKeys$annotations() {
    }

    public static /* synthetic */ void getMetadata$annotations() {
    }

    public static /* synthetic */ void getValues$annotations() {
    }

    public static /* synthetic */ void get_capacity$collection$annotations() {
    }

    public static /* synthetic */ void get_size$collection$annotations() {
    }

    public final String joinToString() {
        return joinToString$default(this, (CharSequence) null, (CharSequence) null, (CharSequence) null, 0, (CharSequence) null, 31, (Object) null);
    }

    public final String joinToString(CharSequence charSequence) {
        Intrinsics.checkNotNullParameter(charSequence, "separator");
        return joinToString$default(this, charSequence, (CharSequence) null, (CharSequence) null, 0, (CharSequence) null, 30, (Object) null);
    }

    public final String joinToString(CharSequence charSequence, CharSequence charSequence2) {
        Intrinsics.checkNotNullParameter(charSequence, "separator");
        Intrinsics.checkNotNullParameter(charSequence2, "prefix");
        return joinToString$default(this, charSequence, charSequence2, (CharSequence) null, 0, (CharSequence) null, 28, (Object) null);
    }

    public final String joinToString(CharSequence charSequence, CharSequence charSequence2, CharSequence charSequence3) {
        Intrinsics.checkNotNullParameter(charSequence, "separator");
        Intrinsics.checkNotNullParameter(charSequence2, "prefix");
        Intrinsics.checkNotNullParameter(charSequence3, "postfix");
        return joinToString$default(this, charSequence, charSequence2, charSequence3, 0, (CharSequence) null, 24, (Object) null);
    }

    public final String joinToString(CharSequence charSequence, CharSequence charSequence2, CharSequence charSequence3, int i) {
        Intrinsics.checkNotNullParameter(charSequence, "separator");
        Intrinsics.checkNotNullParameter(charSequence2, "prefix");
        Intrinsics.checkNotNullParameter(charSequence3, "postfix");
        return joinToString$default(this, charSequence, charSequence2, charSequence3, i, (CharSequence) null, 16, (Object) null);
    }

    private FloatObjectMap() {
        this.metadata = ScatterMapKt.EmptyGroup;
        this.keys = FloatSetKt.getEmptyFloatArray();
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

    /* JADX WARNING: Code restructure failed: missing block: B:12:0x008c, code lost:
        r9 = r1;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:13:0x009b, code lost:
        if (((((~r9) << 6) & r9) & -9187201950435737472L) == 0) goto L_0x00ad;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:14:0x009d, code lost:
        r9 = -1;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final V get(float r23) {
        /*
            r22 = this;
            r0 = r22
            r1 = 0
            r2 = 0
            int r3 = java.lang.Float.hashCode(r23)
            r4 = -862048943(0xffffffffcc9e2d51, float:-8.2930312E7)
            int r3 = r3 * r4
            int r4 = r3 << 16
            r2 = r3 ^ r4
            r3 = 0
            r3 = r2 & 127(0x7f, float:1.78E-43)
            int r4 = r0._capacity
            r5 = 0
            int r5 = r2 >>> 7
            r5 = r5 & r4
            r6 = 0
        L_0x001c:
            long[] r7 = r0.metadata
            r8 = 0
            int r9 = r5 >> 3
            r10 = r5 & 7
            int r10 = r10 << 3
            r11 = r7[r9]
            long r11 = r11 >>> r10
            int r13 = r9 + 1
            r13 = r7[r13]
            int r15 = 64 - r10
            long r13 = r13 << r15
            r15 = r1
            r16 = r2
            long r1 = (long) r10
            long r1 = -r1
            r17 = 63
            long r1 = r1 >> r17
            long r1 = r1 & r13
            long r1 = r1 | r11
            r7 = r1
            r9 = 0
            long r10 = (long) r3
            r12 = 72340172838076673(0x101010101010101, double:7.748604185489348E-304)
            long r10 = r10 * r12
            long r10 = r10 ^ r7
            long r12 = r10 - r12
            r17 = r7
            long r7 = ~r10
            long r7 = r7 & r12
            r12 = -9187201950435737472(0x8080808080808080, double:-2.937446524422997E-306)
            long r7 = r7 & r12
        L_0x0053:
            r9 = r7
            r11 = 0
            r17 = 0
            int r14 = (r9 > r17 ? 1 : (r9 == r17 ? 0 : -1))
            r19 = 0
            r20 = 1
            if (r14 == 0) goto L_0x0062
            r9 = r20
            goto L_0x0064
        L_0x0062:
            r9 = r19
        L_0x0064:
            if (r9 == 0) goto L_0x008c
            r9 = r7
            r11 = 0
            r17 = r9
            r14 = 0
            int r21 = java.lang.Long.numberOfTrailingZeros(r17)
            int r14 = r21 >> 3
            int r14 = r14 + r5
            r9 = r14 & r4
            float[] r10 = r0.keys
            r10 = r10[r9]
            int r10 = (r10 > r23 ? 1 : (r10 == r23 ? 0 : -1))
            if (r10 != 0) goto L_0x007f
            r19 = r20
        L_0x007f:
            if (r19 == 0) goto L_0x0082
            goto L_0x009f
        L_0x0082:
            r10 = r7
            r14 = 0
            r17 = 1
            long r17 = r10 - r17
            long r10 = r10 & r17
            r7 = r10
            goto L_0x0053
        L_0x008c:
            r9 = r1
            r11 = 0
            long r12 = ~r9
            r14 = 6
            long r12 = r12 << r14
            long r12 = r12 & r9
            r19 = -9187201950435737472(0x8080808080808080, double:-2.937446524422997E-306)
            long r9 = r12 & r19
            int r9 = (r9 > r17 ? 1 : (r9 == r17 ? 0 : -1))
            if (r9 == 0) goto L_0x00ad
            r9 = -1
        L_0x009f:
            r0 = r9
            if (r0 < 0) goto L_0x00a9
            r9 = r22
            java.lang.Object[] r1 = r9.values
            r1 = r1[r0]
            goto L_0x00ac
        L_0x00a9:
            r9 = r22
            r1 = 0
        L_0x00ac:
            return r1
        L_0x00ad:
            r9 = r22
            int r6 = r6 + 8
            int r10 = r5 + r6
            r5 = r10 & r4
            r1 = r15
            r2 = r16
            goto L_0x001c
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.collection.FloatObjectMap.get(float):java.lang.Object");
    }

    /* JADX WARNING: Code restructure failed: missing block: B:12:0x008c, code lost:
        r9 = r1;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:13:0x009b, code lost:
        if (((((~r9) << 6) & r9) & -9187201950435737472L) == 0) goto L_0x00ac;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:14:0x009d, code lost:
        r9 = -1;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final V getOrDefault(float r23, V r24) {
        /*
            r22 = this;
            r0 = r22
            r1 = 0
            r2 = 0
            int r3 = java.lang.Float.hashCode(r23)
            r4 = -862048943(0xffffffffcc9e2d51, float:-8.2930312E7)
            int r3 = r3 * r4
            int r4 = r3 << 16
            r2 = r3 ^ r4
            r3 = 0
            r3 = r2 & 127(0x7f, float:1.78E-43)
            int r4 = r0._capacity
            r5 = 0
            int r5 = r2 >>> 7
            r5 = r5 & r4
            r6 = 0
        L_0x001c:
            long[] r7 = r0.metadata
            r8 = 0
            int r9 = r5 >> 3
            r10 = r5 & 7
            int r10 = r10 << 3
            r11 = r7[r9]
            long r11 = r11 >>> r10
            int r13 = r9 + 1
            r13 = r7[r13]
            int r15 = 64 - r10
            long r13 = r13 << r15
            r15 = r1
            r16 = r2
            long r1 = (long) r10
            long r1 = -r1
            r17 = 63
            long r1 = r1 >> r17
            long r1 = r1 & r13
            long r1 = r1 | r11
            r7 = r1
            r9 = 0
            long r10 = (long) r3
            r12 = 72340172838076673(0x101010101010101, double:7.748604185489348E-304)
            long r10 = r10 * r12
            long r10 = r10 ^ r7
            long r12 = r10 - r12
            r17 = r7
            long r7 = ~r10
            long r7 = r7 & r12
            r12 = -9187201950435737472(0x8080808080808080, double:-2.937446524422997E-306)
            long r7 = r7 & r12
        L_0x0053:
            r9 = r7
            r11 = 0
            r17 = 0
            int r14 = (r9 > r17 ? 1 : (r9 == r17 ? 0 : -1))
            r19 = 0
            r20 = 1
            if (r14 == 0) goto L_0x0062
            r9 = r20
            goto L_0x0064
        L_0x0062:
            r9 = r19
        L_0x0064:
            if (r9 == 0) goto L_0x008c
            r9 = r7
            r11 = 0
            r17 = r9
            r14 = 0
            int r21 = java.lang.Long.numberOfTrailingZeros(r17)
            int r14 = r21 >> 3
            int r14 = r14 + r5
            r9 = r14 & r4
            float[] r10 = r0.keys
            r10 = r10[r9]
            int r10 = (r10 > r23 ? 1 : (r10 == r23 ? 0 : -1))
            if (r10 != 0) goto L_0x007f
            r19 = r20
        L_0x007f:
            if (r19 == 0) goto L_0x0082
            goto L_0x009f
        L_0x0082:
            r10 = r7
            r14 = 0
            r17 = 1
            long r17 = r10 - r17
            long r10 = r10 & r17
            r7 = r10
            goto L_0x0053
        L_0x008c:
            r9 = r1
            r11 = 0
            long r12 = ~r9
            r14 = 6
            long r12 = r12 << r14
            long r12 = r12 & r9
            r19 = -9187201950435737472(0x8080808080808080, double:-2.937446524422997E-306)
            long r9 = r12 & r19
            int r9 = (r9 > r17 ? 1 : (r9 == r17 ? 0 : -1))
            if (r9 == 0) goto L_0x00ac
            r9 = -1
        L_0x009f:
            r0 = r9
            if (r0 < 0) goto L_0x00a9
            r9 = r22
            java.lang.Object[] r1 = r9.values
            r1 = r1[r0]
            return r1
        L_0x00a9:
            r9 = r22
            return r24
        L_0x00ac:
            r9 = r22
            int r6 = r6 + 8
            int r10 = r5 + r6
            r5 = r10 & r4
            r1 = r15
            r2 = r16
            goto L_0x001c
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.collection.FloatObjectMap.getOrDefault(float, java.lang.Object):java.lang.Object");
    }

    public final V getOrElse(float key, Function0<? extends V> defaultValue) {
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

    public final void forEach(Function2<? super Float, ? super V, Unit> block) {
        Function2<? super Float, ? super V, Unit> function2 = block;
        Intrinsics.checkNotNullParameter(function2, "block");
        float[] k = this.keys;
        Object[] v = this.values;
        FloatObjectMap this_$iv = this;
        int $i$f$forEachIndexed = 0;
        long[] m$iv = this_$iv.metadata;
        int lastIndex$iv = m$iv.length - 2;
        int i$iv = 0;
        if (0 <= lastIndex$iv) {
            while (true) {
                long slot$iv = m$iv[i$iv];
                long $this$maskEmptyOrDeleted$iv$iv = slot$iv;
                FloatObjectMap this_$iv2 = this_$iv;
                int $i$f$forEachIndexed2 = $i$f$forEachIndexed;
                if ((((~$this$maskEmptyOrDeleted$iv$iv) << 7) & $this$maskEmptyOrDeleted$iv$iv & -9187201950435737472L) != -9187201950435737472L) {
                    int i = 8;
                    int bitCount$iv = 8 - ((~(i$iv - lastIndex$iv)) >>> 31);
                    int j$iv = 0;
                    while (j$iv < bitCount$iv) {
                        if ((255 & slot$iv) < 128) {
                            int index = (i$iv << 3) + j$iv;
                            function2.invoke(Float.valueOf(k[index]), v[index]);
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

    public final void forEachKey(Function1<? super Float, Unit> block) {
        Function1<? super Float, Unit> function1 = block;
        Intrinsics.checkNotNullParameter(function1, "block");
        float[] k = this.keys;
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
                            function1.invoke(Float.valueOf(k[(i$iv << 3) + j$iv]));
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

    public final boolean all(Function2<? super Float, ? super V, Boolean> predicate) {
        int $i$f$all;
        int $i$f$all2;
        Function2<? super Float, ? super V, Boolean> function2 = predicate;
        Intrinsics.checkNotNullParameter(function2, "predicate");
        int $i$f$all3 = 0;
        float[] k$iv = this.keys;
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
                        if (!function2.invoke(Float.valueOf(k$iv[index$iv]), v$iv[index$iv]).booleanValue()) {
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

    public final boolean any(Function2<? super Float, ? super V, Boolean> predicate) {
        int $i$f$any;
        int $i$f$any2;
        Function2<? super Float, ? super V, Boolean> function2 = predicate;
        Intrinsics.checkNotNullParameter(function2, "predicate");
        int $i$f$any3 = 0;
        float[] k$iv = this.keys;
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
                        if (function2.invoke(Float.valueOf(k$iv[index$iv]), v$iv[index$iv]).booleanValue()) {
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

    public final int count(Function2<? super Float, ? super V, Boolean> predicate) {
        FloatObjectMap this_$iv;
        FloatObjectMap this_$iv2;
        Function2<? super Float, ? super V, Boolean> function2 = predicate;
        Intrinsics.checkNotNullParameter(function2, "predicate");
        int $i$f$count = 0;
        int count = 0;
        FloatObjectMap this_$iv3 = this;
        float[] k$iv = this_$iv3.keys;
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
                            if (function2.invoke(Float.valueOf(k$iv[index$iv]), v$iv[index$iv]).booleanValue()) {
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
            FloatObjectMap floatObjectMap = this_$iv3;
        }
        return count;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:13:0x008f, code lost:
        r9 = r1;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:14:0x009e, code lost:
        if (((((~r9) << 6) & r9) & -9187201950435737472L) == 0) goto L_0x00a7;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:15:0x00a0, code lost:
        r9 = -1;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final boolean contains(float r24) {
        /*
            r23 = this;
            r0 = r23
            r1 = 0
            r2 = 0
            int r3 = java.lang.Float.hashCode(r24)
            r4 = -862048943(0xffffffffcc9e2d51, float:-8.2930312E7)
            int r3 = r3 * r4
            int r4 = r3 << 16
            r2 = r3 ^ r4
            r3 = 0
            r3 = r2 & 127(0x7f, float:1.78E-43)
            int r4 = r0._capacity
            r5 = 0
            int r5 = r2 >>> 7
            r5 = r5 & r4
            r6 = 0
        L_0x001c:
            long[] r7 = r0.metadata
            r8 = 0
            int r9 = r5 >> 3
            r10 = r5 & 7
            int r10 = r10 << 3
            r11 = r7[r9]
            long r11 = r11 >>> r10
            int r13 = r9 + 1
            r13 = r7[r13]
            int r15 = 64 - r10
            long r13 = r13 << r15
            r15 = r1
            r16 = r2
            long r1 = (long) r10
            long r1 = -r1
            r17 = 63
            long r1 = r1 >> r17
            long r1 = r1 & r13
            long r1 = r1 | r11
            r7 = r1
            r9 = 0
            long r10 = (long) r3
            r12 = 72340172838076673(0x101010101010101, double:7.748604185489348E-304)
            long r10 = r10 * r12
            long r10 = r10 ^ r7
            long r12 = r10 - r12
            r17 = r7
            long r7 = ~r10
            long r7 = r7 & r12
            r12 = -9187201950435737472(0x8080808080808080, double:-2.937446524422997E-306)
            long r7 = r7 & r12
        L_0x0053:
            r9 = r7
            r11 = 0
            r17 = 0
            int r14 = (r9 > r17 ? 1 : (r9 == r17 ? 0 : -1))
            r19 = 0
            r20 = 1
            if (r14 == 0) goto L_0x0062
            r9 = r20
            goto L_0x0064
        L_0x0062:
            r9 = r19
        L_0x0064:
            if (r9 == 0) goto L_0x008f
            r9 = r7
            r11 = 0
            r17 = r9
            r14 = 0
            int r21 = java.lang.Long.numberOfTrailingZeros(r17)
            int r14 = r21 >> 3
            int r14 = r14 + r5
            r9 = r14 & r4
            float[] r10 = r0.keys
            r10 = r10[r9]
            int r10 = (r10 > r24 ? 1 : (r10 == r24 ? 0 : -1))
            if (r10 != 0) goto L_0x0080
            r10 = r20
            goto L_0x0082
        L_0x0080:
            r10 = r19
        L_0x0082:
            if (r10 == 0) goto L_0x0085
            goto L_0x00a2
        L_0x0085:
            r10 = r7
            r14 = 0
            r17 = 1
            long r17 = r10 - r17
            long r10 = r10 & r17
            r7 = r10
            goto L_0x0053
        L_0x008f:
            r9 = r1
            r11 = 0
            long r12 = ~r9
            r14 = 6
            long r12 = r12 << r14
            long r12 = r12 & r9
            r21 = -9187201950435737472(0x8080808080808080, double:-2.937446524422997E-306)
            long r9 = r12 & r21
            int r9 = (r9 > r17 ? 1 : (r9 == r17 ? 0 : -1))
            if (r9 == 0) goto L_0x00a7
            r9 = -1
        L_0x00a2:
            if (r9 < 0) goto L_0x00a6
            r19 = r20
        L_0x00a6:
            return r19
        L_0x00a7:
            int r6 = r6 + 8
            int r9 = r5 + r6
            r5 = r9 & r4
            r1 = r15
            r2 = r16
            goto L_0x001c
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.collection.FloatObjectMap.contains(float):boolean");
    }

    /* JADX WARNING: Code restructure failed: missing block: B:13:0x008f, code lost:
        r9 = r1;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:14:0x009e, code lost:
        if (((((~r9) << 6) & r9) & -9187201950435737472L) == 0) goto L_0x00a7;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:15:0x00a0, code lost:
        r9 = -1;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final boolean containsKey(float r24) {
        /*
            r23 = this;
            r0 = r23
            r1 = 0
            r2 = 0
            int r3 = java.lang.Float.hashCode(r24)
            r4 = -862048943(0xffffffffcc9e2d51, float:-8.2930312E7)
            int r3 = r3 * r4
            int r4 = r3 << 16
            r2 = r3 ^ r4
            r3 = 0
            r3 = r2 & 127(0x7f, float:1.78E-43)
            int r4 = r0._capacity
            r5 = 0
            int r5 = r2 >>> 7
            r5 = r5 & r4
            r6 = 0
        L_0x001c:
            long[] r7 = r0.metadata
            r8 = 0
            int r9 = r5 >> 3
            r10 = r5 & 7
            int r10 = r10 << 3
            r11 = r7[r9]
            long r11 = r11 >>> r10
            int r13 = r9 + 1
            r13 = r7[r13]
            int r15 = 64 - r10
            long r13 = r13 << r15
            r15 = r1
            r16 = r2
            long r1 = (long) r10
            long r1 = -r1
            r17 = 63
            long r1 = r1 >> r17
            long r1 = r1 & r13
            long r1 = r1 | r11
            r7 = r1
            r9 = 0
            long r10 = (long) r3
            r12 = 72340172838076673(0x101010101010101, double:7.748604185489348E-304)
            long r10 = r10 * r12
            long r10 = r10 ^ r7
            long r12 = r10 - r12
            r17 = r7
            long r7 = ~r10
            long r7 = r7 & r12
            r12 = -9187201950435737472(0x8080808080808080, double:-2.937446524422997E-306)
            long r7 = r7 & r12
        L_0x0053:
            r9 = r7
            r11 = 0
            r17 = 0
            int r14 = (r9 > r17 ? 1 : (r9 == r17 ? 0 : -1))
            r19 = 0
            r20 = 1
            if (r14 == 0) goto L_0x0062
            r9 = r20
            goto L_0x0064
        L_0x0062:
            r9 = r19
        L_0x0064:
            if (r9 == 0) goto L_0x008f
            r9 = r7
            r11 = 0
            r17 = r9
            r14 = 0
            int r21 = java.lang.Long.numberOfTrailingZeros(r17)
            int r14 = r21 >> 3
            int r14 = r14 + r5
            r9 = r14 & r4
            float[] r10 = r0.keys
            r10 = r10[r9]
            int r10 = (r10 > r24 ? 1 : (r10 == r24 ? 0 : -1))
            if (r10 != 0) goto L_0x0080
            r10 = r20
            goto L_0x0082
        L_0x0080:
            r10 = r19
        L_0x0082:
            if (r10 == 0) goto L_0x0085
            goto L_0x00a2
        L_0x0085:
            r10 = r7
            r14 = 0
            r17 = 1
            long r17 = r10 - r17
            long r10 = r10 & r17
            r7 = r10
            goto L_0x0053
        L_0x008f:
            r9 = r1
            r11 = 0
            long r12 = ~r9
            r14 = 6
            long r12 = r12 << r14
            long r12 = r12 & r9
            r21 = -9187201950435737472(0x8080808080808080, double:-2.937446524422997E-306)
            long r9 = r12 & r21
            int r9 = (r9 > r17 ? 1 : (r9 == r17 ? 0 : -1))
            if (r9 == 0) goto L_0x00a7
            r9 = -1
        L_0x00a2:
            if (r9 < 0) goto L_0x00a6
            r19 = r20
        L_0x00a6:
            return r19
        L_0x00a7:
            int r6 = r6 + 8
            int r9 = r5 + r6
            r5 = r9 & r4
            r1 = r15
            r2 = r16
            goto L_0x001c
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.collection.FloatObjectMap.containsKey(float):boolean");
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

    public static /* synthetic */ String joinToString$default(FloatObjectMap floatObjectMap, CharSequence charSequence, CharSequence charSequence2, CharSequence charSequence3, int i, CharSequence charSequence4, int i2, Object obj) {
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
            return floatObjectMap.joinToString(charSequence, str, str2, i3, charSequence5);
        }
        throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: joinToString");
    }

    public final String joinToString(CharSequence separator, CharSequence prefix, CharSequence postfix, int limit, CharSequence truncated) {
        float[] k$iv;
        float[] k$iv2;
        CharSequence charSequence = separator;
        CharSequence charSequence2 = prefix;
        CharSequence charSequence3 = postfix;
        CharSequence charSequence4 = truncated;
        Intrinsics.checkNotNullParameter(charSequence, "separator");
        Intrinsics.checkNotNullParameter(charSequence2, "prefix");
        Intrinsics.checkNotNullParameter(charSequence3, "postfix");
        Intrinsics.checkNotNullParameter(charSequence4, "truncated");
        StringBuilder sb = new StringBuilder();
        StringBuilder $this$joinToString_u24lambda_u248 = sb;
        int i = 0;
        $this$joinToString_u24lambda_u248.append(charSequence2);
        int index = 0;
        FloatObjectMap this_$iv = this;
        int $i$f$forEach = 0;
        float[] k$iv3 = this_$iv.keys;
        Object[] v$iv = this_$iv.values;
        long[] m$iv$iv = this_$iv.metadata;
        int lastIndex$iv$iv = m$iv$iv.length - 2;
        int i$iv$iv = 0;
        if (0 <= lastIndex$iv$iv) {
            loop0:
            while (true) {
                long slot$iv$iv = m$iv$iv[i$iv$iv];
                int i2 = i;
                int index2 = index;
                long $this$maskEmptyOrDeleted$iv$iv$iv = slot$iv$iv;
                FloatObjectMap this_$iv2 = this_$iv;
                int $i$f$forEach2 = $i$f$forEach;
                if ((((~$this$maskEmptyOrDeleted$iv$iv$iv) << 7) & $this$maskEmptyOrDeleted$iv$iv$iv & -9187201950435737472L) != -9187201950435737472L) {
                    int i3 = 8;
                    int bitCount$iv$iv = 8 - ((~(i$iv$iv - lastIndex$iv$iv)) >>> 31);
                    int j$iv$iv = 0;
                    int index3 = index2;
                    while (j$iv$iv < bitCount$iv$iv) {
                        if ((slot$iv$iv & 255) < 128) {
                            int index$iv = (i$iv$iv << 3) + j$iv$iv;
                            float key = k$iv3[index$iv];
                            Object value = v$iv[index$iv];
                            float key2 = key;
                            k$iv2 = k$iv3;
                            if (index3 == limit) {
                                $this$joinToString_u24lambda_u248.append(charSequence4);
                                break loop0;
                            }
                            if (index3 != 0) {
                                $this$joinToString_u24lambda_u248.append(charSequence);
                            }
                            $this$joinToString_u24lambda_u248.append(key2);
                            $this$joinToString_u24lambda_u248.append('=');
                            $this$joinToString_u24lambda_u248.append(value);
                            index3++;
                        } else {
                            k$iv2 = k$iv3;
                            int i4 = limit;
                        }
                        slot$iv$iv >>= 8;
                        j$iv$iv++;
                        i3 = 8;
                        k$iv3 = k$iv2;
                        charSequence = separator;
                    }
                    k$iv = k$iv3;
                    int i5 = limit;
                    if (bitCount$iv$iv != i3) {
                        break;
                    }
                    index = index3;
                } else {
                    k$iv = k$iv3;
                    int i6 = limit;
                    index = index2;
                }
                if (i$iv$iv == lastIndex$iv$iv) {
                    break;
                }
                i$iv$iv++;
                charSequence = separator;
                this_$iv = this_$iv2;
                $i$f$forEach = $i$f$forEach2;
                i = i2;
                k$iv3 = k$iv;
            }
            String sb2 = sb.toString();
            Intrinsics.checkNotNullExpressionValue(sb2, "StringBuilder().apply(builderAction).toString()");
            return sb2;
        }
        FloatObjectMap floatObjectMap = this_$iv;
        float[] fArr = k$iv3;
        int i7 = limit;
        int i8 = index;
        $this$joinToString_u24lambda_u248.append(charSequence3);
        String sb22 = sb.toString();
        Intrinsics.checkNotNullExpressionValue(sb22, "StringBuilder().apply(builderAction).toString()");
        return sb22;
    }

    public static /* synthetic */ String joinToString$default(FloatObjectMap $this, CharSequence separator, CharSequence prefix, CharSequence postfix, int limit, CharSequence truncated, Function2 transform, int i, Object obj) {
        CharSequence separator2;
        int limit2;
        CharSequence truncated2;
        CharSequence postfix2;
        CharSequence separator3;
        CharSequence separator4;
        Function2 function2 = transform;
        if (obj == null) {
            if ((i & 1) == 0) {
                separator2 = separator;
            }
            String prefix2 = (i & 2) != 0 ? "" : prefix;
            String postfix3 = (i & 4) != 0 ? "" : postfix;
            if ((i & 8) != 0) {
                limit2 = -1;
            } else {
                limit2 = limit;
            }
            if ((i & 16) == 0) {
                truncated2 = truncated;
            }
            Intrinsics.checkNotNullParameter(separator2, "separator");
            Intrinsics.checkNotNullParameter(prefix2, "prefix");
            Intrinsics.checkNotNullParameter(postfix3, "postfix");
            Intrinsics.checkNotNullParameter(truncated2, "truncated");
            Intrinsics.checkNotNullParameter(function2, "transform");
            StringBuilder sb = new StringBuilder();
            StringBuilder $this$joinToString_u24lambda_u2410 = sb;
            $this$joinToString_u24lambda_u2410.append(prefix2);
            int index = 0;
            FloatObjectMap this_$iv = $this;
            float[] k$iv = this_$iv.keys;
            Object[] v$iv = this_$iv.values;
            CharSequence charSequence = prefix2;
            long[] m$iv$iv = this_$iv.metadata;
            int lastIndex$iv$iv = m$iv$iv.length - 2;
            int i$iv$iv = 0;
            if (0 <= lastIndex$iv$iv) {
                loop0:
                while (true) {
                    long slot$iv$iv = m$iv$iv[i$iv$iv];
                    postfix2 = postfix3;
                    int index2 = index;
                    FloatObjectMap this_$iv2 = this_$iv;
                    long $this$maskEmptyOrDeleted$iv$iv$iv = slot$iv$iv;
                    long[] m$iv$iv2 = m$iv$iv;
                    if ((((~$this$maskEmptyOrDeleted$iv$iv$iv) << 7) & $this$maskEmptyOrDeleted$iv$iv$iv & -9187201950435737472L) != -9187201950435737472L) {
                        int i2 = 8;
                        int bitCount$iv$iv = 8 - ((~(i$iv$iv - lastIndex$iv$iv)) >>> 31);
                        int j$iv$iv = 0;
                        int index3 = index2;
                        while (j$iv$iv < bitCount$iv$iv) {
                            if ((slot$iv$iv & 255) < 128) {
                                int index$iv = (i$iv$iv << 3) + j$iv$iv;
                                float key = k$iv[index$iv];
                                Object value = v$iv[index$iv];
                                if (index3 == limit2) {
                                    $this$joinToString_u24lambda_u2410.append(truncated2);
                                    CharSequence charSequence2 = separator2;
                                    Object value2 = postfix2;
                                    break loop0;
                                }
                                if (index3 != 0) {
                                    $this$joinToString_u24lambda_u2410.append(separator2);
                                }
                                separator4 = separator2;
                                $this$joinToString_u24lambda_u2410.append((CharSequence) function2.invoke(Float.valueOf(key), value));
                                index3++;
                            } else {
                                separator4 = separator2;
                            }
                            slot$iv$iv >>= 8;
                            j$iv$iv++;
                            i2 = 8;
                            separator2 = separator4;
                        }
                        separator3 = separator2;
                        if (bitCount$iv$iv != i2) {
                            break;
                        }
                        index = index3;
                    } else {
                        separator3 = separator2;
                        index = index2;
                    }
                    if (i$iv$iv == lastIndex$iv$iv) {
                        break;
                    }
                    i$iv$iv++;
                    m$iv$iv = m$iv$iv2;
                    this_$iv = this_$iv2;
                    postfix3 = postfix2;
                    separator2 = separator3;
                }
                $this$joinToString_u24lambda_u2410.append(postfix2);
                String sb2 = sb.toString();
                Intrinsics.checkNotNullExpressionValue(sb2, "StringBuilder().apply(builderAction).toString()");
                return sb2;
            }
            long[] jArr = m$iv$iv;
            postfix2 = postfix3;
            FloatObjectMap floatObjectMap = this_$iv;
            int i3 = index;
            $this$joinToString_u24lambda_u2410.append(postfix2);
            String sb22 = sb.toString();
            Intrinsics.checkNotNullExpressionValue(sb22, "StringBuilder().apply(builderAction).toString()");
            return sb22;
        }
        throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: joinToString");
    }

    public final String joinToString(CharSequence separator, CharSequence prefix, CharSequence postfix, int limit, CharSequence truncated, Function2<? super Float, ? super V, ? extends CharSequence> transform) {
        long[] m$iv$iv;
        long[] m$iv$iv2;
        CharSequence charSequence = separator;
        CharSequence charSequence2 = prefix;
        CharSequence charSequence3 = postfix;
        CharSequence charSequence4 = truncated;
        Function2<? super Float, ? super V, ? extends CharSequence> function2 = transform;
        Intrinsics.checkNotNullParameter(charSequence, "separator");
        Intrinsics.checkNotNullParameter(charSequence2, "prefix");
        Intrinsics.checkNotNullParameter(charSequence3, "postfix");
        Intrinsics.checkNotNullParameter(charSequence4, "truncated");
        Intrinsics.checkNotNullParameter(function2, "transform");
        StringBuilder sb = new StringBuilder();
        StringBuilder $this$joinToString_u24lambda_u2410 = sb;
        $this$joinToString_u24lambda_u2410.append(charSequence2);
        int bitCount$iv$iv = 0;
        FloatObjectMap this_$iv = this;
        float[] k$iv = this_$iv.keys;
        Object[] v$iv = this_$iv.values;
        FloatObjectMap this_$iv$iv = this_$iv;
        int $i$f$forEachIndexed = 0;
        long[] m$iv$iv3 = this_$iv$iv.metadata;
        int lastIndex$iv$iv = m$iv$iv3.length - 2;
        int i$iv$iv = 0;
        if (0 <= lastIndex$iv$iv) {
            loop0:
            while (true) {
                long slot$iv$iv = m$iv$iv3[i$iv$iv];
                int index = bitCount$iv$iv;
                FloatObjectMap this_$iv2 = this_$iv;
                long $this$maskEmptyOrDeleted$iv$iv$iv = slot$iv$iv;
                FloatObjectMap this_$iv$iv2 = this_$iv$iv;
                int $i$f$forEachIndexed2 = $i$f$forEachIndexed;
                if ((((~$this$maskEmptyOrDeleted$iv$iv$iv) << 7) & $this$maskEmptyOrDeleted$iv$iv$iv & -9187201950435737472L) != -9187201950435737472L) {
                    int i = 8;
                    int bitCount$iv$iv2 = 8 - ((~(i$iv$iv - lastIndex$iv$iv)) >>> 31);
                    int j$iv$iv = 0;
                    int index2 = index;
                    while (j$iv$iv < bitCount$iv$iv2) {
                        if ((slot$iv$iv & 255) < 128) {
                            int index$iv = (i$iv$iv << 3) + j$iv$iv;
                            float key = k$iv[index$iv];
                            Object value = v$iv[index$iv];
                            m$iv$iv2 = m$iv$iv3;
                            if (index2 == limit) {
                                $this$joinToString_u24lambda_u2410.append(charSequence4);
                                break loop0;
                            }
                            if (index2 != 0) {
                                $this$joinToString_u24lambda_u2410.append(charSequence);
                            }
                            $this$joinToString_u24lambda_u2410.append((CharSequence) function2.invoke(Float.valueOf(key), value));
                            index2++;
                        } else {
                            m$iv$iv2 = m$iv$iv3;
                            int i2 = limit;
                        }
                        slot$iv$iv >>= 8;
                        j$iv$iv++;
                        i = 8;
                        m$iv$iv3 = m$iv$iv2;
                        charSequence = separator;
                    }
                    m$iv$iv = m$iv$iv3;
                    int i3 = limit;
                    if (bitCount$iv$iv2 != i) {
                        break;
                    }
                    bitCount$iv$iv = index2;
                } else {
                    m$iv$iv = m$iv$iv3;
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
                m$iv$iv3 = m$iv$iv;
            }
            String sb2 = sb.toString();
            Intrinsics.checkNotNullExpressionValue(sb2, "StringBuilder().apply(builderAction).toString()");
            return sb2;
        }
        FloatObjectMap floatObjectMap = this_$iv;
        FloatObjectMap floatObjectMap2 = this_$iv$iv;
        int i5 = limit;
        int i6 = bitCount$iv$iv;
        $this$joinToString_u24lambda_u2410.append(charSequence3);
        String sb22 = sb.toString();
        Intrinsics.checkNotNullExpressionValue(sb22, "StringBuilder().apply(builderAction).toString()");
        return sb22;
    }

    public int hashCode() {
        int bitCount$iv$iv = 0;
        FloatObjectMap this_$iv = this;
        float[] k$iv = this_$iv.keys;
        Object[] v$iv = this_$iv.values;
        long[] m$iv$iv = this_$iv.metadata;
        int lastIndex$iv$iv = m$iv$iv.length - 2;
        int i$iv$iv = 0;
        if (0 <= lastIndex$iv$iv) {
            while (true) {
                long slot$iv$iv = m$iv$iv[i$iv$iv];
                long $this$maskEmptyOrDeleted$iv$iv$iv = slot$iv$iv;
                int hash = bitCount$iv$iv;
                FloatObjectMap this_$iv2 = this_$iv;
                if ((((~$this$maskEmptyOrDeleted$iv$iv$iv) << 7) & $this$maskEmptyOrDeleted$iv$iv$iv & -9187201950435737472L) != -9187201950435737472L) {
                    int bitCount$iv$iv2 = 8 - ((~(i$iv$iv - lastIndex$iv$iv)) >>> 31);
                    for (int j$iv$iv = 0; j$iv$iv < bitCount$iv$iv2; j$iv$iv++) {
                        int i = 0;
                        if ((255 & slot$iv$iv) < 128) {
                            int index$iv = (i$iv$iv << 3) + j$iv$iv;
                            float key = k$iv[index$iv];
                            Object value = v$iv[index$iv];
                            int hashCode = Float.hashCode(key);
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
        FloatObjectMap this_$iv;
        boolean z;
        FloatObjectMap this_$iv2;
        Object obj = other;
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof FloatObjectMap) || ((FloatObjectMap) obj).getSize() != getSize()) {
            return false;
        }
        FloatObjectMap this_$iv3 = this;
        int $i$f$forEach = 0;
        float[] k$iv = this_$iv3.keys;
        Object[] v$iv = this_$iv3.values;
        long[] m$iv$iv = this_$iv3.metadata;
        int lastIndex$iv$iv = m$iv$iv.length - 2;
        int i$iv$iv = 0;
        if (0 <= lastIndex$iv$iv) {
            while (true) {
                long slot$iv$iv = m$iv$iv[i$iv$iv];
                long $this$maskEmptyOrDeleted$iv$iv$iv = slot$iv$iv;
                int $i$f$forEach2 = $i$f$forEach;
                if ((((~$this$maskEmptyOrDeleted$iv$iv$iv) << 7) & $this$maskEmptyOrDeleted$iv$iv$iv & -9187201950435737472L) != -9187201950435737472L) {
                    int i = 8;
                    int bitCount$iv$iv = 8 - ((~(i$iv$iv - lastIndex$iv$iv)) >>> 31);
                    int j$iv$iv = 0;
                    while (j$iv$iv < bitCount$iv$iv) {
                        if (((slot$iv$iv & 255) < 128 ? 1 : 0) != 0) {
                            int index$iv = (i$iv$iv << 3) + j$iv$iv;
                            float key = k$iv[index$iv];
                            Object value = v$iv[index$iv];
                            if (value == null) {
                                this_$iv2 = this_$iv3;
                                if (((FloatObjectMap) obj).get(key) != null || !((FloatObjectMap) obj).containsKey(key)) {
                                    return false;
                                }
                            } else {
                                this_$iv2 = this_$iv3;
                                if (!Intrinsics.areEqual(value, ((FloatObjectMap) obj).get(key))) {
                                    return false;
                                }
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
                    z = false;
                    if (bitCount$iv$iv != i) {
                        return true;
                    }
                } else {
                    this_$iv = this_$iv3;
                    z = false;
                }
                if (i$iv$iv == lastIndex$iv$iv) {
                    return true;
                }
                i$iv$iv++;
                boolean z2 = z;
                $i$f$forEach = $i$f$forEach2;
                this_$iv3 = this_$iv;
            }
        } else {
            return true;
        }
    }

    public String toString() {
        int $i$f$forEach;
        int $i$f$forEach2;
        FloatObjectMap floatObjectMap = this;
        if (isEmpty()) {
            return "{}";
        }
        StringBuilder s = new StringBuilder().append('{');
        int bitCount$iv$iv = 0;
        FloatObjectMap this_$iv = this;
        int $i$f$forEach3 = 0;
        float[] k$iv = this_$iv.keys;
        Object[] v$iv = this_$iv.values;
        long[] m$iv$iv = this_$iv.metadata;
        int lastIndex$iv$iv = m$iv$iv.length - 2;
        int i$iv$iv = 0;
        if (0 <= lastIndex$iv$iv) {
            while (true) {
                long slot$iv$iv = m$iv$iv[i$iv$iv];
                long $this$maskEmptyOrDeleted$iv$iv$iv = slot$iv$iv;
                int i = bitCount$iv$iv;
                FloatObjectMap this_$iv2 = this_$iv;
                if ((((~$this$maskEmptyOrDeleted$iv$iv$iv) << 7) & $this$maskEmptyOrDeleted$iv$iv$iv & -9187201950435737472L) != -9187201950435737472L) {
                    int i2 = 8;
                    int bitCount$iv$iv2 = 8 - ((~(i$iv$iv - lastIndex$iv$iv)) >>> 31);
                    int j$iv$iv = 0;
                    while (j$iv$iv < bitCount$iv$iv2) {
                        if ((255 & slot$iv$iv) < 128) {
                            int index$iv = (i$iv$iv << 3) + j$iv$iv;
                            float key = k$iv[index$iv];
                            $i$f$forEach2 = $i$f$forEach3;
                            Object value = v$iv[index$iv];
                            s.append(key);
                            float f = key;
                            s.append("=");
                            s.append(value == floatObjectMap ? "(this)" : value);
                            int i3 = i + 1;
                            Object obj = value;
                            if (i3 < floatObjectMap._size) {
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
                        floatObjectMap = this;
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
                floatObjectMap = this;
                this_$iv = this_$iv2;
                $i$f$forEach3 = $i$f$forEach;
            }
        }
        int i4 = bitCount$iv$iv;
        String sb = s.append('}').toString();
        Intrinsics.checkNotNullExpressionValue(sb, "s.append('}').toString()");
        return sb;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:13:0x008c, code lost:
        r9 = r1;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:14:0x009b, code lost:
        if (((((~r9) << 6) & r9) & -9187201950435737472L) == 0) goto L_0x00a0;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:15:0x009d, code lost:
        return -1;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final int findKeyIndex$collection(float r23) {
        /*
            r22 = this;
            r0 = r22
            r1 = 0
            r2 = 0
            int r3 = java.lang.Float.hashCode(r23)
            r4 = -862048943(0xffffffffcc9e2d51, float:-8.2930312E7)
            int r3 = r3 * r4
            int r4 = r3 << 16
            r2 = r3 ^ r4
            r3 = 0
            r3 = r2 & 127(0x7f, float:1.78E-43)
            int r4 = r0._capacity
            r5 = 0
            int r5 = r2 >>> 7
            r5 = r5 & r4
            r6 = 0
        L_0x001c:
            long[] r7 = r0.metadata
            r8 = 0
            int r9 = r5 >> 3
            r10 = r5 & 7
            int r10 = r10 << 3
            r11 = r7[r9]
            long r11 = r11 >>> r10
            int r13 = r9 + 1
            r13 = r7[r13]
            int r15 = 64 - r10
            long r13 = r13 << r15
            r15 = r1
            r16 = r2
            long r1 = (long) r10
            long r1 = -r1
            r17 = 63
            long r1 = r1 >> r17
            long r1 = r1 & r13
            long r1 = r1 | r11
            r7 = r1
            r9 = 0
            long r10 = (long) r3
            r12 = 72340172838076673(0x101010101010101, double:7.748604185489348E-304)
            long r10 = r10 * r12
            long r10 = r10 ^ r7
            long r12 = r10 - r12
            r17 = r7
            long r7 = ~r10
            long r7 = r7 & r12
            r12 = -9187201950435737472(0x8080808080808080, double:-2.937446524422997E-306)
            long r7 = r7 & r12
        L_0x0053:
            r9 = r7
            r11 = 0
            r17 = 0
            int r14 = (r9 > r17 ? 1 : (r9 == r17 ? 0 : -1))
            r19 = 0
            r20 = 1
            if (r14 == 0) goto L_0x0062
            r9 = r20
            goto L_0x0064
        L_0x0062:
            r9 = r19
        L_0x0064:
            if (r9 == 0) goto L_0x008c
            r9 = r7
            r11 = 0
            r17 = r9
            r14 = 0
            int r21 = java.lang.Long.numberOfTrailingZeros(r17)
            int r14 = r21 >> 3
            int r14 = r14 + r5
            r9 = r14 & r4
            float[] r10 = r0.keys
            r10 = r10[r9]
            int r10 = (r10 > r23 ? 1 : (r10 == r23 ? 0 : -1))
            if (r10 != 0) goto L_0x007f
            r19 = r20
        L_0x007f:
            if (r19 == 0) goto L_0x0082
            return r9
        L_0x0082:
            r10 = r7
            r14 = 0
            r17 = 1
            long r17 = r10 - r17
            long r10 = r10 & r17
            r7 = r10
            goto L_0x0053
        L_0x008c:
            r9 = r1
            r11 = 0
            long r12 = ~r9
            r14 = 6
            long r12 = r12 << r14
            long r12 = r12 & r9
            r19 = -9187201950435737472(0x8080808080808080, double:-2.937446524422997E-306)
            long r9 = r12 & r19
            int r9 = (r9 > r17 ? 1 : (r9 == r17 ? 0 : -1))
            if (r9 == 0) goto L_0x00a0
            r1 = -1
            return r1
        L_0x00a0:
            int r6 = r6 + 8
            int r9 = r5 + r6
            r5 = r9 & r4
            r1 = r15
            r2 = r16
            goto L_0x001c
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.collection.FloatObjectMap.findKeyIndex$collection(float):int");
    }

    public final String joinToString(CharSequence separator, CharSequence prefix, CharSequence postfix, int limit, Function2<? super Float, ? super V, ? extends CharSequence> transform) {
        long[] m$iv$iv$iv;
        long[] m$iv$iv$iv2;
        CharSequence charSequence = separator;
        CharSequence charSequence2 = prefix;
        CharSequence charSequence3 = postfix;
        Function2<? super Float, ? super V, ? extends CharSequence> function2 = transform;
        Intrinsics.checkNotNullParameter(charSequence, "separator");
        Intrinsics.checkNotNullParameter(charSequence2, "prefix");
        Intrinsics.checkNotNullParameter(charSequence3, "postfix");
        Intrinsics.checkNotNullParameter(function2, "transform");
        StringBuilder sb = new StringBuilder();
        StringBuilder $this$joinToString_u24lambda_u2410$iv = sb;
        int i = 0;
        $this$joinToString_u24lambda_u2410$iv.append(charSequence2);
        int index$iv = 0;
        FloatObjectMap this_$iv$iv = this;
        int $i$f$forEach = 0;
        float[] k$iv$iv = this_$iv$iv.keys;
        Object[] v$iv$iv = this_$iv$iv.values;
        long[] m$iv$iv$iv3 = this_$iv$iv.metadata;
        int lastIndex$iv$iv$iv = m$iv$iv$iv3.length - 2;
        int i$iv$iv$iv = 0;
        if (0 <= lastIndex$iv$iv$iv) {
            loop0:
            while (true) {
                long slot$iv$iv$iv = m$iv$iv$iv3[i$iv$iv$iv];
                int i2 = i;
                int index$iv2 = index$iv;
                long $this$maskEmptyOrDeleted$iv$iv$iv$iv = slot$iv$iv$iv;
                FloatObjectMap this_$iv$iv2 = this_$iv$iv;
                int $i$f$forEach2 = $i$f$forEach;
                if ((((~$this$maskEmptyOrDeleted$iv$iv$iv$iv) << 7) & $this$maskEmptyOrDeleted$iv$iv$iv$iv & -9187201950435737472L) != -9187201950435737472L) {
                    int i3 = 8;
                    int bitCount$iv$iv$iv = 8 - ((~(i$iv$iv$iv - lastIndex$iv$iv$iv)) >>> 31);
                    int j$iv$iv$iv = 0;
                    int index$iv3 = index$iv2;
                    while (j$iv$iv$iv < bitCount$iv$iv$iv) {
                        if ((slot$iv$iv$iv & 255) < 128) {
                            int index$iv$iv = (i$iv$iv$iv << 3) + j$iv$iv$iv;
                            float key$iv = k$iv$iv[index$iv$iv];
                            Object value$iv = v$iv$iv[index$iv$iv];
                            m$iv$iv$iv2 = m$iv$iv$iv3;
                            if (index$iv3 == limit) {
                                $this$joinToString_u24lambda_u2410$iv.append(truncated$iv);
                                break loop0;
                            }
                            if (index$iv3 != 0) {
                                $this$joinToString_u24lambda_u2410$iv.append(charSequence);
                            }
                            $this$joinToString_u24lambda_u2410$iv.append((CharSequence) function2.invoke(Float.valueOf(key$iv), value$iv));
                            index$iv3++;
                        } else {
                            m$iv$iv$iv2 = m$iv$iv$iv3;
                            int i4 = limit;
                        }
                        slot$iv$iv$iv >>= 8;
                        j$iv$iv$iv++;
                        i3 = 8;
                        m$iv$iv$iv3 = m$iv$iv$iv2;
                        charSequence = separator;
                    }
                    m$iv$iv$iv = m$iv$iv$iv3;
                    int i5 = limit;
                    if (bitCount$iv$iv$iv != i3) {
                        break;
                    }
                    index$iv = index$iv3;
                } else {
                    m$iv$iv$iv = m$iv$iv$iv3;
                    int i6 = limit;
                    index$iv = index$iv2;
                }
                if (i$iv$iv$iv == lastIndex$iv$iv$iv) {
                    break;
                }
                i$iv$iv$iv++;
                charSequence = separator;
                this_$iv$iv = this_$iv$iv2;
                $i$f$forEach = $i$f$forEach2;
                i = i2;
                m$iv$iv$iv3 = m$iv$iv$iv;
            }
            String sb2 = sb.toString();
            Intrinsics.checkNotNullExpressionValue(sb2, "StringBuilder().apply(builderAction).toString()");
            return sb2;
        }
        FloatObjectMap floatObjectMap = this_$iv$iv;
        int i7 = limit;
        int i8 = index$iv;
        $this$joinToString_u24lambda_u2410$iv.append(charSequence3);
        String sb22 = sb.toString();
        Intrinsics.checkNotNullExpressionValue(sb22, "StringBuilder().apply(builderAction).toString()");
        return sb22;
    }

    public final String joinToString(CharSequence separator, CharSequence prefix, CharSequence postfix, Function2<? super Float, ? super V, ? extends CharSequence> transform) {
        CharSequence charSequence = separator;
        CharSequence charSequence2 = prefix;
        CharSequence charSequence3 = postfix;
        Function2<? super Float, ? super V, ? extends CharSequence> function2 = transform;
        Intrinsics.checkNotNullParameter(charSequence, "separator");
        Intrinsics.checkNotNullParameter(charSequence2, "prefix");
        Intrinsics.checkNotNullParameter(charSequence3, "postfix");
        Intrinsics.checkNotNullParameter(function2, "transform");
        StringBuilder sb = new StringBuilder();
        StringBuilder $this$joinToString_u24lambda_u2410$iv = sb;
        int i = 0;
        $this$joinToString_u24lambda_u2410$iv.append(charSequence2);
        int index$iv = 0;
        FloatObjectMap this_$iv$iv = this;
        int $i$f$forEach = 0;
        float[] k$iv$iv = this_$iv$iv.keys;
        Object[] v$iv$iv = this_$iv$iv.values;
        FloatObjectMap this_$iv$iv$iv = this_$iv$iv;
        long[] m$iv$iv$iv = this_$iv$iv$iv.metadata;
        FloatObjectMap floatObjectMap = this_$iv$iv$iv;
        int lastIndex$iv$iv$iv = m$iv$iv$iv.length - 2;
        int i$iv$iv$iv = 0;
        if (0 <= lastIndex$iv$iv$iv) {
            loop0:
            while (true) {
                long slot$iv$iv$iv = m$iv$iv$iv[i$iv$iv$iv];
                int i2 = i;
                int index$iv2 = index$iv;
                long $this$maskEmptyOrDeleted$iv$iv$iv$iv = slot$iv$iv$iv;
                FloatObjectMap this_$iv$iv2 = this_$iv$iv;
                int $i$f$forEach2 = $i$f$forEach;
                if ((((~$this$maskEmptyOrDeleted$iv$iv$iv$iv) << 7) & $this$maskEmptyOrDeleted$iv$iv$iv$iv & -9187201950435737472L) != -9187201950435737472L) {
                    int i3 = 8;
                    int bitCount$iv$iv$iv = 8 - ((~(i$iv$iv$iv - lastIndex$iv$iv$iv)) >>> 31);
                    int j$iv$iv$iv = 0;
                    int index$iv3 = index$iv2;
                    while (j$iv$iv$iv < bitCount$iv$iv$iv) {
                        if ((slot$iv$iv$iv & 255) < 128) {
                            int index$iv$iv = (i$iv$iv$iv << 3) + j$iv$iv$iv;
                            float key$iv = k$iv$iv[index$iv$iv];
                            Object value$iv = v$iv$iv[index$iv$iv];
                            if (index$iv3 == -1) {
                                $this$joinToString_u24lambda_u2410$iv.append(truncated$iv);
                                break loop0;
                            }
                            if (index$iv3 != 0) {
                                $this$joinToString_u24lambda_u2410$iv.append(charSequence);
                            }
                            $this$joinToString_u24lambda_u2410$iv.append((CharSequence) function2.invoke(Float.valueOf(key$iv), value$iv));
                            index$iv3++;
                        }
                        slot$iv$iv$iv >>= 8;
                        j$iv$iv$iv++;
                        i3 = 8;
                        charSequence = separator;
                    }
                    if (bitCount$iv$iv$iv != i3) {
                        break;
                    }
                    index$iv = index$iv3;
                } else {
                    index$iv = index$iv2;
                }
                if (i$iv$iv$iv == lastIndex$iv$iv$iv) {
                    break;
                }
                i$iv$iv$iv++;
                charSequence = separator;
                this_$iv$iv = this_$iv$iv2;
                $i$f$forEach = $i$f$forEach2;
                i = i2;
            }
            String sb2 = sb.toString();
            Intrinsics.checkNotNullExpressionValue(sb2, "StringBuilder().apply(builderAction).toString()");
            return sb2;
        }
        FloatObjectMap floatObjectMap2 = this_$iv$iv;
        int i4 = index$iv;
        $this$joinToString_u24lambda_u2410$iv.append(charSequence3);
        String sb22 = sb.toString();
        Intrinsics.checkNotNullExpressionValue(sb22, "StringBuilder().apply(builderAction).toString()");
        return sb22;
    }

    public final String joinToString(CharSequence separator, CharSequence prefix, Function2<? super Float, ? super V, ? extends CharSequence> transform) {
        CharSequence charSequence = separator;
        CharSequence charSequence2 = prefix;
        Function2<? super Float, ? super V, ? extends CharSequence> function2 = transform;
        Intrinsics.checkNotNullParameter(charSequence, "separator");
        Intrinsics.checkNotNullParameter(charSequence2, "prefix");
        Intrinsics.checkNotNullParameter(function2, "transform");
        StringBuilder sb = new StringBuilder();
        StringBuilder $this$joinToString_u24lambda_u2410$iv = sb;
        int i = 0;
        $this$joinToString_u24lambda_u2410$iv.append(charSequence2);
        int index$iv = 0;
        FloatObjectMap this_$iv$iv = this;
        int $i$f$forEach = 0;
        float[] k$iv$iv = this_$iv$iv.keys;
        Object[] v$iv$iv = this_$iv$iv.values;
        FloatObjectMap this_$iv$iv$iv = this_$iv$iv;
        long[] m$iv$iv$iv = this_$iv$iv$iv.metadata;
        FloatObjectMap floatObjectMap = this_$iv$iv$iv;
        int lastIndex$iv$iv$iv = m$iv$iv$iv.length - 2;
        int i$iv$iv$iv = 0;
        if (0 <= lastIndex$iv$iv$iv) {
            loop0:
            while (true) {
                long slot$iv$iv$iv = m$iv$iv$iv[i$iv$iv$iv];
                int i2 = i;
                int index$iv2 = index$iv;
                long $this$maskEmptyOrDeleted$iv$iv$iv$iv = slot$iv$iv$iv;
                FloatObjectMap this_$iv$iv2 = this_$iv$iv;
                int $i$f$forEach2 = $i$f$forEach;
                if ((((~$this$maskEmptyOrDeleted$iv$iv$iv$iv) << 7) & $this$maskEmptyOrDeleted$iv$iv$iv$iv & -9187201950435737472L) != -9187201950435737472L) {
                    int i3 = 8;
                    int bitCount$iv$iv$iv = 8 - ((~(i$iv$iv$iv - lastIndex$iv$iv$iv)) >>> 31);
                    int j$iv$iv$iv = 0;
                    int index$iv3 = index$iv2;
                    while (j$iv$iv$iv < bitCount$iv$iv$iv) {
                        if ((slot$iv$iv$iv & 255) < 128) {
                            int index$iv$iv = (i$iv$iv$iv << 3) + j$iv$iv$iv;
                            float key$iv = k$iv$iv[index$iv$iv];
                            Object value$iv = v$iv$iv[index$iv$iv];
                            if (index$iv3 == -1) {
                                $this$joinToString_u24lambda_u2410$iv.append(truncated$iv);
                                break loop0;
                            }
                            if (index$iv3 != 0) {
                                $this$joinToString_u24lambda_u2410$iv.append(charSequence);
                            }
                            $this$joinToString_u24lambda_u2410$iv.append((CharSequence) function2.invoke(Float.valueOf(key$iv), value$iv));
                            index$iv3++;
                        }
                        slot$iv$iv$iv >>= 8;
                        j$iv$iv$iv++;
                        i3 = 8;
                        charSequence = separator;
                    }
                    if (bitCount$iv$iv$iv != i3) {
                        break;
                    }
                    index$iv = index$iv3;
                } else {
                    index$iv = index$iv2;
                }
                if (i$iv$iv$iv == lastIndex$iv$iv$iv) {
                    break;
                }
                i$iv$iv$iv++;
                charSequence = separator;
                this_$iv$iv = this_$iv$iv2;
                $i$f$forEach = $i$f$forEach2;
                i = i2;
            }
            String sb2 = sb.toString();
            Intrinsics.checkNotNullExpressionValue(sb2, "StringBuilder().apply(builderAction).toString()");
            return sb2;
        }
        FloatObjectMap floatObjectMap2 = this_$iv$iv;
        int i4 = index$iv;
        $this$joinToString_u24lambda_u2410$iv.append(postfix$iv);
        String sb22 = sb.toString();
        Intrinsics.checkNotNullExpressionValue(sb22, "StringBuilder().apply(builderAction).toString()");
        return sb22;
    }

    public final String joinToString(CharSequence separator, Function2<? super Float, ? super V, ? extends CharSequence> transform) {
        CharSequence charSequence = separator;
        Function2<? super Float, ? super V, ? extends CharSequence> function2 = transform;
        Intrinsics.checkNotNullParameter(charSequence, "separator");
        Intrinsics.checkNotNullParameter(function2, "transform");
        CharSequence prefix$iv = "";
        StringBuilder sb = new StringBuilder();
        StringBuilder $this$joinToString_u24lambda_u2410$iv = sb;
        int i = 0;
        $this$joinToString_u24lambda_u2410$iv.append(prefix$iv);
        int index$iv = 0;
        FloatObjectMap this_$iv$iv = this;
        int $i$f$forEach = 0;
        float[] k$iv$iv = this_$iv$iv.keys;
        Object[] v$iv$iv = this_$iv$iv.values;
        FloatObjectMap this_$iv$iv$iv = this_$iv$iv;
        CharSequence charSequence2 = prefix$iv;
        long[] m$iv$iv$iv = this_$iv$iv$iv.metadata;
        FloatObjectMap floatObjectMap = this_$iv$iv$iv;
        int lastIndex$iv$iv$iv = m$iv$iv$iv.length - 2;
        int i$iv$iv$iv = 0;
        if (0 <= lastIndex$iv$iv$iv) {
            loop0:
            while (true) {
                long slot$iv$iv$iv = m$iv$iv$iv[i$iv$iv$iv];
                int i2 = i;
                int index$iv2 = index$iv;
                long $this$maskEmptyOrDeleted$iv$iv$iv$iv = slot$iv$iv$iv;
                FloatObjectMap this_$iv$iv2 = this_$iv$iv;
                int $i$f$forEach2 = $i$f$forEach;
                if ((((~$this$maskEmptyOrDeleted$iv$iv$iv$iv) << 7) & $this$maskEmptyOrDeleted$iv$iv$iv$iv & -9187201950435737472L) != -9187201950435737472L) {
                    int i3 = 8;
                    int bitCount$iv$iv$iv = 8 - ((~(i$iv$iv$iv - lastIndex$iv$iv$iv)) >>> 31);
                    int j$iv$iv$iv = 0;
                    int index$iv3 = index$iv2;
                    while (j$iv$iv$iv < bitCount$iv$iv$iv) {
                        if ((slot$iv$iv$iv & 255) < 128) {
                            int index$iv$iv = (i$iv$iv$iv << 3) + j$iv$iv$iv;
                            float key$iv = k$iv$iv[index$iv$iv];
                            Object value$iv = v$iv$iv[index$iv$iv];
                            if (index$iv3 == -1) {
                                $this$joinToString_u24lambda_u2410$iv.append(truncated$iv);
                                break loop0;
                            }
                            if (index$iv3 != 0) {
                                $this$joinToString_u24lambda_u2410$iv.append(charSequence);
                            }
                            $this$joinToString_u24lambda_u2410$iv.append((CharSequence) function2.invoke(Float.valueOf(key$iv), value$iv));
                            index$iv3++;
                        }
                        slot$iv$iv$iv >>= 8;
                        j$iv$iv$iv++;
                        i3 = 8;
                        charSequence = separator;
                    }
                    if (bitCount$iv$iv$iv != i3) {
                        break;
                    }
                    index$iv = index$iv3;
                } else {
                    index$iv = index$iv2;
                }
                if (i$iv$iv$iv == lastIndex$iv$iv$iv) {
                    break;
                }
                i$iv$iv$iv++;
                charSequence = separator;
                this_$iv$iv = this_$iv$iv2;
                $i$f$forEach = $i$f$forEach2;
                i = i2;
            }
            String sb2 = sb.toString();
            Intrinsics.checkNotNullExpressionValue(sb2, "StringBuilder().apply(builderAction).toString()");
            return sb2;
        }
        FloatObjectMap floatObjectMap2 = this_$iv$iv;
        int i4 = index$iv;
        $this$joinToString_u24lambda_u2410$iv.append(postfix$iv);
        String sb22 = sb.toString();
        Intrinsics.checkNotNullExpressionValue(sb22, "StringBuilder().apply(builderAction).toString()");
        return sb22;
    }

    public final String joinToString(Function2<? super Float, ? super V, ? extends CharSequence> transform) {
        CharSequence separator$iv;
        CharSequence separator$iv2;
        Function2<? super Float, ? super V, ? extends CharSequence> function2 = transform;
        Intrinsics.checkNotNullParameter(function2, "transform");
        CharSequence prefix$iv = "";
        StringBuilder sb = new StringBuilder();
        StringBuilder $this$joinToString_u24lambda_u2410$iv = sb;
        int i = 0;
        $this$joinToString_u24lambda_u2410$iv.append(prefix$iv);
        int index$iv = 0;
        FloatObjectMap this_$iv$iv = this;
        int $i$f$forEach = 0;
        float[] k$iv$iv = this_$iv$iv.keys;
        Object[] v$iv$iv = this_$iv$iv.values;
        FloatObjectMap this_$iv$iv$iv = this_$iv$iv;
        CharSequence charSequence = prefix$iv;
        long[] m$iv$iv$iv = this_$iv$iv$iv.metadata;
        FloatObjectMap floatObjectMap = this_$iv$iv$iv;
        int lastIndex$iv$iv$iv = m$iv$iv$iv.length - 2;
        int i$iv$iv$iv = 0;
        if (0 <= lastIndex$iv$iv$iv) {
            loop0:
            while (true) {
                long slot$iv$iv$iv = m$iv$iv$iv[i$iv$iv$iv];
                int i2 = i;
                int index$iv2 = index$iv;
                long $this$maskEmptyOrDeleted$iv$iv$iv$iv = slot$iv$iv$iv;
                FloatObjectMap this_$iv$iv2 = this_$iv$iv;
                int $i$f$forEach2 = $i$f$forEach;
                if ((((~$this$maskEmptyOrDeleted$iv$iv$iv$iv) << 7) & $this$maskEmptyOrDeleted$iv$iv$iv$iv & -9187201950435737472L) != -9187201950435737472L) {
                    int i3 = 8;
                    int bitCount$iv$iv$iv = 8 - ((~(i$iv$iv$iv - lastIndex$iv$iv$iv)) >>> 31);
                    int j$iv$iv$iv = 0;
                    int index$iv3 = index$iv2;
                    while (j$iv$iv$iv < bitCount$iv$iv$iv) {
                        if ((slot$iv$iv$iv & 255) < 128) {
                            int index$iv$iv = (i$iv$iv$iv << 3) + j$iv$iv$iv;
                            float key$iv = k$iv$iv[index$iv$iv];
                            Object value$iv = v$iv$iv[index$iv$iv];
                            if (index$iv3 == -1) {
                                $this$joinToString_u24lambda_u2410$iv.append(truncated$iv);
                                CharSequence charSequence2 = separator$iv;
                                break loop0;
                            }
                            if (index$iv3 != 0) {
                                $this$joinToString_u24lambda_u2410$iv.append(separator$iv);
                            }
                            separator$iv2 = separator$iv;
                            $this$joinToString_u24lambda_u2410$iv.append((CharSequence) function2.invoke(Float.valueOf(key$iv), value$iv));
                            index$iv3++;
                        } else {
                            separator$iv2 = separator$iv;
                        }
                        slot$iv$iv$iv >>= 8;
                        j$iv$iv$iv++;
                        i3 = 8;
                        separator$iv = separator$iv2;
                    }
                    separator$iv = separator$iv;
                    if (bitCount$iv$iv$iv != i3) {
                        break;
                    }
                    index$iv = index$iv3;
                } else {
                    separator$iv = separator$iv;
                    index$iv = index$iv2;
                }
                if (i$iv$iv$iv == lastIndex$iv$iv$iv) {
                    break;
                }
                i$iv$iv$iv++;
                this_$iv$iv = this_$iv$iv2;
                $i$f$forEach = $i$f$forEach2;
                i = i2;
                separator$iv = separator$iv;
            }
            String sb2 = sb.toString();
            Intrinsics.checkNotNullExpressionValue(sb2, "StringBuilder().apply(builderAction).toString()");
            return sb2;
        }
        FloatObjectMap floatObjectMap2 = this_$iv$iv;
        int i4 = index$iv;
        $this$joinToString_u24lambda_u2410$iv.append(postfix$iv);
        String sb22 = sb.toString();
        Intrinsics.checkNotNullExpressionValue(sb22, "StringBuilder().apply(builderAction).toString()");
        return sb22;
    }
}
