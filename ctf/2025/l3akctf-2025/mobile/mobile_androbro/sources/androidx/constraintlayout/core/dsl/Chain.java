package androidx.constraintlayout.core.dsl;

import androidx.constraintlayout.core.dsl.Constraint;
import androidx.constraintlayout.core.dsl.Helper;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

public abstract class Chain extends Helper {
    protected static final Map<Style, String> styleMap = new HashMap();
    private Style mStyle = null;
    protected ArrayList<Ref> references = new ArrayList<>();

    public enum Style {
        PACKED,
        SPREAD,
        SPREAD_INSIDE
    }

    static {
        styleMap.put(Style.SPREAD, "'spread'");
        styleMap.put(Style.SPREAD_INSIDE, "'spread_inside'");
        styleMap.put(Style.PACKED, "'packed'");
    }

    public Chain(String name) {
        super(name, new Helper.HelperType(""));
    }

    public Style getStyle() {
        return this.mStyle;
    }

    public void setStyle(Style style) {
        this.mStyle = style;
        this.configMap.put("style", styleMap.get(style));
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

    public Chain addReference(Ref ref) {
        this.references.add(ref);
        this.configMap.put("contains", referencesToString());
        return this;
    }

    public Chain addReference(String ref) {
        return addReference(Ref.parseStringToRef(ref));
    }

    public class Anchor {
        Constraint.Anchor mConnection = null;
        int mGoneMargin = Integer.MIN_VALUE;
        int mMargin;
        final Constraint.Side mSide;

        Anchor(Constraint.Side side) {
            this.mSide = side;
        }

        public String getId() {
            return Chain.this.name;
        }

        public void build(StringBuilder builder) {
            if (this.mConnection != null) {
                builder.append(this.mSide.toString().toLowerCase()).append(":").append(this).append(",\n");
            }
        }

        public String toString() {
            StringBuilder ret = new StringBuilder("[");
            if (this.mConnection != null) {
                ret.append("'").append(this.mConnection.getId()).append("',").append("'").append(this.mConnection.mSide.toString().toLowerCase()).append("'");
            }
            if (this.mMargin != 0) {
                ret.append(",").append(this.mMargin);
            }
            if (this.mGoneMargin != Integer.MIN_VALUE) {
                if (this.mMargin == 0) {
                    ret.append(",0,").append(this.mGoneMargin);
                } else {
                    ret.append(",").append(this.mGoneMargin);
                }
            }
            ret.append("]");
            return ret.toString();
        }
    }
}
