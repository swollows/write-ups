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
import me.bechberger.ebpf.runtime.KernfsDefinitions;
import me.bechberger.ebpf.runtime.RdtDefinitions;
import me.bechberger.ebpf.runtime.ResctrlDefinitions;
import me.bechberger.ebpf.runtime.SeqDefinitions;
import me.bechberger.ebpf.runtime.misc;
import me.bechberger.ebpf.runtime.runtime;
import me.bechberger.ebpf.type.Ptr;
import me.bechberger.ebpf.type.Struct;

public final class RdtgroupDefinitions {
    @NotUsableInJava
    @BuiltinBPFFunction
    public static boolean rdtgroup_cbm_overlaps_pseudo_locked(Ptr<RdtDefinitions.rdt_ctrl_domain> d, @Unsigned long cbm) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int rdtgroup_locksetup_enter(Ptr<runtime.rdtgroup> rdtgrp) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int rdtgroup_locksetup_exit(Ptr<runtime.rdtgroup> rdtgrp) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int rdtgroup_locksetup_user_restore(Ptr<runtime.rdtgroup> rdtgrp) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int rdtgroup_pseudo_lock_create(Ptr<runtime.rdtgroup> rdtgrp) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void rdtgroup_pseudo_lock_remove(Ptr<runtime.rdtgroup> rdtgrp) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static boolean rdtgroup_pseudo_locked_in_hierarchy(Ptr<RdtDefinitions.rdt_ctrl_domain> d) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static boolean __rdtgroup_cbm_overlaps(Ptr<RdtDefinitions.rdt_resource> r, Ptr<RdtDefinitions.rdt_ctrl_domain> d, @Unsigned long cbm, int closid, ResctrlDefinitions.resctrl_conf_type type2, boolean exclusive) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int rdtgroup_add_files(Ptr<KernfsDefinitions.kernfs_node> kn, @Unsigned long fflags) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static boolean rdtgroup_cbm_overlaps(Ptr<ResctrlDefinitions.resctrl_schema> s2, Ptr<RdtDefinitions.rdt_ctrl_domain> d, @Unsigned long cbm, int closid, boolean exclusive) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static @Unsigned int rdtgroup_cbm_to_size(Ptr<RdtDefinitions.rdt_resource> r, Ptr<RdtDefinitions.rdt_ctrl_domain> d, @Unsigned long cbm) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int rdtgroup_closid_show(Ptr<KernfsDefinitions.kernfs_open_file> of, Ptr<SeqDefinitions.seq_file> s2, Ptr<?> v) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int rdtgroup_cpus_show(Ptr<KernfsDefinitions.kernfs_open_file> of, Ptr<SeqDefinitions.seq_file> s2, Ptr<?> v) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static @OriginalName(value="ssize_t") long rdtgroup_cpus_write(Ptr<KernfsDefinitions.kernfs_open_file> of, String buf, @Unsigned long nbytes, @OriginalName(value="loff_t") long off) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void rdtgroup_exit() {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static @OriginalName(value="ssize_t") long rdtgroup_file_write(Ptr<KernfsDefinitions.kernfs_open_file> of, String buf, @Unsigned long nbytes, @OriginalName(value="loff_t") long off) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction(value="rdtgroup_get_rftype_by_name((const u8*)$arg1)")
    public static Ptr<rftype> rdtgroup_get_rftype_by_name(String name) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int rdtgroup_init() {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static Ptr<runtime.rdtgroup> rdtgroup_kn_lock_live(Ptr<KernfsDefinitions.kernfs_node> kn) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction(value="rdtgroup_kn_mode_restore($arg1, (const u8*)$arg2, $arg3)")
    public static int rdtgroup_kn_mode_restore(Ptr<runtime.rdtgroup> r, String name, @Unsigned @OriginalName(value="umode_t") short mask) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction(value="rdtgroup_kn_mode_restrict($arg1, (const u8*)$arg2)")
    public static int rdtgroup_kn_mode_restrict(Ptr<runtime.rdtgroup> r, String name) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void rdtgroup_kn_put(Ptr<runtime.rdtgroup> rdtgrp, Ptr<KernfsDefinitions.kernfs_node> kn) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int rdtgroup_kn_set_ugid(Ptr<KernfsDefinitions.kernfs_node> kn) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void rdtgroup_kn_unlock(Ptr<KernfsDefinitions.kernfs_node> kn) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction(value="rdtgroup_mkdir($arg1, (const u8*)$arg2, $arg3)")
    public static int rdtgroup_mkdir(Ptr<KernfsDefinitions.kernfs_node> parent_kn, String name, @Unsigned @OriginalName(value="umode_t") short mode) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction(value="rdtgroup_mkdir_ctrl_mon($arg1, (const u8*)$arg2, $arg3)")
    public static int rdtgroup_mkdir_ctrl_mon(Ptr<KernfsDefinitions.kernfs_node> parent_kn, String name, @Unsigned @OriginalName(value="umode_t") short mode) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int rdtgroup_mkdir_info_resdir(Ptr<?> priv, String name, @Unsigned long fflags) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static misc.rdtgrp_mode rdtgroup_mode_by_closid(int closid) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int rdtgroup_mode_show(Ptr<KernfsDefinitions.kernfs_open_file> of, Ptr<SeqDefinitions.seq_file> s2, Ptr<?> v) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static @OriginalName(value="ssize_t") long rdtgroup_mode_write(Ptr<KernfsDefinitions.kernfs_open_file> of, String buf, @Unsigned long nbytes, @OriginalName(value="loff_t") long off) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction(value="rdtgroup_rename($arg1, $arg2, (const u8*)$arg3)")
    public static int rdtgroup_rename(Ptr<KernfsDefinitions.kernfs_node> kn, Ptr<KernfsDefinitions.kernfs_node> new_parent, String new_name) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int rdtgroup_rmdir(Ptr<KernfsDefinitions.kernfs_node> kn) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int rdtgroup_rmdir_ctrl(Ptr<runtime.rdtgroup> rdtgrp, @OriginalName(value="cpumask_var_t") Ptr<runtime.cpumask> tmpmask) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int rdtgroup_rmid_show(Ptr<KernfsDefinitions.kernfs_open_file> of, Ptr<SeqDefinitions.seq_file> s2, Ptr<?> v) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int rdtgroup_seqfile_show(Ptr<SeqDefinitions.seq_file> m, Ptr<?> arg2) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int rdtgroup_show_options(Ptr<SeqDefinitions.seq_file> seq, Ptr<KernfsDefinitions.kernfs_root> kf) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int rdtgroup_size_show(Ptr<KernfsDefinitions.kernfs_open_file> of, Ptr<SeqDefinitions.seq_file> s2, Ptr<?> v) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int rdtgroup_tasks_assigned(Ptr<runtime.rdtgroup> r) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int rdtgroup_tasks_show(Ptr<KernfsDefinitions.kernfs_open_file> of, Ptr<SeqDefinitions.seq_file> s2, Ptr<?> v) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static @OriginalName(value="ssize_t") long rdtgroup_tasks_write(Ptr<KernfsDefinitions.kernfs_open_file> of, String buf, @Unsigned long nbytes, @OriginalName(value="loff_t") long off) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int rdtgroup_mondata_show(Ptr<SeqDefinitions.seq_file> m, Ptr<?> arg2) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int rdtgroup_schemata_show(Ptr<KernfsDefinitions.kernfs_open_file> of, Ptr<SeqDefinitions.seq_file> s2, Ptr<?> v) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static @OriginalName(value="ssize_t") long rdtgroup_schemata_write(Ptr<KernfsDefinitions.kernfs_open_file> of, String buf, @Unsigned long nbytes, @OriginalName(value="loff_t") long off) {
        throw new MethodIsBPFRelatedFunction();
    }

    @Type(noCCodeGeneration=true, cType="struct rftype")
    @NotUsableInJava
    public static class rftype
    extends Struct {
        public String name;
        public @Unsigned @OriginalName(value="umode_t") short mode;
        public Ptr<KernfsDefinitions.kernfs_ops> kf_ops;
        public @Unsigned long flags;
        public @Unsigned long fflags;
        public Ptr<?> seq_show;
        public Ptr<?> write;
    }
}

