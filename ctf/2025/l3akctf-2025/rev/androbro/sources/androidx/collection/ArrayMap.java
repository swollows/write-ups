package androidx.collection;

import androidx.collection.internal.ContainerHelpersKt;
import java.util.AbstractSet;
import java.util.Collection;
import java.util.Iterator;
import java.util.Map;
import java.util.NoSuchElementException;
import java.util.Set;

public class ArrayMap<K, V> extends SimpleArrayMap<K, V> implements Map<K, V> {
    ArrayMap<K, V>.EntrySet mEntrySet;
    ArrayMap<K, V>.KeySet mKeySet;
    ArrayMap<K, V>.ValueCollection mValues;

    public ArrayMap() {
    }

    public ArrayMap(int capacity) {
        super(capacity);
    }

    public ArrayMap(SimpleArrayMap map) {
        super(map);
    }

    public boolean containsAll(Collection<?> collection) {
        for (Object o : collection) {
            if (!containsKey(o)) {
                return false;
            }
        }
        return true;
    }

    public boolean containsKey(Object key) {
        return super.containsKey(key);
    }

    public boolean containsValue(Object value) {
        return super.containsValue(value);
    }

    public V get(Object key) {
        return super.get(key);
    }

    public V remove(Object key) {
        return super.remove(key);
    }

    public void putAll(Map<? extends K, ? extends V> map) {
        ensureCapacity(size() + map.size());
        for (Map.Entry<? extends K, ? extends V> entry : map.entrySet()) {
            put(entry.getKey(), entry.getValue());
        }
    }

    public boolean removeAll(Collection<?> collection) {
        int oldSize = size();
        for (Object o : collection) {
            remove(o);
        }
        return oldSize != size();
    }

    public boolean retainAll(Collection<?> collection) {
        int oldSize = size();
        for (int i = size() - 1; i >= 0; i--) {
            if (!collection.contains(keyAt(i))) {
                removeAt(i);
            }
        }
        if (oldSize != size()) {
            return true;
        }
        return false;
    }

    public Set<Map.Entry<K, V>> entrySet() {
        Set<Map.Entry<K, V>> entrySet = this.mEntrySet;
        if (entrySet != null) {
            return entrySet;
        }
        ArrayMap<K, V>.EntrySet entrySet2 = new EntrySet();
        this.mEntrySet = entrySet2;
        return entrySet2;
    }

    public Set<K> keySet() {
        Set<K> keySet = this.mKeySet;
        if (keySet != null) {
            return keySet;
        }
        ArrayMap<K, V>.KeySet keySet2 = new KeySet();
        this.mKeySet = keySet2;
        return keySet2;
    }

    public Collection<V> values() {
        Collection<V> values = this.mValues;
        if (values != null) {
            return values;
        }
        ArrayMap<K, V>.ValueCollection values2 = new ValueCollection();
        this.mValues = values2;
        return values2;
    }

    final class EntrySet extends AbstractSet<Map.Entry<K, V>> {
        EntrySet() {
        }

        public Iterator<Map.Entry<K, V>> iterator() {
            return new MapIterator();
        }

        public int size() {
            return ArrayMap.this.size();
        }
    }

    final class KeySet implements Set<K> {
        KeySet() {
        }

        public boolean add(K k) {
            throw new UnsupportedOperationException();
        }

        public boolean addAll(Collection<? extends K> collection) {
            throw new UnsupportedOperationException();
        }

        public void clear() {
            ArrayMap.this.clear();
        }

        public boolean contains(Object object) {
            return ArrayMap.this.containsKey(object);
        }

        public boolean containsAll(Collection<?> collection) {
            return ArrayMap.this.containsAll(collection);
        }

        public boolean isEmpty() {
            return ArrayMap.this.isEmpty();
        }

        public Iterator<K> iterator() {
            return new KeyIterator();
        }

        public boolean remove(Object object) {
            int index = ArrayMap.this.indexOfKey(object);
            if (index < 0) {
                return false;
            }
            ArrayMap.this.removeAt(index);
            return true;
        }

        public boolean removeAll(Collection<?> collection) {
            return ArrayMap.this.removeAll(collection);
        }

        public boolean retainAll(Collection<?> collection) {
            return ArrayMap.this.retainAll(collection);
        }

        public int size() {
            return ArrayMap.this.size();
        }

        public Object[] toArray() {
            int N = ArrayMap.this.size();
            Object[] result = new Object[N];
            for (int i = 0; i < N; i++) {
                result[i] = ArrayMap.this.keyAt(i);
            }
            return result;
        }

        /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r1v8, resolved type: java.lang.Object} */
        /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r4v2, resolved type: T[]} */
        /* JADX WARNING: Multi-variable type inference failed */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public <T> T[] toArray(T[] r4) {
            /*
                r3 = this;
                int r0 = r3.size()
                int r1 = r4.length
                if (r1 >= r0) goto L_0x0016
                java.lang.Class r1 = r4.getClass()
                java.lang.Class r1 = r1.getComponentType()
                java.lang.Object r1 = java.lang.reflect.Array.newInstance(r1, r0)
                r4 = r1
                java.lang.Object[] r4 = (java.lang.Object[]) r4
            L_0x0016:
                r1 = 0
            L_0x0017:
                if (r1 >= r0) goto L_0x0024
                androidx.collection.ArrayMap r2 = androidx.collection.ArrayMap.this
                java.lang.Object r2 = r2.keyAt(r1)
                r4[r1] = r2
                int r1 = r1 + 1
                goto L_0x0017
            L_0x0024:
                int r1 = r4.length
                if (r1 <= r0) goto L_0x002a
                r1 = 0
                r4[r0] = r1
            L_0x002a:
                return r4
            */
            throw new UnsupportedOperationException("Method not decompiled: androidx.collection.ArrayMap.KeySet.toArray(java.lang.Object[]):java.lang.Object[]");
        }

        public boolean equals(Object object) {
            return ArrayMap.equalsSetHelper(this, object);
        }

        public int hashCode() {
            int result = 0;
            for (int i = ArrayMap.this.size() - 1; i >= 0; i--) {
                K obj = ArrayMap.this.keyAt(i);
                result += obj == null ? 0 : obj.hashCode();
            }
            return result;
        }
    }

    final class ValueCollection implements Collection<V> {
        ValueCollection() {
        }

        public boolean add(V v) {
            throw new UnsupportedOperationException();
        }

        public boolean addAll(Collection<? extends V> collection) {
            throw new UnsupportedOperationException();
        }

        public void clear() {
            ArrayMap.this.clear();
        }

        public boolean contains(Object object) {
            return ArrayMap.this.__restricted$indexOfValue(object) >= 0;
        }

        public boolean containsAll(Collection<?> collection) {
            for (Object o : collection) {
                if (!contains(o)) {
                    return false;
                }
            }
            return true;
        }

        public boolean isEmpty() {
            return ArrayMap.this.isEmpty();
        }

        public Iterator<V> iterator() {
            return new ValueIterator();
        }

        public boolean remove(Object object) {
            int index = ArrayMap.this.__restricted$indexOfValue(object);
            if (index < 0) {
                return false;
            }
            ArrayMap.this.removeAt(index);
            return true;
        }

        public boolean removeAll(Collection<?> collection) {
            int N = ArrayMap.this.size();
            boolean changed = false;
            int i = 0;
            while (i < N) {
                if (collection.contains(ArrayMap.this.valueAt(i))) {
                    ArrayMap.this.removeAt(i);
                    i--;
                    N--;
                    changed = true;
                }
                i++;
            }
            return changed;
        }

        public boolean retainAll(Collection<?> collection) {
            int N = ArrayMap.this.size();
            boolean changed = false;
            int i = 0;
            while (i < N) {
                if (!collection.contains(ArrayMap.this.valueAt(i))) {
                    ArrayMap.this.removeAt(i);
                    i--;
                    N--;
                    changed = true;
                }
                i++;
            }
            return changed;
        }

        public int size() {
            return ArrayMap.this.size();
        }

        public Object[] toArray() {
            int N = ArrayMap.this.size();
            Object[] result = new Object[N];
            for (int i = 0; i < N; i++) {
                result[i] = ArrayMap.this.valueAt(i);
            }
            return result;
        }

        /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r1v8, resolved type: java.lang.Object} */
        /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r4v2, resolved type: T[]} */
        /* JADX WARNING: Multi-variable type inference failed */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public <T> T[] toArray(T[] r4) {
            /*
                r3 = this;
                int r0 = r3.size()
                int r1 = r4.length
                if (r1 >= r0) goto L_0x0016
                java.lang.Class r1 = r4.getClass()
                java.lang.Class r1 = r1.getComponentType()
                java.lang.Object r1 = java.lang.reflect.Array.newInstance(r1, r0)
                r4 = r1
                java.lang.Object[] r4 = (java.lang.Object[]) r4
            L_0x0016:
                r1 = 0
            L_0x0017:
                if (r1 >= r0) goto L_0x0024
                androidx.collection.ArrayMap r2 = androidx.collection.ArrayMap.this
                java.lang.Object r2 = r2.valueAt(r1)
                r4[r1] = r2
                int r1 = r1 + 1
                goto L_0x0017
            L_0x0024:
                int r1 = r4.length
                if (r1 <= r0) goto L_0x002a
                r1 = 0
                r4[r0] = r1
            L_0x002a:
                return r4
            */
            throw new UnsupportedOperationException("Method not decompiled: androidx.collection.ArrayMap.ValueCollection.toArray(java.lang.Object[]):java.lang.Object[]");
        }
    }

    final class KeyIterator extends IndexBasedArrayIterator<K> {
        KeyIterator() {
            super(ArrayMap.this.size());
        }

        /* access modifiers changed from: protected */
        public K elementAt(int index) {
            return ArrayMap.this.keyAt(index);
        }

        /* access modifiers changed from: protected */
        public void removeAt(int index) {
            ArrayMap.this.removeAt(index);
        }
    }

    final class ValueIterator extends IndexBasedArrayIterator<V> {
        ValueIterator() {
            super(ArrayMap.this.size());
        }

        /* access modifiers changed from: protected */
        public V elementAt(int index) {
            return ArrayMap.this.valueAt(index);
        }

        /* access modifiers changed from: protected */
        public void removeAt(int index) {
            ArrayMap.this.removeAt(index);
        }
    }

    final class MapIterator implements Iterator<Map.Entry<K, V>>, Map.Entry<K, V> {
        int mEnd;
        boolean mEntryValid;
        int mIndex = -1;

        MapIterator() {
            this.mEnd = ArrayMap.this.size() - 1;
        }

        public boolean hasNext() {
            return this.mIndex < this.mEnd;
        }

        public Map.Entry<K, V> next() {
            if (hasNext()) {
                this.mIndex++;
                this.mEntryValid = true;
                return this;
            }
            throw new NoSuchElementException();
        }

        public void remove() {
            if (this.mEntryValid) {
                ArrayMap.this.removeAt(this.mIndex);
                this.mIndex--;
                this.mEnd--;
                this.mEntryValid = false;
                return;
            }
            throw new IllegalStateException();
        }

        public K getKey() {
            if (this.mEntryValid) {
                return ArrayMap.this.keyAt(this.mIndex);
            }
            throw new IllegalStateException("This container does not support retaining Map.Entry objects");
        }

        public V getValue() {
            if (this.mEntryValid) {
                return ArrayMap.this.valueAt(this.mIndex);
            }
            throw new IllegalStateException("This container does not support retaining Map.Entry objects");
        }

        public V setValue(V object) {
            if (this.mEntryValid) {
                return ArrayMap.this.setValueAt(this.mIndex, object);
            }
            throw new IllegalStateException("This container does not support retaining Map.Entry objects");
        }

        public boolean equals(Object o) {
            if (!this.mEntryValid) {
                throw new IllegalStateException("This container does not support retaining Map.Entry objects");
            } else if (!(o instanceof Map.Entry)) {
                return false;
            } else {
                Map.Entry<?, ?> e = (Map.Entry) o;
                if (!ContainerHelpersKt.equal(e.getKey(), ArrayMap.this.keyAt(this.mIndex)) || !ContainerHelpersKt.equal(e.getValue(), ArrayMap.this.valueAt(this.mIndex))) {
                    return false;
                }
                return true;
            }
        }

        public int hashCode() {
            if (this.mEntryValid) {
                K key = ArrayMap.this.keyAt(this.mIndex);
                V value = ArrayMap.this.valueAt(this.mIndex);
                int i = 0;
                int hashCode = key == null ? 0 : key.hashCode();
                if (value != null) {
                    i = value.hashCode();
                }
                return i ^ hashCode;
            }
            throw new IllegalStateException("This container does not support retaining Map.Entry objects");
        }

        public String toString() {
            return getKey() + "=" + getValue();
        }
    }

    static <T> boolean equalsSetHelper(Set<T> set, Object object) {
        if (set == object) {
            return true;
        }
        if (object instanceof Set) {
            Set<?> s = (Set) object;
            try {
                if (set.size() != s.size() || !set.containsAll(s)) {
                    return false;
                }
                return true;
            } catch (ClassCastException | NullPointerException e) {
            }
        }
        return false;
    }
}
