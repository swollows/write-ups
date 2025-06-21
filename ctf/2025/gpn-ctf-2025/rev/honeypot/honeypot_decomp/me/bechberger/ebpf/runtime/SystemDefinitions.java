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
import me.bechberger.ebpf.runtime.ClocksourceDefinitions;
import me.bechberger.ebpf.runtime.DmaDefinitions;
import me.bechberger.ebpf.runtime.FileDefinitions;
import me.bechberger.ebpf.runtime.ListDefinitions;
import me.bechberger.ebpf.runtime.PnpDefinitions;
import me.bechberger.ebpf.runtime.SgDefinitions;
import me.bechberger.ebpf.runtime.VmDefinitions;
import me.bechberger.ebpf.runtime.misc;
import me.bechberger.ebpf.runtime.runtime;
import me.bechberger.ebpf.type.Enum;
import me.bechberger.ebpf.type.Ptr;
import me.bechberger.ebpf.type.Struct;
import me.bechberger.ebpf.type.TypedEnum;

public final class SystemDefinitions {
    @NotUsableInJava
    @BuiltinBPFFunction
    public static boolean system_entering_hibernation() {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction(value="system_callback((const u8*)$arg1, $arg2, $arg3, (const struct file_operations**)$arg4)")
    public static int system_callback(String name, Ptr<@Unsigned @OriginalName(value="umode_t") Short> mode, Ptr<Ptr<?>> data, Ptr<Ptr<FileDefinitions.file_operations>> fops) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static @OriginalName(value="ssize_t") long system_enable_read(Ptr<runtime.file> filp, String ubuf, @Unsigned long cnt, Ptr<@OriginalName(value="loff_t") Long> ppos) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction(value="system_enable_write($arg1, (const u8*)$arg2, $arg3, $arg4)")
    public static @OriginalName(value="ssize_t") long system_enable_write(Ptr<runtime.file> filp, String ubuf, @Unsigned long cnt, Ptr<@OriginalName(value="loff_t") Long> ppos) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static Ptr<DmaDefinitions.dma_buf> system_heap_allocate(Ptr<DmaDefinitions.dma_heap> heap, @Unsigned long len, @Unsigned int fd_flags, @Unsigned long heap_flags) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int system_heap_attach(Ptr<DmaDefinitions.dma_buf> dmabuf, Ptr<DmaDefinitions.dma_buf_attachment> attachment) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int system_heap_create() {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void system_heap_detach(Ptr<DmaDefinitions.dma_buf> dmabuf, Ptr<DmaDefinitions.dma_buf_attachment> attachment) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int system_heap_dma_buf_begin_cpu_access(Ptr<DmaDefinitions.dma_buf> dmabuf, DmaDefinitions.dma_data_direction direction) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int system_heap_dma_buf_end_cpu_access(Ptr<DmaDefinitions.dma_buf> dmabuf, DmaDefinitions.dma_data_direction direction) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void system_heap_dma_buf_release(Ptr<DmaDefinitions.dma_buf> dmabuf) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static Ptr<SgDefinitions.sg_table> system_heap_map_dma_buf(Ptr<DmaDefinitions.dma_buf_attachment> attachment, DmaDefinitions.dma_data_direction direction) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int system_heap_mmap(Ptr<DmaDefinitions.dma_buf> dmabuf, Ptr<VmDefinitions.vm_area_struct> vma) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void system_heap_unmap_dma_buf(Ptr<DmaDefinitions.dma_buf_attachment> attachment, Ptr<SgDefinitions.sg_table> table, DmaDefinitions.dma_data_direction direction) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int system_heap_vmap(Ptr<DmaDefinitions.dma_buf> dmabuf, Ptr<misc.iosys_map> map2) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void system_heap_vunmap(Ptr<DmaDefinitions.dma_buf> dmabuf, Ptr<misc.iosys_map> map2) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction(value="system_pnp_probe($arg1, (const struct pnp_device_id*)$arg2)")
    public static int system_pnp_probe(Ptr<PnpDefinitions.pnp_dev> dev, Ptr<PnpDefinitions.pnp_device_id> dev_id) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void system_root_device_release(Ptr<runtime.device> dev) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int system_tr_open(Ptr<runtime.inode> inode2, Ptr<runtime.file> filp) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int system_trusted_keyring_init() {
        throw new MethodIsBPFRelatedFunction();
    }

    @Type(noCCodeGeneration=true, cType="struct { unsigned int type; unsigned int ndata; union { long long unsigned int data[16]; }; }")
    @NotUsableInJava
    public static class system_event_of_anon_member_of_kvm_run
    extends Struct {
        public @Unsigned int type;
        public @Unsigned int ndata;
        @InlineUnion(value=27574)
        public @InlineUnion(value=27574) @Unsigned long @Size(value=16) [] data;
    }

    @Type(noCCodeGeneration=true, cType="struct system_heap_buffer")
    @NotUsableInJava
    public static class system_heap_buffer
    extends Struct {
        public Ptr<DmaDefinitions.dma_heap> heap;
        public ListDefinitions.list_head attachments;
        public runtime.mutex lock;
        public @Unsigned long len;
        public SgDefinitions.sg_table sg_table;
        public int vmap_cnt;
        public Ptr<?> vaddr;
    }

    @Type(noCCodeGeneration=true, cType="struct system_counterval_t")
    @NotUsableInJava
    public static class system_counterval_t
    extends Struct {
        public @Unsigned long cycles;
        public ClocksourceDefinitions.clocksource_ids cs_id;
        public boolean use_nsecs;
    }

    @Type(noCCodeGeneration=true, cType="struct system_device_crosststamp")
    @NotUsableInJava
    public static class system_device_crosststamp
    extends Struct {
        public @OriginalName(value="ktime_t") long device;
        public @OriginalName(value="ktime_t") long sys_realtime;
        public @OriginalName(value="ktime_t") long sys_monoraw;
    }

    @Type(noCCodeGeneration=true, cType="struct system_time_snapshot")
    @NotUsableInJava
    public static class system_time_snapshot
    extends Struct {
        public @Unsigned long cycles;
        public @OriginalName(value="ktime_t") long real;
        public @OriginalName(value="ktime_t") long raw;
        public ClocksourceDefinitions.clocksource_ids cs_id;
        public @Unsigned int clock_was_set_seq;
        public char cs_was_changed_seq;
    }

    @Type(noCCodeGeneration=true, cType="enum system_states")
    public static enum system_states implements Enum<system_states>,
    TypedEnum<system_states, Integer>
    {
        SYSTEM_BOOTING,
        SYSTEM_SCHEDULING,
        SYSTEM_FREEING_INITMEM,
        SYSTEM_RUNNING,
        SYSTEM_HALT,
        SYSTEM_POWER_OFF,
        SYSTEM_RESTART,
        SYSTEM_SUSPEND;

    }
}

