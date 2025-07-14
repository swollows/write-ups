package com.google.android.material.chip;

import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;
import android.view.accessibility.AccessibilityNodeInfo;
import androidx.core.view.ViewCompat;
import androidx.core.view.accessibility.AccessibilityNodeInfoCompat;
import com.google.android.material.R;
import com.google.android.material.internal.CheckableGroup;
import com.google.android.material.internal.FlowLayout;
import com.google.android.material.internal.ThemeEnforcement;
import com.google.android.material.theme.overlay.MaterialThemeOverlay;
import java.util.List;
import java.util.Set;

public class ChipGroup extends FlowLayout {
    private static final int DEF_STYLE_RES = R.style.Widget_MaterialComponents_ChipGroup;
    /* access modifiers changed from: private */
    public final CheckableGroup<Chip> checkableGroup;
    private int chipSpacingHorizontal;
    private int chipSpacingVertical;
    private final int defaultCheckedId;
    /* access modifiers changed from: private */
    public OnCheckedStateChangeListener onCheckedStateChangeListener;
    private final PassThroughHierarchyChangeListener passThroughListener;

    @Deprecated
    public interface OnCheckedChangeListener {
        void onCheckedChanged(ChipGroup chipGroup, int i);
    }

    public interface OnCheckedStateChangeListener {
        void onCheckedChanged(ChipGroup chipGroup, List<Integer> list);
    }

    public static class LayoutParams extends ViewGroup.MarginLayoutParams {
        public LayoutParams(Context context, AttributeSet attrs) {
            super(context, attrs);
        }

        public LayoutParams(ViewGroup.LayoutParams source) {
            super(source);
        }

        public LayoutParams(int width, int height) {
            super(width, height);
        }

        public LayoutParams(ViewGroup.MarginLayoutParams source) {
            super(source);
        }
    }

    public ChipGroup(Context context) {
        this(context, (AttributeSet) null);
    }

    public ChipGroup(Context context, AttributeSet attrs) {
        this(context, attrs, R.attr.chipGroupStyle);
    }

    public ChipGroup(Context context, AttributeSet attrs, int defStyleAttr) {
        super(MaterialThemeOverlay.wrap(context, attrs, defStyleAttr, DEF_STYLE_RES), attrs, defStyleAttr);
        this.checkableGroup = new CheckableGroup<>();
        this.passThroughListener = new PassThroughHierarchyChangeListener();
        TypedArray a = ThemeEnforcement.obtainStyledAttributes(getContext(), attrs, R.styleable.ChipGroup, defStyleAttr, DEF_STYLE_RES, new int[0]);
        int chipSpacing = a.getDimensionPixelOffset(R.styleable.ChipGroup_chipSpacing, 0);
        setChipSpacingHorizontal(a.getDimensionPixelOffset(R.styleable.ChipGroup_chipSpacingHorizontal, chipSpacing));
        setChipSpacingVertical(a.getDimensionPixelOffset(R.styleable.ChipGroup_chipSpacingVertical, chipSpacing));
        setSingleLine(a.getBoolean(R.styleable.ChipGroup_singleLine, false));
        setSingleSelection(a.getBoolean(R.styleable.ChipGroup_singleSelection, false));
        setSelectionRequired(a.getBoolean(R.styleable.ChipGroup_selectionRequired, false));
        this.defaultCheckedId = a.getResourceId(R.styleable.ChipGroup_checkedChip, -1);
        a.recycle();
        this.checkableGroup.setOnCheckedStateChangeListener(new CheckableGroup.OnCheckedStateChangeListener() {
            public void onCheckedStateChanged(Set<Integer> set) {
                if (ChipGroup.this.onCheckedStateChangeListener != null) {
                    ChipGroup.this.onCheckedStateChangeListener.onCheckedChanged(ChipGroup.this, ChipGroup.this.checkableGroup.getCheckedIdsSortedByChildOrder(ChipGroup.this));
                }
            }
        });
        super.setOnHierarchyChangeListener(this.passThroughListener);
        ViewCompat.setImportantForAccessibility(this, 1);
    }

    public void onInitializeAccessibilityNodeInfo(AccessibilityNodeInfo info) {
        int i;
        super.onInitializeAccessibilityNodeInfo(info);
        AccessibilityNodeInfoCompat infoCompat = AccessibilityNodeInfoCompat.wrap(info);
        int columnCount = isSingleLine() ? getVisibleChipCount() : -1;
        int rowCount = getRowCount();
        if (isSingleSelection()) {
            i = 1;
        } else {
            i = 2;
        }
        infoCompat.setCollectionInfo(AccessibilityNodeInfoCompat.CollectionInfoCompat.obtain(rowCount, columnCount, false, i));
    }

    public ViewGroup.LayoutParams generateLayoutParams(AttributeSet attrs) {
        return new LayoutParams(getContext(), attrs);
    }

    /* access modifiers changed from: protected */
    public ViewGroup.LayoutParams generateLayoutParams(ViewGroup.LayoutParams lp) {
        return new LayoutParams(lp);
    }

    /* access modifiers changed from: protected */
    public ViewGroup.LayoutParams generateDefaultLayoutParams() {
        return new LayoutParams(-2, -2);
    }

    /* access modifiers changed from: protected */
    public boolean checkLayoutParams(ViewGroup.LayoutParams p) {
        return super.checkLayoutParams(p) && (p instanceof LayoutParams);
    }

    public void setOnHierarchyChangeListener(ViewGroup.OnHierarchyChangeListener listener) {
        ViewGroup.OnHierarchyChangeListener unused = this.passThroughListener.onHierarchyChangeListener = listener;
    }

    /* access modifiers changed from: protected */
    public void onFinishInflate() {
        super.onFinishInflate();
        if (this.defaultCheckedId != -1) {
            this.checkableGroup.check(this.defaultCheckedId);
        }
    }

    @Deprecated
    public void setDividerDrawableHorizontal(Drawable divider) {
        throw new UnsupportedOperationException("Changing divider drawables have no effect. ChipGroup do not use divider drawables as spacing.");
    }

    @Deprecated
    public void setDividerDrawableVertical(Drawable divider) {
        throw new UnsupportedOperationException("Changing divider drawables have no effect. ChipGroup do not use divider drawables as spacing.");
    }

    @Deprecated
    public void setShowDividerHorizontal(int dividerMode) {
        throw new UnsupportedOperationException("Changing divider modes has no effect. ChipGroup do not use divider drawables as spacing.");
    }

    @Deprecated
    public void setShowDividerVertical(int dividerMode) {
        throw new UnsupportedOperationException("Changing divider modes has no effect. ChipGroup do not use divider drawables as spacing.");
    }

    @Deprecated
    public void setFlexWrap(int flexWrap) {
        throw new UnsupportedOperationException("Changing flex wrap not allowed. ChipGroup exposes a singleLine attribute instead.");
    }

    public void check(int id) {
        this.checkableGroup.check(id);
    }

    public int getCheckedChipId() {
        return this.checkableGroup.getSingleCheckedId();
    }

    public List<Integer> getCheckedChipIds() {
        return this.checkableGroup.getCheckedIdsSortedByChildOrder(this);
    }

    public void clearCheck() {
        this.checkableGroup.clearCheck();
    }

    @Deprecated
    public void setOnCheckedChangeListener(final OnCheckedChangeListener listener) {
        if (listener == null) {
            setOnCheckedStateChangeListener((OnCheckedStateChangeListener) null);
        } else {
            setOnCheckedStateChangeListener(new OnCheckedStateChangeListener() {
                public void onCheckedChanged(ChipGroup group, List<Integer> list) {
                    if (ChipGroup.this.checkableGroup.isSingleSelection()) {
                        listener.onCheckedChanged(group, ChipGroup.this.getCheckedChipId());
                    }
                }
            });
        }
    }

    public void setOnCheckedStateChangeListener(OnCheckedStateChangeListener listener) {
        this.onCheckedStateChangeListener = listener;
    }

    private int getVisibleChipCount() {
        int count = 0;
        for (int i = 0; i < getChildCount(); i++) {
            if ((getChildAt(i) instanceof Chip) && isChildVisible(i)) {
                count++;
            }
        }
        return count;
    }

    /* access modifiers changed from: package-private */
    public int getIndexOfChip(View child) {
        if (!(child instanceof Chip)) {
            return -1;
        }
        int index = 0;
        for (int i = 0; i < getChildCount(); i++) {
            View current = getChildAt(i);
            if ((current instanceof Chip) && isChildVisible(i)) {
                if (((Chip) current) == child) {
                    return index;
                }
                index++;
            }
        }
        return -1;
    }

    private boolean isChildVisible(int i) {
        return getChildAt(i).getVisibility() == 0;
    }

    public void setChipSpacing(int chipSpacing) {
        setChipSpacingHorizontal(chipSpacing);
        setChipSpacingVertical(chipSpacing);
    }

    public void setChipSpacingResource(int id) {
        setChipSpacing(getResources().getDimensionPixelOffset(id));
    }

    public int getChipSpacingHorizontal() {
        return this.chipSpacingHorizontal;
    }

    public void setChipSpacingHorizontal(int chipSpacingHorizontal2) {
        if (this.chipSpacingHorizontal != chipSpacingHorizontal2) {
            this.chipSpacingHorizontal = chipSpacingHorizontal2;
            setItemSpacing(chipSpacingHorizontal2);
            requestLayout();
        }
    }

    public void setChipSpacingHorizontalResource(int id) {
        setChipSpacingHorizontal(getResources().getDimensionPixelOffset(id));
    }

    public int getChipSpacingVertical() {
        return this.chipSpacingVertical;
    }

    public void setChipSpacingVertical(int chipSpacingVertical2) {
        if (this.chipSpacingVertical != chipSpacingVertical2) {
            this.chipSpacingVertical = chipSpacingVertical2;
            setLineSpacing(chipSpacingVertical2);
            requestLayout();
        }
    }

    public void setChipSpacingVerticalResource(int id) {
        setChipSpacingVertical(getResources().getDimensionPixelOffset(id));
    }

    public boolean isSingleLine() {
        return super.isSingleLine();
    }

    public void setSingleLine(boolean singleLine) {
        super.setSingleLine(singleLine);
    }

    public void setSingleLine(int id) {
        setSingleLine(getResources().getBoolean(id));
    }

    public boolean isSingleSelection() {
        return this.checkableGroup.isSingleSelection();
    }

    public void setSingleSelection(boolean singleSelection) {
        this.checkableGroup.setSingleSelection(singleSelection);
    }

    public void setSingleSelection(int id) {
        setSingleSelection(getResources().getBoolean(id));
    }

    public void setSelectionRequired(boolean selectionRequired) {
        this.checkableGroup.setSelectionRequired(selectionRequired);
    }

    public boolean isSelectionRequired() {
        return this.checkableGroup.isSelectionRequired();
    }

    private class PassThroughHierarchyChangeListener implements ViewGroup.OnHierarchyChangeListener {
        /* access modifiers changed from: private */
        public ViewGroup.OnHierarchyChangeListener onHierarchyChangeListener;

        private PassThroughHierarchyChangeListener() {
        }

        public void onChildViewAdded(View parent, View child) {
            if (parent == ChipGroup.this && (child instanceof Chip)) {
                if (child.getId() == -1) {
                    child.setId(ViewCompat.generateViewId());
                }
                ChipGroup.this.checkableGroup.addCheckable((Chip) child);
            }
            if (this.onHierarchyChangeListener != null) {
                this.onHierarchyChangeListener.onChildViewAdded(parent, child);
            }
        }

        public void onChildViewRemoved(View parent, View child) {
            if (parent == ChipGroup.this && (child instanceof Chip)) {
                ChipGroup.this.checkableGroup.removeCheckable((Chip) child);
            }
            if (this.onHierarchyChangeListener != null) {
                this.onHierarchyChangeListener.onChildViewRemoved(parent, child);
            }
        }
    }
}
