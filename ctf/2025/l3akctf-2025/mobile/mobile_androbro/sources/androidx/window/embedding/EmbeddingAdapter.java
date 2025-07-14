package androidx.window.embedding;

import android.app.Activity;
import android.content.Intent;
import android.util.Pair;
import android.view.WindowMetrics;
import androidx.window.extensions.embedding.ActivityRule;
import androidx.window.extensions.embedding.ActivityStack;
import androidx.window.extensions.embedding.EmbeddingRule;
import androidx.window.extensions.embedding.SplitInfo;
import androidx.window.extensions.embedding.SplitPairRule;
import androidx.window.extensions.embedding.SplitPlaceholderRule;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import java.util.Set;
import java.util.function.Predicate;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.Intrinsics;

@Metadata(d1 = {"\u0000\\\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0000\n\u0002\u0010\"\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0001\u0018\u00002\u00020\u0001B\u0005¢\u0006\u0002\u0010\u0002J\u0010\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u0006H\u0002J\u001a\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00040\u00072\f\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00060\u0007J\u001a\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\n0\t2\f\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\f0\tJ(\u0010\r\u001a\u0014\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00020\u0010\u0012\u0004\u0012\u00020\u00110\u000f0\u000e2\f\u0010\u0012\u001a\b\u0012\u0004\u0012\u00020\u00130\tH\u0007J(\u0010\u0014\u001a\u0014\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00020\u0010\u0012\u0004\u0012\u00020\u00100\u000f0\u000e2\f\u0010\u0012\u001a\b\u0012\u0004\u0012\u00020\u00130\tH\u0007J\u001c\u0010\u0015\u001a\b\u0012\u0004\u0012\u00020\u00100\u000e2\f\u0010\u0016\u001a\b\u0012\u0004\u0012\u00020\u00170\tH\u0007J\u001c\u0010\u0018\u001a\b\u0012\u0004\u0012\u00020\u00110\u000e2\f\u0010\u0016\u001a\b\u0012\u0004\u0012\u00020\u00170\tH\u0007J\u0016\u0010\u0019\u001a\b\u0012\u0004\u0012\u00020\u001a0\u000e2\u0006\u0010\u001b\u001a\u00020\u001cH\u0007J*\u0010\u001d\u001a\u0002H\u001e\"\u0004\b\u0000\u0010\u001e\"\u0004\b\u0001\u0010\u001f*\u000e\u0012\u0004\u0012\u0002H\u001e\u0012\u0004\u0012\u0002H\u001f0\u000fH\u0002¢\u0006\u0002\u0010 J*\u0010!\u001a\u0002H\u001f\"\u0004\b\u0000\u0010\u001e\"\u0004\b\u0001\u0010\u001f*\u000e\u0012\u0004\u0012\u0002H\u001e\u0012\u0004\u0012\u0002H\u001f0\u000fH\u0002¢\u0006\u0002\u0010 ¨\u0006\""}, d2 = {"Landroidx/window/embedding/EmbeddingAdapter;", "", "()V", "translate", "Landroidx/window/embedding/SplitInfo;", "splitInfo", "Landroidx/window/extensions/embedding/SplitInfo;", "", "splitInfoList", "", "Landroidx/window/extensions/embedding/EmbeddingRule;", "rules", "Landroidx/window/embedding/EmbeddingRule;", "translateActivityIntentPredicates", "Ljava/util/function/Predicate;", "Landroid/util/Pair;", "Landroid/app/Activity;", "Landroid/content/Intent;", "splitPairFilters", "Landroidx/window/embedding/SplitPairFilter;", "translateActivityPairPredicates", "translateActivityPredicates", "activityFilters", "Landroidx/window/embedding/ActivityFilter;", "translateIntentPredicates", "translateParentMetricsPredicate", "Landroid/view/WindowMetrics;", "splitRule", "Landroidx/window/embedding/SplitRule;", "component1", "F", "S", "(Landroid/util/Pair;)Ljava/lang/Object;", "component2", "window_release"}, k = 1, mv = {1, 6, 0}, xi = 48)
/* compiled from: EmbeddingAdapter.kt */
public final class EmbeddingAdapter {
    public final List<SplitInfo> translate(List<? extends SplitInfo> splitInfoList) {
        Intrinsics.checkNotNullParameter(splitInfoList, "splitInfoList");
        Iterable<SplitInfo> $this$map$iv = splitInfoList;
        Collection destination$iv$iv = new ArrayList(CollectionsKt.collectionSizeOrDefault($this$map$iv, 10));
        for (SplitInfo p0 : $this$map$iv) {
            destination$iv$iv.add(translate(p0));
        }
        return (List) destination$iv$iv;
    }

    private final SplitInfo translate(SplitInfo splitInfo) {
        boolean isPrimaryStackEmpty;
        ActivityStack primaryActivityStack = splitInfo.getPrimaryActivityStack();
        Intrinsics.checkNotNullExpressionValue(primaryActivityStack, "splitInfo.primaryActivityStack");
        boolean isSecondaryStackEmpty = false;
        try {
            isPrimaryStackEmpty = primaryActivityStack.isEmpty();
        } catch (NoSuchMethodError e) {
            isPrimaryStackEmpty = false;
        }
        List activities = primaryActivityStack.getActivities();
        Intrinsics.checkNotNullExpressionValue(activities, "primaryActivityStack.activities");
        ActivityStack primaryFragment = new ActivityStack(activities, isPrimaryStackEmpty);
        ActivityStack secondaryActivityStack = splitInfo.getSecondaryActivityStack();
        Intrinsics.checkNotNullExpressionValue(secondaryActivityStack, "splitInfo.secondaryActivityStack");
        try {
            isSecondaryStackEmpty = secondaryActivityStack.isEmpty();
        } catch (NoSuchMethodError e2) {
        }
        List activities2 = secondaryActivityStack.getActivities();
        Intrinsics.checkNotNullExpressionValue(activities2, "secondaryActivityStack.activities");
        return new SplitInfo(primaryFragment, new ActivityStack(activities2, isSecondaryStackEmpty), splitInfo.getSplitRatio());
    }

    public final Predicate<Pair<Activity, Activity>> translateActivityPairPredicates(Set<SplitPairFilter> splitPairFilters) {
        Intrinsics.checkNotNullParameter(splitPairFilters, "splitPairFilters");
        return new EmbeddingAdapter$$ExternalSyntheticLambda2(this, splitPairFilters);
    }

    /* access modifiers changed from: private */
    /* renamed from: translateActivityPairPredicates$lambda-1  reason: not valid java name */
    public static final boolean m175translateActivityPairPredicates$lambda1(EmbeddingAdapter this$0, Set $splitPairFilters, Pair $dstr$first$second) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        Intrinsics.checkNotNullParameter($splitPairFilters, "$splitPairFilters");
        Intrinsics.checkNotNullExpressionValue($dstr$first$second, "(first, second)");
        Activity first = (Activity) this$0.component1($dstr$first$second);
        Activity second = (Activity) this$0.component2($dstr$first$second);
        Iterable<SplitPairFilter> $this$any$iv = $splitPairFilters;
        if (($this$any$iv instanceof Collection) && ((Collection) $this$any$iv).isEmpty()) {
            return false;
        }
        for (SplitPairFilter filter : $this$any$iv) {
            if (filter.matchesActivityPair(first, second)) {
                return true;
            }
        }
        return false;
    }

    public final Predicate<Pair<Activity, Intent>> translateActivityIntentPredicates(Set<SplitPairFilter> splitPairFilters) {
        Intrinsics.checkNotNullParameter(splitPairFilters, "splitPairFilters");
        return new EmbeddingAdapter$$ExternalSyntheticLambda3(this, splitPairFilters);
    }

    /* access modifiers changed from: private */
    /* renamed from: translateActivityIntentPredicates$lambda-3  reason: not valid java name */
    public static final boolean m174translateActivityIntentPredicates$lambda3(EmbeddingAdapter this$0, Set $splitPairFilters, Pair $dstr$first$second) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        Intrinsics.checkNotNullParameter($splitPairFilters, "$splitPairFilters");
        Intrinsics.checkNotNullExpressionValue($dstr$first$second, "(first, second)");
        Activity first = (Activity) this$0.component1($dstr$first$second);
        Intent second = (Intent) this$0.component2($dstr$first$second);
        Iterable<SplitPairFilter> $this$any$iv = $splitPairFilters;
        if (($this$any$iv instanceof Collection) && ((Collection) $this$any$iv).isEmpty()) {
            return false;
        }
        for (SplitPairFilter filter : $this$any$iv) {
            if (filter.matchesActivityIntentPair(first, second)) {
                return true;
            }
        }
        return false;
    }

    public final Predicate<WindowMetrics> translateParentMetricsPredicate(SplitRule splitRule) {
        Intrinsics.checkNotNullParameter(splitRule, "splitRule");
        return new EmbeddingAdapter$$ExternalSyntheticLambda1(splitRule);
    }

    /* access modifiers changed from: private */
    /* renamed from: translateParentMetricsPredicate$lambda-4  reason: not valid java name */
    public static final boolean m178translateParentMetricsPredicate$lambda4(SplitRule $splitRule, WindowMetrics windowMetrics) {
        Intrinsics.checkNotNullParameter($splitRule, "$splitRule");
        Intrinsics.checkNotNullExpressionValue(windowMetrics, "windowMetrics");
        return $splitRule.checkParentMetrics(windowMetrics);
    }

    public final Predicate<Activity> translateActivityPredicates(Set<ActivityFilter> activityFilters) {
        Intrinsics.checkNotNullParameter(activityFilters, "activityFilters");
        return new EmbeddingAdapter$$ExternalSyntheticLambda4(activityFilters);
    }

    /* access modifiers changed from: private */
    /* renamed from: translateActivityPredicates$lambda-6  reason: not valid java name */
    public static final boolean m176translateActivityPredicates$lambda6(Set $activityFilters, Activity activity) {
        Intrinsics.checkNotNullParameter($activityFilters, "$activityFilters");
        Iterable<ActivityFilter> $this$any$iv = $activityFilters;
        if (($this$any$iv instanceof Collection) && ((Collection) $this$any$iv).isEmpty()) {
            return false;
        }
        for (ActivityFilter filter : $this$any$iv) {
            Intrinsics.checkNotNullExpressionValue(activity, "activity");
            if (filter.matchesActivity(activity)) {
                return true;
            }
        }
        return false;
    }

    public final Predicate<Intent> translateIntentPredicates(Set<ActivityFilter> activityFilters) {
        Intrinsics.checkNotNullParameter(activityFilters, "activityFilters");
        return new EmbeddingAdapter$$ExternalSyntheticLambda0(activityFilters);
    }

    /* access modifiers changed from: private */
    /* renamed from: translateIntentPredicates$lambda-8  reason: not valid java name */
    public static final boolean m177translateIntentPredicates$lambda8(Set $activityFilters, Intent intent) {
        Intrinsics.checkNotNullParameter($activityFilters, "$activityFilters");
        Iterable<ActivityFilter> $this$any$iv = $activityFilters;
        if (($this$any$iv instanceof Collection) && ((Collection) $this$any$iv).isEmpty()) {
            return false;
        }
        for (ActivityFilter filter : $this$any$iv) {
            Intrinsics.checkNotNullExpressionValue(intent, "intent");
            if (filter.matchesIntent(intent)) {
                return true;
            }
        }
        return false;
    }

    public final Set<EmbeddingRule> translate(Set<? extends EmbeddingRule> rules) {
        SplitPairRule splitPairRule;
        Intrinsics.checkNotNullParameter(rules, "rules");
        Iterable<EmbeddingRule> $this$map$iv = rules;
        Collection destination$iv$iv = new ArrayList(CollectionsKt.collectionSizeOrDefault($this$map$iv, 10));
        for (EmbeddingRule rule : $this$map$iv) {
            if (rule instanceof SplitPairRule) {
                splitPairRule = new SplitPairRule.Builder(translateActivityPairPredicates(((SplitPairRule) rule).getFilters()), translateActivityIntentPredicates(((SplitPairRule) rule).getFilters()), translateParentMetricsPredicate((SplitRule) rule)).setSplitRatio(((SplitPairRule) rule).getSplitRatio()).setLayoutDirection(((SplitPairRule) rule).getLayoutDirection()).setShouldFinishPrimaryWithSecondary(((SplitPairRule) rule).getFinishPrimaryWithSecondary()).setShouldFinishSecondaryWithPrimary(((SplitPairRule) rule).getFinishSecondaryWithPrimary()).setShouldClearTop(((SplitPairRule) rule).getClearTop()).build();
                Intrinsics.checkNotNullExpressionValue(splitPairRule, "SplitPairRuleBuilder(\n  …                 .build()");
            } else if (rule instanceof SplitPlaceholderRule) {
                splitPairRule = new SplitPlaceholderRule.Builder(((SplitPlaceholderRule) rule).getPlaceholderIntent(), translateActivityPredicates(((SplitPlaceholderRule) rule).getFilters()), translateIntentPredicates(((SplitPlaceholderRule) rule).getFilters()), translateParentMetricsPredicate((SplitRule) rule)).setSplitRatio(((SplitPlaceholderRule) rule).getSplitRatio()).setLayoutDirection(((SplitPlaceholderRule) rule).getLayoutDirection()).build();
                Intrinsics.checkNotNullExpressionValue(splitPairRule, "SplitPlaceholderRuleBuil…                 .build()");
            } else if (rule instanceof ActivityRule) {
                splitPairRule = new ActivityRule.Builder(translateActivityPredicates(((ActivityRule) rule).getFilters()), translateIntentPredicates(((ActivityRule) rule).getFilters())).setShouldAlwaysExpand(((ActivityRule) rule).getAlwaysExpand()).build();
                Intrinsics.checkNotNullExpressionValue(splitPairRule, "ActivityRuleBuilder(\n   …                 .build()");
            } else {
                throw new IllegalArgumentException("Unsupported rule type");
            }
            destination$iv$iv.add((EmbeddingRule) splitPairRule);
        }
        return CollectionsKt.toSet((List) destination$iv$iv);
    }

    private final <F, S> F component1(Pair<F, S> $this$component1) {
        Intrinsics.checkNotNullParameter($this$component1, "<this>");
        return $this$component1.first;
    }

    private final <F, S> S component2(Pair<F, S> $this$component2) {
        Intrinsics.checkNotNullParameter($this$component2, "<this>");
        return $this$component2.second;
    }
}
