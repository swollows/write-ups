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
import me.bechberger.ebpf.runtime.BufferDefinitions;
import me.bechberger.ebpf.runtime.IrqDefinitions;
import me.bechberger.ebpf.runtime.runtime;
import me.bechberger.ebpf.type.Enum;
import me.bechberger.ebpf.type.Ptr;
import me.bechberger.ebpf.type.Struct;
import me.bechberger.ebpf.type.TypedEnum;

public final class BhDefinitions {
    @NotUsableInJava
    @BuiltinBPFFunction
    public static int __bh_read(Ptr<BufferDefinitions.buffer_head> bh, @Unsigned @OriginalName(value="blk_opf_t") int op_flags, boolean wait) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void __bh_read_batch(int nr, Ptr<Ptr<BufferDefinitions.buffer_head>> bhs, @Unsigned @OriginalName(value="blk_opf_t") int op_flags, boolean force_lock) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void bh_lru_install(Ptr<BufferDefinitions.buffer_head> bh) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int bh_uptodate_or_lock(Ptr<BufferDefinitions.buffer_head> bh) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction(value="bh_get_inode_and_lblk_num((const struct buffer_head*)$arg1, (const struct inode**)$arg2, $arg3)")
    public static boolean bh_get_inode_and_lblk_num(Ptr<BufferDefinitions.buffer_head> bh, Ptr<Ptr<runtime.inode>> inode_ret, Ptr<@Unsigned Long> lblk_num_ret) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void bh_pool_kick_highpri(Ptr<IrqDefinitions.irq_work> irq_work2) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void bh_pool_kick_normal(Ptr<IrqDefinitions.irq_work> irq_work2) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void bh_worker(Ptr<runtime.worker> worker2) {
        throw new MethodIsBPFRelatedFunction();
    }

    @Type(noCCodeGeneration=true, cType="struct bh_accounting")
    @NotUsableInJava
    public static class bh_accounting
    extends Struct {
        public int nr;
        public int ratelimit;
    }

    @Type(noCCodeGeneration=true, cType="struct bh_lru")
    @NotUsableInJava
    public static class bh_lru
    extends Struct {
        public Ptr<BufferDefinitions.buffer_head> @Size(value=16) [] bhs;
    }

    @Type(noCCodeGeneration=true, cType="enum bh_state_bits")
    public static enum bh_state_bits implements Enum<bh_state_bits>,
    TypedEnum<bh_state_bits, Integer>
    {
        BH_Uptodate,
        BH_Dirty,
        BH_Lock,
        BH_Req,
        BH_Mapped,
        BH_New,
        BH_Async_Read,
        BH_Async_Write,
        BH_Delay,
        BH_Boundary,
        BH_Write_EIO,
        BH_Unwritten,
        BH_Quiet,
        BH_Meta,
        BH_Prio,
        BH_Defer_Completion,
        BH_PrivateStart;

    }
}

