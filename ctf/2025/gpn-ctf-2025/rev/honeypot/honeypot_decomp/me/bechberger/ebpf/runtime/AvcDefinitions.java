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
import me.bechberger.ebpf.runtime.AuditDefinitions;
import me.bechberger.ebpf.runtime.CommonDefinitions;
import me.bechberger.ebpf.runtime.ListDefinitions;
import me.bechberger.ebpf.runtime.misc;
import me.bechberger.ebpf.type.Ptr;
import me.bechberger.ebpf.type.Struct;

public final class AvcDefinitions {
    @NotUsableInJava
    @BuiltinBPFFunction(value="avc_add_callback((int (*)(unsigned int))$arg1, $arg2)")
    public static int avc_add_callback(Ptr<?> callback2, @Unsigned int events) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static Ptr<avc_node> avc_alloc_node() {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void avc_audit_post_callback(Ptr<AuditDefinitions.audit_buffer> ab, Ptr<?> a) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void avc_audit_pre_callback(Ptr<AuditDefinitions.audit_buffer> ab, Ptr<?> a) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void avc_compute_av(@Unsigned int ssid, @Unsigned int tsid, @Unsigned short tclass, Ptr<misc.av_decision> avd, Ptr<avc_xperms_node> xp_node) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void avc_copy_xperms_decision(Ptr<misc.extended_perms_decision> dest, Ptr<misc.extended_perms_decision> src) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int avc_denied(@Unsigned int ssid, @Unsigned int tsid, @Unsigned short tclass, @Unsigned int requested, char driver, char xperm, @Unsigned int flags, Ptr<misc.av_decision> avd) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static @Unsigned int avc_get_cache_threshold() {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int avc_get_hash_stats(String page2) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int avc_has_extended_perms(@Unsigned int ssid, @Unsigned int tsid, @Unsigned short tclass, @Unsigned int requested, char driver, char xperm, Ptr<CommonDefinitions.common_audit_data> ad) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int avc_has_perm(@Unsigned int ssid, @Unsigned int tsid, @Unsigned short tclass, @Unsigned int requested, Ptr<CommonDefinitions.common_audit_data> auditdata) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int avc_has_perm_noaudit(@Unsigned int ssid, @Unsigned int tsid, @Unsigned short tclass, @Unsigned int requested, @Unsigned int flags, Ptr<misc.av_decision> avd) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void avc_init() {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static Ptr<avc_node> avc_lookup(@Unsigned int ssid, @Unsigned int tsid, @Unsigned short tclass) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void avc_node_free(Ptr<misc.callback_head> rhead) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void avc_node_populate(Ptr<avc_node> node2, @Unsigned int ssid, @Unsigned int tsid, @Unsigned short tclass, Ptr<misc.av_decision> avd) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void avc_node_replace(Ptr<avc_node> _new, Ptr<avc_node> old) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int avc_perm_nonode(@Unsigned int ssid, @Unsigned int tsid, @Unsigned short tclass, @Unsigned int requested, @Unsigned int flags, Ptr<misc.av_decision> avd) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static @Unsigned int avc_policy_seqno() {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int avc_reclaim_node() {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void avc_set_cache_threshold(@Unsigned int cache_threshold) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int avc_ss_reset(@Unsigned int seqno) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int avc_update_node(@Unsigned int event2, @Unsigned int perms, char driver, char xperm, @Unsigned int ssid, @Unsigned int tsid, @Unsigned short tclass, @Unsigned int seqno, Ptr<misc.extended_perms_decision> xpd, @Unsigned int flags) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static Ptr<avc_xperms_decision_node> avc_xperms_decision_alloc(char which) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void avc_xperms_decision_free(Ptr<avc_xperms_decision_node> xpd_node) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void avc_xperms_free(Ptr<avc_xperms_node> xp_node) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int avc_xperms_populate(Ptr<avc_node> node2, Ptr<avc_xperms_node> src) {
        throw new MethodIsBPFRelatedFunction();
    }

    @Type(noCCodeGeneration=true, cType="struct avc_callback_node")
    @NotUsableInJava
    public static class avc_callback_node
    extends Struct {
        public Ptr<?> callback;
        public @Unsigned int events;
        public Ptr<avc_callback_node> next;
    }

    @Type(noCCodeGeneration=true, cType="struct avc_cache")
    @NotUsableInJava
    public static class avc_cache
    extends Struct {
        public misc.hlist_head @Size(value=512) [] slots;
        public  @OriginalName(value="spinlock_t") runtime.spinlock @Size(value=512) [] slots_lock;
        public AtomicDefinitions.atomic_t lru_hint;
        public AtomicDefinitions.atomic_t active_nodes;
        public @Unsigned int latest_notif;
    }

    @Type(noCCodeGeneration=true, cType="struct avc_xperms_decision_node")
    @NotUsableInJava
    public static class avc_xperms_decision_node
    extends Struct {
        public misc.extended_perms_decision xpd;
        public ListDefinitions.list_head xpd_list;
    }

    @Type(noCCodeGeneration=true, cType="struct avc_node")
    @NotUsableInJava
    public static class avc_node
    extends Struct {
        public avc_entry ae;
        public misc.hlist_node list;
        public misc.callback_head rhead;
    }

    @Type(noCCodeGeneration=true, cType="struct avc_xperms_node")
    @NotUsableInJava
    public static class avc_xperms_node
    extends Struct {
        public misc.extended_perms xp;
        public ListDefinitions.list_head xpd_head;
    }

    @Type(noCCodeGeneration=true, cType="struct avc_entry")
    @NotUsableInJava
    public static class avc_entry
    extends Struct {
        public @Unsigned int ssid;
        public @Unsigned int tsid;
        public @Unsigned short tclass;
        public misc.av_decision avd;
        public Ptr<avc_xperms_node> xp_node;
    }

    @Type(noCCodeGeneration=true, cType="struct avc_cache_stats")
    @NotUsableInJava
    public static class avc_cache_stats
    extends Struct {
        public @Unsigned int lookups;
        public @Unsigned int misses;
        public @Unsigned int allocations;
        public @Unsigned int reclaims;
        public @Unsigned int frees;
    }
}

