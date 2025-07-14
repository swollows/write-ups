package ui;

import androidx.fragment.asm.Label;
import astuetz.Menu;
import collections.LinkedList;
import java.util.concurrent.CopyOnWriteArrayList;
import params.Log;

public final class Call
  implements Request
{
  public final Label a;
  
  public Call(i paramI, Label paramLabel)
  {
    Log.get(paramLabel, "onBackPressedCallback");
    b = paramI;
    a = paramLabel;
  }
  
  public final void cancel()
  {
    Object localObject = b;
    LinkedList localLinkedList = a;
    Label localLabel = a;
    localLinkedList.remove(localLabel);
    if (Log.equals(c, localLabel))
    {
      localLabel.getClass();
      c = null;
    }
    a.remove(this);
    localObject = c;
    if (localObject != null) {
      ((Menu)localObject).a();
    }
    c = null;
  }
}
