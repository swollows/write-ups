package network;

import a.ClassWriter;
import android.text.Editable;
import android.text.method.KeyListener;
import android.text.method.MetaKeyKeyListener;
import android.view.KeyEvent;
import android.view.View;
import app.Element;

public final class e
  implements KeyListener
{
  public final Element e;
  public final KeyListener this$0;
  
  public e(KeyListener paramKeyListener)
  {
    this$0 = paramKeyListener;
    e = localElement;
  }
  
  public final void clearMetaKeyState(View paramView, Editable paramEditable, int paramInt)
  {
    this$0.clearMetaKeyState(paramView, paramEditable, paramInt);
  }
  
  public final int getInputType()
  {
    return this$0.getInputType();
  }
  
  public final boolean onKeyDown(View paramView, Editable paramEditable, int paramInt, KeyEvent paramKeyEvent)
  {
    e.getClass();
    boolean bool;
    if (paramInt != 67)
    {
      if (paramInt != 112) {
        bool = false;
      } else {
        bool = ClassWriter.action(paramEditable, paramKeyEvent, true);
      }
    }
    else {
      bool = ClassWriter.action(paramEditable, paramKeyEvent, false);
    }
    int i;
    if (bool)
    {
      MetaKeyKeyListener.adjustMetaAfterKeypress(paramEditable);
      i = 1;
    }
    else
    {
      i = 0;
    }
    return (i != 0) || (this$0.onKeyDown(paramView, paramEditable, paramInt, paramKeyEvent));
  }
  
  public final boolean onKeyOther(View paramView, Editable paramEditable, KeyEvent paramKeyEvent)
  {
    return this$0.onKeyOther(paramView, paramEditable, paramKeyEvent);
  }
  
  public final boolean onKeyUp(View paramView, Editable paramEditable, int paramInt, KeyEvent paramKeyEvent)
  {
    return this$0.onKeyUp(paramView, paramEditable, paramInt, paramKeyEvent);
  }
}
