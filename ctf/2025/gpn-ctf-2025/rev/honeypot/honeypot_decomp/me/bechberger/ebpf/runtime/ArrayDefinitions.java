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
import me.bechberger.ebpf.runtime.BpfDefinitions;
import me.bechberger.ebpf.runtime.BtfDefinitions;
import me.bechberger.ebpf.runtime.SeqDefinitions;
import me.bechberger.ebpf.runtime.TraceDefinitions;
import me.bechberger.ebpf.runtime.VmDefinitions;
import me.bechberger.ebpf.runtime.runtime;
import me.bechberger.ebpf.type.Enum;
import me.bechberger.ebpf.type.Ptr;
import me.bechberger.ebpf.type.Struct;
import me.bechberger.ebpf.type.TypedEnum;

public final class ArrayDefinitions {
    @NotUsableInJava
    @BuiltinBPFFunction
    public static @OriginalName(value="ssize_t") long array_size_show(Ptr<runtime.mddev> mddev2, String page2) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction(value="array_size_store($arg1, (const u8*)$arg2, $arg3)")
    public static @OriginalName(value="ssize_t") long array_size_store(Ptr<runtime.mddev> mddev2, String buf, @Unsigned long len) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static @OriginalName(value="ssize_t") long array_state_show(Ptr<runtime.mddev> mddev2, String page2) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction(value="array_state_store($arg1, (const u8*)$arg2, $arg3)")
    public static @OriginalName(value="ssize_t") long array_state_store(Ptr<runtime.mddev> mddev2, String buf, @Unsigned long len) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static Ptr<BpfDefinitions.bpf_map> array_map_alloc(Ptr<BpfDefinitions.bpf_attr> attr2) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int array_map_alloc_check(Ptr<BpfDefinitions.bpf_attr> attr2) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction(value="array_map_check_btf((const struct bpf_map*)$arg1, (const struct btf*)$arg2, (const struct btf_type*)$arg3, (const struct btf_type*)$arg4)")
    public static int array_map_check_btf(Ptr<BpfDefinitions.bpf_map> map2, Ptr<runtime.btf> btf2, Ptr<BtfDefinitions.btf_type> key_type2, Ptr<BtfDefinitions.btf_type> value_type) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static long array_map_delete_elem(Ptr<BpfDefinitions.bpf_map> map2, Ptr<?> key2) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction(value="array_map_direct_value_addr((const struct bpf_map*)$arg1, $arg2, $arg3)")
    public static int array_map_direct_value_addr(Ptr<BpfDefinitions.bpf_map> map2, Ptr<@Unsigned Long> imm, @Unsigned int off) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction(value="array_map_direct_value_meta((const struct bpf_map*)$arg1, $arg2, $arg3)")
    public static int array_map_direct_value_meta(Ptr<BpfDefinitions.bpf_map> map2, @Unsigned long imm, Ptr<@Unsigned Integer> off) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void array_map_free(Ptr<BpfDefinitions.bpf_map> map2) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void array_map_free_timers_wq(Ptr<BpfDefinitions.bpf_map> map2) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int array_map_gen_lookup(Ptr<BpfDefinitions.bpf_map> map2, Ptr<BpfDefinitions.bpf_insn> insn_buf) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int array_map_get_next_key(Ptr<BpfDefinitions.bpf_map> map2, Ptr<?> key2, Ptr<?> next_key) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static Ptr<?> array_map_lookup_elem(Ptr<BpfDefinitions.bpf_map> map2, Ptr<?> key2) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction(value="array_map_mem_usage((const struct bpf_map*)$arg1)")
    public static @Unsigned long array_map_mem_usage(Ptr<BpfDefinitions.bpf_map> map2) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction(value="array_map_meta_equal((const struct bpf_map*)$arg1, (const struct bpf_map*)$arg2)")
    public static boolean array_map_meta_equal(Ptr<BpfDefinitions.bpf_map> meta0, Ptr<BpfDefinitions.bpf_map> meta1) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int array_map_mmap(Ptr<BpfDefinitions.bpf_map> map2, Ptr<VmDefinitions.vm_area_struct> vma) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void array_map_seq_show_elem(Ptr<BpfDefinitions.bpf_map> map2, Ptr<?> key2, Ptr<SeqDefinitions.seq_file> m) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static long array_map_update_elem(Ptr<BpfDefinitions.bpf_map> map2, Ptr<?> key2, Ptr<?> value, @Unsigned long map_flags) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static Ptr<BpfDefinitions.bpf_map> array_of_map_alloc(Ptr<BpfDefinitions.bpf_attr> attr2) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void array_of_map_free(Ptr<BpfDefinitions.bpf_map> map2) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int array_of_map_gen_lookup(Ptr<BpfDefinitions.bpf_map> map2, Ptr<BpfDefinitions.bpf_insn> insn_buf) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static Ptr<?> array_of_map_lookup_elem(Ptr<BpfDefinitions.bpf_map> map2, Ptr<?> key2) {
        throw new MethodIsBPFRelatedFunction();
    }

    @Type(noCCodeGeneration=true, cType="enum array_state")
    public static enum array_state implements Enum<array_state>,
    TypedEnum<array_state, Integer>
    {
        clear,
        inactive,
        suspended,
        readonly,
        read_auto,
        clean,
        active,
        write_pending,
        active_idle,
        broken,
        bad_word;

    }

    @Type(noCCodeGeneration=true, cType="struct array_buffer")
    @NotUsableInJava
    public static class array_buffer
    extends Struct {
        public Ptr<TraceDefinitions.trace_array> tr;
        public Ptr<TraceDefinitions.trace_buffer> buffer;
        public Ptr<TraceDefinitions.trace_array_cpu> data;
        public @Unsigned long time_start;
        public int cpu;
    }
}

