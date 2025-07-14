package androidx.constraintlayout.helper.widget;

import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.util.AttributeSet;
import android.view.View;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.constraintlayout.widget.R;
import androidx.constraintlayout.widget.VirtualLayout;
import androidx.core.internal.view.SupportMenu;
import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

public class Grid extends VirtualLayout {
    private static final boolean DEBUG_BOXES = false;
    public static final int HORIZONTAL = 0;
    private static final String TAG = "Grid";
    public static final int VERTICAL = 1;
    private int[] mBoxViewIds;
    private View[] mBoxViews;
    private int mColumns;
    private int mColumnsSet;
    ConstraintLayout mContainer;
    private float mHorizontalGaps;
    private final int mMaxColumns = 50;
    private final int mMaxRows = 50;
    private int mNextAvailableIndex = 0;
    private int mOrientation;
    private boolean[][] mPositionMatrix;
    private int mRows;
    private int mRowsSet;
    Set<Integer> mSpanIds = new HashSet();
    private String mStrColumnWeights;
    private String mStrRowWeights;
    private String mStrSkips;
    private String mStrSpans;
    private boolean mUseRtl;
    private boolean mValidateInputs;
    private float mVerticalGaps;

    public Grid(Context context) {
        super(context);
    }

    public Grid(Context context, AttributeSet attrs) {
        super(context, attrs);
    }

    public Grid(Context context, AttributeSet attrs, int defStyleAttr) {
        super(context, attrs, defStyleAttr);
    }

    /* access modifiers changed from: protected */
    public void init(AttributeSet attrs) {
        super.init(attrs);
        this.mUseViewMeasure = true;
        if (attrs != null) {
            TypedArray a = getContext().obtainStyledAttributes(attrs, R.styleable.Grid);
            int n = a.getIndexCount();
            for (int i = 0; i < n; i++) {
                int attr = a.getIndex(i);
                if (attr == R.styleable.Grid_grid_rows) {
                    this.mRowsSet = a.getInteger(attr, 0);
                } else if (attr == R.styleable.Grid_grid_columns) {
                    this.mColumnsSet = a.getInteger(attr, 0);
                } else if (attr == R.styleable.Grid_grid_spans) {
                    this.mStrSpans = a.getString(attr);
                } else if (attr == R.styleable.Grid_grid_skips) {
                    this.mStrSkips = a.getString(attr);
                } else if (attr == R.styleable.Grid_grid_rowWeights) {
                    this.mStrRowWeights = a.getString(attr);
                } else if (attr == R.styleable.Grid_grid_columnWeights) {
                    this.mStrColumnWeights = a.getString(attr);
                } else if (attr == R.styleable.Grid_grid_orientation) {
                    this.mOrientation = a.getInt(attr, 0);
                } else if (attr == R.styleable.Grid_grid_horizontalGaps) {
                    this.mHorizontalGaps = a.getDimension(attr, 0.0f);
                } else if (attr == R.styleable.Grid_grid_verticalGaps) {
                    this.mVerticalGaps = a.getDimension(attr, 0.0f);
                } else if (attr == R.styleable.Grid_grid_validateInputs) {
                    this.mValidateInputs = a.getBoolean(attr, false);
                } else if (attr == R.styleable.Grid_grid_useRtl) {
                    this.mUseRtl = a.getBoolean(attr, false);
                }
            }
            updateActualRowsAndColumns();
            initVariables();
            a.recycle();
        }
    }

    private void updateActualRowsAndColumns() {
        if (this.mRowsSet != 0 && this.mColumnsSet != 0) {
            this.mRows = this.mRowsSet;
            this.mColumns = this.mColumnsSet;
        } else if (this.mColumnsSet > 0) {
            this.mColumns = this.mColumnsSet;
            this.mRows = ((this.mCount + this.mColumns) - 1) / this.mColumnsSet;
        } else if (this.mRowsSet > 0) {
            this.mRows = this.mRowsSet;
            this.mColumns = ((this.mCount + this.mRowsSet) - 1) / this.mRowsSet;
        } else {
            this.mRows = (int) (Math.sqrt((double) this.mCount) + 1.5d);
            this.mColumns = ((this.mCount + this.mRows) - 1) / this.mRows;
        }
    }

    public void onAttachedToWindow() {
        super.onAttachedToWindow();
        this.mContainer = (ConstraintLayout) getParent();
        generateGrid(false);
    }

    private boolean generateGrid(boolean isUpdate) {
        int[][] mSpans;
        int[][] mSkips;
        if (this.mContainer == null || this.mRows < 1 || this.mColumns < 1) {
            return false;
        }
        if (isUpdate) {
            for (int i = 0; i < this.mPositionMatrix.length; i++) {
                for (int j = 0; j < this.mPositionMatrix[0].length; j++) {
                    this.mPositionMatrix[i][j] = true;
                }
            }
            this.mSpanIds.clear();
        }
        this.mNextAvailableIndex = 0;
        boolean isSuccess = true;
        buildBoxes();
        if (!(this.mStrSkips == null || this.mStrSkips.trim().isEmpty() || (mSkips = parseSpans(this.mStrSkips)) == null)) {
            isSuccess = true & handleSkips(mSkips);
        }
        if (!(this.mStrSpans == null || this.mStrSpans.trim().isEmpty() || (mSpans = parseSpans(this.mStrSpans)) == null)) {
            isSuccess &= handleSpans(this.mIds, mSpans);
        }
        if ((isSuccess && arrangeWidgets()) || !this.mValidateInputs) {
            return true;
        }
        return false;
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
    }

    private float[] parseWeights(int size, String str) {
        if (str == null || str.trim().isEmpty()) {
            return null;
        }
        String[] values = str.split(",");
        if (values.length != size) {
            return null;
        }
        float[] arr = new float[size];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = Float.parseFloat(values[i].trim());
        }
        return arr;
    }

    private ConstraintLayout.LayoutParams params(View v) {
        return (ConstraintLayout.LayoutParams) v.getLayoutParams();
    }

    private void connectView(View view, int row, int column, int rowSpan, int columnSpan) {
        ConstraintLayout.LayoutParams params = params(view);
        params.leftToLeft = this.mBoxViewIds[column];
        params.topToTop = this.mBoxViewIds[row];
        params.rightToRight = this.mBoxViewIds[(column + columnSpan) - 1];
        params.bottomToBottom = this.mBoxViewIds[(row + rowSpan) - 1];
        view.setLayoutParams(params);
    }

    private boolean arrangeWidgets() {
        View[] views = getViews(this.mContainer);
        for (int i = 0; i < this.mCount; i++) {
            if (!this.mSpanIds.contains(Integer.valueOf(this.mIds[i]))) {
                int position = getNextPosition();
                int row = getRowByIndex(position);
                int col = getColByIndex(position);
                if (position == -1) {
                    return false;
                }
                connectView(views[i], row, col, 1, 1);
            }
        }
        return true;
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

    private boolean isSpansValid(CharSequence str) {
        return true;
    }

    private boolean isWeightsValid(String str) {
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

    private boolean handleSpans(int[] mId, int[][] spansMatrix) {
        View[] views = getViews(this.mContainer);
        for (int i = 0; i < spansMatrix.length; i++) {
            int row = getRowByIndex(spansMatrix[i][0]);
            int col = getColByIndex(spansMatrix[i][0]);
            if (!invalidatePositions(row, col, spansMatrix[i][1], spansMatrix[i][2])) {
                return false;
            }
            connectView(views[i], row, col, spansMatrix[i][1], spansMatrix[i][2]);
            this.mSpanIds.add(Integer.valueOf(mId[i]));
        }
        return true;
    }

    private boolean handleSkips(int[][] skipsMatrix) {
        for (int i = 0; i < skipsMatrix.length; i++) {
            if (!invalidatePositions(getRowByIndex(skipsMatrix[i][0]), getColByIndex(skipsMatrix[i][0]), skipsMatrix[i][1], skipsMatrix[i][2])) {
                return false;
            }
        }
        return true;
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

    public void onDraw(Canvas canvas) {
        super.onDraw(canvas);
        if (isInEditMode()) {
            Paint paint = new Paint();
            paint.setColor(SupportMenu.CATEGORY_MASK);
            paint.setStyle(Paint.Style.STROKE);
            int myTop = getTop();
            int myLeft = getLeft();
            int myBottom = getBottom();
            int myRight = getRight();
            View[] viewArr = this.mBoxViews;
            int length = viewArr.length;
            int i = 0;
            while (i < length) {
                View box = viewArr[i];
                int l = box.getLeft() - myLeft;
                int t = box.getTop() - myTop;
                int r = box.getRight() - myLeft;
                Canvas canvas2 = canvas;
                int i2 = r;
                int i3 = l;
                canvas2.drawRect((float) l, 0.0f, (float) r, (float) (myBottom - myTop), paint);
                int t2 = t;
                int i4 = t2;
                canvas.drawRect(0.0f, (float) t2, (float) (myRight - myLeft), (float) (box.getBottom() - myTop), paint);
                i++;
                myTop = myTop;
            }
        }
    }

    private void setBoxViewHorizontalChains() {
        int gridId = getId();
        int maxVal = Math.max(this.mRows, this.mColumns);
        float[] columnWeights = parseWeights(this.mColumns, this.mStrColumnWeights);
        ConstraintLayout.LayoutParams params = params(this.mBoxViews[0]);
        if (this.mColumns == 1) {
            clearHParams(this.mBoxViews[0]);
            params.leftToLeft = gridId;
            params.rightToRight = gridId;
            this.mBoxViews[0].setLayoutParams(params);
            return;
        }
        for (int i = 0; i < this.mColumns; i++) {
            ConstraintLayout.LayoutParams params2 = params(this.mBoxViews[i]);
            clearHParams(this.mBoxViews[i]);
            if (columnWeights != null) {
                params2.horizontalWeight = columnWeights[i];
            }
            if (i > 0) {
                params2.leftToRight = this.mBoxViewIds[i - 1];
            } else {
                params2.leftToLeft = gridId;
            }
            if (i < this.mColumns - 1) {
                params2.rightToLeft = this.mBoxViewIds[i + 1];
            } else {
                params2.rightToRight = gridId;
            }
            if (i > 0) {
                params2.leftMargin = (int) this.mHorizontalGaps;
            }
            this.mBoxViews[i].setLayoutParams(params2);
        }
        for (int i2 = this.mColumns; i2 < maxVal; i2++) {
            ConstraintLayout.LayoutParams params3 = params(this.mBoxViews[i2]);
            clearHParams(this.mBoxViews[i2]);
            params3.leftToLeft = gridId;
            params3.rightToRight = gridId;
            this.mBoxViews[i2].setLayoutParams(params3);
        }
    }

    private void setBoxViewVerticalChains() {
        int gridId = getId();
        int maxVal = Math.max(this.mRows, this.mColumns);
        float[] rowWeights = parseWeights(this.mRows, this.mStrRowWeights);
        if (this.mRows == 1) {
            ConstraintLayout.LayoutParams params = params(this.mBoxViews[0]);
            clearVParams(this.mBoxViews[0]);
            params.topToTop = gridId;
            params.bottomToBottom = gridId;
            this.mBoxViews[0].setLayoutParams(params);
            return;
        }
        for (int i = 0; i < this.mRows; i++) {
            ConstraintLayout.LayoutParams params2 = params(this.mBoxViews[i]);
            clearVParams(this.mBoxViews[i]);
            if (rowWeights != null) {
                params2.verticalWeight = rowWeights[i];
            }
            if (i > 0) {
                params2.topToBottom = this.mBoxViewIds[i - 1];
            } else {
                params2.topToTop = gridId;
            }
            if (i < this.mRows - 1) {
                params2.bottomToTop = this.mBoxViewIds[i + 1];
            } else {
                params2.bottomToBottom = gridId;
            }
            if (i > 0) {
                params2.topMargin = (int) this.mHorizontalGaps;
            }
            this.mBoxViews[i].setLayoutParams(params2);
        }
        for (int i2 = this.mRows; i2 < maxVal; i2++) {
            ConstraintLayout.LayoutParams params3 = params(this.mBoxViews[i2]);
            clearVParams(this.mBoxViews[i2]);
            params3.topToTop = gridId;
            params3.bottomToBottom = gridId;
            this.mBoxViews[i2].setLayoutParams(params3);
        }
    }

    private View makeNewView() {
        View v = new View(getContext());
        v.setId(View.generateViewId());
        v.setVisibility(4);
        this.mContainer.addView(v, new ConstraintLayout.LayoutParams(0, 0));
        return v;
    }

    private void clearVParams(View view) {
        ConstraintLayout.LayoutParams params = params(view);
        params.verticalWeight = -1.0f;
        params.topToBottom = -1;
        params.topToTop = -1;
        params.bottomToTop = -1;
        params.bottomToBottom = -1;
        params.topMargin = -1;
        view.setLayoutParams(params);
    }

    private void clearHParams(View view) {
        ConstraintLayout.LayoutParams params = params(view);
        params.horizontalWeight = -1.0f;
        params.leftToRight = -1;
        params.leftToLeft = -1;
        params.rightToLeft = -1;
        params.rightToRight = -1;
        params.leftMargin = -1;
        view.setLayoutParams(params);
    }

    private void buildBoxes() {
        int boxCount = Math.max(this.mRows, this.mColumns);
        if (this.mBoxViews == null) {
            this.mBoxViews = new View[boxCount];
            for (int i = 0; i < this.mBoxViews.length; i++) {
                this.mBoxViews[i] = makeNewView();
            }
        } else if (boxCount != this.mBoxViews.length) {
            View[] temp = new View[boxCount];
            for (int i2 = 0; i2 < boxCount; i2++) {
                if (i2 < this.mBoxViews.length) {
                    temp[i2] = this.mBoxViews[i2];
                } else {
                    temp[i2] = makeNewView();
                }
            }
            for (int j = boxCount; j < this.mBoxViews.length; j++) {
                this.mContainer.removeView(this.mBoxViews[j]);
            }
            this.mBoxViews = temp;
        }
        this.mBoxViewIds = new int[boxCount];
        for (int i3 = 0; i3 < this.mBoxViews.length; i3++) {
            this.mBoxViewIds[i3] = this.mBoxViews[i3].getId();
        }
        setBoxViewVerticalChains();
        setBoxViewHorizontalChains();
    }

    public int getRows() {
        return this.mRowsSet;
    }

    public void setRows(int rows) {
        if (rows <= 50 && this.mRowsSet != rows) {
            this.mRowsSet = rows;
            updateActualRowsAndColumns();
            initVariables();
            generateGrid(false);
            invalidate();
        }
    }

    public int getColumns() {
        return this.mColumnsSet;
    }

    public void setColumns(int columns) {
        if (columns <= 50 && this.mColumnsSet != columns) {
            this.mColumnsSet = columns;
            updateActualRowsAndColumns();
            initVariables();
            generateGrid(false);
            invalidate();
        }
    }

    public int getOrientation() {
        return this.mOrientation;
    }

    public void setOrientation(int orientation) {
        if ((orientation == 0 || orientation == 1) && this.mOrientation != orientation) {
            this.mOrientation = orientation;
            generateGrid(true);
            invalidate();
        }
    }

    public String getSpans() {
        return this.mStrSpans;
    }

    public void setSpans(CharSequence spans) {
        if (isSpansValid(spans)) {
            if (this.mStrSpans == null || !this.mStrSpans.contentEquals(spans)) {
                this.mStrSpans = spans.toString();
                generateGrid(true);
                invalidate();
            }
        }
    }

    public String getSkips() {
        return this.mStrSkips;
    }

    public void setSkips(String skips) {
        if (isSpansValid(skips)) {
            if (this.mStrSkips == null || !this.mStrSkips.equals(skips)) {
                this.mStrSkips = skips;
                generateGrid(true);
                invalidate();
            }
        }
    }

    public String getRowWeights() {
        return this.mStrRowWeights;
    }

    public void setRowWeights(String rowWeights) {
        if (isWeightsValid(rowWeights)) {
            if (this.mStrRowWeights == null || !this.mStrRowWeights.equals(rowWeights)) {
                this.mStrRowWeights = rowWeights;
                generateGrid(true);
                invalidate();
            }
        }
    }

    public String getColumnWeights() {
        return this.mStrColumnWeights;
    }

    public void setColumnWeights(String columnWeights) {
        if (isWeightsValid(columnWeights)) {
            if (this.mStrColumnWeights == null || !this.mStrColumnWeights.equals(columnWeights)) {
                this.mStrColumnWeights = columnWeights;
                generateGrid(true);
                invalidate();
            }
        }
    }

    public float getHorizontalGaps() {
        return this.mHorizontalGaps;
    }

    public void setHorizontalGaps(float horizontalGaps) {
        if (horizontalGaps >= 0.0f && this.mHorizontalGaps != horizontalGaps) {
            this.mHorizontalGaps = horizontalGaps;
            generateGrid(true);
            invalidate();
        }
    }

    public float getVerticalGaps() {
        return this.mVerticalGaps;
    }

    public void setVerticalGaps(float verticalGaps) {
        if (verticalGaps >= 0.0f && this.mVerticalGaps != verticalGaps) {
            this.mVerticalGaps = verticalGaps;
            generateGrid(true);
            invalidate();
        }
    }
}
