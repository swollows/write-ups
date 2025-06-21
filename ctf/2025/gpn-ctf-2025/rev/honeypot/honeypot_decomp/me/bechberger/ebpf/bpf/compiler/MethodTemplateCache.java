/*
 * Decompiled with CFR 0.153-SNAPSHOT (d6f6758-dirty).
 * 
 * Could not load the following classes:
 *  com.sun.source.tree.Tree
 *  com.sun.tools.javac.code.Symbol
 *  com.sun.tools.javac.code.Symbol$ClassSymbol
 *  com.sun.tools.javac.code.Symbol$MethodSymbol
 *  com.sun.tools.javac.code.Symbol$RecordComponent
 *  com.sun.tools.javac.code.Symbol$VarSymbol
 */
package me.bechberger.ebpf.bpf.compiler;

import com.sun.source.tree.Tree;
import com.sun.tools.javac.code.Symbol;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Optional;
import me.bechberger.cast.CAST;
import me.bechberger.ebpf.annotations.Type;
import me.bechberger.ebpf.annotations.bpf.BPFFunction;
import me.bechberger.ebpf.annotations.bpf.BPFFunctionAlternative;
import me.bechberger.ebpf.annotations.bpf.BuiltinBPFFunction;
import me.bechberger.ebpf.bpf.compiler.CompilerPlugin;
import me.bechberger.ebpf.bpf.compiler.MethodTemplate;
import org.jetbrains.annotations.Nullable;

public class MethodTemplateCache {
    private static final Map<String, Map<String, MethodTemplate>> SPECIAL_CASES = Map.of((Object)"java.lang.String", (Object)Map.ofEntries((Map.Entry[])new Map.Entry[]{MethodTemplateCache.entry("length", "$strlen$this"), MethodTemplateCache.entry("charAt", "$this[$arg1]"), MethodTemplateCache.entry("getBytes", "($this)")}));
    private static final Map<String, Map<String, MethodTemplate>> AUTO_BOXING = Map.of((Object)"java.lang.Short", (Object)Map.ofEntries((Map.Entry[])new Map.Entry[]{MethodTemplateCache.entry("shortValue", "($this)"), MethodTemplateCache.entry("valueOf", "($arg1)")}), (Object)"java.lang.Integer", (Object)Map.ofEntries((Map.Entry[])new Map.Entry[]{MethodTemplateCache.entry("intValue", "($this)"), MethodTemplateCache.entry("valueOf", "($arg1)")}), (Object)"java.lang.Long", (Object)Map.ofEntries((Map.Entry[])new Map.Entry[]{MethodTemplateCache.entry("longValue", "($this)"), MethodTemplateCache.entry("valueOf", "($arg1)")}), (Object)"java.lang.Float", (Object)Map.ofEntries((Map.Entry[])new Map.Entry[]{MethodTemplateCache.entry("floatValue", "($this)"), MethodTemplateCache.entry("valueOf", "($arg1)")}), (Object)"java.lang.Double", (Object)Map.ofEntries((Map.Entry[])new Map.Entry[]{MethodTemplateCache.entry("doubleValue", "($this)"), MethodTemplateCache.entry("valueOf", "($arg1)")}), (Object)"java.lang.Character", (Object)Map.ofEntries((Map.Entry[])new Map.Entry[]{MethodTemplateCache.entry("charValue", "($this)"), MethodTemplateCache.entry("valueOf", "($arg1)")}), (Object)"java.lang.Byte", (Object)Map.ofEntries((Map.Entry[])new Map.Entry[]{MethodTemplateCache.entry("byteValue", "($this)"), MethodTemplateCache.entry("valueOf", "($arg1)")}), (Object)"java.lang.Boolean", (Object)Map.ofEntries((Map.Entry[])new Map.Entry[]{MethodTemplateCache.entry("booleanValue", "($this)"), MethodTemplateCache.entry("valueOf", "($arg1)")}));
    private final CompilerPlugin compilerPlugin;
    private final Map<Symbol.MethodSymbol, MethodTemplate> cache;

    private static Map.Entry<String, MethodTemplate> entry(String methodName, String template) {
        return Map.entry((Object)methodName, (Object)((Object)MethodTemplate.parse(methodName, template)));
    }

    public MethodTemplateCache(CompilerPlugin compilerPlugin) {
        this.compilerPlugin = compilerPlugin;
        this.cache = new HashMap<Symbol.MethodSymbol, MethodTemplate>();
    }

    @Nullable
    public MethodTemplate getMethodTemplate(CompilerPlugin.TypedTreePath<?> path2, Tree invocation, Symbol.MethodSymbol methodSymbol) {
        MethodTemplate specialCase = this.handleSpecialCases(methodSymbol);
        return specialCase != null ? specialCase : this.cache.computeIfAbsent(methodSymbol, k -> this.create(path2, invocation, (Symbol.MethodSymbol)k));
    }

    public CAST.PrimaryExpression.VerbatimExpression render(CompilerPlugin.TypedTreePath<?> path2, Tree invocation, Symbol.MethodSymbol methodSymbol, MethodTemplate.CallArgs args) {
        MethodTemplate template = this.getMethodTemplate(path2, invocation, methodSymbol);
        if (template == null) {
            throw new TemplateRenderException("No template found for method " + String.valueOf(methodSymbol.getSimpleName()));
        }
        try {
            return template.call(args);
        } catch (TemplateRenderException e) {
            throw new TemplateRenderException("Can't render template for method " + String.valueOf(methodSymbol.getSimpleName()) + " (" + template.raw() + "): " + e.getMessage());
        }
    }

    @Nullable
    private MethodTemplate handleSpecialCases(Symbol.MethodSymbol symbol) {
        String className = symbol.owner.getQualifiedName().toString();
        String methodName = symbol.getSimpleName().toString();
        if (SPECIAL_CASES.containsKey(className)) {
            return SPECIAL_CASES.get(className).get(methodName);
        }
        if (AUTO_BOXING.containsKey(className)) {
            return AUTO_BOXING.get(className).get(methodName);
        }
        return null;
    }

    public boolean isAutoUnboxing(Symbol.MethodSymbol symbol) {
        String className = symbol.owner.getQualifiedName().toString();
        String methodName = symbol.getSimpleName().toString();
        return AUTO_BOXING.containsKey(className) && AUTO_BOXING.get(className).containsKey(methodName);
    }

    private MethodTemplate create(CompilerPlugin.TypedTreePath<?> path2, Tree invocation, Symbol.MethodSymbol symbol) {
        BuiltinBPFFunction ann = (BuiltinBPFFunction)symbol.getAnnotation(BuiltinBPFFunction.class);
        BPFFunction ann2 = this.compilerPlugin.getAnnotationOfMethodOrSuper(symbol, BPFFunction.class);
        if (ann == null && ann2 == null) {
            BPFFunctionAlternative altAnn = (BPFFunctionAlternative)symbol.getAnnotation(BPFFunctionAlternative.class);
            if (altAnn != null) {
                throw new TemplateRenderException("Method " + String.valueOf(symbol.getQualifiedName()) + " cannot be used, please use " + altAnn.value() + " instead");
            }
            if (symbol.getEnclosingElement().getKind().isClass()) {
                Symbol.ClassSymbol record = (Symbol.ClassSymbol)symbol.getEnclosingElement();
                Type recordAnn = (Type)record.getAnnotation(Type.class);
                if (recordAnn == null || !record.isRecord()) {
                    Object constantValue;
                    Symbol.ClassSymbol baseRecord;
                    Symbol symbol2;
                    List similarMembers = record.getEnclosedElements().stream().filter(s2 -> s2.getSimpleName().equals((Object)symbol.getSimpleName())).toList();
                    if (similarMembers.isEmpty() && (symbol2 = symbol.baseSymbol().getEnclosingElement()) instanceof Symbol.ClassSymbol && !(baseRecord = (Symbol.ClassSymbol)symbol2).isRecord()) {
                        similarMembers = baseRecord.getEnclosedElements().stream().filter(s2 -> s2.getSimpleName().equals((Object)symbol.getSimpleName())).toList();
                    }
                    Optional<Symbol> backingVariable = similarMembers.stream().filter(s2 -> s2 instanceof Symbol.VarSymbol).findFirst();
                    if (symbol.isStatic() && similarMembers.size() == 2 && backingVariable.isPresent() && (constantValue = ((Symbol.VarSymbol)backingVariable.get()).getConstantValue()) != null) {
                        return MethodTemplate.parse(symbol.getSimpleName().toString(), CAST.Expression.constant(constantValue).toPrettyString(), symbol);
                    }
                    throw new TemplateRenderException("Method " + String.valueOf(symbol.getQualifiedName()) + " is not in a record annotated with @Type");
                }
                Optional<Symbol.RecordComponent> field = record.getRecordComponents().stream().filter(f -> f.getSimpleName().equals((Object)symbol.getSimpleName())).findFirst();
                if (field.isEmpty()) {
                    throw new TemplateRenderException("Method " + String.valueOf(symbol.getQualifiedName()) + " is not a record field accessor and is not annotated with @BuiltinBPFFunction");
                }
                return MethodTemplate.parse(symbol.getSimpleName().toString(), "$this.$name", symbol);
            }
            throw new TemplateRenderException("Method " + String.valueOf(symbol.getQualifiedName()) + " is not annotated with @BuiltinBPFFunction");
        }
        String template = ann != null ? ann.value() : ann2.callTemplate();
        try {
            return MethodTemplate.parse(symbol.getSimpleName().toString(), template, symbol);
        } catch (TemplateRenderException e) {
            this.compilerPlugin.logError(path2, invocation, "Can't parse template for method " + String.valueOf(symbol.getSimpleName()) + ": " + e.getMessage());
            return new MethodTemplate(symbol.getSimpleName().toString(), "", List.of());
        }
    }

    public static class TemplateRenderException
    extends RuntimeException {
        public TemplateRenderException(String message) {
            super(message);
        }
    }
}

