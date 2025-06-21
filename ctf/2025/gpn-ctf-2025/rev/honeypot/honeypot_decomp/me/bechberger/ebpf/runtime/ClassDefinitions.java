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
import me.bechberger.ebpf.runtime.CommonDefinitions;
import me.bechberger.ebpf.runtime.DeviceDefinitions;
import me.bechberger.ebpf.runtime.KlistDefinitions;
import me.bechberger.ebpf.runtime.KobjDefinitions;
import me.bechberger.ebpf.runtime.ListDefinitions;
import me.bechberger.ebpf.runtime.RawDefinitions;
import me.bechberger.ebpf.runtime.RqDefinitions;
import me.bechberger.ebpf.runtime.SrcuDefinitions;
import me.bechberger.ebpf.runtime.TaskDefinitions;
import me.bechberger.ebpf.runtime.misc;
import me.bechberger.ebpf.runtime.runtime;
import me.bechberger.ebpf.type.Enum;
import me.bechberger.ebpf.type.Ptr;
import me.bechberger.ebpf.type.Struct;
import me.bechberger.ebpf.type.TypedEnum;

public final class ClassDefinitions {
    @NotUsableInJava
    @BuiltinBPFFunction
    public static @OriginalName(value="ssize_t") long class_attr_show(Ptr<runtime.kobject> kobj, Ptr<runtime.attribute> attr2, String buf) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction(value="class_attr_store($arg1, $arg2, (const u8*)$arg3, $arg4)")
    public static @OriginalName(value="ssize_t") long class_attr_store(Ptr<runtime.kobject> kobj, Ptr<runtime.attribute> attr2, String buf, @Unsigned long count) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction(value="((const struct kobj_ns_type_operations*)class_child_ns_type((const struct kobject*)$arg1))")
    public static Ptr<KobjDefinitions.kobj_ns_type_operations> class_child_ns_type(Ptr<runtime.kobject> kobj) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int class_compat_create_link(Ptr<class_compat> cls, Ptr<runtime.device> dev, Ptr<runtime.device> device_link2) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction(value="class_compat_register((const u8*)$arg1)")
    public static Ptr<class_compat> class_compat_register(String name) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void class_compat_remove_link(Ptr<class_compat> cls, Ptr<runtime.device> dev, Ptr<runtime.device> device_link2) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void class_compat_unregister(Ptr<class_compat> cls) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction(value="class_create((const u8*)$arg1)")
    public static Ptr<runtime._class> class_create(String name) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction(value="class_create_file_ns((const struct class*)$arg1, (const struct class_attribute*)$arg2, (const void*)$arg3)")
    public static int class_create_file_ns(Ptr<runtime._class> cls, Ptr<class_attribute> attr2, Ptr<?> ns) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction(value="class_create_release((const struct class*)$arg1)")
    public static void class_create_release(Ptr<runtime._class> cls) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction(value="class_destroy((const struct class*)$arg1)")
    public static void class_destroy(Ptr<runtime._class> cls) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void class_dev_iter_exit(Ptr<class_dev_iter> iter2) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction(value="class_dev_iter_init($arg1, (const struct class*)$arg2, (const struct device*)$arg3, (const struct device_type*)$arg4)")
    public static void class_dev_iter_init(Ptr<class_dev_iter> iter2, Ptr<runtime._class> _class2, Ptr<runtime.device> start, Ptr<DeviceDefinitions.device_type> type2) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static Ptr<runtime.device> class_dev_iter_next(Ptr<class_dev_iter> iter2) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction(value="class_find_device((const struct class*)$arg1, (const struct device*)$arg2, (const void*)$arg3, $arg4)")
    public static Ptr<runtime.device> class_find_device(Ptr<runtime._class> _class2, Ptr<runtime.device> start, Ptr<?> data, @OriginalName(value="device_match_t") Ptr<?> match) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction(value="class_for_each_device((const struct class*)$arg1, (const struct device*)$arg2, $arg3, (int (*)(struct device*, void*))$arg4)")
    public static int class_for_each_device(Ptr<runtime._class> _class2, Ptr<runtime.device> start, Ptr<?> data, Ptr<?> fn) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int class_interface_register(Ptr<class_interface> class_intf) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void class_interface_unregister(Ptr<class_interface> class_intf) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction(value="class_is_registered((const struct class*)$arg1)")
    public static boolean class_is_registered(Ptr<runtime._class> _class2) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void class_raw_spinlock_irqsave_destructor(Ptr<class_raw_spinlock_irqsave_t> _T) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction(value="class_register((const struct class*)$arg1)")
    public static int class_register(Ptr<runtime._class> cls) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void class_release(Ptr<runtime.kobject> kobj) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction(value="class_remove_file_ns((const struct class*)$arg1, (const struct class_attribute*)$arg2, (const void*)$arg3)")
    public static void class_remove_file_ns(Ptr<runtime._class> cls, Ptr<class_attribute> attr2, Ptr<?> ns) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void class_srcu_destructor(Ptr<class_srcu_t> _T) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction(value="class_to_subsys((const struct class*)$arg1)")
    public static Ptr<misc.subsys_private> class_to_subsys(Ptr<runtime._class> _class2) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction(value="class_unregister((const struct class*)$arg1)")
    public static void class_unregister(Ptr<runtime._class> cls) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int class_index(Ptr<?> key2, Ptr<?> datum, Ptr<?> datap) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int class_read(Ptr<runtime.policydb> p, Ptr<runtime.symtab> s2, Ptr<?> fp) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int class_write(Ptr<?> vkey, Ptr<?> datum, Ptr<?> ptr) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction(value="((const struct kobj_ns_type_operations*)class_dir_child_ns_type((const struct kobject*)$arg1))")
    public static Ptr<KobjDefinitions.kobj_ns_type_operations> class_dir_child_ns_type(Ptr<runtime.kobject> kobj) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void class_dir_release(Ptr<runtime.kobject> kobj) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static class_irqsave_t class_irqsave_constructor() {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static @OriginalName(value="ssize_t") long class_show(Ptr<runtime.device> dev, Ptr<DeviceDefinitions.device_attribute> attr2, String buf) {
        throw new MethodIsBPFRelatedFunction();
    }

    @Type(noCCodeGeneration=true, cType="struct class_dir")
    @NotUsableInJava
    public static class class_dir
    extends Struct {
        public runtime.kobject kobj;
        public Ptr<runtime._class> _class;
    }

    @Type(noCCodeGeneration=true, cType="struct { int *lock; long unsigned int flags; }")
    @NotUsableInJava
    public static class class_core_lock_t
    extends Struct {
        public Ptr<Integer> lock;
        public @Unsigned long flags;
    }

    @Type(noCCodeGeneration=true, cType="struct { raw_spinlock *lock; raw_spinlock *lock2; }")
    @NotUsableInJava
    public static class class_double_raw_spinlock_t
    extends Struct {
        public Ptr<@OriginalName(value="raw_spinlock_t") RawDefinitions.raw_spinlock> lock;
        public Ptr<@OriginalName(value="raw_spinlock_t") RawDefinitions.raw_spinlock> lock2;
    }

    @Type(noCCodeGeneration=true, cType="struct class_info")
    @NotUsableInJava
    public static class class_info
    extends Struct {
        public int _class;
        public String class_name;
    }

    @Type(noCCodeGeneration=true, cType="struct class_compat")
    @NotUsableInJava
    public static class class_compat
    extends Struct {
        public Ptr<runtime.kobject> kobj;
    }

    @Type(noCCodeGeneration=true, cType="struct { struct srcu_struct *lock; int idx; }")
    @NotUsableInJava
    public static class class_srcu_t
    extends Struct {
        public Ptr<SrcuDefinitions.srcu_struct> lock;
        public int idx;
    }

    @Type(noCCodeGeneration=true, cType="struct { struct { qrwlock raw_lock; } *lock; }")
    @NotUsableInJava
    public static class class_read_lock_t
    extends Struct {
        public Ptr<misc.rwlock_t> lock;
    }

    @Type(noCCodeGeneration=true, cType="struct class_attribute_string")
    @NotUsableInJava
    public static class class_attribute_string
    extends Struct {
        public class_attribute attr;
        public String str;
    }

    @Type(noCCodeGeneration=true, cType="struct class_interface")
    @NotUsableInJava
    public static class class_interface
    extends Struct {
        public ListDefinitions.list_head node;
        public Ptr<runtime._class> _class;
        public Ptr<?> add_dev;
        public Ptr<?> remove_dev;
    }

    @Type(noCCodeGeneration=true, cType="struct class_attribute")
    @NotUsableInJava
    public static class class_attribute
    extends Struct {
        public runtime.attribute attr;
        public Ptr<?> show;
        public Ptr<?> store;
    }

    @Type(noCCodeGeneration=true, cType="struct class_dev_iter")
    @NotUsableInJava
    public static class class_dev_iter
    extends Struct {
        public KlistDefinitions.klist_iter ki;
        public Ptr<DeviceDefinitions.device_type> type;
        public Ptr<misc.subsys_private> sp;
    }

    @Type(noCCodeGeneration=true, cType="struct class_datum")
    @NotUsableInJava
    public static class class_datum
    extends Struct {
        public @Unsigned int value;
        public String comkey;
        public Ptr<CommonDefinitions.common_datum> comdatum;
        public runtime.symtab permissions;
        public Ptr<misc.constraint_node> constraints;
        public Ptr<misc.constraint_node> validatetrans;
        public char default_user;
        public char default_role;
        public char default_type;
        public char default_range;
    }

    @Type(noCCodeGeneration=true, cType="enum class_stat_type")
    public static enum class_stat_type implements Enum<class_stat_type>,
    TypedEnum<class_stat_type, Integer>
    {
        ZS_OBJS_ALLOCATED,
        ZS_OBJS_INUSE,
        NR_CLASS_STAT_TYPES;

    }

    @Type(noCCodeGeneration=true, cType="struct { struct rq *lock; struct rq *lock2; }")
    @NotUsableInJava
    public static class class_double_rq_lock_t
    extends Struct {
        public Ptr<runtime.rq> lock;
        public Ptr<runtime.rq> lock2;
    }

    @Type(noCCodeGeneration=true, cType="struct { struct rq *lock; struct rq_flags rf; }")
    @NotUsableInJava
    public static class class_rq_lock_t
    extends Struct {
        public Ptr<runtime.rq> lock;
        public RqDefinitions.rq_flags rf;
    }

    @Type(noCCodeGeneration=true, cType="struct { struct task_struct *lock; struct rq *rq; struct rq_flags rf; }")
    @NotUsableInJava
    public static class class_task_rq_lock_t
    extends Struct {
        public Ptr<TaskDefinitions.task_struct> lock;
        public Ptr<runtime.rq> rq;
        public RqDefinitions.rq_flags rf;
    }

    @Type(noCCodeGeneration=true, cType="struct { void *lock; }")
    @NotUsableInJava
    public static class class_rcu_t
    extends Struct {
        public Ptr<?> lock;
    }

    @Type(noCCodeGeneration=true, cType="struct { void *lock; long unsigned int flags; }")
    @NotUsableInJava
    public static class class_irqsave_t
    extends Struct {
        public Ptr<?> lock;
        public @Unsigned long flags;
    }

    @Type(noCCodeGeneration=true, cType="enum class_map_type")
    public static enum class_map_type implements Enum<class_map_type>,
    TypedEnum<class_map_type, Integer>
    {
        DD_CLASS_TYPE_DISJOINT_BITS,
        DD_CLASS_TYPE_LEVEL_NUM,
        DD_CLASS_TYPE_DISJOINT_NAMES,
        DD_CLASS_TYPE_LEVEL_NAMES;

    }

    @Type(noCCodeGeneration=true, cType="struct { spinlock *lock; long unsigned int flags; }")
    @NotUsableInJava
    public static class class_spinlock_irqsave_t
    extends Struct {
        public Ptr< @OriginalName(value="spinlock_t") runtime.spinlock> lock;
        public @Unsigned long flags;
    }

    @Type(noCCodeGeneration=true, cType="struct { spinlock *lock; }")
    @NotUsableInJava
    public static class class_spinlock_t
    extends Struct {
        public Ptr< @OriginalName(value="spinlock_t") runtime.spinlock> lock;
    }

    @Type(noCCodeGeneration=true, cType="struct { raw_spinlock *lock; long unsigned int flags; }")
    @NotUsableInJava
    public static class class_raw_spinlock_irqsave_t
    extends Struct {
        public Ptr<@OriginalName(value="raw_spinlock_t") RawDefinitions.raw_spinlock> lock;
        public @Unsigned long flags;
    }

    @Type(noCCodeGeneration=true, cType="struct { raw_spinlock *lock; }")
    @NotUsableInJava
    public static class class_raw_spinlock_t
    extends Struct {
        public Ptr<@OriginalName(value="raw_spinlock_t") RawDefinitions.raw_spinlock> lock;
    }
}

