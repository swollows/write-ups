/*
 * Decompiled with CFR 0.153-SNAPSHOT (d6f6758-dirty).
 * 
 * Could not load the following classes:
 *  java.lang.foreign.MemorySegment
 */
package me.bechberger.ebpf.shared;

import java.lang.annotation.Annotation;
import java.lang.foreign.MemorySegment;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import me.bechberger.ebpf.type.BPFType;

public class Disassembler {
    static final BPFType<Short> OFFSET_TYPE = BPFType.BPFIntType.INT16;
    static final BPFType<Integer> IMM_TYPE = BPFType.BPFIntType.INT32;
    static final BPFType.BPFStructType<BPFInstrFields> BPF_INSTR_FIELDS_TYPE = new BPFType.BPFStructType<BPFInstrFields>("bpf_instr_fields", List.of(new BPFType.BPFStructMember<BPFInstrFields, Byte>("opcode", BPFType.BPFIntType.UINT8, 0, BPFInstrFields::opcode), new BPFType.BPFStructMember<BPFInstrFields, Byte>("dst_and_src", BPFType.BPFIntType.UINT8, 1, BPFInstrFields::dst_and_src), new BPFType.BPFStructMember<BPFInstrFields, Short>("offset", OFFSET_TYPE, 2, BPFInstrFields::offset), new BPFType.BPFStructMember<BPFInstrFields, Integer>("imm", IMM_TYPE, 4, BPFInstrFields::imm)), new BPFType.AnnotatedClass(BPFInstrFields.class, (List<Annotation>)List.of()), objects -> new BPFInstrFields((Byte)objects.get(0), (Byte)objects.get(1), (Short)objects.get(2), (Integer)objects.get(3)));
    static final BPFType.BPFUnionTypeOld<Void> BPF_INSTR_TYPE = new BPFType.BPFUnionTypeOld("bpf_instr", null, List.of(new BPFType.BPFUnionMember("s", BPF_INSTR_FIELDS_TYPE, null), new BPFType.BPFUnionMember("instr", BPFType.BPFIntType.UINT64, null)));

    static BPFDecoder.InstrDecoded disassembleInstruction(int i, BPFType.BPFUnion<Void> w0, BPFType.BPFUnion<Void> w1) {
        BPFDecoder.InstrDecoded decoded = BPFDecoder.decode(i, w0, w1);
        return new BPFDecoder.InstrDecoded(String.format("%4d: (%02x) %s", i, ((BPFInstrFields)((Object)w0.get("s"))).opcode(), decoded.instr()), decoded.skip());
    }

    public static List<BPFDecoder.InstrDecoded> disassemble_str(MemorySegment bpfstr) {
        long numinstr = bpfstr.byteSize() / 8L;
        BPFType.BPFUnion w0 = (BPFType.BPFUnion)BPF_INSTR_TYPE.parseMemory(bpfstr);
        int skip = 0;
        ArrayList<BPFDecoder.InstrDecoded> instr_list = new ArrayList<BPFDecoder.InstrDecoded>();
        int i = 1;
        while ((long)i < numinstr) {
            BPFType.BPFUnion w1 = (BPFType.BPFUnion)BPF_INSTR_TYPE.parseMemory(bpfstr.asSlice((long)i * 8L, 8L));
            if (skip > 0) {
                --skip;
                instr_list.add(new BPFDecoder.InstrDecoded(String.format("%4d:      (64-bit upper word)", i), 0));
            } else {
                BPFDecoder.InstrDecoded decoded = Disassembler.disassembleInstruction(i - 1, w0, w1);
                instr_list.add(decoded);
                skip = decoded.skip();
            }
            w0 = w1;
            ++i;
        }
        BPFDecoder.InstrDecoded decoded = Disassembler.disassembleInstruction((int)(numinstr - 1L), w0, null);
        instr_list.add(decoded);
        return instr_list;
    }

    public static String disassemble_prog(String func_name, MemorySegment bpfstr) {
        ArrayList<String> instr_list = new ArrayList<String>();
        instr_list.add(String.format("Disassemble of BPF program %s:", func_name));
        for (BPFDecoder.InstrDecoded instr : Disassembler.disassemble_str(bpfstr)) {
            instr_list.add(instr.instr());
        }
        return String.join((CharSequence)System.lineSeparator(), instr_list);
    }

    static class BPFDecoder {
        static final int BPF_PSEUDO_CALL = 1;
        static final String[] BPF_HELPERS = new String[]{"unspec", "map_lookup_elem", "map_update_elem", "map_delete_elem", "probe_read", "ktime_get_ns", "trace_printk", "get_prandom_u32", "get_smp_processor_id", "skb_store_bytes", "l3_csum_replace", "l4_csum_replace", "tail_call", "clone_redirect", "get_current_pid_tgid", "get_current_uid_gid", "get_current_comm", "get_cgroup_classid", "skb_vlan_push", "skb_vlan_pop", "skb_get_tunnel_key", "skb_set_tunnel_key", "perf_event_read", "redirect", "get_route_realm", "perf_event_output", "skb_load_bytes", "get_stackid", "csum_diff", "skb_get_tunnel_opt", "skb_set_tunnel_opt", "skb_change_proto", "skb_change_type", "skb_under_cgroup", "get_hash_recalc", "get_current_task", "probe_write_user", "current_task_under_cgroup", "skb_change_tail", "skb_pull_data", "csum_update", "set_hash_invalid", "get_numa_node_id", "skb_change_head", "xdp_adjust_head", "probe_read_str", "get_socket_cookie", "get_socket_uid", "set_hash", "setsockopt", "skb_adjust_room", "redirect_map", "sk_redirect_map", "sock_map_update", "xdp_adjust_meta", "perf_event_read_value", "perf_prog_read_value", "getsockopt", "override_return", "sock_ops_cb_flags_set", "msg_redirect_map", "msg_apply_bytes", "msg_cork_bytes", "msg_pull_data", "bind", "xdp_adjust_tail", "skb_get_xfrm_state", "get_stack", "skb_load_bytes_relative", "fib_lookup", "sock_hash_update", "msg_redirect_hash", "sk_redirect_hash", "lwt_push_encap", "lwt_seg6_store_bytes", "lwt_seg6_adjust_srh", "lwt_seg6_action", "rc_repeat", "rc_keydown", "skb_cgroup_id", "get_current_cgroup_id", "get_local_storage", "sk_select_reuseport", "skb_ancestor_cgroup_id", "sk_lookup_tcp", "sk_lookup_udp", "sk_release", "map_push_elem", "map_pop_elem", "map_peek_elem", "msg_push_data", "msg_pop_data", "rc_pointer_rel"};
        static final Map<Byte, OpCode> opcodes = new HashMap<Byte, OpCode>();

        BPFDecoder() {
        }

        static InstrDecoded decode(int i, BPFType.BPFUnion<Void> w, BPFType.BPFUnion<Void> w1) {
            BPFInstrFields fields = (BPFInstrFields)((Object)w.get("s"));
            byte opcode = fields.opcode();
            byte dst = fields.dst();
            byte src = fields.src();
            short offset = fields.offset();
            int imm = fields.imm();
            OpCode op = opcodes.getOrDefault(opcode, null);
            if (op == null) {
                return InstrDecoded.invalid(opcode);
            }
            String name = op.name();
            String opclass = op.op();
            int bits = op.size();
            switch (opclass) {
                case "dstimm": {
                    return new InstrDecoded(String.format("r%d %s %d", dst, op.repr(), imm), 0);
                }
                case "dstimm_bw": {
                    return new InstrDecoded(String.format("r%d %s 0x%x", dst, op.repr(), imm), 0);
                }
                case "joff": {
                    return new InstrDecoded(String.format("goto %s <%d>", String.format("%+d", offset), i + offset + 1), 0);
                }
                case "dstsrc": {
                    return new InstrDecoded(String.format("r%d %s r%d", dst, op.repr(), src), 0);
                }
                case "jdstimmoff": {
                    return new InstrDecoded(String.format("if r%d %s %d goto pc%s <%d>", dst, op.repr(), imm, String.format("%+d", offset), i + offset + 1), 0);
                }
                case "jdstsrcoff": {
                    return new InstrDecoded(String.format("if r%d %s r%d goto pc%s <%d>", dst, op.repr(), src, String.format("%+d", offset), i + offset + 1), 0);
                }
                case "lddw": {
                    if (w1 == null) {
                        throw new RuntimeException("lddw requires two instructions to be disassembled");
                    }
                    int w1imm = ((BPFInstrFields)((Object)w1.get("s"))).imm();
                    if (w1imm == 0) {
                        return new InstrDecoded(String.format("r%d = <map at fd #%d>", dst, imm), 1);
                    }
                    long imm64 = (long)w1imm << 32 | (long)imm;
                    return new InstrDecoded(String.format("r%d = 0x%x", dst, imm64), 1);
                }
                case "ldabs": {
                    return new InstrDecoded(String.format("r0 = *(u%s*)skb[%s]", bits, imm), 0);
                }
                case "ldind": {
                    return new InstrDecoded(String.format("r0 = *(u%d*)skb[r%d %s]", bits, src, String.format("%+d", imm)), 0);
                }
                case "ldstsrcoff": {
                    return new InstrDecoded(String.format("r%d = *(u%d*)(r%d %s)", dst, bits, src, String.format("%+d", offset)), 0);
                }
                case "sdstoffimm": {
                    return new InstrDecoded(String.format("*(u%d*)(r%d %s) = %d", bits, dst, String.format("%+d", offset), imm), 0);
                }
                case "sdstoffsrc": {
                    return new InstrDecoded(String.format("*(u%d*)(r%d %s) = r%d", bits, dst, String.format("%+d", offset), src), 0);
                }
                case "dst": {
                    return new InstrDecoded(String.format("r%d = %s (u%s)r%d", dst, op.repr(), bits, dst), 0);
                }
                case "call": {
                    if (src != 1) {
                        try {
                            return new InstrDecoded(String.format("%s bpf_%s#%d", name, BPF_HELPERS[imm], imm), 0);
                        } catch (IndexOutOfBoundsException e) {
                            return new InstrDecoded(String.format("%s <unknown helper #%d>", op.repr(), imm), 0);
                        }
                    }
                    return new InstrDecoded(String.format("%s %s", name, String.format("%+d", imm)), 0);
                }
                case "exit": {
                    return new InstrDecoded(name, 0);
                }
            }
            throw new RuntimeException("unknown opcode class " + opclass);
        }

        static {
            opcodes.put((byte)4, new OpCode("add32", "dstimm", "+=", 32));
            opcodes.put((byte)5, new OpCode("ja", "joff", null, 64));
            opcodes.put((byte)7, new OpCode("add", "dstimm", "+=", 64));
            opcodes.put((byte)12, new OpCode("add32", "dstsrc", "+=", 32));
            opcodes.put((byte)15, new OpCode("add", "dstsrc", "+=", 64));
            opcodes.put((byte)20, new OpCode("sub32", "dstimm", "-=", 32));
            opcodes.put((byte)21, new OpCode("jeq", "jdstimmoff", "==", 64));
            opcodes.put((byte)23, new OpCode("sub", "dstimm", "-=", 64));
            opcodes.put((byte)24, new OpCode("lddw", "lddw", null, 64));
            opcodes.put((byte)28, new OpCode("sub32", "dstsrc", "-=", 32));
            opcodes.put((byte)29, new OpCode("jeq", "jdstsrcoff", "==", 64));
            opcodes.put((byte)31, new OpCode("sub", "dstsrc", "-=", 64));
            opcodes.put((byte)32, new OpCode("ldabsw", "ldabs", null, 32));
            opcodes.put((byte)36, new OpCode("mul32", "dstimm", "*=", 32));
            opcodes.put((byte)37, new OpCode("jgt", "jdstimmoff", ">", 64));
            opcodes.put((byte)39, new OpCode("mul", "dstimm", "*=", 64));
            opcodes.put((byte)40, new OpCode("ldabsh", "ldabs", null, 16));
            opcodes.put((byte)44, new OpCode("mul32", "dstsrc", "*=", 32));
            opcodes.put((byte)45, new OpCode("jgt", "jdstsrcoff", ">", 64));
            opcodes.put((byte)47, new OpCode("mul", "dstsrc", "*=", 64));
            opcodes.put((byte)48, new OpCode("ldabsb", "ldabs", null, 8));
            opcodes.put((byte)52, new OpCode("div32", "dstimm", "/=", 32));
            opcodes.put((byte)53, new OpCode("jge", "jdstimmoff", ">=", 64));
            opcodes.put((byte)55, new OpCode("div", "dstimm", "/=", 64));
            opcodes.put((byte)56, new OpCode("ldabsdw", "ldabs", null, 64));
            opcodes.put((byte)60, new OpCode("div32", "dstsrc", "/=", 32));
            opcodes.put((byte)61, new OpCode("jge", "jdstsrcoff", ">=", 64));
            opcodes.put((byte)63, new OpCode("div", "dstsrc", "/=", 64));
            opcodes.put((byte)64, new OpCode("ldindw", "ldind", null, 32));
            opcodes.put((byte)68, new OpCode("or32", "dstimm_bw", "|=", 32));
            opcodes.put((byte)69, new OpCode("jset", "jdstimmoff", "&", 64));
            opcodes.put((byte)71, new OpCode("or", "dstimm_bw", "|=", 64));
            opcodes.put((byte)72, new OpCode("ldindh", "ldind", null, 16));
            opcodes.put((byte)76, new OpCode("or32", "dstsrc", "|=", 32));
            opcodes.put((byte)77, new OpCode("jset", "jdstsrcoff", "&", 64));
            opcodes.put((byte)79, new OpCode("or", "dstsrc", "|=", 64));
            opcodes.put((byte)80, new OpCode("ldindb", "ldind", null, 8));
            opcodes.put((byte)84, new OpCode("and32", "dstimm_bw", "&=", 32));
            opcodes.put((byte)85, new OpCode("jne", "jdstimmoff", "!=", 64));
            opcodes.put((byte)87, new OpCode("and", "dstimm_bw", "&=", 64));
            opcodes.put((byte)88, new OpCode("ldinddw", "ldind", null, 64));
            opcodes.put((byte)92, new OpCode("and32", "dstsrc", "&=", 32));
            opcodes.put((byte)93, new OpCode("jne", "jdstsrcoff", "!=", 64));
            opcodes.put((byte)95, new OpCode("and", "dstsrc", "&=", 64));
            opcodes.put((byte)97, new OpCode("ldxw", "ldstsrcoff", null, 32));
            opcodes.put((byte)98, new OpCode("stw", "sdstoffimm", null, 32));
            opcodes.put((byte)99, new OpCode("stxw", "sdstoffsrc", null, 32));
            opcodes.put((byte)100, new OpCode("lsh32", "dstimm", "<<=", 32));
            opcodes.put((byte)101, new OpCode("jsgt", "jdstimmoff", "s>", 64));
            opcodes.put((byte)103, new OpCode("lsh", "dstimm", "<<=", 64));
            opcodes.put((byte)105, new OpCode("ldxh", "ldstsrcoff", null, 16));
            opcodes.put((byte)106, new OpCode("sth", "sdstoffimm", null, 16));
            opcodes.put((byte)107, new OpCode("stxh", "sdstoffsrc", null, 16));
            opcodes.put((byte)108, new OpCode("lsh32", "dstsrc", "<<=", 32));
            opcodes.put((byte)109, new OpCode("jsgt", "jdstsrcoff", "s>", 64));
            opcodes.put((byte)111, new OpCode("lsh", "dstsrc", "<<=", 64));
            opcodes.put((byte)113, new OpCode("ldxb", "ldstsrcoff", null, 8));
            opcodes.put((byte)114, new OpCode("stb", "sdstoffimm", null, 8));
            opcodes.put((byte)115, new OpCode("stxb", "sdstoffsrc", null, 8));
            opcodes.put((byte)116, new OpCode("rsh32", "dstimm", ">>=", 32));
            opcodes.put((byte)117, new OpCode("jsge", "jdstimmoff", "s>=", 64));
            opcodes.put((byte)119, new OpCode("rsh", "dstimm", ">>=", 64));
            opcodes.put((byte)121, new OpCode("ldxdw", "ldstsrcoff", null, 64));
            opcodes.put((byte)122, new OpCode("stdw", "sdstoffimm", null, 64));
            opcodes.put((byte)123, new OpCode("stxdw", "sdstoffsrc", null, 64));
            opcodes.put((byte)124, new OpCode("rsh32", "dstsrc", ">>=", 32));
            opcodes.put((byte)125, new OpCode("jsge", "jdstsrcoff", "s>=", 64));
            opcodes.put((byte)127, new OpCode("rsh", "dstsrc", ">>=", 64));
            opcodes.put((byte)-124, new OpCode("neg32", "dst", "~", 32));
            opcodes.put((byte)-123, new OpCode("call", "call", null, 64));
            opcodes.put((byte)-121, new OpCode("neg", "dst", "~", 64));
            opcodes.put((byte)-108, new OpCode("mod32", "dstimm", "%=", 32));
            opcodes.put((byte)-107, new OpCode("exit", "exit", null, 64));
            opcodes.put((byte)-105, new OpCode("mod", "dstimm", "%=", 64));
            opcodes.put((byte)-100, new OpCode("mod32", "dstsrc", "%=", 32));
            opcodes.put((byte)-97, new OpCode("mod", "dstsrc", "%=", 64));
            opcodes.put((byte)-92, new OpCode("xor32", "dstimm_bw", "^=", 32));
            opcodes.put((byte)-91, new OpCode("jlt", "jdstimmoff", "<", 64));
            opcodes.put((byte)-89, new OpCode("xor", "dstimm_bw", "^=", 64));
            opcodes.put((byte)-84, new OpCode("xor32", "dstsrc", "^=", 32));
            opcodes.put((byte)-83, new OpCode("jlt", "jdstsrcoff", "<", 64));
            opcodes.put((byte)-81, new OpCode("xor", "dstsrc", "^=", 64));
            opcodes.put((byte)-76, new OpCode("mov32", "dstimm", "=", 32));
            opcodes.put((byte)-75, new OpCode("jle", "jdstimmoff", "<=", 64));
            opcodes.put((byte)-73, new OpCode("mov", "dstimm", "=", 64));
            opcodes.put((byte)-68, new OpCode("mov32", "dstsrc", "=", 32));
            opcodes.put((byte)-67, new OpCode("jle", "jdstsrcoff", "<=", 64));
            opcodes.put((byte)-65, new OpCode("mov", "dstsrc", "=", 64));
            opcodes.put((byte)-60, new OpCode("arsh32", "dstimm", "s>>=", 32));
            opcodes.put((byte)-59, new OpCode("jslt", "jdstimmoff", "s<", 64));
            opcodes.put((byte)-57, new OpCode("arsh", "dstimm", "s>>=", 64));
            opcodes.put((byte)-52, new OpCode("arsh32", "dstsrc", "s>>=", 32));
            opcodes.put((byte)-51, new OpCode("jslt", "jdstsrcoff", "s<", 64));
            opcodes.put((byte)-49, new OpCode("arsh", "dstsrc", "s>>=", 64));
            opcodes.put((byte)-43, new OpCode("jsle", "jdstimmoff", "s<=", 64));
            opcodes.put((byte)-36, new OpCode("endian32", "dstsrc", "endian", 32));
            opcodes.put((byte)-35, new OpCode("jsle", "jdstimmoff", "s<=", 64));
        }

        record OpCode(String name, String op, String repr, int size) {
        }

        public record InstrDecoded(String instr, int skip) {
            boolean valid() {
                return this.skip > -1;
            }

            static InstrDecoded invalid(int opcode) {
                return new InstrDecoded(String.format("0x%x", opcode), -1);
            }
        }
    }

    record BPFInstrFields(byte opcode, byte dst_and_src, short offset, int imm) {
        byte src() {
            return (byte)(this.dst_and_src >> 4 & 0xF);
        }

        byte dst() {
            return (byte)(this.dst_and_src & 0xF);
        }
    }
}

