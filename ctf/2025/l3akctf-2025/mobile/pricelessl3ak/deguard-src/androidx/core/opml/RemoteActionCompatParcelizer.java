package androidx.core.opml;

import android.app.PendingIntent;
import android.os.Parcel;
import android.os.Parcelable.Creator;
import android.text.TextUtils;
import androidx.core.graphics.drawable.IconCompat;
import bsh.Attribute;
import bsh.ByteVector;

public class RemoteActionCompatParcelizer
{
  public RemoteActionCompatParcelizer() {}
  
  public static RemoteActionCompat read(ByteVector paramByteVector)
  {
    RemoteActionCompat localRemoteActionCompat = new RemoteActionCompat();
    Object localObject = b;
    boolean bool2 = true;
    if (paramByteVector.a(1)) {
      localObject = paramByteVector.get();
    }
    b = ((IconCompat)localObject);
    localObject = c;
    if (paramByteVector.a(2))
    {
      localObject = (Attribute)paramByteVector;
      localObject = (CharSequence)TextUtils.CHAR_SEQUENCE_CREATOR.createFromParcel(buffer);
    }
    c = ((CharSequence)localObject);
    localObject = type;
    if (paramByteVector.a(3))
    {
      localObject = (Attribute)paramByteVector;
      localObject = (CharSequence)TextUtils.CHAR_SEQUENCE_CREATOR.createFromParcel(buffer);
    }
    type = ((CharSequence)localObject);
    a = ((PendingIntent)paramByteVector.write(a, 4));
    boolean bool1 = index;
    if (paramByteVector.a(5)) {
      if (buffer.readInt() != 0) {
        bool1 = true;
      } else {
        bool1 = false;
      }
    }
    index = bool1;
    bool1 = s;
    if (paramByteVector.a(6)) {
      if (buffer.readInt() != 0) {
        bool1 = bool2;
      } else {
        bool1 = false;
      }
    }
    s = bool1;
    return localRemoteActionCompat;
  }
  
  public static void write(RemoteActionCompat paramRemoteActionCompat, ByteVector paramByteVector)
  {
    throw new Runtime("d2j fail translate: java.lang.RuntimeException: can not merge I and Z\n\tat com.googlecode.dex2jar.ir.TypeClass.merge(TypeClass.java:100)\n\tat com.googlecode.dex2jar.ir.ts.TypeTransformer$TypeRef.updateTypeClass(TypeTransformer.java:174)\n\tat com.googlecode.dex2jar.ir.ts.TypeTransformer$TypeAnalyze.copyTypes(TypeTransformer.java:311)\n\tat com.googlecode.dex2jar.ir.ts.TypeTransformer$TypeAnalyze.fixTypes(TypeTransformer.java:226)\n\tat com.googlecode.dex2jar.ir.ts.TypeTransformer$TypeAnalyze.analyze(TypeTransformer.java:207)\n\tat com.googlecode.dex2jar.ir.ts.TypeTransformer.transform(TypeTransformer.java:44)\n\tat com.googlecode.d2j.dex.Dex2jar$2.optimize(Dex2jar.java:162)\n\tat com.googlecode.d2j.dex.Dex2Asm.convertCode(Dex2Asm.java:414)\n\tat com.googlecode.d2j.dex.ExDex2Asm.convertCode(ExDex2Asm.java:42)\n\tat com.googlecode.d2j.dex.Dex2jar$2.convertCode(Dex2jar.java:128)\n\tat com.googlecode.d2j.dex.Dex2Asm.convertMethod(Dex2Asm.java:509)\n\tat com.googlecode.d2j.dex.Dex2Asm.convertClass(Dex2Asm.java:406)\n\tat com.googlecode.d2j.dex.Dex2Asm.convertDex(Dex2Asm.java:422)\n\tat com.googlecode.d2j.dex.Dex2jar.doTranslate(Dex2jar.java:172)\n\tat com.googlecode.d2j.dex.Dex2jar.to(Dex2jar.java:272)\n\tat com.googlecode.dex2jar.tools.Dex2jarCmd.doCommandLine(Dex2jarCmd.java:108)\n\tat com.googlecode.dex2jar.tools.BaseCmd.doMain(BaseCmd.java:288)\n\tat com.googlecode.dex2jar.tools.Dex2jarCmd.main(Dex2jarCmd.java:32)\n");
  }
}
