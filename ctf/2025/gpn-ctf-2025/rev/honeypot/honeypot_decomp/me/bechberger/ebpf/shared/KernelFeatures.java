/*
 * Decompiled with CFR 0.153-SNAPSHOT (d6f6758-dirty).
 */
package me.bechberger.ebpf.shared;

import java.lang.reflect.Method;
import java.nio.file.Files;
import java.nio.file.LinkOption;
import java.nio.file.Path;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashSet;
import java.util.List;
import java.util.NoSuchElementException;
import java.util.Set;
import me.bechberger.ebpf.annotations.bpf.Requires;
import me.bechberger.ebpf.shared.PanamaUtil;

public class KernelFeatures {
    public static List<String> getMissingFeatures(Set<String> requiredFeatures) {
        List<String> availableFeatures = KernelFeatures.getAvailableKernelFeatures();
        ArrayList<String> missingFeatures = new ArrayList<String>();
        for (String feature : requiredFeatures) {
            if (availableFeatures.contains(feature)) continue;
            missingFeatures.add(feature);
        }
        Collections.sort(missingFeatures);
        return missingFeatures;
    }

    public static void checkRequirements(String message, Class<?> clazz) {
        List<String> missingFeatures = KernelFeatures.getMissingFeatures(KernelFeatures.getRequiredKernelFeatures(clazz));
        if (!missingFeatures.isEmpty()) {
            throw new BPFNotSupported(message, missingFeatures);
        }
    }

    private static Set<String> getRequiredKernelFeatures(Class<?> clazz) {
        HashSet<String> requirements = new HashSet<String>();
        Requires requires = clazz.getAnnotation(Requires.class);
        if (requires != null) {
            requirements.addAll(KernelFeatures.getRequiredKernelFeatures(requires));
        }
        for (Class<?> iface : clazz.getInterfaces()) {
            requirements.addAll(KernelFeatures.getRequiredKernelFeatures(iface));
        }
        return requirements;
    }

    public static List<String> getRequiredKernelFeatures(Requires requires) {
        return Arrays.stream(requires.getClass().getMethods()).filter(method -> {
            try {
                return (Boolean)method.invoke(requires, new Object[0]);
            } catch (Exception e) {
                return false;
            }
        }).map(Method::getName).toList();
    }

    public static List<String> getAvailableKernelFeatures() {
        ArrayList<String> availableFeatures = new ArrayList<String>();
        if (Files.exists(Path.of((String)"/sys/kernel/sched_ext/", (String[])new String[0]), new LinkOption[0])) {
            availableFeatures.add("sched_ext");
        }
        return availableFeatures;
    }

    private static boolean checkThatNativeFunctionExists(String functionName) {
        try {
            PanamaUtil.lookup(functionName);
            return true;
        } catch (NoSuchElementException e) {
            return false;
        }
    }

    static class BPFNotSupported
    extends RuntimeException {
        public BPFNotSupported(String message, List<String> missingFeatures) {
            super(message + ": the following features are not available: " + String.join((CharSequence)", ", missingFeatures));
        }
    }
}

