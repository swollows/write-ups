package androidx.core.widget;

import android.content.ClipData;
import android.content.ClipData.Item;
import android.content.Context;
import android.text.Editable;
import android.text.Selection;
import android.text.Spanned;
import android.util.Log;
import android.view.View;
import android.widget.TextView;
import app.Item;
import app.i;

public final class b
{
  public static Item a(View paramView, Item paramItem)
  {
    if (Log.isLoggable("ReceiveContent", 3))
    {
      localObject = new StringBuilder("onReceive: ");
      ((StringBuilder)localObject).append(paramItem);
      Log.d("ReceiveContent", ((StringBuilder)localObject).toString());
    }
    if (b.c() == 2) {
      return paramItem;
    }
    paramItem = b;
    Object localObject = paramItem.m();
    int m = paramItem.n();
    paramView = (TextView)paramView;
    Editable localEditable = (Editable)paramView.getText();
    Context localContext = paramView.getContext();
    int i = 0;
    int k;
    for (int j = 0; i < ((ClipData)localObject).getItemCount(); j = k)
    {
      paramView = ((ClipData)localObject).getItemAt(i);
      if ((m & 0x1) != 0)
      {
        paramItem = paramView.coerceToText(localContext);
        paramView = paramItem;
        if ((paramItem instanceof Spanned)) {
          paramView = paramItem.toString();
        }
      }
      else
      {
        paramView = paramView.coerceToStyledText(localContext);
      }
      k = j;
      if (paramView != null) {
        if (j == 0)
        {
          k = Selection.getSelectionStart(localEditable);
          int n = Selection.getSelectionEnd(localEditable);
          j = Math.max(0, Math.min(k, n));
          k = Math.max(0, Math.max(k, n));
          Selection.setSelection(localEditable, k);
          localEditable.replace(j, k, (CharSequence)paramView);
          k = 1;
        }
        else
        {
          localEditable.insert(Selection.getSelectionEnd(localEditable), "\n");
          localEditable.insert(Selection.getSelectionEnd(localEditable), (CharSequence)paramView);
          k = j;
        }
      }
      i += 1;
    }
    return null;
  }
}
