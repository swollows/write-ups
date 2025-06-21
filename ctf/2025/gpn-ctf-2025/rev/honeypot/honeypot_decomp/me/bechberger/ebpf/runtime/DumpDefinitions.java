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
import me.bechberger.ebpf.runtime.AnonDefinitions;
import me.bechberger.ebpf.runtime.AuditDefinitions;
import me.bechberger.ebpf.runtime.CommonDefinitions;
import me.bechberger.ebpf.runtime.FibDefinitions;
import me.bechberger.ebpf.runtime.NetlinkDefinitions;
import me.bechberger.ebpf.runtime.OomDefinitions;
import me.bechberger.ebpf.runtime.RcuDefinitions;
import me.bechberger.ebpf.runtime.ScxDefinitions;
import me.bechberger.ebpf.runtime.SeqDefinitions;
import me.bechberger.ebpf.runtime.SkDefinitions;
import me.bechberger.ebpf.runtime.SuperDefinitions;
import me.bechberger.ebpf.runtime.TaskDefinitions;
import me.bechberger.ebpf.runtime.misc;
import me.bechberger.ebpf.runtime.runtime;
import me.bechberger.ebpf.type.Ptr;
import me.bechberger.ebpf.type.Struct;

public final class DumpDefinitions {
    @NotUsableInJava
    @BuiltinBPFFunction
    public static int dump_masked_av_helper(Ptr<?> k, Ptr<?> d, Ptr<?> args) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int dump_rules(Ptr<SkDefinitions.sk_buff> skb, Ptr<NetlinkDefinitions.netlink_callback> cb, Ptr<FibDefinitions.fib_rules_ops> ops) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction(value="__dump_emit($arg1, (const void*)$arg2, $arg3)")
    public static int __dump_emit(Ptr<misc.coredump_params> cprm, Ptr<?> addr2, int nr) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int __dump_skip(Ptr<misc.coredump_params> cprm, @Unsigned long nr) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int dump_align(Ptr<misc.coredump_params> cprm, int align) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void dump_cpumask(Ptr<?> buffer, Ptr<@Unsigned Long> lenp, Ptr<@OriginalName(value="loff_t") Long> ppos, Ptr<runtime.cpumask> mask) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction(value="dump_emit($arg1, (const void*)$arg2, $arg3)")
    public static int dump_emit(Ptr<misc.coredump_params> cprm, Ptr<?> addr2, int nr) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void dump_header(Ptr<OomDefinitions.oom_control> oc) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static boolean dump_interrupted() {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void dump_kprobe(Ptr<runtime.kprobe> kp) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction(value="dump_security_xattr((const u8*)$arg1, (const u8*)$arg2, $arg3)")
    public static void dump_security_xattr(String name, String value, @Unsigned long value_len) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction(value="dump_security_xattr_l((const u8*)$arg1, (const void*)$arg2, $arg3)")
    public static void dump_security_xattr_l(String prefix, Ptr<?> src, @Unsigned long count) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void dump_skip(Ptr<misc.coredump_params> cprm, @Unsigned long nr) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void dump_skip_to(Ptr<misc.coredump_params> cprm, @Unsigned long pos) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int dump_task(Ptr<TaskDefinitions.task_struct> p, Ptr<?> arg2) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int dump_user_range(Ptr<misc.coredump_params> cprm, @Unsigned long start, @Unsigned long len) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static boolean dump_vma_snapshot(Ptr<misc.coredump_params> cprm) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void dump_blkd_tasks(Ptr<RcuDefinitions.rcu_node> rnp, int ncheck) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void dump_common_audit_data(Ptr<AuditDefinitions.audit_buffer> ab, Ptr<CommonDefinitions.common_audit_data> a) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void dump_cpu_task(int cpu2) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction(value="dump_hmem_attrs($arg1, (const u8*)$arg2)")
    public static void dump_hmem_attrs(Ptr<misc.access_coordinate> coord, String prefix) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction(value="dump_mapping((const struct address_space*)$arg1)")
    public static void dump_mapping(Ptr<misc.address_space> mapping) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int dump_properties_enable(String arg2) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void dump_rmpentry(@Unsigned long pfn) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void dump_stack() {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction(value="dump_stack_lvl((const u8*)$arg1)")
    public static void dump_stack_lvl(String log_lvl) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction(value="dump_stack_print_info((const u8*)$arg1)")
    public static void dump_stack_print_info(String log_lvl) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction(value="dump_stack_set_arch_desc((const u8*)$arg1, $arg2_)")
    public static void dump_stack_set_arch_desc(String fmt, Object ... param1) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void __dump_folio(Ptr<runtime.folio> folio2, Ptr<runtime.page> page2, @Unsigned long pfn, @Unsigned long idx) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction(value="__dump_mmp_msg($arg1, $arg2, (const u8*)$arg3, $arg4, (const u8*)$arg5)")
    public static void __dump_mmp_msg(Ptr<SuperDefinitions.super_block> sb, Ptr<misc.mmp_struct> mmp, String function, @Unsigned int line2, String msg) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction(value="__dump_page((const struct page*)$arg1)")
    public static void __dump_page(Ptr<runtime.page> page2) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void dump_cpu_stub(Ptr<ScxDefinitions.scx_dump_ctx> ctx, int cpu2, boolean idle) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int dump_kernel_offset(Ptr<misc.notifier_block> self, @Unsigned long v, Ptr<?> p) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction(value="dump_line($arg1, (const u8*)$arg2, $arg3_)")
    public static void dump_line(Ptr<SeqDefinitions.seq_buf> s2, String fmt, Object ... param2) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void dump_newline(Ptr<SeqDefinitions.seq_buf> s2) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction(value="dump_page((const struct page*)$arg1, (const u8*)$arg2)")
    public static void dump_page(Ptr<runtime.page> page2, String reason) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void dump_pagetable(@Unsigned long address) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void dump_stub(Ptr<ScxDefinitions.scx_dump_ctx> ctx) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void dump_task_stub(Ptr<ScxDefinitions.scx_dump_ctx> ctx, Ptr<TaskDefinitions.task_struct> p) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void dump_unreclaimable_slab() {
        throw new MethodIsBPFRelatedFunction();
    }

    @Type(noCCodeGeneration=true, cType="struct { u8 module_flags; u8 sensor_count; struct { struct { } __empty_sensor; struct ec_response_motion_sensor_data sensor[0]; }; }")
    @NotUsableInJava
    public static class dump_of_anon_member_of_ec_response_motion_sense
    extends Struct {
        public @OriginalName(value="uint8_t") char module_flags;
        public @OriginalName(value="uint8_t") char sensor_count;
        public AnonDefinitions.anon_member_of_dump_of_anon_member_of_ec_response_motion_sense anon2;
    }

    @Type(noCCodeGeneration=true, cType="struct { u8 max_sensor_count; }")
    @NotUsableInJava
    public static class dump_of_anon_member_of_ec_params_motion_sense
    extends Struct {
        public @OriginalName(value="uint8_t") char max_sensor_count;
    }
}

