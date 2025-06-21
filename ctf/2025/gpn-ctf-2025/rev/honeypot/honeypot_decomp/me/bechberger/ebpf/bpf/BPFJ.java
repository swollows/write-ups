/*
 * Decompiled with CFR 0.153-SNAPSHOT (d6f6758-dirty).
 */
package me.bechberger.ebpf.bpf;

import me.bechberger.ebpf.annotations.bpf.BuiltinBPFFunction;
import me.bechberger.ebpf.annotations.bpf.MethodIsBPFRelatedFunction;
import me.bechberger.ebpf.annotations.bpf.NotUsableInJava;
import me.bechberger.ebpf.type.Ptr;

public class BPFJ {
    @BuiltinBPFFunction(value="bpf_trace_printk($arg1, sizeof($arg1), $args2_)")
    @NotUsableInJava
    public static void bpf_trace_printk(String fmt, Object ... args) {
        throw new MethodIsBPFRelatedFunction();
    }

    @BuiltinBPFFunction(value="BPF_SNPRINTF($arg1, sizeof($arg1), $arg2, $args3_)")
    @NotUsableInJava
    public static void bpf_snprintf(String out, String fmt, Object ... args) {
        throw new MethodIsBPFRelatedFunction();
    }

    @BuiltinBPFFunction(value="__sync_add_and_fetch($arg1, $arg2)")
    @NotUsableInJava
    public static <T extends Number> T sync_add_and_fetch(Ptr<T> var, T increment) {
        throw new MethodIsBPFRelatedFunction();
    }

    @BuiltinBPFFunction(value="__sync_sub_and_fetch($arg1, $arg2)")
    @NotUsableInJava
    public static <T extends Number> T sync_sub_and_fetch(Ptr<T> var, T decrement) {
        throw new MethodIsBPFRelatedFunction();
    }

    @BuiltinBPFFunction(value="__sync_fetch_and_add($arg1, $arg2)")
    @NotUsableInJava
    public static <T extends Number> T sync_fetch_and_add(Ptr<T> var, T increment) {
        throw new MethodIsBPFRelatedFunction();
    }

    @BuiltinBPFFunction(value="__sync_fetch_and_sub($arg1, $arg2)")
    @NotUsableInJava
    public static <T extends Number> T sync_fetch_and_sub(Ptr<T> var, T decrement) {
        throw new MethodIsBPFRelatedFunction();
    }

    @BuiltinBPFFunction(value="__sync_fetch_and_or($arg1, $arg2)")
    @NotUsableInJava
    public static <T extends Number> T sync_fetch_and_or(Ptr<T> var, T value) {
        throw new MethodIsBPFRelatedFunction();
    }

    @BuiltinBPFFunction(value="__sync_fetch_and_and($arg1, $arg2)")
    @NotUsableInJava
    public static <T extends Number> T sync_fetch_and_and(Ptr<T> var, T value) {
        throw new MethodIsBPFRelatedFunction();
    }

    @BuiltinBPFFunction(value="sizeof($T1)")
    @NotUsableInJava
    public static <T> int sizeof() {
        throw new MethodIsBPFRelatedFunction();
    }

    @BuiltinBPFFunction(value="sizeof($arg1)")
    @NotUsableInJava
    public static int sizeof(Object obj) {
        throw new MethodIsBPFRelatedFunction();
    }

    @BuiltinBPFFunction(value="($arg1).$str$arg2 = $arg3")
    @NotUsableInJava
    public static <T> void setField(T val, String fieldName, Object value) {
        throw new MethodIsBPFRelatedFunction();
    }

    @BuiltinBPFFunction(value="bpf_probe_read_kernel_str($arg1, sizeof($arg1), $arg2)")
    @NotUsableInJava
    public static void bpf_probe_read_kernel_str(char[] dest, String source) {
        throw new MethodIsBPFRelatedFunction();
    }

    @BuiltinBPFFunction(value="bpf_probe_read_kernel_str($arg1, sizeof($arg1), $arg2)")
    @NotUsableInJava
    public static void bpf_probe_read_kernel_str(String dest, char[] source) {
        throw new MethodIsBPFRelatedFunction();
    }

    @BuiltinBPFFunction(value="bpf_probe_read_kernel_str($arg1, sizeof($arg1), $arg2)")
    @NotUsableInJava
    public static void bpf_probe_read_kernel_str(String dest, String source) {
        throw new MethodIsBPFRelatedFunction();
    }

    @BuiltinBPFFunction(value="bpf_probe_read_kernel_str($arg1, sizeof($arg1), $arg2)")
    @NotUsableInJava
    public static long bpf_probe_read_kernel_str(char[] dest, char[] source) {
        throw new MethodIsBPFRelatedFunction();
    }

    @BuiltinBPFFunction(value="bpf_probe_read_kernel_str($arg1, sizeof($arg1), $arg2)")
    @NotUsableInJava
    public static long bpf_probe_read_kernel_str(char[] dest, Ptr<Character> source) {
        throw new MethodIsBPFRelatedFunction();
    }

    @BuiltinBPFFunction(value="bpf_probe_read_kernel(&$arg1, sizeof($arg1), $arg2)")
    @NotUsableInJava
    public static <T> long bpf_probe_read_kernel(T dest, Ptr<T> src) {
        throw new MethodIsBPFRelatedFunction();
    }

    @BuiltinBPFFunction(value="bpf_probe_read_kernel_str($arg1, $arg2, $arg3)")
    public static long bpf_probe_read_kernel_str(String val, int size, String filename2) {
        throw new MethodIsBPFRelatedFunction();
    }

    @BuiltinBPFFunction(value="bpf_probe_read_kernel_str($arg1, $arg2, $arg3)")
    public static long bpf_probe_read_kernel_str(String val, int size, Ptr<Character> filename2) {
        throw new MethodIsBPFRelatedFunction();
    }

    @BuiltinBPFFunction
    public static <T> long bpf_probe_read_user_str(String dest, int size, String src) {
        throw new MethodIsBPFRelatedFunction();
    }

    @BuiltinBPFFunction(value="bpf_probe_read_user_str($arg1, sizeof($arg1), $arg2)")
    public static <T> long bpf_probe_read_user_str(String dest, String src) {
        throw new MethodIsBPFRelatedFunction();
    }

    @BuiltinBPFFunction(value="bpf_probe_read_user_str($arg1, sizeof($arg1), $arg2)")
    public static <T> long bpf_probe_read_user_str(char[] dest, String source) {
        throw new MethodIsBPFRelatedFunction();
    }

    @BuiltinBPFFunction(value="continue")
    public static void _continue() {
        throw new MethodIsBPFRelatedFunction();
    }

    @BuiltinBPFFunction(value="break")
    public static void _break() {
        throw new MethodIsBPFRelatedFunction();
    }

    @BuiltinBPFFunction(value="return $arg1")
    public static Object _return(Object value) {
        throw new MethodIsBPFRelatedFunction();
    }

    @BuiltinBPFFunction(value="return")
    public static void _return() {
        throw new MethodIsBPFRelatedFunction();
    }
}

