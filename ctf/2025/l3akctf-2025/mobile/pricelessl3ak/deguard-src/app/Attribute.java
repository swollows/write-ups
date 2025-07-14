package app;

import android.os.Build.VERSION;
import android.view.View;
import android.view.View.AccessibilityDelegate;
import io.StringMap;
import java.nio.ByteBuffer;
import java.util.ConcurrentModificationException;

public abstract class Attribute
{
  public int count;
  public int data;
  public int size;
  public Object value;
  
  public Attribute()
  {
    if (Element.content == null) {
      Element.content = new Element(5);
    }
  }
  
  public abstract Object a(View paramView);
  
  public abstract void a(View paramView, Object paramObject);
  
  public abstract boolean a(Object paramObject1, Object paramObject2);
  
  public boolean hasNext()
  {
    return data < value).data;
  }
  
  public int read(int paramInt)
  {
    if (paramInt < count) {
      return ((ByteBuffer)value).getShort(size + paramInt);
    }
    return 0;
  }
  
  public void read()
  {
    for (;;)
    {
      int i = data;
      StringMap localStringMap = (StringMap)value;
      if ((i >= data) || (length[i] >= 0)) {
        break;
      }
      data = (i + 1);
    }
  }
  
  public void remove()
  {
    size();
    if (size != -1)
    {
      StringMap localStringMap = (StringMap)value;
      localStringMap.get();
      localStringMap.get(size);
      size = -1;
      count = modCount;
      return;
    }
    throw new IllegalStateException("Call next() before removing element from the iterator.");
  }
  
  public void size()
  {
    if (value).modCount == count) {
      return;
    }
    throw new ConcurrentModificationException();
  }
  
  public void write(View paramView, Object paramObject)
  {
    if (Build.VERSION.SDK_INT >= size)
    {
      a(paramView, paramObject);
      return;
    }
    Object localObject1;
    Object localObject2;
    if (Build.VERSION.SDK_INT >= size)
    {
      localObject1 = a(paramView);
    }
    else
    {
      localObject2 = paramView.getTag(data);
      localObject1 = localObject2;
      if (!((Class)value).isInstance(localObject2)) {
        localObject1 = null;
      }
    }
    if (a(localObject1, paramObject))
    {
      localObject1 = ViewCompat.getMinimumWidth(paramView);
      if (localObject1 == null) {
        localObject1 = null;
      } else if ((localObject1 instanceof AccessibilityDelegateCompatJellyBean.1)) {
        localObject1 = this$0;
      } else {
        localObject1 = new AccessibilityDelegateCompat((View.AccessibilityDelegate)localObject1);
      }
      localObject2 = localObject1;
      if (localObject1 == null) {
        localObject2 = new AccessibilityDelegateCompat();
      }
      ViewCompat.onInitializeAccessibilityNodeInfo(paramView, (AccessibilityDelegateCompat)localObject2);
      paramView.setTag(data, paramObject);
      ViewCompat.init(paramView, count);
    }
  }
}
