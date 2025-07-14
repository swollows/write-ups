package collections;

import drupal.Context;
import params.Log;

public abstract class List
  extends Context
{
  public static void append(int paramInt1, int paramInt2, int paramInt3, int[] paramArrayOfInt1, int[] paramArrayOfInt2)
  {
    Log.get(paramArrayOfInt1, "<this>");
    Log.get(paramArrayOfInt2, "destination");
    System.arraycopy(paramArrayOfInt1, paramInt2, paramArrayOfInt2, paramInt1, paramInt3 - paramInt2);
  }
  
  public static void append(Object[] paramArrayOfObject1, Object[] paramArrayOfObject2, int paramInt1, int paramInt2, int paramInt3)
  {
    Log.get(paramArrayOfObject1, "<this>");
    Log.get(paramArrayOfObject2, "destination");
    System.arraycopy(paramArrayOfObject1, paramInt2, paramArrayOfObject2, paramInt1, paramInt3 - paramInt2);
  }
}
