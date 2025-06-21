/*
 * Decompiled with CFR 0.153-SNAPSHOT (d6f6758-dirty).
 */
package com.squareup.javapoet;

import com.squareup.javapoet.ClassName;
import com.squareup.javapoet.CodeBlock;
import com.squareup.javapoet.CodeWriter;
import com.squareup.javapoet.TypeSpec;
import com.squareup.javapoet.Util;
import java.io.ByteArrayInputStream;
import java.io.File;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStreamWriter;
import java.io.Writer;
import java.net.URI;
import java.nio.charset.Charset;
import java.nio.charset.StandardCharsets;
import java.nio.file.Files;
import java.nio.file.LinkOption;
import java.nio.file.OpenOption;
import java.nio.file.Path;
import java.nio.file.attribute.FileAttribute;
import java.util.Arrays;
import java.util.Collections;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.TreeSet;
import javax.annotation.processing.Filer;
import javax.lang.model.element.Element;
import javax.tools.JavaFileObject;
import javax.tools.SimpleJavaFileObject;

public final class JavaFile {
    private static final Appendable NULL_APPENDABLE = new Appendable(){

        @Override
        public Appendable append(CharSequence charSequence) {
            return this;
        }

        @Override
        public Appendable append(CharSequence charSequence, int start, int end) {
            return this;
        }

        @Override
        public Appendable append(char c) {
            return this;
        }
    };
    public final CodeBlock fileComment;
    public final String packageName;
    public final TypeSpec typeSpec;
    public final boolean skipJavaLangImports;
    private final Set<String> staticImports;
    private final Set<String> alwaysQualify;
    private final String indent;

    private JavaFile(Builder builder) {
        this.fileComment = builder.fileComment.build();
        this.packageName = builder.packageName;
        this.typeSpec = builder.typeSpec;
        this.skipJavaLangImports = builder.skipJavaLangImports;
        this.staticImports = Util.immutableSet(builder.staticImports);
        this.indent = builder.indent;
        LinkedHashSet<String> alwaysQualifiedNames = new LinkedHashSet<String>();
        this.fillAlwaysQualifiedNames(builder.typeSpec, alwaysQualifiedNames);
        this.alwaysQualify = Util.immutableSet(alwaysQualifiedNames);
    }

    private void fillAlwaysQualifiedNames(TypeSpec spec, Set<String> alwaysQualifiedNames) {
        alwaysQualifiedNames.addAll(spec.alwaysQualifiedNames);
        for (TypeSpec nested : spec.typeSpecs) {
            this.fillAlwaysQualifiedNames(nested, alwaysQualifiedNames);
        }
    }

    public void writeTo(Appendable out) throws IOException {
        CodeWriter importsCollector = new CodeWriter(NULL_APPENDABLE, this.indent, this.staticImports, this.alwaysQualify);
        this.emit(importsCollector);
        Map<String, ClassName> suggestedImports = importsCollector.suggestedImports();
        CodeWriter codeWriter = new CodeWriter(out, this.indent, suggestedImports, this.staticImports, this.alwaysQualify);
        this.emit(codeWriter);
    }

    public void writeTo(Path directory) throws IOException {
        this.writeToPath(directory);
    }

    public void writeTo(Path directory, Charset charset) throws IOException {
        this.writeToPath(directory, charset);
    }

    public Path writeToPath(Path directory) throws IOException {
        return this.writeToPath(directory, StandardCharsets.UTF_8);
    }

    public Path writeToPath(Path directory, Charset charset) throws IOException {
        Util.checkArgument(Files.notExists(directory, new LinkOption[0]) || Files.isDirectory(directory, new LinkOption[0]), "path %s exists but is not a directory.", directory);
        Path outputDirectory = directory;
        if (!this.packageName.isEmpty()) {
            for (String packageComponent : this.packageName.split("\\.")) {
                outputDirectory = outputDirectory.resolve(packageComponent);
            }
            Files.createDirectories(outputDirectory, new FileAttribute[0]);
        }
        Path outputPath = outputDirectory.resolve(this.typeSpec.name + ".java");
        try (OutputStreamWriter writer2 = new OutputStreamWriter(Files.newOutputStream(outputPath, new OpenOption[0]), charset);){
            this.writeTo(writer2);
        }
        return outputPath;
    }

    public void writeTo(File directory) throws IOException {
        this.writeTo(directory.toPath());
    }

    public File writeToFile(File directory) throws IOException {
        Path outputPath = this.writeToPath(directory.toPath());
        return outputPath.toFile();
    }

    public void writeTo(Filer filer) throws IOException {
        String fileName = this.packageName.isEmpty() ? this.typeSpec.name : this.packageName + "." + this.typeSpec.name;
        List<Element> originatingElements = this.typeSpec.originatingElements;
        JavaFileObject filerSourceFile = filer.createSourceFile(fileName, originatingElements.toArray(new Element[originatingElements.size()]));
        try (Writer writer2 = filerSourceFile.openWriter();){
            this.writeTo(writer2);
        } catch (Exception e) {
            try {
                filerSourceFile.delete();
            } catch (Exception exception2) {
                // empty catch block
            }
            throw e;
        }
    }

    private void emit(CodeWriter codeWriter) throws IOException {
        codeWriter.pushPackage(this.packageName);
        if (!this.fileComment.isEmpty()) {
            codeWriter.emitComment(this.fileComment);
        }
        if (!this.packageName.isEmpty()) {
            codeWriter.emit("package $L;\n", this.packageName);
            codeWriter.emit("\n");
        }
        if (!this.staticImports.isEmpty()) {
            for (String signature : this.staticImports) {
                codeWriter.emit("import static $L;\n", signature);
            }
            codeWriter.emit("\n");
        }
        int importedTypesCount = 0;
        for (ClassName className : new TreeSet<ClassName>(codeWriter.importedTypes().values())) {
            if (this.skipJavaLangImports && className.packageName().equals("java.lang") && !this.alwaysQualify.contains(className.simpleName)) continue;
            codeWriter.emit("import $L;\n", className.withoutAnnotations());
            ++importedTypesCount;
        }
        if (importedTypesCount > 0) {
            codeWriter.emit("\n");
        }
        this.typeSpec.emit(codeWriter, null, Collections.emptySet());
        codeWriter.popPackage();
    }

    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (o == null) {
            return false;
        }
        if (this.getClass() != o.getClass()) {
            return false;
        }
        return this.toString().equals(o.toString());
    }

    public int hashCode() {
        return this.toString().hashCode();
    }

    public String toString() {
        try {
            StringBuilder result = new StringBuilder();
            this.writeTo(result);
            return result.toString();
        } catch (IOException e) {
            throw new AssertionError();
        }
    }

    public JavaFileObject toJavaFileObject() {
        URI uri = URI.create((this.packageName.isEmpty() ? this.typeSpec.name : this.packageName.replace('.', '/') + '/' + this.typeSpec.name) + JavaFileObject.Kind.SOURCE.extension);
        return new SimpleJavaFileObject(uri, JavaFileObject.Kind.SOURCE){
            private final long lastModified;
            {
                this.lastModified = System.currentTimeMillis();
            }

            @Override
            public String getCharContent(boolean ignoreEncodingErrors) {
                return JavaFile.this.toString();
            }

            @Override
            public InputStream openInputStream() throws IOException {
                return new ByteArrayInputStream(this.getCharContent(true).getBytes(StandardCharsets.UTF_8));
            }

            @Override
            public long getLastModified() {
                return this.lastModified;
            }
        };
    }

    public static Builder builder(String packageName, TypeSpec typeSpec) {
        Util.checkNotNull(packageName, "packageName == null", new Object[0]);
        Util.checkNotNull(typeSpec, "typeSpec == null", new Object[0]);
        return new Builder(packageName, typeSpec);
    }

    public Builder toBuilder() {
        Builder builder = new Builder(this.packageName, this.typeSpec);
        builder.fileComment.add(this.fileComment);
        builder.skipJavaLangImports = this.skipJavaLangImports;
        builder.indent = this.indent;
        return builder;
    }

    public static final class Builder {
        private final String packageName;
        private final TypeSpec typeSpec;
        private final CodeBlock.Builder fileComment = CodeBlock.builder();
        private boolean skipJavaLangImports;
        private String indent = "  ";
        public final Set<String> staticImports = new TreeSet<String>();

        private Builder(String packageName, TypeSpec typeSpec) {
            this.packageName = packageName;
            this.typeSpec = typeSpec;
        }

        public Builder addFileComment(String format, Object ... args) {
            this.fileComment.add(format, args);
            return this;
        }

        public Builder addStaticImport(Enum<?> constant) {
            return this.addStaticImport(ClassName.get(constant.getDeclaringClass()), constant.name());
        }

        public Builder addStaticImport(Class<?> clazz, String ... names) {
            return this.addStaticImport(ClassName.get(clazz), names);
        }

        public Builder addStaticImport(ClassName className, String ... names) {
            Util.checkArgument(className != null, "className == null", new Object[0]);
            Util.checkArgument(names != null, "names == null", new Object[0]);
            Util.checkArgument(names.length > 0, "names array is empty", new Object[0]);
            for (String name : names) {
                Util.checkArgument(name != null, "null entry in names array: %s", Arrays.toString(names));
                this.staticImports.add(className.canonicalName + "." + name);
            }
            return this;
        }

        public Builder skipJavaLangImports(boolean skipJavaLangImports) {
            this.skipJavaLangImports = skipJavaLangImports;
            return this;
        }

        public Builder indent(String indent) {
            this.indent = indent;
            return this;
        }

        public JavaFile build() {
            return new JavaFile(this);
        }
    }
}

