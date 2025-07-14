package androidx.core.graphics.drawable;

import android.content.res.ColorStateList;
import android.graphics.PorterDuff.Mode;
import android.os.Parcel;
import android.os.Parcelable;
import bsh.Attribute;
import bsh.ByteVector;
import java.nio.charset.Charset;

public class IconCompatParcelizer
{
  public IconCompatParcelizer() {}
  
  public static IconCompat read(ByteVector paramByteVector)
  {
    IconCompat localIconCompat = new IconCompat();
    int i = count;
    if (paramByteVector.a(1)) {
      i = buffer.readInt();
    }
    count = i;
    Object localObject = data;
    if (paramByteVector.a(2))
    {
      Parcel localParcel = buffer;
      i = localParcel.readInt();
      if (i < 0)
      {
        localObject = null;
      }
      else
      {
        localObject = new byte[i];
        localParcel.readByteArray((byte[])localObject);
      }
    }
    data = ((byte[])localObject);
    buffer = paramByteVector.write(buffer, 3);
    i = position;
    if (paramByteVector.a(4)) {
      i = buffer.readInt();
    }
    position = i;
    i = c;
    if (paramByteVector.a(5)) {
      i = buffer.readInt();
    }
    c = i;
    index = ((ColorStateList)paramByteVector.write(index, 6));
    localObject = key;
    if (paramByteVector.a(7)) {
      localObject = buffer.readString();
    }
    key = ((String)localObject);
    localObject = name;
    if (!paramByteVector.a(8)) {
      paramByteVector = (ByteVector)localObject;
    } else {
      paramByteVector = buffer.readString();
    }
    name = paramByteVector;
    value = PorterDuff.Mode.valueOf(key);
    switch (count)
    {
    default: 
      return localIconCompat;
    case 0: 
      return localIconCompat;
    case 3: 
      id = data;
      return localIconCompat;
    case 2: 
    case 4: 
    case 6: 
      paramByteVector = new String(data, Charset.forName("UTF-16"));
      id = paramByteVector;
      if ((count == 2) && (name == null))
      {
        name = paramByteVector.split(":", -1)[0];
        return localIconCompat;
      }
      break;
    case 1: 
    case 5: 
      paramByteVector = buffer;
      if (paramByteVector != null)
      {
        id = paramByteVector;
        return localIconCompat;
      }
      paramByteVector = data;
      id = paramByteVector;
      count = 3;
      position = 0;
      c = paramByteVector.length;
      return localIconCompat;
    case -1: 
      paramByteVector = buffer;
      if (paramByteVector != null)
      {
        id = paramByteVector;
        return localIconCompat;
      }
      throw new IllegalArgumentException("Invalid icon");
    }
    return localIconCompat;
  }
  
  public static void write(IconCompat paramIconCompat, ByteVector paramByteVector)
  {
    paramByteVector.getClass();
    key = value.name();
    switch (count)
    {
    default: 
      break;
    case 0: 
      break;
    case 4: 
    case 6: 
      data = id.toString().getBytes(Charset.forName("UTF-16"));
      break;
    case 3: 
      data = ((byte[])id);
      break;
    case 2: 
      data = ((String)id).getBytes(Charset.forName("UTF-16"));
      break;
    case 1: 
    case 5: 
      buffer = ((Parcelable)id);
      break;
    }
    buffer = ((Parcelable)id);
    int i = count;
    if (-1 != i)
    {
      paramByteVector.write(1);
      buffer.writeInt(i);
    }
    Object localObject1 = data;
    if (localObject1 != null)
    {
      paramByteVector.write(2);
      Object localObject2 = (Attribute)paramByteVector;
      i = localObject1.length;
      localObject2 = buffer;
      ((Parcel)localObject2).writeInt(i);
      ((Parcel)localObject2).writeByteArray((byte[])localObject1);
    }
    localObject1 = buffer;
    if (localObject1 != null)
    {
      paramByteVector.write(3);
      buffer.writeParcelable((Parcelable)localObject1, 0);
    }
    i = position;
    if (i != 0)
    {
      paramByteVector.write(4);
      buffer.writeInt(i);
    }
    i = c;
    if (i != 0)
    {
      paramByteVector.write(5);
      buffer.writeInt(i);
    }
    localObject1 = index;
    if (localObject1 != null)
    {
      paramByteVector.write(6);
      buffer.writeParcelable((Parcelable)localObject1, 0);
    }
    localObject1 = key;
    if (localObject1 != null)
    {
      paramByteVector.write(7);
      buffer.writeString((String)localObject1);
    }
    paramIconCompat = name;
    if (paramIconCompat != null)
    {
      paramByteVector.write(8);
      buffer.writeString(paramIconCompat);
    }
  }
}
