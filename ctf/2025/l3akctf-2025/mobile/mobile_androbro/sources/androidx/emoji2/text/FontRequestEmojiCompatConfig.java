package androidx.emoji2.text;

import android.content.Context;
import android.content.pm.PackageManager;
import android.database.ContentObserver;
import android.graphics.Typeface;
import android.net.Uri;
import android.os.CancellationSignal;
import android.os.Handler;
import android.os.SystemClock;
import androidx.core.provider.FontRequest;
import androidx.core.provider.FontsContractCompat;
import androidx.core.util.Preconditions;
import androidx.emoji2.text.EmojiCompat;
import java.util.concurrent.Executor;
import java.util.concurrent.ThreadPoolExecutor;

public class FontRequestEmojiCompatConfig extends EmojiCompat.Config {
    private static final FontProviderHelper DEFAULT_FONTS_CONTRACT = new FontProviderHelper();

    public static abstract class RetryPolicy {
        public abstract long getRetryDelay();
    }

    public static class ExponentialBackoffRetryPolicy extends RetryPolicy {
        private long mRetryOrigin;
        private final long mTotalMs;

        public ExponentialBackoffRetryPolicy(long totalMs) {
            this.mTotalMs = totalMs;
        }

        public long getRetryDelay() {
            if (this.mRetryOrigin == 0) {
                this.mRetryOrigin = SystemClock.uptimeMillis();
                return 0;
            }
            long elapsedMillis = SystemClock.uptimeMillis() - this.mRetryOrigin;
            if (elapsedMillis > this.mTotalMs) {
                return -1;
            }
            return Math.min(Math.max(elapsedMillis, 1000), this.mTotalMs - elapsedMillis);
        }
    }

    public FontRequestEmojiCompatConfig(Context context, FontRequest request) {
        super(new FontRequestMetadataLoader(context, request, DEFAULT_FONTS_CONTRACT));
    }

    public FontRequestEmojiCompatConfig(Context context, FontRequest request, FontProviderHelper fontProviderHelper) {
        super(new FontRequestMetadataLoader(context, request, fontProviderHelper));
    }

    public FontRequestEmojiCompatConfig setLoadingExecutor(Executor executor) {
        ((FontRequestMetadataLoader) getMetadataRepoLoader()).setExecutor(executor);
        return this;
    }

    @Deprecated
    public FontRequestEmojiCompatConfig setHandler(Handler handler) {
        if (handler == null) {
            return this;
        }
        setLoadingExecutor(ConcurrencyHelpers.convertHandlerToExecutor(handler));
        return this;
    }

    public FontRequestEmojiCompatConfig setRetryPolicy(RetryPolicy policy) {
        ((FontRequestMetadataLoader) getMetadataRepoLoader()).setRetryPolicy(policy);
        return this;
    }

    private static class FontRequestMetadataLoader implements EmojiCompat.MetadataRepoLoader {
        private static final String S_TRACE_BUILD_TYPEFACE = "EmojiCompat.FontRequestEmojiCompatConfig.buildTypeface";
        EmojiCompat.MetadataRepoLoaderCallback mCallback;
        private final Context mContext;
        private Executor mExecutor;
        private final FontProviderHelper mFontProviderHelper;
        private final Object mLock = new Object();
        private Handler mMainHandler;
        private Runnable mMainHandlerLoadCallback;
        private ThreadPoolExecutor mMyThreadPoolExecutor;
        private ContentObserver mObserver;
        private final FontRequest mRequest;
        private RetryPolicy mRetryPolicy;

        FontRequestMetadataLoader(Context context, FontRequest request, FontProviderHelper fontProviderHelper) {
            Preconditions.checkNotNull(context, "Context cannot be null");
            Preconditions.checkNotNull(request, "FontRequest cannot be null");
            this.mContext = context.getApplicationContext();
            this.mRequest = request;
            this.mFontProviderHelper = fontProviderHelper;
        }

        public void setExecutor(Executor executor) {
            synchronized (this.mLock) {
                this.mExecutor = executor;
            }
        }

        public void setRetryPolicy(RetryPolicy policy) {
            synchronized (this.mLock) {
                this.mRetryPolicy = policy;
            }
        }

        public void load(EmojiCompat.MetadataRepoLoaderCallback loaderCallback) {
            Preconditions.checkNotNull(loaderCallback, "LoaderCallback cannot be null");
            synchronized (this.mLock) {
                this.mCallback = loaderCallback;
            }
            loadInternal();
        }

        /* access modifiers changed from: package-private */
        public void loadInternal() {
            synchronized (this.mLock) {
                if (this.mCallback != null) {
                    if (this.mExecutor == null) {
                        this.mMyThreadPoolExecutor = ConcurrencyHelpers.createBackgroundPriorityExecutor("emojiCompat");
                        this.mExecutor = this.mMyThreadPoolExecutor;
                    }
                    this.mExecutor.execute(new FontRequestEmojiCompatConfig$FontRequestMetadataLoader$$ExternalSyntheticLambda0(this));
                }
            }
        }

        private FontsContractCompat.FontInfo retrieveFontInfo() {
            try {
                FontsContractCompat.FontFamilyResult result = this.mFontProviderHelper.fetchFonts(this.mContext, this.mRequest);
                if (result.getStatusCode() == 0) {
                    FontsContractCompat.FontInfo[] fonts = result.getFonts();
                    if (fonts != null && fonts.length != 0) {
                        return fonts[0];
                    }
                    throw new RuntimeException("fetchFonts failed (empty result)");
                }
                throw new RuntimeException("fetchFonts failed (" + result.getStatusCode() + ")");
            } catch (PackageManager.NameNotFoundException e) {
                throw new RuntimeException("provider not found", e);
            }
        }

        private void scheduleRetry(Uri uri, long waitMs) {
            synchronized (this.mLock) {
                Handler handler = this.mMainHandler;
                if (handler == null) {
                    handler = ConcurrencyHelpers.mainHandlerAsync();
                    this.mMainHandler = handler;
                }
                if (this.mObserver == null) {
                    this.mObserver = new ContentObserver(handler) {
                        public void onChange(boolean selfChange, Uri uri) {
                            FontRequestMetadataLoader.this.loadInternal();
                        }
                    };
                    this.mFontProviderHelper.registerObserver(this.mContext, uri, this.mObserver);
                }
                if (this.mMainHandlerLoadCallback == null) {
                    this.mMainHandlerLoadCallback = new FontRequestEmojiCompatConfig$FontRequestMetadataLoader$$ExternalSyntheticLambda1(this);
                }
                handler.postDelayed(this.mMainHandlerLoadCallback, waitMs);
            }
        }

        private void cleanUp() {
            synchronized (this.mLock) {
                this.mCallback = null;
                if (this.mObserver != null) {
                    this.mFontProviderHelper.unregisterObserver(this.mContext, this.mObserver);
                    this.mObserver = null;
                }
                if (this.mMainHandler != null) {
                    this.mMainHandler.removeCallbacks(this.mMainHandlerLoadCallback);
                }
                this.mMainHandler = null;
                if (this.mMyThreadPoolExecutor != null) {
                    this.mMyThreadPoolExecutor.shutdown();
                }
                this.mExecutor = null;
                this.mMyThreadPoolExecutor = null;
            }
        }

        /* access modifiers changed from: package-private */
        /* JADX WARNING: Code restructure failed: missing block: B:10:0x0013, code lost:
            if (r1 != 2) goto L_0x0036;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:11:0x0015, code lost:
            r2 = r7.mLock;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:12:0x0017, code lost:
            monitor-enter(r2);
         */
        /* JADX WARNING: Code restructure failed: missing block: B:15:0x001a, code lost:
            if (r7.mRetryPolicy == null) goto L_0x0031;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:16:0x001c, code lost:
            r3 = r7.mRetryPolicy.getRetryDelay();
         */
        /* JADX WARNING: Code restructure failed: missing block: B:17:0x0026, code lost:
            if (r3 < 0) goto L_0x0031;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:18:0x0028, code lost:
            scheduleRetry(r0.getUri(), r3);
         */
        /* JADX WARNING: Code restructure failed: missing block: B:19:0x002f, code lost:
            monitor-exit(r2);
         */
        /* JADX WARNING: Code restructure failed: missing block: B:20:0x0030, code lost:
            return;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:21:0x0031, code lost:
            monitor-exit(r2);
         */
        /* JADX WARNING: Code restructure failed: missing block: B:27:0x0036, code lost:
            if (r1 != 0) goto L_0x007d;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:30:?, code lost:
            androidx.core.os.TraceCompat.beginSection(S_TRACE_BUILD_TYPEFACE);
            r2 = r7.mFontProviderHelper.buildTypeface(r7.mContext, r0);
            r3 = androidx.core.graphics.TypefaceCompatUtil.mmap(r7.mContext, (android.os.CancellationSignal) null, r0.getUri());
         */
        /* JADX WARNING: Code restructure failed: missing block: B:31:0x0050, code lost:
            if (r3 == null) goto L_0x0070;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:32:0x0052, code lost:
            if (r2 == null) goto L_0x0070;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:33:0x0054, code lost:
            r4 = androidx.emoji2.text.MetadataRepo.create(r2, r3);
         */
        /* JADX WARNING: Code restructure failed: missing block: B:35:?, code lost:
            androidx.core.os.TraceCompat.endSection();
            r2 = r7.mLock;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:36:0x005e, code lost:
            monitor-enter(r2);
         */
        /* JADX WARNING: Code restructure failed: missing block: B:39:0x0061, code lost:
            if (r7.mCallback == null) goto L_0x0068;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:40:0x0063, code lost:
            r7.mCallback.onLoaded(r4);
         */
        /* JADX WARNING: Code restructure failed: missing block: B:41:0x0068, code lost:
            monitor-exit(r2);
         */
        /* JADX WARNING: Code restructure failed: missing block: B:43:?, code lost:
            cleanUp();
         */
        /* JADX WARNING: Code restructure failed: missing block: B:51:0x0077, code lost:
            throw new java.lang.RuntimeException("Unable to open file.");
         */
        /* JADX WARNING: Code restructure failed: missing block: B:52:0x0078, code lost:
            r2 = move-exception;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:54:?, code lost:
            androidx.core.os.TraceCompat.endSection();
         */
        /* JADX WARNING: Code restructure failed: missing block: B:55:0x007c, code lost:
            throw r2;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:57:0x009b, code lost:
            throw new java.lang.RuntimeException("fetchFonts result is not OK. (" + r1 + ")");
         */
        /* JADX WARNING: Code restructure failed: missing block: B:58:0x009c, code lost:
            r0 = move-exception;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:59:0x009d, code lost:
            r1 = r0;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:60:0x00a0, code lost:
            monitor-enter(r7.mLock);
         */
        /* JADX WARNING: Code restructure failed: missing block: B:63:0x00a3, code lost:
            if (r7.mCallback != null) goto L_0x00a5;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:64:0x00a5, code lost:
            r7.mCallback.onFailed(r1);
         */
        /* JADX WARNING: Code restructure failed: missing block: B:66:0x00ab, code lost:
            cleanUp();
         */
        /* JADX WARNING: Code restructure failed: missing block: B:83:?, code lost:
            return;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:84:?, code lost:
            return;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:9:?, code lost:
            r0 = retrieveFontInfo();
            r1 = r0.getResultCode();
         */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public void createMetadata() {
            /*
                r7 = this;
                java.lang.Object r0 = r7.mLock
                monitor-enter(r0)
                androidx.emoji2.text.EmojiCompat$MetadataRepoLoaderCallback r1 = r7.mCallback     // Catch:{ all -> 0x00b2 }
                if (r1 != 0) goto L_0x0009
                monitor-exit(r0)     // Catch:{ all -> 0x00b2 }
                return
            L_0x0009:
                monitor-exit(r0)     // Catch:{ all -> 0x00b2 }
                androidx.core.provider.FontsContractCompat$FontInfo r0 = r7.retrieveFontInfo()     // Catch:{ all -> 0x009c }
                int r1 = r0.getResultCode()     // Catch:{ all -> 0x009c }
                r2 = 2
                if (r1 != r2) goto L_0x0036
                java.lang.Object r2 = r7.mLock     // Catch:{ all -> 0x009c }
                monitor-enter(r2)     // Catch:{ all -> 0x009c }
                androidx.emoji2.text.FontRequestEmojiCompatConfig$RetryPolicy r3 = r7.mRetryPolicy     // Catch:{ all -> 0x0033 }
                if (r3 == 0) goto L_0x0031
                androidx.emoji2.text.FontRequestEmojiCompatConfig$RetryPolicy r3 = r7.mRetryPolicy     // Catch:{ all -> 0x0033 }
                long r3 = r3.getRetryDelay()     // Catch:{ all -> 0x0033 }
                r5 = 0
                int r5 = (r3 > r5 ? 1 : (r3 == r5 ? 0 : -1))
                if (r5 < 0) goto L_0x0031
                android.net.Uri r5 = r0.getUri()     // Catch:{ all -> 0x0033 }
                r7.scheduleRetry(r5, r3)     // Catch:{ all -> 0x0033 }
                monitor-exit(r2)     // Catch:{ all -> 0x0033 }
                return
            L_0x0031:
                monitor-exit(r2)     // Catch:{ all -> 0x0033 }
                goto L_0x0036
            L_0x0033:
                r3 = move-exception
                monitor-exit(r2)     // Catch:{ all -> 0x0033 }
                throw r3     // Catch:{ all -> 0x009c }
            L_0x0036:
                if (r1 != 0) goto L_0x007d
                java.lang.String r2 = "EmojiCompat.FontRequestEmojiCompatConfig.buildTypeface"
                androidx.core.os.TraceCompat.beginSection(r2)     // Catch:{ all -> 0x0078 }
                androidx.emoji2.text.FontRequestEmojiCompatConfig$FontProviderHelper r2 = r7.mFontProviderHelper     // Catch:{ all -> 0x0078 }
                android.content.Context r3 = r7.mContext     // Catch:{ all -> 0x0078 }
                android.graphics.Typeface r2 = r2.buildTypeface(r3, r0)     // Catch:{ all -> 0x0078 }
                android.content.Context r3 = r7.mContext     // Catch:{ all -> 0x0078 }
                android.net.Uri r4 = r0.getUri()     // Catch:{ all -> 0x0078 }
                r5 = 0
                java.nio.ByteBuffer r3 = androidx.core.graphics.TypefaceCompatUtil.mmap(r3, r5, r4)     // Catch:{ all -> 0x0078 }
                if (r3 == 0) goto L_0x0070
                if (r2 == 0) goto L_0x0070
                androidx.emoji2.text.MetadataRepo r4 = androidx.emoji2.text.MetadataRepo.create((android.graphics.Typeface) r2, (java.nio.ByteBuffer) r3)     // Catch:{ all -> 0x0078 }
                androidx.core.os.TraceCompat.endSection()     // Catch:{ all -> 0x009c }
                java.lang.Object r2 = r7.mLock     // Catch:{ all -> 0x009c }
                monitor-enter(r2)     // Catch:{ all -> 0x009c }
                androidx.emoji2.text.EmojiCompat$MetadataRepoLoaderCallback r3 = r7.mCallback     // Catch:{ all -> 0x006d }
                if (r3 == 0) goto L_0x0068
                androidx.emoji2.text.EmojiCompat$MetadataRepoLoaderCallback r3 = r7.mCallback     // Catch:{ all -> 0x006d }
                r3.onLoaded(r4)     // Catch:{ all -> 0x006d }
            L_0x0068:
                monitor-exit(r2)     // Catch:{ all -> 0x006d }
                r7.cleanUp()     // Catch:{ all -> 0x009c }
                goto L_0x00ae
            L_0x006d:
                r3 = move-exception
                monitor-exit(r2)     // Catch:{ all -> 0x006d }
                throw r3     // Catch:{ all -> 0x009c }
            L_0x0070:
                java.lang.RuntimeException r4 = new java.lang.RuntimeException     // Catch:{ all -> 0x0078 }
                java.lang.String r5 = "Unable to open file."
                r4.<init>(r5)     // Catch:{ all -> 0x0078 }
                throw r4     // Catch:{ all -> 0x0078 }
            L_0x0078:
                r2 = move-exception
                androidx.core.os.TraceCompat.endSection()     // Catch:{ all -> 0x009c }
                throw r2     // Catch:{ all -> 0x009c }
            L_0x007d:
                java.lang.RuntimeException r2 = new java.lang.RuntimeException     // Catch:{ all -> 0x009c }
                java.lang.StringBuilder r3 = new java.lang.StringBuilder     // Catch:{ all -> 0x009c }
                r3.<init>()     // Catch:{ all -> 0x009c }
                java.lang.String r4 = "fetchFonts result is not OK. ("
                java.lang.StringBuilder r3 = r3.append(r4)     // Catch:{ all -> 0x009c }
                java.lang.StringBuilder r3 = r3.append(r1)     // Catch:{ all -> 0x009c }
                java.lang.String r4 = ")"
                java.lang.StringBuilder r3 = r3.append(r4)     // Catch:{ all -> 0x009c }
                java.lang.String r3 = r3.toString()     // Catch:{ all -> 0x009c }
                r2.<init>(r3)     // Catch:{ all -> 0x009c }
                throw r2     // Catch:{ all -> 0x009c }
            L_0x009c:
                r0 = move-exception
                r1 = r0
                java.lang.Object r2 = r7.mLock
                monitor-enter(r2)
                androidx.emoji2.text.EmojiCompat$MetadataRepoLoaderCallback r0 = r7.mCallback     // Catch:{ all -> 0x00af }
                if (r0 == 0) goto L_0x00aa
                androidx.emoji2.text.EmojiCompat$MetadataRepoLoaderCallback r0 = r7.mCallback     // Catch:{ all -> 0x00af }
                r0.onFailed(r1)     // Catch:{ all -> 0x00af }
            L_0x00aa:
                monitor-exit(r2)     // Catch:{ all -> 0x00af }
                r7.cleanUp()
            L_0x00ae:
                return
            L_0x00af:
                r0 = move-exception
                monitor-exit(r2)     // Catch:{ all -> 0x00af }
                throw r0
            L_0x00b2:
                r1 = move-exception
                monitor-exit(r0)     // Catch:{ all -> 0x00b2 }
                throw r1
            */
            throw new UnsupportedOperationException("Method not decompiled: androidx.emoji2.text.FontRequestEmojiCompatConfig.FontRequestMetadataLoader.createMetadata():void");
        }
    }

    public static class FontProviderHelper {
        public FontsContractCompat.FontFamilyResult fetchFonts(Context context, FontRequest request) throws PackageManager.NameNotFoundException {
            return FontsContractCompat.fetchFonts(context, (CancellationSignal) null, request);
        }

        public Typeface buildTypeface(Context context, FontsContractCompat.FontInfo font) throws PackageManager.NameNotFoundException {
            return FontsContractCompat.buildTypeface(context, (CancellationSignal) null, new FontsContractCompat.FontInfo[]{font});
        }

        public void registerObserver(Context context, Uri uri, ContentObserver observer) {
            context.getContentResolver().registerContentObserver(uri, false, observer);
        }

        public void unregisterObserver(Context context, ContentObserver observer) {
            context.getContentResolver().unregisterContentObserver(observer);
        }
    }
}
