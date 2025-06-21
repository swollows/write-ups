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
package me.bechberger.ebpf.bpf;

import java.io.IOException;
import java.io.OutputStream;
import java.lang.annotation.Annotation;
import java.lang.foreign.Arena;
import java.lang.foreign.FunctionDescriptor;
import java.lang.foreign.MemoryLayout;
import java.lang.foreign.MemorySegment;
import java.lang.foreign.ValueLayout;
import java.lang.invoke.CallSite;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.nio.file.Files;
import java.nio.file.OpenOption;
import java.nio.file.Path;
import java.nio.file.attribute.FileAttribute;
import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import java.util.Set;
import java.util.function.Function;
import java.util.stream.IntStream;
import me.bechberger.ebpf.NameUtil;
import me.bechberger.ebpf.annotations.bpf.BPFFunction;
import me.bechberger.ebpf.annotations.bpf.Properties;
import me.bechberger.ebpf.annotations.bpf.Property;
import me.bechberger.ebpf.annotations.bpf.PropertyDefinition;
import me.bechberger.ebpf.annotations.bpf.PropertyDefinitions;
import me.bechberger.ebpf.bpf.BPFError;
import me.bechberger.ebpf.bpf.NetworkUtil;
import me.bechberger.ebpf.bpf.Util;
import me.bechberger.ebpf.bpf.map.BPFHashMap;
import me.bechberger.ebpf.bpf.map.BPFMap;
import me.bechberger.ebpf.bpf.map.BPFRingBuffer;
import me.bechberger.ebpf.bpf.map.FileDescriptor;
import me.bechberger.ebpf.bpf.map.MapTypeId;
import me.bechberger.ebpf.bpf.processor.Processor;
import me.bechberger.ebpf.bpf.raw.Lib;
import me.bechberger.ebpf.bpf.raw.LibraryLoader;
import me.bechberger.ebpf.bpf.raw.bpf_tc_hook;
import me.bechberger.ebpf.bpf.raw.bpf_tc_opts;
import me.bechberger.ebpf.bpf.raw.btf_type;
import me.bechberger.ebpf.bpf.raw.btf_var_secinfo;
import me.bechberger.ebpf.shared.KernelFeatures;
import me.bechberger.ebpf.shared.LibC;
import me.bechberger.ebpf.shared.PanamaUtil;
import me.bechberger.ebpf.shared.TraceLog;
import me.bechberger.ebpf.type.BPFType;
import me.bechberger.ebpf.type.Union;
import org.jetbrains.annotations.Nullable;

public abstract class BPFProgram
implements AutoCloseable {
    private final MemorySegment ebpf_object;
    private final Set<BPFLink> attachedPrograms = new HashSet<BPFLink>();
    private final Set<Integer> openedFDs = new HashSet<Integer>();
    private final Set<BPFMap> attachedMaps = new HashSet<BPFMap>();
    private final Set<MemorySegment> attachedStructOps = new HashSet<MemorySegment>();
    private final Set<AttachedXDPIfIndex> attachedXDPIfIndexes = new HashSet<AttachedXDPIfIndex>();
    private final Set<AttachedTCIfIndex> attachedTCIfIndices = new HashSet<AttachedTCIfIndex>();
    private volatile boolean closed = false;
    private static final PanamaUtil.HandlerWithErrno<Integer> BPF_OBJECT__LOAD;
    private static final PanamaUtil.HandlerWithErrno<MemorySegment> BPF_OBJECT__OPEN_FILE;
    private static final PanamaUtil.HandlerWithErrno<MemorySegment> BPF_PROGRAM__ATTACH_LSM;
    private static final PanamaUtil.HandlerWithErrno<MemorySegment> BPF_PROGRAM__ATTACH;
    private static final PanamaUtil.HandlerWithErrno<MemorySegment> BPF_PROGRAM__ATTACH_RAW_TRACEPOINT;
    private static final PanamaUtil.HandlerWithErrno<MemorySegment> BPF_PROGRAM__ATTACH_TRACEPOINT;
    private static final PanamaUtil.HandlerWithErrno<MemorySegment> BPF_PROGRAM__ATTACH_CGROUP;
    private static final PanamaUtil.HandlerWithErrno<MemorySegment> BPF_MAP__ATTACH_STRUCT_OPS;
    private BTF btf = null;

    public static <T, S extends T> Class<S> getImplClass(Class<T> clazz) {
        try {
            Processor.ImplName implName = Processor.classToImplName(clazz);
            return Class.forName(implName.fullyQualifiedClassName());
        } catch (ClassNotFoundException e) {
            throw new BPFError("Implementation class not found, you probably forgot to annotate the " + clazz.getSimpleName() + " class with @BPF", e);
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
    }

    public static <T extends BPFProgram> String getCode(Class<T> clazz) {
        try {
            return BPFProgram.getImplClass(clazz).getMethod("getCodeStatic", new Class[0]).invoke(null, new Object[0]).toString();
        } catch (IllegalAccessException | NoSuchMethodException | InvocationTargetException e) {
            throw new RuntimeException(e);
        }
    }

    public static <T extends BPFProgram, S extends T> S load(Class<T> clazz) {
        try {
            KernelFeatures.checkRequirements("Loading BPF program", clazz);
            BPFProgram program = (BPFProgram)BPFProgram.getImplClass(clazz).getConstructor(new Class[0]).newInstance(new Object[0]);
            program.initGlobals();
            return (S)program;
        } catch (BPFError e) {
            throw e;
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
    }

    public BPFProgram() {
        this.ebpf_object = this.loadProgram();
        Runtime.getRuntime().addShutdownHook(new Thread(this::close));
    }

    protected void initGlobals() {
    }

    public <T> BPFType<T> getTypeForClass(Class<T> innerType) {
        return BPFProgram.getTypeForImplClass(this.getClass(), innerType);
    }

    public static <T> BPFType<T> getTypeForClass(Class<?> outer, Class<T> inner) {
        return BPFProgram.getTypeForImplClass(BPFProgram.getImplClass(outer), inner);
    }

    public <T> BPFType.BPFStructType<T> getStructTypeForClass(Class<T> innerType) {
        return (BPFType.BPFStructType)BPFProgram.getTypeForImplClass(this.getClass(), innerType);
    }

    public static <T> BPFType.BPFStructType<T> getStructTypeForClass(Class<?> outer, Class<T> inner) {
        return (BPFType.BPFStructType)BPFProgram.getTypeForImplClass(BPFProgram.getImplClass(outer), inner);
    }

    public <T extends Union> BPFType.BPFUnionType<T> getUnionTypeForClass(Class<T> innerType) {
        return (BPFType.BPFUnionType)BPFProgram.getTypeForImplClass(this.getClass(), innerType);
    }

    public static <T extends Union> BPFType.BPFUnionType<T> getUnionTypeForClass(Class<?> outer, Class<T> inner) {
        return (BPFType.BPFUnionType)BPFProgram.getTypeForImplClass(BPFProgram.getImplClass(outer), inner);
    }

    private static <T> BPFType<T> getTypeForImplClass(Class<?> outerImpl, Class<T> inner) {
        try {
            return BPFProgram.getTypeForImplClass(outerImpl, inner, true);
        } catch (Exception e) {
            return BPFProgram.getTypeForImplClass(outerImpl, inner, false);
        }
    }

    private static <T> BPFType<T> getTypeForImplClass(Class<?> outerImpl, Class<T> inner, boolean canonical) {
        String fieldName = NameUtil.toConstantCase(canonical ? inner.getCanonicalName() : inner.getSimpleName()).replace(".", "__");
        try {
            return (BPFType)outerImpl.getDeclaredField(fieldName).get(null);
        } catch (IllegalAccessException | NoSuchFieldException e) {
            throw new RuntimeException(e);
        }
    }

    private MemorySegment loadProgram() {
        Path objFile = this.getTmpObjectFile();
        try (Arena arena = Arena.ofConfined();){
            MemorySegment fileName = arena.allocateFrom(objFile.toString());
            PanamaUtil.ResultAndErr<MemorySegment> ebpf_object = BPF_OBJECT__OPEN_FILE.call(fileName, MemorySegment.NULL);
            if (ebpf_object.result() == MemorySegment.NULL) {
                throw new BPFLoadError("Failed to open eBPF file: " + Util.errnoString(ebpf_object.err()));
            }
            PanamaUtil.ResultAndErr<Integer> ret = BPF_OBJECT__LOAD.call(ebpf_object.result());
            if (ret.hasError() && ret.result() != 0) {
                throw new BPFLoadError("Failed to load eBPF object: " + Util.errnoString(ret.err()));
            }
            MemorySegment memorySegment = ebpf_object.result();
            return memorySegment;
        }
    }

    public abstract List<String> getAutoAttachablePrograms();

    public List<String> getAllAutoAttachablePrograms() {
        ArrayList<String> names = new ArrayList<String>(this.getAutoAttachablePrograms());
        Class<?> programClass = this.getClass().getSuperclass();
        ArrayList<CallSite> erroneous = new ArrayList<CallSite>();
        for (Method method : programClass.getDeclaredMethods()) {
            BPFFunction annotation = this.findParentAnnotation(programClass, method, BPFFunction.class);
            if (annotation == null || !annotation.autoAttach()) continue;
            String baseSection = annotation.section().split("/")[0];
            if (!BPFFunction.autoAttachableSections.contains(baseSection)) {
                erroneous.add((CallSite)((Object)(method.getName() + " with section " + annotation.section())));
                continue;
            }
            names.add(annotation.name().isEmpty() ? method.getName() : annotation.name());
        }
        if (!erroneous.isEmpty()) {
            throw new BPFError("Auto-attachable sections are: " + String.valueOf(BPFFunction.autoAttachableSections) + ", but the following methods have invalid sections: " + String.valueOf(erroneous));
        }
        return names;
    }

    public void attachLSMHooks() {
        for (Method method : this.getClass().getSuperclass().getDeclaredMethods()) {
            BPFFunction annotation = this.findParentAnnotation(this.getClass().getSuperclass(), method, BPFFunction.class);
            if (annotation == null || !annotation.section().startsWith("lsm/")) continue;
            this.attachLSMHook(this.getProgramByName(BPFProgram.getBPFFunctionName(method)));
        }
    }

    public void attachLSMHook(ProgramHandle prog) {
        PanamaUtil.ResultAndErr<MemorySegment> ret = BPF_PROGRAM__ATTACH_LSM.call(prog.prog());
        if (ret.result() == MemorySegment.NULL) {
            throw new BPFAttachError(prog.name, ret.err());
        }
        BPFLink link2 = new BPFLink(ret.result());
        if (link2.segment.address() == 0L) {
            throw new BPFAttachError(prog.name, ret.err());
        }
        this.attachedPrograms.add(link2);
    }

    @Nullable
    private <T extends Annotation> T findParentAnnotation(Class<?> programClass, Method method, Class<T> annotationClass) {
        T annotation = method.getAnnotation(annotationClass);
        if (annotation != null) {
            return annotation;
        }
        for (Class<?> iface : programClass.getInterfaces()) {
            try {
                Method ifaceMethod = iface.getMethod(method.getName(), method.getParameterTypes());
                annotation = ifaceMethod.getAnnotation(annotationClass);
                if (annotation != null) {
                    return annotation;
                }
                return this.findParentAnnotation(iface, ifaceMethod, annotationClass);
            } catch (NoSuchMethodException noSuchMethodException) {
            }
        }
        return null;
    }

    public static List<String> getAutoAttachableBPFPrograms(Class<? extends BPFProgram> clazz) {
        return Arrays.stream(clazz.getMethods()).map(m -> {
            BPFFunction ann = BPFProgram.getAnnotationOfSelfOrOverriden(m, BPFFunction.class);
            if (ann != null && ann.autoAttach()) {
                return ann.name().isEmpty() ? m.getName() : ann.name();
            }
            return null;
        }).filter(Objects::nonNull).toList();
    }

    @Nullable
    private static <T extends Annotation> T getAnnotationOfSelfOrOverriden(Method method, Class<T> annotationClass) {
        T annotation = method.getAnnotation(annotationClass);
        if (annotation != null) {
            return annotation;
        }
        Class<?> declaringClass = method.getDeclaringClass();
        for (Class<?> iface : declaringClass.getInterfaces()) {
            try {
                Method ifaceMethod = iface.getMethod(method.getName(), method.getParameterTypes());
                T ifaceAnnotation = ifaceMethod.getAnnotation(annotationClass);
                if (ifaceAnnotation == null) continue;
                return ifaceAnnotation;
            } catch (NoSuchMethodException noSuchMethodException) {
                // empty catch block
            }
        }
        return null;
    }

    private static String getBPFFunctionName(Method method) {
        BPFFunction annotation = BPFProgram.getAnnotationOfSelfOrOverriden(method, BPFFunction.class);
        if (annotation == null || annotation.name().isEmpty()) {
            return method.getName();
        }
        return annotation.name();
    }

    public abstract byte[] getByteCode();

    public abstract String getCode();

    private Path getTmpObjectFile() {
        try {
            Path tmp = Files.createTempFile("bpf", ".o", new FileAttribute[0]);
            tmp.toFile().deleteOnExit();
            try (OutputStream os = Files.newOutputStream(tmp, new OpenOption[0]);){
                os.write(this.getByteCode());
            }
            return tmp;
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }

    public ProgramHandle getProgramByName(String name) {
        try (Arena arena = Arena.ofConfined();){
            MemorySegment prog = Lib.bpf_object__find_program_by_name(this.ebpf_object, arena.allocateFrom(name));
            if (prog == MemorySegment.NULL || prog.address() == 0L) {
                throw new BPFProgramNotFound(name);
            }
            ProgramHandle programHandle = new ProgramHandle(name, prog);
            return programHandle;
        }
    }

    public BPFLink autoAttachProgram(ProgramHandle prog) {
        PanamaUtil.ResultAndErr<MemorySegment> ret = BPF_PROGRAM__ATTACH.call(prog.prog());
        if (ret.result() == MemorySegment.NULL) {
            throw new BPFAttachError(prog.name, ret.err());
        }
        BPFLink link2 = new BPFLink(ret.result());
        if (link2.segment.address() == 0L) {
            throw new BPFAttachError(prog.name, ret.err());
        }
        this.attachedPrograms.add(link2);
        return link2;
    }

    public BPFLink autoAttachProgram(String name) {
        return this.autoAttachProgram(this.getProgramByName(name));
    }

    public BPFProgram autoAttachPrograms() {
        for (String name : this.getAllAutoAttachablePrograms()) {
            this.autoAttachProgram(name);
        }
        return this;
    }

    public BPFLink rawTracepointAttach(String programName, String tracepoint2) {
        return this.rawTracepointAttach(this.getProgramByName(programName), tracepoint2);
    }

    public BPFLink rawTracepointAttach(ProgramHandle prog, String tracepoint2) {
        try (Arena arena = Arena.ofConfined();){
            PanamaUtil.ResultAndErr<MemorySegment> ret = BPF_PROGRAM__ATTACH_RAW_TRACEPOINT.call(prog.prog(), arena.allocateFrom(tracepoint2));
            if (ret.result() == MemorySegment.NULL) {
                throw new BPFAttachError(prog.name, ret.err());
            }
            BPFLink link2 = new BPFLink(ret.result());
            if (link2.segment.address() == 0L) {
                throw new BPFAttachError(prog.name, ret.err());
            }
            this.attachedPrograms.add(link2);
            BPFLink bPFLink = link2;
            return bPFLink;
        }
    }

    public BPFLink tracepointAttach(String programName, String tracepoint2) {
        return this.tracepointAttach(this.getProgramByName(programName), tracepoint2);
    }

    public BPFLink tracepointAttach(ProgramHandle prog, String tracepoint2) {
        try (Arena arena = Arena.ofConfined();){
            PanamaUtil.ResultAndErr<MemorySegment> ret = BPF_PROGRAM__ATTACH_TRACEPOINT.call(prog.prog(), arena.allocateFrom(tracepoint2));
            if (ret.result() == MemorySegment.NULL) {
                throw new BPFAttachError(prog.name, ret.err());
            }
            BPFLink link2 = new BPFLink(ret.result());
            if (link2.segment.address() == 0L) {
                throw new BPFAttachError(prog.name, ret.err());
            }
            this.attachedPrograms.add(link2);
            BPFLink bPFLink = link2;
            return bPFLink;
        }
    }

    public void xdpAttach(ProgramHandle prog, List<Integer> ifindex) {
        for (Integer index2 : ifindex) {
            this.xdpAttach(prog, index2);
        }
    }

    public void xdpAttach(ProgramHandle prog, int ifindex) {
        int flags;
        int fd2 = Lib.bpf_program__fd(prog.prog());
        int err = Lib.bpf_xdp_attach(ifindex, fd2, flags = 1, MemorySegment.NULL);
        if (err > 0) {
            throw new BPFAttachError(prog.name, err);
        }
        this.attachedXDPIfIndexes.add(new AttachedXDPIfIndex(ifindex, flags));
    }

    public void tcAttach(ProgramHandle prog, List<Integer> ifindex, boolean ingress) {
        for (Integer index2 : ifindex) {
            this.tcAttach(prog, index2, ingress);
        }
    }

    public void tcAttach(ProgramHandle prog, int ifindex, boolean ingress) {
        AttachedTCIfIndex tcIfIndex = new AttachedTCIfIndex(prog, ifindex, ingress, 0);
        try (Arena arena = Arena.ofConfined();){
            MemorySegment hook = this.allocateTCHookObject(arena, tcIfIndex);
            try {
                Runtime.getRuntime().exec(new String[]{"tc", "qdisc", "del", "dev", NetworkUtil.getNetworkInterfaceName(ifindex), "clsact"}).waitFor();
            } catch (IOException | InterruptedException exception2) {
                // empty catch block
            }
            hook = this.allocateTCHookObject(arena, tcIfIndex);
            MemorySegment opts = this.allocateTCOptsObject(arena, tcIfIndex);
            int err = Lib.bpf_tc_hook_create(hook);
            if (err > 0) {
                throw new BPFAttachError(prog.name, err);
            }
            err = Lib.bpf_tc_attach(hook, opts);
            if (err > 0) {
                throw new BPFAttachError(prog.name, err);
            }
            this.attachedTCIfIndices.add(tcIfIndex);
        }
    }

    @Nullable
    public static Path findCGroupPath(String cgroupName) {
        try {
            return Files.list(Path.of((String)"/sys/fs/cgroup", (String[])new String[0])).filter(p -> p.getFileName().toString().equals(cgroupName)).findFirst().orElse(null);
        } catch (IOException e) {
            return null;
        }
    }

    private void cgroupAttachInternal(ProgramHandle handle, String cgroupName) {
        Path cgroupPath = BPFProgram.findCGroupPath(cgroupName);
        if (cgroupPath == null) {
            throw new BPFAttachError(handle.name, "Cgroup not found: " + cgroupName);
        }
        PanamaUtil.ResultAndErr<Integer> fileFD = LibC.open(cgroupPath, Lib.O_RDONLY());
        if (fileFD.err() > 0) {
            throw new BPFAttachError(handle.name, fileFD.err());
        }
        this.openedFDs.add(fileFD.result());
        PanamaUtil.ResultAndErr<MemorySegment> resultAndErr = BPF_PROGRAM__ATTACH_CGROUP.call(handle.prog, fileFD.result());
        if (resultAndErr.err() > 0) {
            throw new BPFAttachError(handle.name, resultAndErr.err());
        }
        if (resultAndErr.result() == MemorySegment.NULL) {
            throw new BPFAttachError(handle.name, resultAndErr.err());
        }
        this.attachedPrograms.add(new BPFLink(resultAndErr.result()));
    }

    public void cgroupAttach(ProgramHandle handle, String cgroupName) {
        for (int i = 0; i < 3; ++i) {
            try {
                this.cgroupAttachInternal(handle, cgroupName);
                return;
            } catch (BPFAttachError e) {
                try {
                    Thread.sleep(100L);
                    continue;
                } catch (InterruptedException interruptedException) {
                    throw new BPFAttachError(handle.name, "Cgroup not found: " + cgroupName);
                }
            }
        }
        this.cgroupAttachInternal(handle, cgroupName);
    }

    private MemorySegment allocateTCHookObject(Arena arena, AttachedTCIfIndex tcIfIndex) {
        MemorySegment hook = arena.allocate(bpf_tc_hook.sizeof());
        hook.fill((byte)0);
        bpf_tc_hook.sz(hook, bpf_tc_hook.sizeof());
        bpf_tc_hook.ifindex(hook, tcIfIndex.ifindex);
        bpf_tc_hook.attach_point(hook, tcIfIndex.ingress ? Lib.BPF_TC_INGRESS() : Lib.BPF_TC_EGRESS());
        bpf_tc_hook.parent(hook, 0);
        return hook;
    }

    private MemorySegment allocateTCOptsObject(Arena arena, AttachedTCIfIndex tcIfIndex) {
        MemorySegment opts = arena.allocate(bpf_tc_opts.sizeof());
        int progFd = Lib.bpf_program__fd(tcIfIndex.handle.prog());
        if (progFd <= 0) {
            throw new BPFAttachError(tcIfIndex.handle.name, -progFd);
        }
        opts.fill((byte)0);
        bpf_tc_opts.sz(opts, bpf_tc_opts.sizeof());
        bpf_tc_opts.handle(opts, 1);
        bpf_tc_opts.prog_fd(opts, progFd);
        bpf_tc_opts.prog_id(opts, 0);
        bpf_tc_opts.priority(opts, tcIfIndex.priority);
        return opts;
    }

    private void tcDetach(AttachedTCIfIndex tcIfIndex) {
        try (Arena arena = Arena.ofConfined();){
            MemorySegment hook = this.allocateTCHookObject(arena, tcIfIndex);
            MemorySegment opts = this.allocateTCOptsObject(arena, tcIfIndex);
            int err = Lib.bpf_tc_detach(hook, opts);
            if (err > 0) {
                throw new BPFError("Detaching " + tcIfIndex.handle.name, err);
            }
        }
    }

    public void detachProgram(BPFLink link2) {
        if (!this.attachedPrograms.contains((Object)link2)) {
            throw new IllegalArgumentException("Program not attached");
        }
        if (link2.segment.address() == 0L) {
            throw new IllegalArgumentException("Improper link");
        }
        Lib.bpf_link__destroy(link2.segment);
        this.attachedPrograms.remove((Object)link2);
    }

    @Override
    public void close() {
        if (this.closed) {
            return;
        }
        this.closed = true;
        for (MemorySegment structOps : this.attachedStructOps) {
            Lib.bpf_link__destroy(structOps);
        }
        for (BPFLink prog : new HashSet<BPFLink>(this.attachedPrograms)) {
            this.detachProgram(prog);
        }
        for (AttachedXDPIfIndex ifindex : new HashSet<AttachedXDPIfIndex>(this.attachedXDPIfIndexes)) {
            Lib.bpf_xdp_detach(ifindex.ifindex, ifindex.flags, MemorySegment.NULL);
        }
        for (AttachedTCIfIndex tcIfIndex : new HashSet<AttachedTCIfIndex>(this.attachedTCIfIndices)) {
            this.tcDetach(tcIfIndex);
        }
        for (BPFMap map2 : new HashSet<BPFMap>(this.attachedMaps)) {
            map2.close();
        }
        Lib.bpf_object__close(this.ebpf_object);
        this.openedFDs.forEach(LibC::close);
    }

    public void tracePrintLoop() {
        TraceLog.getInstance().printLoop();
    }

    public void tracePrintLoopCleaned() {
        TraceLog.getInstance().printLoop(true);
    }

    public void tracePrintLoop(Function<TraceLog.TraceFields, @Nullable String> format) {
        TraceLog.getInstance().printLoop(format);
    }

    public String readTraceLine() {
        return TraceLog.getInstance().readLine();
    }

    public TraceLog.TraceFields readTraceFields() {
        return TraceLog.getInstance().readFields();
    }

    public FileDescriptor getMapDescriptorByName(String name) {
        try (Arena arena = Arena.ofConfined();){
            MemorySegment map2 = Lib.bpf_object__find_map_by_name(this.ebpf_object, arena.allocateFrom(name));
            if (map2 == MemorySegment.NULL || map2.address() == 0L) {
                throw new BPFMapNotFoundError(name);
            }
            FileDescriptor fileDescriptor = new FileDescriptor(name, map2, Lib.bpf_map__fd(map2));
            return fileDescriptor;
        }
    }

    public <T extends BPFMap> T recordMap(T map2) {
        this.attachedMaps.add(map2);
        return map2;
    }

    public <M extends BPFMap> M getMapByName(String name, Function<FileDescriptor, M> mapCreator) {
        return (M)this.recordMap((BPFMap)mapCreator.apply(this.getMapDescriptorByName(name)));
    }

    public <E> BPFRingBuffer<E> getRingBufferByName(String name, BPFType<E> eventType, BPFRingBuffer.EventCallback<E> callback2) {
        return this.recordMap(this.getMapByName(name, fd2 -> new BPFRingBuffer((FileDescriptor)((Object)fd2), eventType, callback2)));
    }

    public <K, V> BPFHashMap<K, V> getHashMapByName(String name, BPFType<K> keyType, BPFType<V> valueType) {
        FileDescriptor fd2;
        MapTypeId type2 = BPFMap.getInfo(fd2 = this.getMapDescriptorByName(name)).type();
        return this.recordMap(new BPFHashMap<K, V>(fd2, type2 == MapTypeId.LRU_HASH, keyType, valueType));
    }

    public void attachStructOps(String name) {
        FileDescriptor opsDescriptor = this.getMapDescriptorByName(name);
        if (opsDescriptor == null) {
            throw new BPFMapNotFoundError("Could not find struct ops " + name);
        }
        PanamaUtil.ResultAndErr<MemorySegment> res = BPF_MAP__ATTACH_STRUCT_OPS.call(opsDescriptor.map());
        if (res.result() == MemorySegment.NULL && res.hasError()) {
            throw new BPFAttachError("Failed to attach struct ops " + name, res.err());
        }
        this.attachedStructOps.add(res.result());
    }

    public void consumeAndThrow() {
        for (BPFMap map2 : this.attachedMaps) {
            if (!(map2 instanceof BPFRingBuffer)) continue;
            ((BPFRingBuffer)map2).consumeAndThrow();
        }
    }

    @Nullable
    private String getDefaultPropertyValue(String name) {
        ArrayDeque queue = new ArrayDeque(List.of(this.getClass()));
        while (!queue.isEmpty()) {
            PropertyDefinition prop;
            Class clazz = (Class)queue.poll();
            PropertyDefinitions annotation = clazz.getAnnotation(PropertyDefinitions.class);
            if (annotation != null) {
                for (PropertyDefinition prop2 : annotation.value()) {
                    if (!prop2.name().equals(name)) continue;
                    return prop2.defaultValue();
                }
            }
            if ((prop = clazz.getAnnotation(PropertyDefinition.class)) != null && prop.name().equals(name)) {
                return prop.defaultValue();
            }
            queue.addAll(Arrays.asList(clazz.getSuperclass().getInterfaces()));
        }
        return null;
    }

    @Nullable
    public String getPropertyValue(String name) {
        ArrayDeque queue = new ArrayDeque(List.of(this.getClass()));
        while (!queue.isEmpty()) {
            Property prop;
            Class clazz = (Class)queue.poll();
            Properties annotation = clazz.getAnnotation(Properties.class);
            if (annotation != null) {
                for (Property prop2 : annotation.value()) {
                    if (!prop2.name().equals(name)) continue;
                    return prop2.value();
                }
            }
            if ((prop = clazz.getAnnotation(Property.class)) != null && prop.name().equals(name)) {
                return prop.value();
            }
            queue.addAll(Arrays.asList(clazz.getInterfaces()));
            if (clazz.getSuperclass() == null) continue;
            queue.add(clazz.getSuperclass());
        }
        return this.getDefaultPropertyValue(name);
    }

    public BTF getBTF() {
        if (this.btf == null) {
            MemorySegment ret = Lib.bpf_object__btf(this.ebpf_object);
            if (Lib.libbpf_get_error(ret) != 0L) {
                throw new BPFError("Failed to get BTF");
            }
            this.btf = new BTF(ret);
        }
        return this.btf;
    }

    static {
        LibraryLoader.load();
        LibC.setRlimitMemlockToInfinity();
        BPF_OBJECT__LOAD = new PanamaUtil.HandlerWithErrno("bpf_object__load", FunctionDescriptor.of((MemoryLayout)ValueLayout.JAVA_INT, (MemoryLayout[])new MemoryLayout[]{PanamaUtil.POINTER}));
        BPF_OBJECT__OPEN_FILE = new PanamaUtil.HandlerWithErrno("bpf_object__open_file", FunctionDescriptor.of((MemoryLayout)PanamaUtil.POINTER, (MemoryLayout[])new MemoryLayout[]{PanamaUtil.POINTER, PanamaUtil.POINTER}));
        BPF_PROGRAM__ATTACH_LSM = new PanamaUtil.HandlerWithErrno("bpf_program__attach_lsm", FunctionDescriptor.of((MemoryLayout)PanamaUtil.POINTER, (MemoryLayout[])new MemoryLayout[]{PanamaUtil.POINTER}));
        BPF_PROGRAM__ATTACH = new PanamaUtil.HandlerWithErrno("bpf_program__attach", FunctionDescriptor.of((MemoryLayout)PanamaUtil.POINTER, (MemoryLayout[])new MemoryLayout[]{PanamaUtil.POINTER}));
        BPF_PROGRAM__ATTACH_RAW_TRACEPOINT = new PanamaUtil.HandlerWithErrno("bpf_program__attach_raw_tracepoint", FunctionDescriptor.of((MemoryLayout)PanamaUtil.POINTER, (MemoryLayout[])new MemoryLayout[]{PanamaUtil.POINTER, PanamaUtil.POINTER}));
        BPF_PROGRAM__ATTACH_TRACEPOINT = new PanamaUtil.HandlerWithErrno("bpf_program__attach_tracepoint", FunctionDescriptor.of((MemoryLayout)PanamaUtil.POINTER, (MemoryLayout[])new MemoryLayout[]{PanamaUtil.POINTER, PanamaUtil.POINTER}));
        BPF_PROGRAM__ATTACH_CGROUP = new PanamaUtil.HandlerWithErrno("bpf_program__attach_cgroup", FunctionDescriptor.of((MemoryLayout)PanamaUtil.POINTER, (MemoryLayout[])new MemoryLayout[]{PanamaUtil.POINTER, ValueLayout.JAVA_INT}));
        BPF_MAP__ATTACH_STRUCT_OPS = new PanamaUtil.HandlerWithErrno("bpf_map__attach_struct_ops", FunctionDescriptor.of((MemoryLayout)PanamaUtil.POINTER, (MemoryLayout[])new MemoryLayout[]{PanamaUtil.POINTER}));
    }

    public static class BTF {
        private final MemorySegment bpfObject;
        private Map<Integer, BTFType> types = new HashMap<Integer, BTFType>();

        BTF(MemorySegment bpfObject) {
            this.bpfObject = bpfObject;
        }

        int findIdByName(String name) {
            try (Arena arena = Arena.ofConfined();){
                int id = Lib.btf__find_by_name(this.bpfObject, arena.allocateFrom(name));
                if (id < 0) {
                    throw new BPFError("Failed to find BTF by name: " + name);
                }
                int n = id;
                return n;
            }
        }

        BTFType getTypeById(int id) {
            return this.types.computeIfAbsent(id, i -> {
                try (Arena arena = Arena.ofConfined();){
                    MemorySegment segment = Lib.btf__type_by_id(this.bpfObject, id);
                    if (segment == MemorySegment.NULL) {
                        throw new BPFError("Failed to get BTF type by id: " + id);
                    }
                    BTFType bTFType = new BTFType(this, segment);
                    return bTFType;
                }
            });
        }

        BTFType findTypeByName(String name) {
            return this.getTypeById(this.findIdByName(name));
        }

        public static class BTFType {
            private final BTF btf;
            private final MemorySegment typeObj;
            private final Kind kind;
            private final String name;

            private static int kind(int info2) {
                return info2 >> 24 & 0xFF;
            }

            private static int vlen(int info2) {
                return info2 & 0xFFFF;
            }

            public BTFType(BTF btf2, MemorySegment typeObj) {
                this.btf = btf2;
                this.typeObj = typeObj;
                this.kind = Kind.fromValue(BTFType.kind(btf_type.info(typeObj)));
                this.name = PanamaUtil.toString(Lib.btf__name_by_offset(btf2.bpfObject, btf_type.name_off(typeObj)));
            }

            Kind kind() {
                return this.kind;
            }

            String name() {
                return this.name;
            }

            int memberCount() {
                return BTFType.vlen(btf_type.info(this.typeObj));
            }

            List<VariableSectionInfo> getVariableSectionInfos() {
                long infos = this.typeObj.address() + btf_type.sizeof();
                return IntStream.range(0, this.memberCount()).mapToObj(i -> {
                    MemorySegment elem = MemorySegment.ofAddress((long)(infos + (long)i * btf_var_secinfo.sizeof())).reinterpret(btf_var_secinfo.sizeof());
                    return new VariableSectionInfo(this.btf.getTypeById(btf_var_secinfo.type(elem)), btf_var_secinfo.offset(elem), btf_var_secinfo.size(elem));
                }).toList();
            }

            record VariableSectionInfo(BTFType type, int offset, int size) {
                String name() {
                    return this.type.name;
                }
            }
        }

        public static enum Kind {
            UNKN(0),
            INT(1),
            PTR(2),
            ARRAY(3),
            STRUCT(4),
            UNION(5),
            ENUM(6),
            FWD(7),
            TYPEDEF(8),
            VOLATILE(9),
            CONST(10),
            RESTRICT(11),
            FUNC(12),
            FUNC_PROTO(13),
            VAR(14),
            DATASEC(15),
            FLOAT(16),
            DECL_TAG(17),
            TYPE_TAG(18),
            ENUM64(19);

            private final int value;

            private Kind(int value) {
                this.value = value;
            }

            public int value() {
                return this.value;
            }

            public static Kind fromValue(int value) {
                return Kind.values()[value];
            }
        }
    }

    public static class BPFLoadError
    extends BPFError {
        public BPFLoadError(String message) {
            super(message);
        }
    }

    public record ProgramHandle(String name, MemorySegment prog) {
    }

    public static class BPFAttachError
    extends BPFError {
        private final int error;

        public BPFAttachError(String name, int errorCode) {
            super("Failed to attach " + name, errorCode);
            this.error = errorCode;
        }

        public BPFAttachError(String name, String message) {
            super("Failed to attach " + name + ":" + message);
            this.error = 0;
        }

        public int getErrorCode() {
            return this.error;
        }
    }

    public record BPFLink(MemorySegment segment) {
    }

    public static class BPFProgramNotFound
    extends BPFError {
        public BPFProgramNotFound(String name) {
            super("Program not found: " + name);
        }
    }

    record AttachedXDPIfIndex(int ifindex, int flags) {
    }

    record AttachedTCIfIndex(ProgramHandle handle, int ifindex, boolean ingress, int priority) {
    }

    public static class BPFMapNotFoundError
    extends BPFError {
        public BPFMapNotFoundError(String name) {
            super("Map not found: " + name);
        }
    }
}

