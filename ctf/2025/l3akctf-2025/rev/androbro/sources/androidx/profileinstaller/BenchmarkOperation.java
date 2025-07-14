package androidx.profileinstaller;

import android.content.Context;
import android.os.Build;
import androidx.profileinstaller.ProfileInstallReceiver;
import java.io.File;

class BenchmarkOperation {
    private BenchmarkOperation() {
    }

    static void dropShaderCache(Context context, ProfileInstallReceiver.ResultDiagnostics callback) {
        File shaderDirectory;
        if (Build.VERSION.SDK_INT >= 34) {
            shaderDirectory = Api24ContextHelper.createDeviceProtectedStorageContext(context).getCacheDir();
        } else {
            shaderDirectory = Api21ContextHelper.getCodeCacheDir(Api24ContextHelper.createDeviceProtectedStorageContext(context));
        }
        if (deleteFilesRecursively(shaderDirectory)) {
            callback.onResultReceived(14, (Object) null);
        } else {
            callback.onResultReceived(15, (Object) null);
        }
    }

    static boolean deleteFilesRecursively(File file) {
        if (file.isDirectory()) {
            File[] children = file.listFiles();
            if (children == null) {
                return false;
            }
            boolean success = true;
            int length = children.length;
            for (int i = 0; i < length; i++) {
                success = deleteFilesRecursively(children[i]) && success;
            }
            return success;
        }
        file.delete();
        return true;
    }

    private static class Api21ContextHelper {
        private Api21ContextHelper() {
        }

        static File getCodeCacheDir(Context context) {
            return context.getCodeCacheDir();
        }
    }

    private static class Api24ContextHelper {
        private Api24ContextHelper() {
        }

        static Context createDeviceProtectedStorageContext(Context context) {
            return context.createDeviceProtectedStorageContext();
        }
    }
}
