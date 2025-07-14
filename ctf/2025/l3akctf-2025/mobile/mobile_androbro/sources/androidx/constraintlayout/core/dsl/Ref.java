package androidx.constraintlayout.core.dsl;

import java.util.ArrayList;
import java.util.Arrays;

public class Ref {
    private String mId;
    private float mPostMargin = Float.NaN;
    private float mPreMargin = Float.NaN;
    private float mWeight = Float.NaN;

    Ref(String id) {
        this.mId = id;
    }

    Ref(String id, float weight) {
        this.mId = id;
        this.mWeight = weight;
    }

    Ref(String id, float weight, float preMargin) {
        this.mId = id;
        this.mWeight = weight;
        this.mPreMargin = preMargin;
    }

    Ref(String id, float weight, float preMargin, float postMargin) {
        this.mId = id;
        this.mWeight = weight;
        this.mPreMargin = preMargin;
        this.mPostMargin = postMargin;
    }

    public String getId() {
        return this.mId;
    }

    public void setId(String id) {
        this.mId = id;
    }

    public float getWeight() {
        return this.mWeight;
    }

    public void setWeight(float weight) {
        this.mWeight = weight;
    }

    public float getPreMargin() {
        return this.mPreMargin;
    }

    public void setPreMargin(float preMargin) {
        this.mPreMargin = preMargin;
    }

    public float getPostMargin() {
        return this.mPostMargin;
    }

    public void setPostMargin(float postMargin) {
        this.mPostMargin = postMargin;
    }

    public static float parseFloat(Object obj) {
        try {
            return Float.parseFloat(obj.toString());
        } catch (Exception e) {
            return Float.NaN;
        }
    }

    public static Ref parseStringToRef(String str) {
        String[] values = str.replaceAll("[\\[\\]\\']", "").split(",");
        if (values.length == 0) {
            return null;
        }
        Object[] arr = new Object[4];
        int i = 0;
        while (i < values.length && i < 4) {
            arr[i] = values[i];
            i++;
        }
        return new Ref(arr[0].toString().replace("'", ""), parseFloat(arr[1]), parseFloat(arr[2]), parseFloat(arr[3]));
    }

    public static void addStringToReferences(String str, ArrayList<Ref> refs) {
        if (str != null && str.length() != 0) {
            Object[] arr = new Object[4];
            StringBuilder builder = new StringBuilder();
            int squareBrackets = 0;
            int varCount = 0;
            for (int i = 0; i < str.length(); i++) {
                char ch = str.charAt(i);
                switch (ch) {
                    case ' ':
                    case '\'':
                        break;
                    case ',':
                        if (varCount < 3) {
                            arr[varCount] = builder.toString();
                            builder.setLength(0);
                            varCount++;
                        }
                        if (squareBrackets == 1 && arr[0] != null) {
                            refs.add(new Ref(arr[0].toString()));
                            varCount = 0;
                            arr[0] = null;
                            break;
                        }
                    case '[':
                        squareBrackets++;
                        break;
                    case ']':
                        if (squareBrackets <= 0) {
                            break;
                        } else {
                            squareBrackets--;
                            arr[varCount] = builder.toString();
                            builder.setLength(0);
                            if (arr[0] == null) {
                                break;
                            } else {
                                refs.add(new Ref(arr[0].toString(), parseFloat(arr[1]), parseFloat(arr[2]), parseFloat(arr[3])));
                                varCount = 0;
                                Arrays.fill(arr, (Object) null);
                                break;
                            }
                        }
                    default:
                        builder.append(ch);
                        break;
                }
            }
        }
    }

    public String toString() {
        if (this.mId == null || this.mId.length() == 0) {
            return "";
        }
        StringBuilder ret = new StringBuilder();
        boolean isArray = false;
        if (!Float.isNaN(this.mWeight) || !Float.isNaN(this.mPreMargin) || !Float.isNaN(this.mPostMargin)) {
            isArray = true;
        }
        if (isArray) {
            ret.append("[");
        }
        ret.append("'").append(this.mId).append("'");
        float f = 0.0f;
        if (!Float.isNaN(this.mPostMargin)) {
            ret.append(",").append(!Float.isNaN(this.mWeight) ? this.mWeight : 0.0f).append(",");
            if (!Float.isNaN(this.mPreMargin)) {
                f = this.mPreMargin;
            }
            ret.append(f).append(",");
            ret.append(this.mPostMargin);
        } else if (!Float.isNaN(this.mPreMargin)) {
            StringBuilder append = ret.append(",");
            if (!Float.isNaN(this.mWeight)) {
                f = this.mWeight;
            }
            append.append(f).append(",");
            ret.append(this.mPreMargin);
        } else if (!Float.isNaN(this.mWeight)) {
            ret.append(",").append(this.mWeight);
        }
        if (isArray) {
            ret.append("]");
        }
        ret.append(",");
        return ret.toString();
    }
}
