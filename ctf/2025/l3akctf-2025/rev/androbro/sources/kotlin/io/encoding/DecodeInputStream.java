package kotlin.io.encoding;

import java.io.IOException;
import java.io.InputStream;
import kotlin.Metadata;
import kotlin.UByte;
import kotlin.collections.ArraysKt;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.internal.LockFreeTaskQueueCore;

@Metadata(d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0012\n\u0000\n\u0002\u0010\b\n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0010\u0002\n\u0002\b\u000f\b\u0003\u0018\u00002\u00020\u0001B\u0015\u0012\u0006\u0010\u0002\u001a\u00020\u0001\u0012\u0006\u0010\u0003\u001a\u00020\u0004¢\u0006\u0002\u0010\u0005J\b\u0010\u0013\u001a\u00020\u0014H\u0016J \u0010\u0015\u001a\u00020\u00142\u0006\u0010\u0016\u001a\u00020\u00072\u0006\u0010\u0017\u001a\u00020\t2\u0006\u0010\u0018\u001a\u00020\tH\u0002J(\u0010\u0019\u001a\u00020\t2\u0006\u0010\u0016\u001a\u00020\u00072\u0006\u0010\u0017\u001a\u00020\t2\u0006\u0010\u001a\u001a\u00020\t2\u0006\u0010\u001b\u001a\u00020\tH\u0002J\u0010\u0010\u001c\u001a\u00020\t2\u0006\u0010\u001b\u001a\u00020\tH\u0002J\b\u0010\u001d\u001a\u00020\tH\u0016J \u0010\u001d\u001a\u00020\t2\u0006\u0010\u001e\u001a\u00020\u00072\u0006\u0010\u001f\u001a\u00020\t2\u0006\u0010\u0018\u001a\u00020\tH\u0016J\b\u0010 \u001a\u00020\tH\u0002J\b\u0010!\u001a\u00020\u0014H\u0002J\b\u0010\"\u001a\u00020\u0014H\u0002R\u000e\u0010\u0003\u001a\u00020\u0004X\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0007X\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\b\u001a\u00020\tX\u000e¢\u0006\u0002\n\u0000R\u0014\u0010\n\u001a\u00020\t8BX\u0004¢\u0006\u0006\u001a\u0004\b\u000b\u0010\fR\u000e\u0010\r\u001a\u00020\tX\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u0002\u001a\u00020\u0001X\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u000e\u001a\u00020\u000fX\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u0010\u001a\u00020\u000fX\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u0011\u001a\u00020\u0007X\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0012\u001a\u00020\u0007X\u0004¢\u0006\u0002\n\u0000¨\u0006#"}, d2 = {"Lkotlin/io/encoding/DecodeInputStream;", "Ljava/io/InputStream;", "input", "base64", "Lkotlin/io/encoding/Base64;", "(Ljava/io/InputStream;Lkotlin/io/encoding/Base64;)V", "byteBuffer", "", "byteBufferEndIndex", "", "byteBufferLength", "getByteBufferLength", "()I", "byteBufferStartIndex", "isClosed", "", "isEOF", "singleByteBuffer", "symbolBuffer", "close", "", "copyByteBufferInto", "dst", "dstOffset", "length", "decodeSymbolBufferInto", "dstEndIndex", "symbolBufferLength", "handlePaddingSymbol", "read", "destination", "offset", "readNextSymbol", "resetByteBufferIfEmpty", "shiftByteBufferToStartIfNeeded", "kotlin-stdlib"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* compiled from: Base64IOStream.kt */
final class DecodeInputStream extends InputStream {
    private final Base64 base64;
    private final byte[] byteBuffer = new byte[1024];
    private int byteBufferEndIndex;
    private int byteBufferStartIndex;
    private final InputStream input;
    private boolean isClosed;
    private boolean isEOF;
    private final byte[] singleByteBuffer = new byte[1];
    private final byte[] symbolBuffer = new byte[1024];

    public DecodeInputStream(InputStream input2, Base64 base642) {
        Intrinsics.checkNotNullParameter(input2, "input");
        Intrinsics.checkNotNullParameter(base642, "base64");
        this.input = input2;
        this.base64 = base642;
    }

    private final int getByteBufferLength() {
        return this.byteBufferEndIndex - this.byteBufferStartIndex;
    }

    public int read() {
        if (this.byteBufferStartIndex < this.byteBufferEndIndex) {
            int i = this.byteBuffer[this.byteBufferStartIndex] & 255;
            this.byteBufferStartIndex++;
            resetByteBufferIfEmpty();
            return i;
        }
        switch (read(this.singleByteBuffer, 0, 1)) {
            case -1:
                return -1;
            case 1:
                return this.singleByteBuffer[0] & UByte.MAX_VALUE;
            default:
                throw new IllegalStateException("Unreachable".toString());
        }
    }

    public int read(byte[] destination, int offset, int length) {
        Intrinsics.checkNotNullParameter(destination, "destination");
        if (offset < 0 || length < 0 || offset + length > destination.length) {
            throw new IndexOutOfBoundsException("offset: " + offset + ", length: " + length + ", buffer size: " + destination.length);
        } else if (this.isClosed) {
            throw new IOException("The input stream is closed.");
        } else if (this.isEOF) {
            return -1;
        } else {
            if (length == 0) {
                return 0;
            }
            if (getByteBufferLength() >= length) {
                copyByteBufferInto(destination, offset, length);
                return length;
            }
            int symbolsNeeded = ((((length - getByteBufferLength()) + 3) - 1) / 3) * 4;
            int dstOffset = offset;
            while (!this.isEOF && symbolsNeeded > 0) {
                int symbolBufferLength = 0;
                int symbolsToRead = Math.min(this.symbolBuffer.length, symbolsNeeded);
                while (!this.isEOF && symbolBufferLength < symbolsToRead) {
                    int symbol = readNextSymbol();
                    switch (symbol) {
                        case -1:
                            this.isEOF = true;
                            break;
                        case LockFreeTaskQueueCore.CLOSED_SHIFT:
                            symbolBufferLength = handlePaddingSymbol(symbolBufferLength);
                            this.isEOF = true;
                            break;
                        default:
                            this.symbolBuffer[symbolBufferLength] = (byte) symbol;
                            symbolBufferLength++;
                            break;
                    }
                }
                if (this.isEOF != 0 || symbolBufferLength == symbolsToRead) {
                    symbolsNeeded -= symbolBufferLength;
                    dstOffset += decodeSymbolBufferInto(destination, dstOffset, length + offset, symbolBufferLength);
                } else {
                    throw new IllegalStateException("Check failed.".toString());
                }
            }
            if (dstOffset != offset || !this.isEOF) {
                return dstOffset - offset;
            }
            return -1;
        }
    }

    public void close() {
        if (!this.isClosed) {
            this.isClosed = true;
            this.input.close();
        }
    }

    private final int decodeSymbolBufferInto(byte[] dst, int dstOffset, int dstEndIndex, int symbolBufferLength) {
        this.byteBufferEndIndex += this.base64.decodeIntoByteArray(this.symbolBuffer, this.byteBuffer, this.byteBufferEndIndex, 0, symbolBufferLength);
        int bytesToCopy = Math.min(getByteBufferLength(), dstEndIndex - dstOffset);
        copyByteBufferInto(dst, dstOffset, bytesToCopy);
        shiftByteBufferToStartIfNeeded();
        return bytesToCopy;
    }

    private final void copyByteBufferInto(byte[] dst, int dstOffset, int length) {
        ArraysKt.copyInto(this.byteBuffer, dst, dstOffset, this.byteBufferStartIndex, this.byteBufferStartIndex + length);
        this.byteBufferStartIndex += length;
        resetByteBufferIfEmpty();
    }

    private final void resetByteBufferIfEmpty() {
        if (this.byteBufferStartIndex == this.byteBufferEndIndex) {
            this.byteBufferStartIndex = 0;
            this.byteBufferEndIndex = 0;
        }
    }

    private final void shiftByteBufferToStartIfNeeded() {
        if ((this.symbolBuffer.length / 4) * 3 > this.byteBuffer.length - this.byteBufferEndIndex) {
            ArraysKt.copyInto(this.byteBuffer, this.byteBuffer, 0, this.byteBufferStartIndex, this.byteBufferEndIndex);
            this.byteBufferEndIndex -= this.byteBufferStartIndex;
            this.byteBufferStartIndex = 0;
        }
    }

    private final int handlePaddingSymbol(int symbolBufferLength) {
        this.symbolBuffer[symbolBufferLength] = Base64.padSymbol;
        if ((symbolBufferLength & 3) != 2) {
            return symbolBufferLength + 1;
        }
        int secondPad = readNextSymbol();
        if (secondPad >= 0) {
            this.symbolBuffer[symbolBufferLength + 1] = (byte) secondPad;
        }
        return symbolBufferLength + 2;
    }

    private final int readNextSymbol() {
        int read;
        if (!this.base64.isMimeScheme$kotlin_stdlib()) {
            return this.input.read();
        }
        do {
            read = this.input.read();
            if (read == -1 || Base64Kt.isInMimeAlphabet(read)) {
                return read;
            }
            read = this.input.read();
            break;
        } while (Base64Kt.isInMimeAlphabet(read));
        return read;
    }
}
