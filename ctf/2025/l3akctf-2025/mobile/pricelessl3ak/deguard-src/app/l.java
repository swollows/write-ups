package app;

import android.util.SparseArray;
import android.view.View;
import android.view.ViewGroup;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.WeakHashMap;

public final class l
{
  public static final ArrayList c = new ArrayList();
  public SparseArray a;
  public WeakHashMap b;
  public WeakReference l;
  
  public final View a(View paramView)
  {
    Object localObject = b;
    if (localObject != null)
    {
      if (!((WeakHashMap)localObject).containsKey(paramView)) {
        return null;
      }
      int i;
      if ((paramView instanceof ViewGroup))
      {
        localObject = (ViewGroup)paramView;
        i = ((ViewGroup)localObject).getChildCount() - 1;
        while (i >= 0)
        {
          View localView = a(((ViewGroup)localObject).getChildAt(i));
          if (localView != null) {
            return localView;
          }
          i -= 1;
        }
      }
      paramView = (ArrayList)paramView.getTag(2131230890);
      if (paramView != null)
      {
        i = paramView.size() - 1;
        if (i < 0) {
          return null;
        }
        paramView.get(i).getClass();
        throw new ClassCastException();
      }
    }
    return null;
  }
}
