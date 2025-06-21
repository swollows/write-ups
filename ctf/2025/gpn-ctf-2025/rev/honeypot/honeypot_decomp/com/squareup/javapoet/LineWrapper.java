/*
 * Decompiled with CFR 0.153-SNAPSHOT (d6f6758-dirty).
 */
package com.squareup.javapoet;

import com.squareup.javapoet.Util;
import java.io.IOException;

final class LineWrapper {
    private final RecordingAppendable out;
    private final String indent;
    private final int columnLimit;
    private boolean closed;
    private final StringBuilder buffer = new StringBuilder();
    private int column = 0;
    private int indentLevel = -1;
    private FlushType nextFlush;

    LineWrapper(Appendable out, String indent, int columnLimit) {
        Util.checkNotNull(out, "out == null", new Object[0]);
        this.out = new RecordingAppendable(out);
        this.indent = indent;
        this.columnLimit = columnLimit;
    }

    char lastChar() {
        return this.out.lastChar;
    }

    void append(String s2) throws IOException {
        if (this.closed) {
            throw new IllegalStateException("closed");
        }
        if (this.nextFlush != null) {
            int nextNewline = s2.indexOf(10);
            if (nextNewline == -1 && this.column + s2.length() <= this.columnLimit) {
                this.buffer.append(s2);
                this.column += s2.length();
                return;
            }
            boolean wrap = nextNewline == -1 || this.column + nextNewline > this.columnLimit;
            this.flush(wrap ? FlushType.WRAP : this.nextFlush);
        }
        this.out.append(s2);
        int lastNewline = s2.lastIndexOf(10);
        this.column = lastNewline != -1 ? s2.length() - lastNewline - 1 : this.column + s2.length();
    }

    void wrappingSpace(int indentLevel) throws IOException {
        if (this.closed) {
            throw new IllegalStateException("closed");
        }
        if (this.nextFlush != null) {
            this.flush(this.nextFlush);
        }
        ++this.column;
        this.nextFlush = FlushType.SPACE;
        this.indentLevel = indentLevel;
    }

    void zeroWidthSpace(int indentLevel) throws IOException {
        if (this.closed) {
            throw new IllegalStateException("closed");
        }
        if (this.column == 0) {
            return;
        }
        if (this.nextFlush != null) {
            this.flush(this.nextFlush);
        }
        this.nextFlush = FlushType.EMPTY;
        this.indentLevel = indentLevel;
    }

    void close() throws IOException {
        if (this.nextFlush != null) {
            this.flush(this.nextFlush);
        }
        this.closed = true;
    }

    private void flush(FlushType flushType) throws IOException {
        switch (flushType) {
            case WRAP: {
                this.out.append('\n');
                for (int i = 0; i < this.indentLevel; ++i) {
                    this.out.append(this.indent);
                }
                this.column = this.indentLevel * this.indent.length();
                this.column += this.buffer.length();
                break;
            }
            case SPACE: {
                this.out.append(' ');
                break;
            }
            case EMPTY: {
                break;
            }
            default: {
                throw new IllegalArgumentException("Unknown FlushType: " + (Object)((Object)flushType));
            }
        }
        this.out.append(this.buffer);
        this.buffer.delete(0, this.buffer.length());
        this.indentLevel = -1;
        this.nextFlush = null;
    }

    static final class RecordingAppendable
    implements Appendable {
        private final Appendable delegate;
        char lastChar = '\u0000';

        RecordingAppendable(Appendable delegate) {
            this.delegate = delegate;
        }

        @Override
        public Appendable append(CharSequence csq) throws IOException {
            int length = csq.length();
            if (length != 0) {
                this.lastChar = csq.charAt(length - 1);
            }
            return this.delegate.append(csq);
        }

        @Override
        public Appendable append(CharSequence csq, int start, int end) throws IOException {
            CharSequence sub = csq.subSequence(start, end);
            return this.append(sub);
        }

        @Override
        public Appendable append(char c) throws IOException {
            this.lastChar = c;
            return this.delegate.append(c);
        }
    }

    private static enum FlushType {
        WRAP,
        SPACE,
        EMPTY;

    }
}

