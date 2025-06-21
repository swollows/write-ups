/*
 * Decompiled with CFR 0.153-SNAPSHOT (d6f6758-dirty).
 * 
 * Could not load the following classes:
 *  java.lang.foreign.Arena
 *  java.lang.foreign.MemorySegment
 */
package me.bechberger.ebpf.bpf;

import java.lang.foreign.Arena;
import java.lang.foreign.MemorySegment;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;
import me.bechberger.ebpf.annotations.bpf.BuiltinBPFFunction;
import me.bechberger.ebpf.bpf.BPFError;
import me.bechberger.ebpf.bpf.BPFProgram;
import me.bechberger.ebpf.bpf.map.BPFMap;
import me.bechberger.ebpf.bpf.raw.Lib_1;
import me.bechberger.ebpf.shared.PanamaUtil;
import me.bechberger.ebpf.type.BPFType;

public class GlobalVariable<T> {
    private final T initialValue;
    private Globals globals;
    private BPFType<T> type;
    private String name;

    public GlobalVariable(T initialValue) {
        this.initialValue = initialValue;
    }

    public void init(Globals globals, BPFType<T> type2, String name) {
        this.globals = globals;
        this.type = type2;
        this.name = name;
    }

    @BuiltinBPFFunction(value="$this = $arg1")
    public void set(T value) {
        this.globals.set(this.name, this, value);
    }

    @BuiltinBPFFunction(value="$this")
    public T get() {
        return this.globals.get(this.name, this.type);
    }

    public static class Globals {
        private final BPFMap dataMap;
        private final Map<String, Integer> offsetsPerVariable;

        private Globals(BPFMap dataMap, Map<String, Integer> offsetsPerVariable) {
            this.dataMap = dataMap;
            this.offsetsPerVariable = offsetsPerVariable;
        }

        public static Globals forProgram(BPFProgram program) {
            BPFMap dataMap = new BPFMap(null, program.getMapDescriptorByName(".data"));
            return new Globals(dataMap, Globals.findOffsetsPerVariable(program));
        }

        private static Map<String, Integer> findOffsetsPerVariable(BPFProgram program) {
            try (Arena arena = Arena.ofConfined();){
                BPFProgram.BTF btf2 = program.getBTF();
                Map<String, Integer> map2 = btf2.findTypeByName(".data").getVariableSectionInfos().stream().collect(Collectors.toMap(BPFProgram.BTF.BTFType.VariableSectionInfo::name, BPFProgram.BTF.BTFType.VariableSectionInfo::offset));
                return map2;
            }
        }

        public void set(Map<GlobalVariable<?>, ?> values) {
            try (Arena arena = Arena.ofConfined();){
                MemorySegment buffer = arena.allocate((long)this.dataMap.getInfo().valueSize());
                MemorySegment zeroRef = PanamaUtil.allocateIntRef(arena, 0);
                int ret = Lib_1.bpf_map_lookup_elem(this.dataMap.getFd().fd(), zeroRef, buffer);
                if (ret < 0) {
                    throw new BPFError("Failed to read .data", ret);
                }
                for (Map.Entry<GlobalVariable<?>, ?> entry : values.entrySet()) {
                    GlobalVariable<?> globalVariable = entry.getKey();
                    Object value = entry.getValue();
                    globalVariable.type.setMemory(buffer.asSlice((long)this.offsetsPerVariable.get(globalVariable.name).intValue()), value);
                }
                ret = Lib_1.bpf_map_update_elem(this.dataMap.getFd().fd(), zeroRef, buffer, 0L);
                if (ret < 0) {
                    throw new BPFError("Failed to write .data", ret);
                }
            }
        }

        public <T> void set(String name, GlobalVariable<T> globalVariable, T value) {
            this.set(Map.of(globalVariable, value));
        }

        public void initGlobals(List<GlobalVariableInitInfo<?>> globalVariables) {
            for (GlobalVariableInitInfo<?> globalVariable : globalVariables) {
                globalVariable.variable.init(this, globalVariable.type, globalVariable.name);
            }
            this.set(globalVariables.stream().collect(Collectors.toMap(GlobalVariableInitInfo::variable, i -> i.variable.initialValue)));
        }

        public <T> T get(String name, BPFType<T> type2) {
            try (Arena arena = Arena.ofConfined();){
                MemorySegment buffer = arena.allocate((long)this.dataMap.getInfo().valueSize());
                MemorySegment zeroRef = PanamaUtil.allocateIntRef(arena, 0);
                int ret = Lib_1.bpf_map_lookup_elem(this.dataMap.getFd().fd(), zeroRef, buffer);
                if (ret < 0) {
                    throw new BPFError("Failed to read .data", ret);
                }
                T t = type2.parseMemory(buffer.asSlice((long)this.offsetsPerVariable.get(name).intValue()));
                return t;
            }
        }
    }

    public record GlobalVariableInitInfo<T>(GlobalVariable<T> variable, String name, BPFType<T> type) {
    }
}

