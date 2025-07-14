package androidx.constraintlayout.core.parser;

import java.util.Iterator;

public class CLObject extends CLContainer implements Iterable<CLKey> {
    public CLObject(char[] content) {
        super(content);
    }

    public static CLObject allocate(char[] content) {
        return new CLObject(content);
    }

    public String toJSON() {
        StringBuilder json = new StringBuilder(getDebugName() + "{ ");
        boolean first = true;
        Iterator it = this.mElements.iterator();
        while (it.hasNext()) {
            CLElement element = (CLElement) it.next();
            if (!first) {
                json.append(", ");
            } else {
                first = false;
            }
            json.append(element.toJSON());
        }
        json.append(" }");
        return json.toString();
    }

    public String toFormattedJSON() {
        return toFormattedJSON(0, 0);
    }

    public String toFormattedJSON(int indent, int forceIndent) {
        StringBuilder json = new StringBuilder(getDebugName());
        json.append("{\n");
        boolean first = true;
        Iterator it = this.mElements.iterator();
        while (it.hasNext()) {
            CLElement element = (CLElement) it.next();
            if (!first) {
                json.append(",\n");
            } else {
                first = false;
            }
            json.append(element.toFormattedJSON(sBaseIndent + indent, forceIndent - 1));
        }
        json.append("\n");
        addIndent(json, indent);
        json.append("}");
        return json.toString();
    }

    public Iterator<CLKey> iterator() {
        return new CLObjectIterator(this);
    }

    private static class CLObjectIterator implements Iterator<CLKey> {
        int mIndex = 0;
        CLObject mObject;

        CLObjectIterator(CLObject clObject) {
            this.mObject = clObject;
        }

        public boolean hasNext() {
            return this.mIndex < this.mObject.size();
        }

        public CLKey next() {
            CLKey key = (CLKey) this.mObject.mElements.get(this.mIndex);
            this.mIndex++;
            return key;
        }
    }

    public CLObject clone() {
        return (CLObject) super.clone();
    }
}
