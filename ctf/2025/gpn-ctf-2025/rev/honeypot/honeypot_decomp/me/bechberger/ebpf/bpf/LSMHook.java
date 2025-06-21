/*
 * Decompiled with CFR 0.153-SNAPSHOT (d6f6758-dirty).
 */
package me.bechberger.ebpf.bpf;

import me.bechberger.ebpf.annotations.Includes;
import me.bechberger.ebpf.annotations.bpf.BPFFunction;
import me.bechberger.ebpf.bpf.BPFProgram;
import me.bechberger.ebpf.runtime.runtime;
import me.bechberger.ebpf.type.Ptr;

@Includes(value={"linux/lsm_hook_defs.h", "linux/lsm_hooks.h", "linux/security.h"})
public interface LSMHook {
    public static final int EACCES = -13;

    @BPFFunction(headerTemplate="int BPF_PROG($name, struct file *file)", section="lsm/u")
    public int restrictFileOpen(Ptr<runtime.file> var1);

    default public void attachLSMHooks() {
        LSMHook lSMHook = this;
        if (!(lSMHook instanceof BPFProgram)) {
            throw new IllegalStateException("Cannot attach LSM hooks to non-BPFProgram");
        }
        BPFProgram program = (BPFProgram)((Object)lSMHook);
        program.attachLSMHooks();
    }
}

