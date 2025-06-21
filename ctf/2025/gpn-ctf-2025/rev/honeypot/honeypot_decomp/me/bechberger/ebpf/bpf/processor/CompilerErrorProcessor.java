/*
 * Decompiled with CFR 0.153-SNAPSHOT (d6f6758-dirty).
 */
package me.bechberger.ebpf.bpf.processor;

import com.diogonunes.jcolor.Ansi;
import com.diogonunes.jcolor.Attribute;
import java.nio.file.Path;
import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public record CompilerErrorProcessor(List<PerFileOrRaw> errors) {
    public static CompilerErrorProcessor fromClangOutput(String llvmOutput, Path bpfFile) {
        ArrayList<PerFileOrRaw> errors = new ArrayList<PerFileOrRaw>();
        String[] lines = llvmOutput.split("\n");
        Path currentFile = null;
        ArrayList<CompilerError> currentErrors = new ArrayList<CompilerError>();
        for (int i = 0; i < lines.length; ++i) {
            String errorLine = lines[i];
            if (errorLine.matches(".*:[0-9]+:[0-9]+:.*:.*")) {
                String[] parts = errorLine.split(":", 4);
                Path file2 = parts[0].equals("<stdin>") ? bpfFile : Path.of((String)parts[0], (String[])new String[0]);
                int line2 = Integer.parseInt(parts[1]);
                int column = Integer.parseInt(parts[2]);
                String header = parts[3];
                ArrayList<String> bodyLines = new ArrayList<String>();
                ++i;
                while (i < lines.length) {
                    if (lines[i].matches(".*:[0-9]+:[0-9]+:.*:.*")) {
                        --i;
                        break;
                    }
                    bodyLines.add(lines[i]);
                    ++i;
                }
                String body = String.join((CharSequence)"\n", bodyLines);
                CompilerError error = new CompilerError(file2, line2, column, header.strip(), body);
                if (currentFile == null) {
                    currentFile = file2;
                }
                currentErrors.add(error);
                if (currentFile.equals(file2)) continue;
                errors.add(new CompilerErrorsPerFile(currentFile, currentErrors));
                currentErrors = new ArrayList();
                currentFile = file2;
                continue;
            }
            errors.add(new RawMessage(errorLine));
        }
        if (!currentErrors.isEmpty()) {
            errors.add(new CompilerErrorsPerFile(currentFile, currentErrors));
        }
        return new CompilerErrorProcessor(errors);
    }

    String toPrettyString(boolean colorize) {
        return this.errors.stream().map(e -> e.toPrettyString(colorize)).collect(Collectors.joining("\n"));
    }

    private static List<String> suggestionsForMessage(String message) {
        ArrayList<String> suggestions = new ArrayList<String>();
        if (message.contains(" fatal error: 'bits/libc-header-start.h' file not found")) {
            suggestions.add("Try to install gcc-multilib");
        }
        if (message.contains(" fatal error: 'bpf_helpers.h' file not found")) {
            suggestions.add("Replace `#include 'bpf_helpers.h` with `#include <bpf/bpf_helpers.h>`");
        }
        return suggestions;
    }

    record CompilerError(Path file, int line, int column, String header, String body) {
        boolean isFatal() {
            return this.header.startsWith("fatal error:");
        }

        boolean isWarning() {
            return this.header.startsWith("warning:");
        }

        boolean isError() {
            return this.header.startsWith("error:");
        }

        boolean isNote() {
            return this.header.startsWith("note:");
        }

        public String toPrettyString(boolean colorize) {
            List<String> suggestions;
            Object message = String.format("%s:%d:%d: %s\n%s", this.file.toString().endsWith(".c") ? this.file.getFileName().toString() : "<bpf program>", this.line, this.column, this.header, this.body);
            if (colorize) {
                Attribute color = this.isFatal() || this.isError() ? Attribute.RED_TEXT() : (this.isWarning() ? Attribute.YELLOW_TEXT() : Attribute.NONE());
                message = Ansi.colorize((String)message, color);
            }
            if (!(suggestions = CompilerErrorProcessor.suggestionsForMessage((String)message)).isEmpty()) {
                message = (String)message + "\nSuggestions:\n" + String.join((CharSequence)"\n", suggestions);
            }
            return message;
        }
    }

    record CompilerErrorsPerFile(Path file, List<CompilerError> errors) implements PerFileOrRaw
    {
        boolean hasErrors() {
            return !this.errors.isEmpty();
        }

        @Override
        public String toPrettyString(boolean colorize) {
            if (!this.hasErrors()) {
                return "";
            }
            String errorString = "Summary: " + new ErrorNumbers(this.errors).toPrettyString();
            return Stream.concat(Stream.of(String.valueOf(this.file.toAbsolutePath()) + " has problems:" + (String)(this.errors.size() > 1 ? "\n" + errorString : "")), this.errors.stream().map(c -> c.toPrettyString(colorize))).collect(Collectors.joining("\n"));
        }

        record ErrorNumbers(int fatal, int warning, int error) {
            ErrorNumbers(List<CompilerError> errors) {
                this((int)errors.stream().filter(CompilerError::isFatal).count(), (int)errors.stream().filter(CompilerError::isWarning).count(), (int)errors.stream().filter(CompilerError::isError).count());
            }

            String toPrettyString() {
                ArrayList<String> parts = new ArrayList<String>();
                if (this.fatal > 0) {
                    parts.add(String.format("%d fatal error%s", this.fatal, this.fatal > 1 ? "s" : ""));
                }
                if (this.error > 0) {
                    parts.add(String.format("%d error%s", this.error, this.error > 1 ? "s" : ""));
                }
                if (this.warning > 0) {
                    parts.add(String.format("%d warning%s", this.warning, this.warning > 1 ? "s" : ""));
                }
                return String.join((CharSequence)", ", parts);
            }
        }
    }

    record RawMessage(String message) implements PerFileOrRaw
    {
        @Override
        public String toPrettyString(boolean colorize) {
            return this.message;
        }
    }

    static sealed interface PerFileOrRaw
    permits RawMessage, CompilerErrorsPerFile {
        public String toPrettyString(boolean var1);
    }
}

