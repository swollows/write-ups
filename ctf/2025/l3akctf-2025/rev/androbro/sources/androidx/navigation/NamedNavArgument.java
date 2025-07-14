package androidx.navigation;

import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

@Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\b\u0018\u00002\u00020\u0001B\u0017\b\u0000\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005¢\u0006\u0002\u0010\u0006J\t\u0010\u000b\u001a\u00020\u0003H\u0002J\t\u0010\f\u001a\u00020\u0005H\u0002R\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\bR\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\n¨\u0006\r"}, d2 = {"Landroidx/navigation/NamedNavArgument;", "", "name", "", "argument", "Landroidx/navigation/NavArgument;", "(Ljava/lang/String;Landroidx/navigation/NavArgument;)V", "getArgument", "()Landroidx/navigation/NavArgument;", "getName", "()Ljava/lang/String;", "component1", "component2", "navigation-common_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* compiled from: NamedNavArgument.kt */
public final class NamedNavArgument {
    private final NavArgument argument;
    private final String name;

    public NamedNavArgument(String name2, NavArgument argument2) {
        Intrinsics.checkNotNullParameter(name2, "name");
        Intrinsics.checkNotNullParameter(argument2, "argument");
        this.name = name2;
        this.argument = argument2;
    }

    public final String getName() {
        return this.name;
    }

    public final NavArgument getArgument() {
        return this.argument;
    }

    public final String component1() {
        return this.name;
    }

    public final NavArgument component2() {
        return this.argument;
    }
}
