package menu;

import android.content.Context;
import android.content.res.Resources;
import android.graphics.Rect;
import android.util.DisplayMetrics;
import android.view.Gravity;
import android.view.View;

public class i
{
  public View a;
  public final f b;
  public final Context c;
  public final MenuPopupHelper e = new MenuPopupHelper(this);
  public int f = 8388611;
  public MenuPopupHelper h;
  public NavigationMenuPresenter l;
  public final boolean p;
  public final int r;
  public boolean t;
  public Object v;
  
  public i(int paramInt, Context paramContext, View paramView, f paramF, boolean paramBoolean)
  {
    c = paramContext;
    b = paramF;
    a = paramView;
    p = paramBoolean;
    r = paramInt;
  }
  
  public final void a(int paramInt1, int paramInt2, boolean paramBoolean1, boolean paramBoolean2)
  {
    NavigationMenuPresenter localNavigationMenuPresenter = getView();
    localNavigationMenuPresenter.updateMenuView(paramBoolean2);
    if (paramBoolean1)
    {
      int i = paramInt1;
      if ((Gravity.getAbsoluteGravity(f, a.getLayoutDirection()) & 0x7) == 5) {
        i = paramInt1 - a.getWidth();
      }
      localNavigationMenuPresenter.dismiss(i);
      localNavigationMenuPresenter.setGravity(paramInt2);
      paramInt1 = (int)(c.getResources().getDisplayMetrics().density * 48.0F / 2.0F);
      y = new Rect(i - paramInt1, paramInt2 - paramInt1, i + paramInt1, paramInt2 + paramInt1);
    }
    localNavigationMenuPresenter.show();
  }
  
  public final boolean a()
  {
    NavigationMenuPresenter localNavigationMenuPresenter = l;
    return (localNavigationMenuPresenter != null) && (localNavigationMenuPresenter.isShowing());
  }
  
  public void b()
  {
    l = null;
    MenuPopupHelper localMenuPopupHelper = h;
    if (localMenuPopupHelper != null) {
      localMenuPopupHelper.onDismiss();
    }
  }
  
  public final NavigationMenuPresenter getView()
  {
    throw new Runtime("d2j fail translate: java.lang.RuntimeException: fail exe a5 = a4\n\tat com.googlecode.dex2jar.ir.ts.an.BaseAnalyze.exec(BaseAnalyze.java:92)\n\tat com.googlecode.dex2jar.ir.ts.an.BaseAnalyze.exec(BaseAnalyze.java:1)\n\tat com.googlecode.dex2jar.ir.ts.Cfg.dfs(Cfg.java:255)\n\tat com.googlecode.dex2jar.ir.ts.an.BaseAnalyze.analyze0(BaseAnalyze.java:75)\n\tat com.googlecode.dex2jar.ir.ts.an.BaseAnalyze.analyze(BaseAnalyze.java:69)\n\tat com.googlecode.dex2jar.ir.ts.UnSSATransformer.transform(UnSSATransformer.java:274)\n\tat com.googlecode.d2j.dex.Dex2jar$2.optimize(Dex2jar.java:163)\n\tat com.googlecode.d2j.dex.Dex2Asm.convertCode(Dex2Asm.java:414)\n\tat com.googlecode.d2j.dex.ExDex2Asm.convertCode(ExDex2Asm.java:42)\n\tat com.googlecode.d2j.dex.Dex2jar$2.convertCode(Dex2jar.java:128)\n\tat com.googlecode.d2j.dex.Dex2Asm.convertMethod(Dex2Asm.java:509)\n\tat com.googlecode.d2j.dex.Dex2Asm.convertClass(Dex2Asm.java:406)\n\tat com.googlecode.d2j.dex.Dex2Asm.convertDex(Dex2Asm.java:422)\n\tat com.googlecode.d2j.dex.Dex2jar.doTranslate(Dex2jar.java:172)\n\tat com.googlecode.d2j.dex.Dex2jar.to(Dex2jar.java:272)\n\tat com.googlecode.dex2jar.tools.Dex2jarCmd.doCommandLine(Dex2jarCmd.java:108)\n\tat com.googlecode.dex2jar.tools.BaseCmd.doMain(BaseCmd.java:288)\n\tat com.googlecode.dex2jar.tools.Dex2jarCmd.main(Dex2jarCmd.java:32)\nCaused by: java.lang.NullPointerException\n\tat com.googlecode.dex2jar.ir.ts.UnSSATransformer$LiveA.onUseLocal(UnSSATransformer.java:552)\n\tat com.googlecode.dex2jar.ir.ts.UnSSATransformer$LiveA.onUseLocal(UnSSATransformer.java:1)\n\tat com.googlecode.dex2jar.ir.ts.an.BaseAnalyze.onUse(BaseAnalyze.java:166)\n\tat com.googlecode.dex2jar.ir.ts.an.BaseAnalyze.onUse(BaseAnalyze.java:1)\n\tat com.googlecode.dex2jar.ir.ts.Cfg.travel(Cfg.java:331)\n\tat com.googlecode.dex2jar.ir.ts.Cfg.travel(Cfg.java:387)\n\tat com.googlecode.dex2jar.ir.ts.an.BaseAnalyze.exec(BaseAnalyze.java:90)\n\t... 17 more\n");
  }
}
