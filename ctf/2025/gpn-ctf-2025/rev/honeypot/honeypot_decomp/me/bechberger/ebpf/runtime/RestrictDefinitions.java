/*
 * Decompiled with CFR 0.153-SNAPSHOT (d6f6758-dirty).
 */
package me.bechberger.ebpf.runtime;

import me.bechberger.ebpf.annotations.bpf.BuiltinBPFFunction;
import me.bechberger.ebpf.annotations.bpf.MethodIsBPFRelatedFunction;
import me.bechberger.ebpf.annotations.bpf.NotUsableInJava;
import me.bechberger.ebpf.runtime.KeyDefinitions;
import me.bechberger.ebpf.runtime.runtime;
import me.bechberger.ebpf.type.Ptr;

public final class RestrictDefinitions {
    @NotUsableInJava
    @BuiltinBPFFunction(value="restrict_link_for_blacklist($arg1, (const struct key_type*)$arg2, (const union key_payload*)$arg3, $arg4)")
    public static int restrict_link_for_blacklist(Ptr<runtime.key> dest_keyring, Ptr<KeyDefinitions.key_type> type2, Ptr<KeyDefinitions.key_payload> payload, Ptr<runtime.key> restrict_key) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction(value="restrict_link_reject($arg1, (const struct key_type*)$arg2, (const union key_payload*)$arg3, $arg4)")
    public static int restrict_link_reject(Ptr<runtime.key> keyring, Ptr<KeyDefinitions.key_type> type2, Ptr<KeyDefinitions.key_payload> payload, Ptr<runtime.key> restriction_key) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction(value="restrict_link_by_ca($arg1, (const struct key_type*)$arg2, (const union key_payload*)$arg3, $arg4)")
    public static int restrict_link_by_ca(Ptr<runtime.key> dest_keyring, Ptr<KeyDefinitions.key_type> type2, Ptr<KeyDefinitions.key_payload> payload, Ptr<runtime.key> trust_keyring) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction(value="restrict_link_by_digsig($arg1, (const struct key_type*)$arg2, (const union key_payload*)$arg3, $arg4)")
    public static int restrict_link_by_digsig(Ptr<runtime.key> dest_keyring, Ptr<KeyDefinitions.key_type> type2, Ptr<KeyDefinitions.key_payload> payload, Ptr<runtime.key> trust_keyring) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction(value="restrict_link_by_key_or_keyring($arg1, (const struct key_type*)$arg2, (const union key_payload*)$arg3, $arg4)")
    public static int restrict_link_by_key_or_keyring(Ptr<runtime.key> dest_keyring, Ptr<KeyDefinitions.key_type> type2, Ptr<KeyDefinitions.key_payload> payload, Ptr<runtime.key> trusted) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction(value="restrict_link_by_key_or_keyring_chain($arg1, (const struct key_type*)$arg2, (const union key_payload*)$arg3, $arg4)")
    public static int restrict_link_by_key_or_keyring_chain(Ptr<runtime.key> dest_keyring, Ptr<KeyDefinitions.key_type> type2, Ptr<KeyDefinitions.key_payload> payload, Ptr<runtime.key> trusted) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction(value="restrict_link_by_signature($arg1, (const struct key_type*)$arg2, (const union key_payload*)$arg3, $arg4)")
    public static int restrict_link_by_signature(Ptr<runtime.key> dest_keyring, Ptr<KeyDefinitions.key_type> type2, Ptr<KeyDefinitions.key_payload> payload, Ptr<runtime.key> trust_keyring) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction(value="restrict_link_by_builtin_and_secondary_trusted($arg1, (const struct key_type*)$arg2, (const union key_payload*)$arg3, $arg4)")
    public static int restrict_link_by_builtin_and_secondary_trusted(Ptr<runtime.key> dest_keyring, Ptr<KeyDefinitions.key_type> type2, Ptr<KeyDefinitions.key_payload> payload, Ptr<runtime.key> restrict_key) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction(value="restrict_link_by_builtin_secondary_and_machine($arg1, (const struct key_type*)$arg2, (const union key_payload*)$arg3, $arg4)")
    public static int restrict_link_by_builtin_secondary_and_machine(Ptr<runtime.key> dest_keyring, Ptr<KeyDefinitions.key_type> type2, Ptr<KeyDefinitions.key_payload> payload, Ptr<runtime.key> restrict_key) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction(value="restrict_link_by_builtin_trusted($arg1, (const struct key_type*)$arg2, (const union key_payload*)$arg3, $arg4)")
    public static int restrict_link_by_builtin_trusted(Ptr<runtime.key> dest_keyring, Ptr<KeyDefinitions.key_type> type2, Ptr<KeyDefinitions.key_payload> payload, Ptr<runtime.key> restriction_key) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction(value="restrict_link_by_digsig_builtin($arg1, (const struct key_type*)$arg2, (const union key_payload*)$arg3, $arg4)")
    public static int restrict_link_by_digsig_builtin(Ptr<runtime.key> dest_keyring, Ptr<KeyDefinitions.key_type> type2, Ptr<KeyDefinitions.key_payload> payload, Ptr<runtime.key> restriction_key) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction(value="restrict_link_by_digsig_builtin_and_secondary($arg1, (const struct key_type*)$arg2, (const union key_payload*)$arg3, $arg4)")
    public static int restrict_link_by_digsig_builtin_and_secondary(Ptr<runtime.key> dest_keyring, Ptr<KeyDefinitions.key_type> type2, Ptr<KeyDefinitions.key_payload> payload, Ptr<runtime.key> restrict_key) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction(value="restrict_unbound_cpumask((const u8*)$arg1, (const struct cpumask*)$arg2)")
    public static void restrict_unbound_cpumask(String name, Ptr<runtime.cpumask> mask) {
        throw new MethodIsBPFRelatedFunction();
    }
}

