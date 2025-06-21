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
import me.bechberger.ebpf.runtime.SeqDefinitions;
import me.bechberger.ebpf.type.Enum;
import me.bechberger.ebpf.type.Ptr;
import me.bechberger.ebpf.type.Struct;
import me.bechberger.ebpf.type.TypedEnum;

public final class DyneventDefinitions {
    @NotUsableInJava
    @BuiltinBPFFunction
    public static int dynevent_arg_add(Ptr<dynevent_cmd> cmd, Ptr<dynevent_arg> arg2, @OriginalName(value="dynevent_check_arg_fn_t") Ptr<?> check_arg) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void dynevent_arg_init(Ptr<dynevent_arg> arg2, char separator) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int dynevent_arg_pair_add(Ptr<dynevent_cmd> cmd, Ptr<dynevent_arg_pair> arg_pair, @OriginalName(value="dynevent_check_arg_fn_t") Ptr<?> check_arg) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void dynevent_arg_pair_init(Ptr<dynevent_arg_pair> arg_pair, char operator, char separator) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void dynevent_cmd_init(Ptr<dynevent_cmd> cmd, String buf, int maxlen, dynevent_type type2, @OriginalName(value="dynevent_create_fn_t") Ptr<?> run_command) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int dynevent_create(Ptr<dynevent_cmd> cmd) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction(value="dynevent_str_add($arg1, (const u8*)$arg2)")
    public static int dynevent_str_add(Ptr<dynevent_cmd> cmd, String str) {
        throw new MethodIsBPFRelatedFunction();
    }

    @Type(noCCodeGeneration=true, cType="struct dynevent_arg_pair")
    @NotUsableInJava
    public static class dynevent_arg_pair
    extends Struct {
        public String lhs;
        public String rhs;
        public char operator;
        public char separator;
    }

    @Type(noCCodeGeneration=true, cType="struct dynevent_arg")
    @NotUsableInJava
    public static class dynevent_arg
    extends Struct {
        public String str;
        public char separator;
    }

    @Type(noCCodeGeneration=true, cType="struct dynevent_cmd")
    @NotUsableInJava
    public static class dynevent_cmd
    extends Struct {
        public SeqDefinitions.seq_buf seq;
        public String event_name;
        public @Unsigned int n_fields;
        public dynevent_type type;
        public @OriginalName(value="dynevent_create_fn_t") Ptr<?> run_command;
        public Ptr<?> private_data;
    }

    @Type(noCCodeGeneration=true, cType="enum dynevent_type")
    public static enum dynevent_type implements Enum<dynevent_type>,
    TypedEnum<dynevent_type, Integer>
    {
        DYNEVENT_TYPE_SYNTH,
        DYNEVENT_TYPE_KPROBE,
        DYNEVENT_TYPE_NONE;

    }
}

