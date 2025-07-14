package app;

import android.os.Build.VERSION;
import android.view.View;
import android.view.WindowInsets;
import java.util.Objects;
import util.Headers;

public final class TypeToken
{
  public static final TypeToken type = Elements.NONE;
  public final Elements a;
  
  static
  {
    int i = Build.VERSION.SDK_INT;
    if (i >= 34)
    {
      type = LabelInfo.type;
      return;
    }
    if (i >= 30)
    {
      type = Vector3.type;
      return;
    }
  }
  
  public TypeToken()
  {
    a = new Elements(this);
  }
  
  public TypeToken(WindowInsets paramWindowInsets)
  {
    int i = Build.VERSION.SDK_INT;
    if (i >= 34)
    {
      a = new LabelInfo(this, paramWindowInsets);
      return;
    }
    if (i >= 30)
    {
      a = new Vector3(this, paramWindowInsets);
      return;
    }
    if (i >= 29)
    {
      a = new NativeWith(this, paramWindowInsets);
      return;
    }
    if (i >= 28)
    {
      a = new TLongArrayStack(this, paramWindowInsets);
      return;
    }
    a = new RC2WrapEngine(this, paramWindowInsets);
  }
  
  public static Headers add(Headers paramHeaders, int paramInt1, int paramInt2, int paramInt3, int paramInt4)
  {
    int i = Math.max(0, left - paramInt1);
    int j = Math.max(0, right - paramInt2);
    int k = Math.max(0, height - paramInt3);
    int m = Math.max(0, top - paramInt4);
    if ((i == paramInt1) && (j == paramInt2) && (k == paramInt3) && (m == paramInt4)) {
      return paramHeaders;
    }
    return Headers.set(i, j, k, m);
  }
  
  public static TypeToken get(WindowInsets paramWindowInsets, View paramView)
  {
    paramWindowInsets.getClass();
    paramWindowInsets = new TypeToken(paramWindowInsets);
    if ((paramView != null) && (paramView.isAttachedToWindow()))
    {
      Object localObject = ViewCompat.this$0;
      localObject = Menu.get(paramView);
      Elements localElements = a;
      localElements.set((TypeToken)localObject);
      localElements.set(paramView.getRootView());
      localElements.add(paramView.getWindowSystemUiVisibility());
    }
    return paramWindowInsets;
  }
  
  public final boolean equals(Object paramObject)
  {
    if (this == paramObject) {
      return true;
    }
    if (!(paramObject instanceof TypeToken)) {
      return false;
    }
    paramObject = a;
    return Objects.equals(a, paramObject);
  }
  
  public final int hashCode()
  {
    Elements localElements = a;
    if (localElements == null) {
      return 0;
    }
    return localElements.hashCode();
  }
  
  public final WindowInsets unwrap()
  {
    Elements localElements = a;
    if ((localElements instanceof IntArray)) {
      return mSource;
    }
    return null;
  }
}
