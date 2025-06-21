/*
 * Decompiled with CFR 0.153-SNAPSHOT (d6f6758-dirty).
 */
package me.bechberger.ebpf.runtime;

import me.bechberger.ebpf.annotations.Size;
import me.bechberger.ebpf.annotations.Type;
import me.bechberger.ebpf.annotations.Unsigned;
import me.bechberger.ebpf.annotations.bpf.BuiltinBPFFunction;
import me.bechberger.ebpf.annotations.bpf.MethodIsBPFRelatedFunction;
import me.bechberger.ebpf.annotations.bpf.NotUsableInJava;
import me.bechberger.ebpf.runtime.AuditDefinitions;
import me.bechberger.ebpf.runtime.BlockDefinitions;
import me.bechberger.ebpf.runtime.KernelDefinitions;
import me.bechberger.ebpf.runtime.LinuxDefinitions;
import me.bechberger.ebpf.runtime.ListDefinitions;
import me.bechberger.ebpf.runtime.LsmDefinitions;
import me.bechberger.ebpf.runtime.SuperDefinitions;
import me.bechberger.ebpf.runtime.VmDefinitions;
import me.bechberger.ebpf.runtime.misc;
import me.bechberger.ebpf.runtime.runtime;
import me.bechberger.ebpf.type.Enum;
import me.bechberger.ebpf.type.Ptr;
import me.bechberger.ebpf.type.Struct;
import me.bechberger.ebpf.type.TypedEnum;

public final class IpeDefinitions {
    @NotUsableInJava
    @BuiltinBPFFunction
    public static void ipe_free_policy(Ptr<ipe_policy> p) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction(value="ipe_new_policy((const u8*)$arg1, $arg2, (const u8*)$arg3, $arg4)")
    public static Ptr<ipe_policy> ipe_new_policy(String text, @Unsigned long textlen, String pkcs7, @Unsigned long pkcs7len) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction(value="ipe_set_active_pol((const struct ipe_policy*)$arg1)")
    public static int ipe_set_active_pol(Ptr<ipe_policy> p) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction(value="ipe_update_policy($arg1, (const u8*)$arg2, $arg3, (const u8*)$arg4, $arg5)")
    public static int ipe_update_policy(Ptr<runtime.inode> root, String text, @Unsigned long textlen, String pkcs7, @Unsigned long pkcs7len) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void ipe_free_parsed_policy(Ptr<ipe_parsed_policy> p) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int ipe_init_securityfs() {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int ipe_parse_policy(Ptr<ipe_policy> p) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void ipe_bdev_free_security(Ptr<BlockDefinitions.block_device> bdev) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction(value="ipe_bdev_setintegrity($arg1, $arg2, (const void*)$arg3, $arg4)")
    public static int ipe_bdev_setintegrity(Ptr<BlockDefinitions.block_device> bdev, LsmDefinitions.lsm_integrity_type type2, Ptr<?> value, @Unsigned long size) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int ipe_bprm_check_security(Ptr<LinuxDefinitions.linux_binprm> bprm) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction(value="ipe_build_eval_ctx($arg1, (const struct file*)$arg2, $arg3, $arg4)")
    public static void ipe_build_eval_ctx(Ptr<ipe_eval_ctx> ctx, Ptr<runtime.file> file2, ipe_op_type op, ipe_hook_type hook) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void ipe_del_policyfs_node(Ptr<ipe_policy> p) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction(value="ipe_digest_audit($arg1, (const struct digest_info*)$arg2)")
    public static void ipe_digest_audit(Ptr<AuditDefinitions.audit_buffer> ab, Ptr<misc.digest_info> info2) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction(value="ipe_digest_eval((const struct digest_info*)$arg1, (const struct digest_info*)$arg2)")
    public static boolean ipe_digest_eval(Ptr<misc.digest_info> expected, Ptr<misc.digest_info> digest) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void ipe_digest_free(Ptr<misc.digest_info> info2) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction(value="ipe_digest_parse((const u8*)$arg1)")
    public static Ptr<misc.digest_info> ipe_digest_parse(String valstr) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction(value="ipe_evaluate_event((const const struct ipe_eval_ctx*)$arg1)")
    public static int ipe_evaluate_event(Ptr<ipe_eval_ctx> ctx) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int ipe_file_mprotect(Ptr<VmDefinitions.vm_area_struct> vma, @Unsigned long reqprot, @Unsigned long prot) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction(value="ipe_inode_setintegrity((const struct inode*)$arg1, $arg2, (const void*)$arg3, $arg4)")
    public static int ipe_inode_setintegrity(Ptr<runtime.inode> inode2, LsmDefinitions.lsm_integrity_type type2, Ptr<?> value, @Unsigned long size) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int ipe_kernel_load_data(KernelDefinitions.kernel_load_data_id id, boolean contents) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int ipe_kernel_read_file(Ptr<runtime.file> file2, KernelDefinitions.kernel_read_file_id id, boolean contents) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int ipe_mmap_file(Ptr<runtime.file> f, @Unsigned long reqprot, @Unsigned long prot, @Unsigned long flags) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int ipe_new_policyfs_node(Ptr<ipe_policy> p) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void ipe_unpack_initramfs() {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void ipe_audit_enforce(boolean new_enforce, boolean old_enforce) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction(value="ipe_audit_match((const const struct ipe_eval_ctx*)$arg1, $arg2, $arg3, (const const struct ipe_rule*)$arg4)")
    public static void ipe_audit_match(Ptr<ipe_eval_ctx> ctx, ipe_match match_type, ipe_action_type act, Ptr<ipe_rule> r) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction(value="ipe_audit_policy_activation((const const struct ipe_policy*)$arg1, (const const struct ipe_policy*)$arg2)")
    public static void ipe_audit_policy_activation(Ptr<ipe_policy> op, Ptr<ipe_policy> np) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction(value="ipe_audit_policy_load((const const struct ipe_policy*)$arg1)")
    public static void ipe_audit_policy_load(Ptr<ipe_policy> p) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int ipe_init() {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction(value="ipe_sb((const struct super_block*)$arg1)")
    public static Ptr<ipe_superblock> ipe_sb(Ptr<SuperDefinitions.super_block> sb) {
        throw new MethodIsBPFRelatedFunction();
    }

    @Type(noCCodeGeneration=true, cType="enum ipe_match")
    public static enum ipe_match implements Enum<ipe_match>,
    TypedEnum<ipe_match, Integer>
    {
        IPE_MATCH_RULE,
        IPE_MATCH_TABLE,
        IPE_MATCH_GLOBAL,
        __IPE_MATCH_MAX;

    }

    @Type(noCCodeGeneration=true, cType="struct ipe_eval_ctx")
    @NotUsableInJava
    public static class ipe_eval_ctx
    extends Struct {
        public ipe_op_type op;
        public ipe_hook_type hook;
        public Ptr<runtime.file> file;
        public boolean initramfs;
        public Ptr<ipe_bdev> ipe_bdev;
        public Ptr<runtime.inode> ino;
        public Ptr<ipe_inode> ipe_inode;
    }

    @Type(noCCodeGeneration=true, cType="enum ipe_hook_type")
    public static enum ipe_hook_type implements Enum<ipe_hook_type>,
    TypedEnum<ipe_hook_type, Integer>
    {
        IPE_HOOK_BPRM_CHECK,
        IPE_HOOK_MMAP,
        IPE_HOOK_MPROTECT,
        IPE_HOOK_KERNEL_READ,
        IPE_HOOK_KERNEL_LOAD,
        __IPE_HOOK_MAX;

    }

    @Type(noCCodeGeneration=true, cType="struct ipe_rule")
    @NotUsableInJava
    public static class ipe_rule
    extends Struct {
        public ipe_op_type op;
        public ipe_action_type action;
        public ListDefinitions.list_head props;
        public ListDefinitions.list_head next;
    }

    @Type(noCCodeGeneration=true, cType="struct ipe_prop")
    @NotUsableInJava
    public static class ipe_prop
    extends Struct {
        public ListDefinitions.list_head next;
        public ipe_prop_type type;
        public Ptr<?> value;
    }

    @Type(noCCodeGeneration=true, cType="enum ipe_prop_type")
    public static enum ipe_prop_type implements Enum<ipe_prop_type>,
    TypedEnum<ipe_prop_type, Integer>
    {
        IPE_PROP_BOOT_VERIFIED_FALSE,
        IPE_PROP_BOOT_VERIFIED_TRUE,
        IPE_PROP_DMV_ROOTHASH,
        IPE_PROP_DMV_SIG_FALSE,
        IPE_PROP_DMV_SIG_TRUE,
        IPE_PROP_FSV_DIGEST,
        IPE_PROP_FSV_SIG_FALSE,
        IPE_PROP_FSV_SIG_TRUE,
        __IPE_PROP_MAX;

    }

    @Type(noCCodeGeneration=true, cType="struct ipe_inode")
    @NotUsableInJava
    public static class ipe_inode
    extends Struct {
        public boolean fs_verity_signed;
    }

    @Type(noCCodeGeneration=true, cType="struct ipe_bdev")
    @NotUsableInJava
    public static class ipe_bdev
    extends Struct {
        public boolean dm_verity_signed;
        public Ptr<misc.digest_info> root_hash;
    }

    @Type(noCCodeGeneration=true, cType="struct ipe_superblock")
    @NotUsableInJava
    public static class ipe_superblock
    extends Struct {
        public boolean initramfs;
    }

    @Type(noCCodeGeneration=true, cType="struct ipe_policy")
    @NotUsableInJava
    public static class ipe_policy
    extends Struct {
        public String pkcs7;
        public @Unsigned long pkcs7len;
        public String text;
        public @Unsigned long textlen;
        public Ptr<ipe_parsed_policy> parsed;
        public Ptr<runtime.dentry> policyfs;
    }

    @Type(noCCodeGeneration=true, cType="struct ipe_parsed_policy")
    @NotUsableInJava
    public static class ipe_parsed_policy
    extends Struct {
        public String name;
        public misc.version_of_ipe_parsed_policy version;
        public ipe_action_type global_default_action;
        public ipe_op_table @Size(value=7) [] rules;
    }

    @Type(noCCodeGeneration=true, cType="struct ipe_op_table")
    @NotUsableInJava
    public static class ipe_op_table
    extends Struct {
        public ListDefinitions.list_head rules;
        public ipe_action_type default_action;
    }

    @Type(noCCodeGeneration=true, cType="enum ipe_action_type")
    public static enum ipe_action_type implements Enum<ipe_action_type>,
    TypedEnum<ipe_action_type, Integer>
    {
        IPE_ACTION_ALLOW,
        IPE_ACTION_DENY,
        __IPE_ACTION_MAX;

    }

    @Type(noCCodeGeneration=true, cType="enum ipe_op_type")
    public static enum ipe_op_type implements Enum<ipe_op_type>,
    TypedEnum<ipe_op_type, Integer>
    {
        IPE_OP_EXEC,
        IPE_OP_FIRMWARE,
        IPE_OP_KERNEL_MODULE,
        IPE_OP_KEXEC_IMAGE,
        IPE_OP_KEXEC_INITRAMFS,
        IPE_OP_POLICY,
        IPE_OP_X509,
        __IPE_OP_MAX;

    }
}

