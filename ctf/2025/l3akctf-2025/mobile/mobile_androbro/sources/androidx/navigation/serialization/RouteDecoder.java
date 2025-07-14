package androidx.navigation.serialization;

import android.os.Bundle;
import androidx.lifecycle.SavedStateHandle;
import androidx.navigation.NavType;
import java.util.Map;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.serialization.DeserializationStrategy;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.encoding.AbstractDecoder;
import kotlinx.serialization.modules.SerializersModule;
import kotlinx.serialization.modules.SerializersModuleKt;

@Metadata(d1 = {"\u0000^\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010$\n\u0002\u0010\u000e\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0001\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u0000\n\u0000\b\u0000\u0018\u00002\u00020\u0001B'\b\u0016\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0016\u0010\u0004\u001a\u0012\u0012\u0004\u0012\u00020\u0006\u0012\b\u0012\u0006\u0012\u0002\b\u00030\u00070\u0005¢\u0006\u0002\u0010\bB'\b\u0016\u0012\u0006\u0010\t\u001a\u00020\n\u0012\u0016\u0010\u0004\u001a\u0012\u0012\u0004\u0012\u00020\u0006\u0012\b\u0012\u0006\u0012\u0002\b\u00030\u00070\u0005¢\u0006\u0002\u0010\u000bJ\u0010\u0010\u0014\u001a\u00020\u00152\u0006\u0010\u0016\u001a\u00020\u0017H\u0016J\b\u0010\u0018\u001a\u00020\u0019H\u0016J\n\u0010\u001a\u001a\u0004\u0018\u00010\u001bH\u0016J#\u0010\u001c\u001a\u0002H\u001d\"\u0004\b\u0000\u0010\u001d2\f\u0010\u001e\u001a\b\u0012\u0004\u0012\u0002H\u001d0\u001fH\u0000¢\u0006\u0004\b \u0010!J!\u0010\"\u001a\u0002H\u001d\"\u0004\b\u0000\u0010\u001d2\f\u0010\u001e\u001a\b\u0012\u0004\u0012\u0002H\u001d0\u001fH\u0016¢\u0006\u0002\u0010!J\b\u0010#\u001a\u00020$H\u0016R\u000e\u0010\f\u001a\u00020\rX\u0004¢\u0006\u0002\n\u0000R\u001a\u0010\u000e\u001a\u00020\u000fX\u0004¢\u0006\u000e\n\u0000\u0012\u0004\b\u0010\u0010\u0011\u001a\u0004\b\u0012\u0010\u0013¨\u0006%"}, d2 = {"Landroidx/navigation/serialization/RouteDecoder;", "Lkotlinx/serialization/encoding/AbstractDecoder;", "bundle", "Landroid/os/Bundle;", "typeMap", "", "", "Landroidx/navigation/NavType;", "(Landroid/os/Bundle;Ljava/util/Map;)V", "handle", "Landroidx/lifecycle/SavedStateHandle;", "(Landroidx/lifecycle/SavedStateHandle;Ljava/util/Map;)V", "decoder", "Landroidx/navigation/serialization/Decoder;", "serializersModule", "Lkotlinx/serialization/modules/SerializersModule;", "getSerializersModule$annotations", "()V", "getSerializersModule", "()Lkotlinx/serialization/modules/SerializersModule;", "decodeElementIndex", "", "descriptor", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "decodeNotNullMark", "", "decodeNull", "", "decodeRouteWithArgs", "T", "deserializer", "Lkotlinx/serialization/DeserializationStrategy;", "decodeRouteWithArgs$navigation_common_release", "(Lkotlinx/serialization/DeserializationStrategy;)Ljava/lang/Object;", "decodeSerializableValue", "decodeValue", "", "navigation-common_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* compiled from: RouteDecoder.kt */
public final class RouteDecoder extends AbstractDecoder {
    private final Decoder decoder;
    private final SerializersModule serializersModule = SerializersModuleKt.getEmptySerializersModule();

    public static /* synthetic */ void getSerializersModule$annotations() {
    }

    public RouteDecoder(Bundle bundle, Map<String, ? extends NavType<?>> typeMap) {
        Intrinsics.checkNotNullParameter(bundle, "bundle");
        Intrinsics.checkNotNullParameter(typeMap, "typeMap");
        this.decoder = new Decoder(new BundleArgStore(bundle, typeMap));
    }

    public RouteDecoder(SavedStateHandle handle, Map<String, ? extends NavType<?>> typeMap) {
        Intrinsics.checkNotNullParameter(handle, "handle");
        Intrinsics.checkNotNullParameter(typeMap, "typeMap");
        this.decoder = new Decoder(new SavedStateArgStore(handle, typeMap));
    }

    public SerializersModule getSerializersModule() {
        return this.serializersModule;
    }

    public int decodeElementIndex(SerialDescriptor descriptor) {
        Intrinsics.checkNotNullParameter(descriptor, "descriptor");
        return this.decoder.computeNextElementIndex(descriptor);
    }

    public Object decodeValue() {
        return this.decoder.decodeValue();
    }

    public Void decodeNull() {
        return null;
    }

    public boolean decodeNotNullMark() {
        return !this.decoder.isCurrentElementNull();
    }

    public final <T> T decodeRouteWithArgs$navigation_common_release(DeserializationStrategy<? extends T> deserializer) {
        Intrinsics.checkNotNullParameter(deserializer, "deserializer");
        return super.decodeSerializableValue(deserializer);
    }

    public <T> T decodeSerializableValue(DeserializationStrategy<? extends T> deserializer) {
        Intrinsics.checkNotNullParameter(deserializer, "deserializer");
        return this.decoder.decodeValue();
    }
}
