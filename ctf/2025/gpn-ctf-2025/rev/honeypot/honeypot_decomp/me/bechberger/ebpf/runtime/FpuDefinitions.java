/*
 * Decompiled with CFR 0.153-SNAPSHOT (d6f6758-dirty).
 */
package me.bechberger.ebpf.runtime;

import me.bechberger.ebpf.annotations.Size;
import me.bechberger.ebpf.annotations.Type;
import me.bechberger.ebpf.annotations.Unsigned;
import me.bechberger.ebpf.annotations.bpf.BuiltinBPFFunction;
import me.bechberger.ebpf.annotations.bpf.MethodIsBPFRelatedFunction;
import me.bechberger.ebpf.annotations.bpf.NotUsableInJava;
import me.bechberger.ebpf.runtime.TaskDefinitions;
import me.bechberger.ebpf.runtime.runtime;
import me.bechberger.ebpf.type.Ptr;
import me.bechberger.ebpf.type.Struct;

public final class FpuDefinitions {
    @NotUsableInJava
    @BuiltinBPFFunction
    public static boolean __fpu_restore_sig(Ptr<?> buf, Ptr<?> buf_fx, boolean ia32_fxstate) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static boolean fpu_alloc_guest_fpstate(Ptr<fpu_guest> gfpu) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int fpu_clone(Ptr<TaskDefinitions.task_struct> dst, @Unsigned long clone_flags, boolean minimal, @Unsigned long ssp) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void fpu_copy_guest_fpstate_to_uabi(Ptr<fpu_guest> gfpu, Ptr<?> buf, @Unsigned int size, @Unsigned long xfeatures, @Unsigned int pkru) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction(value="fpu_copy_uabi_to_guest_fpstate($arg1, (const void*)$arg2, $arg3, $arg4)")
    public static int fpu_copy_uabi_to_guest_fpstate(Ptr<fpu_guest> gfpu, Ptr<?> buf, @Unsigned long xcr0, Ptr<@Unsigned Integer> vpkru) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int fpu_enable_guest_xfd_features(Ptr<fpu_guest> guest_fpu, @Unsigned long xfeatures) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void fpu_flush_thread() {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void fpu_free_guest_fpstate(Ptr<fpu_guest> gfpu) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void fpu_idle_fpregs() {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void fpu_reset_fpregs() {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void fpu_reset_from_exception_fixup() {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int fpu_swap_kvm_fpstate(Ptr<fpu_guest> guest_fpu, boolean enter_guest) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void fpu_sync_fpstate(Ptr<runtime.fpu> fpu2) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void fpu_sync_guest_vmexit_xfd_state() {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void fpu_thread_struct_whitelist(Ptr<@Unsigned Long> offset, Ptr<@Unsigned Long> size) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void fpu_update_guest_xfd(Ptr<fpu_guest> guest_fpu, @Unsigned long xfd) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static long fpu_xstate_prctl(int option, @Unsigned long arg2) {
        throw new MethodIsBPFRelatedFunction();
    }

    @Type(noCCodeGeneration=true, cType="struct { u8 x[512]; }")
    @NotUsableInJava
    public static class fpu_ctxt_of_vcpu_guest_context
    extends Struct {
        public char @Size(value=512) [] x;
    }

    @Type(noCCodeGeneration=true, cType="struct fpu_guest")
    @NotUsableInJava
    public static class fpu_guest
    extends Struct {
        public @Unsigned long xfeatures;
        public @Unsigned long perm;
        public @Unsigned long xfd_err;
        public @Unsigned int uabi_size;
        public Ptr<runtime.fpstate> fpstate;
    }

    @Type(noCCodeGeneration=true, cType="struct fpu_state_config")
    @NotUsableInJava
    public static class fpu_state_config
    extends Struct {
        public @Unsigned int max_size;
        public @Unsigned int default_size;
        public @Unsigned long max_features;
        public @Unsigned long default_features;
        public @Unsigned long legacy_features;
        public @Unsigned long independent_features;
    }

    @Type(noCCodeGeneration=true, cType="struct fpu_state_perm")
    @NotUsableInJava
    public static class fpu_state_perm
    extends Struct {
        public @Unsigned long __state_perm;
        public @Unsigned int __state_size;
        public @Unsigned int __user_state_size;
    }
}

