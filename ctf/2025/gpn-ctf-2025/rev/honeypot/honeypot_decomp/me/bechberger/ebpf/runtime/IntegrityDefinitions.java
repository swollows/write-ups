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
import me.bechberger.ebpf.runtime.runtime;
import me.bechberger.ebpf.type.Enum;
import me.bechberger.ebpf.type.Ptr;
import me.bechberger.ebpf.type.Struct;
import me.bechberger.ebpf.type.TypedEnum;

public final class IntegrityDefinitions {
    @NotUsableInJava
    @BuiltinBPFFunction
    public static int integrity_fs_init() {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int integrity_kernel_read(Ptr<runtime.file> file2, @OriginalName(value="loff_t") long offset, Ptr<?> addr2, @Unsigned long count) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void integrity_load_keys() {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction(value="integrity_add_key((const unsigned int)$arg1, (const void*)$arg2, $arg3, $arg4)")
    public static int integrity_add_key(@Unsigned int id, Ptr<?> data, @OriginalName(value="off_t") long size, @Unsigned @OriginalName(value="key_perm_t") int perm) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction(value="integrity_digsig_verify((const unsigned int)$arg1, (const u8*)$arg2, $arg3, (const u8*)$arg4, $arg5)")
    public static int integrity_digsig_verify(@Unsigned int id, String sig, int siglen, String digest, int digestlen) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction(value="integrity_init_keyring((const unsigned int)$arg1)")
    public static int integrity_init_keyring(@Unsigned int id) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction(value="integrity_keyring_from_id((const unsigned int)$arg1)")
    public static Ptr<runtime.key> integrity_keyring_from_id(@Unsigned int id) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction(value="integrity_load_cert((const unsigned int)$arg1, (const u8*)$arg2, (const void*)$arg3, $arg4, $arg5)")
    public static int integrity_load_cert(@Unsigned int id, String source, Ptr<?> data, @Unsigned long len, @Unsigned @OriginalName(value="key_perm_t") int perm) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction(value="integrity_load_x509((const unsigned int)$arg1, (const u8*)$arg2)")
    public static int integrity_load_x509(@Unsigned int id, String path2) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction(value="integrity_modsig_verify((const unsigned int)$arg1, (const struct modsig*)$arg2)")
    public static int integrity_modsig_verify(@Unsigned int id, Ptr<runtime.modsig> modsig2) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction(value="integrity_audit_message($arg1, $arg2, (const u8*)$arg3, (const u8*)$arg4, (const u8*)$arg5, $arg6, $arg7, $arg8)")
    public static void integrity_audit_message(int audit_msgno, Ptr<runtime.inode> inode2, String fname2, String op, String cause, int result, int audit_info, int errno) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction(value="integrity_audit_msg($arg1, $arg2, (const u8*)$arg3, (const u8*)$arg4, (const u8*)$arg5, $arg6, $arg7)")
    public static void integrity_audit_msg(int audit_msgno, Ptr<runtime.inode> inode2, String fname2, String op, String cause, int result, int audit_info) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int integrity_audit_setup(String str) {
        throw new MethodIsBPFRelatedFunction();
    }

    @Type(noCCodeGeneration=true, cType="struct integrity_inode_attributes")
    @NotUsableInJava
    public static class integrity_inode_attributes
    extends Struct {
        public @Unsigned long version;
        public @Unsigned long ino;
        public @Unsigned @OriginalName(value="dev_t") int dev;
    }

    @Type(noCCodeGeneration=true, cType="enum integrity_status")
    public static enum integrity_status implements Enum<integrity_status>,
    TypedEnum<integrity_status, Integer>
    {
        INTEGRITY_PASS,
        INTEGRITY_PASS_IMMUTABLE,
        INTEGRITY_FAIL,
        INTEGRITY_FAIL_IMMUTABLE,
        INTEGRITY_NOLABEL,
        INTEGRITY_NOXATTRS,
        INTEGRITY_UNKNOWN;

    }
}

