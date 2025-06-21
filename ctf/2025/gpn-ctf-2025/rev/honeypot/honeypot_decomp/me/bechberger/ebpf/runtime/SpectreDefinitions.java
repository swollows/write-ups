/*
 * Decompiled with CFR 0.153-SNAPSHOT (d6f6758-dirty).
 */
package me.bechberger.ebpf.runtime;

import me.bechberger.ebpf.annotations.OriginalName;
import me.bechberger.ebpf.annotations.Type;
import me.bechberger.ebpf.annotations.bpf.BuiltinBPFFunction;
import me.bechberger.ebpf.annotations.bpf.MethodIsBPFRelatedFunction;
import me.bechberger.ebpf.annotations.bpf.NotUsableInJava;
import me.bechberger.ebpf.type.Enum;
import me.bechberger.ebpf.type.TypedEnum;

public final class SpectreDefinitions {
    @NotUsableInJava
    @BuiltinBPFFunction
    public static int spectre_bhi_parse_cmdline(String str) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void spectre_v1_select_mitigation() {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static spectre_v2_mitigation_cmd spectre_v2_parse_cmdline() {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void spectre_v2_select_mitigation() {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static @OriginalName(value="ssize_t") long spectre_v2_show_state(String buf) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void spectre_v2_user_select_mitigation() {
        throw new MethodIsBPFRelatedFunction();
    }

    @Type(noCCodeGeneration=true, cType="enum spectre_v2_user_cmd")
    public static enum spectre_v2_user_cmd implements Enum<spectre_v2_user_cmd>,
    TypedEnum<spectre_v2_user_cmd, Integer>
    {
        SPECTRE_V2_USER_CMD_NONE,
        SPECTRE_V2_USER_CMD_AUTO,
        SPECTRE_V2_USER_CMD_FORCE,
        SPECTRE_V2_USER_CMD_PRCTL,
        SPECTRE_V2_USER_CMD_PRCTL_IBPB,
        SPECTRE_V2_USER_CMD_SECCOMP,
        SPECTRE_V2_USER_CMD_SECCOMP_IBPB;

    }

    @Type(noCCodeGeneration=true, cType="enum spectre_v2_mitigation_cmd")
    public static enum spectre_v2_mitigation_cmd implements Enum<spectre_v2_mitigation_cmd>,
    TypedEnum<spectre_v2_mitigation_cmd, Integer>
    {
        SPECTRE_V2_CMD_NONE,
        SPECTRE_V2_CMD_AUTO,
        SPECTRE_V2_CMD_FORCE,
        SPECTRE_V2_CMD_RETPOLINE,
        SPECTRE_V2_CMD_RETPOLINE_GENERIC,
        SPECTRE_V2_CMD_RETPOLINE_LFENCE,
        SPECTRE_V2_CMD_EIBRS,
        SPECTRE_V2_CMD_EIBRS_RETPOLINE,
        SPECTRE_V2_CMD_EIBRS_LFENCE,
        SPECTRE_V2_CMD_IBRS;

    }

    @Type(noCCodeGeneration=true, cType="enum spectre_v1_mitigation")
    public static enum spectre_v1_mitigation implements Enum<spectre_v1_mitigation>,
    TypedEnum<spectre_v1_mitigation, Integer>
    {
        SPECTRE_V1_MITIGATION_NONE,
        SPECTRE_V1_MITIGATION_AUTO;

    }

    @Type(noCCodeGeneration=true, cType="enum spectre_v2_user_mitigation")
    public static enum spectre_v2_user_mitigation implements Enum<spectre_v2_user_mitigation>,
    TypedEnum<spectre_v2_user_mitigation, Integer>
    {
        SPECTRE_V2_USER_NONE,
        SPECTRE_V2_USER_STRICT,
        SPECTRE_V2_USER_STRICT_PREFERRED,
        SPECTRE_V2_USER_PRCTL,
        SPECTRE_V2_USER_SECCOMP;

    }

    @Type(noCCodeGeneration=true, cType="enum spectre_v2_mitigation")
    public static enum spectre_v2_mitigation implements Enum<spectre_v2_mitigation>,
    TypedEnum<spectre_v2_mitigation, Integer>
    {
        SPECTRE_V2_NONE,
        SPECTRE_V2_RETPOLINE,
        SPECTRE_V2_LFENCE,
        SPECTRE_V2_EIBRS,
        SPECTRE_V2_EIBRS_RETPOLINE,
        SPECTRE_V2_EIBRS_LFENCE,
        SPECTRE_V2_IBRS;

    }
}

