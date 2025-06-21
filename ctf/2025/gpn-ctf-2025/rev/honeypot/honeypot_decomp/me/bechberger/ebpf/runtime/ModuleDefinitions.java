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
import me.bechberger.ebpf.runtime.AttributeDefinitions;
import me.bechberger.ebpf.runtime.DeviceDefinitions;
import me.bechberger.ebpf.runtime.EthnlDefinitions;
import me.bechberger.ebpf.runtime.EthtoolDefinitions;
import me.bechberger.ebpf.runtime.GenlDefinitions;
import me.bechberger.ebpf.runtime.KernelDefinitions;
import me.bechberger.ebpf.runtime.ListDefinitions;
import me.bechberger.ebpf.runtime.LoadDefinitions;
import me.bechberger.ebpf.runtime.ModDefinitions;
import me.bechberger.ebpf.runtime.NetDefinitions;
import me.bechberger.ebpf.runtime.ParamDefinitions;
import me.bechberger.ebpf.runtime.SkDefinitions;
import me.bechberger.ebpf.runtime.misc;
import me.bechberger.ebpf.runtime.runtime;
import me.bechberger.ebpf.type.Enum;
import me.bechberger.ebpf.type.Ptr;
import me.bechberger.ebpf.type.Struct;
import me.bechberger.ebpf.type.TypedEnum;

public final class ModuleDefinitions {
    @NotUsableInJava
    @BuiltinBPFFunction
    public static Ptr<runtime.module> __module_address(@Unsigned long addr2) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void __module_get(Ptr<runtime.module> module2) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void __module_put_and_kthread_exit(Ptr<runtime.module> mod, long code2) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static Ptr<runtime.module> __module_text_address(@Unsigned long addr2) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void module_arch_cleanup(Ptr<runtime.module> mod) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void module_arch_freeing_init(Ptr<runtime.module> mod) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static @OriginalName(value="ssize_t") long module_attr_show(Ptr<runtime.kobject> kobj, Ptr<runtime.attribute> attr2, String buf) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction(value="module_attr_store($arg1, $arg2, (const u8*)$arg3, $arg4)")
    public static @OriginalName(value="ssize_t") long module_attr_store(Ptr<runtime.kobject> kobj, Ptr<runtime.attribute> attr2, String buf, @Unsigned long len) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void module_augment_kernel_taints(Ptr<runtime.module> mod, Ptr<LoadDefinitions.load_info> info2) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static boolean module_elf_check_arch(Ptr<@OriginalName(value="Elf64_Ehdr") misc.elf64_hdr> hdr) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction(value="module_exit_section((const u8*)$arg1)")
    public static boolean module_exit_section(String name) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction(value="module_finalize((const elf64_hdr*)$arg1, (const elf64_shdr*)$arg2, $arg3)")
    public static int module_finalize(Ptr<@OriginalName(value="Elf64_Ehdr") misc.elf64_hdr> hdr, Ptr<@OriginalName(value="Elf64_Shdr") misc.elf64_shdr> sechdrs, Ptr<runtime.module> me) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static String module_flags(Ptr<runtime.module> mod, String buf, boolean show_state) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static @Unsigned long module_flags_taint(@Unsigned long taints, String buf) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int module_frob_arch_sections(Ptr<@OriginalName(value="Elf64_Ehdr") misc.elf64_hdr> hdr, Ptr<@OriginalName(value="Elf64_Shdr") misc.elf64_shdr> sechdrs, String secstrings, Ptr<runtime.module> mod) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static long module_get_offset_and_type(Ptr<runtime.module> mod, ModDefinitions.mod_mem_type type2, Ptr<@OriginalName(value="Elf64_Shdr") misc.elf64_shdr> sechdr, @Unsigned int section) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction(value="module_init_layout_section((const u8*)$arg1)")
    public static boolean module_init_layout_section(String sname) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction(value="module_init_section((const u8*)$arg1)")
    public static boolean module_init_section(String name) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void module_kobj_release(Ptr<runtime.kobject> kobj) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static String module_next_tag_pair(String string, Ptr<@Unsigned Long> secsize) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void module_param_sysfs_remove(Ptr<runtime.module> mod) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction(value="module_param_sysfs_setup($arg1, (const struct kernel_param*)$arg2, $arg3)")
    public static int module_param_sysfs_setup(Ptr<runtime.module> mod, Ptr<KernelDefinitions.kernel_param> kparam, @Unsigned int num_params) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction(value="module_patient_check_exists((const u8*)$arg1, $arg2)")
    public static int module_patient_check_exists(String name, misc.fail_dup_mod_reason reason) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void module_put(Ptr<runtime.module> module2) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int module_refcount(Ptr<runtime.module> mod) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void module_unload_free(Ptr<runtime.module> mod) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction(value="module_address_lookup($arg1, $arg2, $arg3, $arg4, (const u8**)$arg5, $arg6)")
    public static int module_address_lookup(@Unsigned long addr2, Ptr<@Unsigned Long> size, Ptr<@Unsigned Long> offset, Ptr<String> modname, Ptr<String> modbuildid, String namebuf) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void module_bug_cleanup(Ptr<runtime.module> mod) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction(value="module_bug_finalize((const elf64_hdr*)$arg1, (const elf64_shdr*)$arg2, $arg3)")
    public static void module_bug_finalize(Ptr<@OriginalName(value="Elf64_Ehdr") misc.elf64_hdr> hdr, Ptr<@OriginalName(value="Elf64_Shdr") misc.elf64_shdr> sechdrs, Ptr<runtime.module> mod) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction(value="module_decompress($arg1, (const void*)$arg2, $arg3)")
    public static int module_decompress(Ptr<LoadDefinitions.load_info> info2, Ptr<?> buf, @Unsigned long size) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void module_decompress_cleanup(Ptr<LoadDefinitions.load_info> info2) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int module_decompress_sysfs_init() {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction(value="module_enable_data_nx((const struct module*)$arg1)")
    public static int module_enable_data_nx(Ptr<runtime.module> mod) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction(value="module_enable_rodata_ro((const struct module*)$arg1, $arg2)")
    public static int module_enable_rodata_ro(Ptr<runtime.module> mod, boolean after_init) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction(value="module_enable_text_rox((const struct module*)$arg1)")
    public static int module_enable_text_rox(Ptr<runtime.module> mod) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int module_enforce_rwx_sections(Ptr<@OriginalName(value="Elf64_Ehdr") misc.elf64_hdr> hdr, Ptr<@OriginalName(value="Elf64_Shdr") misc.elf64_shdr> sechdrs, String secstrings, Ptr<runtime.module> mod) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int module_extend_max_pages(Ptr<LoadDefinitions.load_info> info2, @Unsigned int extent) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction(value="module_fill_reply($arg1, (const struct ethnl_req_info*)$arg2, (const struct ethnl_reply_data*)$arg3)")
    public static int module_fill_reply(Ptr<SkDefinitions.sk_buff> skb, Ptr<EthnlDefinitions.ethnl_req_info> req_base, Ptr<EthnlDefinitions.ethnl_reply_data> reply_base) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction(value="module_flash_fw_schedule($arg1, (const u8*)$arg2, $arg3, $arg4, $arg5)")
    public static int module_flash_fw_schedule(Ptr<NetDefinitions.net_device> dev, String file_name, Ptr<EthtoolDefinitions.ethtool_module_fw_flash_params> params, Ptr<SkDefinitions.sk_buff> skb, Ptr<GenlDefinitions.genl_info> info2) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void module_flash_fw_work(Ptr<misc.work_struct> work) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int module_get_kallsym(@Unsigned int symnum, Ptr<@Unsigned Long> value, String type2, String name, String module_name, Ptr<Integer> exported) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction(value="module_kallsyms_lookup_name((const u8*)$arg1)")
    public static @Unsigned long module_kallsyms_lookup_name(String name) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction(value="module_kallsyms_on_each_symbol((const u8*)$arg1, (int (*)(void*, const u8*, long unsigned int))$arg2, $arg3)")
    public static int module_kallsyms_on_each_symbol(String modname, Ptr<?> fn, Ptr<?> data) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction(value="module_prepare_data((const struct ethnl_req_info*)$arg1, $arg2, (const struct genl_info*)$arg3)")
    public static int module_prepare_data(Ptr<EthnlDefinitions.ethnl_req_info> req_base, Ptr<EthnlDefinitions.ethnl_reply_data> reply_base, Ptr<GenlDefinitions.genl_info> info2) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction(value="module_reply_size((const struct ethnl_req_info*)$arg1, (const struct ethnl_reply_data*)$arg2)")
    public static int module_reply_size(Ptr<EthnlDefinitions.ethnl_req_info> req_base, Ptr<EthnlDefinitions.ethnl_reply_data> reply_base) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction(value="module_set_memory((const struct module*)$arg1, $arg2, (int (*)(long unsigned int, int))$arg3)")
    public static int module_set_memory(Ptr<runtime.module> mod, ModDefinitions.mod_mem_type type2, Ptr<?> set_memory) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int module_trace_bprintk_format_notify(Ptr<misc.notifier_block> self, @Unsigned long val, Ptr<?> data) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction(value="module_zstd_decompress($arg1, (const void*)$arg2, $arg3)")
    public static @OriginalName(value="ssize_t") long module_zstd_decompress(Ptr<LoadDefinitions.load_info> info2, Ptr<?> buf, @Unsigned long size) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction(value="module_add_driver($arg1, (const struct device_driver*)$arg2)")
    public static int module_add_driver(Ptr<runtime.module> mod, Ptr<DeviceDefinitions.device_driver> drv) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int module_add_modinfo_attrs(Ptr<runtime.module> mod) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int module_event(Ptr<misc.notifier_block> self, @Unsigned long val, Ptr<?> data) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction(value="module_remove_driver((const struct device_driver*)$arg1)")
    public static void module_remove_driver(Ptr<DeviceDefinitions.device_driver> drv) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void module_remove_modinfo_attrs(Ptr<runtime.module> mod, int end) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static @OriginalName(value="ssize_t") long module_sect_read(Ptr<runtime.file> file2, Ptr<runtime.kobject> kobj, Ptr<misc.bin_attribute> battr, String buf, @OriginalName(value="loff_t") long pos, @Unsigned long count) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int module_sig_check(Ptr<LoadDefinitions.load_info> info2, int flags) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static boolean module_is_ready(char data) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction(value="module_layout($arg1, $arg2, $arg3, $arg4, (struct tracepoint**)$arg5)")
    public static void module_layout(Ptr<runtime.module> mod, Ptr<misc.modversion_info> ver, Ptr<KernelDefinitions.kernel_param> kp, Ptr<KernelDefinitions.kernel_symbol> ks, Ptr<Ptr<runtime.tracepoint>> tp) {
        throw new MethodIsBPFRelatedFunction();
    }

    @Type(noCCodeGeneration=true, cType="struct module_sect_attr")
    @NotUsableInJava
    public static class module_sect_attr
    extends Struct {
        public misc.bin_attribute battr;
        public @Unsigned long address;
    }

    @Type(noCCodeGeneration=true, cType="struct module_notes_attrs")
    @NotUsableInJava
    public static class module_notes_attrs
    extends Struct {
        public Ptr<runtime.kobject> dir;
        public @Unsigned int notes;
        public misc.bin_attribute @Size(value=0) [] attrs;
    }

    @Type(noCCodeGeneration=true, cType="struct module_sect_attrs")
    @NotUsableInJava
    public static class module_sect_attrs
    extends Struct {
        public AttributeDefinitions.attribute_group grp;
        public @Unsigned int nsections;
        public module_sect_attr @Size(value=0) [] attrs;
    }

    @Type(noCCodeGeneration=true, cType="struct module_reply_data")
    @NotUsableInJava
    public static class module_reply_data
    extends Struct {
        public EthnlDefinitions.ethnl_reply_data base;
        public EthtoolDefinitions.ethtool_module_power_mode_params power;
    }

    @Type(noCCodeGeneration=true, cType="struct module_param_attrs")
    @NotUsableInJava
    public static class module_param_attrs
    extends Struct {
        public @Unsigned int num;
        public AttributeDefinitions.attribute_group grp;
        public ParamDefinitions.param_attribute @Size(value=0) [] attrs;
    }

    @Type(noCCodeGeneration=true, cType="struct module_signature")
    @NotUsableInJava
    public static class module_signature
    extends Struct {
        public char algo;
        public char hash;
        public char id_type;
        public char signer_len;
        public char key_id_len;
        public char @Size(value=3) [] __pad;
        public @Unsigned @OriginalName(value="__be32") int sig_len;
    }

    @Type(noCCodeGeneration=true, cType="struct module_version_attribute")
    @NotUsableInJava
    public static class module_version_attribute
    extends Struct {
        public module_attribute mattr;
        public String module_name;
        public String version;
    }

    @Type(noCCodeGeneration=true, cType="struct module_string")
    @NotUsableInJava
    public static class module_string
    extends Struct {
        public ListDefinitions.list_head next;
        public Ptr<runtime.module> module;
        public String str;
    }

    @Type(noCCodeGeneration=true, cType="struct { u8 *name; }")
    @NotUsableInJava
    public static class module_of_anon_member_of_audit_context
    extends Struct {
        public String name;
    }

    @Type(noCCodeGeneration=true, cType="struct module_use")
    @NotUsableInJava
    public static class module_use
    extends Struct {
        public ListDefinitions.list_head source_list;
        public ListDefinitions.list_head target_list;
        public Ptr<runtime.module> source;
        public Ptr<runtime.module> target;
    }

    @Type(noCCodeGeneration=true, cType="struct module_memory")
    @NotUsableInJava
    public static class module_memory
    extends Struct {
        public Ptr<?> base;
        public @Unsigned int size;
        public ModDefinitions.mod_tree_node mtn;
    }

    @Type(noCCodeGeneration=true, cType="enum module_state")
    public static enum module_state implements Enum<module_state>,
    TypedEnum<module_state, Integer>
    {
        MODULE_STATE_LIVE,
        MODULE_STATE_COMING,
        MODULE_STATE_GOING,
        MODULE_STATE_UNFORMED;

    }

    @Type(noCCodeGeneration=true, cType="struct module_attribute")
    @NotUsableInJava
    public static class module_attribute
    extends Struct {
        public runtime.attribute attr;
        public Ptr<?> show;
        public Ptr<?> store;
        public Ptr<?> setup;
        public Ptr<?> test;
        public Ptr<?> free;
    }

    @Type(noCCodeGeneration=true, cType="struct module_kobject")
    @NotUsableInJava
    public static class module_kobject
    extends Struct {
        public runtime.kobject kobj;
        public Ptr<runtime.module> mod;
        public Ptr<runtime.kobject> drivers_dir;
        public Ptr<module_param_attrs> mp;
        public Ptr<runtime.completion> kobj_completion;
    }
}

