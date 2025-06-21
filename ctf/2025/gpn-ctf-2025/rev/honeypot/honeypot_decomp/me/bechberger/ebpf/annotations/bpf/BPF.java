/*
 * Decompiled with CFR 0.153-SNAPSHOT (d6f6758-dirty).
 */
package me.bechberger.ebpf.annotations.bpf;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

@Retention(value=RetentionPolicy.RUNTIME)
@Target(value={ElementType.TYPE})
public @interface BPF {
    public String license() default "";

    public Class<?>[] includeTypes() default {};

    public String[] includes() default {"vmlinux.h", "bpf/bpf_helpers.h", "bpf/bpf_endian.h", "bpf/bpf_tracing.h", "bpf/bpf_core_read.h"};
}

