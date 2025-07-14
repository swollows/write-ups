package androidx.core.app;

import android.app.Notification;
import android.app.PendingIntent;
import android.app.Person;
import android.app.RemoteInput;
import android.content.Context;
import android.content.LocusId;
import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffColorFilter;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.Icon;
import android.media.AudioAttributes;
import android.net.Uri;
import android.os.Build;
import android.os.Bundle;
import android.os.Parcelable;
import android.text.SpannableStringBuilder;
import android.text.TextUtils;
import android.text.style.ForegroundColorSpan;
import android.text.style.TextAppearanceSpan;
import android.util.Log;
import android.widget.RemoteViews;
import androidx.core.R;
import androidx.core.app.Person;
import androidx.core.content.ContextCompat;
import androidx.core.content.LocusIdCompat;
import androidx.core.content.pm.ShortcutInfoCompat;
import androidx.core.graphics.drawable.IconCompat;
import androidx.core.text.BidiFormatter;
import androidx.core.view.ViewCompat;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.Objects;
import java.util.Set;

public class NotificationCompat {
    public static final int BADGE_ICON_LARGE = 2;
    public static final int BADGE_ICON_NONE = 0;
    public static final int BADGE_ICON_SMALL = 1;
    public static final String CATEGORY_ALARM = "alarm";
    public static final String CATEGORY_CALL = "call";
    public static final String CATEGORY_EMAIL = "email";
    public static final String CATEGORY_ERROR = "err";
    public static final String CATEGORY_EVENT = "event";
    public static final String CATEGORY_LOCATION_SHARING = "location_sharing";
    public static final String CATEGORY_MESSAGE = "msg";
    public static final String CATEGORY_MISSED_CALL = "missed_call";
    public static final String CATEGORY_NAVIGATION = "navigation";
    public static final String CATEGORY_PROGRESS = "progress";
    public static final String CATEGORY_PROMO = "promo";
    public static final String CATEGORY_RECOMMENDATION = "recommendation";
    public static final String CATEGORY_REMINDER = "reminder";
    public static final String CATEGORY_SERVICE = "service";
    public static final String CATEGORY_SOCIAL = "social";
    public static final String CATEGORY_STATUS = "status";
    public static final String CATEGORY_STOPWATCH = "stopwatch";
    public static final String CATEGORY_SYSTEM = "sys";
    public static final String CATEGORY_TRANSPORT = "transport";
    public static final String CATEGORY_WORKOUT = "workout";
    public static final int COLOR_DEFAULT = 0;
    public static final int DEFAULT_ALL = -1;
    public static final int DEFAULT_LIGHTS = 4;
    public static final int DEFAULT_SOUND = 1;
    public static final int DEFAULT_VIBRATE = 2;
    public static final String EXTRA_ANSWER_COLOR = "android.answerColor";
    public static final String EXTRA_ANSWER_INTENT = "android.answerIntent";
    public static final String EXTRA_AUDIO_CONTENTS_URI = "android.audioContents";
    public static final String EXTRA_BACKGROUND_IMAGE_URI = "android.backgroundImageUri";
    public static final String EXTRA_BIG_TEXT = "android.bigText";
    public static final String EXTRA_CALL_IS_VIDEO = "android.callIsVideo";
    public static final String EXTRA_CALL_PERSON = "android.callPerson";
    public static final String EXTRA_CALL_PERSON_COMPAT = "android.callPersonCompat";
    public static final String EXTRA_CALL_TYPE = "android.callType";
    public static final String EXTRA_CHANNEL_GROUP_ID = "android.intent.extra.CHANNEL_GROUP_ID";
    public static final String EXTRA_CHANNEL_ID = "android.intent.extra.CHANNEL_ID";
    public static final String EXTRA_CHRONOMETER_COUNT_DOWN = "android.chronometerCountDown";
    public static final String EXTRA_COLORIZED = "android.colorized";
    public static final String EXTRA_COMPACT_ACTIONS = "android.compactActions";
    public static final String EXTRA_COMPAT_TEMPLATE = "androidx.core.app.extra.COMPAT_TEMPLATE";
    public static final String EXTRA_CONVERSATION_TITLE = "android.conversationTitle";
    public static final String EXTRA_DECLINE_COLOR = "android.declineColor";
    public static final String EXTRA_DECLINE_INTENT = "android.declineIntent";
    public static final String EXTRA_HANG_UP_INTENT = "android.hangUpIntent";
    public static final String EXTRA_HIDDEN_CONVERSATION_TITLE = "android.hiddenConversationTitle";
    public static final String EXTRA_HISTORIC_MESSAGES = "android.messages.historic";
    public static final String EXTRA_INFO_TEXT = "android.infoText";
    public static final String EXTRA_IS_GROUP_CONVERSATION = "android.isGroupConversation";
    public static final String EXTRA_LARGE_ICON = "android.largeIcon";
    public static final String EXTRA_LARGE_ICON_BIG = "android.largeIcon.big";
    public static final String EXTRA_MEDIA_SESSION = "android.mediaSession";
    public static final String EXTRA_MESSAGES = "android.messages";
    public static final String EXTRA_MESSAGING_STYLE_USER = "android.messagingStyleUser";
    public static final String EXTRA_NOTIFICATION_ID = "android.intent.extra.NOTIFICATION_ID";
    public static final String EXTRA_NOTIFICATION_TAG = "android.intent.extra.NOTIFICATION_TAG";
    @Deprecated
    public static final String EXTRA_PEOPLE = "android.people";
    public static final String EXTRA_PEOPLE_LIST = "android.people.list";
    public static final String EXTRA_PICTURE = "android.picture";
    public static final String EXTRA_PICTURE_CONTENT_DESCRIPTION = "android.pictureContentDescription";
    public static final String EXTRA_PICTURE_ICON = "android.pictureIcon";
    public static final String EXTRA_PROGRESS = "android.progress";
    public static final String EXTRA_PROGRESS_INDETERMINATE = "android.progressIndeterminate";
    public static final String EXTRA_PROGRESS_MAX = "android.progressMax";
    public static final String EXTRA_REMOTE_INPUT_HISTORY = "android.remoteInputHistory";
    public static final String EXTRA_SELF_DISPLAY_NAME = "android.selfDisplayName";
    public static final String EXTRA_SHOW_BIG_PICTURE_WHEN_COLLAPSED = "android.showBigPictureWhenCollapsed";
    public static final String EXTRA_SHOW_CHRONOMETER = "android.showChronometer";
    public static final String EXTRA_SHOW_WHEN = "android.showWhen";
    public static final String EXTRA_SMALL_ICON = "android.icon";
    public static final String EXTRA_SUB_TEXT = "android.subText";
    public static final String EXTRA_SUMMARY_TEXT = "android.summaryText";
    public static final String EXTRA_TEMPLATE = "android.template";
    public static final String EXTRA_TEXT = "android.text";
    public static final String EXTRA_TEXT_LINES = "android.textLines";
    public static final String EXTRA_TITLE = "android.title";
    public static final String EXTRA_TITLE_BIG = "android.title.big";
    public static final String EXTRA_VERIFICATION_ICON = "android.verificationIcon";
    public static final String EXTRA_VERIFICATION_ICON_COMPAT = "android.verificationIconCompat";
    public static final String EXTRA_VERIFICATION_TEXT = "android.verificationText";
    public static final int FLAG_AUTO_CANCEL = 16;
    public static final int FLAG_BUBBLE = 4096;
    public static final int FLAG_FOREGROUND_SERVICE = 64;
    public static final int FLAG_GROUP_SUMMARY = 512;
    @Deprecated
    public static final int FLAG_HIGH_PRIORITY = 128;
    public static final int FLAG_INSISTENT = 4;
    public static final int FLAG_LOCAL_ONLY = 256;
    public static final int FLAG_NO_CLEAR = 32;
    public static final int FLAG_ONGOING_EVENT = 2;
    public static final int FLAG_ONLY_ALERT_ONCE = 8;
    public static final int FLAG_SHOW_LIGHTS = 1;
    public static final int FOREGROUND_SERVICE_DEFAULT = 0;
    public static final int FOREGROUND_SERVICE_DEFERRED = 2;
    public static final int FOREGROUND_SERVICE_IMMEDIATE = 1;
    public static final int GROUP_ALERT_ALL = 0;
    public static final int GROUP_ALERT_CHILDREN = 2;
    public static final int GROUP_ALERT_SUMMARY = 1;
    public static final String GROUP_KEY_SILENT = "silent";
    public static final String INTENT_CATEGORY_NOTIFICATION_PREFERENCES = "android.intent.category.NOTIFICATION_PREFERENCES";
    public static final int MAX_ACTION_BUTTONS = 3;
    public static final int PRIORITY_DEFAULT = 0;
    public static final int PRIORITY_HIGH = 1;
    public static final int PRIORITY_LOW = -1;
    public static final int PRIORITY_MAX = 2;
    public static final int PRIORITY_MIN = -2;
    public static final int STREAM_DEFAULT = -1;
    private static final String TAG = "NotifCompat";
    public static final int VISIBILITY_PRIVATE = 0;
    public static final int VISIBILITY_PUBLIC = 1;
    public static final int VISIBILITY_SECRET = -1;

    @Retention(RetentionPolicy.SOURCE)
    public @interface BadgeIconType {
    }

    public interface Extender {
        Builder extend(Builder builder);
    }

    @Retention(RetentionPolicy.SOURCE)
    public @interface GroupAlertBehavior {
    }

    @Retention(RetentionPolicy.SOURCE)
    public @interface NotificationVisibility {
    }

    @Retention(RetentionPolicy.SOURCE)
    public @interface ServiceNotificationBehavior {
    }

    @Retention(RetentionPolicy.SOURCE)
    public @interface StreamType {
    }

    public static class Builder {
        private static final int MAX_CHARSEQUENCE_LENGTH = 5120;
        public ArrayList<Action> mActions;
        boolean mAllowSystemGeneratedContextualActions;
        int mBadgeIcon;
        RemoteViews mBigContentView;
        BubbleMetadata mBubbleMetadata;
        String mCategory;
        String mChannelId;
        boolean mChronometerCountDown;
        int mColor;
        boolean mColorized;
        boolean mColorizedSet;
        CharSequence mContentInfo;
        PendingIntent mContentIntent;
        CharSequence mContentText;
        CharSequence mContentTitle;
        RemoteViews mContentView;
        public Context mContext;
        Bundle mExtras;
        int mFgsDeferBehavior;
        PendingIntent mFullScreenIntent;
        int mGroupAlertBehavior;
        String mGroupKey;
        boolean mGroupSummary;
        RemoteViews mHeadsUpContentView;
        ArrayList<Action> mInvisibleActions;
        IconCompat mLargeIcon;
        boolean mLocalOnly;
        LocusIdCompat mLocusId;
        Notification mNotification;
        int mNumber;
        @Deprecated
        public ArrayList<String> mPeople;
        public ArrayList<Person> mPersonList;
        int mPriority;
        int mProgress;
        boolean mProgressIndeterminate;
        int mProgressMax;
        Notification mPublicVersion;
        CharSequence[] mRemoteInputHistory;
        CharSequence mSettingsText;
        String mShortcutId;
        boolean mShowWhen;
        boolean mSilent;
        Object mSmallIcon;
        String mSortKey;
        Style mStyle;
        CharSequence mSubText;
        RemoteViews mTickerView;
        long mTimeout;
        boolean mUseChronometer;
        int mVisibility;

        public Builder(Context context, Notification notification) {
            this(context, NotificationCompat.getChannelId(notification));
            ArrayList<Person> peopleList;
            Bundle extras = notification.extras;
            Style style = Style.extractStyleFromNotification(notification);
            setContentTitle(NotificationCompat.getContentTitle(notification)).setContentText(NotificationCompat.getContentText(notification)).setContentInfo(NotificationCompat.getContentInfo(notification)).setSubText(NotificationCompat.getSubText(notification)).setSettingsText(NotificationCompat.getSettingsText(notification)).setStyle(style).setGroup(NotificationCompat.getGroup(notification)).setGroupSummary(NotificationCompat.isGroupSummary(notification)).setLocusId(NotificationCompat.getLocusId(notification)).setWhen(notification.when).setShowWhen(NotificationCompat.getShowWhen(notification)).setUsesChronometer(NotificationCompat.getUsesChronometer(notification)).setAutoCancel(NotificationCompat.getAutoCancel(notification)).setOnlyAlertOnce(NotificationCompat.getOnlyAlertOnce(notification)).setOngoing(NotificationCompat.getOngoing(notification)).setLocalOnly(NotificationCompat.getLocalOnly(notification)).setLargeIcon(notification.largeIcon).setBadgeIconType(NotificationCompat.getBadgeIconType(notification)).setCategory(NotificationCompat.getCategory(notification)).setBubbleMetadata(NotificationCompat.getBubbleMetadata(notification)).setNumber(notification.number).setTicker(notification.tickerText).setContentIntent(notification.contentIntent).setDeleteIntent(notification.deleteIntent).setFullScreenIntent(notification.fullScreenIntent, NotificationCompat.getHighPriority(notification)).setSound(notification.sound, notification.audioStreamType).setVibrate(notification.vibrate).setLights(notification.ledARGB, notification.ledOnMS, notification.ledOffMS).setDefaults(notification.defaults).setPriority(notification.priority).setColor(NotificationCompat.getColor(notification)).setVisibility(NotificationCompat.getVisibility(notification)).setPublicVersion(NotificationCompat.getPublicVersion(notification)).setSortKey(NotificationCompat.getSortKey(notification)).setTimeoutAfter(NotificationCompat.getTimeoutAfter(notification)).setShortcutId(NotificationCompat.getShortcutId(notification)).setProgress(extras.getInt(NotificationCompat.EXTRA_PROGRESS_MAX), extras.getInt(NotificationCompat.EXTRA_PROGRESS), extras.getBoolean(NotificationCompat.EXTRA_PROGRESS_INDETERMINATE)).setAllowSystemGeneratedContextualActions(NotificationCompat.getAllowSystemGeneratedContextualActions(notification)).setSmallIcon(notification.icon, notification.iconLevel).addExtras(getExtrasWithoutDuplicateData(notification, style));
            this.mSmallIcon = Api23Impl.getSmallIcon(notification);
            Icon largeIcon = Api23Impl.getLargeIcon(notification);
            if (largeIcon != null) {
                this.mLargeIcon = IconCompat.createFromIcon(largeIcon);
            }
            if (!(notification.actions == null || notification.actions.length == 0)) {
                for (Notification.Action action : notification.actions) {
                    addAction(Action.Builder.fromAndroidAction(action).build());
                }
            }
            List<Action> invisibleActions = NotificationCompat.getInvisibleActions(notification);
            if (!invisibleActions.isEmpty()) {
                for (Action invisibleAction : invisibleActions) {
                    addInvisibleAction(invisibleAction);
                }
            }
            String[] people = notification.extras.getStringArray(NotificationCompat.EXTRA_PEOPLE);
            if (!(people == null || people.length == 0)) {
                for (String person : people) {
                    addPerson(person);
                }
            }
            if (Build.VERSION.SDK_INT >= 28 && (peopleList = notification.extras.getParcelableArrayList(NotificationCompat.EXTRA_PEOPLE_LIST)) != null && !peopleList.isEmpty()) {
                Iterator<Person> it = peopleList.iterator();
                while (it.hasNext()) {
                    addPerson(Person.fromAndroidPerson(it.next()));
                }
            }
            if (extras.containsKey(NotificationCompat.EXTRA_CHRONOMETER_COUNT_DOWN)) {
                setChronometerCountDown(extras.getBoolean(NotificationCompat.EXTRA_CHRONOMETER_COUNT_DOWN));
            }
            if (Build.VERSION.SDK_INT >= 26 && extras.containsKey(NotificationCompat.EXTRA_COLORIZED)) {
                setColorized(extras.getBoolean(NotificationCompat.EXTRA_COLORIZED));
            }
        }

        private static Bundle getExtrasWithoutDuplicateData(Notification notification, Style style) {
            if (notification.extras == null) {
                return null;
            }
            Bundle newExtras = new Bundle(notification.extras);
            newExtras.remove(NotificationCompat.EXTRA_TITLE);
            newExtras.remove(NotificationCompat.EXTRA_TEXT);
            newExtras.remove(NotificationCompat.EXTRA_INFO_TEXT);
            newExtras.remove(NotificationCompat.EXTRA_SUB_TEXT);
            newExtras.remove(NotificationCompat.EXTRA_CHANNEL_ID);
            newExtras.remove(NotificationCompat.EXTRA_CHANNEL_GROUP_ID);
            newExtras.remove(NotificationCompat.EXTRA_SHOW_WHEN);
            newExtras.remove(NotificationCompat.EXTRA_PROGRESS);
            newExtras.remove(NotificationCompat.EXTRA_PROGRESS_MAX);
            newExtras.remove(NotificationCompat.EXTRA_PROGRESS_INDETERMINATE);
            newExtras.remove(NotificationCompat.EXTRA_CHRONOMETER_COUNT_DOWN);
            newExtras.remove(NotificationCompat.EXTRA_COLORIZED);
            newExtras.remove(NotificationCompat.EXTRA_PEOPLE_LIST);
            newExtras.remove(NotificationCompat.EXTRA_PEOPLE);
            newExtras.remove(NotificationCompatExtras.EXTRA_SORT_KEY);
            newExtras.remove(NotificationCompatExtras.EXTRA_GROUP_KEY);
            newExtras.remove(NotificationCompatExtras.EXTRA_GROUP_SUMMARY);
            newExtras.remove(NotificationCompatExtras.EXTRA_LOCAL_ONLY);
            newExtras.remove(NotificationCompatExtras.EXTRA_ACTION_EXTRAS);
            Bundle carExtenderExtras = newExtras.getBundle("android.car.EXTENSIONS");
            if (carExtenderExtras != null) {
                Bundle carExtenderExtras2 = new Bundle(carExtenderExtras);
                carExtenderExtras2.remove("invisible_actions");
                newExtras.putBundle("android.car.EXTENSIONS", carExtenderExtras2);
            }
            if (style != null) {
                style.clearCompatExtraKeys(newExtras);
            }
            return newExtras;
        }

        public Builder(Context context, String channelId) {
            this.mActions = new ArrayList<>();
            this.mPersonList = new ArrayList<>();
            this.mInvisibleActions = new ArrayList<>();
            this.mShowWhen = true;
            this.mLocalOnly = false;
            this.mColor = 0;
            this.mVisibility = 0;
            this.mBadgeIcon = 0;
            this.mGroupAlertBehavior = 0;
            this.mFgsDeferBehavior = 0;
            this.mNotification = new Notification();
            this.mContext = context;
            this.mChannelId = channelId;
            this.mNotification.when = System.currentTimeMillis();
            this.mNotification.audioStreamType = -1;
            this.mPriority = 0;
            this.mPeople = new ArrayList<>();
            this.mAllowSystemGeneratedContextualActions = true;
        }

        /* JADX INFO: this call moved to the top of the method (can break code semantics) */
        @Deprecated
        public Builder(Context context) {
            this(context, (String) null);
            String str = null;
        }

        public Builder setWhen(long when) {
            this.mNotification.when = when;
            return this;
        }

        public Builder setShowWhen(boolean show) {
            this.mShowWhen = show;
            return this;
        }

        public Builder setSmallIcon(IconCompat icon) {
            this.mSmallIcon = icon.toIcon(this.mContext);
            return this;
        }

        public Builder setUsesChronometer(boolean b) {
            this.mUseChronometer = b;
            return this;
        }

        public Builder setChronometerCountDown(boolean countsDown) {
            this.mChronometerCountDown = countsDown;
            getExtras().putBoolean(NotificationCompat.EXTRA_CHRONOMETER_COUNT_DOWN, countsDown);
            return this;
        }

        public Builder setSmallIcon(int icon) {
            this.mNotification.icon = icon;
            return this;
        }

        public Builder setSmallIcon(int icon, int level) {
            this.mNotification.icon = icon;
            this.mNotification.iconLevel = level;
            return this;
        }

        @Deprecated
        public Builder setNotificationSilent() {
            this.mSilent = true;
            return this;
        }

        public Builder setSilent(boolean silent) {
            this.mSilent = silent;
            return this;
        }

        public Builder setContentTitle(CharSequence title) {
            this.mContentTitle = limitCharSequenceLength(title);
            return this;
        }

        public Builder setContentText(CharSequence text) {
            this.mContentText = limitCharSequenceLength(text);
            return this;
        }

        public Builder setSubText(CharSequence text) {
            this.mSubText = limitCharSequenceLength(text);
            return this;
        }

        public Builder setSettingsText(CharSequence text) {
            this.mSettingsText = limitCharSequenceLength(text);
            return this;
        }

        public Builder setRemoteInputHistory(CharSequence[] text) {
            this.mRemoteInputHistory = text;
            return this;
        }

        public Builder setNumber(int number) {
            this.mNumber = number;
            return this;
        }

        public Builder setContentInfo(CharSequence info) {
            this.mContentInfo = limitCharSequenceLength(info);
            return this;
        }

        public Builder setProgress(int max, int progress, boolean indeterminate) {
            this.mProgressMax = max;
            this.mProgress = progress;
            this.mProgressIndeterminate = indeterminate;
            return this;
        }

        public Builder setContent(RemoteViews views) {
            this.mNotification.contentView = views;
            return this;
        }

        public Builder setContentIntent(PendingIntent intent) {
            this.mContentIntent = intent;
            return this;
        }

        public Builder setDeleteIntent(PendingIntent intent) {
            this.mNotification.deleteIntent = intent;
            return this;
        }

        public Builder setFullScreenIntent(PendingIntent intent, boolean highPriority) {
            this.mFullScreenIntent = intent;
            setFlag(128, highPriority);
            return this;
        }

        public Builder setTicker(CharSequence tickerText) {
            this.mNotification.tickerText = limitCharSequenceLength(tickerText);
            return this;
        }

        @Deprecated
        public Builder setTicker(CharSequence tickerText, RemoteViews views) {
            this.mNotification.tickerText = limitCharSequenceLength(tickerText);
            this.mTickerView = views;
            return this;
        }

        public Builder setLargeIcon(Bitmap icon) {
            this.mLargeIcon = icon == null ? null : IconCompat.createWithBitmap(NotificationCompat.reduceLargeIconSize(this.mContext, icon));
            return this;
        }

        public Builder setLargeIcon(Icon icon) {
            this.mLargeIcon = icon == null ? null : IconCompat.createFromIcon(icon);
            return this;
        }

        public Builder setSound(Uri sound) {
            this.mNotification.sound = sound;
            this.mNotification.audioStreamType = -1;
            AudioAttributes.Builder builder = Api21Impl.setUsage(Api21Impl.setContentType(Api21Impl.createBuilder(), 4), 5);
            this.mNotification.audioAttributes = Api21Impl.build(builder);
            return this;
        }

        public Builder setSound(Uri sound, int streamType) {
            this.mNotification.sound = sound;
            this.mNotification.audioStreamType = streamType;
            AudioAttributes.Builder builder = Api21Impl.setLegacyStreamType(Api21Impl.setContentType(Api21Impl.createBuilder(), 4), streamType);
            this.mNotification.audioAttributes = Api21Impl.build(builder);
            return this;
        }

        public Builder setVibrate(long[] pattern) {
            this.mNotification.vibrate = pattern;
            return this;
        }

        public Builder setLights(int argb, int onMs, int offMs) {
            this.mNotification.ledARGB = argb;
            this.mNotification.ledOnMS = onMs;
            this.mNotification.ledOffMS = offMs;
            int i = 1;
            boolean showLights = (this.mNotification.ledOnMS == 0 || this.mNotification.ledOffMS == 0) ? false : true;
            Notification notification = this.mNotification;
            int i2 = this.mNotification.flags & -2;
            if (!showLights) {
                i = 0;
            }
            notification.flags = i | i2;
            return this;
        }

        public Builder setOngoing(boolean ongoing) {
            setFlag(2, ongoing);
            return this;
        }

        public Builder setColorized(boolean colorize) {
            this.mColorized = colorize;
            this.mColorizedSet = true;
            return this;
        }

        public Builder setOnlyAlertOnce(boolean onlyAlertOnce) {
            setFlag(8, onlyAlertOnce);
            return this;
        }

        public Builder setAutoCancel(boolean autoCancel) {
            setFlag(16, autoCancel);
            return this;
        }

        public Builder setLocalOnly(boolean b) {
            this.mLocalOnly = b;
            return this;
        }

        public Builder setCategory(String category) {
            this.mCategory = category;
            return this;
        }

        public Builder setDefaults(int defaults) {
            this.mNotification.defaults = defaults;
            if ((defaults & 4) != 0) {
                this.mNotification.flags |= 1;
            }
            return this;
        }

        private void setFlag(int mask, boolean value) {
            if (value) {
                this.mNotification.flags |= mask;
                return;
            }
            this.mNotification.flags &= ~mask;
        }

        public Builder setPriority(int pri) {
            this.mPriority = pri;
            return this;
        }

        @Deprecated
        public Builder addPerson(String uri) {
            if (uri != null && !uri.isEmpty()) {
                this.mPeople.add(uri);
            }
            return this;
        }

        public Builder addPerson(Person person) {
            if (person != null) {
                this.mPersonList.add(person);
            }
            return this;
        }

        public Builder clearPeople() {
            this.mPersonList.clear();
            this.mPeople.clear();
            return this;
        }

        public Builder setGroup(String groupKey) {
            this.mGroupKey = groupKey;
            return this;
        }

        public Builder setGroupSummary(boolean isGroupSummary) {
            this.mGroupSummary = isGroupSummary;
            return this;
        }

        public Builder setSortKey(String sortKey) {
            this.mSortKey = sortKey;
            return this;
        }

        public Builder addExtras(Bundle extras) {
            if (extras != null) {
                if (this.mExtras == null) {
                    this.mExtras = new Bundle(extras);
                } else {
                    this.mExtras.putAll(extras);
                }
            }
            return this;
        }

        public Builder setExtras(Bundle extras) {
            this.mExtras = extras;
            return this;
        }

        public Bundle getExtras() {
            if (this.mExtras == null) {
                this.mExtras = new Bundle();
            }
            return this.mExtras;
        }

        public Builder addAction(int icon, CharSequence title, PendingIntent intent) {
            this.mActions.add(new Action(icon, title, intent));
            return this;
        }

        public Builder addAction(Action action) {
            if (action != null) {
                this.mActions.add(action);
            }
            return this;
        }

        public Builder clearActions() {
            this.mActions.clear();
            return this;
        }

        public Builder addInvisibleAction(int icon, CharSequence title, PendingIntent intent) {
            this.mInvisibleActions.add(new Action(icon, title, intent));
            return this;
        }

        public Builder addInvisibleAction(Action action) {
            if (action != null) {
                this.mInvisibleActions.add(action);
            }
            return this;
        }

        public Builder clearInvisibleActions() {
            this.mInvisibleActions.clear();
            Bundle carExtenderBundle = this.mExtras.getBundle("android.car.EXTENSIONS");
            if (carExtenderBundle != null) {
                Bundle carExtenderBundle2 = new Bundle(carExtenderBundle);
                carExtenderBundle2.remove("invisible_actions");
                this.mExtras.putBundle("android.car.EXTENSIONS", carExtenderBundle2);
            }
            return this;
        }

        public Builder setStyle(Style style) {
            if (this.mStyle != style) {
                this.mStyle = style;
                if (this.mStyle != null) {
                    this.mStyle.setBuilder(this);
                }
            }
            return this;
        }

        public Builder setColor(int argb) {
            this.mColor = argb;
            return this;
        }

        public Builder setVisibility(int visibility) {
            this.mVisibility = visibility;
            return this;
        }

        public Builder setPublicVersion(Notification n) {
            this.mPublicVersion = n;
            return this;
        }

        private boolean useExistingRemoteView() {
            return this.mStyle == null || !this.mStyle.displayCustomViewInline();
        }

        public RemoteViews createContentView() {
            RemoteViews styleView;
            if (this.mContentView != null && useExistingRemoteView()) {
                return this.mContentView;
            }
            NotificationCompatBuilder compatBuilder = new NotificationCompatBuilder(this);
            if (this.mStyle != null && (styleView = this.mStyle.makeContentView(compatBuilder)) != null) {
                return styleView;
            }
            return Api24Impl.createContentView(Api24Impl.recoverBuilder(this.mContext, compatBuilder.build()));
        }

        public RemoteViews createBigContentView() {
            RemoteViews styleView;
            if (this.mBigContentView != null && useExistingRemoteView()) {
                return this.mBigContentView;
            }
            NotificationCompatBuilder compatBuilder = new NotificationCompatBuilder(this);
            if (this.mStyle != null && (styleView = this.mStyle.makeBigContentView(compatBuilder)) != null) {
                return styleView;
            }
            return Api24Impl.createBigContentView(Api24Impl.recoverBuilder(this.mContext, compatBuilder.build()));
        }

        public RemoteViews createHeadsUpContentView() {
            RemoteViews styleView;
            if (this.mHeadsUpContentView != null && useExistingRemoteView()) {
                return this.mHeadsUpContentView;
            }
            NotificationCompatBuilder compatBuilder = new NotificationCompatBuilder(this);
            if (this.mStyle != null && (styleView = this.mStyle.makeHeadsUpContentView(compatBuilder)) != null) {
                return styleView;
            }
            return Api24Impl.createHeadsUpContentView(Api24Impl.recoverBuilder(this.mContext, compatBuilder.build()));
        }

        public Builder setCustomContentView(RemoteViews contentView) {
            this.mContentView = contentView;
            return this;
        }

        public Builder setCustomBigContentView(RemoteViews contentView) {
            this.mBigContentView = contentView;
            return this;
        }

        public Builder setCustomHeadsUpContentView(RemoteViews contentView) {
            this.mHeadsUpContentView = contentView;
            return this;
        }

        public Builder setChannelId(String channelId) {
            this.mChannelId = channelId;
            return this;
        }

        public Builder setTimeoutAfter(long durationMs) {
            this.mTimeout = durationMs;
            return this;
        }

        public Builder setShortcutId(String shortcutId) {
            this.mShortcutId = shortcutId;
            return this;
        }

        public Builder setShortcutInfo(ShortcutInfoCompat shortcutInfo) {
            if (shortcutInfo == null) {
                return this;
            }
            this.mShortcutId = shortcutInfo.getId();
            if (this.mLocusId == null) {
                if (shortcutInfo.getLocusId() != null) {
                    this.mLocusId = shortcutInfo.getLocusId();
                } else if (shortcutInfo.getId() != null) {
                    this.mLocusId = new LocusIdCompat(shortcutInfo.getId());
                }
            }
            if (this.mContentTitle == null) {
                setContentTitle(shortcutInfo.getShortLabel());
            }
            return this;
        }

        public Builder setLocusId(LocusIdCompat locusId) {
            this.mLocusId = locusId;
            return this;
        }

        public Builder setBadgeIconType(int icon) {
            this.mBadgeIcon = icon;
            return this;
        }

        public Builder setGroupAlertBehavior(int groupAlertBehavior) {
            this.mGroupAlertBehavior = groupAlertBehavior;
            return this;
        }

        public Builder setForegroundServiceBehavior(int behavior) {
            this.mFgsDeferBehavior = behavior;
            return this;
        }

        public Builder setBubbleMetadata(BubbleMetadata data) {
            this.mBubbleMetadata = data;
            return this;
        }

        public Builder extend(Extender extender) {
            extender.extend(this);
            return this;
        }

        public Builder setAllowSystemGeneratedContextualActions(boolean allowed) {
            this.mAllowSystemGeneratedContextualActions = allowed;
            return this;
        }

        @Deprecated
        public Notification getNotification() {
            return build();
        }

        public Notification build() {
            return new NotificationCompatBuilder(this).build();
        }

        protected static CharSequence limitCharSequenceLength(CharSequence cs) {
            if (cs != null && cs.length() > MAX_CHARSEQUENCE_LENGTH) {
                return cs.subSequence(0, MAX_CHARSEQUENCE_LENGTH);
            }
            return cs;
        }

        public RemoteViews getContentView() {
            return this.mContentView;
        }

        public RemoteViews getBigContentView() {
            return this.mBigContentView;
        }

        public RemoteViews getHeadsUpContentView() {
            return this.mHeadsUpContentView;
        }

        public long getWhenIfShowing() {
            if (this.mShowWhen) {
                return this.mNotification.when;
            }
            return 0;
        }

        public int getPriority() {
            return this.mPriority;
        }

        public int getForegroundServiceBehavior() {
            return this.mFgsDeferBehavior;
        }

        public int getColor() {
            return this.mColor;
        }

        public BubbleMetadata getBubbleMetadata() {
            return this.mBubbleMetadata;
        }

        static class Api21Impl {
            private Api21Impl() {
            }

            static AudioAttributes.Builder createBuilder() {
                return new AudioAttributes.Builder();
            }

            static AudioAttributes.Builder setContentType(AudioAttributes.Builder builder, int contentType) {
                return builder.setContentType(contentType);
            }

            static AudioAttributes.Builder setUsage(AudioAttributes.Builder builder, int usage) {
                return builder.setUsage(usage);
            }

            static AudioAttributes.Builder setLegacyStreamType(AudioAttributes.Builder builder, int streamType) {
                return builder.setLegacyStreamType(streamType);
            }

            static AudioAttributes build(AudioAttributes.Builder builder) {
                return builder.build();
            }
        }

        static class Api23Impl {
            private Api23Impl() {
            }

            static Icon getSmallIcon(Notification notification) {
                return notification.getSmallIcon();
            }

            static Icon getLargeIcon(Notification notification) {
                return notification.getLargeIcon();
            }
        }

        static class Api24Impl {
            private Api24Impl() {
            }

            static Notification.Builder recoverBuilder(Context context, Notification n) {
                return Notification.Builder.recoverBuilder(context, n);
            }

            static RemoteViews createContentView(Notification.Builder builder) {
                return builder.createContentView();
            }

            static RemoteViews createHeadsUpContentView(Notification.Builder builder) {
                return builder.createHeadsUpContentView();
            }

            static RemoteViews createBigContentView(Notification.Builder builder) {
                return builder.createHeadsUpContentView();
            }
        }
    }

    public static abstract class Style {
        CharSequence mBigContentTitle;
        protected Builder mBuilder;
        CharSequence mSummaryText;
        boolean mSummaryTextSet = false;

        public void setBuilder(Builder builder) {
            if (this.mBuilder != builder) {
                this.mBuilder = builder;
                if (this.mBuilder != null) {
                    this.mBuilder.setStyle(this);
                }
            }
        }

        public Notification build() {
            if (this.mBuilder != null) {
                return this.mBuilder.build();
            }
            return null;
        }

        /* access modifiers changed from: protected */
        public String getClassName() {
            return null;
        }

        public void apply(NotificationBuilderWithBuilderAccessor builder) {
        }

        public boolean displayCustomViewInline() {
            return false;
        }

        public RemoteViews makeContentView(NotificationBuilderWithBuilderAccessor builder) {
            return null;
        }

        public RemoteViews makeBigContentView(NotificationBuilderWithBuilderAccessor builder) {
            return null;
        }

        public RemoteViews makeHeadsUpContentView(NotificationBuilderWithBuilderAccessor builder) {
            return null;
        }

        public void addCompatExtras(Bundle extras) {
            if (this.mSummaryTextSet) {
                extras.putCharSequence(NotificationCompat.EXTRA_SUMMARY_TEXT, this.mSummaryText);
            }
            if (this.mBigContentTitle != null) {
                extras.putCharSequence(NotificationCompat.EXTRA_TITLE_BIG, this.mBigContentTitle);
            }
            String className = getClassName();
            if (className != null) {
                extras.putString(NotificationCompat.EXTRA_COMPAT_TEMPLATE, className);
            }
        }

        /* access modifiers changed from: protected */
        public void restoreFromCompatExtras(Bundle extras) {
            if (extras.containsKey(NotificationCompat.EXTRA_SUMMARY_TEXT)) {
                this.mSummaryText = extras.getCharSequence(NotificationCompat.EXTRA_SUMMARY_TEXT);
                this.mSummaryTextSet = true;
            }
            this.mBigContentTitle = extras.getCharSequence(NotificationCompat.EXTRA_TITLE_BIG);
        }

        /* access modifiers changed from: protected */
        public void clearCompatExtraKeys(Bundle extras) {
            extras.remove(NotificationCompat.EXTRA_SUMMARY_TEXT);
            extras.remove(NotificationCompat.EXTRA_TITLE_BIG);
            extras.remove(NotificationCompat.EXTRA_COMPAT_TEMPLATE);
        }

        public static Style extractStyleFromNotification(Notification notification) {
            Bundle extras = NotificationCompat.getExtras(notification);
            if (extras == null) {
                return null;
            }
            return constructStyleForExtras(extras);
        }

        private static Style constructCompatStyleByPlatformName(String platformTemplateClass) {
            if (platformTemplateClass == null) {
                return null;
            }
            if (platformTemplateClass.equals(Notification.BigPictureStyle.class.getName())) {
                return new BigPictureStyle();
            }
            if (platformTemplateClass.equals(Notification.BigTextStyle.class.getName())) {
                return new BigTextStyle();
            }
            if (platformTemplateClass.equals(Notification.InboxStyle.class.getName())) {
                return new InboxStyle();
            }
            if (platformTemplateClass.equals(Notification.MessagingStyle.class.getName())) {
                return new MessagingStyle();
            }
            if (platformTemplateClass.equals(Notification.DecoratedCustomViewStyle.class.getName())) {
                return new DecoratedCustomViewStyle();
            }
            return null;
        }

        /* JADX WARNING: Can't fix incorrect switch cases order */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        static androidx.core.app.NotificationCompat.Style constructCompatStyleByName(java.lang.String r1) {
            /*
                if (r1 == 0) goto L_0x006f
                int r0 = r1.hashCode()
                switch(r0) {
                    case -716705180: goto L_0x003c;
                    case -171946061: goto L_0x0032;
                    case 714386739: goto L_0x0028;
                    case 912942987: goto L_0x001e;
                    case 919595044: goto L_0x0014;
                    case 2090799565: goto L_0x000a;
                    default: goto L_0x0009;
                }
            L_0x0009:
                goto L_0x0046
            L_0x000a:
                java.lang.String r0 = "androidx.core.app.NotificationCompat$MessagingStyle"
                boolean r0 = r1.equals(r0)
                if (r0 == 0) goto L_0x0009
                r0 = 4
                goto L_0x0047
            L_0x0014:
                java.lang.String r0 = "androidx.core.app.NotificationCompat$BigTextStyle"
                boolean r0 = r1.equals(r0)
                if (r0 == 0) goto L_0x0009
                r0 = 0
                goto L_0x0047
            L_0x001e:
                java.lang.String r0 = "androidx.core.app.NotificationCompat$InboxStyle"
                boolean r0 = r1.equals(r0)
                if (r0 == 0) goto L_0x0009
                r0 = 2
                goto L_0x0047
            L_0x0028:
                java.lang.String r0 = "androidx.core.app.NotificationCompat$CallStyle"
                boolean r0 = r1.equals(r0)
                if (r0 == 0) goto L_0x0009
                r0 = 5
                goto L_0x0047
            L_0x0032:
                java.lang.String r0 = "androidx.core.app.NotificationCompat$BigPictureStyle"
                boolean r0 = r1.equals(r0)
                if (r0 == 0) goto L_0x0009
                r0 = 1
                goto L_0x0047
            L_0x003c:
                java.lang.String r0 = "androidx.core.app.NotificationCompat$DecoratedCustomViewStyle"
                boolean r0 = r1.equals(r0)
                if (r0 == 0) goto L_0x0009
                r0 = 3
                goto L_0x0047
            L_0x0046:
                r0 = -1
            L_0x0047:
                switch(r0) {
                    case 0: goto L_0x0069;
                    case 1: goto L_0x0063;
                    case 2: goto L_0x005d;
                    case 3: goto L_0x0057;
                    case 4: goto L_0x0051;
                    case 5: goto L_0x004b;
                    default: goto L_0x004a;
                }
            L_0x004a:
                goto L_0x006f
            L_0x004b:
                androidx.core.app.NotificationCompat$CallStyle r0 = new androidx.core.app.NotificationCompat$CallStyle
                r0.<init>()
                return r0
            L_0x0051:
                androidx.core.app.NotificationCompat$MessagingStyle r0 = new androidx.core.app.NotificationCompat$MessagingStyle
                r0.<init>()
                return r0
            L_0x0057:
                androidx.core.app.NotificationCompat$DecoratedCustomViewStyle r0 = new androidx.core.app.NotificationCompat$DecoratedCustomViewStyle
                r0.<init>()
                return r0
            L_0x005d:
                androidx.core.app.NotificationCompat$InboxStyle r0 = new androidx.core.app.NotificationCompat$InboxStyle
                r0.<init>()
                return r0
            L_0x0063:
                androidx.core.app.NotificationCompat$BigPictureStyle r0 = new androidx.core.app.NotificationCompat$BigPictureStyle
                r0.<init>()
                return r0
            L_0x0069:
                androidx.core.app.NotificationCompat$BigTextStyle r0 = new androidx.core.app.NotificationCompat$BigTextStyle
                r0.<init>()
                return r0
            L_0x006f:
                r0 = 0
                return r0
            */
            throw new UnsupportedOperationException("Method not decompiled: androidx.core.app.NotificationCompat.Style.constructCompatStyleByName(java.lang.String):androidx.core.app.NotificationCompat$Style");
        }

        static Style constructCompatStyleForBundle(Bundle extras) {
            Style style = constructCompatStyleByName(extras.getString(NotificationCompat.EXTRA_COMPAT_TEMPLATE));
            if (style != null) {
                return style;
            }
            if (extras.containsKey(NotificationCompat.EXTRA_SELF_DISPLAY_NAME) || extras.containsKey(NotificationCompat.EXTRA_MESSAGING_STYLE_USER)) {
                return new MessagingStyle();
            }
            if (extras.containsKey(NotificationCompat.EXTRA_PICTURE) || extras.containsKey(NotificationCompat.EXTRA_PICTURE_ICON)) {
                return new BigPictureStyle();
            }
            if (extras.containsKey(NotificationCompat.EXTRA_BIG_TEXT)) {
                return new BigTextStyle();
            }
            if (extras.containsKey(NotificationCompat.EXTRA_TEXT_LINES)) {
                return new InboxStyle();
            }
            if (extras.containsKey(NotificationCompat.EXTRA_CALL_TYPE)) {
                return new CallStyle();
            }
            return constructCompatStyleByPlatformName(extras.getString(NotificationCompat.EXTRA_TEMPLATE));
        }

        static Style constructStyleForExtras(Bundle extras) {
            Style style = constructCompatStyleForBundle(extras);
            if (style == null) {
                return null;
            }
            try {
                style.restoreFromCompatExtras(extras);
                return style;
            } catch (ClassCastException e) {
                return null;
            }
        }

        /* JADX WARNING: Removed duplicated region for block: B:41:0x0163  */
        /* JADX WARNING: Removed duplicated region for block: B:46:0x0187  */
        /* JADX WARNING: Removed duplicated region for block: B:55:0x01db  */
        /* JADX WARNING: Removed duplicated region for block: B:56:0x01dd  */
        /* JADX WARNING: Removed duplicated region for block: B:59:0x01e6  */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public android.widget.RemoteViews applyStandardTemplate(boolean r20, int r21, boolean r22) {
            /*
                r19 = this;
                r0 = r19
                androidx.core.app.NotificationCompat$Builder r1 = r0.mBuilder
                android.content.Context r1 = r1.mContext
                android.content.res.Resources r1 = r1.getResources()
                android.widget.RemoteViews r2 = new android.widget.RemoteViews
                androidx.core.app.NotificationCompat$Builder r3 = r0.mBuilder
                android.content.Context r3 = r3.mContext
                java.lang.String r3 = r3.getPackageName()
                r4 = r21
                r2.<init>(r3, r4)
                r3 = 0
                r5 = 0
                androidx.core.app.NotificationCompat$Builder r6 = r0.mBuilder
                int r6 = r6.getPriority()
                r7 = -1
                r11 = 1
                r12 = 0
                if (r6 >= r7) goto L_0x0028
                r6 = r11
                goto L_0x0029
            L_0x0028:
                r6 = r12
            L_0x0029:
                r13 = r6
                androidx.core.app.NotificationCompat$Builder r6 = r0.mBuilder
                androidx.core.graphics.drawable.IconCompat r6 = r6.mLargeIcon
                if (r6 == 0) goto L_0x007a
                int r6 = androidx.core.R.id.icon
                r2.setViewVisibility(r6, r12)
                int r6 = androidx.core.R.id.icon
                androidx.core.app.NotificationCompat$Builder r7 = r0.mBuilder
                androidx.core.graphics.drawable.IconCompat r7 = r7.mLargeIcon
                android.graphics.Bitmap r7 = r0.createColoredBitmap((androidx.core.graphics.drawable.IconCompat) r7, (int) r12)
                r2.setImageViewBitmap(r6, r7)
                if (r20 == 0) goto L_0x00b3
                androidx.core.app.NotificationCompat$Builder r6 = r0.mBuilder
                android.app.Notification r6 = r6.mNotification
                int r6 = r6.icon
                if (r6 == 0) goto L_0x00b3
                int r6 = androidx.core.R.dimen.notification_right_icon_size
                int r6 = r1.getDimensionPixelSize(r6)
                int r7 = androidx.core.R.dimen.notification_small_icon_background_padding
                int r7 = r1.getDimensionPixelSize(r7)
                int r7 = r7 * 2
                int r7 = r6 - r7
                androidx.core.app.NotificationCompat$Builder r8 = r0.mBuilder
                android.app.Notification r8 = r8.mNotification
                int r8 = r8.icon
                androidx.core.app.NotificationCompat$Builder r9 = r0.mBuilder
                int r9 = r9.getColor()
                android.graphics.Bitmap r8 = r0.createIconWithBackground(r8, r6, r7, r9)
                int r9 = androidx.core.R.id.right_icon
                r2.setImageViewBitmap(r9, r8)
                int r8 = androidx.core.R.id.right_icon
                r2.setViewVisibility(r8, r12)
                goto L_0x00b3
            L_0x007a:
                if (r20 == 0) goto L_0x00b3
                androidx.core.app.NotificationCompat$Builder r6 = r0.mBuilder
                android.app.Notification r6 = r6.mNotification
                int r6 = r6.icon
                if (r6 == 0) goto L_0x00b3
                int r6 = androidx.core.R.id.icon
                r2.setViewVisibility(r6, r12)
                int r6 = androidx.core.R.dimen.notification_large_icon_width
                int r6 = r1.getDimensionPixelSize(r6)
                int r7 = androidx.core.R.dimen.notification_big_circle_margin
                int r7 = r1.getDimensionPixelSize(r7)
                int r6 = r6 - r7
                int r7 = androidx.core.R.dimen.notification_small_icon_size_as_large
                int r7 = r1.getDimensionPixelSize(r7)
                androidx.core.app.NotificationCompat$Builder r8 = r0.mBuilder
                android.app.Notification r8 = r8.mNotification
                int r8 = r8.icon
                androidx.core.app.NotificationCompat$Builder r9 = r0.mBuilder
                int r9 = r9.getColor()
                android.graphics.Bitmap r8 = r0.createIconWithBackground(r8, r6, r7, r9)
                int r9 = androidx.core.R.id.icon
                r2.setImageViewBitmap(r9, r8)
            L_0x00b3:
                androidx.core.app.NotificationCompat$Builder r6 = r0.mBuilder
                java.lang.CharSequence r6 = r6.mContentTitle
                if (r6 == 0) goto L_0x00c2
                int r6 = androidx.core.R.id.title
                androidx.core.app.NotificationCompat$Builder r7 = r0.mBuilder
                java.lang.CharSequence r7 = r7.mContentTitle
                r2.setTextViewText(r6, r7)
            L_0x00c2:
                androidx.core.app.NotificationCompat$Builder r6 = r0.mBuilder
                java.lang.CharSequence r6 = r6.mContentText
                if (r6 == 0) goto L_0x00d2
                int r6 = androidx.core.R.id.text
                androidx.core.app.NotificationCompat$Builder r7 = r0.mBuilder
                java.lang.CharSequence r7 = r7.mContentText
                r2.setTextViewText(r6, r7)
                r3 = 1
            L_0x00d2:
                r6 = r12
                androidx.core.app.NotificationCompat$Builder r7 = r0.mBuilder
                java.lang.CharSequence r7 = r7.mContentInfo
                if (r7 == 0) goto L_0x00eb
                int r7 = androidx.core.R.id.info
                androidx.core.app.NotificationCompat$Builder r8 = r0.mBuilder
                java.lang.CharSequence r8 = r8.mContentInfo
                r2.setTextViewText(r7, r8)
                int r7 = androidx.core.R.id.info
                r2.setViewVisibility(r7, r12)
                r3 = 1
                r6 = 1
                r14 = r6
                goto L_0x012c
            L_0x00eb:
                androidx.core.app.NotificationCompat$Builder r7 = r0.mBuilder
                int r7 = r7.mNumber
                if (r7 <= 0) goto L_0x0124
                int r7 = androidx.core.R.integer.status_bar_notification_info_maxnum
                int r7 = r1.getInteger(r7)
                androidx.core.app.NotificationCompat$Builder r8 = r0.mBuilder
                int r8 = r8.mNumber
                if (r8 <= r7) goto L_0x0109
                int r8 = androidx.core.R.id.info
                int r9 = androidx.core.R.string.status_bar_notification_info_overflow
                java.lang.String r9 = r1.getString(r9)
                r2.setTextViewText(r8, r9)
                goto L_0x011b
            L_0x0109:
                java.text.NumberFormat r8 = java.text.NumberFormat.getIntegerInstance()
                int r9 = androidx.core.R.id.info
                androidx.core.app.NotificationCompat$Builder r10 = r0.mBuilder
                int r10 = r10.mNumber
                long r14 = (long) r10
                java.lang.String r10 = r8.format(r14)
                r2.setTextViewText(r9, r10)
            L_0x011b:
                int r8 = androidx.core.R.id.info
                r2.setViewVisibility(r8, r12)
                r3 = 1
                r6 = 1
                r14 = r6
                goto L_0x012c
            L_0x0124:
                int r7 = androidx.core.R.id.info
                r8 = 8
                r2.setViewVisibility(r7, r8)
                r14 = r6
            L_0x012c:
                androidx.core.app.NotificationCompat$Builder r6 = r0.mBuilder
                java.lang.CharSequence r6 = r6.mSubText
                if (r6 == 0) goto L_0x015d
                int r6 = androidx.core.R.id.text
                androidx.core.app.NotificationCompat$Builder r7 = r0.mBuilder
                java.lang.CharSequence r7 = r7.mSubText
                r2.setTextViewText(r6, r7)
                androidx.core.app.NotificationCompat$Builder r6 = r0.mBuilder
                java.lang.CharSequence r6 = r6.mContentText
                if (r6 == 0) goto L_0x0155
                int r6 = androidx.core.R.id.text2
                androidx.core.app.NotificationCompat$Builder r7 = r0.mBuilder
                java.lang.CharSequence r7 = r7.mContentText
                r2.setTextViewText(r6, r7)
                int r6 = androidx.core.R.id.text2
                r2.setViewVisibility(r6, r12)
                r5 = 1
                r16 = r5
                r15 = 8
                goto L_0x0161
            L_0x0155:
                int r6 = androidx.core.R.id.text2
                r15 = 8
                r2.setViewVisibility(r6, r15)
                goto L_0x015f
            L_0x015d:
                r15 = 8
            L_0x015f:
                r16 = r5
            L_0x0161:
                if (r16 == 0) goto L_0x017b
                if (r22 == 0) goto L_0x0171
                int r5 = androidx.core.R.dimen.notification_subtext_size
                int r5 = r1.getDimensionPixelSize(r5)
                float r5 = (float) r5
                int r6 = androidx.core.R.id.text
                r2.setTextViewTextSize(r6, r12, r5)
            L_0x0171:
                int r6 = androidx.core.R.id.line1
                r9 = 0
                r10 = 0
                r7 = 0
                r8 = 0
                r5 = r2
                r5.setViewPadding(r6, r7, r8, r9, r10)
            L_0x017b:
                androidx.core.app.NotificationCompat$Builder r5 = r0.mBuilder
                long r5 = r5.getWhenIfShowing()
                r7 = 0
                int r5 = (r5 > r7 ? 1 : (r5 == r7 ? 0 : -1))
                if (r5 == 0) goto L_0x01d7
                androidx.core.app.NotificationCompat$Builder r5 = r0.mBuilder
                boolean r5 = r5.mUseChronometer
                if (r5 == 0) goto L_0x01c3
                int r5 = androidx.core.R.id.chronometer
                r2.setViewVisibility(r5, r12)
                int r5 = androidx.core.R.id.chronometer
                androidx.core.app.NotificationCompat$Builder r6 = r0.mBuilder
                long r6 = r6.getWhenIfShowing()
                long r8 = android.os.SystemClock.elapsedRealtime()
                long r17 = java.lang.System.currentTimeMillis()
                long r8 = r8 - r17
                long r6 = r6 + r8
                java.lang.String r8 = "setBase"
                r2.setLong(r5, r8, r6)
                int r5 = androidx.core.R.id.chronometer
                java.lang.String r6 = "setStarted"
                r2.setBoolean(r5, r6, r11)
                androidx.core.app.NotificationCompat$Builder r5 = r0.mBuilder
                boolean r5 = r5.mChronometerCountDown
                if (r5 == 0) goto L_0x01d6
                int r5 = androidx.core.R.id.chronometer
                androidx.core.app.NotificationCompat$Builder r6 = r0.mBuilder
                boolean r6 = r6.mChronometerCountDown
                androidx.core.app.NotificationCompat.Style.Api24Impl.setChronometerCountDown(r2, r5, r6)
                goto L_0x01d6
            L_0x01c3:
                int r5 = androidx.core.R.id.time
                r2.setViewVisibility(r5, r12)
                int r5 = androidx.core.R.id.time
                androidx.core.app.NotificationCompat$Builder r6 = r0.mBuilder
                long r6 = r6.getWhenIfShowing()
                java.lang.String r8 = "setTime"
                r2.setLong(r5, r8, r6)
            L_0x01d6:
                r14 = 1
            L_0x01d7:
                int r5 = androidx.core.R.id.right_side
                if (r14 == 0) goto L_0x01dd
                r8 = r12
                goto L_0x01de
            L_0x01dd:
                r8 = r15
            L_0x01de:
                r2.setViewVisibility(r5, r8)
                int r5 = androidx.core.R.id.line3
                if (r3 == 0) goto L_0x01e6
                goto L_0x01e7
            L_0x01e6:
                r12 = r15
            L_0x01e7:
                r2.setViewVisibility(r5, r12)
                return r2
            */
            throw new UnsupportedOperationException("Method not decompiled: androidx.core.app.NotificationCompat.Style.applyStandardTemplate(boolean, int, boolean):android.widget.RemoteViews");
        }

        public Bitmap createColoredBitmap(int iconId, int color) {
            return createColoredBitmap(iconId, color, 0);
        }

        /* access modifiers changed from: package-private */
        public Bitmap createColoredBitmap(IconCompat icon, int color) {
            return createColoredBitmap(icon, color, 0);
        }

        private Bitmap createColoredBitmap(int iconId, int color, int size) {
            return createColoredBitmap(IconCompat.createWithResource(this.mBuilder.mContext, iconId), color, size);
        }

        private Bitmap createColoredBitmap(IconCompat icon, int color, int size) {
            Drawable drawable = icon.loadDrawable(this.mBuilder.mContext);
            int width = size == 0 ? drawable.getIntrinsicWidth() : size;
            int height = size == 0 ? drawable.getIntrinsicHeight() : size;
            Bitmap resultBitmap = Bitmap.createBitmap(width, height, Bitmap.Config.ARGB_8888);
            drawable.setBounds(0, 0, width, height);
            if (color != 0) {
                drawable.mutate().setColorFilter(new PorterDuffColorFilter(color, PorterDuff.Mode.SRC_IN));
            }
            drawable.draw(new Canvas(resultBitmap));
            return resultBitmap;
        }

        private Bitmap createIconWithBackground(int iconId, int size, int iconSize, int color) {
            Bitmap coloredBitmap = createColoredBitmap(R.drawable.notification_icon_background, color == 0 ? 0 : color, size);
            Canvas canvas = new Canvas(coloredBitmap);
            Drawable icon = this.mBuilder.mContext.getResources().getDrawable(iconId).mutate();
            icon.setFilterBitmap(true);
            int inset = (size - iconSize) / 2;
            icon.setBounds(inset, inset, iconSize + inset, iconSize + inset);
            icon.setColorFilter(new PorterDuffColorFilter(-1, PorterDuff.Mode.SRC_ATOP));
            icon.draw(canvas);
            return coloredBitmap;
        }

        public void buildIntoRemoteViews(RemoteViews outerView, RemoteViews innerView) {
            hideNormalContent(outerView);
            outerView.removeAllViews(R.id.notification_main_column);
            outerView.addView(R.id.notification_main_column, innerView.clone());
            outerView.setViewVisibility(R.id.notification_main_column, 0);
            RemoteViews remoteViews = outerView;
            remoteViews.setViewPadding(R.id.notification_main_column_container, 0, calculateTopPadding(), 0, 0);
        }

        private void hideNormalContent(RemoteViews outerView) {
            outerView.setViewVisibility(R.id.title, 8);
            outerView.setViewVisibility(R.id.text2, 8);
            outerView.setViewVisibility(R.id.text, 8);
        }

        private int calculateTopPadding() {
            Resources resources = this.mBuilder.mContext.getResources();
            int padding = resources.getDimensionPixelSize(R.dimen.notification_top_pad);
            int largePadding = resources.getDimensionPixelSize(R.dimen.notification_top_pad_large_text);
            float largeFactor = (constrain(resources.getConfiguration().fontScale, 1.0f, 1.3f) - 1.0f) / 0.29999995f;
            return Math.round(((1.0f - largeFactor) * ((float) padding)) + (((float) largePadding) * largeFactor));
        }

        private static float constrain(float amount, float low, float high) {
            if (amount < low) {
                return low;
            }
            return amount > high ? high : amount;
        }

        static class Api24Impl {
            private Api24Impl() {
            }

            static void setChronometerCountDown(RemoteViews remoteViews, int viewId, boolean isCountDown) {
                remoteViews.setChronometerCountDown(viewId, isCountDown);
            }
        }
    }

    public static class BigPictureStyle extends Style {
        private static final String TEMPLATE_CLASS_NAME = "androidx.core.app.NotificationCompat$BigPictureStyle";
        private IconCompat mBigLargeIcon;
        private boolean mBigLargeIconSet;
        private CharSequence mPictureContentDescription;
        private IconCompat mPictureIcon;
        private boolean mShowBigPictureWhenCollapsed;

        public BigPictureStyle() {
        }

        public BigPictureStyle(Builder builder) {
            setBuilder(builder);
        }

        public BigPictureStyle setBigContentTitle(CharSequence title) {
            this.mBigContentTitle = Builder.limitCharSequenceLength(title);
            return this;
        }

        public BigPictureStyle setSummaryText(CharSequence cs) {
            this.mSummaryText = Builder.limitCharSequenceLength(cs);
            this.mSummaryTextSet = true;
            return this;
        }

        public BigPictureStyle setContentDescription(CharSequence contentDescription) {
            this.mPictureContentDescription = contentDescription;
            return this;
        }

        public BigPictureStyle bigPicture(Bitmap b) {
            this.mPictureIcon = b == null ? null : IconCompat.createWithBitmap(b);
            return this;
        }

        public BigPictureStyle bigPicture(Icon i) {
            this.mPictureIcon = IconCompat.createFromIcon(i);
            return this;
        }

        public BigPictureStyle showBigPictureWhenCollapsed(boolean show) {
            this.mShowBigPictureWhenCollapsed = show;
            return this;
        }

        public BigPictureStyle bigLargeIcon(Bitmap b) {
            this.mBigLargeIcon = b == null ? null : IconCompat.createWithBitmap(b);
            this.mBigLargeIconSet = true;
            return this;
        }

        public BigPictureStyle bigLargeIcon(Icon i) {
            this.mBigLargeIcon = i == null ? null : IconCompat.createFromIcon(i);
            this.mBigLargeIconSet = true;
            return this;
        }

        /* access modifiers changed from: protected */
        public String getClassName() {
            return TEMPLATE_CLASS_NAME;
        }

        public void apply(NotificationBuilderWithBuilderAccessor builder) {
            Notification.BigPictureStyle style = new Notification.BigPictureStyle(builder.getBuilder()).setBigContentTitle(this.mBigContentTitle);
            if (this.mPictureIcon != null) {
                if (Build.VERSION.SDK_INT >= 31) {
                    Context context = null;
                    if (builder instanceof NotificationCompatBuilder) {
                        context = ((NotificationCompatBuilder) builder).getContext();
                    }
                    Api31Impl.setBigPicture(style, this.mPictureIcon.toIcon(context));
                } else if (this.mPictureIcon.getType() == 1) {
                    style = style.bigPicture(this.mPictureIcon.getBitmap());
                }
            }
            if (this.mBigLargeIconSet) {
                if (this.mBigLargeIcon == null) {
                    Bitmap bitmap = null;
                    style.bigLargeIcon((Bitmap) null);
                } else {
                    Context context2 = null;
                    if (builder instanceof NotificationCompatBuilder) {
                        context2 = ((NotificationCompatBuilder) builder).getContext();
                    }
                    Api23Impl.setBigLargeIcon(style, this.mBigLargeIcon.toIcon(context2));
                }
            }
            if (this.mSummaryTextSet) {
                style.setSummaryText(this.mSummaryText);
            }
            if (Build.VERSION.SDK_INT >= 31) {
                Api31Impl.showBigPictureWhenCollapsed(style, this.mShowBigPictureWhenCollapsed);
                Api31Impl.setContentDescription(style, this.mPictureContentDescription);
            }
        }

        /* access modifiers changed from: protected */
        public void restoreFromCompatExtras(Bundle extras) {
            super.restoreFromCompatExtras(extras);
            if (extras.containsKey(NotificationCompat.EXTRA_LARGE_ICON_BIG)) {
                this.mBigLargeIcon = asIconCompat(extras.getParcelable(NotificationCompat.EXTRA_LARGE_ICON_BIG));
                this.mBigLargeIconSet = true;
            }
            this.mPictureIcon = getPictureIcon(extras);
            this.mShowBigPictureWhenCollapsed = extras.getBoolean(NotificationCompat.EXTRA_SHOW_BIG_PICTURE_WHEN_COLLAPSED);
        }

        public static IconCompat getPictureIcon(Bundle extras) {
            if (extras == null) {
                return null;
            }
            Parcelable bitmapPicture = extras.getParcelable(NotificationCompat.EXTRA_PICTURE);
            if (bitmapPicture != null) {
                return asIconCompat(bitmapPicture);
            }
            return asIconCompat(extras.getParcelable(NotificationCompat.EXTRA_PICTURE_ICON));
        }

        private static IconCompat asIconCompat(Parcelable bitmapOrIcon) {
            if (bitmapOrIcon == null) {
                return null;
            }
            if (bitmapOrIcon instanceof Icon) {
                return IconCompat.createFromIcon((Icon) bitmapOrIcon);
            }
            if (bitmapOrIcon instanceof Bitmap) {
                return IconCompat.createWithBitmap((Bitmap) bitmapOrIcon);
            }
            return null;
        }

        /* access modifiers changed from: protected */
        public void clearCompatExtraKeys(Bundle extras) {
            super.clearCompatExtraKeys(extras);
            extras.remove(NotificationCompat.EXTRA_LARGE_ICON_BIG);
            extras.remove(NotificationCompat.EXTRA_PICTURE);
            extras.remove(NotificationCompat.EXTRA_PICTURE_ICON);
            extras.remove(NotificationCompat.EXTRA_SHOW_BIG_PICTURE_WHEN_COLLAPSED);
        }

        private static class Api23Impl {
            private Api23Impl() {
            }

            static void setBigLargeIcon(Notification.BigPictureStyle style, Icon icon) {
                style.bigLargeIcon(icon);
            }
        }

        private static class Api31Impl {
            private Api31Impl() {
            }

            static void showBigPictureWhenCollapsed(Notification.BigPictureStyle style, boolean show) {
                style.showBigPictureWhenCollapsed(show);
            }

            static void setContentDescription(Notification.BigPictureStyle style, CharSequence contentDescription) {
                style.setContentDescription(contentDescription);
            }

            static void setBigPicture(Notification.BigPictureStyle style, Icon icon) {
                style.bigPicture(icon);
            }
        }
    }

    public static class BigTextStyle extends Style {
        private static final String TEMPLATE_CLASS_NAME = "androidx.core.app.NotificationCompat$BigTextStyle";
        private CharSequence mBigText;

        public BigTextStyle() {
        }

        public BigTextStyle(Builder builder) {
            setBuilder(builder);
        }

        public BigTextStyle setBigContentTitle(CharSequence title) {
            this.mBigContentTitle = Builder.limitCharSequenceLength(title);
            return this;
        }

        public BigTextStyle setSummaryText(CharSequence cs) {
            this.mSummaryText = Builder.limitCharSequenceLength(cs);
            this.mSummaryTextSet = true;
            return this;
        }

        public BigTextStyle bigText(CharSequence cs) {
            this.mBigText = Builder.limitCharSequenceLength(cs);
            return this;
        }

        /* access modifiers changed from: protected */
        public String getClassName() {
            return TEMPLATE_CLASS_NAME;
        }

        public void apply(NotificationBuilderWithBuilderAccessor builder) {
            Notification.BigTextStyle style = new Notification.BigTextStyle(builder.getBuilder()).setBigContentTitle(this.mBigContentTitle).bigText(this.mBigText);
            if (this.mSummaryTextSet) {
                style.setSummaryText(this.mSummaryText);
            }
        }

        /* access modifiers changed from: protected */
        public void restoreFromCompatExtras(Bundle extras) {
            super.restoreFromCompatExtras(extras);
            this.mBigText = extras.getCharSequence(NotificationCompat.EXTRA_BIG_TEXT);
        }

        public void addCompatExtras(Bundle extras) {
            super.addCompatExtras(extras);
        }

        /* access modifiers changed from: protected */
        public void clearCompatExtraKeys(Bundle extras) {
            super.clearCompatExtraKeys(extras);
            extras.remove(NotificationCompat.EXTRA_BIG_TEXT);
        }
    }

    public static class MessagingStyle extends Style {
        public static final int MAXIMUM_RETAINED_MESSAGES = 25;
        private static final String TEMPLATE_CLASS_NAME = "androidx.core.app.NotificationCompat$MessagingStyle";
        private CharSequence mConversationTitle;
        private final List<Message> mHistoricMessages = new ArrayList();
        private Boolean mIsGroupConversation;
        private final List<Message> mMessages = new ArrayList();
        private Person mUser;

        MessagingStyle() {
        }

        @Deprecated
        public MessagingStyle(CharSequence userDisplayName) {
            this.mUser = new Person.Builder().setName(userDisplayName).build();
        }

        public MessagingStyle(Person user) {
            if (!TextUtils.isEmpty(user.getName())) {
                this.mUser = user;
                return;
            }
            throw new IllegalArgumentException("User's name must not be empty.");
        }

        @Deprecated
        public CharSequence getUserDisplayName() {
            return this.mUser.getName();
        }

        public Person getUser() {
            return this.mUser;
        }

        public MessagingStyle setConversationTitle(CharSequence conversationTitle) {
            this.mConversationTitle = conversationTitle;
            return this;
        }

        public CharSequence getConversationTitle() {
            return this.mConversationTitle;
        }

        @Deprecated
        public MessagingStyle addMessage(CharSequence text, long timestamp, CharSequence sender) {
            this.mMessages.add(new Message(text, timestamp, new Person.Builder().setName(sender).build()));
            if (this.mMessages.size() > 25) {
                this.mMessages.remove(0);
            }
            return this;
        }

        public MessagingStyle addMessage(CharSequence text, long timestamp, Person person) {
            addMessage(new Message(text, timestamp, person));
            return this;
        }

        public MessagingStyle addMessage(Message message) {
            if (message != null) {
                this.mMessages.add(message);
                if (this.mMessages.size() > 25) {
                    this.mMessages.remove(0);
                }
            }
            return this;
        }

        public MessagingStyle addHistoricMessage(Message message) {
            if (message != null) {
                this.mHistoricMessages.add(message);
                if (this.mHistoricMessages.size() > 25) {
                    this.mHistoricMessages.remove(0);
                }
            }
            return this;
        }

        public List<Message> getMessages() {
            return this.mMessages;
        }

        public List<Message> getHistoricMessages() {
            return this.mHistoricMessages;
        }

        public MessagingStyle setGroupConversation(boolean isGroupConversation) {
            this.mIsGroupConversation = Boolean.valueOf(isGroupConversation);
            return this;
        }

        public boolean isGroupConversation() {
            if (this.mBuilder == null || this.mBuilder.mContext.getApplicationInfo().targetSdkVersion >= 28 || this.mIsGroupConversation != null) {
                if (this.mIsGroupConversation != null) {
                    return this.mIsGroupConversation.booleanValue();
                }
                return false;
            } else if (this.mConversationTitle != null) {
                return true;
            } else {
                return false;
            }
        }

        public static MessagingStyle extractMessagingStyleFromNotification(Notification notification) {
            Style style = Style.extractStyleFromNotification(notification);
            if (style instanceof MessagingStyle) {
                return (MessagingStyle) style;
            }
            return null;
        }

        /* access modifiers changed from: protected */
        public String getClassName() {
            return TEMPLATE_CLASS_NAME;
        }

        public void apply(NotificationBuilderWithBuilderAccessor builder) {
            Notification.MessagingStyle messagingStyle;
            setGroupConversation(isGroupConversation());
            if (Build.VERSION.SDK_INT >= 28) {
                messagingStyle = Api28Impl.createMessagingStyle(this.mUser.toAndroidPerson());
            } else {
                messagingStyle = Api24Impl.createMessagingStyle(this.mUser.getName());
            }
            for (Message message : this.mMessages) {
                Api24Impl.addMessage(messagingStyle, message.toAndroidMessage());
            }
            if (Build.VERSION.SDK_INT >= 26) {
                for (Message historicMessage : this.mHistoricMessages) {
                    Api26Impl.addHistoricMessage(messagingStyle, historicMessage.toAndroidMessage());
                }
            }
            if (this.mIsGroupConversation.booleanValue() || Build.VERSION.SDK_INT >= 28) {
                Api24Impl.setConversationTitle(messagingStyle, this.mConversationTitle);
            }
            if (Build.VERSION.SDK_INT >= 28) {
                Api28Impl.setGroupConversation(messagingStyle, this.mIsGroupConversation.booleanValue());
            }
            messagingStyle.setBuilder(builder.getBuilder());
        }

        private Message findLatestIncomingMessage() {
            for (int i = this.mMessages.size() - 1; i >= 0; i--) {
                Message message = this.mMessages.get(i);
                if (message.getPerson() != null && !TextUtils.isEmpty(message.getPerson().getName())) {
                    return message;
                }
            }
            if (!this.mMessages.isEmpty()) {
                return this.mMessages.get(this.mMessages.size() - 1);
            }
            return null;
        }

        private boolean hasMessagesWithoutSender() {
            for (int i = this.mMessages.size() - 1; i >= 0; i--) {
                Message message = this.mMessages.get(i);
                if (message.getPerson() != null && message.getPerson().getName() == null) {
                    return true;
                }
            }
            return false;
        }

        private CharSequence makeMessageLine(Message message) {
            int i;
            BidiFormatter bidi = BidiFormatter.getInstance();
            SpannableStringBuilder sb = new SpannableStringBuilder();
            int color = 1 != 0 ? ViewCompat.MEASURED_STATE_MASK : -1;
            CharSequence text = "";
            CharSequence replyName = message.getPerson() == null ? text : message.getPerson().getName();
            if (TextUtils.isEmpty(replyName)) {
                replyName = this.mUser.getName();
                if (1 == 0 || this.mBuilder.getColor() == 0) {
                    i = color;
                } else {
                    i = this.mBuilder.getColor();
                }
                color = i;
            }
            CharSequence senderText = bidi.unicodeWrap(replyName);
            sb.append(senderText);
            sb.setSpan(makeFontColorSpan(color), sb.length() - senderText.length(), sb.length(), 33);
            if (message.getText() != null) {
                text = message.getText();
            }
            sb.append("  ").append(bidi.unicodeWrap(text));
            return sb;
        }

        private TextAppearanceSpan makeFontColorSpan(int color) {
            return new TextAppearanceSpan((String) null, 0, 0, ColorStateList.valueOf(color), (ColorStateList) null);
        }

        public void addCompatExtras(Bundle extras) {
            super.addCompatExtras(extras);
            extras.putCharSequence(NotificationCompat.EXTRA_SELF_DISPLAY_NAME, this.mUser.getName());
            extras.putBundle(NotificationCompat.EXTRA_MESSAGING_STYLE_USER, this.mUser.toBundle());
            extras.putCharSequence(NotificationCompat.EXTRA_HIDDEN_CONVERSATION_TITLE, this.mConversationTitle);
            if (this.mConversationTitle != null && this.mIsGroupConversation.booleanValue()) {
                extras.putCharSequence(NotificationCompat.EXTRA_CONVERSATION_TITLE, this.mConversationTitle);
            }
            if (!this.mMessages.isEmpty()) {
                extras.putParcelableArray(NotificationCompat.EXTRA_MESSAGES, Message.getBundleArrayForMessages(this.mMessages));
            }
            if (!this.mHistoricMessages.isEmpty()) {
                extras.putParcelableArray(NotificationCompat.EXTRA_HISTORIC_MESSAGES, Message.getBundleArrayForMessages(this.mHistoricMessages));
            }
            if (this.mIsGroupConversation != null) {
                extras.putBoolean(NotificationCompat.EXTRA_IS_GROUP_CONVERSATION, this.mIsGroupConversation.booleanValue());
            }
        }

        /* access modifiers changed from: protected */
        public void restoreFromCompatExtras(Bundle extras) {
            super.restoreFromCompatExtras(extras);
            this.mMessages.clear();
            if (extras.containsKey(NotificationCompat.EXTRA_MESSAGING_STYLE_USER)) {
                this.mUser = Person.fromBundle(extras.getBundle(NotificationCompat.EXTRA_MESSAGING_STYLE_USER));
            } else {
                this.mUser = new Person.Builder().setName(extras.getString(NotificationCompat.EXTRA_SELF_DISPLAY_NAME)).build();
            }
            this.mConversationTitle = extras.getCharSequence(NotificationCompat.EXTRA_CONVERSATION_TITLE);
            if (this.mConversationTitle == null) {
                this.mConversationTitle = extras.getCharSequence(NotificationCompat.EXTRA_HIDDEN_CONVERSATION_TITLE);
            }
            Parcelable[] messages = extras.getParcelableArray(NotificationCompat.EXTRA_MESSAGES);
            if (messages != null) {
                this.mMessages.addAll(Message.getMessagesFromBundleArray(messages));
            }
            Parcelable[] historicMessages = extras.getParcelableArray(NotificationCompat.EXTRA_HISTORIC_MESSAGES);
            if (historicMessages != null) {
                this.mHistoricMessages.addAll(Message.getMessagesFromBundleArray(historicMessages));
            }
            if (extras.containsKey(NotificationCompat.EXTRA_IS_GROUP_CONVERSATION)) {
                this.mIsGroupConversation = Boolean.valueOf(extras.getBoolean(NotificationCompat.EXTRA_IS_GROUP_CONVERSATION));
            }
        }

        /* access modifiers changed from: protected */
        public void clearCompatExtraKeys(Bundle extras) {
            super.clearCompatExtraKeys(extras);
            extras.remove(NotificationCompat.EXTRA_MESSAGING_STYLE_USER);
            extras.remove(NotificationCompat.EXTRA_SELF_DISPLAY_NAME);
            extras.remove(NotificationCompat.EXTRA_CONVERSATION_TITLE);
            extras.remove(NotificationCompat.EXTRA_HIDDEN_CONVERSATION_TITLE);
            extras.remove(NotificationCompat.EXTRA_MESSAGES);
            extras.remove(NotificationCompat.EXTRA_HISTORIC_MESSAGES);
            extras.remove(NotificationCompat.EXTRA_IS_GROUP_CONVERSATION);
        }

        public static final class Message {
            static final String KEY_DATA_MIME_TYPE = "type";
            static final String KEY_DATA_URI = "uri";
            static final String KEY_EXTRAS_BUNDLE = "extras";
            static final String KEY_NOTIFICATION_PERSON = "sender_person";
            static final String KEY_PERSON = "person";
            static final String KEY_SENDER = "sender";
            static final String KEY_TEXT = "text";
            static final String KEY_TIMESTAMP = "time";
            private String mDataMimeType;
            private Uri mDataUri;
            private Bundle mExtras;
            private final Person mPerson;
            private final CharSequence mText;
            private final long mTimestamp;

            public Message(CharSequence text, long timestamp, Person person) {
                this.mExtras = new Bundle();
                this.mText = text;
                this.mTimestamp = timestamp;
                this.mPerson = person;
            }

            @Deprecated
            public Message(CharSequence text, long timestamp, CharSequence sender) {
                this(text, timestamp, new Person.Builder().setName(sender).build());
            }

            public Message setData(String dataMimeType, Uri dataUri) {
                this.mDataMimeType = dataMimeType;
                this.mDataUri = dataUri;
                return this;
            }

            public CharSequence getText() {
                return this.mText;
            }

            public long getTimestamp() {
                return this.mTimestamp;
            }

            public Bundle getExtras() {
                return this.mExtras;
            }

            @Deprecated
            public CharSequence getSender() {
                if (this.mPerson == null) {
                    return null;
                }
                return this.mPerson.getName();
            }

            public Person getPerson() {
                return this.mPerson;
            }

            public String getDataMimeType() {
                return this.mDataMimeType;
            }

            public Uri getDataUri() {
                return this.mDataUri;
            }

            private Bundle toBundle() {
                Bundle bundle = new Bundle();
                if (this.mText != null) {
                    bundle.putCharSequence(KEY_TEXT, this.mText);
                }
                bundle.putLong(KEY_TIMESTAMP, this.mTimestamp);
                if (this.mPerson != null) {
                    bundle.putCharSequence(KEY_SENDER, this.mPerson.getName());
                    if (Build.VERSION.SDK_INT >= 28) {
                        bundle.putParcelable(KEY_NOTIFICATION_PERSON, Api28Impl.castToParcelable(this.mPerson.toAndroidPerson()));
                    } else {
                        bundle.putBundle(KEY_PERSON, this.mPerson.toBundle());
                    }
                }
                if (this.mDataMimeType != null) {
                    bundle.putString(KEY_DATA_MIME_TYPE, this.mDataMimeType);
                }
                if (this.mDataUri != null) {
                    bundle.putParcelable(KEY_DATA_URI, this.mDataUri);
                }
                if (this.mExtras != null) {
                    bundle.putBundle(KEY_EXTRAS_BUNDLE, this.mExtras);
                }
                return bundle;
            }

            static Bundle[] getBundleArrayForMessages(List<Message> messages) {
                Bundle[] bundles = new Bundle[messages.size()];
                int N = messages.size();
                for (int i = 0; i < N; i++) {
                    bundles[i] = messages.get(i).toBundle();
                }
                return bundles;
            }

            static List<Message> getMessagesFromBundleArray(Parcelable[] bundles) {
                Message message;
                List<Message> messages = new ArrayList<>(bundles.length);
                for (int i = 0; i < bundles.length; i++) {
                    if ((bundles[i] instanceof Bundle) && (message = getMessageFromBundle(bundles[i])) != null) {
                        messages.add(message);
                    }
                }
                return messages;
            }

            static Message getMessageFromBundle(Bundle bundle) {
                try {
                    if (bundle.containsKey(KEY_TEXT)) {
                        if (bundle.containsKey(KEY_TIMESTAMP)) {
                            Person person = null;
                            if (bundle.containsKey(KEY_PERSON)) {
                                person = Person.fromBundle(bundle.getBundle(KEY_PERSON));
                            } else if (bundle.containsKey(KEY_NOTIFICATION_PERSON) && Build.VERSION.SDK_INT >= 28) {
                                person = Person.fromAndroidPerson((android.app.Person) bundle.getParcelable(KEY_NOTIFICATION_PERSON));
                            } else if (bundle.containsKey(KEY_SENDER)) {
                                person = new Person.Builder().setName(bundle.getCharSequence(KEY_SENDER)).build();
                            }
                            Message message = new Message(bundle.getCharSequence(KEY_TEXT), bundle.getLong(KEY_TIMESTAMP), person);
                            if (bundle.containsKey(KEY_DATA_MIME_TYPE) && bundle.containsKey(KEY_DATA_URI)) {
                                message.setData(bundle.getString(KEY_DATA_MIME_TYPE), (Uri) bundle.getParcelable(KEY_DATA_URI));
                            }
                            if (bundle.containsKey(KEY_EXTRAS_BUNDLE)) {
                                message.getExtras().putAll(bundle.getBundle(KEY_EXTRAS_BUNDLE));
                            }
                            return message;
                        }
                    }
                    return null;
                } catch (ClassCastException e) {
                    return null;
                }
            }

            /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r3v4, resolved type: android.app.Person} */
            /* JADX WARNING: type inference failed for: r3v0 */
            /* JADX WARNING: type inference failed for: r3v2, types: [java.lang.CharSequence] */
            /* JADX WARNING: type inference failed for: r3v6 */
            /* JADX WARNING: type inference failed for: r3v7 */
            /* access modifiers changed from: package-private */
            /* JADX WARNING: Multi-variable type inference failed */
            /* Code decompiled incorrectly, please refer to instructions dump. */
            public android.app.Notification.MessagingStyle.Message toAndroidMessage() {
                /*
                    r6 = this;
                    androidx.core.app.Person r0 = r6.getPerson()
                    int r1 = android.os.Build.VERSION.SDK_INT
                    r2 = 28
                    r3 = 0
                    if (r1 < r2) goto L_0x001f
                    java.lang.CharSequence r1 = r6.getText()
                    long r4 = r6.getTimestamp()
                    if (r0 != 0) goto L_0x0016
                    goto L_0x001a
                L_0x0016:
                    android.app.Person r3 = r0.toAndroidPerson()
                L_0x001a:
                    android.app.Notification$MessagingStyle$Message r1 = androidx.core.app.NotificationCompat.MessagingStyle.Message.Api28Impl.createMessage(r1, r4, r3)
                    goto L_0x0032
                L_0x001f:
                    java.lang.CharSequence r1 = r6.getText()
                    long r4 = r6.getTimestamp()
                    if (r0 != 0) goto L_0x002a
                    goto L_0x002e
                L_0x002a:
                    java.lang.CharSequence r3 = r0.getName()
                L_0x002e:
                    android.app.Notification$MessagingStyle$Message r1 = androidx.core.app.NotificationCompat.MessagingStyle.Message.Api24Impl.createMessage(r1, r4, r3)
                L_0x0032:
                    java.lang.String r2 = r6.getDataMimeType()
                    if (r2 == 0) goto L_0x0043
                    java.lang.String r2 = r6.getDataMimeType()
                    android.net.Uri r3 = r6.getDataUri()
                    androidx.core.app.NotificationCompat.MessagingStyle.Message.Api24Impl.setData(r1, r2, r3)
                L_0x0043:
                    return r1
                */
                throw new UnsupportedOperationException("Method not decompiled: androidx.core.app.NotificationCompat.MessagingStyle.Message.toAndroidMessage():android.app.Notification$MessagingStyle$Message");
            }

            static class Api24Impl {
                private Api24Impl() {
                }

                static Notification.MessagingStyle.Message createMessage(CharSequence text, long timestamp, CharSequence sender) {
                    return new Notification.MessagingStyle.Message(text, timestamp, sender);
                }

                static Notification.MessagingStyle.Message setData(Notification.MessagingStyle.Message message, String dataMimeType, Uri dataUri) {
                    return message.setData(dataMimeType, dataUri);
                }
            }

            static class Api28Impl {
                private Api28Impl() {
                }

                static Notification.MessagingStyle.Message createMessage(CharSequence text, long timestamp, android.app.Person sender) {
                    return new Notification.MessagingStyle.Message(text, timestamp, sender);
                }

                static Parcelable castToParcelable(android.app.Person person) {
                    return person;
                }
            }
        }

        static class Api24Impl {
            private Api24Impl() {
            }

            static Notification.MessagingStyle createMessagingStyle(CharSequence userDisplayName) {
                return new Notification.MessagingStyle(userDisplayName);
            }

            static Notification.MessagingStyle addMessage(Notification.MessagingStyle messagingStyle, Notification.MessagingStyle.Message message) {
                return messagingStyle.addMessage(message);
            }

            static Notification.MessagingStyle setConversationTitle(Notification.MessagingStyle messagingStyle, CharSequence conversationTitle) {
                return messagingStyle.setConversationTitle(conversationTitle);
            }
        }

        static class Api26Impl {
            private Api26Impl() {
            }

            static Notification.MessagingStyle addHistoricMessage(Notification.MessagingStyle messagingStyle, Notification.MessagingStyle.Message message) {
                return messagingStyle.addHistoricMessage(message);
            }
        }

        static class Api28Impl {
            private Api28Impl() {
            }

            static Notification.MessagingStyle createMessagingStyle(android.app.Person user) {
                return new Notification.MessagingStyle(user);
            }

            static Notification.MessagingStyle setGroupConversation(Notification.MessagingStyle messagingStyle, boolean isGroupConversation) {
                return messagingStyle.setGroupConversation(isGroupConversation);
            }
        }
    }

    public static class CallStyle extends Style {
        public static final int CALL_TYPE_INCOMING = 1;
        public static final int CALL_TYPE_ONGOING = 2;
        public static final int CALL_TYPE_SCREENING = 3;
        public static final int CALL_TYPE_UNKNOWN = 0;
        private static final String KEY_ACTION_PRIORITY = "key_action_priority";
        private static final String TEMPLATE_CLASS_NAME = "androidx.core.app.NotificationCompat$CallStyle";
        private Integer mAnswerButtonColor;
        private PendingIntent mAnswerIntent;
        private int mCallType;
        private Integer mDeclineButtonColor;
        private PendingIntent mDeclineIntent;
        private PendingIntent mHangUpIntent;
        private boolean mIsVideo;
        private Person mPerson;
        private IconCompat mVerificationIcon;
        private CharSequence mVerificationText;

        @Retention(RetentionPolicy.SOURCE)
        public @interface CallType {
        }

        public CallStyle() {
        }

        public CallStyle(Builder builder) {
            setBuilder(builder);
        }

        public static CallStyle forIncomingCall(Person person, PendingIntent declineIntent, PendingIntent answerIntent) {
            return new CallStyle(1, person, (PendingIntent) null, (PendingIntent) Objects.requireNonNull(declineIntent, "declineIntent is required"), (PendingIntent) Objects.requireNonNull(answerIntent, "answerIntent is required"));
        }

        public static CallStyle forOngoingCall(Person person, PendingIntent hangUpIntent) {
            return new CallStyle(2, person, (PendingIntent) Objects.requireNonNull(hangUpIntent, "hangUpIntent is required"), (PendingIntent) null, (PendingIntent) null);
        }

        public static CallStyle forScreeningCall(Person person, PendingIntent hangUpIntent, PendingIntent answerIntent) {
            return new CallStyle(3, person, (PendingIntent) Objects.requireNonNull(hangUpIntent, "hangUpIntent is required"), (PendingIntent) null, (PendingIntent) Objects.requireNonNull(answerIntent, "answerIntent is required"));
        }

        private CallStyle(int callType, Person person, PendingIntent hangUpIntent, PendingIntent declineIntent, PendingIntent answerIntent) {
            if (person == null || TextUtils.isEmpty(person.getName())) {
                throw new IllegalArgumentException("person must have a non-empty a name");
            }
            this.mCallType = callType;
            this.mPerson = person;
            this.mAnswerIntent = answerIntent;
            this.mDeclineIntent = declineIntent;
            this.mHangUpIntent = hangUpIntent;
        }

        public CallStyle setIsVideo(boolean isVideo) {
            this.mIsVideo = isVideo;
            return this;
        }

        public CallStyle setVerificationIcon(Icon verificationIcon) {
            IconCompat iconCompat;
            if (verificationIcon == null) {
                iconCompat = null;
            } else {
                iconCompat = IconCompat.createFromIcon(verificationIcon);
            }
            this.mVerificationIcon = iconCompat;
            return this;
        }

        public CallStyle setVerificationIcon(Bitmap verificationIcon) {
            this.mVerificationIcon = IconCompat.createWithBitmap(verificationIcon);
            return this;
        }

        public CallStyle setVerificationText(CharSequence verificationText) {
            this.mVerificationText = verificationText;
            return this;
        }

        public CallStyle setAnswerButtonColorHint(int color) {
            this.mAnswerButtonColor = Integer.valueOf(color);
            return this;
        }

        public CallStyle setDeclineButtonColorHint(int color) {
            this.mDeclineButtonColor = Integer.valueOf(color);
            return this;
        }

        public boolean displayCustomViewInline() {
            return true;
        }

        /* access modifiers changed from: protected */
        public void restoreFromCompatExtras(Bundle extras) {
            super.restoreFromCompatExtras(extras);
            this.mCallType = extras.getInt(NotificationCompat.EXTRA_CALL_TYPE);
            this.mIsVideo = extras.getBoolean(NotificationCompat.EXTRA_CALL_IS_VIDEO);
            if (Build.VERSION.SDK_INT >= 28 && extras.containsKey(NotificationCompat.EXTRA_CALL_PERSON)) {
                this.mPerson = Person.fromAndroidPerson((android.app.Person) extras.getParcelable(NotificationCompat.EXTRA_CALL_PERSON));
            } else if (extras.containsKey(NotificationCompat.EXTRA_CALL_PERSON_COMPAT)) {
                this.mPerson = Person.fromBundle(extras.getBundle(NotificationCompat.EXTRA_CALL_PERSON_COMPAT));
            }
            if (extras.containsKey(NotificationCompat.EXTRA_VERIFICATION_ICON)) {
                this.mVerificationIcon = IconCompat.createFromIcon((Icon) extras.getParcelable(NotificationCompat.EXTRA_VERIFICATION_ICON));
            } else if (extras.containsKey(NotificationCompat.EXTRA_VERIFICATION_ICON_COMPAT)) {
                this.mVerificationIcon = IconCompat.createFromBundle(extras.getBundle(NotificationCompat.EXTRA_VERIFICATION_ICON_COMPAT));
            }
            this.mVerificationText = extras.getCharSequence(NotificationCompat.EXTRA_VERIFICATION_TEXT);
            this.mAnswerIntent = (PendingIntent) extras.getParcelable(NotificationCompat.EXTRA_ANSWER_INTENT);
            this.mDeclineIntent = (PendingIntent) extras.getParcelable(NotificationCompat.EXTRA_DECLINE_INTENT);
            this.mHangUpIntent = (PendingIntent) extras.getParcelable(NotificationCompat.EXTRA_HANG_UP_INTENT);
            Integer num = null;
            this.mAnswerButtonColor = extras.containsKey(NotificationCompat.EXTRA_ANSWER_COLOR) ? Integer.valueOf(extras.getInt(NotificationCompat.EXTRA_ANSWER_COLOR)) : null;
            if (extras.containsKey(NotificationCompat.EXTRA_DECLINE_COLOR)) {
                num = Integer.valueOf(extras.getInt(NotificationCompat.EXTRA_DECLINE_COLOR));
            }
            this.mDeclineButtonColor = num;
        }

        public void addCompatExtras(Bundle extras) {
            super.addCompatExtras(extras);
            extras.putInt(NotificationCompat.EXTRA_CALL_TYPE, this.mCallType);
            extras.putBoolean(NotificationCompat.EXTRA_CALL_IS_VIDEO, this.mIsVideo);
            if (this.mPerson != null) {
                if (Build.VERSION.SDK_INT >= 28) {
                    extras.putParcelable(NotificationCompat.EXTRA_CALL_PERSON, Api28Impl.castToParcelable(this.mPerson.toAndroidPerson()));
                } else {
                    extras.putParcelable(NotificationCompat.EXTRA_CALL_PERSON_COMPAT, this.mPerson.toBundle());
                }
            }
            if (this.mVerificationIcon != null) {
                extras.putParcelable(NotificationCompat.EXTRA_VERIFICATION_ICON, Api23Impl.castToParcelable(this.mVerificationIcon.toIcon(this.mBuilder.mContext)));
            }
            extras.putCharSequence(NotificationCompat.EXTRA_VERIFICATION_TEXT, this.mVerificationText);
            extras.putParcelable(NotificationCompat.EXTRA_ANSWER_INTENT, this.mAnswerIntent);
            extras.putParcelable(NotificationCompat.EXTRA_DECLINE_INTENT, this.mDeclineIntent);
            extras.putParcelable(NotificationCompat.EXTRA_HANG_UP_INTENT, this.mHangUpIntent);
            if (this.mAnswerButtonColor != null) {
                extras.putInt(NotificationCompat.EXTRA_ANSWER_COLOR, this.mAnswerButtonColor.intValue());
            }
            if (this.mDeclineButtonColor != null) {
                extras.putInt(NotificationCompat.EXTRA_DECLINE_COLOR, this.mDeclineButtonColor.intValue());
            }
        }

        /* access modifiers changed from: protected */
        public String getClassName() {
            return TEMPLATE_CLASS_NAME;
        }

        public void apply(NotificationBuilderWithBuilderAccessor builderAccessor) {
            if (Build.VERSION.SDK_INT >= 31) {
                Notification.CallStyle style = null;
                switch (this.mCallType) {
                    case 1:
                        style = Api31Impl.forIncomingCall(this.mPerson.toAndroidPerson(), this.mDeclineIntent, this.mAnswerIntent);
                        break;
                    case 2:
                        style = Api31Impl.forOngoingCall(this.mPerson.toAndroidPerson(), this.mHangUpIntent);
                        break;
                    case 3:
                        style = Api31Impl.forScreeningCall(this.mPerson.toAndroidPerson(), this.mHangUpIntent, this.mAnswerIntent);
                        break;
                    default:
                        if (Log.isLoggable(NotificationCompat.TAG, 3)) {
                            Log.d(NotificationCompat.TAG, "Unrecognized call type in CallStyle: " + String.valueOf(this.mCallType));
                            break;
                        }
                        break;
                }
                if (style != null) {
                    style.setBuilder(builderAccessor.getBuilder());
                    if (this.mAnswerButtonColor != null) {
                        Api31Impl.setAnswerButtonColorHint(style, this.mAnswerButtonColor.intValue());
                    }
                    if (this.mDeclineButtonColor != null) {
                        Api31Impl.setDeclineButtonColorHint(style, this.mDeclineButtonColor.intValue());
                    }
                    Api31Impl.setVerificationText(style, this.mVerificationText);
                    if (this.mVerificationIcon != null) {
                        Api31Impl.setVerificationIcon(style, this.mVerificationIcon.toIcon(this.mBuilder.mContext));
                    }
                    Api31Impl.setIsVideo(style, this.mIsVideo);
                    return;
                }
                return;
            }
            Notification.Builder builder = builderAccessor.getBuilder();
            CharSequence text = null;
            builder.setContentTitle(this.mPerson != null ? this.mPerson.getName() : null);
            if (this.mBuilder.mExtras != null && this.mBuilder.mExtras.containsKey(NotificationCompat.EXTRA_TEXT)) {
                text = this.mBuilder.mExtras.getCharSequence(NotificationCompat.EXTRA_TEXT);
            }
            if (text == null) {
                text = getDefaultText();
            }
            builder.setContentText(text);
            if (this.mPerson != null) {
                if (this.mPerson.getIcon() != null) {
                    Api23Impl.setLargeIcon(builder, this.mPerson.getIcon().toIcon(this.mBuilder.mContext));
                }
                if (Build.VERSION.SDK_INT >= 28) {
                    Api28Impl.addPerson(builder, this.mPerson.toAndroidPerson());
                } else {
                    Api21Impl.addPerson(builder, this.mPerson.getUri());
                }
            }
            Api21Impl.setCategory(builder, NotificationCompat.CATEGORY_CALL);
        }

        private String getDefaultText() {
            switch (this.mCallType) {
                case 1:
                    return this.mBuilder.mContext.getResources().getString(R.string.call_notification_incoming_text);
                case 2:
                    return this.mBuilder.mContext.getResources().getString(R.string.call_notification_ongoing_text);
                case 3:
                    return this.mBuilder.mContext.getResources().getString(R.string.call_notification_screening_text);
                default:
                    return null;
            }
        }

        private Action makeNegativeAction() {
            int i = R.drawable.ic_call_decline_low;
            int icon = R.drawable.ic_call_decline;
            if (this.mDeclineIntent == null) {
                return makeAction(icon, R.string.call_notification_hang_up_action, this.mDeclineButtonColor, R.color.call_notification_decline_color, this.mHangUpIntent);
            }
            return makeAction(icon, R.string.call_notification_decline_action, this.mDeclineButtonColor, R.color.call_notification_decline_color, this.mDeclineIntent);
        }

        private Action makeAnswerAction() {
            int i;
            int i2 = R.drawable.ic_call_answer_video_low;
            int i3 = R.drawable.ic_call_answer_low;
            int videoIcon = R.drawable.ic_call_answer_video;
            int icon = R.drawable.ic_call_answer;
            if (this.mAnswerIntent == null) {
                return null;
            }
            int i4 = this.mIsVideo ? videoIcon : icon;
            if (this.mIsVideo) {
                i = R.string.call_notification_answer_video_action;
            } else {
                i = R.string.call_notification_answer_action;
            }
            return makeAction(i4, i, this.mAnswerButtonColor, R.color.call_notification_answer_color, this.mAnswerIntent);
        }

        private Action makeAction(int icon, int title, Integer colorInt, int defaultColorRes, PendingIntent intent) {
            if (colorInt == null) {
                colorInt = Integer.valueOf(ContextCompat.getColor(this.mBuilder.mContext, defaultColorRes));
            }
            SpannableStringBuilder stringBuilder = new SpannableStringBuilder();
            stringBuilder.append(this.mBuilder.mContext.getResources().getString(title));
            stringBuilder.setSpan(new ForegroundColorSpan(colorInt.intValue()), 0, stringBuilder.length(), 18);
            Action action = new Action.Builder(IconCompat.createWithResource(this.mBuilder.mContext, icon), (CharSequence) stringBuilder, intent).build();
            action.getExtras().putBoolean(KEY_ACTION_PRIORITY, true);
            return action;
        }

        private boolean isActionAddedByCallStyle(Action action) {
            return action != null && action.getExtras().getBoolean(KEY_ACTION_PRIORITY);
        }

        public ArrayList<Action> getActionsListWithSystemActions() {
            Action firstAction = makeNegativeAction();
            Action lastAction = makeAnswerAction();
            int nonContextualActionSlotsRemaining = 3;
            ArrayList<Action> resultActions = new ArrayList<>(3);
            if (3 > 0) {
                resultActions.add(firstAction);
                nonContextualActionSlotsRemaining = 3 - 1;
            }
            List<Action> existingActions = this.mBuilder.mActions;
            if (existingActions != null) {
                for (Action action : existingActions) {
                    if (action.isContextual()) {
                        resultActions.add(action);
                    } else if (!isActionAddedByCallStyle(action) && nonContextualActionSlotsRemaining > 1) {
                        resultActions.add(action);
                        nonContextualActionSlotsRemaining--;
                    }
                    if (lastAction != null && nonContextualActionSlotsRemaining == 1) {
                        resultActions.add(lastAction);
                        nonContextualActionSlotsRemaining--;
                    }
                }
            }
            if (lastAction != null && nonContextualActionSlotsRemaining >= 1) {
                resultActions.add(lastAction);
            }
            return resultActions;
        }

        static class Api20Impl {
            private Api20Impl() {
            }

            static Notification.Action build(Notification.Action.Builder builder) {
                return builder.build();
            }

            static Notification.Action.Builder createActionBuilder(int icon, CharSequence title, PendingIntent intent) {
                return new Notification.Action.Builder(icon, title, intent);
            }

            static Notification.Action.Builder addExtras(Notification.Action.Builder builder, Bundle extras) {
                return builder.addExtras(extras);
            }

            static Notification.Action.Builder addRemoteInput(Notification.Action.Builder builder, RemoteInput remoteInput) {
                return builder.addRemoteInput(remoteInput);
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
        }

        static class Api23Impl {
            private Api23Impl() {
            }

            static void setLargeIcon(Notification.Builder builder, Icon icon) {
                builder.setLargeIcon(icon);
            }

            static Notification.Action.Builder createActionBuilder(Icon icon, CharSequence title, PendingIntent intent) {
                return new Notification.Action.Builder(icon, title, intent);
            }

            static Parcelable castToParcelable(Icon icon) {
                return icon;
            }
        }

        static class Api24Impl {
            private Api24Impl() {
            }

            static Notification.Action.Builder setAllowGeneratedReplies(Notification.Action.Builder builder, boolean allowGeneratedReplies) {
                return builder.setAllowGeneratedReplies(allowGeneratedReplies);
            }
        }

        static class Api28Impl {
            private Api28Impl() {
            }

            static Notification.Builder addPerson(Notification.Builder builder, android.app.Person person) {
                return builder.addPerson(person);
            }

            static Parcelable castToParcelable(android.app.Person person) {
                return person;
            }
        }

        static class Api31Impl {
            private Api31Impl() {
            }

            static Notification.CallStyle forIncomingCall(android.app.Person person, PendingIntent declineIntent, PendingIntent answerIntent) {
                return Notification.CallStyle.forIncomingCall(person, declineIntent, answerIntent);
            }

            static Notification.CallStyle forOngoingCall(android.app.Person person, PendingIntent hangUpIntent) {
                return Notification.CallStyle.forOngoingCall(person, hangUpIntent);
            }

            static Notification.CallStyle forScreeningCall(android.app.Person person, PendingIntent hangUpIntent, PendingIntent answerIntent) {
                return Notification.CallStyle.forScreeningCall(person, hangUpIntent, answerIntent);
            }

            static Notification.CallStyle setIsVideo(Notification.CallStyle callStyle, boolean isVideo) {
                return callStyle.setIsVideo(isVideo);
            }

            static Notification.CallStyle setVerificationIcon(Notification.CallStyle callStyle, Icon verificationIcon) {
                return callStyle.setVerificationIcon(verificationIcon);
            }

            static Notification.CallStyle setVerificationText(Notification.CallStyle callStyle, CharSequence verificationText) {
                return callStyle.setVerificationText(verificationText);
            }

            static Notification.CallStyle setAnswerButtonColorHint(Notification.CallStyle callStyle, int color) {
                return callStyle.setAnswerButtonColorHint(color);
            }

            static Notification.CallStyle setDeclineButtonColorHint(Notification.CallStyle callStyle, int color) {
                return callStyle.setDeclineButtonColorHint(color);
            }

            static Notification.Action.Builder setAuthenticationRequired(Notification.Action.Builder actionBuilder, boolean authenticationRequired) {
                return actionBuilder.setAuthenticationRequired(authenticationRequired);
            }
        }
    }

    public static class InboxStyle extends Style {
        private static final String TEMPLATE_CLASS_NAME = "androidx.core.app.NotificationCompat$InboxStyle";
        private ArrayList<CharSequence> mTexts = new ArrayList<>();

        public InboxStyle() {
        }

        public InboxStyle(Builder builder) {
            setBuilder(builder);
        }

        public InboxStyle setBigContentTitle(CharSequence title) {
            this.mBigContentTitle = Builder.limitCharSequenceLength(title);
            return this;
        }

        public InboxStyle setSummaryText(CharSequence cs) {
            this.mSummaryText = Builder.limitCharSequenceLength(cs);
            this.mSummaryTextSet = true;
            return this;
        }

        public InboxStyle addLine(CharSequence cs) {
            if (cs != null) {
                this.mTexts.add(Builder.limitCharSequenceLength(cs));
            }
            return this;
        }

        /* access modifiers changed from: protected */
        public String getClassName() {
            return TEMPLATE_CLASS_NAME;
        }

        public void apply(NotificationBuilderWithBuilderAccessor builder) {
            Notification.InboxStyle style = new Notification.InboxStyle(builder.getBuilder()).setBigContentTitle(this.mBigContentTitle);
            if (this.mSummaryTextSet) {
                style.setSummaryText(this.mSummaryText);
            }
            Iterator<CharSequence> it = this.mTexts.iterator();
            while (it.hasNext()) {
                style.addLine(it.next());
            }
        }

        /* access modifiers changed from: protected */
        public void restoreFromCompatExtras(Bundle extras) {
            super.restoreFromCompatExtras(extras);
            this.mTexts.clear();
            if (extras.containsKey(NotificationCompat.EXTRA_TEXT_LINES)) {
                Collections.addAll(this.mTexts, extras.getCharSequenceArray(NotificationCompat.EXTRA_TEXT_LINES));
            }
        }

        /* access modifiers changed from: protected */
        public void clearCompatExtraKeys(Bundle extras) {
            super.clearCompatExtraKeys(extras);
            extras.remove(NotificationCompat.EXTRA_TEXT_LINES);
        }
    }

    public static class DecoratedCustomViewStyle extends Style {
        private static final int MAX_ACTION_BUTTONS = 3;
        private static final String TEMPLATE_CLASS_NAME = "androidx.core.app.NotificationCompat$DecoratedCustomViewStyle";

        /* access modifiers changed from: protected */
        public String getClassName() {
            return TEMPLATE_CLASS_NAME;
        }

        public boolean displayCustomViewInline() {
            return true;
        }

        public void apply(NotificationBuilderWithBuilderAccessor builder) {
            builder.getBuilder().setStyle(Api24Impl.createDecoratedCustomViewStyle());
        }

        public RemoteViews makeContentView(NotificationBuilderWithBuilderAccessor builder) {
            return null;
        }

        public RemoteViews makeBigContentView(NotificationBuilderWithBuilderAccessor builder) {
            return null;
        }

        public RemoteViews makeHeadsUpContentView(NotificationBuilderWithBuilderAccessor builder) {
            return null;
        }

        private RemoteViews createRemoteViews(RemoteViews innerView, boolean showActions) {
            int numActions;
            int actionVisibility = 0;
            RemoteViews remoteViews = applyStandardTemplate(true, R.layout.notification_template_custom_big, false);
            remoteViews.removeAllViews(R.id.actions);
            boolean actionsVisible = false;
            List<Action> nonContextualActions = getNonContextualActions(this.mBuilder.mActions);
            if (showActions && nonContextualActions != null && (numActions = Math.min(nonContextualActions.size(), 3)) > 0) {
                actionsVisible = true;
                for (int i = 0; i < numActions; i++) {
                    remoteViews.addView(R.id.actions, generateActionButton(nonContextualActions.get(i)));
                }
            }
            if (!actionsVisible) {
                actionVisibility = 8;
            }
            remoteViews.setViewVisibility(R.id.actions, actionVisibility);
            remoteViews.setViewVisibility(R.id.action_divider, actionVisibility);
            buildIntoRemoteViews(remoteViews, innerView);
            return remoteViews;
        }

        private static List<Action> getNonContextualActions(List<Action> actions) {
            if (actions == null) {
                return null;
            }
            List<Action> nonContextualActions = new ArrayList<>();
            for (Action action : actions) {
                if (!action.isContextual()) {
                    nonContextualActions.add(action);
                }
            }
            return nonContextualActions;
        }

        private RemoteViews generateActionButton(Action action) {
            int i;
            boolean tombstone = action.actionIntent == null;
            String packageName = this.mBuilder.mContext.getPackageName();
            if (tombstone) {
                i = R.layout.notification_action_tombstone;
            } else {
                i = R.layout.notification_action;
            }
            RemoteViews button = new RemoteViews(packageName, i);
            IconCompat icon = action.getIconCompat();
            if (icon != null) {
                button.setImageViewBitmap(R.id.action_image, createColoredBitmap(icon, R.color.notification_action_color_filter));
            }
            button.setTextViewText(R.id.action_text, action.title);
            if (!tombstone) {
                button.setOnClickPendingIntent(R.id.action_container, action.actionIntent);
            }
            button.setContentDescription(R.id.action_container, action.title);
            return button;
        }

        static class Api24Impl {
            private Api24Impl() {
            }

            static Notification.Style createDecoratedCustomViewStyle() {
                return new Notification.DecoratedCustomViewStyle();
            }
        }
    }

    public static class Action {
        static final String EXTRA_SEMANTIC_ACTION = "android.support.action.semanticAction";
        static final String EXTRA_SHOWS_USER_INTERFACE = "android.support.action.showsUserInterface";
        public static final int SEMANTIC_ACTION_ARCHIVE = 5;
        public static final int SEMANTIC_ACTION_CALL = 10;
        public static final int SEMANTIC_ACTION_DELETE = 4;
        public static final int SEMANTIC_ACTION_MARK_AS_READ = 2;
        public static final int SEMANTIC_ACTION_MARK_AS_UNREAD = 3;
        public static final int SEMANTIC_ACTION_MUTE = 6;
        public static final int SEMANTIC_ACTION_NONE = 0;
        public static final int SEMANTIC_ACTION_REPLY = 1;
        public static final int SEMANTIC_ACTION_THUMBS_DOWN = 9;
        public static final int SEMANTIC_ACTION_THUMBS_UP = 8;
        public static final int SEMANTIC_ACTION_UNMUTE = 7;
        public PendingIntent actionIntent;
        @Deprecated
        public int icon;
        private boolean mAllowGeneratedReplies;
        private boolean mAuthenticationRequired;
        private final RemoteInput[] mDataOnlyRemoteInputs;
        final Bundle mExtras;
        private IconCompat mIcon;
        private final boolean mIsContextual;
        private final RemoteInput[] mRemoteInputs;
        private final int mSemanticAction;
        boolean mShowsUserInterface;
        public CharSequence title;

        public interface Extender {
            Builder extend(Builder builder);
        }

        @Retention(RetentionPolicy.SOURCE)
        public @interface SemanticAction {
        }

        /* JADX INFO: this call moved to the top of the method (can break code semantics) */
        public Action(int icon2, CharSequence title2, PendingIntent intent) {
            this(icon2 != 0 ? IconCompat.createWithResource((Resources) null, "", icon2) : null, title2, intent);
        }

        public Action(IconCompat icon2, CharSequence title2, PendingIntent intent) {
            this(icon2, title2, intent, new Bundle(), (RemoteInput[]) null, (RemoteInput[]) null, true, 0, true, false, false);
        }

        /* JADX INFO: this call moved to the top of the method (can break code semantics) */
        Action(int icon2, CharSequence title2, PendingIntent intent, Bundle extras, RemoteInput[] remoteInputs, RemoteInput[] dataOnlyRemoteInputs, boolean allowGeneratedReplies, int semanticAction, boolean showsUserInterface, boolean isContextual, boolean requireAuth) {
            this(icon2 != 0 ? IconCompat.createWithResource((Resources) null, "", icon2) : null, title2, intent, extras, remoteInputs, dataOnlyRemoteInputs, allowGeneratedReplies, semanticAction, showsUserInterface, isContextual, requireAuth);
        }

        Action(IconCompat icon2, CharSequence title2, PendingIntent intent, Bundle extras, RemoteInput[] remoteInputs, RemoteInput[] dataOnlyRemoteInputs, boolean allowGeneratedReplies, int semanticAction, boolean showsUserInterface, boolean isContextual, boolean requireAuth) {
            this.mShowsUserInterface = true;
            this.mIcon = icon2;
            if (icon2 != null && icon2.getType() == 2) {
                this.icon = icon2.getResId();
            }
            this.title = Builder.limitCharSequenceLength(title2);
            this.actionIntent = intent;
            this.mExtras = extras != null ? extras : new Bundle();
            this.mRemoteInputs = remoteInputs;
            this.mDataOnlyRemoteInputs = dataOnlyRemoteInputs;
            this.mAllowGeneratedReplies = allowGeneratedReplies;
            this.mSemanticAction = semanticAction;
            this.mShowsUserInterface = showsUserInterface;
            this.mIsContextual = isContextual;
            this.mAuthenticationRequired = requireAuth;
        }

        @Deprecated
        public int getIcon() {
            return this.icon;
        }

        public IconCompat getIconCompat() {
            if (this.mIcon == null && this.icon != 0) {
                this.mIcon = IconCompat.createWithResource((Resources) null, "", this.icon);
            }
            return this.mIcon;
        }

        public CharSequence getTitle() {
            return this.title;
        }

        public PendingIntent getActionIntent() {
            return this.actionIntent;
        }

        public Bundle getExtras() {
            return this.mExtras;
        }

        public boolean getAllowGeneratedReplies() {
            return this.mAllowGeneratedReplies;
        }

        public boolean isAuthenticationRequired() {
            return this.mAuthenticationRequired;
        }

        public RemoteInput[] getRemoteInputs() {
            return this.mRemoteInputs;
        }

        public int getSemanticAction() {
            return this.mSemanticAction;
        }

        public boolean isContextual() {
            return this.mIsContextual;
        }

        public RemoteInput[] getDataOnlyRemoteInputs() {
            return this.mDataOnlyRemoteInputs;
        }

        public boolean getShowsUserInterface() {
            return this.mShowsUserInterface;
        }

        public static final class Builder {
            private boolean mAllowGeneratedReplies;
            private boolean mAuthenticationRequired;
            private final Bundle mExtras;
            private final IconCompat mIcon;
            private final PendingIntent mIntent;
            private boolean mIsContextual;
            private ArrayList<RemoteInput> mRemoteInputs;
            private int mSemanticAction;
            private boolean mShowsUserInterface;
            private final CharSequence mTitle;

            public static Builder fromAndroidAction(Notification.Action action) {
                Builder builder;
                if (Api23Impl.getIcon(action) != null) {
                    builder = new Builder(IconCompat.createFromIconOrNullIfZeroResId(Api23Impl.getIcon(action)), action.title, action.actionIntent);
                } else {
                    builder = new Builder(action.icon, action.title, action.actionIntent);
                }
                RemoteInput[] remoteInputs = Api20Impl.getRemoteInputs(action);
                if (!(remoteInputs == null || remoteInputs.length == 0)) {
                    for (RemoteInput remoteInput : remoteInputs) {
                        builder.addRemoteInput(RemoteInput.fromPlatform(remoteInput));
                    }
                }
                builder.mAllowGeneratedReplies = Api24Impl.getAllowGeneratedReplies(action);
                if (Build.VERSION.SDK_INT >= 28) {
                    builder.setSemanticAction(Api28Impl.getSemanticAction(action));
                }
                if (Build.VERSION.SDK_INT >= 29) {
                    builder.setContextual(Api29Impl.isContextual(action));
                }
                if (Build.VERSION.SDK_INT >= 31) {
                    builder.setAuthenticationRequired(Api31Impl.isAuthenticationRequired(action));
                }
                builder.addExtras(Api20Impl.getExtras(action));
                return builder;
            }

            public Builder(IconCompat icon, CharSequence title, PendingIntent intent) {
                this(icon, title, intent, new Bundle(), (RemoteInput[]) null, true, 0, true, false, false);
            }

            /* JADX INFO: this call moved to the top of the method (can break code semantics) */
            public Builder(int icon, CharSequence title, PendingIntent intent) {
                this(icon != 0 ? IconCompat.createWithResource((Resources) null, "", icon) : null, title, intent, new Bundle(), (RemoteInput[]) null, true, 0, true, false, false);
            }

            public Builder(Action action) {
                this(action.getIconCompat(), action.title, action.actionIntent, new Bundle(action.mExtras), action.getRemoteInputs(), action.getAllowGeneratedReplies(), action.getSemanticAction(), action.mShowsUserInterface, action.isContextual(), action.isAuthenticationRequired());
            }

            private Builder(IconCompat icon, CharSequence title, PendingIntent intent, Bundle extras, RemoteInput[] remoteInputs, boolean allowGeneratedReplies, int semanticAction, boolean showsUserInterface, boolean isContextual, boolean authRequired) {
                ArrayList<RemoteInput> arrayList;
                this.mAllowGeneratedReplies = true;
                this.mShowsUserInterface = true;
                this.mIcon = icon;
                this.mTitle = Builder.limitCharSequenceLength(title);
                this.mIntent = intent;
                this.mExtras = extras;
                if (remoteInputs == null) {
                    arrayList = null;
                } else {
                    arrayList = new ArrayList<>(Arrays.asList(remoteInputs));
                }
                this.mRemoteInputs = arrayList;
                this.mAllowGeneratedReplies = allowGeneratedReplies;
                this.mSemanticAction = semanticAction;
                this.mShowsUserInterface = showsUserInterface;
                this.mIsContextual = isContextual;
                this.mAuthenticationRequired = authRequired;
            }

            public Builder addExtras(Bundle extras) {
                if (extras != null) {
                    this.mExtras.putAll(extras);
                }
                return this;
            }

            public Bundle getExtras() {
                return this.mExtras;
            }

            public Builder addRemoteInput(RemoteInput remoteInput) {
                if (this.mRemoteInputs == null) {
                    this.mRemoteInputs = new ArrayList<>();
                }
                if (remoteInput != null) {
                    this.mRemoteInputs.add(remoteInput);
                }
                return this;
            }

            public Builder setAllowGeneratedReplies(boolean allowGeneratedReplies) {
                this.mAllowGeneratedReplies = allowGeneratedReplies;
                return this;
            }

            public Builder setSemanticAction(int semanticAction) {
                this.mSemanticAction = semanticAction;
                return this;
            }

            public Builder setContextual(boolean isContextual) {
                this.mIsContextual = isContextual;
                return this;
            }

            public Builder setAuthenticationRequired(boolean authenticationRequired) {
                this.mAuthenticationRequired = authenticationRequired;
                return this;
            }

            public Builder setShowsUserInterface(boolean showsUserInterface) {
                this.mShowsUserInterface = showsUserInterface;
                return this;
            }

            public Builder extend(Extender extender) {
                extender.extend(this);
                return this;
            }

            private void checkContextualActionNullFields() {
                if (this.mIsContextual && this.mIntent == null) {
                    throw new NullPointerException("Contextual Actions must contain a valid PendingIntent");
                }
            }

            /* JADX WARNING: type inference failed for: r3v6, types: [java.lang.Object[]] */
            /* JADX WARNING: Multi-variable type inference failed */
            /* Code decompiled incorrectly, please refer to instructions dump. */
            public androidx.core.app.NotificationCompat.Action build() {
                /*
                    r17 = this;
                    r0 = r17
                    r17.checkContextualActionNullFields()
                    java.util.ArrayList r1 = new java.util.ArrayList
                    r1.<init>()
                    java.util.ArrayList r2 = new java.util.ArrayList
                    r2.<init>()
                    java.util.ArrayList<androidx.core.app.RemoteInput> r3 = r0.mRemoteInputs
                    if (r3 == 0) goto L_0x0033
                    java.util.ArrayList<androidx.core.app.RemoteInput> r3 = r0.mRemoteInputs
                    java.util.Iterator r3 = r3.iterator()
                L_0x0019:
                    boolean r4 = r3.hasNext()
                    if (r4 == 0) goto L_0x0033
                    java.lang.Object r4 = r3.next()
                    androidx.core.app.RemoteInput r4 = (androidx.core.app.RemoteInput) r4
                    boolean r5 = r4.isDataOnly()
                    if (r5 == 0) goto L_0x002f
                    r1.add(r4)
                    goto L_0x0032
                L_0x002f:
                    r2.add(r4)
                L_0x0032:
                    goto L_0x0019
                L_0x0033:
                    boolean r3 = r1.isEmpty()
                    r4 = 0
                    if (r3 == 0) goto L_0x003c
                    r11 = r4
                    goto L_0x0049
                L_0x003c:
                    int r3 = r1.size()
                    androidx.core.app.RemoteInput[] r3 = new androidx.core.app.RemoteInput[r3]
                    java.lang.Object[] r3 = r1.toArray(r3)
                    androidx.core.app.RemoteInput[] r3 = (androidx.core.app.RemoteInput[]) r3
                    r11 = r3
                L_0x0049:
                    boolean r3 = r2.isEmpty()
                    if (r3 == 0) goto L_0x0050
                    goto L_0x005d
                L_0x0050:
                    int r3 = r2.size()
                    androidx.core.app.RemoteInput[] r3 = new androidx.core.app.RemoteInput[r3]
                    java.lang.Object[] r3 = r2.toArray(r3)
                    r4 = r3
                    androidx.core.app.RemoteInput[] r4 = (androidx.core.app.RemoteInput[]) r4
                L_0x005d:
                    r10 = r4
                    androidx.core.app.NotificationCompat$Action r3 = new androidx.core.app.NotificationCompat$Action
                    androidx.core.graphics.drawable.IconCompat r6 = r0.mIcon
                    java.lang.CharSequence r7 = r0.mTitle
                    android.app.PendingIntent r8 = r0.mIntent
                    android.os.Bundle r9 = r0.mExtras
                    boolean r12 = r0.mAllowGeneratedReplies
                    int r13 = r0.mSemanticAction
                    boolean r14 = r0.mShowsUserInterface
                    boolean r15 = r0.mIsContextual
                    boolean r4 = r0.mAuthenticationRequired
                    r5 = r3
                    r16 = r4
                    r5.<init>((androidx.core.graphics.drawable.IconCompat) r6, (java.lang.CharSequence) r7, (android.app.PendingIntent) r8, (android.os.Bundle) r9, (androidx.core.app.RemoteInput[]) r10, (androidx.core.app.RemoteInput[]) r11, (boolean) r12, (int) r13, (boolean) r14, (boolean) r15, (boolean) r16)
                    return r3
                */
                throw new UnsupportedOperationException("Method not decompiled: androidx.core.app.NotificationCompat.Action.Builder.build():androidx.core.app.NotificationCompat$Action");
            }

            static class Api20Impl {
                private Api20Impl() {
                }

                static RemoteInput[] getRemoteInputs(Notification.Action action) {
                    return action.getRemoteInputs();
                }

                static Bundle getExtras(Notification.Action action) {
                    return action.getExtras();
                }
            }

            static class Api23Impl {
                private Api23Impl() {
                }

                static Icon getIcon(Notification.Action action) {
                    return action.getIcon();
                }
            }

            static class Api24Impl {
                private Api24Impl() {
                }

                static boolean getAllowGeneratedReplies(Notification.Action action) {
                    return action.getAllowGeneratedReplies();
                }
            }

            static class Api28Impl {
                private Api28Impl() {
                }

                static int getSemanticAction(Notification.Action action) {
                    return action.getSemanticAction();
                }
            }

            static class Api29Impl {
                private Api29Impl() {
                }

                static boolean isContextual(Notification.Action action) {
                    return action.isContextual();
                }
            }

            static class Api31Impl {
                private Api31Impl() {
                }

                static boolean isAuthenticationRequired(Notification.Action action) {
                    return action.isAuthenticationRequired();
                }
            }
        }

        public static final class WearableExtender implements Extender {
            private static final int DEFAULT_FLAGS = 1;
            private static final String EXTRA_WEARABLE_EXTENSIONS = "android.wearable.EXTENSIONS";
            private static final int FLAG_AVAILABLE_OFFLINE = 1;
            private static final int FLAG_HINT_DISPLAY_INLINE = 4;
            private static final int FLAG_HINT_LAUNCHES_ACTIVITY = 2;
            private static final String KEY_CANCEL_LABEL = "cancelLabel";
            private static final String KEY_CONFIRM_LABEL = "confirmLabel";
            private static final String KEY_FLAGS = "flags";
            private static final String KEY_IN_PROGRESS_LABEL = "inProgressLabel";
            private CharSequence mCancelLabel;
            private CharSequence mConfirmLabel;
            private int mFlags = 1;
            private CharSequence mInProgressLabel;

            public WearableExtender() {
            }

            public WearableExtender(Action action) {
                Bundle wearableBundle = action.getExtras().getBundle(EXTRA_WEARABLE_EXTENSIONS);
                if (wearableBundle != null) {
                    this.mFlags = wearableBundle.getInt(KEY_FLAGS, 1);
                    this.mInProgressLabel = wearableBundle.getCharSequence(KEY_IN_PROGRESS_LABEL);
                    this.mConfirmLabel = wearableBundle.getCharSequence(KEY_CONFIRM_LABEL);
                    this.mCancelLabel = wearableBundle.getCharSequence(KEY_CANCEL_LABEL);
                }
            }

            public Builder extend(Builder builder) {
                Bundle wearableBundle = new Bundle();
                if (this.mFlags != 1) {
                    wearableBundle.putInt(KEY_FLAGS, this.mFlags);
                }
                if (this.mInProgressLabel != null) {
                    wearableBundle.putCharSequence(KEY_IN_PROGRESS_LABEL, this.mInProgressLabel);
                }
                if (this.mConfirmLabel != null) {
                    wearableBundle.putCharSequence(KEY_CONFIRM_LABEL, this.mConfirmLabel);
                }
                if (this.mCancelLabel != null) {
                    wearableBundle.putCharSequence(KEY_CANCEL_LABEL, this.mCancelLabel);
                }
                builder.getExtras().putBundle(EXTRA_WEARABLE_EXTENSIONS, wearableBundle);
                return builder;
            }

            public WearableExtender clone() {
                WearableExtender that = new WearableExtender();
                that.mFlags = this.mFlags;
                that.mInProgressLabel = this.mInProgressLabel;
                that.mConfirmLabel = this.mConfirmLabel;
                that.mCancelLabel = this.mCancelLabel;
                return that;
            }

            public WearableExtender setAvailableOffline(boolean availableOffline) {
                setFlag(1, availableOffline);
                return this;
            }

            public boolean isAvailableOffline() {
                return (this.mFlags & 1) != 0;
            }

            private void setFlag(int mask, boolean value) {
                if (value) {
                    this.mFlags |= mask;
                } else {
                    this.mFlags &= ~mask;
                }
            }

            @Deprecated
            public WearableExtender setInProgressLabel(CharSequence label) {
                this.mInProgressLabel = label;
                return this;
            }

            @Deprecated
            public CharSequence getInProgressLabel() {
                return this.mInProgressLabel;
            }

            @Deprecated
            public WearableExtender setConfirmLabel(CharSequence label) {
                this.mConfirmLabel = label;
                return this;
            }

            @Deprecated
            public CharSequence getConfirmLabel() {
                return this.mConfirmLabel;
            }

            @Deprecated
            public WearableExtender setCancelLabel(CharSequence label) {
                this.mCancelLabel = label;
                return this;
            }

            @Deprecated
            public CharSequence getCancelLabel() {
                return this.mCancelLabel;
            }

            public WearableExtender setHintLaunchesActivity(boolean hintLaunchesActivity) {
                setFlag(2, hintLaunchesActivity);
                return this;
            }

            public boolean getHintLaunchesActivity() {
                return (this.mFlags & 2) != 0;
            }

            public WearableExtender setHintDisplayActionInline(boolean hintDisplayInline) {
                setFlag(4, hintDisplayInline);
                return this;
            }

            public boolean getHintDisplayActionInline() {
                return (this.mFlags & 4) != 0;
            }
        }
    }

    public static final class WearableExtender implements Extender {
        private static final int DEFAULT_CONTENT_ICON_GRAVITY = 8388613;
        private static final int DEFAULT_FLAGS = 1;
        private static final int DEFAULT_GRAVITY = 80;
        private static final String EXTRA_WEARABLE_EXTENSIONS = "android.wearable.EXTENSIONS";
        private static final int FLAG_BIG_PICTURE_AMBIENT = 32;
        private static final int FLAG_CONTENT_INTENT_AVAILABLE_OFFLINE = 1;
        private static final int FLAG_HINT_AVOID_BACKGROUND_CLIPPING = 16;
        private static final int FLAG_HINT_CONTENT_INTENT_LAUNCHES_ACTIVITY = 64;
        private static final int FLAG_HINT_HIDE_ICON = 2;
        private static final int FLAG_HINT_SHOW_BACKGROUND_ONLY = 4;
        private static final int FLAG_START_SCROLL_BOTTOM = 8;
        private static final String KEY_ACTIONS = "actions";
        private static final String KEY_BACKGROUND = "background";
        private static final String KEY_BRIDGE_TAG = "bridgeTag";
        private static final String KEY_CONTENT_ACTION_INDEX = "contentActionIndex";
        private static final String KEY_CONTENT_ICON = "contentIcon";
        private static final String KEY_CONTENT_ICON_GRAVITY = "contentIconGravity";
        private static final String KEY_CUSTOM_CONTENT_HEIGHT = "customContentHeight";
        private static final String KEY_CUSTOM_SIZE_PRESET = "customSizePreset";
        private static final String KEY_DISMISSAL_ID = "dismissalId";
        private static final String KEY_DISPLAY_INTENT = "displayIntent";
        private static final String KEY_FLAGS = "flags";
        private static final String KEY_GRAVITY = "gravity";
        private static final String KEY_HINT_SCREEN_TIMEOUT = "hintScreenTimeout";
        private static final String KEY_PAGES = "pages";
        @Deprecated
        public static final int SCREEN_TIMEOUT_LONG = -1;
        @Deprecated
        public static final int SCREEN_TIMEOUT_SHORT = 0;
        @Deprecated
        public static final int SIZE_DEFAULT = 0;
        @Deprecated
        public static final int SIZE_FULL_SCREEN = 5;
        @Deprecated
        public static final int SIZE_LARGE = 4;
        @Deprecated
        public static final int SIZE_MEDIUM = 3;
        @Deprecated
        public static final int SIZE_SMALL = 2;
        @Deprecated
        public static final int SIZE_XSMALL = 1;
        public static final int UNSET_ACTION_INDEX = -1;
        private ArrayList<Action> mActions = new ArrayList<>();
        private Bitmap mBackground;
        private String mBridgeTag;
        private int mContentActionIndex = -1;
        private int mContentIcon;
        private int mContentIconGravity = 8388613;
        private int mCustomContentHeight;
        private int mCustomSizePreset = 0;
        private String mDismissalId;
        private PendingIntent mDisplayIntent;
        private int mFlags = 1;
        private int mGravity = DEFAULT_GRAVITY;
        private int mHintScreenTimeout;
        private ArrayList<Notification> mPages = new ArrayList<>();

        public WearableExtender() {
        }

        public WearableExtender(Notification notification) {
            Bundle wearableBundle;
            Bundle extras = NotificationCompat.getExtras(notification);
            if (extras != null) {
                wearableBundle = extras.getBundle(EXTRA_WEARABLE_EXTENSIONS);
            } else {
                wearableBundle = null;
            }
            if (wearableBundle != null) {
                ArrayList<Parcelable> parcelables = wearableBundle.getParcelableArrayList(KEY_ACTIONS);
                if (parcelables != null) {
                    Action[] actions = new Action[parcelables.size()];
                    for (int i = 0; i < actions.length; i++) {
                        actions[i] = Api20Impl.getActionCompatFromAction(parcelables, i);
                    }
                    Collections.addAll(this.mActions, actions);
                }
                this.mFlags = wearableBundle.getInt(KEY_FLAGS, 1);
                this.mDisplayIntent = (PendingIntent) wearableBundle.getParcelable(KEY_DISPLAY_INTENT);
                Notification[] pages = NotificationCompat.getNotificationArrayFromBundle(wearableBundle, KEY_PAGES);
                if (pages != null) {
                    Collections.addAll(this.mPages, pages);
                }
                this.mBackground = (Bitmap) wearableBundle.getParcelable(KEY_BACKGROUND);
                this.mContentIcon = wearableBundle.getInt(KEY_CONTENT_ICON);
                this.mContentIconGravity = wearableBundle.getInt(KEY_CONTENT_ICON_GRAVITY, 8388613);
                this.mContentActionIndex = wearableBundle.getInt(KEY_CONTENT_ACTION_INDEX, -1);
                this.mCustomSizePreset = wearableBundle.getInt(KEY_CUSTOM_SIZE_PRESET, 0);
                this.mCustomContentHeight = wearableBundle.getInt(KEY_CUSTOM_CONTENT_HEIGHT);
                this.mGravity = wearableBundle.getInt(KEY_GRAVITY, DEFAULT_GRAVITY);
                this.mHintScreenTimeout = wearableBundle.getInt(KEY_HINT_SCREEN_TIMEOUT);
                this.mDismissalId = wearableBundle.getString(KEY_DISMISSAL_ID);
                this.mBridgeTag = wearableBundle.getString(KEY_BRIDGE_TAG);
            }
        }

        public Builder extend(Builder builder) {
            Bundle wearableBundle = new Bundle();
            if (!this.mActions.isEmpty()) {
                ArrayList<Parcelable> parcelables = new ArrayList<>(this.mActions.size());
                Iterator<Action> it = this.mActions.iterator();
                while (it.hasNext()) {
                    parcelables.add(getActionFromActionCompat(it.next()));
                }
                wearableBundle.putParcelableArrayList(KEY_ACTIONS, parcelables);
            }
            if (this.mFlags != 1) {
                wearableBundle.putInt(KEY_FLAGS, this.mFlags);
            }
            if (this.mDisplayIntent != null) {
                wearableBundle.putParcelable(KEY_DISPLAY_INTENT, this.mDisplayIntent);
            }
            if (!this.mPages.isEmpty()) {
                wearableBundle.putParcelableArray(KEY_PAGES, (Parcelable[]) this.mPages.toArray(new Notification[this.mPages.size()]));
            }
            if (this.mBackground != null) {
                wearableBundle.putParcelable(KEY_BACKGROUND, this.mBackground);
            }
            if (this.mContentIcon != 0) {
                wearableBundle.putInt(KEY_CONTENT_ICON, this.mContentIcon);
            }
            if (this.mContentIconGravity != 8388613) {
                wearableBundle.putInt(KEY_CONTENT_ICON_GRAVITY, this.mContentIconGravity);
            }
            if (this.mContentActionIndex != -1) {
                wearableBundle.putInt(KEY_CONTENT_ACTION_INDEX, this.mContentActionIndex);
            }
            if (this.mCustomSizePreset != 0) {
                wearableBundle.putInt(KEY_CUSTOM_SIZE_PRESET, this.mCustomSizePreset);
            }
            if (this.mCustomContentHeight != 0) {
                wearableBundle.putInt(KEY_CUSTOM_CONTENT_HEIGHT, this.mCustomContentHeight);
            }
            if (this.mGravity != DEFAULT_GRAVITY) {
                wearableBundle.putInt(KEY_GRAVITY, this.mGravity);
            }
            if (this.mHintScreenTimeout != 0) {
                wearableBundle.putInt(KEY_HINT_SCREEN_TIMEOUT, this.mHintScreenTimeout);
            }
            if (this.mDismissalId != null) {
                wearableBundle.putString(KEY_DISMISSAL_ID, this.mDismissalId);
            }
            if (this.mBridgeTag != null) {
                wearableBundle.putString(KEY_BRIDGE_TAG, this.mBridgeTag);
            }
            builder.getExtras().putBundle(EXTRA_WEARABLE_EXTENSIONS, wearableBundle);
            return builder;
        }

        private static Notification.Action getActionFromActionCompat(Action actionCompat) {
            Bundle actionExtras;
            IconCompat iconCompat = actionCompat.getIconCompat();
            Notification.Action.Builder actionBuilder = Api23Impl.createBuilder(iconCompat == null ? null : iconCompat.toIcon(), actionCompat.getTitle(), actionCompat.getActionIntent());
            if (actionCompat.getExtras() != null) {
                actionExtras = new Bundle(actionCompat.getExtras());
            } else {
                actionExtras = new Bundle();
            }
            actionExtras.putBoolean("android.support.allowGeneratedReplies", actionCompat.getAllowGeneratedReplies());
            Api24Impl.setAllowGeneratedReplies(actionBuilder, actionCompat.getAllowGeneratedReplies());
            if (Build.VERSION.SDK_INT >= 31) {
                Api31Impl.setAuthenticationRequired(actionBuilder, actionCompat.isAuthenticationRequired());
            }
            Api20Impl.addExtras(actionBuilder, actionExtras);
            RemoteInput[] remoteInputCompats = actionCompat.getRemoteInputs();
            if (remoteInputCompats != null) {
                for (RemoteInput remoteInput : RemoteInput.fromCompat(remoteInputCompats)) {
                    Api20Impl.addRemoteInput(actionBuilder, remoteInput);
                }
            }
            return Api20Impl.build(actionBuilder);
        }

        public WearableExtender clone() {
            WearableExtender that = new WearableExtender();
            that.mActions = new ArrayList<>(this.mActions);
            that.mFlags = this.mFlags;
            that.mDisplayIntent = this.mDisplayIntent;
            that.mPages = new ArrayList<>(this.mPages);
            that.mBackground = this.mBackground;
            that.mContentIcon = this.mContentIcon;
            that.mContentIconGravity = this.mContentIconGravity;
            that.mContentActionIndex = this.mContentActionIndex;
            that.mCustomSizePreset = this.mCustomSizePreset;
            that.mCustomContentHeight = this.mCustomContentHeight;
            that.mGravity = this.mGravity;
            that.mHintScreenTimeout = this.mHintScreenTimeout;
            that.mDismissalId = this.mDismissalId;
            that.mBridgeTag = this.mBridgeTag;
            return that;
        }

        public WearableExtender addAction(Action action) {
            this.mActions.add(action);
            return this;
        }

        public WearableExtender addActions(List<Action> actions) {
            this.mActions.addAll(actions);
            return this;
        }

        public WearableExtender clearActions() {
            this.mActions.clear();
            return this;
        }

        public List<Action> getActions() {
            return this.mActions;
        }

        @Deprecated
        public WearableExtender setDisplayIntent(PendingIntent intent) {
            this.mDisplayIntent = intent;
            return this;
        }

        @Deprecated
        public PendingIntent getDisplayIntent() {
            return this.mDisplayIntent;
        }

        @Deprecated
        public WearableExtender addPage(Notification page) {
            this.mPages.add(page);
            return this;
        }

        @Deprecated
        public WearableExtender addPages(List<Notification> pages) {
            this.mPages.addAll(pages);
            return this;
        }

        @Deprecated
        public WearableExtender clearPages() {
            this.mPages.clear();
            return this;
        }

        @Deprecated
        public List<Notification> getPages() {
            return this.mPages;
        }

        @Deprecated
        public WearableExtender setBackground(Bitmap background) {
            this.mBackground = background;
            return this;
        }

        @Deprecated
        public Bitmap getBackground() {
            return this.mBackground;
        }

        @Deprecated
        public WearableExtender setContentIcon(int icon) {
            this.mContentIcon = icon;
            return this;
        }

        @Deprecated
        public int getContentIcon() {
            return this.mContentIcon;
        }

        @Deprecated
        public WearableExtender setContentIconGravity(int contentIconGravity) {
            this.mContentIconGravity = contentIconGravity;
            return this;
        }

        @Deprecated
        public int getContentIconGravity() {
            return this.mContentIconGravity;
        }

        public WearableExtender setContentAction(int actionIndex) {
            this.mContentActionIndex = actionIndex;
            return this;
        }

        public int getContentAction() {
            return this.mContentActionIndex;
        }

        @Deprecated
        public WearableExtender setGravity(int gravity) {
            this.mGravity = gravity;
            return this;
        }

        @Deprecated
        public int getGravity() {
            return this.mGravity;
        }

        @Deprecated
        public WearableExtender setCustomSizePreset(int sizePreset) {
            this.mCustomSizePreset = sizePreset;
            return this;
        }

        @Deprecated
        public int getCustomSizePreset() {
            return this.mCustomSizePreset;
        }

        @Deprecated
        public WearableExtender setCustomContentHeight(int height) {
            this.mCustomContentHeight = height;
            return this;
        }

        @Deprecated
        public int getCustomContentHeight() {
            return this.mCustomContentHeight;
        }

        public WearableExtender setStartScrollBottom(boolean startScrollBottom) {
            setFlag(8, startScrollBottom);
            return this;
        }

        public boolean getStartScrollBottom() {
            return (this.mFlags & 8) != 0;
        }

        public WearableExtender setContentIntentAvailableOffline(boolean contentIntentAvailableOffline) {
            setFlag(1, contentIntentAvailableOffline);
            return this;
        }

        public boolean getContentIntentAvailableOffline() {
            return (this.mFlags & 1) != 0;
        }

        @Deprecated
        public WearableExtender setHintHideIcon(boolean hintHideIcon) {
            setFlag(2, hintHideIcon);
            return this;
        }

        @Deprecated
        public boolean getHintHideIcon() {
            return (this.mFlags & 2) != 0;
        }

        @Deprecated
        public WearableExtender setHintShowBackgroundOnly(boolean hintShowBackgroundOnly) {
            setFlag(4, hintShowBackgroundOnly);
            return this;
        }

        @Deprecated
        public boolean getHintShowBackgroundOnly() {
            return (this.mFlags & 4) != 0;
        }

        @Deprecated
        public WearableExtender setHintAvoidBackgroundClipping(boolean hintAvoidBackgroundClipping) {
            setFlag(16, hintAvoidBackgroundClipping);
            return this;
        }

        @Deprecated
        public boolean getHintAvoidBackgroundClipping() {
            return (this.mFlags & 16) != 0;
        }

        @Deprecated
        public WearableExtender setHintScreenTimeout(int timeout) {
            this.mHintScreenTimeout = timeout;
            return this;
        }

        @Deprecated
        public int getHintScreenTimeout() {
            return this.mHintScreenTimeout;
        }

        @Deprecated
        public WearableExtender setHintAmbientBigPicture(boolean hintAmbientBigPicture) {
            setFlag(32, hintAmbientBigPicture);
            return this;
        }

        @Deprecated
        public boolean getHintAmbientBigPicture() {
            return (this.mFlags & 32) != 0;
        }

        public WearableExtender setHintContentIntentLaunchesActivity(boolean hintContentIntentLaunchesActivity) {
            setFlag(64, hintContentIntentLaunchesActivity);
            return this;
        }

        public boolean getHintContentIntentLaunchesActivity() {
            return (this.mFlags & 64) != 0;
        }

        public WearableExtender setDismissalId(String dismissalId) {
            this.mDismissalId = dismissalId;
            return this;
        }

        public String getDismissalId() {
            return this.mDismissalId;
        }

        public WearableExtender setBridgeTag(String bridgeTag) {
            this.mBridgeTag = bridgeTag;
            return this;
        }

        public String getBridgeTag() {
            return this.mBridgeTag;
        }

        private void setFlag(int mask, boolean value) {
            if (value) {
                this.mFlags |= mask;
            } else {
                this.mFlags &= ~mask;
            }
        }

        static class Api20Impl {
            private Api20Impl() {
            }

            static Notification.Action.Builder createBuilder(int icon, CharSequence title, PendingIntent intent) {
                return new Notification.Action.Builder(icon, title, intent);
            }

            static Notification.Action.Builder addExtras(Notification.Action.Builder builder, Bundle extras) {
                return builder.addExtras(extras);
            }

            static Notification.Action.Builder addRemoteInput(Notification.Action.Builder builder, RemoteInput remoteInput) {
                return builder.addRemoteInput(remoteInput);
            }

            static Notification.Action build(Notification.Action.Builder builder) {
                return builder.build();
            }

            public static Action getActionCompatFromAction(ArrayList<Parcelable> parcelables, int i) {
                return NotificationCompat.getActionCompatFromAction((Notification.Action) parcelables.get(i));
            }
        }

        static class Api23Impl {
            private Api23Impl() {
            }

            static Notification.Action.Builder createBuilder(Icon icon, CharSequence title, PendingIntent intent) {
                return new Notification.Action.Builder(icon, title, intent);
            }
        }

        static class Api24Impl {
            private Api24Impl() {
            }

            static Notification.Action.Builder setAllowGeneratedReplies(Notification.Action.Builder builder, boolean allowGeneratedReplies) {
                return builder.setAllowGeneratedReplies(allowGeneratedReplies);
            }
        }

        static class Api31Impl {
            private Api31Impl() {
            }

            static Notification.Action.Builder setAuthenticationRequired(Notification.Action.Builder builder, boolean authenticationRequired) {
                return builder.setAuthenticationRequired(authenticationRequired);
            }
        }
    }

    public static final class CarExtender implements Extender {
        static final String EXTRA_CAR_EXTENDER = "android.car.EXTENSIONS";
        private static final String EXTRA_COLOR = "app_color";
        private static final String EXTRA_CONVERSATION = "car_conversation";
        static final String EXTRA_INVISIBLE_ACTIONS = "invisible_actions";
        private static final String EXTRA_LARGE_ICON = "large_icon";
        private static final String KEY_AUTHOR = "author";
        private static final String KEY_MESSAGES = "messages";
        private static final String KEY_ON_READ = "on_read";
        private static final String KEY_ON_REPLY = "on_reply";
        private static final String KEY_PARTICIPANTS = "participants";
        private static final String KEY_REMOTE_INPUT = "remote_input";
        private static final String KEY_TEXT = "text";
        private static final String KEY_TIMESTAMP = "timestamp";
        private int mColor = 0;
        private Bitmap mLargeIcon;
        private UnreadConversation mUnreadConversation;

        public CarExtender() {
        }

        public CarExtender(Notification notification) {
            Bundle carBundle = NotificationCompat.getExtras(notification) == null ? null : NotificationCompat.getExtras(notification).getBundle(EXTRA_CAR_EXTENDER);
            if (carBundle != null) {
                this.mLargeIcon = (Bitmap) carBundle.getParcelable(EXTRA_LARGE_ICON);
                this.mColor = carBundle.getInt(EXTRA_COLOR, 0);
                this.mUnreadConversation = getUnreadConversationFromBundle(carBundle.getBundle(EXTRA_CONVERSATION));
            }
        }

        private static UnreadConversation getUnreadConversationFromBundle(Bundle b) {
            RemoteInput remoteInputCompat;
            int i;
            Bundle bundle = b;
            if (bundle == null) {
                return null;
            }
            Parcelable[] parcelableMessages = bundle.getParcelableArray(KEY_MESSAGES);
            String[] messages = null;
            if (parcelableMessages != null) {
                String[] tmp = new String[parcelableMessages.length];
                boolean success = true;
                int i2 = 0;
                while (true) {
                    if (i2 >= tmp.length) {
                        break;
                    } else if (!(parcelableMessages[i2] instanceof Bundle)) {
                        success = false;
                        break;
                    } else {
                        tmp[i2] = ((Bundle) parcelableMessages[i2]).getString(KEY_TEXT);
                        if (tmp[i2] == null) {
                            success = false;
                            break;
                        }
                        i2++;
                    }
                }
                if (!success) {
                    return null;
                }
                messages = tmp;
            }
            PendingIntent onRead = (PendingIntent) bundle.getParcelable(KEY_ON_READ);
            PendingIntent onReply = (PendingIntent) bundle.getParcelable(KEY_ON_REPLY);
            RemoteInput remoteInput = (RemoteInput) bundle.getParcelable(KEY_REMOTE_INPUT);
            String[] participants = bundle.getStringArray(KEY_PARTICIPANTS);
            if (participants == null || participants.length != 1) {
                return null;
            }
            if (remoteInput != null) {
                String resultKey = Api20Impl.getResultKey(remoteInput);
                CharSequence label = Api20Impl.getLabel(remoteInput);
                CharSequence[] choices = Api20Impl.getChoices(remoteInput);
                boolean allowFreeFormInput = Api20Impl.getAllowFreeFormInput(remoteInput);
                if (Build.VERSION.SDK_INT >= 29) {
                    i = Api29Impl.getEditChoicesBeforeSending(remoteInput);
                } else {
                    i = 0;
                }
                remoteInputCompat = new RemoteInput(resultKey, label, choices, allowFreeFormInput, i, Api20Impl.getExtras(remoteInput), (Set<String>) null);
            } else {
                remoteInputCompat = null;
            }
            return new UnreadConversation(messages, remoteInputCompat, onReply, onRead, participants, bundle.getLong(KEY_TIMESTAMP));
        }

        private static Bundle getBundleForUnreadConversation(UnreadConversation uc) {
            Bundle b = new Bundle();
            String author = null;
            if (uc.getParticipants() != null && uc.getParticipants().length > 1) {
                author = uc.getParticipants()[0];
            }
            Parcelable[] messages = new Parcelable[uc.getMessages().length];
            for (int i = 0; i < messages.length; i++) {
                Bundle m = new Bundle();
                m.putString(KEY_TEXT, uc.getMessages()[i]);
                m.putString(KEY_AUTHOR, author);
                messages[i] = m;
            }
            b.putParcelableArray(KEY_MESSAGES, messages);
            RemoteInput remoteInputCompat = uc.getRemoteInput();
            if (remoteInputCompat != null) {
                RemoteInput.Builder builder = Api20Impl.createBuilder(remoteInputCompat.getResultKey());
                Api20Impl.setLabel(builder, remoteInputCompat.getLabel());
                Api20Impl.setChoices(builder, remoteInputCompat.getChoices());
                Api20Impl.setAllowFreeFormInput(builder, remoteInputCompat.getAllowFreeFormInput());
                Api20Impl.addExtras(builder, remoteInputCompat.getExtras());
                b.putParcelable(KEY_REMOTE_INPUT, Api20Impl.castToParcelable(Api20Impl.build(builder)));
            }
            b.putParcelable(KEY_ON_REPLY, uc.getReplyPendingIntent());
            b.putParcelable(KEY_ON_READ, uc.getReadPendingIntent());
            b.putStringArray(KEY_PARTICIPANTS, uc.getParticipants());
            b.putLong(KEY_TIMESTAMP, uc.getLatestTimestamp());
            return b;
        }

        public Builder extend(Builder builder) {
            Bundle carExtensions = new Bundle();
            if (this.mLargeIcon != null) {
                carExtensions.putParcelable(EXTRA_LARGE_ICON, this.mLargeIcon);
            }
            if (this.mColor != 0) {
                carExtensions.putInt(EXTRA_COLOR, this.mColor);
            }
            if (this.mUnreadConversation != null) {
                carExtensions.putBundle(EXTRA_CONVERSATION, getBundleForUnreadConversation(this.mUnreadConversation));
            }
            builder.getExtras().putBundle(EXTRA_CAR_EXTENDER, carExtensions);
            return builder;
        }

        public CarExtender setColor(int color) {
            this.mColor = color;
            return this;
        }

        public int getColor() {
            return this.mColor;
        }

        public CarExtender setLargeIcon(Bitmap largeIcon) {
            this.mLargeIcon = largeIcon;
            return this;
        }

        public Bitmap getLargeIcon() {
            return this.mLargeIcon;
        }

        @Deprecated
        public CarExtender setUnreadConversation(UnreadConversation unreadConversation) {
            this.mUnreadConversation = unreadConversation;
            return this;
        }

        @Deprecated
        public UnreadConversation getUnreadConversation() {
            return this.mUnreadConversation;
        }

        @Deprecated
        public static class UnreadConversation {
            private final long mLatestTimestamp;
            private final String[] mMessages;
            private final String[] mParticipants;
            private final PendingIntent mReadPendingIntent;
            private final RemoteInput mRemoteInput;
            private final PendingIntent mReplyPendingIntent;

            UnreadConversation(String[] messages, RemoteInput remoteInput, PendingIntent replyPendingIntent, PendingIntent readPendingIntent, String[] participants, long latestTimestamp) {
                this.mMessages = messages;
                this.mRemoteInput = remoteInput;
                this.mReadPendingIntent = readPendingIntent;
                this.mReplyPendingIntent = replyPendingIntent;
                this.mParticipants = participants;
                this.mLatestTimestamp = latestTimestamp;
            }

            public String[] getMessages() {
                return this.mMessages;
            }

            public RemoteInput getRemoteInput() {
                return this.mRemoteInput;
            }

            public PendingIntent getReplyPendingIntent() {
                return this.mReplyPendingIntent;
            }

            public PendingIntent getReadPendingIntent() {
                return this.mReadPendingIntent;
            }

            public String[] getParticipants() {
                return this.mParticipants;
            }

            public String getParticipant() {
                if (this.mParticipants.length > 0) {
                    return this.mParticipants[0];
                }
                return null;
            }

            public long getLatestTimestamp() {
                return this.mLatestTimestamp;
            }

            public static class Builder {
                private long mLatestTimestamp;
                private final List<String> mMessages = new ArrayList();
                private final String mParticipant;
                private PendingIntent mReadPendingIntent;
                private RemoteInput mRemoteInput;
                private PendingIntent mReplyPendingIntent;

                public Builder(String name) {
                    this.mParticipant = name;
                }

                public Builder addMessage(String message) {
                    if (message != null) {
                        this.mMessages.add(message);
                    }
                    return this;
                }

                public Builder setReplyAction(PendingIntent pendingIntent, RemoteInput remoteInput) {
                    this.mRemoteInput = remoteInput;
                    this.mReplyPendingIntent = pendingIntent;
                    return this;
                }

                public Builder setReadPendingIntent(PendingIntent pendingIntent) {
                    this.mReadPendingIntent = pendingIntent;
                    return this;
                }

                public Builder setLatestTimestamp(long timestamp) {
                    this.mLatestTimestamp = timestamp;
                    return this;
                }

                public UnreadConversation build() {
                    String[] participants = {this.mParticipant};
                    return new UnreadConversation((String[]) this.mMessages.toArray(new String[this.mMessages.size()]), this.mRemoteInput, this.mReplyPendingIntent, this.mReadPendingIntent, participants, this.mLatestTimestamp);
                }
            }
        }

        static class Api20Impl {
            private Api20Impl() {
            }

            static RemoteInput.Builder createBuilder(String resultKey) {
                return new RemoteInput.Builder(resultKey);
            }

            static RemoteInput build(RemoteInput.Builder builder) {
                return builder.build();
            }

            static String getResultKey(RemoteInput remoteInput) {
                return remoteInput.getResultKey();
            }

            static CharSequence[] getChoices(RemoteInput remoteInput) {
                return remoteInput.getChoices();
            }

            static RemoteInput.Builder setChoices(RemoteInput.Builder builder, CharSequence[] choices) {
                return builder.setChoices(choices);
            }

            static CharSequence getLabel(RemoteInput remoteInput) {
                return remoteInput.getLabel();
            }

            static RemoteInput.Builder setLabel(RemoteInput.Builder builder, CharSequence label) {
                return builder.setLabel(label);
            }

            static boolean getAllowFreeFormInput(RemoteInput remoteInput) {
                return remoteInput.getAllowFreeFormInput();
            }

            static RemoteInput.Builder setAllowFreeFormInput(RemoteInput.Builder builder, boolean allowFreeFormInput) {
                return builder.setAllowFreeFormInput(allowFreeFormInput);
            }

            static Bundle getExtras(RemoteInput remoteInput) {
                return remoteInput.getExtras();
            }

            static RemoteInput.Builder addExtras(RemoteInput.Builder builder, Bundle extras) {
                return builder.addExtras(extras);
            }

            static Parcelable castToParcelable(RemoteInput remoteInput) {
                return remoteInput;
            }
        }

        static class Api29Impl {
            private Api29Impl() {
            }

            static int getEditChoicesBeforeSending(RemoteInput remoteInput) {
                return remoteInput.getEditChoicesBeforeSending();
            }
        }
    }

    public static final class TvExtender implements Extender {
        static final String EXTRA_CHANNEL_ID = "channel_id";
        static final String EXTRA_CONTENT_INTENT = "content_intent";
        static final String EXTRA_DELETE_INTENT = "delete_intent";
        private static final String EXTRA_FLAGS = "flags";
        static final String EXTRA_SUPPRESS_SHOW_OVER_APPS = "suppressShowOverApps";
        static final String EXTRA_TV_EXTENDER = "android.tv.EXTENSIONS";
        private static final int FLAG_AVAILABLE_ON_TV = 1;
        private static final String TAG = "TvExtender";
        private String mChannelId;
        private PendingIntent mContentIntent;
        private PendingIntent mDeleteIntent;
        private int mFlags;
        private boolean mSuppressShowOverApps;

        public TvExtender() {
            this.mFlags = 1;
        }

        public TvExtender(Notification notif) {
            if (Build.VERSION.SDK_INT >= 26) {
                Bundle tvBundle = notif.extras == null ? null : notif.extras.getBundle(EXTRA_TV_EXTENDER);
                if (tvBundle != null) {
                    this.mFlags = tvBundle.getInt(EXTRA_FLAGS);
                    this.mChannelId = tvBundle.getString(EXTRA_CHANNEL_ID);
                    this.mSuppressShowOverApps = tvBundle.getBoolean(EXTRA_SUPPRESS_SHOW_OVER_APPS);
                    this.mContentIntent = (PendingIntent) tvBundle.getParcelable(EXTRA_CONTENT_INTENT);
                    this.mDeleteIntent = (PendingIntent) tvBundle.getParcelable(EXTRA_DELETE_INTENT);
                }
            }
        }

        public Builder extend(Builder builder) {
            if (Build.VERSION.SDK_INT < 26) {
                return builder;
            }
            Bundle tvExtensions = new Bundle();
            tvExtensions.putInt(EXTRA_FLAGS, this.mFlags);
            tvExtensions.putString(EXTRA_CHANNEL_ID, this.mChannelId);
            tvExtensions.putBoolean(EXTRA_SUPPRESS_SHOW_OVER_APPS, this.mSuppressShowOverApps);
            if (this.mContentIntent != null) {
                tvExtensions.putParcelable(EXTRA_CONTENT_INTENT, this.mContentIntent);
            }
            if (this.mDeleteIntent != null) {
                tvExtensions.putParcelable(EXTRA_DELETE_INTENT, this.mDeleteIntent);
            }
            builder.getExtras().putBundle(EXTRA_TV_EXTENDER, tvExtensions);
            return builder;
        }

        public boolean isAvailableOnTv() {
            return (this.mFlags & 1) != 0;
        }

        public TvExtender setChannelId(String channelId) {
            this.mChannelId = channelId;
            return this;
        }

        public String getChannelId() {
            return this.mChannelId;
        }

        public TvExtender setContentIntent(PendingIntent intent) {
            this.mContentIntent = intent;
            return this;
        }

        public PendingIntent getContentIntent() {
            return this.mContentIntent;
        }

        public TvExtender setDeleteIntent(PendingIntent intent) {
            this.mDeleteIntent = intent;
            return this;
        }

        public PendingIntent getDeleteIntent() {
            return this.mDeleteIntent;
        }

        public TvExtender setSuppressShowOverApps(boolean suppress) {
            this.mSuppressShowOverApps = suppress;
            return this;
        }

        public boolean isSuppressShowOverApps() {
            return this.mSuppressShowOverApps;
        }
    }

    public static final class BubbleMetadata {
        private static final int FLAG_AUTO_EXPAND_BUBBLE = 1;
        private static final int FLAG_SUPPRESS_NOTIFICATION = 2;
        private PendingIntent mDeleteIntent;
        private int mDesiredHeight;
        private int mDesiredHeightResId;
        private int mFlags;
        private IconCompat mIcon;
        private PendingIntent mPendingIntent;
        private String mShortcutId;

        private BubbleMetadata(PendingIntent expandIntent, PendingIntent deleteIntent, IconCompat icon, int height, int heightResId, int flags, String shortcutId) {
            this.mPendingIntent = expandIntent;
            this.mIcon = icon;
            this.mDesiredHeight = height;
            this.mDesiredHeightResId = heightResId;
            this.mDeleteIntent = deleteIntent;
            this.mFlags = flags;
            this.mShortcutId = shortcutId;
        }

        public PendingIntent getIntent() {
            return this.mPendingIntent;
        }

        public String getShortcutId() {
            return this.mShortcutId;
        }

        public PendingIntent getDeleteIntent() {
            return this.mDeleteIntent;
        }

        public IconCompat getIcon() {
            return this.mIcon;
        }

        public int getDesiredHeight() {
            return this.mDesiredHeight;
        }

        public int getDesiredHeightResId() {
            return this.mDesiredHeightResId;
        }

        public boolean getAutoExpandBubble() {
            return (this.mFlags & 1) != 0;
        }

        public boolean isNotificationSuppressed() {
            return (this.mFlags & 2) != 0;
        }

        public void setFlags(int flags) {
            this.mFlags = flags;
        }

        public static Notification.BubbleMetadata toPlatform(BubbleMetadata compatMetadata) {
            if (compatMetadata == null) {
                return null;
            }
            if (Build.VERSION.SDK_INT >= 30) {
                return Api30Impl.toPlatform(compatMetadata);
            }
            if (Build.VERSION.SDK_INT == 29) {
                return Api29Impl.toPlatform(compatMetadata);
            }
            return null;
        }

        public static BubbleMetadata fromPlatform(Notification.BubbleMetadata platformMetadata) {
            if (platformMetadata == null) {
                return null;
            }
            if (Build.VERSION.SDK_INT >= 30) {
                return Api30Impl.fromPlatform(platformMetadata);
            }
            if (Build.VERSION.SDK_INT == 29) {
                return Api29Impl.fromPlatform(platformMetadata);
            }
            return null;
        }

        public static final class Builder {
            private PendingIntent mDeleteIntent;
            private int mDesiredHeight;
            private int mDesiredHeightResId;
            private int mFlags;
            private IconCompat mIcon;
            private PendingIntent mPendingIntent;
            private String mShortcutId;

            @Deprecated
            public Builder() {
            }

            public Builder(String shortcutId) {
                if (!TextUtils.isEmpty(shortcutId)) {
                    this.mShortcutId = shortcutId;
                    return;
                }
                throw new NullPointerException("Bubble requires a non-null shortcut id");
            }

            public Builder(PendingIntent intent, IconCompat icon) {
                if (intent == null) {
                    throw new NullPointerException("Bubble requires non-null pending intent");
                } else if (icon != null) {
                    this.mPendingIntent = intent;
                    this.mIcon = icon;
                } else {
                    throw new NullPointerException("Bubbles require non-null icon");
                }
            }

            public Builder setIntent(PendingIntent intent) {
                if (this.mShortcutId != null) {
                    throw new IllegalStateException("Created as a shortcut bubble, cannot set a PendingIntent. Consider using BubbleMetadata.Builder(PendingIntent,Icon) instead.");
                } else if (intent != null) {
                    this.mPendingIntent = intent;
                    return this;
                } else {
                    throw new NullPointerException("Bubble requires non-null pending intent");
                }
            }

            public Builder setIcon(IconCompat icon) {
                if (this.mShortcutId != null) {
                    throw new IllegalStateException("Created as a shortcut bubble, cannot set an Icon. Consider using BubbleMetadata.Builder(PendingIntent,Icon) instead.");
                } else if (icon != null) {
                    this.mIcon = icon;
                    return this;
                } else {
                    throw new NullPointerException("Bubbles require non-null icon");
                }
            }

            public Builder setDesiredHeight(int height) {
                this.mDesiredHeight = Math.max(height, 0);
                this.mDesiredHeightResId = 0;
                return this;
            }

            public Builder setDesiredHeightResId(int heightResId) {
                this.mDesiredHeightResId = heightResId;
                this.mDesiredHeight = 0;
                return this;
            }

            public Builder setAutoExpandBubble(boolean shouldExpand) {
                setFlag(1, shouldExpand);
                return this;
            }

            public Builder setSuppressNotification(boolean shouldSuppressNotif) {
                setFlag(2, shouldSuppressNotif);
                return this;
            }

            public Builder setDeleteIntent(PendingIntent deleteIntent) {
                this.mDeleteIntent = deleteIntent;
                return this;
            }

            public BubbleMetadata build() {
                if (this.mShortcutId == null && this.mPendingIntent == null) {
                    throw new NullPointerException("Must supply pending intent or shortcut to bubble");
                } else if (this.mShortcutId == null && this.mIcon == null) {
                    throw new NullPointerException("Must supply an icon or shortcut for the bubble");
                } else {
                    BubbleMetadata bubbleMetadata = new BubbleMetadata(this.mPendingIntent, this.mDeleteIntent, this.mIcon, this.mDesiredHeight, this.mDesiredHeightResId, this.mFlags, this.mShortcutId);
                    bubbleMetadata.setFlags(this.mFlags);
                    return bubbleMetadata;
                }
            }

            private Builder setFlag(int mask, boolean value) {
                if (value) {
                    this.mFlags |= mask;
                } else {
                    this.mFlags &= ~mask;
                }
                return this;
            }
        }

        private static class Api29Impl {
            private Api29Impl() {
            }

            static Notification.BubbleMetadata toPlatform(BubbleMetadata compatMetadata) {
                if (compatMetadata == null || compatMetadata.getIntent() == null) {
                    return null;
                }
                Notification.BubbleMetadata.Builder platformMetadataBuilder = new Notification.BubbleMetadata.Builder().setIcon(compatMetadata.getIcon().toIcon()).setIntent(compatMetadata.getIntent()).setDeleteIntent(compatMetadata.getDeleteIntent()).setAutoExpandBubble(compatMetadata.getAutoExpandBubble()).setSuppressNotification(compatMetadata.isNotificationSuppressed());
                if (compatMetadata.getDesiredHeight() != 0) {
                    platformMetadataBuilder.setDesiredHeight(compatMetadata.getDesiredHeight());
                }
                if (compatMetadata.getDesiredHeightResId() != 0) {
                    platformMetadataBuilder.setDesiredHeightResId(compatMetadata.getDesiredHeightResId());
                }
                return platformMetadataBuilder.build();
            }

            static BubbleMetadata fromPlatform(Notification.BubbleMetadata platformMetadata) {
                if (platformMetadata == null || platformMetadata.getIntent() == null) {
                    return null;
                }
                Builder compatBuilder = new Builder(platformMetadata.getIntent(), IconCompat.createFromIcon(platformMetadata.getIcon())).setAutoExpandBubble(platformMetadata.getAutoExpandBubble()).setDeleteIntent(platformMetadata.getDeleteIntent()).setSuppressNotification(platformMetadata.isNotificationSuppressed());
                if (platformMetadata.getDesiredHeight() != 0) {
                    compatBuilder.setDesiredHeight(platformMetadata.getDesiredHeight());
                }
                if (platformMetadata.getDesiredHeightResId() != 0) {
                    compatBuilder.setDesiredHeightResId(platformMetadata.getDesiredHeightResId());
                }
                return compatBuilder.build();
            }
        }

        private static class Api30Impl {
            private Api30Impl() {
            }

            static Notification.BubbleMetadata toPlatform(BubbleMetadata compatMetadata) {
                Notification.BubbleMetadata.Builder platformMetadataBuilder;
                if (compatMetadata == null) {
                    return null;
                }
                if (compatMetadata.getShortcutId() != null) {
                    platformMetadataBuilder = new Notification.BubbleMetadata.Builder(compatMetadata.getShortcutId());
                } else {
                    platformMetadataBuilder = new Notification.BubbleMetadata.Builder(compatMetadata.getIntent(), compatMetadata.getIcon().toIcon());
                }
                platformMetadataBuilder.setDeleteIntent(compatMetadata.getDeleteIntent()).setAutoExpandBubble(compatMetadata.getAutoExpandBubble()).setSuppressNotification(compatMetadata.isNotificationSuppressed());
                if (compatMetadata.getDesiredHeight() != 0) {
                    platformMetadataBuilder.setDesiredHeight(compatMetadata.getDesiredHeight());
                }
                if (compatMetadata.getDesiredHeightResId() != 0) {
                    platformMetadataBuilder.setDesiredHeightResId(compatMetadata.getDesiredHeightResId());
                }
                return platformMetadataBuilder.build();
            }

            static BubbleMetadata fromPlatform(Notification.BubbleMetadata platformMetadata) {
                Builder compatBuilder;
                if (platformMetadata == null) {
                    return null;
                }
                if (platformMetadata.getShortcutId() != null) {
                    compatBuilder = new Builder(platformMetadata.getShortcutId());
                } else {
                    compatBuilder = new Builder(platformMetadata.getIntent(), IconCompat.createFromIcon(platformMetadata.getIcon()));
                }
                compatBuilder.setAutoExpandBubble(platformMetadata.getAutoExpandBubble()).setDeleteIntent(platformMetadata.getDeleteIntent()).setSuppressNotification(platformMetadata.isNotificationSuppressed());
                if (platformMetadata.getDesiredHeight() != 0) {
                    compatBuilder.setDesiredHeight(platformMetadata.getDesiredHeight());
                }
                if (platformMetadata.getDesiredHeightResId() != 0) {
                    compatBuilder.setDesiredHeightResId(platformMetadata.getDesiredHeightResId());
                }
                return compatBuilder.build();
            }
        }
    }

    static Notification[] getNotificationArrayFromBundle(Bundle bundle, String key) {
        Parcelable[] array = bundle.getParcelableArray(key);
        if ((array instanceof Notification[]) || array == null) {
            return (Notification[]) array;
        }
        Notification[] typedArray = new Notification[array.length];
        for (int i = 0; i < array.length; i++) {
            typedArray[i] = (Notification) array[i];
        }
        bundle.putParcelableArray(key, typedArray);
        return typedArray;
    }

    public static Bundle getExtras(Notification notification) {
        return notification.extras;
    }

    public static int getActionCount(Notification notification) {
        if (notification.actions != null) {
            return notification.actions.length;
        }
        return 0;
    }

    public static Action getAction(Notification notification, int actionIndex) {
        return getActionCompatFromAction(notification.actions[actionIndex]);
    }

    public static BubbleMetadata getBubbleMetadata(Notification notification) {
        if (Build.VERSION.SDK_INT >= 29) {
            return BubbleMetadata.fromPlatform(Api29Impl.getBubbleMetadata(notification));
        }
        return null;
    }

    static Action getActionCompatFromAction(Notification.Action action) {
        RemoteInput[] remoteInputs;
        int semanticAction;
        boolean isContextual;
        int i;
        Notification.Action action2 = action;
        RemoteInput[] srcArray = Api20Impl.getRemoteInputs(action);
        boolean z = false;
        if (srcArray == null) {
            remoteInputs = null;
        } else {
            remoteInputs = new RemoteInput[srcArray.length];
            for (int i2 = 0; i2 < srcArray.length; i2++) {
                RemoteInput src = srcArray[i2];
                String resultKey = Api20Impl.getResultKey(src);
                CharSequence label = Api20Impl.getLabel(src);
                CharSequence[] choices = Api20Impl.getChoices(src);
                boolean allowFreeFormInput = Api20Impl.getAllowFreeFormInput(src);
                if (Build.VERSION.SDK_INT >= 29) {
                    i = Api29Impl.getEditChoicesBeforeSending(src);
                } else {
                    i = 0;
                }
                remoteInputs[i2] = new RemoteInput(resultKey, label, choices, allowFreeFormInput, i, Api20Impl.getExtras(src), (Set<String>) null);
            }
        }
        boolean allowGeneratedReplies = Api20Impl.getExtras(action).getBoolean("android.support.allowGeneratedReplies") || Api24Impl.getAllowGeneratedReplies(action);
        boolean showsUserInterface = Api20Impl.getExtras(action).getBoolean("android.support.action.showsUserInterface", true);
        if (Build.VERSION.SDK_INT >= 28) {
            semanticAction = Api28Impl.getSemanticAction(action);
        } else {
            semanticAction = Api20Impl.getExtras(action).getInt("android.support.action.semanticAction", 0);
        }
        if (Build.VERSION.SDK_INT >= 29) {
            isContextual = Api29Impl.isContextual(action);
        } else {
            isContextual = false;
        }
        if (Build.VERSION.SDK_INT >= 31) {
            z = Api31Impl.isAuthenticationRequired(action);
        }
        boolean authRequired = z;
        if (Api23Impl.getIcon(action) == null && action2.icon != 0) {
            return new Action(action2.icon, action2.title, action2.actionIntent, Api20Impl.getExtras(action), remoteInputs, (RemoteInput[]) null, allowGeneratedReplies, semanticAction, showsUserInterface, isContextual, authRequired);
        }
        return new Action(Api23Impl.getIcon(action) == null ? null : IconCompat.createFromIconOrNullIfZeroResId(Api23Impl.getIcon(action)), action2.title, action2.actionIntent, Api20Impl.getExtras(action), remoteInputs, (RemoteInput[]) null, allowGeneratedReplies, semanticAction, showsUserInterface, isContextual, authRequired);
    }

    public static List<Action> getInvisibleActions(Notification notification) {
        Bundle listBundle;
        ArrayList<Action> result = new ArrayList<>();
        Bundle carExtenderBundle = notification.extras.getBundle("android.car.EXTENSIONS");
        if (!(carExtenderBundle == null || (listBundle = carExtenderBundle.getBundle("invisible_actions")) == null)) {
            for (int i = 0; i < listBundle.size(); i++) {
                result.add(NotificationCompatJellybean.getActionFromBundle(listBundle.getBundle(Integer.toString(i))));
            }
        }
        return result;
    }

    public static List<Person> getPeople(Notification notification) {
        ArrayList<Person> result = new ArrayList<>();
        if (Build.VERSION.SDK_INT >= 28) {
            ArrayList<android.app.Person> peopleList = notification.extras.getParcelableArrayList(EXTRA_PEOPLE_LIST);
            if (peopleList != null && !peopleList.isEmpty()) {
                Iterator<android.app.Person> it = peopleList.iterator();
                while (it.hasNext()) {
                    result.add(Person.fromAndroidPerson(it.next()));
                }
            }
        } else {
            String[] peopleArray = notification.extras.getStringArray(EXTRA_PEOPLE);
            if (!(peopleArray == null || peopleArray.length == 0)) {
                for (String personUri : peopleArray) {
                    result.add(new Person.Builder().setUri(personUri).build());
                }
            }
        }
        return result;
    }

    public static CharSequence getContentTitle(Notification notification) {
        return notification.extras.getCharSequence(EXTRA_TITLE);
    }

    public static CharSequence getContentText(Notification notification) {
        return notification.extras.getCharSequence(EXTRA_TEXT);
    }

    public static CharSequence getContentInfo(Notification notification) {
        return notification.extras.getCharSequence(EXTRA_INFO_TEXT);
    }

    public static CharSequence getSubText(Notification notification) {
        return notification.extras.getCharSequence(EXTRA_SUB_TEXT);
    }

    public static String getCategory(Notification notification) {
        return notification.category;
    }

    public static boolean getLocalOnly(Notification notification) {
        return (notification.flags & 256) != 0;
    }

    public static String getGroup(Notification notification) {
        return Api20Impl.getGroup(notification);
    }

    public static boolean getShowWhen(Notification notification) {
        return notification.extras.getBoolean(EXTRA_SHOW_WHEN);
    }

    public static boolean getUsesChronometer(Notification notification) {
        return notification.extras.getBoolean(EXTRA_SHOW_CHRONOMETER);
    }

    public static boolean getOnlyAlertOnce(Notification notification) {
        return (notification.flags & 8) != 0;
    }

    public static boolean getAutoCancel(Notification notification) {
        return (notification.flags & 16) != 0;
    }

    public static boolean getOngoing(Notification notification) {
        return (notification.flags & 2) != 0;
    }

    public static int getColor(Notification notification) {
        return notification.color;
    }

    public static int getVisibility(Notification notification) {
        return notification.visibility;
    }

    public static Notification getPublicVersion(Notification notification) {
        return notification.publicVersion;
    }

    static boolean getHighPriority(Notification notification) {
        return (notification.flags & 128) != 0;
    }

    public static boolean isGroupSummary(Notification notification) {
        return (notification.flags & 512) != 0;
    }

    public static String getSortKey(Notification notification) {
        return Api20Impl.getSortKey(notification);
    }

    public static String getChannelId(Notification notification) {
        if (Build.VERSION.SDK_INT >= 26) {
            return Api26Impl.getChannelId(notification);
        }
        return null;
    }

    public static long getTimeoutAfter(Notification notification) {
        if (Build.VERSION.SDK_INT >= 26) {
            return Api26Impl.getTimeoutAfter(notification);
        }
        return 0;
    }

    public static int getBadgeIconType(Notification notification) {
        if (Build.VERSION.SDK_INT >= 26) {
            return Api26Impl.getBadgeIconType(notification);
        }
        return 0;
    }

    public static String getShortcutId(Notification notification) {
        if (Build.VERSION.SDK_INT >= 26) {
            return Api26Impl.getShortcutId(notification);
        }
        return null;
    }

    public static CharSequence getSettingsText(Notification notification) {
        if (Build.VERSION.SDK_INT >= 26) {
            return Api26Impl.getSettingsText(notification);
        }
        return null;
    }

    public static LocusIdCompat getLocusId(Notification notification) {
        LocusId locusId;
        if (Build.VERSION.SDK_INT < 29 || (locusId = Api29Impl.getLocusId(notification)) == null) {
            return null;
        }
        return LocusIdCompat.toLocusIdCompat(locusId);
    }

    public static int getGroupAlertBehavior(Notification notification) {
        if (Build.VERSION.SDK_INT >= 26) {
            return Api26Impl.getGroupAlertBehavior(notification);
        }
        return 0;
    }

    public static boolean getAllowSystemGeneratedContextualActions(Notification notification) {
        if (Build.VERSION.SDK_INT >= 29) {
            return Api29Impl.getAllowSystemGeneratedContextualActions(notification);
        }
        return false;
    }

    public static Bitmap reduceLargeIconSize(Context context, Bitmap icon) {
        if (icon == null || Build.VERSION.SDK_INT >= 27) {
            return icon;
        }
        Resources res = context.getResources();
        int maxWidth = res.getDimensionPixelSize(R.dimen.compat_notification_large_icon_max_width);
        int maxHeight = res.getDimensionPixelSize(R.dimen.compat_notification_large_icon_max_height);
        if (icon.getWidth() <= maxWidth && icon.getHeight() <= maxHeight) {
            return icon;
        }
        double scale = Math.min(((double) maxWidth) / ((double) Math.max(1, icon.getWidth())), ((double) maxHeight) / ((double) Math.max(1, icon.getHeight())));
        return Bitmap.createScaledBitmap(icon, (int) Math.ceil(((double) icon.getWidth()) * scale), (int) Math.ceil(((double) icon.getHeight()) * scale), true);
    }

    static class Api20Impl {
        private Api20Impl() {
        }

        static boolean getAllowFreeFormInput(RemoteInput remoteInput) {
            return remoteInput.getAllowFreeFormInput();
        }

        static CharSequence[] getChoices(RemoteInput remoteInput) {
            return remoteInput.getChoices();
        }

        static CharSequence getLabel(RemoteInput remoteInput) {
            return remoteInput.getLabel();
        }

        static String getResultKey(RemoteInput remoteInput) {
            return remoteInput.getResultKey();
        }

        static RemoteInput[] getRemoteInputs(Notification.Action action) {
            return action.getRemoteInputs();
        }

        static String getSortKey(Notification notification) {
            return notification.getSortKey();
        }

        static String getGroup(Notification notification) {
            return notification.getGroup();
        }

        static Bundle getExtras(Notification.Action action) {
            return action.getExtras();
        }

        static Bundle getExtras(RemoteInput remoteInput) {
            return remoteInput.getExtras();
        }
    }

    static class Api23Impl {
        private Api23Impl() {
        }

        static Icon getIcon(Notification.Action action) {
            return action.getIcon();
        }
    }

    static class Api24Impl {
        private Api24Impl() {
        }

        static boolean getAllowGeneratedReplies(Notification.Action action) {
            return action.getAllowGeneratedReplies();
        }
    }

    static class Api26Impl {
        private Api26Impl() {
        }

        static int getGroupAlertBehavior(Notification notification) {
            return notification.getGroupAlertBehavior();
        }

        static CharSequence getSettingsText(Notification notification) {
            return notification.getSettingsText();
        }

        static String getShortcutId(Notification notification) {
            return notification.getShortcutId();
        }

        static int getBadgeIconType(Notification notification) {
            return notification.getBadgeIconType();
        }

        static long getTimeoutAfter(Notification notification) {
            return notification.getTimeoutAfter();
        }

        static String getChannelId(Notification notification) {
            return notification.getChannelId();
        }
    }

    static class Api28Impl {
        private Api28Impl() {
        }

        static int getSemanticAction(Notification.Action action) {
            return action.getSemanticAction();
        }
    }

    static class Api29Impl {
        private Api29Impl() {
        }

        static boolean getAllowSystemGeneratedContextualActions(Notification notification) {
            return notification.getAllowSystemGeneratedContextualActions();
        }

        static LocusId getLocusId(Notification notification) {
            return notification.getLocusId();
        }

        static boolean isContextual(Notification.Action action) {
            return action.isContextual();
        }

        static int getEditChoicesBeforeSending(RemoteInput remoteInput) {
            return remoteInput.getEditChoicesBeforeSending();
        }

        static Notification.BubbleMetadata getBubbleMetadata(Notification notification) {
            return notification.getBubbleMetadata();
        }
    }

    static class Api31Impl {
        private Api31Impl() {
        }

        static boolean isAuthenticationRequired(Notification.Action action) {
            return action.isAuthenticationRequired();
        }
    }
}
