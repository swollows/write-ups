package androidx.constraintlayout.core;

import androidx.constraintlayout.core.ArrayRow;
import java.util.Arrays;
import java.util.Comparator;

public class PriorityGoalRow extends ArrayRow {
    private static final boolean DEBUG = false;
    private static final float EPSILON = 1.0E-4f;
    static final int NOT_FOUND = -1;
    GoalVariableAccessor mAccessor = new GoalVariableAccessor(this);
    private SolverVariable[] mArrayGoals = new SolverVariable[this.mTableSize];
    Cache mCache;
    private int mNumGoals = 0;
    private SolverVariable[] mSortArray = new SolverVariable[this.mTableSize];
    private int mTableSize = 128;

    class GoalVariableAccessor {
        PriorityGoalRow mRow;
        SolverVariable mVariable;

        GoalVariableAccessor(PriorityGoalRow row) {
            this.mRow = row;
        }

        public void init(SolverVariable variable) {
            this.mVariable = variable;
        }

        public boolean addToGoal(SolverVariable other, float value) {
            if (this.mVariable.inGoal) {
                boolean empty = true;
                for (int i = 0; i < 9; i++) {
                    float[] fArr = this.mVariable.mGoalStrengthVector;
                    fArr[i] = fArr[i] + (other.mGoalStrengthVector[i] * value);
                    if (Math.abs(this.mVariable.mGoalStrengthVector[i]) < 1.0E-4f) {
                        this.mVariable.mGoalStrengthVector[i] = 0.0f;
                    } else {
                        empty = false;
                    }
                }
                if (!empty) {
                    return false;
                }
                PriorityGoalRow.this.removeGoal(this.mVariable);
                return false;
            }
            for (int i2 = 0; i2 < 9; i2++) {
                float strength = other.mGoalStrengthVector[i2];
                if (strength != 0.0f) {
                    float v = value * strength;
                    if (Math.abs(v) < 1.0E-4f) {
                        v = 0.0f;
                    }
                    this.mVariable.mGoalStrengthVector[i2] = v;
                } else {
                    this.mVariable.mGoalStrengthVector[i2] = 0.0f;
                }
            }
            return true;
        }

        public void add(SolverVariable other) {
            for (int i = 0; i < 9; i++) {
                float[] fArr = this.mVariable.mGoalStrengthVector;
                fArr[i] = fArr[i] + other.mGoalStrengthVector[i];
                if (Math.abs(this.mVariable.mGoalStrengthVector[i]) < 1.0E-4f) {
                    this.mVariable.mGoalStrengthVector[i] = 0.0f;
                }
            }
        }

        public final boolean isNegative() {
            for (int i = 8; i >= 0; i--) {
                float value = this.mVariable.mGoalStrengthVector[i];
                if (value > 0.0f) {
                    return false;
                }
                if (value < 0.0f) {
                    return true;
                }
            }
            return false;
        }

        public final boolean isSmallerThan(SolverVariable other) {
            int i = 8;
            while (i >= 0) {
                float comparedValue = other.mGoalStrengthVector[i];
                float value = this.mVariable.mGoalStrengthVector[i];
                if (value == comparedValue) {
                    i--;
                } else if (value < comparedValue) {
                    return true;
                } else {
                    return false;
                }
            }
            return false;
        }

        public final boolean isNull() {
            for (int i = 0; i < 9; i++) {
                if (this.mVariable.mGoalStrengthVector[i] != 0.0f) {
                    return false;
                }
            }
            return true;
        }

        public void reset() {
            Arrays.fill(this.mVariable.mGoalStrengthVector, 0.0f);
        }

        public String toString() {
            String result = "[ ";
            if (this.mVariable != null) {
                for (int i = 0; i < 9; i++) {
                    result = result + this.mVariable.mGoalStrengthVector[i] + " ";
                }
            }
            return result + "] " + this.mVariable;
        }
    }

    public void clear() {
        this.mNumGoals = 0;
        this.mConstantValue = 0.0f;
    }

    public PriorityGoalRow(Cache cache) {
        super(cache);
        this.mCache = cache;
    }

    public boolean isEmpty() {
        return this.mNumGoals == 0;
    }

    public SolverVariable getPivotCandidate(LinearSystem system, boolean[] avoid) {
        int pivot = -1;
        for (int i = 0; i < this.mNumGoals; i++) {
            SolverVariable variable = this.mArrayGoals[i];
            if (!avoid[variable.id]) {
                this.mAccessor.init(variable);
                if (pivot == -1) {
                    if (this.mAccessor.isNegative()) {
                        pivot = i;
                    }
                } else if (this.mAccessor.isSmallerThan(this.mArrayGoals[pivot])) {
                    pivot = i;
                }
            }
        }
        if (pivot == -1) {
            return null;
        }
        return this.mArrayGoals[pivot];
    }

    public void addError(SolverVariable error) {
        this.mAccessor.init(error);
        this.mAccessor.reset();
        error.mGoalStrengthVector[error.strength] = 1.0f;
        addToGoal(error);
    }

    private void addToGoal(SolverVariable variable) {
        if (this.mNumGoals + 1 > this.mArrayGoals.length) {
            this.mArrayGoals = (SolverVariable[]) Arrays.copyOf(this.mArrayGoals, this.mArrayGoals.length * 2);
            this.mSortArray = (SolverVariable[]) Arrays.copyOf(this.mArrayGoals, this.mArrayGoals.length * 2);
        }
        this.mArrayGoals[this.mNumGoals] = variable;
        this.mNumGoals++;
        if (this.mNumGoals > 1 && this.mArrayGoals[this.mNumGoals - 1].id > variable.id) {
            for (int i = 0; i < this.mNumGoals; i++) {
                this.mSortArray[i] = this.mArrayGoals[i];
            }
            Arrays.sort(this.mSortArray, 0, this.mNumGoals, new Comparator<SolverVariable>() {
                public int compare(SolverVariable variable1, SolverVariable variable2) {
                    return variable1.id - variable2.id;
                }
            });
            for (int i2 = 0; i2 < this.mNumGoals; i2++) {
                this.mArrayGoals[i2] = this.mSortArray[i2];
            }
        }
        variable.inGoal = true;
        variable.addToRow(this);
    }

    /* access modifiers changed from: private */
    public void removeGoal(SolverVariable variable) {
        for (int i = 0; i < this.mNumGoals; i++) {
            if (this.mArrayGoals[i] == variable) {
                for (int j = i; j < this.mNumGoals - 1; j++) {
                    this.mArrayGoals[j] = this.mArrayGoals[j + 1];
                }
                this.mNumGoals--;
                variable.inGoal = false;
                return;
            }
        }
    }

    public void updateFromRow(LinearSystem system, ArrayRow definition, boolean removeFromDefinition) {
        SolverVariable goalVariable = definition.mVariable;
        if (goalVariable != null) {
            ArrayRow.ArrayRowVariables rowVariables = definition.variables;
            int currentSize = rowVariables.getCurrentSize();
            for (int i = 0; i < currentSize; i++) {
                SolverVariable solverVariable = rowVariables.getVariable(i);
                float value = rowVariables.getVariableValue(i);
                this.mAccessor.init(solverVariable);
                if (this.mAccessor.addToGoal(goalVariable, value)) {
                    addToGoal(solverVariable);
                }
                this.mConstantValue += definition.mConstantValue * value;
            }
            removeGoal(goalVariable);
        }
    }

    public String toString() {
        String result = "" + " goal -> (" + this.mConstantValue + ") : ";
        for (int i = 0; i < this.mNumGoals; i++) {
            this.mAccessor.init(this.mArrayGoals[i]);
            result = result + this.mAccessor + " ";
        }
        return result;
    }
}
