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
import me.bechberger.ebpf.runtime.ListDefinitions;
import me.bechberger.ebpf.runtime.misc;
import me.bechberger.ebpf.runtime.runtime;
import me.bechberger.ebpf.type.Enum;
import me.bechberger.ebpf.type.Ptr;
import me.bechberger.ebpf.type.Struct;
import me.bechberger.ebpf.type.TypedEnum;

public final class OpalDefinitions {
    @NotUsableInJava
    @BuiltinBPFFunction
    public static int __opal_lock_unlock(Ptr<opal_dev> dev, Ptr<opal_lock_unlock> lk_unlk) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int opal_discovery0(Ptr<opal_dev> dev, Ptr<?> data) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int opal_discovery0_end(Ptr<opal_dev> dev, Ptr<?> data) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void opal_lock_check_for_saved_key(Ptr<opal_dev> dev, Ptr<opal_lock_unlock> lk_unlk) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int opal_reverttper(Ptr<opal_dev> dev, Ptr<opal_key> opal, boolean psid) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static boolean opal_unlock_from_suspend(Ptr<opal_dev> dev) {
        throw new MethodIsBPFRelatedFunction();
    }

    @Type(noCCodeGeneration=true, cType="struct opal_suspend_data")
    @NotUsableInJava
    public static class opal_suspend_data
    extends Struct {
        public opal_lock_unlock unlk;
        public char lr;
        public ListDefinitions.list_head node;
    }

    @Type(noCCodeGeneration=true, cType="struct opal_resp_tok")
    @NotUsableInJava
    public static class opal_resp_tok
    extends Struct {
        public Ptr<Character> pos;
        public @Unsigned long len;
        public opal_response_token type;
        public opal_atom_width width;
        public misc.stored_of_opal_resp_tok stored;
    }

    @Type(noCCodeGeneration=true, cType="enum opal_atom_width")
    public static enum opal_atom_width implements Enum<opal_atom_width>,
    TypedEnum<opal_atom_width, Integer>
    {
        OPAL_WIDTH_TINY,
        OPAL_WIDTH_SHORT,
        OPAL_WIDTH_MEDIUM,
        OPAL_WIDTH_LONG,
        OPAL_WIDTH_TOKEN;

    }

    @Type(noCCodeGeneration=true, cType="struct opal_dev")
    @NotUsableInJava
    public static class opal_dev
    extends Struct {
        public @Unsigned int flags;
        public Ptr<?> data;
        public Ptr<?> send_recv;
        public runtime.mutex dev_lock;
        public @Unsigned short comid;
        public @Unsigned int hsn;
        public @Unsigned int tsn;
        public @Unsigned long align;
        public @Unsigned long lowest_lba;
        public @Unsigned int logical_block_size;
        public char align_required;
        public @Unsigned long pos;
        public Ptr<Character> cmd;
        public Ptr<Character> resp;
        public misc.parsed_resp parsed;
        public @Unsigned long prev_d_len;
        public Ptr<?> prev_data;
        public ListDefinitions.list_head unlk_lst;
    }

    @Type(noCCodeGeneration=true, cType="struct opal_step")
    @NotUsableInJava
    public static class opal_step
    extends Struct {
        public Ptr<?> fn;
        public Ptr<?> data;
    }

    @Type(noCCodeGeneration=true, cType="struct opal_header")
    @NotUsableInJava
    public static class opal_header
    extends Struct {
        public opal_compacket cp;
        public opal_packet pkt;
        public opal_data_subpacket subpkt;
    }

    @Type(noCCodeGeneration=true, cType="struct opal_data_subpacket")
    @NotUsableInJava
    public static class opal_data_subpacket
    extends Struct {
        public char @Size(value=6) [] reserved0;
        public @Unsigned @OriginalName(value="__be16") short kind;
        public @Unsigned @OriginalName(value="__be32") int length;
    }

    @Type(noCCodeGeneration=true, cType="struct opal_packet")
    @NotUsableInJava
    public static class opal_packet
    extends Struct {
        public @Unsigned @OriginalName(value="__be32") int tsn;
        public @Unsigned @OriginalName(value="__be32") int hsn;
        public @Unsigned @OriginalName(value="__be32") int seq_number;
        public @Unsigned @OriginalName(value="__be16") short reserved0;
        public @Unsigned @OriginalName(value="__be16") short ack_type;
        public @Unsigned @OriginalName(value="__be32") int acknowledgment;
        public @Unsigned @OriginalName(value="__be32") int length;
    }

    @Type(noCCodeGeneration=true, cType="struct opal_compacket")
    @NotUsableInJava
    public static class opal_compacket
    extends Struct {
        public @Unsigned @OriginalName(value="__be32") int reserved0;
        public char @Size(value=4) [] extendedComID;
        public @Unsigned @OriginalName(value="__be32") int outstandingData;
        public @Unsigned @OriginalName(value="__be32") int minTransfer;
        public @Unsigned @OriginalName(value="__be32") int length;
    }

    @Type(noCCodeGeneration=true, cType="enum opal_revertlsp")
    public static enum opal_revertlsp implements Enum<opal_revertlsp>,
    TypedEnum<opal_revertlsp, Integer>
    {
        OPAL_KEEP_GLOBAL_RANGE_KEY;

    }

    @Type(noCCodeGeneration=true, cType="enum opal_parameter")
    public static enum opal_parameter implements Enum<opal_parameter>,
    TypedEnum<opal_parameter, Integer>
    {
        OPAL_SUM_SET_LIST;

    }

    @Type(noCCodeGeneration=true, cType="enum opal_token")
    public static enum opal_token implements Enum<opal_token>,
    TypedEnum<opal_token, Integer>
    {
        OPAL_TRUE,
        OPAL_FALSE,
        OPAL_BOOLEAN_EXPR,
        OPAL_TABLE,
        OPAL_STARTROW,
        OPAL_ENDROW,
        OPAL_STARTCOLUMN,
        OPAL_ENDCOLUMN,
        OPAL_VALUES,
        OPAL_TABLE_UID,
        OPAL_TABLE_NAME,
        OPAL_TABLE_COMMON,
        OPAL_TABLE_TEMPLATE,
        OPAL_TABLE_KIND,
        OPAL_TABLE_COLUMN,
        OPAL_TABLE_COLUMNS,
        OPAL_TABLE_ROWS,
        OPAL_TABLE_ROWS_FREE,
        OPAL_TABLE_ROW_BYTES,
        OPAL_TABLE_LASTID,
        OPAL_TABLE_MIN,
        OPAL_TABLE_MAX,
        OPAL_PIN,
        OPAL_RANGESTART,
        OPAL_RANGELENGTH,
        OPAL_READLOCKENABLED,
        OPAL_WRITELOCKENABLED,
        OPAL_READLOCKED,
        OPAL_WRITELOCKED,
        OPAL_ACTIVEKEY,
        OPAL_LIFECYCLE,
        OPAL_MAXRANGES,
        OPAL_MBRENABLE,
        OPAL_MBRDONE,
        OPAL_HOSTPROPERTIES,
        OPAL_STARTLIST,
        OPAL_ENDLIST,
        OPAL_STARTNAME,
        OPAL_ENDNAME,
        OPAL_CALL,
        OPAL_ENDOFDATA,
        OPAL_ENDOFSESSION,
        OPAL_STARTTRANSACTON,
        OPAL_ENDTRANSACTON,
        OPAL_EMPTYATOM,
        OPAL_WHERE;

    }

    @Type(noCCodeGeneration=true, cType="enum opal_method")
    public static enum opal_method implements Enum<opal_method>,
    TypedEnum<opal_method, Integer>
    {
        OPAL_PROPERTIES,
        OPAL_STARTSESSION,
        OPAL_REVERT,
        OPAL_ACTIVATE,
        OPAL_EGET,
        OPAL_ESET,
        OPAL_NEXT,
        OPAL_EAUTHENTICATE,
        OPAL_GETACL,
        OPAL_GENKEY,
        OPAL_REVERTSP,
        OPAL_GET,
        OPAL_SET,
        OPAL_AUTHENTICATE,
        OPAL_RANDOM,
        OPAL_ERASE;

    }

    @Type(noCCodeGeneration=true, cType="enum opal_uid")
    public static enum opal_uid implements Enum<opal_uid>,
    TypedEnum<opal_uid, Integer>
    {
        OPAL_SMUID_UID,
        OPAL_THISSP_UID,
        OPAL_ADMINSP_UID,
        OPAL_LOCKINGSP_UID,
        OPAL_ENTERPRISE_LOCKINGSP_UID,
        OPAL_ANYBODY_UID,
        OPAL_SID_UID,
        OPAL_ADMIN1_UID,
        OPAL_USER1_UID,
        OPAL_USER2_UID,
        OPAL_PSID_UID,
        OPAL_ENTERPRISE_BANDMASTER0_UID,
        OPAL_ENTERPRISE_ERASEMASTER_UID,
        OPAL_TABLE_TABLE,
        OPAL_LOCKINGRANGE_GLOBAL,
        OPAL_LOCKINGRANGE_ACE_START_TO_KEY,
        OPAL_LOCKINGRANGE_ACE_RDLOCKED,
        OPAL_LOCKINGRANGE_ACE_WRLOCKED,
        OPAL_MBRCONTROL,
        OPAL_MBR,
        OPAL_AUTHORITY_TABLE,
        OPAL_C_PIN_TABLE,
        OPAL_LOCKING_INFO_TABLE,
        OPAL_ENTERPRISE_LOCKING_INFO_TABLE,
        OPAL_DATASTORE,
        OPAL_C_PIN_MSID,
        OPAL_C_PIN_SID,
        OPAL_C_PIN_ADMIN1,
        OPAL_HALF_UID_AUTHORITY_OBJ_REF,
        OPAL_HALF_UID_BOOLEAN_ACE,
        OPAL_UID_HEXFF;

    }

    @Type(noCCodeGeneration=true, cType="enum opal_response_token")
    public static enum opal_response_token implements Enum<opal_response_token>,
    TypedEnum<opal_response_token, Integer>
    {
        OPAL_DTA_TOKENID_BYTESTRING,
        OPAL_DTA_TOKENID_SINT,
        OPAL_DTA_TOKENID_UINT,
        OPAL_DTA_TOKENID_TOKEN,
        OPAL_DTA_TOKENID_INVALID;

    }

    @Type(noCCodeGeneration=true, cType="struct opal_revert_lsp")
    @NotUsableInJava
    public static class opal_revert_lsp
    extends Struct {
        public opal_key key;
        public @Unsigned int options;
        public @Unsigned int __pad;
    }

    @Type(noCCodeGeneration=true, cType="struct opal_discovery")
    @NotUsableInJava
    public static class opal_discovery
    extends Struct {
        public @Unsigned long data;
        public @Unsigned long size;
    }

    @Type(noCCodeGeneration=true, cType="struct opal_geometry")
    @NotUsableInJava
    public static class opal_geometry
    extends Struct {
        public char align;
        public @Unsigned int logical_block_size;
        public @Unsigned long alignment_granularity;
        public @Unsigned long lowest_aligned_lba;
        public char @Size(value=3) [] __align;
    }

    @Type(noCCodeGeneration=true, cType="struct opal_status")
    @NotUsableInJava
    public static class opal_status
    extends Struct {
        public @Unsigned int flags;
        public @Unsigned int reserved;
    }

    @Type(noCCodeGeneration=true, cType="struct opal_read_write_table")
    @NotUsableInJava
    public static class opal_read_write_table
    extends Struct {
        public opal_key key;
        public @Unsigned long data;
        public char @Size(value=8) [] table_uid;
        public @Unsigned long offset;
        public @Unsigned long size;
        public @Unsigned long flags;
        public @Unsigned long priv;
    }

    @Type(noCCodeGeneration=true, cType="enum opal_table_ops")
    public static enum opal_table_ops implements Enum<opal_table_ops>,
    TypedEnum<opal_table_ops, Integer>
    {
        OPAL_READ_TABLE,
        OPAL_WRITE_TABLE;

    }

    @Type(noCCodeGeneration=true, cType="struct opal_shadow_mbr")
    @NotUsableInJava
    public static class opal_shadow_mbr
    extends Struct {
        public opal_key key;
        public @Unsigned long data;
        public @Unsigned long offset;
        public @Unsigned long size;
    }

    @Type(noCCodeGeneration=true, cType="struct opal_mbr_done")
    @NotUsableInJava
    public static class opal_mbr_done
    extends Struct {
        public opal_key key;
        public char done_flag;
        public char @Size(value=7) [] __align;
    }

    @Type(noCCodeGeneration=true, cType="struct opal_mbr_data")
    @NotUsableInJava
    public static class opal_mbr_data
    extends Struct {
        public opal_key key;
        public char enable_disable;
        public char @Size(value=7) [] __align;
    }

    @Type(noCCodeGeneration=true, cType="struct opal_new_pw")
    @NotUsableInJava
    public static class opal_new_pw
    extends Struct {
        public opal_session_info session;
        public opal_session_info new_user_pw;
    }

    @Type(noCCodeGeneration=true, cType="struct opal_lock_unlock")
    @NotUsableInJava
    public static class opal_lock_unlock
    extends Struct {
        public opal_session_info session;
        public @Unsigned int l_state;
        public @Unsigned short flags;
        public char @Size(value=2) [] __align;
    }

    @Type(noCCodeGeneration=true, cType="struct opal_lr_status")
    @NotUsableInJava
    public static class opal_lr_status
    extends Struct {
        public opal_session_info session;
        public @Unsigned long range_start;
        public @Unsigned long range_length;
        public @Unsigned int RLE;
        public @Unsigned int WLE;
        public @Unsigned int l_state;
        public char @Size(value=4) [] align;
    }

    @Type(noCCodeGeneration=true, cType="struct opal_user_lr_setup")
    @NotUsableInJava
    public static class opal_user_lr_setup
    extends Struct {
        public @Unsigned long range_start;
        public @Unsigned long range_length;
        public @Unsigned int RLE;
        public @Unsigned int WLE;
        public opal_session_info session;
    }

    @Type(noCCodeGeneration=true, cType="struct opal_session_info")
    @NotUsableInJava
    public static class opal_session_info
    extends Struct {
        public @Unsigned int sum;
        public @Unsigned int who;
        public opal_key opal_key;
    }

    @Type(noCCodeGeneration=true, cType="struct opal_lr_act")
    @NotUsableInJava
    public static class opal_lr_act
    extends Struct {
        public opal_key key;
        public @Unsigned int sum;
        public char num_lrs;
        public char @Size(value=9) [] lr;
        public char @Size(value=2) [] align;
    }

    @Type(noCCodeGeneration=true, cType="enum opal_revert_lsp_opts")
    public static enum opal_revert_lsp_opts implements Enum<opal_revert_lsp_opts>,
    TypedEnum<opal_revert_lsp_opts, Integer>
    {
        OPAL_PRESERVE;

    }

    @Type(noCCodeGeneration=true, cType="struct opal_key")
    @NotUsableInJava
    public static class opal_key
    extends Struct {
        public char lr;
        public char key_len;
        public char key_type;
        public char @Size(value=5) [] __align;
        public char @Size(value=256) [] key;
    }

    @Type(noCCodeGeneration=true, cType="enum opal_key_type")
    public static enum opal_key_type implements Enum<opal_key_type>,
    TypedEnum<opal_key_type, Integer>
    {
        OPAL_INCLUDED,
        OPAL_KEYRING;

    }

    @Type(noCCodeGeneration=true, cType="enum opal_lock_flags")
    public static enum opal_lock_flags implements Enum<opal_lock_flags>,
    TypedEnum<opal_lock_flags, Integer>
    {
        OPAL_SAVE_FOR_LOCK;

    }

    @Type(noCCodeGeneration=true, cType="enum opal_lock_state")
    public static enum opal_lock_state implements Enum<opal_lock_state>,
    TypedEnum<opal_lock_state, Integer>
    {
        OPAL_RO,
        OPAL_RW,
        OPAL_LK;

    }

    @Type(noCCodeGeneration=true, cType="enum opal_user")
    public static enum opal_user implements Enum<opal_user>,
    TypedEnum<opal_user, Integer>
    {
        OPAL_ADMIN1,
        OPAL_USER1,
        OPAL_USER2,
        OPAL_USER3,
        OPAL_USER4,
        OPAL_USER5,
        OPAL_USER6,
        OPAL_USER7,
        OPAL_USER8,
        OPAL_USER9;

    }

    @Type(noCCodeGeneration=true, cType="enum opal_mbr_done_flag")
    public static enum opal_mbr_done_flag implements Enum<opal_mbr_done_flag>,
    TypedEnum<opal_mbr_done_flag, Integer>
    {
        OPAL_MBR_NOT_DONE,
        OPAL_MBR_DONE;

    }

    @Type(noCCodeGeneration=true, cType="enum opal_mbr")
    public static enum opal_mbr implements Enum<opal_mbr>,
    TypedEnum<opal_mbr, Integer>
    {
        OPAL_MBR_ENABLE,
        OPAL_MBR_DISABLE;

    }
}

