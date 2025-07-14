package com.google.android.material.color;

public class ColorContrastOptions {
    private final int highContrastThemeOverlayResourceId;
    private final int mediumContrastThemeOverlayResourceId;

    private ColorContrastOptions(Builder builder) {
        this.mediumContrastThemeOverlayResourceId = builder.mediumContrastThemeOverlayResourceId;
        this.highContrastThemeOverlayResourceId = builder.highContrastThemeOverlayResourceId;
    }

    public int getMediumContrastThemeOverlay() {
        return this.mediumContrastThemeOverlayResourceId;
    }

    public int getHighContrastThemeOverlay() {
        return this.highContrastThemeOverlayResourceId;
    }

    public static class Builder {
        /* access modifiers changed from: private */
        public int highContrastThemeOverlayResourceId;
        /* access modifiers changed from: private */
        public int mediumContrastThemeOverlayResourceId;

        public Builder setMediumContrastThemeOverlay(int mediumContrastThemeOverlayResourceId2) {
            this.mediumContrastThemeOverlayResourceId = mediumContrastThemeOverlayResourceId2;
            return this;
        }

        public Builder setHighContrastThemeOverlay(int highContrastThemeOverlayResourceId2) {
            this.highContrastThemeOverlayResourceId = highContrastThemeOverlayResourceId2;
            return this;
        }

        public ColorContrastOptions build() {
            return new ColorContrastOptions(this);
        }
    }
}
