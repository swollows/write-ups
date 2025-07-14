package kotlinx.serialization.internal;

import java.util.List;
import java.util.concurrent.ConcurrentHashMap;
import kotlin.Metadata;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.reflect.KClass;
import kotlin.reflect.KType;
import kotlinx.serialization.KSerializer;

@Metadata(d1 = {"\u0000>\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0002\u0018\u0000*\u0004\b\u0000\u0010\u00012\b\u0012\u0004\u0012\u0002H\u00010\u0002B3\u0012,\u0010\u0003\u001a(\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00060\u0005\u0012\n\u0012\b\u0012\u0004\u0012\u00020\b0\u0007\u0012\f\u0012\n\u0012\u0004\u0012\u00028\u0000\u0018\u00010\t0\u0004¢\u0006\u0002\u0010\nJ?\u0010\u000f\u001a\u0010\u0012\f\u0012\n\u0012\u0004\u0012\u00028\u0000\u0018\u00010\t0\u00102\f\u0010\u0011\u001a\b\u0012\u0004\u0012\u00020\u00060\u00052\f\u0010\u0012\u001a\b\u0012\u0004\u0012\u00020\b0\u0007H\u0016ø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\b\u0013\u0010\u0014R$\u0010\u000b\u001a\u0018\u0012\b\u0012\u0006\u0012\u0002\b\u00030\r\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00000\u000e0\fX\u0004¢\u0006\u0002\n\u0000R4\u0010\u0003\u001a(\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00060\u0005\u0012\n\u0012\b\u0012\u0004\u0012\u00020\b0\u0007\u0012\f\u0012\n\u0012\u0004\u0012\u00028\u0000\u0018\u00010\t0\u0004X\u0004¢\u0006\u0002\n\u0000\u0002\u000b\n\u0002\b!\n\u0005\b¡\u001e0\u0001¨\u0006\u0015"}, d2 = {"Lkotlinx/serialization/internal/ConcurrentHashMapParametrizedCache;", "T", "Lkotlinx/serialization/internal/ParametrizedSerializerCache;", "compute", "Lkotlin/Function2;", "Lkotlin/reflect/KClass;", "", "", "Lkotlin/reflect/KType;", "Lkotlinx/serialization/KSerializer;", "(Lkotlin/jvm/functions/Function2;)V", "cache", "Ljava/util/concurrent/ConcurrentHashMap;", "Ljava/lang/Class;", "Lkotlinx/serialization/internal/ParametrizedCacheEntry;", "get", "Lkotlin/Result;", "key", "types", "get-gIAlu-s", "(Lkotlin/reflect/KClass;Ljava/util/List;)Ljava/lang/Object;", "kotlinx-serialization-core"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* compiled from: Caching.kt */
final class ConcurrentHashMapParametrizedCache<T> implements ParametrizedSerializerCache<T> {
    private final ConcurrentHashMap<Class<?>, ParametrizedCacheEntry<T>> cache = new ConcurrentHashMap<>();
    private final Function2<KClass<Object>, List<? extends KType>, KSerializer<T>> compute;

    public ConcurrentHashMapParametrizedCache(Function2<? super KClass<Object>, ? super List<? extends KType>, ? extends KSerializer<T>> compute2) {
        Intrinsics.checkNotNullParameter(compute2, "compute");
        this.compute = compute2;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:2:0x0019, code lost:
        r3 = new kotlinx.serialization.internal.ParametrizedCacheEntry();
     */
    /* renamed from: get-gIAlu-s  reason: not valid java name */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public java.lang.Object m34getgIAlus(kotlin.reflect.KClass<java.lang.Object> r13, java.util.List<? extends kotlin.reflect.KType> r14) {
        /*
            r12 = this;
            java.lang.String r0 = "key"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r13, r0)
            java.lang.String r0 = "types"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r14, r0)
            java.util.concurrent.ConcurrentHashMap<java.lang.Class<?>, kotlinx.serialization.internal.ParametrizedCacheEntry<T>> r0 = r12.cache
            java.util.concurrent.ConcurrentMap r0 = (java.util.concurrent.ConcurrentMap) r0
            java.lang.Class r1 = kotlin.jvm.JvmClassMappingKt.getJavaClass(r13)
            r2 = 0
            java.lang.Object r3 = r0.get(r1)
            if (r3 != 0) goto L_0x0029
            r3 = 0
            kotlinx.serialization.internal.ParametrizedCacheEntry r4 = new kotlinx.serialization.internal.ParametrizedCacheEntry
            r4.<init>()
            r3 = r4
            r4 = 0
            java.lang.Object r5 = r0.putIfAbsent(r1, r3)
            if (r5 != 0) goto L_0x0028
            goto L_0x0029
        L_0x0028:
            r3 = r5
        L_0x0029:
            kotlinx.serialization.internal.ParametrizedCacheEntry r3 = (kotlinx.serialization.internal.ParametrizedCacheEntry) r3
            r0 = r3
            r1 = 0
            r2 = r14
            java.lang.Iterable r2 = (java.lang.Iterable) r2
            r3 = 0
            java.util.ArrayList r4 = new java.util.ArrayList
            r5 = 10
            int r5 = kotlin.collections.CollectionsKt.collectionSizeOrDefault(r2, r5)
            r4.<init>(r5)
            java.util.Collection r4 = (java.util.Collection) r4
            r5 = r2
            r6 = 0
            java.util.Iterator r7 = r5.iterator()
        L_0x0045:
            boolean r8 = r7.hasNext()
            if (r8 == 0) goto L_0x005c
            java.lang.Object r8 = r7.next()
            r9 = r8
            kotlin.reflect.KType r9 = (kotlin.reflect.KType) r9
            r10 = 0
            kotlinx.serialization.internal.KTypeWrapper r11 = new kotlinx.serialization.internal.KTypeWrapper
            r11.<init>(r9)
            r4.add(r11)
            goto L_0x0045
        L_0x005c:
            java.util.List r4 = (java.util.List) r4
            r2 = r4
            java.util.concurrent.ConcurrentHashMap r3 = r0.serializers
            java.util.concurrent.ConcurrentMap r3 = (java.util.concurrent.ConcurrentMap) r3
            r4 = 0
            java.lang.Object r5 = r3.get(r2)
            if (r5 != 0) goto L_0x009a
            r5 = 0
            kotlin.Result$Companion r6 = kotlin.Result.Companion     // Catch:{ all -> 0x0081 }
            r6 = 0
            r7 = 0
            kotlin.jvm.functions.Function2<kotlin.reflect.KClass<java.lang.Object>, java.util.List<? extends kotlin.reflect.KType>, kotlinx.serialization.KSerializer<T>> r8 = r12.compute     // Catch:{ all -> 0x0081 }
            java.lang.Object r8 = r8.invoke(r13, r14)     // Catch:{ all -> 0x0081 }
            kotlinx.serialization.KSerializer r8 = (kotlinx.serialization.KSerializer) r8     // Catch:{ all -> 0x0081 }
            java.lang.Object r6 = kotlin.Result.m281constructorimpl(r8)     // Catch:{ all -> 0x0081 }
            goto L_0x008c
        L_0x0081:
            r6 = move-exception
            kotlin.Result$Companion r7 = kotlin.Result.Companion
            java.lang.Object r6 = kotlin.ResultKt.createFailure(r6)
            java.lang.Object r6 = kotlin.Result.m281constructorimpl(r6)
        L_0x008c:
            kotlin.Result r6 = kotlin.Result.m280boximpl(r6)
            r5 = r6
            r6 = 0
            java.lang.Object r7 = r3.putIfAbsent(r2, r5)
            if (r7 != 0) goto L_0x0099
            goto L_0x009a
        L_0x0099:
            r5 = r7
        L_0x009a:
            java.lang.String r3 = "getOrPut(...)"
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(r5, r3)
            kotlin.Result r5 = (kotlin.Result) r5
            java.lang.Object r0 = r5.m290unboximpl()
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: kotlinx.serialization.internal.ConcurrentHashMapParametrizedCache.m34getgIAlus(kotlin.reflect.KClass, java.util.List):java.lang.Object");
    }
}
