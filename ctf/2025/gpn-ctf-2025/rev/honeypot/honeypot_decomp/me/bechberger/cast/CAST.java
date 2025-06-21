/*
 * Decompiled with CFR 0.153-SNAPSHOT (d6f6758-dirty).
 * 
 * Could not load the following classes:
 *  java.lang.Record
 *  java.lang.runtime.ObjectMethods
 *  java.lang.runtime.SwitchBootstraps
 */
package me.bechberger.cast;

import java.lang.invoke.MethodHandle;
import java.lang.runtime.ObjectMethods;
import java.lang.runtime.SwitchBootstraps;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import java.util.stream.Collectors;
import java.util.stream.Stream;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

public interface CAST {
    public List<? extends CAST> children();

    public Statement toStatement();

    default public String toPrettyString() {
        return this.toPrettyString("", "  ");
    }

    public String toPrettyString(String var1, String var2);

    public static String toStringLiteral(String value) {
        return "\"" + value.replace("\\", "\\\\").replace("\"", "\\\"").replace("\n", "\\n") + "\"";
    }

    private static String replaceReturnOutsideStrings(String input, String replacement) {
        if (!input.contains("return")) {
            return input;
        }
        StringBuilder output = new StringBuilder();
        boolean inSingleQuotes = false;
        boolean inDoubleQuotes = false;
        for (int i = 0; i < input.length(); ++i) {
            int semicolonIndex;
            char c = input.charAt(i);
            if (c == '\'' && !inDoubleQuotes) {
                inSingleQuotes = !inSingleQuotes;
            } else if (c == '\"' && !inSingleQuotes) {
                boolean bl = inDoubleQuotes = !inDoubleQuotes;
            }
            if (!inSingleQuotes && !inDoubleQuotes && input.startsWith("return", i) && (semicolonIndex = input.indexOf(59, i)) != -1 && input.substring(i, semicolonIndex + 1).matches("return[^;]*;")) {
                output.append(replacement);
                i = semicolonIndex;
                continue;
            }
            output.append(c);
        }
        return output.toString();
    }

    public static interface Statement
    extends CAST {
        @Override
        default public Statement toStatement() {
            return this;
        }

        default public Statement replaceReturnStatement(Statement newLastStatement) {
            return this;
        }

        default public String toPrettyStringWithoutBraces(String indent, String increment) {
            return this.toPrettyString(indent, increment);
        }

        default public String toPrettyStringWithoutBraces() {
            return this.toPrettyString();
        }

        public static Statement expression(Expression expression) {
            return new ExpressionStatement(expression);
        }

        public static Statement compound(Statement ... statements) {
            return new CompoundStatement(List.of((Object[])statements));
        }

        public static Statement compound(List<Statement> statements) {
            return new CompoundStatement(statements);
        }

        public static Statement ifStatement(Expression condition, Statement thenStatement, @Nullable Statement elseStatement) {
            return new IfStatement(condition, thenStatement, elseStatement);
        }

        public static Statement whileStatement(Expression condition, Statement body) {
            return new WhileStatement(condition, body);
        }

        public static Statement returnStatement(@Nullable Expression expression) {
            return new ReturnStatement(expression);
        }

        public static Statement breakStatement() {
            return new BreakStatement();
        }

        public static Statement continueStatement() {
            return new ContinueStatement();
        }

        public static Statement emptyStatement() {
            return new EmptyStatement();
        }

        public static Statement declarationStatement(Declarator declarator, @Nullable Initializer initializer) {
            return new DeclarationStatement(declarator, initializer);
        }

        public static Statement structDeclarationStatement(Declarator.StructDeclarator declarator) {
            return new StructDeclarationStatement(declarator);
        }

        public static Statement functionDeclarationStatement(Declarator.FunctionDeclarator declarator, CompoundStatement body) {
            return new FunctionDeclarationStatement(declarator, body, new PrimaryExpression.CAnnotation[0]);
        }

        public static Define define(String name, PrimaryExpression.Constant<?> value) {
            return new Define(name, value);
        }

        public static Statement include(String file2) {
            return new Include(file2);
        }

        public static Statement typedef(Declarator declarator, PrimaryExpression.Variable name) {
            return new Typedef(declarator, name);
        }

        public static Statement caseStatement(Expression expression, Statement body) {
            return new CaseStatement(expression, body);
        }

        public static Statement defaultStatement(Statement body) {
            return new DefaultStatement(body);
        }

        public static Statement switchStatement(Expression expression, Statement body) {
            return new SwitchStatement(expression, body);
        }

        public static Statement variableDefinition(Declarator type2, PrimaryExpression.Variable name) {
            return new VariableDefinition(type2, name, null);
        }

        public static Statement variableDefinition(Declarator type2, PrimaryExpression.Variable name, Expression value) {
            return new VariableDefinition(type2, name, value);
        }

        public static Statement verbatim(String code2) {
            return new VerbatimStatement(code2);
        }

        public record ExpressionStatement(Expression expression) implements Statement
        {
            @Override
            public List<? extends CAST> children() {
                return List.of((Object)this.expression);
            }

            @Override
            public String toPrettyString(String indent, String increment) {
                return this.expression.toPrettyString(indent, increment) + ";";
            }

            @Override
            public ExpressionStatement replaceReturnStatement(Statement newLastStatement) {
                return new ExpressionStatement(this.expression.replaceReturnStatement(newLastStatement));
            }
        }

        public record CompoundStatement(List<Statement> statements) implements Statement
        {
            @Override
            public List<? extends CAST> children() {
                return this.statements;
            }

            @Override
            public String toPrettyString(String indent, String increment) {
                return indent + "{\n" + this.toPrettyStringWithoutBraces(indent + increment, increment) + "\n" + indent + "}";
            }

            @Override
            public String toPrettyStringWithoutBraces(String indent, String increment) {
                return this.statements.stream().map(s2 -> s2.toPrettyString(indent, increment)).collect(Collectors.joining("\n"));
            }

            @Override
            public String toPrettyStringWithoutBraces() {
                return this.statements.stream().map(CAST::toPrettyString).collect(Collectors.joining("\n"));
            }

            @Override
            public CompoundStatement replaceReturnStatement(Statement newLastStatement) {
                return new CompoundStatement(this.statements.stream().map(s2 -> this.isReturnStatement((Statement)s2) ? newLastStatement : s2.replaceReturnStatement(newLastStatement)).collect(Collectors.toList()));
            }

            private boolean isReturnStatement(Statement statement) {
                if (statement instanceof ReturnStatement) {
                    return true;
                }
                if (statement instanceof VerbatimStatement) {
                    String str = statement.toPrettyString();
                    return str.startsWith("return ") || str.equals("return;");
                }
                return false;
            }
        }

        public record IfStatement(Expression condition, Statement thenStatement, @Nullable Statement elseStatement) implements Statement
        {
            @Override
            public List<? extends CAST> children() {
                return this.elseStatement == null ? List.of((Object)this.condition, (Object)this.thenStatement) : List.of((Object)this.condition, (Object)this.thenStatement, (Object)this.elseStatement);
            }

            @Override
            public String toPrettyString(String indent, String increment) {
                String code2 = indent + "if (" + OperatorExpression.stripPrint(this.condition) + ") {\n" + this.thenStatement.toPrettyStringWithoutBraces(indent + increment, increment) + "\n" + indent + "}";
                if (this.elseStatement != null) {
                    if (this.elseStatement instanceof IfStatement) {
                        return code2 + " else " + this.elseStatement.toPrettyString(indent, increment).strip();
                    }
                    return code2 + " else {\n" + this.elseStatement.toPrettyStringWithoutBraces(indent + increment, increment) + "\n" + indent + "}";
                }
                return code2;
            }

            @Override
            public IfStatement replaceReturnStatement(Statement newLastStatement) {
                return new IfStatement(this.condition, this.thenStatement.replaceReturnStatement(newLastStatement), this.elseStatement == null ? null : this.elseStatement.replaceReturnStatement(newLastStatement));
            }

            @Nullable
            public Statement elseStatement() {
                return this.elseStatement;
            }
        }

        public record WhileStatement(Expression condition, Statement body) implements Statement
        {
            @Override
            public List<? extends CAST> children() {
                return List.of((Object)this.condition, (Object)this.body);
            }

            @Override
            public String toPrettyString(String indent, String increment) {
                return indent + "while (" + OperatorExpression.stripPrint(this.condition) + ") {\n" + this.body.toPrettyStringWithoutBraces(indent + increment, increment) + "\n" + indent + "}";
            }

            @Override
            public WhileStatement replaceReturnStatement(Statement newLastStatement) {
                return new WhileStatement(this.condition, this.body.replaceReturnStatement(newLastStatement));
            }
        }

        public record ReturnStatement(@Nullable Expression expression) implements Statement
        {
            @Override
            public List<? extends CAST> children() {
                return this.expression == null ? List.of() : List.of((Object)this.expression);
            }

            @Override
            public String toPrettyString(String indent, String increment) {
                return indent + "return" + (String)(this.expression == null ? "" : " " + OperatorExpression.stripPrint(this.expression)) + ";";
            }

            @Nullable
            public Expression expression() {
                return this.expression;
            }
        }

        public record BreakStatement() implements Statement
        {
            @Override
            public List<? extends CAST> children() {
                return List.of();
            }

            @Override
            public String toPrettyString(String indent, String increment) {
                return indent + "break;";
            }
        }

        public record ContinueStatement() implements Statement
        {
            @Override
            public List<? extends CAST> children() {
                return List.of();
            }

            @Override
            public String toPrettyString(String indent, String increment) {
                return indent + "continue;";
            }
        }

        public record EmptyStatement() implements Statement
        {
            @Override
            public List<? extends CAST> children() {
                return List.of();
            }

            @Override
            public String toPrettyString(String indent, String increment) {
                return indent + ";";
            }
        }

        public record DeclarationStatement(Declarator declarator, @Nullable Initializer initializer) implements Statement
        {
            @Override
            public List<? extends CAST> children() {
                return this.initializer == null ? List.of((Object)this.declarator) : List.of((Object)this.declarator, (Object)this.initializer);
            }

            @Override
            public String toPrettyString(String indent, String increment) {
                return indent + this.declarator.toPrettyString() + (String)(this.initializer == null ? "" : " = " + OperatorExpression.stripPrint(this.initializer)) + ";";
            }

            @Nullable
            public Initializer initializer() {
                return this.initializer;
            }
        }

        public record StructDeclarationStatement(Declarator.StructDeclarator declarator) implements Statement
        {
            @Override
            public List<? extends CAST> children() {
                return List.of((Object)this.declarator);
            }

            @Override
            public String toPrettyString(String indent, String increment) {
                return this.declarator.toPrettyString(indent, increment) + ";";
            }
        }

        public record FunctionDeclarationStatement(Declarator.FunctionHeader declarator, CompoundStatement body, PrimaryExpression.CAnnotation[] annotations) implements Statement
        {
            @Override
            public List<? extends CAST> children() {
                ArrayList<CAST> children = new ArrayList<CAST>();
                children.add(this.declarator);
                children.add(this.body);
                children.addAll(Arrays.asList(this.annotations));
                return children;
            }

            @Override
            public String toPrettyString(String indent, String increment) {
                String anns = Arrays.stream(this.annotations).map(CAST::toPrettyString).collect(Collectors.joining(" "));
                return indent + (String)(anns.isEmpty() ? "" : anns + " ") + this.declarator.toPrettyString("", increment) + " {\n" + this.body.toPrettyStringWithoutBraces(indent + increment, increment) + "\n" + indent + "}";
            }
        }

        public record Define(String name, PrimaryExpression.Constant<?> value) implements Statement
        {
            @Override
            public List<? extends CAST> children() {
                return List.of(this.value);
            }

            @Override
            public String toPrettyString(String indent, String increment) {
                return indent + "#define " + this.name + " " + this.value.toPrettyString();
            }

            public int hashCode() {
                return this.toPrettyString().hashCode();
            }

            public boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                if (obj == null || this.getClass() != obj.getClass()) {
                    return false;
                }
                return this.toPrettyString().equals(((Define)obj).toPrettyString());
            }
        }

        public record Include(String file) implements Statement
        {
            @Override
            public List<? extends CAST> children() {
                return List.of();
            }

            @Override
            public String toPrettyString(String indent, String increment) {
                return indent + "#include <" + this.file + ">";
            }

            public int hashCode() {
                return this.file.hashCode();
            }

            public boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                if (obj == null || this.getClass() != obj.getClass()) {
                    return false;
                }
                return this.file.equals(((Include)obj).file);
            }

            public boolean isAlreadyPresent(List<String> codeLines) {
                return codeLines.stream().anyMatch(l -> l.contains("#include <" + this.file + ">") || l.contains("#include \"" + this.file + "\""));
            }
        }

        public record Typedef(Declarator declarator, PrimaryExpression.Variable name) implements Statement
        {
            @Override
            public List<? extends CAST> children() {
                return List.of((Object)this.declarator, (Object)this.name);
            }

            @Override
            public String toPrettyString(String indent, String increment) {
                Declarator declarator = this.declarator;
                if (declarator instanceof Declarator.Pointery) {
                    Declarator.Pointery arr = (Declarator.Pointery)((Object)declarator);
                    return indent + "typedef " + arr.toPrettyVariableDefinition(this.name, indent) + ";";
                }
                return indent + "typedef " + this.declarator.toPrettyString() + " " + this.name.toPrettyString() + ";";
            }
        }

        public record CaseStatement(Expression expression, Statement body) implements Statement
        {
            @Override
            public List<? extends CAST> children() {
                return List.of((Object)this.expression, (Object)this.body);
            }

            @Override
            public String toPrettyString(String indent, String increment) {
                return indent + "case " + this.expression.toPrettyString() + ":\n" + this.body.toPrettyString(indent + increment, increment);
            }
        }

        public record DefaultStatement(Statement body) implements Statement
        {
            @Override
            public List<? extends CAST> children() {
                return List.of((Object)this.body);
            }

            @Override
            public String toPrettyString(String indent, String increment) {
                return indent + "default:\n" + this.body.toPrettyString(indent + increment, increment);
            }
        }

        public record SwitchStatement(Expression expression, Statement body) implements Statement
        {
            @Override
            public List<? extends CAST> children() {
                return List.of((Object)this.expression, (Object)this.body);
            }

            @Override
            public String toPrettyString(String indent, String increment) {
                return indent + "switch (" + this.expression.toPrettyString() + ")\n" + this.body.toPrettyString(indent + increment, increment);
            }
        }

        public record VariableDefinition(Declarator type, PrimaryExpression.Variable name, @Nullable Expression value) implements Statement
        {
            @Override
            public List<? extends CAST> children() {
                if (this.value == null) {
                    return List.of((Object)this.type, (Object)this.name);
                }
                return List.of((Object)this.type, (Object)this.name, (Object)this.value);
            }

            @Override
            public String toPrettyString(String indent, String increment) {
                String app = this.value == null ? "" : " = " + OperatorExpression.stripPrint(this.value);
                Declarator declarator = this.type;
                if (declarator instanceof Declarator.Pointery) {
                    Declarator.Pointery arr = (Declarator.Pointery)((Object)declarator);
                    return arr.toPrettyVariableDefinition(Expression.variable(this.name.name), indent) + (String)(this.name.annotations.length == 0 ? "" : " " + this.name.annotationsString()) + app + ";";
                }
                return this.type.toPrettyString(indent, increment) + " " + this.name.toPrettyString() + app + ";";
            }

            @Nullable
            public Expression value() {
                return this.value;
            }
        }

        public record VerbatimStatement(String code) implements Statement
        {
            @Override
            public List<? extends CAST> children() {
                return List.of();
            }

            @Override
            public String toPrettyString(String indent, String increment) {
                return this.code.lines().map(l -> indent + l).collect(Collectors.joining("\n"));
            }

            @Override
            public Statement replaceReturnStatement(Statement newLastStatement) {
                String returnString = newLastStatement.toPrettyString();
                return new VerbatimStatement(CAST.replaceReturnOutsideStrings(this.code, returnString));
            }
        }

        public record ForStatement(List<Statement> init, @Nullable Expression condition, List<Statement> increment, Statement body) implements Statement
        {
            @Override
            public List<? extends CAST> children() {
                ArrayList<CAST> children = new ArrayList<CAST>();
                if (this.init != null) {
                    children.addAll(this.init);
                }
                if (this.condition != null) {
                    children.add(this.condition);
                }
                if (this.increment != null) {
                    children.addAll(this.increment);
                }
                children.add(this.body);
                return children;
            }

            private String prettyList(List<Statement> list) {
                return list.stream().map(CAST::toPrettyString).map(s2 -> s2.endsWith(";") ? s2.substring(0, s2.length() - 1) : s2).collect(Collectors.joining(", "));
            }

            @Override
            public String toPrettyString(String indent, String increment) {
                return indent + "for (" + this.prettyList(this.init) + "; " + (this.condition == null ? "" : this.condition.toPrettyString()) + "; " + this.prettyList(this.increment) + ") {\n" + this.body.toPrettyStringWithoutBraces(indent + increment, increment) + "\n" + indent + "}";
            }

            @Override
            public ForStatement replaceReturnStatement(Statement newLastStatement) {
                return new ForStatement(this.init, this.condition, this.increment, this.body.replaceReturnStatement(newLastStatement));
            }

            @Nullable
            public Expression condition() {
                return this.condition;
            }
        }
    }

    public static sealed interface Declarator
    extends Expression {
        public static Declarator pointer(Declarator declarator) {
            return new PointerDeclarator(declarator);
        }

        public static Declarator voidPointer() {
            return new PointerDeclarator(new IdentifierDeclarator(new PrimaryExpression.Variable("void", new PrimaryExpression.CAnnotation[0])));
        }

        public static Declarator array(Declarator declarator, @Nullable Expression size) {
            return new ArrayDeclarator(declarator, size);
        }

        public static Declarator function(PrimaryExpression.Variable name, Declarator returnValue, List<FunctionParameter> parameters) {
            return new FunctionDeclarator(name, returnValue, parameters);
        }

        public static Declarator identifier(PrimaryExpression.Variable name) {
            return new IdentifierDeclarator(name);
        }

        public static Declarator _void() {
            return new IdentifierDeclarator(Expression._void());
        }

        public static Declarator identifier(String name) {
            return new IdentifierDeclarator(new PrimaryExpression.Variable(name, new PrimaryExpression.CAnnotation[0]));
        }

        public static Declarator struct(PrimaryExpression.Variable name, List<StructMember> members) {
            return new StructDeclarator(name, members);
        }

        public static Declarator typedefedStruct(PrimaryExpression.Variable name, List<StructMember> members) {
            return new TypedefedStructDeclarator(name, members);
        }

        public static Declarator typedefedUnion(PrimaryExpression.Variable name, List<UnionMember> members) {
            return new TypedefedUnionDeclarator(name, members);
        }

        public static StructMember structMember(Declarator declarator, PrimaryExpression.Variable name) {
            return new StructMember(declarator, name, null);
        }

        public static StructMember structMember(Declarator declarator, PrimaryExpression.Variable name, PrimaryExpression ebpfSize) {
            return new StructMember(declarator, name, ebpfSize);
        }

        public static Declarator structIdentifier(PrimaryExpression.Variable name) {
            return new StructIdentifierDeclarator(name);
        }

        public static Declarator union(@Nullable PrimaryExpression.Variable name, List<UnionMember> members) {
            return new UnionDeclarator(name, members);
        }

        public static Declarator inlineUnion(List<UnionMember> members) {
            return new UnionDeclarator(null, members);
        }

        public static UnionMember unionMember(Declarator declarator, PrimaryExpression.Variable name) {
            return new UnionMember(declarator, name);
        }

        public static Declarator unionIdentifier(PrimaryExpression.Variable name) {
            return new UnionIdentifierDeclarator(name);
        }

        public static Declarator unionIdentifier(String name) {
            return new UnionIdentifierDeclarator(new PrimaryExpression.Variable(name, new PrimaryExpression.CAnnotation[0]));
        }

        public static Declarator _enum(PrimaryExpression.Variable name, List<EnumMember> members) {
            return new EnumDeclarator(name, members);
        }

        public static EnumMember enumMember(PrimaryExpression.Variable name, PrimaryExpression.Constant<?> value) {
            return new EnumMember(name, value);
        }

        public static Declarator enumIdentifier(PrimaryExpression.Variable name) {
            return new EnumIdentifierDeclarator(name);
        }

        public static Declarator enumIdentifier(String name) {
            return new EnumIdentifierDeclarator(new PrimaryExpression.Variable(name, new PrimaryExpression.CAnnotation[0]));
        }

        public static Declarator tagged(String tag, Declarator declarator) {
            return new TaggedDeclarator(tag, declarator);
        }

        public record PointerDeclarator(Declarator declarator) implements Declarator,
        Pointery
        {
            @Override
            public List<? extends Expression> children() {
                return List.of((Object)this.declarator);
            }

            @Override
            public String toPrettyString(String indent, String increment) {
                return indent + this.declarator.toPrettyString() + "*";
            }

            @Override
            public String toPrettyVariableDefinition(@Nullable Expression name, @Nullable String tag, String indent) {
                Declarator declarator = this.declarator;
                if (declarator instanceof TaggedDeclarator) {
                    TaggedDeclarator tagged = (TaggedDeclarator)declarator;
                    Declarator declarator2 = tagged.declarator;
                    if (declarator2 instanceof Pointery) {
                        Pointery pointery = (Pointery)((Object)declarator2);
                        String combinedTag = tag == null ? tagged.tag : tag + " " + tagged.tag;
                        return pointery.toPrettyVariableDefinition(name, combinedTag, indent) + (pointery instanceof FunctionDeclarator ? "" : "*");
                    }
                    return tagged.toPrettyString() + "*";
                }
                declarator = this.declarator;
                if (declarator instanceof FunctionDeclarator) {
                    FunctionDeclarator fun = (FunctionDeclarator)declarator;
                    return fun.toPrettyVariableDefinition(name, tag, indent);
                }
                if (name == null) {
                    return this.toPrettyString(indent, "");
                }
                declarator = this.declarator;
                if (declarator instanceof ArrayDeclarator) {
                    ArrayDeclarator arr = (ArrayDeclarator)declarator;
                    return arr.toPrettyVariableDefinition(Expression.parenthesizedExpression(OperatorExpression.pointer(name)), tag, indent);
                }
                declarator = this.declarator;
                if (declarator instanceof PointerDeclarator) {
                    PointerDeclarator ptr = (PointerDeclarator)declarator;
                    return ptr.toPrettyVariableDefinition(OperatorExpression.pointer(name), tag, indent);
                }
                return indent + this.declarator.toPrettyString() + (String)(tag == null ? " " : tag + " ") + "*" + name.toPrettyString();
            }
        }

        public record IdentifierDeclarator(PrimaryExpression.Variable name) implements Declarator
        {
            @Override
            public List<? extends Expression> children() {
                return List.of((Object)this.name);
            }

            @Override
            public String toPrettyString(String indent, String increment) {
                return this.name.toPrettyString(indent, increment);
            }
        }

        public record ArrayDeclarator(Declarator declarator, Expression size) implements Declarator,
        Pointery
        {
            @Override
            public List<? extends Expression> children() {
                return this.size == null ? List.of((Object)this.declarator) : List.of((Object)this.declarator, (Object)this.size);
            }

            @Override
            public String toPrettyString(String indent, String increment) {
                return this.toPrettyVariableDefinition(null, indent);
            }

            @Override
            public String toPrettyVariableDefinition(@Nullable Expression name, @Nullable String tag, String indent) {
                ArrayList<String> sizes = new ArrayList<String>();
                Declarator cur = this;
                while (cur instanceof ArrayDeclarator) {
                    ArrayDeclarator arr = cur;
                    sizes.add(cur.sizeBracket());
                    cur = arr.declarator;
                }
                return indent + cur.toPrettyString() + (String)(tag == null ? "" : " " + tag) + (String)(name != null ? " " + name.toPrettyString() : "") + String.join((CharSequence)"", sizes);
            }

            @NotNull
            private String sizeBracket() {
                return this.size == null ? "[]" : "[" + this.size.toPrettyString() + "]";
            }
        }

        public record FunctionDeclarator(PrimaryExpression.Variable name, Declarator returnValue, List<FunctionParameter> parameters) implements Declarator,
        Pointery,
        FunctionHeader
        {
            @Override
            public List<? extends Expression> children() {
                return Stream.concat(Stream.of(this.name, this.returnValue), this.parameters.stream()).collect(Collectors.toList());
            }

            private String paramDecl() {
                return "(" + this.parameters.stream().map(CAST::toPrettyString).collect(Collectors.joining(", ")) + ")";
            }

            @Override
            public String toPrettyString(String indent, String increment) {
                return this.returnValue.toPrettyString(indent, increment) + " " + String.valueOf(this.name) + this.paramDecl();
            }

            @Override
            public String toPrettyVariableDefinition(@Nullable Expression name, @Nullable String tag, String indent) {
                return this.returnValue.toPrettyString(indent, "") + " (" + (String)(tag == null ? "" : " " + tag) + "*" + (name == null ? "" : name.toPrettyString()) + ")" + this.paramDecl();
            }
        }

        public record StructDeclarator(@Nullable PrimaryExpression.Variable name, List<StructMember> members) implements Declarator
        {
            @Override
            public List<? extends Expression> children() {
                if (this.name == null) {
                    return this.members;
                }
                return Stream.concat(Stream.of(this.name), this.members.stream()).collect(Collectors.toList());
            }

            @Override
            public String toPrettyString(String indent, String increment) {
                return indent + "struct " + (String)(this.name == null ? "" : this.name.toPrettyString() + " ") + "{\n" + this.members.stream().map(m -> m.toPrettyString(indent + increment, increment)).collect(Collectors.joining("\n")) + "\n" + indent + "}";
            }

            @Nullable
            public PrimaryExpression.Variable name() {
                return this.name;
            }
        }

        public record TypedefedStructDeclarator(PrimaryExpression.Variable name, List<StructMember> members) implements Declarator
        {
            @Override
            public List<? extends Expression> children() {
                return Stream.concat(Stream.of(this.name), this.members.stream()).collect(Collectors.toList());
            }

            @Override
            public String toPrettyString(String indent, String increment) {
                return indent + "typedef struct {\n" + this.members.stream().map(m -> m.toPrettyString(indent + increment, increment)).collect(Collectors.joining("\n")) + "\n" + indent + "} " + this.name.toPrettyString();
            }
        }

        public record TypedefedUnionDeclarator(PrimaryExpression.Variable name, List<UnionMember> members) implements Declarator
        {
            @Override
            public List<? extends Expression> children() {
                return Stream.concat(Stream.of(this.name), this.members.stream()).collect(Collectors.toList());
            }

            @Override
            public String toPrettyString(String indent, String increment) {
                return indent + "typedef union {\n" + this.members.stream().map(m -> m.toPrettyString(indent + increment, increment)).collect(Collectors.joining("\n")) + "\n" + indent + "} " + this.name.toPrettyString();
            }
        }

        public record StructMember(Declarator declarator, PrimaryExpression.Variable name, @Nullable PrimaryExpression ebpfSize) implements Declarator
        {
            @Override
            public List<? extends Expression> children() {
                return List.of((Object)this.declarator, (Object)this.name);
            }

            @Override
            public String toPrettyString(String indent, String increment) {
                if (this.ebpfSize == null) {
                    Declarator declarator = this.declarator;
                    if (declarator instanceof Pointery) {
                        Pointery arr = (Pointery)((Object)declarator);
                        return arr.toPrettyVariableDefinition(this.name, indent) + ";";
                    }
                    declarator = this.declarator;
                    if (declarator instanceof UnionDeclarator) {
                        UnionDeclarator union = (UnionDeclarator)declarator;
                        if (union.name == null) {
                            return this.declarator.toPrettyString(indent, increment) + ";";
                        }
                    }
                    return this.declarator.toPrettyString(indent, increment) + (String)(this.name == null ? "" : " " + this.name.toPrettyString()) + ";";
                }
                return indent + this.declarator.toPrettyString() + " (" + this.name.toPrettyString() + ", " + this.ebpfSize.toPrettyString() + ");";
            }

            @Nullable
            public PrimaryExpression ebpfSize() {
                return this.ebpfSize;
            }
        }

        public record StructIdentifierDeclarator(PrimaryExpression.Variable name) implements Declarator
        {
            @Override
            public List<? extends Expression> children() {
                return List.of((Object)this.name);
            }

            @Override
            public String toPrettyString(String indent, String increment) {
                return indent + "struct " + this.name.toPrettyString();
            }
        }

        public record UnionDeclarator(@Nullable PrimaryExpression.Variable name, List<UnionMember> members) implements Declarator
        {
            @Override
            public List<? extends Expression> children() {
                if (this.name == null) {
                    return this.members;
                }
                return Stream.concat(Stream.of(this.name), this.members.stream()).collect(Collectors.toList());
            }

            @Override
            public String toPrettyString(String indent, String increment) {
                return indent + "union " + (String)(this.name == null ? "" : this.name.toPrettyString() + " ") + "{\n" + this.members.stream().map(m -> m.toPrettyString(indent + increment, increment)).collect(Collectors.joining("\n")) + "\n" + indent + "}";
            }

            @Nullable
            public PrimaryExpression.Variable name() {
                return this.name;
            }
        }

        public record UnionMember(Declarator declarator, PrimaryExpression.Variable name) implements Declarator
        {
            @Override
            public List<? extends Expression> children() {
                return List.of((Object)this.declarator, (Object)this.name);
            }

            @Override
            public String toPrettyString(String indent, String increment) {
                Declarator declarator = this.declarator;
                if (declarator instanceof Pointery) {
                    Pointery arr = (Pointery)((Object)declarator);
                    return arr.toPrettyVariableDefinition(this.name, indent) + ";";
                }
                if (this.name == null) {
                    return this.declarator.toPrettyString(indent, increment) + ";";
                }
                return this.declarator.toPrettyString(indent, increment) + " " + this.name.toPrettyString() + ";";
            }
        }

        public record UnionIdentifierDeclarator(PrimaryExpression.Variable name) implements Declarator
        {
            @Override
            public List<? extends Expression> children() {
                return List.of((Object)this.name);
            }

            @Override
            public String toPrettyString(String indent, String increment) {
                return indent + "union " + this.name.toPrettyString();
            }
        }

        public record EnumDeclarator(@Nullable PrimaryExpression.Variable name, List<EnumMember> members) implements Declarator
        {
            @Override
            public List<? extends Expression> children() {
                if (this.name == null) {
                    return this.members;
                }
                return Stream.concat(Stream.of(this.name), this.members.stream()).collect(Collectors.toList());
            }

            @Override
            public String toPrettyString(String indent, String increment) {
                return indent + "enum " + (String)(this.name == null ? "" : this.name.toPrettyString() + " ") + "{\n" + this.members.stream().map(m -> m.toPrettyString(indent + increment, increment)).collect(Collectors.joining(",\n")) + "\n" + indent + "}";
            }

            @Nullable
            public PrimaryExpression.Variable name() {
                return this.name;
            }
        }

        public record EnumMember(PrimaryExpression.Variable name, PrimaryExpression.Constant<?> value) implements Declarator
        {
            @Override
            public List<? extends Expression> children() {
                return List.of((Object)this.name, this.value);
            }

            @Override
            public String toPrettyString(String indent, String increment) {
                return indent + this.name.toPrettyString() + " = " + this.value.toPrettyString();
            }
        }

        public record EnumIdentifierDeclarator(PrimaryExpression.Variable name) implements Declarator
        {
            @Override
            public List<? extends Expression> children() {
                return List.of((Object)this.name);
            }

            @Override
            public String toPrettyString(String indent, String increment) {
                return indent + "enum " + this.name.toPrettyString();
            }
        }

        public record TaggedDeclarator(String tag, Declarator declarator) implements Declarator
        {
            @Override
            public List<? extends Expression> children() {
                return List.of((Object)this.declarator);
            }

            @Override
            public String toPrettyString(String indent, String increment) {
                return indent + this.tag + " " + this.declarator.toPrettyString();
            }
        }

        public record VerbatimFunctionDeclarator(String header) implements FunctionHeader
        {
            @Override
            public List<? extends CAST> children() {
                return List.of();
            }

            @Override
            public String toPrettyString(String indent, String increment) {
                return indent + this.header;
            }

            @Override
            public Statement toStatement() {
                return new Statement.VerbatimStatement(this.header + ";");
            }
        }

        public static sealed interface FunctionHeader
        extends CAST
        permits FunctionDeclarator, VerbatimFunctionDeclarator {
        }

        public record FunctionParameter(PrimaryExpression.Variable name, Declarator declarator) implements Declarator
        {
            @Override
            public List<? extends Expression> children() {
                return List.of((Object)this.name, (Object)this.declarator);
            }

            @Override
            public String toPrettyString(String indent, String increment) {
                if (this.name == null) {
                    return this.declarator.toPrettyString(indent, increment);
                }
                Declarator declarator = this.declarator;
                if (declarator instanceof Pointery) {
                    Pointery ptr = (Pointery)((Object)declarator);
                    return ptr.toPrettyVariableDefinition(this.name, indent);
                }
                return this.declarator.toPrettyString(indent, increment) + " " + this.name.toPrettyString();
            }
        }

        public static interface Pointery {
            default public String toPrettyVariableDefinition(@Nullable Expression name, String indent) {
                return this.toPrettyVariableDefinition(name, null, indent);
            }

            public String toPrettyVariableDefinition(@Nullable Expression var1, @Nullable String var2, String var3);
        }
    }

    public static sealed interface Initializer
    extends Expression {

        public record InitializerList(List<InitDeclarator> declarators) implements Initializer
        {
            @Override
            public List<? extends Expression> children() {
                return this.declarators;
            }

            @Override
            public String toPrettyString(String indent, String increment) {
                return indent + "{" + this.declarators.stream().map(CAST::toPrettyString).collect(Collectors.joining(", ")) + "}";
            }
        }
    }

    public record InitDeclarator(@Nullable PrimaryExpression.Variable name, Expression expression) implements Expression
    {
        @Override
        public List<? extends Expression> children() {
            return List.of((Object)this.expression);
        }

        @Override
        public String toPrettyString(String indent, String increment) {
            return indent + (String)(this.name == null ? "" : "." + this.name.toPrettyString() + " = ") + this.expression.toPrettyString();
        }

        @Override
        public Expression replaceReturnStatement(Statement newLastStatement) {
            return new InitDeclarator(this.name, this.expression.replaceReturnStatement(newLastStatement));
        }

        @Nullable
        public PrimaryExpression.Variable name() {
            return this.name;
        }
    }

    public record OperatorExpression(Operator operator, Expression[] expressions) implements Expression
    {
        @Override
        public List<? extends Expression> children() {
            return Arrays.asList(this.expressions);
        }

        static String stripPrint(Expression expr) {
            String str = expr.toPrettyString();
            if (str.startsWith("(") && str.endsWith(")") && !str.contains(")") && !str.contains("(")) {
                return str.substring(1, str.length() - 1);
            }
            return str;
        }

        static String stripPrintOp(Expression op, Operator ownOp) {
            String stripped = OperatorExpression.stripPrint(op);
            if (op instanceof OperatorExpression) {
                OperatorExpression expr = (OperatorExpression)op;
                if (expr.operator.precedence >= ownOp.precedence && expr.operator != ownOp && !stripped.matches("[0-9A-Za-z_]+")) {
                    return "(" + stripped + ")";
                }
            }
            return stripped;
        }

        @Override
        public String toPrettyString(String indent, String increment) {
            OperatorExpression operatorExpression;
            if (this.operator().precedence == 3) {
                Expression operator1 = (Expression)this.children().getFirst();
                Object op1String = OperatorExpression.stripPrint(operator1);
                if (this.operator() == Operator.CAST) {
                    return indent + "(" + (String)op1String + ")" + OperatorExpression.stripPrintOp(this.children().get(1), this.operator());
                }
                if (operator1 instanceof OperatorExpression) {
                    OperatorExpression operatorExpression2 = (OperatorExpression)operator1;
                    if (operatorExpression2.operator().precedence < this.operator().precedence) {
                        op1String = "(" + (String)op1String + ")";
                    }
                }
                if (this.operator().isPostfix()) {
                    return indent + (String)op1String + String.valueOf((Object)this.operator());
                }
                return indent + String.valueOf((Object)this.operator()) + (String)op1String;
            }
            if (this.operator().precedence == 2) {
                Expression operator1 = (Expression)this.children().getFirst();
                String op1String = OperatorExpression.stripPrintOp(operator1, this.operator);
                if (this.operator == Operator.SUBSCRIPT) {
                    String op2String = OperatorExpression.stripPrint(this.children().get(1));
                    return indent + op1String + "[" + op2String + "]";
                }
                if (this.operator == Operator.MEMBER_ACCESS) {
                    String op2String = OperatorExpression.stripPrint(this.children().get(1));
                    return indent + op1String + "." + op2String;
                }
                if (this.operator == Operator.PTR_MEMBER_ACCESS) {
                    String op2String = OperatorExpression.stripPrint(this.children().get(1));
                    return indent + op1String + "->" + op2String;
                }
                return indent + op1String + String.valueOf((Object)this.operator());
            }
            if (this.operator().precedence == 16) {
                if (this.operator() == Operator.CONDITIONAL) {
                    Expression operator1 = this.children().get(0);
                    Expression operator2 = this.children().get(1);
                    Expression operator3 = this.children().get(2);
                    String op1String = OperatorExpression.stripPrintOp(operator1, this.operator);
                    String op2String = OperatorExpression.stripPrintOp(operator2, this.operator);
                    String op3String = OperatorExpression.stripPrintOp(operator3, this.operator);
                    return indent + op1String + " ? " + op2String + " : " + op3String;
                }
                Expression operator1 = this.children().get(0);
                Expression operator2 = this.children().get(1);
                String op1String = OperatorExpression.stripPrintOp(operator1, this.operator);
                String op2String = OperatorExpression.stripPrintOp(operator2, this.operator);
                return indent + op1String + " " + String.valueOf((Object)this.operator()) + " " + op2String;
            }
            if (this.operator() == Operator.MEMBER_ACCESS) {
                Expression operator1 = this.children().get(0);
                Expression operator2 = this.children().get(1);
                String op1String = OperatorExpression.stripPrintOp(operator1, this.operator);
                String op2String = OperatorExpression.stripPrintOp(operator2, this.operator);
                return indent + op1String + "." + op2String;
            }
            if (this.operator() == Operator.SUBSCRIPT) {
                Expression operator1 = this.children().get(0);
                Expression operator2 = this.children().get(1);
                String op1String = OperatorExpression.stripPrintOp(operator1, this.operator);
                String op2String = OperatorExpression.stripPrintOp(operator2, this.operator);
                return indent + op1String + "[" + op2String + "]";
            }
            if (this.operator() == Operator.FUNCTION_CALL) {
                Expression func = (Expression)this.children().getFirst();
                Object funcString = OperatorExpression.stripPrint(func);
                if (func instanceof OperatorExpression) {
                    funcString = "(" + (String)funcString + ")";
                }
                return indent + (String)funcString + "(" + this.children().stream().skip(1L).map(OperatorExpression::stripPrint).collect(Collectors.joining(", ")) + ")";
            }
            if (this.operator() == Operator.SIZEOF) {
                Expression operator1 = (Expression)this.children().getFirst();
                String op1String = OperatorExpression.stripPrint(operator1);
                return indent + "sizeof(" + op1String + ")";
            }
            if (this.operator().isUnitary()) {
                Expression operator1 = (Expression)this.children().getFirst();
                String op1String = OperatorExpression.stripPrintOp(operator1, this.operator);
                if (this.operator().associativity == Operator.Associativity.RIGHT) {
                    return indent + String.valueOf((Object)this.operator()) + op1String;
                }
                return indent + op1String + String.valueOf((Object)this.operator());
            }
            Expression operator1 = this.children().get(0);
            Expression operator2 = this.children().get(1);
            Object op1String = OperatorExpression.stripPrint(operator1);
            Object op2String = OperatorExpression.stripPrint(operator2);
            if (operator1 instanceof OperatorExpression) {
                operatorExpression = (OperatorExpression)operator1;
                if (operatorExpression.operator().precedence < this.operator().precedence) {
                    op1String = "(" + (String)op1String + ")";
                } else if (operatorExpression.operator().precedence == this.operator().precedence && operatorExpression.operator().associativity == Operator.Associativity.LEFT) {
                    op1String = "(" + (String)op1String + ")";
                }
            }
            if (operator2 instanceof OperatorExpression) {
                operatorExpression = (OperatorExpression)operator2;
                if (operatorExpression.operator().precedence < this.operator().precedence) {
                    op2String = "(" + (String)op2String + ")";
                } else if (operatorExpression.operator().precedence == this.operator().precedence && operatorExpression.operator().associativity == Operator.Associativity.RIGHT) {
                    op2String = "(" + (String)op2String + ")";
                }
            }
            return indent + (String)op1String + " " + String.valueOf((Object)this.operator()) + " " + (String)op2String;
        }

        @Override
        public Expression replaceReturnStatement(Statement newLastStatement) {
            return new OperatorExpression(this.operator, (Expression[])this.children().stream().map(e -> e.replaceReturnStatement(newLastStatement)).toArray(Expression[]::new));
        }

        public static OperatorExpression binary(String op, Expression left, Expression right) {
            return new OperatorExpression(Operator.binary(op), left, right);
        }

        public static OperatorExpression unary(String op, Expression expression) {
            return new OperatorExpression(Operator.unary(op), expression);
        }

        public static OperatorExpression postfix(String op, Expression expression) {
            return new OperatorExpression(Operator.postfix(op), expression);
        }

        public static OperatorExpression assignment(String op, Expression left, Expression right) {
            return new OperatorExpression(Operator.assignment(op), left, right);
        }

        public static OperatorExpression ternary(Expression condition, Expression trueExpression, Expression falseExpression) {
            return new OperatorExpression(Operator.CONDITIONAL, condition, trueExpression, falseExpression);
        }

        public static OperatorExpression memberAccess(Expression left, Expression right) {
            return new OperatorExpression(Operator.MEMBER_ACCESS, left, right);
        }

        public static OperatorExpression arrayAccess(Expression left, Expression right) {
            return new OperatorExpression(Operator.SUBSCRIPT, left, right);
        }

        public static OperatorExpression call(Expression func, Expression ... args) {
            return new OperatorExpression(Operator.FUNCTION_CALL, (Expression[])Stream.concat(Stream.of(func), Arrays.stream(args)).toArray(Expression[]::new));
        }

        public static OperatorExpression pointer(Expression expression) {
            return new OperatorExpression(Operator.DEREFERENCE, expression);
        }

        public static OperatorExpression cast(Declarator type2, Expression expression) {
            return new OperatorExpression(Operator.CAST, type2, expression);
        }
    }

    public static enum Operator {
        SUFFIX_INCREMENT("++", 2),
        SUFFIX_DECREMENT("--", 2),
        FUNCTION_CALL("()", 2),
        SUBSCRIPT("[]", 2),
        PTR_MEMBER_ACCESS("->", 2),
        MEMBER_ACCESS(".", 2),
        POSTFIX_INCREMENT("++", 3),
        POSTFIX_DECREMENT("--", 3),
        UNARY_PLUS("+", 3),
        UNARY_MINUS("-", 3),
        LOGICAL_NOT("!", 3),
        BITWISE_NOT("~", 3),
        DEREFERENCE("*", 3),
        ADDRESS_OF("&", 3),
        SIZEOF("sizeof", 3),
        CAST("cast", 3),
        MULTIPLICATION("*", 5),
        DIVISION("/", 5),
        MODULUS("%", 5),
        ADDITION("+", 6),
        SUBTRACTION("-", 6),
        SHIFT_LEFT("<<", 7),
        SHIFT_RIGHT(">>", 7),
        LESS_THAN("<", 9),
        LESS_THAN_OR_EQUAL("<=", 9),
        GREATER_THAN(">", 9),
        GREATER_THAN_OR_EQUAL(">=", 9),
        EQUAL("==", 10),
        NOT_EQUAL("!=", 10),
        BITWISE_AND("&", 11),
        BITWISE_XOR("^", 12),
        BITWISE_OR("|", 13),
        LOGICAL_AND("&&", 14),
        LOGICAL_OR("||", 15),
        CONDITIONAL("?", 16),
        ASSIGNMENT("=", 16),
        MULTIPLICATION_ASSIGNMENT("*=", 16),
        DIVISION_ASSIGNMENT("/=", 16),
        MODULUS_ASSIGNMENT("%=", 16),
        ADDITION_ASSIGNMENT("+=", 16),
        SUBTRACTION_ASSIGNMENT("-=", 16),
        SHIFT_LEFT_ASSIGNMENT("<<=", 16),
        SHIFT_RIGHT_ASSIGNMENT(">>=", 16),
        BITWISE_AND_ASSIGNMENT("&=", 16),
        BITWISE_XOR_ASSIGNMENT("^=", 16),
        BITWISE_OR_ASSIGNMENT("|=", 16),
        COMMA(",", 17);

        private static final Map<String, Operator> OPERATORS;
        private static final Map<String, Operator> ASSIGNMENT_OPERATORS;
        private static final Map<String, Operator> UNARY_OPERATORS;
        private static final Map<String, Operator> BINARY_OPERATORS;
        private static final Map<String, Operator> POSTFIX_OPERATORS;
        public final String op;
        public final int precedence;
        public final Associativity associativity;

        private Operator(String op, int precedence) {
            this.op = op;
            this.precedence = precedence;
            this.associativity = precedence == 3 || precedence == 16 ? Associativity.RIGHT : Associativity.LEFT;
        }

        public boolean isPostfix() {
            return this.name().startsWith("POSTFIX_");
        }

        public boolean isUnitary() {
            return this.precedence == 3 || this.precedence == 2;
        }

        public String toString() {
            return this.op;
        }

        static Operator binary(String op) {
            return BINARY_OPERATORS.get(op);
        }

        static Operator unary(String op) {
            return UNARY_OPERATORS.get(op);
        }

        static Operator postfix(String op) {
            return POSTFIX_OPERATORS.get(op);
        }

        static Operator assignment(String op) {
            return ASSIGNMENT_OPERATORS.get(op);
        }

        static Operator fromString(String op) {
            return OPERATORS.get(op);
        }

        static {
            OPERATORS = new HashMap<String, Operator>();
            ASSIGNMENT_OPERATORS = new HashMap<String, Operator>();
            UNARY_OPERATORS = new HashMap<String, Operator>();
            BINARY_OPERATORS = new HashMap<String, Operator>();
            POSTFIX_OPERATORS = new HashMap<String, Operator>();
            for (Operator op : Operator.values()) {
                OPERATORS.put(op.op, op);
                if (op.op.endsWith("=")) {
                    ASSIGNMENT_OPERATORS.put(op.op, op);
                    continue;
                }
                if (op.precedence == 3) {
                    UNARY_OPERATORS.put(op.op, op);
                    continue;
                }
                if (op.precedence == 2) {
                    POSTFIX_OPERATORS.put(op.op, op);
                    continue;
                }
                BINARY_OPERATORS.put(op.op, op);
            }
        }

        public static enum Associativity {
            LEFT,
            RIGHT;

        }
    }

    public static sealed interface PrimaryExpression
    extends Expression {
        @Override
        default public List<? extends Expression> children() {
            return List.of();
        }

        public record TypeExpression(Declarator declarator) implements PrimaryExpression
        {
            @Override
            public String toPrettyString(String indent, String increment) {
                return indent + this.declarator.toPrettyString();
            }
        }

        public record VerbatimExpression(String code) implements PrimaryExpression
        {
            public List<? extends PrimaryExpression> children() {
                return List.of();
            }

            @Override
            public String toPrettyString(String indent, String increment) {
                return this.code.lines().map(l -> indent + l).collect(Collectors.joining("\n"));
            }

            @Override
            public Expression replaceReturnStatement(Statement newLastStatement) {
                return new VerbatimExpression(CAST.replaceReturnOutsideStrings(this.code, newLastStatement.toPrettyString()));
            }
        }

        public record ParenthesizedExpression(Expression expression) implements PrimaryExpression
        {
            @Override
            public String toPrettyString(String indent, String increment) {
                return indent + "(" + this.expression.toPrettyString() + ")";
            }

            @Override
            public List<? extends Expression> children() {
                return List.of((Object)this.expression);
            }

            @Override
            public Expression replaceReturnStatement(Statement newLastStatement) {
                return new ParenthesizedExpression(this.expression.replaceReturnStatement(newLastStatement));
            }
        }

        public static sealed interface Constant<T>
        extends PrimaryExpression {
            public T value();

            public static final class DoubleConstant
            extends Record
            implements Constant<Double> {
                private final Double value;

                public DoubleConstant(Double value) {
                    this.value = value;
                }

                @Override
                public String toPrettyString(String indent, String increment) {
                    return indent + this.value;
                }

                public final String toString() {
                    return ObjectMethods.bootstrap("toString", new MethodHandle[]{DoubleConstant.class, "value", "value"}, this);
                }

                public final int hashCode() {
                    return (int)ObjectMethods.bootstrap("hashCode", new MethodHandle[]{DoubleConstant.class, "value", "value"}, this);
                }

                public final boolean equals(Object o) {
                    return (boolean)ObjectMethods.bootstrap("equals", new MethodHandle[]{DoubleConstant.class, "value", "value"}, this, o);
                }

                @Override
                public Double value() {
                    return this.value;
                }
            }

            public static final class FloatConstant
            extends Record
            implements Constant<Float> {
                private final Float value;

                public FloatConstant(Float value) {
                    this.value = value;
                }

                @Override
                public String toPrettyString(String indent, String increment) {
                    return indent + this.value;
                }

                public final String toString() {
                    return ObjectMethods.bootstrap("toString", new MethodHandle[]{FloatConstant.class, "value", "value"}, this);
                }

                public final int hashCode() {
                    return (int)ObjectMethods.bootstrap("hashCode", new MethodHandle[]{FloatConstant.class, "value", "value"}, this);
                }

                public final boolean equals(Object o) {
                    return (boolean)ObjectMethods.bootstrap("equals", new MethodHandle[]{FloatConstant.class, "value", "value"}, this, o);
                }

                @Override
                public Float value() {
                    return this.value;
                }
            }

            public static final class StringConstant
            extends Record
            implements Constant<String> {
                private final String value;

                public StringConstant(String value) {
                    this.value = value;
                }

                @Override
                public String toPrettyString(String indent, String increment) {
                    return indent + CAST.toStringLiteral(this.value);
                }

                public final String toString() {
                    return ObjectMethods.bootstrap("toString", new MethodHandle[]{StringConstant.class, "value", "value"}, this);
                }

                public final int hashCode() {
                    return (int)ObjectMethods.bootstrap("hashCode", new MethodHandle[]{StringConstant.class, "value", "value"}, this);
                }

                public final boolean equals(Object o) {
                    return (boolean)ObjectMethods.bootstrap("equals", new MethodHandle[]{StringConstant.class, "value", "value"}, this, o);
                }

                @Override
                public String value() {
                    return this.value;
                }
            }

            public static final class CharConstant
            extends Record
            implements Constant<Character> {
                private final Character value;

                public CharConstant(Character value) {
                    this.value = value;
                }

                @Override
                public String toPrettyString(String indent, String increment) {
                    return indent + "'" + String.valueOf(this.value.charValue() == '\'' ? "\\'" : this.value) + "'";
                }

                public final String toString() {
                    return ObjectMethods.bootstrap("toString", new MethodHandle[]{CharConstant.class, "value", "value"}, this);
                }

                public final int hashCode() {
                    return (int)ObjectMethods.bootstrap("hashCode", new MethodHandle[]{CharConstant.class, "value", "value"}, this);
                }

                public final boolean equals(Object o) {
                    return (boolean)ObjectMethods.bootstrap("equals", new MethodHandle[]{CharConstant.class, "value", "value"}, this, o);
                }

                @Override
                public Character value() {
                    return this.value;
                }
            }

            public static final class LongConstant
            extends Record
            implements Constant<Long> {
                private final Long value;

                public LongConstant(Long value) {
                    this.value = value;
                }

                @Override
                public String toPrettyString(String indent, String increment) {
                    return indent + this.value + "L";
                }

                public final String toString() {
                    return ObjectMethods.bootstrap("toString", new MethodHandle[]{LongConstant.class, "value", "value"}, this);
                }

                public final int hashCode() {
                    return (int)ObjectMethods.bootstrap("hashCode", new MethodHandle[]{LongConstant.class, "value", "value"}, this);
                }

                public final boolean equals(Object o) {
                    return (boolean)ObjectMethods.bootstrap("equals", new MethodHandle[]{LongConstant.class, "value", "value"}, this, o);
                }

                @Override
                public Long value() {
                    return this.value;
                }
            }

            public static final class IntegerConstant
            extends Record
            implements Constant<Integer> {
                private final Integer value;

                public IntegerConstant(Integer value) {
                    this.value = value;
                }

                @Override
                public String toPrettyString(String indent, String increment) {
                    return indent + this.value;
                }

                public final String toString() {
                    return ObjectMethods.bootstrap("toString", new MethodHandle[]{IntegerConstant.class, "value", "value"}, this);
                }

                public final int hashCode() {
                    return (int)ObjectMethods.bootstrap("hashCode", new MethodHandle[]{IntegerConstant.class, "value", "value"}, this);
                }

                public final boolean equals(Object o) {
                    return (boolean)ObjectMethods.bootstrap("equals", new MethodHandle[]{IntegerConstant.class, "value", "value"}, this, o);
                }

                @Override
                public Integer value() {
                    return this.value;
                }
            }
        }

        public record EnumerationConstant(String name) implements PrimaryExpression
        {
            @Override
            public String toPrettyString(String indent, String increment) {
                return indent + this.name;
            }
        }

        public record Variable(String name, CAnnotation[] annotations) implements PrimaryExpression
        {
            @Override
            public String toPrettyString(String indent, String increment) {
                String annString = this.annotationsString();
                return indent + this.name + (String)(annString.isEmpty() ? "" : " " + annString);
            }

            public String annotationsString() {
                return Arrays.stream(this.annotations).map(CAST::toPrettyString).collect(Collectors.joining(" "));
            }

            public String toString() {
                return this.toPrettyString("", "");
            }
        }

        public record CAnnotation(String annotation, String value) implements CAST
        {
            @Override
            public List<? extends CAST> children() {
                return List.of();
            }

            @Override
            public String toPrettyString(String indent, String increment) {
                return indent + this.annotation + "(" + Expression.constant(this.value).toPrettyString() + ")";
            }

            static CAnnotation annotation(String annotation, String value) {
                return new CAnnotation(annotation, value);
            }

            public static CAnnotation sec(String value) {
                return new CAnnotation("SEC", value);
            }

            @Override
            public Statement toStatement() {
                throw new UnsupportedOperationException("CAnnotation cannot be converted to a statement");
            }
        }
    }

    public static sealed interface Expression
    extends CAST
    permits Declarator, InitDeclarator, Initializer, OperatorExpression, PrimaryExpression {
        public List<? extends Expression> children();

        @Override
        default public Statement toStatement() {
            return Statement.expression(this);
        }

        default public Expression replaceReturnStatement(Statement newLastStatement) {
            return this;
        }

        public static PrimaryExpression.Constant<?> constant(Object value) {
            Object object = value;
            Objects.requireNonNull(object);
            Object object2 = object;
            int n = 0;
            switch (SwitchBootstraps.typeSwitch("typeSwitch", new Object[]{Integer.class, Long.class, Character.class, String.class, Double.class, Float.class, Byte.class, Short.class, Boolean.class}, (Object)object2, (int)n)) {
                case 0: {
                    Integer i = (Integer)object2;
                    return new PrimaryExpression.Constant.IntegerConstant(i);
                }
                case 1: {
                    Long l = (Long)object2;
                    return new PrimaryExpression.Constant.LongConstant(l);
                }
                case 2: {
                    Character c = (Character)object2;
                    return new PrimaryExpression.Constant.CharConstant(c);
                }
                case 3: {
                    String s2 = (String)object2;
                    return new PrimaryExpression.Constant.StringConstant(s2);
                }
                case 4: {
                    Double d = (Double)object2;
                    return new PrimaryExpression.Constant.DoubleConstant(d);
                }
                case 5: {
                    Float f = (Float)object2;
                    return new PrimaryExpression.Constant.FloatConstant(f);
                }
                case 6: {
                    Byte b = (Byte)object2;
                    return new PrimaryExpression.Constant.IntegerConstant((int)b);
                }
                case 7: {
                    Short s3 = (Short)object2;
                    return new PrimaryExpression.Constant.IntegerConstant((int)s3);
                }
                case 8: {
                    Boolean b = (Boolean)object2;
                    return new PrimaryExpression.Constant.IntegerConstant(b != false ? 1 : 0);
                }
            }
            throw new IllegalArgumentException("Unsupported constant type: " + String.valueOf(value.getClass()));
        }

        public static PrimaryExpression.Variable variable(String name) {
            return name == null ? null : new PrimaryExpression.Variable(name, new PrimaryExpression.CAnnotation[0]);
        }

        public static PrimaryExpression.Variable variable(String name, PrimaryExpression.CAnnotation ... annotations) {
            return new PrimaryExpression.Variable(name, annotations);
        }

        public static PrimaryExpression.ParenthesizedExpression parenthesizedExpression(Expression expression) {
            return new PrimaryExpression.ParenthesizedExpression(expression);
        }

        public static PrimaryExpression.EnumerationConstant enumerationConstant(String name) {
            return new PrimaryExpression.EnumerationConstant(name);
        }

        public static PrimaryExpression.VerbatimExpression verbatim(String code2) {
            return new PrimaryExpression.VerbatimExpression(code2);
        }

        public static PrimaryExpression.Variable _void() {
            return new PrimaryExpression.Variable("void", new PrimaryExpression.CAnnotation[0]);
        }
    }
}

