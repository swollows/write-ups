package androidx.navigation.fragment;

import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentOnAttachListener;
import androidx.navigation.NavigatorState;

/* compiled from: D8$$SyntheticClass */
public final /* synthetic */ class FragmentNavigator$$ExternalSyntheticLambda1 implements FragmentOnAttachListener {
    public final /* synthetic */ NavigatorState f$0;
    public final /* synthetic */ FragmentNavigator f$1;

    public /* synthetic */ FragmentNavigator$$ExternalSyntheticLambda1(NavigatorState navigatorState, FragmentNavigator fragmentNavigator) {
        this.f$0 = navigatorState;
        this.f$1 = fragmentNavigator;
    }

    public final void onAttachFragment(FragmentManager fragmentManager, Fragment fragment) {
        FragmentNavigator.onAttach$lambda$3(this.f$0, this.f$1, fragmentManager, fragment);
    }
}
