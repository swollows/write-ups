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
import me.bechberger.ebpf.runtime.DentryDefinitions;
import me.bechberger.ebpf.runtime.DevDefinitions;
import me.bechberger.ebpf.runtime.FsDefinitions;
import me.bechberger.ebpf.runtime.ListDefinitions;
import me.bechberger.ebpf.runtime.RdtDefinitions;
import me.bechberger.ebpf.runtime.ResctrlDefinitions;
import me.bechberger.ebpf.runtime.SuperDefinitions;
import me.bechberger.ebpf.runtime.VmDefinitions;
import me.bechberger.ebpf.runtime.WaitDefinitions;
import me.bechberger.ebpf.runtime.XattrDefinitions;
import me.bechberger.ebpf.runtime.runtime;
import me.bechberger.ebpf.type.Ptr;
import me.bechberger.ebpf.type.Struct;

public final class PseudoDefinitions {
    @NotUsableInJava
    @BuiltinBPFFunction
    public static int pseudo_lock_dev_mmap(Ptr<runtime.file> filp, Ptr<VmDefinitions.vm_area_struct> vma) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int pseudo_lock_dev_mremap(Ptr<VmDefinitions.vm_area_struct> area) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int pseudo_lock_dev_open(Ptr<runtime.inode> inode2, Ptr<runtime.file> filp) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int pseudo_lock_dev_release(Ptr<runtime.inode> inode2, Ptr<runtime.file> filp) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction(value="pseudo_lock_devnode((const struct device*)$arg1, $arg2)")
    public static String pseudo_lock_devnode(Ptr<runtime.device> dev, Ptr<@Unsigned @OriginalName(value="umode_t") Short> mode) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int pseudo_lock_fn(Ptr<?> _rdtgrp) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int pseudo_lock_measure_cycles(Ptr<runtime.rdtgroup> rdtgrp, int sel) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction(value="pseudo_lock_measure_trigger($arg1, (const u8*)$arg2, $arg3, $arg4)")
    public static @OriginalName(value="ssize_t") long pseudo_lock_measure_trigger(Ptr<runtime.file> file2, String user_buf, @Unsigned long count, Ptr<@OriginalName(value="loff_t") Long> ppos) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int pseudo_lock_region_init(Ptr<pseudo_lock_region> plr) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int pseudo_fs_fill_super(Ptr<SuperDefinitions.super_block> s2, Ptr<FsDefinitions.fs_context> fc) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void pseudo_fs_free(Ptr<FsDefinitions.fs_context> fc) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int pseudo_fs_get_tree(Ptr<FsDefinitions.fs_context> fc) {
        throw new MethodIsBPFRelatedFunction();
    }

    @Type(noCCodeGeneration=true, cType="struct pseudo_lock_pm_req")
    @NotUsableInJava
    public static class pseudo_lock_pm_req
    extends Struct {
        public ListDefinitions.list_head list;
        public DevDefinitions.dev_pm_qos_request req;
    }

    @Type(noCCodeGeneration=true, cType="struct pseudo_fs_context")
    @NotUsableInJava
    public static class pseudo_fs_context
    extends Struct {
        public Ptr<SuperDefinitions.super_operations> ops;
        public Ptr<Ptr<XattrDefinitions.xattr_handler>> xattr;
        public Ptr<DentryDefinitions.dentry_operations> dops;
        public @Unsigned long magic;
    }

    @Type(noCCodeGeneration=true, cType="struct pseudo_lock_region")
    @NotUsableInJava
    public static class pseudo_lock_region
    extends Struct {
        public Ptr<ResctrlDefinitions.resctrl_schema> s;
        public Ptr<RdtDefinitions.rdt_ctrl_domain> d;
        public @Unsigned int cbm;
        public @OriginalName(value="wait_queue_head_t") WaitDefinitions.wait_queue_head lock_thread_wq;
        public int thread_done;
        public int cpu;
        public @Unsigned int line_size;
        public @Unsigned int size;
        public Ptr<?> kmem;
        public @Unsigned int minor;
        public Ptr<runtime.dentry> debugfs_dir;
        public ListDefinitions.list_head pm_reqs;
    }
}

