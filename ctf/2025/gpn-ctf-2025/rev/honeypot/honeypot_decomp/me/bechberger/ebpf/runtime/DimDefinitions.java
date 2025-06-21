/*
 * Decompiled with CFR 0.153-SNAPSHOT (d6f6758-dirty).
 */
package me.bechberger.ebpf.runtime;

import me.bechberger.ebpf.annotations.OriginalName;
import me.bechberger.ebpf.annotations.Type;
import me.bechberger.ebpf.annotations.Unsigned;
import me.bechberger.ebpf.annotations.bpf.BuiltinBPFFunction;
import me.bechberger.ebpf.annotations.bpf.MethodIsBPFRelatedFunction;
import me.bechberger.ebpf.annotations.bpf.NotUsableInJava;
import me.bechberger.ebpf.runtime.misc;
import me.bechberger.ebpf.runtime.runtime;
import me.bechberger.ebpf.type.Enum;
import me.bechberger.ebpf.type.Ptr;
import me.bechberger.ebpf.type.Struct;
import me.bechberger.ebpf.type.TypedEnum;

public final class DimDefinitions {
    @NotUsableInJava
    @BuiltinBPFFunction
    public static boolean dim_calc_stats(Ptr<dim_sample> start, Ptr<dim_sample> end, Ptr<dim_stats> curr_stats) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static boolean dim_on_top(Ptr<runtime.dim> dim2) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void dim_park_on_top(Ptr<runtime.dim> dim2) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void dim_park_tired(Ptr<runtime.dim> dim2) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void dim_turn(Ptr<runtime.dim> dim2) {
        throw new MethodIsBPFRelatedFunction();
    }

    @Type(noCCodeGeneration=true, cType="enum dim_cq_period_mode")
    public static enum dim_cq_period_mode implements Enum<dim_cq_period_mode>,
    TypedEnum<dim_cq_period_mode, Integer>
    {
        DIM_CQ_PERIOD_MODE_START_FROM_EQE,
        DIM_CQ_PERIOD_MODE_START_FROM_CQE,
        DIM_CQ_PERIOD_NUM_MODES;

    }

    @Type(noCCodeGeneration=true, cType="enum dim_step_result")
    public static enum dim_step_result implements Enum<dim_step_result>,
    TypedEnum<dim_step_result, Integer>
    {
        DIM_STEPPED,
        DIM_TOO_TIRED,
        DIM_ON_EDGE;

    }

    @Type(noCCodeGeneration=true, cType="enum dim_stats_state")
    public static enum dim_stats_state implements Enum<dim_stats_state>,
    TypedEnum<dim_stats_state, Integer>
    {
        DIM_STATS_WORSE,
        DIM_STATS_SAME,
        DIM_STATS_BETTER;

    }

    @Type(noCCodeGeneration=true, cType="enum dim_tune_state")
    public static enum dim_tune_state implements Enum<dim_tune_state>,
    TypedEnum<dim_tune_state, Integer>
    {
        DIM_PARKING_ON_TOP,
        DIM_PARKING_TIRED,
        DIM_GOING_RIGHT,
        DIM_GOING_LEFT;

    }

    @Type(noCCodeGeneration=true, cType="enum dim_state")
    public static enum dim_state implements Enum<dim_state>,
    TypedEnum<dim_state, Integer>
    {
        DIM_START_MEASURE,
        DIM_MEASURE_IN_PROGRESS,
        DIM_APPLY_NEW_PROFILE;

    }

    @Type(noCCodeGeneration=true, cType="struct dim_stats")
    @NotUsableInJava
    public static class dim_stats
    extends Struct {
        public int ppms;
        public int bpms;
        public int epms;
        public int cpms;
        public int cpe_ratio;
    }

    @Type(noCCodeGeneration=true, cType="struct dim_sample")
    @NotUsableInJava
    public static class dim_sample
    extends Struct {
        public @OriginalName(value="ktime_t") long time;
        public @Unsigned int pkt_ctr;
        public @Unsigned int byte_ctr;
        public @Unsigned short event_ctr;
        public @Unsigned int comp_ctr;
    }

    @Type(noCCodeGeneration=true, cType="struct dim_cq_moder")
    @NotUsableInJava
    public static class dim_cq_moder
    extends Struct {
        public @Unsigned short usec;
        public @Unsigned short pkts;
        public @Unsigned short comps;
        public char cq_period_mode;
        public misc.callback_head rcu;
    }

    @Type(noCCodeGeneration=true, cType="struct dim_irq_moder")
    @NotUsableInJava
    public static class dim_irq_moder
    extends Struct {
        public char profile_flags;
        public char coal_flags;
        public char dim_rx_mode;
        public char dim_tx_mode;
        public Ptr<dim_cq_moder> rx_profile;
        public Ptr<dim_cq_moder> tx_profile;
        public Ptr<?> rx_dim_work;
        public Ptr<?> tx_dim_work;
    }
}

