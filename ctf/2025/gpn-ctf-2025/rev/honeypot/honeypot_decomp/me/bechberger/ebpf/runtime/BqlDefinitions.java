/*
 * Decompiled with CFR 0.153-SNAPSHOT (d6f6758-dirty).
 */
package me.bechberger.ebpf.runtime;

import me.bechberger.ebpf.annotations.OriginalName;
import me.bechberger.ebpf.annotations.Unsigned;
import me.bechberger.ebpf.annotations.bpf.BuiltinBPFFunction;
import me.bechberger.ebpf.annotations.bpf.MethodIsBPFRelatedFunction;
import me.bechberger.ebpf.annotations.bpf.NotUsableInJava;
import me.bechberger.ebpf.runtime.NetdevDefinitions;
import me.bechberger.ebpf.type.Ptr;

public final class BqlDefinitions {
    @NotUsableInJava
    @BuiltinBPFFunction(value="bql_set_hold_time($arg1, (const u8*)$arg2, $arg3)")
    public static @OriginalName(value="ssize_t") long bql_set_hold_time(Ptr<NetdevDefinitions.netdev_queue> queue, String buf, @Unsigned long len) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction(value="bql_set_limit($arg1, (const u8*)$arg2, $arg3)")
    public static @OriginalName(value="ssize_t") long bql_set_limit(Ptr<NetdevDefinitions.netdev_queue> queue, String buf, @Unsigned long len) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction(value="bql_set_limit_max($arg1, (const u8*)$arg2, $arg3)")
    public static @OriginalName(value="ssize_t") long bql_set_limit_max(Ptr<NetdevDefinitions.netdev_queue> queue, String buf, @Unsigned long len) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction(value="bql_set_limit_min($arg1, (const u8*)$arg2, $arg3)")
    public static @OriginalName(value="ssize_t") long bql_set_limit_min(Ptr<NetdevDefinitions.netdev_queue> queue, String buf, @Unsigned long len) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction(value="bql_set_stall_max($arg1, (const u8*)$arg2, $arg3)")
    public static @OriginalName(value="ssize_t") long bql_set_stall_max(Ptr<NetdevDefinitions.netdev_queue> queue, String buf, @Unsigned long len) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction(value="bql_set_stall_thrs($arg1, (const u8*)$arg2, $arg3)")
    public static @OriginalName(value="ssize_t") long bql_set_stall_thrs(Ptr<NetdevDefinitions.netdev_queue> queue, String buf, @Unsigned long len) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static @OriginalName(value="ssize_t") long bql_show_hold_time(Ptr<NetdevDefinitions.netdev_queue> queue, String buf) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static @OriginalName(value="ssize_t") long bql_show_inflight(Ptr<NetdevDefinitions.netdev_queue> queue, String buf) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static @OriginalName(value="ssize_t") long bql_show_limit(Ptr<NetdevDefinitions.netdev_queue> queue, String buf) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static @OriginalName(value="ssize_t") long bql_show_limit_max(Ptr<NetdevDefinitions.netdev_queue> queue, String buf) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static @OriginalName(value="ssize_t") long bql_show_limit_min(Ptr<NetdevDefinitions.netdev_queue> queue, String buf) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static @OriginalName(value="ssize_t") long bql_show_stall_cnt(Ptr<NetdevDefinitions.netdev_queue> queue, String buf) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static @OriginalName(value="ssize_t") long bql_show_stall_max(Ptr<NetdevDefinitions.netdev_queue> queue, String buf) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static @OriginalName(value="ssize_t") long bql_show_stall_thrs(Ptr<NetdevDefinitions.netdev_queue> queue, String buf) {
        throw new MethodIsBPFRelatedFunction();
    }
}

