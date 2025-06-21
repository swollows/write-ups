/*
 * Decompiled with CFR 0.153-SNAPSHOT (d6f6758-dirty).
 */
package me.bechberger.ebpf.bpf;

import java.net.InetAddress;
import java.net.NetworkInterface;
import java.net.SocketException;
import java.net.URI;
import java.net.URL;
import java.net.URLConnection;
import java.net.UnknownHostException;
import java.util.Collections;
import java.util.List;
import me.bechberger.ebpf.annotations.Unsigned;

public class NetworkUtil {
    public static final int XDP_FLAGS_UPDATE_IF_NOEXIST = 1;
    public static final int XDP_FLAGS_SKB_MODE = 2;
    public static final int XDP_FLAGS_DRV_MODE = 4;
    public static final int XDP_FLAGS_HW_MODE = 8;
    public static final int XDP_FLAGS_REPLACE = 16;
    public static final int XDP_FLAGS_MODES = 14;
    public static final int XDP_FLAGS_MASK = 31;

    public static int getNetworkInterfaceIndex() {
        return NetworkUtil.getNetworkInterfaceIndexes(false).stream().findFirst().orElse(-1);
    }

    public static List<Integer> getNetworkInterfaceIndexes(boolean includeLoopback) {
        try {
            return Collections.list(NetworkInterface.getNetworkInterfaces()).stream().filter(i -> {
                try {
                    return i.isUp() && (!i.isLoopback() || includeLoopback);
                } catch (SocketException e) {
                    return false;
                }
            }).map(NetworkInterface::getIndex).toList();
        } catch (SocketException e) {
            throw new RuntimeException(e);
        }
    }

    public static List<Integer> getNetworkInterfaceIndexes() {
        return NetworkUtil.getNetworkInterfaceIndexes(false);
    }

    public static String getNetworkInterfaceName(int index2) {
        try {
            return ((NetworkInterface)Collections.list(NetworkInterface.getNetworkInterfaces()).stream().filter(iface -> iface.getIndex() == index2).findFirst().orElseThrow()).getDisplayName();
        } catch (SocketException e) {
            throw new RuntimeException(e);
        }
    }

    public static int ipAddressToInt(InetAddress addr2) {
        byte[] bytes = addr2.getAddress();
        return bytes[3] << 24 | (bytes[2] & 0xFF) << 16 | (bytes[1] & 0xFF) << 8 | bytes[0] & 0xFF;
    }

    public static int ipAddressToInt(String addr2) {
        if (addr2.matches("\\d+\\.\\d+\\.\\d+\\.\\d+")) {
            return NetworkUtil.ipAddressToInt(InetAddress.ofLiteral((String)addr2));
        }
        try {
            return NetworkUtil.ipAddressToInt(InetAddress.getByName(addr2));
        } catch (UnknownHostException e) {
            throw new RuntimeException(e);
        }
    }

    public static InetAddress intToIpAddress(int addr2) {
        byte[] bytes = new byte[]{(byte)(addr2 & 0xFF), (byte)(addr2 >> 8 & 0xFF), (byte)(addr2 >> 16 & 0xFF), (byte)(addr2 >> 24 & 0xFF)};
        try {
            return InetAddress.getByAddress(bytes);
        } catch (UnknownHostException e) {
            throw new RuntimeException(e);
        }
    }

    public static void openURLInLoop(String url) {
        new Thread(() -> {
            try {
                while (true) {
                    System.out.println("Opening " + url);
                    URLConnection connection = URL.of((URI)URI.create("https://" + url), null).openConnection();
                    System.out.println("Read " + connection.getInputStream().readAllBytes().length + " bytes");
                    Thread.sleep(1000L);
                }
            } catch (Exception e) {
                System.out.println("Error: " + e.getMessage());
                return;
            }
        }).start();
    }

    public static String openURL(String url) {
        try {
            URLConnection connection = URL.of((URI)URI.create("https://" + url), null).openConnection();
            return new String(connection.getInputStream().readAllBytes());
        } catch (Exception e) {
            return "Error: " + e.getMessage();
        }
    }

    public static @Unsigned int getFirstIPAddress(String s2) {
        try {
            return NetworkUtil.ipAddressToInt(InetAddress.getByName(s2));
        } catch (UnknownHostException e) {
            throw new RuntimeException(e);
        }
    }

    public static byte[] readFromURL(String url, int port2) {
        try {
            URLConnection connection = URL.of((URI)URI.create("https://" + url + ":" + port2), null).openConnection();
            return connection.getInputStream().readAllBytes();
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
    }
}

