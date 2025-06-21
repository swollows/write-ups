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
import me.bechberger.ebpf.runtime.DelayedDefinitions;
import me.bechberger.ebpf.runtime.KernelDefinitions;
import me.bechberger.ebpf.runtime.LoadDefinitions;
import me.bechberger.ebpf.runtime.MemDefinitions;
import me.bechberger.ebpf.runtime.MemcgDefinitions;
import me.bechberger.ebpf.runtime.ModuleDefinitions;
import me.bechberger.ebpf.runtime.NodeDefinitions;
import me.bechberger.ebpf.runtime.ObjDefinitions;
import me.bechberger.ebpf.runtime.TimerDefinitions;
import me.bechberger.ebpf.runtime.WorkqueueDefinitions;
import me.bechberger.ebpf.runtime.ZoneDefinitions;
import me.bechberger.ebpf.runtime.misc;
import me.bechberger.ebpf.runtime.runtime;
import me.bechberger.ebpf.type.Enum;
import me.bechberger.ebpf.type.Ptr;
import me.bechberger.ebpf.type.Struct;
import me.bechberger.ebpf.type.TypedEnum;

public final class ModDefinitions {
    @NotUsableInJava
    @BuiltinBPFFunction
    public static void __mod_tree_insert(Ptr<mod_tree_node> node2, Ptr<mod_tree_root> tree) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void __mod_tree_remove(Ptr<mod_tree_node> node2, Ptr<mod_tree_root> tree) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction(value="mod_check_sig((const struct module_signature*)$arg1, $arg2, (const u8*)$arg3)")
    public static int mod_check_sig(Ptr<ModuleDefinitions.module_signature> ms, @Unsigned long file_len, String name) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static Ptr<runtime.module> mod_find(@Unsigned long addr2, Ptr<mod_tree_root> tree) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void mod_tree_insert(Ptr<runtime.module> mod) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void mod_tree_remove(Ptr<runtime.module> mod) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void mod_tree_remove_init(Ptr<runtime.module> mod) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void __mod_lruvec_kmem_state(Ptr<?> p, NodeDefinitions.node_stat_item idx, int val) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void __mod_lruvec_state(Ptr<runtime.lruvec> lruvec2, NodeDefinitions.node_stat_item idx, int val) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void __mod_memcg_lruvec_state(Ptr<runtime.lruvec> lruvec2, NodeDefinitions.node_stat_item idx, int val) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void __mod_memcg_state(Ptr<MemDefinitions.mem_cgroup> memcg, MemcgDefinitions.memcg_stat_item idx, int val) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int __mod_timer(Ptr<TimerDefinitions.timer_list> timer, @Unsigned long expires, @Unsigned int options) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void mod_objcg_state(Ptr<ObjDefinitions.obj_cgroup> objcg, Ptr<misc.pglist_data> pgdat, NodeDefinitions.node_stat_item idx, int nr) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int mod_timer(Ptr<TimerDefinitions.timer_list> timer, @Unsigned long expires) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int mod_timer_pending(Ptr<TimerDefinitions.timer_list> timer, @Unsigned long expires) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void __mod_node_page_state(Ptr<misc.pglist_data> pgdat, NodeDefinitions.node_stat_item item, long delta) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void __mod_zone_page_state(Ptr<runtime.zone> zone2, ZoneDefinitions.zone_stat_item item, long delta) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void mod_node_page_state(Ptr<misc.pglist_data> pgdat, NodeDefinitions.node_stat_item item, long delta) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction(value="mod_sysfs_setup($arg1, (const struct load_info*)$arg2, $arg3, $arg4)")
    public static int mod_sysfs_setup(Ptr<runtime.module> mod, Ptr<LoadDefinitions.load_info> info2, Ptr<KernelDefinitions.kernel_param> kparam, @Unsigned int num_params) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void mod_sysfs_teardown(Ptr<runtime.module> mod) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction(value="mod_verify_sig((const void*)$arg1, $arg2)")
    public static int mod_verify_sig(Ptr<?> mod, Ptr<LoadDefinitions.load_info> info2) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void mod_zone_page_state(Ptr<runtime.zone> zone2, ZoneDefinitions.zone_stat_item item, long delta) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static boolean mod_delayed_work_on(int cpu2, Ptr<WorkqueueDefinitions.workqueue_struct> wq, Ptr<DelayedDefinitions.delayed_work> dwork, @Unsigned long delay) {
        throw new MethodIsBPFRelatedFunction();
    }

    @Type(noCCodeGeneration=true, cType="struct mod_initfree")
    @NotUsableInJava
    public static class mod_initfree
    extends Struct {
        public misc.llist_node node;
        public Ptr<?> init_text;
        public Ptr<?> init_data;
        public Ptr<?> init_rodata;
    }

    @Type(noCCodeGeneration=true, cType="struct mod_tree_root")
    @NotUsableInJava
    public static class mod_tree_root
    extends Struct {
        public misc.latch_tree_root root;
        public @Unsigned long addr_min;
        public @Unsigned long addr_max;
    }

    @Type(noCCodeGeneration=true, cType="enum mod_license")
    public static enum mod_license implements Enum<mod_license>,
    TypedEnum<mod_license, Integer>
    {
        NOT_GPL_ONLY,
        GPL_ONLY;

    }

    @Type(noCCodeGeneration=true, cType="enum mod_mem_type")
    public static enum mod_mem_type implements Enum<mod_mem_type>,
    TypedEnum<mod_mem_type, Integer>
    {
        MOD_TEXT,
        MOD_DATA,
        MOD_RODATA,
        MOD_RO_AFTER_INIT,
        MOD_INIT_TEXT,
        MOD_INIT_DATA,
        MOD_INIT_RODATA,
        MOD_MEM_NUM_TYPES,
        MOD_INVALID;

    }

    @Type(noCCodeGeneration=true, cType="struct mod_kallsyms")
    @NotUsableInJava
    public static class mod_kallsyms
    extends Struct {
        public Ptr<@OriginalName(value="Elf64_Sym") misc.elf64_sym> symtab;
        public @Unsigned int num_symtab;
        public String strtab;
        public String typetab;
    }

    @Type(noCCodeGeneration=true, cType="struct mod_tree_node")
    @NotUsableInJava
    public static class mod_tree_node
    extends Struct {
        public Ptr<runtime.module> mod;
        public misc.latch_tree_node node;
    }

    @Type(noCCodeGeneration=true, cType="struct mod_arch_specific")
    @NotUsableInJava
    public static class mod_arch_specific
    extends Struct {
    }
}

