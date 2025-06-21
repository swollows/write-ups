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
import me.bechberger.ebpf.runtime.BufferDefinitions;
import me.bechberger.ebpf.runtime.IovDefinitions;
import me.bechberger.ebpf.runtime.TaskDefinitions;
import me.bechberger.ebpf.runtime.WritebackDefinitions;
import me.bechberger.ebpf.runtime.misc;
import me.bechberger.ebpf.runtime.runtime;
import me.bechberger.ebpf.type.Ptr;
import me.bechberger.ebpf.type.Struct;

public final class SubmitDefinitions {
    @NotUsableInJava
    @BuiltinBPFFunction
    public static int submit_page_section(Ptr<runtime.dio> dio2, Ptr<misc.dio_submit> sdio, Ptr<runtime.page> page2, @Unsigned int offset, @Unsigned int len, @Unsigned @OriginalName(value="sector_t") long blocknr, Ptr<BufferDefinitions.buffer_head> map_bh) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void submit_bh(@Unsigned @OriginalName(value="blk_opf_t") int opf, Ptr<BufferDefinitions.buffer_head> bh) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void submit_bh_wbc(@Unsigned @OriginalName(value="blk_opf_t") int opf, Ptr<BufferDefinitions.buffer_head> bh, misc.rw_hint write_hint, Ptr<WritebackDefinitions.writeback_control> wbc) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int submit_bio_wait(Ptr<runtime.bio> bio2) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void submit_bio_wait_endio(Ptr<runtime.bio> bio2) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void __submit_bio(Ptr<runtime.bio> bio2) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void __submit_bio_noacct(Ptr<runtime.bio> bio2) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void submit_bio(Ptr<runtime.bio> bio2) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void submit_bio_noacct(Ptr<runtime.bio> bio2) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void submit_bio_noacct_nocheck(Ptr<runtime.bio> bio2) {
        throw new MethodIsBPFRelatedFunction();
    }

    @Type(noCCodeGeneration=true, cType="struct { struct iov_iter *iter; struct task_struct *waiter; }")
    @NotUsableInJava
    public static class submit_of_anon_member_of_iomap_dio
    extends Struct {
        public Ptr<IovDefinitions.iov_iter> iter;
        public Ptr<TaskDefinitions.task_struct> waiter;
    }
}

