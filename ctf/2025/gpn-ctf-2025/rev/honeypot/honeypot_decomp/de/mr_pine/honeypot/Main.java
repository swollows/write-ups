/*
 * Decompiled with CFR 0.153-SNAPSHOT (d6f6758-dirty).
 */
package de.mr_pine.honeypot;

import de.mr_pine.honeypot.scheduler.Honeypot;
import java.io.IOException;
import java.security.NoSuchAlgorithmException;
import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) throws IOException, NoSuchAlgorithmException {
        String sleepPid = args[0];
        ArrayList killCommand = new ArrayList(List.of((Object)"kill", (Object)"-9", (Object)"--", (Object)args[1]));
        Honeypot.run(sleepPid, killCommand.toArray(new String[0]));
        System.exit(1);
    }
}

