package view;

import android.content.Context;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.View;
import menu.MenuWrapper;
import menu.f;

public final class SupportActionModeWrapper
  extends android.view.ActionMode
{
  public final Context mContext;
  public final ActionMode mWrappedObject;
  
  public SupportActionModeWrapper(Context paramContext, ActionMode paramActionMode)
  {
    mContext = paramContext;
    mWrappedObject = paramActionMode;
  }
  
  public final void finish()
  {
    mWrappedObject.finish();
  }
  
  public final View getCustomView()
  {
    return mWrappedObject.getCustomView();
  }
  
  public final Menu getMenu()
  {
    f localF = mWrappedObject.getMenu();
    return new MenuWrapper(mContext, localF);
  }
  
  public final MenuInflater getMenuInflater()
  {
    return mWrappedObject.getMenuInflater();
  }
  
  public final CharSequence getSubtitle()
  {
    return mWrappedObject.getSubtitle();
  }
  
  public final Object getTag()
  {
    return mWrappedObject.mTag;
  }
  
  public final CharSequence getTitle()
  {
    return mWrappedObject.getTitle();
  }
  
  public final boolean getTitleOptionalHint()
  {
    return mWrappedObject.mTitleOptionalHint;
  }
  
  public final void invalidate()
  {
    mWrappedObject.invalidate();
  }
  
  public final boolean isTitleOptional()
  {
    return mWrappedObject.isTitleOptional();
  }
  
  public final void setCustomView(View paramView)
  {
    mWrappedObject.setCustomView(paramView);
  }
  
  public final void setSubtitle(int paramInt)
  {
    mWrappedObject.setSubtitle(paramInt);
  }
  
  public final void setSubtitle(CharSequence paramCharSequence)
  {
    mWrappedObject.setSubtitle(paramCharSequence);
  }
  
  public final void setTag(Object paramObject)
  {
    mWrappedObject.mTag = paramObject;
  }
  
  public final void setTitle(int paramInt)
  {
    mWrappedObject.setTitle(paramInt);
  }
  
  public final void setTitle(CharSequence paramCharSequence)
  {
    mWrappedObject.setTitle(paramCharSequence);
  }
  
  public final void setTitleOptionalHint(boolean paramBoolean)
  {
    mWrappedObject.setTitleOptionalHint(paramBoolean);
  }
}
