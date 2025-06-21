/*
 * Decompiled with CFR 0.153-SNAPSHOT (d6f6758-dirty).
 */
package me.bechberger.ebpf.bpf.compiler;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;
import me.bechberger.cast.CAST;
import me.bechberger.ebpf.bpf.compiler.MethodTemplateCache;

public record MethodHeaderTemplate(String raw, List<TemplatePart> parts) {
    static MethodHeaderTemplate parse(String template) {
        if (template.isEmpty()) {
            throw new MethodTemplateCache.TemplateRenderException("Empty header template");
        }
        if (template.endsWith(";")) {
            template = template.substring(0, template.length() - 1);
        }
        String[] parts = template.split("\\$");
        ArrayList<TemplatePart> templateParts = new ArrayList<TemplatePart>();
        for (int i = 0; i < parts.length; ++i) {
            String part = parts[i];
            if (part.isEmpty()) continue;
            if (i == 0) {
                templateParts.add(new TemplatePart.Verbatim(part));
                continue;
            }
            if (part.startsWith("name")) {
                templateParts.add(new TemplatePart.Name());
                part = part.substring(4);
            } else if (part.startsWith("return")) {
                templateParts.add(new TemplatePart.Return());
                part = part.substring(6);
            } else if (part.startsWith("params")) {
                templateParts.add(new TemplatePart.Params());
                part = part.substring(6);
            } else {
                int k;
                int j;
                for (j = 0; j < part.length() && Character.isAlphabetic(part.charAt(j)); ++j) {
                }
                String name = part.substring(0, j);
                if (name.isEmpty()) {
                    throw new MethodTemplateCache.TemplateRenderException("Unknown template part: $" + part);
                }
                for (k = j; k < part.length() && Character.isDigit(part.charAt(k)); ++k) {
                }
                int num = Integer.parseInt(part.substring(j, k));
                switch (name) {
                    case "paramName": {
                        templateParts.add(new TemplatePart.ParamName(num - 1));
                        break;
                    }
                    case "paramType": {
                        templateParts.add(new TemplatePart.ParamType(num - 1));
                        break;
                    }
                    case "param": {
                        templateParts.add(new TemplatePart.Param(num - 1));
                        break;
                    }
                    default: {
                        throw new MethodTemplateCache.TemplateRenderException("Unknown template part: $" + name + num);
                    }
                }
                part = part.substring(k);
            }
            if (part.isEmpty()) continue;
            templateParts.add(new TemplatePart.Verbatim(part));
        }
        if (templateParts.size() == 1 && templateParts.getFirst() instanceof TemplatePart.Name) {
            return new MethodHeaderTemplate(template, List.of((Object)new TemplatePart.Return(), (Object)new TemplatePart.Verbatim(" "), (Object)new TemplatePart.Name(), (Object)new TemplatePart.Verbatim("("), (Object)new TemplatePart.Params(), (Object)new TemplatePart.Verbatim(")")));
        }
        return new MethodHeaderTemplate(template, templateParts);
    }

    public CAST.Declarator.FunctionHeader call(CAST.Declarator.FunctionDeclarator declarator) {
        return this.call(declarator, "");
    }

    public CAST.Declarator.FunctionHeader call(CAST.Declarator.FunctionDeclarator declarator, String prefix) {
        if (this.raw.equals("$name")) {
            return new CAST.Declarator.VerbatimFunctionDeclarator(prefix + declarator.toPrettyString());
        }
        return new CAST.Declarator.VerbatimFunctionDeclarator(prefix + this.parts.stream().map(part -> part.render(declarator)).collect(Collectors.joining("")));
    }

    static sealed interface TemplatePart {
        public String render(CAST.Declarator.FunctionDeclarator var1);

        public record Params() implements TemplatePart
        {
            @Override
            public String render(CAST.Declarator.FunctionDeclarator declarator) {
                return declarator.parameters().stream().map(CAST::toPrettyString).collect(Collectors.joining(", "));
            }
        }

        public record Param(int n) implements TemplatePart
        {
            @Override
            public String render(CAST.Declarator.FunctionDeclarator declarator) {
                if (this.n >= declarator.parameters().size()) {
                    throw new MethodTemplateCache.TemplateRenderException("Parameter " + (this.n + 1) + " not given for $param" + (this.n + 1));
                }
                return declarator.parameters().get(this.n).toPrettyString();
            }
        }

        public record ParamType(int n) implements TemplatePart
        {
            @Override
            public String render(CAST.Declarator.FunctionDeclarator declarator) {
                if (this.n >= declarator.parameters().size()) {
                    throw new MethodTemplateCache.TemplateRenderException("Parameter " + (this.n + 1) + " not given for $paramType" + (this.n + 1));
                }
                return declarator.parameters().get(this.n).declarator().toPrettyString();
            }
        }

        public record ParamName(int n) implements TemplatePart
        {
            @Override
            public String render(CAST.Declarator.FunctionDeclarator declarator) {
                if (this.n >= declarator.parameters().size()) {
                    throw new MethodTemplateCache.TemplateRenderException("Parameter " + (this.n + 1) + " not given for $paramName" + (this.n + 1));
                }
                return declarator.parameters().get(this.n).name().toString();
            }
        }

        public record Return() implements TemplatePart
        {
            @Override
            public String render(CAST.Declarator.FunctionDeclarator declarator) {
                return declarator.returnValue().toPrettyString();
            }
        }

        public record Name() implements TemplatePart
        {
            @Override
            public String render(CAST.Declarator.FunctionDeclarator declarator) {
                return declarator.name().toString();
            }
        }

        public record Verbatim(String verb) implements TemplatePart
        {
            @Override
            public String render(CAST.Declarator.FunctionDeclarator declarator) {
                return this.verb;
            }
        }
    }
}

