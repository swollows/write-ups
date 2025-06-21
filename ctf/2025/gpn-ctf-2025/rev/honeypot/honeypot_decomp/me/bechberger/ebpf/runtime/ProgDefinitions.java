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
import me.bechberger.ebpf.runtime.BpfDefinitions;
import me.bechberger.ebpf.runtime.FilterDefinitions;
import me.bechberger.ebpf.runtime.ListDefinitions;
import me.bechberger.ebpf.runtime.SeqDefinitions;
import me.bechberger.ebpf.runtime.misc;
import me.bechberger.ebpf.runtime.runtime;
import me.bechberger.ebpf.type.Ptr;
import me.bechberger.ebpf.type.Struct;

public final class ProgDefinitions {
    @NotUsableInJava
    @BuiltinBPFFunction
    public static Ptr<BpfDefinitions.bpf_map> prog_array_map_alloc(Ptr<BpfDefinitions.bpf_attr> attr2) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void prog_array_map_clear(Ptr<BpfDefinitions.bpf_map> map2) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void prog_array_map_clear_deferred(Ptr<misc.work_struct> work) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void prog_array_map_free(Ptr<BpfDefinitions.bpf_map> map2) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void prog_array_map_poke_run(Ptr<BpfDefinitions.bpf_map> map2, @Unsigned int key2, Ptr<BpfDefinitions.bpf_prog> old, Ptr<BpfDefinitions.bpf_prog> _new) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int prog_array_map_poke_track(Ptr<BpfDefinitions.bpf_map> map2, Ptr<BpfDefinitions.bpf_prog_aux> prog_aux) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void prog_array_map_poke_untrack(Ptr<BpfDefinitions.bpf_map> map2, Ptr<BpfDefinitions.bpf_prog_aux> prog_aux) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void prog_array_map_seq_show_elem(Ptr<BpfDefinitions.bpf_map> map2, Ptr<?> key2, Ptr<SeqDefinitions.seq_file> m) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static Ptr<?> prog_fd_array_get_ptr(Ptr<BpfDefinitions.bpf_map> map2, Ptr<runtime.file> map_file, int fd2) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void prog_fd_array_put_ptr(Ptr<BpfDefinitions.bpf_map> map2, Ptr<?> ptr, boolean need_defer) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static @Unsigned int prog_fd_array_sys_lookup_elem(Ptr<?> ptr) {
        throw new MethodIsBPFRelatedFunction();
    }

    @Type(noCCodeGeneration=true, cType="struct prog_entry")
    @NotUsableInJava
    public static class prog_entry
    extends Struct {
        public int target;
        public int when_to_branch;
        public Ptr<FilterDefinitions.filter_pred> pred;
    }

    @Type(noCCodeGeneration=true, cType="struct prog_test_ref_kfunc")
    @NotUsableInJava
    public static class prog_test_ref_kfunc
    extends Struct {
        public int a;
        public int b;
        public prog_test_member memb;
        public Ptr<prog_test_ref_kfunc> next;
        public @OriginalName(value="refcount_t") misc.refcount_struct cnt;
    }

    @Type(noCCodeGeneration=true, cType="struct prog_test_member")
    @NotUsableInJava
    public static class prog_test_member
    extends Struct {
        public prog_test_member1 m;
        public int c;
    }

    @Type(noCCodeGeneration=true, cType="struct prog_test_member1")
    @NotUsableInJava
    public static class prog_test_member1
    extends Struct {
        public int a;
    }

    @Type(noCCodeGeneration=true, cType="struct prog_poke_elem")
    @NotUsableInJava
    public static class prog_poke_elem
    extends Struct {
        public ListDefinitions.list_head list;
        public Ptr<BpfDefinitions.bpf_prog_aux> aux;
    }

    @Type(noCCodeGeneration=true, cType="struct { unsigned int prog_fd; unsigned int map_fd; unsigned int flags; }")
    @NotUsableInJava
    public static class prog_bind_map_of_bpf_attr
    extends Struct {
        public @Unsigned int prog_fd;
        public @Unsigned int map_fd;
        public @Unsigned int flags;
    }
}

