package androidx.collection;

import androidx.collection.internal.Lock;
import androidx.collection.internal.LruHashMap;
import java.util.LinkedHashMap;
import java.util.Map;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.Intrinsics;

@Metadata(d1 = {"\u0000@\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u000e\n\u0002\u0010%\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\b\u0016\u0018\u0000*\b\b\u0000\u0010\u0001*\u00020\u0002*\b\b\u0001\u0010\u0003*\u00020\u00022\u00020\u0002B\u000f\u0012\b\b\u0001\u0010\u0004\u001a\u00020\u0005¢\u0006\u0002\u0010\u0006J\u0017\u0010\u0011\u001a\u0004\u0018\u00018\u00012\u0006\u0010\u0012\u001a\u00028\u0000H\u0014¢\u0006\u0002\u0010\u0013J\u0006\u0010\u0007\u001a\u00020\u0005J/\u0010\u0014\u001a\u00020\u00152\u0006\u0010\u0016\u001a\u00020\u00172\u0006\u0010\u0012\u001a\u00028\u00002\u0006\u0010\u0018\u001a\u00028\u00012\b\u0010\u0019\u001a\u0004\u0018\u00018\u0001H\u0014¢\u0006\u0002\u0010\u001aJ\u0006\u0010\u001b\u001a\u00020\u0015J\u0006\u0010\b\u001a\u00020\u0005J\u0018\u0010\u001c\u001a\u0004\u0018\u00018\u00012\u0006\u0010\u0012\u001a\u00028\u0000H\u0002¢\u0006\u0002\u0010\u0013J\u0006\u0010\t\u001a\u00020\u0005J\u0006\u0010\u0004\u001a\u00020\u0005J\u0006\u0010\u000e\u001a\u00020\u0005J\u001d\u0010\u001d\u001a\u0004\u0018\u00018\u00012\u0006\u0010\u0012\u001a\u00028\u00002\u0006\u0010\u001e\u001a\u00028\u0001¢\u0006\u0002\u0010\u001fJ\u0006\u0010\u000f\u001a\u00020\u0005J\u0015\u0010 \u001a\u0004\u0018\u00018\u00012\u0006\u0010\u0012\u001a\u00028\u0000¢\u0006\u0002\u0010\u0013J\u0012\u0010!\u001a\u00020\u00152\b\b\u0001\u0010\u0004\u001a\u00020\u0005H\u0016J\u001d\u0010\"\u001a\u00020\u00052\u0006\u0010\u0012\u001a\u00028\u00002\u0006\u0010\u001e\u001a\u00028\u0001H\u0002¢\u0006\u0002\u0010#J\u0006\u0010\u0010\u001a\u00020\u0005J\u001d\u0010$\u001a\u00020\u00052\u0006\u0010\u0012\u001a\u00028\u00002\u0006\u0010\u001e\u001a\u00028\u0001H\u0014¢\u0006\u0002\u0010#J\u0012\u0010%\u001a\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010&J\b\u0010'\u001a\u00020(H\u0016J\u0010\u0010)\u001a\u00020\u00152\u0006\u0010\u0004\u001a\u00020\u0005H\u0016R\u000e\u0010\u0007\u001a\u00020\u0005X\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\b\u001a\u00020\u0005X\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\t\u001a\u00020\u0005X\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\n\u001a\u00020\u000bX\u0004¢\u0006\u0002\n\u0000R\u001a\u0010\f\u001a\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\rX\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0004\u001a\u00020\u0005X\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u000e\u001a\u00020\u0005X\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u000f\u001a\u00020\u0005X\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u0010\u001a\u00020\u0005X\u000e¢\u0006\u0002\n\u0000¨\u0006*"}, d2 = {"Landroidx/collection/LruCache;", "K", "", "V", "maxSize", "", "(I)V", "createCount", "evictionCount", "hitCount", "lock", "Landroidx/collection/internal/Lock;", "map", "Landroidx/collection/internal/LruHashMap;", "missCount", "putCount", "size", "create", "key", "(Ljava/lang/Object;)Ljava/lang/Object;", "entryRemoved", "", "evicted", "", "oldValue", "newValue", "(ZLjava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;)V", "evictAll", "get", "put", "value", "(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;", "remove", "resize", "safeSizeOf", "(Ljava/lang/Object;Ljava/lang/Object;)I", "sizeOf", "snapshot", "", "toString", "", "trimToSize", "collection"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* compiled from: LruCache.kt */
public class LruCache<K, V> {
    private int createCount;
    private int evictionCount;
    private int hitCount;
    private final Lock lock;
    private final LruHashMap<K, V> map;
    private int maxSize;
    private int missCount;
    private int putCount;
    private int size;

    public LruCache(int maxSize2) {
        this.maxSize = maxSize2;
        if (this.maxSize > 0) {
            this.map = new LruHashMap<>(0, 0.75f);
            this.lock = new Lock();
            return;
        }
        throw new IllegalArgumentException("maxSize <= 0".toString());
    }

    public void resize(int maxSize2) {
        if (maxSize2 > 0) {
            synchronized (this.lock) {
                this.maxSize = maxSize2;
                Unit unit = Unit.INSTANCE;
            }
            trimToSize(maxSize2);
            return;
        }
        throw new IllegalArgumentException("maxSize <= 0".toString());
    }

    /* JADX WARNING: Code restructure failed: missing block: B:12:0x0027, code lost:
        r1 = create(r10);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:13:0x002c, code lost:
        if (r1 != null) goto L_0x0030;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:14:0x002e, code lost:
        return null;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:15:0x0030, code lost:
        r4 = r9.lock;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:16:0x0036, code lost:
        monitor-enter(r4);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:19:?, code lost:
        r9.createCount++;
        r0 = r9.map.put(r10, r1);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:20:0x0045, code lost:
        if (r0 == null) goto L_0x004d;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:21:0x0047, code lost:
        r9.map.put(r10, r0);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:22:0x004d, code lost:
        r9.size += safeSizeOf(r10, r1);
        r7 = kotlin.Unit.INSTANCE;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:23:0x0059, code lost:
        monitor-exit(r4);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:24:0x005b, code lost:
        if (r0 == null) goto L_0x0063;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:25:0x005d, code lost:
        entryRemoved(false, r10, r1, r0);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:26:0x0063, code lost:
        trimToSize(r9.maxSize);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:33:?, code lost:
        return r1;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:34:?, code lost:
        return r0;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final V get(K r10) {
        /*
            r9 = this;
            java.lang.String r0 = "key"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r10, r0)
            r0 = 0
            androidx.collection.internal.Lock r1 = r9.lock
            r2 = 0
            r3 = r1
            r4 = 0
            monitor-enter(r3)
            r5 = 0
            androidx.collection.internal.LruHashMap<K, V> r6 = r9.map     // Catch:{ all -> 0x006d }
            java.lang.Object r6 = r6.get(r10)     // Catch:{ all -> 0x006d }
            r0 = r6
            if (r0 == 0) goto L_0x0020
            int r6 = r9.hitCount     // Catch:{ all -> 0x006d }
            int r6 = r6 + 1
            r9.hitCount = r6     // Catch:{ all -> 0x006d }
            monitor-exit(r3)
            return r0
        L_0x0020:
            int r6 = r9.missCount     // Catch:{ all -> 0x006d }
            int r6 = r6 + 1
            r9.missCount = r6     // Catch:{ all -> 0x006d }
            monitor-exit(r3)
            java.lang.Object r1 = r9.create(r10)
            if (r1 != 0) goto L_0x0030
            r1 = 0
            return r1
        L_0x0030:
            androidx.collection.internal.Lock r2 = r9.lock
            r3 = 0
            r4 = r2
            r5 = 0
            monitor-enter(r4)
            r6 = 0
            int r7 = r9.createCount     // Catch:{ all -> 0x006a }
            int r7 = r7 + 1
            r9.createCount = r7     // Catch:{ all -> 0x006a }
            androidx.collection.internal.LruHashMap<K, V> r7 = r9.map     // Catch:{ all -> 0x006a }
            java.lang.Object r7 = r7.put(r10, r1)     // Catch:{ all -> 0x006a }
            r0 = r7
            if (r0 == 0) goto L_0x004d
            androidx.collection.internal.LruHashMap<K, V> r7 = r9.map     // Catch:{ all -> 0x006a }
            r7.put(r10, r0)     // Catch:{ all -> 0x006a }
            goto L_0x0058
        L_0x004d:
            int r7 = r9.size     // Catch:{ all -> 0x006a }
            int r8 = r9.safeSizeOf(r10, r1)     // Catch:{ all -> 0x006a }
            int r7 = r7 + r8
            r9.size = r7     // Catch:{ all -> 0x006a }
            kotlin.Unit r7 = kotlin.Unit.INSTANCE     // Catch:{ all -> 0x006a }
        L_0x0058:
            monitor-exit(r4)
            if (r0 == 0) goto L_0x0063
            r2 = 0
            r9.entryRemoved(r2, r10, r1, r0)
            r2 = r0
            goto L_0x0069
        L_0x0063:
            int r2 = r9.maxSize
            r9.trimToSize(r2)
            r2 = r1
        L_0x0069:
            return r2
        L_0x006a:
            r6 = move-exception
            monitor-exit(r4)
            throw r6
        L_0x006d:
            r5 = move-exception
            monitor-exit(r3)
            throw r5
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.collection.LruCache.get(java.lang.Object):java.lang.Object");
    }

    public final V put(K key, V value) {
        Object previous;
        Intrinsics.checkNotNullParameter(key, "key");
        Intrinsics.checkNotNullParameter(value, "value");
        synchronized (this.lock) {
            this.putCount++;
            this.size += safeSizeOf(key, value);
            previous = this.map.put(key, value);
            if (previous != null) {
                this.size -= safeSizeOf(key, previous);
            }
            Unit unit = Unit.INSTANCE;
        }
        if (previous != null) {
            entryRemoved(false, key, previous, value);
        }
        trimToSize(this.maxSize);
        return previous;
    }

    public void trimToSize(int maxSize2) {
        Object key;
        Object value;
        while (true) {
            synchronized (this.lock) {
                if (!(this.size >= 0 && (!this.map.isEmpty() || this.size == 0))) {
                    throw new IllegalStateException("LruCache.sizeOf() is reporting inconsistent results!".toString());
                } else if (this.size <= maxSize2) {
                    break;
                } else if (this.map.isEmpty()) {
                    break;
                } else {
                    Map.Entry toEvict = (Map.Entry) CollectionsKt.firstOrNull(this.map.getEntries());
                    if (toEvict != null) {
                        key = toEvict.getKey();
                        value = toEvict.getValue();
                        this.map.remove(key);
                        this.size -= safeSizeOf(key, value);
                        this.evictionCount++;
                    } else {
                        return;
                    }
                }
            }
            entryRemoved(true, key, value, (Object) null);
        }
    }

    public final V remove(K key) {
        Object previous;
        Intrinsics.checkNotNullParameter(key, "key");
        synchronized (this.lock) {
            previous = this.map.remove(key);
            if (previous != null) {
                this.size -= safeSizeOf(key, previous);
            }
            Unit unit = Unit.INSTANCE;
        }
        if (previous != null) {
            entryRemoved(false, key, previous, (Object) null);
        }
        return previous;
    }

    /* access modifiers changed from: protected */
    public void entryRemoved(boolean evicted, K key, V oldValue, V newValue) {
        Intrinsics.checkNotNullParameter(key, "key");
        Intrinsics.checkNotNullParameter(oldValue, "oldValue");
    }

    /* access modifiers changed from: protected */
    public V create(K key) {
        Intrinsics.checkNotNullParameter(key, "key");
        return null;
    }

    private final int safeSizeOf(K key, V value) {
        int result = sizeOf(key, value);
        if (result >= 0) {
            return result;
        }
        throw new IllegalStateException(("Negative size: " + key + '=' + value).toString());
    }

    /* access modifiers changed from: protected */
    public int sizeOf(K key, V value) {
        Intrinsics.checkNotNullParameter(key, "key");
        Intrinsics.checkNotNullParameter(value, "value");
        return 1;
    }

    public final void evictAll() {
        trimToSize(-1);
    }

    public final int size() {
        int i;
        synchronized (this.lock) {
            i = this.size;
        }
        return i;
    }

    public final int maxSize() {
        int i;
        synchronized (this.lock) {
            i = this.maxSize;
        }
        return i;
    }

    public final int hitCount() {
        int i;
        synchronized (this.lock) {
            i = this.hitCount;
        }
        return i;
    }

    public final int missCount() {
        int i;
        synchronized (this.lock) {
            i = this.missCount;
        }
        return i;
    }

    public final int createCount() {
        int i;
        synchronized (this.lock) {
            i = this.createCount;
        }
        return i;
    }

    public final int putCount() {
        int i;
        synchronized (this.lock) {
            i = this.putCount;
        }
        return i;
    }

    public final int evictionCount() {
        int i;
        synchronized (this.lock) {
            i = this.evictionCount;
        }
        return i;
    }

    public final Map<K, V> snapshot() {
        LinkedHashMap copy = new LinkedHashMap();
        synchronized (this.lock) {
            for (Map.Entry entry : this.map.getEntries()) {
                copy.put(entry.getKey(), entry.getValue());
            }
            Unit unit = Unit.INSTANCE;
        }
        return copy;
    }

    public String toString() {
        int hitPercent;
        String str;
        synchronized (this.lock) {
            int accesses = this.hitCount + this.missCount;
            if (accesses != 0) {
                hitPercent = (this.hitCount * 100) / accesses;
            } else {
                hitPercent = 0;
            }
            str = "LruCache[maxSize=" + this.maxSize + ",hits=" + this.hitCount + ",misses=" + this.missCount + ",hitRate=" + hitPercent + "%]";
        }
        return str;
    }
}
