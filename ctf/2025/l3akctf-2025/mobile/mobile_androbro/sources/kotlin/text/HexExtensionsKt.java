package kotlin.text;

import java.util.Arrays;
import kotlin.Metadata;
import kotlin.ULong;
import kotlin.collections.AbstractList;
import kotlin.jvm.internal.Intrinsics;
import kotlin.ranges.ClosedRange;
import kotlin.ranges.IntRange;
import kotlin.ranges.RangesKt;
import kotlin.text.HexFormat;

@Metadata(d1 = {"\u0000L\n\u0000\n\u0002\u0010\u0015\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\t\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0012\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0010\u0005\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0012\n\u0002\b\u0004\n\u0002\u0010\n\n\u0002\b\u0004\u001a \u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\b\u001a\u00020\t2\u0006\u0010\n\u001a\u00020\tH\u0002\u001a@\u0010\u000b\u001a\u00020\t2\u0006\u0010\f\u001a\u00020\t2\u0006\u0010\r\u001a\u00020\t2\u0006\u0010\u000e\u001a\u00020\t2\u0006\u0010\u000f\u001a\u00020\t2\u0006\u0010\u0010\u001a\u00020\t2\u0006\u0010\u0011\u001a\u00020\t2\u0006\u0010\u0012\u001a\u00020\tH\u0000\u001a@\u0010\u0013\u001a\u00020\t2\u0006\u0010\u0014\u001a\u00020\t2\u0006\u0010\r\u001a\u00020\t2\u0006\u0010\u000e\u001a\u00020\t2\u0006\u0010\u000f\u001a\u00020\t2\u0006\u0010\u0010\u001a\u00020\t2\u0006\u0010\u0011\u001a\u00020\t2\u0006\u0010\u0012\u001a\u00020\tH\u0000\u001a \u0010\u0015\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\n\u001a\u00020\tH\u0002\u001a,\u0010\u0016\u001a\u00020\t*\u00020\u00032\u0006\u0010\u0017\u001a\u00020\u00032\u0006\u0010\u0018\u001a\u00020\t2\u0006\u0010\u0019\u001a\u00020\t2\u0006\u0010\u001a\u001a\u00020\u0003H\u0002\u001a,\u0010\u001b\u001a\u00020\u001c*\u00020\u00032\u0006\u0010\u001d\u001a\u00020\t2\u0006\u0010\u0019\u001a\u00020\t2\u0006\u0010\u001e\u001a\u00020\t2\u0006\u0010\u001f\u001a\u00020 H\u0002\u001a\u001c\u0010!\u001a\u00020\t*\u00020\u00032\u0006\u0010\u0018\u001a\u00020\t2\u0006\u0010\u0019\u001a\u00020\tH\u0002\u001a\u0014\u0010\"\u001a\u00020\t*\u00020\u00032\u0006\u0010\u0018\u001a\u00020\tH\u0002\u001a*\u0010#\u001a\u00020$*\u00020\u00032\b\b\u0002\u0010\u001d\u001a\u00020\t2\b\b\u0002\u0010\u0019\u001a\u00020\t2\b\b\u0002\u0010%\u001a\u00020&H\u0003\u001a\u0016\u0010#\u001a\u00020$*\u00020\u00032\b\b\u0002\u0010%\u001a\u00020&H\u0007\u001a*\u0010'\u001a\u00020(*\u00020\u00032\b\b\u0002\u0010\u001d\u001a\u00020\t2\b\b\u0002\u0010\u0019\u001a\u00020\t2\b\b\u0002\u0010%\u001a\u00020&H\u0003\u001a\u0016\u0010'\u001a\u00020(*\u00020\u00032\b\b\u0002\u0010%\u001a\u00020&H\u0007\u001a*\u0010)\u001a\u00020\t*\u00020\u00032\b\b\u0002\u0010\u001d\u001a\u00020\t2\b\b\u0002\u0010\u0019\u001a\u00020\t2\b\b\u0002\u0010%\u001a\u00020&H\u0003\u001a\u0016\u0010)\u001a\u00020\t*\u00020\u00032\b\b\u0002\u0010%\u001a\u00020&H\u0007\u001a*\u0010*\u001a\u00020\u0006*\u00020\u00032\b\b\u0002\u0010\u001d\u001a\u00020\t2\b\b\u0002\u0010\u0019\u001a\u00020\t2\b\b\u0002\u0010%\u001a\u00020&H\u0003\u001a\u0016\u0010*\u001a\u00020\u0006*\u00020\u00032\b\b\u0002\u0010%\u001a\u00020&H\u0007\u001a0\u0010+\u001a\u00020\u0006*\u00020\u00032\b\b\u0002\u0010\u001d\u001a\u00020\t2\b\b\u0002\u0010\u0019\u001a\u00020\t2\u0006\u0010%\u001a\u00020&2\u0006\u0010\u001e\u001a\u00020\tH\u0003\u001a*\u0010,\u001a\u00020-*\u00020\u00032\b\b\u0002\u0010\u001d\u001a\u00020\t2\b\b\u0002\u0010\u0019\u001a\u00020\t2\b\b\u0002\u0010%\u001a\u00020&H\u0003\u001a\u0016\u0010,\u001a\u00020-*\u00020\u00032\b\b\u0002\u0010%\u001a\u00020&H\u0007\u001a\u0016\u0010.\u001a\u00020\u0003*\u00020$2\b\b\u0002\u0010%\u001a\u00020&H\u0007\u001a*\u0010.\u001a\u00020\u0003*\u00020(2\b\b\u0002\u0010\u001d\u001a\u00020\t2\b\b\u0002\u0010\u0019\u001a\u00020\t2\b\b\u0002\u0010%\u001a\u00020&H\u0007\u001a\u0016\u0010.\u001a\u00020\u0003*\u00020(2\b\b\u0002\u0010%\u001a\u00020&H\u0007\u001a\u0016\u0010.\u001a\u00020\u0003*\u00020\t2\b\b\u0002\u0010%\u001a\u00020&H\u0007\u001a\u0016\u0010.\u001a\u00020\u0003*\u00020\u00062\b\b\u0002\u0010%\u001a\u00020&H\u0007\u001a\u0016\u0010.\u001a\u00020\u0003*\u00020-2\b\b\u0002\u0010%\u001a\u00020&H\u0007\u001a\u001c\u0010/\u001a\u00020\u0003*\u00020\u00062\u0006\u0010%\u001a\u00020&2\u0006\u00100\u001a\u00020\tH\u0003\"\u000e\u0010\u0000\u001a\u00020\u0001X\u0004¢\u0006\u0002\n\u0000\"\u000e\u0010\u0002\u001a\u00020\u0003XT¢\u0006\u0002\n\u0000\"\u000e\u0010\u0004\u001a\u00020\u0003XT¢\u0006\u0002\n\u0000¨\u00061"}, d2 = {"HEX_DIGITS_TO_DECIMAL", "", "LOWER_CASE_HEX_DIGITS", "", "UPPER_CASE_HEX_DIGITS", "charsPerSet", "", "charsPerElement", "elementsPerSet", "", "elementSeparatorLength", "formattedStringLength", "totalBytes", "bytesPerLine", "bytesPerGroup", "groupSeparatorLength", "byteSeparatorLength", "bytePrefixLength", "byteSuffixLength", "parsedByteArrayMaxSize", "stringLength", "wholeElementsPerSet", "checkContainsAt", "part", "index", "endIndex", "partName", "checkHexLength", "", "startIndex", "maxDigits", "requireMaxLength", "", "checkNewLineAt", "decimalFromHexDigitAt", "hexToByte", "", "format", "Lkotlin/text/HexFormat;", "hexToByteArray", "", "hexToInt", "hexToLong", "hexToLongImpl", "hexToShort", "", "toHexString", "toHexStringImpl", "bits", "kotlin-stdlib"}, k = 2, mv = {1, 9, 0}, xi = 48)
/* compiled from: HexExtensions.kt */
public final class HexExtensionsKt {
    private static final int[] HEX_DIGITS_TO_DECIMAL;
    private static final String LOWER_CASE_HEX_DIGITS = "0123456789abcdef";
    private static final String UPPER_CASE_HEX_DIGITS = "0123456789ABCDEF";

    static {
        int[] iArr = new int[128];
        int i = 0;
        for (int i2 = 0; i2 < 128; i2++) {
            iArr[i2] = -1;
        }
        int[] $this$HEX_DIGITS_TO_DECIMAL_u24lambda_u242 = iArr;
        int index$iv = 0;
        int i3 = 0;
        while (i3 < $this$forEachIndexed$iv.length()) {
            $this$HEX_DIGITS_TO_DECIMAL_u24lambda_u242[$this$forEachIndexed$iv.charAt(i3)] = index$iv;
            i3++;
            index$iv++;
        }
        int index$iv2 = 0;
        while (i < $this$forEachIndexed$iv.length()) {
            $this$HEX_DIGITS_TO_DECIMAL_u24lambda_u242[$this$forEachIndexed$iv.charAt(i)] = index$iv2;
            i++;
            index$iv2++;
        }
        HEX_DIGITS_TO_DECIMAL = iArr;
    }

    public static final String toHexString(byte[] $this$toHexString, HexFormat format) {
        Intrinsics.checkNotNullParameter($this$toHexString, "<this>");
        Intrinsics.checkNotNullParameter(format, "format");
        return toHexString($this$toHexString, 0, $this$toHexString.length, format);
    }

    public static /* synthetic */ String toHexString$default(byte[] bArr, HexFormat hexFormat, int i, Object obj) {
        if ((i & 1) != 0) {
            hexFormat = HexFormat.Companion.getDefault();
        }
        return toHexString(bArr, hexFormat);
    }

    public static /* synthetic */ String toHexString$default(byte[] bArr, int i, int i2, HexFormat hexFormat, int i3, Object obj) {
        if ((i3 & 1) != 0) {
            i = 0;
        }
        if ((i3 & 2) != 0) {
            i2 = bArr.length;
        }
        if ((i3 & 4) != 0) {
            hexFormat = HexFormat.Companion.getDefault();
        }
        return toHexString(bArr, i, i2, hexFormat);
    }

    public static final String toHexString(byte[] $this$toHexString, int startIndex, int endIndex, HexFormat format) {
        boolean z;
        byte[] bArr = $this$toHexString;
        int i = startIndex;
        int i2 = endIndex;
        Intrinsics.checkNotNullParameter(bArr, "<this>");
        Intrinsics.checkNotNullParameter(format, "format");
        AbstractList.Companion.checkBoundsIndexes$kotlin_stdlib(i, i2, bArr.length);
        if (i == i2) {
            return "";
        }
        String digits = format.getUpperCase() ? UPPER_CASE_HEX_DIGITS : LOWER_CASE_HEX_DIGITS;
        HexFormat.BytesHexFormat bytesFormat = format.getBytes();
        int bytesPerLine = bytesFormat.getBytesPerLine();
        int bytesPerGroup = bytesFormat.getBytesPerGroup();
        String bytePrefix = bytesFormat.getBytePrefix();
        String byteSuffix = bytesFormat.getByteSuffix();
        String byteSeparator = bytesFormat.getByteSeparator();
        String groupSeparator = bytesFormat.getGroupSeparator();
        String groupSeparator2 = groupSeparator;
        String byteSeparator2 = byteSeparator;
        HexFormat.BytesHexFormat bytesHexFormat = bytesFormat;
        String byteSuffix2 = byteSuffix;
        int formatLength = formattedStringLength(i2 - i, bytesPerLine, bytesPerGroup, groupSeparator.length(), byteSeparator.length(), bytePrefix.length(), byteSuffix.length());
        int indexInLine = 0;
        int indexInGroup = 0;
        StringBuilder sb = new StringBuilder(formatLength);
        StringBuilder $this$toHexString_u24lambda_u243 = sb;
        int i3 = startIndex;
        while (true) {
            z = true;
            if (i3 >= i2) {
                break;
            }
            int i4 = bArr[i3] & 255;
            if (indexInLine == bytesPerLine) {
                $this$toHexString_u24lambda_u243.append(10);
                indexInLine = 0;
                indexInGroup = 0;
            } else if (indexInGroup == bytesPerGroup) {
                $this$toHexString_u24lambda_u243.append(groupSeparator2);
                indexInGroup = 0;
            }
            if (indexInGroup != 0) {
                $this$toHexString_u24lambda_u243.append(byteSeparator2);
            }
            $this$toHexString_u24lambda_u243.append(bytePrefix);
            $this$toHexString_u24lambda_u243.append(digits.charAt(i4 >> 4));
            $this$toHexString_u24lambda_u243.append(digits.charAt(i4 & 15));
            $this$toHexString_u24lambda_u243.append(byteSuffix2);
            indexInGroup++;
            indexInLine++;
            i3++;
            bArr = $this$toHexString;
            i2 = endIndex;
        }
        if (formatLength != $this$toHexString_u24lambda_u243.length()) {
            z = false;
        }
        if (z) {
            String sb2 = sb.toString();
            Intrinsics.checkNotNullExpressionValue(sb2, "toString(...)");
            return sb2;
        }
        throw new IllegalStateException("Check failed.".toString());
    }

    public static final int formattedStringLength(int totalBytes, int bytesPerLine, int bytesPerGroup, int groupSeparatorLength, int byteSeparatorLength, int bytePrefixLength, int byteSuffixLength) {
        int i = totalBytes;
        if (i > 0) {
            int lineSeparators = (i - 1) / bytesPerLine;
            int groupSeparatorsPerLine = (bytesPerLine - 1) / bytesPerGroup;
            int it = i % bytesPerLine;
            if (it == 0) {
                it = bytesPerLine;
            }
            int groupSeparators = (lineSeparators * groupSeparatorsPerLine) + ((it - 1) / bytesPerGroup);
            int i2 = lineSeparators;
            long totalLength = ((long) lineSeparators) + (((long) groupSeparators) * ((long) groupSeparatorLength)) + (((long) (((i - 1) - lineSeparators) - groupSeparators)) * ((long) byteSeparatorLength)) + (((long) i) * (((long) bytePrefixLength) + 2 + ((long) byteSuffixLength)));
            if (RangesKt.intRangeContains((ClosedRange<Integer>) new IntRange(0, Integer.MAX_VALUE), totalLength)) {
                return (int) totalLength;
            }
            throw new IllegalArgumentException("The resulting string length is too big: " + ULong.m501toStringimpl(ULong.m455constructorimpl(totalLength)));
        }
        int i3 = groupSeparatorLength;
        int i4 = byteSeparatorLength;
        int i5 = bytePrefixLength;
        int i6 = byteSuffixLength;
        throw new IllegalArgumentException("Failed requirement.".toString());
    }

    public static final byte[] hexToByteArray(String $this$hexToByteArray, HexFormat format) {
        Intrinsics.checkNotNullParameter($this$hexToByteArray, "<this>");
        Intrinsics.checkNotNullParameter(format, "format");
        return hexToByteArray($this$hexToByteArray, 0, $this$hexToByteArray.length(), format);
    }

    public static /* synthetic */ byte[] hexToByteArray$default(String str, HexFormat hexFormat, int i, Object obj) {
        if ((i & 1) != 0) {
            hexFormat = HexFormat.Companion.getDefault();
        }
        return hexToByteArray(str, hexFormat);
    }

    static /* synthetic */ byte[] hexToByteArray$default(String str, int i, int i2, HexFormat hexFormat, int i3, Object obj) {
        if ((i3 & 1) != 0) {
            i = 0;
        }
        if ((i3 & 2) != 0) {
            i2 = str.length();
        }
        if ((i3 & 4) != 0) {
            hexFormat = HexFormat.Companion.getDefault();
        }
        return hexToByteArray(str, i, i2, hexFormat);
    }

    private static final byte[] hexToByteArray(String $this$hexToByteArray, int startIndex, int endIndex, HexFormat format) {
        String str = $this$hexToByteArray;
        int i = startIndex;
        int i2 = endIndex;
        AbstractList.Companion.checkBoundsIndexes$kotlin_stdlib(i, i2, $this$hexToByteArray.length());
        if (i == i2) {
            return new byte[0];
        }
        HexFormat.BytesHexFormat bytesFormat = format.getBytes();
        int bytesPerLine = bytesFormat.getBytesPerLine();
        int bytesPerGroup = bytesFormat.getBytesPerGroup();
        String bytePrefix = bytesFormat.getBytePrefix();
        String byteSuffix = bytesFormat.getByteSuffix();
        String byteSeparator = bytesFormat.getByteSeparator();
        String groupSeparator = bytesFormat.getGroupSeparator();
        String groupSeparator2 = groupSeparator;
        byte[] result = new byte[parsedByteArrayMaxSize(i2 - i, bytesPerLine, bytesPerGroup, groupSeparator.length(), byteSeparator.length(), bytePrefix.length(), byteSuffix.length())];
        int i3 = startIndex;
        int byteIndex = 0;
        int indexInLine = 0;
        int indexInGroup = 0;
        while (i3 < i2) {
            if (indexInLine == bytesPerLine) {
                i3 = checkNewLineAt(str, i3, i2);
                indexInLine = 0;
                indexInGroup = 0;
            } else if (indexInGroup == bytesPerGroup) {
                i3 = checkContainsAt(str, groupSeparator2, i3, i2, "group separator");
                indexInGroup = 0;
            } else if (indexInGroup != 0) {
                i3 = checkContainsAt(str, byteSeparator, i3, i2, "byte separator");
            }
            indexInLine++;
            indexInGroup++;
            int i4 = checkContainsAt(str, bytePrefix, i3, i2, "byte prefix");
            HexFormat.BytesHexFormat bytesFormat2 = bytesFormat;
            checkHexLength(str, i4, RangesKt.coerceAtMost(i4 + 2, i2), 2, true);
            int i5 = i4 + 1;
            int i6 = i5 + 1;
            result[byteIndex] = (byte) (decimalFromHexDigitAt(str, i5) | (decimalFromHexDigitAt(str, i4) << 4));
            i3 = checkContainsAt(str, byteSuffix, i6, i2, "byte suffix");
            byteIndex++;
            groupSeparator2 = groupSeparator2;
            bytesFormat = bytesFormat2;
        }
        HexFormat.BytesHexFormat bytesHexFormat = bytesFormat;
        if (byteIndex == result.length) {
            return result;
        }
        byte[] copyOf = Arrays.copyOf(result, byteIndex);
        Intrinsics.checkNotNullExpressionValue(copyOf, "copyOf(...)");
        return copyOf;
    }

    public static final int parsedByteArrayMaxSize(int stringLength, int bytesPerLine, int bytesPerGroup, int groupSeparatorLength, int byteSeparatorLength, int bytePrefixLength, int byteSuffixLength) {
        long j;
        int i = stringLength;
        int i2 = bytesPerLine;
        int i3 = bytesPerGroup;
        int i4 = groupSeparatorLength;
        int i5 = byteSeparatorLength;
        if (i > 0) {
            long charsPerByte = ((long) bytePrefixLength) + 2 + ((long) byteSuffixLength);
            long charsPerGroup = charsPerSet(charsPerByte, i3, i5);
            if (i2 <= i3) {
                j = charsPerSet(charsPerByte, i2, i5);
            } else {
                long result = charsPerSet(charsPerGroup, i2 / i3, i4);
                int bytesPerLastGroupInLine = i2 % i3;
                if (bytesPerLastGroupInLine != 0) {
                    result = result + ((long) i4) + charsPerSet(charsPerByte, bytesPerLastGroupInLine, i5);
                }
                j = result;
            }
            long charsPerLine = j;
            long numberOfChars = (long) i;
            long wholeLines = wholeElementsPerSet(numberOfChars, charsPerLine, 1);
            long numberOfChars2 = numberOfChars - ((charsPerLine + 1) * wholeLines);
            long wholeGroupsInLastLine = wholeElementsPerSet(numberOfChars2, charsPerGroup, i4);
            long numberOfChars3 = numberOfChars2 - ((((long) i4) + charsPerGroup) * wholeGroupsInLastLine);
            long charsPerByte2 = charsPerByte;
            long wholeBytesInLastGroup = wholeElementsPerSet(numberOfChars3, charsPerByte2, i5);
            return (int) ((((long) i2) * wholeLines) + (((long) i3) * wholeGroupsInLastLine) + wholeBytesInLastGroup + ((long) (numberOfChars3 - ((((long) i5) + charsPerByte2) * wholeBytesInLastGroup) > 0 ? 1 : 0)));
        }
        throw new IllegalArgumentException("Failed requirement.".toString());
    }

    private static final long charsPerSet(long charsPerElement, int elementsPerSet, int elementSeparatorLength) {
        if (elementsPerSet > 0) {
            return (((long) elementsPerSet) * charsPerElement) + (((long) elementSeparatorLength) * (((long) elementsPerSet) - 1));
        }
        throw new IllegalArgumentException("Failed requirement.".toString());
    }

    private static final long wholeElementsPerSet(long charsPerSet, long charsPerElement, int elementSeparatorLength) {
        if (charsPerSet <= 0 || charsPerElement <= 0) {
            return 0;
        }
        return (((long) elementSeparatorLength) + charsPerSet) / (((long) elementSeparatorLength) + charsPerElement);
    }

    private static final int checkNewLineAt(String $this$checkNewLineAt, int index, int endIndex) {
        if ($this$checkNewLineAt.charAt(index) == 13) {
            return (index + 1 >= endIndex || $this$checkNewLineAt.charAt(index + 1) != 10) ? index + 1 : index + 2;
        }
        if ($this$checkNewLineAt.charAt(index) == 10) {
            return index + 1;
        }
        throw new NumberFormatException("Expected a new line at index " + index + ", but was " + $this$checkNewLineAt.charAt(index));
    }

    public static final String toHexString(byte $this$toHexString, HexFormat format) {
        Intrinsics.checkNotNullParameter(format, "format");
        return toHexStringImpl((long) $this$toHexString, format, 8);
    }

    public static /* synthetic */ String toHexString$default(byte b, HexFormat hexFormat, int i, Object obj) {
        if ((i & 1) != 0) {
            hexFormat = HexFormat.Companion.getDefault();
        }
        return toHexString(b, hexFormat);
    }

    public static final byte hexToByte(String $this$hexToByte, HexFormat format) {
        Intrinsics.checkNotNullParameter($this$hexToByte, "<this>");
        Intrinsics.checkNotNullParameter(format, "format");
        return hexToByte($this$hexToByte, 0, $this$hexToByte.length(), format);
    }

    public static /* synthetic */ byte hexToByte$default(String str, HexFormat hexFormat, int i, Object obj) {
        if ((i & 1) != 0) {
            hexFormat = HexFormat.Companion.getDefault();
        }
        return hexToByte(str, hexFormat);
    }

    static /* synthetic */ byte hexToByte$default(String str, int i, int i2, HexFormat hexFormat, int i3, Object obj) {
        if ((i3 & 1) != 0) {
            i = 0;
        }
        if ((i3 & 2) != 0) {
            i2 = str.length();
        }
        if ((i3 & 4) != 0) {
            hexFormat = HexFormat.Companion.getDefault();
        }
        return hexToByte(str, i, i2, hexFormat);
    }

    private static final byte hexToByte(String $this$hexToByte, int startIndex, int endIndex, HexFormat format) {
        return (byte) ((int) hexToLongImpl($this$hexToByte, startIndex, endIndex, format, 2));
    }

    public static final String toHexString(short $this$toHexString, HexFormat format) {
        Intrinsics.checkNotNullParameter(format, "format");
        return toHexStringImpl((long) $this$toHexString, format, 16);
    }

    public static /* synthetic */ String toHexString$default(short s, HexFormat hexFormat, int i, Object obj) {
        if ((i & 1) != 0) {
            hexFormat = HexFormat.Companion.getDefault();
        }
        return toHexString(s, hexFormat);
    }

    public static final short hexToShort(String $this$hexToShort, HexFormat format) {
        Intrinsics.checkNotNullParameter($this$hexToShort, "<this>");
        Intrinsics.checkNotNullParameter(format, "format");
        return hexToShort($this$hexToShort, 0, $this$hexToShort.length(), format);
    }

    public static /* synthetic */ short hexToShort$default(String str, HexFormat hexFormat, int i, Object obj) {
        if ((i & 1) != 0) {
            hexFormat = HexFormat.Companion.getDefault();
        }
        return hexToShort(str, hexFormat);
    }

    static /* synthetic */ short hexToShort$default(String str, int i, int i2, HexFormat hexFormat, int i3, Object obj) {
        if ((i3 & 1) != 0) {
            i = 0;
        }
        if ((i3 & 2) != 0) {
            i2 = str.length();
        }
        if ((i3 & 4) != 0) {
            hexFormat = HexFormat.Companion.getDefault();
        }
        return hexToShort(str, i, i2, hexFormat);
    }

    private static final short hexToShort(String $this$hexToShort, int startIndex, int endIndex, HexFormat format) {
        return (short) ((int) hexToLongImpl($this$hexToShort, startIndex, endIndex, format, 4));
    }

    public static final String toHexString(int $this$toHexString, HexFormat format) {
        Intrinsics.checkNotNullParameter(format, "format");
        return toHexStringImpl((long) $this$toHexString, format, 32);
    }

    public static /* synthetic */ String toHexString$default(int i, HexFormat hexFormat, int i2, Object obj) {
        if ((i2 & 1) != 0) {
            hexFormat = HexFormat.Companion.getDefault();
        }
        return toHexString(i, hexFormat);
    }

    public static final int hexToInt(String $this$hexToInt, HexFormat format) {
        Intrinsics.checkNotNullParameter($this$hexToInt, "<this>");
        Intrinsics.checkNotNullParameter(format, "format");
        return hexToInt($this$hexToInt, 0, $this$hexToInt.length(), format);
    }

    public static /* synthetic */ int hexToInt$default(String str, HexFormat hexFormat, int i, Object obj) {
        if ((i & 1) != 0) {
            hexFormat = HexFormat.Companion.getDefault();
        }
        return hexToInt(str, hexFormat);
    }

    static /* synthetic */ int hexToInt$default(String str, int i, int i2, HexFormat hexFormat, int i3, Object obj) {
        if ((i3 & 1) != 0) {
            i = 0;
        }
        if ((i3 & 2) != 0) {
            i2 = str.length();
        }
        if ((i3 & 4) != 0) {
            hexFormat = HexFormat.Companion.getDefault();
        }
        return hexToInt(str, i, i2, hexFormat);
    }

    private static final int hexToInt(String $this$hexToInt, int startIndex, int endIndex, HexFormat format) {
        return (int) hexToLongImpl($this$hexToInt, startIndex, endIndex, format, 8);
    }

    public static final String toHexString(long $this$toHexString, HexFormat format) {
        Intrinsics.checkNotNullParameter(format, "format");
        return toHexStringImpl($this$toHexString, format, 64);
    }

    public static /* synthetic */ String toHexString$default(long j, HexFormat hexFormat, int i, Object obj) {
        if ((i & 1) != 0) {
            hexFormat = HexFormat.Companion.getDefault();
        }
        return toHexString(j, hexFormat);
    }

    public static final long hexToLong(String $this$hexToLong, HexFormat format) {
        Intrinsics.checkNotNullParameter($this$hexToLong, "<this>");
        Intrinsics.checkNotNullParameter(format, "format");
        return hexToLong($this$hexToLong, 0, $this$hexToLong.length(), format);
    }

    public static /* synthetic */ long hexToLong$default(String str, HexFormat hexFormat, int i, Object obj) {
        if ((i & 1) != 0) {
            hexFormat = HexFormat.Companion.getDefault();
        }
        return hexToLong(str, hexFormat);
    }

    static /* synthetic */ long hexToLong$default(String str, int i, int i2, HexFormat hexFormat, int i3, Object obj) {
        if ((i3 & 1) != 0) {
            i = 0;
        }
        if ((i3 & 2) != 0) {
            i2 = str.length();
        }
        if ((i3 & 4) != 0) {
            hexFormat = HexFormat.Companion.getDefault();
        }
        return hexToLong(str, i, i2, hexFormat);
    }

    private static final long hexToLong(String $this$hexToLong, int startIndex, int endIndex, HexFormat format) {
        return hexToLongImpl($this$hexToLong, startIndex, endIndex, format, 16);
    }

    private static final String toHexStringImpl(long $this$toHexStringImpl, HexFormat format, int bits) {
        if ((bits & 3) == 0) {
            String digits = format.getUpperCase() ? UPPER_CASE_HEX_DIGITS : LOWER_CASE_HEX_DIGITS;
            long value = $this$toHexStringImpl;
            String prefix = format.getNumber().getPrefix();
            String suffix = format.getNumber().getSuffix();
            int formatLength = prefix.length() + (bits >> 2) + suffix.length();
            boolean removeZeros = format.getNumber().getRemoveLeadingZeros();
            StringBuilder sb = new StringBuilder(formatLength);
            StringBuilder $this$toHexStringImpl_u24lambda_u246 = sb;
            $this$toHexStringImpl_u24lambda_u246.append(prefix);
            int shift = bits;
            while (shift > 0) {
                shift -= 4;
                int decimal = (int) ((value >> shift) & 15);
                removeZeros = removeZeros && decimal == 0 && shift > 0;
                if (!removeZeros) {
                    $this$toHexStringImpl_u24lambda_u246.append(digits.charAt(decimal));
                }
            }
            $this$toHexStringImpl_u24lambda_u246.append(suffix);
            String sb2 = sb.toString();
            Intrinsics.checkNotNullExpressionValue(sb2, "toString(...)");
            return sb2;
        }
        throw new IllegalArgumentException("Failed requirement.".toString());
    }

    static /* synthetic */ long hexToLongImpl$default(String str, int i, int i2, HexFormat hexFormat, int i3, int i4, Object obj) {
        if ((i4 & 1) != 0) {
            i = 0;
        }
        if ((i4 & 2) != 0) {
            i2 = str.length();
        }
        return hexToLongImpl(str, i, i2, hexFormat, i3);
    }

    private static final long hexToLongImpl(String $this$hexToLongImpl, int startIndex, int endIndex, HexFormat format, int maxDigits) {
        AbstractList.Companion.checkBoundsIndexes$kotlin_stdlib(startIndex, endIndex, $this$hexToLongImpl.length());
        String prefix = format.getNumber().getPrefix();
        String suffix = format.getNumber().getSuffix();
        if (prefix.length() + suffix.length() < endIndex - startIndex) {
            int digitsStartIndex = checkContainsAt($this$hexToLongImpl, prefix, startIndex, endIndex, "prefix");
            int digitsEndIndex = endIndex - suffix.length();
            checkContainsAt($this$hexToLongImpl, suffix, digitsEndIndex, endIndex, "suffix");
            checkHexLength($this$hexToLongImpl, digitsStartIndex, digitsEndIndex, maxDigits, false);
            long result = 0;
            for (int i = digitsStartIndex; i < digitsEndIndex; i++) {
                result = (result << 4) | ((long) decimalFromHexDigitAt($this$hexToLongImpl, i));
            }
            return result;
        }
        StringBuilder append = new StringBuilder().append("Expected a hexadecimal number with prefix \"").append(prefix).append("\" and suffix \"").append(suffix).append("\", but was ");
        Intrinsics.checkNotNull($this$hexToLongImpl, "null cannot be cast to non-null type java.lang.String");
        String substring = $this$hexToLongImpl.substring(startIndex, endIndex);
        Intrinsics.checkNotNullExpressionValue(substring, "substring(...)");
        throw new NumberFormatException(append.append(substring).toString());
    }

    private static final int checkContainsAt(String $this$checkContainsAt, String part, int index, int endIndex, String partName) {
        int end = part.length() + index;
        if (end <= endIndex) {
            if (StringsKt.regionMatches($this$checkContainsAt, index, part, 0, part.length(), true)) {
                return end;
            }
        }
        StringBuilder append = new StringBuilder().append("Expected ").append(partName).append(" \"").append(part).append("\" at index ").append(index).append(", but was ");
        int coerceAtMost = RangesKt.coerceAtMost(end, endIndex);
        Intrinsics.checkNotNull($this$checkContainsAt, "null cannot be cast to non-null type java.lang.String");
        String substring = $this$checkContainsAt.substring(index, coerceAtMost);
        Intrinsics.checkNotNullExpressionValue(substring, "substring(...)");
        throw new NumberFormatException(append.append(substring).toString());
    }

    private static final void checkHexLength(String $this$checkHexLength, int startIndex, int endIndex, int maxDigits, boolean requireMaxLength) {
        int digitsLength = endIndex - startIndex;
        boolean isCorrectLength = true;
        if (!requireMaxLength ? digitsLength > maxDigits : digitsLength != maxDigits) {
            isCorrectLength = false;
        }
        if (!isCorrectLength) {
            String specifier = requireMaxLength ? "exactly" : "at most";
            Intrinsics.checkNotNull($this$checkHexLength, "null cannot be cast to non-null type java.lang.String");
            String substring = $this$checkHexLength.substring(startIndex, endIndex);
            Intrinsics.checkNotNullExpressionValue(substring, "substring(...)");
            throw new NumberFormatException("Expected " + specifier + ' ' + maxDigits + " hexadecimal digits at index " + startIndex + ", but was " + substring + " of length " + digitsLength);
        }
    }

    private static final int decimalFromHexDigitAt(String $this$decimalFromHexDigitAt, int index) {
        int code = $this$decimalFromHexDigitAt.charAt(index);
        if (code <= 127 && HEX_DIGITS_TO_DECIMAL[code] >= 0) {
            return HEX_DIGITS_TO_DECIMAL[code];
        }
        throw new NumberFormatException("Expected a hexadecimal digit at index " + index + ", but was " + $this$decimalFromHexDigitAt.charAt(index));
    }
}
