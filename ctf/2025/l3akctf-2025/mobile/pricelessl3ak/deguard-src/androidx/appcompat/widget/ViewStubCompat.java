package androidx.appcompat.widget;

import Console.R.styleable;
import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewGroup.LayoutParams;
import java.lang.ref.Reference;
import java.lang.ref.WeakReference;

public final class ViewStubCompat
  extends View
{
  public int mInflatedId;
  public WeakReference mInflatedViewRef;
  public LayoutInflater mInflater;
  public int mLayoutResource = 0;
  
  public ViewStubCompat(Context paramContext, AttributeSet paramAttributeSet)
  {
    super(paramContext, paramAttributeSet, 0);
    paramContext = paramContext.obtainStyledAttributes(paramAttributeSet, R.styleable.Toolbar, 0, 0);
    mInflatedId = paramContext.getResourceId(2, -1);
    mLayoutResource = paramContext.getResourceId(1, 0);
    setId(paramContext.getResourceId(0, -1));
    paramContext.recycle();
    setVisibility(8);
    setWillNotDraw(true);
  }
  
  public final void dispatchDraw(Canvas paramCanvas) {}
  
  public final void draw(Canvas paramCanvas) {}
  
  public int getInflatedId()
  {
    return mInflatedId;
  }
  
  public LayoutInflater getLayoutInflater()
  {
    return mInflater;
  }
  
  public int getLayoutResource()
  {
    return mLayoutResource;
  }
  
  public final View inflate()
  {
    Object localObject = getParent();
    if ((localObject instanceof ViewGroup))
    {
      if (mLayoutResource != 0)
      {
        ViewGroup localViewGroup = (ViewGroup)localObject;
        localObject = mInflater;
        if (localObject == null) {
          localObject = LayoutInflater.from(getContext());
        }
        localObject = ((LayoutInflater)localObject).inflate(mLayoutResource, localViewGroup, false);
        int i = mInflatedId;
        if (i != -1) {
          ((View)localObject).setId(i);
        }
        i = localViewGroup.indexOfChild(this);
        localViewGroup.removeViewInLayout(this);
        ViewGroup.LayoutParams localLayoutParams = getLayoutParams();
        if (localLayoutParams != null) {
          localViewGroup.addView((View)localObject, i, localLayoutParams);
        } else {
          localViewGroup.addView((View)localObject, i);
        }
        mInflatedViewRef = new WeakReference(localObject);
        return localObject;
      }
      throw new IllegalArgumentException("ViewStub must have a valid layoutResource");
    }
    throw new IllegalStateException("ViewStub must have a non-null ViewGroup viewParent");
  }
  
  public final void onMeasure(int paramInt1, int paramInt2)
  {
    setMeasuredDimension(0, 0);
  }
  
  public void setInflatedId(int paramInt)
  {
    mInflatedId = paramInt;
  }
  
  public void setLayoutInflater(LayoutInflater paramLayoutInflater)
  {
    mInflater = paramLayoutInflater;
  }
  
  public void setLayoutResource(int paramInt)
  {
    mLayoutResource = paramInt;
  }
  
  public void setOnInflateListener(ViewStubCompat.OnInflateListener paramOnInflateListener) {}
  
  public void setVisibility(int paramInt)
  {
    Object localObject = mInflatedViewRef;
    if (localObject != null)
    {
      localObject = (View)((Reference)localObject).get();
      if (localObject != null)
      {
        ((View)localObject).setVisibility(paramInt);
        return;
      }
      throw new IllegalStateException("setVisibility called on un-referenced view");
    }
    super.setVisibility(paramInt);
    if ((paramInt == 0) || (paramInt == 4)) {
      inflate();
    }
  }
}
