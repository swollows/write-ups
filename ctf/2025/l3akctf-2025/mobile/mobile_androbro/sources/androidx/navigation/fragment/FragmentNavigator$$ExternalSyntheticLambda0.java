package androidx.navigation.fragment;

import androidx.lifecycle.Lifecycle;
import androidx.lifecycle.LifecycleEventObserver;
import androidx.lifecycle.LifecycleOwner;

/* compiled from: D8$$SyntheticClass */
public final /* synthetic */ class FragmentNavigator$$ExternalSyntheticLambda0 implements LifecycleEventObserver {
    public final /* synthetic */ FragmentNavigator f$0;

    public /* synthetic */ FragmentNavigator$$ExternalSyntheticLambda0(FragmentNavigator fragmentNavigator) {
        this.f$0 = fragmentNavigator;
    }

    public final void onStateChanged(LifecycleOwner lifecycleOwner, Lifecycle.Event event) {
        FragmentNavigator.fragmentObserver$lambda$1(this.f$0, lifecycleOwner, event);
    }
}
