package androidx.collection;

import java.util.NoSuchElementException;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

@Metadata(d1 = {"\u0000N\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0005\n\u0002\u0010\u0016\n\u0002\b\u0006\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\t\n\u0002\u0018\u0002\n\u0002\b\u000b\n\u0002\u0010\u0002\n\u0002\b\u0007\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\r\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0000\b6\u0018\u00002\u00020\u0001B\u0007\b\u0004¢\u0006\u0002\u0010\u0002J:\u0010\u0010\u001a\u00020\u00112!\u0010\u0012\u001a\u001d\u0012\u0013\u0012\u00110\u0014¢\u0006\f\b\u0015\u0012\b\b\u0016\u0012\u0004\b\b(\u0017\u0012\u0004\u0012\u00020\u00110\u0013H\bø\u0001\u0000\u0002\b\n\u0006\b\u0001\u0012\u0002\u0010\u0001J\u0006\u0010\u0018\u001a\u00020\u0011J:\u0010\u0018\u001a\u00020\u00112!\u0010\u0012\u001a\u001d\u0012\u0013\u0012\u00110\u0014¢\u0006\f\b\u0015\u0012\b\b\u0016\u0012\u0004\b\b(\u0017\u0012\u0004\u0012\u00020\u00110\u0013H\bø\u0001\u0000\u0002\b\n\u0006\b\u0001\u0012\u0002\u0010\u0001J\u0011\u0010\u0019\u001a\u00020\u00112\u0006\u0010\u0017\u001a\u00020\u0014H\u0002J\b\u0010\u001a\u001a\u00020\u0004H\u0007J:\u0010\u001a\u001a\u00020\u00042!\u0010\u0012\u001a\u001d\u0012\u0013\u0012\u00110\u0014¢\u0006\f\b\u0015\u0012\b\b\u0016\u0012\u0004\b\b(\u0017\u0012\u0004\u0012\u00020\u00110\u0013H\bø\u0001\u0000\u0002\b\n\u0006\b\u0001\u0012\u0002\u0010\u0001J\u0013\u0010\u001b\u001a\u00020\u00112\b\u0010\u001c\u001a\u0004\u0018\u00010\u0001H\u0002J\u0016\u0010\u001d\u001a\u00020\u00042\u0006\u0010\u0017\u001a\u00020\u0014H\b¢\u0006\u0002\b\u001eJ\t\u0010\u001f\u001a\u00020\u0014H\bJ:\u0010\u001f\u001a\u00020\u00142!\u0010\u0012\u001a\u001d\u0012\u0013\u0012\u00110\u0014¢\u0006\f\b\u0015\u0012\b\b\u0016\u0012\u0004\b\b(\u0017\u0012\u0004\u0012\u00020\u00110\u0013H\bø\u0001\u0000\u0002\b\n\u0006\b\u0001\u0012\u0002\u0010\u0001J:\u0010 \u001a\u00020!2!\u0010\"\u001a\u001d\u0012\u0013\u0012\u00110\u0014¢\u0006\f\b\u0015\u0012\b\b\u0016\u0012\u0004\b\b(\u0017\u0012\u0004\u0012\u00020!0\u0013H\bø\u0001\u0000\u0002\b\n\u0006\b\u0001\u0012\u0002\u0010\u0001J:\u0010#\u001a\u00020!2!\u0010\"\u001a\u001d\u0012\u0013\u0012\u00110\u0004¢\u0006\f\b\u0015\u0012\b\b\u0016\u0012\u0004\b\b($\u0012\u0004\u0012\u00020!0\u0013H\bø\u0001\u0000\u0002\b\n\u0006\b\u0001\u0012\u0002\u0010\u0001J\b\u0010%\u001a\u00020\u0004H\u0016J\u0006\u0010&\u001a\u00020\u0011J\u0006\u0010'\u001a\u00020\u0011J:\u0010(\u001a\u00020)2\b\b\u0002\u0010*\u001a\u00020+2\b\b\u0002\u0010,\u001a\u00020+2\b\b\u0002\u0010-\u001a\u00020+2\b\b\u0002\u0010.\u001a\u00020\u00042\b\b\u0002\u0010/\u001a\u00020+H\u0007JT\u0010(\u001a\u00020)2\b\b\u0002\u0010*\u001a\u00020+2\b\b\u0002\u0010,\u001a\u00020+2\b\b\u0002\u0010-\u001a\u00020+2\b\b\u0002\u0010.\u001a\u00020\u00042\b\b\u0002\u0010/\u001a\u00020+2\u0014\b\u0004\u00100\u001a\u000e\u0012\u0004\u0012\u00020\u0014\u0012\u0004\u0012\u00020+0\u0013H\bø\u0001\u0000J\u0006\u00101\u001a\u00020\u0011J\b\u00102\u001a\u00020)H\u0016R\u0012\u0010\u0003\u001a\u00020\u00048\u0000@\u0000X\u000e¢\u0006\u0002\n\u0000R\u0012\u0010\u0005\u001a\u00020\u00048\u0000@\u0000X\u000e¢\u0006\u0002\n\u0000R\u0011\u0010\u0006\u001a\u00020\u00048G¢\u0006\u0006\u001a\u0004\b\u0007\u0010\bR\u0018\u0010\t\u001a\u00020\n8\u0000@\u0000X\u000e¢\u0006\b\n\u0000\u0012\u0004\b\u000b\u0010\u0002R\u0018\u0010\f\u001a\u00020\n8\u0000@\u0000X\u000e¢\u0006\b\n\u0000\u0012\u0004\b\r\u0010\u0002R\u0011\u0010\u000e\u001a\u00020\u00048G¢\u0006\u0006\u001a\u0004\b\u000f\u0010\b\u0001\u00013\u0002\u0007\n\u0005\b20\u0001¨\u00064"}, d2 = {"Landroidx/collection/LongSet;", "", "()V", "_capacity", "", "_size", "capacity", "getCapacity", "()I", "elements", "", "getElements$annotations", "metadata", "getMetadata$annotations", "size", "getSize", "all", "", "predicate", "Lkotlin/Function1;", "", "Lkotlin/ParameterName;", "name", "element", "any", "contains", "count", "equals", "other", "findElementIndex", "findElementIndex$collection", "first", "forEach", "", "block", "forEachIndex", "index", "hashCode", "isEmpty", "isNotEmpty", "joinToString", "", "separator", "", "prefix", "postfix", "limit", "truncated", "transform", "none", "toString", "Landroidx/collection/MutableLongSet;", "collection"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* compiled from: LongSet.kt */
public abstract class LongSet {
    public int _capacity;
    public int _size;
    public long[] elements;
    public long[] metadata;

    public /* synthetic */ LongSet(DefaultConstructorMarker defaultConstructorMarker) {
        this();
    }

    public static /* synthetic */ void getElements$annotations() {
    }

    public static /* synthetic */ void getMetadata$annotations() {
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

    private LongSet() {
        this.metadata = ScatterMapKt.EmptyGroup;
        this.elements = LongSetKt.getEmptyLongArray();
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

    public final long first() {
        long[] k$iv = this.elements;
        long[] m$iv$iv = this.metadata;
        int lastIndex$iv$iv = m$iv$iv.length - 2;
        int i$iv$iv = 0;
        if (0 <= lastIndex$iv$iv) {
            while (true) {
                long slot$iv$iv = m$iv$iv[i$iv$iv];
                long $this$maskEmptyOrDeleted$iv$iv$iv = slot$iv$iv;
                if ((((~$this$maskEmptyOrDeleted$iv$iv$iv) << 7) & $this$maskEmptyOrDeleted$iv$iv$iv & -9187201950435737472L) != -9187201950435737472L) {
                    int bitCount$iv$iv = 8 - ((~(i$iv$iv - lastIndex$iv$iv)) >>> 31);
                    for (int j$iv$iv = 0; j$iv$iv < bitCount$iv$iv; j$iv$iv++) {
                        if ((255 & slot$iv$iv) < 128) {
                            return k$iv[(i$iv$iv << 3) + j$iv$iv];
                        }
                        slot$iv$iv >>= 8;
                    }
                    if (bitCount$iv$iv != 8) {
                        break;
                    }
                }
                if (i$iv$iv == lastIndex$iv$iv) {
                    break;
                }
                i$iv$iv++;
            }
        }
        throw new NoSuchElementException("The LongSet is empty");
    }

    public final long first(Function1<? super Long, Boolean> predicate) {
        Function1<? super Long, Boolean> function1 = predicate;
        Intrinsics.checkNotNullParameter(function1, "predicate");
        int $i$f$first = 0;
        LongSet this_$iv = this;
        long[] k$iv = this_$iv.elements;
        long[] m$iv$iv = this_$iv.metadata;
        int lastIndex$iv$iv = m$iv$iv.length - 2;
        int i$iv$iv = 0;
        if (0 <= lastIndex$iv$iv) {
            while (true) {
                long slot$iv$iv = m$iv$iv[i$iv$iv];
                long $this$maskEmptyOrDeleted$iv$iv$iv = slot$iv$iv;
                int $i$f$first2 = $i$f$first;
                LongSet this_$iv2 = this_$iv;
                if ((((~$this$maskEmptyOrDeleted$iv$iv$iv) << 7) & $this$maskEmptyOrDeleted$iv$iv$iv & -9187201950435737472L) != -9187201950435737472L) {
                    int i = 8;
                    int bitCount$iv$iv = 8 - ((~(i$iv$iv - lastIndex$iv$iv)) >>> 31);
                    for (int j$iv$iv = 0; j$iv$iv < bitCount$iv$iv; j$iv$iv++) {
                        if ((255 & slot$iv$iv) < 128) {
                            long it = k$iv[(i$iv$iv << 3) + j$iv$iv];
                            if (function1.invoke(Long.valueOf(it)).booleanValue()) {
                                return it;
                            }
                        }
                        i = 8;
                        slot$iv$iv >>= 8;
                    }
                    if (bitCount$iv$iv != i) {
                        break;
                    }
                }
                if (i$iv$iv == lastIndex$iv$iv) {
                    break;
                }
                i$iv$iv++;
                $i$f$first = $i$f$first2;
                this_$iv = this_$iv2;
            }
        } else {
            LongSet longSet = this_$iv;
        }
        throw new NoSuchElementException("Could not find a match");
    }

    public final void forEachIndex(Function1<? super Integer, Unit> block) {
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

    public final void forEach(Function1<? super Long, Unit> block) {
        Function1<? super Long, Unit> function1 = block;
        Intrinsics.checkNotNullParameter(function1, "block");
        long[] k = this.elements;
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
                            function1.invoke(Long.valueOf(k[(i$iv << 3) + j$iv]));
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

    public final boolean all(Function1<? super Long, Boolean> predicate) {
        Function1<? super Long, Boolean> function1 = predicate;
        Intrinsics.checkNotNullParameter(function1, "predicate");
        long[] k$iv = this.elements;
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
                int i = 8;
                int bitCount$iv$iv = 8 - ((~(i$iv$iv - lastIndex$iv$iv)) >>> 31);
                for (int j$iv$iv = 0; j$iv$iv < bitCount$iv$iv; j$iv$iv++) {
                    if (((slot$iv$iv2 & 255) < 128) && !function1.invoke(Long.valueOf(k$iv[(i$iv$iv << 3) + j$iv$iv])).booleanValue()) {
                        return false;
                    }
                    i = 8;
                    slot$iv$iv2 >>= 8;
                }
                if (bitCount$iv$iv != i) {
                    return true;
                }
            }
            if (i$iv$iv == lastIndex$iv$iv) {
                return true;
            }
            i$iv$iv++;
        }
    }

    public final boolean any(Function1<? super Long, Boolean> predicate) {
        Function1<? super Long, Boolean> function1 = predicate;
        Intrinsics.checkNotNullParameter(function1, "predicate");
        long[] k$iv = this.elements;
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
                int i = 8;
                int bitCount$iv$iv = 8 - ((~(i$iv$iv - lastIndex$iv$iv)) >>> 31);
                for (int j$iv$iv = 0; j$iv$iv < bitCount$iv$iv; j$iv$iv++) {
                    if (((slot$iv$iv2 & 255) < 128) && function1.invoke(Long.valueOf(k$iv[(i$iv$iv << 3) + j$iv$iv])).booleanValue()) {
                        return true;
                    }
                    i = 8;
                    slot$iv$iv2 >>= 8;
                }
                if (bitCount$iv$iv != i) {
                    return false;
                }
            }
            if (i$iv$iv == lastIndex$iv$iv) {
                return false;
            }
            i$iv$iv++;
        }
    }

    public final int count() {
        return this._size;
    }

    public final int count(Function1<? super Long, Boolean> predicate) {
        Function1<? super Long, Boolean> function1 = predicate;
        Intrinsics.checkNotNullParameter(function1, "predicate");
        int $i$f$count = 0;
        int count = 0;
        long[] k$iv = this.elements;
        long[] m$iv$iv = this.metadata;
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
                    for (int j$iv$iv = 0; j$iv$iv < bitCount$iv$iv; j$iv$iv++) {
                        if (((255 & slot$iv$iv) < 128) && function1.invoke(Long.valueOf(k$iv[(i$iv$iv << 3) + j$iv$iv])).booleanValue()) {
                            count2++;
                        }
                        i = 8;
                        slot$iv$iv >>= 8;
                    }
                    if (bitCount$iv$iv != i) {
                        return count2;
                    }
                    count = count2;
                } else {
                    count = count2;
                }
                if (i$iv$iv == lastIndex$iv$iv) {
                    break;
                }
                i$iv$iv++;
                $i$f$count = $i$f$count2;
            }
        }
        return count;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:10:0x0088, code lost:
        r9 = r1;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:11:0x0097, code lost:
        if (((((~r9) << 6) & r9) & -9187201950435737472L) == 0) goto L_0x00a0;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:12:0x0099, code lost:
        r9 = -1;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final boolean contains(long r24) {
        /*
            r23 = this;
            r0 = r23
            r1 = 0
            r2 = 0
            int r3 = java.lang.Long.hashCode(r24)
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
            if (r9 == 0) goto L_0x0088
            r9 = r7
            r11 = 0
            r17 = r9
            r14 = 0
            int r21 = java.lang.Long.numberOfTrailingZeros(r17)
            int r14 = r21 >> 3
            int r14 = r14 + r5
            r9 = r14 & r4
            long[] r10 = r0.elements
            r17 = r10[r9]
            int r10 = (r17 > r24 ? 1 : (r17 == r24 ? 0 : -1))
            if (r10 != 0) goto L_0x007e
            goto L_0x009b
        L_0x007e:
            r10 = r7
            r14 = 0
            r17 = 1
            long r17 = r10 - r17
            long r10 = r10 & r17
            r7 = r10
            goto L_0x0053
        L_0x0088:
            r9 = r1
            r11 = 0
            long r12 = ~r9
            r14 = 6
            long r12 = r12 << r14
            long r12 = r12 & r9
            r21 = -9187201950435737472(0x8080808080808080, double:-2.937446524422997E-306)
            long r9 = r12 & r21
            int r9 = (r9 > r17 ? 1 : (r9 == r17 ? 0 : -1))
            if (r9 == 0) goto L_0x00a0
            r9 = -1
        L_0x009b:
            if (r9 < 0) goto L_0x009f
            r19 = r20
        L_0x009f:
            return r19
        L_0x00a0:
            int r6 = r6 + 8
            int r9 = r5 + r6
            r5 = r9 & r4
            r1 = r15
            r2 = r16
            goto L_0x001c
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.collection.LongSet.contains(long):boolean");
    }

    public static /* synthetic */ String joinToString$default(LongSet longSet, CharSequence charSequence, CharSequence charSequence2, CharSequence charSequence3, int i, CharSequence charSequence4, int i2, Object obj) {
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
            return longSet.joinToString(charSequence, str, str2, i3, charSequence5);
        }
        throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: joinToString");
    }

    public final String joinToString(CharSequence separator, CharSequence prefix, CharSequence postfix, int limit, CharSequence truncated) {
        long[] k$iv;
        long[] k$iv2;
        CharSequence charSequence = separator;
        CharSequence charSequence2 = prefix;
        CharSequence charSequence3 = postfix;
        CharSequence charSequence4 = truncated;
        Intrinsics.checkNotNullParameter(charSequence, "separator");
        Intrinsics.checkNotNullParameter(charSequence2, "prefix");
        Intrinsics.checkNotNullParameter(charSequence3, "postfix");
        Intrinsics.checkNotNullParameter(charSequence4, "truncated");
        StringBuilder sb = new StringBuilder();
        StringBuilder $this$joinToString_u24lambda_u2413 = sb;
        int i = 0;
        $this$joinToString_u24lambda_u2413.append(charSequence2);
        int index = 0;
        LongSet this_$iv = this;
        int $i$f$forEach = 0;
        long[] k$iv3 = this_$iv.elements;
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
                LongSet this_$iv2 = this_$iv;
                int $i$f$forEach2 = $i$f$forEach;
                if ((((~$this$maskEmptyOrDeleted$iv$iv$iv) << 7) & $this$maskEmptyOrDeleted$iv$iv$iv & -9187201950435737472L) != -9187201950435737472L) {
                    int i3 = 8;
                    int bitCount$iv$iv = 8 - ((~(i$iv$iv - lastIndex$iv$iv)) >>> 31);
                    int j$iv$iv = 0;
                    int index3 = index2;
                    while (j$iv$iv < bitCount$iv$iv) {
                        if ((slot$iv$iv & 255) < 128) {
                            long element = k$iv3[(i$iv$iv << 3) + j$iv$iv];
                            k$iv2 = k$iv3;
                            int index4 = index3;
                            if (index4 == limit) {
                                $this$joinToString_u24lambda_u2413.append(charSequence4);
                                break loop0;
                            }
                            if (index4 != 0) {
                                $this$joinToString_u24lambda_u2413.append(charSequence);
                            }
                            $this$joinToString_u24lambda_u2413.append(element);
                            index3 = index4 + 1;
                        } else {
                            int i4 = limit;
                            k$iv2 = k$iv3;
                            int i5 = index3;
                        }
                        i3 = 8;
                        slot$iv$iv >>= 8;
                        j$iv$iv++;
                        CharSequence charSequence5 = prefix;
                        k$iv3 = k$iv2;
                    }
                    int i6 = limit;
                    k$iv = k$iv3;
                    int index5 = index3;
                    if (bitCount$iv$iv != i3) {
                        int i7 = index5;
                        break;
                    }
                    index = index5;
                } else {
                    int i8 = limit;
                    k$iv = k$iv3;
                    index = index2;
                }
                if (i$iv$iv == lastIndex$iv$iv) {
                    break;
                }
                i$iv$iv++;
                CharSequence charSequence6 = prefix;
                this_$iv = this_$iv2;
                $i$f$forEach = $i$f$forEach2;
                i = i2;
                k$iv3 = k$iv;
            }
            $this$joinToString_u24lambda_u2413.append(charSequence3);
            String sb2 = sb.toString();
            Intrinsics.checkNotNullExpressionValue(sb2, "StringBuilder().apply(builderAction).toString()");
            return sb2;
        }
        int i9 = limit;
        LongSet longSet = this_$iv;
        long[] jArr = k$iv3;
        int i10 = index;
        $this$joinToString_u24lambda_u2413.append(charSequence3);
        String sb22 = sb.toString();
        Intrinsics.checkNotNullExpressionValue(sb22, "StringBuilder().apply(builderAction).toString()");
        return sb22;
    }

    public static /* synthetic */ String joinToString$default(LongSet $this, CharSequence separator, CharSequence prefix, CharSequence postfix, int limit, CharSequence truncated, Function1 transform, int i, Object obj) {
        CharSequence separator2;
        int limit2;
        CharSequence truncated2;
        Function1 function1 = transform;
        if (obj == null) {
            if ((i & 1) == 0) {
                separator2 = separator;
            }
            String prefix2 = (i & 2) != 0 ? "" : prefix;
            String postfix2 = (i & 4) != 0 ? "" : postfix;
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
            Intrinsics.checkNotNullParameter(postfix2, "postfix");
            Intrinsics.checkNotNullParameter(truncated2, "truncated");
            Intrinsics.checkNotNullParameter(function1, "transform");
            StringBuilder sb = new StringBuilder();
            StringBuilder $this$joinToString_u24lambda_u2415 = sb;
            $this$joinToString_u24lambda_u2415.append(prefix2);
            int bitCount$iv$iv = 0;
            LongSet this_$iv = $this;
            long[] k$iv = this_$iv.elements;
            LongSet this_$iv$iv = this_$iv;
            int $i$f$forEachIndex = 0;
            CharSequence charSequence = prefix2;
            long[] m$iv$iv = this_$iv$iv.metadata;
            int lastIndex$iv$iv = m$iv$iv.length - 2;
            int i$iv$iv = 0;
            if (0 <= lastIndex$iv$iv) {
                loop0:
                while (true) {
                    long slot$iv$iv = m$iv$iv[i$iv$iv];
                    int index = bitCount$iv$iv;
                    LongSet this_$iv2 = this_$iv;
                    long $this$maskEmptyOrDeleted$iv$iv$iv = slot$iv$iv;
                    LongSet this_$iv$iv2 = this_$iv$iv;
                    int $i$f$forEachIndex2 = $i$f$forEachIndex;
                    if ((((~$this$maskEmptyOrDeleted$iv$iv$iv) << 7) & $this$maskEmptyOrDeleted$iv$iv$iv & -9187201950435737472L) != -9187201950435737472L) {
                        int i2 = 8;
                        int bitCount$iv$iv2 = 8 - ((~(i$iv$iv - lastIndex$iv$iv)) >>> 31);
                        int index2 = index;
                        for (int j$iv$iv = 0; j$iv$iv < bitCount$iv$iv2; j$iv$iv++) {
                            if ((slot$iv$iv & 255) < 128) {
                                long element = k$iv[(i$iv$iv << 3) + j$iv$iv];
                                if (index2 == limit2) {
                                    $this$joinToString_u24lambda_u2415.append(truncated2);
                                    break loop0;
                                }
                                if (index2 != 0) {
                                    $this$joinToString_u24lambda_u2415.append(separator2);
                                }
                                $this$joinToString_u24lambda_u2415.append((CharSequence) function1.invoke(Long.valueOf(element)));
                                index2++;
                            }
                            i2 = 8;
                            slot$iv$iv >>= 8;
                        }
                        if (bitCount$iv$iv2 != i2) {
                            break;
                        }
                        bitCount$iv$iv = index2;
                    } else {
                        bitCount$iv$iv = index;
                    }
                    if (i$iv$iv == lastIndex$iv$iv) {
                        break;
                    }
                    i$iv$iv++;
                    this_$iv$iv = this_$iv$iv2;
                    $i$f$forEachIndex = $i$f$forEachIndex2;
                    this_$iv = this_$iv2;
                }
            } else {
                LongSet longSet = this_$iv$iv;
            }
            int i3 = bitCount$iv$iv;
            $this$joinToString_u24lambda_u2415.append(postfix2);
            String sb2 = sb.toString();
            Intrinsics.checkNotNullExpressionValue(sb2, "StringBuilder().apply(builderAction).toString()");
            return sb2;
        }
        throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: joinToString");
    }

    public final String joinToString(CharSequence separator, CharSequence prefix, CharSequence postfix, int limit, CharSequence truncated, Function1<? super Long, ? extends CharSequence> transform) {
        int index;
        CharSequence charSequence = separator;
        CharSequence charSequence2 = prefix;
        CharSequence charSequence3 = postfix;
        CharSequence charSequence4 = truncated;
        Function1<? super Long, ? extends CharSequence> function1 = transform;
        Intrinsics.checkNotNullParameter(charSequence, "separator");
        Intrinsics.checkNotNullParameter(charSequence2, "prefix");
        Intrinsics.checkNotNullParameter(charSequence3, "postfix");
        Intrinsics.checkNotNullParameter(charSequence4, "truncated");
        Intrinsics.checkNotNullParameter(function1, "transform");
        StringBuilder sb = new StringBuilder();
        StringBuilder $this$joinToString_u24lambda_u2415 = sb;
        int i = 0;
        $this$joinToString_u24lambda_u2415.append(charSequence2);
        int index2 = 0;
        LongSet this_$iv = this;
        int $i$f$forEach = 0;
        long[] k$iv = this_$iv.elements;
        long[] m$iv$iv = this_$iv.metadata;
        int lastIndex$iv$iv = m$iv$iv.length - 2;
        int i$iv$iv = 0;
        if (0 <= lastIndex$iv$iv) {
            loop0:
            while (true) {
                long slot$iv$iv = m$iv$iv[i$iv$iv];
                int i2 = i;
                int index3 = index2;
                long $this$maskEmptyOrDeleted$iv$iv$iv = slot$iv$iv;
                LongSet this_$iv2 = this_$iv;
                int $i$f$forEach2 = $i$f$forEach;
                if ((((~$this$maskEmptyOrDeleted$iv$iv$iv) << 7) & $this$maskEmptyOrDeleted$iv$iv$iv & -9187201950435737472L) != -9187201950435737472L) {
                    int i3 = 8;
                    int bitCount$iv$iv = 8 - ((~(i$iv$iv - lastIndex$iv$iv)) >>> 31);
                    int j$iv$iv = 0;
                    index = index3;
                    while (j$iv$iv < bitCount$iv$iv) {
                        if ((slot$iv$iv & 255) < 128) {
                            long element = k$iv[(i$iv$iv << 3) + j$iv$iv];
                            if (index == limit) {
                                $this$joinToString_u24lambda_u2415.append(charSequence4);
                                break loop0;
                            }
                            if (index != 0) {
                                $this$joinToString_u24lambda_u2415.append(charSequence);
                            }
                            $this$joinToString_u24lambda_u2415.append((CharSequence) function1.invoke(Long.valueOf(element)));
                            index++;
                        } else {
                            int i4 = limit;
                        }
                        slot$iv$iv >>= 8;
                        j$iv$iv++;
                        i3 = 8;
                        charSequence = separator;
                    }
                    int i5 = i3;
                    int i6 = limit;
                    if (bitCount$iv$iv != i5) {
                        break;
                    }
                } else {
                    int i7 = limit;
                    index = index3;
                }
                if (i$iv$iv == lastIndex$iv$iv) {
                    break;
                }
                i$iv$iv++;
                charSequence = separator;
                index2 = index;
                this_$iv = this_$iv2;
                $i$f$forEach = $i$f$forEach2;
                i = i2;
            }
            String sb2 = sb.toString();
            Intrinsics.checkNotNullExpressionValue(sb2, "StringBuilder().apply(builderAction).toString()");
            return sb2;
        }
        LongSet longSet = this_$iv;
        int index4 = limit;
        $this$joinToString_u24lambda_u2415.append(charSequence3);
        String sb22 = sb.toString();
        Intrinsics.checkNotNullExpressionValue(sb22, "StringBuilder().apply(builderAction).toString()");
        return sb22;
    }

    public int hashCode() {
        int hash = 0;
        long[] k$iv = this.elements;
        long[] m$iv$iv = this.metadata;
        int lastIndex$iv$iv = m$iv$iv.length - 2;
        int i$iv$iv = 0;
        if (0 <= lastIndex$iv$iv) {
            while (true) {
                long slot$iv$iv = m$iv$iv[i$iv$iv];
                long $this$maskEmptyOrDeleted$iv$iv$iv = slot$iv$iv;
                if ((((~$this$maskEmptyOrDeleted$iv$iv$iv) << 7) & $this$maskEmptyOrDeleted$iv$iv$iv & -9187201950435737472L) != -9187201950435737472L) {
                    int bitCount$iv$iv = 8 - ((~(i$iv$iv - lastIndex$iv$iv)) >>> 31);
                    for (int j$iv$iv = 0; j$iv$iv < bitCount$iv$iv; j$iv$iv++) {
                        if ((255 & slot$iv$iv) < 128) {
                            hash += Long.hashCode(k$iv[(i$iv$iv << 3) + j$iv$iv]);
                        }
                        slot$iv$iv >>= 8;
                    }
                    if (bitCount$iv$iv != 8) {
                        break;
                    }
                }
                if (i$iv$iv == lastIndex$iv$iv) {
                    break;
                }
                i$iv$iv++;
            }
        }
        return hash;
    }

    /* JADX WARNING: type inference failed for: r23v0, types: [java.lang.Object] */
    /* JADX WARNING: Unknown variable types count: 1 */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public boolean equals(java.lang.Object r23) {
        /*
            r22 = this;
            r0 = r22
            r1 = r23
            r2 = 1
            if (r1 != r0) goto L_0x0008
            return r2
        L_0x0008:
            boolean r3 = r1 instanceof androidx.collection.LongSet
            r4 = 0
            if (r3 != 0) goto L_0x000e
            return r4
        L_0x000e:
            r3 = r1
            androidx.collection.LongSet r3 = (androidx.collection.LongSet) r3
            int r3 = r3._size
            int r5 = r0._size
            if (r3 == r5) goto L_0x0018
            return r4
        L_0x0018:
            r3 = r22
            r5 = 0
            long[] r6 = r3.elements
            r7 = r3
            r8 = 0
            long[] r9 = r7.metadata
            int r10 = r9.length
            int r10 = r10 + -2
            r11 = 0
            if (r11 > r10) goto L_0x0091
        L_0x0029:
            r12 = r9[r11]
            r14 = r12
            r16 = 0
            r17 = r3
            long r2 = ~r14
            r18 = 7
            long r2 = r2 << r18
            long r2 = r2 & r14
            r18 = -9187201950435737472(0x8080808080808080, double:-2.937446524422997E-306)
            long r2 = r2 & r18
            int r2 = (r2 > r18 ? 1 : (r2 == r18 ? 0 : -1))
            if (r2 == 0) goto L_0x0085
            int r2 = r11 - r10
            int r2 = ~r2
            int r2 = r2 >>> 31
            r3 = 8
            int r2 = 8 - r2
            r14 = 0
        L_0x004b:
            if (r14 >= r2) goto L_0x0081
            r15 = 255(0xff, double:1.26E-321)
            long r15 = r15 & r12
            r18 = 0
            r19 = 128(0x80, double:6.32E-322)
            int r19 = (r15 > r19 ? 1 : (r15 == r19 ? 0 : -1))
            if (r19 >= 0) goto L_0x005a
            r15 = 1
            goto L_0x005b
        L_0x005a:
            r15 = r4
        L_0x005b:
            if (r15 == 0) goto L_0x0077
            int r15 = r11 << 3
            int r15 = r15 + r14
            r16 = r15
            r18 = 0
            r3 = r6[r16]
            r21 = 0
            r0 = r1
            androidx.collection.LongSet r0 = (androidx.collection.LongSet) r0
            boolean r0 = r0.contains(r3)
            if (r0 != 0) goto L_0x0073
            r0 = 0
            return r0
        L_0x0073:
            r0 = 0
            goto L_0x0078
        L_0x0077:
            r0 = r4
        L_0x0078:
            r3 = 8
            long r12 = r12 >> r3
            int r14 = r14 + 1
            r4 = r0
            r0 = r22
            goto L_0x004b
        L_0x0081:
            r0 = r4
            if (r2 != r3) goto L_0x0094
            goto L_0x0086
        L_0x0085:
            r0 = r4
        L_0x0086:
            if (r11 == r10) goto L_0x0093
            int r11 = r11 + 1
            r4 = r0
            r3 = r17
            r2 = 1
            r0 = r22
            goto L_0x0029
        L_0x0091:
            r17 = r3
        L_0x0093:
        L_0x0094:
            r0 = 1
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.collection.LongSet.equals(java.lang.Object):boolean");
    }

    public String toString() {
        return joinToString$default(this, (CharSequence) null, "[", "]", 0, (CharSequence) null, 25, (Object) null);
    }

    /* JADX WARNING: Code restructure failed: missing block: B:11:0x0082, code lost:
        r9 = r1;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:12:0x0091, code lost:
        if (((((~r9) << 6) & r9) & -9187201950435737472L) == 0) goto L_0x0096;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:13:0x0093, code lost:
        return -1;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final int findElementIndex$collection(long r22) {
        /*
            r21 = this;
            r0 = r21
            r1 = 0
            r2 = 0
            int r3 = java.lang.Long.hashCode(r22)
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
            if (r14 == 0) goto L_0x005d
            r14 = 1
            goto L_0x005e
        L_0x005d:
            r14 = 0
        L_0x005e:
            if (r14 == 0) goto L_0x0082
            r9 = r7
            r11 = 0
            r17 = r9
            r14 = 0
            int r19 = java.lang.Long.numberOfTrailingZeros(r17)
            int r14 = r19 >> 3
            int r14 = r14 + r5
            r9 = r14 & r4
            long[] r10 = r0.elements
            r17 = r10[r9]
            int r10 = (r17 > r22 ? 1 : (r17 == r22 ? 0 : -1))
            if (r10 != 0) goto L_0x0078
            return r9
        L_0x0078:
            r10 = r7
            r14 = 0
            r17 = 1
            long r17 = r10 - r17
            long r10 = r10 & r17
            r7 = r10
            goto L_0x0053
        L_0x0082:
            r9 = r1
            r11 = 0
            long r12 = ~r9
            r14 = 6
            long r12 = r12 << r14
            long r12 = r12 & r9
            r19 = -9187201950435737472(0x8080808080808080, double:-2.937446524422997E-306)
            long r9 = r12 & r19
            int r9 = (r9 > r17 ? 1 : (r9 == r17 ? 0 : -1))
            if (r9 == 0) goto L_0x0096
            r1 = -1
            return r1
        L_0x0096:
            int r6 = r6 + 8
            int r9 = r5 + r6
            r5 = r9 & r4
            r1 = r15
            r2 = r16
            goto L_0x001c
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.collection.LongSet.findElementIndex$collection(long):int");
    }

    public final String joinToString(CharSequence separator, CharSequence prefix, CharSequence postfix, int limit, Function1<? super Long, ? extends CharSequence> transform) {
        int index$iv;
        CharSequence charSequence = separator;
        CharSequence charSequence2 = prefix;
        CharSequence charSequence3 = postfix;
        Function1<? super Long, ? extends CharSequence> function1 = transform;
        Intrinsics.checkNotNullParameter(charSequence, "separator");
        Intrinsics.checkNotNullParameter(charSequence2, "prefix");
        Intrinsics.checkNotNullParameter(charSequence3, "postfix");
        Intrinsics.checkNotNullParameter(function1, "transform");
        StringBuilder sb = new StringBuilder();
        StringBuilder $this$joinToString_u24lambda_u2415$iv = sb;
        int i = 0;
        $this$joinToString_u24lambda_u2415$iv.append(charSequence2);
        int index$iv2 = 0;
        LongSet this_$iv$iv = this;
        int $i$f$forEach = 0;
        long[] k$iv$iv = this_$iv$iv.elements;
        long[] m$iv$iv$iv = this_$iv$iv.metadata;
        int lastIndex$iv$iv$iv = m$iv$iv$iv.length - 2;
        int i$iv$iv$iv = 0;
        if (0 <= lastIndex$iv$iv$iv) {
            loop0:
            while (true) {
                long slot$iv$iv$iv = m$iv$iv$iv[i$iv$iv$iv];
                int i2 = i;
                int index$iv3 = index$iv2;
                long $this$maskEmptyOrDeleted$iv$iv$iv$iv = slot$iv$iv$iv;
                LongSet this_$iv$iv2 = this_$iv$iv;
                int $i$f$forEach2 = $i$f$forEach;
                if ((((~$this$maskEmptyOrDeleted$iv$iv$iv$iv) << 7) & $this$maskEmptyOrDeleted$iv$iv$iv$iv & -9187201950435737472L) != -9187201950435737472L) {
                    int i3 = 8;
                    int bitCount$iv$iv$iv = 8 - ((~(i$iv$iv$iv - lastIndex$iv$iv$iv)) >>> 31);
                    int j$iv$iv$iv = 0;
                    index$iv = index$iv3;
                    while (j$iv$iv$iv < bitCount$iv$iv$iv) {
                        if ((slot$iv$iv$iv & 255) < 128) {
                            long element$iv = k$iv$iv[(i$iv$iv$iv << 3) + j$iv$iv$iv];
                            if (index$iv == limit) {
                                $this$joinToString_u24lambda_u2415$iv.append(truncated$iv);
                                break loop0;
                            }
                            if (index$iv != 0) {
                                $this$joinToString_u24lambda_u2415$iv.append(charSequence);
                            }
                            $this$joinToString_u24lambda_u2415$iv.append((CharSequence) function1.invoke(Long.valueOf(element$iv)));
                            index$iv++;
                        } else {
                            int i4 = limit;
                        }
                        slot$iv$iv$iv >>= 8;
                        j$iv$iv$iv++;
                        i3 = 8;
                        charSequence = separator;
                    }
                    int i5 = i3;
                    int i6 = limit;
                    if (bitCount$iv$iv$iv != i5) {
                        break;
                    }
                } else {
                    int i7 = limit;
                    index$iv = index$iv3;
                }
                if (i$iv$iv$iv == lastIndex$iv$iv$iv) {
                    break;
                }
                i$iv$iv$iv++;
                charSequence = separator;
                index$iv2 = index$iv;
                this_$iv$iv = this_$iv$iv2;
                $i$f$forEach = $i$f$forEach2;
                i = i2;
            }
            String sb2 = sb.toString();
            Intrinsics.checkNotNullExpressionValue(sb2, "StringBuilder().apply(builderAction).toString()");
            return sb2;
        }
        LongSet longSet = this_$iv$iv;
        int index$iv4 = limit;
        $this$joinToString_u24lambda_u2415$iv.append(charSequence3);
        String sb22 = sb.toString();
        Intrinsics.checkNotNullExpressionValue(sb22, "StringBuilder().apply(builderAction).toString()");
        return sb22;
    }

    public final String joinToString(CharSequence separator, CharSequence prefix, CharSequence postfix, Function1<? super Long, ? extends CharSequence> transform) {
        CharSequence charSequence = separator;
        CharSequence charSequence2 = prefix;
        CharSequence charSequence3 = postfix;
        Function1<? super Long, ? extends CharSequence> function1 = transform;
        Intrinsics.checkNotNullParameter(charSequence, "separator");
        Intrinsics.checkNotNullParameter(charSequence2, "prefix");
        Intrinsics.checkNotNullParameter(charSequence3, "postfix");
        Intrinsics.checkNotNullParameter(function1, "transform");
        StringBuilder sb = new StringBuilder();
        StringBuilder $this$joinToString_u24lambda_u2415$iv = sb;
        int i = 0;
        $this$joinToString_u24lambda_u2415$iv.append(charSequence2);
        int index$iv = 0;
        LongSet this_$iv$iv = this;
        int $i$f$forEach = 0;
        long[] k$iv$iv = this_$iv$iv.elements;
        long[] m$iv$iv$iv = this_$iv$iv.metadata;
        int lastIndex$iv$iv$iv = m$iv$iv$iv.length - 2;
        int i$iv$iv$iv = 0;
        if (0 <= lastIndex$iv$iv$iv) {
            loop0:
            while (true) {
                long slot$iv$iv$iv = m$iv$iv$iv[i$iv$iv$iv];
                int i2 = i;
                int index$iv2 = index$iv;
                long $this$maskEmptyOrDeleted$iv$iv$iv$iv = slot$iv$iv$iv;
                LongSet this_$iv$iv2 = this_$iv$iv;
                int $i$f$forEach2 = $i$f$forEach;
                if ((((~$this$maskEmptyOrDeleted$iv$iv$iv$iv) << 7) & $this$maskEmptyOrDeleted$iv$iv$iv$iv & -9187201950435737472L) != -9187201950435737472L) {
                    int i3 = 8;
                    int bitCount$iv$iv$iv = 8 - ((~(i$iv$iv$iv - lastIndex$iv$iv$iv)) >>> 31);
                    int index$iv3 = index$iv2;
                    for (int j$iv$iv$iv = 0; j$iv$iv$iv < bitCount$iv$iv$iv; j$iv$iv$iv++) {
                        if ((slot$iv$iv$iv & 255) < 128) {
                            long element$iv = k$iv$iv[(i$iv$iv$iv << 3) + j$iv$iv$iv];
                            if (index$iv3 == -1) {
                                $this$joinToString_u24lambda_u2415$iv.append(truncated$iv);
                                break loop0;
                            }
                            if (index$iv3 != 0) {
                                $this$joinToString_u24lambda_u2415$iv.append(charSequence);
                            }
                            $this$joinToString_u24lambda_u2415$iv.append((CharSequence) function1.invoke(Long.valueOf(element$iv)));
                            index$iv3++;
                        }
                        i3 = 8;
                        slot$iv$iv$iv >>= 8;
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
                this_$iv$iv = this_$iv$iv2;
                $i$f$forEach = $i$f$forEach2;
                i = i2;
            }
            $this$joinToString_u24lambda_u2415$iv.append(charSequence3);
            String sb2 = sb.toString();
            Intrinsics.checkNotNullExpressionValue(sb2, "StringBuilder().apply(builderAction).toString()");
            return sb2;
        }
        LongSet longSet = this_$iv$iv;
        int i4 = index$iv;
        $this$joinToString_u24lambda_u2415$iv.append(charSequence3);
        String sb22 = sb.toString();
        Intrinsics.checkNotNullExpressionValue(sb22, "StringBuilder().apply(builderAction).toString()");
        return sb22;
    }

    public final String joinToString(CharSequence separator, CharSequence prefix, Function1<? super Long, ? extends CharSequence> transform) {
        CharSequence charSequence = separator;
        CharSequence charSequence2 = prefix;
        Function1<? super Long, ? extends CharSequence> function1 = transform;
        Intrinsics.checkNotNullParameter(charSequence, "separator");
        Intrinsics.checkNotNullParameter(charSequence2, "prefix");
        Intrinsics.checkNotNullParameter(function1, "transform");
        StringBuilder sb = new StringBuilder();
        StringBuilder $this$joinToString_u24lambda_u2415$iv = sb;
        int i = 0;
        $this$joinToString_u24lambda_u2415$iv.append(charSequence2);
        int index$iv = 0;
        LongSet this_$iv$iv = this;
        int $i$f$forEach = 0;
        long[] k$iv$iv = this_$iv$iv.elements;
        long[] m$iv$iv$iv = this_$iv$iv.metadata;
        int lastIndex$iv$iv$iv = m$iv$iv$iv.length - 2;
        int i$iv$iv$iv = 0;
        if (0 <= lastIndex$iv$iv$iv) {
            loop0:
            while (true) {
                long slot$iv$iv$iv = m$iv$iv$iv[i$iv$iv$iv];
                int i2 = i;
                int index$iv2 = index$iv;
                long $this$maskEmptyOrDeleted$iv$iv$iv$iv = slot$iv$iv$iv;
                LongSet this_$iv$iv2 = this_$iv$iv;
                int $i$f$forEach2 = $i$f$forEach;
                if ((((~$this$maskEmptyOrDeleted$iv$iv$iv$iv) << 7) & $this$maskEmptyOrDeleted$iv$iv$iv$iv & -9187201950435737472L) != -9187201950435737472L) {
                    int i3 = 8;
                    int bitCount$iv$iv$iv = 8 - ((~(i$iv$iv$iv - lastIndex$iv$iv$iv)) >>> 31);
                    int index$iv3 = index$iv2;
                    for (int j$iv$iv$iv = 0; j$iv$iv$iv < bitCount$iv$iv$iv; j$iv$iv$iv++) {
                        if ((slot$iv$iv$iv & 255) < 128) {
                            long element$iv = k$iv$iv[(i$iv$iv$iv << 3) + j$iv$iv$iv];
                            if (index$iv3 == -1) {
                                $this$joinToString_u24lambda_u2415$iv.append(truncated$iv);
                                break loop0;
                            }
                            if (index$iv3 != 0) {
                                $this$joinToString_u24lambda_u2415$iv.append(charSequence);
                            }
                            $this$joinToString_u24lambda_u2415$iv.append((CharSequence) function1.invoke(Long.valueOf(element$iv)));
                            index$iv3++;
                        }
                        i3 = 8;
                        slot$iv$iv$iv >>= 8;
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
                this_$iv$iv = this_$iv$iv2;
                $i$f$forEach = $i$f$forEach2;
                i = i2;
            }
            $this$joinToString_u24lambda_u2415$iv.append(postfix$iv);
            String sb2 = sb.toString();
            Intrinsics.checkNotNullExpressionValue(sb2, "StringBuilder().apply(builderAction).toString()");
            return sb2;
        }
        LongSet longSet = this_$iv$iv;
        int i4 = index$iv;
        $this$joinToString_u24lambda_u2415$iv.append(postfix$iv);
        String sb22 = sb.toString();
        Intrinsics.checkNotNullExpressionValue(sb22, "StringBuilder().apply(builderAction).toString()");
        return sb22;
    }

    public final String joinToString(CharSequence separator, Function1<? super Long, ? extends CharSequence> transform) {
        CharSequence charSequence = separator;
        Function1<? super Long, ? extends CharSequence> function1 = transform;
        Intrinsics.checkNotNullParameter(charSequence, "separator");
        Intrinsics.checkNotNullParameter(function1, "transform");
        CharSequence prefix$iv = "";
        StringBuilder sb = new StringBuilder();
        StringBuilder $this$joinToString_u24lambda_u2415$iv = sb;
        int i = 0;
        $this$joinToString_u24lambda_u2415$iv.append(prefix$iv);
        int index$iv = 0;
        LongSet this_$iv$iv = this;
        int $i$f$forEach = 0;
        long[] k$iv$iv = this_$iv$iv.elements;
        long[] m$iv$iv$iv = this_$iv$iv.metadata;
        CharSequence charSequence2 = prefix$iv;
        int lastIndex$iv$iv$iv = m$iv$iv$iv.length - 2;
        int i$iv$iv$iv = 0;
        if (0 <= lastIndex$iv$iv$iv) {
            loop0:
            while (true) {
                long slot$iv$iv$iv = m$iv$iv$iv[i$iv$iv$iv];
                int i2 = i;
                int index$iv2 = index$iv;
                long $this$maskEmptyOrDeleted$iv$iv$iv$iv = slot$iv$iv$iv;
                LongSet this_$iv$iv2 = this_$iv$iv;
                int $i$f$forEach2 = $i$f$forEach;
                if ((((~$this$maskEmptyOrDeleted$iv$iv$iv$iv) << 7) & $this$maskEmptyOrDeleted$iv$iv$iv$iv & -9187201950435737472L) != -9187201950435737472L) {
                    int i3 = 8;
                    int bitCount$iv$iv$iv = 8 - ((~(i$iv$iv$iv - lastIndex$iv$iv$iv)) >>> 31);
                    int index$iv3 = index$iv2;
                    for (int j$iv$iv$iv = 0; j$iv$iv$iv < bitCount$iv$iv$iv; j$iv$iv$iv++) {
                        if ((slot$iv$iv$iv & 255) < 128) {
                            long element$iv = k$iv$iv[(i$iv$iv$iv << 3) + j$iv$iv$iv];
                            if (index$iv3 == -1) {
                                $this$joinToString_u24lambda_u2415$iv.append(truncated$iv);
                                break loop0;
                            }
                            if (index$iv3 != 0) {
                                $this$joinToString_u24lambda_u2415$iv.append(charSequence);
                            }
                            $this$joinToString_u24lambda_u2415$iv.append((CharSequence) function1.invoke(Long.valueOf(element$iv)));
                            index$iv3++;
                        }
                        i3 = 8;
                        slot$iv$iv$iv >>= 8;
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
                this_$iv$iv = this_$iv$iv2;
                $i$f$forEach = $i$f$forEach2;
                i = i2;
            }
        } else {
            LongSet longSet = this_$iv$iv;
        }
        int i4 = index$iv;
        $this$joinToString_u24lambda_u2415$iv.append(postfix$iv);
        String sb2 = sb.toString();
        Intrinsics.checkNotNullExpressionValue(sb2, "StringBuilder().apply(builderAction).toString()");
        return sb2;
    }

    public final String joinToString(Function1<? super Long, ? extends CharSequence> transform) {
        Function1<? super Long, ? extends CharSequence> function1 = transform;
        Intrinsics.checkNotNullParameter(function1, "transform");
        CharSequence prefix$iv = "";
        StringBuilder sb = new StringBuilder();
        StringBuilder $this$joinToString_u24lambda_u2415$iv = sb;
        int i = 0;
        $this$joinToString_u24lambda_u2415$iv.append(prefix$iv);
        int index$iv = 0;
        LongSet this_$iv$iv = this;
        int $i$f$forEach = 0;
        long[] k$iv$iv = this_$iv$iv.elements;
        long[] m$iv$iv$iv = this_$iv$iv.metadata;
        CharSequence charSequence = prefix$iv;
        int lastIndex$iv$iv$iv = m$iv$iv$iv.length - 2;
        int i$iv$iv$iv = 0;
        if (0 <= lastIndex$iv$iv$iv) {
            loop0:
            while (true) {
                long slot$iv$iv$iv = m$iv$iv$iv[i$iv$iv$iv];
                int i2 = i;
                int index$iv2 = index$iv;
                long $this$maskEmptyOrDeleted$iv$iv$iv$iv = slot$iv$iv$iv;
                LongSet this_$iv$iv2 = this_$iv$iv;
                int $i$f$forEach2 = $i$f$forEach;
                if ((((~$this$maskEmptyOrDeleted$iv$iv$iv$iv) << 7) & $this$maskEmptyOrDeleted$iv$iv$iv$iv & -9187201950435737472L) != -9187201950435737472L) {
                    int i3 = 8;
                    int bitCount$iv$iv$iv = 8 - ((~(i$iv$iv$iv - lastIndex$iv$iv$iv)) >>> 31);
                    int index$iv3 = index$iv2;
                    for (int j$iv$iv$iv = 0; j$iv$iv$iv < bitCount$iv$iv$iv; j$iv$iv$iv++) {
                        if ((slot$iv$iv$iv & 255) < 128) {
                            long element$iv = k$iv$iv[(i$iv$iv$iv << 3) + j$iv$iv$iv];
                            if (index$iv3 == -1) {
                                $this$joinToString_u24lambda_u2415$iv.append(truncated$iv);
                                break loop0;
                            }
                            if (index$iv3 != 0) {
                                $this$joinToString_u24lambda_u2415$iv.append(separator$iv);
                            }
                            $this$joinToString_u24lambda_u2415$iv.append((CharSequence) function1.invoke(Long.valueOf(element$iv)));
                            index$iv3++;
                        }
                        i3 = 8;
                        slot$iv$iv$iv >>= 8;
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
                this_$iv$iv = this_$iv$iv2;
                $i$f$forEach = $i$f$forEach2;
                i = i2;
            }
        } else {
            LongSet longSet = this_$iv$iv;
        }
        int i4 = index$iv;
        $this$joinToString_u24lambda_u2415$iv.append(postfix$iv);
        String sb2 = sb.toString();
        Intrinsics.checkNotNullExpressionValue(sb2, "StringBuilder().apply(builderAction).toString()");
        return sb2;
    }
}
