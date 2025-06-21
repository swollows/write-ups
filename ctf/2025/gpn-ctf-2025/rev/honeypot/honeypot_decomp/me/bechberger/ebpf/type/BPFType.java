/*
 * Decompiled with CFR 0.153-SNAPSHOT (d6f6758-dirty).
 * 
 * Could not load the following classes:
 *  java.lang.MatchException
 *  java.lang.foreign.Arena
 *  java.lang.foreign.MemoryLayout
 *  java.lang.foreign.MemorySegment
 *  java.lang.foreign.ValueLayout
 */
package me.bechberger.ebpf.type;

import com.squareup.javapoet.ClassName;
import com.squareup.javapoet.FieldSpec;
import com.squareup.javapoet.ParameterizedTypeName;
import java.lang.annotation.Annotation;
import java.lang.foreign.Arena;
import java.lang.foreign.MemoryLayout;
import java.lang.foreign.MemorySegment;
import java.lang.foreign.ValueLayout;
import java.math.BigInteger;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.IdentityHashMap;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import java.util.Optional;
import java.util.StringJoiner;
import java.util.function.BiFunction;
import java.util.function.Function;
import java.util.function.Supplier;
import java.util.stream.Collectors;
import java.util.stream.IntStream;
import javax.lang.model.element.Modifier;
import me.bechberger.cast.CAST;
import me.bechberger.ebpf.annotations.AnnotationInstances;
import me.bechberger.ebpf.annotations.CustomType;
import me.bechberger.ebpf.annotations.bpf.BuiltinBPFFunction;
import me.bechberger.ebpf.type.BoxHelper;
import me.bechberger.ebpf.type.Enum;
import me.bechberger.ebpf.type.Ptr;
import me.bechberger.ebpf.type.Typedef;
import me.bechberger.ebpf.type.Union;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

public sealed interface BPFType<T> {
    public static final String BPF_PACKAGE = "me.bechberger.ebpf.type";
    public static final String BPF_TYPE = "me.bechberger.ebpf.type.BPFType";
    public static final BPFType<Void> VOID = new BPFVoidType();

    public String bpfName();

    public MemoryLayout layout();

    public MemoryParser<T> parser();

    public MemorySetter<T> setter();

    default public long size() {
        return this.layout().byteSize();
    }

    public long alignment();

    private static long padSize(long size, long alignment) {
        return size + alignment - 1L & -alignment;
    }

    default public long sizePadded() {
        return BPFType.padSize(this.layout().byteSize(), this.alignment());
    }

    public AnnotatedClass javaClass();

    default public Optional<? extends CAST> toCDeclaration() {
        return Optional.empty();
    }

    default public Optional<? extends CAST.Statement> toCDeclarationStatement() {
        return Optional.empty();
    }

    default public CAST.Declarator toCUse() {
        return CAST.Declarator.identifier(this.bpfName());
    }

    default public Optional<BiFunction<String, Function<BPFType<?>, String>, FieldSpec>> toFieldSpecGenerator() {
        return Optional.empty();
    }

    default public String toJavaUse() {
        return BPFInlineUnionType.cts(this.javaClass().klass);
    }

    default public String toJavaUseInGenerics() {
        return BPFInlineUnionType.cts(this.toJavaUse());
    }

    public String toJavaFieldSpecUse(Function<BPFType<?>, String> var1);

    default public T parseMemory(MemorySegment segment) {
        return this.parser().parse(segment);
    }

    default public void setMemory(MemorySegment segment, T obj) {
        this.setter().store(segment, obj);
    }

    default public MemorySegment allocate(Arena arena, T obj) {
        MemorySegment segment = arena.allocate(this.layout());
        this.setMemory(segment, obj);
        return segment;
    }

    default public MemorySegment allocate(Arena arena) {
        return arena.allocate(this.layout());
    }

    default public WrappedBPFType<T> alignTo(int bytes) {
        return new WrappedBPFType(this).alignTo(bytes);
    }

    public record AnnotatedClass(String klass, List<Annotation> annotations) {
        public AnnotatedClass(Class<?> klass, List<Annotation> annotations) {
            this(BPFInlineUnionType.cts(klass.getName()), annotations);
        }

        public String toString() {
            if (this.annotations.isEmpty()) {
                return this.klass;
            }
            return this.annotations.stream().map(Annotation::toString).collect(Collectors.joining(" ")) + " " + this.klass;
        }
    }

    public static final class BPFInlineUnionType<T>
    extends BPFUnionType<InlineUnion> {
        private final List<BPFInlineUnionMember<T, ?>> inlineMembers;
        private final AnnotatedClass structClass;
        private final BPFStructType.SourceClassKind sourceClassKind;

        public BPFInlineUnionType(String bpfName, List<BPFInlineUnionMember<T, ?>> inlineMembers, AnnotatedClass structClass, BPFStructType.SourceClassKind sourceClassKind) {
            super(bpfName, inlineMembers.stream().map(BPFInlineUnionMember::toUnionMember).toList(), new AnnotatedClass(InlineUnion.class, (List<Annotation>)List.of()), m -> (InlineUnion)new InlineUnion().init((Map<String, Object>)m), false);
            this.inlineMembers = inlineMembers;
            this.structClass = structClass;
            this.sourceClassKind = sourceClassKind;
        }

        @Override
        public Optional<BiFunction<String, Function<BPFType<?>, String>, FieldSpec>> toFieldSpecGenerator() {
            return Optional.of((fieldName, typeToSpecName) -> {
                String className = this.structClass.klass;
                ClassName baseType = ClassName.get(BPFType.BPF_PACKAGE, "BPFType.BPFInlineUnionType", new String[0]);
                ParameterizedTypeName fieldType = ParameterizedTypeName.get(baseType, ClassName.get("", className, new String[0]));
                String memberExpression = this.inlineMembers.stream().map(m -> "new me.bechberger.ebpf.type.BPFType.BPFInlineUnionMember<" + className + ", " + m.type().toJavaUseInGenerics() + ">(\"" + m.name() + "\", " + m.type().toJavaFieldSpecUse((Function<BPFType<?>, String>)typeToSpecName) + ", (" + className + " u) -> (" + m.type().toJavaUseInGenerics() + ") (Object)u." + m.name() + (this.sourceClassKind == BPFStructType.SourceClassKind.RECORD ? "()" : "") + ")").collect(Collectors.joining(", "));
                ClassName bpfType = ClassName.get(BPFType.BPF_PACKAGE, "BPFType", new String[0]);
                return FieldSpec.builder(fieldType, fieldName, new Modifier[0]).addModifiers(Modifier.FINAL, Modifier.STATIC).initializer("new $T<>($S, java.util.List.of($L), new $T.AnnotatedClass($T.class, java.util.List.of()), $L)", baseType, this.bpfName(), memberExpression, bpfType, ClassName.get("", className, new String[0]), BPFInlineUnionType.cts(BPFStructType.SourceClassKind.class) + "." + this.sourceClassKind.name()).build();
            });
        }

        private String createTypeExpression(Function<BPFType<?>, String> typeToSpecFieldName) {
            String tmpName = "_________NAME";
            String fieldStr = this.toFieldSpecGenerator().get().apply(tmpName, typeToSpecFieldName).toString();
            String res = fieldStr.split(tmpName + " = ", 2)[1].trim();
            return res.substring(0, res.length() - 1);
        }

        @Override
        public Optional<CAST.Declarator> toCDeclaration() {
            return Optional.empty();
        }

        @Override
        public Optional<CAST.Statement> toCDeclarationStatement() {
            return Optional.empty();
        }

        @Override
        public CAST.Declarator toCUse() {
            List membs = this.members().stream().map(BPFUnionMember::toCUnionMember).toList();
            return CAST.Declarator.inlineUnion(membs);
        }

        BPFInlineUnionMember<T, ?> getInlineMember(String memberName) {
            return (BPFInlineUnionMember)((Object)this.inlineMembers.stream().filter(m -> m.name().equals(memberName)).findFirst().orElseThrow());
        }

        public String javaExpressionToAccessMember(String parentExpression, String memberName) {
            return "((" + BPFInlineUnionType.cts(InlineUnion.class) + ")" + parentExpression + ").get(\"" + memberName + "\")";
        }

        public List<Map.Entry<String, BPFInlineUnionMember<T, ?>>> javaExpressionToAccessMembers(String parentExpression) {
            return this.inlineMembers.stream().map(m -> Map.entry((Object)this.javaExpressionToAccessMember(parentExpression, m.name()), (Object)m)).toList();
        }

        public String javaExpressionToCreateInlineUnion(Function<String, String> fieldAccessor) {
            return "new " + BPFInlineUnionType.cts(InlineUnion.class) + "().init(java.util.Map.ofEntries(" + this.inlineMembers.stream().map(m -> "java.util.Map.entry(\"" + m.name() + "\", " + (String)fieldAccessor.apply(m.name()) + ")").collect(Collectors.joining(", ")) + "))";
        }

        static String cts(Class<?> klass) {
            return BPFInlineUnionType.cts(klass.getName());
        }

        static String cts(String klass) {
            return klass.replace('$', '.');
        }

        @Override
        public String toJavaFieldSpecUse(Function<BPFType<?>, String> typeToSpecFieldName) {
            return this.createTypeExpression(typeToSpecFieldName);
        }
    }

    @FunctionalInterface
    public static interface MemoryParser<T> {
        public T parse(MemorySegment var1);
    }

    @FunctionalInterface
    public static interface MemorySetter<T> {
        public void store(MemorySegment var1, T var2);
    }

    public record WrappedBPFType<T>(BPFType<T> type, long alignment) implements BPFType<T>
    {
        public WrappedBPFType(BPFType<T> type2) {
            this(type2, (int)type2.alignment());
        }

        @Override
        public WrappedBPFType<T> alignTo(int bytes) {
            return new WrappedBPFType<T>(this.type, bytes);
        }

        @Override
        public MemoryLayout layout() {
            return this.type.layout().withByteAlignment(this.alignment);
        }

        @Override
        public MemoryParser<T> parser() {
            return this.type.parser();
        }

        @Override
        public MemorySetter<T> setter() {
            return this.type.setter();
        }

        @Override
        public long size() {
            return BPFType.padSize(this.type.size(), this.alignment);
        }

        @Override
        public String bpfName() {
            return this.type.bpfName();
        }

        @Override
        public AnnotatedClass javaClass() {
            return this.type.javaClass();
        }

        @Override
        public String toJavaUse() {
            return this.type.toJavaUse();
        }

        @Override
        public String toJavaUseInGenerics() {
            return this.type.toJavaUseInGenerics();
        }

        @Override
        public String toJavaFieldSpecUse(Function<BPFType<?>, String> typeToSpecFieldName) {
            return this.type.toJavaFieldSpecUse(typeToSpecFieldName);
        }

        @Override
        public Optional<? extends CAST> toCDeclaration() {
            return this.type.toCDeclaration();
        }

        @Override
        public Optional<? extends CAST.Statement> toCDeclarationStatement() {
            return this.type.toCDeclarationStatement();
        }

        @Override
        public CAST.Declarator toCUse() {
            return this.type.toCUse();
        }

        @Override
        public Optional<BiFunction<String, Function<BPFType<?>, String>, FieldSpec>> toFieldSpecGenerator() {
            return this.type.toFieldSpecGenerator();
        }
    }

    public static final class BPFVoidType
    implements BPFType<Void> {
        @Override
        public String bpfName() {
            return "void";
        }

        @Override
        public MemoryLayout layout() {
            return ValueLayout.JAVA_BYTE;
        }

        @Override
        public MemoryParser<Void> parser() {
            return segment -> new Void();
        }

        @Override
        public MemorySetter<Void> setter() {
            return (segment, obj) -> {};
        }

        @Override
        public long alignment() {
            return 1L;
        }

        @Override
        public AnnotatedClass javaClass() {
            return new AnnotatedClass(Void.class, (List<Annotation>)List.of());
        }

        @Override
        public String toJavaFieldSpecUse(Function<BPFType<?>, String> typeToSpecFieldName) {
            return "me.bechberger.ebpf.type.BPFType.VOID";
        }

        @Override
        public String toJavaUse() {
            return "void";
        }

        @Override
        public String toJavaUseInGenerics() {
            return "?";
        }
    }

    public record Void() {
    }

    public static final class BPFUnionFromMemory<S>
    implements BPFUnion<S> {
        @Nullable
        private final S shared;
        private final Map<String, Object> possibleMembers;
        @Nullable
        String current = null;

        public BPFUnionFromMemory(@Nullable S shared, Map<String, Object> possibleMembers) {
            this.shared = shared;
            this.possibleMembers = possibleMembers;
        }

        @Override
        public <T> T get(String name) {
            return (T)Objects.requireNonNull(this.possibleMembers.get(name));
        }

        @Override
        public <T> void set(String name, T value) {
            this.possibleMembers.put(name, value);
            this.setCurrent(name);
        }

        @Override
        @Nullable
        public S shared() {
            return this.shared;
        }

        @Override
        @Nullable
        public String current() {
            return this.current;
        }

        @Override
        public void setCurrent(String current) {
            if (!this.possibleMembers.containsKey(current)) {
                throw new IllegalArgumentException("Union does not have member " + current);
            }
            this.current = current;
        }

        public boolean equals(Object obj) {
            if (obj == this) {
                return true;
            }
            if (obj == null || obj.getClass() != this.getClass()) {
                return false;
            }
            BPFUnionFromMemory that = (BPFUnionFromMemory)obj;
            return Objects.equals(this.shared, that.shared) && Objects.equals(this.possibleMembers, that.possibleMembers);
        }
    }

    public static interface BPFUnion<S> {
        @Nullable
        public S shared();

        public <T> T get(String var1);

        public <T> void set(String var1, T var2);

        @Nullable
        public String current();

        public void setCurrent(String var1);
    }

    public record BPFUnionTypeOld<S>(String bpfName, @Nullable BPFType<S> shared, List<BPFUnionMember<?, ?>> members) implements BPFType<BPFUnion<S>>
    {
        @Override
        public MemoryLayout layout() {
            return MemoryLayout.sequenceLayout((long)this.size(), (MemoryLayout)ValueLayout.JAVA_BYTE);
        }

        @Override
        public long size() {
            return this.members.stream().mapToLong(member -> member.type.size()).max().orElseThrow();
        }

        @Override
        public long alignment() {
            return this.members.stream().mapToLong(member -> member.type.alignment()).max().orElse(1L);
        }

        @Override
        public MemoryParser<BPFUnion<S>> parser() {
            return segment -> {
                HashMap<String, Object> possibleMembers = new HashMap<String, Object>();
                for (BPFUnionMember<?, ?> member : this.members) {
                    try {
                        possibleMembers.put(member.name(), member.type.parseMemory(segment));
                    } catch (IllegalArgumentException illegalArgumentException) {}
                }
                return new BPFUnionFromMemory<Object>((this.shared != null ? (Object)this.shared.parseMemory(segment) : null), (Map<String, Object>)possibleMembers);
            };
        }

        @Override
        public MemorySetter<BPFUnion<S>> setter() {
            return (segment, union) -> {
                if (union.current() == null) {
                    throw new IllegalArgumentException("Union must have a current member");
                }
                BPFUnionMember current = (BPFUnionMember)((Object)((Object)this.members().stream().filter(m -> m.name.equals(union.current())).findFirst().orElseThrow()));
                current.type.setMemory(segment, union.get(union.current()));
            };
        }

        @Override
        public AnnotatedClass javaClass() {
            return new AnnotatedClass(BPFUnion.class, (List<Annotation>)List.of());
        }

        @Override
        public String toJavaFieldSpecUse(Function<BPFType<?>, String> typeToSpecFieldName) {
            throw new UnsupportedOperationException();
        }

        @Nullable
        public BPFType<S> shared() {
            return this.shared;
        }
    }

    public static final class BPFEnumType<T extends Enum<?>>
    implements BPFType<T> {
        private final String bpfName;
        private final BPFType<?> memberType;
        private final List<BPFEnumMember> members;
        private final AnnotatedClass javaClass;
        private final Function<Integer, T> indexToEnum;
        private final Map<Long, Integer> memberValueToIndex;

        public BPFEnumType(String bpfName, List<BPFEnumMember> members, AnnotatedClass javaClass, Function<Integer, T> indexToEnum) {
            this(bpfName, BPFIntType.UINT32, members, javaClass, indexToEnum);
        }

        public BPFEnumType(String bpfName, BPFType<?> memberType, List<BPFEnumMember> members, AnnotatedClass javaClass, Function<Integer, T> indexToEnum) {
            if (memberType.size() > 8L) {
                throw new IllegalArgumentException("Enum member type must be 8 bytes or less");
            }
            this.bpfName = bpfName;
            this.memberType = memberType;
            this.members = members;
            this.javaClass = javaClass;
            this.indexToEnum = indexToEnum;
            this.memberValueToIndex = IntStream.range(0, members.size()).boxed().collect(Collectors.toMap(i -> ((BPFEnumMember)((Object)((Object)members.get((int)i)))).value(), i -> i));
        }

        @Override
        public MemoryLayout layout() {
            return this.memberType.layout();
        }

        @Override
        public long size() {
            return this.memberType.size();
        }

        @Override
        public long alignment() {
            return this.memberType.alignment();
        }

        public BPFEnumMember getMember(String memberName) {
            return (BPFEnumMember)((Object)this.members.stream().filter(m -> m.name().equals(memberName)).findFirst().orElseThrow());
        }

        @Override
        public MemoryParser<T> parser() {
            return segment -> {
                Object val = this.memberType.parseMemory(segment);
                if (!(val instanceof Number)) {
                    throw new RuntimeException("Enum value must be a number");
                }
                Number number = (Number)val;
                long value = number.longValue();
                Integer index2 = this.memberValueToIndex.get(value);
                if (index2 == null) {
                    throw new RuntimeException("Unknown enum value " + value);
                }
                return (Enum)this.indexToEnum.apply(index2);
            };
        }

        @Override
        public MemorySetter<T> setter() {
            return (segment, member) -> {
                long val = this.members.get(((java.lang.Enum)((Object)member)).ordinal()).value();
                switch ((int)this.memberType.size()) {
                    case 1: {
                        if (this.memberType.javaClass().klass.contains("Character")) {
                            segment.set(ValueLayout.JAVA_BYTE, 0L, (byte)val);
                            break;
                        }
                        segment.set(ValueLayout.JAVA_BYTE, 0L, (byte)val);
                        break;
                    }
                    case 2: {
                        segment.set(ValueLayout.JAVA_SHORT, 0L, (short)val);
                        break;
                    }
                    case 4: {
                        segment.set(ValueLayout.JAVA_INT, 0L, (int)val);
                        break;
                    }
                    case 8: {
                        segment.set(ValueLayout.JAVA_LONG, 0L, val);
                    }
                }
            };
        }

        public int hashCode() {
            return Objects.hash(new Object[]{this.bpfName, this.members, this.javaClass});
        }

        public boolean equals(Object obj) {
            if (obj == this) {
                return true;
            }
            if (obj == null || obj.getClass() != this.getClass()) {
                return false;
            }
            BPFEnumType that = (BPFEnumType)obj;
            return Objects.equals(this.bpfName, that.bpfName) && Objects.equals(this.members, that.members) && Objects.equals((Object)this.javaClass, (Object)that.javaClass);
        }

        @Override
        public Optional<CAST.Declarator> toCDeclaration() {
            return Optional.of(CAST.Declarator._enum(CAST.Expression.variable(this.bpfName), this.members.stream().map(m -> m.toCEnumMember(this.memberType)).toList()));
        }

        @Override
        public Optional<CAST.Statement> toCDeclarationStatement() {
            return this.toCDeclaration().map(d -> CAST.Statement.declarationStatement(d, null));
        }

        @Override
        public CAST.Declarator toCUse() {
            return CAST.Declarator.enumIdentifier(CAST.Expression.variable(this.bpfName));
        }

        @Override
        public Optional<BiFunction<String, Function<BPFType<?>, String>, FieldSpec>> toFieldSpecGenerator() {
            return Optional.of((fieldName, typeToSpecName) -> {
                String className = this.javaClass.klass;
                ClassName baseType = ClassName.get(BPFType.BPF_PACKAGE, "BPFType.BPFEnumType", new String[0]);
                ParameterizedTypeName fieldType = ParameterizedTypeName.get(baseType, ClassName.get("", className, new String[0]));
                String memberExpression = this.members.stream().map(m -> "new me.bechberger.ebpf.type.BPFType.BPFEnumMember(\"" + m.name() + "\", \"" + m.cName() + "\", " + m.value() + "L)").collect(Collectors.joining(", "));
                ClassName bpfType = ClassName.get(BPFType.BPF_PACKAGE, "BPFType", new String[0]);
                return FieldSpec.builder(fieldType, fieldName, new Modifier[0]).addModifiers(Modifier.FINAL, Modifier.STATIC).initializer("new $T<>($S, $L, java.util.List.of($L), new $T.AnnotatedClass($T.class, java.util.List.of()), index -> $T.values()[index])", baseType, this.bpfName, this.memberType.toJavaFieldSpecUse((Function<BPFType<?>, String>)typeToSpecName), memberExpression, bpfType, ClassName.get("", className, new String[0]), ClassName.get("", className, new String[0])).build();
            });
        }

        @Override
        public String toJavaUse() {
            return this.javaClass.klass;
        }

        @Override
        public String toJavaFieldSpecUse(Function<BPFType<?>, String> typeToSpecFieldName) {
            return typeToSpecFieldName.apply(this);
        }

        @Override
        public String bpfName() {
            return this.bpfName;
        }

        @Override
        public AnnotatedClass javaClass() {
            return this.javaClass;
        }

        public String toString() {
            return "BPFEnumType[bpfName=" + this.bpfName + ", members=" + String.valueOf(this.members) + ", javaClass=" + String.valueOf((Object)this.javaClass) + "]";
        }

        public T fromValue(long value) {
            return (T)((Enum)this.indexToEnum.apply(this.memberValueToIndex.get(value)));
        }

        public long toValue(T value) {
            return this.members.get(((java.lang.Enum)value).ordinal()).value();
        }
    }

    public record BPFEnumMember(String name, String cName, long value) {
        CAST.Declarator.EnumMember toCEnumMember(BPFType<?> memberType) {
            return CAST.Declarator.enumMember(CAST.Expression.variable(this.cName), memberType.size() == 8L ? CAST.Expression.constant(this.value) : CAST.Expression.constant((int)this.value));
        }
    }

    public record BPFInlineUnionMember<P, T>(String name, BPFType<T> type, Function<P, T> getter) {
        BPFUnionMember<InlineUnion, T> toUnionMember() {
            return new BPFUnionMember<InlineUnion, Object>(this.name, this.type, m -> m.map.get(this.name));
        }
    }

    public static final class InlineUnion
    extends Union {
        private Map<String, Object> map;

        @Override
        public <U extends Union> U init(Map<String, Object> originalValues) {
            this.map = originalValues;
            return (U)this;
        }

        public <T> T get(String name) {
            return (T)this.map.get(name);
        }
    }

    public static sealed class BPFUnionType<T extends Union>
    implements BPFType<T>
    permits BPFInlineUnionType {
        private final String bpfName;
        private final List<BPFUnionMember<T, ?>> members;
        final AnnotatedClass javaClass;
        private final Function<Map<String, Object>, T> constructor;
        private final boolean typedefed;

        public BPFUnionType(String bpfName, List<BPFUnionMember<T, ?>> members, AnnotatedClass javaClass, Function<Map<String, Object>, T> constructor, boolean typedefed) {
            this.bpfName = bpfName;
            this.members = members;
            this.javaClass = javaClass;
            this.constructor = constructor;
            this.typedefed = typedefed;
        }

        public BPFUnionType(String bpfName, List<BPFUnionMember<T, ?>> members, AnnotatedClass javaClass, Function<Map<String, Object>, T> constructor) {
            this(bpfName, members, javaClass, constructor, false);
        }

        @Override
        public MemoryLayout layout() {
            return MemoryLayout.sequenceLayout((long)this.size(), (MemoryLayout)ValueLayout.JAVA_BYTE);
        }

        @Override
        public long size() {
            return this.members.stream().mapToLong(member -> member.type.size()).max().orElseThrow();
        }

        @Override
        public long alignment() {
            return this.members.stream().mapToLong(member -> member.type.alignment()).max().orElse(1L);
        }

        public BPFUnionMember getMember(String memberName) {
            return (BPFUnionMember)((Object)this.members.stream().filter(m -> m.name().equals(memberName)).findFirst().orElseThrow());
        }

        @Override
        public MemoryParser<T> parser() {
            return segment -> {
                HashMap possibleMembers = new HashMap();
                for (BPFUnionMember<T, ?> member : this.members) {
                    try {
                        possibleMembers.put(member.name(), member.type.parseMemory(segment));
                    } catch (IllegalArgumentException illegalArgumentException) {}
                }
                if (possibleMembers.isEmpty()) {
                    throw new IllegalArgumentException("Union must have atleast one member set");
                }
                return (Union)this.constructor.apply(possibleMembers);
            };
        }

        @Override
        public MemorySetter<T> setter() {
            return (segment, union) -> {
                List membersToSet = this.members.stream().map(member -> {
                    Object currentValue = BoxHelper.box(member.getter.apply(union));
                    if (union.originalValues != null && union.originalValues.containsKey(member.name())) {
                        return new FieldValueChanged((BPFUnionMember<?, ?>)((Object)((Object)member)), currentValue, union.originalValues.get(member.name()) != currentValue);
                    }
                    if (currentValue instanceof Number) {
                        Number number = (Number)currentValue;
                        return new FieldValueChanged((BPFUnionMember<?, ?>)((Object)((Object)member)), currentValue, number.longValue() != 0L);
                    }
                    if (currentValue instanceof Boolean) {
                        Boolean bool = (Boolean)currentValue;
                        return new FieldValueChanged((BPFUnionMember<?, ?>)((Object)((Object)member)), currentValue, bool);
                    }
                    return new FieldValueChanged((BPFUnionMember<?, ?>)((Object)((Object)member)), currentValue, currentValue != null);
                }).filter(f -> f.changed).toList();
                if (membersToSet.size() > 1) {
                    System.err.println("Union must have exactly one member set of " + String.valueOf(union));
                }
                if (membersToSet.isEmpty()) {
                    return;
                }
                FieldValueChanged member2 = (FieldValueChanged)((Object)((Object)membersToSet.getFirst()));
                member2.member.type.setMemory(segment, BoxHelper.box(member2.value));
            };
        }

        public int hashCode() {
            return Objects.hash(new Object[]{this.bpfName, this.members, this.javaClass});
        }

        public boolean equals(Object obj) {
            if (obj == this) {
                return true;
            }
            if (obj == null || obj.getClass() != this.getClass()) {
                return false;
            }
            BPFUnionType that = (BPFUnionType)obj;
            return Objects.equals(this.bpfName, that.bpfName) && Objects.equals(this.members, that.members) && Objects.equals((Object)this.javaClass, (Object)that.javaClass);
        }

        @Override
        public Optional<CAST.Declarator> toCDeclaration() {
            List membs = this.members.stream().map(BPFUnionMember::toCUnionMember).toList();
            if (this.typedefed) {
                return Optional.of(CAST.Declarator.typedefedUnion(CAST.Expression.variable(this.bpfName), membs));
            }
            return Optional.of(CAST.Declarator.union(CAST.Expression.variable(this.bpfName), membs));
        }

        @Override
        public Optional<CAST.Statement> toCDeclarationStatement() {
            if (this.typedefed) {
                return this.toCDeclaration().map(d -> CAST.Statement.typedef(d, null));
            }
            return this.toCDeclaration().map(d -> CAST.Statement.declarationStatement(d, null));
        }

        @Override
        public CAST.Declarator toCUse() {
            return CAST.Declarator.unionIdentifier(CAST.Expression.variable(this.bpfName));
        }

        @Override
        public Optional<BiFunction<String, Function<BPFType<?>, String>, FieldSpec>> toFieldSpecGenerator() {
            return Optional.of((fieldName, typeToSpecName) -> {
                String className = this.javaClass.klass;
                ClassName baseType = ClassName.get(BPFType.BPF_PACKAGE, "BPFType.BPFUnionType", new String[0]);
                ParameterizedTypeName fieldType = ParameterizedTypeName.get(baseType, ClassName.get("", className, new String[0]));
                String memberExpression = this.members.stream().map(m -> "new me.bechberger.ebpf.type.BPFType.BPFUnionMember<" + className + ", " + m.type().toJavaUseInGenerics() + ">(\"" + m.name() + "\", " + (String)typeToSpecName.apply(m.type()) + ", (" + className + " u) -> (" + m.type().toJavaUseInGenerics() + ") (Object)u." + m.name() + ")").collect(Collectors.joining(", "));
                ClassName bpfType = ClassName.get(BPFType.BPF_PACKAGE, "BPFType", new String[0]);
                return FieldSpec.builder(fieldType, fieldName, new Modifier[0]).addModifiers(Modifier.FINAL, Modifier.STATIC).initializer("new $T<>($S, java.util.List.of($L), new $T.AnnotatedClass($T.class, java.util.List.of()), members -> new $T().init(members), $L)", baseType, this.bpfName, memberExpression, bpfType, ClassName.get("", className, new String[0]), ClassName.get("", className, new String[0]), this.typedefed).build();
            });
        }

        @Override
        public String toJavaUse() {
            return this.javaClass.klass;
        }

        @Override
        public String toJavaFieldSpecUse(Function<BPFType<?>, String> typeToSpecFieldName) {
            return typeToSpecFieldName.apply(this);
        }

        @Override
        public String bpfName() {
            return this.bpfName;
        }

        public List<BPFUnionMember<T, ?>> members() {
            return this.members;
        }

        @Override
        public AnnotatedClass javaClass() {
            return this.javaClass;
        }

        public Function<Map<String, Object>, T> constructor() {
            return this.constructor;
        }

        public boolean typedefed() {
            return this.typedefed;
        }

        public String toString() {
            return "BPFUnionType[bpfName=" + this.bpfName + ", members=" + String.valueOf(this.members) + ", javaClass=" + String.valueOf((Object)this.javaClass) + ", constructor=" + String.valueOf(this.constructor) + ", typedefed=" + this.typedefed + "]";
        }

        record FieldValueChanged(BPFUnionMember<?, ?> member, Object value, boolean changed) {
        }
    }

    public record BPFUnionMember<P, T>(String name, BPFType<T> type, Function<P, T> getter) {
        CAST.Declarator.UnionMember toCUnionMember() {
            return CAST.Declarator.unionMember(this.type.toCUse(), CAST.Expression.variable(this.name));
        }
    }

    public record BPFTypedef<W, T extends Typedef<W>>(String bpfName, BPFType<W> wrapped, AnnotatedClass javaClass, Function<W, T> constructor, @Nullable Class<?> wrappedClass) implements BPFType<T>
    {
        public BPFTypedef(String bpfName, BPFType<W> wrapped, AnnotatedClass javaClass, Function<W, T> constructor) {
            this(bpfName, wrapped, javaClass, constructor, null);
        }

        @Override
        public MemoryLayout layout() {
            return this.wrapped.layout();
        }

        @Override
        public MemoryParser<T> parser() {
            return segment -> (Typedef)this.constructor.apply(BoxHelper.unbox(this.wrapped.parser().parse(segment), this.wrappedClass));
        }

        @Override
        public MemorySetter<T> setter() {
            return (segment, obj) -> this.wrapped.setter().store(segment, BoxHelper.box(obj.val()));
        }

        @Override
        public long alignment() {
            return this.wrapped.alignment();
        }

        @Override
        public Optional<CAST> toCDeclaration() {
            return Optional.of(CAST.Statement.typedef(this.wrapped.toCUse(), CAST.Expression.variable(this.bpfName)));
        }

        @Override
        public Optional<CAST.Statement> toCDeclarationStatement() {
            return Optional.of(CAST.Statement.typedef(this.wrapped.toCUse(), CAST.Expression.variable(this.bpfName)));
        }

        @Override
        public long size() {
            return this.wrapped.size();
        }

        @Override
        public long sizePadded() {
            return this.wrapped.sizePadded();
        }

        @Override
        public CAST.Declarator toCUse() {
            return CAST.Declarator.identifier(this.bpfName);
        }

        @Override
        public Optional<BiFunction<String, Function<BPFType<?>, String>, FieldSpec>> toFieldSpecGenerator() {
            return Optional.of((fieldName, typeToSpecName) -> {
                String className = this.javaClass.klass;
                ClassName baseType = ClassName.get(BPFType.BPF_PACKAGE, "BPFType.BPFTypedef", new String[0]);
                ParameterizedTypeName fieldType = ParameterizedTypeName.get(baseType, ClassName.get("", this.wrapped.toJavaUseInGenerics(), new String[0]), ClassName.get("", className, new String[0]));
                ClassName bpfType = ClassName.get(BPFType.BPF_PACKAGE, "BPFType", new String[0]);
                String wrappedFieldName = (String)typeToSpecName.apply(this.wrapped);
                return FieldSpec.builder(fieldType, fieldName, new Modifier[0]).addModifiers(Modifier.FINAL, Modifier.STATIC).initializer("new $T<>($S, $L, new $T.AnnotatedClass($T.class, java.util.List.of()), ($L o) -> new $L(o), $L.class)", baseType, this.bpfName, wrappedFieldName, bpfType, ClassName.get("", className, new String[0]), this.wrapped.toJavaUseInGenerics(), className, this.wrapped.toJavaUse()).build();
            });
        }

        @Override
        public String toJavaUse() {
            return this.javaClass.klass;
        }

        @Override
        public String toJavaUseInGenerics() {
            return this.javaClass.klass;
        }

        @Override
        public String toJavaFieldSpecUse(Function<BPFType<?>, String> typeToSpecFieldName) {
            return typeToSpecFieldName.apply(this);
        }

        @Nullable
        public Class<?> wrappedClass() {
            return this.wrappedClass;
        }
    }

    public record BPFInternalTypedef<T>(String bpfName, BPFType<T> wrapped) implements BPFType<T>
    {
        @Override
        public MemoryLayout layout() {
            return this.wrapped.layout();
        }

        @Override
        public MemoryParser<T> parser() {
            return this.wrapped.parser();
        }

        @Override
        public MemorySetter<T> setter() {
            return this.wrapped.setter();
        }

        @Override
        public long alignment() {
            return this.wrapped.alignment();
        }

        @Override
        public AnnotatedClass javaClass() {
            return this.wrapped.javaClass();
        }

        @Override
        public Optional<CAST> toCDeclaration() {
            return Optional.of(CAST.Statement.typedef(this.wrapped.toCUse(), CAST.Expression.variable(this.bpfName)));
        }

        @Override
        public Optional<CAST.Statement> toCDeclarationStatement() {
            return Optional.of(CAST.Statement.typedef(this.wrapped.toCUse(), CAST.Expression.variable(this.bpfName)));
        }

        @Override
        public String toJavaFieldSpecUse(Function<BPFType<?>, String> typeToSpecFieldName) {
            return "new me.bechberger.ebpf.type.BPFType.BPFInternalTypedef<>(\"" + this.bpfName + "\", " + typeToSpecFieldName.apply(this.wrapped) + ")";
        }
    }

    public record StringType(int length) implements BPFType<String>
    {
        @Override
        public String bpfName() {
            return this.length == -1 ? "char*" : "char[" + this.length + "]";
        }

        @Override
        public MemoryLayout layout() {
            return MemoryLayout.sequenceLayout((long)this.length, (MemoryLayout)ValueLayout.JAVA_BYTE);
        }

        @Override
        public MemoryParser<String> parser() {
            if (this.length == -1) {
                throw new RuntimeException("Cannot parse string with dynamic length");
            }
            return segment -> segment.getString(0L);
        }

        @Override
        public MemorySetter<String> setter() {
            if (this.length == -1) {
                throw new RuntimeException("Cannot set string with dynamic length");
            }
            return (segment, obj) -> {
                byte[] bytes = obj.getBytes();
                if (bytes.length + 1 < this.length) {
                    segment.setString(0L, obj);
                } else {
                    byte[] dest = new byte[this.length];
                    System.arraycopy(bytes, 0, dest, 0, this.length - 1);
                    dest[this.length - 1] = 0;
                    for (int i = 0; i < this.length; ++i) {
                        segment.set(ValueLayout.JAVA_BYTE, (long)i, dest[i]);
                    }
                }
            };
        }

        @Override
        public long alignment() {
            return BPFIntType.CHAR.alignment();
        }

        @Override
        public AnnotatedClass javaClass() {
            if (this.length == -1) {
                return new AnnotatedClass(String.class, (List<Annotation>)List.of());
            }
            return new AnnotatedClass(String.class, (List<Annotation>)List.of((Object)AnnotationInstances.size(this.length)));
        }

        @Override
        public Optional<CAST.Declarator> toCDeclaration() {
            return Optional.empty();
        }

        @Override
        public CAST.Declarator toCUse() {
            if (this.length == -1) {
                return CAST.Declarator.pointer(BPFIntType.CHAR.toCUse());
            }
            return CAST.Declarator.array(BPFIntType.CHAR.toCUse(), CAST.Expression.constant(this.length));
        }

        @Override
        public String toJavaFieldSpecUse(Function<BPFType<?>, String> typeToSpecFieldName) {
            return "new me.bechberger.ebpf.type.BPFType.StringType(" + this.length + ")";
        }
    }

    public record BPFPointerType<T>(@Nullable BPFType<T> valueType) implements BPFType<Ptr<T>>
    {
        @Override
        public String bpfName() {
            return (this.valueType == null ? "void" : this.valueType.bpfName()) + "*";
        }

        @Override
        public MemoryLayout layout() {
            return ValueLayout.ADDRESS.withTargetLayout((MemoryLayout)MemoryLayout.sequenceLayout((long)0L, (MemoryLayout)(this.valueType == null ? ValueLayout.JAVA_BYTE : this.valueType.layout())));
        }

        @Override
        public MemoryParser<Ptr<T>> parser() {
            throw new UnsupportedOperationException("Not implemented");
        }

        @Override
        public MemorySetter<Ptr<T>> setter() {
            throw new UnsupportedOperationException("Not implemented");
        }

        @Override
        public long alignment() {
            return this.layout().byteAlignment();
        }

        @Override
        public AnnotatedClass javaClass() {
            return new AnnotatedClass(Ptr.class, (List<Annotation>)List.of());
        }

        @Override
        public Optional<CAST.Declarator> toCDeclaration() {
            return Optional.empty();
        }

        @Override
        public CAST.Declarator toCUse() {
            return this.valueType == null ? CAST.Declarator.voidPointer() : CAST.Declarator.pointer(this.valueType.toCUse());
        }

        @Override
        public String toJavaUse() {
            return Ptr.class.getCanonicalName();
        }

        @Override
        public String toJavaUseInGenerics() {
            return Ptr.class.getCanonicalName() + "<" + (this.valueType == null ? "?" : this.valueType.toJavaUseInGenerics()) + ">";
        }

        @Override
        public String toJavaFieldSpecUse(Function<BPFType<?>, String> typeToSpecFieldName) {
            return "new me.bechberger.ebpf.type.BPFType.BPFPointerType<" + (this.valueType == null ? "" : this.valueType.toJavaUseInGenerics()) + ">(" + (this.valueType == null ? "null" : this.valueType.toJavaFieldSpecUse(typeToSpecFieldName)) + ")";
        }

        @Nullable
        public BPFType<T> valueType() {
            return this.valueType;
        }
    }

    public record BPFArrayType<E>(String bpfName, BPFType<E> memberType, int length) implements BPFType<E[]>
    {
        @Override
        public MemoryLayout layout() {
            return MemoryLayout.sequenceLayout((long)this.length, (MemoryLayout)this.paddedMemberLayout());
        }

        public MemoryLayout paddedMemberLayout() {
            long padding = this.memberType.sizePadded() - this.memberType.size();
            if (padding == 0L) {
                return this.memberType.layout();
            }
            return MemoryLayout.structLayout((MemoryLayout[])new MemoryLayout[]{this.memberType.layout(), MemoryLayout.paddingLayout((long)padding)});
        }

        @Override
        public MemoryParser<E[]> parser() {
            return segment -> IntStream.range(0, this.length).mapToObj(i -> this.memberType.parseMemory(segment.asSlice((long)i * this.memberType.sizePadded()))).toArray();
        }

        @Override
        public MemorySetter<E[]> setter() {
            return (segment, list) -> {
                if (((Object[])list).length != this.length) {
                    throw new IllegalArgumentException("Array must have length " + this.length);
                }
                for (int i = 0; i < this.length; ++i) {
                    this.memberType.setMemory(segment.asSlice((long)i * this.memberType.sizePadded()), list[i]);
                }
            };
        }

        @Override
        public long alignment() {
            return this.memberType.alignment();
        }

        @Override
        public AnnotatedClass javaClass() {
            return new AnnotatedClass(this.memberType.toJavaUse() + "[]", (List<Annotation>)List.of((Object)AnnotationInstances.size(this.length)));
        }

        public long getOffsetAtIndex(int index2) {
            return (long)index2 * this.memberType.sizePadded();
        }

        public static <E> BPFArrayType<E> of(BPFType<E> memberType, int length) {
            return new BPFArrayType<E>(memberType.bpfName() + "[" + length + "]", memberType, length);
        }

        @Override
        public Optional<CAST.Declarator> toCDeclaration() {
            return Optional.empty();
        }

        @Override
        public CAST.Declarator toCUse() {
            return CAST.Declarator.array(this.memberType.toCUse(), CAST.Expression.constant(this.length));
        }

        @Override
        public String toJavaUse() {
            return this.memberType.toJavaUse() + "[]";
        }

        @Override
        public String toJavaFieldSpecUse(Function<BPFType<?>, String> typeToSpecFieldName) {
            return "(BPFType)new me.bechberger.ebpf.type.BPFType.BPFArrayType<>(\"" + this.bpfName + "\", " + this.memberType.toJavaFieldSpecUse(typeToSpecFieldName) + ", " + this.length + ")";
        }
    }

    public static final class BPFStructType<T>
    implements BPFType<T> {
        private final String bpfName;
        private final MemoryLayout layout;
        private final long alignment;
        private final List<BPFStructMember<T, ?>> members;
        private final AnnotatedClass javaClass;
        private final Function<List<Object>, T> constructor;
        private final SourceClassKind sourceClassKind;
        private final boolean typedefed;

        public BPFStructType(String bpfName, List<BPFStructMember<T, ?>> members, AnnotatedClass javaClass, Function<List<Object>, T> constructor) {
            this(bpfName, members, javaClass, constructor, SourceClassKind.RECORD, false);
        }

        public BPFStructType(String bpfName, List<BPFStructMember<T, ?>> members, AnnotatedClass javaClass, Function<List<Object>, T> constructor, SourceClassKind sourceClassKind, boolean typedefed) {
            this.bpfName = bpfName;
            this.layout = this.createLayout(members);
            this.alignment = members.stream().mapToLong(m -> m.type.alignment()).max().orElse(1L);
            this.members = members;
            this.javaClass = javaClass;
            this.constructor = constructor;
            this.sourceClassKind = sourceClassKind;
            this.typedefed = typedefed;
            HashSet<String> names = new HashSet<String>();
            for (BPFStructMember<T, ?> member : members) {
                if (!names.add(member.name())) {
                    throw new IllegalArgumentException("Duplicate member name " + member.name());
                }
                BPFType bPFType = member.type;
                if (!(bPFType instanceof BPFInlineUnionType)) continue;
                BPFInlineUnionType unionType = (BPFInlineUnionType)bPFType;
                for (BPFUnionMember bPFUnionMember : unionType.members()) {
                    if (names.add(bPFUnionMember.name())) continue;
                    throw new IllegalArgumentException("Duplicate member name in inline union " + bPFUnionMember.name());
                }
            }
        }

        public static <T> BPFStructType<T> autoLayout(String bpfName, List<UBPFStructMember<T, ?>> members, AnnotatedClass javaClass, Function<List<Object>, T> constructor) {
            return BPFStructType.autoLayout(bpfName, members, javaClass, constructor, SourceClassKind.RECORD);
        }

        public static <T> BPFStructType<T> autoLayout(String bpfName, List<UBPFStructMember<T, ?>> members, AnnotatedClass javaClass, Function<List<Object>, T> constructor, SourceClassKind sourceClassKind) {
            return BPFStructType.autoLayout(bpfName, members, javaClass, constructor, sourceClassKind, false);
        }

        public static <T> BPFStructType<T> autoLayout(String bpfName, List<UBPFStructMember<T, ?>> members, AnnotatedClass javaClass, Function<List<Object>, T> constructor, SourceClassKind sourceClassKind, boolean typedefed) {
            return new BPFStructType<T>(bpfName, BPFStructType.layoutMembers(members), javaClass, constructor, sourceClassKind, typedefed);
        }

        private MemoryLayout createLayout(List<BPFStructMember<T, ?>> members) {
            ArrayList<Object> layouts = new ArrayList<Object>();
            for (int i = 0; i < members.size(); ++i) {
                BPFStructMember<T, ?> member = members.get(i);
                if (i != 0) {
                    BPFStructMember<T, ?> prev = members.get(i - 1);
                    long padding = (long)member.offset - ((long)prev.offset + prev.type.size());
                    if (padding > 0L) {
                        layouts.add(MemoryLayout.paddingLayout((long)padding));
                    }
                } else if (member.offset > 0) {
                    layouts.add(MemoryLayout.paddingLayout((long)member.offset));
                }
                layouts.add(member.type.layout().withName(member.name()));
            }
            return MemoryLayout.structLayout((MemoryLayout[])layouts.toArray(new MemoryLayout[0]));
        }

        private static <T> List<BPFStructMember<T, ?>> layoutMembers(List<UBPFStructMember<T, ?>> members) {
            ArrayList result = new ArrayList();
            long offset = 0L;
            for (UBPFStructMember<T, ?> member : members) {
                offset = BPFType.padSize(offset, member.type.alignment());
                result.add(member.position((int)offset));
                offset += member.type.size();
            }
            return result;
        }

        @Override
        public MemoryLayout layout() {
            return this.layout;
        }

        @Override
        public long alignment() {
            return this.alignment;
        }

        public int getOffsetOfMember(String memberName) {
            return this.getMember(memberName).offset();
        }

        public BPFStructMember<T, ?> getMember(String memberName) {
            return (BPFStructMember)((Object)this.members.stream().filter(m -> m.name().equals(memberName)).findFirst().orElseThrow());
        }

        @Override
        public long size() {
            return this.layout.byteSize();
        }

        @Override
        public MemoryParser<T> parser() {
            return segment -> {
                List args = this.members.stream().map(member -> member.type.parseMemory(segment.asSlice((long)member.offset))).toList();
                return this.constructor.apply(args);
            };
        }

        @Override
        public MemorySetter<T> setter() {
            return (segment, obj) -> {
                for (BPFStructMember<T, ?> member : this.members) {
                    Object arr = BoxHelper.box(member.getter.apply(obj));
                    member.type.setMemory(segment.asSlice((long)member.offset), arr);
                }
            };
        }

        @Override
        public String bpfName() {
            return this.bpfName;
        }

        public List<BPFStructMember<T, ?>> members() {
            return this.members;
        }

        @Override
        public AnnotatedClass javaClass() {
            return this.javaClass;
        }

        public Function<List<Object>, T> constructor() {
            return this.constructor;
        }

        public boolean equals(Object obj) {
            if (obj == this) {
                return true;
            }
            if (obj == null || obj.getClass() != this.getClass()) {
                return false;
            }
            BPFStructType that = (BPFStructType)obj;
            return Objects.equals(this.bpfName, that.bpfName) && Objects.equals(this.members, that.members) && Objects.equals((Object)this.javaClass, (Object)that.javaClass) && Objects.equals(this.constructor, that.constructor);
        }

        public int hashCode() {
            return Objects.hash(new Object[]{this.bpfName, this.members, this.javaClass, this.constructor});
        }

        public String toString() {
            return "BPFStructType[bpfName=" + this.bpfName + ", members=" + String.valueOf(this.members) + ", javaClass=" + String.valueOf((Object)this.javaClass) + ", constructor=" + String.valueOf(this.constructor) + "]";
        }

        @Override
        public Optional<CAST.Declarator> toCDeclaration() {
            ArrayList<CAST.Declarator.StructMember> cmembers = new ArrayList<CAST.Declarator.StructMember>();
            int paddingCount = 0;
            long offset = 0L;
            for (BPFStructMember<T, ?> member : this.members) {
                if ((offset = BPFType.padSize(offset, member.type.alignment())) < (long)member.offset) {
                    cmembers.add(BPFStructMember.createPaddingStructMember(paddingCount, (int)((long)member.offset - offset)));
                    ++paddingCount;
                }
                cmembers.add(member.toCStructMember());
                offset += member.type.size();
            }
            if (this.typedefed) {
                return Optional.of(CAST.Declarator.typedefedStruct(CAST.Expression.variable(this.bpfName), cmembers));
            }
            return Optional.of(CAST.Declarator.struct(CAST.Expression.variable(this.bpfName), cmembers));
        }

        @Override
        public Optional<CAST.Statement> toCDeclarationStatement() {
            return this.toCDeclaration().map(d -> CAST.Statement.declarationStatement(d, null));
        }

        @Override
        public CAST.Declarator toCUse() {
            if (this.typedefed) {
                return CAST.Declarator.identifier(this.bpfName);
            }
            return CAST.Declarator.structIdentifier(CAST.Expression.variable(this.bpfName));
        }

        @Override
        public Optional<BiFunction<String, Function<BPFType<?>, String>, FieldSpec>> toFieldSpecGenerator() {
            return Optional.of((fieldName, typeToSpecName) -> {
                String className = this.javaClass.klass;
                ClassName bpfStructType = ClassName.get(BPFType.BPF_PACKAGE, "BPFType.BPFStructType", new String[0]);
                ParameterizedTypeName fieldType = ParameterizedTypeName.get(bpfStructType, ClassName.get("", className, new String[0]));
                Function<BPFStructMember, String> accessor = m -> {
                    BPFType patt0$temp = m.type;
                    if (patt0$temp instanceof BPFInlineUnionType) {
                        BPFInlineUnionType inlineUnion = (BPFInlineUnionType)patt0$temp;
                        return "o -> (" + m.type.toJavaUse() + ")" + inlineUnion.javaExpressionToCreateInlineUnion(field -> switch (this.sourceClassKind.ordinal()) {
                            default -> throw new MatchException(null, null);
                            case 0 -> "o." + field + "()";
                            case 1, 2 -> "o." + field;
                        });
                    }
                    return switch (this.sourceClassKind.ordinal()) {
                        default -> throw new MatchException(null, null);
                        case 0 -> className + "::" + m.name();
                        case 1, 2 -> "o -> (" + m.type().toJavaUseInGenerics() + ")(Object)o." + m.name;
                    };
                };
                String memberExpression = this.members.stream().map(m -> "new me.bechberger.ebpf.type.BPFType.UBPFStructMember<" + className + ", " + m.type().toJavaUseInGenerics() + ">(\"" + m.name() + "\", " + (String)typeToSpecName.apply(m.type()) + ", " + (String)accessor.apply((BPFStructMember)((Object)((Object)((Object)m)))) + ", null," + (String)(m.offset == 0 ? "java.util.Optional.empty()" : "java.util.Optional.of(" + m.offset + ")") + ")").collect(Collectors.joining(", "));
                ClassName bpfType = ClassName.get(BPFType.BPF_PACKAGE, "BPFType", new String[0]);
                String constructorExpr = switch (this.sourceClassKind.ordinal()) {
                    default -> throw new MatchException(null, null);
                    case 0, 2 -> {
                        String s;
                        BPFInlineUnionType inlineUnion;
                        BPFType patt0$temp;
                        StringJoiner joiner = new StringJoiner(", ");
                        for (int i = 0; i < this.members.size(); ++i) {
                            BPFStructMember<T, ?> member = this.members.get(i);
                            patt0$temp = member.type;
                            if (patt0$temp instanceof BPFInlineUnionType) {
                                inlineUnion = (BPFInlineUnionType)patt0$temp;
                                inlineUnion.javaExpressionToAccessMembers("fields.get(" + i + ")").stream().map(e -> "(" + ((BPFInlineUnionMember)((Object)((Object)((Object)((Object)e.getValue()))))).type().toJavaUse() + ")me.bechberger.ebpf.type.BoxHelper.unbox(" + (String)e.getKey() + ", " + ((BPFInlineUnionMember)((Object)((Object)((Object)((Object)e.getValue()))))).type.toJavaUse() + ".class)").forEach(joiner::add);
                                continue;
                            }
                            s = "(" + member.type.toJavaUse() + ")me.bechberger.ebpf.type.BoxHelper.unbox(fields.get(" + i + "), " + member.type.toJavaUse() + ".class)";
                            joiner.add(s);
                        }
                        String creatorExpr = joiner.toString();
                        yield "new " + className + "(" + creatorExpr + ")";
                    }
                    case 1 -> {
                        String s;
                        BPFInlineUnionType inlineUnion;
                        BPFType patt0$temp;
                        StringJoiner joiner = new StringJoiner("; ");
                        for (BPFStructMember<T, ?> m : this.members) {
                            patt0$temp = m.type;
                            if (patt0$temp instanceof BPFInlineUnionType) {
                                inlineUnion = (BPFInlineUnionType)patt0$temp;
                                for (Map.Entry var15_15 : inlineUnion.javaExpressionToAccessMembers("fields.get(" + this.members.indexOf(m) + ")")) {
                                    String javaType = ((BPFInlineUnionMember)((Object)((Object)var15_15.getValue()))).type().toJavaUse();
                                    joiner.add("o." + ((BPFInlineUnionMember)((Object)((Object)var15_15.getValue()))).name() + " = me.bechberger.ebpf.type.BoxHelper.unbox(" + (String)var15_15.getKey() + "," + javaType + ".class)");
                                }
                                continue;
                            }
                            s = "o." + m.name() + " = me.bechberger.ebpf.type.BoxHelper.unbox(fields.get(" + this.members.indexOf(m) + "), " + m.type().toJavaUse() + ".class)";
                            joiner.add(s);
                        }
                        yield "{ var o = new " + className + "(); " + joiner.toString() + "; return o; }";
                    }
                };
                return FieldSpec.builder(fieldType, fieldName, new Modifier[0]).addModifiers(Modifier.FINAL, Modifier.STATIC).initializer("$T.autoLayout($S, java.util.List.of($L), new $T.AnnotatedClass($T.class, java.util.List.of()), fields -> $L, $L, $L)", bpfStructType, this.bpfName, memberExpression, bpfType, ClassName.get("", className, new String[0]), constructorExpr, SourceClassKind.class.getName().replace('$', '.') + "." + String.valueOf((Object)this.sourceClassKind), this.typedefed).build();
            });
        }

        @Override
        public String toJavaUse() {
            return this.javaClass.klass;
        }

        @Override
        public String toJavaFieldSpecUse(Function<BPFType<?>, String> typeToSpecFieldName) {
            return typeToSpecFieldName.apply(this);
        }

        public static enum SourceClassKind {
            RECORD,
            CLASS,
            CLASS_WITH_CONSTRUCTOR;

        }
    }

    public record UBPFStructMember<P, T>(String name, BPFType<T> type, Function<P, T> getter, @Nullable String ebpfSize, Optional<Integer> offset) {
        public UBPFStructMember(String name, BPFType<T> type2, Function<P, T> getter, @Nullable String ebpfSize) {
            this(name, type2, getter, ebpfSize, Optional.empty());
        }

        public UBPFStructMember(String name, BPFType<T> type2, Function<P, T> getter) {
            this(name, type2, getter, null);
        }

        public BPFStructMember<P, T> position(int offset) {
            if (this.offset.isPresent() && offset > this.offset.get()) {
                throw new IllegalArgumentException("Offset " + offset + " is greater than byte offset " + String.valueOf(this.offset.get()));
            }
            return new BPFStructMember<P, T>(this.name, this.type, this.offset.orElse(offset), this.getter, this.ebpfSize);
        }

        @Nullable
        public String ebpfSize() {
            return this.ebpfSize;
        }
    }

    public record BPFStructMember<P, T>(String name, BPFType<T> type, int offset, Function<P, T> getter, @Nullable String ebpfSize) {
        public BPFStructMember(String name, BPFType<T> type2, int offset, Function<P, T> getter) {
            this(name, type2, offset, getter, null);
        }

        CAST.Declarator.StructMember toCStructMember() {
            return CAST.Declarator.structMember(this.type.toCUse(), CAST.Expression.variable(this.name), this.ebpfSize == null ? null : CAST.Expression.verbatim(this.ebpfSize));
        }

        static CAST.Declarator.StructMember createPaddingStructMember(int paddingId, int paddingSize) {
            return CAST.Declarator.structMember(CAST.Declarator.array(CAST.Declarator.identifier("char"), CAST.Expression.constant(paddingSize)), CAST.Expression.variable("__padding" + paddingId));
        }

        @Nullable
        public String ebpfSize() {
            return this.ebpfSize;
        }
    }

    public static class FixedWidthInteger
    extends Number
    implements Comparable<FixedWidthInteger> {
        private final int width;
        private final boolean signed;
        private final byte[] content;

        public FixedWidthInteger(int width, boolean signed, byte[] content) {
            this.width = width;
            this.content = content;
            this.signed = signed;
        }

        public FixedWidthInteger(int width, boolean signed, String val, int radix) {
            this(width, signed, new BigInteger(val, radix).toByteArray());
        }

        public static FixedWidthInteger fromBigInteger(int width, boolean signed, BigInteger val) {
            return new FixedWidthInteger(width, signed, val.toByteArray());
        }

        public static FixedWidthInteger valueOf(int width, boolean signed, long val) {
            return FixedWidthInteger.fromBigInteger(width, signed, BigInteger.valueOf(val));
        }

        public boolean isSigned() {
            return this.signed;
        }

        public int getWidth() {
            return this.width;
        }

        public byte[] getContent() {
            return this.content;
        }

        public BigInteger toBigInteger() {
            if (this.signed) {
                return new BigInteger(this.content);
            }
            return new BigInteger(1, this.content);
        }

        @Override
        public int compareTo(@NotNull FixedWidthInteger other) {
            return this.toBigInteger().compareTo(other.toBigInteger());
        }

        @Override
        public int intValue() {
            return this.toBigInteger().intValue();
        }

        @Override
        public long longValue() {
            return this.toBigInteger().longValue();
        }

        @Override
        public float floatValue() {
            return this.toBigInteger().floatValue();
        }

        @Override
        public double doubleValue() {
            return this.toBigInteger().doubleValue();
        }

        public boolean equals(Object obj) {
            FixedWidthInteger integer;
            return obj instanceof FixedWidthInteger && (integer = (FixedWidthInteger)obj).compareTo(this) == 0;
        }
    }

    public record BPFIntType<I>(String bpfName, MemoryLayout layout, MemoryParser<I> parser, MemorySetter<I> setter, AnnotatedClass javaClass, int encoding) implements BPFType<I>
    {
        static final int ENCODING_SIGNED = 1;
        static final int ENCODING_CHAR = 2;
        static final int ENCODING_BOOL = 4;
        private static final Map<AnnotatedClass, BPFType<?>> registeredTypes = new HashMap();
        private static final Map<BPFType<?>, String> typeToSpecName = new IdentityHashMap();
        public static final BPFIntType<Boolean> BOOL = BPFIntType.createType("bool", "BOOL", Boolean.class, (MemoryLayout)ValueLayout.JAVA_BYTE, segment -> segment.get(ValueLayout.JAVA_BYTE, 0L) == 1, (segment, obj) -> segment.set(ValueLayout.JAVA_BYTE, 0L, obj != false ? (byte)1 : (byte)0), false);
        public static final BPFIntType<Byte> CHAR = BPFIntType.createType("u8", "CHAR", Byte.class, (MemoryLayout)ValueLayout.JAVA_BYTE, segment -> segment.get(ValueLayout.JAVA_BYTE, 0L), (segment, obj) -> segment.set(ValueLayout.JAVA_BYTE, 0L, obj.byteValue()), false);
        public static final BPFIntType<Byte> SIGNED_CHAR = BPFIntType.createType("s8", "SIGNED_CHAR", Byte.class, (MemoryLayout)ValueLayout.JAVA_BYTE, segment -> segment.get(ValueLayout.JAVA_BYTE, 0L), (segment, obj) -> segment.set(ValueLayout.JAVA_BYTE, 0L, obj.byteValue()), true);
        public static final BPFInternalTypedef<Byte> UINT8 = new BPFInternalTypedef<Byte>("u8", CHAR);
        public static final BPFIntType<Byte> INT8 = BPFIntType.createType("s8", "INT8", Byte.class, (MemoryLayout)ValueLayout.JAVA_BYTE, segment -> segment.get(ValueLayout.JAVA_BYTE, 0L), (segment, obj) -> segment.set(ValueLayout.JAVA_BYTE, 0L, obj.byteValue()), true);
        public static final BPFIntType<Short> INT16 = BPFIntType.createType("s16", "INT16", Short.class, (MemoryLayout)ValueLayout.JAVA_SHORT, segment -> segment.get(ValueLayout.JAVA_SHORT, 0L), (segment, obj) -> segment.set(ValueLayout.JAVA_SHORT, 0L, obj.shortValue()), true);
        public static final BPFIntType<Short> UINT16 = BPFIntType.createType("u16", "UINT16", Short.class, (MemoryLayout)ValueLayout.JAVA_SHORT, segment -> segment.get(ValueLayout.JAVA_SHORT, 0L), (segment, obj) -> segment.set(ValueLayout.JAVA_SHORT, 0L, obj.shortValue()), false);
        public static final BPFIntType<Integer> INT32 = BPFIntType.createType("s32", "INT32", Integer.class, (MemoryLayout)ValueLayout.JAVA_INT, segment -> segment.get(ValueLayout.JAVA_INT, 0L), (segment, obj) -> segment.set(ValueLayout.JAVA_INT, 0L, obj.intValue()), true);
        public static final BPFIntType<Integer> UINT32 = BPFIntType.createType("u32", "UINT32", Integer.class, (MemoryLayout)ValueLayout.JAVA_INT, segment -> segment.get(ValueLayout.JAVA_INT, 0L), (segment, obj) -> segment.set(ValueLayout.JAVA_INT, 0L, obj.intValue()), false);
        public static final BPFIntType<Long> INT64 = BPFIntType.createType("s64", "INT64", Long.class, (MemoryLayout)ValueLayout.JAVA_LONG, segment -> segment.get(ValueLayout.JAVA_LONG, 0L), (segment, obj) -> segment.set(ValueLayout.JAVA_LONG, 0L, obj.longValue()), true);
        public static final BPFIntType<Long> UINT64 = BPFIntType.createType("u64", "UINT64", Long.class, (MemoryLayout)ValueLayout.JAVA_LONG, segment -> segment.get(ValueLayout.JAVA_LONG, 0L), (segment, obj) -> segment.set(ValueLayout.JAVA_LONG, 0L, obj.longValue()), false);
        public static final BPFInternalTypedef<Long> UINT64_T = new BPFInternalTypedef<Long>("u64", UINT64);
        public static final BPFIntType<Int128> INT128 = BPFIntType.createType("__int128", "INT128", Int128.class, (MemoryLayout)MemoryLayout.structLayout((MemoryLayout[])new MemoryLayout[]{ValueLayout.JAVA_LONG, ValueLayout.JAVA_LONG}), segment -> new Int128(segment.get(ValueLayout.JAVA_LONG, 8L), segment.get(ValueLayout.JAVA_LONG, 0L)), (segment, obj) -> {
            segment.set(ValueLayout.JAVA_LONG, 0L, obj.lower());
            segment.set(ValueLayout.JAVA_LONG, 8L, obj.upper());
        }, true);
        public static final BPFIntType<UnsignedInt128> UINT128 = BPFIntType.createType("__int128 unsigned", "UINT128", UnsignedInt128.class, BPFIntType.INT128.layout, segment -> new UnsignedInt128(segment.get(ValueLayout.JAVA_LONG, 8L), segment.get(ValueLayout.JAVA_LONG, 0L)), (segment, obj) -> {
            segment.set(ValueLayout.JAVA_LONG, 0L, obj.lower());
            segment.set(ValueLayout.JAVA_LONG, 8L, obj.upper());
        }, false);
        public static final BPFIntType<Float> FLOAT = BPFIntType.createType("float", "FLOAT", Float.class, (MemoryLayout)ValueLayout.JAVA_FLOAT, segment -> Float.valueOf(segment.get(ValueLayout.JAVA_FLOAT, 0L)), (segment, obj) -> segment.set(ValueLayout.JAVA_FLOAT, 0L, obj.floatValue()), false);
        public static final BPFIntType<Double> DOUBLE = BPFIntType.createType("double", "DOUBLE", Double.class, (MemoryLayout)ValueLayout.JAVA_DOUBLE, segment -> segment.get(ValueLayout.JAVA_DOUBLE, 0L), (segment, obj) -> segment.set(ValueLayout.JAVA_DOUBLE, 0L, obj.doubleValue()), false);
        public static final BPFInternalTypedef<Long> POINTER = new BPFInternalTypedef<Long>("void*", UINT64);

        public boolean isSigned() {
            return (this.encoding & 1) != 0;
        }

        public boolean isChar() {
            return (this.encoding & 2) != 0;
        }

        public boolean isBool() {
            return (this.encoding & 4) != 0;
        }

        @Override
        public long alignment() {
            return this.size();
        }

        @Override
        public String toJavaUse() {
            return switch (this.javaClass.klass) {
                case "java.lang.Integer" -> "int";
                case "java.lang.Long" -> "long";
                case "java.lang.Short" -> "short";
                case "java.lang.Byte" -> "byte";
                case "java.lang.Boolean" -> "boolean";
                case "java.lang.Character" -> "char";
                case "java.lang.Float" -> "float";
                case "java.lang.Double" -> "double";
                default -> this.javaClass().klass;
            };
        }

        @Override
        public String toJavaUseInGenerics() {
            return switch (this.javaClass.klass) {
                case "int" -> "Integer";
                case "long" -> "Long";
                case "short" -> "Short";
                case "byte" -> "Byte";
                case "boolean" -> "Boolean";
                case "char" -> "Character";
                case "float" -> "Float";
                case "double" -> "Double";
                default -> this.javaClass().klass;
            };
        }

        @Override
        public String toJavaFieldSpecUse(Function<BPFType<?>, String> typeToSpecFieldName) {
            return this.getClass().getCanonicalName() + "." + Objects.requireNonNull(typeToSpecName.get(this));
        }

        private static <T> BPFIntType<T> createType(String bpfName, String specFieldName, Class<T> klass, MemoryLayout layout, MemoryParser<T> parser, MemorySetter<T> setter, boolean signed) {
            BPFIntType<T> type2 = new BPFIntType<T>(bpfName, layout, parser, setter, new AnnotatedClass(klass, (List<Annotation>)(signed ? List.of((Object)AnnotationInstances.UNSIGNED) : List.of())), signed ? 1 : 0);
            if (!registeredTypes.containsKey((Object)type2.javaClass())) {
                registeredTypes.put(type2.javaClass(), type2);
            }
            typeToSpecName.put(type2, specFieldName);
            return type2;
        }

        @CustomType(isStruct=false, name="__int128 unsigned", specFieldName="$outerClass.UINT128", constructorTemplate="(__int128 unsigned)(((__int128 unsigned)$arg1) << 64 | (__int128 unsigned)$arg2)")
        public record UnsignedInt128(long upper, long lower) {
            public UnsignedInt128(BigInteger value) {
                this(value.longValue(), value.shiftRight(64).longValue());
            }

            @BuiltinBPFFunction(value="(((__int128 unsigned)$arg1) << 64) | ($arg2)")
            public static UnsignedInt128 of(long upper, long lower) {
                return new UnsignedInt128(upper, lower);
            }

            public BigInteger toBigInteger() {
                return BigInteger.valueOf(this.upper).shiftLeft(64).add(BigInteger.valueOf(this.lower));
            }

            @BuiltinBPFFunction(value="(s64)(($this) >> 64)")
            public long upper() {
                return this.upper;
            }

            @BuiltinBPFFunction(value="(s64)($this)")
            public long lower() {
                return this.lower;
            }
        }

        @CustomType(isStruct=false, name="__int128", specFieldName="$outerClass.INT128", constructorTemplate="(__int128)(((__int128)$arg1) << 64 | (__int128) $arg2)")
        public record Int128(long upper, long lower) {
            public Int128(BigInteger value) {
                this(value.longValue(), value.shiftRight(64).longValue());
            }

            @BuiltinBPFFunction(value="(((__int128)$arg1) << 64) | ($arg2)")
            public static Int128 of(long upper, long lower) {
                return new Int128(upper, lower);
            }

            public BigInteger toBigInteger() {
                return BigInteger.valueOf(this.upper).shiftLeft(64).add(BigInteger.valueOf(this.lower));
            }

            @BuiltinBPFFunction(value="$this")
            public UnsignedInt128 toUnsigned() {
                return new UnsignedInt128(this.lower, this.upper);
            }

            @BuiltinBPFFunction(value="(s64)(($this) >> 64)")
            public long upper() {
                return this.upper;
            }

            @BuiltinBPFFunction(value="(s64)($this)")
            public long lower() {
                return this.lower;
            }
        }
    }

    public record CustomBPFType<T>(String javaName, String javaUse, String javaUseInGenerics, String bpfName, Supplier<CAST.Declarator> cUse, Function<Function<BPFType<?>, String>, String> specFieldNameCreator, Supplier<Optional<? extends CAST.Statement>> cDeclaration) implements BPFType<T>
    {
        @Override
        public MemoryLayout layout() {
            return MemoryLayout.structLayout((MemoryLayout[])new MemoryLayout[0]);
        }

        @Override
        public MemoryParser<T> parser() {
            return null;
        }

        @Override
        public MemorySetter<T> setter() {
            return null;
        }

        @Override
        public long alignment() {
            return 0L;
        }

        @Override
        public AnnotatedClass javaClass() {
            return null;
        }

        @Override
        public String toJavaFieldSpecUse(Function<BPFType<?>, String> typeToSpecFieldName) {
            return this.specFieldNameCreator.apply(typeToSpecFieldName);
        }

        @Override
        public Optional<? extends CAST.Statement> toCDeclaration() {
            return this.cDeclaration.get();
        }

        @Override
        public String toJavaUse() {
            return this.javaUse;
        }

        @Override
        public String toJavaUseInGenerics() {
            return this.javaUseInGenerics;
        }

        @Override
        public CAST.Declarator toCUse() {
            return this.cUse.get();
        }
    }
}

