package androidx.window.embedding;

import android.content.Intent;
import java.util.Set;
import java.util.function.Predicate;

/* compiled from: D8$$SyntheticClass */
public final /* synthetic */ class EmbeddingAdapter$$ExternalSyntheticLambda0 implements Predicate {
    public final /* synthetic */ Set f$0;

    public /* synthetic */ EmbeddingAdapter$$ExternalSyntheticLambda0(Set set) {
        this.f$0 = set;
    }

    public final boolean test(Object obj) {
        return EmbeddingAdapter.m177translateIntentPredicates$lambda8(this.f$0, (Intent) obj);
    }
}
