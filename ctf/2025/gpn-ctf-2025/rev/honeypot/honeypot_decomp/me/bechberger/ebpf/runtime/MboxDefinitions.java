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
import me.bechberger.ebpf.runtime.runtime;
import me.bechberger.ebpf.type.Ptr;
import me.bechberger.ebpf.type.Struct;

public final class MboxDefinitions {
    @NotUsableInJava
    @BuiltinBPFFunction
    public static int mbox_bind_client(Ptr<mbox_chan> chan, Ptr<mbox_client> cl) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void mbox_chan_received_data(Ptr<mbox_chan> chan, Ptr<?> mssg) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void mbox_chan_txdone(Ptr<mbox_chan> chan, int r) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static boolean mbox_client_peek_data(Ptr<mbox_chan> chan) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void mbox_client_txdone(Ptr<mbox_chan> chan, int r) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int mbox_controller_register(Ptr<mbox_controller> mbox) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void mbox_controller_unregister(Ptr<mbox_controller> mbox) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int mbox_flush(Ptr<mbox_chan> chan, @Unsigned long timeout) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void mbox_free_channel(Ptr<mbox_chan> chan) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static Ptr<mbox_chan> mbox_request_channel(Ptr<mbox_client> cl, int index2) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction(value="mbox_request_channel_byname($arg1, (const u8*)$arg2)")
    public static Ptr<mbox_chan> mbox_request_channel_byname(Ptr<mbox_client> cl, String name) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int mbox_send_message(Ptr<mbox_chan> chan, Ptr<?> mssg) {
        throw new MethodIsBPFRelatedFunction();
    }

    @Type(noCCodeGeneration=true, cType="struct mbox_client")
    @NotUsableInJava
    public static class mbox_client
    extends Struct {
        public Ptr<runtime.device> dev;
        public boolean tx_block;
        public @Unsigned long tx_tout;
        public boolean knows_txdone;
        public Ptr<?> rx_callback;
        public Ptr<?> tx_prepare;
        public Ptr<?> tx_done;
    }

    @Type(noCCodeGeneration=true, cType="struct mbox_controller")
    @NotUsableInJava
    public static class mbox_controller
    extends Struct {
        public Ptr<runtime.device> dev;
        public Ptr<mbox_chan_ops> ops;
        public Ptr<mbox_chan> chans;
        public int num_chans;
        public boolean txdone_irq;
        public boolean txdone_poll;
        public @Unsigned int txpoll_period;
        public Ptr<?> of_xlate;
        public runtime.hrtimer poll_hrt;
        public  @OriginalName(value="spinlock_t") runtime.spinlock poll_hrt_lock;
        public ListDefinitions.list_head node;
    }

    @Type(noCCodeGeneration=true, cType="struct mbox_chan")
    @NotUsableInJava
    public static class mbox_chan
    extends Struct {
        public Ptr<mbox_controller> mbox;
        public @Unsigned int txdone_method;
        public Ptr<mbox_client> cl;
        public runtime.completion tx_complete;
        public Ptr<?> active_req;
        public @Unsigned int msg_count;
        public @Unsigned int msg_free;
        public Ptr<?> @Size(value=20) [] msg_data;
        public  @OriginalName(value="spinlock_t") runtime.spinlock lock;
        public Ptr<?> con_priv;
    }

    @Type(noCCodeGeneration=true, cType="struct mbox_chan_ops")
    @NotUsableInJava
    public static class mbox_chan_ops
    extends Struct {
        public Ptr<?> send_data;
        public Ptr<?> flush;
        public Ptr<?> startup;
        public Ptr<?> shutdown;
        public Ptr<?> last_tx_done;
        public Ptr<?> peek_data;
    }
}

