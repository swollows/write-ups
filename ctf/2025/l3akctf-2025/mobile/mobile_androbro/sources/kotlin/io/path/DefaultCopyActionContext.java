package kotlin.io.path;

import kotlin.Metadata;

@Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0000\bÃ\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u001c\u0010\u0003\u001a\u00020\u0004*\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u00052\u0006\u0010\u0007\u001a\u00020\bH\u0016¨\u0006\t"}, d2 = {"Lkotlin/io/path/DefaultCopyActionContext;", "Lkotlin/io/path/CopyActionContext;", "()V", "copyToIgnoringExistingDirectory", "Lkotlin/io/path/CopyActionResult;", "Ljava/nio/file/Path;", "target", "followLinks", "", "kotlin-stdlib-jdk7"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* compiled from: PathRecursiveFunctions.kt */
final class DefaultCopyActionContext implements CopyActionContext {
    public static final DefaultCopyActionContext INSTANCE = new DefaultCopyActionContext();

    private DefaultCopyActionContext() {
    }

    /* JADX WARNING: Code restructure failed: missing block: B:3:0x0037, code lost:
        if (java.nio.file.Files.isDirectory(r7, (java.nio.file.LinkOption[]) java.util.Arrays.copyOf(new java.nio.file.LinkOption[]{java.nio.file.LinkOption.NOFOLLOW_LINKS}, 1)) == false) goto L_0x0039;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public kotlin.io.path.CopyActionResult copyToIgnoringExistingDirectory(java.nio.file.Path r6, java.nio.file.Path r7, boolean r8) {
        /*
            r5 = this;
            java.lang.String r0 = "<this>"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r6, r0)
            java.lang.String r0 = "target"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r7, r0)
            kotlin.io.path.LinkFollowing r0 = kotlin.io.path.LinkFollowing.INSTANCE
            java.nio.file.LinkOption[] r0 = r0.toLinkOptions(r8)
            int r1 = r0.length
            java.lang.Object[] r1 = java.util.Arrays.copyOf(r0, r1)
            java.nio.file.LinkOption[] r1 = (java.nio.file.LinkOption[]) r1
            int r2 = r1.length
            java.lang.Object[] r1 = java.util.Arrays.copyOf(r1, r2)
            java.nio.file.LinkOption[] r1 = (java.nio.file.LinkOption[]) r1
            boolean r1 = java.nio.file.Files.isDirectory(r6, r1)
            if (r1 == 0) goto L_0x0039
            r1 = 1
            java.nio.file.LinkOption[] r2 = new java.nio.file.LinkOption[r1]
            r3 = 0
            java.nio.file.LinkOption r4 = java.nio.file.LinkOption.NOFOLLOW_LINKS
            r2[r3] = r4
            java.lang.Object[] r1 = java.util.Arrays.copyOf(r2, r1)
            java.nio.file.LinkOption[] r1 = (java.nio.file.LinkOption[]) r1
            boolean r1 = java.nio.file.Files.isDirectory(r7, r1)
            if (r1 != 0) goto L_0x0050
        L_0x0039:
            int r1 = r0.length
            java.lang.Object[] r1 = java.util.Arrays.copyOf(r0, r1)
            java.nio.file.CopyOption[] r1 = (java.nio.file.CopyOption[]) r1
            int r2 = r1.length
            java.lang.Object[] r1 = java.util.Arrays.copyOf(r1, r2)
            java.nio.file.CopyOption[] r1 = (java.nio.file.CopyOption[]) r1
            java.nio.file.Path r1 = java.nio.file.Files.copy(r6, r7, r1)
            java.lang.String r2 = "copy(...)"
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(r1, r2)
        L_0x0050:
            kotlin.io.path.CopyActionResult r1 = kotlin.io.path.CopyActionResult.CONTINUE
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: kotlin.io.path.DefaultCopyActionContext.copyToIgnoringExistingDirectory(java.nio.file.Path, java.nio.file.Path, boolean):kotlin.io.path.CopyActionResult");
    }
}
