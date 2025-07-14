package androidx.collection;

import java.util.Collection;
import java.util.Iterator;
import java.util.Set;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.CollectionToArray;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.markers.KMutableSet;

@Metadata(d1 = {"\u00001\n\u0000\n\u0002\u0010#\n\u0000\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0010\u001e\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0004\n\u0002\u0010)\n\u0002\b\u0004*\u0001\u0000\b\n\u0018\u00002\b\u0012\u0004\u0012\u00028\u00000\u0001J\u0015\u0010\u0006\u001a\u00020\u00072\u0006\u0010\b\u001a\u00028\u0000H\u0016¢\u0006\u0002\u0010\tJ\u0016\u0010\n\u001a\u00020\u00072\f\u0010\u000b\u001a\b\u0012\u0004\u0012\u00028\u00000\fH\u0016J\b\u0010\r\u001a\u00020\u000eH\u0016J\u0016\u0010\u000f\u001a\u00020\u00072\u0006\u0010\b\u001a\u00028\u0000H\u0002¢\u0006\u0002\u0010\tJ\u0016\u0010\u0010\u001a\u00020\u00072\f\u0010\u000b\u001a\b\u0012\u0004\u0012\u00028\u00000\fH\u0016J\b\u0010\u0011\u001a\u00020\u0007H\u0016J\u000f\u0010\u0012\u001a\b\u0012\u0004\u0012\u00028\u00000\u0013H\u0002J\u0015\u0010\u0014\u001a\u00020\u00072\u0006\u0010\b\u001a\u00028\u0000H\u0016¢\u0006\u0002\u0010\tJ\u0016\u0010\u0015\u001a\u00020\u00072\f\u0010\u000b\u001a\b\u0012\u0004\u0012\u00028\u00000\fH\u0016J\u0016\u0010\u0016\u001a\u00020\u00072\f\u0010\u000b\u001a\b\u0012\u0004\u0012\u00028\u00000\fH\u0016R\u0014\u0010\u0002\u001a\u00020\u00038VX\u0004¢\u0006\u0006\u001a\u0004\b\u0004\u0010\u0005¨\u0006\u0017"}, d2 = {"androidx/collection/MutableScatterMap$MutableMapWrapper$keys$1", "", "size", "", "getSize", "()I", "add", "", "element", "(Ljava/lang/Object;)Z", "addAll", "elements", "", "clear", "", "contains", "containsAll", "isEmpty", "iterator", "", "remove", "removeAll", "retainAll", "collection"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* compiled from: ScatterMap.kt */
public final class MutableScatterMap$MutableMapWrapper$keys$1 implements Set<K>, KMutableSet {
    final /* synthetic */ MutableScatterMap<K, V> this$0;

    public Object[] toArray() {
        return CollectionToArray.toArray(this);
    }

    public <T> T[] toArray(T[] tArr) {
        Intrinsics.checkNotNullParameter(tArr, "array");
        return CollectionToArray.toArray(this, tArr);
    }

    MutableScatterMap$MutableMapWrapper$keys$1(MutableScatterMap<K, V> $receiver) {
        this.this$0 = $receiver;
    }

    public final /* bridge */ int size() {
        return getSize();
    }

    public int getSize() {
        return this.this$0._size;
    }

    public boolean isEmpty() {
        return this.this$0.isEmpty();
    }

    public Iterator<K> iterator() {
        return new MutableScatterMap$MutableMapWrapper$keys$1$iterator$1(this.this$0);
    }

    public void clear() {
        this.this$0.clear();
    }

    public boolean addAll(Collection<? extends K> elements) {
        Intrinsics.checkNotNullParameter(elements, "elements");
        throw new UnsupportedOperationException();
    }

    public boolean add(K element) {
        throw new UnsupportedOperationException();
    }

    public boolean retainAll(Collection<? extends Object> elements) {
        Collection<? extends Object> collection = elements;
        Intrinsics.checkNotNullParameter(collection, "elements");
        boolean changed = false;
        MutableScatterMap<K, V> mutableScatterMap = this.this$0;
        long[] m$iv = this.this$0.metadata;
        int lastIndex$iv = m$iv.length - 2;
        int i$iv = 0;
        if (0 <= lastIndex$iv) {
            while (true) {
                long slot$iv = m$iv[i$iv];
                long $this$maskEmptyOrDeleted$iv$iv = slot$iv;
                if ((((~$this$maskEmptyOrDeleted$iv$iv) << 7) & $this$maskEmptyOrDeleted$iv$iv & -9187201950435737472L) != -9187201950435737472L) {
                    int i = 8;
                    int bitCount$iv = 8 - ((~(i$iv - lastIndex$iv)) >>> 31);
                    int j$iv = 0;
                    while (j$iv < bitCount$iv) {
                        if ((255 & slot$iv) < 128) {
                            int index = (i$iv << 3) + j$iv;
                            if (!CollectionsKt.contains(collection, mutableScatterMap.keys[index])) {
                                mutableScatterMap.removeValueAt(index);
                                changed = true;
                            }
                        }
                        slot$iv >>= 8;
                        j$iv++;
                        i = 8;
                    }
                    if (bitCount$iv != i) {
                        break;
                    }
                }
                if (i$iv == lastIndex$iv) {
                    break;
                }
                i$iv++;
            }
        }
        return changed;
    }

    public boolean removeAll(Collection<? extends Object> elements) {
        Collection<? extends Object> collection = elements;
        Intrinsics.checkNotNullParameter(collection, "elements");
        boolean changed = false;
        MutableScatterMap<K, V> mutableScatterMap = this.this$0;
        long[] m$iv = this.this$0.metadata;
        int lastIndex$iv = m$iv.length - 2;
        int i$iv = 0;
        if (0 <= lastIndex$iv) {
            while (true) {
                long slot$iv = m$iv[i$iv];
                long $this$maskEmptyOrDeleted$iv$iv = slot$iv;
                if ((((~$this$maskEmptyOrDeleted$iv$iv) << 7) & $this$maskEmptyOrDeleted$iv$iv & -9187201950435737472L) != -9187201950435737472L) {
                    int i = 8;
                    int bitCount$iv = 8 - ((~(i$iv - lastIndex$iv)) >>> 31);
                    int j$iv = 0;
                    while (j$iv < bitCount$iv) {
                        if ((255 & slot$iv) < 128) {
                            int index = (i$iv << 3) + j$iv;
                            if (CollectionsKt.contains(collection, mutableScatterMap.keys[index])) {
                                mutableScatterMap.removeValueAt(index);
                                changed = true;
                            }
                        }
                        slot$iv >>= 8;
                        j$iv++;
                        i = 8;
                    }
                    if (bitCount$iv != i) {
                        break;
                    }
                }
                if (i$iv == lastIndex$iv) {
                    break;
                }
                i$iv++;
            }
        }
        return changed;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:14:0x0099, code lost:
        r10 = r5;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:15:0x00a7, code lost:
        if (((((~r10) << 6) & r10) & -9187201950435737472L) == 0) goto L_0x00b6;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:16:0x00a9, code lost:
        r10 = -1;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public boolean remove(java.lang.Object r25) {
        /*
            r24 = this;
            r0 = r24
            r1 = r25
            androidx.collection.MutableScatterMap<K, V> r2 = r0.this$0
            androidx.collection.ScatterMap r2 = (androidx.collection.ScatterMap) r2
            r3 = 0
            r4 = 0
            if (r1 == 0) goto L_0x0011
            int r6 = r25.hashCode()
            goto L_0x0012
        L_0x0011:
            r6 = 0
        L_0x0012:
            r7 = -862048943(0xffffffffcc9e2d51, float:-8.2930312E7)
            int r6 = r6 * r7
            int r7 = r6 << 16
            r4 = r6 ^ r7
            r6 = 0
            r6 = r4 & 127(0x7f, float:1.78E-43)
            int r7 = r2._capacity
            r8 = 0
            int r8 = r4 >>> 7
            r8 = r8 & r7
            r9 = 0
        L_0x0026:
            long[] r10 = r2.metadata
            r11 = 0
            int r12 = r8 >> 3
            r13 = r8 & 7
            int r13 = r13 << 3
            r14 = r10[r12]
            long r14 = r14 >>> r13
            int r16 = r12 + 1
            r16 = r10[r16]
            int r18 = 64 - r13
            long r16 = r16 << r18
            r19 = r6
            long r5 = (long) r13
            long r5 = -r5
            r20 = 63
            long r5 = r5 >> r20
            long r5 = r16 & r5
            long r5 = r5 | r14
            r10 = r5
            r12 = 0
            r13 = r19
            long r14 = (long) r13
            r16 = 72340172838076673(0x101010101010101, double:7.748604185489348E-304)
            long r14 = r14 * r16
            long r14 = r14 ^ r10
            long r16 = r14 - r16
            r19 = r3
            r20 = r4
            long r3 = ~r14
            long r3 = r16 & r3
            r16 = -9187201950435737472(0x8080808080808080, double:-2.937446524422997E-306)
            long r3 = r3 & r16
        L_0x0065:
            r10 = r3
            r12 = 0
            r14 = 0
            int r21 = (r10 > r14 ? 1 : (r10 == r14 ? 0 : -1))
            r22 = 1
            if (r21 == 0) goto L_0x0072
            r10 = r22
            goto L_0x0073
        L_0x0072:
            r10 = 0
        L_0x0073:
            if (r10 == 0) goto L_0x0099
            r10 = r3
            r12 = 0
            r14 = r10
            r21 = 0
            int r23 = java.lang.Long.numberOfTrailingZeros(r14)
            int r14 = r23 >> 3
            int r14 = r14 + r8
            r10 = r14 & r7
            java.lang.Object[] r11 = r2.keys
            r11 = r11[r10]
            boolean r11 = kotlin.jvm.internal.Intrinsics.areEqual((java.lang.Object) r11, (java.lang.Object) r1)
            if (r11 == 0) goto L_0x008f
            goto L_0x00ab
        L_0x008f:
            r11 = r3
            r14 = 0
            r21 = 1
            long r21 = r11 - r21
            long r11 = r11 & r21
            r3 = r11
            goto L_0x0065
        L_0x0099:
            r10 = r5
            r12 = 0
            long r14 = ~r10
            r21 = 6
            long r14 = r14 << r21
            long r14 = r14 & r10
            long r10 = r14 & r16
            r14 = 0
            int r10 = (r10 > r14 ? 1 : (r10 == r14 ? 0 : -1))
            if (r10 == 0) goto L_0x00b6
            r10 = -1
        L_0x00ab:
            r2 = r10
            if (r2 < 0) goto L_0x00b4
            androidx.collection.MutableScatterMap<K, V> r3 = r0.this$0
            r3.removeValueAt(r2)
            return r22
        L_0x00b4:
            r10 = 0
            return r10
        L_0x00b6:
            r10 = 0
            int r9 = r9 + 8
            int r11 = r8 + r9
            r8 = r11 & r7
            r6 = r13
            r3 = r19
            r4 = r20
            goto L_0x0026
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.collection.MutableScatterMap$MutableMapWrapper$keys$1.remove(java.lang.Object):boolean");
    }

    public boolean containsAll(Collection<? extends Object> elements) {
        Intrinsics.checkNotNullParameter(elements, "elements");
        Iterable<Object> $this$all$iv = elements;
        MutableScatterMap<K, V> mutableScatterMap = this.this$0;
        if (((Collection) $this$all$iv).isEmpty()) {
            return true;
        }
        for (Object element$iv : $this$all$iv) {
            if (!mutableScatterMap.containsKey(element$iv)) {
                return false;
            }
        }
        return true;
    }

    public boolean contains(Object element) {
        return this.this$0.containsKey(element);
    }
}
