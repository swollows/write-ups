package app;

import android.view.View;
import androidx.core.widget.NestedScrollView;

public abstract interface SwipeRefreshLayout
{
  public abstract void draw(int paramInt1, int paramInt2, int[] paramArrayOfInt, int paramInt3);
  
  public abstract void onNestedScroll(NestedScrollView paramNestedScrollView, int paramInt1, int paramInt2, int paramInt3, int paramInt4, int paramInt5);
  
  public abstract boolean onStartNestedScroll(View paramView1, View paramView2, int paramInt1, int paramInt2);
  
  public abstract void onStopNestedScroll(View paramView, int paramInt);
  
  public abstract void onStopNestedScroll(View paramView1, View paramView2, int paramInt1, int paramInt2);
}
