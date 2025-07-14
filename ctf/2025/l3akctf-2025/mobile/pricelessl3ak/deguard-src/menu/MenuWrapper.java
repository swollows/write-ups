package menu;

import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.view.KeyEvent;
import android.view.Menu;
import android.view.SubMenu;
import androidx.appcompat.app.e;
import http.AbstractMultimap;

public class MenuWrapper
  extends e
  implements Menu
{
  public final f mNativeMenu;
  
  public MenuWrapper(Context paramContext, f paramF)
  {
    super(paramContext);
    if (paramF != null)
    {
      mNativeMenu = paramF;
      return;
    }
    throw new IllegalArgumentException("Wrapped Object can not be null.");
  }
  
  public final android.view.MenuItem add(int paramInt)
  {
    return a(mNativeMenu.add(paramInt));
  }
  
  public final android.view.MenuItem add(int paramInt1, int paramInt2, int paramInt3, int paramInt4)
  {
    return a(mNativeMenu.add(paramInt1, paramInt2, paramInt3, paramInt4));
  }
  
  public final android.view.MenuItem add(int paramInt1, int paramInt2, int paramInt3, CharSequence paramCharSequence)
  {
    return a(mNativeMenu.a(paramInt1, paramInt2, paramInt3, paramCharSequence));
  }
  
  public final android.view.MenuItem add(CharSequence paramCharSequence)
  {
    return a(mNativeMenu.a(0, 0, 0, paramCharSequence));
  }
  
  public final int addIntentOptions(int paramInt1, int paramInt2, int paramInt3, ComponentName paramComponentName, Intent[] paramArrayOfIntent, Intent paramIntent, int paramInt4, android.view.MenuItem[] paramArrayOfMenuItem)
  {
    android.view.MenuItem[] arrayOfMenuItem;
    if (paramArrayOfMenuItem != null) {
      arrayOfMenuItem = new android.view.MenuItem[paramArrayOfMenuItem.length];
    } else {
      arrayOfMenuItem = null;
    }
    paramInt2 = mNativeMenu.addIntentOptions(paramInt1, paramInt2, paramInt3, paramComponentName, paramArrayOfIntent, paramIntent, paramInt4, arrayOfMenuItem);
    if (arrayOfMenuItem != null)
    {
      paramInt3 = arrayOfMenuItem.length;
      paramInt1 = 0;
      while (paramInt1 < paramInt3)
      {
        paramArrayOfMenuItem[paramInt1] = a(arrayOfMenuItem[paramInt1]);
        paramInt1 += 1;
      }
    }
    return paramInt2;
  }
  
  public final SubMenu addSubMenu(int paramInt)
  {
    return mNativeMenu.addSubMenu(paramInt);
  }
  
  public final SubMenu addSubMenu(int paramInt1, int paramInt2, int paramInt3, int paramInt4)
  {
    return mNativeMenu.addSubMenu(paramInt1, paramInt2, paramInt3, paramInt4);
  }
  
  public final SubMenu addSubMenu(int paramInt1, int paramInt2, int paramInt3, CharSequence paramCharSequence)
  {
    return mNativeMenu.addSubMenu(paramInt1, paramInt2, paramInt3, paramCharSequence);
  }
  
  public final SubMenu addSubMenu(CharSequence paramCharSequence)
  {
    return mNativeMenu.addSubMenu(0, 0, 0, paramCharSequence);
  }
  
  public final void clear()
  {
    AbstractMultimap localAbstractMultimap = (AbstractMultimap)a;
    if (localAbstractMultimap != null) {
      localAbstractMultimap.clear();
    }
    mNativeMenu.clear();
  }
  
  public final void close()
  {
    mNativeMenu.close();
  }
  
  public final android.view.MenuItem findItem(int paramInt)
  {
    return a(mNativeMenu.findItem(paramInt));
  }
  
  public final android.view.MenuItem getItem(int paramInt)
  {
    return a(mNativeMenu.getItem(paramInt));
  }
  
  public final boolean hasVisibleItems()
  {
    return mNativeMenu.hasVisibleItems();
  }
  
  public final boolean isShortcutKey(int paramInt, KeyEvent paramKeyEvent)
  {
    return mNativeMenu.isShortcutKey(paramInt, paramKeyEvent);
  }
  
  public final boolean performIdentifierAction(int paramInt1, int paramInt2)
  {
    return mNativeMenu.performIdentifierAction(paramInt1, paramInt2);
  }
  
  public final boolean performShortcut(int paramInt1, KeyEvent paramKeyEvent, int paramInt2)
  {
    return mNativeMenu.performShortcut(paramInt1, paramKeyEvent, paramInt2);
  }
  
  public final void removeGroup(int paramInt)
  {
    if ((AbstractMultimap)a != null)
    {
      int j;
      for (int i = 0;; i = j + 1)
      {
        AbstractMultimap localAbstractMultimap = (AbstractMultimap)a;
        if (i >= size) {
          break;
        }
        j = i;
        if (((preferences.MenuItem)localAbstractMultimap.next(i)).getGroupId() == paramInt)
        {
          ((AbstractMultimap)a).remove(i);
          j = i - 1;
        }
      }
    }
    mNativeMenu.removeGroup(paramInt);
  }
  
  public final void removeItem(int paramInt)
  {
    if ((AbstractMultimap)a != null)
    {
      int i = 0;
      for (;;)
      {
        AbstractMultimap localAbstractMultimap = (AbstractMultimap)a;
        if (i >= size) {
          break;
        }
        if (((preferences.MenuItem)localAbstractMultimap.next(i)).getItemId() == paramInt)
        {
          ((AbstractMultimap)a).remove(i);
          break;
        }
        i += 1;
      }
    }
    mNativeMenu.removeItem(paramInt);
  }
  
  public final void setGroupCheckable(int paramInt, boolean paramBoolean1, boolean paramBoolean2)
  {
    mNativeMenu.setGroupCheckable(paramInt, paramBoolean1, paramBoolean2);
  }
  
  public final void setGroupEnabled(int paramInt, boolean paramBoolean)
  {
    mNativeMenu.setGroupEnabled(paramInt, paramBoolean);
  }
  
  public final void setGroupVisible(int paramInt, boolean paramBoolean)
  {
    mNativeMenu.setGroupVisible(paramInt, paramBoolean);
  }
  
  public final void setQwertyMode(boolean paramBoolean)
  {
    mNativeMenu.setQwertyMode(paramBoolean);
  }
  
  public final int size()
  {
    return mNativeMenu.size();
  }
}
