/*
 * Decompiled with CFR 0.153-SNAPSHOT (d6f6758-dirty).
 */
package com.squareup.javapoet;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;
import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;
import javax.lang.model.element.Modifier;

final class Util {
    private Util() {
    }

    static <K, V> Map<K, List<V>> immutableMultimap(Map<K, List<V>> multimap) {
        LinkedHashMap result = new LinkedHashMap();
        for (Map.Entry<K, List<V>> entry : multimap.entrySet()) {
            if (entry.getValue().isEmpty()) continue;
            result.put(entry.getKey(), Util.immutableList((Collection)entry.getValue()));
        }
        return Collections.unmodifiableMap(result);
    }

    static <K, V> Map<K, V> immutableMap(Map<K, V> map2) {
        return Collections.unmodifiableMap(new LinkedHashMap<K, V>(map2));
    }

    static void checkArgument(boolean condition, String format, Object ... args) {
        if (!condition) {
            throw new IllegalArgumentException(String.format(format, args));
        }
    }

    static <T> T checkNotNull(T reference, String format, Object ... args) {
        if (reference == null) {
            throw new NullPointerException(String.format(format, args));
        }
        return reference;
    }

    static void checkState(boolean condition, String format, Object ... args) {
        if (!condition) {
            throw new IllegalStateException(String.format(format, args));
        }
    }

    static <T> List<T> immutableList(Collection<T> collection) {
        return Collections.unmodifiableList(new ArrayList<T>(collection));
    }

    static <T> Set<T> immutableSet(Collection<T> set) {
        return Collections.unmodifiableSet(new LinkedHashSet<T>(set));
    }

    static <T> Set<T> union(Set<T> a, Set<T> b) {
        LinkedHashSet<T> result = new LinkedHashSet<T>();
        result.addAll(a);
        result.addAll(b);
        return result;
    }

    static void requireExactlyOneOf(Set<Modifier> modifiers, Modifier ... mutuallyExclusive) {
        int count = 0;
        for (Modifier modifier : mutuallyExclusive) {
            if (!modifiers.contains((Object)modifier)) continue;
            ++count;
        }
        Util.checkArgument(count == 1, "modifiers %s must contain one of %s", modifiers, Arrays.toString((Object[])mutuallyExclusive));
    }

    static String characterLiteralWithoutSingleQuotes(char c) {
        switch (c) {
            case '\b': {
                return "\\b";
            }
            case '\t': {
                return "\\t";
            }
            case '\n': {
                return "\\n";
            }
            case '\f': {
                return "\\f";
            }
            case '\r': {
                return "\\r";
            }
            case '\"': {
                return "\"";
            }
            case '\'': {
                return "\\'";
            }
            case '\\': {
                return "\\\\";
            }
        }
        return Character.isISOControl(c) ? String.format("\\u%04x", c) : Character.toString(c);
    }

    static String stringLiteralWithDoubleQuotes(String value, String indent) {
        StringBuilder result = new StringBuilder(value.length() + 2);
        result.append('\"');
        for (int i = 0; i < value.length(); ++i) {
            char c = value.charAt(i);
            if (c == '\'') {
                result.append("'");
                continue;
            }
            if (c == '\"') {
                result.append("\\\"");
                continue;
            }
            result.append(Util.characterLiteralWithoutSingleQuotes(c));
            if (c != '\n' || i + 1 >= value.length()) continue;
            result.append("\"\n").append(indent).append(indent).append("+ \"");
        }
        result.append('\"');
        return result.toString();
    }
}

