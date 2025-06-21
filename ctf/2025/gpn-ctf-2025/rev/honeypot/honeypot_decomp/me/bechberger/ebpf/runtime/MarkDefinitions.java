/*
 * Decompiled with CFR 0.153-SNAPSHOT (d6f6758-dirty).
 */
package me.bechberger.ebpf.runtime;

import me.bechberger.ebpf.annotations.Unsigned;
import me.bechberger.ebpf.annotations.bpf.BuiltinBPFFunction;
import me.bechberger.ebpf.annotations.bpf.MethodIsBPFRelatedFunction;
import me.bechberger.ebpf.annotations.bpf.NotUsableInJava;
import me.bechberger.ebpf.runtime.BpfDefinitions;
import me.bechberger.ebpf.runtime.BtfDefinitions;
import me.bechberger.ebpf.runtime.BufferDefinitions;
import me.bechberger.ebpf.runtime.ListDefinitions;
import me.bechberger.ebpf.runtime.RtDefinitions;
import me.bechberger.ebpf.runtime.SuperDefinitions;
import me.bechberger.ebpf.runtime.SwapDefinitions;
import me.bechberger.ebpf.runtime.TaskDefinitions;
import me.bechberger.ebpf.runtime.misc;
import me.bechberger.ebpf.runtime.runtime;
import me.bechberger.ebpf.type.Ptr;

public final class MarkDefinitions {
    @NotUsableInJava
    @BuiltinBPFFunction
    public static void mark_info_dirty(Ptr<SuperDefinitions.super_block> sb, int type2) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void mark_mounts_for_expiry(Ptr<ListDefinitions.list_head> mounts) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void mark_page_accessed(Ptr<runtime.page> page2) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void mark_rodata_ro() {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void mark_wakeup_next_waiter(Ptr<RtDefinitions.rt_wake_q_head> wqh, Ptr<RtDefinitions.rt_mutex_base> lock) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void mark_buffer_async_write(Ptr<BufferDefinitions.buffer_head> bh) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void mark_buffer_async_write_endio(Ptr<BufferDefinitions.buffer_head> bh, Ptr<?> handler) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void mark_buffer_dirty(Ptr<BufferDefinitions.buffer_head> bh) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void mark_buffer_dirty_inode(Ptr<BufferDefinitions.buffer_head> bh, Ptr<runtime.inode> inode2) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void mark_buffer_write_io_error(Ptr<BufferDefinitions.buffer_head> bh) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction(value="mark_hash_blacklisted((const u8*)$arg1, $arg2, $arg3)")
    public static int mark_hash_blacklisted(Ptr<Character> hash2, @Unsigned long hash_len, misc.blacklist_hash_type hash_type) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void mark_oom_victim(Ptr<TaskDefinitions.task_struct> tsk) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction(value="mark_raw_hash_blacklisted((const u8*)$arg1)")
    public static int mark_raw_hash_blacklisted(String hash2) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int mark_swapfiles(Ptr<SwapDefinitions.swap_map_handle> handle, @Unsigned int flags) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void mark_tsc_unstable(String reason) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int __mark_chain_precision(Ptr<BpfDefinitions.bpf_verifier_env> env, int regno) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void __mark_inode_dirty(Ptr<runtime.inode> inode2, int flags) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void __mark_reg_known(Ptr<BpfDefinitions.bpf_reg_state> reg, @Unsigned long imm) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void __mark_reg_unknown_imprecise(Ptr<BpfDefinitions.bpf_reg_state> reg) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void mark_all_scalars_precise(Ptr<BpfDefinitions.bpf_verifier_env> env, Ptr<BpfDefinitions.bpf_verifier_state> st2) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void mark_btf_func_reg_size(Ptr<BpfDefinitions.bpf_verifier_env> env, @Unsigned int regno, @Unsigned long reg_size) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void mark_btf_ld_reg(Ptr<BpfDefinitions.bpf_verifier_env> env, Ptr<BpfDefinitions.bpf_reg_state> regs, @Unsigned int regno, BpfDefinitions.bpf_reg_type reg_type2, Ptr<runtime.btf> btf2, @Unsigned int btf_id, BpfDefinitions.bpf_type_flag flag) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int mark_chain_precision(Ptr<BpfDefinitions.bpf_verifier_env> env, int regno) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void mark_fastcall_pattern_for_call(Ptr<BpfDefinitions.bpf_verifier_env> env, Ptr<BpfDefinitions.bpf_subprog_info> subprog, int insn_idx, short lowest_off) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void mark_ptr_not_null_reg(Ptr<BpfDefinitions.bpf_reg_state> reg) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void mark_ptr_or_null_regs(Ptr<BpfDefinitions.bpf_verifier_state> vstate, @Unsigned int regno, boolean is_null) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void mark_reg_graph_node(Ptr<BpfDefinitions.bpf_reg_state> regs, @Unsigned int regno, Ptr<BtfDefinitions.btf_field_graph_root> ds_head) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction(value="mark_reg_invalid((const struct bpf_verifier_env*)$arg1, $arg2)")
    public static void mark_reg_invalid(Ptr<BpfDefinitions.bpf_verifier_env> env, Ptr<BpfDefinitions.bpf_reg_state> reg) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void mark_reg_known_zero(Ptr<BpfDefinitions.bpf_verifier_env> env, Ptr<BpfDefinitions.bpf_reg_state> regs, @Unsigned int regno) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void mark_reg_not_init(Ptr<BpfDefinitions.bpf_verifier_env> env, Ptr<BpfDefinitions.bpf_reg_state> regs, @Unsigned int regno) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction(value="mark_reg_read($arg1, (const struct bpf_reg_state*)$arg2, $arg3, $arg4)")
    public static int mark_reg_read(Ptr<BpfDefinitions.bpf_verifier_env> env, Ptr<BpfDefinitions.bpf_reg_state> state2, Ptr<BpfDefinitions.bpf_reg_state> parent, char flag) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void mark_reg_stack_read(Ptr<BpfDefinitions.bpf_verifier_env> env, Ptr<BpfDefinitions.bpf_func_state> ptr_state, int min_off, int max_off, int dst_regno) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void mark_reg_unknown(Ptr<BpfDefinitions.bpf_verifier_env> env, Ptr<BpfDefinitions.bpf_reg_state> regs, @Unsigned int regno) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int mark_stack_slots_dynptr(Ptr<BpfDefinitions.bpf_verifier_env> env, Ptr<BpfDefinitions.bpf_reg_state> reg, BpfDefinitions.bpf_arg_type arg_type, int insn_idx, int clone_ref_obj_id) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void mark_tsc_async_resets(String reason) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void mark_free_pages(Ptr<runtime.zone> zone2) {
        throw new MethodIsBPFRelatedFunction();
    }
}

