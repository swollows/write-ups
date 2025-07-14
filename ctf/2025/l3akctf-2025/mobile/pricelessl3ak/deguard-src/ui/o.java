package ui;

import android.app.Activity;
import android.app.Application;
import android.content.Intent;
import android.os.Build.VERSION;
import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;
import androidx.appcompat.app.Type;
import androidx.fragment.asm.FragmentActivity;
import astuetz.Menu;
import params.Log;
import widgets.Label;

public final class o
  extends params.e
  implements Menu
{
  public final Object a()
  {
    FragmentActivity localFragmentActivity;
    Object localObject;
    switch (a)
    {
    default: 
      localFragmentActivity = b;
      localObject = new i(new GifDrawable.3(localFragmentActivity, 1));
      if (Build.VERSION.SDK_INT >= 33)
      {
        if (!Log.equals(Looper.myLooper(), Looper.getMainLooper()))
        {
          new Handler(Looper.getMainLooper()).post(new Type(localFragmentActivity, localObject, 1));
          return localObject;
        }
        AbstractGalleryActivity.access$addObserverForBackInvoker(localFragmentActivity, (i)localObject);
        return localObject;
      }
      break;
    case 2: 
      localObject = b;
      return new Plot(AbstractGalleryActivity.access$getReportFullyDrawnExecutor$p((AbstractGalleryActivity)localObject), new o((FragmentActivity)localObject, 1));
    case 1: 
      b.reportFullyDrawn();
      return Label.i;
    case 0: 
      localFragmentActivity = b;
      Application localApplication = localFragmentActivity.getApplication();
      if (localFragmentActivity.getIntent() != null) {
        localObject = localFragmentActivity.getIntent().getExtras();
      } else {
        localObject = null;
      }
      return new androidx.lifecycle.e(localApplication, localFragmentActivity, (Bundle)localObject);
    }
    return localObject;
  }
}
