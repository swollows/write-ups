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
import me.bechberger.ebpf.runtime.DmDefinitions;
import me.bechberger.ebpf.runtime.LockDefinitions;
import me.bechberger.ebpf.runtime.MemDefinitions;
import me.bechberger.ebpf.runtime.NetDefinitions;
import me.bechberger.ebpf.runtime.PciDefinitions;
import me.bechberger.ebpf.runtime.PerfDefinitions;
import me.bechberger.ebpf.runtime.TargetDefinitions;
import me.bechberger.ebpf.runtime.misc;
import me.bechberger.ebpf.runtime.runtime;
import me.bechberger.ebpf.type.Ptr;
import me.bechberger.ebpf.type.Struct;

public final class ListDefinitions {
    @NotUsableInJava
    @BuiltinBPFFunction
    public static void list_get_page(Ptr<runtime.dpages> dp, Ptr<Ptr<runtime.page>> p, Ptr<@Unsigned Long> len, Ptr<@Unsigned Integer> offset) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void list_next_page(Ptr<runtime.dpages> dp) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void list_add_sorted(Ptr<PciDefinitions.pci_mmcfg_region> _new) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int __list_lru_init(Ptr<list_lru> lru, boolean memcg_aware, Ptr<LockDefinitions.lock_class_key> key2, Ptr<runtime.shrinker> shrinker2) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static @Unsigned long __list_lru_walk_one(Ptr<list_lru> lru, int nid, int memcg_idx, @OriginalName(value="list_lru_walk_cb") Ptr<?> isolate, Ptr<?> cb_arg, Ptr<@Unsigned Long> nr_to_walk) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction(value="__list_versions($arg1, $arg2, (const u8*)$arg3)")
    public static int __list_versions(Ptr<DmDefinitions.dm_ioctl> param2, @Unsigned long param_size, String name) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int list_devices(Ptr<runtime.file> filp, Ptr<DmDefinitions.dm_ioctl> param2, @Unsigned long param_size) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static boolean list_lru_add(Ptr<list_lru> lru, Ptr<list_head> item, int nid, Ptr<MemDefinitions.mem_cgroup> memcg) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static boolean list_lru_add_obj(Ptr<list_lru> lru, Ptr<list_head> item) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static @Unsigned long list_lru_count_node(Ptr<list_lru> lru, int nid) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static @Unsigned long list_lru_count_one(Ptr<list_lru> lru, int nid, Ptr<MemDefinitions.mem_cgroup> memcg) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static boolean list_lru_del(Ptr<list_lru> lru, Ptr<list_head> item, int nid, Ptr<MemDefinitions.mem_cgroup> memcg) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static boolean list_lru_del_obj(Ptr<list_lru> lru, Ptr<list_head> item) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void list_lru_destroy(Ptr<list_lru> lru) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void list_lru_isolate(Ptr<list_lru_one> list, Ptr<list_head> item) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void list_lru_isolate_move(Ptr<list_lru_one> list, Ptr<list_head> item, Ptr<list_head> head) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static @Unsigned long list_lru_walk_node(Ptr<list_lru> lru, int nid, @OriginalName(value="list_lru_walk_cb") Ptr<?> isolate, Ptr<?> cb_arg, Ptr<@Unsigned Long> nr_to_walk) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static @Unsigned long list_lru_walk_one(Ptr<list_lru> lru, int nid, Ptr<MemDefinitions.mem_cgroup> memcg, @OriginalName(value="list_lru_walk_cb") Ptr<?> isolate, Ptr<?> cb_arg, Ptr<@Unsigned Long> nr_to_walk) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static @Unsigned long list_lru_walk_one_irq(Ptr<list_lru> lru, int nid, Ptr<MemDefinitions.mem_cgroup> memcg, @OriginalName(value="list_lru_walk_cb") Ptr<?> isolate, Ptr<?> cb_arg, Ptr<@Unsigned Long> nr_to_walk) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void list_netdevice(Ptr<NetDefinitions.net_device> dev) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void list_sort(Ptr<?> priv, Ptr<list_head> head, @OriginalName(value="list_cmp_func_t") Ptr<?> cmp) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void list_version_get_info(Ptr<TargetDefinitions.target_type> tt, Ptr<?> param2) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void list_version_get_needed(Ptr<TargetDefinitions.target_type> tt, Ptr<?> needed_param) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int list_versions(Ptr<runtime.file> filp, Ptr<DmDefinitions.dm_ioctl> param2, @Unsigned long param_size) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void list_add_event(Ptr<PerfDefinitions.perf_event> event2, Ptr<PerfDefinitions.perf_event_context> ctx) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int list_bdev_fs_names(String buf, @Unsigned long size) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void list_del_event(Ptr<PerfDefinitions.perf_event> event2, Ptr<PerfDefinitions.perf_event_context> ctx) {
        throw new MethodIsBPFRelatedFunction();
    }

    @Type(noCCodeGeneration=true, cType="struct { struct list_head gpuva; struct { struct list_head gem; struct list_head extobj; struct list_head evict; } entry; }")
    @NotUsableInJava
    public static class list_of_drm_gpuvm_bo
    extends Struct {
        public list_head gpuva;
        public misc.entry_of_list_of_drm_gpuvm_bo entry;
    }

    @Type(noCCodeGeneration=true, cType="struct list_lru_memcg_table")
    @NotUsableInJava
    public static class list_lru_memcg_table
    extends Struct {
        public Ptr<list_lru_memcg> mlru;
        public Ptr<MemDefinitions.mem_cgroup> memcg;
    }

    @Type(noCCodeGeneration=true, cType="struct list_lru_memcg")
    @NotUsableInJava
    public static class list_lru_memcg
    extends Struct {
        public misc.callback_head rcu;
        public list_lru_one @Size(value=0) [] node;
    }

    @Type(noCCodeGeneration=true, cType="struct { short unsigned int reserved; unsigned int enabled; unsigned int disabled; }")
    @NotUsableInJava
    public static class list_activities_of_anon_member_of_ec_response_motion_sense
    extends Struct {
        public @Unsigned @OriginalName(value="uint16_t") short reserved;
        public @Unsigned @OriginalName(value="uint32_t") int enabled;
        public @Unsigned @OriginalName(value="uint32_t") int disabled;
    }

    @Type(noCCodeGeneration=true, cType="struct list_lru_node")
    @NotUsableInJava
    public static class list_lru_node
    extends Struct {
        public  @OriginalName(value="spinlock_t") runtime.spinlock lock;
        public list_lru_one lru;
        public long nr_items;
    }

    @Type(noCCodeGeneration=true, cType="struct list_lru_one")
    @NotUsableInJava
    public static class list_lru_one
    extends Struct {
        public list_head list;
        public long nr_items;
    }

    @Type(noCCodeGeneration=true, cType="struct list_lru")
    @NotUsableInJava
    public static class list_lru
    extends Struct {
        public Ptr<list_lru_node> node;
        public list_head list;
        public int shrinker_id;
        public boolean memcg_aware;
        public runtime.xarray xa;
    }

    @Type(noCCodeGeneration=true, cType="struct list_head")
    @NotUsableInJava
    public static class list_head
    extends Struct {
        public Ptr<list_head> next;
        public Ptr<list_head> prev;
    }
}

