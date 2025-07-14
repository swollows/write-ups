package androidx.constraintlayout.core.parser;

public class CLString extends CLElement {
    public CLString(char[] content) {
        super(content);
    }

    public static CLElement allocate(char[] content) {
        return new CLString(content);
    }

    public static CLString from(String content) {
        CLString stringElement = new CLString(content.toCharArray());
        stringElement.setStart(0);
        stringElement.setEnd((long) (content.length() - 1));
        return stringElement;
    }

    /* access modifiers changed from: protected */
    public String toJSON() {
        return "'" + content() + "'";
    }

    /* access modifiers changed from: protected */
    public String toFormattedJSON(int indent, int forceIndent) {
        StringBuilder json = new StringBuilder();
        addIndent(json, indent);
        json.append("'");
        json.append(content());
        json.append("'");
        return json.toString();
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof CLString) || !content().equals(((CLString) obj).content())) {
            return super.equals(obj);
        }
        return true;
    }

    public int hashCode() {
        return super.hashCode();
    }
}
