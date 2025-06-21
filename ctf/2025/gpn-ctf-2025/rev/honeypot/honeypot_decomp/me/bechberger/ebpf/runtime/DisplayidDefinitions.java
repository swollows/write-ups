/*
 * Decompiled with CFR 0.153-SNAPSHOT (d6f6758-dirty).
 */
package me.bechberger.ebpf.runtime;

import me.bechberger.ebpf.annotations.Size;
import me.bechberger.ebpf.annotations.Type;
import me.bechberger.ebpf.annotations.bpf.BuiltinBPFFunction;
import me.bechberger.ebpf.annotations.bpf.MethodIsBPFRelatedFunction;
import me.bechberger.ebpf.annotations.bpf.NotUsableInJava;
import me.bechberger.ebpf.runtime.DrmDefinitions;
import me.bechberger.ebpf.type.Ptr;
import me.bechberger.ebpf.type.Struct;

public final class DisplayidDefinitions {
    @NotUsableInJava
    @BuiltinBPFFunction(value="((const struct displayid_block*)__displayid_iter_next($arg1))")
    public static Ptr<displayid_block> __displayid_iter_next(Ptr<displayid_iter> iter2) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction(value="displayid_iter_edid_begin((const struct drm_edid*)$arg1, $arg2)")
    public static void displayid_iter_edid_begin(Ptr<DrmDefinitions.drm_edid> drm_edid2, Ptr<displayid_iter> iter2) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void displayid_iter_end(Ptr<displayid_iter> iter2) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction(value="displayid_primary_use((const struct displayid_iter*)$arg1)")
    public static char displayid_primary_use(Ptr<displayid_iter> iter2) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction(value="displayid_version((const struct displayid_iter*)$arg1)")
    public static char displayid_version(Ptr<displayid_iter> iter2) {
        throw new MethodIsBPFRelatedFunction();
    }

    @Type(noCCodeGeneration=true, cType="struct displayid_vesa_vendor_specific_block")
    @NotUsableInJava
    public static class displayid_vesa_vendor_specific_block
    extends Struct {
        public displayid_block base;
        public char @Size(value=3) [] oui;
        public char data_structure_type;
        public char mso;
    }

    @Type(noCCodeGeneration=true, cType="struct displayid_detailed_timing_block")
    @NotUsableInJava
    public static class displayid_detailed_timing_block
    extends Struct {
        public displayid_block base;
        public displayid_detailed_timings_1 @Size(value=0) [] timings;
    }

    @Type(noCCodeGeneration=true, cType="struct displayid_detailed_timings_1")
    @NotUsableInJava
    public static class displayid_detailed_timings_1
    extends Struct {
        public char @Size(value=3) [] pixel_clock;
        public char flags;
        public char @Size(value=2) [] hactive;
        public char @Size(value=2) [] hblank;
        public char @Size(value=2) [] hsync;
        public char @Size(value=2) [] hsw;
        public char @Size(value=2) [] vactive;
        public char @Size(value=2) [] vblank;
        public char @Size(value=2) [] vsync;
        public char @Size(value=2) [] vsw;
    }

    @Type(noCCodeGeneration=true, cType="struct displayid_tiled_block")
    @NotUsableInJava
    public static class displayid_tiled_block
    extends Struct {
        public displayid_block base;
        public char tile_cap;
        public char @Size(value=3) [] topo;
        public char @Size(value=4) [] tile_size;
        public char @Size(value=5) [] tile_pixel_bezel;
        public char @Size(value=8) [] topology_id;
    }

    @Type(noCCodeGeneration=true, cType="struct displayid_iter")
    @NotUsableInJava
    public static class displayid_iter
    extends Struct {
        public Ptr<DrmDefinitions.drm_edid> drm_edid;
        public Ptr<Character> section;
        public int length;
        public int idx;
        public int ext_index;
        public char version;
        public char primary_use;
    }

    @Type(noCCodeGeneration=true, cType="struct displayid_block")
    @NotUsableInJava
    public static class displayid_block
    extends Struct {
        public char tag;
        public char rev;
        public char num_bytes;
    }

    @Type(noCCodeGeneration=true, cType="struct displayid_header")
    @NotUsableInJava
    public static class displayid_header
    extends Struct {
        public char rev;
        public char bytes;
        public char prod_id;
        public char ext_count;
    }
}

