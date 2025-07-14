package androidx.lifecycle;

import androidx.core.app.NotificationCompat;
import androidx.lifecycle.Lifecycle;
import java.util.concurrent.CancellationException;
import kotlin.Metadata;
import kotlin.Result;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.CoroutineContext;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Ref;
import kotlinx.coroutines.CancellableContinuation;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.CoroutineStart;
import kotlinx.coroutines.Job;
import kotlinx.coroutines.sync.Mutex;

@Metadata(d1 = {"\u0000\u0014\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H\n¢\u0006\u0002\b\u0006"}, d2 = {"<anonymous>", "", "<anonymous parameter 0>", "Landroidx/lifecycle/LifecycleOwner;", "event", "Landroidx/lifecycle/Lifecycle$Event;", "onStateChanged"}, k = 3, mv = {1, 8, 0}, xi = 48)
/* compiled from: RepeatOnLifecycle.kt */
final class RepeatOnLifecycleKt$repeatOnLifecycle$3$1$1$1 implements LifecycleEventObserver {
    final /* synthetic */ CoroutineScope $$this$coroutineScope;
    final /* synthetic */ Function2<CoroutineScope, Continuation<? super Unit>, Object> $block;
    final /* synthetic */ Lifecycle.Event $cancelWorkEvent;
    final /* synthetic */ CancellableContinuation<Unit> $cont;
    final /* synthetic */ Ref.ObjectRef<Job> $launchedJob;
    final /* synthetic */ Mutex $mutex;
    final /* synthetic */ Lifecycle.Event $startWorkEvent;

    RepeatOnLifecycleKt$repeatOnLifecycle$3$1$1$1(Lifecycle.Event event, Ref.ObjectRef<Job> objectRef, CoroutineScope coroutineScope, Lifecycle.Event event2, CancellableContinuation<? super Unit> cancellableContinuation, Mutex mutex, Function2<? super CoroutineScope, ? super Continuation<? super Unit>, ? extends Object> function2) {
        this.$startWorkEvent = event;
        this.$launchedJob = objectRef;
        this.$$this$coroutineScope = coroutineScope;
        this.$cancelWorkEvent = event2;
        this.$cont = cancellableContinuation;
        this.$mutex = mutex;
        this.$block = function2;
    }

    public final void onStateChanged(LifecycleOwner lifecycleOwner, Lifecycle.Event event) {
        Intrinsics.checkNotNullParameter(lifecycleOwner, "<anonymous parameter 0>");
        Intrinsics.checkNotNullParameter(event, NotificationCompat.CATEGORY_EVENT);
        if (event == this.$startWorkEvent) {
            Ref.ObjectRef<Job> objectRef = this.$launchedJob;
            CoroutineScope coroutineScope = this.$$this$coroutineScope;
            final Mutex mutex = this.$mutex;
            final Function2<CoroutineScope, Continuation<? super Unit>, Object> function2 = this.$block;
            objectRef.element = BuildersKt__Builders_commonKt.launch$default(coroutineScope, (CoroutineContext) null, (CoroutineStart) null, new AnonymousClass1((Continuation<? super AnonymousClass1>) null), 3, (Object) null);
            return;
        }
        if (event == this.$cancelWorkEvent) {
            Job job = (Job) this.$launchedJob.element;
            if (job != null) {
                Job.DefaultImpls.cancel$default(job, (CancellationException) null, 1, (Object) null);
            }
            this.$launchedJob.element = null;
        }
        if (event == Lifecycle.Event.ON_DESTROY) {
            Result.Companion companion = Result.Companion;
            this.$cont.resumeWith(Result.m281constructorimpl(Unit.INSTANCE));
        }
    }

    @Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H@"}, d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, k = 3, mv = {1, 8, 0}, xi = 48)
    @DebugMetadata(c = "androidx.lifecycle.RepeatOnLifecycleKt$repeatOnLifecycle$3$1$1$1$1", f = "RepeatOnLifecycle.kt", i = {0, 1}, l = {171, 110}, m = "invokeSuspend", n = {"$this$withLock_u24default$iv", "$this$withLock_u24default$iv"}, s = {"L$0", "L$0"})
    /* renamed from: androidx.lifecycle.RepeatOnLifecycleKt$repeatOnLifecycle$3$1$1$1$1  reason: invalid class name */
    /* compiled from: RepeatOnLifecycle.kt */
    static final class AnonymousClass1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
        Object L$0;
        Object L$1;
        int label;

        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            return new AnonymousClass1(mutex, function2, continuation);
        }

        public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
            return ((AnonymousClass1) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        /* JADX WARNING: Can't fix incorrect switch cases order */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public final java.lang.Object invokeSuspend(java.lang.Object r11) {
            /*
                r10 = this;
                java.lang.Object r0 = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED()
                int r1 = r10.label
                switch(r1) {
                    case 0: goto L_0x002f;
                    case 1: goto L_0x0020;
                    case 2: goto L_0x0011;
                    default: goto L_0x0009;
                }
            L_0x0009:
                java.lang.IllegalStateException r11 = new java.lang.IllegalStateException
                java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
                r11.<init>(r0)
                throw r11
            L_0x0011:
                r0 = r10
                r1 = 0
                r2 = 0
                r3 = 0
                java.lang.Object r4 = r0.L$0
                kotlinx.coroutines.sync.Mutex r4 = (kotlinx.coroutines.sync.Mutex) r4
                kotlin.ResultKt.throwOnFailure(r11)     // Catch:{ all -> 0x001d }
                goto L_0x006b
            L_0x001d:
                r2 = move-exception
                goto L_0x007c
            L_0x0020:
                r1 = r10
                r2 = 0
                java.lang.Object r3 = r1.L$1
                kotlin.jvm.functions.Function2 r3 = (kotlin.jvm.functions.Function2) r3
                r4 = 0
                java.lang.Object r5 = r1.L$0
                kotlinx.coroutines.sync.Mutex r5 = (kotlinx.coroutines.sync.Mutex) r5
                kotlin.ResultKt.throwOnFailure(r11)
                goto L_0x004e
            L_0x002f:
                kotlin.ResultKt.throwOnFailure(r11)
                r1 = r10
                kotlinx.coroutines.sync.Mutex r2 = r3
                kotlin.jvm.functions.Function2<kotlinx.coroutines.CoroutineScope, kotlin.coroutines.Continuation<? super kotlin.Unit>, java.lang.Object> r3 = r4
                r4 = 0
                r5 = 0
                r6 = r1
                kotlin.coroutines.Continuation r6 = (kotlin.coroutines.Continuation) r6
                r1.L$0 = r2
                r1.L$1 = r3
                r7 = 1
                r1.label = r7
                java.lang.Object r6 = r2.lock(r4, r6)
                if (r6 != r0) goto L_0x004b
                return r0
            L_0x004b:
                r9 = r5
                r5 = r2
                r2 = r9
            L_0x004e:
                r6 = 0
                androidx.lifecycle.RepeatOnLifecycleKt$repeatOnLifecycle$3$1$1$1$1$1$1 r7 = new androidx.lifecycle.RepeatOnLifecycleKt$repeatOnLifecycle$3$1$1$1$1$1$1     // Catch:{ all -> 0x0075 }
                r8 = 0
                r7.<init>(r3, r8)     // Catch:{ all -> 0x0075 }
                kotlin.jvm.functions.Function2 r7 = (kotlin.jvm.functions.Function2) r7     // Catch:{ all -> 0x0075 }
                r1.L$0 = r5     // Catch:{ all -> 0x0075 }
                r1.L$1 = r8     // Catch:{ all -> 0x0075 }
                r3 = 2
                r1.label = r3     // Catch:{ all -> 0x0075 }
                java.lang.Object r3 = kotlinx.coroutines.CoroutineScopeKt.coroutineScope(r7, r1)     // Catch:{ all -> 0x0075 }
                if (r3 != r0) goto L_0x0066
                return r0
            L_0x0066:
                r0 = r1
                r1 = r2
                r3 = r4
                r4 = r5
                r2 = r6
            L_0x006b:
                kotlin.Unit r2 = kotlin.Unit.INSTANCE     // Catch:{ all -> 0x001d }
                r4.unlock(r3)
                kotlin.Unit r1 = kotlin.Unit.INSTANCE
                return r1
            L_0x0075:
                r0 = move-exception
                r3 = r4
                r4 = r5
                r9 = r2
                r2 = r0
                r0 = r1
                r1 = r9
            L_0x007c:
                r4.unlock(r3)
                throw r2
            */
            throw new UnsupportedOperationException("Method not decompiled: androidx.lifecycle.RepeatOnLifecycleKt$repeatOnLifecycle$3$1$1$1.AnonymousClass1.invokeSuspend(java.lang.Object):java.lang.Object");
        }
    }
}
