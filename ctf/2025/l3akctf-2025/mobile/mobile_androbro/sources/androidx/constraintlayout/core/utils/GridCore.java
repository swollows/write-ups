package androidx.constraintlayout.core.utils;

import androidx.constraintlayout.core.LinearSystem;
import androidx.constraintlayout.core.widgets.ConstraintWidget;
import androidx.constraintlayout.core.widgets.ConstraintWidgetContainer;
import androidx.constraintlayout.core.widgets.VirtualLayout;
import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

public class GridCore extends VirtualLayout {
    private static final int DEFAULT_SIZE = 3;
    public static final int HORIZONTAL = 0;
    private static final int MAX_COLUMNS = 50;
    private static final int MAX_ROWS = 50;
    public static final int SPANS_RESPECT_WIDGET_ORDER = 2;
    public static final int SUB_GRID_BY_COL_ROW = 1;
    public static final int VERTICAL = 1;
    private ConstraintWidget[] mBoxWidgets;
    private String mColumnWeights;
    private int mColumns;
    private int mColumnsSet;
    private int[][] mConstraintMatrix;
    ConstraintWidgetContainer mContainer;
    private boolean mExtraSpaceHandled = false;
    private int mFlags;
    private float mHorizontalGaps;
    private int mNextAvailableIndex = 0;
    private int mOrientation;
    private boolean[][] mPositionMatrix;
    private String mRowWeights;
    private int mRows;
    private int mRowsSet;
    private String mSkips;
    Set<String> mSpanIds = new HashSet();
    private int mSpanIndex = 0;
    private int[][] mSpanMatrix;
    private String mSpans;
    private float mVerticalGaps;

    public GridCore() {
        updateActualRowsAndColumns();
        initMatrices();
    }

    public GridCore(int rows, int columns) {
        this.mRowsSet = rows;
        this.mColumnsSet = columns;
        if (rows > 50) {
            this.mRowsSet = 3;
        }
        if (columns > 50) {
            this.mColumnsSet = 3;
        }
        updateActualRowsAndColumns();
        initMatrices();
    }

    public ConstraintWidgetContainer getContainer() {
        return this.mContainer;
    }

    public void setContainer(ConstraintWidgetContainer container) {
        this.mContainer = container;
    }

    public void setSpans(CharSequence spans) {
        if (this.mSpans == null || !this.mSpans.equals(spans.toString())) {
            this.mExtraSpaceHandled = false;
            this.mSpans = spans.toString();
        }
    }

    public void setSkips(String skips) {
        if (this.mSkips == null || !this.mSkips.equals(skips)) {
            this.mExtraSpaceHandled = false;
            this.mSkips = skips;
        }
    }

    public float getHorizontalGaps() {
        return this.mHorizontalGaps;
    }

    public void setHorizontalGaps(float horizontalGaps) {
        if (horizontalGaps >= 0.0f && this.mHorizontalGaps != horizontalGaps) {
            this.mHorizontalGaps = horizontalGaps;
        }
    }

    public float getVerticalGaps() {
        return this.mVerticalGaps;
    }

    public void setVerticalGaps(float verticalGaps) {
        if (verticalGaps >= 0.0f && this.mVerticalGaps != verticalGaps) {
            this.mVerticalGaps = verticalGaps;
        }
    }

    public String getRowWeights() {
        return this.mRowWeights;
    }

    public void setRowWeights(String rowWeights) {
        if (this.mRowWeights == null || !this.mRowWeights.equals(rowWeights)) {
            this.mRowWeights = rowWeights;
        }
    }

    public String getColumnWeights() {
        return this.mColumnWeights;
    }

    public void setColumnWeights(String columnWeights) {
        if (this.mColumnWeights == null || !this.mColumnWeights.equals(columnWeights)) {
            this.mColumnWeights = columnWeights;
        }
    }

    public int getOrientation() {
        return this.mOrientation;
    }

    public void setOrientation(int orientation) {
        if ((orientation == 0 || orientation == 1) && this.mOrientation != orientation) {
            this.mOrientation = orientation;
        }
    }

    public void setRows(int rows) {
        if (rows <= 50 && this.mRowsSet != rows) {
            this.mRowsSet = rows;
            updateActualRowsAndColumns();
            initVariables();
        }
    }

    public void setColumns(int columns) {
        if (columns <= 50 && this.mColumnsSet != columns) {
            this.mColumnsSet = columns;
            updateActualRowsAndColumns();
            initVariables();
        }
    }

    public int getFlags() {
        return this.mFlags;
    }

    public void setFlags(int flags) {
        this.mFlags = flags;
    }

    private void handleSpans(int[][] spansMatrix) {
        if (!isSpansRespectWidgetOrder()) {
            int i = 0;
            while (i < spansMatrix.length) {
                int row = getRowByIndex(spansMatrix[i][0]);
                int col = getColByIndex(spansMatrix[i][0]);
                if (invalidatePositions(row, col, spansMatrix[i][1], spansMatrix[i][2])) {
                    connectWidget(this.mWidgets[i], row, col, spansMatrix[i][1], spansMatrix[i][2]);
                    this.mSpanIds.add(this.mWidgets[i].stringId);
                    i++;
                } else {
                    return;
                }
            }
        }
    }

    private void arrangeWidgets() {
        for (int i = 0; i < this.mWidgetsCount; i++) {
            if (!this.mSpanIds.contains(this.mWidgets[i].stringId)) {
                int position = getNextPosition();
                int row = getRowByIndex(position);
                int col = getColByIndex(position);
                if (position != -1) {
                    if (!isSpansRespectWidgetOrder() || this.mSpanMatrix == null || this.mSpanIndex >= this.mSpanMatrix.length || this.mSpanMatrix[this.mSpanIndex][0] != position) {
                        connectWidget(this.mWidgets[i], row, col, 1, 1);
                    } else {
                        this.mPositionMatrix[row][col] = true;
                        if (invalidatePositions(row, col, this.mSpanMatrix[this.mSpanIndex][1], this.mSpanMatrix[this.mSpanIndex][2])) {
                            connectWidget(this.mWidgets[i], row, col, this.mSpanMatrix[this.mSpanIndex][1], this.mSpanMatrix[this.mSpanIndex][2]);
                            this.mSpanIndex++;
                        }
                    }
                } else {
                    return;
                }
            }
        }
    }

    private void setupGrid(boolean isUpdate) {
        int[][] mSkips2;
        if (this.mRows >= 1 && this.mColumns >= 1) {
            if (isUpdate) {
                for (int i = 0; i < this.mPositionMatrix.length; i++) {
                    for (int j = 0; j < this.mPositionMatrix[0].length; j++) {
                        this.mPositionMatrix[i][j] = true;
                    }
                }
                this.mSpanIds.clear();
            }
            this.mNextAvailableIndex = 0;
            if (!(this.mSkips == null || this.mSkips.trim().isEmpty() || (mSkips2 = parseSpans(this.mSkips, false)) == null)) {
                handleSkips(mSkips2);
            }
            if (this.mSpans != null && !this.mSpans.trim().isEmpty()) {
                this.mSpanMatrix = parseSpans(this.mSpans, true);
            }
            createBoxes();
            if (this.mSpanMatrix != null) {
                handleSpans(this.mSpanMatrix);
            }
        }
    }

    private int getRowByIndex(int index) {
        if (this.mOrientation == 1) {
            return index % this.mRows;
        }
        return index / this.mColumns;
    }

    private int getColByIndex(int index) {
        if (this.mOrientation == 1) {
            return index / this.mRows;
        }
        return index % this.mColumns;
    }

    private void handleSkips(int[][] skipsMatrix) {
        int length = skipsMatrix.length;
        int i = 0;
        while (i < length) {
            int[] matrix = skipsMatrix[i];
            if (invalidatePositions(getRowByIndex(matrix[0]), getColByIndex(matrix[0]), matrix[1], matrix[2])) {
                i++;
            } else {
                return;
            }
        }
    }

    private boolean invalidatePositions(int startRow, int startColumn, int rowSpan, int columnSpan) {
        for (int i = startRow; i < startRow + rowSpan; i++) {
            for (int j = startColumn; j < startColumn + columnSpan; j++) {
                if (i >= this.mPositionMatrix.length || j >= this.mPositionMatrix[0].length || !this.mPositionMatrix[i][j]) {
                    return false;
                }
                this.mPositionMatrix[i][j] = false;
            }
        }
        return true;
    }

    private float[] parseWeights(int size, String str) {
        if (str == null || str.trim().isEmpty()) {
            return null;
        }
        String[] values = str.split(",");
        float[] arr = new float[size];
        for (int i = 0; i < arr.length; i++) {
            if (i < values.length) {
                try {
                    arr[i] = Float.parseFloat(values[i]);
                } catch (Exception e) {
                    System.err.println("Error parsing `" + values[i] + "`: " + e.getMessage());
                    arr[i] = 1.0f;
                }
            } else {
                arr[i] = 1.0f;
            }
        }
        return arr;
    }

    private int getNextPosition() {
        int position = 0;
        boolean positionFound = false;
        while (!positionFound) {
            if (this.mNextAvailableIndex >= this.mRows * this.mColumns) {
                return -1;
            }
            position = this.mNextAvailableIndex;
            int row = getRowByIndex(this.mNextAvailableIndex);
            int col = getColByIndex(this.mNextAvailableIndex);
            if (this.mPositionMatrix[row][col]) {
                this.mPositionMatrix[row][col] = false;
                positionFound = true;
            }
            this.mNextAvailableIndex++;
        }
        return position;
    }

    private void updateActualRowsAndColumns() {
        if (this.mRowsSet != 0 && this.mColumnsSet != 0) {
            this.mRows = this.mRowsSet;
            this.mColumns = this.mColumnsSet;
        } else if (this.mColumnsSet > 0) {
            this.mColumns = this.mColumnsSet;
            this.mRows = ((this.mWidgetsCount + this.mColumns) - 1) / this.mColumnsSet;
        } else if (this.mRowsSet > 0) {
            this.mRows = this.mRowsSet;
            this.mColumns = ((this.mWidgetsCount + this.mRowsSet) - 1) / this.mRowsSet;
        } else {
            this.mRows = (int) (Math.sqrt((double) this.mWidgetsCount) + 1.5d);
            this.mColumns = ((this.mWidgetsCount + this.mRows) - 1) / this.mRows;
        }
    }

    private ConstraintWidget makeNewWidget() {
        ConstraintWidget widget = new ConstraintWidget();
        widget.mListDimensionBehaviors[0] = ConstraintWidget.DimensionBehaviour.MATCH_CONSTRAINT;
        widget.mListDimensionBehaviors[1] = ConstraintWidget.DimensionBehaviour.MATCH_CONSTRAINT;
        widget.stringId = String.valueOf(widget.hashCode());
        return widget;
    }

    private void connectWidget(ConstraintWidget widget, int row, int column, int rowSpan, int columnSpan) {
        widget.mLeft.connect(this.mBoxWidgets[column].mLeft, 0);
        widget.mTop.connect(this.mBoxWidgets[row].mTop, 0);
        widget.mRight.connect(this.mBoxWidgets[(column + columnSpan) - 1].mRight, 0);
        widget.mBottom.connect(this.mBoxWidgets[(row + rowSpan) - 1].mBottom, 0);
    }

    private void setBoxWidgetHorizontalChains() {
        int maxVal = Math.max(this.mRows, this.mColumns);
        ConstraintWidget widget = this.mBoxWidgets[0];
        float[] columnWeights = parseWeights(this.mColumns, this.mColumnWeights);
        if (this.mColumns == 1) {
            clearHorizontalAttributes(widget);
            widget.mLeft.connect(this.mLeft, 0);
            widget.mRight.connect(this.mRight, 0);
            return;
        }
        for (int i = 0; i < this.mColumns; i++) {
            ConstraintWidget widget2 = this.mBoxWidgets[i];
            clearHorizontalAttributes(widget2);
            if (columnWeights != null) {
                widget2.setHorizontalWeight(columnWeights[i]);
            }
            if (i > 0) {
                widget2.mLeft.connect(this.mBoxWidgets[i - 1].mRight, 0);
            } else {
                widget2.mLeft.connect(this.mLeft, 0);
            }
            if (i < this.mColumns - 1) {
                widget2.mRight.connect(this.mBoxWidgets[i + 1].mLeft, 0);
            } else {
                widget2.mRight.connect(this.mRight, 0);
            }
            if (i > 0) {
                widget2.mLeft.mMargin = (int) this.mHorizontalGaps;
            }
        }
        for (int i2 = this.mColumns; i2 < maxVal; i2++) {
            ConstraintWidget widget3 = this.mBoxWidgets[i2];
            clearHorizontalAttributes(widget3);
            widget3.mLeft.connect(this.mLeft, 0);
            widget3.mRight.connect(this.mRight, 0);
        }
    }

    private void setBoxWidgetVerticalChains() {
        int maxVal = Math.max(this.mRows, this.mColumns);
        ConstraintWidget widget = this.mBoxWidgets[0];
        float[] rowWeights = parseWeights(this.mRows, this.mRowWeights);
        if (this.mRows == 1) {
            clearVerticalAttributes(widget);
            widget.mTop.connect(this.mTop, 0);
            widget.mBottom.connect(this.mBottom, 0);
            return;
        }
        for (int i = 0; i < this.mRows; i++) {
            ConstraintWidget widget2 = this.mBoxWidgets[i];
            clearVerticalAttributes(widget2);
            if (rowWeights != null) {
                widget2.setVerticalWeight(rowWeights[i]);
            }
            if (i > 0) {
                widget2.mTop.connect(this.mBoxWidgets[i - 1].mBottom, 0);
            } else {
                widget2.mTop.connect(this.mTop, 0);
            }
            if (i < this.mRows - 1) {
                widget2.mBottom.connect(this.mBoxWidgets[i + 1].mTop, 0);
            } else {
                widget2.mBottom.connect(this.mBottom, 0);
            }
            if (i > 0) {
                widget2.mTop.mMargin = (int) this.mVerticalGaps;
            }
        }
        for (int i2 = this.mRows; i2 < maxVal; i2++) {
            ConstraintWidget widget3 = this.mBoxWidgets[i2];
            clearVerticalAttributes(widget3);
            widget3.mTop.connect(this.mTop, 0);
            widget3.mBottom.connect(this.mBottom, 0);
        }
    }

    private void addConstraints() {
        setBoxWidgetVerticalChains();
        setBoxWidgetHorizontalChains();
        arrangeWidgets();
    }

    private void createBoxes() {
        int boxCount = Math.max(this.mRows, this.mColumns);
        if (this.mBoxWidgets == null) {
            this.mBoxWidgets = new ConstraintWidget[boxCount];
            for (int i = 0; i < this.mBoxWidgets.length; i++) {
                this.mBoxWidgets[i] = makeNewWidget();
            }
        } else if (boxCount != this.mBoxWidgets.length) {
            ConstraintWidget[] temp = new ConstraintWidget[boxCount];
            for (int i2 = 0; i2 < boxCount; i2++) {
                if (i2 < this.mBoxWidgets.length) {
                    temp[i2] = this.mBoxWidgets[i2];
                } else {
                    temp[i2] = makeNewWidget();
                }
            }
            for (int j = boxCount; j < this.mBoxWidgets.length; j++) {
                this.mContainer.remove(this.mBoxWidgets[j]);
            }
            this.mBoxWidgets = temp;
        }
    }

    private void clearVerticalAttributes(ConstraintWidget widget) {
        widget.setVerticalWeight(-1.0f);
        widget.mTop.reset();
        widget.mBottom.reset();
        widget.mBaseline.reset();
    }

    private void clearHorizontalAttributes(ConstraintWidget widget) {
        widget.setHorizontalWeight(-1.0f);
        widget.mLeft.reset();
        widget.mRight.reset();
    }

    private void initVariables() {
        int i = this.mRows;
        int[] iArr = new int[2];
        iArr[1] = this.mColumns;
        iArr[0] = i;
        this.mPositionMatrix = (boolean[][]) Array.newInstance(Boolean.TYPE, iArr);
        for (boolean[] row : this.mPositionMatrix) {
            Arrays.fill(row, true);
        }
        if (this.mWidgetsCount > 0) {
            int i2 = this.mWidgetsCount;
            int[] iArr2 = new int[2];
            iArr2[1] = 4;
            iArr2[0] = i2;
            this.mConstraintMatrix = (int[][]) Array.newInstance(Integer.TYPE, iArr2);
            for (int[] row2 : this.mConstraintMatrix) {
                Arrays.fill(row2, -1);
            }
        }
    }

    private int[][] parseSpans(String str, boolean isSpans) {
        int extraRows = 0;
        int extraColumns = 0;
        try {
            String[] spans = str.split(",");
            Arrays.sort(spans, new GridCore$$ExternalSyntheticLambda0());
            int length = spans.length;
            int[] iArr = new int[2];
            iArr[1] = 3;
            iArr[0] = length;
            int[][] spanMatrix = (int[][]) Array.newInstance(Integer.TYPE, iArr);
            if (this.mRows != 1) {
                if (this.mColumns != 1) {
                    for (int i = 0; i < spans.length; i++) {
                        String[] indexAndSpan = spans[i].trim().split(":");
                        String[] rowAndCol = indexAndSpan[1].split("x");
                        spanMatrix[i][0] = Integer.parseInt(indexAndSpan[0]);
                        if (isSubGridByColRow()) {
                            spanMatrix[i][1] = Integer.parseInt(rowAndCol[1]);
                            spanMatrix[i][2] = Integer.parseInt(rowAndCol[0]);
                        } else {
                            spanMatrix[i][1] = Integer.parseInt(rowAndCol[0]);
                            spanMatrix[i][2] = Integer.parseInt(rowAndCol[1]);
                        }
                    }
                    return spanMatrix;
                }
            }
            for (int i2 = 0; i2 < spans.length; i2++) {
                String[] indexAndSpan2 = spans[i2].trim().split(":");
                spanMatrix[i2][0] = Integer.parseInt(indexAndSpan2[0]);
                spanMatrix[i2][1] = 1;
                spanMatrix[i2][2] = 1;
                if (this.mColumns == 1) {
                    spanMatrix[i2][1] = Integer.parseInt(indexAndSpan2[1]);
                    extraRows += spanMatrix[i2][1];
                    if (isSpans) {
                        extraRows--;
                    }
                }
                if (this.mRows == 1) {
                    spanMatrix[i2][2] = Integer.parseInt(indexAndSpan2[1]);
                    extraColumns += spanMatrix[i2][2];
                    if (isSpans) {
                        extraColumns--;
                    }
                }
            }
            if (extraRows != 0 && !this.mExtraSpaceHandled) {
                setRows(this.mRows + extraRows);
            }
            if (extraColumns != 0 && !this.mExtraSpaceHandled) {
                setColumns(this.mColumns + extraColumns);
            }
            this.mExtraSpaceHandled = true;
            return spanMatrix;
        } catch (Exception e) {
            return null;
        }
    }

    static /* synthetic */ int lambda$parseSpans$0(String span1, String span2) {
        return Integer.parseInt(span1.split(":")[0]) - Integer.parseInt(span2.split(":")[0]);
    }

    private void fillConstraintMatrix(boolean isUpdate) {
        int[][] mSpans2;
        int[][] mSkips2;
        if (isUpdate) {
            for (int i = 0; i < this.mPositionMatrix.length; i++) {
                for (int j = 0; j < this.mPositionMatrix[0].length; j++) {
                    this.mPositionMatrix[i][j] = true;
                }
            }
            for (int i2 = 0; i2 < this.mConstraintMatrix.length; i2++) {
                for (int j2 = 0; j2 < this.mConstraintMatrix[0].length; j2++) {
                    this.mConstraintMatrix[i2][j2] = -1;
                }
            }
        }
        this.mNextAvailableIndex = 0;
        if (!(this.mSkips == null || this.mSkips.trim().isEmpty() || (mSkips2 = parseSpans(this.mSkips, false)) == null)) {
            handleSkips(mSkips2);
        }
        if (this.mSpans != null && !this.mSpans.trim().isEmpty() && (mSpans2 = parseSpans(this.mSpans, true)) != null) {
            handleSpans(mSpans2);
        }
    }

    private void initMatrices() {
        boolean z = false;
        if (this.mConstraintMatrix != null && this.mConstraintMatrix.length == this.mWidgetsCount && this.mPositionMatrix != null && this.mPositionMatrix.length == this.mRows && this.mPositionMatrix[0].length == this.mColumns) {
            z = true;
        }
        boolean isUpdate = z;
        if (!isUpdate) {
            initVariables();
        }
        fillConstraintMatrix(isUpdate);
    }

    private boolean isSubGridByColRow() {
        return (this.mFlags & 1) > 0;
    }

    private boolean isSpansRespectWidgetOrder() {
        return (this.mFlags & 2) > 0;
    }

    public void measure(int widthMode, int widthSize, int heightMode, int heightSize) {
        super.measure(widthMode, widthSize, heightMode, heightSize);
        this.mContainer = (ConstraintWidgetContainer) getParent();
        setupGrid(false);
        this.mContainer.add(this.mBoxWidgets);
    }

    public void addToSolver(LinearSystem system, boolean optimize) {
        super.addToSolver(system, optimize);
        addConstraints();
    }
}
