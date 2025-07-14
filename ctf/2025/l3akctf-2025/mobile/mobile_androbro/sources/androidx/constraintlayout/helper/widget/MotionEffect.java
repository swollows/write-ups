package androidx.constraintlayout.helper.widget;

import android.content.Context;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import android.util.Log;
import android.view.View;
import androidx.constraintlayout.motion.widget.Debug;
import androidx.constraintlayout.motion.widget.KeyAttributes;
import androidx.constraintlayout.motion.widget.KeyPosition;
import androidx.constraintlayout.motion.widget.MotionController;
import androidx.constraintlayout.motion.widget.MotionHelper;
import androidx.constraintlayout.motion.widget.MotionLayout;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.constraintlayout.widget.R;
import java.util.HashMap;

public class MotionEffect extends MotionHelper {
    public static final int AUTO = -1;
    public static final int EAST = 2;
    public static final int NORTH = 0;
    public static final int SOUTH = 1;
    public static final String TAG = "FadeMove";
    private static final int UNSET = -1;
    public static final int WEST = 3;
    private int mFadeMove = -1;
    private float mMotionEffectAlpha = 0.1f;
    private int mMotionEffectEnd = 50;
    private int mMotionEffectStart = 49;
    private boolean mMotionEffectStrictMove = true;
    private int mMotionEffectTranslationX = 0;
    private int mMotionEffectTranslationY = 0;
    private int mViewTransitionId = -1;

    public MotionEffect(Context context) {
        super(context);
    }

    public MotionEffect(Context context, AttributeSet attrs) {
        super(context, attrs);
        init(context, attrs);
    }

    public MotionEffect(Context context, AttributeSet attrs, int defStyleAttr) {
        super(context, attrs, defStyleAttr);
        init(context, attrs);
    }

    private void init(Context context, AttributeSet attrs) {
        if (attrs != null) {
            TypedArray a = context.obtainStyledAttributes(attrs, R.styleable.MotionEffect);
            int n = a.getIndexCount();
            for (int i = 0; i < n; i++) {
                int attr = a.getIndex(i);
                if (attr == R.styleable.MotionEffect_motionEffect_start) {
                    this.mMotionEffectStart = a.getInt(attr, this.mMotionEffectStart);
                    this.mMotionEffectStart = Math.max(Math.min(this.mMotionEffectStart, 99), 0);
                } else if (attr == R.styleable.MotionEffect_motionEffect_end) {
                    this.mMotionEffectEnd = a.getInt(attr, this.mMotionEffectEnd);
                    this.mMotionEffectEnd = Math.max(Math.min(this.mMotionEffectEnd, 99), 0);
                } else if (attr == R.styleable.MotionEffect_motionEffect_translationX) {
                    this.mMotionEffectTranslationX = a.getDimensionPixelOffset(attr, this.mMotionEffectTranslationX);
                } else if (attr == R.styleable.MotionEffect_motionEffect_translationY) {
                    this.mMotionEffectTranslationY = a.getDimensionPixelOffset(attr, this.mMotionEffectTranslationY);
                } else if (attr == R.styleable.MotionEffect_motionEffect_alpha) {
                    this.mMotionEffectAlpha = a.getFloat(attr, this.mMotionEffectAlpha);
                } else if (attr == R.styleable.MotionEffect_motionEffect_move) {
                    this.mFadeMove = a.getInt(attr, this.mFadeMove);
                } else if (attr == R.styleable.MotionEffect_motionEffect_strict) {
                    this.mMotionEffectStrictMove = a.getBoolean(attr, this.mMotionEffectStrictMove);
                } else if (attr == R.styleable.MotionEffect_motionEffect_viewTransition) {
                    this.mViewTransitionId = a.getResourceId(attr, this.mViewTransitionId);
                }
            }
            if (this.mMotionEffectStart == this.mMotionEffectEnd) {
                if (this.mMotionEffectStart > 0) {
                    this.mMotionEffectStart--;
                } else {
                    this.mMotionEffectEnd++;
                }
            }
            a.recycle();
        }
    }

    public boolean isDecorator() {
        return true;
    }

    public void onPreSetup(MotionLayout motionLayout, HashMap<View, MotionController> controllerMap) {
        View[] views;
        HashMap<View, MotionController> hashMap = controllerMap;
        View[] views2 = getViews((ConstraintLayout) getParent());
        if (views2 == null) {
            Log.v(TAG, Debug.getLoc() + " views = null");
            return;
        }
        KeyAttributes alpha1 = new KeyAttributes();
        KeyAttributes alpha2 = new KeyAttributes();
        alpha1.setValue("alpha", Float.valueOf(this.mMotionEffectAlpha));
        alpha2.setValue("alpha", Float.valueOf(this.mMotionEffectAlpha));
        alpha1.setFramePosition(this.mMotionEffectStart);
        alpha2.setFramePosition(this.mMotionEffectEnd);
        KeyPosition stick1 = new KeyPosition();
        stick1.setFramePosition(this.mMotionEffectStart);
        stick1.setType(0);
        stick1.setValue("percentX", 0);
        stick1.setValue("percentY", 0);
        KeyPosition stick2 = new KeyPosition();
        stick2.setFramePosition(this.mMotionEffectEnd);
        stick2.setType(0);
        stick2.setValue("percentX", 1);
        stick2.setValue("percentY", 1);
        KeyAttributes translationX1 = null;
        KeyAttributes translationX2 = null;
        if (this.mMotionEffectTranslationX > 0) {
            translationX1 = new KeyAttributes();
            translationX2 = new KeyAttributes();
            translationX1.setValue("translationX", Integer.valueOf(this.mMotionEffectTranslationX));
            translationX1.setFramePosition(this.mMotionEffectEnd);
            translationX2.setValue("translationX", 0);
            translationX2.setFramePosition(this.mMotionEffectEnd - 1);
        }
        KeyAttributes translationY1 = null;
        KeyAttributes translationY2 = null;
        if (this.mMotionEffectTranslationY > 0) {
            translationY1 = new KeyAttributes();
            translationY2 = new KeyAttributes();
            translationY1.setValue("translationY", Integer.valueOf(this.mMotionEffectTranslationY));
            translationY1.setFramePosition(this.mMotionEffectEnd);
            translationY2.setValue("translationY", 0);
            translationY2.setFramePosition(this.mMotionEffectEnd - 1);
        }
        int moveDirection = this.mFadeMove;
        if (this.mFadeMove == -1) {
            int[] direction = new int[4];
            for (View view : views2) {
                MotionController mc = hashMap.get(view);
                if (mc != null) {
                    float x = mc.getFinalX() - mc.getStartX();
                    float y = mc.getFinalY() - mc.getStartY();
                    if (y < 0.0f) {
                        direction[1] = direction[1] + 1;
                    }
                    if (y > 0.0f) {
                        direction[0] = direction[0] + 1;
                    }
                    if (x > 0.0f) {
                        direction[3] = direction[3] + 1;
                    }
                    if (x < 0.0f) {
                        direction[2] = direction[2] + 1;
                    }
                }
            }
            int max = direction[0];
            moveDirection = 0;
            for (int i = 1; i < 4; i++) {
                if (max < direction[i]) {
                    max = direction[i];
                    moveDirection = i;
                }
            }
        }
        int i2 = 0;
        while (i2 < views2.length) {
            MotionController mc2 = hashMap.get(views2[i2]);
            if (mc2 == null) {
                views = views2;
                MotionLayout motionLayout2 = motionLayout;
            } else {
                float x2 = mc2.getFinalX() - mc2.getStartX();
                float y2 = mc2.getFinalY() - mc2.getStartY();
                boolean apply = true;
                if (moveDirection == 0) {
                    if (y2 > 0.0f && (!this.mMotionEffectStrictMove || x2 == 0.0f)) {
                        apply = false;
                    }
                } else if (moveDirection == 1) {
                    if (y2 < 0.0f && (!this.mMotionEffectStrictMove || x2 == 0.0f)) {
                        apply = false;
                    }
                } else if (moveDirection == 2) {
                    if (x2 < 0.0f && (!this.mMotionEffectStrictMove || y2 == 0.0f)) {
                        apply = false;
                    }
                } else if (moveDirection == 3 && x2 > 0.0f && (!this.mMotionEffectStrictMove || y2 == 0.0f)) {
                    apply = false;
                }
                if (apply) {
                    views = views2;
                    if (this.mViewTransitionId == -1) {
                        mc2.addKey(alpha1);
                        mc2.addKey(alpha2);
                        mc2.addKey(stick1);
                        mc2.addKey(stick2);
                        if (this.mMotionEffectTranslationX > 0) {
                            mc2.addKey(translationX1);
                            mc2.addKey(translationX2);
                        }
                        if (this.mMotionEffectTranslationY > 0) {
                            mc2.addKey(translationY1);
                            mc2.addKey(translationY2);
                            MotionLayout motionLayout3 = motionLayout;
                        } else {
                            MotionLayout motionLayout4 = motionLayout;
                        }
                    } else {
                        motionLayout.applyViewTransition(this.mViewTransitionId, mc2);
                    }
                } else {
                    views = views2;
                    MotionLayout motionLayout5 = motionLayout;
                }
            }
            i2++;
            hashMap = controllerMap;
            views2 = views;
        }
    }
}
