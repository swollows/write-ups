package androidx.navigation;

import android.content.Context;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import androidx.collection.SparseArrayCompat;
import androidx.collection.SparseArrayKt;
import androidx.navigation.NavDestination;
import androidx.navigation.common.R;
import androidx.navigation.serialization.RouteSerializerKt;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import kotlin.Deprecated;
import kotlin.Metadata;
import kotlin.ReplaceWith;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.JvmStatic;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.MagicApiIntrinsics;
import kotlin.jvm.internal.Reflection;
import kotlin.jvm.internal.markers.KMappedMarker;
import kotlin.reflect.KType;
import kotlin.sequences.Sequence;
import kotlin.sequences.SequencesKt;
import kotlin.text.StringsKt;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.SerializersKt;

@Metadata(d1 = {"\u0000\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u001c\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\b\n\u0002\b\f\n\u0002\u0010\u0002\n\u0002\b\u0004\n\u0002\u0010\u0011\n\u0000\n\u0002\u0010\u001e\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\u0010\u0000\n\u0002\b\f\n\u0002\u0010)\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0016\u0018\u0000 K2\u00020\u00012\b\u0012\u0004\u0012\u00020\u00010\u0002:\u0001KB\u0015\u0012\u000e\u0010\u0003\u001a\n\u0012\u0006\b\u0001\u0012\u00020\u00000\u0004¢\u0006\u0002\u0010\u0005J\u000e\u0010\u001d\u001a\u00020\u001e2\u0006\u0010\u001f\u001a\u00020\u0000J\u000e\u0010 \u001a\u00020\u001e2\u0006\u0010!\u001a\u00020\u0001J\u001f\u0010\"\u001a\u00020\u001e2\u0012\u0010\n\u001a\n\u0012\u0006\b\u0001\u0012\u00020\u00010#\"\u00020\u0001¢\u0006\u0002\u0010$J\u0016\u0010\"\u001a\u00020\u001e2\u000e\u0010\n\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00010%J\u0006\u0010&\u001a\u00020\u001eJ\u0013\u0010'\u001a\u00020(2\b\u0010\u001f\u001a\u0004\u0018\u00010)H\u0002J\u0013\u0010*\u001a\u0004\u0018\u00010\u0001\"\u0006\b\u0000\u0010+\u0018\u0001H\bJ\u001d\u0010*\u001a\u0004\u0018\u00010\u0001\"\u0004\b\u0000\u0010+2\b\u0010,\u001a\u0004\u0018\u0001H+¢\u0006\u0002\u0010-J\u0012\u0010*\u001a\u0004\u0018\u00010\u00012\b\b\u0001\u0010.\u001a\u00020\u0011J\u001a\u0010*\u001a\u0004\u0018\u00010\u00012\u0006\u0010,\u001a\u00020\u00072\u0006\u0010/\u001a\u00020(H\u0007J\u0012\u0010*\u001a\u0004\u0018\u00010\u00012\b\u0010,\u001a\u0004\u0018\u00010\u0007J&\u00100\u001a\u0004\u0018\u00010\u00012\b\b\u0001\u0010.\u001a\u00020\u00112\b\u00101\u001a\u0004\u0018\u00010\u00012\u0006\u00102\u001a\u00020(H\u0007J\b\u00103\u001a\u00020\u0011H\u0007J\b\u00104\u001a\u00020\u0011H\u0016J\u000f\u00105\u001a\b\u0012\u0004\u0012\u00020\u000106H\u0002J\u0012\u00107\u001a\u0004\u0018\u0001082\u0006\u00109\u001a\u00020:H\u0017J*\u0010;\u001a\u0004\u0018\u0001082\u0006\u00109\u001a\u00020:2\u0006\u00102\u001a\u00020(2\u0006\u0010<\u001a\u00020(2\u0006\u00101\u001a\u00020\u0001H\u0007J*\u0010=\u001a\u0004\u0018\u0001082\u0006\u0010,\u001a\u00020\u00072\u0006\u00102\u001a\u00020(2\u0006\u0010<\u001a\u00020(2\u0006\u00101\u001a\u00020\u0001H\u0007J\u0018\u0010>\u001a\u00020\u001e2\u0006\u0010?\u001a\u00020@2\u0006\u0010A\u001a\u00020BH\u0016J\u000e\u0010C\u001a\u00020\u001e2\u0006\u0010!\u001a\u00020\u0001J\u0015\u0010D\u001a\u00020\u001e\"\n\b\u0000\u0010+\u0018\u0001*\u00020)H\bJ\u001d\u0010D\u001a\u00020\u001e\"\b\b\u0000\u0010+*\u00020)2\u0006\u0010\u0018\u001a\u0002H+¢\u0006\u0002\u0010EJ\u000e\u0010D\u001a\u00020\u001e2\u0006\u0010\u0010\u001a\u00020\u0011J\u000e\u0010D\u001a\u00020\u001e2\u0006\u0010\u0018\u001a\u00020\u0007J0\u0010D\u001a\u00020\u001e\"\u0004\b\u0000\u0010+2\f\u0010F\u001a\b\u0012\u0004\u0012\u0002H+0G2\u0012\u0010H\u001a\u000e\u0012\u0004\u0012\u00020\u0001\u0012\u0004\u0012\u00020\u00070IH\u0007J\b\u0010J\u001a\u00020\u0007H\u0016R\u0014\u0010\u0006\u001a\u00020\u00078WX\u0004¢\u0006\u0006\u001a\u0004\b\b\u0010\tR\u0019\u0010\n\u001a\b\u0012\u0004\u0012\u00020\u00010\u000b8G¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\rR\u0011\u0010\u000e\u001a\u00020\u00078G¢\u0006\u0006\u001a\u0004\b\u000f\u0010\tR\u000e\u0010\u0010\u001a\u00020\u0011X\u000e¢\u0006\u0002\n\u0000R\u0010\u0010\u0012\u001a\u0004\u0018\u00010\u0007X\u000e¢\u0006\u0002\n\u0000R$\u0010\u0013\u001a\u00020\u00112\u0006\u0010\u0010\u001a\u00020\u00118G@BX\u000e¢\u0006\f\u001a\u0004\b\u0014\u0010\u0015\"\u0004\b\u0016\u0010\u0017R(\u0010\u0019\u001a\u0004\u0018\u00010\u00072\b\u0010\u0018\u001a\u0004\u0018\u00010\u0007@BX\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u001a\u0010\t\"\u0004\b\u001b\u0010\u001c¨\u0006L"}, d2 = {"Landroidx/navigation/NavGraph;", "Landroidx/navigation/NavDestination;", "", "navGraphNavigator", "Landroidx/navigation/Navigator;", "(Landroidx/navigation/Navigator;)V", "displayName", "", "getDisplayName", "()Ljava/lang/String;", "nodes", "Landroidx/collection/SparseArrayCompat;", "getNodes", "()Landroidx/collection/SparseArrayCompat;", "startDestDisplayName", "getStartDestDisplayName", "startDestId", "", "startDestIdName", "startDestinationId", "getStartDestinationId", "()I", "setStartDestinationId", "(I)V", "startDestRoute", "startDestinationRoute", "getStartDestinationRoute", "setStartDestinationRoute", "(Ljava/lang/String;)V", "addAll", "", "other", "addDestination", "node", "addDestinations", "", "([Landroidx/navigation/NavDestination;)V", "", "clear", "equals", "", "", "findNode", "T", "route", "(Ljava/lang/Object;)Landroidx/navigation/NavDestination;", "resId", "searchParents", "findNodeComprehensive", "lastVisited", "searchChildren", "getStartDestination", "hashCode", "iterator", "", "matchDeepLink", "Landroidx/navigation/NavDestination$DeepLinkMatch;", "navDeepLinkRequest", "Landroidx/navigation/NavDeepLinkRequest;", "matchDeepLinkComprehensive", "searchParent", "matchRouteComprehensive", "onInflate", "context", "Landroid/content/Context;", "attrs", "Landroid/util/AttributeSet;", "remove", "setStartDestination", "(Ljava/lang/Object;)V", "serializer", "Lkotlinx/serialization/KSerializer;", "parseRoute", "Lkotlin/Function1;", "toString", "Companion", "navigation-common_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* compiled from: NavGraph.kt */
public class NavGraph extends NavDestination implements Iterable<NavDestination>, KMappedMarker {
    public static final Companion Companion = new Companion((DefaultConstructorMarker) null);
    private final SparseArrayCompat<NavDestination> nodes = new SparseArrayCompat<>(0, 1, (DefaultConstructorMarker) null);
    private int startDestId;
    private String startDestIdName;
    private String startDestinationRoute;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public NavGraph(Navigator<? extends NavGraph> navGraphNavigator) {
        super((Navigator<? extends NavDestination>) navGraphNavigator);
        Intrinsics.checkNotNullParameter(navGraphNavigator, "navGraphNavigator");
    }

    public final SparseArrayCompat<NavDestination> getNodes() {
        return this.nodes;
    }

    public void onInflate(Context context, AttributeSet attrs) {
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(attrs, "attrs");
        super.onInflate(context, attrs);
        TypedArray $this$use$iv = context.getResources().obtainAttributes(attrs, R.styleable.NavGraphNavigator);
        Intrinsics.checkNotNullExpressionValue($this$use$iv, "context.resources.obtain…leable.NavGraphNavigator)");
        setStartDestinationId($this$use$iv.getResourceId(R.styleable.NavGraphNavigator_startDestination, 0));
        this.startDestIdName = NavDestination.Companion.getDisplayName(context, this.startDestId);
        Unit unit = Unit.INSTANCE;
        $this$use$iv.recycle();
    }

    public final NavDestination.DeepLinkMatch matchRouteComprehensive(String route, boolean searchChildren, boolean searchParent, NavDestination lastVisited) {
        NavDestination.DeepLinkMatch bestChildMatch;
        NavDestination.DeepLinkMatch bestParentMatch;
        int $i$f$mapNotNull;
        Iterable $this$mapNotNull$iv;
        Object it$iv$iv;
        String str = route;
        boolean z = searchChildren;
        NavDestination navDestination = lastVisited;
        Intrinsics.checkNotNullParameter(str, "route");
        Intrinsics.checkNotNullParameter(navDestination, "lastVisited");
        NavDestination.DeepLinkMatch bestMatch = matchRoute(route);
        if (z) {
            Iterable<NavDestination> $this$mapNotNull$iv2 = this;
            int $i$f$mapNotNull2 = false;
            Collection destination$iv$iv = new ArrayList();
            for (NavDestination child : $this$mapNotNull$iv2) {
                if (Intrinsics.areEqual((Object) child, (Object) navDestination)) {
                    $this$mapNotNull$iv = $this$mapNotNull$iv2;
                    $i$f$mapNotNull = $i$f$mapNotNull2;
                    it$iv$iv = null;
                } else if (child instanceof NavGraph) {
                    $this$mapNotNull$iv = $this$mapNotNull$iv2;
                    $i$f$mapNotNull = $i$f$mapNotNull2;
                    it$iv$iv = ((NavGraph) child).matchRouteComprehensive(str, true, false, this);
                } else {
                    $this$mapNotNull$iv = $this$mapNotNull$iv2;
                    $i$f$mapNotNull = $i$f$mapNotNull2;
                    it$iv$iv = child.matchRoute(str);
                }
                if (it$iv$iv != null) {
                    destination$iv$iv.add(it$iv$iv);
                }
                $this$mapNotNull$iv2 = $this$mapNotNull$iv;
                $i$f$mapNotNull2 = $i$f$mapNotNull;
            }
            int i = $i$f$mapNotNull2;
            bestChildMatch = (NavDestination.DeepLinkMatch) CollectionsKt.maxOrNull((List) destination$iv$iv);
        } else {
            bestChildMatch = null;
        }
        NavGraph it = getParent();
        if (it == null) {
            bestParentMatch = null;
        } else if (!searchParent || Intrinsics.areEqual((Object) it, (Object) navDestination)) {
            bestParentMatch = null;
        } else {
            bestParentMatch = it.matchRouteComprehensive(str, z, true, this);
        }
        return (NavDestination.DeepLinkMatch) CollectionsKt.maxOrNull(CollectionsKt.listOfNotNull((T[]) new NavDestination.DeepLinkMatch[]{bestMatch, bestChildMatch, bestParentMatch}));
    }

    public final NavDestination.DeepLinkMatch matchDeepLinkComprehensive(NavDeepLinkRequest navDeepLinkRequest, boolean searchChildren, boolean searchParent, NavDestination lastVisited) {
        NavDestination.DeepLinkMatch bestChildMatch;
        NavDestination.DeepLinkMatch bestParentMatch;
        NavDeepLinkRequest navDeepLinkRequest2 = navDeepLinkRequest;
        boolean z = searchChildren;
        NavDestination navDestination = lastVisited;
        Intrinsics.checkNotNullParameter(navDeepLinkRequest2, "navDeepLinkRequest");
        Intrinsics.checkNotNullParameter(navDestination, "lastVisited");
        NavDestination.DeepLinkMatch bestMatch = super.matchDeepLink(navDeepLinkRequest);
        if (z) {
            Collection destination$iv$iv = new ArrayList();
            Iterator it = iterator();
            while (it.hasNext()) {
                NavDestination child = (NavDestination) it.next();
                Object it$iv$iv = !Intrinsics.areEqual((Object) child, (Object) navDestination) ? child.matchDeepLink(navDeepLinkRequest2) : null;
                if (it$iv$iv != null) {
                    destination$iv$iv.add(it$iv$iv);
                }
            }
            bestChildMatch = (NavDestination.DeepLinkMatch) CollectionsKt.maxOrNull((List) destination$iv$iv);
        } else {
            bestChildMatch = null;
        }
        NavGraph it2 = getParent();
        if (it2 == null) {
            bestParentMatch = null;
        } else if (!searchParent || Intrinsics.areEqual((Object) it2, (Object) navDestination)) {
            bestParentMatch = null;
        } else {
            bestParentMatch = it2.matchDeepLinkComprehensive(navDeepLinkRequest2, z, true, this);
        }
        return (NavDestination.DeepLinkMatch) CollectionsKt.maxOrNull(CollectionsKt.listOfNotNull((T[]) new NavDestination.DeepLinkMatch[]{bestMatch, bestChildMatch, bestParentMatch}));
    }

    public NavDestination.DeepLinkMatch matchDeepLink(NavDeepLinkRequest navDeepLinkRequest) {
        Intrinsics.checkNotNullParameter(navDeepLinkRequest, "navDeepLinkRequest");
        return matchDeepLinkComprehensive(navDeepLinkRequest, true, false, this);
    }

    public final void addDestination(NavDestination node) {
        Intrinsics.checkNotNullParameter(node, "node");
        int id = node.getId();
        String innerRoute = node.getRoute();
        boolean z = false;
        if (!((id == 0 && innerRoute == null) ? false : true)) {
            throw new IllegalArgumentException("Destinations must have an id or route. Call setId(), setRoute(), or include an android:id or app:route in your navigation XML.".toString());
        } else if (getRoute() == null || !Intrinsics.areEqual((Object) innerRoute, (Object) getRoute())) {
            if (id != getId()) {
                NavDestination existingDestination = this.nodes.get(id);
                if (existingDestination != node) {
                    if (node.getParent() == null) {
                        z = true;
                    }
                    if (z) {
                        if (existingDestination != null) {
                            existingDestination.setParent((NavGraph) null);
                        }
                        node.setParent(this);
                        this.nodes.put(node.getId(), node);
                        return;
                    }
                    throw new IllegalStateException("Destination already has a parent set. Call NavGraph.remove() to remove the previous parent.".toString());
                }
                return;
            }
            throw new IllegalArgumentException(("Destination " + node + " cannot have the same id as graph " + this).toString());
        } else {
            throw new IllegalArgumentException(("Destination " + node + " cannot have the same route as graph " + this).toString());
        }
    }

    public final void addDestinations(Collection<? extends NavDestination> nodes2) {
        Intrinsics.checkNotNullParameter(nodes2, "nodes");
        for (NavDestination node : nodes2) {
            if (node != null) {
                addDestination(node);
            }
        }
    }

    public final void addDestinations(NavDestination... nodes2) {
        Intrinsics.checkNotNullParameter(nodes2, "nodes");
        for (NavDestination node : nodes2) {
            addDestination(node);
        }
    }

    public final NavDestination findNode(int resId) {
        return findNodeComprehensive(resId, this, false);
    }

    public final NavDestination findNodeComprehensive(int resId, NavDestination lastVisited, boolean searchChildren) {
        NavDestination navDestination;
        NavDestination destination = this.nodes.get(resId);
        if (destination != null) {
            return destination;
        }
        if (searchChildren) {
            Iterator<T> it = SequencesKt.asSequence(SparseArrayKt.valueIterator(this.nodes)).iterator();
            while (true) {
                if (!it.hasNext()) {
                    navDestination = null;
                    break;
                }
                NavDestination child = (NavDestination) it.next();
                if (!(child instanceof NavGraph) || Intrinsics.areEqual((Object) child, (Object) lastVisited)) {
                    navDestination = null;
                    continue;
                } else {
                    navDestination = ((NavGraph) child).findNodeComprehensive(resId, this, true);
                    continue;
                }
                if (navDestination != null) {
                    break;
                }
            }
            destination = navDestination;
        }
        if (destination != null) {
            return destination;
        }
        if (getParent() == null || Intrinsics.areEqual((Object) getParent(), (Object) lastVisited)) {
            return null;
        }
        NavGraph parent = getParent();
        Intrinsics.checkNotNull(parent);
        return parent.findNodeComprehensive(resId, this, searchChildren);
    }

    public final NavDestination findNode(String route) {
        CharSequence charSequence = route;
        if (!(charSequence == null || StringsKt.isBlank(charSequence))) {
            return findNode(route, true);
        }
        return null;
    }

    public final /* synthetic */ <T> NavDestination findNode() {
        Intrinsics.reifiedOperationMarker(6, "T");
        MagicApiIntrinsics.voidMagicApiCall((Object) "kotlinx.serialization.serializer.simple");
        return findNode(RouteSerializerKt.generateHashCode(SerializersKt.serializer((KType) null)));
    }

    public final <T> NavDestination findNode(T route) {
        if (route != null) {
            return findNode(RouteSerializerKt.generateHashCode(SerializersKt.serializer(Reflection.getOrCreateKotlinClass(route.getClass()))));
        }
        return null;
    }

    public final NavDestination findNode(String route, boolean searchParents) {
        Object element$iv;
        Intrinsics.checkNotNullParameter(route, "route");
        Iterator<T> it = SequencesKt.asSequence(SparseArrayKt.valueIterator(this.nodes)).iterator();
        while (true) {
            if (!it.hasNext()) {
                element$iv = null;
                break;
            }
            element$iv = it.next();
            NavDestination it2 = (NavDestination) element$iv;
            boolean z = false;
            if (StringsKt.equals$default(it2.getRoute(), route, false, 2, (Object) null) || it2.matchRoute(route) != null) {
                z = true;
                continue;
            }
            if (z) {
                break;
            }
        }
        NavDestination destination = (NavDestination) element$iv;
        if (destination != null) {
            return destination;
        }
        if (!searchParents || getParent() == null) {
            return null;
        }
        NavGraph parent = getParent();
        Intrinsics.checkNotNull(parent);
        return parent.findNode(route);
    }

    public final Iterator<NavDestination> iterator() {
        return new NavGraph$iterator$1(this);
    }

    public final void addAll(NavGraph other) {
        Intrinsics.checkNotNullParameter(other, "other");
        Iterator iterator = other.iterator();
        while (iterator.hasNext()) {
            iterator.remove();
            addDestination(iterator.next());
        }
    }

    public final void remove(NavDestination node) {
        Intrinsics.checkNotNullParameter(node, "node");
        int index = this.nodes.indexOfKey(node.getId());
        if (index >= 0) {
            this.nodes.valueAt(index).setParent((NavGraph) null);
            this.nodes.removeAt(index);
        }
    }

    public final void clear() {
        Iterator iterator = iterator();
        while (iterator.hasNext()) {
            iterator.next();
            iterator.remove();
        }
    }

    public String getDisplayName() {
        return getId() != 0 ? super.getDisplayName() : "the root navigation";
    }

    @Deprecated(message = "Use getStartDestinationId instead.", replaceWith = @ReplaceWith(expression = "startDestinationId", imports = {}))
    public final int getStartDestination() {
        return getStartDestinationId();
    }

    public final int getStartDestinationId() {
        return this.startDestId;
    }

    private final void setStartDestinationId(int startDestId2) {
        if (startDestId2 != getId()) {
            if (this.startDestinationRoute != null) {
                setStartDestinationRoute((String) null);
            }
            this.startDestId = startDestId2;
            this.startDestIdName = null;
            return;
        }
        throw new IllegalArgumentException(("Start destination " + startDestId2 + " cannot use the same id as the graph " + this).toString());
    }

    public final void setStartDestination(int startDestId2) {
        setStartDestinationId(startDestId2);
    }

    public final void setStartDestination(String startDestRoute) {
        Intrinsics.checkNotNullParameter(startDestRoute, "startDestRoute");
        setStartDestinationRoute(startDestRoute);
    }

    public final /* synthetic */ <T> void setStartDestination() {
        Intrinsics.reifiedOperationMarker(6, "T");
        MagicApiIntrinsics.voidMagicApiCall((Object) "kotlinx.serialization.serializer.simple");
        setStartDestination(SerializersKt.serializer((KType) null), NavGraph$setStartDestination$1.INSTANCE);
    }

    public final <T> void setStartDestination(T startDestRoute) {
        Intrinsics.checkNotNullParameter(startDestRoute, "startDestRoute");
        setStartDestination(SerializersKt.serializer(Reflection.getOrCreateKotlinClass(startDestRoute.getClass())), new NavGraph$setStartDestination$2(startDestRoute));
    }

    public final <T> void setStartDestination(KSerializer<T> serializer, Function1<? super NavDestination, String> parseRoute) {
        Intrinsics.checkNotNullParameter(serializer, "serializer");
        Intrinsics.checkNotNullParameter(parseRoute, "parseRoute");
        int id = RouteSerializerKt.generateHashCode(serializer);
        NavDestination startDest = findNode(id);
        if (startDest != null) {
            setStartDestinationRoute(parseRoute.invoke(startDest));
            this.startDestId = id;
            return;
        }
        throw new IllegalStateException(("Cannot find startDestination " + serializer.getDescriptor().getSerialName() + " from NavGraph. Ensure the starting NavDestination was added with route from KClass.").toString());
    }

    public final String getStartDestinationRoute() {
        return this.startDestinationRoute;
    }

    private final void setStartDestinationRoute(String startDestRoute) {
        int i;
        if (startDestRoute == null) {
            i = 0;
        } else if (Intrinsics.areEqual((Object) startDestRoute, (Object) getRoute())) {
            throw new IllegalArgumentException(("Start destination " + startDestRoute + " cannot use the same route as the graph " + this).toString());
        } else if (!StringsKt.isBlank(startDestRoute)) {
            i = NavDestination.Companion.createRoute(startDestRoute).hashCode();
        } else {
            throw new IllegalArgumentException("Cannot have an empty start destination route".toString());
        }
        this.startDestId = i;
        this.startDestinationRoute = startDestRoute;
    }

    public final String getStartDestDisplayName() {
        if (this.startDestIdName == null) {
            String str = this.startDestinationRoute;
            if (str == null) {
                str = String.valueOf(this.startDestId);
            }
            this.startDestIdName = str;
        }
        String str2 = this.startDestIdName;
        Intrinsics.checkNotNull(str2);
        return str2;
    }

    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(super.toString());
        NavDestination startDestination = findNode(this.startDestinationRoute);
        if (startDestination == null) {
            startDestination = findNode(getStartDestinationId());
        }
        sb.append(" startDestination=");
        if (startDestination != null) {
            sb.append("{");
            sb.append(startDestination.toString());
            sb.append("}");
        } else if (this.startDestinationRoute != null) {
            sb.append(this.startDestinationRoute);
        } else if (this.startDestIdName != null) {
            sb.append(this.startDestIdName);
        } else {
            sb.append("0x" + Integer.toHexString(this.startDestId));
        }
        String sb2 = sb.toString();
        Intrinsics.checkNotNullExpressionValue(sb2, "sb.toString()");
        return sb2;
    }

    public boolean equals(Object other) {
        Sequence $this$all$iv;
        if (this == other) {
            return true;
        }
        if (other == null || !(other instanceof NavGraph)) {
            return false;
        }
        if (super.equals(other) && this.nodes.size() == ((NavGraph) other).nodes.size() && getStartDestinationId() == ((NavGraph) other).getStartDestinationId()) {
            Iterator<T> it = SequencesKt.asSequence(SparseArrayKt.valueIterator(this.nodes)).iterator();
            while (true) {
                if (!it.hasNext()) {
                    $this$all$iv = 1;
                    break;
                }
                NavDestination it2 = (NavDestination) it.next();
                if (!Intrinsics.areEqual((Object) it2, (Object) ((NavGraph) other).nodes.get(it2.getId()))) {
                    $this$all$iv = null;
                    break;
                }
            }
            if ($this$all$iv != null) {
                return true;
            }
        }
        return false;
    }

    public int hashCode() {
        int result = getStartDestinationId();
        SparseArrayCompat $this$forEach$iv = this.nodes;
        int size = $this$forEach$iv.size();
        for (int index$iv = 0; index$iv < size; index$iv++) {
            result = (((result * 31) + $this$forEach$iv.keyAt(index$iv)) * 31) + $this$forEach$iv.valueAt(index$iv).hashCode();
        }
        return result;
    }

    @Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u0012\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004*\u00020\u0006H\u0007J\f\u0010\u0007\u001a\u00020\u0005*\u00020\u0006H\u0007¨\u0006\b"}, d2 = {"Landroidx/navigation/NavGraph$Companion;", "", "()V", "childHierarchy", "Lkotlin/sequences/Sequence;", "Landroidx/navigation/NavDestination;", "Landroidx/navigation/NavGraph;", "findStartDestination", "navigation-common_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
    /* compiled from: NavGraph.kt */
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }

        @JvmStatic
        public final NavDestination findStartDestination(NavGraph $this$findStartDestination) {
            Intrinsics.checkNotNullParameter($this$findStartDestination, "<this>");
            return (NavDestination) SequencesKt.last(childHierarchy($this$findStartDestination));
        }

        public final Sequence<NavDestination> childHierarchy(NavGraph $this$childHierarchy) {
            Intrinsics.checkNotNullParameter($this$childHierarchy, "<this>");
            return SequencesKt.generateSequence($this$childHierarchy, NavGraph$Companion$childHierarchy$1.INSTANCE);
        }
    }

    @JvmStatic
    public static final NavDestination findStartDestination(NavGraph $this$findStartDestination) {
        return Companion.findStartDestination($this$findStartDestination);
    }
}
