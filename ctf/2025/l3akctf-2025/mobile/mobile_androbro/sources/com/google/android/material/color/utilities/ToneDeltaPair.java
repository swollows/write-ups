package com.google.android.material.color.utilities;

public final class ToneDeltaPair {
    private final double delta;
    private final TonePolarity polarity;
    private final DynamicColor roleA;
    private final DynamicColor roleB;
    private final boolean stayTogether;

    public ToneDeltaPair(DynamicColor roleA2, DynamicColor roleB2, double delta2, TonePolarity polarity2, boolean stayTogether2) {
        this.roleA = roleA2;
        this.roleB = roleB2;
        this.delta = delta2;
        this.polarity = polarity2;
        this.stayTogether = stayTogether2;
    }

    public DynamicColor getRoleA() {
        return this.roleA;
    }

    public DynamicColor getRoleB() {
        return this.roleB;
    }

    public double getDelta() {
        return this.delta;
    }

    public TonePolarity getPolarity() {
        return this.polarity;
    }

    public boolean getStayTogether() {
        return this.stayTogether;
    }
}
