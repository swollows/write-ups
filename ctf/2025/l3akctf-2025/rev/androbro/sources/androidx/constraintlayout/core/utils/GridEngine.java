package androidx.constraintlayout.core.utils;

import java.lang.reflect.Array;
import java.util.Arrays;

public class GridEngine {
    private static final int DEFAULT_SIZE = 3;
    public static final int HORIZONTAL = 0;
    private static final int MAX_COLUMNS = 50;
    private static final int MAX_ROWS = 50;
    public static final int VERTICAL = 1;
    private int mColumns;
    private int mColumnsSet;
    private int[][] mConstraintMatrix;
    private int mNextAvailableIndex = 0;
    private int mNumWidgets;
    private int mOrientation;
    private boolean[][] mPositionMatrix;
    private int mRows;
    private int mRowsSet;
    private String mStrSkips;
    private String mStrSpans;

    public GridEngine() {
    }

    public GridEngine(int rows, int columns) {
        this.mRowsSet = rows;
        this.mColumnsSet = columns;
        if (rows > 50) {
            this.mRowsSet = 3;
        }
        if (columns > 50) {
            this.mColumnsSet = 3;
        }
        updateActualRowsAndColumns();
        initVariables();
    }

    public GridEngine(int rows, int columns, int numWidgets) {
        this.mRowsSet = rows;
        this.mColumnsSet = columns;
        this.mNumWidgets = numWidgets;
        if (rows > 50) {
            this.mRowsSet = 3;
        }
        if (columns > 50) {
            this.mColumnsSet = 3;
        }
        updateActualRowsAndColumns();
        if (numWidgets > this.mRows * this.mColumns || numWidgets < 1) {
            this.mNumWidgets = this.mRows * this.mColumns;
        }
        initVariables();
        fillConstraintMatrix(false);
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
        if (this.mNumWidgets > 0) {
            int i2 = this.mNumWidgets;
            int[] iArr2 = new int[2];
            iArr2[1] = 4;
            iArr2[0] = i2;
            this.mConstraintMatrix = (int[][]) Array.newInstance(Integer.TYPE, iArr2);
            for (int[] row2 : this.mConstraintMatrix) {
                Arrays.fill(row2, -1);
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

    private boolean isSpansValid(CharSequence str) {
        if (str == null) {
            return false;
        }
        return true;
    }

    private int[][] parseSpans(String str) {
        if (!isSpansValid(str)) {
            return null;
        }
        String[] spans = str.split(",");
        int length = spans.length;
        int[] iArr = new int[2];
        iArr[1] = 3;
        iArr[0] = length;
        int[][] spanMatrix = (int[][]) Array.newInstance(Integer.TYPE, iArr);
        for (int i = 0; i < spans.length; i++) {
            String[] indexAndSpan = spans[i].trim().split(":");
            String[] rowAndCol = indexAndSpan[1].split("x");
            spanMatrix[i][0] = Integer.parseInt(indexAndSpan[0]);
            spanMatrix[i][1] = Integer.parseInt(rowAndCol[0]);
            spanMatrix[i][2] = Integer.parseInt(rowAndCol[1]);
        }
        return spanMatrix;
    }

    private void fillConstraintMatrix(boolean isUpdate) {
        int[][] mSpans;
        int[][] mSkips;
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
        if (!(this.mStrSkips == null || this.mStrSkips.trim().isEmpty() || (mSkips = parseSpans(this.mStrSkips)) == null)) {
            handleSkips(mSkips);
        }
        if (!(this.mStrSpans == null || this.mStrSpans.trim().isEmpty() || (mSpans = parseSpans(this.mStrSpans)) == null)) {
            handleSpans(mSpans);
        }
        addAllConstraintPositions();
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

    private void addConstraintPosition(int widgetId, int row, int column, int rowSpan, int columnSpan) {
        this.mConstraintMatrix[widgetId][0] = column;
        this.mConstraintMatrix[widgetId][1] = row;
        this.mConstraintMatrix[widgetId][2] = (column + columnSpan) - 1;
        this.mConstraintMatrix[widgetId][3] = (row + rowSpan) - 1;
    }

    private void handleSpans(int[][] spansMatrix) {
        int i = 0;
        while (i < spansMatrix.length) {
            int row = getRowByIndex(spansMatrix[i][0]);
            int col = getColByIndex(spansMatrix[i][0]);
            if (invalidatePositions(row, col, spansMatrix[i][1], spansMatrix[i][2])) {
                addConstraintPosition(i, row, col, spansMatrix[i][1], spansMatrix[i][2]);
                i++;
            } else {
                return;
            }
        }
    }

    private void handleSkips(int[][] skipsMatrix) {
        int i = 0;
        while (i < skipsMatrix.length && invalidatePositions(getRowByIndex(skipsMatrix[i][0]), getColByIndex(skipsMatrix[i][0]), skipsMatrix[i][1], skipsMatrix[i][2])) {
            i++;
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

    private void addAllConstraintPositions() {
        for (int i = 0; i < this.mNumWidgets; i++) {
            if (leftOfWidget(i) == -1) {
                int position = getNextPosition();
                int row = getRowByIndex(position);
                int col = getColByIndex(position);
                if (position != -1) {
                    addConstraintPosition(i, row, col, 1, 1);
                } else {
                    return;
                }
            }
        }
    }

    private void updateActualRowsAndColumns() {
        if (this.mRowsSet != 0 && this.mColumnsSet != 0) {
            this.mRows = this.mRowsSet;
            this.mColumns = this.mColumnsSet;
        } else if (this.mColumnsSet > 0) {
            this.mColumns = this.mColumnsSet;
            this.mRows = ((this.mNumWidgets + this.mColumns) - 1) / this.mColumnsSet;
        } else if (this.mRowsSet > 0) {
            this.mRows = this.mRowsSet;
            this.mColumns = ((this.mNumWidgets + this.mRowsSet) - 1) / this.mRowsSet;
        } else {
            this.mRows = (int) (Math.sqrt((double) this.mNumWidgets) + 1.5d);
            this.mColumns = ((this.mNumWidgets + this.mRows) - 1) / this.mRows;
        }
    }

    public void setup() {
        boolean isUpdate = true;
        if (!(this.mConstraintMatrix != null && this.mConstraintMatrix.length == this.mNumWidgets && this.mPositionMatrix != null && this.mPositionMatrix.length == this.mRows && this.mPositionMatrix[0].length == this.mColumns)) {
            isUpdate = false;
        }
        if (!isUpdate) {
            initVariables();
        }
        fillConstraintMatrix(isUpdate);
    }

    public void setSpans(CharSequence spans) {
        if (this.mStrSpans == null || !this.mStrSpans.equals(spans.toString())) {
            this.mStrSpans = spans.toString();
        }
    }

    public void setSkips(String skips) {
        if (this.mStrSkips == null || !this.mStrSkips.equals(skips)) {
            this.mStrSkips = skips;
        }
    }

    public void setOrientation(int orientation) {
        if ((orientation == 0 || orientation == 1) && this.mOrientation != orientation) {
            this.mOrientation = orientation;
        }
    }

    public void setNumWidgets(int num) {
        if (num <= this.mRows * this.mColumns) {
            this.mNumWidgets = num;
        }
    }

    public void setRows(int rows) {
        if (rows <= 50 && this.mRowsSet != rows) {
            this.mRowsSet = rows;
            updateActualRowsAndColumns();
        }
    }

    public void setColumns(int columns) {
        if (columns <= 50 && this.mColumnsSet != columns) {
            this.mColumnsSet = columns;
            updateActualRowsAndColumns();
        }
    }

    public int leftOfWidget(int i) {
        if (this.mConstraintMatrix == null || i >= this.mConstraintMatrix.length) {
            return 0;
        }
        return this.mConstraintMatrix[i][0];
    }

    public int topOfWidget(int i) {
        if (this.mConstraintMatrix == null || i >= this.mConstraintMatrix.length) {
            return 0;
        }
        return this.mConstraintMatrix[i][1];
    }

    public int rightOfWidget(int i) {
        if (this.mConstraintMatrix == null || i >= this.mConstraintMatrix.length) {
            return 0;
        }
        return this.mConstraintMatrix[i][2];
    }

    public int bottomOfWidget(int i) {
        if (this.mConstraintMatrix == null || i >= this.mConstraintMatrix.length) {
            return 0;
        }
        return this.mConstraintMatrix[i][3];
    }
}
