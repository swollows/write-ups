package androidx.navigation;

import androidx.core.app.ActivityOptionsCompat;
import androidx.navigation.ActivityNavigator;
import kotlin.Metadata;

@Metadata(d1 = {"\u0000\u0014\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\u001a\u001c\u0010\u0000\u001a\u00020\u00012\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u0005¨\u0006\u0006"}, d2 = {"ActivityNavigatorExtras", "Landroidx/navigation/ActivityNavigator$Extras;", "activityOptions", "Landroidx/core/app/ActivityOptionsCompat;", "flags", "", "navigation-runtime_release"}, k = 2, mv = {1, 8, 0}, xi = 48)
/* compiled from: ActivityNavigatorExtras.kt */
public final class ActivityNavigatorExtrasKt {
    public static /* synthetic */ ActivityNavigator.Extras ActivityNavigatorExtras$default(ActivityOptionsCompat activityOptionsCompat, int i, int i2, Object obj) {
        if ((i2 & 1) != 0) {
            activityOptionsCompat = null;
        }
        if ((i2 & 2) != 0) {
            i = 0;
        }
        return ActivityNavigatorExtras(activityOptionsCompat, i);
    }

    public static final ActivityNavigator.Extras ActivityNavigatorExtras(ActivityOptionsCompat activityOptions, int flags) {
        ActivityNavigator.Extras.Builder builder = new ActivityNavigator.Extras.Builder();
        ActivityNavigator.Extras.Builder $this$ActivityNavigatorExtras_u24lambda_u240 = builder;
        if (activityOptions != null) {
            $this$ActivityNavigatorExtras_u24lambda_u240.setActivityOptions(activityOptions);
        }
        $this$ActivityNavigatorExtras_u24lambda_u240.addFlags(flags);
        return builder.build();
    }
}
