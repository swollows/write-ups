package androidx.appcompat.widget;

import Console.R.styleable;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import android.view.View;
import android.widget.TextView;
import app.f;

public final class ByteVector
{
  public final TextView a;
  public final f b;
  
  public ByteVector(TextView paramTextView)
  {
    a = paramTextView;
    b = new f(paramTextView);
  }
  
  public final void a(AttributeSet paramAttributeSet, int paramInt)
  {
    paramAttributeSet = a.getContext().obtainStyledAttributes(paramAttributeSet, R.styleable.a, paramInt, 0);
    boolean bool1;
    try
    {
      boolean bool2 = paramAttributeSet.hasValue(14);
      bool1 = true;
      if (bool2) {
        bool1 = paramAttributeSet.getBoolean(14, true);
      }
    }
    catch (Throwable localThrowable)
    {
      break label58;
    }
    paramAttributeSet.recycle();
    f(bool1);
    return;
    label58:
    paramAttributeSet.recycle();
    throw localThrowable;
  }
  
  public final void e(boolean paramBoolean)
  {
    ((drupal.Context)b.a).a(paramBoolean);
  }
  
  public final void f(boolean paramBoolean)
  {
    ((drupal.Context)b.a).b(paramBoolean);
  }
}
