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
import me.bechberger.ebpf.runtime.DaxDefinitions;
import me.bechberger.ebpf.runtime.DmDefinitions;
import me.bechberger.ebpf.runtime.IovDefinitions;
import me.bechberger.ebpf.runtime.QueueDefinitions;
import me.bechberger.ebpf.runtime.misc;
import me.bechberger.ebpf.runtime.runtime;
import me.bechberger.ebpf.type.Ptr;
import me.bechberger.ebpf.type.Struct;

public final class StripeDefinitions {
    @NotUsableInJava
    @BuiltinBPFFunction
    public static int stripe_ctr(Ptr<DmDefinitions.dm_target> ti, @Unsigned int argc, Ptr<String> argv) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static long stripe_dax_direct_access(Ptr<DmDefinitions.dm_target> ti, @Unsigned long pgoff, long nr_pages, DaxDefinitions.dax_access_mode mode, Ptr<Ptr<?>> kaddr, Ptr< @OriginalName(value="pfn_t") KernelDefinitions.kernel_cap_t> pfn) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static @Unsigned long stripe_dax_recovery_write(Ptr<DmDefinitions.dm_target> ti, @Unsigned long pgoff, Ptr<?> addr2, @Unsigned long bytes, Ptr<IovDefinitions.iov_iter> i) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int stripe_dax_zero_page_range(Ptr<DmDefinitions.dm_target> ti, @Unsigned long pgoff, @Unsigned long nr_pages) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void stripe_dtr(Ptr<DmDefinitions.dm_target> ti) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int stripe_end_io(Ptr<DmDefinitions.dm_target> ti, Ptr<runtime.bio> bio2, Ptr<@OriginalName(value="blk_status_t") Character> error) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void stripe_io_hints(Ptr<DmDefinitions.dm_target> ti, Ptr<QueueDefinitions.queue_limits> limits) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int stripe_iterate_devices(Ptr<DmDefinitions.dm_target> ti, @OriginalName(value="iterate_devices_callout_fn") Ptr<?> fn, Ptr<?> data) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int stripe_map(Ptr<DmDefinitions.dm_target> ti, Ptr<runtime.bio> bio2) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void stripe_map_range_sector(Ptr<stripe_c> sc, @Unsigned @OriginalName(value="sector_t") long sector, @Unsigned @OriginalName(value="uint32_t") int target_stripe, Ptr<@Unsigned @OriginalName(value="sector_t") Long> result) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void stripe_map_sector(Ptr<stripe_c> sc, @Unsigned @OriginalName(value="sector_t") long sector, Ptr<@Unsigned @OriginalName(value="uint32_t") Integer> stripe2, Ptr<@Unsigned @OriginalName(value="sector_t") Long> result) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void stripe_status(Ptr<DmDefinitions.dm_target> ti,  @OriginalName(value="status_type_t") runtime.STATUSTYPE type2, @Unsigned int status_flags, String result, @Unsigned int maxlen) {
        throw new MethodIsBPFRelatedFunction();
    }

    @Type(noCCodeGeneration=true, cType="struct stripe")
    @NotUsableInJava
    public static class stripe
    extends Struct {
        public Ptr<DmDefinitions.dm_dev> dev;
        public @Unsigned @OriginalName(value="sector_t") long physical_start;
        public AtomicDefinitions.atomic_t error_count;
    }

    @Type(noCCodeGeneration=true, cType="struct stripe_c")
    @NotUsableInJava
    public static class stripe_c
    extends Struct {
        public @Unsigned @OriginalName(value="uint32_t") int stripes;
        public int stripes_shift;
        public @Unsigned @OriginalName(value="sector_t") long stripe_width;
        public @Unsigned @OriginalName(value="uint32_t") int chunk_size;
        public int chunk_size_shift;
        public Ptr<DmDefinitions.dm_target> ti;
        public misc.work_struct trigger_event;
        public stripe @Size(value=0) [] stripe;
    }
}

