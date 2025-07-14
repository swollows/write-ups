package androidx.lifecycle;

import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.JvmStatic;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt;

@Metadata(d1 = {"\u0000D\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010%\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\bÇ\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J \u0010\r\u001a\u00020\f2\u000e\u0010\u000e\u001a\n\u0012\u0006\b\u0001\u0012\u00020\f0\u000b2\u0006\u0010\u000f\u001a\u00020\u0001H\u0002J\u001e\u0010\u0010\u001a\f\u0012\u0006\b\u0001\u0012\u00020\f\u0018\u00010\u000b2\n\u0010\u0011\u001a\u0006\u0012\u0002\b\u00030\bH\u0002J\u0010\u0010\u0012\u001a\u00020\u00132\u0006\u0010\u0014\u001a\u00020\u0013H\u0007J\u0014\u0010\u0015\u001a\u00020\u00042\n\u0010\u0011\u001a\u0006\u0012\u0002\b\u00030\bH\u0002J\u0016\u0010\u0016\u001a\u00020\u00172\f\u0010\u0011\u001a\b\u0012\u0002\b\u0003\u0018\u00010\bH\u0002J\u0010\u0010\u0018\u001a\u00020\u00192\u0006\u0010\u000f\u001a\u00020\u0001H\u0007J\u0014\u0010\u001a\u001a\u00020\u00042\n\u0010\u0011\u001a\u0006\u0012\u0002\b\u00030\bH\u0002R\u000e\u0010\u0003\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000R\u001e\u0010\u0006\u001a\u0012\u0012\b\u0012\u0006\u0012\u0002\b\u00030\b\u0012\u0004\u0012\u00020\u00040\u0007X\u0004¢\u0006\u0002\n\u0000R,\u0010\t\u001a \u0012\b\u0012\u0006\u0012\u0002\b\u00030\b\u0012\u0012\u0012\u0010\u0012\f\u0012\n\u0012\u0006\b\u0001\u0012\u00020\f0\u000b0\n0\u0007X\u0004¢\u0006\u0002\n\u0000¨\u0006\u001b"}, d2 = {"Landroidx/lifecycle/Lifecycling;", "", "()V", "GENERATED_CALLBACK", "", "REFLECTIVE_CALLBACK", "callbackCache", "", "Ljava/lang/Class;", "classToAdapters", "", "Ljava/lang/reflect/Constructor;", "Landroidx/lifecycle/GeneratedAdapter;", "createGeneratedAdapter", "constructor", "object", "generatedConstructor", "klass", "getAdapterName", "", "className", "getObserverConstructorType", "isLifecycleParent", "", "lifecycleEventObserver", "Landroidx/lifecycle/LifecycleEventObserver;", "resolveObserverCallbackType", "lifecycle-common"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* compiled from: Lifecycling.kt */
public final class Lifecycling {
    private static final int GENERATED_CALLBACK = 2;
    public static final Lifecycling INSTANCE = new Lifecycling();
    private static final int REFLECTIVE_CALLBACK = 1;
    private static final Map<Class<?>, Integer> callbackCache = new HashMap();
    private static final Map<Class<?>, List<Constructor<? extends GeneratedAdapter>>> classToAdapters = new HashMap();

    private Lifecycling() {
    }

    @JvmStatic
    public static final LifecycleEventObserver lifecycleEventObserver(Object object) {
        Intrinsics.checkNotNullParameter(object, "object");
        boolean isLifecycleEventObserver = object instanceof LifecycleEventObserver;
        boolean isDefaultLifecycleObserver = object instanceof DefaultLifecycleObserver;
        if (isLifecycleEventObserver && isDefaultLifecycleObserver) {
            return new DefaultLifecycleObserverAdapter((DefaultLifecycleObserver) object, (LifecycleEventObserver) object);
        }
        if (isDefaultLifecycleObserver) {
            return new DefaultLifecycleObserverAdapter((DefaultLifecycleObserver) object, (LifecycleEventObserver) null);
        }
        if (isLifecycleEventObserver) {
            return (LifecycleEventObserver) object;
        }
        Class klass = object.getClass();
        if (INSTANCE.getObserverConstructorType(klass) != 2) {
            return new ReflectiveGenericLifecycleObserver(object);
        }
        List<Constructor<? extends GeneratedAdapter>> list = classToAdapters.get(klass);
        Intrinsics.checkNotNull(list);
        List constructors = list;
        if (constructors.size() == 1) {
            return new SingleGeneratedAdapterObserver(INSTANCE.createGeneratedAdapter((Constructor) constructors.get(0), object));
        }
        int size = constructors.size();
        GeneratedAdapter[] adapters = new GeneratedAdapter[size];
        for (int i = 0; i < size; i++) {
            adapters[i] = INSTANCE.createGeneratedAdapter((Constructor) constructors.get(i), object);
        }
        return new CompositeGeneratedAdaptersObserver(adapters);
    }

    private final GeneratedAdapter createGeneratedAdapter(Constructor<? extends GeneratedAdapter> constructor, Object object) {
        try {
            Object newInstance = constructor.newInstance(new Object[]{object});
            Intrinsics.checkNotNullExpressionValue(newInstance, "{\n            constructo…tance(`object`)\n        }");
            return (GeneratedAdapter) newInstance;
        } catch (IllegalAccessException e) {
            throw new RuntimeException(e);
        } catch (InstantiationException e2) {
            throw new RuntimeException(e2);
        } catch (InvocationTargetException e3) {
            throw new RuntimeException(e3);
        }
    }

    private final Constructor<? extends GeneratedAdapter> generatedConstructor(Class<?> klass) {
        String str;
        try {
            Package aPackage = klass.getPackage();
            String name = klass.getCanonicalName();
            String fullPackage = aPackage != null ? aPackage.getName() : "";
            Intrinsics.checkNotNullExpressionValue(fullPackage, "fullPackage");
            if (fullPackage.length() == 0) {
                str = name;
            } else {
                Intrinsics.checkNotNullExpressionValue(name, "name");
                str = name.substring(fullPackage.length() + 1);
                Intrinsics.checkNotNullExpressionValue(str, "this as java.lang.String).substring(startIndex)");
            }
            Intrinsics.checkNotNullExpressionValue(str, "if (fullPackage.isEmpty(…g(fullPackage.length + 1)");
            String adapterName = getAdapterName(str);
            Class aClass = Class.forName(fullPackage.length() == 0 ? adapterName : fullPackage + '.' + adapterName);
            Intrinsics.checkNotNull(aClass, "null cannot be cast to non-null type java.lang.Class<out androidx.lifecycle.GeneratedAdapter>");
            Constructor constructor = aClass.getDeclaredConstructor(new Class[]{klass});
            if (constructor.isAccessible()) {
                return constructor;
            }
            constructor.setAccessible(true);
            return constructor;
        } catch (ClassNotFoundException e) {
            return null;
        } catch (NoSuchMethodException e2) {
            throw new RuntimeException(e2);
        }
    }

    private final int getObserverConstructorType(Class<?> klass) {
        Integer callbackCache2 = callbackCache.get(klass);
        if (callbackCache2 != null) {
            return callbackCache2.intValue();
        }
        int type = resolveObserverCallbackType(klass);
        callbackCache.put(klass, Integer.valueOf(type));
        return type;
    }

    private final int resolveObserverCallbackType(Class<?> klass) {
        if (klass.getCanonicalName() == null) {
            return 1;
        }
        Constructor constructor = generatedConstructor(klass);
        if (constructor != null) {
            classToAdapters.put(klass, CollectionsKt.listOf(constructor));
            return 2;
        } else if (ClassesInfoCache.sInstance.hasLifecycleMethods(klass)) {
            return 1;
        } else {
            Class superclass = klass.getSuperclass();
            List adapterConstructors = null;
            if (isLifecycleParent(superclass)) {
                Intrinsics.checkNotNullExpressionValue(superclass, "superclass");
                if (getObserverConstructorType(superclass) == 1) {
                    return 1;
                }
                List<Constructor<? extends GeneratedAdapter>> list = classToAdapters.get(superclass);
                Intrinsics.checkNotNull(list);
                adapterConstructors = new ArrayList(list);
            }
            Class[] interfaces = klass.getInterfaces();
            Intrinsics.checkNotNullExpressionValue(interfaces, "klass.interfaces");
            for (Class intrface : interfaces) {
                if (isLifecycleParent(intrface)) {
                    Intrinsics.checkNotNullExpressionValue(intrface, "intrface");
                    if (getObserverConstructorType(intrface) == 1) {
                        return 1;
                    }
                    if (adapterConstructors == null) {
                        adapterConstructors = new ArrayList();
                    }
                    List<Constructor<? extends GeneratedAdapter>> list2 = classToAdapters.get(intrface);
                    Intrinsics.checkNotNull(list2);
                    adapterConstructors.addAll(list2);
                }
            }
            if (adapterConstructors == null) {
                return 1;
            }
            classToAdapters.put(klass, adapterConstructors);
            return 2;
        }
    }

    private final boolean isLifecycleParent(Class<?> klass) {
        return klass != null && LifecycleObserver.class.isAssignableFrom(klass);
    }

    @JvmStatic
    public static final String getAdapterName(String className) {
        Intrinsics.checkNotNullParameter(className, "className");
        return StringsKt.replace$default(className, ".", "_", false, 4, (Object) null) + "_LifecycleAdapter";
    }
}
