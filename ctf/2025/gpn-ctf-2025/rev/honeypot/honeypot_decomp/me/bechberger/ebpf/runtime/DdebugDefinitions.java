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
import me.bechberger.ebpf.runtime.ClassDefinitions;
import me.bechberger.ebpf.runtime.ListDefinitions;
import me.bechberger.ebpf.runtime.SeqDefinitions;
import me.bechberger.ebpf.runtime.misc;
import me.bechberger.ebpf.runtime.runtime;
import me.bechberger.ebpf.type.Ptr;
import me.bechberger.ebpf.type.Struct;

public final class DdebugDefinitions {
    @NotUsableInJava
    @BuiltinBPFFunction(value="ddebug_add_module($arg1, (const u8*)$arg2)")
    public static int ddebug_add_module(Ptr<_ddebug_info> di, String modname) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction(value="ddebug_apply_class_bitmap((const struct ddebug_class_param*)$arg1, $arg2, $arg3)")
    public static int ddebug_apply_class_bitmap(Ptr<ddebug_class_param> dcp, Ptr<@Unsigned Long> new_bits, Ptr<@Unsigned Long> old_bits) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction(value="ddebug_change((const struct ddebug_query*)$arg1, $arg2)")
    public static int ddebug_change(Ptr<ddebug_query> query2, Ptr<misc.flag_settings> modifiers) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction(value="ddebug_dyndbg_boot_param_cb($arg1, $arg2, (const u8*)$arg3, $arg4)")
    public static int ddebug_dyndbg_boot_param_cb(String param2, String val, String unused, Ptr<?> arg2) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction(value="ddebug_dyndbg_module_param_cb($arg1, $arg2, (const u8*)$arg3)")
    public static int ddebug_dyndbg_module_param_cb(String param2, String val, String module2) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction(value="ddebug_exec_queries($arg1, (const u8*)$arg2)")
    public static int ddebug_exec_queries(String query2, String modname) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction(value="ddebug_exec_query($arg1, (const u8*)$arg2)")
    public static int ddebug_exec_query(String query_string, String modname) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int ddebug_module_notify(Ptr<misc.notifier_block> self, @Unsigned long val, Ptr<?> data) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction(value="ddebug_parse_query($arg1, $arg2, $arg3, (const u8*)$arg4)")
    public static int ddebug_parse_query(Ptr<String> words, int nwords, Ptr<ddebug_query> query2, String modname) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static Ptr<?> ddebug_proc_next(Ptr<SeqDefinitions.seq_file> m, Ptr<?> p, Ptr<@OriginalName(value="loff_t") Long> pos) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int ddebug_proc_open(Ptr<runtime.inode> inode2, Ptr<runtime.file> file2) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int ddebug_proc_show(Ptr<SeqDefinitions.seq_file> m, Ptr<?> p) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static Ptr<?> ddebug_proc_start(Ptr<SeqDefinitions.seq_file> m, Ptr<@OriginalName(value="loff_t") Long> pos) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void ddebug_proc_stop(Ptr<SeqDefinitions.seq_file> m, Ptr<?> p) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction(value="ddebug_proc_write($arg1, (const u8*)$arg2, $arg3, $arg4)")
    public static @OriginalName(value="ssize_t") long ddebug_proc_write(Ptr<runtime.file> file2, String ubuf, @Unsigned long len, Ptr<@OriginalName(value="loff_t") Long> offp) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int ddebug_tokenize(String buf, Ptr<String> words, int maxwords) {
        throw new MethodIsBPFRelatedFunction();
    }

    @Type(noCCodeGeneration=true, cType="struct ddebug_iter")
    @NotUsableInJava
    public static class ddebug_iter
    extends Struct {
        public Ptr<ddebug_table> table;
        public int idx;
    }

    @Type(noCCodeGeneration=true, cType="struct ddebug_query")
    @NotUsableInJava
    public static class ddebug_query
    extends Struct {
        public String filename;
        public String module;
        public String function;
        public String format;
        public String class_string;
        public @Unsigned int first_lineno;
        public @Unsigned int last_lineno;
    }

    @Type(noCCodeGeneration=true, cType="struct ddebug_table")
    @NotUsableInJava
    public static class ddebug_table
    extends Struct {
        public ListDefinitions.list_head link;
        public ListDefinitions.list_head maps;
        public String mod_name;
        public @Unsigned int num_ddebugs;
        public Ptr<runtime._ddebug> ddebugs;
    }

    @Type(noCCodeGeneration=true, cType="struct ddebug_class_param")
    @NotUsableInJava
    public static class ddebug_class_param
    extends Struct {
        @InlineUnion(value=31269)
        public @InlineUnion(value=31269) Ptr<@Unsigned Long> bits;
        @InlineUnion(value=31269)
        public @InlineUnion(value=31269) Ptr<@Unsigned Integer> lvl;
        public char @Size(value=8) [] flags;
        public Ptr<ddebug_class_map> map;
    }

    @Type(noCCodeGeneration=true, cType="struct _ddebug_info")
    @NotUsableInJava
    public static class _ddebug_info
    extends Struct {
        public Ptr<runtime._ddebug> descs;
        public Ptr<ddebug_class_map> classes;
        public @Unsigned int num_descs;
        public @Unsigned int num_classes;
    }

    @Type(noCCodeGeneration=true, cType="struct ddebug_class_map")
    @NotUsableInJava
    public static class ddebug_class_map
    extends Struct {
        public ListDefinitions.list_head link;
        public Ptr<runtime.module> mod;
        public String mod_name;
        public Ptr<String> class_names;
        public int length;
        public int base;
        public ClassDefinitions.class_map_type map_type;
    }
}

