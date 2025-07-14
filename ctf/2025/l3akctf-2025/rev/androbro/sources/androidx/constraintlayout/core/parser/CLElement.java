package androidx.constraintlayout.core.parser;

import java.util.Arrays;
import java.util.Objects;

public class CLElement implements Cloneable {
    protected static int sBaseIndent = 2;
    protected static int sMaxLine = 80;
    protected CLContainer mContainer;
    private final char[] mContent;
    protected long mEnd = Long.MAX_VALUE;
    private int mLine;
    protected long mStart = -1;

    public CLElement(char[] content) {
        this.mContent = content;
    }

    public boolean notStarted() {
        return this.mStart == -1;
    }

    public void setLine(int line) {
        this.mLine = line;
    }

    public int getLine() {
        return this.mLine;
    }

    public void setStart(long start) {
        this.mStart = start;
    }

    public long getStart() {
        return this.mStart;
    }

    public long getEnd() {
        return this.mEnd;
    }

    public void setEnd(long end) {
        if (this.mEnd == Long.MAX_VALUE) {
            this.mEnd = end;
            if (CLParser.sDebug) {
                System.out.println("closing " + hashCode() + " -> " + this);
            }
            if (this.mContainer != null) {
                this.mContainer.add(this);
            }
        }
    }

    /* access modifiers changed from: protected */
    public void addIndent(StringBuilder builder, int indent) {
        for (int i = 0; i < indent; i++) {
            builder.append(' ');
        }
    }

    public String toString() {
        if (this.mStart > this.mEnd || this.mEnd == Long.MAX_VALUE) {
            return getClass() + " (INVALID, " + this.mStart + "-" + this.mEnd + ")";
        }
        return getStrClass() + " (" + this.mStart + " : " + this.mEnd + ") <<" + new String(this.mContent).substring((int) this.mStart, ((int) this.mEnd) + 1) + ">>";
    }

    /* access modifiers changed from: protected */
    public String getStrClass() {
        String myClass = getClass().toString();
        return myClass.substring(myClass.lastIndexOf(46) + 1);
    }

    /* access modifiers changed from: protected */
    public String getDebugName() {
        if (CLParser.sDebug) {
            return getStrClass() + " -> ";
        }
        return "";
    }

    public String content() {
        String content = new String(this.mContent);
        if (content.length() < 1) {
            return "";
        }
        if (this.mEnd == Long.MAX_VALUE || this.mEnd < this.mStart) {
            return content.substring((int) this.mStart, ((int) this.mStart) + 1);
        }
        return content.substring((int) this.mStart, ((int) this.mEnd) + 1);
    }

    public boolean hasContent() {
        return this.mContent != null && this.mContent.length >= 1;
    }

    public boolean isDone() {
        return this.mEnd != Long.MAX_VALUE;
    }

    public void setContainer(CLContainer element) {
        this.mContainer = element;
    }

    public CLElement getContainer() {
        return this.mContainer;
    }

    public boolean isStarted() {
        return this.mStart > -1;
    }

    /* access modifiers changed from: protected */
    public String toJSON() {
        return "";
    }

    /* access modifiers changed from: protected */
    public String toFormattedJSON(int indent, int forceIndent) {
        return "";
    }

    public int getInt() {
        if (this instanceof CLNumber) {
            return ((CLNumber) this).getInt();
        }
        return 0;
    }

    public float getFloat() {
        if (this instanceof CLNumber) {
            return ((CLNumber) this).getFloat();
        }
        return Float.NaN;
    }

    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof CLElement)) {
            return false;
        }
        CLElement clElement = (CLElement) o;
        if (this.mStart == clElement.mStart && this.mEnd == clElement.mEnd && this.mLine == clElement.mLine && Arrays.equals(this.mContent, clElement.mContent)) {
            return Objects.equals(this.mContainer, clElement.mContainer);
        }
        return false;
    }

    public int hashCode() {
        return (((((((Arrays.hashCode(this.mContent) * 31) + ((int) (this.mStart ^ (this.mStart >>> 32)))) * 31) + ((int) (this.mEnd ^ (this.mEnd >>> 32)))) * 31) + (this.mContainer != null ? this.mContainer.hashCode() : 0)) * 31) + this.mLine;
    }

    public CLElement clone() {
        try {
            return (CLElement) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new AssertionError();
        }
    }
}
