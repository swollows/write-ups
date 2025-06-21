/*
 * Decompiled with CFR 0.153-SNAPSHOT (d6f6758-dirty).
 */
package me.bechberger.ebpf.runtime;

import me.bechberger.ebpf.annotations.InlineUnion;
import me.bechberger.ebpf.annotations.OriginalName;
import me.bechberger.ebpf.annotations.Size;
import me.bechberger.ebpf.annotations.Type;
import me.bechberger.ebpf.annotations.Unsigned;
import me.bechberger.ebpf.annotations.bpf.BuiltinBPFFunction;
import me.bechberger.ebpf.annotations.bpf.MethodIsBPFRelatedFunction;
import me.bechberger.ebpf.annotations.bpf.NotUsableInJava;
import me.bechberger.ebpf.runtime.CryptoDefinitions;
import me.bechberger.ebpf.runtime.IovDefinitions;
import me.bechberger.ebpf.runtime.KernelDefinitions;
import me.bechberger.ebpf.runtime.runtime;
import me.bechberger.ebpf.type.Ptr;
import me.bechberger.ebpf.type.Struct;

public final class KeyctlDefinitions {
    @NotUsableInJava
    @BuiltinBPFFunction
    public static long __keyctl_dh_compute(Ptr<keyctl_dh_params> params, String buffer, @Unsigned long buflen, Ptr<keyctl_kdf_params> kdfcopy) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static long keyctl_dh_compute(Ptr<keyctl_dh_params> params, String buffer, @Unsigned long buflen, Ptr<keyctl_kdf_params> kdf) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int keyctl_dh_compute_kdf(Ptr<CryptoDefinitions.crypto_shash> hash2, String buffer, @Unsigned long buflen, Ptr<@OriginalName(value="uint8_t") Character> kbuf, @Unsigned long kbuflen) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction(value="keyctl_pkey_e_d_s($arg1, (const struct keyctl_pkey_params*)$arg2, (const u8*)$arg3, (const void*)$arg4, $arg5)")
    public static long keyctl_pkey_e_d_s(int op, Ptr<keyctl_pkey_params> _params, String _info, Ptr<?> _in, Ptr<?> _out) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction(value="keyctl_pkey_params_get($arg1, (const u8*)$arg2, $arg3)")
    public static int keyctl_pkey_params_get(@OriginalName(value="key_serial_t") int id, String _info, Ptr<KernelDefinitions.kernel_pkey_params> params) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction(value="keyctl_pkey_params_get_2((const struct keyctl_pkey_params*)$arg1, (const u8*)$arg2, $arg3, $arg4)")
    public static int keyctl_pkey_params_get_2(Ptr<keyctl_pkey_params> _params, String _info, int op, Ptr<KernelDefinitions.kernel_pkey_params> params) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction(value="keyctl_pkey_verify((const struct keyctl_pkey_params*)$arg1, (const u8*)$arg2, (const void*)$arg3, (const void*)$arg4)")
    public static long keyctl_pkey_verify(Ptr<keyctl_pkey_params> _params, String _info, Ptr<?> _in, Ptr<?> _in2) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static long keyctl_assume_authority(@OriginalName(value="key_serial_t") int id) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static long keyctl_capabilities(String _buffer, @Unsigned long buflen) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int keyctl_change_reqkey_auth(Ptr<runtime.key> key2) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static long keyctl_chown_key(@OriginalName(value="key_serial_t") int id, @Unsigned @OriginalName(value="uid_t") int user, @Unsigned @OriginalName(value="gid_t") int group) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static long keyctl_describe_key(@OriginalName(value="key_serial_t") int keyid, String buffer, @Unsigned long buflen) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static long keyctl_get_keyring_ID(@OriginalName(value="key_serial_t") int id, int create) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static long keyctl_get_persistent(@Unsigned @OriginalName(value="uid_t") int _uid, @OriginalName(value="key_serial_t") int destid) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static long keyctl_get_security(@OriginalName(value="key_serial_t") int keyid, String buffer, @Unsigned long buflen) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction(value="keyctl_instantiate_key($arg1, (const void*)$arg2, $arg3, $arg4)")
    public static long keyctl_instantiate_key(@OriginalName(value="key_serial_t") int id, Ptr<?> _payload, @Unsigned long plen, @OriginalName(value="key_serial_t") int ringid) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static long keyctl_instantiate_key_common(@OriginalName(value="key_serial_t") int id, Ptr<IovDefinitions.iov_iter> from, @OriginalName(value="key_serial_t") int ringid) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction(value="keyctl_instantiate_key_iov($arg1, (const struct iovec*)$arg2, $arg3, $arg4)")
    public static long keyctl_instantiate_key_iov(@OriginalName(value="key_serial_t") int id, Ptr<runtime.iovec> _payload_iov, @Unsigned int ioc2, @OriginalName(value="key_serial_t") int ringid) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static long keyctl_invalidate_key(@OriginalName(value="key_serial_t") int id) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction(value="keyctl_join_session_keyring((const u8*)$arg1)")
    public static long keyctl_join_session_keyring(String _name) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static long keyctl_keyring_clear(@OriginalName(value="key_serial_t") int ringid) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static long keyctl_keyring_link(@OriginalName(value="key_serial_t") int id, @OriginalName(value="key_serial_t") int ringid) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static long keyctl_keyring_move(@OriginalName(value="key_serial_t") int id, @OriginalName(value="key_serial_t") int from_ringid, @OriginalName(value="key_serial_t") int to_ringid, @Unsigned int flags) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction(value="keyctl_keyring_search($arg1, (const u8*)$arg2, (const u8*)$arg3, $arg4)")
    public static long keyctl_keyring_search(@OriginalName(value="key_serial_t") int ringid, String _type, String _description, @OriginalName(value="key_serial_t") int destringid) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static long keyctl_keyring_unlink(@OriginalName(value="key_serial_t") int id, @OriginalName(value="key_serial_t") int ringid) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static long keyctl_negate_key(@OriginalName(value="key_serial_t") int id, @Unsigned int timeout, @OriginalName(value="key_serial_t") int ringid) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static long keyctl_read_key(@OriginalName(value="key_serial_t") int keyid, String buffer, @Unsigned long buflen) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static long keyctl_reject_key(@OriginalName(value="key_serial_t") int id, @Unsigned int timeout, @Unsigned int error, @OriginalName(value="key_serial_t") int ringid) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction(value="keyctl_restrict_keyring($arg1, (const u8*)$arg2, (const u8*)$arg3)")
    public static long keyctl_restrict_keyring(@OriginalName(value="key_serial_t") int id, String _type, String _restriction) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static long keyctl_revoke_key(@OriginalName(value="key_serial_t") int id) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static long keyctl_session_to_parent() {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static long keyctl_set_reqkey_keyring(int reqkey_defl) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static long keyctl_set_timeout(@OriginalName(value="key_serial_t") int id, @Unsigned int timeout) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static long keyctl_setperm_key(@OriginalName(value="key_serial_t") int id, @Unsigned @OriginalName(value="key_perm_t") int perm) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction(value="keyctl_update_key($arg1, (const void*)$arg2, $arg3)")
    public static long keyctl_update_key(@OriginalName(value="key_serial_t") int id, Ptr<?> _payload, @Unsigned long plen) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static long keyctl_watch_key(@OriginalName(value="key_serial_t") int id, int watch_queue_fd, int watch_id) {
        throw new MethodIsBPFRelatedFunction();
    }

    @Type(noCCodeGeneration=true, cType="struct keyctl_kdf_params")
    @NotUsableInJava
    public static class keyctl_kdf_params
    extends Struct {
        public String hashname;
        public String otherinfo;
        public @Unsigned int otherinfolen;
        public @Unsigned int @Size(value=8) [] __spare;
    }

    @Type(noCCodeGeneration=true, cType="struct keyctl_pkey_params")
    @NotUsableInJava
    public static class keyctl_pkey_params
    extends Struct {
        public int key_id;
        public @Unsigned int in_len;
        @InlineUnion(value=9220)
        public @InlineUnion(value=9220) @Unsigned int out_len;
        @InlineUnion(value=9220)
        public @InlineUnion(value=9220) @Unsigned int in2_len;
        public @Unsigned int @Size(value=7) [] __spare;
    }

    @Type(noCCodeGeneration=true, cType="struct keyctl_pkey_query")
    @NotUsableInJava
    public static class keyctl_pkey_query
    extends Struct {
        public @Unsigned int supported_ops;
        public @Unsigned int key_size;
        public @Unsigned short max_data_size;
        public @Unsigned short max_sig_size;
        public @Unsigned short max_enc_size;
        public @Unsigned short max_dec_size;
        public @Unsigned int @Size(value=10) [] __spare;
    }

    @Type(noCCodeGeneration=true, cType="struct keyctl_dh_params")
    @NotUsableInJava
    public static class keyctl_dh_params
    extends Struct {
        @InlineUnion(value=11886)
        public @InlineUnion(value=11886) int _private;
        @InlineUnion(value=11886)
        public @InlineUnion(value=11886) int priv;
        public int prime;
        public int base;
    }
}

