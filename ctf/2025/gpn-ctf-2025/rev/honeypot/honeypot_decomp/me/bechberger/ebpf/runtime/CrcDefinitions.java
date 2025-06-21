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
import me.bechberger.ebpf.runtime.AtomicDefinitions;
import me.bechberger.ebpf.runtime.KernelDefinitions;
import me.bechberger.ebpf.runtime.PwmDefinitions;
import me.bechberger.ebpf.runtime.SeqDefinitions;
import me.bechberger.ebpf.runtime.TaskDefinitions;
import me.bechberger.ebpf.runtime.WaitDefinitions;
import me.bechberger.ebpf.runtime.misc;
import me.bechberger.ebpf.runtime.runtime;
import me.bechberger.ebpf.type.Ptr;
import me.bechberger.ebpf.type.Struct;

public final class CrcDefinitions {
    @NotUsableInJava
    @BuiltinBPFFunction
    public static int crc_control_open(Ptr<runtime.inode> inode2, Ptr<runtime.file> file2) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int crc_control_show(Ptr<SeqDefinitions.seq_file> m, Ptr<?> data) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction(value="crc_control_write($arg1, (const u8*)$arg2, $arg3, $arg4)")
    public static @OriginalName(value="ssize_t") long crc_control_write(Ptr<runtime.file> file2, String ubuf, @Unsigned long len, Ptr<@OriginalName(value="loff_t") Long> offp) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction(value="crc_pwm_apply($arg1, $arg2, (const struct pwm_state*)$arg3)")
    public static int crc_pwm_apply(Ptr<PwmDefinitions.pwm_chip> chip, Ptr<PwmDefinitions.pwm_device> pwm, Ptr<PwmDefinitions.pwm_state> state2) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int crc_pwm_get_state(Ptr<PwmDefinitions.pwm_chip> chip, Ptr<PwmDefinitions.pwm_device> pwm, Ptr<PwmDefinitions.pwm_state> state2) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void crc_pcl() {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction(value="crc_ccitt($arg1, (const u8*)$arg2, $arg3)")
    public static @Unsigned short crc_ccitt(@Unsigned short crc, Ptr<Character> buffer, @Unsigned long len) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction(value="crc_t10dif((const u8*)$arg1, $arg2)")
    public static @Unsigned short crc_t10dif(String buffer, @Unsigned long len) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction(value="crc_t10dif_generic($arg1, (const u8*)$arg2, $arg3)")
    public static @Unsigned short crc_t10dif_generic(@Unsigned short crc, String buffer, @Unsigned long len) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void crc_t10dif_mod_fini() {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int crc_t10dif_mod_init() {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int crc_t10dif_notify(Ptr<misc.notifier_block> self, @Unsigned long val, Ptr<?> data) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void crc_t10dif_rehash(Ptr<misc.work_struct> work) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction(value="crc_t10dif_transform_show($arg1, (const struct kernel_param*)$arg2)")
    public static int crc_t10dif_transform_show(String buffer, Ptr<KernelDefinitions.kernel_param> kp) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction(value="crc_t10dif_update($arg1, (const u8*)$arg2, $arg3)")
    public static @Unsigned short crc_t10dif_update(@Unsigned short crc, String buffer, @Unsigned long len) {
        throw new MethodIsBPFRelatedFunction();
    }

    @Type(noCCodeGeneration=true, cType="struct crc_data")
    @NotUsableInJava
    public static class crc_data
    extends Struct {
        public Ptr<TaskDefinitions.task_struct> thr;
        public AtomicDefinitions.atomic_t ready;
        public AtomicDefinitions.atomic_t stop;
        public @Unsigned int run_threads;
        public @OriginalName(value="wait_queue_head_t") WaitDefinitions.wait_queue_head go;
        public @OriginalName(value="wait_queue_head_t") WaitDefinitions.wait_queue_head done;
        public Ptr<@Unsigned Integer> crc32;
        public Ptr<@Unsigned Long> @Size(value=3) [] unc_len;
        public String @Size(value=3) [] unc;
    }
}

