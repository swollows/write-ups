package androidx.fragment.app;

import kotlin.Deprecated;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;

@Metadata(d1 = {"\u0000\"\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\u001a3\u0010\u0000\u001a\u00020\u0001*\u00020\u00022\b\b\u0002\u0010\u0003\u001a\u00020\u00042\u0017\u0010\u0005\u001a\u0013\u0012\u0004\u0012\u00020\u0007\u0012\u0004\u0012\u00020\u00010\u0006¢\u0006\u0002\b\bH\bø\u0001\u0000\u001a3\u0010\t\u001a\u00020\u0001*\u00020\u00022\b\b\u0002\u0010\u0003\u001a\u00020\u00042\u0017\u0010\u0005\u001a\u0013\u0012\u0004\u0012\u00020\u0007\u0012\u0004\u0012\u00020\u00010\u0006¢\u0006\u0002\b\bH\bø\u0001\u0000\u001a=\u0010\n\u001a\u00020\u0001*\u00020\u00022\b\b\u0002\u0010\u000b\u001a\u00020\u00042\b\b\u0002\u0010\u0003\u001a\u00020\u00042\u0017\u0010\u0005\u001a\u0013\u0012\u0004\u0012\u00020\u0007\u0012\u0004\u0012\u00020\u00010\u0006¢\u0006\u0002\b\bH\bø\u0001\u0000\u0002\u0007\n\u0005\b20\u0001¨\u0006\f"}, d2 = {"commit", "", "Landroidx/fragment/app/FragmentManager;", "allowStateLoss", "", "body", "Lkotlin/Function1;", "Landroidx/fragment/app/FragmentTransaction;", "Lkotlin/ExtensionFunctionType;", "commitNow", "transaction", "now", "fragment-ktx_release"}, k = 2, mv = {1, 8, 0}, xi = 48)
/* compiled from: FragmentManager.kt */
public final class FragmentManagerKt {
    public static /* synthetic */ void commit$default(FragmentManager $this$commit_u24default, boolean allowStateLoss, Function1 body, int i, Object obj) {
        if ((i & 1) != 0) {
            allowStateLoss = false;
        }
        Intrinsics.checkNotNullParameter($this$commit_u24default, "<this>");
        Intrinsics.checkNotNullParameter(body, "body");
        FragmentTransaction transaction = $this$commit_u24default.beginTransaction();
        Intrinsics.checkNotNullExpressionValue(transaction, "beginTransaction()");
        body.invoke(transaction);
        if (allowStateLoss) {
            transaction.commitAllowingStateLoss();
        } else {
            transaction.commit();
        }
    }

    public static final void commit(FragmentManager $this$commit, boolean allowStateLoss, Function1<? super FragmentTransaction, Unit> body) {
        Intrinsics.checkNotNullParameter($this$commit, "<this>");
        Intrinsics.checkNotNullParameter(body, "body");
        FragmentTransaction transaction = $this$commit.beginTransaction();
        Intrinsics.checkNotNullExpressionValue(transaction, "beginTransaction()");
        body.invoke(transaction);
        if (allowStateLoss) {
            transaction.commitAllowingStateLoss();
        } else {
            transaction.commit();
        }
    }

    public static /* synthetic */ void commitNow$default(FragmentManager $this$commitNow_u24default, boolean allowStateLoss, Function1 body, int i, Object obj) {
        if ((i & 1) != 0) {
            allowStateLoss = false;
        }
        Intrinsics.checkNotNullParameter($this$commitNow_u24default, "<this>");
        Intrinsics.checkNotNullParameter(body, "body");
        FragmentTransaction transaction = $this$commitNow_u24default.beginTransaction();
        Intrinsics.checkNotNullExpressionValue(transaction, "beginTransaction()");
        body.invoke(transaction);
        if (allowStateLoss) {
            transaction.commitNowAllowingStateLoss();
        } else {
            transaction.commitNow();
        }
    }

    public static final void commitNow(FragmentManager $this$commitNow, boolean allowStateLoss, Function1<? super FragmentTransaction, Unit> body) {
        Intrinsics.checkNotNullParameter($this$commitNow, "<this>");
        Intrinsics.checkNotNullParameter(body, "body");
        FragmentTransaction transaction = $this$commitNow.beginTransaction();
        Intrinsics.checkNotNullExpressionValue(transaction, "beginTransaction()");
        body.invoke(transaction);
        if (allowStateLoss) {
            transaction.commitNowAllowingStateLoss();
        } else {
            transaction.commitNow();
        }
    }

    public static /* synthetic */ void transaction$default(FragmentManager $this$transaction_u24default, boolean now, boolean allowStateLoss, Function1 body, int i, Object obj) {
        if ((i & 1) != 0) {
            now = false;
        }
        if ((i & 2) != 0) {
            allowStateLoss = false;
        }
        Intrinsics.checkNotNullParameter($this$transaction_u24default, "<this>");
        Intrinsics.checkNotNullParameter(body, "body");
        FragmentTransaction transaction = $this$transaction_u24default.beginTransaction();
        Intrinsics.checkNotNullExpressionValue(transaction, "beginTransaction()");
        body.invoke(transaction);
        if (now) {
            if (allowStateLoss) {
                transaction.commitNowAllowingStateLoss();
            } else {
                transaction.commitNow();
            }
        } else if (allowStateLoss) {
            transaction.commitAllowingStateLoss();
        } else {
            transaction.commit();
        }
    }

    @Deprecated(message = "Use commit { .. } or commitNow { .. } extensions")
    public static final void transaction(FragmentManager $this$transaction, boolean now, boolean allowStateLoss, Function1<? super FragmentTransaction, Unit> body) {
        Intrinsics.checkNotNullParameter($this$transaction, "<this>");
        Intrinsics.checkNotNullParameter(body, "body");
        FragmentTransaction transaction = $this$transaction.beginTransaction();
        Intrinsics.checkNotNullExpressionValue(transaction, "beginTransaction()");
        body.invoke(transaction);
        if (now) {
            if (allowStateLoss) {
                transaction.commitNowAllowingStateLoss();
            } else {
                transaction.commitNow();
            }
        } else if (allowStateLoss) {
            transaction.commitAllowingStateLoss();
        } else {
            transaction.commit();
        }
    }
}
