/*
 * Decompiled with CFR 0.153-SNAPSHOT (d6f6758-dirty).
 * 
 * Could not load the following classes:
 *  com.sun.source.tree.ClassTree
 *  com.sun.source.tree.CompilationUnitTree
 *  com.sun.source.tree.ExpressionTree
 *  com.sun.source.tree.LambdaExpressionTree
 *  com.sun.source.tree.LiteralTree
 *  com.sun.source.tree.MethodInvocationTree
 *  com.sun.source.tree.MethodTree
 *  com.sun.source.tree.ModifiersTree
 *  com.sun.source.tree.ThrowTree
 *  com.sun.source.tree.Tree
 *  com.sun.source.tree.TreeVisitor
 *  com.sun.source.tree.VariableTree
 *  com.sun.source.util.JavacTask
 *  com.sun.source.util.Plugin
 *  com.sun.source.util.TaskEvent
 *  com.sun.source.util.TaskEvent$Kind
 *  com.sun.source.util.TaskListener
 *  com.sun.source.util.TreePath
 *  com.sun.source.util.TreeScanner
 *  com.sun.source.util.Trees
 *  com.sun.tools.javac.api.BasicJavacTask
 *  com.sun.tools.javac.api.JavacTaskImpl
 *  com.sun.tools.javac.code.Attribute$Compound
 *  com.sun.tools.javac.code.Attribute$Constant
 *  com.sun.tools.javac.code.Symbol
 *  com.sun.tools.javac.code.Symbol$ClassSymbol
 *  com.sun.tools.javac.code.Symbol$MethodSymbol
 *  com.sun.tools.javac.code.Symbol$TypeSymbol
 *  com.sun.tools.javac.code.SymbolMetadata
 *  com.sun.tools.javac.code.Type
 *  com.sun.tools.javac.code.Type$ClassType
 *  com.sun.tools.javac.code.Type$MethodType
 *  com.sun.tools.javac.code.TypeTag
 *  com.sun.tools.javac.code.Types
 *  com.sun.tools.javac.processing.JavacProcessingEnvironment
 *  com.sun.tools.javac.tree.JCTree$JCExpression
 *  com.sun.tools.javac.tree.JCTree$JCFieldAccess
 *  com.sun.tools.javac.tree.JCTree$JCIdent
 *  com.sun.tools.javac.tree.JCTree$JCLiteral
 *  com.sun.tools.javac.tree.JCTree$JCMethodDecl
 *  com.sun.tools.javac.tree.JCTree$JCMethodInvocation
 *  com.sun.tools.javac.tree.JCTree$JCReturn
 *  com.sun.tools.javac.tree.JCTree$JCStatement
 *  com.sun.tools.javac.tree.JCTree$JCVariableDecl
 *  com.sun.tools.javac.tree.JCTree$Visitor
 *  com.sun.tools.javac.tree.TreeMaker
 *  com.sun.tools.javac.tree.TreeTranslator
 *  com.sun.tools.javac.util.Context
 *  com.sun.tools.javac.util.List
 *  com.sun.tools.javac.util.Log
 *  com.sun.tools.javac.util.Name
 *  com.sun.tools.javac.util.Names
 *  com.sun.tools.javac.util.Pair
 *  java.lang.runtime.SwitchBootstraps
 */
package me.bechberger.ebpf.bpf.compiler;

import com.sun.source.tree.ClassTree;
import com.sun.source.tree.CompilationUnitTree;
import com.sun.source.tree.ExpressionTree;
import com.sun.source.tree.LambdaExpressionTree;
import com.sun.source.tree.LiteralTree;
import com.sun.source.tree.MethodInvocationTree;
import com.sun.source.tree.MethodTree;
import com.sun.source.tree.ModifiersTree;
import com.sun.source.tree.ThrowTree;
import com.sun.source.tree.Tree;
import com.sun.source.tree.TreeVisitor;
import com.sun.source.tree.VariableTree;
import com.sun.source.util.JavacTask;
import com.sun.source.util.Plugin;
import com.sun.source.util.TaskEvent;
import com.sun.source.util.TaskListener;
import com.sun.source.util.TreePath;
import com.sun.source.util.TreeScanner;
import com.sun.source.util.Trees;
import com.sun.tools.javac.api.BasicJavacTask;
import com.sun.tools.javac.api.JavacTaskImpl;
import com.sun.tools.javac.code.Attribute;
import com.sun.tools.javac.code.Symbol;
import com.sun.tools.javac.code.SymbolMetadata;
import com.sun.tools.javac.code.Type;
import com.sun.tools.javac.code.TypeTag;
import com.sun.tools.javac.processing.JavacProcessingEnvironment;
import com.sun.tools.javac.tree.JCTree;
import com.sun.tools.javac.tree.TreeMaker;
import com.sun.tools.javac.tree.TreeTranslator;
import com.sun.tools.javac.util.Context;
import com.sun.tools.javac.util.List;
import com.sun.tools.javac.util.Log;
import com.sun.tools.javac.util.Name;
import com.sun.tools.javac.util.Names;
import com.sun.tools.javac.util.Pair;
import java.io.IOException;
import java.lang.annotation.Annotation;
import java.lang.reflect.Field;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.lang.runtime.SwitchBootstraps;
import java.nio.file.Files;
import java.nio.file.OpenOption;
import java.nio.file.Path;
import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Objects;
import java.util.Set;
import java.util.function.BiFunction;
import java.util.function.Consumer;
import java.util.function.Predicate;
import java.util.stream.Collectors;
import java.util.stream.Stream;
import javax.annotation.processing.ProcessingEnvironment;
import javax.lang.model.element.Element;
import javax.lang.model.element.Modifier;
import javax.lang.model.element.TypeElement;
import javax.lang.model.type.DeclaredType;
import javax.lang.model.type.TypeMirror;
import javax.lang.model.util.Types;
import javax.tools.Diagnostic;
import javax.tools.JavaCompiler;
import javax.tools.JavaFileManager;
import javax.tools.StandardLocation;
import me.bechberger.cast.CAST;
import me.bechberger.ebpf.annotations.bpf.BPF;
import me.bechberger.ebpf.annotations.bpf.BPFFunction;
import me.bechberger.ebpf.annotations.bpf.BPFImpl;
import me.bechberger.ebpf.annotations.bpf.BPFInterface;
import me.bechberger.ebpf.annotations.bpf.InternalBody;
import me.bechberger.ebpf.annotations.bpf.InternalMethodDefinition;
import me.bechberger.ebpf.annotations.bpf.Properties;
import me.bechberger.ebpf.annotations.bpf.Property;
import me.bechberger.ebpf.annotations.bpf.PropertyDefinition;
import me.bechberger.ebpf.annotations.bpf.PropertyDefinitions;
import me.bechberger.ebpf.annotations.bpf.Requires;
import me.bechberger.ebpf.bpf.compiler.MethodTemplateCache;
import me.bechberger.ebpf.bpf.compiler.NullHelpers;
import me.bechberger.ebpf.bpf.compiler.Translator;
import me.bechberger.ebpf.bpf.processor.Processor;
import me.bechberger.ebpf.bpf.processor.TypeProcessor;
import me.bechberger.ebpf.shared.KernelFeatures;
import me.bechberger.ebpf.shared.Util;
import me.bechberger.ebpf.type.TypeUtils;
import org.jetbrains.annotations.Nullable;

public class CompilerPlugin
implements Plugin {
    Log logger;
    JavacTask task;
    TypeUtils typeUtils;
    Trees trees;
    TreeMaker treeMaker;
    Names names;
    MethodTemplateCache methodTemplateCache;
    com.sun.tools.javac.code.Types types;
    private final Map<Type.MethodType, FuncDeclStatementResult> methodElementToCode = new HashMap<Type.MethodType, FuncDeclStatementResult>();
    private final Map<Type.ClassType, Integer> classToMethodCountToImplement = new HashMap<Type.ClassType, Integer>();

    public String getName() {
        return "BPFCompilerPlugin";
    }

    private boolean hasAnnotation(TreePath path2, ModifiersTree modifiersTree, Class<?> annotation) {
        return modifiersTree.getAnnotations().stream().anyMatch(a -> this.isSameType(path2, a.getAnnotationType(), annotation));
    }

    private java.util.List<TypedTreePath<MethodTree>> getBPFFunctionsForClass(CompilationUnitTree tree) {
        return (java.util.List)Objects.requireNonNullElse((Object)((java.util.List)tree.accept((TreeVisitor)new PathCollectingScanner<MethodTree>(tree){

            @Override
            public java.util.List<TypedTreePath<MethodTree>> visitClass(ClassTree node2, Object o) {
                return super.visitClass(node2, o);
            }

            public java.util.List<TypedTreePath<MethodTree>> visitMethod(MethodTree node2, Object o) {
                return this.visitWrapped(node2, (path2, methodTree) -> {
                    if (CompilerPlugin.this.shouldProcessMethod(new TypedTreePath<MethodTree>((TreePath)path2))) {
                        CompilerPlugin.this.classToMethodCountToImplement.merge((Type.ClassType)CompilerPlugin.this.trees.getTypeMirror(path2.getParentPath()), 1, Integer::sum);
                        ArrayList usedMethods = new ArrayList();
                        usedMethods.add(new TypedTreePath((TreePath)path2));
                        super.visitMethod(methodTree, o);
                        return usedMethods;
                    }
                    return Collections.emptyList();
                });
            }

            public java.util.List<TypedTreePath<MethodTree>> visitMethodInvocation(MethodInvocationTree node2, Object p) {
                Symbol sym;
                ExpressionTree calledMethod = node2.getMethodSelect();
                JCTree.JCMethodInvocation methodTree = (JCTree.JCMethodInvocation)node2;
                JCTree.JCExpression jCExpression = methodTree.meth;
                Objects.requireNonNull(jCExpression);
                JCTree.JCExpression jCExpression2 = jCExpression;
                int n = 0;
                switch (SwitchBootstraps.typeSwitch("typeSwitch", new Object[]{JCTree.JCFieldAccess.class, JCTree.JCIdent.class}, (Object)jCExpression2, (int)n)) {
                    case 0: {
                        JCTree.JCFieldAccess access2 = (JCTree.JCFieldAccess)jCExpression2;
                        Symbol symbol = access2.sym;
                        break;
                    }
                    case 1: {
                        JCTree.JCIdent ident2 = (JCTree.JCIdent)jCExpression2;
                        Symbol symbol = ident2.sym;
                        break;
                    }
                    default: {
                        Symbol symbol = sym = null;
                    }
                }
                if (!(sym instanceof Symbol.MethodSymbol)) {
                    return java.util.List.of();
                }
                Symbol.MethodSymbol symbol = (Symbol.MethodSymbol)sym;
                if (symbol == null || symbol.getAnnotation(BPFFunction.class) != null) {
                    // empty if block
                }
                return java.util.List.of();
            }
        }, null)), Collections.emptyList());
    }

    private java.util.List<TypedTreePath<ClassTree>> getBPFPrograms(CompilationUnitTree compilationUnitTree) {
        return (java.util.List)Objects.requireNonNullElse((Object)((java.util.List)compilationUnitTree.accept((TreeVisitor)new PathCollectingScanner<ClassTree>(compilationUnitTree){

            @Override
            public java.util.List<TypedTreePath<ClassTree>> visitClass(ClassTree node2, Object ignored) {
                return this.visitWrapped(node2, (path2, classTree) -> {
                    Object result = super.visitClass((ClassTree)classTree, ignored);
                    if (CompilerPlugin.this.hasAnnotation((TreePath)path2, classTree.getModifiers(), BPF.class)) {
                        return this.reduce(java.util.List.of(new TypedTreePath((TreePath)path2)), result);
                    }
                    return result;
                });
            }
        }, null)), Collections.emptyList());
    }

    private java.util.List<TypedTreePath<ClassTree>> getBPFProgramImpls(CompilationUnitTree compilationUnitTree) {
        return (java.util.List)Objects.requireNonNullElse((Object)((java.util.List)compilationUnitTree.accept((TreeVisitor)new PathCollectingScanner<ClassTree>(compilationUnitTree){

            @Override
            public java.util.List<TypedTreePath<ClassTree>> visitClass(ClassTree node2, Object ignored) {
                return this.visitWrapped(node2, (path2, classTree) -> {
                    Object result = super.visitClass((ClassTree)classTree, ignored);
                    if (CompilerPlugin.this.hasAnnotation((TreePath)path2, classTree.getModifiers(), BPFImpl.class)) {
                        return this.reduce(java.util.List.of(new TypedTreePath((TreePath)path2)), result);
                    }
                    return result;
                });
            }
        }, null)), Collections.emptyList());
    }

    private java.util.List<TypedTreePath<ClassTree>> getBPFInterfaces(CompilationUnitTree compilationUnitTree) {
        return (java.util.List)Objects.requireNonNullElse((Object)((java.util.List)compilationUnitTree.accept((TreeVisitor)new PathCollectingScanner<ClassTree>(compilationUnitTree){

            @Override
            public java.util.List<TypedTreePath<ClassTree>> visitClass(ClassTree node2, Object ignored) {
                return this.visitWrapped(node2, (path2, classTree) -> {
                    Object result = super.visitClass((ClassTree)classTree, ignored);
                    if (CompilerPlugin.this.hasAnnotation((TreePath)path2, classTree.getModifiers(), BPFInterface.class)) {
                        return this.reduce(java.util.List.of(new TypedTreePath((TreePath)path2)), result);
                    }
                    return result;
                });
            }
        }, null)), Collections.emptyList());
    }

    public void init(JavacTask task2, String ... args) {
        Context context2 = ((BasicJavacTask)task2).getContext();
        this.logger = Log.instance((Context)context2);
        this.task = task2;
        this.typeUtils = new TypeUtils(task2.getTypes(), task2.getElements());
        this.trees = Trees.instance((JavaCompiler.CompilationTask)task2);
        this.treeMaker = TreeMaker.instance((Context)context2);
        this.names = Names.instance((Context)context2);
        this.methodTemplateCache = new MethodTemplateCache(this);
        this.types = com.sun.tools.javac.code.Types.instance((Context)context2);
        Types types = task2.getTypes();
        final ArrayList funcs = new ArrayList();
        task2.addTaskListener(new TaskListener(){
            final /* synthetic */ CompilerPlugin this$0;
            {
                this.this$0 = this$0;
            }

            public void finished(TaskEvent e) {
                if (e.getKind() != TaskEvent.Kind.ANALYZE) {
                    return;
                }
                e.getCompilationUnit().accept((TreeVisitor)new TreeScanner<Void, Void>(this){

                    public Void visitLambdaExpression(LambdaExpressionTree node2, Void unused) {
                        System.out.println("Found lambda: " + String.valueOf(node2));
                        System.out.println("Body: " + String.valueOf(node2.getBody()));
                        System.out.println("Parameters: " + String.valueOf(node2.getParameters()));
                        return (Void)super.visitLambdaExpression(node2, (Object)unused);
                    }
                }, null);
                funcs.addAll(this.this$0.getBPFFunctionsForClass(e.getCompilationUnit()));
                java.util.List<TypedTreePath<ClassTree>> impls = this.this$0.getBPFProgramImpls(e.getCompilationUnit());
                java.util.List<TypedTreePath<ClassTree>> interfaces = this.this$0.getBPFInterfaces(e.getCompilationUnit());
                if (impls.isEmpty() && interfaces.isEmpty() && funcs.isEmpty()) {
                    return;
                }
                funcs.forEach(this.this$0::processBPFFunction);
                this.this$0.hideEbpfImplementations(funcs);
                funcs.clear();
                interfaces.forEach(this.this$0::processBPFInterface);
                impls.forEach(this.this$0::processBPFProgramImpl);
            }
        });
    }

    private void hideEbpfImplementations(java.util.List<TypedTreePath<MethodTree>> funcs) {
        TreeTranslator functionImplementationHider = new TreeTranslator(){

            public void visitMethodDef(JCTree.JCMethodDecl tree) {
                if (tree.getReturnType().type.isPrimitiveOrVoid()) {
                    if (tree.getReturnType().type.isNumeric()) {
                        JCTree.JCReturn jcReturn = CompilerPlugin.this.treeMaker.Return((JCTree.JCExpression)CompilerPlugin.this.treeMaker.Literal((Object)0));
                    } else {
                        JCTree.JCStatement jcReturn = CompilerPlugin.this.treeMaker.Return(null).setType(null);
                    }
                } else {
                    JCTree.JCReturn jcReturn = CompilerPlugin.this.treeMaker.Return((JCTree.JCExpression)CompilerPlugin.this.treeMaker.Literal(TypeTag.BOT, null));
                }
                tree.body = CompilerPlugin.this.treeMaker.Block(0L, List.of((Object)CompilerPlugin.this.treeMaker.WhileLoop((JCTree.JCExpression)CompilerPlugin.this.treeMaker.Literal((Object)true), (JCTree.JCStatement)CompilerPlugin.this.treeMaker.Block(0L, List.nil()))));
                this.result = tree;
            }
        };
        for (TypedTreePath<MethodTree> func : funcs) {
            ((JCTree.JCMethodDecl)func.leaf()).accept((JCTree.Visitor)functionImplementationHider);
        }
    }

    private boolean onlyThrowsExceptions(MethodTree method) {
        if (method.getBody() == null) {
            return false;
        }
        if (method.getBody().getStatements().size() != 1) {
            return false;
        }
        return method.getBody().getStatements().getFirst() instanceof ThrowTree;
    }

    private boolean shouldProcessMethod(TypedTreePath<MethodTree> path2) {
        BPFFunction ann = this.getAnnotationOfMethodOrSuper((Symbol.MethodSymbol)this.trees.getElement(path2.path()), BPFFunction.class);
        return ann != null && !path2.leaf().getModifiers().getFlags().contains((Object)Modifier.ABSTRACT) && path2.leaf().getBody() != null && !this.onlyThrowsExceptions(path2.leaf());
    }

    @Nullable
    <T extends Annotation> T getAnnotationOfMethodOrSuper(Symbol.MethodSymbol method, Class<T> annotation) {
        if (method.getAnnotation(annotation) != null) {
            return (T)method.getAnnotation(annotation);
        }
        Symbol parentMethod = method.implemented((Symbol.TypeSymbol)method.getEnclosingElement(), this.types);
        if (parentMethod == null) {
            return null;
        }
        return (T)parentMethod.getAnnotation(annotation);
    }

    void logError(TypedTreePath<?> path2, Tree element, String message) {
        this.createProcessingEnvironment().getMessager().printMessage(Diagnostic.Kind.ERROR, message, this.trees.getElement(path2.path(element)));
    }

    void logWarning(TypedTreePath<?> path2, Tree element, String message) {
        this.createProcessingEnvironment().getMessager().printMessage(Diagnostic.Kind.WARNING, message, this.trees.getElement(path2.path(element)));
    }

    private boolean processBPFFunction(TypedTreePath<MethodTree> path2) {
        FuncDeclStatementResult code2;
        MethodTree function = path2.leaf();
        assert (this.shouldProcessMethod(path2));
        this.logger.printRawLines("Processing BPFFunction " + String.valueOf(function));
        Type.MethodType method = (Type.MethodType)this.trees.getElement(path2.path()).asType();
        FunctionKind kind = this.getFunctionKind(path2);
        if (kind == FunctionKind.ERROR) {
            return false;
        }
        FuncDeclStatementResult funcDeclStatementResult = code2 = kind == FunctionKind.RAW ? this.processBPFFunctionWithAssignment(path2) : this.processBPFFunctionWithCode(path2);
        if (code2 == null) {
            this.logError(path2, (Tree)function, "Error processing BPFFunction " + String.valueOf(function));
            return false;
        }
        this.methodElementToCode.put(method, code2);
        return true;
    }

    private TypeMirror getTypeMirror(TypedTreePath<?> path2, Tree typeTree) {
        return this.task.getTypeMirror((Iterable)path2.path(typeTree));
    }

    private TypeMirror getTypeMirror(TreePath path2, Tree typeTree) {
        return this.trees.getTypeMirror(new TreePath(path2, typeTree));
    }

    boolean isSameType(TypedTreePath<?> methodPath, Tree typeTree, Class<?> type2) {
        return this.isSameType(methodPath.path(), typeTree, type2);
    }

    private boolean isSameType(TreePath path2, Tree typeTree, Class<?> type2) {
        return this.task.getTypes().isSameType(this.getTypeMirror(path2, typeTree), this.typeUtils.getTypeMirror(type2));
    }

    private FunctionKind getFunctionKind(TypedTreePath<MethodTree> methodPath) {
        MethodTree function = methodPath.leaf();
        java.util.List statements = function.getBody().getStatements();
        if (statements.size() > 2 || statements.isEmpty()) {
            return FunctionKind.FUNCTION;
        }
        Object object = statements.getFirst();
        if (object instanceof JCTree.JCVariableDecl) {
            JCTree.JCVariableDecl declStatement = (JCTree.JCVariableDecl)object;
            JCTree.JCExpression jCExpression = declStatement.init;
            if (jCExpression instanceof JCTree.JCLiteral) {
                JCTree.JCLiteral literal = (JCTree.JCLiteral)jCExpression;
                if (this.isSameType(methodPath, (Tree)declStatement.getType(), String.class) && declStatement.getName().toString().toLowerCase().equals("code")) {
                    return FunctionKind.RAW;
                }
            }
        }
        return FunctionKind.FUNCTION;
    }

    @Nullable
    private FuncDeclStatementResult processBPFFunctionWithAssignment(TypedTreePath<MethodTree> function) {
        JCTree.JCVariableDecl variableDecl = (JCTree.JCVariableDecl)function.leaf().getBody().getStatements().getFirst();
        JCTree.JCLiteral literal = (JCTree.JCLiteral)variableDecl.init;
        String code2 = literal.getValue().toString();
        Translator translator = new Translator(this, function);
        CAST.Statement.FunctionDeclarationStatement decl = translator.translateIgnoringBody();
        if (decl == null) {
            return null;
        }
        ArrayList<CAST.Statement> newBody = new ArrayList<CAST.Statement>(decl.body().statements());
        newBody.addFirst(CAST.Statement.verbatim(code2));
        return new FuncDeclStatementResult(new CAST.Statement.FunctionDeclarationStatement(decl.declarator(), new CAST.Statement.CompoundStatement(newBody), decl.annotations()), Set.of(), translator.addDefinition());
    }

    @Nullable
    private FuncDeclStatementResult processBPFFunctionWithCode(TypedTreePath<MethodTree> methodPath) {
        Translator translator = new Translator(this, methodPath);
        return NullHelpers.callIfNonNull(translator.translate(), decl -> {
            Set<CAST.Statement.Define> requiredDefines = translator.getRequiredDefines();
            return new FuncDeclStatementResult((CAST.Statement.FunctionDeclarationStatement)decl, requiredDefines, translator.addDefinition());
        });
    }

    private void processBPFInterface(TypedTreePath<ClassTree> programPath) {
        ClassTree bpfInterface = programPath.leaf();
        TypeElement bpfInterfaceTypeElement = (TypeElement)this.trees.getElement(programPath.path);
        this.logger.printRawLines("Processing BPF interface " + String.valueOf(bpfInterface.getSimpleName()));
        if (bpfInterface.getExtendsClause() != null) {
            throw new IllegalStateException("BPF interface implementation must not extend another interface");
        }
        java.util.List declsWithDefines = this.task.getElements().getAllMembers(bpfInterfaceTypeElement).stream().filter(m -> m instanceof Symbol.MethodSymbol).filter(m -> ((Symbol.MethodSymbol)m).getEnclosingElement().asType().equals((Object)bpfInterfaceTypeElement.asType())).map(m -> Map.entry((Object)m.toString(), (Object)this.task.getTypes().asMemberOf((DeclaredType)bpfInterfaceTypeElement.asType(), (Element)((Symbol.MethodSymbol)m)))).filter(e -> e.getValue() instanceof Type.MethodType).map(e -> Map.entry((Object)((String)e.getKey()), (Object)((Type.MethodType)e.getValue()))).filter(e -> this.methodElementToCode.containsKey(e.getValue())).map(e -> Map.entry((Object)((String)e.getKey()), (Object)((Object)this.methodElementToCode.get(e.getValue())))).toList();
        Set<CAST.Statement.Define> defines = declsWithDefines.stream().flatMap(e -> ((FuncDeclStatementResult)((Object)((Object)e.getValue()))).requiredDefines().stream()).collect(Collectors.toSet());
        java.util.List functionHeaders = declsWithDefines.stream().map(Map.Entry::getValue).filter(d -> d.addDefine).map(d -> d.decl.declarator()).toList();
        Map<String, String> functionImplementations = declsWithDefines.stream().collect(Collectors.toMap(Map.Entry::getKey, e -> ((FuncDeclStatementResult)((Object)((Object)e.getValue()))).decl.toPrettyString()));
        TypeProcessor.TypeProcessorResult result = new TypeProcessor(this.createProcessingEnvironment()).processBPFTypeRecords(bpfInterfaceTypeElement);
        if (result == null) {
            this.logError(programPath, (Tree)bpfInterface, "Error processing BPF interface " + String.valueOf(bpfInterface.getSimpleName()));
            return;
        }
        BPFInterface bpfInterfaceAnnotation = bpfInterfaceTypeElement.getAnnotation(BPFInterface.class);
        String combinedCode = this.combineCode("", functionHeaders, java.util.List.of(), defines, result.definingStatements(), result.mapDefinitions(), result.globalVariableDefinitions(), new TypeProcessor.InterfaceAdditions(java.util.List.of(), java.util.List.of(), java.util.List.of()));
        if (combinedCode.isBlank() && functionImplementations.isEmpty()) {
            return;
        }
        Symbol.MethodSymbol beforeSymbol = (Symbol.MethodSymbol)((Type.ClassType)this.typeUtils.getTypeMirror(InternalBody.class)).asElement().getEnclosedElements().stream().filter(e -> {
            Symbol.MethodSymbol m;
            return e instanceof Symbol.MethodSymbol && (m = (Symbol.MethodSymbol)e).getSimpleName().toString().equals("value");
        }).findFirst().orElseThrow();
        SymbolMetadata meta = ((Symbol.ClassSymbol)bpfInterfaceTypeElement).getMetadata();
        try {
            Field attributesField = meta.getClass().getDeclaredField("attributes");
            attributesField.setAccessible(true);
            List attributes = (List)attributesField.get(meta);
            attributes = attributes.append((Object)new Attribute.Compound((Type)((Type.ClassType)this.typeUtils.getTypeMirror(InternalBody.class)), List.of((Object)new Pair((Object)beforeSymbol, (Object)new Attribute.Constant((Type)((Type.ClassType)this.typeUtils.getTypeMirror(String.class)), (Object)combinedCode)))));
            for (Map.Entry<String, String> entry : functionImplementations.entrySet()) {
                Symbol.MethodSymbol methodSymbol = bpfInterfaceTypeElement.getEnclosedElements().stream().filter(e -> {
                    Symbol.MethodSymbol m;
                    return e instanceof Symbol.MethodSymbol && (m = (Symbol.MethodSymbol)e).toString().equals(entry.getKey());
                }).findFirst().orElse(null);
                if (methodSymbol == null) continue;
                SymbolMetadata methodMeta = methodSymbol.getMetadata();
                Field methodAttributesField = methodMeta.getClass().getDeclaredField("attributes");
                methodAttributesField.setAccessible(true);
                List methodAttributes = (List)methodAttributesField.get(methodMeta);
                methodAttributes = methodAttributes.append((Object)new Attribute.Compound((Type)((Type.ClassType)this.typeUtils.getTypeMirror(InternalMethodDefinition.class)), List.of((Object)new Pair((Object)beforeSymbol, (Object)new Attribute.Constant((Type)((Type.ClassType)this.typeUtils.getTypeMirror(String.class)), (Object)entry.getValue())))));
                methodAttributesField.set(methodMeta, methodAttributes);
            }
            attributesField.set(meta, attributes);
        } catch (IllegalAccessException | NoSuchFieldException e2) {
            throw new RuntimeException(e2);
        }
    }

    private Set<String> getRequiredKernelFeatures(TypeElement klass) {
        HashSet<String> requirements = new HashSet<String>();
        Requires ann = klass.getAnnotation(Requires.class);
        if (ann != null) {
            requirements.addAll(KernelFeatures.getRequiredKernelFeatures(ann));
        }
        for (TypeMirror typeMirror : klass.getInterfaces()) {
            requirements.addAll(this.getRequiredKernelFeatures((TypeElement)((Type.ClassType)typeMirror).asElement()));
        }
        return requirements;
    }

    private <T extends Annotation, S extends Annotation> java.util.List<T> getAnnotationValues(TypeElement klass, Class<T> annotationClass, @Nullable Class<S> multiAnnotationClass, boolean breadthFirst) {
        ArrayList annotations = new ArrayList();
        ArrayDeque<TypeElement> toVisit = new ArrayDeque<TypeElement>(java.util.List.of((Object)klass));
        Method multiAnnMethod = null;
        if (multiAnnotationClass != null) {
            try {
                multiAnnMethod = multiAnnotationClass.getMethod("value", new Class[0]);
            } catch (NoSuchMethodException e) {
                throw new RuntimeException(e);
            }
        }
        Method multiAnnMethodFinal = multiAnnMethod;
        Consumer<TypeElement> add = iface -> {
            if (iface == null) {
                return;
            }
            Object ann = iface.getAnnotation(annotationClass);
            if (ann != null) {
                annotations.add(ann);
            }
            if (multiAnnotationClass != null) {
                try {
                    Object multiAnn = iface.getAnnotation(multiAnnotationClass);
                    if (multiAnn != null) {
                        Annotation[] values = (Annotation[])multiAnnMethodFinal.invoke(multiAnn, new Object[0]);
                        annotations.addAll(Arrays.asList(values));
                    }
                } catch (IllegalAccessException | InvocationTargetException e) {
                    throw new RuntimeException(e);
                }
            }
        };
        add.accept(klass);
        while (!toVisit.isEmpty()) {
            TypeElement s2;
            TypeElement current = (TypeElement)toVisit.poll();
            java.util.List<TypeElement> otherClasses = current.getInterfaces().stream().map(i -> (TypeElement)((Type.ClassType)i).asElement()).filter(Objects::nonNull).collect(Collectors.toList());
            if (current.getSuperclass() != null && (s2 = (TypeElement)((Type)current.getSuperclass()).asElement()) != null) {
                otherClasses.add(s2);
            }
            if (breadthFirst) {
                otherClasses.forEach(add);
                toVisit.addAll(otherClasses);
                continue;
            }
            add.accept(current);
            toVisit.addAll(otherClasses);
        }
        return annotations;
    }

    private Map<String, PropertyDefinition> getPropertyDefinitions(TypedTreePath<ClassTree> path2, TypeElement klass) {
        java.util.List<PropertyDefinition> anns = this.getAnnotationValues(klass, PropertyDefinition.class, PropertyDefinitions.class, true);
        HashMap<String, PropertyDefinition> definitions = new HashMap<String, PropertyDefinition>();
        for (PropertyDefinition ann : anns) {
            if (definitions.containsKey(ann.name())) {
                this.logError(path2, (Tree)path2.leaf(), "Multiple definitions for property " + ann.name());
            }
            definitions.put(ann.name(), ann);
        }
        return definitions;
    }

    private Map<String, String> getPropertyValues(TypedTreePath<ClassTree> path2, TypeElement klass) {
        java.util.List<Property> anns = this.getAnnotationValues(klass, Property.class, Properties.class, true);
        HashMap<String, String> values = new HashMap<String, String>();
        for (Property ann : anns) {
            if (values.containsKey(ann.name())) {
                this.logError(path2, (Tree)path2.leaf(), "Multiple values for property " + ann.name());
            }
            values.put(ann.name(), ann.value());
        }
        return values;
    }

    private Map<String, String> getAllPropertyValues(TypedTreePath<ClassTree> path2, TypeElement klass) {
        Map<String, PropertyDefinition> definitions = this.getPropertyDefinitions(path2, klass);
        Map<String, String> values = this.getPropertyValues(path2, klass);
        HashMap<String, String> properties = new HashMap<String, String>();
        for (PropertyDefinition definition : definitions.values()) {
            String name = definition.name();
            String value = definition.defaultValue();
            if (values.containsKey(name)) {
                String regexp = definitions.get(name).regexp();
                if (!values.get(name).matches(regexp)) {
                    this.logError(path2, (Tree)path2.leaf(), "Value of property " + name + " does not match regular expression " + regexp + ": " + values.get(name));
                }
                value = values.get(name);
                values.remove(name);
            }
            properties.put(name, value);
        }
        if (!values.isEmpty()) {
            this.logError(path2, (Tree)path2.leaf(), values.size() + " properties without definition found");
        }
        for (String name : values.keySet()) {
            String closest = Util.getClosestString(name, definitions.keySet());
            this.logError(path2, (Tree)path2.leaf(), "Property " + name + " is not defined, maybe you meant " + closest);
        }
        return properties;
    }

    private void processBPFProgramImpl(TypedTreePath<ClassTree> programPath) {
        BPFImpl implAnn;
        ClassTree bpfProgram = programPath.leaf();
        TypeElement bpfProgramTypeElement = (TypeElement)this.trees.getElement(programPath.path);
        this.logger.printRawLines("Processing BPF program " + String.valueOf(bpfProgram.getSimpleName()));
        if (bpfProgram.getExtendsClause() == null) {
            throw new IllegalStateException("BPF program implementation must extend a class");
        }
        TypeMirror superClassType = bpfProgramTypeElement.getSuperclass();
        if (!(superClassType instanceof DeclaredType)) {
            throw new AssertionError((Object)("Superclass must be a declared type for " + String.valueOf(bpfProgram.getSimpleName())));
        }
        DeclaredType declaredSuperClass = (DeclaredType)superClassType;
        TypeElement superClassElement = (TypeElement)declaredSuperClass.asElement();
        java.util.List<String> missingKernelFeatures = KernelFeatures.getMissingFeatures(this.getRequiredKernelFeatures(superClassElement));
        if (!missingKernelFeatures.isEmpty()) {
            this.logWarning(programPath, (Tree)bpfProgram, "Can't compile, missing kernel features in the current kernel: " + String.join((CharSequence)", ", missingKernelFeatures));
            return;
        }
        java.util.List methods = this.task.getElements().getAllMembers(superClassElement).stream().filter(m -> m instanceof Symbol.MethodSymbol && ((Symbol.MethodSymbol)m).getEnclosingElement().equals(superClassElement)).toList();
        Integer toImplement = this.classToMethodCountToImplement.getOrDefault((Type.ClassType)superClassType, 0);
        java.util.List declsWithDefines = methods.stream().map(m -> this.task.getTypes().asMemberOf((DeclaredType)superClassElement.asType(), (Element)m)).filter(m -> m instanceof Type.MethodType).map(m -> (Type.MethodType)m).map(this.methodElementToCode::get).filter(Objects::nonNull).toList();
        Set<CAST.Statement.Define> defines = declsWithDefines.stream().flatMap(r -> r.requiredDefines().stream()).collect(Collectors.toSet());
        java.util.List decls = declsWithDefines.stream().map(d -> new FuncDecl(d.decl, d.addDefine)).toList();
        if (decls.size() < toImplement) {
            this.logError(programPath, (Tree)bpfProgram, "Not all methods have been processed");
            return;
        }
        VariableTree codeField = this.getMember(bpfProgram, "CODE");
        Object code2 = (String)((LiteralTree)codeField.getInitializer()).getValue();
        java.util.List bpfInterfaceBodies = superClassElement.getInterfaces().stream().map(i -> {
            InternalBody ann = i.getAnnotation(InternalBody.class);
            if (ann == null && i instanceof Type.ClassType) {
                Type.ClassType klass = (Type.ClassType)i;
                if (klass.tsym != null) {
                    ann = (InternalBody)klass.tsym.getAnnotation(InternalBody.class);
                }
            }
            return ann;
        }).filter(Objects::nonNull).map(InternalBody::value).filter(b -> !b.isEmpty()).toList();
        Object interfaceCode = bpfInterfaceBodies.stream().collect(Collectors.joining("\n\n"));
        Map<Symbol.MethodSymbol, String> defaultCodeForMethod = this.getInterfaceMethodsWithDefaultCode((Symbol.ClassSymbol)superClassElement);
        Set methodStrings = methods.stream().map(Object::toString).collect(Collectors.toSet());
        String defaultCode = defaultCodeForMethod.entrySet().stream().filter(e -> !methodStrings.contains(((Symbol.MethodSymbol)e.getKey()).toString())).map(Map.Entry::getValue).collect(Collectors.joining("\n\n"));
        if (!defaultCode.isBlank()) {
            if (!code2.isBlank()) {
                interfaceCode = (String)interfaceCode + "\n\n";
            }
            interfaceCode = (String)interfaceCode + defaultCode;
        }
        if (!interfaceCode.isBlank()) {
            code2 = (String)interfaceCode + "\n\n" + (String)code2;
        }
        if ((implAnn = bpfProgramTypeElement.getAnnotation(BPFImpl.class)) == null) {
            this.logError(programPath, (Tree)bpfProgram, "BPF program implementation must have a BPFImpl annotation");
            return;
        }
        code2 = implAnn.before() + (String)code2;
        Map<String, String> properties = this.getAllPropertyValues(programPath, superClassElement);
        String newCode = CompilerPlugin.replaceProperties(this.combineCode((String)code2, decls, defines) + "\n\n" + implAnn.after(), properties);
        Path cFile = Path.of((String)programPath.root().getSourceFile().toUri().getPath(), (String[])new String[0]).getParent().resolve(String.valueOf(bpfProgram.getSimpleName()) + ".c");
        try {
            Files.writeString((Path)cFile, (CharSequence)newCode, (OpenOption[])new OpenOption[0]);
        } catch (IOException e2) {
            this.logError(programPath, (Tree)bpfProgram, "Could not write C code to " + String.valueOf(cFile));
        }
        Processor.CompileResult compiledCode = this.compile(newCode, cFile);
        if (compiledCode.encode().length() < 65536) {
            for (Tree member : bpfProgram.getMembers()) {
                if (!(member instanceof JCTree.JCMethodDecl)) continue;
                JCTree.JCMethodDecl methodDecl = (JCTree.JCMethodDecl)member;
                Name name = methodDecl.name;
                if (name.contentEquals((CharSequence)"getByteCodeBytesStatic")) {
                    ((JCTree.JCReturn)methodDecl.body.getStatements().getLast()).expr = this.treeMaker.Literal((Object)compiledCode.encode());
                    continue;
                }
                if (name.contentEquals((CharSequence)"getCodeStatic")) {
                    ((JCTree.JCReturn)methodDecl.body.getStatements().getLast()).expr = this.treeMaker.Literal((Object)newCode);
                    continue;
                }
                if (!name.contentEquals((CharSequence)"getByteCodeResourceName")) continue;
                ((JCTree.JCReturn)methodDecl.body.getStatements().getLast()).expr = this.treeMaker.Literal((Object)"");
            }
        } else {
            Path outPath;
            String resourceName = String.valueOf(bpfProgramTypeElement.getQualifiedName()) + ".o";
            JavaFileManager fileManager = (JavaFileManager)((JavacTaskImpl)this.task).getContext().get(JavaFileManager.class);
            try {
                outPath = Path.of((String)fileManager.getFileForOutput(StandardLocation.CLASS_OUTPUT, "", resourceName, null).toUri().getPath(), (String[])new String[0]);
            } catch (IOException e3) {
                this.logError(programPath, (Tree)bpfProgram, "No output folder found");
                return;
            }
            try {
                Files.write(outPath, compiledCode.gzip(), new OpenOption[0]);
            } catch (IOException e4) {
                this.logError(programPath, (Tree)bpfProgram, "Could not write byte code to " + String.valueOf(outPath));
            }
            for (Tree member : bpfProgram.getMembers()) {
                if (!(member instanceof JCTree.JCMethodDecl)) continue;
                JCTree.JCMethodDecl methodDecl = (JCTree.JCMethodDecl)member;
                Name name = methodDecl.name;
                if (name.contentEquals((CharSequence)"getByteCodeBytesStatic")) {
                    ((JCTree.JCReturn)methodDecl.body.getStatements().getLast()).expr = this.treeMaker.Literal((Object)"");
                    continue;
                }
                if (name.contentEquals((CharSequence)"getCodeStatic")) {
                    ((JCTree.JCReturn)methodDecl.body.getStatements().getLast()).expr = this.treeMaker.Literal((Object)newCode);
                    continue;
                }
                if (!name.contentEquals((CharSequence)"getByteCodeResourceName")) continue;
                ((JCTree.JCReturn)methodDecl.body.getStatements().getLast()).expr = this.treeMaker.Literal((Object)resourceName);
            }
        }
    }

    private Map<Symbol.MethodSymbol, String> getInterfaceMethodsWithDefaultCode(Symbol.ClassSymbol superClassElement) {
        return this.getInterfaceMethods(superClassElement).stream().map(m -> {
            InternalMethodDefinition ann = (InternalMethodDefinition)m.getAnnotation(InternalMethodDefinition.class);
            if (ann == null) {
                return null;
            }
            return Map.entry((Object)m, (Object)ann.value());
        }).filter(Objects::nonNull).collect(Collectors.toMap(Map.Entry::getKey, Map.Entry::getValue));
    }

    private java.util.List<Symbol.MethodSymbol> getInterfaceMethods(Symbol.ClassSymbol element) {
        return element.getInterfaces().stream().flatMap(i -> Stream.concat(i.asElement().getEnclosedElements().stream().filter(m -> m instanceof Symbol.MethodSymbol).map(m -> (Symbol.MethodSymbol)m), this.getInterfaceMethods((Symbol.ClassSymbol)i.asElement()).stream())).toList();
    }

    private Processor.CompileResult compile(String code2, Path file2) {
        return Processor.compileAndEncode(this.createProcessingEnvironment(), code2, file2);
    }

    VariableTree getMember(ClassTree klass, String name) {
        return klass.getMembers().stream().filter(m -> m instanceof VariableTree).map(m -> (VariableTree)m).filter(m -> m.getName().contentEquals(name)).findFirst().orElseThrow(() -> new IllegalStateException(name + " field not found in " + String.valueOf(klass.getSimpleName())));
    }

    boolean canEmitDeclaratorFor(FuncDecl decl) {
        return decl.addDefine && !decl.decl.declarator().toPrettyString().matches(".* [A-Z0-9_]+\\([a-z0-9A-Z_]+,.*\\).*");
    }

    String combineCode(String code2, java.util.List<FuncDecl> decls, Set<CAST.Statement.Define> defines) {
        return this.combineCode(code2, java.util.List.of(), decls, defines, java.util.List.of(), java.util.List.of(), java.util.List.of(), new TypeProcessor.InterfaceAdditions(java.util.List.of(), java.util.List.of(), java.util.List.of()));
    }

    String combineCode(String code2, java.util.List<CAST.Declarator.FunctionHeader> functionHeaders, java.util.List<FuncDecl> decls, Set<CAST.Statement.Define> defines, java.util.List<CAST.Statement> typeDecls, java.util.List<TypeProcessor.MapDefinition> mapDefinitions, java.util.List<TypeProcessor.GlobalVariableDefinition> globals, TypeProcessor.InterfaceAdditions additions) {
        java.util.List requiredDefines = defines.stream().filter(d -> !code2.contains(d.toPrettyString())).sorted(Comparator.comparing(CAST.Statement.Define::name)).toList();
        ArrayList<String> result = new ArrayList<String>(additions.before());
        result.add(code2);
        result.addAll(this.prettyPrint(requiredDefines));
        result.addAll(this.prettyPrint(typeDecls));
        result.addAll(this.prettyPrint(mapDefinitions.stream().map(TypeProcessor.MapDefinition::structDefinition).toList()));
        result.addAll(this.prettyPrint(globals.stream().map(TypeProcessor.GlobalVariableDefinition::globalVariable).toList()));
        result.addAll(decls.stream().filter(this::canEmitDeclaratorFor).map(d -> d.decl.declarator().toStatement().toPrettyString()).toList());
        result.addAll(this.prettyPrint(functionHeaders.stream().map(CAST::toStatement).toList()));
        result.addAll(this.prettyPrint(decls.stream().map(FuncDecl::decl).toList()));
        result.addAll(additions.after());
        return CompilerPlugin.moveIncludesToTheFront(result.stream().filter(s2 -> !s2.isEmpty()).collect(Collectors.joining("\n\n")));
    }

    private static String replaceProperties(String code2, Map<String, String> properties) {
        for (Map.Entry<String, String> entry : properties.entrySet()) {
            code2 = code2.replace("__property_" + entry.getKey(), entry.getValue());
        }
        return code2;
    }

    public static String moveIncludesToTheFront(String code2) {
        Predicate<String> isInclude = s2 -> s2.startsWith("#include ");
        java.util.List includes = code2.lines().filter(isInclude).toList();
        String rest = code2.lines().filter(isInclude.negate()).collect(Collectors.joining("\n")).strip();
        return String.join((CharSequence)"\n", includes) + "\n\n" + rest;
    }

    private java.util.List<String> prettyPrint(java.util.List<? extends CAST> statements) {
        return statements.stream().map(CAST::toPrettyString).toList();
    }

    ProcessingEnvironment createProcessingEnvironment() {
        return JavacProcessingEnvironment.instance((Context)((BasicJavacTask)this.task).getContext());
    }

    public record TypedTreePath<T extends Tree>(TreePath path) {
        T leaf() {
            return (T)this.path.getLeaf();
        }

        TreePath path(Tree subPath) {
            return TreePath.getPath((TreePath)this.path, (Tree)subPath);
        }

        CompilationUnitTree root() {
            return this.path.getCompilationUnit();
        }
    }

    static enum FunctionKind {
        FUNCTION,
        RAW,
        ERROR;

    }

    record FuncDeclStatementResult(CAST.Statement.FunctionDeclarationStatement decl, Set<CAST.Statement.Define> requiredDefines, boolean addDefine) {
    }

    record FuncDecl(CAST.Statement.FunctionDeclarationStatement decl, boolean addDefine) {
    }

    private static class PathCollectingScanner<T extends Tree>
    extends TreeScanner<java.util.List<TypedTreePath<T>>, Object> {
        private final CompilationUnitTree compilationUnitTree;
        TreePath curPath;

        public PathCollectingScanner(CompilationUnitTree compilationUnitTree) {
            this.compilationUnitTree = compilationUnitTree;
            this.curPath = null;
        }

        private TreePath createPath(@Nullable TreePath parent, Tree tree) {
            if (parent == null) {
                return TreePath.getPath((CompilationUnitTree)this.compilationUnitTree, (Tree)tree);
            }
            return new TreePath(parent, tree);
        }

        public java.util.List<TypedTreePath<T>> visitClass(ClassTree node2, Object o) {
            TreePath prevPath = this.curPath;
            this.curPath = this.createPath(this.curPath, (Tree)node2);
            java.util.List result = (java.util.List)super.visitClass(node2, o);
            this.curPath = prevPath;
            return result;
        }

        public java.util.List<TypedTreePath<T>> visitWrapped(T node2, BiFunction<TreePath, T, java.util.List<TypedTreePath<T>>> process) {
            TreePath prevPath = this.curPath;
            this.curPath = this.createPath(this.curPath, (Tree)node2);
            java.util.List<TypedTreePath<T>> result = process.apply(this.curPath, (TreePath)node2);
            this.curPath = prevPath;
            return result;
        }

        public java.util.List<TypedTreePath<T>> reduce(java.util.List<TypedTreePath<T>> r1, java.util.List<TypedTreePath<T>> r2) {
            if (r1 == null || r1.isEmpty()) {
                return r2;
            }
            if (r2 == null || r2.isEmpty()) {
                return r1;
            }
            ArrayList<TypedTreePath<T>> result = new ArrayList<TypedTreePath<T>>(r1);
            result.addAll(r2);
            return result;
        }
    }
}

