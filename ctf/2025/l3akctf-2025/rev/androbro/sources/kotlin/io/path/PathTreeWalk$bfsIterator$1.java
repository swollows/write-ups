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
@DebugMetadata(c = "kotlin.io.path.PathTreeWalk$bfsIterator$1", f = "PathTreeWalk.kt", i = {0, 0, 0, 0, 0, 0, 1, 1, 1}, l = {184, 190}, m = "invokeSuspend", n = {"$this$iterator", "queue", "entriesReader", "pathNode", "this_$iv", "path$iv", "$this$iterator", "queue", "entriesReader"}, s = {"L$0", "L$1", "L$2", "L$3", "L$4", "L$5", "L$0", "L$1", "L$2"})
/* compiled from: PathTreeWalk.kt */
final class PathTreeWalk$bfsIterator$1 extends RestrictedSuspendLambda implements Function2<SequenceScope<? super Path>, Continuation<? super Unit>, Object> {
    private /* synthetic */ Object L$0;
    Object L$1;
    Object L$2;
    Object L$3;
    Object L$4;
    Object L$5;
    int label;
    final /* synthetic */ PathTreeWalk this$0;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    PathTreeWalk$bfsIterator$1(PathTreeWalk pathTreeWalk, Continuation<? super PathTreeWalk$bfsIterator$1> continuation) {
        super(2, continuation);
        this.this$0 = pathTreeWalk;
    }

    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        PathTreeWalk$bfsIterator$1 pathTreeWalk$bfsIterator$1 = new PathTreeWalk$bfsIterator$1(this.this$0, continuation);
        pathTreeWalk$bfsIterator$1.L$0 = obj;
        return pathTreeWalk$bfsIterator$1;
    }

    public final Object invoke(SequenceScope<? super Path> sequenceScope, Continuation<? super Unit> continuation) {
        return ((PathTreeWalk$bfsIterator$1) create(sequenceScope, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
        jadx.core.utils.exceptions.JadxOverflowException: Regions count limit reached
        	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:47)
        	at jadx.core.utils.ErrorsCounter.methodError(ErrorsCounter.java:81)
        */
    /* JADX WARNING: Removed duplicated region for block: B:22:0x00fa  */
    /* JADX WARNING: Removed duplicated region for block: B:34:0x0141 A[SYNTHETIC] */
    /* JADX WARNING: Removed duplicated region for block: B:9:0x0087  */
    public final java.lang.Object invokeSuspend(java.lang.Object r15) {
        /*
            r14 = this;
            java.lang.Object r0 = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED()
            int r1 = r14.label
            r2 = 0
            switch(r1) {
                case 0: goto L_0x0044;
                case 1: goto L_0x0025;
                case 2: goto L_0x0012;
                default: goto L_0x000a;
            }
        L_0x000a:
            java.lang.IllegalStateException r15 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r15.<init>(r0)
            throw r15
        L_0x0012:
            r1 = r14
            r3 = 0
            java.lang.Object r4 = r1.L$2
            kotlin.io.path.DirectoryEntriesReader r4 = (kotlin.io.path.DirectoryEntriesReader) r4
            java.lang.Object r5 = r1.L$1
            kotlin.collections.ArrayDeque r5 = (kotlin.collections.ArrayDeque) r5
            java.lang.Object r6 = r1.L$0
            kotlin.sequences.SequenceScope r6 = (kotlin.sequences.SequenceScope) r6
            kotlin.ResultKt.throwOnFailure(r15)
            goto L_0x013f
        L_0x0025:
            r1 = r14
            r3 = 0
            java.lang.Object r4 = r1.L$5
            java.nio.file.Path r4 = (java.nio.file.Path) r4
            java.lang.Object r5 = r1.L$4
            kotlin.io.path.PathTreeWalk r5 = (kotlin.io.path.PathTreeWalk) r5
            java.lang.Object r6 = r1.L$3
            kotlin.io.path.PathNode r6 = (kotlin.io.path.PathNode) r6
            java.lang.Object r7 = r1.L$2
            kotlin.io.path.DirectoryEntriesReader r7 = (kotlin.io.path.DirectoryEntriesReader) r7
            java.lang.Object r8 = r1.L$1
            kotlin.collections.ArrayDeque r8 = (kotlin.collections.ArrayDeque) r8
            java.lang.Object r9 = r1.L$0
            kotlin.sequences.SequenceScope r9 = (kotlin.sequences.SequenceScope) r9
            kotlin.ResultKt.throwOnFailure(r15)
            goto L_0x00da
        L_0x0044:
            kotlin.ResultKt.throwOnFailure(r15)
            r1 = r14
            java.lang.Object r3 = r1.L$0
            kotlin.sequences.SequenceScope r3 = (kotlin.sequences.SequenceScope) r3
            kotlin.collections.ArrayDeque r4 = new kotlin.collections.ArrayDeque
            r4.<init>()
            kotlin.io.path.DirectoryEntriesReader r5 = new kotlin.io.path.DirectoryEntriesReader
            kotlin.io.path.PathTreeWalk r6 = r1.this$0
            boolean r6 = r6.getFollowLinks()
            r5.<init>(r6)
            kotlin.io.path.PathNode r6 = new kotlin.io.path.PathNode
            kotlin.io.path.PathTreeWalk r7 = r1.this$0
            java.nio.file.Path r7 = r7.start
            kotlin.io.path.PathTreeWalk r8 = r1.this$0
            java.nio.file.Path r8 = r8.start
            kotlin.io.path.PathTreeWalk r9 = r1.this$0
            java.nio.file.LinkOption[] r9 = r9.getLinkOptions()
            java.lang.Object r8 = kotlin.io.path.PathTreeWalkKt.keyOf(r8, r9)
            r6.<init>(r7, r8, r2)
            r4.addLast(r6)
            r6 = r3
            r13 = r5
            r5 = r4
            r4 = r13
        L_0x007e:
            r3 = r5
            java.util.Collection r3 = (java.util.Collection) r3
            boolean r3 = r3.isEmpty()
            if (r3 != 0) goto L_0x0141
            java.lang.Object r3 = r5.removeFirst()
            kotlin.io.path.PathNode r3 = (kotlin.io.path.PathNode) r3
            kotlin.io.path.PathTreeWalk r7 = r1.this$0
            r8 = r6
            r9 = 0
            java.nio.file.Path r10 = r3.getPath()
            java.nio.file.LinkOption[] r11 = r7.getLinkOptions()
            int r12 = r11.length
            java.lang.Object[] r11 = java.util.Arrays.copyOf(r11, r12)
            java.nio.file.LinkOption[] r11 = (java.nio.file.LinkOption[]) r11
            int r12 = r11.length
            java.lang.Object[] r11 = java.util.Arrays.copyOf(r11, r12)
            java.nio.file.LinkOption[] r11 = (java.nio.file.LinkOption[]) r11
            boolean r11 = java.nio.file.Files.isDirectory(r10, r11)
            r12 = 1
            if (r11 == 0) goto L_0x0112
            boolean r11 = kotlin.io.path.PathTreeWalkKt.createsCycle(r3)
            if (r11 != 0) goto L_0x0108
            boolean r11 = r7.getIncludeDirectories()
            if (r11 == 0) goto L_0x00e2
            r11 = r1
            kotlin.coroutines.Continuation r11 = (kotlin.coroutines.Continuation) r11
            r1.L$0 = r6
            r1.L$1 = r5
            r1.L$2 = r4
            r1.L$3 = r3
            r1.L$4 = r7
            r1.L$5 = r10
            r1.label = r12
            java.lang.Object r8 = r8.yield(r10, r11)
            if (r8 != r0) goto L_0x00d2
            return r0
        L_0x00d2:
            r8 = r5
            r5 = r7
            r7 = r4
            r4 = r10
            r13 = r6
            r6 = r3
            r3 = r9
            r9 = r13
        L_0x00da:
            r10 = r4
            r4 = r7
            r7 = r5
            r5 = r8
            r13 = r9
            r9 = r3
            r3 = r6
            r6 = r13
        L_0x00e2:
            java.nio.file.LinkOption[] r8 = r7.getLinkOptions()
            int r7 = r8.length
            java.lang.Object[] r7 = java.util.Arrays.copyOf(r8, r7)
            java.nio.file.LinkOption[] r7 = (java.nio.file.LinkOption[]) r7
            int r8 = r7.length
            java.lang.Object[] r7 = java.util.Arrays.copyOf(r7, r8)
            java.nio.file.LinkOption[] r7 = (java.nio.file.LinkOption[]) r7
            boolean r7 = java.nio.file.Files.isDirectory(r10, r7)
            if (r7 == 0) goto L_0x007e
            java.util.List r3 = r4.readEntries(r3)
            r7 = 0
            r8 = r3
            java.util.Collection r8 = (java.util.Collection) r8
            r5.addAll(r8)
            goto L_0x007e
        L_0x0108:
            java.nio.file.FileSystemLoopException r0 = new java.nio.file.FileSystemLoopException
            java.lang.String r2 = r10.toString()
            r0.<init>(r2)
            throw r0
        L_0x0112:
            java.nio.file.LinkOption[] r3 = new java.nio.file.LinkOption[r12]
            r7 = 0
            java.nio.file.LinkOption r11 = java.nio.file.LinkOption.NOFOLLOW_LINKS
            r3[r7] = r11
            java.lang.Object[] r3 = java.util.Arrays.copyOf(r3, r12)
            java.nio.file.LinkOption[] r3 = (java.nio.file.LinkOption[]) r3
            boolean r3 = java.nio.file.Files.exists(r10, r3)
            if (r3 == 0) goto L_0x007e
            r3 = r1
            kotlin.coroutines.Continuation r3 = (kotlin.coroutines.Continuation) r3
            r1.L$0 = r6
            r1.L$1 = r5
            r1.L$2 = r4
            r1.L$3 = r2
            r1.L$4 = r2
            r1.L$5 = r2
            r7 = 2
            r1.label = r7
            java.lang.Object r3 = r8.yield(r10, r3)
            if (r3 != r0) goto L_0x013e
            return r0
        L_0x013e:
            r3 = r9
        L_0x013f:
            goto L_0x007e
        L_0x0141:
            kotlin.Unit r0 = kotlin.Unit.INSTANCE
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: kotlin.io.path.PathTreeWalk$bfsIterator$1.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
