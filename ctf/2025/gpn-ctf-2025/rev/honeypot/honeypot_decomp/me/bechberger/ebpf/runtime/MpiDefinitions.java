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
import me.bechberger.ebpf.runtime.runtime;
import me.bechberger.ebpf.type.Ptr;

public final class MpiDefinitions {
    @NotUsableInJava
    @BuiltinBPFFunction
    public static Ptr<?> mpi_get_buffer(@OriginalName(value="MPI") Ptr<misc.gcry_mpi> a, Ptr<@Unsigned Integer> nbytes, Ptr<Integer> sign) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int mpi_read_buffer(@OriginalName(value="MPI") Ptr<misc.gcry_mpi> a, Ptr<@OriginalName(value="uint8_t") Character> buf, @Unsigned int buf_len, Ptr<@Unsigned Integer> nbytes, Ptr<Integer> sign) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction(value="mpi_read_from_buffer((const void*)$arg1, $arg2)")
    public static @OriginalName(value="MPI") Ptr<misc.gcry_mpi> mpi_read_from_buffer(Ptr<?> xbuffer, Ptr<@Unsigned Integer> ret_nread) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction(value="mpi_read_raw_data((const void*)$arg1, $arg2)")
    public static @OriginalName(value="MPI") Ptr<misc.gcry_mpi> mpi_read_raw_data(Ptr<?> xbuffer, @Unsigned long nbytes) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static @OriginalName(value="MPI") Ptr<misc.gcry_mpi> mpi_read_raw_from_sgl(Ptr<runtime.scatterlist> sgl, @Unsigned int nbytes) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int mpi_write_to_sgl(@OriginalName(value="MPI") Ptr<misc.gcry_mpi> a, Ptr<runtime.scatterlist> sgl, @Unsigned int nbytes, Ptr<Integer> sign) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int mpi_add(@OriginalName(value="MPI") Ptr<misc.gcry_mpi> w, @OriginalName(value="MPI") Ptr<misc.gcry_mpi> u, @OriginalName(value="MPI") Ptr<misc.gcry_mpi> v) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int mpi_addm(@OriginalName(value="MPI") Ptr<misc.gcry_mpi> w, @OriginalName(value="MPI") Ptr<misc.gcry_mpi> u, @OriginalName(value="MPI") Ptr<misc.gcry_mpi> v, @OriginalName(value="MPI") Ptr<misc.gcry_mpi> m) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int mpi_cmp(@OriginalName(value="MPI") Ptr<misc.gcry_mpi> u, @OriginalName(value="MPI") Ptr<misc.gcry_mpi> v) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int mpi_cmp_ui(@OriginalName(value="MPI") Ptr<misc.gcry_mpi> u, @Unsigned long v) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int mpi_fdiv_r(@OriginalName(value="MPI") Ptr<misc.gcry_mpi> rem, @OriginalName(value="MPI") Ptr<misc.gcry_mpi> dividend, @OriginalName(value="MPI") Ptr<misc.gcry_mpi> divisor) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int mpi_mod(@OriginalName(value="MPI") Ptr<misc.gcry_mpi> rem, @OriginalName(value="MPI") Ptr<misc.gcry_mpi> dividend, @OriginalName(value="MPI") Ptr<misc.gcry_mpi> divisor) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int mpi_mul(@OriginalName(value="MPI") Ptr<misc.gcry_mpi> w, @OriginalName(value="MPI") Ptr<misc.gcry_mpi> u, @OriginalName(value="MPI") Ptr<misc.gcry_mpi> v) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int mpi_mulm(@OriginalName(value="MPI") Ptr<misc.gcry_mpi> w, @OriginalName(value="MPI") Ptr<misc.gcry_mpi> u, @OriginalName(value="MPI") Ptr<misc.gcry_mpi> v, @OriginalName(value="MPI") Ptr<misc.gcry_mpi> m) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int mpi_sub(@OriginalName(value="MPI") Ptr<misc.gcry_mpi> w, @OriginalName(value="MPI") Ptr<misc.gcry_mpi> u, @OriginalName(value="MPI") Ptr<misc.gcry_mpi> v) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int mpi_subm(@OriginalName(value="MPI") Ptr<misc.gcry_mpi> w, @OriginalName(value="MPI") Ptr<misc.gcry_mpi> u, @OriginalName(value="MPI") Ptr<misc.gcry_mpi> v, @OriginalName(value="MPI") Ptr<misc.gcry_mpi> m) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int mpi_tdiv_qr(@OriginalName(value="MPI") Ptr<misc.gcry_mpi> quot, @OriginalName(value="MPI") Ptr<misc.gcry_mpi> rem, @OriginalName(value="MPI") Ptr<misc.gcry_mpi> num, @OriginalName(value="MPI") Ptr<misc.gcry_mpi> den) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int mpi_tdiv_r(@OriginalName(value="MPI") Ptr<misc.gcry_mpi> rem, @OriginalName(value="MPI") Ptr<misc.gcry_mpi> num, @OriginalName(value="MPI") Ptr<misc.gcry_mpi> den) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static @OriginalName(value="MPI") Ptr<misc.gcry_mpi> mpi_alloc(@Unsigned int nlimbs) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static @NotUsableInJava @OriginalName(value="mpi_ptr_t") Ptr<@Unsigned @OriginalName(value="mpi_limb_t") Long> mpi_alloc_limb_space(@Unsigned int nlimbs) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void mpi_assign_limb_space(@OriginalName(value="MPI") Ptr<misc.gcry_mpi> a, @OriginalName(value="mpi_ptr_t") Ptr<@Unsigned @OriginalName(value="mpi_limb_t") Long> ap, @Unsigned int nlimbs) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static @OriginalName(value="MPI") Ptr<misc.gcry_mpi> mpi_copy(@OriginalName(value="MPI") Ptr<misc.gcry_mpi> a) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void mpi_free(@OriginalName(value="MPI") Ptr<misc.gcry_mpi> a) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void mpi_free_limb_space(@OriginalName(value="mpi_ptr_t") Ptr<@Unsigned @OriginalName(value="mpi_limb_t") Long> a) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int mpi_resize(@OriginalName(value="MPI") Ptr<misc.gcry_mpi> a, @Unsigned int nlimbs) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static @Unsigned int mpi_get_nbits(@OriginalName(value="MPI") Ptr<misc.gcry_mpi> a) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void mpi_normalize(@OriginalName(value="MPI") Ptr<misc.gcry_mpi> a) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int mpi_powm(@OriginalName(value="MPI") Ptr<misc.gcry_mpi> res, @OriginalName(value="MPI") Ptr<misc.gcry_mpi> base, @OriginalName(value="MPI") Ptr<misc.gcry_mpi> exp, @OriginalName(value="MPI") Ptr<misc.gcry_mpi> mod) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int mpi_rshift(@OriginalName(value="MPI") Ptr<misc.gcry_mpi> x, @OriginalName(value="MPI") Ptr<misc.gcry_mpi> a, @Unsigned int n) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int mpi_set_bit(@OriginalName(value="MPI") Ptr<misc.gcry_mpi> a, @Unsigned int n) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int mpi_sub_ui(@OriginalName(value="MPI") Ptr<misc.gcry_mpi> w, @OriginalName(value="MPI") Ptr<misc.gcry_mpi> u, @Unsigned long vval) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int mpi_test_bit(@OriginalName(value="MPI") Ptr<misc.gcry_mpi> a, @Unsigned int n) {
        throw new MethodIsBPFRelatedFunction();
    }
}

