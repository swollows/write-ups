package kotlinx.serialization.modules;

import java.util.List;
import java.util.Map;
import kotlin.Metadata;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Reflection;
import kotlin.jvm.internal.TypeIntrinsics;
import kotlin.reflect.KClass;
import kotlinx.serialization.DeserializationStrategy;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.SerializationStrategy;
import kotlinx.serialization.modules.ContextualProvider;

@Metadata(d1 = {"\u0000d\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\b\u0006\b\u0000\u0018\u00002\u00020\u0001Bä\u0001\u0012\u0016\u0010\u0002\u001a\u0012\u0012\b\u0012\u0006\u0012\u0002\b\u00030\u0004\u0012\u0004\u0012\u00020\u00050\u0003\u0012*\u0010\u0006\u001a&\u0012\b\u0012\u0006\u0012\u0002\b\u00030\u0004\u0012\u0018\u0012\u0016\u0012\b\u0012\u0006\u0012\u0002\b\u00030\u0004\u0012\b\u0012\u0006\u0012\u0002\b\u00030\u00070\u00030\u0003\u0012.\u0010\b\u001a*\u0012\b\u0012\u0006\u0012\u0002\b\u00030\u0004\u0012\u001c\u0012\u001a\u0012\u0002\b\u0003\u0012\n\u0012\b\u0012\u0002\b\u0003\u0018\u00010\n0\tj\u0006\u0012\u0002\b\u0003`\u000b0\u0003\u0012&\u0010\f\u001a\"\u0012\b\u0012\u0006\u0012\u0002\b\u00030\u0004\u0012\u0014\u0012\u0012\u0012\u0004\u0012\u00020\r\u0012\b\u0012\u0006\u0012\u0002\b\u00030\u00070\u00030\u0003\u0012A\u0010\u000e\u001a=\u0012\b\u0012\u0006\u0012\u0002\b\u00030\u0004\u0012/\u0012-\u0012\u0015\u0012\u0013\u0018\u00010\r¢\u0006\f\b\u000f\u0012\b\b\u0010\u0012\u0004\b\b(\u0011\u0012\n\u0012\b\u0012\u0002\b\u0003\u0018\u00010\u00120\tj\u0006\u0012\u0002\b\u0003`\u00130\u0003¢\u0006\u0002\u0010\u0014J\u0010\u0010\u0015\u001a\u00020\u00162\u0006\u0010\u0017\u001a\u00020\u0018H\u0016J:\u0010\u0019\u001a\n\u0012\u0004\u0012\u0002H\u001a\u0018\u00010\u0007\"\b\b\u0000\u0010\u001a*\u00020\u001b2\f\u0010\u001c\u001a\b\u0012\u0004\u0012\u0002H\u001a0\u00042\u0010\u0010\u001d\u001a\f\u0012\b\u0012\u0006\u0012\u0002\b\u00030\u00070\u001eH\u0016J7\u0010\u001f\u001a\n\u0012\u0004\u0012\u0002H\u001a\u0018\u00010\n\"\b\b\u0000\u0010\u001a*\u00020\u001b2\u000e\u0010 \u001a\n\u0012\u0006\b\u0000\u0012\u0002H\u001a0\u00042\u0006\u0010!\u001a\u0002H\u001aH\u0016¢\u0006\u0002\u0010\"J4\u0010\u001f\u001a\n\u0012\u0004\u0012\u0002H\u001a\u0018\u00010\u0012\"\b\b\u0000\u0010\u001a*\u00020\u001b2\u000e\u0010 \u001a\n\u0012\u0006\b\u0000\u0012\u0002H\u001a0\u00042\b\u0010#\u001a\u0004\u0018\u00010\rH\u0016R\u001e\u0010\u0002\u001a\u0012\u0012\b\u0012\u0006\u0012\u0002\b\u00030\u0004\u0012\u0004\u0012\u00020\u00050\u0003X\u0004¢\u0006\u0002\n\u0000RI\u0010\u000e\u001a=\u0012\b\u0012\u0006\u0012\u0002\b\u00030\u0004\u0012/\u0012-\u0012\u0015\u0012\u0013\u0018\u00010\r¢\u0006\f\b\u000f\u0012\b\b\u0010\u0012\u0004\b\b(\u0011\u0012\n\u0012\b\u0012\u0002\b\u0003\u0018\u00010\u00120\tj\u0006\u0012\u0002\b\u0003`\u00130\u0003X\u0004¢\u0006\u0002\n\u0000R6\u0010\b\u001a*\u0012\b\u0012\u0006\u0012\u0002\b\u00030\u0004\u0012\u001c\u0012\u001a\u0012\u0002\b\u0003\u0012\n\u0012\b\u0012\u0002\b\u0003\u0018\u00010\n0\tj\u0006\u0012\u0002\b\u0003`\u000b0\u0003X\u0004¢\u0006\u0002\n\u0000R.\u0010\f\u001a\"\u0012\b\u0012\u0006\u0012\u0002\b\u00030\u0004\u0012\u0014\u0012\u0012\u0012\u0004\u0012\u00020\r\u0012\b\u0012\u0006\u0012\u0002\b\u00030\u00070\u00030\u0003X\u0004¢\u0006\u0002\n\u0000R4\u0010\u0006\u001a&\u0012\b\u0012\u0006\u0012\u0002\b\u00030\u0004\u0012\u0018\u0012\u0016\u0012\b\u0012\u0006\u0012\u0002\b\u00030\u0004\u0012\b\u0012\u0006\u0012\u0002\b\u00030\u00070\u00030\u00038\u0006X\u0004¢\u0006\u0002\n\u0000¨\u0006$"}, d2 = {"Lkotlinx/serialization/modules/SerialModuleImpl;", "Lkotlinx/serialization/modules/SerializersModule;", "class2ContextualFactory", "", "Lkotlin/reflect/KClass;", "Lkotlinx/serialization/modules/ContextualProvider;", "polyBase2Serializers", "Lkotlinx/serialization/KSerializer;", "polyBase2DefaultSerializerProvider", "Lkotlin/Function1;", "Lkotlinx/serialization/SerializationStrategy;", "Lkotlinx/serialization/modules/PolymorphicSerializerProvider;", "polyBase2NamedSerializers", "", "polyBase2DefaultDeserializerProvider", "Lkotlin/ParameterName;", "name", "className", "Lkotlinx/serialization/DeserializationStrategy;", "Lkotlinx/serialization/modules/PolymorphicDeserializerProvider;", "(Ljava/util/Map;Ljava/util/Map;Ljava/util/Map;Ljava/util/Map;Ljava/util/Map;)V", "dumpTo", "", "collector", "Lkotlinx/serialization/modules/SerializersModuleCollector;", "getContextual", "T", "", "kClass", "typeArgumentsSerializers", "", "getPolymorphic", "baseClass", "value", "(Lkotlin/reflect/KClass;Ljava/lang/Object;)Lkotlinx/serialization/SerializationStrategy;", "serializedClassName", "kotlinx-serialization-core"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* compiled from: SerializersModule.kt */
public final class SerialModuleImpl extends SerializersModule {
    private final Map<KClass<?>, ContextualProvider> class2ContextualFactory;
    private final Map<KClass<?>, Function1<String, DeserializationStrategy<?>>> polyBase2DefaultDeserializerProvider;
    private final Map<KClass<?>, Function1<?, SerializationStrategy<?>>> polyBase2DefaultSerializerProvider;
    private final Map<KClass<?>, Map<String, KSerializer<?>>> polyBase2NamedSerializers;
    public final Map<KClass<?>, Map<KClass<?>, KSerializer<?>>> polyBase2Serializers;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public SerialModuleImpl(Map<KClass<?>, ? extends ContextualProvider> class2ContextualFactory2, Map<KClass<?>, ? extends Map<KClass<?>, ? extends KSerializer<?>>> polyBase2Serializers2, Map<KClass<?>, ? extends Function1<?, ? extends SerializationStrategy<?>>> polyBase2DefaultSerializerProvider2, Map<KClass<?>, ? extends Map<String, ? extends KSerializer<?>>> polyBase2NamedSerializers2, Map<KClass<?>, ? extends Function1<? super String, ? extends DeserializationStrategy<?>>> polyBase2DefaultDeserializerProvider2) {
        super((DefaultConstructorMarker) null);
        Intrinsics.checkNotNullParameter(class2ContextualFactory2, "class2ContextualFactory");
        Intrinsics.checkNotNullParameter(polyBase2Serializers2, "polyBase2Serializers");
        Intrinsics.checkNotNullParameter(polyBase2DefaultSerializerProvider2, "polyBase2DefaultSerializerProvider");
        Intrinsics.checkNotNullParameter(polyBase2NamedSerializers2, "polyBase2NamedSerializers");
        Intrinsics.checkNotNullParameter(polyBase2DefaultDeserializerProvider2, "polyBase2DefaultDeserializerProvider");
        this.class2ContextualFactory = class2ContextualFactory2;
        this.polyBase2Serializers = polyBase2Serializers2;
        this.polyBase2DefaultSerializerProvider = polyBase2DefaultSerializerProvider2;
        this.polyBase2NamedSerializers = polyBase2NamedSerializers2;
        this.polyBase2DefaultDeserializerProvider = polyBase2DefaultDeserializerProvider2;
    }

    public <T> SerializationStrategy<T> getPolymorphic(KClass<? super T> baseClass, T value) {
        Intrinsics.checkNotNullParameter(baseClass, "baseClass");
        Intrinsics.checkNotNullParameter(value, "value");
        if (!baseClass.isInstance(value)) {
            return null;
        }
        Map map = this.polyBase2Serializers.get(baseClass);
        SerializationStrategy serializationStrategy = map != null ? (KSerializer) map.get(Reflection.getOrCreateKotlinClass(value.getClass())) : null;
        SerializationStrategy registered = serializationStrategy instanceof SerializationStrategy ? serializationStrategy : null;
        if (registered != null) {
            return registered;
        }
        Function1<?, SerializationStrategy<?>> function1 = this.polyBase2DefaultSerializerProvider.get(baseClass);
        Function1 function12 = TypeIntrinsics.isFunctionOfArity(function1, 1) ? function1 : null;
        if (function12 != null) {
            return (SerializationStrategy) function12.invoke(value);
        }
        return null;
    }

    public <T> DeserializationStrategy<T> getPolymorphic(KClass<? super T> baseClass, String serializedClassName) {
        Intrinsics.checkNotNullParameter(baseClass, "baseClass");
        Map map = this.polyBase2NamedSerializers.get(baseClass);
        KSerializer registered = map != null ? (KSerializer) map.get(serializedClassName) : null;
        if (!(registered instanceof KSerializer)) {
            registered = null;
        }
        if (registered != null) {
            return registered;
        }
        Function1<String, DeserializationStrategy<?>> function1 = this.polyBase2DefaultDeserializerProvider.get(baseClass);
        Function1 function12 = TypeIntrinsics.isFunctionOfArity(function1, 1) ? function1 : null;
        if (function12 != null) {
            return (DeserializationStrategy) function12.invoke(serializedClassName);
        }
        return null;
    }

    public <T> KSerializer<T> getContextual(KClass<T> kClass, List<? extends KSerializer<?>> typeArgumentsSerializers) {
        Intrinsics.checkNotNullParameter(kClass, "kClass");
        Intrinsics.checkNotNullParameter(typeArgumentsSerializers, "typeArgumentsSerializers");
        ContextualProvider contextualProvider = this.class2ContextualFactory.get(kClass);
        KSerializer<?> invoke = contextualProvider != null ? contextualProvider.invoke(typeArgumentsSerializers) : null;
        if (invoke instanceof KSerializer) {
            return invoke;
        }
        return null;
    }

    public void dumpTo(SerializersModuleCollector collector) {
        SerializersModuleCollector serializersModuleCollector = collector;
        Intrinsics.checkNotNullParameter(serializersModuleCollector, "collector");
        for (Map.Entry element$iv : this.class2ContextualFactory.entrySet()) {
            KClass kclass = (KClass) element$iv.getKey();
            ContextualProvider serial = (ContextualProvider) element$iv.getValue();
            if (serial instanceof ContextualProvider.Argless) {
                Intrinsics.checkNotNull(kclass, "null cannot be cast to non-null type kotlin.reflect.KClass<kotlin.Any>");
                KSerializer<?> serializer = ((ContextualProvider.Argless) serial).getSerializer();
                Intrinsics.checkNotNull(serializer, "null cannot be cast to non-null type kotlinx.serialization.KSerializer<kotlin.Any>");
                serializersModuleCollector.contextual(kclass, serializer);
            } else if (serial instanceof ContextualProvider.WithTypeArguments) {
                serializersModuleCollector.contextual(kclass, (Function1<? super List<? extends KSerializer<?>>, ? extends KSerializer<?>>) ((ContextualProvider.WithTypeArguments) serial).getProvider());
            }
        }
        Map $this$forEach$iv = this.polyBase2Serializers;
        int $i$f$forEach = false;
        for (Map.Entry element$iv2 : $this$forEach$iv.entrySet()) {
            KClass baseClass = (KClass) element$iv2.getKey();
            for (Map.Entry element$iv3 : ((Map) element$iv2.getValue()).entrySet()) {
                KClass actualClass = (KClass) element$iv3.getKey();
                Intrinsics.checkNotNull(baseClass, "null cannot be cast to non-null type kotlin.reflect.KClass<kotlin.Any>");
                Intrinsics.checkNotNull(actualClass, "null cannot be cast to non-null type kotlin.reflect.KClass<kotlin.Any>");
                int $i$f$forEach2 = $i$f$forEach;
                KSerializer $this$cast$iv = (KSerializer) element$iv3.getValue();
                Intrinsics.checkNotNull($this$cast$iv, "null cannot be cast to non-null type kotlinx.serialization.KSerializer<T of kotlinx.serialization.internal.Platform_commonKt.cast>");
                serializersModuleCollector.polymorphic(baseClass, actualClass, $this$cast$iv);
                $this$forEach$iv = $this$forEach$iv;
                $i$f$forEach = $i$f$forEach2;
            }
            int i = $i$f$forEach;
        }
        int i2 = $i$f$forEach;
        for (Map.Entry element$iv4 : this.polyBase2DefaultSerializerProvider.entrySet()) {
            KClass baseClass2 = (KClass) element$iv4.getKey();
            Function1 provider = (Function1) element$iv4.getValue();
            Intrinsics.checkNotNull(baseClass2, "null cannot be cast to non-null type kotlin.reflect.KClass<kotlin.Any>");
            Intrinsics.checkNotNull(provider, "null cannot be cast to non-null type kotlin.Function1<@[ParameterName(name = 'value')] kotlin.Any, kotlinx.serialization.SerializationStrategy<kotlin.Any>?>{ kotlinx.serialization.modules.SerializersModuleKt.PolymorphicSerializerProvider<kotlin.Any> }");
            serializersModuleCollector.polymorphicDefaultSerializer(baseClass2, (Function1) TypeIntrinsics.beforeCheckcastToFunctionOfArity(provider, 1));
        }
        for (Map.Entry element$iv5 : this.polyBase2DefaultDeserializerProvider.entrySet()) {
            KClass baseClass3 = (KClass) element$iv5.getKey();
            Function1 provider2 = (Function1) element$iv5.getValue();
            Intrinsics.checkNotNull(baseClass3, "null cannot be cast to non-null type kotlin.reflect.KClass<kotlin.Any>");
            Intrinsics.checkNotNull(provider2, "null cannot be cast to non-null type kotlin.Function1<@[ParameterName(name = 'className')] kotlin.String?, kotlinx.serialization.DeserializationStrategy<out kotlin.Any>?>{ kotlinx.serialization.modules.SerializersModuleKt.PolymorphicDeserializerProvider<out kotlin.Any> }");
            serializersModuleCollector.polymorphicDefaultDeserializer(baseClass3, (Function1) TypeIntrinsics.beforeCheckcastToFunctionOfArity(provider2, 1));
        }
    }
}
