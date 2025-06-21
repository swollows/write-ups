/*
 * Decompiled with CFR 0.153-SNAPSHOT (d6f6758-dirty).
 */
package me.bechberger.ebpf.runtime;

import me.bechberger.ebpf.annotations.OriginalName;
import me.bechberger.ebpf.annotations.Unsigned;
import me.bechberger.ebpf.annotations.bpf.BuiltinBPFFunction;
import me.bechberger.ebpf.annotations.bpf.MethodIsBPFRelatedFunction;
import me.bechberger.ebpf.annotations.bpf.NotUsableInJava;
import me.bechberger.ebpf.runtime.SkDefinitions;
import me.bechberger.ebpf.runtime.SkbDefinitions;
import me.bechberger.ebpf.type.Ptr;

public final class PskbDefinitions {
    @NotUsableInJava
    @BuiltinBPFFunction
    public static SkbDefinitions.skb_drop_reason pskb_may_pull_reason(Ptr<SkDefinitions.sk_buff> skb, @Unsigned int len) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int __pskb_trim_head(Ptr<SkDefinitions.sk_buff> skb, int len) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int ___pskb_trim(Ptr<SkDefinitions.sk_buff> skb, @Unsigned int len) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static Ptr<SkDefinitions.sk_buff> __pskb_copy_fclone(Ptr<SkDefinitions.sk_buff> skb, int headroom, @Unsigned @OriginalName(value="gfp_t") int gfp_mask, boolean fclone) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static Ptr<?> __pskb_pull_tail(Ptr<SkDefinitions.sk_buff> skb, int delta) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction(value="pskb_carve_inside_header($arg1, (const unsigned int)$arg2, (const int)$arg3, $arg4)")
    public static int pskb_carve_inside_header(Ptr<SkDefinitions.sk_buff> skb, @Unsigned int off, int headlen, @Unsigned @OriginalName(value="gfp_t") int gfp_mask) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction(value="pskb_carve_inside_nonlinear($arg1, (const unsigned int)$arg2, $arg3, $arg4)")
    public static int pskb_carve_inside_nonlinear(Ptr<SkDefinitions.sk_buff> skb, @Unsigned int off, int pos, @Unsigned @OriginalName(value="gfp_t") int gfp_mask) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int pskb_expand_head(Ptr<SkDefinitions.sk_buff> skb, int nhead, int ntail, @Unsigned @OriginalName(value="gfp_t") int gfp_mask) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static Ptr<SkDefinitions.sk_buff> pskb_extract(Ptr<SkDefinitions.sk_buff> skb, int off, int to_copy, @Unsigned @OriginalName(value="gfp_t") int gfp) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static Ptr<?> pskb_put(Ptr<SkDefinitions.sk_buff> skb, Ptr<SkDefinitions.sk_buff> tail, int len) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int pskb_trim_rcsum_slow(Ptr<SkDefinitions.sk_buff> skb, @Unsigned int len) {
        throw new MethodIsBPFRelatedFunction();
    }
}

