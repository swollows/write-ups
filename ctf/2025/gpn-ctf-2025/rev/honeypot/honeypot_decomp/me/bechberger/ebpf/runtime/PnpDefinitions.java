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
import me.bechberger.ebpf.runtime.DeviceDefinitions;
import me.bechberger.ebpf.runtime.ListDefinitions;
import me.bechberger.ebpf.runtime.PmDefinitions;
import me.bechberger.ebpf.runtime.ProcDefinitions;
import me.bechberger.ebpf.runtime.UDefinitions;
import me.bechberger.ebpf.runtime.runtime;
import me.bechberger.ebpf.type.Ptr;
import me.bechberger.ebpf.type.Struct;

public final class PnpDefinitions {
    @NotUsableInJava
    @BuiltinBPFFunction
    public static int pnp_activate_dev(Ptr<pnp_dev> dev) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int pnp_assign_irq(Ptr<pnp_dev> dev, Ptr<pnp_irq> rule, int idx) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int pnp_assign_resources(Ptr<pnp_dev> dev, int set) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int pnp_auto_config_dev(Ptr<pnp_dev> dev) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int pnp_disable_dev(Ptr<pnp_dev> dev) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void pnp_fixup_device(Ptr<pnp_dev> dev) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void pnp_init_resources(Ptr<pnp_dev> dev) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int pnp_start_dev(Ptr<pnp_dev> dev) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int pnp_stop_dev(Ptr<pnp_dev> dev) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int __pnp_bus_suspend(Ptr<runtime.device> dev, @OriginalName(value="pm_message_t") PmDefinitions.pm_message state2) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction(value="pnp_add_id($arg1, (const u8*)$arg2)")
    public static Ptr<pnp_id> pnp_add_id(Ptr<pnp_dev> dev, String id) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int pnp_bus_freeze(Ptr<runtime.device> dev) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction(value="pnp_bus_match($arg1, (const struct device_driver*)$arg2)")
    public static int pnp_bus_match(Ptr<runtime.device> dev, Ptr<DeviceDefinitions.device_driver> drv) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int pnp_bus_poweroff(Ptr<runtime.device> dev) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int pnp_bus_resume(Ptr<runtime.device> dev) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int pnp_bus_suspend(Ptr<runtime.device> dev) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int pnp_device_attach(Ptr<pnp_dev> pnp_dev2) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void pnp_device_detach(Ptr<pnp_dev> pnp_dev2) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int pnp_device_probe(Ptr<runtime.device> dev) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void pnp_device_remove(Ptr<runtime.device> dev) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void pnp_device_shutdown(Ptr<runtime.device> dev) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void pnp_print_irq(Ptr<@OriginalName(value="pnp_info_buffer_t") pnp_info_buffer> buffer, String space, Ptr<pnp_irq> irq) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int pnp_printf(Ptr<@OriginalName(value="pnp_info_buffer_t") pnp_info_buffer> buffer, String fmt, Object ... param2) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int pnp_register_driver(Ptr<pnp_driver> drv) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void pnp_unregister_driver(Ptr<pnp_driver> drv) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int pnp_add_card(Ptr<pnp_card> card) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int pnp_add_card_device(Ptr<pnp_card> card, Ptr<pnp_dev> dev) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static Ptr<pnp_card> pnp_alloc_card(Ptr<pnp_protocol> protocol, int id, String pnpid) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void pnp_eisa_id_to_string(@Unsigned int id, String str) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int pnp_is_active(Ptr<pnp_dev> dev) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static String pnp_option_priority_name(Ptr<pnp_option> option) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int pnp_register_card_driver(Ptr<pnp_card_driver> drv) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void pnp_release_card(Ptr<runtime.device> dmdev) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void pnp_release_card_device(Ptr<pnp_dev> dev) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void pnp_remove_card(Ptr<pnp_card> card) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void pnp_remove_card_device(Ptr<pnp_dev> dev) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction(value="pnp_request_card_device($arg1, (const u8*)$arg2, $arg3)")
    public static Ptr<pnp_dev> pnp_request_card_device(Ptr<pnp_card_link> clink, String id, Ptr<pnp_dev> from) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static String pnp_resource_type_name(Ptr<runtime.resource> res) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void pnp_unregister_card_driver(Ptr<pnp_card_driver> drv) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int __pnp_add_device(Ptr<pnp_dev> dev) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void __pnp_remove_device(Ptr<pnp_dev> dev) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static Ptr<pnp_resource> pnp_add_bus_resource(Ptr<pnp_dev> dev, @Unsigned @OriginalName(value="resource_size_t") long start, @Unsigned @OriginalName(value="resource_size_t") long end) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int pnp_add_device(Ptr<pnp_dev> dev) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static Ptr<pnp_resource> pnp_add_dma_resource(Ptr<pnp_dev> dev, int dma, int flags) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static Ptr<pnp_resource> pnp_add_io_resource(Ptr<pnp_dev> dev, @Unsigned @OriginalName(value="resource_size_t") long start, @Unsigned @OriginalName(value="resource_size_t") long end, int flags) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static Ptr<pnp_resource> pnp_add_irq_resource(Ptr<pnp_dev> dev, int irq, int flags) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static Ptr<pnp_resource> pnp_add_mem_resource(Ptr<pnp_dev> dev, @Unsigned @OriginalName(value="resource_size_t") long start, @Unsigned @OriginalName(value="resource_size_t") long end, int flags) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static Ptr<pnp_resource> pnp_add_resource(Ptr<pnp_dev> dev, Ptr<runtime.resource> res) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction(value="pnp_alloc_dev($arg1, $arg2, (const u8*)$arg3)")
    public static Ptr<pnp_dev> pnp_alloc_dev(Ptr<pnp_protocol> protocol, int id, String pnpid) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static Ptr<pnp_option> pnp_build_option(Ptr<pnp_dev> dev, @Unsigned long type2, @Unsigned int option_flags) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int pnp_check_dma(Ptr<pnp_dev> dev, Ptr<runtime.resource> res) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int pnp_check_irq(Ptr<pnp_dev> dev, Ptr<runtime.resource> res) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int pnp_check_mem(Ptr<pnp_dev> dev, Ptr<runtime.resource> res) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int pnp_check_port(Ptr<pnp_dev> dev, Ptr<runtime.resource> res) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void pnp_free_options(Ptr<pnp_dev> dev) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void pnp_free_resource(Ptr<pnp_resource> pnp_res) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void pnp_free_resources(Ptr<pnp_dev> dev) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static Ptr<runtime.resource> pnp_get_resource(Ptr<pnp_dev> dev, @Unsigned long type2, @Unsigned int num) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int pnp_init() {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static Ptr<pnp_resource> pnp_new_resource(Ptr<pnp_dev> dev) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int pnp_possible_config(Ptr<pnp_dev> dev, int type2, @Unsigned @OriginalName(value="resource_size_t") long start, @Unsigned @OriginalName(value="resource_size_t") long size) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int pnp_range_reserved(@Unsigned @OriginalName(value="resource_size_t") long start, @Unsigned @OriginalName(value="resource_size_t") long end) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int pnp_register_dma_resource(Ptr<pnp_dev> dev, @Unsigned int option_flags, char map2, char flags) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int pnp_register_irq_resource(Ptr<pnp_dev> dev, @Unsigned int option_flags, Ptr<pnp_irq_mask_t> map2, char flags) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int pnp_register_mem_resource(Ptr<pnp_dev> dev, @Unsigned int option_flags, @Unsigned @OriginalName(value="resource_size_t") long min, @Unsigned @OriginalName(value="resource_size_t") long max, @Unsigned @OriginalName(value="resource_size_t") long align, @Unsigned @OriginalName(value="resource_size_t") long size, char flags) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int pnp_register_port_resource(Ptr<pnp_dev> dev, @Unsigned int option_flags, @Unsigned @OriginalName(value="resource_size_t") long min, @Unsigned @OriginalName(value="resource_size_t") long max, @Unsigned @OriginalName(value="resource_size_t") long align, @Unsigned @OriginalName(value="resource_size_t") long size, char flags) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int pnp_register_protocol(Ptr<pnp_protocol> protocol) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void pnp_release_device(Ptr<runtime.device> dmdev) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static @Unsigned long pnp_resource_type(Ptr<runtime.resource> res) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int pnp_setup_reserve_dma(String str) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int pnp_setup_reserve_io(String str) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int pnp_setup_reserve_irq(String str) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int pnp_setup_reserve_mem(String str) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int pnp_system_init() {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static  @OriginalName(value="irqreturn_t") runtime.irqreturn pnp_test_handler(int irq, Ptr<?> dev_id) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void pnp_unregister_protocol(Ptr<pnp_protocol> protocol) {
        throw new MethodIsBPFRelatedFunction();
    }

    @Type(noCCodeGeneration=true, cType="struct { u8 id[8]; }")
    @NotUsableInJava
    public static class AnonymousType1048903970C22
    extends Struct {
        public char @Size(value=8) [] id;
    }

    @Type(noCCodeGeneration=true, cType="struct pnp_info_buffer")
    @NotUsableInJava
    public static class pnp_info_buffer
    extends Struct {
        public String buffer;
        public String curr;
        public @Unsigned long size;
        public @Unsigned long len;
        public int stop;
        public int error;
    }

    @Type(noCCodeGeneration=true, cType="struct pnp_fixup")
    @NotUsableInJava
    public static class pnp_fixup
    extends Struct {
        public char @Size(value=7) [] id;
        public Ptr<?> quirk_function;
    }

    @Type(noCCodeGeneration=true, cType="struct pnp_option")
    @NotUsableInJava
    public static class pnp_option
    extends Struct {
        public ListDefinitions.list_head list;
        public @Unsigned int flags;
        public @Unsigned long type;
        public UDefinitions.u_of_pnp_option u;
    }

    @Type(noCCodeGeneration=true, cType="struct pnp_mem")
    @NotUsableInJava
    public static class pnp_mem
    extends Struct {
        public @Unsigned @OriginalName(value="resource_size_t") long min;
        public @Unsigned @OriginalName(value="resource_size_t") long max;
        public @Unsigned @OriginalName(value="resource_size_t") long align;
        public @Unsigned @OriginalName(value="resource_size_t") long size;
        public char flags;
    }

    @Type(noCCodeGeneration=true, cType="struct pnp_dma")
    @NotUsableInJava
    public static class pnp_dma
    extends Struct {
        public char map;
        public char flags;
    }

    @Type(noCCodeGeneration=true, cType="struct pnp_irq")
    @NotUsableInJava
    public static class pnp_irq
    extends Struct {
        public pnp_irq_mask_t map;
        public char flags;
    }

    @Type(noCCodeGeneration=true, cType="struct { long unsigned int bits[4]; }")
    @NotUsableInJava
    public static class pnp_irq_mask_t
    extends Struct {
        public @Unsigned long @Size(value=4) [] bits;
    }

    @Type(noCCodeGeneration=true, cType="struct pnp_port")
    @NotUsableInJava
    public static class pnp_port
    extends Struct {
        public @Unsigned @OriginalName(value="resource_size_t") long min;
        public @Unsigned @OriginalName(value="resource_size_t") long max;
        public @Unsigned @OriginalName(value="resource_size_t") long align;
        public @Unsigned @OriginalName(value="resource_size_t") long size;
        public char flags;
    }

    @Type(noCCodeGeneration=true, cType="struct pnp_resource")
    @NotUsableInJava
    public static class pnp_resource
    extends Struct {
        public ListDefinitions.list_head list;
        public runtime.resource res;
    }

    @Type(noCCodeGeneration=true, cType="struct pnp_driver")
    @NotUsableInJava
    public static class pnp_driver
    extends Struct {
        public String name;
        public Ptr<pnp_device_id> id_table;
        public @Unsigned int flags;
        public Ptr<?> probe;
        public Ptr<?> remove;
        public Ptr<?> shutdown;
        public Ptr<?> suspend;
        public Ptr<?> resume;
        public DeviceDefinitions.device_driver driver;
    }

    @Type(noCCodeGeneration=true, cType="struct pnp_dev")
    @NotUsableInJava
    public static class pnp_dev
    extends Struct {
        public runtime.device dev;
        public @Unsigned long dma_mask;
        public @Unsigned int number;
        public int status;
        public ListDefinitions.list_head global_list;
        public ListDefinitions.list_head protocol_list;
        public ListDefinitions.list_head card_list;
        public ListDefinitions.list_head rdev_list;
        public Ptr<pnp_protocol> protocol;
        public Ptr<pnp_card> card;
        public Ptr<pnp_driver> driver;
        public Ptr<pnp_card_link> card_link;
        public Ptr<pnp_id> id;
        public int active;
        public int capabilities;
        public @Unsigned int num_dependent_sets;
        public ListDefinitions.list_head resources;
        public ListDefinitions.list_head options;
        public char @Size(value=50) [] name;
        public int flags;
        public Ptr<ProcDefinitions.proc_dir_entry> procent;
        public Ptr<?> data;
    }

    @Type(noCCodeGeneration=true, cType="struct pnp_card_driver")
    @NotUsableInJava
    public static class pnp_card_driver
    extends Struct {
        public ListDefinitions.list_head global_list;
        public String name;
        public Ptr<pnp_card_device_id> id_table;
        public @Unsigned int flags;
        public Ptr<?> probe;
        public Ptr<?> remove;
        public Ptr<?> suspend;
        public Ptr<?> resume;
        public pnp_driver link;
    }

    @Type(noCCodeGeneration=true, cType="struct pnp_card_link")
    @NotUsableInJava
    public static class pnp_card_link
    extends Struct {
        public Ptr<pnp_card> card;
        public Ptr<pnp_card_driver> driver;
        public Ptr<?> driver_data;
        public @OriginalName(value="pm_message_t") PmDefinitions.pm_message pm_state;
    }

    @Type(noCCodeGeneration=true, cType="struct pnp_id")
    @NotUsableInJava
    public static class pnp_id
    extends Struct {
        public char @Size(value=8) [] id;
        public Ptr<pnp_id> next;
    }

    @Type(noCCodeGeneration=true, cType="struct pnp_protocol")
    @NotUsableInJava
    public static class pnp_protocol
    extends Struct {
        public ListDefinitions.list_head protocol_list;
        public String name;
        public Ptr<?> get;
        public Ptr<?> set;
        public Ptr<?> disable;
        public Ptr<?> can_wakeup;
        public Ptr<?> suspend;
        public Ptr<?> resume;
        public char number;
        public runtime.device dev;
        public ListDefinitions.list_head cards;
        public ListDefinitions.list_head devices;
    }

    @Type(noCCodeGeneration=true, cType="struct pnp_card")
    @NotUsableInJava
    public static class pnp_card
    extends Struct {
        public runtime.device dev;
        public char number;
        public ListDefinitions.list_head global_list;
        public ListDefinitions.list_head protocol_list;
        public ListDefinitions.list_head devices;
        public Ptr<pnp_protocol> protocol;
        public Ptr<pnp_id> id;
        public char @Size(value=50) [] name;
        public char pnpver;
        public char productver;
        public @Unsigned int serial;
        public char checksum;
        public Ptr<ProcDefinitions.proc_dir_entry> procdir;
    }

    @Type(noCCodeGeneration=true, cType="struct pnp_card_device_id")
    @NotUsableInJava
    public static class pnp_card_device_id
    extends Struct {
        public char @Size(value=8) [] id;
        public @Unsigned @OriginalName(value="kernel_ulong_t") long driver_data;
        public AnonymousType1048903970C22 @Size(value=8) [] devs;
    }

    @Type(noCCodeGeneration=true, cType="struct pnp_device_id")
    @NotUsableInJava
    public static class pnp_device_id
    extends Struct {
        public char @Size(value=8) [] id;
        public @Unsigned @OriginalName(value="kernel_ulong_t") long driver_data;
    }
}

