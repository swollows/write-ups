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
import me.bechberger.ebpf.runtime.FtraceDefinitions;
import me.bechberger.ebpf.runtime.ListDefinitions;
import me.bechberger.ebpf.runtime.TaskDefinitions;
import me.bechberger.ebpf.runtime.misc;
import me.bechberger.ebpf.runtime.runtime;
import me.bechberger.ebpf.type.Ptr;
import me.bechberger.ebpf.type.Struct;

public final class KlpDefinitions {
    @NotUsableInJava
    @BuiltinBPFFunction
    public static void __klp_sched_try_switch() {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void __klp_unpatch_object(Ptr<klp_object> obj, boolean nops_only) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void klp_cancel_transition() {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int klp_check_and_switch_task(Ptr<TaskDefinitions.task_struct> task2, Ptr<?> arg2) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void klp_complete_transition() {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void klp_copy_process(Ptr<TaskDefinitions.task_struct> child) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static Ptr<klp_ops> klp_find_ops(Ptr<?> old_func) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void klp_force_transition() {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void klp_ftrace_handler(@Unsigned long ip, @Unsigned long parent_ip, Ptr<FtraceDefinitions.ftrace_ops> fops, Ptr<FtraceDefinitions.ftrace_regs> fregs) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void klp_init_transition(Ptr<klp_patch> patch, int state2) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int klp_patch_func(Ptr<klp_func> func) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int klp_patch_object(Ptr<klp_object> obj) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void klp_post_unpatch_callback(Ptr<klp_object> obj) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void klp_reverse_transition() {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void klp_start_transition() {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void klp_sync(Ptr<misc.work_struct> work) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void klp_transition_work_fn(Ptr<misc.work_struct> work) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void klp_try_complete_transition() {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static boolean klp_try_switch_task(Ptr<TaskDefinitions.task_struct> task2) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void klp_unpatch_object(Ptr<klp_object> obj) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void klp_unpatch_objects(Ptr<klp_patch> patch) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void klp_unpatch_objects_dynamic(Ptr<klp_patch> patch) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void klp_update_patch_state(Ptr<TaskDefinitions.task_struct> task2) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static Ptr<?> __klp_shadow_get_or_alloc(Ptr<?> obj, @Unsigned long id, @Unsigned long size, @Unsigned @OriginalName(value="gfp_t") int gfp_flags, @OriginalName(value="klp_shadow_ctor_t") Ptr<?> ctor, Ptr<?> ctor_data, boolean warn_on_exist) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static Ptr<klp_state> klp_get_prev_state(@Unsigned long id) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static Ptr<klp_state> klp_get_state(Ptr<klp_patch> patch, @Unsigned long id) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static boolean klp_is_patch_compatible(Ptr<klp_patch> patch) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static Ptr<?> klp_shadow_alloc(Ptr<?> obj, @Unsigned long id, @Unsigned long size, @Unsigned @OriginalName(value="gfp_t") int gfp_flags, @OriginalName(value="klp_shadow_ctor_t") Ptr<?> ctor, Ptr<?> ctor_data) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void klp_shadow_free(Ptr<?> obj, @Unsigned long id, @OriginalName(value="klp_shadow_dtor_t") Ptr<?> dtor) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void klp_shadow_free_all(@Unsigned long id, @OriginalName(value="klp_shadow_dtor_t") Ptr<?> dtor) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void klp_shadow_free_struct(Ptr<klp_shadow> shadow, @OriginalName(value="klp_shadow_dtor_t") Ptr<?> dtor) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static Ptr<?> klp_shadow_get(Ptr<?> obj, @Unsigned long id) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static Ptr<?> klp_shadow_get_or_alloc(Ptr<?> obj, @Unsigned long id, @Unsigned long size, @Unsigned @OriginalName(value="gfp_t") int gfp_flags, @OriginalName(value="klp_shadow_ctor_t") Ptr<?> ctor, Ptr<?> ctor_data) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int klp_cond_resched() {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void __klp_free_objects(Ptr<klp_patch> patch, boolean nops_only) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int klp_add_nops(Ptr<klp_patch> patch) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction(value="klp_apply_section_relocs($arg1, $arg2, (const u8*)$arg3, (const u8*)$arg4, $arg5, $arg6, (const u8*)$arg7)")
    public static int klp_apply_section_relocs(Ptr<runtime.module> pmod, Ptr<@OriginalName(value="Elf64_Shdr") misc.elf64_shdr> sechdrs, String shstrtab, String strtab, @Unsigned int symndx, @Unsigned int secndx, String objname) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void klp_cleanup_module_patches_limited(Ptr<runtime.module> mod, Ptr<klp_patch> limit) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void klp_discard_nops(Ptr<klp_patch> new_patch) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int klp_enable_patch(Ptr<klp_patch> patch) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction(value="klp_find_callback($arg1, (const u8*)$arg2, $arg3)")
    public static int klp_find_callback(Ptr<?> data, String name, @Unsigned long addr2) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction(value="klp_find_object_symbol((const u8*)$arg1, (const u8*)$arg2, $arg3, $arg4)")
    public static int klp_find_object_symbol(String objname, String name, @Unsigned long sympos, Ptr<@Unsigned Long> addr2) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void klp_free_patch_async(Ptr<klp_patch> patch) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void klp_free_patch_work_fn(Ptr<misc.work_struct> work) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void klp_free_replaced_patches_async(Ptr<klp_patch> new_patch) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int klp_init() {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int klp_init_object(Ptr<klp_patch> patch, Ptr<klp_object> obj) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int klp_init_object_loaded(Ptr<klp_patch> patch, Ptr<klp_object> obj) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void klp_kobj_release_func(Ptr<runtime.kobject> kobj) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void klp_kobj_release_object(Ptr<runtime.kobject> kobj) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void klp_kobj_release_patch(Ptr<runtime.kobject> kobj) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int klp_match_callback(Ptr<?> data, @Unsigned long addr2) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int klp_module_coming(Ptr<runtime.module> mod) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void klp_module_going(Ptr<runtime.module> mod) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction(value="klp_resolve_symbols($arg1, (const u8*)$arg2, $arg3, $arg4, (const u8*)$arg5)")
    public static int klp_resolve_symbols(Ptr<@OriginalName(value="Elf64_Shdr") misc.elf64_shdr> sechdrs, String strtab, @Unsigned int symndx, Ptr<@OriginalName(value="Elf64_Shdr") misc.elf64_shdr> relasec, String sec_objname) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void klp_unpatch_replaced_patches(Ptr<klp_patch> new_patch) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int klp_write_object_relocs(Ptr<klp_patch> patch, Ptr<klp_object> obj, boolean apply) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction(value="klp_write_section_relocs($arg1, $arg2, (const u8*)$arg3, (const u8*)$arg4, $arg5, $arg6, (const u8*)$arg7, $arg8)")
    public static int klp_write_section_relocs(Ptr<runtime.module> pmod, Ptr<@OriginalName(value="Elf64_Shdr") misc.elf64_shdr> sechdrs, String shstrtab, String strtab, @Unsigned int symndx, @Unsigned int secndx, String objname, boolean apply) {
        throw new MethodIsBPFRelatedFunction();
    }

    @Type(noCCodeGeneration=true, cType="struct klp_shadow")
    @NotUsableInJava
    public static class klp_shadow
    extends Struct {
        public misc.hlist_node node;
        public misc.callback_head callback_head;
        public Ptr<?> obj;
        public @Unsigned long id;
        public char @Size(value=0) [] data;
    }

    @Type(noCCodeGeneration=true, cType="struct klp_ops")
    @NotUsableInJava
    public static class klp_ops
    extends Struct {
        public ListDefinitions.list_head node;
        public ListDefinitions.list_head func_stack;
        public FtraceDefinitions.ftrace_ops fops;
    }

    @Type(noCCodeGeneration=true, cType="struct klp_find_arg")
    @NotUsableInJava
    public static class klp_find_arg
    extends Struct {
        public String name;
        public @Unsigned long addr;
        public @Unsigned long count;
        public @Unsigned long pos;
    }

    @Type(noCCodeGeneration=true, cType="struct klp_patch")
    @NotUsableInJava
    public static class klp_patch
    extends Struct {
        public Ptr<runtime.module> mod;
        public Ptr<klp_object> objs;
        public Ptr<klp_state> states;
        public boolean replace;
        public ListDefinitions.list_head list;
        public runtime.kobject kobj;
        public ListDefinitions.list_head obj_list;
        public boolean enabled;
        public boolean forced;
        public misc.work_struct free_work;
        public runtime.completion finish;
    }

    @Type(noCCodeGeneration=true, cType="struct klp_state")
    @NotUsableInJava
    public static class klp_state
    extends Struct {
        public @Unsigned long id;
        public @Unsigned int version;
        public Ptr<?> data;
    }

    @Type(noCCodeGeneration=true, cType="struct klp_object")
    @NotUsableInJava
    public static class klp_object
    extends Struct {
        public String name;
        public Ptr<klp_func> funcs;
        public klp_callbacks callbacks;
        public runtime.kobject kobj;
        public ListDefinitions.list_head func_list;
        public ListDefinitions.list_head node;
        public Ptr<runtime.module> mod;
        public boolean dynamic;
        public boolean patched;
    }

    @Type(noCCodeGeneration=true, cType="struct klp_callbacks")
    @NotUsableInJava
    public static class klp_callbacks
    extends Struct {
        public Ptr<?> pre_patch;
        public Ptr<?> post_patch;
        public Ptr<?> pre_unpatch;
        public Ptr<?> post_unpatch;
        public boolean post_unpatch_enabled;
    }

    @Type(noCCodeGeneration=true, cType="struct klp_func")
    @NotUsableInJava
    public static class klp_func
    extends Struct {
        public String old_name;
        public Ptr<?> new_func;
        public @Unsigned long old_sympos;
        public Ptr<?> old_func;
        public runtime.kobject kobj;
        public ListDefinitions.list_head node;
        public ListDefinitions.list_head stack_node;
        public @Unsigned long old_size;
        public @Unsigned long new_size;
        public boolean nop;
        public boolean patched;
        public boolean transition;
    }

    @Type(noCCodeGeneration=true, cType="struct klp_modinfo")
    @NotUsableInJava
    public static class klp_modinfo
    extends Struct {
        public @OriginalName(value="Elf64_Ehdr") misc.elf64_hdr hdr;
        public Ptr<@OriginalName(value="Elf64_Shdr") misc.elf64_shdr> sechdrs;
        public String secstrings;
        public @Unsigned int symndx;
    }
}

