package androidx.constraintlayout.core.parser;

import androidx.constraintlayout.core.motion.utils.TypedValues;
import java.util.ArrayList;
import java.util.Objects;

public class CLKey extends CLContainer {
    private static ArrayList<String> sSections = new ArrayList<>();

    static {
        sSections.add("ConstraintSets");
        sSections.add("Variables");
        sSections.add("Generate");
        sSections.add(TypedValues.TransitionType.NAME);
        sSections.add("KeyFrames");
        sSections.add(TypedValues.AttributesType.NAME);
        sSections.add("KeyPositions");
        sSections.add("KeyCycles");
    }

    public CLKey(char[] content) {
        super(content);
    }

    public static CLElement allocate(char[] content) {
        return new CLKey(content);
    }

    public static CLElement allocate(String name, CLElement value) {
        CLKey key = new CLKey(name.toCharArray());
        key.setStart(0);
        key.setEnd((long) (name.length() - 1));
        key.set(value);
        return key;
    }

    public String getName() {
        return content();
    }

    /* access modifiers changed from: protected */
    public String toJSON() {
        if (this.mElements.size() > 0) {
            return getDebugName() + content() + ": " + ((CLElement) this.mElements.get(0)).toJSON();
        }
        return getDebugName() + content() + ": <> ";
    }

    /* access modifiers changed from: protected */
    public String toFormattedJSON(int indent, int forceIndent) {
        StringBuilder json = new StringBuilder(getDebugName());
        addIndent(json, indent);
        String content = content();
        if (this.mElements.size() <= 0) {
            return content + ": <> ";
        }
        json.append(content);
        json.append(": ");
        if (sSections.contains(content)) {
            forceIndent = 3;
        }
        if (forceIndent > 0) {
            json.append(((CLElement) this.mElements.get(0)).toFormattedJSON(indent, forceIndent - 1));
        } else {
            String val = ((CLElement) this.mElements.get(0)).toJSON();
            if (val.length() + indent < sMaxLine) {
                json.append(val);
            } else {
                json.append(((CLElement) this.mElements.get(0)).toFormattedJSON(indent, forceIndent - 1));
            }
        }
        return json.toString();
    }

    public void set(CLElement value) {
        if (this.mElements.size() > 0) {
            this.mElements.set(0, value);
        } else {
            this.mElements.add(value);
        }
    }

    public CLElement getValue() {
        if (this.mElements.size() > 0) {
            return (CLElement) this.mElements.get(0);
        }
        return null;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof CLKey) || Objects.equals(getName(), ((CLKey) obj).getName())) {
            return super.equals(obj);
        }
        return false;
    }

    public int hashCode() {
        return super.hashCode();
    }
}
