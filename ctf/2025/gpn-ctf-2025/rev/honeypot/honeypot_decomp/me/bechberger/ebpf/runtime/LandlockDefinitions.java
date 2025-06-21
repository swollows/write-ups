/*
 * Decompiled with CFR 0.153-SNAPSHOT (d6f6758-dirty).
 */
package me.bechberger.ebpf.runtime;

import me.bechberger.ebpf.annotations.InlineUnion;
import me.bechberger.ebpf.annotations.OriginalName;
import me.bechberger.ebpf.annotations.Size;
import me.bechberger.ebpf.annotations.Type;
import me.bechberger.ebpf.annotations.Unsigned;
import me.bechberger.ebpf.annotations.bpf.BuiltinBPFFunction;
import me.bechberger.ebpf.annotations.bpf.MethodIsBPFRelatedFunction;
import me.bechberger.ebpf.annotations.bpf.NotUsableInJava;
import me.bechberger.ebpf.runtime.RbDefinitions;
import me.bechberger.ebpf.runtime.misc;
import me.bechberger.ebpf.runtime.runtime;
import me.bechberger.ebpf.type.Enum;
import me.bechberger.ebpf.type.Ptr;
import me.bechberger.ebpf.type.Struct;
import me.bechberger.ebpf.type.TypedEnum;
import me.bechberger.ebpf.type.Union;

public final class LandlockDefinitions {
    @NotUsableInJava
    @BuiltinBPFFunction
    public static void landlock_add_fs_hooks() {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction(value="landlock_append_fs_rule((const struct landlock_ruleset*)$arg1, (const const struct path*)$arg2, $arg3)")
    public static int landlock_append_fs_rule(Ptr<landlock_ruleset> ruleset, Ptr<runtime.path> path2, @Unsigned @OriginalName(value="access_mask_t") short access_rights) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction(value="landlock_get_fs_access_mask((const const struct landlock_ruleset*)$arg1, (const short unsigned int)$arg2)")
    public static @Unsigned @OriginalName(value="access_mask_t") short landlock_get_fs_access_mask(Ptr<landlock_ruleset> ruleset, @Unsigned short layer_level) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction(value="landlock_get_net_access_mask((const const struct landlock_ruleset*)$arg1, (const short unsigned int)$arg2)")
    public static @Unsigned @OriginalName(value="access_mask_t") short landlock_get_net_access_mask(Ptr<landlock_ruleset> ruleset, @Unsigned short layer_level) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int landlock_init() {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void landlock_add_task_hooks() {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void landlock_add_cred_hooks() {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction(value="landlock_create_object((const const struct landlock_object_underops*)$arg1, (const void*)$arg2)")
    public static Ptr<landlock_object> landlock_create_object(Ptr<landlock_object_underops> underops, Ptr<?> underobj) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction(value="landlock_create_ruleset((const short unsigned int)$arg1, (const short unsigned int)$arg2, (const short unsigned int)$arg3)")
    public static Ptr<landlock_ruleset> landlock_create_ruleset(@Unsigned @OriginalName(value="access_mask_t") short fs_access_mask, @Unsigned @OriginalName(value="access_mask_t") short net_access_mask, @Unsigned @OriginalName(value="access_mask_t") short scope_mask) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction(value="((const struct landlock_rule*)landlock_find_rule((const const struct landlock_ruleset*)$arg1, (const struct landlock_id)$arg2))")
    public static Ptr<landlock_rule> landlock_find_rule(Ptr<landlock_ruleset> ruleset, landlock_id id) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction(value="landlock_init_layer_masks((const const struct landlock_ruleset*)$arg1, (const short unsigned int)$arg2, (const short unsigned int[0]*)$arg3, (const enum landlock_key_type)$arg4)")
    public static @Unsigned @OriginalName(value="access_mask_t") short landlock_init_layer_masks(Ptr<landlock_ruleset> domain, @Unsigned @OriginalName(value="access_mask_t") short access_request, Ptr<@Unsigned @OriginalName(value="layer_mask_t") short @Size(value=0) []> layer_masks, landlock_key_type key_type2) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction(value="landlock_insert_rule((const struct landlock_ruleset*)$arg1, (const struct landlock_id)$arg2, (const short unsigned int)$arg3)")
    public static int landlock_insert_rule(Ptr<landlock_ruleset> ruleset, landlock_id id, @Unsigned @OriginalName(value="access_mask_t") short access2) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction(value="landlock_merge_ruleset((const struct landlock_ruleset*)$arg1, (const struct landlock_ruleset*)$arg2)")
    public static Ptr<landlock_ruleset> landlock_merge_ruleset(Ptr<landlock_ruleset> parent, Ptr<landlock_ruleset> ruleset) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction(value="landlock_put_object((const struct landlock_object*)$arg1)")
    public static void landlock_put_object(Ptr<landlock_object> object) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction(value="landlock_put_ruleset((const struct landlock_ruleset*)$arg1)")
    public static void landlock_put_ruleset(Ptr<landlock_ruleset> ruleset) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction(value="landlock_put_ruleset_deferred((const struct landlock_ruleset*)$arg1)")
    public static void landlock_put_ruleset_deferred(Ptr<landlock_ruleset> ruleset) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction(value="landlock_unmask_layers((const const struct landlock_rule*)$arg1, (const short unsigned int)$arg2, (const short unsigned int[0]*)$arg3, (const long unsigned int)$arg4)")
    public static boolean landlock_unmask_layers(Ptr<landlock_rule> rule, @Unsigned @OriginalName(value="access_mask_t") short access_request, Ptr<@Unsigned @OriginalName(value="layer_mask_t") short @Size(value=0) []> layer_masks, @Unsigned long masks_array_size) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void landlock_add_net_hooks() {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction(value="landlock_append_net_rule((const struct landlock_ruleset*)$arg1, (const short unsigned int)$arg2, $arg3)")
    public static int landlock_append_net_rule(Ptr<landlock_ruleset> ruleset, @Unsigned short port2, @Unsigned @OriginalName(value="access_mask_t") short access_rights) {
        throw new MethodIsBPFRelatedFunction();
    }

    @Type(noCCodeGeneration=true, cType="struct landlock_superblock_security")
    @NotUsableInJava
    public static class landlock_superblock_security
    extends Struct {
        public @OriginalName(value="atomic_long_t") misc.atomic64_t inode_refs;
    }

    @Type(noCCodeGeneration=true, cType="struct landlock_file_security")
    @NotUsableInJava
    public static class landlock_file_security
    extends Struct {
        public @Unsigned @OriginalName(value="access_mask_t") short allowed_access;
        public Ptr<landlock_ruleset> fown_domain;
    }

    @Type(noCCodeGeneration=true, cType="struct landlock_inode_security")
    @NotUsableInJava
    public static class landlock_inode_security
    extends Struct {
        public Ptr<landlock_object> object;
    }

    @Type(noCCodeGeneration=true, cType="struct landlock_net_port_attr")
    @NotUsableInJava
    public static class landlock_net_port_attr
    extends Struct {
        public @Unsigned long allowed_access;
        public @Unsigned long port;
    }

    @Type(noCCodeGeneration=true, cType="struct landlock_path_beneath_attr")
    @NotUsableInJava
    public static class landlock_path_beneath_attr
    extends Struct {
        public @Unsigned long allowed_access;
        public int parent_fd;
    }

    @Type(noCCodeGeneration=true, cType="enum landlock_rule_type")
    public static enum landlock_rule_type implements Enum<landlock_rule_type>,
    TypedEnum<landlock_rule_type, Integer>
    {
        LANDLOCK_RULE_PATH_BENEATH,
        LANDLOCK_RULE_NET_PORT;

    }

    @Type(noCCodeGeneration=true, cType="struct landlock_ruleset_attr")
    @NotUsableInJava
    public static class landlock_ruleset_attr
    extends Struct {
        public @Unsigned long handled_access_fs;
        public @Unsigned long handled_access_net;
        public @Unsigned long scoped;
    }

    @Type(noCCodeGeneration=true, cType="struct landlock_cred_security")
    @NotUsableInJava
    public static class landlock_cred_security
    extends Struct {
        public Ptr<landlock_ruleset> domain;
    }

    @Type(noCCodeGeneration=true, cType="struct landlock_ruleset")
    @NotUsableInJava
    public static class landlock_ruleset
    extends Struct {
        public RbDefinitions.rb_root root_inode;
        public RbDefinitions.rb_root root_net_port;
        public Ptr<landlock_hierarchy> hierarchy;
        @InlineUnion(value=13533)
        public @InlineUnion(value=13533) misc.work_struct work_free;
        @InlineUnion(value=13533)
        public  @InlineUnion(value=13533) AnonDefinitions.anon_member_of_anon_member_of_landlock_ruleset anon3$1;
    }

    @Type(noCCodeGeneration=true, cType="struct landlock_hierarchy")
    @NotUsableInJava
    public static class landlock_hierarchy
    extends Struct {
        public Ptr<landlock_hierarchy> parent;
        public @OriginalName(value="refcount_t") misc.refcount_struct usage;
    }

    @Type(noCCodeGeneration=true, cType="struct landlock_rule")
    @NotUsableInJava
    public static class landlock_rule
    extends Struct {
        public RbDefinitions.rb_node node;
        public landlock_key key;
        public @Unsigned int num_layers;
        public landlock_layer @Size(value=0) [] layers;
    }

    @Type(noCCodeGeneration=true, cType="struct landlock_id")
    @NotUsableInJava
    public static class landlock_id
    extends Struct {
        public landlock_key key;
        public landlock_key_type type;
    }

    @Type(noCCodeGeneration=true, cType="enum landlock_key_type")
    public static enum landlock_key_type implements Enum<landlock_key_type>,
    TypedEnum<landlock_key_type, Integer>
    {
        LANDLOCK_KEY_INODE,
        LANDLOCK_KEY_NET_PORT;

    }

    @Type(noCCodeGeneration=true, cType="union landlock_key")
    @NotUsableInJava
    public static class landlock_key
    extends Union {
        public Ptr<landlock_object> object;
        public @Unsigned @OriginalName(value="uintptr_t") long data;
    }

    @Type(noCCodeGeneration=true, cType="struct landlock_layer")
    @NotUsableInJava
    public static class landlock_layer
    extends Struct {
        public @Unsigned short level;
        public @Unsigned @OriginalName(value="access_mask_t") short access;
    }

    @Type(noCCodeGeneration=true, cType="struct landlock_object")
    @NotUsableInJava
    public static class landlock_object
    extends Struct {
        public @OriginalName(value="refcount_t") misc.refcount_struct usage;
        public  @OriginalName(value="spinlock_t") runtime.spinlock lock;
        public Ptr<?> underobj;
        @InlineUnion(value=13511)
        public @InlineUnion(value=13511) misc.callback_head rcu_free;
        @InlineUnion(value=13511)
        public @InlineUnion(value=13511) Ptr<landlock_object_underops> underops;
    }

    @Type(noCCodeGeneration=true, cType="struct landlock_object_underops")
    @NotUsableInJava
    public static class landlock_object_underops
    extends Struct {
        public Ptr<?> release;
    }
}

