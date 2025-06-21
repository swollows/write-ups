/*
 * Decompiled with CFR 0.153-SNAPSHOT (d6f6758-dirty).
 * 
 * Could not load the following classes:
 *  java.lang.foreign.Arena
 *  java.lang.foreign.FunctionDescriptor
 *  java.lang.foreign.MemoryLayout
 *  java.lang.foreign.MemorySegment
 *  java.lang.foreign.ValueLayout
 */
package me.bechberger.ebpf.bpf.map;

import java.lang.foreign.Arena;
import java.lang.foreign.FunctionDescriptor;
import java.lang.foreign.MemoryLayout;
import java.lang.foreign.MemorySegment;
import java.lang.foreign.ValueLayout;
import java.util.ArrayList;
import java.util.List;
import me.bechberger.ebpf.annotations.bpf.BPFMapClass;
import me.bechberger.ebpf.annotations.bpf.BuiltinBPFFunction;
import me.bechberger.ebpf.annotations.bpf.MethodIsBPFRelatedFunction;
import me.bechberger.ebpf.annotations.bpf.NotUsableInJava;
import me.bechberger.ebpf.bpf.BPFError;
import me.bechberger.ebpf.bpf.map.BPFMap;
import me.bechberger.ebpf.bpf.map.FileDescriptor;
import me.bechberger.ebpf.bpf.map.MapTypeId;
import me.bechberger.ebpf.bpf.raw.ring_buffer_sample_fn;
import me.bechberger.ebpf.shared.PanamaUtil;
import me.bechberger.ebpf.type.BPFType;
import me.bechberger.ebpf.type.Ptr;

@BPFMapClass(cTemplate="struct {\n    __uint (type, BPF_MAP_TYPE_RINGBUF);\n    __uint (max_entries, $maxEntries);\n} $field SEC(\".maps\");\n", javaTemplate="new $class<>($fd, $b1)\n")
public class BPFRingBuffer<E>
extends BPFMap {
    private final Arena ringArena;
    private final BPFType<E> eventType;
    private final MemorySegment rb;
    private EventCallback<E> callback;
    private final List<CaughtBPFRingBufferError> caughtErrorsInCallBack = new ArrayList<CaughtBPFRingBufferError>();
    private static final PanamaUtil.HandlerWithErrno<MemorySegment> RING_BUFFER_NEW = new PanamaUtil.HandlerWithErrno("ring_buffer__new", FunctionDescriptor.of((MemoryLayout)PanamaUtil.POINTER, (MemoryLayout[])new MemoryLayout[]{ValueLayout.JAVA_INT, PanamaUtil.POINTER, PanamaUtil.POINTER, PanamaUtil.POINTER}));
    private static final PanamaUtil.HandlerWithErrno<Integer> ring_buffer__consume = new PanamaUtil.HandlerWithErrno("ring_buffer__consume", FunctionDescriptor.of((MemoryLayout)ValueLayout.JAVA_INT, (MemoryLayout[])new MemoryLayout[]{PanamaUtil.POINTER}));

    public BPFRingBuffer(FileDescriptor fd2, BPFType<E> eventType, EventCallback<E> callback2) {
        super(MapTypeId.RINGBUF, fd2);
        this.ringArena = Arena.ofConfined();
        this.eventType = eventType;
        this.callback = callback2;
        this.rb = this.initRingBuffer(fd2, eventType, callback2);
    }

    public BPFRingBuffer(FileDescriptor fd2, BPFType<E> eventType) {
        super(MapTypeId.RINGBUF, fd2);
        this.ringArena = Arena.ofConfined();
        this.eventType = eventType;
        this.rb = this.initRingBuffer(fd2, eventType, (buffer, event2) -> {
            if (this.callback != null) {
                this.callback.call(buffer, event2);
            }
        });
    }

    public void setCallback(EventCallback<E> callback2) {
        if (this.callback != null) {
            throw new IllegalStateException("Callback already set");
        }
        this.callback = callback2;
    }

    public void setCallback(EventCallbackWOBuffer<E> callback2) {
        this.setCallback((BPFRingBuffer<E> bPFRingBuffer, E event2) -> callback2.call(event2));
    }

    private static PanamaUtil.ResultAndErr<MemorySegment> ring_buffer__new(Arena arena, int fd2, MemorySegment sampleFn, MemorySegment flags, MemorySegment ctx) {
        return RING_BUFFER_NEW.call(arena, new Object[]{fd2, sampleFn, flags, ctx});
    }

    private MemorySegment initRingBuffer(FileDescriptor fd2, BPFType<E> eventType, EventCallback<E> callback2) {
        ring_buffer_sample_fn.Function sample2 = (ctx, data, len) -> {
            Object event2;
            try {
                event2 = eventType.parseMemory(data);
            } catch (RuntimeException e) {
                this.addCaughtError(new CaughtBPFRingBufferError.CaughtBPFRingBufferParseError(e, data, len));
                return 0;
            }
            try {
                callback2.call(this, event2);
            } catch (Throwable e) {
                this.addCaughtError(new CaughtBPFRingBufferError.CaughtBPFRingBufferCallbackError(e, event2));
                return 0;
            }
            return 0;
        };
        MemorySegment sampleFn = ring_buffer_sample_fn.allocate(sample2, this.ringArena);
        PanamaUtil.ResultAndErr<MemorySegment> rb = BPFRingBuffer.ring_buffer__new(this.ringArena, fd2.fd(), sampleFn, MemorySegment.NULL, MemorySegment.NULL);
        if (rb.result() == MemorySegment.NULL) {
            throw new BPFError("Failed to create ring buffer", rb.err());
        }
        return rb.result();
    }

    /*
     * WARNING - Removed try catching itself - possible behaviour change.
     */
    private void addCaughtError(CaughtBPFRingBufferError caughtError) {
        List<CaughtBPFRingBufferError> list = this.caughtErrorsInCallBack;
        synchronized (list) {
            this.caughtErrorsInCallBack.add(caughtError);
        }
    }

    /*
     * WARNING - Removed try catching itself - possible behaviour change.
     */
    public ConsumeResult consume() {
        try (Arena arena = Arena.ofConfined();){
            ConsumeResult res;
            PanamaUtil.ResultAndErr<Integer> ret = ring_buffer__consume.call(arena, new Object[]{this.rb});
            Object object = this.caughtErrorsInCallBack;
            synchronized (object) {
                res = new ConsumeResult(ret.result(), new ArrayList<CaughtBPFRingBufferError>(this.caughtErrorsInCallBack));
                this.caughtErrorsInCallBack.clear();
            }
            if (ret.err() != 0) {
                if (ret.err() == 11) {
                    object = res;
                    return object;
                }
                if (ret.err() == 22) {
                    object = res;
                    return object;
                }
                if (ret.err() == 2) {
                    object = res;
                    return object;
                }
                throw new BPFRingBufferError("Failed to consume events", ret.err());
            }
            object = res;
            return object;
        }
    }

    public int consumeAndThrow() {
        ConsumeResult res = this.consume();
        if (res.hasCaughtErrors()) {
            throw new BPFRingBufferError("Caught errors while consuming events", res.caughtErrorsInCallBack);
        }
        return res.consumed();
    }

    @Override
    public void close() {
        super.close();
    }

    @BuiltinBPFFunction(value="bpf_ringbuf_reserve(&$this, sizeof($C1), 0)")
    @NotUsableInJava
    public Ptr<E> reserve() {
        throw new MethodIsBPFRelatedFunction();
    }

    @BuiltinBPFFunction(value="bpf_ringbuf_discard($arg1, 0)")
    @NotUsableInJava
    public void discard(Ptr<E> event2) {
        throw new MethodIsBPFRelatedFunction();
    }

    @BuiltinBPFFunction(value="bpf_ringbuf_submit($arg1, 0)")
    @NotUsableInJava
    public void submit(Ptr<E> event2) {
        throw new MethodIsBPFRelatedFunction();
    }

    @FunctionalInterface
    public static interface EventCallback<E> {
        public void call(BPFRingBuffer<E> var1, E var2) throws Throwable;
    }

    @FunctionalInterface
    public static interface EventCallbackWOBuffer<E> {
        public void call(E var1) throws Throwable;
    }

    public record ConsumeResult(int consumed, List<CaughtBPFRingBufferError> caughtErrorsInCallBack) {
        public boolean hasCaughtErrors() {
            return !this.caughtErrorsInCallBack.isEmpty();
        }
    }

    public static class BPFRingBufferError
    extends BPFError {
        private BPFRingBufferError(String message, int errorCode) {
            super(message, errorCode);
        }

        private BPFRingBufferError(String message, List<CaughtBPFRingBufferError> caughtErrorsInCallBack) {
            super(message + ": " + caughtErrorsInCallBack.toString(), ((CaughtBPFRingBufferError)caughtErrorsInCallBack.getFirst()).exception());
        }
    }

    public static sealed interface CaughtBPFRingBufferError {
        public Throwable exception();

        public record CaughtBPFRingBufferCallbackError<E>(Throwable exception, E event) implements CaughtBPFRingBufferError
        {
        }

        public record CaughtBPFRingBufferParseError(Throwable exception, MemorySegment data, long len) implements CaughtBPFRingBufferError
        {
        }
    }
}

