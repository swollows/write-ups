/*
 * Decompiled with CFR 0.153-SNAPSHOT (d6f6758-dirty).
 */
package com.diogonunes.jcolor;

import com.diogonunes.jcolor.Ansi;
import com.diogonunes.jcolor.Attribute;
import java.util.ArrayList;
import java.util.Arrays;

public class AnsiFormat {
    private final ArrayList<Attribute> _attributes = new ArrayList(2);

    public AnsiFormat(Attribute ... attributes) {
        this._attributes.addAll(Arrays.asList(attributes));
    }

    public String format(String text) {
        return Ansi.colorize(text, this.toArray());
    }

    protected Attribute[] toArray() {
        return this._attributes.toArray(new Attribute[0]);
    }
}

