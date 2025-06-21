/*
 * Decompiled with CFR 0.153-SNAPSHOT (d6f6758-dirty).
 */
package me.bechberger.ebpf.runtime;

import me.bechberger.ebpf.annotations.InlineUnion;
import me.bechberger.ebpf.annotations.OriginalName;
import me.bechberger.ebpf.annotations.OriginalNames;
import me.bechberger.ebpf.annotations.Type;
import me.bechberger.ebpf.annotations.Unsigned;
import me.bechberger.ebpf.annotations.bpf.BuiltinBPFFunction;
import me.bechberger.ebpf.annotations.bpf.MethodIsBPFRelatedFunction;
import me.bechberger.ebpf.annotations.bpf.NotUsableInJava;
import me.bechberger.ebpf.runtime.KeyDefinitions;
import me.bechberger.ebpf.runtime.SeqDefinitions;
import me.bechberger.ebpf.runtime.misc;
import me.bechberger.ebpf.runtime.runtime;
import me.bechberger.ebpf.type.Ptr;
import me.bechberger.ebpf.type.Struct;

public final class KeyringDefinitions {
    @NotUsableInJava
    @BuiltinBPFFunction(value="keyring_alloc((const u8*)$arg1, $arg2, $arg3, (const struct cred*)$arg4, $arg5, $arg6, $arg7, $arg8)")
    public static Ptr<runtime.key> keyring_alloc(String description, misc.kuid_t uid, misc.kgid_t gid, Ptr<runtime.cred> cred2, @Unsigned @OriginalName(value="key_perm_t") int perm, @Unsigned long flags, Ptr<KeyDefinitions.key_restriction> restrict_link, Ptr<runtime.key> dest) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int keyring_clear(Ptr<runtime.key> keyring) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction(value="keyring_compare_object((const void*)$arg1, (const void*)$arg2)")
    public static boolean keyring_compare_object(Ptr<?> object, Ptr<?> data) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction(value="keyring_describe((const struct key*)$arg1, $arg2)")
    public static void keyring_describe(Ptr<runtime.key> keyring, Ptr<SeqDefinitions.seq_file> m) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void keyring_destroy(Ptr<runtime.key> keyring) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int keyring_detect_cycle(Ptr<runtime.key> A, Ptr<runtime.key> B) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction(value="keyring_detect_cycle_iterator((const void*)$arg1, $arg2)")
    public static int keyring_detect_cycle_iterator(Ptr<?> object, Ptr<?> iterator_data) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction(value="keyring_diff_objects((const void*)$arg1, (const void*)$arg2)")
    public static int keyring_diff_objects(Ptr<?> object, Ptr<?> data) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void keyring_free_object(Ptr<?> object) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void keyring_free_preparse(Ptr<KeyDefinitions.key_preparsed_payload> prep) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void keyring_gc(Ptr<runtime.key> keyring, @OriginalName(value="time64_t") long limit) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction(value="keyring_gc_check_iterator((const void*)$arg1, $arg2)")
    public static int keyring_gc_check_iterator(Ptr<?> object, Ptr<?> iterator_data) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static boolean keyring_gc_select_iterator(Ptr<?> object, Ptr<?> iterator_data) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction(value="keyring_get_key_chunk((const void*)$arg1, $arg2)")
    public static @Unsigned long keyring_get_key_chunk(Ptr<?> data, int level) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction(value="keyring_get_object_key_chunk((const void*)$arg1, $arg2)")
    public static @Unsigned long keyring_get_object_key_chunk(Ptr<?> object, int level) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int keyring_instantiate(Ptr<runtime.key> keyring, Ptr<KeyDefinitions.key_preparsed_payload> prep) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int keyring_preparse(Ptr<KeyDefinitions.key_preparsed_payload> prep) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction(value="keyring_read((const struct key*)$arg1, $arg2, $arg3)")
    public static long keyring_read(Ptr<runtime.key> keyring, String buffer, @Unsigned long buflen) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction(value="keyring_read_iterator((const void*)$arg1, $arg2)")
    public static int keyring_read_iterator(Ptr<?> object, Ptr<?> data) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction(value="keyring_restrict($arg1, (const u8*)$arg2, (const u8*)$arg3)")
    public static int keyring_restrict(@OriginalNames(value={@OriginalName(value="__key_reference_with_attributes"), @OriginalName(value="__key_reference_with_attributes"), @OriginalName(value="key_ref_t")}) Ptr<?> keyring_ref, String type2, String restriction) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void keyring_restriction_gc(Ptr<runtime.key> keyring, Ptr<KeyDefinitions.key_type> dead_type) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void keyring_revoke(Ptr<runtime.key> keyring) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction(value="keyring_search($arg1, $arg2, (const u8*)$arg3, $arg4)")
    public static @OriginalNames(value={@OriginalName(value="__key_reference_with_attributes"), @OriginalName(value="__key_reference_with_attributes"), @OriginalName(value="key_ref_t")}) Ptr<?> keyring_search(@OriginalNames(value={@OriginalName(value="__key_reference_with_attributes"), @OriginalName(value="__key_reference_with_attributes"), @OriginalName(value="key_ref_t")}) Ptr<?> keyring, Ptr<KeyDefinitions.key_type> type2, String description, boolean recurse) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction(value="keyring_search_iterator((const void*)$arg1, $arg2)")
    public static int keyring_search_iterator(Ptr<?> object, Ptr<?> iterator_data) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static @OriginalNames(value={@OriginalName(value="__key_reference_with_attributes"), @OriginalName(value="__key_reference_with_attributes"), @OriginalName(value="key_ref_t")}) Ptr<?> keyring_search_rcu(@OriginalNames(value={@OriginalName(value="__key_reference_with_attributes"), @OriginalName(value="__key_reference_with_attributes"), @OriginalName(value="key_ref_t")}) Ptr<?> keyring_ref, Ptr<keyring_search_context> ctx) {
        throw new MethodIsBPFRelatedFunction();
    }

    @Type(noCCodeGeneration=true, cType="struct keyring_read_iterator_context")
    @NotUsableInJava
    public static class keyring_read_iterator_context
    extends Struct {
        public @Unsigned long buflen;
        public @Unsigned long count;
        public Ptr<@OriginalName(value="key_serial_t") Integer> buffer;
    }

    @Type(noCCodeGeneration=true, cType="struct keyring_search_context")
    @NotUsableInJava
    public static class keyring_search_context
    extends Struct {
        public keyring_index_key index_key;
        public Ptr<runtime.cred> cred;
        public KeyDefinitions.key_match_data match_data;
        public @Unsigned int flags;
        public Ptr<?> iterator;
        public int skipped_ret;
        public boolean possessed;
        public @OriginalNames(value={@OriginalName(value="__key_reference_with_attributes"), @OriginalName(value="__key_reference_with_attributes"), @OriginalName(value="key_ref_t")}) Ptr<?> result;
        public @OriginalName(value="time64_t") long now;
    }

    @Type(noCCodeGeneration=true, cType="struct keyring_index_key")
    @NotUsableInJava
    public static class keyring_index_key
    extends Struct {
        public @Unsigned long hash;
        @InlineUnion(value=1061)
        public  @InlineUnion(value=1061) AnonDefinitions.anon_member_of_anon_member_of_keyring_index_key anon1$0;
        @InlineUnion(value=1061)
        public @InlineUnion(value=1061) @Unsigned long x;
        public Ptr<KeyDefinitions.key_type> type;
        public Ptr<KeyDefinitions.key_tag> domain_tag;
        public String description;
    }
}

