/*
 * Decompiled with CFR 0.153-SNAPSHOT (d6f6758-dirty).
 */
package me.bechberger.ebpf.runtime;

import me.bechberger.ebpf.annotations.Type;
import me.bechberger.ebpf.annotations.bpf.BuiltinBPFFunction;
import me.bechberger.ebpf.annotations.bpf.MethodIsBPFRelatedFunction;
import me.bechberger.ebpf.annotations.bpf.NotUsableInJava;
import me.bechberger.ebpf.runtime.AttributeDefinitions;
import me.bechberger.ebpf.runtime.runtime;
import me.bechberger.ebpf.type.Ptr;
import me.bechberger.ebpf.type.Struct;

public final class TransportDefinitions {
    @NotUsableInJava
    @BuiltinBPFFunction
    public static int transport_add_class_device(Ptr<AttributeDefinitions.attribute_container> cont, Ptr<runtime.device> dev, Ptr<runtime.device> classdev) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int transport_add_device(Ptr<runtime.device> dev) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int transport_class_register(Ptr<transport_class> tclass) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void transport_class_unregister(Ptr<transport_class> tclass) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int transport_configure(Ptr<AttributeDefinitions.attribute_container> cont, Ptr<runtime.device> dev, Ptr<runtime.device> cdev2) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void transport_configure_device(Ptr<runtime.device> dev) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void transport_destroy_classdev(Ptr<AttributeDefinitions.attribute_container> cont, Ptr<runtime.device> dev, Ptr<runtime.device> classdev) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void transport_destroy_device(Ptr<runtime.device> dev) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int transport_remove_classdev(Ptr<AttributeDefinitions.attribute_container> cont, Ptr<runtime.device> dev, Ptr<runtime.device> classdev) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void transport_remove_device(Ptr<runtime.device> dev) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int transport_setup_classdev(Ptr<AttributeDefinitions.attribute_container> cont, Ptr<runtime.device> dev, Ptr<runtime.device> classdev) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void transport_setup_device(Ptr<runtime.device> dev) {
        throw new MethodIsBPFRelatedFunction();
    }

    @Type(noCCodeGeneration=true, cType="struct transport_class")
    @NotUsableInJava
    public static class transport_class
    extends Struct {
        public runtime._class _class;
        public Ptr<?> setup;
        public Ptr<?> configure;
        public Ptr<?> remove;
    }

    @Type(noCCodeGeneration=true, cType="struct transport_container")
    @NotUsableInJava
    public static class transport_container
    extends Struct {
        public AttributeDefinitions.attribute_container ac;
        public Ptr<AttributeDefinitions.attribute_group> statistics;
    }
}

