package view;

import android.content.Context;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.View;
import androidx.appcompat.widget.ActionBarContextView;
import androidx.appcompat.widget.b;
import java.lang.ref.Reference;
import java.lang.ref.WeakReference;
import menu.f;
import menu.f.a;
import views.i;

public final class StandaloneActionMode
  extends ActionMode
  implements f.a
{
  public i mCallback;
  public Context mContext;
  public ActionBarContextView mContextView;
  public WeakReference mCustomView;
  public boolean mFinished;
  public f mMenu;
  
  public final void finish()
  {
    if (mFinished) {
      return;
    }
    mFinished = true;
    mCallback.onDestroyActionMode(this);
  }
  
  public final View getCustomView()
  {
    WeakReference localWeakReference = mCustomView;
    if (localWeakReference != null) {
      return (View)localWeakReference.get();
    }
    return null;
  }
  
  public final f getMenu()
  {
    return mMenu;
  }
  
  public final MenuInflater getMenuInflater()
  {
    return new SupportMenuInflater(mContextView.getContext());
  }
  
  public final CharSequence getSubtitle()
  {
    return mContextView.getSubtitle();
  }
  
  public final CharSequence getTitle()
  {
    return mContextView.getTitle();
  }
  
  public final void invalidate()
  {
    f localF = mMenu;
    mCallback.onPrepareActionMode(this, localF);
  }
  
  public final boolean isTitleOptional()
  {
    return mContextView.mTitleOptional;
  }
  
  public final boolean onMenuItemSelected(f paramF, MenuItem paramMenuItem)
  {
    return ((ActionMode.Callback)mCallback.a).onActionItemClicked(this, paramMenuItem);
  }
  
  public final void onMenuModeChange(f paramF)
  {
    invalidate();
    paramF = mContextView.mActionMenuPresenter;
    if (paramF != null) {
      paramF.showOverflowMenu();
    }
  }
  
  public final void setCustomView(View paramView)
  {
    mContextView.setCustomView(paramView);
    if (paramView != null) {
      paramView = new WeakReference(paramView);
    } else {
      paramView = null;
    }
    mCustomView = paramView;
  }
  
  public final void setSubtitle(int paramInt)
  {
    setSubtitle(mContext.getString(paramInt));
  }
  
  public final void setSubtitle(CharSequence paramCharSequence)
  {
    mContextView.setSubtitle(paramCharSequence);
  }
  
  public final void setTitle(int paramInt)
  {
    setTitle(mContext.getString(paramInt));
  }
  
  public final void setTitle(CharSequence paramCharSequence)
  {
    mContextView.setTitle(paramCharSequence);
  }
  
  public final void setTitleOptionalHint(boolean paramBoolean)
  {
    mTitleOptionalHint = paramBoolean;
    mContextView.setTitleOptional(paramBoolean);
  }
}
