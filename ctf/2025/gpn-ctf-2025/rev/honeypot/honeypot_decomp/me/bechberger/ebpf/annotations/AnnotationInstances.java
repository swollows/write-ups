/*
 * Decompiled with CFR 0.153-SNAPSHOT (d6f6758-dirty).
 */
package me.bechberger.ebpf.annotations;

import java.lang.annotation.Annotation;
import me.bechberger.ebpf.annotations.Size;
import me.bechberger.ebpf.annotations.Unsigned;

public class AnnotationInstances {
    public static final Unsigned UNSIGNED = new Unsigned(){

        @Override
        public Class<? extends Annotation> annotationType() {
            return Unsigned.class;
        }
    };

    public static Size size(final int value) {
        return new Size(){

            @Override
            public Class<? extends Annotation> annotationType() {
                return Size.class;
            }

            @Override
            public int value() {
                return value;
            }
        };
    }
}

