/*
 * Decompiled with CFR 0.153-SNAPSHOT (d6f6758-dirty).
 */
package me.bechberger.ebpf.runtime;

import me.bechberger.ebpf.annotations.InlineUnion;
import me.bechberger.ebpf.annotations.OriginalName;
import me.bechberger.ebpf.annotations.Size;
import me.bechberger.ebpf.annotations.Type;
import me.bechberger.ebpf.annotations.Unsigned;
import me.bechberger.ebpf.annotations.bpf.BuiltinBPFFunction;
import me.bechberger.ebpf.annotations.bpf.MethodIsBPFRelatedFunction;
import me.bechberger.ebpf.annotations.bpf.NotUsableInJava;
import me.bechberger.ebpf.runtime.BacklightDefinitions;
import me.bechberger.ebpf.runtime.DelayedDefinitions;
import me.bechberger.ebpf.runtime.ListDefinitions;
import me.bechberger.ebpf.runtime.SeqDefinitions;
import me.bechberger.ebpf.runtime.VmDefinitions;
import me.bechberger.ebpf.runtime.misc;
import me.bechberger.ebpf.runtime.runtime;
import me.bechberger.ebpf.type.Ptr;
import me.bechberger.ebpf.type.Struct;

public final class FbDefinitions {
    @NotUsableInJava
    @BuiltinBPFFunction(value="fb_add_videomode((const struct fb_videomode*)$arg1, $arg2)")
    public static int fb_add_videomode(Ptr<fb_videomode> mode, Ptr<ListDefinitions.list_head> head) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static long fb_compat_ioctl(Ptr<runtime.file> file2, @Unsigned int cmd, @Unsigned long arg2) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void fb_console_init() {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int fb_console_setup(String this_opt) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction(value="fb_delete_videomode((const struct fb_videomode*)$arg1, $arg2)")
    public static void fb_delete_videomode(Ptr<fb_videomode> mode, Ptr<ListDefinitions.list_head> head) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void fb_destroy_modelist(Ptr<ListDefinitions.list_head> head) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction(value="((const struct fb_videomode*)fb_find_best_display((const struct fb_monspecs*)$arg1, $arg2))")
    public static Ptr<fb_videomode> fb_find_best_display(Ptr<fb_monspecs> specs, Ptr<ListDefinitions.list_head> head) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction(value="((const struct fb_videomode*)fb_find_best_mode((const struct fb_var_screeninfo*)$arg1, $arg2))")
    public static Ptr<fb_videomode> fb_find_best_mode(Ptr<fb_var_screeninfo> var, Ptr<ListDefinitions.list_head> head) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction(value="fb_find_mode($arg1, $arg2, (const u8*)$arg3, (const struct fb_videomode*)$arg4, $arg5, (const struct fb_videomode*)$arg6, $arg7)")
    public static int fb_find_mode(Ptr<fb_var_screeninfo> var, Ptr<fb_info> info2, String mode_option, Ptr<fb_videomode> db, @Unsigned int dbsize, Ptr<fb_videomode> default_mode, @Unsigned int default_bpp) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction(value="((const struct fb_videomode*)fb_find_nearest_mode((const struct fb_videomode*)$arg1, $arg2))")
    public static Ptr<fb_videomode> fb_find_nearest_mode(Ptr<fb_videomode> mode, Ptr<ListDefinitions.list_head> head) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void fb_flashcursor(Ptr<misc.work_struct> work) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int fb_getput_cmap(Ptr<fb_info> info2, @Unsigned int cmd, @Unsigned long arg2) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static long fb_ioctl(Ptr<runtime.file> file2, @Unsigned int cmd, @Unsigned long arg2) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction(value="((const struct fb_videomode*)fb_match_mode((const struct fb_var_screeninfo*)$arg1, $arg2))")
    public static Ptr<fb_videomode> fb_match_mode(Ptr<fb_var_screeninfo> var, Ptr<ListDefinitions.list_head> head) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int fb_mmap(Ptr<runtime.file> file2, Ptr<VmDefinitions.vm_area_struct> vma) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction(value="fb_mode_is_equal((const struct fb_videomode*)$arg1, (const struct fb_videomode*)$arg2)")
    public static int fb_mode_is_equal(Ptr<fb_videomode> mode1, Ptr<fb_videomode> mode2) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int fb_notifier_callback(Ptr<misc.notifier_block> self, @Unsigned long event2, Ptr<?> data) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int fb_open(Ptr<runtime.inode> inode2, Ptr<runtime.file> file2) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static @OriginalName(value="ssize_t") long fb_read(Ptr<runtime.file> file2, String buf, @Unsigned long count, Ptr<@OriginalName(value="loff_t") Long> ppos) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int fb_register_chrdev() {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int fb_release(Ptr<runtime.inode> inode2, Ptr<runtime.file> file2) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction(value="fb_try_mode($arg1, $arg2, (const struct fb_videomode*)$arg3, $arg4)")
    public static int fb_try_mode(Ptr<fb_var_screeninfo> var, Ptr<fb_info> info2, Ptr<fb_videomode> mode, @Unsigned int bpp) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void fb_unregister_chrdev() {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction(value="fb_var_to_videomode($arg1, (const struct fb_var_screeninfo*)$arg2)")
    public static void fb_var_to_videomode(Ptr<fb_videomode> mode, Ptr<fb_var_screeninfo> var) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction(value="fb_videomode_to_modelist((const struct fb_videomode*)$arg1, $arg2, $arg3)")
    public static void fb_videomode_to_modelist(Ptr<fb_videomode> modedb, int num, Ptr<ListDefinitions.list_head> head) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction(value="fb_videomode_to_var($arg1, (const struct fb_videomode*)$arg2)")
    public static void fb_videomode_to_var(Ptr<fb_var_screeninfo> var, Ptr<fb_videomode> mode) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction(value="fb_write($arg1, (const u8*)$arg2, $arg3, $arg4)")
    public static @OriginalName(value="ssize_t") long fb_write(Ptr<runtime.file> file2, String buf, @Unsigned long count, Ptr<@OriginalName(value="loff_t") Long> ppos) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int fb_blank(Ptr<fb_info> info2, int blank2) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction(value="fb_create_modedb($arg1, $arg2, (const struct fb_monspecs*)$arg3)")
    public static Ptr<fb_videomode> fb_create_modedb(String edid2, Ptr<Integer> dbsize, Ptr<fb_monspecs> specs) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void fb_destroy_modedb(Ptr<fb_videomode> modedb) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int fb_device_create(Ptr<fb_info> fb_info2) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void fb_device_destroy(Ptr<fb_info> fb_info2) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void fb_edid_to_monspecs(String edid2, Ptr<fb_monspecs> specs) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction(value="((const u8*)fb_firmware_edid($arg1))")
    public static String fb_firmware_edid(Ptr<runtime.device> device2) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static String fb_get_buffer_offset(Ptr<fb_info> info2, Ptr<fb_pixmap> buf, @Unsigned int size) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int fb_get_color_depth(Ptr<fb_var_screeninfo> var, Ptr<fb_fix_screeninfo> fix) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int fb_get_mode(int flags, @Unsigned int val, Ptr<fb_var_screeninfo> var, Ptr<fb_info> info2) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int fb_get_monitor_limits(String edid2, Ptr<fb_monspecs> specs) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction(value="fb_modesetting_disabled((const u8*)$arg1)")
    public static boolean fb_modesetting_disabled(String drvname) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int fb_new_modelist(Ptr<fb_info> info2) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void fb_pad_aligned_buffer(Ptr<Character> dst, @Unsigned int d_pitch, Ptr<Character> src, @Unsigned int s_pitch, @Unsigned int height) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void fb_pad_unaligned_buffer(Ptr<Character> dst, @Unsigned int d_pitch, Ptr<Character> src, @Unsigned int idx, @Unsigned int height, @Unsigned int shift_high, @Unsigned int shift_low, @Unsigned int mod) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int fb_pan_display(Ptr<fb_info> info2, Ptr<fb_var_screeninfo> var) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int fb_parse_edid(String edid2, Ptr<fb_var_screeninfo> var) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void fb_set_suspend(Ptr<fb_info> info2, int state2) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int fb_set_var(Ptr<fb_info> info2, Ptr<fb_var_screeninfo> var) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void fb_timings_dclk(Ptr<__fb_timings> timings) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void fb_timings_hfreq(Ptr<__fb_timings> timings) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void fb_timings_vfreq(Ptr<__fb_timings> timings) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int fb_tunnels_only_for_init_net_sysctl_setup(String str) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction(value="fb_validate_mode((const struct fb_var_screeninfo*)$arg1, $arg2)")
    public static int fb_validate_mode(Ptr<fb_var_screeninfo> var, Ptr<fb_info> info2) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction(value="fb_videomode_from_videomode((const struct videomode*)$arg1, $arg2)")
    public static int fb_videomode_from_videomode(Ptr<runtime.videomode> vm, Ptr<fb_videomode> fbmode) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void fb_bl_default_curve(Ptr<fb_info> fb_info2, char off, char min, char max) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static Ptr<BacklightDefinitions.backlight_device> fb_bl_device(Ptr<fb_info> info2) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void fb_cleanup_procfs() {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void fb_cvt_print_name(Ptr<fb_cvt_data> cvt) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int fb_find_mode_cvt(Ptr<fb_videomode> mode, int margins, int rb) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction(value="fb_get_options((const u8*)$arg1, $arg2)")
    public static int fb_get_options(String name, Ptr<String> option) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int fb_init_procfs() {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int fb_notifier_call_chain(@Unsigned long val, Ptr<?> v) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int fb_register_client(Ptr<misc.notifier_block> nb) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static Ptr<?> fb_seq_next(Ptr<SeqDefinitions.seq_file> m, Ptr<?> v, Ptr<@OriginalName(value="loff_t") Long> pos) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int fb_seq_show(Ptr<SeqDefinitions.seq_file> m, Ptr<?> v) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static Ptr<?> fb_seq_start(Ptr<SeqDefinitions.seq_file> m, Ptr<@OriginalName(value="loff_t") Long> pos) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void fb_seq_stop(Ptr<SeqDefinitions.seq_file> m, Ptr<?> v) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int fb_unregister_client(Ptr<misc.notifier_block> nb) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int fb_alloc_cmap(Ptr<fb_cmap> cmap, int len, int transp) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int fb_alloc_cmap_gfp(Ptr<fb_cmap> cmap, int len, int transp, @Unsigned @OriginalName(value="gfp_t") int flags) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction(value="fb_cmap_to_user((const struct fb_cmap*)$arg1, $arg2)")
    public static int fb_cmap_to_user(Ptr<fb_cmap> from, Ptr<fb_cmap_user> to) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction(value="fb_copy_cmap((const struct fb_cmap*)$arg1, $arg2)")
    public static int fb_copy_cmap(Ptr<fb_cmap> from, Ptr<fb_cmap> to) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void fb_dealloc_cmap(Ptr<fb_cmap> cmap) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction(value="((const struct fb_cmap*)fb_default_cmap($arg1))")
    public static Ptr<fb_cmap> fb_default_cmap(int len) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void fb_deferred_io_cleanup(Ptr<fb_info> info2) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static @Unsigned @OriginalName(value="vm_fault_t") int fb_deferred_io_fault(Ptr<VmDefinitions.vm_fault> vmf) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int fb_deferred_io_fsync(Ptr<runtime.file> file2, @OriginalName(value="loff_t") long start, @OriginalName(value="loff_t") long end, int datasync) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int fb_deferred_io_init(Ptr<fb_info> info2) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static @Unsigned @OriginalName(value="vm_fault_t") int fb_deferred_io_mkwrite(Ptr<VmDefinitions.vm_fault> vmf) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int fb_deferred_io_mmap(Ptr<fb_info> info2, Ptr<VmDefinitions.vm_area_struct> vma) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void fb_deferred_io_open(Ptr<fb_info> info2, Ptr<runtime.inode> inode2, Ptr<runtime.file> file2) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void fb_deferred_io_release(Ptr<fb_info> info2) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static @Unsigned @OriginalName(value="vm_fault_t") int fb_deferred_io_track_page(Ptr<fb_info> info2, @Unsigned long offset, Ptr<runtime.page> page2) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void fb_deferred_io_work(Ptr<misc.work_struct> work) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void fb_invert_cmaps() {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int fb_io_mmap(Ptr<fb_info> info2, Ptr<VmDefinitions.vm_area_struct> vma) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static @OriginalName(value="ssize_t") long fb_io_read(Ptr<fb_info> info2, String buf, @Unsigned long count, Ptr<@OriginalName(value="loff_t") Long> ppos) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction(value="fb_io_write($arg1, (const u8*)$arg2, $arg3, $arg4)")
    public static @OriginalName(value="ssize_t") long fb_io_write(Ptr<fb_info> info2, String buf, @Unsigned long count, Ptr<@OriginalName(value="loff_t") Long> ppos) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int fb_set_cmap(Ptr<fb_cmap> cmap, Ptr<fb_info> info2) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int fb_set_user_cmap(Ptr<fb_cmap_user> cmap, Ptr<fb_info> info2) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static @OriginalName(value="ssize_t") long fb_sys_read(Ptr<fb_info> info2, String buf, @Unsigned long count, Ptr<@OriginalName(value="loff_t") Long> ppos) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction(value="fb_sys_write($arg1, (const u8*)$arg2, $arg3, $arg4)")
    public static @OriginalName(value="ssize_t") long fb_sys_write(Ptr<fb_info> info2, String buf, @Unsigned long count, Ptr<@OriginalName(value="loff_t") Long> ppos) {
        throw new MethodIsBPFRelatedFunction();
    }

    @Type(noCCodeGeneration=true, cType="struct fbcurpos")
    @NotUsableInJava
    public static class fbcurpos
    extends Struct {
        public @Unsigned short x;
        public @Unsigned short y;
    }

    @Type(noCCodeGeneration=true, cType="struct fb_cvt_data")
    @NotUsableInJava
    public static class fb_cvt_data
    extends Struct {
        public @Unsigned int xres;
        public @Unsigned int yres;
        public @Unsigned int refresh;
        public @Unsigned int f_refresh;
        public @Unsigned int pixclock;
        public @Unsigned int hperiod;
        public @Unsigned int hblank;
        public @Unsigned int hfreq;
        public @Unsigned int htotal;
        public @Unsigned int vtotal;
        public @Unsigned int vsync;
        public @Unsigned int hsync;
        public @Unsigned int h_front_porch;
        public @Unsigned int h_back_porch;
        public @Unsigned int v_front_porch;
        public @Unsigned int v_back_porch;
        public @Unsigned int h_margin;
        public @Unsigned int v_margin;
        public @Unsigned int interlace;
        public @Unsigned int aspect_ratio;
        public @Unsigned int active_pixels;
        public @Unsigned int flags;
        public @Unsigned int status;
    }

    @Type(noCCodeGeneration=true, cType="struct __fb_timings")
    @NotUsableInJava
    public static class __fb_timings
    extends Struct {
        public @Unsigned int dclk;
        public @Unsigned int hfreq;
        public @Unsigned int vfreq;
        public @Unsigned int hactive;
        public @Unsigned int vactive;
        public @Unsigned int hblank;
        public @Unsigned int vblank;
        public @Unsigned int htotal;
        public @Unsigned int vtotal;
    }

    @Type(noCCodeGeneration=true, cType="struct fb_con2fbmap")
    @NotUsableInJava
    public static class fb_con2fbmap
    extends Struct {
        public @Unsigned int console;
        public @Unsigned int framebuffer;
    }

    @Type(noCCodeGeneration=true, cType="struct fb_cmap32")
    @NotUsableInJava
    public static class fb_cmap32
    extends Struct {
        public @Unsigned int start;
        public @Unsigned int len;
        public @Unsigned @OriginalName(value="compat_caddr_t") int red;
        public @Unsigned @OriginalName(value="compat_caddr_t") int green;
        public @Unsigned @OriginalName(value="compat_caddr_t") int blue;
        public @Unsigned @OriginalName(value="compat_caddr_t") int transp;
    }

    @Type(noCCodeGeneration=true, cType="struct fb_fix_screeninfo32")
    @NotUsableInJava
    public static class fb_fix_screeninfo32
    extends Struct {
        public char @Size(value=16) [] id;
        public @Unsigned @OriginalName(value="compat_caddr_t") int smem_start;
        public @Unsigned int smem_len;
        public @Unsigned int type;
        public @Unsigned int type_aux;
        public @Unsigned int visual;
        public @Unsigned short xpanstep;
        public @Unsigned short ypanstep;
        public @Unsigned short ywrapstep;
        public @Unsigned int line_length;
        public @Unsigned @OriginalName(value="compat_caddr_t") int mmio_start;
        public @Unsigned int mmio_len;
        public @Unsigned int accel;
        public @Unsigned short @Size(value=3) [] reserved;
    }

    @Type(noCCodeGeneration=true, cType="struct fb_modelist")
    @NotUsableInJava
    public static class fb_modelist
    extends Struct {
        public ListDefinitions.list_head list;
        public fb_videomode mode;
    }

    @Type(noCCodeGeneration=true, cType="struct fb_event")
    @NotUsableInJava
    public static class fb_event
    extends Struct {
        public Ptr<fb_info> info;
        public Ptr<?> data;
    }

    @Type(noCCodeGeneration=true, cType="struct fb_tile_ops")
    @NotUsableInJava
    public static class fb_tile_ops
    extends Struct {
        public Ptr<?> fb_settile;
        public Ptr<?> fb_tilecopy;
        public Ptr<?> fb_tilefill;
        public Ptr<?> fb_tileblit;
        public Ptr<?> fb_tilecursor;
        public Ptr<?> fb_get_tilemax;
    }

    @Type(noCCodeGeneration=true, cType="struct fb_tilecursor")
    @NotUsableInJava
    public static class fb_tilecursor
    extends Struct {
        public @Unsigned int sx;
        public @Unsigned int sy;
        public @Unsigned int mode;
        public @Unsigned int shape;
        public @Unsigned int fg;
        public @Unsigned int bg;
    }

    @Type(noCCodeGeneration=true, cType="struct fb_tileblit")
    @NotUsableInJava
    public static class fb_tileblit
    extends Struct {
        public @Unsigned int sx;
        public @Unsigned int sy;
        public @Unsigned int width;
        public @Unsigned int height;
        public @Unsigned int fg;
        public @Unsigned int bg;
        public @Unsigned int length;
        public Ptr<@Unsigned Integer> indices;
    }

    @Type(noCCodeGeneration=true, cType="struct fb_tilearea")
    @NotUsableInJava
    public static class fb_tilearea
    extends Struct {
        public @Unsigned int sx;
        public @Unsigned int sy;
        public @Unsigned int dx;
        public @Unsigned int dy;
        public @Unsigned int width;
        public @Unsigned int height;
    }

    @Type(noCCodeGeneration=true, cType="struct fb_tilerect")
    @NotUsableInJava
    public static class fb_tilerect
    extends Struct {
        public @Unsigned int sx;
        public @Unsigned int sy;
        public @Unsigned int width;
        public @Unsigned int height;
        public @Unsigned int index;
        public @Unsigned int fg;
        public @Unsigned int bg;
        public @Unsigned int rop;
    }

    @Type(noCCodeGeneration=true, cType="struct fb_tilemap")
    @NotUsableInJava
    public static class fb_tilemap
    extends Struct {
        public @Unsigned int width;
        public @Unsigned int height;
        public @Unsigned int depth;
        public @Unsigned int length;
        public Ptr<Character> data;
    }

    @Type(noCCodeGeneration=true, cType="struct fb_ops")
    @NotUsableInJava
    public static class fb_ops
    extends Struct {
        public Ptr<runtime.module> owner;
        public Ptr<?> fb_open;
        public Ptr<?> fb_release;
        public Ptr<?> fb_read;
        public Ptr<?> fb_write;
        public Ptr<?> fb_check_var;
        public Ptr<?> fb_set_par;
        public Ptr<?> fb_setcolreg;
        public Ptr<?> fb_setcmap;
        public Ptr<?> fb_blank;
        public Ptr<?> fb_pan_display;
        public Ptr<?> fb_fillrect;
        public Ptr<?> fb_copyarea;
        public Ptr<?> fb_imageblit;
        public Ptr<?> fb_cursor;
        public Ptr<?> fb_sync;
        public Ptr<?> fb_ioctl;
        public Ptr<?> fb_compat_ioctl;
        public Ptr<?> fb_mmap;
        public Ptr<?> fb_get_caps;
        public Ptr<?> fb_destroy;
        public Ptr<?> fb_debug_enter;
        public Ptr<?> fb_debug_leave;
    }

    @Type(noCCodeGeneration=true, cType="struct fb_deferred_io")
    @NotUsableInJava
    public static class fb_deferred_io
    extends Struct {
        public @Unsigned long delay;
        public boolean sort_pagereflist;
        public int open_count;
        public runtime.mutex lock;
        public ListDefinitions.list_head pagereflist;
        public Ptr<?> get_page;
        public Ptr<?> deferred_io;
    }

    @Type(noCCodeGeneration=true, cType="struct fb_deferred_io_pageref")
    @NotUsableInJava
    public static class fb_deferred_io_pageref
    extends Struct {
        public Ptr<runtime.page> page;
        public @Unsigned long offset;
        public ListDefinitions.list_head list;
    }

    @Type(noCCodeGeneration=true, cType="struct fb_pixmap")
    @NotUsableInJava
    public static class fb_pixmap
    extends Struct {
        public Ptr<Character> addr;
        public @Unsigned int size;
        public @Unsigned int offset;
        public @Unsigned int buf_align;
        public @Unsigned int scan_align;
        public @Unsigned int access_align;
        public @Unsigned int flags;
        public @Unsigned long @Size(value=1) [] blit_x;
        public @Unsigned long @Size(value=2) [] blit_y;
        public Ptr<?> writeio;
        public Ptr<?> readio;
    }

    @Type(noCCodeGeneration=true, cType="struct fb_blit_caps")
    @NotUsableInJava
    public static class fb_blit_caps
    extends Struct {
        public @Unsigned long @Size(value=1) [] x;
        public @Unsigned long @Size(value=2) [] y;
        public @Unsigned int len;
        public @Unsigned int flags;
    }

    @Type(noCCodeGeneration=true, cType="struct fb_info")
    @NotUsableInJava
    public static class fb_info
    extends Struct {
        public @OriginalName(value="refcount_t") misc.refcount_struct count;
        public int node;
        public int flags;
        public int fbcon_rotate_hint;
        public runtime.mutex lock;
        public runtime.mutex mm_lock;
        public fb_var_screeninfo var;
        public fb_fix_screeninfo fix;
        public fb_monspecs monspecs;
        public fb_pixmap pixmap;
        public fb_pixmap sprite;
        public fb_cmap cmap;
        public ListDefinitions.list_head modelist;
        public Ptr<fb_videomode> mode;
        public Ptr<BacklightDefinitions.backlight_device> bl_dev;
        public runtime.mutex bl_curve_mutex;
        public char @Size(value=128) [] bl_curve;
        public DelayedDefinitions.delayed_work deferred_work;
        public @Unsigned long npagerefs;
        public Ptr<fb_deferred_io_pageref> pagerefs;
        public Ptr<fb_deferred_io> fbdefio;
        public Ptr<fb_ops> fbops;
        public Ptr<runtime.device> device;
        public Ptr<runtime.device> dev;
        public int class_flag;
        public Ptr<fb_tile_ops> tileops;
        @InlineUnion(value=16447)
        public @InlineUnion(value=16447) String screen_base;
        @InlineUnion(value=16447)
        public @InlineUnion(value=16447) String screen_buffer;
        public @Unsigned long screen_size;
        public Ptr<?> pseudo_palette;
        public @Unsigned int state;
        public Ptr<?> fbcon_par;
        public Ptr<?> par;
        public boolean skip_vt_switch;
        public boolean skip_panic;
    }

    @Type(noCCodeGeneration=true, cType="struct fb_cmap_user")
    @NotUsableInJava
    public static class fb_cmap_user
    extends Struct {
        public @Unsigned int start;
        public @Unsigned int len;
        public Ptr<@Unsigned Short> red;
        public Ptr<@Unsigned Short> green;
        public Ptr<@Unsigned Short> blue;
        public Ptr<@Unsigned Short> transp;
    }

    @Type(noCCodeGeneration=true, cType="struct fb_videomode")
    @NotUsableInJava
    public static class fb_videomode
    extends Struct {
        public String name;
        public @Unsigned int refresh;
        public @Unsigned int xres;
        public @Unsigned int yres;
        public @Unsigned int pixclock;
        public @Unsigned int left_margin;
        public @Unsigned int right_margin;
        public @Unsigned int upper_margin;
        public @Unsigned int lower_margin;
        public @Unsigned int hsync_len;
        public @Unsigned int vsync_len;
        public @Unsigned int sync;
        public @Unsigned int vmode;
        public @Unsigned int flag;
    }

    @Type(noCCodeGeneration=true, cType="struct fb_monspecs")
    @NotUsableInJava
    public static class fb_monspecs
    extends Struct {
        public fb_chroma chroma;
        public Ptr<fb_videomode> modedb;
        public char @Size(value=4) [] manufacturer;
        public char @Size(value=14) [] monitor;
        public char @Size(value=14) [] serial_no;
        public char @Size(value=14) [] ascii;
        public @Unsigned int modedb_len;
        public @Unsigned int model;
        public @Unsigned int serial;
        public @Unsigned int year;
        public @Unsigned int week;
        public @Unsigned int hfmin;
        public @Unsigned int hfmax;
        public @Unsigned int dclkmin;
        public @Unsigned int dclkmax;
        public @Unsigned short input;
        public @Unsigned short dpms;
        public @Unsigned short signal;
        public @Unsigned short vfmin;
        public @Unsigned short vfmax;
        public @Unsigned short gamma;
        public @Unsigned short gtf;
        public @Unsigned short misc;
        public char version;
        public char revision;
        public char max_x;
        public char max_y;
    }

    @Type(noCCodeGeneration=true, cType="struct fb_chroma")
    @NotUsableInJava
    public static class fb_chroma
    extends Struct {
        public @Unsigned int redx;
        public @Unsigned int greenx;
        public @Unsigned int bluex;
        public @Unsigned int whitex;
        public @Unsigned int redy;
        public @Unsigned int greeny;
        public @Unsigned int bluey;
        public @Unsigned int whitey;
    }

    @Type(noCCodeGeneration=true, cType="struct fb_cursor")
    @NotUsableInJava
    public static class fb_cursor
    extends Struct {
        public @Unsigned short set;
        public @Unsigned short enable;
        public @Unsigned short rop;
        public String mask;
        public fbcurpos hot;
        public fb_image image;
    }

    @Type(noCCodeGeneration=true, cType="struct fb_image")
    @NotUsableInJava
    public static class fb_image
    extends Struct {
        public @Unsigned int dx;
        public @Unsigned int dy;
        public @Unsigned int width;
        public @Unsigned int height;
        public @Unsigned int fg_color;
        public @Unsigned int bg_color;
        public char depth;
        public String data;
        public fb_cmap cmap;
    }

    @Type(noCCodeGeneration=true, cType="struct fb_fillrect")
    @NotUsableInJava
    public static class fb_fillrect
    extends Struct {
        public @Unsigned int dx;
        public @Unsigned int dy;
        public @Unsigned int width;
        public @Unsigned int height;
        public @Unsigned int color;
        public @Unsigned int rop;
    }

    @Type(noCCodeGeneration=true, cType="struct fb_copyarea")
    @NotUsableInJava
    public static class fb_copyarea
    extends Struct {
        public @Unsigned int dx;
        public @Unsigned int dy;
        public @Unsigned int width;
        public @Unsigned int height;
        public @Unsigned int sx;
        public @Unsigned int sy;
    }

    @Type(noCCodeGeneration=true, cType="struct fb_cmap")
    @NotUsableInJava
    public static class fb_cmap
    extends Struct {
        public @Unsigned int start;
        public @Unsigned int len;
        public Ptr<@Unsigned Short> red;
        public Ptr<@Unsigned Short> green;
        public Ptr<@Unsigned Short> blue;
        public Ptr<@Unsigned Short> transp;
    }

    @Type(noCCodeGeneration=true, cType="struct fb_var_screeninfo")
    @NotUsableInJava
    public static class fb_var_screeninfo
    extends Struct {
        public @Unsigned int xres;
        public @Unsigned int yres;
        public @Unsigned int xres_virtual;
        public @Unsigned int yres_virtual;
        public @Unsigned int xoffset;
        public @Unsigned int yoffset;
        public @Unsigned int bits_per_pixel;
        public @Unsigned int grayscale;
        public fb_bitfield red;
        public fb_bitfield green;
        public fb_bitfield blue;
        public fb_bitfield transp;
        public @Unsigned int nonstd;
        public @Unsigned int activate;
        public @Unsigned int height;
        public @Unsigned int width;
        public @Unsigned int accel_flags;
        public @Unsigned int pixclock;
        public @Unsigned int left_margin;
        public @Unsigned int right_margin;
        public @Unsigned int upper_margin;
        public @Unsigned int lower_margin;
        public @Unsigned int hsync_len;
        public @Unsigned int vsync_len;
        public @Unsigned int sync;
        public @Unsigned int vmode;
        public @Unsigned int rotate;
        public @Unsigned int colorspace;
        public @Unsigned int @Size(value=4) [] reserved;
    }

    @Type(noCCodeGeneration=true, cType="struct fb_bitfield")
    @NotUsableInJava
    public static class fb_bitfield
    extends Struct {
        public @Unsigned int offset;
        public @Unsigned int length;
        public @Unsigned int msb_right;
    }

    @Type(noCCodeGeneration=true, cType="struct fb_fix_screeninfo")
    @NotUsableInJava
    public static class fb_fix_screeninfo
    extends Struct {
        public char @Size(value=16) [] id;
        public @Unsigned long smem_start;
        public @Unsigned int smem_len;
        public @Unsigned int type;
        public @Unsigned int type_aux;
        public @Unsigned int visual;
        public @Unsigned short xpanstep;
        public @Unsigned short ypanstep;
        public @Unsigned short ywrapstep;
        public @Unsigned int line_length;
        public @Unsigned long mmio_start;
        public @Unsigned int mmio_len;
        public @Unsigned int accel;
        public @Unsigned short capabilities;
        public @Unsigned short @Size(value=2) [] reserved;
    }
}

