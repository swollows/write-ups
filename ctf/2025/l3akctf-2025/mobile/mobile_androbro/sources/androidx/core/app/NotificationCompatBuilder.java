package androidx.core.app;

import android.app.Notification;
import android.app.PendingIntent;
import android.app.Person;
import android.app.RemoteInput;
import android.content.Context;
import android.content.LocusId;
import android.graphics.drawable.Icon;
import android.media.AudioAttributes;
import android.net.Uri;
import android.os.Build;
import android.os.Bundle;
import android.text.TextUtils;
import android.widget.RemoteViews;
import androidx.collection.ArraySet;
import androidx.core.app.NotificationCompat;
import androidx.core.graphics.drawable.IconCompat;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;

class NotificationCompatBuilder implements NotificationBuilderWithBuilderAccessor {
    private final List<Bundle> mActionExtrasList = new ArrayList();
    private RemoteViews mBigContentView;
    private final Notification.Builder mBuilder;
    private final NotificationCompat.Builder mBuilderCompat;
    private RemoteViews mContentView;
    private final Context mContext;
    private final Bundle mExtras = new Bundle();
    private int mGroupAlertBehavior;
    private RemoteViews mHeadsUpContentView;

    NotificationCompatBuilder(NotificationCompat.Builder b) {
        List<String> people;
        NotificationCompat.Builder builder = b;
        this.mBuilderCompat = builder;
        this.mContext = builder.mContext;
        if (Build.VERSION.SDK_INT >= 26) {
            this.mBuilder = Api26Impl.createBuilder(builder.mContext, builder.mChannelId);
        } else {
            this.mBuilder = new Notification.Builder(builder.mContext);
        }
        Notification n = builder.mNotification;
        this.mBuilder.setWhen(n.when).setSmallIcon(n.icon, n.iconLevel).setContent(n.contentView).setTicker(n.tickerText, builder.mTickerView).setVibrate(n.vibrate).setLights(n.ledARGB, n.ledOnMS, n.ledOffMS).setOngoing((n.flags & 2) != 0).setOnlyAlertOnce((n.flags & 8) != 0).setAutoCancel((n.flags & 16) != 0).setDefaults(n.defaults).setContentTitle(builder.mContentTitle).setContentText(builder.mContentText).setContentInfo(builder.mContentInfo).setContentIntent(builder.mContentIntent).setDeleteIntent(n.deleteIntent).setFullScreenIntent(builder.mFullScreenIntent, (n.flags & 128) != 0).setNumber(builder.mNumber).setProgress(builder.mProgressMax, builder.mProgress, builder.mProgressIndeterminate);
        Api23Impl.setLargeIcon(this.mBuilder, builder.mLargeIcon == null ? null : builder.mLargeIcon.toIcon(this.mContext));
        this.mBuilder.setSubText(builder.mSubText).setUsesChronometer(builder.mUseChronometer).setPriority(builder.mPriority);
        if (builder.mStyle instanceof NotificationCompat.CallStyle) {
            for (NotificationCompat.Action action : ((NotificationCompat.CallStyle) builder.mStyle).getActionsListWithSystemActions()) {
                addAction(action);
            }
        } else {
            Iterator<NotificationCompat.Action> it = builder.mActions.iterator();
            while (it.hasNext()) {
                addAction(it.next());
            }
        }
        if (builder.mExtras != null) {
            this.mExtras.putAll(builder.mExtras);
        }
        this.mContentView = builder.mContentView;
        this.mBigContentView = builder.mBigContentView;
        this.mBuilder.setShowWhen(builder.mShowWhen);
        Api20Impl.setLocalOnly(this.mBuilder, builder.mLocalOnly);
        Api20Impl.setGroup(this.mBuilder, builder.mGroupKey);
        Api20Impl.setSortKey(this.mBuilder, builder.mSortKey);
        Api20Impl.setGroupSummary(this.mBuilder, builder.mGroupSummary);
        this.mGroupAlertBehavior = builder.mGroupAlertBehavior;
        Api21Impl.setCategory(this.mBuilder, builder.mCategory);
        Api21Impl.setColor(this.mBuilder, builder.mColor);
        Api21Impl.setVisibility(this.mBuilder, builder.mVisibility);
        Api21Impl.setPublicVersion(this.mBuilder, builder.mPublicVersion);
        Api21Impl.setSound(this.mBuilder, n.sound, n.audioAttributes);
        if (Build.VERSION.SDK_INT < 28) {
            people = combineLists(getPeople(builder.mPersonList), builder.mPeople);
        } else {
            people = builder.mPeople;
        }
        if (people != null && !people.isEmpty()) {
            for (String person : people) {
                Api21Impl.addPerson(this.mBuilder, person);
            }
        }
        this.mHeadsUpContentView = builder.mHeadsUpContentView;
        if (builder.mInvisibleActions.size() > 0) {
            Bundle carExtenderBundle = b.getExtras().getBundle("android.car.EXTENSIONS");
            carExtenderBundle = carExtenderBundle == null ? new Bundle() : carExtenderBundle;
            Bundle extenderBundleCopy = new Bundle(carExtenderBundle);
            Bundle listBundle = new Bundle();
            for (int i = 0; i < builder.mInvisibleActions.size(); i++) {
                listBundle.putBundle(Integer.toString(i), NotificationCompatJellybean.getBundleForAction(builder.mInvisibleActions.get(i)));
            }
            carExtenderBundle.putBundle("invisible_actions", listBundle);
            extenderBundleCopy.putBundle("invisible_actions", listBundle);
            b.getExtras().putBundle("android.car.EXTENSIONS", carExtenderBundle);
            this.mExtras.putBundle("android.car.EXTENSIONS", extenderBundleCopy);
        }
        if (builder.mSmallIcon != null) {
            Api23Impl.setSmallIcon(this.mBuilder, builder.mSmallIcon);
        }
        this.mBuilder.setExtras(builder.mExtras);
        Api24Impl.setRemoteInputHistory(this.mBuilder, builder.mRemoteInputHistory);
        if (builder.mContentView != null) {
            Api24Impl.setCustomContentView(this.mBuilder, builder.mContentView);
        }
        if (builder.mBigContentView != null) {
            Api24Impl.setCustomBigContentView(this.mBuilder, builder.mBigContentView);
        }
        if (builder.mHeadsUpContentView != null) {
            Api24Impl.setCustomHeadsUpContentView(this.mBuilder, builder.mHeadsUpContentView);
        }
        if (Build.VERSION.SDK_INT >= 26) {
            Api26Impl.setBadgeIconType(this.mBuilder, builder.mBadgeIcon);
            Api26Impl.setSettingsText(this.mBuilder, builder.mSettingsText);
            Api26Impl.setShortcutId(this.mBuilder, builder.mShortcutId);
            Api26Impl.setTimeoutAfter(this.mBuilder, builder.mTimeout);
            Api26Impl.setGroupAlertBehavior(this.mBuilder, builder.mGroupAlertBehavior);
            if (builder.mColorizedSet) {
                Api26Impl.setColorized(this.mBuilder, builder.mColorized);
            }
            if (!TextUtils.isEmpty(builder.mChannelId)) {
                this.mBuilder.setSound((Uri) null).setDefaults(0).setLights(0, 0, 0).setVibrate((long[]) null);
            }
        }
        if (Build.VERSION.SDK_INT >= 28) {
            Iterator<Person> it2 = builder.mPersonList.iterator();
            while (it2.hasNext()) {
                Api28Impl.addPerson(this.mBuilder, it2.next().toAndroidPerson());
            }
        }
        if (Build.VERSION.SDK_INT >= 29) {
            Api29Impl.setAllowSystemGeneratedContextualActions(this.mBuilder, builder.mAllowSystemGeneratedContextualActions);
            Api29Impl.setBubbleMetadata(this.mBuilder, NotificationCompat.BubbleMetadata.toPlatform(builder.mBubbleMetadata));
            if (builder.mLocusId != null) {
                Api29Impl.setLocusId(this.mBuilder, builder.mLocusId.toLocusId());
            }
        }
        if (Build.VERSION.SDK_INT >= 31 && builder.mFgsDeferBehavior != 0) {
            Api31Impl.setForegroundServiceBehavior(this.mBuilder, builder.mFgsDeferBehavior);
        }
        if (builder.mSilent) {
            if (this.mBuilderCompat.mGroupSummary) {
                this.mGroupAlertBehavior = 2;
            } else {
                this.mGroupAlertBehavior = 1;
            }
            this.mBuilder.setVibrate((long[]) null);
            this.mBuilder.setSound((Uri) null);
            n.defaults &= -2;
            n.defaults &= -3;
            this.mBuilder.setDefaults(n.defaults);
            if (Build.VERSION.SDK_INT >= 26) {
                if (TextUtils.isEmpty(this.mBuilderCompat.mGroupKey)) {
                    Api20Impl.setGroup(this.mBuilder, NotificationCompat.GROUP_KEY_SILENT);
                }
                Api26Impl.setGroupAlertBehavior(this.mBuilder, this.mGroupAlertBehavior);
            }
        }
    }

    private static List<String> combineLists(List<String> first, List<String> second) {
        if (first == null) {
            return second;
        }
        if (second == null) {
            return first;
        }
        ArraySet<String> people = new ArraySet<>(first.size() + second.size());
        people.addAll((Collection<? extends String>) first);
        people.addAll((Collection<? extends String>) second);
        return new ArrayList(people);
    }

    private static List<String> getPeople(List<Person> people) {
        if (people == null) {
            return null;
        }
        ArrayList<String> result = new ArrayList<>(people.size());
        for (Person person : people) {
            result.add(person.resolveToLegacyUri());
        }
        return result;
    }

    public Notification.Builder getBuilder() {
        return this.mBuilder;
    }

    /* access modifiers changed from: package-private */
    public Context getContext() {
        return this.mContext;
    }

    public Notification build() {
        RemoteViews styleContentView;
        Bundle extras;
        RemoteViews styleHeadsUpContentView;
        RemoteViews styleBigContentView;
        NotificationCompat.Style style = this.mBuilderCompat.mStyle;
        if (style != null) {
            style.apply(this);
        }
        if (style != null) {
            styleContentView = style.makeContentView(this);
        } else {
            styleContentView = null;
        }
        Notification n = buildInternal();
        if (styleContentView != null) {
            n.contentView = styleContentView;
        } else if (this.mBuilderCompat.mContentView != null) {
            n.contentView = this.mBuilderCompat.mContentView;
        }
        if (!(style == null || (styleBigContentView = style.makeBigContentView(this)) == null)) {
            n.bigContentView = styleBigContentView;
        }
        if (!(style == null || (styleHeadsUpContentView = this.mBuilderCompat.mStyle.makeHeadsUpContentView(this)) == null)) {
            n.headsUpContentView = styleHeadsUpContentView;
        }
        if (!(style == null || (extras = NotificationCompat.getExtras(n)) == null)) {
            style.addCompatExtras(extras);
        }
        return n;
    }

    private void addAction(NotificationCompat.Action action) {
        Bundle actionExtras;
        IconCompat iconCompat = action.getIconCompat();
        Notification.Action.Builder actionBuilder = Api23Impl.createBuilder(iconCompat != null ? iconCompat.toIcon() : null, action.getTitle(), action.getActionIntent());
        if (action.getRemoteInputs() != null) {
            for (RemoteInput remoteInput : RemoteInput.fromCompat(action.getRemoteInputs())) {
                Api20Impl.addRemoteInput(actionBuilder, remoteInput);
            }
        }
        if (action.getExtras() != null) {
            actionExtras = new Bundle(action.getExtras());
        } else {
            actionExtras = new Bundle();
        }
        actionExtras.putBoolean("android.support.allowGeneratedReplies", action.getAllowGeneratedReplies());
        Api24Impl.setAllowGeneratedReplies(actionBuilder, action.getAllowGeneratedReplies());
        actionExtras.putInt("android.support.action.semanticAction", action.getSemanticAction());
        if (Build.VERSION.SDK_INT >= 28) {
            Api28Impl.setSemanticAction(actionBuilder, action.getSemanticAction());
        }
        if (Build.VERSION.SDK_INT >= 29) {
            Api29Impl.setContextual(actionBuilder, action.isContextual());
        }
        if (Build.VERSION.SDK_INT >= 31) {
            Api31Impl.setAuthenticationRequired(actionBuilder, action.isAuthenticationRequired());
        }
        actionExtras.putBoolean("android.support.action.showsUserInterface", action.getShowsUserInterface());
        Api20Impl.addExtras(actionBuilder, actionExtras);
        Api20Impl.addAction(this.mBuilder, Api20Impl.build(actionBuilder));
    }

    /* access modifiers changed from: protected */
    public Notification buildInternal() {
        if (Build.VERSION.SDK_INT >= 26) {
            return this.mBuilder.build();
        }
        Notification notification = this.mBuilder.build();
        if (this.mGroupAlertBehavior != 0) {
            if (!(Api20Impl.getGroup(notification) == null || (notification.flags & 512) == 0 || this.mGroupAlertBehavior != 2)) {
                removeSoundAndVibration(notification);
            }
            if (Api20Impl.getGroup(notification) != null && (notification.flags & 512) == 0 && this.mGroupAlertBehavior == 1) {
                removeSoundAndVibration(notification);
            }
        }
        return notification;
    }

    private void removeSoundAndVibration(Notification notification) {
        notification.sound = null;
        notification.vibrate = null;
        notification.defaults &= -2;
        notification.defaults &= -3;
    }

    static class Api20Impl {
        private Api20Impl() {
        }

        static Notification.Action.Builder createBuilder(int icon, CharSequence title, PendingIntent intent) {
            return new Notification.Action.Builder(icon, title, intent);
        }

        static Notification.Action.Builder addRemoteInput(Notification.Action.Builder builder, RemoteInput remoteInput) {
            return builder.addRemoteInput(remoteInput);
        }

        static Notification.Action.Builder addExtras(Notification.Action.Builder builder, Bundle extras) {
            return builder.addExtras(extras);
        }

        static Notification.Builder addAction(Notification.Builder builder, Notification.Action action) {
            return builder.addAction(action);
        }

        static Notification.Action build(Notification.Action.Builder builder) {
            return builder.build();
        }

        static String getGroup(Notification notification) {
            return notification.getGroup();
        }

        static Notification.Builder setGroup(Notification.Builder builder, String groupKey) {
            return builder.setGroup(groupKey);
        }

        static Notification.Builder setGroupSummary(Notification.Builder builder, boolean isGroupSummary) {
            return builder.setGroupSummary(isGroupSummary);
        }

        static Notification.Builder setLocalOnly(Notification.Builder builder, boolean localOnly) {
            return builder.setLocalOnly(localOnly);
        }

        static Notification.Builder setSortKey(Notification.Builder builder, String sortKey) {
            return builder.setSortKey(sortKey);
        }
    }

    static class Api21Impl {
        private Api21Impl() {
        }

        static Notification.Builder addPerson(Notification.Builder builder, String uri) {
            return builder.addPerson(uri);
        }

        static Notification.Builder setCategory(Notification.Builder builder, String category) {
            return builder.setCategory(category);
        }

        static Notification.Builder setColor(Notification.Builder builder, int argb) {
            return builder.setColor(argb);
        }

        static Notification.Builder setVisibility(Notification.Builder builder, int visibility) {
            return builder.setVisibility(visibility);
        }

        static Notification.Builder setPublicVersion(Notification.Builder builder, Notification n) {
            return builder.setPublicVersion(n);
        }

        static Notification.Builder setSound(Notification.Builder builder, Uri sound, Object audioAttributes) {
            return builder.setSound(sound, (AudioAttributes) audioAttributes);
        }
    }

    static class Api23Impl {
        private Api23Impl() {
        }

        static Notification.Action.Builder createBuilder(Icon icon, CharSequence title, PendingIntent intent) {
            return new Notification.Action.Builder(icon, title, intent);
        }

        static Notification.Builder setSmallIcon(Notification.Builder builder, Object icon) {
            return builder.setSmallIcon((Icon) icon);
        }

        static Notification.Builder setLargeIcon(Notification.Builder builder, Icon icon) {
            return builder.setLargeIcon(icon);
        }
    }

    static class Api24Impl {
        private Api24Impl() {
        }

        static Notification.Action.Builder setAllowGeneratedReplies(Notification.Action.Builder builder, boolean allowGeneratedReplies) {
            return builder.setAllowGeneratedReplies(allowGeneratedReplies);
        }

        static Notification.Builder setRemoteInputHistory(Notification.Builder builder, CharSequence[] text) {
            return builder.setRemoteInputHistory(text);
        }

        static Notification.Builder setCustomContentView(Notification.Builder builder, RemoteViews contentView) {
            return builder.setCustomContentView(contentView);
        }

        static Notification.Builder setCustomBigContentView(Notification.Builder builder, RemoteViews contentView) {
            return builder.setCustomBigContentView(contentView);
        }

        static Notification.Builder setCustomHeadsUpContentView(Notification.Builder builder, RemoteViews contentView) {
            return builder.setCustomHeadsUpContentView(contentView);
        }
    }

    static class Api26Impl {
        private Api26Impl() {
        }

        static Notification.Builder createBuilder(Context context, String channelId) {
            return new Notification.Builder(context, channelId);
        }

        static Notification.Builder setGroupAlertBehavior(Notification.Builder builder, int groupAlertBehavior) {
            return builder.setGroupAlertBehavior(groupAlertBehavior);
        }

        static Notification.Builder setColorized(Notification.Builder builder, boolean colorize) {
            return builder.setColorized(colorize);
        }

        static Notification.Builder setBadgeIconType(Notification.Builder builder, int icon) {
            return builder.setBadgeIconType(icon);
        }

        static Notification.Builder setSettingsText(Notification.Builder builder, CharSequence text) {
            return builder.setSettingsText(text);
        }

        static Notification.Builder setShortcutId(Notification.Builder builder, String shortcutId) {
            return builder.setShortcutId(shortcutId);
        }

        static Notification.Builder setTimeoutAfter(Notification.Builder builder, long durationMs) {
            return builder.setTimeoutAfter(durationMs);
        }
    }

    static class Api28Impl {
        private Api28Impl() {
        }

        static Notification.Action.Builder setSemanticAction(Notification.Action.Builder builder, int semanticAction) {
            return builder.setSemanticAction(semanticAction);
        }

        static Notification.Builder addPerson(Notification.Builder builder, Person person) {
            return builder.addPerson(person);
        }
    }

    static class Api29Impl {
        private Api29Impl() {
        }

        static Notification.Action.Builder setContextual(Notification.Action.Builder builder, boolean isContextual) {
            return builder.setContextual(isContextual);
        }

        static Notification.Builder setLocusId(Notification.Builder builder, Object locusId) {
            return builder.setLocusId((LocusId) locusId);
        }

        static Notification.Builder setBubbleMetadata(Notification.Builder builder, Notification.BubbleMetadata data) {
            return builder.setBubbleMetadata(data);
        }

        static Notification.Builder setAllowSystemGeneratedContextualActions(Notification.Builder builder, boolean allowed) {
            return builder.setAllowSystemGeneratedContextualActions(allowed);
        }
    }

    static class Api31Impl {
        private Api31Impl() {
        }

        static Notification.Action.Builder setAuthenticationRequired(Notification.Action.Builder builder, boolean authenticationRequired) {
            return builder.setAuthenticationRequired(authenticationRequired);
        }

        static Notification.Builder setForegroundServiceBehavior(Notification.Builder builder, int behavior) {
            return builder.setForegroundServiceBehavior(behavior);
        }
    }
}
