package androidx.navigation.serialization;

import androidx.navigation.CollectionNavType;
import androidx.navigation.NavType;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt;
import kotlin.collections.MapsKt;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.SerializationStrategy;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.encoding.AbstractEncoder;
import kotlinx.serialization.modules.SerializersModule;
import kotlinx.serialization.modules.SerializersModuleBuildersKt;

@Metadata(d1 = {"\u0000Z\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010$\n\u0002\u0010\u000e\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010%\n\u0002\u0010 \n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0007\u0018\u0000*\b\b\u0000\u0010\u0001*\u00020\u00022\u00020\u0003B/\u0012\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00028\u00000\u0005\u0012\u001a\u0010\u0006\u001a\u0016\u0012\u0004\u0012\u00020\b\u0012\f\u0012\n\u0012\u0006\u0012\u0004\u0018\u00010\u00020\t0\u0007¢\u0006\u0002\u0010\nJ\u0018\u0010\u0014\u001a\u00020\u00152\u0006\u0010\u0016\u001a\u00020\u00172\u0006\u0010\u0018\u001a\u00020\fH\u0016J\b\u0010\u0019\u001a\u00020\u001aH\u0016J)\u0010\u001b\u001a\u00020\u001a\"\u0004\b\u0001\u0010\u00012\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u0002H\u00010\u001c2\u0006\u0010\u001d\u001a\u0002H\u0001H\u0016¢\u0006\u0002\u0010\u001eJ \u0010\u001f\u001a\u0014\u0012\u0004\u0012\u00020\b\u0012\n\u0012\b\u0012\u0004\u0012\u00020\b0\u000f0\u00072\u0006\u0010\u001d\u001a\u00020\u0002J\u0010\u0010 \u001a\u00020\u001a2\u0006\u0010\u001d\u001a\u00020\u0002H\u0016J\u0012\u0010!\u001a\u00020\u001a2\b\u0010\u001d\u001a\u0004\u0018\u00010\u0002H\u0002R\u000e\u0010\u000b\u001a\u00020\fX\u000e¢\u0006\u0002\n\u0000R \u0010\r\u001a\u0014\u0012\u0004\u0012\u00020\b\u0012\n\u0012\b\u0012\u0004\u0012\u00020\b0\u000f0\u000eX\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\u0004\u001a\b\u0012\u0004\u0012\u00028\u00000\u0005X\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\u0010\u001a\u00020\u0011X\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0012\u0010\u0013R\"\u0010\u0006\u001a\u0016\u0012\u0004\u0012\u00020\b\u0012\f\u0012\n\u0012\u0006\u0012\u0004\u0018\u00010\u00020\t0\u0007X\u0004¢\u0006\u0002\n\u0000¨\u0006\""}, d2 = {"Landroidx/navigation/serialization/RouteEncoder;", "T", "", "Lkotlinx/serialization/encoding/AbstractEncoder;", "serializer", "Lkotlinx/serialization/KSerializer;", "typeMap", "", "", "Landroidx/navigation/NavType;", "(Lkotlinx/serialization/KSerializer;Ljava/util/Map;)V", "elementIndex", "", "map", "", "", "serializersModule", "Lkotlinx/serialization/modules/SerializersModule;", "getSerializersModule", "()Lkotlinx/serialization/modules/SerializersModule;", "encodeElement", "", "descriptor", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "index", "encodeNull", "", "encodeSerializableValue", "Lkotlinx/serialization/SerializationStrategy;", "value", "(Lkotlinx/serialization/SerializationStrategy;Ljava/lang/Object;)V", "encodeToArgMap", "encodeValue", "internalEncodeValue", "navigation-common_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* compiled from: RouteEncoder.kt */
public final class RouteEncoder<T> extends AbstractEncoder {
    private int elementIndex = -1;
    private final Map<String, List<String>> map = new LinkedHashMap();
    private final KSerializer<T> serializer;
    private final SerializersModule serializersModule = SerializersModuleBuildersKt.EmptySerializersModule();
    private final Map<String, NavType<Object>> typeMap;

    public RouteEncoder(KSerializer<T> serializer2, Map<String, ? extends NavType<Object>> typeMap2) {
        Intrinsics.checkNotNullParameter(serializer2, "serializer");
        Intrinsics.checkNotNullParameter(typeMap2, "typeMap");
        this.serializer = serializer2;
        this.typeMap = typeMap2;
    }

    public SerializersModule getSerializersModule() {
        return this.serializersModule;
    }

    public final Map<String, List<String>> encodeToArgMap(Object value) {
        Intrinsics.checkNotNullParameter(value, "value");
        super.encodeSerializableValue(this.serializer, value);
        return MapsKt.toMap(this.map);
    }

    public <T> void encodeSerializableValue(SerializationStrategy<? super T> serializer2, T value) {
        Intrinsics.checkNotNullParameter(serializer2, "serializer");
        internalEncodeValue(value);
    }

    public boolean encodeElement(SerialDescriptor descriptor, int index) {
        Intrinsics.checkNotNullParameter(descriptor, "descriptor");
        this.elementIndex = index;
        return true;
    }

    public void encodeValue(Object value) {
        Intrinsics.checkNotNullParameter(value, "value");
        internalEncodeValue(value);
    }

    public void encodeNull() {
        internalEncodeValue((Object) null);
    }

    private final void internalEncodeValue(Object value) {
        List parsedValue;
        String argName = this.serializer.getDescriptor().getElementName(this.elementIndex);
        NavType navType = this.typeMap.get(argName);
        if (navType != null) {
            if (navType instanceof CollectionNavType) {
                parsedValue = ((CollectionNavType) navType).serializeAsValues(value);
            } else {
                parsedValue = CollectionsKt.listOf(navType.serializeAsValue(value));
            }
            this.map.put(argName, parsedValue);
            return;
        }
        throw new IllegalStateException(("Cannot find NavType for argument " + argName + ". Please provide NavType through typeMap.").toString());
    }
}
