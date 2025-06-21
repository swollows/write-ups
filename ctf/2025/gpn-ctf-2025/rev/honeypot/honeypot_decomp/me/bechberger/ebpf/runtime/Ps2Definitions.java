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
import me.bechberger.ebpf.type.TypedEnum;

public final class Ps2Definitions {
    @NotUsableInJava
    @BuiltinBPFFunction
    public static int __ps2_command(Ptr<runtime.ps2dev> ps2dev2, Ptr<Character> param2, @Unsigned int command) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void ps2_begin_command(Ptr<runtime.ps2dev> ps2dev2) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int ps2_command(Ptr<runtime.ps2dev> ps2dev2, Ptr<Character> param2, @Unsigned int command) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int ps2_do_sendbyte(Ptr<runtime.ps2dev> ps2dev2, char _byte, @Unsigned int timeout, @Unsigned int max_attempts) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void ps2_drain(Ptr<runtime.ps2dev> ps2dev2, @Unsigned long maxbytes, @Unsigned int timeout) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void ps2_end_command(Ptr<runtime.ps2dev> ps2dev2) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void ps2_handle_response(Ptr<runtime.ps2dev> ps2dev2, char data) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void ps2_init(Ptr<runtime.ps2dev> ps2dev2, Ptr<runtime.serio> serio2, @OriginalName(value="ps2_pre_receive_handler_t") Ptr<?> pre_receive_handler, @OriginalName(value="ps2_receive_handler_t") Ptr<?> receive_handler) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static  @OriginalName(value="irqreturn_t") runtime.irqreturn ps2_interrupt(Ptr<runtime.serio> serio2, char data, @Unsigned int flags) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static boolean ps2_is_keyboard_id(char id_byte) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int ps2_sendbyte(Ptr<runtime.ps2dev> ps2dev2, char _byte, @Unsigned int timeout) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int ps2_sliced_command(Ptr<runtime.ps2dev> ps2dev2, char command) {
        throw new MethodIsBPFRelatedFunction();
    }

    @Type(noCCodeGeneration=true, cType="enum ps2_disposition")
    public static enum ps2_disposition implements Enum<ps2_disposition>,
    TypedEnum<ps2_disposition, Integer>
    {
        PS2_PROCESS,
        PS2_IGNORE,
        PS2_ERROR;

    }
}

