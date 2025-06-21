/*
 * Decompiled with CFR 0.153-SNAPSHOT (d6f6758-dirty).
 */
package me.bechberger.ebpf.runtime;

import me.bechberger.ebpf.annotations.OriginalName;
import me.bechberger.ebpf.annotations.Unsigned;
import me.bechberger.ebpf.annotations.bpf.BuiltinBPFFunction;
import me.bechberger.ebpf.annotations.bpf.MethodIsBPFRelatedFunction;
import me.bechberger.ebpf.annotations.bpf.NotUsableInJava;
import me.bechberger.ebpf.runtime.misc;
import me.bechberger.ebpf.type.Ptr;

public final class MpihelpDefinitions {
    @NotUsableInJava
    @BuiltinBPFFunction
    public static @Unsigned @OriginalName(value="mpi_limb_t") long mpihelp_addmul_1(@OriginalName(value="mpi_ptr_t") Ptr<@Unsigned @OriginalName(value="mpi_limb_t") Long> res_ptr, @OriginalName(value="mpi_ptr_t") Ptr<@Unsigned @OriginalName(value="mpi_limb_t") Long> s1_ptr, @OriginalName(value="mpi_size_t") int s1_size, @Unsigned @OriginalName(value="mpi_limb_t") long s2_limb) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static @Unsigned @OriginalName(value="mpi_limb_t") long mpihelp_sub_n(@OriginalName(value="mpi_ptr_t") Ptr<@Unsigned @OriginalName(value="mpi_limb_t") Long> res_ptr, @OriginalName(value="mpi_ptr_t") Ptr<@Unsigned @OriginalName(value="mpi_limb_t") Long> s1_ptr, @OriginalName(value="mpi_ptr_t") Ptr<@Unsigned @OriginalName(value="mpi_limb_t") Long> s2_ptr, @OriginalName(value="mpi_size_t") int size) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static @Unsigned @OriginalName(value="mpi_limb_t") long mpihelp_add_n(@OriginalName(value="mpi_ptr_t") Ptr<@Unsigned @OriginalName(value="mpi_limb_t") Long> res_ptr, @OriginalName(value="mpi_ptr_t") Ptr<@Unsigned @OriginalName(value="mpi_limb_t") Long> s1_ptr, @OriginalName(value="mpi_ptr_t") Ptr<@Unsigned @OriginalName(value="mpi_limb_t") Long> s2_ptr, @OriginalName(value="mpi_size_t") int size) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static @Unsigned @OriginalName(value="mpi_limb_t") long mpihelp_lshift(@OriginalName(value="mpi_ptr_t") Ptr<@Unsigned @OriginalName(value="mpi_limb_t") Long> wp, @OriginalName(value="mpi_ptr_t") Ptr<@Unsigned @OriginalName(value="mpi_limb_t") Long> up, @OriginalName(value="mpi_size_t") int usize, @Unsigned int cnt) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int mpihelp_mul(@OriginalName(value="mpi_ptr_t") Ptr<@Unsigned @OriginalName(value="mpi_limb_t") Long> prodp, @OriginalName(value="mpi_ptr_t") Ptr<@Unsigned @OriginalName(value="mpi_limb_t") Long> up, @OriginalName(value="mpi_size_t") int usize, @OriginalName(value="mpi_ptr_t") Ptr<@Unsigned @OriginalName(value="mpi_limb_t") Long> vp, @OriginalName(value="mpi_size_t") int vsize, Ptr<@Unsigned @OriginalName(value="mpi_limb_t") Long> _result) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static @Unsigned @OriginalName(value="mpi_limb_t") long mpihelp_mul_1(@OriginalName(value="mpi_ptr_t") Ptr<@Unsigned @OriginalName(value="mpi_limb_t") Long> res_ptr, @OriginalName(value="mpi_ptr_t") Ptr<@Unsigned @OriginalName(value="mpi_limb_t") Long> s1_ptr, @OriginalName(value="mpi_size_t") int s1_size, @Unsigned @OriginalName(value="mpi_limb_t") long s2_limb) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int mpihelp_mul_karatsuba_case(@OriginalName(value="mpi_ptr_t") Ptr<@Unsigned @OriginalName(value="mpi_limb_t") Long> prodp, @OriginalName(value="mpi_ptr_t") Ptr<@Unsigned @OriginalName(value="mpi_limb_t") Long> up, @OriginalName(value="mpi_size_t") int usize, @OriginalName(value="mpi_ptr_t") Ptr<@Unsigned @OriginalName(value="mpi_limb_t") Long> vp, @OriginalName(value="mpi_size_t") int vsize, Ptr<misc.karatsuba_ctx> ctx) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void mpihelp_release_karatsuba_ctx(Ptr<misc.karatsuba_ctx> ctx) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static @Unsigned @OriginalName(value="mpi_limb_t") long mpihelp_rshift(@OriginalName(value="mpi_ptr_t") Ptr<@Unsigned @OriginalName(value="mpi_limb_t") Long> wp, @OriginalName(value="mpi_ptr_t") Ptr<@Unsigned @OriginalName(value="mpi_limb_t") Long> up, @OriginalName(value="mpi_size_t") int usize, @Unsigned int cnt) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static @Unsigned @OriginalName(value="mpi_limb_t") long mpihelp_submul_1(@OriginalName(value="mpi_ptr_t") Ptr<@Unsigned @OriginalName(value="mpi_limb_t") Long> res_ptr, @OriginalName(value="mpi_ptr_t") Ptr<@Unsigned @OriginalName(value="mpi_limb_t") Long> s1_ptr, @OriginalName(value="mpi_size_t") int s1_size, @Unsigned @OriginalName(value="mpi_limb_t") long s2_limb) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int mpihelp_cmp(@OriginalName(value="mpi_ptr_t") Ptr<@Unsigned @OriginalName(value="mpi_limb_t") Long> op1_ptr, @OriginalName(value="mpi_ptr_t") Ptr<@Unsigned @OriginalName(value="mpi_limb_t") Long> op2_ptr, @OriginalName(value="mpi_size_t") int size) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static @Unsigned @OriginalName(value="mpi_limb_t") long mpihelp_divmod_1(@OriginalName(value="mpi_ptr_t") Ptr<@Unsigned @OriginalName(value="mpi_limb_t") Long> quot_ptr, @OriginalName(value="mpi_ptr_t") Ptr<@Unsigned @OriginalName(value="mpi_limb_t") Long> dividend_ptr, @OriginalName(value="mpi_size_t") int dividend_size, @Unsigned @OriginalName(value="mpi_limb_t") long divisor_limb) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static @Unsigned @OriginalName(value="mpi_limb_t") long mpihelp_divrem(@OriginalName(value="mpi_ptr_t") Ptr<@Unsigned @OriginalName(value="mpi_limb_t") Long> qp, @OriginalName(value="mpi_size_t") int qextra_limbs, @OriginalName(value="mpi_ptr_t") Ptr<@Unsigned @OriginalName(value="mpi_limb_t") Long> np, @OriginalName(value="mpi_size_t") int nsize, @OriginalName(value="mpi_ptr_t") Ptr<@Unsigned @OriginalName(value="mpi_limb_t") Long> dp, @OriginalName(value="mpi_size_t") int dsize) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static @Unsigned @OriginalName(value="mpi_limb_t") long mpihelp_mod_1(@OriginalName(value="mpi_ptr_t") Ptr<@Unsigned @OriginalName(value="mpi_limb_t") Long> dividend_ptr, @OriginalName(value="mpi_size_t") int dividend_size, @Unsigned @OriginalName(value="mpi_limb_t") long divisor_limb) {
        throw new MethodIsBPFRelatedFunction();
    }
}

