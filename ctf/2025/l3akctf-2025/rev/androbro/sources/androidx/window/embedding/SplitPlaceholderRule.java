package androidx.window.embedding;

import android.content.Intent;
import java.util.LinkedHashSet;
import java.util.Set;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.Intrinsics;

@Metadata(d1 = {"\u00008\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\"\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0007\n\u0002\b\u0007\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0005\b\u0007\u0018\u00002\u00020\u0001BC\u0012\f\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003\u0012\u0006\u0010\u0005\u001a\u00020\u0006\u0012\b\b\u0002\u0010\u0007\u001a\u00020\b\u0012\b\b\u0002\u0010\t\u001a\u00020\b\u0012\b\b\u0002\u0010\n\u001a\u00020\u000b\u0012\b\b\u0002\u0010\f\u001a\u00020\b¢\u0006\u0002\u0010\rJ\u0013\u0010\u0012\u001a\u00020\u00132\b\u0010\u0014\u001a\u0004\u0018\u00010\u0015H\u0002J\b\u0010\u0016\u001a\u00020\bH\u0016J\u0016\u0010\u0017\u001a\u00020\u00002\u0006\u0010\u0018\u001a\u00020\u0004H\u0002¢\u0006\u0002\b\u0019R\u0017\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\u000fR\u0011\u0010\u0005\u001a\u00020\u0006¢\u0006\b\n\u0000\u001a\u0004\b\u0010\u0010\u0011¨\u0006\u001a"}, d2 = {"Landroidx/window/embedding/SplitPlaceholderRule;", "Landroidx/window/embedding/SplitRule;", "filters", "", "Landroidx/window/embedding/ActivityFilter;", "placeholderIntent", "Landroid/content/Intent;", "minWidth", "", "minSmallestWidth", "splitRatio", "", "layoutDirection", "(Ljava/util/Set;Landroid/content/Intent;IIFI)V", "getFilters", "()Ljava/util/Set;", "getPlaceholderIntent", "()Landroid/content/Intent;", "equals", "", "other", "", "hashCode", "plus", "filter", "plus$window_release", "window_release"}, k = 1, mv = {1, 6, 0}, xi = 48)
/* compiled from: SplitPlaceholderRule.kt */
public final class SplitPlaceholderRule extends SplitRule {
    private final Set<ActivityFilter> filters;
    private final Intent placeholderIntent;

    /* JADX WARNING: Illegal instructions before constructor call */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public /* synthetic */ SplitPlaceholderRule(java.util.Set r10, android.content.Intent r11, int r12, int r13, float r14, int r15, int r16, kotlin.jvm.internal.DefaultConstructorMarker r17) {
        /*
            r9 = this;
            r0 = r16 & 4
            r1 = 0
            if (r0 == 0) goto L_0x0007
            r5 = r1
            goto L_0x0008
        L_0x0007:
            r5 = r12
        L_0x0008:
            r0 = r16 & 8
            if (r0 == 0) goto L_0x000e
            r6 = r1
            goto L_0x000f
        L_0x000e:
            r6 = r13
        L_0x000f:
            r0 = r16 & 16
            if (r0 == 0) goto L_0x0017
            r0 = 1056964608(0x3f000000, float:0.5)
            r7 = r0
            goto L_0x0018
        L_0x0017:
            r7 = r14
        L_0x0018:
            r0 = r16 & 32
            if (r0 == 0) goto L_0x001f
            r0 = 3
            r8 = r0
            goto L_0x0020
        L_0x001f:
            r8 = r15
        L_0x0020:
            r2 = r9
            r3 = r10
            r4 = r11
            r2.<init>(r3, r4, r5, r6, r7, r8)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.window.embedding.SplitPlaceholderRule.<init>(java.util.Set, android.content.Intent, int, int, float, int, int, kotlin.jvm.internal.DefaultConstructorMarker):void");
    }

    public final Intent getPlaceholderIntent() {
        return this.placeholderIntent;
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public SplitPlaceholderRule(Set<ActivityFilter> filters2, Intent placeholderIntent2, int minWidth, int minSmallestWidth, float splitRatio, int layoutDirection) {
        super(minWidth, minSmallestWidth, splitRatio, layoutDirection);
        Intrinsics.checkNotNullParameter(filters2, "filters");
        Intrinsics.checkNotNullParameter(placeholderIntent2, "placeholderIntent");
        this.placeholderIntent = placeholderIntent2;
        this.filters = CollectionsKt.toSet(filters2);
    }

    public final Set<ActivityFilter> getFilters() {
        return this.filters;
    }

    public final SplitPlaceholderRule plus$window_release(ActivityFilter filter) {
        Intrinsics.checkNotNullParameter(filter, "filter");
        Set newSet = new LinkedHashSet();
        newSet.addAll(this.filters);
        newSet.add(filter);
        return new SplitPlaceholderRule(CollectionsKt.toSet(newSet), this.placeholderIntent, getMinWidth(), getMinSmallestWidth(), getSplitRatio(), getLayoutDirection());
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if ((other instanceof SplitPlaceholderRule) && super.equals(other) && super.equals(other) && Intrinsics.areEqual((Object) this.filters, (Object) ((SplitPlaceholderRule) other).filters) && Intrinsics.areEqual((Object) this.placeholderIntent, (Object) ((SplitPlaceholderRule) other).placeholderIntent)) {
            return true;
        }
        return false;
    }

    public int hashCode() {
        return (((super.hashCode() * 31) + this.filters.hashCode()) * 31) + this.placeholderIntent.hashCode();
    }
}
