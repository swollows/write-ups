package menu;

import android.content.Context;
import android.content.ContextWrapper;
import android.view.LayoutInflater;
import android.view.View;
import android.widget.AdapterView;
import android.widget.AdapterView.OnItemClickListener;
import androidx.appcompat.view.menu.ExpandedMenuView;

public final class e
  implements l, AdapterView.OnItemClickListener
{
  public Context a;
  public LayoutInflater b;
  public f c;
  public ExpandedMenuView d;
  public e.a g;
  public Object h;
  
  public e(ContextWrapper paramContextWrapper)
  {
    a = paramContextWrapper;
    b = LayoutInflater.from(paramContextWrapper);
  }
  
  public final void a(Object paramObject)
  {
    throw new NullPointerException("Null throw statement replaced by Soot");
  }
  
  public final void a(f paramF, boolean paramBoolean)
  {
    Object localObject = h;
    if (localObject != null) {
      localObject.a(paramF, paramBoolean);
    }
  }
  
  public final boolean a()
  {
    return false;
  }
  
  public final boolean a(h paramH)
  {
    return false;
  }
  
  public final boolean a(p paramP)
  {
    throw new Runtime("d2j fail translate: java.lang.RuntimeException: \n\tat com.googlecode.dex2jar.ir.ts.NewTransformer.transform(NewTransformer.java:134)\n\tat com.googlecode.d2j.dex.Dex2jar$2.optimize(Dex2jar.java:148)\n\tat com.googlecode.d2j.dex.Dex2Asm.convertCode(Dex2Asm.java:414)\n\tat com.googlecode.d2j.dex.ExDex2Asm.convertCode(ExDex2Asm.java:42)\n\tat com.googlecode.d2j.dex.Dex2jar$2.convertCode(Dex2jar.java:128)\n\tat com.googlecode.d2j.dex.Dex2Asm.convertMethod(Dex2Asm.java:509)\n\tat com.googlecode.d2j.dex.Dex2Asm.convertClass(Dex2Asm.java:406)\n\tat com.googlecode.d2j.dex.Dex2Asm.convertDex(Dex2Asm.java:422)\n\tat com.googlecode.d2j.dex.Dex2jar.doTranslate(Dex2jar.java:172)\n\tat com.googlecode.d2j.dex.Dex2jar.to(Dex2jar.java:272)\n\tat com.googlecode.dex2jar.tools.Dex2jarCmd.doCommandLine(Dex2jarCmd.java:108)\n\tat com.googlecode.dex2jar.tools.BaseCmd.doMain(BaseCmd.java:288)\n\tat com.googlecode.dex2jar.tools.Dex2jarCmd.main(Dex2jarCmd.java:32)\n");
  }
  
  public final boolean b(h paramH)
  {
    return false;
  }
  
  public final void initForMenu(Context paramContext, f paramF)
  {
    if (a != null)
    {
      a = paramContext;
      if (b == null) {
        b = LayoutInflater.from(paramContext);
      }
    }
    c = paramF;
    paramContext = g;
    if (paramContext != null) {
      paramContext.notifyDataSetChanged();
    }
  }
  
  public final void onItemClick(AdapterView paramAdapterView, View paramView, int paramInt, long paramLong)
  {
    c.a(g.a(paramInt), this, 0);
  }
  
  public final void updateMenuView()
  {
    e.a localA = g;
    if (localA != null) {
      localA.notifyDataSetChanged();
    }
  }
}
