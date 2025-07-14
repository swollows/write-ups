package androidx.navigation.serialization;

import androidx.navigation.CollectionNavType;
import androidx.navigation.NavType;
import java.util.List;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.serialization.KSerializer;

@Metadata(d1 = {"\u0000>\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0010\u0002\n\u0002\b\u0005\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0000\u0018\u0000*\u0004\b\u0000\u0010\u00012\u00020\u0002:\u0001\u001aB\u0015\b\u0016\u0012\f\u0010\u0003\u001a\b\u0012\u0004\u0012\u00028\u00000\u0004¢\u0006\u0002\u0010\u0005B\u001d\b\u0016\u0012\u0006\u0010\u0006\u001a\u00020\u0007\u0012\f\u0010\u0003\u001a\b\u0012\u0004\u0012\u00028\u00000\u0004¢\u0006\u0002\u0010\bJ\u0010\u0010\u000b\u001a\u00020\f2\u0006\u0010\u0006\u001a\u00020\u0007H\u0002J\u0018\u0010\r\u001a\u00020\f2\u0006\u0010\u000e\u001a\u00020\u00072\u0006\u0010\u000f\u001a\u00020\u0007H\u0002J4\u0010\u0010\u001a\u00020\f2\u0006\u0010\u0011\u001a\u00020\u00122\u0006\u0010\u000e\u001a\u00020\u00072\u000e\u0010\u0013\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00020\u00142\f\u0010\u000f\u001a\b\u0012\u0004\u0012\u00020\u00070\u0015J&\u0010\u0016\u001a\u00020\f2\u0006\u0010\u0011\u001a\u00020\u00122\u0006\u0010\u000e\u001a\u00020\u00072\u000e\u0010\u0013\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00020\u0014J\u0006\u0010\u0017\u001a\u00020\u0007J \u0010\u0018\u001a\u00020\u00192\u0006\u0010\u0011\u001a\u00020\u00122\u000e\u0010\u0013\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00020\u0014H\u0002R\u000e\u0010\u0006\u001a\u00020\u0007X\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\t\u001a\u00020\u0007X\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\n\u001a\u00020\u0007X\u000e¢\u0006\u0002\n\u0000R\u0014\u0010\u0003\u001a\b\u0012\u0004\u0012\u00028\u00000\u0004X\u0004¢\u0006\u0002\n\u0000¨\u0006\u001b"}, d2 = {"Landroidx/navigation/serialization/RouteBuilder;", "T", "", "serializer", "Lkotlinx/serialization/KSerializer;", "(Lkotlinx/serialization/KSerializer;)V", "path", "", "(Ljava/lang/String;Lkotlinx/serialization/KSerializer;)V", "pathArgs", "queryArgs", "addPath", "", "addQuery", "name", "value", "appendArg", "index", "", "type", "Landroidx/navigation/NavType;", "", "appendPattern", "build", "computeParamType", "Landroidx/navigation/serialization/RouteBuilder$ParamType;", "ParamType", "navigation-common_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* compiled from: RouteBuilder.kt */
public final class RouteBuilder<T> {
    private final String path;
    private String pathArgs = "";
    private String queryArgs = "";
    private final KSerializer<T> serializer;

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0004\b\u0001\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002j\u0002\b\u0003j\u0002\b\u0004¨\u0006\u0005"}, d2 = {"Landroidx/navigation/serialization/RouteBuilder$ParamType;", "", "(Ljava/lang/String;I)V", "PATH", "QUERY", "navigation-common_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
    /* compiled from: RouteBuilder.kt */
    private enum ParamType {
        PATH,
        QUERY
    }

    @Metadata(k = 3, mv = {1, 8, 0}, xi = 48)
    /* compiled from: RouteBuilder.kt */
    public /* synthetic */ class WhenMappings {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[ParamType.values().length];
            try {
                iArr[ParamType.PATH.ordinal()] = 1;
            } catch (NoSuchFieldError e) {
            }
            try {
                iArr[ParamType.QUERY.ordinal()] = 2;
            } catch (NoSuchFieldError e2) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }

    public RouteBuilder(KSerializer<T> serializer2) {
        Intrinsics.checkNotNullParameter(serializer2, "serializer");
        this.serializer = serializer2;
        this.path = serializer2.getDescriptor().getSerialName();
    }

    public RouteBuilder(String path2, KSerializer<T> serializer2) {
        Intrinsics.checkNotNullParameter(path2, "path");
        Intrinsics.checkNotNullParameter(serializer2, "serializer");
        this.serializer = serializer2;
        this.path = path2;
    }

    public final String build() {
        return this.path + this.pathArgs + this.queryArgs;
    }

    private final void addPath(String path2) {
        this.pathArgs += '/' + path2;
    }

    private final void addQuery(String name, String value) {
        this.queryArgs += (this.queryArgs.length() == 0 ? "?" : "&") + name + '=' + value;
    }

    public final void appendPattern(int index, String name, NavType<Object> type) {
        Intrinsics.checkNotNullParameter(name, "name");
        Intrinsics.checkNotNullParameter(type, "type");
        switch (WhenMappings.$EnumSwitchMapping$0[computeParamType(index, type).ordinal()]) {
            case 1:
                addPath('{' + name + '}');
                return;
            case 2:
                addQuery(name, '{' + name + '}');
                return;
            default:
                return;
        }
    }

    public final void appendArg(int index, String name, NavType<Object> type, List<String> value) {
        Intrinsics.checkNotNullParameter(name, "name");
        Intrinsics.checkNotNullParameter(type, "type");
        Intrinsics.checkNotNullParameter(value, "value");
        switch (WhenMappings.$EnumSwitchMapping$0[computeParamType(index, type).ordinal()]) {
            case 1:
                boolean z = true;
                if (value.size() != 1) {
                    z = false;
                }
                if (z) {
                    addPath((String) CollectionsKt.first(value));
                    return;
                }
                throw new IllegalArgumentException(("Expected one value for argument " + name + ", found " + value.size() + "values instead.").toString());
            case 2:
                for (String it : value) {
                    addQuery(name, it);
                }
                return;
            default:
                return;
        }
    }

    private final ParamType computeParamType(int index, NavType<Object> type) {
        if ((type instanceof CollectionNavType) || this.serializer.getDescriptor().isElementOptional(index)) {
            return ParamType.QUERY;
        }
        return ParamType.PATH;
    }
}
