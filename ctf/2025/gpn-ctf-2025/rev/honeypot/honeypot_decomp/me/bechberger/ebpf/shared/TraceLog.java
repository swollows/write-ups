/*
 * Decompiled with CFR 0.153-SNAPSHOT (d6f6758-dirty).
 */
package me.bechberger.ebpf.shared;

import java.io.IOException;
import java.time.Duration;
import java.util.ArrayList;
import java.util.List;
import java.util.function.Function;
import me.bechberger.ebpf.shared.Constants;
import me.bechberger.ebpf.shared.util.LineReader;
import org.jetbrains.annotations.Nullable;

public class TraceLog {
    private static TraceLog instance = new TraceLog();
    private final LineReader traceFile;

    private TraceLog() {
        try {
            this.traceFile = new LineReader(Constants.TRACEFS.resolve("trace_pipe"));
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }

    public static TraceLog getInstance() {
        if (instance == null) {
            instance = new TraceLog();
        }
        return instance;
    }

    public static void close() {
        if (instance != null) {
            TraceLog.instance.traceFile.close();
            instance = null;
        }
    }

    @Nullable
    public TraceFields readFields() {
        String tracedLine;
        do {
            if ((tracedLine = this.traceFile.readLine()) != null) continue;
            return null;
        } while (tracedLine.startsWith("CPU:") || tracedLine.length() < 17);
        try {
            String task2 = tracedLine.substring(0, 16).strip();
            String line2 = tracedLine.substring(17);
            int tsEnd = line2.indexOf(":");
            String[] pidCpuFlagsTs = line2.substring(0, tsEnd).split(" +");
            int pid2 = Integer.parseInt(pidCpuFlagsTs[0]);
            String cpu2 = pidCpuFlagsTs[1].substring(1, pidCpuFlagsTs[1].length() - 1);
            String flags = pidCpuFlagsTs[2];
            double ts = Double.parseDouble(pidCpuFlagsTs[3]);
            line2 = line2.substring(tsEnd + 1);
            int symEnd = line2.indexOf(":");
            String msg = line2.substring(symEnd + 2);
            return new TraceFields(tracedLine, task2, pid2, cpu2, flags, ts, msg);
        } catch (NumberFormatException e) {
            return new TraceFields(tracedLine, "Unknown", 0, "Unknown", "Unknown", 0.0, "Unknown");
        }
    }

    @Nullable
    public String readLine() {
        return this.traceFile.readLine();
    }

    @Nullable
    public String readLineIfPossible() {
        return this.traceFile.readLineIfPossible();
    }

    public void printLoop(@Nullable @Nullable Function<TraceFields, @Nullable String> format, boolean removeBPFTracePrintk) {
        while (true) {
            String line2 = null;
            if (format != null) {
                TraceFields fields = this.readFields();
                if (fields != null) {
                    line2 = format.apply(fields);
                }
            } else {
                line2 = this.traceFile.readLine();
            }
            if (line2 != null && removeBPFTracePrintk) {
                line2 = line2.replace("bpf_trace_printk: ", "");
            }
            if (line2 == null || line2.isEmpty()) continue;
            System.out.println(line2);
            System.out.flush();
        }
    }

    public void printLoop(@Nullable @Nullable Function<TraceFields, @Nullable String> format) {
        this.printLoop(format, false);
    }

    public void printLoop(@Nullable String fmt) {
        if (fmt != null) {
            this.printLoop((TraceFields fields) -> fields.format(fmt));
            return;
        }
        this.printLoop((Function<TraceFields, String>)null);
    }

    public void printLoop() {
        this.printLoop((String)null);
    }

    public void printLoop(boolean removeBPFTracePrintk) {
        if (removeBPFTracePrintk) {
            this.printLoop(null, true);
            return;
        }
        this.printLoop((Function<TraceFields, String>)null);
    }

    public List<String> readAllAvailableLines() {
        return this.readAllAvailableLines(Duration.ZERO);
    }

    public List<String> readAllAvailableLines(Duration waitAtMost) {
        ArrayList<String> lines = new ArrayList<String>();
        long start = System.nanoTime();
        while (true) {
            if (this.traceFile.ready()) {
                lines.add(this.traceFile.readLine());
                start = System.nanoTime();
                continue;
            }
            if (Duration.ofNanos(System.nanoTime() - start).compareTo(waitAtMost) >= 0) break;
        }
        return lines;
    }

    public record TraceFields(String line, String task, int pid, String cpu, String flags, double ts, String msg) {
        public String format(String fmt) {
            String fields = fmt;
            fields = fields.replace("{0}", this.task);
            fields = fields.replace("{1}", String.valueOf(this.pid));
            fields = fields.replace("{2}", this.cpu);
            fields = fields.replace("{3}", this.flags);
            fields = fields.replace("{4}", String.valueOf(this.ts));
            fields = fields.replace("{5}", this.msg);
            return fields;
        }
    }
}

