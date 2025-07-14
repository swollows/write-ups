package kotlinx.serialization.internal;

import java.util.ArrayList;
import java.util.Iterator;
import kotlin.Metadata;
import kotlin.collections.ArraysKt;
import kotlin.jvm.internal.ArrayIteratorKt;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.reflect.KClass;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.descriptors.SerialDescriptor;

@Metadata(d1 = {"\u0000J\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0011\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010(\n\u0002\b\f\b\u0001\u0018\u0000*\b\b\u0000\u0010\u0001*\u00020\u0002*\n\b\u0001\u0010\u0003*\u0004\u0018\u0001H\u00012*\u0012\u0004\u0012\u0002H\u0003\u0012\n\u0012\b\u0012\u0004\u0012\u0002H\u00030\u0005\u0012\u0014\u0012\u0012\u0012\u0004\u0012\u0002H\u00030\u0006j\b\u0012\u0004\u0012\u0002H\u0003`\u00070\u0004B!\u0012\f\u0010\b\u001a\b\u0012\u0004\u0012\u00028\u00000\t\u0012\f\u0010\n\u001a\b\u0012\u0004\u0012\u00028\u00010\u000b¢\u0006\u0002\u0010\fJ\u0018\u0010\u0011\u001a\u0012\u0012\u0004\u0012\u00028\u00010\u0006j\b\u0012\u0004\u0012\u00028\u0001`\u0007H\u0014J\u001c\u0010\u0012\u001a\u00020\u0013*\u0012\u0012\u0004\u0012\u00028\u00010\u0006j\b\u0012\u0004\u0012\u00028\u0001`\u0007H\u0014J$\u0010\u0014\u001a\u00020\u0015*\u0012\u0012\u0004\u0012\u00028\u00010\u0006j\b\u0012\u0004\u0012\u00028\u0001`\u00072\u0006\u0010\u0016\u001a\u00020\u0013H\u0014J\u001d\u0010\u0017\u001a\b\u0012\u0004\u0012\u00028\u00010\u0018*\b\u0012\u0004\u0012\u00028\u00010\u0005H\u0014¢\u0006\u0002\u0010\u0019J\u0017\u0010\u001a\u001a\u00020\u0013*\b\u0012\u0004\u0012\u00028\u00010\u0005H\u0014¢\u0006\u0002\u0010\u001bJ1\u0010\u001c\u001a\u00020\u0015*\u0012\u0012\u0004\u0012\u00028\u00010\u0006j\b\u0012\u0004\u0012\u00028\u0001`\u00072\u0006\u0010\u001d\u001a\u00020\u00132\u0006\u0010\u001e\u001a\u00028\u0001H\u0014¢\u0006\u0002\u0010\u001fJ'\u0010 \u001a\u0012\u0012\u0004\u0012\u00028\u00010\u0006j\b\u0012\u0004\u0012\u00028\u0001`\u0007*\b\u0012\u0004\u0012\u00028\u00010\u0005H\u0014¢\u0006\u0002\u0010!J'\u0010\"\u001a\b\u0012\u0004\u0012\u00028\u00010\u0005*\u0012\u0012\u0004\u0012\u00028\u00010\u0006j\b\u0012\u0004\u0012\u00028\u0001`\u0007H\u0014¢\u0006\u0002\u0010#R\u0014\u0010\r\u001a\u00020\u000eX\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\u0010R\u0014\u0010\b\u001a\b\u0012\u0004\u0012\u00028\u00000\tX\u0004¢\u0006\u0002\n\u0000¨\u0006$"}, d2 = {"Lkotlinx/serialization/internal/ReferenceArraySerializer;", "ElementKlass", "", "Element", "Lkotlinx/serialization/internal/CollectionLikeSerializer;", "", "Ljava/util/ArrayList;", "Lkotlin/collections/ArrayList;", "kClass", "Lkotlin/reflect/KClass;", "eSerializer", "Lkotlinx/serialization/KSerializer;", "(Lkotlin/reflect/KClass;Lkotlinx/serialization/KSerializer;)V", "descriptor", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "getDescriptor", "()Lkotlinx/serialization/descriptors/SerialDescriptor;", "builder", "builderSize", "", "checkCapacity", "", "size", "collectionIterator", "", "([Ljava/lang/Object;)Ljava/util/Iterator;", "collectionSize", "([Ljava/lang/Object;)I", "insert", "index", "element", "(Ljava/util/ArrayList;ILjava/lang/Object;)V", "toBuilder", "([Ljava/lang/Object;)Ljava/util/ArrayList;", "toResult", "(Ljava/util/ArrayList;)[Ljava/lang/Object;", "kotlinx-serialization-core"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* compiled from: CollectionSerializers.kt */
public final class ReferenceArraySerializer<ElementKlass, Element extends ElementKlass> extends CollectionLikeSerializer<Element, Element[], ArrayList<Element>> {
    private final SerialDescriptor descriptor;
    private final KClass<ElementKlass> kClass;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public ReferenceArraySerializer(KClass<ElementKlass> kClass2, KSerializer<Element> eSerializer) {
        super(eSerializer, (DefaultConstructorMarker) null);
        Intrinsics.checkNotNullParameter(kClass2, "kClass");
        Intrinsics.checkNotNullParameter(eSerializer, "eSerializer");
        this.kClass = kClass2;
        this.descriptor = new ArrayClassDesc(eSerializer.getDescriptor());
    }

    public SerialDescriptor getDescriptor() {
        return this.descriptor;
    }

    /* access modifiers changed from: protected */
    public int collectionSize(Element[] $this$collectionSize) {
        Intrinsics.checkNotNullParameter($this$collectionSize, "<this>");
        return $this$collectionSize.length;
    }

    /* access modifiers changed from: protected */
    public Iterator<Element> collectionIterator(Element[] $this$collectionIterator) {
        Intrinsics.checkNotNullParameter($this$collectionIterator, "<this>");
        return ArrayIteratorKt.iterator($this$collectionIterator);
    }

    /* access modifiers changed from: protected */
    public ArrayList<Element> builder() {
        return new ArrayList<>();
    }

    /* access modifiers changed from: protected */
    public int builderSize(ArrayList<Element> $this$builderSize) {
        Intrinsics.checkNotNullParameter($this$builderSize, "<this>");
        return $this$builderSize.size();
    }

    /* access modifiers changed from: protected */
    public Element[] toResult(ArrayList<Element> $this$toResult) {
        Intrinsics.checkNotNullParameter($this$toResult, "<this>");
        return PlatformKt.toNativeArrayImpl($this$toResult, this.kClass);
    }

    /* access modifiers changed from: protected */
    public ArrayList<Element> toBuilder(Element[] $this$toBuilder) {
        Intrinsics.checkNotNullParameter($this$toBuilder, "<this>");
        return new ArrayList<>(ArraysKt.asList((T[]) $this$toBuilder));
    }

    /* access modifiers changed from: protected */
    public void checkCapacity(ArrayList<Element> $this$checkCapacity, int size) {
        Intrinsics.checkNotNullParameter($this$checkCapacity, "<this>");
        $this$checkCapacity.ensureCapacity(size);
    }

    /* access modifiers changed from: protected */
    public void insert(ArrayList<Element> $this$insert, int index, Element element) {
        Intrinsics.checkNotNullParameter($this$insert, "<this>");
        $this$insert.add(index, element);
    }
}
