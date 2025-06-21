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
import me.bechberger.ebpf.runtime.DeviceDefinitions;
import me.bechberger.ebpf.runtime.ListDefinitions;
import me.bechberger.ebpf.runtime.NapiDefinitions;
import me.bechberger.ebpf.runtime.NetDefinitions;
import me.bechberger.ebpf.runtime.PacketDefinitions;
import me.bechberger.ebpf.runtime.SkDefinitions;
import me.bechberger.ebpf.runtime.runtime;
import me.bechberger.ebpf.type.Enum;
import me.bechberger.ebpf.type.Ptr;
import me.bechberger.ebpf.type.Struct;
import me.bechberger.ebpf.type.TypedEnum;

public final class GroDefinitions {
    @NotUsableInJava
    @BuiltinBPFFunction
    public static int gro_cell_poll(Ptr<NapiDefinitions.napi_struct> napi, int budget) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void gro_cells_destroy(Ptr<gro_cells> gcells) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int gro_cells_init(Ptr<gro_cells> gcells, Ptr<NetDefinitions.net_device> dev) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int gro_cells_receive(Ptr<gro_cells> gcells, Ptr<SkDefinitions.sk_buff> skb) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static Ptr<PacketDefinitions.packet_offload> gro_find_complete_by_type(@Unsigned @OriginalName(value="__be16") short type2) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static Ptr<PacketDefinitions.packet_offload> gro_find_receive_by_type(@Unsigned @OriginalName(value="__be16") short type2) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static @OriginalName(value="ssize_t") long gro_flush_timeout_show(Ptr<runtime.device> dev, Ptr<DeviceDefinitions.device_attribute> attr2, String buf) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction(value="gro_flush_timeout_store($arg1, $arg2, (const u8*)$arg3, $arg4)")
    public static @OriginalName(value="ssize_t") long gro_flush_timeout_store(Ptr<runtime.device> dev, Ptr<DeviceDefinitions.device_attribute> attr2, String buf, @Unsigned long len) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction(value="gro_list_prepare((const struct list_head*)$arg1, (const struct sk_buff*)$arg2)")
    public static void gro_list_prepare(Ptr<ListDefinitions.list_head> head, Ptr<SkDefinitions.sk_buff> skb) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void gro_pull_from_frag0(Ptr<SkDefinitions.sk_buff> skb, int grow) {
        throw new MethodIsBPFRelatedFunction();
    }

    @Type(noCCodeGeneration=true, cType="struct gro_cell")
    @NotUsableInJava
    public static class gro_cell
    extends Struct {
        public SkDefinitions.sk_buff_head napi_skbs;
        public NapiDefinitions.napi_struct napi;
    }

    @Type(noCCodeGeneration=true, cType="struct gro_cells")
    @NotUsableInJava
    public static class gro_cells
    extends Struct {
        public Ptr<gro_cell> cells;
    }

    @Type(noCCodeGeneration=true, cType="enum gro_result")
    public static enum gro_result implements Enum<gro_result>,
    TypedEnum<gro_result, Integer>
    {
        GRO_MERGED,
        GRO_MERGED_FREE,
        GRO_HELD,
        GRO_NORMAL,
        GRO_CONSUMED;

    }

    @Type(noCCodeGeneration=true, cType="struct gro_list")
    @NotUsableInJava
    public static class gro_list
    extends Struct {
        public ListDefinitions.list_head list;
        public int count;
    }
}

