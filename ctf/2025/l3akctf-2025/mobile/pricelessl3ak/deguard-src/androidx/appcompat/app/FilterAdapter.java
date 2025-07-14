package androidx.appcompat.app;

import android.widget.ArrayAdapter;

public final class FilterAdapter
  extends ArrayAdapter
{
  public final long getItemId(int paramInt)
  {
    return paramInt;
  }
  
  public final boolean hasStableIds()
  {
    return true;
  }
}
