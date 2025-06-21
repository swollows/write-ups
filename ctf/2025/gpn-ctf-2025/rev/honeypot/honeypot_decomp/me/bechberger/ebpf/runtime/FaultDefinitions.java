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
import me.bechberger.ebpf.runtime.IovDefinitions;
import me.bechberger.ebpf.runtime.VmDefinitions;
import me.bechberger.ebpf.runtime.runtime;
import me.bechberger.ebpf.type.Enum;
import me.bechberger.ebpf.type.Ptr;
import me.bechberger.ebpf.type.TypedEnum;

public final class FaultDefinitions {
    @NotUsableInJava
    @BuiltinBPFFunction
    public static int fault_around_bytes_fops_open(Ptr<runtime.inode> inode2, Ptr<runtime.file> file2) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int fault_around_bytes_get(Ptr<?> data, Ptr<@Unsigned Long> val) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int fault_around_bytes_set(Ptr<?> data, @Unsigned long val) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int fault_around_debugfs() {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static @Unsigned @OriginalName(value="vm_fault_t") int fault_dirty_shared_page(Ptr<VmDefinitions.vm_fault> vmf) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int fault_in_user_writeable(Ptr<@Unsigned Integer> uaddr) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction(value="fault_in_iov_iter_readable((const struct iov_iter*)$arg1, $arg2)")
    public static @Unsigned long fault_in_iov_iter_readable(Ptr<IovDefinitions.iov_iter> i, @Unsigned long size) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction(value="fault_in_iov_iter_writeable((const struct iov_iter*)$arg1, $arg2)")
    public static @Unsigned long fault_in_iov_iter_writeable(Ptr<IovDefinitions.iov_iter> i, @Unsigned long size) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction(value="fault_in_readable((const u8*)$arg1, $arg2)")
    public static @Unsigned long fault_in_readable(String uaddr, @Unsigned long size) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction(value="fault_in_safe_writeable((const u8*)$arg1, $arg2)")
    public static @Unsigned long fault_in_safe_writeable(String uaddr, @Unsigned long size) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static @Unsigned long fault_in_subpage_writeable(String uaddr, @Unsigned long size) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static @Unsigned long fault_in_writeable(String uaddr, @Unsigned long size) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static boolean fault_in_kernel_space(@Unsigned long address) {
        throw new MethodIsBPFRelatedFunction();
    }

    @Type(noCCodeGeneration=true, cType="enum fault_flag")
    public static enum fault_flag implements Enum<fault_flag>,
    TypedEnum<fault_flag, Integer>
    {
        FAULT_FLAG_WRITE,
        FAULT_FLAG_MKWRITE,
        FAULT_FLAG_ALLOW_RETRY,
        FAULT_FLAG_RETRY_NOWAIT,
        FAULT_FLAG_KILLABLE,
        FAULT_FLAG_TRIED,
        FAULT_FLAG_USER,
        FAULT_FLAG_REMOTE,
        FAULT_FLAG_INSTRUCTION,
        FAULT_FLAG_INTERRUPTIBLE,
        FAULT_FLAG_UNSHARE,
        FAULT_FLAG_ORIG_PTE_VALID,
        FAULT_FLAG_VMA_LOCK;

    }
}

