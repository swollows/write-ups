package androidx.collection;

import kotlin.Metadata;
import kotlin.ULong;
import kotlin.collections.ArraysKt;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.scheduling.WorkQueueKt;

@Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0010\u0015\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0014\n\u0002\u0010\t\n\u0000\u0018\u00002\u00020\u0001B\u000f\u0012\b\b\u0002\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004J\u000e\u0010\u0006\u001a\u00020\u00072\u0006\u0010\b\u001a\u00020\u0003J\u000e\u0010\t\u001a\u00020\u00072\u0006\u0010\n\u001a\u00020\u0001J\u000e\u0010\t\u001a\u00020\u00072\u0006\u0010\n\u001a\u00020\u000bJ\b\u0010\f\u001a\u00020\rH\u0002J\u0006\u0010\u000e\u001a\u00020\rJ\u0010\u0010\u000f\u001a\u00020\u00032\u0006\u0010\b\u001a\u00020\u0003H\u0002J\u0010\u0010\u0010\u001a\u00020\u00032\u0006\u0010\u0011\u001a\u00020\u0003H\u0002J\b\u0010\u0012\u001a\u00020\rH\u0002J\u0010\u0010\u0013\u001a\u00020\r2\u0006\u0010\u0014\u001a\u00020\u0003H\u0002J\u0010\u0010\u0015\u001a\u00020\r2\u0006\u0010\u0002\u001a\u00020\u0003H\u0002J\u0011\u0010\u0016\u001a\u00020\r2\u0006\u0010\n\u001a\u00020\u0001H\u0002J\u0011\u0010\u0016\u001a\u00020\r2\u0006\u0010\b\u001a\u00020\u0003H\u0002J\u0011\u0010\u0016\u001a\u00020\r2\u0006\u0010\n\u001a\u00020\u000bH\u0002J\u0011\u0010\u0017\u001a\u00020\r2\u0006\u0010\n\u001a\u00020\u0001H\u0002J\u0011\u0010\u0017\u001a\u00020\r2\u0006\u0010\b\u001a\u00020\u0003H\u0002J\u0011\u0010\u0017\u001a\u00020\r2\u0006\u0010\n\u001a\u00020\u000bH\u0002J\u000e\u0010\u0018\u001a\u00020\u00072\u0006\u0010\b\u001a\u00020\u0003J\u000e\u0010\u0019\u001a\u00020\u00072\u0006\u0010\n\u001a\u00020\u0001J\u000e\u0010\u0019\u001a\u00020\u00072\u0006\u0010\n\u001a\u00020\u000bJ\b\u0010\u001a\u001a\u00020\rH\u0002J\u0010\u0010\u001b\u001a\u00020\r2\u0006\u0010\u001c\u001a\u00020\u0003H\u0002J\u0010\u0010\u001d\u001a\u00020\r2\u0006\u0010\u001e\u001a\u00020\u0003H\u0002J\b\u0010\u001f\u001a\u00020\u0003H\u0007J\u0019\u0010 \u001a\u00020\r2\u0006\u0010\u001c\u001a\u00020\u00032\u0006\u0010!\u001a\u00020\"H\bR\u000e\u0010\u0005\u001a\u00020\u0003X\u000e¢\u0006\u0002\n\u0000¨\u0006#"}, d2 = {"Landroidx/collection/MutableIntSet;", "Landroidx/collection/IntSet;", "initialCapacity", "", "(I)V", "growthLimit", "add", "", "element", "addAll", "elements", "", "adjustStorage", "", "clear", "findAbsoluteInsertIndex", "findFirstAvailableSlot", "hash1", "initializeGrowth", "initializeMetadata", "capacity", "initializeStorage", "minusAssign", "plusAssign", "remove", "removeAll", "removeDeletedMarkers", "removeElementAt", "index", "resizeStorage", "newCapacity", "trim", "writeMetadata", "value", "", "collection"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* compiled from: IntSet.kt */
public final class MutableIntSet extends IntSet {
    private int growthLimit;

    public MutableIntSet() {
        this(0, 1, (DefaultConstructorMarker) null);
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public /* synthetic */ MutableIntSet(int i, int i2, DefaultConstructorMarker defaultConstructorMarker) {
        this((i2 & 1) != 0 ? 6 : i);
    }

    public MutableIntSet(int initialCapacity) {
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
        this.elements = new int[newCapacity];
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

    public final boolean add(int element) {
        int oldSize = this._size;
        this.elements[findAbsoluteInsertIndex(element)] = element;
        return this._size != oldSize;
    }

    public final void plusAssign(int element) {
        this.elements[findAbsoluteInsertIndex(element)] = element;
    }

    public final boolean addAll(int[] elements) {
        Intrinsics.checkNotNullParameter(elements, "elements");
        int oldSize = this._size;
        plusAssign(elements);
        return oldSize != this._size;
    }

    public final void plusAssign(int[] elements) {
        Intrinsics.checkNotNullParameter(elements, "elements");
        for (int element$iv : elements) {
            plusAssign(element$iv);
        }
    }

    public final boolean addAll(IntSet elements) {
        Intrinsics.checkNotNullParameter(elements, "elements");
        int oldSize = this._size;
        plusAssign(elements);
        return oldSize != this._size;
    }

    public final void plusAssign(IntSet elements) {
        IntSet this_$iv;
        IntSet this_$iv2;
        Intrinsics.checkNotNullParameter(elements, "elements");
        IntSet this_$iv3 = elements;
        int[] k$iv = this_$iv3.elements;
        long[] m$iv$iv = this_$iv3.metadata;
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
                            this_$iv2 = this_$iv3;
                            plusAssign(k$iv[(i$iv$iv << 3) + j$iv$iv]);
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
                    this_$iv3 = this_$iv;
                } else {
                    return;
                }
            }
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:10:0x008f, code lost:
        r12 = r26;
        r10 = r2;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:11:0x00a2, code lost:
        if (((((~r10) << 6) & r10) & -9187201950435737472L) == 0) goto L_0x00b3;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:12:0x00a4, code lost:
        r10 = -1;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final boolean remove(int r26) {
        /*
            r25 = this;
            r0 = r25
            r1 = r0
            androidx.collection.IntSet r1 = (androidx.collection.IntSet) r1
            r2 = 0
            r3 = 0
            int r4 = java.lang.Integer.hashCode(r26)
            r5 = -862048943(0xffffffffcc9e2d51, float:-8.2930312E7)
            int r4 = r4 * r5
            int r5 = r4 << 16
            r3 = r4 ^ r5
            r4 = 0
            r4 = r3 & 127(0x7f, float:1.78E-43)
            int r5 = r1._capacity
            r6 = 0
            int r6 = r3 >>> 7
            r6 = r6 & r5
            r7 = 0
        L_0x001f:
            long[] r8 = r1.metadata
            r9 = 0
            int r10 = r6 >> 3
            r11 = r6 & 7
            int r11 = r11 << 3
            r12 = r8[r10]
            long r12 = r12 >>> r11
            int r14 = r10 + 1
            r14 = r8[r14]
            int r16 = 64 - r11
            long r14 = r14 << r16
            r16 = r2
            r17 = r3
            long r2 = (long) r11
            long r2 = -r2
            r18 = 63
            long r2 = r2 >> r18
            long r2 = r2 & r14
            long r2 = r2 | r12
            r8 = r2
            r10 = 0
            long r11 = (long) r4
            r13 = 72340172838076673(0x101010101010101, double:7.748604185489348E-304)
            long r11 = r11 * r13
            long r11 = r11 ^ r8
            long r13 = r11 - r13
            r18 = r8
            long r8 = ~r11
            long r8 = r8 & r13
            r13 = -9187201950435737472(0x8080808080808080, double:-2.937446524422997E-306)
            long r8 = r8 & r13
        L_0x0058:
            r10 = r8
            r12 = 0
            r18 = 0
            int r15 = (r10 > r18 ? 1 : (r10 == r18 ? 0 : -1))
            r20 = 0
            r21 = 1
            if (r15 == 0) goto L_0x0067
            r10 = r21
            goto L_0x0069
        L_0x0067:
            r10 = r20
        L_0x0069:
            if (r10 == 0) goto L_0x008f
            r10 = r8
            r12 = 0
            r18 = r10
            r15 = 0
            int r22 = java.lang.Long.numberOfTrailingZeros(r18)
            int r15 = r22 >> 3
            int r15 = r15 + r6
            r10 = r15 & r5
            int[] r11 = r1.elements
            r11 = r11[r10]
            r12 = r26
            if (r11 != r12) goto L_0x0083
            goto L_0x00a6
        L_0x0083:
            r18 = r8
            r11 = 0
            r20 = 1
            long r20 = r18 - r20
            long r18 = r18 & r20
            r8 = r18
            goto L_0x0058
        L_0x008f:
            r12 = r26
            r10 = r2
            r15 = 0
            long r13 = ~r10
            r24 = 6
            long r13 = r13 << r24
            long r13 = r13 & r10
            r22 = -9187201950435737472(0x8080808080808080, double:-2.937446524422997E-306)
            long r10 = r13 & r22
            int r10 = (r10 > r18 ? 1 : (r10 == r18 ? 0 : -1))
            if (r10 == 0) goto L_0x00b3
            r10 = -1
        L_0x00a6:
            r1 = r10
            if (r1 < 0) goto L_0x00ab
            r20 = r21
        L_0x00ab:
            r2 = r20
            if (r2 == 0) goto L_0x00b2
            r0.removeElementAt(r1)
        L_0x00b2:
            return r2
        L_0x00b3:
            int r7 = r7 + 8
            int r10 = r6 + r7
            r6 = r10 & r5
            r2 = r16
            r3 = r17
            goto L_0x001f
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.collection.MutableIntSet.remove(int):boolean");
    }

    /* JADX WARNING: Code restructure failed: missing block: B:10:0x0089, code lost:
        r12 = r24;
        r10 = r2;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:11:0x009c, code lost:
        if (((((~r10) << 6) & r10) & -9187201950435737472L) == 0) goto L_0x00a7;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:12:0x009e, code lost:
        r10 = -1;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void minusAssign(int r24) {
        /*
            r23 = this;
            r0 = r23
            r1 = r0
            androidx.collection.IntSet r1 = (androidx.collection.IntSet) r1
            r2 = 0
            r3 = 0
            int r4 = java.lang.Integer.hashCode(r24)
            r5 = -862048943(0xffffffffcc9e2d51, float:-8.2930312E7)
            int r4 = r4 * r5
            int r5 = r4 << 16
            r3 = r4 ^ r5
            r4 = 0
            r4 = r3 & 127(0x7f, float:1.78E-43)
            int r5 = r1._capacity
            r6 = 0
            int r6 = r3 >>> 7
            r6 = r6 & r5
            r7 = 0
        L_0x001f:
            long[] r8 = r1.metadata
            r9 = 0
            int r10 = r6 >> 3
            r11 = r6 & 7
            int r11 = r11 << 3
            r12 = r8[r10]
            long r12 = r12 >>> r11
            int r14 = r10 + 1
            r14 = r8[r14]
            int r16 = 64 - r11
            long r14 = r14 << r16
            r16 = r2
            r17 = r3
            long r2 = (long) r11
            long r2 = -r2
            r18 = 63
            long r2 = r2 >> r18
            long r2 = r2 & r14
            long r2 = r2 | r12
            r8 = r2
            r10 = 0
            long r11 = (long) r4
            r13 = 72340172838076673(0x101010101010101, double:7.748604185489348E-304)
            long r11 = r11 * r13
            long r11 = r11 ^ r8
            long r13 = r11 - r13
            r18 = r8
            long r8 = ~r11
            long r8 = r8 & r13
            r13 = -9187201950435737472(0x8080808080808080, double:-2.937446524422997E-306)
            long r8 = r8 & r13
        L_0x0058:
            r10 = r8
            r12 = 0
            r18 = 0
            int r15 = (r10 > r18 ? 1 : (r10 == r18 ? 0 : -1))
            if (r15 == 0) goto L_0x0062
            r15 = 1
            goto L_0x0063
        L_0x0062:
            r15 = 0
        L_0x0063:
            if (r15 == 0) goto L_0x0089
            r10 = r8
            r12 = 0
            r18 = r10
            r15 = 0
            int r20 = java.lang.Long.numberOfTrailingZeros(r18)
            int r15 = r20 >> 3
            int r15 = r15 + r6
            r10 = r15 & r5
            int[] r11 = r1.elements
            r11 = r11[r10]
            r12 = r24
            if (r11 != r12) goto L_0x007d
            goto L_0x00a0
        L_0x007d:
            r18 = r8
            r11 = 0
            r20 = 1
            long r20 = r18 - r20
            long r18 = r18 & r20
            r8 = r18
            goto L_0x0058
        L_0x0089:
            r12 = r24
            r10 = r2
            r15 = 0
            long r13 = ~r10
            r22 = 6
            long r13 = r13 << r22
            long r13 = r13 & r10
            r20 = -9187201950435737472(0x8080808080808080, double:-2.937446524422997E-306)
            long r10 = r13 & r20
            int r10 = (r10 > r18 ? 1 : (r10 == r18 ? 0 : -1))
            if (r10 == 0) goto L_0x00a7
            r10 = -1
        L_0x00a0:
            r1 = r10
            if (r1 < 0) goto L_0x00a6
            r0.removeElementAt(r1)
        L_0x00a6:
            return
        L_0x00a7:
            int r7 = r7 + 8
            int r10 = r6 + r7
            r6 = r10 & r5
            r2 = r16
            r3 = r17
            goto L_0x001f
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.collection.MutableIntSet.minusAssign(int):void");
    }

    public final boolean removeAll(int[] elements) {
        Intrinsics.checkNotNullParameter(elements, "elements");
        int oldSize = this._size;
        minusAssign(elements);
        return oldSize != this._size;
    }

    public final void minusAssign(int[] elements) {
        Intrinsics.checkNotNullParameter(elements, "elements");
        for (int element$iv : elements) {
            minusAssign(element$iv);
        }
    }

    public final boolean removeAll(IntSet elements) {
        Intrinsics.checkNotNullParameter(elements, "elements");
        int oldSize = this._size;
        minusAssign(elements);
        return oldSize != this._size;
    }

    public final void minusAssign(IntSet elements) {
        IntSet this_$iv;
        IntSet this_$iv2;
        Intrinsics.checkNotNullParameter(elements, "elements");
        IntSet this_$iv3 = elements;
        int[] k$iv = this_$iv3.elements;
        long[] m$iv$iv = this_$iv3.metadata;
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
                            this_$iv2 = this_$iv3;
                            minusAssign(k$iv[(i$iv$iv << 3) + j$iv$iv]);
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
                    this_$iv3 = this_$iv;
                } else {
                    return;
                }
            }
        }
    }

    private final void removeElementAt(int index) {
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
        if (((((~r11) << 6) & r11) & -9187201950435737472L) == 0) goto L_0x0134;
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
    /* JADX WARNING: Code restructure failed: missing block: B:25:0x0133, code lost:
        return r7;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private final int findAbsoluteInsertIndex(int r25) {
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
            int[] r12 = r0.elements
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
            if (r11 == 0) goto L_0x0134
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
            return r7
        L_0x0134:
            r21 = r1
            int r6 = r6 + 8
            int r0 = r5 + r6
            r5 = r0 & r4
            r0 = r24
            goto L_0x001d
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.collection.MutableIntSet.findAbsoluteInsertIndex(int):int");
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
        MutableIntSet mutableIntSet = this;
        long[] previousMetadata2 = mutableIntSet.metadata;
        int[] previousElements = mutableIntSet.elements;
        int previousCapacity = mutableIntSet._capacity;
        initializeStorage(newCapacity);
        int[] newElements = mutableIntSet.elements;
        int i = 0;
        while (i < previousCapacity) {
            if (((previousMetadata2[i >> 3] >> ((i & 7) << 3)) & 255) < 128) {
                int previousElement = previousElements[i];
                int hash$iv = Integer.hashCode(previousElement) * ScatterMapKt.MurmurHashC1;
                int hash = hash$iv ^ (hash$iv << 16);
                int index = mutableIntSet.findFirstAvailableSlot(hash >>> 7);
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
                m$iv[i$iv$iv2] = (m$iv[i$iv$iv2] & (~(255 << b$iv$iv2))) | (value$iv << b$iv$iv2);
                newElements[index] = previousElement;
            } else {
                previousMetadata = previousMetadata2;
            }
            i++;
            mutableIntSet = this;
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
