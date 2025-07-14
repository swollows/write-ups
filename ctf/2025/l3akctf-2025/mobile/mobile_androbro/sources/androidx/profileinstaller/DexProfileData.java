package androidx.profileinstaller;

import java.util.TreeMap;

class DexProfileData {
    final String apkName;
    int classSetSize;
    int[] classes;
    final long dexChecksum;
    final String dexName;
    final int hotMethodRegionSize;
    long mTypeIdCount;
    final TreeMap<Integer, Integer> methods;
    final int numMethodIds;

    DexProfileData(String apkName2, String dexName2, long dexChecksum2, long typeIdCount, int classSetSize2, int hotMethodRegionSize2, int numMethodIds2, int[] classes2, TreeMap<Integer, Integer> methods2) {
        this.apkName = apkName2;
        this.dexName = dexName2;
        this.dexChecksum = dexChecksum2;
        this.mTypeIdCount = typeIdCount;
        this.classSetSize = classSetSize2;
        this.hotMethodRegionSize = hotMethodRegionSize2;
        this.numMethodIds = numMethodIds2;
        this.classes = classes2;
        this.methods = methods2;
    }
}
