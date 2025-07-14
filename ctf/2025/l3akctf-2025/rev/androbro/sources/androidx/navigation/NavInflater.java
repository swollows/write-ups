package androidx.navigation;

import android.content.Context;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.content.res.XmlResourceParser;
import android.os.Bundle;
import android.util.AttributeSet;
import android.util.TypedValue;
import androidx.navigation.NavDeepLink;
import androidx.navigation.NavOptions;
import androidx.navigation.common.R;
import java.io.IOException;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt;
import org.xmlpull.v1.XmlPullParserException;

@Metadata(d1 = {"\u0000X\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\u0018\u0000 \u001e2\u00020\u0001:\u0001\u001eB\u0015\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005¢\u0006\u0002\u0010\u0006J(\u0010\u0007\u001a\u00020\b2\u0006\u0010\t\u001a\u00020\n2\u0006\u0010\u000b\u001a\u00020\f2\u0006\u0010\r\u001a\u00020\u000e2\u0006\u0010\u000f\u001a\u00020\u0010H\u0002J\u0012\u0010\u0007\u001a\u00020\u00112\b\b\u0001\u0010\u000f\u001a\u00020\u0010H\u0007J0\u0010\u0012\u001a\u00020\u00132\u0006\u0010\t\u001a\u00020\n2\u0006\u0010\u0014\u001a\u00020\b2\u0006\u0010\r\u001a\u00020\u000e2\u0006\u0010\u000b\u001a\u00020\f2\u0006\u0010\u000f\u001a\u00020\u0010H\u0002J \u0010\u0015\u001a\u00020\u00162\u0006\u0010\u0017\u001a\u00020\u00182\u0006\u0010\t\u001a\u00020\n2\u0006\u0010\u000f\u001a\u00020\u0010H\u0002J(\u0010\u0019\u001a\u00020\u00132\u0006\u0010\t\u001a\u00020\n2\u0006\u0010\u001a\u001a\u00020\u001b2\u0006\u0010\r\u001a\u00020\u000e2\u0006\u0010\u000f\u001a\u00020\u0010H\u0002J(\u0010\u001c\u001a\u00020\u00132\u0006\u0010\t\u001a\u00020\n2\u0006\u0010\u0014\u001a\u00020\b2\u0006\u0010\r\u001a\u00020\u000e2\u0006\u0010\u000f\u001a\u00020\u0010H\u0002J \u0010\u001d\u001a\u00020\u00132\u0006\u0010\t\u001a\u00020\n2\u0006\u0010\u0014\u001a\u00020\b2\u0006\u0010\r\u001a\u00020\u000eH\u0002R\u000e\u0010\u0002\u001a\u00020\u0003X\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0004\u001a\u00020\u0005X\u0004¢\u0006\u0002\n\u0000¨\u0006\u001f"}, d2 = {"Landroidx/navigation/NavInflater;", "", "context", "Landroid/content/Context;", "navigatorProvider", "Landroidx/navigation/NavigatorProvider;", "(Landroid/content/Context;Landroidx/navigation/NavigatorProvider;)V", "inflate", "Landroidx/navigation/NavDestination;", "res", "Landroid/content/res/Resources;", "parser", "Landroid/content/res/XmlResourceParser;", "attrs", "Landroid/util/AttributeSet;", "graphResId", "", "Landroidx/navigation/NavGraph;", "inflateAction", "", "dest", "inflateArgument", "Landroidx/navigation/NavArgument;", "a", "Landroid/content/res/TypedArray;", "inflateArgumentForBundle", "bundle", "Landroid/os/Bundle;", "inflateArgumentForDestination", "inflateDeepLink", "Companion", "navigation-runtime_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* compiled from: NavInflater.kt */
public final class NavInflater {
    public static final String APPLICATION_ID_PLACEHOLDER = "${applicationId}";
    public static final Companion Companion = new Companion((DefaultConstructorMarker) null);
    private static final String TAG_ACTION = "action";
    private static final String TAG_ARGUMENT = "argument";
    private static final String TAG_DEEP_LINK = "deepLink";
    private static final String TAG_INCLUDE = "include";
    private static final ThreadLocal<TypedValue> sTmpValue = new ThreadLocal<>();
    private final Context context;
    private final NavigatorProvider navigatorProvider;

    public NavInflater(Context context2, NavigatorProvider navigatorProvider2) {
        Intrinsics.checkNotNullParameter(context2, "context");
        Intrinsics.checkNotNullParameter(navigatorProvider2, "navigatorProvider");
        this.context = context2;
        this.navigatorProvider = navigatorProvider2;
    }

    /* JADX WARNING: Removed duplicated region for block: B:16:0x006a A[Catch:{ Exception -> 0x0074, all -> 0x0072 }] */
    /* JADX WARNING: Removed duplicated region for block: B:7:0x0027 A[Catch:{ Exception -> 0x0074, all -> 0x0072 }] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final androidx.navigation.NavGraph inflate(int r10) {
        /*
            r9 = this;
            android.content.Context r0 = r9.context
            android.content.res.Resources r0 = r0.getResources()
            android.content.res.XmlResourceParser r1 = r0.getXml(r10)
            java.lang.String r2 = "res.getXml(graphResId)"
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(r1, r2)
            r2 = r1
            org.xmlpull.v1.XmlPullParser r2 = (org.xmlpull.v1.XmlPullParser) r2
            android.util.AttributeSet r2 = android.util.Xml.asAttributeSet(r2)
            r3 = 0
        L_0x0018:
            int r4 = r1.next()     // Catch:{ Exception -> 0x0074 }
            r5 = r4
            r6 = 0
            r3 = r5
            r5 = 2
            if (r4 == r5) goto L_0x0025
            r4 = 1
            if (r3 != r4) goto L_0x0018
        L_0x0025:
            if (r3 != r5) goto L_0x006a
            java.lang.String r4 = r1.getName()     // Catch:{ Exception -> 0x0074 }
            java.lang.String r5 = "res"
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(r0, r5)     // Catch:{ Exception -> 0x0074 }
            java.lang.String r5 = "attrs"
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(r2, r5)     // Catch:{ Exception -> 0x0074 }
            androidx.navigation.NavDestination r5 = r9.inflate(r0, r1, r2, r10)     // Catch:{ Exception -> 0x0074 }
            boolean r6 = r5 instanceof androidx.navigation.NavGraph     // Catch:{ Exception -> 0x0074 }
            if (r6 == 0) goto L_0x0046
            r3 = r5
            androidx.navigation.NavGraph r3 = (androidx.navigation.NavGraph) r3     // Catch:{ Exception -> 0x0074 }
            r1.close()
            return r3
        L_0x0046:
            r6 = 0
            java.lang.StringBuilder r7 = new java.lang.StringBuilder     // Catch:{ Exception -> 0x0074 }
            r7.<init>()     // Catch:{ Exception -> 0x0074 }
            java.lang.String r8 = "Root element <"
            java.lang.StringBuilder r7 = r7.append(r8)     // Catch:{ Exception -> 0x0074 }
            java.lang.StringBuilder r7 = r7.append(r4)     // Catch:{ Exception -> 0x0074 }
            java.lang.String r8 = "> did not inflate into a NavGraph"
            java.lang.StringBuilder r7 = r7.append(r8)     // Catch:{ Exception -> 0x0074 }
            java.lang.String r7 = r7.toString()     // Catch:{ Exception -> 0x0074 }
            java.lang.IllegalArgumentException r6 = new java.lang.IllegalArgumentException     // Catch:{ Exception -> 0x0074 }
            java.lang.String r7 = r7.toString()     // Catch:{ Exception -> 0x0074 }
            r6.<init>(r7)     // Catch:{ Exception -> 0x0074 }
            throw r6     // Catch:{ Exception -> 0x0074 }
        L_0x006a:
            org.xmlpull.v1.XmlPullParserException r4 = new org.xmlpull.v1.XmlPullParserException     // Catch:{ Exception -> 0x0074 }
            java.lang.String r5 = "No start tag found"
            r4.<init>(r5)     // Catch:{ Exception -> 0x0074 }
            throw r4     // Catch:{ Exception -> 0x0074 }
        L_0x0072:
            r3 = move-exception
            goto L_0x00a3
        L_0x0074:
            r3 = move-exception
            java.lang.RuntimeException r4 = new java.lang.RuntimeException     // Catch:{ all -> 0x0072 }
            java.lang.StringBuilder r5 = new java.lang.StringBuilder     // Catch:{ all -> 0x0072 }
            r5.<init>()     // Catch:{ all -> 0x0072 }
            java.lang.String r6 = "Exception inflating "
            java.lang.StringBuilder r5 = r5.append(r6)     // Catch:{ all -> 0x0072 }
            java.lang.String r6 = r0.getResourceName(r10)     // Catch:{ all -> 0x0072 }
            java.lang.StringBuilder r5 = r5.append(r6)     // Catch:{ all -> 0x0072 }
            java.lang.String r6 = " line "
            java.lang.StringBuilder r5 = r5.append(r6)     // Catch:{ all -> 0x0072 }
            int r6 = r1.getLineNumber()     // Catch:{ all -> 0x0072 }
            java.lang.StringBuilder r5 = r5.append(r6)     // Catch:{ all -> 0x0072 }
            java.lang.String r5 = r5.toString()     // Catch:{ all -> 0x0072 }
            r6 = r3
            java.lang.Throwable r6 = (java.lang.Throwable) r6     // Catch:{ all -> 0x0072 }
            r4.<init>(r5, r6)     // Catch:{ all -> 0x0072 }
            throw r4     // Catch:{ all -> 0x0072 }
        L_0x00a3:
            r1.close()
            throw r3
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.navigation.NavInflater.inflate(int):androidx.navigation.NavGraph");
    }

    private final NavDestination inflate(Resources res, XmlResourceParser parser, AttributeSet attrs, int graphResId) throws XmlPullParserException, IOException {
        Resources resources = res;
        AttributeSet attributeSet = attrs;
        NavigatorProvider navigatorProvider2 = this.navigatorProvider;
        String name = parser.getName();
        Intrinsics.checkNotNullExpressionValue(name, "parser.name");
        NavDestination dest = navigatorProvider2.getNavigator(name).createDestination();
        dest.onInflate(this.context, attributeSet);
        int i = 1;
        int innerDepth = parser.getDepth() + 1;
        while (true) {
            int it = parser.next();
            int type = it;
            if (it == i) {
                break;
            }
            int it2 = parser.getDepth();
            int depth = it2;
            if (it2 < innerDepth && type == 3) {
                int i2 = depth;
                break;
            }
            if (type == 2 && depth <= innerDepth) {
                String name2 = parser.getName();
                if (Intrinsics.areEqual((Object) TAG_ARGUMENT, (Object) name2)) {
                    inflateArgumentForDestination(resources, dest, attributeSet, graphResId);
                } else {
                    int i3 = graphResId;
                    if (Intrinsics.areEqual((Object) TAG_DEEP_LINK, (Object) name2)) {
                        inflateDeepLink(resources, dest, attributeSet);
                    } else if (Intrinsics.areEqual((Object) TAG_ACTION, (Object) name2)) {
                        inflateAction(res, dest, attrs, parser, graphResId);
                    } else if (Intrinsics.areEqual((Object) TAG_INCLUDE, (Object) name2) && (dest instanceof NavGraph)) {
                        TypedArray $this$use$iv = resources.obtainAttributes(attributeSet, R.styleable.NavInclude);
                        Intrinsics.checkNotNullExpressionValue($this$use$iv, "res.obtainAttributes(att…n.R.styleable.NavInclude)");
                        ((NavGraph) dest).addDestination(inflate($this$use$iv.getResourceId(R.styleable.NavInclude_graph, 0)));
                        Unit unit = Unit.INSTANCE;
                        $this$use$iv.recycle();
                    } else if (dest instanceof NavGraph) {
                        ((NavGraph) dest).addDestination(inflate(res, parser, attrs, graphResId));
                    }
                }
            }
            int i4 = type;
            int i5 = depth;
            i = 1;
        }
        return dest;
    }

    private final void inflateArgumentForDestination(Resources res, NavDestination dest, AttributeSet attrs, int graphResId) throws XmlPullParserException {
        TypedArray $this$use$iv = res.obtainAttributes(attrs, R.styleable.NavArgument);
        Intrinsics.checkNotNullExpressionValue($this$use$iv, "res.obtainAttributes(att… R.styleable.NavArgument)");
        TypedArray array = $this$use$iv;
        String name = array.getString(R.styleable.NavArgument_android_name);
        if (name != null) {
            Intrinsics.checkNotNullExpressionValue(name, "array.getString(R.stylea…uments must have a name\")");
            dest.addArgument(name, inflateArgument(array, res, graphResId));
            Unit unit = Unit.INSTANCE;
            $this$use$iv.recycle();
            return;
        }
        throw new XmlPullParserException("Arguments must have a name");
    }

    private final void inflateArgumentForBundle(Resources res, Bundle bundle, AttributeSet attrs, int graphResId) throws XmlPullParserException {
        TypedArray $this$use$iv = res.obtainAttributes(attrs, R.styleable.NavArgument);
        Intrinsics.checkNotNullExpressionValue($this$use$iv, "res.obtainAttributes(att… R.styleable.NavArgument)");
        TypedArray array = $this$use$iv;
        String name = array.getString(R.styleable.NavArgument_android_name);
        if (name != null) {
            Intrinsics.checkNotNullExpressionValue(name, "array.getString(R.stylea…uments must have a name\")");
            NavArgument argument = inflateArgument(array, res, graphResId);
            if (argument.isDefaultValuePresent()) {
                argument.putDefaultValue(name, bundle);
            }
            Unit unit = Unit.INSTANCE;
            $this$use$iv.recycle();
            return;
        }
        throw new XmlPullParserException("Arguments must have a name");
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r2v0, resolved type: boolean} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r2v9, resolved type: boolean} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r2v10, resolved type: boolean} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r2v23, resolved type: boolean} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r2v26, resolved type: int} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r2v27, resolved type: boolean} */
    /* JADX WARNING: Multi-variable type inference failed */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private final androidx.navigation.NavArgument inflateArgument(android.content.res.TypedArray r13, android.content.res.Resources r14, int r15) throws org.xmlpull.v1.XmlPullParserException {
        /*
            r12 = this;
            androidx.navigation.NavArgument$Builder r0 = new androidx.navigation.NavArgument$Builder
            r0.<init>()
            int r1 = androidx.navigation.common.R.styleable.NavArgument_nullable
            r2 = 0
            boolean r1 = r13.getBoolean(r1, r2)
            r0.setIsNullable(r1)
            java.lang.ThreadLocal<android.util.TypedValue> r1 = sTmpValue
            java.lang.Object r1 = r1.get()
            android.util.TypedValue r1 = (android.util.TypedValue) r1
            if (r1 != 0) goto L_0x0024
            android.util.TypedValue r3 = new android.util.TypedValue
            r3.<init>()
            r1 = r3
            java.lang.ThreadLocal<android.util.TypedValue> r3 = sTmpValue
            r3.set(r1)
        L_0x0024:
            r3 = 0
            r4 = 0
            int r5 = androidx.navigation.common.R.styleable.NavArgument_argType
            java.lang.String r10 = r13.getString(r5)
            if (r10 == 0) goto L_0x003a
            androidx.navigation.NavType$Companion r5 = androidx.navigation.NavType.Companion
            java.lang.String r6 = r14.getResourcePackageName(r15)
            androidx.navigation.NavType r4 = r5.fromArgType(r10, r6)
            r11 = r4
            goto L_0x003b
        L_0x003a:
            r11 = r4
        L_0x003b:
            int r4 = androidx.navigation.common.R.styleable.NavArgument_android_defaultValue
            boolean r4 = r13.getValue(r4, r1)
            if (r4 == 0) goto L_0x01a9
            androidx.navigation.NavType<java.lang.Integer> r4 = androidx.navigation.NavType.ReferenceType
            java.lang.String r5 = "' for "
            java.lang.String r6 = "unsupported value '"
            r7 = 16
            if (r11 != r4) goto L_0x0090
            int r4 = r1.resourceId
            if (r4 == 0) goto L_0x0055
            int r2 = r1.resourceId
            goto L_0x005e
        L_0x0055:
            int r4 = r1.type
            if (r4 != r7) goto L_0x0065
            int r4 = r1.data
            if (r4 != 0) goto L_0x0065
        L_0x005e:
            java.lang.Integer r2 = java.lang.Integer.valueOf(r2)
            r3 = r2
            goto L_0x01a9
        L_0x0065:
            org.xmlpull.v1.XmlPullParserException r2 = new org.xmlpull.v1.XmlPullParserException
            java.lang.StringBuilder r4 = new java.lang.StringBuilder
            r4.<init>()
            java.lang.StringBuilder r4 = r4.append(r6)
            java.lang.CharSequence r6 = r1.string
            java.lang.StringBuilder r4 = r4.append(r6)
            java.lang.StringBuilder r4 = r4.append(r5)
            java.lang.String r5 = r11.getName()
            java.lang.StringBuilder r4 = r4.append(r5)
            java.lang.String r5 = ". Must be a reference to a resource."
            java.lang.StringBuilder r4 = r4.append(r5)
            java.lang.String r4 = r4.toString()
            r2.<init>(r4)
            throw r2
        L_0x0090:
            int r4 = r1.resourceId
            if (r4 == 0) goto L_0x00dc
            if (r11 != 0) goto L_0x00a0
            androidx.navigation.NavType<java.lang.Integer> r11 = androidx.navigation.NavType.ReferenceType
            int r2 = r1.resourceId
            java.lang.Integer r3 = java.lang.Integer.valueOf(r2)
            goto L_0x01a9
        L_0x00a0:
            org.xmlpull.v1.XmlPullParserException r2 = new org.xmlpull.v1.XmlPullParserException
            java.lang.StringBuilder r4 = new java.lang.StringBuilder
            r4.<init>()
            java.lang.StringBuilder r4 = r4.append(r6)
            java.lang.CharSequence r6 = r1.string
            java.lang.StringBuilder r4 = r4.append(r6)
            java.lang.StringBuilder r4 = r4.append(r5)
            java.lang.String r5 = r11.getName()
            java.lang.StringBuilder r4 = r4.append(r5)
            java.lang.String r5 = ". You must use a \""
            java.lang.StringBuilder r4 = r4.append(r5)
            androidx.navigation.NavType<java.lang.Integer> r5 = androidx.navigation.NavType.ReferenceType
            java.lang.String r5 = r5.getName()
            java.lang.StringBuilder r4 = r4.append(r5)
            java.lang.String r5 = "\" type to reference other resources."
            java.lang.StringBuilder r4 = r4.append(r5)
            java.lang.String r4 = r4.toString()
            r2.<init>(r4)
            throw r2
        L_0x00dc:
            androidx.navigation.NavType<java.lang.String> r4 = androidx.navigation.NavType.StringType
            if (r11 != r4) goto L_0x00e8
            int r2 = androidx.navigation.common.R.styleable.NavArgument_android_defaultValue
            java.lang.String r3 = r13.getString(r2)
            goto L_0x01a9
        L_0x00e8:
            int r4 = r1.type
            switch(r4) {
                case 3: goto L_0x0161;
                case 4: goto L_0x014b;
                case 5: goto L_0x012f;
                case 18: goto L_0x0117;
                default: goto L_0x00ed;
            }
        L_0x00ed:
            int r2 = r1.type
            if (r2 < r7) goto L_0x018d
            int r2 = r1.type
            r4 = 31
            if (r2 > r4) goto L_0x018d
            androidx.navigation.NavType<java.lang.Float> r2 = androidx.navigation.NavType.FloatType
            if (r11 != r2) goto L_0x0174
            androidx.navigation.NavInflater$Companion r4 = Companion
            androidx.navigation.NavType<java.lang.Float> r7 = androidx.navigation.NavType.FloatType
            java.lang.String r9 = "float"
            r5 = r1
            r6 = r11
            r8 = r10
            androidx.navigation.NavType r2 = r4.checkNavType$navigation_runtime_release(r5, r6, r7, r8, r9)
            r11 = r2
            int r2 = r1.data
            float r2 = (float) r2
            java.lang.Float r3 = java.lang.Float.valueOf(r2)
            goto L_0x01a9
        L_0x0117:
            androidx.navigation.NavInflater$Companion r4 = Companion
            androidx.navigation.NavType<java.lang.Boolean> r7 = androidx.navigation.NavType.BoolType
            java.lang.String r9 = "boolean"
            r5 = r1
            r6 = r11
            r8 = r10
            androidx.navigation.NavType r11 = r4.checkNavType$navigation_runtime_release(r5, r6, r7, r8, r9)
            int r4 = r1.data
            if (r4 == 0) goto L_0x0129
            r2 = 1
        L_0x0129:
            java.lang.Boolean r3 = java.lang.Boolean.valueOf(r2)
            goto L_0x01a9
        L_0x012f:
            androidx.navigation.NavInflater$Companion r4 = Companion
            androidx.navigation.NavType<java.lang.Integer> r7 = androidx.navigation.NavType.IntType
            java.lang.String r9 = "dimension"
            r5 = r1
            r6 = r11
            r8 = r10
            androidx.navigation.NavType r2 = r4.checkNavType$navigation_runtime_release(r5, r6, r7, r8, r9)
            r11 = r2
            android.util.DisplayMetrics r2 = r14.getDisplayMetrics()
            float r2 = r1.getDimension(r2)
            int r2 = (int) r2
            java.lang.Integer r3 = java.lang.Integer.valueOf(r2)
            goto L_0x01a9
        L_0x014b:
            androidx.navigation.NavInflater$Companion r4 = Companion
            androidx.navigation.NavType<java.lang.Float> r7 = androidx.navigation.NavType.FloatType
            java.lang.String r9 = "float"
            r5 = r1
            r6 = r11
            r8 = r10
            androidx.navigation.NavType r11 = r4.checkNavType$navigation_runtime_release(r5, r6, r7, r8, r9)
            float r2 = r1.getFloat()
            java.lang.Float r3 = java.lang.Float.valueOf(r2)
            goto L_0x01a9
        L_0x0161:
            java.lang.CharSequence r2 = r1.string
            java.lang.String r2 = r2.toString()
            if (r11 != 0) goto L_0x016f
            androidx.navigation.NavType$Companion r4 = androidx.navigation.NavType.Companion
            androidx.navigation.NavType r11 = r4.inferFromValue(r2)
        L_0x016f:
            java.lang.Object r3 = r11.parseValue(r2)
            goto L_0x01a9
        L_0x0174:
            androidx.navigation.NavInflater$Companion r4 = Companion
            androidx.navigation.NavType<java.lang.Integer> r7 = androidx.navigation.NavType.IntType
            java.lang.String r9 = "integer"
            r5 = r1
            r6 = r11
            r8 = r10
            androidx.navigation.NavType r2 = r4.checkNavType$navigation_runtime_release(r5, r6, r7, r8, r9)
            r11 = r2
            int r2 = r1.data
            java.lang.Integer r3 = java.lang.Integer.valueOf(r2)
            goto L_0x01a9
        L_0x018d:
            org.xmlpull.v1.XmlPullParserException r2 = new org.xmlpull.v1.XmlPullParserException
            java.lang.StringBuilder r4 = new java.lang.StringBuilder
            r4.<init>()
            java.lang.String r5 = "unsupported argument type "
            java.lang.StringBuilder r4 = r4.append(r5)
            int r5 = r1.type
            java.lang.StringBuilder r4 = r4.append(r5)
            java.lang.String r4 = r4.toString()
            r2.<init>(r4)
            throw r2
        L_0x01a9:
            if (r3 == 0) goto L_0x01ae
            r0.setDefaultValue(r3)
        L_0x01ae:
            if (r11 == 0) goto L_0x01b3
            r0.setType(r11)
        L_0x01b3:
            androidx.navigation.NavArgument r2 = r0.build()
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.navigation.NavInflater.inflateArgument(android.content.res.TypedArray, android.content.res.Resources, int):androidx.navigation.NavArgument");
    }

    private final void inflateDeepLink(Resources res, NavDestination dest, AttributeSet attrs) throws XmlPullParserException {
        String str;
        NavDeepLink.Builder builder;
        String str2;
        TypedArray $this$use$iv = res.obtainAttributes(attrs, R.styleable.NavDeepLink);
        Intrinsics.checkNotNullExpressionValue($this$use$iv, "res.obtainAttributes(att… R.styleable.NavDeepLink)");
        TypedArray array = $this$use$iv;
        String uri = array.getString(R.styleable.NavDeepLink_uri);
        String action = array.getString(R.styleable.NavDeepLink_action);
        String mimeType = array.getString(R.styleable.NavDeepLink_mimeType);
        CharSequence charSequence = uri;
        boolean z = true;
        if (charSequence == null || charSequence.length() == 0) {
            CharSequence charSequence2 = action;
            if (charSequence2 == null || charSequence2.length() == 0) {
                CharSequence charSequence3 = mimeType;
                if (charSequence3 == null || charSequence3.length() == 0) {
                    throw new XmlPullParserException("Every <deepLink> must include at least one of app:uri, app:action, or app:mimeType");
                }
            }
        }
        NavDeepLink.Builder builder2 = new NavDeepLink.Builder();
        if (uri != null) {
            String packageName = this.context.getPackageName();
            Intrinsics.checkNotNullExpressionValue(packageName, "context.packageName");
            str = "context.packageName";
            builder = builder2;
            builder.setUriPattern(StringsKt.replace$default(uri, APPLICATION_ID_PLACEHOLDER, packageName, false, 4, (Object) null));
        } else {
            str = "context.packageName";
            builder = builder2;
        }
        CharSequence charSequence4 = action;
        if (!(charSequence4 == null || charSequence4.length() == 0)) {
            z = false;
        }
        if (!z) {
            String packageName2 = this.context.getPackageName();
            Intrinsics.checkNotNullExpressionValue(packageName2, str);
            str2 = str;
            builder.setAction(StringsKt.replace$default(action, APPLICATION_ID_PLACEHOLDER, packageName2, false, 4, (Object) null));
        } else {
            str2 = str;
        }
        if (mimeType != null) {
            String packageName3 = this.context.getPackageName();
            Intrinsics.checkNotNullExpressionValue(packageName3, str2);
            builder.setMimeType(StringsKt.replace$default(mimeType, APPLICATION_ID_PLACEHOLDER, packageName3, false, 4, (Object) null));
        }
        dest.addDeepLink(builder.build());
        Unit unit = Unit.INSTANCE;
        $this$use$iv.recycle();
    }

    private final void inflateAction(Resources res, NavDestination dest, AttributeSet attrs, XmlResourceParser parser, int graphResId) throws IOException, XmlPullParserException {
        int innerDepth;
        int depth;
        AttributeSet attributeSet = attrs;
        Context $this$withStyledAttributes$iv = this.context;
        int[] attrs$iv = R.styleable.NavAction;
        Intrinsics.checkNotNullExpressionValue(attrs$iv, "NavAction");
        int defStyleAttr$iv = 0;
        TypedArray obtainStyledAttributes = $this$withStyledAttributes$iv.obtainStyledAttributes(attributeSet, attrs$iv, 0, 0);
        TypedArray $this$inflateAction_u24lambda_u2410 = obtainStyledAttributes;
        int id = $this$inflateAction_u24lambda_u2410.getResourceId(R.styleable.NavAction_android_id, 0);
        NavAction action = new NavAction($this$inflateAction_u24lambda_u2410.getResourceId(R.styleable.NavAction_destination, 0), (NavOptions) null, (Bundle) null, 6, (DefaultConstructorMarker) null);
        NavOptions.Builder builder = new NavOptions.Builder();
        builder.setLaunchSingleTop($this$inflateAction_u24lambda_u2410.getBoolean(R.styleable.NavAction_launchSingleTop, false));
        builder.setRestoreState($this$inflateAction_u24lambda_u2410.getBoolean(R.styleable.NavAction_restoreState, false));
        Context context2 = $this$withStyledAttributes$iv;
        int[] iArr = attrs$iv;
        builder.setPopUpTo($this$inflateAction_u24lambda_u2410.getResourceId(R.styleable.NavAction_popUpTo, -1), $this$inflateAction_u24lambda_u2410.getBoolean(R.styleable.NavAction_popUpToInclusive, false), $this$inflateAction_u24lambda_u2410.getBoolean(R.styleable.NavAction_popUpToSaveState, false));
        builder.setEnterAnim($this$inflateAction_u24lambda_u2410.getResourceId(R.styleable.NavAction_enterAnim, -1));
        builder.setExitAnim($this$inflateAction_u24lambda_u2410.getResourceId(R.styleable.NavAction_exitAnim, -1));
        builder.setPopEnterAnim($this$inflateAction_u24lambda_u2410.getResourceId(R.styleable.NavAction_popEnterAnim, -1));
        builder.setPopExitAnim($this$inflateAction_u24lambda_u2410.getResourceId(R.styleable.NavAction_popExitAnim, -1));
        action.setNavOptions(builder.build());
        Bundle args = new Bundle();
        int innerDepth2 = parser.getDepth() + 1;
        while (true) {
            int it = parser.next();
            int type = it;
            int it2 = defStyleAttr$iv;
            if (it == 1) {
                int i = graphResId;
                int i2 = innerDepth2;
                Resources resources = res;
                break;
            }
            int it3 = parser.getDepth();
            int depth2 = it3;
            if (it3 < innerDepth2 && type == 3) {
                int i3 = graphResId;
                int i4 = innerDepth2;
                Resources resources2 = res;
                break;
            }
            if (type != 2) {
                int i5 = graphResId;
                innerDepth = innerDepth2;
                depth = depth2;
                Resources resources3 = res;
            } else {
                depth = depth2;
                if (depth > innerDepth2) {
                    int i6 = graphResId;
                    innerDepth = innerDepth2;
                    Resources resources4 = res;
                } else {
                    String name = parser.getName();
                    innerDepth = innerDepth2;
                    if (Intrinsics.areEqual((Object) TAG_ARGUMENT, (Object) name)) {
                        String str = name;
                        inflateArgumentForBundle(res, args, attributeSet, graphResId);
                    } else {
                        Resources resources5 = res;
                        String str2 = name;
                        int i7 = graphResId;
                    }
                }
            }
            defStyleAttr$iv = it2;
            innerDepth2 = innerDepth;
        }
        if (!args.isEmpty()) {
            action.setDefaultArguments(args);
        }
        dest.putAction(id, action);
        obtainStyledAttributes.recycle();
    }

    @Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\b\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002JE\u0010\f\u001a\u0006\u0012\u0002\b\u00030\r2\u0006\u0010\u000e\u001a\u00020\u000b2\f\u0010\u000f\u001a\b\u0012\u0002\b\u0003\u0018\u00010\r2\n\u0010\u0010\u001a\u0006\u0012\u0002\b\u00030\r2\b\u0010\u0011\u001a\u0004\u0018\u00010\u00042\u0006\u0010\u0012\u001a\u00020\u0004H\u0000¢\u0006\u0002\b\u0013R\u0010\u0010\u0003\u001a\u00020\u00048\u0006XT¢\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000R\u000e\u0010\u0007\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000R\u000e\u0010\b\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000R\u0014\u0010\t\u001a\b\u0012\u0004\u0012\u00020\u000b0\nX\u0004¢\u0006\u0002\n\u0000¨\u0006\u0014"}, d2 = {"Landroidx/navigation/NavInflater$Companion;", "", "()V", "APPLICATION_ID_PLACEHOLDER", "", "TAG_ACTION", "TAG_ARGUMENT", "TAG_DEEP_LINK", "TAG_INCLUDE", "sTmpValue", "Ljava/lang/ThreadLocal;", "Landroid/util/TypedValue;", "checkNavType", "Landroidx/navigation/NavType;", "value", "navType", "expectedNavType", "argType", "foundType", "checkNavType$navigation_runtime_release", "navigation-runtime_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
    /* compiled from: NavInflater.kt */
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }

        public final NavType<?> checkNavType$navigation_runtime_release(TypedValue value, NavType<?> navType, NavType<?> expectedNavType, String argType, String foundType) throws XmlPullParserException {
            Intrinsics.checkNotNullParameter(value, "value");
            Intrinsics.checkNotNullParameter(expectedNavType, "expectedNavType");
            Intrinsics.checkNotNullParameter(foundType, "foundType");
            if (navType == null || navType == expectedNavType) {
                return navType == null ? expectedNavType : navType;
            }
            throw new XmlPullParserException("Type is " + argType + " but found " + foundType + ": " + value.data);
        }
    }
}
