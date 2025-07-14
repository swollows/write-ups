package common;

import android.content.ClipDescription;
import android.net.Uri;
import android.view.inputmethod.InputContentInfo;

public final class MethodWriter
  implements i
{
  public final InputContentInfo h;
  
  public MethodWriter(Uri paramUri1, ClipDescription paramClipDescription, Uri paramUri2)
  {
    h = new InputContentInfo(paramUri1, paramClipDescription, paramUri2);
  }
  
  public MethodWriter(Object paramObject)
  {
    h = ((InputContentInfo)paramObject);
  }
  
  public final Object b()
  {
    return h;
  }
  
  public final ClipDescription c()
  {
    return h.getDescription();
  }
  
  public final void d()
  {
    h.requestPermission();
  }
  
  public final Uri f()
  {
    return h.getContentUri();
  }
  
  public final Uri visitAnnotation()
  {
    return h.getLinkUri();
  }
}
