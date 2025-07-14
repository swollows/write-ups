package androidx.appcompat.view.menu;

import a.ClassWriter;
import android.content.Context;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Adapter;
import android.widget.AdapterView;
import android.widget.AdapterView.OnItemClickListener;
import android.widget.ListView;
import menu.MenuBuilder.ItemInvoker;
import menu.MenuView;
import menu.f;
import menu.h;

public final class ExpandedMenuView
  extends ListView
  implements MenuBuilder.ItemInvoker, MenuView, AdapterView.OnItemClickListener
{
  public static final int[] TINT_ATTRS = { 16842964, 16843049 };
  public f mMenu;
  
  public ExpandedMenuView(Context paramContext, AttributeSet paramAttributeSet)
  {
    super(paramContext, paramAttributeSet);
    setOnItemClickListener(this);
    paramContext = ClassWriter.obtainStyledAttributes(paramContext, paramAttributeSet, TINT_ATTRS, 16842868);
    paramAttributeSet = (TypedArray)b;
    if (paramAttributeSet.hasValue(0)) {
      setBackgroundDrawable(paramContext.getDrawable(0));
    }
    if (paramAttributeSet.hasValue(1)) {
      setDivider(paramContext.getDrawable(1));
    }
    paramContext.recycle();
  }
  
  public int getWindowAnimations()
  {
    return 0;
  }
  
  public final void initialize(f paramF)
  {
    mMenu = paramF;
  }
  
  public final boolean invokeItem(h paramH)
  {
    return mMenu.a(paramH, null, 0);
  }
  
  public final void onDetachedFromWindow()
  {
    super.onDetachedFromWindow();
    setChildrenDrawingCacheEnabled(false);
  }
  
  public final void onItemClick(AdapterView paramAdapterView, View paramView, int paramInt, long paramLong)
  {
    invokeItem((h)getAdapter().getItem(paramInt));
  }
}
