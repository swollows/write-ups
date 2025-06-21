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
import me.bechberger.ebpf.runtime.DmaDefinitions;
import me.bechberger.ebpf.runtime.DmaengineDefinitions;
import me.bechberger.ebpf.runtime.EfiDefinitions;
import me.bechberger.ebpf.runtime.ListDefinitions;
import me.bechberger.ebpf.runtime.TaskletDefinitions;
import me.bechberger.ebpf.runtime.misc;
import me.bechberger.ebpf.runtime.runtime;
import me.bechberger.ebpf.type.Ptr;
import me.bechberger.ebpf.type.Struct;

public final class VirtDefinitions {
    @NotUsableInJava
    @BuiltinBPFFunction
    public static boolean __virt_addr_valid(@Unsigned long x) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static @OriginalName(value="ssize_t") long virt_addr_show(Ptr<EfiDefinitions.efi_runtime_map_entry> entry, String buf) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction(value="virt_to_scatterlist((const void*)$arg1, $arg2, $arg3, $arg4)")
    public static int virt_to_scatterlist(Ptr<?> addr2, int size, Ptr<runtime.scatterlist> sg2, int sg_size) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static @Unsigned @OriginalName(value="efi_status_t") long virt_efi_get_next_high_mono_count(Ptr<@Unsigned Integer> count) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static @Unsigned @OriginalName(value="efi_status_t") long virt_efi_get_next_variable(Ptr<@Unsigned Long> name_size, Ptr<@Unsigned @OriginalName(value="efi_char16_t") Short> name, Ptr<@OriginalName(value="efi_guid_t") misc.uuid_t> vendor) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static @Unsigned @OriginalName(value="efi_status_t") long virt_efi_get_time(Ptr<EfiDefinitions.efi_time_t> tm2, Ptr<EfiDefinitions.efi_time_cap_t> tc) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static @Unsigned @OriginalName(value="efi_status_t") long virt_efi_get_variable(Ptr<@Unsigned @OriginalName(value="efi_char16_t") Short> name, Ptr<@OriginalName(value="efi_guid_t") misc.uuid_t> vendor, Ptr<@Unsigned Integer> attr2, Ptr<@Unsigned Long> data_size, Ptr<?> data) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static @Unsigned @OriginalName(value="efi_status_t") long virt_efi_get_wakeup_time(Ptr<@OriginalName(value="efi_bool_t") Character> enabled, Ptr<@OriginalName(value="efi_bool_t") Character> pending, Ptr<EfiDefinitions.efi_time_t> tm2) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static @Unsigned @OriginalName(value="efi_status_t") long virt_efi_query_capsule_caps(Ptr<Ptr<EfiDefinitions.efi_capsule_header_t>> capsules, @Unsigned long count, Ptr<@Unsigned Long> max_size, Ptr<Integer> reset_type) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static @Unsigned @OriginalName(value="efi_status_t") long virt_efi_query_variable_info(@Unsigned int attr2, Ptr<@Unsigned Long> storage_space, Ptr<@Unsigned Long> remaining_space, Ptr<@Unsigned Long> max_variable_size) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static @Unsigned @OriginalName(value="efi_status_t") long virt_efi_query_variable_info_nb(@Unsigned int attr2, Ptr<@Unsigned Long> storage_space, Ptr<@Unsigned Long> remaining_space, Ptr<@Unsigned Long> max_variable_size) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void virt_efi_reset_system(int reset_type, @Unsigned @OriginalName(value="efi_status_t") long status, @Unsigned long data_size, Ptr<@Unsigned @OriginalName(value="efi_char16_t") Short> data) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static @Unsigned @OriginalName(value="efi_status_t") long virt_efi_set_time(Ptr<EfiDefinitions.efi_time_t> tm2) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static @Unsigned @OriginalName(value="efi_status_t") long virt_efi_set_variable(Ptr<@Unsigned @OriginalName(value="efi_char16_t") Short> name, Ptr<@OriginalName(value="efi_guid_t") misc.uuid_t> vendor, @Unsigned int attr2, @Unsigned long data_size, Ptr<?> data) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static @Unsigned @OriginalName(value="efi_status_t") long virt_efi_set_variable_nb(Ptr<@Unsigned @OriginalName(value="efi_char16_t") Short> name, Ptr<@OriginalName(value="efi_guid_t") misc.uuid_t> vendor, @Unsigned int attr2, @Unsigned long data_size, Ptr<?> data) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static @Unsigned @OriginalName(value="efi_status_t") long virt_efi_set_wakeup_time(@OriginalName(value="efi_bool_t") char enabled, Ptr<EfiDefinitions.efi_time_t> tm2) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static @Unsigned @OriginalName(value="efi_status_t") long virt_efi_update_capsule(Ptr<Ptr<EfiDefinitions.efi_capsule_header_t>> capsules, @Unsigned long count, @Unsigned long sg_list2) {
        throw new MethodIsBPFRelatedFunction();
    }

    @Type(noCCodeGeneration=true, cType="struct virt_dma_chan")
    @NotUsableInJava
    public static class virt_dma_chan
    extends Struct {
        public DmaDefinitions.dma_chan chan;
        public TaskletDefinitions.tasklet_struct task;
        public Ptr<?> desc_free;
        public  @OriginalName(value="spinlock_t") runtime.spinlock lock;
        public ListDefinitions.list_head desc_allocated;
        public ListDefinitions.list_head desc_submitted;
        public ListDefinitions.list_head desc_issued;
        public ListDefinitions.list_head desc_completed;
        public ListDefinitions.list_head desc_terminated;
        public Ptr<virt_dma_desc> cyclic;
    }

    @Type(noCCodeGeneration=true, cType="struct virt_dma_desc")
    @NotUsableInJava
    public static class virt_dma_desc
    extends Struct {
        public DmaDefinitions.dma_async_tx_descriptor tx;
        public DmaengineDefinitions.dmaengine_result tx_result;
        public ListDefinitions.list_head node;
    }

    @Type(noCCodeGeneration=true, cType="struct { u8 *page; void *addr; }")
    @NotUsableInJava
    public static class virt_of_dst_of_skcipher_walk_and_src_of_skcipher_walk
    extends Struct {
        public Ptr<Character> page;
        public Ptr<?> addr;
    }
}

