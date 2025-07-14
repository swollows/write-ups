package network;

import android.text.InputFilter;
import android.text.Selection;
import android.text.Spannable;
import android.view.View;
import android.widget.TextView;
import asm.ClassWriter;
import asm.Handler;
import java.lang.ref.Reference;
import java.lang.ref.WeakReference;

public final class Item
  extends Handler
{
  public final WeakReference a;
  public final WeakReference b;
  
  public Item(TextView paramTextView, Tree paramTree)
  {
    super();
    a = new WeakReference(paramTextView);
    b = new WeakReference(paramTree);
  }
  
  public final void init()
  {
    Object localObject1 = (TextView)a.get();
    Object localObject2 = (InputFilter)b.get();
    if (localObject2 != null)
    {
      if (localObject1 == null) {
        return;
      }
      Object localObject3 = ((TextView)localObject1).getFilters();
      if (localObject3 == null) {
        return;
      }
      int i = 0;
      while (i < localObject3.length)
      {
        if (localObject3[i] == localObject2)
        {
          if (!((View)localObject1).isAttachedToWindow()) {
            break;
          }
          localObject2 = ((TextView)localObject1).getText();
          localObject3 = ClassWriter.a();
          if (localObject2 == null)
          {
            i = 0;
          }
          else
          {
            localObject3.getClass();
            i = ((CharSequence)localObject2).length();
          }
          localObject3 = ((ClassWriter)localObject3).get((CharSequence)localObject2, 0, i);
          if (localObject2 == localObject3) {
            return;
          }
          i = Selection.getSelectionStart((CharSequence)localObject3);
          int j = Selection.getSelectionEnd((CharSequence)localObject3);
          ((TextView)localObject1).setText((CharSequence)localObject3);
          if (!(localObject3 instanceof Spannable)) {
            break;
          }
          localObject1 = (Spannable)localObject3;
          if ((i >= 0) && (j >= 0))
          {
            Selection.setSelection((Spannable)localObject1, i, j);
            return;
          }
          if (i >= 0)
          {
            Selection.setSelection((Spannable)localObject1, i);
            return;
          }
          if (j < 0) {
            break;
          }
          Selection.setSelection((Spannable)localObject1, j);
          return;
        }
        i += 1;
      }
    }
  }
}
