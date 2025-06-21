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
import me.bechberger.ebpf.runtime.GpioDefinitions;
import me.bechberger.ebpf.runtime.GpiodDefinitions;
import me.bechberger.ebpf.runtime.ListDefinitions;
import me.bechberger.ebpf.runtime.MdioDefinitions;
import me.bechberger.ebpf.runtime.PhyDefinitions;
import me.bechberger.ebpf.runtime.UsbDefinitions;
import me.bechberger.ebpf.runtime.misc;
import me.bechberger.ebpf.runtime.runtime;
import me.bechberger.ebpf.type.Ptr;
import me.bechberger.ebpf.type.Struct;

public final class FwnodeDefinitions {
    @NotUsableInJava
    @BuiltinBPFFunction
    public static String fwnode_full_name_string(Ptr<fwnode_handle> fwnode, String buf, String end) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction(value="fwnode_string($arg1, $arg2, $arg3, $arg4, (const u8*)$arg5)")
    public static String fwnode_string(String buf, String end, Ptr<fwnode_handle> fwnode, misc.printf_spec spec, String fmt) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int fwnode_get_mac_address(Ptr<fwnode_handle> fwnode, String addr2) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int fwnode_mdiobus_phy_device_register(Ptr<misc.mii_bus> mdio, Ptr<PhyDefinitions.phy_device> phy2, Ptr<fwnode_handle> child, @Unsigned int addr2) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int fwnode_mdiobus_register_phy(Ptr<misc.mii_bus> bus, Ptr<fwnode_handle> child, @Unsigned int addr2) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static Ptr<UsbDefinitions.usb_role_switch> fwnode_usb_role_switch_get(Ptr<fwnode_handle> fwnode) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int __fwnode_link_add(Ptr<fwnode_handle> con, Ptr<fwnode_handle> sup, char flags) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void __fwnode_link_cycle(Ptr<fwnode_link> link2) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void __fwnode_link_del(Ptr<fwnode_link> link2) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction(value="fwnode_connection_find_match((const struct fwnode_handle*)$arg1, (const u8*)$arg2, $arg3, $arg4)")
    public static Ptr<?> fwnode_connection_find_match(Ptr<fwnode_handle> fwnode, String con_id, Ptr<?> data, @OriginalName(value="devcon_match_fn_t") Ptr<?> match) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction(value="fwnode_connection_find_matches((const struct fwnode_handle*)$arg1, (const u8*)$arg2, $arg3, $arg4, $arg5, $arg6)")
    public static int fwnode_connection_find_matches(Ptr<fwnode_handle> fwnode, String con_id, Ptr<?> data, @OriginalName(value="devcon_match_fn_t") Ptr<?> match, Ptr<Ptr<?>> matches, @Unsigned int matches_len) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction(value="fwnode_count_parents((const struct fwnode_handle*)$arg1)")
    public static @Unsigned int fwnode_count_parents(Ptr<fwnode_handle> fwnode) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction(value="fwnode_devcon_matches((const struct fwnode_handle*)$arg1, (const u8*)$arg2, $arg3, $arg4, $arg5, $arg6)")
    public static @Unsigned int fwnode_devcon_matches(Ptr<fwnode_handle> fwnode, String con_id, Ptr<?> data, @OriginalName(value="devcon_match_fn_t") Ptr<?> match, Ptr<Ptr<?>> matches, @Unsigned int matches_len) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction(value="fwnode_device_is_available((const struct fwnode_handle*)$arg1)")
    public static boolean fwnode_device_is_available(Ptr<fwnode_handle> fwnode) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction(value="fwnode_find_reference((const struct fwnode_handle*)$arg1, (const u8*)$arg2, $arg3)")
    public static Ptr<fwnode_handle> fwnode_find_reference(Ptr<fwnode_handle> fwnode, String name, @Unsigned int index2) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction(value="((const u8*)fwnode_get_name((const struct fwnode_handle*)$arg1))")
    public static String fwnode_get_name(Ptr<fwnode_handle> fwnode) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction(value="((const u8*)fwnode_get_name_prefix((const struct fwnode_handle*)$arg1))")
    public static String fwnode_get_name_prefix(Ptr<fwnode_handle> fwnode) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction(value="fwnode_get_named_child_node((const struct fwnode_handle*)$arg1, (const u8*)$arg2)")
    public static Ptr<fwnode_handle> fwnode_get_named_child_node(Ptr<fwnode_handle> fwnode, String childname) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction(value="fwnode_get_next_available_child_node((const struct fwnode_handle*)$arg1, $arg2)")
    public static Ptr<fwnode_handle> fwnode_get_next_available_child_node(Ptr<fwnode_handle> fwnode, Ptr<fwnode_handle> child) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction(value="fwnode_get_next_child_node((const struct fwnode_handle*)$arg1, $arg2)")
    public static Ptr<fwnode_handle> fwnode_get_next_child_node(Ptr<fwnode_handle> fwnode, Ptr<fwnode_handle> child) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static Ptr<fwnode_handle> fwnode_get_next_parent(Ptr<fwnode_handle> fwnode) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction(value="fwnode_get_next_parent_dev((const struct fwnode_handle*)$arg1)")
    public static Ptr<runtime.device> fwnode_get_next_parent_dev(Ptr<fwnode_handle> fwnode) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static Ptr<fwnode_handle> fwnode_get_nth_parent(Ptr<fwnode_handle> fwnode, @Unsigned int depth) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction(value="fwnode_get_parent((const struct fwnode_handle*)$arg1)")
    public static Ptr<fwnode_handle> fwnode_get_parent(Ptr<fwnode_handle> fwnode) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction(value="fwnode_get_phy_mode((const struct fwnode_handle*)$arg1)")
    public static int fwnode_get_phy_mode(Ptr<fwnode_handle> fwnode) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction(value="fwnode_gpiod_get_index($arg1, (const u8*)$arg2, $arg3, $arg4, (const u8*)$arg5)")
    public static Ptr<GpioDefinitions.gpio_desc> fwnode_gpiod_get_index(Ptr<fwnode_handle> fwnode, String con_id, int index2, GpiodDefinitions.gpiod_flags flags, String label) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction(value="fwnode_graph_devcon_matches((const struct fwnode_handle*)$arg1, (const u8*)$arg2, $arg3, $arg4, $arg5, $arg6)")
    public static @Unsigned int fwnode_graph_devcon_matches(Ptr<fwnode_handle> fwnode, String con_id, Ptr<?> data, @OriginalName(value="devcon_match_fn_t") Ptr<?> match, Ptr<Ptr<?>> matches, @Unsigned int matches_len) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction(value="fwnode_graph_get_endpoint_by_id((const struct fwnode_handle*)$arg1, $arg2, $arg3, $arg4)")
    public static Ptr<fwnode_handle> fwnode_graph_get_endpoint_by_id(Ptr<fwnode_handle> fwnode, @Unsigned int port2, @Unsigned int endpoint, @Unsigned long flags) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction(value="fwnode_graph_get_endpoint_count((const struct fwnode_handle*)$arg1, $arg2)")
    public static @Unsigned int fwnode_graph_get_endpoint_count(Ptr<fwnode_handle> fwnode, @Unsigned long flags) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction(value="fwnode_graph_get_next_endpoint((const struct fwnode_handle*)$arg1, $arg2)")
    public static Ptr<fwnode_handle> fwnode_graph_get_next_endpoint(Ptr<fwnode_handle> fwnode, Ptr<fwnode_handle> prev) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction(value="fwnode_graph_get_port_parent((const struct fwnode_handle*)$arg1)")
    public static Ptr<fwnode_handle> fwnode_graph_get_port_parent(Ptr<fwnode_handle> endpoint) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction(value="fwnode_graph_get_remote_endpoint((const struct fwnode_handle*)$arg1)")
    public static Ptr<fwnode_handle> fwnode_graph_get_remote_endpoint(Ptr<fwnode_handle> fwnode) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction(value="fwnode_graph_get_remote_port((const struct fwnode_handle*)$arg1)")
    public static Ptr<fwnode_handle> fwnode_graph_get_remote_port(Ptr<fwnode_handle> fwnode) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction(value="fwnode_graph_get_remote_port_parent((const struct fwnode_handle*)$arg1)")
    public static Ptr<fwnode_handle> fwnode_graph_get_remote_port_parent(Ptr<fwnode_handle> fwnode) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction(value="fwnode_graph_parse_endpoint((const struct fwnode_handle*)$arg1, $arg2)")
    public static int fwnode_graph_parse_endpoint(Ptr<fwnode_handle> fwnode, Ptr<fwnode_endpoint> endpoint) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static Ptr<fwnode_handle> fwnode_handle_get(Ptr<fwnode_handle> fwnode) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static Ptr<?> fwnode_iomap(Ptr<fwnode_handle> fwnode, int index2) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction(value="fwnode_irq_get((const struct fwnode_handle*)$arg1, $arg2)")
    public static int fwnode_irq_get(Ptr<fwnode_handle> fwnode, @Unsigned int index2) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction(value="fwnode_irq_get_byname((const struct fwnode_handle*)$arg1, (const u8*)$arg2)")
    public static int fwnode_irq_get_byname(Ptr<fwnode_handle> fwnode, String name) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int fwnode_link_add(Ptr<fwnode_handle> con, Ptr<fwnode_handle> sup, char flags) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void fwnode_links_purge(Ptr<fwnode_handle> fwnode) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction(value="fwnode_name_eq((const struct fwnode_handle*)$arg1, (const u8*)$arg2)")
    public static boolean fwnode_name_eq(Ptr<fwnode_handle> fwnode, String name) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction(value="fwnode_property_get_reference_args((const struct fwnode_handle*)$arg1, (const u8*)$arg2, (const u8*)$arg3, $arg4, $arg5, $arg6)")
    public static int fwnode_property_get_reference_args(Ptr<fwnode_handle> fwnode, String prop, String nargs_prop, @Unsigned int nargs, @Unsigned int index2, Ptr<fwnode_reference_args> args) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction(value="fwnode_property_match_property_string((const struct fwnode_handle*)$arg1, (const u8*)$arg2, (const u8**)$arg3, $arg4)")
    public static int fwnode_property_match_property_string(Ptr<fwnode_handle> fwnode, String propname, Ptr<String> array, @Unsigned long n) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction(value="fwnode_property_match_string((const struct fwnode_handle*)$arg1, (const u8*)$arg2, (const u8*)$arg3)")
    public static int fwnode_property_match_string(Ptr<fwnode_handle> fwnode, String propname, String string) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction(value="fwnode_property_present((const struct fwnode_handle*)$arg1, (const u8*)$arg2)")
    public static boolean fwnode_property_present(Ptr<fwnode_handle> fwnode, String propname) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction(value="fwnode_property_read_int_array((const struct fwnode_handle*)$arg1, (const u8*)$arg2, $arg3, $arg4, $arg5)")
    public static int fwnode_property_read_int_array(Ptr<fwnode_handle> fwnode, String propname, @Unsigned int elem_size, Ptr<?> val, @Unsigned long nval) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction(value="fwnode_property_read_string((const struct fwnode_handle*)$arg1, (const u8*)$arg2, (const u8**)$arg3)")
    public static int fwnode_property_read_string(Ptr<fwnode_handle> fwnode, String propname, Ptr<String> val) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction(value="fwnode_property_read_string_array((const struct fwnode_handle*)$arg1, (const u8*)$arg2, (const u8**)$arg3, $arg4)")
    public static int fwnode_property_read_string_array(Ptr<fwnode_handle> fwnode, String propname, Ptr<String> val, @Unsigned long nval) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction(value="fwnode_property_read_u16_array((const struct fwnode_handle*)$arg1, (const u8*)$arg2, $arg3, $arg4)")
    public static int fwnode_property_read_u16_array(Ptr<fwnode_handle> fwnode, String propname, Ptr<@Unsigned Short> val, @Unsigned long nval) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction(value="fwnode_property_read_u32_array((const struct fwnode_handle*)$arg1, (const u8*)$arg2, $arg3, $arg4)")
    public static int fwnode_property_read_u32_array(Ptr<fwnode_handle> fwnode, String propname, Ptr<@Unsigned Integer> val, @Unsigned long nval) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction(value="fwnode_property_read_u64_array((const struct fwnode_handle*)$arg1, (const u8*)$arg2, $arg3, $arg4)")
    public static int fwnode_property_read_u64_array(Ptr<fwnode_handle> fwnode, String propname, Ptr<@Unsigned Long> val, @Unsigned long nval) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction(value="fwnode_property_read_u8_array((const struct fwnode_handle*)$arg1, (const u8*)$arg2, $arg3, $arg4)")
    public static int fwnode_property_read_u8_array(Ptr<fwnode_handle> fwnode, String propname, Ptr<Character> val, @Unsigned long nval) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction(value="fwnode_create_software_node((const struct property_entry*)$arg1, (const struct fwnode_handle*)$arg2)")
    public static Ptr<fwnode_handle> fwnode_create_software_node(Ptr<misc.property_entry> properties, Ptr<fwnode_handle> parent) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int fwnode_get_phy_id(Ptr<fwnode_handle> fwnode, Ptr<@Unsigned Integer> phy_id) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction(value="fwnode_get_phy_node((const struct fwnode_handle*)$arg1)")
    public static Ptr<fwnode_handle> fwnode_get_phy_node(Ptr<fwnode_handle> fwnode) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static Ptr<MdioDefinitions.mdio_device> fwnode_mdio_find_device(Ptr<fwnode_handle> fwnode) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static Ptr<PhyDefinitions.phy_device> fwnode_phy_find_device(Ptr<fwnode_handle> phy_fwnode) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void fwnode_remove_software_node(Ptr<fwnode_handle> fwnode) {
        throw new MethodIsBPFRelatedFunction();
    }

    @Type(noCCodeGeneration=true, cType="struct fwnode_link")
    @NotUsableInJava
    public static class fwnode_link
    extends Struct {
        public Ptr<fwnode_handle> supplier;
        public ListDefinitions.list_head s_hook;
        public Ptr<fwnode_handle> consumer;
        public ListDefinitions.list_head c_hook;
        public char flags;
    }

    @Type(noCCodeGeneration=true, cType="struct fwnode_reference_args")
    @NotUsableInJava
    public static class fwnode_reference_args
    extends Struct {
        public Ptr<fwnode_handle> fwnode;
        public @Unsigned int nargs;
        public @Unsigned long @Size(value=8) [] args;
    }

    @Type(noCCodeGeneration=true, cType="struct fwnode_endpoint")
    @NotUsableInJava
    public static class fwnode_endpoint
    extends Struct {
        public @Unsigned int port;
        public @Unsigned int id;
        public Ptr<fwnode_handle> local_fwnode;
    }

    @Type(noCCodeGeneration=true, cType="struct fwnode_operations")
    @NotUsableInJava
    public static class fwnode_operations
    extends Struct {
        public Ptr<?> get;
        public Ptr<?> put;
        public Ptr<?> device_is_available;
        public Ptr<?> device_get_match_data;
        public Ptr<?> device_dma_supported;
        public Ptr<?> device_get_dma_attr;
        public Ptr<?> property_present;
        public Ptr<?> property_read_int_array;
        public Ptr<?> property_read_string_array;
        public Ptr<?> get_name;
        public Ptr<?> get_name_prefix;
        public Ptr<?> get_parent;
        public Ptr<?> get_next_child_node;
        public Ptr<?> get_named_child_node;
        public Ptr<?> get_reference_args;
        public Ptr<?> graph_get_next_endpoint;
        public Ptr<?> graph_get_remote_endpoint;
        public Ptr<?> graph_get_port_parent;
        public Ptr<?> graph_parse_endpoint;
        public Ptr<?> iomap;
        public Ptr<?> irq_get;
        public Ptr<?> add_links;
    }

    @Type(noCCodeGeneration=true, cType="struct fwnode_handle")
    @NotUsableInJava
    public static class fwnode_handle
    extends Struct {
        public Ptr<fwnode_handle> secondary;
        public Ptr<fwnode_operations> ops;
        public Ptr<runtime.device> dev;
        public ListDefinitions.list_head suppliers;
        public ListDefinitions.list_head consumers;
        public char flags;
    }
}

