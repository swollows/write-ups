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
import me.bechberger.ebpf.runtime.BufferDefinitions;
import me.bechberger.ebpf.runtime.Ext4Definitions;
import me.bechberger.ebpf.runtime.FlowDefinitions;
import me.bechberger.ebpf.runtime.MmDefinitions;
import me.bechberger.ebpf.runtime.MntDefinitions;
import me.bechberger.ebpf.runtime.PteDefinitions;
import me.bechberger.ebpf.runtime.UserDefinitions;
import me.bechberger.ebpf.runtime.VmDefinitions;
import me.bechberger.ebpf.runtime.misc;
import me.bechberger.ebpf.runtime.runtime;
import me.bechberger.ebpf.type.Ptr;
import me.bechberger.ebpf.type.Struct;

public final class MakeDefinitions {
    @NotUsableInJava
    @BuiltinBPFFunction(value="make_flow_keys_digest($arg1, (const struct flow_keys*)$arg2)")
    public static void make_flow_keys_digest(Ptr<FlowDefinitions.flow_keys_digest> digest, Ptr<FlowDefinitions.flow_keys> flow) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void make_bad_inode(Ptr<runtime.inode> inode2) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void make_empty_dir_inode(Ptr<runtime.inode> inode2) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static misc.kgid_t make_kgid(Ptr<UserDefinitions.user_namespace> ns, @Unsigned @OriginalName(value="gid_t") int gid) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static misc.kprojid_t make_kprojid(Ptr<UserDefinitions.user_namespace> ns, @Unsigned @OriginalName(value="projid_t") int projid) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static misc.kuid_t make_kuid(Ptr<UserDefinitions.user_namespace> ns, @Unsigned @OriginalName(value="uid_t") int uid) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void make_uffd_wp_pte(Ptr<VmDefinitions.vm_area_struct> vma, @Unsigned long addr2, Ptr<PteDefinitions.pte_t> pte, PteDefinitions.pte_t ptent) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static  @OriginalName(value="vfsgid_t") misc.kgid_t make_vfsgid(Ptr<MntDefinitions.mnt_idmap> idmap, Ptr<UserDefinitions.user_namespace> fs_userns, misc.kgid_t kgid) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static  @OriginalName(value="vfsuid_t") misc.kuid_t make_vfsuid(Ptr<MntDefinitions.mnt_idmap> idmap, Ptr<UserDefinitions.user_namespace> fs_userns, misc.kuid_t kuid) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int make_device_exclusive_range(Ptr<MmDefinitions.mm_struct> mm, @Unsigned long start, @Unsigned long end, Ptr<Ptr<runtime.page>> pages, Ptr<?> owner) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int make_indexed_dir(Ptr< @OriginalName(value="handle_t") Jbd2Definitions.jbd2_journal_handle> handle, Ptr<Ext4Definitions.ext4_filename> fname2, Ptr<runtime.inode> dir, Ptr<runtime.inode> inode2, Ptr<BufferDefinitions.buffer_head> bh) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction(value="make_slot_name((const u8*)$arg1)")
    public static String make_slot_name(String name) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void make_task_dead(int signr) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static Ptr<?> make_alloc_exact(@Unsigned long addr2, @Unsigned int order, @Unsigned long size) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void make_lowmem_page_readonly(Ptr<?> vaddr) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void make_lowmem_page_readwrite(Ptr<?> vaddr) {
        throw new MethodIsBPFRelatedFunction();
    }

    @Type(noCCodeGeneration=true, cType="struct make_exclusive_args")
    @NotUsableInJava
    public static class make_exclusive_args
    extends Struct {
        public Ptr<MmDefinitions.mm_struct> mm;
        public @Unsigned long address;
        public Ptr<?> owner;
        public boolean valid;
    }
}

