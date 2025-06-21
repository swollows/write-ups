/*
 * Decompiled with CFR 0.153-SNAPSHOT (d6f6758-dirty).
 */
package me.bechberger.ebpf.runtime;

import me.bechberger.ebpf.annotations.Unsigned;
import me.bechberger.ebpf.annotations.bpf.BuiltinBPFFunction;
import me.bechberger.ebpf.annotations.bpf.MethodIsBPFRelatedFunction;
import me.bechberger.ebpf.annotations.bpf.NotUsableInJava;
import me.bechberger.ebpf.runtime.FbDefinitions;
import me.bechberger.ebpf.runtime.VcDefinitions;
import me.bechberger.ebpf.runtime.WaitDefinitions;
import me.bechberger.ebpf.type.Ptr;

public final class BitDefinitions {
    @NotUsableInJava
    @BuiltinBPFFunction
    public static int bit_wait(Ptr<WaitDefinitions.wait_bit_key> word, int mode) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int bit_wait_io(Ptr<WaitDefinitions.wait_bit_key> word, int mode) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int bit_wait_io_timeout(Ptr<WaitDefinitions.wait_bit_key> word, int mode) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int bit_wait_timeout(Ptr<WaitDefinitions.wait_bit_key> word, int mode) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static Ptr<WaitDefinitions.wait_queue_head> bit_waitqueue(Ptr<?> word, int bit) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void bit_bmove(Ptr<VcDefinitions.vc_data> vc2, Ptr<FbDefinitions.fb_info> info2, int sy, int sx, int dy, int dx, int height, int width) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void bit_clear(Ptr<VcDefinitions.vc_data> vc2, Ptr<FbDefinitions.fb_info> info2, int sy, int sx, int height, int width) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void bit_clear_margins(Ptr<VcDefinitions.vc_data> vc2, Ptr<FbDefinitions.fb_info> info2, int color, int bottom_only) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void bit_cursor(Ptr<VcDefinitions.vc_data> vc2, Ptr<FbDefinitions.fb_info> info2, boolean enable, int fg, int bg) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction(value="bit_putcs($arg1, $arg2, (const short unsigned int*)$arg3, $arg4, $arg5, $arg6, $arg7, $arg8)")
    public static void bit_putcs(Ptr<VcDefinitions.vc_data> vc2, Ptr<FbDefinitions.fb_info> info2, Ptr<@Unsigned Short> s2, int count, int yy, int xx, int fg, int bg) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int bit_update_start(Ptr<FbDefinitions.fb_info> info2) {
        throw new MethodIsBPFRelatedFunction();
    }
}

