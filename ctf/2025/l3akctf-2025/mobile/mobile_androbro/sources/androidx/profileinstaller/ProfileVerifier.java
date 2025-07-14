package androidx.profileinstaller;

import android.content.Context;
import android.content.pm.PackageInfo;
import android.content.pm.PackageManager;
import android.content.res.AssetFileDescriptor;
import android.os.Build;
import androidx.concurrent.futures.ResolvableFuture;
import com.google.common.util.concurrent.ListenableFuture;
import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.util.Objects;

public final class ProfileVerifier {
    private static final String CUR_PROFILES_BASE_DIR = "/data/misc/profiles/cur/0/";
    private static final String PROFILE_FILE_NAME = "primary.prof";
    private static final String PROFILE_INSTALLED_CACHE_FILE_NAME = "profileInstalled";
    private static final String REF_PROFILES_BASE_DIR = "/data/misc/profiles/ref/";
    private static final Object SYNC_OBJ = new Object();
    private static final String TAG = "ProfileVerifier";
    private static CompilationStatus sCompilationStatus = null;
    private static final ResolvableFuture<CompilationStatus> sFuture = ResolvableFuture.create();

    private ProfileVerifier() {
    }

    public static CompilationStatus writeProfileVerification(Context context) {
        return writeProfileVerification(context, false);
    }

    static CompilationStatus writeProfileVerification(Context context, boolean forceVerifyCurrentProfile) {
        boolean hasEmbeddedProfile;
        int resultCode;
        int resultCode2;
        Cache newCache;
        int resultCode3;
        AssetFileDescriptor afd;
        Throwable th;
        if (!forceVerifyCurrentProfile && sCompilationStatus != null) {
            return sCompilationStatus;
        }
        synchronized (SYNC_OBJ) {
            if (!forceVerifyCurrentProfile) {
                if (sCompilationStatus != null) {
                    CompilationStatus compilationStatus = sCompilationStatus;
                    return compilationStatus;
                }
            }
            boolean z = false;
            try {
                afd = context.getAssets().openFd("dexopt/baseline.prof");
                boolean hasEmbeddedProfile2 = afd.getLength() > 0;
                if (afd != null) {
                    afd.close();
                }
                hasEmbeddedProfile = hasEmbeddedProfile2;
            } catch (IOException e) {
                hasEmbeddedProfile = false;
            } catch (Throwable th2) {
                th.addSuppressed(th2);
            }
            if (Build.VERSION.SDK_INT >= 28) {
                if (Build.VERSION.SDK_INT != 30) {
                    File referenceProfileFile = new File(new File(REF_PROFILES_BASE_DIR, context.getPackageName()), PROFILE_FILE_NAME);
                    long referenceProfileSize = referenceProfileFile.length();
                    boolean hasReferenceProfile = referenceProfileFile.exists() && referenceProfileSize > 0;
                    File currentProfileFile = new File(new File(CUR_PROFILES_BASE_DIR, context.getPackageName()), PROFILE_FILE_NAME);
                    long currentProfileSize = currentProfileFile.length();
                    if (currentProfileFile.exists() && currentProfileSize > 0) {
                        z = true;
                    }
                    boolean hasCurrentProfile = z;
                    try {
                        long packageLastUpdateTime = getPackageLastUpdateTime(context);
                        File cacheFile = new File(context.getFilesDir(), PROFILE_INSTALLED_CACHE_FILE_NAME);
                        Cache currentCache = null;
                        if (cacheFile.exists()) {
                            try {
                                currentCache = Cache.readFromFile(cacheFile);
                            } catch (IOException e2) {
                                IOException iOException = e2;
                                return setCompilationStatus(131072, hasReferenceProfile, hasCurrentProfile, hasEmbeddedProfile);
                            }
                        }
                        if (currentCache != null && currentCache.mPackageLastUpdateTime == packageLastUpdateTime) {
                            if (currentCache.mResultCode != 2) {
                                resultCode = currentCache.mResultCode;
                                if (forceVerifyCurrentProfile && hasCurrentProfile && resultCode != 1) {
                                    resultCode = 2;
                                }
                                if (currentCache == null && currentCache.mResultCode != 2 && resultCode == 1) {
                                    resultCode3 = resultCode;
                                    if (referenceProfileSize < currentCache.mInstalledCurrentProfileSize) {
                                        resultCode2 = 3;
                                        newCache = new Cache(1, resultCode2, packageLastUpdateTime, currentProfileSize);
                                        if (currentCache == null || !currentCache.equals(newCache)) {
                                            newCache.writeOnFile(cacheFile);
                                        }
                                        CompilationStatus compilationStatus2 = setCompilationStatus(resultCode2, hasReferenceProfile, hasCurrentProfile, hasEmbeddedProfile);
                                        return compilationStatus2;
                                    }
                                } else {
                                    resultCode3 = resultCode;
                                }
                                resultCode2 = resultCode3;
                                newCache = new Cache(1, resultCode2, packageLastUpdateTime, currentProfileSize);
                                newCache.writeOnFile(cacheFile);
                                CompilationStatus compilationStatus22 = setCompilationStatus(resultCode2, hasReferenceProfile, hasCurrentProfile, hasEmbeddedProfile);
                                return compilationStatus22;
                            }
                        }
                        if (!hasEmbeddedProfile) {
                            resultCode = CompilationStatus.RESULT_CODE_ERROR_NO_PROFILE_EMBEDDED;
                        } else if (hasReferenceProfile) {
                            resultCode = 1;
                        } else if (hasCurrentProfile) {
                            resultCode = 2;
                        } else {
                            resultCode = 0;
                        }
                        resultCode = 2;
                        if (currentCache == null && currentCache.mResultCode != 2) {
                        }
                        resultCode3 = resultCode;
                        resultCode2 = resultCode3;
                        newCache = new Cache(1, resultCode2, packageLastUpdateTime, currentProfileSize);
                        try {
                            newCache.writeOnFile(cacheFile);
                        } catch (IOException e3) {
                            IOException iOException2 = e3;
                            resultCode2 = CompilationStatus.RESULT_CODE_ERROR_CANT_WRITE_PROFILE_VERIFICATION_RESULT_CACHE_FILE;
                        }
                        CompilationStatus compilationStatus222 = setCompilationStatus(resultCode2, hasReferenceProfile, hasCurrentProfile, hasEmbeddedProfile);
                        return compilationStatus222;
                    } catch (PackageManager.NameNotFoundException e4) {
                        PackageManager.NameNotFoundException nameNotFoundException = e4;
                        return setCompilationStatus(65536, hasReferenceProfile, hasCurrentProfile, hasEmbeddedProfile);
                    }
                }
            }
            CompilationStatus compilationStatus3 = setCompilationStatus(262144, false, false, hasEmbeddedProfile);
            return compilationStatus3;
        }
        throw th;
    }

    private static CompilationStatus setCompilationStatus(int resultCode, boolean hasReferenceProfile, boolean hasCurrentProfile, boolean hasEmbeddedProfile) {
        sCompilationStatus = new CompilationStatus(resultCode, hasReferenceProfile, hasCurrentProfile, hasEmbeddedProfile);
        sFuture.set(sCompilationStatus);
        return sCompilationStatus;
    }

    private static long getPackageLastUpdateTime(Context context) throws PackageManager.NameNotFoundException {
        PackageManager packageManager = context.getApplicationContext().getPackageManager();
        if (Build.VERSION.SDK_INT >= 33) {
            return Api33Impl.getPackageInfo(packageManager, context).lastUpdateTime;
        }
        return packageManager.getPackageInfo(context.getPackageName(), 0).lastUpdateTime;
    }

    public static ListenableFuture<CompilationStatus> getCompilationStatusAsync() {
        return sFuture;
    }

    static class Cache {
        private static final int SCHEMA = 1;
        final long mInstalledCurrentProfileSize;
        final long mPackageLastUpdateTime;
        final int mResultCode;
        final int mSchema;

        Cache(int schema, int resultCode, long packageLastUpdateTime, long installedCurrentProfileSize) {
            this.mSchema = schema;
            this.mResultCode = resultCode;
            this.mPackageLastUpdateTime = packageLastUpdateTime;
            this.mInstalledCurrentProfileSize = installedCurrentProfileSize;
        }

        public boolean equals(Object o) {
            if (this == o) {
                return true;
            }
            if (o == null || !(o instanceof Cache)) {
                return false;
            }
            Cache cacheFile = (Cache) o;
            if (this.mResultCode == cacheFile.mResultCode && this.mPackageLastUpdateTime == cacheFile.mPackageLastUpdateTime && this.mSchema == cacheFile.mSchema && this.mInstalledCurrentProfileSize == cacheFile.mInstalledCurrentProfileSize) {
                return true;
            }
            return false;
        }

        public int hashCode() {
            return Objects.hash(new Object[]{Integer.valueOf(this.mResultCode), Long.valueOf(this.mPackageLastUpdateTime), Integer.valueOf(this.mSchema), Long.valueOf(this.mInstalledCurrentProfileSize)});
        }

        /* access modifiers changed from: package-private */
        public void writeOnFile(File file) throws IOException {
            file.delete();
            DataOutputStream dos = new DataOutputStream(new FileOutputStream(file));
            try {
                dos.writeInt(this.mSchema);
                dos.writeInt(this.mResultCode);
                dos.writeLong(this.mPackageLastUpdateTime);
                dos.writeLong(this.mInstalledCurrentProfileSize);
                dos.close();
                return;
            } catch (Throwable th) {
                th.addSuppressed(th);
            }
            throw th;
        }

        static Cache readFromFile(File file) throws IOException {
            DataInputStream dis = new DataInputStream(new FileInputStream(file));
            try {
                Cache cache = new Cache(dis.readInt(), dis.readInt(), dis.readLong(), dis.readLong());
                dis.close();
                return cache;
            } catch (Throwable th) {
                th.addSuppressed(th);
            }
            throw th;
        }
    }

    public static class CompilationStatus {
        public static final int RESULT_CODE_COMPILED_WITH_PROFILE = 1;
        public static final int RESULT_CODE_COMPILED_WITH_PROFILE_NON_MATCHING = 3;
        public static final int RESULT_CODE_ERROR_CACHE_FILE_EXISTS_BUT_CANNOT_BE_READ = 131072;
        public static final int RESULT_CODE_ERROR_CANT_WRITE_PROFILE_VERIFICATION_RESULT_CACHE_FILE = 196608;
        private static final int RESULT_CODE_ERROR_CODE_BIT_SHIFT = 16;
        public static final int RESULT_CODE_ERROR_NO_PROFILE_EMBEDDED = 327680;
        public static final int RESULT_CODE_ERROR_PACKAGE_NAME_DOES_NOT_EXIST = 65536;
        public static final int RESULT_CODE_ERROR_UNSUPPORTED_API_VERSION = 262144;
        @Deprecated
        public static final int RESULT_CODE_NO_PROFILE = 0;
        public static final int RESULT_CODE_NO_PROFILE_INSTALLED = 0;
        public static final int RESULT_CODE_PROFILE_ENQUEUED_FOR_COMPILATION = 2;
        private final boolean mHasCurrentProfile;
        private final boolean mHasEmbeddedProfile;
        private final boolean mHasReferenceProfile;
        final int mResultCode;

        @Retention(RetentionPolicy.SOURCE)
        public @interface ResultCode {
        }

        CompilationStatus(int resultCode, boolean hasReferenceProfile, boolean hasCurrentProfile, boolean hasEmbeddedProfile) {
            this.mResultCode = resultCode;
            this.mHasCurrentProfile = hasCurrentProfile;
            this.mHasReferenceProfile = hasReferenceProfile;
            this.mHasEmbeddedProfile = hasEmbeddedProfile;
        }

        public int getProfileInstallResultCode() {
            return this.mResultCode;
        }

        public boolean isCompiledWithProfile() {
            return this.mHasReferenceProfile;
        }

        public boolean hasProfileEnqueuedForCompilation() {
            return this.mHasCurrentProfile;
        }

        public boolean appApkHasEmbeddedProfile() {
            return this.mHasEmbeddedProfile;
        }
    }

    private static class Api33Impl {
        private Api33Impl() {
        }

        static PackageInfo getPackageInfo(PackageManager packageManager, Context context) throws PackageManager.NameNotFoundException {
            return packageManager.getPackageInfo(context.getPackageName(), PackageManager.PackageInfoFlags.of(0));
        }
    }
}
