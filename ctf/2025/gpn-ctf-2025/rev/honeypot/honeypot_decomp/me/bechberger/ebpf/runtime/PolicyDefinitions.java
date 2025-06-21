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
import me.bechberger.ebpf.runtime.AaDefinitions;
import me.bechberger.ebpf.runtime.AtomicDefinitions;
import me.bechberger.ebpf.runtime.CpufreqDefinitions;
import me.bechberger.ebpf.runtime.DelayedDefinitions;
import me.bechberger.ebpf.runtime.DeviceDefinitions;
import me.bechberger.ebpf.runtime.FscryptDefinitions;
import me.bechberger.ebpf.runtime.IrqDefinitions;
import me.bechberger.ebpf.runtime.ListDefinitions;
import me.bechberger.ebpf.runtime.XfrmDefinitions;
import me.bechberger.ebpf.runtime.misc;
import me.bechberger.ebpf.runtime.runtime;
import me.bechberger.ebpf.type.Enum;
import me.bechberger.ebpf.type.Ptr;
import me.bechberger.ebpf.type.Struct;
import me.bechberger.ebpf.type.TypedEnum;
import me.bechberger.ebpf.type.Union;

public final class PolicyDefinitions {
    @NotUsableInJava
    @BuiltinBPFFunction
    public static boolean policy_has_boost_freq(Ptr<CpufreqDefinitions.cpufreq_policy> policy) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction(value="policy_hash_bysel($arg1, (const struct xfrm_selector*)$arg2, $arg3, $arg4)")
    public static Ptr<misc.hlist_head> policy_hash_bysel(Ptr<runtime.net> net2, Ptr<XfrmDefinitions.xfrm_selector> sel, @Unsigned short family, int dir) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static boolean policy_is_shared(Ptr<CpufreqDefinitions.cpufreq_policy> policy) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static Ptr<misc.nodemask_t> policy_mbind_nodemask(@Unsigned @OriginalName(value="gfp_t") int gfp) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int policy_setup(String str) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction(value="((const u8*)policy_get_link($arg1, $arg2, $arg3))")
    public static String policy_get_link(Ptr<runtime.dentry> dentry2, Ptr<runtime.inode> inode2, Ptr<DelayedDefinitions.delayed_call> done) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static Ptr<misc.nodemask_t> policy_nodemask(@Unsigned @OriginalName(value="gfp_t") int gfp, Ptr<runtime.mempolicy> pol, @Unsigned long ilx, Ptr<Integer> nid) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int policy_readlink(Ptr<runtime.dentry> dentry2, String buffer, int buflen) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static @OriginalName(value="ssize_t") long policy_show(Ptr<runtime.device> dev, Ptr<DeviceDefinitions.device_attribute> devattr, String buf) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction(value="policy_store($arg1, $arg2, (const u8*)$arg3, $arg4)")
    public static @OriginalName(value="ssize_t") long policy_store(Ptr<runtime.device> dev, Ptr<DeviceDefinitions.device_attribute> attr2, String buf, @Unsigned long count) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction(value="policy_update($arg1, (const u8*)$arg2, $arg3, $arg4, $arg5)")
    public static @OriginalName(value="ssize_t") long policy_update(@Unsigned int mask, String buf, @Unsigned long size, Ptr<@OriginalName(value="loff_t") Long> pos, Ptr<AaDefinitions.aa_ns> ns) {
        throw new MethodIsBPFRelatedFunction();
    }

    @Type(noCCodeGeneration=true, cType="union { u8 version; struct fscrypt_policy_v1 v1; struct fscrypt_policy_v2 v2; }")
    @NotUsableInJava
    public static class policy_of_fscrypt_get_policy_ex_arg
    extends Union {
        public char version;
        public FscryptDefinitions.fscrypt_policy_v1 v1;
        public FscryptDefinitions.fscrypt_policy_v2 v2;
    }

    @Type(noCCodeGeneration=true, cType="enum policy_opt")
    public static enum policy_opt implements Enum<policy_opt>,
    TypedEnum<policy_opt, Integer>
    {
        Opt_measure,
        Opt_dont_measure,
        Opt_appraise,
        Opt_dont_appraise,
        Opt_audit,
        Opt_hash,
        Opt_dont_hash,
        Opt_obj_user,
        Opt_obj_role,
        Opt_obj_type,
        Opt_subj_user,
        Opt_subj_role,
        Opt_subj_type,
        Opt_func,
        Opt_mask,
        Opt_fsmagic,
        Opt_fsname,
        Opt_fsuuid,
        Opt_uid_eq,
        Opt_euid_eq,
        Opt_gid_eq,
        Opt_egid_eq,
        Opt_fowner_eq,
        Opt_fgroup_eq,
        Opt_uid_gt,
        Opt_euid_gt,
        Opt_gid_gt,
        Opt_egid_gt,
        Opt_fowner_gt,
        Opt_fgroup_gt,
        Opt_uid_lt,
        Opt_euid_lt,
        Opt_gid_lt,
        Opt_egid_lt,
        Opt_fowner_lt,
        Opt_fgroup_lt,
        Opt_digest_type,
        Opt_appraise_type,
        Opt_appraise_flag,
        Opt_appraise_algos,
        Opt_permit_directio,
        Opt_pcr,
        Opt_template,
        Opt_keyrings,
        Opt_label,
        Opt_err;

    }

    @Type(noCCodeGeneration=true, cType="enum policy_rule_list")
    public static enum policy_rule_list implements Enum<policy_rule_list>,
    TypedEnum<policy_rule_list, Integer>
    {
        IMA_DEFAULT_POLICY,
        IMA_CUSTOM_POLICY;

    }

    @Type(noCCodeGeneration=true, cType="enum policy_types")
    public static enum policy_types implements Enum<policy_types>,
    TypedEnum<policy_types, Integer>
    {
        ORIGINAL_TCB,
        DEFAULT_TCB;

    }

    @Type(noCCodeGeneration=true, cType="struct policy_dbs_info")
    @NotUsableInJava
    public static class policy_dbs_info
    extends Struct {
        public Ptr<CpufreqDefinitions.cpufreq_policy> policy;
        public runtime.mutex update_mutex;
        public @Unsigned long last_sample_time;
        public long sample_delay_ns;
        public AtomicDefinitions.atomic_t work_count;
        public IrqDefinitions.irq_work irq_work;
        public misc.work_struct work;
        public Ptr<misc.dbs_data> dbs_data;
        public ListDefinitions.list_head list;
        public @Unsigned int rate_mult;
        public @Unsigned int idle_periods;
        public boolean is_shared;
        public boolean work_in_progress;
    }

    @Type(noCCodeGeneration=true, cType="struct policy_data")
    @NotUsableInJava
    public static class policy_data
    extends Struct {
        public Ptr<runtime.policydb> p;
        public Ptr<?> fp;
    }

    @Type(noCCodeGeneration=true, cType="struct policy_file")
    @NotUsableInJava
    public static class policy_file
    extends Struct {
        public String data;
        public @Unsigned long len;
    }

    @Type(noCCodeGeneration=true, cType="struct policy_load_memory")
    @NotUsableInJava
    public static class policy_load_memory
    extends Struct {
        public @Unsigned long len;
        public Ptr<?> data;
    }
}

