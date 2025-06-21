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
import me.bechberger.ebpf.runtime.SeqDefinitions;
import me.bechberger.ebpf.runtime.runtime;
import me.bechberger.ebpf.type.Ptr;
import me.bechberger.ebpf.type.Struct;

public final class MtrrDefinitions {
    @NotUsableInJava
    @BuiltinBPFFunction(value="((const u8*)mtrr_attrib_to_str($arg1))")
    public static String mtrr_attrib_to_str(int x) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int mtrr_cleanup() {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int mtrr_close(Ptr<runtime.inode> ino, Ptr<runtime.file> file2) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int mtrr_if_init() {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static long mtrr_ioctl(Ptr<runtime.file> file2, @Unsigned int cmd, @Unsigned long __arg) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int mtrr_open(Ptr<runtime.inode> inode2, Ptr<runtime.file> file2) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void mtrr_print_out_one_result(int i) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int mtrr_seq_show(Ptr<SeqDefinitions.seq_file> seq, Ptr<?> offset) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int mtrr_trim_uncached_memory(@Unsigned long end_pfn) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction(value="mtrr_write($arg1, (const u8*)$arg2, $arg3, $arg4)")
    public static @OriginalName(value="ssize_t") long mtrr_write(Ptr<runtime.file> file2, String buf, @Unsigned long len, Ptr<@OriginalName(value="loff_t") Long> ppos) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int mtrr_add(@Unsigned long base, @Unsigned long size, @Unsigned int type2, boolean increment) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int mtrr_add_page(@Unsigned long base, @Unsigned long size, @Unsigned int type2, boolean increment) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void mtrr_bp_init() {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int mtrr_check(@Unsigned long base, @Unsigned long size) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int mtrr_del(int reg, @Unsigned long base, @Unsigned long size) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int mtrr_del_page(int reg, @Unsigned long base, @Unsigned long size) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int mtrr_init_finalize() {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int mtrr_rendezvous_handler(Ptr<?> info2) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void mtrr_save_state() {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void mtrr_build_map() {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void mtrr_copy_map() {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void mtrr_disable() {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void mtrr_enable() {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void mtrr_generic_set_state() {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void mtrr_overwrite_state(Ptr<mtrr_var_range> var, @Unsigned int num_var, @OriginalName(value="mtrr_type") char def_type) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int mtrr_param_setup(String str) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void mtrr_save_fixed_ranges(Ptr<?> info2) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void mtrr_state_warn() {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static char mtrr_type_lookup(@Unsigned long start, @Unsigned long end, Ptr<Character> uniform) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void mtrr_wrmsr(@Unsigned int msr2, @Unsigned int a, @Unsigned int b) {
        throw new MethodIsBPFRelatedFunction();
    }

    @Type(noCCodeGeneration=true, cType="struct mtrr_cleanup_result")
    @NotUsableInJava
    public static class mtrr_cleanup_result
    extends Struct {
        public @Unsigned long gran_sizek;
        public @Unsigned long chunk_sizek;
        public @Unsigned long lose_cover_sizek;
        public @Unsigned int num_reg;
        public int bad;
    }

    @Type(noCCodeGeneration=true, cType="struct mtrr_gentry32")
    @NotUsableInJava
    public static class mtrr_gentry32
    extends Struct {
        public @Unsigned @OriginalName(value="compat_ulong_t") int regnum;
        public @Unsigned @OriginalName(value="compat_uint_t") int base;
        public @Unsigned @OriginalName(value="compat_uint_t") int size;
        public @Unsigned @OriginalName(value="compat_uint_t") int type;
    }

    @Type(noCCodeGeneration=true, cType="struct mtrr_sentry32")
    @NotUsableInJava
    public static class mtrr_sentry32
    extends Struct {
        public @Unsigned @OriginalName(value="compat_ulong_t") int base;
        public @Unsigned @OriginalName(value="compat_uint_t") int size;
        public @Unsigned @OriginalName(value="compat_uint_t") int type;
    }

    @Type(noCCodeGeneration=true, cType="struct mtrr_gentry")
    @NotUsableInJava
    public static class mtrr_gentry
    extends Struct {
        public @Unsigned long base;
        public @Unsigned int size;
        public @Unsigned int regnum;
        public @Unsigned int type;
        public @Unsigned int _pad;
    }

    @Type(noCCodeGeneration=true, cType="struct mtrr_sentry")
    @NotUsableInJava
    public static class mtrr_sentry
    extends Struct {
        public @Unsigned long base;
        public @Unsigned int size;
        public @Unsigned int type;
    }

    @Type(noCCodeGeneration=true, cType="struct mtrr_ops")
    @NotUsableInJava
    public static class mtrr_ops
    extends Struct {
        public @Unsigned int var_regs;
        public Ptr<?> set;
        public Ptr<?> get;
        public Ptr<?> get_free_region;
        public Ptr<?> validate_add_page;
        public Ptr<?> have_wrcomb;
    }

    @Type(noCCodeGeneration=true, cType="struct mtrr_state_type")
    @NotUsableInJava
    public static class mtrr_state_type
    extends Struct {
        public mtrr_var_range @Size(value=256) [] var_ranges;
        public @OriginalName(value="mtrr_type") char @Size(value=88) [] fixed_ranges;
        public char enabled;
        public boolean have_fixed;
        public @OriginalName(value="mtrr_type") char def_type;
    }

    @Type(noCCodeGeneration=true, cType="struct mtrr_var_range")
    @NotUsableInJava
    public static class mtrr_var_range
    extends Struct {
        public @Unsigned int base_lo;
        public @Unsigned int base_hi;
        public @Unsigned int mask_lo;
        public @Unsigned int mask_hi;
    }
}

