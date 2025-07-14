package androidx.constraintlayout.core;

import androidx.constraintlayout.core.SolverVariable;
import androidx.constraintlayout.core.widgets.ConstraintAnchor;
import androidx.constraintlayout.core.widgets.ConstraintWidget;
import java.util.Arrays;
import java.util.HashMap;

public class LinearSystem {
    public static long ARRAY_ROW_CREATION = 0;
    public static final boolean DEBUG = false;
    private static final boolean DEBUG_CONSTRAINTS = false;
    private static final boolean DO_NOT_USE = false;
    public static final boolean FULL_DEBUG = false;
    public static long OPTIMIZED_ARRAY_ROW_CREATION = 0;
    public static boolean OPTIMIZED_ENGINE = false;
    public static boolean SIMPLIFY_SYNONYMS = true;
    public static boolean SKIP_COLUMNS = true;
    public static boolean USE_BASIC_SYNONYMS = true;
    public static boolean USE_DEPENDENCY_ORDERING = false;
    public static boolean USE_SYNONYMS = true;
    public static Metrics sMetrics;
    public boolean graphOptimizer;
    public boolean hasSimpleDefinition;
    private boolean[] mAlreadyTestedCandidates;
    final Cache mCache;
    private Row mGoal;
    private int mMaxColumns;
    private int mMaxRows;
    int mNumColumns;
    int mNumRows;
    private int mPoolSize;
    private SolverVariable[] mPoolVariables;
    private int mPoolVariablesCount;
    ArrayRow[] mRows;
    private int mTableSize;
    private Row mTempGoal;
    private HashMap<String, SolverVariable> mVariables;
    int mVariablesID;
    public boolean newgraphOptimizer;

    interface Row {
        void addError(SolverVariable solverVariable);

        void clear();

        SolverVariable getKey();

        SolverVariable getPivotCandidate(LinearSystem linearSystem, boolean[] zArr);

        void initFromRow(Row row);

        boolean isEmpty();

        void updateFromFinalVariable(LinearSystem linearSystem, SolverVariable solverVariable, boolean z);

        void updateFromRow(LinearSystem linearSystem, ArrayRow arrayRow, boolean z);

        void updateFromSystem(LinearSystem linearSystem);
    }

    static class ValuesRow extends ArrayRow {
        ValuesRow(Cache cache) {
            this.variables = new SolverVariableValues(this, cache);
        }
    }

    public LinearSystem() {
        this.mPoolSize = 1000;
        this.hasSimpleDefinition = false;
        this.mVariablesID = 0;
        this.mVariables = null;
        this.mTableSize = 32;
        this.mMaxColumns = this.mTableSize;
        this.mRows = null;
        this.graphOptimizer = false;
        this.newgraphOptimizer = false;
        this.mAlreadyTestedCandidates = new boolean[this.mTableSize];
        this.mNumColumns = 1;
        this.mNumRows = 0;
        this.mMaxRows = this.mTableSize;
        this.mPoolVariables = new SolverVariable[this.mPoolSize];
        this.mPoolVariablesCount = 0;
        this.mRows = new ArrayRow[this.mTableSize];
        releaseRows();
        this.mCache = new Cache();
        this.mGoal = new PriorityGoalRow(this.mCache);
        if (OPTIMIZED_ENGINE) {
            this.mTempGoal = new ValuesRow(this.mCache);
        } else {
            this.mTempGoal = new ArrayRow(this.mCache);
        }
    }

    public void fillMetrics(Metrics metrics) {
        sMetrics = metrics;
    }

    public static Metrics getMetrics() {
        return sMetrics;
    }

    private void increaseTableSize() {
        this.mTableSize *= 2;
        this.mRows = (ArrayRow[]) Arrays.copyOf(this.mRows, this.mTableSize);
        this.mCache.mIndexedVariables = (SolverVariable[]) Arrays.copyOf(this.mCache.mIndexedVariables, this.mTableSize);
        this.mAlreadyTestedCandidates = new boolean[this.mTableSize];
        this.mMaxColumns = this.mTableSize;
        this.mMaxRows = this.mTableSize;
        if (sMetrics != null) {
            sMetrics.tableSizeIncrease++;
            sMetrics.maxTableSize = Math.max(sMetrics.maxTableSize, (long) this.mTableSize);
            sMetrics.lastTableSize = sMetrics.maxTableSize;
        }
    }

    private void releaseRows() {
        if (OPTIMIZED_ENGINE) {
            for (int i = 0; i < this.mNumRows; i++) {
                ArrayRow row = this.mRows[i];
                if (row != null) {
                    this.mCache.mOptimizedArrayRowPool.release(row);
                }
                this.mRows[i] = null;
            }
            return;
        }
        for (int i2 = 0; i2 < this.mNumRows; i2++) {
            ArrayRow row2 = this.mRows[i2];
            if (row2 != null) {
                this.mCache.mArrayRowPool.release(row2);
            }
            this.mRows[i2] = null;
        }
    }

    public void reset() {
        for (SolverVariable variable : this.mCache.mIndexedVariables) {
            if (variable != null) {
                variable.reset();
            }
        }
        this.mCache.mSolverVariablePool.releaseAll(this.mPoolVariables, this.mPoolVariablesCount);
        this.mPoolVariablesCount = 0;
        Arrays.fill(this.mCache.mIndexedVariables, (Object) null);
        if (this.mVariables != null) {
            this.mVariables.clear();
        }
        this.mVariablesID = 0;
        this.mGoal.clear();
        this.mNumColumns = 1;
        for (int i = 0; i < this.mNumRows; i++) {
            if (this.mRows[i] != null) {
                this.mRows[i].mUsed = false;
            }
        }
        releaseRows();
        this.mNumRows = 0;
        if (OPTIMIZED_ENGINE) {
            this.mTempGoal = new ValuesRow(this.mCache);
        } else {
            this.mTempGoal = new ArrayRow(this.mCache);
        }
    }

    public SolverVariable createObjectVariable(Object anchor) {
        if (anchor == null) {
            return null;
        }
        if (this.mNumColumns + 1 >= this.mMaxColumns) {
            increaseTableSize();
        }
        SolverVariable variable = null;
        if (anchor instanceof ConstraintAnchor) {
            variable = ((ConstraintAnchor) anchor).getSolverVariable();
            if (variable == null) {
                ((ConstraintAnchor) anchor).resetSolverVariable(this.mCache);
                variable = ((ConstraintAnchor) anchor).getSolverVariable();
            }
            if (variable.id == -1 || variable.id > this.mVariablesID || this.mCache.mIndexedVariables[variable.id] == null) {
                if (variable.id != -1) {
                    variable.reset();
                }
                this.mVariablesID++;
                this.mNumColumns++;
                variable.id = this.mVariablesID;
                variable.mType = SolverVariable.Type.UNRESTRICTED;
                this.mCache.mIndexedVariables[this.mVariablesID] = variable;
            }
        }
        return variable;
    }

    public ArrayRow createRow() {
        ArrayRow row;
        if (OPTIMIZED_ENGINE) {
            row = this.mCache.mOptimizedArrayRowPool.acquire();
            if (row == null) {
                row = new ValuesRow(this.mCache);
                OPTIMIZED_ARRAY_ROW_CREATION++;
            } else {
                row.reset();
            }
        } else {
            row = this.mCache.mArrayRowPool.acquire();
            if (row == null) {
                row = new ArrayRow(this.mCache);
                ARRAY_ROW_CREATION++;
            } else {
                row.reset();
            }
        }
        SolverVariable.increaseErrorId();
        return row;
    }

    public SolverVariable createSlackVariable() {
        if (sMetrics != null) {
            sMetrics.slackvariables++;
        }
        if (this.mNumColumns + 1 >= this.mMaxColumns) {
            increaseTableSize();
        }
        SolverVariable variable = acquireSolverVariable(SolverVariable.Type.SLACK, (String) null);
        this.mVariablesID++;
        this.mNumColumns++;
        variable.id = this.mVariablesID;
        this.mCache.mIndexedVariables[this.mVariablesID] = variable;
        return variable;
    }

    public SolverVariable createExtraVariable() {
        if (sMetrics != null) {
            sMetrics.extravariables++;
        }
        if (this.mNumColumns + 1 >= this.mMaxColumns) {
            increaseTableSize();
        }
        SolverVariable variable = acquireSolverVariable(SolverVariable.Type.SLACK, (String) null);
        this.mVariablesID++;
        this.mNumColumns++;
        variable.id = this.mVariablesID;
        this.mCache.mIndexedVariables[this.mVariablesID] = variable;
        return variable;
    }

    /* access modifiers changed from: package-private */
    public void addSingleError(ArrayRow row, int sign, int strength) {
        row.addSingleError(createErrorVariable(strength, (String) null), sign);
    }

    private SolverVariable createVariable(String name, SolverVariable.Type type) {
        if (sMetrics != null) {
            sMetrics.variables++;
        }
        if (this.mNumColumns + 1 >= this.mMaxColumns) {
            increaseTableSize();
        }
        SolverVariable variable = acquireSolverVariable(type, (String) null);
        variable.setName(name);
        this.mVariablesID++;
        this.mNumColumns++;
        variable.id = this.mVariablesID;
        if (this.mVariables == null) {
            this.mVariables = new HashMap<>();
        }
        this.mVariables.put(name, variable);
        this.mCache.mIndexedVariables[this.mVariablesID] = variable;
        return variable;
    }

    public SolverVariable createErrorVariable(int strength, String prefix) {
        if (sMetrics != null) {
            sMetrics.errors++;
        }
        if (this.mNumColumns + 1 >= this.mMaxColumns) {
            increaseTableSize();
        }
        SolverVariable variable = acquireSolverVariable(SolverVariable.Type.ERROR, prefix);
        this.mVariablesID++;
        this.mNumColumns++;
        variable.id = this.mVariablesID;
        variable.strength = strength;
        this.mCache.mIndexedVariables[this.mVariablesID] = variable;
        this.mGoal.addError(variable);
        return variable;
    }

    private SolverVariable acquireSolverVariable(SolverVariable.Type type, String prefix) {
        SolverVariable variable = this.mCache.mSolverVariablePool.acquire();
        if (variable == null) {
            variable = new SolverVariable(type, prefix);
            variable.setType(type, prefix);
        } else {
            variable.reset();
            variable.setType(type, prefix);
        }
        if (this.mPoolVariablesCount >= this.mPoolSize) {
            this.mPoolSize *= 2;
            this.mPoolVariables = (SolverVariable[]) Arrays.copyOf(this.mPoolVariables, this.mPoolSize);
        }
        SolverVariable[] solverVariableArr = this.mPoolVariables;
        int i = this.mPoolVariablesCount;
        this.mPoolVariablesCount = i + 1;
        solverVariableArr[i] = variable;
        return variable;
    }

    /* access modifiers changed from: package-private */
    public Row getGoal() {
        return this.mGoal;
    }

    /* access modifiers changed from: package-private */
    public ArrayRow getRow(int n) {
        return this.mRows[n];
    }

    /* access modifiers changed from: package-private */
    public float getValueFor(String name) {
        SolverVariable v = getVariable(name, SolverVariable.Type.UNRESTRICTED);
        if (v == null) {
            return 0.0f;
        }
        return v.computedValue;
    }

    public int getObjectVariableValue(Object object) {
        SolverVariable variable = ((ConstraintAnchor) object).getSolverVariable();
        if (variable != null) {
            return (int) (variable.computedValue + 0.5f);
        }
        return 0;
    }

    /* access modifiers changed from: package-private */
    public SolverVariable getVariable(String name, SolverVariable.Type type) {
        if (this.mVariables == null) {
            this.mVariables = new HashMap<>();
        }
        SolverVariable variable = this.mVariables.get(name);
        if (variable == null) {
            return createVariable(name, type);
        }
        return variable;
    }

    public void minimize() throws Exception {
        if (sMetrics != null) {
            sMetrics.minimize++;
        }
        if (this.mGoal.isEmpty()) {
            computeValues();
        } else if (this.graphOptimizer || this.newgraphOptimizer) {
            if (sMetrics != null) {
                sMetrics.graphOptimizer++;
            }
            boolean fullySolved = true;
            int i = 0;
            while (true) {
                if (i >= this.mNumRows) {
                    break;
                } else if (!this.mRows[i].mIsSimpleDefinition) {
                    fullySolved = false;
                    break;
                } else {
                    i++;
                }
            }
            if (!fullySolved) {
                minimizeGoal(this.mGoal);
                return;
            }
            if (sMetrics != null) {
                sMetrics.fullySolved++;
            }
            computeValues();
        } else {
            minimizeGoal(this.mGoal);
        }
    }

    /* access modifiers changed from: package-private */
    public void minimizeGoal(Row goal) throws Exception {
        if (sMetrics != null) {
            sMetrics.minimizeGoal++;
            sMetrics.maxVariables = Math.max(sMetrics.maxVariables, (long) this.mNumColumns);
            sMetrics.maxRows = Math.max(sMetrics.maxRows, (long) this.mNumRows);
        }
        enforceBFS(goal);
        optimize(goal, false);
        computeValues();
    }

    /* access modifiers changed from: package-private */
    public final void cleanupRows() {
        int i = 0;
        while (i < this.mNumRows) {
            ArrayRow current = this.mRows[i];
            if (current.variables.getCurrentSize() == 0) {
                current.mIsSimpleDefinition = true;
            }
            if (current.mIsSimpleDefinition) {
                current.mVariable.computedValue = current.mConstantValue;
                current.mVariable.removeFromRow(current);
                for (int j = i; j < this.mNumRows - 1; j++) {
                    this.mRows[j] = this.mRows[j + 1];
                }
                this.mRows[this.mNumRows - 1] = null;
                this.mNumRows--;
                i--;
                if (OPTIMIZED_ENGINE) {
                    this.mCache.mOptimizedArrayRowPool.release(current);
                } else {
                    this.mCache.mArrayRowPool.release(current);
                }
            }
            i++;
        }
    }

    public void addConstraint(ArrayRow row) {
        SolverVariable pivotCandidate;
        if (row != null) {
            if (sMetrics != null) {
                sMetrics.constraints++;
                if (row.mIsSimpleDefinition) {
                    sMetrics.simpleconstraints++;
                }
            }
            if (this.mNumRows + 1 >= this.mMaxRows || this.mNumColumns + 1 >= this.mMaxColumns) {
                increaseTableSize();
            }
            boolean added = false;
            if (!row.mIsSimpleDefinition) {
                row.updateFromSystem(this);
                if (!row.isEmpty()) {
                    row.ensurePositiveConstant();
                    if (row.chooseSubject(this)) {
                        SolverVariable extra = createExtraVariable();
                        row.mVariable = extra;
                        int numRows = this.mNumRows;
                        addRow(row);
                        if (this.mNumRows == numRows + 1) {
                            added = true;
                            this.mTempGoal.initFromRow(row);
                            optimize(this.mTempGoal, true);
                            if (extra.mDefinitionId == -1) {
                                if (row.mVariable == extra && (pivotCandidate = row.pickPivot(extra)) != null) {
                                    if (sMetrics != null) {
                                        sMetrics.pivots++;
                                    }
                                    row.pivot(pivotCandidate);
                                }
                                if (!row.mIsSimpleDefinition) {
                                    row.mVariable.updateReferencesWithNewDefinition(this, row);
                                }
                                if (OPTIMIZED_ENGINE) {
                                    this.mCache.mOptimizedArrayRowPool.release(row);
                                } else {
                                    this.mCache.mArrayRowPool.release(row);
                                }
                                this.mNumRows--;
                            }
                        }
                    }
                    if (!row.hasKeyVariable()) {
                        return;
                    }
                } else {
                    return;
                }
            }
            if (!added) {
                addRow(row);
            }
        }
    }

    private void addRow(ArrayRow row) {
        if (!SIMPLIFY_SYNONYMS || !row.mIsSimpleDefinition) {
            this.mRows[this.mNumRows] = row;
            row.mVariable.mDefinitionId = this.mNumRows;
            this.mNumRows++;
            row.mVariable.updateReferencesWithNewDefinition(this, row);
        } else {
            row.mVariable.setFinalValue(this, row.mConstantValue);
        }
        if (SIMPLIFY_SYNONYMS && this.hasSimpleDefinition) {
            int i = 0;
            while (i < this.mNumRows) {
                if (this.mRows[i] == null) {
                    System.out.println("WTF");
                }
                if (this.mRows[i] != null && this.mRows[i].mIsSimpleDefinition) {
                    ArrayRow removedRow = this.mRows[i];
                    removedRow.mVariable.setFinalValue(this, removedRow.mConstantValue);
                    if (OPTIMIZED_ENGINE) {
                        this.mCache.mOptimizedArrayRowPool.release(removedRow);
                    } else {
                        this.mCache.mArrayRowPool.release(removedRow);
                    }
                    this.mRows[i] = null;
                    int lastRow = i + 1;
                    for (int j = i + 1; j < this.mNumRows; j++) {
                        this.mRows[j - 1] = this.mRows[j];
                        if (this.mRows[j - 1].mVariable.mDefinitionId == j) {
                            this.mRows[j - 1].mVariable.mDefinitionId = j - 1;
                        }
                        lastRow = j;
                    }
                    if (lastRow < this.mNumRows) {
                        this.mRows[lastRow] = null;
                    }
                    this.mNumRows--;
                    i--;
                }
                i++;
            }
            this.hasSimpleDefinition = false;
        }
    }

    public void removeRow(ArrayRow row) {
        if (row.mIsSimpleDefinition && row.mVariable != null) {
            if (row.mVariable.mDefinitionId != -1) {
                for (int i = row.mVariable.mDefinitionId; i < this.mNumRows - 1; i++) {
                    SolverVariable rowVariable = this.mRows[i + 1].mVariable;
                    if (rowVariable.mDefinitionId == i + 1) {
                        rowVariable.mDefinitionId = i;
                    }
                    this.mRows[i] = this.mRows[i + 1];
                }
                this.mNumRows--;
            }
            if (!row.mVariable.isFinalValue) {
                row.mVariable.setFinalValue(this, row.mConstantValue);
            }
            if (OPTIMIZED_ENGINE) {
                this.mCache.mOptimizedArrayRowPool.release(row);
            } else {
                this.mCache.mArrayRowPool.release(row);
            }
        }
    }

    private int optimize(Row goal, boolean b) {
        if (sMetrics != null) {
            sMetrics.optimize++;
        }
        boolean done = false;
        int tries = 0;
        for (int i = 0; i < this.mNumColumns; i++) {
            this.mAlreadyTestedCandidates[i] = false;
        }
        while (!done) {
            if (sMetrics != null) {
                sMetrics.iterations++;
            }
            tries++;
            if (tries >= this.mNumColumns * 2) {
                return tries;
            }
            if (goal.getKey() != null) {
                this.mAlreadyTestedCandidates[goal.getKey().id] = true;
            }
            SolverVariable pivotCandidate = goal.getPivotCandidate(this, this.mAlreadyTestedCandidates);
            if (pivotCandidate != null) {
                if (this.mAlreadyTestedCandidates[pivotCandidate.id]) {
                    return tries;
                }
                this.mAlreadyTestedCandidates[pivotCandidate.id] = true;
            }
            if (pivotCandidate != null) {
                float min = Float.MAX_VALUE;
                int pivotRowIndex = -1;
                for (int i2 = 0; i2 < this.mNumRows; i2++) {
                    ArrayRow current = this.mRows[i2];
                    if (current.mVariable.mType != SolverVariable.Type.UNRESTRICTED && !current.mIsSimpleDefinition && current.hasVariable(pivotCandidate)) {
                        float a_j = current.variables.get(pivotCandidate);
                        if (a_j < 0.0f) {
                            float value = (-current.mConstantValue) / a_j;
                            if (value < min) {
                                min = value;
                                pivotRowIndex = i2;
                            }
                        }
                    }
                }
                if (pivotRowIndex > -1) {
                    ArrayRow pivotEquation = this.mRows[pivotRowIndex];
                    pivotEquation.mVariable.mDefinitionId = -1;
                    if (sMetrics != null) {
                        sMetrics.pivots++;
                    }
                    pivotEquation.pivot(pivotCandidate);
                    pivotEquation.mVariable.mDefinitionId = pivotRowIndex;
                    pivotEquation.mVariable.updateReferencesWithNewDefinition(this, pivotEquation);
                }
            } else {
                done = true;
            }
        }
        return tries;
    }

    private int enforceBFS(Row goal) throws Exception {
        float f;
        boolean infeasibleSystem;
        boolean infeasibleSystem2;
        int tries = 0;
        boolean infeasibleSystem3 = false;
        int i = 0;
        while (true) {
            f = 0.0f;
            if (i >= this.mNumRows) {
                break;
            } else if (this.mRows[i].mVariable.mType != SolverVariable.Type.UNRESTRICTED && this.mRows[i].mConstantValue < 0.0f) {
                infeasibleSystem3 = true;
                break;
            } else {
                i++;
            }
        }
        if (infeasibleSystem3) {
            boolean done = false;
            tries = 0;
            while (!done) {
                if (sMetrics != null) {
                    sMetrics.bfs++;
                }
                tries++;
                float min = Float.MAX_VALUE;
                int strength = 0;
                int pivotRowIndex = -1;
                int pivotColumnIndex = -1;
                int i2 = 0;
                while (i2 < this.mNumRows) {
                    ArrayRow current = this.mRows[i2];
                    if (current.mVariable.mType == SolverVariable.Type.UNRESTRICTED) {
                        infeasibleSystem = infeasibleSystem3;
                    } else if (current.mIsSimpleDefinition) {
                        infeasibleSystem = infeasibleSystem3;
                    } else if (current.mConstantValue >= f) {
                        infeasibleSystem = infeasibleSystem3;
                    } else if (SKIP_COLUMNS) {
                        int size = current.variables.getCurrentSize();
                        int j = 0;
                        while (j < size) {
                            SolverVariable candidate = current.variables.getVariable(j);
                            float a_j = current.variables.get(candidate);
                            if (a_j > f) {
                                int k = 0;
                                while (true) {
                                    infeasibleSystem2 = infeasibleSystem3;
                                    if (k >= 9) {
                                        break;
                                    }
                                    float value = candidate.mStrengthVector[k] / a_j;
                                    if ((value < min && k == strength) || k > strength) {
                                        min = value;
                                        pivotRowIndex = i2;
                                        pivotColumnIndex = candidate.id;
                                        strength = k;
                                    }
                                    k++;
                                    infeasibleSystem3 = infeasibleSystem2;
                                }
                            } else {
                                infeasibleSystem2 = infeasibleSystem3;
                            }
                            j++;
                            infeasibleSystem3 = infeasibleSystem2;
                            f = 0.0f;
                        }
                        infeasibleSystem = infeasibleSystem3;
                    } else {
                        infeasibleSystem = infeasibleSystem3;
                        for (int j2 = 1; j2 < this.mNumColumns; j2++) {
                            SolverVariable candidate2 = this.mCache.mIndexedVariables[j2];
                            float a_j2 = current.variables.get(candidate2);
                            if (a_j2 > 0.0f) {
                                for (int k2 = 0; k2 < 9; k2++) {
                                    float value2 = candidate2.mStrengthVector[k2] / a_j2;
                                    if ((value2 < min && k2 == strength) || k2 > strength) {
                                        min = value2;
                                        pivotRowIndex = i2;
                                        pivotColumnIndex = j2;
                                        strength = k2;
                                    }
                                }
                            }
                        }
                    }
                    i2++;
                    infeasibleSystem3 = infeasibleSystem;
                    f = 0.0f;
                }
                boolean infeasibleSystem4 = infeasibleSystem3;
                if (pivotRowIndex != -1) {
                    ArrayRow pivotEquation = this.mRows[pivotRowIndex];
                    pivotEquation.mVariable.mDefinitionId = -1;
                    if (sMetrics != null) {
                        sMetrics.pivots++;
                    }
                    pivotEquation.pivot(this.mCache.mIndexedVariables[pivotColumnIndex]);
                    pivotEquation.mVariable.mDefinitionId = pivotRowIndex;
                    pivotEquation.mVariable.updateReferencesWithNewDefinition(this, pivotEquation);
                } else {
                    done = true;
                }
                if (tries > this.mNumColumns / 2) {
                    done = true;
                }
                infeasibleSystem3 = infeasibleSystem4;
                f = 0.0f;
            }
        }
        return tries;
    }

    private void computeValues() {
        for (int i = 0; i < this.mNumRows; i++) {
            ArrayRow row = this.mRows[i];
            row.mVariable.computedValue = row.mConstantValue;
        }
    }

    private void displayRows() {
        displaySolverVariables();
        String s = "";
        for (int i = 0; i < this.mNumRows; i++) {
            s = (s + this.mRows[i]) + "\n";
        }
        System.out.println(s + this.mGoal + "\n");
    }

    public void displayReadableRows() {
        displaySolverVariables();
        String s = " num vars " + this.mVariablesID + "\n";
        for (int i = 0; i < this.mVariablesID + 1; i++) {
            SolverVariable variable = this.mCache.mIndexedVariables[i];
            if (variable != null && variable.isFinalValue) {
                s = s + " $[" + i + "] => " + variable + " = " + variable.computedValue + "\n";
            }
        }
        String s2 = s + "\n";
        for (int i2 = 0; i2 < this.mVariablesID + 1; i2++) {
            SolverVariable variable2 = this.mCache.mIndexedVariables[i2];
            if (variable2 != null && variable2.mIsSynonym) {
                s2 = s2 + " ~[" + i2 + "] => " + variable2 + " = " + this.mCache.mIndexedVariables[variable2.mSynonym] + " + " + variable2.mSynonymDelta + "\n";
            }
        }
        String s3 = s2 + "\n\n #  ";
        for (int i3 = 0; i3 < this.mNumRows; i3++) {
            s3 = (s3 + this.mRows[i3].toReadableString()) + "\n #  ";
        }
        if (this.mGoal != null) {
            s3 = s3 + "Goal: " + this.mGoal + "\n";
        }
        System.out.println(s3);
    }

    public void displayVariablesReadableRows() {
        displaySolverVariables();
        String s = "";
        for (int i = 0; i < this.mNumRows; i++) {
            if (this.mRows[i].mVariable.mType == SolverVariable.Type.UNRESTRICTED) {
                s = (s + this.mRows[i].toReadableString()) + "\n";
            }
        }
        System.out.println(s + this.mGoal + "\n");
    }

    public int getMemoryUsed() {
        int actualRowSize = 0;
        for (int i = 0; i < this.mNumRows; i++) {
            if (this.mRows[i] != null) {
                actualRowSize += this.mRows[i].sizeInBytes();
            }
        }
        return actualRowSize;
    }

    public int getNumEquations() {
        return this.mNumRows;
    }

    public int getNumVariables() {
        return this.mVariablesID;
    }

    /* access modifiers changed from: package-private */
    public void displaySystemInformation() {
        int rowSize = 0;
        for (int i = 0; i < this.mTableSize; i++) {
            if (this.mRows[i] != null) {
                rowSize += this.mRows[i].sizeInBytes();
            }
        }
        int actualRowSize = 0;
        for (int i2 = 0; i2 < this.mNumRows; i2++) {
            if (this.mRows[i2] != null) {
                actualRowSize += this.mRows[i2].sizeInBytes();
            }
        }
        System.out.println("Linear System -> Table size: " + this.mTableSize + " (" + getDisplaySize(this.mTableSize * this.mTableSize) + ") -- row sizes: " + getDisplaySize(rowSize) + ", actual size: " + getDisplaySize(actualRowSize) + " rows: " + this.mNumRows + "/" + this.mMaxRows + " cols: " + this.mNumColumns + "/" + this.mMaxColumns + " " + 0 + " occupied cells, " + getDisplaySize(0));
    }

    private void displaySolverVariables() {
        System.out.println("Display Rows (" + this.mNumRows + "x" + this.mNumColumns + ")\n");
    }

    private String getDisplaySize(int n) {
        int mb = ((n * 4) / 1024) / 1024;
        if (mb > 0) {
            return "" + mb + " Mb";
        }
        int kb = (n * 4) / 1024;
        if (kb > 0) {
            return "" + kb + " Kb";
        }
        return "" + (n * 4) + " bytes";
    }

    public Cache getCache() {
        return this.mCache;
    }

    private String getDisplayStrength(int strength) {
        if (strength == 1) {
            return "LOW";
        }
        if (strength == 2) {
            return "MEDIUM";
        }
        if (strength == 3) {
            return "HIGH";
        }
        if (strength == 4) {
            return "HIGHEST";
        }
        if (strength == 5) {
            return "EQUALITY";
        }
        if (strength == 8) {
            return "FIXED";
        }
        if (strength == 6) {
            return "BARRIER";
        }
        return "NONE";
    }

    public void addGreaterThan(SolverVariable a, SolverVariable b, int margin, int strength) {
        ArrayRow row = createRow();
        SolverVariable slack = createSlackVariable();
        slack.strength = 0;
        row.createRowGreaterThan(a, b, slack, margin);
        if (strength != 8) {
            addSingleError(row, (int) (-1.0f * row.variables.get(slack)), strength);
        }
        addConstraint(row);
    }

    public void addGreaterBarrier(SolverVariable a, SolverVariable b, int margin, boolean hasMatchConstraintWidgets) {
        ArrayRow row = createRow();
        SolverVariable slack = createSlackVariable();
        slack.strength = 0;
        row.createRowGreaterThan(a, b, slack, margin);
        addConstraint(row);
    }

    public void addLowerThan(SolverVariable a, SolverVariable b, int margin, int strength) {
        ArrayRow row = createRow();
        SolverVariable slack = createSlackVariable();
        slack.strength = 0;
        row.createRowLowerThan(a, b, slack, margin);
        if (strength != 8) {
            addSingleError(row, (int) (-1.0f * row.variables.get(slack)), strength);
        }
        addConstraint(row);
    }

    public void addLowerBarrier(SolverVariable a, SolverVariable b, int margin, boolean hasMatchConstraintWidgets) {
        ArrayRow row = createRow();
        SolverVariable slack = createSlackVariable();
        slack.strength = 0;
        row.createRowLowerThan(a, b, slack, margin);
        addConstraint(row);
    }

    public void addCentering(SolverVariable a, SolverVariable b, int m1, float bias, SolverVariable c, SolverVariable d, int m2, int strength) {
        int i = strength;
        ArrayRow row = createRow();
        row.createRowCentering(a, b, m1, bias, c, d, m2);
        if (i != 8) {
            row.addError(this, i);
        }
        addConstraint(row);
    }

    public void addRatio(SolverVariable a, SolverVariable b, SolverVariable c, SolverVariable d, float ratio, int strength) {
        ArrayRow row = createRow();
        row.createRowDimensionRatio(a, b, c, d, ratio);
        if (strength != 8) {
            row.addError(this, strength);
        }
        addConstraint(row);
    }

    public void addSynonym(SolverVariable a, SolverVariable b, int margin) {
        if (a.mDefinitionId == -1 && margin == 0) {
            if (b.mIsSynonym) {
                margin += (int) b.mSynonymDelta;
                b = this.mCache.mIndexedVariables[b.mSynonym];
            }
            if (a.mIsSynonym) {
                int margin2 = margin - ((int) a.mSynonymDelta);
                SolverVariable a2 = this.mCache.mIndexedVariables[a.mSynonym];
                return;
            }
            a.setSynonym(this, b, 0.0f);
            return;
        }
        addEquality(a, b, margin, 8);
    }

    public ArrayRow addEquality(SolverVariable a, SolverVariable b, int margin, int strength) {
        if (sMetrics != null) {
            sMetrics.mSimpleEquations++;
        }
        if (!USE_BASIC_SYNONYMS || strength != 8 || !b.isFinalValue || a.mDefinitionId != -1) {
            ArrayRow row = createRow();
            row.createRowEquals(a, b, margin);
            if (strength != 8) {
                row.addError(this, strength);
            }
            addConstraint(row);
            return row;
        }
        a.setFinalValue(this, b.computedValue + ((float) margin));
        return null;
    }

    public void addEquality(SolverVariable a, int value) {
        if (sMetrics != null) {
            sMetrics.mSimpleEquations++;
        }
        if (!USE_BASIC_SYNONYMS || a.mDefinitionId != -1) {
            int idx = a.mDefinitionId;
            if (a.mDefinitionId != -1) {
                ArrayRow row = this.mRows[idx];
                if (row.mIsSimpleDefinition) {
                    row.mConstantValue = (float) value;
                } else if (row.variables.getCurrentSize() == 0) {
                    row.mIsSimpleDefinition = true;
                    row.mConstantValue = (float) value;
                } else {
                    ArrayRow newRow = createRow();
                    newRow.createRowEquals(a, value);
                    addConstraint(newRow);
                }
            } else {
                ArrayRow row2 = createRow();
                row2.createRowDefinition(a, value);
                addConstraint(row2);
            }
        } else {
            a.setFinalValue(this, (float) value);
            for (int i = 0; i < this.mVariablesID + 1; i++) {
                SolverVariable variable = this.mCache.mIndexedVariables[i];
                if (variable != null && variable.mIsSynonym && variable.mSynonym == a.id) {
                    variable.setFinalValue(this, ((float) value) + variable.mSynonymDelta);
                }
            }
        }
    }

    public static ArrayRow createRowDimensionPercent(LinearSystem linearSystem, SolverVariable variableA, SolverVariable variableC, float percent) {
        return linearSystem.createRow().createRowDimensionPercent(variableA, variableC, percent);
    }

    public void addCenterPoint(ConstraintWidget widget, ConstraintWidget target, float angle, int radius) {
        ConstraintWidget constraintWidget = widget;
        ConstraintWidget constraintWidget2 = target;
        float f = angle;
        int i = radius;
        SolverVariable Al = createObjectVariable(constraintWidget.getAnchor(ConstraintAnchor.Type.LEFT));
        SolverVariable At = createObjectVariable(constraintWidget.getAnchor(ConstraintAnchor.Type.TOP));
        SolverVariable Ar = createObjectVariable(constraintWidget.getAnchor(ConstraintAnchor.Type.RIGHT));
        SolverVariable Ab = createObjectVariable(constraintWidget.getAnchor(ConstraintAnchor.Type.BOTTOM));
        SolverVariable Bl = createObjectVariable(constraintWidget2.getAnchor(ConstraintAnchor.Type.LEFT));
        SolverVariable Bt = createObjectVariable(constraintWidget2.getAnchor(ConstraintAnchor.Type.TOP));
        SolverVariable Br = createObjectVariable(constraintWidget2.getAnchor(ConstraintAnchor.Type.RIGHT));
        SolverVariable Bb = createObjectVariable(constraintWidget2.getAnchor(ConstraintAnchor.Type.BOTTOM));
        ArrayRow row = createRow();
        float angleComponent = (float) (Math.sin((double) f) * ((double) i));
        float f2 = angleComponent;
        row.createRowWithAngle(At, Ab, Bt, Bb, angleComponent);
        addConstraint(row);
        ArrayRow row2 = createRow();
        float angleComponent2 = (float) (Math.cos((double) f) * ((double) i));
        float f3 = angleComponent2;
        row2.createRowWithAngle(Al, Ar, Bl, Br, angleComponent2);
        addConstraint(row2);
    }
}
