package com.google.android.material.carousel;

import com.google.android.material.animation.AnimationUtils;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

final class KeylineState {
    private final int firstFocalKeylineIndex;
    private final float itemSize;
    private final List<Keyline> keylines;
    private final int lastFocalKeylineIndex;

    private KeylineState(float itemSize2, List<Keyline> keylines2, int firstFocalKeylineIndex2, int lastFocalKeylineIndex2) {
        this.itemSize = itemSize2;
        this.keylines = Collections.unmodifiableList(keylines2);
        this.firstFocalKeylineIndex = firstFocalKeylineIndex2;
        this.lastFocalKeylineIndex = lastFocalKeylineIndex2;
    }

    /* access modifiers changed from: package-private */
    public float getItemSize() {
        return this.itemSize;
    }

    /* access modifiers changed from: package-private */
    public List<Keyline> getKeylines() {
        return this.keylines;
    }

    /* access modifiers changed from: package-private */
    public Keyline getFirstFocalKeyline() {
        return this.keylines.get(this.firstFocalKeylineIndex);
    }

    /* access modifiers changed from: package-private */
    public int getFirstFocalKeylineIndex() {
        return this.firstFocalKeylineIndex;
    }

    /* access modifiers changed from: package-private */
    public Keyline getLastFocalKeyline() {
        return this.keylines.get(this.lastFocalKeylineIndex);
    }

    /* access modifiers changed from: package-private */
    public int getLastFocalKeylineIndex() {
        return this.lastFocalKeylineIndex;
    }

    /* access modifiers changed from: package-private */
    public List<Keyline> getFocalKeylines() {
        return this.keylines.subList(this.firstFocalKeylineIndex, this.lastFocalKeylineIndex + 1);
    }

    /* access modifiers changed from: package-private */
    public Keyline getFirstKeyline() {
        return this.keylines.get(0);
    }

    /* access modifiers changed from: package-private */
    public Keyline getLastKeyline() {
        return this.keylines.get(this.keylines.size() - 1);
    }

    /* access modifiers changed from: package-private */
    public Keyline getFirstNonAnchorKeyline() {
        for (int i = 0; i < this.keylines.size(); i++) {
            Keyline keyline = this.keylines.get(i);
            if (!keyline.isAnchor) {
                return keyline;
            }
        }
        return null;
    }

    /* access modifiers changed from: package-private */
    public Keyline getLastNonAnchorKeyline() {
        for (int i = this.keylines.size() - 1; i >= 0; i--) {
            Keyline keyline = this.keylines.get(i);
            if (!keyline.isAnchor) {
                return keyline;
            }
        }
        return null;
    }

    /* access modifiers changed from: package-private */
    public int getNumberOfNonAnchorKeylines() {
        int anchorKeylines = 0;
        for (Keyline keyline : this.keylines) {
            if (keyline.isAnchor) {
                anchorKeylines++;
            }
        }
        return this.keylines.size() - anchorKeylines;
    }

    static KeylineState lerp(KeylineState from, KeylineState to, float progress) {
        if (from.getItemSize() == to.getItemSize()) {
            List<Keyline> fromKeylines = from.getKeylines();
            List<Keyline> toKeylines = to.getKeylines();
            if (fromKeylines.size() == toKeylines.size()) {
                List<Keyline> keylines2 = new ArrayList<>();
                for (int i = 0; i < from.getKeylines().size(); i++) {
                    keylines2.add(Keyline.lerp(fromKeylines.get(i), toKeylines.get(i), progress));
                }
                return new KeylineState(from.getItemSize(), keylines2, AnimationUtils.lerp(from.getFirstFocalKeylineIndex(), to.getFirstFocalKeylineIndex(), progress), AnimationUtils.lerp(from.getLastFocalKeylineIndex(), to.getLastFocalKeylineIndex(), progress));
            }
            throw new IllegalArgumentException("Keylines being linearly interpolated must have the same number of keylines.");
        }
        throw new IllegalArgumentException("Keylines being linearly interpolated must have the same item size.");
    }

    static KeylineState reverse(KeylineState keylineState, float availableSpace) {
        Builder builder = new Builder(keylineState.getItemSize(), availableSpace);
        float start = (availableSpace - keylineState.getLastKeyline().locOffset) - (keylineState.getLastKeyline().maskedItemSize / 2.0f);
        int i = keylineState.getKeylines().size() - 1;
        while (i >= 0) {
            Keyline k = keylineState.getKeylines().get(i);
            builder.addKeyline(start + (k.maskedItemSize / 2.0f), k.mask, k.maskedItemSize, i >= keylineState.getFirstFocalKeylineIndex() && i <= keylineState.getLastFocalKeylineIndex(), k.isAnchor);
            start += k.maskedItemSize;
            i--;
        }
        return builder.build();
    }

    static final class Builder {
        private static final int NO_INDEX = -1;
        private static final float UNKNOWN_LOC = Float.MIN_VALUE;
        private final float availableSpace;
        private int firstFocalKeylineIndex = -1;
        private final float itemSize;
        private int lastFocalKeylineIndex = -1;
        private float lastKeylineMaskedSize = 0.0f;
        private int latestAnchorKeylineIndex = -1;
        private Keyline tmpFirstFocalKeyline;
        private final List<Keyline> tmpKeylines = new ArrayList();
        private Keyline tmpLastFocalKeyline;

        Builder(float itemSize2, float availableSpace2) {
            this.itemSize = itemSize2;
            this.availableSpace = availableSpace2;
        }

        /* access modifiers changed from: package-private */
        public Builder addKeyline(float offsetLoc, float mask, float maskedItemSize, boolean isFocal) {
            return addKeyline(offsetLoc, mask, maskedItemSize, isFocal, false);
        }

        /* access modifiers changed from: package-private */
        public Builder addKeyline(float offsetLoc, float mask, float maskedItemSize) {
            return addKeyline(offsetLoc, mask, maskedItemSize, false);
        }

        /* access modifiers changed from: package-private */
        public Builder addKeyline(float offsetLoc, float mask, float maskedItemSize, boolean isFocal, boolean isAnchor, float cutoff, float leftOrTopPaddingShift, float rightOrBottomPaddingShift) {
            if (maskedItemSize <= 0.0f) {
                return this;
            }
            if (isAnchor) {
                if (isFocal) {
                    throw new IllegalArgumentException("Anchor keylines cannot be focal.");
                } else if (this.latestAnchorKeylineIndex == -1 || this.latestAnchorKeylineIndex == 0) {
                    this.latestAnchorKeylineIndex = this.tmpKeylines.size();
                } else {
                    throw new IllegalArgumentException("Anchor keylines must be either the first or last keyline.");
                }
            }
            Keyline tmpKeyline = new Keyline(Float.MIN_VALUE, offsetLoc, mask, maskedItemSize, isAnchor, cutoff, leftOrTopPaddingShift, rightOrBottomPaddingShift);
            if (isFocal) {
                if (this.tmpFirstFocalKeyline == null) {
                    this.tmpFirstFocalKeyline = tmpKeyline;
                    this.firstFocalKeylineIndex = this.tmpKeylines.size();
                }
                if (this.lastFocalKeylineIndex != -1 && this.tmpKeylines.size() - this.lastFocalKeylineIndex > 1) {
                    throw new IllegalArgumentException("Keylines marked as focal must be placed next to each other. There cannot be non-focal keylines between focal keylines.");
                } else if (maskedItemSize == this.tmpFirstFocalKeyline.maskedItemSize) {
                    this.tmpLastFocalKeyline = tmpKeyline;
                    this.lastFocalKeylineIndex = this.tmpKeylines.size();
                } else {
                    throw new IllegalArgumentException("Keylines that are marked as focal must all have the same masked item size.");
                }
            } else if (this.tmpFirstFocalKeyline == null && tmpKeyline.maskedItemSize < this.lastKeylineMaskedSize) {
                throw new IllegalArgumentException("Keylines before the first focal keyline must be ordered by incrementing masked item size.");
            } else if (this.tmpLastFocalKeyline != null && tmpKeyline.maskedItemSize > this.lastKeylineMaskedSize) {
                throw new IllegalArgumentException("Keylines after the last focal keyline must be ordered by decreasing masked item size.");
            }
            this.lastKeylineMaskedSize = tmpKeyline.maskedItemSize;
            this.tmpKeylines.add(tmpKeyline);
            return this;
        }

        /* access modifiers changed from: package-private */
        public Builder addKeyline(float offsetLoc, float mask, float maskedItemSize, boolean isFocal, boolean isAnchor, float cutoff) {
            return addKeyline(offsetLoc, mask, maskedItemSize, isFocal, isAnchor, cutoff, 0.0f, 0.0f);
        }

        /* access modifiers changed from: package-private */
        public Builder addKeyline(float offsetLoc, float mask, float maskedItemSize, boolean isFocal, boolean isAnchor) {
            float cutoff = 0.0f;
            float keylineStart = offsetLoc - (maskedItemSize / 2.0f);
            float keylineEnd = (maskedItemSize / 2.0f) + offsetLoc;
            if (keylineEnd > this.availableSpace) {
                cutoff = Math.abs(keylineEnd - Math.max(keylineEnd - maskedItemSize, this.availableSpace));
            } else if (keylineStart < 0.0f) {
                cutoff = Math.abs(keylineStart - Math.min(keylineStart + maskedItemSize, 0.0f));
            }
            return addKeyline(offsetLoc, mask, maskedItemSize, isFocal, isAnchor, cutoff);
        }

        /* access modifiers changed from: package-private */
        public Builder addAnchorKeyline(float offsetLoc, float mask, float maskedItemSize) {
            return addKeyline(offsetLoc, mask, maskedItemSize, false, true);
        }

        /* access modifiers changed from: package-private */
        public Builder addKeylineRange(float offsetLoc, float mask, float maskedItemSize, int count) {
            return addKeylineRange(offsetLoc, mask, maskedItemSize, count, false);
        }

        /* access modifiers changed from: package-private */
        public Builder addKeylineRange(float offsetLoc, float mask, float maskedItemSize, int count, boolean isFocal) {
            if (count <= 0 || maskedItemSize <= 0.0f) {
                return this;
            }
            for (int i = 0; i < count; i++) {
                addKeyline((((float) i) * maskedItemSize) + offsetLoc, mask, maskedItemSize, isFocal);
            }
            return this;
        }

        /* access modifiers changed from: package-private */
        public KeylineState build() {
            if (this.tmpFirstFocalKeyline != null) {
                List<Keyline> keylines = new ArrayList<>();
                for (int i = 0; i < this.tmpKeylines.size(); i++) {
                    Keyline tmpKeyline = this.tmpKeylines.get(i);
                    keylines.add(new Keyline(calculateKeylineLocationForItemPosition(this.tmpFirstFocalKeyline.locOffset, this.itemSize, this.firstFocalKeylineIndex, i), tmpKeyline.locOffset, tmpKeyline.mask, tmpKeyline.maskedItemSize, tmpKeyline.isAnchor, tmpKeyline.cutoff, tmpKeyline.leftOrTopPaddingShift, tmpKeyline.rightOrBottomPaddingShift));
                }
                return new KeylineState(this.itemSize, keylines, this.firstFocalKeylineIndex, this.lastFocalKeylineIndex);
            }
            throw new IllegalStateException("There must be a keyline marked as focal.");
        }

        private static float calculateKeylineLocationForItemPosition(float firstFocalLoc, float itemSize2, int firstFocalPosition, int itemPosition) {
            return (firstFocalLoc - (((float) firstFocalPosition) * itemSize2)) + (((float) itemPosition) * itemSize2);
        }
    }

    static final class Keyline {
        final float cutoff;
        final boolean isAnchor;
        final float leftOrTopPaddingShift;
        final float loc;
        final float locOffset;
        final float mask;
        final float maskedItemSize;
        final float rightOrBottomPaddingShift;

        Keyline(float loc2, float locOffset2, float mask2, float maskedItemSize2) {
            this(loc2, locOffset2, mask2, maskedItemSize2, false, 0.0f, 0.0f, 0.0f);
        }

        Keyline(float loc2, float locOffset2, float mask2, float maskedItemSize2, boolean isAnchor2, float cutoff2, float leftOrTopPaddingShift2, float rightOrBottomPaddingShift2) {
            this.loc = loc2;
            this.locOffset = locOffset2;
            this.mask = mask2;
            this.maskedItemSize = maskedItemSize2;
            this.isAnchor = isAnchor2;
            this.cutoff = cutoff2;
            this.leftOrTopPaddingShift = leftOrTopPaddingShift2;
            this.rightOrBottomPaddingShift = rightOrBottomPaddingShift2;
        }

        static Keyline lerp(Keyline from, Keyline to, float progress) {
            return new Keyline(AnimationUtils.lerp(from.loc, to.loc, progress), AnimationUtils.lerp(from.locOffset, to.locOffset, progress), AnimationUtils.lerp(from.mask, to.mask, progress), AnimationUtils.lerp(from.maskedItemSize, to.maskedItemSize, progress));
        }
    }
}
