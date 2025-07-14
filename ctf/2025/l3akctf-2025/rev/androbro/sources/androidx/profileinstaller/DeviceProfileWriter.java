package androidx.profileinstaller;

import android.content.res.AssetManager;
import android.os.Build;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.profileinstaller.ProfileInstaller;
import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.nio.channels.FileChannel;
import java.nio.channels.FileLock;
import java.util.concurrent.Executor;

public class DeviceProfileWriter {
    private final String mApkName;
    private final AssetManager mAssetManager;
    private final File mCurProfile;
    private final byte[] mDesiredVersion;
    private boolean mDeviceSupportsAotProfile = false;
    private final ProfileInstaller.DiagnosticsCallback mDiagnostics;
    private final Executor mExecutor;
    private DexProfileData[] mProfile;
    private final String mProfileMetaSourceLocation;
    private final String mProfileSourceLocation;
    private byte[] mTranscodedProfile;

    private void result(int code, Object data) {
        this.mExecutor.execute(new DeviceProfileWriter$$ExternalSyntheticLambda0(this, code, data));
    }

    /* access modifiers changed from: package-private */
    /* renamed from: lambda$result$0$androidx-profileinstaller-DeviceProfileWriter  reason: not valid java name */
    public /* synthetic */ void m170lambda$result$0$androidxprofileinstallerDeviceProfileWriter(int code, Object data) {
        this.mDiagnostics.onResultReceived(code, data);
    }

    public DeviceProfileWriter(AssetManager assetManager, Executor executor, ProfileInstaller.DiagnosticsCallback diagnosticsCallback, String apkName, String profileSourceLocation, String profileMetaSourceLocation, File curProfile) {
        this.mAssetManager = assetManager;
        this.mExecutor = executor;
        this.mDiagnostics = diagnosticsCallback;
        this.mApkName = apkName;
        this.mProfileSourceLocation = profileSourceLocation;
        this.mProfileMetaSourceLocation = profileMetaSourceLocation;
        this.mCurProfile = curProfile;
        this.mDesiredVersion = desiredVersion();
    }

    public boolean deviceAllowsProfileInstallerAotWrites() {
        if (this.mDesiredVersion == null) {
            result(3, Integer.valueOf(Build.VERSION.SDK_INT));
            return false;
        }
        if (!this.mCurProfile.exists()) {
            try {
                if (!this.mCurProfile.createNewFile()) {
                    result(4, (Object) null);
                    return false;
                }
            } catch (IOException e) {
                result(4, (Object) null);
                return false;
            }
        } else if (!this.mCurProfile.canWrite()) {
            result(4, (Object) null);
            return false;
        }
        this.mDeviceSupportsAotProfile = true;
        return true;
    }

    private void assertDeviceAllowsProfileInstallerAotWritesCalled() {
        if (!this.mDeviceSupportsAotProfile) {
            throw new IllegalStateException("This device doesn't support aot. Did you call deviceSupportsAotProfile()?");
        }
    }

    public DeviceProfileWriter read() {
        DeviceProfileWriter profileWriter;
        assertDeviceAllowsProfileInstallerAotWritesCalled();
        if (this.mDesiredVersion == null) {
            return this;
        }
        InputStream profileStream = getProfileInputStream(this.mAssetManager);
        if (profileStream != null) {
            this.mProfile = readProfileInternal(profileStream);
        }
        if (this.mProfile != null) {
            DexProfileData[] profile = this.mProfile;
            if (!requiresMetadata() || (profileWriter = addMetadata(profile, this.mDesiredVersion)) == null) {
                return this;
            }
            return profileWriter;
        }
        return this;
    }

    private InputStream openStreamFromAssets(AssetManager assetManager, String location) throws IOException {
        try {
            return assetManager.openFd(location).createInputStream();
        } catch (FileNotFoundException e) {
            String message = e.getMessage();
            if (message == null || !message.contains("compressed")) {
                return null;
            }
            this.mDiagnostics.onDiagnosticReceived(5, (Object) null);
            return null;
        }
    }

    private InputStream getProfileInputStream(AssetManager assetManager) {
        try {
            return openStreamFromAssets(assetManager, this.mProfileSourceLocation);
        } catch (FileNotFoundException e) {
            this.mDiagnostics.onResultReceived(6, e);
            return null;
        } catch (IOException e2) {
            this.mDiagnostics.onResultReceived(7, e2);
            return null;
        }
    }

    private DexProfileData[] readProfileInternal(InputStream profileStream) {
        DexProfileData[] profile = null;
        try {
            profile = ProfileTranscoder.readProfile(profileStream, ProfileTranscoder.readHeader(profileStream, ProfileTranscoder.MAGIC_PROF), this.mApkName);
            try {
                profileStream.close();
            } catch (IOException e) {
                this.mDiagnostics.onResultReceived(7, e);
            }
        } catch (IOException e2) {
            this.mDiagnostics.onResultReceived(7, e2);
            profileStream.close();
        } catch (IllegalStateException e3) {
            this.mDiagnostics.onResultReceived(8, e3);
            profileStream.close();
        } catch (Throwable th) {
            try {
                profileStream.close();
            } catch (IOException e4) {
                this.mDiagnostics.onResultReceived(7, e4);
            }
            throw th;
        }
        return profile;
    }

    private DeviceProfileWriter addMetadata(DexProfileData[] profile, byte[] desiredVersion) {
        InputStream is;
        try {
            is = openStreamFromAssets(this.mAssetManager, this.mProfileMetaSourceLocation);
            if (is != null) {
                this.mProfile = ProfileTranscoder.readMeta(is, ProfileTranscoder.readHeader(is, ProfileTranscoder.MAGIC_PROFM), desiredVersion, profile);
                if (is != null) {
                    is.close();
                }
                return this;
            }
            if (is != null) {
                is.close();
            }
            return null;
        } catch (FileNotFoundException e) {
            this.mDiagnostics.onResultReceived(9, e);
        } catch (IOException e2) {
            this.mDiagnostics.onResultReceived(7, e2);
        } catch (IllegalStateException e3) {
            this.mProfile = null;
            this.mDiagnostics.onResultReceived(8, e3);
        } catch (Throwable th) {
            th.addSuppressed(th);
        }
        throw th;
    }

    public DeviceProfileWriter transcodeIfNeeded() {
        ByteArrayOutputStream os;
        DexProfileData[] profile = this.mProfile;
        byte[] desiredVersion = this.mDesiredVersion;
        if (profile == null || desiredVersion == null) {
            return this;
        }
        assertDeviceAllowsProfileInstallerAotWritesCalled();
        try {
            os = new ByteArrayOutputStream();
            ProfileTranscoder.writeHeader(os, desiredVersion);
            if (!ProfileTranscoder.transcodeAndWriteBody(os, desiredVersion, profile)) {
                this.mDiagnostics.onResultReceived(5, (Object) null);
                this.mProfile = null;
                os.close();
                return this;
            }
            this.mTranscodedProfile = os.toByteArray();
            os.close();
            this.mProfile = null;
            return this;
        } catch (IOException e) {
            this.mDiagnostics.onResultReceived(7, e);
        } catch (IllegalStateException e2) {
            this.mDiagnostics.onResultReceived(8, e2);
        } catch (Throwable th) {
            th.addSuppressed(th);
        }
        throw th;
    }

    public boolean write() {
        FileLock lock;
        byte[] transcodedProfile = this.mTranscodedProfile;
        if (transcodedProfile == null) {
            return false;
        }
        assertDeviceAllowsProfileInstallerAotWritesCalled();
        try {
            InputStream bis = new ByteArrayInputStream(transcodedProfile);
            try {
                FileOutputStream os = new FileOutputStream(this.mCurProfile);
                try {
                    FileChannel channel = os.getChannel();
                    try {
                        lock = channel.tryLock();
                        Encoding.writeAll(bis, os, lock);
                        result(1, (Object) null);
                        if (lock != null) {
                            lock.close();
                        }
                        if (channel != null) {
                            channel.close();
                        }
                        os.close();
                        bis.close();
                        this.mTranscodedProfile = null;
                        this.mProfile = null;
                        return true;
                    } catch (Throwable th) {
                        if (channel != null) {
                            channel.close();
                        }
                        throw th;
                    }
                } catch (Throwable th2) {
                    os.close();
                    throw th2;
                }
            } catch (Throwable th3) {
                bis.close();
                throw th3;
            }
        } catch (FileNotFoundException e) {
            result(6, e);
            this.mTranscodedProfile = null;
            this.mProfile = null;
            return false;
        } catch (IOException e2) {
            try {
                result(7, e2);
                this.mTranscodedProfile = null;
                this.mProfile = null;
                return false;
            } catch (Throwable th4) {
                this.mTranscodedProfile = null;
                this.mProfile = null;
                throw th4;
            }
        } catch (Throwable th5) {
            th3.addSuppressed(th5);
        }
        throw th;
    }

    private static byte[] desiredVersion() {
        if (Build.VERSION.SDK_INT >= 31) {
            return ProfileVersion.V015_S;
        }
        switch (Build.VERSION.SDK_INT) {
            case 24:
            case 25:
                return ProfileVersion.V001_N;
            case 26:
                return ProfileVersion.V005_O;
            case 27:
                return ProfileVersion.V009_O_MR1;
            case 28:
            case ConstraintLayout.LayoutParams.Table.LAYOUT_CONSTRAINT_HORIZONTAL_BIAS:
            case 30:
                return ProfileVersion.V010_P;
            default:
                return null;
        }
    }

    private static boolean requiresMetadata() {
        if (Build.VERSION.SDK_INT >= 31) {
            return true;
        }
        switch (Build.VERSION.SDK_INT) {
            case 24:
            case 25:
                return true;
            case 26:
            case 27:
            case 28:
            case ConstraintLayout.LayoutParams.Table.LAYOUT_CONSTRAINT_HORIZONTAL_BIAS:
            case 30:
                return false;
            default:
                return false;
        }
    }
}
