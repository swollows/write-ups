package androidx.collection;

import androidx.collection.internal.ContainerHelpersKt;
import java.util.NoSuchElementException;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

@Metadata(d1 = {"\u0000j\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0007\n\u0002\u0010\u0011\n\u0002\b\u0003\n\u0002\u0010\u0016\n\u0002\b\u0006\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\t\n\u0002\b\r\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\r\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0000\b6\u0018\u0000*\u0004\b\u0000\u0010\u00012\u00020\u0002B\u0007\b\u0004¢\u0006\u0002\u0010\u0003J&\u0010\u0017\u001a\u00020\u00182\u0018\u0010\u0019\u001a\u0014\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00020\u001b\u0012\u0004\u0012\u00020\u00180\u001aH\bø\u0001\u0000J\u0006\u0010\u001c\u001a\u00020\u0018J&\u0010\u001c\u001a\u00020\u00182\u0018\u0010\u0019\u001a\u0014\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00020\u001b\u0012\u0004\u0012\u00020\u00180\u001aH\bø\u0001\u0000J\u0016\u0010\u001d\u001a\u00020\u00182\u0006\u0010\u001e\u001a\u00028\u0000H\u0002¢\u0006\u0002\u0010\u001fJ\u0013\u0010 \u001a\u00020\u00182\u0006\u0010\u001e\u001a\u00028\u0000¢\u0006\u0002\u0010\u001fJ\u000e\u0010!\u001a\u00020\u00182\u0006\u0010\"\u001a\u00020\u001bJ\u0006\u0010#\u001a\u00020\u0005J&\u0010#\u001a\u00020\u00052\u0018\u0010\u0019\u001a\u0014\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00020\u001b\u0012\u0004\u0012\u00020\u00180\u001aH\bø\u0001\u0000J\u0013\u0010$\u001a\u00020\u00182\b\u0010%\u001a\u0004\u0018\u00010\u0002H\u0002J\u0015\u0010&\u001a\u00020\u00052\u0006\u0010\u001e\u001a\u00028\u0000H\u0001¢\u0006\u0002\u0010'JD\u0010(\u001a\u00020)26\u0010*\u001a2\u0012\u0013\u0012\u00118\u0000¢\u0006\f\b+\u0012\b\b,\u0012\u0004\b\b(\u001e\u0012\u0013\u0012\u00110\u001b¢\u0006\f\b+\u0012\b\b,\u0012\u0004\b\b(\"\u0012\u0004\u0012\u00020)0\u001aH\bø\u0001\u0000J/\u0010-\u001a\u00020)2!\u0010*\u001a\u001d\u0012\u0013\u0012\u00110\u0005¢\u0006\f\b+\u0012\b\b,\u0012\u0004\b\b(/\u0012\u0004\u0012\u00020)0.H\bø\u0001\u0000J/\u00100\u001a\u00020)2!\u0010*\u001a\u001d\u0012\u0013\u0012\u00118\u0000¢\u0006\f\b+\u0012\b\b,\u0012\u0004\b\b(\u001e\u0012\u0004\u0012\u00020)0.H\bø\u0001\u0000J/\u00101\u001a\u00020)2!\u0010*\u001a\u001d\u0012\u0013\u0012\u00110\u001b¢\u0006\f\b+\u0012\b\b,\u0012\u0004\b\b(\"\u0012\u0004\u0012\u00020)0.H\bø\u0001\u0000J\u0016\u00102\u001a\u00020\u001b2\u0006\u0010\u001e\u001a\u00028\u0000H\u0002¢\u0006\u0002\u00103J\u001b\u00104\u001a\u00020\u001b2\u0006\u0010\u001e\u001a\u00028\u00002\u0006\u00105\u001a\u00020\u001b¢\u0006\u0002\u00106J'\u00107\u001a\u00020\u001b2\u0006\u0010\u001e\u001a\u00028\u00002\f\u00105\u001a\b\u0012\u0004\u0012\u00020\u001b08H\bø\u0001\u0000¢\u0006\u0002\u00109J\b\u0010:\u001a\u00020\u0005H\u0016J\u0006\u0010;\u001a\u00020\u0018J\u0006\u0010<\u001a\u00020\u0018J:\u0010=\u001a\u00020>2\b\b\u0002\u0010?\u001a\u00020@2\b\b\u0002\u0010A\u001a\u00020@2\b\b\u0002\u0010B\u001a\u00020@2\b\b\u0002\u0010C\u001a\u00020\u00052\b\b\u0002\u0010D\u001a\u00020@H\u0007Jx\u0010=\u001a\u00020>2\b\b\u0002\u0010?\u001a\u00020@2\b\b\u0002\u0010A\u001a\u00020@2\b\b\u0002\u0010B\u001a\u00020@2\b\b\u0002\u0010C\u001a\u00020\u00052\b\b\u0002\u0010D\u001a\u00020@28\b\u0004\u0010E\u001a2\u0012\u0013\u0012\u00118\u0000¢\u0006\f\b+\u0012\b\b,\u0012\u0004\b\b(\u001e\u0012\u0013\u0012\u00110\u001b¢\u0006\f\b+\u0012\b\b,\u0012\u0004\b\b(\"\u0012\u0004\u0012\u00020@0\u001aH\bø\u0001\u0000J\u0006\u0010F\u001a\u00020\u0018J\b\u0010G\u001a\u00020>H\u0016R\u0018\u0010\u0004\u001a\u00020\u00058\u0000@\u0000X\u000e¢\u0006\b\n\u0000\u0012\u0004\b\u0006\u0010\u0003R\u0018\u0010\u0007\u001a\u00020\u00058\u0000@\u0000X\u000e¢\u0006\b\n\u0000\u0012\u0004\b\b\u0010\u0003R\u0011\u0010\t\u001a\u00020\u00058F¢\u0006\u0006\u001a\u0004\b\n\u0010\u000bR\"\u0010\f\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00020\r8\u0000@\u0000X\u000e¢\u0006\n\n\u0002\u0010\u000f\u0012\u0004\b\u000e\u0010\u0003R\u0018\u0010\u0010\u001a\u00020\u00118\u0000@\u0000X\u000e¢\u0006\b\n\u0000\u0012\u0004\b\u0012\u0010\u0003R\u0011\u0010\u0013\u001a\u00020\u00058F¢\u0006\u0006\u001a\u0004\b\u0014\u0010\u000bR\u0018\u0010\u0015\u001a\u00020\u00118\u0000@\u0000X\u000e¢\u0006\b\n\u0000\u0012\u0004\b\u0016\u0010\u0003\u0001\u0001H\u0002\u0007\n\u0005\b20\u0001¨\u0006I"}, d2 = {"Landroidx/collection/ObjectLongMap;", "K", "", "()V", "_capacity", "", "get_capacity$collection$annotations", "_size", "get_size$collection$annotations", "capacity", "getCapacity", "()I", "keys", "", "getKeys$annotations", "[Ljava/lang/Object;", "metadata", "", "getMetadata$annotations", "size", "getSize", "values", "getValues$annotations", "all", "", "predicate", "Lkotlin/Function2;", "", "any", "contains", "key", "(Ljava/lang/Object;)Z", "containsKey", "containsValue", "value", "count", "equals", "other", "findKeyIndex", "(Ljava/lang/Object;)I", "forEach", "", "block", "Lkotlin/ParameterName;", "name", "forEachIndexed", "Lkotlin/Function1;", "index", "forEachKey", "forEachValue", "get", "(Ljava/lang/Object;)J", "getOrDefault", "defaultValue", "(Ljava/lang/Object;J)J", "getOrElse", "Lkotlin/Function0;", "(Ljava/lang/Object;Lkotlin/jvm/functions/Function0;)J", "hashCode", "isEmpty", "isNotEmpty", "joinToString", "", "separator", "", "prefix", "postfix", "limit", "truncated", "transform", "none", "toString", "Landroidx/collection/MutableObjectLongMap;", "collection"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* compiled from: ObjectLongMap.kt */
public abstract class ObjectLongMap<K> {
    public int _capacity;
    public int _size;
    public Object[] keys;
    public long[] metadata;
    public long[] values;

    public /* synthetic */ ObjectLongMap(DefaultConstructorMarker defaultConstructorMarker) {
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

    private ObjectLongMap() {
        this.metadata = ScatterMapKt.EmptyGroup;
        this.keys = ContainerHelpersKt.EMPTY_OBJECTS;
        this.values = LongSetKt.getEmptyLongArray();
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

    public final long get(K key) {
        int index = findKeyIndex(key);
        if (index >= 0) {
            return this.values[index];
        }
        throw new NoSuchElementException("There is no key " + key + " in the map");
    }

    public final long getOrDefault(K key, long defaultValue) {
        int index = findKeyIndex(key);
        if (index >= 0) {
            return this.values[index];
        }
        return defaultValue;
    }

    public final long getOrElse(K key, Function0<Long> defaultValue) {
        Intrinsics.checkNotNullParameter(defaultValue, "defaultValue");
        int index = findKeyIndex(key);
        if (index >= 0) {
            return this.values[index];
        }
        return defaultValue.invoke().longValue();
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

    public final void forEach(Function2<? super K, ? super Long, Unit> block) {
        Function2<? super K, ? super Long, Unit> function2 = block;
        Intrinsics.checkNotNullParameter(function2, "block");
        Object[] k = this.keys;
        long[] v = this.values;
        ObjectLongMap this_$iv = this;
        int $i$f$forEachIndexed = 0;
        long[] m$iv = this_$iv.metadata;
        int lastIndex$iv = m$iv.length - 2;
        int i$iv = 0;
        if (0 <= lastIndex$iv) {
            while (true) {
                long slot$iv = m$iv[i$iv];
                long $this$maskEmptyOrDeleted$iv$iv = slot$iv;
                ObjectLongMap this_$iv2 = this_$iv;
                int $i$f$forEachIndexed2 = $i$f$forEachIndexed;
                if ((((~$this$maskEmptyOrDeleted$iv$iv) << 7) & $this$maskEmptyOrDeleted$iv$iv & -9187201950435737472L) != -9187201950435737472L) {
                    int i = 8;
                    int bitCount$iv = 8 - ((~(i$iv - lastIndex$iv)) >>> 31);
                    int j$iv = 0;
                    while (j$iv < bitCount$iv) {
                        if ((255 & slot$iv) < 128) {
                            int index = (i$iv << 3) + j$iv;
                            function2.invoke(k[index], Long.valueOf(v[index]));
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

    public final void forEachValue(Function1<? super Long, Unit> block) {
        Function1<? super Long, Unit> function1 = block;
        Intrinsics.checkNotNullParameter(function1, "block");
        long[] v = this.values;
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
                            function1.invoke(Long.valueOf(v[(i$iv << 3) + j$iv]));
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

    public final boolean all(Function2<? super K, ? super Long, Boolean> predicate) {
        int $i$f$all;
        int $i$f$all2;
        Function2<? super K, ? super Long, Boolean> function2 = predicate;
        Intrinsics.checkNotNullParameter(function2, "predicate");
        int $i$f$all3 = 0;
        Object[] k$iv = this.keys;
        long[] v$iv = this.values;
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
                        if (!function2.invoke(k$iv[index$iv], Long.valueOf(v$iv[index$iv])).booleanValue()) {
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

    public final boolean any(Function2<? super K, ? super Long, Boolean> predicate) {
        int $i$f$any;
        int $i$f$any2;
        Function2<? super K, ? super Long, Boolean> function2 = predicate;
        Intrinsics.checkNotNullParameter(function2, "predicate");
        int $i$f$any3 = 0;
        Object[] k$iv = this.keys;
        long[] v$iv = this.values;
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
                        if (function2.invoke(k$iv[index$iv], Long.valueOf(v$iv[index$iv])).booleanValue()) {
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

    public final int count(Function2<? super K, ? super Long, Boolean> predicate) {
        ObjectLongMap this_$iv;
        ObjectLongMap this_$iv2;
        Function2<? super K, ? super Long, Boolean> function2 = predicate;
        Intrinsics.checkNotNullParameter(function2, "predicate");
        int $i$f$count = 0;
        int count = 0;
        ObjectLongMap this_$iv3 = this;
        Object[] k$iv = this_$iv3.keys;
        long[] v$iv = this_$iv3.values;
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
                            if (function2.invoke(k$iv[index$iv], Long.valueOf(v$iv[index$iv])).booleanValue()) {
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
            ObjectLongMap objectLongMap = this_$iv3;
        }
        return count;
    }

    public final boolean contains(K key) {
        return findKeyIndex(key) >= 0;
    }

    public final boolean containsKey(K key) {
        return findKeyIndex(key) >= 0;
    }

    public final boolean containsValue(long value) {
        long[] v$iv = this.values;
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
                        if (((255 & slot$iv$iv) < 128) && value == v$iv[(i$iv$iv << 3) + j$iv$iv]) {
                            return true;
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
        return false;
    }

    public static /* synthetic */ String joinToString$default(ObjectLongMap objectLongMap, CharSequence charSequence, CharSequence charSequence2, CharSequence charSequence3, int i, CharSequence charSequence4, int i2, Object obj) {
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
            return objectLongMap.joinToString(charSequence, str, str2, i3, charSequence5);
        }
        throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: joinToString");
    }

    public final String joinToString(CharSequence separator, CharSequence prefix, CharSequence postfix, int limit, CharSequence truncated) {
        Object[] k$iv;
        int $i$f$forEachIndexed;
        ObjectLongMap this_$iv$iv;
        Object[] k$iv2;
        int $i$f$forEachIndexed2;
        ObjectLongMap this_$iv$iv2;
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
        ObjectLongMap this_$iv = this;
        int $i$f$forEach = 0;
        Object[] k$iv3 = this_$iv.keys;
        long[] v$iv = this_$iv.values;
        ObjectLongMap this_$iv$iv3 = this_$iv;
        int $i$f$forEachIndexed3 = 0;
        long[] m$iv$iv = this_$iv$iv3.metadata;
        int lastIndex$iv$iv = m$iv$iv.length - 2;
        int i$iv$iv = 0;
        if (0 <= lastIndex$iv$iv) {
            loop0:
            while (true) {
                long slot$iv$iv = m$iv$iv[i$iv$iv];
                int i2 = i;
                int index2 = index;
                long $this$maskEmptyOrDeleted$iv$iv$iv = slot$iv$iv;
                ObjectLongMap this_$iv2 = this_$iv;
                int $i$f$forEach2 = $i$f$forEach;
                if ((((~$this$maskEmptyOrDeleted$iv$iv$iv) << 7) & $this$maskEmptyOrDeleted$iv$iv$iv & -9187201950435737472L) != -9187201950435737472L) {
                    int i3 = 8;
                    int bitCount$iv$iv = 8 - ((~(i$iv$iv - lastIndex$iv$iv)) >>> 31);
                    int j$iv$iv = 0;
                    int index3 = index2;
                    while (j$iv$iv < bitCount$iv$iv) {
                        if ((slot$iv$iv & 255) < 128) {
                            int index$iv = (i$iv$iv << 3) + j$iv$iv;
                            Object key = k$iv3[index$iv];
                            this_$iv$iv2 = this_$iv$iv3;
                            $i$f$forEachIndexed2 = $i$f$forEachIndexed3;
                            long value = v$iv[index$iv];
                            k$iv2 = k$iv3;
                            if (index3 == limit) {
                                $this$joinToString_u24lambda_u248.append(charSequence4);
                                break loop0;
                            }
                            if (index3 != 0) {
                                $this$joinToString_u24lambda_u248.append(charSequence);
                            }
                            $this$joinToString_u24lambda_u248.append(key);
                            $this$joinToString_u24lambda_u248.append('=');
                            $this$joinToString_u24lambda_u248.append(value);
                            index3++;
                        } else {
                            k$iv2 = k$iv3;
                            this_$iv$iv2 = this_$iv$iv3;
                            $i$f$forEachIndexed2 = $i$f$forEachIndexed3;
                            int i4 = limit;
                        }
                        slot$iv$iv >>= 8;
                        j$iv$iv++;
                        i3 = 8;
                        this_$iv$iv3 = this_$iv$iv2;
                        $i$f$forEachIndexed3 = $i$f$forEachIndexed2;
                        k$iv3 = k$iv2;
                        charSequence = separator;
                    }
                    k$iv = k$iv3;
                    this_$iv$iv = this_$iv$iv3;
                    $i$f$forEachIndexed = $i$f$forEachIndexed3;
                    int i5 = limit;
                    if (bitCount$iv$iv != i3) {
                        break;
                    }
                    index = index3;
                } else {
                    k$iv = k$iv3;
                    this_$iv$iv = this_$iv$iv3;
                    $i$f$forEachIndexed = $i$f$forEachIndexed3;
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
                this_$iv$iv3 = this_$iv$iv;
                $i$f$forEachIndexed3 = $i$f$forEachIndexed;
                k$iv3 = k$iv;
            }
        } else {
            ObjectLongMap objectLongMap = this_$iv;
            Object[] objArr = k$iv3;
            ObjectLongMap objectLongMap2 = this_$iv$iv3;
            int i7 = limit;
        }
        int i8 = index;
        $this$joinToString_u24lambda_u248.append(charSequence3);
        String sb2 = sb.toString();
        Intrinsics.checkNotNullExpressionValue(sb2, "StringBuilder().apply(builderAction).toString()");
        return sb2;
    }

    public static /* synthetic */ String joinToString$default(ObjectLongMap $this, CharSequence separator, CharSequence prefix, CharSequence postfix, int limit, CharSequence truncated, Function2 transform, int i, Object obj) {
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
            ObjectLongMap this_$iv = $this;
            Object[] k$iv = this_$iv.keys;
            long[] v$iv = this_$iv.values;
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
                    ObjectLongMap this_$iv2 = this_$iv;
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
                                Object key = k$iv[index$iv];
                                long value = v$iv[index$iv];
                                Object key2 = key;
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
                                $this$joinToString_u24lambda_u2410.append((CharSequence) function2.invoke(key2, Long.valueOf(value)));
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
            ObjectLongMap objectLongMap = this_$iv;
            int i3 = index;
            $this$joinToString_u24lambda_u2410.append(postfix2);
            String sb22 = sb.toString();
            Intrinsics.checkNotNullExpressionValue(sb22, "StringBuilder().apply(builderAction).toString()");
            return sb22;
        }
        throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: joinToString");
    }

    public final String joinToString(CharSequence separator, CharSequence prefix, CharSequence postfix, int limit, CharSequence truncated, Function2<? super K, ? super Long, ? extends CharSequence> transform) {
        long[] m$iv$iv;
        long[] m$iv$iv2;
        CharSequence charSequence = separator;
        CharSequence charSequence2 = prefix;
        CharSequence charSequence3 = postfix;
        CharSequence charSequence4 = truncated;
        Function2<? super K, ? super Long, ? extends CharSequence> function2 = transform;
        Intrinsics.checkNotNullParameter(charSequence, "separator");
        Intrinsics.checkNotNullParameter(charSequence2, "prefix");
        Intrinsics.checkNotNullParameter(charSequence3, "postfix");
        Intrinsics.checkNotNullParameter(charSequence4, "truncated");
        Intrinsics.checkNotNullParameter(function2, "transform");
        StringBuilder sb = new StringBuilder();
        StringBuilder $this$joinToString_u24lambda_u2410 = sb;
        $this$joinToString_u24lambda_u2410.append(charSequence2);
        int bitCount$iv$iv = 0;
        ObjectLongMap this_$iv = this;
        Object[] k$iv = this_$iv.keys;
        long[] v$iv = this_$iv.values;
        ObjectLongMap this_$iv$iv = this_$iv;
        int $i$f$forEachIndexed = 0;
        long[] m$iv$iv3 = this_$iv$iv.metadata;
        int lastIndex$iv$iv = m$iv$iv3.length - 2;
        int i$iv$iv = 0;
        if (0 <= lastIndex$iv$iv) {
            loop0:
            while (true) {
                long slot$iv$iv = m$iv$iv3[i$iv$iv];
                int index = bitCount$iv$iv;
                ObjectLongMap this_$iv2 = this_$iv;
                long $this$maskEmptyOrDeleted$iv$iv$iv = slot$iv$iv;
                ObjectLongMap this_$iv$iv2 = this_$iv$iv;
                int $i$f$forEachIndexed2 = $i$f$forEachIndexed;
                if ((((~$this$maskEmptyOrDeleted$iv$iv$iv) << 7) & $this$maskEmptyOrDeleted$iv$iv$iv & -9187201950435737472L) != -9187201950435737472L) {
                    int i = 8;
                    int bitCount$iv$iv2 = 8 - ((~(i$iv$iv - lastIndex$iv$iv)) >>> 31);
                    int j$iv$iv = 0;
                    int index2 = index;
                    while (j$iv$iv < bitCount$iv$iv2) {
                        if ((slot$iv$iv & 255) < 128) {
                            int index$iv = (i$iv$iv << 3) + j$iv$iv;
                            Object key = k$iv[index$iv];
                            long value = v$iv[index$iv];
                            Object key2 = key;
                            if (index2 == limit) {
                                $this$joinToString_u24lambda_u2410.append(charSequence4);
                                break loop0;
                            }
                            if (index2 != 0) {
                                $this$joinToString_u24lambda_u2410.append(charSequence);
                            }
                            m$iv$iv2 = m$iv$iv3;
                            $this$joinToString_u24lambda_u2410.append((CharSequence) function2.invoke(key2, Long.valueOf(value)));
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
            ObjectLongMap objectLongMap = this_$iv;
            ObjectLongMap objectLongMap2 = this_$iv$iv;
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
        ObjectLongMap this_$iv = this;
        Object[] k$iv = this_$iv.keys;
        long[] v$iv = this_$iv.values;
        long[] m$iv$iv = this_$iv.metadata;
        int lastIndex$iv$iv = m$iv$iv.length - 2;
        int i$iv$iv = 0;
        if (0 <= lastIndex$iv$iv) {
            while (true) {
                long slot$iv$iv = m$iv$iv[i$iv$iv];
                long $this$maskEmptyOrDeleted$iv$iv$iv = slot$iv$iv;
                int hash = bitCount$iv$iv;
                ObjectLongMap this_$iv2 = this_$iv;
                if ((((~$this$maskEmptyOrDeleted$iv$iv$iv) << 7) & $this$maskEmptyOrDeleted$iv$iv$iv & -9187201950435737472L) != -9187201950435737472L) {
                    int bitCount$iv$iv2 = 8 - ((~(i$iv$iv - lastIndex$iv$iv)) >>> 31);
                    for (int j$iv$iv = 0; j$iv$iv < bitCount$iv$iv2; j$iv$iv++) {
                        int i = 0;
                        if ((255 & slot$iv$iv) < 128) {
                            int index$iv = (i$iv$iv << 3) + j$iv$iv;
                            Object key = k$iv[index$iv];
                            long value = v$iv[index$iv];
                            if (key != null) {
                                i = key.hashCode();
                            }
                            hash += i ^ Long.hashCode(value);
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
        Object obj = other;
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof ObjectLongMap) || ((ObjectLongMap) obj).getSize() != getSize()) {
            return false;
        }
        ObjectLongMap o = (ObjectLongMap) obj;
        ObjectLongMap this_$iv = this;
        Object[] k$iv = this_$iv.keys;
        long[] v$iv = this_$iv.values;
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
                    for (int j$iv$iv = 0; j$iv$iv < bitCount$iv$iv; j$iv$iv++) {
                        if (((slot$iv$iv & 255) < 128 ? 1 : 0) != 0) {
                            int index$iv = (i$iv$iv << 3) + j$iv$iv;
                            if (v$iv[index$iv] != o.get(k$iv[index$iv])) {
                                return false;
                            }
                        }
                        i = 8;
                        slot$iv$iv >>= 8;
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
                boolean z2 = z;
                this_$iv = this_$iv2;
            }
        } else {
            return true;
        }
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r5v0, resolved type: java.lang.Object} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r23v1, resolved type: androidx.collection.ObjectLongMap[]} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r5v2, resolved type: java.lang.Object} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r23v2, resolved type: androidx.collection.ObjectLongMap[]} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r5v3, resolved type: androidx.collection.ObjectLongMap[]} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r23v3, resolved type: androidx.collection.ObjectLongMap[]} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r20v3, resolved type: androidx.collection.ObjectLongMap} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r5v10, resolved type: androidx.collection.ObjectLongMap[]} */
    /* JADX WARNING: Multi-variable type inference failed */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public java.lang.String toString() {
        /*
            r27 = this;
            r0 = r27
            boolean r1 = r27.isEmpty()
            if (r1 == 0) goto L_0x000c
            java.lang.String r1 = "{}"
            return r1
        L_0x000c:
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            r2 = 123(0x7b, float:1.72E-43)
            java.lang.StringBuilder r1 = r1.append(r2)
            r2 = 0
            r3 = r27
            r4 = 0
            java.lang.Object[] r5 = r3.keys
            long[] r6 = r3.values
            r7 = r3
            r8 = 0
            long[] r9 = r7.metadata
            int r10 = r9.length
            int r10 = r10 + -2
            r11 = 0
            if (r11 > r10) goto L_0x00d0
        L_0x0029:
            r12 = r9[r11]
            r14 = r12
            r16 = 0
            r18 = r2
            r17 = r3
            long r2 = ~r14
            r19 = 7
            long r2 = r2 << r19
            long r2 = r2 & r14
            r19 = -9187201950435737472(0x8080808080808080, double:-2.937446524422997E-306)
            long r2 = r2 & r19
            int r2 = (r2 > r19 ? 1 : (r2 == r19 ? 0 : -1))
            if (r2 == 0) goto L_0x00be
            int r2 = r11 - r10
            int r2 = ~r2
            int r2 = r2 >>> 31
            r3 = 8
            int r2 = 8 - r2
            r14 = 0
        L_0x004d:
            if (r14 >= r2) goto L_0x00b5
            r15 = 255(0xff, double:1.26E-321)
            long r15 = r15 & r12
            r19 = 0
            r20 = 128(0x80, double:6.32E-322)
            int r20 = (r15 > r20 ? 1 : (r15 == r20 ? 0 : -1))
            if (r20 >= 0) goto L_0x005d
            r20 = 1
            goto L_0x005f
        L_0x005d:
            r20 = 0
        L_0x005f:
            if (r20 == 0) goto L_0x00a7
            int r15 = r11 << 3
            int r15 = r15 + r14
            r16 = r15
            r19 = 0
            r20 = r5[r16]
            r21 = r4
            r3 = r6[r16]
            r22 = r20
            r20 = 0
            r23 = r5
            r5 = r22
            if (r5 != r0) goto L_0x0081
            java.lang.String r22 = "(this)"
            r26 = r22
            r22 = r5
            r5 = r26
            goto L_0x0083
        L_0x0081:
            r22 = r5
        L_0x0083:
            r1.append(r5)
            java.lang.String r5 = "="
            r1.append(r5)
            r1.append(r3)
            int r5 = r18 + 1
            r24 = r3
            int r3 = r0._size
            if (r5 >= r3) goto L_0x00a1
            r3 = 44
            java.lang.StringBuilder r3 = r1.append(r3)
            r4 = 32
            r3.append(r4)
        L_0x00a1:
            r18 = r5
            goto L_0x00ab
        L_0x00a7:
            r21 = r4
            r23 = r5
        L_0x00ab:
            r3 = 8
            long r12 = r12 >> r3
            int r14 = r14 + 1
            r4 = r21
            r5 = r23
            goto L_0x004d
        L_0x00b5:
            r21 = r4
            r23 = r5
            if (r2 != r3) goto L_0x00d8
            r2 = r18
            goto L_0x00c4
        L_0x00be:
            r21 = r4
            r23 = r5
            r2 = r18
        L_0x00c4:
            if (r11 == r10) goto L_0x00d6
            int r11 = r11 + 1
            r3 = r17
            r4 = r21
            r5 = r23
            goto L_0x0029
        L_0x00d0:
            r17 = r3
            r21 = r4
            r23 = r5
        L_0x00d6:
            r18 = r2
        L_0x00d8:
            r2 = 125(0x7d, float:1.75E-43)
            java.lang.StringBuilder r2 = r1.append(r2)
            java.lang.String r2 = r2.toString()
            java.lang.String r3 = "s.append('}').toString()"
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(r2, r3)
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.collection.ObjectLongMap.toString():java.lang.String");
    }

    /* JADX WARNING: Code restructure failed: missing block: B:15:0x0090, code lost:
        r12 = r3;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:16:0x00a1, code lost:
        if (((((~r12) << 6) & r12) & -9187201950435737472L) == 0) goto L_0x00a6;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:17:0x00a3, code lost:
        return -1;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final int findKeyIndex(K r23) {
        /*
            r22 = this;
            r0 = r22
            r1 = r23
            r2 = 0
            if (r1 == 0) goto L_0x000c
            int r4 = r23.hashCode()
            goto L_0x000d
        L_0x000c:
            r4 = 0
        L_0x000d:
            r5 = -862048943(0xffffffffcc9e2d51, float:-8.2930312E7)
            int r4 = r4 * r5
            int r5 = r4 << 16
            r2 = r4 ^ r5
            r4 = 0
            r4 = r2 & 127(0x7f, float:1.78E-43)
            int r5 = r0._capacity
            r6 = 0
            int r6 = r2 >>> 7
            r6 = r6 & r5
            r7 = 0
        L_0x0021:
            long[] r8 = r0.metadata
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
            r17 = r4
            long r3 = (long) r11
            long r3 = -r3
            r18 = 63
            long r3 = r3 >> r18
            long r3 = r3 & r14
            long r3 = r3 | r12
            r8 = r3
            r10 = 0
            r11 = r17
            long r12 = (long) r11
            r14 = 72340172838076673(0x101010101010101, double:7.748604185489348E-304)
            long r12 = r12 * r14
            long r12 = r12 ^ r8
            long r14 = r12 - r14
            r17 = r8
            long r8 = ~r12
            long r8 = r8 & r14
            r14 = -9187201950435737472(0x8080808080808080, double:-2.937446524422997E-306)
            long r8 = r8 & r14
        L_0x005a:
            r12 = r8
            r10 = 0
            r17 = 0
            int r19 = (r12 > r17 ? 1 : (r12 == r17 ? 0 : -1))
            if (r19 == 0) goto L_0x0065
            r19 = 1
            goto L_0x0067
        L_0x0065:
            r19 = 0
        L_0x0067:
            if (r19 == 0) goto L_0x0090
            r12 = r8
            r10 = 0
            r17 = r12
            r19 = 0
            int r20 = java.lang.Long.numberOfTrailingZeros(r17)
            int r17 = r20 >> 3
            int r17 = r6 + r17
            r10 = r17 & r5
            java.lang.Object[] r12 = r0.keys
            r12 = r12[r10]
            boolean r12 = kotlin.jvm.internal.Intrinsics.areEqual((java.lang.Object) r12, (java.lang.Object) r1)
            if (r12 == 0) goto L_0x0085
            return r10
        L_0x0085:
            r12 = r8
            r17 = 0
            r18 = 1
            long r18 = r12 - r18
            long r12 = r12 & r18
            r8 = r12
            goto L_0x005a
        L_0x0090:
            r12 = r3
            r10 = 0
            long r14 = ~r12
            r21 = 6
            long r14 = r14 << r21
            long r14 = r14 & r12
            r19 = -9187201950435737472(0x8080808080808080, double:-2.937446524422997E-306)
            long r12 = r14 & r19
            int r10 = (r12 > r17 ? 1 : (r12 == r17 ? 0 : -1))
            if (r10 == 0) goto L_0x00a6
            r3 = -1
            return r3
        L_0x00a6:
            int r7 = r7 + 8
            int r10 = r6 + r7
            r6 = r10 & r5
            r4 = r11
            goto L_0x0021
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.collection.ObjectLongMap.findKeyIndex(java.lang.Object):int");
    }

    public final String joinToString(CharSequence separator, CharSequence prefix, CharSequence postfix, int limit, Function2<? super K, ? super Long, ? extends CharSequence> transform) {
        long[] m$iv$iv$iv;
        int index$iv;
        long[] m$iv$iv$iv2;
        CharSequence charSequence = separator;
        CharSequence charSequence2 = prefix;
        CharSequence charSequence3 = postfix;
        Function2<? super K, ? super Long, ? extends CharSequence> function2 = transform;
        Intrinsics.checkNotNullParameter(charSequence, "separator");
        Intrinsics.checkNotNullParameter(charSequence2, "prefix");
        Intrinsics.checkNotNullParameter(charSequence3, "postfix");
        Intrinsics.checkNotNullParameter(function2, "transform");
        StringBuilder sb = new StringBuilder();
        StringBuilder $this$joinToString_u24lambda_u2410$iv = sb;
        int i = 0;
        $this$joinToString_u24lambda_u2410$iv.append(charSequence2);
        int index$iv2 = 0;
        ObjectLongMap this_$iv$iv = this;
        int $i$f$forEach = 0;
        Object[] k$iv$iv = this_$iv$iv.keys;
        long[] v$iv$iv = this_$iv$iv.values;
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
                ObjectLongMap this_$iv$iv2 = this_$iv$iv;
                int $i$f$forEach2 = $i$f$forEach;
                if ((((~$this$maskEmptyOrDeleted$iv$iv$iv$iv) << 7) & $this$maskEmptyOrDeleted$iv$iv$iv$iv & -9187201950435737472L) != -9187201950435737472L) {
                    int i3 = 8;
                    int bitCount$iv$iv$iv = 8 - ((~(i$iv$iv$iv - lastIndex$iv$iv$iv)) >>> 31);
                    int j$iv$iv$iv = 0;
                    index$iv = index$iv3;
                    while (j$iv$iv$iv < bitCount$iv$iv$iv) {
                        if ((slot$iv$iv$iv & 255) < 128) {
                            int index$iv$iv = (i$iv$iv$iv << 3) + j$iv$iv$iv;
                            Object key$iv = k$iv$iv[index$iv$iv];
                            long value$iv = v$iv$iv[index$iv$iv];
                            Object key$iv2 = key$iv;
                            if (index$iv == limit) {
                                $this$joinToString_u24lambda_u2410$iv.append(truncated$iv);
                                break loop0;
                            }
                            if (index$iv != 0) {
                                $this$joinToString_u24lambda_u2410$iv.append(charSequence);
                            }
                            m$iv$iv$iv2 = m$iv$iv$iv3;
                            $this$joinToString_u24lambda_u2410$iv.append((CharSequence) function2.invoke(key$iv2, Long.valueOf(value$iv)));
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
            ObjectLongMap objectLongMap = this_$iv$iv;
            int index$iv4 = limit;
        }
        $this$joinToString_u24lambda_u2410$iv.append(charSequence3);
        String sb2 = sb.toString();
        Intrinsics.checkNotNullExpressionValue(sb2, "StringBuilder().apply(builderAction).toString()");
        return sb2;
    }

    public final String joinToString(CharSequence separator, CharSequence prefix, CharSequence postfix, Function2<? super K, ? super Long, ? extends CharSequence> transform) {
        CharSequence charSequence = separator;
        CharSequence charSequence2 = prefix;
        CharSequence charSequence3 = postfix;
        Function2<? super K, ? super Long, ? extends CharSequence> function2 = transform;
        Intrinsics.checkNotNullParameter(charSequence, "separator");
        Intrinsics.checkNotNullParameter(charSequence2, "prefix");
        Intrinsics.checkNotNullParameter(charSequence3, "postfix");
        Intrinsics.checkNotNullParameter(function2, "transform");
        StringBuilder sb = new StringBuilder();
        StringBuilder $this$joinToString_u24lambda_u2410$iv = sb;
        int i = 0;
        $this$joinToString_u24lambda_u2410$iv.append(charSequence2);
        int index$iv = 0;
        ObjectLongMap this_$iv$iv = this;
        int $i$f$forEach = 0;
        Object[] k$iv$iv = this_$iv$iv.keys;
        long[] v$iv$iv = this_$iv$iv.values;
        ObjectLongMap this_$iv$iv$iv = this_$iv$iv;
        long[] m$iv$iv$iv = this_$iv$iv$iv.metadata;
        ObjectLongMap objectLongMap = this_$iv$iv$iv;
        int lastIndex$iv$iv$iv = m$iv$iv$iv.length - 2;
        int i$iv$iv$iv = 0;
        if (0 <= lastIndex$iv$iv$iv) {
            loop0:
            while (true) {
                long slot$iv$iv$iv = m$iv$iv$iv[i$iv$iv$iv];
                int i2 = i;
                int index$iv2 = index$iv;
                long $this$maskEmptyOrDeleted$iv$iv$iv$iv = slot$iv$iv$iv;
                ObjectLongMap this_$iv$iv2 = this_$iv$iv;
                int $i$f$forEach2 = $i$f$forEach;
                if ((((~$this$maskEmptyOrDeleted$iv$iv$iv$iv) << 7) & $this$maskEmptyOrDeleted$iv$iv$iv$iv & -9187201950435737472L) != -9187201950435737472L) {
                    int i3 = 8;
                    int bitCount$iv$iv$iv = 8 - ((~(i$iv$iv$iv - lastIndex$iv$iv$iv)) >>> 31);
                    int j$iv$iv$iv = 0;
                    int index$iv3 = index$iv2;
                    while (j$iv$iv$iv < bitCount$iv$iv$iv) {
                        if ((slot$iv$iv$iv & 255) < 128) {
                            int index$iv$iv = (i$iv$iv$iv << 3) + j$iv$iv$iv;
                            Object key$iv = k$iv$iv[index$iv$iv];
                            long value$iv = v$iv$iv[index$iv$iv];
                            Object key$iv2 = key$iv;
                            if (index$iv3 == -1) {
                                $this$joinToString_u24lambda_u2410$iv.append(truncated$iv);
                                break loop0;
                            }
                            if (index$iv3 != 0) {
                                $this$joinToString_u24lambda_u2410$iv.append(charSequence);
                            }
                            $this$joinToString_u24lambda_u2410$iv.append((CharSequence) function2.invoke(key$iv2, Long.valueOf(value$iv)));
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
        } else {
            ObjectLongMap objectLongMap2 = this_$iv$iv;
        }
        int i4 = index$iv;
        $this$joinToString_u24lambda_u2410$iv.append(charSequence3);
        String sb2 = sb.toString();
        Intrinsics.checkNotNullExpressionValue(sb2, "StringBuilder().apply(builderAction).toString()");
        return sb2;
    }

    public final String joinToString(CharSequence separator, CharSequence prefix, Function2<? super K, ? super Long, ? extends CharSequence> transform) {
        CharSequence charSequence = separator;
        CharSequence charSequence2 = prefix;
        Function2<? super K, ? super Long, ? extends CharSequence> function2 = transform;
        Intrinsics.checkNotNullParameter(charSequence, "separator");
        Intrinsics.checkNotNullParameter(charSequence2, "prefix");
        Intrinsics.checkNotNullParameter(function2, "transform");
        StringBuilder sb = new StringBuilder();
        StringBuilder $this$joinToString_u24lambda_u2410$iv = sb;
        int i = 0;
        $this$joinToString_u24lambda_u2410$iv.append(charSequence2);
        int index$iv = 0;
        ObjectLongMap this_$iv$iv = this;
        int $i$f$forEach = 0;
        Object[] k$iv$iv = this_$iv$iv.keys;
        long[] v$iv$iv = this_$iv$iv.values;
        ObjectLongMap this_$iv$iv$iv = this_$iv$iv;
        long[] m$iv$iv$iv = this_$iv$iv$iv.metadata;
        ObjectLongMap objectLongMap = this_$iv$iv$iv;
        int lastIndex$iv$iv$iv = m$iv$iv$iv.length - 2;
        int i$iv$iv$iv = 0;
        if (0 <= lastIndex$iv$iv$iv) {
            loop0:
            while (true) {
                long slot$iv$iv$iv = m$iv$iv$iv[i$iv$iv$iv];
                int i2 = i;
                int index$iv2 = index$iv;
                long $this$maskEmptyOrDeleted$iv$iv$iv$iv = slot$iv$iv$iv;
                ObjectLongMap this_$iv$iv2 = this_$iv$iv;
                int $i$f$forEach2 = $i$f$forEach;
                if ((((~$this$maskEmptyOrDeleted$iv$iv$iv$iv) << 7) & $this$maskEmptyOrDeleted$iv$iv$iv$iv & -9187201950435737472L) != -9187201950435737472L) {
                    int i3 = 8;
                    int bitCount$iv$iv$iv = 8 - ((~(i$iv$iv$iv - lastIndex$iv$iv$iv)) >>> 31);
                    int j$iv$iv$iv = 0;
                    int index$iv3 = index$iv2;
                    while (j$iv$iv$iv < bitCount$iv$iv$iv) {
                        if ((slot$iv$iv$iv & 255) < 128) {
                            int index$iv$iv = (i$iv$iv$iv << 3) + j$iv$iv$iv;
                            Object key$iv = k$iv$iv[index$iv$iv];
                            long value$iv = v$iv$iv[index$iv$iv];
                            Object key$iv2 = key$iv;
                            if (index$iv3 == -1) {
                                $this$joinToString_u24lambda_u2410$iv.append(truncated$iv);
                                break loop0;
                            }
                            if (index$iv3 != 0) {
                                $this$joinToString_u24lambda_u2410$iv.append(charSequence);
                            }
                            $this$joinToString_u24lambda_u2410$iv.append((CharSequence) function2.invoke(key$iv2, Long.valueOf(value$iv)));
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
        ObjectLongMap objectLongMap2 = this_$iv$iv;
        int i4 = index$iv;
        $this$joinToString_u24lambda_u2410$iv.append(postfix$iv);
        String sb22 = sb.toString();
        Intrinsics.checkNotNullExpressionValue(sb22, "StringBuilder().apply(builderAction).toString()");
        return sb22;
    }

    public final String joinToString(CharSequence separator, Function2<? super K, ? super Long, ? extends CharSequence> transform) {
        CharSequence charSequence = separator;
        Function2<? super K, ? super Long, ? extends CharSequence> function2 = transform;
        Intrinsics.checkNotNullParameter(charSequence, "separator");
        Intrinsics.checkNotNullParameter(function2, "transform");
        CharSequence prefix$iv = "";
        StringBuilder sb = new StringBuilder();
        StringBuilder $this$joinToString_u24lambda_u2410$iv = sb;
        int i = 0;
        $this$joinToString_u24lambda_u2410$iv.append(prefix$iv);
        int index$iv = 0;
        ObjectLongMap this_$iv$iv = this;
        int $i$f$forEach = 0;
        Object[] k$iv$iv = this_$iv$iv.keys;
        long[] v$iv$iv = this_$iv$iv.values;
        ObjectLongMap this_$iv$iv$iv = this_$iv$iv;
        CharSequence charSequence2 = prefix$iv;
        long[] m$iv$iv$iv = this_$iv$iv$iv.metadata;
        ObjectLongMap objectLongMap = this_$iv$iv$iv;
        int lastIndex$iv$iv$iv = m$iv$iv$iv.length - 2;
        int i$iv$iv$iv = 0;
        if (0 <= lastIndex$iv$iv$iv) {
            loop0:
            while (true) {
                long slot$iv$iv$iv = m$iv$iv$iv[i$iv$iv$iv];
                int i2 = i;
                int index$iv2 = index$iv;
                long $this$maskEmptyOrDeleted$iv$iv$iv$iv = slot$iv$iv$iv;
                ObjectLongMap this_$iv$iv2 = this_$iv$iv;
                int $i$f$forEach2 = $i$f$forEach;
                if ((((~$this$maskEmptyOrDeleted$iv$iv$iv$iv) << 7) & $this$maskEmptyOrDeleted$iv$iv$iv$iv & -9187201950435737472L) != -9187201950435737472L) {
                    int i3 = 8;
                    int bitCount$iv$iv$iv = 8 - ((~(i$iv$iv$iv - lastIndex$iv$iv$iv)) >>> 31);
                    int j$iv$iv$iv = 0;
                    int index$iv3 = index$iv2;
                    while (j$iv$iv$iv < bitCount$iv$iv$iv) {
                        if ((slot$iv$iv$iv & 255) < 128) {
                            int index$iv$iv = (i$iv$iv$iv << 3) + j$iv$iv$iv;
                            Object key$iv = k$iv$iv[index$iv$iv];
                            long value$iv = v$iv$iv[index$iv$iv];
                            Object key$iv2 = key$iv;
                            if (index$iv3 == -1) {
                                $this$joinToString_u24lambda_u2410$iv.append(truncated$iv);
                                break loop0;
                            }
                            if (index$iv3 != 0) {
                                $this$joinToString_u24lambda_u2410$iv.append(charSequence);
                            }
                            $this$joinToString_u24lambda_u2410$iv.append((CharSequence) function2.invoke(key$iv2, Long.valueOf(value$iv)));
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
        ObjectLongMap objectLongMap2 = this_$iv$iv;
        int i4 = index$iv;
        $this$joinToString_u24lambda_u2410$iv.append(postfix$iv);
        String sb22 = sb.toString();
        Intrinsics.checkNotNullExpressionValue(sb22, "StringBuilder().apply(builderAction).toString()");
        return sb22;
    }

    public final String joinToString(Function2<? super K, ? super Long, ? extends CharSequence> transform) {
        CharSequence separator$iv;
        CharSequence separator$iv2;
        Function2<? super K, ? super Long, ? extends CharSequence> function2 = transform;
        Intrinsics.checkNotNullParameter(function2, "transform");
        CharSequence prefix$iv = "";
        StringBuilder sb = new StringBuilder();
        StringBuilder $this$joinToString_u24lambda_u2410$iv = sb;
        int i = 0;
        $this$joinToString_u24lambda_u2410$iv.append(prefix$iv);
        int index$iv = 0;
        ObjectLongMap this_$iv$iv = this;
        int $i$f$forEach = 0;
        Object[] k$iv$iv = this_$iv$iv.keys;
        long[] v$iv$iv = this_$iv$iv.values;
        ObjectLongMap this_$iv$iv$iv = this_$iv$iv;
        CharSequence charSequence = prefix$iv;
        long[] m$iv$iv$iv = this_$iv$iv$iv.metadata;
        ObjectLongMap objectLongMap = this_$iv$iv$iv;
        int lastIndex$iv$iv$iv = m$iv$iv$iv.length - 2;
        int i$iv$iv$iv = 0;
        if (0 <= lastIndex$iv$iv$iv) {
            loop0:
            while (true) {
                long slot$iv$iv$iv = m$iv$iv$iv[i$iv$iv$iv];
                int i2 = i;
                int index$iv2 = index$iv;
                long $this$maskEmptyOrDeleted$iv$iv$iv$iv = slot$iv$iv$iv;
                ObjectLongMap this_$iv$iv2 = this_$iv$iv;
                int $i$f$forEach2 = $i$f$forEach;
                if ((((~$this$maskEmptyOrDeleted$iv$iv$iv$iv) << 7) & $this$maskEmptyOrDeleted$iv$iv$iv$iv & -9187201950435737472L) != -9187201950435737472L) {
                    int i3 = 8;
                    int bitCount$iv$iv$iv = 8 - ((~(i$iv$iv$iv - lastIndex$iv$iv$iv)) >>> 31);
                    int j$iv$iv$iv = 0;
                    int index$iv3 = index$iv2;
                    while (j$iv$iv$iv < bitCount$iv$iv$iv) {
                        if ((slot$iv$iv$iv & 255) < 128) {
                            int index$iv$iv = (i$iv$iv$iv << 3) + j$iv$iv$iv;
                            Object key$iv = k$iv$iv[index$iv$iv];
                            long value$iv = v$iv$iv[index$iv$iv];
                            Object key$iv2 = key$iv;
                            if (index$iv3 == -1) {
                                $this$joinToString_u24lambda_u2410$iv.append(truncated$iv);
                                CharSequence charSequence2 = separator$iv;
                                break loop0;
                            }
                            if (index$iv3 != 0) {
                                $this$joinToString_u24lambda_u2410$iv.append(separator$iv);
                            }
                            separator$iv2 = separator$iv;
                            $this$joinToString_u24lambda_u2410$iv.append((CharSequence) function2.invoke(key$iv2, Long.valueOf(value$iv)));
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
        ObjectLongMap objectLongMap2 = this_$iv$iv;
        int i4 = index$iv;
        $this$joinToString_u24lambda_u2410$iv.append(postfix$iv);
        String sb22 = sb.toString();
        Intrinsics.checkNotNullExpressionValue(sb22, "StringBuilder().apply(builderAction).toString()");
        return sb22;
    }
}
