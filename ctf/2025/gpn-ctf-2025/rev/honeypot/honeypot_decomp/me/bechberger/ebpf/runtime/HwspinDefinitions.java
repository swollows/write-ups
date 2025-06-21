/*
 * Decompiled with CFR 0.153-SNAPSHOT (d6f6758-dirty).
 */
package me.bechberger.ebpf.runtime;

import me.bechberger.ebpf.annotations.Unsigned;
import me.bechberger.ebpf.annotations.bpf.BuiltinBPFFunction;
import me.bechberger.ebpf.annotations.bpf.MethodIsBPFRelatedFunction;
import me.bechberger.ebpf.annotations.bpf.NotUsableInJava;
import me.bechberger.ebpf.runtime.misc;
import me.bechberger.ebpf.runtime.runtime;
import me.bechberger.ebpf.type.Ptr;

public final class HwspinDefinitions {
    @NotUsableInJava
    @BuiltinBPFFunction
    public static int __hwspin_lock_request(Ptr<runtime.hwspinlock> hwlock) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int __hwspin_lock_timeout(Ptr<runtime.hwspinlock> hwlock, @Unsigned int to, int mode, Ptr<@Unsigned Long> flags) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int __hwspin_trylock(Ptr<runtime.hwspinlock> hwlock, int mode, Ptr<@Unsigned Long> flags) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void __hwspin_unlock(Ptr<runtime.hwspinlock> hwlock, int mode, Ptr<@Unsigned Long> flags) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int hwspin_lock_bust(Ptr<runtime.hwspinlock> hwlock, @Unsigned int id) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int hwspin_lock_free(Ptr<runtime.hwspinlock> hwlock) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int hwspin_lock_get_id(Ptr<runtime.hwspinlock> hwlock) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction(value="hwspin_lock_register($arg1, $arg2, (const struct hwspinlock_ops*)$arg3, $arg4, $arg5)")
    public static int hwspin_lock_register(Ptr<misc.hwspinlock_device> bank, Ptr<runtime.device> dev, Ptr<misc.hwspinlock_ops> ops, int base_id, int num_locks) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static Ptr<runtime.hwspinlock> hwspin_lock_request() {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static Ptr<runtime.hwspinlock> hwspin_lock_request_specific(@Unsigned int id) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int hwspin_lock_unregister(Ptr<misc.hwspinlock_device> bank) {
        throw new MethodIsBPFRelatedFunction();
    }
}

