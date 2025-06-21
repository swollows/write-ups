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
import me.bechberger.ebpf.runtime.FwnodeDefinitions;
import me.bechberger.ebpf.runtime.KernelDefinitions;
import me.bechberger.ebpf.runtime.misc;
import me.bechberger.ebpf.runtime.runtime;
import me.bechberger.ebpf.type.Ptr;
import me.bechberger.ebpf.type.Struct;

public final class SoftwareDefinitions {
    @NotUsableInJava
    @BuiltinBPFFunction(value="software_key_determine_akcipher((const struct public_key*)$arg1, (const u8*)$arg2, (const u8*)$arg3, $arg4, $arg5, $arg6)")
    public static int software_key_determine_akcipher(Ptr<misc.public_key> pkey, String encoding, String hash_algo2, String alg_name, Ptr<@OriginalName(value="bool") Boolean> sig, KernelDefinitions.kernel_pkey_operation op) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction(value="software_key_eds_op($arg1, (const void*)$arg2, $arg3)")
    public static int software_key_eds_op(Ptr<KernelDefinitions.kernel_pkey_params> params, Ptr<?> in, Ptr<?> out) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction(value="software_key_query((const struct kernel_pkey_params*)$arg1, $arg2)")
    public static int software_key_query(Ptr<KernelDefinitions.kernel_pkey_params> params, Ptr<KernelDefinitions.kernel_pkey_query> info2) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int software_resume() {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int software_resume_initcall() {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void software_node_exit() {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction(value="((const struct software_node*)software_node_find_by_name((const struct software_node*)$arg1, (const u8*)$arg2))")
    public static Ptr<software_node> software_node_find_by_name(Ptr<software_node> parent, String name) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction(value="software_node_fwnode((const struct software_node*)$arg1)")
    public static Ptr<FwnodeDefinitions.fwnode_handle> software_node_fwnode(Ptr<software_node> node2) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static Ptr<FwnodeDefinitions.fwnode_handle> software_node_get(Ptr<FwnodeDefinitions.fwnode_handle> fwnode) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction(value="((const u8*)software_node_get_name((const struct fwnode_handle*)$arg1))")
    public static String software_node_get_name(Ptr<FwnodeDefinitions.fwnode_handle> fwnode) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction(value="((const u8*)software_node_get_name_prefix((const struct fwnode_handle*)$arg1))")
    public static String software_node_get_name_prefix(Ptr<FwnodeDefinitions.fwnode_handle> fwnode) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction(value="software_node_get_named_child_node((const struct fwnode_handle*)$arg1, (const u8*)$arg2)")
    public static Ptr<FwnodeDefinitions.fwnode_handle> software_node_get_named_child_node(Ptr<FwnodeDefinitions.fwnode_handle> fwnode, String childname) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction(value="software_node_get_next_child((const struct fwnode_handle*)$arg1, $arg2)")
    public static Ptr<FwnodeDefinitions.fwnode_handle> software_node_get_next_child(Ptr<FwnodeDefinitions.fwnode_handle> fwnode, Ptr<FwnodeDefinitions.fwnode_handle> child) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction(value="software_node_get_parent((const struct fwnode_handle*)$arg1)")
    public static Ptr<FwnodeDefinitions.fwnode_handle> software_node_get_parent(Ptr<FwnodeDefinitions.fwnode_handle> fwnode) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction(value="software_node_get_reference_args((const struct fwnode_handle*)$arg1, (const u8*)$arg2, (const u8*)$arg3, $arg4, $arg5, $arg6)")
    public static int software_node_get_reference_args(Ptr<FwnodeDefinitions.fwnode_handle> fwnode, String propname, String nargs_prop, @Unsigned int nargs, @Unsigned int index2, Ptr<FwnodeDefinitions.fwnode_reference_args> args) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction(value="software_node_graph_get_next_endpoint((const struct fwnode_handle*)$arg1, $arg2)")
    public static Ptr<FwnodeDefinitions.fwnode_handle> software_node_graph_get_next_endpoint(Ptr<FwnodeDefinitions.fwnode_handle> fwnode, Ptr<FwnodeDefinitions.fwnode_handle> endpoint) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static Ptr<FwnodeDefinitions.fwnode_handle> software_node_graph_get_port_parent(Ptr<FwnodeDefinitions.fwnode_handle> fwnode) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction(value="software_node_graph_get_remote_endpoint((const struct fwnode_handle*)$arg1)")
    public static Ptr<FwnodeDefinitions.fwnode_handle> software_node_graph_get_remote_endpoint(Ptr<FwnodeDefinitions.fwnode_handle> fwnode) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction(value="software_node_graph_parse_endpoint((const struct fwnode_handle*)$arg1, $arg2)")
    public static int software_node_graph_parse_endpoint(Ptr<FwnodeDefinitions.fwnode_handle> fwnode, Ptr<FwnodeDefinitions.fwnode_endpoint> endpoint) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int software_node_init() {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void software_node_notify(Ptr<runtime.device> dev) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void software_node_notify_remove(Ptr<runtime.device> dev) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction(value="software_node_property_present((const struct fwnode_handle*)$arg1, (const u8*)$arg2)")
    public static boolean software_node_property_present(Ptr<FwnodeDefinitions.fwnode_handle> fwnode, String propname) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void software_node_put(Ptr<FwnodeDefinitions.fwnode_handle> fwnode) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction(value="software_node_read_int_array((const struct fwnode_handle*)$arg1, (const u8*)$arg2, $arg3, $arg4, $arg5)")
    public static int software_node_read_int_array(Ptr<FwnodeDefinitions.fwnode_handle> fwnode, String propname, @Unsigned int elem_size, Ptr<?> val, @Unsigned long nval) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction(value="software_node_read_string_array((const struct fwnode_handle*)$arg1, (const u8*)$arg2, (const u8**)$arg3, $arg4)")
    public static int software_node_read_string_array(Ptr<FwnodeDefinitions.fwnode_handle> fwnode, String propname, Ptr<String> val, @Unsigned long nval) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction(value="software_node_register((const struct software_node*)$arg1)")
    public static int software_node_register(Ptr<software_node> node2) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction(value="software_node_register_node_group((const struct software_node**)$arg1)")
    public static int software_node_register_node_group(Ptr<Ptr<software_node>> node_group) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void software_node_release(Ptr<runtime.kobject> kobj) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction(value="software_node_unregister((const struct software_node*)$arg1)")
    public static void software_node_unregister(Ptr<software_node> node2) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction(value="software_node_unregister_node_group((const struct software_node**)$arg1)")
    public static void software_node_unregister_node_group(Ptr<Ptr<software_node>> node_group) {
        throw new MethodIsBPFRelatedFunction();
    }

    @Type(noCCodeGeneration=true, cType="struct software_node")
    @NotUsableInJava
    public static class software_node
    extends Struct {
        public String name;
        public Ptr<software_node> parent;
        public Ptr<misc.property_entry> properties;
    }

    @Type(noCCodeGeneration=true, cType="struct software_node_ref_args")
    @NotUsableInJava
    public static class software_node_ref_args
    extends Struct {
        public Ptr<software_node> node;
        public @Unsigned int nargs;
        public @Unsigned long @Size(value=8) [] args;
    }
}

