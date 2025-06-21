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
import me.bechberger.ebpf.runtime.IpDefinitions;
import me.bechberger.ebpf.runtime.ListDefinitions;
import me.bechberger.ebpf.runtime.MapDefinitions;
import me.bechberger.ebpf.runtime.NetlblDefinitions;
import me.bechberger.ebpf.runtime.RequestDefinitions;
import me.bechberger.ebpf.runtime.SeqDefinitions;
import me.bechberger.ebpf.runtime.SkDefinitions;
import me.bechberger.ebpf.runtime.misc;
import me.bechberger.ebpf.runtime.runtime;
import me.bechberger.ebpf.type.Ptr;
import me.bechberger.ebpf.type.Struct;

public final class CipsoDefinitions {
    @NotUsableInJava
    @BuiltinBPFFunction(value="cipso_v4_cache_add((const u8*)$arg1, (const struct netlbl_lsm_secattr*)$arg2)")
    public static int cipso_v4_cache_add(String cipso_ptr, Ptr<NetlblDefinitions.netlbl_lsm_secattr> secattr) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction(value="cipso_v4_cache_check((const u8*)$arg1, $arg2, $arg3)")
    public static int cipso_v4_cache_check(String key2, @Unsigned int key_len, Ptr<NetlblDefinitions.netlbl_lsm_secattr> secattr) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void cipso_v4_cache_entry_free(Ptr<cipso_v4_map_cache_entry> entry) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void cipso_v4_cache_invalidate() {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int cipso_v4_delopt(Ptr<Ptr<IpDefinitions.ip_options_rcu>> opt_ptr) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int cipso_v4_doi_add(Ptr<cipso_v4_doi> doi_def, Ptr<NetlblDefinitions.netlbl_audit> audit_info) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void cipso_v4_doi_free(Ptr<cipso_v4_doi> doi_def) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void cipso_v4_doi_free_rcu(Ptr<misc.callback_head> entry) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static Ptr<cipso_v4_doi> cipso_v4_doi_getdef(@Unsigned int doi) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void cipso_v4_doi_putdef(Ptr<cipso_v4_doi> doi_def) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int cipso_v4_doi_remove(@Unsigned int doi, Ptr<NetlblDefinitions.netlbl_audit> audit_info) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction(value="cipso_v4_doi_walk($arg1, (int (*)(struct cipso_v4_doi*, void*))$arg2, $arg3)")
    public static int cipso_v4_doi_walk(Ptr<@Unsigned Integer> skip_cnt, Ptr<?> callback2, Ptr<?> cb_arg) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void cipso_v4_error(Ptr<SkDefinitions.sk_buff> skb, int error, @Unsigned int gateway) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction(value="cipso_v4_getattr((const u8*)$arg1, $arg2)")
    public static int cipso_v4_getattr(String cipso, Ptr<NetlblDefinitions.netlbl_lsm_secattr> secattr) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int cipso_v4_init() {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction(value="cipso_v4_optptr((const struct sk_buff*)$arg1)")
    public static String cipso_v4_optptr(Ptr<SkDefinitions.sk_buff> skb) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void cipso_v4_req_delattr(Ptr<RequestDefinitions.request_sock> req2) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction(value="cipso_v4_req_setattr($arg1, (const struct cipso_v4_doi*)$arg2, (const struct netlbl_lsm_secattr*)$arg3)")
    public static int cipso_v4_req_setattr(Ptr<RequestDefinitions.request_sock> req2, Ptr<cipso_v4_doi> doi_def, Ptr<NetlblDefinitions.netlbl_lsm_secattr> secattr) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int cipso_v4_skbuff_delattr(Ptr<SkDefinitions.sk_buff> skb) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction(value="cipso_v4_skbuff_setattr($arg1, (const struct cipso_v4_doi*)$arg2, (const struct netlbl_lsm_secattr*)$arg3)")
    public static int cipso_v4_skbuff_setattr(Ptr<SkDefinitions.sk_buff> skb, Ptr<cipso_v4_doi> doi_def, Ptr<NetlblDefinitions.netlbl_lsm_secattr> secattr) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void cipso_v4_sock_delattr(Ptr<runtime.sock> sk) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int cipso_v4_sock_getattr(Ptr<runtime.sock> sk, Ptr<NetlblDefinitions.netlbl_lsm_secattr> secattr) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction(value="cipso_v4_sock_setattr($arg1, (const struct cipso_v4_doi*)$arg2, (const struct netlbl_lsm_secattr*)$arg3, $arg4)")
    public static int cipso_v4_sock_setattr(Ptr<runtime.sock> sk, Ptr<cipso_v4_doi> doi_def, Ptr<NetlblDefinitions.netlbl_lsm_secattr> secattr, boolean sk_locked) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction(value="cipso_v4_validate((const struct sk_buff*)$arg1, $arg2)")
    public static int cipso_v4_validate(Ptr<SkDefinitions.sk_buff> skb, Ptr<String> option) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static Ptr<?> cipso_seq_next(Ptr<SeqDefinitions.seq_file> s2, Ptr<?> v, Ptr<@OriginalName(value="loff_t") Long> pos) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int cipso_seq_show(Ptr<SeqDefinitions.seq_file> s2, Ptr<?> v) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static Ptr<?> cipso_seq_start(Ptr<SeqDefinitions.seq_file> s2, Ptr<@OriginalName(value="loff_t") Long> pos) {
        throw new MethodIsBPFRelatedFunction();
    }

    @Type(noCCodeGeneration=true, cType="struct cipso_v4_map_cache_entry")
    @NotUsableInJava
    public static class cipso_v4_map_cache_entry
    extends Struct {
        public @Unsigned int hash;
        public String key;
        public @Unsigned long key_len;
        public Ptr<NetlblDefinitions.netlbl_lsm_cache> lsm_data;
        public @Unsigned int activity;
        public ListDefinitions.list_head list;
    }

    @Type(noCCodeGeneration=true, cType="struct cipso_v4_map_cache_bkt")
    @NotUsableInJava
    public static class cipso_v4_map_cache_bkt
    extends Struct {
        public  @OriginalName(value="spinlock_t") runtime.spinlock lock;
        public @Unsigned int size;
        public ListDefinitions.list_head list;
    }

    @Type(noCCodeGeneration=true, cType="struct cipso_v4_doi")
    @NotUsableInJava
    public static class cipso_v4_doi
    extends Struct {
        public @Unsigned int doi;
        public @Unsigned int type;
        public MapDefinitions.map_of_cipso_v4_doi map;
        public char @Size(value=5) [] tags;
        public @OriginalName(value="refcount_t") misc.refcount_struct refcount;
        public ListDefinitions.list_head list;
        public misc.callback_head rcu;
    }

    @Type(noCCodeGeneration=true, cType="struct cipso_v4_std_map_tbl")
    @NotUsableInJava
    public static class cipso_v4_std_map_tbl
    extends Struct {
        public misc.cat_of_cipso_v4_std_map_tbl_and_lvl_of_cipso_v4_std_map_tbl lvl;
        public misc.cat_of_cipso_v4_std_map_tbl_and_lvl_of_cipso_v4_std_map_tbl cat;
    }
}

