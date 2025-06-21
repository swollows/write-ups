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
import me.bechberger.ebpf.runtime.ConsoleDefinitions;
import me.bechberger.ebpf.runtime.PtDefinitions;
import me.bechberger.ebpf.runtime.TtyDefinitions;
import me.bechberger.ebpf.runtime.VtDefinitions;
import me.bechberger.ebpf.runtime.WaitDefinitions;
import me.bechberger.ebpf.runtime.misc;
import me.bechberger.ebpf.runtime.runtime;
import me.bechberger.ebpf.type.Enum;
import me.bechberger.ebpf.type.Ptr;
import me.bechberger.ebpf.type.Struct;
import me.bechberger.ebpf.type.TypedEnum;

public final class VcDefinitions {
    @NotUsableInJava
    @BuiltinBPFFunction
    public static int __vc_resize(Ptr<vc_data> vc2, @Unsigned int cols, @Unsigned int rows, boolean from_user) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int vc_allocate(@Unsigned int currcons) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int vc_con_write_normal(Ptr<vc_data> vc2, int tc, int c, Ptr<vc_draw_region> draw) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int vc_cons_allocated(@Unsigned int i) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static Ptr<vc_data> vc_deallocate(@Unsigned int currcons) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int vc_do_resize(Ptr<TtyDefinitions.tty_struct> tty, Ptr<vc_data> vc2, @Unsigned int cols, @Unsigned int lines, boolean from_user) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int vc_do_selection(Ptr<vc_data> vc2, @Unsigned short mode, int ps, int pe) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void vc_init(Ptr<vc_data> vc2, int do_clear) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction(value="vc_is_sel((const struct vc_data*)$arg1)")
    public static boolean vc_is_sel(Ptr<vc_data> vc2) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void vc_port_destruct(Ptr<TtyDefinitions.tty_port> port2) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void vc_reset_params(Ptr<vc_data> vc2) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int vc_selection_store_chars(Ptr<vc_data> vc2, boolean unicode) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void vc_setGx(Ptr<vc_data> vc2, @Unsigned int which, char c) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction(value="vc_t416_color($arg1, $arg2, (void (*)(struct vc_data*, const struct rgb*))$arg3)")
    public static int vc_t416_color(Ptr<vc_data> vc2, int i, Ptr<?> set_color) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int vc_uniscr_check(Ptr<vc_data> vc2) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void vc_uniscr_copy_area(Ptr<Ptr<@Unsigned Integer>> dst_lines, @Unsigned int dst_cols, @Unsigned int dst_rows, Ptr<Ptr<@Unsigned Integer>> src_lines, @Unsigned int src_cols, @Unsigned int src_top_row, @Unsigned int src_bot_row) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction(value="vc_uniscr_copy_line((const struct vc_data*)$arg1, $arg2, $arg3, $arg4, $arg5, $arg6)")
    public static void vc_uniscr_copy_line(Ptr<vc_data> vc2, Ptr<?> dest, boolean viewed, @Unsigned int row, @Unsigned int col, @Unsigned int nr) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void vc_uniscr_delete(Ptr<vc_data> vc2, @Unsigned int nr) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void vc_uniscr_insert(Ptr<vc_data> vc2, @Unsigned int nr) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static misc.es_result vc_do_mmio(Ptr<runtime.ghcb> ghcb2, Ptr<misc.es_em_ctxt> ctxt, @Unsigned int bytes, boolean read2) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static misc.es_result vc_handle_cpuid(Ptr<runtime.ghcb> ghcb2, Ptr<misc.es_em_ctxt> ctxt) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static misc.es_result vc_handle_exitcode(Ptr<misc.es_em_ctxt> ctxt, Ptr<runtime.ghcb> ghcb2, @Unsigned long exit_code) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static misc.es_result vc_handle_ioio(Ptr<runtime.ghcb> ghcb2, Ptr<misc.es_em_ctxt> ctxt) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static misc.es_result vc_handle_mmio(Ptr<runtime.ghcb> ghcb2, Ptr<misc.es_em_ctxt> ctxt) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static misc.es_result vc_init_em_ctxt(Ptr<misc.es_em_ctxt> ctxt, Ptr<PtDefinitions.pt_regs> regs, @Unsigned long exit_code) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static misc.es_result vc_ioio_exitinfo(Ptr<misc.es_em_ctxt> ctxt, Ptr<@Unsigned Long> exitinfo) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static boolean vc_raw_handle_exception(Ptr<PtDefinitions.pt_regs> regs, @Unsigned long error_code) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static misc.es_result vc_read_mem(Ptr<misc.es_em_ctxt> ctxt, String src, String buf, @Unsigned long size) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static Ptr<PtDefinitions.pt_regs> vc_switch_off_ist(Ptr<PtDefinitions.pt_regs> regs) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static misc.es_result vc_write_mem(Ptr<misc.es_em_ctxt> ctxt, String dst, String buf, @Unsigned long size) {
        throw new MethodIsBPFRelatedFunction();
    }

    @Type(noCCodeGeneration=true, cType="struct vc_draw_region")
    @NotUsableInJava
    public static class vc_draw_region
    extends Struct {
        public @Unsigned long from;
        public @Unsigned long to;
        public int x;
    }

    @Type(noCCodeGeneration=true, cType="enum vc_ctl_state")
    public static enum vc_ctl_state implements Enum<vc_ctl_state>,
    TypedEnum<vc_ctl_state, Integer>
    {
        ESnormal,
        ESesc,
        ESsquare,
        ESgetpars,
        ESfunckey,
        EShash,
        ESsetG0,
        ESsetG1,
        ESpercent,
        EScsiignore,
        ESnonstd,
        ESpalette,
        ESosc,
        ESANSI_first,
        ESapc,
        ESpm,
        ESdcs,
        ESANSI_last;

    }

    @Type(noCCodeGeneration=true, cType="struct vc_selection")
    @NotUsableInJava
    public static class vc_selection
    extends Struct {
        public runtime.mutex lock;
        public Ptr<vc_data> cons;
        public String buffer;
        public @Unsigned int buf_len;
        public int start;
        public int end;
    }

    @Type(noCCodeGeneration=true, cType="struct vc_state")
    @NotUsableInJava
    public static class vc_state
    extends Struct {
        public @Unsigned int x;
        public @Unsigned int y;
        public char color;
        public char @Size(value=2) [] Gx_charset;
        public @Unsigned int charset;
        public vc_intensity intensity;
        public boolean italic;
        public boolean underline;
        public boolean blink;
        public boolean reverse;
    }

    @Type(noCCodeGeneration=true, cType="enum vc_intensity")
    public static enum vc_intensity implements Enum<vc_intensity>,
    TypedEnum<vc_intensity, Integer>
    {
        VCI_HALF_BRIGHT,
        VCI_NORMAL,
        VCI_BOLD,
        VCI_MASK;

    }

    @Type(noCCodeGeneration=true, cType="struct vc_data")
    @NotUsableInJava
    public static class vc_data
    extends Struct {
        public TtyDefinitions.tty_port port;
        public vc_state state;
        public vc_state saved_state;
        public @Unsigned short vc_num;
        public @Unsigned int vc_cols;
        public @Unsigned int vc_rows;
        public @Unsigned int vc_size_row;
        public @Unsigned int vc_scan_lines;
        public @Unsigned int vc_cell_height;
        public @Unsigned long vc_origin;
        public @Unsigned long vc_scr_end;
        public @Unsigned long vc_visible_origin;
        public @Unsigned int vc_top;
        public @Unsigned int vc_bottom;
        public Ptr<runtime.consw> vc_sw;
        public Ptr<@Unsigned Short> vc_screenbuf;
        public @Unsigned int vc_screenbuf_size;
        public char vc_mode;
        public char vc_attr;
        public char vc_def_color;
        public char vc_ulcolor;
        public char vc_itcolor;
        public char vc_halfcolor;
        public @Unsigned int vc_cursor_type;
        public @Unsigned short vc_complement_mask;
        public @Unsigned short vc_s_complement_mask;
        public @Unsigned long vc_pos;
        public @Unsigned short vc_hi_font_mask;
        public ConsoleDefinitions.console_font vc_font;
        public @Unsigned short vc_video_erase_char;
        public @Unsigned int vc_state;
        public @Unsigned int vc_npar;
        public @Unsigned int @Size(value=16) [] vc_par;
        public VtDefinitions.vt_mode vt_mode;
        public Ptr<runtime.pid> vt_pid;
        public int vt_newvt;
        public @OriginalName(value="wait_queue_head_t") WaitDefinitions.wait_queue_head paste_wait;
        public @Unsigned int vc_disp_ctrl;
        public @Unsigned int vc_toggle_meta;
        public @Unsigned int vc_decscnm;
        public @Unsigned int vc_decom;
        public @Unsigned int vc_decawm;
        public @Unsigned int vc_deccm;
        public @Unsigned int vc_decim;
        public @Unsigned int vc_priv;
        public @Unsigned int vc_need_wrap;
        public @Unsigned int vc_can_do_color;
        public @Unsigned int vc_report_mouse;
        public char vc_utf;
        public char vc_utf_count;
        public int vc_utf_char;
        public @Unsigned long @Size(value=4) [] vc_tab_stop;
        public char @Size(value=48) [] vc_palette;
        public Ptr<@Unsigned Short> vc_translate;
        public @Unsigned int vc_bell_pitch;
        public @Unsigned int vc_bell_duration;
        public @Unsigned short vc_cur_blink_ms;
        public Ptr<Ptr<vc_data>> vc_display_fg;
        public Ptr<misc.uni_pagedict> uni_pagedict;
        public Ptr<Ptr<misc.uni_pagedict>> uni_pagedict_loc;
        public Ptr<Ptr<@Unsigned Integer>> vc_uni_lines;
    }
}

