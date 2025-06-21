/*
 * Decompiled with CFR 0.153-SNAPSHOT (d6f6758-dirty).
 */
package me.bechberger.ebpf.shared;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.Arrays;
import java.util.Collection;
import java.util.Comparator;
import java.util.List;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class Util {
    public static List<Integer> getOnlineCPUs() {
        return Util.readCPURange("/sys/devices/system/cpu/online");
    }

    public static List<Integer> getPossibleCPUs() {
        return Util.readCPURange("/sys/devices/system/cpu/possible");
    }

    private static List<Integer> readCPURange(String path2) {
        try {
            return Arrays.stream(Files.readAllLines(Path.of((String)path2, (String[])new String[0])).get(0).split(",")).flatMap(cpuRange -> {
                int rangeOp = cpuRange.indexOf(45);
                if (rangeOp == -1) {
                    return Stream.of(Integer.valueOf(Integer.parseInt(cpuRange)));
                }
                int start = Integer.parseInt(cpuRange.substring(0, rangeOp));
                int end = Integer.parseInt(cpuRange.substring(rangeOp + 1));
                return IntStream.range(start, end + 1).boxed();
            }).toList();
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }

    public static String computeEditDistance(String a, String b) {
        int[][] dp = new int[a.length() + 1][b.length() + 1];
        for (int i = 0; i <= a.length(); ++i) {
            for (int j = 0; j <= b.length(); ++j) {
                dp[i][j] = i == 0 ? j : (j == 0 ? i : Math.min(Math.min(dp[i - 1][j - 1] + (a.charAt(i - 1) == b.charAt(j - 1) ? 0 : 1), dp[i - 1][j] + 1), dp[i][j - 1] + 1));
            }
        }
        return Integer.toString(dp[a.length()][b.length()]);
    }

    public static String getClosestString(String target, Collection<String> options) {
        return options.stream().min(Comparator.comparing(a -> Util.computeEditDistance(target, a))).orElse(target);
    }
}

