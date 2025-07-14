package kotlinx.serialization.internal;

import java.lang.annotation.Annotation;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;
import kotlin.Lazy;
import kotlin.LazyKt;
import kotlin.LazyThreadSafetyMode;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt;
import kotlin.collections.MapsKt;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.ranges.RangesKt;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.descriptors.SerialKind;
import kotlinx.serialization.descriptors.StructureKind;

@Metadata(d1 = {"\u0000v\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\b\n\u0002\u0010 \n\u0002\u0010\u001b\n\u0002\b\u0003\n\u0002\u0010\u0011\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010!\n\u0002\b\u0002\n\u0002\u0010\u0018\n\u0000\n\u0002\u0010$\n\u0000\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0010\"\n\u0002\b\u0007\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0010\u0000\n\u0002\b\r\b\u0011\u0018\u00002\u00020\u00012\u00020\u0002B%\u0012\u0006\u0010\u0003\u001a\u00020\u0004\u0012\u000e\b\u0002\u0010\u0005\u001a\b\u0012\u0002\b\u0003\u0018\u00010\u0006\u0012\u0006\u0010\u0007\u001a\u00020\b¢\u0006\u0002\u0010\tJ\u0018\u00104\u001a\u0002052\u0006\u00106\u001a\u00020\u00042\b\b\u0002\u00107\u001a\u000208J\u0014\u00109\u001a\u000e\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\b0!H\u0002J\u0013\u0010:\u001a\u0002082\b\u0010;\u001a\u0004\u0018\u00010<H\u0002J\u0016\u0010=\u001a\b\u0012\u0004\u0012\u00020\u00120\u00112\u0006\u0010>\u001a\u00020\bH\u0016J\u0010\u0010?\u001a\u00020\u00012\u0006\u0010>\u001a\u00020\bH\u0016J\u0010\u0010@\u001a\u00020\b2\u0006\u00106\u001a\u00020\u0004H\u0016J\u0010\u0010A\u001a\u00020\u00042\u0006\u0010>\u001a\u00020\bH\u0016J\b\u0010B\u001a\u00020\bH\u0016J\u0010\u0010C\u001a\u0002082\u0006\u0010>\u001a\u00020\bH\u0016J\u000e\u0010D\u001a\u0002052\u0006\u0010E\u001a\u00020\u0012J\u000e\u0010F\u001a\u0002052\u0006\u0010G\u001a\u00020\u0012J\b\u0010H\u001a\u00020\u0004H\u0016R\u001b\u0010\n\u001a\u00020\b8BX\u0002¢\u0006\f\n\u0004\b\r\u0010\u000e\u001a\u0004\b\u000b\u0010\fR\u000e\u0010\u000f\u001a\u00020\bX\u000e¢\u0006\u0002\n\u0000R\u001a\u0010\u0010\u001a\b\u0012\u0004\u0012\u00020\u00120\u00118VX\u0004¢\u0006\u0006\u001a\u0004\b\u0013\u0010\u0014R%\u0010\u0015\u001a\f\u0012\b\u0012\u0006\u0012\u0002\b\u00030\u00170\u00168BX\u0002¢\u0006\f\n\u0004\b\u001a\u0010\u000e\u001a\u0004\b\u0018\u0010\u0019R\u0016\u0010\u001b\u001a\n\u0012\u0004\u0012\u00020\u0012\u0018\u00010\u001cX\u000e¢\u0006\u0002\n\u0000R\u0011\u0010\u0007\u001a\u00020\b¢\u0006\b\n\u0000\u001a\u0004\b\u001d\u0010\fR\u000e\u0010\u001e\u001a\u00020\u001fX\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\u0005\u001a\b\u0012\u0002\b\u0003\u0018\u00010\u0006X\u0004¢\u0006\u0002\n\u0000R\u001a\u0010 \u001a\u000e\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\b0!X\u000e¢\u0006\u0002\n\u0000R\u0014\u0010\"\u001a\u00020#8VX\u0004¢\u0006\u0006\u001a\u0004\b$\u0010%R\u0016\u0010&\u001a\b\u0012\u0004\u0012\u00020\u00040\u0016X\u0004¢\u0006\u0004\n\u0002\u0010'R\u001e\u0010(\u001a\u0010\u0012\f\u0012\n\u0012\u0004\u0012\u00020\u0012\u0018\u00010\u001c0\u0016X\u0004¢\u0006\u0004\n\u0002\u0010)R\u0014\u0010\u0003\u001a\u00020\u0004X\u0004¢\u0006\b\n\u0000\u001a\u0004\b*\u0010+R\u001a\u0010,\u001a\b\u0012\u0004\u0012\u00020\u00040-8VX\u0004¢\u0006\u0006\u001a\u0004\b.\u0010/R!\u00100\u001a\b\u0012\u0004\u0012\u00020\u00010\u00168@X\u0002¢\u0006\f\n\u0004\b3\u0010\u000e\u001a\u0004\b1\u00102¨\u0006I"}, d2 = {"Lkotlinx/serialization/internal/PluginGeneratedSerialDescriptor;", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "Lkotlinx/serialization/internal/CachedNames;", "serialName", "", "generatedSerializer", "Lkotlinx/serialization/internal/GeneratedSerializer;", "elementsCount", "", "(Ljava/lang/String;Lkotlinx/serialization/internal/GeneratedSerializer;I)V", "_hashCode", "get_hashCode", "()I", "_hashCode$delegate", "Lkotlin/Lazy;", "added", "annotations", "", "", "getAnnotations", "()Ljava/util/List;", "childSerializers", "", "Lkotlinx/serialization/KSerializer;", "getChildSerializers", "()[Lkotlinx/serialization/KSerializer;", "childSerializers$delegate", "classAnnotations", "", "getElementsCount", "elementsOptionality", "", "indices", "", "kind", "Lkotlinx/serialization/descriptors/SerialKind;", "getKind", "()Lkotlinx/serialization/descriptors/SerialKind;", "names", "[Ljava/lang/String;", "propertiesAnnotations", "[Ljava/util/List;", "getSerialName", "()Ljava/lang/String;", "serialNames", "", "getSerialNames", "()Ljava/util/Set;", "typeParameterDescriptors", "getTypeParameterDescriptors$kotlinx_serialization_core", "()[Lkotlinx/serialization/descriptors/SerialDescriptor;", "typeParameterDescriptors$delegate", "addElement", "", "name", "isOptional", "", "buildIndices", "equals", "other", "", "getElementAnnotations", "index", "getElementDescriptor", "getElementIndex", "getElementName", "hashCode", "isElementOptional", "pushAnnotation", "annotation", "pushClassAnnotation", "a", "toString", "kotlinx-serialization-core"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* compiled from: PluginGeneratedSerialDescriptor.kt */
public class PluginGeneratedSerialDescriptor implements SerialDescriptor, CachedNames {
    private final Lazy _hashCode$delegate;
    private int added;
    private final Lazy childSerializers$delegate;
    private List<Annotation> classAnnotations;
    private final int elementsCount;
    private final boolean[] elementsOptionality;
    /* access modifiers changed from: private */
    public final GeneratedSerializer<?> generatedSerializer;
    private Map<String, Integer> indices;
    private final String[] names;
    private final List<Annotation>[] propertiesAnnotations;
    private final String serialName;
    private final Lazy typeParameterDescriptors$delegate;

    public PluginGeneratedSerialDescriptor(String serialName2, GeneratedSerializer<?> generatedSerializer2, int elementsCount2) {
        Intrinsics.checkNotNullParameter(serialName2, "serialName");
        this.serialName = serialName2;
        this.generatedSerializer = generatedSerializer2;
        this.elementsCount = elementsCount2;
        this.added = -1;
        int i = this.elementsCount;
        String[] strArr = new String[i];
        for (int i2 = 0; i2 < i; i2++) {
            strArr[i2] = "[UNINITIALIZED]";
        }
        this.names = strArr;
        this.propertiesAnnotations = new List[this.elementsCount];
        this.elementsOptionality = new boolean[this.elementsCount];
        this.indices = MapsKt.emptyMap();
        this.childSerializers$delegate = LazyKt.lazy(LazyThreadSafetyMode.PUBLICATION, new PluginGeneratedSerialDescriptor$childSerializers$2(this));
        this.typeParameterDescriptors$delegate = LazyKt.lazy(LazyThreadSafetyMode.PUBLICATION, new PluginGeneratedSerialDescriptor$typeParameterDescriptors$2(this));
        this._hashCode$delegate = LazyKt.lazy(LazyThreadSafetyMode.PUBLICATION, new PluginGeneratedSerialDescriptor$_hashCode$2(this));
    }

    public boolean isInline() {
        return SerialDescriptor.DefaultImpls.isInline(this);
    }

    public boolean isNullable() {
        return SerialDescriptor.DefaultImpls.isNullable(this);
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public /* synthetic */ PluginGeneratedSerialDescriptor(String str, GeneratedSerializer generatedSerializer2, int i, int i2, DefaultConstructorMarker defaultConstructorMarker) {
        this(str, (i2 & 2) != 0 ? null : generatedSerializer2, i);
    }

    public String getSerialName() {
        return this.serialName;
    }

    public final int getElementsCount() {
        return this.elementsCount;
    }

    public SerialKind getKind() {
        return StructureKind.CLASS.INSTANCE;
    }

    public List<Annotation> getAnnotations() {
        List<Annotation> list = this.classAnnotations;
        return list == null ? CollectionsKt.emptyList() : list;
    }

    public Set<String> getSerialNames() {
        return this.indices.keySet();
    }

    private final KSerializer<?>[] getChildSerializers() {
        return (KSerializer[]) this.childSerializers$delegate.getValue();
    }

    public final SerialDescriptor[] getTypeParameterDescriptors$kotlinx_serialization_core() {
        return (SerialDescriptor[]) this.typeParameterDescriptors$delegate.getValue();
    }

    private final int get_hashCode() {
        return ((Number) this._hashCode$delegate.getValue()).intValue();
    }

    public static /* synthetic */ void addElement$default(PluginGeneratedSerialDescriptor pluginGeneratedSerialDescriptor, String str, boolean z, int i, Object obj) {
        if (obj == null) {
            if ((i & 2) != 0) {
                z = false;
            }
            pluginGeneratedSerialDescriptor.addElement(str, z);
            return;
        }
        throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: addElement");
    }

    public final void addElement(String name, boolean isOptional) {
        Intrinsics.checkNotNullParameter(name, "name");
        String[] strArr = this.names;
        this.added++;
        strArr[this.added] = name;
        this.elementsOptionality[this.added] = isOptional;
        this.propertiesAnnotations[this.added] = null;
        if (this.added == this.elementsCount - 1) {
            this.indices = buildIndices();
        }
    }

    public final void pushAnnotation(Annotation annotation) {
        List it;
        Intrinsics.checkNotNullParameter(annotation, "annotation");
        List it2 = this.propertiesAnnotations[this.added];
        if (it2 == null) {
            ArrayList result = new ArrayList(1);
            this.propertiesAnnotations[this.added] = result;
            it = result;
        } else {
            it = it2;
        }
        it.add(annotation);
    }

    public final void pushClassAnnotation(Annotation a) {
        Intrinsics.checkNotNullParameter(a, "a");
        if (this.classAnnotations == null) {
            this.classAnnotations = new ArrayList(1);
        }
        List<Annotation> list = this.classAnnotations;
        Intrinsics.checkNotNull(list);
        list.add(a);
    }

    public SerialDescriptor getElementDescriptor(int index) {
        return getChildSerializers()[index].getDescriptor();
    }

    public boolean isElementOptional(int index) {
        return this.elementsOptionality[index];
    }

    public List<Annotation> getElementAnnotations(int index) {
        List<Annotation> list = this.propertiesAnnotations[index];
        return list == null ? CollectionsKt.emptyList() : list;
    }

    public String getElementName(int index) {
        return this.names[index];
    }

    public int getElementIndex(String name) {
        Intrinsics.checkNotNullParameter(name, "name");
        Integer num = this.indices.get(name);
        if (num != null) {
            return num.intValue();
        }
        return -3;
    }

    private final Map<String, Integer> buildIndices() {
        HashMap indices2 = new HashMap();
        int length = this.names.length;
        for (int i = 0; i < length; i++) {
            indices2.put(this.names[i], Integer.valueOf(i));
        }
        return indices2;
    }

    public boolean equals(Object other) {
        SerialDescriptor $this$equalsImpl$iv = this;
        if ($this$equalsImpl$iv == other) {
            return true;
        }
        if (!(other instanceof PluginGeneratedSerialDescriptor)) {
            return false;
        }
        if (!Intrinsics.areEqual((Object) $this$equalsImpl$iv.getSerialName(), (Object) ((SerialDescriptor) other).getSerialName())) {
            return false;
        }
        if (!Arrays.equals(getTypeParameterDescriptors$kotlinx_serialization_core(), ((PluginGeneratedSerialDescriptor) other).getTypeParameterDescriptors$kotlinx_serialization_core())) {
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
        return CollectionsKt.joinToString$default(RangesKt.until(0, this.elementsCount), ", ", getSerialName() + '(', ")", 0, (CharSequence) null, new PluginGeneratedSerialDescriptor$toString$1(this), 24, (Object) null);
    }
}
