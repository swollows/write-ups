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
import me.bechberger.ebpf.runtime.AcpiDefinitions;
import me.bechberger.ebpf.runtime.BlkDefinitions;
import me.bechberger.ebpf.runtime.DmDefinitions;
import me.bechberger.ebpf.runtime.HidDefinitions;
import me.bechberger.ebpf.runtime.ScxDefinitions;
import me.bechberger.ebpf.runtime.TaskDefinitions;
import me.bechberger.ebpf.runtime.misc;
import me.bechberger.ebpf.runtime.runtime;
import me.bechberger.ebpf.type.Ptr;
import me.bechberger.ebpf.type.Struct;
import me.bechberger.ebpf.type.Union;

public final class DispatchDefinitions {
    @NotUsableInJava
    @BuiltinBPFFunction
    public static void dispatch_io(@Unsigned @OriginalName(value="blk_opf_t") int opf, @Unsigned int num_regions, Ptr<DmDefinitions.dm_io_region> where, Ptr<runtime.dpages> dp, Ptr<runtime.io> io2, @Unsigned short ioprio) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static Ptr<Character> dispatch_hid_bpf_device_event(Ptr<HidDefinitions.hid_device> hdev, HidDefinitions.hid_report_type type2, Ptr<Character> data, Ptr<@Unsigned Integer> size, int interrupt, @Unsigned long source, boolean from_bpf) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int dispatch_hid_bpf_output_report(Ptr<HidDefinitions.hid_device> hdev, Ptr<Character> buf, @Unsigned int size, @Unsigned long source, boolean from_bpf) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int dispatch_hid_bpf_raw_requests(Ptr<HidDefinitions.hid_device> hdev, char reportnum, Ptr<Character> buf, @Unsigned int size, HidDefinitions.hid_report_type rtype, HidDefinitions.hid_class_request reqtype, @Unsigned long source, boolean from_bpf) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void dispatch_job(Ptr<misc.kcopyd_job> job) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static boolean dispatch_rq_from_ctx(Ptr<runtime.sbitmap> sb, @Unsigned int bitnr, Ptr<?> data) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void dispatch_dequeue(Ptr<runtime.rq> rq2, Ptr<TaskDefinitions.task_struct> p) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void dispatch_enqueue(Ptr<ScxDefinitions.scx_dispatch_q> dsq, Ptr<TaskDefinitions.task_struct> p, @Unsigned long enq_flags) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void dispatch_stub(int prev_cpu, Ptr<TaskDefinitions.task_struct> p) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void dispatch_to_local_dsq(Ptr<runtime.rq> rq2, Ptr<ScxDefinitions.scx_dispatch_q> dst_dsq, Ptr<TaskDefinitions.task_struct> p, @Unsigned long enq_flags) {
        throw new MethodIsBPFRelatedFunction();
    }

    @Type(noCCodeGeneration=true, cType="struct dispatch_rq_data")
    @NotUsableInJava
    public static class dispatch_rq_data
    extends Struct {
        public Ptr<BlkDefinitions.blk_mq_hw_ctx> hctx;
        public Ptr<runtime.request> rq;
    }

    @Type(noCCodeGeneration=true, cType="union { unsigned int (*implementation)(struct acpi_walk_state*); union acpi_operand_object *handler; }")
    @NotUsableInJava
    public static class dispatch_of_acpi_object_method
    extends Union {
        public @OriginalName(value="acpi_internal_method") Ptr<?> implementation;
        public Ptr<AcpiDefinitions.acpi_operand_object> handler;
    }
}

