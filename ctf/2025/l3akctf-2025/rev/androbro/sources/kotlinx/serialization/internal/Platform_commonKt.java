package kotlinx.serialization.internal;

import java.util.Collection;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
import kotlin.Metadata;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.reflect.KClass;
import kotlin.reflect.KClassifier;
import kotlin.reflect.KType;
import kotlin.reflect.KTypeParameter;
import kotlin.reflect.KTypeProjection;
import kotlinx.serialization.DeserializationStrategy;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.SerializationException;
import kotlinx.serialization.SerializationStrategy;
import kotlinx.serialization.descriptors.SerialDescriptor;

@Metadata(d1 = {"\u0000`\n\u0000\n\u0002\u0010\u0011\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\"\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u001c\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0001\n\u0000\n\u0002\u0018\u0002\n\u0000\u001a\u0010\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u0005H\u0000\u001a\u0012\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00050\b*\u00020\u0002H\u0000\u001a\u001d\u0010\t\u001a\b\u0012\u0004\u0012\u0002H\u000b0\n\"\u0004\b\u0000\u0010\u000b*\u0006\u0012\u0002\b\u00030\nH\b\u001a\u001d\u0010\t\u001a\b\u0012\u0004\u0012\u0002H\u000b0\f\"\u0004\b\u0000\u0010\u000b*\u0006\u0012\u0002\b\u00030\fH\b\u001a\u001d\u0010\t\u001a\b\u0012\u0004\u0012\u0002H\u000b0\r\"\u0004\b\u0000\u0010\u000b*\u0006\u0012\u0002\b\u00030\rH\b\u001a\u001f\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\u00020\u0001*\n\u0012\u0004\u0012\u00020\u0002\u0018\u00010\u000fH\u0000¢\u0006\u0002\u0010\u0010\u001a6\u0010\u0011\u001a\u00020\u0012\"\u0004\b\u0000\u0010\u000b\"\u0004\b\u0001\u0010\u0013*\b\u0012\u0004\u0012\u0002H\u000b0\u00142\u0012\u0010\u0015\u001a\u000e\u0012\u0004\u0012\u0002H\u000b\u0012\u0004\u0012\u0002H\u00130\u0016H\bø\u0001\u0000\u001a\u0012\u0010\u0017\u001a\b\u0012\u0004\u0012\u00020\u00190\u0018*\u00020\u001aH\u0000\u001a\u0010\u0010\u0004\u001a\u00020\u0005*\u0006\u0012\u0002\b\u00030\u0018H\u0000\u001a\u0010\u0010\u001b\u001a\u00020\u001c*\u0006\u0012\u0002\b\u00030\u0018H\u0000\u001a\f\u0010\u001d\u001a\u00020\u001a*\u00020\u001eH\u0000\"\u0016\u0010\u0000\u001a\b\u0012\u0004\u0012\u00020\u00020\u0001X\u0004¢\u0006\u0004\n\u0002\u0010\u0003\u0002\u0007\n\u0005\b20\u0001¨\u0006\u001f"}, d2 = {"EMPTY_DESCRIPTOR_ARRAY", "", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "[Lkotlinx/serialization/descriptors/SerialDescriptor;", "notRegisteredMessage", "", "className", "cachedSerialNames", "", "cast", "Lkotlinx/serialization/DeserializationStrategy;", "T", "Lkotlinx/serialization/KSerializer;", "Lkotlinx/serialization/SerializationStrategy;", "compactArray", "", "(Ljava/util/List;)[Lkotlinx/serialization/descriptors/SerialDescriptor;", "elementsHashCodeBy", "", "K", "", "selector", "Lkotlin/Function1;", "kclass", "Lkotlin/reflect/KClass;", "", "Lkotlin/reflect/KType;", "serializerNotRegistered", "", "typeOrThrow", "Lkotlin/reflect/KTypeProjection;", "kotlinx-serialization-core"}, k = 2, mv = {1, 9, 0}, xi = 48)
/* compiled from: Platform.common.kt */
public final class Platform_commonKt {
    private static final SerialDescriptor[] EMPTY_DESCRIPTOR_ARRAY = new SerialDescriptor[0];

    public static final Set<String> cachedSerialNames(SerialDescriptor $this$cachedSerialNames) {
        Intrinsics.checkNotNullParameter($this$cachedSerialNames, "<this>");
        if ($this$cachedSerialNames instanceof CachedNames) {
            return ((CachedNames) $this$cachedSerialNames).getSerialNames();
        }
        HashSet result = new HashSet($this$cachedSerialNames.getElementsCount());
        int elementsCount = $this$cachedSerialNames.getElementsCount();
        for (int i = 0; i < elementsCount; i++) {
            result.add($this$cachedSerialNames.getElementName(i));
        }
        return result;
    }

    public static final SerialDescriptor[] compactArray(List<? extends SerialDescriptor> $this$compactArray) {
        SerialDescriptor[] serialDescriptorArr;
        Collection collection = $this$compactArray;
        List<? extends SerialDescriptor> $this$toTypedArray$iv = !(collection == null || collection.isEmpty()) ? $this$compactArray : null;
        return ($this$toTypedArray$iv == null || (serialDescriptorArr = (SerialDescriptor[]) $this$toTypedArray$iv.toArray(new SerialDescriptor[0])) == null) ? EMPTY_DESCRIPTOR_ARRAY : serialDescriptorArr;
    }

    public static final <T> KSerializer<T> cast(KSerializer<?> $this$cast) {
        Intrinsics.checkNotNullParameter($this$cast, "<this>");
        return $this$cast;
    }

    public static final <T> SerializationStrategy<T> cast(SerializationStrategy<?> $this$cast) {
        Intrinsics.checkNotNullParameter($this$cast, "<this>");
        return $this$cast;
    }

    public static final <T> DeserializationStrategy<T> cast(DeserializationStrategy<?> $this$cast) {
        Intrinsics.checkNotNullParameter($this$cast, "<this>");
        return $this$cast;
    }

    public static final Void serializerNotRegistered(KClass<?> $this$serializerNotRegistered) {
        Intrinsics.checkNotNullParameter($this$serializerNotRegistered, "<this>");
        throw new SerializationException(notRegisteredMessage($this$serializerNotRegistered));
    }

    public static final String notRegisteredMessage(KClass<?> $this$notRegisteredMessage) {
        Intrinsics.checkNotNullParameter($this$notRegisteredMessage, "<this>");
        String simpleName = $this$notRegisteredMessage.getSimpleName();
        if (simpleName == null) {
            simpleName = "<local class name not available>";
        }
        return notRegisteredMessage(simpleName);
    }

    public static final String notRegisteredMessage(String className) {
        Intrinsics.checkNotNullParameter(className, "className");
        return "Serializer for class '" + className + "' is not found.\nPlease ensure that class is marked as '@Serializable' and that the serialization compiler plugin is applied.\n";
    }

    public static final KClass<Object> kclass(KType $this$kclass) {
        Intrinsics.checkNotNullParameter($this$kclass, "<this>");
        KClassifier t = $this$kclass.getClassifier();
        if (t instanceof KClass) {
            return (KClass) t;
        }
        if (t instanceof KTypeParameter) {
            throw new IllegalArgumentException("Captured type parameter " + t + " from generic non-reified function. Such functionality cannot be supported because " + t + " is erased, either specify serializer explicitly or make calling function inline with reified " + t + '.');
        }
        throw new IllegalArgumentException("Only KClass supported as classifier, got " + t);
    }

    public static final KType typeOrThrow(KTypeProjection $this$typeOrThrow) {
        Intrinsics.checkNotNullParameter($this$typeOrThrow, "<this>");
        KType type = $this$typeOrThrow.getType();
        if (type != null) {
            return type;
        }
        throw new IllegalArgumentException(("Star projections in type arguments are not allowed, but had " + $this$typeOrThrow.getType()).toString());
    }

    public static final <T, K> int elementsHashCodeBy(Iterable<? extends T> $this$elementsHashCodeBy, Function1<? super T, ? extends K> selector) {
        Intrinsics.checkNotNullParameter($this$elementsHashCodeBy, "<this>");
        Intrinsics.checkNotNullParameter(selector, "selector");
        int accumulator$iv = 1;
        for (Object element : $this$elementsHashCodeBy) {
            int i = accumulator$iv * 31;
            Object invoke = selector.invoke(element);
            accumulator$iv = i + (invoke != null ? invoke.hashCode() : 0);
        }
        return accumulator$iv;
    }
}
