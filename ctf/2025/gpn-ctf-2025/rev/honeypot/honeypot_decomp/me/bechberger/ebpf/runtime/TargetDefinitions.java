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
import me.bechberger.ebpf.runtime.CpufreqDefinitions;
import me.bechberger.ebpf.runtime.DeviceDefinitions;
import me.bechberger.ebpf.runtime.DmDefinitions;
import me.bechberger.ebpf.runtime.ListDefinitions;
import me.bechberger.ebpf.runtime.NodeDefinitions;
import me.bechberger.ebpf.runtime.runtime;
import me.bechberger.ebpf.type.Ptr;
import me.bechberger.ebpf.type.Struct;

public final class TargetDefinitions {
    @NotUsableInJava
    @BuiltinBPFFunction
    public static @OriginalName(value="ssize_t") long target_show(Ptr<runtime.device> dev, Ptr<DeviceDefinitions.device_attribute> attr2, String buf) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction(value="target_store($arg1, $arg2, (const u8*)$arg3, $arg4)")
    public static @OriginalName(value="ssize_t") long target_store(Ptr<runtime.device> dev, Ptr<DeviceDefinitions.device_attribute> attr2, String buf, @Unsigned long count) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static @OriginalName(value="ssize_t") long target_kb_show(Ptr<runtime.device> dev, Ptr<DeviceDefinitions.device_attribute> attr2, String buf) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction(value="target_kb_store($arg1, $arg2, (const u8*)$arg3, $arg4)")
    public static @OriginalName(value="ssize_t") long target_kb_store(Ptr<runtime.device> dev, Ptr<DeviceDefinitions.device_attribute> attr2, String buf, @Unsigned long count) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static @OriginalName(value="ssize_t") long target_node_show(Ptr<runtime.device> dev, Ptr<DeviceDefinitions.device_attribute> attr2, String buf) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int target_block(Ptr<runtime.device> dev, Ptr<?> data) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int target_message(Ptr<runtime.file> filp, Ptr<DmDefinitions.dm_ioctl> param2, @Unsigned long param_size) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int target_unblock(Ptr<runtime.device> dev, Ptr<?> data) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int __target_index(Ptr<CpufreqDefinitions.cpufreq_policy> policy, int index2) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static @OriginalName(value="ssize_t") long target_freq_show(Ptr<runtime.device> dev, Ptr<DeviceDefinitions.device_attribute> attr2, String buf) {
        throw new MethodIsBPFRelatedFunction();
    }

    @Type(noCCodeGeneration=true, cType="struct target_cache")
    @NotUsableInJava
    public static class target_cache
    extends Struct {
        public ListDefinitions.list_head node;
        public NodeDefinitions.node_cache_attrs cache_attrs;
    }

    @Type(noCCodeGeneration=true, cType="struct target_type")
    @NotUsableInJava
    public static class target_type
    extends Struct {
        public @Unsigned @OriginalName(value="uint64_t") long features;
        public String name;
        public Ptr<runtime.module> module;
        public @Unsigned int @Size(value=3) [] version;
        public @OriginalName(value="dm_ctr_fn") Ptr<?> ctr;
        public @OriginalName(value="dm_dtr_fn") Ptr<?> dtr;
        public @OriginalName(value="dm_map_fn") Ptr<?> map;
        public @OriginalName(value="dm_clone_and_map_request_fn") Ptr<?> clone_and_map_rq;
        public @OriginalName(value="dm_release_clone_request_fn") Ptr<?> release_clone_rq;
        public @OriginalName(value="dm_endio_fn") Ptr<?> end_io;
        public @OriginalName(value="dm_request_endio_fn") Ptr<?> rq_end_io;
        public @OriginalName(value="dm_presuspend_fn") Ptr<?> presuspend;
        public @OriginalName(value="dm_presuspend_undo_fn") Ptr<?> presuspend_undo;
        public @OriginalName(value="dm_postsuspend_fn") Ptr<?> postsuspend;
        public @OriginalName(value="dm_preresume_fn") Ptr<?> preresume;
        public @OriginalName(value="dm_resume_fn") Ptr<?> resume;
        public @OriginalName(value="dm_status_fn") Ptr<?> status;
        public @OriginalName(value="dm_message_fn") Ptr<?> message;
        public @OriginalName(value="dm_prepare_ioctl_fn") Ptr<?> prepare_ioctl;
        public @OriginalName(value="dm_report_zones_fn") Ptr<?> report_zones;
        public @OriginalName(value="dm_busy_fn") Ptr<?> busy;
        public @OriginalName(value="dm_iterate_devices_fn") Ptr<?> iterate_devices;
        public @OriginalName(value="dm_io_hints_fn") Ptr<?> io_hints;
        public @OriginalName(value="dm_dax_direct_access_fn") Ptr<?> direct_access;
        public @OriginalName(value="dm_dax_zero_page_range_fn") Ptr<?> dax_zero_page_range;
        public @OriginalName(value="dm_dax_recovery_write_fn") Ptr<?> dax_recovery_write;
        public ListDefinitions.list_head list;
    }
}

