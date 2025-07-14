package signature;

import androidx.appcompat.app.AppCompatActivity;
import java.util.ArrayList;
import java.util.Iterator;

public final class TaskStackBuilder
  implements Iterable
{
  public final ArrayList mIntents = new ArrayList();
  public final AppCompatActivity mSourceContext;
  
  public TaskStackBuilder(AppCompatActivity paramAppCompatActivity)
  {
    mSourceContext = paramAppCompatActivity;
  }
  
  public final Iterator iterator()
  {
    return mIntents.iterator();
  }
}
