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
import me.bechberger.ebpf.runtime.EfiDefinitions;
import me.bechberger.ebpf.runtime.ListDefinitions;
import me.bechberger.ebpf.runtime.misc;
import me.bechberger.ebpf.runtime.runtime;
import me.bechberger.ebpf.type.Ptr;
import me.bechberger.ebpf.type.Struct;

public final class EfivarDefinitions {
    @NotUsableInJava
    @BuiltinBPFFunction
    public static @Unsigned long efivar_reserved_space() {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static @Unsigned @OriginalName(value="efi_status_t") long efivar_get_next_variable(Ptr<@Unsigned Long> name_size, Ptr<@Unsigned @OriginalName(value="efi_char16_t") Short> name, Ptr<@OriginalName(value="efi_guid_t") misc.uuid_t> vendor) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static @Unsigned @OriginalName(value="efi_status_t") long efivar_get_variable(Ptr<@Unsigned @OriginalName(value="efi_char16_t") Short> name, Ptr<@OriginalName(value="efi_guid_t") misc.uuid_t> vendor, Ptr<@Unsigned Integer> attr2, Ptr<@Unsigned Long> size, Ptr<?> data) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static boolean efivar_is_available() {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int efivar_lock() {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static @Unsigned @OriginalName(value="efi_status_t") long efivar_query_variable_info(@Unsigned int attr2, Ptr<@Unsigned Long> storage_space, Ptr<@Unsigned Long> remaining_space, Ptr<@Unsigned Long> max_variable_size) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static @Unsigned @OriginalName(value="efi_status_t") long efivar_set_variable(Ptr<@Unsigned @OriginalName(value="efi_char16_t") Short> name, Ptr<@OriginalName(value="efi_guid_t") misc.uuid_t> vendor, @Unsigned int attr2, @Unsigned long data_size, Ptr<?> data) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static @Unsigned @OriginalName(value="efi_status_t") long efivar_set_variable_locked(Ptr<@Unsigned @OriginalName(value="efi_char16_t") Short> name, Ptr<@OriginalName(value="efi_guid_t") misc.uuid_t> vendor, @Unsigned int attr2, @Unsigned long data_size, Ptr<?> data, boolean nonblocking) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static boolean efivar_supports_writes() {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int efivar_trylock() {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void efivar_unlock() {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void __efivar_entry_add(Ptr<efivar_entry> entry, Ptr<ListDefinitions.list_head> head) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int __efivar_entry_get(Ptr<efivar_entry> entry, Ptr<@Unsigned Integer> attributes, Ptr<@Unsigned Long> size, Ptr<?> data) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int efivar_entry_add(Ptr<efivar_entry> entry, Ptr<ListDefinitions.list_head> head) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int efivar_entry_delete(Ptr<efivar_entry> entry) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int efivar_entry_get(Ptr<efivar_entry> entry, Ptr<@Unsigned Integer> attributes, Ptr<@Unsigned Long> size, Ptr<?> data) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction(value="efivar_entry_iter((int (*)(struct efivar_entry*, void*))$arg1, $arg2, $arg3)")
    public static int efivar_entry_iter(Ptr<?> func, Ptr<ListDefinitions.list_head> head, Ptr<?> data) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void efivar_entry_remove(Ptr<efivar_entry> entry) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int efivar_entry_set_get_size(Ptr<efivar_entry> entry, @Unsigned int attributes, Ptr<@Unsigned Long> size, Ptr<?> data, Ptr<@OriginalName(value="bool") Boolean> set) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int efivar_entry_size(Ptr<efivar_entry> entry, Ptr<@Unsigned Long> size) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction(value="efivar_init((int (*)(short unsigned int*, struct {\n  u8 b[16];\n}, long unsigned int, void*, struct list_head*))$arg1, $arg2, $arg3)")
    public static int efivar_init(Ptr<?> func, Ptr<?> data, Ptr<ListDefinitions.list_head> head) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int efivar_ssdt_load() {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int efivar_ssdt_setup(String str) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static boolean efivar_validate(@OriginalName(value="efi_guid_t") misc.uuid_t vendor, Ptr<@Unsigned @OriginalName(value="efi_char16_t") Short> var_name, Ptr<Character> data, @Unsigned long data_size) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction(value="efivar_variable_is_removable($arg1, (const u8*)$arg2, $arg3)")
    public static boolean efivar_variable_is_removable(@OriginalName(value="efi_guid_t") misc.uuid_t vendor, String var_name, @Unsigned long len) {
        throw new MethodIsBPFRelatedFunction();
    }

    @Type(noCCodeGeneration=true, cType="struct efivar_operations")
    @NotUsableInJava
    public static class efivar_operations
    extends Struct {
        public Ptr<?> get_variable;
        public Ptr<?> get_next_variable;
        public Ptr<?> set_variable;
        public Ptr<?> set_variable_nonblocking;
        public Ptr<?> query_variable_store;
        public Ptr<?> query_variable_info;
    }

    @Type(noCCodeGeneration=true, cType="struct efivar_entry")
    @NotUsableInJava
    public static class efivar_entry
    extends Struct {
        public EfiDefinitions.efi_variable var;
        public ListDefinitions.list_head list;
        public runtime.kobject kobj;
    }
}

