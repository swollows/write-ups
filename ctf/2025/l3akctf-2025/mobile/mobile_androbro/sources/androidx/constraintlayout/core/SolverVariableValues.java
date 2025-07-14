package androidx.constraintlayout.core;

import androidx.constraintlayout.core.ArrayRow;
import java.util.Arrays;

public class SolverVariableValues implements ArrayRow.ArrayRowVariables {
    private static final boolean DEBUG = false;
    private static final boolean HASH = true;
    private static float sEpsilon = 0.001f;
    protected final Cache mCache;
    int mCount = 0;
    private int mHashSize = 16;
    int mHead = -1;
    int[] mKeys = new int[this.mSize];
    int[] mNext = new int[this.mSize];
    int[] mNextKeys = new int[this.mSize];
    private final int mNone = -1;
    int[] mPrevious = new int[this.mSize];
    private final ArrayRow mRow;
    private int mSize = 16;
    float[] mValues = new float[this.mSize];
    int[] mVariables = new int[this.mSize];

    SolverVariableValues(ArrayRow row, Cache cache) {
        this.mRow = row;
        this.mCache = cache;
        clear();
    }

    public int getCurrentSize() {
        return this.mCount;
    }

    public SolverVariable getVariable(int index) {
        int count = this.mCount;
        if (count == 0) {
            return null;
        }
        int j = this.mHead;
        for (int i = 0; i < count; i++) {
            if (i == index && j != -1) {
                return this.mCache.mIndexedVariables[this.mVariables[j]];
            }
            j = this.mNext[j];
            if (j == -1) {
                break;
            }
        }
        return null;
    }

    public float getVariableValue(int index) {
        int count = this.mCount;
        int j = this.mHead;
        for (int i = 0; i < count; i++) {
            if (i == index) {
                return this.mValues[j];
            }
            j = this.mNext[j];
            if (j == -1) {
                return 0.0f;
            }
        }
        return 0.0f;
    }

    public boolean contains(SolverVariable variable) {
        return indexOf(variable) != -1;
    }

    public int indexOf(SolverVariable variable) {
        if (this.mCount == 0 || variable == null) {
            return -1;
        }
        int id = variable.id;
        int key = this.mKeys[id % this.mHashSize];
        if (key == -1) {
            return -1;
        }
        if (this.mVariables[key] == id) {
            return key;
        }
        while (this.mNextKeys[key] != -1 && this.mVariables[this.mNextKeys[key]] != id) {
            key = this.mNextKeys[key];
        }
        if (this.mNextKeys[key] != -1 && this.mVariables[this.mNextKeys[key]] == id) {
            return this.mNextKeys[key];
        }
        return -1;
    }

    public float get(SolverVariable variable) {
        int index = indexOf(variable);
        if (index != -1) {
            return this.mValues[index];
        }
        return 0.0f;
    }

    public void display() {
        int count = this.mCount;
        System.out.print("{ ");
        for (int i = 0; i < count; i++) {
            SolverVariable v = getVariable(i);
            if (v != null) {
                System.out.print(v + " = " + getVariableValue(i) + " ");
            }
        }
        System.out.println(" }");
    }

    public String toString() {
        String str;
        String str2;
        String str3 = hashCode() + " { ";
        int count = this.mCount;
        for (int i = 0; i < count; i++) {
            SolverVariable v = getVariable(i);
            if (v != null) {
                int index = indexOf(v);
                String str4 = (str3 + v + " = " + getVariableValue(i) + " ") + "[p: ";
                if (this.mPrevious[index] != -1) {
                    str = str4 + this.mCache.mIndexedVariables[this.mVariables[this.mPrevious[index]]];
                } else {
                    str = str4 + "none";
                }
                String str5 = str + ", n: ";
                if (this.mNext[index] != -1) {
                    str2 = str5 + this.mCache.mIndexedVariables[this.mVariables[this.mNext[index]]];
                } else {
                    str2 = str5 + "none";
                }
                str3 = str2 + "]";
            }
        }
        return str3 + " }";
    }

    public void clear() {
        int count = this.mCount;
        for (int i = 0; i < count; i++) {
            SolverVariable v = getVariable(i);
            if (v != null) {
                v.removeFromRow(this.mRow);
            }
        }
        for (int i2 = 0; i2 < this.mSize; i2++) {
            this.mVariables[i2] = -1;
            this.mNextKeys[i2] = -1;
        }
        for (int i3 = 0; i3 < this.mHashSize; i3++) {
            this.mKeys[i3] = -1;
        }
        this.mCount = 0;
        this.mHead = -1;
    }

    private void increaseSize() {
        int size = this.mSize * 2;
        this.mVariables = Arrays.copyOf(this.mVariables, size);
        this.mValues = Arrays.copyOf(this.mValues, size);
        this.mPrevious = Arrays.copyOf(this.mPrevious, size);
        this.mNext = Arrays.copyOf(this.mNext, size);
        this.mNextKeys = Arrays.copyOf(this.mNextKeys, size);
        for (int i = this.mSize; i < size; i++) {
            this.mVariables[i] = -1;
            this.mNextKeys[i] = -1;
        }
        this.mSize = size;
    }

    private void addToHashMap(SolverVariable variable, int index) {
        int hash = variable.id % this.mHashSize;
        int key = this.mKeys[hash];
        if (key == -1) {
            this.mKeys[hash] = index;
        } else {
            while (this.mNextKeys[key] != -1) {
                key = this.mNextKeys[key];
            }
            this.mNextKeys[key] = index;
        }
        this.mNextKeys[index] = -1;
    }

    private void displayHash() {
        for (int i = 0; i < this.mHashSize; i++) {
            if (this.mKeys[i] != -1) {
                String str = hashCode() + " hash [" + i + "] => ";
                int key = this.mKeys[i];
                boolean done = false;
                while (!done) {
                    str = str + " " + this.mVariables[key];
                    if (this.mNextKeys[key] != -1) {
                        key = this.mNextKeys[key];
                    } else {
                        done = true;
                    }
                }
                System.out.println(str);
            }
        }
    }

    private void removeFromHashMap(SolverVariable variable) {
        int hash = variable.id % this.mHashSize;
        int key = this.mKeys[hash];
        if (key != -1) {
            int id = variable.id;
            if (this.mVariables[key] == id) {
                this.mKeys[hash] = this.mNextKeys[key];
                this.mNextKeys[key] = -1;
                return;
            }
            while (this.mNextKeys[key] != -1 && this.mVariables[this.mNextKeys[key]] != id) {
                key = this.mNextKeys[key];
            }
            int currentKey = this.mNextKeys[key];
            if (currentKey != -1 && this.mVariables[currentKey] == id) {
                this.mNextKeys[key] = this.mNextKeys[currentKey];
                this.mNextKeys[currentKey] = -1;
            }
        }
    }

    private void addVariable(int index, SolverVariable variable, float value) {
        this.mVariables[index] = variable.id;
        this.mValues[index] = value;
        this.mPrevious[index] = -1;
        this.mNext[index] = -1;
        variable.addToRow(this.mRow);
        variable.usageInRowCount++;
        this.mCount++;
    }

    private int findEmptySlot() {
        for (int i = 0; i < this.mSize; i++) {
            if (this.mVariables[i] == -1) {
                return i;
            }
        }
        return -1;
    }

    private void insertVariable(int index, SolverVariable variable, float value) {
        int availableSlot = findEmptySlot();
        addVariable(availableSlot, variable, value);
        if (index != -1) {
            this.mPrevious[availableSlot] = index;
            this.mNext[availableSlot] = this.mNext[index];
            this.mNext[index] = availableSlot;
        } else {
            this.mPrevious[availableSlot] = -1;
            if (this.mCount > 0) {
                this.mNext[availableSlot] = this.mHead;
                this.mHead = availableSlot;
            } else {
                this.mNext[availableSlot] = -1;
            }
        }
        if (this.mNext[availableSlot] != -1) {
            this.mPrevious[this.mNext[availableSlot]] = availableSlot;
        }
        addToHashMap(variable, availableSlot);
    }

    public void put(SolverVariable variable, float value) {
        if (value > (-sEpsilon) && value < sEpsilon) {
            remove(variable, true);
        } else if (this.mCount == 0) {
            addVariable(0, variable, value);
            addToHashMap(variable, 0);
            this.mHead = 0;
        } else {
            int index = indexOf(variable);
            if (index != -1) {
                this.mValues[index] = value;
                return;
            }
            if (this.mCount + 1 >= this.mSize) {
                increaseSize();
            }
            int count = this.mCount;
            int previousItem = -1;
            int j = this.mHead;
            for (int i = 0; i < count; i++) {
                if (this.mVariables[j] == variable.id) {
                    this.mValues[j] = value;
                    return;
                }
                if (this.mVariables[j] < variable.id) {
                    previousItem = j;
                }
                j = this.mNext[j];
                if (j == -1) {
                    break;
                }
            }
            insertVariable(previousItem, variable, value);
        }
    }

    public int sizeInBytes() {
        return 0;
    }

    public float remove(SolverVariable v, boolean removeFromDefinition) {
        int index = indexOf(v);
        if (index == -1) {
            return 0.0f;
        }
        removeFromHashMap(v);
        float value = this.mValues[index];
        if (this.mHead == index) {
            this.mHead = this.mNext[index];
        }
        this.mVariables[index] = -1;
        if (this.mPrevious[index] != -1) {
            this.mNext[this.mPrevious[index]] = this.mNext[index];
        }
        if (this.mNext[index] != -1) {
            this.mPrevious[this.mNext[index]] = this.mPrevious[index];
        }
        this.mCount--;
        v.usageInRowCount--;
        if (removeFromDefinition) {
            v.removeFromRow(this.mRow);
        }
        return value;
    }

    public void add(SolverVariable v, float value, boolean removeFromDefinition) {
        if (value <= (-sEpsilon) || value >= sEpsilon) {
            int index = indexOf(v);
            if (index == -1) {
                put(v, value);
                return;
            }
            float[] fArr = this.mValues;
            fArr[index] = fArr[index] + value;
            if (this.mValues[index] > (-sEpsilon) && this.mValues[index] < sEpsilon) {
                this.mValues[index] = 0.0f;
                remove(v, removeFromDefinition);
            }
        }
    }

    public float use(ArrayRow definition, boolean removeFromDefinition) {
        float value = get(definition.mVariable);
        remove(definition.mVariable, removeFromDefinition);
        SolverVariableValues localDef = (SolverVariableValues) definition.variables;
        int definitionSize = localDef.getCurrentSize();
        int i = localDef.mHead;
        int j = 0;
        int i2 = 0;
        while (j < definitionSize) {
            if (localDef.mVariables[i2] != -1) {
                add(this.mCache.mIndexedVariables[localDef.mVariables[i2]], localDef.mValues[i2] * value, removeFromDefinition);
                j++;
            }
            i2++;
        }
        return value;
    }

    public void invert() {
        int count = this.mCount;
        int j = this.mHead;
        int i = 0;
        while (i < count) {
            float[] fArr = this.mValues;
            fArr[j] = fArr[j] * -1.0f;
            j = this.mNext[j];
            if (j != -1) {
                i++;
            } else {
                return;
            }
        }
    }

    public void divideByAmount(float amount) {
        int count = this.mCount;
        int j = this.mHead;
        int i = 0;
        while (i < count) {
            float[] fArr = this.mValues;
            fArr[j] = fArr[j] / amount;
            j = this.mNext[j];
            if (j != -1) {
                i++;
            } else {
                return;
            }
        }
    }
}
