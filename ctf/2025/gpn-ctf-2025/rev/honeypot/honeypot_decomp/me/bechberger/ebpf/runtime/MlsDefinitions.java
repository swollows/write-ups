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
import me.bechberger.ebpf.runtime.NetlblDefinitions;
import me.bechberger.ebpf.runtime.UserDefinitions;
import me.bechberger.ebpf.runtime.runtime;
import me.bechberger.ebpf.type.Ptr;
import me.bechberger.ebpf.type.Struct;

public final class MlsDefinitions {
    @NotUsableInJava
    @BuiltinBPFFunction
    public static int mls_read_level(Ptr<mls_level> lp, Ptr<?> fp) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int mls_read_range_helper(Ptr<mls_range> r, Ptr<?> fp) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int mls_write_range_helper(Ptr<mls_range> r, Ptr<?> fp) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int mls_compute_context_len(Ptr<runtime.policydb> p, Ptr<runtime.context> context2) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int mls_compute_sid(Ptr<runtime.policydb> p, Ptr<runtime.context> scontext, Ptr<runtime.context> tcontext, @Unsigned short tclass, @Unsigned int specified, Ptr<runtime.context> newcontext, boolean sock2) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int mls_context_isvalid(Ptr<runtime.policydb> p, Ptr<runtime.context> c) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int mls_context_to_sid(Ptr<runtime.policydb> pol, char oldc, String scontext, Ptr<runtime.context> context2, Ptr<runtime.sidtab> s2, @Unsigned int def_sid) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int mls_convert_context(Ptr<runtime.policydb> oldp, Ptr<runtime.policydb> newp, Ptr<runtime.context> oldc, Ptr<runtime.context> newc) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int mls_export_netlbl_cat(Ptr<runtime.policydb> p, Ptr<runtime.context> context2, Ptr<NetlblDefinitions.netlbl_lsm_secattr> secattr) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void mls_export_netlbl_lvl(Ptr<runtime.policydb> p, Ptr<runtime.context> context2, Ptr<NetlblDefinitions.netlbl_lsm_secattr> secattr) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int mls_from_string(Ptr<runtime.policydb> p, String str, Ptr<runtime.context> context2, @Unsigned @OriginalName(value="gfp_t") int gfp_mask) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int mls_import_netlbl_cat(Ptr<runtime.policydb> p, Ptr<runtime.context> context2, Ptr<NetlblDefinitions.netlbl_lsm_secattr> secattr) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void mls_import_netlbl_lvl(Ptr<runtime.policydb> p, Ptr<runtime.context> context2, Ptr<NetlblDefinitions.netlbl_lsm_secattr> secattr) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int mls_level_isvalid(Ptr<runtime.policydb> p, Ptr<mls_level> l) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int mls_range_isvalid(Ptr<runtime.policydb> p, Ptr<mls_range> r) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int mls_range_set(Ptr<runtime.context> context2, Ptr<mls_range> range2) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int mls_setup_user_range(Ptr<runtime.policydb> p, Ptr<runtime.context> fromcon, Ptr<UserDefinitions.user_datum> user, Ptr<runtime.context> usercon) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void mls_sid_to_context(Ptr<runtime.policydb> p, Ptr<runtime.context> context2, Ptr<String> scontext) {
        throw new MethodIsBPFRelatedFunction();
    }

    @Type(noCCodeGeneration=true, cType="struct { struct netlbl_lsm_catmap *cat; unsigned int lvl; }")
    @NotUsableInJava
    public static class mls_of_attr_of_netlbl_lsm_secattr
    extends Struct {
        public Ptr<NetlblDefinitions.netlbl_lsm_catmap> cat;
        public @Unsigned int lvl;
    }

    @Type(noCCodeGeneration=true, cType="struct mls_range")
    @NotUsableInJava
    public static class mls_range
    extends Struct {
        public mls_level @Size(value=2) [] level;
    }

    @Type(noCCodeGeneration=true, cType="struct mls_level")
    @NotUsableInJava
    public static class mls_level
    extends Struct {
        public @Unsigned int sens;
        public runtime.ebitmap cat;
    }
}

