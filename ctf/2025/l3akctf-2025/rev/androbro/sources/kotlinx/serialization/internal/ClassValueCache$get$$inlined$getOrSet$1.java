package kotlinx.serialization.internal;

import kotlin.Metadata;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Lambda;
import kotlin.reflect.KClass;
import kotlinx.serialization.KSerializer;

@Metadata(d1 = {"\u0000\u0004\n\u0002\b\u0005\u0010\u0000\u001a\u0002H\u0001\"\u0004\b\u0000\u0010\u0001H\n¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"<anonymous>", "T", "invoke", "()Ljava/lang/Object;", "kotlinx/serialization/internal/ClassValueReferences$getOrSet$2"}, k = 3, mv = {1, 9, 0}, xi = 48)
/* compiled from: Caching.kt */
public final class ClassValueCache$get$$inlined$getOrSet$1 extends Lambda implements Function0<T> {
    final /* synthetic */ KClass $key$inlined;
    final /* synthetic */ ClassValueCache this$0;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public ClassValueCache$get$$inlined$getOrSet$1(ClassValueCache classValueCache, KClass kClass) {
        super(0);
        this.this$0 = classValueCache;
        this.$key$inlined = kClass;
    }

    public final T invoke() {
        return new CacheEntry((KSerializer) this.this$0.getCompute().invoke(this.$key$inlined));
    }
}
