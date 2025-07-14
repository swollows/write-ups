package androidx.fragment.asm;

import android.content.Intent;
import androidx.activity.result.ActivityResult;
import collections.ByteVector;
import collections.EmptyMap;
import java.util.ArrayList;
import java.util.Iterator;
import polynomials.a;
import widgets.Pair;

public final class ClassReader
  extends a
{
  public final Object a(Intent paramIntent, int paramInt)
  {
    Object localObject2;
    switch (d)
    {
    default: 
      return new ActivityResult(paramIntent, paramInt);
    case 1: 
      localObject2 = EmptyMap.c;
      if (paramInt != -1) {
        return localObject2;
      }
      if (paramIntent == null) {
        return localObject2;
      }
      Object localObject1 = paramIntent.getStringArrayExtra("androidx.activity.result.contract.extra.PERMISSIONS");
      Object localObject3 = paramIntent.getIntArrayExtra("androidx.activity.result.contract.extra.PERMISSION_GRANT_RESULTS");
      if (localObject3 != null)
      {
        if (localObject1 == null) {
          return localObject2;
        }
        paramIntent = new ArrayList(localObject3.length);
        int j = localObject3.length;
        int i = 0;
        paramInt = 0;
        while (paramInt < j)
        {
          boolean bool;
          if (localObject3[paramInt] == 0) {
            bool = true;
          } else {
            bool = false;
          }
          paramIntent.add(Boolean.valueOf(bool));
          paramInt += 1;
        }
        localObject2 = new ArrayList();
        j = localObject1.length;
        paramInt = i;
        while (paramInt < j)
        {
          localObject3 = localObject1[paramInt];
          if (localObject3 != null) {
            ((ArrayList)localObject2).add(localObject3);
          }
          paramInt += 1;
        }
        localObject1 = ((ArrayList)localObject2).iterator();
        localObject3 = paramIntent.iterator();
        paramIntent = new ArrayList(Math.min(collections.Object.apply((Iterable)localObject2), collections.Object.apply(paramIntent)));
        while ((((Iterator)localObject1).hasNext()) && (((Iterator)localObject3).hasNext())) {
          paramIntent.add(new Pair(((Iterator)localObject1).next(), ((Iterator)localObject3).next()));
        }
        return ByteVector.read(paramIntent);
      }
      break;
    case 0: 
      return new ActivityResult(paramIntent, paramInt);
    }
    return localObject2;
  }
}
