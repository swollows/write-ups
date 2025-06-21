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
import me.bechberger.ebpf.runtime.DeviceDefinitions;
import me.bechberger.ebpf.runtime.ListDefinitions;
import me.bechberger.ebpf.runtime.PipeDefinitions;
import me.bechberger.ebpf.runtime.PollDefinitions;
import me.bechberger.ebpf.runtime.SeqDefinitions;
import me.bechberger.ebpf.runtime.UsbDefinitions;
import me.bechberger.ebpf.runtime.misc;
import me.bechberger.ebpf.runtime.runtime;
import me.bechberger.ebpf.type.Enum;
import me.bechberger.ebpf.type.Ptr;
import me.bechberger.ebpf.type.Struct;
import me.bechberger.ebpf.type.TypedEnum;

public final class PortDefinitions {
    @NotUsableInJava
    @BuiltinBPFFunction
    public static void port_event(Ptr<UsbDefinitions.usb_hub> hub, int port1) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static @OriginalName(value="ssize_t") long port_destid_show(Ptr<runtime.device> dev, Ptr<DeviceDefinitions.device_attribute> attr2, String buf) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int port_debugfs_open(Ptr<runtime.inode> inode2, Ptr<runtime.file> file2) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int port_debugfs_show(Ptr<SeqDefinitions.seq_file> s2, Ptr<?> data) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int port_fops_fasync(int fd2, Ptr<runtime.file> filp, int mode) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int port_fops_open(Ptr<runtime.inode> inode2, Ptr<runtime.file> filp) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static @Unsigned @OriginalName(value="__poll_t") int port_fops_poll(Ptr<runtime.file> filp, Ptr<PollDefinitions.poll_table_struct> wait) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static @OriginalName(value="ssize_t") long port_fops_read(Ptr<runtime.file> filp, String ubuf, @Unsigned long count, Ptr<@OriginalName(value="loff_t") Long> offp) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int port_fops_release(Ptr<runtime.inode> inode2, Ptr<runtime.file> filp) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static @OriginalName(value="ssize_t") long port_fops_splice_write(Ptr<PipeDefinitions.pipe_inode_info> pipe2, Ptr<runtime.file> filp, Ptr<@OriginalName(value="loff_t") Long> ppos, @Unsigned long len, @Unsigned int flags) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction(value="port_fops_write($arg1, (const u8*)$arg2, $arg3, $arg4)")
    public static @OriginalName(value="ssize_t") long port_fops_write(Ptr<runtime.file> filp, String ubuf, @Unsigned long count, Ptr<@OriginalName(value="loff_t") Long> offp) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static boolean port_has_data(Ptr<runtime.port> port2) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static @OriginalName(value="ssize_t") long port_show(Ptr<runtime.device> dev, Ptr<DeviceDefinitions.device_attribute> attr2, String buf) {
        throw new MethodIsBPFRelatedFunction();
    }

    @Type(noCCodeGeneration=true, cType="struct port_identity")
    @NotUsableInJava
    public static class port_identity
    extends Struct {
        public misc.clock_identity clock_identity;
        public @Unsigned @OriginalName(value="__be16") short port_number;
    }

    @Type(noCCodeGeneration=true, cType="enum port_pkey_state")
    public static enum port_pkey_state implements Enum<port_pkey_state>,
    TypedEnum<port_pkey_state, Integer>
    {
        IB_PORT_PKEY_NOT_VALID,
        IB_PORT_PKEY_VALID,
        IB_PORT_PKEY_LISTED;

    }

    @Type(noCCodeGeneration=true, cType="struct port_stats")
    @NotUsableInJava
    public static class port_stats
    extends Struct {
        public @Unsigned long bytes_sent;
        public @Unsigned long bytes_received;
        public @Unsigned long bytes_discarded;
    }

    @Type(noCCodeGeneration=true, cType="struct port_buffer")
    @NotUsableInJava
    public static class port_buffer
    extends Struct {
        public String buf;
        public @Unsigned long size;
        public @Unsigned long len;
        public @Unsigned long offset;
        public @Unsigned @OriginalName(value="dma_addr_t") long dma;
        public Ptr<runtime.device> dev;
        public ListDefinitions.list_head list;
        public @Unsigned int sgpages;
        public runtime.scatterlist @Size(value=0) [] sg;
    }

    @Type(noCCodeGeneration=true, cType="struct { u8 protocol; short unsigned int low_port; short unsigned int high_port; }")
    @NotUsableInJava
    public static class port_of_u_of_ocontext
    extends Struct {
        public char protocol;
        public @Unsigned short low_port;
        public @Unsigned short high_port;
    }
}

