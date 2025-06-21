/*
 * Decompiled with CFR 0.153-SNAPSHOT (d6f6758-dirty).
 * 
 * Could not load the following classes:
 *  com.sun.tools.javac.code.Attribute$Constant
 *  com.sun.tools.javac.code.Symbol$TypeSymbol
 *  com.sun.tools.javac.code.Type
 *  com.sun.tools.javac.code.Type$ClassType
 *  com.sun.tools.javac.processing.JavacProcessingEnvironment
 *  com.sun.tools.javac.tree.JCTree
 *  com.sun.tools.javac.tree.JCTree$JCExpression
 *  com.sun.tools.javac.tree.JCTree$JCNewClass
 *  com.sun.tools.javac.tree.JCTree$JCTypeApply
 *  com.sun.tools.javac.tree.JCTree$JCVariableDecl
 *  com.sun.tools.javac.util.List
 *  java.lang.MatchException
 */
package me.bechberger.ebpf.bpf.processor;

import com.squareup.javapoet.FieldSpec;
import com.sun.tools.javac.code.Attribute;
import com.sun.tools.javac.code.Symbol;
import com.sun.tools.javac.code.Type;
import com.sun.tools.javac.processing.JavacProcessingEnvironment;
import com.sun.tools.javac.tree.JCTree;
import com.sun.tools.javac.util.List;
import java.lang.annotation.Annotation;
import java.lang.invoke.LambdaMetafactory;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Objects;
import java.util.Optional;
import java.util.Set;
import java.util.function.BiConsumer;
import java.util.function.Function;
import java.util.function.Predicate;
import java.util.stream.Collectors;
import java.util.stream.IntStream;
import java.util.stream.Stream;
import javax.annotation.processing.ProcessingEnvironment;
import javax.lang.model.AnnotatedConstruct;
import javax.lang.model.element.AnnotationMirror;
import javax.lang.model.element.Element;
import javax.lang.model.element.ElementKind;
import javax.lang.model.element.ExecutableElement;
import javax.lang.model.element.Modifier;
import javax.lang.model.element.TypeElement;
import javax.lang.model.element.VariableElement;
import javax.lang.model.type.ArrayType;
import javax.lang.model.type.DeclaredType;
import javax.lang.model.type.PrimitiveType;
import javax.lang.model.type.TypeKind;
import javax.lang.model.type.TypeMirror;
import me.bechberger.cast.CAST;
import me.bechberger.ebpf.NameUtil;
import me.bechberger.ebpf.annotations.Type;
import me.bechberger.ebpf.annotations.bpf.BPF;
import me.bechberger.ebpf.annotations.bpf.BPFInterface;
import me.bechberger.ebpf.bpf.processor.AnnotationUtils;
import me.bechberger.ebpf.bpf.processor.BPFTypeLike;
import me.bechberger.ebpf.bpf.processor.DefinedTypes;
import me.bechberger.ebpf.type.BPFType;
import me.bechberger.ebpf.type.Box;
import me.bechberger.ebpf.type.Enum;
import me.bechberger.ebpf.type.Ptr;
import me.bechberger.ebpf.type.Struct;
import me.bechberger.ebpf.type.TypeUtils;
import me.bechberger.ebpf.type.TypedEnum;
import me.bechberger.ebpf.type.Typedef;
import me.bechberger.ebpf.type.TypedefBase;
import me.bechberger.ebpf.type.Union;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

public class TypeProcessor {
    public static final String TYPE_ANNOTATION = "me.bechberger.ebpf.annotations.Type";
    public static final String BPF_PACKAGE = "me.bechberger.ebpf.type";
    public static final String BPF_TYPE = "me.bechberger.ebpf.type.BPFType";
    public static final String BPF_MAP_DEFINITION = "me.bechberger.ebpf.annotations.bpf.BPFMapDefinition";
    public static final String BPF_MAP_CLASS = "me.bechberger.ebpf.annotations.bpf.BPFMapClass";
    private final ProcessingEnvironment processingEnv;
    private final boolean allowUnsizedStrings;
    private final TypeUtils typeUtils;
    private final JavacProcessingEnvironment javacProcessingEnv;
    private TypeElement outerTypeElement;
    private DefinedTypes definedTypes;
    private Map<DefinedTypes.JavaName, BPFTypeLike<?>> alreadyDefinedTypes;
    private Set<DefinedTypes.JavaName> currentlyDefining;
    private java.util.List<TypeElement> processedTypes;
    private java.util.List<BPFType.CustomBPFType<?>> usedCustomBPFTypes;
    private static final Set<String> integerTypes = Set.of((Object)"int", (Object)"long", (Object)"short", (Object)"byte", (Object)"char", (Object)"boolean");
    static final Map<String, String> boxedToUnboxedIntegerType = Map.of((Object)"java.lang.Integer", (Object)"int", (Object)"java.lang.Long", (Object)"long", (Object)"java.lang.Short", (Object)"short", (Object)"java.lang.Byte", (Object)"byte", (Object)"java.lang.Character", (Object)"char", (Object)"java.lang.Float", (Object)"float", (Object)"java.lang.Double", (Object)"double", (Object)"java.lang.Boolean", (Object)"boolean");

    public TypeProcessor(ProcessingEnvironment processingEnv, boolean allowUnsizedStrings) {
        this.processingEnv = processingEnv;
        this.typeUtils = new TypeUtils(processingEnv.getTypeUtils(), processingEnv.getElementUtils());
        this.javacProcessingEnv = (JavacProcessingEnvironment)processingEnv;
        this.allowUnsizedStrings = allowUnsizedStrings;
    }

    public TypeProcessor(ProcessingEnvironment processingEnv) {
        this(processingEnv, false);
    }

    private java.util.List<TypeElement> getRequiredBPFTypeElements(TypeElement typeElement) {
        return Stream.concat(this.getInnerBPFTypeElements(typeElement).stream(), this.getBPFSpecifiedTypeElements(typeElement).stream()).toList();
    }

    private java.util.List<TypeElement> getInnerBPFTypeElements(TypeElement typeElement) {
        return typeElement.getEnclosedElements().stream().filter(this::isTypeAnnotatedRecord).map(e -> (TypeElement)e).toList();
    }

    private boolean isTypeAnnotatedRecord(Element element) {
        if (AnnotationUtils.getAnnotationMirror(element, TYPE_ANNOTATION).isPresent()) {
            return this.isValidDataType(element) != DataTypeKind.NONE;
        }
        return false;
    }

    private boolean isNotUsableInJava(TypeElement element) {
        return AnnotationUtils.hasAnnotation(element, "me.bechberger.ebpf.annotations.bpf.NotUsableInJava");
    }

    private DataTypeKind isValidDataType(Element element) {
        return this.isValidDataType(element, true);
    }

    public DataTypeKind isValidDataType(Element element, boolean log) {
        boolean implementsTypedef = this.typeUtils.implementsInterfaceIgnoringTypeParameters(element, Typedef.class);
        if (element.getKind() == ElementKind.ENUM) {
            if (implementsTypedef) {
                if (log) {
                    this.processingEnv.getMessager().printError("Class " + String.valueOf(element.getSimpleName()) + " is an enum but implements the Typedef interface", element);
                }
                return DataTypeKind.NONE;
            }
            if (!this.typeUtils.implementsInterfaceIgnoringTypeParameters(element, Enum.class)) {
                if (log) {
                    this.processingEnv.getMessager().printError("Enum " + String.valueOf(element) + " must implement the Enum interface", element);
                }
                return DataTypeKind.NONE;
            }
            return DataTypeKind.ENUM;
        }
        if (element.getKind() == ElementKind.RECORD) {
            if (((TypeElement)element).getSuperclass().getKind() != TypeKind.NONE && !((TypeElement)element).getSuperclass().toString().equals("java.lang.Record")) {
                if (log) {
                    this.processingEnv.getMessager().printError("Class " + String.valueOf(element.getSimpleName()) + " is a record but has a super class", element);
                }
                return DataTypeKind.NONE;
            }
            if (implementsTypedef) {
                return DataTypeKind.TYPEDEF;
            }
            return DataTypeKind.STRUCT;
        }
        if (element.getKind() == ElementKind.CLASS) {
            if (!element.getModifiers().contains((Object)Modifier.STATIC)) {
                if (log) {
                    this.processingEnv.getMessager().printError("Class " + String.valueOf(element.getSimpleName()) + " is a class but not static", element);
                }
                return DataTypeKind.NONE;
            }
            if (this.typeUtils.hasSuperClass(element, Union.class)) {
                if (implementsTypedef && log) {
                    this.processingEnv.getMessager().printError("Class " + String.valueOf(element) + " is a union and must not implement the Typedef interface", element);
                }
                return DataTypeKind.UNION;
            }
            if (this.typeUtils.hasSameSuperclassIgnoringTypeParameters(element, TypedefBase.class)) {
                if (implementsTypedef && log) {
                    this.processingEnv.getMessager().printError("Class " + String.valueOf(element) + " is a typedef and must not extend also TypedefBase", element);
                }
                return DataTypeKind.TYPEDEF;
            }
            if (!this.typeUtils.hasSuperClass(element, Object.class) && !this.typeUtils.hasSuperClass(element, Struct.class) && ((TypeElement)element).getSuperclass().getKind() != TypeKind.NONE && log) {
                this.processingEnv.getMessager().printError("Class " + String.valueOf(element) + " is a class but does not extend Object, Union or Struct", element);
            }
            return DataTypeKind.STRUCT;
        }
        return DataTypeKind.NONE;
    }

    private boolean isCustomTypeAnnotatedRecord(Element element) {
        return AnnotationUtils.getAnnotationMirror(element, "me.bechberger.ebpf.annotations.CustomType").isPresent();
    }

    private java.util.List<TypeElement> getBPFSpecifiedTypeElements(TypeElement typeElement) {
        Optional<? extends AnnotationMirror> annotation = AnnotationUtils.getAnnotationMirror(typeElement, "me.bechberger.ebpf.annotations.bpf.BPF");
        if (annotation.isEmpty()) {
            return java.util.List.of();
        }
        java.util.List specifiedClasses = AnnotationUtils.getAnnotationValue(annotation.get(), "includeTypes", java.util.List.of());
        return specifiedClasses.stream().map(c -> {
            String klass = c.toString().substring(0, c.toString().length() - ".class".length());
            return this.processingEnv.getElementUtils().getTypeElement(klass);
        }).toList();
    }

    boolean shouldGenerateCCode(TypeElement innerElement) {
        if (innerElement.getEnclosingElement().getKind() == ElementKind.INTERFACE && this.outerTypeElement.getKind() != ElementKind.INTERFACE) {
            return false;
        }
        return AnnotationUtils.getAnnotationMirror(innerElement, TYPE_ANNOTATION).map(a -> AnnotationUtils.getAnnotationValue(a, "noCCodeGeneration", false)).orElse(false) == false;
    }

    boolean isTypedefedType(TypeElement innerElement) {
        return AnnotationUtils.getAnnotationMirror(innerElement, TYPE_ANNOTATION).map(a -> AnnotationUtils.getAnnotationValue(a, "typedefed", false)).orElse(false);
    }

    @Nullable
    public TypeProcessorResult processBPFTypeRecords(TypeElement outerTypeElement) {
        java.util.List unprocessed;
        this.outerTypeElement = outerTypeElement;
        java.util.List<TypeElement> predefinedTypeElements = this.getRequiredBPFTypeElements(outerTypeElement);
        this.definedTypes = this.getDefinedTypes(predefinedTypeElements);
        this.alreadyDefinedTypes = new HashMap();
        this.currentlyDefining = new HashSet<DefinedTypes.JavaName>();
        this.processedTypes = new ArrayList<TypeElement>();
        this.usedCustomBPFTypes = new ArrayList();
        Function<BPFTypeLike<?>, DefinedTypes.SpecFieldName> typeToSpecField = t -> t.getSpecFieldName(this.definedTypes);
        while (!(unprocessed = predefinedTypeElements.stream().filter(e -> !this.processedTypes.contains(e)).toList()).isEmpty()) {
            Optional<? extends BPFTypeLike.TypeBackedBPFTypeLike<?>> type3 = this.processBPFTypeRecord((TypeElement)unprocessed.getFirst());
            if (type3.isEmpty()) {
                return new TypeProcessorResult(java.util.List.of(), java.util.List.of(), java.util.List.of(), null, java.util.List.of(), this.createGlobalVariableDefinitions(outerTypeElement, typeToSpecField), new InterfaceAdditions(java.util.List.of(), java.util.List.of(), java.util.List.of()));
            }
            this.alreadyDefinedTypes.put(type3.get().getJavaName(), (BPFTypeLike)type3.get());
            this.processedTypes.add((TypeElement)unprocessed.getFirst());
        }
        java.util.List<MapDefinition> mapDefinitions = this.processDefinedMaps(outerTypeElement, field -> this.getBPFTypeForJavaName(this.definedTypes.bpfNameToName(this.definedTypes.specFieldNameToName((DefinedTypes.SpecFieldName)((Object)field)))), type2 -> this.definedTypes.getSpecFieldName(type2.getBPFName()).get());
        java.util.List<GlobalVariableDefinition> globals = this.createGlobalVariableDefinitions(outerTypeElement, typeToSpecField);
        java.util.List<CAST.Statement.Define> defines = this.createDefineStatements(outerTypeElement);
        ArrayList<FieldSpec> fields = new ArrayList<FieldSpec>();
        ArrayList<CAST.Statement> definingStatements = new ArrayList<CAST.Statement>();
        this.usedCustomBPFTypes.stream().map(BPFType.CustomBPFType::toCDeclaration).forEach(c -> c.ifPresent(definingStatements::add));
        for (TypeElement processedType : this.processedTypes) {
            if (this.isCustomTypeAnnotatedRecord(processedType)) continue;
            DefinedTypes.BPFName name = this.getTypeRecordBpfName(processedType);
            BPFTypeLike<?> type4 = this.alreadyDefinedTypes.get((Object)new DefinedTypes.JavaName(processedType));
            String fieldSpecName = this.definedTypes.getSpecFieldName(name).get().name();
            assert (type4 instanceof BPFTypeLike.TypeBackedBPFTypeLike);
            BPFType actualType = ((BPFTypeLike.TypeBackedBPFTypeLike)type4).type;
            FieldSpec spec = actualType.toFieldSpecGenerator().get().apply(fieldSpecName, t -> t.toJavaFieldSpecUse(t2 -> ((DefinedTypes.SpecFieldName)((Object)((Object)((Object)typeToSpecField.apply(BPFTypeLike.of(t2)))))).name()));
            fields.add(spec);
            if (!this.shouldGenerateCCode(processedType)) continue;
            actualType.toCDeclarationStatement().ifPresent(definingStatements::add);
        }
        InterfaceAdditions additions = this.getInterfaceAdditions(outerTypeElement.asType());
        if (additions == null) {
            return null;
        }
        return new TypeProcessorResult(fields, defines, definingStatements, this.getLicenseDefinitionStatement(outerTypeElement), mapDefinitions, globals, additions);
    }

    private java.util.List<GlobalVariableDefinition> createGlobalVariableDefinitions(TypeElement outerTypeElement, Function<BPFTypeLike<?>, DefinedTypes.SpecFieldName> typeToSpecField) {
        return outerTypeElement.getEnclosedElements().stream().filter(e -> e.getKind() == ElementKind.FIELD).map(e -> (VariableElement)e).filter(e -> this.typeUtils.hasClassIgnoringTypeParameters((Element)e, "me.bechberger.ebpf.bpf.GlobalVariable")).map(e -> this.processGlobalVariable((VariableElement)e, typeToSpecField)).filter(Objects::nonNull).toList();
    }

    @Nullable
    private GlobalVariableDefinition processGlobalVariable(VariableElement field, Function<BPFTypeLike<?>, DefinedTypes.SpecFieldName> typeToSpecField) {
        JCTree.JCExpression init;
        String typeField;
        BPFTypeLike<?> bpfType;
        block11: {
            block10: {
                Type.ClassType classType;
                if (!field.getModifiers().contains((Object)Modifier.FINAL)) {
                    this.processingEnv.getMessager().printError("Global variable field " + String.valueOf(field.getSimpleName()) + " must be final", field);
                    return null;
                }
                if (field.getModifiers().contains((Object)Modifier.STATIC)) {
                    this.processingEnv.getMessager().printError("Global variable field " + String.valueOf(field.getSimpleName()) + " must not be static", field);
                    return null;
                }
                TypeMirror type2 = (TypeMirror)((DeclaredType)field.asType()).getTypeArguments().getFirst();
                Optional<BPFTypeMirror> bpfTypeMirror = this.processBPFTypeRecordMemberType(field, AnnotationUtils.getAnnotationValuesForRecordMember(type2), type2);
                if (type2 instanceof Type.ClassType && this.typeUtils.hasClassIgnoringTypeParameters((Element)(classType = (Type.ClassType)type2).asElement(), Box.class.getName())) {
                    this.processingEnv.getMessager().printError("Global variable field " + String.valueOf(field.getSimpleName()) + " must not be a Box and you don't need this wrapper here", field);
                    return null;
                }
                if (bpfTypeMirror.isEmpty()) {
                    return null;
                }
                bpfType = bpfTypeMirror.get().toBPFType(this::getBPFTypeForJavaName);
                typeField = bpfType.toCustomType().toJavaFieldSpecUse(t -> ((DefinedTypes.SpecFieldName)((Object)((Object)typeToSpecField.apply(BPFTypeLike.of(t))))).name());
                JCTree tree = this.javacProcessingEnv.getElementUtils().getTree((Element)field);
                assert (tree instanceof JCTree.JCVariableDecl);
                init = ((JCTree.JCVariableDecl)tree).init;
                if (init == null) {
                    this.processingEnv.getMessager().printError("Global variable field " + String.valueOf(field.getSimpleName()) + " must have an initializer", field);
                    return null;
                }
                if (!(init instanceof JCTree.JCNewClass)) break block10;
                JCTree.JCNewClass newClass = (JCTree.JCNewClass)init;
                if (((JCTree.JCTypeApply)((JCTree.JCNewClass)init).clazz).getType().toString().equals("GlobalVariable")) break block11;
            }
            this.processingEnv.getMessager().printError("Global variable field " + String.valueOf(field.getSimpleName()) + " must be initialized with a new GlobalVariable", field);
            return null;
        }
        List args = ((JCTree.JCNewClass)init).getArguments();
        assert (args.size() == 1);
        String initializer = ((JCTree.JCExpression)args.getFirst()).toString();
        CAST.Statement definition = CAST.Statement.variableDefinition(bpfType.toCustomType().cUse().get(), CAST.Expression.variable(field.getSimpleName().toString(), CAST.PrimaryExpression.CAnnotation.sec(".data")));
        return new GlobalVariableDefinition(definition, field.getSimpleName().toString(), typeField, initializer);
    }

    private BPFTypeLike<?> getBPFTypeForJavaName(DefinedTypes.JavaName name) {
        Objects.requireNonNull(name);
        if (this.alreadyDefinedTypes.containsKey((Object)name)) {
            return this.alreadyDefinedTypes.get((Object)name);
        }
        if (this.currentlyDefining.contains((Object)name)) {
            this.processingEnv.getMessager().printError("Recursion detected for type " + String.valueOf((Object)name), this.outerTypeElement);
            throw new IllegalStateException("Recursion detected for type " + String.valueOf((Object)name));
        }
        this.currentlyDefining.add(name);
        DefinedTypes.BPFName bpfName = this.definedTypes.nameToBPFName(name);
        Optional<TypeElement> typeElementOpt = this.definedTypes.getTypeElement(bpfName);
        if (typeElementOpt.isEmpty()) {
            this.processingEnv.getMessager().printError("Type " + String.valueOf((Object)name) + " not defined", this.outerTypeElement);
            return null;
        }
        TypeElement typeElement = typeElementOpt.get();
        Optional<? extends BPFTypeLike.TypeBackedBPFTypeLike<?>> type2 = this.processBPFTypeRecord(typeElement);
        if (type2.isEmpty()) {
            this.processingEnv.getMessager().printError("Type " + String.valueOf((Object)name) + " could not be processed", this.outerTypeElement);
            return null;
        }
        this.alreadyDefinedTypes.put(name, (BPFTypeLike)type2.get());
        this.currentlyDefining.remove((Object)name);
        this.processedTypes.add(typeElement);
        return type2.get();
    }

    @Nullable
    private CAST.Statement getLicenseDefinitionStatement(TypeElement outerTypeElement) {
        Optional<? extends AnnotationMirror> annotation = AnnotationUtils.getAnnotationMirror(outerTypeElement, "me.bechberger.ebpf.annotations.bpf.BPF");
        if (annotation.isEmpty()) {
            return null;
        }
        String license = AnnotationUtils.getAnnotationValue(annotation.get(), "license", "");
        if (license.isEmpty()) {
            return null;
        }
        return CAST.Statement.variableDefinition(CAST.Declarator.array(CAST.Declarator.identifier("char"), null), CAST.Expression.variable("_license", CAST.PrimaryExpression.CAnnotation.sec("license")), CAST.Expression.constant(license));
    }

    private InterfaceAdditions getInterfaceAdditions(TypeMirror outerType) {
        ArrayList<String> includes = new ArrayList<String>();
        TypeElement outerTypeElement = (TypeElement)((DeclaredType)outerType).asElement();
        BPF annotation = outerTypeElement.getAnnotation(BPF.class);
        if (annotation != null) {
            includes.addAll(java.util.List.of((Object[])annotation.includes()));
        }
        includes.addAll(this.getIncludesOfInterface(outerType));
        ArrayList<String> before = new ArrayList<String>();
        ArrayList<String> after = new ArrayList<String>();
        boolean hadError = false;
        for (TypeMirror inter : this.getInterfaces(outerType)) {
            String afterLine;
            Symbol.TypeSymbol interElement = ((Type.ClassType)inter).asElement();
            BPFInterface interAnnotation = (BPFInterface)interElement.getAnnotation(BPFInterface.class);
            if (interAnnotation == null) continue;
            String beforeLine = interAnnotation.before();
            if (!beforeLine.isEmpty()) {
                before.add(beforeLine.strip());
            }
            if (!(afterLine = interAnnotation.after()).isEmpty()) {
                after.add(afterLine.strip());
            }
            for (String include : this.getIncludesOfInterface(inter)) {
                if (includes.contains(include)) continue;
                includes.add(include);
            }
        }
        if (hadError) {
            return null;
        }
        return new InterfaceAdditions(includes, before, after);
    }

    private java.util.List<TypeMirror> getInterfaces(TypeMirror outerType) {
        TypeElement outerTypeElement = (TypeElement)((DeclaredType)outerType).asElement();
        ArrayList<TypeMirror> interfaces = new ArrayList<TypeMirror>();
        outerTypeElement.getInterfaces().forEach(t -> {
            interfaces.add((TypeMirror)t);
            interfaces.addAll(this.getInterfaces((TypeMirror)t));
        });
        return interfaces;
    }

    private java.util.List<String> getIncludesOfInterface(TypeMirror outerType) {
        Optional<? extends AnnotationMirror> annotation = AnnotationUtils.getAnnotationMirror((AnnotatedConstruct)((Type.ClassType)outerType).asElement(), "me.bechberger.ebpf.annotations.Includes");
        return annotation.map(annotationMirror -> AnnotationUtils.getAnnotationValue(annotationMirror, "value", java.util.List.of()).stream().map(v -> (String)((Attribute.Constant)v).getValue()).toList()).orElse(java.util.List.of());
    }

    @Nullable
    public CAST.Statement.Define processField(VariableElement field) {
        if (!field.getModifiers().contains((Object)Modifier.STATIC) || !field.getModifiers().contains((Object)Modifier.FINAL) || field.getSimpleName().toString().equals("EBPF_PROGRAM")) {
            return null;
        }
        TypeMirror type2 = field.asType();
        return switch (type2.toString()) {
            case "boolean" -> CAST.Statement.define(field.getSimpleName().toString(), CAST.Expression.constant(field.getConstantValue().equals(true) ? "1" : "0"));
            case "byte", "short", "int", "long", "float", "double" -> new CAST.Statement.Define(field.getSimpleName().toString(), CAST.Expression.constant(field.getConstantValue()));
            case "java.lang.String" -> new CAST.Statement.Define(field.getSimpleName().toString(), CAST.Expression.constant(field.getConstantValue().toString()));
            default -> null;
        };
    }

    private java.util.List<CAST.Statement.Define> createDefineStatements(TypeElement typeElement) {
        return typeElement.getEnclosedElements().stream().filter(e -> e.getKind() == ElementKind.FIELD).map(e -> (VariableElement)e).map(this::processField).filter(Objects::nonNull).toList();
    }

    DefinedTypes.BPFName getTypeRecordBpfName(TypeElement typeElement) {
        Optional<? extends AnnotationMirror> annotation = AnnotationUtils.getAnnotationMirror(typeElement, TYPE_ANNOTATION);
        if (annotation.isEmpty()) {
            annotation = AnnotationUtils.getAnnotationMirror(typeElement, "me.bechberger.ebpf.annotations.CustomType");
        }
        return new DefinedTypes.BPFName(annotation.flatMap(a -> Optional.ofNullable(AnnotationUtils.getAnnotationValue(a, "name", null))).orElse(typeElement.getSimpleName().toString()));
    }

    private Optional<? extends BPFTypeLike.TypeBackedBPFTypeLike<?>> processBPFTypeRecord(TypeElement typeElement) {
        String className = typeElement.getQualifiedName().toString().replace("$", ".");
        DefinedTypes.BPFName name = this.getTypeRecordBpfName(typeElement);
        DataTypeKind t = this.isValidDataType(typeElement);
        return switch (t.ordinal()) {
            default -> throw new MatchException(null, null);
            case 0 -> this.processBPFTypeStruct(typeElement, className, name);
            case 1 -> this.processBPFTypeUnion(typeElement, className, name);
            case 2 -> this.processBPFTypeTypedef(typeElement, className, name);
            case 3 -> this.processBPFTypeEnum(typeElement, className, name);
            case 4 -> Optional.empty();
        };
    }

    private Optional<BPFTypeLike.TypeBackedBPFEnumType<?>> processBPFTypeEnum(TypeElement typeElement, String className, DefinedTypes.BPFName name) {
        Optional elementTypeParameter = typeElement.getInterfaces().stream().filter(t -> t.toString().startsWith(TypedEnum.class.getCanonicalName())).findFirst().map(t -> ((DeclaredType)t).getTypeArguments().get(1)).flatMap(t -> this.processBPFTypeRecordMemberType(typeElement, AnnotationUtils.getAnnotationValuesForRecordMember(t), (TypeMirror)t));
        java.util.List enumMembers = typeElement.getEnclosedElements().stream().filter(e -> e.getKind() == ElementKind.ENUM_CONSTANT).map(e -> (VariableElement)e).toList();
        ArrayList<BPFType.BPFEnumMember> members = new ArrayList<BPFType.BPFEnumMember>();
        long currentValue = 0L;
        HashMap<String, VariableElement> cNames = new HashMap<String, VariableElement>();
        for (VariableElement member : enumMembers) {
            long value = AnnotationUtils.getAnnotationMirror(member, "me.bechberger.ebpf.annotations.EnumMember").map(a -> AnnotationUtils.getAnnotationValue(a, "value", -1L)).orElse(currentValue);
            if (value == -1L) {
                value = currentValue;
            }
            String memberName = member.getSimpleName().toString();
            String memberCNameValue = AnnotationUtils.getAnnotationMirror(member, "me.bechberger.ebpf.annotations.EnumMember").map(a -> AnnotationUtils.getAnnotationValue(a, "name", "")).orElse("");
            if (memberCNameValue.isEmpty()) {
                memberCNameValue = NameUtil.toConstantCase(name.name() + "_" + memberName);
            }
            if (cNames.containsKey(memberCNameValue)) {
                this.processingEnv.getMessager().printError("Enum member " + String.valueOf(member.getSimpleName()) + " has a duplicate name, " + String.valueOf(typeElement.getSimpleName()) + "::" + String.valueOf(cNames.get(memberCNameValue)) + " has the same C name", member);
                return Optional.empty();
            }
            cNames.put(memberCNameValue, member);
            members.add(new BPFType.BPFEnumMember(memberName, memberCNameValue, value));
            currentValue = value + 1L;
        }
        BPFType.AnnotatedClass annotatedClass = new BPFType.AnnotatedClass(className, (java.util.List<Annotation>)java.util.List.of());
        if (elementTypeParameter.isEmpty()) {
            return Optional.of(new BPFTypeLike.TypeBackedBPFEnumType(new BPFType.BPFEnumType(name.name(), members, annotatedClass, null)));
        }
        return Optional.of(new BPFTypeLike.TypeBackedBPFEnumType(new BPFType.BPFEnumType(name.name(), ((BPFTypeMirror)elementTypeParameter.orElseThrow()).toBPFType(this::getBPFTypeForJavaName).toCustomType(), members, annotatedClass, null)));
    }

    private Optional<BPFTypeLike.TypeBackedBPFTypedef<?, ?>> processBPFTypeTypedef(TypeElement typeElement, String className, DefinedTypes.BPFName name) {
        TypeMirror typeParameter;
        if (typeElement.getKind() == ElementKind.RECORD) {
            typeParameter = (TypeMirror)((DeclaredType)typeElement.getInterfaces().stream().filter(t -> t.toString().startsWith(Typedef.class.getCanonicalName())).findFirst().orElseThrow()).getTypeArguments().getFirst();
        } else {
            assert (typeElement.getKind() == ElementKind.CLASS);
            typeParameter = (TypeMirror)((DeclaredType)typeElement.getSuperclass()).getTypeArguments().getFirst();
        }
        Optional<BPFTypeMirror> innerType = this.processBPFTypeRecordMemberType(typeElement, AnnotationUtils.getAnnotationValuesForRecordMember(typeParameter), typeParameter);
        if (innerType.isEmpty()) {
            return Optional.empty();
        }
        BPFType.AnnotatedClass annotatedClass = new BPFType.AnnotatedClass(className, (java.util.List<Annotation>)java.util.List.of());
        return Optional.of(new BPFTypeLike.TypeBackedBPFTypedef(new BPFType.BPFTypedef(name.name(), innerType.get().toBPFType(this::getBPFTypeForJavaName).toCustomType(), annotatedClass, null)));
    }

    private Optional<BPFTypeLike.TypeBackedBPFStructType<?>> processBPFTypeStruct(TypeElement typeElement, String className, DefinedTypes.BPFName name) {
        StructProcResult result = typeElement.getKind() == ElementKind.RECORD ? this.processBPFTypeRecordStruct(typeElement, className, name) : this.processBPFTypeClassStruct(typeElement, className, name);
        if (result.members.isEmpty()) {
            return Optional.empty();
        }
        BPFType.AnnotatedClass annotatedClass = new BPFType.AnnotatedClass(className, (java.util.List<Annotation>)java.util.List.of());
        return Optional.of(new BPFTypeLike.TypeBackedBPFStructType(BPFType.BPFStructType.autoLayout(name.name(), result.members.get(), annotatedClass, null, result.kind, this.isTypedefedType(typeElement))));
    }

    private StructProcResult processBPFTypeRecordStruct(TypeElement typeElement, String className, DefinedTypes.BPFName name) {
        java.util.List constructors = typeElement.getEnclosedElements().stream().filter(e -> e.getKind() == ElementKind.CONSTRUCTOR).toList();
        if (constructors.size() != 1) {
            this.processingEnv.getMessager().printError("Record " + String.valueOf(typeElement.getSimpleName()) + " must have exactly one constructor", typeElement);
            return new StructProcResult(Optional.empty(), null);
        }
        ExecutableElement constructor = (ExecutableElement)constructors.getFirst();
        return new StructProcResult(this.processBPFTypeRecordMembers(constructor.getParameters(), className, true, BPFType.BPFStructType.SourceClassKind.RECORD), BPFType.BPFStructType.SourceClassKind.RECORD);
    }

    private StructProcResult processBPFTypeClassStruct(TypeElement typeElement, String className, DefinedTypes.BPFName name) {
        java.util.List constructors = typeElement.getEnclosedElements().stream().filter(e -> e.getKind() == ElementKind.CONSTRUCTOR).toList();
        boolean hasDefaultConstructor = constructors.stream().anyMatch(e -> ((ExecutableElement)e).getParameters().isEmpty());
        java.util.List fields = typeElement.getEnclosedElements().stream().filter(e -> e.getKind() == ElementKind.FIELD).map(e -> (VariableElement)e).toList();
        boolean hasConstructorWithFieldsInOrder = constructors.stream().anyMatch(e -> {
            ExecutableElement constructor = (ExecutableElement)e;
            java.util.List<? extends VariableElement> constructorFields = constructor.getParameters();
            return fields.size() == constructorFields.size() && IntStream.range(0, fields.size()).allMatch(i -> this.processingEnv.getTypeUtils().isSameType(((VariableElement)constructorFields.get(i)).asType(), ((VariableElement)fields.get(i)).asType()));
        });
        if (!hasDefaultConstructor && !hasConstructorWithFieldsInOrder) {
            this.processingEnv.getMessager().printError("Class " + String.valueOf(typeElement.getSimpleName()) + " must have either a default constructor or a constructor with fields in order", typeElement);
            return new StructProcResult(Optional.empty(), null);
        }
        BPFType.BPFStructType.SourceClassKind kind = hasConstructorWithFieldsInOrder ? BPFType.BPFStructType.SourceClassKind.CLASS_WITH_CONSTRUCTOR : BPFType.BPFStructType.SourceClassKind.CLASS;
        return new StructProcResult(this.processBPFTypeRecordMembers(fields, className, true, kind), kind);
    }

    private Optional<BPFTypeLike.TypeBackedBPFUnionType<?>> processBPFTypeUnion(TypeElement typeElement, String className, DefinedTypes.BPFName name) {
        java.util.List constructors = typeElement.getEnclosedElements().stream().filter(e -> e.getKind() == ElementKind.CONSTRUCTOR).toList();
        if (constructors.size() != 1 || !((ExecutableElement)constructors.getFirst()).getParameters().isEmpty()) {
            this.processingEnv.getMessager().printError("Union class " + String.valueOf(typeElement.getSimpleName()) + " must only have the default constructor", typeElement);
            return Optional.empty();
        }
        ExecutableElement constructor = (ExecutableElement)constructors.getFirst();
        Optional<java.util.List<BPFType.UBPFStructMember<?, ?>>> membersOpt = this.processBPFTypeRecordMembers(typeElement.getEnclosedElements().stream().filter(e -> e.getKind() == ElementKind.FIELD).map(e -> (VariableElement)e).toList(), className, false, BPFType.BPFStructType.SourceClassKind.CLASS);
        if (membersOpt.isEmpty()) {
            return Optional.empty();
        }
        java.util.List<BPFType.UBPFStructMember<?, ?>> members = membersOpt.get();
        BPFType.AnnotatedClass annotatedClass = new BPFType.AnnotatedClass(className, (java.util.List<Annotation>)java.util.List.of());
        return Optional.of(new BPFTypeLike.TypeBackedBPFUnionType(new BPFType.BPFUnionType(name.name(), members.stream().map(m -> new BPFType.BPFUnionMember(m.name(), m.type(), null)).toList(), annotatedClass, null, this.isTypedefedType(typeElement))));
    }

    private boolean hasInitializer(VariableElement element) {
        JCTree tree = this.javacProcessingEnv.getElementUtils().getTree((Element)element);
        if (tree instanceof JCTree.JCVariableDecl) {
            return ((JCTree.JCVariableDecl)tree).init != null;
        }
        return element.getConstantValue() != null;
    }

    private boolean checkThatNoMemberHasAnInitializer(java.util.List<? extends VariableElement> recordMembers) {
        java.util.List membersWithInitializer = recordMembers.stream().filter(this::hasInitializer).toList();
        for (VariableElement member : membersWithInitializer) {
            this.processingEnv.getMessager().printError(String.valueOf(member.getEnclosingElement().getSimpleName()) + "." + String.valueOf(member.getSimpleName()) + " must not have an initializer", member);
        }
        return membersWithInitializer.isEmpty();
    }

    private Optional<java.util.List<BPFType.UBPFStructMember<?, ?>>> processBPFTypeRecordMembers(java.util.List<? extends VariableElement> recordMembers, String className, boolean allowInlineUnionAnnotation, BPFType.BPFStructType.SourceClassKind kind) {
        java.util.List list = recordMembers.stream().map(this::processBPFTypeRecordMember).toList();
        if (list.stream().anyMatch((Predicate<Optional>)LambdaMetafactory.metafactory(null, null, null, (Ljava/lang/Object;)Z, isEmpty(), (Ljava/util/Optional;)Z)()) || !this.checkThatNoMemberHasAnInitializer(recordMembers)) {
            return Optional.empty();
        }
        java.util.List cleanedList = list.stream().map((Function<Optional, UBPFStructMemberPotentiallyInlineUnion>)LambdaMetafactory.metafactory(null, null, null, (Ljava/lang/Object;)Ljava/lang/Object;, orElseThrow(), (Ljava/util/Optional;)Lme/bechberger/ebpf/bpf/processor/TypeProcessor$UBPFStructMemberPotentiallyInlineUnion;)()).toList();
        if (cleanedList.stream().noneMatch(m -> m.inlineUnionId().isPresent())) {
            return Optional.of(cleanedList.stream().map(UBPFStructMemberPotentiallyInlineUnion::member).toList());
        }
        if (!allowInlineUnionAnnotation) {
            this.processingEnv.getMessager().printError("InlineUnion annotation is only allowed for records", (Element)IntStream.range(0, recordMembers.size()).mapToObj(i -> ((UBPFStructMemberPotentiallyInlineUnion)((Object)((Object)cleanedList.get((int)i)))).inlineUnionId.isPresent() ? (VariableElement)recordMembers.get(i) : null).filter(Objects::nonNull).findFirst().orElseThrow());
            return Optional.empty();
        }
        ArrayList result = new ArrayList();
        HashSet<Integer> previousInlineUnionIds = new HashSet<Integer>();
        Integer curId = null;
        Optional<Object> curOffset = Optional.empty();
        ArrayList memberForCurrentInlineUnion = new ArrayList();
        BiConsumer<Integer, Optional> addCurrentInlineUnion = (id, offset) -> {
            java.util.List inlineMembers = memberForCurrentInlineUnion.stream().map(m -> new BPFType.BPFInlineUnionMember(m.name(), m.type(), null)).toList();
            BPFType.BPFInlineUnionType type2 = new BPFType.BPFInlineUnionType("__union" + id, inlineMembers, new BPFType.AnnotatedClass(className, (java.util.List<Annotation>)java.util.List.of()), kind);
            result.add(new BPFType.UBPFStructMember("__union" + id, type2, null, null, (Optional<Integer>)offset));
            memberForCurrentInlineUnion.clear();
        };
        int count = 0;
        for (UBPFStructMemberPotentiallyInlineUnion member : cleanedList) {
            if (member.inlineUnionId().isEmpty()) {
                result.add(member.member());
                if (curId == null) continue;
                previousInlineUnionIds.add(curId);
                addCurrentInlineUnion.accept(curId, curOffset);
                curId = null;
                curOffset = null;
                continue;
            }
            Integer inlineUnionId = member.inlineUnionId().get();
            BPFType.UBPFStructMember<?, ?> realMember = member.member();
            if (previousInlineUnionIds.contains(inlineUnionId)) {
                this.processingEnv.getMessager().printError("Members with the same InlineUnion annotation id have to follow each other", recordMembers.get(count));
                return Optional.empty();
            }
            if (curId != null && !curId.equals(member.inlineUnionId().get())) {
                previousInlineUnionIds.add(curId);
                addCurrentInlineUnion.accept(curId, curOffset);
                curId = null;
            }
            if (curId == null) {
                curOffset = member.member().offset();
            } else if (!curOffset.equals(member.member().offset())) {
                this.processingEnv.getMessager().printError("Members with the same InlineUnion annotation id have to have the same offset", recordMembers.get(count));
                return Optional.empty();
            }
            curId = member.inlineUnionId().get();
            memberForCurrentInlineUnion.add(realMember);
            ++count;
        }
        if (curId != null) {
            addCurrentInlineUnion.accept(curId, curOffset);
        }
        return Optional.of(result);
    }

    private Optional<UBPFStructMemberPotentiallyInlineUnion> processBPFTypeRecordMember(VariableElement element) {
        AnnotationUtils.AnnotationValues annotations = AnnotationUtils.getAnnotationValuesForRecordMember(element);
        Optional<Integer> inlineUnionId = Optional.ofNullable(AnnotationUtils.getAnnotationMirror(element.asType(), "me.bechberger.ebpf.annotations.InlineUnion").map(a -> AnnotationUtils.getAnnotationValue(a, "value", null)).orElse(null));
        TypeMirror type2 = element.asType();
        Optional<BPFTypeMirror> bpfType = this.processBPFTypeRecordMemberType(element, annotations.dropOffset(), type2);
        return bpfType.map(t -> {
            BPFTypeLike<?> bt = t.toBPFType(this::getBPFTypeForJavaName);
            if (bt == null) {
                this.processingEnv.getMessager().printError("Could not process type " + String.valueOf(type2) + " for member " + String.valueOf(element), element);
                return null;
            }
            return new UBPFStructMemberPotentiallyInlineUnion(new BPFType.UBPFStructMember(element.getSimpleName().toString(), bt.toCustomType(), null, null, annotations.offset()), inlineUnionId);
        });
    }

    private static String lastPart(String s2) {
        return s2.substring(s2.lastIndexOf(" ") + 1);
    }

    /*
     * Enabled force condition propagation
     * Lifted jumps to return sites
     */
    private boolean isIntegerType(TypeMirror type2) {
        String typeName = TypeProcessor.lastPart(type2.toString());
        if (type2 instanceof PrimitiveType) {
            PrimitiveType p = (PrimitiveType)type2;
            if (integerTypes.contains(typeName)) return true;
        }
        if (boxedToUnboxedIntegerType.containsKey(typeName)) return true;
        if (!boxedToUnboxedIntegerType.containsKey("java.lang." + typeName)) return false;
        return true;
    }

    private boolean isStringType(TypeMirror type2) {
        String lastPart = TypeProcessor.lastPart(type2.toString());
        return lastPart.equals("String") || lastPart.equals("java.lang.String");
    }

    public Optional<BPFTypeMirror> processBPFTypeRecordMemberType(Element element, AnnotationUtils.AnnotationValues annotations, TypeMirror type2) {
        return this.processBPFTypeRecordMemberType(element, annotations, type2, true);
    }

    public Optional<BPFTypeMirror> processBPFTypeRecordMemberTypeWithBox(Element element, AnnotationUtils.AnnotationValues annotations, TypeMirror type2) {
        return this.processBPFTypeRecordMemberType(element, annotations, type2, true);
    }

    private Optional<BPFTypeMirror> processBPFTypeRecordMemberType(Element element, AnnotationUtils.AnnotationValues annotations, TypeMirror type2, boolean allowBox) {
        if (type2.getKind() == TypeKind.DECLARED && this.typeUtils.hasClassIgnoringTypeParameters(element, Box.class.getName())) {
            if (!allowBox) {
                this.processingEnv.getMessager().printError("Box is not allowed here", element);
                return Optional.empty();
            }
            TypeMirror typeMirror = element.asType();
            if (!(typeMirror instanceof Type.ClassType)) {
                this.processingEnv.getMessager().printError("Box type has to be a class", element);
                return Optional.empty();
            }
            Type.ClassType classType = (Type.ClassType)typeMirror;
            List genericTypes = classType.getTypeArguments();
            if (genericTypes.size() != 1) {
                this.processingEnv.getMessager().printError("Box type must have exactly one type argument", element);
                return Optional.empty();
            }
            com.sun.tools.javac.code.Type genericType = (com.sun.tools.javac.code.Type)genericTypes.getFirst();
            return this.processBPFTypeRecordMemberType((Element)genericType.asElement(), AnnotationUtils.getAnnotationValuesForRecordMember((AnnotatedConstruct)genericType), (TypeMirror)genericType);
        }
        if (type2.getKind() == TypeKind.ARRAY) {
            return this.processArrayType(element, annotations, (ArrayType)type2);
        }
        if (this.isIntegerType(type2)) {
            return this.processIntegerType(element, annotations, type2).map(tp -> t -> BPFTypeLike.of(tp));
        }
        if (this.isStringType(type2)) {
            return this.processStringType(element, annotations, type2);
        }
        Element typeElem = this.processingEnv.getTypeUtils().asElement(type2);
        if (typeElem == null) {
            return Optional.of(t -> BPFTypeLike.of(BPFType.VOID));
        }
        if (!(typeElem instanceof TypeElement)) {
            this.processingEnv.getMessager().printError("Unsupported type " + String.valueOf(type2) + " in " + String.valueOf(element), element);
            return Optional.empty();
        }
        TypeElement typeElement = (TypeElement)typeElem;
        if (this.isPointerType(typeElement)) {
            return this.processPointerType(element, annotations, type2);
        }
        System.out.println("Type " + String.valueOf(typeElement.getSimpleName()));
        if (this.isCustomTypeAnnotatedRecord(typeElement)) {
            return this.processCustomType(element, annotations, type2);
        }
        DataTypeKind t2 = this.isValidDataType(typeElement);
        if (t2 != DataTypeKind.NONE) {
            return this.processDefinedDataType(element, annotations, type2, t2);
        }
        this.processingEnv.getMessager().printError("Unsupported type " + String.valueOf(type2), element);
        return Optional.empty();
    }

    private boolean isPointerType(TypeElement typeElement) {
        return typeElement.getQualifiedName().toString().equals(Ptr.class.getCanonicalName());
    }

    private Optional<BPFTypeMirror> processPointerType(Element element, AnnotationUtils.AnnotationValues annotations, TypeMirror type2) {
        if (!annotations.checkSupportedAnnotations(m -> this.processingEnv.getMessager().printError((CharSequence)m, element), new AnnotationUtils.AnnotationValues.AnnotationKind[0])) {
            return Optional.empty();
        }
        java.util.List<? extends TypeMirror> genericTypes = ((DeclaredType)type2).getTypeArguments();
        if (genericTypes.size() != 1) {
            this.processingEnv.getMessager().printError("Pointer type must have exactly one type argument", element);
            return Optional.empty();
        }
        TypeMirror genericType = (TypeMirror)genericTypes.getFirst();
        Optional<BPFTypeMirror> innerType = this.processBPFTypeRecordMemberType(element, AnnotationUtils.getAnnotationValuesForRecordMember(genericType), genericType);
        if (innerType.isEmpty()) {
            return Optional.empty();
        }
        return Optional.of(nameToCustomType -> new BPFTypeLike.TypeBackedBPFTypeLike(new BPFType.BPFPointerType(((BPFTypeMirror)innerType.get()).toBPFType(nameToCustomType).toCustomType())));
    }

    private Optional<BPFTypeMirror> processArrayType(Element element, AnnotationUtils.AnnotationValues annotations, ArrayType type2) {
        System.out.println("Array type " + String.valueOf(type2));
        if (annotations.size().isEmpty()) {
            this.processingEnv.getMessager().printError("Size annotation required for array types", element);
            if (type2.getComponentType().getKind() == TypeKind.ARRAY) {
                int depth = 1;
                TypeMirror innerType = type2.getComponentType();
                while (innerType.getKind() == TypeKind.ARRAY) {
                    ++depth;
                    innerType = ((ArrayType)innerType).getComponentType();
                }
                String example = "@Size(...) " + String.valueOf(innerType) + "[] " + IntStream.range(0, depth - 1).mapToObj(i -> " @Size(...) []").collect(Collectors.joining());
                this.processingEnv.getMessager().printError("This might be due to misplaced annotations, use: " + example, element);
            }
            return Optional.empty();
        }
        Optional<BPFTypeMirror> innerType = this.processBPFTypeRecordMemberType(element, annotations.dropSize(), type2.getComponentType());
        if (innerType.isEmpty()) {
            return Optional.empty();
        }
        return Optional.of(nameToCustomType -> new BPFTypeLike.TypeBackedBPFTypeLike<E[]>(BPFType.BPFArrayType.of(((BPFTypeMirror)innerType.get()).toBPFType(nameToCustomType).toCustomType(), (Integer)annotations.size().getFirst())));
    }

    private Optional<BPFType<?>> processIntegerType(Element element, AnnotationUtils.AnnotationValues annotations, TypeMirror type2) {
        String numberName;
        if (!annotations.checkSupportedAnnotations(m -> this.processingEnv.getMessager().printError((CharSequence)m, element), AnnotationUtils.AnnotationValues.AnnotationKind.UNSIGNED)) {
            return Optional.empty();
        }
        boolean unsigned = annotations.unsigned();
        String typeName = TypeProcessor.lastPart(type2.toString());
        return switch (numberName = boxedToUnboxedIntegerType.getOrDefault(typeName, boxedToUnboxedIntegerType.getOrDefault("java.lang." + typeName, typeName))) {
            case "boolean" -> Optional.of(BPFType.BPFIntType.BOOL);
            case "int" -> Optional.of(unsigned ? BPFType.BPFIntType.UINT32 : BPFType.BPFIntType.INT32);
            case "long" -> Optional.of(unsigned ? BPFType.BPFIntType.UINT64 : BPFType.BPFIntType.INT64);
            case "short" -> Optional.of(unsigned ? BPFType.BPFIntType.UINT16 : BPFType.BPFIntType.INT16);
            case "byte" -> Optional.of(unsigned ? BPFType.BPFIntType.UINT8 : BPFType.BPFIntType.INT8);
            case "char" -> {
                if (unsigned) {
                    this.processingEnv.getMessager().printError("Unsigned char not supported", element);
                    yield Optional.empty();
                }
                yield Optional.of(BPFType.BPFIntType.CHAR);
            }
            default -> {
                this.processingEnv.getMessager().printError("Unsupported integer type " + String.valueOf(type2), element);
                yield Optional.empty();
            }
        };
    }

    private Optional<BPFTypeMirror> processStringType(Element element, AnnotationUtils.AnnotationValues annotations, TypeMirror type2) {
        if (!annotations.checkSupportedAnnotations(m -> this.processingEnv.getMessager().printError((CharSequence)m, element), AnnotationUtils.AnnotationValues.AnnotationKind.SIZE)) {
            return Optional.empty();
        }
        if (annotations.size().isEmpty() && !this.allowUnsizedStrings) {
            this.processingEnv.getMessager().printError("Size annotation required for string types", element);
            return Optional.empty();
        }
        return Optional.of(t -> BPFTypeLike.of(new BPFType.StringType(annotations.size().isEmpty() ? -1 : (Integer)annotations.size().getFirst())));
    }

    private Optional<BPFTypeMirror> processDefinedDataType(Element element, AnnotationUtils.AnnotationValues annotations, TypeMirror type2, DataTypeKind kind) {
        if (!this.checkAnnotatedType(element, annotations)) {
            return Optional.empty();
        }
        TypeElement typeElement = (TypeElement)this.processingEnv.getTypeUtils().asElement(type2);
        if (this.definedTypes == null) {
            Type annotation = typeElement.getAnnotation(Type.class);
            if (annotation == null) {
                this.processingEnv.getMessager().printError("Type " + String.valueOf(typeElement.getSimpleName()) + " must be annotated with @Type", element);
                return Optional.empty();
            }
            String cType = annotation.cType();
            return this.getVerbatimBPFTypeName(cType, kind, typeElement);
        }
        DefinedTypes.SpecFieldName fieldName = this.definedTypes.getOrCreateFieldName(typeElement);
        DefinedTypes.JavaName typeName = this.definedTypes.bpfNameToName(this.definedTypes.specFieldNameToName(fieldName));
        return Optional.of(t -> (BPFTypeLike)t.apply(typeName));
    }

    @NotNull
    private Optional<BPFTypeMirror> getVerbatimBPFTypeName(String cType, DataTypeKind kind, TypeElement typeElement) {
        if (cType.isEmpty()) {
            String name = this.getTypeRecordBpfName(typeElement).name();
            String[] parts = name.split("\\$");
            String properName = parts[parts.length - 1];
            return Optional.of(t -> new BPFTypeLike.VerbatimBPFOnlyType(properName, switch (kind.ordinal()) {
                case 0 -> BPFTypeLike.VerbatimBPFOnlyType.PrefixKind.STRUCT;
                case 1 -> BPFTypeLike.VerbatimBPFOnlyType.PrefixKind.UNION;
                case 3 -> BPFTypeLike.VerbatimBPFOnlyType.PrefixKind.ENUM;
                case 4 -> BPFTypeLike.VerbatimBPFOnlyType.PrefixKind.NORMAL;
                default -> throw new IllegalStateException("Unexpected value: " + String.valueOf((Object)kind));
            }));
        }
        return Optional.of(t -> new BPFTypeLike.VerbatimBPFOnlyType(cType, BPFTypeLike.VerbatimBPFOnlyType.PrefixKind.NORMAL));
    }

    private boolean checkAnnotatedType(Element element, AnnotationUtils.AnnotationValues annotations) {
        return annotations.checkSupportedAnnotations(m -> this.processingEnv.getMessager().printError((CharSequence)m, element), new AnnotationUtils.AnnotationValues.AnnotationKind[0]);
    }

    private Optional<BPFTypeMirror> processCustomType(Element element, AnnotationUtils.AnnotationValues annotations, TypeMirror type2) {
        Optional<DefinedTypes.SpecFieldName> fieldName;
        if (!this.checkAnnotatedType(element, annotations)) {
            return Optional.empty();
        }
        TypeElement typeElement = (TypeElement)this.processingEnv.getTypeUtils().asElement(type2);
        if (!this.definedTypes.isTypeDefined(typeElement)) {
            CustomTypeInfo info2 = this.getCustomTypeInfo(typeElement);
            if (info2 == null) {
                return Optional.empty();
            }
            this.addCustomType(info2);
        }
        if ((fieldName = this.definedTypes.getFieldName(typeElement)).isEmpty()) {
            return Optional.empty();
        }
        DefinedTypes.JavaName typeName = this.definedTypes.bpfNameToName(this.definedTypes.specFieldNameToName(fieldName.get()));
        return Optional.of(t -> {
            BPFType.CustomBPFType customType = (BPFType.CustomBPFType)this.usedCustomBPFTypes.stream().filter(ut -> ut.javaName().equals(typeName.name())).findFirst().orElseThrow();
            return new BPFTypeLike.TypeBackedBPFCustomType(customType);
        });
    }

    @Nullable
    public CustomTypeInfo getCustomTypeInfo(TypeElement typeElement) {
        Optional<? extends AnnotationMirror> optAnn = AnnotationUtils.getAnnotationMirror(typeElement, "me.bechberger.ebpf.annotations.CustomType");
        if (optAnn.isEmpty()) {
            return null;
        }
        DefinedTypes.JavaName javaName = new DefinedTypes.JavaName(typeElement);
        DefinedTypes.BPFName bpfName = new DefinedTypes.BPFName(AnnotationUtils.getAnnotationValue(optAnn.get(), "name", typeElement.getSimpleName().toString()));
        String fieldNameString = AnnotationUtils.getAnnotationValue(optAnn.get(), "specFieldName", "").replace("$class", javaName.name());
        Element element = typeElement.getEnclosingElement();
        if (element instanceof TypeElement) {
            TypeElement outerClass = (TypeElement)element;
            fieldNameString = fieldNameString.replace("$outerClass", outerClass.getQualifiedName().toString().replace('$', '.'));
        }
        DefinedTypes.SpecFieldName fieldName = new DefinedTypes.SpecFieldName(fieldNameString);
        if (!fieldNameString.contains(".")) {
            this.processingEnv.getMessager().printError("specFieldName must be set", typeElement);
            return null;
        }
        Boolean isStruct = AnnotationUtils.getAnnotationValue(optAnn.get(), "isStruct", false);
        String cCode = AnnotationUtils.getAnnotationValue(optAnn.get(), "cCode", "").replace("$name", bpfName.name());
        return new CustomTypeInfo(typeElement, javaName, bpfName, fieldName, isStruct, cCode);
    }

    private void addCustomType(CustomTypeInfo customType) {
        this.definedTypes.insertType(customType.typeElement, customType.bpfName, customType.fieldName);
        this.usedCustomBPFTypes.add(new BPFType.CustomBPFType(customType.javaName.name(), customType.javaName.name(), customType.javaName.name(), customType.bpfName.name(), () -> customType.isStruct ? CAST.Declarator.structIdentifier(CAST.Expression.variable(customType.bpfName.name())) : CAST.Declarator.identifier(customType.bpfName.name()), f -> customType.fieldName.name(), () -> customType.cCode.isEmpty() ? Optional.empty() : Optional.of(CAST.Statement.verbatim(customType.cCode))));
    }

    private DefinedTypes getDefinedTypes(java.util.List<TypeElement> innerTypeElements) {
        return new DefinedTypes(this, innerTypeElements, this::typeToFieldName);
    }

    private DefinedTypes.SpecFieldName typeToFieldName(TypeElement typeElement) {
        String name = typeElement.getEnclosingElement().equals(this.outerTypeElement) ? typeElement.getSimpleName().toString() : typeElement.getQualifiedName().toString().replace(".", "__");
        return new DefinedTypes.SpecFieldName(NameUtil.toConstantCase(name));
    }

    java.util.List<MapDefinition> processDefinedMaps(TypeElement outerElement, Function<DefinedTypes.SpecFieldName, BPFTypeLike<?>> fieldToType, Function<BPFTypeLike<?>, DefinedTypes.SpecFieldName> typeToSpecFieldName) {
        return outerElement.getEnclosedElements().stream().filter(e -> e.getKind() == ElementKind.FIELD).map(e -> (VariableElement)e).filter(e -> AnnotationUtils.getAnnotationMirror(e.asType(), BPF_MAP_DEFINITION).isPresent()).map(f -> this.processMapDefiningField((VariableElement)f, fieldToType, typeToSpecFieldName)).filter(Objects::nonNull).toList();
    }

    @Nullable
    MapDefinition processMapDefiningField(VariableElement field, Function<DefinedTypes.SpecFieldName, BPFTypeLike<?>> fieldToType, Function<BPFTypeLike<?>, DefinedTypes.SpecFieldName> typeToSpecFieldName) {
        Optional<? extends AnnotationMirror> annotation = AnnotationUtils.getAnnotationMirror(field.asType(), BPF_MAP_DEFINITION);
        assert (annotation.isPresent());
        Integer maxEntries = AnnotationUtils.getAnnotationValue(annotation.get(), "maxEntries", 0);
        if (maxEntries == 0) {
            this.processingEnv.getMessager().printError("maxEntries must be set and larger than 0", field);
            return null;
        }
        TypeMirror type2 = field.asType();
        if (!(type2 instanceof DeclaredType)) {
            this.processingEnv.getMessager().printError("Field must be a declared type", field);
            return null;
        }
        DeclaredType declaredType = (DeclaredType)type2;
        java.util.List typeParams = declaredType.getTypeArguments().stream().map(t -> this.processBPFTypeRecordMemberType(field, AnnotationUtils.getAnnotationValuesForRecordMember(t), (TypeMirror)t).map(m -> m.toBPFType(mt -> (BPFTypeLike)fieldToType.apply(this.definedTypes.nameToSpecFieldName(this.definedTypes.nameToBPFName((DefinedTypes.JavaName)((Object)((Object)((Object)mt))))))))).toList();
        if (typeParams.stream().anyMatch((Predicate<Optional>)LambdaMetafactory.metafactory(null, null, null, (Ljava/lang/Object;)Z, isEmpty(), (Ljava/util/Optional;)Z)())) {
            java.util.List problematicFields = IntStream.range(0, typeParams.size()).filter(i -> ((Optional)typeParams.get(i)).isEmpty()).mapToObj(i -> declaredType.getTypeArguments().get(i)).toList();
            this.processingEnv.getMessager().printError("Type parameters must be valid: " + problematicFields.stream().map(TypeMirror::toString).collect(Collectors.joining(", ")) + " is not, maybe you missed an @Type annotation", field);
            return null;
        }
        java.util.List typeParameters = typeParams.stream().map(Optional::get).toList();
        Element mapType = this.processingEnv.getTypeUtils().asElement(type2);
        Optional<? extends AnnotationMirror> mapClassAnnotation = AnnotationUtils.getAnnotationMirror(this.processingEnv.getTypeUtils().asElement(type2), BPF_MAP_CLASS);
        if (mapClassAnnotation.isEmpty()) {
            this.processingEnv.getMessager().printError("Only BPFMapClass annotated classes can be used for map definitions, please annotate " + String.valueOf(mapType) + " directly", field);
            return null;
        }
        String cTemplate = AnnotationUtils.getAnnotationValue(mapClassAnnotation.get(), "cTemplate", "");
        if (cTemplate.isEmpty()) {
            this.processingEnv.getMessager().printError("cTemplate must be set for class", mapType);
            return null;
        }
        String javaTemplate = AnnotationUtils.getAnnotationValue(mapClassAnnotation.get(), "javaTemplate", "");
        if (javaTemplate.isEmpty()) {
            this.processingEnv.getMessager().printError("javaTemplate must be set for class", mapType);
            return null;
        }
        String fieldName = field.getSimpleName().toString();
        String className = mapType.toString();
        return new MapDefinition(field.getSimpleName().toString(), this.processBPFClassJavaTemplate(field, javaTemplate, typeParameters, maxEntries, fieldName, className, typeToSpecFieldName), this.processBPFClassCTemplate(field, cTemplate, typeParameters, maxEntries, fieldName, className, typeToSpecFieldName));
    }

    String processBPFClassJavaTemplate(VariableElement field, String javaTemplate, java.util.List<BPFTypeLike<?>> typeParams, Integer maxEntries, String fieldName, String className, Function<BPFTypeLike<?>, DefinedTypes.SpecFieldName> typeToSpecFieldName) {
        return "this." + String.valueOf(field.getSimpleName()) + " = recordMap(" + this.processBPFClassTemplate(javaTemplate, typeParams, maxEntries, fieldName, className, typeToSpecFieldName).strip() + ")";
    }

    CAST.Statement processBPFClassCTemplate(VariableElement field, String cTemplate, java.util.List<BPFTypeLike<?>> typeParameters, Integer maxEntries, String fieldName, String className, Function<BPFTypeLike<?>, DefinedTypes.SpecFieldName> typeToSpecFieldName) {
        String raw = this.processBPFClassTemplate(cTemplate, typeParameters, maxEntries, fieldName, className, typeToSpecFieldName);
        return new CAST.Statement.VerbatimStatement(raw);
    }

    String processBPFClassTemplate(String template, java.util.List<BPFTypeLike<?>> typeParams, int maxEntries, String fieldName, String className, Function<BPFTypeLike<?>, DefinedTypes.SpecFieldName> typeToSpecFieldName) {
        java.util.List classNames = typeParams.stream().map(BPFTypeLike::getJavaName).map(DefinedTypes.JavaName::toString).toList();
        java.util.List cTypeNames = typeParams.stream().map(BPFTypeLike::getBPFNameWithStructPrefixIfNeeded).toList();
        java.util.List bFields = typeParams.stream().map(t -> t.toJavaFieldSpecUse(tm2 -> ((DefinedTypes.SpecFieldName)((Object)((Object)((Object)typeToSpecFieldName.apply(BPFTypeLike.of(tm2)))))).name())).toList();
        String res = template;
        for (int i = typeParams.size(); i > 0; --i) {
            res = res.replace("$c" + i, (CharSequence)cTypeNames.get(i - 1)).replace("$j" + i, (CharSequence)classNames.get(i - 1)).replace("$b" + i, (CharSequence)bFields.get(i - 1));
        }
        return res.replace("$maxEntries", Integer.toString(maxEntries)).replace("$field", fieldName).replace("$class", className).replace("$fd", "getMapDescriptorByName(" + CAST.toStringLiteral(fieldName) + ")");
    }

    public static enum DataTypeKind {
        STRUCT,
        UNION,
        TYPEDEF,
        ENUM,
        NONE;

    }

    public record TypeProcessorResult(java.util.List<FieldSpec> fields, java.util.List<CAST.Statement.Define> defines, java.util.List<CAST.Statement> definingStatements, @Nullable CAST.Statement licenseDefinition, java.util.List<MapDefinition> mapDefinitions, java.util.List<GlobalVariableDefinition> globalVariableDefinitions, InterfaceAdditions additions) {
        @Nullable
        public CAST.Statement licenseDefinition() {
            return this.licenseDefinition;
        }
    }

    public record InterfaceAdditions(java.util.List<String> includes, java.util.List<String> before, java.util.List<String> after) {
    }

    @FunctionalInterface
    public static interface BPFTypeMirror {
        public BPFTypeLike<?> toBPFType(Function<DefinedTypes.JavaName, BPFTypeLike<?>> var1);
    }

    public record GlobalVariableDefinition(CAST.Statement globalVariable, String name, String typeField, String initializer) {
    }

    record StructProcResult(Optional<java.util.List<BPFType.UBPFStructMember<?, ?>>> members, BPFType.BPFStructType.SourceClassKind kind) {
    }

    record UBPFStructMemberPotentiallyInlineUnion(BPFType.UBPFStructMember<?, ?> member, Optional<Integer> inlineUnionId) {
    }

    public record CustomTypeInfo(TypeElement typeElement, DefinedTypes.JavaName javaName, DefinedTypes.BPFName bpfName, DefinedTypes.SpecFieldName fieldName, boolean isStruct, String cCode) {
    }

    public record MapDefinition(String javaFieldName, String javaFieldInitializer, CAST.Statement structDefinition) {
    }
}

