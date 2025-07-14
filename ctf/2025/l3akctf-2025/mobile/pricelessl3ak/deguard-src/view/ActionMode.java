package view;

import android.view.MenuInflater;
import android.view.View;
import menu.f;

public abstract class ActionMode
{
  public Object mTag;
  public boolean mTitleOptionalHint;
  
  public abstract void finish();
  
  public abstract View getCustomView();
  
  public abstract f getMenu();
  
  public abstract MenuInflater getMenuInflater();
  
  public abstract CharSequence getSubtitle();
  
  public abstract CharSequence getTitle();
  
  public abstract void invalidate();
  
  public abstract boolean isTitleOptional();
  
  public abstract void setCustomView(View paramView);
  
  public abstract void setSubtitle(int paramInt);
  
  public abstract void setSubtitle(CharSequence paramCharSequence);
  
  public abstract void setTitle(int paramInt);
  
  public abstract void setTitle(CharSequence paramCharSequence);
  
  public abstract void setTitleOptionalHint(boolean paramBoolean);
}
