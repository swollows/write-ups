package androidx.appcompat.widget;

import android.view.View;
import android.window.OnBackInvokedCallback;
import android.window.OnBackInvokedDispatcher;
import androidx.appcompat.app.d;
import java.util.Objects;

public abstract class Frame
{
  public static OnBackInvokedCallback a(Runnable paramRunnable)
  {
    Objects.requireNonNull(paramRunnable);
    return new d(1, paramRunnable);
  }
  
  public static OnBackInvokedDispatcher a(View paramView)
  {
    return paramView.findOnBackInvokedDispatcher();
  }
  
  public static void append(Object paramObject1, Object paramObject2)
  {
    ((OnBackInvokedDispatcher)paramObject1).registerOnBackInvokedCallback(1000000, (OnBackInvokedCallback)paramObject2);
  }
  
  public static void push(Object paramObject1, Object paramObject2)
  {
    ((OnBackInvokedDispatcher)paramObject1).unregisterOnBackInvokedCallback((OnBackInvokedCallback)paramObject2);
  }
}
