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
import me.bechberger.ebpf.runtime.misc;
import me.bechberger.ebpf.runtime.runtime;
import me.bechberger.ebpf.type.Enum;
import me.bechberger.ebpf.type.Ptr;
import me.bechberger.ebpf.type.Struct;
import me.bechberger.ebpf.type.TypedEnum;

public final class LsmDefinitions {
    @NotUsableInJava
    @BuiltinBPFFunction(value="lsm_name_to_attr((const u8*)$arg1)")
    public static @Unsigned long lsm_name_to_attr(String name) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static @OriginalName(value="ssize_t") long lsm_read(Ptr<runtime.file> filp, String buf, @Unsigned long count, Ptr<@OriginalName(value="loff_t") Long> ppos) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction(value="lsm_append((const u8*)$arg1, $arg2)")
    public static int lsm_append(String _new, Ptr<String> result) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int lsm_blob_alloc(Ptr<Ptr<?>> dest, @Unsigned long size, @Unsigned @OriginalName(value="gfp_t") int gfp) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int lsm_fill_user_ctx(Ptr<lsm_ctx> uctx, Ptr<@Unsigned Integer> uctx_len, Ptr<?> val, @Unsigned long val_len, @Unsigned long id, @Unsigned long flags) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void lsm_set_blob_size(Ptr<Integer> need, Ptr<Integer> lbs) {
        throw new MethodIsBPFRelatedFunction();
    }

    @Type(noCCodeGeneration=true, cType="enum lsm_rule_types")
    public static enum lsm_rule_types implements Enum<lsm_rule_types>,
    TypedEnum<lsm_rule_types, Integer>
    {
        LSM_OBJ_USER,
        LSM_OBJ_ROLE,
        LSM_OBJ_TYPE,
        LSM_SUBJ_USER,
        LSM_SUBJ_ROLE,
        LSM_SUBJ_TYPE;

    }

    @Type(noCCodeGeneration=true, cType="struct lsm_ibendport_audit")
    @NotUsableInJava
    public static class lsm_ibendport_audit
    extends Struct {
        public String dev_name;
        public char port;
    }

    @Type(noCCodeGeneration=true, cType="struct lsm_ibpkey_audit")
    @NotUsableInJava
    public static class lsm_ibpkey_audit
    extends Struct {
        public @Unsigned long subnet_prefix;
        public @Unsigned short pkey;
    }

    @Type(noCCodeGeneration=true, cType="struct lsm_ioctlop_audit")
    @NotUsableInJava
    public static class lsm_ioctlop_audit
    extends Struct {
        public runtime.path path;
        public @Unsigned short cmd;
    }

    @Type(noCCodeGeneration=true, cType="struct lsm_network_audit")
    @NotUsableInJava
    public static class lsm_network_audit
    extends Struct {
        public int netif;
        public Ptr<runtime.sock> sk;
        public @Unsigned short family;
        public @Unsigned @OriginalName(value="__be16") short dport;
        public @Unsigned @OriginalName(value="__be16") short sport;
        public misc.fam_of_lsm_network_audit fam;
    }

    @Type(noCCodeGeneration=true, cType="enum lsm_event")
    public static enum lsm_event implements Enum<lsm_event>,
    TypedEnum<lsm_event, Integer>
    {
        LSM_POLICY_CHANGE;

    }

    @Type(noCCodeGeneration=true, cType="struct lsm_info")
    @NotUsableInJava
    public static class lsm_info
    extends Struct {
        public String name;
        public lsm_order order;
        public @Unsigned long flags;
        public Ptr<Integer> enabled;
        public Ptr<?> init;
        public Ptr<lsm_blob_sizes> blobs;
    }

    @Type(noCCodeGeneration=true, cType="enum lsm_order")
    public static enum lsm_order implements Enum<lsm_order>,
    TypedEnum<lsm_order, Integer>
    {
        LSM_ORDER_FIRST,
        LSM_ORDER_MUTABLE,
        LSM_ORDER_LAST;

    }

    @Type(noCCodeGeneration=true, cType="struct lsm_blob_sizes")
    @NotUsableInJava
    public static class lsm_blob_sizes
    extends Struct {
        public int lbs_cred;
        public int lbs_file;
        public int lbs_ib;
        public int lbs_inode;
        public int lbs_sock;
        public int lbs_superblock;
        public int lbs_ipc;
        public int lbs_key;
        public int lbs_msg_msg;
        public int lbs_perf_event;
        public int lbs_task;
        public int lbs_xattr_count;
        public int lbs_tun_dev;
        public int lbs_bdev;
    }

    @Type(noCCodeGeneration=true, cType="struct lsm_id")
    @NotUsableInJava
    public static class lsm_id
    extends Struct {
        public String name;
        public @Unsigned long id;
    }

    @Type(noCCodeGeneration=true, cType="enum lsm_integrity_type")
    public static enum lsm_integrity_type implements Enum<lsm_integrity_type>,
    TypedEnum<lsm_integrity_type, Integer>
    {
        LSM_INT_DMVERITY_SIG_VALID,
        LSM_INT_DMVERITY_ROOTHASH,
        LSM_INT_FSVERITY_BUILTINSIG_VALID;

    }

    @Type(noCCodeGeneration=true, cType="struct lsm_ctx")
    @NotUsableInJava
    public static class lsm_ctx
    extends Struct {
        public @Unsigned long id;
        public @Unsigned long flags;
        public @Unsigned long len;
        public @Unsigned long ctx_len;
        public char @Size(value=0) [] ctx;
    }
}

