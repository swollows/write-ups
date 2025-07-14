package menu;

import android.content.Context;
import android.content.res.Resources;
import android.os.Handler;
import android.util.DisplayMetrics;
import android.view.Gravity;
import android.view.KeyEvent;
import android.view.View;
import android.view.View.OnKeyListener;
import android.view.ViewTreeObserver;
import android.widget.HeaderViewListAdapter;
import android.widget.ListView;
import android.widget.PopupWindow;
import android.widget.PopupWindow.OnDismissListener;
import androidx.appcompat.widget.ListPopupWindow;
import androidx.appcompat.widget.ListViewCompat;
import androidx.appcompat.widget.PopupWindowCompat.PopupWindowImpl;
import java.util.ArrayList;
import java.util.Iterator;

public final class w
  extends NavigationMenuPresenter
  implements View.OnKeyListener, PopupWindow.OnDismissListener
{
  public View a;
  public int b;
  public final ArrayList c = new ArrayList();
  public final app.f d = new app.f(15, this);
  public int e;
  public final Handler f;
  public final int g;
  public final int h;
  public boolean i;
  public MenuPopupHelper j;
  public final boolean k;
  public final Context l;
  public ViewTreeObserver mTreeObserver;
  public int p;
  public int q;
  public boolean r;
  public boolean s;
  public int t;
  public final androidx.appcompat.widget.MenuPopupHelper this$0 = new androidx.appcompat.widget.MenuPopupHelper(2, this);
  public boolean u;
  public final ArrayList v = new ArrayList();
  public View view;
  public boolean w;
  public final MainActivity.2 x = new MainActivity.2(this, 0);
  public Object y;
  
  public w(Context paramContext, View paramView, int paramInt, boolean paramBoolean)
  {
    super();
    int m = 0;
    e = 0;
    p = 0;
    l = paramContext;
    a = paramView;
    h = paramInt;
    k = paramBoolean;
    i = false;
    if (paramView.getLayoutDirection() == 1) {
      paramInt = m;
    } else {
      paramInt = 1;
    }
    b = paramInt;
    paramContext = paramContext.getResources();
    g = Math.max(getDisplayMetricswidthPixels / 2, paramContext.getDimensionPixelSize(2131099671));
    f = new Handler();
  }
  
  public final void a(int paramInt)
  {
    if (e != paramInt)
    {
      e = paramInt;
      p = Gravity.getAbsoluteGravity(paramInt, a.getLayoutDirection());
    }
  }
  
  public final void a(View paramView)
  {
    if (a != paramView)
    {
      a = paramView;
      p = Gravity.getAbsoluteGravity(e, paramView.getLayoutDirection());
    }
  }
  
  public final void a(PopupWindow.OnDismissListener paramOnDismissListener)
  {
    j = ((MenuPopupHelper)paramOnDismissListener);
  }
  
  public final void a(Object paramObject)
  {
    y = paramObject;
  }
  
  public final void a(f paramF)
  {
    throw new Runtime("d2j fail translate: java.lang.RuntimeException: \n\tat com.googlecode.dex2jar.ir.ts.NewTransformer.transform(NewTransformer.java:134)\n\tat com.googlecode.d2j.dex.Dex2jar$2.optimize(Dex2jar.java:148)\n\tat com.googlecode.d2j.dex.Dex2Asm.convertCode(Dex2Asm.java:414)\n\tat com.googlecode.d2j.dex.ExDex2Asm.convertCode(ExDex2Asm.java:42)\n\tat com.googlecode.d2j.dex.Dex2jar$2.convertCode(Dex2jar.java:128)\n\tat com.googlecode.d2j.dex.Dex2Asm.convertMethod(Dex2Asm.java:509)\n\tat com.googlecode.d2j.dex.Dex2Asm.convertClass(Dex2Asm.java:406)\n\tat com.googlecode.d2j.dex.Dex2Asm.convertDex(Dex2Asm.java:422)\n\tat com.googlecode.d2j.dex.Dex2jar.doTranslate(Dex2jar.java:172)\n\tat com.googlecode.d2j.dex.Dex2jar.to(Dex2jar.java:272)\n\tat com.googlecode.dex2jar.tools.Dex2jarCmd.doCommandLine(Dex2jarCmd.java:108)\n\tat com.googlecode.dex2jar.tools.BaseCmd.doMain(BaseCmd.java:288)\n\tat com.googlecode.dex2jar.tools.Dex2jarCmd.main(Dex2jarCmd.java:32)\n");
  }
  
  public final void a(f paramF, boolean paramBoolean)
  {
    java.lang.Object localObject1 = c;
    int n = ((ArrayList)localObject1).size();
    int m = 0;
    while (m < n)
    {
      if (paramF == getc) {
        break label49;
      }
      m += 1;
    }
    m = -1;
    label49:
    if (m < 0) {
      return;
    }
    n = m + 1;
    if (n < ((ArrayList)localObject1).size()) {
      getc.a(false);
    }
    java.lang.Object localObject2 = (b)((ArrayList)localObject1).remove(m);
    c.b(this);
    boolean bool = s;
    localObject2 = this$0;
    if (bool)
    {
      PopupWindowCompat.PopupWindowImpl.setWindowLayoutType(mPopup, null);
      mPopup.setAnimationStyle(0);
    }
    ((ListPopupWindow)localObject2).dismiss();
    n = ((ArrayList)localObject1).size();
    if (n > 0)
    {
      b = get1b;
    }
    else
    {
      if (a.getLayoutDirection() == 1) {
        m = 0;
      } else {
        m = 1;
      }
      b = m;
    }
    if (n == 0)
    {
      dismiss();
      localObject1 = y;
      if (localObject1 != null) {
        ((Object)localObject1).a(paramF, true);
      }
      paramF = mTreeObserver;
      if (paramF != null)
      {
        if (paramF.isAlive()) {
          mTreeObserver.removeGlobalOnLayoutListener(this$0);
        }
        mTreeObserver = null;
      }
      view.removeOnAttachStateChangeListener(x);
      j.onDismiss();
      return;
    }
    if (paramBoolean) {
      get0c.a(false);
    }
  }
  
  public final void a(boolean paramBoolean)
  {
    i = paramBoolean;
  }
  
  public final boolean a()
  {
    return false;
  }
  
  public final boolean a(p paramP)
  {
    java.lang.Object localObject = c.iterator();
    while (((Iterator)localObject).hasNext())
    {
      b localB = (b)((Iterator)localObject).next();
      if (paramP == c)
      {
        this$0.mListView.requestFocus();
        return true;
      }
    }
    if (paramP.hasVisibleItems())
    {
      onCloseMenu(paramP);
      localObject = y;
      if (localObject != null)
      {
        ((Object)localObject).a(paramP);
        return true;
      }
    }
    else
    {
      return false;
    }
    return true;
  }
  
  public final void dismiss()
  {
    java.lang.Object localObject1 = c;
    int m = ((ArrayList)localObject1).size();
    if (m > 0)
    {
      localObject1 = (b[])((ArrayList)localObject1).toArray(new b[m]);
      m -= 1;
      while (m >= 0)
      {
        java.lang.Object localObject2 = localObject1[m];
        if (this$0.mPopup.isShowing()) {
          this$0.dismiss();
        }
        m -= 1;
      }
    }
  }
  
  public final void dismiss(int paramInt)
  {
    r = true;
    q = paramInt;
  }
  
  public final boolean isShowing()
  {
    ArrayList localArrayList = c;
    return (localArrayList.size() > 0) && (get0this$0.mPopup.isShowing());
  }
  
  public final void onCloseMenu(f paramF)
  {
    paramF.a(this, l);
    if (isShowing())
    {
      a(paramF);
      return;
    }
    v.add(paramF);
  }
  
  public final void onDismiss()
  {
    ArrayList localArrayList = c;
    int n = localArrayList.size();
    int m = 0;
    while (m < n)
    {
      localB = (b)localArrayList.get(m);
      if (!this$0.mPopup.isShowing()) {
        break label54;
      }
      m += 1;
    }
    b localB = null;
    label54:
    if (localB != null) {
      c.a(false);
    }
  }
  
  public final ListViewCompat onItemClick()
  {
    ArrayList localArrayList = c;
    if (localArrayList.isEmpty()) {
      return null;
    }
    return getsize1this$0.mListView;
  }
  
  public final boolean onKey(View paramView, int paramInt, KeyEvent paramKeyEvent)
  {
    if ((paramKeyEvent.getAction() == 1) && (paramInt == 82))
    {
      dismiss();
      return true;
    }
    return false;
  }
  
  public final void setGravity(int paramInt)
  {
    u = true;
    t = paramInt;
  }
  
  public final void show()
  {
    if (isShowing()) {
      return;
    }
    java.lang.Object localObject = v;
    Iterator localIterator = ((ArrayList)localObject).iterator();
    while (localIterator.hasNext()) {
      a((f)localIterator.next());
    }
    ((ArrayList)localObject).clear();
    localObject = a;
    view = ((View)localObject);
    if (localObject != null)
    {
      int m;
      if (mTreeObserver == null) {
        m = 1;
      } else {
        m = 0;
      }
      localObject = ((View)localObject).getViewTreeObserver();
      mTreeObserver = ((ViewTreeObserver)localObject);
      if (m != 0) {
        ((ViewTreeObserver)localObject).addOnGlobalLayoutListener(this$0);
      }
      view.addOnAttachStateChangeListener(x);
    }
  }
  
  public final void updateMenuView()
  {
    Iterator localIterator = c.iterator();
    while (localIterator.hasNext())
    {
      java.lang.Object localObject = nextthis$0.mListView.getAdapter();
      if ((localObject instanceof HeaderViewListAdapter)) {
        localObject = (x)((HeaderViewListAdapter)localObject).getWrappedAdapter();
      } else {
        localObject = (x)localObject;
      }
      ((x)localObject).notifyDataSetChanged();
    }
  }
  
  public final void updateMenuView(boolean paramBoolean)
  {
    w = paramBoolean;
  }
}
