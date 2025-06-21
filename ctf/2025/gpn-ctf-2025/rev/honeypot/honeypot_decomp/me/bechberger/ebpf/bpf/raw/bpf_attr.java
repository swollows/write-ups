/*
 * Decompiled with CFR 0.153-SNAPSHOT (d6f6758-dirty).
 * 
 * Could not load the following classes:
 *  java.lang.foreign.Arena
 *  java.lang.foreign.GroupLayout
 *  java.lang.foreign.MemoryLayout
 *  java.lang.foreign.MemoryLayout$PathElement
 *  java.lang.foreign.MemorySegment
 *  java.lang.foreign.SegmentAllocator
 *  java.lang.foreign.SequenceLayout
 *  java.lang.foreign.ValueLayout$OfInt
 *  java.lang.foreign.ValueLayout$OfLong
 *  java.lang.invoke.VarHandle
 */
package me.bechberger.ebpf.bpf.raw;

import java.lang.foreign.Arena;
import java.lang.foreign.GroupLayout;
import java.lang.foreign.MemoryLayout;
import java.lang.foreign.MemorySegment;
import java.lang.foreign.SegmentAllocator;
import java.lang.foreign.SequenceLayout;
import java.lang.foreign.ValueLayout;
import java.lang.invoke.VarHandle;
import java.util.function.Consumer;
import me.bechberger.ebpf.bpf.raw.Lib;

public class bpf_attr {
    private static final GroupLayout $LAYOUT = MemoryLayout.unionLayout((MemoryLayout[])new MemoryLayout[]{MemoryLayout.structLayout((MemoryLayout[])new MemoryLayout[]{Lib.C_INT.withName("map_type"), Lib.C_INT.withName("key_size"), Lib.C_INT.withName("value_size"), Lib.C_INT.withName("max_entries"), Lib.C_INT.withName("map_flags"), Lib.C_INT.withName("inner_map_fd"), Lib.C_INT.withName("numa_node"), MemoryLayout.sequenceLayout((long)16L, (MemoryLayout)Lib.C_CHAR).withName("map_name"), Lib.C_INT.withName("map_ifindex"), Lib.C_INT.withName("btf_fd"), Lib.C_INT.withName("btf_key_type_id"), Lib.C_INT.withName("btf_value_type_id"), Lib.C_INT.withName("btf_vmlinux_value_type_id"), Lib.C_LONG_LONG.withName("map_extra"), Lib.C_INT.withName("value_type_btf_obj_fd"), Lib.C_INT.withName("map_token_fd")}).withName("$anon$1463:2"), MemoryLayout.structLayout((MemoryLayout[])new MemoryLayout[]{Lib.C_INT.withName("map_fd"), MemoryLayout.paddingLayout((long)4L), Lib.C_LONG_LONG.withName("key"), MemoryLayout.unionLayout((MemoryLayout[])new MemoryLayout[]{Lib.C_LONG_LONG.withName("value"), Lib.C_LONG_LONG.withName("next_key")}).withName("$anon$1508:3"), Lib.C_LONG_LONG.withName("flags")}).withName("$anon$1505:2"), batch.layout().withName("batch"), MemoryLayout.structLayout((MemoryLayout[])new MemoryLayout[]{Lib.C_INT.withName("prog_type"), Lib.C_INT.withName("insn_cnt"), Lib.C_LONG_LONG.withName("insns"), Lib.C_LONG_LONG.withName("license"), Lib.C_INT.withName("log_level"), Lib.C_INT.withName("log_size"), Lib.C_LONG_LONG.withName("log_buf"), Lib.C_INT.withName("kern_version"), Lib.C_INT.withName("prog_flags"), MemoryLayout.sequenceLayout((long)16L, (MemoryLayout)Lib.C_CHAR).withName("prog_name"), Lib.C_INT.withName("prog_ifindex"), Lib.C_INT.withName("expected_attach_type"), Lib.C_INT.withName("prog_btf_fd"), Lib.C_INT.withName("func_info_rec_size"), Lib.C_LONG_LONG.withName("func_info"), Lib.C_INT.withName("func_info_cnt"), Lib.C_INT.withName("line_info_rec_size"), Lib.C_LONG_LONG.withName("line_info"), Lib.C_INT.withName("line_info_cnt"), Lib.C_INT.withName("attach_btf_id"), MemoryLayout.unionLayout((MemoryLayout[])new MemoryLayout[]{Lib.C_INT.withName("attach_prog_fd"), Lib.C_INT.withName("attach_btf_obj_fd")}).withName("$anon$1557:3"), Lib.C_INT.withName("core_relo_cnt"), Lib.C_LONG_LONG.withName("fd_array"), Lib.C_LONG_LONG.withName("core_relos"), Lib.C_INT.withName("core_relo_rec_size"), Lib.C_INT.withName("log_true_size"), Lib.C_INT.withName("prog_token_fd"), Lib.C_INT.withName("fd_array_cnt")}).withName("$anon$1532:2"), MemoryLayout.structLayout((MemoryLayout[])new MemoryLayout[]{Lib.C_LONG_LONG.withName("pathname"), Lib.C_INT.withName("bpf_fd"), Lib.C_INT.withName("file_flags"), Lib.C_INT.withName("path_fd"), MemoryLayout.paddingLayout((long)4L)}).withName("$anon$1588:2"), MemoryLayout.structLayout((MemoryLayout[])new MemoryLayout[]{MemoryLayout.unionLayout((MemoryLayout[])new MemoryLayout[]{Lib.C_INT.withName("target_fd"), Lib.C_INT.withName("target_ifindex")}).withName("$anon$1602:3"), Lib.C_INT.withName("attach_bpf_fd"), Lib.C_INT.withName("attach_type"), Lib.C_INT.withName("attach_flags"), Lib.C_INT.withName("replace_bpf_fd"), MemoryLayout.unionLayout((MemoryLayout[])new MemoryLayout[]{Lib.C_INT.withName("relative_fd"), Lib.C_INT.withName("relative_id")}).withName("$anon$1610:3"), Lib.C_LONG_LONG.withName("expected_revision")}).withName("$anon$1601:2"), test.layout().withName("test"), MemoryLayout.structLayout((MemoryLayout[])new MemoryLayout[]{MemoryLayout.unionLayout((MemoryLayout[])new MemoryLayout[]{Lib.C_INT.withName("start_id"), Lib.C_INT.withName("prog_id"), Lib.C_INT.withName("map_id"), Lib.C_INT.withName("btf_id"), Lib.C_INT.withName("link_id")}).withName("$anon$1642:3"), Lib.C_INT.withName("next_id"), Lib.C_INT.withName("open_flags")}).withName("$anon$1641:2"), info.layout().withName("info"), query.layout().withName("query"), raw_tracepoint.layout().withName("raw_tracepoint"), MemoryLayout.structLayout((MemoryLayout[])new MemoryLayout[]{Lib.C_LONG_LONG.withName("btf"), Lib.C_LONG_LONG.withName("btf_log_buf"), Lib.C_INT.withName("btf_size"), Lib.C_INT.withName("btf_log_size"), Lib.C_INT.withName("btf_log_level"), Lib.C_INT.withName("btf_log_true_size"), Lib.C_INT.withName("btf_flags"), Lib.C_INT.withName("btf_token_fd")}).withName("$anon$1689:2"), task_fd_query.layout().withName("task_fd_query"), link_create.layout().withName("link_create"), link_update.layout().withName("link_update"), link_detach.layout().withName("link_detach"), enable_stats.layout().withName("enable_stats"), iter_create.layout().withName("iter_create"), prog_bind_map.layout().withName("prog_bind_map"), token_create.layout().withName("token_create")}).withName("bpf_attr");
    private static final ValueLayout.OfInt map_type$LAYOUT = (ValueLayout.OfInt)$LAYOUT.select(new MemoryLayout.PathElement[]{MemoryLayout.PathElement.groupElement((String)"$anon$1463:2"), MemoryLayout.PathElement.groupElement((String)"map_type")});
    private static final long map_type$OFFSET = 0L;
    private static final ValueLayout.OfInt key_size$LAYOUT = (ValueLayout.OfInt)$LAYOUT.select(new MemoryLayout.PathElement[]{MemoryLayout.PathElement.groupElement((String)"$anon$1463:2"), MemoryLayout.PathElement.groupElement((String)"key_size")});
    private static final long key_size$OFFSET = 4L;
    private static final ValueLayout.OfInt value_size$LAYOUT = (ValueLayout.OfInt)$LAYOUT.select(new MemoryLayout.PathElement[]{MemoryLayout.PathElement.groupElement((String)"$anon$1463:2"), MemoryLayout.PathElement.groupElement((String)"value_size")});
    private static final long value_size$OFFSET = 8L;
    private static final ValueLayout.OfInt max_entries$LAYOUT = (ValueLayout.OfInt)$LAYOUT.select(new MemoryLayout.PathElement[]{MemoryLayout.PathElement.groupElement((String)"$anon$1463:2"), MemoryLayout.PathElement.groupElement((String)"max_entries")});
    private static final long max_entries$OFFSET = 12L;
    private static final ValueLayout.OfInt map_flags$LAYOUT = (ValueLayout.OfInt)$LAYOUT.select(new MemoryLayout.PathElement[]{MemoryLayout.PathElement.groupElement((String)"$anon$1463:2"), MemoryLayout.PathElement.groupElement((String)"map_flags")});
    private static final long map_flags$OFFSET = 16L;
    private static final ValueLayout.OfInt inner_map_fd$LAYOUT = (ValueLayout.OfInt)$LAYOUT.select(new MemoryLayout.PathElement[]{MemoryLayout.PathElement.groupElement((String)"$anon$1463:2"), MemoryLayout.PathElement.groupElement((String)"inner_map_fd")});
    private static final long inner_map_fd$OFFSET = 20L;
    private static final ValueLayout.OfInt numa_node$LAYOUT = (ValueLayout.OfInt)$LAYOUT.select(new MemoryLayout.PathElement[]{MemoryLayout.PathElement.groupElement((String)"$anon$1463:2"), MemoryLayout.PathElement.groupElement((String)"numa_node")});
    private static final long numa_node$OFFSET = 24L;
    private static final SequenceLayout map_name$LAYOUT = (SequenceLayout)$LAYOUT.select(new MemoryLayout.PathElement[]{MemoryLayout.PathElement.groupElement((String)"$anon$1463:2"), MemoryLayout.PathElement.groupElement((String)"map_name")});
    private static final long map_name$OFFSET = 28L;
    private static long[] map_name$DIMS = new long[]{16L};
    private static final VarHandle map_name$ELEM_HANDLE = map_name$LAYOUT.varHandle(new MemoryLayout.PathElement[]{MemoryLayout.PathElement.sequenceElement()});
    private static final ValueLayout.OfInt map_ifindex$LAYOUT = (ValueLayout.OfInt)$LAYOUT.select(new MemoryLayout.PathElement[]{MemoryLayout.PathElement.groupElement((String)"$anon$1463:2"), MemoryLayout.PathElement.groupElement((String)"map_ifindex")});
    private static final long map_ifindex$OFFSET = 44L;
    private static final ValueLayout.OfInt btf_fd$LAYOUT = (ValueLayout.OfInt)$LAYOUT.select(new MemoryLayout.PathElement[]{MemoryLayout.PathElement.groupElement((String)"$anon$1463:2"), MemoryLayout.PathElement.groupElement((String)"btf_fd")});
    private static final long btf_fd$OFFSET = 48L;
    private static final ValueLayout.OfInt btf_key_type_id$LAYOUT = (ValueLayout.OfInt)$LAYOUT.select(new MemoryLayout.PathElement[]{MemoryLayout.PathElement.groupElement((String)"$anon$1463:2"), MemoryLayout.PathElement.groupElement((String)"btf_key_type_id")});
    private static final long btf_key_type_id$OFFSET = 52L;
    private static final ValueLayout.OfInt btf_value_type_id$LAYOUT = (ValueLayout.OfInt)$LAYOUT.select(new MemoryLayout.PathElement[]{MemoryLayout.PathElement.groupElement((String)"$anon$1463:2"), MemoryLayout.PathElement.groupElement((String)"btf_value_type_id")});
    private static final long btf_value_type_id$OFFSET = 56L;
    private static final ValueLayout.OfInt btf_vmlinux_value_type_id$LAYOUT = (ValueLayout.OfInt)$LAYOUT.select(new MemoryLayout.PathElement[]{MemoryLayout.PathElement.groupElement((String)"$anon$1463:2"), MemoryLayout.PathElement.groupElement((String)"btf_vmlinux_value_type_id")});
    private static final long btf_vmlinux_value_type_id$OFFSET = 60L;
    private static final ValueLayout.OfLong map_extra$LAYOUT = (ValueLayout.OfLong)$LAYOUT.select(new MemoryLayout.PathElement[]{MemoryLayout.PathElement.groupElement((String)"$anon$1463:2"), MemoryLayout.PathElement.groupElement((String)"map_extra")});
    private static final long map_extra$OFFSET = 64L;
    private static final ValueLayout.OfInt value_type_btf_obj_fd$LAYOUT = (ValueLayout.OfInt)$LAYOUT.select(new MemoryLayout.PathElement[]{MemoryLayout.PathElement.groupElement((String)"$anon$1463:2"), MemoryLayout.PathElement.groupElement((String)"value_type_btf_obj_fd")});
    private static final long value_type_btf_obj_fd$OFFSET = 72L;
    private static final ValueLayout.OfInt map_token_fd$LAYOUT = (ValueLayout.OfInt)$LAYOUT.select(new MemoryLayout.PathElement[]{MemoryLayout.PathElement.groupElement((String)"$anon$1463:2"), MemoryLayout.PathElement.groupElement((String)"map_token_fd")});
    private static final long map_token_fd$OFFSET = 76L;
    private static final ValueLayout.OfInt map_fd$LAYOUT = (ValueLayout.OfInt)$LAYOUT.select(new MemoryLayout.PathElement[]{MemoryLayout.PathElement.groupElement((String)"$anon$1505:2"), MemoryLayout.PathElement.groupElement((String)"map_fd")});
    private static final long map_fd$OFFSET = 0L;
    private static final ValueLayout.OfLong key$LAYOUT = (ValueLayout.OfLong)$LAYOUT.select(new MemoryLayout.PathElement[]{MemoryLayout.PathElement.groupElement((String)"$anon$1505:2"), MemoryLayout.PathElement.groupElement((String)"key")});
    private static final long key$OFFSET = 8L;
    private static final ValueLayout.OfLong value$LAYOUT = (ValueLayout.OfLong)$LAYOUT.select(new MemoryLayout.PathElement[]{MemoryLayout.PathElement.groupElement((String)"$anon$1505:2"), MemoryLayout.PathElement.groupElement((String)"$anon$1508:3"), MemoryLayout.PathElement.groupElement((String)"value")});
    private static final long value$OFFSET = 16L;
    private static final ValueLayout.OfLong next_key$LAYOUT = (ValueLayout.OfLong)$LAYOUT.select(new MemoryLayout.PathElement[]{MemoryLayout.PathElement.groupElement((String)"$anon$1505:2"), MemoryLayout.PathElement.groupElement((String)"$anon$1508:3"), MemoryLayout.PathElement.groupElement((String)"next_key")});
    private static final long next_key$OFFSET = 16L;
    private static final ValueLayout.OfLong flags$LAYOUT = (ValueLayout.OfLong)$LAYOUT.select(new MemoryLayout.PathElement[]{MemoryLayout.PathElement.groupElement((String)"$anon$1505:2"), MemoryLayout.PathElement.groupElement((String)"flags")});
    private static final long flags$OFFSET = 24L;
    private static final GroupLayout batch$LAYOUT = (GroupLayout)$LAYOUT.select(new MemoryLayout.PathElement[]{MemoryLayout.PathElement.groupElement((String)"batch")});
    private static final long batch$OFFSET = 0L;
    private static final ValueLayout.OfInt prog_type$LAYOUT = (ValueLayout.OfInt)$LAYOUT.select(new MemoryLayout.PathElement[]{MemoryLayout.PathElement.groupElement((String)"$anon$1532:2"), MemoryLayout.PathElement.groupElement((String)"prog_type")});
    private static final long prog_type$OFFSET = 0L;
    private static final ValueLayout.OfInt insn_cnt$LAYOUT = (ValueLayout.OfInt)$LAYOUT.select(new MemoryLayout.PathElement[]{MemoryLayout.PathElement.groupElement((String)"$anon$1532:2"), MemoryLayout.PathElement.groupElement((String)"insn_cnt")});
    private static final long insn_cnt$OFFSET = 4L;
    private static final ValueLayout.OfLong insns$LAYOUT = (ValueLayout.OfLong)$LAYOUT.select(new MemoryLayout.PathElement[]{MemoryLayout.PathElement.groupElement((String)"$anon$1532:2"), MemoryLayout.PathElement.groupElement((String)"insns")});
    private static final long insns$OFFSET = 8L;
    private static final ValueLayout.OfLong license$LAYOUT = (ValueLayout.OfLong)$LAYOUT.select(new MemoryLayout.PathElement[]{MemoryLayout.PathElement.groupElement((String)"$anon$1532:2"), MemoryLayout.PathElement.groupElement((String)"license")});
    private static final long license$OFFSET = 16L;
    private static final ValueLayout.OfInt log_level$LAYOUT = (ValueLayout.OfInt)$LAYOUT.select(new MemoryLayout.PathElement[]{MemoryLayout.PathElement.groupElement((String)"$anon$1532:2"), MemoryLayout.PathElement.groupElement((String)"log_level")});
    private static final long log_level$OFFSET = 24L;
    private static final ValueLayout.OfInt log_size$LAYOUT = (ValueLayout.OfInt)$LAYOUT.select(new MemoryLayout.PathElement[]{MemoryLayout.PathElement.groupElement((String)"$anon$1532:2"), MemoryLayout.PathElement.groupElement((String)"log_size")});
    private static final long log_size$OFFSET = 28L;
    private static final ValueLayout.OfLong log_buf$LAYOUT = (ValueLayout.OfLong)$LAYOUT.select(new MemoryLayout.PathElement[]{MemoryLayout.PathElement.groupElement((String)"$anon$1532:2"), MemoryLayout.PathElement.groupElement((String)"log_buf")});
    private static final long log_buf$OFFSET = 32L;
    private static final ValueLayout.OfInt kern_version$LAYOUT = (ValueLayout.OfInt)$LAYOUT.select(new MemoryLayout.PathElement[]{MemoryLayout.PathElement.groupElement((String)"$anon$1532:2"), MemoryLayout.PathElement.groupElement((String)"kern_version")});
    private static final long kern_version$OFFSET = 40L;
    private static final ValueLayout.OfInt prog_flags$LAYOUT = (ValueLayout.OfInt)$LAYOUT.select(new MemoryLayout.PathElement[]{MemoryLayout.PathElement.groupElement((String)"$anon$1532:2"), MemoryLayout.PathElement.groupElement((String)"prog_flags")});
    private static final long prog_flags$OFFSET = 44L;
    private static final SequenceLayout prog_name$LAYOUT = (SequenceLayout)$LAYOUT.select(new MemoryLayout.PathElement[]{MemoryLayout.PathElement.groupElement((String)"$anon$1532:2"), MemoryLayout.PathElement.groupElement((String)"prog_name")});
    private static final long prog_name$OFFSET = 48L;
    private static long[] prog_name$DIMS = new long[]{16L};
    private static final VarHandle prog_name$ELEM_HANDLE = prog_name$LAYOUT.varHandle(new MemoryLayout.PathElement[]{MemoryLayout.PathElement.sequenceElement()});
    private static final ValueLayout.OfInt prog_ifindex$LAYOUT = (ValueLayout.OfInt)$LAYOUT.select(new MemoryLayout.PathElement[]{MemoryLayout.PathElement.groupElement((String)"$anon$1532:2"), MemoryLayout.PathElement.groupElement((String)"prog_ifindex")});
    private static final long prog_ifindex$OFFSET = 64L;
    private static final ValueLayout.OfInt expected_attach_type$LAYOUT = (ValueLayout.OfInt)$LAYOUT.select(new MemoryLayout.PathElement[]{MemoryLayout.PathElement.groupElement((String)"$anon$1532:2"), MemoryLayout.PathElement.groupElement((String)"expected_attach_type")});
    private static final long expected_attach_type$OFFSET = 68L;
    private static final ValueLayout.OfInt prog_btf_fd$LAYOUT = (ValueLayout.OfInt)$LAYOUT.select(new MemoryLayout.PathElement[]{MemoryLayout.PathElement.groupElement((String)"$anon$1532:2"), MemoryLayout.PathElement.groupElement((String)"prog_btf_fd")});
    private static final long prog_btf_fd$OFFSET = 72L;
    private static final ValueLayout.OfInt func_info_rec_size$LAYOUT = (ValueLayout.OfInt)$LAYOUT.select(new MemoryLayout.PathElement[]{MemoryLayout.PathElement.groupElement((String)"$anon$1532:2"), MemoryLayout.PathElement.groupElement((String)"func_info_rec_size")});
    private static final long func_info_rec_size$OFFSET = 76L;
    private static final ValueLayout.OfLong func_info$LAYOUT = (ValueLayout.OfLong)$LAYOUT.select(new MemoryLayout.PathElement[]{MemoryLayout.PathElement.groupElement((String)"$anon$1532:2"), MemoryLayout.PathElement.groupElement((String)"func_info")});
    private static final long func_info$OFFSET = 80L;
    private static final ValueLayout.OfInt func_info_cnt$LAYOUT = (ValueLayout.OfInt)$LAYOUT.select(new MemoryLayout.PathElement[]{MemoryLayout.PathElement.groupElement((String)"$anon$1532:2"), MemoryLayout.PathElement.groupElement((String)"func_info_cnt")});
    private static final long func_info_cnt$OFFSET = 88L;
    private static final ValueLayout.OfInt line_info_rec_size$LAYOUT = (ValueLayout.OfInt)$LAYOUT.select(new MemoryLayout.PathElement[]{MemoryLayout.PathElement.groupElement((String)"$anon$1532:2"), MemoryLayout.PathElement.groupElement((String)"line_info_rec_size")});
    private static final long line_info_rec_size$OFFSET = 92L;
    private static final ValueLayout.OfLong line_info$LAYOUT = (ValueLayout.OfLong)$LAYOUT.select(new MemoryLayout.PathElement[]{MemoryLayout.PathElement.groupElement((String)"$anon$1532:2"), MemoryLayout.PathElement.groupElement((String)"line_info")});
    private static final long line_info$OFFSET = 96L;
    private static final ValueLayout.OfInt line_info_cnt$LAYOUT = (ValueLayout.OfInt)$LAYOUT.select(new MemoryLayout.PathElement[]{MemoryLayout.PathElement.groupElement((String)"$anon$1532:2"), MemoryLayout.PathElement.groupElement((String)"line_info_cnt")});
    private static final long line_info_cnt$OFFSET = 104L;
    private static final ValueLayout.OfInt attach_btf_id$LAYOUT = (ValueLayout.OfInt)$LAYOUT.select(new MemoryLayout.PathElement[]{MemoryLayout.PathElement.groupElement((String)"$anon$1532:2"), MemoryLayout.PathElement.groupElement((String)"attach_btf_id")});
    private static final long attach_btf_id$OFFSET = 108L;
    private static final ValueLayout.OfInt attach_prog_fd$LAYOUT = (ValueLayout.OfInt)$LAYOUT.select(new MemoryLayout.PathElement[]{MemoryLayout.PathElement.groupElement((String)"$anon$1532:2"), MemoryLayout.PathElement.groupElement((String)"$anon$1557:3"), MemoryLayout.PathElement.groupElement((String)"attach_prog_fd")});
    private static final long attach_prog_fd$OFFSET = 112L;
    private static final ValueLayout.OfInt attach_btf_obj_fd$LAYOUT = (ValueLayout.OfInt)$LAYOUT.select(new MemoryLayout.PathElement[]{MemoryLayout.PathElement.groupElement((String)"$anon$1532:2"), MemoryLayout.PathElement.groupElement((String)"$anon$1557:3"), MemoryLayout.PathElement.groupElement((String)"attach_btf_obj_fd")});
    private static final long attach_btf_obj_fd$OFFSET = 112L;
    private static final ValueLayout.OfInt core_relo_cnt$LAYOUT = (ValueLayout.OfInt)$LAYOUT.select(new MemoryLayout.PathElement[]{MemoryLayout.PathElement.groupElement((String)"$anon$1532:2"), MemoryLayout.PathElement.groupElement((String)"core_relo_cnt")});
    private static final long core_relo_cnt$OFFSET = 116L;
    private static final ValueLayout.OfLong fd_array$LAYOUT = (ValueLayout.OfLong)$LAYOUT.select(new MemoryLayout.PathElement[]{MemoryLayout.PathElement.groupElement((String)"$anon$1532:2"), MemoryLayout.PathElement.groupElement((String)"fd_array")});
    private static final long fd_array$OFFSET = 120L;
    private static final ValueLayout.OfLong core_relos$LAYOUT = (ValueLayout.OfLong)$LAYOUT.select(new MemoryLayout.PathElement[]{MemoryLayout.PathElement.groupElement((String)"$anon$1532:2"), MemoryLayout.PathElement.groupElement((String)"core_relos")});
    private static final long core_relos$OFFSET = 128L;
    private static final ValueLayout.OfInt core_relo_rec_size$LAYOUT = (ValueLayout.OfInt)$LAYOUT.select(new MemoryLayout.PathElement[]{MemoryLayout.PathElement.groupElement((String)"$anon$1532:2"), MemoryLayout.PathElement.groupElement((String)"core_relo_rec_size")});
    private static final long core_relo_rec_size$OFFSET = 136L;
    private static final ValueLayout.OfInt log_true_size$LAYOUT = (ValueLayout.OfInt)$LAYOUT.select(new MemoryLayout.PathElement[]{MemoryLayout.PathElement.groupElement((String)"$anon$1532:2"), MemoryLayout.PathElement.groupElement((String)"log_true_size")});
    private static final long log_true_size$OFFSET = 140L;
    private static final ValueLayout.OfInt prog_token_fd$LAYOUT = (ValueLayout.OfInt)$LAYOUT.select(new MemoryLayout.PathElement[]{MemoryLayout.PathElement.groupElement((String)"$anon$1532:2"), MemoryLayout.PathElement.groupElement((String)"prog_token_fd")});
    private static final long prog_token_fd$OFFSET = 144L;
    private static final ValueLayout.OfInt fd_array_cnt$LAYOUT = (ValueLayout.OfInt)$LAYOUT.select(new MemoryLayout.PathElement[]{MemoryLayout.PathElement.groupElement((String)"$anon$1532:2"), MemoryLayout.PathElement.groupElement((String)"fd_array_cnt")});
    private static final long fd_array_cnt$OFFSET = 148L;
    private static final ValueLayout.OfLong pathname$LAYOUT = (ValueLayout.OfLong)$LAYOUT.select(new MemoryLayout.PathElement[]{MemoryLayout.PathElement.groupElement((String)"$anon$1588:2"), MemoryLayout.PathElement.groupElement((String)"pathname")});
    private static final long pathname$OFFSET = 0L;
    private static final ValueLayout.OfInt bpf_fd$LAYOUT = (ValueLayout.OfInt)$LAYOUT.select(new MemoryLayout.PathElement[]{MemoryLayout.PathElement.groupElement((String)"$anon$1588:2"), MemoryLayout.PathElement.groupElement((String)"bpf_fd")});
    private static final long bpf_fd$OFFSET = 8L;
    private static final ValueLayout.OfInt file_flags$LAYOUT = (ValueLayout.OfInt)$LAYOUT.select(new MemoryLayout.PathElement[]{MemoryLayout.PathElement.groupElement((String)"$anon$1588:2"), MemoryLayout.PathElement.groupElement((String)"file_flags")});
    private static final long file_flags$OFFSET = 12L;
    private static final ValueLayout.OfInt path_fd$LAYOUT = (ValueLayout.OfInt)$LAYOUT.select(new MemoryLayout.PathElement[]{MemoryLayout.PathElement.groupElement((String)"$anon$1588:2"), MemoryLayout.PathElement.groupElement((String)"path_fd")});
    private static final long path_fd$OFFSET = 16L;
    private static final ValueLayout.OfInt target_fd$LAYOUT = (ValueLayout.OfInt)$LAYOUT.select(new MemoryLayout.PathElement[]{MemoryLayout.PathElement.groupElement((String)"$anon$1601:2"), MemoryLayout.PathElement.groupElement((String)"$anon$1602:3"), MemoryLayout.PathElement.groupElement((String)"target_fd")});
    private static final long target_fd$OFFSET = 0L;
    private static final ValueLayout.OfInt target_ifindex$LAYOUT = (ValueLayout.OfInt)$LAYOUT.select(new MemoryLayout.PathElement[]{MemoryLayout.PathElement.groupElement((String)"$anon$1601:2"), MemoryLayout.PathElement.groupElement((String)"$anon$1602:3"), MemoryLayout.PathElement.groupElement((String)"target_ifindex")});
    private static final long target_ifindex$OFFSET = 0L;
    private static final ValueLayout.OfInt attach_bpf_fd$LAYOUT = (ValueLayout.OfInt)$LAYOUT.select(new MemoryLayout.PathElement[]{MemoryLayout.PathElement.groupElement((String)"$anon$1601:2"), MemoryLayout.PathElement.groupElement((String)"attach_bpf_fd")});
    private static final long attach_bpf_fd$OFFSET = 4L;
    private static final ValueLayout.OfInt attach_type$LAYOUT = (ValueLayout.OfInt)$LAYOUT.select(new MemoryLayout.PathElement[]{MemoryLayout.PathElement.groupElement((String)"$anon$1601:2"), MemoryLayout.PathElement.groupElement((String)"attach_type")});
    private static final long attach_type$OFFSET = 8L;
    private static final ValueLayout.OfInt attach_flags$LAYOUT = (ValueLayout.OfInt)$LAYOUT.select(new MemoryLayout.PathElement[]{MemoryLayout.PathElement.groupElement((String)"$anon$1601:2"), MemoryLayout.PathElement.groupElement((String)"attach_flags")});
    private static final long attach_flags$OFFSET = 12L;
    private static final ValueLayout.OfInt replace_bpf_fd$LAYOUT = (ValueLayout.OfInt)$LAYOUT.select(new MemoryLayout.PathElement[]{MemoryLayout.PathElement.groupElement((String)"$anon$1601:2"), MemoryLayout.PathElement.groupElement((String)"replace_bpf_fd")});
    private static final long replace_bpf_fd$OFFSET = 16L;
    private static final ValueLayout.OfInt relative_fd$LAYOUT = (ValueLayout.OfInt)$LAYOUT.select(new MemoryLayout.PathElement[]{MemoryLayout.PathElement.groupElement((String)"$anon$1601:2"), MemoryLayout.PathElement.groupElement((String)"$anon$1610:3"), MemoryLayout.PathElement.groupElement((String)"relative_fd")});
    private static final long relative_fd$OFFSET = 20L;
    private static final ValueLayout.OfInt relative_id$LAYOUT = (ValueLayout.OfInt)$LAYOUT.select(new MemoryLayout.PathElement[]{MemoryLayout.PathElement.groupElement((String)"$anon$1601:2"), MemoryLayout.PathElement.groupElement((String)"$anon$1610:3"), MemoryLayout.PathElement.groupElement((String)"relative_id")});
    private static final long relative_id$OFFSET = 20L;
    private static final ValueLayout.OfLong expected_revision$LAYOUT = (ValueLayout.OfLong)$LAYOUT.select(new MemoryLayout.PathElement[]{MemoryLayout.PathElement.groupElement((String)"$anon$1601:2"), MemoryLayout.PathElement.groupElement((String)"expected_revision")});
    private static final long expected_revision$OFFSET = 24L;
    private static final GroupLayout test$LAYOUT = (GroupLayout)$LAYOUT.select(new MemoryLayout.PathElement[]{MemoryLayout.PathElement.groupElement((String)"test")});
    private static final long test$OFFSET = 0L;
    private static final ValueLayout.OfInt start_id$LAYOUT = (ValueLayout.OfInt)$LAYOUT.select(new MemoryLayout.PathElement[]{MemoryLayout.PathElement.groupElement((String)"$anon$1641:2"), MemoryLayout.PathElement.groupElement((String)"$anon$1642:3"), MemoryLayout.PathElement.groupElement((String)"start_id")});
    private static final long start_id$OFFSET = 0L;
    private static final ValueLayout.OfInt prog_id$LAYOUT = (ValueLayout.OfInt)$LAYOUT.select(new MemoryLayout.PathElement[]{MemoryLayout.PathElement.groupElement((String)"$anon$1641:2"), MemoryLayout.PathElement.groupElement((String)"$anon$1642:3"), MemoryLayout.PathElement.groupElement((String)"prog_id")});
    private static final long prog_id$OFFSET = 0L;
    private static final ValueLayout.OfInt map_id$LAYOUT = (ValueLayout.OfInt)$LAYOUT.select(new MemoryLayout.PathElement[]{MemoryLayout.PathElement.groupElement((String)"$anon$1641:2"), MemoryLayout.PathElement.groupElement((String)"$anon$1642:3"), MemoryLayout.PathElement.groupElement((String)"map_id")});
    private static final long map_id$OFFSET = 0L;
    private static final ValueLayout.OfInt btf_id$LAYOUT = (ValueLayout.OfInt)$LAYOUT.select(new MemoryLayout.PathElement[]{MemoryLayout.PathElement.groupElement((String)"$anon$1641:2"), MemoryLayout.PathElement.groupElement((String)"$anon$1642:3"), MemoryLayout.PathElement.groupElement((String)"btf_id")});
    private static final long btf_id$OFFSET = 0L;
    private static final ValueLayout.OfInt link_id$LAYOUT = (ValueLayout.OfInt)$LAYOUT.select(new MemoryLayout.PathElement[]{MemoryLayout.PathElement.groupElement((String)"$anon$1641:2"), MemoryLayout.PathElement.groupElement((String)"$anon$1642:3"), MemoryLayout.PathElement.groupElement((String)"link_id")});
    private static final long link_id$OFFSET = 0L;
    private static final ValueLayout.OfInt next_id$LAYOUT = (ValueLayout.OfInt)$LAYOUT.select(new MemoryLayout.PathElement[]{MemoryLayout.PathElement.groupElement((String)"$anon$1641:2"), MemoryLayout.PathElement.groupElement((String)"next_id")});
    private static final long next_id$OFFSET = 4L;
    private static final ValueLayout.OfInt open_flags$LAYOUT = (ValueLayout.OfInt)$LAYOUT.select(new MemoryLayout.PathElement[]{MemoryLayout.PathElement.groupElement((String)"$anon$1641:2"), MemoryLayout.PathElement.groupElement((String)"open_flags")});
    private static final long open_flags$OFFSET = 8L;
    private static final GroupLayout info$LAYOUT = (GroupLayout)$LAYOUT.select(new MemoryLayout.PathElement[]{MemoryLayout.PathElement.groupElement((String)"info")});
    private static final long info$OFFSET = 0L;
    private static final GroupLayout query$LAYOUT = (GroupLayout)$LAYOUT.select(new MemoryLayout.PathElement[]{MemoryLayout.PathElement.groupElement((String)"query")});
    private static final long query$OFFSET = 0L;
    private static final GroupLayout raw_tracepoint$LAYOUT = (GroupLayout)$LAYOUT.select(new MemoryLayout.PathElement[]{MemoryLayout.PathElement.groupElement((String)"raw_tracepoint")});
    private static final long raw_tracepoint$OFFSET = 0L;
    private static final ValueLayout.OfLong btf$LAYOUT = (ValueLayout.OfLong)$LAYOUT.select(new MemoryLayout.PathElement[]{MemoryLayout.PathElement.groupElement((String)"$anon$1689:2"), MemoryLayout.PathElement.groupElement((String)"btf")});
    private static final long btf$OFFSET = 0L;
    private static final ValueLayout.OfLong btf_log_buf$LAYOUT = (ValueLayout.OfLong)$LAYOUT.select(new MemoryLayout.PathElement[]{MemoryLayout.PathElement.groupElement((String)"$anon$1689:2"), MemoryLayout.PathElement.groupElement((String)"btf_log_buf")});
    private static final long btf_log_buf$OFFSET = 8L;
    private static final ValueLayout.OfInt btf_size$LAYOUT = (ValueLayout.OfInt)$LAYOUT.select(new MemoryLayout.PathElement[]{MemoryLayout.PathElement.groupElement((String)"$anon$1689:2"), MemoryLayout.PathElement.groupElement((String)"btf_size")});
    private static final long btf_size$OFFSET = 16L;
    private static final ValueLayout.OfInt btf_log_size$LAYOUT = (ValueLayout.OfInt)$LAYOUT.select(new MemoryLayout.PathElement[]{MemoryLayout.PathElement.groupElement((String)"$anon$1689:2"), MemoryLayout.PathElement.groupElement((String)"btf_log_size")});
    private static final long btf_log_size$OFFSET = 20L;
    private static final ValueLayout.OfInt btf_log_level$LAYOUT = (ValueLayout.OfInt)$LAYOUT.select(new MemoryLayout.PathElement[]{MemoryLayout.PathElement.groupElement((String)"$anon$1689:2"), MemoryLayout.PathElement.groupElement((String)"btf_log_level")});
    private static final long btf_log_level$OFFSET = 24L;
    private static final ValueLayout.OfInt btf_log_true_size$LAYOUT = (ValueLayout.OfInt)$LAYOUT.select(new MemoryLayout.PathElement[]{MemoryLayout.PathElement.groupElement((String)"$anon$1689:2"), MemoryLayout.PathElement.groupElement((String)"btf_log_true_size")});
    private static final long btf_log_true_size$OFFSET = 28L;
    private static final ValueLayout.OfInt btf_flags$LAYOUT = (ValueLayout.OfInt)$LAYOUT.select(new MemoryLayout.PathElement[]{MemoryLayout.PathElement.groupElement((String)"$anon$1689:2"), MemoryLayout.PathElement.groupElement((String)"btf_flags")});
    private static final long btf_flags$OFFSET = 32L;
    private static final ValueLayout.OfInt btf_token_fd$LAYOUT = (ValueLayout.OfInt)$LAYOUT.select(new MemoryLayout.PathElement[]{MemoryLayout.PathElement.groupElement((String)"$anon$1689:2"), MemoryLayout.PathElement.groupElement((String)"btf_token_fd")});
    private static final long btf_token_fd$OFFSET = 36L;
    private static final GroupLayout task_fd_query$LAYOUT = (GroupLayout)$LAYOUT.select(new MemoryLayout.PathElement[]{MemoryLayout.PathElement.groupElement((String)"task_fd_query")});
    private static final long task_fd_query$OFFSET = 0L;
    private static final GroupLayout link_create$LAYOUT = (GroupLayout)$LAYOUT.select(new MemoryLayout.PathElement[]{MemoryLayout.PathElement.groupElement((String)"link_create")});
    private static final long link_create$OFFSET = 0L;
    private static final GroupLayout link_update$LAYOUT = (GroupLayout)$LAYOUT.select(new MemoryLayout.PathElement[]{MemoryLayout.PathElement.groupElement((String)"link_update")});
    private static final long link_update$OFFSET = 0L;
    private static final GroupLayout link_detach$LAYOUT = (GroupLayout)$LAYOUT.select(new MemoryLayout.PathElement[]{MemoryLayout.PathElement.groupElement((String)"link_detach")});
    private static final long link_detach$OFFSET = 0L;
    private static final GroupLayout enable_stats$LAYOUT = (GroupLayout)$LAYOUT.select(new MemoryLayout.PathElement[]{MemoryLayout.PathElement.groupElement((String)"enable_stats")});
    private static final long enable_stats$OFFSET = 0L;
    private static final GroupLayout iter_create$LAYOUT = (GroupLayout)$LAYOUT.select(new MemoryLayout.PathElement[]{MemoryLayout.PathElement.groupElement((String)"iter_create")});
    private static final long iter_create$OFFSET = 0L;
    private static final GroupLayout prog_bind_map$LAYOUT = (GroupLayout)$LAYOUT.select(new MemoryLayout.PathElement[]{MemoryLayout.PathElement.groupElement((String)"prog_bind_map")});
    private static final long prog_bind_map$OFFSET = 0L;
    private static final GroupLayout token_create$LAYOUT = (GroupLayout)$LAYOUT.select(new MemoryLayout.PathElement[]{MemoryLayout.PathElement.groupElement((String)"token_create")});
    private static final long token_create$OFFSET = 0L;

    bpf_attr() {
    }

    public static final GroupLayout layout() {
        return $LAYOUT;
    }

    public static final ValueLayout.OfInt map_type$layout() {
        return map_type$LAYOUT;
    }

    public static final long map_type$offset() {
        return 0L;
    }

    public static int map_type(MemorySegment union) {
        return union.get(map_type$LAYOUT, 0L);
    }

    public static void map_type(MemorySegment union, int fieldValue) {
        union.set(map_type$LAYOUT, 0L, fieldValue);
    }

    public static final ValueLayout.OfInt key_size$layout() {
        return key_size$LAYOUT;
    }

    public static final long key_size$offset() {
        return 4L;
    }

    public static int key_size(MemorySegment union) {
        return union.get(key_size$LAYOUT, 4L);
    }

    public static void key_size(MemorySegment union, int fieldValue) {
        union.set(key_size$LAYOUT, 4L, fieldValue);
    }

    public static final ValueLayout.OfInt value_size$layout() {
        return value_size$LAYOUT;
    }

    public static final long value_size$offset() {
        return 8L;
    }

    public static int value_size(MemorySegment union) {
        return union.get(value_size$LAYOUT, 8L);
    }

    public static void value_size(MemorySegment union, int fieldValue) {
        union.set(value_size$LAYOUT, 8L, fieldValue);
    }

    public static final ValueLayout.OfInt max_entries$layout() {
        return max_entries$LAYOUT;
    }

    public static final long max_entries$offset() {
        return 12L;
    }

    public static int max_entries(MemorySegment union) {
        return union.get(max_entries$LAYOUT, 12L);
    }

    public static void max_entries(MemorySegment union, int fieldValue) {
        union.set(max_entries$LAYOUT, 12L, fieldValue);
    }

    public static final ValueLayout.OfInt map_flags$layout() {
        return map_flags$LAYOUT;
    }

    public static final long map_flags$offset() {
        return 16L;
    }

    public static int map_flags(MemorySegment union) {
        return union.get(map_flags$LAYOUT, 16L);
    }

    public static void map_flags(MemorySegment union, int fieldValue) {
        union.set(map_flags$LAYOUT, 16L, fieldValue);
    }

    public static final ValueLayout.OfInt inner_map_fd$layout() {
        return inner_map_fd$LAYOUT;
    }

    public static final long inner_map_fd$offset() {
        return 20L;
    }

    public static int inner_map_fd(MemorySegment union) {
        return union.get(inner_map_fd$LAYOUT, 20L);
    }

    public static void inner_map_fd(MemorySegment union, int fieldValue) {
        union.set(inner_map_fd$LAYOUT, 20L, fieldValue);
    }

    public static final ValueLayout.OfInt numa_node$layout() {
        return numa_node$LAYOUT;
    }

    public static final long numa_node$offset() {
        return 24L;
    }

    public static int numa_node(MemorySegment union) {
        return union.get(numa_node$LAYOUT, 24L);
    }

    public static void numa_node(MemorySegment union, int fieldValue) {
        union.set(numa_node$LAYOUT, 24L, fieldValue);
    }

    public static final SequenceLayout map_name$layout() {
        return map_name$LAYOUT;
    }

    public static final long map_name$offset() {
        return 28L;
    }

    public static MemorySegment map_name(MemorySegment union) {
        return union.asSlice(28L, map_name$LAYOUT.byteSize());
    }

    public static void map_name(MemorySegment union, MemorySegment fieldValue) {
        MemorySegment.copy((MemorySegment)fieldValue, (long)0L, (MemorySegment)union, (long)28L, (long)map_name$LAYOUT.byteSize());
    }

    public static long[] map_name$dimensions() {
        return map_name$DIMS;
    }

    public static byte map_name(MemorySegment union, long index0) {
        return map_name$ELEM_HANDLE.get(union, 0L, index0);
    }

    public static void map_name(MemorySegment union, long index0, byte fieldValue) {
        map_name$ELEM_HANDLE.set(union, 0L, index0, fieldValue);
    }

    public static final ValueLayout.OfInt map_ifindex$layout() {
        return map_ifindex$LAYOUT;
    }

    public static final long map_ifindex$offset() {
        return 44L;
    }

    public static int map_ifindex(MemorySegment union) {
        return union.get(map_ifindex$LAYOUT, 44L);
    }

    public static void map_ifindex(MemorySegment union, int fieldValue) {
        union.set(map_ifindex$LAYOUT, 44L, fieldValue);
    }

    public static final ValueLayout.OfInt btf_fd$layout() {
        return btf_fd$LAYOUT;
    }

    public static final long btf_fd$offset() {
        return 48L;
    }

    public static int btf_fd(MemorySegment union) {
        return union.get(btf_fd$LAYOUT, 48L);
    }

    public static void btf_fd(MemorySegment union, int fieldValue) {
        union.set(btf_fd$LAYOUT, 48L, fieldValue);
    }

    public static final ValueLayout.OfInt btf_key_type_id$layout() {
        return btf_key_type_id$LAYOUT;
    }

    public static final long btf_key_type_id$offset() {
        return 52L;
    }

    public static int btf_key_type_id(MemorySegment union) {
        return union.get(btf_key_type_id$LAYOUT, 52L);
    }

    public static void btf_key_type_id(MemorySegment union, int fieldValue) {
        union.set(btf_key_type_id$LAYOUT, 52L, fieldValue);
    }

    public static final ValueLayout.OfInt btf_value_type_id$layout() {
        return btf_value_type_id$LAYOUT;
    }

    public static final long btf_value_type_id$offset() {
        return 56L;
    }

    public static int btf_value_type_id(MemorySegment union) {
        return union.get(btf_value_type_id$LAYOUT, 56L);
    }

    public static void btf_value_type_id(MemorySegment union, int fieldValue) {
        union.set(btf_value_type_id$LAYOUT, 56L, fieldValue);
    }

    public static final ValueLayout.OfInt btf_vmlinux_value_type_id$layout() {
        return btf_vmlinux_value_type_id$LAYOUT;
    }

    public static final long btf_vmlinux_value_type_id$offset() {
        return 60L;
    }

    public static int btf_vmlinux_value_type_id(MemorySegment union) {
        return union.get(btf_vmlinux_value_type_id$LAYOUT, 60L);
    }

    public static void btf_vmlinux_value_type_id(MemorySegment union, int fieldValue) {
        union.set(btf_vmlinux_value_type_id$LAYOUT, 60L, fieldValue);
    }

    public static final ValueLayout.OfLong map_extra$layout() {
        return map_extra$LAYOUT;
    }

    public static final long map_extra$offset() {
        return 64L;
    }

    public static long map_extra(MemorySegment union) {
        return union.get(map_extra$LAYOUT, 64L);
    }

    public static void map_extra(MemorySegment union, long fieldValue) {
        union.set(map_extra$LAYOUT, 64L, fieldValue);
    }

    public static final ValueLayout.OfInt value_type_btf_obj_fd$layout() {
        return value_type_btf_obj_fd$LAYOUT;
    }

    public static final long value_type_btf_obj_fd$offset() {
        return 72L;
    }

    public static int value_type_btf_obj_fd(MemorySegment union) {
        return union.get(value_type_btf_obj_fd$LAYOUT, 72L);
    }

    public static void value_type_btf_obj_fd(MemorySegment union, int fieldValue) {
        union.set(value_type_btf_obj_fd$LAYOUT, 72L, fieldValue);
    }

    public static final ValueLayout.OfInt map_token_fd$layout() {
        return map_token_fd$LAYOUT;
    }

    public static final long map_token_fd$offset() {
        return 76L;
    }

    public static int map_token_fd(MemorySegment union) {
        return union.get(map_token_fd$LAYOUT, 76L);
    }

    public static void map_token_fd(MemorySegment union, int fieldValue) {
        union.set(map_token_fd$LAYOUT, 76L, fieldValue);
    }

    public static final ValueLayout.OfInt map_fd$layout() {
        return map_fd$LAYOUT;
    }

    public static final long map_fd$offset() {
        return 0L;
    }

    public static int map_fd(MemorySegment union) {
        return union.get(map_fd$LAYOUT, 0L);
    }

    public static void map_fd(MemorySegment union, int fieldValue) {
        union.set(map_fd$LAYOUT, 0L, fieldValue);
    }

    public static final ValueLayout.OfLong key$layout() {
        return key$LAYOUT;
    }

    public static final long key$offset() {
        return 8L;
    }

    public static long key(MemorySegment union) {
        return union.get(key$LAYOUT, 8L);
    }

    public static void key(MemorySegment union, long fieldValue) {
        union.set(key$LAYOUT, 8L, fieldValue);
    }

    public static final ValueLayout.OfLong value$layout() {
        return value$LAYOUT;
    }

    public static final long value$offset() {
        return 16L;
    }

    public static long value(MemorySegment union) {
        return union.get(value$LAYOUT, 16L);
    }

    public static void value(MemorySegment union, long fieldValue) {
        union.set(value$LAYOUT, 16L, fieldValue);
    }

    public static final ValueLayout.OfLong next_key$layout() {
        return next_key$LAYOUT;
    }

    public static final long next_key$offset() {
        return 16L;
    }

    public static long next_key(MemorySegment union) {
        return union.get(next_key$LAYOUT, 16L);
    }

    public static void next_key(MemorySegment union, long fieldValue) {
        union.set(next_key$LAYOUT, 16L, fieldValue);
    }

    public static final ValueLayout.OfLong flags$layout() {
        return flags$LAYOUT;
    }

    public static final long flags$offset() {
        return 24L;
    }

    public static long flags(MemorySegment union) {
        return union.get(flags$LAYOUT, 24L);
    }

    public static void flags(MemorySegment union, long fieldValue) {
        union.set(flags$LAYOUT, 24L, fieldValue);
    }

    public static final GroupLayout batch$layout() {
        return batch$LAYOUT;
    }

    public static final long batch$offset() {
        return 0L;
    }

    public static MemorySegment batch(MemorySegment union) {
        return union.asSlice(0L, batch$LAYOUT.byteSize());
    }

    public static void batch(MemorySegment union, MemorySegment fieldValue) {
        MemorySegment.copy((MemorySegment)fieldValue, (long)0L, (MemorySegment)union, (long)0L, (long)batch$LAYOUT.byteSize());
    }

    public static final ValueLayout.OfInt prog_type$layout() {
        return prog_type$LAYOUT;
    }

    public static final long prog_type$offset() {
        return 0L;
    }

    public static int prog_type(MemorySegment union) {
        return union.get(prog_type$LAYOUT, 0L);
    }

    public static void prog_type(MemorySegment union, int fieldValue) {
        union.set(prog_type$LAYOUT, 0L, fieldValue);
    }

    public static final ValueLayout.OfInt insn_cnt$layout() {
        return insn_cnt$LAYOUT;
    }

    public static final long insn_cnt$offset() {
        return 4L;
    }

    public static int insn_cnt(MemorySegment union) {
        return union.get(insn_cnt$LAYOUT, 4L);
    }

    public static void insn_cnt(MemorySegment union, int fieldValue) {
        union.set(insn_cnt$LAYOUT, 4L, fieldValue);
    }

    public static final ValueLayout.OfLong insns$layout() {
        return insns$LAYOUT;
    }

    public static final long insns$offset() {
        return 8L;
    }

    public static long insns(MemorySegment union) {
        return union.get(insns$LAYOUT, 8L);
    }

    public static void insns(MemorySegment union, long fieldValue) {
        union.set(insns$LAYOUT, 8L, fieldValue);
    }

    public static final ValueLayout.OfLong license$layout() {
        return license$LAYOUT;
    }

    public static final long license$offset() {
        return 16L;
    }

    public static long license(MemorySegment union) {
        return union.get(license$LAYOUT, 16L);
    }

    public static void license(MemorySegment union, long fieldValue) {
        union.set(license$LAYOUT, 16L, fieldValue);
    }

    public static final ValueLayout.OfInt log_level$layout() {
        return log_level$LAYOUT;
    }

    public static final long log_level$offset() {
        return 24L;
    }

    public static int log_level(MemorySegment union) {
        return union.get(log_level$LAYOUT, 24L);
    }

    public static void log_level(MemorySegment union, int fieldValue) {
        union.set(log_level$LAYOUT, 24L, fieldValue);
    }

    public static final ValueLayout.OfInt log_size$layout() {
        return log_size$LAYOUT;
    }

    public static final long log_size$offset() {
        return 28L;
    }

    public static int log_size(MemorySegment union) {
        return union.get(log_size$LAYOUT, 28L);
    }

    public static void log_size(MemorySegment union, int fieldValue) {
        union.set(log_size$LAYOUT, 28L, fieldValue);
    }

    public static final ValueLayout.OfLong log_buf$layout() {
        return log_buf$LAYOUT;
    }

    public static final long log_buf$offset() {
        return 32L;
    }

    public static long log_buf(MemorySegment union) {
        return union.get(log_buf$LAYOUT, 32L);
    }

    public static void log_buf(MemorySegment union, long fieldValue) {
        union.set(log_buf$LAYOUT, 32L, fieldValue);
    }

    public static final ValueLayout.OfInt kern_version$layout() {
        return kern_version$LAYOUT;
    }

    public static final long kern_version$offset() {
        return 40L;
    }

    public static int kern_version(MemorySegment union) {
        return union.get(kern_version$LAYOUT, 40L);
    }

    public static void kern_version(MemorySegment union, int fieldValue) {
        union.set(kern_version$LAYOUT, 40L, fieldValue);
    }

    public static final ValueLayout.OfInt prog_flags$layout() {
        return prog_flags$LAYOUT;
    }

    public static final long prog_flags$offset() {
        return 44L;
    }

    public static int prog_flags(MemorySegment union) {
        return union.get(prog_flags$LAYOUT, 44L);
    }

    public static void prog_flags(MemorySegment union, int fieldValue) {
        union.set(prog_flags$LAYOUT, 44L, fieldValue);
    }

    public static final SequenceLayout prog_name$layout() {
        return prog_name$LAYOUT;
    }

    public static final long prog_name$offset() {
        return 48L;
    }

    public static MemorySegment prog_name(MemorySegment union) {
        return union.asSlice(48L, prog_name$LAYOUT.byteSize());
    }

    public static void prog_name(MemorySegment union, MemorySegment fieldValue) {
        MemorySegment.copy((MemorySegment)fieldValue, (long)0L, (MemorySegment)union, (long)48L, (long)prog_name$LAYOUT.byteSize());
    }

    public static long[] prog_name$dimensions() {
        return prog_name$DIMS;
    }

    public static byte prog_name(MemorySegment union, long index0) {
        return prog_name$ELEM_HANDLE.get(union, 0L, index0);
    }

    public static void prog_name(MemorySegment union, long index0, byte fieldValue) {
        prog_name$ELEM_HANDLE.set(union, 0L, index0, fieldValue);
    }

    public static final ValueLayout.OfInt prog_ifindex$layout() {
        return prog_ifindex$LAYOUT;
    }

    public static final long prog_ifindex$offset() {
        return 64L;
    }

    public static int prog_ifindex(MemorySegment union) {
        return union.get(prog_ifindex$LAYOUT, 64L);
    }

    public static void prog_ifindex(MemorySegment union, int fieldValue) {
        union.set(prog_ifindex$LAYOUT, 64L, fieldValue);
    }

    public static final ValueLayout.OfInt expected_attach_type$layout() {
        return expected_attach_type$LAYOUT;
    }

    public static final long expected_attach_type$offset() {
        return 68L;
    }

    public static int expected_attach_type(MemorySegment union) {
        return union.get(expected_attach_type$LAYOUT, 68L);
    }

    public static void expected_attach_type(MemorySegment union, int fieldValue) {
        union.set(expected_attach_type$LAYOUT, 68L, fieldValue);
    }

    public static final ValueLayout.OfInt prog_btf_fd$layout() {
        return prog_btf_fd$LAYOUT;
    }

    public static final long prog_btf_fd$offset() {
        return 72L;
    }

    public static int prog_btf_fd(MemorySegment union) {
        return union.get(prog_btf_fd$LAYOUT, 72L);
    }

    public static void prog_btf_fd(MemorySegment union, int fieldValue) {
        union.set(prog_btf_fd$LAYOUT, 72L, fieldValue);
    }

    public static final ValueLayout.OfInt func_info_rec_size$layout() {
        return func_info_rec_size$LAYOUT;
    }

    public static final long func_info_rec_size$offset() {
        return 76L;
    }

    public static int func_info_rec_size(MemorySegment union) {
        return union.get(func_info_rec_size$LAYOUT, 76L);
    }

    public static void func_info_rec_size(MemorySegment union, int fieldValue) {
        union.set(func_info_rec_size$LAYOUT, 76L, fieldValue);
    }

    public static final ValueLayout.OfLong func_info$layout() {
        return func_info$LAYOUT;
    }

    public static final long func_info$offset() {
        return 80L;
    }

    public static long func_info(MemorySegment union) {
        return union.get(func_info$LAYOUT, 80L);
    }

    public static void func_info(MemorySegment union, long fieldValue) {
        union.set(func_info$LAYOUT, 80L, fieldValue);
    }

    public static final ValueLayout.OfInt func_info_cnt$layout() {
        return func_info_cnt$LAYOUT;
    }

    public static final long func_info_cnt$offset() {
        return 88L;
    }

    public static int func_info_cnt(MemorySegment union) {
        return union.get(func_info_cnt$LAYOUT, 88L);
    }

    public static void func_info_cnt(MemorySegment union, int fieldValue) {
        union.set(func_info_cnt$LAYOUT, 88L, fieldValue);
    }

    public static final ValueLayout.OfInt line_info_rec_size$layout() {
        return line_info_rec_size$LAYOUT;
    }

    public static final long line_info_rec_size$offset() {
        return 92L;
    }

    public static int line_info_rec_size(MemorySegment union) {
        return union.get(line_info_rec_size$LAYOUT, 92L);
    }

    public static void line_info_rec_size(MemorySegment union, int fieldValue) {
        union.set(line_info_rec_size$LAYOUT, 92L, fieldValue);
    }

    public static final ValueLayout.OfLong line_info$layout() {
        return line_info$LAYOUT;
    }

    public static final long line_info$offset() {
        return 96L;
    }

    public static long line_info(MemorySegment union) {
        return union.get(line_info$LAYOUT, 96L);
    }

    public static void line_info(MemorySegment union, long fieldValue) {
        union.set(line_info$LAYOUT, 96L, fieldValue);
    }

    public static final ValueLayout.OfInt line_info_cnt$layout() {
        return line_info_cnt$LAYOUT;
    }

    public static final long line_info_cnt$offset() {
        return 104L;
    }

    public static int line_info_cnt(MemorySegment union) {
        return union.get(line_info_cnt$LAYOUT, 104L);
    }

    public static void line_info_cnt(MemorySegment union, int fieldValue) {
        union.set(line_info_cnt$LAYOUT, 104L, fieldValue);
    }

    public static final ValueLayout.OfInt attach_btf_id$layout() {
        return attach_btf_id$LAYOUT;
    }

    public static final long attach_btf_id$offset() {
        return 108L;
    }

    public static int attach_btf_id(MemorySegment union) {
        return union.get(attach_btf_id$LAYOUT, 108L);
    }

    public static void attach_btf_id(MemorySegment union, int fieldValue) {
        union.set(attach_btf_id$LAYOUT, 108L, fieldValue);
    }

    public static final ValueLayout.OfInt attach_prog_fd$layout() {
        return attach_prog_fd$LAYOUT;
    }

    public static final long attach_prog_fd$offset() {
        return 112L;
    }

    public static int attach_prog_fd(MemorySegment union) {
        return union.get(attach_prog_fd$LAYOUT, 112L);
    }

    public static void attach_prog_fd(MemorySegment union, int fieldValue) {
        union.set(attach_prog_fd$LAYOUT, 112L, fieldValue);
    }

    public static final ValueLayout.OfInt attach_btf_obj_fd$layout() {
        return attach_btf_obj_fd$LAYOUT;
    }

    public static final long attach_btf_obj_fd$offset() {
        return 112L;
    }

    public static int attach_btf_obj_fd(MemorySegment union) {
        return union.get(attach_btf_obj_fd$LAYOUT, 112L);
    }

    public static void attach_btf_obj_fd(MemorySegment union, int fieldValue) {
        union.set(attach_btf_obj_fd$LAYOUT, 112L, fieldValue);
    }

    public static final ValueLayout.OfInt core_relo_cnt$layout() {
        return core_relo_cnt$LAYOUT;
    }

    public static final long core_relo_cnt$offset() {
        return 116L;
    }

    public static int core_relo_cnt(MemorySegment union) {
        return union.get(core_relo_cnt$LAYOUT, 116L);
    }

    public static void core_relo_cnt(MemorySegment union, int fieldValue) {
        union.set(core_relo_cnt$LAYOUT, 116L, fieldValue);
    }

    public static final ValueLayout.OfLong fd_array$layout() {
        return fd_array$LAYOUT;
    }

    public static final long fd_array$offset() {
        return 120L;
    }

    public static long fd_array(MemorySegment union) {
        return union.get(fd_array$LAYOUT, 120L);
    }

    public static void fd_array(MemorySegment union, long fieldValue) {
        union.set(fd_array$LAYOUT, 120L, fieldValue);
    }

    public static final ValueLayout.OfLong core_relos$layout() {
        return core_relos$LAYOUT;
    }

    public static final long core_relos$offset() {
        return 128L;
    }

    public static long core_relos(MemorySegment union) {
        return union.get(core_relos$LAYOUT, 128L);
    }

    public static void core_relos(MemorySegment union, long fieldValue) {
        union.set(core_relos$LAYOUT, 128L, fieldValue);
    }

    public static final ValueLayout.OfInt core_relo_rec_size$layout() {
        return core_relo_rec_size$LAYOUT;
    }

    public static final long core_relo_rec_size$offset() {
        return 136L;
    }

    public static int core_relo_rec_size(MemorySegment union) {
        return union.get(core_relo_rec_size$LAYOUT, 136L);
    }

    public static void core_relo_rec_size(MemorySegment union, int fieldValue) {
        union.set(core_relo_rec_size$LAYOUT, 136L, fieldValue);
    }

    public static final ValueLayout.OfInt log_true_size$layout() {
        return log_true_size$LAYOUT;
    }

    public static final long log_true_size$offset() {
        return 140L;
    }

    public static int log_true_size(MemorySegment union) {
        return union.get(log_true_size$LAYOUT, 140L);
    }

    public static void log_true_size(MemorySegment union, int fieldValue) {
        union.set(log_true_size$LAYOUT, 140L, fieldValue);
    }

    public static final ValueLayout.OfInt prog_token_fd$layout() {
        return prog_token_fd$LAYOUT;
    }

    public static final long prog_token_fd$offset() {
        return 144L;
    }

    public static int prog_token_fd(MemorySegment union) {
        return union.get(prog_token_fd$LAYOUT, 144L);
    }

    public static void prog_token_fd(MemorySegment union, int fieldValue) {
        union.set(prog_token_fd$LAYOUT, 144L, fieldValue);
    }

    public static final ValueLayout.OfInt fd_array_cnt$layout() {
        return fd_array_cnt$LAYOUT;
    }

    public static final long fd_array_cnt$offset() {
        return 148L;
    }

    public static int fd_array_cnt(MemorySegment union) {
        return union.get(fd_array_cnt$LAYOUT, 148L);
    }

    public static void fd_array_cnt(MemorySegment union, int fieldValue) {
        union.set(fd_array_cnt$LAYOUT, 148L, fieldValue);
    }

    public static final ValueLayout.OfLong pathname$layout() {
        return pathname$LAYOUT;
    }

    public static final long pathname$offset() {
        return 0L;
    }

    public static long pathname(MemorySegment union) {
        return union.get(pathname$LAYOUT, 0L);
    }

    public static void pathname(MemorySegment union, long fieldValue) {
        union.set(pathname$LAYOUT, 0L, fieldValue);
    }

    public static final ValueLayout.OfInt bpf_fd$layout() {
        return bpf_fd$LAYOUT;
    }

    public static final long bpf_fd$offset() {
        return 8L;
    }

    public static int bpf_fd(MemorySegment union) {
        return union.get(bpf_fd$LAYOUT, 8L);
    }

    public static void bpf_fd(MemorySegment union, int fieldValue) {
        union.set(bpf_fd$LAYOUT, 8L, fieldValue);
    }

    public static final ValueLayout.OfInt file_flags$layout() {
        return file_flags$LAYOUT;
    }

    public static final long file_flags$offset() {
        return 12L;
    }

    public static int file_flags(MemorySegment union) {
        return union.get(file_flags$LAYOUT, 12L);
    }

    public static void file_flags(MemorySegment union, int fieldValue) {
        union.set(file_flags$LAYOUT, 12L, fieldValue);
    }

    public static final ValueLayout.OfInt path_fd$layout() {
        return path_fd$LAYOUT;
    }

    public static final long path_fd$offset() {
        return 16L;
    }

    public static int path_fd(MemorySegment union) {
        return union.get(path_fd$LAYOUT, 16L);
    }

    public static void path_fd(MemorySegment union, int fieldValue) {
        union.set(path_fd$LAYOUT, 16L, fieldValue);
    }

    public static final ValueLayout.OfInt target_fd$layout() {
        return target_fd$LAYOUT;
    }

    public static final long target_fd$offset() {
        return 0L;
    }

    public static int target_fd(MemorySegment union) {
        return union.get(target_fd$LAYOUT, 0L);
    }

    public static void target_fd(MemorySegment union, int fieldValue) {
        union.set(target_fd$LAYOUT, 0L, fieldValue);
    }

    public static final ValueLayout.OfInt target_ifindex$layout() {
        return target_ifindex$LAYOUT;
    }

    public static final long target_ifindex$offset() {
        return 0L;
    }

    public static int target_ifindex(MemorySegment union) {
        return union.get(target_ifindex$LAYOUT, 0L);
    }

    public static void target_ifindex(MemorySegment union, int fieldValue) {
        union.set(target_ifindex$LAYOUT, 0L, fieldValue);
    }

    public static final ValueLayout.OfInt attach_bpf_fd$layout() {
        return attach_bpf_fd$LAYOUT;
    }

    public static final long attach_bpf_fd$offset() {
        return 4L;
    }

    public static int attach_bpf_fd(MemorySegment union) {
        return union.get(attach_bpf_fd$LAYOUT, 4L);
    }

    public static void attach_bpf_fd(MemorySegment union, int fieldValue) {
        union.set(attach_bpf_fd$LAYOUT, 4L, fieldValue);
    }

    public static final ValueLayout.OfInt attach_type$layout() {
        return attach_type$LAYOUT;
    }

    public static final long attach_type$offset() {
        return 8L;
    }

    public static int attach_type(MemorySegment union) {
        return union.get(attach_type$LAYOUT, 8L);
    }

    public static void attach_type(MemorySegment union, int fieldValue) {
        union.set(attach_type$LAYOUT, 8L, fieldValue);
    }

    public static final ValueLayout.OfInt attach_flags$layout() {
        return attach_flags$LAYOUT;
    }

    public static final long attach_flags$offset() {
        return 12L;
    }

    public static int attach_flags(MemorySegment union) {
        return union.get(attach_flags$LAYOUT, 12L);
    }

    public static void attach_flags(MemorySegment union, int fieldValue) {
        union.set(attach_flags$LAYOUT, 12L, fieldValue);
    }

    public static final ValueLayout.OfInt replace_bpf_fd$layout() {
        return replace_bpf_fd$LAYOUT;
    }

    public static final long replace_bpf_fd$offset() {
        return 16L;
    }

    public static int replace_bpf_fd(MemorySegment union) {
        return union.get(replace_bpf_fd$LAYOUT, 16L);
    }

    public static void replace_bpf_fd(MemorySegment union, int fieldValue) {
        union.set(replace_bpf_fd$LAYOUT, 16L, fieldValue);
    }

    public static final ValueLayout.OfInt relative_fd$layout() {
        return relative_fd$LAYOUT;
    }

    public static final long relative_fd$offset() {
        return 20L;
    }

    public static int relative_fd(MemorySegment union) {
        return union.get(relative_fd$LAYOUT, 20L);
    }

    public static void relative_fd(MemorySegment union, int fieldValue) {
        union.set(relative_fd$LAYOUT, 20L, fieldValue);
    }

    public static final ValueLayout.OfInt relative_id$layout() {
        return relative_id$LAYOUT;
    }

    public static final long relative_id$offset() {
        return 20L;
    }

    public static int relative_id(MemorySegment union) {
        return union.get(relative_id$LAYOUT, 20L);
    }

    public static void relative_id(MemorySegment union, int fieldValue) {
        union.set(relative_id$LAYOUT, 20L, fieldValue);
    }

    public static final ValueLayout.OfLong expected_revision$layout() {
        return expected_revision$LAYOUT;
    }

    public static final long expected_revision$offset() {
        return 24L;
    }

    public static long expected_revision(MemorySegment union) {
        return union.get(expected_revision$LAYOUT, 24L);
    }

    public static void expected_revision(MemorySegment union, long fieldValue) {
        union.set(expected_revision$LAYOUT, 24L, fieldValue);
    }

    public static final GroupLayout test$layout() {
        return test$LAYOUT;
    }

    public static final long test$offset() {
        return 0L;
    }

    public static MemorySegment test(MemorySegment union) {
        return union.asSlice(0L, test$LAYOUT.byteSize());
    }

    public static void test(MemorySegment union, MemorySegment fieldValue) {
        MemorySegment.copy((MemorySegment)fieldValue, (long)0L, (MemorySegment)union, (long)0L, (long)test$LAYOUT.byteSize());
    }

    public static final ValueLayout.OfInt start_id$layout() {
        return start_id$LAYOUT;
    }

    public static final long start_id$offset() {
        return 0L;
    }

    public static int start_id(MemorySegment union) {
        return union.get(start_id$LAYOUT, 0L);
    }

    public static void start_id(MemorySegment union, int fieldValue) {
        union.set(start_id$LAYOUT, 0L, fieldValue);
    }

    public static final ValueLayout.OfInt prog_id$layout() {
        return prog_id$LAYOUT;
    }

    public static final long prog_id$offset() {
        return 0L;
    }

    public static int prog_id(MemorySegment union) {
        return union.get(prog_id$LAYOUT, 0L);
    }

    public static void prog_id(MemorySegment union, int fieldValue) {
        union.set(prog_id$LAYOUT, 0L, fieldValue);
    }

    public static final ValueLayout.OfInt map_id$layout() {
        return map_id$LAYOUT;
    }

    public static final long map_id$offset() {
        return 0L;
    }

    public static int map_id(MemorySegment union) {
        return union.get(map_id$LAYOUT, 0L);
    }

    public static void map_id(MemorySegment union, int fieldValue) {
        union.set(map_id$LAYOUT, 0L, fieldValue);
    }

    public static final ValueLayout.OfInt btf_id$layout() {
        return btf_id$LAYOUT;
    }

    public static final long btf_id$offset() {
        return 0L;
    }

    public static int btf_id(MemorySegment union) {
        return union.get(btf_id$LAYOUT, 0L);
    }

    public static void btf_id(MemorySegment union, int fieldValue) {
        union.set(btf_id$LAYOUT, 0L, fieldValue);
    }

    public static final ValueLayout.OfInt link_id$layout() {
        return link_id$LAYOUT;
    }

    public static final long link_id$offset() {
        return 0L;
    }

    public static int link_id(MemorySegment union) {
        return union.get(link_id$LAYOUT, 0L);
    }

    public static void link_id(MemorySegment union, int fieldValue) {
        union.set(link_id$LAYOUT, 0L, fieldValue);
    }

    public static final ValueLayout.OfInt next_id$layout() {
        return next_id$LAYOUT;
    }

    public static final long next_id$offset() {
        return 4L;
    }

    public static int next_id(MemorySegment union) {
        return union.get(next_id$LAYOUT, 4L);
    }

    public static void next_id(MemorySegment union, int fieldValue) {
        union.set(next_id$LAYOUT, 4L, fieldValue);
    }

    public static final ValueLayout.OfInt open_flags$layout() {
        return open_flags$LAYOUT;
    }

    public static final long open_flags$offset() {
        return 8L;
    }

    public static int open_flags(MemorySegment union) {
        return union.get(open_flags$LAYOUT, 8L);
    }

    public static void open_flags(MemorySegment union, int fieldValue) {
        union.set(open_flags$LAYOUT, 8L, fieldValue);
    }

    public static final GroupLayout info$layout() {
        return info$LAYOUT;
    }

    public static final long info$offset() {
        return 0L;
    }

    public static MemorySegment info(MemorySegment union) {
        return union.asSlice(0L, info$LAYOUT.byteSize());
    }

    public static void info(MemorySegment union, MemorySegment fieldValue) {
        MemorySegment.copy((MemorySegment)fieldValue, (long)0L, (MemorySegment)union, (long)0L, (long)info$LAYOUT.byteSize());
    }

    public static final GroupLayout query$layout() {
        return query$LAYOUT;
    }

    public static final long query$offset() {
        return 0L;
    }

    public static MemorySegment query(MemorySegment union) {
        return union.asSlice(0L, query$LAYOUT.byteSize());
    }

    public static void query(MemorySegment union, MemorySegment fieldValue) {
        MemorySegment.copy((MemorySegment)fieldValue, (long)0L, (MemorySegment)union, (long)0L, (long)query$LAYOUT.byteSize());
    }

    public static final GroupLayout raw_tracepoint$layout() {
        return raw_tracepoint$LAYOUT;
    }

    public static final long raw_tracepoint$offset() {
        return 0L;
    }

    public static MemorySegment raw_tracepoint(MemorySegment union) {
        return union.asSlice(0L, raw_tracepoint$LAYOUT.byteSize());
    }

    public static void raw_tracepoint(MemorySegment union, MemorySegment fieldValue) {
        MemorySegment.copy((MemorySegment)fieldValue, (long)0L, (MemorySegment)union, (long)0L, (long)raw_tracepoint$LAYOUT.byteSize());
    }

    public static final ValueLayout.OfLong btf$layout() {
        return btf$LAYOUT;
    }

    public static final long btf$offset() {
        return 0L;
    }

    public static long btf(MemorySegment union) {
        return union.get(btf$LAYOUT, 0L);
    }

    public static void btf(MemorySegment union, long fieldValue) {
        union.set(btf$LAYOUT, 0L, fieldValue);
    }

    public static final ValueLayout.OfLong btf_log_buf$layout() {
        return btf_log_buf$LAYOUT;
    }

    public static final long btf_log_buf$offset() {
        return 8L;
    }

    public static long btf_log_buf(MemorySegment union) {
        return union.get(btf_log_buf$LAYOUT, 8L);
    }

    public static void btf_log_buf(MemorySegment union, long fieldValue) {
        union.set(btf_log_buf$LAYOUT, 8L, fieldValue);
    }

    public static final ValueLayout.OfInt btf_size$layout() {
        return btf_size$LAYOUT;
    }

    public static final long btf_size$offset() {
        return 16L;
    }

    public static int btf_size(MemorySegment union) {
        return union.get(btf_size$LAYOUT, 16L);
    }

    public static void btf_size(MemorySegment union, int fieldValue) {
        union.set(btf_size$LAYOUT, 16L, fieldValue);
    }

    public static final ValueLayout.OfInt btf_log_size$layout() {
        return btf_log_size$LAYOUT;
    }

    public static final long btf_log_size$offset() {
        return 20L;
    }

    public static int btf_log_size(MemorySegment union) {
        return union.get(btf_log_size$LAYOUT, 20L);
    }

    public static void btf_log_size(MemorySegment union, int fieldValue) {
        union.set(btf_log_size$LAYOUT, 20L, fieldValue);
    }

    public static final ValueLayout.OfInt btf_log_level$layout() {
        return btf_log_level$LAYOUT;
    }

    public static final long btf_log_level$offset() {
        return 24L;
    }

    public static int btf_log_level(MemorySegment union) {
        return union.get(btf_log_level$LAYOUT, 24L);
    }

    public static void btf_log_level(MemorySegment union, int fieldValue) {
        union.set(btf_log_level$LAYOUT, 24L, fieldValue);
    }

    public static final ValueLayout.OfInt btf_log_true_size$layout() {
        return btf_log_true_size$LAYOUT;
    }

    public static final long btf_log_true_size$offset() {
        return 28L;
    }

    public static int btf_log_true_size(MemorySegment union) {
        return union.get(btf_log_true_size$LAYOUT, 28L);
    }

    public static void btf_log_true_size(MemorySegment union, int fieldValue) {
        union.set(btf_log_true_size$LAYOUT, 28L, fieldValue);
    }

    public static final ValueLayout.OfInt btf_flags$layout() {
        return btf_flags$LAYOUT;
    }

    public static final long btf_flags$offset() {
        return 32L;
    }

    public static int btf_flags(MemorySegment union) {
        return union.get(btf_flags$LAYOUT, 32L);
    }

    public static void btf_flags(MemorySegment union, int fieldValue) {
        union.set(btf_flags$LAYOUT, 32L, fieldValue);
    }

    public static final ValueLayout.OfInt btf_token_fd$layout() {
        return btf_token_fd$LAYOUT;
    }

    public static final long btf_token_fd$offset() {
        return 36L;
    }

    public static int btf_token_fd(MemorySegment union) {
        return union.get(btf_token_fd$LAYOUT, 36L);
    }

    public static void btf_token_fd(MemorySegment union, int fieldValue) {
        union.set(btf_token_fd$LAYOUT, 36L, fieldValue);
    }

    public static final GroupLayout task_fd_query$layout() {
        return task_fd_query$LAYOUT;
    }

    public static final long task_fd_query$offset() {
        return 0L;
    }

    public static MemorySegment task_fd_query(MemorySegment union) {
        return union.asSlice(0L, task_fd_query$LAYOUT.byteSize());
    }

    public static void task_fd_query(MemorySegment union, MemorySegment fieldValue) {
        MemorySegment.copy((MemorySegment)fieldValue, (long)0L, (MemorySegment)union, (long)0L, (long)task_fd_query$LAYOUT.byteSize());
    }

    public static final GroupLayout link_create$layout() {
        return link_create$LAYOUT;
    }

    public static final long link_create$offset() {
        return 0L;
    }

    public static MemorySegment link_create(MemorySegment union) {
        return union.asSlice(0L, link_create$LAYOUT.byteSize());
    }

    public static void link_create(MemorySegment union, MemorySegment fieldValue) {
        MemorySegment.copy((MemorySegment)fieldValue, (long)0L, (MemorySegment)union, (long)0L, (long)link_create$LAYOUT.byteSize());
    }

    public static final GroupLayout link_update$layout() {
        return link_update$LAYOUT;
    }

    public static final long link_update$offset() {
        return 0L;
    }

    public static MemorySegment link_update(MemorySegment union) {
        return union.asSlice(0L, link_update$LAYOUT.byteSize());
    }

    public static void link_update(MemorySegment union, MemorySegment fieldValue) {
        MemorySegment.copy((MemorySegment)fieldValue, (long)0L, (MemorySegment)union, (long)0L, (long)link_update$LAYOUT.byteSize());
    }

    public static final GroupLayout link_detach$layout() {
        return link_detach$LAYOUT;
    }

    public static final long link_detach$offset() {
        return 0L;
    }

    public static MemorySegment link_detach(MemorySegment union) {
        return union.asSlice(0L, link_detach$LAYOUT.byteSize());
    }

    public static void link_detach(MemorySegment union, MemorySegment fieldValue) {
        MemorySegment.copy((MemorySegment)fieldValue, (long)0L, (MemorySegment)union, (long)0L, (long)link_detach$LAYOUT.byteSize());
    }

    public static final GroupLayout enable_stats$layout() {
        return enable_stats$LAYOUT;
    }

    public static final long enable_stats$offset() {
        return 0L;
    }

    public static MemorySegment enable_stats(MemorySegment union) {
        return union.asSlice(0L, enable_stats$LAYOUT.byteSize());
    }

    public static void enable_stats(MemorySegment union, MemorySegment fieldValue) {
        MemorySegment.copy((MemorySegment)fieldValue, (long)0L, (MemorySegment)union, (long)0L, (long)enable_stats$LAYOUT.byteSize());
    }

    public static final GroupLayout iter_create$layout() {
        return iter_create$LAYOUT;
    }

    public static final long iter_create$offset() {
        return 0L;
    }

    public static MemorySegment iter_create(MemorySegment union) {
        return union.asSlice(0L, iter_create$LAYOUT.byteSize());
    }

    public static void iter_create(MemorySegment union, MemorySegment fieldValue) {
        MemorySegment.copy((MemorySegment)fieldValue, (long)0L, (MemorySegment)union, (long)0L, (long)iter_create$LAYOUT.byteSize());
    }

    public static final GroupLayout prog_bind_map$layout() {
        return prog_bind_map$LAYOUT;
    }

    public static final long prog_bind_map$offset() {
        return 0L;
    }

    public static MemorySegment prog_bind_map(MemorySegment union) {
        return union.asSlice(0L, prog_bind_map$LAYOUT.byteSize());
    }

    public static void prog_bind_map(MemorySegment union, MemorySegment fieldValue) {
        MemorySegment.copy((MemorySegment)fieldValue, (long)0L, (MemorySegment)union, (long)0L, (long)prog_bind_map$LAYOUT.byteSize());
    }

    public static final GroupLayout token_create$layout() {
        return token_create$LAYOUT;
    }

    public static final long token_create$offset() {
        return 0L;
    }

    public static MemorySegment token_create(MemorySegment union) {
        return union.asSlice(0L, token_create$LAYOUT.byteSize());
    }

    public static void token_create(MemorySegment union, MemorySegment fieldValue) {
        MemorySegment.copy((MemorySegment)fieldValue, (long)0L, (MemorySegment)union, (long)0L, (long)token_create$LAYOUT.byteSize());
    }

    public static MemorySegment asSlice(MemorySegment array, long index2) {
        return array.asSlice(bpf_attr.layout().byteSize() * index2);
    }

    public static long sizeof() {
        return bpf_attr.layout().byteSize();
    }

    public static MemorySegment allocate(SegmentAllocator allocator) {
        return allocator.allocate((MemoryLayout)bpf_attr.layout());
    }

    public static MemorySegment allocateArray(long elementCount, SegmentAllocator allocator) {
        return allocator.allocate((MemoryLayout)MemoryLayout.sequenceLayout((long)elementCount, (MemoryLayout)bpf_attr.layout()));
    }

    public static MemorySegment reinterpret(MemorySegment addr2, Arena arena, Consumer<MemorySegment> cleanup) {
        return bpf_attr.reinterpret(addr2, 1L, arena, cleanup);
    }

    public static MemorySegment reinterpret(MemorySegment addr2, long elementCount, Arena arena, Consumer<MemorySegment> cleanup) {
        return addr2.reinterpret(bpf_attr.layout().byteSize() * elementCount, arena, cleanup);
    }

    public static class batch {
        private static final GroupLayout $LAYOUT = MemoryLayout.structLayout((MemoryLayout[])new MemoryLayout[]{Lib.C_LONG_LONG.withName("in_batch"), Lib.C_LONG_LONG.withName("out_batch"), Lib.C_LONG_LONG.withName("keys"), Lib.C_LONG_LONG.withName("values"), Lib.C_INT.withName("count"), Lib.C_INT.withName("map_fd"), Lib.C_LONG_LONG.withName("elem_flags"), Lib.C_LONG_LONG.withName("flags")}).withName("$anon$1515:2");
        private static final ValueLayout.OfLong in_batch$LAYOUT = (ValueLayout.OfLong)$LAYOUT.select(new MemoryLayout.PathElement[]{MemoryLayout.PathElement.groupElement((String)"in_batch")});
        private static final long in_batch$OFFSET = 0L;
        private static final ValueLayout.OfLong out_batch$LAYOUT = (ValueLayout.OfLong)$LAYOUT.select(new MemoryLayout.PathElement[]{MemoryLayout.PathElement.groupElement((String)"out_batch")});
        private static final long out_batch$OFFSET = 8L;
        private static final ValueLayout.OfLong keys$LAYOUT = (ValueLayout.OfLong)$LAYOUT.select(new MemoryLayout.PathElement[]{MemoryLayout.PathElement.groupElement((String)"keys")});
        private static final long keys$OFFSET = 16L;
        private static final ValueLayout.OfLong values$LAYOUT = (ValueLayout.OfLong)$LAYOUT.select(new MemoryLayout.PathElement[]{MemoryLayout.PathElement.groupElement((String)"values")});
        private static final long values$OFFSET = 24L;
        private static final ValueLayout.OfInt count$LAYOUT = (ValueLayout.OfInt)$LAYOUT.select(new MemoryLayout.PathElement[]{MemoryLayout.PathElement.groupElement((String)"count")});
        private static final long count$OFFSET = 32L;
        private static final ValueLayout.OfInt map_fd$LAYOUT = (ValueLayout.OfInt)$LAYOUT.select(new MemoryLayout.PathElement[]{MemoryLayout.PathElement.groupElement((String)"map_fd")});
        private static final long map_fd$OFFSET = 36L;
        private static final ValueLayout.OfLong elem_flags$LAYOUT = (ValueLayout.OfLong)$LAYOUT.select(new MemoryLayout.PathElement[]{MemoryLayout.PathElement.groupElement((String)"elem_flags")});
        private static final long elem_flags$OFFSET = 40L;
        private static final ValueLayout.OfLong flags$LAYOUT = (ValueLayout.OfLong)$LAYOUT.select(new MemoryLayout.PathElement[]{MemoryLayout.PathElement.groupElement((String)"flags")});
        private static final long flags$OFFSET = 48L;

        batch() {
        }

        public static final GroupLayout layout() {
            return $LAYOUT;
        }

        public static final ValueLayout.OfLong in_batch$layout() {
            return in_batch$LAYOUT;
        }

        public static final long in_batch$offset() {
            return 0L;
        }

        public static long in_batch(MemorySegment struct) {
            return struct.get(in_batch$LAYOUT, 0L);
        }

        public static void in_batch(MemorySegment struct, long fieldValue) {
            struct.set(in_batch$LAYOUT, 0L, fieldValue);
        }

        public static final ValueLayout.OfLong out_batch$layout() {
            return out_batch$LAYOUT;
        }

        public static final long out_batch$offset() {
            return 8L;
        }

        public static long out_batch(MemorySegment struct) {
            return struct.get(out_batch$LAYOUT, 8L);
        }

        public static void out_batch(MemorySegment struct, long fieldValue) {
            struct.set(out_batch$LAYOUT, 8L, fieldValue);
        }

        public static final ValueLayout.OfLong keys$layout() {
            return keys$LAYOUT;
        }

        public static final long keys$offset() {
            return 16L;
        }

        public static long keys(MemorySegment struct) {
            return struct.get(keys$LAYOUT, 16L);
        }

        public static void keys(MemorySegment struct, long fieldValue) {
            struct.set(keys$LAYOUT, 16L, fieldValue);
        }

        public static final ValueLayout.OfLong values$layout() {
            return values$LAYOUT;
        }

        public static final long values$offset() {
            return 24L;
        }

        public static long values(MemorySegment struct) {
            return struct.get(values$LAYOUT, 24L);
        }

        public static void values(MemorySegment struct, long fieldValue) {
            struct.set(values$LAYOUT, 24L, fieldValue);
        }

        public static final ValueLayout.OfInt count$layout() {
            return count$LAYOUT;
        }

        public static final long count$offset() {
            return 32L;
        }

        public static int count(MemorySegment struct) {
            return struct.get(count$LAYOUT, 32L);
        }

        public static void count(MemorySegment struct, int fieldValue) {
            struct.set(count$LAYOUT, 32L, fieldValue);
        }

        public static final ValueLayout.OfInt map_fd$layout() {
            return map_fd$LAYOUT;
        }

        public static final long map_fd$offset() {
            return 36L;
        }

        public static int map_fd(MemorySegment struct) {
            return struct.get(map_fd$LAYOUT, 36L);
        }

        public static void map_fd(MemorySegment struct, int fieldValue) {
            struct.set(map_fd$LAYOUT, 36L, fieldValue);
        }

        public static final ValueLayout.OfLong elem_flags$layout() {
            return elem_flags$LAYOUT;
        }

        public static final long elem_flags$offset() {
            return 40L;
        }

        public static long elem_flags(MemorySegment struct) {
            return struct.get(elem_flags$LAYOUT, 40L);
        }

        public static void elem_flags(MemorySegment struct, long fieldValue) {
            struct.set(elem_flags$LAYOUT, 40L, fieldValue);
        }

        public static final ValueLayout.OfLong flags$layout() {
            return flags$LAYOUT;
        }

        public static final long flags$offset() {
            return 48L;
        }

        public static long flags(MemorySegment struct) {
            return struct.get(flags$LAYOUT, 48L);
        }

        public static void flags(MemorySegment struct, long fieldValue) {
            struct.set(flags$LAYOUT, 48L, fieldValue);
        }

        public static MemorySegment asSlice(MemorySegment array, long index2) {
            return array.asSlice(batch.layout().byteSize() * index2);
        }

        public static long sizeof() {
            return batch.layout().byteSize();
        }

        public static MemorySegment allocate(SegmentAllocator allocator) {
            return allocator.allocate((MemoryLayout)batch.layout());
        }

        public static MemorySegment allocateArray(long elementCount, SegmentAllocator allocator) {
            return allocator.allocate((MemoryLayout)MemoryLayout.sequenceLayout((long)elementCount, (MemoryLayout)batch.layout()));
        }

        public static MemorySegment reinterpret(MemorySegment addr2, Arena arena, Consumer<MemorySegment> cleanup) {
            return batch.reinterpret(addr2, 1L, arena, cleanup);
        }

        public static MemorySegment reinterpret(MemorySegment addr2, long elementCount, Arena arena, Consumer<MemorySegment> cleanup) {
            return addr2.reinterpret(batch.layout().byteSize() * elementCount, arena, cleanup);
        }
    }

    public static class test {
        private static final GroupLayout $LAYOUT = MemoryLayout.structLayout((MemoryLayout[])new MemoryLayout[]{Lib.C_INT.withName("prog_fd"), Lib.C_INT.withName("retval"), Lib.C_INT.withName("data_size_in"), Lib.C_INT.withName("data_size_out"), Lib.C_LONG_LONG.withName("data_in"), Lib.C_LONG_LONG.withName("data_out"), Lib.C_INT.withName("repeat"), Lib.C_INT.withName("duration"), Lib.C_INT.withName("ctx_size_in"), Lib.C_INT.withName("ctx_size_out"), Lib.C_LONG_LONG.withName("ctx_in"), Lib.C_LONG_LONG.withName("ctx_out"), Lib.C_INT.withName("flags"), Lib.C_INT.withName("cpu"), Lib.C_INT.withName("batch_size"), MemoryLayout.paddingLayout((long)4L)}).withName("$anon$1617:2");
        private static final ValueLayout.OfInt prog_fd$LAYOUT = (ValueLayout.OfInt)$LAYOUT.select(new MemoryLayout.PathElement[]{MemoryLayout.PathElement.groupElement((String)"prog_fd")});
        private static final long prog_fd$OFFSET = 0L;
        private static final ValueLayout.OfInt retval$LAYOUT = (ValueLayout.OfInt)$LAYOUT.select(new MemoryLayout.PathElement[]{MemoryLayout.PathElement.groupElement((String)"retval")});
        private static final long retval$OFFSET = 4L;
        private static final ValueLayout.OfInt data_size_in$LAYOUT = (ValueLayout.OfInt)$LAYOUT.select(new MemoryLayout.PathElement[]{MemoryLayout.PathElement.groupElement((String)"data_size_in")});
        private static final long data_size_in$OFFSET = 8L;
        private static final ValueLayout.OfInt data_size_out$LAYOUT = (ValueLayout.OfInt)$LAYOUT.select(new MemoryLayout.PathElement[]{MemoryLayout.PathElement.groupElement((String)"data_size_out")});
        private static final long data_size_out$OFFSET = 12L;
        private static final ValueLayout.OfLong data_in$LAYOUT = (ValueLayout.OfLong)$LAYOUT.select(new MemoryLayout.PathElement[]{MemoryLayout.PathElement.groupElement((String)"data_in")});
        private static final long data_in$OFFSET = 16L;
        private static final ValueLayout.OfLong data_out$LAYOUT = (ValueLayout.OfLong)$LAYOUT.select(new MemoryLayout.PathElement[]{MemoryLayout.PathElement.groupElement((String)"data_out")});
        private static final long data_out$OFFSET = 24L;
        private static final ValueLayout.OfInt repeat$LAYOUT = (ValueLayout.OfInt)$LAYOUT.select(new MemoryLayout.PathElement[]{MemoryLayout.PathElement.groupElement((String)"repeat")});
        private static final long repeat$OFFSET = 32L;
        private static final ValueLayout.OfInt duration$LAYOUT = (ValueLayout.OfInt)$LAYOUT.select(new MemoryLayout.PathElement[]{MemoryLayout.PathElement.groupElement((String)"duration")});
        private static final long duration$OFFSET = 36L;
        private static final ValueLayout.OfInt ctx_size_in$LAYOUT = (ValueLayout.OfInt)$LAYOUT.select(new MemoryLayout.PathElement[]{MemoryLayout.PathElement.groupElement((String)"ctx_size_in")});
        private static final long ctx_size_in$OFFSET = 40L;
        private static final ValueLayout.OfInt ctx_size_out$LAYOUT = (ValueLayout.OfInt)$LAYOUT.select(new MemoryLayout.PathElement[]{MemoryLayout.PathElement.groupElement((String)"ctx_size_out")});
        private static final long ctx_size_out$OFFSET = 44L;
        private static final ValueLayout.OfLong ctx_in$LAYOUT = (ValueLayout.OfLong)$LAYOUT.select(new MemoryLayout.PathElement[]{MemoryLayout.PathElement.groupElement((String)"ctx_in")});
        private static final long ctx_in$OFFSET = 48L;
        private static final ValueLayout.OfLong ctx_out$LAYOUT = (ValueLayout.OfLong)$LAYOUT.select(new MemoryLayout.PathElement[]{MemoryLayout.PathElement.groupElement((String)"ctx_out")});
        private static final long ctx_out$OFFSET = 56L;
        private static final ValueLayout.OfInt flags$LAYOUT = (ValueLayout.OfInt)$LAYOUT.select(new MemoryLayout.PathElement[]{MemoryLayout.PathElement.groupElement((String)"flags")});
        private static final long flags$OFFSET = 64L;
        private static final ValueLayout.OfInt cpu$LAYOUT = (ValueLayout.OfInt)$LAYOUT.select(new MemoryLayout.PathElement[]{MemoryLayout.PathElement.groupElement((String)"cpu")});
        private static final long cpu$OFFSET = 68L;
        private static final ValueLayout.OfInt batch_size$LAYOUT = (ValueLayout.OfInt)$LAYOUT.select(new MemoryLayout.PathElement[]{MemoryLayout.PathElement.groupElement((String)"batch_size")});
        private static final long batch_size$OFFSET = 72L;

        test() {
        }

        public static final GroupLayout layout() {
            return $LAYOUT;
        }

        public static final ValueLayout.OfInt prog_fd$layout() {
            return prog_fd$LAYOUT;
        }

        public static final long prog_fd$offset() {
            return 0L;
        }

        public static int prog_fd(MemorySegment struct) {
            return struct.get(prog_fd$LAYOUT, 0L);
        }

        public static void prog_fd(MemorySegment struct, int fieldValue) {
            struct.set(prog_fd$LAYOUT, 0L, fieldValue);
        }

        public static final ValueLayout.OfInt retval$layout() {
            return retval$LAYOUT;
        }

        public static final long retval$offset() {
            return 4L;
        }

        public static int retval(MemorySegment struct) {
            return struct.get(retval$LAYOUT, 4L);
        }

        public static void retval(MemorySegment struct, int fieldValue) {
            struct.set(retval$LAYOUT, 4L, fieldValue);
        }

        public static final ValueLayout.OfInt data_size_in$layout() {
            return data_size_in$LAYOUT;
        }

        public static final long data_size_in$offset() {
            return 8L;
        }

        public static int data_size_in(MemorySegment struct) {
            return struct.get(data_size_in$LAYOUT, 8L);
        }

        public static void data_size_in(MemorySegment struct, int fieldValue) {
            struct.set(data_size_in$LAYOUT, 8L, fieldValue);
        }

        public static final ValueLayout.OfInt data_size_out$layout() {
            return data_size_out$LAYOUT;
        }

        public static final long data_size_out$offset() {
            return 12L;
        }

        public static int data_size_out(MemorySegment struct) {
            return struct.get(data_size_out$LAYOUT, 12L);
        }

        public static void data_size_out(MemorySegment struct, int fieldValue) {
            struct.set(data_size_out$LAYOUT, 12L, fieldValue);
        }

        public static final ValueLayout.OfLong data_in$layout() {
            return data_in$LAYOUT;
        }

        public static final long data_in$offset() {
            return 16L;
        }

        public static long data_in(MemorySegment struct) {
            return struct.get(data_in$LAYOUT, 16L);
        }

        public static void data_in(MemorySegment struct, long fieldValue) {
            struct.set(data_in$LAYOUT, 16L, fieldValue);
        }

        public static final ValueLayout.OfLong data_out$layout() {
            return data_out$LAYOUT;
        }

        public static final long data_out$offset() {
            return 24L;
        }

        public static long data_out(MemorySegment struct) {
            return struct.get(data_out$LAYOUT, 24L);
        }

        public static void data_out(MemorySegment struct, long fieldValue) {
            struct.set(data_out$LAYOUT, 24L, fieldValue);
        }

        public static final ValueLayout.OfInt repeat$layout() {
            return repeat$LAYOUT;
        }

        public static final long repeat$offset() {
            return 32L;
        }

        public static int repeat(MemorySegment struct) {
            return struct.get(repeat$LAYOUT, 32L);
        }

        public static void repeat(MemorySegment struct, int fieldValue) {
            struct.set(repeat$LAYOUT, 32L, fieldValue);
        }

        public static final ValueLayout.OfInt duration$layout() {
            return duration$LAYOUT;
        }

        public static final long duration$offset() {
            return 36L;
        }

        public static int duration(MemorySegment struct) {
            return struct.get(duration$LAYOUT, 36L);
        }

        public static void duration(MemorySegment struct, int fieldValue) {
            struct.set(duration$LAYOUT, 36L, fieldValue);
        }

        public static final ValueLayout.OfInt ctx_size_in$layout() {
            return ctx_size_in$LAYOUT;
        }

        public static final long ctx_size_in$offset() {
            return 40L;
        }

        public static int ctx_size_in(MemorySegment struct) {
            return struct.get(ctx_size_in$LAYOUT, 40L);
        }

        public static void ctx_size_in(MemorySegment struct, int fieldValue) {
            struct.set(ctx_size_in$LAYOUT, 40L, fieldValue);
        }

        public static final ValueLayout.OfInt ctx_size_out$layout() {
            return ctx_size_out$LAYOUT;
        }

        public static final long ctx_size_out$offset() {
            return 44L;
        }

        public static int ctx_size_out(MemorySegment struct) {
            return struct.get(ctx_size_out$LAYOUT, 44L);
        }

        public static void ctx_size_out(MemorySegment struct, int fieldValue) {
            struct.set(ctx_size_out$LAYOUT, 44L, fieldValue);
        }

        public static final ValueLayout.OfLong ctx_in$layout() {
            return ctx_in$LAYOUT;
        }

        public static final long ctx_in$offset() {
            return 48L;
        }

        public static long ctx_in(MemorySegment struct) {
            return struct.get(ctx_in$LAYOUT, 48L);
        }

        public static void ctx_in(MemorySegment struct, long fieldValue) {
            struct.set(ctx_in$LAYOUT, 48L, fieldValue);
        }

        public static final ValueLayout.OfLong ctx_out$layout() {
            return ctx_out$LAYOUT;
        }

        public static final long ctx_out$offset() {
            return 56L;
        }

        public static long ctx_out(MemorySegment struct) {
            return struct.get(ctx_out$LAYOUT, 56L);
        }

        public static void ctx_out(MemorySegment struct, long fieldValue) {
            struct.set(ctx_out$LAYOUT, 56L, fieldValue);
        }

        public static final ValueLayout.OfInt flags$layout() {
            return flags$LAYOUT;
        }

        public static final long flags$offset() {
            return 64L;
        }

        public static int flags(MemorySegment struct) {
            return struct.get(flags$LAYOUT, 64L);
        }

        public static void flags(MemorySegment struct, int fieldValue) {
            struct.set(flags$LAYOUT, 64L, fieldValue);
        }

        public static final ValueLayout.OfInt cpu$layout() {
            return cpu$LAYOUT;
        }

        public static final long cpu$offset() {
            return 68L;
        }

        public static int cpu(MemorySegment struct) {
            return struct.get(cpu$LAYOUT, 68L);
        }

        public static void cpu(MemorySegment struct, int fieldValue) {
            struct.set(cpu$LAYOUT, 68L, fieldValue);
        }

        public static final ValueLayout.OfInt batch_size$layout() {
            return batch_size$LAYOUT;
        }

        public static final long batch_size$offset() {
            return 72L;
        }

        public static int batch_size(MemorySegment struct) {
            return struct.get(batch_size$LAYOUT, 72L);
        }

        public static void batch_size(MemorySegment struct, int fieldValue) {
            struct.set(batch_size$LAYOUT, 72L, fieldValue);
        }

        public static MemorySegment asSlice(MemorySegment array, long index2) {
            return array.asSlice(test.layout().byteSize() * index2);
        }

        public static long sizeof() {
            return test.layout().byteSize();
        }

        public static MemorySegment allocate(SegmentAllocator allocator) {
            return allocator.allocate((MemoryLayout)test.layout());
        }

        public static MemorySegment allocateArray(long elementCount, SegmentAllocator allocator) {
            return allocator.allocate((MemoryLayout)MemoryLayout.sequenceLayout((long)elementCount, (MemoryLayout)test.layout()));
        }

        public static MemorySegment reinterpret(MemorySegment addr2, Arena arena, Consumer<MemorySegment> cleanup) {
            return test.reinterpret(addr2, 1L, arena, cleanup);
        }

        public static MemorySegment reinterpret(MemorySegment addr2, long elementCount, Arena arena, Consumer<MemorySegment> cleanup) {
            return addr2.reinterpret(test.layout().byteSize() * elementCount, arena, cleanup);
        }
    }

    public static class info {
        private static final GroupLayout $LAYOUT = MemoryLayout.structLayout((MemoryLayout[])new MemoryLayout[]{Lib.C_INT.withName("bpf_fd"), Lib.C_INT.withName("info_len"), Lib.C_LONG_LONG.withName("info")}).withName("$anon$1653:2");
        private static final ValueLayout.OfInt bpf_fd$LAYOUT = (ValueLayout.OfInt)$LAYOUT.select(new MemoryLayout.PathElement[]{MemoryLayout.PathElement.groupElement((String)"bpf_fd")});
        private static final long bpf_fd$OFFSET = 0L;
        private static final ValueLayout.OfInt info_len$LAYOUT = (ValueLayout.OfInt)$LAYOUT.select(new MemoryLayout.PathElement[]{MemoryLayout.PathElement.groupElement((String)"info_len")});
        private static final long info_len$OFFSET = 4L;
        private static final ValueLayout.OfLong info$LAYOUT = (ValueLayout.OfLong)$LAYOUT.select(new MemoryLayout.PathElement[]{MemoryLayout.PathElement.groupElement((String)"info")});
        private static final long info$OFFSET = 8L;

        info() {
        }

        public static final GroupLayout layout() {
            return $LAYOUT;
        }

        public static final ValueLayout.OfInt bpf_fd$layout() {
            return bpf_fd$LAYOUT;
        }

        public static final long bpf_fd$offset() {
            return 0L;
        }

        public static int bpf_fd(MemorySegment struct) {
            return struct.get(bpf_fd$LAYOUT, 0L);
        }

        public static void bpf_fd(MemorySegment struct, int fieldValue) {
            struct.set(bpf_fd$LAYOUT, 0L, fieldValue);
        }

        public static final ValueLayout.OfInt info_len$layout() {
            return info_len$LAYOUT;
        }

        public static final long info_len$offset() {
            return 4L;
        }

        public static int info_len(MemorySegment struct) {
            return struct.get(info_len$LAYOUT, 4L);
        }

        public static void info_len(MemorySegment struct, int fieldValue) {
            struct.set(info_len$LAYOUT, 4L, fieldValue);
        }

        public static final ValueLayout.OfLong info$layout() {
            return info$LAYOUT;
        }

        public static final long info$offset() {
            return 8L;
        }

        public static long info(MemorySegment struct) {
            return struct.get(info$LAYOUT, 8L);
        }

        public static void info(MemorySegment struct, long fieldValue) {
            struct.set(info$LAYOUT, 8L, fieldValue);
        }

        public static MemorySegment asSlice(MemorySegment array, long index2) {
            return array.asSlice(info.layout().byteSize() * index2);
        }

        public static long sizeof() {
            return info.layout().byteSize();
        }

        public static MemorySegment allocate(SegmentAllocator allocator) {
            return allocator.allocate((MemoryLayout)info.layout());
        }

        public static MemorySegment allocateArray(long elementCount, SegmentAllocator allocator) {
            return allocator.allocate((MemoryLayout)MemoryLayout.sequenceLayout((long)elementCount, (MemoryLayout)info.layout()));
        }

        public static MemorySegment reinterpret(MemorySegment addr2, Arena arena, Consumer<MemorySegment> cleanup) {
            return info.reinterpret(addr2, 1L, arena, cleanup);
        }

        public static MemorySegment reinterpret(MemorySegment addr2, long elementCount, Arena arena, Consumer<MemorySegment> cleanup) {
            return addr2.reinterpret(info.layout().byteSize() * elementCount, arena, cleanup);
        }
    }

    public static class query {
        private static final GroupLayout $LAYOUT = MemoryLayout.structLayout((MemoryLayout[])new MemoryLayout[]{MemoryLayout.unionLayout((MemoryLayout[])new MemoryLayout[]{Lib.C_INT.withName("target_fd"), Lib.C_INT.withName("target_ifindex")}).withName("$anon$1660:3"), Lib.C_INT.withName("attach_type"), Lib.C_INT.withName("query_flags"), Lib.C_INT.withName("attach_flags"), Lib.C_LONG_LONG.withName("prog_ids"), MemoryLayout.unionLayout((MemoryLayout[])new MemoryLayout[]{Lib.C_INT.withName("prog_cnt"), Lib.C_INT.withName("count")}).withName("$anon$1668:3"), MemoryLayout.paddingLayout((long)4L), Lib.C_LONG_LONG.withName("prog_attach_flags"), Lib.C_LONG_LONG.withName("link_ids"), Lib.C_LONG_LONG.withName("link_attach_flags"), Lib.C_LONG_LONG.withName("revision")}).withName("$anon$1659:2");
        private static final ValueLayout.OfInt target_fd$LAYOUT = (ValueLayout.OfInt)$LAYOUT.select(new MemoryLayout.PathElement[]{MemoryLayout.PathElement.groupElement((String)"$anon$1660:3"), MemoryLayout.PathElement.groupElement((String)"target_fd")});
        private static final long target_fd$OFFSET = 0L;
        private static final ValueLayout.OfInt target_ifindex$LAYOUT = (ValueLayout.OfInt)$LAYOUT.select(new MemoryLayout.PathElement[]{MemoryLayout.PathElement.groupElement((String)"$anon$1660:3"), MemoryLayout.PathElement.groupElement((String)"target_ifindex")});
        private static final long target_ifindex$OFFSET = 0L;
        private static final ValueLayout.OfInt attach_type$LAYOUT = (ValueLayout.OfInt)$LAYOUT.select(new MemoryLayout.PathElement[]{MemoryLayout.PathElement.groupElement((String)"attach_type")});
        private static final long attach_type$OFFSET = 4L;
        private static final ValueLayout.OfInt query_flags$LAYOUT = (ValueLayout.OfInt)$LAYOUT.select(new MemoryLayout.PathElement[]{MemoryLayout.PathElement.groupElement((String)"query_flags")});
        private static final long query_flags$OFFSET = 8L;
        private static final ValueLayout.OfInt attach_flags$LAYOUT = (ValueLayout.OfInt)$LAYOUT.select(new MemoryLayout.PathElement[]{MemoryLayout.PathElement.groupElement((String)"attach_flags")});
        private static final long attach_flags$OFFSET = 12L;
        private static final ValueLayout.OfLong prog_ids$LAYOUT = (ValueLayout.OfLong)$LAYOUT.select(new MemoryLayout.PathElement[]{MemoryLayout.PathElement.groupElement((String)"prog_ids")});
        private static final long prog_ids$OFFSET = 16L;
        private static final ValueLayout.OfInt prog_cnt$LAYOUT = (ValueLayout.OfInt)$LAYOUT.select(new MemoryLayout.PathElement[]{MemoryLayout.PathElement.groupElement((String)"$anon$1668:3"), MemoryLayout.PathElement.groupElement((String)"prog_cnt")});
        private static final long prog_cnt$OFFSET = 24L;
        private static final ValueLayout.OfInt count$LAYOUT = (ValueLayout.OfInt)$LAYOUT.select(new MemoryLayout.PathElement[]{MemoryLayout.PathElement.groupElement((String)"$anon$1668:3"), MemoryLayout.PathElement.groupElement((String)"count")});
        private static final long count$OFFSET = 24L;
        private static final ValueLayout.OfLong prog_attach_flags$LAYOUT = (ValueLayout.OfLong)$LAYOUT.select(new MemoryLayout.PathElement[]{MemoryLayout.PathElement.groupElement((String)"prog_attach_flags")});
        private static final long prog_attach_flags$OFFSET = 32L;
        private static final ValueLayout.OfLong link_ids$LAYOUT = (ValueLayout.OfLong)$LAYOUT.select(new MemoryLayout.PathElement[]{MemoryLayout.PathElement.groupElement((String)"link_ids")});
        private static final long link_ids$OFFSET = 40L;
        private static final ValueLayout.OfLong link_attach_flags$LAYOUT = (ValueLayout.OfLong)$LAYOUT.select(new MemoryLayout.PathElement[]{MemoryLayout.PathElement.groupElement((String)"link_attach_flags")});
        private static final long link_attach_flags$OFFSET = 48L;
        private static final ValueLayout.OfLong revision$LAYOUT = (ValueLayout.OfLong)$LAYOUT.select(new MemoryLayout.PathElement[]{MemoryLayout.PathElement.groupElement((String)"revision")});
        private static final long revision$OFFSET = 56L;

        query() {
        }

        public static final GroupLayout layout() {
            return $LAYOUT;
        }

        public static final ValueLayout.OfInt target_fd$layout() {
            return target_fd$LAYOUT;
        }

        public static final long target_fd$offset() {
            return 0L;
        }

        public static int target_fd(MemorySegment struct) {
            return struct.get(target_fd$LAYOUT, 0L);
        }

        public static void target_fd(MemorySegment struct, int fieldValue) {
            struct.set(target_fd$LAYOUT, 0L, fieldValue);
        }

        public static final ValueLayout.OfInt target_ifindex$layout() {
            return target_ifindex$LAYOUT;
        }

        public static final long target_ifindex$offset() {
            return 0L;
        }

        public static int target_ifindex(MemorySegment struct) {
            return struct.get(target_ifindex$LAYOUT, 0L);
        }

        public static void target_ifindex(MemorySegment struct, int fieldValue) {
            struct.set(target_ifindex$LAYOUT, 0L, fieldValue);
        }

        public static final ValueLayout.OfInt attach_type$layout() {
            return attach_type$LAYOUT;
        }

        public static final long attach_type$offset() {
            return 4L;
        }

        public static int attach_type(MemorySegment struct) {
            return struct.get(attach_type$LAYOUT, 4L);
        }

        public static void attach_type(MemorySegment struct, int fieldValue) {
            struct.set(attach_type$LAYOUT, 4L, fieldValue);
        }

        public static final ValueLayout.OfInt query_flags$layout() {
            return query_flags$LAYOUT;
        }

        public static final long query_flags$offset() {
            return 8L;
        }

        public static int query_flags(MemorySegment struct) {
            return struct.get(query_flags$LAYOUT, 8L);
        }

        public static void query_flags(MemorySegment struct, int fieldValue) {
            struct.set(query_flags$LAYOUT, 8L, fieldValue);
        }

        public static final ValueLayout.OfInt attach_flags$layout() {
            return attach_flags$LAYOUT;
        }

        public static final long attach_flags$offset() {
            return 12L;
        }

        public static int attach_flags(MemorySegment struct) {
            return struct.get(attach_flags$LAYOUT, 12L);
        }

        public static void attach_flags(MemorySegment struct, int fieldValue) {
            struct.set(attach_flags$LAYOUT, 12L, fieldValue);
        }

        public static final ValueLayout.OfLong prog_ids$layout() {
            return prog_ids$LAYOUT;
        }

        public static final long prog_ids$offset() {
            return 16L;
        }

        public static long prog_ids(MemorySegment struct) {
            return struct.get(prog_ids$LAYOUT, 16L);
        }

        public static void prog_ids(MemorySegment struct, long fieldValue) {
            struct.set(prog_ids$LAYOUT, 16L, fieldValue);
        }

        public static final ValueLayout.OfInt prog_cnt$layout() {
            return prog_cnt$LAYOUT;
        }

        public static final long prog_cnt$offset() {
            return 24L;
        }

        public static int prog_cnt(MemorySegment struct) {
            return struct.get(prog_cnt$LAYOUT, 24L);
        }

        public static void prog_cnt(MemorySegment struct, int fieldValue) {
            struct.set(prog_cnt$LAYOUT, 24L, fieldValue);
        }

        public static final ValueLayout.OfInt count$layout() {
            return count$LAYOUT;
        }

        public static final long count$offset() {
            return 24L;
        }

        public static int count(MemorySegment struct) {
            return struct.get(count$LAYOUT, 24L);
        }

        public static void count(MemorySegment struct, int fieldValue) {
            struct.set(count$LAYOUT, 24L, fieldValue);
        }

        public static final ValueLayout.OfLong prog_attach_flags$layout() {
            return prog_attach_flags$LAYOUT;
        }

        public static final long prog_attach_flags$offset() {
            return 32L;
        }

        public static long prog_attach_flags(MemorySegment struct) {
            return struct.get(prog_attach_flags$LAYOUT, 32L);
        }

        public static void prog_attach_flags(MemorySegment struct, long fieldValue) {
            struct.set(prog_attach_flags$LAYOUT, 32L, fieldValue);
        }

        public static final ValueLayout.OfLong link_ids$layout() {
            return link_ids$LAYOUT;
        }

        public static final long link_ids$offset() {
            return 40L;
        }

        public static long link_ids(MemorySegment struct) {
            return struct.get(link_ids$LAYOUT, 40L);
        }

        public static void link_ids(MemorySegment struct, long fieldValue) {
            struct.set(link_ids$LAYOUT, 40L, fieldValue);
        }

        public static final ValueLayout.OfLong link_attach_flags$layout() {
            return link_attach_flags$LAYOUT;
        }

        public static final long link_attach_flags$offset() {
            return 48L;
        }

        public static long link_attach_flags(MemorySegment struct) {
            return struct.get(link_attach_flags$LAYOUT, 48L);
        }

        public static void link_attach_flags(MemorySegment struct, long fieldValue) {
            struct.set(link_attach_flags$LAYOUT, 48L, fieldValue);
        }

        public static final ValueLayout.OfLong revision$layout() {
            return revision$LAYOUT;
        }

        public static final long revision$offset() {
            return 56L;
        }

        public static long revision(MemorySegment struct) {
            return struct.get(revision$LAYOUT, 56L);
        }

        public static void revision(MemorySegment struct, long fieldValue) {
            struct.set(revision$LAYOUT, 56L, fieldValue);
        }

        public static MemorySegment asSlice(MemorySegment array, long index2) {
            return array.asSlice(query.layout().byteSize() * index2);
        }

        public static long sizeof() {
            return query.layout().byteSize();
        }

        public static MemorySegment allocate(SegmentAllocator allocator) {
            return allocator.allocate((MemoryLayout)query.layout());
        }

        public static MemorySegment allocateArray(long elementCount, SegmentAllocator allocator) {
            return allocator.allocate((MemoryLayout)MemoryLayout.sequenceLayout((long)elementCount, (MemoryLayout)query.layout()));
        }

        public static MemorySegment reinterpret(MemorySegment addr2, Arena arena, Consumer<MemorySegment> cleanup) {
            return query.reinterpret(addr2, 1L, arena, cleanup);
        }

        public static MemorySegment reinterpret(MemorySegment addr2, long elementCount, Arena arena, Consumer<MemorySegment> cleanup) {
            return addr2.reinterpret(query.layout().byteSize() * elementCount, arena, cleanup);
        }
    }

    public static class raw_tracepoint {
        private static final GroupLayout $LAYOUT = MemoryLayout.structLayout((MemoryLayout[])new MemoryLayout[]{Lib.C_LONG_LONG.withName("name"), Lib.C_INT.withName("prog_fd"), MemoryLayout.paddingLayout((long)4L), Lib.C_LONG_LONG.withName("cookie")}).withName("$anon$1682:2");
        private static final ValueLayout.OfLong name$LAYOUT = (ValueLayout.OfLong)$LAYOUT.select(new MemoryLayout.PathElement[]{MemoryLayout.PathElement.groupElement((String)"name")});
        private static final long name$OFFSET = 0L;
        private static final ValueLayout.OfInt prog_fd$LAYOUT = (ValueLayout.OfInt)$LAYOUT.select(new MemoryLayout.PathElement[]{MemoryLayout.PathElement.groupElement((String)"prog_fd")});
        private static final long prog_fd$OFFSET = 8L;
        private static final ValueLayout.OfLong cookie$LAYOUT = (ValueLayout.OfLong)$LAYOUT.select(new MemoryLayout.PathElement[]{MemoryLayout.PathElement.groupElement((String)"cookie")});
        private static final long cookie$OFFSET = 16L;

        raw_tracepoint() {
        }

        public static final GroupLayout layout() {
            return $LAYOUT;
        }

        public static final ValueLayout.OfLong name$layout() {
            return name$LAYOUT;
        }

        public static final long name$offset() {
            return 0L;
        }

        public static long name(MemorySegment struct) {
            return struct.get(name$LAYOUT, 0L);
        }

        public static void name(MemorySegment struct, long fieldValue) {
            struct.set(name$LAYOUT, 0L, fieldValue);
        }

        public static final ValueLayout.OfInt prog_fd$layout() {
            return prog_fd$LAYOUT;
        }

        public static final long prog_fd$offset() {
            return 8L;
        }

        public static int prog_fd(MemorySegment struct) {
            return struct.get(prog_fd$LAYOUT, 8L);
        }

        public static void prog_fd(MemorySegment struct, int fieldValue) {
            struct.set(prog_fd$LAYOUT, 8L, fieldValue);
        }

        public static final ValueLayout.OfLong cookie$layout() {
            return cookie$LAYOUT;
        }

        public static final long cookie$offset() {
            return 16L;
        }

        public static long cookie(MemorySegment struct) {
            return struct.get(cookie$LAYOUT, 16L);
        }

        public static void cookie(MemorySegment struct, long fieldValue) {
            struct.set(cookie$LAYOUT, 16L, fieldValue);
        }

        public static MemorySegment asSlice(MemorySegment array, long index2) {
            return array.asSlice(raw_tracepoint.layout().byteSize() * index2);
        }

        public static long sizeof() {
            return raw_tracepoint.layout().byteSize();
        }

        public static MemorySegment allocate(SegmentAllocator allocator) {
            return allocator.allocate((MemoryLayout)raw_tracepoint.layout());
        }

        public static MemorySegment allocateArray(long elementCount, SegmentAllocator allocator) {
            return allocator.allocate((MemoryLayout)MemoryLayout.sequenceLayout((long)elementCount, (MemoryLayout)raw_tracepoint.layout()));
        }

        public static MemorySegment reinterpret(MemorySegment addr2, Arena arena, Consumer<MemorySegment> cleanup) {
            return raw_tracepoint.reinterpret(addr2, 1L, arena, cleanup);
        }

        public static MemorySegment reinterpret(MemorySegment addr2, long elementCount, Arena arena, Consumer<MemorySegment> cleanup) {
            return addr2.reinterpret(raw_tracepoint.layout().byteSize() * elementCount, arena, cleanup);
        }
    }

    public static class task_fd_query {
        private static final GroupLayout $LAYOUT = MemoryLayout.structLayout((MemoryLayout[])new MemoryLayout[]{Lib.C_INT.withName("pid"), Lib.C_INT.withName("fd"), Lib.C_INT.withName("flags"), Lib.C_INT.withName("buf_len"), Lib.C_LONG_LONG.withName("buf"), Lib.C_INT.withName("prog_id"), Lib.C_INT.withName("fd_type"), Lib.C_LONG_LONG.withName("probe_offset"), Lib.C_LONG_LONG.withName("probe_addr")}).withName("$anon$1707:2");
        private static final ValueLayout.OfInt pid$LAYOUT = (ValueLayout.OfInt)$LAYOUT.select(new MemoryLayout.PathElement[]{MemoryLayout.PathElement.groupElement((String)"pid")});
        private static final long pid$OFFSET = 0L;
        private static final ValueLayout.OfInt fd$LAYOUT = (ValueLayout.OfInt)$LAYOUT.select(new MemoryLayout.PathElement[]{MemoryLayout.PathElement.groupElement((String)"fd")});
        private static final long fd$OFFSET = 4L;
        private static final ValueLayout.OfInt flags$LAYOUT = (ValueLayout.OfInt)$LAYOUT.select(new MemoryLayout.PathElement[]{MemoryLayout.PathElement.groupElement((String)"flags")});
        private static final long flags$OFFSET = 8L;
        private static final ValueLayout.OfInt buf_len$LAYOUT = (ValueLayout.OfInt)$LAYOUT.select(new MemoryLayout.PathElement[]{MemoryLayout.PathElement.groupElement((String)"buf_len")});
        private static final long buf_len$OFFSET = 12L;
        private static final ValueLayout.OfLong buf$LAYOUT = (ValueLayout.OfLong)$LAYOUT.select(new MemoryLayout.PathElement[]{MemoryLayout.PathElement.groupElement((String)"buf")});
        private static final long buf$OFFSET = 16L;
        private static final ValueLayout.OfInt prog_id$LAYOUT = (ValueLayout.OfInt)$LAYOUT.select(new MemoryLayout.PathElement[]{MemoryLayout.PathElement.groupElement((String)"prog_id")});
        private static final long prog_id$OFFSET = 24L;
        private static final ValueLayout.OfInt fd_type$LAYOUT = (ValueLayout.OfInt)$LAYOUT.select(new MemoryLayout.PathElement[]{MemoryLayout.PathElement.groupElement((String)"fd_type")});
        private static final long fd_type$OFFSET = 28L;
        private static final ValueLayout.OfLong probe_offset$LAYOUT = (ValueLayout.OfLong)$LAYOUT.select(new MemoryLayout.PathElement[]{MemoryLayout.PathElement.groupElement((String)"probe_offset")});
        private static final long probe_offset$OFFSET = 32L;
        private static final ValueLayout.OfLong probe_addr$LAYOUT = (ValueLayout.OfLong)$LAYOUT.select(new MemoryLayout.PathElement[]{MemoryLayout.PathElement.groupElement((String)"probe_addr")});
        private static final long probe_addr$OFFSET = 40L;

        task_fd_query() {
        }

        public static final GroupLayout layout() {
            return $LAYOUT;
        }

        public static final ValueLayout.OfInt pid$layout() {
            return pid$LAYOUT;
        }

        public static final long pid$offset() {
            return 0L;
        }

        public static int pid(MemorySegment struct) {
            return struct.get(pid$LAYOUT, 0L);
        }

        public static void pid(MemorySegment struct, int fieldValue) {
            struct.set(pid$LAYOUT, 0L, fieldValue);
        }

        public static final ValueLayout.OfInt fd$layout() {
            return fd$LAYOUT;
        }

        public static final long fd$offset() {
            return 4L;
        }

        public static int fd(MemorySegment struct) {
            return struct.get(fd$LAYOUT, 4L);
        }

        public static void fd(MemorySegment struct, int fieldValue) {
            struct.set(fd$LAYOUT, 4L, fieldValue);
        }

        public static final ValueLayout.OfInt flags$layout() {
            return flags$LAYOUT;
        }

        public static final long flags$offset() {
            return 8L;
        }

        public static int flags(MemorySegment struct) {
            return struct.get(flags$LAYOUT, 8L);
        }

        public static void flags(MemorySegment struct, int fieldValue) {
            struct.set(flags$LAYOUT, 8L, fieldValue);
        }

        public static final ValueLayout.OfInt buf_len$layout() {
            return buf_len$LAYOUT;
        }

        public static final long buf_len$offset() {
            return 12L;
        }

        public static int buf_len(MemorySegment struct) {
            return struct.get(buf_len$LAYOUT, 12L);
        }

        public static void buf_len(MemorySegment struct, int fieldValue) {
            struct.set(buf_len$LAYOUT, 12L, fieldValue);
        }

        public static final ValueLayout.OfLong buf$layout() {
            return buf$LAYOUT;
        }

        public static final long buf$offset() {
            return 16L;
        }

        public static long buf(MemorySegment struct) {
            return struct.get(buf$LAYOUT, 16L);
        }

        public static void buf(MemorySegment struct, long fieldValue) {
            struct.set(buf$LAYOUT, 16L, fieldValue);
        }

        public static final ValueLayout.OfInt prog_id$layout() {
            return prog_id$LAYOUT;
        }

        public static final long prog_id$offset() {
            return 24L;
        }

        public static int prog_id(MemorySegment struct) {
            return struct.get(prog_id$LAYOUT, 24L);
        }

        public static void prog_id(MemorySegment struct, int fieldValue) {
            struct.set(prog_id$LAYOUT, 24L, fieldValue);
        }

        public static final ValueLayout.OfInt fd_type$layout() {
            return fd_type$LAYOUT;
        }

        public static final long fd_type$offset() {
            return 28L;
        }

        public static int fd_type(MemorySegment struct) {
            return struct.get(fd_type$LAYOUT, 28L);
        }

        public static void fd_type(MemorySegment struct, int fieldValue) {
            struct.set(fd_type$LAYOUT, 28L, fieldValue);
        }

        public static final ValueLayout.OfLong probe_offset$layout() {
            return probe_offset$LAYOUT;
        }

        public static final long probe_offset$offset() {
            return 32L;
        }

        public static long probe_offset(MemorySegment struct) {
            return struct.get(probe_offset$LAYOUT, 32L);
        }

        public static void probe_offset(MemorySegment struct, long fieldValue) {
            struct.set(probe_offset$LAYOUT, 32L, fieldValue);
        }

        public static final ValueLayout.OfLong probe_addr$layout() {
            return probe_addr$LAYOUT;
        }

        public static final long probe_addr$offset() {
            return 40L;
        }

        public static long probe_addr(MemorySegment struct) {
            return struct.get(probe_addr$LAYOUT, 40L);
        }

        public static void probe_addr(MemorySegment struct, long fieldValue) {
            struct.set(probe_addr$LAYOUT, 40L, fieldValue);
        }

        public static MemorySegment asSlice(MemorySegment array, long index2) {
            return array.asSlice(task_fd_query.layout().byteSize() * index2);
        }

        public static long sizeof() {
            return task_fd_query.layout().byteSize();
        }

        public static MemorySegment allocate(SegmentAllocator allocator) {
            return allocator.allocate((MemoryLayout)task_fd_query.layout());
        }

        public static MemorySegment allocateArray(long elementCount, SegmentAllocator allocator) {
            return allocator.allocate((MemoryLayout)MemoryLayout.sequenceLayout((long)elementCount, (MemoryLayout)task_fd_query.layout()));
        }

        public static MemorySegment reinterpret(MemorySegment addr2, Arena arena, Consumer<MemorySegment> cleanup) {
            return task_fd_query.reinterpret(addr2, 1L, arena, cleanup);
        }

        public static MemorySegment reinterpret(MemorySegment addr2, long elementCount, Arena arena, Consumer<MemorySegment> cleanup) {
            return addr2.reinterpret(task_fd_query.layout().byteSize() * elementCount, arena, cleanup);
        }
    }

    public static class link_create {
        private static final GroupLayout $LAYOUT = MemoryLayout.structLayout((MemoryLayout[])new MemoryLayout[]{MemoryLayout.unionLayout((MemoryLayout[])new MemoryLayout[]{Lib.C_INT.withName("prog_fd"), Lib.C_INT.withName("map_fd")}).withName("$anon$1724:3"), MemoryLayout.unionLayout((MemoryLayout[])new MemoryLayout[]{Lib.C_INT.withName("target_fd"), Lib.C_INT.withName("target_ifindex")}).withName("$anon$1728:3"), Lib.C_INT.withName("attach_type"), Lib.C_INT.withName("flags"), MemoryLayout.unionLayout((MemoryLayout[])new MemoryLayout[]{Lib.C_INT.withName("target_btf_id"), MemoryLayout.structLayout((MemoryLayout[])new MemoryLayout[]{Lib.C_LONG_LONG.withName("iter_info"), Lib.C_INT.withName("iter_info_len"), MemoryLayout.paddingLayout((long)4L)}).withName("$anon$1736:4"), perf_event.layout().withName("perf_event"), kprobe_multi.layout().withName("kprobe_multi"), tracing.layout().withName("tracing"), netfilter.layout().withName("netfilter"), tcx.layout().withName("tcx"), uprobe_multi.layout().withName("uprobe_multi"), netkit.layout().withName("netkit")}).withName("$anon$1734:3")}).withName("$anon$1723:2");
        private static final ValueLayout.OfInt prog_fd$LAYOUT = (ValueLayout.OfInt)$LAYOUT.select(new MemoryLayout.PathElement[]{MemoryLayout.PathElement.groupElement((String)"$anon$1724:3"), MemoryLayout.PathElement.groupElement((String)"prog_fd")});
        private static final long prog_fd$OFFSET = 0L;
        private static final ValueLayout.OfInt map_fd$LAYOUT = (ValueLayout.OfInt)$LAYOUT.select(new MemoryLayout.PathElement[]{MemoryLayout.PathElement.groupElement((String)"$anon$1724:3"), MemoryLayout.PathElement.groupElement((String)"map_fd")});
        private static final long map_fd$OFFSET = 0L;
        private static final ValueLayout.OfInt target_fd$LAYOUT = (ValueLayout.OfInt)$LAYOUT.select(new MemoryLayout.PathElement[]{MemoryLayout.PathElement.groupElement((String)"$anon$1728:3"), MemoryLayout.PathElement.groupElement((String)"target_fd")});
        private static final long target_fd$OFFSET = 4L;
        private static final ValueLayout.OfInt target_ifindex$LAYOUT = (ValueLayout.OfInt)$LAYOUT.select(new MemoryLayout.PathElement[]{MemoryLayout.PathElement.groupElement((String)"$anon$1728:3"), MemoryLayout.PathElement.groupElement((String)"target_ifindex")});
        private static final long target_ifindex$OFFSET = 4L;
        private static final ValueLayout.OfInt attach_type$LAYOUT = (ValueLayout.OfInt)$LAYOUT.select(new MemoryLayout.PathElement[]{MemoryLayout.PathElement.groupElement((String)"attach_type")});
        private static final long attach_type$OFFSET = 8L;
        private static final ValueLayout.OfInt flags$LAYOUT = (ValueLayout.OfInt)$LAYOUT.select(new MemoryLayout.PathElement[]{MemoryLayout.PathElement.groupElement((String)"flags")});
        private static final long flags$OFFSET = 12L;
        private static final ValueLayout.OfInt target_btf_id$LAYOUT = (ValueLayout.OfInt)$LAYOUT.select(new MemoryLayout.PathElement[]{MemoryLayout.PathElement.groupElement((String)"$anon$1734:3"), MemoryLayout.PathElement.groupElement((String)"target_btf_id")});
        private static final long target_btf_id$OFFSET = 16L;
        private static final ValueLayout.OfLong iter_info$LAYOUT = (ValueLayout.OfLong)$LAYOUT.select(new MemoryLayout.PathElement[]{MemoryLayout.PathElement.groupElement((String)"$anon$1734:3"), MemoryLayout.PathElement.groupElement((String)"$anon$1736:4"), MemoryLayout.PathElement.groupElement((String)"iter_info")});
        private static final long iter_info$OFFSET = 16L;
        private static final ValueLayout.OfInt iter_info_len$LAYOUT = (ValueLayout.OfInt)$LAYOUT.select(new MemoryLayout.PathElement[]{MemoryLayout.PathElement.groupElement((String)"$anon$1734:3"), MemoryLayout.PathElement.groupElement((String)"$anon$1736:4"), MemoryLayout.PathElement.groupElement((String)"iter_info_len")});
        private static final long iter_info_len$OFFSET = 24L;
        private static final GroupLayout perf_event$LAYOUT = (GroupLayout)$LAYOUT.select(new MemoryLayout.PathElement[]{MemoryLayout.PathElement.groupElement((String)"$anon$1734:3"), MemoryLayout.PathElement.groupElement((String)"perf_event")});
        private static final long perf_event$OFFSET = 16L;
        private static final GroupLayout kprobe_multi$LAYOUT = (GroupLayout)$LAYOUT.select(new MemoryLayout.PathElement[]{MemoryLayout.PathElement.groupElement((String)"$anon$1734:3"), MemoryLayout.PathElement.groupElement((String)"kprobe_multi")});
        private static final long kprobe_multi$OFFSET = 16L;
        private static final GroupLayout tracing$LAYOUT = (GroupLayout)$LAYOUT.select(new MemoryLayout.PathElement[]{MemoryLayout.PathElement.groupElement((String)"$anon$1734:3"), MemoryLayout.PathElement.groupElement((String)"tracing")});
        private static final long tracing$OFFSET = 16L;
        private static final GroupLayout netfilter$LAYOUT = (GroupLayout)$LAYOUT.select(new MemoryLayout.PathElement[]{MemoryLayout.PathElement.groupElement((String)"$anon$1734:3"), MemoryLayout.PathElement.groupElement((String)"netfilter")});
        private static final long netfilter$OFFSET = 16L;
        private static final GroupLayout tcx$LAYOUT = (GroupLayout)$LAYOUT.select(new MemoryLayout.PathElement[]{MemoryLayout.PathElement.groupElement((String)"$anon$1734:3"), MemoryLayout.PathElement.groupElement((String)"tcx")});
        private static final long tcx$OFFSET = 16L;
        private static final GroupLayout uprobe_multi$LAYOUT = (GroupLayout)$LAYOUT.select(new MemoryLayout.PathElement[]{MemoryLayout.PathElement.groupElement((String)"$anon$1734:3"), MemoryLayout.PathElement.groupElement((String)"uprobe_multi")});
        private static final long uprobe_multi$OFFSET = 16L;
        private static final GroupLayout netkit$LAYOUT = (GroupLayout)$LAYOUT.select(new MemoryLayout.PathElement[]{MemoryLayout.PathElement.groupElement((String)"$anon$1734:3"), MemoryLayout.PathElement.groupElement((String)"netkit")});
        private static final long netkit$OFFSET = 16L;

        link_create() {
        }

        public static final GroupLayout layout() {
            return $LAYOUT;
        }

        public static final ValueLayout.OfInt prog_fd$layout() {
            return prog_fd$LAYOUT;
        }

        public static final long prog_fd$offset() {
            return 0L;
        }

        public static int prog_fd(MemorySegment struct) {
            return struct.get(prog_fd$LAYOUT, 0L);
        }

        public static void prog_fd(MemorySegment struct, int fieldValue) {
            struct.set(prog_fd$LAYOUT, 0L, fieldValue);
        }

        public static final ValueLayout.OfInt map_fd$layout() {
            return map_fd$LAYOUT;
        }

        public static final long map_fd$offset() {
            return 0L;
        }

        public static int map_fd(MemorySegment struct) {
            return struct.get(map_fd$LAYOUT, 0L);
        }

        public static void map_fd(MemorySegment struct, int fieldValue) {
            struct.set(map_fd$LAYOUT, 0L, fieldValue);
        }

        public static final ValueLayout.OfInt target_fd$layout() {
            return target_fd$LAYOUT;
        }

        public static final long target_fd$offset() {
            return 4L;
        }

        public static int target_fd(MemorySegment struct) {
            return struct.get(target_fd$LAYOUT, 4L);
        }

        public static void target_fd(MemorySegment struct, int fieldValue) {
            struct.set(target_fd$LAYOUT, 4L, fieldValue);
        }

        public static final ValueLayout.OfInt target_ifindex$layout() {
            return target_ifindex$LAYOUT;
        }

        public static final long target_ifindex$offset() {
            return 4L;
        }

        public static int target_ifindex(MemorySegment struct) {
            return struct.get(target_ifindex$LAYOUT, 4L);
        }

        public static void target_ifindex(MemorySegment struct, int fieldValue) {
            struct.set(target_ifindex$LAYOUT, 4L, fieldValue);
        }

        public static final ValueLayout.OfInt attach_type$layout() {
            return attach_type$LAYOUT;
        }

        public static final long attach_type$offset() {
            return 8L;
        }

        public static int attach_type(MemorySegment struct) {
            return struct.get(attach_type$LAYOUT, 8L);
        }

        public static void attach_type(MemorySegment struct, int fieldValue) {
            struct.set(attach_type$LAYOUT, 8L, fieldValue);
        }

        public static final ValueLayout.OfInt flags$layout() {
            return flags$LAYOUT;
        }

        public static final long flags$offset() {
            return 12L;
        }

        public static int flags(MemorySegment struct) {
            return struct.get(flags$LAYOUT, 12L);
        }

        public static void flags(MemorySegment struct, int fieldValue) {
            struct.set(flags$LAYOUT, 12L, fieldValue);
        }

        public static final ValueLayout.OfInt target_btf_id$layout() {
            return target_btf_id$LAYOUT;
        }

        public static final long target_btf_id$offset() {
            return 16L;
        }

        public static int target_btf_id(MemorySegment struct) {
            return struct.get(target_btf_id$LAYOUT, 16L);
        }

        public static void target_btf_id(MemorySegment struct, int fieldValue) {
            struct.set(target_btf_id$LAYOUT, 16L, fieldValue);
        }

        public static final ValueLayout.OfLong iter_info$layout() {
            return iter_info$LAYOUT;
        }

        public static final long iter_info$offset() {
            return 16L;
        }

        public static long iter_info(MemorySegment struct) {
            return struct.get(iter_info$LAYOUT, 16L);
        }

        public static void iter_info(MemorySegment struct, long fieldValue) {
            struct.set(iter_info$LAYOUT, 16L, fieldValue);
        }

        public static final ValueLayout.OfInt iter_info_len$layout() {
            return iter_info_len$LAYOUT;
        }

        public static final long iter_info_len$offset() {
            return 24L;
        }

        public static int iter_info_len(MemorySegment struct) {
            return struct.get(iter_info_len$LAYOUT, 24L);
        }

        public static void iter_info_len(MemorySegment struct, int fieldValue) {
            struct.set(iter_info_len$LAYOUT, 24L, fieldValue);
        }

        public static final GroupLayout perf_event$layout() {
            return perf_event$LAYOUT;
        }

        public static final long perf_event$offset() {
            return 16L;
        }

        public static MemorySegment perf_event(MemorySegment struct) {
            return struct.asSlice(16L, perf_event$LAYOUT.byteSize());
        }

        public static void perf_event(MemorySegment struct, MemorySegment fieldValue) {
            MemorySegment.copy((MemorySegment)fieldValue, (long)0L, (MemorySegment)struct, (long)16L, (long)perf_event$LAYOUT.byteSize());
        }

        public static final GroupLayout kprobe_multi$layout() {
            return kprobe_multi$LAYOUT;
        }

        public static final long kprobe_multi$offset() {
            return 16L;
        }

        public static MemorySegment kprobe_multi(MemorySegment struct) {
            return struct.asSlice(16L, kprobe_multi$LAYOUT.byteSize());
        }

        public static void kprobe_multi(MemorySegment struct, MemorySegment fieldValue) {
            MemorySegment.copy((MemorySegment)fieldValue, (long)0L, (MemorySegment)struct, (long)16L, (long)kprobe_multi$LAYOUT.byteSize());
        }

        public static final GroupLayout tracing$layout() {
            return tracing$LAYOUT;
        }

        public static final long tracing$offset() {
            return 16L;
        }

        public static MemorySegment tracing(MemorySegment struct) {
            return struct.asSlice(16L, tracing$LAYOUT.byteSize());
        }

        public static void tracing(MemorySegment struct, MemorySegment fieldValue) {
            MemorySegment.copy((MemorySegment)fieldValue, (long)0L, (MemorySegment)struct, (long)16L, (long)tracing$LAYOUT.byteSize());
        }

        public static final GroupLayout netfilter$layout() {
            return netfilter$LAYOUT;
        }

        public static final long netfilter$offset() {
            return 16L;
        }

        public static MemorySegment netfilter(MemorySegment struct) {
            return struct.asSlice(16L, netfilter$LAYOUT.byteSize());
        }

        public static void netfilter(MemorySegment struct, MemorySegment fieldValue) {
            MemorySegment.copy((MemorySegment)fieldValue, (long)0L, (MemorySegment)struct, (long)16L, (long)netfilter$LAYOUT.byteSize());
        }

        public static final GroupLayout tcx$layout() {
            return tcx$LAYOUT;
        }

        public static final long tcx$offset() {
            return 16L;
        }

        public static MemorySegment tcx(MemorySegment struct) {
            return struct.asSlice(16L, tcx$LAYOUT.byteSize());
        }

        public static void tcx(MemorySegment struct, MemorySegment fieldValue) {
            MemorySegment.copy((MemorySegment)fieldValue, (long)0L, (MemorySegment)struct, (long)16L, (long)tcx$LAYOUT.byteSize());
        }

        public static final GroupLayout uprobe_multi$layout() {
            return uprobe_multi$LAYOUT;
        }

        public static final long uprobe_multi$offset() {
            return 16L;
        }

        public static MemorySegment uprobe_multi(MemorySegment struct) {
            return struct.asSlice(16L, uprobe_multi$LAYOUT.byteSize());
        }

        public static void uprobe_multi(MemorySegment struct, MemorySegment fieldValue) {
            MemorySegment.copy((MemorySegment)fieldValue, (long)0L, (MemorySegment)struct, (long)16L, (long)uprobe_multi$LAYOUT.byteSize());
        }

        public static final GroupLayout netkit$layout() {
            return netkit$LAYOUT;
        }

        public static final long netkit$offset() {
            return 16L;
        }

        public static MemorySegment netkit(MemorySegment struct) {
            return struct.asSlice(16L, netkit$LAYOUT.byteSize());
        }

        public static void netkit(MemorySegment struct, MemorySegment fieldValue) {
            MemorySegment.copy((MemorySegment)fieldValue, (long)0L, (MemorySegment)struct, (long)16L, (long)netkit$LAYOUT.byteSize());
        }

        public static MemorySegment asSlice(MemorySegment array, long index2) {
            return array.asSlice(link_create.layout().byteSize() * index2);
        }

        public static long sizeof() {
            return link_create.layout().byteSize();
        }

        public static MemorySegment allocate(SegmentAllocator allocator) {
            return allocator.allocate((MemoryLayout)link_create.layout());
        }

        public static MemorySegment allocateArray(long elementCount, SegmentAllocator allocator) {
            return allocator.allocate((MemoryLayout)MemoryLayout.sequenceLayout((long)elementCount, (MemoryLayout)link_create.layout()));
        }

        public static MemorySegment reinterpret(MemorySegment addr2, Arena arena, Consumer<MemorySegment> cleanup) {
            return link_create.reinterpret(addr2, 1L, arena, cleanup);
        }

        public static MemorySegment reinterpret(MemorySegment addr2, long elementCount, Arena arena, Consumer<MemorySegment> cleanup) {
            return addr2.reinterpret(link_create.layout().byteSize() * elementCount, arena, cleanup);
        }

        public static class perf_event {
            private static final GroupLayout $LAYOUT = MemoryLayout.structLayout((MemoryLayout[])new MemoryLayout[]{Lib.C_LONG_LONG.withName("bpf_cookie")}).withName("$anon$1740:4");
            private static final ValueLayout.OfLong bpf_cookie$LAYOUT = (ValueLayout.OfLong)$LAYOUT.select(new MemoryLayout.PathElement[]{MemoryLayout.PathElement.groupElement((String)"bpf_cookie")});
            private static final long bpf_cookie$OFFSET = 0L;

            perf_event() {
            }

            public static final GroupLayout layout() {
                return $LAYOUT;
            }

            public static final ValueLayout.OfLong bpf_cookie$layout() {
                return bpf_cookie$LAYOUT;
            }

            public static final long bpf_cookie$offset() {
                return 0L;
            }

            public static long bpf_cookie(MemorySegment struct) {
                return struct.get(bpf_cookie$LAYOUT, 0L);
            }

            public static void bpf_cookie(MemorySegment struct, long fieldValue) {
                struct.set(bpf_cookie$LAYOUT, 0L, fieldValue);
            }

            public static MemorySegment asSlice(MemorySegment array, long index2) {
                return array.asSlice(perf_event.layout().byteSize() * index2);
            }

            public static long sizeof() {
                return perf_event.layout().byteSize();
            }

            public static MemorySegment allocate(SegmentAllocator allocator) {
                return allocator.allocate((MemoryLayout)perf_event.layout());
            }

            public static MemorySegment allocateArray(long elementCount, SegmentAllocator allocator) {
                return allocator.allocate((MemoryLayout)MemoryLayout.sequenceLayout((long)elementCount, (MemoryLayout)perf_event.layout()));
            }

            public static MemorySegment reinterpret(MemorySegment addr2, Arena arena, Consumer<MemorySegment> cleanup) {
                return perf_event.reinterpret(addr2, 1L, arena, cleanup);
            }

            public static MemorySegment reinterpret(MemorySegment addr2, long elementCount, Arena arena, Consumer<MemorySegment> cleanup) {
                return addr2.reinterpret(perf_event.layout().byteSize() * elementCount, arena, cleanup);
            }
        }

        public static class kprobe_multi {
            private static final GroupLayout $LAYOUT = MemoryLayout.structLayout((MemoryLayout[])new MemoryLayout[]{Lib.C_INT.withName("flags"), Lib.C_INT.withName("cnt"), Lib.C_LONG_LONG.withName("syms"), Lib.C_LONG_LONG.withName("addrs"), Lib.C_LONG_LONG.withName("cookies")}).withName("$anon$1747:4");
            private static final ValueLayout.OfInt flags$LAYOUT = (ValueLayout.OfInt)$LAYOUT.select(new MemoryLayout.PathElement[]{MemoryLayout.PathElement.groupElement((String)"flags")});
            private static final long flags$OFFSET = 0L;
            private static final ValueLayout.OfInt cnt$LAYOUT = (ValueLayout.OfInt)$LAYOUT.select(new MemoryLayout.PathElement[]{MemoryLayout.PathElement.groupElement((String)"cnt")});
            private static final long cnt$OFFSET = 4L;
            private static final ValueLayout.OfLong syms$LAYOUT = (ValueLayout.OfLong)$LAYOUT.select(new MemoryLayout.PathElement[]{MemoryLayout.PathElement.groupElement((String)"syms")});
            private static final long syms$OFFSET = 8L;
            private static final ValueLayout.OfLong addrs$LAYOUT = (ValueLayout.OfLong)$LAYOUT.select(new MemoryLayout.PathElement[]{MemoryLayout.PathElement.groupElement((String)"addrs")});
            private static final long addrs$OFFSET = 16L;
            private static final ValueLayout.OfLong cookies$LAYOUT = (ValueLayout.OfLong)$LAYOUT.select(new MemoryLayout.PathElement[]{MemoryLayout.PathElement.groupElement((String)"cookies")});
            private static final long cookies$OFFSET = 24L;

            kprobe_multi() {
            }

            public static final GroupLayout layout() {
                return $LAYOUT;
            }

            public static final ValueLayout.OfInt flags$layout() {
                return flags$LAYOUT;
            }

            public static final long flags$offset() {
                return 0L;
            }

            public static int flags(MemorySegment struct) {
                return struct.get(flags$LAYOUT, 0L);
            }

            public static void flags(MemorySegment struct, int fieldValue) {
                struct.set(flags$LAYOUT, 0L, fieldValue);
            }

            public static final ValueLayout.OfInt cnt$layout() {
                return cnt$LAYOUT;
            }

            public static final long cnt$offset() {
                return 4L;
            }

            public static int cnt(MemorySegment struct) {
                return struct.get(cnt$LAYOUT, 4L);
            }

            public static void cnt(MemorySegment struct, int fieldValue) {
                struct.set(cnt$LAYOUT, 4L, fieldValue);
            }

            public static final ValueLayout.OfLong syms$layout() {
                return syms$LAYOUT;
            }

            public static final long syms$offset() {
                return 8L;
            }

            public static long syms(MemorySegment struct) {
                return struct.get(syms$LAYOUT, 8L);
            }

            public static void syms(MemorySegment struct, long fieldValue) {
                struct.set(syms$LAYOUT, 8L, fieldValue);
            }

            public static final ValueLayout.OfLong addrs$layout() {
                return addrs$LAYOUT;
            }

            public static final long addrs$offset() {
                return 16L;
            }

            public static long addrs(MemorySegment struct) {
                return struct.get(addrs$LAYOUT, 16L);
            }

            public static void addrs(MemorySegment struct, long fieldValue) {
                struct.set(addrs$LAYOUT, 16L, fieldValue);
            }

            public static final ValueLayout.OfLong cookies$layout() {
                return cookies$LAYOUT;
            }

            public static final long cookies$offset() {
                return 24L;
            }

            public static long cookies(MemorySegment struct) {
                return struct.get(cookies$LAYOUT, 24L);
            }

            public static void cookies(MemorySegment struct, long fieldValue) {
                struct.set(cookies$LAYOUT, 24L, fieldValue);
            }

            public static MemorySegment asSlice(MemorySegment array, long index2) {
                return array.asSlice(kprobe_multi.layout().byteSize() * index2);
            }

            public static long sizeof() {
                return kprobe_multi.layout().byteSize();
            }

            public static MemorySegment allocate(SegmentAllocator allocator) {
                return allocator.allocate((MemoryLayout)kprobe_multi.layout());
            }

            public static MemorySegment allocateArray(long elementCount, SegmentAllocator allocator) {
                return allocator.allocate((MemoryLayout)MemoryLayout.sequenceLayout((long)elementCount, (MemoryLayout)kprobe_multi.layout()));
            }

            public static MemorySegment reinterpret(MemorySegment addr2, Arena arena, Consumer<MemorySegment> cleanup) {
                return kprobe_multi.reinterpret(addr2, 1L, arena, cleanup);
            }

            public static MemorySegment reinterpret(MemorySegment addr2, long elementCount, Arena arena, Consumer<MemorySegment> cleanup) {
                return addr2.reinterpret(kprobe_multi.layout().byteSize() * elementCount, arena, cleanup);
            }
        }

        public static class tracing {
            private static final GroupLayout $LAYOUT = MemoryLayout.structLayout((MemoryLayout[])new MemoryLayout[]{Lib.C_INT.withName("target_btf_id"), MemoryLayout.paddingLayout((long)4L), Lib.C_LONG_LONG.withName("cookie")}).withName("$anon$1754:4");
            private static final ValueLayout.OfInt target_btf_id$LAYOUT = (ValueLayout.OfInt)$LAYOUT.select(new MemoryLayout.PathElement[]{MemoryLayout.PathElement.groupElement((String)"target_btf_id")});
            private static final long target_btf_id$OFFSET = 0L;
            private static final ValueLayout.OfLong cookie$LAYOUT = (ValueLayout.OfLong)$LAYOUT.select(new MemoryLayout.PathElement[]{MemoryLayout.PathElement.groupElement((String)"cookie")});
            private static final long cookie$OFFSET = 8L;

            tracing() {
            }

            public static final GroupLayout layout() {
                return $LAYOUT;
            }

            public static final ValueLayout.OfInt target_btf_id$layout() {
                return target_btf_id$LAYOUT;
            }

            public static final long target_btf_id$offset() {
                return 0L;
            }

            public static int target_btf_id(MemorySegment struct) {
                return struct.get(target_btf_id$LAYOUT, 0L);
            }

            public static void target_btf_id(MemorySegment struct, int fieldValue) {
                struct.set(target_btf_id$LAYOUT, 0L, fieldValue);
            }

            public static final ValueLayout.OfLong cookie$layout() {
                return cookie$LAYOUT;
            }

            public static final long cookie$offset() {
                return 8L;
            }

            public static long cookie(MemorySegment struct) {
                return struct.get(cookie$LAYOUT, 8L);
            }

            public static void cookie(MemorySegment struct, long fieldValue) {
                struct.set(cookie$LAYOUT, 8L, fieldValue);
            }

            public static MemorySegment asSlice(MemorySegment array, long index2) {
                return array.asSlice(tracing.layout().byteSize() * index2);
            }

            public static long sizeof() {
                return tracing.layout().byteSize();
            }

            public static MemorySegment allocate(SegmentAllocator allocator) {
                return allocator.allocate((MemoryLayout)tracing.layout());
            }

            public static MemorySegment allocateArray(long elementCount, SegmentAllocator allocator) {
                return allocator.allocate((MemoryLayout)MemoryLayout.sequenceLayout((long)elementCount, (MemoryLayout)tracing.layout()));
            }

            public static MemorySegment reinterpret(MemorySegment addr2, Arena arena, Consumer<MemorySegment> cleanup) {
                return tracing.reinterpret(addr2, 1L, arena, cleanup);
            }

            public static MemorySegment reinterpret(MemorySegment addr2, long elementCount, Arena arena, Consumer<MemorySegment> cleanup) {
                return addr2.reinterpret(tracing.layout().byteSize() * elementCount, arena, cleanup);
            }
        }

        public static class netfilter {
            private static final GroupLayout $LAYOUT = MemoryLayout.structLayout((MemoryLayout[])new MemoryLayout[]{Lib.C_INT.withName("pf"), Lib.C_INT.withName("hooknum"), Lib.C_INT.withName("priority"), Lib.C_INT.withName("flags")}).withName("$anon$1763:4");
            private static final ValueLayout.OfInt pf$LAYOUT = (ValueLayout.OfInt)$LAYOUT.select(new MemoryLayout.PathElement[]{MemoryLayout.PathElement.groupElement((String)"pf")});
            private static final long pf$OFFSET = 0L;
            private static final ValueLayout.OfInt hooknum$LAYOUT = (ValueLayout.OfInt)$LAYOUT.select(new MemoryLayout.PathElement[]{MemoryLayout.PathElement.groupElement((String)"hooknum")});
            private static final long hooknum$OFFSET = 4L;
            private static final ValueLayout.OfInt priority$LAYOUT = (ValueLayout.OfInt)$LAYOUT.select(new MemoryLayout.PathElement[]{MemoryLayout.PathElement.groupElement((String)"priority")});
            private static final long priority$OFFSET = 8L;
            private static final ValueLayout.OfInt flags$LAYOUT = (ValueLayout.OfInt)$LAYOUT.select(new MemoryLayout.PathElement[]{MemoryLayout.PathElement.groupElement((String)"flags")});
            private static final long flags$OFFSET = 12L;

            netfilter() {
            }

            public static final GroupLayout layout() {
                return $LAYOUT;
            }

            public static final ValueLayout.OfInt pf$layout() {
                return pf$LAYOUT;
            }

            public static final long pf$offset() {
                return 0L;
            }

            public static int pf(MemorySegment struct) {
                return struct.get(pf$LAYOUT, 0L);
            }

            public static void pf(MemorySegment struct, int fieldValue) {
                struct.set(pf$LAYOUT, 0L, fieldValue);
            }

            public static final ValueLayout.OfInt hooknum$layout() {
                return hooknum$LAYOUT;
            }

            public static final long hooknum$offset() {
                return 4L;
            }

            public static int hooknum(MemorySegment struct) {
                return struct.get(hooknum$LAYOUT, 4L);
            }

            public static void hooknum(MemorySegment struct, int fieldValue) {
                struct.set(hooknum$LAYOUT, 4L, fieldValue);
            }

            public static final ValueLayout.OfInt priority$layout() {
                return priority$LAYOUT;
            }

            public static final long priority$offset() {
                return 8L;
            }

            public static int priority(MemorySegment struct) {
                return struct.get(priority$LAYOUT, 8L);
            }

            public static void priority(MemorySegment struct, int fieldValue) {
                struct.set(priority$LAYOUT, 8L, fieldValue);
            }

            public static final ValueLayout.OfInt flags$layout() {
                return flags$LAYOUT;
            }

            public static final long flags$offset() {
                return 12L;
            }

            public static int flags(MemorySegment struct) {
                return struct.get(flags$LAYOUT, 12L);
            }

            public static void flags(MemorySegment struct, int fieldValue) {
                struct.set(flags$LAYOUT, 12L, fieldValue);
            }

            public static MemorySegment asSlice(MemorySegment array, long index2) {
                return array.asSlice(netfilter.layout().byteSize() * index2);
            }

            public static long sizeof() {
                return netfilter.layout().byteSize();
            }

            public static MemorySegment allocate(SegmentAllocator allocator) {
                return allocator.allocate((MemoryLayout)netfilter.layout());
            }

            public static MemorySegment allocateArray(long elementCount, SegmentAllocator allocator) {
                return allocator.allocate((MemoryLayout)MemoryLayout.sequenceLayout((long)elementCount, (MemoryLayout)netfilter.layout()));
            }

            public static MemorySegment reinterpret(MemorySegment addr2, Arena arena, Consumer<MemorySegment> cleanup) {
                return netfilter.reinterpret(addr2, 1L, arena, cleanup);
            }

            public static MemorySegment reinterpret(MemorySegment addr2, long elementCount, Arena arena, Consumer<MemorySegment> cleanup) {
                return addr2.reinterpret(netfilter.layout().byteSize() * elementCount, arena, cleanup);
            }
        }

        public static class tcx {
            private static final GroupLayout $LAYOUT = MemoryLayout.structLayout((MemoryLayout[])new MemoryLayout[]{MemoryLayout.unionLayout((MemoryLayout[])new MemoryLayout[]{Lib.C_INT.withName("relative_fd"), Lib.C_INT.withName("relative_id")}).withName("$anon$1770:5"), MemoryLayout.paddingLayout((long)4L), Lib.C_LONG_LONG.withName("expected_revision")}).withName("$anon$1769:4");
            private static final ValueLayout.OfInt relative_fd$LAYOUT = (ValueLayout.OfInt)$LAYOUT.select(new MemoryLayout.PathElement[]{MemoryLayout.PathElement.groupElement((String)"$anon$1770:5"), MemoryLayout.PathElement.groupElement((String)"relative_fd")});
            private static final long relative_fd$OFFSET = 0L;
            private static final ValueLayout.OfInt relative_id$LAYOUT = (ValueLayout.OfInt)$LAYOUT.select(new MemoryLayout.PathElement[]{MemoryLayout.PathElement.groupElement((String)"$anon$1770:5"), MemoryLayout.PathElement.groupElement((String)"relative_id")});
            private static final long relative_id$OFFSET = 0L;
            private static final ValueLayout.OfLong expected_revision$LAYOUT = (ValueLayout.OfLong)$LAYOUT.select(new MemoryLayout.PathElement[]{MemoryLayout.PathElement.groupElement((String)"expected_revision")});
            private static final long expected_revision$OFFSET = 8L;

            tcx() {
            }

            public static final GroupLayout layout() {
                return $LAYOUT;
            }

            public static final ValueLayout.OfInt relative_fd$layout() {
                return relative_fd$LAYOUT;
            }

            public static final long relative_fd$offset() {
                return 0L;
            }

            public static int relative_fd(MemorySegment struct) {
                return struct.get(relative_fd$LAYOUT, 0L);
            }

            public static void relative_fd(MemorySegment struct, int fieldValue) {
                struct.set(relative_fd$LAYOUT, 0L, fieldValue);
            }

            public static final ValueLayout.OfInt relative_id$layout() {
                return relative_id$LAYOUT;
            }

            public static final long relative_id$offset() {
                return 0L;
            }

            public static int relative_id(MemorySegment struct) {
                return struct.get(relative_id$LAYOUT, 0L);
            }

            public static void relative_id(MemorySegment struct, int fieldValue) {
                struct.set(relative_id$LAYOUT, 0L, fieldValue);
            }

            public static final ValueLayout.OfLong expected_revision$layout() {
                return expected_revision$LAYOUT;
            }

            public static final long expected_revision$offset() {
                return 8L;
            }

            public static long expected_revision(MemorySegment struct) {
                return struct.get(expected_revision$LAYOUT, 8L);
            }

            public static void expected_revision(MemorySegment struct, long fieldValue) {
                struct.set(expected_revision$LAYOUT, 8L, fieldValue);
            }

            public static MemorySegment asSlice(MemorySegment array, long index2) {
                return array.asSlice(tcx.layout().byteSize() * index2);
            }

            public static long sizeof() {
                return tcx.layout().byteSize();
            }

            public static MemorySegment allocate(SegmentAllocator allocator) {
                return allocator.allocate((MemoryLayout)tcx.layout());
            }

            public static MemorySegment allocateArray(long elementCount, SegmentAllocator allocator) {
                return allocator.allocate((MemoryLayout)MemoryLayout.sequenceLayout((long)elementCount, (MemoryLayout)tcx.layout()));
            }

            public static MemorySegment reinterpret(MemorySegment addr2, Arena arena, Consumer<MemorySegment> cleanup) {
                return tcx.reinterpret(addr2, 1L, arena, cleanup);
            }

            public static MemorySegment reinterpret(MemorySegment addr2, long elementCount, Arena arena, Consumer<MemorySegment> cleanup) {
                return addr2.reinterpret(tcx.layout().byteSize() * elementCount, arena, cleanup);
            }
        }

        public static class uprobe_multi {
            private static final GroupLayout $LAYOUT = MemoryLayout.structLayout((MemoryLayout[])new MemoryLayout[]{Lib.C_LONG_LONG.withName("path"), Lib.C_LONG_LONG.withName("offsets"), Lib.C_LONG_LONG.withName("ref_ctr_offsets"), Lib.C_LONG_LONG.withName("cookies"), Lib.C_INT.withName("cnt"), Lib.C_INT.withName("flags"), Lib.C_INT.withName("pid"), MemoryLayout.paddingLayout((long)4L)}).withName("$anon$1776:4");
            private static final ValueLayout.OfLong path$LAYOUT = (ValueLayout.OfLong)$LAYOUT.select(new MemoryLayout.PathElement[]{MemoryLayout.PathElement.groupElement((String)"path")});
            private static final long path$OFFSET = 0L;
            private static final ValueLayout.OfLong offsets$LAYOUT = (ValueLayout.OfLong)$LAYOUT.select(new MemoryLayout.PathElement[]{MemoryLayout.PathElement.groupElement((String)"offsets")});
            private static final long offsets$OFFSET = 8L;
            private static final ValueLayout.OfLong ref_ctr_offsets$LAYOUT = (ValueLayout.OfLong)$LAYOUT.select(new MemoryLayout.PathElement[]{MemoryLayout.PathElement.groupElement((String)"ref_ctr_offsets")});
            private static final long ref_ctr_offsets$OFFSET = 16L;
            private static final ValueLayout.OfLong cookies$LAYOUT = (ValueLayout.OfLong)$LAYOUT.select(new MemoryLayout.PathElement[]{MemoryLayout.PathElement.groupElement((String)"cookies")});
            private static final long cookies$OFFSET = 24L;
            private static final ValueLayout.OfInt cnt$LAYOUT = (ValueLayout.OfInt)$LAYOUT.select(new MemoryLayout.PathElement[]{MemoryLayout.PathElement.groupElement((String)"cnt")});
            private static final long cnt$OFFSET = 32L;
            private static final ValueLayout.OfInt flags$LAYOUT = (ValueLayout.OfInt)$LAYOUT.select(new MemoryLayout.PathElement[]{MemoryLayout.PathElement.groupElement((String)"flags")});
            private static final long flags$OFFSET = 36L;
            private static final ValueLayout.OfInt pid$LAYOUT = (ValueLayout.OfInt)$LAYOUT.select(new MemoryLayout.PathElement[]{MemoryLayout.PathElement.groupElement((String)"pid")});
            private static final long pid$OFFSET = 40L;

            uprobe_multi() {
            }

            public static final GroupLayout layout() {
                return $LAYOUT;
            }

            public static final ValueLayout.OfLong path$layout() {
                return path$LAYOUT;
            }

            public static final long path$offset() {
                return 0L;
            }

            public static long path(MemorySegment struct) {
                return struct.get(path$LAYOUT, 0L);
            }

            public static void path(MemorySegment struct, long fieldValue) {
                struct.set(path$LAYOUT, 0L, fieldValue);
            }

            public static final ValueLayout.OfLong offsets$layout() {
                return offsets$LAYOUT;
            }

            public static final long offsets$offset() {
                return 8L;
            }

            public static long offsets(MemorySegment struct) {
                return struct.get(offsets$LAYOUT, 8L);
            }

            public static void offsets(MemorySegment struct, long fieldValue) {
                struct.set(offsets$LAYOUT, 8L, fieldValue);
            }

            public static final ValueLayout.OfLong ref_ctr_offsets$layout() {
                return ref_ctr_offsets$LAYOUT;
            }

            public static final long ref_ctr_offsets$offset() {
                return 16L;
            }

            public static long ref_ctr_offsets(MemorySegment struct) {
                return struct.get(ref_ctr_offsets$LAYOUT, 16L);
            }

            public static void ref_ctr_offsets(MemorySegment struct, long fieldValue) {
                struct.set(ref_ctr_offsets$LAYOUT, 16L, fieldValue);
            }

            public static final ValueLayout.OfLong cookies$layout() {
                return cookies$LAYOUT;
            }

            public static final long cookies$offset() {
                return 24L;
            }

            public static long cookies(MemorySegment struct) {
                return struct.get(cookies$LAYOUT, 24L);
            }

            public static void cookies(MemorySegment struct, long fieldValue) {
                struct.set(cookies$LAYOUT, 24L, fieldValue);
            }

            public static final ValueLayout.OfInt cnt$layout() {
                return cnt$LAYOUT;
            }

            public static final long cnt$offset() {
                return 32L;
            }

            public static int cnt(MemorySegment struct) {
                return struct.get(cnt$LAYOUT, 32L);
            }

            public static void cnt(MemorySegment struct, int fieldValue) {
                struct.set(cnt$LAYOUT, 32L, fieldValue);
            }

            public static final ValueLayout.OfInt flags$layout() {
                return flags$LAYOUT;
            }

            public static final long flags$offset() {
                return 36L;
            }

            public static int flags(MemorySegment struct) {
                return struct.get(flags$LAYOUT, 36L);
            }

            public static void flags(MemorySegment struct, int fieldValue) {
                struct.set(flags$LAYOUT, 36L, fieldValue);
            }

            public static final ValueLayout.OfInt pid$layout() {
                return pid$LAYOUT;
            }

            public static final long pid$offset() {
                return 40L;
            }

            public static int pid(MemorySegment struct) {
                return struct.get(pid$LAYOUT, 40L);
            }

            public static void pid(MemorySegment struct, int fieldValue) {
                struct.set(pid$LAYOUT, 40L, fieldValue);
            }

            public static MemorySegment asSlice(MemorySegment array, long index2) {
                return array.asSlice(uprobe_multi.layout().byteSize() * index2);
            }

            public static long sizeof() {
                return uprobe_multi.layout().byteSize();
            }

            public static MemorySegment allocate(SegmentAllocator allocator) {
                return allocator.allocate((MemoryLayout)uprobe_multi.layout());
            }

            public static MemorySegment allocateArray(long elementCount, SegmentAllocator allocator) {
                return allocator.allocate((MemoryLayout)MemoryLayout.sequenceLayout((long)elementCount, (MemoryLayout)uprobe_multi.layout()));
            }

            public static MemorySegment reinterpret(MemorySegment addr2, Arena arena, Consumer<MemorySegment> cleanup) {
                return uprobe_multi.reinterpret(addr2, 1L, arena, cleanup);
            }

            public static MemorySegment reinterpret(MemorySegment addr2, long elementCount, Arena arena, Consumer<MemorySegment> cleanup) {
                return addr2.reinterpret(uprobe_multi.layout().byteSize() * elementCount, arena, cleanup);
            }
        }

        public static class netkit {
            private static final GroupLayout $LAYOUT = MemoryLayout.structLayout((MemoryLayout[])new MemoryLayout[]{MemoryLayout.unionLayout((MemoryLayout[])new MemoryLayout[]{Lib.C_INT.withName("relative_fd"), Lib.C_INT.withName("relative_id")}).withName("$anon$1786:5"), MemoryLayout.paddingLayout((long)4L), Lib.C_LONG_LONG.withName("expected_revision")}).withName("$anon$1785:4");
            private static final ValueLayout.OfInt relative_fd$LAYOUT = (ValueLayout.OfInt)$LAYOUT.select(new MemoryLayout.PathElement[]{MemoryLayout.PathElement.groupElement((String)"$anon$1786:5"), MemoryLayout.PathElement.groupElement((String)"relative_fd")});
            private static final long relative_fd$OFFSET = 0L;
            private static final ValueLayout.OfInt relative_id$LAYOUT = (ValueLayout.OfInt)$LAYOUT.select(new MemoryLayout.PathElement[]{MemoryLayout.PathElement.groupElement((String)"$anon$1786:5"), MemoryLayout.PathElement.groupElement((String)"relative_id")});
            private static final long relative_id$OFFSET = 0L;
            private static final ValueLayout.OfLong expected_revision$LAYOUT = (ValueLayout.OfLong)$LAYOUT.select(new MemoryLayout.PathElement[]{MemoryLayout.PathElement.groupElement((String)"expected_revision")});
            private static final long expected_revision$OFFSET = 8L;

            netkit() {
            }

            public static final GroupLayout layout() {
                return $LAYOUT;
            }

            public static final ValueLayout.OfInt relative_fd$layout() {
                return relative_fd$LAYOUT;
            }

            public static final long relative_fd$offset() {
                return 0L;
            }

            public static int relative_fd(MemorySegment struct) {
                return struct.get(relative_fd$LAYOUT, 0L);
            }

            public static void relative_fd(MemorySegment struct, int fieldValue) {
                struct.set(relative_fd$LAYOUT, 0L, fieldValue);
            }

            public static final ValueLayout.OfInt relative_id$layout() {
                return relative_id$LAYOUT;
            }

            public static final long relative_id$offset() {
                return 0L;
            }

            public static int relative_id(MemorySegment struct) {
                return struct.get(relative_id$LAYOUT, 0L);
            }

            public static void relative_id(MemorySegment struct, int fieldValue) {
                struct.set(relative_id$LAYOUT, 0L, fieldValue);
            }

            public static final ValueLayout.OfLong expected_revision$layout() {
                return expected_revision$LAYOUT;
            }

            public static final long expected_revision$offset() {
                return 8L;
            }

            public static long expected_revision(MemorySegment struct) {
                return struct.get(expected_revision$LAYOUT, 8L);
            }

            public static void expected_revision(MemorySegment struct, long fieldValue) {
                struct.set(expected_revision$LAYOUT, 8L, fieldValue);
            }

            public static MemorySegment asSlice(MemorySegment array, long index2) {
                return array.asSlice(netkit.layout().byteSize() * index2);
            }

            public static long sizeof() {
                return netkit.layout().byteSize();
            }

            public static MemorySegment allocate(SegmentAllocator allocator) {
                return allocator.allocate((MemoryLayout)netkit.layout());
            }

            public static MemorySegment allocateArray(long elementCount, SegmentAllocator allocator) {
                return allocator.allocate((MemoryLayout)MemoryLayout.sequenceLayout((long)elementCount, (MemoryLayout)netkit.layout()));
            }

            public static MemorySegment reinterpret(MemorySegment addr2, Arena arena, Consumer<MemorySegment> cleanup) {
                return netkit.reinterpret(addr2, 1L, arena, cleanup);
            }

            public static MemorySegment reinterpret(MemorySegment addr2, long elementCount, Arena arena, Consumer<MemorySegment> cleanup) {
                return addr2.reinterpret(netkit.layout().byteSize() * elementCount, arena, cleanup);
            }
        }
    }

    public static class link_update {
        private static final GroupLayout $LAYOUT = MemoryLayout.structLayout((MemoryLayout[])new MemoryLayout[]{Lib.C_INT.withName("link_fd"), MemoryLayout.unionLayout((MemoryLayout[])new MemoryLayout[]{Lib.C_INT.withName("new_prog_fd"), Lib.C_INT.withName("new_map_fd")}).withName("$anon$1797:3"), Lib.C_INT.withName("flags"), MemoryLayout.unionLayout((MemoryLayout[])new MemoryLayout[]{Lib.C_INT.withName("old_prog_fd"), Lib.C_INT.withName("old_map_fd")}).withName("$anon$1804:3")}).withName("$anon$1795:2");
        private static final ValueLayout.OfInt link_fd$LAYOUT = (ValueLayout.OfInt)$LAYOUT.select(new MemoryLayout.PathElement[]{MemoryLayout.PathElement.groupElement((String)"link_fd")});
        private static final long link_fd$OFFSET = 0L;
        private static final ValueLayout.OfInt new_prog_fd$LAYOUT = (ValueLayout.OfInt)$LAYOUT.select(new MemoryLayout.PathElement[]{MemoryLayout.PathElement.groupElement((String)"$anon$1797:3"), MemoryLayout.PathElement.groupElement((String)"new_prog_fd")});
        private static final long new_prog_fd$OFFSET = 4L;
        private static final ValueLayout.OfInt new_map_fd$LAYOUT = (ValueLayout.OfInt)$LAYOUT.select(new MemoryLayout.PathElement[]{MemoryLayout.PathElement.groupElement((String)"$anon$1797:3"), MemoryLayout.PathElement.groupElement((String)"new_map_fd")});
        private static final long new_map_fd$OFFSET = 4L;
        private static final ValueLayout.OfInt flags$LAYOUT = (ValueLayout.OfInt)$LAYOUT.select(new MemoryLayout.PathElement[]{MemoryLayout.PathElement.groupElement((String)"flags")});
        private static final long flags$OFFSET = 8L;
        private static final ValueLayout.OfInt old_prog_fd$LAYOUT = (ValueLayout.OfInt)$LAYOUT.select(new MemoryLayout.PathElement[]{MemoryLayout.PathElement.groupElement((String)"$anon$1804:3"), MemoryLayout.PathElement.groupElement((String)"old_prog_fd")});
        private static final long old_prog_fd$OFFSET = 12L;
        private static final ValueLayout.OfInt old_map_fd$LAYOUT = (ValueLayout.OfInt)$LAYOUT.select(new MemoryLayout.PathElement[]{MemoryLayout.PathElement.groupElement((String)"$anon$1804:3"), MemoryLayout.PathElement.groupElement((String)"old_map_fd")});
        private static final long old_map_fd$OFFSET = 12L;

        link_update() {
        }

        public static final GroupLayout layout() {
            return $LAYOUT;
        }

        public static final ValueLayout.OfInt link_fd$layout() {
            return link_fd$LAYOUT;
        }

        public static final long link_fd$offset() {
            return 0L;
        }

        public static int link_fd(MemorySegment struct) {
            return struct.get(link_fd$LAYOUT, 0L);
        }

        public static void link_fd(MemorySegment struct, int fieldValue) {
            struct.set(link_fd$LAYOUT, 0L, fieldValue);
        }

        public static final ValueLayout.OfInt new_prog_fd$layout() {
            return new_prog_fd$LAYOUT;
        }

        public static final long new_prog_fd$offset() {
            return 4L;
        }

        public static int new_prog_fd(MemorySegment struct) {
            return struct.get(new_prog_fd$LAYOUT, 4L);
        }

        public static void new_prog_fd(MemorySegment struct, int fieldValue) {
            struct.set(new_prog_fd$LAYOUT, 4L, fieldValue);
        }

        public static final ValueLayout.OfInt new_map_fd$layout() {
            return new_map_fd$LAYOUT;
        }

        public static final long new_map_fd$offset() {
            return 4L;
        }

        public static int new_map_fd(MemorySegment struct) {
            return struct.get(new_map_fd$LAYOUT, 4L);
        }

        public static void new_map_fd(MemorySegment struct, int fieldValue) {
            struct.set(new_map_fd$LAYOUT, 4L, fieldValue);
        }

        public static final ValueLayout.OfInt flags$layout() {
            return flags$LAYOUT;
        }

        public static final long flags$offset() {
            return 8L;
        }

        public static int flags(MemorySegment struct) {
            return struct.get(flags$LAYOUT, 8L);
        }

        public static void flags(MemorySegment struct, int fieldValue) {
            struct.set(flags$LAYOUT, 8L, fieldValue);
        }

        public static final ValueLayout.OfInt old_prog_fd$layout() {
            return old_prog_fd$LAYOUT;
        }

        public static final long old_prog_fd$offset() {
            return 12L;
        }

        public static int old_prog_fd(MemorySegment struct) {
            return struct.get(old_prog_fd$LAYOUT, 12L);
        }

        public static void old_prog_fd(MemorySegment struct, int fieldValue) {
            struct.set(old_prog_fd$LAYOUT, 12L, fieldValue);
        }

        public static final ValueLayout.OfInt old_map_fd$layout() {
            return old_map_fd$LAYOUT;
        }

        public static final long old_map_fd$offset() {
            return 12L;
        }

        public static int old_map_fd(MemorySegment struct) {
            return struct.get(old_map_fd$LAYOUT, 12L);
        }

        public static void old_map_fd(MemorySegment struct, int fieldValue) {
            struct.set(old_map_fd$LAYOUT, 12L, fieldValue);
        }

        public static MemorySegment asSlice(MemorySegment array, long index2) {
            return array.asSlice(link_update.layout().byteSize() * index2);
        }

        public static long sizeof() {
            return link_update.layout().byteSize();
        }

        public static MemorySegment allocate(SegmentAllocator allocator) {
            return allocator.allocate((MemoryLayout)link_update.layout());
        }

        public static MemorySegment allocateArray(long elementCount, SegmentAllocator allocator) {
            return allocator.allocate((MemoryLayout)MemoryLayout.sequenceLayout((long)elementCount, (MemoryLayout)link_update.layout()));
        }

        public static MemorySegment reinterpret(MemorySegment addr2, Arena arena, Consumer<MemorySegment> cleanup) {
            return link_update.reinterpret(addr2, 1L, arena, cleanup);
        }

        public static MemorySegment reinterpret(MemorySegment addr2, long elementCount, Arena arena, Consumer<MemorySegment> cleanup) {
            return addr2.reinterpret(link_update.layout().byteSize() * elementCount, arena, cleanup);
        }
    }

    public static class link_detach {
        private static final GroupLayout $LAYOUT = MemoryLayout.structLayout((MemoryLayout[])new MemoryLayout[]{Lib.C_INT.withName("link_fd")}).withName("$anon$1816:2");
        private static final ValueLayout.OfInt link_fd$LAYOUT = (ValueLayout.OfInt)$LAYOUT.select(new MemoryLayout.PathElement[]{MemoryLayout.PathElement.groupElement((String)"link_fd")});
        private static final long link_fd$OFFSET = 0L;

        link_detach() {
        }

        public static final GroupLayout layout() {
            return $LAYOUT;
        }

        public static final ValueLayout.OfInt link_fd$layout() {
            return link_fd$LAYOUT;
        }

        public static final long link_fd$offset() {
            return 0L;
        }

        public static int link_fd(MemorySegment struct) {
            return struct.get(link_fd$LAYOUT, 0L);
        }

        public static void link_fd(MemorySegment struct, int fieldValue) {
            struct.set(link_fd$LAYOUT, 0L, fieldValue);
        }

        public static MemorySegment asSlice(MemorySegment array, long index2) {
            return array.asSlice(link_detach.layout().byteSize() * index2);
        }

        public static long sizeof() {
            return link_detach.layout().byteSize();
        }

        public static MemorySegment allocate(SegmentAllocator allocator) {
            return allocator.allocate((MemoryLayout)link_detach.layout());
        }

        public static MemorySegment allocateArray(long elementCount, SegmentAllocator allocator) {
            return allocator.allocate((MemoryLayout)MemoryLayout.sequenceLayout((long)elementCount, (MemoryLayout)link_detach.layout()));
        }

        public static MemorySegment reinterpret(MemorySegment addr2, Arena arena, Consumer<MemorySegment> cleanup) {
            return link_detach.reinterpret(addr2, 1L, arena, cleanup);
        }

        public static MemorySegment reinterpret(MemorySegment addr2, long elementCount, Arena arena, Consumer<MemorySegment> cleanup) {
            return addr2.reinterpret(link_detach.layout().byteSize() * elementCount, arena, cleanup);
        }
    }

    public static class enable_stats {
        private static final GroupLayout $LAYOUT = MemoryLayout.structLayout((MemoryLayout[])new MemoryLayout[]{Lib.C_INT.withName("type")}).withName("$anon$1820:2");
        private static final ValueLayout.OfInt type$LAYOUT = (ValueLayout.OfInt)$LAYOUT.select(new MemoryLayout.PathElement[]{MemoryLayout.PathElement.groupElement((String)"type")});
        private static final long type$OFFSET = 0L;

        enable_stats() {
        }

        public static final GroupLayout layout() {
            return $LAYOUT;
        }

        public static final ValueLayout.OfInt type$layout() {
            return type$LAYOUT;
        }

        public static final long type$offset() {
            return 0L;
        }

        public static int type(MemorySegment struct) {
            return struct.get(type$LAYOUT, 0L);
        }

        public static void type(MemorySegment struct, int fieldValue) {
            struct.set(type$LAYOUT, 0L, fieldValue);
        }

        public static MemorySegment asSlice(MemorySegment array, long index2) {
            return array.asSlice(enable_stats.layout().byteSize() * index2);
        }

        public static long sizeof() {
            return enable_stats.layout().byteSize();
        }

        public static MemorySegment allocate(SegmentAllocator allocator) {
            return allocator.allocate((MemoryLayout)enable_stats.layout());
        }

        public static MemorySegment allocateArray(long elementCount, SegmentAllocator allocator) {
            return allocator.allocate((MemoryLayout)MemoryLayout.sequenceLayout((long)elementCount, (MemoryLayout)enable_stats.layout()));
        }

        public static MemorySegment reinterpret(MemorySegment addr2, Arena arena, Consumer<MemorySegment> cleanup) {
            return enable_stats.reinterpret(addr2, 1L, arena, cleanup);
        }

        public static MemorySegment reinterpret(MemorySegment addr2, long elementCount, Arena arena, Consumer<MemorySegment> cleanup) {
            return addr2.reinterpret(enable_stats.layout().byteSize() * elementCount, arena, cleanup);
        }
    }

    public static class iter_create {
        private static final GroupLayout $LAYOUT = MemoryLayout.structLayout((MemoryLayout[])new MemoryLayout[]{Lib.C_INT.withName("link_fd"), Lib.C_INT.withName("flags")}).withName("$anon$1824:2");
        private static final ValueLayout.OfInt link_fd$LAYOUT = (ValueLayout.OfInt)$LAYOUT.select(new MemoryLayout.PathElement[]{MemoryLayout.PathElement.groupElement((String)"link_fd")});
        private static final long link_fd$OFFSET = 0L;
        private static final ValueLayout.OfInt flags$LAYOUT = (ValueLayout.OfInt)$LAYOUT.select(new MemoryLayout.PathElement[]{MemoryLayout.PathElement.groupElement((String)"flags")});
        private static final long flags$OFFSET = 4L;

        iter_create() {
        }

        public static final GroupLayout layout() {
            return $LAYOUT;
        }

        public static final ValueLayout.OfInt link_fd$layout() {
            return link_fd$LAYOUT;
        }

        public static final long link_fd$offset() {
            return 0L;
        }

        public static int link_fd(MemorySegment struct) {
            return struct.get(link_fd$LAYOUT, 0L);
        }

        public static void link_fd(MemorySegment struct, int fieldValue) {
            struct.set(link_fd$LAYOUT, 0L, fieldValue);
        }

        public static final ValueLayout.OfInt flags$layout() {
            return flags$LAYOUT;
        }

        public static final long flags$offset() {
            return 4L;
        }

        public static int flags(MemorySegment struct) {
            return struct.get(flags$LAYOUT, 4L);
        }

        public static void flags(MemorySegment struct, int fieldValue) {
            struct.set(flags$LAYOUT, 4L, fieldValue);
        }

        public static MemorySegment asSlice(MemorySegment array, long index2) {
            return array.asSlice(iter_create.layout().byteSize() * index2);
        }

        public static long sizeof() {
            return iter_create.layout().byteSize();
        }

        public static MemorySegment allocate(SegmentAllocator allocator) {
            return allocator.allocate((MemoryLayout)iter_create.layout());
        }

        public static MemorySegment allocateArray(long elementCount, SegmentAllocator allocator) {
            return allocator.allocate((MemoryLayout)MemoryLayout.sequenceLayout((long)elementCount, (MemoryLayout)iter_create.layout()));
        }

        public static MemorySegment reinterpret(MemorySegment addr2, Arena arena, Consumer<MemorySegment> cleanup) {
            return iter_create.reinterpret(addr2, 1L, arena, cleanup);
        }

        public static MemorySegment reinterpret(MemorySegment addr2, long elementCount, Arena arena, Consumer<MemorySegment> cleanup) {
            return addr2.reinterpret(iter_create.layout().byteSize() * elementCount, arena, cleanup);
        }
    }

    public static class prog_bind_map {
        private static final GroupLayout $LAYOUT = MemoryLayout.structLayout((MemoryLayout[])new MemoryLayout[]{Lib.C_INT.withName("prog_fd"), Lib.C_INT.withName("map_fd"), Lib.C_INT.withName("flags")}).withName("$anon$1829:2");
        private static final ValueLayout.OfInt prog_fd$LAYOUT = (ValueLayout.OfInt)$LAYOUT.select(new MemoryLayout.PathElement[]{MemoryLayout.PathElement.groupElement((String)"prog_fd")});
        private static final long prog_fd$OFFSET = 0L;
        private static final ValueLayout.OfInt map_fd$LAYOUT = (ValueLayout.OfInt)$LAYOUT.select(new MemoryLayout.PathElement[]{MemoryLayout.PathElement.groupElement((String)"map_fd")});
        private static final long map_fd$OFFSET = 4L;
        private static final ValueLayout.OfInt flags$LAYOUT = (ValueLayout.OfInt)$LAYOUT.select(new MemoryLayout.PathElement[]{MemoryLayout.PathElement.groupElement((String)"flags")});
        private static final long flags$OFFSET = 8L;

        prog_bind_map() {
        }

        public static final GroupLayout layout() {
            return $LAYOUT;
        }

        public static final ValueLayout.OfInt prog_fd$layout() {
            return prog_fd$LAYOUT;
        }

        public static final long prog_fd$offset() {
            return 0L;
        }

        public static int prog_fd(MemorySegment struct) {
            return struct.get(prog_fd$LAYOUT, 0L);
        }

        public static void prog_fd(MemorySegment struct, int fieldValue) {
            struct.set(prog_fd$LAYOUT, 0L, fieldValue);
        }

        public static final ValueLayout.OfInt map_fd$layout() {
            return map_fd$LAYOUT;
        }

        public static final long map_fd$offset() {
            return 4L;
        }

        public static int map_fd(MemorySegment struct) {
            return struct.get(map_fd$LAYOUT, 4L);
        }

        public static void map_fd(MemorySegment struct, int fieldValue) {
            struct.set(map_fd$LAYOUT, 4L, fieldValue);
        }

        public static final ValueLayout.OfInt flags$layout() {
            return flags$LAYOUT;
        }

        public static final long flags$offset() {
            return 8L;
        }

        public static int flags(MemorySegment struct) {
            return struct.get(flags$LAYOUT, 8L);
        }

        public static void flags(MemorySegment struct, int fieldValue) {
            struct.set(flags$LAYOUT, 8L, fieldValue);
        }

        public static MemorySegment asSlice(MemorySegment array, long index2) {
            return array.asSlice(prog_bind_map.layout().byteSize() * index2);
        }

        public static long sizeof() {
            return prog_bind_map.layout().byteSize();
        }

        public static MemorySegment allocate(SegmentAllocator allocator) {
            return allocator.allocate((MemoryLayout)prog_bind_map.layout());
        }

        public static MemorySegment allocateArray(long elementCount, SegmentAllocator allocator) {
            return allocator.allocate((MemoryLayout)MemoryLayout.sequenceLayout((long)elementCount, (MemoryLayout)prog_bind_map.layout()));
        }

        public static MemorySegment reinterpret(MemorySegment addr2, Arena arena, Consumer<MemorySegment> cleanup) {
            return prog_bind_map.reinterpret(addr2, 1L, arena, cleanup);
        }

        public static MemorySegment reinterpret(MemorySegment addr2, long elementCount, Arena arena, Consumer<MemorySegment> cleanup) {
            return addr2.reinterpret(prog_bind_map.layout().byteSize() * elementCount, arena, cleanup);
        }
    }

    public static class token_create {
        private static final GroupLayout $LAYOUT = MemoryLayout.structLayout((MemoryLayout[])new MemoryLayout[]{Lib.C_INT.withName("flags"), Lib.C_INT.withName("bpffs_fd")}).withName("$anon$1835:2");
        private static final ValueLayout.OfInt flags$LAYOUT = (ValueLayout.OfInt)$LAYOUT.select(new MemoryLayout.PathElement[]{MemoryLayout.PathElement.groupElement((String)"flags")});
        private static final long flags$OFFSET = 0L;
        private static final ValueLayout.OfInt bpffs_fd$LAYOUT = (ValueLayout.OfInt)$LAYOUT.select(new MemoryLayout.PathElement[]{MemoryLayout.PathElement.groupElement((String)"bpffs_fd")});
        private static final long bpffs_fd$OFFSET = 4L;

        token_create() {
        }

        public static final GroupLayout layout() {
            return $LAYOUT;
        }

        public static final ValueLayout.OfInt flags$layout() {
            return flags$LAYOUT;
        }

        public static final long flags$offset() {
            return 0L;
        }

        public static int flags(MemorySegment struct) {
            return struct.get(flags$LAYOUT, 0L);
        }

        public static void flags(MemorySegment struct, int fieldValue) {
            struct.set(flags$LAYOUT, 0L, fieldValue);
        }

        public static final ValueLayout.OfInt bpffs_fd$layout() {
            return bpffs_fd$LAYOUT;
        }

        public static final long bpffs_fd$offset() {
            return 4L;
        }

        public static int bpffs_fd(MemorySegment struct) {
            return struct.get(bpffs_fd$LAYOUT, 4L);
        }

        public static void bpffs_fd(MemorySegment struct, int fieldValue) {
            struct.set(bpffs_fd$LAYOUT, 4L, fieldValue);
        }

        public static MemorySegment asSlice(MemorySegment array, long index2) {
            return array.asSlice(token_create.layout().byteSize() * index2);
        }

        public static long sizeof() {
            return token_create.layout().byteSize();
        }

        public static MemorySegment allocate(SegmentAllocator allocator) {
            return allocator.allocate((MemoryLayout)token_create.layout());
        }

        public static MemorySegment allocateArray(long elementCount, SegmentAllocator allocator) {
            return allocator.allocate((MemoryLayout)MemoryLayout.sequenceLayout((long)elementCount, (MemoryLayout)token_create.layout()));
        }

        public static MemorySegment reinterpret(MemorySegment addr2, Arena arena, Consumer<MemorySegment> cleanup) {
            return token_create.reinterpret(addr2, 1L, arena, cleanup);
        }

        public static MemorySegment reinterpret(MemorySegment addr2, long elementCount, Arena arena, Consumer<MemorySegment> cleanup) {
            return addr2.reinterpret(token_create.layout().byteSize() * elementCount, arena, cleanup);
        }
    }
}

