package androidx.navigation;

import androidx.navigation.serialization.RouteSerializerKt;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.MagicApiIntrinsics;
import kotlin.reflect.KClass;
import kotlin.reflect.KType;
import kotlinx.serialization.SerializersKt;

@Metadata(d1 = {"\u00002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\u0010\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0004\u001a$\u0010\u0000\u001a\u00020\u0001\"\b\b\u0000\u0010\u0002*\u00020\u0003*\u00020\u00042\u0006\u0010\u0005\u001a\u0002H\u0002H\u0002¢\u0006\u0002\u0010\u0006\u001a\u0017\u0010\u0000\u001a\u00020\u0001*\u00020\u00042\b\b\u0001\u0010\u0007\u001a\u00020\bH\u0002\u001a\u0015\u0010\u0000\u001a\u00020\u0001*\u00020\u00042\u0006\u0010\u0005\u001a\u00020\tH\u0002\u001a'\u0010\u0000\u001a\u00020\u0001\"\n\b\u0000\u0010\u0002\u0018\u0001*\u00020\u0003*\u00020\u00042\f\u0010\u0005\u001a\b\u0012\u0004\u0012\u0002H\u00020\nH\n\u001a$\u0010\u000b\u001a\u00020\f\"\b\b\u0000\u0010\u0002*\u00020\u0003*\u00020\u00042\u0006\u0010\u0005\u001a\u0002H\u0002H\n¢\u0006\u0002\u0010\r\u001a\u0017\u0010\u000b\u001a\u00020\f*\u00020\u00042\b\b\u0001\u0010\u0007\u001a\u00020\bH\n\u001a\u0015\u0010\u000b\u001a\u00020\f*\u00020\u00042\u0006\u0010\u0005\u001a\u00020\tH\n\u001a'\u0010\u000b\u001a\u00020\f\"\n\b\u0000\u0010\u0002\u0018\u0001*\u00020\u0003*\u00020\u00042\f\u0010\u0005\u001a\b\u0012\u0004\u0012\u0002H\u00020\nH\n\u001a\u0015\u0010\u000e\u001a\u00020\u000f*\u00020\u00042\u0006\u0010\u0010\u001a\u00020\fH\n\u001a\u0015\u0010\u0011\u001a\u00020\u000f*\u00020\u00042\u0006\u0010\u0010\u001a\u00020\fH\n\u001a\u0015\u0010\u0011\u001a\u00020\u000f*\u00020\u00042\u0006\u0010\u0012\u001a\u00020\u0004H\n¨\u0006\u0013"}, d2 = {"contains", "", "T", "", "Landroidx/navigation/NavGraph;", "route", "(Landroidx/navigation/NavGraph;Ljava/lang/Object;)Z", "id", "", "", "Lkotlin/reflect/KClass;", "get", "Landroidx/navigation/NavDestination;", "(Landroidx/navigation/NavGraph;Ljava/lang/Object;)Landroidx/navigation/NavDestination;", "minusAssign", "", "node", "plusAssign", "other", "navigation-common_release"}, k = 2, mv = {1, 8, 0}, xi = 48)
/* compiled from: NavGraph.kt */
public final class NavGraphKt {
    public static final NavDestination get(NavGraph $this$get, int id) {
        Intrinsics.checkNotNullParameter($this$get, "<this>");
        NavDestination findNode = $this$get.findNode(id);
        if (findNode != null) {
            return findNode;
        }
        throw new IllegalArgumentException("No destination for " + id + " was found in " + $this$get);
    }

    public static final NavDestination get(NavGraph $this$get, String route) {
        Intrinsics.checkNotNullParameter($this$get, "<this>");
        Intrinsics.checkNotNullParameter(route, "route");
        NavDestination findNode = $this$get.findNode(route);
        if (findNode != null) {
            return findNode;
        }
        throw new IllegalArgumentException("No destination for " + route + " was found in " + $this$get);
    }

    public static final /* synthetic */ <T> NavDestination get(NavGraph $this$get, KClass<T> route) {
        Intrinsics.checkNotNullParameter($this$get, "<this>");
        Intrinsics.checkNotNullParameter(route, "route");
        Intrinsics.reifiedOperationMarker(6, "T");
        MagicApiIntrinsics.voidMagicApiCall((Object) "kotlinx.serialization.serializer.simple");
        NavDestination findNode = $this$get.findNode(RouteSerializerKt.generateHashCode(SerializersKt.serializer((KType) null)));
        if (findNode != null) {
            return findNode;
        }
        throw new IllegalArgumentException("No destination for " + route + " was found in " + $this$get);
    }

    public static final <T> NavDestination get(NavGraph $this$get, T route) {
        Intrinsics.checkNotNullParameter($this$get, "<this>");
        Intrinsics.checkNotNullParameter(route, "route");
        NavDestination findNode = $this$get.findNode(route);
        if (findNode != null) {
            return findNode;
        }
        throw new IllegalArgumentException("No destination for " + route + " was found in " + $this$get);
    }

    public static final boolean contains(NavGraph $this$contains, int id) {
        Intrinsics.checkNotNullParameter($this$contains, "<this>");
        return $this$contains.findNode(id) != null;
    }

    public static final boolean contains(NavGraph $this$contains, String route) {
        Intrinsics.checkNotNullParameter($this$contains, "<this>");
        Intrinsics.checkNotNullParameter(route, "route");
        return $this$contains.findNode(route) != null;
    }

    public static final /* synthetic */ <T> boolean contains(NavGraph $this$contains, KClass<T> route) {
        Intrinsics.checkNotNullParameter($this$contains, "<this>");
        Intrinsics.checkNotNullParameter(route, "route");
        Intrinsics.reifiedOperationMarker(6, "T");
        MagicApiIntrinsics.voidMagicApiCall((Object) "kotlinx.serialization.serializer.simple");
        return $this$contains.findNode(RouteSerializerKt.generateHashCode(SerializersKt.serializer((KType) null))) != null;
    }

    public static final <T> boolean contains(NavGraph $this$contains, T route) {
        Intrinsics.checkNotNullParameter($this$contains, "<this>");
        Intrinsics.checkNotNullParameter(route, "route");
        return $this$contains.findNode(route) != null;
    }

    public static final void plusAssign(NavGraph $this$plusAssign, NavDestination node) {
        Intrinsics.checkNotNullParameter($this$plusAssign, "<this>");
        Intrinsics.checkNotNullParameter(node, "node");
        $this$plusAssign.addDestination(node);
    }

    public static final void plusAssign(NavGraph $this$plusAssign, NavGraph other) {
        Intrinsics.checkNotNullParameter($this$plusAssign, "<this>");
        Intrinsics.checkNotNullParameter(other, "other");
        $this$plusAssign.addAll(other);
    }

    public static final void minusAssign(NavGraph $this$minusAssign, NavDestination node) {
        Intrinsics.checkNotNullParameter($this$minusAssign, "<this>");
        Intrinsics.checkNotNullParameter(node, "node");
        $this$minusAssign.remove(node);
    }
}
