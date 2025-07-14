package com.google.android.material.badge;

import android.content.Context;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.os.Parcel;
import android.os.Parcelable;
import android.util.AttributeSet;
import com.google.android.material.R;
import com.google.android.material.drawable.DrawableUtils;
import com.google.android.material.internal.ThemeEnforcement;
import com.google.android.material.resources.MaterialResources;
import com.google.android.material.resources.TextAppearance;
import java.util.Locale;

public final class BadgeState {
    private static final String BADGE_RESOURCE_TAG = "badge";
    final float badgeHeight;
    final float badgeRadius;
    final float badgeWidth;
    final float badgeWithTextHeight;
    final float badgeWithTextRadius;
    final float badgeWithTextWidth;
    private final State currentState = new State();
    final int horizontalInset;
    final int horizontalInsetWithText;
    int offsetAlignmentMode;
    private final State overridingState;

    BadgeState(Context context, int badgeResId, int defStyleAttr, int defStyleRes, State storedState) {
        CharSequence charSequence;
        int i;
        int i2;
        int i3;
        int i4;
        int i5;
        int i6;
        int i7;
        int i8;
        int i9;
        int i10;
        int i11;
        int i12;
        int i13;
        int i14;
        int i15;
        int i16;
        int i17;
        int i18;
        boolean z;
        storedState = storedState == null ? new State() : storedState;
        if (badgeResId != 0) {
            int unused = storedState.badgeResId = badgeResId;
        }
        TypedArray a = generateTypedArray(context, storedState.badgeResId, defStyleAttr, defStyleRes);
        Resources res = context.getResources();
        this.badgeRadius = (float) a.getDimensionPixelSize(R.styleable.Badge_badgeRadius, -1);
        this.horizontalInset = context.getResources().getDimensionPixelSize(R.dimen.mtrl_badge_horizontal_edge_offset);
        this.horizontalInsetWithText = context.getResources().getDimensionPixelSize(R.dimen.mtrl_badge_text_horizontal_edge_offset);
        this.badgeWithTextRadius = (float) a.getDimensionPixelSize(R.styleable.Badge_badgeWithTextRadius, -1);
        this.badgeWidth = a.getDimension(R.styleable.Badge_badgeWidth, res.getDimension(R.dimen.m3_badge_size));
        this.badgeWithTextWidth = a.getDimension(R.styleable.Badge_badgeWithTextWidth, res.getDimension(R.dimen.m3_badge_with_text_size));
        this.badgeHeight = a.getDimension(R.styleable.Badge_badgeHeight, res.getDimension(R.dimen.m3_badge_size));
        this.badgeWithTextHeight = a.getDimension(R.styleable.Badge_badgeWithTextHeight, res.getDimension(R.dimen.m3_badge_with_text_size));
        boolean z2 = true;
        this.offsetAlignmentMode = a.getInt(R.styleable.Badge_offsetAlignmentMode, 1);
        int unused2 = this.currentState.alpha = storedState.alpha == -2 ? 255 : storedState.alpha;
        if (storedState.number != -2) {
            int unused3 = this.currentState.number = storedState.number;
        } else if (a.hasValue(R.styleable.Badge_number)) {
            int unused4 = this.currentState.number = a.getInt(R.styleable.Badge_number, 0);
        } else {
            int unused5 = this.currentState.number = -1;
        }
        if (storedState.text != null) {
            String unused6 = this.currentState.text = storedState.text;
        } else if (a.hasValue(R.styleable.Badge_badgeText)) {
            String unused7 = this.currentState.text = a.getString(R.styleable.Badge_badgeText);
        }
        CharSequence unused8 = this.currentState.contentDescriptionForText = storedState.contentDescriptionForText;
        State state = this.currentState;
        if (storedState.contentDescriptionNumberless == null) {
            charSequence = context.getString(R.string.mtrl_badge_numberless_content_description);
        } else {
            charSequence = storedState.contentDescriptionNumberless;
        }
        CharSequence unused9 = state.contentDescriptionNumberless = charSequence;
        State state2 = this.currentState;
        if (storedState.contentDescriptionQuantityStrings == 0) {
            i = R.plurals.mtrl_badge_content_description;
        } else {
            i = storedState.contentDescriptionQuantityStrings;
        }
        int unused10 = state2.contentDescriptionQuantityStrings = i;
        State state3 = this.currentState;
        if (storedState.contentDescriptionExceedsMaxBadgeNumberRes == 0) {
            i2 = R.string.mtrl_exceed_max_badge_number_content_description;
        } else {
            i2 = storedState.contentDescriptionExceedsMaxBadgeNumberRes;
        }
        int unused11 = state3.contentDescriptionExceedsMaxBadgeNumberRes = i2;
        State state4 = this.currentState;
        if (storedState.isVisible != null && !storedState.isVisible.booleanValue()) {
            z2 = false;
        }
        Boolean unused12 = state4.isVisible = Boolean.valueOf(z2);
        State state5 = this.currentState;
        if (storedState.maxCharacterCount == -2) {
            i3 = a.getInt(R.styleable.Badge_maxCharacterCount, -2);
        } else {
            i3 = storedState.maxCharacterCount;
        }
        int unused13 = state5.maxCharacterCount = i3;
        State state6 = this.currentState;
        if (storedState.maxNumber == -2) {
            i4 = a.getInt(R.styleable.Badge_maxNumber, -2);
        } else {
            i4 = storedState.maxNumber;
        }
        int unused14 = state6.maxNumber = i4;
        State state7 = this.currentState;
        if (storedState.badgeShapeAppearanceResId == null) {
            i5 = a.getResourceId(R.styleable.Badge_badgeShapeAppearance, R.style.ShapeAppearance_M3_Sys_Shape_Corner_Full);
        } else {
            i5 = storedState.badgeShapeAppearanceResId.intValue();
        }
        Integer unused15 = state7.badgeShapeAppearanceResId = Integer.valueOf(i5);
        State state8 = this.currentState;
        if (storedState.badgeShapeAppearanceOverlayResId == null) {
            i6 = a.getResourceId(R.styleable.Badge_badgeShapeAppearanceOverlay, 0);
        } else {
            i6 = storedState.badgeShapeAppearanceOverlayResId.intValue();
        }
        Integer unused16 = state8.badgeShapeAppearanceOverlayResId = Integer.valueOf(i6);
        State state9 = this.currentState;
        if (storedState.badgeWithTextShapeAppearanceResId == null) {
            i7 = a.getResourceId(R.styleable.Badge_badgeWithTextShapeAppearance, R.style.ShapeAppearance_M3_Sys_Shape_Corner_Full);
        } else {
            i7 = storedState.badgeWithTextShapeAppearanceResId.intValue();
        }
        Integer unused17 = state9.badgeWithTextShapeAppearanceResId = Integer.valueOf(i7);
        State state10 = this.currentState;
        if (storedState.badgeWithTextShapeAppearanceOverlayResId == null) {
            i8 = a.getResourceId(R.styleable.Badge_badgeWithTextShapeAppearanceOverlay, 0);
        } else {
            i8 = storedState.badgeWithTextShapeAppearanceOverlayResId.intValue();
        }
        Integer unused18 = state10.badgeWithTextShapeAppearanceOverlayResId = Integer.valueOf(i8);
        State state11 = this.currentState;
        if (storedState.backgroundColor == null) {
            i9 = readColorFromAttributes(context, a, R.styleable.Badge_backgroundColor);
        } else {
            i9 = storedState.backgroundColor.intValue();
        }
        Integer unused19 = state11.backgroundColor = Integer.valueOf(i9);
        State state12 = this.currentState;
        if (storedState.badgeTextAppearanceResId == null) {
            i10 = a.getResourceId(R.styleable.Badge_badgeTextAppearance, R.style.TextAppearance_MaterialComponents_Badge);
        } else {
            i10 = storedState.badgeTextAppearanceResId.intValue();
        }
        Integer unused20 = state12.badgeTextAppearanceResId = Integer.valueOf(i10);
        if (storedState.badgeTextColor != null) {
            Integer unused21 = this.currentState.badgeTextColor = storedState.badgeTextColor;
        } else if (a.hasValue(R.styleable.Badge_badgeTextColor)) {
            Integer unused22 = this.currentState.badgeTextColor = Integer.valueOf(readColorFromAttributes(context, a, R.styleable.Badge_badgeTextColor));
        } else {
            Integer unused23 = this.currentState.badgeTextColor = Integer.valueOf(new TextAppearance(context, this.currentState.badgeTextAppearanceResId.intValue()).getTextColor().getDefaultColor());
        }
        State state13 = this.currentState;
        if (storedState.badgeGravity == null) {
            i11 = a.getInt(R.styleable.Badge_badgeGravity, 8388661);
        } else {
            i11 = storedState.badgeGravity.intValue();
        }
        Integer unused24 = state13.badgeGravity = Integer.valueOf(i11);
        State state14 = this.currentState;
        if (storedState.badgeHorizontalPadding == null) {
            i12 = a.getDimensionPixelSize(R.styleable.Badge_badgeWidePadding, res.getDimensionPixelSize(R.dimen.mtrl_badge_long_text_horizontal_padding));
        } else {
            i12 = storedState.badgeHorizontalPadding.intValue();
        }
        Integer unused25 = state14.badgeHorizontalPadding = Integer.valueOf(i12);
        State state15 = this.currentState;
        if (storedState.badgeVerticalPadding == null) {
            i13 = a.getDimensionPixelSize(R.styleable.Badge_badgeVerticalPadding, res.getDimensionPixelSize(R.dimen.m3_badge_with_text_vertical_padding));
        } else {
            i13 = storedState.badgeVerticalPadding.intValue();
        }
        Integer unused26 = state15.badgeVerticalPadding = Integer.valueOf(i13);
        State state16 = this.currentState;
        if (storedState.horizontalOffsetWithoutText == null) {
            i14 = a.getDimensionPixelOffset(R.styleable.Badge_horizontalOffset, 0);
        } else {
            i14 = storedState.horizontalOffsetWithoutText.intValue();
        }
        Integer unused27 = state16.horizontalOffsetWithoutText = Integer.valueOf(i14);
        State state17 = this.currentState;
        if (storedState.verticalOffsetWithoutText == null) {
            i15 = a.getDimensionPixelOffset(R.styleable.Badge_verticalOffset, 0);
        } else {
            i15 = storedState.verticalOffsetWithoutText.intValue();
        }
        Integer unused28 = state17.verticalOffsetWithoutText = Integer.valueOf(i15);
        State state18 = this.currentState;
        if (storedState.horizontalOffsetWithText == null) {
            i16 = a.getDimensionPixelOffset(R.styleable.Badge_horizontalOffsetWithText, this.currentState.horizontalOffsetWithoutText.intValue());
        } else {
            i16 = storedState.horizontalOffsetWithText.intValue();
        }
        Integer unused29 = state18.horizontalOffsetWithText = Integer.valueOf(i16);
        State state19 = this.currentState;
        if (storedState.verticalOffsetWithText == null) {
            i17 = a.getDimensionPixelOffset(R.styleable.Badge_verticalOffsetWithText, this.currentState.verticalOffsetWithoutText.intValue());
        } else {
            i17 = storedState.verticalOffsetWithText.intValue();
        }
        Integer unused30 = state19.verticalOffsetWithText = Integer.valueOf(i17);
        State state20 = this.currentState;
        if (storedState.largeFontVerticalOffsetAdjustment == null) {
            i18 = a.getDimensionPixelOffset(R.styleable.Badge_largeFontVerticalOffsetAdjustment, 0);
        } else {
            i18 = storedState.largeFontVerticalOffsetAdjustment.intValue();
        }
        Integer unused31 = state20.largeFontVerticalOffsetAdjustment = Integer.valueOf(i18);
        Integer unused32 = this.currentState.additionalHorizontalOffset = Integer.valueOf(storedState.additionalHorizontalOffset == null ? 0 : storedState.additionalHorizontalOffset.intValue());
        Integer unused33 = this.currentState.additionalVerticalOffset = Integer.valueOf(storedState.additionalVerticalOffset == null ? 0 : storedState.additionalVerticalOffset.intValue());
        State state21 = this.currentState;
        if (storedState.autoAdjustToWithinGrandparentBounds == null) {
            z = a.getBoolean(R.styleable.Badge_autoAdjustToWithinGrandparentBounds, false);
        } else {
            z = storedState.autoAdjustToWithinGrandparentBounds.booleanValue();
        }
        Boolean unused34 = state21.autoAdjustToWithinGrandparentBounds = Boolean.valueOf(z);
        a.recycle();
        if (storedState.numberLocale == null) {
            Locale unused35 = this.currentState.numberLocale = Locale.getDefault(Locale.Category.FORMAT);
        } else {
            Locale unused36 = this.currentState.numberLocale = storedState.numberLocale;
        }
        this.overridingState = storedState;
    }

    private TypedArray generateTypedArray(Context context, int badgeResId, int defStyleAttr, int defStyleRes) {
        AttributeSet attrs = null;
        int style = 0;
        if (badgeResId != 0) {
            attrs = DrawableUtils.parseDrawableXml(context, badgeResId, BADGE_RESOURCE_TAG);
            style = attrs.getStyleAttribute();
        }
        if (style == 0) {
            style = defStyleRes;
        }
        return ThemeEnforcement.obtainStyledAttributes(context, attrs, R.styleable.Badge, defStyleAttr, style, new int[0]);
    }

    /* access modifiers changed from: package-private */
    public State getOverridingState() {
        return this.overridingState;
    }

    /* access modifiers changed from: package-private */
    public boolean isVisible() {
        return this.currentState.isVisible.booleanValue();
    }

    /* access modifiers changed from: package-private */
    public void setVisible(boolean visible) {
        Boolean unused = this.overridingState.isVisible = Boolean.valueOf(visible);
        Boolean unused2 = this.currentState.isVisible = Boolean.valueOf(visible);
    }

    /* access modifiers changed from: package-private */
    public boolean hasNumber() {
        return this.currentState.number != -1;
    }

    /* access modifiers changed from: package-private */
    public int getNumber() {
        return this.currentState.number;
    }

    /* access modifiers changed from: package-private */
    public void setNumber(int number) {
        int unused = this.overridingState.number = number;
        int unused2 = this.currentState.number = number;
    }

    /* access modifiers changed from: package-private */
    public void clearNumber() {
        setNumber(-1);
    }

    /* access modifiers changed from: package-private */
    public boolean hasText() {
        return this.currentState.text != null;
    }

    /* access modifiers changed from: package-private */
    public String getText() {
        return this.currentState.text;
    }

    /* access modifiers changed from: package-private */
    public void setText(String text) {
        String unused = this.overridingState.text = text;
        String unused2 = this.currentState.text = text;
    }

    /* access modifiers changed from: package-private */
    public void clearText() {
        setText((String) null);
    }

    /* access modifiers changed from: package-private */
    public int getAlpha() {
        return this.currentState.alpha;
    }

    /* access modifiers changed from: package-private */
    public void setAlpha(int alpha) {
        int unused = this.overridingState.alpha = alpha;
        int unused2 = this.currentState.alpha = alpha;
    }

    /* access modifiers changed from: package-private */
    public int getMaxCharacterCount() {
        return this.currentState.maxCharacterCount;
    }

    /* access modifiers changed from: package-private */
    public void setMaxCharacterCount(int maxCharacterCount) {
        int unused = this.overridingState.maxCharacterCount = maxCharacterCount;
        int unused2 = this.currentState.maxCharacterCount = maxCharacterCount;
    }

    /* access modifiers changed from: package-private */
    public int getMaxNumber() {
        return this.currentState.maxNumber;
    }

    /* access modifiers changed from: package-private */
    public void setMaxNumber(int maxNumber) {
        int unused = this.overridingState.maxNumber = maxNumber;
        int unused2 = this.currentState.maxNumber = maxNumber;
    }

    /* access modifiers changed from: package-private */
    public int getBackgroundColor() {
        return this.currentState.backgroundColor.intValue();
    }

    /* access modifiers changed from: package-private */
    public void setBackgroundColor(int backgroundColor) {
        Integer unused = this.overridingState.backgroundColor = Integer.valueOf(backgroundColor);
        Integer unused2 = this.currentState.backgroundColor = Integer.valueOf(backgroundColor);
    }

    /* access modifiers changed from: package-private */
    public int getBadgeTextColor() {
        return this.currentState.badgeTextColor.intValue();
    }

    /* access modifiers changed from: package-private */
    public void setBadgeTextColor(int badgeTextColor) {
        Integer unused = this.overridingState.badgeTextColor = Integer.valueOf(badgeTextColor);
        Integer unused2 = this.currentState.badgeTextColor = Integer.valueOf(badgeTextColor);
    }

    /* access modifiers changed from: package-private */
    public int getTextAppearanceResId() {
        return this.currentState.badgeTextAppearanceResId.intValue();
    }

    /* access modifiers changed from: package-private */
    public void setTextAppearanceResId(int textAppearanceResId) {
        Integer unused = this.overridingState.badgeTextAppearanceResId = Integer.valueOf(textAppearanceResId);
        Integer unused2 = this.currentState.badgeTextAppearanceResId = Integer.valueOf(textAppearanceResId);
    }

    /* access modifiers changed from: package-private */
    public int getBadgeShapeAppearanceResId() {
        return this.currentState.badgeShapeAppearanceResId.intValue();
    }

    /* access modifiers changed from: package-private */
    public void setBadgeShapeAppearanceResId(int shapeAppearanceResId) {
        Integer unused = this.overridingState.badgeShapeAppearanceResId = Integer.valueOf(shapeAppearanceResId);
        Integer unused2 = this.currentState.badgeShapeAppearanceResId = Integer.valueOf(shapeAppearanceResId);
    }

    /* access modifiers changed from: package-private */
    public int getBadgeShapeAppearanceOverlayResId() {
        return this.currentState.badgeShapeAppearanceOverlayResId.intValue();
    }

    /* access modifiers changed from: package-private */
    public void setBadgeShapeAppearanceOverlayResId(int shapeAppearanceOverlayResId) {
        Integer unused = this.overridingState.badgeShapeAppearanceOverlayResId = Integer.valueOf(shapeAppearanceOverlayResId);
        Integer unused2 = this.currentState.badgeShapeAppearanceOverlayResId = Integer.valueOf(shapeAppearanceOverlayResId);
    }

    /* access modifiers changed from: package-private */
    public int getBadgeWithTextShapeAppearanceResId() {
        return this.currentState.badgeWithTextShapeAppearanceResId.intValue();
    }

    /* access modifiers changed from: package-private */
    public void setBadgeWithTextShapeAppearanceResId(int shapeAppearanceResId) {
        Integer unused = this.overridingState.badgeWithTextShapeAppearanceResId = Integer.valueOf(shapeAppearanceResId);
        Integer unused2 = this.currentState.badgeWithTextShapeAppearanceResId = Integer.valueOf(shapeAppearanceResId);
    }

    /* access modifiers changed from: package-private */
    public int getBadgeWithTextShapeAppearanceOverlayResId() {
        return this.currentState.badgeWithTextShapeAppearanceOverlayResId.intValue();
    }

    /* access modifiers changed from: package-private */
    public void setBadgeWithTextShapeAppearanceOverlayResId(int shapeAppearanceOverlayResId) {
        Integer unused = this.overridingState.badgeWithTextShapeAppearanceOverlayResId = Integer.valueOf(shapeAppearanceOverlayResId);
        Integer unused2 = this.currentState.badgeWithTextShapeAppearanceOverlayResId = Integer.valueOf(shapeAppearanceOverlayResId);
    }

    /* access modifiers changed from: package-private */
    public int getBadgeGravity() {
        return this.currentState.badgeGravity.intValue();
    }

    /* access modifiers changed from: package-private */
    public void setBadgeGravity(int badgeGravity) {
        Integer unused = this.overridingState.badgeGravity = Integer.valueOf(badgeGravity);
        Integer unused2 = this.currentState.badgeGravity = Integer.valueOf(badgeGravity);
    }

    /* access modifiers changed from: package-private */
    public int getBadgeHorizontalPadding() {
        return this.currentState.badgeHorizontalPadding.intValue();
    }

    /* access modifiers changed from: package-private */
    public void setBadgeHorizontalPadding(int horizontalPadding) {
        Integer unused = this.overridingState.badgeHorizontalPadding = Integer.valueOf(horizontalPadding);
        Integer unused2 = this.currentState.badgeHorizontalPadding = Integer.valueOf(horizontalPadding);
    }

    /* access modifiers changed from: package-private */
    public int getBadgeVerticalPadding() {
        return this.currentState.badgeVerticalPadding.intValue();
    }

    /* access modifiers changed from: package-private */
    public void setBadgeVerticalPadding(int verticalPadding) {
        Integer unused = this.overridingState.badgeVerticalPadding = Integer.valueOf(verticalPadding);
        Integer unused2 = this.currentState.badgeVerticalPadding = Integer.valueOf(verticalPadding);
    }

    /* access modifiers changed from: package-private */
    public int getHorizontalOffsetWithoutText() {
        return this.currentState.horizontalOffsetWithoutText.intValue();
    }

    /* access modifiers changed from: package-private */
    public void setHorizontalOffsetWithoutText(int offset) {
        Integer unused = this.overridingState.horizontalOffsetWithoutText = Integer.valueOf(offset);
        Integer unused2 = this.currentState.horizontalOffsetWithoutText = Integer.valueOf(offset);
    }

    /* access modifiers changed from: package-private */
    public int getVerticalOffsetWithoutText() {
        return this.currentState.verticalOffsetWithoutText.intValue();
    }

    /* access modifiers changed from: package-private */
    public void setVerticalOffsetWithoutText(int offset) {
        Integer unused = this.overridingState.verticalOffsetWithoutText = Integer.valueOf(offset);
        Integer unused2 = this.currentState.verticalOffsetWithoutText = Integer.valueOf(offset);
    }

    /* access modifiers changed from: package-private */
    public int getHorizontalOffsetWithText() {
        return this.currentState.horizontalOffsetWithText.intValue();
    }

    /* access modifiers changed from: package-private */
    public void setHorizontalOffsetWithText(int offset) {
        Integer unused = this.overridingState.horizontalOffsetWithText = Integer.valueOf(offset);
        Integer unused2 = this.currentState.horizontalOffsetWithText = Integer.valueOf(offset);
    }

    /* access modifiers changed from: package-private */
    public int getVerticalOffsetWithText() {
        return this.currentState.verticalOffsetWithText.intValue();
    }

    /* access modifiers changed from: package-private */
    public void setVerticalOffsetWithText(int offset) {
        Integer unused = this.overridingState.verticalOffsetWithText = Integer.valueOf(offset);
        Integer unused2 = this.currentState.verticalOffsetWithText = Integer.valueOf(offset);
    }

    /* access modifiers changed from: package-private */
    public int getLargeFontVerticalOffsetAdjustment() {
        return this.currentState.largeFontVerticalOffsetAdjustment.intValue();
    }

    /* access modifiers changed from: package-private */
    public void setLargeFontVerticalOffsetAdjustment(int offsetAdjustment) {
        Integer unused = this.overridingState.largeFontVerticalOffsetAdjustment = Integer.valueOf(offsetAdjustment);
        Integer unused2 = this.currentState.largeFontVerticalOffsetAdjustment = Integer.valueOf(offsetAdjustment);
    }

    /* access modifiers changed from: package-private */
    public int getAdditionalHorizontalOffset() {
        return this.currentState.additionalHorizontalOffset.intValue();
    }

    /* access modifiers changed from: package-private */
    public void setAdditionalHorizontalOffset(int offset) {
        Integer unused = this.overridingState.additionalHorizontalOffset = Integer.valueOf(offset);
        Integer unused2 = this.currentState.additionalHorizontalOffset = Integer.valueOf(offset);
    }

    /* access modifiers changed from: package-private */
    public int getAdditionalVerticalOffset() {
        return this.currentState.additionalVerticalOffset.intValue();
    }

    /* access modifiers changed from: package-private */
    public void setAdditionalVerticalOffset(int offset) {
        Integer unused = this.overridingState.additionalVerticalOffset = Integer.valueOf(offset);
        Integer unused2 = this.currentState.additionalVerticalOffset = Integer.valueOf(offset);
    }

    /* access modifiers changed from: package-private */
    public CharSequence getContentDescriptionForText() {
        return this.currentState.contentDescriptionForText;
    }

    /* access modifiers changed from: package-private */
    public void setContentDescriptionForText(CharSequence contentDescription) {
        CharSequence unused = this.overridingState.contentDescriptionForText = contentDescription;
        CharSequence unused2 = this.currentState.contentDescriptionForText = contentDescription;
    }

    /* access modifiers changed from: package-private */
    public CharSequence getContentDescriptionNumberless() {
        return this.currentState.contentDescriptionNumberless;
    }

    /* access modifiers changed from: package-private */
    public void setContentDescriptionNumberless(CharSequence contentDescriptionNumberless) {
        CharSequence unused = this.overridingState.contentDescriptionNumberless = contentDescriptionNumberless;
        CharSequence unused2 = this.currentState.contentDescriptionNumberless = contentDescriptionNumberless;
    }

    /* access modifiers changed from: package-private */
    public int getContentDescriptionQuantityStrings() {
        return this.currentState.contentDescriptionQuantityStrings;
    }

    /* access modifiers changed from: package-private */
    public void setContentDescriptionQuantityStringsResource(int stringsResource) {
        int unused = this.overridingState.contentDescriptionQuantityStrings = stringsResource;
        int unused2 = this.currentState.contentDescriptionQuantityStrings = stringsResource;
    }

    /* access modifiers changed from: package-private */
    public int getContentDescriptionExceedsMaxBadgeNumberStringResource() {
        return this.currentState.contentDescriptionExceedsMaxBadgeNumberRes;
    }

    /* access modifiers changed from: package-private */
    public void setContentDescriptionExceedsMaxBadgeNumberStringResource(int stringsResource) {
        int unused = this.overridingState.contentDescriptionExceedsMaxBadgeNumberRes = stringsResource;
        int unused2 = this.currentState.contentDescriptionExceedsMaxBadgeNumberRes = stringsResource;
    }

    /* access modifiers changed from: package-private */
    public Locale getNumberLocale() {
        return this.currentState.numberLocale;
    }

    /* access modifiers changed from: package-private */
    public void setNumberLocale(Locale locale) {
        Locale unused = this.overridingState.numberLocale = locale;
        Locale unused2 = this.currentState.numberLocale = locale;
    }

    /* access modifiers changed from: package-private */
    public boolean isAutoAdjustedToGrandparentBounds() {
        return this.currentState.autoAdjustToWithinGrandparentBounds.booleanValue();
    }

    /* access modifiers changed from: package-private */
    public void setAutoAdjustToGrandparentBounds(boolean autoAdjustToGrandparentBounds) {
        Boolean unused = this.overridingState.autoAdjustToWithinGrandparentBounds = Boolean.valueOf(autoAdjustToGrandparentBounds);
        Boolean unused2 = this.currentState.autoAdjustToWithinGrandparentBounds = Boolean.valueOf(autoAdjustToGrandparentBounds);
    }

    private static int readColorFromAttributes(Context context, TypedArray a, int index) {
        return MaterialResources.getColorStateList(context, a, index).getDefaultColor();
    }

    public static final class State implements Parcelable {
        private static final int BADGE_NUMBER_NONE = -1;
        public static final Parcelable.Creator<State> CREATOR = new Parcelable.Creator<State>() {
            public State createFromParcel(Parcel in) {
                return new State(in);
            }

            public State[] newArray(int size) {
                return new State[size];
            }
        };
        private static final int NOT_SET = -2;
        /* access modifiers changed from: private */
        public Integer additionalHorizontalOffset;
        /* access modifiers changed from: private */
        public Integer additionalVerticalOffset;
        /* access modifiers changed from: private */
        public int alpha = 255;
        /* access modifiers changed from: private */
        public Boolean autoAdjustToWithinGrandparentBounds;
        /* access modifiers changed from: private */
        public Integer backgroundColor;
        /* access modifiers changed from: private */
        public Integer badgeGravity;
        /* access modifiers changed from: private */
        public Integer badgeHorizontalPadding;
        /* access modifiers changed from: private */
        public int badgeResId;
        /* access modifiers changed from: private */
        public Integer badgeShapeAppearanceOverlayResId;
        /* access modifiers changed from: private */
        public Integer badgeShapeAppearanceResId;
        /* access modifiers changed from: private */
        public Integer badgeTextAppearanceResId;
        /* access modifiers changed from: private */
        public Integer badgeTextColor;
        /* access modifiers changed from: private */
        public Integer badgeVerticalPadding;
        /* access modifiers changed from: private */
        public Integer badgeWithTextShapeAppearanceOverlayResId;
        /* access modifiers changed from: private */
        public Integer badgeWithTextShapeAppearanceResId;
        /* access modifiers changed from: private */
        public int contentDescriptionExceedsMaxBadgeNumberRes;
        /* access modifiers changed from: private */
        public CharSequence contentDescriptionForText;
        /* access modifiers changed from: private */
        public CharSequence contentDescriptionNumberless;
        /* access modifiers changed from: private */
        public int contentDescriptionQuantityStrings;
        /* access modifiers changed from: private */
        public Integer horizontalOffsetWithText;
        /* access modifiers changed from: private */
        public Integer horizontalOffsetWithoutText;
        /* access modifiers changed from: private */
        public Boolean isVisible = true;
        /* access modifiers changed from: private */
        public Integer largeFontVerticalOffsetAdjustment;
        /* access modifiers changed from: private */
        public int maxCharacterCount = -2;
        /* access modifiers changed from: private */
        public int maxNumber = -2;
        /* access modifiers changed from: private */
        public int number = -2;
        /* access modifiers changed from: private */
        public Locale numberLocale;
        /* access modifiers changed from: private */
        public String text;
        /* access modifiers changed from: private */
        public Integer verticalOffsetWithText;
        /* access modifiers changed from: private */
        public Integer verticalOffsetWithoutText;

        public State() {
        }

        State(Parcel in) {
            this.badgeResId = in.readInt();
            this.backgroundColor = (Integer) in.readSerializable();
            this.badgeTextColor = (Integer) in.readSerializable();
            this.badgeTextAppearanceResId = (Integer) in.readSerializable();
            this.badgeShapeAppearanceResId = (Integer) in.readSerializable();
            this.badgeShapeAppearanceOverlayResId = (Integer) in.readSerializable();
            this.badgeWithTextShapeAppearanceResId = (Integer) in.readSerializable();
            this.badgeWithTextShapeAppearanceOverlayResId = (Integer) in.readSerializable();
            this.alpha = in.readInt();
            this.text = in.readString();
            this.number = in.readInt();
            this.maxCharacterCount = in.readInt();
            this.maxNumber = in.readInt();
            this.contentDescriptionForText = in.readString();
            this.contentDescriptionNumberless = in.readString();
            this.contentDescriptionQuantityStrings = in.readInt();
            this.badgeGravity = (Integer) in.readSerializable();
            this.badgeHorizontalPadding = (Integer) in.readSerializable();
            this.badgeVerticalPadding = (Integer) in.readSerializable();
            this.horizontalOffsetWithoutText = (Integer) in.readSerializable();
            this.verticalOffsetWithoutText = (Integer) in.readSerializable();
            this.horizontalOffsetWithText = (Integer) in.readSerializable();
            this.verticalOffsetWithText = (Integer) in.readSerializable();
            this.largeFontVerticalOffsetAdjustment = (Integer) in.readSerializable();
            this.additionalHorizontalOffset = (Integer) in.readSerializable();
            this.additionalVerticalOffset = (Integer) in.readSerializable();
            this.isVisible = (Boolean) in.readSerializable();
            this.numberLocale = (Locale) in.readSerializable();
            this.autoAdjustToWithinGrandparentBounds = (Boolean) in.readSerializable();
        }

        public int describeContents() {
            return 0;
        }

        public void writeToParcel(Parcel dest, int flags) {
            dest.writeInt(this.badgeResId);
            dest.writeSerializable(this.backgroundColor);
            dest.writeSerializable(this.badgeTextColor);
            dest.writeSerializable(this.badgeTextAppearanceResId);
            dest.writeSerializable(this.badgeShapeAppearanceResId);
            dest.writeSerializable(this.badgeShapeAppearanceOverlayResId);
            dest.writeSerializable(this.badgeWithTextShapeAppearanceResId);
            dest.writeSerializable(this.badgeWithTextShapeAppearanceOverlayResId);
            dest.writeInt(this.alpha);
            dest.writeString(this.text);
            dest.writeInt(this.number);
            dest.writeInt(this.maxCharacterCount);
            dest.writeInt(this.maxNumber);
            String str = null;
            dest.writeString(this.contentDescriptionForText != null ? this.contentDescriptionForText.toString() : null);
            if (this.contentDescriptionNumberless != null) {
                str = this.contentDescriptionNumberless.toString();
            }
            dest.writeString(str);
            dest.writeInt(this.contentDescriptionQuantityStrings);
            dest.writeSerializable(this.badgeGravity);
            dest.writeSerializable(this.badgeHorizontalPadding);
            dest.writeSerializable(this.badgeVerticalPadding);
            dest.writeSerializable(this.horizontalOffsetWithoutText);
            dest.writeSerializable(this.verticalOffsetWithoutText);
            dest.writeSerializable(this.horizontalOffsetWithText);
            dest.writeSerializable(this.verticalOffsetWithText);
            dest.writeSerializable(this.largeFontVerticalOffsetAdjustment);
            dest.writeSerializable(this.additionalHorizontalOffset);
            dest.writeSerializable(this.additionalVerticalOffset);
            dest.writeSerializable(this.isVisible);
            dest.writeSerializable(this.numberLocale);
            dest.writeSerializable(this.autoAdjustToWithinGrandparentBounds);
        }
    }
}
