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
import me.bechberger.ebpf.runtime.AvtabDefinitions;
import me.bechberger.ebpf.runtime.PolicyDefinitions;
import me.bechberger.ebpf.runtime.RcuDefinitions;
import me.bechberger.ebpf.runtime.TraceDefinitions;
import me.bechberger.ebpf.runtime.misc;
import me.bechberger.ebpf.runtime.runtime;
import me.bechberger.ebpf.type.Ptr;
import me.bechberger.ebpf.type.Struct;

public final class CondDefinitions {
    @NotUsableInJava
    @BuiltinBPFFunction
    public static int __cond_resched() {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int __cond_resched_lock(Ptr< @OriginalName(value="spinlock_t") runtime.spinlock> lock) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int __cond_resched_rwlock_read(Ptr<misc.rwlock_t> lock) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int __cond_resched_rwlock_write(Ptr<misc.rwlock_t> lock) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void cond_synchronize_rcu(@Unsigned long oldstate) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void cond_synchronize_rcu_expedited(@Unsigned long oldstate) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void cond_synchronize_rcu_expedited_full(Ptr<RcuDefinitions.rcu_gp_oldstate> rgosp) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void cond_synchronize_rcu_full(Ptr<RcuDefinitions.rcu_gp_oldstate> rgosp) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static boolean cond_accept_memory(Ptr<runtime.zone> zone2, @Unsigned int order) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction(value="cond_bools_copy($arg1, (const struct hashtab_node*)$arg2, $arg3)")
    public static int cond_bools_copy(Ptr<misc.hashtab_node> _new, Ptr<misc.hashtab_node> orig, Ptr<?> args) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int cond_bools_destroy(Ptr<?> key2, Ptr<?> datum, Ptr<?> args) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int cond_bools_index(Ptr<?> key2, Ptr<?> datum, Ptr<?> args) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void cond_compute_av(Ptr<runtime.avtab> ctab, Ptr<AvtabDefinitions.avtab_key> key2, Ptr<misc.av_decision> avd, Ptr<misc.extended_perms> xperms) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void cond_compute_xperms(Ptr<runtime.avtab> ctab, Ptr<AvtabDefinitions.avtab_key> key2, Ptr<misc.extended_perms_decision> xpermd) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int cond_destroy_bool(Ptr<?> key2, Ptr<?> datum, Ptr<?> p) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction(value="cond_dup_av_list($arg1, (const struct cond_av_list*)$arg2, $arg3)")
    public static int cond_dup_av_list(Ptr<cond_av_list> _new, Ptr<cond_av_list> orig, Ptr<runtime.avtab> avtab2) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int cond_evaluate_expr(Ptr<runtime.policydb> p, Ptr<cond_expr> expr) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int cond_index_bool(Ptr<?> key2, Ptr<?> datum, Ptr<?> datap) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int cond_init_bool_indexes(Ptr<runtime.policydb> p) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction(value="cond_insertf($arg1, (const struct avtab_key*)$arg2, (const struct avtab_datum*)$arg3, $arg4)")
    public static int cond_insertf(Ptr<runtime.avtab> a, Ptr<AvtabDefinitions.avtab_key> k, Ptr<AvtabDefinitions.avtab_datum> d, Ptr<?> ptr) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void cond_list_destroy(Ptr<runtime.policydb> p) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void cond_policydb_destroy(Ptr<runtime.policydb> p) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void cond_policydb_destroy_dup(Ptr<runtime.policydb> p) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction(value="cond_policydb_dup($arg1, (const struct policydb*)$arg2)")
    public static int cond_policydb_dup(Ptr<runtime.policydb> _new, Ptr<runtime.policydb> orig) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void cond_policydb_init(Ptr<runtime.policydb> p) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int cond_read_av_list(Ptr<runtime.policydb> p, Ptr<?> fp, Ptr<cond_av_list> list, Ptr<cond_av_list> other) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int cond_read_bool(Ptr<runtime.policydb> p, Ptr<runtime.symtab> s2, Ptr<?> fp) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int cond_read_list(Ptr<runtime.policydb> p, Ptr<?> fp) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static boolean cond_snapshot_update(Ptr<TraceDefinitions.trace_array> tr, Ptr<?> cond_data) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int cond_write_av_list(Ptr<runtime.policydb> p, Ptr<cond_av_list> list, Ptr<PolicyDefinitions.policy_file> fp) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int cond_write_bool(Ptr<?> vkey, Ptr<?> datum, Ptr<?> ptr) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int cond_write_list(Ptr<runtime.policydb> p, Ptr<?> fp) {
        throw new MethodIsBPFRelatedFunction();
    }

    @Type(noCCodeGeneration=true, cType="struct cond_insertf_data")
    @NotUsableInJava
    public static class cond_insertf_data
    extends Struct {
        public Ptr<runtime.policydb> p;
        public Ptr<Ptr<AvtabDefinitions.avtab_node>> dst;
        public Ptr<cond_av_list> other;
    }

    @Type(noCCodeGeneration=true, cType="struct cond_av_list")
    @NotUsableInJava
    public static class cond_av_list
    extends Struct {
        public Ptr<Ptr<AvtabDefinitions.avtab_node>> nodes;
        public @Unsigned int len;
    }

    @Type(noCCodeGeneration=true, cType="struct cond_expr")
    @NotUsableInJava
    public static class cond_expr
    extends Struct {
        public Ptr<cond_expr_node> nodes;
        public @Unsigned int len;
    }

    @Type(noCCodeGeneration=true, cType="struct cond_expr_node")
    @NotUsableInJava
    public static class cond_expr_node
    extends Struct {
        public @Unsigned int expr_type;
        public @Unsigned int _boolean;
    }

    @Type(noCCodeGeneration=true, cType="struct cond_node")
    @NotUsableInJava
    public static class cond_node
    extends Struct {
        public int cur_state;
        public cond_expr expr;
        public cond_av_list true_list;
        public cond_av_list false_list;
    }

    @Type(noCCodeGeneration=true, cType="struct cond_bool_datum")
    @NotUsableInJava
    public static class cond_bool_datum
    extends Struct {
        public @Unsigned int value;
        public int state;
    }

    @Type(noCCodeGeneration=true, cType="struct cond_snapshot")
    @NotUsableInJava
    public static class cond_snapshot
    extends Struct {
        public Ptr<?> cond_data;
        public @OriginalName(value="cond_update_fn_t") Ptr<?> update;
    }
}

