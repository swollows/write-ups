/*
 * Decompiled with CFR 0.153-SNAPSHOT (d6f6758-dirty).
 */
package me.bechberger.ebpf.runtime;

import me.bechberger.ebpf.annotations.InlineUnion;
import me.bechberger.ebpf.annotations.Size;
import me.bechberger.ebpf.annotations.Type;
import me.bechberger.ebpf.annotations.Unsigned;
import me.bechberger.ebpf.annotations.bpf.BuiltinBPFFunction;
import me.bechberger.ebpf.annotations.bpf.MethodIsBPFRelatedFunction;
import me.bechberger.ebpf.annotations.bpf.NotUsableInJava;
import me.bechberger.ebpf.runtime.FlowDefinitions;
import me.bechberger.ebpf.runtime.ListDefinitions;
import me.bechberger.ebpf.runtime.NetDefinitions;
import me.bechberger.ebpf.runtime.SeqDefinitions;
import me.bechberger.ebpf.runtime.runtime;
import me.bechberger.ebpf.type.Enum;
import me.bechberger.ebpf.type.Ptr;
import me.bechberger.ebpf.type.Struct;
import me.bechberger.ebpf.type.TypedEnum;

public final class VcapDefinitions {
    @NotUsableInJava
    @BuiltinBPFFunction
    public static boolean _vcap_rule_find_keysets(Ptr<vcap_rule_internal> ri, Ptr<vcap_keyset_list> matches) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int vcap_actionfield_count(Ptr<vcap_control> vctrl, vcap_type vt, vcap_actionfield_set actionset) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction(value="((const u8*)vcap_actionfield_name($arg1, $arg2))")
    public static String vcap_actionfield_name(Ptr<vcap_control> vctrl, vcap_action_field action) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction(value="((const struct vcap_typegroup*)vcap_actionfield_typegroup($arg1, $arg2, $arg3))")
    public static Ptr<vcap_typegroup> vcap_actionfield_typegroup(Ptr<vcap_control> vctrl, vcap_type vt, vcap_actionfield_set actionset) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction(value="((const struct vcap_field*)vcap_actionfields($arg1, $arg2, $arg3))")
    public static Ptr<vcap_field> vcap_actionfields(Ptr<vcap_control> vctrl, vcap_type vt, vcap_actionfield_set actionset) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction(value="((const struct vcap_set*)vcap_actionfieldset($arg1, $arg2, $arg3))")
    public static Ptr<vcap_set> vcap_actionfieldset(Ptr<vcap_control> vctrl, vcap_type vt, vcap_actionfield_set actionset) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction(value="((const u8*)vcap_actionset_name($arg1, $arg2))")
    public static String vcap_actionset_name(Ptr<vcap_control> vctrl, vcap_actionfield_set actionset) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int vcap_add_rule(Ptr<vcap_rule> rule) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int vcap_addr_keysets(Ptr<vcap_control> vctrl, Ptr<NetDefinitions.net_device> ndev, Ptr<vcap_admin> admin, int addr2, Ptr<vcap_keyset_list> kslist) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int vcap_admin_rule_count(Ptr<vcap_admin> admin, int cid) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static Ptr<vcap_rule> vcap_alloc_rule(Ptr<vcap_control> vctrl, Ptr<NetDefinitions.net_device> ndev, int vcap_chain_id, vcap_user user, @Unsigned short priority, @Unsigned int id) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int vcap_api_check(Ptr<vcap_control> ctrl) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static boolean vcap_bitarray_zero(int width, Ptr<Character> value) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int vcap_chain_id_to_lookup(Ptr<vcap_admin> admin, int cur_cid) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int vcap_chain_offset(Ptr<vcap_control> vctrl, int from_cid, int to_cid) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction(value="vcap_copy_from_client_actionfield($arg1, $arg2, (const struct vcap_client_actionfield*)$arg3)")
    public static void vcap_copy_from_client_actionfield(Ptr<vcap_rule> rule, Ptr<vcap_client_actionfield> dst, Ptr<vcap_client_actionfield> src) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction(value="vcap_copy_from_client_keyfield($arg1, $arg2, (const struct vcap_client_keyfield*)$arg3)")
    public static void vcap_copy_from_client_keyfield(Ptr<vcap_rule> rule, Ptr<vcap_client_keyfield> dst, Ptr<vcap_client_keyfield> src) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void vcap_copy_from_w32be(Ptr<Character> dst, Ptr<Character> src, int size, int width) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void vcap_copy_limited_actionfield(Ptr<Character> dstvalue, Ptr<Character> srcvalue, int width, int bytes) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void vcap_copy_limited_keyfield(Ptr<Character> dstvalue, Ptr<Character> dstmask, Ptr<Character> srcvalue, Ptr<Character> srcmask, int width, int bytes) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static Ptr<vcap_rule> vcap_copy_rule(Ptr<vcap_rule> erule) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void vcap_copy_to_client_actionfield(Ptr<vcap_rule_internal> ri, Ptr<vcap_client_actionfield> field, Ptr<Character> value, @Unsigned short width) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void vcap_copy_to_client_keyfield(Ptr<vcap_rule_internal> ri, Ptr<vcap_client_keyfield> field, Ptr<Character> value, Ptr<Character> mask, @Unsigned short width) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int vcap_decode_actionset(Ptr<vcap_rule_internal> ri) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void vcap_decode_field(Ptr<@Unsigned Integer> stream, Ptr<vcap_stream_iter> itr, int width, Ptr<Character> value) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int vcap_decode_keyset(Ptr<vcap_rule_internal> ri) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static Ptr<vcap_rule> vcap_decode_rule(Ptr<vcap_rule_internal> elem) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int vcap_del_rule(Ptr<vcap_control> vctrl, Ptr<NetDefinitions.net_device> ndev, @Unsigned int id) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int vcap_del_rules(Ptr<vcap_control> vctrl, Ptr<vcap_admin> admin) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int vcap_disable(Ptr<vcap_control> vctrl, Ptr<NetDefinitions.net_device> ndev, @Unsigned long cookie) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static Ptr<vcap_rule_internal> vcap_dup_rule(Ptr<vcap_rule_internal> ri, boolean full) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int vcap_enable(Ptr<vcap_control> vctrl, Ptr<NetDefinitions.net_device> ndev, @Unsigned long cookie, int src_cid, int dst_cid) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int vcap_enable_lookups(Ptr<vcap_control> vctrl, Ptr<NetDefinitions.net_device> ndev, int src_cid, int dst_cid, @Unsigned long cookie, boolean enable) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction(value="vcap_encode_field($arg1, $arg2, $arg3, (const u8*)$arg4)")
    public static void vcap_encode_field(Ptr<@Unsigned Integer> stream, Ptr<vcap_stream_iter> itr, int width, Ptr<Character> value) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int vcap_encode_rule_actionset(Ptr<vcap_rule_internal> ri) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int vcap_encode_rule_keyset(Ptr<vcap_rule_internal> ri) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction(value="vcap_encode_typegroups($arg1, $arg2, (const struct vcap_typegroup*)$arg3, $arg4)")
    public static void vcap_encode_typegroups(Ptr<@Unsigned Integer> stream, int sw_width, Ptr<vcap_typegroup> tg, boolean mask) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void vcap_erase_cache(Ptr<vcap_rule_internal> ri) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int vcap_filter_rule_keys(Ptr<vcap_rule> rule, Ptr<vcap_key_field> keylist, int length, boolean drop_unsupported) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static Ptr<vcap_client_actionfield> vcap_find_actionfield(Ptr<vcap_rule> rule, vcap_action_field act) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static Ptr<vcap_admin> vcap_find_admin(Ptr<vcap_control> vctrl, int cid) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int vcap_find_keystream_keysets(Ptr<vcap_control> vctrl, vcap_type vt, Ptr<@Unsigned Integer> keystream, Ptr<@Unsigned Integer> mskstream, boolean mask, int sw_max, Ptr<vcap_keyset_list> kslist) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void vcap_free_rule(Ptr<vcap_rule> rule) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static Ptr<vcap_rule> vcap_get_rule(Ptr<vcap_control> vctrl, @Unsigned int id) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int vcap_get_rule_count_by_cookie(Ptr<vcap_control> vctrl, Ptr<vcap_counter> ctr, @Unsigned long cookie) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int vcap_insert_rule(Ptr<vcap_rule_internal> ri, Ptr<vcap_rule_move> move) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static boolean vcap_is_last_chain(Ptr<vcap_control> vctrl, int cid, boolean ingress) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static boolean vcap_is_next_lookup(Ptr<vcap_control> vctrl, int src_cid, int dst_cid) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction(value="vcap_iter_init($arg1, $arg2, (const struct vcap_typegroup*)$arg3, $arg4)")
    public static void vcap_iter_init(Ptr<vcap_stream_iter> itr, int sw_width, Ptr<vcap_typegroup> tg, @Unsigned int offset) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void vcap_iter_next(Ptr<vcap_stream_iter> itr) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction(value="vcap_iter_set($arg1, $arg2, (const struct vcap_typegroup*)$arg3, $arg4)")
    public static void vcap_iter_set(Ptr<vcap_stream_iter> itr, int sw_width, Ptr<vcap_typegroup> tg, @Unsigned int offset) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void vcap_iter_update(Ptr<vcap_stream_iter> itr) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int vcap_keyfield_count(Ptr<vcap_control> vctrl, vcap_type vt, vcap_keyfield_set keyset) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction(value="((const u8*)vcap_keyfield_name($arg1, $arg2))")
    public static String vcap_keyfield_name(Ptr<vcap_control> vctrl, vcap_key_field key2) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction(value="((const struct vcap_typegroup*)vcap_keyfield_typegroup($arg1, $arg2, $arg3))")
    public static Ptr<vcap_typegroup> vcap_keyfield_typegroup(Ptr<vcap_control> vctrl, vcap_type vt, vcap_keyfield_set keyset) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction(value="((const struct vcap_field*)vcap_keyfields($arg1, $arg2, $arg3))")
    public static Ptr<vcap_field> vcap_keyfields(Ptr<vcap_control> vctrl, vcap_type vt, vcap_keyfield_set keyset) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction(value="((const struct vcap_set*)vcap_keyfieldset($arg1, $arg2, $arg3))")
    public static Ptr<vcap_set> vcap_keyfieldset(Ptr<vcap_control> vctrl, vcap_type vt, vcap_keyfield_set keyset) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static boolean vcap_keyset_list_add(Ptr<vcap_keyset_list> keysetlist, vcap_keyfield_set keyset) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction(value="((const u8*)vcap_keyset_name($arg1, $arg2))")
    public static String vcap_keyset_name(Ptr<vcap_control> vctrl, vcap_keyfield_set keyset) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction(value="((const struct vcap_field*)vcap_lookup_keyfield($arg1, $arg2))")
    public static Ptr<vcap_field> vcap_lookup_keyfield(Ptr<vcap_rule> rule, vcap_key_field key2) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int vcap_lookup_rule_by_cookie(Ptr<vcap_control> vctrl, @Unsigned long cookie) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int vcap_mod_rule(Ptr<vcap_rule> rule) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void vcap_netbytes_copy(Ptr<Character> dst, Ptr<Character> src, int count) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static boolean vcap_path_exist(Ptr<vcap_control> vctrl, Ptr<NetDefinitions.net_device> ndev, int dst_cid) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int vcap_read_counter(Ptr<vcap_rule_internal> ri, Ptr<vcap_counter> ctr) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int vcap_read_rule(Ptr<vcap_rule_internal> ri) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int vcap_rule_add_action(Ptr<vcap_rule> rule, vcap_action_field action, vcap_field_type ftype, Ptr<vcap_client_actionfield_data> data) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int vcap_rule_add_action_bit(Ptr<vcap_rule> rule, vcap_action_field action, vcap_bit val) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int vcap_rule_add_action_u32(Ptr<vcap_rule> rule, vcap_action_field action, @Unsigned int value) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int vcap_rule_add_action_u72(Ptr<vcap_rule> rule, vcap_action_field action, Ptr<vcap_u72_action> fieldval) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int vcap_rule_add_key(Ptr<vcap_rule> rule, vcap_key_field key2, vcap_field_type ftype, Ptr<vcap_client_keyfield_data> data) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int vcap_rule_add_key_bit(Ptr<vcap_rule> rule, vcap_key_field key2, vcap_bit val) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int vcap_rule_add_key_u128(Ptr<vcap_rule> rule, vcap_key_field key2, Ptr<vcap_u128_key> fieldval) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int vcap_rule_add_key_u32(Ptr<vcap_rule> rule, vcap_key_field key2, @Unsigned int value, @Unsigned int mask) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int vcap_rule_add_key_u48(Ptr<vcap_rule> rule, vcap_key_field key2, Ptr<vcap_u48_key> fieldval) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int vcap_rule_add_key_u72(Ptr<vcap_rule> rule, vcap_key_field key2, Ptr<vcap_u72_key> fieldval) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static boolean vcap_rule_find_keysets(Ptr<vcap_rule> rule, Ptr<vcap_keyset_list> matches) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int vcap_rule_get_counter(Ptr<vcap_rule> rule, Ptr<vcap_counter> ctr) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int vcap_rule_get_key_u32(Ptr<vcap_rule> rule, vcap_key_field key2, Ptr<@Unsigned Integer> value, Ptr<@Unsigned Integer> mask) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int vcap_rule_get_keysets(Ptr<vcap_rule_internal> ri, Ptr<vcap_keyset_list> matches) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int vcap_rule_mod_action_u32(Ptr<vcap_rule> rule, vcap_action_field action, @Unsigned int value) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int vcap_rule_mod_key_u32(Ptr<vcap_rule> rule, vcap_key_field key2, @Unsigned int value, @Unsigned int mask) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int vcap_rule_rem_key(Ptr<vcap_rule> rule, vcap_key_field key2) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int vcap_rule_set_counter(Ptr<vcap_rule> rule, Ptr<vcap_counter> ctr) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void vcap_rule_set_counter_id(Ptr<vcap_rule> rule, @Unsigned int counter_id) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static vcap_keyfield_set vcap_select_min_rule_keyset(Ptr<vcap_control> vctrl, vcap_type vtype, Ptr<vcap_keyset_list> kslist) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void vcap_set_bit(Ptr<@Unsigned Integer> stream, Ptr<vcap_stream_iter> itr, boolean value) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int vcap_set_rule_set_actionset(Ptr<vcap_rule> rule, vcap_actionfield_set actionset) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int vcap_set_rule_set_keyset(Ptr<vcap_rule> rule, vcap_keyfield_set keyset) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void vcap_set_tc_exterr(Ptr<FlowDefinitions.flow_cls_offload> fco, Ptr<vcap_rule> vrule) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int vcap_val_rule(Ptr<vcap_rule> rule, @Unsigned short l3_proto) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction(value="vcap_verify_typegroups($arg1, $arg2, (const struct vcap_typegroup*)$arg3, $arg4, $arg5)")
    public static int vcap_verify_typegroups(Ptr<@Unsigned Integer> stream, int sw_width, Ptr<vcap_typegroup> tgt, boolean mask, int sw_max) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int vcap_write_counter(Ptr<vcap_rule_internal> ri, Ptr<vcap_counter> ctr) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int vcap_write_rule(Ptr<vcap_rule_internal> ri) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static Ptr<runtime.dentry> vcap_debugfs(Ptr<runtime.device> dev, Ptr<runtime.dentry> parent, Ptr<vcap_control> vctrl) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int vcap_debugfs_open(Ptr<runtime.inode> inode2, Ptr<runtime.file> file2) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int vcap_debugfs_show(Ptr<SeqDefinitions.seq_file> m, Ptr<?> unused) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction(value="vcap_debugfs_show_rule_actionfield($arg1, $arg2, $arg3, (const struct vcap_field*)$arg4, $arg5)")
    public static void vcap_debugfs_show_rule_actionfield(Ptr<vcap_control> vctrl, Ptr<vcap_output_print> out, vcap_action_field action, Ptr<vcap_field> actionfield, Ptr<Character> value) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction(value="vcap_debugfs_show_rule_keyfield($arg1, $arg2, $arg3, (const struct vcap_field*)$arg4, $arg5)")
    public static void vcap_debugfs_show_rule_keyfield(Ptr<vcap_control> vctrl, Ptr<vcap_output_print> out, vcap_key_field key2, Ptr<vcap_field> keyfield, Ptr<vcap_client_keyfield_data> data) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int vcap_debugfs_show_rule_keyset(Ptr<vcap_rule_internal> ri, Ptr<vcap_output_print> out) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void vcap_port_debugfs(Ptr<runtime.device> dev, Ptr<runtime.dentry> parent, Ptr<vcap_control> vctrl, Ptr<NetDefinitions.net_device> ndev) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int vcap_port_debugfs_open(Ptr<runtime.inode> inode2, Ptr<runtime.file> file2) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int vcap_port_debugfs_show(Ptr<SeqDefinitions.seq_file> m, Ptr<?> unused) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int vcap_raw_debugfs_open(Ptr<runtime.inode> inode2, Ptr<runtime.file> file2) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int vcap_raw_debugfs_show(Ptr<SeqDefinitions.seq_file> m, Ptr<?> unused) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int vcap_show_admin_raw(Ptr<vcap_control> vctrl, Ptr<vcap_admin> admin, Ptr<vcap_output_print> out) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int vcap_tc_flower_handler_arp_usage(Ptr<vcap_tc_flower_parse_usage> st2) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int vcap_tc_flower_handler_cvlan_usage(Ptr<vcap_tc_flower_parse_usage> st2) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int vcap_tc_flower_handler_ethaddr_usage(Ptr<vcap_tc_flower_parse_usage> st2) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int vcap_tc_flower_handler_ip_usage(Ptr<vcap_tc_flower_parse_usage> st2) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int vcap_tc_flower_handler_ipv4_usage(Ptr<vcap_tc_flower_parse_usage> st2) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int vcap_tc_flower_handler_ipv6_usage(Ptr<vcap_tc_flower_parse_usage> st2) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int vcap_tc_flower_handler_portnum_usage(Ptr<vcap_tc_flower_parse_usage> st2) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int vcap_tc_flower_handler_tcp_usage(Ptr<vcap_tc_flower_parse_usage> st2) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int vcap_tc_flower_handler_vlan_usage(Ptr<vcap_tc_flower_parse_usage> st2, vcap_key_field vid_key, vcap_key_field pcp_key) {
        throw new MethodIsBPFRelatedFunction();
    }

    @Type(noCCodeGeneration=true, cType="struct vcap_enabled_port")
    @NotUsableInJava
    public static class vcap_enabled_port
    extends Struct {
        public ListDefinitions.list_head list;
        public Ptr<NetDefinitions.net_device> ndev;
        public @Unsigned long cookie;
        public int src_cid;
        public int dst_cid;
    }

    @Type(noCCodeGeneration=true, cType="struct vcap_rule_move")
    @NotUsableInJava
    public static class vcap_rule_move
    extends Struct {
        public int addr;
        public int offset;
        public int count;
    }

    @Type(noCCodeGeneration=true, cType="struct vcap_stream_iter")
    @NotUsableInJava
    public static class vcap_stream_iter
    extends Struct {
        public @Unsigned int offset;
        public @Unsigned int sw_width;
        public @Unsigned int regs_per_sw;
        public @Unsigned int reg_idx;
        public @Unsigned int reg_bitpos;
        public Ptr<vcap_typegroup> tg;
    }

    @Type(noCCodeGeneration=true, cType="struct vcap_actionset_list")
    @NotUsableInJava
    public static class vcap_actionset_list
    extends Struct {
        public int max;
        public int cnt;
        public Ptr<vcap_actionfield_set> actionsets;
    }

    @Type(noCCodeGeneration=true, cType="enum vcap_arp_opcode")
    public static enum vcap_arp_opcode implements Enum<vcap_arp_opcode>,
    TypedEnum<vcap_arp_opcode, Integer>
    {
        VCAP_ARP_OP_RESERVED,
        VCAP_ARP_OP_REQUEST,
        VCAP_ARP_OP_REPLY;

    }

    @Type(noCCodeGeneration=true, cType="enum vcap_is2_arp_opcode")
    public static enum vcap_is2_arp_opcode implements Enum<vcap_is2_arp_opcode>,
    TypedEnum<vcap_is2_arp_opcode, Integer>
    {
        VCAP_IS2_ARP_REQUEST,
        VCAP_IS2_ARP_REPLY,
        VCAP_IS2_RARP_REQUEST,
        VCAP_IS2_RARP_REPLY;

    }

    @Type(noCCodeGeneration=true, cType="struct vcap_tc_flower_parse_usage")
    @NotUsableInJava
    public static class vcap_tc_flower_parse_usage
    extends Struct {
        public Ptr<FlowDefinitions.flow_cls_offload> fco;
        public Ptr<FlowDefinitions.flow_rule> frule;
        public Ptr<vcap_rule> vrule;
        public Ptr<vcap_admin> admin;
        public @Unsigned short l3_proto;
        public char l4_proto;
        public @Unsigned short tpid;
        public @Unsigned long used_keys;
    }

    @Type(noCCodeGeneration=true, cType="enum vcap_bit")
    public static enum vcap_bit implements Enum<vcap_bit>,
    TypedEnum<vcap_bit, Integer>
    {
        VCAP_BIT_ANY,
        VCAP_BIT_0,
        VCAP_BIT_1;

    }

    @Type(noCCodeGeneration=true, cType="struct vcap_port_debugfs_info")
    @NotUsableInJava
    public static class vcap_port_debugfs_info
    extends Struct {
        public Ptr<vcap_control> vctrl;
        public Ptr<NetDefinitions.net_device> ndev;
    }

    @Type(noCCodeGeneration=true, cType="struct vcap_admin_debugfs_info")
    @NotUsableInJava
    public static class vcap_admin_debugfs_info
    extends Struct {
        public Ptr<vcap_control> vctrl;
        public Ptr<vcap_admin> admin;
    }

    @Type(noCCodeGeneration=true, cType="struct vcap_rule_internal")
    @NotUsableInJava
    public static class vcap_rule_internal
    extends Struct {
        public vcap_rule data;
        public ListDefinitions.list_head list;
        public Ptr<vcap_admin> admin;
        public Ptr<NetDefinitions.net_device> ndev;
        public Ptr<vcap_control> vctrl;
        public @Unsigned int sort_key;
        public int keyset_sw;
        public int actionset_sw;
        public int keyset_sw_regs;
        public int actionset_sw_regs;
        public int size;
        public @Unsigned int addr;
        public @Unsigned int counter_id;
        public vcap_counter counter;
        public vcap_rule_state state;
    }

    @Type(noCCodeGeneration=true, cType="enum vcap_rule_state")
    public static enum vcap_rule_state implements Enum<vcap_rule_state>,
    TypedEnum<vcap_rule_state, Integer>
    {
        VCAP_RS_PERMANENT,
        VCAP_RS_ENABLED,
        VCAP_RS_DISABLED;

    }

    @Type(noCCodeGeneration=true, cType="struct vcap_counter")
    @NotUsableInJava
    public static class vcap_counter
    extends Struct {
        public @Unsigned int value;
        public boolean sticky;
    }

    @Type(noCCodeGeneration=true, cType="struct vcap_client_actionfield")
    @NotUsableInJava
    public static class vcap_client_actionfield
    extends Struct {
        public vcap_client_actionfield_ctrl ctrl;
        public vcap_client_actionfield_data data;
    }

    @Type(noCCodeGeneration=true, cType="struct vcap_client_actionfield_data")
    @NotUsableInJava
    public static class vcap_client_actionfield_data
    extends Struct {
        @InlineUnion(value=21055)
        public @InlineUnion(value=21055) vcap_u1_action u1;
        @InlineUnion(value=21055)
        public @InlineUnion(value=21055) vcap_u32_action u32;
        @InlineUnion(value=21055)
        public @InlineUnion(value=21055) vcap_u48_action u48;
        @InlineUnion(value=21055)
        public @InlineUnion(value=21055) vcap_u56_action u56;
        @InlineUnion(value=21055)
        public @InlineUnion(value=21055) vcap_u64_action u64;
        @InlineUnion(value=21055)
        public @InlineUnion(value=21055) vcap_u72_action u72;
        @InlineUnion(value=21055)
        public @InlineUnion(value=21055) vcap_u112_action u112;
        @InlineUnion(value=21055)
        public @InlineUnion(value=21055) vcap_u128_action u128;
    }

    @Type(noCCodeGeneration=true, cType="struct vcap_u128_action")
    @NotUsableInJava
    public static class vcap_u128_action
    extends Struct {
        public char @Size(value=16) [] value;
    }

    @Type(noCCodeGeneration=true, cType="struct vcap_u112_action")
    @NotUsableInJava
    public static class vcap_u112_action
    extends Struct {
        public char @Size(value=14) [] value;
    }

    @Type(noCCodeGeneration=true, cType="struct vcap_u72_action")
    @NotUsableInJava
    public static class vcap_u72_action
    extends Struct {
        public char @Size(value=9) [] value;
    }

    @Type(noCCodeGeneration=true, cType="struct vcap_u64_action")
    @NotUsableInJava
    public static class vcap_u64_action
    extends Struct {
        public char @Size(value=8) [] value;
    }

    @Type(noCCodeGeneration=true, cType="struct vcap_u56_action")
    @NotUsableInJava
    public static class vcap_u56_action
    extends Struct {
        public char @Size(value=7) [] value;
    }

    @Type(noCCodeGeneration=true, cType="struct vcap_u48_action")
    @NotUsableInJava
    public static class vcap_u48_action
    extends Struct {
        public char @Size(value=6) [] value;
    }

    @Type(noCCodeGeneration=true, cType="struct vcap_u32_action")
    @NotUsableInJava
    public static class vcap_u32_action
    extends Struct {
        public @Unsigned int value;
    }

    @Type(noCCodeGeneration=true, cType="struct vcap_u1_action")
    @NotUsableInJava
    public static class vcap_u1_action
    extends Struct {
        public char value;
    }

    @Type(noCCodeGeneration=true, cType="struct vcap_client_actionfield_ctrl")
    @NotUsableInJava
    public static class vcap_client_actionfield_ctrl
    extends Struct {
        public ListDefinitions.list_head list;
        public vcap_action_field action;
        public vcap_field_type type;
    }

    @Type(noCCodeGeneration=true, cType="struct vcap_client_keyfield")
    @NotUsableInJava
    public static class vcap_client_keyfield
    extends Struct {
        public vcap_client_keyfield_ctrl ctrl;
        public vcap_client_keyfield_data data;
    }

    @Type(noCCodeGeneration=true, cType="struct vcap_client_keyfield_data")
    @NotUsableInJava
    public static class vcap_client_keyfield_data
    extends Struct {
        @InlineUnion(value=21043)
        public @InlineUnion(value=21043) vcap_u1_key u1;
        @InlineUnion(value=21043)
        public @InlineUnion(value=21043) vcap_u32_key u32;
        @InlineUnion(value=21043)
        public @InlineUnion(value=21043) vcap_u48_key u48;
        @InlineUnion(value=21043)
        public @InlineUnion(value=21043) vcap_u56_key u56;
        @InlineUnion(value=21043)
        public @InlineUnion(value=21043) vcap_u64_key u64;
        @InlineUnion(value=21043)
        public @InlineUnion(value=21043) vcap_u72_key u72;
        @InlineUnion(value=21043)
        public @InlineUnion(value=21043) vcap_u112_key u112;
        @InlineUnion(value=21043)
        public @InlineUnion(value=21043) vcap_u128_key u128;
    }

    @Type(noCCodeGeneration=true, cType="struct vcap_u128_key")
    @NotUsableInJava
    public static class vcap_u128_key
    extends Struct {
        public char @Size(value=16) [] value;
        public char @Size(value=16) [] mask;
    }

    @Type(noCCodeGeneration=true, cType="struct vcap_u112_key")
    @NotUsableInJava
    public static class vcap_u112_key
    extends Struct {
        public char @Size(value=14) [] value;
        public char @Size(value=14) [] mask;
    }

    @Type(noCCodeGeneration=true, cType="struct vcap_u72_key")
    @NotUsableInJava
    public static class vcap_u72_key
    extends Struct {
        public char @Size(value=9) [] value;
        public char @Size(value=9) [] mask;
    }

    @Type(noCCodeGeneration=true, cType="struct vcap_u64_key")
    @NotUsableInJava
    public static class vcap_u64_key
    extends Struct {
        public char @Size(value=8) [] value;
        public char @Size(value=8) [] mask;
    }

    @Type(noCCodeGeneration=true, cType="struct vcap_u56_key")
    @NotUsableInJava
    public static class vcap_u56_key
    extends Struct {
        public char @Size(value=7) [] value;
        public char @Size(value=7) [] mask;
    }

    @Type(noCCodeGeneration=true, cType="struct vcap_u48_key")
    @NotUsableInJava
    public static class vcap_u48_key
    extends Struct {
        public char @Size(value=6) [] value;
        public char @Size(value=6) [] mask;
    }

    @Type(noCCodeGeneration=true, cType="struct vcap_u32_key")
    @NotUsableInJava
    public static class vcap_u32_key
    extends Struct {
        public @Unsigned int value;
        public @Unsigned int mask;
    }

    @Type(noCCodeGeneration=true, cType="struct vcap_u1_key")
    @NotUsableInJava
    public static class vcap_u1_key
    extends Struct {
        public char value;
        public char mask;
    }

    @Type(noCCodeGeneration=true, cType="struct vcap_client_keyfield_ctrl")
    @NotUsableInJava
    public static class vcap_client_keyfield_ctrl
    extends Struct {
        public ListDefinitions.list_head list;
        public vcap_key_field key;
        public vcap_field_type type;
    }

    @Type(noCCodeGeneration=true, cType="struct vcap_control")
    @NotUsableInJava
    public static class vcap_control
    extends Struct {
        public Ptr<vcap_operations> ops;
        public Ptr<vcap_info> vcaps;
        public Ptr<vcap_statistics> stats;
        public ListDefinitions.list_head list;
    }

    @Type(noCCodeGeneration=true, cType="struct vcap_operations")
    @NotUsableInJava
    public static class vcap_operations
    extends Struct {
        public Ptr<?> validate_keyset;
        public Ptr<?> add_default_fields;
        public Ptr<?> cache_erase;
        public Ptr<?> cache_write;
        public Ptr<?> cache_read;
        public Ptr<?> init;
        public Ptr<?> update;
        public Ptr<?> move;
        public Ptr<?> port_info;
    }

    @Type(noCCodeGeneration=true, cType="struct vcap_output_print")
    @NotUsableInJava
    public static class vcap_output_print
    extends Struct {
        public Ptr<?> prf;
        public Ptr<?> dst;
    }

    @Type(noCCodeGeneration=true, cType="struct vcap_keyset_list")
    @NotUsableInJava
    public static class vcap_keyset_list
    extends Struct {
        public int max;
        public int cnt;
        public Ptr<vcap_keyfield_set> keysets;
    }

    @Type(noCCodeGeneration=true, cType="struct vcap_rule")
    @NotUsableInJava
    public static class vcap_rule
    extends Struct {
        public int vcap_chain_id;
        public vcap_user user;
        public @Unsigned short priority;
        public @Unsigned int id;
        public @Unsigned long cookie;
        public ListDefinitions.list_head keyfields;
        public ListDefinitions.list_head actionfields;
        public vcap_keyfield_set keyset;
        public vcap_actionfield_set actionset;
        public vcap_rule_error exterr;
        public @Unsigned long client;
    }

    @Type(noCCodeGeneration=true, cType="struct vcap_admin")
    @NotUsableInJava
    public static class vcap_admin
    extends Struct {
        public ListDefinitions.list_head list;
        public ListDefinitions.list_head rules;
        public ListDefinitions.list_head enabled;
        public runtime.mutex lock;
        public vcap_type vtype;
        public int vinst;
        public int first_cid;
        public int last_cid;
        public int tgt_inst;
        public int lookups;
        public int lookups_per_instance;
        public int last_valid_addr;
        public int first_valid_addr;
        public int last_used_addr;
        public boolean w32be;
        public boolean ingress;
        public vcap_cache_data cache;
    }

    @Type(noCCodeGeneration=true, cType="enum vcap_rule_error")
    public static enum vcap_rule_error implements Enum<vcap_rule_error>,
    TypedEnum<vcap_rule_error, Integer>
    {
        VCAP_ERR_NONE,
        VCAP_ERR_NO_ADMIN,
        VCAP_ERR_NO_NETDEV,
        VCAP_ERR_NO_KEYSET_MATCH,
        VCAP_ERR_NO_ACTIONSET_MATCH,
        VCAP_ERR_NO_PORT_KEYSET_MATCH;

    }

    @Type(noCCodeGeneration=true, cType="enum vcap_command")
    public static enum vcap_command implements Enum<vcap_command>,
    TypedEnum<vcap_command, Integer>
    {
        VCAP_CMD_WRITE,
        VCAP_CMD_READ,
        VCAP_CMD_MOVE_DOWN,
        VCAP_CMD_MOVE_UP,
        VCAP_CMD_INITIALIZE;

    }

    @Type(noCCodeGeneration=true, cType="enum vcap_selection")
    public static enum vcap_selection implements Enum<vcap_selection>,
    TypedEnum<vcap_selection, Integer>
    {
        VCAP_SEL_ENTRY,
        VCAP_SEL_ACTION,
        VCAP_SEL_COUNTER,
        VCAP_SEL_ALL;

    }

    @Type(noCCodeGeneration=true, cType="struct vcap_cache_data")
    @NotUsableInJava
    public static class vcap_cache_data
    extends Struct {
        public Ptr<@Unsigned Integer> keystream;
        public Ptr<@Unsigned Integer> maskstream;
        public Ptr<@Unsigned Integer> actionstream;
        public @Unsigned int counter;
        public boolean sticky;
    }

    @Type(noCCodeGeneration=true, cType="enum vcap_field_type")
    public static enum vcap_field_type implements Enum<vcap_field_type>,
    TypedEnum<vcap_field_type, Integer>
    {
        VCAP_FIELD_BIT,
        VCAP_FIELD_U32,
        VCAP_FIELD_U48,
        VCAP_FIELD_U56,
        VCAP_FIELD_U64,
        VCAP_FIELD_U72,
        VCAP_FIELD_U112,
        VCAP_FIELD_U128;

    }

    @Type(noCCodeGeneration=true, cType="struct vcap_info")
    @NotUsableInJava
    public static class vcap_info
    extends Struct {
        public String name;
        public @Unsigned short rows;
        public @Unsigned short sw_count;
        public @Unsigned short sw_width;
        public @Unsigned short sticky_width;
        public @Unsigned short act_width;
        public @Unsigned short default_cnt;
        public @Unsigned short require_cnt_dis;
        public @Unsigned short version;
        public Ptr<vcap_set> keyfield_set;
        public int keyfield_set_size;
        public Ptr<vcap_set> actionfield_set;
        public int actionfield_set_size;
        public Ptr<Ptr<vcap_field>> keyfield_set_map;
        public Ptr<Integer> keyfield_set_map_size;
        public Ptr<Ptr<vcap_field>> actionfield_set_map;
        public Ptr<Integer> actionfield_set_map_size;
        public Ptr<Ptr<vcap_typegroup>> keyfield_set_typegroups;
        public Ptr<Ptr<vcap_typegroup>> actionfield_set_typegroups;
    }

    @Type(noCCodeGeneration=true, cType="struct vcap_typegroup")
    @NotUsableInJava
    public static class vcap_typegroup
    extends Struct {
        public @Unsigned short offset;
        public @Unsigned short width;
        public @Unsigned short value;
    }

    @Type(noCCodeGeneration=true, cType="struct vcap_set")
    @NotUsableInJava
    public static class vcap_set
    extends Struct {
        public char type_id;
        public char sw_per_item;
        public char sw_cnt;
    }

    @Type(noCCodeGeneration=true, cType="struct vcap_field")
    @NotUsableInJava
    public static class vcap_field
    extends Struct {
        public @Unsigned short type;
        public @Unsigned short width;
        public @Unsigned short offset;
    }

    @Type(noCCodeGeneration=true, cType="struct vcap_statistics")
    @NotUsableInJava
    public static class vcap_statistics
    extends Struct {
        public String name;
        public int count;
        public Ptr<String> keyfield_set_names;
        public Ptr<String> actionfield_set_names;
        public Ptr<String> keyfield_names;
        public Ptr<String> actionfield_names;
    }

    @Type(noCCodeGeneration=true, cType="enum vcap_user")
    public static enum vcap_user implements Enum<vcap_user>,
    TypedEnum<vcap_user, Integer>
    {
        VCAP_USER_PTP,
        VCAP_USER_MRP,
        VCAP_USER_CFM,
        VCAP_USER_VLAN,
        VCAP_USER_QOS,
        VCAP_USER_VCAP_UTIL,
        VCAP_USER_TC,
        VCAP_USER_TC_EXTRA,
        __VCAP_USER_AFTER_LAST,
        VCAP_USER_MAX;

    }

    @Type(noCCodeGeneration=true, cType="enum vcap_action_field")
    public static enum vcap_action_field implements Enum<vcap_action_field>,
    TypedEnum<vcap_action_field, Integer>
    {
        VCAP_AF_NO_VALUE,
        VCAP_AF_ACL_ID,
        VCAP_AF_CLS_VID_SEL,
        VCAP_AF_CNT_ID,
        VCAP_AF_COPY_PORT_NUM,
        VCAP_AF_COPY_QUEUE_NUM,
        VCAP_AF_CPU_COPY_ENA,
        VCAP_AF_CPU_QU,
        VCAP_AF_CPU_QUEUE_NUM,
        VCAP_AF_CUSTOM_ACE_TYPE_ENA,
        VCAP_AF_DEI_A_VAL,
        VCAP_AF_DEI_B_VAL,
        VCAP_AF_DEI_C_VAL,
        VCAP_AF_DEI_ENA,
        VCAP_AF_DEI_VAL,
        VCAP_AF_DLR_SEL,
        VCAP_AF_DP_ENA,
        VCAP_AF_DP_VAL,
        VCAP_AF_DSCP_ENA,
        VCAP_AF_DSCP_SEL,
        VCAP_AF_DSCP_VAL,
        VCAP_AF_ES2_REW_CMD,
        VCAP_AF_ESDX,
        VCAP_AF_FWD_KILL_ENA,
        VCAP_AF_FWD_MODE,
        VCAP_AF_FWD_SEL,
        VCAP_AF_HIT_ME_ONCE,
        VCAP_AF_HOST_MATCH,
        VCAP_AF_IGNORE_PIPELINE_CTRL,
        VCAP_AF_INTR_ENA,
        VCAP_AF_ISDX_ADD_REPLACE_SEL,
        VCAP_AF_ISDX_ADD_VAL,
        VCAP_AF_ISDX_ENA,
        VCAP_AF_ISDX_REPLACE_ENA,
        VCAP_AF_ISDX_VAL,
        VCAP_AF_LOOP_ENA,
        VCAP_AF_LRN_DIS,
        VCAP_AF_MAP_IDX,
        VCAP_AF_MAP_KEY,
        VCAP_AF_MAP_LOOKUP_SEL,
        VCAP_AF_MASK_MODE,
        VCAP_AF_MATCH_ID,
        VCAP_AF_MATCH_ID_MASK,
        VCAP_AF_MIRROR_ENA,
        VCAP_AF_MIRROR_PROBE,
        VCAP_AF_MIRROR_PROBE_ID,
        VCAP_AF_MRP_SEL,
        VCAP_AF_NXT_IDX,
        VCAP_AF_NXT_IDX_CTRL,
        VCAP_AF_OAM_SEL,
        VCAP_AF_PAG_OVERRIDE_MASK,
        VCAP_AF_PAG_VAL,
        VCAP_AF_PCP_A_VAL,
        VCAP_AF_PCP_B_VAL,
        VCAP_AF_PCP_C_VAL,
        VCAP_AF_PCP_ENA,
        VCAP_AF_PCP_VAL,
        VCAP_AF_PIPELINE_ACT,
        VCAP_AF_PIPELINE_FORCE_ENA,
        VCAP_AF_PIPELINE_PT,
        VCAP_AF_POLICE_ENA,
        VCAP_AF_POLICE_IDX,
        VCAP_AF_POLICE_REMARK,
        VCAP_AF_POLICE_VCAP_ONLY,
        VCAP_AF_POP_VAL,
        VCAP_AF_PORT_MASK,
        VCAP_AF_PUSH_CUSTOMER_TAG,
        VCAP_AF_PUSH_INNER_TAG,
        VCAP_AF_PUSH_OUTER_TAG,
        VCAP_AF_QOS_ENA,
        VCAP_AF_QOS_VAL,
        VCAP_AF_REW_OP,
        VCAP_AF_RT_DIS,
        VCAP_AF_SFID_ENA,
        VCAP_AF_SFID_VAL,
        VCAP_AF_SGID_ENA,
        VCAP_AF_SGID_VAL,
        VCAP_AF_SWAP_MACS_ENA,
        VCAP_AF_TAG_A_DEI_SEL,
        VCAP_AF_TAG_A_PCP_SEL,
        VCAP_AF_TAG_A_TPID_SEL,
        VCAP_AF_TAG_A_VID_SEL,
        VCAP_AF_TAG_B_DEI_SEL,
        VCAP_AF_TAG_B_PCP_SEL,
        VCAP_AF_TAG_B_TPID_SEL,
        VCAP_AF_TAG_B_VID_SEL,
        VCAP_AF_TAG_C_DEI_SEL,
        VCAP_AF_TAG_C_PCP_SEL,
        VCAP_AF_TAG_C_TPID_SEL,
        VCAP_AF_TAG_C_VID_SEL,
        VCAP_AF_TYPE,
        VCAP_AF_UNTAG_VID_ENA,
        VCAP_AF_VID_A_VAL,
        VCAP_AF_VID_B_VAL,
        VCAP_AF_VID_C_VAL,
        VCAP_AF_VID_REPLACE_ENA,
        VCAP_AF_VID_VAL,
        VCAP_AF_VLAN_POP_CNT,
        VCAP_AF_VLAN_POP_CNT_ENA;

    }

    @Type(noCCodeGeneration=true, cType="enum vcap_actionfield_set")
    public static enum vcap_actionfield_set implements Enum<vcap_actionfield_set>,
    TypedEnum<vcap_actionfield_set, Integer>
    {
        VCAP_AFS_NO_VALUE,
        VCAP_AFS_BASE_TYPE,
        VCAP_AFS_CLASSIFICATION,
        VCAP_AFS_CLASS_REDUCED,
        VCAP_AFS_ES0,
        VCAP_AFS_FULL,
        VCAP_AFS_S1,
        VCAP_AFS_SMAC_SIP,
        VCAP_AFS_VID;

    }

    @Type(noCCodeGeneration=true, cType="enum vcap_key_field")
    public static enum vcap_key_field implements Enum<vcap_key_field>,
    TypedEnum<vcap_key_field, Integer>
    {
        VCAP_KF_NO_VALUE,
        VCAP_KF_8021BR_ECID_BASE,
        VCAP_KF_8021BR_ECID_EXT,
        VCAP_KF_8021BR_E_TAGGED,
        VCAP_KF_8021BR_GRP,
        VCAP_KF_8021BR_IGR_ECID_BASE,
        VCAP_KF_8021BR_IGR_ECID_EXT,
        VCAP_KF_8021CB_R_TAGGED_IS,
        VCAP_KF_8021Q_DEI0,
        VCAP_KF_8021Q_DEI1,
        VCAP_KF_8021Q_DEI2,
        VCAP_KF_8021Q_DEI_CLS,
        VCAP_KF_8021Q_PCP0,
        VCAP_KF_8021Q_PCP1,
        VCAP_KF_8021Q_PCP2,
        VCAP_KF_8021Q_PCP_CLS,
        VCAP_KF_8021Q_TPID,
        VCAP_KF_8021Q_TPID0,
        VCAP_KF_8021Q_TPID1,
        VCAP_KF_8021Q_TPID2,
        VCAP_KF_8021Q_VID0,
        VCAP_KF_8021Q_VID1,
        VCAP_KF_8021Q_VID2,
        VCAP_KF_8021Q_VID_CLS,
        VCAP_KF_8021Q_VLAN_DBL_TAGGED_IS,
        VCAP_KF_8021Q_VLAN_TAGGED_IS,
        VCAP_KF_8021Q_VLAN_TAGS,
        VCAP_KF_ACL_GRP_ID,
        VCAP_KF_ARP_ADDR_SPACE_OK_IS,
        VCAP_KF_ARP_LEN_OK_IS,
        VCAP_KF_ARP_OPCODE,
        VCAP_KF_ARP_OPCODE_UNKNOWN_IS,
        VCAP_KF_ARP_PROTO_SPACE_OK_IS,
        VCAP_KF_ARP_SENDER_MATCH_IS,
        VCAP_KF_ARP_TGT_MATCH_IS,
        VCAP_KF_COSID_CLS,
        VCAP_KF_ES0_ISDX_KEY_ENA,
        VCAP_KF_ETYPE,
        VCAP_KF_ETYPE_LEN_IS,
        VCAP_KF_HOST_MATCH,
        VCAP_KF_IF_EGR_PORT_MASK,
        VCAP_KF_IF_EGR_PORT_MASK_RNG,
        VCAP_KF_IF_EGR_PORT_NO,
        VCAP_KF_IF_IGR_PORT,
        VCAP_KF_IF_IGR_PORT_MASK,
        VCAP_KF_IF_IGR_PORT_MASK_L3,
        VCAP_KF_IF_IGR_PORT_MASK_RNG,
        VCAP_KF_IF_IGR_PORT_MASK_SEL,
        VCAP_KF_IF_IGR_PORT_SEL,
        VCAP_KF_IP4_IS,
        VCAP_KF_IP_MC_IS,
        VCAP_KF_IP_PAYLOAD_5TUPLE,
        VCAP_KF_IP_PAYLOAD_S1_IP6,
        VCAP_KF_IP_SNAP_IS,
        VCAP_KF_ISDX_CLS,
        VCAP_KF_ISDX_GT0_IS,
        VCAP_KF_L2_BC_IS,
        VCAP_KF_L2_DMAC,
        VCAP_KF_L2_FRM_TYPE,
        VCAP_KF_L2_FWD_IS,
        VCAP_KF_L2_LLC,
        VCAP_KF_L2_MAC,
        VCAP_KF_L2_MC_IS,
        VCAP_KF_L2_PAYLOAD0,
        VCAP_KF_L2_PAYLOAD1,
        VCAP_KF_L2_PAYLOAD2,
        VCAP_KF_L2_PAYLOAD_ETYPE,
        VCAP_KF_L2_SMAC,
        VCAP_KF_L2_SNAP,
        VCAP_KF_L3_DIP_EQ_SIP_IS,
        VCAP_KF_L3_DPL_CLS,
        VCAP_KF_L3_DSCP,
        VCAP_KF_L3_DST_IS,
        VCAP_KF_L3_FRAGMENT,
        VCAP_KF_L3_FRAGMENT_TYPE,
        VCAP_KF_L3_FRAG_INVLD_L4_LEN,
        VCAP_KF_L3_FRAG_OFS_GT0,
        VCAP_KF_L3_IP4_DIP,
        VCAP_KF_L3_IP4_SIP,
        VCAP_KF_L3_IP6_DIP,
        VCAP_KF_L3_IP6_DIP_MSB,
        VCAP_KF_L3_IP6_SIP,
        VCAP_KF_L3_IP6_SIP_MSB,
        VCAP_KF_L3_IP_PROTO,
        VCAP_KF_L3_OPTIONS_IS,
        VCAP_KF_L3_PAYLOAD,
        VCAP_KF_L3_RT_IS,
        VCAP_KF_L3_TOS,
        VCAP_KF_L3_TTL_GT0,
        VCAP_KF_L4_1588_DOM,
        VCAP_KF_L4_1588_VER,
        VCAP_KF_L4_ACK,
        VCAP_KF_L4_DPORT,
        VCAP_KF_L4_FIN,
        VCAP_KF_L4_PAYLOAD,
        VCAP_KF_L4_PSH,
        VCAP_KF_L4_RNG,
        VCAP_KF_L4_RST,
        VCAP_KF_L4_SEQUENCE_EQ0_IS,
        VCAP_KF_L4_SPORT,
        VCAP_KF_L4_SPORT_EQ_DPORT_IS,
        VCAP_KF_L4_SYN,
        VCAP_KF_L4_URG,
        VCAP_KF_LOOKUP_FIRST_IS,
        VCAP_KF_LOOKUP_GEN_IDX,
        VCAP_KF_LOOKUP_GEN_IDX_SEL,
        VCAP_KF_LOOKUP_INDEX,
        VCAP_KF_LOOKUP_PAG,
        VCAP_KF_MIRROR_PROBE,
        VCAP_KF_OAM_CCM_CNTS_EQ0,
        VCAP_KF_OAM_DETECTED,
        VCAP_KF_OAM_FLAGS,
        VCAP_KF_OAM_MEL_FLAGS,
        VCAP_KF_OAM_MEPID,
        VCAP_KF_OAM_OPCODE,
        VCAP_KF_OAM_VER,
        VCAP_KF_OAM_Y1731_IS,
        VCAP_KF_PDU_TYPE,
        VCAP_KF_PROT_ACTIVE,
        VCAP_KF_RTP_ID,
        VCAP_KF_RT_FRMID,
        VCAP_KF_RT_TYPE,
        VCAP_KF_RT_VLAN_IDX,
        VCAP_KF_TCP_IS,
        VCAP_KF_TCP_UDP_IS,
        VCAP_KF_TYPE;

    }

    @Type(noCCodeGeneration=true, cType="enum vcap_keyfield_set")
    public static enum vcap_keyfield_set implements Enum<vcap_keyfield_set>,
    TypedEnum<vcap_keyfield_set, Integer>
    {
        VCAP_KFS_NO_VALUE,
        VCAP_KFS_5TUPLE_IP4,
        VCAP_KFS_5TUPLE_IP6,
        VCAP_KFS_7TUPLE,
        VCAP_KFS_ARP,
        VCAP_KFS_DBL_VID,
        VCAP_KFS_DMAC_VID,
        VCAP_KFS_ETAG,
        VCAP_KFS_IP4_OTHER,
        VCAP_KFS_IP4_TCP_UDP,
        VCAP_KFS_IP4_VID,
        VCAP_KFS_IP6_OTHER,
        VCAP_KFS_IP6_STD,
        VCAP_KFS_IP6_TCP_UDP,
        VCAP_KFS_IP6_VID,
        VCAP_KFS_IP_7TUPLE,
        VCAP_KFS_ISDX,
        VCAP_KFS_LL_FULL,
        VCAP_KFS_MAC_ETYPE,
        VCAP_KFS_MAC_LLC,
        VCAP_KFS_MAC_SNAP,
        VCAP_KFS_NORMAL,
        VCAP_KFS_NORMAL_5TUPLE_IP4,
        VCAP_KFS_NORMAL_7TUPLE,
        VCAP_KFS_NORMAL_IP6,
        VCAP_KFS_OAM,
        VCAP_KFS_PURE_5TUPLE_IP4,
        VCAP_KFS_RT,
        VCAP_KFS_SMAC_SIP4,
        VCAP_KFS_SMAC_SIP6,
        VCAP_KFS_VID;

    }

    @Type(noCCodeGeneration=true, cType="enum vcap_type")
    public static enum vcap_type implements Enum<vcap_type>,
    TypedEnum<vcap_type, Integer>
    {
        VCAP_TYPE_ES0,
        VCAP_TYPE_ES2,
        VCAP_TYPE_IS0,
        VCAP_TYPE_IS1,
        VCAP_TYPE_IS2,
        VCAP_TYPE_MAX;

    }
}

