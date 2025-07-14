package network;

import android.graphics.Rect;
import android.text.method.TransformationMethod;
import android.view.View;
import asm.ClassWriter;

public final class AllCapsTransformationMethod
  implements TransformationMethod
{
  public final TransformationMethod d;
  
  public AllCapsTransformationMethod(TransformationMethod paramTransformationMethod)
  {
    d = paramTransformationMethod;
  }
  
  public final CharSequence getTransformation(CharSequence paramCharSequence, View paramView)
  {
    if (paramView.isInEditMode()) {
      return paramCharSequence;
    }
    TransformationMethod localTransformationMethod = d;
    CharSequence localCharSequence = paramCharSequence;
    if (localTransformationMethod != null) {
      localCharSequence = localTransformationMethod.getTransformation(paramCharSequence, paramView);
    }
    paramCharSequence = localCharSequence;
    if (localCharSequence != null)
    {
      if (ClassWriter.a().get() != 1) {
        return localCharSequence;
      }
      paramCharSequence = ClassWriter.a();
      paramCharSequence.getClass();
      paramCharSequence = paramCharSequence.get(localCharSequence, 0, localCharSequence.length());
    }
    return paramCharSequence;
  }
  
  public final void onFocusChanged(View paramView, CharSequence paramCharSequence, boolean paramBoolean, int paramInt, Rect paramRect)
  {
    TransformationMethod localTransformationMethod = d;
    if (localTransformationMethod != null) {
      localTransformationMethod.onFocusChanged(paramView, paramCharSequence, paramBoolean, paramInt, paramRect);
    }
  }
}
