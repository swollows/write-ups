/*
 * Decompiled with CFR 0.153-SNAPSHOT (d6f6758-dirty).
 */
package com.squareup.javapoet;

import com.squareup.javapoet.Util;
import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import java.util.Map;
import java.util.Set;
import java.util.UUID;
import javax.lang.model.SourceVersion;

public final class NameAllocator
implements Cloneable {
    private final Set<String> allocatedNames;
    private final Map<Object, String> tagToName;

    public NameAllocator() {
        this(new LinkedHashSet<String>(), new LinkedHashMap<Object, String>());
    }

    private NameAllocator(LinkedHashSet<String> allocatedNames, LinkedHashMap<Object, String> tagToName) {
        this.allocatedNames = allocatedNames;
        this.tagToName = tagToName;
    }

    public String newName(String suggestion) {
        return this.newName(suggestion, UUID.randomUUID().toString());
    }

    public String newName(String suggestion, Object tag) {
        Util.checkNotNull(suggestion, "suggestion", new Object[0]);
        Util.checkNotNull(tag, "tag", new Object[0]);
        suggestion = NameAllocator.toJavaIdentifier(suggestion);
        while (SourceVersion.isKeyword(suggestion) || !this.allocatedNames.add(suggestion)) {
            suggestion = suggestion + "_";
        }
        String replaced = this.tagToName.put(tag, suggestion);
        if (replaced != null) {
            this.tagToName.put(tag, replaced);
            throw new IllegalArgumentException("tag " + tag + " cannot be used for both '" + replaced + "' and '" + suggestion + "'");
        }
        return suggestion;
    }

    public static String toJavaIdentifier(String suggestion) {
        int codePoint;
        StringBuilder result = new StringBuilder();
        for (int i = 0; i < suggestion.length(); i += Character.charCount(codePoint)) {
            codePoint = suggestion.codePointAt(i);
            if (i == 0 && !Character.isJavaIdentifierStart(codePoint) && Character.isJavaIdentifierPart(codePoint)) {
                result.append("_");
            }
            int validCodePoint = Character.isJavaIdentifierPart(codePoint) ? codePoint : 95;
            result.appendCodePoint(validCodePoint);
        }
        return result.toString();
    }

    public String get(Object tag) {
        String result = this.tagToName.get(tag);
        if (result == null) {
            throw new IllegalArgumentException("unknown tag: " + tag);
        }
        return result;
    }

    public NameAllocator clone() {
        return new NameAllocator(new LinkedHashSet<String>(this.allocatedNames), new LinkedHashMap<Object, String>(this.tagToName));
    }
}

