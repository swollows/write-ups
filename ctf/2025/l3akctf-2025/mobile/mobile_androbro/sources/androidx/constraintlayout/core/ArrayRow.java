package androidx.constraintlayout.core;

import androidx.constraintlayout.core.LinearSystem;
import androidx.constraintlayout.core.SolverVariable;
import java.util.ArrayList;

public class ArrayRow implements LinearSystem.Row {
    private static final boolean DEBUG = false;
    private static final boolean FULL_NEW_CHECK = false;
    float mConstantValue = 0.0f;
    boolean mIsSimpleDefinition = false;
    boolean mUsed = false;
    SolverVariable mVariable = null;
    ArrayList<SolverVariable> mVariablesToUpdate = new ArrayList<>();
    public ArrayRowVariables variables;

    public interface ArrayRowVariables {
        void add(SolverVariable solverVariable, float f, boolean z);

        void clear();

        boolean contains(SolverVariable solverVariable);

        void display();

        void divideByAmount(float f);

        float get(SolverVariable solverVariable);

        int getCurrentSize();

        SolverVariable getVariable(int i);

        float getVariableValue(int i);

        int indexOf(SolverVariable solverVariable);

        void invert();

        void put(SolverVariable solverVariable, float f);

        float remove(SolverVariable solverVariable, boolean z);

        int sizeInBytes();

        float use(ArrayRow arrayRow, boolean z);
    }

    public ArrayRow() {
    }

    public ArrayRow(Cache cache) {
        this.variables = new ArrayLinkedVariables(this, cache);
    }

    /* access modifiers changed from: package-private */
    public boolean hasKeyVariable() {
        return this.mVariable != null && (this.mVariable.mType == SolverVariable.Type.UNRESTRICTED || this.mConstantValue >= 0.0f);
    }

    public String toString() {
        return toReadableString();
    }

    /* access modifiers changed from: package-private */
    public String toReadableString() {
        String s;
        String s2;
        if (this.mVariable == null) {
            s = "" + "0";
        } else {
            s = "" + this.mVariable;
        }
        String s3 = s + " = ";
        boolean addedVariable = false;
        if (this.mConstantValue != 0.0f) {
            s3 = s3 + this.mConstantValue;
            addedVariable = true;
        }
        int count = this.variables.getCurrentSize();
        for (int i = 0; i < count; i++) {
            SolverVariable v = this.variables.getVariable(i);
            if (v != null) {
                float amount = this.variables.getVariableValue(i);
                if (amount != 0.0f) {
                    String name = v.toString();
                    if (!addedVariable) {
                        if (amount < 0.0f) {
                            s2 = s2 + "- ";
                            amount *= -1.0f;
                        }
                    } else if (amount > 0.0f) {
                        s2 = s2 + " + ";
                    } else {
                        s2 = s2 + " - ";
                        amount *= -1.0f;
                    }
                    if (amount == 1.0f) {
                        s2 = s2 + name;
                    } else {
                        s2 = s2 + amount + " " + name;
                    }
                    addedVariable = true;
                }
            }
        }
        if (!addedVariable) {
            return s2 + "0.0";
        }
        return s2;
    }

    public void reset() {
        this.mVariable = null;
        this.variables.clear();
        this.mConstantValue = 0.0f;
        this.mIsSimpleDefinition = false;
    }

    /* access modifiers changed from: package-private */
    public boolean hasVariable(SolverVariable v) {
        return this.variables.contains(v);
    }

    /* access modifiers changed from: package-private */
    public ArrayRow createRowDefinition(SolverVariable variable, int value) {
        this.mVariable = variable;
        variable.computedValue = (float) value;
        this.mConstantValue = (float) value;
        this.mIsSimpleDefinition = true;
        return this;
    }

    public ArrayRow createRowEquals(SolverVariable variable, int value) {
        if (value < 0) {
            this.mConstantValue = (float) (value * -1);
            this.variables.put(variable, 1.0f);
        } else {
            this.mConstantValue = (float) value;
            this.variables.put(variable, -1.0f);
        }
        return this;
    }

    public ArrayRow createRowEquals(SolverVariable variableA, SolverVariable variableB, int margin) {
        boolean inverse = false;
        if (margin != 0) {
            int m = margin;
            if (m < 0) {
                m *= -1;
                inverse = true;
            }
            this.mConstantValue = (float) m;
        }
        if (!inverse) {
            this.variables.put(variableA, -1.0f);
            this.variables.put(variableB, 1.0f);
        } else {
            this.variables.put(variableA, 1.0f);
            this.variables.put(variableB, -1.0f);
        }
        return this;
    }

    /* access modifiers changed from: package-private */
    public ArrayRow addSingleError(SolverVariable error, int sign) {
        this.variables.put(error, (float) sign);
        return this;
    }

    public ArrayRow createRowGreaterThan(SolverVariable variableA, SolverVariable variableB, SolverVariable slack, int margin) {
        boolean inverse = false;
        if (margin != 0) {
            int m = margin;
            if (m < 0) {
                m *= -1;
                inverse = true;
            }
            this.mConstantValue = (float) m;
        }
        if (!inverse) {
            this.variables.put(variableA, -1.0f);
            this.variables.put(variableB, 1.0f);
            this.variables.put(slack, 1.0f);
        } else {
            this.variables.put(variableA, 1.0f);
            this.variables.put(variableB, -1.0f);
            this.variables.put(slack, -1.0f);
        }
        return this;
    }

    public ArrayRow createRowGreaterThan(SolverVariable a, int b, SolverVariable slack) {
        this.mConstantValue = (float) b;
        this.variables.put(a, -1.0f);
        return this;
    }

    public ArrayRow createRowLowerThan(SolverVariable variableA, SolverVariable variableB, SolverVariable slack, int margin) {
        boolean inverse = false;
        if (margin != 0) {
            int m = margin;
            if (m < 0) {
                m *= -1;
                inverse = true;
            }
            this.mConstantValue = (float) m;
        }
        if (!inverse) {
            this.variables.put(variableA, -1.0f);
            this.variables.put(variableB, 1.0f);
            this.variables.put(slack, -1.0f);
        } else {
            this.variables.put(variableA, 1.0f);
            this.variables.put(variableB, -1.0f);
            this.variables.put(slack, 1.0f);
        }
        return this;
    }

    public ArrayRow createRowEqualMatchDimensions(float currentWeight, float totalWeights, float nextWeight, SolverVariable variableStartA, SolverVariable variableEndA, SolverVariable variableStartB, SolverVariable variableEndB) {
        this.mConstantValue = 0.0f;
        if (totalWeights == 0.0f || currentWeight == nextWeight) {
            this.variables.put(variableStartA, 1.0f);
            this.variables.put(variableEndA, -1.0f);
            this.variables.put(variableEndB, 1.0f);
            this.variables.put(variableStartB, -1.0f);
        } else if (currentWeight == 0.0f) {
            this.variables.put(variableStartA, 1.0f);
            this.variables.put(variableEndA, -1.0f);
        } else if (nextWeight == 0.0f) {
            this.variables.put(variableStartB, 1.0f);
            this.variables.put(variableEndB, -1.0f);
        } else {
            float w = (currentWeight / totalWeights) / (nextWeight / totalWeights);
            this.variables.put(variableStartA, 1.0f);
            this.variables.put(variableEndA, -1.0f);
            this.variables.put(variableEndB, w);
            this.variables.put(variableStartB, -w);
        }
        return this;
    }

    public ArrayRow createRowEqualDimension(float currentWeight, float totalWeights, float nextWeight, SolverVariable variableStartA, int marginStartA, SolverVariable variableEndA, int marginEndA, SolverVariable variableStartB, int marginStartB, SolverVariable variableEndB, int marginEndB) {
        SolverVariable solverVariable = variableStartA;
        int i = marginStartA;
        SolverVariable solverVariable2 = variableEndA;
        SolverVariable solverVariable3 = variableStartB;
        int i2 = marginStartB;
        SolverVariable solverVariable4 = variableEndB;
        int i3 = marginEndB;
        if (totalWeights == 0.0f || currentWeight == nextWeight) {
            this.mConstantValue = (float) (((-i) - marginEndA) + i2 + i3);
            this.variables.put(solverVariable, 1.0f);
            this.variables.put(solverVariable2, -1.0f);
            this.variables.put(solverVariable4, 1.0f);
            this.variables.put(solverVariable3, -1.0f);
        } else {
            float w = (currentWeight / totalWeights) / (nextWeight / totalWeights);
            this.mConstantValue = ((float) ((-i) - marginEndA)) + (((float) i2) * w) + (((float) i3) * w);
            this.variables.put(solverVariable, 1.0f);
            this.variables.put(solverVariable2, -1.0f);
            this.variables.put(solverVariable4, w);
            this.variables.put(solverVariable3, -w);
        }
        return this;
    }

    /* access modifiers changed from: package-private */
    public ArrayRow createRowCentering(SolverVariable variableA, SolverVariable variableB, int marginA, float bias, SolverVariable variableC, SolverVariable variableD, int marginB) {
        if (variableB == variableC) {
            this.variables.put(variableA, 1.0f);
            this.variables.put(variableD, 1.0f);
            this.variables.put(variableB, -2.0f);
            return this;
        }
        if (bias == 0.5f) {
            this.variables.put(variableA, 1.0f);
            this.variables.put(variableB, -1.0f);
            this.variables.put(variableC, -1.0f);
            this.variables.put(variableD, 1.0f);
            if (marginA > 0 || marginB > 0) {
                this.mConstantValue = (float) ((-marginA) + marginB);
            }
        } else if (bias <= 0.0f) {
            this.variables.put(variableA, -1.0f);
            this.variables.put(variableB, 1.0f);
            this.mConstantValue = (float) marginA;
        } else if (bias >= 1.0f) {
            this.variables.put(variableD, -1.0f);
            this.variables.put(variableC, 1.0f);
            this.mConstantValue = (float) (-marginB);
        } else {
            this.variables.put(variableA, (1.0f - bias) * 1.0f);
            this.variables.put(variableB, (1.0f - bias) * -1.0f);
            this.variables.put(variableC, -1.0f * bias);
            this.variables.put(variableD, bias * 1.0f);
            if (marginA > 0 || marginB > 0) {
                this.mConstantValue = (((float) (-marginA)) * (1.0f - bias)) + (((float) marginB) * bias);
            }
        }
        return this;
    }

    public ArrayRow addError(LinearSystem system, int strength) {
        this.variables.put(system.createErrorVariable(strength, "ep"), 1.0f);
        this.variables.put(system.createErrorVariable(strength, "em"), -1.0f);
        return this;
    }

    /* access modifiers changed from: package-private */
    public ArrayRow createRowDimensionPercent(SolverVariable variableA, SolverVariable variableC, float percent) {
        this.variables.put(variableA, -1.0f);
        this.variables.put(variableC, percent);
        return this;
    }

    public ArrayRow createRowDimensionRatio(SolverVariable variableA, SolverVariable variableB, SolverVariable variableC, SolverVariable variableD, float ratio) {
        this.variables.put(variableA, -1.0f);
        this.variables.put(variableB, 1.0f);
        this.variables.put(variableC, ratio);
        this.variables.put(variableD, -ratio);
        return this;
    }

    public ArrayRow createRowWithAngle(SolverVariable at, SolverVariable ab, SolverVariable bt, SolverVariable bb, float angleComponent) {
        this.variables.put(bt, 0.5f);
        this.variables.put(bb, 0.5f);
        this.variables.put(at, -0.5f);
        this.variables.put(ab, -0.5f);
        this.mConstantValue = -angleComponent;
        return this;
    }

    /* access modifiers changed from: package-private */
    public int sizeInBytes() {
        int size = 0;
        if (this.mVariable != null) {
            size = 0 + 4;
        }
        return size + 4 + 4 + this.variables.sizeInBytes();
    }

    /* access modifiers changed from: package-private */
    public void ensurePositiveConstant() {
        if (this.mConstantValue < 0.0f) {
            this.mConstantValue *= -1.0f;
            this.variables.invert();
        }
    }

    /* access modifiers changed from: package-private */
    public boolean chooseSubject(LinearSystem system) {
        boolean addedExtra = false;
        SolverVariable pivotCandidate = chooseSubjectInVariables(system);
        if (pivotCandidate == null) {
            addedExtra = true;
        } else {
            pivot(pivotCandidate);
        }
        if (this.variables.getCurrentSize() == 0) {
            this.mIsSimpleDefinition = true;
        }
        return addedExtra;
    }

    /* access modifiers changed from: package-private */
    public SolverVariable chooseSubjectInVariables(LinearSystem system) {
        SolverVariable restrictedCandidate = null;
        SolverVariable unrestrictedCandidate = null;
        float unrestrictedCandidateAmount = 0.0f;
        float restrictedCandidateAmount = 0.0f;
        boolean unrestrictedCandidateIsNew = false;
        boolean restrictedCandidateIsNew = false;
        int currentSize = this.variables.getCurrentSize();
        for (int i = 0; i < currentSize; i++) {
            float amount = this.variables.getVariableValue(i);
            SolverVariable variable = this.variables.getVariable(i);
            if (variable.mType == SolverVariable.Type.UNRESTRICTED) {
                if (unrestrictedCandidate == null) {
                    unrestrictedCandidate = variable;
                    unrestrictedCandidateAmount = amount;
                    unrestrictedCandidateIsNew = isNew(variable, system);
                } else if (unrestrictedCandidateAmount > amount) {
                    unrestrictedCandidate = variable;
                    unrestrictedCandidateAmount = amount;
                    unrestrictedCandidateIsNew = isNew(variable, system);
                } else if (!unrestrictedCandidateIsNew && isNew(variable, system)) {
                    unrestrictedCandidate = variable;
                    unrestrictedCandidateAmount = amount;
                    unrestrictedCandidateIsNew = true;
                }
            } else if (unrestrictedCandidate == null && amount < 0.0f) {
                if (restrictedCandidate == null) {
                    restrictedCandidate = variable;
                    restrictedCandidateAmount = amount;
                    restrictedCandidateIsNew = isNew(variable, system);
                } else if (restrictedCandidateAmount > amount) {
                    restrictedCandidate = variable;
                    restrictedCandidateAmount = amount;
                    restrictedCandidateIsNew = isNew(variable, system);
                } else if (!restrictedCandidateIsNew && isNew(variable, system)) {
                    restrictedCandidate = variable;
                    restrictedCandidateAmount = amount;
                    restrictedCandidateIsNew = true;
                }
            }
        }
        if (unrestrictedCandidate != null) {
            return unrestrictedCandidate;
        }
        return restrictedCandidate;
    }

    private boolean isNew(SolverVariable variable, LinearSystem system) {
        return variable.usageInRowCount <= 1;
    }

    /* access modifiers changed from: package-private */
    public void pivot(SolverVariable v) {
        if (this.mVariable != null) {
            this.variables.put(this.mVariable, -1.0f);
            this.mVariable.mDefinitionId = -1;
            this.mVariable = null;
        }
        float amount = this.variables.remove(v, true) * -1.0f;
        this.mVariable = v;
        if (amount != 1.0f) {
            this.mConstantValue /= amount;
            this.variables.divideByAmount(amount);
        }
    }

    public boolean isEmpty() {
        return this.mVariable == null && this.mConstantValue == 0.0f && this.variables.getCurrentSize() == 0;
    }

    public void updateFromRow(LinearSystem system, ArrayRow definition, boolean removeFromDefinition) {
        this.mConstantValue += definition.mConstantValue * this.variables.use(definition, removeFromDefinition);
        if (removeFromDefinition) {
            definition.mVariable.removeFromRow(this);
        }
        if (LinearSystem.SIMPLIFY_SYNONYMS && this.mVariable != null && this.variables.getCurrentSize() == 0) {
            this.mIsSimpleDefinition = true;
            system.hasSimpleDefinition = true;
        }
    }

    public void updateFromFinalVariable(LinearSystem system, SolverVariable variable, boolean removeFromDefinition) {
        if (variable != null && variable.isFinalValue) {
            this.mConstantValue += variable.computedValue * this.variables.get(variable);
            this.variables.remove(variable, removeFromDefinition);
            if (removeFromDefinition) {
                variable.removeFromRow(this);
            }
            if (LinearSystem.SIMPLIFY_SYNONYMS && this.variables.getCurrentSize() == 0) {
                this.mIsSimpleDefinition = true;
                system.hasSimpleDefinition = true;
            }
        }
    }

    public void updateFromSynonymVariable(LinearSystem system, SolverVariable variable, boolean removeFromDefinition) {
        if (variable != null && variable.mIsSynonym) {
            float value = this.variables.get(variable);
            this.mConstantValue += variable.mSynonymDelta * value;
            this.variables.remove(variable, removeFromDefinition);
            if (removeFromDefinition) {
                variable.removeFromRow(this);
            }
            this.variables.add(system.mCache.mIndexedVariables[variable.mSynonym], value, removeFromDefinition);
            if (LinearSystem.SIMPLIFY_SYNONYMS && this.variables.getCurrentSize() == 0) {
                this.mIsSimpleDefinition = true;
                system.hasSimpleDefinition = true;
            }
        }
    }

    private SolverVariable pickPivotInVariables(boolean[] avoid, SolverVariable exclude) {
        float value = 0.0f;
        SolverVariable pivot = null;
        SolverVariable pivotSlack = null;
        float valueSlack = 0.0f;
        int currentSize = this.variables.getCurrentSize();
        for (int i = 0; i < currentSize; i++) {
            float currentValue = this.variables.getVariableValue(i);
            if (currentValue < 0.0f) {
                SolverVariable v = this.variables.getVariable(i);
                if ((avoid == null || !avoid[v.id]) && v != exclude) {
                    if (1 != 0) {
                        if ((v.mType == SolverVariable.Type.SLACK || v.mType == SolverVariable.Type.ERROR) && currentValue < value) {
                            value = currentValue;
                            pivot = v;
                        }
                    } else if (v.mType == SolverVariable.Type.SLACK) {
                        if (currentValue < valueSlack) {
                            valueSlack = currentValue;
                            pivotSlack = v;
                        }
                    } else if (v.mType == SolverVariable.Type.ERROR && currentValue < value) {
                        value = currentValue;
                        pivot = v;
                    }
                }
            }
        }
        if (1 != 0) {
            return pivot;
        }
        return pivot != null ? pivot : pivotSlack;
    }

    public SolverVariable pickPivot(SolverVariable exclude) {
        return pickPivotInVariables((boolean[]) null, exclude);
    }

    public SolverVariable getPivotCandidate(LinearSystem system, boolean[] avoid) {
        return pickPivotInVariables(avoid, (SolverVariable) null);
    }

    public void clear() {
        this.variables.clear();
        this.mVariable = null;
        this.mConstantValue = 0.0f;
    }

    public void initFromRow(LinearSystem.Row row) {
        if (row instanceof ArrayRow) {
            ArrayRow copiedRow = (ArrayRow) row;
            this.mVariable = null;
            this.variables.clear();
            for (int i = 0; i < copiedRow.variables.getCurrentSize(); i++) {
                this.variables.add(copiedRow.variables.getVariable(i), copiedRow.variables.getVariableValue(i), true);
            }
        }
    }

    public void addError(SolverVariable error) {
        float weight = 1.0f;
        if (error.strength == 1) {
            weight = 1.0f;
        } else if (error.strength == 2) {
            weight = 1000.0f;
        } else if (error.strength == 3) {
            weight = 1000000.0f;
        } else if (error.strength == 4) {
            weight = 1.0E9f;
        } else if (error.strength == 5) {
            weight = 1.0E12f;
        }
        this.variables.put(error, weight);
    }

    public SolverVariable getKey() {
        return this.mVariable;
    }

    public void updateFromSystem(LinearSystem system) {
        if (system.mRows.length != 0) {
            boolean done = false;
            while (!done) {
                int currentSize = this.variables.getCurrentSize();
                for (int i = 0; i < currentSize; i++) {
                    SolverVariable variable = this.variables.getVariable(i);
                    if (variable.mDefinitionId != -1 || variable.isFinalValue || variable.mIsSynonym) {
                        this.mVariablesToUpdate.add(variable);
                    }
                }
                int size = this.mVariablesToUpdate.size();
                if (size > 0) {
                    for (int i2 = 0; i2 < size; i2++) {
                        SolverVariable variable2 = this.mVariablesToUpdate.get(i2);
                        if (variable2.isFinalValue) {
                            updateFromFinalVariable(system, variable2, true);
                        } else if (variable2.mIsSynonym) {
                            updateFromSynonymVariable(system, variable2, true);
                        } else {
                            updateFromRow(system, system.mRows[variable2.mDefinitionId], true);
                        }
                    }
                    this.mVariablesToUpdate.clear();
                } else {
                    done = true;
                }
            }
            if (LinearSystem.SIMPLIFY_SYNONYMS && this.mVariable != null && this.variables.getCurrentSize() == 0) {
                this.mIsSimpleDefinition = true;
                system.hasSimpleDefinition = true;
            }
        }
    }
}
