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
import me.bechberger.ebpf.runtime.Ipv6Definitions;
import me.bechberger.ebpf.runtime.ListDefinitions;
import me.bechberger.ebpf.runtime.NetlblDefinitions;
import me.bechberger.ebpf.runtime.RequestDefinitions;
import me.bechberger.ebpf.runtime.SkDefinitions;
import me.bechberger.ebpf.runtime.misc;
import me.bechberger.ebpf.runtime.runtime;
import me.bechberger.ebpf.type.Ptr;
import me.bechberger.ebpf.type.Struct;

public final class CalipsoDefinitions {
    @NotUsableInJava
    @BuiltinBPFFunction(value="calipso_cache_add((const u8*)$arg1, (const struct netlbl_lsm_secattr*)$arg2)")
    public static int calipso_cache_add(String calipso_ptr, Ptr<NetlblDefinitions.netlbl_lsm_secattr> secattr) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void calipso_cache_invalidate() {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int calipso_doi_add(Ptr<calipso_doi> doi_def, Ptr<NetlblDefinitions.netlbl_audit> audit_info) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void calipso_doi_free(Ptr<calipso_doi> doi_def) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static Ptr<calipso_doi> calipso_doi_getdef(@Unsigned int doi) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void calipso_doi_putdef(Ptr<calipso_doi> doi_def) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int calipso_doi_remove(@Unsigned int doi, Ptr<NetlblDefinitions.netlbl_audit> audit_info) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction(value="calipso_doi_walk($arg1, (int (*)(struct calipso_doi*, void*))$arg2, $arg3)")
    public static int calipso_doi_walk(Ptr<@Unsigned Integer> skip_cnt, Ptr<?> callback2, Ptr<?> cb_arg) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction(value="calipso_getattr((const u8*)$arg1, $arg2)")
    public static int calipso_getattr(String calipso, Ptr<NetlblDefinitions.netlbl_lsm_secattr> secattr) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction(value="calipso_optptr((const struct sk_buff*)$arg1)")
    public static String calipso_optptr(Ptr<SkDefinitions.sk_buff> skb) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void calipso_req_delattr(Ptr<RequestDefinitions.request_sock> req2) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction(value="calipso_req_setattr($arg1, (const struct calipso_doi*)$arg2, (const struct netlbl_lsm_secattr*)$arg3)")
    public static int calipso_req_setattr(Ptr<RequestDefinitions.request_sock> req2, Ptr<calipso_doi> doi_def, Ptr<NetlblDefinitions.netlbl_lsm_secattr> secattr) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int calipso_skbuff_delattr(Ptr<SkDefinitions.sk_buff> skb) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction(value="calipso_skbuff_setattr($arg1, (const struct calipso_doi*)$arg2, (const struct netlbl_lsm_secattr*)$arg3)")
    public static int calipso_skbuff_setattr(Ptr<SkDefinitions.sk_buff> skb, Ptr<calipso_doi> doi_def, Ptr<NetlblDefinitions.netlbl_lsm_secattr> secattr) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void calipso_sock_delattr(Ptr<runtime.sock> sk) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int calipso_sock_getattr(Ptr<runtime.sock> sk, Ptr<NetlblDefinitions.netlbl_lsm_secattr> secattr) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction(value="calipso_sock_setattr($arg1, (const struct calipso_doi*)$arg2, (const struct netlbl_lsm_secattr*)$arg3)")
    public static int calipso_sock_setattr(Ptr<runtime.sock> sk, Ptr<calipso_doi> doi_def, Ptr<NetlblDefinitions.netlbl_lsm_secattr> secattr) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction(value="calipso_cache_check((const u8*)$arg1, $arg2, $arg3)")
    public static int calipso_cache_check(String key2, @Unsigned int key_len, Ptr<NetlblDefinitions.netlbl_lsm_secattr> secattr) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void calipso_cache_entry_free(Ptr<calipso_map_cache_entry> entry) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void calipso_doi_free_rcu(Ptr<misc.callback_head> entry) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void calipso_exit() {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction(value="calipso_genopt($arg1, $arg2, $arg3, (const struct calipso_doi*)$arg4, (const struct netlbl_lsm_secattr*)$arg5)")
    public static int calipso_genopt(String buf, @Unsigned int start, @Unsigned int buf_len, Ptr<calipso_doi> doi_def, Ptr<NetlblDefinitions.netlbl_lsm_secattr> secattr) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int calipso_init() {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int calipso_opt_del(Ptr<Ipv6Definitions.ipv6_opt_hdr> hop, Ptr<Ptr<Ipv6Definitions.ipv6_opt_hdr>> _new) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int calipso_opt_find(Ptr<Ipv6Definitions.ipv6_opt_hdr> hop, Ptr<@Unsigned Integer> start, Ptr<@Unsigned Integer> end) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction(value="calipso_opt_getattr((const u8*)$arg1, $arg2)")
    public static int calipso_opt_getattr(String calipso, Ptr<NetlblDefinitions.netlbl_lsm_secattr> secattr) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction(value="calipso_opt_insert($arg1, (const struct calipso_doi*)$arg2, (const struct netlbl_lsm_secattr*)$arg3)")
    public static Ptr<Ipv6Definitions.ipv6_opt_hdr> calipso_opt_insert(Ptr<Ipv6Definitions.ipv6_opt_hdr> hop, Ptr<calipso_doi> doi_def, Ptr<NetlblDefinitions.netlbl_lsm_secattr> secattr) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int calipso_opt_update(Ptr<runtime.sock> sk, Ptr<Ipv6Definitions.ipv6_opt_hdr> hop) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int calipso_pad_write(String buf, @Unsigned int offset, @Unsigned int count) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction(value="calipso_skbuff_optptr((const struct sk_buff*)$arg1)")
    public static String calipso_skbuff_optptr(Ptr<SkDefinitions.sk_buff> skb) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int calipso_tlv_len(Ptr<Ipv6Definitions.ipv6_opt_hdr> opt, @Unsigned int offset) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction(value="calipso_validate((const struct sk_buff*)$arg1, (const u8*)$arg2)")
    public static boolean calipso_validate(Ptr<SkDefinitions.sk_buff> skb, String option) {
        throw new MethodIsBPFRelatedFunction();
    }

    @Type(noCCodeGeneration=true, cType="struct calipso_map_cache_entry")
    @NotUsableInJava
    public static class calipso_map_cache_entry
    extends Struct {
        public @Unsigned int hash;
        public String key;
        public @Unsigned long key_len;
        public Ptr<NetlblDefinitions.netlbl_lsm_cache> lsm_data;
        public @Unsigned int activity;
        public ListDefinitions.list_head list;
    }

    @Type(noCCodeGeneration=true, cType="struct calipso_map_cache_bkt")
    @NotUsableInJava
    public static class calipso_map_cache_bkt
    extends Struct {
        public  @OriginalName(value="spinlock_t") runtime.spinlock lock;
        public @Unsigned int size;
        public ListDefinitions.list_head list;
    }

    @Type(noCCodeGeneration=true, cType="struct calipso_doi")
    @NotUsableInJava
    public static class calipso_doi
    extends Struct {
        public @Unsigned int doi;
        public @Unsigned int type;
        public  @OriginalName(value="refcount_t") misc.refcount_struct refcount;
        public ListDefinitions.list_head list;
        public misc.callback_head rcu;
    }
}

