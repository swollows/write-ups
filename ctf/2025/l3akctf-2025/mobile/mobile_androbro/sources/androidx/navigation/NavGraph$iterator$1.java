package androidx.navigation;

import androidx.collection.SparseArrayCompat;
import java.util.Iterator;
import java.util.NoSuchElementException;
import kotlin.Metadata;
import kotlin.jvm.internal.markers.KMutableIterator;

@Metadata(d1 = {"\u0000#\n\u0000\n\u0002\u0010)\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000*\u0001\u0000\b\n\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001J\t\u0010\u0007\u001a\u00020\u0006H\u0002J\t\u0010\b\u001a\u00020\u0002H\u0002J\b\u0010\t\u001a\u00020\nH\u0016R\u000e\u0010\u0003\u001a\u00020\u0004X\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0006X\u000e¢\u0006\u0002\n\u0000¨\u0006\u000b"}, d2 = {"androidx/navigation/NavGraph$iterator$1", "", "Landroidx/navigation/NavDestination;", "index", "", "wentToNext", "", "hasNext", "next", "remove", "", "navigation-common_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* compiled from: NavGraph.kt */
public final class NavGraph$iterator$1 implements Iterator<NavDestination>, KMutableIterator {
    private int index = -1;
    final /* synthetic */ NavGraph this$0;
    private boolean wentToNext;

    NavGraph$iterator$1(NavGraph $receiver) {
        this.this$0 = $receiver;
    }

    public boolean hasNext() {
        return this.index + 1 < this.this$0.getNodes().size();
    }

    public NavDestination next() {
        if (hasNext()) {
            this.wentToNext = true;
            SparseArrayCompat<NavDestination> nodes = this.this$0.getNodes();
            this.index++;
            return nodes.valueAt(this.index);
        }
        throw new NoSuchElementException();
    }

    public void remove() {
        if (this.wentToNext) {
            SparseArrayCompat $this$remove_u24lambda_u241 = this.this$0.getNodes();
            $this$remove_u24lambda_u241.valueAt(this.index).setParent((NavGraph) null);
            $this$remove_u24lambda_u241.removeAt(this.index);
            this.index--;
            this.wentToNext = false;
            return;
        }
        throw new IllegalStateException("You must call next() before you can remove an element".toString());
    }
}
