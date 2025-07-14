package androidx.fragment.app;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.util.Log;
import android.view.View;
import androidx.fragment.app.DefaultSpecialEffectsController;
import androidx.fragment.app.SpecialEffectsController;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

@Metadata(d1 = {"\u0000\u0017\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\u0010\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H\u0016¨\u0006\u0006"}, d2 = {"androidx/fragment/app/DefaultSpecialEffectsController$startAnimations$1", "Landroid/animation/AnimatorListenerAdapter;", "onAnimationEnd", "", "anim", "Landroid/animation/Animator;", "fragment_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* compiled from: DefaultSpecialEffectsController.kt */
public final class DefaultSpecialEffectsController$startAnimations$1 extends AnimatorListenerAdapter {
    final /* synthetic */ DefaultSpecialEffectsController.AnimationInfo $animationInfo;
    final /* synthetic */ boolean $isHideOperation;
    final /* synthetic */ SpecialEffectsController.Operation $operation;
    final /* synthetic */ View $viewToAnimate;
    final /* synthetic */ DefaultSpecialEffectsController this$0;

    DefaultSpecialEffectsController$startAnimations$1(DefaultSpecialEffectsController $receiver, View $viewToAnimate2, boolean $isHideOperation2, SpecialEffectsController.Operation $operation2, DefaultSpecialEffectsController.AnimationInfo $animationInfo2) {
        this.this$0 = $receiver;
        this.$viewToAnimate = $viewToAnimate2;
        this.$isHideOperation = $isHideOperation2;
        this.$operation = $operation2;
        this.$animationInfo = $animationInfo2;
    }

    public void onAnimationEnd(Animator anim) {
        Intrinsics.checkNotNullParameter(anim, "anim");
        this.this$0.getContainer().endViewTransition(this.$viewToAnimate);
        if (this.$isHideOperation) {
            SpecialEffectsController.Operation.State finalState = this.$operation.getFinalState();
            View view = this.$viewToAnimate;
            Intrinsics.checkNotNullExpressionValue(view, "viewToAnimate");
            finalState.applyState(view);
        }
        this.$animationInfo.completeSpecialEffect();
        if (FragmentManager.isLoggingEnabled(2)) {
            Log.v(FragmentManager.TAG, "Animator from operation " + this.$operation + " has ended.");
        }
    }
}
