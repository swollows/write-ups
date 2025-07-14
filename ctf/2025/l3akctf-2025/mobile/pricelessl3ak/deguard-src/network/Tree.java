package network;

import android.text.InputFilter;
import android.text.Spanned;
import android.view.View;
import android.widget.TextView;
import asm.ClassWriter;

public final class Tree
  implements InputFilter
{
  public Item g;
  public final TextView this$0;
  
  public Tree(TextView paramTextView)
  {
    this$0 = paramTextView;
  }
  
  public final CharSequence filter(CharSequence paramCharSequence, int paramInt1, int paramInt2, Spanned paramSpanned, int paramInt3, int paramInt4)
  {
    TextView localTextView = this$0;
    if (localTextView.isInEditMode()) {
      return paramCharSequence;
    }
    int i = ClassWriter.a().get();
    if (i != 0) {
      if (i != 1)
      {
        if (i != 3) {
          return paramCharSequence;
        }
      }
      else
      {
        if ((paramInt4 == 0) && (paramInt3 == 0) && (paramSpanned.length() == 0) && (paramCharSequence == localTextView.getText())) {
          return paramCharSequence;
        }
        if (paramCharSequence == null) {
          return paramCharSequence;
        }
        if ((paramInt1 != 0) || (paramInt2 != paramCharSequence.length())) {
          paramCharSequence = paramCharSequence.subSequence(paramInt1, paramInt2);
        }
        return ClassWriter.a().get(paramCharSequence, 0, paramCharSequence.length());
      }
    }
    paramSpanned = ClassWriter.a();
    if (g == null) {
      g = new Item(localTextView, this);
    }
    paramSpanned.a(g);
    return paramCharSequence;
  }
}
