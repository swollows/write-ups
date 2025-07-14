package kotlin.io.path;

import java.nio.file.Path;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.RestrictedSuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlin.sequences.SequenceScope;

@Metadata(d1 = {"\u0000\u000e\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\b\u0012\u0004\u0012\u00020\u00030\u0002H@"}, d2 = {"<anonymous>", "", "Lkotlin/sequences/SequenceScope;", "Ljava/nio/file/Path;"}, k = 3, mv = {1, 9, 0}, xi = 48)
@DebugMetadata(c = "kotlin.io.path.PathTreeWalk$dfsIterator$1", f = "PathTreeWalk.kt", i = {0, 0, 0, 0, 0, 0, 1, 1, 1, 2, 2, 2, 2, 2, 2, 3, 3, 3}, l = {184, 190, 199, 205}, m = "invokeSuspend", n = {"$this$iterator", "stack", "entriesReader", "startNode", "this_$iv", "path$iv", "$this$iterator", "stack", "entriesReader", "$this$iterator", "stack", "entriesReader", "pathNode", "this_$iv", "path$iv", "$this$iterator", "stack", "entriesReader"}, s = {"L$0", "L$1", "L$2", "L$3", "L$4", "L$5", "L$0", "L$1", "L$2", "L$0", "L$1", "L$2", "L$3", "L$4", "L$5", "L$0", "L$1", "L$2"})
/* compiled from: PathTreeWalk.kt */
final class PathTreeWalk$dfsIterator$1 extends RestrictedSuspendLambda implements Function2<SequenceScope<? super Path>, Continuation<? super Unit>, Object> {
    private /* synthetic */ Object L$0;
    Object L$1;
    Object L$2;
    Object L$3;
    Object L$4;
    Object L$5;
    int label;
    final /* synthetic */ PathTreeWalk this$0;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    PathTreeWalk$dfsIterator$1(PathTreeWalk pathTreeWalk, Continuation<? super PathTreeWalk$dfsIterator$1> continuation) {
        super(2, continuation);
        this.this$0 = pathTreeWalk;
    }

    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        PathTreeWalk$dfsIterator$1 pathTreeWalk$dfsIterator$1 = new PathTreeWalk$dfsIterator$1(this.this$0, continuation);
        pathTreeWalk$dfsIterator$1.L$0 = obj;
        return pathTreeWalk$dfsIterator$1;
    }

    public final Object invoke(SequenceScope<? super Path> sequenceScope, Continuation<? super Unit> continuation) {
        return ((PathTreeWalk$dfsIterator$1) create(sequenceScope, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    /* JADX WARNING: Code restructure failed: missing block: B:18:0x010f, code lost:
        r14 = r8;
        r8 = r11;
        r11 = r9;
        r9 = r12;
        r16 = r13;
        r13 = r7;
        r7 = r10;
        r10 = r16;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:19:0x0119, code lost:
        r5 = r11.getLinkOptions();
        r5 = (java.nio.file.LinkOption[]) java.util.Arrays.copyOf(r5, r5.length);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:20:0x012f, code lost:
        if (java.nio.file.Files.isDirectory(r14, (java.nio.file.LinkOption[]) java.util.Arrays.copyOf(r5, r5.length)) == false) goto L_0x0173;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:21:0x0131, code lost:
        r7.setContentIterator(r8.readEntries(r7).iterator());
        r9.addLast(r7);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:31:0x017a, code lost:
        if (r9.isEmpty() != false) goto L_0x025b;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:32:0x017c, code lost:
        r7 = ((kotlin.io.path.PathNode) r9.last()).getContentIterator();
        kotlin.jvm.internal.Intrinsics.checkNotNull(r7);
        r5 = r7;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:33:0x018e, code lost:
        if (r5.hasNext() == false) goto L_0x0255;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:34:0x0190, code lost:
        r5 = r5.next();
        r7 = r2.this$0;
        r11 = r10;
        r13 = r5.getPath();
        r14 = r7.getLinkOptions();
        r14 = (java.nio.file.LinkOption[]) java.util.Arrays.copyOf(r14, r14.length);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:35:0x01b5, code lost:
        if (java.nio.file.Files.isDirectory(r13, (java.nio.file.LinkOption[]) java.util.Arrays.copyOf(r14, r14.length)) == false) goto L_0x0224;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:37:0x01bb, code lost:
        if (kotlin.io.path.PathTreeWalkKt.createsCycle(r5) != false) goto L_0x021a;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:39:0x01c1, code lost:
        if (r7.getIncludeDirectories() == false) goto L_0x01f0;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:40:0x01c3, code lost:
        r2.L$0 = r10;
        r2.L$1 = r9;
        r2.L$2 = r8;
        r2.L$3 = r5;
        r2.L$4 = r7;
        r2.L$5 = r13;
        r2.label = 3;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:41:0x01d9, code lost:
        if (r11.yield(r13, r2) != r0) goto L_0x01dc;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:42:0x01db, code lost:
        return r0;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:43:0x01dc, code lost:
        r11 = r8;
        r8 = r13;
        r13 = r10;
        r10 = r5;
        r16 = r9;
        r9 = r7;
        r7 = false;
        r12 = r16;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:44:0x01e6, code lost:
        r5 = r10;
        r10 = r13;
        r13 = r8;
        r8 = r11;
        r16 = r12;
        r12 = r7;
        r7 = r9;
        r9 = r16;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:45:0x01f0, code lost:
        r11 = r7.getLinkOptions();
        r7 = (java.nio.file.LinkOption[]) java.util.Arrays.copyOf(r11, r11.length);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:46:0x0206, code lost:
        if (java.nio.file.Files.isDirectory(r13, (java.nio.file.LinkOption[]) java.util.Arrays.copyOf(r7, r7.length)) == false) goto L_0x0173;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:47:0x0208, code lost:
        r5.setContentIterator(r8.readEntries(r5).iterator());
        r9.addLast(r5);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:49:0x0223, code lost:
        throw new java.nio.file.FileSystemLoopException(r13.toString());
     */
    /* JADX WARNING: Code restructure failed: missing block: B:51:0x0234, code lost:
        if (java.nio.file.Files.exists(r13, (java.nio.file.LinkOption[]) java.util.Arrays.copyOf(new java.nio.file.LinkOption[]{java.nio.file.LinkOption.NOFOLLOW_LINKS}, 1)) == false) goto L_0x0252;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:52:0x0236, code lost:
        r2.L$0 = r10;
        r2.L$1 = r9;
        r2.L$2 = r8;
        r2.L$3 = null;
        r2.L$4 = null;
        r2.L$5 = null;
        r2.label = 4;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:53:0x024d, code lost:
        if (r11.yield(r13, r2) != r0) goto L_0x0173;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:54:0x024f, code lost:
        return r0;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:56:0x0255, code lost:
        r9.removeLast();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:58:0x025d, code lost:
        return kotlin.Unit.INSTANCE;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.lang.Object invokeSuspend(java.lang.Object r18) {
        /*
            r17 = this;
            java.lang.Object r0 = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED()
            r1 = r17
            int r2 = r1.label
            r3 = 0
            r4 = 1
            r5 = 0
            switch(r2) {
                case 0: goto L_0x0088;
                case 1: goto L_0x0066;
                case 2: goto L_0x0050;
                case 3: goto L_0x002e;
                case 4: goto L_0x0016;
                default: goto L_0x000e;
            }
        L_0x000e:
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
            java.lang.String r2 = "call to 'resume' before 'invoke' with coroutine"
            r0.<init>(r2)
            throw r0
        L_0x0016:
            r2 = r17
            r6 = r18
            r7 = 0
            java.lang.Object r8 = r2.L$2
            kotlin.io.path.DirectoryEntriesReader r8 = (kotlin.io.path.DirectoryEntriesReader) r8
            java.lang.Object r9 = r2.L$1
            kotlin.collections.ArrayDeque r9 = (kotlin.collections.ArrayDeque) r9
            java.lang.Object r10 = r2.L$0
            kotlin.sequences.SequenceScope r10 = (kotlin.sequences.SequenceScope) r10
            kotlin.ResultKt.throwOnFailure(r6)
            r12 = r7
            r7 = r5
            goto L_0x0250
        L_0x002e:
            r2 = r17
            r6 = r18
            r7 = 0
            java.lang.Object r8 = r2.L$5
            java.nio.file.Path r8 = (java.nio.file.Path) r8
            java.lang.Object r9 = r2.L$4
            kotlin.io.path.PathTreeWalk r9 = (kotlin.io.path.PathTreeWalk) r9
            java.lang.Object r10 = r2.L$3
            kotlin.io.path.PathNode r10 = (kotlin.io.path.PathNode) r10
            java.lang.Object r11 = r2.L$2
            kotlin.io.path.DirectoryEntriesReader r11 = (kotlin.io.path.DirectoryEntriesReader) r11
            java.lang.Object r12 = r2.L$1
            kotlin.collections.ArrayDeque r12 = (kotlin.collections.ArrayDeque) r12
            java.lang.Object r13 = r2.L$0
            kotlin.sequences.SequenceScope r13 = (kotlin.sequences.SequenceScope) r13
            kotlin.ResultKt.throwOnFailure(r6)
            goto L_0x01e6
        L_0x0050:
            r2 = r17
            r6 = r18
            r7 = 0
            java.lang.Object r8 = r2.L$2
            kotlin.io.path.DirectoryEntriesReader r8 = (kotlin.io.path.DirectoryEntriesReader) r8
            java.lang.Object r9 = r2.L$1
            kotlin.collections.ArrayDeque r9 = (kotlin.collections.ArrayDeque) r9
            java.lang.Object r10 = r2.L$0
            kotlin.sequences.SequenceScope r10 = (kotlin.sequences.SequenceScope) r10
            kotlin.ResultKt.throwOnFailure(r6)
            goto L_0x0172
        L_0x0066:
            r2 = r17
            r6 = r18
            r7 = 0
            java.lang.Object r8 = r2.L$5
            java.nio.file.Path r8 = (java.nio.file.Path) r8
            java.lang.Object r9 = r2.L$4
            kotlin.io.path.PathTreeWalk r9 = (kotlin.io.path.PathTreeWalk) r9
            java.lang.Object r10 = r2.L$3
            kotlin.io.path.PathNode r10 = (kotlin.io.path.PathNode) r10
            java.lang.Object r11 = r2.L$2
            kotlin.io.path.DirectoryEntriesReader r11 = (kotlin.io.path.DirectoryEntriesReader) r11
            java.lang.Object r12 = r2.L$1
            kotlin.collections.ArrayDeque r12 = (kotlin.collections.ArrayDeque) r12
            java.lang.Object r13 = r2.L$0
            kotlin.sequences.SequenceScope r13 = (kotlin.sequences.SequenceScope) r13
            kotlin.ResultKt.throwOnFailure(r6)
            goto L_0x010f
        L_0x0088:
            kotlin.ResultKt.throwOnFailure(r18)
            r2 = r17
            r6 = r18
            java.lang.Object r7 = r2.L$0
            r10 = r7
            kotlin.sequences.SequenceScope r10 = (kotlin.sequences.SequenceScope) r10
            kotlin.collections.ArrayDeque r7 = new kotlin.collections.ArrayDeque
            r7.<init>()
            r9 = r7
            kotlin.io.path.DirectoryEntriesReader r7 = new kotlin.io.path.DirectoryEntriesReader
            kotlin.io.path.PathTreeWalk r8 = r2.this$0
            boolean r8 = r8.getFollowLinks()
            r7.<init>(r8)
            r8 = r7
            kotlin.io.path.PathNode r7 = new kotlin.io.path.PathNode
            kotlin.io.path.PathTreeWalk r11 = r2.this$0
            java.nio.file.Path r11 = r11.start
            kotlin.io.path.PathTreeWalk r12 = r2.this$0
            java.nio.file.Path r12 = r12.start
            kotlin.io.path.PathTreeWalk r13 = r2.this$0
            java.nio.file.LinkOption[] r13 = r13.getLinkOptions()
            java.lang.Object r12 = kotlin.io.path.PathTreeWalkKt.keyOf(r12, r13)
            r7.<init>(r11, r12, r5)
            kotlin.io.path.PathTreeWalk r11 = r2.this$0
            r12 = r10
            r13 = 0
            java.nio.file.Path r14 = r7.getPath()
            java.nio.file.LinkOption[] r15 = r11.getLinkOptions()
            int r5 = r15.length
            java.lang.Object[] r5 = java.util.Arrays.copyOf(r15, r5)
            java.nio.file.LinkOption[] r5 = (java.nio.file.LinkOption[]) r5
            int r15 = r5.length
            java.lang.Object[] r5 = java.util.Arrays.copyOf(r5, r15)
            java.nio.file.LinkOption[] r5 = (java.nio.file.LinkOption[]) r5
            boolean r5 = java.nio.file.Files.isDirectory(r14, r5)
            if (r5 == 0) goto L_0x014c
            boolean r5 = kotlin.io.path.PathTreeWalkKt.createsCycle(r7)
            if (r5 != 0) goto L_0x0142
            boolean r5 = r11.getIncludeDirectories()
            if (r5 == 0) goto L_0x0119
            r5 = r2
            kotlin.coroutines.Continuation r5 = (kotlin.coroutines.Continuation) r5
            r2.L$0 = r10
            r2.L$1 = r9
            r2.L$2 = r8
            r2.L$3 = r7
            r2.L$4 = r11
            r2.L$5 = r14
            r2.label = r4
            java.lang.Object r5 = r12.yield(r14, r5)
            if (r5 != r0) goto L_0x0105
            return r0
        L_0x0105:
            r12 = r9
            r9 = r11
            r11 = r8
            r8 = r14
            r16 = r10
            r10 = r7
            r7 = r13
            r13 = r16
        L_0x010f:
            r14 = r8
            r8 = r11
            r11 = r9
            r9 = r12
            r16 = r13
            r13 = r7
            r7 = r10
            r10 = r16
        L_0x0119:
            java.nio.file.LinkOption[] r5 = r11.getLinkOptions()
            int r11 = r5.length
            java.lang.Object[] r5 = java.util.Arrays.copyOf(r5, r11)
            java.nio.file.LinkOption[] r5 = (java.nio.file.LinkOption[]) r5
            int r11 = r5.length
            java.lang.Object[] r5 = java.util.Arrays.copyOf(r5, r11)
            java.nio.file.LinkOption[] r5 = (java.nio.file.LinkOption[]) r5
            boolean r5 = java.nio.file.Files.isDirectory(r14, r5)
            if (r5 == 0) goto L_0x0173
            java.util.List r5 = r8.readEntries(r7)
            r11 = 0
            java.util.Iterator r12 = r5.iterator()
            r7.setContentIterator(r12)
            r9.addLast(r7)
            goto L_0x0173
        L_0x0142:
            java.nio.file.FileSystemLoopException r0 = new java.nio.file.FileSystemLoopException
            java.lang.String r3 = r14.toString()
            r0.<init>(r3)
            throw r0
        L_0x014c:
            java.nio.file.LinkOption[] r5 = new java.nio.file.LinkOption[r4]
            java.nio.file.LinkOption r7 = java.nio.file.LinkOption.NOFOLLOW_LINKS
            r5[r3] = r7
            java.lang.Object[] r5 = java.util.Arrays.copyOf(r5, r4)
            java.nio.file.LinkOption[] r5 = (java.nio.file.LinkOption[]) r5
            boolean r5 = java.nio.file.Files.exists(r14, r5)
            if (r5 == 0) goto L_0x0173
            r5 = r2
            kotlin.coroutines.Continuation r5 = (kotlin.coroutines.Continuation) r5
            r2.L$0 = r10
            r2.L$1 = r9
            r2.L$2 = r8
            r7 = 2
            r2.label = r7
            java.lang.Object r5 = r12.yield(r14, r5)
            if (r5 != r0) goto L_0x0171
            return r0
        L_0x0171:
            r7 = r13
        L_0x0172:
        L_0x0173:
            r5 = r9
            java.util.Collection r5 = (java.util.Collection) r5
            boolean r5 = r5.isEmpty()
            if (r5 != 0) goto L_0x025b
            java.lang.Object r5 = r9.last()
            kotlin.io.path.PathNode r5 = (kotlin.io.path.PathNode) r5
            java.util.Iterator r7 = r5.getContentIterator()
            kotlin.jvm.internal.Intrinsics.checkNotNull(r7)
            r5 = r7
            boolean r7 = r5.hasNext()
            if (r7 == 0) goto L_0x0255
            java.lang.Object r7 = r5.next()
            r5 = r7
            kotlin.io.path.PathNode r5 = (kotlin.io.path.PathNode) r5
            kotlin.io.path.PathTreeWalk r7 = r2.this$0
            r11 = r10
            r12 = 0
            java.nio.file.Path r13 = r5.getPath()
            java.nio.file.LinkOption[] r14 = r7.getLinkOptions()
            int r15 = r14.length
            java.lang.Object[] r14 = java.util.Arrays.copyOf(r14, r15)
            java.nio.file.LinkOption[] r14 = (java.nio.file.LinkOption[]) r14
            int r15 = r14.length
            java.lang.Object[] r14 = java.util.Arrays.copyOf(r14, r15)
            java.nio.file.LinkOption[] r14 = (java.nio.file.LinkOption[]) r14
            boolean r14 = java.nio.file.Files.isDirectory(r13, r14)
            if (r14 == 0) goto L_0x0224
            boolean r14 = kotlin.io.path.PathTreeWalkKt.createsCycle(r5)
            if (r14 != 0) goto L_0x021a
            boolean r14 = r7.getIncludeDirectories()
            if (r14 == 0) goto L_0x01f0
            r14 = r2
            kotlin.coroutines.Continuation r14 = (kotlin.coroutines.Continuation) r14
            r2.L$0 = r10
            r2.L$1 = r9
            r2.L$2 = r8
            r2.L$3 = r5
            r2.L$4 = r7
            r2.L$5 = r13
            r15 = 3
            r2.label = r15
            java.lang.Object r11 = r11.yield(r13, r14)
            if (r11 != r0) goto L_0x01dc
            return r0
        L_0x01dc:
            r11 = r8
            r8 = r13
            r13 = r10
            r10 = r5
            r16 = r9
            r9 = r7
            r7 = r12
            r12 = r16
        L_0x01e6:
            r5 = r10
            r10 = r13
            r13 = r8
            r8 = r11
            r16 = r12
            r12 = r7
            r7 = r9
            r9 = r16
        L_0x01f0:
            java.nio.file.LinkOption[] r11 = r7.getLinkOptions()
            int r7 = r11.length
            java.lang.Object[] r7 = java.util.Arrays.copyOf(r11, r7)
            java.nio.file.LinkOption[] r7 = (java.nio.file.LinkOption[]) r7
            int r11 = r7.length
            java.lang.Object[] r7 = java.util.Arrays.copyOf(r7, r11)
            java.nio.file.LinkOption[] r7 = (java.nio.file.LinkOption[]) r7
            boolean r7 = java.nio.file.Files.isDirectory(r13, r7)
            if (r7 == 0) goto L_0x0173
            java.util.List r7 = r8.readEntries(r5)
            r11 = 0
            java.util.Iterator r13 = r7.iterator()
            r5.setContentIterator(r13)
            r9.addLast(r5)
            goto L_0x0173
        L_0x021a:
            java.nio.file.FileSystemLoopException r0 = new java.nio.file.FileSystemLoopException
            java.lang.String r3 = r13.toString()
            r0.<init>(r3)
            throw r0
        L_0x0224:
            java.nio.file.LinkOption[] r5 = new java.nio.file.LinkOption[r4]
            java.nio.file.LinkOption r7 = java.nio.file.LinkOption.NOFOLLOW_LINKS
            r5[r3] = r7
            java.lang.Object[] r5 = java.util.Arrays.copyOf(r5, r4)
            java.nio.file.LinkOption[] r5 = (java.nio.file.LinkOption[]) r5
            boolean r5 = java.nio.file.Files.exists(r13, r5)
            if (r5 == 0) goto L_0x0252
            r5 = r2
            kotlin.coroutines.Continuation r5 = (kotlin.coroutines.Continuation) r5
            r2.L$0 = r10
            r2.L$1 = r9
            r2.L$2 = r8
            r7 = 0
            r2.L$3 = r7
            r2.L$4 = r7
            r2.L$5 = r7
            r14 = 4
            r2.label = r14
            java.lang.Object r5 = r11.yield(r13, r5)
            if (r5 != r0) goto L_0x0250
            return r0
        L_0x0250:
            goto L_0x0173
        L_0x0252:
            r7 = 0
            goto L_0x0173
        L_0x0255:
            r7 = 0
            r9.removeLast()
            goto L_0x0173
        L_0x025b:
            kotlin.Unit r0 = kotlin.Unit.INSTANCE
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: kotlin.io.path.PathTreeWalk$dfsIterator$1.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
