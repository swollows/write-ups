/*
 * Decompiled with CFR 0.153-SNAPSHOT (d6f6758-dirty).
 */
package com.squareup.javapoet;

import com.squareup.javapoet.AnnotationSpec;
import com.squareup.javapoet.CodeWriter;
import com.squareup.javapoet.TypeName;
import com.squareup.javapoet.Util;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Objects;
import javax.lang.model.element.Element;
import javax.lang.model.element.PackageElement;
import javax.lang.model.element.TypeElement;
import javax.lang.model.util.SimpleElementVisitor8;

public final class ClassName
extends TypeName
implements Comparable<ClassName> {
    public static final ClassName OBJECT = ClassName.get(Object.class);
    private static final String NO_PACKAGE = "";
    final String packageName;
    final ClassName enclosingClassName;
    final String simpleName;
    private List<String> simpleNames;
    final String canonicalName;

    private ClassName(String packageName, ClassName enclosingClassName, String simpleName) {
        this(packageName, enclosingClassName, simpleName, Collections.emptyList());
    }

    private ClassName(String packageName, ClassName enclosingClassName, String simpleName, List<AnnotationSpec> annotations) {
        super(annotations);
        this.packageName = Objects.requireNonNull(packageName, "packageName == null");
        this.enclosingClassName = enclosingClassName;
        this.simpleName = simpleName;
        this.canonicalName = enclosingClassName != null ? enclosingClassName.canonicalName + '.' + simpleName : (packageName.isEmpty() ? simpleName : packageName + '.' + simpleName);
    }

    @Override
    public ClassName annotated(List<AnnotationSpec> annotations) {
        return new ClassName(this.packageName, this.enclosingClassName, this.simpleName, this.concatAnnotations(annotations));
    }

    @Override
    public ClassName withoutAnnotations() {
        if (!this.isAnnotated()) {
            return this;
        }
        ClassName resultEnclosingClassName = this.enclosingClassName != null ? this.enclosingClassName.withoutAnnotations() : null;
        return new ClassName(this.packageName, resultEnclosingClassName, this.simpleName);
    }

    @Override
    public boolean isAnnotated() {
        return super.isAnnotated() || this.enclosingClassName != null && this.enclosingClassName.isAnnotated();
    }

    public String packageName() {
        return this.packageName;
    }

    public ClassName enclosingClassName() {
        return this.enclosingClassName;
    }

    public ClassName topLevelClassName() {
        return this.enclosingClassName != null ? this.enclosingClassName.topLevelClassName() : this;
    }

    public String reflectionName() {
        return this.enclosingClassName != null ? this.enclosingClassName.reflectionName() + '$' + this.simpleName : (this.packageName.isEmpty() ? this.simpleName : this.packageName + '.' + this.simpleName);
    }

    public List<String> simpleNames() {
        if (this.simpleNames != null) {
            return this.simpleNames;
        }
        if (this.enclosingClassName == null) {
            this.simpleNames = Collections.singletonList(this.simpleName);
        } else {
            ArrayList<String> mutableNames = new ArrayList<String>();
            mutableNames.addAll(this.enclosingClassName().simpleNames());
            mutableNames.add(this.simpleName);
            this.simpleNames = Collections.unmodifiableList(mutableNames);
        }
        return this.simpleNames;
    }

    public ClassName peerClass(String name) {
        return new ClassName(this.packageName, this.enclosingClassName, name);
    }

    public ClassName nestedClass(String name) {
        return new ClassName(this.packageName, this, name);
    }

    public String simpleName() {
        return this.simpleName;
    }

    public String canonicalName() {
        return this.canonicalName;
    }

    public static ClassName get(Class<?> clazz) {
        Util.checkNotNull(clazz, "clazz == null", new Object[0]);
        Util.checkArgument(!clazz.isPrimitive(), "primitive types cannot be represented as a ClassName", new Object[0]);
        Util.checkArgument(!Void.TYPE.equals(clazz), "'void' type cannot be represented as a ClassName", new Object[0]);
        Util.checkArgument(!clazz.isArray(), "array types cannot be represented as a ClassName", new Object[0]);
        String anonymousSuffix = NO_PACKAGE;
        while (clazz.isAnonymousClass()) {
            int lastDollar = clazz.getName().lastIndexOf(36);
            anonymousSuffix = clazz.getName().substring(lastDollar) + anonymousSuffix;
            clazz = clazz.getEnclosingClass();
        }
        String name = clazz.getSimpleName() + anonymousSuffix;
        if (clazz.getEnclosingClass() == null) {
            int lastDot = clazz.getName().lastIndexOf(46);
            String packageName = lastDot != -1 ? clazz.getName().substring(0, lastDot) : NO_PACKAGE;
            return new ClassName(packageName, null, name);
        }
        return ClassName.get(clazz.getEnclosingClass()).nestedClass(name);
    }

    public static ClassName bestGuess(String classNameString) {
        int p = 0;
        while (p < classNameString.length() && Character.isLowerCase(classNameString.codePointAt(p))) {
            Util.checkArgument((p = classNameString.indexOf(46, p) + 1) != 0, "couldn't make a guess for %s", classNameString);
        }
        String packageName = p == 0 ? NO_PACKAGE : classNameString.substring(0, p - 1);
        ClassName className = null;
        for (String simpleName : classNameString.substring(p).split("\\.", -1)) {
            Util.checkArgument(!simpleName.isEmpty() && Character.isUpperCase(simpleName.codePointAt(0)), "couldn't make a guess for %s", classNameString);
            className = new ClassName(packageName, className, simpleName);
        }
        return className;
    }

    public static ClassName get(String packageName, String simpleName, String ... simpleNames) {
        ClassName className = new ClassName(packageName, null, simpleName);
        for (String name : simpleNames) {
            className = className.nestedClass(name);
        }
        return className;
    }

    public static ClassName get(final TypeElement element) {
        Util.checkNotNull(element, "element == null", new Object[0]);
        final String simpleName = element.getSimpleName().toString();
        return element.getEnclosingElement().accept(new SimpleElementVisitor8<ClassName, Void>(){

            @Override
            public ClassName visitPackage(PackageElement packageElement, Void p) {
                return new ClassName(packageElement.getQualifiedName().toString(), null, simpleName);
            }

            @Override
            public ClassName visitType(TypeElement enclosingClass, Void p) {
                return ClassName.get(enclosingClass).nestedClass(simpleName);
            }

            @Override
            public ClassName visitUnknown(Element unknown, Void p) {
                return ClassName.get(ClassName.NO_PACKAGE, simpleName, new String[0]);
            }

            @Override
            public ClassName defaultAction(Element enclosingElement, Void p) {
                throw new IllegalArgumentException("Unexpected type nesting: " + element);
            }
        }, null);
    }

    @Override
    public int compareTo(ClassName o) {
        return this.canonicalName.compareTo(o.canonicalName);
    }

    @Override
    CodeWriter emit(CodeWriter out) throws IOException {
        boolean charsEmitted = false;
        for (ClassName className : this.enclosingClasses()) {
            String simpleName;
            if (charsEmitted) {
                out.emit(".");
                simpleName = className.simpleName;
            } else {
                if (!className.isAnnotated() && className != this) continue;
                String qualifiedName = out.lookupName(className);
                int dot = qualifiedName.lastIndexOf(46);
                if (dot != -1) {
                    out.emitAndIndent(qualifiedName.substring(0, dot + 1));
                    simpleName = qualifiedName.substring(dot + 1);
                    charsEmitted = true;
                } else {
                    simpleName = qualifiedName;
                }
            }
            if (className.isAnnotated()) {
                if (charsEmitted) {
                    out.emit(" ");
                }
                className.emitAnnotations(out);
            }
            out.emit(simpleName);
            charsEmitted = true;
        }
        return out;
    }

    private List<ClassName> enclosingClasses() {
        ArrayList<ClassName> result = new ArrayList<ClassName>();
        ClassName c = this;
        while (c != null) {
            result.add(c);
            c = c.enclosingClassName;
        }
        Collections.reverse(result);
        return result;
    }
}

