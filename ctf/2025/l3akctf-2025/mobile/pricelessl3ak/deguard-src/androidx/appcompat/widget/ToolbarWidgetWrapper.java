package androidx.appcompat.widget;

import Console.R.styleable;
import a.ClassWriter;
import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.drawable.Drawable;
import android.text.TextUtils;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewGroup.LayoutParams;
import android.view.Window.Callback;
import app.ViewCompat;

public final class ToolbarWidgetWrapper
  implements DecorToolbar
{
  public boolean i;
  public b mActionMenuPresenter;
  public final boolean mContext;
  public final View mCustomView;
  public final int mDefaultNavigationContentDescription = 0;
  public final Drawable mDefaultNavigationIcon;
  public int mDisplayOpts;
  public final CharSequence mHomeDescription;
  public Drawable mIcon;
  public Drawable mLogo;
  public final Drawable mNavIcon;
  public final CharSequence mSubtitle;
  public CharSequence mTitle;
  public final Toolbar mToolbar;
  public Window.Callback mWindowCallback;
  
  public ToolbarWidgetWrapper(Toolbar paramToolbar, boolean paramBoolean)
  {
    mToolbar = paramToolbar;
    mTitle = paramToolbar.getTitle();
    mSubtitle = paramToolbar.getSubtitle();
    boolean bool;
    if (mTitle != null) {
      bool = true;
    } else {
      bool = false;
    }
    mContext = bool;
    mNavIcon = paramToolbar.getNavigationIcon();
    Object localObject1 = paramToolbar.getContext();
    Object localObject2 = R.styleable.ActionBar;
    String str = null;
    localObject1 = ClassWriter.obtainStyledAttributes((Context)localObject1, null, (int[])localObject2, 2130903045);
    int j = 15;
    mDefaultNavigationIcon = ((ClassWriter)localObject1).getDrawable(15);
    if (paramBoolean)
    {
      localObject2 = (TypedArray)b;
      Object localObject3 = ((TypedArray)localObject2).getText(27);
      Object localObject4;
      if (!TextUtils.isEmpty((CharSequence)localObject3))
      {
        mContext = true;
        mTitle = ((CharSequence)localObject3);
        if ((mDisplayOpts & 0x8) != 0)
        {
          localObject4 = mToolbar;
          ((Toolbar)localObject4).setTitle((CharSequence)localObject3);
          if (mContext) {
            ViewCompat.a(((View)localObject4).getRootView(), (CharSequence)localObject3);
          }
        }
      }
      localObject3 = ((TypedArray)localObject2).getText(25);
      if (!TextUtils.isEmpty((CharSequence)localObject3))
      {
        mSubtitle = ((CharSequence)localObject3);
        if ((mDisplayOpts & 0x8) != 0) {
          paramToolbar.setSubtitle((CharSequence)localObject3);
        }
      }
      localObject3 = ((ClassWriter)localObject1).getDrawable(20);
      if (localObject3 != null)
      {
        mLogo = ((Drawable)localObject3);
        updateToolbarLogo();
      }
      localObject3 = ((ClassWriter)localObject1).getDrawable(17);
      if (localObject3 != null)
      {
        mIcon = ((Drawable)localObject3);
        updateToolbarLogo();
      }
      if (mNavIcon == null)
      {
        localObject3 = mDefaultNavigationIcon;
        if (localObject3 != null)
        {
          mNavIcon = ((Drawable)localObject3);
          j = mDisplayOpts;
          localObject4 = mToolbar;
          if ((j & 0x4) != 0) {
            ((Toolbar)localObject4).setNavigationIcon((Drawable)localObject3);
          } else {
            ((Toolbar)localObject4).setNavigationIcon(null);
          }
        }
      }
      setDisplayOptions(((TypedArray)localObject2).getInt(10, 0));
      j = ((TypedArray)localObject2).getResourceId(9, 0);
      if (j != 0)
      {
        localObject3 = LayoutInflater.from(paramToolbar.getContext()).inflate(j, paramToolbar, false);
        localObject4 = mCustomView;
        if ((localObject4 != null) && ((mDisplayOpts & 0x10) != 0)) {
          paramToolbar.removeView((View)localObject4);
        }
        mCustomView = ((View)localObject3);
        if ((localObject3 != null) && ((mDisplayOpts & 0x10) != 0)) {
          paramToolbar.addView((View)localObject3);
        }
        setDisplayOptions(mDisplayOpts | 0x10);
      }
      j = ((TypedArray)localObject2).getLayoutDimension(13, 0);
      if (j > 0)
      {
        localObject3 = paramToolbar.getLayoutParams();
        height = j;
        paramToolbar.setLayoutParams((ViewGroup.LayoutParams)localObject3);
      }
      int k = ((TypedArray)localObject2).getDimensionPixelOffset(7, -1);
      j = ((TypedArray)localObject2).getDimensionPixelOffset(3, -1);
      if ((k >= 0) || (j >= 0))
      {
        k = Math.max(k, 0);
        j = Math.max(j, 0);
        paramToolbar.setDirection();
        mContentInsets.setRelative(k, j);
      }
      j = ((TypedArray)localObject2).getResourceId(28, 0);
      if (j != 0)
      {
        localObject3 = paramToolbar.getContext();
        mTitleTextAppearance = j;
        localObject4 = mTitleTextView;
        if (localObject4 != null) {
          ((BubbleTextView)localObject4).setTextAppearance((Context)localObject3, j);
        }
      }
      j = ((TypedArray)localObject2).getResourceId(26, 0);
      if (j != 0)
      {
        localObject3 = paramToolbar.getContext();
        mSubtitleTextAppearance = j;
        localObject4 = mSubtitleTextView;
        if (localObject4 != null) {
          ((BubbleTextView)localObject4).setTextAppearance((Context)localObject3, j);
        }
      }
      j = ((TypedArray)localObject2).getResourceId(22, 0);
      if (j != 0) {
        paramToolbar.setPopupTheme(j);
      }
    }
    else
    {
      if (paramToolbar.getNavigationIcon() != null) {
        mDefaultNavigationIcon = paramToolbar.getNavigationIcon();
      } else {
        j = 11;
      }
      mDisplayOpts = j;
    }
    ((ClassWriter)localObject1).recycle();
    if (2131558401 != mDefaultNavigationContentDescription)
    {
      mDefaultNavigationContentDescription = 2131558401;
      if (TextUtils.isEmpty(paramToolbar.getNavigationContentDescription()))
      {
        j = mDefaultNavigationContentDescription;
        if (j != 0) {
          str = paramToolbar.getContext().getString(j);
        }
        mHomeDescription = str;
        updateHomeAccessibility();
      }
    }
    mHomeDescription = paramToolbar.getNavigationContentDescription();
    paramToolbar.setNavigationOnClickListener(new ToolbarWidgetWrapper.1(this));
  }
  
  public final void setDisplayOptions(int paramInt)
  {
    int j = mDisplayOpts ^ paramInt;
    mDisplayOpts = paramInt;
    if (j != 0)
    {
      Object localObject2;
      if ((j & 0x4) != 0)
      {
        if ((paramInt & 0x4) != 0) {
          updateHomeAccessibility();
        }
        int k = mDisplayOpts;
        localObject2 = mToolbar;
        if ((k & 0x4) != 0)
        {
          localObject1 = mNavIcon;
          if (localObject1 == null) {
            localObject1 = mDefaultNavigationIcon;
          }
          ((Toolbar)localObject2).setNavigationIcon((Drawable)localObject1);
        }
        else
        {
          ((Toolbar)localObject2).setNavigationIcon(null);
        }
      }
      if ((j & 0x3) != 0) {
        updateToolbarLogo();
      }
      Object localObject1 = mToolbar;
      if ((j & 0x8) != 0) {
        if ((paramInt & 0x8) != 0)
        {
          ((Toolbar)localObject1).setTitle(mTitle);
          ((Toolbar)localObject1).setSubtitle(mSubtitle);
        }
        else
        {
          ((Toolbar)localObject1).setTitle(null);
          ((Toolbar)localObject1).setSubtitle(null);
        }
      }
      if ((j & 0x10) != 0)
      {
        localObject2 = mCustomView;
        if (localObject2 != null)
        {
          if ((paramInt & 0x10) != 0)
          {
            ((ViewGroup)localObject1).addView((View)localObject2);
            return;
          }
          ((ViewGroup)localObject1).removeView((View)localObject2);
        }
      }
    }
  }
  
  public final void updateHomeAccessibility()
  {
    if ((mDisplayOpts & 0x4) != 0)
    {
      boolean bool = TextUtils.isEmpty(mHomeDescription);
      Toolbar localToolbar = mToolbar;
      if (bool)
      {
        localToolbar.setNavigationContentDescription(mDefaultNavigationContentDescription);
        return;
      }
      localToolbar.setNavigationContentDescription(mHomeDescription);
    }
  }
  
  public final void updateToolbarLogo()
  {
    int j = mDisplayOpts;
    Drawable localDrawable;
    if ((j & 0x2) != 0)
    {
      if ((j & 0x1) != 0)
      {
        localDrawable = mLogo;
        if (localDrawable == null) {
          localDrawable = mIcon;
        }
      }
      else
      {
        localDrawable = mIcon;
      }
    }
    else {
      localDrawable = null;
    }
    mToolbar.setLogo(localDrawable);
  }
}
