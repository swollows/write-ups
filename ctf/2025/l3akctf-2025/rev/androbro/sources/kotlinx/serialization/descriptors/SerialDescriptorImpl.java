package kotlinx.serialization.descriptors;

import java.lang.annotation.Annotation;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.List;
import java.util.Map;
import java.util.Set;
import kotlin.Lazy;
import kotlin.LazyKt;
import kotlin.Metadata;
import kotlin.TuplesKt;
import kotlin.collections.ArraysKt;
import kotlin.collections.CollectionsKt;
import kotlin.collections.IndexedValue;
import kotlin.collections.MapsKt;
import kotlin.jvm.internal.Intrinsics;
import kotlin.ranges.RangesKt;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.internal.CachedNames;
import kotlinx.serialization.internal.Platform_commonKt;

@Metadata(d1 = {"\u0000d\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010 \n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u001b\n\u0002\b\u0003\n\u0002\u0010\u0011\n\u0002\b\u0006\n\u0002\u0010\u0018\n\u0002\b\u0004\n\u0002\u0010$\n\u0002\b\u0003\n\u0002\u0010\"\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0002\b\n\b\u0000\u0018\u00002\u00020\u00012\u00020\u0002B3\u0012\u0006\u0010\u0003\u001a\u00020\u0004\u0012\u0006\u0010\u0005\u001a\u00020\u0006\u0012\u0006\u0010\u0007\u001a\u00020\b\u0012\f\u0010\t\u001a\b\u0012\u0004\u0012\u00020\u00010\n\u0012\u0006\u0010\u000b\u001a\u00020\f¢\u0006\u0002\u0010\rJ\u0013\u0010,\u001a\u00020-2\b\u0010.\u001a\u0004\u0018\u00010/H\u0002J\u0016\u00100\u001a\b\u0012\u0004\u0012\u00020\u00140\n2\u0006\u00101\u001a\u00020\bH\u0016J\u0010\u00102\u001a\u00020\u00012\u0006\u00101\u001a\u00020\bH\u0016J\u0010\u00103\u001a\u00020\b2\u0006\u00104\u001a\u00020\u0004H\u0016J\u0010\u00105\u001a\u00020\u00042\u0006\u00101\u001a\u00020\bH\u0016J\b\u00106\u001a\u00020\bH\u0016J\u0010\u00107\u001a\u00020-2\u0006\u00101\u001a\u00020\bH\u0016J\b\u00108\u001a\u00020\u0004H\u0016R\u001b\u0010\u000e\u001a\u00020\b8BX\u0002¢\u0006\f\n\u0004\b\u0011\u0010\u0012\u001a\u0004\b\u000f\u0010\u0010R\u001a\u0010\u0013\u001a\b\u0012\u0004\u0012\u00020\u00140\nX\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0015\u0010\u0016R\u001c\u0010\u0017\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00140\n0\u0018X\u0004¢\u0006\u0004\n\u0002\u0010\u0019R\u0016\u0010\u001a\u001a\b\u0012\u0004\u0012\u00020\u00010\u0018X\u0004¢\u0006\u0004\n\u0002\u0010\u001bR\u0016\u0010\u001c\u001a\b\u0012\u0004\u0012\u00020\u00040\u0018X\u0004¢\u0006\u0004\n\u0002\u0010\u001dR\u000e\u0010\u001e\u001a\u00020\u001fX\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\u0007\u001a\u00020\bX\u0004¢\u0006\b\n\u0000\u001a\u0004\b \u0010\u0010R\u0014\u0010\u0005\u001a\u00020\u0006X\u0004¢\u0006\b\n\u0000\u001a\u0004\b!\u0010\"R\u001a\u0010#\u001a\u000e\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\b0$X\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\u0003\u001a\u00020\u0004X\u0004¢\u0006\b\n\u0000\u001a\u0004\b%\u0010&R\u001a\u0010'\u001a\b\u0012\u0004\u0012\u00020\u00040(X\u0004¢\u0006\b\n\u0000\u001a\u0004\b)\u0010*R\u0016\u0010+\u001a\b\u0012\u0004\u0012\u00020\u00010\u0018X\u0004¢\u0006\u0004\n\u0002\u0010\u001b¨\u00069"}, d2 = {"Lkotlinx/serialization/descriptors/SerialDescriptorImpl;", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "Lkotlinx/serialization/internal/CachedNames;", "serialName", "", "kind", "Lkotlinx/serialization/descriptors/SerialKind;", "elementsCount", "", "typeParameters", "", "builder", "Lkotlinx/serialization/descriptors/ClassSerialDescriptorBuilder;", "(Ljava/lang/String;Lkotlinx/serialization/descriptors/SerialKind;ILjava/util/List;Lkotlinx/serialization/descriptors/ClassSerialDescriptorBuilder;)V", "_hashCode", "get_hashCode", "()I", "_hashCode$delegate", "Lkotlin/Lazy;", "annotations", "", "getAnnotations", "()Ljava/util/List;", "elementAnnotations", "", "[Ljava/util/List;", "elementDescriptors", "[Lkotlinx/serialization/descriptors/SerialDescriptor;", "elementNames", "[Ljava/lang/String;", "elementOptionality", "", "getElementsCount", "getKind", "()Lkotlinx/serialization/descriptors/SerialKind;", "name2Index", "", "getSerialName", "()Ljava/lang/String;", "serialNames", "", "getSerialNames", "()Ljava/util/Set;", "typeParametersDescriptors", "equals", "", "other", "", "getElementAnnotations", "index", "getElementDescriptor", "getElementIndex", "name", "getElementName", "hashCode", "isElementOptional", "toString", "kotlinx-serialization-core"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* compiled from: SerialDescriptors.kt */
public final class SerialDescriptorImpl implements SerialDescriptor, CachedNames {
    private final Lazy _hashCode$delegate;
    private final List<Annotation> annotations;
    private final List<Annotation>[] elementAnnotations;
    private final SerialDescriptor[] elementDescriptors;
    private final String[] elementNames;
    private final boolean[] elementOptionality;
    private final int elementsCount;
    private final SerialKind kind;
    private final Map<String, Integer> name2Index;
    private final String serialName;
    private final Set<String> serialNames;
    /* access modifiers changed from: private */
    public final SerialDescriptor[] typeParametersDescriptors;

    public SerialDescriptorImpl(String serialName2, SerialKind kind2, int elementsCount2, List<? extends SerialDescriptor> typeParameters, ClassSerialDescriptorBuilder builder) {
        String str = serialName2;
        SerialKind serialKind = kind2;
        Intrinsics.checkNotNullParameter(str, "serialName");
        Intrinsics.checkNotNullParameter(serialKind, "kind");
        Intrinsics.checkNotNullParameter(typeParameters, "typeParameters");
        Intrinsics.checkNotNullParameter(builder, "builder");
        this.serialName = str;
        this.kind = serialKind;
        this.elementsCount = elementsCount2;
        this.annotations = builder.getAnnotations();
        this.serialNames = CollectionsKt.toHashSet(builder.getElementNames$kotlinx_serialization_core());
        this.elementNames = (String[]) builder.getElementNames$kotlinx_serialization_core().toArray(new String[0]);
        this.elementDescriptors = Platform_commonKt.compactArray(builder.getElementDescriptors$kotlinx_serialization_core());
        this.elementAnnotations = (List[]) builder.getElementAnnotations$kotlinx_serialization_core().toArray(new List[0]);
        this.elementOptionality = CollectionsKt.toBooleanArray(builder.getElementOptionality$kotlinx_serialization_core());
        Iterable<IndexedValue> $this$map$iv = ArraysKt.withIndex((T[]) this.elementNames);
        Collection destination$iv$iv = new ArrayList(CollectionsKt.collectionSizeOrDefault($this$map$iv, 10));
        for (IndexedValue it : $this$map$iv) {
            destination$iv$iv.add(TuplesKt.to(it.getValue(), Integer.valueOf(it.getIndex())));
            String str2 = serialName2;
        }
        this.name2Index = MapsKt.toMap((List) destination$iv$iv);
        this.typeParametersDescriptors = Platform_commonKt.compactArray(typeParameters);
        this._hashCode$delegate = LazyKt.lazy(new SerialDescriptorImpl$_hashCode$2(this));
    }

    public boolean isInline() {
        return SerialDescriptor.DefaultImpls.isInline(this);
    }

    public boolean isNullable() {
        return SerialDescriptor.DefaultImpls.isNullable(this);
    }

    public String getSerialName() {
        return this.serialName;
    }

    public SerialKind getKind() {
        return this.kind;
    }

    public int getElementsCount() {
        return this.elementsCount;
    }

    public List<Annotation> getAnnotations() {
        return this.annotations;
    }

    public Set<String> getSerialNames() {
        return this.serialNames;
    }

    private final int get_hashCode() {
        return ((Number) this._hashCode$delegate.getValue()).intValue();
    }

    public String getElementName(int index) {
        return this.elementNames[index];
    }

    public int getElementIndex(String name) {
        Intrinsics.checkNotNullParameter(name, "name");
        Integer num = this.name2Index.get(name);
        if (num != null) {
            return num.intValue();
        }
        return -3;
    }

    public List<Annotation> getElementAnnotations(int index) {
        return this.elementAnnotations[index];
    }

    public SerialDescriptor getElementDescriptor(int index) {
        return this.elementDescriptors[index];
    }

    public boolean isElementOptional(int index) {
        return this.elementOptionality[index];
    }

    public boolean equals(Object other) {
        SerialDescriptor $this$equalsImpl$iv = this;
        if ($this$equalsImpl$iv == other) {
            return true;
        }
        if (!(other instanceof SerialDescriptorImpl)) {
            return false;
        }
        if (!Intrinsics.areEqual((Object) $this$equalsImpl$iv.getSerialName(), (Object) ((SerialDescriptor) other).getSerialName())) {
            return false;
        }
        if (!Arrays.equals(this.typeParametersDescriptors, ((SerialDescriptorImpl) other).typeParametersDescriptors)) {
            return false;
        }
        if ($this$equalsImpl$iv.getElementsCount() != ((SerialDescriptor) other).getElementsCount()) {
            return false;
        }
        int elementsCount2 = $this$equalsImpl$iv.getElementsCount();
        for (int index$iv = 0; index$iv < elementsCount2; index$iv++) {
            if (!Intrinsics.areEqual((Object) $this$equalsImpl$iv.getElementDescriptor(index$iv).getSerialName(), (Object) ((SerialDescriptor) other).getElementDescriptor(index$iv).getSerialName())) {
                return false;
            }
            if (!Intrinsics.areEqual((Object) $this$equalsImpl$iv.getElementDescriptor(index$iv).getKind(), (Object) ((SerialDescriptor) other).getElementDescriptor(index$iv).getKind())) {
                return false;
            }
        }
        return true;
    }

    public int hashCode() {
        return get_hashCode();
    }

    public String toString() {
        return CollectionsKt.joinToString$default(RangesKt.until(0, getElementsCount()), ", ", getSerialName() + '(', ")", 0, (CharSequence) null, new SerialDescriptorImpl$toString$1(this), 24, (Object) null);
    }
}
