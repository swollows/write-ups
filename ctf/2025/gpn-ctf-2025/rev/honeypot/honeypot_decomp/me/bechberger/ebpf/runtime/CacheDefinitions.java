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
import me.bechberger.ebpf.runtime.AttributeDefinitions;
import me.bechberger.ebpf.runtime.DeviceDefinitions;
import me.bechberger.ebpf.runtime.DmarDefinitions;
import me.bechberger.ebpf.runtime.IntelDefinitions;
import me.bechberger.ebpf.runtime.KmemDefinitions;
import me.bechberger.ebpf.runtime.ListDefinitions;
import me.bechberger.ebpf.runtime.SquashfsDefinitions;
import me.bechberger.ebpf.runtime.TraceDefinitions;
import me.bechberger.ebpf.runtime.misc;
import me.bechberger.ebpf.runtime.runtime;
import me.bechberger.ebpf.type.Enum;
import me.bechberger.ebpf.type.Ptr;
import me.bechberger.ebpf.type.Struct;
import me.bechberger.ebpf.type.TypedEnum;

public final class CacheDefinitions {
    @NotUsableInJava
    @BuiltinBPFFunction
    public static @OriginalName(value="ssize_t") long cache_dma_show(Ptr<KmemDefinitions.kmem_cache> s2, String buf) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static @OriginalName(value="ssize_t") long cache_type_show(Ptr<runtime.device> dev, Ptr<DeviceDefinitions.device_attribute> attr2, String buf) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction(value="cache_type_store($arg1, $arg2, (const u8*)$arg3, $arg4)")
    public static @OriginalName(value="ssize_t") long cache_type_store(Ptr<runtime.device> dev, Ptr<DeviceDefinitions.device_attribute> attr2, String buf, @Unsigned long count) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int cache_add_dev(@Unsigned int cpu2) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static @Unsigned @OriginalName(value="umode_t") short cache_default_attrs_is_visible(Ptr<runtime.kobject> kobj, Ptr<runtime.attribute> attr2, int unused) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction(value="((const struct attribute_group*)cache_get_priv_group($arg1))")
    public static Ptr<AttributeDefinitions.attribute_group> cache_get_priv_group(Ptr<runtime.cacheinfo> this_leaf) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction(value="cache_mod($arg1, (const u8*)$arg2, $arg3, $arg4)")
    public static int cache_mod(Ptr<TraceDefinitions.trace_array> tr, String func, String module2, int enable) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int cache_setup_acpi(@Unsigned int cpu2) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void cache_shared_cpu_map_remove(@Unsigned int cpu2) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int cache_shared_cpu_map_setup(@Unsigned int cpu2) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int __cache_amd_cpumap_setup(@Unsigned int cpu2, int index2, Ptr<misc._cpuid4_info_regs> base) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void __cache_cpumap_setup(@Unsigned int cpu2, int index2, Ptr<misc._cpuid4_info_regs> base) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int cache_ap_offline(@Unsigned int cpu2) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int cache_ap_online(@Unsigned int cpu2) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int cache_ap_register() {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void cache_aps_init() {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void cache_bp_init() {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void cache_bp_restore() {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void cache_cpu_init() {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void cache_disable() {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static @OriginalName(value="ssize_t") long cache_disable_0_show(Ptr<runtime.device> dev, Ptr<DeviceDefinitions.device_attribute> attr2, String buf) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction(value="cache_disable_0_store($arg1, $arg2, (const u8*)$arg3, $arg4)")
    public static @OriginalName(value="ssize_t") long cache_disable_0_store(Ptr<runtime.device> dev, Ptr<DeviceDefinitions.device_attribute> attr2, String buf, @Unsigned long count) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static @OriginalName(value="ssize_t") long cache_disable_1_show(Ptr<runtime.device> dev, Ptr<DeviceDefinitions.device_attribute> attr2, String buf) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction(value="cache_disable_1_store($arg1, $arg2, (const u8*)$arg3, $arg4)")
    public static @OriginalName(value="ssize_t") long cache_disable_1_store(Ptr<runtime.device> dev, Ptr<DeviceDefinitions.device_attribute> attr2, String buf, @Unsigned long count) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void cache_enable() {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void cache_finish_page(Ptr<SquashfsDefinitions.squashfs_page_actor> actor) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static Ptr<?> cache_first_page(Ptr<SquashfsDefinitions.squashfs_page_actor> actor) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static Ptr<?> cache_next_page(Ptr<SquashfsDefinitions.squashfs_page_actor> actor) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static @Unsigned @OriginalName(value="umode_t") short cache_private_attrs_is_visible(Ptr<runtime.kobject> kobj, Ptr<runtime.attribute> attr2, int unused) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int cache_rendezvous_handler(Ptr<?> unused) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int cache_tag_assign(Ptr<DmarDefinitions.dmar_domain> domain, @Unsigned short did, Ptr<runtime.device> dev, @Unsigned @OriginalName(value="ioasid_t") int pasid, cache_tag_type type2) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int cache_tag_assign_domain(Ptr<DmarDefinitions.dmar_domain> domain, Ptr<runtime.device> dev, @Unsigned @OriginalName(value="ioasid_t") int pasid) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void cache_tag_flush_all(Ptr<DmarDefinitions.dmar_domain> domain) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void cache_tag_flush_devtlb_psi(Ptr<DmarDefinitions.dmar_domain> domain, Ptr<cache_tag> tag, @Unsigned long addr2, @Unsigned long mask) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void cache_tag_flush_iotlb(Ptr<DmarDefinitions.dmar_domain> domain, Ptr<cache_tag> tag, @Unsigned long addr2, @Unsigned long pages, @Unsigned long mask, int ih) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void cache_tag_flush_range(Ptr<DmarDefinitions.dmar_domain> domain, @Unsigned long start, @Unsigned long end, int ih) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void cache_tag_flush_range_np(Ptr<DmarDefinitions.dmar_domain> domain, @Unsigned long start, @Unsigned long end) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void cache_tag_unassign(Ptr<DmarDefinitions.dmar_domain> domain, @Unsigned short did, Ptr<runtime.device> dev, @Unsigned @OriginalName(value="ioasid_t") int pasid, cache_tag_type type2) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void cache_tag_unassign_domain(Ptr<DmarDefinitions.dmar_domain> domain, Ptr<runtime.device> dev, @Unsigned @OriginalName(value="ioasid_t") int pasid) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int cache_random_seq_create(Ptr<KmemDefinitions.kmem_cache> cachep, @Unsigned int count, @Unsigned @OriginalName(value="gfp_t") int gfp) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void cache_random_seq_destroy(Ptr<KmemDefinitions.kmem_cache> cachep) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void cache_requested_key(Ptr<runtime.key> key2) {
        throw new MethodIsBPFRelatedFunction();
    }

    @Type(noCCodeGeneration=true, cType="enum _cache_type")
    public static enum _cache_type implements Enum<_cache_type>,
    TypedEnum<_cache_type, Integer>
    {
        CTYPE_NULL,
        CTYPE_DATA,
        CTYPE_INST,
        CTYPE_UNIFIED;

    }

    @Type(noCCodeGeneration=true, cType="struct _cache_table")
    @NotUsableInJava
    public static class _cache_table
    extends Struct {
        public char descriptor;
        public char cache_type;
        public short size;
    }

    @Type(noCCodeGeneration=true, cType="struct cache_tag")
    @NotUsableInJava
    public static class cache_tag
    extends Struct {
        public ListDefinitions.list_head node;
        public cache_tag_type type;
        public Ptr<IntelDefinitions.intel_iommu> iommu;
        public Ptr<runtime.device> dev;
        public @Unsigned short domain_id;
        public @Unsigned @OriginalName(value="ioasid_t") int pasid;
        public @Unsigned int users;
    }

    @Type(noCCodeGeneration=true, cType="enum cache_tag_type")
    public static enum cache_tag_type implements Enum<cache_tag_type>,
    TypedEnum<cache_tag_type, Integer>
    {
        CACHE_TAG_IOTLB,
        CACHE_TAG_DEVTLB,
        CACHE_TAG_NESTING_IOTLB,
        CACHE_TAG_NESTING_DEVTLB;

    }

    @Type(noCCodeGeneration=true, cType="enum cache_write_policy")
    public static enum cache_write_policy implements Enum<cache_write_policy>,
    TypedEnum<cache_write_policy, Integer>
    {
        NODE_CACHE_WRITE_BACK,
        NODE_CACHE_WRITE_THROUGH,
        NODE_CACHE_WRITE_OTHER;

    }

    @Type(noCCodeGeneration=true, cType="enum cache_indexing")
    public static enum cache_indexing implements Enum<cache_indexing>,
    TypedEnum<cache_indexing, Integer>
    {
        NODE_CACHE_DIRECT_MAP,
        NODE_CACHE_INDEXED,
        NODE_CACHE_OTHER;

    }

    @Type(noCCodeGeneration=true, cType="struct cache_deferred_req")
    @NotUsableInJava
    public static class cache_deferred_req
    extends Struct {
        public misc.hlist_node hash;
        public ListDefinitions.list_head recent;
        public Ptr<cache_head> item;
        public Ptr<?> owner;
        public Ptr<?> revisit;
    }

    @Type(noCCodeGeneration=true, cType="struct cache_req")
    @NotUsableInJava
    public static class cache_req
    extends Struct {
        public Ptr<?> defer;
        public @Unsigned long thread_wait;
    }

    @Type(noCCodeGeneration=true, cType="struct cache_head")
    @NotUsableInJava
    public static class cache_head
    extends Struct {
        public misc.hlist_node cache_list;
        public @OriginalName(value="time64_t") long expiry_time;
        public @OriginalName(value="time64_t") long last_refresh;
        public runtime.kref ref;
        public @Unsigned long flags;
    }

    @Type(noCCodeGeneration=true, cType="enum cache_type")
    public static enum cache_type implements Enum<cache_type>,
    TypedEnum<cache_type, Integer>
    {
        CACHE_TYPE_NOCACHE,
        CACHE_TYPE_INST,
        CACHE_TYPE_DATA,
        CACHE_TYPE_SEPARATE,
        CACHE_TYPE_UNIFIED;

    }

    @Type(noCCodeGeneration=true, cType="struct cache_map")
    @NotUsableInJava
    public static class cache_map
    extends Struct {
        public @Unsigned long start;
        public @Unsigned long end;
        public @Unsigned long flags;
        public @Unsigned long type;
        public @Unsigned long fixed;
    }
}

