/*
 * Decompiled with CFR 0.153-SNAPSHOT (d6f6758-dirty).
 */
package me.bechberger.ebpf.runtime;

import me.bechberger.ebpf.annotations.OriginalName;
import me.bechberger.ebpf.annotations.Unsigned;
import me.bechberger.ebpf.annotations.bpf.BuiltinBPFFunction;
import me.bechberger.ebpf.annotations.bpf.MethodIsBPFRelatedFunction;
import me.bechberger.ebpf.annotations.bpf.NotUsableInJava;
import me.bechberger.ebpf.runtime.BpfDefinitions;
import me.bechberger.ebpf.runtime.PollDefinitions;
import me.bechberger.ebpf.runtime.VmDefinitions;
import me.bechberger.ebpf.runtime.runtime;
import me.bechberger.ebpf.type.Ptr;

public final class RingbufDefinitions {
    @NotUsableInJava
    @BuiltinBPFFunction
    public static Ptr<BpfDefinitions.bpf_map> ringbuf_map_alloc(Ptr<BpfDefinitions.bpf_attr> attr2) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static long ringbuf_map_delete_elem(Ptr<BpfDefinitions.bpf_map> map2, Ptr<?> key2) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void ringbuf_map_free(Ptr<BpfDefinitions.bpf_map> map2) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int ringbuf_map_get_next_key(Ptr<BpfDefinitions.bpf_map> map2, Ptr<?> key2, Ptr<?> next_key) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static Ptr<?> ringbuf_map_lookup_elem(Ptr<BpfDefinitions.bpf_map> map2, Ptr<?> key2) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction(value="ringbuf_map_mem_usage((const struct bpf_map*)$arg1)")
    public static @Unsigned long ringbuf_map_mem_usage(Ptr<BpfDefinitions.bpf_map> map2) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int ringbuf_map_mmap_kern(Ptr<BpfDefinitions.bpf_map> map2, Ptr<VmDefinitions.vm_area_struct> vma) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int ringbuf_map_mmap_user(Ptr<BpfDefinitions.bpf_map> map2, Ptr<VmDefinitions.vm_area_struct> vma) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static @Unsigned @OriginalName(value="__poll_t") int ringbuf_map_poll_kern(Ptr<BpfDefinitions.bpf_map> map2, Ptr<runtime.file> filp, Ptr<PollDefinitions.poll_table_struct> pts) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static @Unsigned @OriginalName(value="__poll_t") int ringbuf_map_poll_user(Ptr<BpfDefinitions.bpf_map> map2, Ptr<runtime.file> filp, Ptr<PollDefinitions.poll_table_struct> pts) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static long ringbuf_map_update_elem(Ptr<BpfDefinitions.bpf_map> map2, Ptr<?> key2, Ptr<?> value, @Unsigned long flags) {
        throw new MethodIsBPFRelatedFunction();
    }
}

