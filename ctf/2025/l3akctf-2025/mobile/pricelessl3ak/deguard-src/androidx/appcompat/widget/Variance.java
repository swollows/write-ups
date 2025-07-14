package androidx.appcompat.widget;

import app.f;

public class Variance
  extends f
{
  public Variance(BubbleTextView paramBubbleTextView)
  {
    super(13, paramBubbleTextView);
  }
  
  public final void clear(int paramInt)
  {
    BubbleTextView.init(moment, paramInt);
  }
  
  public final void evaluate(int paramInt)
  {
    BubbleTextView.setTextColor(moment, paramInt);
  }
}
