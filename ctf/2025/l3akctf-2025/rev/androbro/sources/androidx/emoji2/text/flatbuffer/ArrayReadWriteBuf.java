package androidx.emoji2.text.flatbuffer;

import java.util.Arrays;
import kotlin.UByte;

public class ArrayReadWriteBuf implements ReadWriteBuf {
    private byte[] buffer;
    private int writePos;

    public ArrayReadWriteBuf() {
        this(10);
    }

    public ArrayReadWriteBuf(int initialCapacity) {
        this(new byte[initialCapacity]);
    }

    public ArrayReadWriteBuf(byte[] buffer2) {
        this.buffer = buffer2;
        this.writePos = 0;
    }

    public ArrayReadWriteBuf(byte[] buffer2, int startPos) {
        this.buffer = buffer2;
        this.writePos = startPos;
    }

    public boolean getBoolean(int index) {
        return this.buffer[index] != 0;
    }

    public byte get(int index) {
        return this.buffer[index];
    }

    public short getShort(int index) {
        return (short) ((this.buffer[index + 1] << 8) | (this.buffer[index] & UByte.MAX_VALUE));
    }

    public int getInt(int index) {
        return (this.buffer[index + 3] << 24) | ((this.buffer[index + 2] & UByte.MAX_VALUE) << 16) | ((this.buffer[index + 1] & UByte.MAX_VALUE) << 8) | (this.buffer[index] & UByte.MAX_VALUE);
    }

    public long getLong(int index) {
        int index2 = index + 1;
        int index3 = index2 + 1;
        int index4 = index3 + 1;
        int index5 = index4 + 1;
        int index6 = index5 + 1;
        int index7 = index6 + 1;
        return (((long) this.buffer[index]) & 255) | ((((long) this.buffer[index2]) & 255) << 8) | ((((long) this.buffer[index3]) & 255) << 16) | ((((long) this.buffer[index4]) & 255) << 24) | ((((long) this.buffer[index5]) & 255) << 32) | ((((long) this.buffer[index6]) & 255) << 40) | ((255 & ((long) this.buffer[index7])) << 48) | (((long) this.buffer[index7 + 1]) << 56);
    }

    public float getFloat(int index) {
        return Float.intBitsToFloat(getInt(index));
    }

    public double getDouble(int index) {
        return Double.longBitsToDouble(getLong(index));
    }

    public String getString(int start, int size) {
        return Utf8Safe.decodeUtf8Array(this.buffer, start, size);
    }

    public byte[] data() {
        return this.buffer;
    }

    public void putBoolean(boolean value) {
        setBoolean(this.writePos, value);
        this.writePos++;
    }

    public void put(byte[] value, int start, int length) {
        set(this.writePos, value, start, length);
        this.writePos += length;
    }

    public void put(byte value) {
        set(this.writePos, value);
        this.writePos++;
    }

    public void putShort(short value) {
        setShort(this.writePos, value);
        this.writePos += 2;
    }

    public void putInt(int value) {
        setInt(this.writePos, value);
        this.writePos += 4;
    }

    public void putLong(long value) {
        setLong(this.writePos, value);
        this.writePos += 8;
    }

    public void putFloat(float value) {
        setFloat(this.writePos, value);
        this.writePos += 4;
    }

    public void putDouble(double value) {
        setDouble(this.writePos, value);
        this.writePos += 8;
    }

    public void setBoolean(int index, boolean value) {
        set(index, value);
    }

    public void set(int index, byte value) {
        requestCapacity(index + 1);
        this.buffer[index] = value;
    }

    public void set(int index, byte[] toCopy, int start, int length) {
        requestCapacity((length - start) + index);
        System.arraycopy(toCopy, start, this.buffer, index, length);
    }

    public void setShort(int index, short value) {
        requestCapacity(index + 2);
        this.buffer[index] = (byte) (value & 255);
        this.buffer[index + 1] = (byte) ((value >> 8) & 255);
    }

    public void setInt(int index, int value) {
        requestCapacity(index + 4);
        int index2 = index + 1;
        this.buffer[index] = (byte) (value & 255);
        int index3 = index2 + 1;
        this.buffer[index2] = (byte) ((value >> 8) & 255);
        this.buffer[index3] = (byte) ((value >> 16) & 255);
        this.buffer[index3 + 1] = (byte) ((value >> 24) & 255);
    }

    public void setLong(int index, long value) {
        requestCapacity(index + 8);
        int i = (int) value;
        int index2 = index + 1;
        this.buffer[index] = (byte) (i & 255);
        int index3 = index2 + 1;
        this.buffer[index2] = (byte) ((i >> 8) & 255);
        int index4 = index3 + 1;
        this.buffer[index3] = (byte) ((i >> 16) & 255);
        int index5 = index4 + 1;
        this.buffer[index4] = (byte) ((i >> 24) & 255);
        int i2 = (int) (value >> 32);
        int index6 = index5 + 1;
        this.buffer[index5] = (byte) (i2 & 255);
        int index7 = index6 + 1;
        this.buffer[index6] = (byte) ((i2 >> 8) & 255);
        this.buffer[index7] = (byte) ((i2 >> 16) & 255);
        this.buffer[index7 + 1] = (byte) ((i2 >> 24) & 255);
    }

    public void setFloat(int index, float value) {
        requestCapacity(index + 4);
        int iValue = Float.floatToRawIntBits(value);
        int index2 = index + 1;
        this.buffer[index] = (byte) (iValue & 255);
        int index3 = index2 + 1;
        this.buffer[index2] = (byte) ((iValue >> 8) & 255);
        this.buffer[index3] = (byte) ((iValue >> 16) & 255);
        this.buffer[index3 + 1] = (byte) ((iValue >> 24) & 255);
    }

    public void setDouble(int index, double value) {
        requestCapacity(index + 8);
        long lValue = Double.doubleToRawLongBits(value);
        int i = (int) lValue;
        int index2 = index + 1;
        this.buffer[index] = (byte) (i & 255);
        int index3 = index2 + 1;
        this.buffer[index2] = (byte) ((i >> 8) & 255);
        int index4 = index3 + 1;
        this.buffer[index3] = (byte) ((i >> 16) & 255);
        int index5 = index4 + 1;
        this.buffer[index4] = (byte) ((i >> 24) & 255);
        int i2 = (int) (lValue >> 32);
        int index6 = index5 + 1;
        this.buffer[index5] = (byte) (i2 & 255);
        int index7 = index6 + 1;
        this.buffer[index6] = (byte) ((i2 >> 8) & 255);
        this.buffer[index7] = (byte) ((i2 >> 16) & 255);
        this.buffer[index7 + 1] = (byte) ((i2 >> 24) & 255);
    }

    public int limit() {
        return this.writePos;
    }

    public int writePosition() {
        return this.writePos;
    }

    public boolean requestCapacity(int capacity) {
        if (this.buffer.length > capacity) {
            return true;
        }
        int oldCapacity = this.buffer.length;
        this.buffer = Arrays.copyOf(this.buffer, (oldCapacity >> 1) + oldCapacity);
        return true;
    }
}
