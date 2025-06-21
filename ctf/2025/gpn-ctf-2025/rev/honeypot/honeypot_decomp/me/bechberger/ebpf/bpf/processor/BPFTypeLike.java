/*
 * Decompiled with CFR 0.153-SNAPSHOT (d6f6758-dirty).
 * 
 * Could not load the following classes:
 *  java.lang.MatchException
 *  java.lang.runtime.SwitchBootstraps
 */
package me.bechberger.ebpf.bpf.processor;

import java.lang.runtime.SwitchBootstraps;
import java.util.Objects;
import java.util.function.Function;
import me.bechberger.cast.CAST;
import me.bechberger.ebpf.bpf.processor.DefinedTypes;
import me.bechberger.ebpf.type.BPFType;
import me.bechberger.ebpf.type.Enum;
import me.bechberger.ebpf.type.Typedef;
import me.bechberger.ebpf.type.Union;
import org.jetbrains.annotations.Nullable;

public interface BPFTypeLike<T> {
    @Nullable
    public DefinedTypes.SpecFieldName getSpecFieldName(DefinedTypes var1);

    public DefinedTypes.JavaName getJavaName();

    public DefinedTypes.BPFName getBPFName();

    public String getBPFNameWithStructPrefixIfNeeded();

    public String toJavaFieldSpecUse(Function<BPFType<?>, String> var1);

    public String toJavaUse();

    public String toJavaUseInGenerics();

    public static <T> BPFTypeLike<T> of(BPFType<T> type2) {
        BPFType<T> bPFType = type2;
        Objects.requireNonNull(bPFType);
        BPFType<T> bPFType2 = bPFType;
        int n = 0;
        return switch (SwitchBootstraps.typeSwitch("typeSwitch", new Object[]{BPFType.BPFStructType.class}, bPFType2, (int)n)) {
            case 0 -> {
                BPFType.BPFStructType structType = (BPFType.BPFStructType)bPFType2;
                yield new TypeBackedBPFStructType(structType);
            }
            default -> new TypeBackedBPFStructType(type2);
        };
    }

    public BPFType.CustomBPFType<T> toCustomType();

    public static final class TypeBackedBPFStructType<T>
    extends TypeBackedBPFTypeLike<T> {
        public TypeBackedBPFStructType(BPFType.BPFStructType<T> type2) {
            super(type2);
        }
    }

    public static sealed class TypeBackedBPFTypeLike<T>
    implements BPFTypeLike<T>
    permits TypeBackedBPFStructType, TypeBackedBPFCustomType, TypeBackedBPFUnionType, TypeBackedBPFTypedef, TypeBackedBPFEnumType {
        final BPFType<T> type;

        public TypeBackedBPFTypeLike(BPFType<T> type2) {
            this.type = type2;
        }

        @Override
        @Nullable
        public DefinedTypes.SpecFieldName getSpecFieldName(DefinedTypes types) {
            return types.getSpecFieldName(new DefinedTypes.BPFName(this.type.bpfName())).orElseThrow(() -> new IllegalStateException("No spec field name for " + this.type.bpfName()));
        }

        @Override
        public BPFType.CustomBPFType<T> toCustomType() {
            return new BPFType.CustomBPFType(this.getJavaName().name(), this.toJavaUse(), this.toJavaUseInGenerics(), this.type.bpfName(), this.type::toCUse, this.type::toJavaFieldSpecUse, this.type::toCDeclarationStatement);
        }

        @Override
        public DefinedTypes.JavaName getJavaName() {
            return new DefinedTypes.JavaName(this.type);
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
        public DefinedTypes.BPFName getBPFName() {
            return new DefinedTypes.BPFName(this.type.bpfName());
        }

        @Override
        public String toJavaFieldSpecUse(Function<BPFType<?>, String> typeToSpecFieldName) {
            return this.type.toJavaFieldSpecUse(typeToSpecFieldName);
        }

        @Override
        public String getBPFNameWithStructPrefixIfNeeded() {
            return this.type.toCUse().toPrettyString();
        }
    }

    public static final class TypeBackedBPFEnumType<T extends Enum<?>>
    extends TypeBackedBPFTypeLike<T> {
        public TypeBackedBPFEnumType(BPFType.BPFEnumType<T> type2) {
            super(type2);
        }
    }

    public static final class TypeBackedBPFTypedef<W, T extends Typedef<W>>
    extends TypeBackedBPFTypeLike<T> {
        public TypeBackedBPFTypedef(BPFType.BPFTypedef<W, T> type2) {
            super(type2);
        }
    }

    public static final class TypeBackedBPFUnionType<T extends Union>
    extends TypeBackedBPFTypeLike<T> {
        public TypeBackedBPFUnionType(BPFType.BPFUnionType<T> type2) {
            super(type2);
        }
    }

    public static final class TypeBackedBPFCustomType<T>
    extends TypeBackedBPFTypeLike<T> {
        public TypeBackedBPFCustomType(BPFType.CustomBPFType<T> type2) {
            super(type2);
        }

        @Override
        public BPFType.CustomBPFType<T> toCustomType() {
            return (BPFType.CustomBPFType)this.type;
        }
    }

    public static final class VerbatimBPFOnlyType<T>
    implements BPFTypeLike<T> {
        final String bpfName;
        final PrefixKind prefixKind;

        public VerbatimBPFOnlyType(String bpfName, PrefixKind prefixKind) {
            this.bpfName = bpfName;
            this.prefixKind = prefixKind;
        }

        @Override
        public DefinedTypes.SpecFieldName getSpecFieldName(DefinedTypes types) {
            throw new UnsupportedOperationException();
        }

        @Override
        public DefinedTypes.JavaName getJavaName() {
            throw new UnsupportedOperationException();
        }

        @Override
        public DefinedTypes.BPFName getBPFName() {
            return new DefinedTypes.BPFName(this.bpfName);
        }

        @Override
        public String getBPFNameWithStructPrefixIfNeeded() {
            return switch (this.prefixKind.ordinal()) {
                default -> throw new MatchException(null, null);
                case 0 -> "struct " + this.bpfName;
                case 1 -> "union " + this.bpfName;
                case 2 -> "enum " + this.bpfName;
                case 3 -> this.bpfName;
            };
        }

        @Override
        public String toJavaFieldSpecUse(Function<BPFType<?>, String> typeToSpecFieldName) {
            throw new UnsupportedOperationException();
        }

        @Override
        public String toJavaUse() {
            throw new UnsupportedOperationException();
        }

        @Override
        public String toJavaUseInGenerics() {
            throw new UnsupportedOperationException();
        }

        @Override
        public BPFType.CustomBPFType<T> toCustomType() {
            return new BPFType.CustomBPFType(null, null, null, this.bpfName, () -> {
                CAST.PrimaryExpression.Variable name = CAST.Expression.variable(this.bpfName);
                return switch (this.prefixKind.ordinal()) {
                    default -> throw new MatchException(null, null);
                    case 0 -> new CAST.Declarator.StructIdentifierDeclarator(name);
                    case 1 -> new CAST.Declarator.UnionIdentifierDeclarator(name);
                    case 2 -> new CAST.Declarator.EnumIdentifierDeclarator(name);
                    case 3 -> new CAST.Declarator.IdentifierDeclarator(name);
                };
            }, null, null);
        }

        public static enum PrefixKind {
            STRUCT,
            UNION,
            ENUM,
            NORMAL;

        }
    }
}

