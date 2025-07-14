package androidx.navigation;

import java.util.List;
import kotlin.Metadata;

@Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0010 \n\u0002\u0010\u000e\n\u0002\b\u0003\b&\u0018\u0000*\u0004\b\u0000\u0010\u00012\b\u0012\u0004\u0012\u0002H\u00010\u0002B\r\u0012\u0006\u0010\u0003\u001a\u00020\u0004¢\u0006\u0002\u0010\u0005J\r\u0010\u0006\u001a\u00028\u0000H&¢\u0006\u0002\u0010\u0007J\u001b\u0010\b\u001a\b\u0012\u0004\u0012\u00020\n0\t2\u0006\u0010\u000b\u001a\u00028\u0000H&¢\u0006\u0002\u0010\f¨\u0006\r"}, d2 = {"Landroidx/navigation/CollectionNavType;", "T", "Landroidx/navigation/NavType;", "isNullableAllowed", "", "(Z)V", "emptyCollection", "()Ljava/lang/Object;", "serializeAsValues", "", "", "value", "(Ljava/lang/Object;)Ljava/util/List;", "navigation-common_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* compiled from: CollectionNavType.kt */
public abstract class CollectionNavType<T> extends NavType<T> {
    public abstract T emptyCollection();

    public abstract List<String> serializeAsValues(T t);

    public CollectionNavType(boolean isNullableAllowed) {
        super(isNullableAllowed);
    }
}
