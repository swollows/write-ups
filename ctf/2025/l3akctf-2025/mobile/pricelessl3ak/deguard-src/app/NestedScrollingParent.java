package app;

import androidx.core.widget.NestedScrollView;

public abstract interface NestedScrollingParent
  extends SwipeRefreshLayout
{
  public abstract void onNestedScroll(NestedScrollView paramNestedScrollView, int paramInt1, int paramInt2, int paramInt3, int paramInt4, int paramInt5, int[] paramArrayOfInt);
}
