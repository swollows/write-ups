package androidx.fragment.asm;

import android.util.Log;
import androidx.activity.result.ActivityResult;
import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Map;
import java.util.Set;
import misc.a;

public final class b
  implements a
{
  public final void a(Object paramObject)
  {
    switch (a)
    {
    default: 
      paramObject = (ActivityResult)paramObject;
      paramObject = b;
      localObject = (FragmentManager.LaunchedFragmentInfo)q.pollFirst();
      if (localObject == null)
      {
        paramObject = new StringBuilder("No IntentSenders were started for ");
        paramObject.append(this);
        Log.w("FragmentManager", paramObject.toString());
        return;
      }
      localObject = e;
      a.a();
      paramObject = new StringBuilder("Intent Sender result delivered for unknown Fragment ");
      paramObject.append((String)localObject);
      Log.w("FragmentManager", paramObject.toString());
      return;
    case 1: 
      paramObject = (ActivityResult)paramObject;
      paramObject = b;
      localObject = (FragmentManager.LaunchedFragmentInfo)q.pollFirst();
      if (localObject == null)
      {
        paramObject = new StringBuilder("No Activities were started for result for ");
        paramObject.append(this);
        Log.w("FragmentManager", paramObject.toString());
        return;
      }
      localObject = e;
      a.a();
      paramObject = new StringBuilder("Activity result delivered for unknown Fragment ");
      paramObject.append((String)localObject);
      Log.w("FragmentManager", paramObject.toString());
      return;
    }
    paramObject = (Map)paramObject;
    Object localObject = (String[])paramObject.keySet().toArray(new String[0]);
    paramObject = new ArrayList(paramObject.values());
    localObject = new int[paramObject.size()];
    int i = 0;
    while (i < paramObject.size())
    {
      int j;
      if (((Boolean)paramObject.get(i)).booleanValue()) {
        j = 0;
      } else {
        j = -1;
      }
      localObject[i] = j;
      i += 1;
    }
    paramObject = b;
    localObject = (FragmentManager.LaunchedFragmentInfo)q.pollFirst();
    if (localObject == null)
    {
      paramObject = new StringBuilder("No permissions were requested for ");
      paramObject.append(this);
      Log.w("FragmentManager", paramObject.toString());
      return;
    }
    localObject = e;
    a.a();
    paramObject = new StringBuilder("Permission request result delivered for unknown Fragment ");
    paramObject.append((String)localObject);
    Log.w("FragmentManager", paramObject.toString());
  }
}
