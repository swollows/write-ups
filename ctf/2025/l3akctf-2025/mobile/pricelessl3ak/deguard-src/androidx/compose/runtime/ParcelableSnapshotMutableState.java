package androidx.compose.runtime;

import activities.Label;
import activities.Pattern;
import activities.RouteInfo;
import android.os.Parcel;
import android.os.Parcelable;
import android.os.Parcelable.Creator;
import internal.Item;
import internal.f;
import params.Log;
import q.e;

public final class ParcelableSnapshotMutableState<T>
  extends e
  implements Parcelable
{
  public static final Parcelable.Creator<ParcelableSnapshotMutableState<Object>> CREATOR;
  public final Pattern b;
  public final RouteInfo d;
  
  static
  {
    throw new Runtime("d2j fail translate: java.lang.RuntimeException: \n\tat com.googlecode.dex2jar.ir.ts.NewTransformer.transform(NewTransformer.java:134)\n\tat com.googlecode.d2j.dex.Dex2jar$2.optimize(Dex2jar.java:148)\n\tat com.googlecode.d2j.dex.Dex2Asm.convertCode(Dex2Asm.java:414)\n\tat com.googlecode.d2j.dex.ExDex2Asm.convertCode(ExDex2Asm.java:42)\n\tat com.googlecode.d2j.dex.Dex2jar$2.convertCode(Dex2jar.java:128)\n\tat com.googlecode.d2j.dex.Dex2Asm.convertMethod(Dex2Asm.java:509)\n\tat com.googlecode.d2j.dex.Dex2Asm.convertClass(Dex2Asm.java:406)\n\tat com.googlecode.d2j.dex.Dex2Asm.convertDex(Dex2Asm.java:422)\n\tat com.googlecode.d2j.dex.Dex2jar.doTranslate(Dex2jar.java:172)\n\tat com.googlecode.d2j.dex.Dex2jar.to(Dex2jar.java:272)\n\tat com.googlecode.dex2jar.tools.Dex2jarCmd.doCommandLine(Dex2jarCmd.java:108)\n\tat com.googlecode.dex2jar.tools.BaseCmd.doMain(BaseCmd.java:288)\n\tat com.googlecode.dex2jar.tools.Dex2jarCmd.main(Dex2jarCmd.java:32)\n");
  }
  
  public ParcelableSnapshotMutableState(Object paramObject, Pattern paramPattern) {}
  
  public final Item b()
  {
    return d;
  }
  
  public int describeContents()
  {
    return 0;
  }
  
  public final String toString()
  {
    RouteInfo localRouteInfo = (RouteInfo)f.a(d);
    StringBuilder localStringBuilder = new StringBuilder("MutableState(value=");
    localStringBuilder.append(d);
    localStringBuilder.append(")@");
    localStringBuilder.append(hashCode());
    return localStringBuilder.toString();
  }
  
  public void writeToParcel(Parcel paramParcel, int paramInt)
  {
    paramParcel.writeValue(ad, this)).d);
    Label localLabel = Label.c;
    Pattern localPattern = b;
    if (Log.equals(localPattern, localLabel))
    {
      paramInt = 0;
    }
    else if (Log.equals(localPattern, Label.b))
    {
      paramInt = 1;
    }
    else
    {
      if (!Log.equals(localPattern, Label.a)) {
        break label77;
      }
      paramInt = 2;
    }
    paramParcel.writeInt(paramInt);
    return;
    label77:
    throw new IllegalStateException("Only known types of MutableState's SnapshotMutationPolicy are supported");
  }
}
