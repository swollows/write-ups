/*
 * Decompiled with CFR 0.153-SNAPSHOT (d6f6758-dirty).
 */
package me.bechberger.ebpf.runtime;

import me.bechberger.ebpf.annotations.OriginalName;
import me.bechberger.ebpf.annotations.Type;
import me.bechberger.ebpf.annotations.bpf.BuiltinBPFFunction;
import me.bechberger.ebpf.annotations.bpf.MethodIsBPFRelatedFunction;
import me.bechberger.ebpf.annotations.bpf.NotUsableInJava;
import me.bechberger.ebpf.runtime.FileDefinitions;
import me.bechberger.ebpf.runtime.ListDefinitions;
import me.bechberger.ebpf.runtime.PidDefinitions;
import me.bechberger.ebpf.runtime.SeqDefinitions;
import me.bechberger.ebpf.runtime.runtime;
import me.bechberger.ebpf.type.Ptr;
import me.bechberger.ebpf.type.Struct;

public final class LocksDefinitions {
    @NotUsableInJava
    @BuiltinBPFFunction
    public static int __locks_delete_block(Ptr<FileDefinitions.file_lock_core> waiter) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction(value="__locks_insert_block($arg1, $arg2, (_Bool (*)(struct file_lock_core*, struct file_lock_core*))$arg3)")
    public static void __locks_insert_block(Ptr<FileDefinitions.file_lock_core> blocker, Ptr<FileDefinitions.file_lock_core> waiter, Ptr<?> conflict) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void __locks_wake_up_blocks(Ptr<FileDefinitions.file_lock_core> blocker) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static Ptr<FileDefinitions.file_lease> locks_alloc_lease() {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static Ptr<FileDefinitions.file_lock> locks_alloc_lock() {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void locks_check_ctx_file_list(Ptr<runtime.file> filp, Ptr<ListDefinitions.list_head> list, String list_type) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void locks_copy_conflock(Ptr<FileDefinitions.file_lock> _new, Ptr<FileDefinitions.file_lock> fl) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void locks_copy_lock(Ptr<FileDefinitions.file_lock> _new, Ptr<FileDefinitions.file_lock> fl) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int locks_delete_block(Ptr<FileDefinitions.file_lock> waiter) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void locks_dispose_list(Ptr<ListDefinitions.list_head> dispose) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void locks_dump_ctx_list(Ptr<ListDefinitions.list_head> list, String list_type) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void locks_free_lease(Ptr<FileDefinitions.file_lease> fl) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void locks_free_lock(Ptr<FileDefinitions.file_lock> fl) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void locks_free_lock_context(Ptr<runtime.inode> inode2) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static Ptr<FileDefinitions.file_lock_context> locks_get_lock_context(Ptr<runtime.inode> inode2, int type2) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void locks_init_lease(Ptr<FileDefinitions.file_lease> fl) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void locks_init_lock(Ptr<FileDefinitions.file_lock> fl) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int locks_lock_inode_wait(Ptr<runtime.inode> inode2, Ptr<FileDefinitions.file_lock> fl) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void locks_move_blocks(Ptr<FileDefinitions.file_lock> _new, Ptr<FileDefinitions.file_lock> fl) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static Ptr<?> locks_next(Ptr<SeqDefinitions.seq_file> f, Ptr<?> v, Ptr<@OriginalName(value="loff_t") Long> pos) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static boolean locks_owner_has_blockers(Ptr<FileDefinitions.file_lock_context> flctx, @OriginalName(value="fl_owner_t") Ptr<?> owner) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void locks_release_private(Ptr<FileDefinitions.file_lock> fl) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void locks_remove_file(Ptr<runtime.file> filp) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void locks_remove_flock(Ptr<runtime.file> filp, Ptr<FileDefinitions.file_lock_context> flctx) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void locks_remove_posix(Ptr<runtime.file> filp, @OriginalName(value="fl_owner_t") Ptr<?> owner) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int locks_show(Ptr<SeqDefinitions.seq_file> f, Ptr<?> v) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static Ptr<?> locks_start(Ptr<SeqDefinitions.seq_file> f, Ptr<@OriginalName(value="loff_t") Long> pos) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void locks_stop(Ptr<SeqDefinitions.seq_file> f, Ptr<?> v) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static @OriginalName(value="pid_t") int locks_translate_pid(Ptr<FileDefinitions.file_lock_core> fl, Ptr<PidDefinitions.pid_namespace> ns) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void locks_unlink_lock_ctx(Ptr<FileDefinitions.file_lock_core> fl) {
        throw new MethodIsBPFRelatedFunction();
    }

    @Type(noCCodeGeneration=true, cType="struct locks_iterator")
    @NotUsableInJava
    public static class locks_iterator
    extends Struct {
        public int li_cpu;
        public @OriginalName(value="loff_t") long li_pos;
    }
}

