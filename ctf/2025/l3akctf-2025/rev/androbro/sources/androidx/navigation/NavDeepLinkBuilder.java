package androidx.navigation;

import android.app.Activity;
import android.app.PendingIntent;
import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import androidx.core.app.TaskStackBuilder;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.Metadata;
import kotlin.collections.ArrayDeque;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.Intrinsics;
import kotlin.sequences.SequencesKt;

@Metadata(d1 = {"\u0000t\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010!\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\t\u0018\u00002\u00020\u0001:\u0002-.B\u000f\b\u0010\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004B\r\u0012\u0006\u0010\u0005\u001a\u00020\u0006¢\u0006\u0002\u0010\u0007J\u001e\u0010\u0013\u001a\u00020\u00002\b\b\u0001\u0010\u0014\u001a\u00020\u00152\n\b\u0002\u0010\u0016\u001a\u0004\u0018\u00010\u000eH\u0007J\u001c\u0010\u0013\u001a\u00020\u00002\u0006\u0010\u0017\u001a\u00020\u00182\n\b\u0002\u0010\u0016\u001a\u0004\u0018\u00010\u000eH\u0007J\u0006\u0010\u0019\u001a\u00020\u001aJ\u0006\u0010\u001b\u001a\u00020\u001cJ\b\u0010\u001d\u001a\u00020\u001eH\u0002J\u0014\u0010\u001f\u001a\u0004\u0018\u00010 2\b\b\u0001\u0010\u0014\u001a\u00020\u0015H\u0002J\u0010\u0010!\u001a\u00020\u00002\b\u0010\u0016\u001a\u0004\u0018\u00010\u000eJ\u000e\u0010\"\u001a\u00020\u00002\u0006\u0010#\u001a\u00020$J\u0018\u0010\"\u001a\u00020\u00002\u0010\u0010%\u001a\f\u0012\b\b\u0001\u0012\u0004\u0018\u00010\t0&J\u001e\u0010'\u001a\u00020\u00002\b\b\u0001\u0010\u0014\u001a\u00020\u00152\n\b\u0002\u0010\u0016\u001a\u0004\u0018\u00010\u000eH\u0007J\u001c\u0010'\u001a\u00020\u00002\u0006\u0010(\u001a\u00020\u00182\n\b\u0002\u0010\u0016\u001a\u0004\u0018\u00010\u000eH\u0007J\u000e\u0010)\u001a\u00020\u00002\u0006\u0010*\u001a\u00020\u0010J\u0010\u0010)\u001a\u00020\u00002\b\b\u0001\u0010+\u001a\u00020\u0015J\b\u0010,\u001a\u00020\u001eH\u0002R\u0010\u0010\b\u001a\u0004\u0018\u00010\tX\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0006X\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\n\u001a\b\u0012\u0004\u0012\u00020\f0\u000bX\u0004¢\u0006\u0002\n\u0000R\u0010\u0010\r\u001a\u0004\u0018\u00010\u000eX\u000e¢\u0006\u0002\n\u0000R\u0010\u0010\u000f\u001a\u0004\u0018\u00010\u0010X\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u0011\u001a\u00020\u0012X\u0004¢\u0006\u0002\n\u0000¨\u0006/"}, d2 = {"Landroidx/navigation/NavDeepLinkBuilder;", "", "navController", "Landroidx/navigation/NavController;", "(Landroidx/navigation/NavController;)V", "context", "Landroid/content/Context;", "(Landroid/content/Context;)V", "activity", "Landroid/app/Activity;", "destinations", "", "Landroidx/navigation/NavDeepLinkBuilder$DeepLinkDestination;", "globalArgs", "Landroid/os/Bundle;", "graph", "Landroidx/navigation/NavGraph;", "intent", "Landroid/content/Intent;", "addDestination", "destId", "", "args", "route", "", "createPendingIntent", "Landroid/app/PendingIntent;", "createTaskStackBuilder", "Landroidx/core/app/TaskStackBuilder;", "fillInIntent", "", "findDestination", "Landroidx/navigation/NavDestination;", "setArguments", "setComponentName", "componentName", "Landroid/content/ComponentName;", "activityClass", "Ljava/lang/Class;", "setDestination", "destRoute", "setGraph", "navGraph", "navGraphId", "verifyAllDestinations", "DeepLinkDestination", "PermissiveNavigatorProvider", "navigation-runtime_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* compiled from: NavDeepLinkBuilder.kt */
public final class NavDeepLinkBuilder {
    private final Activity activity;
    private final Context context;
    private final List<DeepLinkDestination> destinations;
    private Bundle globalArgs;
    private NavGraph graph;
    private final Intent intent;

    @Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0002\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0005¢\u0006\u0002\u0010\u0006R\u0013\u0010\u0004\u001a\u0004\u0018\u00010\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\bR\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\n¨\u0006\u000b"}, d2 = {"Landroidx/navigation/NavDeepLinkBuilder$DeepLinkDestination;", "", "destinationId", "", "arguments", "Landroid/os/Bundle;", "(ILandroid/os/Bundle;)V", "getArguments", "()Landroid/os/Bundle;", "getDestinationId", "()I", "navigation-runtime_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
    /* compiled from: NavDeepLinkBuilder.kt */
    private static final class DeepLinkDestination {
        private final Bundle arguments;
        private final int destinationId;

        public DeepLinkDestination(int destinationId2, Bundle arguments2) {
            this.destinationId = destinationId2;
            this.arguments = arguments2;
        }

        public final Bundle getArguments() {
            return this.arguments;
        }

        public final int getDestinationId() {
            return this.destinationId;
        }
    }

    public NavDeepLinkBuilder(Context context2) {
        Intent launchIntent;
        Intrinsics.checkNotNullParameter(context2, "context");
        this.context = context2;
        this.activity = (Activity) SequencesKt.firstOrNull(SequencesKt.mapNotNull(SequencesKt.generateSequence(this.context, NavDeepLinkBuilder$activity$1.INSTANCE), NavDeepLinkBuilder$activity$2.INSTANCE));
        if (this.activity != null) {
            launchIntent = new Intent(this.context, this.activity.getClass());
        } else {
            launchIntent = this.context.getPackageManager().getLaunchIntentForPackage(this.context.getPackageName());
            if (launchIntent == null) {
                launchIntent = new Intent();
            }
        }
        launchIntent.addFlags(268468224);
        this.intent = launchIntent;
        this.destinations = new ArrayList();
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public NavDeepLinkBuilder(NavController navController) {
        this(navController.getContext());
        Intrinsics.checkNotNullParameter(navController, "navController");
        this.graph = navController.getGraph();
    }

    public final NavDeepLinkBuilder setComponentName(Class<? extends Activity> activityClass) {
        Intrinsics.checkNotNullParameter(activityClass, "activityClass");
        return setComponentName(new ComponentName(this.context, activityClass));
    }

    public final NavDeepLinkBuilder setComponentName(ComponentName componentName) {
        Intrinsics.checkNotNullParameter(componentName, "componentName");
        this.intent.setComponent(componentName);
        return this;
    }

    public final NavDeepLinkBuilder setGraph(int navGraphId) {
        return setGraph(new NavInflater(this.context, new PermissiveNavigatorProvider()).inflate(navGraphId));
    }

    public final NavDeepLinkBuilder setGraph(NavGraph navGraph) {
        Intrinsics.checkNotNullParameter(navGraph, "navGraph");
        this.graph = navGraph;
        verifyAllDestinations();
        return this;
    }

    public static /* synthetic */ NavDeepLinkBuilder setDestination$default(NavDeepLinkBuilder navDeepLinkBuilder, int i, Bundle bundle, int i2, Object obj) {
        if ((i2 & 2) != 0) {
            bundle = null;
        }
        return navDeepLinkBuilder.setDestination(i, bundle);
    }

    public final NavDeepLinkBuilder setDestination(int destId, Bundle args) {
        this.destinations.clear();
        this.destinations.add(new DeepLinkDestination(destId, args));
        if (this.graph != null) {
            verifyAllDestinations();
        }
        return this;
    }

    public final NavDeepLinkBuilder setDestination(int destId) {
        return setDestination$default(this, destId, (Bundle) null, 2, (Object) null);
    }

    public static /* synthetic */ NavDeepLinkBuilder setDestination$default(NavDeepLinkBuilder navDeepLinkBuilder, String str, Bundle bundle, int i, Object obj) {
        if ((i & 2) != 0) {
            bundle = null;
        }
        return navDeepLinkBuilder.setDestination(str, bundle);
    }

    public final NavDeepLinkBuilder setDestination(String destRoute, Bundle args) {
        Intrinsics.checkNotNullParameter(destRoute, "destRoute");
        this.destinations.clear();
        this.destinations.add(new DeepLinkDestination(NavDestination.Companion.createRoute(destRoute).hashCode(), args));
        if (this.graph != null) {
            verifyAllDestinations();
        }
        return this;
    }

    public final NavDeepLinkBuilder setDestination(String destRoute) {
        Intrinsics.checkNotNullParameter(destRoute, "destRoute");
        return setDestination$default(this, destRoute, (Bundle) null, 2, (Object) null);
    }

    public static /* synthetic */ NavDeepLinkBuilder addDestination$default(NavDeepLinkBuilder navDeepLinkBuilder, int i, Bundle bundle, int i2, Object obj) {
        if ((i2 & 2) != 0) {
            bundle = null;
        }
        return navDeepLinkBuilder.addDestination(i, bundle);
    }

    public final NavDeepLinkBuilder addDestination(int destId, Bundle args) {
        this.destinations.add(new DeepLinkDestination(destId, args));
        if (this.graph != null) {
            verifyAllDestinations();
        }
        return this;
    }

    public final NavDeepLinkBuilder addDestination(int destId) {
        return addDestination$default(this, destId, (Bundle) null, 2, (Object) null);
    }

    public static /* synthetic */ NavDeepLinkBuilder addDestination$default(NavDeepLinkBuilder navDeepLinkBuilder, String str, Bundle bundle, int i, Object obj) {
        if ((i & 2) != 0) {
            bundle = null;
        }
        return navDeepLinkBuilder.addDestination(str, bundle);
    }

    public final NavDeepLinkBuilder addDestination(String route, Bundle args) {
        Intrinsics.checkNotNullParameter(route, "route");
        this.destinations.add(new DeepLinkDestination(NavDestination.Companion.createRoute(route).hashCode(), args));
        if (this.graph != null) {
            verifyAllDestinations();
        }
        return this;
    }

    public final NavDeepLinkBuilder addDestination(String route) {
        Intrinsics.checkNotNullParameter(route, "route");
        return addDestination$default(this, route, (Bundle) null, 2, (Object) null);
    }

    private final NavDestination findDestination(int destId) {
        ArrayDeque possibleDestinations = new ArrayDeque();
        NavGraph navGraph = this.graph;
        Intrinsics.checkNotNull(navGraph);
        possibleDestinations.add(navGraph);
        while (!possibleDestinations.isEmpty()) {
            NavDestination destination = (NavDestination) possibleDestinations.removeFirst();
            if (destination.getId() == destId) {
                return destination;
            }
            if (destination instanceof NavGraph) {
                Iterator<NavDestination> it = ((NavGraph) destination).iterator();
                while (it.hasNext()) {
                    possibleDestinations.add(it.next());
                }
            }
        }
        return null;
    }

    private final void verifyAllDestinations() {
        for (DeepLinkDestination destination : this.destinations) {
            int destId = destination.getDestinationId();
            if (findDestination(destId) == null) {
                throw new IllegalArgumentException("Navigation destination " + NavDestination.Companion.getDisplayName(this.context, destId) + " cannot be found in the navigation graph " + this.graph);
            }
        }
    }

    private final void fillInIntent() {
        List deepLinkIds = new ArrayList();
        ArrayList deepLinkArgs = new ArrayList();
        NavDestination previousDestination = null;
        for (DeepLinkDestination destination : this.destinations) {
            int destId = destination.getDestinationId();
            Bundle arguments = destination.getArguments();
            NavDestination node = findDestination(destId);
            if (node != null) {
                for (int id : node.buildDeepLinkIds(previousDestination)) {
                    deepLinkIds.add(Integer.valueOf(id));
                    deepLinkArgs.add(arguments);
                }
                previousDestination = node;
            } else {
                throw new IllegalArgumentException("Navigation destination " + NavDestination.Companion.getDisplayName(this.context, destId) + " cannot be found in the navigation graph " + this.graph);
            }
        }
        this.intent.putExtra(NavController.KEY_DEEP_LINK_IDS, CollectionsKt.toIntArray(deepLinkIds));
        this.intent.putParcelableArrayListExtra(NavController.KEY_DEEP_LINK_ARGS, deepLinkArgs);
    }

    public final NavDeepLinkBuilder setArguments(Bundle args) {
        this.globalArgs = args;
        this.intent.putExtra(NavController.KEY_DEEP_LINK_EXTRAS, args);
        return this;
    }

    public final TaskStackBuilder createTaskStackBuilder() {
        if (this.graph == null) {
            throw new IllegalStateException("You must call setGraph() before constructing the deep link".toString());
        } else if (!this.destinations.isEmpty()) {
            fillInIntent();
            TaskStackBuilder taskStackBuilder = TaskStackBuilder.create(this.context).addNextIntentWithParentStack(new Intent(this.intent));
            Intrinsics.checkNotNullExpressionValue(taskStackBuilder, "create(context).addNextI…rentStack(Intent(intent))");
            int intentCount = taskStackBuilder.getIntentCount();
            for (int index = 0; index < intentCount; index++) {
                Intent editIntentAt = taskStackBuilder.editIntentAt(index);
                if (editIntentAt != null) {
                    editIntentAt.putExtra(NavController.KEY_DEEP_LINK_INTENT, this.intent);
                }
            }
            return taskStackBuilder;
        } else {
            throw new IllegalStateException("You must call setDestination() or addDestination() before constructing the deep link".toString());
        }
    }

    public final PendingIntent createPendingIntent() {
        int requestCode;
        int requestCode2 = 0;
        Bundle globalArgs2 = this.globalArgs;
        if (globalArgs2 != null) {
            for (String key : globalArgs2.keySet()) {
                Object value = globalArgs2.get(key);
                requestCode2 = (requestCode2 * 31) + (value != null ? value.hashCode() : 0);
            }
        }
        for (DeepLinkDestination destination : this.destinations) {
            requestCode = (requestCode * 31) + destination.getDestinationId();
            Bundle arguments = destination.getArguments();
            if (arguments != null) {
                for (String key2 : arguments.keySet()) {
                    Object value2 = arguments.get(key2);
                    requestCode = (requestCode * 31) + (value2 != null ? value2.hashCode() : 0);
                }
            }
        }
        PendingIntent pendingIntent = createTaskStackBuilder().getPendingIntent(requestCode, 201326592);
        Intrinsics.checkNotNull(pendingIntent);
        return pendingIntent;
    }

    @Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\b\u0002\u0018\u00002\u00020\u0001B\u0005¢\u0006\u0002\u0010\u0002J'\u0010\u0006\u001a\u0002H\u0007\"\u0010\b\u0000\u0010\u0007*\n\u0012\u0006\b\u0001\u0012\u00020\u00050\u00042\u0006\u0010\b\u001a\u00020\tH\u0016¢\u0006\u0002\u0010\nR\u0014\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004X\u0004¢\u0006\u0002\n\u0000¨\u0006\u000b"}, d2 = {"Landroidx/navigation/NavDeepLinkBuilder$PermissiveNavigatorProvider;", "Landroidx/navigation/NavigatorProvider;", "()V", "mDestNavigator", "Landroidx/navigation/Navigator;", "Landroidx/navigation/NavDestination;", "getNavigator", "T", "name", "", "(Ljava/lang/String;)Landroidx/navigation/Navigator;", "navigation-runtime_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
    /* compiled from: NavDeepLinkBuilder.kt */
    private static final class PermissiveNavigatorProvider extends NavigatorProvider {
        private final Navigator<NavDestination> mDestNavigator = new NavDeepLinkBuilder$PermissiveNavigatorProvider$mDestNavigator$1();

        public PermissiveNavigatorProvider() {
            addNavigator(new NavGraphNavigator(this));
        }

        public <T extends Navigator<? extends NavDestination>> T getNavigator(String name) {
            Intrinsics.checkNotNullParameter(name, "name");
            try {
                return super.getNavigator(name);
            } catch (IllegalStateException e) {
                T e2 = this.mDestNavigator;
                Intrinsics.checkNotNull(e2, "null cannot be cast to non-null type T of androidx.navigation.NavDeepLinkBuilder.PermissiveNavigatorProvider.getNavigator");
                return e2;
            }
        }
    }
}
