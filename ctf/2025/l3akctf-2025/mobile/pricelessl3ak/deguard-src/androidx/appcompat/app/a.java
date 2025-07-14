package androidx.appcompat.app;

import android.view.View;
import android.view.Window;
import android.view.Window.Callback;
import androidx.appcompat.widget.ContentFrameLayout.OnAttachListener;
import app.TypeToken;
import app.ViewPropertyAnimatorUpdateListener;
import menu.f;

public final class a
  implements ViewPropertyAnimatorUpdateListener, ContentFrameLayout.OnAttachListener, menu.Object
{
  public void a(f paramF, boolean paramBoolean)
  {
    switch (d)
    {
    default: 
      f localF = paramF.q();
      int k = 0;
      int i;
      if (localF != paramF) {
        i = 1;
      } else {
        i = 0;
      }
      if (i != 0) {
        paramF = localF;
      }
      AppCompatDelegateImplV7 localAppCompatDelegateImplV7 = a;
      AppCompatDelegateImplV7.PanelFeatureState[] arrayOfPanelFeatureState = f;
      int j;
      if (arrayOfPanelFeatureState != null) {
        j = arrayOfPanelFeatureState.length;
      } else {
        j = 0;
      }
      while (k < j)
      {
        AppCompatDelegateImplV7.PanelFeatureState localPanelFeatureState = arrayOfPanelFeatureState[k];
        if ((localPanelFeatureState != null) && (j == paramF))
        {
          paramF = localPanelFeatureState;
          break label130;
        }
        k += 1;
      }
      paramF = null;
      if (paramF != null)
      {
        if (i != 0)
        {
          localAppCompatDelegateImplV7.a(a, paramF, localF);
          localAppCompatDelegateImplV7.a(paramF, true);
          return;
        }
        localAppCompatDelegateImplV7.a(paramF, paramBoolean);
        return;
      }
      break;
    case 2: 
      label130:
      a.a(paramF);
    }
  }
  
  public boolean a(f paramF)
  {
    switch (d)
    {
    default: 
      if (paramF == paramF.q())
      {
        localObject = a;
        if (mHasActionBar)
        {
          Window.Callback localCallback = mWindow.getCallback();
          if ((localCallback != null) && (!b)) {
            localCallback.onMenuOpened(108, paramF);
          }
        }
      }
      return true;
    }
    Object localObject = a.mWindow.getCallback();
    if (localObject != null) {
      ((Window.Callback)localObject).onMenuOpened(108, paramF);
    }
    return true;
  }
  
  public TypeToken access$300(View paramView, TypeToken paramTypeToken)
  {
    throw new Runtime("d2j fail translate: java.lang.RuntimeException: fail exe a69 = a68\n\tat com.googlecode.dex2jar.ir.ts.an.BaseAnalyze.exec(BaseAnalyze.java:92)\n\tat com.googlecode.dex2jar.ir.ts.an.BaseAnalyze.exec(BaseAnalyze.java:1)\n\tat com.googlecode.dex2jar.ir.ts.Cfg.dfs(Cfg.java:255)\n\tat com.googlecode.dex2jar.ir.ts.an.BaseAnalyze.analyze0(BaseAnalyze.java:75)\n\tat com.googlecode.dex2jar.ir.ts.an.BaseAnalyze.analyze(BaseAnalyze.java:69)\n\tat com.googlecode.dex2jar.ir.ts.UnSSATransformer.transform(UnSSATransformer.java:274)\n\tat com.googlecode.d2j.dex.Dex2jar$2.optimize(Dex2jar.java:163)\n\tat com.googlecode.d2j.dex.Dex2Asm.convertCode(Dex2Asm.java:414)\n\tat com.googlecode.d2j.dex.ExDex2Asm.convertCode(ExDex2Asm.java:42)\n\tat com.googlecode.d2j.dex.Dex2jar$2.convertCode(Dex2jar.java:128)\n\tat com.googlecode.d2j.dex.Dex2Asm.convertMethod(Dex2Asm.java:509)\n\tat com.googlecode.d2j.dex.Dex2Asm.convertClass(Dex2Asm.java:406)\n\tat com.googlecode.d2j.dex.Dex2Asm.convertDex(Dex2Asm.java:422)\n\tat com.googlecode.d2j.dex.Dex2jar.doTranslate(Dex2jar.java:172)\n\tat com.googlecode.d2j.dex.Dex2jar.to(Dex2jar.java:272)\n\tat com.googlecode.dex2jar.tools.Dex2jarCmd.doCommandLine(Dex2jarCmd.java:108)\n\tat com.googlecode.dex2jar.tools.BaseCmd.doMain(BaseCmd.java:288)\n\tat com.googlecode.dex2jar.tools.Dex2jarCmd.main(Dex2jarCmd.java:32)\nCaused by: java.lang.NullPointerException\n\tat com.googlecode.dex2jar.ir.ts.UnSSATransformer$LiveA.onUseLocal(UnSSATransformer.java:552)\n\tat com.googlecode.dex2jar.ir.ts.UnSSATransformer$LiveA.onUseLocal(UnSSATransformer.java:1)\n\tat com.googlecode.dex2jar.ir.ts.an.BaseAnalyze.onUse(BaseAnalyze.java:166)\n\tat com.googlecode.dex2jar.ir.ts.an.BaseAnalyze.onUse(BaseAnalyze.java:1)\n\tat com.googlecode.dex2jar.ir.ts.Cfg.travel(Cfg.java:331)\n\tat com.googlecode.dex2jar.ir.ts.Cfg.travel(Cfg.java:387)\n\tat com.googlecode.dex2jar.ir.ts.an.BaseAnalyze.exec(BaseAnalyze.java:90)\n\t... 17 more\n");
  }
}
