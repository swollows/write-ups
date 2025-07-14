package app;

import android.content.ClipData;
import android.net.Uri;
import android.os.Bundle;
import android.view.ContentInfo;
import collections.List;
import java.util.Locale;

public final class h
  implements g, i
{
  public Object a;
  public int b;
  public Cloneable h;
  public int i;
  public Object k;
  
  public h(h paramH)
  {
    ClipData localClipData = (ClipData)a;
    localClipData.getClass();
    a = localClipData;
    int j = i;
    if (j >= 0)
    {
      if (j <= 5)
      {
        i = j;
        j = b;
        if ((j & 0x1) == j)
        {
          b = j;
          k = ((Uri)k);
          h = ((Bundle)h);
          return;
        }
        paramH = new StringBuilder("Requested flags 0x");
        paramH.append(Integer.toHexString(j));
        paramH.append(", but only 0x");
        paramH.append(Integer.toHexString(1));
        paramH.append(" are allowed");
        throw new IllegalArgumentException(paramH.toString());
      }
      paramH = Locale.US;
      throw new IllegalArgumentException("source is out of range of [0, 5] (too high)");
    }
    paramH = Locale.US;
    throw new IllegalArgumentException("source is out of range of [0, 5] (too low)");
  }
  
  public int a(int paramInt)
  {
    int j = i;
    int[] arrayOfInt1 = (int[])a;
    int m = arrayOfInt1.length;
    int[] arrayOfInt3;
    if (j + 1 > m)
    {
      j = m * 2;
      arrayOfInt2 = new int[j];
      arrayOfInt3 = new int[j];
      List.put(0, 14, arrayOfInt1, arrayOfInt2);
      List.put(0, 14, (int[])k, arrayOfInt3);
      a = arrayOfInt2;
      k = arrayOfInt3;
    }
    m = i;
    i = (m + 1);
    j = ((int[])h).length;
    if (b >= j)
    {
      i1 = j * 2;
      arrayOfInt1 = new int[i1];
      for (j = 0; j < i1; j = n)
      {
        n = j + 1;
        arrayOfInt1[j] = n;
      }
      List.put(0, 14, (int[])h, arrayOfInt1);
      h = arrayOfInt1;
    }
    int n = b;
    int[] arrayOfInt2 = (int[])h;
    b = arrayOfInt2[n];
    arrayOfInt1 = (int[])a;
    arrayOfInt1[m] = paramInt;
    ((int[])k)[m] = n;
    arrayOfInt2[n] = m;
    int i1 = arrayOfInt1[m];
    for (paramInt = m; paramInt > 0; paramInt = j)
    {
      j = (paramInt + 1 >> 1) - 1;
      if (arrayOfInt1[j] <= i1) {
        break;
      }
      arrayOfInt2 = (int[])a;
      arrayOfInt3 = (int[])k;
      int[] arrayOfInt4 = (int[])h;
      m = arrayOfInt2[j];
      arrayOfInt2[j] = arrayOfInt2[paramInt];
      arrayOfInt2[paramInt] = m;
      m = arrayOfInt3[j];
      arrayOfInt3[j] = arrayOfInt3[paramInt];
      arrayOfInt3[paramInt] = m;
      arrayOfInt4[arrayOfInt3[j]] = j;
      arrayOfInt4[arrayOfInt3[paramInt]] = paramInt;
    }
    return n;
  }
  
  public void a(Uri paramUri)
  {
    k = paramUri;
  }
  
  public Item b()
  {
    return new Item(new h(this));
  }
  
  public int c()
  {
    return i;
  }
  
  public void d(int paramInt)
  {
    b = paramInt;
  }
  
  public void d(Bundle paramBundle)
  {
    h = paramBundle;
  }
  
  public ContentInfo f()
  {
    return null;
  }
  
  public ClipData m()
  {
    return (ClipData)a;
  }
  
  public int n()
  {
    return b;
  }
  
  public String toString()
  {
    switch (c)
    {
    default: 
      return super.toString();
    }
    StringBuilder localStringBuilder1 = new StringBuilder("ContentInfoCompat{clip=");
    localStringBuilder1.append(((ClipData)a).getDescription());
    localStringBuilder1.append(", source=");
    int j = i;
    if (j != 0)
    {
      if (j != 1)
      {
        if (j != 2)
        {
          if (j != 3)
          {
            if (j != 4)
            {
              if (j != 5) {
                localObject = String.valueOf(j);
              } else {
                localObject = "SOURCE_PROCESS_TEXT";
              }
            }
            else {
              localObject = "SOURCE_AUTOFILL";
            }
          }
          else {
            localObject = "SOURCE_DRAG_AND_DROP";
          }
        }
        else {
          localObject = "SOURCE_INPUT_METHOD";
        }
      }
      else {
        localObject = "SOURCE_CLIPBOARD";
      }
    }
    else {
      localObject = "SOURCE_APP";
    }
    localStringBuilder1.append((String)localObject);
    localStringBuilder1.append(", flags=");
    j = b;
    if ((j & 0x1) != 0) {
      localObject = "FLAG_CONVERT_TO_PLAIN_TEXT";
    } else {
      localObject = String.valueOf(j);
    }
    localStringBuilder1.append((String)localObject);
    String str = "";
    Object localObject = (Uri)k;
    if (localObject == null)
    {
      localObject = "";
    }
    else
    {
      StringBuilder localStringBuilder2 = new StringBuilder(", hasLinkUri(");
      localStringBuilder2.append(((Uri)localObject).toString().length());
      localStringBuilder2.append(")");
      localObject = localStringBuilder2.toString();
    }
    localStringBuilder1.append((String)localObject);
    if ((Bundle)h == null) {
      localObject = str;
    } else {
      localObject = ", hasExtras";
    }
    localStringBuilder1.append((String)localObject);
    localStringBuilder1.append("}");
    return localStringBuilder1.toString();
  }
}
