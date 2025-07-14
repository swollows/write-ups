package androidx.window.embedding;

import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.content.res.XmlResourceParser;
import androidx.window.R;
import java.util.HashSet;
import java.util.Set;
import kotlin.Metadata;
import kotlin.collections.SetsKt;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt;

@Metadata(d1 = {"\u0000Z\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\r\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\"\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0004\b\u0001\u0018\u00002\u00020\u0001B\u0005¢\u0006\u0002\u0010\u0002J\u001a\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u00062\b\u0010\u0007\u001a\u0004\u0018\u00010\bH\u0002J\u0018\u0010\t\u001a\u00020\n2\u0006\u0010\u000b\u001a\u00020\f2\u0006\u0010\r\u001a\u00020\u000eH\u0002J\u0018\u0010\u000f\u001a\u00020\u00102\u0006\u0010\u000b\u001a\u00020\f2\u0006\u0010\r\u001a\u00020\u000eH\u0002J\u0018\u0010\u0011\u001a\u00020\u00122\u0006\u0010\u000b\u001a\u00020\f2\u0006\u0010\r\u001a\u00020\u000eH\u0002J\u0018\u0010\u0013\u001a\u00020\u00142\u0006\u0010\u000b\u001a\u00020\f2\u0006\u0010\r\u001a\u00020\u000eH\u0002J\u0018\u0010\u0015\u001a\u00020\u00162\u0006\u0010\u000b\u001a\u00020\f2\u0006\u0010\r\u001a\u00020\u000eH\u0002J%\u0010\u0017\u001a\n\u0012\u0004\u0012\u00020\u0019\u0018\u00010\u00182\u0006\u0010\u000b\u001a\u00020\f2\u0006\u0010\u001a\u001a\u00020\u001bH\u0000¢\u0006\u0002\b\u001cJ \u0010\u001d\u001a\n\u0012\u0004\u0012\u00020\u0019\u0018\u00010\u00182\u0006\u0010\u000b\u001a\u00020\f2\u0006\u0010\u001e\u001a\u00020\u001bH\u0002¨\u0006\u001f"}, d2 = {"Landroidx/window/embedding/SplitRuleParser;", "", "()V", "buildClassName", "Landroid/content/ComponentName;", "pkg", "", "clsSeq", "", "parseActivityFilter", "Landroidx/window/embedding/ActivityFilter;", "context", "Landroid/content/Context;", "parser", "Landroid/content/res/XmlResourceParser;", "parseSplitActivityRule", "Landroidx/window/embedding/ActivityRule;", "parseSplitPairFilter", "Landroidx/window/embedding/SplitPairFilter;", "parseSplitPairRule", "Landroidx/window/embedding/SplitPairRule;", "parseSplitPlaceholderRule", "Landroidx/window/embedding/SplitPlaceholderRule;", "parseSplitRules", "", "Landroidx/window/embedding/EmbeddingRule;", "staticRuleResourceId", "", "parseSplitRules$window_release", "parseSplitXml", "splitResourceId", "window_release"}, k = 1, mv = {1, 6, 0}, xi = 48)
/* compiled from: SplitRuleParser.kt */
public final class SplitRuleParser {
    public final Set<EmbeddingRule> parseSplitRules$window_release(Context context, int staticRuleResourceId) {
        Intrinsics.checkNotNullParameter(context, "context");
        return parseSplitXml(context, staticRuleResourceId);
    }

    private final Set<EmbeddingRule> parseSplitXml(Context context, int splitResourceId) {
        try {
            XmlResourceParser xml = context.getResources().getXml(splitResourceId);
            Intrinsics.checkNotNullExpressionValue(xml, "resources.getXml(splitResourceId)");
            XmlResourceParser parser = xml;
            HashSet splitRuleConfigs = new HashSet();
            int depth = parser.getDepth();
            int type = parser.next();
            SplitPairRule lastSplitPairConfig = null;
            SplitPlaceholderRule lastSplitPlaceholderConfig = null;
            ActivityRule lastSplitActivityConfig = null;
            while (type != 1 && (type != 3 || parser.getDepth() > depth)) {
                if (parser.getEventType() != 2 || Intrinsics.areEqual((Object) "split-config", (Object) parser.getName())) {
                    type = parser.next();
                } else {
                    String name = parser.getName();
                    if (name != null) {
                        switch (name.hashCode()) {
                            case 511422343:
                                if (name.equals("ActivityFilter")) {
                                    if (lastSplitActivityConfig != null || lastSplitPlaceholderConfig != null) {
                                        ActivityFilter activityFilter = parseActivityFilter(context, parser);
                                        if (lastSplitActivityConfig == null) {
                                            if (lastSplitPlaceholderConfig != null) {
                                                splitRuleConfigs.remove(lastSplitPlaceholderConfig);
                                                lastSplitPlaceholderConfig = lastSplitPlaceholderConfig.plus$window_release(activityFilter);
                                                splitRuleConfigs.add(lastSplitPlaceholderConfig);
                                                break;
                                            }
                                        } else {
                                            splitRuleConfigs.remove(lastSplitActivityConfig);
                                            lastSplitActivityConfig = lastSplitActivityConfig.plus$window_release(activityFilter);
                                            splitRuleConfigs.add(lastSplitActivityConfig);
                                            break;
                                        }
                                    } else {
                                        throw new IllegalArgumentException("Found orphaned ActivityFilter");
                                    }
                                }
                                break;
                            case 520447504:
                                if (name.equals("SplitPairRule")) {
                                    lastSplitPairConfig = parseSplitPairRule(context, parser);
                                    splitRuleConfigs.add(lastSplitPairConfig);
                                    lastSplitPlaceholderConfig = null;
                                    lastSplitActivityConfig = null;
                                    break;
                                }
                                break;
                            case 1579230604:
                                if (name.equals("SplitPairFilter")) {
                                    if (lastSplitPairConfig != null) {
                                        SplitPairFilter splitFilter = parseSplitPairFilter(context, parser);
                                        splitRuleConfigs.remove(lastSplitPairConfig);
                                        lastSplitPairConfig = lastSplitPairConfig.plus$window_release(splitFilter);
                                        splitRuleConfigs.add(lastSplitPairConfig);
                                        break;
                                    } else {
                                        throw new IllegalArgumentException("Found orphaned SplitPairFilter outside of SplitPairRule");
                                    }
                                }
                                break;
                            case 1793077963:
                                if (name.equals("ActivityRule")) {
                                    ActivityRule activityConfig = parseSplitActivityRule(context, parser);
                                    splitRuleConfigs.add(activityConfig);
                                    lastSplitPairConfig = null;
                                    lastSplitPlaceholderConfig = null;
                                    lastSplitActivityConfig = activityConfig;
                                    break;
                                }
                                break;
                            case 2050988213:
                                if (name.equals("SplitPlaceholderRule")) {
                                    lastSplitPlaceholderConfig = parseSplitPlaceholderRule(context, parser);
                                    splitRuleConfigs.add(lastSplitPlaceholderConfig);
                                    lastSplitActivityConfig = null;
                                    lastSplitPairConfig = null;
                                    break;
                                }
                                break;
                        }
                    }
                    type = parser.next();
                }
            }
            return splitRuleConfigs;
        } catch (Resources.NotFoundException e) {
            return null;
        }
    }

    private final SplitPairRule parseSplitPairRule(Context context, XmlResourceParser parser) {
        TypedArray $this$parseSplitPairRule_u24lambda_u2d0 = context.getTheme().obtainStyledAttributes(parser, R.styleable.SplitPairRule, 0, 0);
        float ratio = $this$parseSplitPairRule_u24lambda_u2d0.getFloat(R.styleable.SplitPairRule_splitRatio, 0.0f);
        int minWidth = (int) $this$parseSplitPairRule_u24lambda_u2d0.getDimension(R.styleable.SplitPairRule_splitMinWidth, 0.0f);
        int layoutDir = $this$parseSplitPairRule_u24lambda_u2d0.getInt(R.styleable.SplitPairRule_splitLayoutDirection, 3);
        boolean finishPrimaryWithSecondary = $this$parseSplitPairRule_u24lambda_u2d0.getBoolean(R.styleable.SplitPairRule_finishPrimaryWithSecondary, false);
        boolean finishSecondaryWithPrimary = $this$parseSplitPairRule_u24lambda_u2d0.getBoolean(R.styleable.SplitPairRule_finishSecondaryWithPrimary, true);
        boolean clearTop = $this$parseSplitPairRule_u24lambda_u2d0.getBoolean(R.styleable.SplitPairRule_clearTop, false);
        return new SplitPairRule(SetsKt.emptySet(), finishPrimaryWithSecondary, finishSecondaryWithPrimary, clearTop, minWidth, (int) $this$parseSplitPairRule_u24lambda_u2d0.getDimension(R.styleable.SplitPairRule_splitMinSmallestWidth, 0.0f), ratio, layoutDir);
    }

    private final SplitPlaceholderRule parseSplitPlaceholderRule(Context context, XmlResourceParser parser) {
        TypedArray $this$parseSplitPlaceholderRule_u24lambda_u2d1 = context.getTheme().obtainStyledAttributes(parser, R.styleable.SplitPlaceholderRule, 0, 0);
        String string = $this$parseSplitPlaceholderRule_u24lambda_u2d1.getString(R.styleable.SplitPlaceholderRule_placeholderActivityName);
        float ratio = $this$parseSplitPlaceholderRule_u24lambda_u2d1.getFloat(R.styleable.SplitPlaceholderRule_splitRatio, 0.0f);
        int minWidth = (int) $this$parseSplitPlaceholderRule_u24lambda_u2d1.getDimension(R.styleable.SplitPlaceholderRule_splitMinWidth, 0.0f);
        int layoutDir = $this$parseSplitPlaceholderRule_u24lambda_u2d1.getInt(R.styleable.SplitPlaceholderRule_splitLayoutDirection, 3);
        String packageName = context.getApplicationContext().getPackageName();
        Intrinsics.checkNotNullExpressionValue(packageName, "packageName");
        ComponentName placeholderActivityClassName = buildClassName(packageName, string);
        Set emptySet = SetsKt.emptySet();
        Intent component = new Intent().setComponent(placeholderActivityClassName);
        Intrinsics.checkNotNullExpressionValue(component, "Intent().setComponent(pl…eholderActivityClassName)");
        return new SplitPlaceholderRule(emptySet, component, minWidth, (int) $this$parseSplitPlaceholderRule_u24lambda_u2d1.getDimension(R.styleable.SplitPlaceholderRule_splitMinSmallestWidth, 0.0f), ratio, layoutDir);
    }

    private final SplitPairFilter parseSplitPairFilter(Context context, XmlResourceParser parser) {
        TypedArray $this$parseSplitPairFilter_u24lambda_u2d2 = context.getTheme().obtainStyledAttributes(parser, R.styleable.SplitPairFilter, 0, 0);
        String string = $this$parseSplitPairFilter_u24lambda_u2d2.getString(R.styleable.SplitPairFilter_primaryActivityName);
        String string2 = $this$parseSplitPairFilter_u24lambda_u2d2.getString(R.styleable.SplitPairFilter_secondaryActivityName);
        String string3 = $this$parseSplitPairFilter_u24lambda_u2d2.getString(R.styleable.SplitPairFilter_secondaryActivityAction);
        String packageName = context.getApplicationContext().getPackageName();
        Intrinsics.checkNotNullExpressionValue(packageName, "packageName");
        return new SplitPairFilter(buildClassName(packageName, string), buildClassName(packageName, string2), string3);
    }

    private final ActivityRule parseSplitActivityRule(Context context, XmlResourceParser parser) {
        return new ActivityRule(SetsKt.emptySet(), context.getTheme().obtainStyledAttributes(parser, R.styleable.ActivityRule, 0, 0).getBoolean(R.styleable.ActivityRule_alwaysExpand, false));
    }

    private final ActivityFilter parseActivityFilter(Context context, XmlResourceParser parser) {
        TypedArray $this$parseActivityFilter_u24lambda_u2d4 = context.getTheme().obtainStyledAttributes(parser, R.styleable.ActivityFilter, 0, 0);
        String string = $this$parseActivityFilter_u24lambda_u2d4.getString(R.styleable.ActivityFilter_activityName);
        String string2 = $this$parseActivityFilter_u24lambda_u2d4.getString(R.styleable.ActivityFilter_activityAction);
        String packageName = context.getApplicationContext().getPackageName();
        Intrinsics.checkNotNullExpressionValue(packageName, "packageName");
        return new ActivityFilter(buildClassName(packageName, string), string2);
    }

    private final ComponentName buildClassName(String pkg, CharSequence clsSeq) {
        if (clsSeq != null) {
            if (!(clsSeq.length() == 0)) {
                String cls = clsSeq.toString();
                if (cls.charAt(0) == '.') {
                    return new ComponentName(pkg, Intrinsics.stringPlus(pkg, cls));
                }
                String pkgString = pkg;
                String clsString = cls;
                int pkgDividerIndex = StringsKt.indexOf$default((CharSequence) cls, '/', 0, false, 6, (Object) null);
                if (pkgDividerIndex > 0) {
                    String substring = cls.substring(0, pkgDividerIndex);
                    Intrinsics.checkNotNullExpressionValue(substring, "this as java.lang.String…ing(startIndex, endIndex)");
                    pkgString = substring;
                    String substring2 = cls.substring(pkgDividerIndex + 1);
                    Intrinsics.checkNotNullExpressionValue(substring2, "this as java.lang.String).substring(startIndex)");
                    clsString = substring2;
                }
                if (Intrinsics.areEqual((Object) clsString, (Object) "*") || StringsKt.indexOf$default((CharSequence) clsString, '.', 0, false, 6, (Object) null) >= 0) {
                    return new ComponentName(pkgString, clsString);
                }
                return new ComponentName(pkgString, pkgString + '.' + clsString);
            }
        }
        throw new IllegalArgumentException("Activity name must not be null");
    }
}
