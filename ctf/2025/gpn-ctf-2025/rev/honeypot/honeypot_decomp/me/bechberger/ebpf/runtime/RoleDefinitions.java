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
import me.bechberger.ebpf.runtime.DeviceDefinitions;
import me.bechberger.ebpf.runtime.runtime;
import me.bechberger.ebpf.type.Ptr;
import me.bechberger.ebpf.type.Struct;

public final class RoleDefinitions {
    @NotUsableInJava
    @BuiltinBPFFunction
    public static int role_bounds_sanity_check(Ptr<?> key2, Ptr<?> datum, Ptr<?> datap) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int role_destroy(Ptr<?> key2, Ptr<?> datum, Ptr<?> p) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int role_index(Ptr<?> key2, Ptr<?> datum, Ptr<?> datap) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int role_read(Ptr<runtime.policydb> p, Ptr<runtime.symtab> s2, Ptr<?> fp) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static @OriginalName(value="ssize_t") long role_show(Ptr<runtime.device> dev, Ptr<DeviceDefinitions.device_attribute> attr2, String buf) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction(value="role_store($arg1, $arg2, (const u8*)$arg3, $arg4)")
    public static @OriginalName(value="ssize_t") long role_store(Ptr<runtime.device> dev, Ptr<DeviceDefinitions.device_attribute> attr2, String buf, @Unsigned long size) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int role_tr_destroy(Ptr<?> key2, Ptr<?> datum, Ptr<?> p) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction(value="role_trans_cmp((const void*)$arg1, (const void*)$arg2)")
    public static int role_trans_cmp(Ptr<?> k1, Ptr<?> k2) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction(value="role_trans_hash((const void*)$arg1)")
    public static @Unsigned int role_trans_hash(Ptr<?> k) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int role_trans_write_one(Ptr<?> key2, Ptr<?> datum, Ptr<?> ptr) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int role_write(Ptr<?> vkey, Ptr<?> datum, Ptr<?> ptr) {
        throw new MethodIsBPFRelatedFunction();
    }

    @Type(noCCodeGeneration=true, cType="struct role_trans_datum")
    @NotUsableInJava
    public static class role_trans_datum
    extends Struct {
        public @Unsigned int new_role;
    }

    @Type(noCCodeGeneration=true, cType="struct role_trans_key")
    @NotUsableInJava
    public static class role_trans_key
    extends Struct {
        public @Unsigned int role;
        public @Unsigned int type;
        public @Unsigned int tclass;
    }

    @Type(noCCodeGeneration=true, cType="struct role_allow")
    @NotUsableInJava
    public static class role_allow
    extends Struct {
        public @Unsigned int role;
        public @Unsigned int new_role;
        public Ptr<role_allow> next;
    }

    @Type(noCCodeGeneration=true, cType="struct role_datum")
    @NotUsableInJava
    public static class role_datum
    extends Struct {
        public @Unsigned int value;
        public @Unsigned int bounds;
        public runtime.ebitmap dominates;
        public runtime.ebitmap types;
    }
}

