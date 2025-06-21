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
import me.bechberger.ebpf.runtime.ActionDefinitions;
import me.bechberger.ebpf.runtime.HistDefinitions;
import me.bechberger.ebpf.runtime.Jbd2Definitions;
import me.bechberger.ebpf.runtime.KernelDefinitions;
import me.bechberger.ebpf.runtime.RcuDefinitions;
import me.bechberger.ebpf.runtime.TracingDefinitions;
import me.bechberger.ebpf.runtime.VmDefinitions;
import me.bechberger.ebpf.runtime.runtime;
import me.bechberger.ebpf.type.Enum;
import me.bechberger.ebpf.type.Ptr;
import me.bechberger.ebpf.type.Struct;
import me.bechberger.ebpf.type.TypedEnum;
import me.bechberger.ebpf.type.Union;

public final class TrackDefinitions {
    @NotUsableInJava
    @BuiltinBPFFunction
    public static int __track_dentry_update(Ptr<@OriginalName(value="handle_t") Jbd2Definitions.jbd2_journal_handle> handle, Ptr<runtime.inode> inode2, Ptr<?> arg2, boolean update) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void track_data_destroy(Ptr<HistDefinitions.hist_trigger_data> hist_data, Ptr<ActionDefinitions.action_data> data) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void track_data_free(Ptr<track_data> track_data2) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int track_pfn_copy(Ptr<VmDefinitions.vm_area_struct> vma) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void track_pfn_insert(Ptr<VmDefinitions.vm_area_struct> vma, Ptr< @OriginalName(value="pgprot_t") runtime.pgprot> prot, @OriginalName(value="pfn_t") KernelDefinitions.kernel_cap_t pfn) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int track_pfn_remap(Ptr<VmDefinitions.vm_area_struct> vma, Ptr< @OriginalName(value="pgprot_t") runtime.pgprot> prot, @Unsigned long pfn, @Unsigned long addr2, @Unsigned long size) {
        throw new MethodIsBPFRelatedFunction();
    }

    @Type(noCCodeGeneration=true, cType="struct { short unsigned int track_information_length; u8 track_lsb; u8 session_lsb; u8 reserved1; u8 track_mode; u8 copy; u8 damage; u8 reserved2; u8 data_mode; u8 fp; u8 packet; u8 blank; u8 rt; u8 nwa_v; u8 lra_v; u8 reserved3; unsigned int track_start; unsigned int next_writable; unsigned int free_blocks; unsigned int fixed_packet_size; unsigned int track_size; unsigned int last_rec_address; }")
    @NotUsableInJava
    public static class track_information
    extends Struct {
        public @Unsigned @OriginalName(value="__be16") short track_information_length;
        public char track_lsb;
        public char session_lsb;
        public char reserved1;
        public char track_mode;
        public char copy;
        public char damage;
        public char reserved2;
        public char data_mode;
        public char fp;
        public char packet;
        public char blank;
        public char rt;
        public char nwa_v;
        public char lra_v;
        public char reserved3;
        public @Unsigned @OriginalName(value="__be32") int track_start;
        public @Unsigned @OriginalName(value="__be32") int next_writable;
        public @Unsigned @OriginalName(value="__be32") int free_blocks;
        public @Unsigned @OriginalName(value="__be32") int fixed_packet_size;
        public @Unsigned @OriginalName(value="__be32") int track_size;
        public @Unsigned @OriginalName(value="__be32") int last_rec_address;
    }

    @Type(noCCodeGeneration=true, cType="union { long unsigned int refcount; struct rcu_work rwork; }")
    @NotUsableInJava
    public static class track_of_acpi_ioremap
    extends Union {
        public @Unsigned long refcount;
        public RcuDefinitions.rcu_work rwork;
    }

    @Type(noCCodeGeneration=true, cType="struct __track_range_args")
    @NotUsableInJava
    public static class __track_range_args
    extends Struct {
        public @Unsigned @OriginalName(value="ext4_lblk_t") int start;
        public @Unsigned @OriginalName(value="ext4_lblk_t") int end;
    }

    @Type(noCCodeGeneration=true, cType="struct __track_dentry_update_args")
    @NotUsableInJava
    public static class __track_dentry_update_args
    extends Struct {
        public Ptr<runtime.dentry> dentry;
        public int op;
    }

    @Type(noCCodeGeneration=true, cType="enum track_item")
    public static enum track_item implements Enum<track_item>,
    TypedEnum<track_item, Integer>
    {
        TRACK_ALLOC,
        TRACK_FREE;

    }

    @Type(noCCodeGeneration=true, cType="struct track_data")
    @NotUsableInJava
    public static class track_data
    extends Struct {
        public @Unsigned long track_val;
        public boolean updated;
        public @Unsigned int key_len;
        public Ptr<?> key;
        public TracingDefinitions.tracing_map_elt elt;
        public Ptr<ActionDefinitions.action_data> action_data;
        public Ptr<HistDefinitions.hist_trigger_data> hist_data;
    }

    @Type(noCCodeGeneration=true, cType="struct { u8 *var_str; struct hist_field *var_ref; struct hist_field *track_var; _Bool (*check_val)(long long unsigned int, long long unsigned int); void (*save_data)(struct hist_trigger_data*, struct tracing_map_elt*, struct trace_buffer*, void*, struct ring_buffer_event*, void*, struct action_data*, long long unsigned int*); }")
    @NotUsableInJava
    public static class track_data_of_anon_member_of_action_data
    extends Struct {
        public String var_str;
        public Ptr<HistDefinitions.hist_field> var_ref;
        public Ptr<HistDefinitions.hist_field> track_var;
        public @OriginalName(value="check_track_val_fn_t") Ptr<?> check_val;
        public @OriginalName(value="action_fn_t") Ptr<?> save_data;
    }
}

