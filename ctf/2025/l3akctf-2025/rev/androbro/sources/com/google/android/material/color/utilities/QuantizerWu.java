package com.google.android.material.color.utilities;

import androidx.core.view.ViewCompat;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;

public final class QuantizerWu implements Quantizer {
    private static final int INDEX_BITS = 5;
    private static final int INDEX_COUNT = 33;
    private static final int TOTAL_SIZE = 35937;
    Box[] cubes;
    double[] moments;
    int[] momentsB;
    int[] momentsG;
    int[] momentsR;
    int[] weights;

    private enum Direction {
        RED,
        GREEN,
        BLUE
    }

    public QuantizerResult quantize(int[] pixels, int colorCount) {
        constructHistogram(new QuantizerMap().quantize(pixels, colorCount).colorToCount);
        createMoments();
        List<Integer> colors = createResult(createBoxes(colorCount).resultCount);
        Map<Integer, Integer> resultMap = new LinkedHashMap<>();
        for (Integer intValue : colors) {
            resultMap.put(Integer.valueOf(intValue.intValue()), 0);
        }
        return new QuantizerResult(resultMap);
    }

    static int getIndex(int r, int g, int b) {
        return (r << 10) + (r << 6) + r + (g << 5) + g + b;
    }

    /* access modifiers changed from: package-private */
    public void constructHistogram(Map<Integer, Integer> pixels) {
        QuantizerWu quantizerWu = this;
        quantizerWu.weights = new int[TOTAL_SIZE];
        quantizerWu.momentsR = new int[TOTAL_SIZE];
        quantizerWu.momentsG = new int[TOTAL_SIZE];
        quantizerWu.momentsB = new int[TOTAL_SIZE];
        quantizerWu.moments = new double[TOTAL_SIZE];
        for (Iterator<Map.Entry<Integer, Integer>> it = pixels.entrySet().iterator(); it.hasNext(); it = it) {
            Map.Entry<Integer, Integer> pair = it.next();
            int pixel = pair.getKey().intValue();
            int count = pair.getValue().intValue();
            int red = ColorUtils.redFromArgb(pixel);
            int green = ColorUtils.greenFromArgb(pixel);
            int blue = ColorUtils.blueFromArgb(pixel);
            int index = getIndex((red >> 3) + 1, (green >> 3) + 1, (blue >> 3) + 1);
            int[] iArr = quantizerWu.weights;
            iArr[index] = iArr[index] + count;
            int[] iArr2 = quantizerWu.momentsR;
            iArr2[index] = iArr2[index] + (red * count);
            int[] iArr3 = quantizerWu.momentsG;
            iArr3[index] = iArr3[index] + (green * count);
            int[] iArr4 = quantizerWu.momentsB;
            iArr4[index] = iArr4[index] + (blue * count);
            double[] dArr = quantizerWu.moments;
            dArr[index] = dArr[index] + ((double) (count * ((red * red) + (green * green) + (blue * blue))));
            quantizerWu = this;
        }
    }

    /* access modifiers changed from: package-private */
    public void createMoments() {
        int r = 1;
        while (true) {
            int i = 33;
            if (r < 33) {
                int[] area = new int[33];
                int[] areaR = new int[33];
                int[] areaG = new int[33];
                int[] areaB = new int[33];
                double[] area2 = new double[33];
                int g = 1;
                while (g < i) {
                    int line = 0;
                    int lineR = 0;
                    int lineG = 0;
                    int lineB = 0;
                    double line2 = 0.0d;
                    int b = 1;
                    while (b < i) {
                        int index = getIndex(r, g, b);
                        int line3 = line + this.weights[index];
                        int lineR2 = lineR + this.momentsR[index];
                        lineG += this.momentsG[index];
                        lineB += this.momentsB[index];
                        line2 += this.moments[index];
                        area[b] = area[b] + line3;
                        areaR[b] = areaR[b] + lineR2;
                        areaG[b] = areaG[b] + lineG;
                        areaB[b] = areaB[b] + lineB;
                        area2[b] = area2[b] + line2;
                        int previousIndex = getIndex(r - 1, g, b);
                        this.weights[index] = this.weights[previousIndex] + area[b];
                        this.momentsR[index] = this.momentsR[previousIndex] + areaR[b];
                        this.momentsG[index] = this.momentsG[previousIndex] + areaG[b];
                        this.momentsB[index] = this.momentsB[previousIndex] + areaB[b];
                        this.moments[index] = this.moments[previousIndex] + area2[b];
                        b++;
                        line = line3;
                        lineR = lineR2;
                        i = 33;
                    }
                    g++;
                    i = 33;
                }
                r++;
            } else {
                return;
            }
        }
    }

    /* access modifiers changed from: package-private */
    public CreateBoxesResult createBoxes(int maxColorCount) {
        this.cubes = new Box[maxColorCount];
        for (int i = 0; i < maxColorCount; i++) {
            this.cubes[i] = new Box();
        }
        double[] volumeVariance = new double[maxColorCount];
        Box firstBox = this.cubes[0];
        firstBox.r1 = 32;
        firstBox.g1 = 32;
        firstBox.b1 = 32;
        int generatedColorCount = maxColorCount;
        int next = 0;
        int i2 = 1;
        while (true) {
            if (i2 >= maxColorCount) {
                break;
            }
            if (cut(this.cubes[next], this.cubes[i2]).booleanValue()) {
                volumeVariance[next] = this.cubes[next].vol > 1 ? variance(this.cubes[next]) : 0.0d;
                volumeVariance[i2] = this.cubes[i2].vol > 1 ? variance(this.cubes[i2]) : 0.0d;
            } else {
                volumeVariance[next] = 0.0d;
                i2--;
            }
            next = 0;
            double temp = volumeVariance[0];
            for (int j = 1; j <= i2; j++) {
                if (volumeVariance[j] > temp) {
                    temp = volumeVariance[j];
                    next = j;
                }
            }
            if (temp <= 0.0d) {
                generatedColorCount = i2 + 1;
                break;
            }
            i2++;
        }
        return new CreateBoxesResult(maxColorCount, generatedColorCount);
    }

    /* access modifiers changed from: package-private */
    public List<Integer> createResult(int colorCount) {
        List<Integer> colors = new ArrayList<>();
        for (int i = 0; i < colorCount; i++) {
            Box cube = this.cubes[i];
            int weight = volume(cube, this.weights);
            if (weight > 0) {
                colors.add(Integer.valueOf((((volume(cube, this.momentsR) / weight) & 255) << 16) | ViewCompat.MEASURED_STATE_MASK | (((volume(cube, this.momentsG) / weight) & 255) << 8) | ((volume(cube, this.momentsB) / weight) & 255)));
            }
        }
        return colors;
    }

    /* access modifiers changed from: package-private */
    public double variance(Box cube) {
        int dr = volume(cube, this.momentsR);
        int dg = volume(cube, this.momentsG);
        int db = volume(cube, this.momentsB);
        return (((((((this.moments[getIndex(cube.r1, cube.g1, cube.b1)] - this.moments[getIndex(cube.r1, cube.g1, cube.b0)]) - this.moments[getIndex(cube.r1, cube.g0, cube.b1)]) + this.moments[getIndex(cube.r1, cube.g0, cube.b0)]) - this.moments[getIndex(cube.r0, cube.g1, cube.b1)]) + this.moments[getIndex(cube.r0, cube.g1, cube.b0)]) + this.moments[getIndex(cube.r0, cube.g0, cube.b1)]) - this.moments[getIndex(cube.r0, cube.g0, cube.b0)]) - (((double) (((dr * dr) + (dg * dg)) + (db * db))) / ((double) volume(cube, this.weights)));
    }

    /* access modifiers changed from: package-private */
    public Boolean cut(Box one, Box two) {
        Direction cutDirection;
        Box box = one;
        Box box2 = two;
        int wholeR = volume(box, this.momentsR);
        int wholeG = volume(box, this.momentsG);
        int wholeB = volume(box, this.momentsB);
        int wholeW = volume(box, this.weights);
        Box box3 = one;
        int i = wholeR;
        int i2 = wholeG;
        int i3 = wholeB;
        MaximizeResult maxRResult = maximize(box3, Direction.RED, box.r0 + 1, box.r1, i, i2, i3, wholeW);
        MaximizeResult maxRResult2 = maxRResult;
        MaximizeResult maxGResult = maximize(box3, Direction.GREEN, box.g0 + 1, box.g1, i, i2, i3, wholeW);
        int i4 = wholeR;
        MaximizeResult maxGResult2 = maxGResult;
        MaximizeResult maxBResult = maximize(box3, Direction.BLUE, box.b0 + 1, box.b1, i, i2, i3, wholeW);
        double maxR = maxRResult2.maximum;
        double maxG = maxGResult2.maximum;
        double maxB = maxBResult.maximum;
        if (maxR < maxG || maxR < maxB) {
            if (maxG < maxR || maxG < maxB) {
                cutDirection = Direction.BLUE;
            } else {
                cutDirection = Direction.GREEN;
            }
        } else if (maxRResult2.cutLocation < 0) {
            return false;
        } else {
            cutDirection = Direction.RED;
        }
        box2.r1 = box.r1;
        box2.g1 = box.g1;
        box2.b1 = box.b1;
        switch (cutDirection) {
            case RED:
                box.r1 = maxRResult2.cutLocation;
                box2.r0 = box.r1;
                box2.g0 = box.g0;
                box2.b0 = box.b0;
                break;
            case GREEN:
                box.g1 = maxGResult2.cutLocation;
                box2.r0 = box.r0;
                box2.g0 = box.g1;
                box2.b0 = box.b0;
                break;
            case BLUE:
                box.b1 = maxBResult.cutLocation;
                box2.r0 = box.r0;
                box2.g0 = box.g0;
                box2.b0 = box.b1;
                break;
        }
        MaximizeResult maximizeResult = maxBResult;
        double d = maxR;
        box.vol = (box.r1 - box.r0) * (box.g1 - box.g0) * (box.b1 - box.b0);
        box2.vol = (box2.r1 - box2.r0) * (box2.g1 - box2.g0) * (box2.b1 - box2.b0);
        return true;
    }

    /* access modifiers changed from: package-private */
    public MaximizeResult maximize(Box cube, Direction direction, int first, int last, int wholeR, int wholeG, int wholeB, int wholeW) {
        int bottomB;
        int bottomG;
        QuantizerWu quantizerWu = this;
        Box box = cube;
        Direction direction2 = direction;
        int bottomR = bottom(box, direction2, quantizerWu.momentsR);
        int bottomG2 = bottom(box, direction2, quantizerWu.momentsG);
        int bottomB2 = bottom(box, direction2, quantizerWu.momentsB);
        int bottomW = bottom(box, direction2, quantizerWu.weights);
        double max = 0.0d;
        int cut = -1;
        int halfR = 0;
        int i = first;
        while (i < last) {
            int i2 = halfR;
            halfR = top(box, direction2, i, quantizerWu.momentsR) + bottomR;
            int bottomR2 = bottomR;
            int halfG = top(box, direction2, i, quantizerWu.momentsG) + bottomG2;
            int halfB = top(box, direction2, i, quantizerWu.momentsB) + bottomB2;
            int halfW = top(box, direction2, i, quantizerWu.weights) + bottomW;
            if (halfW == 0) {
                bottomG = bottomG2;
                bottomB = bottomB2;
            } else {
                bottomG = bottomG2;
                bottomB = bottomB2;
                double temp = ((double) (((halfR * halfR) + (halfG * halfG)) + (halfB * halfB))) / ((double) halfW);
                halfR = wholeR - halfR;
                halfG = wholeG - halfG;
                halfB = wholeB - halfB;
                halfW = wholeW - halfW;
                if (halfW != 0) {
                    double temp2 = temp + (((double) (((halfR * halfR) + (halfG * halfG)) + (halfB * halfB))) / ((double) halfW));
                    if (temp2 > max) {
                        max = temp2;
                        cut = i;
                    }
                }
            }
            int i3 = halfW;
            int halfW2 = halfB;
            int halfB2 = halfG;
            i++;
            quantizerWu = this;
            box = cube;
            bottomR = bottomR2;
            bottomG2 = bottomG;
            bottomB2 = bottomB;
        }
        return new MaximizeResult(cut, max);
    }

    static int volume(Box cube, int[] moment) {
        return ((((((moment[getIndex(cube.r1, cube.g1, cube.b1)] - moment[getIndex(cube.r1, cube.g1, cube.b0)]) - moment[getIndex(cube.r1, cube.g0, cube.b1)]) + moment[getIndex(cube.r1, cube.g0, cube.b0)]) - moment[getIndex(cube.r0, cube.g1, cube.b1)]) + moment[getIndex(cube.r0, cube.g1, cube.b0)]) + moment[getIndex(cube.r0, cube.g0, cube.b1)]) - moment[getIndex(cube.r0, cube.g0, cube.b0)];
    }

    static int bottom(Box cube, Direction direction, int[] moment) {
        switch (direction) {
            case RED:
                return (((-moment[getIndex(cube.r0, cube.g1, cube.b1)]) + moment[getIndex(cube.r0, cube.g1, cube.b0)]) + moment[getIndex(cube.r0, cube.g0, cube.b1)]) - moment[getIndex(cube.r0, cube.g0, cube.b0)];
            case GREEN:
                return (((-moment[getIndex(cube.r1, cube.g0, cube.b1)]) + moment[getIndex(cube.r1, cube.g0, cube.b0)]) + moment[getIndex(cube.r0, cube.g0, cube.b1)]) - moment[getIndex(cube.r0, cube.g0, cube.b0)];
            case BLUE:
                return (((-moment[getIndex(cube.r1, cube.g1, cube.b0)]) + moment[getIndex(cube.r1, cube.g0, cube.b0)]) + moment[getIndex(cube.r0, cube.g1, cube.b0)]) - moment[getIndex(cube.r0, cube.g0, cube.b0)];
            default:
                throw new IllegalArgumentException("unexpected direction " + direction);
        }
    }

    static int top(Box cube, Direction direction, int position, int[] moment) {
        switch (direction) {
            case RED:
                return ((moment[getIndex(position, cube.g1, cube.b1)] - moment[getIndex(position, cube.g1, cube.b0)]) - moment[getIndex(position, cube.g0, cube.b1)]) + moment[getIndex(position, cube.g0, cube.b0)];
            case GREEN:
                return ((moment[getIndex(cube.r1, position, cube.b1)] - moment[getIndex(cube.r1, position, cube.b0)]) - moment[getIndex(cube.r0, position, cube.b1)]) + moment[getIndex(cube.r0, position, cube.b0)];
            case BLUE:
                return ((moment[getIndex(cube.r1, cube.g1, position)] - moment[getIndex(cube.r1, cube.g0, position)]) - moment[getIndex(cube.r0, cube.g1, position)]) + moment[getIndex(cube.r0, cube.g0, position)];
            default:
                throw new IllegalArgumentException("unexpected direction " + direction);
        }
    }

    private static final class MaximizeResult {
        int cutLocation;
        double maximum;

        MaximizeResult(int cut, double max) {
            this.cutLocation = cut;
            this.maximum = max;
        }
    }

    private static final class CreateBoxesResult {
        int resultCount;

        CreateBoxesResult(int requestedCount, int resultCount2) {
            this.resultCount = resultCount2;
        }
    }

    private static final class Box {
        int b0;
        int b1;
        int g0;
        int g1;
        int r0;
        int r1;
        int vol;

        private Box() {
            this.r0 = 0;
            this.r1 = 0;
            this.g0 = 0;
            this.g1 = 0;
            this.b0 = 0;
            this.b1 = 0;
            this.vol = 0;
        }
    }
}
