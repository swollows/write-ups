/*
 * Decompiled with CFR 0.153-SNAPSHOT (d6f6758-dirty).
 */
package me.bechberger.ebpf.runtime;

import me.bechberger.ebpf.annotations.OriginalName;
import me.bechberger.ebpf.annotations.Unsigned;
import me.bechberger.ebpf.annotations.bpf.BuiltinBPFFunction;
import me.bechberger.ebpf.annotations.bpf.MethodIsBPFRelatedFunction;
import me.bechberger.ebpf.annotations.bpf.NotUsableInJava;
import me.bechberger.ebpf.runtime.EhciDefinitions;
import me.bechberger.ebpf.runtime.ListDefinitions;
import me.bechberger.ebpf.runtime.runtime;
import me.bechberger.ebpf.type.Ptr;

public final class QhDefinitions {
    @NotUsableInJava
    @BuiltinBPFFunction
    public static Ptr<EhciDefinitions.ehci_qh> qh_append_tds(Ptr<EhciDefinitions.ehci_hcd> ehci, Ptr<runtime.urb> urb2, Ptr<ListDefinitions.list_head> qtd_list, int epnum, Ptr<Ptr<?>> ptr) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static @Unsigned int qh_completions(Ptr<EhciDefinitions.ehci_hcd> ehci, Ptr<EhciDefinitions.ehci_qh> qh) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void qh_destroy(Ptr<EhciDefinitions.ehci_hcd> ehci, Ptr<EhciDefinitions.ehci_qh> qh) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void qh_lines(Ptr<EhciDefinitions.ehci_hcd> ehci, Ptr<EhciDefinitions.ehci_qh> qh, Ptr<String> nextp, Ptr<@Unsigned Integer> sizep) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void qh_link_async(Ptr<EhciDefinitions.ehci_hcd> ehci, Ptr<EhciDefinitions.ehci_qh> qh) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void qh_link_periodic(Ptr<EhciDefinitions.ehci_hcd> ehci, Ptr<EhciDefinitions.ehci_qh> qh) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static Ptr<EhciDefinitions.ehci_qh> qh_make(Ptr<EhciDefinitions.ehci_hcd> ehci, Ptr<runtime.urb> urb2, @Unsigned @OriginalName(value="gfp_t") int flags) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void qh_refresh(Ptr<EhciDefinitions.ehci_hcd> ehci, Ptr<EhciDefinitions.ehci_qh> qh) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int qh_schedule(Ptr<EhciDefinitions.ehci_hcd> ehci, Ptr<EhciDefinitions.ehci_qh> qh) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void qh_unlink_periodic(Ptr<EhciDefinitions.ehci_hcd> ehci, Ptr<EhciDefinitions.ehci_qh> qh) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static Ptr<ListDefinitions.list_head> qh_urb_transaction(Ptr<EhciDefinitions.ehci_hcd> ehci, Ptr<runtime.urb> urb2, Ptr<ListDefinitions.list_head> head, @Unsigned @OriginalName(value="gfp_t") int flags) {
        throw new MethodIsBPFRelatedFunction();
    }
}

