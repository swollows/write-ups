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
import me.bechberger.ebpf.runtime.ListDefinitions;
import me.bechberger.ebpf.runtime.WorkqueueDefinitions;
import me.bechberger.ebpf.runtime.misc;
import me.bechberger.ebpf.runtime.runtime;
import me.bechberger.ebpf.type.Ptr;
import me.bechberger.ebpf.type.Struct;

public final class PadataDefinitions {
    @NotUsableInJava
    @BuiltinBPFFunction
    public static int __padata_set_cpumasks(Ptr<padata_instance> pinst, @OriginalName(value="cpumask_var_t") Ptr<runtime.cpumask> pcpumask, @OriginalName(value="cpumask_var_t") Ptr<runtime.cpumask> cbcpumask) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction(value="padata_alloc((const u8*)$arg1)")
    public static Ptr<padata_instance> padata_alloc(String name) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static Ptr<misc.parallel_data> padata_alloc_pd(Ptr<padata_shell> ps) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static Ptr<padata_shell> padata_alloc_shell(Ptr<padata_instance> pinst) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int padata_cpu_dead(@Unsigned int cpu2, Ptr<misc.hlist_node> node2) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int padata_cpu_hash(Ptr<misc.parallel_data> pd, @Unsigned int seq_nr) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int padata_cpu_online(@Unsigned int cpu2, Ptr<misc.hlist_node> node2) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void padata_do_multithreaded(Ptr<padata_mt_job> job) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int padata_do_parallel(Ptr<padata_shell> ps, Ptr<padata_priv> padata, Ptr<Integer> cb_cpu) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void padata_do_serial(Ptr<padata_priv> padata) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static Ptr<padata_priv> padata_find_next(Ptr<misc.parallel_data> pd, boolean remove_object) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void padata_free(Ptr<padata_instance> pinst) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void padata_free_shell(Ptr<padata_shell> ps) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void padata_init() {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void padata_mt_helper(Ptr<misc.work_struct> w) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void padata_parallel_worker(Ptr<misc.work_struct> parallel_work) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void padata_reorder(Ptr<misc.parallel_data> pd) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int padata_replace(Ptr<padata_instance> pinst) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void padata_serial_worker(Ptr<misc.work_struct> serial_work) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int padata_set_cpumask(Ptr<padata_instance> pinst, int cpumask_type, @OriginalName(value="cpumask_var_t") Ptr<runtime.cpumask> cpumask2) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int padata_setup_cpumasks(Ptr<padata_instance> pinst) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void padata_sysfs_release(Ptr<runtime.kobject> kobj) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static @OriginalName(value="ssize_t") long padata_sysfs_show(Ptr<runtime.kobject> kobj, Ptr<runtime.attribute> attr2, String buf) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction(value="padata_sysfs_store($arg1, $arg2, (const u8*)$arg3, $arg4)")
    public static @OriginalName(value="ssize_t") long padata_sysfs_store(Ptr<runtime.kobject> kobj, Ptr<runtime.attribute> attr2, String buf, @Unsigned long count) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction(value="padata_validate_cpumask($arg1, (const struct cpumask*)$arg2)")
    public static boolean padata_validate_cpumask(Ptr<padata_instance> pinst, Ptr<runtime.cpumask> cpumask2) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void padata_work_init(Ptr<padata_work> pw, @OriginalName(value="work_func_t") Ptr<?> work_fn, Ptr<?> data, int flags) {
        throw new MethodIsBPFRelatedFunction();
    }

    @Type(noCCodeGeneration=true, cType="struct padata_sysfs_entry")
    @NotUsableInJava
    public static class padata_sysfs_entry
    extends Struct {
        public runtime.attribute attr;
        public Ptr<?> show;
        public Ptr<?> store;
    }

    @Type(noCCodeGeneration=true, cType="struct padata_mt_job_state")
    @NotUsableInJava
    public static class padata_mt_job_state
    extends Struct {
        public  @OriginalName(value="spinlock_t") runtime.spinlock lock;
        public runtime.completion completion;
        public Ptr<padata_mt_job> job;
        public int nworks;
        public int nworks_fini;
        public @Unsigned long chunk_size;
    }

    @Type(noCCodeGeneration=true, cType="struct padata_work")
    @NotUsableInJava
    public static class padata_work
    extends Struct {
        public misc.work_struct pw_work;
        public ListDefinitions.list_head pw_list;
        public Ptr<?> pw_data;
    }

    @Type(noCCodeGeneration=true, cType="struct padata_mt_job")
    @NotUsableInJava
    public static class padata_mt_job
    extends Struct {
        public Ptr<?> thread_fn;
        public Ptr<?> fn_arg;
        public @Unsigned long start;
        public @Unsigned long size;
        public @Unsigned long align;
        public @Unsigned long min_chunk;
        public int max_threads;
        public boolean numa_aware;
    }

    @Type(noCCodeGeneration=true, cType="struct padata_instance")
    @NotUsableInJava
    public static class padata_instance
    extends Struct {
        public misc.hlist_node cpu_online_node;
        public misc.hlist_node cpu_dead_node;
        public Ptr<WorkqueueDefinitions.workqueue_struct> parallel_wq;
        public Ptr<WorkqueueDefinitions.workqueue_struct> serial_wq;
        public ListDefinitions.list_head pslist;
        public padata_cpumask cpumask;
        public runtime.kobject kobj;
        public runtime.mutex lock;
        public char flags;
    }

    @Type(noCCodeGeneration=true, cType="struct padata_shell")
    @NotUsableInJava
    public static class padata_shell
    extends Struct {
        public Ptr<padata_instance> pinst;
        public Ptr<misc.parallel_data> pd;
        public Ptr<misc.parallel_data> opd;
        public ListDefinitions.list_head list;
    }

    @Type(noCCodeGeneration=true, cType="struct padata_cpumask")
    @NotUsableInJava
    public static class padata_cpumask
    extends Struct {
        public @OriginalName(value="cpumask_var_t") Ptr<runtime.cpumask> pcpu;
        public @OriginalName(value="cpumask_var_t") Ptr<runtime.cpumask> cbcpu;
    }

    @Type(noCCodeGeneration=true, cType="struct padata_serial_queue")
    @NotUsableInJava
    public static class padata_serial_queue
    extends Struct {
        public padata_list serial;
        public misc.work_struct work;
        public Ptr<misc.parallel_data> pd;
    }

    @Type(noCCodeGeneration=true, cType="struct padata_list")
    @NotUsableInJava
    public static class padata_list
    extends Struct {
        public ListDefinitions.list_head list;
        public  @OriginalName(value="spinlock_t") runtime.spinlock lock;
    }

    @Type(noCCodeGeneration=true, cType="struct padata_priv")
    @NotUsableInJava
    public static class padata_priv
    extends Struct {
        public ListDefinitions.list_head list;
        public Ptr<misc.parallel_data> pd;
        public int cb_cpu;
        public @Unsigned int seq_nr;
        public int info;
        public Ptr<?> parallel;
        public Ptr<?> serial;
    }
}

