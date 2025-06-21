/*
 * Decompiled with CFR 0.153-SNAPSHOT (d6f6758-dirty).
 * 
 * Could not load the following classes:
 *  java.lang.foreign.Arena
 *  java.lang.foreign.MemorySegment
 *  java.lang.foreign.SegmentAllocator
 */
package me.bechberger.ebpf.bpf.map;

import java.lang.foreign.Arena;
import java.lang.foreign.MemorySegment;
import java.lang.foreign.SegmentAllocator;
import me.bechberger.ebpf.bpf.BPFError;
import me.bechberger.ebpf.bpf.map.FileDescriptor;
import me.bechberger.ebpf.bpf.map.MapTypeId;
import me.bechberger.ebpf.bpf.raw.Lib;
import me.bechberger.ebpf.bpf.raw.bpf_map_info;
import me.bechberger.ebpf.shared.PanamaUtil;

public class BPFMap {
    protected final MapTypeId typeId;
    protected final FileDescriptor fd;
    protected final MapInfo info;

    public BPFMap(MapTypeId typeId, FileDescriptor fd2) {
        this.typeId = typeId == null ? BPFMap.getInfo((FileDescriptor)fd2).type : typeId;
        this.fd = fd2;
        this.info = BPFMap.getInfo(fd2);
        if (typeId != null && this.info.type != typeId) {
            throw new BPFMapTypeMismatch(typeId, this.info.type);
        }
    }

    private static MemorySegment obtainRawInfo(Arena arena, FileDescriptor fd2) {
        MemorySegment info2 = bpf_map_info.allocate((SegmentAllocator)arena);
        MemorySegment infoSizeRef = PanamaUtil.allocateIntRef(arena, (int)info2.byteSize());
        int ret = Lib.bpf_obj_get_info_by_fd(fd2.fd(), info2, infoSizeRef);
        if (ret < 0) {
            throw new BPFError("Failed to get map info", ret);
        }
        return info2;
    }

    public static MapInfo getInfo(FileDescriptor fd2) {
        try (Arena arena = Arena.ofConfined();){
            MemorySegment info2 = BPFMap.obtainRawInfo(arena, fd2);
            MapInfo mapInfo = new MapInfo(fd2, MapTypeId.fromId(bpf_map_info.type(info2)), bpf_map_info.key_size(info2), bpf_map_info.value_size(info2), bpf_map_info.max_entries(info2), bpf_map_info.map_flags(info2));
            return mapInfo;
        }
    }

    public void close() {
        Lib.close(this.fd.fd());
    }

    public MapInfo getInfo() {
        return this.info;
    }

    public int getMaxEntries() {
        return this.info.maxEntries;
    }

    public FileDescriptor getFd() {
        return this.fd;
    }

    public record MapInfo(FileDescriptor fd, MapTypeId type, int keySize, int valueSize, int maxEntries, int mapFlags) {
    }

    public static class BPFMapTypeMismatch
    extends BPFError {
        public BPFMapTypeMismatch(MapTypeId expected, MapTypeId actual) {
            super("Map type mismatch, expected " + String.valueOf((Object)expected) + " but got " + String.valueOf((Object)actual));
        }
    }
}

