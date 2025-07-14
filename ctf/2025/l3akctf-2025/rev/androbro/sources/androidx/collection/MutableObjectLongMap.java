package androidx.collection;

import androidx.constraintlayout.core.motion.utils.TypedValues;
import kotlin.Metadata;
import kotlin.ULong;
import kotlin.collections.ArraysKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.sequences.Sequence;
import kotlinx.coroutines.scheduling.WorkQueueKt;

@Metadata(d1 = {"\u0000P\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0007\n\u0002\u0010\t\n\u0000\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\u0010\u0011\n\u0000\n\u0002\u0010\u001c\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\b\u0018\u0000*\u0004\b\u0000\u0010\u00012\b\u0012\u0004\u0012\u0002H\u00010\u0002B\u000f\u0012\b\b\u0002\u0010\u0003\u001a\u00020\u0004¢\u0006\u0002\u0010\u0005J\b\u0010\u0007\u001a\u00020\bH\u0002J\u0006\u0010\t\u001a\u00020\bJ\u0010\u0010\n\u001a\u00020\u00042\u0006\u0010\u000b\u001a\u00020\u0004H\u0002J\u0015\u0010\f\u001a\u00020\u00042\u0006\u0010\r\u001a\u00028\u0000H\u0002¢\u0006\u0002\u0010\u000eJ'\u0010\u000f\u001a\u00020\u00102\u0006\u0010\r\u001a\u00028\u00002\f\u0010\u0011\u001a\b\u0012\u0004\u0012\u00020\u00100\u0012H\bø\u0001\u0000¢\u0006\u0002\u0010\u0013J\b\u0010\u0014\u001a\u00020\bH\u0002J\u0010\u0010\u0015\u001a\u00020\b2\u0006\u0010\u0016\u001a\u00020\u0004H\u0002J\u0010\u0010\u0017\u001a\u00020\b2\u0006\u0010\u0003\u001a\u00020\u0004H\u0002J\u0016\u0010\u0018\u001a\u00020\b2\u0006\u0010\r\u001a\u00028\u0000H\n¢\u0006\u0002\u0010\u0019J\u0017\u0010\u0018\u001a\u00020\b2\f\u0010\u001a\u001a\b\u0012\u0004\u0012\u00028\u00000\u001bH\nJ\u001e\u0010\u0018\u001a\u00020\b2\u000e\u0010\u001a\u001a\n\u0012\u0006\b\u0001\u0012\u00028\u00000\u001cH\n¢\u0006\u0002\u0010\u001dJ\u0017\u0010\u0018\u001a\u00020\b2\f\u0010\u001a\u001a\b\u0012\u0004\u0012\u00028\u00000\u001eH\nJ\u0017\u0010\u0018\u001a\u00020\b2\f\u0010\u001a\u001a\b\u0012\u0004\u0012\u00028\u00000\u001fH\nJ\u0017\u0010 \u001a\u00020\b2\f\u0010!\u001a\b\u0012\u0004\u0012\u00028\u00000\u0002H\nJ\u001b\u0010\"\u001a\u00020\b2\u0006\u0010\r\u001a\u00028\u00002\u0006\u0010#\u001a\u00020\u0010¢\u0006\u0002\u0010$J#\u0010\"\u001a\u00020\u00102\u0006\u0010\r\u001a\u00028\u00002\u0006\u0010#\u001a\u00020\u00102\u0006\u0010%\u001a\u00020\u0010¢\u0006\u0002\u0010&J\u0014\u0010'\u001a\u00020\b2\f\u0010!\u001a\b\u0012\u0004\u0012\u00028\u00000\u0002J\u0013\u0010(\u001a\u00020\b2\u0006\u0010\r\u001a\u00028\u0000¢\u0006\u0002\u0010\u0019J\u001b\u0010(\u001a\u00020)2\u0006\u0010\r\u001a\u00028\u00002\u0006\u0010#\u001a\u00020\u0010¢\u0006\u0002\u0010*J\b\u0010+\u001a\u00020\bH\u0002J&\u0010,\u001a\u00020\b2\u0018\u0010-\u001a\u0014\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00020\u0010\u0012\u0004\u0012\u00020)0.H\bø\u0001\u0000J\u0010\u0010/\u001a\u00020\b2\u0006\u00100\u001a\u00020\u0004H\u0001J\u0010\u00101\u001a\u00020\b2\u0006\u00102\u001a\u00020\u0004H\u0002J\u001e\u00103\u001a\u00020\b2\u0006\u0010\r\u001a\u00028\u00002\u0006\u0010#\u001a\u00020\u0010H\u0002¢\u0006\u0002\u0010$J\u0006\u00104\u001a\u00020\u0004J\u0019\u00105\u001a\u00020\b2\u0006\u00100\u001a\u00020\u00042\u0006\u0010#\u001a\u00020\u0010H\bR\u000e\u0010\u0006\u001a\u00020\u0004X\u000e¢\u0006\u0002\n\u0000\u0002\u0007\n\u0005\b20\u0001¨\u00066"}, d2 = {"Landroidx/collection/MutableObjectLongMap;", "K", "Landroidx/collection/ObjectLongMap;", "initialCapacity", "", "(I)V", "growthLimit", "adjustStorage", "", "clear", "findFirstAvailableSlot", "hash1", "findIndex", "key", "(Ljava/lang/Object;)I", "getOrPut", "", "defaultValue", "Lkotlin/Function0;", "(Ljava/lang/Object;Lkotlin/jvm/functions/Function0;)J", "initializeGrowth", "initializeMetadata", "capacity", "initializeStorage", "minusAssign", "(Ljava/lang/Object;)V", "keys", "Landroidx/collection/ScatterSet;", "", "([Ljava/lang/Object;)V", "", "Lkotlin/sequences/Sequence;", "plusAssign", "from", "put", "value", "(Ljava/lang/Object;J)V", "default", "(Ljava/lang/Object;JJ)J", "putAll", "remove", "", "(Ljava/lang/Object;J)Z", "removeDeletedMarkers", "removeIf", "predicate", "Lkotlin/Function2;", "removeValueAt", "index", "resizeStorage", "newCapacity", "set", "trim", "writeMetadata", "collection"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* compiled from: ObjectLongMap.kt */
public final class MutableObjectLongMap<K> extends ObjectLongMap<K> {
    private int growthLimit;

    public MutableObjectLongMap() {
        this(0, 1, (DefaultConstructorMarker) null);
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public /* synthetic */ MutableObjectLongMap(int i, int i2, DefaultConstructorMarker defaultConstructorMarker) {
        this((i2 & 1) != 0 ? 6 : i);
    }

    public MutableObjectLongMap(int initialCapacity) {
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
        this.keys = new Object[newCapacity];
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

    public final long getOrPut(K key, Function0<Long> defaultValue) {
        Intrinsics.checkNotNullParameter(defaultValue, "defaultValue");
        int index = findKeyIndex(key);
        if (index >= 0) {
            return this.values[index];
        }
        long value = defaultValue.invoke().longValue();
        set(key, value);
        return value;
    }

    public final void set(K key, long value) {
        int index = findIndex(key);
        if (index < 0) {
            index = ~index;
        }
        this.keys[index] = key;
        this.values[index] = value;
    }

    public final void put(K key, long value) {
        set(key, value);
    }

    public final long put(K key, long value, long j) {
        int index = findIndex(key);
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

    public final void putAll(ObjectLongMap<K> from) {
        long[] v$iv;
        Object[] k$iv;
        int $i$f$forEach;
        long[] v$iv2;
        Object[] k$iv2;
        int $i$f$forEach2;
        Intrinsics.checkNotNullParameter(from, TypedValues.TransitionType.S_FROM);
        ObjectLongMap this_$iv = from;
        int $i$f$forEach3 = 0;
        Object[] k$iv3 = this_$iv.keys;
        long[] v$iv3 = this_$iv.values;
        long[] m$iv$iv = this_$iv.metadata;
        int lastIndex$iv$iv = m$iv$iv.length - 2;
        int i$iv$iv = 0;
        if (0 <= lastIndex$iv$iv) {
            while (true) {
                long slot$iv$iv = m$iv$iv[i$iv$iv];
                long $this$maskEmptyOrDeleted$iv$iv$iv = slot$iv$iv;
                ObjectLongMap this_$iv2 = this_$iv;
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
                    ObjectLongMap<K> objectLongMap = from;
                    this_$iv = this_$iv2;
                    $i$f$forEach3 = $i$f$forEach;
                    k$iv3 = k$iv;
                    v$iv3 = v$iv;
                } else {
                    return;
                }
            }
        } else {
            Object[] objArr = k$iv3;
            long[] jArr = v$iv3;
        }
    }

    public final void plusAssign(ObjectLongMap<K> from) {
        Intrinsics.checkNotNullParameter(from, TypedValues.TransitionType.S_FROM);
        putAll(from);
    }

    public final void remove(K key) {
        int index = findKeyIndex(key);
        if (index >= 0) {
            removeValueAt(index);
        }
    }

    public final boolean remove(K key, long value) {
        int index = findKeyIndex(key);
        if (index < 0 || this.values[index] != value) {
            return false;
        }
        removeValueAt(index);
        return true;
    }

    public final void removeIf(Function2<? super K, ? super Long, Boolean> predicate) {
        int $i$f$removeIf;
        int $i$f$removeIf2;
        Function2<? super K, ? super Long, Boolean> function2 = predicate;
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
                            if (function2.invoke(this.keys[index], Long.valueOf(this.values[index])).booleanValue()) {
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

    public final void minusAssign(K key) {
        remove(key);
    }

    public final void minusAssign(K[] keys) {
        Intrinsics.checkNotNullParameter(keys, "keys");
        for (Object key : keys) {
            remove(key);
        }
    }

    public final void minusAssign(Iterable<? extends K> keys) {
        Intrinsics.checkNotNullParameter(keys, "keys");
        for (Object key : keys) {
            remove(key);
        }
    }

    public final void minusAssign(Sequence<? extends K> keys) {
        Intrinsics.checkNotNullParameter(keys, "keys");
        for (Object key : keys) {
            remove(key);
        }
    }

    public final void minusAssign(ScatterSet<K> keys) {
        ScatterSet this_$iv;
        ScatterSet this_$iv2;
        Intrinsics.checkNotNullParameter(keys, "keys");
        int $i$f$minusAssign = 0;
        ScatterSet this_$iv3 = keys;
        Object[] k$iv = this_$iv3.elements;
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
                    ScatterSet<K> scatterSet = keys;
                    $i$f$minusAssign = $i$f$minusAssign2;
                    this_$iv3 = this_$iv;
                } else {
                    return;
                }
            }
        } else {
            ScatterSet scatterSet2 = this_$iv3;
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
        this.keys[index] = null;
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
        ArraysKt.fill((T[]) this.keys, null, 0, this._capacity);
        initializeGrowth();
    }

    /* JADX WARNING: Code restructure failed: missing block: B:15:0x0091, code lost:
        r11 = r3;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:16:0x00a2, code lost:
        if (((((~r11) << 6) & r11) & -9187201950435737472L) == 0) goto L_0x0139;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:17:0x00a4, code lost:
        r11 = r18;
        r3 = r0.findFirstAvailableSlot(r11);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:18:0x00af, code lost:
        if (r0.growthLimit != 0) goto L_0x00d4;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:20:0x00c5, code lost:
        if (((r0.metadata[r3 >> 3] >> ((r3 & 7) << 3)) & 255) != 254) goto L_0x00ca;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:21:0x00c7, code lost:
        r4 = 1;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:22:0x00ca, code lost:
        r4 = null;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:23:0x00cb, code lost:
        if (r4 != null) goto L_0x00d4;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:24:0x00cd, code lost:
        adjustStorage();
        r3 = r0.findFirstAvailableSlot(r11);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:25:0x00d4, code lost:
        r0._size++;
        r4 = r0.growthLimit;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:26:0x00f0, code lost:
        if (((r0.metadata[r3 >> 3] >> ((r3 & 7) << 3)) & 255) != 128) goto L_0x00f5;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:27:0x00f2, code lost:
        r17 = 1;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:28:0x00f5, code lost:
        r17 = 0;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:29:0x00f7, code lost:
        r0.growthLimit = r4 - r17;
        r12 = (long) r5;
        r4 = r24;
        r15 = r4.metadata;
        r17 = r3 >> 3;
        r18 = (r3 & 7) << 3;
        r15[r17] = (r15[r17] & (~(255 << r18))) | (r12 << r18);
        r0 = r4._capacity;
        r1 = ((r3 - 7) & r0) + (r0 & 7);
        r17 = r1 >> 3;
        r18 = (r1 & 7) << 3;
        r15[r17] = (r15[r17] & (~(255 << r18))) | (r12 << r18);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:30:0x0138, code lost:
        return ~r3;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private final int findIndex(K r25) {
        /*
            r24 = this;
            r0 = r24
            r1 = r25
            r2 = 0
            if (r1 == 0) goto L_0x000c
            int r4 = r25.hashCode()
            goto L_0x000d
        L_0x000c:
            r4 = 0
        L_0x000d:
            r5 = -862048943(0xffffffffcc9e2d51, float:-8.2930312E7)
            int r4 = r4 * r5
            int r5 = r4 << 16
            r2 = r4 ^ r5
            r4 = 0
            int r4 = r2 >>> 7
            r5 = 0
            r5 = r2 & 127(0x7f, float:1.78E-43)
            int r6 = r0._capacity
            r7 = r4 & r6
            r8 = 0
        L_0x0023:
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
            r18 = r4
            long r3 = (long) r12
            long r3 = -r3
            r19 = 63
            long r3 = r3 >> r19
            long r3 = r3 & r15
            long r3 = r3 | r13
            r9 = r3
            r11 = 0
            long r12 = (long) r5
            r14 = 72340172838076673(0x101010101010101, double:7.748604185489348E-304)
            long r12 = r12 * r14
            long r12 = r12 ^ r9
            long r14 = r12 - r14
            r19 = r9
            long r9 = ~r12
            long r9 = r9 & r14
            r14 = -9187201950435737472(0x8080808080808080, double:-2.937446524422997E-306)
            long r9 = r9 & r14
        L_0x005a:
            r11 = r9
            r13 = 0
            r19 = 0
            int r16 = (r11 > r19 ? 1 : (r11 == r19 ? 0 : -1))
            r21 = 1
            if (r16 == 0) goto L_0x0067
            r11 = r21
            goto L_0x0068
        L_0x0067:
            r11 = 0
        L_0x0068:
            if (r11 == 0) goto L_0x0091
            r11 = r9
            r13 = 0
            r19 = r11
            r16 = 0
            int r21 = java.lang.Long.numberOfTrailingZeros(r19)
            int r16 = r21 >> 3
            int r16 = r7 + r16
            r11 = r16 & r6
            java.lang.Object[] r12 = r0.keys
            r12 = r12[r11]
            boolean r12 = kotlin.jvm.internal.Intrinsics.areEqual((java.lang.Object) r12, (java.lang.Object) r1)
            if (r12 == 0) goto L_0x0086
            return r11
        L_0x0086:
            r12 = r9
            r16 = 0
            r19 = 1
            long r19 = r12 - r19
            long r12 = r12 & r19
            r9 = r12
            goto L_0x005a
        L_0x0091:
            r11 = r3
            r13 = 0
            long r14 = ~r11
            r16 = 6
            long r14 = r14 << r16
            long r14 = r14 & r11
            r22 = -9187201950435737472(0x8080808080808080, double:-2.937446524422997E-306)
            long r11 = r14 & r22
            int r11 = (r11 > r19 ? 1 : (r11 == r19 ? 0 : -1))
            if (r11 == 0) goto L_0x0139
            r11 = r18
            int r3 = r0.findFirstAvailableSlot(r11)
            int r4 = r0.growthLimit
            r9 = 255(0xff, double:1.26E-321)
            if (r4 != 0) goto L_0x00d4
            long[] r4 = r0.metadata
            r12 = 0
            r13 = 0
            int r14 = r3 >> 3
            r14 = r4[r14]
            r16 = r3 & 7
            int r16 = r16 << 3
            long r14 = r14 >> r16
            long r13 = r14 & r9
            r15 = 254(0xfe, double:1.255E-321)
            int r13 = (r13 > r15 ? 1 : (r13 == r15 ? 0 : -1))
            if (r13 != 0) goto L_0x00ca
            r4 = r21
            goto L_0x00cb
        L_0x00ca:
            r4 = 0
        L_0x00cb:
            if (r4 != 0) goto L_0x00d4
            r24.adjustStorage()
            int r3 = r0.findFirstAvailableSlot(r11)
        L_0x00d4:
            int r4 = r0._size
            int r4 = r4 + 1
            r0._size = r4
            int r4 = r0.growthLimit
            long[] r12 = r0.metadata
            r13 = 0
            r14 = 0
            int r15 = r3 >> 3
            r15 = r12[r15]
            r18 = r3 & 7
            int r18 = r18 << 3
            long r15 = r15 >> r18
            long r14 = r15 & r9
            r18 = 128(0x80, double:6.32E-322)
            int r14 = (r14 > r18 ? 1 : (r14 == r18 ? 0 : -1))
            if (r14 != 0) goto L_0x00f5
            r17 = r21
            goto L_0x00f7
        L_0x00f5:
            r17 = 0
        L_0x00f7:
            int r4 = r4 - r17
            r0.growthLimit = r4
            long r12 = (long) r5
            r4 = r24
            r14 = 0
            long[] r15 = r4.metadata
            r16 = 0
            int r17 = r3 >> 3
            r18 = r3 & 7
            int r18 = r18 << 3
            r19 = r15[r17]
            long r0 = r9 << r18
            long r0 = ~r0
            long r0 = r19 & r0
            long r19 = r12 << r18
            long r0 = r0 | r19
            r15[r17] = r0
            int r0 = r4._capacity
            int r1 = r3 + -7
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
            long r19 = r12 << r18
            long r9 = r9 | r19
            r15[r17] = r9
            int r0 = ~r3
            return r0
        L_0x0139:
            r11 = r18
            int r8 = r8 + 8
            int r0 = r7 + r8
            r7 = r0 & r6
            r0 = r24
            r1 = r25
            r4 = r11
            goto L_0x0023
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.collection.MutableObjectLongMap.findIndex(java.lang.Object):int");
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
        MutableObjectLongMap mutableObjectLongMap = this;
        long[] previousMetadata2 = mutableObjectLongMap.metadata;
        Object[] previousKeys = mutableObjectLongMap.keys;
        long[] previousValues = mutableObjectLongMap.values;
        int previousCapacity = mutableObjectLongMap._capacity;
        initializeStorage(newCapacity);
        Object[] newKeys = mutableObjectLongMap.keys;
        long[] newValues = mutableObjectLongMap.values;
        int i = 0;
        while (i < previousCapacity) {
            int i2 = 0;
            if (((previousMetadata2[i >> 3] >> ((i & 7) << 3)) & 255) < 128) {
                Object previousKey = previousKeys[i];
                if (previousKey != null) {
                    i2 = previousKey.hashCode();
                }
                int hash$iv = i2 * ScatterMapKt.MurmurHashC1;
                int hash = hash$iv ^ (hash$iv << 16);
                int index = mutableObjectLongMap.findFirstAvailableSlot(hash >>> 7);
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
                int i3 = c$iv;
                int i4 = cloneIndex$iv;
                m$iv[i$iv$iv2] = (m$iv[i$iv$iv2] & (~(255 << b$iv$iv2))) | (value$iv << b$iv$iv2);
                newKeys[index] = previousKey;
                newValues[index] = previousValues[i];
            } else {
                previousMetadata = previousMetadata2;
            }
            i++;
            mutableObjectLongMap = this;
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
