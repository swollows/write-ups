package androidx.fragment.app;

import android.os.Bundle;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

@Metadata(d1 = {"\u0000\"\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u001a;\u0010\u0000\u001a\u00020\u0001\"\n\b\u0000\u0010\u0002\u0018\u0001*\u00020\u0003*\u00020\u00012\b\b\u0001\u0010\u0004\u001a\u00020\u00052\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u00072\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\tH\b\u001a-\u0010\u0000\u001a\u00020\u0001\"\n\b\u0000\u0010\u0002\u0018\u0001*\u00020\u0003*\u00020\u00012\u0006\u0010\u0006\u001a\u00020\u00072\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\tH\b\u001a;\u0010\n\u001a\u00020\u0001\"\n\b\u0000\u0010\u0002\u0018\u0001*\u00020\u0003*\u00020\u00012\b\b\u0001\u0010\u0004\u001a\u00020\u00052\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u00072\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\tH\b¨\u0006\u000b"}, d2 = {"add", "Landroidx/fragment/app/FragmentTransaction;", "F", "Landroidx/fragment/app/Fragment;", "containerViewId", "", "tag", "", "args", "Landroid/os/Bundle;", "replace", "fragment-ktx_release"}, k = 2, mv = {1, 8, 0}, xi = 48)
/* compiled from: FragmentTransaction.kt */
public final class FragmentTransactionKt {
    public static /* synthetic */ FragmentTransaction add$default(FragmentTransaction $this$add_u24default, int containerViewId, String tag, Bundle args, int i, Object obj) {
        if ((i & 2) != 0) {
            tag = null;
        }
        if ((i & 4) != 0) {
            args = null;
        }
        Intrinsics.checkNotNullParameter($this$add_u24default, "<this>");
        Intrinsics.reifiedOperationMarker(4, "F");
        Class<Fragment> cls = Fragment.class;
        Class cls2 = cls;
        FragmentTransaction add = $this$add_u24default.add(containerViewId, cls, args, tag);
        Intrinsics.checkNotNullExpressionValue(add, "add(containerViewId, F::class.java, args, tag)");
        FragmentTransaction fragmentTransaction = add;
        return add;
    }

    public static final /* synthetic */ <F extends Fragment> FragmentTransaction add(FragmentTransaction $this$add, int containerViewId, String tag, Bundle args) {
        Intrinsics.checkNotNullParameter($this$add, "<this>");
        Intrinsics.reifiedOperationMarker(4, "F");
        Class<Fragment> cls = Fragment.class;
        Class cls2 = cls;
        FragmentTransaction add = $this$add.add(containerViewId, cls, args, tag);
        Intrinsics.checkNotNullExpressionValue(add, "add(containerViewId, F::class.java, args, tag)");
        FragmentTransaction fragmentTransaction = add;
        return add;
    }

    public static /* synthetic */ FragmentTransaction add$default(FragmentTransaction $this$add_u24default, String tag, Bundle args, int i, Object obj) {
        if ((i & 2) != 0) {
            args = null;
        }
        Intrinsics.checkNotNullParameter($this$add_u24default, "<this>");
        Intrinsics.checkNotNullParameter(tag, "tag");
        Intrinsics.reifiedOperationMarker(4, "F");
        Class<Fragment> cls = Fragment.class;
        Class cls2 = cls;
        FragmentTransaction add = $this$add_u24default.add((Class<? extends Fragment>) cls, args, tag);
        Intrinsics.checkNotNullExpressionValue(add, "add(F::class.java, args, tag)");
        FragmentTransaction fragmentTransaction = add;
        return add;
    }

    public static final /* synthetic */ <F extends Fragment> FragmentTransaction add(FragmentTransaction $this$add, String tag, Bundle args) {
        Intrinsics.checkNotNullParameter($this$add, "<this>");
        Intrinsics.checkNotNullParameter(tag, "tag");
        Intrinsics.reifiedOperationMarker(4, "F");
        Class<Fragment> cls = Fragment.class;
        Class cls2 = cls;
        FragmentTransaction add = $this$add.add((Class<? extends Fragment>) cls, args, tag);
        Intrinsics.checkNotNullExpressionValue(add, "add(F::class.java, args, tag)");
        FragmentTransaction fragmentTransaction = add;
        return add;
    }

    public static /* synthetic */ FragmentTransaction replace$default(FragmentTransaction $this$replace_u24default, int containerViewId, String tag, Bundle args, int i, Object obj) {
        if ((i & 2) != 0) {
            tag = null;
        }
        if ((i & 4) != 0) {
            args = null;
        }
        Intrinsics.checkNotNullParameter($this$replace_u24default, "<this>");
        Intrinsics.reifiedOperationMarker(4, "F");
        Class<Fragment> cls = Fragment.class;
        Class cls2 = cls;
        FragmentTransaction replace = $this$replace_u24default.replace(containerViewId, cls, args, tag);
        Intrinsics.checkNotNullExpressionValue(replace, "replace(containerViewId, F::class.java, args, tag)");
        FragmentTransaction fragmentTransaction = replace;
        return replace;
    }

    public static final /* synthetic */ <F extends Fragment> FragmentTransaction replace(FragmentTransaction $this$replace, int containerViewId, String tag, Bundle args) {
        Intrinsics.checkNotNullParameter($this$replace, "<this>");
        Intrinsics.reifiedOperationMarker(4, "F");
        Class<Fragment> cls = Fragment.class;
        Class cls2 = cls;
        FragmentTransaction replace = $this$replace.replace(containerViewId, cls, args, tag);
        Intrinsics.checkNotNullExpressionValue(replace, "replace(containerViewId, F::class.java, args, tag)");
        FragmentTransaction fragmentTransaction = replace;
        return replace;
    }
}
