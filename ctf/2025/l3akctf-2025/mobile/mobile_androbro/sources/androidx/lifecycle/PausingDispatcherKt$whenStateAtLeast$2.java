package androidx.lifecycle;

import androidx.lifecycle.Lifecycle;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.CoroutineScope;

@Metadata(d1 = {"\u0000\b\n\u0002\b\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u0002H\u0001\"\u0004\b\u0000\u0010\u0001*\u00020\u0002H@"}, d2 = {"<anonymous>", "T", "Lkotlinx/coroutines/CoroutineScope;"}, k = 3, mv = {1, 8, 0}, xi = 48)
@DebugMetadata(c = "androidx.lifecycle.PausingDispatcherKt$whenStateAtLeast$2", f = "PausingDispatcher.kt", i = {0}, l = {203}, m = "invokeSuspend", n = {"controller"}, s = {"L$0"})
/* compiled from: PausingDispatcher.kt */
final class PausingDispatcherKt$whenStateAtLeast$2 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super T>, Object> {
    final /* synthetic */ Function2<CoroutineScope, Continuation<? super T>, Object> $block;
    final /* synthetic */ Lifecycle.State $minState;
    final /* synthetic */ Lifecycle $this_whenStateAtLeast;
    private /* synthetic */ Object L$0;
    int label;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    PausingDispatcherKt$whenStateAtLeast$2(Lifecycle lifecycle, Lifecycle.State state, Function2<? super CoroutineScope, ? super Continuation<? super T>, ? extends Object> function2, Continuation<? super PausingDispatcherKt$whenStateAtLeast$2> continuation) {
        super(2, continuation);
        this.$this_whenStateAtLeast = lifecycle;
        this.$minState = state;
        this.$block = function2;
    }

    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        PausingDispatcherKt$whenStateAtLeast$2 pausingDispatcherKt$whenStateAtLeast$2 = new PausingDispatcherKt$whenStateAtLeast$2(this.$this_whenStateAtLeast, this.$minState, this.$block, continuation);
        pausingDispatcherKt$whenStateAtLeast$2.L$0 = obj;
        return pausingDispatcherKt$whenStateAtLeast$2;
    }

    public final Object invoke(CoroutineScope coroutineScope, Continuation<? super T> continuation) {
        return ((PausingDispatcherKt$whenStateAtLeast$2) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    /* JADX WARNING: Code restructure failed: missing block: B:17:0x0060, code lost:
        r2.finish();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:18:0x0064, code lost:
        return r10;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.lang.Object invokeSuspend(java.lang.Object r10) {
        /*
            r9 = this;
            java.lang.Object r0 = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED()
            int r1 = r9.label
            switch(r1) {
                case 0: goto L_0x001f;
                case 1: goto L_0x0011;
                default: goto L_0x0009;
            }
        L_0x0009:
            java.lang.IllegalStateException r10 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r10.<init>(r0)
            throw r10
        L_0x0011:
            r0 = r9
            java.lang.Object r1 = r0.L$0
            androidx.lifecycle.LifecycleController r1 = (androidx.lifecycle.LifecycleController) r1
            kotlin.ResultKt.throwOnFailure(r10)     // Catch:{ all -> 0x001d }
            r2 = r1
            r1 = r0
            r0 = r10
            goto L_0x0060
        L_0x001d:
            r2 = move-exception
            goto L_0x006a
        L_0x001f:
            kotlin.ResultKt.throwOnFailure(r10)
            r1 = r9
            java.lang.Object r2 = r1.L$0
            kotlinx.coroutines.CoroutineScope r2 = (kotlinx.coroutines.CoroutineScope) r2
            kotlin.coroutines.CoroutineContext r3 = r2.getCoroutineContext()
            kotlinx.coroutines.Job$Key r4 = kotlinx.coroutines.Job.Key
            kotlin.coroutines.CoroutineContext$Key r4 = (kotlin.coroutines.CoroutineContext.Key) r4
            kotlin.coroutines.CoroutineContext$Element r3 = r3.get(r4)
            kotlinx.coroutines.Job r3 = (kotlinx.coroutines.Job) r3
            if (r3 == 0) goto L_0x006e
            r2 = r3
            androidx.lifecycle.PausingDispatcher r3 = new androidx.lifecycle.PausingDispatcher
            r3.<init>()
            androidx.lifecycle.LifecycleController r4 = new androidx.lifecycle.LifecycleController
            androidx.lifecycle.Lifecycle r5 = r1.$this_whenStateAtLeast
            androidx.lifecycle.Lifecycle$State r6 = r1.$minState
            androidx.lifecycle.DispatchQueue r7 = r3.dispatchQueue
            r4.<init>(r5, r6, r7, r2)
            r2 = r4
            r4 = r3
            kotlin.coroutines.CoroutineContext r4 = (kotlin.coroutines.CoroutineContext) r4     // Catch:{ all -> 0x0065 }
            kotlin.jvm.functions.Function2<kotlinx.coroutines.CoroutineScope, kotlin.coroutines.Continuation<? super T>, java.lang.Object> r5 = r1.$block     // Catch:{ all -> 0x0065 }
            r6 = r1
            kotlin.coroutines.Continuation r6 = (kotlin.coroutines.Continuation) r6     // Catch:{ all -> 0x0065 }
            r1.L$0 = r2     // Catch:{ all -> 0x0065 }
            r7 = 1
            r1.label = r7     // Catch:{ all -> 0x0065 }
            java.lang.Object r4 = kotlinx.coroutines.BuildersKt.withContext(r4, r5, r6)     // Catch:{ all -> 0x0065 }
            if (r4 != r0) goto L_0x005e
            return r0
        L_0x005e:
            r0 = r10
            r10 = r4
        L_0x0060:
            r2.finish()
            return r10
        L_0x0065:
            r0 = move-exception
            r8 = r2
            r2 = r0
            r0 = r1
            r1 = r8
        L_0x006a:
            r1.finish()
            throw r2
        L_0x006e:
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
            java.lang.String r2 = "when[State] methods should have a parent job"
            java.lang.String r2 = r2.toString()
            r0.<init>(r2)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.lifecycle.PausingDispatcherKt$whenStateAtLeast$2.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
