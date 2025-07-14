package androidx.window.embedding;

import android.view.WindowMetrics;
import java.util.function.Predicate;

/* compiled from: D8$$SyntheticClass */
public final /* synthetic */ class EmbeddingAdapter$$ExternalSyntheticLambda1 implements Predicate {
    public final /* synthetic */ SplitRule f$0;

    public /* synthetic */ EmbeddingAdapter$$ExternalSyntheticLambda1(SplitRule splitRule) {
        this.f$0 = splitRule;
    }

    public final boolean test(Object obj) {
        return EmbeddingAdapter.m178translateParentMetricsPredicate$lambda4(this.f$0, (WindowMetrics) obj);
    }
}
