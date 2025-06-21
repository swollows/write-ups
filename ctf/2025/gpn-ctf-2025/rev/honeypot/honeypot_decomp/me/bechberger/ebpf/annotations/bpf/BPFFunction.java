/*
 * Decompiled with CFR 0.153-SNAPSHOT (d6f6758-dirty).
 */
package me.bechberger.ebpf.annotations.bpf;

import java.lang.annotation.Documented;
import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;
import java.util.Set;

@Target(value={ElementType.METHOD})
@Retention(value=RetentionPolicy.RUNTIME)
@Documented
public @interface BPFFunction {
    public static final Set<String> autoAttachableSections = Set.of((Object)"fentry", (Object)"fexit", (Object)"kprobe", (Object)"kretprobe", (Object)"ksyscall", (Object)"tp");

    public String callTemplate() default "$name";

    public String headerTemplate() default "$name";

    public String lastStatement() default "";

    public String section() default "";

    public boolean autoAttach() default false;

    public String name() default "";

    public boolean addDefinition() default true;
}

