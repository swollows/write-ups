package androidx.appcompat.app;

import accessibility.h;
import android.app.Activity;
import android.window.OnBackInvokedCallback;
import android.window.OnBackInvokedDispatcher;
import java.util.Objects;

public abstract class l
{
  public static OnBackInvokedCallback a(Object paramObject, AppCompatDelegateImplV7 paramAppCompatDelegateImplV7)
  {
    Objects.requireNonNull(paramAppCompatDelegateImplV7);
    paramAppCompatDelegateImplV7 = new d(0, paramAppCompatDelegateImplV7);
    h.f(h.next(paramObject), paramAppCompatDelegateImplV7);
    return paramAppCompatDelegateImplV7;
  }
  
  public static OnBackInvokedDispatcher a(Activity paramActivity)
  {
    return h.setVisible(paramActivity);
  }
  
  public static void a(Object paramObject1, Object paramObject2)
  {
    paramObject2 = h.f(paramObject2);
    h.f(h.next(paramObject1), paramObject2);
  }
}
