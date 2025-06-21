/*
 * Decompiled with CFR 0.153-SNAPSHOT (d6f6758-dirty).
 * 
 * Could not load the following classes:
 *  com.sun.source.tree.ArrayAccessTree
 *  com.sun.source.tree.AssignmentTree
 *  com.sun.source.tree.BinaryTree
 *  com.sun.source.tree.BlockTree
 *  com.sun.source.tree.BreakTree
 *  com.sun.source.tree.CompoundAssignmentTree
 *  com.sun.source.tree.ConditionalExpressionTree
 *  com.sun.source.tree.ContinueTree
 *  com.sun.source.tree.ExpressionStatementTree
 *  com.sun.source.tree.ExpressionTree
 *  com.sun.source.tree.ForLoopTree
 *  com.sun.source.tree.IdentifierTree
 *  com.sun.source.tree.IfTree
 *  com.sun.source.tree.LambdaExpressionTree
 *  com.sun.source.tree.LiteralTree
 *  com.sun.source.tree.MemberSelectTree
 *  com.sun.source.tree.MethodInvocationTree
 *  com.sun.source.tree.MethodTree
 *  com.sun.source.tree.NewArrayTree
 *  com.sun.source.tree.NewClassTree
 *  com.sun.source.tree.ParenthesizedTree
 *  com.sun.source.tree.ReturnTree
 *  com.sun.source.tree.StatementTree
 *  com.sun.source.tree.Tree
 *  com.sun.source.tree.TypeCastTree
 *  com.sun.source.tree.UnaryTree
 *  com.sun.source.tree.VariableTree
 *  com.sun.source.tree.WhileLoopTree
 *  com.sun.tools.javac.code.Symbol
 *  com.sun.tools.javac.code.Symbol$ClassSymbol
 *  com.sun.tools.javac.code.Symbol$MethodSymbol
 *  com.sun.tools.javac.code.Symbol$TypeVariableSymbol
 *  com.sun.tools.javac.code.Type
 *  com.sun.tools.javac.code.Type$ClassType
 *  com.sun.tools.javac.tree.JCTree$JCAnnotatedType
 *  com.sun.tools.javac.tree.JCTree$JCExpression
 *  com.sun.tools.javac.tree.JCTree$JCFieldAccess
 *  com.sun.tools.javac.tree.JCTree$JCIdent
 *  com.sun.tools.javac.tree.JCTree$JCMethodInvocation
 *  com.sun.tools.javac.tree.JCTree$JCNewArray
 *  com.sun.tools.javac.tree.JCTree$JCPrimitiveTypeTree
 *  com.sun.tools.javac.tree.JCTree$JCTypeCast
 *  java.lang.runtime.SwitchBootstraps
 */
package me.bechberger.ebpf.bpf.compiler;

import com.sun.source.tree.ArrayAccessTree;
import com.sun.source.tree.AssignmentTree;
import com.sun.source.tree.BinaryTree;
import com.sun.source.tree.BlockTree;
import com.sun.source.tree.BreakTree;
import com.sun.source.tree.CompoundAssignmentTree;
import com.sun.source.tree.ConditionalExpressionTree;
import com.sun.source.tree.ContinueTree;
import com.sun.source.tree.ExpressionStatementTree;
import com.sun.source.tree.ExpressionTree;
import com.sun.source.tree.ForLoopTree;
import com.sun.source.tree.IdentifierTree;
import com.sun.source.tree.IfTree;
import com.sun.source.tree.LambdaExpressionTree;
import com.sun.source.tree.LiteralTree;
import com.sun.source.tree.MemberSelectTree;
import com.sun.source.tree.MethodInvocationTree;
import com.sun.source.tree.MethodTree;
import com.sun.source.tree.NewArrayTree;
import com.sun.source.tree.NewClassTree;
import com.sun.source.tree.ParenthesizedTree;
import com.sun.source.tree.ReturnTree;
import com.sun.source.tree.StatementTree;
import com.sun.source.tree.Tree;
import com.sun.source.tree.TypeCastTree;
import com.sun.source.tree.UnaryTree;
import com.sun.source.tree.VariableTree;
import com.sun.source.tree.WhileLoopTree;
import com.sun.tools.javac.code.Symbol;
import com.sun.tools.javac.code.Type;
import com.sun.tools.javac.tree.JCTree;
import java.lang.runtime.SwitchBootstraps;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Objects;
import java.util.Optional;
import java.util.Set;
import javax.lang.model.AnnotatedConstruct;
import javax.lang.model.element.Element;
import javax.lang.model.element.ElementKind;
import javax.lang.model.element.Name;
import javax.lang.model.element.TypeElement;
import javax.lang.model.element.VariableElement;
import javax.lang.model.type.TypeKind;
import javax.lang.model.type.TypeMirror;
import me.bechberger.cast.CAST;
import me.bechberger.ebpf.NameUtil;
import me.bechberger.ebpf.annotations.AlwaysInline;
import me.bechberger.ebpf.annotations.CustomType;
import me.bechberger.ebpf.annotations.EnumMember;
import me.bechberger.ebpf.annotations.bpf.BPFFunction;
import me.bechberger.ebpf.bpf.compiler.CompilerPlugin;
import me.bechberger.ebpf.bpf.compiler.MethodHeaderTemplate;
import me.bechberger.ebpf.bpf.compiler.MethodTemplate;
import me.bechberger.ebpf.bpf.compiler.MethodTemplateCache;
import me.bechberger.ebpf.bpf.compiler.NullHelpers;
import me.bechberger.ebpf.bpf.processor.AnnotationUtils;
import me.bechberger.ebpf.bpf.processor.BPFTypeLike;
import me.bechberger.ebpf.bpf.processor.TypeProcessor;
import me.bechberger.ebpf.type.BPFType;
import me.bechberger.ebpf.type.Ptr;
import org.jetbrains.annotations.Nullable;

class Translator {
    private final CompilerPlugin compilerPlugin;
    private final CompilerPlugin.TypedTreePath<MethodTree> methodPath;
    private final Set<CAST.Statement.Define> requiredDefines = new HashSet<CAST.Statement.Define>();

    Translator(CompilerPlugin compilerPlugin, CompilerPlugin.TypedTreePath<MethodTree> methodPath) {
        this.compilerPlugin = compilerPlugin;
        this.methodPath = methodPath;
    }

    public Set<CAST.Statement.Define> getRequiredDefines() {
        return this.requiredDefines;
    }

    void logError(Tree tree, String message) {
        this.compilerPlugin.logError(this.methodPath, tree, message);
    }

    @Nullable
    CAST.Declarator.FunctionHeader toDeclarator() {
        List<CAST.Declarator.FunctionParameter> params;
        BPFFunction annotation = this.compilerPlugin.getAnnotationOfMethodOrSuper((Symbol.MethodSymbol)this.compilerPlugin.trees.getElement(this.methodPath.path()), BPFFunction.class);
        MethodTree method = this.methodPath.leaf();
        Symbol.MethodSymbol methodElement = (Symbol.MethodSymbol)this.compilerPlugin.trees.getElement(this.methodPath.path((Tree)method));
        String name = method.getName().toString();
        if (annotation != null && !annotation.name().isEmpty()) {
            name = annotation.name();
        }
        TypeProcessor.DataTypeKind retKind = this.typeKind((Element)methodElement.getReturnType().asElement());
        CAST.Declarator returnType = this.translateType((Element)methodElement, (TypeMirror)methodElement.getReturnType());
        if (retKind != TypeProcessor.DataTypeKind.ENUM && retKind != TypeProcessor.DataTypeKind.NONE && returnType != null) {
            this.logError((Tree)method, "Unsupported return type: " + String.valueOf(method.getReturnType()) + " as BPF does not support returning structs from functions");
            return null;
        }
        boolean hadError = false;
        if (returnType == null) {
            this.logError((Tree)method, "Unsupported return type: " + String.valueOf(method.getReturnType()));
            hadError = true;
        }
        if (returnType != null && returnType.toPrettyString().equals("void")) {
            returnType = CAST.Declarator.identifier("int");
        }
        if ((params = this.translateFunctionParameters(method.getParameters())) == null) {
            return null;
        }
        CAST.Declarator.FunctionDeclarator decl = new CAST.Declarator.FunctionDeclarator(CAST.Expression.variable(name), returnType, params);
        assert (annotation != null);
        AlwaysInline alwaysInline = this.compilerPlugin.getAnnotationOfMethodOrSuper(methodElement, AlwaysInline.class);
        return MethodHeaderTemplate.parse(annotation.headerTemplate()).call(decl, alwaysInline != null ? "__always_inline " : "");
    }

    @Nullable
    List<CAST.Declarator.FunctionParameter> translateFunctionParameters(List<? extends VariableTree> parameters) {
        ArrayList<CAST.Declarator.FunctionParameter> translated = new ArrayList<CAST.Declarator.FunctionParameter>();
        boolean hadError = false;
        for (VariableTree variableTree : parameters) {
            TypeMirror typeMirror = this.compilerPlugin.trees.getElement(this.methodPath.path((Tree)variableTree)).asType();
            CAST.Declarator type2 = this.translateType(this.compilerPlugin.trees.getElement(this.methodPath.path((Tree)variableTree)), typeMirror);
            if (type2 == null) {
                this.logError((Tree)variableTree, "Unsupported parameter type: " + String.valueOf(typeMirror));
                hadError = true;
            }
            String name = variableTree.getName().toString();
            translated.add(new CAST.Declarator.FunctionParameter(CAST.Expression.variable(name), type2));
        }
        return hadError ? null : translated;
    }

    public boolean addDefinition() {
        BPFFunction annotation = this.compilerPlugin.getAnnotationOfMethodOrSuper((Symbol.MethodSymbol)this.compilerPlugin.trees.getElement(this.methodPath.path()), BPFFunction.class);
        return annotation == null || annotation.addDefinition();
    }

    CAST.Statement.FunctionDeclarationStatement translate() {
        return this.translate(false);
    }

    CAST.Statement.FunctionDeclarationStatement translateIgnoringBody() {
        return this.translate(true);
    }

    @Nullable
    private CAST.Statement.FunctionDeclarationStatement translate(boolean ignoreBody) {
        MethodTree method = this.methodPath.leaf();
        BPFFunction bpfAnn = this.compilerPlugin.getAnnotationOfMethodOrSuper((Symbol.MethodSymbol)this.compilerPlugin.trees.getElement(this.methodPath.path()), BPFFunction.class);
        if (bpfAnn == null) {
            this.logError((Tree)method, "Method is not annotated with @BPFFunction");
            return null;
        }
        CAST.Declarator.FunctionHeader declarator = this.toDeclarator();
        CAST.Statement.CompoundStatement body = ignoreBody ? new CAST.Statement.CompoundStatement(List.of()) : this.translate(method.getBody());
        boolean addReturnZero = method.getReturnType().toString().equals("void");
        return NullHelpers.callIfNonNull(declarator, body, (d, b) -> {
            if (!bpfAnn.lastStatement().isBlank() || addReturnZero) {
                CAST.Statement.VerbatimStatement returnStatement = new CAST.Statement.VerbatimStatement(bpfAnn.lastStatement().isBlank() ? "return 0;" : bpfAnn.lastStatement());
                ArrayList<CAST.Statement> statements = new ArrayList<CAST.Statement>(b.replaceReturnStatement(returnStatement).statements());
                if (statements.isEmpty() || !((CAST.Statement)statements.getLast()).equals(returnStatement)) {
                    statements.add(returnStatement);
                }
                b = new CAST.Statement.CompoundStatement(statements);
            }
            if (bpfAnn.section().isBlank()) {
                return new CAST.Statement.FunctionDeclarationStatement((CAST.Declarator.FunctionHeader)d, (CAST.Statement.CompoundStatement)b, new CAST.PrimaryExpression.CAnnotation[0]);
            }
            return new CAST.Statement.FunctionDeclarationStatement((CAST.Declarator.FunctionHeader)d, (CAST.Statement.CompoundStatement)b, CAST.PrimaryExpression.CAnnotation.sec(bpfAnn.section()));
        });
    }

    @Nullable
    CAST.Statement.CompoundStatement translate(BlockTree block) {
        List statements = block.getStatements();
        ArrayList<CAST.Statement> translated = new ArrayList<CAST.Statement>();
        boolean hadError = false;
        for (StatementTree statement : statements) {
            CAST.Statement translatedStatement = this.translate(statement);
            if (translatedStatement != null) {
                translated.add(translatedStatement);
                continue;
            }
            hadError = true;
        }
        return hadError ? null : new CAST.Statement.CompoundStatement(translated);
    }

    @Nullable
    List<CAST.Statement> translate(List<? extends StatementTree> statements) {
        ArrayList<CAST.Statement> translated = new ArrayList<CAST.Statement>();
        boolean hadError = false;
        for (StatementTree statementTree : statements) {
            CAST.Statement translatedStatement = this.translate(statementTree);
            if (translatedStatement != null) {
                translated.add(translatedStatement);
                continue;
            }
            hadError = true;
        }
        return hadError ? null : translated;
    }

    /*
     * Enabled force condition propagation
     * Lifted jumps to return sites
     */
    @Nullable
    CAST.Statement translate(StatementTree statement) {
        StatementTree statementTree = statement;
        Objects.requireNonNull(statementTree);
        StatementTree statementTree2 = statementTree;
        int n = 0;
        switch (SwitchBootstraps.typeSwitch("typeSwitch", new Object[]{ReturnTree.class, BlockTree.class, ExpressionStatementTree.class, VariableTree.class, IfTree.class, ForLoopTree.class, WhileLoopTree.class, BreakTree.class, ContinueTree.class}, (Object)statementTree2, (int)n)) {
            case 0: {
                ReturnTree returnTree = (ReturnTree)statementTree2;
                CAST.Statement statement2 = this.translate(returnTree);
                return statement2;
            }
            case 1: {
                BlockTree blockTree = (BlockTree)statementTree2;
                CAST.Statement statement2 = this.translate(blockTree);
                return statement2;
            }
            case 2: {
                ExpressionStatementTree expressionStatementTree = (ExpressionStatementTree)statementTree2;
                CAST.Expression expression = this.translate(expressionStatementTree.getExpression());
                if (expression == null) return null;
                CAST.Statement statement2 = new CAST.Statement.ExpressionStatement(expression);
                return statement2;
            }
            case 3: {
                CAST.PrimaryExpression.VerbatimExpression valExpr;
                CAST.Expression expression;
                CAST.OperatorExpression exp;
                VariableTree variableTree = (VariableTree)statementTree2;
                TypeMirror typeMirror = this.compilerPlugin.trees.getElement(this.methodPath.path((Tree)variableTree)).asType();
                CAST.Expression initializer = null;
                List<Integer> sizes = List.of();
                ExpressionTree initTree = variableTree.getInitializer();
                if (initTree != null) {
                    if (initTree instanceof NewArrayTree) {
                        NewArrayTree newArrayTree = (NewArrayTree)initTree;
                        ExpressionAndPossibleSizes initAnd = this.translate(typeMirror, newArrayTree);
                        if (initAnd == null) return null;
                        initializer = initAnd.expression();
                        sizes = initAnd.sizes();
                    } else {
                        initializer = this.translate(initTree);
                        if (initializer == null) {
                            return null;
                        }
                    }
                }
                CAST.Declarator type2 = this.translateType(this.compilerPlugin.trees.getElement(this.methodPath.path((Tree)variableTree)), typeMirror, sizes);
                String name = variableTree.getName().toString();
                if (initializer instanceof CAST.OperatorExpression && (exp = (CAST.OperatorExpression)initializer).operator() == CAST.Operator.CAST && (expression = exp.expressions()[1]) instanceof CAST.PrimaryExpression.VerbatimExpression && (valExpr = (CAST.PrimaryExpression.VerbatimExpression)expression).code().equals("{}")) {
                    initializer = null;
                }
                if (type2 == null) return null;
                CAST.Statement statement2 = new CAST.Statement.VariableDefinition(type2, CAST.Expression.variable(name), initializer);
                return statement2;
            }
            case 4: {
                IfTree ifTree = (IfTree)statementTree2;
                CAST.Expression condition = this.translate(ifTree.getCondition());
                CAST.Statement thenStatement = this.translate(ifTree.getThenStatement());
                CAST.Statement elseStatement = NullHelpers.callIfNonNull(ifTree.getElseStatement(), this::translate);
                if (condition == null) return null;
                if (thenStatement == null) return null;
                CAST.Statement statement2 = new CAST.Statement.IfStatement(condition, thenStatement, elseStatement);
                return statement2;
            }
            case 5: {
                ForLoopTree forLoopTree = (ForLoopTree)statementTree2;
                List initializer = NullHelpers.callIfNonNull(forLoopTree.getInitializer(), this::translate);
                CAST.Expression condition = NullHelpers.callIfNonNull(forLoopTree.getCondition(), this::translate);
                List update = NullHelpers.callIfNonNull(forLoopTree.getUpdate(), this::translate);
                CAST.Statement body = this.translate(forLoopTree.getStatement());
                if (initializer == null) return null;
                if (condition == null) return null;
                if (update == null) return null;
                if (body == null) return null;
                CAST.Statement statement2 = new CAST.Statement.ForStatement(initializer, condition, update, body);
                return statement2;
            }
            case 6: {
                WhileLoopTree whileLoopTree = (WhileLoopTree)statementTree2;
                CAST.Expression condition = NullHelpers.callIfNonNull(whileLoopTree.getCondition(), this::translate);
                CAST.Statement body = this.translate(whileLoopTree.getStatement());
                CAST.Statement statement2 = new CAST.Statement.WhileStatement(condition, body);
                return statement2;
            }
            case 7: {
                BreakTree breakTree = (BreakTree)statementTree2;
                if (breakTree.getLabel() != null) {
                    this.logError((Tree)statement, "Unsupported label in break statement: " + String.valueOf(statement));
                    return null;
                }
                CAST.Statement statement2 = new CAST.Statement.BreakStatement();
                return statement2;
            }
            case 8: {
                ContinueTree continueTree = (ContinueTree)statementTree2;
                if (continueTree.getLabel() != null) {
                    this.logError((Tree)statement, "Unsupported label in continue statement: " + String.valueOf(statement));
                    return null;
                }
                CAST.Statement statement2 = new CAST.Statement.ContinueStatement();
                return statement2;
            }
            default: {
                this.logError((Tree)statement, "Unsupported statement kind " + String.valueOf(statement.getKind()) + ": " + String.valueOf(statement));
                return null;
            }
        }
    }

    @Nullable
    CAST.Statement translate(ReturnTree returnTree) {
        if (returnTree.getExpression() == null) {
            return new CAST.Statement.VerbatimStatement("return 0;");
        }
        return NullHelpers.callIfNonNull(this.translate(returnTree.getExpression()), CAST.Statement.ReturnStatement::new);
    }

    @Nullable
    CAST.Expression translate(ExpressionTree expression) {
        ExpressionTree expressionTree = expression;
        Objects.requireNonNull(expressionTree);
        ExpressionTree expressionTree2 = expressionTree;
        int n = 0;
        return switch (SwitchBootstraps.typeSwitch("typeSwitch", new Object[]{LiteralTree.class, IdentifierTree.class, ArrayAccessTree.class, AssignmentTree.class, BinaryTree.class, UnaryTree.class, MethodInvocationTree.class, MemberSelectTree.class, ParenthesizedTree.class, ConditionalExpressionTree.class, TypeCastTree.class, NewClassTree.class, CompoundAssignmentTree.class, LambdaExpressionTree.class}, (Object)expressionTree2, (int)n)) {
            case 0 -> {
                LiteralTree literalTree = (LiteralTree)expressionTree2;
                yield this.translate(literalTree);
            }
            case 1 -> {
                IdentifierTree identifierTree = (IdentifierTree)expressionTree2;
                Element element = this.compilerPlugin.trees.getElement(this.methodPath.path((Tree)identifierTree));
                CAST.PrimaryExpression.Variable defaultReturn = CAST.Expression.variable(identifierTree.getName().toString());
                if (element == null) {
                    yield defaultReturn;
                }
                Element var9_11 = element.getEnclosingElement();
                if (!(var9_11 instanceof Symbol.ClassSymbol)) {
                    yield defaultReturn;
                }
                Symbol.ClassSymbol classElement = (Symbol.ClassSymbol)var9_11;
                Optional<Symbol> memberSymbolOpt = classElement.getEnclosedElements().stream().filter(e -> e.getSimpleName().toString().equals(identifierTree.getName().toString())).findFirst();
                if (memberSymbolOpt.isEmpty()) {
                    yield null;
                }
                VariableElement memberSymbol = (VariableElement)memberSymbolOpt.get();
                CAST.Statement.Define define = new TypeProcessor(this.compilerPlugin.createProcessingEnvironment(), true).processField(memberSymbol);
                if (define == null) {
                    yield defaultReturn;
                }
                this.requiredDefines.add(define);
                yield CAST.Expression.variable(define.name());
            }
            case 2 -> {
                ArrayAccessTree arrayAccessTree = (ArrayAccessTree)expressionTree2;
                CAST.Expression array = this.translate(arrayAccessTree.getExpression());
                CAST.Expression index = this.translate(arrayAccessTree.getIndex());
                if (array != null && index != null) {
                    yield new CAST.OperatorExpression(CAST.Operator.SUBSCRIPT, array, index);
                }
                yield null;
            }
            case 3 -> {
                CAST.PrimaryExpression.VerbatimExpression valExpr;
                CAST.Expression var14_35;
                CAST.OperatorExpression base;
                CAST.Expression var13_29;
                CAST.OperatorExpression vexpr;
                AssignmentTree assignmentTree = (AssignmentTree)expressionTree2;
                CAST.Expression variable = this.translate(assignmentTree.getVariable());
                ExpressionTree expr = assignmentTree.getExpression();
                CAST.Expression value = this.translate(expr);
                if (variable == null || value == null) {
                    yield null;
                }
                if (variable instanceof CAST.OperatorExpression && (vexpr = (CAST.OperatorExpression)variable).operator() == CAST.Operator.MEMBER_ACCESS && (var13_29 = vexpr.expressions()[0]) instanceof CAST.OperatorExpression && (base = (CAST.OperatorExpression)var13_29).operator() == CAST.Operator.CAST && (var14_35 = base.expressions()[1]) instanceof CAST.PrimaryExpression.VerbatimExpression && (valExpr = (CAST.PrimaryExpression.VerbatimExpression)var14_35).code().startsWith("*(") && valExpr.code().endsWith(")")) {
                    CAST.PrimaryExpression.VerbatimExpression strippedValExpr = new CAST.PrimaryExpression.VerbatimExpression(valExpr.code().substring(1));
                    yield new CAST.OperatorExpression(CAST.Operator.ASSIGNMENT, new CAST.OperatorExpression(CAST.Operator.PTR_MEMBER_ACCESS, strippedValExpr, vexpr.expressions()[1]), value);
                }
                yield new CAST.OperatorExpression(CAST.Operator.ASSIGNMENT, variable, value);
            }
            case 4 -> {
                CAST.Operator operator;
                BinaryTree binaryTree = (BinaryTree)expressionTree2;
                if (this.compilerPlugin.isSameType(this.methodPath, (Tree)binaryTree, String.class)) {
                    this.logError((Tree)expression, "Unsupported string operation: " + String.valueOf(expression));
                }
                CAST.Expression left = this.translate(binaryTree.getLeftOperand());
                CAST.Expression right = this.translate(binaryTree.getRightOperand());
                switch (binaryTree.getKind()) {
                    case PLUS: {
                        CAST.Operator v2 = CAST.Operator.ADDITION;
                        break;
                    }
                    case MINUS: {
                        CAST.Operator v2 = CAST.Operator.SUBTRACTION;
                        break;
                    }
                    case MULTIPLY: {
                        CAST.Operator v2 = CAST.Operator.MULTIPLICATION;
                        break;
                    }
                    case DIVIDE: {
                        CAST.Operator v2 = CAST.Operator.DIVISION;
                        break;
                    }
                    case REMAINDER: {
                        CAST.Operator v2 = CAST.Operator.MODULUS;
                        break;
                    }
                    case AND: {
                        CAST.Operator v2 = CAST.Operator.BITWISE_AND;
                        break;
                    }
                    case OR: {
                        CAST.Operator v2 = CAST.Operator.BITWISE_OR;
                        break;
                    }
                    case XOR: {
                        CAST.Operator v2 = CAST.Operator.BITWISE_XOR;
                        break;
                    }
                    case LEFT_SHIFT: {
                        CAST.Operator v2 = CAST.Operator.SHIFT_LEFT;
                        break;
                    }
                    case RIGHT_SHIFT: {
                        CAST.Operator v2 = CAST.Operator.SHIFT_RIGHT;
                        break;
                    }
                    case LESS_THAN: {
                        CAST.Operator v2 = CAST.Operator.LESS_THAN;
                        break;
                    }
                    case GREATER_THAN: {
                        CAST.Operator v2 = CAST.Operator.GREATER_THAN;
                        break;
                    }
                    case LESS_THAN_EQUAL: {
                        CAST.Operator v2 = CAST.Operator.LESS_THAN_OR_EQUAL;
                        break;
                    }
                    case GREATER_THAN_EQUAL: {
                        CAST.Operator v2 = CAST.Operator.GREATER_THAN_OR_EQUAL;
                        break;
                    }
                    case CONDITIONAL_AND: {
                        CAST.Operator v2 = CAST.Operator.LOGICAL_AND;
                        break;
                    }
                    case CONDITIONAL_OR: {
                        CAST.Operator v2 = CAST.Operator.LOGICAL_OR;
                        break;
                    }
                    case EQUAL_TO: {
                        CAST.Operator v2 = CAST.Operator.EQUAL;
                        break;
                    }
                    case NOT_EQUAL_TO: {
                        CAST.Operator v2 = CAST.Operator.NOT_EQUAL;
                        break;
                    }
                    default: {
                        CAST.Operator v2 = operator = null;
                    }
                }
                if (operator == null) {
                    this.logError((Tree)expression, "Unsupported binary operator " + String.valueOf(binaryTree.getKind()) + ": " + String.valueOf(expression));
                    yield null;
                }
                if (left != null && right != null) {
                    yield new CAST.OperatorExpression(operator, left, right);
                }
                yield null;
            }
            case 5 -> {
                CAST.Operator operator;
                UnaryTree unaryTree = (UnaryTree)expressionTree2;
                CAST.Expression operand = this.translate(unaryTree.getExpression());
                switch (unaryTree.getKind()) {
                    case UNARY_MINUS: {
                        CAST.Operator v3 = CAST.Operator.UNARY_MINUS;
                        break;
                    }
                    case LOGICAL_COMPLEMENT: {
                        CAST.Operator v3 = CAST.Operator.LOGICAL_NOT;
                        break;
                    }
                    case BITWISE_COMPLEMENT: {
                        CAST.Operator v3 = CAST.Operator.BITWISE_NOT;
                        break;
                    }
                    case POSTFIX_INCREMENT: {
                        CAST.Operator v3 = CAST.Operator.POSTFIX_INCREMENT;
                        break;
                    }
                    case POSTFIX_DECREMENT: {
                        CAST.Operator v3 = CAST.Operator.POSTFIX_DECREMENT;
                        break;
                    }
                    case PREFIX_INCREMENT: {
                        CAST.Operator v3 = CAST.Operator.SUFFIX_INCREMENT;
                        break;
                    }
                    case PREFIX_DECREMENT: {
                        CAST.Operator v3 = CAST.Operator.SUFFIX_DECREMENT;
                        break;
                    }
                    default: {
                        CAST.Operator v3 = operator = null;
                    }
                }
                if (operator == null) {
                    this.logError((Tree)expression, "Unsupported unary operator " + String.valueOf(unaryTree.getKind()) + ": " + String.valueOf(expression));
                    yield null;
                }
                if (operand != null) {
                    yield new CAST.OperatorExpression(operator, operand);
                }
                yield null;
            }
            case 6 -> {
                MethodInvocationTree methodInvocationTree = (MethodInvocationTree)expressionTree2;
                yield this.translate(methodInvocationTree);
            }
            case 7 -> {
                Element element;
                JCTree.JCIdent ident;
                TypeMirror t;
                MemberSelectTree memberSelectTree = (MemberSelectTree)expressionTree2;
                String member = memberSelectTree.getIdentifier().toString();
                ExpressionTree strippedValExpr = memberSelectTree.getExpression();
                if (strippedValExpr instanceof JCTree.JCIdent && (t = this.compilerPlugin.trees.getElement(this.methodPath.path((Tree)(ident = (JCTree.JCIdent)strippedValExpr))).asType()) != null && (element = this.compilerPlugin.trees.getElement(this.methodPath.path((Tree)ident))) instanceof TypeElement) {
                    TypeProcessor.DataTypeKind kind = this.typeKind(element);
                    if (kind != TypeProcessor.DataTypeKind.ENUM) {
                        Symbol.ClassSymbol classElement = (Symbol.ClassSymbol)element;
                        Optional<Symbol> memberSymbolOpt = classElement.getEnclosedElements().stream().filter(e -> e.getSimpleName().toString().equals(member)).findFirst();
                        if (memberSymbolOpt.isEmpty()) {
                            this.logError((Tree)memberSelectTree, "Can't find member: " + String.valueOf(classElement.getQualifiedName()) + "." + member);
                            yield null;
                        }
                        VariableElement memberSymbol = (VariableElement)memberSymbolOpt.orElseThrow();
                        CAST.Statement.Define define = new TypeProcessor(this.compilerPlugin.createProcessingEnvironment(), true).processField(memberSymbol);
                        if (define == null) {
                            this.logError((Tree)memberSelectTree, "Unsupported constant: " + String.valueOf(classElement.getQualifiedName()) + "." + member);
                            yield null;
                        }
                        this.requiredDefines.add(define);
                        yield CAST.Expression.variable(define.name());
                    }
                    for (Symbol tMember : ((Type.ClassType)t).tsym.getEnclosedElements()) {
                        if (!tMember.getSimpleName().toString().equals(member)) continue;
                        EnumMember ann = (EnumMember)tMember.getAnnotation(EnumMember.class);
                        if (ann != null && !ann.name().isEmpty()) {
                            yield CAST.Expression.variable(ann.name());
                        }
                        yield CAST.Expression.variable(NameUtil.toConstantCase(String.valueOf(((Type.ClassType)t).tsym.getSimpleName()) + "_" + member));
                    }
                    throw new AssertionError();
                }
                CAST.Expression expr = this.translate(memberSelectTree.getExpression());
                if (member.matches("anon(\\d+)(\\$\\d+)*")) {
                    yield expr;
                }
                if (expr != null) {
                    yield new CAST.OperatorExpression(CAST.Operator.MEMBER_ACCESS, expr, CAST.Expression.variable(member));
                }
                yield null;
            }
            case 8 -> {
                ParenthesizedTree parenthesizedTree = (ParenthesizedTree)expressionTree2;
                yield NullHelpers.callIfNonNull(this.translate(parenthesizedTree.getExpression()), CAST.Expression::parenthesizedExpression);
            }
            case 9 -> {
                ConditionalExpressionTree conditionalExpressionTree = (ConditionalExpressionTree)expressionTree2;
                CAST.Expression condition = this.translate(conditionalExpressionTree.getCondition());
                CAST.Expression trueExpression = this.translate(conditionalExpressionTree.getTrueExpression());
                CAST.Expression falseExpression = this.translate(conditionalExpressionTree.getFalseExpression());
                if (condition != null && trueExpression != null && falseExpression != null) {
                    yield new CAST.OperatorExpression(CAST.Operator.CONDITIONAL, condition, trueExpression, falseExpression);
                }
                yield null;
            }
            case 10 -> {
                CAST.Declarator typeExpression;
                TypeCastTree typeCastTree = (TypeCastTree)expressionTree2;
                CAST.Expression expr = this.translate(typeCastTree.getExpression());
                Tree typeTree = typeCastTree.getType();
                if (typeTree instanceof JCTree.JCPrimitiveTypeTree) {
                    JCTree.JCPrimitiveTypeTree primitiveTypeTree = (JCTree.JCPrimitiveTypeTree)typeTree;
                    BPFType<Object> v4 = switch (primitiveTypeTree.getPrimitiveTypeKind()) {
                        case TypeKind.INT -> BPFType.BPFIntType.INT32;
                        case TypeKind.LONG -> BPFType.BPFIntType.INT64;
                        case TypeKind.FLOAT -> BPFType.BPFIntType.FLOAT;
                        case TypeKind.DOUBLE -> BPFType.BPFIntType.DOUBLE;
                        case TypeKind.BOOLEAN -> BPFType.BPFIntType.BOOL;
                        case TypeKind.CHAR -> BPFType.BPFIntType.CHAR;
                        case TypeKind.SHORT -> BPFType.BPFIntType.INT16;
                        case TypeKind.BYTE -> BPFType.BPFIntType.INT8;
                        case TypeKind.VOID -> BPFType.VOID;
                        default -> throw new IllegalStateException("Unexpected primitive type kind: " + String.valueOf((Object)primitiveTypeTree.getPrimitiveTypeKind()));
                    };
                    BPFType<Object> bpfType = v4;
                    typeExpression = bpfType.toCUse();
                } else {
                    Element element = this.compilerPlugin.trees.getElement(this.methodPath.path(typeTree));
                    if (element != null) {
                        Type.ClassType classType;
                        TypeMirror type = element.asType();
                        if (type.toString().equals("java.lang.Object")) {
                            yield expr;
                        }
                        if (typeCastTree instanceof JCTree.JCTypeCast) {
                            JCTree.JCTypeCast cast = (JCTree.JCTypeCast)typeCastTree;
                            if (cast.pos == cast.expr.pos) {
                                yield expr;
                            }
                        }
                        if (type.toString().equals(Ptr.class.getName())) {
                            this.logError((Tree)expression, "Unsupported type cast to " + String.valueOf(type) + " use 'Ptr::cast' instead: " + String.valueOf(typeCastTree));
                            yield null;
                        }
                        if (type instanceof Type.ClassType && (classType = (Type.ClassType)type).asElement().getQualifiedName().toString().equals(Ptr.class.getName())) {
                            this.logError((Tree)expression, "Unsupported type cast to " + String.valueOf(type) + " use 'Ptr.<Type>cast(...)' instead: " + String.valueOf(typeCastTree));
                            yield null;
                        }
                    }
                    Element typeCastTreeElement = this.compilerPlugin.trees.getElement(this.methodPath.path((Tree)typeCastTree));
                    if (typeTree instanceof JCTree.JCAnnotatedType) {
                        JCTree.JCAnnotatedType annType = (JCTree.JCAnnotatedType)typeTree;
                        typeExpression = this.translateTypeForClassTypeArguments(this.compilerPlugin.trees.getElement(this.methodPath.path()), annType.type);
                    } else {
                        if (element == null) {
                            this.logError((Tree)typeCastTree, "Unsupported type cast: " + String.valueOf(typeCastTreeElement));
                            yield null;
                        }
                        typeExpression = this.translateType(typeCastTreeElement, element.asType());
                    }
                }
                if (typeExpression != null && expr != null) {
                    yield new CAST.OperatorExpression(CAST.Operator.CAST, typeExpression, expr);
                }
                yield null;
            }
            case 11 -> {
                NewClassTree newClassTree = (NewClassTree)expressionTree2;
                if (newClassTree.getClassBody() != null) {
                    this.logError((Tree)expression, "Unsupported class body: " + String.valueOf(newClassTree.getClassBody()));
                    yield null;
                }
                Element typeElement = this.compilerPlugin.trees.getElement(this.methodPath.path((Tree)newClassTree.getIdentifier()));
                if (typeElement == null) {
                    this.logError((Tree)expression, "Unsupported class type: " + String.valueOf(newClassTree.getIdentifier()));
                    yield null;
                }
                TypeProcessor.DataTypeKind typeKind = this.typeKind(typeElement);
                CustomType customTypeAnnotation = typeElement.getAnnotation(CustomType.class);
                if (typeKind == TypeProcessor.DataTypeKind.NONE && customTypeAnnotation != null) {
                    String template = customTypeAnnotation.constructorTemplate();
                    MethodTemplate methodTemplate = MethodTemplate.parse(customTypeAnnotation.name(), template);
                    ArrayList<MethodTemplate.Argument> arguments = new ArrayList<MethodTemplate.Argument>();
                    boolean hasError = false;
                    for (int i = 0; i < newClassTree.getArguments().size(); ++i) {
                        MethodTemplate.Argument translated = this.translateArgument((ExpressionTree)newClassTree.getArguments().get(i));
                        if (translated == null) {
                            hasError = true;
                        }
                        arguments.add(translated);
                    }
                    if (hasError) {
                        yield null;
                    }
                    CAST.PrimaryExpression.VerbatimExpression res = methodTemplate.call(new MethodTemplate.CallArgs(null, arguments, List.of()));
                    if (!(res instanceof CAST.Expression)) {
                        throw new IllegalStateException("Unexpected type " + String.valueOf(res.getClass()));
                    }
                    CAST.PrimaryExpression.VerbatimExpression expr = res;
                    yield expr;
                }
                if (typeKind == TypeProcessor.DataTypeKind.ENUM || typeKind == TypeProcessor.DataTypeKind.NONE) {
                    this.logError((Tree)expression, "Unsupported constructor call: " + String.valueOf(newClassTree));
                    yield null;
                }
                CAST.Declarator type = this.translateType(typeElement, typeElement.asType());
                if (type == null) {
                    this.logError((Tree)expression, "Unsupported constructor call: " + String.valueOf(newClassTree));
                    yield null;
                }
                List args = newClassTree.getArguments();
                if (args.isEmpty()) {
                    yield CAST.OperatorExpression.cast(type, new CAST.PrimaryExpression.VerbatimExpression("{}"));
                }
                Symbol.ClassSymbol record = (Symbol.ClassSymbol)typeElement;
                List fieldNames = record.getEnclosedElements().stream().filter(e -> e.getKind() == ElementKind.FIELD).map(e -> (VariableElement)e).map(VariableElement::getSimpleName).toList();
                if (args.size() != fieldNames.size()) {
                    this.logError((Tree)expression, "Constructor arguments mismatch: " + args.size() + " vs " + fieldNames.size());
                    yield null;
                }
                ArrayList<CAST.InitDeclarator> fieldValues = new ArrayList<CAST.InitDeclarator>();
                boolean hadError = false;
                for (int i = 0; i < args.size(); ++i) {
                    ExpressionTree arg = (ExpressionTree)args.get(i);
                    CAST.Expression value = this.translate(arg);
                    if (value == null) {
                        hadError = true;
                    }
                    fieldValues.add(new CAST.InitDeclarator(CAST.Expression.variable(((Name)fieldNames.get(i)).toString()), value));
                }
                if (hadError) {
                    yield null;
                }
                if (typeKind == TypeProcessor.DataTypeKind.TYPEDEF) {
                    yield ((CAST.InitDeclarator)fieldValues.getFirst()).expression();
                }
                yield new CAST.OperatorExpression(CAST.Operator.CAST, type, new CAST.Initializer.InitializerList(fieldValues));
            }
            case 12 -> {
                CAST.Operator operator;
                CompoundAssignmentTree compoundAssignmentTree = (CompoundAssignmentTree)expressionTree2;
                CAST.Expression left = this.translate(compoundAssignmentTree.getVariable());
                CAST.Expression right = this.translate(compoundAssignmentTree.getExpression());
                switch (compoundAssignmentTree.getKind()) {
                    case PLUS_ASSIGNMENT: {
                        CAST.Operator v5 = CAST.Operator.ADDITION_ASSIGNMENT;
                        break;
                    }
                    case MINUS_ASSIGNMENT: {
                        CAST.Operator v5 = CAST.Operator.SUBTRACTION_ASSIGNMENT;
                        break;
                    }
                    case MULTIPLY_ASSIGNMENT: {
                        CAST.Operator v5 = CAST.Operator.MULTIPLICATION_ASSIGNMENT;
                        break;
                    }
                    case DIVIDE_ASSIGNMENT: {
                        CAST.Operator v5 = CAST.Operator.DIVISION_ASSIGNMENT;
                        break;
                    }
                    case REMAINDER_ASSIGNMENT: {
                        CAST.Operator v5 = CAST.Operator.MODULUS_ASSIGNMENT;
                        break;
                    }
                    case AND_ASSIGNMENT: {
                        CAST.Operator v5 = CAST.Operator.BITWISE_AND_ASSIGNMENT;
                        break;
                    }
                    case OR_ASSIGNMENT: {
                        CAST.Operator v5 = CAST.Operator.BITWISE_OR_ASSIGNMENT;
                        break;
                    }
                    case XOR_ASSIGNMENT: {
                        CAST.Operator v5 = CAST.Operator.BITWISE_XOR_ASSIGNMENT;
                        break;
                    }
                    case LEFT_SHIFT_ASSIGNMENT: {
                        CAST.Operator v5 = CAST.Operator.SHIFT_LEFT_ASSIGNMENT;
                        break;
                    }
                    case RIGHT_SHIFT_ASSIGNMENT: {
                        CAST.Operator v5 = CAST.Operator.SHIFT_RIGHT_ASSIGNMENT;
                        break;
                    }
                    default: {
                        this.logError((Tree)expression, "Unsupported binary operator " + String.valueOf(compoundAssignmentTree.getKind()) + ": " + String.valueOf(expression));
                        CAST.Operator v5 = operator = null;
                    }
                }
                if (left != null && right != null) {
                    yield new CAST.OperatorExpression(operator, left, right);
                }
                yield null;
            }
            case 13 -> {
                LambdaExpressionTree lambda = (LambdaExpressionTree)expressionTree2;
                this.logError((Tree)expression, "Lambdas are only supported in calls to built-in functions: " + String.valueOf(expression));
                yield null;
            }
            default -> {
                this.logError((Tree)expression, "Unsupported expression kind in translator " + String.valueOf(expression.getKind()) + ": " + String.valueOf(expression));
                yield null;
            }
        };
    }

    @Nullable
    CAST.Expression translate(MethodInvocationTree methodInvocationTree) {
        Symbol.MethodSymbol symbol;
        ExpressionTree calledMethod = methodInvocationTree.getMethodSelect();
        JCTree.JCMethodInvocation methodTree = (JCTree.JCMethodInvocation)methodInvocationTree;
        CAST.Expression thisExpression = null;
        JCTree.JCExpression thisJavacExpression = null;
        JCTree.JCExpression jCExpression = methodTree.meth;
        Objects.requireNonNull(jCExpression);
        JCTree.JCExpression jCExpression2 = jCExpression;
        int n = 0;
        switch (SwitchBootstraps.typeSwitch("typeSwitch", new Object[]{JCTree.JCFieldAccess.class, JCTree.JCIdent.class}, (Object)jCExpression2, (int)n)) {
            case 0: {
                CAST.OperatorExpression opExpr;
                JCTree.JCFieldAccess access2 = (JCTree.JCFieldAccess)jCExpression2;
                symbol = (Symbol.MethodSymbol)access2.sym;
                if (symbol.isStatic()) break;
                thisExpression = this.translate((ExpressionTree)access2.selected);
                thisJavacExpression = access2.selected;
                if (!this.compilerPlugin.methodTemplateCache.isAutoUnboxing(symbol) || !(thisExpression instanceof CAST.OperatorExpression) || (opExpr = (CAST.OperatorExpression)thisExpression).operator() != CAST.Operator.CAST) break;
                return opExpr.expressions()[1];
            }
            case 1: {
                JCTree.JCIdent ident2 = (JCTree.JCIdent)jCExpression2;
                symbol = (Symbol.MethodSymbol)ident2.sym;
                break;
            }
            default: {
                this.logError((Tree)calledMethod, "Unsupported method invocation: " + String.valueOf(methodInvocationTree));
                return null;
            }
        }
        ArrayList<Object> arguments = new ArrayList<Object>();
        boolean hasError = false;
        for (int i = 0; i < methodTree.getArguments().size(); ++i) {
            JCTree.JCExpression argument = (JCTree.JCExpression)methodTree.getArguments().get(i);
            if (symbol.isVarArgs() && i >= symbol.getParameters().size() - 1) {
                if (argument instanceof JCTree.JCNewArray) {
                    JCTree.JCNewArray newArray = (JCTree.JCNewArray)argument;
                    for (JCTree.JCExpression elem : newArray.elems) {
                        MethodTemplate.Argument translated = this.translateArgumentWithoutLambda((ExpressionTree)elem);
                        if (translated == null) {
                            hasError = true;
                        }
                        arguments.add(translated);
                    }
                    continue;
                }
                MethodTemplate.Argument translated = this.translateArgument((ExpressionTree)argument);
                if (translated == null) {
                    hasError = true;
                }
                arguments.add(translated);
                continue;
            }
            MethodTemplate.Argument translated = this.translateArgument((ExpressionTree)argument);
            if (translated == null) {
                hasError = true;
            }
            arguments.add(translated);
        }
        ArrayList<CAST.Declarator> declarators = new ArrayList<CAST.Declarator>();
        ArrayList<CAST.Declarator> typeDeclarators = new ArrayList<CAST.Declarator>();
        for (JCTree.JCExpression templateArg : methodTree.getTypeArguments()) {
            CAST.Declarator type2 = this.translateType(this.compilerPlugin.trees.getElement(this.methodPath.path((Tree)templateArg)), this.compilerPlugin.trees.getTypeMirror(this.methodPath.path((Tree)templateArg)));
            if (type2 == null) {
                this.logError((Tree)templateArg, "Unsupported argument type: " + String.valueOf(this.compilerPlugin.trees.getTypeMirror(this.methodPath.path((Tree)templateArg))));
                hasError = true;
            }
            declarators.add(type2);
        }
        if (thisJavacExpression instanceof JCTree.JCIdent) {
            JCTree.JCIdent methodIdent = (JCTree.JCIdent)thisJavacExpression;
            for (Type templateArg : methodIdent.sym.type.getTypeArguments()) {
                if (templateArg.asElement() instanceof Symbol.TypeVariableSymbol) {
                    typeDeclarators.add(null);
                    continue;
                }
                CAST.Declarator type3 = this.translateTypeForClassTypeArguments((Element)templateArg.asElement(), templateArg);
                typeDeclarators.add(type3);
            }
        }
        if (hasError) {
            return null;
        }
        try {
            CAST.PrimaryExpression.VerbatimExpression res = this.compilerPlugin.methodTemplateCache.render(this.methodPath, (Tree)methodInvocationTree, symbol, new MethodTemplate.CallArgs(thisExpression, arguments, declarators, typeDeclarators));
            return new CAST.PrimaryExpression.VerbatimExpression(res.code().endsWith(";") ? res.code().substring(0, res.code().length() - 1) : res.code());
        } catch (MethodTemplateCache.TemplateRenderException e) {
            this.logError((Tree)calledMethod, e.getMessage());
            return null;
        }
    }

    @Nullable
    MethodTemplate.Argument translateArgumentWithoutLambda(ExpressionTree argument) {
        CAST.Expression arg2 = this.translate(argument);
        if (arg2 == null) {
            return null;
        }
        return new MethodTemplate.Argument.Value(arg2);
    }

    @Nullable
    MethodTemplate.Argument translateArgument(ExpressionTree argument) {
        if (argument instanceof LambdaExpressionTree) {
            CAST.Statement.CompoundStatement body;
            LambdaExpressionTree lambda = (LambdaExpressionTree)argument;
            List<CAST.Declarator.FunctionParameter> params = this.translateFunctionParameters(lambda.getParameters());
            if (params == null) {
                return null;
            }
            Tree tree = lambda.getBody();
            Objects.requireNonNull(tree);
            Tree tree2 = tree;
            int n = 0;
            switch (SwitchBootstraps.typeSwitch("typeSwitch", new Object[]{BlockTree.class, ExpressionTree.class}, (Object)tree2, (int)n)) {
                case 0: {
                    BlockTree block = (BlockTree)tree2;
                    CAST.Statement.CompoundStatement compoundStatement = this.translate(block);
                    break;
                }
                case 1: {
                    CAST.Statement.CompoundStatement compoundStatement;
                    ExpressionTree exprTree = (ExpressionTree)tree2;
                    CAST.Expression expr = this.translate(exprTree);
                    if (expr == null) {
                        compoundStatement = null;
                        break;
                    }
                    compoundStatement = new CAST.Statement.CompoundStatement(List.of((Object)new CAST.Statement.ExpressionStatement(expr)));
                    break;
                }
                default: {
                    this.logError((Tree)lambda, "Unsupported lambda body: " + String.valueOf(lambda.getBody()));
                    CAST.Statement.CompoundStatement compoundStatement = body = null;
                }
            }
            if (body == null) {
                return null;
            }
            return new MethodTemplate.Argument.Lambda(params, body);
        }
        return this.translateArgumentWithoutLambda(argument);
    }

    @Nullable
    CAST.Expression translate(LiteralTree literalTree) {
        try {
            if (literalTree.getValue() == null) {
                return new CAST.PrimaryExpression.VerbatimExpression("NULL");
            }
            return CAST.Expression.constant(literalTree.getValue());
        } catch (IllegalArgumentException e) {
            this.logError((Tree)literalTree, "Unsupported literal value " + String.valueOf(literalTree.getValue()));
            return null;
        }
    }

    @Nullable
    CAST.Declarator translateType(Element element, TypeMirror type2) {
        return this.translateType(element, type2, List.of());
    }

    @Nullable
    CAST.Declarator translateType(Element element, TypeMirror type2, List<Integer> sizes) {
        TypeProcessor.CustomTypeInfo customTypeInfo;
        TypeProcessor typeProcessor = new TypeProcessor(this.compilerPlugin.createProcessingEnvironment(), true);
        AnnotationUtils.AnnotationValues anns = AnnotationUtils.getAnnotationValuesForRecordMember(type2);
        if (anns.size().isEmpty()) {
            anns = anns.addSizes(sizes);
        } else if (!sizes.isEmpty() && !anns.size().equals(sizes)) {
            this.compilerPlugin.createProcessingEnvironment().getMessager().printError("Size annotation mismatch: " + String.valueOf(anns.size()) + " vs " + String.valueOf(sizes), element);
            return null;
        }
        TypeElement typeElement = (TypeElement)this.compilerPlugin.task.getTypes().asElement(type2);
        if (typeElement != null && (customTypeInfo = typeProcessor.getCustomTypeInfo(typeElement)) != null) {
            CAST.PrimaryExpression.Variable name = CAST.Expression.variable(customTypeInfo.bpfName().name());
            if (customTypeInfo.isStruct()) {
                return new CAST.Declarator.StructIdentifierDeclarator(name);
            }
            return new CAST.Declarator.IdentifierDeclarator(name);
        }
        Optional<TypeProcessor.BPFTypeMirror> t = typeProcessor.processBPFTypeRecordMemberTypeWithBox(element, anns, type2);
        return t.map(m -> m.toBPFType(j -> new BPFTypeLike.VerbatimBPFOnlyType(j.name(), BPFTypeLike.VerbatimBPFOnlyType.PrefixKind.NORMAL)).toCustomType().toCUse()).orElse(null);
    }

    @Nullable
    CAST.Declarator translateTypeForClassTypeArguments(Element element, Type type2) {
        TypeElement typeElement;
        TypeProcessor.CustomTypeInfo customTypeInfo;
        TypeProcessor typeProcessor = new TypeProcessor(this.compilerPlugin.createProcessingEnvironment(), true);
        AnnotationUtils.AnnotationValues anns = AnnotationUtils.getAnnotationValuesForRecordMember((AnnotatedConstruct)type2);
        Element typeElementOrIdent = this.compilerPlugin.task.getTypes().asElement((TypeMirror)type2);
        if (typeElementOrIdent instanceof TypeElement && (customTypeInfo = typeProcessor.getCustomTypeInfo(typeElement = (TypeElement)typeElementOrIdent)) != null) {
            CAST.PrimaryExpression.Variable name = CAST.Expression.variable(customTypeInfo.bpfName().name());
            if (customTypeInfo.isStruct()) {
                return new CAST.Declarator.StructIdentifierDeclarator(name);
            }
            return new CAST.Declarator.IdentifierDeclarator(name);
        }
        Optional<TypeProcessor.BPFTypeMirror> t = typeProcessor.processBPFTypeRecordMemberTypeWithBox(element, anns, (TypeMirror)type2);
        return t.map(m -> m.toBPFType(j -> new BPFTypeLike.VerbatimBPFOnlyType(j.name(), BPFTypeLike.VerbatimBPFOnlyType.PrefixKind.NORMAL)).toCustomType().toCUse()).orElse(null);
    }

    TypeProcessor.DataTypeKind typeKind(Element element) {
        TypeProcessor typeProcessor = new TypeProcessor(this.compilerPlugin.createProcessingEnvironment(), true);
        TypeProcessor.CustomTypeInfo customTypeInfo = typeProcessor.getCustomTypeInfo((TypeElement)element);
        if (customTypeInfo != null) {
            CAST.PrimaryExpression.Variable name = CAST.Expression.variable(customTypeInfo.bpfName().name());
            if (customTypeInfo.isStruct()) {
                return TypeProcessor.DataTypeKind.STRUCT;
            }
            return TypeProcessor.DataTypeKind.NONE;
        }
        return typeProcessor.isValidDataType(element, false);
    }

    @Nullable
    ExpressionAndPossibleSizes translate(TypeMirror type2, NewArrayTree newArrayTree) {
        CAST.Expression translation;
        assert (newArrayTree instanceof JCTree.JCNewArray);
        JCTree.JCNewArray array = (JCTree.JCNewArray)newArrayTree;
        ArrayList<Integer> sizes = new ArrayList<Integer>();
        if (array.dims != null) {
            boolean hadError = false;
            for (JCTree.JCExpression dim2 : array.dims) {
                translation = this.translate((ExpressionTree)dim2);
                if (translation instanceof CAST.PrimaryExpression.Constant.IntegerConstant) {
                    CAST.PrimaryExpression.Constant.IntegerConstant constant = (CAST.PrimaryExpression.Constant.IntegerConstant)translation;
                    sizes.add(constant.value());
                    continue;
                }
                this.logError((Tree)dim2, "Array sizes have to be integer constants, not " + String.valueOf(dim2));
                hadError = true;
            }
            if (hadError) {
                return null;
            }
        }
        if (array.elems == null) {
            return new ExpressionAndPossibleSizes(null, sizes);
        }
        if (array.dims != null && array.dims.size() > 1) {
            this.logError((Tree)newArrayTree, "Only the last dimension can be initialized");
            return null;
        }
        ArrayList<CAST.Expression> elements = new ArrayList<CAST.Expression>();
        for (JCTree.JCExpression elem : array.elems) {
            translation = this.translate((ExpressionTree)elem);
            if (translation == null) {
                return null;
            }
            elements.add(translation);
        }
        if (sizes.size() == 1 && ((Integer)sizes.getFirst()).intValue() != elements.size()) {
            this.logError((Tree)newArrayTree, "Array size mismatch: " + String.valueOf(sizes.getFirst()) + " vs " + elements.size());
            return null;
        }
        return new ExpressionAndPossibleSizes(new CAST.Initializer.InitializerList(elements.stream().map(e -> new CAST.InitDeclarator(null, (CAST.Expression)e)).toList()), List.of((Object)elements.size()));
    }

    record ExpressionAndPossibleSizes(CAST.Expression expression, List<Integer> sizes) {
    }
}

