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
import me.bechberger.ebpf.runtime.EcDefinitions;
import me.bechberger.ebpf.runtime.LockDefinitions;
import me.bechberger.ebpf.runtime.PlatformDefinitions;
import me.bechberger.ebpf.runtime.misc;
import me.bechberger.ebpf.runtime.runtime;
import me.bechberger.ebpf.type.Ptr;
import me.bechberger.ebpf.type.Struct;

public final class CrosDefinitions {
    @NotUsableInJava
    @BuiltinBPFFunction
    public static boolean cros_ec_check_features(Ptr<cros_ec_dev> ec, int feature) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int cros_ec_check_result(Ptr<cros_ec_device> ec_dev, Ptr<cros_ec_command> msg) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction(value="cros_ec_cmd($arg1, $arg2, $arg3, (const void*)$arg4, $arg5, $arg6, $arg7)")
    public static int cros_ec_cmd(Ptr<cros_ec_device> ec_dev, @Unsigned int version, int command, Ptr<?> outdata, @Unsigned long outsize, Ptr<?> indata, @Unsigned long insize) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int cros_ec_cmd_readmem(Ptr<cros_ec_device> ec_dev, char offset, char size, Ptr<?> dest) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int cros_ec_cmd_xfer(Ptr<cros_ec_device> ec_dev, Ptr<cros_ec_command> msg) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int cros_ec_cmd_xfer_status(Ptr<cros_ec_device> ec_dev, Ptr<cros_ec_command> msg) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int cros_ec_get_cmd_versions(Ptr<cros_ec_device> ec_dev, @Unsigned short cmd) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int cros_ec_get_host_command_version_mask(Ptr<cros_ec_device> ec_dev, @Unsigned short cmd, Ptr<@Unsigned Integer> mask) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static @Unsigned int cros_ec_get_host_event(Ptr<cros_ec_device> ec_dev) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int cros_ec_get_next_event(Ptr<cros_ec_device> ec_dev, Ptr<@OriginalName(value="bool") Boolean> wake_event, Ptr<@OriginalName(value="bool") Boolean> has_more_events) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int cros_ec_get_proto_info(Ptr<cros_ec_device> ec_dev, int devidx) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int cros_ec_get_proto_info_legacy(Ptr<cros_ec_device> ec_dev) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int cros_ec_get_sensor_count(Ptr<cros_ec_dev> ec) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int cros_ec_prepare_tx(Ptr<cros_ec_device> ec_dev, Ptr<cros_ec_command> msg) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int cros_ec_query_all(Ptr<cros_ec_device> ec_dev) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int cros_ec_send_command(Ptr<cros_ec_device> ec_dev, Ptr<cros_ec_command> msg) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int cros_ec_xfer_command(Ptr<cros_ec_device> ec_dev, Ptr<cros_ec_command> msg) {
        throw new MethodIsBPFRelatedFunction();
    }

    @Type(noCCodeGeneration=true, cType="struct cros_ec_dev")
    @NotUsableInJava
    public static class cros_ec_dev
    extends Struct {
        public runtime.device class_dev;
        public Ptr<cros_ec_device> ec_dev;
        public Ptr<runtime.device> dev;
        public @OriginalName(value="cros_ec_debugfs") Ptr<?> debug_info;
        public boolean has_kb_wake_angle;
        public @Unsigned short cmd_offset;
        public EcDefinitions.ec_response_get_features features;
    }

    @Type(noCCodeGeneration=true, cType="struct cros_ec_device")
    @NotUsableInJava
    public static class cros_ec_device
    extends Struct {
        public String phys_name;
        public Ptr<runtime.device> dev;
        public Ptr<runtime._class> cros_class;
        public Ptr<?> cmd_readmem;
        public @Unsigned short max_request;
        public @Unsigned short max_response;
        public @Unsigned short max_passthru;
        public @Unsigned short proto_version;
        public Ptr<?> priv;
        public int irq;
        public Ptr<Character> din;
        public Ptr<Character> dout;
        public int din_size;
        public int dout_size;
        public boolean wake_enabled;
        public boolean suspended;
        public Ptr<?> cmd_xfer;
        public Ptr<?> pkt_xfer;
        public LockDefinitions.lock_class_key lockdep_key;
        public runtime.mutex lock;
        public char mkbp_event_supported;
        public boolean host_sleep_v1;
        public misc.blocking_notifier_head event_notifier;
        public EcDefinitions.ec_response_get_next_event_v3 event_data;
        public int event_size;
        public @Unsigned int host_event_wake_mask;
        public @Unsigned int last_resume_result;
        public @Unsigned short suspend_timeout_ms;
        public @OriginalName(value="ktime_t") long last_event_time;
        public misc.notifier_block notifier_ready;
        public Ptr<PlatformDefinitions.platform_device> ec;
        public Ptr<PlatformDefinitions.platform_device> pd;
        public misc.blocking_notifier_head panic_notifier;
    }

    @Type(noCCodeGeneration=true, cType="struct cros_ec_command")
    @NotUsableInJava
    public static class cros_ec_command
    extends Struct {
        public @Unsigned @OriginalName(value="uint32_t") int version;
        public @Unsigned @OriginalName(value="uint32_t") int command;
        public @Unsigned @OriginalName(value="uint32_t") int outsize;
        public @Unsigned @OriginalName(value="uint32_t") int insize;
        public @Unsigned @OriginalName(value="uint32_t") int result;
        public @OriginalName(value="uint8_t") char @Size(value=0) [] data;
    }
}

