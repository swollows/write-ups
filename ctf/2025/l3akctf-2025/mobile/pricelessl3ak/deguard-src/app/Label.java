package app;

import android.util.Log;
import android.view.View;
import android.view.ViewParent;
import androidx.core.widget.NestedScrollView;

public final class Label
{
  public boolean c;
  public ViewParent f;
  public ViewParent g;
  public int[] h;
  public final NestedScrollView mView;
  
  public Label(NestedScrollView paramNestedScrollView)
  {
    mView = paramNestedScrollView;
  }
  
  public final ViewParent a(int paramInt)
  {
    if (paramInt != 0)
    {
      if (paramInt != 1) {
        return null;
      }
      return f;
    }
    return g;
  }
  
  public final boolean a(int paramInt1, int paramInt2, int paramInt3, int paramInt4, int[] paramArrayOfInt1, int paramInt5, int[] paramArrayOfInt2)
  {
    if (c)
    {
      ViewParent localViewParent = a(paramInt5);
      if (localViewParent == null) {
        return false;
      }
      if ((paramInt1 == 0) && (paramInt2 == 0) && (paramInt3 == 0) && (paramInt4 == 0))
      {
        if (paramArrayOfInt1 != null)
        {
          paramArrayOfInt1[0] = 0;
          paramArrayOfInt1[1] = 0;
          return false;
        }
      }
      else
      {
        NestedScrollView localNestedScrollView = mView;
        int i;
        int j;
        if (paramArrayOfInt1 != null)
        {
          localNestedScrollView.getLocationInWindow(paramArrayOfInt1);
          i = paramArrayOfInt1[0];
          j = paramArrayOfInt1[1];
        }
        else
        {
          i = 0;
          j = 0;
        }
        Object localObject = paramArrayOfInt2;
        if (paramArrayOfInt2 == null)
        {
          if (h == null) {
            h = new int[2];
          }
          localObject = h;
          localObject[0] = 0;
          localObject[1] = 0;
        }
        if ((localViewParent instanceof NestedScrollingParent))
        {
          ((NestedScrollingParent)localViewParent).onNestedScroll(localNestedScrollView, paramInt1, paramInt2, paramInt3, paramInt4, paramInt5, (int[])localObject);
        }
        else
        {
          localObject[0] += paramInt3;
          localObject[1] += paramInt4;
          if ((localViewParent instanceof SwipeRefreshLayout)) {
            ((SwipeRefreshLayout)localViewParent).onNestedScroll(localNestedScrollView, paramInt1, paramInt2, paramInt3, paramInt4, paramInt5);
          } else if (paramInt5 == 0) {
            try
            {
              localViewParent.onNestedScroll(localNestedScrollView, paramInt1, paramInt2, paramInt3, paramInt4);
            }
            catch (AbstractMethodError paramArrayOfInt2)
            {
              localObject = new StringBuilder("ViewParent ");
              ((StringBuilder)localObject).append(localViewParent);
              ((StringBuilder)localObject).append(" does not implement interface method onNestedScroll");
              Log.e("ViewParentCompat", ((StringBuilder)localObject).toString(), paramArrayOfInt2);
            }
          }
        }
        if (paramArrayOfInt1 == null) {
          break label325;
        }
        localNestedScrollView.getLocationInWindow(paramArrayOfInt1);
        paramArrayOfInt1[0] -= i;
        paramArrayOfInt1[1] -= j;
        return true;
      }
    }
    return false;
    label325:
    return true;
  }
  
  public final boolean onNestedPreFling(float paramFloat1, float paramFloat2)
  {
    if (c)
    {
      ViewParent localViewParent = a(0);
      if (localViewParent != null)
      {
        NestedScrollView localNestedScrollView = mView;
        try
        {
          boolean bool = localViewParent.onNestedPreFling(localNestedScrollView, paramFloat1, paramFloat2);
          return bool;
        }
        catch (AbstractMethodError localAbstractMethodError)
        {
          StringBuilder localStringBuilder = new StringBuilder("ViewParent ");
          localStringBuilder.append(localViewParent);
          localStringBuilder.append(" does not implement interface method onNestedPreFling");
          Log.e("ViewParentCompat", localStringBuilder.toString(), localAbstractMethodError);
        }
      }
    }
    return false;
  }
}
