/*
 * Decompiled with CFR 0.153-SNAPSHOT (d6f6758-dirty).
 */
package me.bechberger.ebpf.runtime;

import me.bechberger.ebpf.annotations.Type;
import me.bechberger.ebpf.annotations.Unsigned;
import me.bechberger.ebpf.annotations.bpf.BuiltinBPFFunction;
import me.bechberger.ebpf.annotations.bpf.MethodIsBPFRelatedFunction;
import me.bechberger.ebpf.annotations.bpf.NotUsableInJava;
import me.bechberger.ebpf.runtime.MlsDefinitions;
import me.bechberger.ebpf.runtime.RoleDefinitions;
import me.bechberger.ebpf.runtime.misc;
import me.bechberger.ebpf.runtime.runtime;
import me.bechberger.ebpf.type.Ptr;
import me.bechberger.ebpf.type.Struct;

public final class PolicydbDefinitions {
    @NotUsableInJava
    @BuiltinBPFFunction
    public static int policydb_class_isvalid(Ptr<runtime.policydb> p, @Unsigned int _class2) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int policydb_context_isvalid(Ptr<runtime.policydb> p, Ptr<runtime.context> c) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void policydb_destroy(Ptr<runtime.policydb> p) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static Ptr<misc.filename_trans_datum> policydb_filenametr_search(Ptr<runtime.policydb> p, Ptr<misc.filename_trans_key> key2) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int policydb_index(Ptr<runtime.policydb> p) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int policydb_load_isids(Ptr<runtime.policydb> p, Ptr<runtime.sidtab> s2) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static Ptr<MlsDefinitions.mls_range> policydb_rangetr_search(Ptr<runtime.policydb> p, Ptr<misc.range_trans> key2) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int policydb_read(Ptr<runtime.policydb> p, Ptr<?> fp) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int policydb_role_isvalid(Ptr<runtime.policydb> p, @Unsigned int role) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static Ptr<RoleDefinitions.role_trans_datum> policydb_roletr_search(Ptr<runtime.policydb> p, Ptr<RoleDefinitions.role_trans_key> key2) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int policydb_type_isvalid(Ptr<runtime.policydb> p, @Unsigned int type2) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int policydb_write(Ptr<runtime.policydb> p, Ptr<?> fp) {
        throw new MethodIsBPFRelatedFunction();
    }

    @Type(noCCodeGeneration=true, cType="struct policydb_compat_info")
    @NotUsableInJava
    public static class policydb_compat_info
    extends Struct {
        public @Unsigned int version;
        public @Unsigned int sym_num;
        public @Unsigned int ocon_num;
    }
}

