package androidx.constraintlayout.core.dsl;

import java.util.ArrayList;
import java.util.Iterator;

public class KeyFrames {
    ArrayList<Keys> mKeys = new ArrayList<>();

    public void add(Keys keyFrame) {
        this.mKeys.add(keyFrame);
    }

    public String toString() {
        StringBuilder ret = new StringBuilder();
        if (!this.mKeys.isEmpty()) {
            ret.append("keyFrames:{\n");
            Iterator<Keys> it = this.mKeys.iterator();
            while (it.hasNext()) {
                ret.append(it.next().toString());
            }
            ret.append("},\n");
        }
        return ret.toString();
    }
}
