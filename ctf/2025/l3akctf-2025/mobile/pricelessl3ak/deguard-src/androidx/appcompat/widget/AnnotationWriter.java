package androidx.appcompat.widget;

import android.content.Context;
import android.graphics.Rect;
import android.view.LayoutInflater;
import android.view.View;
import android.view.WindowManager.LayoutParams;
import android.widget.TextView;

public final class AnnotationWriter
{
  public final View a;
  public final Rect b;
  public final Context c;
  public final TextView e;
  public final int[] f;
  public final WindowManager.LayoutParams g;
  public final int[] h;
  
  public AnnotationWriter(Context paramContext)
  {
    WindowManager.LayoutParams localLayoutParams = new WindowManager.LayoutParams();
    g = localLayoutParams;
    b = new Rect();
    h = new int[2];
    f = new int[2];
    c = paramContext;
    View localView = LayoutInflater.from(paramContext).inflate(2131427355, null);
    a = localView;
    e = ((TextView)localView.findViewById(2131230829));
    localLayoutParams.setTitle(p1.class.getSimpleName());
    packageName = paramContext.getPackageName();
    type = 1002;
    width = -2;
    height = -2;
    format = -3;
    windowAnimations = 2131623940;
    flags = 24;
  }
}
