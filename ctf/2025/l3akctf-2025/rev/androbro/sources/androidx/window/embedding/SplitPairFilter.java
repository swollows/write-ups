package androidx.window.embedding;

import android.app.Activity;
import android.content.ComponentName;
import android.content.Intent;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

@Metadata(d1 = {"\u00008\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0007\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0007\u0018\u00002\u00020\u0001B\u001f\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0006¢\u0006\u0002\u0010\u0007J\u0013\u0010\r\u001a\u00020\u000e2\b\u0010\u000f\u001a\u0004\u0018\u00010\u0001H\u0002J\b\u0010\u0010\u001a\u00020\u0011H\u0016J\u0016\u0010\u0012\u001a\u00020\u000e2\u0006\u0010\u0013\u001a\u00020\u00142\u0006\u0010\u0015\u001a\u00020\u0016J\u0016\u0010\u0017\u001a\u00020\u000e2\u0006\u0010\u0013\u001a\u00020\u00142\u0006\u0010\u0018\u001a\u00020\u0014J\b\u0010\u0019\u001a\u00020\u0006H\u0016R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\tR\u0013\u0010\u0005\u001a\u0004\u0018\u00010\u0006¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000bR\u0011\u0010\u0004\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\t¨\u0006\u001a"}, d2 = {"Landroidx/window/embedding/SplitPairFilter;", "", "primaryActivityName", "Landroid/content/ComponentName;", "secondaryActivityName", "secondaryActivityIntentAction", "", "(Landroid/content/ComponentName;Landroid/content/ComponentName;Ljava/lang/String;)V", "getPrimaryActivityName", "()Landroid/content/ComponentName;", "getSecondaryActivityIntentAction", "()Ljava/lang/String;", "getSecondaryActivityName", "equals", "", "other", "hashCode", "", "matchesActivityIntentPair", "primaryActivity", "Landroid/app/Activity;", "secondaryActivityIntent", "Landroid/content/Intent;", "matchesActivityPair", "secondaryActivity", "toString", "window_release"}, k = 1, mv = {1, 6, 0}, xi = 48)
/* compiled from: SplitPairFilter.kt */
public final class SplitPairFilter {
    private final ComponentName primaryActivityName;
    private final String secondaryActivityIntentAction;
    private final ComponentName secondaryActivityName;

    /* JADX WARNING: Removed duplicated region for block: B:13:0x006e  */
    /* JADX WARNING: Removed duplicated region for block: B:26:0x008f  */
    /* JADX WARNING: Removed duplicated region for block: B:57:0x0146 A[RETURN] */
    /* JADX WARNING: Removed duplicated region for block: B:58:0x0147  */
    /* JADX WARNING: Removed duplicated region for block: B:66:0x0177  */
    /* JADX WARNING: Removed duplicated region for block: B:68:0x0185  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public SplitPairFilter(android.content.ComponentName r24, android.content.ComponentName r25, java.lang.String r26) {
        /*
            r23 = this;
            r0 = r23
            r1 = r24
            r2 = r25
            java.lang.String r3 = "primaryActivityName"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r1, r3)
            java.lang.String r3 = "secondaryActivityName"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r2, r3)
            r23.<init>()
            r0.primaryActivityName = r1
            r0.secondaryActivityName = r2
            r3 = r26
            r0.secondaryActivityIntentAction = r3
            android.content.ComponentName r4 = r0.primaryActivityName
            java.lang.String r4 = r4.getPackageName()
            java.lang.String r5 = "primaryActivityName.packageName"
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(r4, r5)
            android.content.ComponentName r5 = r0.primaryActivityName
            java.lang.String r5 = r5.getClassName()
            java.lang.String r6 = "primaryActivityName.className"
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(r5, r6)
            android.content.ComponentName r6 = r0.secondaryActivityName
            java.lang.String r6 = r6.getPackageName()
            java.lang.String r7 = "secondaryActivityName.packageName"
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(r6, r7)
            android.content.ComponentName r7 = r0.secondaryActivityName
            java.lang.String r7 = r7.getClassName()
            java.lang.String r8 = "secondaryActivityName.className"
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(r7, r8)
            r8 = r4
            java.lang.CharSequence r8 = (java.lang.CharSequence) r8
            int r8 = r8.length()
            r9 = 1
            r10 = 0
            if (r8 != 0) goto L_0x0058
            r8 = r9
            goto L_0x0059
        L_0x0058:
            r8 = r10
        L_0x0059:
            if (r8 != 0) goto L_0x006b
            r8 = r6
            java.lang.CharSequence r8 = (java.lang.CharSequence) r8
            int r8 = r8.length()
            if (r8 != 0) goto L_0x0066
            r8 = r9
            goto L_0x0067
        L_0x0066:
            r8 = r10
        L_0x0067:
            if (r8 != 0) goto L_0x006b
            r8 = r9
            goto L_0x006c
        L_0x006b:
            r8 = r10
        L_0x006c:
            if (r8 == 0) goto L_0x0185
            r8 = r5
            java.lang.CharSequence r8 = (java.lang.CharSequence) r8
            int r8 = r8.length()
            if (r8 != 0) goto L_0x0079
            r8 = r9
            goto L_0x007a
        L_0x0079:
            r8 = r10
        L_0x007a:
            if (r8 != 0) goto L_0x008c
            r8 = r7
            java.lang.CharSequence r8 = (java.lang.CharSequence) r8
            int r8 = r8.length()
            if (r8 != 0) goto L_0x0087
            r8 = r9
            goto L_0x0088
        L_0x0087:
            r8 = r10
        L_0x0088:
            if (r8 != 0) goto L_0x008c
            r8 = r9
            goto L_0x008d
        L_0x008c:
            r8 = r10
        L_0x008d:
            if (r8 == 0) goto L_0x0177
            r8 = r4
            java.lang.CharSequence r8 = (java.lang.CharSequence) r8
            java.lang.String r11 = "*"
            r12 = r11
            java.lang.CharSequence r12 = (java.lang.CharSequence) r12
            r13 = 2
            r14 = 0
            boolean r8 = kotlin.text.StringsKt.contains$default((java.lang.CharSequence) r8, (java.lang.CharSequence) r12, (boolean) r10, (int) r13, (java.lang.Object) r14)
            if (r8 == 0) goto L_0x00ba
            r15 = r4
            java.lang.CharSequence r15 = (java.lang.CharSequence) r15
            r19 = 6
            r20 = 0
            java.lang.String r16 = "*"
            r17 = 0
            r18 = 0
            int r8 = kotlin.text.StringsKt.indexOf$default((java.lang.CharSequence) r15, (java.lang.String) r16, (int) r17, (boolean) r18, (int) r19, (java.lang.Object) r20)
            int r12 = r4.length()
            int r12 = r12 - r9
            if (r8 != r12) goto L_0x00b8
            goto L_0x00ba
        L_0x00b8:
            r8 = r10
            goto L_0x00bb
        L_0x00ba:
            r8 = r9
        L_0x00bb:
            java.lang.String r12 = "Wildcard in package name is only allowed at the end."
            if (r8 == 0) goto L_0x016b
            r8 = r5
            java.lang.CharSequence r8 = (java.lang.CharSequence) r8
            r15 = r11
            java.lang.CharSequence r15 = (java.lang.CharSequence) r15
            boolean r8 = kotlin.text.StringsKt.contains$default((java.lang.CharSequence) r8, (java.lang.CharSequence) r15, (boolean) r10, (int) r13, (java.lang.Object) r14)
            if (r8 == 0) goto L_0x00e6
            r15 = r5
            java.lang.CharSequence r15 = (java.lang.CharSequence) r15
            r19 = 6
            r20 = 0
            java.lang.String r16 = "*"
            r17 = 0
            r18 = 0
            int r8 = kotlin.text.StringsKt.indexOf$default((java.lang.CharSequence) r15, (java.lang.String) r16, (int) r17, (boolean) r18, (int) r19, (java.lang.Object) r20)
            int r15 = r5.length()
            int r15 = r15 - r9
            if (r8 != r15) goto L_0x00e4
            goto L_0x00e6
        L_0x00e4:
            r8 = r10
            goto L_0x00e7
        L_0x00e6:
            r8 = r9
        L_0x00e7:
            java.lang.String r15 = "Wildcard in class name is only allowed at the end."
            if (r8 == 0) goto L_0x015f
            r8 = r6
            java.lang.CharSequence r8 = (java.lang.CharSequence) r8
            r9 = r11
            java.lang.CharSequence r9 = (java.lang.CharSequence) r9
            boolean r8 = kotlin.text.StringsKt.contains$default((java.lang.CharSequence) r8, (java.lang.CharSequence) r9, (boolean) r10, (int) r13, (java.lang.Object) r14)
            if (r8 == 0) goto L_0x0116
            r17 = r6
            java.lang.CharSequence r17 = (java.lang.CharSequence) r17
            r21 = 6
            r22 = 0
            java.lang.String r18 = "*"
            r19 = 0
            r20 = 0
            int r8 = kotlin.text.StringsKt.indexOf$default((java.lang.CharSequence) r17, (java.lang.String) r18, (int) r19, (boolean) r20, (int) r21, (java.lang.Object) r22)
            int r9 = r6.length()
            r16 = 1
            int r9 = r9 + -1
            if (r8 != r9) goto L_0x0114
            goto L_0x0116
        L_0x0114:
            r8 = r10
            goto L_0x0117
        L_0x0116:
            r8 = 1
        L_0x0117:
            if (r8 == 0) goto L_0x0153
            r8 = r7
            java.lang.CharSequence r8 = (java.lang.CharSequence) r8
            java.lang.CharSequence r11 = (java.lang.CharSequence) r11
            boolean r8 = kotlin.text.StringsKt.contains$default((java.lang.CharSequence) r8, (java.lang.CharSequence) r11, (boolean) r10, (int) r13, (java.lang.Object) r14)
            if (r8 == 0) goto L_0x0141
            r17 = r7
            java.lang.CharSequence r17 = (java.lang.CharSequence) r17
            r21 = 6
            r22 = 0
            java.lang.String r18 = "*"
            r19 = 0
            r20 = 0
            int r8 = kotlin.text.StringsKt.indexOf$default((java.lang.CharSequence) r17, (java.lang.String) r18, (int) r19, (boolean) r20, (int) r21, (java.lang.Object) r22)
            int r9 = r7.length()
            r11 = 1
            int r9 = r9 - r11
            if (r8 != r9) goto L_0x013f
            goto L_0x0142
        L_0x013f:
            r9 = r10
            goto L_0x0143
        L_0x0141:
            r11 = 1
        L_0x0142:
            r9 = r11
        L_0x0143:
            if (r9 == 0) goto L_0x0147
            return
        L_0x0147:
            r8 = 0
            java.lang.IllegalArgumentException r8 = new java.lang.IllegalArgumentException
            java.lang.String r9 = r15.toString()
            r8.<init>(r9)
            throw r8
        L_0x0153:
            r8 = 0
            java.lang.IllegalArgumentException r8 = new java.lang.IllegalArgumentException
            java.lang.String r9 = r12.toString()
            r8.<init>(r9)
            throw r8
        L_0x015f:
            r8 = 0
            java.lang.IllegalArgumentException r8 = new java.lang.IllegalArgumentException
            java.lang.String r9 = r15.toString()
            r8.<init>(r9)
            throw r8
        L_0x016b:
            r8 = 0
            java.lang.IllegalArgumentException r8 = new java.lang.IllegalArgumentException
            java.lang.String r9 = r12.toString()
            r8.<init>(r9)
            throw r8
        L_0x0177:
            r8 = 0
            java.lang.IllegalArgumentException r8 = new java.lang.IllegalArgumentException
            java.lang.String r9 = "Activity class name must not be empty."
            java.lang.String r9 = r9.toString()
            r8.<init>(r9)
            throw r8
        L_0x0185:
            r8 = 0
            java.lang.IllegalArgumentException r8 = new java.lang.IllegalArgumentException
            java.lang.String r9 = "Package name must not be empty"
            java.lang.String r9 = r9.toString()
            r8.<init>(r9)
            throw r8
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.window.embedding.SplitPairFilter.<init>(android.content.ComponentName, android.content.ComponentName, java.lang.String):void");
    }

    public final ComponentName getPrimaryActivityName() {
        return this.primaryActivityName;
    }

    public final ComponentName getSecondaryActivityName() {
        return this.secondaryActivityName;
    }

    public final String getSecondaryActivityIntentAction() {
        return this.secondaryActivityIntentAction;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:10:0x0043, code lost:
        if (matchesActivityIntentPair(r6, r3) != false) goto L_0x0047;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final boolean matchesActivityPair(android.app.Activity r6, android.app.Activity r7) {
        /*
            r5 = this;
            java.lang.String r0 = "primaryActivity"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r6, r0)
            java.lang.String r0 = "secondaryActivity"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r7, r0)
            androidx.window.embedding.MatcherUtils r0 = androidx.window.embedding.MatcherUtils.INSTANCE
            android.content.ComponentName r1 = r6.getComponentName()
            android.content.ComponentName r2 = r5.primaryActivityName
            boolean r0 = r0.areComponentsMatching$window_release(r1, r2)
            r1 = 1
            r2 = 0
            if (r0 == 0) goto L_0x002b
            androidx.window.embedding.MatcherUtils r0 = androidx.window.embedding.MatcherUtils.INSTANCE
            android.content.ComponentName r3 = r7.getComponentName()
            android.content.ComponentName r4 = r5.secondaryActivityName
            boolean r0 = r0.areComponentsMatching$window_release(r3, r4)
            if (r0 == 0) goto L_0x002b
            r0 = r1
            goto L_0x002c
        L_0x002b:
            r0 = r2
        L_0x002c:
            android.content.Intent r3 = r7.getIntent()
            if (r3 == 0) goto L_0x0048
            if (r0 == 0) goto L_0x0046
            android.content.Intent r3 = r7.getIntent()
            java.lang.String r4 = "secondaryActivity.intent"
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(r3, r4)
            boolean r3 = r5.matchesActivityIntentPair(r6, r3)
            if (r3 == 0) goto L_0x0046
            goto L_0x0047
        L_0x0046:
            r1 = r2
        L_0x0047:
            r0 = r1
        L_0x0048:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.window.embedding.SplitPairFilter.matchesActivityPair(android.app.Activity, android.app.Activity):boolean");
    }

    public final boolean matchesActivityIntentPair(Activity primaryActivity, Intent secondaryActivityIntent) {
        Intrinsics.checkNotNullParameter(primaryActivity, "primaryActivity");
        Intrinsics.checkNotNullParameter(secondaryActivityIntent, "secondaryActivityIntent");
        boolean match = false;
        if (MatcherUtils.INSTANCE.areComponentsMatching$window_release(primaryActivity.getComponentName(), this.primaryActivityName) && MatcherUtils.INSTANCE.areComponentsMatching$window_release(secondaryActivityIntent.getComponent(), this.secondaryActivityName) && (this.secondaryActivityIntentAction == null || Intrinsics.areEqual((Object) this.secondaryActivityIntentAction, (Object) secondaryActivityIntent.getAction()))) {
            match = true;
        }
        return match;
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if ((other instanceof SplitPairFilter) && Intrinsics.areEqual((Object) this.primaryActivityName, (Object) ((SplitPairFilter) other).primaryActivityName) && Intrinsics.areEqual((Object) this.secondaryActivityName, (Object) ((SplitPairFilter) other).secondaryActivityName) && Intrinsics.areEqual((Object) this.secondaryActivityIntentAction, (Object) ((SplitPairFilter) other).secondaryActivityIntentAction)) {
            return true;
        }
        return false;
    }

    public int hashCode() {
        int result = ((this.primaryActivityName.hashCode() * 31) + this.secondaryActivityName.hashCode()) * 31;
        String str = this.secondaryActivityIntentAction;
        return result + (str == null ? 0 : str.hashCode());
    }

    public String toString() {
        return "SplitPairFilter{primaryActivityName=" + this.primaryActivityName + ", secondaryActivityName=" + this.secondaryActivityName + ", secondaryActivityAction=" + this.secondaryActivityIntentAction + '}';
    }
}
