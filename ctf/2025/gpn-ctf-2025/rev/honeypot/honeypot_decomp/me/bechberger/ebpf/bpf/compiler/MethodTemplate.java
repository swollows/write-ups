/*
 * Decompiled with CFR 0.153-SNAPSHOT (d6f6758-dirty).
 * 
 * Could not load the following classes:
 *  com.sun.tools.javac.code.Symbol$MethodSymbol
 *  com.sun.tools.javac.code.Symbol$VarSymbol
 *  com.sun.tools.javac.code.Type
 */
package me.bechberger.ebpf.bpf.compiler;

import com.sun.tools.javac.code.Symbol;
import com.sun.tools.javac.code.Type;
import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.IntStream;
import javax.lang.model.type.TypeKind;
import me.bechberger.cast.CAST;
import me.bechberger.ebpf.bpf.compiler.MethodTemplateCache;
import me.bechberger.ebpf.type.Ptr;
import org.jetbrains.annotations.Nullable;

public record MethodTemplate(String methodName, String raw, List<TemplatePart> parts) {
    static MethodTemplate parse(String methodName, String template) {
        return MethodTemplate.parse(methodName, template, null);
    }

    /*
     * Enabled force condition propagation
     * Lifted jumps to return sites
     */
    static MethodTemplate parse(String methodName, String template, @Nullable Symbol.MethodSymbol methodSymbol) {
        if (template.isEmpty()) {
            return new MethodTemplate(methodName, template, List.of());
        }
        String[] parts = template.split("\\$");
        ArrayList<TemplatePart> templateParts = new ArrayList<TemplatePart>();
        for (int i = 0; i < parts.length; ++i) {
            String part = parts[i];
            if (part.isEmpty()) continue;
            if (i == 0) {
                templateParts.add(new TemplatePart.Verbatim(part));
                continue;
            }
            boolean hadStrLenBefore = false;
            boolean hadStrBefore = false;
            boolean hadPointeryBefore = false;
            if (part.startsWith("strlen")) {
                if (part.equals("strlen")) {
                    hadStrLenBefore = true;
                    part = parts[++i];
                }
            } else if (part.startsWith("str")) {
                if (part.equals("str")) {
                    hadStrBefore = true;
                    part = parts[++i];
                }
            } else if (part.equals("pointery")) {
                hadPointeryBefore = true;
                part = parts[++i];
            } else if (part.startsWith("lambda")) {
                int lambdaNum;
                int end;
                for (end = 6; end < part.length() && Character.isDigit(part.charAt(end)); ++end) {
                }
                try {
                    lambdaNum = Integer.parseInt(part.substring(6, end));
                } catch (NumberFormatException e) {
                    throw new MethodTemplateCache.TemplateRenderException("Invalid lambda number: $" + part);
                }
                String rest = part.substring(end);
                if (!rest.startsWith(":")) {
                    throw new MethodTemplateCache.TemplateRenderException("Invalid lambda part: $" + part + ", missing ':' after lambda number");
                }
                if ((rest = rest.substring(1)).startsWith("code")) {
                    templateParts.add(new TemplatePart.LambdaCode(lambdaNum - 1));
                    part = rest.substring(4);
                } else {
                    int paramNum;
                    if (!rest.startsWith("param")) throw new MethodTemplateCache.TemplateRenderException("Unknown lambda part: $" + part);
                    for (end = 5; end < rest.length() && Character.isDigit(rest.charAt(end)); ++end) {
                    }
                    try {
                        paramNum = Integer.parseInt(rest.substring(5, end));
                    } catch (NumberFormatException e) {
                        throw new MethodTemplateCache.TemplateRenderException("Invalid lambda parameter number: $" + part);
                    }
                    String rest2 = rest.substring(end);
                    if (!rest2.startsWith(":")) {
                        templateParts.add(new TemplatePart.LambdaParam(lambdaNum - 1, paramNum - 1));
                        part = rest2;
                    } else if ((rest2 = rest2.substring(1)).startsWith("type")) {
                        templateParts.add(new TemplatePart.LambdaParamType(lambdaNum - 1, paramNum - 1));
                        part = rest2.substring(4);
                    } else {
                        if (!rest2.startsWith("name")) throw new MethodTemplateCache.TemplateRenderException("Unknown lambda part: $" + part);
                        templateParts.add(new TemplatePart.LambdaParamName(lambdaNum - 1, paramNum - 1));
                        part = rest2.substring(4);
                    }
                }
                if (part.isEmpty()) continue;
                templateParts.add(new TemplatePart.Verbatim(part));
                continue;
            }
            if (part.startsWith("name")) {
                templateParts.add(new TemplatePart.Name());
                part = part.substring(4);
            } else if (part.startsWith("this")) {
                templateParts.add((TemplatePart)(hadStrLenBefore ? new TemplatePart.StrLenThis() : new TemplatePart.This()));
                part = part.substring(4);
            } else {
                int k;
                int j;
                for (j = 0; j < part.length() && Character.isAlphabetic(part.charAt(j)); ++j) {
                }
                String name = part.substring(0, j);
                if (name.isEmpty()) {
                    throw new MethodTemplateCache.TemplateRenderException("Unknown template part: $" + part);
                }
                for (k = j; k < part.length() && Character.isDigit(part.charAt(k)); ++k) {
                }
                String numStr = part.substring(j, k);
                switch (name) {
                    case "args": {
                        if (numStr.isEmpty()) {
                            templateParts.add(new TemplatePart.Args());
                            break;
                        }
                        templateParts.add(new TemplatePart.SubArgs(Integer.parseInt(numStr) - 1));
                        if (k >= part.length() || part.charAt(k) != '_') break;
                        ++k;
                        break;
                    }
                    case "arg": {
                        int num;
                        try {
                            num = Integer.parseInt(numStr) - 1;
                        } catch (NumberFormatException e) {
                            throw new MethodTemplateCache.TemplateRenderException("Invalid argument number: $" + part);
                        }
                        if (k < part.length() && part.charAt(k) == '_') {
                            templateParts.add(new TemplatePart.SubArgs(num));
                            ++k;
                            break;
                        }
                        if (hadStrBefore) {
                            templateParts.add(new TemplatePart.StrArg(num));
                            break;
                        }
                        if (hadStrLenBefore) {
                            templateParts.add(new TemplatePart.StrLenArg(num));
                            break;
                        }
                        if (hadPointeryBefore) {
                            if (methodSymbol == null) {
                                throw new AssertionError();
                            }
                            Type type2 = ((Symbol.VarSymbol)methodSymbol.getParameters().get(num)).asType();
                            String typeName = type2.baseType().asElement().getQualifiedName().toString();
                            if (type2.getKind() == TypeKind.ARRAY || typeName.equals("java.lang.String") || typeName.equals(Ptr.class.getName())) {
                                templateParts.add(new TemplatePart.Arg(num));
                                break;
                            }
                            templateParts.add(new TemplatePart.PointeryArg(num));
                            break;
                        }
                        templateParts.add(new TemplatePart.Arg(num));
                        break;
                    }
                    case "T": {
                        try {
                            templateParts.add(new TemplatePart.TypeArgument(Integer.parseInt(numStr) - 1));
                            break;
                        } catch (NumberFormatException e) {
                            throw new MethodTemplateCache.TemplateRenderException("Invalid type argument number: $" + part);
                        }
                    }
                    case "C": {
                        try {
                            templateParts.add(new TemplatePart.ClassTypeArgument(Integer.parseInt(numStr) - 1));
                            break;
                        } catch (NumberFormatException e) {
                            throw new MethodTemplateCache.TemplateRenderException("Invalid class type argument number: $" + part);
                        }
                    }
                    default: {
                        throw new MethodTemplateCache.TemplateRenderException("Unknown template part: $" + part);
                    }
                }
                part = part.substring(k);
            }
            if (hadStrLenBefore && !(templateParts.getLast() instanceof TemplatePart.StrLen)) {
                throw new MethodTemplateCache.TemplateRenderException("strlen can only be used with a $argN or $this argument");
            }
            if (hadStrBefore && !(templateParts.getLast() instanceof TemplatePart.StrArg)) {
                throw new MethodTemplateCache.TemplateRenderException("str can only be used with a $argN argument");
            }
            if (part.isEmpty()) continue;
            templateParts.add(new TemplatePart.Verbatim(part));
        }
        if (templateParts.size() != 1 || !(templateParts.getFirst() instanceof TemplatePart.Name)) return new MethodTemplate(methodName, template, templateParts);
        return new MethodTemplate(methodName, template, List.of((Object)new TemplatePart.Name(), (Object)new TemplatePart.Verbatim("("), (Object)new TemplatePart.Args(), (Object)new TemplatePart.Verbatim(")")));
    }

    public CAST.PrimaryExpression.VerbatimExpression call(CallArgs args) {
        NewVariableContext context2 = new NewVariableContext(this);
        List renderedParts = this.parts.stream().map(part -> part.render(new CallProps(this.methodName, args), context2)).toList();
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < this.parts.size(); ++i) {
            String rendered = (String)renderedParts.get(i);
            if (i < this.parts.size() - 1 && ((String)renderedParts.get(i + 1)).isEmpty() && this.parts.get(i + 1) instanceof TemplatePart.SubArgs && rendered.strip().endsWith(",")) {
                String stripped = rendered.strip();
                sb.append(stripped, 0, stripped.length() - 1);
                continue;
            }
            if (rendered.contains("\n") && i > 0) {
                String previous = (String)renderedParts.get(i - 1);
                if (previous.matches(".*\\n[ \t]+$")) {
                    String indent = previous.substring(previous.lastIndexOf("\n") + 1);
                    sb.append(rendered.lines().collect(Collectors.joining("\n" + indent)));
                    continue;
                }
                sb.append(rendered);
                continue;
            }
            sb.append(rendered);
        }
        return context2.wrap(new CAST.PrimaryExpression.VerbatimExpression(sb.toString()));
    }

    static sealed interface TemplatePart {
        default public String render(CallProps props) {
            return this.render(props, null);
        }

        public String render(CallProps var1, @Nullable NewVariableContext var2);

        private static Argument.Lambda getLambdaParam(CallProps props, int n, String text) {
            if (n >= props.args.arguments.size()) {
                throw new MethodTemplateCache.TemplateRenderException("Argument " + (n + 1) + " not given for " + text);
            }
            Argument argument = props.args.arguments.get(n);
            if (!(argument instanceof Argument.Lambda)) {
                throw new MethodTemplateCache.TemplateRenderException("Argument " + (n + 1) + " is not a lambda for " + text);
            }
            Argument.Lambda lambda = (Argument.Lambda)argument;
            return lambda;
        }

        private static CAST.Declarator.FunctionParameter getLambdaParam(CallProps props, int n, int m, String text) {
            Argument.Lambda lambda = TemplatePart.getLambdaParam(props, n, text);
            if (m >= lambda.parameters.size()) {
                throw new MethodTemplateCache.TemplateRenderException("Not enough parameters in lambda " + (n + 1) + " for " + text);
            }
            return lambda.parameters.get(m);
        }

        public record LambdaCode(int n) implements TemplatePart
        {
            @Override
            public String render(CallProps props, @Nullable NewVariableContext context2) {
                String text = String.format("$lambda%d:code", this.n + 1);
                CAST.Statement.CompoundStatement code2 = TemplatePart.getLambdaParam(props, this.n, text).code();
                return code2.toPrettyStringWithoutBraces();
            }
        }

        public record LambdaParamType(int n, int m) implements TemplatePart
        {
            @Override
            public String render(CallProps props, @Nullable NewVariableContext context2) {
                String text = String.format("$lambda%d:param%d:type", this.n + 1, this.m + 1);
                return TemplatePart.getLambdaParam(props, this.n, this.m, text).declarator().toPrettyString();
            }
        }

        public record LambdaParamName(int n, int m) implements TemplatePart
        {
            @Override
            public String render(CallProps props, @Nullable NewVariableContext context2) {
                String text = String.format("$lambda%d:param%d:name", this.n + 1, this.m + 1);
                return TemplatePart.getLambdaParam(props, this.n, this.m, text).name().toPrettyString();
            }
        }

        public record LambdaParam(int n, int m) implements TemplatePart
        {
            @Override
            public String render(CallProps props, @Nullable NewVariableContext context2) {
                String text = String.format("$lambda%d:param%d", this.n + 1, this.m + 1);
                return TemplatePart.getLambdaParam(props, this.n, this.m, text).toPrettyString();
            }
        }

        public record PointeryArg(int n) implements TemplatePart
        {
            @Override
            public String render(CallProps props, @Nullable NewVariableContext context2) {
                if (this.n >= props.args.arguments.size()) {
                    throw new MethodTemplateCache.TemplateRenderException("Argument " + (this.n + 1) + " not given for $pointery" + (this.n + 1));
                }
                Argument arg2 = props.args.arguments.get(this.n);
                if (!(arg2 instanceof Argument.Value)) {
                    throw new MethodTemplateCache.TemplateRenderException("Argument " + String.valueOf(arg2) + " is not a primary expression");
                }
                Argument.Value value = (Argument.Value)arg2;
                String inner = value.expression.toPrettyString();
                if (context2 == null || inner.matches("[(]*[a-zA-z_]+[)]*")) {
                    return "&" + inner;
                }
                return "&" + context2.request(inner);
            }
        }

        public record ClassTypeArgument(int n) implements TemplatePart
        {
            @Override
            public String render(CallProps props, @Nullable NewVariableContext context2) {
                if (this.n >= props.args.classTypeArguments.size() || props.args.classTypeArguments.get(this.n) == null) {
                    throw new MethodTemplateCache.TemplateRenderException("Template class type argument " + (this.n + 1) + " not given");
                }
                return props.args.classTypeArguments.get(this.n).toPrettyString();
            }
        }

        public record TypeArgument(int n) implements TemplatePart
        {
            @Override
            public String render(CallProps props, @Nullable NewVariableContext context2) {
                if (this.n >= props.args.typeArguments.size() || props.args.typeArguments.get(this.n) == null) {
                    throw new MethodTemplateCache.TemplateRenderException("Template type argument " + (this.n + 1) + " not given");
                }
                return props.args.typeArguments.get(this.n).toPrettyString();
            }
        }

        public record StrArg(int n) implements TemplatePart
        {
            @Override
            public String render(CallProps props, @Nullable NewVariableContext context2) {
                if (this.n >= props.args.arguments.size()) {
                    throw new MethodTemplateCache.TemplateRenderException("Argument " + (this.n + 1) + " not given for $str" + (this.n + 1));
                }
                Argument arg2 = props.args.arguments.get(this.n);
                if (arg2 instanceof Argument.Value) {
                    Argument.Value value = (Argument.Value)arg2;
                    CAST.Expression expression = value.expression;
                    if (expression instanceof CAST.PrimaryExpression.Constant.StringConstant) {
                        CAST.PrimaryExpression.Constant.StringConstant constant = (CAST.PrimaryExpression.Constant.StringConstant)expression;
                        return constant.value();
                    }
                }
                throw new MethodTemplateCache.TemplateRenderException("Argument " + String.valueOf(arg2) + " is not a literal string");
            }
        }

        public record StrLenThis() implements StrLen
        {
            @Override
            public String render(CallProps props, @Nullable NewVariableContext context2) {
                if (props.args.thisExpression == null) {
                    throw new MethodTemplateCache.TemplateRenderException("No this expression given for $strlen$this");
                }
                return StrLen.render(props.args.thisExpression, context2);
            }
        }

        public record StrLenArg(int n) implements StrLen
        {
            @Override
            public String render(CallProps props, @Nullable NewVariableContext context2) {
                return StrLen.render(props.args.arguments.get(this.n), context2);
            }
        }

        public static sealed interface StrLen
        extends TemplatePart
        permits StrLenArg, StrLenThis {
            public static String render(Argument arg2, @Nullable NewVariableContext context2) {
                if (arg2 instanceof Argument.Value) {
                    Argument.Value value = (Argument.Value)arg2;
                    CAST.Expression expression = value.expression;
                    if (expression instanceof CAST.PrimaryExpression.Constant.StringConstant) {
                        CAST.PrimaryExpression.Constant.StringConstant constant = (CAST.PrimaryExpression.Constant.StringConstant)expression;
                        return Integer.toString(constant.value().length());
                    }
                }
                throw new MethodTemplateCache.TemplateRenderException("Argument " + String.valueOf(arg2) + " is not a literal string");
            }

            public static String render(CAST.Expression arg2, @Nullable NewVariableContext context2) {
                if (arg2 instanceof CAST.PrimaryExpression.Constant.StringConstant) {
                    CAST.PrimaryExpression.Constant.StringConstant constant = (CAST.PrimaryExpression.Constant.StringConstant)arg2;
                    return Integer.toString(constant.value().length());
                }
                throw new MethodTemplateCache.TemplateRenderException("Argument " + String.valueOf(arg2) + " is not a literal string");
            }
        }

        public record This() implements TemplatePart
        {
            @Override
            public String render(CallProps props, @Nullable NewVariableContext context2) {
                if (props.args.thisExpression == null) {
                    throw new MethodTemplateCache.TemplateRenderException("No this expression given for $this");
                }
                return props.args.thisExpression.toPrettyString();
            }
        }

        public record Args() implements TemplatePart
        {
            @Override
            public String render(CallProps props, @Nullable NewVariableContext context2) {
                return new SubArgs(0).render(props, context2);
            }
        }

        public record SubArgs(int n) implements TemplatePart
        {
            @Override
            public String render(CallProps props, @Nullable NewVariableContext context2) {
                return IntStream.range(this.n, props.args.arguments.size()).mapToObj(i -> props.args.arguments.get(i).toPrettyString()).collect(Collectors.joining(", "));
            }
        }

        public record Arg(int n) implements TemplatePart
        {
            @Override
            public String render(CallProps props, @Nullable NewVariableContext context2) {
                if (this.n >= props.args.arguments.size()) {
                    throw new MethodTemplateCache.TemplateRenderException("Argument " + (this.n + 1) + " not given for $arg" + (this.n + 1));
                }
                return props.args.arguments.get(this.n).toPrettyString();
            }
        }

        public record Name() implements TemplatePart
        {
            @Override
            public String render(CallProps props, @Nullable NewVariableContext context2) {
                return props.methodName;
            }
        }

        public record Verbatim(String verb) implements TemplatePart
        {
            @Override
            public String render(CallProps props, @Nullable NewVariableContext context2) {
                return this.verb;
            }
        }
    }

    public class NewVariableContext {
        private List<NewVariable> newVariables = new ArrayList<NewVariable>();

        public NewVariableContext(MethodTemplate this$0) {
        }

        public String request(String value) {
            String name = "___pointery__" + this.newVariables.size();
            this.newVariables.add(new NewVariable(name, value));
            return name;
        }

        public String toString() {
            return this.newVariables.stream().map(nv -> String.format("auto %s = %s;", nv.name, nv.value)).collect(Collectors.joining(" "));
        }

        public CAST.PrimaryExpression.VerbatimExpression wrap(CAST.PrimaryExpression.VerbatimExpression expression) {
            if (this.newVariables.isEmpty()) {
                return expression;
            }
            return new CAST.PrimaryExpression.VerbatimExpression(String.format("({%s %s;})", this, expression.toPrettyString()));
        }

        public CAST.Statement.VerbatimStatement wrap(CAST.Statement.VerbatimStatement statement) {
            if (this.newVariables.isEmpty()) {
                return statement;
            }
            return new CAST.Statement.VerbatimStatement(String.format("{%s %s;}", this, statement.toPrettyString()));
        }

        private record NewVariable(String name, String value) {
        }
    }

    public record CallArgs(@Nullable CAST.Expression thisExpression, List<? extends Argument> arguments, List<CAST.Declarator> typeArguments, List<CAST.Declarator> classTypeArguments) {
        public CallArgs(@Nullable CAST.Expression thisExpression, List<? extends Argument> arguments, List<CAST.Declarator> typeArguments) {
            this(thisExpression, arguments, typeArguments, List.of());
        }

        @Nullable
        public CAST.Expression thisExpression() {
            return this.thisExpression;
        }
    }

    public record CallProps(String methodName, CallArgs args) {
    }

    public static sealed interface Argument {
        public String toPrettyString();

        public record Value(CAST.Expression expression) implements Argument
        {
            @Override
            public String toPrettyString() {
                return this.expression.toPrettyString();
            }
        }

        public record Lambda(List<CAST.Declarator.FunctionParameter> parameters, CAST.Statement.CompoundStatement code) implements Argument
        {
            @Override
            public String toPrettyString() {
                return String.format("(%s) { %s }", this.parameters.stream().map(CAST::toPrettyString).collect(Collectors.joining(", ")), this.code.toPrettyString());
            }
        }
    }
}

