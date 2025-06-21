/*
 * Decompiled with CFR 0.153-SNAPSHOT (d6f6758-dirty).
 */
package me.bechberger.ebpf.bpf.processor;

import com.squareup.javapoet.AnnotationSpec;
import com.squareup.javapoet.ClassName;
import com.squareup.javapoet.FieldSpec;
import com.squareup.javapoet.JavaFile;
import com.squareup.javapoet.MethodSpec;
import com.squareup.javapoet.ParameterizedTypeName;
import com.squareup.javapoet.TypeName;
import com.squareup.javapoet.TypeSpec;
import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.Writer;
import java.lang.reflect.Type;
import java.net.URI;
import java.nio.file.Files;
import java.nio.file.LinkOption;
import java.nio.file.OpenOption;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.nio.file.attribute.FileAttribute;
import java.util.ArrayList;
import java.util.Base64;
import java.util.List;
import java.util.Objects;
import java.util.Optional;
import java.util.Set;
import java.util.function.Consumer;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import java.util.stream.Collectors;
import java.util.stream.IntStream;
import java.util.zip.GZIPOutputStream;
import javax.annotation.processing.AbstractProcessor;
import javax.annotation.processing.ProcessingEnvironment;
import javax.annotation.processing.RoundEnvironment;
import javax.annotation.processing.SupportedAnnotationTypes;
import javax.annotation.processing.SupportedSourceVersion;
import javax.lang.model.SourceVersion;
import javax.lang.model.element.Element;
import javax.lang.model.element.Modifier;
import javax.lang.model.element.NestingKind;
import javax.lang.model.element.TypeElement;
import javax.lang.model.element.VariableElement;
import javax.lang.model.type.TypeMirror;
import javax.tools.Diagnostic;
import javax.tools.JavaFileObject;
import me.bechberger.cast.CAST;
import me.bechberger.ebpf.annotations.bpf.BPFImpl;
import me.bechberger.ebpf.bpf.processor.CompilationCache;
import me.bechberger.ebpf.bpf.processor.CompilerErrorProcessor;
import me.bechberger.ebpf.bpf.processor.TypeProcessor;
import org.jetbrains.annotations.Nullable;

@SupportedAnnotationTypes(value={"me.bechberger.ebpf.annotations.bpf.BPF"})
@SupportedSourceVersion(value=SourceVersion.RELEASE_22)
public class Processor
extends AbstractProcessor {
    private static final int MINIMUM_CLANG_VERSION = 19;
    private static final String BPF = "me.bechberger.ebpf.annotations.bpf.BPF";
    private final CompilationCache cache = new CompilationCache(Paths.get(".", new String[0]));
    private static final Set<String> SUPPORTED_BPF_PROG_MACROS = Set.of((Object)"BPF_PROG");
    private static Path includePath;
    @Nullable
    private Optional<Path> obtainedPathToVMLinuxHeader = null;

    @Override
    public boolean process(Set<? extends TypeElement> annotations, RoundEnvironment env) {
        this.processingEnv.getMessager().printNote("Processing BPF annotations");
        annotations.forEach(annotation -> {
            Set<? extends Element> elements = env.getElementsAnnotatedWith((TypeElement)annotation);
            if (annotation.getQualifiedName().toString().equals(BPF)) {
                elements.stream().filter(TypeElement.class::isInstance).map(TypeElement.class::cast).forEach(this::processBPFProgram);
            }
        });
        return true;
    }

    public void processBPFProgram(TypeElement typeElement) {
        TypeProcessor.TypeProcessorResult typeProcessorResult;
        if (typeElement.getSuperclass() == null || !typeElement.getSuperclass().toString().equals("me.bechberger.ebpf.bpf.BPFProgram")) {
            this.processingEnv.getMessager().printError("Class " + String.valueOf(typeElement.getSimpleName()) + " is annotated with BPF but does not extend BPFProgram", typeElement);
            return;
        }
        if (!typeElement.getModifiers().contains((Object)Modifier.ABSTRACT)) {
            this.processingEnv.getMessager().printError("Class " + String.valueOf(typeElement.getSimpleName()) + " is annotated with BPF but is not abstract", typeElement);
            return;
        }
        try {
            typeProcessorResult = new TypeProcessor(this.processingEnv).processBPFTypeRecords(typeElement);
            if (typeProcessorResult == null) {
                return;
            }
        } catch (Exception e) {
            e.printStackTrace();
            throw new RuntimeException(e);
        }
        CombinedCode combinedCode = this.combineEBPFProgram(typeElement, typeProcessorResult, false);
        if (combinedCode == null) {
            return;
        }
        byte[] bytes = new byte[0];
        if (bytes == null) {
            return;
        }
        this.processingEnv.getMessager().printMessage(Diagnostic.Kind.OTHER, "Compiled eBPF program", typeElement);
        ImplName implName = Processor.typeToImplName(typeElement);
        TypeSpec typeSpec = this.createType(implName.className, typeElement.asType(), bytes, typeProcessorResult.fields(), combinedCode, typeProcessorResult.globalVariableDefinitions(), typeProcessorResult.additions());
        try {
            JavaFileObject file2 = this.processingEnv.getFiler().createSourceFile(implName.fullyQualifiedClassName, typeElement);
            if (Files.exists(Path.of((URI)file2.toUri()), new LinkOption[0])) {
                Files.delete(Path.of((URI)file2.toUri()));
            }
            JavaFile javaFile = JavaFile.builder(implName.packageName, typeSpec).build();
            try (Writer writer2 = file2.openWriter();){
                writer2.write(javaFile.toString());
            }
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }

    private static ImplName classNameToImplName(String packageName, String className) {
        if (packageName.isEmpty()) {
            return new ImplName(className + "Impl", className + "Impl", packageName);
        }
        String simpleName = className.replace(".", "$") + "Impl";
        return new ImplName(simpleName, packageName + "." + simpleName, packageName);
    }

    private static ImplName typeToImplName(TypeElement type2) {
        ArrayList classNameParts = new ArrayList();
        TypeElement t = type2;
        classNameParts.add(t.getSimpleName().toString());
        while (t.getNestingKind() == NestingKind.MEMBER) {
            TypeElement typeElement;
            Element element = t.getEnclosingElement();
            if (!(element instanceof TypeElement)) continue;
            t = typeElement = (TypeElement)element;
            classNameParts.addFirst(t.getSimpleName().toString());
        }
        String qualifiedName = t.getQualifiedName().toString();
        return Processor.classNameToImplName(qualifiedName.substring(0, qualifiedName.length() - t.getSimpleName().length() - 1), String.join((CharSequence)".", classNameParts));
    }

    public static ImplName classToImplName(Class<?> klass) {
        if (klass.getPackageName().isEmpty()) {
            return Processor.classNameToImplName("", klass.getName());
        }
        return Processor.classNameToImplName(klass.getPackageName(), klass.getName().substring(klass.getPackageName().length() + 1));
    }

    private static String gzipBase64Encode(byte[] byteCode) {
        try {
            ByteArrayOutputStream baos = new ByteArrayOutputStream();
            try (GZIPOutputStream gos = new GZIPOutputStream(baos);){
                gos.write(byteCode);
            }
            return Base64.getEncoder().encodeToString(baos.toByteArray());
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }

    public static CompileResult compileAndEncode(ProcessingEnvironment env, String code2, Path file2) {
        Processor processor = new Processor();
        processor.processingEnv = env;
        return new CompileResult(processor.compile(new CombinedCode(code2, null, null, List.of()), file2));
    }

    private TypeSpec createType(String name, TypeMirror baseType, byte[] byteCode, List<FieldSpec> bpfTypeFields, CombinedCode code2, List<TypeProcessor.GlobalVariableDefinition> globalVariableDefinitions, TypeProcessor.InterfaceAdditions additions) {
        AnnotationSpec suppressWarnings = AnnotationSpec.builder(SuppressWarnings.class).addMember("value", "{\"unchecked\", \"rawtypes\"}", new Object[0]).build();
        TypeSpec.Builder spec = TypeSpec.classBuilder(name).addAnnotation(suppressWarnings).superclass(baseType).addAnnotation(AnnotationSpec.builder(BPFImpl.class).addMember("before", "\"\"\"\n" + String.join((CharSequence)"\n", additions.before()).replace("\\", "\\\\") + "\n\"\"\"", new Object[0]).addMember("after", "\"\"\"\n" + String.join((CharSequence)"\n", additions.after()).replace("\\", "\\\\") + "\n\"\"\"", new Object[0]).build()).addModifiers(Modifier.PUBLIC, Modifier.FINAL).addField(FieldSpec.builder(String.class, "BYTE_CODE", new Modifier[]{Modifier.PRIVATE, Modifier.STATIC, Modifier.FINAL}).addJavadoc("Base64 encoded and gzipped eBPF byte-code of the program\n{@snippet : \n" + this.sanitizeCodeForJavadoc(code2.ebpfProgram) + "\n}", new Object[0]).initializer("$L", this.createStringExpression(Processor.gzipBase64Encode(byteCode))).build()).addField(FieldSpec.builder(String.class, "CODE", new Modifier[]{Modifier.PUBLIC, Modifier.STATIC, Modifier.FINAL}).initializer("$S", code2.ebpfProgram).build());
        bpfTypeFields.forEach(spec::addField);
        spec.addMethod(MethodSpec.methodBuilder("getByteCodeBytesStatic").addModifiers(Modifier.PUBLIC, Modifier.STATIC).returns((Type)((Object)String.class)).addStatement("return BYTE_CODE + \"\"", new Object[0]).build());
        spec.addMethod(MethodSpec.methodBuilder("getByteCode").addModifiers(Modifier.PUBLIC).returns((Type)((Object)byte[].class)).beginControlFlow("if (getByteCodeResourceName().isEmpty())", new Object[0]).addStatement("return me.bechberger.ebpf.bpf.Util.decodeGzippedBase64(getByteCodeBytesStatic())", new Object[0]).nextControlFlow("else", new Object[0]).addStatement("return me.bechberger.ebpf.bpf.Util.loadGzippedResource($L.class, getByteCodeResourceName())", name).endControlFlow().build());
        spec.addMethod(MethodSpec.methodBuilder("getByteCodeResourceName").addModifiers(Modifier.PUBLIC).returns((Type)((Object)String.class)).addStatement("return \"\"", new Object[0]).build());
        spec.addMethod(MethodSpec.methodBuilder("getCodeStatic").addModifiers(Modifier.PUBLIC, Modifier.STATIC).returns((Type)((Object)String.class)).addStatement("return CODE", new Object[0]).build());
        spec.addMethod(MethodSpec.methodBuilder("getCode").addAnnotation(Override.class).addModifiers(Modifier.PUBLIC).returns((Type)((Object)String.class)).addStatement("return getCodeStatic()", new Object[0]).build());
        spec.addMethod(MethodSpec.methodBuilder("getAutoAttachablePrograms").addAnnotation(Override.class).addModifiers(Modifier.PUBLIC).returns(ParameterizedTypeName.get(ClassName.get(List.class), ClassName.get(String.class))).addStatement("return java.util.List.of($L)", code2.autoAttachablePrograms.stream().map(s2 -> "\"" + s2 + "\"").collect(Collectors.joining(", "))).build());
        MethodSpec.Builder constructor = MethodSpec.constructorBuilder().addModifiers(Modifier.PUBLIC);
        code2.tp.mapDefinitions().forEach(m -> constructor.addStatement("$L", m.javaFieldInitializer()));
        spec.addMethod(constructor.build());
        if (!globalVariableDefinitions.isEmpty()) {
            spec.addMethod(this.addGlobalVariableDefinitions(MethodSpec.methodBuilder("initGlobals").addAnnotation(Override.class).addModifiers(Modifier.PUBLIC).returns(TypeName.VOID), globalVariableDefinitions).build());
        }
        return spec.build();
    }

    private String createStringExpression(String s2) {
        ArrayList<String> parts = new ArrayList<String>();
        for (int i = 0; i < s2.length(); i += 131072) {
            parts.add(s2.substring(i, Math.min(i + 131072, s2.length())));
        }
        return parts.stream().map(p -> "\"" + p + "\"").collect(Collectors.joining(" + \"\\n\" + "));
    }

    private MethodSpec.Builder addGlobalVariableDefinitions(MethodSpec.Builder spec, List<TypeProcessor.GlobalVariableDefinition> globalVariableDefinitions) {
        if (globalVariableDefinitions.isEmpty()) {
            return spec;
        }
        ClassName globalVariablesType = ClassName.get("me.bechberger.ebpf.bpf", "GlobalVariable", "Globals");
        spec.addStatement("$T globalVariables = $T.forProgram(this)", globalVariablesType, globalVariablesType).addStatement("globalVariables.initGlobals(java.util.List.of($L))", globalVariableDefinitions.stream().map(this::createGlobalVariableInitInfoExpression).collect(Collectors.joining(", ")));
        return spec;
    }

    private String createGlobalVariableInitInfoExpression(TypeProcessor.GlobalVariableDefinition g) {
        return "new me.bechberger.ebpf.bpf.GlobalVariable.GlobalVariableInitInfo<>(this." + g.name() + ", \"" + g.name() + "\", " + g.typeField() + ")";
    }

    private String sanitizeCodeForJavadoc(String code2) {
        return code2.replace("*/", "* /").replace("/*", "/ *");
    }

    @Nullable
    private CombinedCode combineEBPFProgram(TypeElement typeElement, TypeProcessor.TypeProcessorResult tpResult, boolean addAdditions) {
        Optional<Element> elem = typeElement.getEnclosedElements().stream().filter(e -> e.getKind().isField() && e.getSimpleName().toString().equals("EBPF_PROGRAM")).findFirst();
        if (elem.isEmpty()) {
            return this.combineEBPFProgram(typeElement, null, "", tpResult, addAdditions);
        }
        VariableElement element = (VariableElement)elem.get();
        if (!element.asType().toString().equals("java.lang.String") && !element.asType().toString().equals("java.nio.file.Path")) {
            this.processingEnv.getMessager().printError("Field EBPF_PROGRAM in class " + String.valueOf(typeElement.getSimpleName()) + " is not of type String or Path", typeElement);
            return null;
        }
        if (element.getConstantValue() == null) {
            this.processingEnv.getMessager().printError("Field EBPF_PROGRAM in class " + String.valueOf(typeElement.getSimpleName()) + " is not a constant string", typeElement);
            return null;
        }
        String ebpfProgram = (String)element.getConstantValue();
        if (ebpfProgram.endsWith(".c") && ebpfProgram.split("\n").length == 1) {
            try {
                Path p = this.getPath(ebpfProgram);
                if (p == null || !Files.exists(p, new LinkOption[0])) {
                    this.processingEnv.getMessager().printError("Field EBPF_PROGRAM in class " + String.valueOf(typeElement.getSimpleName()) + " is a path to a file that does not exist, maybe pass base folder via -Aebpf.folder", typeElement);
                    return null;
                }
                try (InputStream is = Files.newInputStream(p, new OpenOption[0]);){
                    ebpfProgram = new String(is.readAllBytes());
                }
            } catch (IOException e2) {
                throw new RuntimeException(e2);
            }
        }
        this.processingEnv.getMessager().printNote("EBPF Program: " + ebpfProgram, typeElement);
        return this.combineEBPFProgram(typeElement, element, ebpfProgram, tpResult, addAdditions);
    }

    private List<String> findAutoAttachablePrograms(String ebpfProgram) {
        String ebpfProgramWithoutMultipleSpacesOrNewlines = ebpfProgram.replaceAll("[\\s]+", " ");
        ArrayList<String> autoAttachablePrograms = new ArrayList<String>();
        for (String part : ebpfProgramWithoutMultipleSpacesOrNewlines.split("SEC\\s*\\(\"[^\"]*\"")) {
            if (!part.startsWith(")")) continue;
            part = part.substring(1);
            Matcher matcher = Pattern.compile("([a-zA-Z0-9_]+)\\s?\\(").matcher(part);
            if (!matcher.find()) continue;
            String match = matcher.group(1);
            if (SUPPORTED_BPF_PROG_MACROS.contains(match)) {
                Matcher nameMatcher = Pattern.compile("([a-zA-Z0-9_]+)").matcher(part.substring(matcher.end()));
                if (!nameMatcher.find()) continue;
                autoAttachablePrograms.add(nameMatcher.group(1));
                continue;
            }
            autoAttachablePrograms.add(match);
        }
        return autoAttachablePrograms;
    }

    @Nullable
    private CombinedCode combineEBPFProgram(TypeElement outer, VariableElement field, String ebpfProgram, TypeProcessor.TypeProcessorResult tpResult, boolean addAdditions) {
        List lines;
        List unstrippedLines = ebpfProgram.lines().toList();
        int lastInclude = IntStream.range(0, unstrippedLines.size()).filter(i -> ((String)unstrippedLines.get(i)).contains("#include")).max().orElse(-1);
        if (lastInclude != -1) {
            String ws = ((String)unstrippedLines.get(lastInclude)).split("#include")[0];
            lines = unstrippedLines.stream().map(l -> l.startsWith(ws) ? l.substring(ws.length()) : l).toList();
        } else {
            lines = unstrippedLines;
        }
        ArrayList resultLines = new ArrayList(lines.subList(0, lastInclude + 1));
        tpResult.additions().includes().stream().map(CAST.Statement.Include::new).filter(include -> !include.isAlreadyPresent(resultLines)).forEach(include -> resultLines.add(include.toPrettyString()));
        Consumer<List> addEmptyLineIfNeeded = list -> {
            if (!(list.isEmpty() || resultLines.isEmpty() || ((String)resultLines.getLast()).isBlank())) {
                resultLines.add("");
            }
        };
        Consumer<String> addLine = l -> resultLines.addAll(l.lines().toList());
        if (addAdditions) {
            addEmptyLineIfNeeded.accept(tpResult.additions().before());
            tpResult.additions().before().forEach(addLine);
        }
        List filteredDefines = tpResult.defines().stream().filter(d -> {
            String tester = "#define " + d.name() + " ";
            return lines.stream().noneMatch(l -> l.startsWith(tester));
        }).toList();
        addEmptyLineIfNeeded.accept(filteredDefines);
        filteredDefines.stream().map(CAST::toPrettyString).forEach(addLine);
        if (!filteredDefines.isEmpty()) {
            resultLines.add("");
        }
        String license = lines.stream().filter(l -> l.matches(".*SEC *\\(\"license\"\\).*")).findFirst().orElse(null);
        if (tpResult.licenseDefinition() == null) {
            if (license == null) {
                this.processingEnv.getMessager().printWarning("No license defined in EBPF program", field);
            }
        } else if (license != null) {
            this.processingEnv.getMessager().printError("License defined in EBPF program and via annotation", field);
            return null;
        }
        addEmptyLineIfNeeded.accept(tpResult.definingStatements());
        tpResult.definingStatements().stream().map(CAST::toPrettyString).forEach(l -> {
            addLine.accept((String)l);
            resultLines.add("");
        });
        addEmptyLineIfNeeded.accept(tpResult.mapDefinitions());
        tpResult.mapDefinitions().stream().map(m -> m.structDefinition().toPrettyString()).forEach(l -> {
            addLine.accept((String)l);
            resultLines.add("");
        });
        addEmptyLineIfNeeded.accept(tpResult.globalVariableDefinitions());
        tpResult.globalVariableDefinitions().forEach(v -> {
            String line2 = v.globalVariable().toPrettyString();
            addLine.accept(line2);
            resultLines.add("");
        });
        List afterIncludes = lines.subList(lastInclude + 1, lines.size());
        if (afterIncludes.isEmpty() || !((String)afterIncludes.getFirst()).isBlank()) {
            addEmptyLineIfNeeded.accept(afterIncludes);
        }
        resultLines.addAll(afterIncludes);
        if (addAdditions) {
            addEmptyLineIfNeeded.accept(tpResult.additions().after());
            tpResult.additions().after().forEach(addLine);
        }
        if (license == null && tpResult.licenseDefinition() != null) {
            addEmptyLineIfNeeded.accept(List.of((Object)""));
            addLine.accept(tpResult.licenseDefinition().toStatement().toPrettyString());
        }
        while (!resultLines.isEmpty() && ((String)resultLines.getLast()).isBlank()) {
            resultLines.removeLast();
        }
        List<String> autoAttachablePrograms = this.findAutoAttachablePrograms(ebpfProgram);
        return new CombinedCode(String.join((CharSequence)"\n", resultLines), field, tpResult, autoAttachablePrograms);
    }

    private static String findNewestClangVersion() {
        Pattern versionPattern = Pattern.compile("version (?<version>\\d+)");
        int minimumVersion = 18;
        try {
            Process defaultClangProcess = new ProcessBuilder("clang", "--version").start();
            if (defaultClangProcess.waitFor() == 0) {
                String output = new String(defaultClangProcess.getInputStream().readAllBytes());
                Matcher versionMatcher = versionPattern.matcher(output);
                versionMatcher.find();
                int version = Integer.parseInt(versionMatcher.group("version"));
                if (version > minimumVersion) {
                    minimumVersion = version;
                }
            }
        } catch (IOException | InterruptedException defaultClangProcess) {
            // empty catch block
        }
        for (int i = 20; i > minimumVersion; --i) {
            try {
                String name = "clang-" + i;
                Process process = new ProcessBuilder(name, "--version").start();
                if (process.waitFor() != 0) continue;
                return name;
            } catch (IOException | InterruptedException exception2) {
                // empty catch block
            }
        }
        if (minimumVersion >= 19) {
            return "clang";
        }
        throw new RuntimeException("Could not find clang >= 19");
    }

    private static Path findIncludePath() {
        if (includePath == null && !Files.exists(includePath = Path.of((String)"/usr/include", (String[])new String[0]).resolve(System.getProperty("os.arch") + "-linux-gnu"), new LinkOption[0]) && !Files.exists(includePath = Path.of((String)"/usr/include/linux", (String[])new String[0]), new LinkOption[0])) {
            throw new RuntimeException("Could not find include path " + String.valueOf(includePath));
        }
        return includePath;
    }

    private static String getArch() {
        String arch = System.getProperty("os.arch");
        if (arch.equals("amd64")) {
            return "x86";
        }
        if (arch.equals("aarch64")) {
            return "arm64";
        }
        return arch;
    }

    private byte[] compile(CombinedCode code2, Path ebpfFile) {
        if (this.dontCompile()) {
            System.out.println("EBPF program to compile:");
            System.out.println("-".repeat(10));
            System.out.println(code2.ebpfProgram);
            return new byte[]{0};
        }
        Path vmlinuxHeader = this.getPathToVMLinuxHeader();
        if (vmlinuxHeader == null) {
            return null;
        }
        this.processingEnv.getMessager().printNote("Compiling eBPF program include path : " + String.valueOf(Processor.findIncludePath()));
        byte[] cached = this.cache.getCached(code2.ebpfProgram + "|" + Processor.getArch());
        if (cached != null) {
            return cached;
        }
        try {
            Path tempFile = Files.createTempFile("ebpf", ".o", new FileAttribute[0]);
            tempFile.toFile().deleteOnExit();
            List command = List.of((Object[])new String[]{Processor.findNewestClangVersion(), "-O2", "-g", "-std=gnu2y", "-target", "bpf", "-c", "-o", tempFile.toString(), "-I", vmlinuxHeader.getParent().toString(), "-D__TARGET_ARCH_" + Processor.getArch(), "-Wno-parentheses-equality", "-Wno-unused-value", "-Wreturn-type", "-Wno-incompatible-pointer-types-discards-qualifiers", "-x", "c", "-", "--sysroot=/", "-I" + String.valueOf(Processor.findIncludePath())});
            Process process = new ProcessBuilder(command).redirectInput(ProcessBuilder.Redirect.PIPE).redirectError(ProcessBuilder.Redirect.PIPE).start();
            process.getOutputStream().write(code2.ebpfProgram.getBytes());
            process.getOutputStream().close();
            ByteArrayOutputStream error = new ByteArrayOutputStream();
            process.getErrorStream().transferTo(error);
            if (process.waitFor() != 0) {
                System.err.println("Could not compile eBPF program");
                String[] lines = code2.ebpfProgram.split("\n");
                for (int i = 0; i < lines.length; ++i) {
                    System.err.printf("%3d: %s\n", i + 1, lines[i]);
                }
                String errorString = error.toString();
                this.processingEnv.getMessager().printError("Could not compile eBPF program via " + String.join((CharSequence)" ", command), code2.codeField);
                this.printErrorMessages(code2, errorString, ebpfFile);
                return new byte[0];
            }
            byte[] bytes = Files.readAllBytes(tempFile);
            this.cache.cache(code2.ebpfProgram + "|" + Processor.getArch(), bytes);
            return bytes;
        } catch (IOException | InterruptedException e) {
            throw new RuntimeException(e);
        }
    }

    private void printErrorMessages(CombinedCode code2, String errorString, Path ebpfFile) {
        CompilerErrorProcessor processor = CompilerErrorProcessor.fromClangOutput(errorString, ebpfFile);
        boolean colorize = Objects.equals(System.getenv("EBPF_COLORIZE"), "true");
        String out = processor.toPrettyString(colorize);
        if (ebpfFile.toString().endsWith(".c")) {
            this.processingEnv.getMessager().printError(out);
        } else {
            System.err.println(out);
        }
    }

    private List<String> suggestionsForMessage(String message) {
        ArrayList<String> suggestions = new ArrayList<String>();
        if (message.contains(" fatal error: 'bits/libc-header-start.h' file not found")) {
            suggestions.add("Try to install gcc-multilib");
        }
        if (message.contains(" fatal error: 'bpf_helpers.h' file not found")) {
            suggestions.add("Replace `#include 'bpf_helpers.h` with `#include <bpf/bpf_helpers.h>`");
        }
        return suggestions;
    }

    @Nullable
    private Path getPathToVMLinuxHeader() {
        if (this.obtainedPathToVMLinuxHeader == null) {
            this.obtainedPathToVMLinuxHeader = Optional.ofNullable(this.obtainPathToVMLinuxHeader());
        }
        return this.obtainedPathToVMLinuxHeader.orElse(null);
    }

    private String getBPFToolPath() {
        Path bpftoolPath = Path.of((String)".bpftool.path", (String[])new String[0]);
        if (Files.exists(bpftoolPath, new LinkOption[0])) {
            try {
                return Files.readString((Path)bpftoolPath).trim();
            } catch (IOException e) {
                throw new RuntimeException(e);
            }
        }
        try {
            Process process = new ProcessBuilder("bpftool", "version").start();
            if (process.waitFor() != 0) {
                System.err.println("Could not find usable bpftool:\n" + new String(process.getErrorStream().readAllBytes()));
                System.err.println("You can optionally download the latest binary from https://github.com/libbpf/bpftool/releases");
                System.err.println("and put the location in a .bpftool.path file in the project root");
                throw new UnsupportedOperationException("Could not find bpftool");
            }
        } catch (IOException | InterruptedException e) {
            throw new RuntimeException(e);
        }
        return "bpftool";
    }

    private Path obtainPathToVMLinuxHeader() {
        try {
            Path vmlinuxHeader = this.getPath("vmlinux.h");
            if (vmlinuxHeader != null && Files.exists(vmlinuxHeader, new LinkOption[0])) {
                return vmlinuxHeader;
            }
            Path cacheFolder = this.cache.getCacheFolder();
            Path vmLinuxFile = cacheFolder.resolve("vmlinux.h");
            if (Files.exists(vmLinuxFile, new LinkOption[0])) {
                return vmLinuxFile;
            }
            Path errorFile = cacheFolder.resolve("vmlinux_error.txt");
            Process process = new ProcessBuilder(this.getBPFToolPath(), "btf", "dump", "file", "/sys/kernel/btf/vmlinux", "format", "c").redirectOutput(vmLinuxFile.toFile()).redirectError(errorFile.toFile()).start();
            if (process.waitFor() != 0) {
                throw new UnsupportedOperationException("Could not obtain vmlinux.h header file via 'bpftool btf dump file /sys/kernel/btf/vmlinux format c'" + Files.readString((Path)errorFile));
            }
            Files.delete(errorFile);
            String content = Files.readString((Path)vmLinuxFile);
            content = content.replace("typedef _Bool bool;", "// typedef _Bool bool").replaceAll("enum \\{\n\\s+false = 0,\n\\s+true = 1,\n};\n", "// enum {\n//\tfalse = 0,\n//\ttrue = 1,\n// };\n");
            Files.writeString((Path)vmLinuxFile, (CharSequence)content, (OpenOption[])new OpenOption[0]);
            return vmLinuxFile;
        } catch (IOException | InterruptedException e) {
            throw new RuntimeException(e);
        }
    }

    @Nullable
    public Path getEBPFFolder() {
        String p = this.processingEnv.getOptions().getOrDefault("ebpf.folder", null);
        if (p == null) {
            String val = System.getenv("EBPF_FOLDER");
            return val == null ? null : Path.of((String)val, (String[])new String[0]);
        }
        return Path.of((String)p, (String[])new String[0]);
    }

    @Nullable
    private Path getPath(String name) {
        if (name.startsWith("/") || name.startsWith("./") || name.startsWith("../")) {
            return Path.of((String)name, (String[])new String[0]);
        }
        if (name.startsWith("~/")) {
            return Path.of((String)System.getProperty("user.home"), (String[])new String[]{name.substring(2)});
        }
        return this.getEBPFFolder() == null ? null : this.getEBPFFolder().resolve(name);
    }

    private boolean dontCompile() {
        String env = System.getenv("EBPF_DONT_COMPILE");
        return "true".equals(env) || "1".equals(env);
    }

    record CombinedCode(String ebpfProgram, VariableElement codeField, TypeProcessor.TypeProcessorResult tp, List<String> autoAttachablePrograms) {
    }

    public record ImplName(String className, String fullyQualifiedClassName, String packageName) {
    }

    public record CompileResult(byte[] byteCode) {
        public String encode() {
            return Processor.gzipBase64Encode(this.byteCode);
        }

        public byte[] gzip() {
            ByteArrayOutputStream baos = new ByteArrayOutputStream();
            try (GZIPOutputStream gos = new GZIPOutputStream(baos);){
                gos.write(this.byteCode);
            } catch (IOException e) {
                throw new RuntimeException(e);
            }
            return baos.toByteArray();
        }
    }

    private record Line(int line, int start) {
    }
}

