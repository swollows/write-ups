package util;

import android.graphics.Insets;
import w.c;

public final class Headers
{
  public static final Headers array = new Headers(0, 0, 0, 0);
  public final int height;
  public final int left;
  public final int right;
  public final int top;
  
  public Headers(int paramInt1, int paramInt2, int paramInt3, int paramInt4)
  {
    left = paramInt1;
    right = paramInt2;
    height = paramInt3;
    top = paramInt4;
  }
  
  public static Headers set(int paramInt1, int paramInt2, int paramInt3, int paramInt4)
  {
    if ((paramInt1 == 0) && (paramInt2 == 0) && (paramInt3 == 0) && (paramInt4 == 0)) {
      return array;
    }
    return new Headers(paramInt1, paramInt2, paramInt3, paramInt4);
  }
  
  public final boolean equals(Object paramObject)
  {
    if (this == paramObject) {
      return true;
    }
    if (paramObject != null)
    {
      if (c.class != paramObject.getClass()) {
        return false;
      }
      paramObject = (Headers)paramObject;
      if (top != top) {
        return false;
      }
      if (left != left) {
        return false;
      }
      if (height != height) {
        return false;
      }
      return right == right;
    }
    return false;
  }
  
  public final Insets get()
  {
    return Wrapper.append(left, right, height, top);
  }
  
  public final int hashCode()
  {
    return ((left * 31 + right) * 31 + height) * 31 + top;
  }
  
  public final String toString()
  {
    StringBuilder localStringBuilder = new StringBuilder("Insets{left=");
    localStringBuilder.append(left);
    localStringBuilder.append(", top=");
    localStringBuilder.append(right);
    localStringBuilder.append(", right=");
    localStringBuilder.append(height);
    localStringBuilder.append(", bottom=");
    localStringBuilder.append(top);
    localStringBuilder.append('}');
    return localStringBuilder.toString();
  }
}
