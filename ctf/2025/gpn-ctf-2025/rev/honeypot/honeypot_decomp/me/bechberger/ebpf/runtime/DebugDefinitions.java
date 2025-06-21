/*
 * Decompiled with CFR 0.153-SNAPSHOT (d6f6758-dirty).
 */
package me.bechberger.ebpf.runtime;

import me.bechberger.ebpf.annotations.OriginalName;
import me.bechberger.ebpf.annotations.Size;
import me.bechberger.ebpf.annotations.Type;
import me.bechberger.ebpf.annotations.Unsigned;
import me.bechberger.ebpf.annotations.bpf.BuiltinBPFFunction;
import me.bechberger.ebpf.annotations.bpf.MethodIsBPFRelatedFunction;
import me.bechberger.ebpf.annotations.bpf.NotUsableInJava;
import me.bechberger.ebpf.runtime.EthnlDefinitions;
import me.bechberger.ebpf.runtime.GenlDefinitions;
import me.bechberger.ebpf.runtime.KvmDefinitions;
import me.bechberger.ebpf.runtime.OhciDefinitions;
import me.bechberger.ebpf.runtime.SkDefinitions;
import me.bechberger.ebpf.runtime.runtime;
import me.bechberger.ebpf.type.Ptr;
import me.bechberger.ebpf.type.Struct;

public final class DebugDefinitions {
    @NotUsableInJava
    @BuiltinBPFFunction
    public static int debug_alt(String str) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int debug_async_open(Ptr<runtime.inode> inode2, Ptr<runtime.file> file2) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int debug_boot_weak_hash_enable(String str) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int debug_close(Ptr<runtime.inode> inode2, Ptr<runtime.file> file2) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int debug_kernel(String str) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static @OriginalName(value="ssize_t") long debug_output(Ptr<runtime.file> file2, String user_buf, @Unsigned long len, Ptr<@OriginalName(value="loff_t") Long> offset) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int debug_periodic_open(Ptr<runtime.inode> inode2, Ptr<runtime.file> file2) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int debug_registers_open(Ptr<runtime.inode> inode2, Ptr<runtime.file> file2) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int debug_bandwidth_open(Ptr<runtime.inode> inode2, Ptr<runtime.file> file2) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction(value="debug_fill_reply($arg1, (const struct ethnl_req_info*)$arg2, (const struct ethnl_reply_data*)$arg3)")
    public static int debug_fill_reply(Ptr<SkDefinitions.sk_buff> skb, Ptr<EthnlDefinitions.ethnl_req_info> req_base, Ptr<EthnlDefinitions.ethnl_reply_data> reply_base) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int debug_locks_off() {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction(value="debug_prepare_data((const struct ethnl_req_info*)$arg1, $arg2, (const struct genl_info*)$arg3)")
    public static int debug_prepare_data(Ptr<EthnlDefinitions.ethnl_req_info> req_base, Ptr<EthnlDefinitions.ethnl_reply_data> reply_base, Ptr<GenlDefinitions.genl_info> info2) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction(value="debug_reply_size((const struct ethnl_req_info*)$arg1, (const struct ethnl_reply_data*)$arg2)")
    public static int debug_reply_size(Ptr<EthnlDefinitions.ethnl_req_info> req_base, Ptr<EthnlDefinitions.ethnl_reply_data> reply_base) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int debug_thunks(String str) {
        throw new MethodIsBPFRelatedFunction();
    }

    @Type(noCCodeGeneration=true, cType="struct debug_buffer")
    @NotUsableInJava
    public static class debug_buffer
    extends Struct {
        public Ptr<?> fill_func;
        public Ptr<OhciDefinitions.ohci_hcd> ohci;
        public runtime.mutex mutex;
        public @Unsigned long count;
        public String page;
    }

    @Type(noCCodeGeneration=true, cType="struct { struct kvm_debug_exit_arch arch; }")
    @NotUsableInJava
    public static class debug_of_anon_member_of_kvm_run
    extends Struct {
        public KvmDefinitions.kvm_debug_exit_arch arch;
    }

    @Type(noCCodeGeneration=true, cType="struct debug_reply_data")
    @NotUsableInJava
    public static class debug_reply_data
    extends Struct {
        public EthnlDefinitions.ethnl_reply_data base;
        public @Unsigned int msg_mask;
    }

    @Type(noCCodeGeneration=true, cType="struct debug_store_buffers")
    @NotUsableInJava
    public static class debug_store_buffers
    extends Struct {
        public char @Size(value=65536) [] bts_buffer;
        public char @Size(value=65536) [] pebs_buffer;
    }

    @Type(noCCodeGeneration=true, cType="struct debug_store")
    @NotUsableInJava
    public static class debug_store
    extends Struct {
        public @Unsigned long bts_buffer_base;
        public @Unsigned long bts_index;
        public @Unsigned long bts_absolute_maximum;
        public @Unsigned long bts_interrupt_threshold;
        public @Unsigned long pebs_buffer_base;
        public @Unsigned long pebs_index;
        public @Unsigned long pebs_absolute_maximum;
        public @Unsigned long pebs_interrupt_threshold;
        public @Unsigned long @Size(value=48) [] pebs_event_reset;
    }
}

