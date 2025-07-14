package androidx.fragment.asm;

import Abstract.R.id;
import android.content.Context;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import android.view.LayoutInflater.Factory2;
import android.view.View;
import androidx.fragment.app.d;
import androidx.fragment.app.j;
import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.Iterator;

public final class FragmentManagerImpl
  implements LayoutInflater.Factory2
{
  public final h b;
  
  public FragmentManagerImpl(h paramH)
  {
    b = paramH;
  }
  
  public final View onCreateView(View paramView, String paramString, Context paramContext, AttributeSet paramAttributeSet)
  {
    boolean bool = j.class.getName().equals(paramString);
    h localH = b;
    if (bool) {
      return new CellLayout(paramContext, paramAttributeSet, localH);
    }
    if (!"fragment".equals(paramString)) {
      return null;
    }
    String str = paramAttributeSet.getAttributeValue(null, "class");
    paramString = str;
    Object localObject = paramContext.obtainStyledAttributes(paramAttributeSet, R.id.a);
    int i = 0;
    if (str == null) {
      paramString = ((TypedArray)localObject).getString(0);
    }
    int j = ((TypedArray)localObject).getResourceId(1, -1);
    str = ((TypedArray)localObject).getString(2);
    ((TypedArray)localObject).recycle();
    if (paramString != null)
    {
      localObject = paramContext.getClassLoader();
      try
      {
        localObject = ByteVector.get((ClassLoader)localObject, paramString);
        bool = d.class.isAssignableFrom((Class)localObject);
      }
      catch (ClassNotFoundException localClassNotFoundException)
      {
        for (;;) {}
      }
      bool = false;
      if (!bool) {
        return null;
      }
      if (paramView != null) {
        i = paramView.getId();
      }
      if ((i == -1) && (j == -1) && (str == null))
      {
        paramView = new StringBuilder();
        paramView.append(paramAttributeSet.getPositionDescription());
        paramView.append(": Must specify unique android:id, android:tag, or have a parent with an id for ");
        paramView.append(paramString);
        throw new IllegalArgumentException(paramView.toString());
      }
      if (j != -1) {
        localH.b();
      }
      if (str != null)
      {
        paramView = a;
        paramAttributeSet = c;
        j = paramAttributeSet.size() - 1;
        while (j >= 0) {
          if (paramAttributeSet.get(j) == null) {
            j -= 1;
          } else {
            throw new ClassCastException();
          }
        }
        paramView = a.values().iterator();
        while (paramView.hasNext()) {
          if (paramView.next() != null) {
            throw new ClassCastException();
          }
        }
      }
      if (i != -1) {
        localH.b();
      }
      paramView = e;
      paramContext.getClassLoader();
      paramView.add(paramString);
      throw new NullPointerException("Null throw statement replaced by Soot");
    }
    return null;
  }
  
  public final View onCreateView(String paramString, Context paramContext, AttributeSet paramAttributeSet)
  {
    return onCreateView(null, paramString, paramContext, paramAttributeSet);
  }
}
