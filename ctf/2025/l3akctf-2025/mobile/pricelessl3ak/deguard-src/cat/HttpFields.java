package cat;

import params.Log;

public abstract class HttpFields
{
  public static final int[] data = new int[0];
  public static final Object[] size = new Object[0];
  
  public static final int add(long[] paramArrayOfLong, int paramInt, long paramLong)
  {
    Log.get(paramArrayOfLong, "array");
    paramInt -= 1;
    int i = 0;
    while (i <= paramInt)
    {
      int j = i + paramInt >>> 1;
      boolean bool = paramArrayOfLong[j] < paramLong;
      if (bool) {
        i = j + 1;
      } else if (bool) {
        paramInt = j - 1;
      } else {
        return j;
      }
    }
    return i;
  }
  
  public static final int get(int paramInt1, int paramInt2, int[] paramArrayOfInt)
  {
    Log.get(paramArrayOfInt, "array");
    paramInt1 -= 1;
    int i = 0;
    while (i <= paramInt1)
    {
      int j = i + paramInt1 >>> 1;
      int k = paramArrayOfInt[j];
      if (k < paramInt2) {
        i = j + 1;
      } else if (k > paramInt2) {
        paramInt1 = j - 1;
      } else {
        return j;
      }
    }
    return i;
  }
}
