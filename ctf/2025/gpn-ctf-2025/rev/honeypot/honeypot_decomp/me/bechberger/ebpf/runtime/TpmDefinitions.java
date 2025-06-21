/*
 * Decompiled with CFR 0.153-SNAPSHOT (d6f6758-dirty).
 */
package me.bechberger.ebpf.runtime;

import me.bechberger.ebpf.annotations.InlineUnion;
import me.bechberger.ebpf.annotations.OriginalName;
import me.bechberger.ebpf.annotations.Size;
import me.bechberger.ebpf.annotations.Type;
import me.bechberger.ebpf.annotations.Unsigned;
import me.bechberger.ebpf.annotations.bpf.BuiltinBPFFunction;
import me.bechberger.ebpf.annotations.bpf.MethodIsBPFRelatedFunction;
import me.bechberger.ebpf.annotations.bpf.NotUsableInJava;
import me.bechberger.ebpf.runtime.AttributeDefinitions;
import me.bechberger.ebpf.runtime.DeviceDefinitions;
import me.bechberger.ebpf.runtime.FileDefinitions;
import me.bechberger.ebpf.runtime.PlatformDefinitions;
import me.bechberger.ebpf.runtime.PnpDefinitions;
import me.bechberger.ebpf.runtime.PollDefinitions;
import me.bechberger.ebpf.runtime.SeqDefinitions;
import me.bechberger.ebpf.runtime.WaitDefinitions;
import me.bechberger.ebpf.runtime.misc;
import me.bechberger.ebpf.runtime.runtime;
import me.bechberger.ebpf.type.Enum;
import me.bechberger.ebpf.type.Ptr;
import me.bechberger.ebpf.type.Struct;
import me.bechberger.ebpf.type.TypedEnum;

public final class TpmDefinitions {
    @NotUsableInJava
    @BuiltinBPFFunction
    public static void tpm_bios_log_setup(Ptr<tpm_chip> chip) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void tpm_bios_log_teardown(Ptr<tpm_chip> chip) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int tpm_bios_measurements_open(Ptr<runtime.inode> inode2, Ptr<runtime.file> file2) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int tpm_bios_measurements_release(Ptr<runtime.inode> inode2, Ptr<runtime.file> file2) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void tpm_buf_append_auth(Ptr<tpm_chip> chip, Ptr<tpm_buf> buf, char attributes, Ptr<Character> passphrase, int passphrase_len) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void tpm_buf_append_hmac_session(Ptr<tpm_chip> chip, Ptr<tpm_buf> buf, char attributes, Ptr<Character> passphrase, int passphrase_len) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void tpm_buf_append_name(Ptr<tpm_chip> chip, Ptr<tpm_buf> buf, @Unsigned int handle, Ptr<Character> name) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void tpm_common_open(Ptr<runtime.file> file2, Ptr<tpm_chip> chip, Ptr<FileDefinitions.file_priv> priv, Ptr<tpm_space> space) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static @Unsigned @OriginalName(value="__poll_t") int tpm_common_poll(Ptr<runtime.file> file2, Ptr<PollDefinitions.poll_table_struct> wait) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static @OriginalName(value="ssize_t") long tpm_common_read(Ptr<runtime.file> file2, String buf, @Unsigned long size, Ptr<@OriginalName(value="loff_t") Long> off) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void tpm_common_release(Ptr<runtime.file> file2, Ptr<FileDefinitions.file_priv> priv) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction(value="tpm_common_write($arg1, (const u8*)$arg2, $arg3, $arg4)")
    public static @OriginalName(value="ssize_t") long tpm_common_write(Ptr<runtime.file> file2, String buf, @Unsigned long size, Ptr<@OriginalName(value="loff_t") Long> off) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void tpm_dev_async_work(Ptr<misc.work_struct> work) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void tpm_dev_common_exit() {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int tpm_dev_common_init() {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static @OriginalName(value="ssize_t") long tpm_dev_transmit(Ptr<tpm_chip> chip, Ptr<tpm_space> space, Ptr<Character> buf, @Unsigned long bufsiz) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void tpm_timeout_work(Ptr<misc.work_struct> work) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction(value="tpm_buf_append($arg1, (const u8*)$arg2, $arg3)")
    public static void tpm_buf_append(Ptr<tpm_buf> buf, Ptr<Character> new_data, @Unsigned short new_length) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void tpm_buf_append_handle(Ptr<tpm_chip> chip, Ptr<tpm_buf> buf, @Unsigned int handle) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction(value="tpm_buf_append_u16($arg1, (const short unsigned int)$arg2)")
    public static void tpm_buf_append_u16(Ptr<tpm_buf> buf, @Unsigned short value) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction(value="tpm_buf_append_u32($arg1, (const unsigned int)$arg2)")
    public static void tpm_buf_append_u32(Ptr<tpm_buf> buf, @Unsigned int value) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction(value="tpm_buf_append_u8($arg1, (const u8)$arg2)")
    public static void tpm_buf_append_u8(Ptr<tpm_buf> buf, char value) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void tpm_buf_destroy(Ptr<tpm_buf> buf) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int tpm_buf_init(Ptr<tpm_buf> buf, @Unsigned short tag, @Unsigned int ordinal) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int tpm_buf_init_sized(Ptr<tpm_buf> buf) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static @Unsigned int tpm_buf_length(Ptr<tpm_buf> buf) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void tpm_buf_read(Ptr<tpm_buf> buf, Ptr<@OriginalName(value="off_t") Long> offset, @Unsigned long count, Ptr<?> output) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static @Unsigned short tpm_buf_read_u16(Ptr<tpm_buf> buf, Ptr<@OriginalName(value="off_t") Long> offset) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static @Unsigned int tpm_buf_read_u32(Ptr<tpm_buf> buf, Ptr<@OriginalName(value="off_t") Long> offset) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static char tpm_buf_read_u8(Ptr<tpm_buf> buf, Ptr<@OriginalName(value="off_t") Long> offset) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void tpm_buf_reset(Ptr<tpm_buf> buf, @Unsigned short tag, @Unsigned int ordinal) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void tpm_buf_reset_sized(Ptr<tpm_buf> buf) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction(value="tpm_chip_alloc($arg1, (const struct tpm_class_ops*)$arg2)")
    public static Ptr<tpm_chip> tpm_chip_alloc(Ptr<runtime.device> pdev, Ptr<tpm_class_ops> ops) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int tpm_chip_bootstrap(Ptr<tpm_chip> chip) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int tpm_chip_register(Ptr<tpm_chip> chip) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int tpm_chip_start(Ptr<tpm_chip> chip) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void tpm_chip_stop(Ptr<tpm_chip> chip) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void tpm_chip_unregister(Ptr<tpm_chip> chip) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int tpm_class_shutdown(Ptr<runtime.device> dev) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static Ptr<tpm_chip> tpm_default_chip() {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void tpm_del_legacy_sysfs(Ptr<tpm_chip> chip) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void tpm_dev_release(Ptr<runtime.device> dev) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static Ptr<tpm_chip> tpm_find_get_ops(Ptr<tpm_chip> chip) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int tpm_hwrng_read(Ptr<runtime.hwrng> rng, Ptr<?> data, @Unsigned long max, boolean wait) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void tpm_put_device(Ptr<?> dev) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void tpm_put_ops(Ptr<tpm_chip> chip) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int tpm_read_log_efi(Ptr<tpm_chip> chip) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void tpm_relinquish_locality(Ptr<tpm_chip> chip) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void tpm_sysfs_add_device(Ptr<tpm_chip> chip) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int tpm_try_get_ops(Ptr<tpm_chip> chip) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static @OriginalName(value="ssize_t") long tpm_version_major_show(Ptr<runtime.device> dev, Ptr<DeviceDefinitions.device_attribute> attr2, String buf) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void __tpm_tis_disable_interrupts(Ptr<tpm_chip> chip) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int __tpm_tis_request_locality(Ptr<tpm_chip> chip, int l) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void tpm_add_ppi(Ptr<tpm_chip> chip) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int tpm_open(Ptr<runtime.inode> inode2, Ptr<runtime.file> file2) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int tpm_release(Ptr<runtime.inode> inode2, Ptr<runtime.file> file2) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction(value="tpm_seal($arg1, $arg2, $arg3, (const u8*)$arg4, (const u8*)$arg5, $arg6, $arg7, $arg8, (const u8*)$arg9, (const u8*)$arg10, $arg11)")
    public static int tpm_seal(Ptr<tpm_buf> tb, @Unsigned @OriginalName(value="uint16_t") short keytype, @Unsigned @OriginalName(value="uint32_t") int keyhandle, String keyauth, String data, @Unsigned @OriginalName(value="uint32_t") int datalen, String blob, Ptr<@Unsigned @OriginalName(value="uint32_t") Integer> bloblen, String blobauth, String pcrinfo, @Unsigned @OriginalName(value="uint32_t") int pcrinfosize) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static @OriginalName(value="ssize_t") long tpm_show_ppi_request(Ptr<runtime.device> dev, Ptr<DeviceDefinitions.device_attribute> attr2, String buf) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static @OriginalName(value="ssize_t") long tpm_show_ppi_response(Ptr<runtime.device> dev, Ptr<DeviceDefinitions.device_attribute> attr2, String buf) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static @OriginalName(value="ssize_t") long tpm_show_ppi_tcg_operations(Ptr<runtime.device> dev, Ptr<DeviceDefinitions.device_attribute> attr2, String buf) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static @OriginalName(value="ssize_t") long tpm_show_ppi_transition_action(Ptr<runtime.device> dev, Ptr<DeviceDefinitions.device_attribute> attr2, String buf) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static @OriginalName(value="ssize_t") long tpm_show_ppi_version(Ptr<runtime.device> dev, Ptr<DeviceDefinitions.device_attribute> attr2, String buf) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static @OriginalName(value="ssize_t") long tpm_show_ppi_vs_operations(Ptr<runtime.device> dev, Ptr<DeviceDefinitions.device_attribute> attr2, String buf) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction(value="tpm_store_ppi_request($arg1, $arg2, (const u8*)$arg3, $arg4)")
    public static @OriginalName(value="ssize_t") long tpm_store_ppi_request(Ptr<runtime.device> dev, Ptr<DeviceDefinitions.device_attribute> attr2, String buf, @Unsigned long count) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void tpm_tis_clkrun_enable(Ptr<tpm_chip> chip, boolean value) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction(value="tpm_tis_core_init($arg1, $arg2, $arg3, (const struct tpm_tis_phy_ops*)$arg4, $arg5)")
    public static int tpm_tis_core_init(Ptr<runtime.device> dev, Ptr<tpm_tis_data> priv, int irq, Ptr<tpm_tis_phy_ops> phy_ops2, @OriginalName(value="acpi_handle") Ptr<?> acpi_dev_handle) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void tpm_tis_disable_interrupts(Ptr<tpm_chip> chip) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void tpm_tis_free_irq_func(Ptr<misc.work_struct> work) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int tpm_tis_probe_irq_single(Ptr<tpm_chip> chip, @Unsigned int intmask, int flags, int irq) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int tpm_tis_read32(Ptr<tpm_tis_data> data, @Unsigned int addr2, Ptr<@Unsigned Integer> result) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void tpm_tis_ready(Ptr<tpm_chip> chip) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int tpm_tis_recv(Ptr<tpm_chip> chip, Ptr<Character> buf, @Unsigned long count) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int tpm_tis_relinquish_locality(Ptr<tpm_chip> chip, int l) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void tpm_tis_remove(Ptr<tpm_chip> chip) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static boolean tpm_tis_req_canceled(Ptr<tpm_chip> chip, char status) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int tpm_tis_request_locality(Ptr<tpm_chip> chip, int l) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int tpm_tis_resume(Ptr<runtime.device> dev) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int tpm_tis_send(Ptr<tpm_chip> chip, Ptr<Character> buf, @Unsigned long len) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction(value="tpm_tis_send_data($arg1, (const u8*)$arg2, $arg3)")
    public static int tpm_tis_send_data(Ptr<tpm_chip> chip, Ptr<Character> buf, @Unsigned long len) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction(value="tpm_tis_send_main($arg1, (const u8*)$arg2, $arg3)")
    public static int tpm_tis_send_main(Ptr<tpm_chip> chip, Ptr<Character> buf, @Unsigned long len) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static char tpm_tis_status(Ptr<tpm_chip> chip) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void tpm_tis_update_durations(Ptr<tpm_chip> chip, Ptr<@Unsigned Long> duration_cap) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void tpm_tis_update_timeouts(Ptr<tpm_chip> chip, Ptr<@Unsigned Long> timeout_cap) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int tpm_tis_write32(Ptr<tpm_tis_data> data, @Unsigned int addr2, @Unsigned int value) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int tpm_tis_write8(Ptr<tpm_tis_data> data, @Unsigned int addr2, char value) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction(value="tpm_unseal($arg1, $arg2, (const u8*)$arg3, (const u8*)$arg4, $arg5, (const u8*)$arg6, $arg7, $arg8)")
    public static int tpm_unseal(Ptr<tpm_buf> tb, @Unsigned @OriginalName(value="uint32_t") int keyhandle, String keyauth, String blob, int bloblen, String blobauth, String data, Ptr<@Unsigned Integer> datalen) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int tpm_auto_startup(Ptr<tpm_chip> chip) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static @Unsigned long tpm_calc_ordinal_duration(Ptr<tpm_chip> chip, @Unsigned int ordinal) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int tpm_devs_add(Ptr<tpm_chip> chip) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void tpm_devs_release(Ptr<runtime.device> dev) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void tpm_devs_remove(Ptr<tpm_chip> chip) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void tpm_exit() {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int tpm_get_random(Ptr<tpm_chip> chip, Ptr<Character> out, @Unsigned long max) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int tpm_get_timeouts(Ptr<tpm_chip> chip) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int tpm_init() {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int tpm_is_tpm2(Ptr<tpm_chip> chip) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int tpm_pcr_extend(Ptr<tpm_chip> chip, @Unsigned int pcr_idx, Ptr<tpm_digest> digests) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int tpm_pcr_read(Ptr<tpm_chip> chip, @Unsigned int pcr_idx, Ptr<tpm_digest> digest) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int tpm_pm_resume(Ptr<runtime.device> dev) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int tpm_pm_suspend(Ptr<runtime.device> dev) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int tpm_read_log_acpi(Ptr<tpm_chip> chip) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int tpm_tcg_read_bytes(Ptr<tpm_tis_data> data, @Unsigned int addr2, @Unsigned short len, Ptr<Character> result, tpm_tis_io_mode io_mode) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction(value="tpm_tcg_write_bytes($arg1, $arg2, $arg3, (const u8*)$arg4, $arg5)")
    public static int tpm_tcg_write_bytes(Ptr<tpm_tis_data> data, @Unsigned int addr2, @Unsigned short len, Ptr<Character> value, tpm_tis_io_mode io_mode) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int tpm_tis_init(Ptr<runtime.device> dev, Ptr<tpm_info> tpm_info2) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int tpm_tis_plat_probe(Ptr<PlatformDefinitions.platform_device> pdev) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void tpm_tis_plat_remove(Ptr<PlatformDefinitions.platform_device> pdev) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction(value="tpm_tis_pnp_init($arg1, (const struct pnp_device_id*)$arg2)")
    public static int tpm_tis_pnp_init(Ptr<PnpDefinitions.pnp_dev> pnp_dev2, Ptr<PnpDefinitions.pnp_device_id> pnp_id2) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void tpm_tis_pnp_remove(Ptr<PnpDefinitions.pnp_dev> dev) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static @OriginalName(value="ssize_t") long tpm_transmit(Ptr<tpm_chip> chip, Ptr<Character> buf, @Unsigned long bufsiz) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction(value="tpm_transmit_cmd($arg1, $arg2, $arg3, (const u8*)$arg4)")
    public static @OriginalName(value="ssize_t") long tpm_transmit_cmd(Ptr<tpm_chip> chip, Ptr<tpm_buf> buf, @Unsigned long min_rsp_body_length, String desc) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static @OriginalName(value="ssize_t") long tpm_try_transmit(Ptr<tpm_chip> chip, Ptr<?> buf, @Unsigned long bufsiz) {
        throw new MethodIsBPFRelatedFunction();
    }

    @Type(noCCodeGeneration=true, cType="enum tpm_pcrs")
    public static enum tpm_pcrs implements Enum<tpm_pcrs>,
    TypedEnum<tpm_pcrs, Integer>
    {
        TPM_PCR0,
        TPM_PCR8,
        TPM_PCR10;

    }

    @Type(noCCodeGeneration=true, cType="struct tpm_digests")
    @NotUsableInJava
    public static class tpm_digests
    extends Struct {
        public char @Size(value=20) [] encauth;
        public char @Size(value=20) [] pubauth;
        public char @Size(value=40) [] xorwork;
        public char @Size(value=20) [] xorhash;
        public char @Size(value=20) [] nonceodd;
    }

    @Type(noCCodeGeneration=true, cType="struct tpm_pcr_attr")
    @NotUsableInJava
    public static class tpm_pcr_attr
    extends Struct {
        public int alg_id;
        public int pcr;
        public DeviceDefinitions.device_attribute attr;
    }

    @Type(noCCodeGeneration=true, cType="struct tpm_readpubek_out")
    @NotUsableInJava
    public static class tpm_readpubek_out
    extends Struct {
        public char @Size(value=4) [] algorithm;
        public char @Size(value=2) [] encscheme;
        public char @Size(value=2) [] sigscheme;
        public @Unsigned @OriginalName(value="__be32") int paramsize;
        public char @Size(value=12) [] parameters;
        public @Unsigned @OriginalName(value="__be32") int keysize;
        public char @Size(value=256) [] modulus;
        public char @Size(value=20) [] checksum;
    }

    @Type(noCCodeGeneration=true, cType="enum tpm_sub_capabilities")
    public static enum tpm_sub_capabilities implements Enum<tpm_sub_capabilities>,
    TypedEnum<tpm_sub_capabilities, Integer>
    {
        TPM_CAP_PROP_PCR,
        TPM_CAP_PROP_MANUFACTURER,
        TPM_CAP_FLAG_PERM,
        TPM_CAP_FLAG_VOL,
        TPM_CAP_PROP_OWNER,
        TPM_CAP_PROP_TIS_TIMEOUT,
        TPM_CAP_PROP_TIS_DURATION;

    }

    @Type(noCCodeGeneration=true, cType="enum tpm_capabilities")
    public static enum tpm_capabilities implements Enum<tpm_capabilities>,
    TypedEnum<tpm_capabilities, Integer>
    {
        TPM_CAP_FLAG,
        TPM_CAP_PROP,
        TPM_CAP_VERSION_1_1,
        TPM_CAP_VERSION_1_2;

    }

    @Type(noCCodeGeneration=true, cType="enum tpm_buf_flags")
    public static enum tpm_buf_flags implements Enum<tpm_buf_flags>,
    TypedEnum<tpm_buf_flags, Integer>
    {
        TPM_BUF_OVERFLOW,
        TPM_BUF_TPM2B,
        TPM_BUF_BOUNDARY_ERROR;

    }

    @Type(noCCodeGeneration=true, cType="enum tpm_algorithms")
    public static enum tpm_algorithms implements Enum<tpm_algorithms>,
    TypedEnum<tpm_algorithms, Integer>
    {
        TPM_ALG_ERROR,
        TPM_ALG_SHA1,
        TPM_ALG_AES,
        TPM_ALG_KEYEDHASH,
        TPM_ALG_SHA256,
        TPM_ALG_SHA384,
        TPM_ALG_SHA512,
        TPM_ALG_NULL,
        TPM_ALG_SM3_256,
        TPM_ALG_ECC,
        TPM_ALG_CFB;

    }

    @Type(noCCodeGeneration=true, cType="struct tpm_tis_tcg_phy")
    @NotUsableInJava
    public static class tpm_tis_tcg_phy
    extends Struct {
        public tpm_tis_data priv;
        public Ptr<?> iobase;
    }

    @Type(noCCodeGeneration=true, cType="struct tpm_info")
    @NotUsableInJava
    public static class tpm_info
    extends Struct {
        public runtime.resource res;
        public int irq;
    }

    @Type(noCCodeGeneration=true, cType="enum tpm_tis_io_mode")
    public static enum tpm_tis_io_mode implements Enum<tpm_tis_io_mode>,
    TypedEnum<tpm_tis_io_mode, Integer>
    {
        TPM_TIS_PHYS_8,
        TPM_TIS_PHYS_16,
        TPM_TIS_PHYS_32;

    }

    @Type(noCCodeGeneration=true, cType="struct tpm_tis_phy_ops")
    @NotUsableInJava
    public static class tpm_tis_phy_ops
    extends Struct {
        public Ptr<?> read_bytes;
        public Ptr<?> write_bytes;
        public Ptr<?> verify_crc;
    }

    @Type(noCCodeGeneration=true, cType="struct tpm_tis_data")
    @NotUsableInJava
    public static class tpm_tis_data
    extends Struct {
        public Ptr<tpm_chip> chip;
        public @Unsigned short manufacturer_id;
        public runtime.mutex locality_count_mutex;
        public @Unsigned int locality_count;
        public int locality;
        public int irq;
        public misc.work_struct free_irq_work;
        public @Unsigned long last_unhandled_irq;
        public @Unsigned int unhandled_irqs;
        public @Unsigned int int_mask;
        public @Unsigned long flags;
        public Ptr<?> ilb_base_addr;
        public @Unsigned short clkrun_enabled;
        public @OriginalName(value="wait_queue_head_t") WaitDefinitions.wait_queue_head int_queue;
        public @OriginalName(value="wait_queue_head_t") WaitDefinitions.wait_queue_head read_queue;
        public Ptr<tpm_tis_phy_ops> phy_ops;
        public @Unsigned short rng_quality;
        public @Unsigned int timeout_min;
        public @Unsigned int timeout_max;
    }

    @Type(noCCodeGeneration=true, cType="enum tpm_tis_flags")
    public static enum tpm_tis_flags implements Enum<tpm_tis_flags>,
    TypedEnum<tpm_tis_flags, Integer>
    {
        TPM_TIS_ITPM_WORKAROUND,
        TPM_TIS_INVALID_STATUS,
        TPM_TIS_DEFAULT_CANCELLATION,
        TPM_TIS_IRQ_TESTED;

    }

    @Type(noCCodeGeneration=true, cType="enum tpm_timeout")
    public static enum tpm_timeout implements Enum<tpm_timeout>,
    TypedEnum<tpm_timeout, Integer>
    {
        TPM_TIMEOUT,
        TPM_TIMEOUT_RETRY,
        TPM_TIMEOUT_RANGE_US,
        TPM_TIMEOUT_POLL,
        TPM_TIMEOUT_USECS_MIN,
        TPM_TIMEOUT_USECS_MAX;

    }

    @Type(noCCodeGeneration=true, cType="struct tpm_buf")
    @NotUsableInJava
    public static class tpm_buf
    extends Struct {
        public @Unsigned int flags;
        public @Unsigned int length;
        public Ptr<Character> data;
        public char handles;
    }

    @Type(noCCodeGeneration=true, cType="struct tpm_header")
    @NotUsableInJava
    public static class tpm_header
    extends Struct {
        public @Unsigned @OriginalName(value="__be16") short tag;
        public @Unsigned @OriginalName(value="__be32") int length;
        @InlineUnion(value=18255)
        public @InlineUnion(value=18255) @Unsigned @OriginalName(value="__be32") int ordinal;
        @InlineUnion(value=18255)
        public @InlineUnion(value=18255) @Unsigned @OriginalName(value="__be32") int return_code;
    }

    @Type(noCCodeGeneration=true, cType="enum tpm_chip_flags")
    public static enum tpm_chip_flags implements Enum<tpm_chip_flags>,
    TypedEnum<tpm_chip_flags, Integer>
    {
        TPM_CHIP_FLAG_BOOTSTRAPPED,
        TPM_CHIP_FLAG_TPM2,
        TPM_CHIP_FLAG_IRQ,
        TPM_CHIP_FLAG_VIRTUAL,
        TPM_CHIP_FLAG_HAVE_TIMEOUTS,
        TPM_CHIP_FLAG_ALWAYS_POWERED,
        TPM_CHIP_FLAG_FIRMWARE_POWER_MANAGED,
        TPM_CHIP_FLAG_FIRMWARE_UPGRADE,
        TPM_CHIP_FLAG_SUSPENDED,
        TPM_CHIP_FLAG_HWRNG_DISABLED,
        TPM_CHIP_FLAG_DISABLE;

    }

    @Type(noCCodeGeneration=true, cType="struct tpm_chip_seqops")
    @NotUsableInJava
    public static class tpm_chip_seqops
    extends Struct {
        public Ptr<tpm_chip> chip;
        public Ptr<SeqDefinitions.seq_operations> seqops;
    }

    @Type(noCCodeGeneration=true, cType="struct tpm_bios_log")
    @NotUsableInJava
    public static class tpm_bios_log
    extends Struct {
        public Ptr<?> bios_event_log;
        public Ptr<?> bios_event_log_end;
    }

    @Type(noCCodeGeneration=true, cType="struct tpm_space")
    @NotUsableInJava
    public static class tpm_space
    extends Struct {
        public @Unsigned int @Size(value=3) [] context_tbl;
        public Ptr<Character> context_buf;
        public @Unsigned int @Size(value=3) [] session_tbl;
        public Ptr<Character> session_buf;
        public @Unsigned int buf_size;
    }

    @Type(noCCodeGeneration=true, cType="struct tpm_chip")
    @NotUsableInJava
    public static class tpm_chip
    extends Struct {
        public runtime.device dev;
        public runtime.device devs;
        public runtime.cdev cdev;
        public runtime.cdev cdevs;
        public misc.rw_semaphore ops_sem;
        public Ptr<tpm_class_ops> ops;
        public tpm_bios_log log;
        public tpm_chip_seqops bin_log_seqops;
        public tpm_chip_seqops ascii_log_seqops;
        public @Unsigned int flags;
        public int dev_num;
        public @Unsigned long is_open;
        public char @Size(value=64) [] hwrng_name;
        public runtime.hwrng hwrng;
        public runtime.mutex tpm_mutex;
        public @Unsigned long timeout_a;
        public @Unsigned long timeout_b;
        public @Unsigned long timeout_c;
        public @Unsigned long timeout_d;
        public boolean timeout_adjusted;
        public @Unsigned long @Size(value=4) [] duration;
        public boolean duration_adjusted;
        public Ptr<runtime.dentry> @Size(value=3) [] bios_dir;
        public Ptr<AttributeDefinitions.attribute_group> @Size(value=8) [] groups;
        public @Unsigned int groups_cnt;
        public @Unsigned int nr_allocated_banks;
        public Ptr<tpm_bank_info> allocated_banks;
        public @OriginalName(value="acpi_handle") Ptr<?> acpi_dev_handle;
        public char @Size(value=4) [] ppi_version;
        public tpm_space work_space;
        public @Unsigned int last_cc;
        public @Unsigned int nr_commands;
        public Ptr<@Unsigned Integer> cc_attrs_tbl;
        public int locality;
    }

    @Type(noCCodeGeneration=true, cType="struct tpm_class_ops")
    @NotUsableInJava
    public static class tpm_class_ops
    extends Struct {
        public @Unsigned int flags;
        public char req_complete_mask;
        public char req_complete_val;
        public Ptr<?> req_canceled;
        public Ptr<?> recv;
        public Ptr<?> send;
        public Ptr<?> cancel;
        public Ptr<?> status;
        public Ptr<?> update_timeouts;
        public Ptr<?> update_durations;
        public Ptr<?> go_idle;
        public Ptr<?> cmd_ready;
        public Ptr<?> request_locality;
        public Ptr<?> relinquish_locality;
        public Ptr<?> clk_enable;
    }

    @Type(noCCodeGeneration=true, cType="struct tpm_bank_info")
    @NotUsableInJava
    public static class tpm_bank_info
    extends Struct {
        public @Unsigned short alg_id;
        public @Unsigned short digest_size;
        public @Unsigned short crypto_id;
    }

    @Type(noCCodeGeneration=true, cType="struct tpm_digest")
    @NotUsableInJava
    public static class tpm_digest
    extends Struct {
        public @Unsigned short alg_id;
        public char @Size(value=64) [] digest;
    }

    @Type(noCCodeGeneration=true, cType="enum tpm_duration")
    public static enum tpm_duration implements Enum<tpm_duration>,
    TypedEnum<tpm_duration, Integer>
    {
        TPM_SHORT,
        TPM_MEDIUM,
        TPM_LONG,
        TPM_LONG_LONG,
        TPM_UNDEFINED,
        TPM_NUM_DURATIONS;

    }
}

