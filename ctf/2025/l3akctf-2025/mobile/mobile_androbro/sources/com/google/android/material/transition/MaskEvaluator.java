package com.google.android.material.transition;

import android.graphics.Canvas;
import android.graphics.Path;
import android.graphics.RectF;
import com.google.android.material.shape.ShapeAppearanceModel;
import com.google.android.material.shape.ShapeAppearancePathProvider;
import com.google.android.material.transition.MaterialContainerTransform;

class MaskEvaluator {
    private ShapeAppearanceModel currentShapeAppearanceModel;
    private final Path endPath = new Path();
    private final Path path = new Path();
    private final ShapeAppearancePathProvider pathProvider = ShapeAppearancePathProvider.getInstance();
    private final Path startPath = new Path();

    MaskEvaluator() {
    }

    /* access modifiers changed from: package-private */
    public void evaluate(float progress, ShapeAppearanceModel startShapeAppearanceModel, ShapeAppearanceModel endShapeAppearanceModel, RectF currentStartBounds, RectF currentStartBoundsMasked, RectF currentEndBoundsMasked, MaterialContainerTransform.ProgressThresholds shapeMaskThresholds) {
        this.currentShapeAppearanceModel = TransitionUtils.lerp(startShapeAppearanceModel, endShapeAppearanceModel, currentStartBounds, currentEndBoundsMasked, shapeMaskThresholds.getStart(), shapeMaskThresholds.getEnd(), progress);
        RectF rectF = currentStartBoundsMasked;
        this.pathProvider.calculatePath(this.currentShapeAppearanceModel, 1.0f, currentStartBoundsMasked, this.startPath);
        this.pathProvider.calculatePath(this.currentShapeAppearanceModel, 1.0f, currentEndBoundsMasked, this.endPath);
        this.path.op(this.startPath, this.endPath, Path.Op.UNION);
    }

    /* access modifiers changed from: package-private */
    public void clip(Canvas canvas) {
        canvas.clipPath(this.path);
    }

    /* access modifiers changed from: package-private */
    public Path getPath() {
        return this.path;
    }

    /* access modifiers changed from: package-private */
    public ShapeAppearanceModel getCurrentShapeAppearanceModel() {
        return this.currentShapeAppearanceModel;
    }
}
