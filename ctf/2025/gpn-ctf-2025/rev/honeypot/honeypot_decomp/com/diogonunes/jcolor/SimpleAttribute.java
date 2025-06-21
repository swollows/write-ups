/*
 * Decompiled with CFR 0.153-SNAPSHOT (d6f6758-dirty).
 */
package com.diogonunes.jcolor;

import com.diogonunes.jcolor.Attribute;

class SimpleAttribute
extends Attribute {
    private final String _code;

    SimpleAttribute(String code2) {
        this._code = code2;
    }

    @Override
    public String toString() {
        return this._code;
    }
}

