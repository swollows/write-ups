/*
 * Decompiled with CFR 0.153-SNAPSHOT (d6f6758-dirty).
 */
package me.bechberger.ebpf.runtime;

import me.bechberger.ebpf.annotations.OriginalName;
import me.bechberger.ebpf.annotations.Unsigned;
import me.bechberger.ebpf.annotations.bpf.BuiltinBPFFunction;
import me.bechberger.ebpf.annotations.bpf.MethodIsBPFRelatedFunction;
import me.bechberger.ebpf.annotations.bpf.NotUsableInJava;
import me.bechberger.ebpf.runtime.KmemDefinitions;
import me.bechberger.ebpf.runtime.SerialDefinitions;
import me.bechberger.ebpf.runtime.misc;
import me.bechberger.ebpf.runtime.runtime;
import me.bechberger.ebpf.type.Ptr;

public final class SkipDefinitions {
    @NotUsableInJava
    @BuiltinBPFFunction(value="skip_atoi((const u8**)$arg1)")
    public static int skip_atoi(Ptr<String> s2) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static @OriginalName(value="ssize_t") long skip_kfence_show(Ptr<KmemDefinitions.kmem_cache> s2, String buf) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction(value="skip_kfence_store($arg1, (const u8*)$arg2, $arg3)")
    public static @OriginalName(value="ssize_t") long skip_kfence_store(Ptr<KmemDefinitions.kmem_cache> s2, String buf, @Unsigned long length) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int skip_nops(Ptr<Character> buf, int offset, int len) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction(value="skip_orig_size_check($arg1, (const void*)$arg2)")
    public static void skip_orig_size_check(Ptr<KmemDefinitions.kmem_cache> s2, Ptr<?> object) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static String skip_comment(String p) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int skip_prefix(String addr2, Ptr<misc.prefix_bits> prf) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction(value="skip_tx_en_setup($arg1, (const struct pciserial_board*)$arg2, $arg3, $arg4)")
    public static int skip_tx_en_setup(Ptr<SerialDefinitions.serial_private> priv, Ptr<misc.pciserial_board> board, Ptr<runtime.uart_8250_port> port2, int idx) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction(value="skip_spaces((const u8*)$arg1)")
    public static String skip_spaces(String str) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static boolean skip_addr(Ptr<?> dest) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int skip_hole(Ptr<runtime.inode> inode2, Ptr<@Unsigned @OriginalName(value="ext4_lblk_t") Integer> cur) {
        throw new MethodIsBPFRelatedFunction();
    }
}

