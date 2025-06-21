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
import me.bechberger.ebpf.runtime.DisplayidDefinitions;
import me.bechberger.ebpf.runtime.DrmDefinitions;
import me.bechberger.ebpf.type.Ptr;
import me.bechberger.ebpf.type.Struct;

public final class CeaDefinitions {
    @NotUsableInJava
    @BuiltinBPFFunction(value="((const struct cea_db*)__cea_db_iter_next($arg1))")
    public static Ptr<cea_db> __cea_db_iter_next(Ptr<cea_db_iter> iter2) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction(value="cea_db_is_hdmi_vsdb((const struct cea_db*)$arg1)")
    public static boolean cea_db_is_hdmi_vsdb(Ptr<cea_db> db) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction(value="cea_db_iter_edid_begin((const struct drm_edid*)$arg1, $arg2)")
    public static void cea_db_iter_edid_begin(Ptr<DrmDefinitions.drm_edid> drm_edid2, Ptr<cea_db_iter> iter2) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void cea_db_iter_end(Ptr<cea_db_iter> iter2) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void cea_map_percpu_pages(Ptr<?> cea_vaddr, Ptr<?> ptr, int pages,  @OriginalName(value="pgprot_t") runtime.pgprot prot) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction(value="cea_mode_alternate_clock((const struct drm_display_mode*)$arg1)")
    public static @Unsigned int cea_mode_alternate_clock(Ptr<DrmDefinitions.drm_display_mode> cea_mode) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void cea_set_pte(Ptr<?> cea_vaddr, @Unsigned @OriginalName(value="phys_addr_t") long pa,  @OriginalName(value="pgprot_t") runtime.pgprot flags) {
        throw new MethodIsBPFRelatedFunction();
    }

    @Type(noCCodeGeneration=true, cType="struct cea_db")
    @NotUsableInJava
    public static class cea_db
    extends Struct {
        public char tag_length;
        public char @Size(value=0) [] data;
    }

    @Type(noCCodeGeneration=true, cType="struct cea_db_iter")
    @NotUsableInJava
    public static class cea_db_iter
    extends Struct {
        public DrmDefinitions.drm_edid_iter edid_iter;
        public DisplayidDefinitions.displayid_iter displayid_iter;
        public Ptr<Character> collection;
        public int index;
        public int end;
    }

    @Type(noCCodeGeneration=true, cType="struct cea_sad")
    @NotUsableInJava
    public static class cea_sad
    extends Struct {
        public char format;
        public char channels;
        public char freq;
        public char byte2;
    }

    @Type(noCCodeGeneration=true, cType="struct cea_exception_stacks")
    @NotUsableInJava
    public static class cea_exception_stacks
    extends Struct {
        public char @Size(value=4096) [] DF_stack_guard;
        public char @Size(value=8192) [] DF_stack;
        public char @Size(value=4096) [] NMI_stack_guard;
        public char @Size(value=8192) [] NMI_stack;
        public char @Size(value=4096) [] DB_stack_guard;
        public char @Size(value=8192) [] DB_stack;
        public char @Size(value=4096) [] MCE_stack_guard;
        public char @Size(value=8192) [] MCE_stack;
        public char @Size(value=4096) [] VC_stack_guard;
        public char @Size(value=8192) [] VC_stack;
        public char @Size(value=4096) [] VC2_stack_guard;
        public char @Size(value=8192) [] VC2_stack;
        public char @Size(value=4096) [] IST_top_guard;
    }
}

