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
import me.bechberger.ebpf.runtime.FsDefinitions;
import me.bechberger.ebpf.runtime.SeqDefinitions;
import me.bechberger.ebpf.runtime.SuperDefinitions;
import me.bechberger.ebpf.runtime.WaitDefinitions;
import me.bechberger.ebpf.runtime.XattrDefinitions;
import me.bechberger.ebpf.runtime.XzDefinitions;
import me.bechberger.ebpf.runtime.misc;
import me.bechberger.ebpf.runtime.runtime;
import me.bechberger.ebpf.type.Enum;
import me.bechberger.ebpf.type.Ptr;
import me.bechberger.ebpf.type.Struct;
import me.bechberger.ebpf.type.TypedEnum;
import me.bechberger.ebpf.type.Union;

public final class SquashfsDefinitions {
    @NotUsableInJava
    @BuiltinBPFFunction
    public static int squashfs_bio_read(Ptr<SuperDefinitions.super_block> sb, @Unsigned long index2, int length, Ptr<Ptr<runtime.bio>> biop, Ptr<Integer> block_offset) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int squashfs_bio_read_cached(Ptr<runtime.bio> fullbio, Ptr<misc.address_space> cache_mapping, @Unsigned long index2, int length, @Unsigned long read_start, @Unsigned long read_end, int page_count) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void squashfs_copy_cache(Ptr<runtime.page> page2, Ptr<squashfs_cache_entry> buffer, int bytes, int offset) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int squashfs_decompress(Ptr<squashfs_sb_info> msblk, Ptr<runtime.bio> bio2, int offset, int length, Ptr<squashfs_page_actor> output) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static Ptr<?> squashfs_decompressor_create(Ptr<squashfs_sb_info> msblk, Ptr<?> comp_opts2) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void squashfs_decompressor_destroy(Ptr<squashfs_sb_info> msblk) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static Ptr<?> squashfs_decompressor_setup(Ptr<SuperDefinitions.super_block> sb, @Unsigned short flags) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void squashfs_fill_page(Ptr<runtime.page> page2, Ptr<squashfs_cache_entry> buffer, int offset, int avail) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static Ptr<runtime.inode> squashfs_iget(Ptr<SuperDefinitions.super_block> sb, long ino, @Unsigned int ino_number) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction(value="((const struct squashfs_decompressor*)squashfs_lookup_decompressor($arg1))")
    public static Ptr<squashfs_decompressor> squashfs_lookup_decompressor(int id) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int squashfs_max_decompressors() {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int squashfs_read_data(Ptr<SuperDefinitions.super_block> sb, @Unsigned long index2, int length, Ptr<@Unsigned Long> next_index, Ptr<squashfs_page_actor> output) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int squashfs_read_folio(Ptr<runtime.file> file2, Ptr<runtime.folio> folio2) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int squashfs_read_inode(Ptr<runtime.inode> inode2, long ino) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static @NotUsableInJava Ptr<@Unsigned @OriginalName(value="__le64") Long> squashfs_read_xattr_id_table(Ptr<SuperDefinitions.super_block> sb, @Unsigned long table_start, Ptr<@Unsigned Long> xattr_table_start, Ptr<@Unsigned Integer> xattr_ids) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void squashfs_readahead(Ptr<misc.readahead_control> ractl) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int squashfs_readahead_fragment(Ptr<Ptr<runtime.page>> page2, @Unsigned int pages, @Unsigned int expected, @OriginalName(value="loff_t") long start) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int squashfs_xattr_lookup(Ptr<SuperDefinitions.super_block> sb, @Unsigned int index2, Ptr<Integer> count, Ptr<@Unsigned Integer> size, Ptr<@Unsigned Long> xattr2) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static Ptr<?> squashfs_xz_comp_opts(Ptr<squashfs_sb_info> msblk, Ptr<?> buff, int len) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void squashfs_xz_free(Ptr<?> strm) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static Ptr<?> squashfs_xz_init(Ptr<squashfs_sb_info> msblk, Ptr<?> buff) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int squashfs_xz_uncompress(Ptr<squashfs_sb_info> msblk, Ptr<?> strm, Ptr<runtime.bio> bio2, int offset, int length, Ptr<squashfs_page_actor> output) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int squashfs_frag_lookup(Ptr<SuperDefinitions.super_block> sb, @Unsigned int fragment, Ptr<@Unsigned Long> fragment_block) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static @OriginalName(value="ssize_t") long squashfs_listxattr(Ptr<runtime.dentry> d, String buffer, @Unsigned long buffer_size) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static Ptr<runtime.dentry> squashfs_lookup(Ptr<runtime.inode> dir, Ptr<runtime.dentry> dentry2, @Unsigned int flags) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static @NotUsableInJava Ptr<@Unsigned @OriginalName(value="__le64") Long> squashfs_read_fragment_index_table(Ptr<SuperDefinitions.super_block> sb, @Unsigned long fragment_table_start, @Unsigned long next_table, @Unsigned int fragments) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int squashfs_readdir(Ptr<runtime.file> file2, Ptr<misc.dir_context> ctx) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int squashfs_readpage_block(Ptr<runtime.page> target_page, @Unsigned long block, int bsize, int expected) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int squashfs_symlink_read_folio(Ptr<runtime.file> file2, Ptr<runtime.folio> folio2) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static boolean squashfs_trusted_xattr_handler_list(Ptr<runtime.dentry> d) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction(value="squashfs_xattr_get($arg1, $arg2, (const u8*)$arg3, $arg4, $arg5)")
    public static int squashfs_xattr_get(Ptr<runtime.inode> inode2, int name_index, String name, Ptr<?> buffer, @Unsigned long buffer_size) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction(value="squashfs_xattr_handler_get((const struct xattr_handler*)$arg1, $arg2, $arg3, (const u8*)$arg4, $arg5, $arg6)")
    public static int squashfs_xattr_handler_get(Ptr<XattrDefinitions.xattr_handler> handler, Ptr<runtime.dentry> unused, Ptr<runtime.inode> inode2, String name, Ptr<?> buffer, @Unsigned long size) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static Ptr<squashfs_page_actor> squashfs_page_actor_init(Ptr<Ptr<?>> buffer, int pages, int length) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static Ptr<squashfs_page_actor> squashfs_page_actor_init_special(Ptr<squashfs_sb_info> msblk, Ptr<Ptr<runtime.page>> page2, int pages, int length, @OriginalName(value="loff_t") long start_index) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static Ptr<runtime.inode> squashfs_alloc_inode(Ptr<SuperDefinitions.super_block> sb) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void squashfs_cache_delete(Ptr<squashfs_cache> cache) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static Ptr<squashfs_cache_entry> squashfs_cache_get(Ptr<SuperDefinitions.super_block> sb, Ptr<squashfs_cache> cache, @Unsigned long block, int length) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static Ptr<squashfs_cache> squashfs_cache_init(String name, int entries, int block_size) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void squashfs_cache_put(Ptr<squashfs_cache_entry> entry) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int squashfs_copy_data(Ptr<?> buffer, Ptr<squashfs_cache_entry> entry, int offset, int length) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static Ptr<runtime.dentry> squashfs_export_iget(Ptr<SuperDefinitions.super_block> sb, @Unsigned int ino_num) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static Ptr<runtime.dentry> squashfs_fh_to_dentry(Ptr<SuperDefinitions.super_block> sb, Ptr<runtime.fid> fid2, int fh_len, int fh_type) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static Ptr<runtime.dentry> squashfs_fh_to_parent(Ptr<SuperDefinitions.super_block> sb, Ptr<runtime.fid> fid2, int fh_len, int fh_type) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int squashfs_fill_super(Ptr<SuperDefinitions.super_block> sb, Ptr<FsDefinitions.fs_context> fc) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void squashfs_free_fs_context(Ptr<FsDefinitions.fs_context> fc) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void squashfs_free_inode(Ptr<runtime.inode> inode2) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static Ptr<squashfs_cache_entry> squashfs_get_datablock(Ptr<SuperDefinitions.super_block> sb, @Unsigned long start_block, int length) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static Ptr<squashfs_cache_entry> squashfs_get_fragment(Ptr<SuperDefinitions.super_block> sb, @Unsigned long start_block, int length) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int squashfs_get_id(Ptr<SuperDefinitions.super_block> sb, @Unsigned int index2, Ptr<@Unsigned Integer> id) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static Ptr<runtime.dentry> squashfs_get_parent(Ptr<runtime.dentry> child) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int squashfs_get_tree(Ptr<FsDefinitions.fs_context> fc) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int squashfs_init_fs_context(Ptr<FsDefinitions.fs_context> fc) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int squashfs_parse_param(Ptr<FsDefinitions.fs_context> fc, Ptr<FsDefinitions.fs_parameter> param2) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static void squashfs_put_super(Ptr<SuperDefinitions.super_block> sb) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static @NotUsableInJava Ptr<@Unsigned @OriginalName(value="__le64") Long> squashfs_read_id_index_table(Ptr<SuperDefinitions.super_block> sb, @Unsigned long id_table_start, @Unsigned long next_table, @Unsigned short no_ids) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static @NotUsableInJava Ptr<@Unsigned @OriginalName(value="__le64") Long> squashfs_read_inode_lookup_table(Ptr<SuperDefinitions.super_block> sb, @Unsigned long lookup_table_start, @Unsigned long next_table, @Unsigned int inodes) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int squashfs_read_metadata(Ptr<SuperDefinitions.super_block> sb, Ptr<?> buffer, Ptr<@Unsigned Long> block, Ptr<Integer> offset, int length) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static Ptr<?> squashfs_read_table(Ptr<SuperDefinitions.super_block> sb, @Unsigned long block, int length) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int squashfs_reconfigure(Ptr<FsDefinitions.fs_context> fc) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int squashfs_show_options(Ptr<SeqDefinitions.seq_file> s2, Ptr<runtime.dentry> root) {
        throw new MethodIsBPFRelatedFunction();
    }

    @NotUsableInJava
    @BuiltinBPFFunction
    public static int squashfs_statfs(Ptr<runtime.dentry> dentry2, Ptr<runtime.kstatfs> buf) {
        throw new MethodIsBPFRelatedFunction();
    }

    @Type(noCCodeGeneration=true, cType="struct squashfs_lzo")
    @NotUsableInJava
    public static class squashfs_lzo
    extends Struct {
        public Ptr<?> input;
        public Ptr<?> output;
    }

    @Type(noCCodeGeneration=true, cType="struct squashfs_xattr_val")
    @NotUsableInJava
    public static class squashfs_xattr_val
    extends Struct {
        public @Unsigned @OriginalName(value="__le32") int vsize;
        public char @Size(value=0) [] value;
    }

    @Type(noCCodeGeneration=true, cType="struct squashfs_xattr_entry")
    @NotUsableInJava
    public static class squashfs_xattr_entry
    extends Struct {
        public @Unsigned @OriginalName(value="__le16") short type;
        public @Unsigned @OriginalName(value="__le16") short size;
        public char @Size(value=0) [] data;
    }

    @Type(noCCodeGeneration=true, cType="struct squashfs_fragment_entry")
    @NotUsableInJava
    public static class squashfs_fragment_entry
    extends Struct {
        public @Unsigned @OriginalName(value="__le64") long start_block;
        public @Unsigned @OriginalName(value="__le32") int size;
        public @Unsigned int unused;
    }

    @Type(noCCodeGeneration=true, cType="struct squashfs_dir_header")
    @NotUsableInJava
    public static class squashfs_dir_header
    extends Struct {
        public @Unsigned @OriginalName(value="__le32") int count;
        public @Unsigned @OriginalName(value="__le32") int start_block;
        public @Unsigned @OriginalName(value="__le32") int inode_number;
    }

    @Type(noCCodeGeneration=true, cType="struct squashfs_dir_entry")
    @NotUsableInJava
    public static class squashfs_dir_entry
    extends Struct {
        public @Unsigned @OriginalName(value="__le16") short offset;
        public @Unsigned @OriginalName(value="__le16") short inode_number;
        public @Unsigned @OriginalName(value="__le16") short type;
        public @Unsigned @OriginalName(value="__le16") short size;
        public char @Size(value=0) [] name;
    }

    @Type(noCCodeGeneration=true, cType="struct squashfs_xz")
    @NotUsableInJava
    public static class squashfs_xz
    extends Struct {
        public Ptr<XzDefinitions.xz_dec> state;
        public XzDefinitions.xz_buf buf;
    }

    @Type(noCCodeGeneration=true, cType="struct squashfs_xattr_id_table")
    @NotUsableInJava
    public static class squashfs_xattr_id_table
    extends Struct {
        public @Unsigned @OriginalName(value="__le64") long xattr_table_start;
        public @Unsigned @OriginalName(value="__le32") int xattr_ids;
        public @Unsigned @OriginalName(value="__le32") int unused;
    }

    @Type(noCCodeGeneration=true, cType="struct squashfs_xattr_id")
    @NotUsableInJava
    public static class squashfs_xattr_id
    extends Struct {
        public @Unsigned @OriginalName(value="__le64") long xattr;
        public @Unsigned @OriginalName(value="__le32") int count;
        public @Unsigned @OriginalName(value="__le32") int size;
    }

    @Type(noCCodeGeneration=true, cType="union squashfs_inode")
    @NotUsableInJava
    public static class squashfs_inode
    extends Union {
        public squashfs_base_inode base;
        public squashfs_dev_inode dev;
        public squashfs_ldev_inode ldev;
        public squashfs_symlink_inode symlink;
        public squashfs_reg_inode reg;
        public squashfs_lreg_inode lreg;
        public squashfs_dir_inode dir;
        public squashfs_ldir_inode ldir;
        public squashfs_ipc_inode ipc;
        public squashfs_lipc_inode lipc;
    }

    @Type(noCCodeGeneration=true, cType="struct squashfs_ldir_inode")
    @NotUsableInJava
    public static class squashfs_ldir_inode
    extends Struct {
        public @Unsigned @OriginalName(value="__le16") short inode_type;
        public @Unsigned @OriginalName(value="__le16") short mode;
        public @Unsigned @OriginalName(value="__le16") short uid;
        public @Unsigned @OriginalName(value="__le16") short guid;
        public @Unsigned @OriginalName(value="__le32") int mtime;
        public @Unsigned @OriginalName(value="__le32") int inode_number;
        public @Unsigned @OriginalName(value="__le32") int nlink;
        public @Unsigned @OriginalName(value="__le32") int file_size;
        public @Unsigned @OriginalName(value="__le32") int start_block;
        public @Unsigned @OriginalName(value="__le32") int parent_inode;
        public @Unsigned @OriginalName(value="__le16") short i_count;
        public @Unsigned @OriginalName(value="__le16") short offset;
        public @Unsigned @OriginalName(value="__le32") int xattr;
        public squashfs_dir_index @Size(value=0) [] index;
    }

    @Type(noCCodeGeneration=true, cType="struct squashfs_dir_inode")
    @NotUsableInJava
    public static class squashfs_dir_inode
    extends Struct {
        public @Unsigned @OriginalName(value="__le16") short inode_type;
        public @Unsigned @OriginalName(value="__le16") short mode;
        public @Unsigned @OriginalName(value="__le16") short uid;
        public @Unsigned @OriginalName(value="__le16") short guid;
        public @Unsigned @OriginalName(value="__le32") int mtime;
        public @Unsigned @OriginalName(value="__le32") int inode_number;
        public @Unsigned @OriginalName(value="__le32") int start_block;
        public @Unsigned @OriginalName(value="__le32") int nlink;
        public @Unsigned @OriginalName(value="__le16") short file_size;
        public @Unsigned @OriginalName(value="__le16") short offset;
        public @Unsigned @OriginalName(value="__le32") int parent_inode;
    }

    @Type(noCCodeGeneration=true, cType="struct squashfs_lreg_inode")
    @NotUsableInJava
    public static class squashfs_lreg_inode
    extends Struct {
        public @Unsigned @OriginalName(value="__le16") short inode_type;
        public @Unsigned @OriginalName(value="__le16") short mode;
        public @Unsigned @OriginalName(value="__le16") short uid;
        public @Unsigned @OriginalName(value="__le16") short guid;
        public @Unsigned @OriginalName(value="__le32") int mtime;
        public @Unsigned @OriginalName(value="__le32") int inode_number;
        public @Unsigned @OriginalName(value="__le64") long start_block;
        public @Unsigned @OriginalName(value="__le64") long file_size;
        public @Unsigned @OriginalName(value="__le64") long sparse;
        public @Unsigned @OriginalName(value="__le32") int nlink;
        public @Unsigned @OriginalName(value="__le32") int fragment;
        public @Unsigned @OriginalName(value="__le32") int offset;
        public @Unsigned @OriginalName(value="__le32") int xattr;
        public @Unsigned @OriginalName(value="__le16") short @Size(value=0) [] block_list;
    }

    @Type(noCCodeGeneration=true, cType="struct squashfs_reg_inode")
    @NotUsableInJava
    public static class squashfs_reg_inode
    extends Struct {
        public @Unsigned @OriginalName(value="__le16") short inode_type;
        public @Unsigned @OriginalName(value="__le16") short mode;
        public @Unsigned @OriginalName(value="__le16") short uid;
        public @Unsigned @OriginalName(value="__le16") short guid;
        public @Unsigned @OriginalName(value="__le32") int mtime;
        public @Unsigned @OriginalName(value="__le32") int inode_number;
        public @Unsigned @OriginalName(value="__le32") int start_block;
        public @Unsigned @OriginalName(value="__le32") int fragment;
        public @Unsigned @OriginalName(value="__le32") int offset;
        public @Unsigned @OriginalName(value="__le32") int file_size;
        public @Unsigned @OriginalName(value="__le16") short @Size(value=0) [] block_list;
    }

    @Type(noCCodeGeneration=true, cType="struct squashfs_symlink_inode")
    @NotUsableInJava
    public static class squashfs_symlink_inode
    extends Struct {
        public @Unsigned @OriginalName(value="__le16") short inode_type;
        public @Unsigned @OriginalName(value="__le16") short mode;
        public @Unsigned @OriginalName(value="__le16") short uid;
        public @Unsigned @OriginalName(value="__le16") short guid;
        public @Unsigned @OriginalName(value="__le32") int mtime;
        public @Unsigned @OriginalName(value="__le32") int inode_number;
        public @Unsigned @OriginalName(value="__le32") int nlink;
        public @Unsigned @OriginalName(value="__le32") int symlink_size;
        public char @Size(value=0) [] symlink;
    }

    @Type(noCCodeGeneration=true, cType="struct squashfs_ldev_inode")
    @NotUsableInJava
    public static class squashfs_ldev_inode
    extends Struct {
        public @Unsigned @OriginalName(value="__le16") short inode_type;
        public @Unsigned @OriginalName(value="__le16") short mode;
        public @Unsigned @OriginalName(value="__le16") short uid;
        public @Unsigned @OriginalName(value="__le16") short guid;
        public @Unsigned @OriginalName(value="__le32") int mtime;
        public @Unsigned @OriginalName(value="__le32") int inode_number;
        public @Unsigned @OriginalName(value="__le32") int nlink;
        public @Unsigned @OriginalName(value="__le32") int rdev;
        public @Unsigned @OriginalName(value="__le32") int xattr;
    }

    @Type(noCCodeGeneration=true, cType="struct squashfs_dev_inode")
    @NotUsableInJava
    public static class squashfs_dev_inode
    extends Struct {
        public @Unsigned @OriginalName(value="__le16") short inode_type;
        public @Unsigned @OriginalName(value="__le16") short mode;
        public @Unsigned @OriginalName(value="__le16") short uid;
        public @Unsigned @OriginalName(value="__le16") short guid;
        public @Unsigned @OriginalName(value="__le32") int mtime;
        public @Unsigned @OriginalName(value="__le32") int inode_number;
        public @Unsigned @OriginalName(value="__le32") int nlink;
        public @Unsigned @OriginalName(value="__le32") int rdev;
    }

    @Type(noCCodeGeneration=true, cType="struct squashfs_lipc_inode")
    @NotUsableInJava
    public static class squashfs_lipc_inode
    extends Struct {
        public @Unsigned @OriginalName(value="__le16") short inode_type;
        public @Unsigned @OriginalName(value="__le16") short mode;
        public @Unsigned @OriginalName(value="__le16") short uid;
        public @Unsigned @OriginalName(value="__le16") short guid;
        public @Unsigned @OriginalName(value="__le32") int mtime;
        public @Unsigned @OriginalName(value="__le32") int inode_number;
        public @Unsigned @OriginalName(value="__le32") int nlink;
        public @Unsigned @OriginalName(value="__le32") int xattr;
    }

    @Type(noCCodeGeneration=true, cType="struct squashfs_ipc_inode")
    @NotUsableInJava
    public static class squashfs_ipc_inode
    extends Struct {
        public @Unsigned @OriginalName(value="__le16") short inode_type;
        public @Unsigned @OriginalName(value="__le16") short mode;
        public @Unsigned @OriginalName(value="__le16") short uid;
        public @Unsigned @OriginalName(value="__le16") short guid;
        public @Unsigned @OriginalName(value="__le32") int mtime;
        public @Unsigned @OriginalName(value="__le32") int inode_number;
        public @Unsigned @OriginalName(value="__le32") int nlink;
    }

    @Type(noCCodeGeneration=true, cType="struct squashfs_base_inode")
    @NotUsableInJava
    public static class squashfs_base_inode
    extends Struct {
        public @Unsigned @OriginalName(value="__le16") short inode_type;
        public @Unsigned @OriginalName(value="__le16") short mode;
        public @Unsigned @OriginalName(value="__le16") short uid;
        public @Unsigned @OriginalName(value="__le16") short guid;
        public @Unsigned @OriginalName(value="__le32") int mtime;
        public @Unsigned @OriginalName(value="__le32") int inode_number;
    }

    @Type(noCCodeGeneration=true, cType="struct squashfs_dir_index")
    @NotUsableInJava
    public static class squashfs_dir_index
    extends Struct {
        public @Unsigned @OriginalName(value="__le32") int index;
        public @Unsigned @OriginalName(value="__le32") int start_block;
        public @Unsigned @OriginalName(value="__le32") int size;
        public char @Size(value=0) [] name;
    }

    @Type(noCCodeGeneration=true, cType="struct squashfs_lz4")
    @NotUsableInJava
    public static class squashfs_lz4
    extends Struct {
        public Ptr<?> input;
        public Ptr<?> output;
    }

    @Type(noCCodeGeneration=true, cType="struct squashfs_stream")
    @NotUsableInJava
    public static class squashfs_stream
    extends Struct {
        public Ptr<?> stream;
        public @OriginalName(value="local_lock_t") misc.lockdep_map_p lock;
    }

    @Type(noCCodeGeneration=true, cType="struct squashfs_mount_opts")
    @NotUsableInJava
    public static class squashfs_mount_opts
    extends Struct {
        public misc.Opt_errors errors;
        public Ptr<squashfs_decompressor_thread_ops> thread_ops;
        public int thread_num;
    }

    @Type(noCCodeGeneration=true, cType="enum squashfs_param")
    public static enum squashfs_param implements Enum<squashfs_param>,
    TypedEnum<squashfs_param, Integer>
    {
        Opt_errors,
        Opt_threads;

    }

    @Type(noCCodeGeneration=true, cType="struct squashfs_super_block")
    @NotUsableInJava
    public static class squashfs_super_block
    extends Struct {
        public @Unsigned @OriginalName(value="__le32") int s_magic;
        public @Unsigned @OriginalName(value="__le32") int inodes;
        public @Unsigned @OriginalName(value="__le32") int mkfs_time;
        public @Unsigned @OriginalName(value="__le32") int block_size;
        public @Unsigned @OriginalName(value="__le32") int fragments;
        public @Unsigned @OriginalName(value="__le16") short compression;
        public @Unsigned @OriginalName(value="__le16") short block_log;
        public @Unsigned @OriginalName(value="__le16") short flags;
        public @Unsigned @OriginalName(value="__le16") short no_ids;
        public @Unsigned @OriginalName(value="__le16") short s_major;
        public @Unsigned @OriginalName(value="__le16") short s_minor;
        public @Unsigned @OriginalName(value="__le64") long root_inode;
        public @Unsigned @OriginalName(value="__le64") long bytes_used;
        public @Unsigned @OriginalName(value="__le64") long id_table_start;
        public @Unsigned @OriginalName(value="__le64") long xattr_id_table_start;
        public @Unsigned @OriginalName(value="__le64") long inode_table_start;
        public @Unsigned @OriginalName(value="__le64") long directory_table_start;
        public @Unsigned @OriginalName(value="__le64") long fragment_table_start;
        public @Unsigned @OriginalName(value="__le64") long lookup_table_start;
    }

    @Type(noCCodeGeneration=true, cType="struct squashfs_inode_info")
    @NotUsableInJava
    public static class squashfs_inode_info
    extends Struct {
        public @Unsigned long start;
        public int offset;
        public @Unsigned long xattr;
        public @Unsigned int xattr_size;
        public int xattr_count;
        @InlineUnion(value=11511)
        public  @InlineUnion(value=11511) AnonDefinitions.anon_member_of_anon_member_of_squashfs_inode_info anon5$0;
        @InlineUnion(value=11511)
        public  @InlineUnion(value=11511) AnonDefinitions.anon_member_of_anon_member_of_squashfs_inode_info anon5$1;
        public runtime.inode vfs_inode;
    }

    @Type(noCCodeGeneration=true, cType="struct squashfs_decompressor_thread_ops")
    @NotUsableInJava
    public static class squashfs_decompressor_thread_ops
    extends Struct {
        public Ptr<?> create;
        public Ptr<?> destroy;
        public Ptr<?> decompress;
        public Ptr<?> max_decompressors;
    }

    @Type(noCCodeGeneration=true, cType="struct squashfs_decompressor")
    @NotUsableInJava
    public static class squashfs_decompressor
    extends Struct {
        public Ptr<?> init;
        public Ptr<?> comp_opts;
        public Ptr<?> free;
        public Ptr<?> decompress;
        public int id;
        public String name;
        public int alloc_buffer;
        public int supported;
    }

    @Type(noCCodeGeneration=true, cType="struct squashfs_sb_info")
    @NotUsableInJava
    public static class squashfs_sb_info
    extends Struct {
        public Ptr<squashfs_decompressor> decompressor;
        public int devblksize;
        public int devblksize_log2;
        public Ptr<squashfs_cache> block_cache;
        public Ptr<squashfs_cache> fragment_cache;
        public Ptr<squashfs_cache> read_page;
        public Ptr<misc.address_space> cache_mapping;
        public int next_meta_index;
        public Ptr<@Unsigned @OriginalName(value="__le64") Long> id_table;
        public Ptr<@Unsigned @OriginalName(value="__le64") Long> fragment_index;
        public Ptr<@Unsigned @OriginalName(value="__le64") Long> xattr_id_table;
        public runtime.mutex meta_index_mutex;
        public Ptr<misc.meta_index> meta_index;
        public Ptr<?> stream;
        public Ptr<@Unsigned @OriginalName(value="__le64") Long> inode_lookup_table;
        public @Unsigned long inode_table;
        public @Unsigned long directory_table;
        public @Unsigned long xattr_table;
        public @Unsigned int block_size;
        public @Unsigned short block_log;
        public long bytes_used;
        public @Unsigned int inodes;
        public @Unsigned int fragments;
        public @Unsigned int xattr_ids;
        public @Unsigned int ids;
        public boolean panic_on_errors;
        public Ptr<squashfs_decompressor_thread_ops> thread_ops;
        public int max_thread_num;
    }

    @Type(noCCodeGeneration=true, cType="struct squashfs_page_actor")
    @NotUsableInJava
    public static class squashfs_page_actor
    extends Struct {
        @InlineUnion(value=11504)
        public @InlineUnion(value=11504) Ptr<Ptr<?>> buffer;
        @InlineUnion(value=11504)
        public @InlineUnion(value=11504) Ptr<Ptr<runtime.page>> page;
        public Ptr<?> pageaddr;
        public Ptr<?> tmp_buffer;
        public Ptr<?> squashfs_first_page;
        public Ptr<?> squashfs_next_page;
        public Ptr<?> squashfs_finish_page;
        public Ptr<runtime.page> last_page;
        public int pages;
        public int length;
        public int next_page;
        public int alloc_buffer;
        public int returned_pages;
        public @Unsigned long next_index;
    }

    @Type(noCCodeGeneration=true, cType="struct squashfs_cache_entry")
    @NotUsableInJava
    public static class squashfs_cache_entry
    extends Struct {
        public @Unsigned long block;
        public int length;
        public int refcount;
        public @Unsigned long next_index;
        public int pending;
        public int error;
        public int num_waiters;
        public @OriginalName(value="wait_queue_head_t") WaitDefinitions.wait_queue_head wait_queue;
        public Ptr<squashfs_cache> cache;
        public Ptr<Ptr<?>> data;
        public Ptr<squashfs_page_actor> actor;
    }

    @Type(noCCodeGeneration=true, cType="struct squashfs_cache")
    @NotUsableInJava
    public static class squashfs_cache
    extends Struct {
        public String name;
        public int entries;
        public int curr_blk;
        public int next_blk;
        public int num_waiters;
        public int unused;
        public int block_size;
        public int pages;
        public  @OriginalName(value="spinlock_t") runtime.spinlock lock;
        public @OriginalName(value="wait_queue_head_t") WaitDefinitions.wait_queue_head wait_queue;
        public Ptr<squashfs_cache_entry> entry;
    }
}

