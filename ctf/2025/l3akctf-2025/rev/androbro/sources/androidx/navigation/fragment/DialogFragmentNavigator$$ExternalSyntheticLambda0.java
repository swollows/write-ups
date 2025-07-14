package androidx.navigation.fragment;

import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentOnAttachListener;

/* compiled from: D8$$SyntheticClass */
public final /* synthetic */ class DialogFragmentNavigator$$ExternalSyntheticLambda0 implements FragmentOnAttachListener {
    public final /* synthetic */ DialogFragmentNavigator f$0;

    public /* synthetic */ DialogFragmentNavigator$$ExternalSyntheticLambda0(DialogFragmentNavigator dialogFragmentNavigator) {
        this.f$0 = dialogFragmentNavigator;
    }

    public final void onAttachFragment(FragmentManager fragmentManager, Fragment fragment) {
        DialogFragmentNavigator.onAttach$lambda$1(this.f$0, fragmentManager, fragment);
    }
}
