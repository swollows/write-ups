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
import me.bechberger.ebpf.runtime.AtomicDefinitions;
import me.bechberger.ebpf.runtime.CryptoDefinitions;
import me.bechberger.ebpf.runtime.KsmDefinitions;
import me.bechberger.ebpf.runtime.Seg6Definitions;
import me.bechberger.ebpf.runtime.TaskDefinitions;
import me.bechberger.ebpf.runtime.WaitDefinitions;
import me.bechberger.ebpf.runtime.runtime;
import me.bechberger.ebpf.type.Ptr;
import me.bechberger.ebpf.type.Struct;

public final class CmpDefinitions {
    @NotUsableInJava
    @BuiltinBPFFunction(value="cmp_entries_dup((const void*)$arg1, (const void*)$arg2)")
    public static int cmp_entries_dup(Ptr<?> A, Ptr<?> B) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction(value="cmp_entries_key((const void*)$arg1, (const void*)$arg2)")
    public static int cmp_entries_key(Ptr<?> A, Ptr<?> B) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction(value="cmp_entries_sum((const void*)$arg1, (const void*)$arg2)")
    public static int cmp_entries_sum(Ptr<?> A, Ptr<?> B) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction(value="cmp_ex_search((const void*)$arg1, (const void*)$arg2)")
    public static int cmp_ex_search(Ptr<?> key2, Ptr<?> elt) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction(value="cmp_ex_sort((const void*)$arg1, (const void*)$arg2)")
    public static int cmp_ex_sort(Ptr<?> a, Ptr<?> b) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction(value="cmp_loc_by_count((const void*)$arg1, (const void*)$arg2, (const void*)$arg3)")
    public static int cmp_loc_by_count(Ptr<?> a, Ptr<?> b, Ptr<?> data) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction(value="cmp_memblk((const void*)$arg1, (const void*)$arg2)")
    public static int cmp_memblk(Ptr<?> a, Ptr<?> b) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction(value="cmp_name((const void*)$arg1, (const void*)$arg2)")
    public static int cmp_name(Ptr<?> name, Ptr<?> sym) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction(value="cmp_extents_forward((const void*)$arg1, (const void*)$arg2)")
    public static int cmp_extents_forward(Ptr<?> a, Ptr<?> b) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction(value="cmp_extents_reverse((const void*)$arg1, (const void*)$arg2)")
    public static int cmp_extents_reverse(Ptr<?> a, Ptr<?> b) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction(value="cmp_map_id((const void*)$arg1, (const void*)$arg2)")
    public static int cmp_map_id(Ptr<?> k, Ptr<?> e) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int cmp_nla_bpf(Ptr<Seg6Definitions.seg6_local_lwt> a, Ptr<Seg6Definitions.seg6_local_lwt> b) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int cmp_nla_counters(Ptr<Seg6Definitions.seg6_local_lwt> a, Ptr<Seg6Definitions.seg6_local_lwt> b) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int cmp_nla_flavors(Ptr<Seg6Definitions.seg6_local_lwt> a, Ptr<Seg6Definitions.seg6_local_lwt> b) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int cmp_nla_iif(Ptr<Seg6Definitions.seg6_local_lwt> a, Ptr<Seg6Definitions.seg6_local_lwt> b) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int cmp_nla_nh4(Ptr<Seg6Definitions.seg6_local_lwt> a, Ptr<Seg6Definitions.seg6_local_lwt> b) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int cmp_nla_nh6(Ptr<Seg6Definitions.seg6_local_lwt> a, Ptr<Seg6Definitions.seg6_local_lwt> b) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int cmp_nla_oif(Ptr<Seg6Definitions.seg6_local_lwt> a, Ptr<Seg6Definitions.seg6_local_lwt> b) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int cmp_nla_srh(Ptr<Seg6Definitions.seg6_local_lwt> a, Ptr<Seg6Definitions.seg6_local_lwt> b) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int cmp_nla_table(Ptr<Seg6Definitions.seg6_local_lwt> a, Ptr<Seg6Definitions.seg6_local_lwt> b) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int cmp_nla_vrftable(Ptr<Seg6Definitions.seg6_local_lwt> a, Ptr<Seg6Definitions.seg6_local_lwt> b) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction(value="cmp_vma_size((const void*)$arg1, (const void*)$arg2)")
    public static int cmp_vma_size(Ptr<?> vma_meta_lhs_ptr, Ptr<?> vma_meta_rhs_ptr) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction(value="cmp_dpa((const void*)$arg1, (const void*)$arg2)")
    public static int cmp_dpa(Ptr<?> a, Ptr<?> b) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction(value="cmp_range((const void*)$arg1, (const void*)$arg2)")
    public static int cmp_range(Ptr<?> x1, Ptr<?> x2) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction(value="cmp_subprogs((const void*)$arg1, (const void*)$arg2)")
    public static int cmp_subprogs(Ptr<?> a, Ptr<?> b) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void cmp_and_merge_page(Ptr<runtime.page> page2, Ptr<KsmDefinitions.ksm_rmap_item> rmap_item) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction(value="cmp_btf_name_size((const void*)$arg1, (const void*)$arg2)")
    public static int cmp_btf_name_size(Ptr<?> n1, Ptr<?> n2) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int cmp_dev(Ptr<runtime.device> dev, Ptr<?> data) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction(value="cmp_ips((const void*)$arg1, (const void*)$arg2)")
    public static int cmp_ips(Ptr<?> a, Ptr<?> b) {
        throw new MethodIsBPFRelatedFunction();
    }

    @Type(noCCodeGeneration=true, cType="struct cmp_data")
    @NotUsableInJava
    public static class cmp_data
    extends Struct {
        public Ptr<TaskDefinitions.task_struct> thr;
        public Ptr<CryptoDefinitions.crypto_comp> cc;
        public AtomicDefinitions.atomic_t ready;
        public AtomicDefinitions.atomic_t stop;
        public int ret;
        public @OriginalName(value="wait_queue_head_t") WaitDefinitions.wait_queue_head go;
        public @OriginalName(value="wait_queue_head_t") WaitDefinitions.wait_queue_head done;
        public @Unsigned long unc_len;
        public @Unsigned long cmp_len;
        public char @Size(value=131072) [] unc;
        public char @Size(value=143360) [] cmp;
    }

    @Type(noCCodeGeneration=true, cType="struct __cmp_key")
    @NotUsableInJava
    public static class __cmp_key
    extends Struct {
        public Ptr<runtime.cpumask> cpus;
        public Ptr<Ptr<Ptr<runtime.cpumask>>> masks;
        public int node;
        public int cpu;
        public int w;
    }
}

