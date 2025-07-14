package kotlinx.serialization.internal;

import java.util.List;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt;
import kotlin.reflect.KClass;
import kotlin.reflect.KType;

@Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0003\b`\u0018\u0000*\u0004\b\u0000\u0010\u00012\u00020\u0002JA\u0010\u0003\u001a\u0010\u0012\f\u0012\n\u0012\u0004\u0012\u00028\u0000\u0018\u00010\u00050\u00042\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00020\u00072\u000e\b\u0002\u0010\b\u001a\b\u0012\u0004\u0012\u00020\n0\tH&ø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\b\u000b\u0010\f\u0002\u000b\n\u0002\b!\n\u0005\b¡\u001e0\u0001¨\u0006\r"}, d2 = {"Lkotlinx/serialization/internal/ParametrizedSerializerCache;", "T", "", "get", "Lkotlin/Result;", "Lkotlinx/serialization/KSerializer;", "key", "Lkotlin/reflect/KClass;", "types", "", "Lkotlin/reflect/KType;", "get-gIAlu-s", "(Lkotlin/reflect/KClass;Ljava/util/List;)Ljava/lang/Object;", "kotlinx-serialization-core"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* compiled from: Platform.common.kt */
public interface ParametrizedSerializerCache<T> {
    /* renamed from: get-gIAlu-s  reason: not valid java name */
    Object m38getgIAlus(KClass<Object> kClass, List<? extends KType> list);

    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    /* compiled from: Platform.common.kt */
    public static final class DefaultImpls {
        /* renamed from: get-gIAlu-s$default  reason: not valid java name */
        public static /* synthetic */ Object m39getgIAlus$default(ParametrizedSerializerCache parametrizedSerializerCache, KClass kClass, List list, int i, Object obj) {
            if (obj == null) {
                if ((i & 2) != 0) {
                    list = CollectionsKt.emptyList();
                }
                return parametrizedSerializerCache.m38getgIAlus(kClass, list);
            }
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: get-gIAlu-s");
        }
    }
}
