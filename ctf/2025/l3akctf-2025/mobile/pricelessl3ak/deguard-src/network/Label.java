package network;

import android.text.InputFilter;
import android.text.method.PasswordTransformationMethod;
import android.text.method.TransformationMethod;
import android.util.SparseArray;
import android.widget.TextView;
import drupal.Context;

public final class Label
  extends Context
{
  public final TextView a;
  public boolean f;
  public final Tree g;
  
  public Label(TextView paramTextView)
  {
    super();
    a = paramTextView;
    f = true;
    g = new Tree(paramTextView);
  }
  
  public final void a(boolean paramBoolean)
  {
    if (paramBoolean) {
      b();
    }
  }
  
  public final InputFilter[] a(InputFilter[] paramArrayOfInputFilter)
  {
    boolean bool = f;
    int k = 0;
    Object localObject1;
    if (!bool)
    {
      localObject1 = new SparseArray(1);
      i = 0;
      while (i < paramArrayOfInputFilter.length)
      {
        localObject2 = paramArrayOfInputFilter[i];
        if ((localObject2 instanceof Tree)) {
          ((SparseArray)localObject1).put(i, localObject2);
        }
        i += 1;
      }
      if (((SparseArray)localObject1).size() == 0) {
        return paramArrayOfInputFilter;
      }
      int m = paramArrayOfInputFilter.length;
      localObject2 = new InputFilter[paramArrayOfInputFilter.length - ((SparseArray)localObject1).size()];
      j = 0;
      i = k;
      while (i < m)
      {
        k = j;
        if (((SparseArray)localObject1).indexOfKey(i) < 0)
        {
          localObject2[j] = paramArrayOfInputFilter[i];
          k = j + 1;
        }
        i += 1;
        j = k;
      }
      return localObject2;
    }
    int j = paramArrayOfInputFilter.length;
    int i = 0;
    for (;;)
    {
      localObject1 = g;
      if (i >= j) {
        break;
      }
      if (paramArrayOfInputFilter[i] == localObject1) {
        return paramArrayOfInputFilter;
      }
      i += 1;
    }
    Object localObject2 = new InputFilter[paramArrayOfInputFilter.length + 1];
    System.arraycopy(paramArrayOfInputFilter, 0, localObject2, 0, j);
    localObject2[j] = localObject1;
    return localObject2;
  }
  
  public final void b()
  {
    TextView localTextView = a;
    TransformationMethod localTransformationMethod = localTextView.getTransformationMethod();
    Object localObject = localTransformationMethod;
    if (f)
    {
      if ((!(localTransformationMethod instanceof AllCapsTransformationMethod)) && (!(localTransformationMethod instanceof PasswordTransformationMethod))) {
        localObject = new AllCapsTransformationMethod(localTransformationMethod);
      }
    }
    else if ((localTransformationMethod instanceof AllCapsTransformationMethod)) {
      localObject = d;
    }
    localTextView.setTransformationMethod((TransformationMethod)localObject);
  }
  
  public final void b(boolean paramBoolean)
  {
    f = paramBoolean;
    b();
    TextView localTextView = a;
    localTextView.setFilters(a(localTextView.getFilters()));
  }
}
