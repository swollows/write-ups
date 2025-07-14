package kotlinx.serialization.descriptors;

import java.lang.annotation.Annotation;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.serialization.ExperimentalSerializationApi;

@Metadata(d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010 \n\u0002\u0010\u001b\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\f\b\u0000\u0018\u00002\u00020\u0001B\u0015\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0001¢\u0006\u0002\u0010\u0005J\u0017\u0010\u0019\u001a\b\u0012\u0004\u0012\u00020\b0\u00072\u0006\u0010\u001a\u001a\u00020\fH\u0001J\u0011\u0010\u001b\u001a\u00020\u00012\u0006\u0010\u001a\u001a\u00020\fH\u0001J\u0011\u0010\u001c\u001a\u00020\f2\u0006\u0010\u001d\u001a\u00020\u0003H\u0001J\u0011\u0010\u001e\u001a\u00020\u00032\u0006\u0010\u001a\u001a\u00020\fH\u0001J\u0011\u0010\u001f\u001a\u00020\u00102\u0006\u0010\u001a\u001a\u00020\fH\u0001R\u001a\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\b0\u00078VX\u0005¢\u0006\u0006\u001a\u0004\b\t\u0010\nR\u0014\u0010\u000b\u001a\u00020\f8\u0016X\u0005¢\u0006\u0006\u001a\u0004\b\r\u0010\u000eR\u0014\u0010\u000f\u001a\u00020\u00108VX\u0005¢\u0006\u0006\u001a\u0004\b\u000f\u0010\u0011R\u0014\u0010\u0012\u001a\u00020\u00108VX\u0005¢\u0006\u0006\u001a\u0004\b\u0012\u0010\u0011R\u0014\u0010\u0013\u001a\u00020\u00148\u0016X\u0005¢\u0006\u0006\u001a\u0004\b\u0015\u0010\u0016R\u0014\u0010\u0002\u001a\u00020\u0003X\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0017\u0010\u0018¨\u0006 "}, d2 = {"Lkotlinx/serialization/descriptors/WrappedSerialDescriptor;", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "serialName", "", "original", "(Ljava/lang/String;Lkotlinx/serialization/descriptors/SerialDescriptor;)V", "annotations", "", "", "getAnnotations", "()Ljava/util/List;", "elementsCount", "", "getElementsCount", "()I", "isInline", "", "()Z", "isNullable", "kind", "Lkotlinx/serialization/descriptors/SerialKind;", "getKind", "()Lkotlinx/serialization/descriptors/SerialKind;", "getSerialName", "()Ljava/lang/String;", "getElementAnnotations", "index", "getElementDescriptor", "getElementIndex", "name", "getElementName", "isElementOptional", "kotlinx-serialization-core"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* compiled from: SerialDescriptors.kt */
public final class WrappedSerialDescriptor implements SerialDescriptor {
    private final /* synthetic */ SerialDescriptor $$delegate_0;
    private final String serialName;

    public List<Annotation> getAnnotations() {
        return this.$$delegate_0.getAnnotations();
    }

    @ExperimentalSerializationApi
    public List<Annotation> getElementAnnotations(int i) {
        return this.$$delegate_0.getElementAnnotations(i);
    }

    @ExperimentalSerializationApi
    public SerialDescriptor getElementDescriptor(int i) {
        return this.$$delegate_0.getElementDescriptor(i);
    }

    @ExperimentalSerializationApi
    public int getElementIndex(String str) {
        Intrinsics.checkNotNullParameter(str, "name");
        return this.$$delegate_0.getElementIndex(str);
    }

    @ExperimentalSerializationApi
    public String getElementName(int i) {
        return this.$$delegate_0.getElementName(i);
    }

    public int getElementsCount() {
        return this.$$delegate_0.getElementsCount();
    }

    public SerialKind getKind() {
        return this.$$delegate_0.getKind();
    }

    @ExperimentalSerializationApi
    public boolean isElementOptional(int i) {
        return this.$$delegate_0.isElementOptional(i);
    }

    public boolean isInline() {
        return this.$$delegate_0.isInline();
    }

    public boolean isNullable() {
        return this.$$delegate_0.isNullable();
    }

    public WrappedSerialDescriptor(String serialName2, SerialDescriptor original) {
        Intrinsics.checkNotNullParameter(serialName2, "serialName");
        Intrinsics.checkNotNullParameter(original, "original");
        this.serialName = serialName2;
        this.$$delegate_0 = original;
    }

    public String getSerialName() {
        return this.serialName;
    }
}
