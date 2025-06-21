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
import me.bechberger.ebpf.runtime.misc;
import me.bechberger.ebpf.runtime.runtime;
import me.bechberger.ebpf.type.Enum;
import me.bechberger.ebpf.type.Ptr;
import me.bechberger.ebpf.type.Struct;
import me.bechberger.ebpf.type.TypedEnum;

public final class SysctlDefinitions {
    @NotUsableInJava
    @BuiltinBPFFunction
    public static int sysctl_ipv4_init() {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction(value="sysctl_latencytop((const struct ctl_table*)$arg1, $arg2, $arg3, $arg4, $arg5)")
    public static int sysctl_latencytop(Ptr<misc.ctl_table> table, int write2, Ptr<?> buffer, Ptr<@Unsigned Long> lenp, Ptr<@OriginalName(value="loff_t") Long> ppos) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction(value="sysctl_compaction_handler((const struct ctl_table*)$arg1, $arg2, $arg3, $arg4, $arg5)")
    public static int sysctl_compaction_handler(Ptr<misc.ctl_table> table, int write2, Ptr<?> buffer, Ptr<@Unsigned Long> length, Ptr<@OriginalName(value="loff_t") Long> ppos) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction(value="sysctl_convert_ctx_access($arg1, (const struct bpf_insn*)$arg2, $arg3, $arg4, $arg5)")
    public static @Unsigned int sysctl_convert_ctx_access(BpfDefinitions.bpf_access_type type2, Ptr<BpfDefinitions.bpf_insn> si, Ptr<BpfDefinitions.bpf_insn> insn_buf, Ptr<BpfDefinitions.bpf_prog> prog, Ptr<@Unsigned Integer> target_size) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int sysctl_core_init() {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void sysctl_core_net_exit(Ptr<runtime.net> net2) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int sysctl_core_net_init(Ptr<runtime.net> net2) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction(value="sysctl_cpy_dir((const struct ctl_dir*)$arg1, $arg2, $arg3)")
    public static @OriginalName(value="ssize_t") long sysctl_cpy_dir(Ptr<misc.ctl_dir> dir, Ptr<String> bufp, Ptr<@Unsigned Long> lenp) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction(value="sysctl_delayacct((const struct ctl_table*)$arg1, $arg2, $arg3, $arg4, $arg5)")
    public static int sysctl_delayacct(Ptr<misc.ctl_table> table, int write2, Ptr<?> buffer, Ptr<@Unsigned Long> lenp, Ptr<@OriginalName(value="loff_t") Long> ppos) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction(value="((const struct bpf_func_proto*)sysctl_func_proto($arg1, (const struct bpf_prog*)$arg2))")
    public static Ptr<BpfDefinitions.bpf_func_proto> sysctl_func_proto(BpfDefinitions.bpf_func_id func_id, Ptr<BpfDefinitions.bpf_prog> prog) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction(value="sysctl_is_valid_access($arg1, $arg2, $arg3, (const struct bpf_prog*)$arg4, $arg5)")
    public static boolean sysctl_is_valid_access(int off, int size, BpfDefinitions.bpf_access_type type2, Ptr<BpfDefinitions.bpf_prog> prog, Ptr<BpfDefinitions.bpf_insn_access_aux> info2) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction(value="sysctl_max_threads((const struct ctl_table*)$arg1, $arg2, $arg3, $arg4, $arg5)")
    public static int sysctl_max_threads(Ptr<misc.ctl_table> table, int write2, Ptr<?> buffer, Ptr<@Unsigned Long> lenp, Ptr<@OriginalName(value="loff_t") Long> ppos) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void sysctl_net_exit(Ptr<runtime.net> net2) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int sysctl_net_init(Ptr<runtime.net> net2) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction(value="sysctl_check_table((const u8*)$arg1, $arg2)")
    public static int sysctl_check_table(String path2, Ptr<misc.ctl_table_header> header) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction(value="sysctl_err((const u8*)$arg1, $arg2, $arg3, $arg4_)")
    public static int sysctl_err(String path2, Ptr<misc.ctl_table> table, String fmt, Object ... param3) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int sysctl_follow_link(Ptr<Ptr<misc.ctl_table_header>> phead, Ptr<Ptr<misc.ctl_table>> pentry) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static boolean sysctl_is_alias(String param2) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction(value="sysctl_mkdir_p($arg1, (const u8*)$arg2)")
    public static Ptr<misc.ctl_dir> sysctl_mkdir_p(Ptr<misc.ctl_dir> dir, String path2) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction(value="sysctl_numa_balancing((const struct ctl_table*)$arg1, $arg2, $arg3, $arg4, $arg5)")
    public static int sysctl_numa_balancing(Ptr<misc.ctl_table> table, int write2, Ptr<?> buffer, Ptr<@Unsigned Long> lenp, Ptr<@OriginalName(value="loff_t") Long> ppos) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int sysctl_perm(Ptr<misc.ctl_table_header> head, Ptr<misc.ctl_table> table, int op) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void sysctl_print_dir(Ptr<misc.ctl_dir> dir) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void sysctl_route_net_exit(Ptr<runtime.net> net2) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int sysctl_route_net_init(Ptr<runtime.net> net2) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction(value="sysctl_sched_uclamp_handler((const struct ctl_table*)$arg1, $arg2, $arg3, $arg4, $arg5)")
    public static int sysctl_sched_uclamp_handler(Ptr<misc.ctl_table> table, int write2, Ptr<?> buffer, Ptr<@Unsigned Long> lenp, Ptr<@OriginalName(value="loff_t") Long> ppos) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction(value="sysctl_schedstats((const struct ctl_table*)$arg1, $arg2, $arg3, $arg4, $arg5)")
    public static int sysctl_schedstats(Ptr<misc.ctl_table> table, int write2, Ptr<?> buffer, Ptr<@Unsigned Long> lenp, Ptr<@OriginalName(value="loff_t") Long> ppos) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction(value="sysctl_vm_numa_stat_handler((const struct ctl_table*)$arg1, $arg2, $arg3, $arg4, $arg5)")
    public static int sysctl_vm_numa_stat_handler(Ptr<misc.ctl_table> table, int write2, Ptr<?> buffer, Ptr<@Unsigned Long> length, Ptr<@OriginalName(value="loff_t") Long> ppos) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int sysctl_init_bases() {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction(value="sysctl_min_slab_ratio_sysctl_handler((const struct ctl_table*)$arg1, $arg2, $arg3, $arg4, $arg5)")
    public static int sysctl_min_slab_ratio_sysctl_handler(Ptr<misc.ctl_table> table, int write2, Ptr<?> buffer, Ptr<@Unsigned Long> length, Ptr<@OriginalName(value="loff_t") Long> ppos) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction(value="sysctl_min_unmapped_ratio_sysctl_handler((const struct ctl_table*)$arg1, $arg2, $arg3, $arg4, $arg5)")
    public static int sysctl_min_unmapped_ratio_sysctl_handler(Ptr<misc.ctl_table> table, int write2, Ptr<?> buffer, Ptr<@Unsigned Long> length, Ptr<@OriginalName(value="loff_t") Long> ppos) {
        throw new MethodIsBPFRelatedFunction();
    }

    @Type(noCCodeGeneration=true, cType="struct sysctl_alias")
    @NotUsableInJava
    public static class sysctl_alias
    extends Struct {
        public String kernel_param;
        public String sysctl_param;
    }

    @Type(noCCodeGeneration=true, cType="enum sysctl_writes_mode")
    public static enum sysctl_writes_mode implements Enum<sysctl_writes_mode>,
    TypedEnum<sysctl_writes_mode, Integer>
    {
        SYSCTL_WRITES_LEGACY,
        SYSCTL_WRITES_WARN,
        SYSCTL_WRITES_STRICT;

    }

    @Type(noCCodeGeneration=true, cType="struct sysctl_fib_multipath_hash_seed")
    @NotUsableInJava
    public static class sysctl_fib_multipath_hash_seed
    extends Struct {
        public @Unsigned int user_seed;
        public @Unsigned int mp_seed;
    }
}

