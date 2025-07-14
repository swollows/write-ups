package androidx.navigation;

import android.content.Context;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.net.Uri;
import android.os.Bundle;
import android.util.AttributeSet;
import androidx.collection.SparseArrayCompat;
import androidx.collection.SparseArrayKt;
import androidx.navigation.NavDeepLink;
import androidx.navigation.common.R;
import androidx.navigation.serialization.RouteSerializerKt;
import java.lang.annotation.ElementType;
import java.lang.annotation.RetentionPolicy;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import kotlin.Lazy;
import kotlin.LazyKt;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.annotation.AnnotationRetention;
import kotlin.annotation.AnnotationTarget;
import kotlin.annotation.Retention;
import kotlin.annotation.Target;
import kotlin.collections.ArrayDeque;
import kotlin.collections.CollectionsKt;
import kotlin.collections.MapsKt;
import kotlin.jvm.JvmStatic;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Reflection;
import kotlin.reflect.KClass;
import kotlin.sequences.Sequence;
import kotlin.sequences.SequencesKt;
import kotlin.text.StringsKt;
import kotlin.text.Typography;
import kotlinx.serialization.SerializersKt;

@Metadata(d1 = {"\u0000¦\u0001\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010%\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010$\n\u0002\b\u0003\n\u0002\u0010!\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\b\n\u0002\b\u0006\n\u0002\u0010\r\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0015\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\f\b\u0016\u0018\u0000 `2\u00020\u0001:\u0003_`aB\u0017\b\u0016\u0012\u000e\u0010\u0002\u001a\n\u0012\u0006\b\u0001\u0012\u00020\u00000\u0003¢\u0006\u0002\u0010\u0004B\r\u0012\u0006\u0010\u0005\u001a\u00020\u0006¢\u0006\u0002\u0010\u0007J\u0016\u00102\u001a\u0002032\u0006\u00104\u001a\u00020\u00062\u0006\u00105\u001a\u00020\nJ\u000e\u00106\u001a\u0002032\u0006\u00107\u001a\u00020\u0014J\u000e\u00106\u001a\u0002032\u0006\u00108\u001a\u00020\u0006J\u0014\u00109\u001a\u0004\u0018\u00010:2\b\u0010;\u001a\u0004\u0018\u00010:H\u0007J\u0014\u0010<\u001a\u00020=2\n\b\u0002\u0010>\u001a\u0004\u0018\u00010\u0000H\u0007J\u0013\u0010?\u001a\u00020@2\b\u0010A\u001a\u0004\u0018\u00010\u0001H\u0002J\u001a\u0010B\u001a\u0004\u0018\u00010\u00062\u0006\u0010C\u001a\u00020D2\b\u0010E\u001a\u0004\u0018\u00010:J\u0012\u0010F\u001a\u0004\u0018\u00010\r2\b\b\u0001\u0010\u0018\u001a\u00020\u0019J\u0010\u0010G\u001a\u00020@2\u0006\u0010H\u001a\u00020IH\u0016J\u0010\u0010G\u001a\u00020@2\u0006\u0010J\u001a\u00020KH\u0016J.\u0010L\u001a\u00020@2\u0006\u0010H\u001a\u00020\u00142\b\u0010M\u001a\u0004\u0018\u00010I2\u0012\u0010\u000e\u001a\u000e\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\n0\u000fH\u0002J\u001a\u0010N\u001a\u00020@2\u0006\u0010-\u001a\u00020\u00062\b\u0010\u000e\u001a\u0004\u0018\u00010:H\u0007J\b\u0010O\u001a\u00020\u0019H\u0016J\u0012\u0010P\u001a\u0004\u0018\u00010Q2\u0006\u0010R\u001a\u00020KH\u0017J\u0012\u0010S\u001a\u0004\u0018\u00010Q2\u0006\u0010-\u001a\u00020\u0006H\u0007J\u0018\u0010T\u001a\u0002032\u0006\u0010C\u001a\u00020D2\u0006\u0010U\u001a\u00020VH\u0017J\u0018\u0010W\u001a\u0002032\b\b\u0001\u0010X\u001a\u00020\u00192\u0006\u0010Y\u001a\u00020\rJ\u001a\u0010W\u001a\u0002032\b\b\u0001\u0010X\u001a\u00020\u00192\b\b\u0001\u0010Z\u001a\u00020\u0019J\u0010\u0010[\u001a\u0002032\b\b\u0001\u0010X\u001a\u00020\u0019J\u000e\u0010\\\u001a\u0002032\u0006\u00104\u001a\u00020\u0006J\b\u0010]\u001a\u00020@H\u0017J\b\u0010^\u001a\u00020\u0006H\u0016R\u001a\u0010\b\u001a\u000e\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\n0\tX\u000e¢\u0006\u0002\n\u0000R\u0014\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\r0\fX\u0004¢\u0006\u0002\n\u0000R\u001d\u0010\u000e\u001a\u000e\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\n0\u000f8F¢\u0006\u0006\u001a\u0004\b\u0010\u0010\u0011R\u0014\u0010\u0012\u001a\b\u0012\u0004\u0012\u00020\u00140\u0013X\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\u0015\u001a\u00020\u00068WX\u0004¢\u0006\u0006\u001a\u0004\b\u0016\u0010\u0017R(\u0010\u0018\u001a\u00020\u00192\b\b\u0001\u0010\u0018\u001a\u00020\u00198G@FX\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u001a\u0010\u001b\"\u0004\b\u001c\u0010\u001dR\u0010\u0010\u001e\u001a\u0004\u0018\u00010\u0006X\u000e¢\u0006\u0002\n\u0000R\u001c\u0010\u001f\u001a\u0004\u0018\u00010 X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b!\u0010\"\"\u0004\b#\u0010$R\u0011\u0010\u0005\u001a\u00020\u0006¢\u0006\b\n\u0000\u001a\u0004\b%\u0010\u0017R(\u0010(\u001a\u0004\u0018\u00010'2\b\u0010&\u001a\u0004\u0018\u00010'@GX\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b)\u0010*\"\u0004\b+\u0010,R(\u0010-\u001a\u0004\u0018\u00010\u00062\b\u0010-\u001a\u0004\u0018\u00010\u0006@FX\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b.\u0010\u0017\"\u0004\b/\u0010\u0007R\u0016\u00100\u001a\n\u0012\u0004\u0012\u00020\u0014\u0018\u000101X\u000e¢\u0006\u0002\n\u0000¨\u0006b"}, d2 = {"Landroidx/navigation/NavDestination;", "", "navigator", "Landroidx/navigation/Navigator;", "(Landroidx/navigation/Navigator;)V", "navigatorName", "", "(Ljava/lang/String;)V", "_arguments", "", "Landroidx/navigation/NavArgument;", "actions", "Landroidx/collection/SparseArrayCompat;", "Landroidx/navigation/NavAction;", "arguments", "", "getArguments", "()Ljava/util/Map;", "deepLinks", "", "Landroidx/navigation/NavDeepLink;", "displayName", "getDisplayName", "()Ljava/lang/String;", "id", "", "getId", "()I", "setId", "(I)V", "idName", "label", "", "getLabel", "()Ljava/lang/CharSequence;", "setLabel", "(Ljava/lang/CharSequence;)V", "getNavigatorName", "<set-?>", "Landroidx/navigation/NavGraph;", "parent", "getParent", "()Landroidx/navigation/NavGraph;", "setParent", "(Landroidx/navigation/NavGraph;)V", "route", "getRoute", "setRoute", "routeDeepLink", "Lkotlin/Lazy;", "addArgument", "", "argumentName", "argument", "addDeepLink", "navDeepLink", "uriPattern", "addInDefaultArgs", "Landroid/os/Bundle;", "args", "buildDeepLinkIds", "", "previousDestination", "equals", "", "other", "fillInLabel", "context", "Landroid/content/Context;", "bundle", "getAction", "hasDeepLink", "deepLink", "Landroid/net/Uri;", "deepLinkRequest", "Landroidx/navigation/NavDeepLinkRequest;", "hasRequiredArguments", "uri", "hasRoute", "hashCode", "matchDeepLink", "Landroidx/navigation/NavDestination$DeepLinkMatch;", "navDeepLinkRequest", "matchRoute", "onInflate", "attrs", "Landroid/util/AttributeSet;", "putAction", "actionId", "action", "destId", "removeAction", "removeArgument", "supportsActions", "toString", "ClassType", "Companion", "DeepLinkMatch", "navigation-common_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* compiled from: NavDestination.kt */
public class NavDestination {
    public static final Companion Companion = new Companion((DefaultConstructorMarker) null);
    /* access modifiers changed from: private */
    public static final Map<String, Class<?>> classes = new LinkedHashMap();
    /* access modifiers changed from: private */
    public Map<String, NavArgument> _arguments;
    private final SparseArrayCompat<NavAction> actions;
    private final List<NavDeepLink> deepLinks;
    private int id;
    private String idName;
    private CharSequence label;
    private final String navigatorName;
    private NavGraph parent;
    private String route;
    private Lazy<NavDeepLink> routeDeepLink;

    @Target(allowedTargets = {AnnotationTarget.ANNOTATION_CLASS, AnnotationTarget.CLASS})
    @Retention(AnnotationRetention.BINARY)
    @java.lang.annotation.Target({ElementType.TYPE, ElementType.ANNOTATION_TYPE})
    @Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u001b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0002\u0018\u00002\u00020\u0001B\f\u0012\n\u0010\u0002\u001a\u0006\u0012\u0002\b\u00030\u0003R\u0013\u0010\u0002\u001a\u0006\u0012\u0002\b\u00030\u0003¢\u0006\u0006\u001a\u0004\b\u0002\u0010\u0004¨\u0006\u0005"}, d2 = {"Landroidx/navigation/NavDestination$ClassType;", "", "value", "Lkotlin/reflect/KClass;", "()Ljava/lang/Class;", "navigation-common_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
    @java.lang.annotation.Retention(RetentionPolicy.CLASS)
    /* compiled from: NavDestination.kt */
    public @interface ClassType {
        Class<?> value();
    }

    public NavDestination(String navigatorName2) {
        Intrinsics.checkNotNullParameter(navigatorName2, "navigatorName");
        this.navigatorName = navigatorName2;
        this.deepLinks = new ArrayList();
        this.actions = new SparseArrayCompat<>(0, 1, (DefaultConstructorMarker) null);
        this._arguments = new LinkedHashMap();
    }

    public final String getNavigatorName() {
        return this.navigatorName;
    }

    @Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0010\u000f\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\b\n\u0002\b\f\b\u0007\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B7\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0007\u0012\u0006\u0010\b\u001a\u00020\t\u0012\u0006\u0010\n\u001a\u00020\u0007\u0012\u0006\u0010\u000b\u001a\u00020\t¢\u0006\u0002\u0010\fJ\u0011\u0010\u0011\u001a\u00020\t2\u0006\u0010\u0012\u001a\u00020\u0000H\u0002J\u0010\u0010\u0013\u001a\u00020\u00072\b\u0010\u0014\u001a\u0004\u0018\u00010\u0005R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\u000eR\u000e\u0010\n\u001a\u00020\u0007X\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0007X\u0004¢\u0006\u0002\n\u0000R\u0013\u0010\u0004\u001a\u0004\u0018\u00010\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\u0010R\u000e\u0010\b\u001a\u00020\tX\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u000b\u001a\u00020\tX\u0004¢\u0006\u0002\n\u0000¨\u0006\u0015"}, d2 = {"Landroidx/navigation/NavDestination$DeepLinkMatch;", "", "destination", "Landroidx/navigation/NavDestination;", "matchingArgs", "Landroid/os/Bundle;", "isExactDeepLink", "", "matchingPathSegments", "", "hasMatchingAction", "mimeTypeMatchLevel", "(Landroidx/navigation/NavDestination;Landroid/os/Bundle;ZIZI)V", "getDestination", "()Landroidx/navigation/NavDestination;", "getMatchingArgs", "()Landroid/os/Bundle;", "compareTo", "other", "hasMatchingArgs", "arguments", "navigation-common_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
    /* compiled from: NavDestination.kt */
    public static final class DeepLinkMatch implements Comparable<DeepLinkMatch> {
        private final NavDestination destination;
        private final boolean hasMatchingAction;
        private final boolean isExactDeepLink;
        private final Bundle matchingArgs;
        private final int matchingPathSegments;
        private final int mimeTypeMatchLevel;

        public DeepLinkMatch(NavDestination destination2, Bundle matchingArgs2, boolean isExactDeepLink2, int matchingPathSegments2, boolean hasMatchingAction2, int mimeTypeMatchLevel2) {
            Intrinsics.checkNotNullParameter(destination2, "destination");
            this.destination = destination2;
            this.matchingArgs = matchingArgs2;
            this.isExactDeepLink = isExactDeepLink2;
            this.matchingPathSegments = matchingPathSegments2;
            this.hasMatchingAction = hasMatchingAction2;
            this.mimeTypeMatchLevel = mimeTypeMatchLevel2;
        }

        public final NavDestination getDestination() {
            return this.destination;
        }

        public final Bundle getMatchingArgs() {
            return this.matchingArgs;
        }

        public int compareTo(DeepLinkMatch other) {
            Intrinsics.checkNotNullParameter(other, "other");
            if (this.isExactDeepLink && !other.isExactDeepLink) {
                return 1;
            }
            if (!this.isExactDeepLink && other.isExactDeepLink) {
                return -1;
            }
            int pathSegmentDifference = this.matchingPathSegments - other.matchingPathSegments;
            if (pathSegmentDifference > 0) {
                return 1;
            }
            if (pathSegmentDifference < 0) {
                return -1;
            }
            if (this.matchingArgs != null && other.matchingArgs == null) {
                return 1;
            }
            if (this.matchingArgs == null && other.matchingArgs != null) {
                return -1;
            }
            if (this.matchingArgs != null) {
                int size = this.matchingArgs.size();
                Bundle bundle = other.matchingArgs;
                Intrinsics.checkNotNull(bundle);
                int sizeDifference = size - bundle.size();
                if (sizeDifference > 0) {
                    return 1;
                }
                if (sizeDifference < 0) {
                    return -1;
                }
            }
            if (this.hasMatchingAction != 0 && !other.hasMatchingAction) {
                return 1;
            }
            if (this.hasMatchingAction || !other.hasMatchingAction) {
                return this.mimeTypeMatchLevel - other.mimeTypeMatchLevel;
            }
            return -1;
        }

        public final boolean hasMatchingArgs(Bundle arguments) {
            boolean z;
            Object matchingArgValue;
            if (arguments == null || this.matchingArgs == null) {
                return false;
            }
            Set $this$forEach$iv = this.matchingArgs.keySet();
            Intrinsics.checkNotNullExpressionValue($this$forEach$iv, "matchingArgs.keySet()");
            Iterator it = $this$forEach$iv.iterator();
            do {
                z = true;
                if (!it.hasNext()) {
                    return true;
                }
                String key = (String) it.next();
                if (!arguments.containsKey(key)) {
                    return false;
                }
                NavArgument navArgument = (NavArgument) this.destination._arguments.get(key);
                Object entryArgValue = null;
                NavType type = navArgument != null ? navArgument.getType() : null;
                if (type != null) {
                    Bundle bundle = this.matchingArgs;
                    Intrinsics.checkNotNullExpressionValue(key, "key");
                    matchingArgValue = type.get(bundle, key);
                } else {
                    matchingArgValue = null;
                }
                if (type != null) {
                    Intrinsics.checkNotNullExpressionValue(key, "key");
                    entryArgValue = type.get(arguments, key);
                }
                if (type == null || type.valueEquals(matchingArgValue, entryArgValue)) {
                    z = false;
                    continue;
                }
            } while (!z);
            return false;
        }
    }

    public final NavGraph getParent() {
        return this.parent;
    }

    public final void setParent(NavGraph navGraph) {
        this.parent = navGraph;
    }

    public final CharSequence getLabel() {
        return this.label;
    }

    public final void setLabel(CharSequence charSequence) {
        this.label = charSequence;
    }

    public final Map<String, NavArgument> getArguments() {
        return MapsKt.toMap(this._arguments);
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public NavDestination(Navigator<? extends NavDestination> navigator) {
        this(NavigatorProvider.Companion.getNameForNavigator$navigation_common_release(navigator.getClass()));
        Intrinsics.checkNotNullParameter(navigator, "navigator");
    }

    public void onInflate(Context context, AttributeSet attrs) {
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(attrs, "attrs");
        TypedArray $this$use$iv = context.getResources().obtainAttributes(attrs, R.styleable.Navigator);
        Intrinsics.checkNotNullExpressionValue($this$use$iv, "context.resources.obtain…s, R.styleable.Navigator)");
        TypedArray array = $this$use$iv;
        setRoute(array.getString(R.styleable.Navigator_route));
        if (array.hasValue(R.styleable.Navigator_android_id)) {
            setId(array.getResourceId(R.styleable.Navigator_android_id, 0));
            this.idName = Companion.getDisplayName(context, this.id);
        }
        this.label = array.getText(R.styleable.Navigator_android_label);
        Unit unit = Unit.INSTANCE;
        $this$use$iv.recycle();
    }

    public final int getId() {
        return this.id;
    }

    public final void setId(int id2) {
        this.id = id2;
        this.idName = null;
    }

    public final String getRoute() {
        return this.route;
    }

    public final void setRoute(String route2) {
        if (route2 == null) {
            setId(0);
        } else if (!StringsKt.isBlank(route2)) {
            String tempRoute = Companion.createRoute(route2);
            List missingRequiredArguments = NavArgumentKt.missingRequiredArguments(this._arguments, new NavDestination$route$missingRequiredArguments$1(new NavDeepLink.Builder().setUriPattern(tempRoute).build()));
            if (missingRequiredArguments.isEmpty()) {
                this.routeDeepLink = LazyKt.lazy(new NavDestination$route$3(tempRoute));
                setId(tempRoute.hashCode());
            } else {
                throw new IllegalArgumentException(("Cannot set route \"" + route2 + "\" for destination " + this + ". Following required arguments are missing: " + missingRequiredArguments).toString());
            }
        } else {
            throw new IllegalArgumentException("Cannot have an empty route".toString());
        }
        this.route = route2;
    }

    public String getDisplayName() {
        String str = this.idName;
        return str == null ? String.valueOf(this.id) : str;
    }

    public boolean hasDeepLink(Uri deepLink) {
        Intrinsics.checkNotNullParameter(deepLink, "deepLink");
        return hasDeepLink(new NavDeepLinkRequest(deepLink, (String) null, (String) null));
    }

    public boolean hasDeepLink(NavDeepLinkRequest deepLinkRequest) {
        Intrinsics.checkNotNullParameter(deepLinkRequest, "deepLinkRequest");
        return matchDeepLink(deepLinkRequest) != null;
    }

    public final void addDeepLink(String uriPattern) {
        Intrinsics.checkNotNullParameter(uriPattern, "uriPattern");
        addDeepLink(new NavDeepLink.Builder().setUriPattern(uriPattern).build());
    }

    public final void addDeepLink(NavDeepLink navDeepLink) {
        Intrinsics.checkNotNullParameter(navDeepLink, "navDeepLink");
        List missingRequiredArguments = NavArgumentKt.missingRequiredArguments(this._arguments, new NavDestination$addDeepLink$missingRequiredArguments$1(navDeepLink));
        if (missingRequiredArguments.isEmpty()) {
            this.deepLinks.add(navDeepLink);
            return;
        }
        throw new IllegalArgumentException(("Deep link " + navDeepLink.getUriPattern() + " can't be used to open destination " + this + ".\nFollowing required arguments are missing: " + missingRequiredArguments).toString());
    }

    public final DeepLinkMatch matchRoute(String route2) {
        NavDeepLink routeDeepLink2;
        Intrinsics.checkNotNullParameter(route2, "route");
        Lazy<NavDeepLink> lazy = this.routeDeepLink;
        if (lazy == null || (routeDeepLink2 = lazy.getValue()) == null) {
            return null;
        }
        Uri parse = Uri.parse(Companion.createRoute(route2));
        Intrinsics.checkExpressionValueIsNotNull(parse, "Uri.parse(this)");
        Uri uri = parse;
        Bundle matchingArguments = routeDeepLink2.getMatchingArguments(uri, this._arguments);
        if (matchingArguments == null) {
            return null;
        }
        return new DeepLinkMatch(this, matchingArguments, routeDeepLink2.isExactDeepLink(), routeDeepLink2.calculateMatchingPathSegments$navigation_common_release(uri), false, -1);
    }

    public DeepLinkMatch matchDeepLink(NavDeepLinkRequest navDeepLinkRequest) {
        Intrinsics.checkNotNullParameter(navDeepLinkRequest, "navDeepLinkRequest");
        if (this.deepLinks.isEmpty()) {
            return null;
        }
        DeepLinkMatch bestMatch = null;
        for (NavDeepLink deepLink : this.deepLinks) {
            Uri uri = navDeepLinkRequest.getUri();
            Bundle matchingArguments = uri != null ? deepLink.getMatchingArguments(uri, this._arguments) : null;
            int matchingPathSegments = deepLink.calculateMatchingPathSegments$navigation_common_release(uri);
            String requestAction = navDeepLinkRequest.getAction();
            boolean matchingAction = requestAction != null && Intrinsics.areEqual((Object) requestAction, (Object) deepLink.getAction());
            String mimeType = navDeepLinkRequest.getMimeType();
            int mimeTypeMatchLevel = mimeType != null ? deepLink.getMimeTypeMatchRating(mimeType) : -1;
            if (matchingArguments != null || ((matchingAction || mimeTypeMatchLevel > -1) && hasRequiredArguments(deepLink, uri, this._arguments))) {
                String str = mimeType;
                String str2 = requestAction;
                DeepLinkMatch newMatch = new DeepLinkMatch(this, matchingArguments, deepLink.isExactDeepLink(), matchingPathSegments, matchingAction, mimeTypeMatchLevel);
                if (bestMatch == null || newMatch.compareTo(bestMatch) > 0) {
                    bestMatch = newMatch;
                }
            }
        }
        return bestMatch;
    }

    private final boolean hasRequiredArguments(NavDeepLink deepLink, Uri uri, Map<String, NavArgument> arguments) {
        return NavArgumentKt.missingRequiredArguments(arguments, new NavDestination$hasRequiredArguments$missingRequiredArguments$1(deepLink.getMatchingPathAndQueryArgs$navigation_common_release(uri, arguments))).isEmpty();
    }

    public static /* synthetic */ int[] buildDeepLinkIds$default(NavDestination navDestination, NavDestination navDestination2, int i, Object obj) {
        if (obj == null) {
            if ((i & 1) != 0) {
                navDestination2 = null;
            }
            return navDestination.buildDeepLinkIds(navDestination2);
        }
        throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: buildDeepLinkIds");
    }

    public final int[] buildDeepLinkIds(NavDestination previousDestination) {
        ArrayDeque hierarchy = new ArrayDeque();
        NavDestination current = this;
        while (true) {
            Intrinsics.checkNotNull(current);
            NavGraph parent2 = current.parent;
            if ((previousDestination != null ? previousDestination.parent : null) != null) {
                NavGraph navGraph = previousDestination.parent;
                Intrinsics.checkNotNull(navGraph);
                if (navGraph.findNode(current.id) == current) {
                    hierarchy.addFirst(current);
                    break;
                }
            }
            if (parent2 == null || parent2.getStartDestinationId() != current.id) {
                hierarchy.addFirst(current);
            }
            if (Intrinsics.areEqual((Object) parent2, (Object) previousDestination)) {
                break;
            }
            current = parent2;
            if (current == null) {
                break;
            }
        }
        Iterable<NavDestination> $this$map$iv = CollectionsKt.toList(hierarchy);
        Collection destination$iv$iv = new ArrayList(CollectionsKt.collectionSizeOrDefault($this$map$iv, 10));
        for (NavDestination it : $this$map$iv) {
            destination$iv$iv.add(Integer.valueOf(it.id));
        }
        return CollectionsKt.toIntArray((List) destination$iv$iv);
    }

    public final int[] buildDeepLinkIds() {
        return buildDeepLinkIds$default(this, (NavDestination) null, 1, (Object) null);
    }

    public final boolean hasRoute(String route2, Bundle arguments) {
        Intrinsics.checkNotNullParameter(route2, "route");
        if (Intrinsics.areEqual((Object) this.route, (Object) route2)) {
            return true;
        }
        DeepLinkMatch matchingDeepLink = matchRoute(route2);
        if (!Intrinsics.areEqual((Object) this, (Object) matchingDeepLink != null ? matchingDeepLink.getDestination() : null)) {
            return false;
        }
        return matchingDeepLink.hasMatchingArgs(arguments);
    }

    public boolean supportsActions() {
        return true;
    }

    public final NavAction getAction(int id2) {
        NavAction destination = this.actions.getIsEmpty() ? null : this.actions.get(id2);
        if (destination != null) {
            return destination;
        }
        NavGraph $this$getAction_u24lambda_u245 = this.parent;
        if ($this$getAction_u24lambda_u245 != null) {
            return $this$getAction_u24lambda_u245.getAction(id2);
        }
        return null;
    }

    public final void putAction(int actionId, int destId) {
        putAction(actionId, new NavAction(destId, (NavOptions) null, (Bundle) null, 6, (DefaultConstructorMarker) null));
    }

    public final void putAction(int actionId, NavAction action) {
        Intrinsics.checkNotNullParameter(action, "action");
        if (supportsActions()) {
            if (actionId != 0) {
                this.actions.put(actionId, action);
                return;
            }
            throw new IllegalArgumentException("Cannot have an action with actionId 0".toString());
        }
        throw new UnsupportedOperationException("Cannot add action " + actionId + " to " + this + " as it does not support actions, indicating that it is a terminal destination in your navigation graph and will never trigger actions.");
    }

    public final void removeAction(int actionId) {
        this.actions.remove(actionId);
    }

    public final void addArgument(String argumentName, NavArgument argument) {
        Intrinsics.checkNotNullParameter(argumentName, "argumentName");
        Intrinsics.checkNotNullParameter(argument, "argument");
        this._arguments.put(argumentName, argument);
    }

    public final void removeArgument(String argumentName) {
        Intrinsics.checkNotNullParameter(argumentName, "argumentName");
        this._arguments.remove(argumentName);
    }

    public final Bundle addInDefaultArgs(Bundle args) {
        if (args == null && this._arguments.isEmpty()) {
            return null;
        }
        Bundle defaultArgs = new Bundle();
        for (Map.Entry next : this._arguments.entrySet()) {
            ((NavArgument) next.getValue()).putDefaultValue((String) next.getKey(), defaultArgs);
        }
        if (args != null) {
            defaultArgs.putAll(args);
            for (Map.Entry next2 : this._arguments.entrySet()) {
                String key = (String) next2.getKey();
                NavArgument value = (NavArgument) next2.getValue();
                if (!value.isDefaultValueUnknown$navigation_common_release() && !value.verify(key, defaultArgs)) {
                    throw new IllegalArgumentException(("Wrong argument type for '" + key + "' in argument bundle. " + value.getType().getName() + " expected.").toString());
                }
            }
        }
        return defaultArgs;
    }

    public final String fillInLabel(Context context, Bundle bundle) {
        NavType argType;
        Intrinsics.checkNotNullParameter(context, "context");
        CharSequence label2 = this.label;
        if (label2 == null) {
            return null;
        }
        Matcher matcher = Pattern.compile("\\{(.+?)\\}").matcher(label2);
        StringBuffer builder = new StringBuffer();
        while (matcher.find()) {
            String argName = matcher.group(1);
            if (bundle == null || !bundle.containsKey(argName)) {
                throw new IllegalArgumentException("Could not find \"" + argName + "\" in " + bundle + " to fill label \"" + label2 + Typography.quote);
            }
            matcher.appendReplacement(builder, "");
            if (argName != null) {
                String str = argName;
                NavArgument navArgument = this._arguments.get(argName);
                argType = navArgument != null ? navArgument.getType() : null;
            } else {
                argType = null;
            }
            if (Intrinsics.areEqual((Object) argType, (Object) NavType.ReferenceType)) {
                String value = context.getString(bundle.getInt(argName));
                Intrinsics.checkNotNullExpressionValue(value, "context.getString(bundle.getInt(argName))");
                builder.append(value);
            } else {
                builder.append(String.valueOf(bundle.get(argName)));
            }
        }
        matcher.appendTail(builder);
        return builder.toString();
    }

    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append("(");
        if (this.idName == null) {
            sb.append("0x");
            sb.append(Integer.toHexString(this.id));
        } else {
            sb.append(this.idName);
        }
        sb.append(")");
        CharSequence charSequence = this.route;
        if (!(charSequence == null || StringsKt.isBlank(charSequence))) {
            sb.append(" route=");
            sb.append(this.route);
        }
        if (this.label != null) {
            sb.append(" label=");
            sb.append(this.label);
        }
        String sb2 = sb.toString();
        Intrinsics.checkNotNullExpressionValue(sb2, "sb.toString()");
        return sb2;
    }

    /* JADX WARNING: Removed duplicated region for block: B:21:0x007b  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public boolean equals(java.lang.Object r13) {
        /*
            r12 = this;
            r0 = 1
            if (r12 != r13) goto L_0x0004
            return r0
        L_0x0004:
            r1 = 0
            if (r13 == 0) goto L_0x00e7
            boolean r2 = r13 instanceof androidx.navigation.NavDestination
            if (r2 != 0) goto L_0x000d
            goto L_0x00e7
        L_0x000d:
            java.util.List<androidx.navigation.NavDeepLink> r2 = r12.deepLinks
            r3 = r13
            androidx.navigation.NavDestination r3 = (androidx.navigation.NavDestination) r3
            java.util.List<androidx.navigation.NavDeepLink> r3 = r3.deepLinks
            boolean r2 = kotlin.jvm.internal.Intrinsics.areEqual((java.lang.Object) r2, (java.lang.Object) r3)
            androidx.collection.SparseArrayCompat<androidx.navigation.NavAction> r3 = r12.actions
            int r3 = r3.size()
            r4 = r13
            androidx.navigation.NavDestination r4 = (androidx.navigation.NavDestination) r4
            androidx.collection.SparseArrayCompat<androidx.navigation.NavAction> r4 = r4.actions
            int r4 = r4.size()
            if (r3 != r4) goto L_0x0068
            androidx.collection.SparseArrayCompat<androidx.navigation.NavAction> r3 = r12.actions
            kotlin.collections.IntIterator r3 = androidx.collection.SparseArrayKt.keyIterator(r3)
            java.util.Iterator r3 = (java.util.Iterator) r3
            kotlin.sequences.Sequence r3 = kotlin.sequences.SequencesKt.asSequence(r3)
            r4 = 0
            java.util.Iterator r5 = r3.iterator()
        L_0x003a:
            boolean r6 = r5.hasNext()
            if (r6 == 0) goto L_0x0063
            java.lang.Object r6 = r5.next()
            r7 = r6
            java.lang.Number r7 = (java.lang.Number) r7
            int r7 = r7.intValue()
            r8 = 0
            androidx.collection.SparseArrayCompat<androidx.navigation.NavAction> r9 = r12.actions
            java.lang.Object r9 = r9.get(r7)
            r10 = r13
            androidx.navigation.NavDestination r10 = (androidx.navigation.NavDestination) r10
            androidx.collection.SparseArrayCompat<androidx.navigation.NavAction> r10 = r10.actions
            java.lang.Object r10 = r10.get(r7)
            boolean r7 = kotlin.jvm.internal.Intrinsics.areEqual((java.lang.Object) r9, (java.lang.Object) r10)
            if (r7 != 0) goto L_0x003a
            r3 = r1
            goto L_0x0064
        L_0x0063:
            r3 = r0
        L_0x0064:
            if (r3 == 0) goto L_0x0068
            r3 = r0
            goto L_0x0069
        L_0x0068:
            r3 = r1
        L_0x0069:
            java.util.Map<java.lang.String, androidx.navigation.NavArgument> r4 = r12._arguments
            int r4 = r4.size()
            r5 = r13
            androidx.navigation.NavDestination r5 = (androidx.navigation.NavDestination) r5
            java.util.Map<java.lang.String, androidx.navigation.NavArgument> r5 = r5._arguments
            int r5 = r5.size()
            if (r4 != r5) goto L_0x00c6
            java.util.Map<java.lang.String, androidx.navigation.NavArgument> r4 = r12._arguments
            kotlin.sequences.Sequence r4 = kotlin.collections.MapsKt.asSequence(r4)
            r5 = 0
            java.util.Iterator r6 = r4.iterator()
        L_0x0086:
            boolean r7 = r6.hasNext()
            if (r7 == 0) goto L_0x00c1
            java.lang.Object r7 = r6.next()
            r8 = r7
            java.util.Map$Entry r8 = (java.util.Map.Entry) r8
            r9 = 0
            r10 = r13
            androidx.navigation.NavDestination r10 = (androidx.navigation.NavDestination) r10
            java.util.Map<java.lang.String, androidx.navigation.NavArgument> r10 = r10._arguments
            java.lang.Object r11 = r8.getKey()
            boolean r10 = r10.containsKey(r11)
            if (r10 == 0) goto L_0x00bc
            r10 = r13
            androidx.navigation.NavDestination r10 = (androidx.navigation.NavDestination) r10
            java.util.Map<java.lang.String, androidx.navigation.NavArgument> r10 = r10._arguments
            java.lang.Object r11 = r8.getKey()
            java.lang.Object r10 = r10.get(r11)
            java.lang.Object r11 = r8.getValue()
            boolean r10 = kotlin.jvm.internal.Intrinsics.areEqual((java.lang.Object) r10, (java.lang.Object) r11)
            if (r10 == 0) goto L_0x00bc
            r8 = r0
            goto L_0x00bd
        L_0x00bc:
            r8 = r1
        L_0x00bd:
            if (r8 != 0) goto L_0x0086
            r4 = r1
            goto L_0x00c2
        L_0x00c1:
            r4 = r0
        L_0x00c2:
            if (r4 == 0) goto L_0x00c6
            r4 = r0
            goto L_0x00c7
        L_0x00c6:
            r4 = r1
        L_0x00c7:
            int r5 = r12.id
            r6 = r13
            androidx.navigation.NavDestination r6 = (androidx.navigation.NavDestination) r6
            int r6 = r6.id
            if (r5 != r6) goto L_0x00e5
            java.lang.String r5 = r12.route
            r6 = r13
            androidx.navigation.NavDestination r6 = (androidx.navigation.NavDestination) r6
            java.lang.String r6 = r6.route
            boolean r5 = kotlin.jvm.internal.Intrinsics.areEqual((java.lang.Object) r5, (java.lang.Object) r6)
            if (r5 == 0) goto L_0x00e5
            if (r2 == 0) goto L_0x00e5
            if (r3 == 0) goto L_0x00e5
            if (r4 == 0) goto L_0x00e5
            goto L_0x00e6
        L_0x00e5:
            r0 = r1
        L_0x00e6:
            return r0
        L_0x00e7:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.navigation.NavDestination.equals(java.lang.Object):boolean");
    }

    public int hashCode() {
        int result;
        Set<String> $this$forEach$iv;
        int i = this.id * 31;
        String str = this.route;
        int result2 = i + (str != null ? str.hashCode() : 0);
        for (NavDeepLink it : this.deepLinks) {
            int i2 = result * 31;
            String uriPattern = it.getUriPattern();
            int result3 = (i2 + (uriPattern != null ? uriPattern.hashCode() : 0)) * 31;
            String action = it.getAction();
            int result4 = (result3 + (action != null ? action.hashCode() : 0)) * 31;
            String mimeType = it.getMimeType();
            result2 = result4 + (mimeType != null ? mimeType.hashCode() : 0);
        }
        Iterator $this$forEach$iv2 = SparseArrayKt.valueIterator(this.actions);
        while ($this$forEach$iv2.hasNext()) {
            NavAction value = (NavAction) $this$forEach$iv2.next();
            int result5 = ((result * 31) + value.getDestinationId()) * 31;
            NavOptions navOptions = value.getNavOptions();
            result = result5 + (navOptions != null ? navOptions.hashCode() : 0);
            Bundle defaultArguments = value.getDefaultArguments();
            if (!(defaultArguments == null || ($this$forEach$iv = defaultArguments.keySet()) == null)) {
                Intrinsics.checkNotNullExpressionValue($this$forEach$iv, "keySet()");
                for (String it2 : $this$forEach$iv) {
                    int i3 = result * 31;
                    Bundle defaultArguments2 = value.getDefaultArguments();
                    Intrinsics.checkNotNull(defaultArguments2);
                    Object obj = defaultArguments2.get(it2);
                    result = i3 + (obj != null ? obj.hashCode() : 0);
                }
            }
        }
        for (String it3 : this._arguments.keySet()) {
            int result6 = ((result * 31) + it3.hashCode()) * 31;
            NavArgument navArgument = this._arguments.get(it3);
            result = result6 + (navArgument != null ? navArgument.hashCode() : 0);
        }
        return result;
    }

    @Metadata(d1 = {"\u0000@\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010%\n\u0002\u0010\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0006\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\b\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u0012\u0010\u000e\u001a\u00020\u00052\b\u0010\u000f\u001a\u0004\u0018\u00010\u0005H\u0007J\u0018\u0010\u0010\u001a\u00020\u00052\u0006\u0010\u0011\u001a\u00020\u00122\u0006\u0010\u0013\u001a\u00020\u0014H\u0007J:\u0010\u0015\u001a\f\u0012\b\b\u0001\u0012\u0004\u0018\u0001H\u00160\u0006\"\u0004\b\u0000\u0010\u00162\u0006\u0010\u0011\u001a\u00020\u00122\u0006\u0010\u0017\u001a\u00020\u00052\u0010\u0010\u0018\u001a\f\u0012\b\b\u0001\u0012\u0004\u0018\u0001H\u00160\u0006H\u0005J:\u0010\u0019\u001a\f\u0012\b\b\u0001\u0012\u0004\u0018\u0001H\u00160\u0006\"\u0004\b\u0000\u0010\u00162\u0006\u0010\u0011\u001a\u00020\u00122\u0006\u0010\u0017\u001a\u00020\u00052\u0010\u0010\u0018\u001a\f\u0012\b\b\u0001\u0012\u0004\u0018\u0001H\u00160\u0006H\u0007J\u0019\u0010\u001a\u001a\u00020\u001b\"\n\b\u0000\u0010\u001c\u0018\u0001*\u00020\u0001*\u00020\tH\bJ$\u0010\u001a\u001a\u00020\u001b\"\b\b\u0000\u0010\u001c*\u00020\u0001*\u00020\t2\f\u0010\u000f\u001a\b\u0012\u0004\u0012\u0002H\u001c0\u001dH\u0007R\u001e\u0010\u0003\u001a\u0012\u0012\u0004\u0012\u00020\u0005\u0012\b\u0012\u0006\u0012\u0002\b\u00030\u00060\u0004X\u0004¢\u0006\u0002\n\u0000R$\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\t0\b*\u00020\t8FX\u0004¢\u0006\f\u0012\u0004\b\n\u0010\u000b\u001a\u0004\b\f\u0010\r¨\u0006\u001e"}, d2 = {"Landroidx/navigation/NavDestination$Companion;", "", "()V", "classes", "", "", "Ljava/lang/Class;", "hierarchy", "Lkotlin/sequences/Sequence;", "Landroidx/navigation/NavDestination;", "getHierarchy$annotations", "(Landroidx/navigation/NavDestination;)V", "getHierarchy", "(Landroidx/navigation/NavDestination;)Lkotlin/sequences/Sequence;", "createRoute", "route", "getDisplayName", "context", "Landroid/content/Context;", "id", "", "parseClassFromName", "C", "name", "expectedClassType", "parseClassFromNameInternal", "hasRoute", "", "T", "Lkotlin/reflect/KClass;", "navigation-common_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
    /* compiled from: NavDestination.kt */
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        @JvmStatic
        public static /* synthetic */ void getHierarchy$annotations(NavDestination navDestination) {
        }

        private Companion() {
        }

        /* access modifiers changed from: protected */
        @JvmStatic
        public final <C> Class<? extends C> parseClassFromName(Context context, String name, Class<? extends C> expectedClassType) {
            Intrinsics.checkNotNullParameter(context, "context");
            Intrinsics.checkNotNullParameter(name, "name");
            Intrinsics.checkNotNullParameter(expectedClassType, "expectedClassType");
            String str = name;
            if (str.charAt(0) == '.') {
                str = context.getPackageName() + str;
            }
            Class clazz = (Class) NavDestination.classes.get(str);
            if (clazz == null) {
                try {
                    clazz = Class.forName(str, true, context.getClassLoader());
                    NavDestination.classes.put(name, clazz);
                } catch (ClassNotFoundException e) {
                    throw new IllegalArgumentException(e);
                }
            }
            Intrinsics.checkNotNull(clazz);
            if (expectedClassType.isAssignableFrom(clazz)) {
                return clazz;
            }
            throw new IllegalArgumentException((str + " must be a subclass of " + expectedClassType).toString());
        }

        @JvmStatic
        public final <C> Class<? extends C> parseClassFromNameInternal(Context context, String name, Class<? extends C> expectedClassType) {
            Intrinsics.checkNotNullParameter(context, "context");
            Intrinsics.checkNotNullParameter(name, "name");
            Intrinsics.checkNotNullParameter(expectedClassType, "expectedClassType");
            return NavDestination.parseClassFromName(context, name, expectedClassType);
        }

        @JvmStatic
        public final String getDisplayName(Context context, int id) {
            String str;
            Intrinsics.checkNotNullParameter(context, "context");
            if (id <= 16777215) {
                return String.valueOf(id);
            }
            try {
                str = context.getResources().getResourceName(id);
            } catch (Resources.NotFoundException e) {
                str = String.valueOf(id);
            }
            Intrinsics.checkNotNullExpressionValue(str, "try {\n                  …tring()\n                }");
            return str;
        }

        public final String createRoute(String route) {
            return route != null ? "android-app://androidx.navigation/" + route : "";
        }

        public final Sequence<NavDestination> getHierarchy(NavDestination $this$hierarchy) {
            Intrinsics.checkNotNullParameter($this$hierarchy, "<this>");
            return SequencesKt.generateSequence($this$hierarchy, NavDestination$Companion$hierarchy$1.INSTANCE);
        }

        @JvmStatic
        public final /* synthetic */ <T> boolean hasRoute(NavDestination $this$hasRoute) {
            Intrinsics.checkNotNullParameter($this$hasRoute, "<this>");
            Intrinsics.reifiedOperationMarker(4, "T");
            return hasRoute($this$hasRoute, Reflection.getOrCreateKotlinClass(Object.class));
        }

        @JvmStatic
        public final <T> boolean hasRoute(NavDestination $this$hasRoute, KClass<T> route) {
            Intrinsics.checkNotNullParameter($this$hasRoute, "<this>");
            Intrinsics.checkNotNullParameter(route, "route");
            return RouteSerializerKt.generateHashCode(SerializersKt.serializer(route)) == $this$hasRoute.getId();
        }
    }

    @JvmStatic
    protected static final <C> Class<? extends C> parseClassFromName(Context context, String name, Class<? extends C> expectedClassType) {
        return Companion.parseClassFromName(context, name, expectedClassType);
    }

    @JvmStatic
    public static final <C> Class<? extends C> parseClassFromNameInternal(Context context, String name, Class<? extends C> expectedClassType) {
        return Companion.parseClassFromNameInternal(context, name, expectedClassType);
    }

    @JvmStatic
    public static final String getDisplayName(Context context, int id2) {
        return Companion.getDisplayName(context, id2);
    }

    public static final Sequence<NavDestination> getHierarchy(NavDestination $this$getHierarchy) {
        return Companion.getHierarchy($this$getHierarchy);
    }

    @JvmStatic
    public static final <T> boolean hasRoute(NavDestination $this$hasRoute, KClass<T> route2) {
        return Companion.hasRoute($this$hasRoute, route2);
    }
}
