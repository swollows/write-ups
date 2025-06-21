/*
 * Decompiled with CFR 0.153-SNAPSHOT (d6f6758-dirty).
 */
package me.bechberger.ebpf.runtime;

import me.bechberger.ebpf.annotations.Size;
import me.bechberger.ebpf.annotations.Type;
import me.bechberger.ebpf.annotations.Unsigned;
import me.bechberger.ebpf.annotations.bpf.BuiltinBPFFunction;
import me.bechberger.ebpf.annotations.bpf.MethodIsBPFRelatedFunction;
import me.bechberger.ebpf.annotations.bpf.NotUsableInJava;
import me.bechberger.ebpf.runtime.AcpiDefinitions;
import me.bechberger.ebpf.runtime.TpmDefinitions;
import me.bechberger.ebpf.runtime.runtime;
import me.bechberger.ebpf.type.Enum;
import me.bechberger.ebpf.type.Ptr;
import me.bechberger.ebpf.type.Struct;
import me.bechberger.ebpf.type.TypedEnum;

public final class CrbDefinitions {
    @NotUsableInJava
    @BuiltinBPFFunction
    public static int __crb_cmd_ready(Ptr<runtime.device> dev, Ptr<crb_priv> priv) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int __crb_go_idle(Ptr<runtime.device> dev, Ptr<crb_priv> priv) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int crb_acpi_add(Ptr<AcpiDefinitions.acpi_device> device2) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void crb_acpi_driver_exit() {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int crb_acpi_driver_init() {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void crb_acpi_remove(Ptr<AcpiDefinitions.acpi_device> device2) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int crb_check_resource(Ptr<AcpiDefinitions.acpi_resource> ares, Ptr<?> data) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int crb_cmd_ready(Ptr<TpmDefinitions.tpm_chip> chip) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int crb_go_idle(Ptr<TpmDefinitions.tpm_chip> chip) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int crb_map_io(Ptr<AcpiDefinitions.acpi_device> device2, Ptr<crb_priv> priv, Ptr<AcpiDefinitions.acpi_table_tpm2> buf) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static Ptr<?> crb_map_res(Ptr<runtime.device> dev, Ptr<runtime.resource> iores, Ptr<Ptr<?>> iobase_ptr, @Unsigned long start, @Unsigned int size) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int crb_recv(Ptr<TpmDefinitions.tpm_chip> chip, Ptr<Character> buf, @Unsigned long count) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int crb_relinquish_locality(Ptr<TpmDefinitions.tpm_chip> chip, int loc) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static boolean crb_req_canceled(Ptr<TpmDefinitions.tpm_chip> chip, char status) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int crb_request_locality(Ptr<TpmDefinitions.tpm_chip> chip, int loc) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int crb_send(Ptr<TpmDefinitions.tpm_chip> chip, Ptr<Character> buf, @Unsigned long len) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int crb_try_pluton_doorbell(Ptr<crb_priv> priv, boolean wait_for_complete) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static boolean crb_wait_for_reg_32(Ptr<@Unsigned Integer> reg, @Unsigned int mask, @Unsigned int value, @Unsigned long timeout) {
        throw new MethodIsBPFRelatedFunction();
    }

    @Type(noCCodeGeneration=true, cType="struct crb_priv")
    @NotUsableInJava
    public static class crb_priv
    extends Struct {
        public @Unsigned int sm;
        public String hid;
        public Ptr<crb_regs_head> regs_h;
        public Ptr<crb_regs_tail> regs_t;
        public Ptr<Character> cmd;
        public Ptr<Character> rsp;
        public @Unsigned int cmd_size;
        public @Unsigned int smc_func_id;
        public Ptr<@Unsigned Integer> pluton_start_addr;
        public Ptr<@Unsigned Integer> pluton_reply_addr;
    }

    @Type(noCCodeGeneration=true, cType="enum crb_status")
    public static enum crb_status implements Enum<crb_status>,
    TypedEnum<crb_status, Integer>
    {
        CRB_DRV_STS_COMPLETE;

    }

    @Type(noCCodeGeneration=true, cType="struct crb_regs_tail")
    @NotUsableInJava
    public static class crb_regs_tail
    extends Struct {
        public @Unsigned int ctrl_req;
        public @Unsigned int ctrl_sts;
        public @Unsigned int ctrl_cancel;
        public @Unsigned int ctrl_start;
        public @Unsigned int ctrl_int_enable;
        public @Unsigned int ctrl_int_sts;
        public @Unsigned int ctrl_cmd_size;
        public @Unsigned int ctrl_cmd_pa_low;
        public @Unsigned int ctrl_cmd_pa_high;
        public @Unsigned int ctrl_rsp_size;
        public @Unsigned long ctrl_rsp_pa;
    }

    @Type(noCCodeGeneration=true, cType="struct crb_regs_head")
    @NotUsableInJava
    public static class crb_regs_head
    extends Struct {
        public @Unsigned int loc_state;
        public @Unsigned int reserved1;
        public @Unsigned int loc_ctrl;
        public @Unsigned int loc_sts;
        public char @Size(value=32) [] reserved2;
        public @Unsigned long intf_id;
        public @Unsigned long ctrl_ext;
    }

    @Type(noCCodeGeneration=true, cType="enum crb_cancel")
    public static enum crb_cancel implements Enum<crb_cancel>,
    TypedEnum<crb_cancel, Integer>
    {
        CRB_CANCEL_INVOKE;

    }

    @Type(noCCodeGeneration=true, cType="enum crb_start")
    public static enum crb_start implements Enum<crb_start>,
    TypedEnum<crb_start, Integer>
    {
        CRB_START_INVOKE;

    }

    @Type(noCCodeGeneration=true, cType="enum crb_ctrl_sts")
    public static enum crb_ctrl_sts implements Enum<crb_ctrl_sts>,
    TypedEnum<crb_ctrl_sts, Integer>
    {
        CRB_CTRL_STS_ERROR,
        CRB_CTRL_STS_TPM_IDLE;

    }

    @Type(noCCodeGeneration=true, cType="enum crb_ctrl_req")
    public static enum crb_ctrl_req implements Enum<crb_ctrl_req>,
    TypedEnum<crb_ctrl_req, Integer>
    {
        CRB_CTRL_REQ_CMD_READY,
        CRB_CTRL_REQ_GO_IDLE;

    }

    @Type(noCCodeGeneration=true, cType="enum crb_loc_state")
    public static enum crb_loc_state implements Enum<crb_loc_state>,
    TypedEnum<crb_loc_state, Integer>
    {
        CRB_LOC_STATE_LOC_ASSIGNED,
        CRB_LOC_STATE_TPM_REG_VALID_STS;

    }

    @Type(noCCodeGeneration=true, cType="enum crb_loc_ctrl")
    public static enum crb_loc_ctrl implements Enum<crb_loc_ctrl>,
    TypedEnum<crb_loc_ctrl, Integer>
    {
        CRB_LOC_CTRL_REQUEST_ACCESS,
        CRB_LOC_CTRL_RELINQUISH;

    }

    @Type(noCCodeGeneration=true, cType="enum crb_defaults")
    public static enum crb_defaults implements Enum<crb_defaults>,
    TypedEnum<crb_defaults, Integer>
    {
        CRB_ACPI_START_REVISION_ID,
        CRB_ACPI_START_INDEX;

    }
}

