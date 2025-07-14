package ui;

import android.window.BackEvent;
import android.window.OnBackAnimationCallback;
import params.Log;

public final class ClassWriter
  implements OnBackAnimationCallback
{
  public ClassWriter(Label paramLabel1, Label paramLabel2, c paramC1, c paramC2)
  {
    i = paramLabel1;
    a = paramLabel2;
    c = paramC1;
    d = paramC2;
  }
  
  public final void onBackCancelled()
  {
    d.a();
  }
  
  public final void onBackInvoked()
  {
    c.a();
  }
  
  public final void onBackProgressed(BackEvent paramBackEvent)
  {
    Log.get(paramBackEvent, "backEvent");
    a.draw(new b(paramBackEvent));
  }
  
  public final void onBackStarted(BackEvent paramBackEvent)
  {
    Log.get(paramBackEvent, "backEvent");
    i.draw(new b(paramBackEvent));
  }
}
