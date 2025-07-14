package androidx.activity;

import android.graphics.Rect;
import android.view.View;
import android.view.ViewTreeObserver;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.channels.ProduceKt;
import kotlinx.coroutines.channels.ProducerScope;

@Metadata(d1 = {"\u0000\u000e\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\b\u0012\u0004\u0012\u00020\u00030\u0002H@"}, d2 = {"<anonymous>", "", "Lkotlinx/coroutines/channels/ProducerScope;", "Landroid/graphics/Rect;"}, k = 3, mv = {1, 8, 0}, xi = 48)
@DebugMetadata(c = "androidx.activity.PipHintTrackerKt$trackPipAnimationHintView$flow$1", f = "PipHintTracker.kt", i = {}, l = {85}, m = "invokeSuspend", n = {}, s = {})
/* compiled from: PipHintTracker.kt */
final class PipHintTrackerKt$trackPipAnimationHintView$flow$1 extends SuspendLambda implements Function2<ProducerScope<? super Rect>, Continuation<? super Unit>, Object> {
    final /* synthetic */ View $view;
    private /* synthetic */ Object L$0;
    int label;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    PipHintTrackerKt$trackPipAnimationHintView$flow$1(View view, Continuation<? super PipHintTrackerKt$trackPipAnimationHintView$flow$1> continuation) {
        super(2, continuation);
        this.$view = view;
    }

    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        PipHintTrackerKt$trackPipAnimationHintView$flow$1 pipHintTrackerKt$trackPipAnimationHintView$flow$1 = new PipHintTrackerKt$trackPipAnimationHintView$flow$1(this.$view, continuation);
        pipHintTrackerKt$trackPipAnimationHintView$flow$1.L$0 = obj;
        return pipHintTrackerKt$trackPipAnimationHintView$flow$1;
    }

    public final Object invoke(ProducerScope<? super Rect> producerScope, Continuation<? super Unit> continuation) {
        return ((PipHintTrackerKt$trackPipAnimationHintView$flow$1) create(producerScope, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    public final Object invokeSuspend(Object $result) {
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        switch (this.label) {
            case 0:
                ResultKt.throwOnFailure($result);
                ProducerScope $this$callbackFlow = (ProducerScope) this.L$0;
                final View.OnLayoutChangeListener layoutChangeListener = new PipHintTrackerKt$trackPipAnimationHintView$flow$1$$ExternalSyntheticLambda0($this$callbackFlow);
                final ViewTreeObserver.OnScrollChangedListener scrollChangeListener = new PipHintTrackerKt$trackPipAnimationHintView$flow$1$$ExternalSyntheticLambda1($this$callbackFlow, this.$view);
                final PipHintTrackerKt$trackPipAnimationHintView$flow$1$attachStateChangeListener$1 attachStateChangeListener = new PipHintTrackerKt$trackPipAnimationHintView$flow$1$attachStateChangeListener$1($this$callbackFlow, this.$view, scrollChangeListener, layoutChangeListener);
                if (Api19Impl.INSTANCE.isAttachedToWindow(this.$view)) {
                    $this$callbackFlow.m1827trySendJP2dKIU(PipHintTrackerKt.trackPipAnimationHintView$positionInWindow(this.$view));
                    this.$view.getViewTreeObserver().addOnScrollChangedListener(scrollChangeListener);
                    this.$view.addOnLayoutChangeListener(layoutChangeListener);
                }
                this.$view.addOnAttachStateChangeListener(attachStateChangeListener);
                final View view = this.$view;
                this.label = 1;
                if (ProduceKt.awaitClose($this$callbackFlow, new Function0<Unit>() {
                    public final void invoke() {
                        view.getViewTreeObserver().removeOnScrollChangedListener(scrollChangeListener);
                        view.removeOnLayoutChangeListener(layoutChangeListener);
                        view.removeOnAttachStateChangeListener(attachStateChangeListener);
                    }
                }, this) != coroutine_suspended) {
                    break;
                } else {
                    return coroutine_suspended;
                }
            case 1:
                ResultKt.throwOnFailure($result);
                break;
            default:
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        return Unit.INSTANCE;
    }

    /* access modifiers changed from: private */
    public static final void invokeSuspend$lambda$0(ProducerScope $$this$callbackFlow, View v, int l, int t, int r, int b, int oldLeft, int oldTop, int oldRight, int oldBottom) {
        if (l != oldLeft || r != oldRight || t != oldTop || b != oldBottom) {
            $$this$callbackFlow.m1827trySendJP2dKIU(PipHintTrackerKt.trackPipAnimationHintView$positionInWindow(v));
        }
    }

    /* access modifiers changed from: private */
    public static final void invokeSuspend$lambda$1(ProducerScope $$this$callbackFlow, View $view2) {
        $$this$callbackFlow.m1827trySendJP2dKIU(PipHintTrackerKt.trackPipAnimationHintView$positionInWindow($view2));
    }
}
