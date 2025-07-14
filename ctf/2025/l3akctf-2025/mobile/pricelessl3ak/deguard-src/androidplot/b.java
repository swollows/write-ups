package androidplot;

import android.os.Binder;
import android.os.Bundle;
import android.os.IBinder;
import android.os.Parcel;
import android.os.Parcelable.Creator;
import android.support.v4.os.ResultReceiver;

public final class b
  extends Binder
  implements l
{
  public b(ResultReceiver paramResultReceiver)
  {
    attachInterface(this, l.d);
  }
  
  public final IBinder asBinder()
  {
    return this;
  }
  
  public final boolean onTransact(int paramInt1, Parcel paramParcel1, Parcel paramParcel2, int paramInt2)
  {
    String str = l.d;
    if ((paramInt1 >= 1) && (paramInt1 <= 16777215)) {
      paramParcel1.enforceInterface(str);
    }
    if (paramInt1 == 1598968902)
    {
      paramParcel2.writeString(str);
      return true;
    }
    if (paramInt1 != 1) {
      return super.onTransact(paramInt1, paramParcel1, paramParcel2, paramInt2);
    }
    paramParcel1.readInt();
    paramParcel2 = Bundle.CREATOR;
    if (paramParcel1.readInt() != 0) {
      paramParcel1 = paramParcel2.createFromParcel(paramParcel1);
    } else {
      paramParcel1 = null;
    }
    paramParcel1 = (Bundle)paramParcel1;
    this$0.getClass();
    return true;
  }
}
