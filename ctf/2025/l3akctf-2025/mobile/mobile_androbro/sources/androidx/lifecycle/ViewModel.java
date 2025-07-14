package androidx.lifecycle;

import java.io.Closeable;
import java.io.IOException;
import java.util.Arrays;
import java.util.HashMap;
import java.util.LinkedHashSet;
import java.util.Map;
import java.util.Set;

public abstract class ViewModel {
    private final Map<String, Object> mBagOfTags = new HashMap();
    private volatile boolean mCleared = false;
    private final Set<Closeable> mCloseables = new LinkedHashSet();

    public ViewModel() {
    }

    public ViewModel(Closeable... closeables) {
        this.mCloseables.addAll(Arrays.asList(closeables));
    }

    public void addCloseable(Closeable closeable) {
        if (this.mCloseables != null) {
            synchronized (this.mCloseables) {
                this.mCloseables.add(closeable);
            }
        }
    }

    /* access modifiers changed from: protected */
    public void onCleared() {
    }

    /* access modifiers changed from: package-private */
    public final void clear() {
        this.mCleared = true;
        if (this.mBagOfTags != null) {
            synchronized (this.mBagOfTags) {
                for (Object value : this.mBagOfTags.values()) {
                    closeWithRuntimeException(value);
                }
            }
        }
        if (this.mCloseables != null) {
            synchronized (this.mCloseables) {
                for (Closeable closeable : this.mCloseables) {
                    closeWithRuntimeException(closeable);
                }
            }
        }
        onCleared();
    }

    /* access modifiers changed from: package-private */
    public <T> T setTagIfAbsent(String key, T newValue) {
        T previous;
        synchronized (this.mBagOfTags) {
            previous = this.mBagOfTags.get(key);
            if (previous == null) {
                this.mBagOfTags.put(key, newValue);
            }
        }
        T result = previous == null ? newValue : previous;
        if (this.mCleared) {
            closeWithRuntimeException(result);
        }
        return result;
    }

    /* access modifiers changed from: package-private */
    public <T> T getTag(String key) {
        T t;
        if (this.mBagOfTags == null) {
            return null;
        }
        synchronized (this.mBagOfTags) {
            t = this.mBagOfTags.get(key);
        }
        return t;
    }

    private static void closeWithRuntimeException(Object obj) {
        if (obj instanceof Closeable) {
            try {
                ((Closeable) obj).close();
            } catch (IOException e) {
                throw new RuntimeException(e);
            }
        }
    }
}
