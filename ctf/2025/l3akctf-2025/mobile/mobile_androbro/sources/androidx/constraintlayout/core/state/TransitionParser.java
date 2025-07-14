package androidx.constraintlayout.core.state;

import androidx.constraintlayout.core.motion.utils.TypedBundle;
import androidx.constraintlayout.core.motion.utils.TypedValues;
import androidx.constraintlayout.core.parser.CLArray;
import androidx.constraintlayout.core.parser.CLContainer;
import androidx.constraintlayout.core.parser.CLElement;
import androidx.constraintlayout.core.parser.CLObject;
import androidx.constraintlayout.core.parser.CLParsingException;
import androidx.constraintlayout.core.state.Transition;

public class TransitionParser {
    @Deprecated
    public static void parse(CLObject json, Transition transition, CorePixelDp dpToPixel) throws CLParsingException {
        parse(json, transition);
    }

    /* JADX WARNING: Can't fix incorrect switch cases order */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static void parse(androidx.constraintlayout.core.parser.CLObject r11, androidx.constraintlayout.core.state.Transition r12) throws androidx.constraintlayout.core.parser.CLParsingException {
        /*
            r12.resetProperties()
            java.lang.String r0 = "pathMotionArc"
            java.lang.String r0 = r11.getStringOrNull((java.lang.String) r0)
            androidx.constraintlayout.core.motion.utils.TypedBundle r1 = new androidx.constraintlayout.core.motion.utils.TypedBundle
            r1.<init>()
            r2 = 0
            if (r0 == 0) goto L_0x007d
            r2 = 1
            int r3 = r0.hashCode()
            r4 = 5
            r5 = 4
            r6 = 3
            r7 = 2
            r8 = 1
            r9 = 0
            switch(r3) {
                case -1857024520: goto L_0x0053;
                case -1007052250: goto L_0x0048;
                case 3145837: goto L_0x003e;
                case 3387192: goto L_0x0034;
                case 92611485: goto L_0x002a;
                case 93621297: goto L_0x0020;
                default: goto L_0x001f;
            }
        L_0x001f:
            goto L_0x005e
        L_0x0020:
            java.lang.String r3 = "below"
            boolean r3 = r0.equals(r3)
            if (r3 == 0) goto L_0x001f
            r3 = r5
            goto L_0x005f
        L_0x002a:
            java.lang.String r3 = "above"
            boolean r3 = r0.equals(r3)
            if (r3 == 0) goto L_0x001f
            r3 = r4
            goto L_0x005f
        L_0x0034:
            java.lang.String r3 = "none"
            boolean r3 = r0.equals(r3)
            if (r3 == 0) goto L_0x001f
            r3 = r9
            goto L_0x005f
        L_0x003e:
            java.lang.String r3 = "flip"
            boolean r3 = r0.equals(r3)
            if (r3 == 0) goto L_0x001f
            r3 = r6
            goto L_0x005f
        L_0x0048:
            java.lang.String r3 = "startHorizontal"
            boolean r3 = r0.equals(r3)
            if (r3 == 0) goto L_0x001f
            r3 = r7
            goto L_0x005f
        L_0x0053:
            java.lang.String r3 = "startVertical"
            boolean r3 = r0.equals(r3)
            if (r3 == 0) goto L_0x001f
            r3 = r8
            goto L_0x005f
        L_0x005e:
            r3 = -1
        L_0x005f:
            r10 = 509(0x1fd, float:7.13E-43)
            switch(r3) {
                case 0: goto L_0x0079;
                case 1: goto L_0x0075;
                case 2: goto L_0x0071;
                case 3: goto L_0x006d;
                case 4: goto L_0x0069;
                case 5: goto L_0x0065;
                default: goto L_0x0064;
            }
        L_0x0064:
            goto L_0x007d
        L_0x0065:
            r1.add((int) r10, (int) r4)
            goto L_0x007d
        L_0x0069:
            r1.add((int) r10, (int) r5)
            goto L_0x007d
        L_0x006d:
            r1.add((int) r10, (int) r6)
            goto L_0x007d
        L_0x0071:
            r1.add((int) r10, (int) r7)
            goto L_0x007d
        L_0x0075:
            r1.add((int) r10, (int) r8)
            goto L_0x007d
        L_0x0079:
            r1.add((int) r10, (int) r9)
        L_0x007d:
            java.lang.String r3 = "interpolator"
            java.lang.String r3 = r11.getStringOrNull((java.lang.String) r3)
            if (r3 == 0) goto L_0x008b
            r2 = 1
            r4 = 705(0x2c1, float:9.88E-43)
            r1.add((int) r4, (java.lang.String) r3)
        L_0x008b:
            java.lang.String r4 = "staggered"
            float r4 = r11.getFloatOrNaN(r4)
            boolean r5 = java.lang.Float.isNaN(r4)
            if (r5 != 0) goto L_0x009e
            r2 = 1
            r5 = 706(0x2c2, float:9.9E-43)
            r1.add((int) r5, (float) r4)
        L_0x009e:
            if (r2 == 0) goto L_0x00a3
            r12.setTransitionProperties(r1)
        L_0x00a3:
            java.lang.String r5 = "onSwipe"
            androidx.constraintlayout.core.parser.CLObject r5 = r11.getObjectOrNull(r5)
            if (r5 == 0) goto L_0x00ae
            parseOnSwipe(r5, r12)
        L_0x00ae:
            parseKeyFrames(r11, r12)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.constraintlayout.core.state.TransitionParser.parse(androidx.constraintlayout.core.parser.CLObject, androidx.constraintlayout.core.state.Transition):void");
    }

    private static void parseOnSwipe(CLContainer onSwipe, Transition transition) {
        CLContainer cLContainer = onSwipe;
        String anchor = cLContainer.getStringOrNull("anchor");
        int side = map(cLContainer.getStringOrNull("side"), Transition.OnSwipe.SIDES);
        int direction = map(cLContainer.getStringOrNull("direction"), Transition.OnSwipe.DIRECTIONS);
        float scale = cLContainer.getFloatOrNaN("scale");
        float threshold = cLContainer.getFloatOrNaN("threshold");
        float maxVelocity = cLContainer.getFloatOrNaN("maxVelocity");
        float maxAccel = cLContainer.getFloatOrNaN("maxAccel");
        String limitBounds = cLContainer.getStringOrNull("limitBounds");
        int autoCompleteMode = map(cLContainer.getStringOrNull("mode"), Transition.OnSwipe.MODE);
        int touchUp = map(cLContainer.getStringOrNull("touchUp"), Transition.OnSwipe.TOUCH_UP);
        float springMass = cLContainer.getFloatOrNaN("springMass");
        float springStiffness = cLContainer.getFloatOrNaN("springStiffness");
        float springDamping = cLContainer.getFloatOrNaN("springDamping");
        float stopThreshold = cLContainer.getFloatOrNaN("stopThreshold");
        int springBoundary = map(cLContainer.getStringOrNull("springBoundary"), Transition.OnSwipe.BOUNDARY);
        String around = cLContainer.getStringOrNull("around");
        Transition.OnSwipe swipe = transition.createOnSwipe();
        swipe.setAnchorId(anchor);
        swipe.setAnchorSide(side);
        swipe.setDragDirection(direction);
        swipe.setDragScale(scale);
        swipe.setDragThreshold(threshold);
        swipe.setMaxVelocity(maxVelocity);
        swipe.setMaxAcceleration(maxAccel);
        swipe.setLimitBoundsTo(limitBounds);
        swipe.setAutoCompleteMode(autoCompleteMode);
        swipe.setOnTouchUp(touchUp);
        swipe.setSpringMass(springMass);
        swipe.setSpringStiffness(springStiffness);
        swipe.setSpringDamping(springDamping);
        String str = anchor;
        swipe.setSpringStopThreshold(stopThreshold);
        swipe.setSpringBoundary(springBoundary);
        swipe.setRotationCenterId(around);
    }

    private static int map(String val, String... types) {
        for (int i = 0; i < types.length; i++) {
            if (types[i].equals(val)) {
                return i;
            }
        }
        return 0;
    }

    private static void map(TypedBundle bundle, int type, String val, String... types) {
        for (int i = 0; i < types.length; i++) {
            if (types[i].equals(val)) {
                bundle.add(type, i);
            }
        }
    }

    public static void parseKeyFrames(CLObject transitionCLObject, Transition transition) throws CLParsingException {
        CLContainer keyframes = transitionCLObject.getObjectOrNull("KeyFrames");
        if (keyframes != null) {
            CLArray keyPositions = keyframes.getArrayOrNull("KeyPositions");
            if (keyPositions != null) {
                for (int i = 0; i < keyPositions.size(); i++) {
                    CLElement keyPosition = keyPositions.get(i);
                    if (keyPosition instanceof CLObject) {
                        parseKeyPosition((CLObject) keyPosition, transition);
                    }
                }
            }
            CLArray keyAttributes = keyframes.getArrayOrNull(TypedValues.AttributesType.NAME);
            if (keyAttributes != null) {
                for (int i2 = 0; i2 < keyAttributes.size(); i2++) {
                    CLElement keyAttribute = keyAttributes.get(i2);
                    if (keyAttribute instanceof CLObject) {
                        parseKeyAttribute((CLObject) keyAttribute, transition);
                    }
                }
            }
            CLArray keyCycles = keyframes.getArrayOrNull("KeyCycles");
            if (keyCycles != null) {
                for (int i3 = 0; i3 < keyCycles.size(); i3++) {
                    CLElement keyCycle = keyCycles.get(i3);
                    if (keyCycle instanceof CLObject) {
                        parseKeyCycle((CLObject) keyCycle, transition);
                    }
                }
            }
        }
    }

    private static void parseKeyPosition(CLObject keyPosition, Transition transition) throws CLParsingException {
        CLObject cLObject = keyPosition;
        TypedBundle bundle = new TypedBundle();
        CLArray targets = cLObject.getArray(TypedValues.AttributesType.S_TARGET);
        CLArray frames = cLObject.getArray("frames");
        CLArray percentX = cLObject.getArrayOrNull("percentX");
        CLArray percentY = cLObject.getArrayOrNull("percentY");
        CLArray percentWidth = cLObject.getArrayOrNull("percentWidth");
        CLArray percentHeight = cLObject.getArrayOrNull("percentHeight");
        String pathMotionArc = cLObject.getStringOrNull(TypedValues.TransitionType.S_PATH_MOTION_ARC);
        String transitionEasing = cLObject.getStringOrNull("transitionEasing");
        String curveFit = cLObject.getStringOrNull("curveFit");
        String type = cLObject.getStringOrNull("type");
        if (type == null) {
            type = "parentRelative";
        }
        if (percentX != null && frames.size() != percentX.size()) {
            return;
        }
        if (percentY == null || frames.size() == percentY.size()) {
            int i = 0;
            while (i < targets.size()) {
                String target = targets.getString(i);
                int pos_type = map(type, "deltaRelative", "pathRelative", "parentRelative");
                bundle.clear();
                bundle.add((int) TypedValues.PositionType.TYPE_POSITION_TYPE, pos_type);
                if (curveFit != null) {
                    map(bundle, TypedValues.PositionType.TYPE_CURVE_FIT, curveFit, "spline", "linear");
                }
                bundle.addIfNotNull(TypedValues.PositionType.TYPE_TRANSITION_EASING, transitionEasing);
                if (pathMotionArc != null) {
                    map(bundle, 509, pathMotionArc, "none", "startVertical", "startHorizontal", "flip", "below", "above");
                }
                int j = 0;
                while (j < frames.size()) {
                    bundle.add(100, frames.getInt(j));
                    set(bundle, TypedValues.PositionType.TYPE_PERCENT_X, percentX, j);
                    set(bundle, TypedValues.PositionType.TYPE_PERCENT_Y, percentY, j);
                    set(bundle, TypedValues.PositionType.TYPE_PERCENT_WIDTH, percentWidth, j);
                    set(bundle, TypedValues.PositionType.TYPE_PERCENT_HEIGHT, percentHeight, j);
                    transition.addKeyPosition(target, bundle);
                    j++;
                    targets = targets;
                }
                CLArray targets2 = targets;
                Transition transition2 = transition;
                i++;
                CLObject cLObject2 = keyPosition;
                targets = targets2;
            }
        }
    }

    private static void set(TypedBundle bundle, int type, CLArray array, int index) throws CLParsingException {
        if (array != null) {
            bundle.add(type, array.getFloat(index));
        }
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r10v6, resolved type: java.lang.Object} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r12v2, resolved type: androidx.constraintlayout.core.motion.CustomVariable[][]} */
    /* JADX WARNING: Multi-variable type inference failed */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private static void parseKeyAttribute(androidx.constraintlayout.core.parser.CLObject r31, androidx.constraintlayout.core.state.Transition r32) throws androidx.constraintlayout.core.parser.CLParsingException {
        /*
            r0 = r31
            r1 = r32
            java.lang.String r2 = "target"
            androidx.constraintlayout.core.parser.CLArray r2 = r0.getArrayOrNull(r2)
            if (r2 != 0) goto L_0x000e
            return
        L_0x000e:
            java.lang.String r3 = "frames"
            androidx.constraintlayout.core.parser.CLArray r3 = r0.getArrayOrNull(r3)
            if (r3 != 0) goto L_0x0017
            return
        L_0x0017:
            java.lang.String r4 = "transitionEasing"
            java.lang.String r4 = r0.getStringOrNull((java.lang.String) r4)
            r5 = 9
            java.lang.String[] r6 = new java.lang.String[r5]
            java.lang.String r7 = "scaleX"
            r8 = 0
            r6[r8] = r7
            java.lang.String r7 = "scaleY"
            r9 = 1
            r6[r9] = r7
            java.lang.String r7 = "translationX"
            r10 = 2
            r6[r10] = r7
            r7 = 3
            java.lang.String r11 = "translationY"
            r6[r7] = r11
            r7 = 4
            java.lang.String r11 = "translationZ"
            r6[r7] = r11
            r7 = 5
            java.lang.String r11 = "rotationX"
            r6[r7] = r11
            r7 = 6
            java.lang.String r11 = "rotationY"
            r6[r7] = r11
            r7 = 7
            java.lang.String r11 = "rotationZ"
            r6[r7] = r11
            r7 = 8
            java.lang.String r11 = "alpha"
            r6[r7] = r11
            int[] r7 = new int[r5]
            r7 = {311, 312, 304, 305, 306, 308, 309, 310, 303} // fill-array
            boolean[] r5 = new boolean[r5]
            r5 = {0, 0, 1, 1, 1, 0, 0, 0, 0} // fill-array
            int r11 = r3.size()
            androidx.constraintlayout.core.motion.utils.TypedBundle[] r11 = new androidx.constraintlayout.core.motion.utils.TypedBundle[r11]
            r12 = 0
            r13 = 0
        L_0x0067:
            int r14 = r3.size()
            if (r13 >= r14) goto L_0x0077
            androidx.constraintlayout.core.motion.utils.TypedBundle r14 = new androidx.constraintlayout.core.motion.utils.TypedBundle
            r14.<init>()
            r11[r13] = r14
            int r13 = r13 + 1
            goto L_0x0067
        L_0x0077:
            r13 = 0
        L_0x0078:
            int r14 = r6.length
            if (r13 >= r14) goto L_0x00f5
            r14 = r6[r13]
            r15 = r7[r13]
            boolean r16 = r5[r13]
            androidx.constraintlayout.core.parser.CLArray r8 = r0.getArrayOrNull(r14)
            if (r8 == 0) goto L_0x00b2
            int r9 = r8.size()
            int r10 = r11.length
            if (r9 != r10) goto L_0x0091
            r18 = r5
            goto L_0x00b4
        L_0x0091:
            androidx.constraintlayout.core.parser.CLParsingException r9 = new androidx.constraintlayout.core.parser.CLParsingException
            java.lang.StringBuilder r10 = new java.lang.StringBuilder
            r10.<init>()
            r18 = r5
            java.lang.String r5 = "incorrect size for "
            java.lang.StringBuilder r5 = r10.append(r5)
            java.lang.StringBuilder r5 = r5.append(r14)
            java.lang.String r10 = " array, not matching targets array!"
            java.lang.StringBuilder r5 = r5.append(r10)
            java.lang.String r5 = r5.toString()
            r9.<init>(r5, r0)
            throw r9
        L_0x00b2:
            r18 = r5
        L_0x00b4:
            if (r8 == 0) goto L_0x00cf
            r5 = 0
        L_0x00b7:
            int r9 = r11.length
            if (r5 >= r9) goto L_0x00ce
            float r9 = r8.getFloat((int) r5)
            if (r16 == 0) goto L_0x00c6
            androidx.constraintlayout.core.state.CorePixelDp r10 = r1.mToPixel
            float r9 = r10.toPixels(r9)
        L_0x00c6:
            r10 = r11[r5]
            r10.add((int) r15, (float) r9)
            int r5 = r5 + 1
            goto L_0x00b7
        L_0x00ce:
            goto L_0x00ed
        L_0x00cf:
            float r5 = r0.getFloatOrNaN(r14)
            boolean r9 = java.lang.Float.isNaN(r5)
            if (r9 != 0) goto L_0x00ed
            if (r16 == 0) goto L_0x00e1
            androidx.constraintlayout.core.state.CorePixelDp r9 = r1.mToPixel
            float r5 = r9.toPixels(r5)
        L_0x00e1:
            r9 = 0
        L_0x00e2:
            int r10 = r11.length
            if (r9 >= r10) goto L_0x00ed
            r10 = r11[r9]
            r10.add((int) r15, (float) r5)
            int r9 = r9 + 1
            goto L_0x00e2
        L_0x00ed:
            int r13 = r13 + 1
            r5 = r18
            r8 = 0
            r9 = 1
            r10 = 2
            goto L_0x0078
        L_0x00f5:
            r18 = r5
            java.lang.String r5 = "custom"
            androidx.constraintlayout.core.parser.CLElement r5 = r0.getOrNull((java.lang.String) r5)
            if (r5 == 0) goto L_0x0234
            boolean r8 = r5 instanceof androidx.constraintlayout.core.parser.CLObject
            if (r8 == 0) goto L_0x0234
            r8 = r5
            androidx.constraintlayout.core.parser.CLObject r8 = (androidx.constraintlayout.core.parser.CLObject) r8
            int r9 = r8.size()
            int r10 = r3.size()
            r13 = 2
            int[] r14 = new int[r13]
            r13 = 1
            r14[r13] = r9
            r13 = 0
            r14[r13] = r10
            java.lang.Class<androidx.constraintlayout.core.motion.CustomVariable> r10 = androidx.constraintlayout.core.motion.CustomVariable.class
            java.lang.Object r10 = java.lang.reflect.Array.newInstance(r10, r14)
            r12 = r10
            androidx.constraintlayout.core.motion.CustomVariable[][] r12 = (androidx.constraintlayout.core.motion.CustomVariable[][]) r12
            r10 = 0
        L_0x0121:
            if (r10 >= r9) goto L_0x0229
            androidx.constraintlayout.core.parser.CLElement r13 = r8.get((int) r10)
            androidx.constraintlayout.core.parser.CLKey r13 = (androidx.constraintlayout.core.parser.CLKey) r13
            java.lang.String r14 = r13.content()
            androidx.constraintlayout.core.parser.CLElement r15 = r13.getValue()
            boolean r15 = r15 instanceof androidx.constraintlayout.core.parser.CLArray
            r16 = r5
            r20 = -1
            if (r15 == 0) goto L_0x01c4
            androidx.constraintlayout.core.parser.CLElement r15 = r13.getValue()
            androidx.constraintlayout.core.parser.CLArray r15 = (androidx.constraintlayout.core.parser.CLArray) r15
            int r5 = r15.size()
            r23 = r6
            int r6 = r11.length
            if (r5 != r6) goto L_0x01b9
            if (r5 <= 0) goto L_0x01b9
            r24 = r5
            r6 = 0
            androidx.constraintlayout.core.parser.CLElement r5 = r15.get((int) r6)
            boolean r5 = r5 instanceof androidx.constraintlayout.core.parser.CLNumber
            if (r5 == 0) goto L_0x0182
            r5 = 0
        L_0x0156:
            int r6 = r11.length
            if (r5 >= r6) goto L_0x017b
            r6 = r12[r5]
            r25 = r7
            androidx.constraintlayout.core.motion.CustomVariable r7 = new androidx.constraintlayout.core.motion.CustomVariable
            androidx.constraintlayout.core.parser.CLElement r19 = r15.get((int) r5)
            r26 = r8
            float r8 = r19.getFloat()
            r27 = r9
            r9 = 901(0x385, float:1.263E-42)
            r7.<init>((java.lang.String) r14, (int) r9, (float) r8)
            r6[r10] = r7
            int r5 = r5 + 1
            r7 = r25
            r8 = r26
            r9 = r27
            goto L_0x0156
        L_0x017b:
            r25 = r7
            r26 = r8
            r27 = r9
            goto L_0x01c3
        L_0x0182:
            r25 = r7
            r26 = r8
            r27 = r9
            r5 = 0
        L_0x0189:
            int r6 = r11.length
            if (r5 >= r6) goto L_0x01b6
            androidx.constraintlayout.core.parser.CLElement r6 = r15.get((int) r5)
            java.lang.String r6 = r6.content()
            long r6 = androidx.constraintlayout.core.state.ConstraintSetParser.parseColorString(r6)
            int r8 = (r6 > r20 ? 1 : (r6 == r20 ? 0 : -1))
            if (r8 == 0) goto L_0x01ad
            r8 = r12[r5]
            androidx.constraintlayout.core.motion.CustomVariable r9 = new androidx.constraintlayout.core.motion.CustomVariable
            r28 = r15
            int r15 = (int) r6
            r29 = r6
            r6 = 902(0x386, float:1.264E-42)
            r9.<init>((java.lang.String) r14, (int) r6, (int) r15)
            r8[r10] = r9
            goto L_0x01b1
        L_0x01ad:
            r29 = r6
            r28 = r15
        L_0x01b1:
            int r5 = r5 + 1
            r15 = r28
            goto L_0x0189
        L_0x01b6:
            r28 = r15
            goto L_0x01c3
        L_0x01b9:
            r24 = r5
            r25 = r7
            r26 = r8
            r27 = r9
            r28 = r15
        L_0x01c3:
            goto L_0x021b
        L_0x01c4:
            r23 = r6
            r25 = r7
            r26 = r8
            r27 = r9
            androidx.constraintlayout.core.parser.CLElement r5 = r13.getValue()
            boolean r6 = r5 instanceof androidx.constraintlayout.core.parser.CLNumber
            if (r6 == 0) goto L_0x01eb
            float r6 = r5.getFloat()
            r7 = 0
        L_0x01d9:
            int r8 = r11.length
            if (r7 >= r8) goto L_0x01ea
            r8 = r12[r7]
            androidx.constraintlayout.core.motion.CustomVariable r9 = new androidx.constraintlayout.core.motion.CustomVariable
            r15 = 901(0x385, float:1.263E-42)
            r9.<init>((java.lang.String) r14, (int) r15, (float) r6)
            r8[r10] = r9
            int r7 = r7 + 1
            goto L_0x01d9
        L_0x01ea:
            goto L_0x021b
        L_0x01eb:
            java.lang.String r6 = r5.content()
            long r6 = androidx.constraintlayout.core.state.ConstraintSetParser.parseColorString(r6)
            int r8 = (r6 > r20 ? 1 : (r6 == r20 ? 0 : -1))
            if (r8 == 0) goto L_0x0217
            r8 = 0
        L_0x01f8:
            int r9 = r11.length
            if (r8 >= r9) goto L_0x0212
            r9 = r12[r8]
            androidx.constraintlayout.core.motion.CustomVariable r15 = new androidx.constraintlayout.core.motion.CustomVariable
            r20 = r5
            int r5 = (int) r6
            r21 = r6
            r6 = 902(0x386, float:1.264E-42)
            r15.<init>((java.lang.String) r14, (int) r6, (int) r5)
            r9[r10] = r15
            int r8 = r8 + 1
            r5 = r20
            r6 = r21
            goto L_0x01f8
        L_0x0212:
            r20 = r5
            r21 = r6
            goto L_0x021b
        L_0x0217:
            r20 = r5
            r21 = r6
        L_0x021b:
            int r10 = r10 + 1
            r5 = r16
            r6 = r23
            r7 = r25
            r8 = r26
            r9 = r27
            goto L_0x0121
        L_0x0229:
            r16 = r5
            r23 = r6
            r25 = r7
            r26 = r8
            r27 = r9
            goto L_0x023a
        L_0x0234:
            r16 = r5
            r23 = r6
            r25 = r7
        L_0x023a:
            java.lang.String r5 = "curveFit"
            java.lang.String r5 = r0.getStringOrNull((java.lang.String) r5)
            r6 = 0
        L_0x0241:
            int r7 = r2.size()
            if (r6 >= r7) goto L_0x0291
            r7 = 0
        L_0x0248:
            int r8 = r11.length
            if (r7 >= r8) goto L_0x028a
            java.lang.String r8 = r2.getString((int) r6)
            r9 = r11[r7]
            if (r5 == 0) goto L_0x026c
            r10 = 2
            java.lang.String[] r13 = new java.lang.String[r10]
            java.lang.String r14 = "spline"
            r15 = 0
            r13[r15] = r14
            java.lang.String r14 = "linear"
            r17 = 1
            r13[r17] = r14
            int r13 = map(r5, r13)
            r14 = 508(0x1fc, float:7.12E-43)
            r9.add((int) r14, (int) r13)
            goto L_0x0270
        L_0x026c:
            r10 = 2
            r15 = 0
            r17 = 1
        L_0x0270:
            r13 = 501(0x1f5, float:7.02E-43)
            r9.addIfNotNull(r13, r4)
            int r13 = r3.getInt((int) r7)
            r14 = 100
            r9.add((int) r14, (int) r13)
            if (r12 == 0) goto L_0x0283
            r14 = r12[r7]
            goto L_0x0284
        L_0x0283:
            r14 = 0
        L_0x0284:
            r1.addKeyAttribute(r8, r9, r14)
            int r7 = r7 + 1
            goto L_0x0248
        L_0x028a:
            r10 = 2
            r15 = 0
            r17 = 1
            int r6 = r6 + 1
            goto L_0x0241
        L_0x0291:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.constraintlayout.core.state.TransitionParser.parseKeyAttribute(androidx.constraintlayout.core.parser.CLObject, androidx.constraintlayout.core.state.Transition):void");
    }

    /* JADX WARNING: Can't fix incorrect switch cases order */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private static void parseKeyCycle(androidx.constraintlayout.core.parser.CLObject r19, androidx.constraintlayout.core.state.Transition r20) throws androidx.constraintlayout.core.parser.CLParsingException {
        /*
            r0 = r19
            r1 = r20
            java.lang.String r2 = "target"
            androidx.constraintlayout.core.parser.CLArray r2 = r0.getArray((java.lang.String) r2)
            java.lang.String r3 = "frames"
            androidx.constraintlayout.core.parser.CLArray r3 = r0.getArray((java.lang.String) r3)
            java.lang.String r4 = "transitionEasing"
            java.lang.String r4 = r0.getStringOrNull((java.lang.String) r4)
            r5 = 12
            java.lang.String[] r6 = new java.lang.String[r5]
            java.lang.String r7 = "scaleX"
            r8 = 0
            r6[r8] = r7
            java.lang.String r7 = "scaleY"
            r9 = 1
            r6[r9] = r7
            java.lang.String r7 = "translationX"
            r10 = 2
            r6[r10] = r7
            r7 = 3
            java.lang.String r11 = "translationY"
            r6[r7] = r11
            r7 = 4
            java.lang.String r11 = "translationZ"
            r6[r7] = r11
            r7 = 5
            java.lang.String r11 = "rotationX"
            r6[r7] = r11
            r7 = 6
            java.lang.String r11 = "rotationY"
            r6[r7] = r11
            r7 = 7
            java.lang.String r11 = "rotationZ"
            r6[r7] = r11
            r7 = 8
            java.lang.String r11 = "alpha"
            r6[r7] = r11
            r7 = 9
            java.lang.String r11 = "period"
            r6[r7] = r11
            r7 = 10
            java.lang.String r11 = "offset"
            r6[r7] = r11
            r7 = 11
            java.lang.String r11 = "phase"
            r6[r7] = r11
            int[] r7 = new int[r5]
            r7 = {311, 312, 304, 305, 306, 308, 309, 310, 403, 423, 424, 425} // fill-array
            int[] r5 = new int[r5]
            r5 = {0, 0, 1, 1, 1, 0, 0, 0, 0, 0, 2, 0} // fill-array
            int r11 = r3.size()
            androidx.constraintlayout.core.motion.utils.TypedBundle[] r11 = new androidx.constraintlayout.core.motion.utils.TypedBundle[r11]
            r12 = 0
        L_0x0072:
            int r13 = r11.length
            if (r12 >= r13) goto L_0x007f
            androidx.constraintlayout.core.motion.utils.TypedBundle r13 = new androidx.constraintlayout.core.motion.utils.TypedBundle
            r13.<init>()
            r11[r12] = r13
            int r12 = r12 + 1
            goto L_0x0072
        L_0x007f:
            r12 = 0
            r13 = 0
        L_0x0081:
            int r14 = r6.length
            if (r13 >= r14) goto L_0x0094
            r14 = r6[r13]
            boolean r14 = r0.has(r14)
            if (r14 == 0) goto L_0x0091
            r14 = r5[r13]
            if (r14 != r9) goto L_0x0091
            r12 = 1
        L_0x0091:
            int r13 = r13 + 1
            goto L_0x0081
        L_0x0094:
            r13 = 0
        L_0x0095:
            int r14 = r6.length
            if (r13 >= r14) goto L_0x0120
            r14 = r6[r13]
            r15 = r7[r13]
            r8 = r5[r13]
            androidx.constraintlayout.core.parser.CLArray r10 = r0.getArrayOrNull(r14)
            if (r10 == 0) goto L_0x00b6
            int r9 = r10.size()
            r17 = r5
            int r5 = r11.length
            if (r9 != r5) goto L_0x00ae
            goto L_0x00b8
        L_0x00ae:
            androidx.constraintlayout.core.parser.CLParsingException r5 = new androidx.constraintlayout.core.parser.CLParsingException
            java.lang.String r9 = "incorrect size for $attrName array, not matching targets array!"
            r5.<init>(r9, r0)
            throw r5
        L_0x00b6:
            r17 = r5
        L_0x00b8:
            if (r10 == 0) goto L_0x00e6
            r5 = 0
        L_0x00bb:
            int r9 = r11.length
            if (r5 >= r9) goto L_0x00e3
            float r9 = r10.getFloat((int) r5)
            r18 = r6
            r6 = 1
            if (r8 != r6) goto L_0x00ce
            androidx.constraintlayout.core.state.CorePixelDp r6 = r1.mToPixel
            float r9 = r6.toPixels(r9)
            goto L_0x00d9
        L_0x00ce:
            r6 = 2
            if (r8 != r6) goto L_0x00d9
            if (r12 == 0) goto L_0x00d9
            androidx.constraintlayout.core.state.CorePixelDp r6 = r1.mToPixel
            float r9 = r6.toPixels(r9)
        L_0x00d9:
            r6 = r11[r5]
            r6.add((int) r15, (float) r9)
            int r5 = r5 + 1
            r6 = r18
            goto L_0x00bb
        L_0x00e3:
            r18 = r6
            goto L_0x0115
        L_0x00e6:
            r18 = r6
            float r5 = r0.getFloatOrNaN(r14)
            boolean r6 = java.lang.Float.isNaN(r5)
            if (r6 != 0) goto L_0x0115
            r6 = 1
            if (r8 != r6) goto L_0x00fd
            androidx.constraintlayout.core.state.CorePixelDp r6 = r1.mToPixel
            float r5 = r6.toPixels(r5)
            r6 = 2
            goto L_0x0108
        L_0x00fd:
            r6 = 2
            if (r8 != r6) goto L_0x0108
            if (r12 == 0) goto L_0x0108
            androidx.constraintlayout.core.state.CorePixelDp r9 = r1.mToPixel
            float r5 = r9.toPixels(r5)
        L_0x0108:
            r9 = 0
        L_0x0109:
            int r6 = r11.length
            if (r9 >= r6) goto L_0x0115
            r6 = r11[r9]
            r6.add((int) r15, (float) r5)
            int r9 = r9 + 1
            r6 = 2
            goto L_0x0109
        L_0x0115:
            int r13 = r13 + 1
            r5 = r17
            r6 = r18
            r8 = 0
            r9 = 1
            r10 = 2
            goto L_0x0095
        L_0x0120:
            r17 = r5
            r18 = r6
            java.lang.String r5 = "curveFit"
            java.lang.String r5 = r0.getStringOrNull((java.lang.String) r5)
            java.lang.String r6 = "easing"
            java.lang.String r6 = r0.getStringOrNull((java.lang.String) r6)
            java.lang.String r8 = "waveShape"
            java.lang.String r8 = r0.getStringOrNull((java.lang.String) r8)
            java.lang.String r9 = "customWave"
            java.lang.String r9 = r0.getStringOrNull((java.lang.String) r9)
            r10 = 0
        L_0x013e:
            int r13 = r2.size()
            if (r10 >= r13) goto L_0x01ba
            r13 = 0
        L_0x0145:
            int r14 = r11.length
            if (r13 >= r14) goto L_0x01b3
            java.lang.String r14 = r2.getString((int) r10)
            r15 = r11[r13]
            if (r5 == 0) goto L_0x0183
            int r16 = r5.hashCode()
            switch(r16) {
                case -1102672091: goto L_0x0163;
                case -895858735: goto L_0x0158;
                default: goto L_0x0157;
            }
        L_0x0157:
            goto L_0x016d
        L_0x0158:
            java.lang.String r0 = "spline"
            boolean r0 = r5.equals(r0)
            if (r0 == 0) goto L_0x0157
            r0 = 0
            goto L_0x016e
        L_0x0163:
            java.lang.String r0 = "linear"
            boolean r0 = r5.equals(r0)
            if (r0 == 0) goto L_0x0157
            r0 = 1
            goto L_0x016e
        L_0x016d:
            r0 = -1
        L_0x016e:
            r16 = r2
            r2 = 401(0x191, float:5.62E-43)
            switch(r0) {
                case 0: goto L_0x017d;
                case 1: goto L_0x0177;
                default: goto L_0x0175;
            }
        L_0x0175:
            r0 = 0
            goto L_0x0186
        L_0x0177:
            r0 = 1
            r15.add((int) r2, (int) r0)
            r0 = 0
            goto L_0x0186
        L_0x017d:
            r0 = 1
            r0 = 0
            r15.add((int) r2, (int) r0)
            goto L_0x0186
        L_0x0183:
            r16 = r2
            r0 = 0
        L_0x0186:
            r2 = 501(0x1f5, float:7.02E-43)
            r15.addIfNotNull(r2, r4)
            if (r6 == 0) goto L_0x0192
            r2 = 420(0x1a4, float:5.89E-43)
            r15.add((int) r2, (java.lang.String) r6)
        L_0x0192:
            if (r8 == 0) goto L_0x0199
            r2 = 421(0x1a5, float:5.9E-43)
            r15.add((int) r2, (java.lang.String) r8)
        L_0x0199:
            if (r9 == 0) goto L_0x01a0
            r2 = 422(0x1a6, float:5.91E-43)
            r15.add((int) r2, (java.lang.String) r9)
        L_0x01a0:
            int r2 = r3.getInt((int) r13)
            r0 = 100
            r15.add((int) r0, (int) r2)
            r1.addKeyCycle(r14, r15)
            int r13 = r13 + 1
            r0 = r19
            r2 = r16
            goto L_0x0145
        L_0x01b3:
            r16 = r2
            int r10 = r10 + 1
            r0 = r19
            goto L_0x013e
        L_0x01ba:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.constraintlayout.core.state.TransitionParser.parseKeyCycle(androidx.constraintlayout.core.parser.CLObject, androidx.constraintlayout.core.state.Transition):void");
    }
}
