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
import me.bechberger.ebpf.runtime.AttributeDefinitions;
import me.bechberger.ebpf.runtime.BusDefinitions;
import me.bechberger.ebpf.runtime.DelayedDefinitions;
import me.bechberger.ebpf.runtime.HwDefinitions;
import me.bechberger.ebpf.runtime.KernelDefinitions;
import me.bechberger.ebpf.runtime.ListDefinitions;
import me.bechberger.ebpf.runtime.MemDefinitions;
import me.bechberger.ebpf.runtime.PciDefinitions;
import me.bechberger.ebpf.runtime.misc;
import me.bechberger.ebpf.runtime.runtime;
import me.bechberger.ebpf.type.Enum;
import me.bechberger.ebpf.type.Ptr;
import me.bechberger.ebpf.type.Struct;
import me.bechberger.ebpf.type.TypedEnum;

public final class EdacDefinitions {
    @NotUsableInJava
    @BuiltinBPFFunction
    public static @OriginalName(value="ssize_t") long edac_dev_block_show(Ptr<runtime.kobject> kobj, Ptr<runtime.attribute> attr2, String buffer) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static @OriginalName(value="ssize_t") long edac_dev_ctl_info_show(Ptr<runtime.kobject> kobj, Ptr<runtime.attribute> attr2, String buffer) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction(value="edac_dev_ctl_info_store($arg1, $arg2, (const u8*)$arg3, $arg4)")
    public static @OriginalName(value="ssize_t") long edac_dev_ctl_info_store(Ptr<runtime.kobject> kobj, Ptr<runtime.attribute> attr2, String buffer, @Unsigned long count) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static @OriginalName(value="ssize_t") long edac_dev_instance_show(Ptr<runtime.kobject> kobj, Ptr<runtime.attribute> attr2, String buffer) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction(value="edac_dev_instance_store($arg1, $arg2, (const u8*)$arg3, $arg4)")
    public static @OriginalName(value="ssize_t") long edac_dev_instance_store(Ptr<runtime.kobject> kobj, Ptr<runtime.attribute> attr2, String buffer, @Unsigned long count) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int edac_device_create_instance(Ptr<edac_device_ctl_info> edac_dev, int idx) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int edac_device_create_sysfs(Ptr<edac_device_ctl_info> edac_dev) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static @OriginalName(value="ssize_t") long edac_device_ctl_log_ce_show(Ptr<edac_device_ctl_info> ctl_info, String data) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction(value="edac_device_ctl_log_ce_store($arg1, (const u8*)$arg2, $arg3)")
    public static @OriginalName(value="ssize_t") long edac_device_ctl_log_ce_store(Ptr<edac_device_ctl_info> ctl_info, String data, @Unsigned long count) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static @OriginalName(value="ssize_t") long edac_device_ctl_log_ue_show(Ptr<edac_device_ctl_info> ctl_info, String data) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction(value="edac_device_ctl_log_ue_store($arg1, (const u8*)$arg2, $arg3)")
    public static @OriginalName(value="ssize_t") long edac_device_ctl_log_ue_store(Ptr<edac_device_ctl_info> ctl_info, String data, @Unsigned long count) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static @OriginalName(value="ssize_t") long edac_device_ctl_panic_on_ue_show(Ptr<edac_device_ctl_info> ctl_info, String data) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction(value="edac_device_ctl_panic_on_ue_store($arg1, (const u8*)$arg2, $arg3)")
    public static @OriginalName(value="ssize_t") long edac_device_ctl_panic_on_ue_store(Ptr<edac_device_ctl_info> ctl_info, String data, @Unsigned long count) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static @OriginalName(value="ssize_t") long edac_device_ctl_poll_msec_show(Ptr<edac_device_ctl_info> ctl_info, String data) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction(value="edac_device_ctl_poll_msec_store($arg1, (const u8*)$arg2, $arg3)")
    public static @OriginalName(value="ssize_t") long edac_device_ctl_poll_msec_store(Ptr<edac_device_ctl_info> ctl_info, String data, @Unsigned long count) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void edac_device_ctrl_block_release(Ptr<runtime.kobject> kobj) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void edac_device_ctrl_instance_release(Ptr<runtime.kobject> kobj) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void edac_device_ctrl_master_release(Ptr<runtime.kobject> kobj) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int edac_device_register_sysfs_main_kobj(Ptr<edac_device_ctl_info> edac_dev) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void edac_device_remove_sysfs(Ptr<edac_device_ctl_info> edac_dev) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void edac_device_unregister_sysfs_main_kobj(Ptr<edac_device_ctl_info> dev) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static @Unsigned int edac_dimm_info_location(Ptr<misc.dimm_info> dimm, String buf, @Unsigned int len) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction(value="((const u8*)edac_get_owner())")
    public static String edac_get_owner() {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static boolean edac_has_mcs() {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction(value="edac_mc_add_mc_with_groups($arg1, (const struct attribute_group**)$arg2)")
    public static int edac_mc_add_mc_with_groups(Ptr<MemDefinitions.mem_ctl_info> mci, Ptr<Ptr<AttributeDefinitions.attribute_group>> groups) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static Ptr<MemDefinitions.mem_ctl_info> edac_mc_alloc(@Unsigned int mc_num, @Unsigned int n_layers, Ptr<edac_mc_layer> layers, @Unsigned int sz_pvt) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int edac_mc_alloc_csrows(Ptr<MemDefinitions.mem_ctl_info> mci) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int edac_mc_alloc_dimms(Ptr<MemDefinitions.mem_ctl_info> mci) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static Ptr<MemDefinitions.mem_ctl_info> edac_mc_del_mc(Ptr<runtime.device> dev) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static Ptr<MemDefinitions.mem_ctl_info> edac_mc_find(int idx) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int edac_mc_find_csrow_by_page(Ptr<MemDefinitions.mem_ctl_info> mci, @Unsigned long page2) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void edac_mc_free(Ptr<MemDefinitions.mem_ctl_info> mci) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction(value="edac_mc_handle_error((const enum hw_event_mc_err_type)$arg1, $arg2, (const short unsigned int)$arg3, (const long unsigned int)$arg4, (const long unsigned int)$arg5, (const long unsigned int)$arg6, (const int)$arg7, (const int)$arg8, (const int)$arg9, (const u8*)$arg10, (const u8*)$arg11)")
    public static void edac_mc_handle_error(HwDefinitions.hw_event_mc_err_type type2, Ptr<MemDefinitions.mem_ctl_info> mci, @Unsigned short error_count, @Unsigned long page_frame_number, @Unsigned long offset_in_page, @Unsigned long syndrome, int top_layer, int mid_layer, int low_layer, String msg, String other_detail) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void edac_mc_reset_delay_period(@Unsigned long value) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void edac_mc_scrub_block(@Unsigned long page2, @Unsigned long offset, @Unsigned int size) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void edac_mc_workq_function(Ptr<misc.work_struct> work_req) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void edac_raw_mc_handle_error(Ptr<edac_raw_error_desc> e) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction(value="edac_create_sysfs_mci_device($arg1, (const struct attribute_group**)$arg2)")
    public static int edac_create_sysfs_mci_device(Ptr<MemDefinitions.mem_ctl_info> mci, Ptr<Ptr<AttributeDefinitions.attribute_group>> groups) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int edac_mc_get_log_ce() {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int edac_mc_get_log_ue() {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int edac_mc_get_panic_on_ue() {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static @Unsigned int edac_mc_get_poll_msec() {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void edac_mc_sysfs_exit() {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int edac_mc_sysfs_init() {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void edac_remove_sysfs_mci_device(Ptr<MemDefinitions.mem_ctl_info> mci) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction(value="edac_set_poll_msec((const u8*)$arg1, (const struct kernel_param*)$arg2)")
    public static int edac_set_poll_msec(String val, Ptr<KernelDefinitions.kernel_param> kp) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int edac_device_add_device(Ptr<edac_device_ctl_info> edac_dev) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static Ptr<edac_device_ctl_info> edac_device_alloc_ctl_info(@Unsigned int pvt_sz, String dev_name, @Unsigned int nr_instances, String blk_name, @Unsigned int nr_blocks, @Unsigned int off_val, int device_index) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int edac_device_alloc_index() {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static Ptr<edac_device_ctl_info> edac_device_del_device(Ptr<runtime.device> dev) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void edac_device_free_ctl_info(Ptr<edac_device_ctl_info> ctl_info) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction(value="edac_device_handle_ce_count($arg1, $arg2, $arg3, $arg4, (const u8*)$arg5)")
    public static void edac_device_handle_ce_count(Ptr<edac_device_ctl_info> edac_dev, @Unsigned int count, int inst_nr, int block_nr, String msg) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction(value="edac_device_handle_ue_count($arg1, $arg2, $arg3, $arg4, (const u8*)$arg5)")
    public static void edac_device_handle_ue_count(Ptr<edac_device_ctl_info> edac_dev, @Unsigned int count, int inst_nr, int block_nr, String msg) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void edac_device_reset_delay_period(Ptr<edac_device_ctl_info> edac_dev, @Unsigned long msec) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void edac_device_workq_function(Ptr<misc.work_struct> work_req) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static boolean edac_mod_work(Ptr<DelayedDefinitions.delayed_work> work, @Unsigned long delay) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int edac_pci_add_device(Ptr<edac_pci_ctl_info> pci, int edac_idx) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction(value="edac_pci_alloc_ctl_info($arg1, (const u8*)$arg2)")
    public static Ptr<edac_pci_ctl_info> edac_pci_alloc_ctl_info(@Unsigned int sz_pvt, String edac_pci_name) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int edac_pci_alloc_index() {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction(value="edac_pci_create_generic_ctl($arg1, (const u8*)$arg2)")
    public static Ptr<edac_pci_ctl_info> edac_pci_create_generic_ctl(Ptr<runtime.device> dev, String mod_name) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static Ptr<edac_pci_ctl_info> edac_pci_del_device(Ptr<runtime.device> dev) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void edac_pci_free_ctl_info(Ptr<edac_pci_ctl_info> pci) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void edac_pci_generic_check(Ptr<edac_pci_ctl_info> pci) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void edac_pci_release_generic_ctl(Ptr<edac_pci_ctl_info> pci) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void edac_pci_workq_function(Ptr<misc.work_struct> work_req) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static boolean edac_queue_work(Ptr<DelayedDefinitions.delayed_work> work, @Unsigned long delay) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static boolean edac_stop_work(Ptr<DelayedDefinitions.delayed_work> work) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int edac_workqueue_setup() {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void edac_workqueue_teardown() {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void edac_exit() {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction(value="((const struct bus_type*)edac_get_sysfs_subsys())")
    public static Ptr<BusDefinitions.bus_type> edac_get_sysfs_subsys() {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int edac_init() {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static String edac_op_state_to_string(int opstate) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void edac_pci_clear_parity_errors() {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int edac_pci_create_sysfs(Ptr<edac_pci_ctl_info> pci) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void edac_pci_dev_parity_test(Ptr<PciDefinitions.pci_dev> dev) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static @OriginalName(value="ssize_t") long edac_pci_dev_show(Ptr<runtime.kobject> kobj, Ptr<runtime.attribute> attr2, String buffer) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction(value="edac_pci_dev_store($arg1, $arg2, (const u8*)$arg3, $arg4)")
    public static @OriginalName(value="ssize_t") long edac_pci_dev_store(Ptr<runtime.kobject> kobj, Ptr<runtime.attribute> attr2, String buffer, @Unsigned long count) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void edac_pci_do_parity_check() {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int edac_pci_get_check_errors() {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int edac_pci_get_poll_msec() {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction(value="edac_pci_handle_npe($arg1, (const u8*)$arg2)")
    public static void edac_pci_handle_npe(Ptr<edac_pci_ctl_info> pci, String msg) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction(value="edac_pci_handle_pe($arg1, (const u8*)$arg2)")
    public static void edac_pci_handle_pe(Ptr<edac_pci_ctl_info> pci, String msg) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void edac_pci_instance_release(Ptr<runtime.kobject> kobj) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static @OriginalName(value="ssize_t") long edac_pci_instance_show(Ptr<runtime.kobject> kobj, Ptr<runtime.attribute> attr2, String buffer) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction(value="edac_pci_instance_store($arg1, $arg2, (const u8*)$arg3, $arg4)")
    public static @OriginalName(value="ssize_t") long edac_pci_instance_store(Ptr<runtime.kobject> kobj, Ptr<runtime.attribute> attr2, String buffer, @Unsigned long count) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static @OriginalName(value="ssize_t") long edac_pci_int_show(Ptr<?> ptr, String buffer) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction(value="edac_pci_int_store($arg1, (const u8*)$arg2, $arg3)")
    public static @OriginalName(value="ssize_t") long edac_pci_int_store(Ptr<?> ptr, String buffer, @Unsigned long count) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void edac_pci_release_main_kobj(Ptr<runtime.kobject> kobj) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void edac_pci_remove_sysfs(Ptr<edac_pci_ctl_info> pci) {
        throw new MethodIsBPFRelatedFunction();
    }

    @Type(noCCodeGeneration=true, cType="struct edac_pci_gen_data")
    @NotUsableInJava
    public static class edac_pci_gen_data
    extends Struct {
        public int edac_idx;
    }

    @Type(noCCodeGeneration=true, cType="struct edac_device_instance")
    @NotUsableInJava
    public static class edac_device_instance
    extends Struct {
        public Ptr<edac_device_ctl_info> ctl;
        public char @Size(value=35) [] name;
        public edac_device_counter counters;
        public @Unsigned int nr_blocks;
        public Ptr<edac_device_block> blocks;
        public runtime.kobject kobj;
    }

    @Type(noCCodeGeneration=true, cType="struct edac_device_block")
    @NotUsableInJava
    public static class edac_device_block
    extends Struct {
        public Ptr<edac_device_instance> instance;
        public char @Size(value=32) [] name;
        public edac_device_counter counters;
        public int nr_attribs;
        public Ptr<edac_dev_sysfs_block_attribute> block_attributes;
        public runtime.kobject kobj;
    }

    @Type(noCCodeGeneration=true, cType="struct edac_dev_sysfs_block_attribute")
    @NotUsableInJava
    public static class edac_dev_sysfs_block_attribute
    extends Struct {
        public runtime.attribute attr;
        public Ptr<?> show;
    }

    @Type(noCCodeGeneration=true, cType="struct edac_device_ctl_info")
    @NotUsableInJava
    public static class edac_device_ctl_info
    extends Struct {
        public ListDefinitions.list_head link;
        public Ptr<runtime.module> owner;
        public int dev_idx;
        public int log_ue;
        public int log_ce;
        public int panic_on_ue;
        public @Unsigned int poll_msec;
        public @Unsigned long delay;
        public Ptr<edac_dev_sysfs_attribute> sysfs_attributes;
        public Ptr<BusDefinitions.bus_type> edac_subsys;
        public int op_state;
        public DelayedDefinitions.delayed_work work;
        public Ptr<?> edac_check;
        public Ptr<runtime.device> dev;
        public String mod_name;
        public String ctl_name;
        public String dev_name;
        public Ptr<?> pvt_info;
        public @Unsigned long start_time;
        public char @Size(value=32) [] name;
        public @Unsigned int nr_instances;
        public Ptr<edac_device_instance> instances;
        public Ptr<edac_device_block> blocks;
        public edac_device_counter counters;
        public runtime.kobject kobj;
    }

    @Type(noCCodeGeneration=true, cType="struct edac_dev_sysfs_attribute")
    @NotUsableInJava
    public static class edac_dev_sysfs_attribute
    extends Struct {
        public runtime.attribute attr;
        public Ptr<?> show;
        public Ptr<?> store;
    }

    @Type(noCCodeGeneration=true, cType="struct edac_device_counter")
    @NotUsableInJava
    public static class edac_device_counter
    extends Struct {
        public @Unsigned int ue_count;
        public @Unsigned int ce_count;
    }

    @Type(noCCodeGeneration=true, cType="struct edac_raw_error_desc")
    @NotUsableInJava
    public static class edac_raw_error_desc
    extends Struct {
        public char @Size(value=256) [] location;
        public char @Size(value=296) [] label;
        public long grain;
        public @Unsigned short error_count;
        public HwDefinitions.hw_event_mc_err_type type;
        public int top_layer;
        public int mid_layer;
        public int low_layer;
        public @Unsigned long page_frame_number;
        public @Unsigned long offset_in_page;
        public @Unsigned long syndrome;
        public String msg;
        public String other_detail;
    }

    @Type(noCCodeGeneration=true, cType="struct edac_mc_layer")
    @NotUsableInJava
    public static class edac_mc_layer
    extends Struct {
        public edac_mc_layer_type type;
        public @Unsigned int size;
        public boolean is_virt_csrow;
    }

    @Type(noCCodeGeneration=true, cType="enum edac_mc_layer_type")
    public static enum edac_mc_layer_type implements Enum<edac_mc_layer_type>,
    TypedEnum<edac_mc_layer_type, Integer>
    {
        EDAC_MC_LAYER_BRANCH,
        EDAC_MC_LAYER_CHANNEL,
        EDAC_MC_LAYER_SLOT,
        EDAC_MC_LAYER_CHIP_SELECT,
        EDAC_MC_LAYER_ALL_MEM;

    }

    @Type(noCCodeGeneration=true, cType="enum edac_type")
    public static enum edac_type implements Enum<edac_type>,
    TypedEnum<edac_type, Integer>
    {
        EDAC_UNKNOWN,
        EDAC_NONE,
        EDAC_RESERVED,
        EDAC_PARITY,
        EDAC_EC,
        EDAC_SECDED,
        EDAC_S2ECD2ED,
        EDAC_S4ECD4ED,
        EDAC_S8ECD8ED,
        EDAC_S16ECD16ED;

    }

    @Type(noCCodeGeneration=true, cType="struct edac_pci_dev_attribute")
    @NotUsableInJava
    public static class edac_pci_dev_attribute
    extends Struct {
        public runtime.attribute attr;
        public Ptr<?> value;
        public Ptr<?> show;
        public Ptr<?> store;
    }

    @Type(noCCodeGeneration=true, cType="struct edac_pci_ctl_info")
    @NotUsableInJava
    public static class edac_pci_ctl_info
    extends Struct {
        public ListDefinitions.list_head link;
        public int pci_idx;
        public int op_state;
        public DelayedDefinitions.delayed_work work;
        public Ptr<?> edac_check;
        public Ptr<runtime.device> dev;
        public String mod_name;
        public String ctl_name;
        public String dev_name;
        public Ptr<?> pvt_info;
        public @Unsigned long start_time;
        public char @Size(value=32) [] name;
        public edac_pci_counter counters;
        public runtime.kobject kobj;
    }

    @Type(noCCodeGeneration=true, cType="struct edac_pci_counter")
    @NotUsableInJava
    public static class edac_pci_counter
    extends Struct {
        public AtomicDefinitions.atomic_t pe_count;
        public AtomicDefinitions.atomic_t npe_count;
    }
}

