package androidx.core.graphics.drawable;

import android.content.res.ColorStateList;
import android.graphics.Bitmap;
import android.graphics.PorterDuff.Mode;
import android.os.Build.VERSION;
import android.os.Parcelable;
import android.util.Log;
import androidx.versionedparcelable.CustomVersionedParcelable;
import app.Preference;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

public class IconCompat
  extends CustomVersionedParcelable
{
  public static final PorterDuff.Mode o = PorterDuff.Mode.SRC_IN;
  public Parcelable buffer = null;
  public int c = 0;
  public int count = -1;
  public byte[] data = null;
  public Object id;
  public ColorStateList index = null;
  public String key = null;
  public String name;
  public int position = 0;
  public PorterDuff.Mode value = o;
  
  public IconCompat() {}
  
  public final String toString()
  {
    if (count == -1) {
      return String.valueOf(id);
    }
    StringBuilder localStringBuilder2 = new StringBuilder("Icon(typ=");
    Object localObject;
    switch (count)
    {
    default: 
      localObject = "UNKNOWN";
      break;
    case 6: 
      localObject = "URI_MASKABLE";
      break;
    case 5: 
      localObject = "BITMAP_MASKABLE";
      break;
    case 4: 
      localObject = "URI";
      break;
    case 3: 
      localObject = "DATA";
      break;
    case 2: 
      localObject = "RESOURCE";
      break;
    case 1: 
      localObject = "BITMAP";
    }
    localStringBuilder2.append((String)localObject);
    switch (count)
    {
    default: 
      break;
    case 4: 
    case 6: 
      localStringBuilder2.append(" uri=");
      localStringBuilder2.append(id);
      break;
    case 3: 
      localStringBuilder2.append(" len=");
      localStringBuilder2.append(position);
      if (c != 0)
      {
        localStringBuilder2.append(" off=");
        localStringBuilder2.append(c);
      }
      break;
    case 2: 
      localStringBuilder2.append(" pkg=");
      localStringBuilder2.append(name);
      localStringBuilder2.append(" id=");
      int i = count;
      if (i == -1)
      {
        i = Build.VERSION.SDK_INT;
        localObject = id;
        if (i >= 28)
        {
          i = Preference.add(localObject);
        }
        else
        {
          i = 0;
          try
          {
            localObject = localObject.getClass().getMethod("getResId", null).invoke(localObject, null);
            localObject = (Integer)localObject;
            int j = ((Integer)localObject).intValue();
            i = j;
          }
          catch (NoSuchMethodException localNoSuchMethodException) {}catch (InvocationTargetException localInvocationTargetException)
          {
            break label389;
          }
          catch (IllegalAccessException localIllegalAccessException)
          {
            break label401;
          }
          Log.e("IconCompat", "Unable to get icon resource", localIllegalAccessException);
          break label423;
          Log.e("IconCompat", "Unable to get icon resource", localIllegalAccessException);
          break label423;
          Log.e("IconCompat", "Unable to get icon resource", localIllegalAccessException);
        }
      }
      else
      {
        if (i != 2) {
          break label448;
        }
        i = position;
      }
      localStringBuilder2.append(String.format("0x%08x", new Object[] { Integer.valueOf(i) }));
      break;
      StringBuilder localStringBuilder1 = new StringBuilder("called getResId() on ");
      localStringBuilder1.append(this);
      throw new IllegalStateException(localStringBuilder1.toString());
    case 1: 
    case 5: 
      label389:
      label401:
      label423:
      label448:
      localStringBuilder2.append(" size=");
      localStringBuilder2.append(((Bitmap)id).getWidth());
      localStringBuilder2.append("x");
      localStringBuilder2.append(((Bitmap)id).getHeight());
    }
    if (index != null)
    {
      localStringBuilder2.append(" tint=");
      localStringBuilder2.append(index);
    }
    if (value != o)
    {
      localStringBuilder2.append(" mode=");
      localStringBuilder2.append(value);
    }
    localStringBuilder2.append(")");
    return localStringBuilder2.toString();
  }
}
