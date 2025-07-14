package androidx.core.view;

import android.os.Build;
import android.view.View;
import android.view.WindowInsets;
import android.view.WindowInsetsController;
import android.view.inputmethod.InputMethodManager;
import java.util.concurrent.atomic.AtomicBoolean;

public final class SoftwareKeyboardControllerCompat {
    private final Impl mImpl;

    public SoftwareKeyboardControllerCompat(View view) {
        if (Build.VERSION.SDK_INT >= 30) {
            this.mImpl = new Impl30(view);
        } else {
            this.mImpl = new Impl20(view);
        }
    }

    @Deprecated
    SoftwareKeyboardControllerCompat(WindowInsetsController windowInsetsController) {
        this.mImpl = new Impl30(windowInsetsController);
    }

    public void show() {
        this.mImpl.show();
    }

    public void hide() {
        this.mImpl.hide();
    }

    private static class Impl {
        Impl() {
        }

        /* access modifiers changed from: package-private */
        public void show() {
        }

        /* access modifiers changed from: package-private */
        public void hide() {
        }
    }

    private static class Impl20 extends Impl {
        private final View mView;

        Impl20(View view) {
            this.mView = view;
        }

        /* access modifiers changed from: package-private */
        public void show() {
            View view = this.mView;
            if (view != null) {
                if (view.isInEditMode() || view.onCheckIsTextEditor()) {
                    view.requestFocus();
                } else {
                    view = view.getRootView().findFocus();
                }
                if (view == null) {
                    view = this.mView.getRootView().findViewById(16908290);
                }
                if (view != null && view.hasWindowFocus()) {
                    View finalView = view;
                    finalView.post(new SoftwareKeyboardControllerCompat$Impl20$$ExternalSyntheticLambda0(finalView));
                }
            }
        }

        /* access modifiers changed from: package-private */
        public void hide() {
            if (this.mView != null) {
                ((InputMethodManager) this.mView.getContext().getSystemService("input_method")).hideSoftInputFromWindow(this.mView.getWindowToken(), 0);
            }
        }
    }

    private static class Impl30 extends Impl20 {
        private View mView;
        private WindowInsetsController mWindowInsetsController;

        Impl30(View view) {
            super(view);
            this.mView = view;
        }

        Impl30(WindowInsetsController windowInsetsController) {
            super((View) null);
            this.mWindowInsetsController = windowInsetsController;
        }

        /* access modifiers changed from: package-private */
        public void show() {
            if (this.mView != null && Build.VERSION.SDK_INT < 33) {
                ((InputMethodManager) this.mView.getContext().getSystemService("input_method")).isActive();
            }
            WindowInsetsController insetsController = null;
            if (this.mWindowInsetsController != null) {
                insetsController = this.mWindowInsetsController;
            } else if (this.mView != null) {
                insetsController = this.mView.getWindowInsetsController();
            }
            if (insetsController != null) {
                insetsController.show(WindowInsets.Type.ime());
            } else {
                super.show();
            }
        }

        /* access modifiers changed from: package-private */
        public void hide() {
            WindowInsetsController insetsController = null;
            if (this.mWindowInsetsController != null) {
                insetsController = this.mWindowInsetsController;
            } else if (this.mView != null) {
                insetsController = this.mView.getWindowInsetsController();
            }
            if (insetsController != null) {
                AtomicBoolean isImeInsetsControllable = new AtomicBoolean(false);
                WindowInsetsController.OnControllableInsetsChangedListener listener = new SoftwareKeyboardControllerCompat$Impl30$$ExternalSyntheticLambda0(isImeInsetsControllable);
                insetsController.addOnControllableInsetsChangedListener(listener);
                if (!isImeInsetsControllable.get() && this.mView != null) {
                    ((InputMethodManager) this.mView.getContext().getSystemService("input_method")).hideSoftInputFromWindow(this.mView.getWindowToken(), 0);
                }
                insetsController.removeOnControllableInsetsChangedListener(listener);
                insetsController.hide(WindowInsets.Type.ime());
                return;
            }
            super.hide();
        }

        static /* synthetic */ void lambda$hide$0(AtomicBoolean isImeInsetsControllable, WindowInsetsController windowInsetsController, int typeMask) {
            isImeInsetsControllable.set((typeMask & 8) != 0);
        }
    }
}
