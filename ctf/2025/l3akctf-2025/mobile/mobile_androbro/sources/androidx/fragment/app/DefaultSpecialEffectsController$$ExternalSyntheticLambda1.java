package androidx.fragment.app;

import android.view.View;
import androidx.core.os.CancellationSignal;
import androidx.fragment.app.DefaultSpecialEffectsController;
import androidx.fragment.app.SpecialEffectsController;

/* compiled from: D8$$SyntheticClass */
public final /* synthetic */ class DefaultSpecialEffectsController$$ExternalSyntheticLambda1 implements CancellationSignal.OnCancelListener {
    public final /* synthetic */ View f$0;
    public final /* synthetic */ DefaultSpecialEffectsController f$1;
    public final /* synthetic */ DefaultSpecialEffectsController.AnimationInfo f$2;
    public final /* synthetic */ SpecialEffectsController.Operation f$3;

    public /* synthetic */ DefaultSpecialEffectsController$$ExternalSyntheticLambda1(View view, DefaultSpecialEffectsController defaultSpecialEffectsController, DefaultSpecialEffectsController.AnimationInfo animationInfo, SpecialEffectsController.Operation operation) {
        this.f$0 = view;
        this.f$1 = defaultSpecialEffectsController;
        this.f$2 = animationInfo;
        this.f$3 = operation;
    }

    public final void onCancel() {
        DefaultSpecialEffectsController.startAnimations$lambda$4(this.f$0, this.f$1, this.f$2, this.f$3);
    }
}
