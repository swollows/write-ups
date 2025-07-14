package androidx.constraintlayout.core.state;

import androidx.constraintlayout.core.motion.utils.TypedValues;
import androidx.constraintlayout.core.parser.CLArray;
import androidx.constraintlayout.core.parser.CLElement;
import androidx.constraintlayout.core.parser.CLNumber;
import androidx.constraintlayout.core.parser.CLObject;
import androidx.constraintlayout.core.parser.CLParser;
import androidx.constraintlayout.core.parser.CLParsingException;
import androidx.constraintlayout.core.parser.CLString;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;

public class ConstraintSetParser {
    private static final boolean PARSER_DEBUG = false;

    interface GeneratedValue {
        float value();
    }

    public enum MotionLayoutDebugFlags {
        NONE,
        SHOW_ALL,
        UNKNOWN
    }

    public static class DesignElement {
        String mId;
        HashMap<String, String> mParams;
        String mType;

        public String getId() {
            return this.mId;
        }

        public String getType() {
            return this.mType;
        }

        public HashMap<String, String> getParams() {
            return this.mParams;
        }

        DesignElement(String id, String type, HashMap<String, String> params) {
            this.mId = id;
            this.mType = type;
            this.mParams = params;
        }
    }

    public static class LayoutVariables {
        HashMap<String, ArrayList<String>> mArrayIds = new HashMap<>();
        HashMap<String, GeneratedValue> mGenerators = new HashMap<>();
        HashMap<String, Integer> mMargins = new HashMap<>();

        /* access modifiers changed from: package-private */
        public void put(String elementName, int element) {
            this.mMargins.put(elementName, Integer.valueOf(element));
        }

        /* access modifiers changed from: package-private */
        public void put(String elementName, float start, float incrementBy) {
            if (!this.mGenerators.containsKey(elementName) || !(this.mGenerators.get(elementName) instanceof OverrideValue)) {
                this.mGenerators.put(elementName, new Generator(start, incrementBy));
            }
        }

        /* access modifiers changed from: package-private */
        public void put(String elementName, float from, float to, float step, String prefix, String postfix) {
            if (!this.mGenerators.containsKey(elementName) || !(this.mGenerators.get(elementName) instanceof OverrideValue)) {
                FiniteGenerator finiteGenerator = new FiniteGenerator(from, to, step, prefix, postfix);
                this.mGenerators.put(elementName, finiteGenerator);
                this.mArrayIds.put(elementName, finiteGenerator.array());
            }
        }

        public void putOverride(String elementName, float value) {
            this.mGenerators.put(elementName, new OverrideValue(value));
        }

        /* access modifiers changed from: package-private */
        public float get(Object elementName) {
            if (elementName instanceof CLString) {
                String stringValue = ((CLString) elementName).content();
                if (this.mGenerators.containsKey(stringValue)) {
                    return this.mGenerators.get(stringValue).value();
                }
                if (this.mMargins.containsKey(stringValue)) {
                    return this.mMargins.get(stringValue).floatValue();
                }
                return 0.0f;
            } else if (elementName instanceof CLNumber) {
                return ((CLNumber) elementName).getFloat();
            } else {
                return 0.0f;
            }
        }

        /* access modifiers changed from: package-private */
        public ArrayList<String> getList(String elementName) {
            if (this.mArrayIds.containsKey(elementName)) {
                return this.mArrayIds.get(elementName);
            }
            return null;
        }

        /* access modifiers changed from: package-private */
        public void put(String elementName, ArrayList<String> elements) {
            this.mArrayIds.put(elementName, elements);
        }
    }

    static class Generator implements GeneratedValue {
        float mCurrent = 0.0f;
        float mIncrementBy = 0.0f;
        float mStart = 0.0f;
        boolean mStop = false;

        Generator(float start, float incrementBy) {
            this.mStart = start;
            this.mIncrementBy = incrementBy;
            this.mCurrent = start;
        }

        public float value() {
            if (!this.mStop) {
                this.mCurrent += this.mIncrementBy;
            }
            return this.mCurrent;
        }
    }

    static class FiniteGenerator implements GeneratedValue {
        float mCurrent = 0.0f;
        float mFrom = 0.0f;
        float mInitial;
        float mMax;
        String mPostfix;
        String mPrefix;
        float mStep = 0.0f;
        boolean mStop = false;
        float mTo = 0.0f;

        FiniteGenerator(float from, float to, float step, String prefix, String postfix) {
            this.mFrom = from;
            this.mTo = to;
            this.mStep = step;
            String str = "";
            this.mPrefix = prefix == null ? str : prefix;
            this.mPostfix = postfix != null ? postfix : str;
            this.mMax = to;
            this.mInitial = from;
        }

        public float value() {
            if (this.mCurrent >= this.mMax) {
                this.mStop = true;
            }
            if (!this.mStop) {
                this.mCurrent += this.mStep;
            }
            return this.mCurrent;
        }

        public ArrayList<String> array() {
            ArrayList<String> array = new ArrayList<>();
            int value = (int) this.mInitial;
            int maxInt = (int) this.mMax;
            for (int i = value; i <= maxInt; i++) {
                array.add(this.mPrefix + value + this.mPostfix);
                value += (int) this.mStep;
            }
            return array;
        }
    }

    static class OverrideValue implements GeneratedValue {
        float mValue;

        OverrideValue(float value) {
            this.mValue = value;
        }

        public float value() {
            return this.mValue;
        }
    }

    public static void parseJSON(String content, Transition transition, int state) {
        CLObject customProperties;
        Transition transition2 = transition;
        int i = state;
        try {
            CLObject json = CLParser.parse(content);
            ArrayList<String> elements = json.names();
            if (elements != null) {
                Iterator<String> it = elements.iterator();
                while (it.hasNext()) {
                    String elementName = it.next();
                    CLElement base_element = json.get(elementName);
                    if ((base_element instanceof CLObject) && (customProperties = ((CLObject) base_element).getObjectOrNull("custom")) != null) {
                        Iterator<String> it2 = customProperties.names().iterator();
                        while (it2.hasNext()) {
                            String property = it2.next();
                            CLElement value = customProperties.get(property);
                            if (value instanceof CLNumber) {
                                transition2.addCustomFloat(i, elementName, property, value.getFloat());
                            } else if (value instanceof CLString) {
                                long color = parseColorString(value.content());
                                if (color != -1) {
                                    transition2.addCustomColor(i, elementName, property, (int) color);
                                }
                            }
                        }
                    }
                }
            }
        } catch (CLParsingException e) {
            System.err.println("Error parsing JSON " + e);
        }
    }

    /* JADX WARNING: Can't fix incorrect switch cases order */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static void parseMotionSceneJSON(androidx.constraintlayout.core.state.CoreMotionScene r7, java.lang.String r8) {
        /*
            androidx.constraintlayout.core.parser.CLObject r0 = androidx.constraintlayout.core.parser.CLParser.parse(r8)     // Catch:{ CLParsingException -> 0x005f }
            java.util.ArrayList r1 = r0.names()     // Catch:{ CLParsingException -> 0x005f }
            if (r1 != 0) goto L_0x000b
            return
        L_0x000b:
            java.util.Iterator r2 = r1.iterator()     // Catch:{ CLParsingException -> 0x005f }
        L_0x000f:
            boolean r3 = r2.hasNext()     // Catch:{ CLParsingException -> 0x005f }
            if (r3 == 0) goto L_0x005e
            java.lang.Object r3 = r2.next()     // Catch:{ CLParsingException -> 0x005f }
            java.lang.String r3 = (java.lang.String) r3     // Catch:{ CLParsingException -> 0x005f }
            androidx.constraintlayout.core.parser.CLElement r4 = r0.get((java.lang.String) r3)     // Catch:{ CLParsingException -> 0x005f }
            boolean r5 = r4 instanceof androidx.constraintlayout.core.parser.CLObject     // Catch:{ CLParsingException -> 0x005f }
            if (r5 == 0) goto L_0x005d
            r5 = r4
            androidx.constraintlayout.core.parser.CLObject r5 = (androidx.constraintlayout.core.parser.CLObject) r5     // Catch:{ CLParsingException -> 0x005f }
            int r6 = r3.hashCode()     // Catch:{ CLParsingException -> 0x005f }
            switch(r6) {
                case -2137403731: goto L_0x0042;
                case -241441378: goto L_0x0038;
                case 1101852654: goto L_0x002e;
                default: goto L_0x002d;
            }     // Catch:{ CLParsingException -> 0x005f }
        L_0x002d:
            goto L_0x004c
        L_0x002e:
            java.lang.String r6 = "ConstraintSets"
            boolean r6 = r3.equals(r6)     // Catch:{ CLParsingException -> 0x005f }
            if (r6 == 0) goto L_0x002d
            r6 = 0
            goto L_0x004d
        L_0x0038:
            java.lang.String r6 = "Transitions"
            boolean r6 = r3.equals(r6)     // Catch:{ CLParsingException -> 0x005f }
            if (r6 == 0) goto L_0x002d
            r6 = 1
            goto L_0x004d
        L_0x0042:
            java.lang.String r6 = "Header"
            boolean r6 = r3.equals(r6)     // Catch:{ CLParsingException -> 0x005f }
            if (r6 == 0) goto L_0x002d
            r6 = 2
            goto L_0x004d
        L_0x004c:
            r6 = -1
        L_0x004d:
            switch(r6) {
                case 0: goto L_0x0059;
                case 1: goto L_0x0055;
                case 2: goto L_0x0051;
                default: goto L_0x0050;
            }     // Catch:{ CLParsingException -> 0x005f }
        L_0x0050:
            goto L_0x005d
        L_0x0051:
            parseHeader(r7, r5)     // Catch:{ CLParsingException -> 0x005f }
            goto L_0x005d
        L_0x0055:
            parseTransitions(r7, r5)     // Catch:{ CLParsingException -> 0x005f }
            goto L_0x005d
        L_0x0059:
            parseConstraintSets(r7, r5)     // Catch:{ CLParsingException -> 0x005f }
        L_0x005d:
            goto L_0x000f
        L_0x005e:
            goto L_0x0078
        L_0x005f:
            r0 = move-exception
            java.io.PrintStream r1 = java.lang.System.err
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            r2.<init>()
            java.lang.String r3 = "Error parsing JSON "
            java.lang.StringBuilder r2 = r2.append(r3)
            java.lang.StringBuilder r2 = r2.append(r0)
            java.lang.String r2 = r2.toString()
            r1.println(r2)
        L_0x0078:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.constraintlayout.core.state.ConstraintSetParser.parseMotionSceneJSON(androidx.constraintlayout.core.state.CoreMotionScene, java.lang.String):void");
    }

    static void parseConstraintSets(CoreMotionScene scene, CLObject json) throws CLParsingException {
        ArrayList<String> constraintSetNames = json.names();
        if (constraintSetNames != null) {
            Iterator<String> it = constraintSetNames.iterator();
            while (it.hasNext()) {
                String csName = it.next();
                CLObject constraintSet = json.getObject(csName);
                boolean added = false;
                String ext = constraintSet.getStringOrNull("Extends");
                if (ext != null && !ext.isEmpty()) {
                    String base = scene.getConstraintSet(ext);
                    if (base != null) {
                        CLObject baseJson = CLParser.parse(base);
                        ArrayList<String> widgetsOverride = constraintSet.names();
                        if (widgetsOverride != null) {
                            Iterator<String> it2 = widgetsOverride.iterator();
                            while (it2.hasNext()) {
                                String widgetOverrideName = it2.next();
                                CLElement value = constraintSet.get(widgetOverrideName);
                                if (value instanceof CLObject) {
                                    override(baseJson, widgetOverrideName, (CLObject) value);
                                }
                            }
                            scene.setConstraintSetContent(csName, baseJson.toJSON());
                            added = true;
                        }
                    }
                }
                if (!added) {
                    scene.setConstraintSetContent(csName, constraintSet.toJSON());
                }
            }
        }
    }

    /* JADX WARNING: Can't fix incorrect switch cases order */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    static void override(androidx.constraintlayout.core.parser.CLObject r8, java.lang.String r9, androidx.constraintlayout.core.parser.CLObject r10) throws androidx.constraintlayout.core.parser.CLParsingException {
        /*
            boolean r0 = r8.has(r9)
            if (r0 != 0) goto L_0x000b
            r8.put(r9, r10)
            goto L_0x00ef
        L_0x000b:
            androidx.constraintlayout.core.parser.CLObject r0 = r8.getObject((java.lang.String) r9)
            java.util.ArrayList r1 = r10.names()
            java.util.Iterator r2 = r1.iterator()
        L_0x0017:
            boolean r3 = r2.hasNext()
            if (r3 == 0) goto L_0x00ef
            java.lang.Object r3 = r2.next()
            java.lang.String r3 = (java.lang.String) r3
            java.lang.String r4 = "clear"
            boolean r5 = r3.equals(r4)
            if (r5 != 0) goto L_0x0033
            androidx.constraintlayout.core.parser.CLElement r4 = r10.get((java.lang.String) r3)
            r0.put(r3, r4)
            goto L_0x0017
        L_0x0033:
            androidx.constraintlayout.core.parser.CLArray r4 = r10.getArray((java.lang.String) r4)
            r5 = 0
        L_0x0038:
            int r6 = r4.size()
            if (r5 >= r6) goto L_0x00ed
            java.lang.String r6 = r4.getStringOrNull((int) r5)
            if (r6 != 0) goto L_0x0046
            goto L_0x00e9
        L_0x0046:
            int r7 = r6.hashCode()
            switch(r7) {
                case -1727069561: goto L_0x0062;
                case -1606703562: goto L_0x0058;
                case 414334925: goto L_0x004e;
                default: goto L_0x004d;
            }
        L_0x004d:
            goto L_0x006d
        L_0x004e:
            java.lang.String r7 = "dimensions"
            boolean r7 = r6.equals(r7)
            if (r7 == 0) goto L_0x004d
            r7 = 0
            goto L_0x006e
        L_0x0058:
            java.lang.String r7 = "constraints"
            boolean r7 = r6.equals(r7)
            if (r7 == 0) goto L_0x004d
            r7 = 1
            goto L_0x006e
        L_0x0062:
            java.lang.String r7 = "transforms"
            boolean r7 = r6.equals(r7)
            if (r7 == 0) goto L_0x004d
            r7 = 2
            goto L_0x006e
        L_0x006d:
            r7 = -1
        L_0x006e:
            switch(r7) {
                case 0: goto L_0x00dd;
                case 1: goto L_0x00b2;
                case 2: goto L_0x0075;
                default: goto L_0x0071;
            }
        L_0x0071:
            r0.remove(r6)
            goto L_0x00e9
        L_0x0075:
            java.lang.String r7 = "visibility"
            r0.remove(r7)
            java.lang.String r7 = "alpha"
            r0.remove(r7)
            java.lang.String r7 = "pivotX"
            r0.remove(r7)
            java.lang.String r7 = "pivotY"
            r0.remove(r7)
            java.lang.String r7 = "rotationX"
            r0.remove(r7)
            java.lang.String r7 = "rotationY"
            r0.remove(r7)
            java.lang.String r7 = "rotationZ"
            r0.remove(r7)
            java.lang.String r7 = "scaleX"
            r0.remove(r7)
            java.lang.String r7 = "scaleY"
            r0.remove(r7)
            java.lang.String r7 = "translationX"
            r0.remove(r7)
            java.lang.String r7 = "translationY"
            r0.remove(r7)
            goto L_0x00e9
        L_0x00b2:
            java.lang.String r7 = "start"
            r0.remove(r7)
            java.lang.String r7 = "end"
            r0.remove(r7)
            java.lang.String r7 = "top"
            r0.remove(r7)
            java.lang.String r7 = "bottom"
            r0.remove(r7)
            java.lang.String r7 = "baseline"
            r0.remove(r7)
            java.lang.String r7 = "center"
            r0.remove(r7)
            java.lang.String r7 = "centerHorizontally"
            r0.remove(r7)
            java.lang.String r7 = "centerVertically"
            r0.remove(r7)
            goto L_0x00e9
        L_0x00dd:
            java.lang.String r7 = "width"
            r0.remove(r7)
            java.lang.String r7 = "height"
            r0.remove(r7)
        L_0x00e9:
            int r5 = r5 + 1
            goto L_0x0038
        L_0x00ed:
            goto L_0x0017
        L_0x00ef:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.constraintlayout.core.state.ConstraintSetParser.override(androidx.constraintlayout.core.parser.CLObject, java.lang.String, androidx.constraintlayout.core.parser.CLObject):void");
    }

    static void parseTransitions(CoreMotionScene scene, CLObject json) throws CLParsingException {
        ArrayList<String> elements = json.names();
        if (elements != null) {
            Iterator<String> it = elements.iterator();
            while (it.hasNext()) {
                String elementName = it.next();
                scene.setTransitionContent(elementName, json.getObject(elementName).toJSON());
            }
        }
    }

    static void parseHeader(CoreMotionScene scene, CLObject json) {
        String name = json.getStringOrNull("export");
        if (name != null) {
            scene.setDebugName(name);
        }
    }

    public static void parseJSON(String content, State state, LayoutVariables layoutVariables) throws CLParsingException {
        try {
            populateState(CLParser.parse(content), state, layoutVariables);
        } catch (CLParsingException e) {
            System.err.println("Error parsing JSON " + e);
        }
    }

    /* JADX WARNING: Can't fix incorrect switch cases order */
    /* JADX WARNING: Code restructure failed: missing block: B:50:0x00bd, code lost:
        if (r4.equals("barrier") != false) goto L_0x00ec;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static void populateState(androidx.constraintlayout.core.parser.CLObject r10, androidx.constraintlayout.core.state.State r11, androidx.constraintlayout.core.state.ConstraintSetParser.LayoutVariables r12) throws androidx.constraintlayout.core.parser.CLParsingException {
        /*
            java.util.ArrayList r0 = r10.names()
            if (r0 != 0) goto L_0x0007
            return
        L_0x0007:
            java.util.Iterator r1 = r0.iterator()
        L_0x000b:
            boolean r2 = r1.hasNext()
            if (r2 == 0) goto L_0x0131
            java.lang.Object r2 = r1.next()
            java.lang.String r2 = (java.lang.String) r2
            androidx.constraintlayout.core.parser.CLElement r3 = r10.get((java.lang.String) r2)
            int r4 = r2.hashCode()
            r5 = 2
            r6 = -1
            r7 = 0
            r8 = 1
            switch(r4) {
                case -1824489883: goto L_0x003b;
                case 1875016085: goto L_0x0031;
                case 1921490263: goto L_0x0027;
                default: goto L_0x0026;
            }
        L_0x0026:
            goto L_0x0045
        L_0x0027:
            java.lang.String r4 = "Variables"
            boolean r4 = r2.equals(r4)
            if (r4 == 0) goto L_0x0026
            r4 = r7
            goto L_0x0046
        L_0x0031:
            java.lang.String r4 = "Generate"
            boolean r4 = r2.equals(r4)
            if (r4 == 0) goto L_0x0026
            r4 = r5
            goto L_0x0046
        L_0x003b:
            java.lang.String r4 = "Helpers"
            boolean r4 = r2.equals(r4)
            if (r4 == 0) goto L_0x0026
            r4 = r8
            goto L_0x0046
        L_0x0045:
            r4 = r6
        L_0x0046:
            switch(r4) {
                case 0: goto L_0x0077;
                case 1: goto L_0x006b;
                case 2: goto L_0x005f;
                default: goto L_0x0049;
            }
        L_0x0049:
            boolean r4 = r3 instanceof androidx.constraintlayout.core.parser.CLObject
            if (r4 == 0) goto L_0x0122
            r4 = r3
            androidx.constraintlayout.core.parser.CLObject r4 = (androidx.constraintlayout.core.parser.CLObject) r4
            java.lang.String r4 = lookForType(r4)
            if (r4 == 0) goto L_0x011b
            int r9 = r4.hashCode()
            switch(r9) {
                case -1785507558: goto L_0x00e0;
                case -1354837162: goto L_0x00d5;
                case -1252464839: goto L_0x00cb;
                case -851656725: goto L_0x00c0;
                case -333143113: goto L_0x00b7;
                case 113114: goto L_0x00ac;
                case 3181382: goto L_0x00a2;
                case 98238902: goto L_0x0098;
                case 111168196: goto L_0x008d;
                case 965681512: goto L_0x0083;
                default: goto L_0x005d;
            }
        L_0x005d:
            goto L_0x00eb
        L_0x005f:
            boolean r4 = r3 instanceof androidx.constraintlayout.core.parser.CLObject
            if (r4 == 0) goto L_0x012f
            r4 = r3
            androidx.constraintlayout.core.parser.CLObject r4 = (androidx.constraintlayout.core.parser.CLObject) r4
            parseGenerate(r11, r12, r4)
            goto L_0x012f
        L_0x006b:
            boolean r4 = r3 instanceof androidx.constraintlayout.core.parser.CLArray
            if (r4 == 0) goto L_0x012f
            r4 = r3
            androidx.constraintlayout.core.parser.CLArray r4 = (androidx.constraintlayout.core.parser.CLArray) r4
            parseHelpers(r11, r12, r4)
            goto L_0x012f
        L_0x0077:
            boolean r4 = r3 instanceof androidx.constraintlayout.core.parser.CLObject
            if (r4 == 0) goto L_0x012f
            r4 = r3
            androidx.constraintlayout.core.parser.CLObject r4 = (androidx.constraintlayout.core.parser.CLObject) r4
            parseVariables(r11, r12, r4)
            goto L_0x012f
        L_0x0083:
            java.lang.String r5 = "hGuideline"
            boolean r5 = r4.equals(r5)
            if (r5 == 0) goto L_0x005d
            r5 = r7
            goto L_0x00ec
        L_0x008d:
            java.lang.String r5 = "vFlow"
            boolean r5 = r4.equals(r5)
            if (r5 == 0) goto L_0x005d
            r5 = 5
            goto L_0x00ec
        L_0x0098:
            java.lang.String r5 = "hFlow"
            boolean r5 = r4.equals(r5)
            if (r5 == 0) goto L_0x005d
            r5 = 6
            goto L_0x00ec
        L_0x00a2:
            java.lang.String r5 = "grid"
            boolean r5 = r4.equals(r5)
            if (r5 == 0) goto L_0x005d
            r5 = 7
            goto L_0x00ec
        L_0x00ac:
            java.lang.String r5 = "row"
            boolean r5 = r4.equals(r5)
            if (r5 == 0) goto L_0x005d
            r5 = 8
            goto L_0x00ec
        L_0x00b7:
            java.lang.String r9 = "barrier"
            boolean r9 = r4.equals(r9)
            if (r9 == 0) goto L_0x005d
            goto L_0x00ec
        L_0x00c0:
            java.lang.String r5 = "vChain"
            boolean r5 = r4.equals(r5)
            if (r5 == 0) goto L_0x005d
            r5 = 3
            goto L_0x00ec
        L_0x00cb:
            java.lang.String r5 = "hChain"
            boolean r5 = r4.equals(r5)
            if (r5 == 0) goto L_0x005d
            r5 = 4
            goto L_0x00ec
        L_0x00d5:
            java.lang.String r5 = "column"
            boolean r5 = r4.equals(r5)
            if (r5 == 0) goto L_0x005d
            r5 = 9
            goto L_0x00ec
        L_0x00e0:
            java.lang.String r5 = "vGuideline"
            boolean r5 = r4.equals(r5)
            if (r5 == 0) goto L_0x005d
            r5 = r8
            goto L_0x00ec
        L_0x00eb:
            r5 = r6
        L_0x00ec:
            switch(r5) {
                case 0: goto L_0x0113;
                case 1: goto L_0x010c;
                case 2: goto L_0x0105;
                case 3: goto L_0x00fe;
                case 4: goto L_0x00fe;
                case 5: goto L_0x00f7;
                case 6: goto L_0x00f7;
                case 7: goto L_0x00f0;
                case 8: goto L_0x00f0;
                case 9: goto L_0x00f0;
                default: goto L_0x00ef;
            }
        L_0x00ef:
            goto L_0x011a
        L_0x00f0:
            r5 = r3
            androidx.constraintlayout.core.parser.CLObject r5 = (androidx.constraintlayout.core.parser.CLObject) r5
            parseGridType(r4, r11, r2, r12, r5)
            goto L_0x011a
        L_0x00f7:
            r5 = r3
            androidx.constraintlayout.core.parser.CLObject r5 = (androidx.constraintlayout.core.parser.CLObject) r5
            parseFlowType(r4, r11, r2, r12, r5)
            goto L_0x011a
        L_0x00fe:
            r5 = r3
            androidx.constraintlayout.core.parser.CLObject r5 = (androidx.constraintlayout.core.parser.CLObject) r5
            parseChainType(r4, r11, r2, r12, r5)
            goto L_0x011a
        L_0x0105:
            r5 = r3
            androidx.constraintlayout.core.parser.CLObject r5 = (androidx.constraintlayout.core.parser.CLObject) r5
            parseBarrier(r11, r2, r5)
            goto L_0x011a
        L_0x010c:
            r5 = r3
            androidx.constraintlayout.core.parser.CLObject r5 = (androidx.constraintlayout.core.parser.CLObject) r5
            parseGuidelineParams(r8, r11, r2, r5)
            goto L_0x011a
        L_0x0113:
            r5 = r3
            androidx.constraintlayout.core.parser.CLObject r5 = (androidx.constraintlayout.core.parser.CLObject) r5
            parseGuidelineParams(r7, r11, r2, r5)
        L_0x011a:
            goto L_0x012e
        L_0x011b:
            r5 = r3
            androidx.constraintlayout.core.parser.CLObject r5 = (androidx.constraintlayout.core.parser.CLObject) r5
            parseWidget((androidx.constraintlayout.core.state.State) r11, (androidx.constraintlayout.core.state.ConstraintSetParser.LayoutVariables) r12, (java.lang.String) r2, (androidx.constraintlayout.core.parser.CLObject) r5)
            goto L_0x012e
        L_0x0122:
            boolean r4 = r3 instanceof androidx.constraintlayout.core.parser.CLNumber
            if (r4 == 0) goto L_0x012e
            int r4 = r3.getInt()
            r12.put((java.lang.String) r2, (int) r4)
            goto L_0x012f
        L_0x012e:
        L_0x012f:
            goto L_0x000b
        L_0x0131:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.constraintlayout.core.state.ConstraintSetParser.populateState(androidx.constraintlayout.core.parser.CLObject, androidx.constraintlayout.core.state.State, androidx.constraintlayout.core.state.ConstraintSetParser$LayoutVariables):void");
    }

    private static void parseVariables(State state, LayoutVariables layoutVariables, CLObject json) throws CLParsingException {
        LayoutVariables layoutVariables2 = layoutVariables;
        ArrayList<String> elements = json.names();
        if (elements != null) {
            Iterator<String> it = elements.iterator();
            while (it.hasNext()) {
                String elementName = it.next();
                CLElement element = json.get(elementName);
                if (element instanceof CLNumber) {
                    layoutVariables2.put(elementName, element.getInt());
                    State state2 = state;
                } else if (element instanceof CLObject) {
                    CLObject obj = (CLObject) element;
                    if (obj.has(TypedValues.TransitionType.S_FROM) && obj.has(TypedValues.TransitionType.S_TO)) {
                        layoutVariables.put(elementName, layoutVariables2.get(obj.get(TypedValues.TransitionType.S_FROM)), layoutVariables2.get(obj.get(TypedValues.TransitionType.S_TO)), 1.0f, obj.getStringOrNull("prefix"), obj.getStringOrNull("postfix"));
                        State state3 = state;
                    } else if (obj.has(TypedValues.TransitionType.S_FROM) && obj.has("step")) {
                        layoutVariables2.put(elementName, layoutVariables2.get(obj.get(TypedValues.TransitionType.S_FROM)), layoutVariables2.get(obj.get("step")));
                        State state4 = state;
                    } else if (obj.has("ids")) {
                        CLArray ids = obj.getArray("ids");
                        ArrayList<String> arrayIds = new ArrayList<>();
                        for (int i = 0; i < ids.size(); i++) {
                            arrayIds.add(ids.getString(i));
                        }
                        layoutVariables2.put(elementName, arrayIds);
                        State state5 = state;
                    } else if (obj.has("tag")) {
                        layoutVariables2.put(elementName, state.getIdsForTag(obj.getString("tag")));
                    } else {
                        State state6 = state;
                    }
                } else {
                    State state7 = state;
                }
            }
            State state8 = state;
            CLObject cLObject = json;
        }
    }

    /* JADX WARNING: Can't fix incorrect switch cases order */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static void parseDesignElementsJSON(java.lang.String r17, java.util.ArrayList<androidx.constraintlayout.core.state.ConstraintSetParser.DesignElement> r18) throws androidx.constraintlayout.core.parser.CLParsingException {
        /*
            androidx.constraintlayout.core.parser.CLObject r0 = androidx.constraintlayout.core.parser.CLParser.parse(r17)
            java.util.ArrayList r1 = r0.names()
            if (r1 != 0) goto L_0x000b
            return
        L_0x000b:
            r2 = 0
            int r3 = r1.size()
            if (r2 >= r3) goto L_0x00bd
            java.lang.Object r3 = r1.get(r2)
            java.lang.String r3 = (java.lang.String) r3
            androidx.constraintlayout.core.parser.CLElement r4 = r0.get((java.lang.String) r3)
            int r5 = r3.hashCode()
            r6 = 0
            switch(r5) {
                case 2043588062: goto L_0x0025;
                default: goto L_0x0024;
            }
        L_0x0024:
            goto L_0x002f
        L_0x0025:
            java.lang.String r5 = "Design"
            boolean r5 = r3.equals(r5)
            if (r5 == 0) goto L_0x0024
            r5 = r6
            goto L_0x0030
        L_0x002f:
            r5 = -1
        L_0x0030:
            switch(r5) {
                case 0: goto L_0x0037;
                default: goto L_0x0033;
            }
        L_0x0033:
            r13 = r18
            goto L_0x00bc
        L_0x0037:
            boolean r5 = r4 instanceof androidx.constraintlayout.core.parser.CLObject
            if (r5 != 0) goto L_0x003c
            return
        L_0x003c:
            r5 = r4
            androidx.constraintlayout.core.parser.CLObject r5 = (androidx.constraintlayout.core.parser.CLObject) r5
            java.util.ArrayList r1 = r5.names()
            r7 = 0
        L_0x0044:
            int r8 = r1.size()
            if (r7 >= r8) goto L_0x00ba
            java.lang.Object r8 = r1.get(r7)
            java.lang.String r8 = (java.lang.String) r8
            r9 = r4
            androidx.constraintlayout.core.parser.CLObject r9 = (androidx.constraintlayout.core.parser.CLObject) r9
            androidx.constraintlayout.core.parser.CLElement r9 = r9.get((java.lang.String) r8)
            androidx.constraintlayout.core.parser.CLObject r9 = (androidx.constraintlayout.core.parser.CLObject) r9
            java.io.PrintStream r10 = java.lang.System.out
            java.lang.StringBuilder r11 = new java.lang.StringBuilder
            r11.<init>()
            java.lang.String r12 = "element found "
            java.lang.StringBuilder r11 = r11.append(r12)
            java.lang.StringBuilder r11 = r11.append(r8)
            java.lang.String r12 = ""
            java.lang.StringBuilder r11 = r11.append(r12)
            java.lang.String r11 = r11.toString()
            java.lang.Object[] r12 = new java.lang.Object[r6]
            r10.printf(r11, r12)
            java.lang.String r10 = "type"
            java.lang.String r10 = r9.getStringOrNull((java.lang.String) r10)
            if (r10 == 0) goto L_0x00b4
            java.util.HashMap r11 = new java.util.HashMap
            r11.<init>()
            int r12 = r9.size()
            r13 = 0
        L_0x008c:
            if (r13 >= r12) goto L_0x00a9
            androidx.constraintlayout.core.parser.CLElement r14 = r9.get((int) r7)
            androidx.constraintlayout.core.parser.CLKey r14 = (androidx.constraintlayout.core.parser.CLKey) r14
            java.lang.String r15 = r14.content()
            androidx.constraintlayout.core.parser.CLElement r16 = r14.getValue()
            java.lang.String r6 = r16.content()
            if (r6 == 0) goto L_0x00a5
            r11.put(r15, r6)
        L_0x00a5:
            int r13 = r13 + 1
            r6 = 0
            goto L_0x008c
        L_0x00a9:
            androidx.constraintlayout.core.state.ConstraintSetParser$DesignElement r6 = new androidx.constraintlayout.core.state.ConstraintSetParser$DesignElement
            r6.<init>(r3, r10, r11)
            r13 = r18
            r13.add(r6)
            goto L_0x00b6
        L_0x00b4:
            r13 = r18
        L_0x00b6:
            int r7 = r7 + 1
            r6 = 0
            goto L_0x0044
        L_0x00ba:
            r13 = r18
        L_0x00bc:
            goto L_0x00bf
        L_0x00bd:
            r13 = r18
        L_0x00bf:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.constraintlayout.core.state.ConstraintSetParser.parseDesignElementsJSON(java.lang.String, java.util.ArrayList):void");
    }

    /* JADX WARNING: Can't fix incorrect switch cases order */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    static void parseHelpers(androidx.constraintlayout.core.state.State r7, androidx.constraintlayout.core.state.ConstraintSetParser.LayoutVariables r8, androidx.constraintlayout.core.parser.CLArray r9) throws androidx.constraintlayout.core.parser.CLParsingException {
        /*
            r0 = 0
        L_0x0001:
            int r1 = r9.size()
            if (r0 >= r1) goto L_0x0068
            androidx.constraintlayout.core.parser.CLElement r1 = r9.get((int) r0)
            boolean r2 = r1 instanceof androidx.constraintlayout.core.parser.CLArray
            if (r2 == 0) goto L_0x0065
            r2 = r1
            androidx.constraintlayout.core.parser.CLArray r2 = (androidx.constraintlayout.core.parser.CLArray) r2
            int r3 = r2.size()
            r4 = 1
            if (r3 <= r4) goto L_0x0065
            r3 = 0
            java.lang.String r5 = r2.getString((int) r3)
            int r6 = r5.hashCode()
            switch(r6) {
                case -1785507558: goto L_0x0045;
                case -1252464839: goto L_0x003b;
                case -851656725: goto L_0x0030;
                case 965681512: goto L_0x0026;
                default: goto L_0x0025;
            }
        L_0x0025:
            goto L_0x0050
        L_0x0026:
            java.lang.String r6 = "hGuideline"
            boolean r5 = r5.equals(r6)
            if (r5 == 0) goto L_0x0025
            r5 = 2
            goto L_0x0051
        L_0x0030:
            java.lang.String r6 = "vChain"
            boolean r5 = r5.equals(r6)
            if (r5 == 0) goto L_0x0025
            r5 = r4
            goto L_0x0051
        L_0x003b:
            java.lang.String r6 = "hChain"
            boolean r5 = r5.equals(r6)
            if (r5 == 0) goto L_0x0025
            r5 = r3
            goto L_0x0051
        L_0x0045:
            java.lang.String r6 = "vGuideline"
            boolean r5 = r5.equals(r6)
            if (r5 == 0) goto L_0x0025
            r5 = 3
            goto L_0x0051
        L_0x0050:
            r5 = -1
        L_0x0051:
            switch(r5) {
                case 0: goto L_0x0061;
                case 1: goto L_0x005d;
                case 2: goto L_0x0059;
                case 3: goto L_0x0055;
                default: goto L_0x0054;
            }
        L_0x0054:
            goto L_0x0065
        L_0x0055:
            parseGuideline(r4, r7, r2)
            goto L_0x0065
        L_0x0059:
            parseGuideline(r3, r7, r2)
            goto L_0x0065
        L_0x005d:
            parseChain(r4, r7, r8, r2)
            goto L_0x0065
        L_0x0061:
            parseChain(r3, r7, r8, r2)
        L_0x0065:
            int r0 = r0 + 1
            goto L_0x0001
        L_0x0068:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.constraintlayout.core.state.ConstraintSetParser.parseHelpers(androidx.constraintlayout.core.state.State, androidx.constraintlayout.core.state.ConstraintSetParser$LayoutVariables, androidx.constraintlayout.core.parser.CLArray):void");
    }

    static void parseGenerate(State state, LayoutVariables layoutVariables, CLObject json) throws CLParsingException {
        ArrayList<String> elements = json.names();
        if (elements != null) {
            Iterator<String> it = elements.iterator();
            while (it.hasNext()) {
                String elementName = it.next();
                CLElement element = json.get(elementName);
                ArrayList<String> arrayIds = layoutVariables.getList(elementName);
                if (arrayIds != null && (element instanceof CLObject)) {
                    Iterator<String> it2 = arrayIds.iterator();
                    while (it2.hasNext()) {
                        parseWidget(state, layoutVariables, it2.next(), (CLObject) element);
                    }
                }
            }
        }
    }

    /* JADX WARNING: Can't fix incorrect switch cases order */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    static void parseChain(int r14, androidx.constraintlayout.core.state.State r15, androidx.constraintlayout.core.state.ConstraintSetParser.LayoutVariables r16, androidx.constraintlayout.core.parser.CLArray r17) throws androidx.constraintlayout.core.parser.CLParsingException {
        /*
            r0 = r17
            if (r14 != 0) goto L_0x0009
            androidx.constraintlayout.core.state.helpers.HorizontalChainReference r1 = r15.horizontalChain()
            goto L_0x000d
        L_0x0009:
            androidx.constraintlayout.core.state.helpers.VerticalChainReference r1 = r15.verticalChain()
        L_0x000d:
            r2 = 1
            androidx.constraintlayout.core.parser.CLElement r3 = r0.get((int) r2)
            boolean r4 = r3 instanceof androidx.constraintlayout.core.parser.CLArray
            if (r4 == 0) goto L_0x00f1
            r4 = r3
            androidx.constraintlayout.core.parser.CLArray r4 = (androidx.constraintlayout.core.parser.CLArray) r4
            int r4 = r4.size()
            if (r4 >= r2) goto L_0x0024
            r10 = r15
            r11 = r16
            goto L_0x00f4
        L_0x0024:
            r4 = 0
        L_0x0025:
            r5 = r3
            androidx.constraintlayout.core.parser.CLArray r5 = (androidx.constraintlayout.core.parser.CLArray) r5
            int r5 = r5.size()
            if (r4 >= r5) goto L_0x003f
            r5 = r3
            androidx.constraintlayout.core.parser.CLArray r5 = (androidx.constraintlayout.core.parser.CLArray) r5
            java.lang.String r5 = r5.getString((int) r4)
            java.lang.Object[] r5 = new java.lang.Object[]{r5}
            r1.add(r5)
            int r4 = r4 + 1
            goto L_0x0025
        L_0x003f:
            int r4 = r17.size()
            r5 = 2
            if (r4 <= r5) goto L_0x00ed
            androidx.constraintlayout.core.parser.CLElement r4 = r0.get((int) r5)
            boolean r5 = r4 instanceof androidx.constraintlayout.core.parser.CLObject
            if (r5 != 0) goto L_0x004f
            return
        L_0x004f:
            r5 = r4
            androidx.constraintlayout.core.parser.CLObject r5 = (androidx.constraintlayout.core.parser.CLObject) r5
            java.util.ArrayList r6 = r5.names()
            java.util.Iterator r7 = r6.iterator()
        L_0x005a:
            boolean r8 = r7.hasNext()
            if (r8 == 0) goto L_0x00e9
            java.lang.Object r8 = r7.next()
            java.lang.String r8 = (java.lang.String) r8
            int r9 = r8.hashCode()
            r10 = -1
            r11 = 0
            switch(r9) {
                case 109780401: goto L_0x0070;
                default: goto L_0x006f;
            }
        L_0x006f:
            goto L_0x007b
        L_0x0070:
            java.lang.String r9 = "style"
            boolean r9 = r8.equals(r9)
            if (r9 == 0) goto L_0x006f
            r9 = r11
            goto L_0x007c
        L_0x007b:
            r9 = r10
        L_0x007c:
            switch(r9) {
                case 0: goto L_0x0089;
                default: goto L_0x007f;
            }
        L_0x007f:
            r9 = r4
            androidx.constraintlayout.core.parser.CLObject r9 = (androidx.constraintlayout.core.parser.CLObject) r9
            r10 = r15
            r11 = r16
            parseConstraint(r15, r11, r9, r1, r8)
            goto L_0x00e7
        L_0x0089:
            r9 = r4
            androidx.constraintlayout.core.parser.CLObject r9 = (androidx.constraintlayout.core.parser.CLObject) r9
            androidx.constraintlayout.core.parser.CLElement r9 = r9.get((java.lang.String) r8)
            boolean r12 = r9 instanceof androidx.constraintlayout.core.parser.CLArray
            if (r12 == 0) goto L_0x00af
            r12 = r9
            androidx.constraintlayout.core.parser.CLArray r12 = (androidx.constraintlayout.core.parser.CLArray) r12
            int r12 = r12.size()
            if (r12 <= r2) goto L_0x00af
            r12 = r9
            androidx.constraintlayout.core.parser.CLArray r12 = (androidx.constraintlayout.core.parser.CLArray) r12
            java.lang.String r12 = r12.getString((int) r11)
            r13 = r9
            androidx.constraintlayout.core.parser.CLArray r13 = (androidx.constraintlayout.core.parser.CLArray) r13
            float r13 = r13.getFloat((int) r2)
            r1.bias((float) r13)
            goto L_0x00b3
        L_0x00af:
            java.lang.String r12 = r9.content()
        L_0x00b3:
            int r13 = r12.hashCode()
            switch(r13) {
                case -995865480: goto L_0x00c6;
                case 1311368264: goto L_0x00bb;
                default: goto L_0x00ba;
            }
        L_0x00ba:
            goto L_0x00cf
        L_0x00bb:
            java.lang.String r11 = "spread_inside"
            boolean r11 = r12.equals(r11)
            if (r11 == 0) goto L_0x00ba
            r10 = r2
            goto L_0x00cf
        L_0x00c6:
            java.lang.String r13 = "packed"
            boolean r13 = r12.equals(r13)
            if (r13 == 0) goto L_0x00ba
            r10 = r11
        L_0x00cf:
            switch(r10) {
                case 0: goto L_0x00de;
                case 1: goto L_0x00d8;
                default: goto L_0x00d2;
            }
        L_0x00d2:
            androidx.constraintlayout.core.state.State$Chain r10 = androidx.constraintlayout.core.state.State.Chain.SPREAD
            r1.style(r10)
            goto L_0x00e4
        L_0x00d8:
            androidx.constraintlayout.core.state.State$Chain r10 = androidx.constraintlayout.core.state.State.Chain.SPREAD_INSIDE
            r1.style(r10)
            goto L_0x00e4
        L_0x00de:
            androidx.constraintlayout.core.state.State$Chain r10 = androidx.constraintlayout.core.state.State.Chain.PACKED
            r1.style(r10)
        L_0x00e4:
            r10 = r15
            r11 = r16
        L_0x00e7:
            goto L_0x005a
        L_0x00e9:
            r10 = r15
            r11 = r16
            goto L_0x00f0
        L_0x00ed:
            r10 = r15
            r11 = r16
        L_0x00f0:
            return
        L_0x00f1:
            r10 = r15
            r11 = r16
        L_0x00f4:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.constraintlayout.core.state.ConstraintSetParser.parseChain(int, androidx.constraintlayout.core.state.State, androidx.constraintlayout.core.state.ConstraintSetParser$LayoutVariables, androidx.constraintlayout.core.parser.CLArray):void");
    }

    private static float toPix(State state, float dp) {
        return state.getDpToPixel().toPixels(dp);
    }

    /* JADX WARNING: Can't fix incorrect switch cases order */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private static void parseChainType(java.lang.String r30, androidx.constraintlayout.core.state.State r31, java.lang.String r32, androidx.constraintlayout.core.state.ConstraintSetParser.LayoutVariables r33, androidx.constraintlayout.core.parser.CLObject r34) throws androidx.constraintlayout.core.parser.CLParsingException {
        /*
            r0 = r31
            r1 = r32
            r2 = r34
            r3 = 0
            r4 = r30
            char r5 = r4.charAt(r3)
            r6 = 104(0x68, float:1.46E-43)
            if (r5 != r6) goto L_0x0016
            androidx.constraintlayout.core.state.helpers.HorizontalChainReference r5 = r31.horizontalChain()
            goto L_0x001a
        L_0x0016:
            androidx.constraintlayout.core.state.helpers.VerticalChainReference r5 = r31.verticalChain()
        L_0x001a:
            r5.setKey(r1)
            java.util.ArrayList r6 = r34.names()
            java.util.Iterator r13 = r6.iterator()
        L_0x0025:
            boolean r6 = r13.hasNext()
            if (r6 == 0) goto L_0x0229
            java.lang.Object r6 = r13.next()
            r14 = r6
            java.lang.String r14 = (java.lang.String) r14
            int r6 = r14.hashCode()
            r7 = -1
            r11 = 3
            r10 = 2
            r9 = 1
            switch(r6) {
                case -1383228885: goto L_0x0087;
                case -567445985: goto L_0x007d;
                case 100571: goto L_0x0073;
                case 115029: goto L_0x0068;
                case 3317767: goto L_0x005e;
                case 108511772: goto L_0x0054;
                case 109757538: goto L_0x0049;
                case 109780401: goto L_0x003e;
                default: goto L_0x003d;
            }
        L_0x003d:
            goto L_0x0091
        L_0x003e:
            java.lang.String r6 = "style"
            boolean r6 = r14.equals(r6)
            if (r6 == 0) goto L_0x003d
            r6 = 7
            goto L_0x0092
        L_0x0049:
            java.lang.String r6 = "start"
            boolean r6 = r14.equals(r6)
            if (r6 == 0) goto L_0x003d
            r6 = r9
            goto L_0x0092
        L_0x0054:
            java.lang.String r6 = "right"
            boolean r6 = r14.equals(r6)
            if (r6 == 0) goto L_0x003d
            r6 = 6
            goto L_0x0092
        L_0x005e:
            java.lang.String r6 = "left"
            boolean r6 = r14.equals(r6)
            if (r6 == 0) goto L_0x003d
            r6 = 5
            goto L_0x0092
        L_0x0068:
            java.lang.String r6 = "top"
            boolean r6 = r14.equals(r6)
            if (r6 == 0) goto L_0x003d
            r6 = r11
            goto L_0x0092
        L_0x0073:
            java.lang.String r6 = "end"
            boolean r6 = r14.equals(r6)
            if (r6 == 0) goto L_0x003d
            r6 = r10
            goto L_0x0092
        L_0x007d:
            java.lang.String r6 = "contains"
            boolean r6 = r14.equals(r6)
            if (r6 == 0) goto L_0x003d
            r6 = r3
            goto L_0x0092
        L_0x0087:
            java.lang.String r6 = "bottom"
            boolean r6 = r14.equals(r6)
            if (r6 == 0) goto L_0x003d
            r6 = 4
            goto L_0x0092
        L_0x0091:
            r6 = r7
        L_0x0092:
            switch(r6) {
                case 0: goto L_0x00f9;
                case 1: goto L_0x00f2;
                case 2: goto L_0x00f2;
                case 3: goto L_0x00f2;
                case 4: goto L_0x00f2;
                case 5: goto L_0x00f2;
                case 6: goto L_0x00f2;
                case 7: goto L_0x0097;
                default: goto L_0x0095;
            }
        L_0x0095:
            goto L_0x0226
        L_0x0097:
            androidx.constraintlayout.core.parser.CLElement r6 = r2.get((java.lang.String) r14)
            boolean r8 = r6 instanceof androidx.constraintlayout.core.parser.CLArray
            if (r8 == 0) goto L_0x00ba
            r8 = r6
            androidx.constraintlayout.core.parser.CLArray r8 = (androidx.constraintlayout.core.parser.CLArray) r8
            int r8 = r8.size()
            if (r8 <= r9) goto L_0x00ba
            r8 = r6
            androidx.constraintlayout.core.parser.CLArray r8 = (androidx.constraintlayout.core.parser.CLArray) r8
            java.lang.String r8 = r8.getString((int) r3)
            r10 = r6
            androidx.constraintlayout.core.parser.CLArray r10 = (androidx.constraintlayout.core.parser.CLArray) r10
            float r10 = r10.getFloat((int) r9)
            r5.bias((float) r10)
            goto L_0x00be
        L_0x00ba:
            java.lang.String r8 = r6.content()
        L_0x00be:
            int r10 = r8.hashCode()
            switch(r10) {
                case -995865480: goto L_0x00d1;
                case 1311368264: goto L_0x00c6;
                default: goto L_0x00c5;
            }
        L_0x00c5:
            goto L_0x00da
        L_0x00c6:
            java.lang.String r10 = "spread_inside"
            boolean r10 = r8.equals(r10)
            if (r10 == 0) goto L_0x00c5
            r7 = r9
            goto L_0x00da
        L_0x00d1:
            java.lang.String r9 = "packed"
            boolean r9 = r8.equals(r9)
            if (r9 == 0) goto L_0x00c5
            r7 = r3
        L_0x00da:
            switch(r7) {
                case 0: goto L_0x00eb;
                case 1: goto L_0x00e4;
                default: goto L_0x00dd;
            }
        L_0x00dd:
            androidx.constraintlayout.core.state.State$Chain r7 = androidx.constraintlayout.core.state.State.Chain.SPREAD
            r5.style(r7)
            goto L_0x0226
        L_0x00e4:
            androidx.constraintlayout.core.state.State$Chain r7 = androidx.constraintlayout.core.state.State.Chain.SPREAD_INSIDE
            r5.style(r7)
            goto L_0x0226
        L_0x00eb:
            androidx.constraintlayout.core.state.State$Chain r7 = androidx.constraintlayout.core.state.State.Chain.PACKED
            r5.style(r7)
            goto L_0x0226
        L_0x00f2:
            r8 = r33
            parseConstraint(r0, r8, r2, r5, r14)
            goto L_0x0226
        L_0x00f9:
            r8 = r33
            androidx.constraintlayout.core.parser.CLElement r7 = r2.get((java.lang.String) r14)
            boolean r6 = r7 instanceof androidx.constraintlayout.core.parser.CLArray
            if (r6 == 0) goto L_0x01fd
            r6 = r7
            androidx.constraintlayout.core.parser.CLArray r6 = (androidx.constraintlayout.core.parser.CLArray) r6
            int r6 = r6.size()
            if (r6 >= r9) goto L_0x0110
            r26 = r7
            goto L_0x01ff
        L_0x0110:
            r6 = 0
        L_0x0111:
            r16 = r7
            androidx.constraintlayout.core.parser.CLArray r16 = (androidx.constraintlayout.core.parser.CLArray) r16
            int r15 = r16.size()
            if (r6 >= r15) goto L_0x01f8
            r15 = r7
            androidx.constraintlayout.core.parser.CLArray r15 = (androidx.constraintlayout.core.parser.CLArray) r15
            androidx.constraintlayout.core.parser.CLElement r15 = r15.get((int) r6)
            boolean r12 = r15 instanceof androidx.constraintlayout.core.parser.CLArray
            if (r12 == 0) goto L_0x01d1
            r12 = r15
            androidx.constraintlayout.core.parser.CLArray r12 = (androidx.constraintlayout.core.parser.CLArray) r12
            int r18 = r12.size()
            if (r18 <= 0) goto L_0x01c1
            androidx.constraintlayout.core.parser.CLElement r18 = r12.get((int) r3)
            java.lang.String r18 = r18.content()
            r19 = 2143289344(0x7fc00000, float:NaN)
            r20 = 2143289344(0x7fc00000, float:NaN)
            r21 = 2143289344(0x7fc00000, float:NaN)
            r22 = 2143289344(0x7fc00000, float:NaN)
            r23 = 2143289344(0x7fc00000, float:NaN)
            int r24 = r12.size()
            switch(r24) {
                case 2: goto L_0x019b;
                case 3: goto L_0x0189;
                case 4: goto L_0x0172;
                case 5: goto L_0x0148;
                case 6: goto L_0x014a;
                default: goto L_0x0148;
            }
        L_0x0148:
            r3 = r11
            goto L_0x01a1
        L_0x014a:
            float r19 = r12.getFloat((int) r9)
            float r3 = r12.getFloat((int) r10)
            float r20 = toPix(r0, r3)
            float r3 = r12.getFloat((int) r11)
            float r21 = toPix(r0, r3)
            r3 = 4
            float r11 = r12.getFloat((int) r3)
            float r22 = toPix(r0, r11)
            r11 = 5
            float r3 = r12.getFloat((int) r11)
            float r23 = toPix(r0, r3)
            r3 = 3
            goto L_0x01a1
        L_0x0172:
            r11 = 5
            float r19 = r12.getFloat((int) r9)
            float r3 = r12.getFloat((int) r10)
            float r20 = toPix(r0, r3)
            r3 = 3
            float r11 = r12.getFloat((int) r3)
            float r21 = toPix(r0, r11)
            goto L_0x01a1
        L_0x0189:
            r3 = r11
            float r19 = r12.getFloat((int) r9)
            float r11 = r12.getFloat((int) r10)
            float r11 = toPix(r0, r11)
            r20 = r11
            r21 = r11
            goto L_0x01a1
        L_0x019b:
            r3 = r11
            float r19 = r12.getFloat((int) r9)
        L_0x01a1:
            r25 = r6
            r6 = r5
            r26 = r7
            r7 = r18
            r8 = r19
            r27 = r9
            r9 = r20
            r28 = r10
            r10 = r21
            r16 = r3
            r3 = 5
            r11 = r22
            r17 = r12
            r29 = 4
            r12 = r23
            r6.addChainElement(r7, r8, r9, r10, r11, r12)
            goto L_0x01d0
        L_0x01c1:
            r25 = r6
            r26 = r7
            r27 = r9
            r28 = r10
            r16 = r11
            r17 = r12
            r3 = 5
            r29 = 4
        L_0x01d0:
            goto L_0x01e9
        L_0x01d1:
            r25 = r6
            r26 = r7
            r27 = r9
            r28 = r10
            r16 = r11
            r3 = 5
            r29 = 4
            java.lang.String r6 = r15.content()
            java.lang.Object[] r6 = new java.lang.Object[]{r6}
            r5.add(r6)
        L_0x01e9:
            int r6 = r25 + 1
            r8 = r33
            r11 = r16
            r7 = r26
            r9 = r27
            r10 = r28
            r3 = 0
            goto L_0x0111
        L_0x01f8:
            r25 = r6
            r26 = r7
            goto L_0x0226
        L_0x01fd:
            r26 = r7
        L_0x01ff:
            java.io.PrintStream r3 = java.lang.System.err
            java.lang.StringBuilder r6 = new java.lang.StringBuilder
            r6.<init>()
            java.lang.StringBuilder r6 = r6.append(r1)
            java.lang.String r7 = " contains should be an array \""
            java.lang.StringBuilder r6 = r6.append(r7)
            java.lang.String r7 = r26.content()
            java.lang.StringBuilder r6 = r6.append(r7)
            java.lang.String r7 = "\""
            java.lang.StringBuilder r6 = r6.append(r7)
            java.lang.String r6 = r6.toString()
            r3.println(r6)
            return
        L_0x0226:
            r3 = 0
            goto L_0x0025
        L_0x0229:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.constraintlayout.core.state.ConstraintSetParser.parseChainType(java.lang.String, androidx.constraintlayout.core.state.State, java.lang.String, androidx.constraintlayout.core.state.ConstraintSetParser$LayoutVariables, androidx.constraintlayout.core.parser.CLObject):void");
    }

    /* JADX WARNING: Can't fix incorrect switch cases order */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private static void parseGridType(java.lang.String r16, androidx.constraintlayout.core.state.State r17, java.lang.String r18, androidx.constraintlayout.core.state.ConstraintSetParser.LayoutVariables r19, androidx.constraintlayout.core.parser.CLObject r20) throws androidx.constraintlayout.core.parser.CLParsingException {
        /*
            r1 = r17
            r2 = r20
            r3 = r16
            r4 = r18
            androidx.constraintlayout.core.state.helpers.GridReference r5 = r1.getGrid(r4, r3)
            java.util.ArrayList r0 = r20.names()
            java.util.Iterator r6 = r0.iterator()
        L_0x0014:
            boolean r0 = r6.hasNext()
            if (r0 == 0) goto L_0x0276
            java.lang.Object r0 = r6.next()
            r7 = r0
            java.lang.String r7 = (java.lang.String) r7
            int r0 = r7.hashCode()
            r9 = 0
            r10 = 2
            r11 = 1
            switch(r0) {
                case -1439500848: goto L_0x00a5;
                case -806339567: goto L_0x009a;
                case -567445985: goto L_0x0090;
                case 3169614: goto L_0x0086;
                case 3506649: goto L_0x007c;
                case 3586688: goto L_0x0071;
                case 97513095: goto L_0x0066;
                case 109497044: goto L_0x005b;
                case 109638249: goto L_0x0050;
                case 144441793: goto L_0x0044;
                case 949721053: goto L_0x0039;
                case 2033353925: goto L_0x002d;
                default: goto L_0x002b;
            }
        L_0x002b:
            goto L_0x00af
        L_0x002d:
            java.lang.String r0 = "columnWeights"
            boolean r0 = r7.equals(r0)
            if (r0 == 0) goto L_0x002b
            r0 = 9
            goto L_0x00b0
        L_0x0039:
            java.lang.String r0 = "columns"
            boolean r0 = r7.equals(r0)
            if (r0 == 0) goto L_0x002b
            r0 = 3
            goto L_0x00b0
        L_0x0044:
            java.lang.String r0 = "rowWeights"
            boolean r0 = r7.equals(r0)
            if (r0 == 0) goto L_0x002b
            r0 = 8
            goto L_0x00b0
        L_0x0050:
            java.lang.String r0 = "spans"
            boolean r0 = r7.equals(r0)
            if (r0 == 0) goto L_0x002b
            r0 = 6
            goto L_0x00b0
        L_0x005b:
            java.lang.String r0 = "skips"
            boolean r0 = r7.equals(r0)
            if (r0 == 0) goto L_0x002b
            r0 = 7
            goto L_0x00b0
        L_0x0066:
            java.lang.String r0 = "flags"
            boolean r0 = r7.equals(r0)
            if (r0 == 0) goto L_0x002b
            r0 = 11
            goto L_0x00b0
        L_0x0071:
            java.lang.String r0 = "vGap"
            boolean r0 = r7.equals(r0)
            if (r0 == 0) goto L_0x002b
            r0 = 5
            goto L_0x00b0
        L_0x007c:
            java.lang.String r0 = "rows"
            boolean r0 = r7.equals(r0)
            if (r0 == 0) goto L_0x002b
            r0 = r10
            goto L_0x00b0
        L_0x0086:
            java.lang.String r0 = "hGap"
            boolean r0 = r7.equals(r0)
            if (r0 == 0) goto L_0x002b
            r0 = 4
            goto L_0x00b0
        L_0x0090:
            java.lang.String r0 = "contains"
            boolean r0 = r7.equals(r0)
            if (r0 == 0) goto L_0x002b
            r0 = r9
            goto L_0x00b0
        L_0x009a:
            java.lang.String r0 = "padding"
            boolean r0 = r7.equals(r0)
            if (r0 == 0) goto L_0x002b
            r0 = 10
            goto L_0x00b0
        L_0x00a5:
            java.lang.String r0 = "orientation"
            boolean r0 = r7.equals(r0)
            if (r0 == 0) goto L_0x002b
            r0 = r11
            goto L_0x00b0
        L_0x00af:
            r0 = -1
        L_0x00b0:
            java.lang.String r12 = ","
            java.lang.String r13 = ":"
            switch(r0) {
                case 0: goto L_0x024b;
                case 1: goto L_0x023d;
                case 2: goto L_0x022a;
                case 3: goto L_0x0217;
                case 4: goto L_0x0205;
                case 5: goto L_0x01f2;
                case 6: goto L_0x01d7;
                case 7: goto L_0x01bc;
                case 8: goto L_0x01a1;
                case 9: goto L_0x0186;
                case 10: goto L_0x0108;
                case 11: goto L_0x00c2;
                default: goto L_0x00b7;
            }
        L_0x00b7:
            androidx.constraintlayout.core.state.ConstraintReference r0 = r17.constraints(r18)
            r8 = r19
            applyAttribute(r1, r8, r0, r2, r7)
            goto L_0x0274
        L_0x00c2:
            r8 = 0
            java.lang.String r9 = ""
            androidx.constraintlayout.core.parser.CLElement r0 = r2.get((java.lang.String) r7)     // Catch:{ Exception -> 0x00d9 }
            boolean r10 = r0 instanceof androidx.constraintlayout.core.parser.CLNumber     // Catch:{ Exception -> 0x00d9 }
            if (r10 == 0) goto L_0x00d3
            int r10 = r0.getInt()     // Catch:{ Exception -> 0x00d9 }
            r8 = r10
            goto L_0x00d8
        L_0x00d3:
            java.lang.String r10 = r0.content()     // Catch:{ Exception -> 0x00d9 }
            r9 = r10
        L_0x00d8:
            goto L_0x00f2
        L_0x00d9:
            r0 = move-exception
            java.io.PrintStream r10 = java.lang.System.err
            java.lang.StringBuilder r11 = new java.lang.StringBuilder
            r11.<init>()
            java.lang.String r12 = "Error parsing grid flags "
            java.lang.StringBuilder r11 = r11.append(r12)
            java.lang.StringBuilder r11 = r11.append(r0)
            java.lang.String r11 = r11.toString()
            r10.println(r11)
        L_0x00f2:
            if (r9 == 0) goto L_0x0101
            boolean r0 = r9.isEmpty()
            if (r0 != 0) goto L_0x0101
            r5.setFlags((java.lang.String) r9)
            r8 = r19
            goto L_0x0274
        L_0x0101:
            r5.setFlags((int) r8)
            r8 = r19
            goto L_0x0274
        L_0x0108:
            androidx.constraintlayout.core.parser.CLElement r12 = r2.get((java.lang.String) r7)
            r0 = 0
            r13 = 0
            r14 = 0
            r15 = 0
            boolean r8 = r12 instanceof androidx.constraintlayout.core.parser.CLArray
            if (r8 == 0) goto L_0x014e
            r8 = r12
            androidx.constraintlayout.core.parser.CLArray r8 = (androidx.constraintlayout.core.parser.CLArray) r8
            int r8 = r8.size()
            if (r8 <= r11) goto L_0x014e
            r8 = r12
            androidx.constraintlayout.core.parser.CLArray r8 = (androidx.constraintlayout.core.parser.CLArray) r8
            int r8 = r8.getInt((int) r9)
            float r8 = (float) r8
            r0 = r8
            r9 = r12
            androidx.constraintlayout.core.parser.CLArray r9 = (androidx.constraintlayout.core.parser.CLArray) r9
            int r9 = r9.getInt((int) r11)
            float r9 = (float) r9
            r11 = r9
            r13 = r12
            androidx.constraintlayout.core.parser.CLArray r13 = (androidx.constraintlayout.core.parser.CLArray) r13
            int r13 = r13.size()
            if (r13 <= r10) goto L_0x0156
            r13 = r12
            androidx.constraintlayout.core.parser.CLArray r13 = (androidx.constraintlayout.core.parser.CLArray) r13
            int r10 = r13.getInt((int) r10)
            float r10 = (float) r10
            r0 = r12
            androidx.constraintlayout.core.parser.CLArray r0 = (androidx.constraintlayout.core.parser.CLArray) r0     // Catch:{ ArrayIndexOutOfBoundsException -> 0x014a }
            r13 = 3
            int r0 = r0.getInt((int) r13)     // Catch:{ ArrayIndexOutOfBoundsException -> 0x014a }
            float r11 = (float) r0
            goto L_0x014c
        L_0x014a:
            r0 = move-exception
            r11 = 0
        L_0x014c:
            r0 = r10
            goto L_0x0156
        L_0x014e:
            int r8 = r12.getInt()
            float r8 = (float) r8
            r9 = r8
            r0 = r8
            r11 = r8
        L_0x0156:
            float r10 = toPix(r1, r8)
            int r10 = java.lang.Math.round(r10)
            r5.setPaddingStart(r10)
            float r10 = toPix(r1, r9)
            int r10 = java.lang.Math.round(r10)
            r5.setPaddingTop(r10)
            float r10 = toPix(r1, r0)
            int r10 = java.lang.Math.round(r10)
            r5.setPaddingEnd(r10)
            float r10 = toPix(r1, r11)
            int r10 = java.lang.Math.round(r10)
            r5.setPaddingBottom(r10)
            r8 = r19
            goto L_0x0274
        L_0x0186:
            androidx.constraintlayout.core.parser.CLElement r0 = r2.get((java.lang.String) r7)
            java.lang.String r0 = r0.content()
            if (r0 == 0) goto L_0x019d
            boolean r8 = r0.contains(r12)
            if (r8 == 0) goto L_0x019d
            r5.setColumnWeights(r0)
            r8 = r19
            goto L_0x0274
        L_0x019d:
            r8 = r19
            goto L_0x0274
        L_0x01a1:
            androidx.constraintlayout.core.parser.CLElement r0 = r2.get((java.lang.String) r7)
            java.lang.String r0 = r0.content()
            if (r0 == 0) goto L_0x01b8
            boolean r8 = r0.contains(r12)
            if (r8 == 0) goto L_0x01b8
            r5.setRowWeights(r0)
            r8 = r19
            goto L_0x0274
        L_0x01b8:
            r8 = r19
            goto L_0x0274
        L_0x01bc:
            androidx.constraintlayout.core.parser.CLElement r0 = r2.get((java.lang.String) r7)
            java.lang.String r0 = r0.content()
            if (r0 == 0) goto L_0x01d3
            boolean r8 = r0.contains(r13)
            if (r8 == 0) goto L_0x01d3
            r5.setSkips(r0)
            r8 = r19
            goto L_0x0274
        L_0x01d3:
            r8 = r19
            goto L_0x0274
        L_0x01d7:
            androidx.constraintlayout.core.parser.CLElement r0 = r2.get((java.lang.String) r7)
            java.lang.String r0 = r0.content()
            if (r0 == 0) goto L_0x01ee
            boolean r8 = r0.contains(r13)
            if (r8 == 0) goto L_0x01ee
            r5.setSpans(r0)
            r8 = r19
            goto L_0x0274
        L_0x01ee:
            r8 = r19
            goto L_0x0274
        L_0x01f2:
            androidx.constraintlayout.core.parser.CLElement r0 = r2.get((java.lang.String) r7)
            float r0 = r0.getFloat()
            float r8 = toPix(r1, r0)
            r5.setVerticalGaps(r8)
            r8 = r19
            goto L_0x0274
        L_0x0205:
            androidx.constraintlayout.core.parser.CLElement r0 = r2.get((java.lang.String) r7)
            float r0 = r0.getFloat()
            float r8 = toPix(r1, r0)
            r5.setHorizontalGaps(r8)
            r8 = r19
            goto L_0x0274
        L_0x0217:
            androidx.constraintlayout.core.parser.CLElement r0 = r2.get((java.lang.String) r7)
            int r0 = r0.getInt()
            if (r0 <= 0) goto L_0x0227
            r5.setColumnsSet(r0)
            r8 = r19
            goto L_0x0274
        L_0x0227:
            r8 = r19
            goto L_0x0274
        L_0x022a:
            androidx.constraintlayout.core.parser.CLElement r0 = r2.get((java.lang.String) r7)
            int r0 = r0.getInt()
            if (r0 <= 0) goto L_0x023a
            r5.setRowsSet(r0)
            r8 = r19
            goto L_0x0274
        L_0x023a:
            r8 = r19
            goto L_0x0274
        L_0x023d:
            androidx.constraintlayout.core.parser.CLElement r0 = r2.get((java.lang.String) r7)
            int r0 = r0.getInt()
            r5.setOrientation(r0)
            r8 = r19
            goto L_0x0274
        L_0x024b:
            androidx.constraintlayout.core.parser.CLArray r0 = r2.getArrayOrNull(r7)
            if (r0 == 0) goto L_0x0272
            r8 = 0
        L_0x0252:
            int r9 = r0.size()
            if (r8 >= r9) goto L_0x026f
            androidx.constraintlayout.core.parser.CLElement r9 = r0.get((int) r8)
            java.lang.String r9 = r9.content()
            androidx.constraintlayout.core.state.ConstraintReference r10 = r1.constraints(r9)
            java.lang.Object[] r11 = new java.lang.Object[]{r10}
            r5.add(r11)
            int r8 = r8 + 1
            goto L_0x0252
        L_0x026f:
            r8 = r19
            goto L_0x0274
        L_0x0272:
            r8 = r19
        L_0x0274:
            goto L_0x0014
        L_0x0276:
            r8 = r19
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.constraintlayout.core.state.ConstraintSetParser.parseGridType(java.lang.String, androidx.constraintlayout.core.state.State, java.lang.String, androidx.constraintlayout.core.state.ConstraintSetParser$LayoutVariables, androidx.constraintlayout.core.parser.CLObject):void");
    }

    /* JADX WARNING: Can't fix incorrect switch cases order */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private static void parseFlowType(java.lang.String r19, androidx.constraintlayout.core.state.State r20, java.lang.String r21, androidx.constraintlayout.core.state.ConstraintSetParser.LayoutVariables r22, androidx.constraintlayout.core.parser.CLObject r23) throws androidx.constraintlayout.core.parser.CLParsingException {
        /*
            r1 = r20
            r2 = r21
            r3 = r23
            r4 = 0
            r5 = r19
            char r0 = r5.charAt(r4)
            r6 = 118(0x76, float:1.65E-43)
            r7 = 1
            if (r0 != r6) goto L_0x0014
            r0 = r7
            goto L_0x0015
        L_0x0014:
            r0 = r4
        L_0x0015:
            r6 = r0
            androidx.constraintlayout.core.state.helpers.FlowReference r8 = r1.getFlow(r2, r6)
            java.util.ArrayList r0 = r23.names()
            java.util.Iterator r9 = r0.iterator()
        L_0x0022:
            boolean r0 = r9.hasNext()
            if (r0 == 0) goto L_0x04f4
            java.lang.Object r0 = r9.next()
            r10 = r0
            java.lang.String r10 = (java.lang.String) r10
            int r0 = r10.hashCode()
            r11 = -1
            r12 = 3
            switch(r0) {
                case -1254185091: goto L_0x00c0;
                case -1237307863: goto L_0x00b5;
                case -1198076529: goto L_0x00aa;
                case -853376977: goto L_0x009f;
                case -836499749: goto L_0x0093;
                case -806339567: goto L_0x0089;
                case -732635235: goto L_0x007d;
                case -567445985: goto L_0x0073;
                case -488900360: goto L_0x0069;
                case 3169614: goto L_0x005e;
                case 3575610: goto L_0x0052;
                case 3586688: goto L_0x0046;
                case 3657802: goto L_0x003a;
                default: goto L_0x0038;
            }
        L_0x0038:
            goto L_0x00cb
        L_0x003a:
            java.lang.String r0 = "wrap"
            boolean r0 = r10.equals(r0)
            if (r0 == 0) goto L_0x0038
            r0 = 2
            goto L_0x00cc
        L_0x0046:
            java.lang.String r0 = "vGap"
            boolean r0 = r10.equals(r0)
            if (r0 == 0) goto L_0x0038
            r0 = r12
            goto L_0x00cc
        L_0x0052:
            java.lang.String r0 = "type"
            boolean r0 = r10.equals(r0)
            if (r0 == 0) goto L_0x0038
            r0 = r7
            goto L_0x00cc
        L_0x005e:
            java.lang.String r0 = "hGap"
            boolean r0 = r10.equals(r0)
            if (r0 == 0) goto L_0x0038
            r0 = 4
            goto L_0x00cc
        L_0x0069:
            java.lang.String r0 = "maxElement"
            boolean r0 = r10.equals(r0)
            if (r0 == 0) goto L_0x0038
            r0 = 5
            goto L_0x00cc
        L_0x0073:
            java.lang.String r0 = "contains"
            boolean r0 = r10.equals(r0)
            if (r0 == 0) goto L_0x0038
            r0 = r4
            goto L_0x00cc
        L_0x007d:
            java.lang.String r0 = "vFlowBias"
            boolean r0 = r10.equals(r0)
            if (r0 == 0) goto L_0x0038
            r0 = 9
            goto L_0x00cc
        L_0x0089:
            java.lang.String r0 = "padding"
            boolean r0 = r10.equals(r0)
            if (r0 == 0) goto L_0x0038
            r0 = 6
            goto L_0x00cc
        L_0x0093:
            java.lang.String r0 = "vStyle"
            boolean r0 = r10.equals(r0)
            if (r0 == 0) goto L_0x0038
            r0 = 11
            goto L_0x00cc
        L_0x009f:
            java.lang.String r0 = "vAlign"
            boolean r0 = r10.equals(r0)
            if (r0 == 0) goto L_0x0038
            r0 = 7
            goto L_0x00cc
        L_0x00aa:
            java.lang.String r0 = "hFlowBias"
            boolean r0 = r10.equals(r0)
            if (r0 == 0) goto L_0x0038
            r0 = 10
            goto L_0x00cc
        L_0x00b5:
            java.lang.String r0 = "hStyle"
            boolean r0 = r10.equals(r0)
            if (r0 == 0) goto L_0x0038
            r0 = 12
            goto L_0x00cc
        L_0x00c0:
            java.lang.String r0 = "hAlign"
            boolean r0 = r10.equals(r0)
            if (r0 == 0) goto L_0x0038
            r0 = 8
            goto L_0x00cc
        L_0x00cb:
            r0 = r11
        L_0x00cc:
            java.lang.String r14 = ""
            r15 = 1056964608(0x3f000000, float:0.5)
            switch(r0) {
                case 0: goto L_0x0429;
                case 1: goto L_0x040a;
                case 2: goto L_0x03f7;
                case 3: goto L_0x03e8;
                case 4: goto L_0x03d9;
                case 5: goto L_0x03ca;
                case 6: goto L_0x034a;
                case 7: goto L_0x0303;
                case 8: goto L_0x02ca;
                case 9: goto L_0x0240;
                case 10: goto L_0x01b6;
                case 11: goto L_0x014a;
                case 12: goto L_0x00de;
                default: goto L_0x00d3;
            }
        L_0x00d3:
            androidx.constraintlayout.core.state.ConstraintReference r0 = r20.constraints(r21)
            r4 = r22
            applyAttribute(r1, r4, r0, r3, r10)
            goto L_0x04f0
        L_0x00de:
            androidx.constraintlayout.core.parser.CLElement r0 = r3.get((java.lang.String) r10)
            java.lang.String r11 = ""
            java.lang.String r12 = ""
            java.lang.String r15 = ""
            boolean r13 = r0 instanceof androidx.constraintlayout.core.parser.CLArray
            if (r13 == 0) goto L_0x0115
            r13 = r0
            androidx.constraintlayout.core.parser.CLArray r13 = (androidx.constraintlayout.core.parser.CLArray) r13
            int r13 = r13.size()
            if (r13 <= r7) goto L_0x0115
            r13 = r0
            androidx.constraintlayout.core.parser.CLArray r13 = (androidx.constraintlayout.core.parser.CLArray) r13
            java.lang.String r12 = r13.getString((int) r4)
            r13 = r0
            androidx.constraintlayout.core.parser.CLArray r13 = (androidx.constraintlayout.core.parser.CLArray) r13
            java.lang.String r11 = r13.getString((int) r7)
            r13 = r0
            androidx.constraintlayout.core.parser.CLArray r13 = (androidx.constraintlayout.core.parser.CLArray) r13
            int r13 = r13.size()
            r4 = 2
            if (r13 <= r4) goto L_0x0119
            r13 = r0
            androidx.constraintlayout.core.parser.CLArray r13 = (androidx.constraintlayout.core.parser.CLArray) r13
            java.lang.String r15 = r13.getString((int) r4)
            goto L_0x0119
        L_0x0115:
            java.lang.String r11 = r0.content()
        L_0x0119:
            boolean r4 = r11.equals(r14)
            if (r4 != 0) goto L_0x0126
            int r4 = androidx.constraintlayout.core.state.State.Chain.getValueByString(r11)
            r8.setHorizontalStyle(r4)
        L_0x0126:
            boolean r4 = r12.equals(r14)
            if (r4 != 0) goto L_0x0134
            int r4 = androidx.constraintlayout.core.state.State.Chain.getValueByString(r12)
            r8.setFirstHorizontalStyle(r4)
        L_0x0134:
            boolean r4 = r15.equals(r14)
            if (r4 != 0) goto L_0x0146
            int r4 = androidx.constraintlayout.core.state.State.Chain.getValueByString(r15)
            r8.setLastHorizontalStyle(r4)
            r4 = r22
            goto L_0x04f0
        L_0x0146:
            r4 = r22
            goto L_0x04f0
        L_0x014a:
            androidx.constraintlayout.core.parser.CLElement r0 = r3.get((java.lang.String) r10)
            java.lang.String r4 = ""
            java.lang.String r11 = ""
            java.lang.String r12 = ""
            boolean r13 = r0 instanceof androidx.constraintlayout.core.parser.CLArray
            if (r13 == 0) goto L_0x0182
            r13 = r0
            androidx.constraintlayout.core.parser.CLArray r13 = (androidx.constraintlayout.core.parser.CLArray) r13
            int r13 = r13.size()
            if (r13 <= r7) goto L_0x0182
            r13 = r0
            androidx.constraintlayout.core.parser.CLArray r13 = (androidx.constraintlayout.core.parser.CLArray) r13
            r15 = 0
            java.lang.String r11 = r13.getString((int) r15)
            r13 = r0
            androidx.constraintlayout.core.parser.CLArray r13 = (androidx.constraintlayout.core.parser.CLArray) r13
            java.lang.String r4 = r13.getString((int) r7)
            r13 = r0
            androidx.constraintlayout.core.parser.CLArray r13 = (androidx.constraintlayout.core.parser.CLArray) r13
            int r13 = r13.size()
            r15 = 2
            if (r13 <= r15) goto L_0x0186
            r13 = r0
            androidx.constraintlayout.core.parser.CLArray r13 = (androidx.constraintlayout.core.parser.CLArray) r13
            java.lang.String r12 = r13.getString((int) r15)
            goto L_0x0186
        L_0x0182:
            java.lang.String r4 = r0.content()
        L_0x0186:
            boolean r13 = r4.equals(r14)
            if (r13 != 0) goto L_0x0193
            int r13 = androidx.constraintlayout.core.state.State.Chain.getValueByString(r4)
            r8.setVerticalStyle(r13)
        L_0x0193:
            boolean r13 = r11.equals(r14)
            if (r13 != 0) goto L_0x01a1
            int r13 = androidx.constraintlayout.core.state.State.Chain.getValueByString(r11)
            r8.setFirstVerticalStyle(r13)
        L_0x01a1:
            boolean r13 = r12.equals(r14)
            if (r13 != 0) goto L_0x01b2
            int r13 = androidx.constraintlayout.core.state.State.Chain.getValueByString(r12)
            r8.setLastVerticalStyle(r13)
            r4 = r22
            goto L_0x04f0
        L_0x01b2:
            r4 = r22
            goto L_0x04f0
        L_0x01b6:
            androidx.constraintlayout.core.parser.CLElement r4 = r3.get((java.lang.String) r10)
            java.lang.Float r0 = java.lang.Float.valueOf(r15)
            java.lang.Float r11 = java.lang.Float.valueOf(r15)
            java.lang.Float r12 = java.lang.Float.valueOf(r15)
            boolean r13 = r4 instanceof androidx.constraintlayout.core.parser.CLArray
            if (r13 == 0) goto L_0x0207
            r13 = r4
            androidx.constraintlayout.core.parser.CLArray r13 = (androidx.constraintlayout.core.parser.CLArray) r13
            int r13 = r13.size()
            if (r13 <= r7) goto L_0x0207
            r13 = r4
            androidx.constraintlayout.core.parser.CLArray r13 = (androidx.constraintlayout.core.parser.CLArray) r13
            r14 = 0
            float r13 = r13.getFloat((int) r14)
            java.lang.Float r11 = java.lang.Float.valueOf(r13)
            r13 = r4
            androidx.constraintlayout.core.parser.CLArray r13 = (androidx.constraintlayout.core.parser.CLArray) r13
            float r13 = r13.getFloat((int) r7)
            java.lang.Float r0 = java.lang.Float.valueOf(r13)
            r13 = r4
            androidx.constraintlayout.core.parser.CLArray r13 = (androidx.constraintlayout.core.parser.CLArray) r13
            int r13 = r13.size()
            r14 = 2
            if (r13 <= r14) goto L_0x0203
            r13 = r4
            androidx.constraintlayout.core.parser.CLArray r13 = (androidx.constraintlayout.core.parser.CLArray) r13
            float r13 = r13.getFloat((int) r14)
            java.lang.Float r12 = java.lang.Float.valueOf(r13)
            r13 = r12
            r12 = r11
            r11 = r0
            goto L_0x0212
        L_0x0203:
            r13 = r12
            r12 = r11
            r11 = r0
            goto L_0x0212
        L_0x0207:
            float r13 = r4.getFloat()
            java.lang.Float r0 = java.lang.Float.valueOf(r13)
            r13 = r12
            r12 = r11
            r11 = r0
        L_0x0212:
            float r0 = r11.floatValue()     // Catch:{ NumberFormatException -> 0x023b }
            r8.horizontalBias(r0)     // Catch:{ NumberFormatException -> 0x023b }
            float r0 = r12.floatValue()     // Catch:{ NumberFormatException -> 0x023b }
            int r0 = (r0 > r15 ? 1 : (r0 == r15 ? 0 : -1))
            if (r0 == 0) goto L_0x0228
            float r0 = r12.floatValue()     // Catch:{ NumberFormatException -> 0x023b }
            r8.setFirstHorizontalBias(r0)     // Catch:{ NumberFormatException -> 0x023b }
        L_0x0228:
            float r0 = r13.floatValue()     // Catch:{ NumberFormatException -> 0x023b }
            int r0 = (r0 > r15 ? 1 : (r0 == r15 ? 0 : -1))
            if (r0 == 0) goto L_0x0237
            float r0 = r13.floatValue()     // Catch:{ NumberFormatException -> 0x023b }
            r8.setLastHorizontalBias(r0)     // Catch:{ NumberFormatException -> 0x023b }
        L_0x0237:
            r4 = r22
            goto L_0x04f0
        L_0x023b:
            r0 = move-exception
            r4 = r22
            goto L_0x04f0
        L_0x0240:
            androidx.constraintlayout.core.parser.CLElement r4 = r3.get((java.lang.String) r10)
            java.lang.Float r0 = java.lang.Float.valueOf(r15)
            java.lang.Float r11 = java.lang.Float.valueOf(r15)
            java.lang.Float r12 = java.lang.Float.valueOf(r15)
            boolean r13 = r4 instanceof androidx.constraintlayout.core.parser.CLArray
            if (r13 == 0) goto L_0x0291
            r13 = r4
            androidx.constraintlayout.core.parser.CLArray r13 = (androidx.constraintlayout.core.parser.CLArray) r13
            int r13 = r13.size()
            if (r13 <= r7) goto L_0x0291
            r13 = r4
            androidx.constraintlayout.core.parser.CLArray r13 = (androidx.constraintlayout.core.parser.CLArray) r13
            r14 = 0
            float r13 = r13.getFloat((int) r14)
            java.lang.Float r11 = java.lang.Float.valueOf(r13)
            r13 = r4
            androidx.constraintlayout.core.parser.CLArray r13 = (androidx.constraintlayout.core.parser.CLArray) r13
            float r13 = r13.getFloat((int) r7)
            java.lang.Float r0 = java.lang.Float.valueOf(r13)
            r13 = r4
            androidx.constraintlayout.core.parser.CLArray r13 = (androidx.constraintlayout.core.parser.CLArray) r13
            int r13 = r13.size()
            r14 = 2
            if (r13 <= r14) goto L_0x028d
            r13 = r4
            androidx.constraintlayout.core.parser.CLArray r13 = (androidx.constraintlayout.core.parser.CLArray) r13
            float r13 = r13.getFloat((int) r14)
            java.lang.Float r12 = java.lang.Float.valueOf(r13)
            r13 = r12
            r12 = r11
            r11 = r0
            goto L_0x029c
        L_0x028d:
            r13 = r12
            r12 = r11
            r11 = r0
            goto L_0x029c
        L_0x0291:
            float r13 = r4.getFloat()
            java.lang.Float r0 = java.lang.Float.valueOf(r13)
            r13 = r12
            r12 = r11
            r11 = r0
        L_0x029c:
            float r0 = r11.floatValue()     // Catch:{ NumberFormatException -> 0x02c5 }
            r8.verticalBias(r0)     // Catch:{ NumberFormatException -> 0x02c5 }
            float r0 = r12.floatValue()     // Catch:{ NumberFormatException -> 0x02c5 }
            int r0 = (r0 > r15 ? 1 : (r0 == r15 ? 0 : -1))
            if (r0 == 0) goto L_0x02b2
            float r0 = r12.floatValue()     // Catch:{ NumberFormatException -> 0x02c5 }
            r8.setFirstVerticalBias(r0)     // Catch:{ NumberFormatException -> 0x02c5 }
        L_0x02b2:
            float r0 = r13.floatValue()     // Catch:{ NumberFormatException -> 0x02c5 }
            int r0 = (r0 > r15 ? 1 : (r0 == r15 ? 0 : -1))
            if (r0 == 0) goto L_0x02c1
            float r0 = r13.floatValue()     // Catch:{ NumberFormatException -> 0x02c5 }
            r8.setLastVerticalBias(r0)     // Catch:{ NumberFormatException -> 0x02c5 }
        L_0x02c1:
            r4 = r22
            goto L_0x04f0
        L_0x02c5:
            r0 = move-exception
            r4 = r22
            goto L_0x04f0
        L_0x02ca:
            androidx.constraintlayout.core.parser.CLElement r0 = r3.get((java.lang.String) r10)
            java.lang.String r0 = r0.content()
            int r4 = r0.hashCode()
            switch(r4) {
                case 100571: goto L_0x02e5;
                case 109757538: goto L_0x02da;
                default: goto L_0x02d9;
            }
        L_0x02d9:
            goto L_0x02ee
        L_0x02da:
            java.lang.String r4 = "start"
            boolean r4 = r0.equals(r4)
            if (r4 == 0) goto L_0x02d9
            r11 = 0
            goto L_0x02ee
        L_0x02e5:
            java.lang.String r4 = "end"
            boolean r4 = r0.equals(r4)
            if (r4 == 0) goto L_0x02d9
            r11 = r7
        L_0x02ee:
            switch(r11) {
                case 0: goto L_0x02fa;
                case 1: goto L_0x02f6;
                default: goto L_0x02f1;
            }
        L_0x02f1:
            r4 = 2
            r8.setHorizontalAlign(r4)
            goto L_0x02ff
        L_0x02f6:
            r8.setHorizontalAlign(r7)
            goto L_0x02ff
        L_0x02fa:
            r4 = 0
            r8.setHorizontalAlign(r4)
        L_0x02ff:
            r4 = r22
            goto L_0x04f0
        L_0x0303:
            androidx.constraintlayout.core.parser.CLElement r0 = r3.get((java.lang.String) r10)
            java.lang.String r0 = r0.content()
            int r4 = r0.hashCode()
            switch(r4) {
                case -1720785339: goto L_0x0328;
                case -1383228885: goto L_0x031e;
                case 115029: goto L_0x0313;
                default: goto L_0x0312;
            }
        L_0x0312:
            goto L_0x0331
        L_0x0313:
            java.lang.String r4 = "top"
            boolean r4 = r0.equals(r4)
            if (r4 == 0) goto L_0x0312
            r11 = 0
            goto L_0x0331
        L_0x031e:
            java.lang.String r4 = "bottom"
            boolean r4 = r0.equals(r4)
            if (r4 == 0) goto L_0x0312
            r11 = r7
            goto L_0x0331
        L_0x0328:
            java.lang.String r4 = "baseline"
            boolean r4 = r0.equals(r4)
            if (r4 == 0) goto L_0x0312
            r11 = 2
        L_0x0331:
            switch(r11) {
                case 0: goto L_0x0341;
                case 1: goto L_0x033d;
                case 2: goto L_0x0339;
                default: goto L_0x0334;
            }
        L_0x0334:
            r4 = 2
            r8.setVerticalAlign(r4)
            goto L_0x0346
        L_0x0339:
            r8.setVerticalAlign(r12)
            goto L_0x0346
        L_0x033d:
            r8.setVerticalAlign(r7)
            goto L_0x0346
        L_0x0341:
            r4 = 0
            r8.setVerticalAlign(r4)
        L_0x0346:
            r4 = r22
            goto L_0x04f0
        L_0x034a:
            androidx.constraintlayout.core.parser.CLElement r4 = r3.get((java.lang.String) r10)
            r0 = 0
            r11 = 0
            r13 = 0
            r14 = 0
            boolean r15 = r4 instanceof androidx.constraintlayout.core.parser.CLArray
            if (r15 == 0) goto L_0x0392
            r15 = r4
            androidx.constraintlayout.core.parser.CLArray r15 = (androidx.constraintlayout.core.parser.CLArray) r15
            int r15 = r15.size()
            if (r15 <= r7) goto L_0x0392
            r15 = r4
            androidx.constraintlayout.core.parser.CLArray r15 = (androidx.constraintlayout.core.parser.CLArray) r15
            r12 = 0
            int r15 = r15.getInt((int) r12)
            float r12 = (float) r15
            r0 = r12
            r13 = r4
            androidx.constraintlayout.core.parser.CLArray r13 = (androidx.constraintlayout.core.parser.CLArray) r13
            int r13 = r13.getInt((int) r7)
            float r11 = (float) r13
            r13 = r11
            r14 = r4
            androidx.constraintlayout.core.parser.CLArray r14 = (androidx.constraintlayout.core.parser.CLArray) r14
            int r14 = r14.size()
            r15 = 2
            if (r14 <= r15) goto L_0x039a
            r14 = r4
            androidx.constraintlayout.core.parser.CLArray r14 = (androidx.constraintlayout.core.parser.CLArray) r14
            int r14 = r14.getInt((int) r15)
            float r14 = (float) r14
            r0 = r4
            androidx.constraintlayout.core.parser.CLArray r0 = (androidx.constraintlayout.core.parser.CLArray) r0     // Catch:{ ArrayIndexOutOfBoundsException -> 0x038e }
            r15 = 3
            int r0 = r0.getInt((int) r15)     // Catch:{ ArrayIndexOutOfBoundsException -> 0x038e }
            float r13 = (float) r0
            goto L_0x0390
        L_0x038e:
            r0 = move-exception
            r13 = 0
        L_0x0390:
            r0 = r14
            goto L_0x039a
        L_0x0392:
            int r12 = r4.getInt()
            float r12 = (float) r12
            r11 = r12
            r0 = r12
            r13 = r12
        L_0x039a:
            float r14 = toPix(r1, r12)
            int r14 = java.lang.Math.round(r14)
            r8.setPaddingLeft(r14)
            float r14 = toPix(r1, r11)
            int r14 = java.lang.Math.round(r14)
            r8.setPaddingTop(r14)
            float r14 = toPix(r1, r0)
            int r14 = java.lang.Math.round(r14)
            r8.setPaddingRight(r14)
            float r14 = toPix(r1, r13)
            int r14 = java.lang.Math.round(r14)
            r8.setPaddingBottom(r14)
            r4 = r22
            goto L_0x04f0
        L_0x03ca:
            androidx.constraintlayout.core.parser.CLElement r0 = r3.get((java.lang.String) r10)
            int r0 = r0.getInt()
            r8.setMaxElementsWrap(r0)
            r4 = r22
            goto L_0x04f0
        L_0x03d9:
            androidx.constraintlayout.core.parser.CLElement r0 = r3.get((java.lang.String) r10)
            int r0 = r0.getInt()
            r8.setHorizontalGap(r0)
            r4 = r22
            goto L_0x04f0
        L_0x03e8:
            androidx.constraintlayout.core.parser.CLElement r0 = r3.get((java.lang.String) r10)
            int r0 = r0.getInt()
            r8.setVerticalGap(r0)
            r4 = r22
            goto L_0x04f0
        L_0x03f7:
            androidx.constraintlayout.core.parser.CLElement r0 = r3.get((java.lang.String) r10)
            java.lang.String r0 = r0.content()
            int r4 = androidx.constraintlayout.core.state.State.Wrap.getValueByString(r0)
            r8.setWrapMode(r4)
            r4 = r22
            goto L_0x04f0
        L_0x040a:
            androidx.constraintlayout.core.parser.CLElement r0 = r3.get((java.lang.String) r10)
            java.lang.String r0 = r0.content()
            java.lang.String r4 = "hFlow"
            boolean r0 = r0.equals(r4)
            if (r0 == 0) goto L_0x0422
            r4 = 0
            r8.setOrientation(r4)
            r4 = r22
            goto L_0x04f0
        L_0x0422:
            r8.setOrientation(r7)
            r4 = r22
            goto L_0x04f0
        L_0x0429:
            androidx.constraintlayout.core.parser.CLElement r0 = r3.get((java.lang.String) r10)
            boolean r4 = r0 instanceof androidx.constraintlayout.core.parser.CLArray
            if (r4 == 0) goto L_0x04c9
            r4 = r0
            androidx.constraintlayout.core.parser.CLArray r4 = (androidx.constraintlayout.core.parser.CLArray) r4
            int r4 = r4.size()
            if (r4 >= r7) goto L_0x043c
            goto L_0x04c9
        L_0x043c:
            r4 = 0
        L_0x043d:
            r11 = r0
            androidx.constraintlayout.core.parser.CLArray r11 = (androidx.constraintlayout.core.parser.CLArray) r11
            int r11 = r11.size()
            if (r4 >= r11) goto L_0x04c6
            r11 = r0
            androidx.constraintlayout.core.parser.CLArray r11 = (androidx.constraintlayout.core.parser.CLArray) r11
            androidx.constraintlayout.core.parser.CLElement r11 = r11.get((int) r4)
            boolean r12 = r11 instanceof androidx.constraintlayout.core.parser.CLArray
            if (r12 == 0) goto L_0x04b6
            r12 = r11
            androidx.constraintlayout.core.parser.CLArray r12 = (androidx.constraintlayout.core.parser.CLArray) r12
            int r13 = r12.size()
            if (r13 <= 0) goto L_0x04b5
            r13 = 0
            androidx.constraintlayout.core.parser.CLElement r14 = r12.get((int) r13)
            java.lang.String r14 = r14.content()
            r15 = 2143289344(0x7fc00000, float:NaN)
            r16 = 2143289344(0x7fc00000, float:NaN)
            r17 = 2143289344(0x7fc00000, float:NaN)
            int r18 = r12.size()
            switch(r18) {
                case 2: goto L_0x04a8;
                case 3: goto L_0x0492;
                case 4: goto L_0x0477;
                default: goto L_0x0470;
            }
        L_0x0470:
            r13 = r7
            r7 = 2
            r7 = r16
            r13 = r17
            goto L_0x04b2
        L_0x0477:
            float r15 = r12.getFloat((int) r7)
            r13 = 2
            float r7 = r12.getFloat((int) r13)
            float r16 = toPix(r1, r7)
            r7 = 3
            float r13 = r12.getFloat((int) r7)
            float r17 = toPix(r1, r13)
            r7 = r16
            r13 = r17
            goto L_0x04b2
        L_0x0492:
            r7 = 3
            r13 = 1
            float r15 = r12.getFloat((int) r13)
            r7 = 2
            float r13 = r12.getFloat((int) r7)
            float r13 = toPix(r1, r13)
            r16 = r13
            r17 = r13
            r7 = r16
            goto L_0x04b2
        L_0x04a8:
            r7 = 2
            r13 = 1
            float r15 = r12.getFloat((int) r13)
            r7 = r16
            r13 = r17
        L_0x04b2:
            r8.addFlowElement(r14, r15, r7, r13)
        L_0x04b5:
            goto L_0x04c1
        L_0x04b6:
            java.lang.String r7 = r11.content()
            java.lang.Object[] r7 = new java.lang.Object[]{r7}
            r8.add(r7)
        L_0x04c1:
            int r4 = r4 + 1
            r7 = 1
            goto L_0x043d
        L_0x04c6:
            r4 = r22
            goto L_0x04f0
        L_0x04c9:
            java.io.PrintStream r4 = java.lang.System.err
            java.lang.StringBuilder r7 = new java.lang.StringBuilder
            r7.<init>()
            java.lang.StringBuilder r7 = r7.append(r2)
            java.lang.String r9 = " contains should be an array \""
            java.lang.StringBuilder r7 = r7.append(r9)
            java.lang.String r9 = r0.content()
            java.lang.StringBuilder r7 = r7.append(r9)
            java.lang.String r9 = "\""
            java.lang.StringBuilder r7 = r7.append(r9)
            java.lang.String r7 = r7.toString()
            r4.println(r7)
            return
        L_0x04f0:
            r4 = 0
            r7 = 1
            goto L_0x0022
        L_0x04f4:
            r4 = r22
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.constraintlayout.core.state.ConstraintSetParser.parseFlowType(java.lang.String, androidx.constraintlayout.core.state.State, java.lang.String, androidx.constraintlayout.core.state.ConstraintSetParser$LayoutVariables, androidx.constraintlayout.core.parser.CLObject):void");
    }

    static void parseGuideline(int orientation, State state, CLArray helper) throws CLParsingException {
        String guidelineId;
        CLElement params = helper.get(1);
        if ((params instanceof CLObject) && (guidelineId = ((CLObject) params).getStringOrNull("id")) != null) {
            parseGuidelineParams(orientation, state, guidelineId, (CLObject) params);
        }
    }

    /* JADX WARNING: Can't fix incorrect switch cases order */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    static void parseGuidelineParams(int r21, androidx.constraintlayout.core.state.State r22, java.lang.String r23, androidx.constraintlayout.core.parser.CLObject r24) throws androidx.constraintlayout.core.parser.CLParsingException {
        /*
            r0 = r22
            r1 = r24
            java.util.ArrayList r2 = r24.names()
            if (r2 != 0) goto L_0x000b
            return
        L_0x000b:
            androidx.constraintlayout.core.state.ConstraintReference r3 = r22.constraints(r23)
            if (r21 != 0) goto L_0x0015
            r22.horizontalGuideline(r23)
            goto L_0x0018
        L_0x0015:
            r22.verticalGuideline(r23)
        L_0x0018:
            boolean r4 = r22.isRtl()
            if (r4 == 0) goto L_0x0023
            if (r21 != 0) goto L_0x0021
            goto L_0x0023
        L_0x0021:
            r4 = 0
            goto L_0x0024
        L_0x0023:
            r4 = 1
        L_0x0024:
            androidx.constraintlayout.core.state.helpers.Facade r7 = r3.getFacade()
            androidx.constraintlayout.core.state.helpers.GuidelineReference r7 = (androidx.constraintlayout.core.state.helpers.GuidelineReference) r7
            r8 = 0
            r9 = 0
            r10 = 1
            java.util.Iterator r11 = r2.iterator()
        L_0x0031:
            boolean r12 = r11.hasNext()
            if (r12 == 0) goto L_0x0154
            java.lang.Object r12 = r11.next()
            java.lang.String r12 = (java.lang.String) r12
            int r13 = r12.hashCode()
            java.lang.String r14 = "start"
            java.lang.String r15 = "right"
            java.lang.String r5 = "left"
            java.lang.String r6 = "end"
            r18 = -1
            switch(r13) {
                case -678927291: goto L_0x0070;
                case 100571: goto L_0x0068;
                case 3317767: goto L_0x0060;
                case 108511772: goto L_0x0058;
                case 109757538: goto L_0x0050;
                default: goto L_0x004f;
            }
        L_0x004f:
            goto L_0x007a
        L_0x0050:
            boolean r13 = r12.equals(r14)
            if (r13 == 0) goto L_0x004f
            r13 = 2
            goto L_0x007c
        L_0x0058:
            boolean r13 = r12.equals(r15)
            if (r13 == 0) goto L_0x004f
            r13 = 1
            goto L_0x007c
        L_0x0060:
            boolean r13 = r12.equals(r5)
            if (r13 == 0) goto L_0x004f
            r13 = 0
            goto L_0x007c
        L_0x0068:
            boolean r13 = r12.equals(r6)
            if (r13 == 0) goto L_0x004f
            r13 = 3
            goto L_0x007c
        L_0x0070:
            java.lang.String r13 = "percent"
            boolean r13 = r12.equals(r13)
            if (r13 == 0) goto L_0x004f
            r13 = 4
            goto L_0x007c
        L_0x007a:
            r13 = r18
        L_0x007c:
            switch(r13) {
                case 0: goto L_0x013d;
                case 1: goto L_0x012b;
                case 2: goto L_0x0119;
                case 3: goto L_0x0103;
                case 4: goto L_0x0087;
                default: goto L_0x007f;
            }
        L_0x007f:
            r19 = r2
            r20 = r3
            r2 = 0
            r3 = 1
            goto L_0x014e
        L_0x0087:
            r8 = 1
            androidx.constraintlayout.core.parser.CLArray r13 = r1.getArrayOrNull(r12)
            if (r13 != 0) goto L_0x009d
            r5 = 1
            float r6 = r1.getFloat((java.lang.String) r12)
            r19 = r2
            r20 = r3
            r10 = r5
            r9 = r6
            r2 = 0
            r3 = 1
            goto L_0x014e
        L_0x009d:
            r19 = r2
            int r2 = r13.size()
            r20 = r3
            r3 = 1
            if (r2 <= r3) goto L_0x00ff
            r16 = r8
            r2 = 0
            java.lang.String r8 = r13.getString((int) r2)
            float r9 = r13.getFloat((int) r3)
            int r17 = r8.hashCode()
            switch(r17) {
                case 100571: goto L_0x00d3;
                case 3317767: goto L_0x00cb;
                case 108511772: goto L_0x00c3;
                case 109757538: goto L_0x00bb;
                default: goto L_0x00ba;
            }
        L_0x00ba:
            goto L_0x00db
        L_0x00bb:
            boolean r5 = r8.equals(r14)
            if (r5 == 0) goto L_0x00ba
            r14 = 2
            goto L_0x00dd
        L_0x00c3:
            boolean r5 = r8.equals(r15)
            if (r5 == 0) goto L_0x00ba
            r14 = r3
            goto L_0x00dd
        L_0x00cb:
            boolean r5 = r8.equals(r5)
            if (r5 == 0) goto L_0x00ba
            r14 = r2
            goto L_0x00dd
        L_0x00d3:
            boolean r5 = r8.equals(r6)
            if (r5 == 0) goto L_0x00ba
            r14 = 3
            goto L_0x00dd
        L_0x00db:
            r14 = r18
        L_0x00dd:
            switch(r14) {
                case 0: goto L_0x00fa;
                case 1: goto L_0x00f4;
                case 2: goto L_0x00ee;
                case 3: goto L_0x00e4;
                default: goto L_0x00e0;
            }
        L_0x00e0:
            r8 = r16
            goto L_0x014e
        L_0x00e4:
            if (r4 != 0) goto L_0x00e8
            r5 = r3
            goto L_0x00e9
        L_0x00e8:
            r5 = r2
        L_0x00e9:
            r10 = r5
            r8 = r16
            goto L_0x014e
        L_0x00ee:
            r5 = r4
            r10 = r5
            r8 = r16
            goto L_0x014e
        L_0x00f4:
            r5 = 0
            r10 = r5
            r8 = r16
            goto L_0x014e
        L_0x00fa:
            r5 = 1
            r10 = r5
            r8 = r16
            goto L_0x014e
        L_0x00ff:
            r16 = r8
            r2 = 0
            goto L_0x014e
        L_0x0103:
            r19 = r2
            r20 = r3
            r2 = 0
            r3 = 1
            float r5 = r1.getFloat((java.lang.String) r12)
            float r5 = toPix(r0, r5)
            if (r4 != 0) goto L_0x0115
            r6 = r3
            goto L_0x0116
        L_0x0115:
            r6 = r2
        L_0x0116:
            r9 = r5
            r10 = r6
            goto L_0x014e
        L_0x0119:
            r19 = r2
            r20 = r3
            r2 = 0
            r3 = 1
            float r5 = r1.getFloat((java.lang.String) r12)
            float r5 = toPix(r0, r5)
            r6 = r4
            r9 = r5
            r10 = r6
            goto L_0x014e
        L_0x012b:
            r19 = r2
            r20 = r3
            r2 = 0
            r3 = 1
            float r5 = r1.getFloat((java.lang.String) r12)
            float r5 = toPix(r0, r5)
            r6 = 0
            r9 = r5
            r10 = r6
            goto L_0x014e
        L_0x013d:
            r19 = r2
            r20 = r3
            r2 = 0
            r3 = 1
            float r5 = r1.getFloat((java.lang.String) r12)
            float r5 = toPix(r0, r5)
            r6 = 1
            r9 = r5
            r10 = r6
        L_0x014e:
            r2 = r19
            r3 = r20
            goto L_0x0031
        L_0x0154:
            r19 = r2
            r20 = r3
            if (r8 == 0) goto L_0x0167
            if (r10 == 0) goto L_0x0160
            r7.percent(r9)
            goto L_0x0178
        L_0x0160:
            r2 = 1065353216(0x3f800000, float:1.0)
            float r2 = r2 - r9
            r7.percent(r2)
            goto L_0x0178
        L_0x0167:
            if (r10 == 0) goto L_0x0171
            java.lang.Float r2 = java.lang.Float.valueOf(r9)
            r7.start(r2)
            goto L_0x0178
        L_0x0171:
            java.lang.Float r2 = java.lang.Float.valueOf(r9)
            r7.end(r2)
        L_0x0178:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.constraintlayout.core.state.ConstraintSetParser.parseGuidelineParams(int, androidx.constraintlayout.core.state.State, java.lang.String, androidx.constraintlayout.core.parser.CLObject):void");
    }

    /* JADX WARNING: Can't fix incorrect switch cases order */
    /* JADX WARNING: Code restructure failed: missing block: B:37:0x00b4, code lost:
        if (r6.equals("left") != false) goto L_0x00d7;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    static void parseBarrier(androidx.constraintlayout.core.state.State r11, java.lang.String r12, androidx.constraintlayout.core.parser.CLObject r13) throws androidx.constraintlayout.core.parser.CLParsingException {
        /*
            boolean r0 = r11.isRtl()
            r1 = 1
            r0 = r0 ^ r1
            androidx.constraintlayout.core.state.State$Direction r2 = androidx.constraintlayout.core.state.State.Direction.END
            androidx.constraintlayout.core.state.helpers.BarrierReference r2 = r11.barrier(r12, r2)
            java.util.ArrayList r3 = r13.names()
            if (r3 != 0) goto L_0x0013
            return
        L_0x0013:
            java.util.Iterator r4 = r3.iterator()
        L_0x0017:
            boolean r5 = r4.hasNext()
            if (r5 == 0) goto L_0x0112
            java.lang.Object r5 = r4.next()
            java.lang.String r5 = (java.lang.String) r5
            int r6 = r5.hashCode()
            r7 = 2
            r8 = 0
            r9 = -1
            switch(r6) {
                case -1081309778: goto L_0x0042;
                case -962590849: goto L_0x0038;
                case -567445985: goto L_0x002e;
                default: goto L_0x002d;
            }
        L_0x002d:
            goto L_0x004c
        L_0x002e:
            java.lang.String r6 = "contains"
            boolean r6 = r5.equals(r6)
            if (r6 == 0) goto L_0x002d
            r6 = r7
            goto L_0x004d
        L_0x0038:
            java.lang.String r6 = "direction"
            boolean r6 = r5.equals(r6)
            if (r6 == 0) goto L_0x002d
            r6 = r8
            goto L_0x004d
        L_0x0042:
            java.lang.String r6 = "margin"
            boolean r6 = r5.equals(r6)
            if (r6 == 0) goto L_0x002d
            r6 = r1
            goto L_0x004d
        L_0x004c:
            r6 = r9
        L_0x004d:
            switch(r6) {
                case 0: goto L_0x008d;
                case 1: goto L_0x0076;
                case 2: goto L_0x0052;
                default: goto L_0x0050;
            }
        L_0x0050:
            goto L_0x0110
        L_0x0052:
            androidx.constraintlayout.core.parser.CLArray r6 = r13.getArrayOrNull(r5)
            if (r6 == 0) goto L_0x0110
            r7 = 0
        L_0x0059:
            int r8 = r6.size()
            if (r7 >= r8) goto L_0x0110
            androidx.constraintlayout.core.parser.CLElement r8 = r6.get((int) r7)
            java.lang.String r8 = r8.content()
            androidx.constraintlayout.core.state.ConstraintReference r9 = r11.constraints(r8)
            java.lang.Object[] r10 = new java.lang.Object[]{r9}
            r2.add(r10)
            int r7 = r7 + 1
            goto L_0x0059
        L_0x0076:
            float r6 = r13.getFloatOrNaN(r5)
            boolean r7 = java.lang.Float.isNaN(r6)
            if (r7 != 0) goto L_0x0110
            float r7 = toPix(r11, r6)
            java.lang.Float r7 = java.lang.Float.valueOf(r7)
            r2.margin((java.lang.Object) r7)
            goto L_0x0110
        L_0x008d:
            java.lang.String r6 = r13.getString((java.lang.String) r5)
            int r10 = r6.hashCode()
            switch(r10) {
                case -1383228885: goto L_0x00cc;
                case 100571: goto L_0x00c2;
                case 115029: goto L_0x00b7;
                case 3317767: goto L_0x00ae;
                case 108511772: goto L_0x00a4;
                case 109757538: goto L_0x0099;
                default: goto L_0x0098;
            }
        L_0x0098:
            goto L_0x00d6
        L_0x0099:
            java.lang.String r7 = "start"
            boolean r6 = r6.equals(r7)
            if (r6 == 0) goto L_0x0098
            r7 = r8
            goto L_0x00d7
        L_0x00a4:
            java.lang.String r7 = "right"
            boolean r6 = r6.equals(r7)
            if (r6 == 0) goto L_0x0098
            r7 = 3
            goto L_0x00d7
        L_0x00ae:
            java.lang.String r8 = "left"
            boolean r6 = r6.equals(r8)
            if (r6 == 0) goto L_0x0098
            goto L_0x00d7
        L_0x00b7:
            java.lang.String r7 = "top"
            boolean r6 = r6.equals(r7)
            if (r6 == 0) goto L_0x0098
            r7 = 4
            goto L_0x00d7
        L_0x00c2:
            java.lang.String r7 = "end"
            boolean r6 = r6.equals(r7)
            if (r6 == 0) goto L_0x0098
            r7 = r1
            goto L_0x00d7
        L_0x00cc:
            java.lang.String r7 = "bottom"
            boolean r6 = r6.equals(r7)
            if (r6 == 0) goto L_0x0098
            r7 = 5
            goto L_0x00d7
        L_0x00d6:
            r7 = r9
        L_0x00d7:
            switch(r7) {
                case 0: goto L_0x0101;
                case 1: goto L_0x00f3;
                case 2: goto L_0x00ed;
                case 3: goto L_0x00e7;
                case 4: goto L_0x00e1;
                case 5: goto L_0x00db;
                default: goto L_0x00da;
            }
        L_0x00da:
            goto L_0x010f
        L_0x00db:
            androidx.constraintlayout.core.state.State$Direction r6 = androidx.constraintlayout.core.state.State.Direction.BOTTOM
            r2.setBarrierDirection(r6)
            goto L_0x010f
        L_0x00e1:
            androidx.constraintlayout.core.state.State$Direction r6 = androidx.constraintlayout.core.state.State.Direction.TOP
            r2.setBarrierDirection(r6)
            goto L_0x010f
        L_0x00e7:
            androidx.constraintlayout.core.state.State$Direction r6 = androidx.constraintlayout.core.state.State.Direction.RIGHT
            r2.setBarrierDirection(r6)
            goto L_0x010f
        L_0x00ed:
            androidx.constraintlayout.core.state.State$Direction r6 = androidx.constraintlayout.core.state.State.Direction.LEFT
            r2.setBarrierDirection(r6)
            goto L_0x010f
        L_0x00f3:
            if (r0 == 0) goto L_0x00fb
            androidx.constraintlayout.core.state.State$Direction r6 = androidx.constraintlayout.core.state.State.Direction.RIGHT
            r2.setBarrierDirection(r6)
            goto L_0x010f
        L_0x00fb:
            androidx.constraintlayout.core.state.State$Direction r6 = androidx.constraintlayout.core.state.State.Direction.LEFT
            r2.setBarrierDirection(r6)
            goto L_0x010f
        L_0x0101:
            if (r0 == 0) goto L_0x0109
            androidx.constraintlayout.core.state.State$Direction r6 = androidx.constraintlayout.core.state.State.Direction.LEFT
            r2.setBarrierDirection(r6)
            goto L_0x010f
        L_0x0109:
            androidx.constraintlayout.core.state.State$Direction r6 = androidx.constraintlayout.core.state.State.Direction.RIGHT
            r2.setBarrierDirection(r6)
        L_0x010f:
        L_0x0110:
            goto L_0x0017
        L_0x0112:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.constraintlayout.core.state.ConstraintSetParser.parseBarrier(androidx.constraintlayout.core.state.State, java.lang.String, androidx.constraintlayout.core.parser.CLObject):void");
    }

    static void parseWidget(State state, LayoutVariables layoutVariables, String elementName, CLObject element) throws CLParsingException {
        parseWidget(state, layoutVariables, state.constraints(elementName), element);
    }

    /* JADX WARNING: Can't fix incorrect switch cases order */
    /* JADX WARNING: Code restructure failed: missing block: B:97:0x01b2, code lost:
        if (r0.equals("invisible") != false) goto L_0x01b6;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    static void applyAttribute(androidx.constraintlayout.core.state.State r8, androidx.constraintlayout.core.state.ConstraintSetParser.LayoutVariables r9, androidx.constraintlayout.core.state.ConstraintReference r10, androidx.constraintlayout.core.parser.CLObject r11, java.lang.String r12) throws androidx.constraintlayout.core.parser.CLParsingException {
        /*
            int r0 = r12.hashCode()
            r1 = 1
            r2 = 8
            r3 = 2
            r4 = 4
            r5 = 0
            r6 = -1
            switch(r0) {
                case -1448775240: goto L_0x011d;
                case -1364013995: goto L_0x0113;
                case -1349088399: goto L_0x0108;
                case -1249320806: goto L_0x00fd;
                case -1249320805: goto L_0x00f2;
                case -1249320804: goto L_0x00e7;
                case -1225497657: goto L_0x00dc;
                case -1225497656: goto L_0x00d0;
                case -1225497655: goto L_0x00c4;
                case -1221029593: goto L_0x00b9;
                case -1068318794: goto L_0x00ad;
                case -987906986: goto L_0x00a1;
                case -987906985: goto L_0x0095;
                case -908189618: goto L_0x0089;
                case -908189617: goto L_0x007d;
                case -247669061: goto L_0x0071;
                case -61505906: goto L_0x0064;
                case 92909918: goto L_0x0059;
                case 98116417: goto L_0x004d;
                case 111045711: goto L_0x0040;
                case 113126854: goto L_0x0034;
                case 398344448: goto L_0x0028;
                case 1404070310: goto L_0x001d;
                case 1941332754: goto L_0x0010;
                default: goto L_0x000e;
            }
        L_0x000e:
            goto L_0x0127
        L_0x0010:
            java.lang.String r0 = "visibility"
            boolean r0 = r12.equals(r0)
            if (r0 == 0) goto L_0x000e
            r0 = 16
            goto L_0x0128
        L_0x001d:
            java.lang.String r0 = "centerHorizontally"
            boolean r0 = r12.equals(r0)
            if (r0 == 0) goto L_0x000e
            r0 = 3
            goto L_0x0128
        L_0x0028:
            java.lang.String r0 = "hWeight"
            boolean r0 = r12.equals(r0)
            if (r0 == 0) goto L_0x000e
            r0 = 21
            goto L_0x0128
        L_0x0034:
            java.lang.String r0 = "width"
            boolean r0 = r12.equals(r0)
            if (r0 == 0) goto L_0x000e
            r0 = r5
            goto L_0x0128
        L_0x0040:
            java.lang.String r0 = "vBias"
            boolean r0 = r12.equals(r0)
            if (r0 == 0) goto L_0x000e
            r0 = 17
            goto L_0x0128
        L_0x004d:
            java.lang.String r0 = "hBias"
            boolean r0 = r12.equals(r0)
            if (r0 == 0) goto L_0x000e
            r0 = 19
            goto L_0x0128
        L_0x0059:
            java.lang.String r0 = "alpha"
            boolean r0 = r12.equals(r0)
            if (r0 == 0) goto L_0x000e
            r0 = 5
            goto L_0x0128
        L_0x0064:
            java.lang.String r0 = "vWeight"
            boolean r0 = r12.equals(r0)
            if (r0 == 0) goto L_0x000e
            r0 = 20
            goto L_0x0128
        L_0x0071:
            java.lang.String r0 = "hRtlBias"
            boolean r0 = r12.equals(r0)
            if (r0 == 0) goto L_0x000e
            r0 = 18
            goto L_0x0128
        L_0x007d:
            java.lang.String r0 = "scaleY"
            boolean r0 = r12.equals(r0)
            if (r0 == 0) goto L_0x000e
            r0 = 7
            goto L_0x0128
        L_0x0089:
            java.lang.String r0 = "scaleX"
            boolean r0 = r12.equals(r0)
            if (r0 == 0) goto L_0x000e
            r0 = 6
            goto L_0x0128
        L_0x0095:
            java.lang.String r0 = "pivotY"
            boolean r0 = r12.equals(r0)
            if (r0 == 0) goto L_0x000e
            r0 = 12
            goto L_0x0128
        L_0x00a1:
            java.lang.String r0 = "pivotX"
            boolean r0 = r12.equals(r0)
            if (r0 == 0) goto L_0x000e
            r0 = 11
            goto L_0x0128
        L_0x00ad:
            java.lang.String r0 = "motion"
            boolean r0 = r12.equals(r0)
            if (r0 == 0) goto L_0x000e
            r0 = 23
            goto L_0x0128
        L_0x00b9:
            java.lang.String r0 = "height"
            boolean r0 = r12.equals(r0)
            if (r0 == 0) goto L_0x000e
            r0 = r1
            goto L_0x0128
        L_0x00c4:
            java.lang.String r0 = "translationZ"
            boolean r0 = r12.equals(r0)
            if (r0 == 0) goto L_0x000e
            r0 = 10
            goto L_0x0128
        L_0x00d0:
            java.lang.String r0 = "translationY"
            boolean r0 = r12.equals(r0)
            if (r0 == 0) goto L_0x000e
            r0 = 9
            goto L_0x0128
        L_0x00dc:
            java.lang.String r0 = "translationX"
            boolean r0 = r12.equals(r0)
            if (r0 == 0) goto L_0x000e
            r0 = r2
            goto L_0x0128
        L_0x00e7:
            java.lang.String r0 = "rotationZ"
            boolean r0 = r12.equals(r0)
            if (r0 == 0) goto L_0x000e
            r0 = 15
            goto L_0x0128
        L_0x00f2:
            java.lang.String r0 = "rotationY"
            boolean r0 = r12.equals(r0)
            if (r0 == 0) goto L_0x000e
            r0 = 14
            goto L_0x0128
        L_0x00fd:
            java.lang.String r0 = "rotationX"
            boolean r0 = r12.equals(r0)
            if (r0 == 0) goto L_0x000e
            r0 = 13
            goto L_0x0128
        L_0x0108:
            java.lang.String r0 = "custom"
            boolean r0 = r12.equals(r0)
            if (r0 == 0) goto L_0x000e
            r0 = 22
            goto L_0x0128
        L_0x0113:
            java.lang.String r0 = "center"
            boolean r0 = r12.equals(r0)
            if (r0 == 0) goto L_0x000e
            r0 = r3
            goto L_0x0128
        L_0x011d:
            java.lang.String r0 = "centerVertically"
            boolean r0 = r12.equals(r0)
            if (r0 == 0) goto L_0x000e
            r0 = r4
            goto L_0x0128
        L_0x0127:
            r0 = r6
        L_0x0128:
            java.lang.String r7 = "parent"
            switch(r0) {
                case 0: goto L_0x02ce;
                case 1: goto L_0x02c1;
                case 2: goto L_0x029f;
                case 3: goto L_0x0283;
                case 4: goto L_0x0267;
                case 5: goto L_0x025a;
                case 6: goto L_0x024d;
                case 7: goto L_0x0240;
                case 8: goto L_0x022f;
                case 9: goto L_0x021e;
                case 10: goto L_0x020d;
                case 11: goto L_0x0200;
                case 12: goto L_0x01f3;
                case 13: goto L_0x01e6;
                case 14: goto L_0x01d9;
                case 15: goto L_0x01cc;
                case 16: goto L_0x018b;
                case 17: goto L_0x017e;
                case 18: goto L_0x0167;
                case 19: goto L_0x015a;
                case 20: goto L_0x014d;
                case 21: goto L_0x0140;
                case 22: goto L_0x013b;
                case 23: goto L_0x0132;
                default: goto L_0x012d;
            }
        L_0x012d:
            parseConstraint(r8, r9, r11, r10, r12)
            goto L_0x02db
        L_0x0132:
            androidx.constraintlayout.core.parser.CLElement r0 = r11.get((java.lang.String) r12)
            parseMotionProperties(r0, r10)
            goto L_0x02db
        L_0x013b:
            parseCustomProperties(r11, r10, r12)
            goto L_0x02db
        L_0x0140:
            androidx.constraintlayout.core.parser.CLElement r0 = r11.get((java.lang.String) r12)
            float r0 = r9.get(r0)
            r10.setHorizontalChainWeight(r0)
            goto L_0x02db
        L_0x014d:
            androidx.constraintlayout.core.parser.CLElement r0 = r11.get((java.lang.String) r12)
            float r0 = r9.get(r0)
            r10.setVerticalChainWeight(r0)
            goto L_0x02db
        L_0x015a:
            androidx.constraintlayout.core.parser.CLElement r0 = r11.get((java.lang.String) r12)
            float r0 = r9.get(r0)
            r10.horizontalBias(r0)
            goto L_0x02db
        L_0x0167:
            androidx.constraintlayout.core.parser.CLElement r0 = r11.get((java.lang.String) r12)
            float r0 = r9.get(r0)
            boolean r1 = r8.isRtl()
            if (r1 == 0) goto L_0x0179
            r1 = 1065353216(0x3f800000, float:1.0)
            float r0 = r1 - r0
        L_0x0179:
            r10.horizontalBias(r0)
            goto L_0x02db
        L_0x017e:
            androidx.constraintlayout.core.parser.CLElement r0 = r11.get((java.lang.String) r12)
            float r0 = r9.get(r0)
            r10.verticalBias(r0)
            goto L_0x02db
        L_0x018b:
            java.lang.String r0 = r11.getString((java.lang.String) r12)
            int r7 = r0.hashCode()
            switch(r7) {
                case -1901805651: goto L_0x01ac;
                case 3178655: goto L_0x01a2;
                case 466743410: goto L_0x0197;
                default: goto L_0x0196;
            }
        L_0x0196:
            goto L_0x01b5
        L_0x0197:
            java.lang.String r1 = "visible"
            boolean r0 = r0.equals(r1)
            if (r0 == 0) goto L_0x0196
            r1 = r5
            goto L_0x01b6
        L_0x01a2:
            java.lang.String r1 = "gone"
            boolean r0 = r0.equals(r1)
            if (r0 == 0) goto L_0x0196
            r1 = r3
            goto L_0x01b6
        L_0x01ac:
            java.lang.String r3 = "invisible"
            boolean r0 = r0.equals(r3)
            if (r0 == 0) goto L_0x0196
            goto L_0x01b6
        L_0x01b5:
            r1 = r6
        L_0x01b6:
            switch(r1) {
                case 0: goto L_0x01c6;
                case 1: goto L_0x01be;
                case 2: goto L_0x01ba;
                default: goto L_0x01b9;
            }
        L_0x01b9:
            goto L_0x01ca
        L_0x01ba:
            r10.visibility(r2)
            goto L_0x01ca
        L_0x01be:
            r10.visibility(r4)
            r0 = 0
            r10.alpha(r0)
            goto L_0x01ca
        L_0x01c6:
            r10.visibility(r5)
        L_0x01ca:
            goto L_0x02db
        L_0x01cc:
            androidx.constraintlayout.core.parser.CLElement r0 = r11.get((java.lang.String) r12)
            float r0 = r9.get(r0)
            r10.rotationZ(r0)
            goto L_0x02db
        L_0x01d9:
            androidx.constraintlayout.core.parser.CLElement r0 = r11.get((java.lang.String) r12)
            float r0 = r9.get(r0)
            r10.rotationY(r0)
            goto L_0x02db
        L_0x01e6:
            androidx.constraintlayout.core.parser.CLElement r0 = r11.get((java.lang.String) r12)
            float r0 = r9.get(r0)
            r10.rotationX(r0)
            goto L_0x02db
        L_0x01f3:
            androidx.constraintlayout.core.parser.CLElement r0 = r11.get((java.lang.String) r12)
            float r0 = r9.get(r0)
            r10.pivotY(r0)
            goto L_0x02db
        L_0x0200:
            androidx.constraintlayout.core.parser.CLElement r0 = r11.get((java.lang.String) r12)
            float r0 = r9.get(r0)
            r10.pivotX(r0)
            goto L_0x02db
        L_0x020d:
            androidx.constraintlayout.core.parser.CLElement r0 = r11.get((java.lang.String) r12)
            float r0 = r9.get(r0)
            float r1 = toPix(r8, r0)
            r10.translationZ(r1)
            goto L_0x02db
        L_0x021e:
            androidx.constraintlayout.core.parser.CLElement r0 = r11.get((java.lang.String) r12)
            float r0 = r9.get(r0)
            float r1 = toPix(r8, r0)
            r10.translationY(r1)
            goto L_0x02db
        L_0x022f:
            androidx.constraintlayout.core.parser.CLElement r0 = r11.get((java.lang.String) r12)
            float r0 = r9.get(r0)
            float r1 = toPix(r8, r0)
            r10.translationX(r1)
            goto L_0x02db
        L_0x0240:
            androidx.constraintlayout.core.parser.CLElement r0 = r11.get((java.lang.String) r12)
            float r0 = r9.get(r0)
            r10.scaleY(r0)
            goto L_0x02db
        L_0x024d:
            androidx.constraintlayout.core.parser.CLElement r0 = r11.get((java.lang.String) r12)
            float r0 = r9.get(r0)
            r10.scaleX(r0)
            goto L_0x02db
        L_0x025a:
            androidx.constraintlayout.core.parser.CLElement r0 = r11.get((java.lang.String) r12)
            float r0 = r9.get(r0)
            r10.alpha(r0)
            goto L_0x02db
        L_0x0267:
            java.lang.String r0 = r11.getString((java.lang.String) r12)
            boolean r1 = r0.equals(r7)
            if (r1 == 0) goto L_0x0278
            java.lang.Integer r1 = androidx.constraintlayout.core.state.State.PARENT
            androidx.constraintlayout.core.state.ConstraintReference r1 = r8.constraints(r1)
            goto L_0x027c
        L_0x0278:
            androidx.constraintlayout.core.state.ConstraintReference r1 = r8.constraints(r0)
        L_0x027c:
            r10.topToTop(r1)
            r10.bottomToBottom(r1)
            goto L_0x02db
        L_0x0283:
            java.lang.String r0 = r11.getString((java.lang.String) r12)
            boolean r1 = r0.equals(r7)
            if (r1 == 0) goto L_0x0294
            java.lang.Integer r1 = androidx.constraintlayout.core.state.State.PARENT
            androidx.constraintlayout.core.state.ConstraintReference r1 = r8.constraints(r1)
            goto L_0x0298
        L_0x0294:
            androidx.constraintlayout.core.state.ConstraintReference r1 = r8.constraints(r0)
        L_0x0298:
            r10.startToStart(r1)
            r10.endToEnd(r1)
            goto L_0x02db
        L_0x029f:
            java.lang.String r0 = r11.getString((java.lang.String) r12)
            boolean r1 = r0.equals(r7)
            if (r1 == 0) goto L_0x02b0
            java.lang.Integer r1 = androidx.constraintlayout.core.state.State.PARENT
            androidx.constraintlayout.core.state.ConstraintReference r1 = r8.constraints(r1)
            goto L_0x02b4
        L_0x02b0:
            androidx.constraintlayout.core.state.ConstraintReference r1 = r8.constraints(r0)
        L_0x02b4:
            r10.startToStart(r1)
            r10.endToEnd(r1)
            r10.topToTop(r1)
            r10.bottomToBottom(r1)
            goto L_0x02db
        L_0x02c1:
            androidx.constraintlayout.core.state.CorePixelDp r0 = r8.getDpToPixel()
            androidx.constraintlayout.core.state.Dimension r0 = parseDimension(r11, r12, r8, r0)
            r10.setHeight(r0)
            goto L_0x02db
        L_0x02ce:
            androidx.constraintlayout.core.state.CorePixelDp r0 = r8.getDpToPixel()
            androidx.constraintlayout.core.state.Dimension r0 = parseDimension(r11, r12, r8, r0)
            r10.setWidth(r0)
        L_0x02db:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.constraintlayout.core.state.ConstraintSetParser.applyAttribute(androidx.constraintlayout.core.state.State, androidx.constraintlayout.core.state.ConstraintSetParser$LayoutVariables, androidx.constraintlayout.core.state.ConstraintReference, androidx.constraintlayout.core.parser.CLObject, java.lang.String):void");
    }

    static void parseWidget(State state, LayoutVariables layoutVariables, ConstraintReference reference, CLObject element) throws CLParsingException {
        if (reference.getWidth() == null) {
            reference.setWidth(Dimension.createWrap());
        }
        if (reference.getHeight() == null) {
            reference.setHeight(Dimension.createWrap());
        }
        ArrayList<String> constraints = element.names();
        if (constraints != null) {
            Iterator<String> it = constraints.iterator();
            while (it.hasNext()) {
                applyAttribute(state, layoutVariables, reference, element, it.next());
            }
        }
    }

    static void parseCustomProperties(CLObject element, ConstraintReference reference, String constraintName) throws CLParsingException {
        ArrayList<String> properties;
        CLObject json = element.getObjectOrNull(constraintName);
        if (json != null && (properties = json.names()) != null) {
            Iterator<String> it = properties.iterator();
            while (it.hasNext()) {
                String property = it.next();
                CLElement value = json.get(property);
                if (value instanceof CLNumber) {
                    reference.addCustomFloat(property, value.getFloat());
                } else if (value instanceof CLString) {
                    long it2 = parseColorString(value.content());
                    if (it2 != -1) {
                        reference.addCustomColor(property, (int) it2);
                    }
                }
            }
        }
    }

    private static int indexOf(String val, String... types) {
        for (int i = 0; i < types.length; i++) {
            if (types[i].equals(val)) {
                return i;
            }
        }
        return -1;
    }

    /* JADX WARNING: Can't fix incorrect switch cases order */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private static void parseMotionProperties(androidx.constraintlayout.core.parser.CLElement r14, androidx.constraintlayout.core.state.ConstraintReference r15) throws androidx.constraintlayout.core.parser.CLParsingException {
        /*
            boolean r0 = r14 instanceof androidx.constraintlayout.core.parser.CLObject
            if (r0 != 0) goto L_0x0005
            return
        L_0x0005:
            r0 = r14
            androidx.constraintlayout.core.parser.CLObject r0 = (androidx.constraintlayout.core.parser.CLObject) r0
            androidx.constraintlayout.core.motion.utils.TypedBundle r1 = new androidx.constraintlayout.core.motion.utils.TypedBundle
            r1.<init>()
            java.util.ArrayList r2 = r0.names()
            if (r2 != 0) goto L_0x0014
            return
        L_0x0014:
            java.util.Iterator r3 = r2.iterator()
        L_0x0018:
            boolean r4 = r3.hasNext()
            if (r4 == 0) goto L_0x011b
            java.lang.Object r4 = r3.next()
            java.lang.String r4 = (java.lang.String) r4
            int r5 = r4.hashCode()
            r6 = 4
            r7 = 3
            r8 = -1
            r9 = 0
            r10 = 2
            r11 = 1
            switch(r5) {
                case -1897525331: goto L_0x005a;
                case -1310311125: goto L_0x0050;
                case -1285003983: goto L_0x0046;
                case -791482387: goto L_0x003c;
                case -236944793: goto L_0x0032;
                default: goto L_0x0031;
            }
        L_0x0031:
            goto L_0x0065
        L_0x0032:
            java.lang.String r5 = "relativeTo"
            boolean r5 = r4.equals(r5)
            if (r5 == 0) goto L_0x0031
            r5 = r11
            goto L_0x0066
        L_0x003c:
            java.lang.String r5 = "pathArc"
            boolean r5 = r4.equals(r5)
            if (r5 == 0) goto L_0x0031
            r5 = r9
            goto L_0x0066
        L_0x0046:
            java.lang.String r5 = "quantize"
            boolean r5 = r4.equals(r5)
            if (r5 == 0) goto L_0x0031
            r5 = r6
            goto L_0x0066
        L_0x0050:
            java.lang.String r5 = "easing"
            boolean r5 = r4.equals(r5)
            if (r5 == 0) goto L_0x0031
            r5 = r10
            goto L_0x0066
        L_0x005a:
            java.lang.String r5 = "stagger"
            boolean r5 = r4.equals(r5)
            if (r5 == 0) goto L_0x0031
            r5 = r7
            goto L_0x0066
        L_0x0065:
            r5 = r8
        L_0x0066:
            switch(r5) {
                case 0: goto L_0x00c4;
                case 1: goto L_0x00b9;
                case 2: goto L_0x00af;
                case 3: goto L_0x00a5;
                case 4: goto L_0x006b;
                default: goto L_0x0069;
            }
        L_0x0069:
            goto L_0x0119
        L_0x006b:
            androidx.constraintlayout.core.parser.CLElement r5 = r0.get((java.lang.String) r4)
            boolean r6 = r5 instanceof androidx.constraintlayout.core.parser.CLArray
            r7 = 610(0x262, float:8.55E-43)
            if (r6 == 0) goto L_0x009d
            r6 = r5
            androidx.constraintlayout.core.parser.CLArray r6 = (androidx.constraintlayout.core.parser.CLArray) r6
            int r8 = r6.size()
            if (r8 <= 0) goto L_0x009b
            int r9 = r6.getInt((int) r9)
            r1.add((int) r7, (int) r9)
            if (r8 <= r11) goto L_0x009b
            r7 = 611(0x263, float:8.56E-43)
            java.lang.String r9 = r6.getString((int) r11)
            r1.add((int) r7, (java.lang.String) r9)
            if (r8 <= r10) goto L_0x009b
            r7 = 602(0x25a, float:8.44E-43)
            float r9 = r6.getFloat((int) r10)
            r1.add((int) r7, (float) r9)
        L_0x009b:
            goto L_0x0119
        L_0x009d:
            int r6 = r0.getInt((java.lang.String) r4)
            r1.add((int) r7, (int) r6)
            goto L_0x0119
        L_0x00a5:
            r5 = 600(0x258, float:8.41E-43)
            float r6 = r0.getFloat((java.lang.String) r4)
            r1.add((int) r5, (float) r6)
            goto L_0x0119
        L_0x00af:
            r5 = 603(0x25b, float:8.45E-43)
            java.lang.String r6 = r0.getString((java.lang.String) r4)
            r1.add((int) r5, (java.lang.String) r6)
            goto L_0x0119
        L_0x00b9:
            java.lang.String r5 = r0.getString((java.lang.String) r4)
            r6 = 605(0x25d, float:8.48E-43)
            r1.add((int) r6, (java.lang.String) r5)
            goto L_0x0119
        L_0x00c4:
            java.lang.String r5 = r0.getString((java.lang.String) r4)
            r12 = 6
            java.lang.String[] r12 = new java.lang.String[r12]
            java.lang.String r13 = "none"
            r12[r9] = r13
            java.lang.String r9 = "startVertical"
            r12[r11] = r9
            java.lang.String r9 = "startHorizontal"
            r12[r10] = r9
            java.lang.String r9 = "flip"
            r12[r7] = r9
            java.lang.String r7 = "below"
            r12[r6] = r7
            r6 = 5
            java.lang.String r7 = "above"
            r12[r6] = r7
            int r6 = indexOf(r5, r12)
            if (r6 != r8) goto L_0x0113
            java.io.PrintStream r7 = java.lang.System.err
            java.lang.StringBuilder r8 = new java.lang.StringBuilder
            r8.<init>()
            int r9 = r0.getLine()
            java.lang.StringBuilder r8 = r8.append(r9)
            java.lang.String r9 = " pathArc = '"
            java.lang.StringBuilder r8 = r8.append(r9)
            java.lang.StringBuilder r8 = r8.append(r5)
            java.lang.String r9 = "'"
            java.lang.StringBuilder r8 = r8.append(r9)
            java.lang.String r8 = r8.toString()
            r7.println(r8)
            goto L_0x0119
        L_0x0113:
            r7 = 607(0x25f, float:8.5E-43)
            r1.add((int) r7, (int) r6)
        L_0x0119:
            goto L_0x0018
        L_0x011b:
            r15.mMotionProperties = r1
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.constraintlayout.core.state.ConstraintSetParser.parseMotionProperties(androidx.constraintlayout.core.parser.CLElement, androidx.constraintlayout.core.state.ConstraintReference):void");
    }

    /* JADX WARNING: Can't fix incorrect switch cases order */
    /* JADX WARNING: Code restructure failed: missing block: B:100:0x01ae, code lost:
        switch(r12) {
            case 0: goto L_0x01c1;
            case 1: goto L_0x01bd;
            case 2: goto L_0x01b2;
            default: goto L_0x01b1;
        };
     */
    /* JADX WARNING: Code restructure failed: missing block: B:101:0x01b2, code lost:
        r0.baselineNeededFor(r2.getKey());
        r3.topToBaseline(r2);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:102:0x01bd, code lost:
        r3.topToBottom(r2);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:103:0x01c1, code lost:
        r3.topToTop(r2);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:104:0x01c5, code lost:
        r15 = 2;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:105:0x01c7, code lost:
        r12 = r1.get(r7.get(1));
        r13 = 0.0f;
        r15 = 2;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:106:0x01d6, code lost:
        if (r7.size() <= 2) goto L_0x01e4;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:107:0x01d8, code lost:
        r13 = toPix(r0, r1.get(r7.getOrNull(2)));
     */
    /* JADX WARNING: Code restructure failed: missing block: B:108:0x01e4, code lost:
        r3.circularConstraint(r2, r12, r13);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:109:0x01e8, code lost:
        r12 = false;
        r13 = true;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:110:0x01ec, code lost:
        if (r12 == false) goto L_0x0243;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:112:0x01f2, code lost:
        switch(r8.hashCode()) {
            case 100571: goto L_0x020d;
            case 3317767: goto L_0x0205;
            case 108511772: goto L_0x01fd;
            case 109757538: goto L_0x01f6;
            default: goto L_0x01f5;
        };
     */
    /* JADX WARNING: Code restructure failed: missing block: B:114:0x01fa, code lost:
        if (r8.equals("start") == false) goto L_0x0215;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:116:0x0201, code lost:
        if (r8.equals("right") == false) goto L_0x0215;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:117:0x0203, code lost:
        r15 = 1;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:119:0x0209, code lost:
        if (r8.equals("left") == false) goto L_0x0215;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:120:0x020b, code lost:
        r15 = 0;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:122:0x0211, code lost:
        if (r8.equals("end") == false) goto L_0x0215;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:123:0x0213, code lost:
        r15 = 3;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:124:0x0215, code lost:
        r15 = 65535;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:125:0x0217, code lost:
        switch(r15) {
            case 0: goto L_0x022b;
            case 1: goto L_0x0227;
            case 2: goto L_0x0223;
            case 3: goto L_0x021b;
            default: goto L_0x021a;
        };
     */
    /* JADX WARNING: Code restructure failed: missing block: B:126:0x021b, code lost:
        if (r5 != false) goto L_0x021f;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:127:0x021d, code lost:
        r6 = true;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:128:0x021f, code lost:
        r6 = false;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:129:0x0220, code lost:
        r20 = r6;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:130:0x0223, code lost:
        r20 = r5;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:131:0x0227, code lost:
        r20 = false;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:132:0x022b, code lost:
        r20 = true;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:133:0x022e, code lost:
        if (r13 == false) goto L_0x023a;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:134:0x0230, code lost:
        if (r20 == false) goto L_0x0236;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:135:0x0232, code lost:
        r3.leftToLeft(r2);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:136:0x0236, code lost:
        r3.leftToRight(r2);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:137:0x023a, code lost:
        if (r20 == false) goto L_0x0240;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:138:0x023c, code lost:
        r3.rightToLeft(r2);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:139:0x0240, code lost:
        r3.rightToRight(r2);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:140:0x0243, code lost:
        r3.margin((java.lang.Object) java.lang.Float.valueOf(r18)).marginGone((java.lang.Object) java.lang.Float.valueOf(r19));
        r2 = r26;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:153:0x0285, code lost:
        if (r4.equals("top") != false) goto L_0x02a2;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:175:?, code lost:
        return;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:32:0x00b7, code lost:
        r21 = r15;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:36:0x00c5, code lost:
        r21 = r15;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:43:0x00e0, code lost:
        r17 = 65535;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:44:0x00e2, code lost:
        switch(r17) {
            case 0: goto L_0x01c7;
            case 1: goto L_0x018c;
            case 2: goto L_0x0151;
            case 3: goto L_0x0100;
            case 4: goto L_0x00fb;
            case 5: goto L_0x00f6;
            case 6: goto L_0x00f1;
            case 7: goto L_0x00e8;
            default: goto L_0x00e5;
        };
     */
    /* JADX WARNING: Code restructure failed: missing block: B:45:0x00e5, code lost:
        r15 = 2;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:46:0x00e8, code lost:
        r12 = true;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:47:0x00e9, code lost:
        if (r5 != false) goto L_0x00ed;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:48:0x00eb, code lost:
        r13 = true;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:49:0x00ed, code lost:
        r13 = false;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:50:0x00ee, code lost:
        r15 = 2;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:51:0x00f1, code lost:
        r12 = true;
        r13 = r5;
        r15 = 2;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:52:0x00f6, code lost:
        r12 = true;
        r13 = false;
        r15 = 2;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:53:0x00fb, code lost:
        r12 = true;
        r13 = true;
        r15 = 2;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:55:0x0104, code lost:
        switch(r8.hashCode()) {
            case -1720785339: goto L_0x0118;
            case -1383228885: goto L_0x0110;
            case 115029: goto L_0x0108;
            default: goto L_0x0107;
        };
     */
    /* JADX WARNING: Code restructure failed: missing block: B:57:0x010c, code lost:
        if (r8.equals("top") == false) goto L_0x0120;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:58:0x010e, code lost:
        r12 = 1;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:60:0x0114, code lost:
        if (r8.equals("bottom") == false) goto L_0x0120;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:61:0x0116, code lost:
        r12 = 2;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:63:0x011c, code lost:
        if (r8.equals("baseline") == false) goto L_0x0120;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:64:0x011e, code lost:
        r12 = 0;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:65:0x0120, code lost:
        r12 = 65535;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:66:0x0122, code lost:
        switch(r12) {
            case 0: goto L_0x013c;
            case 1: goto L_0x0131;
            case 2: goto L_0x0126;
            default: goto L_0x0125;
        };
     */
    /* JADX WARNING: Code restructure failed: missing block: B:67:0x0126, code lost:
        r0.baselineNeededFor(r27.getKey());
        r3.baselineToBottom(r2);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:68:0x0131, code lost:
        r0.baselineNeededFor(r27.getKey());
        r3.baselineToTop(r2);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:69:0x013c, code lost:
        r0.baselineNeededFor(r27.getKey());
        r0.baselineNeededFor(r2.getKey());
        r3.baselineToBaseline(r2);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:70:0x014e, code lost:
        r15 = 2;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:72:0x0155, code lost:
        switch(r8.hashCode()) {
            case -1720785339: goto L_0x0169;
            case -1383228885: goto L_0x0161;
            case 115029: goto L_0x0159;
            default: goto L_0x0158;
        };
     */
    /* JADX WARNING: Code restructure failed: missing block: B:74:0x015d, code lost:
        if (r8.equals("top") == false) goto L_0x0171;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:75:0x015f, code lost:
        r12 = 0;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:77:0x0165, code lost:
        if (r8.equals("bottom") == false) goto L_0x0171;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:78:0x0167, code lost:
        r12 = 1;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:80:0x016d, code lost:
        if (r8.equals("baseline") == false) goto L_0x0171;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:81:0x016f, code lost:
        r12 = 2;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:82:0x0171, code lost:
        r12 = 65535;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:83:0x0173, code lost:
        switch(r12) {
            case 0: goto L_0x0186;
            case 1: goto L_0x0182;
            case 2: goto L_0x0177;
            default: goto L_0x0176;
        };
     */
    /* JADX WARNING: Code restructure failed: missing block: B:84:0x0177, code lost:
        r0.baselineNeededFor(r2.getKey());
        r3.bottomToBaseline(r2);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:85:0x0182, code lost:
        r3.bottomToBottom(r2);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:86:0x0186, code lost:
        r3.bottomToTop(r2);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:87:0x018a, code lost:
        r15 = 2;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:89:0x0190, code lost:
        switch(r8.hashCode()) {
            case -1720785339: goto L_0x01a4;
            case -1383228885: goto L_0x019c;
            case 115029: goto L_0x0194;
            default: goto L_0x0193;
        };
     */
    /* JADX WARNING: Code restructure failed: missing block: B:91:0x0198, code lost:
        if (r8.equals("top") == false) goto L_0x01ac;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:92:0x019a, code lost:
        r12 = 0;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:94:0x01a0, code lost:
        if (r8.equals("bottom") == false) goto L_0x01ac;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:95:0x01a2, code lost:
        r12 = 1;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:97:0x01a8, code lost:
        if (r8.equals("baseline") == false) goto L_0x01ac;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:98:0x01aa, code lost:
        r12 = 2;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:99:0x01ac, code lost:
        r12 = 65535;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    static void parseConstraint(androidx.constraintlayout.core.state.State r24, androidx.constraintlayout.core.state.ConstraintSetParser.LayoutVariables r25, androidx.constraintlayout.core.parser.CLObject r26, androidx.constraintlayout.core.state.ConstraintReference r27, java.lang.String r28) throws androidx.constraintlayout.core.parser.CLParsingException {
        /*
            r0 = r24
            r1 = r25
            r2 = r26
            r3 = r27
            r4 = r28
            boolean r5 = r24.isRtl()
            r6 = 1
            r5 = r5 ^ r6
            androidx.constraintlayout.core.parser.CLArray r7 = r2.getArrayOrNull(r4)
            java.lang.String r9 = "parent"
            java.lang.String r10 = "start"
            java.lang.String r11 = "end"
            java.lang.String r12 = "top"
            java.lang.String r13 = "bottom"
            java.lang.String r14 = "baseline"
            r16 = -1
            r8 = 0
            if (r7 == 0) goto L_0x0256
            int r15 = r7.size()
            if (r15 <= r6) goto L_0x0256
            java.lang.String r15 = r7.getString((int) r8)
            java.lang.String r8 = r7.getStringOrNull((int) r6)
            r18 = 0
            r19 = 0
            int r6 = r7.size()
            r2 = 2
            if (r6 <= r2) goto L_0x004c
            androidx.constraintlayout.core.parser.CLElement r6 = r7.getOrNull((int) r2)
            float r2 = r1.get(r6)
            float r18 = toPix(r0, r2)
        L_0x004c:
            int r2 = r7.size()
            r6 = 3
            if (r2 <= r6) goto L_0x005f
            androidx.constraintlayout.core.parser.CLElement r2 = r7.getOrNull((int) r6)
            float r6 = r1.get(r2)
            float r19 = toPix(r0, r6)
        L_0x005f:
            boolean r2 = r15.equals(r9)
            if (r2 == 0) goto L_0x006c
            java.lang.Integer r2 = androidx.constraintlayout.core.state.State.PARENT
            androidx.constraintlayout.core.state.ConstraintReference r2 = r0.constraints(r2)
            goto L_0x0070
        L_0x006c:
            androidx.constraintlayout.core.state.ConstraintReference r2 = r0.constraints(r15)
        L_0x0070:
            r6 = 0
            r9 = 1
            r20 = 1
            int r21 = r28.hashCode()
            r22 = r6
            java.lang.String r6 = "right"
            r23 = r9
            java.lang.String r9 = "left"
            switch(r21) {
                case -1720785339: goto L_0x00d5;
                case -1498085729: goto L_0x00c8;
                case -1383228885: goto L_0x00ba;
                case 100571: goto L_0x00af;
                case 115029: goto L_0x00a4;
                case 3317767: goto L_0x0099;
                case 108511772: goto L_0x0090;
                case 109757538: goto L_0x0087;
                default: goto L_0x0084;
            }
        L_0x0084:
            r21 = r15
            goto L_0x00e0
        L_0x0087:
            boolean r17 = r4.equals(r10)
            if (r17 == 0) goto L_0x00c5
            r17 = 6
            goto L_0x00b7
        L_0x0090:
            boolean r17 = r4.equals(r6)
            if (r17 == 0) goto L_0x00c5
            r17 = 5
            goto L_0x00b7
        L_0x0099:
            boolean r21 = r4.equals(r9)
            if (r21 == 0) goto L_0x00c5
            r21 = r15
            r17 = 4
            goto L_0x00e2
        L_0x00a4:
            boolean r17 = r4.equals(r12)
            if (r17 == 0) goto L_0x00c5
            r21 = r15
            r17 = 1
            goto L_0x00e2
        L_0x00af:
            boolean r17 = r4.equals(r11)
            if (r17 == 0) goto L_0x00c5
            r17 = 7
        L_0x00b7:
            r21 = r15
            goto L_0x00e2
        L_0x00ba:
            boolean r17 = r4.equals(r13)
            if (r17 == 0) goto L_0x00c5
            r21 = r15
            r17 = 2
            goto L_0x00e2
        L_0x00c5:
            r21 = r15
            goto L_0x00e0
        L_0x00c8:
            r21 = r15
            java.lang.String r15 = "circular"
            boolean r15 = r4.equals(r15)
            if (r15 == 0) goto L_0x00e0
            r17 = 0
            goto L_0x00e2
        L_0x00d5:
            r21 = r15
            boolean r15 = r4.equals(r14)
            if (r15 == 0) goto L_0x00e0
            r17 = 3
            goto L_0x00e2
        L_0x00e0:
            r17 = r16
        L_0x00e2:
            switch(r17) {
                case 0: goto L_0x01c7;
                case 1: goto L_0x018c;
                case 2: goto L_0x0151;
                case 3: goto L_0x0100;
                case 4: goto L_0x00fb;
                case 5: goto L_0x00f6;
                case 6: goto L_0x00f1;
                case 7: goto L_0x00e8;
                default: goto L_0x00e5;
            }
        L_0x00e5:
            r15 = 2
            goto L_0x01e8
        L_0x00e8:
            r12 = 1
            if (r5 != 0) goto L_0x00ed
            r13 = 1
            goto L_0x00ee
        L_0x00ed:
            r13 = 0
        L_0x00ee:
            r15 = 2
            goto L_0x01ec
        L_0x00f1:
            r12 = 1
            r13 = r5
            r15 = 2
            goto L_0x01ec
        L_0x00f6:
            r12 = 1
            r13 = 0
            r15 = 2
            goto L_0x01ec
        L_0x00fb:
            r12 = 1
            r13 = 1
            r15 = 2
            goto L_0x01ec
        L_0x0100:
            int r15 = r8.hashCode()
            switch(r15) {
                case -1720785339: goto L_0x0118;
                case -1383228885: goto L_0x0110;
                case 115029: goto L_0x0108;
                default: goto L_0x0107;
            }
        L_0x0107:
            goto L_0x0120
        L_0x0108:
            boolean r12 = r8.equals(r12)
            if (r12 == 0) goto L_0x0107
            r12 = 1
            goto L_0x0122
        L_0x0110:
            boolean r12 = r8.equals(r13)
            if (r12 == 0) goto L_0x0107
            r12 = 2
            goto L_0x0122
        L_0x0118:
            boolean r12 = r8.equals(r14)
            if (r12 == 0) goto L_0x0107
            r12 = 0
            goto L_0x0122
        L_0x0120:
            r12 = r16
        L_0x0122:
            switch(r12) {
                case 0: goto L_0x013c;
                case 1: goto L_0x0131;
                case 2: goto L_0x0126;
                default: goto L_0x0125;
            }
        L_0x0125:
            goto L_0x014e
        L_0x0126:
            java.lang.Object r12 = r27.getKey()
            r0.baselineNeededFor(r12)
            r3.baselineToBottom(r2)
            goto L_0x014e
        L_0x0131:
            java.lang.Object r12 = r27.getKey()
            r0.baselineNeededFor(r12)
            r3.baselineToTop(r2)
            goto L_0x014e
        L_0x013c:
            java.lang.Object r12 = r27.getKey()
            r0.baselineNeededFor(r12)
            java.lang.Object r12 = r2.getKey()
            r0.baselineNeededFor(r12)
            r3.baselineToBaseline(r2)
        L_0x014e:
            r15 = 2
            goto L_0x01e8
        L_0x0151:
            int r15 = r8.hashCode()
            switch(r15) {
                case -1720785339: goto L_0x0169;
                case -1383228885: goto L_0x0161;
                case 115029: goto L_0x0159;
                default: goto L_0x0158;
            }
        L_0x0158:
            goto L_0x0171
        L_0x0159:
            boolean r12 = r8.equals(r12)
            if (r12 == 0) goto L_0x0158
            r12 = 0
            goto L_0x0173
        L_0x0161:
            boolean r12 = r8.equals(r13)
            if (r12 == 0) goto L_0x0158
            r12 = 1
            goto L_0x0173
        L_0x0169:
            boolean r12 = r8.equals(r14)
            if (r12 == 0) goto L_0x0158
            r12 = 2
            goto L_0x0173
        L_0x0171:
            r12 = r16
        L_0x0173:
            switch(r12) {
                case 0: goto L_0x0186;
                case 1: goto L_0x0182;
                case 2: goto L_0x0177;
                default: goto L_0x0176;
            }
        L_0x0176:
            goto L_0x018a
        L_0x0177:
            java.lang.Object r12 = r2.getKey()
            r0.baselineNeededFor(r12)
            r3.bottomToBaseline(r2)
            goto L_0x018a
        L_0x0182:
            r3.bottomToBottom(r2)
            goto L_0x018a
        L_0x0186:
            r3.bottomToTop(r2)
        L_0x018a:
            r15 = 2
            goto L_0x01e8
        L_0x018c:
            int r15 = r8.hashCode()
            switch(r15) {
                case -1720785339: goto L_0x01a4;
                case -1383228885: goto L_0x019c;
                case 115029: goto L_0x0194;
                default: goto L_0x0193;
            }
        L_0x0193:
            goto L_0x01ac
        L_0x0194:
            boolean r12 = r8.equals(r12)
            if (r12 == 0) goto L_0x0193
            r12 = 0
            goto L_0x01ae
        L_0x019c:
            boolean r12 = r8.equals(r13)
            if (r12 == 0) goto L_0x0193
            r12 = 1
            goto L_0x01ae
        L_0x01a4:
            boolean r12 = r8.equals(r14)
            if (r12 == 0) goto L_0x0193
            r12 = 2
            goto L_0x01ae
        L_0x01ac:
            r12 = r16
        L_0x01ae:
            switch(r12) {
                case 0: goto L_0x01c1;
                case 1: goto L_0x01bd;
                case 2: goto L_0x01b2;
                default: goto L_0x01b1;
            }
        L_0x01b1:
            goto L_0x01c5
        L_0x01b2:
            java.lang.Object r12 = r2.getKey()
            r0.baselineNeededFor(r12)
            r3.topToBaseline(r2)
            goto L_0x01c5
        L_0x01bd:
            r3.topToBottom(r2)
            goto L_0x01c5
        L_0x01c1:
            r3.topToTop(r2)
        L_0x01c5:
            r15 = 2
            goto L_0x01e8
        L_0x01c7:
            r15 = 1
            androidx.constraintlayout.core.parser.CLElement r12 = r7.get((int) r15)
            float r12 = r1.get(r12)
            r13 = 0
            int r14 = r7.size()
            r15 = 2
            if (r14 <= r15) goto L_0x01e4
            androidx.constraintlayout.core.parser.CLElement r14 = r7.getOrNull((int) r15)
            float r13 = r1.get(r14)
            float r13 = toPix(r0, r13)
        L_0x01e4:
            r3.circularConstraint(r2, r12, r13)
        L_0x01e8:
            r12 = r22
            r13 = r23
        L_0x01ec:
            if (r12 == 0) goto L_0x0243
            int r14 = r8.hashCode()
            switch(r14) {
                case 100571: goto L_0x020d;
                case 3317767: goto L_0x0205;
                case 108511772: goto L_0x01fd;
                case 109757538: goto L_0x01f6;
                default: goto L_0x01f5;
            }
        L_0x01f5:
            goto L_0x0215
        L_0x01f6:
            boolean r6 = r8.equals(r10)
            if (r6 == 0) goto L_0x01f5
            goto L_0x0217
        L_0x01fd:
            boolean r6 = r8.equals(r6)
            if (r6 == 0) goto L_0x01f5
            r15 = 1
            goto L_0x0217
        L_0x0205:
            boolean r6 = r8.equals(r9)
            if (r6 == 0) goto L_0x01f5
            r15 = 0
            goto L_0x0217
        L_0x020d:
            boolean r6 = r8.equals(r11)
            if (r6 == 0) goto L_0x01f5
            r15 = 3
            goto L_0x0217
        L_0x0215:
            r15 = r16
        L_0x0217:
            switch(r15) {
                case 0: goto L_0x022b;
                case 1: goto L_0x0227;
                case 2: goto L_0x0223;
                case 3: goto L_0x021b;
                default: goto L_0x021a;
            }
        L_0x021a:
            goto L_0x022e
        L_0x021b:
            if (r5 != 0) goto L_0x021f
            r6 = 1
            goto L_0x0220
        L_0x021f:
            r6 = 0
        L_0x0220:
            r20 = r6
            goto L_0x022e
        L_0x0223:
            r6 = r5
            r20 = r6
            goto L_0x022e
        L_0x0227:
            r6 = 0
            r20 = r6
            goto L_0x022e
        L_0x022b:
            r6 = 1
            r20 = r6
        L_0x022e:
            if (r13 == 0) goto L_0x023a
            if (r20 == 0) goto L_0x0236
            r3.leftToLeft(r2)
            goto L_0x0243
        L_0x0236:
            r3.leftToRight(r2)
            goto L_0x0243
        L_0x023a:
            if (r20 == 0) goto L_0x0240
            r3.rightToLeft(r2)
            goto L_0x0243
        L_0x0240:
            r3.rightToRight(r2)
        L_0x0243:
            java.lang.Float r6 = java.lang.Float.valueOf(r18)
            androidx.constraintlayout.core.state.ConstraintReference r6 = r3.margin((java.lang.Object) r6)
            java.lang.Float r9 = java.lang.Float.valueOf(r19)
            r6.marginGone((java.lang.Object) r9)
            r2 = r26
            goto L_0x02d4
        L_0x0256:
            r15 = 2
            r2 = r26
            java.lang.String r6 = r2.getStringOrNull((java.lang.String) r4)
            if (r6 == 0) goto L_0x02d4
            boolean r8 = r6.equals(r9)
            if (r8 == 0) goto L_0x026c
            java.lang.Integer r8 = androidx.constraintlayout.core.state.State.PARENT
            androidx.constraintlayout.core.state.ConstraintReference r8 = r0.constraints(r8)
            goto L_0x0270
        L_0x026c:
            androidx.constraintlayout.core.state.ConstraintReference r8 = r0.constraints(r6)
        L_0x0270:
            int r9 = r28.hashCode()
            switch(r9) {
                case -1720785339: goto L_0x0298;
                case -1383228885: goto L_0x0290;
                case 100571: goto L_0x0288;
                case 115029: goto L_0x0281;
                case 109757538: goto L_0x0279;
                default: goto L_0x0278;
            }
        L_0x0278:
            goto L_0x02a0
        L_0x0279:
            boolean r9 = r4.equals(r10)
            if (r9 == 0) goto L_0x0278
            r15 = 0
            goto L_0x02a2
        L_0x0281:
            boolean r9 = r4.equals(r12)
            if (r9 == 0) goto L_0x0278
            goto L_0x02a2
        L_0x0288:
            boolean r9 = r4.equals(r11)
            if (r9 == 0) goto L_0x0278
            r15 = 1
            goto L_0x02a2
        L_0x0290:
            boolean r9 = r4.equals(r13)
            if (r9 == 0) goto L_0x0278
            r15 = 3
            goto L_0x02a2
        L_0x0298:
            boolean r9 = r4.equals(r14)
            if (r9 == 0) goto L_0x0278
            r15 = 4
            goto L_0x02a2
        L_0x02a0:
            r15 = r16
        L_0x02a2:
            switch(r15) {
                case 0: goto L_0x02ca;
                case 1: goto L_0x02c0;
                case 2: goto L_0x02bc;
                case 3: goto L_0x02b8;
                case 4: goto L_0x02a6;
                default: goto L_0x02a5;
            }
        L_0x02a5:
            goto L_0x02d4
        L_0x02a6:
            java.lang.Object r9 = r27.getKey()
            r0.baselineNeededFor(r9)
            java.lang.Object r9 = r8.getKey()
            r0.baselineNeededFor(r9)
            r3.baselineToBaseline(r8)
            goto L_0x02d4
        L_0x02b8:
            r3.bottomToBottom(r8)
            goto L_0x02d4
        L_0x02bc:
            r3.topToTop(r8)
            goto L_0x02d4
        L_0x02c0:
            if (r5 == 0) goto L_0x02c6
            r3.rightToRight(r8)
            goto L_0x02d4
        L_0x02c6:
            r3.leftToLeft(r8)
            goto L_0x02d4
        L_0x02ca:
            if (r5 == 0) goto L_0x02d0
            r3.leftToLeft(r8)
            goto L_0x02d4
        L_0x02d0:
            r3.rightToRight(r8)
        L_0x02d4:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.constraintlayout.core.state.ConstraintSetParser.parseConstraint(androidx.constraintlayout.core.state.State, androidx.constraintlayout.core.state.ConstraintSetParser$LayoutVariables, androidx.constraintlayout.core.parser.CLObject, androidx.constraintlayout.core.state.ConstraintReference, java.lang.String):void");
    }

    /* JADX WARNING: Can't fix incorrect switch cases order */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    static androidx.constraintlayout.core.state.Dimension parseDimensionMode(java.lang.String r5) {
        /*
            r0 = 0
            androidx.constraintlayout.core.state.Dimension r1 = androidx.constraintlayout.core.state.Dimension.createFixed((int) r0)
            int r2 = r5.hashCode()
            switch(r2) {
                case -1460244870: goto L_0x002d;
                case -995424086: goto L_0x0023;
                case -895684237: goto L_0x0018;
                case 3657802: goto L_0x000d;
                default: goto L_0x000c;
            }
        L_0x000c:
            goto L_0x0037
        L_0x000d:
            java.lang.String r2 = "wrap"
            boolean r2 = r5.equals(r2)
            if (r2 == 0) goto L_0x000c
            r2 = r0
            goto L_0x0038
        L_0x0018:
            java.lang.String r2 = "spread"
            boolean r2 = r5.equals(r2)
            if (r2 == 0) goto L_0x000c
            r2 = 2
            goto L_0x0038
        L_0x0023:
            java.lang.String r2 = "parent"
            boolean r2 = r5.equals(r2)
            if (r2 == 0) goto L_0x000c
            r2 = 3
            goto L_0x0038
        L_0x002d:
            java.lang.String r2 = "preferWrap"
            boolean r2 = r5.equals(r2)
            if (r2 == 0) goto L_0x000c
            r2 = 1
            goto L_0x0038
        L_0x0037:
            r2 = -1
        L_0x0038:
            switch(r2) {
                case 0: goto L_0x0075;
                case 1: goto L_0x006e;
                case 2: goto L_0x0067;
                case 3: goto L_0x0062;
                default: goto L_0x003b;
            }
        L_0x003b:
            java.lang.String r2 = "%"
            boolean r2 = r5.endsWith(r2)
            if (r2 == 0) goto L_0x007a
            r2 = 37
            int r2 = r5.indexOf(r2)
            java.lang.String r2 = r5.substring(r0, r2)
            float r3 = java.lang.Float.parseFloat(r2)
            r4 = 1120403456(0x42c80000, float:100.0)
            float r3 = r3 / r4
            java.lang.Integer r4 = java.lang.Integer.valueOf(r0)
            androidx.constraintlayout.core.state.Dimension r4 = androidx.constraintlayout.core.state.Dimension.createPercent(r4, r3)
            androidx.constraintlayout.core.state.Dimension r1 = r4.suggested((int) r0)
            goto L_0x008d
        L_0x0062:
            androidx.constraintlayout.core.state.Dimension r1 = androidx.constraintlayout.core.state.Dimension.createParent()
            goto L_0x008e
        L_0x0067:
            java.lang.Object r0 = androidx.constraintlayout.core.state.Dimension.SPREAD_DIMENSION
            androidx.constraintlayout.core.state.Dimension r1 = androidx.constraintlayout.core.state.Dimension.createSuggested((java.lang.Object) r0)
            goto L_0x008e
        L_0x006e:
            java.lang.Object r0 = androidx.constraintlayout.core.state.Dimension.WRAP_DIMENSION
            androidx.constraintlayout.core.state.Dimension r1 = androidx.constraintlayout.core.state.Dimension.createSuggested((java.lang.Object) r0)
            goto L_0x008e
        L_0x0075:
            androidx.constraintlayout.core.state.Dimension r1 = androidx.constraintlayout.core.state.Dimension.createWrap()
            goto L_0x008e
        L_0x007a:
            java.lang.String r0 = ":"
            boolean r0 = r5.contains(r0)
            if (r0 == 0) goto L_0x008d
            androidx.constraintlayout.core.state.Dimension r0 = androidx.constraintlayout.core.state.Dimension.createRatio(r5)
            java.lang.Object r2 = androidx.constraintlayout.core.state.Dimension.SPREAD_DIMENSION
            androidx.constraintlayout.core.state.Dimension r1 = r0.suggested((java.lang.Object) r2)
            goto L_0x008e
        L_0x008d:
        L_0x008e:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.constraintlayout.core.state.ConstraintSetParser.parseDimensionMode(java.lang.String):androidx.constraintlayout.core.state.Dimension");
    }

    static Dimension parseDimension(CLObject element, String constraintName, State state, CorePixelDp dpToPixels) throws CLParsingException {
        CLElement dimensionElement = element.get(constraintName);
        Dimension dimension = Dimension.createFixed(0);
        if (dimensionElement instanceof CLString) {
            return parseDimensionMode(dimensionElement.content());
        }
        if (dimensionElement instanceof CLNumber) {
            return Dimension.createFixed(state.convertDimension(Float.valueOf(dpToPixels.toPixels(element.getFloat(constraintName)))));
        }
        if (!(dimensionElement instanceof CLObject)) {
            return dimension;
        }
        CLObject obj = (CLObject) dimensionElement;
        String mode = obj.getStringOrNull("value");
        if (mode != null) {
            dimension = parseDimensionMode(mode);
        }
        CLElement minEl = obj.getOrNull("min");
        if (minEl != null) {
            if (minEl instanceof CLNumber) {
                dimension.min(state.convertDimension(Float.valueOf(dpToPixels.toPixels(((CLNumber) minEl).getFloat()))));
            } else if (minEl instanceof CLString) {
                dimension.min(Dimension.WRAP_DIMENSION);
            }
        }
        CLElement maxEl = obj.getOrNull("max");
        if (maxEl == null) {
            return dimension;
        }
        if (maxEl instanceof CLNumber) {
            dimension.max(state.convertDimension(Float.valueOf(dpToPixels.toPixels(((CLNumber) maxEl).getFloat()))));
            return dimension;
        } else if (!(maxEl instanceof CLString)) {
            return dimension;
        } else {
            dimension.max(Dimension.WRAP_DIMENSION);
            return dimension;
        }
    }

    static long parseColorString(String value) {
        String str = value;
        if (!str.startsWith("#")) {
            return -1;
        }
        String str2 = str.substring(1);
        if (str2.length() == 6) {
            str2 = "FF" + str2;
        }
        return Long.parseLong(str2, 16);
    }

    static String lookForType(CLObject element) throws CLParsingException {
        Iterator<String> it = element.names().iterator();
        while (it.hasNext()) {
            if (it.next().equals("type")) {
                return element.getString("type");
            }
        }
        return null;
    }
}
