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
import me.bechberger.ebpf.runtime.PollDefinitions;
import me.bechberger.ebpf.runtime.VcDefinitions;
import me.bechberger.ebpf.runtime.WaitDefinitions;
import me.bechberger.ebpf.runtime.misc;
import me.bechberger.ebpf.runtime.runtime;
import me.bechberger.ebpf.type.Ptr;
import me.bechberger.ebpf.type.Struct;

public final class VcsDefinitions {
    @NotUsableInJava
    @BuiltinBPFFunction
    public static int vcs_fasync(int fd2, Ptr<runtime.file> file2, int on) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int vcs_init() {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static @OriginalName(value="loff_t") long vcs_lseek(Ptr<runtime.file> file2, @OriginalName(value="loff_t") long offset, int orig) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void vcs_make_sysfs(int index2) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int vcs_notifier(Ptr<misc.notifier_block> nb, @Unsigned long code2, Ptr<?> _param) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int vcs_open(Ptr<runtime.inode> inode2, Ptr<runtime.file> filp) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static @Unsigned @OriginalName(value="__poll_t") int vcs_poll(Ptr<runtime.file> file2, Ptr<PollDefinitions.poll_table_struct> wait) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static Ptr<vcs_poll_data> vcs_poll_data_get(Ptr<runtime.file> file2) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static @OriginalName(value="ssize_t") long vcs_read(Ptr<runtime.file> file2, String buf, @Unsigned long count, Ptr<@OriginalName(value="loff_t") Long> ppos) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int vcs_release(Ptr<runtime.inode> inode2, Ptr<runtime.file> file2) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void vcs_remove_sysfs(int index2) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction(value="vcs_size((const struct vc_data*)$arg1, $arg2, $arg3)")
    public static int vcs_size(Ptr<VcDefinitions.vc_data> vc2, boolean attr2, boolean unicode) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction(value="vcs_write($arg1, (const u8*)$arg2, $arg3, $arg4)")
    public static @OriginalName(value="ssize_t") long vcs_write(Ptr<runtime.file> file2, String buf, @Unsigned long count, Ptr<@OriginalName(value="loff_t") Long> ppos) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction(value="vcs_write_buf($arg1, (const u8*)$arg2, $arg3, $arg4, $arg5, $arg6)")
    public static @NotUsableInJava Ptr<@Unsigned Short> vcs_write_buf(Ptr<VcDefinitions.vc_data> vc2, String con_buf, @Unsigned int pos, @Unsigned int count, boolean viewed, Ptr<Ptr<@Unsigned Short>> org0) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction(value="vcs_scr_readw((const struct vc_data*)$arg1, (const short unsigned int*)$arg2)")
    public static @Unsigned short vcs_scr_readw(Ptr<VcDefinitions.vc_data> vc2, Ptr<@Unsigned Short> org) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void vcs_scr_updated(Ptr<VcDefinitions.vc_data> vc2) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void vcs_scr_writew(Ptr<VcDefinitions.vc_data> vc2, @Unsigned short val, Ptr<@Unsigned Short> org) {
        throw new MethodIsBPFRelatedFunction();
    }

    @Type(noCCodeGeneration=true, cType="struct vcs_poll_data")
    @NotUsableInJava
    public static class vcs_poll_data
    extends Struct {
        public misc.notifier_block notifier;
        public @Unsigned int cons_num;
        public int event;
        public @OriginalName(value="wait_queue_head_t") WaitDefinitions.wait_queue_head waitq;
        public Ptr<misc.fasync_struct> fasync;
    }
}

