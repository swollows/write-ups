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
import me.bechberger.ebpf.runtime.DescDefinitions;
import me.bechberger.ebpf.runtime.KmemDefinitions;
import me.bechberger.ebpf.runtime.MsrDefinitions;
import me.bechberger.ebpf.runtime.PtDefinitions;
import me.bechberger.ebpf.runtime.SeqDefinitions;
import me.bechberger.ebpf.type.Ptr;
import me.bechberger.ebpf.type.Struct;

public final class SavedDefinitions {
    @NotUsableInJava
    @BuiltinBPFFunction
    public static Ptr<?> saved_cmdlines_next(Ptr<SeqDefinitions.seq_file> m, Ptr<?> v, Ptr<@OriginalName(value="loff_t") Long> pos) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int saved_cmdlines_show(Ptr<SeqDefinitions.seq_file> m, Ptr<?> v) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static Ptr<?> saved_cmdlines_start(Ptr<SeqDefinitions.seq_file> m, Ptr<@OriginalName(value="loff_t") Long> pos) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void saved_cmdlines_stop(Ptr<SeqDefinitions.seq_file> m, Ptr<?> v) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static Ptr<?> saved_tgids_next(Ptr<SeqDefinitions.seq_file> m, Ptr<?> v, Ptr<@OriginalName(value="loff_t") Long> pos) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int saved_tgids_show(Ptr<SeqDefinitions.seq_file> m, Ptr<?> v) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static Ptr<?> saved_tgids_start(Ptr<SeqDefinitions.seq_file> m, Ptr<@OriginalName(value="loff_t") Long> pos) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void saved_tgids_stop(Ptr<SeqDefinitions.seq_file> m, Ptr<?> v) {
        throw new MethodIsBPFRelatedFunction();
    }

    @Type(noCCodeGeneration=true, cType="struct saved_context")
    @NotUsableInJava
    public static class saved_context
    extends Struct {
        public PtDefinitions.pt_regs regs;
        public @Unsigned short ds;
        public @Unsigned short es;
        public @Unsigned short fs;
        public @Unsigned short gs;
        public @Unsigned long kernelmode_gs_base;
        public @Unsigned long usermode_gs_base;
        public @Unsigned long fs_base;
        public @Unsigned long cr0;
        public @Unsigned long cr2;
        public @Unsigned long cr3;
        public @Unsigned long cr4;
        public @Unsigned long misc_enable;
        public saved_msrs saved_msrs;
        public @Unsigned long efer;
        public @Unsigned short gdt_pad;
        public DescDefinitions.desc_ptr gdt_desc;
        public @Unsigned short idt_pad;
        public DescDefinitions.desc_ptr idt;
        public @Unsigned short ldt;
        public @Unsigned short tss;
        public @Unsigned long tr;
        public @Unsigned long safety;
        public @Unsigned long return_address;
        public boolean misc_enable_saved;
    }

    @Type(noCCodeGeneration=true, cType="struct saved_msrs")
    @NotUsableInJava
    public static class saved_msrs
    extends Struct {
        public @Unsigned int num;
        public Ptr<saved_msr> array;
    }

    @Type(noCCodeGeneration=true, cType="struct saved_msr")
    @NotUsableInJava
    public static class saved_msr
    extends Struct {
        public boolean valid;
        public MsrDefinitions.msr_info info;
    }

    @Type(noCCodeGeneration=true, cType="struct saved_alias")
    @NotUsableInJava
    public static class saved_alias
    extends Struct {
        public Ptr<KmemDefinitions.kmem_cache> s;
        public String name;
        public Ptr<saved_alias> next;
    }

    @Type(noCCodeGeneration=true, cType="struct saved_cmdlines_buffer")
    @NotUsableInJava
    public static class saved_cmdlines_buffer
    extends Struct {
        public @Unsigned int @Size(value=32769) [] map_pid_to_cmdline;
        public Ptr<@Unsigned Integer> map_cmdline_to_pid;
        public @Unsigned int cmdline_num;
        public int cmdline_idx;
        public char @Size(value=0) [] saved_cmdlines;
    }

    @Type(noCCodeGeneration=true, cType="struct saved_syn")
    @NotUsableInJava
    public static class saved_syn
    extends Struct {
        public @Unsigned int mac_hdrlen;
        public @Unsigned int network_hdrlen;
        public @Unsigned int tcp_hdrlen;
        public char @Size(value=0) [] data;
    }
}

