package androidx.constraintlayout.core.dsl;

import androidx.constraintlayout.core.dsl.Constraint;
import androidx.constraintlayout.core.dsl.Helper;
import java.util.ArrayList;
import java.util.Iterator;

public class Barrier extends Helper {
    private Constraint.Side mDirection = null;
    private int mMargin = Integer.MIN_VALUE;
    private ArrayList<Ref> references = new ArrayList<>();

    public Barrier(String name) {
        super(name, new Helper.HelperType((String) typeMap.get(Helper.Type.BARRIER)));
    }

    public Barrier(String name, String config) {
        super(name, new Helper.HelperType((String) typeMap.get(Helper.Type.BARRIER)), config);
        this.configMap = convertConfigToMap();
        if (this.configMap.containsKey("contains")) {
            Ref.addStringToReferences((String) this.configMap.get("contains"), this.references);
        }
    }

    public Constraint.Side getDirection() {
        return this.mDirection;
    }

    public void setDirection(Constraint.Side direction) {
        this.mDirection = direction;
        this.configMap.put("direction", (String) sideMap.get(direction));
    }

    public int getMargin() {
        return this.mMargin;
    }

    public void setMargin(int margin) {
        this.mMargin = margin;
        this.configMap.put("margin", String.valueOf(margin));
    }

    public String referencesToString() {
        if (this.references.isEmpty()) {
            return "";
        }
        StringBuilder builder = new StringBuilder("[");
        Iterator<Ref> it = this.references.iterator();
        while (it.hasNext()) {
            builder.append(it.next().toString());
        }
        builder.append("]");
        return builder.toString();
    }

    public Barrier addReference(Ref ref) {
        this.references.add(ref);
        this.configMap.put("contains", referencesToString());
        return this;
    }

    public Barrier addReference(String ref) {
        return addReference(Ref.parseStringToRef(ref));
    }
}
