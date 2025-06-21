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
import me.bechberger.ebpf.runtime.CgroupDefinitions;
import me.bechberger.ebpf.runtime.ListDefinitions;
import me.bechberger.ebpf.runtime.PercpuDefinitions;
import me.bechberger.ebpf.runtime.TaskDefinitions;
import me.bechberger.ebpf.runtime.misc;
import me.bechberger.ebpf.runtime.runtime;
import me.bechberger.ebpf.type.Ptr;
import me.bechberger.ebpf.type.Struct;

public final class CssDefinitions {
    @NotUsableInJava
    @BuiltinBPFFunction
    public static void css_put(Ptr<CgroupDefinitions.cgroup_subsys_state> css) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void css_clear_dir(Ptr<CgroupDefinitions.cgroup_subsys_state> css) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void css_free_rwork_fn(Ptr<misc.work_struct> work) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static Ptr<CgroupDefinitions.cgroup_subsys_state> css_from_id(int id, Ptr<CgroupDefinitions.cgroup_subsys> ss) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static boolean css_has_online_children(Ptr<CgroupDefinitions.cgroup_subsys_state> css) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void css_killed_ref_fn(Ptr<PercpuDefinitions.percpu_ref> ref) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void css_killed_work_fn(Ptr<misc.work_struct> work) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static Ptr<CgroupDefinitions.cgroup_subsys_state> css_next_child(Ptr<CgroupDefinitions.cgroup_subsys_state> pos, Ptr<CgroupDefinitions.cgroup_subsys_state> parent) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static Ptr<CgroupDefinitions.cgroup_subsys_state> css_next_descendant_post(Ptr<CgroupDefinitions.cgroup_subsys_state> pos, Ptr<CgroupDefinitions.cgroup_subsys_state> root) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static Ptr<CgroupDefinitions.cgroup_subsys_state> css_next_descendant_pre(Ptr<CgroupDefinitions.cgroup_subsys_state> pos, Ptr<CgroupDefinitions.cgroup_subsys_state> root) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int css_populate_dir(Ptr<CgroupDefinitions.cgroup_subsys_state> css) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void css_release(Ptr<PercpuDefinitions.percpu_ref> ref) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void css_release_work_fn(Ptr<misc.work_struct> work) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static Ptr<CgroupDefinitions.cgroup_subsys_state> css_rightmost_descendant(Ptr<CgroupDefinitions.cgroup_subsys_state> pos) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void css_set_move_task(Ptr<TaskDefinitions.task_struct> task2, Ptr<css_set> from_cset, Ptr<css_set> to_cset, boolean use_mg_tasks) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void css_task_iter_advance(Ptr<css_task_iter> it) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void css_task_iter_advance_css_set(Ptr<css_task_iter> it) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void css_task_iter_end(Ptr<css_task_iter> it) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static Ptr<TaskDefinitions.task_struct> css_task_iter_next(Ptr<css_task_iter> it) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void css_task_iter_start(Ptr<CgroupDefinitions.cgroup_subsys_state> css, @Unsigned int flags, Ptr<css_task_iter> it) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static Ptr<CgroupDefinitions.cgroup_subsys_state> css_tryget_online_from_dir(Ptr<runtime.dentry> dentry2, Ptr<CgroupDefinitions.cgroup_subsys> ss) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static boolean css_visible(Ptr<CgroupDefinitions.cgroup_subsys_state> css) {
        throw new MethodIsBPFRelatedFunction();
    }

    @Type(noCCodeGeneration=true, cType="struct css_set__safe_rcu")
    @NotUsableInJava
    public static class css_set__safe_rcu
    extends Struct {
        public Ptr<runtime.cgroup> dfl_cgrp;
    }

    @Type(noCCodeGeneration=true, cType="struct css_task_iter")
    @NotUsableInJava
    public static class css_task_iter
    extends Struct {
        public Ptr<CgroupDefinitions.cgroup_subsys> ss;
        public @Unsigned int flags;
        public Ptr<ListDefinitions.list_head> cset_pos;
        public Ptr<ListDefinitions.list_head> cset_head;
        public Ptr<ListDefinitions.list_head> tcset_pos;
        public Ptr<ListDefinitions.list_head> tcset_head;
        public Ptr<ListDefinitions.list_head> task_pos;
        public Ptr<ListDefinitions.list_head> cur_tasks_head;
        public Ptr<css_set> cur_cset;
        public Ptr<css_set> cur_dcset;
        public Ptr<TaskDefinitions.task_struct> cur_task;
        public ListDefinitions.list_head iters_node;
    }

    @Type(noCCodeGeneration=true, cType="struct css_set")
    @NotUsableInJava
    public static class css_set
    extends Struct {
        public Ptr<CgroupDefinitions.cgroup_subsys_state> @Size(value=14) [] subsys;
        public @OriginalName(value="refcount_t") misc.refcount_struct refcount;
        public Ptr<css_set> dom_cset;
        public Ptr<runtime.cgroup> dfl_cgrp;
        public int nr_tasks;
        public ListDefinitions.list_head tasks;
        public ListDefinitions.list_head mg_tasks;
        public ListDefinitions.list_head dying_tasks;
        public ListDefinitions.list_head task_iters;
        public ListDefinitions.list_head @Size(value=14) [] e_cset_node;
        public ListDefinitions.list_head threaded_csets;
        public ListDefinitions.list_head threaded_csets_node;
        public misc.hlist_node hlist;
        public ListDefinitions.list_head cgrp_links;
        public ListDefinitions.list_head mg_src_preload_node;
        public ListDefinitions.list_head mg_dst_preload_node;
        public ListDefinitions.list_head mg_node;
        public Ptr<runtime.cgroup> mg_src_cgrp;
        public Ptr<runtime.cgroup> mg_dst_cgrp;
        public Ptr<css_set> mg_dst_cset;
        public boolean dead;
        public misc.callback_head callback_head;
    }
}

