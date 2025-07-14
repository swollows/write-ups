package androidx.collection;

import androidx.constraintlayout.core.motion.utils.TypedValues;
import kotlin.Metadata;
import kotlin.ULong;
import kotlin.collections.ArraysKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.scheduling.WorkQueueKt;

@Metadata(d1 = {"\u0000H\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0006\n\u0002\u0010\t\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0015\n\u0002\b\u0007\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\b\u0018\u00002\u00020\u0001B\u000f\u0012\b\b\u0002\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004J\b\u0010\u0006\u001a\u00020\u0007H\u0002J\u0006\u0010\b\u001a\u00020\u0007J\u0010\u0010\t\u001a\u00020\u00032\u0006\u0010\n\u001a\u00020\u0003H\u0002J\u0010\u0010\u000b\u001a\u00020\u00032\u0006\u0010\f\u001a\u00020\u0003H\u0002J\"\u0010\r\u001a\u00020\u000e2\u0006\u0010\f\u001a\u00020\u00032\f\u0010\u000f\u001a\b\u0012\u0004\u0012\u00020\u000e0\u0010H\bø\u0001\u0000J\b\u0010\u0011\u001a\u00020\u0007H\u0002J\u0010\u0010\u0012\u001a\u00020\u00072\u0006\u0010\u0013\u001a\u00020\u0003H\u0002J\u0010\u0010\u0014\u001a\u00020\u00072\u0006\u0010\u0002\u001a\u00020\u0003H\u0002J\u0011\u0010\u0015\u001a\u00020\u00072\u0006\u0010\u0016\u001a\u00020\u0017H\nJ\u0011\u0010\u0015\u001a\u00020\u00072\u0006\u0010\u0016\u001a\u00020\u0018H\nJ\u0011\u0010\u0015\u001a\u00020\u00072\u0006\u0010\f\u001a\u00020\u0003H\nJ\u0011\u0010\u0015\u001a\u00020\u00072\u0006\u0010\u0016\u001a\u00020\u0019H\nJ\u0011\u0010\u001a\u001a\u00020\u00072\u0006\u0010\u001b\u001a\u00020\u0001H\nJ\u0016\u0010\u001c\u001a\u00020\u00072\u0006\u0010\f\u001a\u00020\u00032\u0006\u0010\u001d\u001a\u00020\u000eJ\u001e\u0010\u001c\u001a\u00020\u000e2\u0006\u0010\f\u001a\u00020\u00032\u0006\u0010\u001d\u001a\u00020\u000e2\u0006\u0010\u001e\u001a\u00020\u000eJ\u000e\u0010\u001f\u001a\u00020\u00072\u0006\u0010\u001b\u001a\u00020\u0001J\u000e\u0010 \u001a\u00020\u00072\u0006\u0010\f\u001a\u00020\u0003J\u0016\u0010 \u001a\u00020!2\u0006\u0010\f\u001a\u00020\u00032\u0006\u0010\u001d\u001a\u00020\u000eJ\b\u0010\"\u001a\u00020\u0007H\u0002J&\u0010#\u001a\u00020\u00072\u0018\u0010$\u001a\u0014\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u000e\u0012\u0004\u0012\u00020!0%H\bø\u0001\u0000J\u0010\u0010&\u001a\u00020\u00072\u0006\u0010'\u001a\u00020\u0003H\u0001J\u0010\u0010(\u001a\u00020\u00072\u0006\u0010)\u001a\u00020\u0003H\u0002J\u0019\u0010*\u001a\u00020\u00072\u0006\u0010\f\u001a\u00020\u00032\u0006\u0010\u001d\u001a\u00020\u000eH\u0002J\u0006\u0010+\u001a\u00020\u0003J\u0019\u0010,\u001a\u00020\u00072\u0006\u0010'\u001a\u00020\u00032\u0006\u0010\u001d\u001a\u00020\u000eH\bR\u000e\u0010\u0005\u001a\u00020\u0003X\u000e¢\u0006\u0002\n\u0000\u0002\u0007\n\u0005\b20\u0001¨\u0006-"}, d2 = {"Landroidx/collection/MutableIntLongMap;", "Landroidx/collection/IntLongMap;", "initialCapacity", "", "(I)V", "growthLimit", "adjustStorage", "", "clear", "findFirstAvailableSlot", "hash1", "findInsertIndex", "key", "getOrPut", "", "defaultValue", "Lkotlin/Function0;", "initializeGrowth", "initializeMetadata", "capacity", "initializeStorage", "minusAssign", "keys", "Landroidx/collection/IntList;", "Landroidx/collection/IntSet;", "", "plusAssign", "from", "put", "value", "default", "putAll", "remove", "", "removeDeletedMarkers", "removeIf", "predicate", "Lkotlin/Function2;", "removeValueAt", "index", "resizeStorage", "newCapacity", "set", "trim", "writeMetadata", "collection"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* compiled from: IntLongMap.kt */
public final class MutableIntLongMap extends IntLongMap {
    private int growthLimit;

    public MutableIntLongMap() {
        this(0, 1, (DefaultConstructorMarker) null);
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public /* synthetic */ MutableIntLongMap(int i, int i2, DefaultConstructorMarker defaultConstructorMarker) {
        this((i2 & 1) != 0 ? 6 : i);
    }

    public MutableIntLongMap(int initialCapacity) {
        super((DefaultConstructorMarker) null);
        if (initialCapacity >= 0) {
            initializeStorage(ScatterMapKt.unloadedCapacity(initialCapacity));
            return;
        }
        throw new IllegalArgumentException("Capacity must be a positive value.".toString());
    }

    private final void initializeStorage(int initialCapacity) {
        int newCapacity;
        if (initialCapacity > 0) {
            newCapacity = Math.max(7, ScatterMapKt.normalizeCapacity(initialCapacity));
        } else {
            newCapacity = 0;
        }
        this._capacity = newCapacity;
        initializeMetadata(newCapacity);
        this.keys = new int[newCapacity];
        this.values = new long[newCapacity];
    }

    private final void initializeMetadata(int capacity) {
        long[] jArr;
        if (capacity == 0) {
            jArr = ScatterMapKt.EmptyGroup;
        } else {
            long[] $this$initializeMetadata_u24lambda_u241 = new long[(((((capacity + 1) + 7) + 7) & -8) >> 3)];
            ArraysKt.fill$default($this$initializeMetadata_u24lambda_u241, -9187201950435737472L, 0, 0, 6, (Object) null);
            jArr = $this$initializeMetadata_u24lambda_u241;
        }
        this.metadata = jArr;
        long[] data$iv = this.metadata;
        int i$iv = capacity >> 3;
        int b$iv = (capacity & 7) << 3;
        data$iv[i$iv] = (data$iv[i$iv] & (~(255 << b$iv))) | (255 << b$iv);
        initializeGrowth();
    }

    private final void initializeGrowth() {
        this.growthLimit = ScatterMapKt.loadedCapacity(getCapacity()) - this._size;
    }

    public final long getOrPut(int key, Function0<Long> defaultValue) {
        Intrinsics.checkNotNullParameter(defaultValue, "defaultValue");
        int index = findKeyIndex(key);
        if (index >= 0) {
            return this.values[index];
        }
        long defValue = defaultValue.invoke().longValue();
        put(key, defValue);
        return defValue;
    }

    public final void set(int key, long value) {
        int index = findInsertIndex(key);
        if (index < 0) {
            index = ~index;
        }
        this.keys[index] = key;
        this.values[index] = value;
    }

    public final void put(int key, long value) {
        set(key, value);
    }

    public final long put(int key, long value, long j) {
        int index = findInsertIndex(key);
        long previous = j;
        if (index < 0) {
            index = ~index;
        } else {
            previous = this.values[index];
        }
        this.keys[index] = key;
        this.values[index] = value;
        return previous;
    }

    public final void putAll(IntLongMap from) {
        long[] v$iv;
        int[] k$iv;
        int $i$f$forEach;
        long[] v$iv2;
        int[] k$iv2;
        int $i$f$forEach2;
        Intrinsics.checkNotNullParameter(from, TypedValues.TransitionType.S_FROM);
        IntLongMap this_$iv = from;
        int $i$f$forEach3 = 0;
        int[] k$iv3 = this_$iv.keys;
        long[] v$iv3 = this_$iv.values;
        long[] m$iv$iv = this_$iv.metadata;
        int lastIndex$iv$iv = m$iv$iv.length - 2;
        int i$iv$iv = 0;
        if (0 <= lastIndex$iv$iv) {
            while (true) {
                long slot$iv$iv = m$iv$iv[i$iv$iv];
                long $this$maskEmptyOrDeleted$iv$iv$iv = slot$iv$iv;
                IntLongMap this_$iv2 = this_$iv;
                if ((((~$this$maskEmptyOrDeleted$iv$iv$iv) << 7) & $this$maskEmptyOrDeleted$iv$iv$iv & -9187201950435737472L) != -9187201950435737472L) {
                    int i = 8;
                    int bitCount$iv$iv = 8 - ((~(i$iv$iv - lastIndex$iv$iv)) >>> 31);
                    int j$iv$iv = 0;
                    while (j$iv$iv < bitCount$iv$iv) {
                        if ((255 & slot$iv$iv) < 128) {
                            int index$iv = (i$iv$iv << 3) + j$iv$iv;
                            $i$f$forEach2 = $i$f$forEach3;
                            k$iv2 = k$iv3;
                            v$iv2 = v$iv3;
                            set(k$iv3[index$iv], v$iv3[index$iv]);
                        } else {
                            $i$f$forEach2 = $i$f$forEach3;
                            k$iv2 = k$iv3;
                            v$iv2 = v$iv3;
                        }
                        i = 8;
                        slot$iv$iv >>= 8;
                        j$iv$iv++;
                        $i$f$forEach3 = $i$f$forEach2;
                        k$iv3 = k$iv2;
                        v$iv3 = v$iv2;
                    }
                    $i$f$forEach = $i$f$forEach3;
                    k$iv = k$iv3;
                    v$iv = v$iv3;
                    if (bitCount$iv$iv != i) {
                        return;
                    }
                } else {
                    $i$f$forEach = $i$f$forEach3;
                    k$iv = k$iv3;
                    v$iv = v$iv3;
                }
                if (i$iv$iv != lastIndex$iv$iv) {
                    i$iv$iv++;
                    IntLongMap intLongMap = from;
                    this_$iv = this_$iv2;
                    $i$f$forEach3 = $i$f$forEach;
                    k$iv3 = k$iv;
                    v$iv3 = v$iv;
                } else {
                    return;
                }
            }
        } else {
            int[] iArr = k$iv3;
            long[] jArr = v$iv3;
        }
    }

    public final void plusAssign(IntLongMap from) {
        Intrinsics.checkNotNullParameter(from, TypedValues.TransitionType.S_FROM);
        putAll(from);
    }

    public final void remove(int key) {
        int index = findKeyIndex(key);
        if (index >= 0) {
            removeValueAt(index);
        }
    }

    public final boolean remove(int key, long value) {
        int index = findKeyIndex(key);
        if (index < 0 || this.values[index] != value) {
            return false;
        }
        removeValueAt(index);
        return true;
    }

    public final void removeIf(Function2<? super Integer, ? super Long, Boolean> predicate) {
        int $i$f$removeIf;
        int $i$f$removeIf2;
        Function2<? super Integer, ? super Long, Boolean> function2 = predicate;
        Intrinsics.checkNotNullParameter(function2, "predicate");
        int $i$f$removeIf3 = 0;
        long[] m$iv = this.metadata;
        int lastIndex$iv = m$iv.length - 2;
        int i$iv = 0;
        if (0 <= lastIndex$iv) {
            while (true) {
                long slot$iv = m$iv[i$iv];
                long $this$maskEmptyOrDeleted$iv$iv = slot$iv;
                if ((((~$this$maskEmptyOrDeleted$iv$iv) << 7) & $this$maskEmptyOrDeleted$iv$iv & -9187201950435737472L) != -9187201950435737472L) {
                    int $i$f$removeIf4 = 8;
                    int bitCount$iv = 8 - ((~(i$iv - lastIndex$iv)) >>> 31);
                    int j$iv = 0;
                    while (j$iv < bitCount$iv) {
                        if ((255 & slot$iv) < 128) {
                            int index = (i$iv << 3) + j$iv;
                            $i$f$removeIf2 = $i$f$removeIf3;
                            if (function2.invoke(Integer.valueOf(this.keys[index]), Long.valueOf(this.values[index])).booleanValue()) {
                                removeValueAt(index);
                            }
                        } else {
                            $i$f$removeIf2 = $i$f$removeIf3;
                        }
                        slot$iv >>= 8;
                        j$iv++;
                        $i$f$removeIf4 = 8;
                        $i$f$removeIf3 = $i$f$removeIf2;
                    }
                    $i$f$removeIf = $i$f$removeIf3;
                    if (bitCount$iv != $i$f$removeIf4) {
                        return;
                    }
                } else {
                    $i$f$removeIf = $i$f$removeIf3;
                }
                if (i$iv != lastIndex$iv) {
                    i$iv++;
                    $i$f$removeIf3 = $i$f$removeIf;
                } else {
                    return;
                }
            }
        }
    }

    public final void minusAssign(int key) {
        remove(key);
    }

    public final void minusAssign(int[] keys) {
        Intrinsics.checkNotNullParameter(keys, "keys");
        for (int key : keys) {
            remove(key);
        }
    }

    public final void minusAssign(IntSet keys) {
        IntSet this_$iv;
        IntSet this_$iv2;
        Intrinsics.checkNotNullParameter(keys, "keys");
        int $i$f$minusAssign = 0;
        IntSet this_$iv3 = keys;
        int[] k$iv = this_$iv3.elements;
        long[] m$iv$iv = this_$iv3.metadata;
        int lastIndex$iv$iv = m$iv$iv.length - 2;
        int i$iv$iv = 0;
        if (0 <= lastIndex$iv$iv) {
            while (true) {
                long slot$iv$iv = m$iv$iv[i$iv$iv];
                long $this$maskEmptyOrDeleted$iv$iv$iv = slot$iv$iv;
                int $i$f$minusAssign2 = $i$f$minusAssign;
                if ((((~$this$maskEmptyOrDeleted$iv$iv$iv) << 7) & $this$maskEmptyOrDeleted$iv$iv$iv & -9187201950435737472L) != -9187201950435737472L) {
                    int i = 8;
                    int bitCount$iv$iv = 8 - ((~(i$iv$iv - lastIndex$iv$iv)) >>> 31);
                    int j$iv$iv = 0;
                    while (j$iv$iv < bitCount$iv$iv) {
                        if ((255 & slot$iv$iv) < 128) {
                            this_$iv2 = this_$iv3;
                            remove(k$iv[(i$iv$iv << 3) + j$iv$iv]);
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
                        return;
                    }
                } else {
                    this_$iv = this_$iv3;
                }
                if (i$iv$iv != lastIndex$iv$iv) {
                    i$iv$iv++;
                    IntSet intSet = keys;
                    $i$f$minusAssign = $i$f$minusAssign2;
                    this_$iv3 = this_$iv;
                } else {
                    return;
                }
            }
        } else {
            IntSet intSet2 = this_$iv3;
        }
    }

    public final void minusAssign(IntList keys) {
        Intrinsics.checkNotNullParameter(keys, "keys");
        IntList this_$iv = keys;
        int[] content$iv = this_$iv.content;
        int i = this_$iv._size;
        for (int i$iv = 0; i$iv < i; i$iv++) {
            remove(content$iv[i$iv]);
        }
    }

    public final void removeValueAt(int index) {
        this._size--;
        long[] m$iv = this.metadata;
        int i$iv$iv = index >> 3;
        int b$iv$iv = (index & 7) << 3;
        m$iv[i$iv$iv] = (m$iv[i$iv$iv] & (~(255 << b$iv$iv))) | (254 << b$iv$iv);
        int $i$f$writeRawMetadata = this._capacity;
        int cloneIndex$iv = ((index - 7) & $i$f$writeRawMetadata) + ($i$f$writeRawMetadata & 7);
        int i$iv$iv2 = cloneIndex$iv >> 3;
        int b$iv$iv2 = (cloneIndex$iv & 7) << 3;
        m$iv[i$iv$iv2] = ((~(255 << b$iv$iv2)) & m$iv[i$iv$iv2]) | (254 << b$iv$iv2);
    }

    public final void clear() {
        this._size = 0;
        if (this.metadata != ScatterMapKt.EmptyGroup) {
            ArraysKt.fill$default(this.metadata, -9187201950435737472L, 0, 0, 6, (Object) null);
            long[] data$iv = this.metadata;
            int offset$iv = this._capacity;
            int i$iv = offset$iv >> 3;
            int b$iv = (offset$iv & 7) << 3;
            data$iv[i$iv] = (data$iv[i$iv] & (~(255 << b$iv))) | (255 << b$iv);
        }
        initializeGrowth();
    }

    /* JADX WARNING: Code restructure failed: missing block: B:11:0x008d, code lost:
        r13 = r25;
        r11 = r7;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:12:0x00a1, code lost:
        if (((((~r11) << 6) & r11) & -9187201950435737472L) == 0) goto L_0x0135;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:13:0x00a3, code lost:
        r7 = r0.findFirstAvailableSlot(r2);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:14:0x00ac, code lost:
        if (r0.growthLimit != 0) goto L_0x00d1;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:16:0x00c1, code lost:
        if (((r0.metadata[r7 >> 3] >> ((r7 & 7) << 3)) & 255) != 254) goto L_0x00c6;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:17:0x00c3, code lost:
        r8 = 1;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:18:0x00c6, code lost:
        r8 = null;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:19:0x00c8, code lost:
        if (r8 != null) goto L_0x00d1;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:20:0x00ca, code lost:
        adjustStorage();
        r7 = r0.findFirstAvailableSlot(r2);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:21:0x00d1, code lost:
        r0._size++;
        r8 = r0.growthLimit;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:22:0x00ed, code lost:
        if (((r0.metadata[r7 >> 3] >> ((r7 & 7) << 3)) & 255) != 128) goto L_0x00f1;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:23:0x00ef, code lost:
        r19 = 1;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:24:0x00f1, code lost:
        r0.growthLimit = r8 - r19;
        r11 = (long) r3;
        r8 = r24;
        r15 = r8.metadata;
        r17 = r7 >> 3;
        r18 = (r7 & 7) << 3;
        r21 = r1;
        r15[r17] = (r15[r17] & (~(255 << r18))) | (r11 << r18);
        r0 = r8._capacity;
        r1 = ((r7 - 7) & r0) + (r0 & 7);
        r17 = r1 >> 3;
        r18 = (r1 & 7) << 3;
        r15[r17] = (r15[r17] & (~(255 << r18))) | (r11 << r18);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:25:0x0134, code lost:
        return ~r7;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private final int findInsertIndex(int r25) {
        /*
            r24 = this;
            r0 = r24
            r1 = 0
            int r2 = java.lang.Integer.hashCode(r25)
            r3 = -862048943(0xffffffffcc9e2d51, float:-8.2930312E7)
            int r2 = r2 * r3
            int r3 = r2 << 16
            r1 = r2 ^ r3
            r2 = 0
            int r2 = r1 >>> 7
            r3 = 0
            r3 = r1 & 127(0x7f, float:1.78E-43)
            int r4 = r0._capacity
            r5 = r2 & r4
            r6 = 0
        L_0x001d:
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
            r15 = r7
            r16 = r8
            long r7 = (long) r10
            long r7 = -r7
            r17 = 63
            long r7 = r7 >> r17
            long r7 = r7 & r13
            long r7 = r7 | r11
            r9 = r7
            r11 = 0
            long r12 = (long) r3
            r14 = 72340172838076673(0x101010101010101, double:7.748604185489348E-304)
            long r12 = r12 * r14
            long r12 = r12 ^ r9
            long r14 = r12 - r14
            r16 = r9
            long r9 = ~r12
            long r9 = r9 & r14
            r14 = -9187201950435737472(0x8080808080808080, double:-2.937446524422997E-306)
            long r9 = r9 & r14
        L_0x0054:
            r11 = r9
            r13 = 0
            r16 = 0
            int r18 = (r11 > r16 ? 1 : (r11 == r16 ? 0 : -1))
            r19 = 0
            r20 = 1
            if (r18 == 0) goto L_0x0063
            r11 = r20
            goto L_0x0065
        L_0x0063:
            r11 = r19
        L_0x0065:
            if (r11 == 0) goto L_0x008d
            r11 = r9
            r13 = 0
            r16 = r11
            r18 = 0
            int r19 = java.lang.Long.numberOfTrailingZeros(r16)
            int r16 = r19 >> 3
            int r16 = r5 + r16
            r11 = r16 & r4
            int[] r12 = r0.keys
            r12 = r12[r11]
            r13 = r25
            if (r12 != r13) goto L_0x0081
            return r11
        L_0x0081:
            r16 = r9
            r12 = 0
            r18 = 1
            long r18 = r16 - r18
            long r16 = r16 & r18
            r9 = r16
            goto L_0x0054
        L_0x008d:
            r13 = r25
            r11 = r7
            r18 = 0
            long r14 = ~r11
            r23 = 6
            long r14 = r14 << r23
            long r14 = r14 & r11
            r21 = -9187201950435737472(0x8080808080808080, double:-2.937446524422997E-306)
            long r11 = r14 & r21
            int r11 = (r11 > r16 ? 1 : (r11 == r16 ? 0 : -1))
            if (r11 == 0) goto L_0x0135
            int r7 = r0.findFirstAvailableSlot(r2)
            int r8 = r0.growthLimit
            r9 = 255(0xff, double:1.26E-321)
            if (r8 != 0) goto L_0x00d1
            long[] r8 = r0.metadata
            r11 = 0
            r12 = 0
            int r14 = r7 >> 3
            r14 = r8[r14]
            r16 = r7 & 7
            int r16 = r16 << 3
            long r14 = r14 >> r16
            long r14 = r14 & r9
            r16 = 254(0xfe, double:1.255E-321)
            int r12 = (r14 > r16 ? 1 : (r14 == r16 ? 0 : -1))
            if (r12 != 0) goto L_0x00c6
            r8 = r20
            goto L_0x00c8
        L_0x00c6:
            r8 = r19
        L_0x00c8:
            if (r8 != 0) goto L_0x00d1
            r24.adjustStorage()
            int r7 = r0.findFirstAvailableSlot(r2)
        L_0x00d1:
            int r8 = r0._size
            int r8 = r8 + 1
            r0._size = r8
            int r8 = r0.growthLimit
            long[] r11 = r0.metadata
            r12 = 0
            r14 = 0
            int r15 = r7 >> 3
            r15 = r11[r15]
            r17 = r7 & 7
            int r17 = r17 << 3
            long r15 = r15 >> r17
            long r14 = r15 & r9
            r16 = 128(0x80, double:6.32E-322)
            int r14 = (r14 > r16 ? 1 : (r14 == r16 ? 0 : -1))
            if (r14 != 0) goto L_0x00f1
            r19 = r20
        L_0x00f1:
            int r8 = r8 - r19
            r0.growthLimit = r8
            long r11 = (long) r3
            r8 = r24
            r14 = 0
            long[] r15 = r8.metadata
            r16 = 0
            int r17 = r7 >> 3
            r18 = r7 & 7
            int r18 = r18 << 3
            r19 = r15[r17]
            r21 = r1
            long r0 = r9 << r18
            long r0 = ~r0
            long r0 = r19 & r0
            long r19 = r11 << r18
            long r0 = r0 | r19
            r15[r17] = r0
            int r0 = r8._capacity
            int r1 = r7 + -7
            r1 = r1 & r0
            r16 = r0 & 7
            int r1 = r1 + r16
            r16 = 0
            int r17 = r1 >> 3
            r18 = r1 & 7
            int r18 = r18 << 3
            r19 = r15[r17]
            long r9 = r9 << r18
            long r9 = ~r9
            long r9 = r19 & r9
            long r19 = r11 << r18
            long r9 = r9 | r19
            r15[r17] = r9
            int r0 = ~r7
            return r0
        L_0x0135:
            r21 = r1
            int r6 = r6 + 8
            int r0 = r5 + r6
            r5 = r0 & r4
            r0 = r24
            goto L_0x001d
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.collection.MutableIntLongMap.findInsertIndex(int):int");
    }

    private final int findFirstAvailableSlot(int hash1) {
        int probeMask = this._capacity;
        int probeOffset = hash1 & probeMask;
        int probeIndex = 0;
        while (true) {
            long[] metadata$iv = this.metadata;
            int i$iv = probeOffset >> 3;
            int b$iv = (probeOffset & 7) << 3;
            long $this$maskEmptyOrDeleted$iv = (metadata$iv[i$iv] >>> b$iv) | ((metadata$iv[i$iv + 1] << (64 - b$iv)) & ((-((long) b$iv)) >> 63));
            long m = ((~$this$maskEmptyOrDeleted$iv) << 7) & $this$maskEmptyOrDeleted$iv & -9187201950435737472L;
            if (m != 0) {
                return ((Long.numberOfTrailingZeros(m) >> 3) + probeOffset) & probeMask;
            }
            probeIndex += 8;
            probeOffset = (probeOffset + probeIndex) & probeMask;
        }
    }

    public final int trim() {
        int previousCapacity = this._capacity;
        int newCapacity = ScatterMapKt.normalizeCapacity(ScatterMapKt.unloadedCapacity(this._size));
        if (newCapacity >= previousCapacity) {
            return 0;
        }
        resizeStorage(newCapacity);
        return previousCapacity - this._capacity;
    }

    private final void adjustStorage() {
        if (this._capacity <= 8 || Long.compare(ULong.m455constructorimpl(ULong.m455constructorimpl((long) this._size) * 32) ^ Long.MIN_VALUE, ULong.m455constructorimpl(ULong.m455constructorimpl((long) this._capacity) * 25) ^ Long.MIN_VALUE) > 0) {
            resizeStorage(ScatterMapKt.nextCapacity(this._capacity));
        } else {
            removeDeletedMarkers();
        }
    }

    private final void resizeStorage(int newCapacity) {
        long[] previousMetadata;
        MutableIntLongMap mutableIntLongMap = this;
        long[] previousMetadata2 = mutableIntLongMap.metadata;
        int[] previousKeys = mutableIntLongMap.keys;
        long[] previousValues = mutableIntLongMap.values;
        int previousCapacity = mutableIntLongMap._capacity;
        initializeStorage(newCapacity);
        int[] newKeys = mutableIntLongMap.keys;
        long[] newValues = mutableIntLongMap.values;
        int i = 0;
        while (i < previousCapacity) {
            if (((previousMetadata2[i >> 3] >> ((i & 7) << 3)) & 255) < 128) {
                int previousKey = previousKeys[i];
                int hash$iv = Integer.hashCode(previousKey) * ScatterMapKt.MurmurHashC1;
                int hash = hash$iv ^ (hash$iv << 16);
                int index = mutableIntLongMap.findFirstAvailableSlot(hash >>> 7);
                long value$iv = (long) (hash & WorkQueueKt.MASK);
                long[] m$iv = this.metadata;
                int i$iv$iv = index >> 3;
                int b$iv$iv = (index & 7) << 3;
                previousMetadata = previousMetadata2;
                m$iv[i$iv$iv] = (m$iv[i$iv$iv] & (~(255 << b$iv$iv))) | (value$iv << b$iv$iv);
                int c$iv = this._capacity;
                int cloneIndex$iv = ((index - 7) & c$iv) + (c$iv & 7);
                int i$iv$iv2 = cloneIndex$iv >> 3;
                int b$iv$iv2 = (cloneIndex$iv & 7) << 3;
                int i2 = c$iv;
                int i3 = cloneIndex$iv;
                m$iv[i$iv$iv2] = (m$iv[i$iv$iv2] & (~(255 << b$iv$iv2))) | (value$iv << b$iv$iv2);
                newKeys[index] = previousKey;
                newValues[index] = previousValues[i];
            } else {
                previousMetadata = previousMetadata2;
            }
            i++;
            mutableIntLongMap = this;
            previousMetadata2 = previousMetadata;
        }
    }

    private final void removeDeletedMarkers() {
        int capacity;
        long[] m;
        long[] m2 = this.metadata;
        int capacity2 = this._capacity;
        int removedDeletes = 0;
        int i = 0;
        while (i < capacity2) {
            if (((m2[i >> 3] >> ((i & 7) << 3)) & 255) == 254) {
                long[] m$iv = this.metadata;
                int i$iv$iv = i >> 3;
                int b$iv$iv = (i & 7) << 3;
                m = m2;
                capacity = capacity2;
                m$iv[i$iv$iv] = (m$iv[i$iv$iv] & (~(255 << b$iv$iv))) | (128 << b$iv$iv);
                int c$iv = this._capacity;
                int cloneIndex$iv = ((i - 7) & c$iv) + (c$iv & 7);
                int i$iv$iv2 = cloneIndex$iv >> 3;
                int b$iv$iv2 = (cloneIndex$iv & 7) << 3;
                m$iv[i$iv$iv2] = (m$iv[i$iv$iv2] & (~(255 << b$iv$iv2))) | (128 << b$iv$iv2);
                removedDeletes++;
            } else {
                m = m2;
                capacity = capacity2;
            }
            i++;
            m2 = m;
            capacity2 = capacity;
        }
        this.growthLimit += removedDeletes;
    }

    private final void writeMetadata(int index, long value) {
        long[] m = this.metadata;
        int i$iv = index >> 3;
        int b$iv = (index & 7) << 3;
        m[i$iv] = (m[i$iv] & (~(255 << b$iv))) | (value << b$iv);
        int $i$f$writeRawMetadata = this._capacity;
        int cloneIndex = ((index - 7) & $i$f$writeRawMetadata) + ($i$f$writeRawMetadata & 7);
        int i$iv2 = cloneIndex >> 3;
        int b$iv2 = (cloneIndex & 7) << 3;
        m[i$iv2] = ((~(255 << b$iv2)) & m[i$iv2]) | (value << b$iv2);
    }
}
