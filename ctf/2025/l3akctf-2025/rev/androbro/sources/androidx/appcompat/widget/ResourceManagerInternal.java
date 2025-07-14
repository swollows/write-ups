package androidx.appcompat.widget;

import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffColorFilter;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.LayerDrawable;
import android.util.AttributeSet;
import android.util.Log;
import android.util.TypedValue;
import androidx.appcompat.graphics.drawable.AnimatedStateListDrawableCompat;
import androidx.appcompat.resources.Compatibility;
import androidx.appcompat.resources.R;
import androidx.collection.LongSparseArray;
import androidx.collection.LruCache;
import androidx.collection.SimpleArrayMap;
import androidx.collection.SparseArrayCompat;
import androidx.core.content.ContextCompat;
import androidx.core.graphics.drawable.DrawableCompat;
import androidx.vectordrawable.graphics.drawable.AnimatedVectorDrawableCompat;
import androidx.vectordrawable.graphics.drawable.VectorDrawableCompat;
import java.lang.ref.WeakReference;
import java.util.WeakHashMap;
import org.xmlpull.v1.XmlPullParser;

public final class ResourceManagerInternal {
    private static final ColorFilterLruCache COLOR_FILTER_CACHE = new ColorFilterLruCache(6);
    private static final boolean DEBUG = false;
    private static final PorterDuff.Mode DEFAULT_MODE = PorterDuff.Mode.SRC_IN;
    private static ResourceManagerInternal INSTANCE = null;
    private static final String PLATFORM_VD_CLAZZ = "android.graphics.drawable.VectorDrawable";
    private static final String SKIP_DRAWABLE_TAG = "appcompat_skip_skip";
    private static final String TAG = "ResourceManagerInternal";
    private SimpleArrayMap<String, InflateDelegate> mDelegates;
    private final WeakHashMap<Context, LongSparseArray<WeakReference<Drawable.ConstantState>>> mDrawableCaches = new WeakHashMap<>(0);
    private boolean mHasCheckedVectorDrawableSetup;
    private ResourceManagerHooks mHooks;
    private SparseArrayCompat<String> mKnownDrawableIdTags;
    private WeakHashMap<Context, SparseArrayCompat<ColorStateList>> mTintLists;
    private TypedValue mTypedValue;

    private interface InflateDelegate {
        Drawable createFromXmlInner(Context context, XmlPullParser xmlPullParser, AttributeSet attributeSet, Resources.Theme theme);
    }

    public interface ResourceManagerHooks {
        Drawable createDrawableFor(ResourceManagerInternal resourceManagerInternal, Context context, int i);

        ColorStateList getTintListForDrawableRes(Context context, int i);

        PorterDuff.Mode getTintModeForDrawableRes(int i);

        boolean tintDrawable(Context context, int i, Drawable drawable);

        boolean tintDrawableUsingColorFilter(Context context, int i, Drawable drawable);
    }

    public static synchronized ResourceManagerInternal get() {
        ResourceManagerInternal resourceManagerInternal;
        synchronized (ResourceManagerInternal.class) {
            if (INSTANCE == null) {
                INSTANCE = new ResourceManagerInternal();
                installDefaultInflateDelegates(INSTANCE);
            }
            resourceManagerInternal = INSTANCE;
        }
        return resourceManagerInternal;
    }

    private static void installDefaultInflateDelegates(ResourceManagerInternal manager) {
    }

    public synchronized void setHooks(ResourceManagerHooks hooks) {
        this.mHooks = hooks;
    }

    public synchronized Drawable getDrawable(Context context, int resId) {
        return getDrawable(context, resId, false);
    }

    /* access modifiers changed from: package-private */
    public synchronized Drawable getDrawable(Context context, int resId, boolean failIfNotKnown) {
        Drawable drawable;
        checkVectorDrawableSetup(context);
        drawable = loadDrawableFromDelegates(context, resId);
        if (drawable == null) {
            drawable = createDrawableIfNeeded(context, resId);
        }
        if (drawable == null) {
            drawable = ContextCompat.getDrawable(context, resId);
        }
        if (drawable != null) {
            drawable = tintDrawable(context, resId, failIfNotKnown, drawable);
        }
        if (drawable != null) {
            DrawableUtils.fixDrawable(drawable);
        }
        return drawable;
    }

    public synchronized void onConfigurationChanged(Context context) {
        LongSparseArray<WeakReference<Drawable.ConstantState>> cache = this.mDrawableCaches.get(context);
        if (cache != null) {
            cache.clear();
        }
    }

    private static long createCacheKey(TypedValue tv) {
        return (((long) tv.assetCookie) << 32) | ((long) tv.data);
    }

    private Drawable createDrawableIfNeeded(Context context, int resId) {
        Drawable drawable;
        if (this.mTypedValue == null) {
            this.mTypedValue = new TypedValue();
        }
        TypedValue tv = this.mTypedValue;
        context.getResources().getValue(resId, tv, true);
        long key = createCacheKey(tv);
        Drawable dr = getCachedDrawable(context, key);
        if (dr != null) {
            return dr;
        }
        if (this.mHooks == null) {
            drawable = null;
        } else {
            drawable = this.mHooks.createDrawableFor(this, context, resId);
        }
        Drawable dr2 = drawable;
        if (dr2 != null) {
            dr2.setChangingConfigurations(tv.changingConfigurations);
            addDrawableToCache(context, key, dr2);
        }
        return dr2;
    }

    private Drawable tintDrawable(Context context, int resId, boolean failIfNotKnown, Drawable drawable) {
        ColorStateList tintList = getTintList(context, resId);
        if (tintList != null) {
            Drawable drawable2 = DrawableCompat.wrap(drawable.mutate());
            DrawableCompat.setTintList(drawable2, tintList);
            PorterDuff.Mode tintMode = getTintMode(resId);
            if (tintMode == null) {
                return drawable2;
            }
            DrawableCompat.setTintMode(drawable2, tintMode);
            return drawable2;
        } else if ((this.mHooks == null || !this.mHooks.tintDrawable(context, resId, drawable)) && !tintDrawableUsingColorFilter(context, resId, drawable) && failIfNotKnown) {
            return null;
        } else {
            return drawable;
        }
    }

    /* JADX WARNING: Removed duplicated region for block: B:30:0x007c A[Catch:{ Exception -> 0x00ac }] */
    /* JADX WARNING: Removed duplicated region for block: B:36:0x00a4 A[Catch:{ Exception -> 0x00ac }] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private android.graphics.drawable.Drawable loadDrawableFromDelegates(android.content.Context r13, int r14) {
        /*
            r12 = this;
            androidx.collection.SimpleArrayMap<java.lang.String, androidx.appcompat.widget.ResourceManagerInternal$InflateDelegate> r0 = r12.mDelegates
            r1 = 0
            if (r0 == 0) goto L_0x00bc
            androidx.collection.SimpleArrayMap<java.lang.String, androidx.appcompat.widget.ResourceManagerInternal$InflateDelegate> r0 = r12.mDelegates
            boolean r0 = r0.isEmpty()
            if (r0 != 0) goto L_0x00bc
            androidx.collection.SparseArrayCompat<java.lang.String> r0 = r12.mKnownDrawableIdTags
            java.lang.String r2 = "appcompat_skip_skip"
            if (r0 == 0) goto L_0x002e
            androidx.collection.SparseArrayCompat<java.lang.String> r0 = r12.mKnownDrawableIdTags
            java.lang.Object r0 = r0.get(r14)
            java.lang.String r0 = (java.lang.String) r0
            boolean r3 = r2.equals(r0)
            if (r3 != 0) goto L_0x002d
            if (r0 == 0) goto L_0x002c
            androidx.collection.SimpleArrayMap<java.lang.String, androidx.appcompat.widget.ResourceManagerInternal$InflateDelegate> r3 = r12.mDelegates
            java.lang.Object r3 = r3.get(r0)
            if (r3 != 0) goto L_0x002c
            goto L_0x002d
        L_0x002c:
            goto L_0x0035
        L_0x002d:
            return r1
        L_0x002e:
            androidx.collection.SparseArrayCompat r0 = new androidx.collection.SparseArrayCompat
            r0.<init>()
            r12.mKnownDrawableIdTags = r0
        L_0x0035:
            android.util.TypedValue r0 = r12.mTypedValue
            if (r0 != 0) goto L_0x0040
            android.util.TypedValue r0 = new android.util.TypedValue
            r0.<init>()
            r12.mTypedValue = r0
        L_0x0040:
            android.util.TypedValue r0 = r12.mTypedValue
            android.content.res.Resources r1 = r13.getResources()
            r3 = 1
            r1.getValue(r14, r0, r3)
            long r4 = createCacheKey(r0)
            android.graphics.drawable.Drawable r6 = r12.getCachedDrawable(r13, r4)
            if (r6 == 0) goto L_0x0055
            return r6
        L_0x0055:
            java.lang.CharSequence r7 = r0.string
            if (r7 == 0) goto L_0x00b4
            java.lang.CharSequence r7 = r0.string
            java.lang.String r7 = r7.toString()
            java.lang.String r8 = ".xml"
            boolean r7 = r7.endsWith(r8)
            if (r7 == 0) goto L_0x00b4
            android.content.res.XmlResourceParser r7 = r1.getXml(r14)     // Catch:{ Exception -> 0x00ac }
            android.util.AttributeSet r8 = android.util.Xml.asAttributeSet(r7)     // Catch:{ Exception -> 0x00ac }
        L_0x006f:
            int r9 = r7.next()     // Catch:{ Exception -> 0x00ac }
            r10 = r9
            r11 = 2
            if (r9 == r11) goto L_0x007a
            if (r10 == r3) goto L_0x007a
            goto L_0x006f
        L_0x007a:
            if (r10 != r11) goto L_0x00a4
            java.lang.String r3 = r7.getName()     // Catch:{ Exception -> 0x00ac }
            androidx.collection.SparseArrayCompat<java.lang.String> r9 = r12.mKnownDrawableIdTags     // Catch:{ Exception -> 0x00ac }
            r9.append(r14, r3)     // Catch:{ Exception -> 0x00ac }
            androidx.collection.SimpleArrayMap<java.lang.String, androidx.appcompat.widget.ResourceManagerInternal$InflateDelegate> r9 = r12.mDelegates     // Catch:{ Exception -> 0x00ac }
            java.lang.Object r9 = r9.get(r3)     // Catch:{ Exception -> 0x00ac }
            androidx.appcompat.widget.ResourceManagerInternal$InflateDelegate r9 = (androidx.appcompat.widget.ResourceManagerInternal.InflateDelegate) r9     // Catch:{ Exception -> 0x00ac }
            if (r9 == 0) goto L_0x0099
            android.content.res.Resources$Theme r11 = r13.getTheme()     // Catch:{ Exception -> 0x00ac }
            android.graphics.drawable.Drawable r11 = r9.createFromXmlInner(r13, r7, r8, r11)     // Catch:{ Exception -> 0x00ac }
            r6 = r11
        L_0x0099:
            if (r6 == 0) goto L_0x00a3
            int r11 = r0.changingConfigurations     // Catch:{ Exception -> 0x00ac }
            r6.setChangingConfigurations(r11)     // Catch:{ Exception -> 0x00ac }
            r12.addDrawableToCache(r13, r4, r6)     // Catch:{ Exception -> 0x00ac }
        L_0x00a3:
            goto L_0x00b4
        L_0x00a4:
            org.xmlpull.v1.XmlPullParserException r3 = new org.xmlpull.v1.XmlPullParserException     // Catch:{ Exception -> 0x00ac }
            java.lang.String r9 = "No start tag found"
            r3.<init>(r9)     // Catch:{ Exception -> 0x00ac }
            throw r3     // Catch:{ Exception -> 0x00ac }
        L_0x00ac:
            r3 = move-exception
            java.lang.String r7 = "ResourceManagerInternal"
            java.lang.String r8 = "Exception while inflating drawable"
            android.util.Log.e(r7, r8, r3)
        L_0x00b4:
            if (r6 != 0) goto L_0x00bb
            androidx.collection.SparseArrayCompat<java.lang.String> r3 = r12.mKnownDrawableIdTags
            r3.append(r14, r2)
        L_0x00bb:
            return r6
        L_0x00bc:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.appcompat.widget.ResourceManagerInternal.loadDrawableFromDelegates(android.content.Context, int):android.graphics.drawable.Drawable");
    }

    /* JADX WARNING: Code restructure failed: missing block: B:18:0x002c, code lost:
        return null;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private synchronized android.graphics.drawable.Drawable getCachedDrawable(android.content.Context r5, long r6) {
        /*
            r4 = this;
            monitor-enter(r4)
            java.util.WeakHashMap<android.content.Context, androidx.collection.LongSparseArray<java.lang.ref.WeakReference<android.graphics.drawable.Drawable$ConstantState>>> r0 = r4.mDrawableCaches     // Catch:{ all -> 0x002d }
            java.lang.Object r0 = r0.get(r5)     // Catch:{ all -> 0x002d }
            androidx.collection.LongSparseArray r0 = (androidx.collection.LongSparseArray) r0     // Catch:{ all -> 0x002d }
            r1 = 0
            if (r0 != 0) goto L_0x000e
            monitor-exit(r4)
            return r1
        L_0x000e:
            java.lang.Object r2 = r0.get(r6)     // Catch:{ all -> 0x002d }
            java.lang.ref.WeakReference r2 = (java.lang.ref.WeakReference) r2     // Catch:{ all -> 0x002d }
            if (r2 == 0) goto L_0x002b
            java.lang.Object r3 = r2.get()     // Catch:{ all -> 0x002d }
            android.graphics.drawable.Drawable$ConstantState r3 = (android.graphics.drawable.Drawable.ConstantState) r3     // Catch:{ all -> 0x002d }
            if (r3 == 0) goto L_0x0028
            android.content.res.Resources r1 = r5.getResources()     // Catch:{ all -> 0x002d }
            android.graphics.drawable.Drawable r1 = r3.newDrawable(r1)     // Catch:{ all -> 0x002d }
            monitor-exit(r4)
            return r1
        L_0x0028:
            r0.remove(r6)     // Catch:{ all -> 0x002d }
        L_0x002b:
            monitor-exit(r4)
            return r1
        L_0x002d:
            r5 = move-exception
            monitor-exit(r4)     // Catch:{ all -> 0x002d }
            throw r5
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.appcompat.widget.ResourceManagerInternal.getCachedDrawable(android.content.Context, long):android.graphics.drawable.Drawable");
    }

    private synchronized boolean addDrawableToCache(Context context, long key, Drawable drawable) {
        Drawable.ConstantState cs = drawable.getConstantState();
        if (cs == null) {
            return false;
        }
        LongSparseArray<WeakReference<Drawable.ConstantState>> cache = this.mDrawableCaches.get(context);
        if (cache == null) {
            cache = new LongSparseArray<>();
            this.mDrawableCaches.put(context, cache);
        }
        cache.put(key, new WeakReference(cs));
        return true;
    }

    /* access modifiers changed from: package-private */
    public synchronized Drawable onDrawableLoadedFromResources(Context context, VectorEnabledTintResources resources, int resId) {
        Drawable drawable = loadDrawableFromDelegates(context, resId);
        if (drawable == null) {
            drawable = resources.getDrawableCanonical(resId);
        }
        if (drawable == null) {
            return null;
        }
        return tintDrawable(context, resId, false, drawable);
    }

    /* access modifiers changed from: package-private */
    public boolean tintDrawableUsingColorFilter(Context context, int resId, Drawable drawable) {
        return this.mHooks != null && this.mHooks.tintDrawableUsingColorFilter(context, resId, drawable);
    }

    private void addDelegate(String tagName, InflateDelegate delegate) {
        if (this.mDelegates == null) {
            this.mDelegates = new SimpleArrayMap<>();
        }
        this.mDelegates.put(tagName, delegate);
    }

    /* access modifiers changed from: package-private */
    public PorterDuff.Mode getTintMode(int resId) {
        if (this.mHooks == null) {
            return null;
        }
        return this.mHooks.getTintModeForDrawableRes(resId);
    }

    /* access modifiers changed from: package-private */
    public synchronized ColorStateList getTintList(Context context, int resId) {
        ColorStateList tint;
        tint = getTintListFromCache(context, resId);
        if (tint == null) {
            tint = this.mHooks == null ? null : this.mHooks.getTintListForDrawableRes(context, resId);
            if (tint != null) {
                addTintListToCache(context, resId, tint);
            }
        }
        return tint;
    }

    private ColorStateList getTintListFromCache(Context context, int resId) {
        SparseArrayCompat<ColorStateList> tints;
        if (this.mTintLists == null || (tints = this.mTintLists.get(context)) == null) {
            return null;
        }
        return tints.get(resId);
    }

    private void addTintListToCache(Context context, int resId, ColorStateList tintList) {
        if (this.mTintLists == null) {
            this.mTintLists = new WeakHashMap<>();
        }
        SparseArrayCompat<ColorStateList> themeTints = this.mTintLists.get(context);
        if (themeTints == null) {
            themeTints = new SparseArrayCompat<>();
            this.mTintLists.put(context, themeTints);
        }
        themeTints.append(resId, tintList);
    }

    private static class ColorFilterLruCache extends LruCache<Integer, PorterDuffColorFilter> {
        public ColorFilterLruCache(int maxSize) {
            super(maxSize);
        }

        /* access modifiers changed from: package-private */
        public PorterDuffColorFilter get(int color, PorterDuff.Mode mode) {
            return (PorterDuffColorFilter) get(Integer.valueOf(generateCacheKey(color, mode)));
        }

        /* access modifiers changed from: package-private */
        public PorterDuffColorFilter put(int color, PorterDuff.Mode mode, PorterDuffColorFilter filter) {
            return (PorterDuffColorFilter) put(Integer.valueOf(generateCacheKey(color, mode)), filter);
        }

        private static int generateCacheKey(int color, PorterDuff.Mode mode) {
            return (((1 * 31) + color) * 31) + mode.hashCode();
        }
    }

    static void tintDrawable(Drawable drawable, TintInfo tint, int[] state) {
        int[] drawableState = drawable.getState();
        if (!(drawable.mutate() == drawable)) {
            Log.d(TAG, "Mutated drawable is not the same instance as the input.");
            return;
        }
        if ((drawable instanceof LayerDrawable) && drawable.isStateful()) {
            drawable.setState(new int[0]);
            drawable.setState(drawableState);
        }
        if (tint.mHasTintList || tint.mHasTintMode) {
            drawable.setColorFilter(createTintFilter(tint.mHasTintList ? tint.mTintList : null, tint.mHasTintMode ? tint.mTintMode : DEFAULT_MODE, state));
        } else {
            drawable.clearColorFilter();
        }
    }

    private static PorterDuffColorFilter createTintFilter(ColorStateList tint, PorterDuff.Mode tintMode, int[] state) {
        if (tint == null || tintMode == null) {
            return null;
        }
        return getPorterDuffColorFilter(tint.getColorForState(state, 0), tintMode);
    }

    public static synchronized PorterDuffColorFilter getPorterDuffColorFilter(int color, PorterDuff.Mode mode) {
        PorterDuffColorFilter filter;
        synchronized (ResourceManagerInternal.class) {
            filter = COLOR_FILTER_CACHE.get(color, mode);
            if (filter == null) {
                filter = new PorterDuffColorFilter(color, mode);
                COLOR_FILTER_CACHE.put(color, mode, filter);
            }
        }
        return filter;
    }

    private void checkVectorDrawableSetup(Context context) {
        if (!this.mHasCheckedVectorDrawableSetup) {
            this.mHasCheckedVectorDrawableSetup = true;
            Drawable d = getDrawable(context, R.drawable.abc_vector_test);
            if (d == null || !isVectorDrawable(d)) {
                this.mHasCheckedVectorDrawableSetup = false;
                throw new IllegalStateException("This app has been built with an incorrect configuration. Please configure your build for VectorDrawableCompat.");
            }
        }
    }

    private static boolean isVectorDrawable(Drawable d) {
        return (d instanceof VectorDrawableCompat) || PLATFORM_VD_CLAZZ.equals(d.getClass().getName());
    }

    private static class VdcInflateDelegate implements InflateDelegate {
        VdcInflateDelegate() {
        }

        public Drawable createFromXmlInner(Context context, XmlPullParser parser, AttributeSet attrs, Resources.Theme theme) {
            try {
                return VectorDrawableCompat.createFromXmlInner(context.getResources(), parser, attrs, theme);
            } catch (Exception e) {
                Log.e("VdcInflateDelegate", "Exception while inflating <vector>", e);
                return null;
            }
        }
    }

    private static class AvdcInflateDelegate implements InflateDelegate {
        AvdcInflateDelegate() {
        }

        public Drawable createFromXmlInner(Context context, XmlPullParser parser, AttributeSet attrs, Resources.Theme theme) {
            try {
                return AnimatedVectorDrawableCompat.createFromXmlInner(context, context.getResources(), parser, attrs, theme);
            } catch (Exception e) {
                Log.e("AvdcInflateDelegate", "Exception while inflating <animated-vector>", e);
                return null;
            }
        }
    }

    static class AsldcInflateDelegate implements InflateDelegate {
        AsldcInflateDelegate() {
        }

        public Drawable createFromXmlInner(Context context, XmlPullParser parser, AttributeSet attrs, Resources.Theme theme) {
            try {
                return AnimatedStateListDrawableCompat.createFromXmlInner(context, context.getResources(), parser, attrs, theme);
            } catch (Exception e) {
                Log.e("AsldcInflateDelegate", "Exception while inflating <animated-selector>", e);
                return null;
            }
        }
    }

    static class DrawableDelegate implements InflateDelegate {
        DrawableDelegate() {
        }

        public Drawable createFromXmlInner(Context context, XmlPullParser parser, AttributeSet attrs, Resources.Theme theme) {
            String className = attrs.getClassAttribute();
            if (className == null) {
                return null;
            }
            try {
                Drawable drawable = (Drawable) DrawableDelegate.class.getClassLoader().loadClass(className).asSubclass(Drawable.class).getDeclaredConstructor(new Class[0]).newInstance(new Object[0]);
                Compatibility.Api21Impl.inflate(drawable, context.getResources(), parser, attrs, theme);
                return drawable;
            } catch (Exception e) {
                Log.e("DrawableDelegate", "Exception while inflating <drawable>", e);
                return null;
            }
        }
    }
}
