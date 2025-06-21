/*
 * Decompiled with CFR 0.153-SNAPSHOT (d6f6758-dirty).
 */
package me.bechberger.ebpf.bpf.processor;

import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Optional;
import java.util.function.Function;
import javax.lang.model.element.TypeElement;
import me.bechberger.ebpf.bpf.processor.TypeProcessor;
import me.bechberger.ebpf.type.BPFType;

public class DefinedTypes {
    private final TypeProcessor typeProcessor;
    private final Function<TypeElement, SpecFieldName> typeToFieldNameFunction;
    private final Map<JavaName, BPFName> nameToBPFName;
    private final Map<BPFName, JavaName> bpfNameToName;
    private final Map<TypeElement, SpecFieldName> typeToFieldName;
    private final Map<BPFName, SpecFieldName> nameToSpecFieldName;
    private final Map<SpecFieldName, BPFName> specFieldNameToName;
    private final Map<BPFName, TypeElement> nameToTypeElement;

    DefinedTypes(TypeProcessor typeProcessor, List<TypeElement> initialTypes, Function<TypeElement, SpecFieldName> typeToFieldNameFunction) {
        this.typeProcessor = typeProcessor;
        this.typeToFieldNameFunction = typeToFieldNameFunction;
        this.nameToBPFName = new HashMap<JavaName, BPFName>();
        this.bpfNameToName = new HashMap<BPFName, JavaName>();
        this.typeToFieldName = new HashMap<TypeElement, SpecFieldName>();
        this.nameToSpecFieldName = new HashMap<BPFName, SpecFieldName>();
        this.specFieldNameToName = new HashMap<SpecFieldName, BPFName>();
        this.nameToTypeElement = new HashMap<BPFName, TypeElement>();
        initialTypes.forEach(this::insertType);
    }

    public boolean isTypeDefined(TypeElement typeElement) {
        return this.typeToFieldName.containsKey(typeElement);
    }

    public boolean isNameDefined(BPFName name) {
        return this.nameToSpecFieldName.containsKey((Object)name);
    }

    public boolean isNameDefined(SpecFieldName name) {
        return this.specFieldNameToName.containsKey((Object)name);
    }

    public boolean isNameDefined(JavaName name) {
        return this.nameToTypeElement.containsKey((Object)name);
    }

    public Optional<SpecFieldName> getFieldName(TypeElement typeElement) {
        return Optional.ofNullable(this.typeToFieldName.get(typeElement));
    }

    public Optional<SpecFieldName> getSpecFieldName(BPFName name) {
        return Optional.ofNullable(this.nameToSpecFieldName.get((Object)name));
    }

    public SpecFieldName getOrCreateFieldName(TypeElement typeElement) {
        if (!this.typeToFieldName.containsKey(typeElement)) {
            this.insertType(typeElement);
        }
        return this.typeToFieldName.get(typeElement);
    }

    public void insertType(TypeElement typeElement, BPFName name, SpecFieldName fieldName) {
        if (this.nameToSpecFieldName.containsKey((Object)name)) {
            throw new IllegalArgumentException("Name " + String.valueOf((Object)name) + " already defined");
        }
        if (this.specFieldNameToName.containsKey((Object)fieldName)) {
            throw new IllegalArgumentException("Field " + String.valueOf((Object)fieldName) + " already defined");
        }
        this.typeToFieldName.put(typeElement, fieldName);
        this.nameToSpecFieldName.put(name, fieldName);
        this.specFieldNameToName.put(fieldName, name);
        this.nameToTypeElement.put(name, typeElement);
        JavaName javaName = new JavaName(typeElement);
        this.nameToBPFName.put(javaName, name);
        this.bpfNameToName.put(name, javaName);
    }

    private void insertType(TypeElement typeElement) {
        BPFName name = this.typeProcessor.getTypeRecordBpfName(typeElement);
        SpecFieldName fieldName = this.typeToFieldNameFunction.apply(typeElement);
        this.insertType(typeElement, name, fieldName);
    }

    public Optional<TypeElement> getTypeElement(BPFName name) {
        return Optional.ofNullable(this.nameToTypeElement.get((Object)name));
    }

    public String toString() {
        return this.typeToFieldName.toString();
    }

    public BPFName specFieldNameToName(SpecFieldName field) {
        if (this.specFieldNameToName.containsKey((Object)field)) {
            return this.specFieldNameToName.get((Object)field);
        }
        throw new IllegalArgumentException("Field " + String.valueOf((Object)field) + " not defined");
    }

    public SpecFieldName nameToSpecFieldName(BPFName name) {
        if (this.nameToSpecFieldName.containsKey((Object)name)) {
            return this.nameToSpecFieldName.get((Object)name);
        }
        throw new IllegalArgumentException("Name " + String.valueOf((Object)name) + " not defined");
    }

    public JavaName bpfNameToName(BPFName name) {
        if (this.bpfNameToName.containsKey((Object)name)) {
            return this.bpfNameToName.get((Object)name);
        }
        throw new IllegalArgumentException("Name " + String.valueOf((Object)name) + " not defined");
    }

    public BPFName nameToBPFName(JavaName name) {
        if (this.nameToBPFName.containsKey((Object)name)) {
            return this.nameToBPFName.get((Object)name);
        }
        throw new IllegalArgumentException("Name " + String.valueOf((Object)name) + " not defined");
    }

    public record SpecFieldName(String name) {
    }

    public record JavaName(String name) {
        JavaName(TypeElement clazz) {
            this(clazz.getQualifiedName().toString());
        }

        JavaName(BPFType<?> type2) {
            this(type2.javaClass().klass());
        }
    }

    public record BPFName(String name) {
    }
}

