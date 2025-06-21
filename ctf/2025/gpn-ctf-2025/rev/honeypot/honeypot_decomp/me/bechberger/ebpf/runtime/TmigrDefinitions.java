/*
 * Decompiled with CFR 0.153-SNAPSHOT (d6f6758-dirty).
 */
package me.bechberger.ebpf.runtime;

import me.bechberger.ebpf.annotations.OriginalName;
import me.bechberger.ebpf.annotations.Type;
import me.bechberger.ebpf.annotations.Unsigned;
import me.bechberger.ebpf.annotations.bpf.BuiltinBPFFunction;
import me.bechberger.ebpf.annotations.bpf.MethodIsBPFRelatedFunction;
import me.bechberger.ebpf.annotations.bpf.NotUsableInJava;
import me.bechberger.ebpf.runtime.AnonDefinitions;
import me.bechberger.ebpf.runtime.AtomicDefinitions;
import me.bechberger.ebpf.runtime.ListDefinitions;
import me.bechberger.ebpf.runtime.RawDefinitions;
import me.bechberger.ebpf.runtime.misc;
import me.bechberger.ebpf.type.Ptr;
import me.bechberger.ebpf.type.Struct;
import me.bechberger.ebpf.type.Union;

public final class TmigrDefinitions {
    @NotUsableInJava
    @BuiltinBPFFunction
    public static void __tmigr_cpu_activate(Ptr<tmigr_cpu> tmc) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static boolean tmigr_active_up(Ptr<tmigr_group> group, Ptr<tmigr_group> child, Ptr<tmigr_walk> data) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void tmigr_connect_child_parent(Ptr<tmigr_group> child, Ptr<tmigr_group> parent, boolean activate) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void tmigr_cpu_activate() {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static @Unsigned long tmigr_cpu_deactivate(@Unsigned long nextexp) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static @Unsigned long tmigr_cpu_new_timer(@Unsigned long nextexp) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int tmigr_cpu_offline(@Unsigned int cpu2) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int tmigr_cpu_online(@Unsigned int cpu2) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int tmigr_cpu_prepare(@Unsigned int cpu2) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void tmigr_handle_remote() {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void tmigr_handle_remote_cpu(@Unsigned int cpu2, @Unsigned long now, @Unsigned long jif) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static boolean tmigr_handle_remote_up(Ptr<tmigr_group> group, Ptr<tmigr_group> child, Ptr<tmigr_walk> data) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static boolean tmigr_inactive_up(Ptr<tmigr_group> group, Ptr<tmigr_group> child, Ptr<tmigr_walk> data) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int tmigr_init() {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static Ptr<tmigr_event> tmigr_next_groupevt(Ptr<tmigr_group> group) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static @Unsigned long tmigr_quick_check(@Unsigned long nextevt) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static boolean tmigr_requires_handle_remote() {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int tmigr_setup_groups(@Unsigned int cpu2, @Unsigned int node2) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static long tmigr_trigger_active(Ptr<?> unused) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static boolean tmigr_update_events(Ptr<tmigr_group> group, Ptr<tmigr_group> child, Ptr<tmigr_walk> data) {
        throw new MethodIsBPFRelatedFunction();
    }

    @Type(noCCodeGeneration=true, cType="struct tmigr_walk")
    @NotUsableInJava
    public static class tmigr_walk
    extends Struct {
        public @Unsigned long nextexp;
        public @Unsigned long firstexp;
        public Ptr<tmigr_event> evt;
        public char childmask;
        public boolean remote;
        public @Unsigned long basej;
        public @Unsigned long now;
        public boolean check;
        public boolean tmc_active;
    }

    @Type(noCCodeGeneration=true, cType="union tmigr_state")
    @NotUsableInJava
    public static class tmigr_state
    extends Union {
        public @Unsigned int state;
        public AnonDefinitions.anon_member_of_tmigr_state anon1;
    }

    @Type(noCCodeGeneration=true, cType="struct tmigr_cpu")
    @NotUsableInJava
    public static class tmigr_cpu
    extends Struct {
        public @OriginalName(value="raw_spinlock_t") RawDefinitions.raw_spinlock lock;
        public boolean online;
        public boolean idle;
        public boolean remote;
        public Ptr<tmigr_group> tmgroup;
        public char groupmask;
        public @Unsigned long wakeup;
        public tmigr_event cpuevt;
    }

    @Type(noCCodeGeneration=true, cType="struct tmigr_group")
    @NotUsableInJava
    public static class tmigr_group
    extends Struct {
        public @OriginalName(value="raw_spinlock_t") RawDefinitions.raw_spinlock lock;
        public Ptr<tmigr_group> parent;
        public tmigr_event groupevt;
        public @Unsigned long next_expiry;
        public misc.timerqueue_head events;
        public AtomicDefinitions.atomic_t migr_state;
        public @Unsigned int level;
        public int numa_node;
        public @Unsigned int num_children;
        public char groupmask;
        public ListDefinitions.list_head list;
    }

    @Type(noCCodeGeneration=true, cType="struct tmigr_event")
    @NotUsableInJava
    public static class tmigr_event
    extends Struct {
        public misc.timerqueue_node nextevt;
        public @Unsigned int cpu;
        public boolean ignore;
    }
}

