package androidx.appcompat.widget;

public final class RtlSpacingHelper
{
  public int mEnd;
  public int mExplicitLeft;
  public int mExplicitRight;
  public boolean mIsRelative;
  public boolean mIsRtl;
  public int mLeft;
  public int mRight;
  public int mStart;
  
  public final void setRelative(int paramInt1, int paramInt2)
  {
    mStart = paramInt1;
    mEnd = paramInt2;
    mIsRelative = true;
    if (mIsRtl)
    {
      if (paramInt2 != Integer.MIN_VALUE) {
        mLeft = paramInt2;
      }
      if (paramInt1 != Integer.MIN_VALUE) {
        mRight = paramInt1;
      }
    }
    else
    {
      if (paramInt1 != Integer.MIN_VALUE) {
        mLeft = paramInt1;
      }
      if (paramInt2 != Integer.MIN_VALUE) {
        mRight = paramInt2;
      }
    }
  }
}
