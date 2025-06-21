/*
 * Decompiled with CFR 0.153-SNAPSHOT (d6f6758-dirty).
 */
package me.bechberger.ebpf.bpf;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.function.Consumer;
import me.bechberger.ebpf.annotations.Unsigned;
import me.bechberger.ebpf.annotations.bpf.BPFFunction;
import me.bechberger.ebpf.annotations.bpf.BPFInterface;
import me.bechberger.ebpf.annotations.bpf.BuiltinBPFFunction;
import me.bechberger.ebpf.annotations.bpf.InternalBody;
import me.bechberger.ebpf.annotations.bpf.InternalMethodDefinition;
import me.bechberger.ebpf.annotations.bpf.MethodIsBPFRelatedFunction;
import me.bechberger.ebpf.annotations.bpf.PropertyDefinition;
import me.bechberger.ebpf.annotations.bpf.PropertyDefinitions;
import me.bechberger.ebpf.annotations.bpf.Requires;
import me.bechberger.ebpf.bpf.BPFError;
import me.bechberger.ebpf.bpf.BPFProgram;
import me.bechberger.ebpf.runtime.BpfDefinitions;
import me.bechberger.ebpf.runtime.ScxDefinitions;
import me.bechberger.ebpf.runtime.TaskDefinitions;
import me.bechberger.ebpf.type.Ptr;

@BPFInterface(before="void scx_bpf_error_bstr(char *fmt, unsigned long long *data, u32 data_len) __ksym;\n\n/*\n * Helper macro for initializing the fmt and variadic argument inputs to both\n * bstr exit kfuncs. Callers to this function should use ___fmt and ___param to\n * refer to the initialized list of inputs to the bstr kfunc.\n */\n#define scx_bpf_bstr_preamble(fmt, args...)\t\t\t\t\t\\\n\tstatic char ___fmt[] = fmt;\t\t\t\t\t\t\\\n\t/*\t\t\t\t\t\t\t\t\t\\\n\t * Note that __param[] must have at least one\t\t\t\t\\\n\t * element to keep the verifier happy.\t\t\t\t\t\\\n\t */\t\t\t\t\t\t\t\t\t\\\n\tunsigned long long ___param[___bpf_narg(args) ?: 1] = {};\t\t\\\n\t\t\t\t\t\t\t\t\t\t\\\n\t_Pragma(\"GCC diagnostic push\")\t\t\t\t\t\t\\\n\t_Pragma(\"GCC diagnostic ignored \\\"-Wint-conversion\\\"\")\t\t\t\\\n\t___bpf_fill(___param, args);\t\t\t\t\t\t\\\n\t_Pragma(\"GCC diagnostic pop\")\t\t\t\t\t\t\\\n\n\n/*\n * scx_bpf_error() wraps the scx_bpf_error_bstr() kfunc with variadic arguments\n * instead of an array of u64. Invoking this macro will cause the scheduler to\n * exit in an erroneous state, with diagnostic information being passed to the\n * user.\n */\n#define scx_bpf_error(fmt, args...)\t\t\t\t\t\t            \\\n({\t\t\t\t\t\t\t\t\t\t                            \\\n\tscx_bpf_bstr_preamble(fmt, args)\t\t\t\t\t            \\\n\tscx_bpf_error_bstr(___fmt, ___param, sizeof(___param));\t\t\t\\\n})\nstruct task_struct *bpf_task_from_pid(s32 pid) __ksym;\nstruct task_struct *bpf_task_acquire(struct task_struct *p) __ksym;\nvoid bpf_task_release(struct task_struct *p) __ksym;\n\ns32 scx_bpf_create_dsq(u64 dsq_id, s32 node) __ksym;\ns32 scx_bpf_select_cpu_dfl(struct task_struct *p, s32 prev_cpu, u64 wake_flags, bool *is_idle) __ksym;\nvoid scx_bpf_dispatch(struct task_struct *p, u64 dsq_id, u64 slice, u64 enq_flags) __ksym;\nvoid scx_bpf_dispatch_vtime(struct task_struct *p, u64 dsq_id, u64 slice, u64 vtime, u64 enq_flags) __ksym;\nu32 scx_bpf_dispatch_nr_slots(void) __ksym;\nvoid scx_bpf_dispatch_cancel(void) __ksym;\nbool scx_bpf_consume(u64 dsq_id) __ksym;\nu32 scx_bpf_reenqueue_local(void) __ksym;\nvoid scx_bpf_kick_cpu(s32 cpu, u64 flags) __ksym;\ns32 scx_bpf_dsq_nr_queued(u64 dsq_id) __ksym;\nvoid scx_bpf_destroy_dsq(u64 dsq_id) __ksym;\nint bpf_iter_scx_dsq_new(struct bpf_iter_scx_dsq *it, u64 dsq_id, u64 flags) __ksym __weak;\nstruct task_struct *bpf_iter_scx_dsq_next(struct bpf_iter_scx_dsq *it) __ksym __weak;\nvoid bpf_iter_scx_dsq_destroy(struct bpf_iter_scx_dsq *it) __ksym __weak;\nvoid scx_bpf_exit_bstr(s64 exit_code, char *fmt, unsigned long long *data, u32 data__sz) __ksym __weak;\nvoid scx_bpf_error_bstr(char *fmt, unsigned long long *data, u32 data_len) __ksym;\nvoid scx_bpf_dump_bstr(char *fmt, unsigned long long *data, u32 data_len) __ksym __weak;\nu32 scx_bpf_cpuperf_cap(s32 cpu) __ksym __weak;\nu32 scx_bpf_cpuperf_cur(s32 cpu) __ksym __weak;\nvoid scx_bpf_cpuperf_set(s32 cpu, u32 perf) __ksym __weak;\nu32 scx_bpf_nr_cpu_ids(void) __ksym __weak;\nconst struct cpumask *scx_bpf_get_possible_cpumask(void) __ksym __weak;\nconst struct cpumask *scx_bpf_get_online_cpumask(void) __ksym __weak;\nvoid scx_bpf_put_cpumask(const struct cpumask *cpumask) __ksym __weak;\nconst struct cpumask *scx_bpf_get_idle_cpumask(void) __ksym;\nconst struct cpumask *scx_bpf_get_idle_smtmask(void) __ksym;\nvoid scx_bpf_put_idle_cpumask(const struct cpumask *cpumask) __ksym;\nbool scx_bpf_test_and_clear_cpu_idle(s32 cpu) __ksym;\ns32 scx_bpf_pick_idle_cpu(const cpumask_t *cpus_allowed, u64 flags) __ksym;\ns32 scx_bpf_pick_any_cpu(const cpumask_t *cpus_allowed, u64 flags) __ksym;\nbool scx_bpf_task_running(const struct task_struct *p) __ksym;\ns32 scx_bpf_task_cpu(const struct task_struct *p) __ksym;\nstruct rq *scx_bpf_cpu_rq(s32 cpu) __ksym;\n\n#define BPF_STRUCT_OPS(name, args...)\t\t\t\t\t\t\\\nSEC(\"struct_ops/\"#name)\tBPF_PROG(name, ##args)\n\n\n/*\n * Define sched_ext_ops. This may be expanded to define multiple variants for\n * backward compatibility. See compat.h::SCX_OPS_LOAD/ATTACH().\n */\n#define SCX_OPS_DEFINE(__name, ...)\t\t\t\t\t\t\\\n\tSEC(\".struct_ops.link\")\t\t\t\t\t\t\t\\\n\tstruct sched_ext_ops __name = {\t\t\t\t\t\t\\\n\t\t__VA_ARGS__,\t\t\t\t\t\t\t\\\n\t};\n\n#define BPF_STRUCT_OPS_SLEEPABLE(name, args...)\t\t\t\t\t\\\nSEC(\"struct_ops.s/\"#name)\t\t\t\t\t\t\t\\\nBPF_PROG(name, ##args)\n\n#define BPF_FOR_EACH_ITER (&___it)\n", after="SCX_OPS_DEFINE(sched_ops,\n\t       .select_cpu\t\t= (void *)sched_select_cpu,\n\t       .enqueue\t\t\t= (void *)sched_enqueue,\n\t       .dispatch\t\t= (void *)sched_dispatch,\n\t       .update_idle\t\t= (void *)sched_update_idle,\n\t       .init_task\t\t= (void *)sched_init_task,\n\t       .init\t\t\t= (void *)sched_init,\n\t       .exit\t\t\t= (void *)sched_exit,\n\t       .running\t        = (void *)simple_running,\n\t       .enable          = (void *)simple_enable,\n\t       .disable         = (void *)simple_disable,\n\t       .stopping        = (void *)simple_stopping,\n\t       .dequeue         = (void *)simple_dequeue,\n\t       .tick            = (void *)simple_tick,\n\t       .flags\t\t\t= SCX_OPS_ENQ_LAST | SCX_OPS_KEEP_BUILTIN_IDLE,\n\t       .timeout_ms      = __property_timeout_ms,\n\t       .name\t\t\t= \"__property_sched_name\");\n")
@Requires(sched_ext=true)
@PropertyDefinitions(value={@PropertyDefinition(name="sched_name", defaultValue="hello", regexp="[a-zA-Z0-9_]+"), @PropertyDefinition(name="timeout_ms", defaultValue="30000", regexp="[1-9]\\d*")})
@InternalBody(value="\n\n")
public interface Scheduler {
    public static final int ESRCH = 3;
    public static final int SCHED_EXT_UAPI_ID = 7;

    @BuiltinBPFFunction
    default public void scx_bpf_error(String fmt, Object ... args) {
        throw new MethodIsBPFRelatedFunction();
    }

    @BPFFunction(headerTemplate="s32 BPF_STRUCT_OPS(sched_select_cpu, struct task_struct *p, s32 prev_cpu, u64 wake_flags)", addDefinition=false)
    @InternalMethodDefinition(value="s32 BPF_STRUCT_OPS(sched_select_cpu, struct task_struct *p, s32 prev_cpu, u64 wake_flags) {\n  return 0;\n}")
    default public int selectCPU(Ptr<TaskDefinitions.task_struct> p, int prev_cpu, long wake_flags) {
        while (true) {
            // Infinite loop
        }
    }

    @BPFFunction(headerTemplate="int BPF_STRUCT_OPS(sched_enqueue, struct task_struct *p, u64 enq_flags)", addDefinition=false)
    public void enqueue(Ptr<TaskDefinitions.task_struct> var1, long var2);

    @BPFFunction(headerTemplate="int BPF_STRUCT_OPS(sched_dispatch, s32 cpu, struct task_struct *prev)", addDefinition=false)
    @InternalMethodDefinition(value="int BPF_STRUCT_OPS(sched_dispatch, s32 cpu, struct task_struct *prev) {\n  return 0;\n}")
    default public void dispatch(int cpu2, Ptr<TaskDefinitions.task_struct> prev) {
        while (true) {
            // Infinite loop
        }
    }

    @BPFFunction(headerTemplate="int BPF_STRUCT_OPS(sched_update_idle, s32 cpu, bool idle)", addDefinition=false)
    @InternalMethodDefinition(value="int BPF_STRUCT_OPS(sched_update_idle, s32 cpu, bool idle) {\n  return 0;\n}")
    default public void updateIdle(int cpu2, boolean idle) {
        while (true) {
            // Infinite loop
        }
    }

    @BPFFunction(headerTemplate="s32 BPF_STRUCT_OPS(sched_init_task, struct task_struct *p, struct scx_init_task_args *args)", addDefinition=false)
    @InternalMethodDefinition(value="s32 BPF_STRUCT_OPS(sched_init_task, struct task_struct *p, struct scx_init_task_args *args) {\n  return 0;\n}")
    default public int initTask(Ptr<TaskDefinitions.task_struct> p, Ptr<ScxDefinitions.scx_init_task_args> args) {
        while (true) {
            // Infinite loop
        }
    }

    @BPFFunction(headerTemplate="s32 BPF_STRUCT_OPS_SLEEPABLE(sched_init)", addDefinition=false)
    @InternalMethodDefinition(value="s32 BPF_STRUCT_OPS_SLEEPABLE(sched_init) {\n  return 0;\n}")
    default public int init() {
        while (true) {
            // Infinite loop
        }
    }

    @BPFFunction(headerTemplate="int BPF_STRUCT_OPS(sched_exit, struct scx_exit_info *ei)", addDefinition=false)
    @InternalMethodDefinition(value="int BPF_STRUCT_OPS(sched_exit, struct scx_exit_info *ei) {\n  return 0;\n}")
    default public void exit(Ptr<ScxDefinitions.scx_exit_info> ei) {
        while (true) {
            // Infinite loop
        }
    }

    @BPFFunction(headerTemplate="int BPF_STRUCT_OPS(simple_running, struct task_struct *p)", addDefinition=false)
    @InternalMethodDefinition(value="int BPF_STRUCT_OPS(simple_running, struct task_struct *p) {\n  return 0;\n}")
    default public void running(Ptr<TaskDefinitions.task_struct> p) {
        while (true) {
            // Infinite loop
        }
    }

    @BPFFunction(headerTemplate="int BPF_STRUCT_OPS(simple_enable, struct task_struct *p)", addDefinition=false)
    @InternalMethodDefinition(value="int BPF_STRUCT_OPS(simple_enable, struct task_struct *p) {\n  return 0;\n}")
    default public void enable(Ptr<TaskDefinitions.task_struct> p) {
        while (true) {
            // Infinite loop
        }
    }

    @BPFFunction(headerTemplate="int BPF_STRUCT_OPS(simple_disable, struct task_struct *p)", addDefinition=false)
    @InternalMethodDefinition(value="int BPF_STRUCT_OPS(simple_disable, struct task_struct *p) {\n  return 0;\n}")
    default public void disable(Ptr<TaskDefinitions.task_struct> p) {
        while (true) {
            // Infinite loop
        }
    }

    @BPFFunction(headerTemplate="int BPF_STRUCT_OPS(simple_stopping, struct task_struct *p, bool runnable)", addDefinition=false)
    @InternalMethodDefinition(value="int BPF_STRUCT_OPS(simple_stopping, struct task_struct *p, bool runnable) {\n  return 0;\n}")
    default public void stopping(Ptr<TaskDefinitions.task_struct> p, boolean runnable) {
        while (true) {
            // Infinite loop
        }
    }

    @BPFFunction(headerTemplate="int BPF_STRUCT_OPS(simple_dequeue, struct task_struct *p, u64 deq_flags)", addDefinition=false)
    @InternalMethodDefinition(value="int BPF_STRUCT_OPS(simple_dequeue, struct task_struct *p, u64 deq_flags) {\n  return 0;\n}")
    default public void dequeue(Ptr<TaskDefinitions.task_struct> p, @Unsigned long deq_flags) {
        while (true) {
            // Infinite loop
        }
    }

    @BPFFunction(headerTemplate="int BPF_STRUCT_OPS(simple_tick, struct task_struct *p)", addDefinition=false)
    @InternalMethodDefinition(value="int BPF_STRUCT_OPS(simple_tick, struct task_struct *p) {\n  return 0;\n}")
    default public void tick(Ptr<TaskDefinitions.task_struct> p) {
        while (true) {
            // Infinite loop
        }
    }

    default public void attachScheduler() {
        BPFProgram bpfProgram = (BPFProgram)((Object)this);
        try {
            bpfProgram.attachStructOps("sched_ops");
        } catch (BPFProgram.BPFAttachError err) {
            throw new BPFError("Could not attach scheduler, maybe stop the current sched-ext scheduler via 'systemctl stop scx'", err);
        }
        if (!this.isSchedulerAttachedProperly()) {
            throw new BPFError("Scheduler not attached properly, maybe some methods are incorrectly implemented");
        }
    }

    default public String getSchedulerName() {
        return ((BPFProgram)((Object)this)).getPropertyValue("sched_name");
    }

    @BuiltinBPFFunction(value="bpf_for_each(scx_dsq, $arg2, $arg1, 0) {\n    $lambda3:param1:type $lambda3:param1:name = BPF_FOR_EACH_ITER;\n    $lambda3:code\n}\n")
    default public void bpf_for_each_dsq(int dsq_id, Ptr<TaskDefinitions.task_struct> cur, Consumer<Ptr<BpfDefinitions.bpf_iter_scx_dsq>> body) {
        throw new MethodIsBPFRelatedFunction();
    }

    default public boolean isSchedulerAttachedProperly() {
        boolean bl;
        BufferedReader reader = new BufferedReader(new FileReader("/sys/kernel/sched_ext/root/ops"));
        try {
            String line2 = reader.readLine();
            bl = line2.equals(this.getSchedulerName());
        } catch (Throwable throwable) {
            try {
                try {
                    reader.close();
                } catch (Throwable throwable2) {
                    throwable.addSuppressed(throwable2);
                }
                throw throwable;
            } catch (IOException e) {
                return false;
            }
        }
        reader.close();
        return bl;
    }

    default public void waitWhileSchedulerIsAttachedProperly() {
        while (this.isSchedulerAttachedProperly()) {
            try {
                Thread.sleep(10L);
            } catch (InterruptedException e) {
                return;
            }
        }
    }

    public static final class PerProcessFlags {
        public static final int PF_VCPU = 1;
        public static final int PF_IDLE = 2;
        public static final int PF_EXITING = 4;
        public static final int PF_POSTCOREDUMP = 8;
        public static final int PF_IO_WORKER = 16;
        public static final int PF_WQ_WORKER = 32;
        public static final int PF_FORKNOEXEC = 64;
        public static final int PF_MCE_PROCESS = 128;
        public static final int PF_SUPERPRIV = 256;
        public static final int PF_DUMPCORE = 512;
        public static final int PF_SIGNALED = 1024;
        public static final int PF_MEMALLOC = 2048;
        public static final int PF_NPROC_EXCEEDED = 4096;
        public static final int PF_USED_MATH = 8192;
        public static final int PF_USER_WORKER = 16384;
        public static final int PF_NOFREEZE = 32768;
        public static final int PF__HOLE__00010000 = 65536;
        public static final int PF_KSWAPD = 131072;
        public static final int PF_MEMALLOC_NOFS = 262144;
        public static final int PF_MEMALLOC_NOIO = 524288;
        public static final int PF_LOCAL_THROTTLE = 0x100000;
        public static final int PF_KTHREAD = 0x200000;
        public static final int PF_RANDOMIZE = 0x400000;
        public static final int PF_MEMALLOC_NORECLAIM = 0x800000;
        public static final int PF_MEMALLOC_NOWARN = 0x1000000;
        public static final int PF__HOLE__02000000 = 0x2000000;
        public static final int PF_NO_SETAFFINITY = 0x4000000;
        public static final int PF_MCE_EARLY = 0x8000000;
        public static final int PF_MEMALLOC_PIN = 0x10000000;
        public static final int PF_BLOCK_TS = 0x20000000;
        public static final int PF__HOLE__40000000 = 0x40000000;
        public static final int PF_SUSPEND_TASK = Integer.MIN_VALUE;
    }
}

