package app;

import android.view.ContentInfo;
import android.view.View;
import java.util.Objects;

public abstract class Type
{
  public static Item a(View paramView, Item paramItem)
  {
    ContentInfo localContentInfo = b.f();
    Objects.requireNonNull(localContentInfo);
    paramView = paramView.performReceiveContent(localContentInfo);
    if (paramView == null) {
      return null;
    }
    if (paramView == localContentInfo) {
      return paramItem;
    }
    return new Item(new f(paramView));
  }
  
  public static String[] create(View paramView)
  {
    return paramView.getReceiveContentMimeTypes();
  }
}
