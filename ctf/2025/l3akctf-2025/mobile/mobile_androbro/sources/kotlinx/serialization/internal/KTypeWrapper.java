package kotlinx.serialization.internal;

import java.lang.annotation.Annotation;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.JvmClassMappingKt;
import kotlin.jvm.internal.Intrinsics;
import kotlin.reflect.KClass;
import kotlin.reflect.KClassifier;
import kotlin.reflect.KType;
import kotlin.reflect.KTypeProjection;

@Metadata(d1 = {"\u0000B\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010 \n\u0002\u0010\u001b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0002\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0001¢\u0006\u0002\u0010\u0003J\u0013\u0010\u0013\u001a\u00020\u00112\b\u0010\u0014\u001a\u0004\u0018\u00010\u0015H\u0002J\b\u0010\u0016\u001a\u00020\u0017H\u0016J\b\u0010\u0018\u001a\u00020\u0019H\u0016R\u001a\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u00058VX\u0004¢\u0006\u0006\u001a\u0004\b\u0007\u0010\bR\u001a\u0010\t\u001a\b\u0012\u0004\u0012\u00020\n0\u00058VX\u0004¢\u0006\u0006\u001a\u0004\b\u000b\u0010\bR\u0016\u0010\f\u001a\u0004\u0018\u00010\r8VX\u0004¢\u0006\u0006\u001a\u0004\b\u000e\u0010\u000fR\u0014\u0010\u0010\u001a\u00020\u00118VX\u0004¢\u0006\u0006\u001a\u0004\b\u0010\u0010\u0012R\u000e\u0010\u0002\u001a\u00020\u0001X\u0004¢\u0006\u0002\n\u0000¨\u0006\u001a"}, d2 = {"Lkotlinx/serialization/internal/KTypeWrapper;", "Lkotlin/reflect/KType;", "origin", "(Lkotlin/reflect/KType;)V", "annotations", "", "", "getAnnotations", "()Ljava/util/List;", "arguments", "Lkotlin/reflect/KTypeProjection;", "getArguments", "classifier", "Lkotlin/reflect/KClassifier;", "getClassifier", "()Lkotlin/reflect/KClassifier;", "isMarkedNullable", "", "()Z", "equals", "other", "", "hashCode", "", "toString", "", "kotlinx-serialization-core"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* compiled from: Caching.kt */
final class KTypeWrapper implements KType {
    private final KType origin;

    public KTypeWrapper(KType origin2) {
        Intrinsics.checkNotNullParameter(origin2, "origin");
        this.origin = origin2;
    }

    public List<Annotation> getAnnotations() {
        return this.origin.getAnnotations();
    }

    public List<KTypeProjection> getArguments() {
        return this.origin.getArguments();
    }

    public KClassifier getClassifier() {
        return this.origin.getClassifier();
    }

    public boolean isMarkedNullable() {
        return this.origin.isMarkedNullable();
    }

    public boolean equals(Object other) {
        if (other == null) {
            return false;
        }
        KType kType = this.origin;
        KClassifier kClassifier = null;
        KTypeWrapper kTypeWrapper = other instanceof KTypeWrapper ? (KTypeWrapper) other : null;
        if (!Intrinsics.areEqual((Object) kType, (Object) kTypeWrapper != null ? kTypeWrapper.origin : null)) {
            return false;
        }
        KClassifier kClassifier2 = getClassifier();
        if (!(kClassifier2 instanceof KClass)) {
            return false;
        }
        KType kType2 = other instanceof KType ? (KType) other : null;
        if (kType2 != null) {
            kClassifier = kType2.getClassifier();
        }
        KClassifier otherClassifier = kClassifier;
        if (otherClassifier == null || !(otherClassifier instanceof KClass)) {
            return false;
        }
        return Intrinsics.areEqual((Object) JvmClassMappingKt.getJavaClass((KClass) kClassifier2), (Object) JvmClassMappingKt.getJavaClass((KClass) otherClassifier));
    }

    public int hashCode() {
        return this.origin.hashCode();
    }

    public String toString() {
        return "KTypeWrapper: " + this.origin;
    }
}
