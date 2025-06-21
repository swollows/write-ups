/*
 * Decompiled with CFR 0.153-SNAPSHOT (d6f6758-dirty).
 */
package me.bechberger.ebpf.shared;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;
import java.util.stream.IntStream;
import java.util.stream.Stream;
import org.jetbrains.annotations.Nullable;

public class Syscalls {
    private static List<Syscall> syscalls = null;
    private static List<@Nullable Syscall> orderedSyscalls = null;
    private static Map<String, Syscall> syscallMap = null;

    private static void initIfNeeded() {
        if (syscalls == null) {
            try {
                syscalls = Syscalls.parse();
            } catch (IOException | InterruptedException e) {
                throw new RuntimeException(e);
            }
            Map<Integer, Syscall> map2 = syscalls.stream().collect(Collectors.toMap(Syscall::number, s2 -> s2));
            int max = syscalls.stream().mapToInt(Syscall::number).max().orElseThrow();
            orderedSyscalls = IntStream.range(0, max + 1).boxed().map(i -> map2.getOrDefault(i, null)).toList();
            syscallMap = syscalls.stream().collect(Collectors.toMap(Syscall::name, s2 -> s2));
        }
    }

    public static List<Syscall> getSyscalls() {
        Syscalls.initIfNeeded();
        return syscalls;
    }

    public static List<@Nullable Syscall> getOrderedSyscalls() {
        Syscalls.initIfNeeded();
        return orderedSyscalls;
    }

    public static Map<String, Syscall> getSyscallMap() {
        Syscalls.initIfNeeded();
        return syscallMap;
    }

    public static Syscall getSyscall(String name) {
        return Syscalls.getSyscallMap().get(name);
    }

    public static Syscall getSyscall(int number) {
        return Syscalls.getOrderedSyscalls().get(number);
    }

    private static List<Syscall> parse() throws IOException, InterruptedException {
        Process process = Runtime.getRuntime().exec(new String[]{"cpp", "-dM"});
        process.getOutputStream().write("#include <sys/syscall.h>\n".getBytes());
        process.getOutputStream().close();
        int ret = process.waitFor();
        if (ret != 0) {
            throw new RuntimeException("Could not run cpp");
        }
        BufferedReader output = new BufferedReader(new InputStreamReader(process.getInputStream()));
        HashMap map2 = new HashMap();
        return output.lines().filter(line2 -> line2.matches("#define __NR[a-zA-Z0-9_]+ [0-9]+")).flatMap(line2 -> {
            String[] parts = line2.split(" ");
            if (parts[1].startsWith("__NR_")) {
                String name = parts[1].substring("__NR_".length());
                if (map2.containsKey(parts[2])) {
                    return Stream.of(new Syscall(name, (Integer)map2.get(parts[2])));
                }
                int number = Integer.parseInt(parts[2]);
                return Stream.of(new Syscall(name, number));
            }
            map2.put(parts[1], Integer.parseInt(parts[2]));
            return Stream.empty();
        }).toList();
    }

    public static void main(String[] args) {
        for (Syscall syscall2 : Syscalls.getOrderedSyscalls()) {
            if (syscall2 == null) continue;
            System.out.println(syscall2.name() + " " + syscall2.number());
        }
    }

    public record Syscall(String name, int number) {
    }
}

