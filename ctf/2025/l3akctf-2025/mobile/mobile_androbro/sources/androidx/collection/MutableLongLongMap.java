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

@Metadata(d1 = {"\u0000J\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0005\n\u0002\u0010\t\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0016\n\u0002\b\u0007\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\b\u0018\u00002\u00020\u0001B\u000f\u0012\b\b\u0002\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004J\b\u0010\u0006\u001a\u00020\u0007H\u0002J\u0006\u0010\b\u001a\u00020\u0007J\u0010\u0010\t\u001a\u00020\u00032\u0006\u0010\n\u001a\u00020\u0003H\u0002J\u0010\u0010\u000b\u001a\u00020\u00032\u0006\u0010\f\u001a\u00020\rH\u0002J\"\u0010\u000e\u001a\u00020\r2\u0006\u0010\f\u001a\u00020\r2\f\u0010\u000f\u001a\b\u0012\u0004\u0012\u00020\r0\u0010H\bø\u0001\u0000J\b\u0010\u0011\u001a\u00020\u0007H\u0002J\u0010\u0010\u0012\u001a\u00020\u00072\u0006\u0010\u0013\u001a\u00020\u0003H\u0002J\u0010\u0010\u0014\u001a\u00020\u00072\u0006\u0010\u0002\u001a\u00020\u0003H\u0002J\u0011\u0010\u0015\u001a\u00020\u00072\u0006\u0010\u0016\u001a\u00020\u0017H\nJ\u0011\u0010\u0015\u001a\u00020\u00072\u0006\u0010\u0016\u001a\u00020\u0018H\nJ\u0011\u0010\u0015\u001a\u00020\u00072\u0006\u0010\f\u001a\u00020\rH\nJ\u0011\u0010\u0015\u001a\u00020\u00072\u0006\u0010\u0016\u001a\u00020\u0019H\nJ\u0011\u0010\u001a\u001a\u00020\u00072\u0006\u0010\u001b\u001a\u00020\u0001H\nJ\u0016\u0010\u001c\u001a\u00020\u00072\u0006\u0010\f\u001a\u00020\r2\u0006\u0010\u001d\u001a\u00020\rJ\u001e\u0010\u001c\u001a\u00020\r2\u0006\u0010\f\u001a\u00020\r2\u0006\u0010\u001d\u001a\u00020\r2\u0006\u0010\u001e\u001a\u00020\rJ\u000e\u0010\u001f\u001a\u00020\u00072\u0006\u0010\u001b\u001a\u00020\u0001J\u000e\u0010 \u001a\u00020\u00072\u0006\u0010\f\u001a\u00020\rJ\u0016\u0010 \u001a\u00020!2\u0006\u0010\f\u001a\u00020\r2\u0006\u0010\u001d\u001a\u00020\rJ\b\u0010\"\u001a\u00020\u0007H\u0002J&\u0010#\u001a\u00020\u00072\u0018\u0010$\u001a\u0014\u0012\u0004\u0012\u00020\r\u0012\u0004\u0012\u00020\r\u0012\u0004\u0012\u00020!0%H\bø\u0001\u0000J\u0010\u0010&\u001a\u00020\u00072\u0006\u0010'\u001a\u00020\u0003H\u0001J\u0010\u0010(\u001a\u00020\u00072\u0006\u0010)\u001a\u00020\u0003H\u0002J\u0019\u0010*\u001a\u00020\u00072\u0006\u0010\f\u001a\u00020\r2\u0006\u0010\u001d\u001a\u00020\rH\u0002J\u0006\u0010+\u001a\u00020\u0003J\u0019\u0010,\u001a\u00020\u00072\u0006\u0010'\u001a\u00020\u00032\u0006\u0010\u001d\u001a\u00020\rH\bR\u000e\u0010\u0005\u001a\u00020\u0003X\u000e¢\u0006\u0002\n\u0000\u0002\u0007\n\u0005\b20\u0001¨\u0006-"}, d2 = {"Landroidx/collection/MutableLongLongMap;", "Landroidx/collection/LongLongMap;", "initialCapacity", "", "(I)V", "growthLimit", "adjustStorage", "", "clear", "findFirstAvailableSlot", "hash1", "findInsertIndex", "key", "", "getOrPut", "defaultValue", "Lkotlin/Function0;", "initializeGrowth", "initializeMetadata", "capacity", "initializeStorage", "minusAssign", "keys", "Landroidx/collection/LongList;", "Landroidx/collection/LongSet;", "", "plusAssign", "from", "put", "value", "default", "putAll", "remove", "", "removeDeletedMarkers", "removeIf", "predicate", "Lkotlin/Function2;", "removeValueAt", "index", "resizeStorage", "newCapacity", "set", "trim", "writeMetadata", "collection"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* compiled from: LongLongMap.kt */
public final class MutableLongLongMap extends LongLongMap {
    private int growthLimit;

    public MutableLongLongMap() {
        this(0, 1, (DefaultConstructorMarker) null);
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public /* synthetic */ MutableLongLongMap(int i, int i2, DefaultConstructorMarker defaultConstructorMarker) {
        this((i2 & 1) != 0 ? 6 : i);
    }

    public MutableLongLongMap(int initialCapacity) {
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
        this.keys = new long[newCapacity];
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

    public final long getOrPut(long key, Function0<Long> defaultValue) {
        Intrinsics.checkNotNullParameter(defaultValue, "defaultValue");
        int index = findKeyIndex(key);
        if (index >= 0) {
            return this.values[index];
        }
        long defValue = defaultValue.invoke().longValue();
        put(key, defValue);
        return defValue;
    }

    public final void set(long key, long value) {
        int index = findInsertIndex(key);
        if (index < 0) {
            index = ~index;
        }
        this.keys[index] = key;
        this.values[index] = value;
    }

    public final void put(long key, long value) {
        set(key, value);
    }

    public final long put(long key, long value, long j) {
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

    public final void putAll(LongLongMap from) {
        long[] k$iv;
        int $i$f$forEachIndexed;
        LongLongMap this_$iv$iv;
        int $i$f$forEach;
        long[] k$iv2;
        int $i$f$forEachIndexed2;
        LongLongMap this_$iv$iv2;
        int $i$f$forEach2;
        Intrinsics.checkNotNullParameter(from, TypedValues.TransitionType.S_FROM);
        LongLongMap this_$iv = from;
        int $i$f$forEach3 = 0;
        long[] k$iv3 = this_$iv.keys;
        long[] v$iv = this_$iv.values;
        LongLongMap this_$iv$iv3 = this_$iv;
        int $i$f$forEachIndexed3 = 0;
        long[] m$iv$iv = this_$iv$iv3.metadata;
        int lastIndex$iv$iv = m$iv$iv.length - 2;
        int i$iv$iv = 0;
        if (0 <= lastIndex$iv$iv) {
            while (true) {
                long slot$iv$iv = m$iv$iv[i$iv$iv];
                long $this$maskEmptyOrDeleted$iv$iv$iv = slot$iv$iv;
                LongLongMap this_$iv2 = this_$iv;
                if ((((~$this$maskEmptyOrDeleted$iv$iv$iv) << 7) & $this$maskEmptyOrDeleted$iv$iv$iv & -9187201950435737472L) != -9187201950435737472L) {
                    int i = 8;
                    int bitCount$iv$iv = 8 - ((~(i$iv$iv - lastIndex$iv$iv)) >>> 31);
                    int j$iv$iv = 0;
                    while (j$iv$iv < bitCount$iv$iv) {
                        if ((255 & slot$iv$iv) < 128) {
                            int index$iv = (i$iv$iv << 3) + j$iv$iv;
                            $i$f$forEach2 = $i$f$forEach3;
                            this_$iv$iv2 = this_$iv$iv3;
                            $i$f$forEachIndexed2 = $i$f$forEachIndexed3;
                            k$iv2 = k$iv3;
                            set(k$iv3[index$iv], v$iv[index$iv]);
                        } else {
                            $i$f$forEach2 = $i$f$forEach3;
                            k$iv2 = k$iv3;
                            this_$iv$iv2 = this_$iv$iv3;
                            $i$f$forEachIndexed2 = $i$f$forEachIndexed3;
                        }
                        i = 8;
                        slot$iv$iv >>= 8;
                        j$iv$iv++;
                        $i$f$forEach3 = $i$f$forEach2;
                        this_$iv$iv3 = this_$iv$iv2;
                        $i$f$forEachIndexed3 = $i$f$forEachIndexed2;
                        k$iv3 = k$iv2;
                    }
                    $i$f$forEach = $i$f$forEach3;
                    k$iv = k$iv3;
                    this_$iv$iv = this_$iv$iv3;
                    $i$f$forEachIndexed = $i$f$forEachIndexed3;
                    if (bitCount$iv$iv != i) {
                        return;
                    }
                } else {
                    $i$f$forEach = $i$f$forEach3;
                    k$iv = k$iv3;
                    this_$iv$iv = this_$iv$iv3;
                    $i$f$forEachIndexed = $i$f$forEachIndexed3;
                }
                if (i$iv$iv != lastIndex$iv$iv) {
                    i$iv$iv++;
                    LongLongMap longLongMap = from;
                    this_$iv = this_$iv2;
                    $i$f$forEach3 = $i$f$forEach;
                    this_$iv$iv3 = this_$iv$iv;
                    $i$f$forEachIndexed3 = $i$f$forEachIndexed;
                    k$iv3 = k$iv;
                } else {
                    return;
                }
            }
        } else {
            long[] jArr = k$iv3;
            LongLongMap longLongMap2 = this_$iv$iv3;
        }
    }

    public final void plusAssign(LongLongMap from) {
        Intrinsics.checkNotNullParameter(from, TypedValues.TransitionType.S_FROM);
        putAll(from);
    }

    public final void remove(long key) {
        int index = findKeyIndex(key);
        if (index >= 0) {
            removeValueAt(index);
        }
    }

    public final boolean remove(long key, long value) {
        int index = findKeyIndex(key);
        if (index < 0 || this.values[index] != value) {
            return false;
        }
        removeValueAt(index);
        return true;
    }

    public final void removeIf(Function2<? super Long, ? super Long, Boolean> predicate) {
        int $i$f$removeIf;
        int $i$f$removeIf2;
        Function2<? super Long, ? super Long, Boolean> function2 = predicate;
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
                            if (function2.invoke(Long.valueOf(this.keys[index]), Long.valueOf(this.values[index])).booleanValue()) {
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

    public final void minusAssign(long key) {
        remove(key);
    }

    public final void minusAssign(long[] keys) {
        Intrinsics.checkNotNullParameter(keys, "keys");
        for (long key : keys) {
            remove(key);
        }
    }

    public final void minusAssign(LongSet keys) {
        int $i$f$forEach;
        LongSet this_$iv;
        int $i$f$forEach2;
        LongSet this_$iv2;
        Intrinsics.checkNotNullParameter(keys, "keys");
        int $i$f$minusAssign = 0;
        LongSet this_$iv3 = keys;
        int $i$f$forEach3 = 0;
        long[] k$iv = this_$iv3.elements;
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
                            $i$f$forEach2 = $i$f$forEach3;
                            remove(k$iv[(i$iv$iv << 3) + j$iv$iv]);
                        } else {
                            this_$iv2 = this_$iv3;
                            $i$f$forEach2 = $i$f$forEach3;
                        }
                        i = 8;
                        slot$iv$iv >>= 8;
                        j$iv$iv++;
                        this_$iv3 = this_$iv2;
                        $i$f$forEach3 = $i$f$forEach2;
                    }
                    this_$iv = this_$iv3;
                    $i$f$forEach = $i$f$forEach3;
                    if (bitCount$iv$iv != i) {
                        return;
                    }
                } else {
                    this_$iv = this_$iv3;
                    $i$f$forEach = $i$f$forEach3;
                }
                if (i$iv$iv != lastIndex$iv$iv) {
                    i$iv$iv++;
                    LongSet longSet = keys;
                    $i$f$minusAssign = $i$f$minusAssign2;
                    this_$iv3 = this_$iv;
                    $i$f$forEach3 = $i$f$forEach;
                } else {
                    return;
                }
            }
        } else {
            LongSet longSet2 = this_$iv3;
        }
    }

    public final void minusAssign(LongList keys) {
        Intrinsics.checkNotNullParameter(keys, "keys");
        LongList this_$iv = keys;
        long[] content$iv = this_$iv.content;
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

    /* JADX WARNING: Code restructure failed: missing block: B:11:0x008c, code lost:
        r11 = r7;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:12:0x009d, code lost:
        if (((((~r11) << 6) & r11) & -9187201950435737472L) == 0) goto L_0x012e;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:13:0x009f, code lost:
        r7 = r0.findFirstAvailableSlot(r2);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:14:0x00a8, code lost:
        if (r0.growthLimit != 0) goto L_0x00cd;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:16:0x00bd, code lost:
        if (((r0.metadata[r7 >> 3] >> ((r7 & 7) << 3)) & 255) != 254) goto L_0x00c2;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:17:0x00bf, code lost:
        r8 = 1;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:18:0x00c2, code lost:
        r8 = null;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:19:0x00c4, code lost:
        if (r8 != null) goto L_0x00cd;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:20:0x00c6, code lost:
        adjustStorage();
        r7 = r0.findFirstAvailableSlot(r2);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:21:0x00cd, code lost:
        r0._size++;
        r8 = r0.growthLimit;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:22:0x00e9, code lost:
        if (((r0.metadata[r7 >> 3] >> ((r7 & 7) << 3)) & 255) != 128) goto L_0x00ed;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:23:0x00eb, code lost:
        r19 = 1;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:24:0x00ed, code lost:
        r0.growthLimit = r8 - r19;
        r11 = (long) r3;
        r8 = r23;
        r14 = r8.metadata;
        r16 = r7 >> 3;
        r17 = (r7 & 7) << 3;
        r20 = r1;
        r14[r16] = (r14[r16] & (~(255 << r17))) | (r11 << r17);
        r0 = r8._capacity;
        r1 = ((r7 - 7) & r0) + (r0 & 7);
        r16 = r1 >> 3;
        r17 = (r1 & 7) << 3;
        r14[r16] = (r14[r16] & (~(255 << r17))) | (r11 << r17);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:25:0x012d, code lost:
        return ~r7;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private final int findInsertIndex(long r24) {
        /*
            r23 = this;
            r0 = r23
            r1 = 0
            int r2 = java.lang.Long.hashCode(r24)
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
            if (r11 == 0) goto L_0x008c
            r11 = r9
            r13 = 0
            r16 = r11
            r18 = 0
            int r19 = java.lang.Long.numberOfTrailingZeros(r16)
            int r16 = r19 >> 3
            int r16 = r5 + r16
            r11 = r16 & r4
            long[] r12 = r0.keys
            r16 = r12[r11]
            int r12 = (r16 > r24 ? 1 : (r16 == r24 ? 0 : -1))
            if (r12 != 0) goto L_0x0081
            return r11
        L_0x0081:
            r12 = r9
            r16 = 0
            r17 = 1
            long r17 = r12 - r17
            long r12 = r12 & r17
            r9 = r12
            goto L_0x0054
        L_0x008c:
            r11 = r7
            r13 = 0
            long r14 = ~r11
            r18 = 6
            long r14 = r14 << r18
            long r14 = r14 & r11
            r21 = -9187201950435737472(0x8080808080808080, double:-2.937446524422997E-306)
            long r11 = r14 & r21
            int r11 = (r11 > r16 ? 1 : (r11 == r16 ? 0 : -1))
            if (r11 == 0) goto L_0x012e
            int r7 = r0.findFirstAvailableSlot(r2)
            int r8 = r0.growthLimit
            r9 = 255(0xff, double:1.26E-321)
            if (r8 != 0) goto L_0x00cd
            long[] r8 = r0.metadata
            r11 = 0
            r12 = 0
            int r13 = r7 >> 3
            r13 = r8[r13]
            r15 = r7 & 7
            int r15 = r15 << 3
            long r13 = r13 >> r15
            long r12 = r13 & r9
            r14 = 254(0xfe, double:1.255E-321)
            int r12 = (r12 > r14 ? 1 : (r12 == r14 ? 0 : -1))
            if (r12 != 0) goto L_0x00c2
            r8 = r20
            goto L_0x00c4
        L_0x00c2:
            r8 = r19
        L_0x00c4:
            if (r8 != 0) goto L_0x00cd
            r23.adjustStorage()
            int r7 = r0.findFirstAvailableSlot(r2)
        L_0x00cd:
            int r8 = r0._size
            int r8 = r8 + 1
            r0._size = r8
            int r8 = r0.growthLimit
            long[] r11 = r0.metadata
            r12 = 0
            r13 = 0
            int r14 = r7 >> 3
            r14 = r11[r14]
            r16 = r7 & 7
            int r16 = r16 << 3
            long r14 = r14 >> r16
            long r13 = r14 & r9
            r15 = 128(0x80, double:6.32E-322)
            int r13 = (r13 > r15 ? 1 : (r13 == r15 ? 0 : -1))
            if (r13 != 0) goto L_0x00ed
            r19 = r20
        L_0x00ed:
            int r8 = r8 - r19
            r0.growthLimit = r8
            long r11 = (long) r3
            r8 = r23
            r13 = 0
            long[] r14 = r8.metadata
            r15 = 0
            int r16 = r7 >> 3
            r17 = r7 & 7
            int r17 = r17 << 3
            r18 = r14[r16]
            r20 = r1
            long r0 = r9 << r17
            long r0 = ~r0
            long r0 = r18 & r0
            long r18 = r11 << r17
            long r0 = r0 | r18
            r14[r16] = r0
            int r0 = r8._capacity
            int r1 = r7 + -7
            r1 = r1 & r0
            r15 = r0 & 7
            int r1 = r1 + r15
            r15 = 0
            int r16 = r1 >> 3
            r17 = r1 & 7
            int r17 = r17 << 3
            r18 = r14[r16]
            long r9 = r9 << r17
            long r9 = ~r9
            long r9 = r18 & r9
            long r18 = r11 << r17
            long r9 = r9 | r18
            r14[r16] = r9
            int r0 = ~r7
            return r0
        L_0x012e:
            r20 = r1
            int r6 = r6 + 8
            int r0 = r5 + r6
            r5 = r0 & r4
            r0 = r23
            goto L_0x001d
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.collection.MutableLongLongMap.findInsertIndex(long):int");
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
        MutableLongLongMap mutableLongLongMap = this;
        long[] previousMetadata2 = mutableLongLongMap.metadata;
        long[] previousKeys = mutableLongLongMap.keys;
        long[] previousValues = mutableLongLongMap.values;
        int previousCapacity = mutableLongLongMap._capacity;
        initializeStorage(newCapacity);
        long[] newKeys = mutableLongLongMap.keys;
        long[] newValues = mutableLongLongMap.values;
        int i = 0;
        while (i < previousCapacity) {
            if (((previousMetadata2[i >> 3] >> ((i & 7) << 3)) & 255) < 128) {
                long previousKey = previousKeys[i];
                int hash$iv = Long.hashCode(previousKey) * ScatterMapKt.MurmurHashC1;
                int hash = hash$iv ^ (hash$iv << 16);
                int index = mutableLongLongMap.findFirstAvailableSlot(hash >>> 7);
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
            mutableLongLongMap = this;
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
