/*
 * Decompiled with CFR 0.153-SNAPSHOT (d6f6758-dirty).
 */
package me.bechberger.ebpf.runtime;

import me.bechberger.ebpf.annotations.Type;
import me.bechberger.ebpf.annotations.bpf.BuiltinBPFFunction;
import me.bechberger.ebpf.annotations.bpf.MethodIsBPFRelatedFunction;
import me.bechberger.ebpf.annotations.bpf.NotUsableInJava;
import me.bechberger.ebpf.runtime.ListDefinitions;
import me.bechberger.ebpf.runtime.misc;
import me.bechberger.ebpf.runtime.runtime;
import me.bechberger.ebpf.type.Ptr;
import me.bechberger.ebpf.type.Struct;
import me.bechberger.ebpf.type.Union;

public final class RvDefinitions {
    @NotUsableInJava
    @BuiltinBPFFunction
    public static void rv_printk_reaction(String msg) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void rv_panic_reaction(String msg) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int __rv_register_reactor(Ptr<rv_reactor> reactor) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void rv_nop_reaction(String msg) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static boolean rv_reacting_on() {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int rv_register_reactor(Ptr<rv_reactor> reactor) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int rv_unregister_reactor(Ptr<rv_reactor> reactor) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int __rv_disable_monitor(Ptr<rv_monitor_def> mdef, boolean sync2) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int rv_disable_monitor(Ptr<rv_monitor_def> mdef) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int rv_enable_monitor(Ptr<rv_monitor_def> mdef) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int rv_get_task_monitor_slot() {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int rv_init_interface() {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static boolean rv_monitoring_on() {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void rv_put_task_monitor_slot(int slot2) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int rv_register_monitor(Ptr<rv_monitor> monitor) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int rv_unregister_monitor(Ptr<rv_monitor> monitor) {
        throw new MethodIsBPFRelatedFunction();
    }

    @Type(noCCodeGeneration=true, cType="struct rv_monitor_def")
    @NotUsableInJava
    public static class rv_monitor_def
    extends Struct {
        public ListDefinitions.list_head list;
        public Ptr<rv_monitor> monitor;
        public Ptr<runtime.dentry> root_d;
        public Ptr<rv_reactor_def> rdef;
        public boolean reacting;
        public boolean task_monitor;
    }

    @Type(noCCodeGeneration=true, cType="struct rv_reactor_def")
    @NotUsableInJava
    public static class rv_reactor_def
    extends Struct {
        public ListDefinitions.list_head list;
        public Ptr<rv_reactor> reactor;
        public int counter;
    }

    @Type(noCCodeGeneration=true, cType="struct rv_interface")
    @NotUsableInJava
    public static class rv_interface
    extends Struct {
        public Ptr<runtime.dentry> root_dir;
        public Ptr<runtime.dentry> monitors_dir;
    }

    @Type(noCCodeGeneration=true, cType="struct rv_monitor")
    @NotUsableInJava
    public static class rv_monitor
    extends Struct {
        public String name;
        public String description;
        public boolean enabled;
        public Ptr<?> enable;
        public Ptr<?> disable;
        public Ptr<?> reset;
        public Ptr<?> react;
    }

    @Type(noCCodeGeneration=true, cType="struct rv_reactor")
    @NotUsableInJava
    public static class rv_reactor
    extends Struct {
        public String name;
        public String description;
        public Ptr<?> react;
    }

    @Type(noCCodeGeneration=true, cType="union rv_task_monitor")
    @NotUsableInJava
    public static class rv_task_monitor
    extends Union {
        public misc.da_monitor da_mon;
    }
}

