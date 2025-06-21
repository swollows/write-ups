/*
 * Decompiled with CFR 0.153-SNAPSHOT (d6f6758-dirty).
 */
package me.bechberger.ebpf.runtime;

import me.bechberger.ebpf.annotations.OriginalName;
import me.bechberger.ebpf.annotations.Unsigned;
import me.bechberger.ebpf.annotations.bpf.BuiltinBPFFunction;
import me.bechberger.ebpf.annotations.bpf.MethodIsBPFRelatedFunction;
import me.bechberger.ebpf.annotations.bpf.NotUsableInJava;
import me.bechberger.ebpf.runtime.runtime;
import me.bechberger.ebpf.type.Ptr;

public final class KfifoDefinitions {
    @NotUsableInJava
    @BuiltinBPFFunction
    public static int __kfifo_alloc(Ptr<runtime.__kfifo> fifo, @Unsigned int size, @Unsigned long esize, @Unsigned @OriginalName(value="gfp_t") int gfp_mask) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void __kfifo_dma_in_finish_r(Ptr<runtime.__kfifo> fifo, @Unsigned int len, @Unsigned long recsize) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static @Unsigned int __kfifo_dma_in_prepare(Ptr<runtime.__kfifo> fifo, Ptr<runtime.scatterlist> sgl, int nents, @Unsigned int len, @Unsigned @OriginalName(value="dma_addr_t") long dma) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static @Unsigned int __kfifo_dma_in_prepare_r(Ptr<runtime.__kfifo> fifo, Ptr<runtime.scatterlist> sgl, int nents, @Unsigned int len, @Unsigned long recsize, @Unsigned @OriginalName(value="dma_addr_t") long dma) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static @Unsigned int __kfifo_dma_out_prepare(Ptr<runtime.__kfifo> fifo, Ptr<runtime.scatterlist> sgl, int nents, @Unsigned int len, @Unsigned @OriginalName(value="dma_addr_t") long dma) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static @Unsigned int __kfifo_dma_out_prepare_r(Ptr<runtime.__kfifo> fifo, Ptr<runtime.scatterlist> sgl, int nents, @Unsigned int len, @Unsigned long recsize, @Unsigned @OriginalName(value="dma_addr_t") long dma) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void __kfifo_free(Ptr<runtime.__kfifo> fifo) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction(value="__kfifo_from_user($arg1, (const void*)$arg2, $arg3, $arg4)")
    public static int __kfifo_from_user(Ptr<runtime.__kfifo> fifo, Ptr<?> from, @Unsigned long len, Ptr<@Unsigned Integer> copied) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction(value="__kfifo_from_user_r($arg1, (const void*)$arg2, $arg3, $arg4, $arg5)")
    public static int __kfifo_from_user_r(Ptr<runtime.__kfifo> fifo, Ptr<?> from, @Unsigned long len, Ptr<@Unsigned Integer> copied, @Unsigned long recsize) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction(value="__kfifo_in($arg1, (const void*)$arg2, $arg3)")
    public static @Unsigned int __kfifo_in(Ptr<runtime.__kfifo> fifo, Ptr<?> buf, @Unsigned int len) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction(value="__kfifo_in_r($arg1, (const void*)$arg2, $arg3, $arg4)")
    public static @Unsigned int __kfifo_in_r(Ptr<runtime.__kfifo> fifo, Ptr<?> buf, @Unsigned int len, @Unsigned long recsize) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int __kfifo_init(Ptr<runtime.__kfifo> fifo, Ptr<?> buffer, @Unsigned int size, @Unsigned long esize) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static @Unsigned int __kfifo_len_r(Ptr<runtime.__kfifo> fifo, @Unsigned long recsize) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static @Unsigned int __kfifo_max_r(@Unsigned int len, @Unsigned long recsize) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static @Unsigned int __kfifo_out(Ptr<runtime.__kfifo> fifo, Ptr<?> buf, @Unsigned int len) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static @Unsigned int __kfifo_out_linear(Ptr<runtime.__kfifo> fifo, Ptr<@Unsigned Integer> tail, @Unsigned int n) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static @Unsigned int __kfifo_out_linear_r(Ptr<runtime.__kfifo> fifo, Ptr<@Unsigned Integer> tail, @Unsigned int n, @Unsigned long recsize) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static @Unsigned int __kfifo_out_peek(Ptr<runtime.__kfifo> fifo, Ptr<?> buf, @Unsigned int len) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static @Unsigned int __kfifo_out_peek_r(Ptr<runtime.__kfifo> fifo, Ptr<?> buf, @Unsigned int len, @Unsigned long recsize) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static @Unsigned int __kfifo_out_r(Ptr<runtime.__kfifo> fifo, Ptr<?> buf, @Unsigned int len, @Unsigned long recsize) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void __kfifo_skip_r(Ptr<runtime.__kfifo> fifo, @Unsigned long recsize) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int __kfifo_to_user(Ptr<runtime.__kfifo> fifo, Ptr<?> to, @Unsigned long len, Ptr<@Unsigned Integer> copied) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int __kfifo_to_user_r(Ptr<runtime.__kfifo> fifo, Ptr<?> to, @Unsigned long len, Ptr<@Unsigned Integer> copied, @Unsigned long recsize) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction(value="kfifo_copy_from_user($arg1, (const void*)$arg2, $arg3, $arg4, $arg5)")
    public static @Unsigned long kfifo_copy_from_user(Ptr<runtime.__kfifo> fifo, Ptr<?> from, @Unsigned int len, @Unsigned int off, Ptr<@Unsigned Integer> copied) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction(value="kfifo_copy_in($arg1, (const void*)$arg2, $arg3, $arg4)")
    public static void kfifo_copy_in(Ptr<runtime.__kfifo> fifo, Ptr<?> src, @Unsigned int len, @Unsigned int off) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void kfifo_copy_out(Ptr<runtime.__kfifo> fifo, Ptr<?> dst, @Unsigned int len, @Unsigned int off) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static @Unsigned long kfifo_copy_to_user(Ptr<runtime.__kfifo> fifo, Ptr<?> to, @Unsigned int len, @Unsigned int off, Ptr<@Unsigned Integer> copied) {
        throw new MethodIsBPFRelatedFunction();
    }
}

