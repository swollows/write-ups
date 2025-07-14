package androidx.collection;

import java.util.NoSuchElementException;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.ranges.IntRange;
import kotlin.ranges.RangesKt;

@Metadata(d1 = {"\u0000`\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\u0005\n\u0002\u0010\u0015\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0011\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u0002\n\u0002\b\f\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\r\n\u0002\b\n\n\u0002\u0018\u0002\n\u0000\b6\u0018\u00002\u00020\u0001B\u000f\b\u0004\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004J\u0006\u0010\u0014\u001a\u00020\u0015J:\u0010\u0014\u001a\u00020\u00152!\u0010\u0016\u001a\u001d\u0012\u0013\u0012\u00110\u0003¢\u0006\f\b\u0018\u0012\b\b\u0019\u0012\u0004\b\b(\u001a\u0012\u0004\u0012\u00020\u00150\u0017H\bø\u0001\u0000\u0002\b\n\u0006\b\u0001\u0012\u0002\u0010\u0001J\u0011\u0010\u001b\u001a\u00020\u00152\u0006\u0010\u001a\u001a\u00020\u0003H\u0002J\u000e\u0010\u001c\u001a\u00020\u00152\u0006\u0010\u001d\u001a\u00020\u0000J\u0006\u0010\u001e\u001a\u00020\u0003J:\u0010\u001e\u001a\u00020\u00032!\u0010\u0016\u001a\u001d\u0012\u0013\u0012\u00110\u0003¢\u0006\f\b\u0018\u0012\b\b\u0019\u0012\u0004\b\b(\u001a\u0012\u0004\u0012\u00020\u00150\u0017H\bø\u0001\u0000\u0002\b\n\u0006\b\u0001\u0012\u0002\u0010\u0001J\u0010\u0010\u001f\u001a\u00020\u00032\b\b\u0001\u0010 \u001a\u00020\u0003J9\u0010!\u001a\u00020\u00032\b\b\u0001\u0010 \u001a\u00020\u00032!\u0010\"\u001a\u001d\u0012\u0013\u0012\u00110\u0003¢\u0006\f\b\u0018\u0012\b\b\u0019\u0012\u0004\b\b( \u0012\u0004\u0012\u00020\u00030\u0017H\bø\u0001\u0000J\u0013\u0010#\u001a\u00020\u00152\b\u0010$\u001a\u0004\u0018\u00010\u0001H\u0002J\u0006\u0010%\u001a\u00020\u0003J:\u0010%\u001a\u00020\u00032!\u0010\u0016\u001a\u001d\u0012\u0013\u0012\u00110\u0003¢\u0006\f\b\u0018\u0012\b\b\u0019\u0012\u0004\b\b(\u001a\u0012\u0004\u0012\u00020\u00150\u0017H\bø\u0001\u0000\u0002\b\n\u0006\b\u0001\u0012\u0002\u0010\u0001Jb\u0010&\u001a\u0002H'\"\u0004\b\u0000\u0010'2\u0006\u0010(\u001a\u0002H'26\u0010)\u001a2\u0012\u0013\u0012\u0011H'¢\u0006\f\b\u0018\u0012\b\b\u0019\u0012\u0004\b\b(+\u0012\u0013\u0012\u00110\u0003¢\u0006\f\b\u0018\u0012\b\b\u0019\u0012\u0004\b\b(\u001a\u0012\u0004\u0012\u0002H'0*H\bø\u0001\u0000\u0002\b\n\u0006\b\u0001\u0012\u0002\u0010\u0002¢\u0006\u0002\u0010,Jw\u0010-\u001a\u0002H'\"\u0004\b\u0000\u0010'2\u0006\u0010(\u001a\u0002H'2K\u0010)\u001aG\u0012\u0013\u0012\u00110\u0003¢\u0006\f\b\u0018\u0012\b\b\u0019\u0012\u0004\b\b( \u0012\u0013\u0012\u0011H'¢\u0006\f\b\u0018\u0012\b\b\u0019\u0012\u0004\b\b(+\u0012\u0013\u0012\u00110\u0003¢\u0006\f\b\u0018\u0012\b\b\u0019\u0012\u0004\b\b(\u001a\u0012\u0004\u0012\u0002H'0.H\bø\u0001\u0000\u0002\b\n\u0006\b\u0001\u0012\u0002\u0010\u0002¢\u0006\u0002\u0010/Jb\u00100\u001a\u0002H'\"\u0004\b\u0000\u0010'2\u0006\u0010(\u001a\u0002H'26\u0010)\u001a2\u0012\u0013\u0012\u00110\u0003¢\u0006\f\b\u0018\u0012\b\b\u0019\u0012\u0004\b\b(\u001a\u0012\u0013\u0012\u0011H'¢\u0006\f\b\u0018\u0012\b\b\u0019\u0012\u0004\b\b(+\u0012\u0004\u0012\u0002H'0*H\bø\u0001\u0000\u0002\b\n\u0006\b\u0001\u0012\u0002\u0010\u0002¢\u0006\u0002\u0010,Jw\u00101\u001a\u0002H'\"\u0004\b\u0000\u0010'2\u0006\u0010(\u001a\u0002H'2K\u0010)\u001aG\u0012\u0013\u0012\u00110\u0003¢\u0006\f\b\u0018\u0012\b\b\u0019\u0012\u0004\b\b( \u0012\u0013\u0012\u00110\u0003¢\u0006\f\b\u0018\u0012\b\b\u0019\u0012\u0004\b\b(\u001a\u0012\u0013\u0012\u0011H'¢\u0006\f\b\u0018\u0012\b\b\u0019\u0012\u0004\b\b(+\u0012\u0004\u0012\u0002H'0.H\bø\u0001\u0000\u0002\b\n\u0006\b\u0001\u0012\u0002\u0010\u0002¢\u0006\u0002\u0010/J:\u00102\u001a\u0002032!\u00104\u001a\u001d\u0012\u0013\u0012\u00110\u0003¢\u0006\f\b\u0018\u0012\b\b\u0019\u0012\u0004\b\b(\u001a\u0012\u0004\u0012\u0002030\u0017H\bø\u0001\u0000\u0002\b\n\u0006\b\u0001\u0012\u0002\u0010\u0001JO\u00105\u001a\u00020326\u00104\u001a2\u0012\u0013\u0012\u00110\u0003¢\u0006\f\b\u0018\u0012\b\b\u0019\u0012\u0004\b\b( \u0012\u0013\u0012\u00110\u0003¢\u0006\f\b\u0018\u0012\b\b\u0019\u0012\u0004\b\b(\u001a\u0012\u0004\u0012\u0002030*H\bø\u0001\u0000\u0002\b\n\u0006\b\u0001\u0012\u0002\u0010\u0001J:\u00106\u001a\u0002032!\u00104\u001a\u001d\u0012\u0013\u0012\u00110\u0003¢\u0006\f\b\u0018\u0012\b\b\u0019\u0012\u0004\b\b(\u001a\u0012\u0004\u0012\u0002030\u0017H\bø\u0001\u0000\u0002\b\n\u0006\b\u0001\u0012\u0002\u0010\u0001JO\u00107\u001a\u00020326\u00104\u001a2\u0012\u0013\u0012\u00110\u0003¢\u0006\f\b\u0018\u0012\b\b\u0019\u0012\u0004\b\b( \u0012\u0013\u0012\u00110\u0003¢\u0006\f\b\u0018\u0012\b\b\u0019\u0012\u0004\b\b(\u001a\u0012\u0004\u0012\u0002030*H\bø\u0001\u0000\u0002\b\n\u0006\b\u0001\u0012\u0002\u0010\u0001J\u0013\u00108\u001a\u00020\u00032\b\b\u0001\u0010 \u001a\u00020\u0003H\u0002J\b\u00109\u001a\u00020\u0003H\u0016J\u000e\u0010:\u001a\u00020\u00032\u0006\u0010\u001a\u001a\u00020\u0003J:\u0010;\u001a\u00020\u00032!\u0010\u0016\u001a\u001d\u0012\u0013\u0012\u00110\u0003¢\u0006\f\b\u0018\u0012\b\b\u0019\u0012\u0004\b\b(\u001a\u0012\u0004\u0012\u00020\u00150\u0017H\bø\u0001\u0000\u0002\b\n\u0006\b\u0001\u0012\u0002\u0010\u0001J:\u0010<\u001a\u00020\u00032!\u0010\u0016\u001a\u001d\u0012\u0013\u0012\u00110\u0003¢\u0006\f\b\u0018\u0012\b\b\u0019\u0012\u0004\b\b(\u001a\u0012\u0004\u0012\u00020\u00150\u0017H\bø\u0001\u0000\u0002\b\n\u0006\b\u0001\u0012\u0002\u0010\u0001J\u0006\u0010=\u001a\u00020\u0015J\u0006\u0010>\u001a\u00020\u0015J:\u0010?\u001a\u00020@2\b\b\u0002\u0010A\u001a\u00020B2\b\b\u0002\u0010C\u001a\u00020B2\b\b\u0002\u0010D\u001a\u00020B2\b\b\u0002\u0010E\u001a\u00020\u00032\b\b\u0002\u0010F\u001a\u00020BH\u0007JT\u0010?\u001a\u00020@2\b\b\u0002\u0010A\u001a\u00020B2\b\b\u0002\u0010C\u001a\u00020B2\b\b\u0002\u0010D\u001a\u00020B2\b\b\u0002\u0010E\u001a\u00020\u00032\b\b\u0002\u0010F\u001a\u00020B2\u0014\b\u0004\u0010G\u001a\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020B0\u0017H\bø\u0001\u0000J\u0006\u0010H\u001a\u00020\u0003J:\u0010H\u001a\u00020\u00032!\u0010\u0016\u001a\u001d\u0012\u0013\u0012\u00110\u0003¢\u0006\f\b\u0018\u0012\b\b\u0019\u0012\u0004\b\b(\u001a\u0012\u0004\u0012\u00020\u00150\u0017H\bø\u0001\u0000\u0002\b\n\u0006\b\u0001\u0012\u0002\u0010\u0001J\u000e\u0010I\u001a\u00020\u00032\u0006\u0010\u001a\u001a\u00020\u0003J\u0006\u0010J\u001a\u00020\u0015J:\u0010K\u001a\u00020\u00152!\u0010\u0016\u001a\u001d\u0012\u0013\u0012\u00110\u0003¢\u0006\f\b\u0018\u0012\b\b\u0019\u0012\u0004\b\b(\u001a\u0012\u0004\u0012\u00020\u00150\u0017H\bø\u0001\u0000\u0002\b\n\u0006\b\u0001\u0012\u0002\u0010\u0001J\b\u0010L\u001a\u00020@H\u0016R\u0018\u0010\u0005\u001a\u00020\u00038\u0000@\u0000X\u000e¢\u0006\b\n\u0000\u0012\u0004\b\u0006\u0010\u0007R\u0018\u0010\b\u001a\u00020\t8\u0000@\u0000X\u000e¢\u0006\b\n\u0000\u0012\u0004\b\n\u0010\u0007R\u0012\u0010\u000b\u001a\u00020\f8Æ\u0002¢\u0006\u0006\u001a\u0004\b\r\u0010\u000eR\u0012\u0010\u000f\u001a\u00020\u00038Ç\u0002¢\u0006\u0006\u001a\u0004\b\u0010\u0010\u0011R\u0011\u0010\u0012\u001a\u00020\u00038G¢\u0006\u0006\u001a\u0004\b\u0013\u0010\u0011\u0001\u0001M\u0002\u0007\n\u0005\b20\u0001¨\u0006N"}, d2 = {"Landroidx/collection/IntList;", "", "initialCapacity", "", "(I)V", "_size", "get_size$annotations", "()V", "content", "", "getContent$annotations", "indices", "Lkotlin/ranges/IntRange;", "getIndices", "()Lkotlin/ranges/IntRange;", "lastIndex", "getLastIndex", "()I", "size", "getSize", "any", "", "predicate", "Lkotlin/Function1;", "Lkotlin/ParameterName;", "name", "element", "contains", "containsAll", "elements", "count", "elementAt", "index", "elementAtOrElse", "defaultValue", "equals", "other", "first", "fold", "R", "initial", "operation", "Lkotlin/Function2;", "acc", "(Ljava/lang/Object;Lkotlin/jvm/functions/Function2;)Ljava/lang/Object;", "foldIndexed", "Lkotlin/Function3;", "(Ljava/lang/Object;Lkotlin/jvm/functions/Function3;)Ljava/lang/Object;", "foldRight", "foldRightIndexed", "forEach", "", "block", "forEachIndexed", "forEachReversed", "forEachReversedIndexed", "get", "hashCode", "indexOf", "indexOfFirst", "indexOfLast", "isEmpty", "isNotEmpty", "joinToString", "", "separator", "", "prefix", "postfix", "limit", "truncated", "transform", "last", "lastIndexOf", "none", "reversedAny", "toString", "Landroidx/collection/MutableIntList;", "collection"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* compiled from: IntList.kt */
public abstract class IntList {
    public int _size;
    public int[] content;

    public /* synthetic */ IntList(int i, DefaultConstructorMarker defaultConstructorMarker) {
        this(i);
    }

    public static /* synthetic */ void getContent$annotations() {
    }

    public static /* synthetic */ void get_size$annotations() {
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

    private IntList(int initialCapacity) {
        int[] iArr;
        if (initialCapacity == 0) {
            iArr = IntSetKt.getEmptyIntArray();
        } else {
            iArr = new int[initialCapacity];
        }
        this.content = iArr;
    }

    public final int getSize() {
        return this._size;
    }

    public final int getLastIndex() {
        return this._size - 1;
    }

    public final IntRange getIndices() {
        return RangesKt.until(0, this._size);
    }

    public final boolean none() {
        return isEmpty();
    }

    public final boolean any() {
        return isNotEmpty();
    }

    public final boolean any(Function1<? super Integer, Boolean> predicate) {
        Intrinsics.checkNotNullParameter(predicate, "predicate");
        int[] content$iv = this.content;
        int i = this._size;
        for (int i$iv = 0; i$iv < i; i$iv++) {
            if (predicate.invoke(Integer.valueOf(content$iv[i$iv])).booleanValue()) {
                return true;
            }
        }
        return false;
    }

    public final boolean reversedAny(Function1<? super Integer, Boolean> predicate) {
        Intrinsics.checkNotNullParameter(predicate, "predicate");
        int[] content$iv = this.content;
        for (int i$iv = this._size - 1; -1 < i$iv; i$iv--) {
            if (predicate.invoke(Integer.valueOf(content$iv[i$iv])).booleanValue()) {
                return true;
            }
        }
        return false;
    }

    public final boolean contains(int element) {
        int[] content$iv = this.content;
        int i = this._size;
        for (int i$iv = 0; i$iv < i; i$iv++) {
            if (content$iv[i$iv] == element) {
                return true;
            }
        }
        return false;
    }

    public final boolean containsAll(IntList elements) {
        Intrinsics.checkNotNullParameter(elements, "elements");
        IntRange until = RangesKt.until(0, elements._size);
        int i = until.getFirst();
        int last = until.getLast();
        if (i > last) {
            return true;
        }
        while (contains(elements.get(i))) {
            if (i == last) {
                return true;
            }
            i++;
        }
        return false;
    }

    public final int count() {
        return this._size;
    }

    public final int count(Function1<? super Integer, Boolean> predicate) {
        Intrinsics.checkNotNullParameter(predicate, "predicate");
        int count = 0;
        int[] content$iv = this.content;
        int i = this._size;
        for (int i$iv = 0; i$iv < i; i$iv++) {
            if (predicate.invoke(Integer.valueOf(content$iv[i$iv])).booleanValue()) {
                count++;
            }
        }
        return count;
    }

    public final int first() {
        if (!isEmpty()) {
            return this.content[0];
        }
        throw new NoSuchElementException("IntList is empty.");
    }

    public final int first(Function1<? super Integer, Boolean> predicate) {
        Intrinsics.checkNotNullParameter(predicate, "predicate");
        int[] content$iv = this.content;
        int i = this._size;
        for (int i$iv = 0; i$iv < i; i$iv++) {
            int item = content$iv[i$iv];
            if (predicate.invoke(Integer.valueOf(item)).booleanValue()) {
                return item;
            }
        }
        throw new NoSuchElementException("IntList contains no element matching the predicate.");
    }

    public final <R> R fold(R initial, Function2<? super R, ? super Integer, ? extends R> operation) {
        Intrinsics.checkNotNullParameter(operation, "operation");
        Object acc = initial;
        int[] content$iv = this.content;
        int i = this._size;
        for (int i$iv = 0; i$iv < i; i$iv++) {
            acc = operation.invoke(acc, Integer.valueOf(content$iv[i$iv]));
        }
        return acc;
    }

    public final <R> R foldIndexed(R initial, Function3<? super Integer, ? super R, ? super Integer, ? extends R> operation) {
        Intrinsics.checkNotNullParameter(operation, "operation");
        Object acc = initial;
        int[] content$iv = this.content;
        int i = this._size;
        for (int i$iv = 0; i$iv < i; i$iv++) {
            acc = operation.invoke(Integer.valueOf(i$iv), acc, Integer.valueOf(content$iv[i$iv]));
        }
        return acc;
    }

    public final <R> R foldRight(R initial, Function2<? super Integer, ? super R, ? extends R> operation) {
        Intrinsics.checkNotNullParameter(operation, "operation");
        Object acc = initial;
        int[] content$iv = this.content;
        int i$iv = this._size;
        while (true) {
            i$iv--;
            if (-1 >= i$iv) {
                return acc;
            }
            acc = operation.invoke(Integer.valueOf(content$iv[i$iv]), acc);
        }
    }

    public final <R> R foldRightIndexed(R initial, Function3<? super Integer, ? super Integer, ? super R, ? extends R> operation) {
        Intrinsics.checkNotNullParameter(operation, "operation");
        Object acc = initial;
        int[] content$iv = this.content;
        int i$iv = this._size;
        while (true) {
            i$iv--;
            if (-1 >= i$iv) {
                return acc;
            }
            acc = operation.invoke(Integer.valueOf(i$iv), Integer.valueOf(content$iv[i$iv]), acc);
        }
    }

    public final void forEach(Function1<? super Integer, Unit> block) {
        Intrinsics.checkNotNullParameter(block, "block");
        int[] content2 = this.content;
        int i = this._size;
        for (int i2 = 0; i2 < i; i2++) {
            block.invoke(Integer.valueOf(content2[i2]));
        }
    }

    public final void forEachIndexed(Function2<? super Integer, ? super Integer, Unit> block) {
        Intrinsics.checkNotNullParameter(block, "block");
        int[] content2 = this.content;
        int i = this._size;
        for (int i2 = 0; i2 < i; i2++) {
            block.invoke(Integer.valueOf(i2), Integer.valueOf(content2[i2]));
        }
    }

    public final void forEachReversed(Function1<? super Integer, Unit> block) {
        Intrinsics.checkNotNullParameter(block, "block");
        int[] content2 = this.content;
        int i = this._size;
        while (true) {
            i--;
            if (-1 < i) {
                block.invoke(Integer.valueOf(content2[i]));
            } else {
                return;
            }
        }
    }

    public final void forEachReversedIndexed(Function2<? super Integer, ? super Integer, Unit> block) {
        Intrinsics.checkNotNullParameter(block, "block");
        int[] content2 = this.content;
        int i = this._size;
        while (true) {
            i--;
            if (-1 < i) {
                block.invoke(Integer.valueOf(i), Integer.valueOf(content2[i]));
            } else {
                return;
            }
        }
    }

    public final int get(int index) {
        boolean z = false;
        if (index >= 0 && index < this._size) {
            z = true;
        }
        if (z) {
            return this.content[index];
        }
        throw new IndexOutOfBoundsException("Index " + index + " must be in 0.." + (this._size - 1));
    }

    public final int elementAt(int index) {
        boolean z = false;
        if (index >= 0 && index < this._size) {
            z = true;
        }
        if (z) {
            return this.content[index];
        }
        throw new IndexOutOfBoundsException("Index " + index + " must be in 0.." + (this._size - 1));
    }

    public final int elementAtOrElse(int index, Function1<? super Integer, Integer> defaultValue) {
        Intrinsics.checkNotNullParameter(defaultValue, "defaultValue");
        boolean z = false;
        if (index >= 0 && index < this._size) {
            z = true;
        }
        if (!z) {
            return defaultValue.invoke(Integer.valueOf(index)).intValue();
        }
        return this.content[index];
    }

    public final int indexOf(int element) {
        int[] content$iv = this.content;
        int i = this._size;
        for (int i$iv = 0; i$iv < i; i$iv++) {
            int i2 = i$iv;
            if (element == content$iv[i$iv]) {
                return i2;
            }
        }
        return -1;
    }

    public final int indexOfFirst(Function1<? super Integer, Boolean> predicate) {
        Intrinsics.checkNotNullParameter(predicate, "predicate");
        int[] content$iv = this.content;
        int i = this._size;
        for (int i$iv = 0; i$iv < i; i$iv++) {
            int i2 = i$iv;
            if (predicate.invoke(Integer.valueOf(content$iv[i$iv])).booleanValue()) {
                return i2;
            }
        }
        return -1;
    }

    public final int indexOfLast(Function1<? super Integer, Boolean> predicate) {
        Intrinsics.checkNotNullParameter(predicate, "predicate");
        int[] content$iv = this.content;
        int i$iv = this._size;
        while (true) {
            i$iv--;
            if (-1 >= i$iv) {
                return -1;
            }
            int i = i$iv;
            if (predicate.invoke(Integer.valueOf(content$iv[i$iv])).booleanValue()) {
                return i;
            }
        }
    }

    public final boolean isEmpty() {
        return this._size == 0;
    }

    public final boolean isNotEmpty() {
        return this._size != 0;
    }

    public final int last() {
        if (!isEmpty()) {
            return this.content[this._size - 1];
        }
        throw new NoSuchElementException("IntList is empty.");
    }

    public final int last(Function1<? super Integer, Boolean> predicate) {
        Intrinsics.checkNotNullParameter(predicate, "predicate");
        int[] content$iv = this.content;
        int i$iv = this._size;
        while (true) {
            i$iv--;
            if (-1 < i$iv) {
                int item = content$iv[i$iv];
                if (predicate.invoke(Integer.valueOf(item)).booleanValue()) {
                    return item;
                }
            } else {
                throw new NoSuchElementException("IntList contains no element matching the predicate.");
            }
        }
    }

    public final int lastIndexOf(int element) {
        int[] content$iv = this.content;
        int i$iv = this._size;
        while (true) {
            i$iv--;
            if (-1 >= i$iv) {
                return -1;
            }
            int i = i$iv;
            if (content$iv[i$iv] == element) {
                return i;
            }
        }
    }

    public static /* synthetic */ String joinToString$default(IntList intList, CharSequence charSequence, CharSequence charSequence2, CharSequence charSequence3, int i, CharSequence charSequence4, int i2, Object obj) {
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
            return intList.joinToString(charSequence, str, str2, i3, charSequence5);
        }
        throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: joinToString");
    }

    public final String joinToString(CharSequence separator, CharSequence prefix, CharSequence postfix, int limit, CharSequence truncated) {
        CharSequence charSequence = separator;
        CharSequence charSequence2 = prefix;
        CharSequence charSequence3 = postfix;
        CharSequence charSequence4 = truncated;
        Intrinsics.checkNotNullParameter(charSequence, "separator");
        Intrinsics.checkNotNullParameter(charSequence2, "prefix");
        Intrinsics.checkNotNullParameter(charSequence3, "postfix");
        Intrinsics.checkNotNullParameter(charSequence4, "truncated");
        StringBuilder sb = new StringBuilder();
        StringBuilder $this$joinToString_u24lambda_u2430 = sb;
        $this$joinToString_u24lambda_u2430.append(charSequence2);
        int[] content$iv = this.content;
        int i$iv = 0;
        int i = this._size;
        while (true) {
            if (i$iv >= i) {
                int i2 = limit;
                $this$joinToString_u24lambda_u2430.append(charSequence3);
                break;
            }
            int element = content$iv[i$iv];
            int index = i$iv;
            if (index == limit) {
                $this$joinToString_u24lambda_u2430.append(charSequence4);
                break;
            }
            if (index != 0) {
                $this$joinToString_u24lambda_u2430.append(charSequence);
            }
            $this$joinToString_u24lambda_u2430.append(element);
            i$iv++;
        }
        String sb2 = sb.toString();
        Intrinsics.checkNotNullExpressionValue(sb2, "StringBuilder().apply(builderAction).toString()");
        return sb2;
    }

    public static /* synthetic */ String joinToString$default(IntList $this, CharSequence separator, CharSequence prefix, CharSequence postfix, int limit, CharSequence truncated, Function1 transform, int i, Object obj) {
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
            StringBuilder $this$joinToString_u24lambda_u2432 = sb;
            $this$joinToString_u24lambda_u2432.append(prefix2);
            IntList this_$iv = $this;
            int[] content$iv = this_$iv.content;
            int i$iv = 0;
            int i2 = this_$iv._size;
            while (true) {
                if (i$iv >= i2) {
                    CharSequence charSequence = prefix2;
                    $this$joinToString_u24lambda_u2432.append(postfix2);
                    break;
                }
                int element = content$iv[i$iv];
                CharSequence prefix3 = prefix2;
                int index = i$iv;
                if (index == limit2) {
                    $this$joinToString_u24lambda_u2432.append(truncated2);
                    CharSequence charSequence2 = separator2;
                    break;
                }
                if (index != 0) {
                    $this$joinToString_u24lambda_u2432.append(separator2);
                }
                $this$joinToString_u24lambda_u2432.append((CharSequence) function1.invoke(Integer.valueOf(element)));
                i$iv++;
                separator2 = separator2;
                prefix2 = prefix3;
            }
            String sb2 = sb.toString();
            Intrinsics.checkNotNullExpressionValue(sb2, "StringBuilder().apply(builderAction).toString()");
            return sb2;
        }
        throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: joinToString");
    }

    public final String joinToString(CharSequence separator, CharSequence prefix, CharSequence postfix, int limit, CharSequence truncated, Function1<? super Integer, ? extends CharSequence> transform) {
        CharSequence charSequence = separator;
        CharSequence charSequence2 = prefix;
        CharSequence charSequence3 = postfix;
        CharSequence charSequence4 = truncated;
        Function1<? super Integer, ? extends CharSequence> function1 = transform;
        Intrinsics.checkNotNullParameter(charSequence, "separator");
        Intrinsics.checkNotNullParameter(charSequence2, "prefix");
        Intrinsics.checkNotNullParameter(charSequence3, "postfix");
        Intrinsics.checkNotNullParameter(charSequence4, "truncated");
        Intrinsics.checkNotNullParameter(function1, "transform");
        StringBuilder sb = new StringBuilder();
        StringBuilder $this$joinToString_u24lambda_u2432 = sb;
        $this$joinToString_u24lambda_u2432.append(charSequence2);
        int[] content$iv = this.content;
        int i$iv = 0;
        int i = this._size;
        while (true) {
            if (i$iv >= i) {
                int i2 = limit;
                $this$joinToString_u24lambda_u2432.append(charSequence3);
                break;
            }
            int element = content$iv[i$iv];
            int index = i$iv;
            if (index == limit) {
                $this$joinToString_u24lambda_u2432.append(charSequence4);
                break;
            }
            if (index != 0) {
                $this$joinToString_u24lambda_u2432.append(charSequence);
            }
            $this$joinToString_u24lambda_u2432.append((CharSequence) function1.invoke(Integer.valueOf(element)));
            i$iv++;
            charSequence = separator;
            CharSequence charSequence5 = prefix;
        }
        String sb2 = sb.toString();
        Intrinsics.checkNotNullExpressionValue(sb2, "StringBuilder().apply(builderAction).toString()");
        return sb2;
    }

    public int hashCode() {
        int hashCode = 0;
        int[] content$iv = this.content;
        int i = this._size;
        for (int i$iv = 0; i$iv < i; i$iv++) {
            hashCode += Integer.hashCode(content$iv[i$iv]) * 31;
        }
        return hashCode;
    }

    public boolean equals(Object other) {
        if (!(other instanceof IntList) || ((IntList) other)._size != this._size) {
            return false;
        }
        int[] content2 = this.content;
        int[] otherContent = ((IntList) other).content;
        IntRange until = RangesKt.until(0, this._size);
        int i = until.getFirst();
        int last = until.getLast();
        if (i > last) {
            return true;
        }
        while (content2[i] == otherContent[i]) {
            if (i == last) {
                return true;
            }
            i++;
        }
        return false;
    }

    public String toString() {
        return joinToString$default(this, (CharSequence) null, "[", "]", 0, (CharSequence) null, 25, (Object) null);
    }

    public final String joinToString(CharSequence separator, CharSequence prefix, CharSequence postfix, int limit, Function1<? super Integer, ? extends CharSequence> transform) {
        CharSequence charSequence = separator;
        CharSequence charSequence2 = prefix;
        CharSequence charSequence3 = postfix;
        Function1<? super Integer, ? extends CharSequence> function1 = transform;
        Intrinsics.checkNotNullParameter(charSequence, "separator");
        Intrinsics.checkNotNullParameter(charSequence2, "prefix");
        Intrinsics.checkNotNullParameter(charSequence3, "postfix");
        Intrinsics.checkNotNullParameter(function1, "transform");
        int $i$f$joinToString = false;
        StringBuilder sb = new StringBuilder();
        StringBuilder $this$joinToString_u24lambda_u2432$iv = sb;
        $this$joinToString_u24lambda_u2432$iv.append(charSequence2);
        int[] content$iv$iv = this.content;
        int i$iv$iv = 0;
        int i = this._size;
        while (true) {
            if (i$iv$iv >= i) {
                int i2 = limit;
                int i3 = $i$f$joinToString;
                $this$joinToString_u24lambda_u2432$iv.append(charSequence3);
                break;
            }
            int element$iv = content$iv$iv[i$iv$iv];
            int index$iv = $i$f$joinToString;
            int index$iv2 = i$iv$iv;
            if (index$iv2 == limit) {
                $this$joinToString_u24lambda_u2432$iv.append(truncated$iv);
                break;
            }
            if (index$iv2 != 0) {
                $this$joinToString_u24lambda_u2432$iv.append(charSequence);
            }
            $this$joinToString_u24lambda_u2432$iv.append((CharSequence) function1.invoke(Integer.valueOf(element$iv)));
            i$iv$iv++;
            charSequence = separator;
            CharSequence charSequence4 = prefix;
            $i$f$joinToString = index$iv;
        }
        String sb2 = sb.toString();
        Intrinsics.checkNotNullExpressionValue(sb2, "StringBuilder().apply(builderAction).toString()");
        return sb2;
    }

    public final String joinToString(CharSequence separator, CharSequence prefix, CharSequence postfix, Function1<? super Integer, ? extends CharSequence> transform) {
        CharSequence charSequence = separator;
        CharSequence charSequence2 = prefix;
        CharSequence charSequence3 = postfix;
        Function1<? super Integer, ? extends CharSequence> function1 = transform;
        Intrinsics.checkNotNullParameter(charSequence, "separator");
        Intrinsics.checkNotNullParameter(charSequence2, "prefix");
        Intrinsics.checkNotNullParameter(charSequence3, "postfix");
        Intrinsics.checkNotNullParameter(function1, "transform");
        StringBuilder sb = new StringBuilder();
        StringBuilder $this$joinToString_u24lambda_u2432$iv = sb;
        $this$joinToString_u24lambda_u2432$iv.append(charSequence2);
        int[] content$iv$iv = this.content;
        int i$iv$iv = 0;
        int i = this._size;
        while (true) {
            if (i$iv$iv >= i) {
                $this$joinToString_u24lambda_u2432$iv.append(charSequence3);
                break;
            }
            int element$iv = content$iv$iv[i$iv$iv];
            int index$iv = i$iv$iv;
            if (index$iv == -1) {
                $this$joinToString_u24lambda_u2432$iv.append(truncated$iv);
                break;
            }
            if (index$iv != 0) {
                $this$joinToString_u24lambda_u2432$iv.append(charSequence);
            }
            $this$joinToString_u24lambda_u2432$iv.append((CharSequence) function1.invoke(Integer.valueOf(element$iv)));
            i$iv$iv++;
            charSequence = separator;
            CharSequence charSequence4 = prefix;
        }
        String sb2 = sb.toString();
        Intrinsics.checkNotNullExpressionValue(sb2, "StringBuilder().apply(builderAction).toString()");
        return sb2;
    }

    public final String joinToString(CharSequence separator, CharSequence prefix, Function1<? super Integer, ? extends CharSequence> transform) {
        CharSequence charSequence = separator;
        CharSequence charSequence2 = prefix;
        Function1<? super Integer, ? extends CharSequence> function1 = transform;
        Intrinsics.checkNotNullParameter(charSequence, "separator");
        Intrinsics.checkNotNullParameter(charSequence2, "prefix");
        Intrinsics.checkNotNullParameter(function1, "transform");
        StringBuilder sb = new StringBuilder();
        StringBuilder $this$joinToString_u24lambda_u2432$iv = sb;
        $this$joinToString_u24lambda_u2432$iv.append(charSequence2);
        int[] content$iv$iv = this.content;
        int i$iv$iv = 0;
        int i = this._size;
        while (true) {
            if (i$iv$iv >= i) {
                $this$joinToString_u24lambda_u2432$iv.append(postfix$iv);
                break;
            }
            int element$iv = content$iv$iv[i$iv$iv];
            int index$iv = i$iv$iv;
            if (index$iv == -1) {
                $this$joinToString_u24lambda_u2432$iv.append(truncated$iv);
                break;
            }
            if (index$iv != 0) {
                $this$joinToString_u24lambda_u2432$iv.append(charSequence);
            }
            $this$joinToString_u24lambda_u2432$iv.append((CharSequence) function1.invoke(Integer.valueOf(element$iv)));
            i$iv$iv++;
            charSequence = separator;
            CharSequence charSequence3 = prefix;
        }
        String sb2 = sb.toString();
        Intrinsics.checkNotNullExpressionValue(sb2, "StringBuilder().apply(builderAction).toString()");
        return sb2;
    }

    /*  JADX ERROR: NullPointerException in pass: CodeShrinkVisitor
        java.lang.NullPointerException
        */
    public final java.lang.String joinToString(java.lang.CharSequence r21, kotlin.jvm.functions.Function1<? super java.lang.Integer, ? extends java.lang.CharSequence> r22) {
        /*
            r20 = this;
            r0 = r21
            r1 = r22
            java.lang.String r2 = "separator"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r0, r2)
            java.lang.String r2 = "transform"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r1, r2)
            r2 = 0
            java.lang.String r3 = ""
            r4 = r3
            java.lang.CharSequence r4 = (java.lang.CharSequence) r4
            java.lang.CharSequence r3 = (java.lang.CharSequence) r3
            r5 = -1
            java.lang.String r6 = "..."
            java.lang.CharSequence r6 = (java.lang.CharSequence) r6
            r7 = 0
            java.lang.StringBuilder r8 = new java.lang.StringBuilder
            r8.<init>()
            r9 = r8
            r10 = 0
            r9.append(r4)
            r11 = r20
            r12 = 0
            int[] r13 = r11.content
            r14 = 0
            int r15 = r11._size
        L_0x0035:
            if (r14 >= r15) goto L_0x0064
            r16 = r13[r14]
            r17 = r14
            r18 = r17
            r17 = 0
            r19 = r2
            r2 = r18
            if (r2 != r5) goto L_0x0049
            r9.append(r6)
            goto L_0x006b
        L_0x0049:
            if (r2 == 0) goto L_0x004e
            r9.append(r0)
        L_0x004e:
            java.lang.Integer r0 = java.lang.Integer.valueOf(r16)
            java.lang.Object r0 = r1.invoke(r0)
            java.lang.CharSequence r0 = (java.lang.CharSequence) r0
            r9.append(r0)
            int r14 = r14 + 1
            r0 = r21
            r2 = r19
            goto L_0x0035
        L_0x0064:
            r19 = r2
            r9.append(r3)
        L_0x006b:
            java.lang.String r0 = r8.toString()
            java.lang.String r2 = "StringBuilder().apply(builderAction).toString()"
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(r0, r2)
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.collection.IntList.joinToString(java.lang.CharSequence, kotlin.jvm.functions.Function1):java.lang.String");
    }

    /*  JADX ERROR: NullPointerException in pass: CodeShrinkVisitor
        java.lang.NullPointerException
        */
    public final java.lang.String joinToString(kotlin.jvm.functions.Function1<? super java.lang.Integer, ? extends java.lang.CharSequence> r21) {
        /*
            r20 = this;
            r0 = r21
            java.lang.String r1 = "transform"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r0, r1)
            r1 = 0
            java.lang.String r2 = ", "
            java.lang.CharSequence r2 = (java.lang.CharSequence) r2
            java.lang.String r3 = ""
            r4 = r3
            java.lang.CharSequence r4 = (java.lang.CharSequence) r4
            java.lang.CharSequence r3 = (java.lang.CharSequence) r3
            r5 = -1
            java.lang.String r6 = "..."
            java.lang.CharSequence r6 = (java.lang.CharSequence) r6
            r7 = 0
            java.lang.StringBuilder r8 = new java.lang.StringBuilder
            r8.<init>()
            r9 = r8
            r10 = 0
            r9.append(r4)
            r11 = r20
            r12 = 0
            int[] r13 = r11.content
            r14 = 0
            int r15 = r11._size
        L_0x0032:
            if (r14 >= r15) goto L_0x0061
            r16 = r13[r14]
            r17 = r14
            r18 = r17
            r17 = 0
            r19 = r1
            r1 = r18
            if (r1 != r5) goto L_0x0046
            r9.append(r6)
            goto L_0x0068
        L_0x0046:
            if (r1 == 0) goto L_0x004b
            r9.append(r2)
        L_0x004b:
            r18 = r1
            java.lang.Integer r1 = java.lang.Integer.valueOf(r16)
            java.lang.Object r1 = r0.invoke(r1)
            java.lang.CharSequence r1 = (java.lang.CharSequence) r1
            r9.append(r1)
            int r14 = r14 + 1
            r1 = r19
            goto L_0x0032
        L_0x0061:
            r19 = r1
            r9.append(r3)
        L_0x0068:
            java.lang.String r1 = r8.toString()
            java.lang.String r8 = "StringBuilder().apply(builderAction).toString()"
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(r1, r8)
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.collection.IntList.joinToString(kotlin.jvm.functions.Function1):java.lang.String");
    }
}
