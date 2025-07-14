package menu;

import androidx.appcompat.widget.ListViewCompat;

public abstract interface v
{
  public abstract void dismiss();
  
  public abstract boolean isShowing();
  
  public abstract ListViewCompat onItemClick();
  
  public abstract void show();
}
