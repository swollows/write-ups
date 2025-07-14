package kotlinx.serialization.internal;

import java.lang.annotation.Annotation;
import kotlin.Metadata;
import kotlin.collections.ArraysKt;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.serialization.InternalSerializationApi;
import kotlinx.serialization.KSerializer;

@Metadata(d1 = {"\u0000$\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0010\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0011\n\u0002\b\u0002\n\u0002\u0010\u001b\n\u0002\b\b\u001ao\u0010\u0000\u001a\b\u0012\u0004\u0012\u0002H\u00020\u0001\"\u000e\b\u0000\u0010\u0002*\b\u0012\u0004\u0012\u0002H\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u00052\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u0002H\u00020\u00072\u000e\u0010\b\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00050\u00072\u0014\u0010\t\u001a\u0010\u0012\f\u0012\n\u0012\u0004\u0012\u00020\n\u0018\u00010\u00070\u00072\u000e\u0010\u000b\u001a\n\u0012\u0004\u0012\u00020\n\u0018\u00010\u0007H\u0001¢\u0006\u0002\u0010\f\u001a_\u0010\r\u001a\b\u0012\u0004\u0012\u0002H\u00020\u0001\"\u000e\b\u0000\u0010\u0002*\b\u0012\u0004\u0012\u0002H\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u00052\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u0002H\u00020\u00072\u000e\u0010\b\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00050\u00072\u0014\u0010\u000e\u001a\u0010\u0012\f\u0012\n\u0012\u0004\u0012\u00020\n\u0018\u00010\u00070\u0007H\u0001¢\u0006\u0002\u0010\u000f\u001a9\u0010\u0010\u001a\b\u0012\u0004\u0012\u0002H\u00020\u0001\"\u000e\b\u0000\u0010\u0002*\b\u0012\u0004\u0012\u0002H\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u00052\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u0002H\u00020\u0007H\u0001¢\u0006\u0002\u0010\u0011¨\u0006\u0012"}, d2 = {"createAnnotatedEnumSerializer", "Lkotlinx/serialization/KSerializer;", "T", "", "serialName", "", "values", "", "names", "entryAnnotations", "", "classAnnotations", "(Ljava/lang/String;[Ljava/lang/Enum;[Ljava/lang/String;[[Ljava/lang/annotation/Annotation;[Ljava/lang/annotation/Annotation;)Lkotlinx/serialization/KSerializer;", "createMarkedEnumSerializer", "annotations", "(Ljava/lang/String;[Ljava/lang/Enum;[Ljava/lang/String;[[Ljava/lang/annotation/Annotation;)Lkotlinx/serialization/KSerializer;", "createSimpleEnumSerializer", "(Ljava/lang/String;[Ljava/lang/Enum;)Lkotlinx/serialization/KSerializer;", "kotlinx-serialization-core"}, k = 2, mv = {1, 9, 0}, xi = 48)
/* compiled from: Enums.kt */
public final class EnumsKt {
    @InternalSerializationApi
    public static final <T extends Enum<T>> KSerializer<T> createSimpleEnumSerializer(String serialName, T[] values) {
        Intrinsics.checkNotNullParameter(serialName, "serialName");
        Intrinsics.checkNotNullParameter(values, "values");
        return new EnumSerializer<>(serialName, values);
    }

    @InternalSerializationApi
    public static final <T extends Enum<T>> KSerializer<T> createMarkedEnumSerializer(String serialName, T[] values, String[] names, Annotation[][] annotations) {
        String str = serialName;
        T[] tArr = values;
        String[] strArr = names;
        Annotation[][] annotationArr = annotations;
        Intrinsics.checkNotNullParameter(str, "serialName");
        Intrinsics.checkNotNullParameter(tArr, "values");
        Intrinsics.checkNotNullParameter(strArr, "names");
        Intrinsics.checkNotNullParameter(annotationArr, "annotations");
        EnumDescriptor descriptor = new EnumDescriptor(str, tArr.length);
        Object[] $this$forEachIndexed$iv = values;
        int $i$f$forEachIndexed = 0;
        int index$iv = 0;
        int length = $this$forEachIndexed$iv.length;
        int i = 0;
        while (i < length) {
            int index$iv2 = index$iv + 1;
            Enum v = $this$forEachIndexed$iv[i];
            String elementName = (String) ArraysKt.getOrNull((T[]) strArr, index$iv);
            if (elementName == null) {
                elementName = v.name();
            }
            Object[] $this$forEachIndexed$iv2 = $this$forEachIndexed$iv;
            int $i$f$forEachIndexed2 = $i$f$forEachIndexed;
            int $i$f$forEachIndexed3 = 0;
            PluginGeneratedSerialDescriptor.addElement$default(descriptor, elementName, false, 2, (Object) null);
            Object[] objArr = (Annotation[]) ArraysKt.getOrNull((T[]) (Object[]) annotationArr, index$iv);
            if (objArr != null) {
                int length2 = objArr.length;
                while ($i$f$forEachIndexed3 < length2) {
                    descriptor.pushAnnotation(objArr[$i$f$forEachIndexed3]);
                    $i$f$forEachIndexed3++;
                    objArr = objArr;
                }
                Object[] $this$forEach$iv = objArr;
            }
            i++;
            strArr = names;
            index$iv = index$iv2;
            $this$forEachIndexed$iv = $this$forEachIndexed$iv2;
            $i$f$forEachIndexed = $i$f$forEachIndexed2;
        }
        return new EnumSerializer<>(str, tArr, descriptor);
    }

    @InternalSerializationApi
    public static final <T extends Enum<T>> KSerializer<T> createAnnotatedEnumSerializer(String serialName, T[] values, String[] names, Annotation[][] entryAnnotations, Annotation[] classAnnotations) {
        String str = serialName;
        T[] tArr = values;
        String[] strArr = names;
        Annotation[][] annotationArr = entryAnnotations;
        Intrinsics.checkNotNullParameter(str, "serialName");
        Intrinsics.checkNotNullParameter(tArr, "values");
        Intrinsics.checkNotNullParameter(strArr, "names");
        Intrinsics.checkNotNullParameter(annotationArr, "entryAnnotations");
        EnumDescriptor descriptor = new EnumDescriptor(str, tArr.length);
        if (classAnnotations != null) {
            for (Annotation it : classAnnotations) {
                descriptor.pushClassAnnotation(it);
            }
        }
        Object[] $this$forEachIndexed$iv = values;
        int $i$f$forEachIndexed = 0;
        int index$iv = 0;
        int length = $this$forEachIndexed$iv.length;
        int i = 0;
        while (i < length) {
            int index$iv2 = index$iv + 1;
            Enum v = $this$forEachIndexed$iv[i];
            String elementName = (String) ArraysKt.getOrNull((T[]) strArr, index$iv);
            if (elementName == null) {
                elementName = v.name();
            }
            Object[] $this$forEachIndexed$iv2 = $this$forEachIndexed$iv;
            int $i$f$forEachIndexed2 = $i$f$forEachIndexed;
            int $i$f$forEachIndexed3 = 0;
            PluginGeneratedSerialDescriptor.addElement$default(descriptor, elementName, false, 2, (Object) null);
            Object[] objArr = (Annotation[]) ArraysKt.getOrNull((T[]) (Object[]) annotationArr, index$iv);
            if (objArr != null) {
                int length2 = objArr.length;
                while ($i$f$forEachIndexed3 < length2) {
                    descriptor.pushAnnotation(objArr[$i$f$forEachIndexed3]);
                    $i$f$forEachIndexed3++;
                    objArr = objArr;
                }
                Object[] $this$forEach$iv = objArr;
            }
            i++;
            strArr = names;
            index$iv = index$iv2;
            $this$forEachIndexed$iv = $this$forEachIndexed$iv2;
            $i$f$forEachIndexed = $i$f$forEachIndexed2;
        }
        return new EnumSerializer<>(str, tArr, descriptor);
    }
}
