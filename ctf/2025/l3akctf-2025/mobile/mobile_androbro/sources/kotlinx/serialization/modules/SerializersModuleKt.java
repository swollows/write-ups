package kotlinx.serialization.modules;

import kotlin.Deprecated;
import kotlin.DeprecationLevel;
import kotlin.Metadata;
import kotlin.ReplaceWith;
import kotlin.collections.MapsKt;
import kotlin.jvm.internal.Intrinsics;

@Metadata(d1 = {"\u0000(\n\u0000\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\u001a\u0015\u0010\u0006\u001a\u00020\u0001*\u00020\u00012\u0006\u0010\u0007\u001a\u00020\u0001H\u0004\u001a\u0015\u0010\b\u001a\u00020\u0001*\u00020\u00012\u0006\u0010\u0007\u001a\u00020\u0001H\u0002\"\u001c\u0010\u0000\u001a\u00020\u00018\u0006X\u0004¢\u0006\u000e\n\u0000\u0012\u0004\b\u0002\u0010\u0003\u001a\u0004\b\u0004\u0010\u0005*\\\b\u0000\u0010\t\u001a\u0004\b\u0000\u0010\n\"'\u0012\u0015\u0012\u0013\u0018\u00010\f¢\u0006\f\b\r\u0012\b\b\u000e\u0012\u0004\b\b(\u000f\u0012\f\u0012\n\u0012\u0004\u0012\u0002H\n\u0018\u00010\u00100\u000b2'\u0012\u0015\u0012\u0013\u0018\u00010\f¢\u0006\f\b\r\u0012\b\b\u000e\u0012\u0004\b\b(\u000f\u0012\f\u0012\n\u0012\u0004\u0012\u0002H\n\u0018\u00010\u00100\u000b*X\b\u0000\u0010\u0011\u001a\u0004\b\u0000\u0010\n\"%\u0012\u0013\u0012\u0011H\n¢\u0006\f\b\r\u0012\b\b\u000e\u0012\u0004\b\b(\u0012\u0012\f\u0012\n\u0012\u0004\u0012\u0002H\n\u0018\u00010\u00130\u000b2%\u0012\u0013\u0012\u0011H\n¢\u0006\f\b\r\u0012\b\b\u000e\u0012\u0004\b\b(\u0012\u0012\f\u0012\n\u0012\u0004\u0012\u0002H\n\u0018\u00010\u00130\u000b¨\u0006\u0014"}, d2 = {"EmptySerializersModule", "Lkotlinx/serialization/modules/SerializersModule;", "getEmptySerializersModule$annotations", "()V", "getEmptySerializersModule", "()Lkotlinx/serialization/modules/SerializersModule;", "overwriteWith", "other", "plus", "PolymorphicDeserializerProvider", "Base", "Lkotlin/Function1;", "", "Lkotlin/ParameterName;", "name", "className", "Lkotlinx/serialization/DeserializationStrategy;", "PolymorphicSerializerProvider", "value", "Lkotlinx/serialization/SerializationStrategy;", "kotlinx-serialization-core"}, k = 2, mv = {1, 9, 0}, xi = 48)
/* compiled from: SerializersModule.kt */
public final class SerializersModuleKt {
    private static final SerializersModule EmptySerializersModule = new SerialModuleImpl(MapsKt.emptyMap(), MapsKt.emptyMap(), MapsKt.emptyMap(), MapsKt.emptyMap(), MapsKt.emptyMap());

    @Deprecated(level = DeprecationLevel.WARNING, message = "Deprecated in the favour of 'EmptySerializersModule()'", replaceWith = @ReplaceWith(expression = "EmptySerializersModule()", imports = {}))
    public static /* synthetic */ void getEmptySerializersModule$annotations() {
    }

    public static final SerializersModule getEmptySerializersModule() {
        return EmptySerializersModule;
    }

    public static final SerializersModule plus(SerializersModule $this$plus, SerializersModule other) {
        Intrinsics.checkNotNullParameter($this$plus, "<this>");
        Intrinsics.checkNotNullParameter(other, "other");
        SerializersModuleBuilder builder$iv = new SerializersModuleBuilder();
        SerializersModuleBuilder $this$plus_u24lambda_u240 = builder$iv;
        $this$plus_u24lambda_u240.include($this$plus);
        $this$plus_u24lambda_u240.include(other);
        return builder$iv.build();
    }

    public static final SerializersModule overwriteWith(SerializersModule $this$overwriteWith, SerializersModule other) {
        Intrinsics.checkNotNullParameter($this$overwriteWith, "<this>");
        Intrinsics.checkNotNullParameter(other, "other");
        SerializersModuleBuilder builder$iv = new SerializersModuleBuilder();
        SerializersModuleBuilder $this$overwriteWith_u24lambda_u241 = builder$iv;
        $this$overwriteWith_u24lambda_u241.include($this$overwriteWith);
        other.dumpTo(new SerializersModuleKt$overwriteWith$1$1($this$overwriteWith_u24lambda_u241));
        return builder$iv.build();
    }
}
