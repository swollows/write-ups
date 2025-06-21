/*
 * Decompiled with CFR 0.153-SNAPSHOT (d6f6758-dirty).
 */
package me.bechberger.ebpf.annotations.bpf;

import java.lang.annotation.Documented;
import java.lang.annotation.ElementType;
import java.lang.annotation.Repeatable;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;
import me.bechberger.ebpf.annotations.bpf.PropertyDefinitions;

@Target(value={ElementType.TYPE})
@Retention(value=RetentionPolicy.RUNTIME)
@Documented
@Repeatable(value=PropertyDefinitions.class)
public @interface PropertyDefinition {
    public String name();

    public String defaultValue();

    public String regexp() default ".*";
}

