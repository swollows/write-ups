package androidx.navigation;

import android.net.Uri;
import android.os.Bundle;
import androidx.core.os.BundleKt;
import androidx.navigation.serialization.RouteSerializerKt;
import java.util.ArrayList;
import java.util.Collection;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.ListIterator;
import java.util.Map;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import kotlin.Lazy;
import kotlin.LazyKt;
import kotlin.LazyThreadSafetyMode;
import kotlin.Metadata;
import kotlin.Pair;
import kotlin.TuplesKt;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.collections.MapsKt;
import kotlin.jvm.JvmStatic;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Reflection;
import kotlin.reflect.KClass;
import kotlin.reflect.KType;
import kotlin.text.Regex;
import kotlin.text.StringsKt;
import kotlinx.serialization.SerializersKt;

@Metadata(d1 = {"\u0000\u0001\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\b\n\u0002\u0010 \n\u0002\b\u0003\n\u0002\u0010!\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u000b\n\u0002\b\u0012\n\u0002\u0010%\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010$\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\f\n\u0002\u0018\u0002\n\u0002\b\u0011\u0018\u0000 m2\u00020\u0001:\u0004lmnoB\u000f\b\u0017\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004B%\b\u0000\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\u0003¢\u0006\u0002\u0010\bJ*\u0010;\u001a\u00020<2\u0006\u0010\u0002\u001a\u00020\u00032\f\u0010=\u001a\b\u0012\u0004\u0012\u00020\u00030\u00102\n\u0010>\u001a\u00060?j\u0002`@H\u0002J\u0017\u0010A\u001a\u00020B2\b\u0010C\u001a\u0004\u0018\u00010DH\u0000¢\u0006\u0002\bEJ\u0013\u0010F\u001a\u00020\"2\b\u0010G\u001a\u0004\u0018\u00010\u0001H\u0002J(\u0010H\u001a\u0004\u0018\u00010I2\u0006\u0010J\u001a\u00020D2\u0014\u0010K\u001a\u0010\u0012\u0004\u0012\u00020\u0003\u0012\u0006\u0012\u0004\u0018\u00010M0LH\u0007J-\u0010N\u001a\u00020I2\b\u0010J\u001a\u0004\u0018\u00010D2\u0014\u0010K\u001a\u0010\u0012\u0004\u0012\u00020\u0003\u0012\u0006\u0012\u0004\u0018\u00010M0LH\u0000¢\u0006\u0002\bOJ.\u0010P\u001a\u00020\"2\u0006\u0010Q\u001a\u00020R2\u0006\u0010S\u001a\u00020I2\u0014\u0010K\u001a\u0010\u0012\u0004\u0012\u00020\u0003\u0012\u0006\u0012\u0004\u0018\u00010M0LH\u0002J.\u0010T\u001a\u00020\"2\u0006\u0010J\u001a\u00020D2\u0006\u0010S\u001a\u00020I2\u0014\u0010K\u001a\u0010\u0012\u0004\u0012\u00020\u0003\u0012\u0006\u0012\u0004\u0018\u00010M0LH\u0002J0\u0010U\u001a\u00020<2\b\u0010V\u001a\u0004\u0018\u00010\u00032\u0006\u0010S\u001a\u00020I2\u0014\u0010K\u001a\u0010\u0012\u0004\u0012\u00020\u0003\u0012\u0006\u0012\u0004\u0018\u00010M0LH\u0002J\u0010\u0010W\u001a\u00020B2\u0006\u0010\u0007\u001a\u00020\u0003H\u0007J\b\u0010X\u001a\u00020BH\u0016J\u0012\u0010Y\u001a\u00020\"2\b\u0010\u0006\u001a\u0004\u0018\u00010\u0003H\u0002J\u0012\u0010Z\u001a\u00020\"2\b\u0010\u0007\u001a\u0004\u0018\u00010\u0003H\u0002J\u0012\u0010[\u001a\u00020\"2\b\u0010\u0002\u001a\u0004\u0018\u00010DH\u0002J\u0015\u0010\\\u001a\u00020\"2\u0006\u0010\u0002\u001a\u00020DH\u0000¢\u0006\u0002\b]J\u0015\u0010\\\u001a\u00020\"2\u0006\u0010^\u001a\u00020_H\u0000¢\u0006\u0002\b]J*\u0010`\u001a\u00020<2\u0006\u0010S\u001a\u00020I2\u0006\u0010a\u001a\u00020\u00032\u0006\u0010b\u001a\u00020\u00032\b\u0010c\u001a\u0004\u0018\u00010MH\u0002J,\u0010d\u001a\u00020\"2\u0006\u0010S\u001a\u00020I2\u0006\u0010a\u001a\u00020\u00032\b\u0010b\u001a\u0004\u0018\u00010\u00032\b\u0010c\u001a\u0004\u0018\u00010MH\u0002J\u001c\u0010e\u001a\u0016\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00030\u0010\u0012\u0004\u0012\u00020\u0003\u0018\u00010\u0015H\u0002J<\u0010f\u001a\u00020\"2\f\u0010g\u001a\b\u0012\u0004\u0012\u00020\u00030\f2\u0006\u0010h\u001a\u0002062\u0006\u0010S\u001a\u00020I2\u0014\u0010K\u001a\u0010\u0012\u0004\u0012\u00020\u0003\u0012\u0006\u0012\u0004\u0018\u00010M0LH\u0002J\b\u0010i\u001a\u00020<H\u0002J\b\u0010j\u001a\u00020<H\u0002J\u0014\u0010k\u001a\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020605H\u0002R\u0013\u0010\u0006\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\nR\u001a\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\u00030\f8@X\u0004¢\u0006\u0006\u001a\u0004\b\r\u0010\u000eR!\u0010\u000f\u001a\b\u0012\u0004\u0012\u00020\u00030\u00108BX\u0002¢\u0006\f\n\u0004\b\u0012\u0010\u0013\u001a\u0004\b\u0011\u0010\u000eR/\u0010\u0014\u001a\u0016\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00030\u0010\u0012\u0004\u0012\u00020\u0003\u0018\u00010\u00158BX\u0002¢\u0006\f\n\u0004\b\u0018\u0010\u0013\u001a\u0004\b\u0016\u0010\u0017R\u001d\u0010\u0019\u001a\u0004\u0018\u00010\u001a8BX\u0002¢\u0006\f\n\u0004\b\u001d\u0010\u0013\u001a\u0004\b\u001b\u0010\u001cR\u001d\u0010\u001e\u001a\u0004\u0018\u00010\u00038BX\u0002¢\u0006\f\n\u0004\b \u0010\u0013\u001a\u0004\b\u001f\u0010\nR&\u0010#\u001a\u00020\"2\u0006\u0010!\u001a\u00020\"8G@@X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b#\u0010$\"\u0004\b%\u0010&R\u001b\u0010'\u001a\u00020\"8BX\u0002¢\u0006\f\n\u0004\b(\u0010\u0013\u001a\u0004\b'\u0010$R\u000e\u0010)\u001a\u00020\"X\u000e¢\u0006\u0002\n\u0000R\u0013\u0010\u0007\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b*\u0010\nR\u001d\u0010+\u001a\u0004\u0018\u00010\u001a8BX\u0002¢\u0006\f\n\u0004\b-\u0010\u0013\u001a\u0004\b,\u0010\u001cR\u0010\u0010.\u001a\u0004\u0018\u00010\u0003X\u000e¢\u0006\u0002\n\u0000R\u0014\u0010/\u001a\b\u0012\u0004\u0012\u00020\u00030\u0010X\u0004¢\u0006\u0002\n\u0000R\u001d\u00100\u001a\u0004\u0018\u00010\u001a8BX\u0002¢\u0006\f\n\u0004\b2\u0010\u0013\u001a\u0004\b1\u0010\u001cR\u0010\u00103\u001a\u0004\u0018\u00010\u0003X\u000e¢\u0006\u0002\n\u0000R'\u00104\u001a\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u000206058BX\u0002¢\u0006\f\n\u0004\b9\u0010\u0013\u001a\u0004\b7\u00108R\u0013\u0010\u0005\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b:\u0010\n¨\u0006p"}, d2 = {"Landroidx/navigation/NavDeepLink;", "", "uri", "", "(Ljava/lang/String;)V", "uriPattern", "action", "mimeType", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V", "getAction", "()Ljava/lang/String;", "argumentsNames", "", "getArgumentsNames$navigation_common_release", "()Ljava/util/List;", "fragArgs", "", "getFragArgs", "fragArgs$delegate", "Lkotlin/Lazy;", "fragArgsAndRegex", "Lkotlin/Pair;", "getFragArgsAndRegex", "()Lkotlin/Pair;", "fragArgsAndRegex$delegate", "fragPattern", "Ljava/util/regex/Pattern;", "getFragPattern", "()Ljava/util/regex/Pattern;", "fragPattern$delegate", "fragRegex", "getFragRegex", "fragRegex$delegate", "<set-?>", "", "isExactDeepLink", "()Z", "setExactDeepLink$navigation_common_release", "(Z)V", "isParameterizedQuery", "isParameterizedQuery$delegate", "isSingleQueryParamValueOnly", "getMimeType", "mimeTypePattern", "getMimeTypePattern", "mimeTypePattern$delegate", "mimeTypeRegex", "pathArgs", "pathPattern", "getPathPattern", "pathPattern$delegate", "pathRegex", "queryArgsMap", "", "Landroidx/navigation/NavDeepLink$ParamQuery;", "getQueryArgsMap", "()Ljava/util/Map;", "queryArgsMap$delegate", "getUriPattern", "buildRegex", "", "args", "uriRegex", "Ljava/lang/StringBuilder;", "Lkotlin/text/StringBuilder;", "calculateMatchingPathSegments", "", "requestedLink", "Landroid/net/Uri;", "calculateMatchingPathSegments$navigation_common_release", "equals", "other", "getMatchingArguments", "Landroid/os/Bundle;", "deepLink", "arguments", "", "Landroidx/navigation/NavArgument;", "getMatchingPathAndQueryArgs", "getMatchingPathAndQueryArgs$navigation_common_release", "getMatchingPathArguments", "matcher", "Ljava/util/regex/Matcher;", "bundle", "getMatchingQueryArguments", "getMatchingUriFragment", "fragment", "getMimeTypeMatchRating", "hashCode", "matchAction", "matchMimeType", "matchUri", "matches", "matches$navigation_common_release", "deepLinkRequest", "Landroidx/navigation/NavDeepLinkRequest;", "parseArgument", "name", "value", "argument", "parseArgumentForRepeatedParam", "parseFragment", "parseInputParams", "inputParams", "storedParam", "parseMime", "parsePath", "parseQuery", "Builder", "Companion", "MimeType", "ParamQuery", "navigation-common_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* compiled from: NavDeepLink.kt */
public final class NavDeepLink {
    private static final Companion Companion = new Companion((DefaultConstructorMarker) null);
    private static final Pattern FILL_IN_PATTERN = Pattern.compile("\\{(.+?)\\}");
    private static final Pattern SCHEME_PATTERN = Pattern.compile("^[a-zA-Z]+[+\\w\\-.]*:");
    private final String action;
    private final Lazy fragArgs$delegate;
    private final Lazy fragArgsAndRegex$delegate;
    private final Lazy fragPattern$delegate;
    private final Lazy fragRegex$delegate;
    private boolean isExactDeepLink;
    private final Lazy isParameterizedQuery$delegate;
    private boolean isSingleQueryParamValueOnly;
    private final String mimeType;
    private final Lazy mimeTypePattern$delegate;
    /* access modifiers changed from: private */
    public String mimeTypeRegex;
    private final List<String> pathArgs;
    private final Lazy pathPattern$delegate;
    /* access modifiers changed from: private */
    public String pathRegex;
    private final Lazy queryArgsMap$delegate;
    private final String uriPattern;

    public NavDeepLink(String uriPattern2, String action2, String mimeType2) {
        this.uriPattern = uriPattern2;
        this.action = action2;
        this.mimeType = mimeType2;
        this.pathArgs = new ArrayList();
        this.pathPattern$delegate = LazyKt.lazy(new NavDeepLink$pathPattern$2(this));
        this.isParameterizedQuery$delegate = LazyKt.lazy(new NavDeepLink$isParameterizedQuery$2(this));
        this.queryArgsMap$delegate = LazyKt.lazy(LazyThreadSafetyMode.NONE, new NavDeepLink$queryArgsMap$2(this));
        this.fragArgsAndRegex$delegate = LazyKt.lazy(LazyThreadSafetyMode.NONE, new NavDeepLink$fragArgsAndRegex$2(this));
        this.fragArgs$delegate = LazyKt.lazy(LazyThreadSafetyMode.NONE, new NavDeepLink$fragArgs$2(this));
        this.fragRegex$delegate = LazyKt.lazy(LazyThreadSafetyMode.NONE, new NavDeepLink$fragRegex$2(this));
        this.fragPattern$delegate = LazyKt.lazy(new NavDeepLink$fragPattern$2(this));
        this.mimeTypePattern$delegate = LazyKt.lazy(new NavDeepLink$mimeTypePattern$2(this));
        parsePath();
        parseMime();
    }

    public final String getUriPattern() {
        return this.uriPattern;
    }

    public final String getAction() {
        return this.action;
    }

    public final String getMimeType() {
        return this.mimeType;
    }

    private final Pattern getPathPattern() {
        return (Pattern) this.pathPattern$delegate.getValue();
    }

    private final boolean isParameterizedQuery() {
        return ((Boolean) this.isParameterizedQuery$delegate.getValue()).booleanValue();
    }

    private final Map<String, ParamQuery> getQueryArgsMap() {
        return (Map) this.queryArgsMap$delegate.getValue();
    }

    /* access modifiers changed from: private */
    public final Pair<List<String>, String> getFragArgsAndRegex() {
        return (Pair) this.fragArgsAndRegex$delegate.getValue();
    }

    private final List<String> getFragArgs() {
        return (List) this.fragArgs$delegate.getValue();
    }

    /* access modifiers changed from: private */
    public final String getFragRegex() {
        return (String) this.fragRegex$delegate.getValue();
    }

    private final Pattern getFragPattern() {
        return (Pattern) this.fragPattern$delegate.getValue();
    }

    private final Pattern getMimeTypePattern() {
        return (Pattern) this.mimeTypePattern$delegate.getValue();
    }

    public final List<String> getArgumentsNames$navigation_common_release() {
        Collection collection = this.pathArgs;
        Collection destination$iv$iv = new ArrayList();
        for (ParamQuery it : getQueryArgsMap().values()) {
            CollectionsKt.addAll(destination$iv$iv, it.getArguments());
        }
        return CollectionsKt.plus(CollectionsKt.plus(collection, (List) destination$iv$iv), getFragArgs());
    }

    public final boolean isExactDeepLink() {
        return this.isExactDeepLink;
    }

    public final void setExactDeepLink$navigation_common_release(boolean z) {
        this.isExactDeepLink = z;
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public NavDeepLink(String uri) {
        this(uri, (String) null, (String) null);
        Intrinsics.checkNotNullParameter(uri, "uri");
    }

    private final void buildRegex(String uri, List<String> args, StringBuilder uriRegex) {
        Matcher matcher = FILL_IN_PATTERN.matcher(uri);
        int appendPos = 0;
        while (matcher.find()) {
            String argName = matcher.group(1);
            Intrinsics.checkNotNull(argName, "null cannot be cast to non-null type kotlin.String");
            args.add(argName);
            if (matcher.start() > appendPos) {
                String substring = uri.substring(appendPos, matcher.start());
                Intrinsics.checkNotNullExpressionValue(substring, "substring(...)");
                uriRegex.append(Pattern.quote(substring));
            }
            uriRegex.append("([^/]*?|)");
            appendPos = matcher.end();
        }
        if (appendPos < uri.length()) {
            String substring2 = uri.substring(appendPos);
            Intrinsics.checkNotNullExpressionValue(substring2, "substring(...)");
            uriRegex.append(Pattern.quote(substring2));
        }
    }

    public final boolean matches$navigation_common_release(Uri uri) {
        Intrinsics.checkNotNullParameter(uri, "uri");
        return matches$navigation_common_release(new NavDeepLinkRequest(uri, (String) null, (String) null));
    }

    public final boolean matches$navigation_common_release(NavDeepLinkRequest deepLinkRequest) {
        Intrinsics.checkNotNullParameter(deepLinkRequest, "deepLinkRequest");
        if (matchUri(deepLinkRequest.getUri()) && matchAction(deepLinkRequest.getAction())) {
            return matchMimeType(deepLinkRequest.getMimeType());
        }
        return false;
    }

    private final boolean matchUri(Uri uri) {
        if ((uri == null) == (getPathPattern() != null)) {
            return false;
        }
        if (uri == null) {
            return true;
        }
        Pattern pathPattern = getPathPattern();
        Intrinsics.checkNotNull(pathPattern);
        if (pathPattern.matcher(uri.toString()).matches()) {
            return true;
        }
        return false;
    }

    private final boolean matchAction(String action2) {
        if ((action2 == null) == (this.action != null)) {
            return false;
        }
        if (action2 == null || Intrinsics.areEqual((Object) this.action, (Object) action2)) {
            return true;
        }
        return false;
    }

    private final boolean matchMimeType(String mimeType2) {
        if ((mimeType2 == null) == (this.mimeType != null)) {
            return false;
        }
        if (mimeType2 == null) {
            return true;
        }
        Pattern mimeTypePattern = getMimeTypePattern();
        Intrinsics.checkNotNull(mimeTypePattern);
        if (mimeTypePattern.matcher(mimeType2).matches()) {
            return true;
        }
        return false;
    }

    public final int getMimeTypeMatchRating(String mimeType2) {
        Intrinsics.checkNotNullParameter(mimeType2, "mimeType");
        if (this.mimeType != null) {
            Pattern mimeTypePattern = getMimeTypePattern();
            Intrinsics.checkNotNull(mimeTypePattern);
            if (mimeTypePattern.matcher(mimeType2).matches()) {
                return new MimeType(this.mimeType).compareTo(new MimeType(mimeType2));
            }
        }
        return -1;
    }

    public final Bundle getMatchingArguments(Uri deepLink, Map<String, NavArgument> arguments) {
        Intrinsics.checkNotNullParameter(deepLink, "deepLink");
        Intrinsics.checkNotNullParameter(arguments, "arguments");
        Pattern pathPattern = getPathPattern();
        Matcher matcher = pathPattern != null ? pathPattern.matcher(deepLink.toString()) : null;
        if (matcher == null || !matcher.matches()) {
            return null;
        }
        Bundle bundle = new Bundle();
        if (!getMatchingPathArguments(matcher, bundle, arguments)) {
            return null;
        }
        if (isParameterizedQuery() && !getMatchingQueryArguments(deepLink, bundle, arguments)) {
            return null;
        }
        getMatchingUriFragment(deepLink.getFragment(), bundle, arguments);
        if (!NavArgumentKt.missingRequiredArguments(arguments, new NavDeepLink$getMatchingArguments$missingRequiredArguments$1(bundle)).isEmpty()) {
            return null;
        }
        return bundle;
    }

    public final Bundle getMatchingPathAndQueryArgs$navigation_common_release(Uri deepLink, Map<String, NavArgument> arguments) {
        Intrinsics.checkNotNullParameter(arguments, "arguments");
        Bundle bundle = new Bundle();
        if (deepLink == null) {
            return bundle;
        }
        Pattern pathPattern = getPathPattern();
        Matcher matcher = pathPattern != null ? pathPattern.matcher(deepLink.toString()) : null;
        if (matcher == null || !matcher.matches()) {
            return bundle;
        }
        getMatchingPathArguments(matcher, bundle, arguments);
        if (isParameterizedQuery()) {
            getMatchingQueryArguments(deepLink, bundle, arguments);
        }
        return bundle;
    }

    private final void getMatchingUriFragment(String fragment, Bundle bundle, Map<String, NavArgument> arguments) {
        Pattern fragPattern = getFragPattern();
        Matcher matcher = fragPattern != null ? fragPattern.matcher(String.valueOf(fragment)) : null;
        if (matcher != null) {
            Matcher matcher2 = matcher;
            if (matcher2.matches()) {
                Iterable $this$mapIndexed$iv = getFragArgs();
                Collection destination$iv$iv = new ArrayList(CollectionsKt.collectionSizeOrDefault($this$mapIndexed$iv, 10));
                int index$iv$iv = 0;
                for (Object item$iv$iv : $this$mapIndexed$iv) {
                    int index$iv$iv2 = index$iv$iv + 1;
                    if (index$iv$iv < 0) {
                        CollectionsKt.throwIndexOverflow();
                    }
                    String argumentName = (String) item$iv$iv;
                    String value = Uri.decode(matcher2.group(index$iv$iv + 1));
                    NavArgument argument = arguments.get(argumentName);
                    try {
                        Intrinsics.checkNotNullExpressionValue(value, "value");
                        Matcher matcher3 = matcher2;
                        Iterable $this$mapIndexed$iv2 = $this$mapIndexed$iv;
                        try {
                            parseArgument(bundle, argumentName, value, argument);
                            destination$iv$iv.add(Unit.INSTANCE);
                            index$iv$iv = index$iv$iv2;
                            matcher2 = matcher3;
                            $this$mapIndexed$iv = $this$mapIndexed$iv2;
                        } catch (IllegalArgumentException e) {
                            return;
                        }
                    } catch (IllegalArgumentException e2) {
                        Matcher matcher4 = matcher2;
                        Iterable iterable = $this$mapIndexed$iv;
                        Bundle bundle2 = bundle;
                        return;
                    }
                }
                List list = (List) destination$iv$iv;
            }
        }
    }

    private final boolean getMatchingPathArguments(Matcher matcher, Bundle bundle, Map<String, NavArgument> arguments) {
        Iterable $this$mapIndexed$iv = this.pathArgs;
        int $i$f$mapIndexed = false;
        Collection destination$iv$iv = new ArrayList(CollectionsKt.collectionSizeOrDefault($this$mapIndexed$iv, 10));
        int index$iv$iv = 0;
        for (Object item$iv$iv : $this$mapIndexed$iv) {
            int index$iv$iv2 = index$iv$iv + 1;
            if (index$iv$iv < 0) {
                CollectionsKt.throwIndexOverflow();
            }
            String argumentName = (String) item$iv$iv;
            String value = Uri.decode(matcher.group(index$iv$iv + 1));
            Iterable $this$mapIndexed$iv2 = $this$mapIndexed$iv;
            NavArgument argument = arguments.get(argumentName);
            try {
                Intrinsics.checkNotNullExpressionValue(value, "value");
                int $i$f$mapIndexed2 = $i$f$mapIndexed;
                try {
                    parseArgument(bundle, argumentName, value, argument);
                    destination$iv$iv.add(Unit.INSTANCE);
                    index$iv$iv = index$iv$iv2;
                    $this$mapIndexed$iv = $this$mapIndexed$iv2;
                    $i$f$mapIndexed = $i$f$mapIndexed2;
                } catch (IllegalArgumentException e) {
                    return false;
                }
            } catch (IllegalArgumentException e2) {
                int i = $i$f$mapIndexed;
                Bundle bundle2 = bundle;
                return false;
            }
        }
        List list = (List) destination$iv$iv;
        return true;
    }

    private final boolean getMatchingQueryArguments(Uri deepLink, Bundle bundle, Map<String, NavArgument> arguments) {
        String argValue;
        for (Map.Entry entry : getQueryArgsMap().entrySet()) {
            ParamQuery storedParam = (ParamQuery) entry.getValue();
            List inputParams = deepLink.getQueryParameters((String) entry.getKey());
            if (this.isSingleQueryParamValueOnly && (argValue = deepLink.getQuery()) != null && !Intrinsics.areEqual((Object) argValue, (Object) deepLink.toString())) {
                inputParams = CollectionsKt.listOf(argValue);
            }
            Intrinsics.checkNotNullExpressionValue(inputParams, "inputParams");
            if (!parseInputParams(inputParams, storedParam, bundle, arguments)) {
                return false;
            }
        }
        return true;
    }

    private final boolean parseInputParams(List<String> inputParams, ParamQuery storedParam, Bundle bundle, Map<String, NavArgument> arguments) {
        Matcher matcher;
        Object obj;
        Map<String, NavArgument> map = arguments;
        Bundle tempBundle = BundleKt.bundleOf(new Pair[0]);
        for (String argName : storedParam.getArguments()) {
            NavArgument argument = map.get(argName);
            NavType<Object> type = argument != null ? argument.getType() : null;
            if ((type instanceof CollectionNavType) && !argument.isDefaultValuePresent()) {
                type.put(tempBundle, argName, ((CollectionNavType) type).emptyCollection());
            }
        }
        for (String inputParam : inputParams) {
            String it = storedParam.getParamRegex();
            if (it != null) {
                matcher = Pattern.compile(it, 32).matcher(inputParam);
            } else {
                matcher = null;
            }
            Matcher argMatcher = matcher;
            if (argMatcher == null || !argMatcher.matches()) {
                return false;
            }
            Iterable $this$mapIndexed$iv = storedParam.getArguments();
            Collection destination$iv$iv = new ArrayList(CollectionsKt.collectionSizeOrDefault($this$mapIndexed$iv, 10));
            int index$iv$iv = 0;
            for (Object item$iv$iv : $this$mapIndexed$iv) {
                int index$iv$iv2 = index$iv$iv + 1;
                if (index$iv$iv < 0) {
                    CollectionsKt.throwIndexOverflow();
                }
                String argName2 = (String) item$iv$iv;
                String group = argMatcher.group(index$iv$iv + 1);
                if (group == null) {
                    group = "";
                } else {
                    Intrinsics.checkNotNullExpressionValue(group, "argMatcher.group(index + 1) ?: \"\"");
                }
                String value = group;
                NavArgument argument2 = map.get(argName2);
                try {
                    if (!tempBundle.containsKey(argName2)) {
                        parseArgument(tempBundle, argName2, value, argument2);
                        obj = Unit.INSTANCE;
                    } else {
                        obj = Boolean.valueOf(parseArgumentForRepeatedParam(tempBundle, argName2, value, argument2));
                    }
                } catch (IllegalArgumentException e) {
                    obj = Unit.INSTANCE;
                }
                destination$iv$iv.add(obj);
                index$iv$iv = index$iv$iv2;
                map = arguments;
            }
            List list = (List) destination$iv$iv;
            map = arguments;
        }
        bundle.putAll(tempBundle);
        return true;
    }

    public final int calculateMatchingPathSegments$navigation_common_release(Uri requestedLink) {
        if (requestedLink == null || this.uriPattern == null) {
            return 0;
        }
        List<String> pathSegments = requestedLink.getPathSegments();
        List<String> pathSegments2 = Uri.parse(this.uriPattern).getPathSegments();
        Intrinsics.checkNotNullExpressionValue(pathSegments, "requestedPathSegments");
        Intrinsics.checkNotNullExpressionValue(pathSegments2, "uriPathSegments");
        return CollectionsKt.intersect(pathSegments, pathSegments2).size();
    }

    private final void parseArgument(Bundle bundle, String name, String value, NavArgument argument) {
        if (argument != null) {
            argument.getType().parseAndPut(bundle, name, value);
        } else {
            bundle.putString(name, value);
        }
    }

    private final boolean parseArgumentForRepeatedParam(Bundle bundle, String name, String value, NavArgument argument) {
        if (!bundle.containsKey(name)) {
            return true;
        }
        if (argument == null) {
            return false;
        }
        NavType type = argument.getType();
        type.parseAndPut(bundle, name, value, type.get(bundle, name));
        return false;
    }

    @Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010!\n\u0002\u0010\u000e\n\u0002\b\b\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0002\b\u0002\u0018\u00002\u00020\u0001B\u0005¢\u0006\u0002\u0010\u0002J\u000e\u0010\r\u001a\u00020\u000e2\u0006\u0010\u000f\u001a\u00020\u0005J\u000e\u0010\u0010\u001a\u00020\u00052\u0006\u0010\u0011\u001a\u00020\u0012J\u0006\u0010\u0013\u001a\u00020\u0012R\u0017\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007R\u001c\u0010\b\u001a\u0004\u0018\u00010\u0005X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\t\u0010\n\"\u0004\b\u000b\u0010\f¨\u0006\u0014"}, d2 = {"Landroidx/navigation/NavDeepLink$ParamQuery;", "", "()V", "arguments", "", "", "getArguments", "()Ljava/util/List;", "paramRegex", "getParamRegex", "()Ljava/lang/String;", "setParamRegex", "(Ljava/lang/String;)V", "addArgumentName", "", "name", "getArgumentName", "index", "", "size", "navigation-common_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
    /* compiled from: NavDeepLink.kt */
    private static final class ParamQuery {
        private final List<String> arguments = new ArrayList();
        private String paramRegex;

        public final String getParamRegex() {
            return this.paramRegex;
        }

        public final void setParamRegex(String str) {
            this.paramRegex = str;
        }

        public final List<String> getArguments() {
            return this.arguments;
        }

        public final void addArgumentName(String name) {
            Intrinsics.checkNotNullParameter(name, "name");
            this.arguments.add(name);
        }

        public final String getArgumentName(int index) {
            return this.arguments.get(index);
        }

        public final int size() {
            return this.arguments.size();
        }
    }

    @Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u000f\n\u0000\n\u0002\u0010\u000e\n\u0002\b\t\n\u0002\u0010\b\n\u0002\b\u0002\b\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004J\u0011\u0010\f\u001a\u00020\r2\u0006\u0010\u000e\u001a\u00020\u0000H\u0002R\u001a\u0010\u0005\u001a\u00020\u0003X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0006\u0010\u0007\"\u0004\b\b\u0010\u0004R\u001a\u0010\t\u001a\u00020\u0003X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\n\u0010\u0007\"\u0004\b\u000b\u0010\u0004¨\u0006\u000f"}, d2 = {"Landroidx/navigation/NavDeepLink$MimeType;", "", "mimeType", "", "(Ljava/lang/String;)V", "subType", "getSubType", "()Ljava/lang/String;", "setSubType", "type", "getType", "setType", "compareTo", "", "other", "navigation-common_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
    /* compiled from: NavDeepLink.kt */
    private static final class MimeType implements Comparable<MimeType> {
        private String subType;
        private String type;

        public MimeType(String mimeType) {
            List list;
            boolean z;
            Intrinsics.checkNotNullParameter(mimeType, "mimeType");
            List<String> split = new Regex("/").split(mimeType, 0);
            if (!split.isEmpty()) {
                ListIterator iterator$iv = split.listIterator(split.size());
                while (true) {
                    if (!iterator$iv.hasPrevious()) {
                        break;
                    }
                    if (iterator$iv.previous().length() == 0) {
                        z = true;
                        continue;
                    } else {
                        z = false;
                        continue;
                    }
                    if (!z) {
                        list = CollectionsKt.take(split, iterator$iv.nextIndex() + 1);
                        break;
                    }
                }
            }
            list = CollectionsKt.emptyList();
            List typeAndSubType = list;
            this.type = (String) typeAndSubType.get(0);
            this.subType = (String) typeAndSubType.get(1);
        }

        public final String getType() {
            return this.type;
        }

        public final void setType(String str) {
            Intrinsics.checkNotNullParameter(str, "<set-?>");
            this.type = str;
        }

        public final String getSubType() {
            return this.subType;
        }

        public final void setSubType(String str) {
            Intrinsics.checkNotNullParameter(str, "<set-?>");
            this.subType = str;
        }

        public int compareTo(MimeType other) {
            Intrinsics.checkNotNullParameter(other, "other");
            int result = 0;
            if (Intrinsics.areEqual((Object) this.type, (Object) other.type)) {
                result = 0 + 2;
            }
            if (Intrinsics.areEqual((Object) this.subType, (Object) other.subType)) {
                return result + 1;
            }
            return result;
        }
    }

    public boolean equals(Object other) {
        if (other == null || !(other instanceof NavDeepLink) || !Intrinsics.areEqual((Object) this.uriPattern, (Object) ((NavDeepLink) other).uriPattern) || !Intrinsics.areEqual((Object) this.action, (Object) ((NavDeepLink) other).action) || !Intrinsics.areEqual((Object) this.mimeType, (Object) ((NavDeepLink) other).mimeType)) {
            return false;
        }
        return true;
    }

    public int hashCode() {
        int i = 0 * 31;
        String str = this.uriPattern;
        int i2 = 0;
        int result = (i + (str != null ? str.hashCode() : 0)) * 31;
        String str2 = this.action;
        int result2 = (result + (str2 != null ? str2.hashCode() : 0)) * 31;
        String str3 = this.mimeType;
        if (str3 != null) {
            i2 = str3.hashCode();
        }
        return result2 + i2;
    }

    @Metadata(d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0018\u0000 \u00152\u00020\u0001:\u0001\u0015B\u0007\b\u0017¢\u0006\u0002\u0010\u0002J\u0006\u0010\u0007\u001a\u00020\bJ\u000e\u0010\t\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u0004J\u000e\u0010\n\u001a\u00020\u00002\u0006\u0010\u0005\u001a\u00020\u0004J\u000e\u0010\u000b\u001a\u00020\u00002\u0006\u0010\u0006\u001a\u00020\u0004J<\u0010\u000b\u001a\u00020\u0000\"\n\b\u0000\u0010\f\u0018\u0001*\u00020\u00012\u0006\u0010\r\u001a\u00020\u00042\u001d\b\u0002\u0010\u000e\u001a\u0017\u0012\u0004\u0012\u00020\u0010\u0012\r\u0012\u000b\u0012\u0002\b\u00030\u0011¢\u0006\u0002\b\u00120\u000fH\bJB\u0010\u000b\u001a\u00020\u0000\"\b\b\u0000\u0010\f*\u00020\u00012\u0006\u0010\r\u001a\u00020\u00042\f\u0010\u0013\u001a\b\u0012\u0004\u0012\u0002H\f0\u00142\u0018\b\u0002\u0010\u000e\u001a\u0012\u0012\u0004\u0012\u00020\u0010\u0012\b\u0012\u0006\u0012\u0002\b\u00030\u00110\u000fH\u0007R\u0010\u0010\u0003\u001a\u0004\u0018\u00010\u0004X\u000e¢\u0006\u0002\n\u0000R\u0010\u0010\u0005\u001a\u0004\u0018\u00010\u0004X\u000e¢\u0006\u0002\n\u0000R\u0010\u0010\u0006\u001a\u0004\u0018\u00010\u0004X\u000e¢\u0006\u0002\n\u0000¨\u0006\u0016"}, d2 = {"Landroidx/navigation/NavDeepLink$Builder;", "", "()V", "action", "", "mimeType", "uriPattern", "build", "Landroidx/navigation/NavDeepLink;", "setAction", "setMimeType", "setUriPattern", "T", "basePath", "typeMap", "", "Lkotlin/reflect/KType;", "Landroidx/navigation/NavType;", "Lkotlin/jvm/JvmSuppressWildcards;", "route", "Lkotlin/reflect/KClass;", "Companion", "navigation-common_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
    /* compiled from: NavDeepLink.kt */
    public static final class Builder {
        public static final Companion Companion = new Companion((DefaultConstructorMarker) null);
        private String action;
        private String mimeType;
        private String uriPattern;

        public final Builder setUriPattern(String uriPattern2) {
            Intrinsics.checkNotNullParameter(uriPattern2, "uriPattern");
            this.uriPattern = uriPattern2;
            return this;
        }

        public static /* synthetic */ Builder setUriPattern$default(Builder $this, String basePath, Map typeMap, int i, Object obj) {
            if ((i & 2) != 0) {
                typeMap = MapsKt.emptyMap();
            }
            Intrinsics.checkNotNullParameter(basePath, "basePath");
            Intrinsics.checkNotNullParameter(typeMap, "typeMap");
            Intrinsics.reifiedOperationMarker(4, "T");
            return $this.setUriPattern(basePath, Reflection.getOrCreateKotlinClass(Object.class), typeMap);
        }

        public final /* synthetic */ <T> Builder setUriPattern(String basePath, Map<KType, NavType<?>> typeMap) {
            Intrinsics.checkNotNullParameter(basePath, "basePath");
            Intrinsics.checkNotNullParameter(typeMap, "typeMap");
            Intrinsics.reifiedOperationMarker(4, "T");
            return setUriPattern(basePath, Reflection.getOrCreateKotlinClass(Object.class), typeMap);
        }

        public static /* synthetic */ Builder setUriPattern$default(Builder builder, String str, KClass kClass, Map map, int i, Object obj) {
            if ((i & 4) != 0) {
                map = MapsKt.emptyMap();
            }
            return builder.setUriPattern(str, kClass, map);
        }

        public final <T> Builder setUriPattern(String basePath, KClass<T> route, Map<KType, ? extends NavType<?>> typeMap) {
            Intrinsics.checkNotNullParameter(basePath, "basePath");
            Intrinsics.checkNotNullParameter(route, "route");
            Intrinsics.checkNotNullParameter(typeMap, "typeMap");
            this.uriPattern = RouteSerializerKt.generateRoutePattern(SerializersKt.serializer(route), typeMap, basePath);
            return this;
        }

        public final Builder setAction(String action2) {
            Intrinsics.checkNotNullParameter(action2, "action");
            if (action2.length() > 0) {
                this.action = action2;
                return this;
            }
            throw new IllegalArgumentException("The NavDeepLink cannot have an empty action.".toString());
        }

        public final Builder setMimeType(String mimeType2) {
            Intrinsics.checkNotNullParameter(mimeType2, "mimeType");
            this.mimeType = mimeType2;
            return this;
        }

        public final NavDeepLink build() {
            return new NavDeepLink(this.uriPattern, this.action, this.mimeType);
        }

        @Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0007\n\u0002\u0010$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u0010\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u0006H\u0007J\u0010\u0010\u0007\u001a\u00020\u00042\u0006\u0010\b\u001a\u00020\u0006H\u0007J\u0010\u0010\t\u001a\u00020\u00042\u0006\u0010\n\u001a\u00020\u0006H\u0007J<\u0010\t\u001a\u00020\u0004\"\n\b\u0000\u0010\u000b\u0018\u0001*\u00020\u00012\u0006\u0010\f\u001a\u00020\u00062\u001d\b\u0002\u0010\r\u001a\u0017\u0012\u0004\u0012\u00020\u000f\u0012\r\u0012\u000b\u0012\u0002\b\u00030\u0010¢\u0006\u0002\b\u00110\u000eH\b¨\u0006\u0012"}, d2 = {"Landroidx/navigation/NavDeepLink$Builder$Companion;", "", "()V", "fromAction", "Landroidx/navigation/NavDeepLink$Builder;", "action", "", "fromMimeType", "mimeType", "fromUriPattern", "uriPattern", "T", "basePath", "typeMap", "", "Lkotlin/reflect/KType;", "Landroidx/navigation/NavType;", "Lkotlin/jvm/JvmSuppressWildcards;", "navigation-common_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
        /* compiled from: NavDeepLink.kt */
        public static final class Companion {
            public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
                this();
            }

            private Companion() {
            }

            @JvmStatic
            public final Builder fromUriPattern(String uriPattern) {
                Intrinsics.checkNotNullParameter(uriPattern, "uriPattern");
                Builder builder = new Builder();
                builder.setUriPattern(uriPattern);
                return builder;
            }

            public static /* synthetic */ Builder fromUriPattern$default(Companion $this, String basePath, Map typeMap, int i, Object obj) {
                if ((i & 2) != 0) {
                    typeMap = MapsKt.emptyMap();
                }
                Intrinsics.checkNotNullParameter(basePath, "basePath");
                Intrinsics.checkNotNullParameter(typeMap, "typeMap");
                Builder builder = new Builder();
                Intrinsics.reifiedOperationMarker(4, "T");
                builder.setUriPattern(basePath, Reflection.getOrCreateKotlinClass(Object.class), typeMap);
                return builder;
            }

            @JvmStatic
            public final /* synthetic */ <T> Builder fromUriPattern(String basePath, Map<KType, NavType<?>> typeMap) {
                Intrinsics.checkNotNullParameter(basePath, "basePath");
                Intrinsics.checkNotNullParameter(typeMap, "typeMap");
                Builder builder = new Builder();
                Intrinsics.reifiedOperationMarker(4, "T");
                builder.setUriPattern(basePath, Reflection.getOrCreateKotlinClass(Object.class), typeMap);
                return builder;
            }

            @JvmStatic
            public final Builder fromAction(String action) {
                Intrinsics.checkNotNullParameter(action, "action");
                if (action.length() > 0) {
                    Builder builder = new Builder();
                    builder.setAction(action);
                    return builder;
                }
                throw new IllegalArgumentException("The NavDeepLink cannot have an empty action.".toString());
            }

            @JvmStatic
            public final Builder fromMimeType(String mimeType) {
                Intrinsics.checkNotNullParameter(mimeType, "mimeType");
                Builder builder = new Builder();
                builder.setMimeType(mimeType);
                return builder;
            }
        }

        @JvmStatic
        public static final Builder fromUriPattern(String uriPattern2) {
            return Companion.fromUriPattern(uriPattern2);
        }

        @JvmStatic
        public static final Builder fromAction(String action2) {
            return Companion.fromAction(action2);
        }

        @JvmStatic
        public static final Builder fromMimeType(String mimeType2) {
            return Companion.fromMimeType(mimeType2);
        }
    }

    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002R\u0016\u0010\u0003\u001a\n \u0005*\u0004\u0018\u00010\u00040\u0004X\u0004¢\u0006\u0002\n\u0000R\u0016\u0010\u0006\u001a\n \u0005*\u0004\u0018\u00010\u00040\u0004X\u0004¢\u0006\u0002\n\u0000¨\u0006\u0007"}, d2 = {"Landroidx/navigation/NavDeepLink$Companion;", "", "()V", "FILL_IN_PATTERN", "Ljava/util/regex/Pattern;", "kotlin.jvm.PlatformType", "SCHEME_PATTERN", "navigation-common_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
    /* compiled from: NavDeepLink.kt */
    private static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }
    }

    private final void parsePath() {
        if (this.uriPattern != null) {
            StringBuilder uriRegex = new StringBuilder("^");
            if (!SCHEME_PATTERN.matcher(this.uriPattern).find()) {
                uriRegex.append("http[s]?://");
            }
            Matcher matcher = Pattern.compile("(\\?|\\#|$)").matcher(this.uriPattern);
            boolean find = matcher.find();
            boolean z = false;
            String substring = this.uriPattern.substring(0, matcher.start());
            Intrinsics.checkNotNullExpressionValue(substring, "substring(...)");
            buildRegex(substring, this.pathArgs, uriRegex);
            if (!StringsKt.contains$default((CharSequence) uriRegex, (CharSequence) ".*", false, 2, (Object) null) && !StringsKt.contains$default((CharSequence) uriRegex, (CharSequence) "([^/]+?)", false, 2, (Object) null)) {
                z = true;
            }
            this.isExactDeepLink = z;
            uriRegex.append("($|(\\?(.)*)|(\\#(.)*))");
            String sb = uriRegex.toString();
            Intrinsics.checkNotNullExpressionValue(sb, "uriRegex.toString()");
            this.pathRegex = StringsKt.replace$default(sb, ".*", "\\E.*\\Q", false, 4, (Object) null);
        }
    }

    /* access modifiers changed from: private */
    public final Map<String, ParamQuery> parseQuery() {
        Map paramArgMap = new LinkedHashMap();
        if (!isParameterizedQuery()) {
            return paramArgMap;
        }
        Uri uri = Uri.parse(this.uriPattern);
        for (String paramName : uri.getQueryParameterNames()) {
            StringBuilder argRegex = new StringBuilder();
            List queryParams = uri.getQueryParameters(paramName);
            if (queryParams.size() <= 1) {
                Intrinsics.checkNotNullExpressionValue(queryParams, "queryParams");
                String $this$parseQuery_u24lambda_u2410 = (String) CollectionsKt.firstOrNull(queryParams);
                if ($this$parseQuery_u24lambda_u2410 == null) {
                    $this$parseQuery_u24lambda_u2410 = paramName;
                    this.isSingleQueryParamValueOnly = true;
                }
                Matcher matcher = FILL_IN_PATTERN.matcher($this$parseQuery_u24lambda_u2410);
                int appendPos = 0;
                ParamQuery param = new ParamQuery();
                while (matcher.find()) {
                    String group = matcher.group(1);
                    Intrinsics.checkNotNull(group, "null cannot be cast to non-null type kotlin.String");
                    param.addArgumentName(group);
                    Intrinsics.checkNotNullExpressionValue($this$parseQuery_u24lambda_u2410, "queryParam");
                    String substring = $this$parseQuery_u24lambda_u2410.substring(appendPos, matcher.start());
                    Intrinsics.checkNotNullExpressionValue(substring, "substring(...)");
                    argRegex.append(Pattern.quote(substring));
                    argRegex.append("(.+?)?");
                    appendPos = matcher.end();
                }
                if (appendPos < $this$parseQuery_u24lambda_u2410.length()) {
                    Intrinsics.checkNotNullExpressionValue($this$parseQuery_u24lambda_u2410, "queryParam");
                    String substring2 = $this$parseQuery_u24lambda_u2410.substring(appendPos);
                    Intrinsics.checkNotNullExpressionValue(substring2, "substring(...)");
                    argRegex.append(Pattern.quote(substring2));
                }
                String sb = argRegex.toString();
                Intrinsics.checkNotNullExpressionValue(sb, "argRegex.toString()");
                param.setParamRegex(StringsKt.replace$default(sb, ".*", "\\E.*\\Q", false, 4, (Object) null));
                Intrinsics.checkNotNullExpressionValue(paramName, "paramName");
                paramArgMap.put(paramName, param);
            } else {
                throw new IllegalArgumentException(("Query parameter " + paramName + " must only be present once in " + this.uriPattern + ". To support repeated query parameters, use an array type for your argument and the pattern provided in your URI will be used to parse each query parameter instance.").toString());
            }
        }
        return paramArgMap;
    }

    /* access modifiers changed from: private */
    public final Pair<List<String>, String> parseFragment() {
        if (this.uriPattern == null || Uri.parse(this.uriPattern).getFragment() == null) {
            return null;
        }
        List fragArgs = new ArrayList();
        String fragment = Uri.parse(this.uriPattern).getFragment();
        StringBuilder fragRegex = new StringBuilder();
        Intrinsics.checkNotNull(fragment);
        buildRegex(fragment, fragArgs, fragRegex);
        String sb = fragRegex.toString();
        Intrinsics.checkNotNullExpressionValue(sb, "fragRegex.toString()");
        return TuplesKt.to(fragArgs, sb);
    }

    private final void parseMime() {
        if (this.mimeType != null) {
            if (Pattern.compile("^[\\s\\S]+/[\\s\\S]+$").matcher(this.mimeType).matches()) {
                MimeType splitMimeType = new MimeType(this.mimeType);
                this.mimeTypeRegex = StringsKt.replace$default("^(" + splitMimeType.getType() + "|[*]+)/(" + splitMimeType.getSubType() + "|[*]+)$", "*|[*]", "[\\s\\S]", false, 4, (Object) null);
                return;
            }
            throw new IllegalArgumentException(("The given mimeType " + this.mimeType + " does not match to required \"type/subtype\" format").toString());
        }
    }
}
