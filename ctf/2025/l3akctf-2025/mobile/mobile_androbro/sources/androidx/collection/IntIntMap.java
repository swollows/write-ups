package androidx.collection;

import java.util.NoSuchElementException;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

@Metadata(d1 = {"\u0000d\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0007\n\u0002\u0010\u0015\n\u0002\b\u0002\n\u0002\u0010\u0016\n\u0002\b\u0006\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u000b\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\r\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0000\b6\u0018\u00002\u00020\u0001B\u0007\b\u0004¢\u0006\u0002\u0010\u0002J&\u0010\u0015\u001a\u00020\u00162\u0018\u0010\u0017\u001a\u0014\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u00160\u0018H\bø\u0001\u0000J\u0006\u0010\u0019\u001a\u00020\u0016J&\u0010\u0019\u001a\u00020\u00162\u0018\u0010\u0017\u001a\u0014\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u00160\u0018H\bø\u0001\u0000J\u0011\u0010\u001a\u001a\u00020\u00162\u0006\u0010\u001b\u001a\u00020\u0004H\u0002J\u000e\u0010\u001c\u001a\u00020\u00162\u0006\u0010\u001b\u001a\u00020\u0004J\u000e\u0010\u001d\u001a\u00020\u00162\u0006\u0010\u001e\u001a\u00020\u0004J\u0006\u0010\u001f\u001a\u00020\u0004J&\u0010\u001f\u001a\u00020\u00042\u0018\u0010\u0017\u001a\u0014\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u00160\u0018H\bø\u0001\u0000J\u0013\u0010 \u001a\u00020\u00162\b\u0010!\u001a\u0004\u0018\u00010\u0001H\u0002J\u0010\u0010\"\u001a\u00020\u00042\u0006\u0010\u001b\u001a\u00020\u0004H\u0001JD\u0010#\u001a\u00020$26\u0010%\u001a2\u0012\u0013\u0012\u00110\u0004¢\u0006\f\b&\u0012\b\b'\u0012\u0004\b\b(\u001b\u0012\u0013\u0012\u00110\u0004¢\u0006\f\b&\u0012\b\b'\u0012\u0004\b\b(\u001e\u0012\u0004\u0012\u00020$0\u0018H\bø\u0001\u0000J/\u0010(\u001a\u00020$2!\u0010%\u001a\u001d\u0012\u0013\u0012\u00110\u0004¢\u0006\f\b&\u0012\b\b'\u0012\u0004\b\b(*\u0012\u0004\u0012\u00020$0)H\bø\u0001\u0000J/\u0010+\u001a\u00020$2!\u0010%\u001a\u001d\u0012\u0013\u0012\u00110\u0004¢\u0006\f\b&\u0012\b\b'\u0012\u0004\b\b(\u001b\u0012\u0004\u0012\u00020$0)H\bø\u0001\u0000J/\u0010,\u001a\u00020$2!\u0010%\u001a\u001d\u0012\u0013\u0012\u00110\u0004¢\u0006\f\b&\u0012\b\b'\u0012\u0004\b\b(\u001e\u0012\u0004\u0012\u00020$0)H\bø\u0001\u0000J\u0011\u0010-\u001a\u00020\u00042\u0006\u0010\u001b\u001a\u00020\u0004H\u0002J\u0016\u0010.\u001a\u00020\u00042\u0006\u0010\u001b\u001a\u00020\u00042\u0006\u0010/\u001a\u00020\u0004J\"\u00100\u001a\u00020\u00042\u0006\u0010\u001b\u001a\u00020\u00042\f\u0010/\u001a\b\u0012\u0004\u0012\u00020\u000401H\bø\u0001\u0000J\b\u00102\u001a\u00020\u0004H\u0016J\u0006\u00103\u001a\u00020\u0016J\u0006\u00104\u001a\u00020\u0016J:\u00105\u001a\u0002062\b\b\u0002\u00107\u001a\u0002082\b\b\u0002\u00109\u001a\u0002082\b\b\u0002\u0010:\u001a\u0002082\b\b\u0002\u0010;\u001a\u00020\u00042\b\b\u0002\u0010<\u001a\u000208H\u0007Jx\u00105\u001a\u0002062\b\b\u0002\u00107\u001a\u0002082\b\b\u0002\u00109\u001a\u0002082\b\b\u0002\u0010:\u001a\u0002082\b\b\u0002\u0010;\u001a\u00020\u00042\b\b\u0002\u0010<\u001a\u00020828\b\u0004\u0010=\u001a2\u0012\u0013\u0012\u00110\u0004¢\u0006\f\b&\u0012\b\b'\u0012\u0004\b\b(\u001b\u0012\u0013\u0012\u00110\u0004¢\u0006\f\b&\u0012\b\b'\u0012\u0004\b\b(\u001e\u0012\u0004\u0012\u0002080\u0018H\bø\u0001\u0000J\u0006\u0010>\u001a\u00020\u0016J\b\u0010?\u001a\u000206H\u0016R\u0018\u0010\u0003\u001a\u00020\u00048\u0000@\u0000X\u000e¢\u0006\b\n\u0000\u0012\u0004\b\u0005\u0010\u0002R\u0018\u0010\u0006\u001a\u00020\u00048\u0000@\u0000X\u000e¢\u0006\b\n\u0000\u0012\u0004\b\u0007\u0010\u0002R\u0011\u0010\b\u001a\u00020\u00048F¢\u0006\u0006\u001a\u0004\b\t\u0010\nR\u0018\u0010\u000b\u001a\u00020\f8\u0000@\u0000X\u000e¢\u0006\b\n\u0000\u0012\u0004\b\r\u0010\u0002R\u0018\u0010\u000e\u001a\u00020\u000f8\u0000@\u0000X\u000e¢\u0006\b\n\u0000\u0012\u0004\b\u0010\u0010\u0002R\u0011\u0010\u0011\u001a\u00020\u00048F¢\u0006\u0006\u001a\u0004\b\u0012\u0010\nR\u0018\u0010\u0013\u001a\u00020\f8\u0000@\u0000X\u000e¢\u0006\b\n\u0000\u0012\u0004\b\u0014\u0010\u0002\u0001\u0001@\u0002\u0007\n\u0005\b20\u0001¨\u0006A"}, d2 = {"Landroidx/collection/IntIntMap;", "", "()V", "_capacity", "", "get_capacity$collection$annotations", "_size", "get_size$collection$annotations", "capacity", "getCapacity", "()I", "keys", "", "getKeys$annotations", "metadata", "", "getMetadata$annotations", "size", "getSize", "values", "getValues$annotations", "all", "", "predicate", "Lkotlin/Function2;", "any", "contains", "key", "containsKey", "containsValue", "value", "count", "equals", "other", "findKeyIndex", "forEach", "", "block", "Lkotlin/ParameterName;", "name", "forEachIndexed", "Lkotlin/Function1;", "index", "forEachKey", "forEachValue", "get", "getOrDefault", "defaultValue", "getOrElse", "Lkotlin/Function0;", "hashCode", "isEmpty", "isNotEmpty", "joinToString", "", "separator", "", "prefix", "postfix", "limit", "truncated", "transform", "none", "toString", "Landroidx/collection/MutableIntIntMap;", "collection"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* compiled from: IntIntMap.kt */
public abstract class IntIntMap {
    public int _capacity;
    public int _size;
    public int[] keys;
    public long[] metadata;
    public int[] values;

    public /* synthetic */ IntIntMap(DefaultConstructorMarker defaultConstructorMarker) {
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

    private IntIntMap() {
        this.metadata = ScatterMapKt.EmptyGroup;
        this.keys = IntSetKt.getEmptyIntArray();
        this.values = IntSetKt.getEmptyIntArray();
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

    public final int get(int key) {
        int index = findKeyIndex(key);
        if (index >= 0) {
            return this.values[index];
        }
        throw new NoSuchElementException("Cannot find value for key " + key);
    }

    public final int getOrDefault(int key, int defaultValue) {
        int index = findKeyIndex(key);
        if (index >= 0) {
            return this.values[index];
        }
        return defaultValue;
    }

    public final int getOrElse(int key, Function0<Integer> defaultValue) {
        Intrinsics.checkNotNullParameter(defaultValue, "defaultValue");
        int index = findKeyIndex(key);
        if (index < 0) {
            return defaultValue.invoke().intValue();
        }
        return this.values[index];
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

    public final void forEach(Function2<? super Integer, ? super Integer, Unit> block) {
        Function2<? super Integer, ? super Integer, Unit> function2 = block;
        Intrinsics.checkNotNullParameter(function2, "block");
        int[] k = this.keys;
        int[] v = this.values;
        IntIntMap this_$iv = this;
        int $i$f$forEachIndexed = 0;
        long[] m$iv = this_$iv.metadata;
        int lastIndex$iv = m$iv.length - 2;
        int i$iv = 0;
        if (0 <= lastIndex$iv) {
            while (true) {
                long slot$iv = m$iv[i$iv];
                long $this$maskEmptyOrDeleted$iv$iv = slot$iv;
                IntIntMap this_$iv2 = this_$iv;
                int $i$f$forEachIndexed2 = $i$f$forEachIndexed;
                if ((((~$this$maskEmptyOrDeleted$iv$iv) << 7) & $this$maskEmptyOrDeleted$iv$iv & -9187201950435737472L) != -9187201950435737472L) {
                    int i = 8;
                    int bitCount$iv = 8 - ((~(i$iv - lastIndex$iv)) >>> 31);
                    int j$iv = 0;
                    while (j$iv < bitCount$iv) {
                        if ((255 & slot$iv) < 128) {
                            int index = (i$iv << 3) + j$iv;
                            function2.invoke(Integer.valueOf(k[index]), Integer.valueOf(v[index]));
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

    public final void forEachKey(Function1<? super Integer, Unit> block) {
        Function1<? super Integer, Unit> function1 = block;
        Intrinsics.checkNotNullParameter(function1, "block");
        int[] k = this.keys;
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
                            function1.invoke(Integer.valueOf(k[(i$iv << 3) + j$iv]));
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

    public final void forEachValue(Function1<? super Integer, Unit> block) {
        Function1<? super Integer, Unit> function1 = block;
        Intrinsics.checkNotNullParameter(function1, "block");
        int[] v = this.values;
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
                            function1.invoke(Integer.valueOf(v[(i$iv << 3) + j$iv]));
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

    public final boolean all(Function2<? super Integer, ? super Integer, Boolean> predicate) {
        int $i$f$all;
        int $i$f$all2;
        Function2<? super Integer, ? super Integer, Boolean> function2 = predicate;
        Intrinsics.checkNotNullParameter(function2, "predicate");
        int $i$f$all3 = 0;
        int[] k$iv = this.keys;
        int[] v$iv = this.values;
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
                        if (!function2.invoke(Integer.valueOf(k$iv[index$iv]), Integer.valueOf(v$iv[index$iv])).booleanValue()) {
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

    public final boolean any(Function2<? super Integer, ? super Integer, Boolean> predicate) {
        int $i$f$any;
        int $i$f$any2;
        Function2<? super Integer, ? super Integer, Boolean> function2 = predicate;
        Intrinsics.checkNotNullParameter(function2, "predicate");
        int $i$f$any3 = 0;
        int[] k$iv = this.keys;
        int[] v$iv = this.values;
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
                        if (function2.invoke(Integer.valueOf(k$iv[index$iv]), Integer.valueOf(v$iv[index$iv])).booleanValue()) {
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

    public final int count(Function2<? super Integer, ? super Integer, Boolean> predicate) {
        IntIntMap this_$iv;
        IntIntMap this_$iv2;
        Function2<? super Integer, ? super Integer, Boolean> function2 = predicate;
        Intrinsics.checkNotNullParameter(function2, "predicate");
        int $i$f$count = 0;
        int count = 0;
        IntIntMap this_$iv3 = this;
        int[] k$iv = this_$iv3.keys;
        int[] v$iv = this_$iv3.values;
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
                            if (function2.invoke(Integer.valueOf(k$iv[index$iv]), Integer.valueOf(v$iv[index$iv])).booleanValue()) {
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
            IntIntMap intIntMap = this_$iv3;
        }
        return count;
    }

    public final boolean contains(int key) {
        return findKeyIndex(key) >= 0;
    }

    public final boolean containsKey(int key) {
        return findKeyIndex(key) >= 0;
    }

    public final boolean containsValue(int value) {
        int[] v$iv = this.values;
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
                        if (!((255 & slot$iv$iv) < 128)) {
                            int i2 = value;
                        } else if (value == v$iv[(i$iv$iv << 3) + j$iv$iv]) {
                            return true;
                        }
                        slot$iv$iv >>= 8;
                        j$iv$iv++;
                        i = 8;
                    }
                    int i3 = i;
                    int i4 = value;
                    if (bitCount$iv$iv != i3) {
                        return false;
                    }
                } else {
                    int i5 = value;
                }
                if (i$iv$iv == lastIndex$iv$iv) {
                    return false;
                }
                i$iv$iv++;
            }
        } else {
            int i6 = value;
            return false;
        }
    }

    public static /* synthetic */ String joinToString$default(IntIntMap intIntMap, CharSequence charSequence, CharSequence charSequence2, CharSequence charSequence3, int i, CharSequence charSequence4, int i2, Object obj) {
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
            return intIntMap.joinToString(charSequence, str, str2, i3, charSequence5);
        }
        throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: joinToString");
    }

    public final String joinToString(CharSequence separator, CharSequence prefix, CharSequence postfix, int limit, CharSequence truncated) {
        int[] k$iv;
        int[] k$iv2;
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
        IntIntMap this_$iv = this;
        int $i$f$forEach = 0;
        int[] k$iv3 = this_$iv.keys;
        int[] v$iv = this_$iv.values;
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
                IntIntMap this_$iv2 = this_$iv;
                int $i$f$forEach2 = $i$f$forEach;
                if ((((~$this$maskEmptyOrDeleted$iv$iv$iv) << 7) & $this$maskEmptyOrDeleted$iv$iv$iv & -9187201950435737472L) != -9187201950435737472L) {
                    int i3 = 8;
                    int bitCount$iv$iv = 8 - ((~(i$iv$iv - lastIndex$iv$iv)) >>> 31);
                    int j$iv$iv = 0;
                    int index3 = index2;
                    while (j$iv$iv < bitCount$iv$iv) {
                        if ((slot$iv$iv & 255) < 128) {
                            int index$iv = (i$iv$iv << 3) + j$iv$iv;
                            int key = k$iv3[index$iv];
                            int value = v$iv[index$iv];
                            int key2 = key;
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
        IntIntMap intIntMap = this_$iv;
        int[] iArr = k$iv3;
        int i7 = limit;
        int i8 = index;
        $this$joinToString_u24lambda_u248.append(charSequence3);
        String sb22 = sb.toString();
        Intrinsics.checkNotNullExpressionValue(sb22, "StringBuilder().apply(builderAction).toString()");
        return sb22;
    }

    public static /* synthetic */ String joinToString$default(IntIntMap $this, CharSequence separator, CharSequence prefix, CharSequence postfix, int limit, CharSequence truncated, Function2 transform, int i, Object obj) {
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
            IntIntMap this_$iv = $this;
            int[] k$iv = this_$iv.keys;
            int[] v$iv = this_$iv.values;
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
                    IntIntMap this_$iv2 = this_$iv;
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
                                int key = k$iv[index$iv];
                                int value = v$iv[index$iv];
                                if (index3 == limit2) {
                                    $this$joinToString_u24lambda_u2410.append(truncated2);
                                    CharSequence charSequence2 = separator2;
                                    CharSequence charSequence3 = postfix2;
                                    break loop0;
                                }
                                if (index3 != 0) {
                                    $this$joinToString_u24lambda_u2410.append(separator2);
                                }
                                separator4 = separator2;
                                $this$joinToString_u24lambda_u2410.append((CharSequence) function2.invoke(Integer.valueOf(key), Integer.valueOf(value)));
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
            IntIntMap intIntMap = this_$iv;
            int i3 = index;
            $this$joinToString_u24lambda_u2410.append(postfix2);
            String sb22 = sb.toString();
            Intrinsics.checkNotNullExpressionValue(sb22, "StringBuilder().apply(builderAction).toString()");
            return sb22;
        }
        throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: joinToString");
    }

    public final String joinToString(CharSequence separator, CharSequence prefix, CharSequence postfix, int limit, CharSequence truncated, Function2<? super Integer, ? super Integer, ? extends CharSequence> transform) {
        long[] m$iv$iv;
        long[] m$iv$iv2;
        CharSequence charSequence = separator;
        CharSequence charSequence2 = prefix;
        CharSequence charSequence3 = postfix;
        CharSequence charSequence4 = truncated;
        Function2<? super Integer, ? super Integer, ? extends CharSequence> function2 = transform;
        Intrinsics.checkNotNullParameter(charSequence, "separator");
        Intrinsics.checkNotNullParameter(charSequence2, "prefix");
        Intrinsics.checkNotNullParameter(charSequence3, "postfix");
        Intrinsics.checkNotNullParameter(charSequence4, "truncated");
        Intrinsics.checkNotNullParameter(function2, "transform");
        StringBuilder sb = new StringBuilder();
        StringBuilder $this$joinToString_u24lambda_u2410 = sb;
        $this$joinToString_u24lambda_u2410.append(charSequence2);
        int bitCount$iv$iv = 0;
        IntIntMap this_$iv = this;
        int[] k$iv = this_$iv.keys;
        int[] v$iv = this_$iv.values;
        IntIntMap this_$iv$iv = this_$iv;
        int $i$f$forEachIndexed = 0;
        long[] m$iv$iv3 = this_$iv$iv.metadata;
        int lastIndex$iv$iv = m$iv$iv3.length - 2;
        int i$iv$iv = 0;
        if (0 <= lastIndex$iv$iv) {
            loop0:
            while (true) {
                long slot$iv$iv = m$iv$iv3[i$iv$iv];
                int index = bitCount$iv$iv;
                IntIntMap this_$iv2 = this_$iv;
                long $this$maskEmptyOrDeleted$iv$iv$iv = slot$iv$iv;
                IntIntMap this_$iv$iv2 = this_$iv$iv;
                int $i$f$forEachIndexed2 = $i$f$forEachIndexed;
                if ((((~$this$maskEmptyOrDeleted$iv$iv$iv) << 7) & $this$maskEmptyOrDeleted$iv$iv$iv & -9187201950435737472L) != -9187201950435737472L) {
                    int i = 8;
                    int bitCount$iv$iv2 = 8 - ((~(i$iv$iv - lastIndex$iv$iv)) >>> 31);
                    int j$iv$iv = 0;
                    int index2 = index;
                    while (j$iv$iv < bitCount$iv$iv2) {
                        if ((slot$iv$iv & 255) < 128) {
                            int index$iv = (i$iv$iv << 3) + j$iv$iv;
                            int key = k$iv[index$iv];
                            int value = v$iv[index$iv];
                            if (index2 == limit) {
                                $this$joinToString_u24lambda_u2410.append(charSequence4);
                                break loop0;
                            }
                            if (index2 != 0) {
                                $this$joinToString_u24lambda_u2410.append(charSequence);
                            }
                            m$iv$iv2 = m$iv$iv3;
                            $this$joinToString_u24lambda_u2410.append((CharSequence) function2.invoke(Integer.valueOf(key), Integer.valueOf(value)));
                            index2++;
                        } else {
                            int i2 = limit;
                            m$iv$iv2 = m$iv$iv3;
                        }
                        slot$iv$iv >>= 8;
                        j$iv$iv++;
                        i = 8;
                        m$iv$iv3 = m$iv$iv2;
                        charSequence = separator;
                    }
                    m$iv$iv = m$iv$iv3;
                    int i3 = i;
                    int i4 = limit;
                    if (bitCount$iv$iv2 != i3) {
                        break;
                    }
                    bitCount$iv$iv = index2;
                } else {
                    int i5 = limit;
                    m$iv$iv = m$iv$iv3;
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
        } else {
            IntIntMap intIntMap = this_$iv;
            IntIntMap intIntMap2 = this_$iv$iv;
            int i6 = limit;
        }
        int i7 = bitCount$iv$iv;
        $this$joinToString_u24lambda_u2410.append(charSequence3);
        String sb2 = sb.toString();
        Intrinsics.checkNotNullExpressionValue(sb2, "StringBuilder().apply(builderAction).toString()");
        return sb2;
    }

    public int hashCode() {
        int bitCount$iv$iv = 0;
        IntIntMap this_$iv = this;
        int[] k$iv = this_$iv.keys;
        int[] v$iv = this_$iv.values;
        long[] m$iv$iv = this_$iv.metadata;
        int lastIndex$iv$iv = m$iv$iv.length - 2;
        int i$iv$iv = 0;
        if (0 <= lastIndex$iv$iv) {
            while (true) {
                long slot$iv$iv = m$iv$iv[i$iv$iv];
                long $this$maskEmptyOrDeleted$iv$iv$iv = slot$iv$iv;
                int hash = bitCount$iv$iv;
                IntIntMap this_$iv2 = this_$iv;
                if ((((~$this$maskEmptyOrDeleted$iv$iv$iv) << 7) & $this$maskEmptyOrDeleted$iv$iv$iv & -9187201950435737472L) != -9187201950435737472L) {
                    int bitCount$iv$iv2 = 8 - ((~(i$iv$iv - lastIndex$iv$iv)) >>> 31);
                    for (int j$iv$iv = 0; j$iv$iv < bitCount$iv$iv2; j$iv$iv++) {
                        if ((255 & slot$iv$iv) < 128) {
                            int index$iv = (i$iv$iv << 3) + j$iv$iv;
                            hash += Integer.hashCode(k$iv[index$iv]) ^ Integer.hashCode(v$iv[index$iv]);
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
        IntIntMap this_$iv;
        boolean z;
        IntIntMap this_$iv2;
        Object obj = other;
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof IntIntMap) || ((IntIntMap) obj).getSize() != getSize()) {
            return false;
        }
        IntIntMap this_$iv3 = this;
        int $i$f$forEach = 0;
        int[] k$iv = this_$iv3.keys;
        int[] v$iv = this_$iv3.values;
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
                            this_$iv2 = this_$iv3;
                            if (v$iv[index$iv] != ((IntIntMap) obj).get(k$iv[index$iv])) {
                                return false;
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
        int[] k$iv;
        int $i$f$forEach;
        int[] k$iv2;
        int $i$f$forEach2;
        if (isEmpty()) {
            return "{}";
        }
        StringBuilder s = new StringBuilder().append('{');
        int bitCount$iv$iv = 0;
        IntIntMap this_$iv = this;
        int $i$f$forEach3 = 0;
        int[] k$iv3 = this_$iv.keys;
        int[] v$iv = this_$iv.values;
        long[] m$iv$iv = this_$iv.metadata;
        int lastIndex$iv$iv = m$iv$iv.length - 2;
        int i$iv$iv = 0;
        if (0 <= lastIndex$iv$iv) {
            while (true) {
                long slot$iv$iv = m$iv$iv[i$iv$iv];
                long $this$maskEmptyOrDeleted$iv$iv$iv = slot$iv$iv;
                int i = bitCount$iv$iv;
                IntIntMap this_$iv2 = this_$iv;
                if ((((~$this$maskEmptyOrDeleted$iv$iv$iv) << 7) & $this$maskEmptyOrDeleted$iv$iv$iv & -9187201950435737472L) != -9187201950435737472L) {
                    int i2 = 8;
                    int bitCount$iv$iv2 = 8 - ((~(i$iv$iv - lastIndex$iv$iv)) >>> 31);
                    int j$iv$iv = 0;
                    while (j$iv$iv < bitCount$iv$iv2) {
                        if ((255 & slot$iv$iv) < 128) {
                            int index$iv = (i$iv$iv << 3) + j$iv$iv;
                            int key = k$iv3[index$iv];
                            $i$f$forEach2 = $i$f$forEach3;
                            int value = v$iv[index$iv];
                            s.append(key);
                            int i3 = key;
                            s.append("=");
                            s.append(value);
                            int i4 = i + 1;
                            int i5 = value;
                            k$iv2 = k$iv3;
                            if (i4 < this._size) {
                                i = i4;
                                s.append(',').append(' ');
                            } else {
                                i = i4;
                            }
                        } else {
                            $i$f$forEach2 = $i$f$forEach3;
                            k$iv2 = k$iv3;
                        }
                        i2 = 8;
                        slot$iv$iv >>= 8;
                        j$iv$iv++;
                        $i$f$forEach3 = $i$f$forEach2;
                        k$iv3 = k$iv2;
                    }
                    $i$f$forEach = $i$f$forEach3;
                    k$iv = k$iv3;
                    if (bitCount$iv$iv2 != i2) {
                        break;
                    }
                    bitCount$iv$iv = i;
                } else {
                    $i$f$forEach = $i$f$forEach3;
                    k$iv = k$iv3;
                    bitCount$iv$iv = i;
                }
                if (i$iv$iv == lastIndex$iv$iv) {
                    break;
                }
                i$iv$iv++;
                this_$iv = this_$iv2;
                $i$f$forEach3 = $i$f$forEach;
                k$iv3 = k$iv;
            }
        } else {
            int[] iArr = k$iv3;
        }
        int i6 = bitCount$iv$iv;
        String sb = s.append('}').toString();
        Intrinsics.checkNotNullExpressionValue(sb, "s.append('}').toString()");
        return sb;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:11:0x0082, code lost:
        r10 = r21;
        r8 = r6;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:12:0x0093, code lost:
        if (((((~r8) << 6) & r8) & -9187201950435737472L) == 0) goto L_0x0098;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:13:0x0095, code lost:
        return -1;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final int findKeyIndex(int r21) {
        /*
            r20 = this;
            r0 = r20
            r1 = 0
            int r2 = java.lang.Integer.hashCode(r21)
            r3 = -862048943(0xffffffffcc9e2d51, float:-8.2930312E7)
            int r2 = r2 * r3
            int r3 = r2 << 16
            r1 = r2 ^ r3
            r2 = 0
            r2 = r1 & 127(0x7f, float:1.78E-43)
            int r3 = r0._capacity
            r4 = 0
            int r4 = r1 >>> 7
            r4 = r4 & r3
            r5 = 0
        L_0x001b:
            long[] r6 = r0.metadata
            r7 = 0
            int r8 = r4 >> 3
            r9 = r4 & 7
            int r9 = r9 << 3
            r10 = r6[r8]
            long r10 = r10 >>> r9
            int r12 = r8 + 1
            r12 = r6[r12]
            int r14 = 64 - r9
            long r12 = r12 << r14
            long r14 = (long) r9
            long r14 = -r14
            r16 = 63
            long r14 = r14 >> r16
            long r12 = r12 & r14
            long r6 = r10 | r12
            r8 = r6
            r10 = 0
            long r11 = (long) r2
            r13 = 72340172838076673(0x101010101010101, double:7.748604185489348E-304)
            long r11 = r11 * r13
            long r11 = r11 ^ r8
            long r13 = r11 - r13
            r15 = r1
            r16 = r2
            long r1 = ~r11
            long r1 = r1 & r13
            r13 = -9187201950435737472(0x8080808080808080, double:-2.937446524422997E-306)
            long r1 = r1 & r13
        L_0x0051:
            r8 = r1
            r10 = 0
            r11 = 0
            int r17 = (r8 > r11 ? 1 : (r8 == r11 ? 0 : -1))
            if (r17 == 0) goto L_0x005c
            r17 = 1
            goto L_0x005e
        L_0x005c:
            r17 = 0
        L_0x005e:
            if (r17 == 0) goto L_0x0082
            r8 = r1
            r10 = 0
            r11 = r8
            r17 = 0
            int r18 = java.lang.Long.numberOfTrailingZeros(r11)
            int r11 = r18 >> 3
            int r11 = r11 + r4
            r8 = r11 & r3
            int[] r9 = r0.keys
            r9 = r9[r8]
            r10 = r21
            if (r9 != r10) goto L_0x0078
            return r8
        L_0x0078:
            r11 = r1
            r9 = 0
            r17 = 1
            long r17 = r11 - r17
            long r11 = r11 & r17
            r1 = r11
            goto L_0x0051
        L_0x0082:
            r10 = r21
            r8 = r6
            r17 = 0
            long r11 = ~r8
            r19 = 6
            long r11 = r11 << r19
            long r11 = r11 & r8
            long r8 = r11 & r13
            r11 = 0
            int r8 = (r8 > r11 ? 1 : (r8 == r11 ? 0 : -1))
            if (r8 == 0) goto L_0x0098
            r1 = -1
            return r1
        L_0x0098:
            int r5 = r5 + 8
            int r8 = r4 + r5
            r4 = r8 & r3
            r1 = r15
            r2 = r16
            goto L_0x001b
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.collection.IntIntMap.findKeyIndex(int):int");
    }

    public final String joinToString(CharSequence separator, CharSequence prefix, CharSequence postfix, int limit, Function2<? super Integer, ? super Integer, ? extends CharSequence> transform) {
        long[] m$iv$iv$iv;
        int index$iv;
        long[] m$iv$iv$iv2;
        CharSequence charSequence = separator;
        CharSequence charSequence2 = prefix;
        CharSequence charSequence3 = postfix;
        Function2<? super Integer, ? super Integer, ? extends CharSequence> function2 = transform;
        Intrinsics.checkNotNullParameter(charSequence, "separator");
        Intrinsics.checkNotNullParameter(charSequence2, "prefix");
        Intrinsics.checkNotNullParameter(charSequence3, "postfix");
        Intrinsics.checkNotNullParameter(function2, "transform");
        StringBuilder sb = new StringBuilder();
        StringBuilder $this$joinToString_u24lambda_u2410$iv = sb;
        int i = 0;
        $this$joinToString_u24lambda_u2410$iv.append(charSequence2);
        int index$iv2 = 0;
        IntIntMap this_$iv$iv = this;
        int $i$f$forEach = 0;
        int[] k$iv$iv = this_$iv$iv.keys;
        int[] v$iv$iv = this_$iv$iv.values;
        long[] m$iv$iv$iv3 = this_$iv$iv.metadata;
        int lastIndex$iv$iv$iv = m$iv$iv$iv3.length - 2;
        int i$iv$iv$iv = 0;
        if (0 <= lastIndex$iv$iv$iv) {
            loop0:
            while (true) {
                long slot$iv$iv$iv = m$iv$iv$iv3[i$iv$iv$iv];
                int i2 = i;
                int index$iv3 = index$iv2;
                long $this$maskEmptyOrDeleted$iv$iv$iv$iv = slot$iv$iv$iv;
                IntIntMap this_$iv$iv2 = this_$iv$iv;
                int $i$f$forEach2 = $i$f$forEach;
                if ((((~$this$maskEmptyOrDeleted$iv$iv$iv$iv) << 7) & $this$maskEmptyOrDeleted$iv$iv$iv$iv & -9187201950435737472L) != -9187201950435737472L) {
                    int i3 = 8;
                    int bitCount$iv$iv$iv = 8 - ((~(i$iv$iv$iv - lastIndex$iv$iv$iv)) >>> 31);
                    int j$iv$iv$iv = 0;
                    index$iv = index$iv3;
                    while (j$iv$iv$iv < bitCount$iv$iv$iv) {
                        if ((slot$iv$iv$iv & 255) < 128) {
                            int index$iv$iv = (i$iv$iv$iv << 3) + j$iv$iv$iv;
                            int key$iv = k$iv$iv[index$iv$iv];
                            int value$iv = v$iv$iv[index$iv$iv];
                            if (index$iv == limit) {
                                $this$joinToString_u24lambda_u2410$iv.append(truncated$iv);
                                break loop0;
                            }
                            if (index$iv != 0) {
                                $this$joinToString_u24lambda_u2410$iv.append(charSequence);
                            }
                            m$iv$iv$iv2 = m$iv$iv$iv3;
                            $this$joinToString_u24lambda_u2410$iv.append((CharSequence) function2.invoke(Integer.valueOf(key$iv), Integer.valueOf(value$iv)));
                            index$iv++;
                        } else {
                            int i4 = limit;
                            m$iv$iv$iv2 = m$iv$iv$iv3;
                        }
                        slot$iv$iv$iv >>= 8;
                        j$iv$iv$iv++;
                        i3 = 8;
                        m$iv$iv$iv3 = m$iv$iv$iv2;
                        charSequence = separator;
                    }
                    m$iv$iv$iv = m$iv$iv$iv3;
                    int i5 = i3;
                    int i6 = limit;
                    if (bitCount$iv$iv$iv != i5) {
                        break;
                    }
                } else {
                    int i7 = limit;
                    m$iv$iv$iv = m$iv$iv$iv3;
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
                m$iv$iv$iv3 = m$iv$iv$iv;
            }
        } else {
            IntIntMap intIntMap = this_$iv$iv;
            int index$iv4 = limit;
        }
        $this$joinToString_u24lambda_u2410$iv.append(charSequence3);
        String sb2 = sb.toString();
        Intrinsics.checkNotNullExpressionValue(sb2, "StringBuilder().apply(builderAction).toString()");
        return sb2;
    }

    public final String joinToString(CharSequence separator, CharSequence prefix, CharSequence postfix, Function2<? super Integer, ? super Integer, ? extends CharSequence> transform) {
        CharSequence charSequence = separator;
        CharSequence charSequence2 = prefix;
        CharSequence charSequence3 = postfix;
        Function2<? super Integer, ? super Integer, ? extends CharSequence> function2 = transform;
        Intrinsics.checkNotNullParameter(charSequence, "separator");
        Intrinsics.checkNotNullParameter(charSequence2, "prefix");
        Intrinsics.checkNotNullParameter(charSequence3, "postfix");
        Intrinsics.checkNotNullParameter(function2, "transform");
        StringBuilder sb = new StringBuilder();
        StringBuilder $this$joinToString_u24lambda_u2410$iv = sb;
        int i = 0;
        $this$joinToString_u24lambda_u2410$iv.append(charSequence2);
        int index$iv = 0;
        IntIntMap this_$iv$iv = this;
        int $i$f$forEach = 0;
        int[] k$iv$iv = this_$iv$iv.keys;
        int[] v$iv$iv = this_$iv$iv.values;
        IntIntMap this_$iv$iv$iv = this_$iv$iv;
        long[] m$iv$iv$iv = this_$iv$iv$iv.metadata;
        IntIntMap intIntMap = this_$iv$iv$iv;
        int lastIndex$iv$iv$iv = m$iv$iv$iv.length - 2;
        int i$iv$iv$iv = 0;
        if (0 <= lastIndex$iv$iv$iv) {
            loop0:
            while (true) {
                long slot$iv$iv$iv = m$iv$iv$iv[i$iv$iv$iv];
                int i2 = i;
                int index$iv2 = index$iv;
                long $this$maskEmptyOrDeleted$iv$iv$iv$iv = slot$iv$iv$iv;
                IntIntMap this_$iv$iv2 = this_$iv$iv;
                int $i$f$forEach2 = $i$f$forEach;
                if ((((~$this$maskEmptyOrDeleted$iv$iv$iv$iv) << 7) & $this$maskEmptyOrDeleted$iv$iv$iv$iv & -9187201950435737472L) != -9187201950435737472L) {
                    int i3 = 8;
                    int bitCount$iv$iv$iv = 8 - ((~(i$iv$iv$iv - lastIndex$iv$iv$iv)) >>> 31);
                    int j$iv$iv$iv = 0;
                    int index$iv3 = index$iv2;
                    while (j$iv$iv$iv < bitCount$iv$iv$iv) {
                        if ((slot$iv$iv$iv & 255) < 128) {
                            int index$iv$iv = (i$iv$iv$iv << 3) + j$iv$iv$iv;
                            int key$iv = k$iv$iv[index$iv$iv];
                            int value$iv = v$iv$iv[index$iv$iv];
                            if (index$iv3 == -1) {
                                $this$joinToString_u24lambda_u2410$iv.append(truncated$iv);
                                break loop0;
                            }
                            if (index$iv3 != 0) {
                                $this$joinToString_u24lambda_u2410$iv.append(charSequence);
                            }
                            $this$joinToString_u24lambda_u2410$iv.append((CharSequence) function2.invoke(Integer.valueOf(key$iv), Integer.valueOf(value$iv)));
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
        IntIntMap intIntMap2 = this_$iv$iv;
        int i4 = index$iv;
        $this$joinToString_u24lambda_u2410$iv.append(charSequence3);
        String sb22 = sb.toString();
        Intrinsics.checkNotNullExpressionValue(sb22, "StringBuilder().apply(builderAction).toString()");
        return sb22;
    }

    public final String joinToString(CharSequence separator, CharSequence prefix, Function2<? super Integer, ? super Integer, ? extends CharSequence> transform) {
        CharSequence charSequence = separator;
        CharSequence charSequence2 = prefix;
        Function2<? super Integer, ? super Integer, ? extends CharSequence> function2 = transform;
        Intrinsics.checkNotNullParameter(charSequence, "separator");
        Intrinsics.checkNotNullParameter(charSequence2, "prefix");
        Intrinsics.checkNotNullParameter(function2, "transform");
        StringBuilder sb = new StringBuilder();
        StringBuilder $this$joinToString_u24lambda_u2410$iv = sb;
        int i = 0;
        $this$joinToString_u24lambda_u2410$iv.append(charSequence2);
        int index$iv = 0;
        IntIntMap this_$iv$iv = this;
        int $i$f$forEach = 0;
        int[] k$iv$iv = this_$iv$iv.keys;
        int[] v$iv$iv = this_$iv$iv.values;
        IntIntMap this_$iv$iv$iv = this_$iv$iv;
        long[] m$iv$iv$iv = this_$iv$iv$iv.metadata;
        IntIntMap intIntMap = this_$iv$iv$iv;
        int lastIndex$iv$iv$iv = m$iv$iv$iv.length - 2;
        int i$iv$iv$iv = 0;
        if (0 <= lastIndex$iv$iv$iv) {
            loop0:
            while (true) {
                long slot$iv$iv$iv = m$iv$iv$iv[i$iv$iv$iv];
                int i2 = i;
                int index$iv2 = index$iv;
                long $this$maskEmptyOrDeleted$iv$iv$iv$iv = slot$iv$iv$iv;
                IntIntMap this_$iv$iv2 = this_$iv$iv;
                int $i$f$forEach2 = $i$f$forEach;
                if ((((~$this$maskEmptyOrDeleted$iv$iv$iv$iv) << 7) & $this$maskEmptyOrDeleted$iv$iv$iv$iv & -9187201950435737472L) != -9187201950435737472L) {
                    int i3 = 8;
                    int bitCount$iv$iv$iv = 8 - ((~(i$iv$iv$iv - lastIndex$iv$iv$iv)) >>> 31);
                    int j$iv$iv$iv = 0;
                    int index$iv3 = index$iv2;
                    while (j$iv$iv$iv < bitCount$iv$iv$iv) {
                        if ((slot$iv$iv$iv & 255) < 128) {
                            int index$iv$iv = (i$iv$iv$iv << 3) + j$iv$iv$iv;
                            int key$iv = k$iv$iv[index$iv$iv];
                            int value$iv = v$iv$iv[index$iv$iv];
                            if (index$iv3 == -1) {
                                $this$joinToString_u24lambda_u2410$iv.append(truncated$iv);
                                break loop0;
                            }
                            if (index$iv3 != 0) {
                                $this$joinToString_u24lambda_u2410$iv.append(charSequence);
                            }
                            $this$joinToString_u24lambda_u2410$iv.append((CharSequence) function2.invoke(Integer.valueOf(key$iv), Integer.valueOf(value$iv)));
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
        IntIntMap intIntMap2 = this_$iv$iv;
        int i4 = index$iv;
        $this$joinToString_u24lambda_u2410$iv.append(postfix$iv);
        String sb22 = sb.toString();
        Intrinsics.checkNotNullExpressionValue(sb22, "StringBuilder().apply(builderAction).toString()");
        return sb22;
    }

    public final String joinToString(CharSequence separator, Function2<? super Integer, ? super Integer, ? extends CharSequence> transform) {
        CharSequence charSequence = separator;
        Function2<? super Integer, ? super Integer, ? extends CharSequence> function2 = transform;
        Intrinsics.checkNotNullParameter(charSequence, "separator");
        Intrinsics.checkNotNullParameter(function2, "transform");
        CharSequence prefix$iv = "";
        StringBuilder sb = new StringBuilder();
        StringBuilder $this$joinToString_u24lambda_u2410$iv = sb;
        int i = 0;
        $this$joinToString_u24lambda_u2410$iv.append(prefix$iv);
        int index$iv = 0;
        IntIntMap this_$iv$iv = this;
        int $i$f$forEach = 0;
        int[] k$iv$iv = this_$iv$iv.keys;
        int[] v$iv$iv = this_$iv$iv.values;
        IntIntMap this_$iv$iv$iv = this_$iv$iv;
        CharSequence charSequence2 = prefix$iv;
        long[] m$iv$iv$iv = this_$iv$iv$iv.metadata;
        IntIntMap intIntMap = this_$iv$iv$iv;
        int lastIndex$iv$iv$iv = m$iv$iv$iv.length - 2;
        int i$iv$iv$iv = 0;
        if (0 <= lastIndex$iv$iv$iv) {
            loop0:
            while (true) {
                long slot$iv$iv$iv = m$iv$iv$iv[i$iv$iv$iv];
                int i2 = i;
                int index$iv2 = index$iv;
                long $this$maskEmptyOrDeleted$iv$iv$iv$iv = slot$iv$iv$iv;
                IntIntMap this_$iv$iv2 = this_$iv$iv;
                int $i$f$forEach2 = $i$f$forEach;
                if ((((~$this$maskEmptyOrDeleted$iv$iv$iv$iv) << 7) & $this$maskEmptyOrDeleted$iv$iv$iv$iv & -9187201950435737472L) != -9187201950435737472L) {
                    int i3 = 8;
                    int bitCount$iv$iv$iv = 8 - ((~(i$iv$iv$iv - lastIndex$iv$iv$iv)) >>> 31);
                    int j$iv$iv$iv = 0;
                    int index$iv3 = index$iv2;
                    while (j$iv$iv$iv < bitCount$iv$iv$iv) {
                        if ((slot$iv$iv$iv & 255) < 128) {
                            int index$iv$iv = (i$iv$iv$iv << 3) + j$iv$iv$iv;
                            int key$iv = k$iv$iv[index$iv$iv];
                            int value$iv = v$iv$iv[index$iv$iv];
                            if (index$iv3 == -1) {
                                $this$joinToString_u24lambda_u2410$iv.append(truncated$iv);
                                break loop0;
                            }
                            if (index$iv3 != 0) {
                                $this$joinToString_u24lambda_u2410$iv.append(charSequence);
                            }
                            $this$joinToString_u24lambda_u2410$iv.append((CharSequence) function2.invoke(Integer.valueOf(key$iv), Integer.valueOf(value$iv)));
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
        IntIntMap intIntMap2 = this_$iv$iv;
        int i4 = index$iv;
        $this$joinToString_u24lambda_u2410$iv.append(postfix$iv);
        String sb22 = sb.toString();
        Intrinsics.checkNotNullExpressionValue(sb22, "StringBuilder().apply(builderAction).toString()");
        return sb22;
    }

    public final String joinToString(Function2<? super Integer, ? super Integer, ? extends CharSequence> transform) {
        CharSequence separator$iv;
        CharSequence separator$iv2;
        Function2<? super Integer, ? super Integer, ? extends CharSequence> function2 = transform;
        Intrinsics.checkNotNullParameter(function2, "transform");
        CharSequence prefix$iv = "";
        StringBuilder sb = new StringBuilder();
        StringBuilder $this$joinToString_u24lambda_u2410$iv = sb;
        int i = 0;
        $this$joinToString_u24lambda_u2410$iv.append(prefix$iv);
        int index$iv = 0;
        IntIntMap this_$iv$iv = this;
        int $i$f$forEach = 0;
        int[] k$iv$iv = this_$iv$iv.keys;
        int[] v$iv$iv = this_$iv$iv.values;
        IntIntMap this_$iv$iv$iv = this_$iv$iv;
        CharSequence charSequence = prefix$iv;
        long[] m$iv$iv$iv = this_$iv$iv$iv.metadata;
        IntIntMap intIntMap = this_$iv$iv$iv;
        int lastIndex$iv$iv$iv = m$iv$iv$iv.length - 2;
        int i$iv$iv$iv = 0;
        if (0 <= lastIndex$iv$iv$iv) {
            loop0:
            while (true) {
                long slot$iv$iv$iv = m$iv$iv$iv[i$iv$iv$iv];
                int i2 = i;
                int index$iv2 = index$iv;
                long $this$maskEmptyOrDeleted$iv$iv$iv$iv = slot$iv$iv$iv;
                IntIntMap this_$iv$iv2 = this_$iv$iv;
                int $i$f$forEach2 = $i$f$forEach;
                if ((((~$this$maskEmptyOrDeleted$iv$iv$iv$iv) << 7) & $this$maskEmptyOrDeleted$iv$iv$iv$iv & -9187201950435737472L) != -9187201950435737472L) {
                    int i3 = 8;
                    int bitCount$iv$iv$iv = 8 - ((~(i$iv$iv$iv - lastIndex$iv$iv$iv)) >>> 31);
                    int j$iv$iv$iv = 0;
                    int index$iv3 = index$iv2;
                    while (j$iv$iv$iv < bitCount$iv$iv$iv) {
                        if ((slot$iv$iv$iv & 255) < 128) {
                            int index$iv$iv = (i$iv$iv$iv << 3) + j$iv$iv$iv;
                            int key$iv = k$iv$iv[index$iv$iv];
                            int value$iv = v$iv$iv[index$iv$iv];
                            if (index$iv3 == -1) {
                                $this$joinToString_u24lambda_u2410$iv.append(truncated$iv);
                                CharSequence charSequence2 = separator$iv;
                                break loop0;
                            }
                            if (index$iv3 != 0) {
                                $this$joinToString_u24lambda_u2410$iv.append(separator$iv);
                            }
                            separator$iv2 = separator$iv;
                            $this$joinToString_u24lambda_u2410$iv.append((CharSequence) function2.invoke(Integer.valueOf(key$iv), Integer.valueOf(value$iv)));
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
        IntIntMap intIntMap2 = this_$iv$iv;
        int i4 = index$iv;
        $this$joinToString_u24lambda_u2410$iv.append(postfix$iv);
        String sb22 = sb.toString();
        Intrinsics.checkNotNullExpressionValue(sb22, "StringBuilder().apply(builderAction).toString()");
        return sb22;
    }
}
