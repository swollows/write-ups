package androidx.collection;

import java.util.List;
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

@Metadata(d1 = {"\u0000r\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\u0005\n\u0002\u0010\u0011\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010 \n\u0002\b\u0005\n\u0002\u0010\u001c\n\u0002\b\u0011\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u0002\n\u0002\b\r\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\r\n\u0002\b\u000b\n\u0002\u0018\u0002\n\u0000\b6\u0018\u0000*\u0004\b\u0000\u0010\u00012\u00020\u0002B\u000f\b\u0004\u0012\u0006\u0010\u0003\u001a\u00020\u0004¢\u0006\u0002\u0010\u0005J\u0006\u0010\u0016\u001a\u00020\u0017J:\u0010\u0016\u001a\u00020\u00172!\u0010\u0018\u001a\u001d\u0012\u0013\u0012\u00118\u0000¢\u0006\f\b\u001a\u0012\b\b\u001b\u0012\u0004\b\b(\u001c\u0012\u0004\u0012\u00020\u00170\u0019H\bø\u0001\u0000\u0002\b\n\u0006\b\u0001\u0012\u0002\u0010\u0001J\u000e\u0010\u001d\u001a\b\u0012\u0004\u0012\u00028\u00000\u001eH&J\u0016\u0010\u001f\u001a\u00020\u00172\u0006\u0010\u001c\u001a\u00028\u0000H\u0002¢\u0006\u0002\u0010 J\u0014\u0010!\u001a\u00020\u00172\f\u0010\"\u001a\b\u0012\u0004\u0012\u00028\u00000\u0000J\u0019\u0010!\u001a\u00020\u00172\f\u0010\"\u001a\b\u0012\u0004\u0012\u00028\u00000\n¢\u0006\u0002\u0010#J\u0014\u0010!\u001a\u00020\u00172\f\u0010\"\u001a\b\u0012\u0004\u0012\u00028\u00000$J\u0014\u0010!\u001a\u00020\u00172\f\u0010\"\u001a\b\u0012\u0004\u0012\u00028\u00000\u001eJ\u0006\u0010%\u001a\u00020\u0004J:\u0010%\u001a\u00020\u00042!\u0010\u0018\u001a\u001d\u0012\u0013\u0012\u00118\u0000¢\u0006\f\b\u001a\u0012\b\b\u001b\u0012\u0004\b\b(\u001c\u0012\u0004\u0012\u00020\u00170\u0019H\bø\u0001\u0000\u0002\b\n\u0006\b\u0001\u0012\u0002\u0010\u0001J\u0015\u0010&\u001a\u00028\u00002\b\b\u0001\u0010'\u001a\u00020\u0004¢\u0006\u0002\u0010(J>\u0010)\u001a\u00028\u00002\b\b\u0001\u0010'\u001a\u00020\u00042!\u0010*\u001a\u001d\u0012\u0013\u0012\u00110\u0004¢\u0006\f\b\u001a\u0012\b\b\u001b\u0012\u0004\b\b('\u0012\u0004\u0012\u00028\u00000\u0019H\bø\u0001\u0000¢\u0006\u0002\u0010+J\u0013\u0010,\u001a\u00020\u00172\b\u0010-\u001a\u0004\u0018\u00010\u0002H\u0002J\u000b\u0010.\u001a\u00028\u0000¢\u0006\u0002\u0010/J?\u0010.\u001a\u00028\u00002!\u0010\u0018\u001a\u001d\u0012\u0013\u0012\u00118\u0000¢\u0006\f\b\u001a\u0012\b\b\u001b\u0012\u0004\b\b(\u001c\u0012\u0004\u0012\u00020\u00170\u0019H\bø\u0001\u0000\u0002\b\n\u0006\b\u0001\u0012\u0002\u0010\u0001¢\u0006\u0002\u00100J\u0010\u00101\u001a\u0004\u0018\u00018\u0000H\b¢\u0006\u0002\u0010/JA\u00101\u001a\u0004\u0018\u00018\u00002!\u0010\u0018\u001a\u001d\u0012\u0013\u0012\u00118\u0000¢\u0006\f\b\u001a\u0012\b\b\u001b\u0012\u0004\b\b(\u001c\u0012\u0004\u0012\u00020\u00170\u0019H\bø\u0001\u0000\u0002\b\n\u0006\b\u0001\u0012\u0002\u0010\u0001¢\u0006\u0002\u00100Jb\u00102\u001a\u0002H3\"\u0004\b\u0001\u001032\u0006\u00104\u001a\u0002H326\u00105\u001a2\u0012\u0013\u0012\u0011H3¢\u0006\f\b\u001a\u0012\b\b\u001b\u0012\u0004\b\b(7\u0012\u0013\u0012\u00118\u0000¢\u0006\f\b\u001a\u0012\b\b\u001b\u0012\u0004\b\b(\u001c\u0012\u0004\u0012\u0002H306H\bø\u0001\u0000\u0002\b\n\u0006\b\u0001\u0012\u0002\u0010\u0002¢\u0006\u0002\u00108Jw\u00109\u001a\u0002H3\"\u0004\b\u0001\u001032\u0006\u00104\u001a\u0002H32K\u00105\u001aG\u0012\u0013\u0012\u00110\u0004¢\u0006\f\b\u001a\u0012\b\b\u001b\u0012\u0004\b\b('\u0012\u0013\u0012\u0011H3¢\u0006\f\b\u001a\u0012\b\b\u001b\u0012\u0004\b\b(7\u0012\u0013\u0012\u00118\u0000¢\u0006\f\b\u001a\u0012\b\b\u001b\u0012\u0004\b\b(\u001c\u0012\u0004\u0012\u0002H30:H\bø\u0001\u0000\u0002\b\n\u0006\b\u0001\u0012\u0002\u0010\u0002¢\u0006\u0002\u0010;Jb\u0010<\u001a\u0002H3\"\u0004\b\u0001\u001032\u0006\u00104\u001a\u0002H326\u00105\u001a2\u0012\u0013\u0012\u00118\u0000¢\u0006\f\b\u001a\u0012\b\b\u001b\u0012\u0004\b\b(\u001c\u0012\u0013\u0012\u0011H3¢\u0006\f\b\u001a\u0012\b\b\u001b\u0012\u0004\b\b(7\u0012\u0004\u0012\u0002H306H\bø\u0001\u0000\u0002\b\n\u0006\b\u0001\u0012\u0002\u0010\u0002¢\u0006\u0002\u00108Jw\u0010=\u001a\u0002H3\"\u0004\b\u0001\u001032\u0006\u00104\u001a\u0002H32K\u00105\u001aG\u0012\u0013\u0012\u00110\u0004¢\u0006\f\b\u001a\u0012\b\b\u001b\u0012\u0004\b\b('\u0012\u0013\u0012\u00118\u0000¢\u0006\f\b\u001a\u0012\b\b\u001b\u0012\u0004\b\b(\u001c\u0012\u0013\u0012\u0011H3¢\u0006\f\b\u001a\u0012\b\b\u001b\u0012\u0004\b\b(7\u0012\u0004\u0012\u0002H30:H\bø\u0001\u0000\u0002\b\n\u0006\b\u0001\u0012\u0002\u0010\u0002¢\u0006\u0002\u0010;J:\u0010>\u001a\u00020?2!\u0010@\u001a\u001d\u0012\u0013\u0012\u00118\u0000¢\u0006\f\b\u001a\u0012\b\b\u001b\u0012\u0004\b\b(\u001c\u0012\u0004\u0012\u00020?0\u0019H\bø\u0001\u0000\u0002\b\n\u0006\b\u0001\u0012\u0002\u0010\u0001JO\u0010A\u001a\u00020?26\u0010@\u001a2\u0012\u0013\u0012\u00110\u0004¢\u0006\f\b\u001a\u0012\b\b\u001b\u0012\u0004\b\b('\u0012\u0013\u0012\u00118\u0000¢\u0006\f\b\u001a\u0012\b\b\u001b\u0012\u0004\b\b(\u001c\u0012\u0004\u0012\u00020?06H\bø\u0001\u0000\u0002\b\n\u0006\b\u0001\u0012\u0002\u0010\u0001J:\u0010B\u001a\u00020?2!\u0010@\u001a\u001d\u0012\u0013\u0012\u00118\u0000¢\u0006\f\b\u001a\u0012\b\b\u001b\u0012\u0004\b\b(\u001c\u0012\u0004\u0012\u00020?0\u0019H\bø\u0001\u0000\u0002\b\n\u0006\b\u0001\u0012\u0002\u0010\u0001JO\u0010C\u001a\u00020?26\u0010@\u001a2\u0012\u0013\u0012\u00110\u0004¢\u0006\f\b\u001a\u0012\b\b\u001b\u0012\u0004\b\b('\u0012\u0013\u0012\u00118\u0000¢\u0006\f\b\u001a\u0012\b\b\u001b\u0012\u0004\b\b(\u001c\u0012\u0004\u0012\u00020?06H\bø\u0001\u0000\u0002\b\n\u0006\b\u0001\u0012\u0002\u0010\u0001J\u0018\u0010D\u001a\u00028\u00002\b\b\u0001\u0010'\u001a\u00020\u0004H\u0002¢\u0006\u0002\u0010(J\b\u0010E\u001a\u00020\u0004H\u0016J\u0013\u0010F\u001a\u00020\u00042\u0006\u0010\u001c\u001a\u00028\u0000¢\u0006\u0002\u0010GJ:\u0010H\u001a\u00020\u00042!\u0010\u0018\u001a\u001d\u0012\u0013\u0012\u00118\u0000¢\u0006\f\b\u001a\u0012\b\b\u001b\u0012\u0004\b\b(\u001c\u0012\u0004\u0012\u00020\u00170\u0019H\bø\u0001\u0000\u0002\b\n\u0006\b\u0001\u0012\u0002\u0010\u0001J:\u0010I\u001a\u00020\u00042!\u0010\u0018\u001a\u001d\u0012\u0013\u0012\u00118\u0000¢\u0006\f\b\u001a\u0012\b\b\u001b\u0012\u0004\b\b(\u001c\u0012\u0004\u0012\u00020\u00170\u0019H\bø\u0001\u0000\u0002\b\n\u0006\b\u0001\u0012\u0002\u0010\u0001J\u0006\u0010J\u001a\u00020\u0017J\u0006\u0010K\u001a\u00020\u0017JR\u0010L\u001a\u00020M2\b\b\u0002\u0010N\u001a\u00020O2\b\b\u0002\u0010P\u001a\u00020O2\b\b\u0002\u0010Q\u001a\u00020O2\b\b\u0002\u0010R\u001a\u00020\u00042\b\b\u0002\u0010S\u001a\u00020O2\u0016\b\u0002\u0010T\u001a\u0010\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00020O\u0018\u00010\u0019H\u0007J\u000b\u0010U\u001a\u00028\u0000¢\u0006\u0002\u0010/J?\u0010U\u001a\u00028\u00002!\u0010\u0018\u001a\u001d\u0012\u0013\u0012\u00118\u0000¢\u0006\f\b\u001a\u0012\b\b\u001b\u0012\u0004\b\b(\u001c\u0012\u0004\u0012\u00020\u00170\u0019H\bø\u0001\u0000\u0002\b\n\u0006\b\u0001\u0012\u0002\u0010\u0001¢\u0006\u0002\u00100J\u0013\u0010V\u001a\u00020\u00042\u0006\u0010\u001c\u001a\u00028\u0000¢\u0006\u0002\u0010GJ\u0010\u0010W\u001a\u0004\u0018\u00018\u0000H\b¢\u0006\u0002\u0010/JA\u0010W\u001a\u0004\u0018\u00018\u00002!\u0010\u0018\u001a\u001d\u0012\u0013\u0012\u00118\u0000¢\u0006\f\b\u001a\u0012\b\b\u001b\u0012\u0004\b\b(\u001c\u0012\u0004\u0012\u00020\u00170\u0019H\bø\u0001\u0000\u0002\b\n\u0006\b\u0001\u0012\u0002\u0010\u0001¢\u0006\u0002\u00100J\u0006\u0010X\u001a\u00020\u0017J:\u0010Y\u001a\u00020\u00172!\u0010\u0018\u001a\u001d\u0012\u0013\u0012\u00118\u0000¢\u0006\f\b\u001a\u0012\b\b\u001b\u0012\u0004\b\b(\u001c\u0012\u0004\u0012\u00020\u00170\u0019H\bø\u0001\u0000\u0002\b\n\u0006\b\u0001\u0012\u0002\u0010\u0001J\b\u0010Z\u001a\u00020MH\u0016R\u0018\u0010\u0006\u001a\u00020\u00048\u0000@\u0000X\u000e¢\u0006\b\n\u0000\u0012\u0004\b\u0007\u0010\bR\"\u0010\t\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00020\n8\u0000@\u0000X\u000e¢\u0006\n\n\u0002\u0010\f\u0012\u0004\b\u000b\u0010\bR\u0012\u0010\r\u001a\u00020\u000e8Æ\u0002¢\u0006\u0006\u001a\u0004\b\u000f\u0010\u0010R\u0012\u0010\u0011\u001a\u00020\u00048Ç\u0002¢\u0006\u0006\u001a\u0004\b\u0012\u0010\u0013R\u0011\u0010\u0014\u001a\u00020\u00048G¢\u0006\u0006\u001a\u0004\b\u0015\u0010\u0013\u0001\u0001[\u0002\u0007\n\u0005\b20\u0001¨\u0006\\"}, d2 = {"Landroidx/collection/ObjectList;", "E", "", "initialCapacity", "", "(I)V", "_size", "get_size$annotations", "()V", "content", "", "getContent$annotations", "[Ljava/lang/Object;", "indices", "Lkotlin/ranges/IntRange;", "getIndices", "()Lkotlin/ranges/IntRange;", "lastIndex", "getLastIndex", "()I", "size", "getSize", "any", "", "predicate", "Lkotlin/Function1;", "Lkotlin/ParameterName;", "name", "element", "asList", "", "contains", "(Ljava/lang/Object;)Z", "containsAll", "elements", "([Ljava/lang/Object;)Z", "", "count", "elementAt", "index", "(I)Ljava/lang/Object;", "elementAtOrElse", "defaultValue", "(ILkotlin/jvm/functions/Function1;)Ljava/lang/Object;", "equals", "other", "first", "()Ljava/lang/Object;", "(Lkotlin/jvm/functions/Function1;)Ljava/lang/Object;", "firstOrNull", "fold", "R", "initial", "operation", "Lkotlin/Function2;", "acc", "(Ljava/lang/Object;Lkotlin/jvm/functions/Function2;)Ljava/lang/Object;", "foldIndexed", "Lkotlin/Function3;", "(Ljava/lang/Object;Lkotlin/jvm/functions/Function3;)Ljava/lang/Object;", "foldRight", "foldRightIndexed", "forEach", "", "block", "forEachIndexed", "forEachReversed", "forEachReversedIndexed", "get", "hashCode", "indexOf", "(Ljava/lang/Object;)I", "indexOfFirst", "indexOfLast", "isEmpty", "isNotEmpty", "joinToString", "", "separator", "", "prefix", "postfix", "limit", "truncated", "transform", "last", "lastIndexOf", "lastOrNull", "none", "reversedAny", "toString", "Landroidx/collection/MutableObjectList;", "collection"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* compiled from: ObjectList.kt */
public abstract class ObjectList<E> {
    public int _size;
    public Object[] content;

    public /* synthetic */ ObjectList(int i, DefaultConstructorMarker defaultConstructorMarker) {
        this(i);
    }

    public static /* synthetic */ void getContent$annotations() {
    }

    public static /* synthetic */ void get_size$annotations() {
    }

    public abstract List<E> asList();

    public final String joinToString() {
        return joinToString$default(this, (CharSequence) null, (CharSequence) null, (CharSequence) null, 0, (CharSequence) null, (Function1) null, 63, (Object) null);
    }

    public final String joinToString(CharSequence charSequence) {
        Intrinsics.checkNotNullParameter(charSequence, "separator");
        return joinToString$default(this, charSequence, (CharSequence) null, (CharSequence) null, 0, (CharSequence) null, (Function1) null, 62, (Object) null);
    }

    public final String joinToString(CharSequence charSequence, CharSequence charSequence2) {
        Intrinsics.checkNotNullParameter(charSequence, "separator");
        Intrinsics.checkNotNullParameter(charSequence2, "prefix");
        return joinToString$default(this, charSequence, charSequence2, (CharSequence) null, 0, (CharSequence) null, (Function1) null, 60, (Object) null);
    }

    public final String joinToString(CharSequence charSequence, CharSequence charSequence2, CharSequence charSequence3) {
        Intrinsics.checkNotNullParameter(charSequence, "separator");
        Intrinsics.checkNotNullParameter(charSequence2, "prefix");
        Intrinsics.checkNotNullParameter(charSequence3, "postfix");
        return joinToString$default(this, charSequence, charSequence2, charSequence3, 0, (CharSequence) null, (Function1) null, 56, (Object) null);
    }

    public final String joinToString(CharSequence charSequence, CharSequence charSequence2, CharSequence charSequence3, int i) {
        Intrinsics.checkNotNullParameter(charSequence, "separator");
        Intrinsics.checkNotNullParameter(charSequence2, "prefix");
        Intrinsics.checkNotNullParameter(charSequence3, "postfix");
        return joinToString$default(this, charSequence, charSequence2, charSequence3, i, (CharSequence) null, (Function1) null, 48, (Object) null);
    }

    public final String joinToString(CharSequence charSequence, CharSequence charSequence2, CharSequence charSequence3, int i, CharSequence charSequence4) {
        Intrinsics.checkNotNullParameter(charSequence, "separator");
        Intrinsics.checkNotNullParameter(charSequence2, "prefix");
        Intrinsics.checkNotNullParameter(charSequence3, "postfix");
        Intrinsics.checkNotNullParameter(charSequence4, "truncated");
        return joinToString$default(this, charSequence, charSequence2, charSequence3, i, charSequence4, (Function1) null, 32, (Object) null);
    }

    private ObjectList(int initialCapacity) {
        Object[] objArr;
        if (initialCapacity == 0) {
            objArr = ObjectListKt.EmptyArray;
        } else {
            objArr = new Object[initialCapacity];
        }
        this.content = objArr;
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

    public final boolean any(Function1<? super E, Boolean> predicate) {
        Intrinsics.checkNotNullParameter(predicate, "predicate");
        Object[] content$iv = this.content;
        int i = this._size;
        for (int i$iv = 0; i$iv < i; i$iv++) {
            if (predicate.invoke(content$iv[i$iv]).booleanValue()) {
                return true;
            }
        }
        return false;
    }

    public final boolean reversedAny(Function1<? super E, Boolean> predicate) {
        Intrinsics.checkNotNullParameter(predicate, "predicate");
        Object[] content$iv = this.content;
        for (int i$iv = this._size - 1; -1 < i$iv; i$iv--) {
            if (predicate.invoke(content$iv[i$iv]).booleanValue()) {
                return true;
            }
        }
        return false;
    }

    public final boolean contains(E element) {
        return indexOf(element) >= 0;
    }

    public final boolean containsAll(E[] elements) {
        Intrinsics.checkNotNullParameter(elements, "elements");
        for (E contains : elements) {
            if (!contains(contains)) {
                return false;
            }
        }
        return true;
    }

    public final boolean containsAll(List<? extends E> elements) {
        Intrinsics.checkNotNullParameter(elements, "elements");
        int size = elements.size();
        for (int i = 0; i < size; i++) {
            if (!contains(elements.get(i))) {
                return false;
            }
        }
        return true;
    }

    public final boolean containsAll(Iterable<? extends E> elements) {
        Intrinsics.checkNotNullParameter(elements, "elements");
        for (Object element : elements) {
            if (!contains(element)) {
                return false;
            }
        }
        return true;
    }

    public final boolean containsAll(ObjectList<E> elements) {
        Intrinsics.checkNotNullParameter(elements, "elements");
        ObjectList this_$iv = elements;
        Object[] content$iv = this_$iv.content;
        int i = this_$iv._size;
        for (int i$iv = 0; i$iv < i; i$iv++) {
            if (!contains(content$iv[i$iv])) {
                return false;
            }
        }
        return true;
    }

    public final int count() {
        return this._size;
    }

    public final int count(Function1<? super E, Boolean> predicate) {
        Intrinsics.checkNotNullParameter(predicate, "predicate");
        int count = 0;
        Object[] content$iv = this.content;
        int i = this._size;
        for (int i$iv = 0; i$iv < i; i$iv++) {
            if (predicate.invoke(content$iv[i$iv]).booleanValue()) {
                count++;
            }
        }
        return count;
    }

    public final E first() {
        if (!isEmpty()) {
            return this.content[0];
        }
        throw new NoSuchElementException("ObjectList is empty.");
    }

    public final E first(Function1<? super E, Boolean> predicate) {
        Intrinsics.checkNotNullParameter(predicate, "predicate");
        Object[] content$iv = this.content;
        int i = this._size;
        for (int i$iv = 0; i$iv < i; i$iv++) {
            Object element = content$iv[i$iv];
            if (predicate.invoke(element).booleanValue()) {
                return element;
            }
        }
        throw new NoSuchElementException("ObjectList contains no element matching the predicate.");
    }

    public final E firstOrNull() {
        if (isEmpty()) {
            return null;
        }
        return get(0);
    }

    public final E firstOrNull(Function1<? super E, Boolean> predicate) {
        Intrinsics.checkNotNullParameter(predicate, "predicate");
        Object[] content$iv = this.content;
        int i = this._size;
        for (int i$iv = 0; i$iv < i; i$iv++) {
            Object element = content$iv[i$iv];
            if (predicate.invoke(element).booleanValue()) {
                return element;
            }
        }
        return null;
    }

    public final <R> R fold(R initial, Function2<? super R, ? super E, ? extends R> operation) {
        Intrinsics.checkNotNullParameter(operation, "operation");
        Object acc = initial;
        Object[] content$iv = this.content;
        int i = this._size;
        for (int i$iv = 0; i$iv < i; i$iv++) {
            acc = operation.invoke(acc, content$iv[i$iv]);
        }
        return acc;
    }

    public final <R> R foldIndexed(R initial, Function3<? super Integer, ? super R, ? super E, ? extends R> operation) {
        Intrinsics.checkNotNullParameter(operation, "operation");
        Object acc = initial;
        Object[] content$iv = this.content;
        int i = this._size;
        for (int i$iv = 0; i$iv < i; i$iv++) {
            acc = operation.invoke(Integer.valueOf(i$iv), acc, content$iv[i$iv]);
        }
        return acc;
    }

    public final <R> R foldRight(R initial, Function2<? super E, ? super R, ? extends R> operation) {
        Intrinsics.checkNotNullParameter(operation, "operation");
        Object acc = initial;
        Object[] content$iv = this.content;
        int i$iv = this._size;
        while (true) {
            i$iv--;
            if (-1 >= i$iv) {
                return acc;
            }
            acc = operation.invoke(content$iv[i$iv], acc);
        }
    }

    public final <R> R foldRightIndexed(R initial, Function3<? super Integer, ? super E, ? super R, ? extends R> operation) {
        Intrinsics.checkNotNullParameter(operation, "operation");
        Object acc = initial;
        Object[] content$iv = this.content;
        int i$iv = this._size;
        while (true) {
            i$iv--;
            if (-1 >= i$iv) {
                return acc;
            }
            acc = operation.invoke(Integer.valueOf(i$iv), content$iv[i$iv], acc);
        }
    }

    public final void forEach(Function1<? super E, Unit> block) {
        Intrinsics.checkNotNullParameter(block, "block");
        Object[] content2 = this.content;
        int i = this._size;
        for (int i2 = 0; i2 < i; i2++) {
            block.invoke(content2[i2]);
        }
    }

    public final void forEachIndexed(Function2<? super Integer, ? super E, Unit> block) {
        Intrinsics.checkNotNullParameter(block, "block");
        Object[] content2 = this.content;
        int i = this._size;
        for (int i2 = 0; i2 < i; i2++) {
            block.invoke(Integer.valueOf(i2), content2[i2]);
        }
    }

    public final void forEachReversed(Function1<? super E, Unit> block) {
        Intrinsics.checkNotNullParameter(block, "block");
        Object[] content2 = this.content;
        int i = this._size;
        while (true) {
            i--;
            if (-1 < i) {
                block.invoke(content2[i]);
            } else {
                return;
            }
        }
    }

    public final void forEachReversedIndexed(Function2<? super Integer, ? super E, Unit> block) {
        Intrinsics.checkNotNullParameter(block, "block");
        Object[] content2 = this.content;
        int i = this._size;
        while (true) {
            i--;
            if (-1 < i) {
                block.invoke(Integer.valueOf(i), content2[i]);
            } else {
                return;
            }
        }
    }

    public final E get(int index) {
        boolean z = false;
        if (index >= 0 && index < this._size) {
            z = true;
        }
        if (z) {
            return this.content[index];
        }
        throw new IndexOutOfBoundsException("Index " + index + " must be in 0.." + (this._size - 1));
    }

    public final E elementAt(int index) {
        boolean z = false;
        if (index >= 0 && index < this._size) {
            z = true;
        }
        if (z) {
            return this.content[index];
        }
        throw new IndexOutOfBoundsException("Index " + index + " must be in 0.." + (this._size - 1));
    }

    public final E elementAtOrElse(int index, Function1<? super Integer, ? extends E> defaultValue) {
        Intrinsics.checkNotNullParameter(defaultValue, "defaultValue");
        boolean z = false;
        if (index >= 0 && index < this._size) {
            z = true;
        }
        if (!z) {
            return defaultValue.invoke(Integer.valueOf(index));
        }
        return this.content[index];
    }

    public final int indexOf(E element) {
        if (element == null) {
            Object[] content$iv = this.content;
            int i = this._size;
            for (int i$iv = 0; i$iv < i; i$iv++) {
                int i2 = i$iv;
                if (content$iv[i$iv] == null) {
                    return i2;
                }
            }
            return -1;
        }
        Object[] content$iv2 = this.content;
        int i3 = this._size;
        for (int i$iv2 = 0; i$iv2 < i3; i$iv2++) {
            int i4 = i$iv2;
            if (element.equals(content$iv2[i$iv2])) {
                return i4;
            }
        }
        return -1;
    }

    public final int indexOfFirst(Function1<? super E, Boolean> predicate) {
        Intrinsics.checkNotNullParameter(predicate, "predicate");
        Object[] content$iv = this.content;
        int i = this._size;
        for (int i$iv = 0; i$iv < i; i$iv++) {
            int i2 = i$iv;
            if (predicate.invoke(content$iv[i$iv]).booleanValue()) {
                return i2;
            }
        }
        return -1;
    }

    public final int indexOfLast(Function1<? super E, Boolean> predicate) {
        Intrinsics.checkNotNullParameter(predicate, "predicate");
        Object[] content$iv = this.content;
        int i$iv = this._size;
        while (true) {
            i$iv--;
            if (-1 >= i$iv) {
                return -1;
            }
            int i = i$iv;
            if (predicate.invoke(content$iv[i$iv]).booleanValue()) {
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

    public final E last() {
        if (!isEmpty()) {
            return this.content[this._size - 1];
        }
        throw new NoSuchElementException("ObjectList is empty.");
    }

    public final E last(Function1<? super E, Boolean> predicate) {
        Intrinsics.checkNotNullParameter(predicate, "predicate");
        Object[] content$iv = this.content;
        int i$iv = this._size;
        while (true) {
            i$iv--;
            if (-1 < i$iv) {
                Object element = content$iv[i$iv];
                if (predicate.invoke(element).booleanValue()) {
                    return element;
                }
            } else {
                throw new NoSuchElementException("ObjectList contains no element matching the predicate.");
            }
        }
    }

    public final E lastOrNull() {
        if (isEmpty()) {
            return null;
        }
        return this.content[this._size - 1];
    }

    public final E lastOrNull(Function1<? super E, Boolean> predicate) {
        Intrinsics.checkNotNullParameter(predicate, "predicate");
        Object[] content$iv = this.content;
        int i$iv = this._size;
        while (true) {
            i$iv--;
            if (-1 >= i$iv) {
                return null;
            }
            Object element = content$iv[i$iv];
            if (predicate.invoke(element).booleanValue()) {
                return element;
            }
        }
    }

    public final int lastIndexOf(E element) {
        if (element == null) {
            Object[] content$iv = this.content;
            for (int i$iv = this._size - 1; -1 < i$iv; i$iv--) {
                int i = i$iv;
                if (content$iv[i$iv] == null) {
                    return i;
                }
            }
        } else {
            Object[] content$iv2 = this.content;
            for (int i$iv2 = this._size - 1; -1 < i$iv2; i$iv2--) {
                int i2 = i$iv2;
                if (element.equals(content$iv2[i$iv2])) {
                    return i2;
                }
            }
        }
        return -1;
    }

    public static /* synthetic */ String joinToString$default(ObjectList objectList, CharSequence charSequence, CharSequence charSequence2, CharSequence charSequence3, int i, CharSequence charSequence4, Function1 function1, int i2, Object obj) {
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
            return objectList.joinToString(charSequence, str, str2, i3, charSequence5, (i2 & 32) != 0 ? null : function1);
        }
        throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: joinToString");
    }

    public final String joinToString(CharSequence separator, CharSequence prefix, CharSequence postfix, int limit, CharSequence truncated, Function1<? super E, ? extends CharSequence> transform) {
        CharSequence charSequence = separator;
        CharSequence charSequence2 = prefix;
        CharSequence charSequence3 = postfix;
        CharSequence charSequence4 = truncated;
        Function1<? super E, ? extends CharSequence> function1 = transform;
        Intrinsics.checkNotNullParameter(charSequence, "separator");
        Intrinsics.checkNotNullParameter(charSequence2, "prefix");
        Intrinsics.checkNotNullParameter(charSequence3, "postfix");
        Intrinsics.checkNotNullParameter(charSequence4, "truncated");
        StringBuilder sb = new StringBuilder();
        StringBuilder $this$joinToString_u24lambda_u2437 = sb;
        $this$joinToString_u24lambda_u2437.append(charSequence2);
        Object[] content$iv = this.content;
        int i$iv = 0;
        int i = this._size;
        while (true) {
            if (i$iv >= i) {
                int i2 = limit;
                $this$joinToString_u24lambda_u2437.append(charSequence3);
                break;
            }
            Object element = content$iv[i$iv];
            int index = i$iv;
            if (index == limit) {
                $this$joinToString_u24lambda_u2437.append(charSequence4);
                break;
            }
            if (index != 0) {
                $this$joinToString_u24lambda_u2437.append(charSequence);
            }
            if (function1 == null) {
                $this$joinToString_u24lambda_u2437.append(element);
            } else {
                $this$joinToString_u24lambda_u2437.append((CharSequence) function1.invoke(element));
            }
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
        Object[] content$iv = this.content;
        int i = this._size;
        for (int i$iv = 0; i$iv < i; i$iv++) {
            Object element = content$iv[i$iv];
            hashCode += (element != null ? element.hashCode() : 0) * 31;
        }
        return hashCode;
    }

    public boolean equals(Object other) {
        if (!(other instanceof ObjectList) || ((ObjectList) other)._size != this._size) {
            return false;
        }
        Object[] content2 = this.content;
        Object[] otherContent = ((ObjectList) other).content;
        IntRange until = RangesKt.until(0, this._size);
        int i = until.getFirst();
        int last = until.getLast();
        if (i > last) {
            return true;
        }
        while (Intrinsics.areEqual(content2[i], otherContent[i])) {
            if (i == last) {
                return true;
            }
            i++;
        }
        return false;
    }

    public String toString() {
        return joinToString$default(this, (CharSequence) null, "[", "]", 0, (CharSequence) null, new ObjectList$toString$1(this), 25, (Object) null);
    }
}
