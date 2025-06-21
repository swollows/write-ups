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
import me.bechberger.ebpf.runtime.In6Definitions;
import me.bechberger.ebpf.runtime.IovDefinitions;
import me.bechberger.ebpf.type.Ptr;
import me.bechberger.ebpf.type.Struct;

public final class CsumDefinitions {
    @NotUsableInJava
    @BuiltinBPFFunction(value="csum_and_copy_from_user((const void*)$arg1, $arg2, $arg3)")
    public static @Unsigned @OriginalName(value="__wsum") int csum_and_copy_from_user(Ptr<?> src, Ptr<?> dst, int len) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction(value="csum_and_copy_to_user((const void*)$arg1, $arg2, $arg3)")
    public static @Unsigned @OriginalName(value="__wsum") int csum_and_copy_to_user(Ptr<?> src, Ptr<?> dst, int len) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction(value="csum_ipv6_magic((const struct in6_addr*)$arg1, (const struct in6_addr*)$arg2, $arg3, $arg4, $arg5)")
    public static @Unsigned @OriginalName(value="__sum16") short csum_ipv6_magic(Ptr<In6Definitions.in6_addr> saddr, Ptr<In6Definitions.in6_addr> daddr, @Unsigned int len, char proto2, @Unsigned @OriginalName(value="__wsum") int sum) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction(value="csum_partial((const void*)$arg1, $arg2, $arg3)")
    public static @Unsigned @OriginalName(value="__wsum") int csum_partial(Ptr<?> buff, int len, @Unsigned @OriginalName(value="__wsum") int sum) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void csum_partial_copy_generic() {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction(value="csum_partial_copy_nocheck((const void*)$arg1, $arg2, $arg3)")
    public static @Unsigned @OriginalName(value="__wsum") int csum_partial_copy_nocheck(Ptr<?> src, Ptr<?> dst, int len) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static boolean csum_and_copy_from_iter_full(Ptr<?> addr2, @Unsigned long bytes, Ptr<@Unsigned @OriginalName(value="__wsum") Integer> csum, Ptr<IovDefinitions.iov_iter> i) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static @Unsigned @OriginalName(value="__wsum") int csum_block_add_ext(@Unsigned @OriginalName(value="__wsum") int csum, @Unsigned @OriginalName(value="__wsum") int csum2, int offset, int len) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction(value="csum_partial_ext((const void*)$arg1, $arg2, $arg3)")
    public static @Unsigned @OriginalName(value="__wsum") int csum_partial_ext(Ptr<?> buff, int len, @Unsigned @OriginalName(value="__wsum") int sum) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction(value="csum_and_copy_to_iter((const void*)$arg1, $arg2, $arg3, $arg4)")
    public static @Unsigned long csum_and_copy_to_iter(Ptr<?> addr2, @Unsigned long bytes, Ptr<?> _csstate, Ptr<IovDefinitions.iov_iter> i) {
        throw new MethodIsBPFRelatedFunction();
    }

    @Type(noCCodeGeneration=true, cType="struct { short unsigned int start; short unsigned int offset; }")
    @NotUsableInJava
    public static class csum_of_anon_member_of_virtio_net_hdr_v1
    extends Struct {
        public @Unsigned @OriginalName(value="__virtio16") short start;
        public @Unsigned @OriginalName(value="__virtio16") short offset;
    }

    @Type(noCCodeGeneration=true, cType="struct csum_pseudo_header")
    @NotUsableInJava
    public static class csum_pseudo_header
    extends Struct {
        public @Unsigned @OriginalName(value="__be64") long data_seq;
        public @Unsigned @OriginalName(value="__be32") int subflow_seq;
        public @Unsigned @OriginalName(value="__be16") short data_len;
        public @Unsigned @OriginalName(value="__sum16") short csum;
    }

    @Type(noCCodeGeneration=true, cType="struct csum_state")
    @NotUsableInJava
    public static class csum_state
    extends Struct {
        public @Unsigned @OriginalName(value="__wsum") int csum;
        public @Unsigned long off;
    }
}

