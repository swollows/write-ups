/*
 * Decompiled with CFR 0.153-SNAPSHOT (d6f6758-dirty).
 * 
 * Could not load the following classes:
 *  java.lang.MatchException
 */
package me.bechberger.ebpf.bpf.processor;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.Optional;
import java.util.function.Consumer;
import java.util.stream.Collectors;
import javax.lang.model.AnnotatedConstruct;
import javax.lang.model.element.AnnotationMirror;
import javax.lang.model.element.AnnotationValue;
import javax.lang.model.element.ExecutableElement;
import javax.lang.model.element.VariableElement;
import javax.lang.model.type.ArrayType;

public class AnnotationUtils {
    public static final String SIZE_ANNOTATION = "me.bechberger.ebpf.annotations.Size";
    public static final String SIZES_ANNOTATION = "me.bechberger.ebpf.annotations.Sizes";
    public static final String UNSIGNED_ANNOTATION = "me.bechberger.ebpf.annotations.Unsigned";
    public static final String OFFSET_ANNOTATION = "me.bechberger.ebpf.annotations.Offset";

    static Optional<? extends AnnotationMirror> getAnnotationMirror(AnnotatedConstruct element, String annotationName) {
        List<? extends AnnotationMirror> annotations = AnnotationUtils.getAnnotationMirrors(element, annotationName);
        if (annotations.isEmpty()) {
            return Optional.empty();
        }
        if (annotations.size() > 1) {
            throw new IllegalStateException("Multiple annotations of type " + annotationName + " found on element " + String.valueOf(element));
        }
        return Optional.of((AnnotationMirror)annotations.getFirst());
    }

    static List<? extends AnnotationMirror> getAnnotationMirrors(AnnotatedConstruct element, String annotationName) {
        return element.getAnnotationMirrors().stream().filter(a -> a.getAnnotationType().asElement().toString().equals(annotationName)).toList();
    }

    static Map<String, Object> getAnnotationValues(AnnotationMirror annotation) {
        return annotation.getElementValues().entrySet().stream().collect(Collectors.toMap(e -> ((ExecutableElement)e.getKey()).toString(), Map.Entry::getValue));
    }

    static <T> T getAnnotationValue(AnnotationMirror annotation, String name, T defaultValue) {
        return (T)annotation.getElementValues().entrySet().stream().filter(e -> ((ExecutableElement)e.getKey()).getSimpleName().toString().equals(name)).map(e -> ((AnnotationValue)e.getValue()).getValue()).findFirst().orElse(defaultValue);
    }

    static boolean hasAnnotation(AnnotatedConstruct element, String annotationName) {
        return AnnotationUtils.getAnnotationMirror(element, annotationName).isPresent();
    }

    static AnnotationValues getAnnotationValuesForRecordMember(VariableElement element) {
        return AnnotationUtils.getAnnotationValuesForRecordMember(element.asType());
    }

    public static AnnotationValues getAnnotationValuesForRecordMember(AnnotatedConstruct element) {
        boolean unsigned = AnnotationUtils.hasAnnotation(element, UNSIGNED_ANNOTATION);
        ArrayList<Integer> sizes = new ArrayList<Integer>();
        Consumer<AnnotatedConstruct> process = con -> {
            List<? extends AnnotationMirror> sizeAnnotations = AnnotationUtils.getAnnotationMirrors(con, SIZE_ANNOTATION);
            for (AnnotationMirror annotationMirror : sizeAnnotations) {
                Optional optional = annotationMirror.getElementValues().entrySet().stream().findFirst();
                sizes.addFirst((Integer)((AnnotationValue)((Map.Entry)optional.orElseThrow()).getValue()).getValue());
            }
            List<? extends AnnotationMirror> sizesAnnotations = AnnotationUtils.getAnnotationMirrors(con, SIZES_ANNOTATION);
            for (AnnotationMirror annotationMirror : sizesAnnotations) {
                sizes.addAll(0, ((List)((AnnotationValue)annotationMirror.getElementValues().values().stream().findFirst().orElseThrow()).getValue()).stream().map(a -> AnnotationUtils.getAnnotationValue(a, "value", -1)).toList());
            }
        };
        process.accept(element);
        while (element instanceof ArrayType) {
            process.accept(((ArrayType)element).getComponentType());
            element = ((ArrayType)element).getComponentType();
        }
        Optional<Integer> offset = AnnotationUtils.getAnnotationMirror(element, OFFSET_ANNOTATION).map(a -> AnnotationUtils.getAnnotationValue(a, "value", 0));
        return new AnnotationValues(unsigned, sizes, offset);
    }

    public record AnnotationValues(boolean unsigned, List<Integer> size, Optional<Integer> offset) {
        AnnotationValues dropSize() {
            return new AnnotationValues(this.unsigned, this.size.subList(1, this.size.size()), this.offset);
        }

        AnnotationValues dropOffset() {
            return new AnnotationValues(this.unsigned, this.size, Optional.empty());
        }

        boolean hasAnnotation(AnnotationKind kind) {
            return switch (kind.ordinal()) {
                default -> throw new MatchException(null, null);
                case 0 -> {
                    if (!this.size.isEmpty()) {
                        yield true;
                    }
                    yield false;
                }
                case 1 -> this.unsigned;
                case 2 -> this.offset.isPresent();
            };
        }

        boolean checkSupportedAnnotations(Consumer<String> logger, AnnotationKind ... supported) {
            boolean error = false;
            List<AnnotationKind> supp = Arrays.asList(supported);
            for (AnnotationKind kind : AnnotationKind.values()) {
                if (supp.contains((Object)kind) || !this.hasAnnotation(kind)) continue;
                logger.accept("Unsupported annotation " + String.valueOf((Object)kind) + " on member");
                error = true;
            }
            return !error;
        }

        public AnnotationValues addSizes(List<Integer> sizes) {
            ArrayList<Integer> newSizes = new ArrayList<Integer>(this.size);
            newSizes.addAll(sizes);
            return new AnnotationValues(this.unsigned, newSizes, this.offset);
        }

        static enum AnnotationKind {
            SIZE,
            UNSIGNED,
            OFFSET;


            public String toString() {
                return "@" + this.name().charAt(0) + this.name().toLowerCase().substring(1);
            }
        }
    }
}

