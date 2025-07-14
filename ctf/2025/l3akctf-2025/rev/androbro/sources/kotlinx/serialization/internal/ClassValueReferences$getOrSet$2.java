package kotlinx.serialization.internal;

import kotlin.Metadata;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Lambda;

@Metadata(d1 = {"\u0000\u0004\n\u0002\b\u0004\u0010\u0000\u001a\u0002H\u0001\"\u0004\b\u0000\u0010\u0001H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"<anonymous>", "T", "invoke", "()Ljava/lang/Object;"}, k = 3, mv = {1, 9, 0}, xi = 48)
/* compiled from: Caching.kt */
public final class ClassValueReferences$getOrSet$2 extends Lambda implements Function0<T> {
    final /* synthetic */ Function0<T> $factory;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public ClassValueReferences$getOrSet$2(Function0<? extends T> function0) {
        super(0);
        this.$factory = function0;
    }

    public final T invoke() {
        return this.$factory.invoke();
    }
}
