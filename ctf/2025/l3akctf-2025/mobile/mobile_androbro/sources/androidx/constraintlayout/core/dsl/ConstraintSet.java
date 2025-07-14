package androidx.constraintlayout.core.dsl;

import java.util.ArrayList;
import java.util.Iterator;

public class ConstraintSet {
    ArrayList<Constraint> mConstraints = new ArrayList<>();
    ArrayList<Helper> mHelpers = new ArrayList<>();
    private final String mName;

    public ConstraintSet(String name) {
        this.mName = name;
    }

    public void add(Constraint c) {
        this.mConstraints.add(c);
    }

    public void add(Helper h) {
        this.mHelpers.add(h);
    }

    public String toString() {
        StringBuilder ret = new StringBuilder(this.mName + ":{\n");
        if (!this.mConstraints.isEmpty()) {
            Iterator<Constraint> it = this.mConstraints.iterator();
            while (it.hasNext()) {
                ret.append(it.next().toString());
            }
        }
        if (!this.mHelpers.isEmpty()) {
            Iterator<Helper> it2 = this.mHelpers.iterator();
            while (it2.hasNext()) {
                ret.append(it2.next().toString());
            }
        }
        ret.append("},\n");
        return ret.toString();
    }
}
