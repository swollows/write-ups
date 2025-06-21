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
import me.bechberger.ebpf.runtime.BpfDefinitions;
import me.bechberger.ebpf.runtime.ListDefinitions;
import me.bechberger.ebpf.runtime.ObjDefinitions;
import me.bechberger.ebpf.runtime.SeqDefinitions;
import me.bechberger.ebpf.runtime.misc;
import me.bechberger.ebpf.runtime.runtime;
import me.bechberger.ebpf.type.Enum;
import me.bechberger.ebpf.type.Ptr;
import me.bechberger.ebpf.type.Struct;
import me.bechberger.ebpf.type.TypedEnum;

public final class BtfDefinitions {
    @NotUsableInJava
    @BuiltinBPFFunction(value="__btf_array_show((const struct btf*)$arg1, (const struct btf_type*)$arg2, $arg3, $arg4, $arg5, $arg6)")
    public static void __btf_array_show(Ptr<runtime.btf> btf2, Ptr<btf_type> t, @Unsigned int type_id, Ptr<?> data, char bits_offset, Ptr<btf_show> show) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction(value="__btf_kfunc_id_set_contains((const struct btf*)$arg1, $arg2, $arg3, (const struct bpf_prog*)$arg4)")
    public static @NotUsableInJava Ptr<@Unsigned Integer> __btf_kfunc_id_set_contains(Ptr<runtime.btf> btf2, btf_kfunc_hook hook, @Unsigned int kfunc_btf_id, Ptr<BpfDefinitions.bpf_prog> prog) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction(value="((const u8*)__btf_name_by_offset((const struct btf*)$arg1, $arg2))")
    public static String __btf_name_by_offset(Ptr<runtime.btf> btf2, @Unsigned int offset) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction(value="((const struct btf_type*)__btf_resolve_size((const struct btf*)$arg1, (const struct btf_type*)$arg2, $arg3, (const struct btf_type**)$arg4, $arg5, $arg6, $arg7))")
    public static Ptr<btf_type> __btf_resolve_size(Ptr<runtime.btf> btf2, Ptr<btf_type> type2, Ptr<@Unsigned Integer> type_size, Ptr<Ptr<btf_type>> elem_type, Ptr<@Unsigned Integer> elem_id, Ptr<@Unsigned Integer> total_nelems, Ptr<@Unsigned Integer> type_id) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction(value="__btf_verifier_log($arg1, (const u8*)$arg2, $arg3_)")
    public static void __btf_verifier_log(Ptr<BpfDefinitions.bpf_verifier_log> log, String fmt, Object ... param2) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction(value="__btf_verifier_log_type($arg1, (const struct btf_type*)$arg2, $arg3, (const u8*)$arg4, $arg5_)")
    public static void __btf_verifier_log_type(Ptr<btf_verifier_env> env, Ptr<btf_type> t, boolean log_details, String fmt, Object ... param4) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int btf_add_type(Ptr<btf_verifier_env> env, Ptr<btf_type> t) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int btf_alloc_id(Ptr<runtime.btf> btf2) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction(value="btf_array_check_member($arg1, (const struct btf_type*)$arg2, (const struct btf_member*)$arg3, (const struct btf_type*)$arg4)")
    public static int btf_array_check_member(Ptr<btf_verifier_env> env, Ptr<btf_type> struct_type, Ptr<btf_member> member, Ptr<btf_type> member_type) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction(value="btf_array_check_meta($arg1, (const struct btf_type*)$arg2, $arg3)")
    public static int btf_array_check_meta(Ptr<btf_verifier_env> env, Ptr<btf_type> t, @Unsigned int meta_left) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction(value="btf_array_log($arg1, (const struct btf_type*)$arg2)")
    public static void btf_array_log(Ptr<btf_verifier_env> env, Ptr<btf_type> t) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction(value="btf_array_resolve($arg1, (const struct resolve_vertex*)$arg2)")
    public static int btf_array_resolve(Ptr<btf_verifier_env> env, Ptr<misc.resolve_vertex> v) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction(value="btf_array_show((const struct btf*)$arg1, (const struct btf_type*)$arg2, $arg3, $arg4, $arg5, $arg6)")
    public static void btf_array_show(Ptr<runtime.btf> btf2, Ptr<btf_type> t, @Unsigned int type_id, Ptr<?> data, char bits_offset, Ptr<btf_show> show) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction(value="btf_base_btf((const struct btf*)$arg1)")
    public static Ptr<runtime.btf> btf_base_btf(Ptr<runtime.btf> btf2) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void btf_bitfield_show(Ptr<?> data, char bits_offset, char nr_bits, Ptr<btf_show> show) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int btf_check_all_metas(Ptr<btf_verifier_env> env) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int btf_check_all_types(Ptr<btf_verifier_env> env) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction(value="btf_check_and_fixup_fields((const struct btf*)$arg1, $arg2)")
    public static int btf_check_and_fixup_fields(Ptr<runtime.btf> btf2, Ptr<btf_record> rec) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction(value="btf_check_func_type_match($arg1, $arg2, (const struct btf_type*)$arg3, $arg4, (const struct btf_type*)$arg5)")
    public static int btf_check_func_type_match(Ptr<BpfDefinitions.bpf_verifier_log> log, Ptr<runtime.btf> btf1, Ptr<btf_type> t1, Ptr<runtime.btf> btf2, Ptr<btf_type> t2) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction(value="btf_check_iter_arg($arg1, (const struct btf_type*)$arg2, $arg3)")
    public static int btf_check_iter_arg(Ptr<runtime.btf> btf2, Ptr<btf_type> func, int arg_idx) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction(value="btf_check_iter_kfuncs($arg1, (const u8*)$arg2, (const struct btf_type*)$arg3, $arg4)")
    public static int btf_check_iter_kfuncs(Ptr<runtime.btf> btf2, String func_name, Ptr<btf_type> func, @Unsigned int func_flags) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction(value="btf_check_type_match($arg1, (const struct bpf_prog*)$arg2, $arg3, (const struct btf_type*)$arg4)")
    public static int btf_check_type_match(Ptr<BpfDefinitions.bpf_verifier_log> log, Ptr<BpfDefinitions.bpf_prog> prog, Ptr<runtime.btf> btf2, Ptr<btf_type> t2) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int btf_check_type_tags(Ptr<btf_verifier_env> env, Ptr<runtime.btf> btf2, int start_id) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction(value="btf_ctx_access($arg1, $arg2, $arg3, (const struct bpf_prog*)$arg4, $arg5)")
    public static boolean btf_ctx_access(int off, int size, BpfDefinitions.bpf_access_type type2, Ptr<BpfDefinitions.bpf_prog> prog, Ptr<BpfDefinitions.bpf_insn_access_aux> info2) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction(value="btf_ctx_arg_offset((const struct btf*)$arg1, (const struct btf_type*)$arg2, $arg3)")
    public static int btf_ctx_arg_offset(Ptr<runtime.btf> btf2, Ptr<btf_type> func_proto, @Unsigned int arg_no) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction(value="btf_datasec_check_meta($arg1, (const struct btf_type*)$arg2, $arg3)")
    public static int btf_datasec_check_meta(Ptr<btf_verifier_env> env, Ptr<btf_type> t, @Unsigned int meta_left) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction(value="btf_datasec_log($arg1, (const struct btf_type*)$arg2)")
    public static void btf_datasec_log(Ptr<btf_verifier_env> env, Ptr<btf_type> t) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction(value="btf_datasec_resolve($arg1, (const struct resolve_vertex*)$arg2)")
    public static int btf_datasec_resolve(Ptr<btf_verifier_env> env, Ptr<misc.resolve_vertex> v) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction(value="btf_datasec_show((const struct btf*)$arg1, (const struct btf_type*)$arg2, $arg3, $arg4, $arg5, $arg6)")
    public static void btf_datasec_show(Ptr<runtime.btf> btf2, Ptr<btf_type> t, @Unsigned int type_id, Ptr<?> data, char bits_offset, Ptr<btf_show> show) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction(value="btf_decl_tag_check_meta($arg1, (const struct btf_type*)$arg2, $arg3)")
    public static int btf_decl_tag_check_meta(Ptr<btf_verifier_env> env, Ptr<btf_type> t, @Unsigned int meta_left) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction(value="btf_decl_tag_log($arg1, (const struct btf_type*)$arg2)")
    public static void btf_decl_tag_log(Ptr<btf_verifier_env> env, Ptr<btf_type> t) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction(value="btf_decl_tag_resolve($arg1, (const struct resolve_vertex*)$arg2)")
    public static int btf_decl_tag_resolve(Ptr<btf_verifier_env> env, Ptr<misc.resolve_vertex> v) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction(value="btf_df_check_kflag_member($arg1, (const struct btf_type*)$arg2, (const struct btf_member*)$arg3, (const struct btf_type*)$arg4)")
    public static int btf_df_check_kflag_member(Ptr<btf_verifier_env> env, Ptr<btf_type> struct_type, Ptr<btf_member> member, Ptr<btf_type> member_type) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction(value="btf_df_check_member($arg1, (const struct btf_type*)$arg2, (const struct btf_member*)$arg3, (const struct btf_type*)$arg4)")
    public static int btf_df_check_member(Ptr<btf_verifier_env> env, Ptr<btf_type> struct_type, Ptr<btf_member> member, Ptr<btf_type> member_type) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction(value="btf_df_resolve($arg1, (const struct resolve_vertex*)$arg2)")
    public static int btf_df_resolve(Ptr<btf_verifier_env> env, Ptr<misc.resolve_vertex> v) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction(value="btf_df_show((const struct btf*)$arg1, (const struct btf_type*)$arg2, $arg3, $arg4, $arg5, $arg6)")
    public static void btf_df_show(Ptr<runtime.btf> btf2, Ptr<btf_type> t, @Unsigned int type_id, Ptr<?> data, char bits_offsets, Ptr<btf_show> show) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction(value="btf_distill_func_proto($arg1, $arg2, (const struct btf_type*)$arg3, (const u8*)$arg4, $arg5)")
    public static int btf_distill_func_proto(Ptr<BpfDefinitions.bpf_verifier_log> log, Ptr<runtime.btf> btf2, Ptr<btf_type> func, String tname, Ptr<btf_func_model> m) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction(value="btf_enum64_check_meta($arg1, (const struct btf_type*)$arg2, $arg3)")
    public static int btf_enum64_check_meta(Ptr<btf_verifier_env> env, Ptr<btf_type> t, @Unsigned int meta_left) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction(value="btf_enum64_show((const struct btf*)$arg1, (const struct btf_type*)$arg2, $arg3, $arg4, $arg5, $arg6)")
    public static void btf_enum64_show(Ptr<runtime.btf> btf2, Ptr<btf_type> t, @Unsigned int type_id, Ptr<?> data, char bits_offset, Ptr<btf_show> show) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction(value="btf_enum_check_kflag_member($arg1, (const struct btf_type*)$arg2, (const struct btf_member*)$arg3, (const struct btf_type*)$arg4)")
    public static int btf_enum_check_kflag_member(Ptr<btf_verifier_env> env, Ptr<btf_type> struct_type, Ptr<btf_member> member, Ptr<btf_type> member_type) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction(value="btf_enum_check_member($arg1, (const struct btf_type*)$arg2, (const struct btf_member*)$arg3, (const struct btf_type*)$arg4)")
    public static int btf_enum_check_member(Ptr<btf_verifier_env> env, Ptr<btf_type> struct_type, Ptr<btf_member> member, Ptr<btf_type> member_type) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction(value="btf_enum_check_meta($arg1, (const struct btf_type*)$arg2, $arg3)")
    public static int btf_enum_check_meta(Ptr<btf_verifier_env> env, Ptr<btf_type> t, @Unsigned int meta_left) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction(value="btf_enum_log($arg1, (const struct btf_type*)$arg2)")
    public static void btf_enum_log(Ptr<btf_verifier_env> env, Ptr<btf_type> t) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction(value="btf_enum_show((const struct btf*)$arg1, (const struct btf_type*)$arg2, $arg3, $arg4, $arg5, $arg6)")
    public static void btf_enum_show(Ptr<runtime.btf> btf2, Ptr<btf_type> t, @Unsigned int type_id, Ptr<?> data, char bits_offset, Ptr<btf_show> show) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction(value="btf_find_by_name_kind((const struct btf*)$arg1, (const u8*)$arg2, $arg3)")
    public static int btf_find_by_name_kind(Ptr<runtime.btf> btf2, String name, char kind) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction(value="((const u8*)btf_find_decl_tag_value((const struct btf*)$arg1, (const struct btf_type*)$arg2, $arg3, (const u8*)$arg4))")
    public static String btf_find_decl_tag_value(Ptr<runtime.btf> btf2, Ptr<btf_type> pt2, int comp_idx, String tag_key) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int btf_find_dtor_kfunc(Ptr<runtime.btf> btf2, @Unsigned int btf_id) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction(value="btf_find_field_one((const struct btf*)$arg1, (const struct btf_type*)$arg2, (const struct btf_type*)$arg3, $arg4, $arg5, $arg6, $arg7, $arg8, $arg9, $arg10, $arg11)")
    public static int btf_find_field_one(Ptr<runtime.btf> btf2, Ptr<btf_type> var, Ptr<btf_type> var_type, int var_idx, @Unsigned int off, @Unsigned int expected_size, @Unsigned int field_mask, Ptr<@Unsigned Integer> seen_mask, Ptr<btf_field_info> info2, int info_cnt, @Unsigned int level) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction(value="btf_find_next_decl_tag((const struct btf*)$arg1, (const struct btf_type*)$arg2, $arg3, (const u8*)$arg4, $arg5)")
    public static int btf_find_next_decl_tag(Ptr<runtime.btf> btf2, Ptr<btf_type> pt2, int comp_idx, String tag_key, int last_id) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction(value="btf_find_struct_field((const struct btf*)$arg1, (const struct btf_type*)$arg2, $arg3, $arg4, $arg5, $arg6)")
    public static int btf_find_struct_field(Ptr<runtime.btf> btf2, Ptr<btf_type> t, @Unsigned int field_mask, Ptr<btf_field_info> info2, int info_cnt, @Unsigned int level) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction(value="btf_find_struct_meta((const struct btf*)$arg1, $arg2)")
    public static Ptr<btf_struct_meta> btf_find_struct_meta(Ptr<runtime.btf> btf2, @Unsigned int btf_id) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction(value="btf_float_check_member($arg1, (const struct btf_type*)$arg2, (const struct btf_member*)$arg3, (const struct btf_type*)$arg4)")
    public static int btf_float_check_member(Ptr<btf_verifier_env> env, Ptr<btf_type> struct_type, Ptr<btf_member> member, Ptr<btf_type> member_type) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction(value="btf_float_check_meta($arg1, (const struct btf_type*)$arg2, $arg3)")
    public static int btf_float_check_meta(Ptr<btf_verifier_env> env, Ptr<btf_type> t, @Unsigned int meta_left) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction(value="btf_float_log($arg1, (const struct btf_type*)$arg2)")
    public static void btf_float_log(Ptr<btf_verifier_env> env, Ptr<btf_type> t) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void btf_free(Ptr<runtime.btf> btf2) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void btf_free_rcu(Ptr<misc.callback_head> rcu) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction(value="btf_func_check_meta($arg1, (const struct btf_type*)$arg2, $arg3)")
    public static int btf_func_check_meta(Ptr<btf_verifier_env> env, Ptr<btf_type> t, @Unsigned int meta_left) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction(value="btf_func_proto_check($arg1, (const struct btf_type*)$arg2)")
    public static int btf_func_proto_check(Ptr<btf_verifier_env> env, Ptr<btf_type> t) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction(value="btf_func_proto_check_meta($arg1, (const struct btf_type*)$arg2, $arg3)")
    public static int btf_func_proto_check_meta(Ptr<btf_verifier_env> env, Ptr<btf_type> t, @Unsigned int meta_left) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction(value="btf_func_proto_log($arg1, (const struct btf_type*)$arg2)")
    public static void btf_func_proto_log(Ptr<btf_verifier_env> env, Ptr<btf_type> t) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction(value="btf_func_resolve($arg1, (const struct resolve_vertex*)$arg2)")
    public static int btf_func_resolve(Ptr<btf_verifier_env> env, Ptr<misc.resolve_vertex> v) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction(value="btf_fwd_check_meta($arg1, (const struct btf_type*)$arg2, $arg3)")
    public static int btf_fwd_check_meta(Ptr<btf_verifier_env> env, Ptr<btf_type> t, @Unsigned int meta_left) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction(value="btf_fwd_type_log($arg1, (const struct btf_type*)$arg2)")
    public static void btf_fwd_type_log(Ptr<btf_verifier_env> env, Ptr<btf_type> t) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction(value="btf_generic_check_kflag_member($arg1, (const struct btf_type*)$arg2, (const struct btf_member*)$arg3, (const struct btf_type*)$arg4)")
    public static int btf_generic_check_kflag_member(Ptr<btf_verifier_env> env, Ptr<btf_type> struct_type, Ptr<btf_member> member, Ptr<btf_type> member_type) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void btf_get(Ptr<runtime.btf> btf2) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static Ptr<runtime.btf> btf_get_by_fd(int fd2) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int btf_get_fd_by_id(@Unsigned int id) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction(value="btf_get_field_type((const struct btf*)$arg1, (const struct btf_type*)$arg2, $arg3, $arg4, $arg5, $arg6)")
    public static int btf_get_field_type(Ptr<runtime.btf> btf2, Ptr<btf_type> var_type, @Unsigned int field_mask, Ptr<@Unsigned Integer> seen_mask, Ptr<Integer> align, Ptr<Integer> sz) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction(value="btf_get_info_by_fd((const struct btf*)$arg1, (const union bpf_attr*)$arg2, $arg3)")
    public static int btf_get_info_by_fd(Ptr<runtime.btf> btf2, Ptr<BpfDefinitions.bpf_attr> attr2, Ptr<BpfDefinitions.bpf_attr> uattr) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction(value="btf_get_module_btf((const struct module*)$arg1)")
    public static Ptr<runtime.btf> btf_get_module_btf(Ptr<runtime.module> module2) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction(value="((const u8*)btf_get_name((const struct btf*)$arg1))")
    public static String btf_get_name(Ptr<runtime.btf> btf2) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction(value="btf_get_ptr_to_btf_id($arg1, $arg2, (const struct btf*)$arg3, (const struct btf_type*)$arg4)")
    public static int btf_get_ptr_to_btf_id(Ptr<BpfDefinitions.bpf_verifier_log> log, int arg_idx, Ptr<runtime.btf> btf2, Ptr<btf_type> t) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction(value="btf_id_cmp_func((const void*)$arg1, (const void*)$arg2)")
    public static int btf_id_cmp_func(Ptr<?> a, Ptr<?> b) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void btf_int128_print(Ptr<btf_show> show, Ptr<?> data) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction(value="btf_int_check_kflag_member($arg1, (const struct btf_type*)$arg2, (const struct btf_member*)$arg3, (const struct btf_type*)$arg4)")
    public static int btf_int_check_kflag_member(Ptr<btf_verifier_env> env, Ptr<btf_type> struct_type, Ptr<btf_member> member, Ptr<btf_type> member_type) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction(value="btf_int_check_member($arg1, (const struct btf_type*)$arg2, (const struct btf_member*)$arg3, (const struct btf_type*)$arg4)")
    public static int btf_int_check_member(Ptr<btf_verifier_env> env, Ptr<btf_type> struct_type, Ptr<btf_member> member, Ptr<btf_type> member_type) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction(value="btf_int_check_meta($arg1, (const struct btf_type*)$arg2, $arg3)")
    public static int btf_int_check_meta(Ptr<btf_verifier_env> env, Ptr<btf_type> t, @Unsigned int meta_left) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction(value="btf_int_log($arg1, (const struct btf_type*)$arg2)")
    public static void btf_int_log(Ptr<btf_verifier_env> env, Ptr<btf_type> t) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction(value="btf_int_show((const struct btf*)$arg1, (const struct btf_type*)$arg2, $arg3, $arg4, $arg5, $arg6)")
    public static void btf_int_show(Ptr<runtime.btf> btf2, Ptr<btf_type> t, @Unsigned int type_id, Ptr<?> data, char bits_offset, Ptr<btf_show> show) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction(value="btf_is_kernel((const struct btf*)$arg1)")
    public static boolean btf_is_kernel(Ptr<runtime.btf> btf2) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction(value="btf_is_module((const struct btf*)$arg1)")
    public static boolean btf_is_module(Ptr<runtime.btf> btf2) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction(value="btf_is_prog_ctx_type($arg1, (const struct btf*)$arg2, (const struct btf_type*)$arg3, $arg4, $arg5)")
    public static boolean btf_is_prog_ctx_type(Ptr<BpfDefinitions.bpf_verifier_log> log, Ptr<runtime.btf> btf2, Ptr<btf_type> t, BpfDefinitions.bpf_prog_type prog_type, int arg2) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction(value="btf_is_projection_of((const u8*)$arg1, (const u8*)$arg2)")
    public static boolean btf_is_projection_of(String pname, String tname) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction(value="btf_is_vmlinux((const struct btf*)$arg1)")
    public static boolean btf_is_vmlinux(Ptr<runtime.btf> btf2) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction(value="btf_kfunc_id_set_contains((const struct btf*)$arg1, $arg2, (const struct bpf_prog*)$arg3)")
    public static @NotUsableInJava Ptr<@Unsigned Integer> btf_kfunc_id_set_contains(Ptr<runtime.btf> btf2, @Unsigned int kfunc_btf_id, Ptr<BpfDefinitions.bpf_prog> prog) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction(value="btf_kfunc_is_modify_return((const struct btf*)$arg1, $arg2, (const struct bpf_prog*)$arg3)")
    public static @NotUsableInJava Ptr<@Unsigned Integer> btf_kfunc_is_modify_return(Ptr<runtime.btf> btf2, @Unsigned int kfunc_btf_id, Ptr<BpfDefinitions.bpf_prog> prog) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction(value="btf_member_is_reg_int((const struct btf*)$arg1, (const struct btf_type*)$arg2, (const struct btf_member*)$arg3, $arg4, $arg5)")
    public static boolean btf_member_is_reg_int(Ptr<runtime.btf> btf2, Ptr<btf_type> s2, Ptr<btf_member> m, @Unsigned int expected_offset, @Unsigned int expected_size) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction(value="btf_modifier_check_kflag_member($arg1, (const struct btf_type*)$arg2, (const struct btf_member*)$arg3, (const struct btf_type*)$arg4)")
    public static int btf_modifier_check_kflag_member(Ptr<btf_verifier_env> env, Ptr<btf_type> struct_type, Ptr<btf_member> member, Ptr<btf_type> member_type) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction(value="btf_modifier_check_member($arg1, (const struct btf_type*)$arg2, (const struct btf_member*)$arg3, (const struct btf_type*)$arg4)")
    public static int btf_modifier_check_member(Ptr<btf_verifier_env> env, Ptr<btf_type> struct_type, Ptr<btf_member> member, Ptr<btf_type> member_type) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction(value="btf_modifier_resolve($arg1, (const struct resolve_vertex*)$arg2)")
    public static int btf_modifier_resolve(Ptr<btf_verifier_env> env, Ptr<misc.resolve_vertex> v) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction(value="btf_modifier_show((const struct btf*)$arg1, (const struct btf_type*)$arg2, $arg3, $arg4, $arg5, $arg6)")
    public static void btf_modifier_show(Ptr<runtime.btf> btf2, Ptr<btf_type> t, @Unsigned int type_id, Ptr<?> data, char bits_offset, Ptr<btf_show> show) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int btf_module_init() {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int btf_module_notify(Ptr<misc.notifier_block> nb, @Unsigned long op, Ptr<?> module2) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static @OriginalName(value="ssize_t") long btf_module_read(Ptr<runtime.file> file2, Ptr<runtime.kobject> kobj, Ptr<misc.bin_attribute> bin_attr, String buf, @OriginalName(value="loff_t") long off, @Unsigned long len) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction(value="((const u8*)btf_name_by_offset((const struct btf*)$arg1, $arg2))")
    public static String btf_name_by_offset(Ptr<runtime.btf> btf2, @Unsigned int offset) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction(value="btf_name_valid_identifier((const struct btf*)$arg1, $arg2)")
    public static boolean btf_name_valid_identifier(Ptr<runtime.btf> btf2, @Unsigned int offset) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction(value="btf_nested_type_is_trusted($arg1, (const struct bpf_reg_state*)$arg2, (const u8*)$arg3, $arg4, (const u8*)$arg5)")
    public static boolean btf_nested_type_is_trusted(Ptr<BpfDefinitions.bpf_verifier_log> log, Ptr<BpfDefinitions.bpf_reg_state> reg, String field_name, @Unsigned int btf_id, String suffix) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction(value="btf_new_fd((const union bpf_attr*)$arg1, $arg2, $arg3)")
    public static int btf_new_fd(Ptr<BpfDefinitions.bpf_attr> attr2, @OriginalName(value="bpfptr_t") misc.sockptr_t uattr, @Unsigned int uattr_size) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction(value="btf_nr_types((const struct btf*)$arg1)")
    public static @Unsigned int btf_nr_types(Ptr<runtime.btf> btf2) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction(value="btf_obj_id((const struct btf*)$arg1)")
    public static @Unsigned int btf_obj_id(Ptr<runtime.btf> btf2) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction(value="btf_param_match_suffix((const struct btf*)$arg1, (const struct btf_param*)$arg2, (const u8*)$arg3)")
    public static boolean btf_param_match_suffix(Ptr<runtime.btf> btf2, Ptr<btf_param> arg2, String suffix) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction(value="btf_parse((const union bpf_attr*)$arg1, $arg2, $arg3)")
    public static Ptr<runtime.btf> btf_parse(Ptr<BpfDefinitions.bpf_attr> attr2, @OriginalName(value="bpfptr_t") misc.sockptr_t uattr, @Unsigned int uattr_size) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction(value="btf_parse_base($arg1, (const u8*)$arg2, $arg3, $arg4)")
    public static Ptr<runtime.btf> btf_parse_base(Ptr<btf_verifier_env> env, String name, Ptr<?> data, @Unsigned int data_size) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction(value="btf_parse_fields((const struct btf*)$arg1, (const struct btf_type*)$arg2, $arg3, $arg4)")
    public static Ptr<btf_record> btf_parse_fields(Ptr<runtime.btf> btf2, Ptr<btf_type> t, @Unsigned int field_mask, @Unsigned int value_size) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction(value="btf_parse_graph_root((const struct btf*)$arg1, $arg2, $arg3, (const u8*)$arg4, $arg5)")
    public static int btf_parse_graph_root(Ptr<runtime.btf> btf2, Ptr<btf_field> field, Ptr<btf_field_info> info2, String node_type_name, @Unsigned long node_type_align) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int btf_parse_hdr(Ptr<btf_verifier_env> env) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction(value="btf_parse_kptr((const struct btf*)$arg1, $arg2, $arg3)")
    public static int btf_parse_kptr(Ptr<runtime.btf> btf2, Ptr<btf_field> field, Ptr<btf_field_info> info2) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction(value="btf_parse_module((const u8*)$arg1, (const void*)$arg2, $arg3, $arg4, $arg5)")
    public static Ptr<runtime.btf> btf_parse_module(String module_name, Ptr<?> data, @Unsigned int data_size, Ptr<?> base_data, @Unsigned int base_data_size) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int btf_parse_str_sec(Ptr<btf_verifier_env> env) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static Ptr<runtime.btf> btf_parse_vmlinux() {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction(value="btf_populate_kfunc_set($arg1, $arg2, (const struct btf_kfunc_id_set*)$arg3)")
    public static int btf_populate_kfunc_set(Ptr<runtime.btf> btf2, btf_kfunc_hook hook, Ptr<btf_kfunc_id_set> kset2) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int btf_prepare_func_args(Ptr<BpfDefinitions.bpf_verifier_env> env, int subprog) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction(value="btf_ptr_check_member($arg1, (const struct btf_type*)$arg2, (const struct btf_member*)$arg3, (const struct btf_type*)$arg4)")
    public static int btf_ptr_check_member(Ptr<btf_verifier_env> env, Ptr<btf_type> struct_type, Ptr<btf_member> member, Ptr<btf_type> member_type) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction(value="btf_ptr_resolve($arg1, (const struct resolve_vertex*)$arg2)")
    public static int btf_ptr_resolve(Ptr<btf_verifier_env> env, Ptr<misc.resolve_vertex> v) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction(value="btf_ptr_show((const struct btf*)$arg1, (const struct btf_type*)$arg2, $arg3, $arg4, $arg5, $arg6)")
    public static void btf_ptr_show(Ptr<runtime.btf> btf2, Ptr<btf_type> t, @Unsigned int type_id, Ptr<?> data, char bits_offset, Ptr<btf_show> show) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void btf_put(Ptr<runtime.btf> btf2) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction(value="btf_ref_type_check_meta($arg1, (const struct btf_type*)$arg2, $arg3)")
    public static int btf_ref_type_check_meta(Ptr<btf_verifier_env> env, Ptr<btf_type> t, @Unsigned int meta_left) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction(value="btf_ref_type_log($arg1, (const struct btf_type*)$arg2)")
    public static void btf_ref_type_log(Ptr<btf_verifier_env> env, Ptr<btf_type> t) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int btf_release(Ptr<runtime.inode> inode2, Ptr<runtime.file> filp) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int btf_repeat_fields(Ptr<btf_field_info> info2, int info_cnt, @Unsigned int field_cnt, @Unsigned int repeat_cnt, @Unsigned int elem_size) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction(value="btf_resolve($arg1, (const struct btf_type*)$arg2, $arg3)")
    public static int btf_resolve(Ptr<btf_verifier_env> env, Ptr<btf_type> t, @Unsigned int type_id) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction(value="((const struct btf_type*)btf_resolve_size((const struct btf*)$arg1, (const struct btf_type*)$arg2, $arg3))")
    public static Ptr<btf_type> btf_resolve_size(Ptr<runtime.btf> btf2, Ptr<btf_type> type2, Ptr<@Unsigned Integer> type_size) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction(value="btf_resolve_valid($arg1, (const struct btf_type*)$arg2, $arg3)")
    public static boolean btf_resolve_valid(Ptr<btf_verifier_env> env, Ptr<btf_type> t, @Unsigned int type_id) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction(value="btf_sec_info_cmp((const void*)$arg1, (const void*)$arg2)")
    public static int btf_sec_info_cmp(Ptr<?> a, Ptr<?> b) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction(value="btf_seq_show($arg1, (const u8*)$arg2, $arg3)")
    public static void btf_seq_show(Ptr<btf_show> show, String fmt, Ptr<misc.__va_list_tag> args) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction(value="btf_set_base_btf($arg1, (const struct btf*)$arg2)")
    public static void btf_set_base_btf(Ptr<runtime.btf> btf2, Ptr<runtime.btf> base_btf) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction(value="btf_show_end_aggr_type($arg1, (const u8*)$arg2)")
    public static void btf_show_end_aggr_type(Ptr<btf_show> show, String suffix) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction(value="((const u8*)btf_show_name($arg1))")
    public static String btf_show_name(Ptr<btf_show> show) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction(value="btf_show_obj_safe($arg1, (const struct btf_type*)$arg2, $arg3)")
    public static Ptr<?> btf_show_obj_safe(Ptr<btf_show> show, Ptr<btf_type> t, Ptr<?> data) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction(value="btf_show_start_aggr_type($arg1, (const struct btf_type*)$arg2, $arg3, $arg4)")
    public static Ptr<?> btf_show_start_aggr_type(Ptr<btf_show> show, Ptr<btf_type> t, @Unsigned int type_id, Ptr<?> data) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction(value="btf_snprintf_show($arg1, (const u8*)$arg2, $arg3)")
    public static void btf_snprintf_show(Ptr<btf_show> show, String fmt, Ptr<misc.__va_list_tag> args) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction(value="((const u8*)btf_str_by_offset((const struct btf*)$arg1, $arg2))")
    public static String btf_str_by_offset(Ptr<runtime.btf> btf2, @Unsigned int offset) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction(value="btf_struct_access($arg1, (const struct bpf_reg_state*)$arg2, $arg3, $arg4, $arg5, $arg6, $arg7, (const u8**)$arg8)")
    public static int btf_struct_access(Ptr<BpfDefinitions.bpf_verifier_log> log, Ptr<BpfDefinitions.bpf_reg_state> reg, int off, int size, BpfDefinitions.bpf_access_type atype, Ptr<@Unsigned Integer> next_btf_id, Ptr<BpfDefinitions.bpf_type_flag> flag, Ptr<String> field_name) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction(value="btf_struct_check_member($arg1, (const struct btf_type*)$arg2, (const struct btf_member*)$arg3, (const struct btf_type*)$arg4)")
    public static int btf_struct_check_member(Ptr<btf_verifier_env> env, Ptr<btf_type> struct_type, Ptr<btf_member> member, Ptr<btf_type> member_type) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction(value="btf_struct_check_meta($arg1, (const struct btf_type*)$arg2, $arg3)")
    public static int btf_struct_check_meta(Ptr<btf_verifier_env> env, Ptr<btf_type> t, @Unsigned int meta_left) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction(value="btf_struct_ids_match($arg1, (const struct btf*)$arg2, $arg3, $arg4, (const struct btf*)$arg5, $arg6, $arg7)")
    public static boolean btf_struct_ids_match(Ptr<BpfDefinitions.bpf_verifier_log> log, Ptr<runtime.btf> btf2, @Unsigned int id, int off, Ptr<runtime.btf> need_btf, @Unsigned int need_type_id, boolean strict) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction(value="btf_struct_log($arg1, (const struct btf_type*)$arg2)")
    public static void btf_struct_log(Ptr<btf_verifier_env> env, Ptr<btf_type> t) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction(value="btf_struct_resolve($arg1, (const struct resolve_vertex*)$arg2)")
    public static int btf_struct_resolve(Ptr<btf_verifier_env> env, Ptr<misc.resolve_vertex> v) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction(value="btf_struct_show((const struct btf*)$arg1, (const struct btf_type*)$arg2, $arg3, $arg4, $arg5, $arg6)")
    public static void btf_struct_show(Ptr<runtime.btf> btf2, Ptr<btf_type> t, @Unsigned int type_id, Ptr<?> data, char bits_offset, Ptr<btf_show> show) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction(value="btf_struct_walk($arg1, (const struct btf*)$arg2, (const struct btf_type*)$arg3, $arg4, $arg5, $arg6, $arg7, (const u8**)$arg8)")
    public static int btf_struct_walk(Ptr<BpfDefinitions.bpf_verifier_log> log, Ptr<runtime.btf> btf2, Ptr<btf_type> t, int off, int size, Ptr<@Unsigned Integer> next_btf_id, Ptr<BpfDefinitions.bpf_type_flag> flag, Ptr<String> field_name) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction(value="btf_try_get_module((const struct btf*)$arg1)")
    public static Ptr<runtime.module> btf_try_get_module(Ptr<runtime.btf> btf2) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction(value="((const struct btf_type*)btf_type_by_id((const struct btf*)$arg1, $arg2))")
    public static Ptr<btf_type> btf_type_by_id(Ptr<runtime.btf> btf2, @Unsigned int type_id) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction(value="((const struct btf_type*)btf_type_id_resolve((const struct btf*)$arg1, $arg2))")
    public static Ptr<btf_type> btf_type_id_resolve(Ptr<runtime.btf> btf2, Ptr<@Unsigned Integer> type_id) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction(value="((const struct btf_type*)btf_type_id_size((const struct btf*)$arg1, $arg2, $arg3))")
    public static Ptr<btf_type> btf_type_id_size(Ptr<runtime.btf> btf2, Ptr<@Unsigned Integer> type_id, Ptr<@Unsigned Integer> ret_size) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction(value="btf_type_ids_nocast_alias($arg1, (const struct btf*)$arg2, $arg3, (const struct btf*)$arg4, $arg5)")
    public static boolean btf_type_ids_nocast_alias(Ptr<BpfDefinitions.bpf_verifier_log> log, Ptr<runtime.btf> reg_btf, @Unsigned int reg_id, Ptr<runtime.btf> arg_btf, @Unsigned int arg_id) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction(value="btf_type_int_is_regular((const struct btf_type*)$arg1)")
    public static boolean btf_type_int_is_regular(Ptr<btf_type> t) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction(value="btf_type_is_void((const struct btf_type*)$arg1)")
    public static boolean btf_type_is_void(Ptr<btf_type> t) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction(value="((const u8*)btf_type_name((const struct btf*)$arg1, $arg2))")
    public static String btf_type_name(Ptr<runtime.btf> btf2, @Unsigned int id) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction(value="btf_type_needs_resolve((const struct btf_type*)$arg1)")
    public static boolean btf_type_needs_resolve(Ptr<btf_type> t) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction(value="((const struct btf_type*)btf_type_resolve_func_ptr((const struct btf*)$arg1, $arg2, $arg3))")
    public static Ptr<btf_type> btf_type_resolve_func_ptr(Ptr<runtime.btf> btf2, @Unsigned int id, Ptr<@Unsigned Integer> res_id) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction(value="((const struct btf_type*)btf_type_resolve_ptr((const struct btf*)$arg1, $arg2, $arg3))")
    public static Ptr<btf_type> btf_type_resolve_ptr(Ptr<runtime.btf> btf2, @Unsigned int id, Ptr<@Unsigned Integer> res_id) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction(value="btf_type_seq_show((const struct btf*)$arg1, $arg2, $arg3, $arg4)")
    public static void btf_type_seq_show(Ptr<runtime.btf> btf2, @Unsigned int type_id, Ptr<?> obj, Ptr<SeqDefinitions.seq_file> m) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction(value="btf_type_seq_show_flags((const struct btf*)$arg1, $arg2, $arg3, $arg4, $arg5)")
    public static int btf_type_seq_show_flags(Ptr<runtime.btf> btf2, @Unsigned int type_id, Ptr<?> obj, Ptr<SeqDefinitions.seq_file> m, @Unsigned long flags) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction(value="btf_type_show((const struct btf*)$arg1, $arg2, $arg3, $arg4)")
    public static void btf_type_show(Ptr<runtime.btf> btf2, @Unsigned int type_id, Ptr<?> obj, Ptr<btf_show> show) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction(value="((const struct btf_type*)btf_type_skip_modifiers((const struct btf*)$arg1, $arg2, $arg3))")
    public static Ptr<btf_type> btf_type_skip_modifiers(Ptr<runtime.btf> btf2, @Unsigned int id, Ptr<@Unsigned Integer> res_id) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction(value="btf_type_snprintf_show((const struct btf*)$arg1, $arg2, $arg3, $arg4, $arg5, $arg6)")
    public static int btf_type_snprintf_show(Ptr<runtime.btf> btf2, @Unsigned int type_id, Ptr<?> obj, String buf, int len, @Unsigned long flags) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction(value="((const u8*)btf_type_str((const struct btf_type*)$arg1))")
    public static String btf_type_str(Ptr<btf_type> t) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction(value="btf_types_are_same((const struct btf*)$arg1, $arg2, (const struct btf*)$arg3, $arg4)")
    public static boolean btf_types_are_same(Ptr<runtime.btf> btf1, @Unsigned int id1, Ptr<runtime.btf> btf2, @Unsigned int id2) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction(value="btf_validate_prog_ctx_type($arg1, (const struct btf*)$arg2, (const struct btf_type*)$arg3, $arg4, $arg5, $arg6)")
    public static int btf_validate_prog_ctx_type(Ptr<BpfDefinitions.bpf_verifier_log> log, Ptr<runtime.btf> btf2, Ptr<btf_type> t, int arg2, BpfDefinitions.bpf_prog_type prog_type, BpfDefinitions.bpf_attach_type attach_type) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction(value="btf_var_check_meta($arg1, (const struct btf_type*)$arg2, $arg3)")
    public static int btf_var_check_meta(Ptr<btf_verifier_env> env, Ptr<btf_type> t, @Unsigned int meta_left) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction(value="btf_var_log($arg1, (const struct btf_type*)$arg2)")
    public static void btf_var_log(Ptr<btf_verifier_env> env, Ptr<btf_type> t) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction(value="btf_var_resolve($arg1, (const struct resolve_vertex*)$arg2)")
    public static int btf_var_resolve(Ptr<btf_verifier_env> env, Ptr<misc.resolve_vertex> v) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction(value="btf_var_show((const struct btf*)$arg1, (const struct btf_type*)$arg2, $arg3, $arg4, $arg5, $arg6)")
    public static void btf_var_show(Ptr<runtime.btf> btf2, Ptr<btf_type> t, @Unsigned int type_id, Ptr<?> data, char bits_offset, Ptr<btf_show> show) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction(value="btf_verifier_log($arg1, (const u8*)$arg2, $arg3_)")
    public static void btf_verifier_log(Ptr<btf_verifier_env> env, String fmt, Object ... param2) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction(value="btf_verifier_log_member($arg1, (const struct btf_type*)$arg2, (const struct btf_member*)$arg3, (const u8*)$arg4, $arg5_)")
    public static void btf_verifier_log_member(Ptr<btf_verifier_env> env, Ptr<btf_type> struct_type, Ptr<btf_member> member, String fmt, Object ... param4) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction(value="btf_verifier_log_vsi($arg1, (const struct btf_type*)$arg2, (const struct btf_var_secinfo*)$arg3, (const u8*)$arg4, $arg5_)")
    public static void btf_verifier_log_vsi(Ptr<btf_verifier_env> env, Ptr<btf_type> datasec_type, Ptr<btf_var_secinfo> vsi, String fmt, Object ... param4) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int btf_vmlinux_init() {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static @OriginalName(value="ssize_t") long btf_vmlinux_read(Ptr<runtime.file> file2, Ptr<runtime.kobject> kobj, Ptr<misc.bin_attribute> bin_attr, String buf, @OriginalName(value="loff_t") long off, @Unsigned long len) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction(value="((const struct btf_type*)btf_find_func_proto((const u8*)$arg1, $arg2))")
    public static Ptr<btf_type> btf_find_func_proto(String func_name, Ptr<Ptr<runtime.btf>> btf_p) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction(value="((const struct btf_member*)btf_find_struct_member($arg1, (const struct btf_type*)$arg2, (const u8*)$arg3, $arg4))")
    public static Ptr<btf_member> btf_find_struct_member(Ptr<runtime.btf> btf2, Ptr<btf_type> type2, String member_name, Ptr<@Unsigned Integer> anon_offset) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction(value="((const struct btf_param*)btf_get_func_param((const struct btf_type*)$arg1, $arg2))")
    public static Ptr<btf_param> btf_get_func_param(Ptr<btf_type> func_proto, Ptr<Integer> nr) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction(value="__btf_type_is_scalar_struct($arg1, (const struct btf*)$arg2, (const struct btf_type*)$arg3, $arg4)")
    public static boolean __btf_type_is_scalar_struct(Ptr<BpfDefinitions.bpf_verifier_env> env, Ptr<runtime.btf> btf2, Ptr<btf_type> t, int rec) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int btf_check_subprog_call(Ptr<BpfDefinitions.bpf_verifier_env> env, int subprog, Ptr<BpfDefinitions.bpf_reg_state> regs) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int btf_field_iter_init(Ptr<btf_field_iter> it, Ptr<btf_type> t, btf_field_iter_kind iter_kind) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static @NotUsableInJava Ptr<@Unsigned Integer> btf_field_iter_next(Ptr<btf_field_iter> it) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction(value="btf_record_dup((const struct btf_record*)$arg1)")
    public static Ptr<btf_record> btf_record_dup(Ptr<btf_record> rec) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction(value="btf_record_equal((const struct btf_record*)$arg1, (const struct btf_record*)$arg2)")
    public static boolean btf_record_equal(Ptr<btf_record> rec_a, Ptr<btf_record> rec_b) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction(value="btf_record_find((const struct btf_record*)$arg1, $arg2, $arg3)")
    public static Ptr<btf_field> btf_record_find(Ptr<btf_record> rec, @Unsigned int offset, @Unsigned int field_mask) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void btf_record_free(Ptr<btf_record> rec) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int btf_relocate_map_distilled_base(Ptr<btf_relocate> r) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int btf_relocate_rewrite_strs(Ptr<btf_relocate> r, @Unsigned int i) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int btf_relocate_rewrite_type_id(Ptr<btf_relocate> r, @Unsigned int i) {
        throw new MethodIsBPFRelatedFunction();
    }

    @Type(noCCodeGeneration=true, cType="struct { unsigned int id; unsigned int flags; }")
    @NotUsableInJava
    public static class AnonymousType1039759545C51
    extends Struct {
        public @Unsigned int id;
        public @Unsigned int flags;
    }

    @Type(noCCodeGeneration=true, cType="struct btf_ptr")
    @NotUsableInJava
    public static class btf_ptr
    extends Struct {
        public Ptr<?> ptr;
        public @Unsigned int type_id;
        public @Unsigned int flags;
    }

    @Type(noCCodeGeneration=true, cType="struct btf_anon_stack")
    @NotUsableInJava
    public static class btf_anon_stack
    extends Struct {
        public @Unsigned int tid;
        public @Unsigned int offset;
    }

    @Type(noCCodeGeneration=true, cType="struct btf_module")
    @NotUsableInJava
    public static class btf_module
    extends Struct {
        public ListDefinitions.list_head list;
        public Ptr<runtime.module> module;
        public Ptr<runtime.btf> btf;
        public Ptr<misc.bin_attribute> sysfs_attr;
        public int flags;
    }

    @Type(noCCodeGeneration=true, cType="struct btf_show_snprintf")
    @NotUsableInJava
    public static class btf_show_snprintf
    extends Struct {
        public btf_show show;
        public int len_left;
        public int len;
    }

    @Type(noCCodeGeneration=true, cType="enum btf_arg_tag")
    public static enum btf_arg_tag implements Enum<btf_arg_tag>,
    TypedEnum<btf_arg_tag, Integer>
    {
        ARG_TAG_CTX,
        ARG_TAG_NONNULL,
        ARG_TAG_TRUSTED,
        ARG_TAG_NULLABLE,
        ARG_TAG_ARENA;

    }

    @Type(noCCodeGeneration=true, cType="struct btf_field_info")
    @NotUsableInJava
    public static class btf_field_info
    extends Struct {
        public btf_field_type type;
        public @Unsigned int off;
        @InlineUnion(value=29472)
        public @InlineUnion(value=29472) misc.kptr_of_anon_member_of_btf_field_info kptr;
        @InlineUnion(value=29472)
        public @InlineUnion(value=29472) misc.graph_root_of_anon_member_of_btf_field_info graph_root;
    }

    @Type(noCCodeGeneration=true, cType="struct btf_kind_operations")
    @NotUsableInJava
    public static class btf_kind_operations
    extends Struct {
        public Ptr<?> check_meta;
        public Ptr<?> resolve;
        public Ptr<?> check_member;
        public Ptr<?> check_kflag_member;
        public Ptr<?> log_details;
        public Ptr<?> show;
    }

    @Type(noCCodeGeneration=true, cType="struct btf_show")
    @NotUsableInJava
    public static class btf_show
    extends Struct {
        public @Unsigned long flags;
        public Ptr<?> target;
        public Ptr<?> showfn;
        public Ptr<runtime.btf> btf;
        public misc.state_of_btf_show state;
        public ObjDefinitions.obj_of_btf_show obj;
    }

    @Type(noCCodeGeneration=true, cType="struct btf_verifier_env")
    @NotUsableInJava
    public static class btf_verifier_env
    extends Struct {
        public Ptr<runtime.btf> btf;
        public Ptr<Character> visit_states;
        public misc.resolve_vertex @Size(value=32) [] stack;
        public BpfDefinitions.bpf_verifier_log log;
        public @Unsigned int log_type_id;
        public @Unsigned int top_stack;
        public misc.verifier_phase phase;
        public misc.resolve_mode resolve_mode;
    }

    @Type(noCCodeGeneration=true, cType="struct btf_sec_info")
    @NotUsableInJava
    public static class btf_sec_info
    extends Struct {
        public @Unsigned int off;
        public @Unsigned int len;
    }

    @Type(noCCodeGeneration=true, cType="struct btf_struct_ops_tab")
    @NotUsableInJava
    public static class btf_struct_ops_tab
    extends Struct {
        public @Unsigned int cnt;
        public @Unsigned int capacity;
        public BpfDefinitions.bpf_struct_ops_desc @Size(value=0) [] ops;
    }

    @Type(noCCodeGeneration=true, cType="struct btf_id_dtor_kfunc_tab")
    @NotUsableInJava
    public static class btf_id_dtor_kfunc_tab
    extends Struct {
        public @Unsigned int cnt;
        public btf_id_dtor_kfunc @Size(value=0) [] dtors;
    }

    @Type(noCCodeGeneration=true, cType="struct btf_kfunc_set_tab")
    @NotUsableInJava
    public static class btf_kfunc_set_tab
    extends Struct {
        public Ptr<btf_id_set8> @Size(value=14) [] sets;
        public btf_kfunc_hook_filter @Size(value=14) [] hook_filters;
    }

    @Type(noCCodeGeneration=true, cType="struct btf_kfunc_hook_filter")
    @NotUsableInJava
    public static class btf_kfunc_hook_filter
    extends Struct {
        public @OriginalName(value="btf_kfunc_filter_t") Ptr<?> @Size(value=16) [] filters;
        public @Unsigned int nr_filters;
    }

    @Type(noCCodeGeneration=true, cType="enum btf_kfunc_hook")
    public static enum btf_kfunc_hook implements Enum<btf_kfunc_hook>,
    TypedEnum<btf_kfunc_hook, Integer>
    {
        BTF_KFUNC_HOOK_COMMON,
        BTF_KFUNC_HOOK_XDP,
        BTF_KFUNC_HOOK_TC,
        BTF_KFUNC_HOOK_STRUCT_OPS,
        BTF_KFUNC_HOOK_TRACING,
        BTF_KFUNC_HOOK_SYSCALL,
        BTF_KFUNC_HOOK_FMODRET,
        BTF_KFUNC_HOOK_CGROUP,
        BTF_KFUNC_HOOK_SCHED_ACT,
        BTF_KFUNC_HOOK_SK_SKB,
        BTF_KFUNC_HOOK_SOCKET_FILTER,
        BTF_KFUNC_HOOK_LWT,
        BTF_KFUNC_HOOK_NETFILTER,
        BTF_KFUNC_HOOK_KPROBE,
        BTF_KFUNC_HOOK_MAX;

    }

    @Type(noCCodeGeneration=true, cType="struct btf_struct_metas")
    @NotUsableInJava
    public static class btf_struct_metas
    extends Struct {
        public @Unsigned int cnt;
        public btf_struct_meta @Size(value=0) [] types;
    }

    @Type(noCCodeGeneration=true, cType="struct btf_id_dtor_kfunc")
    @NotUsableInJava
    public static class btf_id_dtor_kfunc
    extends Struct {
        public @Unsigned int btf_id;
        public @Unsigned int kfunc_btf_id;
    }

    @Type(noCCodeGeneration=true, cType="struct btf_id_set")
    @NotUsableInJava
    public static class btf_id_set
    extends Struct {
        public @Unsigned int cnt;
        public @Unsigned int @Size(value=0) [] ids;
    }

    @Type(noCCodeGeneration=true, cType="struct btf_enum64")
    @NotUsableInJava
    public static class btf_enum64
    extends Struct {
        public @Unsigned int name_off;
        public @Unsigned int val_lo32;
        public @Unsigned int val_hi32;
    }

    @Type(noCCodeGeneration=true, cType="struct btf_decl_tag")
    @NotUsableInJava
    public static class btf_decl_tag
    extends Struct {
        public int component_idx;
    }

    @Type(noCCodeGeneration=true, cType="struct btf_var_secinfo")
    @NotUsableInJava
    public static class btf_var_secinfo
    extends Struct {
        public @Unsigned int type;
        public @Unsigned int offset;
        public @Unsigned int size;
    }

    @Type(noCCodeGeneration=true, cType="struct btf_var")
    @NotUsableInJava
    public static class btf_var
    extends Struct {
        public @Unsigned int linkage;
    }

    @Type(noCCodeGeneration=true, cType="enum btf_func_linkage")
    public static enum btf_func_linkage implements Enum<btf_func_linkage>,
    TypedEnum<btf_func_linkage, Integer>
    {
        BTF_FUNC_STATIC,
        BTF_FUNC_GLOBAL,
        BTF_FUNC_EXTERN;

    }

    @Type(noCCodeGeneration=true, cType="struct btf_enum")
    @NotUsableInJava
    public static class btf_enum
    extends Struct {
        public @Unsigned int name_off;
        public int val;
    }

    @Type(noCCodeGeneration=true, cType="struct btf_name_info")
    @NotUsableInJava
    public static class btf_name_info
    extends Struct {
        public String name;
        public boolean needs_size;
        public @Unsigned int size;
        public @Unsigned int id;
    }

    @Type(noCCodeGeneration=true, cType="struct btf_relocate")
    @NotUsableInJava
    public static class btf_relocate
    extends Struct {
        public Ptr<runtime.btf> btf;
        public Ptr<runtime.btf> base_btf;
        public Ptr<runtime.btf> dist_base_btf;
        public @Unsigned int nr_base_types;
        public @Unsigned int nr_split_types;
        public @Unsigned int nr_dist_base_types;
        public int dist_str_len;
        public int base_str_len;
        public Ptr<@Unsigned Integer> id_map;
        public Ptr<@Unsigned Integer> str_map;
    }

    @Type(noCCodeGeneration=true, cType="struct btf_header")
    @NotUsableInJava
    public static class btf_header
    extends Struct {
        public @Unsigned short magic;
        public char version;
        public char flags;
        public @Unsigned int hdr_len;
        public @Unsigned int type_off;
        public @Unsigned int type_len;
        public @Unsigned int str_off;
        public @Unsigned int str_len;
    }

    @Type(noCCodeGeneration=true, cType="struct btf_field_iter")
    @NotUsableInJava
    public static class btf_field_iter
    extends Struct {
        public btf_field_desc desc;
        public Ptr<?> p;
        public int m_idx;
        public int off_idx;
        public int vlen;
    }

    @Type(noCCodeGeneration=true, cType="struct btf_field_desc")
    @NotUsableInJava
    public static class btf_field_desc
    extends Struct {
        public int t_off_cnt;
        public int @Size(value=2) [] t_offs;
        public int m_sz;
        public int m_off_cnt;
        public int @Size(value=1) [] m_offs;
    }

    @Type(noCCodeGeneration=true, cType="enum btf_field_iter_kind")
    public static enum btf_field_iter_kind implements Enum<btf_field_iter_kind>,
    TypedEnum<btf_field_iter_kind, Integer>
    {
        BTF_FIELD_ITER_IDS,
        BTF_FIELD_ITER_STRS;

    }

    @Type(noCCodeGeneration=true, cType="struct btf_param")
    @NotUsableInJava
    public static class btf_param
    extends Struct {
        public @Unsigned int name_off;
        public @Unsigned int type;
    }

    @Type(noCCodeGeneration=true, cType="struct btf_array")
    @NotUsableInJava
    public static class btf_array
    extends Struct {
        public @Unsigned int type;
        public @Unsigned int index_type;
        public @Unsigned int nelems;
    }

    @Type(noCCodeGeneration=true, cType="struct { enum bpf_reg_type reg_type; union { struct { struct btf *btf; unsigned int btf_id; }; unsigned int mem_size; }; }")
    @NotUsableInJava
    public static class btf_var_of_anon_member_of_bpf_insn_aux_data
    extends Struct {
        public BpfDefinitions.bpf_reg_type reg_type;
        @InlineUnion(value=7217)
        public  @InlineUnion(value=7217) AnonDefinitions.anon_member_of_anon_member_of_bpf_insn_access_aux_and_anon_member_of_anon_member_of_bpf_reg_state_and_anon_member_of_anon_member_of_btf_var_of_anon_member_of_bpf_insn_aux_data anon1$0;
        @InlineUnion(value=7217)
        public @InlineUnion(value=7217) @Unsigned int mem_size;
    }

    @Type(noCCodeGeneration=true, cType="struct btf_struct_meta")
    @NotUsableInJava
    public static class btf_struct_meta
    extends Struct {
        public @Unsigned int btf_id;
        public Ptr<btf_record> record;
    }

    @Type(noCCodeGeneration=true, cType="struct btf_kfunc_id_set")
    @NotUsableInJava
    public static class btf_kfunc_id_set
    extends Struct {
        public Ptr<runtime.module> owner;
        public Ptr<btf_id_set8> set;
        public @OriginalName(value="btf_kfunc_filter_t") Ptr<?> filter;
    }

    @Type(noCCodeGeneration=true, cType="struct btf_member")
    @NotUsableInJava
    public static class btf_member
    extends Struct {
        public @Unsigned int name_off;
        public @Unsigned int type;
        public @Unsigned int offset;
    }

    @Type(noCCodeGeneration=true, cType="struct btf_id_set8")
    @NotUsableInJava
    public static class btf_id_set8
    extends Struct {
        public @Unsigned int cnt;
        public @Unsigned int flags;
        public AnonymousType1039759545C51 @Size(value=0) [] pairs;
    }

    @Type(noCCodeGeneration=true, cType="struct btf_mod_pair")
    @NotUsableInJava
    public static class btf_mod_pair
    extends Struct {
        public Ptr<runtime.btf> btf;
        public Ptr<runtime.module> module;
    }

    @Type(noCCodeGeneration=true, cType="struct btf_func_model")
    @NotUsableInJava
    public static class btf_func_model
    extends Struct {
        public char ret_size;
        public char ret_flags;
        public char nr_args;
        public char @Size(value=12) [] arg_size;
        public char @Size(value=12) [] arg_flags;
    }

    @Type(noCCodeGeneration=true, cType="struct btf_field")
    @NotUsableInJava
    public static class btf_field
    extends Struct {
        public @Unsigned int offset;
        public @Unsigned int size;
        public btf_field_type type;
        @InlineUnion(value=1974)
        public @InlineUnion(value=1974) btf_field_kptr kptr;
        @InlineUnion(value=1974)
        public @InlineUnion(value=1974) btf_field_graph_root graph_root;
    }

    @Type(noCCodeGeneration=true, cType="struct btf_field_graph_root")
    @NotUsableInJava
    public static class btf_field_graph_root
    extends Struct {
        public Ptr<runtime.btf> btf;
        public @Unsigned int value_btf_id;
        public @Unsigned int node_offset;
        public Ptr<btf_record> value_rec;
    }

    @Type(noCCodeGeneration=true, cType="struct btf_field_kptr")
    @NotUsableInJava
    public static class btf_field_kptr
    extends Struct {
        public Ptr<runtime.btf> btf;
        public Ptr<runtime.module> module;
        public @OriginalName(value="btf_dtor_kfunc_t") Ptr<?> dtor;
        public @Unsigned int btf_id;
    }

    @Type(noCCodeGeneration=true, cType="enum btf_field_type")
    public static enum btf_field_type implements Enum<btf_field_type>,
    TypedEnum<btf_field_type, Integer>
    {
        BPF_SPIN_LOCK,
        BPF_TIMER,
        BPF_KPTR_UNREF,
        BPF_KPTR_REF,
        BPF_KPTR_PERCPU,
        BPF_KPTR,
        BPF_LIST_HEAD,
        BPF_LIST_NODE,
        BPF_RB_ROOT,
        BPF_RB_NODE,
        BPF_GRAPH_NODE,
        BPF_GRAPH_ROOT,
        BPF_REFCOUNT,
        BPF_WORKQUEUE;

    }

    @Type(noCCodeGeneration=true, cType="struct btf_record")
    @NotUsableInJava
    public static class btf_record
    extends Struct {
        public @Unsigned int cnt;
        public @Unsigned int field_mask;
        public int spin_lock_off;
        public int timer_off;
        public int wq_off;
        public int refcount_off;
        public btf_field @Size(value=0) [] fields;
    }

    @Type(noCCodeGeneration=true, cType="struct btf_type")
    @NotUsableInJava
    public static class btf_type
    extends Struct {
        public @Unsigned int name_off;
        public @Unsigned int info;
        @InlineUnion(value=1800)
        public @InlineUnion(value=1800) @Unsigned int size;
        @InlineUnion(value=1800)
        public @InlineUnion(value=1800) @Unsigned int type;
    }
}

