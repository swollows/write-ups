/*
 * Decompiled with CFR 0.153-SNAPSHOT (d6f6758-dirty).
 */
package me.bechberger.ebpf.runtime;

import me.bechberger.ebpf.annotations.OriginalName;
import me.bechberger.ebpf.annotations.Size;
import me.bechberger.ebpf.annotations.Type;
import me.bechberger.ebpf.annotations.Unsigned;
import me.bechberger.ebpf.annotations.bpf.BuiltinBPFFunction;
import me.bechberger.ebpf.annotations.bpf.MethodIsBPFRelatedFunction;
import me.bechberger.ebpf.annotations.bpf.NotUsableInJava;
import me.bechberger.ebpf.runtime.AtomicDefinitions;
import me.bechberger.ebpf.runtime.BpfDefinitions;
import me.bechberger.ebpf.runtime.CryptoDefinitions;
import me.bechberger.ebpf.runtime.NodeDefinitions;
import me.bechberger.ebpf.runtime.TaskDefinitions;
import me.bechberger.ebpf.runtime.UsbDefinitions;
import me.bechberger.ebpf.runtime.WaitDefinitions;
import me.bechberger.ebpf.runtime.XzDefinitions;
import me.bechberger.ebpf.runtime.ZoneDefinitions;
import me.bechberger.ebpf.runtime.misc;
import me.bechberger.ebpf.runtime.runtime;
import me.bechberger.ebpf.type.Ptr;
import me.bechberger.ebpf.type.Struct;

public final class DecDefinitions {
    @NotUsableInJava
    @BuiltinBPFFunction
    public static void dec_count(Ptr<runtime.io> io2, @Unsigned int region2, @OriginalName(value="blk_status_t") char error) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void dec_usb_memory_use_count(Ptr<UsbDefinitions.usb_memory> usbm, Ptr<Integer> count) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static XzDefinitions.xz_ret dec_block(Ptr<XzDefinitions.xz_dec> s2, Ptr<XzDefinitions.xz_buf> b) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static XzDefinitions.xz_ret dec_block_header(Ptr<XzDefinitions.xz_dec> s2) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void dec_elem_count(Ptr<BpfDefinitions.bpf_htab> htab) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static XzDefinitions.xz_ret dec_main(Ptr<XzDefinitions.xz_dec> s2, Ptr<XzDefinitions.xz_buf> b) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction(value="dec_vli($arg1, (const u8*)$arg2, $arg3, $arg4)")
    public static XzDefinitions.xz_ret dec_vli(Ptr<XzDefinitions.xz_dec> s2, Ptr<@OriginalName(value="uint8_t") Character> in, Ptr<@Unsigned Long> in_pos, @Unsigned long in_size) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void __dec_node_page_state(Ptr<runtime.page> page2, NodeDefinitions.node_stat_item item) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void __dec_node_state(Ptr<misc.pglist_data> pgdat, NodeDefinitions.node_stat_item item) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void __dec_zone_page_state(Ptr<runtime.page> page2, ZoneDefinitions.zone_stat_item item) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void __dec_zone_state(Ptr<runtime.zone> zone2, ZoneDefinitions.zone_stat_item item) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void dec_dl_tasks_cs(Ptr<TaskDefinitions.task_struct> p) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void dec_node_page_state(Ptr<runtime.page> page2, NodeDefinitions.node_stat_item item) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void dec_rlimit_put_ucounts(Ptr<runtime.ucounts> ucounts2, misc.rlimit_type type2) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static boolean dec_rlimit_ucounts(Ptr<runtime.ucounts> ucounts2, misc.rlimit_type type2, long v) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void dec_ucount(Ptr<runtime.ucounts> ucounts2, misc.ucount_type type2) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void dec_zone_page_state(Ptr<runtime.page> page2, ZoneDefinitions.zone_stat_item item) {
        throw new MethodIsBPFRelatedFunction();
    }

    @Type(noCCodeGeneration=true, cType="struct dec_data")
    @NotUsableInJava
    public static class dec_data
    extends Struct {
        public Ptr<TaskDefinitions.task_struct> thr;
        public Ptr<CryptoDefinitions.crypto_comp> cc;
        public AtomicDefinitions.atomic_t ready;
        public AtomicDefinitions.atomic_t stop;
        public int ret;
        public @OriginalName(value="wait_queue_head_t") WaitDefinitions.wait_queue_head go;
        public @OriginalName(value="wait_queue_head_t") WaitDefinitions.wait_queue_head done;
        public @Unsigned long unc_len;
        public @Unsigned long cmp_len;
        public char @Size(value=131072) [] unc;
        public char @Size(value=143360) [] cmp;
    }
}

