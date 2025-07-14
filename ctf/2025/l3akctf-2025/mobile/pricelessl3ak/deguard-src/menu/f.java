package menu;

import android.content.ActivityNotFoundException;
import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.content.pm.ComponentInfo;
import android.content.pm.PackageItemInfo;
import android.content.pm.PackageManager;
import android.content.pm.ResolveInfo;
import android.content.res.Configuration;
import android.content.res.Resources;
import android.graphics.drawable.Drawable;
import android.os.BaseBundle;
import android.os.Build.VERSION;
import android.os.Bundle;
import android.util.Log;
import android.util.SparseArray;
import android.view.ActionProvider;
import android.view.KeyCharacterMap.KeyData;
import android.view.KeyEvent;
import android.view.Menu;
import android.view.MenuItem;
import android.view.MenuItem.OnMenuItemClickListener;
import android.view.SubMenu;
import android.view.View;
import android.view.ViewConfiguration;
import app.Common;
import app.Preference;
import java.lang.ref.Reference;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.CopyOnWriteArrayList;

public class f
  implements Menu
{
  public static final int[] sCategoryToOrder = { 1, 4, 5, 3, 2, 0 };
  public h C;
  public boolean D;
  public final Context a;
  public Drawable b;
  public View c;
  public CharSequence d;
  public boolean e;
  public final Resources f;
  public final boolean h;
  public f.a i;
  public final ArrayList j;
  public boolean k;
  public final ArrayList l;
  public int mDefaultShowAsAction;
  public boolean mIsVisibleItemsStale;
  public final ArrayList mVisibleItems;
  public final ArrayList n;
  public boolean o;
  public boolean p;
  public boolean r;
  public boolean s;
  public boolean t;
  public final ArrayList v;
  public final CopyOnWriteArrayList w;
  
  public f(Context paramContext)
  {
    boolean bool3 = false;
    mDefaultShowAsAction = 0;
    r = false;
    s = false;
    p = false;
    t = false;
    v = new ArrayList();
    w = new CopyOnWriteArrayList();
    e = false;
    a = paramContext;
    Object localObject = paramContext.getResources();
    f = ((Resources)localObject);
    j = new ArrayList();
    mVisibleItems = new ArrayList();
    mIsVisibleItemsStale = true;
    l = new ArrayList();
    n = new ArrayList();
    o = true;
    boolean bool2 = bool3;
    if (getConfigurationkeyboard != 1)
    {
      localObject = ViewConfiguration.get(paramContext);
      int m = Common.prefs;
      boolean bool1;
      if (Build.VERSION.SDK_INT >= 28)
      {
        bool1 = Preference.setKey((ViewConfiguration)localObject);
      }
      else
      {
        paramContext = paramContext.getResources();
        m = paramContext.getIdentifier("config_showMenuShortcutsWhenKeyboardPresent", "bool", "android");
        if ((m != 0) && (paramContext.getBoolean(m))) {
          bool1 = true;
        } else {
          bool1 = false;
        }
      }
      bool2 = bool3;
      if (bool1) {
        bool2 = true;
      }
    }
    h = bool2;
  }
  
  public final h a(int paramInt1, int paramInt2, int paramInt3, CharSequence paramCharSequence)
  {
    int m = (0xFFFF0000 & paramInt3) >> 16;
    if ((m >= 0) && (m < 6))
    {
      m = sCategoryToOrder[m] << 16 | 0xFFFF & paramInt3;
      paramCharSequence = new h(this, paramInt1, paramInt2, paramInt3, m, paramCharSequence, mDefaultShowAsAction);
      ArrayList localArrayList = j;
      paramInt1 = localArrayList.size() - 1;
      while (paramInt1 >= 0)
      {
        if (getd <= m)
        {
          paramInt1 += 1;
          break label109;
        }
        paramInt1 -= 1;
      }
      paramInt1 = 0;
      label109:
      localArrayList.add(paramInt1, paramCharSequence);
      b(true);
      return paramCharSequence;
    }
    throw new IllegalArgumentException("order does not contain a valid category.");
  }
  
  public final h a(int paramInt, KeyEvent paramKeyEvent)
  {
    ArrayList localArrayList = v;
    localArrayList.clear();
    a(localArrayList, paramInt, paramKeyEvent);
    if (localArrayList.isEmpty()) {
      return null;
    }
    int i2 = paramKeyEvent.getMetaState();
    KeyCharacterMap.KeyData localKeyData = new KeyCharacterMap.KeyData();
    paramKeyEvent.getKeyData(localKeyData);
    int i3 = localArrayList.size();
    if (i3 == 1) {
      return (h)localArrayList.get(0);
    }
    boolean bool = d();
    int m = 0;
    while (m < i3)
    {
      paramKeyEvent = (h)localArrayList.get(m);
      int i1;
      if (bool) {
        i1 = i;
      } else {
        i1 = h;
      }
      char[] arrayOfChar = meta;
      if (((i1 == arrayOfChar[0]) && ((i2 & 0x2) == 0)) || ((i1 == arrayOfChar[2]) && ((i2 & 0x2) != 0))) {
        return paramKeyEvent;
      }
      if ((bool) && (i1 == 8) && (paramInt == 67)) {
        return paramKeyEvent;
      }
      m += 1;
    }
    return null;
    return paramKeyEvent;
  }
  
  public final void a()
  {
    ArrayList localArrayList = getVisibleItems();
    if (!o) {
      return;
    }
    Object localObject1 = w;
    Object localObject2 = ((CopyOnWriteArrayList)localObject1).iterator();
    int m = 0;
    Object localObject3;
    while (((Iterator)localObject2).hasNext())
    {
      localObject3 = (WeakReference)((Iterator)localObject2).next();
      l localL = (l)((Reference)localObject3).get();
      if (localL == null) {
        ((CopyOnWriteArrayList)localObject1).remove(localObject3);
      } else {
        m |= localL.a();
      }
    }
    localObject1 = l;
    localObject2 = n;
    if (m != 0)
    {
      ((ArrayList)localObject1).clear();
      ((ArrayList)localObject2).clear();
      int i2 = localArrayList.size();
      m = 0;
      while (m < i2)
      {
        localObject3 = (h)localArrayList.get(m);
        if (((h)localObject3).a()) {
          ((ArrayList)localObject1).add(localObject3);
        } else {
          ((ArrayList)localObject2).add(localObject3);
        }
        int i1;
        m += 1;
      }
    }
    ((ArrayList)localObject1).clear();
    ((ArrayList)localObject2).clear();
    ((ArrayList)localObject2).addAll(getVisibleItems());
    o = false;
  }
  
  public final void a(int paramInt1, CharSequence paramCharSequence, int paramInt2, Drawable paramDrawable, View paramView)
  {
    if (paramView != null)
    {
      c = paramView;
      d = null;
      b = null;
    }
    else
    {
      if (paramInt1 > 0) {
        d = f.getText(paramInt1);
      } else if (paramCharSequence != null) {
        d = paramCharSequence;
      }
      if (paramInt2 > 0) {
        b = a.getDrawable(paramInt2);
      } else if (paramDrawable != null) {
        b = paramDrawable;
      }
      c = null;
    }
    b(false);
  }
  
  public final void a(ArrayList paramArrayList, int paramInt, KeyEvent paramKeyEvent)
  {
    boolean bool = d();
    int i3 = paramKeyEvent.getModifiers();
    KeyCharacterMap.KeyData localKeyData = new KeyCharacterMap.KeyData();
    if ((!paramKeyEvent.getKeyData(localKeyData)) && (paramInt != 67)) {
      return;
    }
    ArrayList localArrayList = j;
    int i4 = localArrayList.size();
    int m = 0;
    while (m < i4)
    {
      h localH = (h)localArrayList.get(m);
      if (localH.hasSubMenu()) {
        p.a(paramArrayList, paramInt, paramKeyEvent);
      }
      int i1;
      if (bool) {
        i1 = i;
      } else {
        i1 = h;
      }
      int i2;
      if (bool) {
        i2 = l;
      } else {
        i2 = k;
      }
      if (((i3 & 0x1100F) == (i2 & 0x1100F)) && (i1 != 0))
      {
        char[] arrayOfChar = meta;
        if ((i1 == arrayOfChar[0]) || (i1 == arrayOfChar[2])) {
          break label204;
        }
        if ((bool) && (i1 == 8))
        {
          if (paramInt != 67) {
            break label219;
          }
          break label204;
        }
      }
      break label219;
      label204:
      if (localH.isEnabled()) {
        paramArrayList.add(localH);
      }
      label219:
      m += 1;
    }
  }
  
  public final void a(l paramL, Context paramContext)
  {
    w.add(new WeakReference(paramL));
    paramL.initForMenu(paramContext, this);
    o = true;
  }
  
  public final void a(boolean paramBoolean)
  {
    if (t) {
      return;
    }
    t = true;
    CopyOnWriteArrayList localCopyOnWriteArrayList = w;
    Iterator localIterator = localCopyOnWriteArrayList.iterator();
    while (localIterator.hasNext())
    {
      WeakReference localWeakReference = (WeakReference)localIterator.next();
      l localL = (l)localWeakReference.get();
      if (localL == null) {
        localCopyOnWriteArrayList.remove(localWeakReference);
      } else {
        localL.a(this, paramBoolean);
      }
    }
    t = false;
  }
  
  public final boolean a(MenuItem paramMenuItem, l paramL, int paramInt)
  {
    paramMenuItem = (h)paramMenuItem;
    boolean bool3 = false;
    boolean bool1 = false;
    boolean bool2;
    if (paramMenuItem != null)
    {
      if (!paramMenuItem.isEnabled()) {
        return false;
      }
      Object localObject1 = o;
      if ((localObject1 != null) && (((MenuItem.OnMenuItemClickListener)localObject1).onMenuItemClick(paramMenuItem))) {}
      Object localObject3;
      do
      {
        for (;;)
        {
          bool2 = true;
          break label142;
          localObject3 = b;
          if (!((f)localObject3).a((f)localObject3, paramMenuItem))
          {
            localObject1 = g;
            if (localObject1 != null)
            {
              localObject3 = a;
              try
              {
                ((Context)localObject3).startActivity((Intent)localObject1);
              }
              catch (ActivityNotFoundException localActivityNotFoundException)
              {
                Log.e("MenuItemImpl", "Can't find activity to handle intent; ignoring", localActivityNotFoundException);
              }
            }
          }
        }
        localObject2 = B;
      } while ((localObject2 != null) && (a.onPerformDefaultAction()));
      bool2 = false;
      label142:
      Object localObject2 = B;
      int m;
      if ((localObject2 != null) && (a.hasSubMenu())) {
        m = 1;
      } else {
        m = 0;
      }
      if (paramMenuItem.n())
      {
        bool1 = bool2 | paramMenuItem.expandActionView();
        if (bool1)
        {
          a(true);
          return bool1;
        }
      }
      else
      {
        if ((!paramMenuItem.hasSubMenu()) && (m == 0))
        {
          if ((paramInt & 0x1) != 0) {
            break label435;
          }
          a(true);
          return bool2;
        }
        if ((paramInt & 0x4) == 0) {
          a(false);
        }
        if (!paramMenuItem.hasSubMenu())
        {
          localObject3 = new p(a, this, paramMenuItem);
          p = ((p)localObject3);
          ((p)localObject3).setHeaderTitle(a);
        }
        paramMenuItem = p;
        if (m != 0)
        {
          localObject3 = f;
          a.onPrepareSubMenu(paramMenuItem);
        }
        localObject2 = w;
        if (!((CopyOnWriteArrayList)localObject2).isEmpty())
        {
          if (paramL != null) {
            bool1 = paramL.a(paramMenuItem);
          }
          paramL = ((CopyOnWriteArrayList)localObject2).iterator();
          for (;;)
          {
            bool3 = bool1;
            if (!paramL.hasNext()) {
              break;
            }
            localObject3 = (WeakReference)paramL.next();
            l localL = (l)((Reference)localObject3).get();
            if (localL == null) {
              ((CopyOnWriteArrayList)localObject2).remove(localObject3);
            } else if (!bool1) {
              bool1 = localL.a(paramMenuItem);
            }
          }
        }
        bool1 = bool2 | bool3;
        if (bool1) {
          break label438;
        }
        a(true);
        return bool1;
      }
    }
    else
    {
      return false;
    }
    return bool1;
    label435:
    return bool2;
    label438:
    return bool1;
  }
  
  public boolean a(f paramF, MenuItem paramMenuItem)
  {
    f.a localA = i;
    return (localA != null) && (localA.onMenuItemSelected(paramF, paramMenuItem));
  }
  
  public final MenuItem add(int paramInt)
  {
    return a(0, 0, 0, f.getString(paramInt));
  }
  
  public final MenuItem add(int paramInt1, int paramInt2, int paramInt3, int paramInt4)
  {
    return a(paramInt1, paramInt2, paramInt3, f.getString(paramInt4));
  }
  
  public final MenuItem add(int paramInt1, int paramInt2, int paramInt3, CharSequence paramCharSequence)
  {
    return a(paramInt1, paramInt2, paramInt3, paramCharSequence);
  }
  
  public final MenuItem add(CharSequence paramCharSequence)
  {
    return a(0, 0, 0, paramCharSequence);
  }
  
  public final int addIntentOptions(int paramInt1, int paramInt2, int paramInt3, ComponentName paramComponentName, Intent[] paramArrayOfIntent, Intent paramIntent, int paramInt4, MenuItem[] paramArrayOfMenuItem)
  {
    PackageManager localPackageManager = a.getPackageManager();
    int i2 = 0;
    List localList = localPackageManager.queryIntentActivityOptions(paramComponentName, paramArrayOfIntent, paramIntent, 0);
    int m;
    if (localList != null) {
      m = localList.size();
    } else {
      m = 0;
    }
    int i1 = i2;
    if ((paramInt4 & 0x1) == 0)
    {
      removeGroup(paramInt1);
      i1 = i2;
    }
    while (i1 < m)
    {
      ResolveInfo localResolveInfo = (ResolveInfo)localList.get(i1);
      paramInt4 = specificIndex;
      if (paramInt4 < 0) {
        paramComponentName = paramIntent;
      } else {
        paramComponentName = paramArrayOfIntent[paramInt4];
      }
      paramComponentName = new Intent(paramComponentName);
      Object localObject = activityInfo;
      paramComponentName.setComponent(new ComponentName(applicationInfo.packageName, name));
      localObject = a(paramInt1, paramInt2, paramInt3, localResolveInfo.loadLabel(localPackageManager));
      ((h)localObject).setIcon(localResolveInfo.loadIcon(localPackageManager));
      g = paramComponentName;
      if (paramArrayOfMenuItem != null)
      {
        paramInt4 = specificIndex;
        if (paramInt4 >= 0) {
          paramArrayOfMenuItem[paramInt4] = localObject;
        }
      }
      i1 += 1;
    }
    return m;
  }
  
  public final SubMenu addSubMenu(int paramInt)
  {
    return addSubMenu(0, 0, 0, f.getString(paramInt));
  }
  
  public final SubMenu addSubMenu(int paramInt1, int paramInt2, int paramInt3, int paramInt4)
  {
    return addSubMenu(paramInt1, paramInt2, paramInt3, f.getString(paramInt4));
  }
  
  public final SubMenu addSubMenu(int paramInt1, int paramInt2, int paramInt3, CharSequence paramCharSequence)
  {
    paramCharSequence = a(paramInt1, paramInt2, paramInt3, paramCharSequence);
    p localP = new p(a, this, paramCharSequence);
    p = localP;
    localP.setHeaderTitle(a);
    return localP;
  }
  
  public final SubMenu addSubMenu(CharSequence paramCharSequence)
  {
    return addSubMenu(0, 0, 0, paramCharSequence);
  }
  
  public final void b(Bundle paramBundle)
  {
    if (paramBundle == null) {
      return;
    }
    SparseArray localSparseArray = paramBundle.getSparseParcelableArray(getActionViewStatesKey());
    int i1 = j.size();
    int m = 0;
    while (m < i1)
    {
      MenuItem localMenuItem = getItem(m);
      View localView = localMenuItem.getActionView();
      if ((localView != null) && (localView.getId() != -1)) {
        localView.restoreHierarchyState(localSparseArray);
      }
      if (localMenuItem.hasSubMenu()) {
        ((p)localMenuItem.getSubMenu()).b(paramBundle);
      }
      m += 1;
    }
    m = paramBundle.getInt("android:menu:expandedactionview");
    if (m > 0)
    {
      paramBundle = findItem(m);
      if (paramBundle != null) {
        paramBundle.expandActionView();
      }
    }
  }
  
  public final void b(l paramL)
  {
    CopyOnWriteArrayList localCopyOnWriteArrayList = w;
    Iterator localIterator = localCopyOnWriteArrayList.iterator();
    while (localIterator.hasNext())
    {
      WeakReference localWeakReference = (WeakReference)localIterator.next();
      l localL = (l)localWeakReference.get();
      if ((localL == null) || (localL == paramL)) {
        localCopyOnWriteArrayList.remove(localWeakReference);
      }
    }
  }
  
  public final void b(boolean paramBoolean)
  {
    if (!r)
    {
      if (paramBoolean)
      {
        mIsVisibleItemsStale = true;
        o = true;
      }
      CopyOnWriteArrayList localCopyOnWriteArrayList = w;
      if (localCopyOnWriteArrayList.isEmpty()) {
        return;
      }
      g();
      Iterator localIterator = localCopyOnWriteArrayList.iterator();
      while (localIterator.hasNext())
      {
        WeakReference localWeakReference = (WeakReference)localIterator.next();
        l localL = (l)localWeakReference.get();
        if (localL == null) {
          localCopyOnWriteArrayList.remove(localWeakReference);
        } else {
          localL.updateMenuView();
        }
      }
      h();
      return;
    }
    s = true;
    if (paramBoolean) {
      p = true;
    }
  }
  
  public boolean b()
  {
    return h;
  }
  
  public final void c(Bundle paramBundle)
  {
    int i1 = j.size();
    Object localObject1 = null;
    int m = 0;
    while (m < i1)
    {
      MenuItem localMenuItem = getItem(m);
      View localView = localMenuItem.getActionView();
      Object localObject3 = localObject1;
      if (localView != null)
      {
        localObject3 = localObject1;
        if (localView.getId() != -1)
        {
          Object localObject2 = localObject1;
          if (localObject1 == null) {
            localObject2 = new SparseArray();
          }
          localView.saveHierarchyState((SparseArray)localObject2);
          localObject3 = localObject2;
          if (localMenuItem.isActionViewExpanded())
          {
            paramBundle.putInt("android:menu:expandedactionview", localMenuItem.getItemId());
            localObject3 = localObject2;
          }
        }
      }
      if (localMenuItem.hasSubMenu()) {
        ((p)localMenuItem.getSubMenu()).c(paramBundle);
      }
      m += 1;
      localObject1 = localObject3;
    }
    if (localObject1 != null) {
      paramBundle.putSparseParcelableArray(getActionViewStatesKey(), localObject1);
    }
  }
  
  public boolean c()
  {
    return e;
  }
  
  public boolean c(h paramH)
  {
    CopyOnWriteArrayList localCopyOnWriteArrayList = w;
    boolean bool2 = localCopyOnWriteArrayList.isEmpty();
    boolean bool1 = false;
    if (bool2) {
      return false;
    }
    g();
    Iterator localIterator = localCopyOnWriteArrayList.iterator();
    boolean bool3;
    do
    {
      l localL;
      for (;;)
      {
        bool2 = bool1;
        if (!localIterator.hasNext()) {
          break label101;
        }
        WeakReference localWeakReference = (WeakReference)localIterator.next();
        localL = (l)localWeakReference.get();
        if (localL != null) {
          break;
        }
        localCopyOnWriteArrayList.remove(localWeakReference);
      }
      bool3 = localL.a(paramH);
      bool2 = bool3;
      bool1 = bool2;
    } while (!bool3);
    label101:
    h();
    if (bool2) {
      C = paramH;
    }
    return bool2;
  }
  
  public final void clear()
  {
    h localH = C;
    if (localH != null) {
      d(localH);
    }
    j.clear();
    b(true);
  }
  
  public final void clearHeader()
  {
    b = null;
    d = null;
    c = null;
    b(false);
  }
  
  public final void close()
  {
    a(true);
  }
  
  public boolean d()
  {
    return k;
  }
  
  public boolean d(h paramH)
  {
    CopyOnWriteArrayList localCopyOnWriteArrayList = w;
    boolean bool2 = localCopyOnWriteArrayList.isEmpty();
    boolean bool1 = false;
    if (!bool2)
    {
      if (C != paramH) {
        return false;
      }
      g();
      Iterator localIterator = localCopyOnWriteArrayList.iterator();
      boolean bool3;
      do
      {
        l localL;
        for (;;)
        {
          bool2 = bool1;
          if (!localIterator.hasNext()) {
            break label109;
          }
          WeakReference localWeakReference = (WeakReference)localIterator.next();
          localL = (l)localWeakReference.get();
          if (localL != null) {
            break;
          }
          localCopyOnWriteArrayList.remove(localWeakReference);
        }
        bool3 = localL.b(paramH);
        bool2 = bool3;
        bool1 = bool2;
      } while (!bool3);
      label109:
      h();
      if (bool2)
      {
        C = null;
        return bool2;
      }
    }
    else
    {
      return false;
    }
    return bool2;
  }
  
  public final MenuItem findItem(int paramInt)
  {
    ArrayList localArrayList = j;
    int i1 = localArrayList.size();
    int m = 0;
    while (m < i1)
    {
      Object localObject = (h)localArrayList.get(m);
      if (id == paramInt) {
        return localObject;
      }
      if (((h)localObject).hasSubMenu())
      {
        localObject = p.findItem(paramInt);
        if (localObject != null) {
          return localObject;
        }
      }
      m += 1;
    }
    return null;
  }
  
  public final void g()
  {
    if (!r)
    {
      r = true;
      s = false;
      p = false;
    }
  }
  
  public String getActionViewStatesKey()
  {
    return "android:menu:actionviewstates";
  }
  
  public final MenuItem getItem(int paramInt)
  {
    return (MenuItem)j.get(paramInt);
  }
  
  public final ArrayList getVisibleItems()
  {
    boolean bool = mIsVisibleItemsStale;
    ArrayList localArrayList1 = mVisibleItems;
    if (!bool) {
      return localArrayList1;
    }
    localArrayList1.clear();
    ArrayList localArrayList2 = j;
    int i1 = localArrayList2.size();
    int m = 0;
    while (m < i1)
    {
      h localH = (h)localArrayList2.get(m);
      if (localH.isVisible()) {
        localArrayList1.add(localH);
      }
      m += 1;
    }
    mIsVisibleItemsStale = false;
    o = true;
    return localArrayList1;
  }
  
  public final void h()
  {
    r = false;
    if (s)
    {
      s = false;
      b(p);
    }
  }
  
  public final boolean hasVisibleItems()
  {
    if (D) {
      return true;
    }
    ArrayList localArrayList = j;
    int i1 = localArrayList.size();
    int m = 0;
    while (m < i1)
    {
      if (((h)localArrayList.get(m)).isVisible()) {
        return true;
      }
      m += 1;
    }
    return false;
  }
  
  public final boolean isShortcutKey(int paramInt, KeyEvent paramKeyEvent)
  {
    return a(paramInt, paramKeyEvent) != null;
  }
  
  public final boolean performIdentifierAction(int paramInt1, int paramInt2)
  {
    return a(findItem(paramInt1), null, paramInt2);
  }
  
  public final boolean performShortcut(int paramInt1, KeyEvent paramKeyEvent, int paramInt2)
  {
    paramKeyEvent = a(paramInt1, paramKeyEvent);
    boolean bool;
    if (paramKeyEvent != null) {
      bool = a(paramKeyEvent, null, paramInt2);
    } else {
      bool = false;
    }
    if ((paramInt2 & 0x2) != 0) {
      a(true);
    }
    return bool;
  }
  
  public f q()
  {
    return this;
  }
  
  public final void removeGroup(int paramInt)
  {
    ArrayList localArrayList1 = j;
    int i2 = localArrayList1.size();
    int i1 = 0;
    int m = 0;
    while (m < i2)
    {
      if (getj == paramInt) {
        break label51;
      }
      m += 1;
    }
    m = -1;
    label51:
    if (m >= 0)
    {
      i2 = localArrayList1.size();
      while ((i1 < i2 - m) && (getj == paramInt))
      {
        if (m >= 0)
        {
          ArrayList localArrayList2 = j;
          if (m < localArrayList2.size()) {
            localArrayList2.remove(m);
          }
        }
        i1 += 1;
      }
      b(true);
    }
  }
  
  public final void removeItem(int paramInt)
  {
    ArrayList localArrayList = j;
    int i1 = localArrayList.size();
    int m = 0;
    while (m < i1)
    {
      if (getid == paramInt) {
        break label47;
      }
      m += 1;
    }
    m = -1;
    label47:
    if (m >= 0)
    {
      localArrayList = j;
      if (m >= localArrayList.size()) {
        return;
      }
      localArrayList.remove(m);
      b(true);
    }
  }
  
  public final void setGroupCheckable(int paramInt, boolean paramBoolean1, boolean paramBoolean2)
  {
    ArrayList localArrayList = j;
    int i2 = localArrayList.size();
    int m = 0;
    while (m < i2)
    {
      h localH = (h)localArrayList.get(m);
      if (j == paramInt)
      {
        int i3 = n;
        int i1;
        if (paramBoolean2) {
          i1 = 4;
        } else {
          i1 = 0;
        }
        n = (i3 & 0xFFFFFFFB | i1);
        localH.setCheckable(paramBoolean1);
      }
      m += 1;
    }
  }
  
  public void setGroupDividerEnabled(boolean paramBoolean)
  {
    e = paramBoolean;
  }
  
  public final void setGroupEnabled(int paramInt, boolean paramBoolean)
  {
    ArrayList localArrayList = j;
    int i1 = localArrayList.size();
    int m = 0;
    while (m < i1)
    {
      h localH = (h)localArrayList.get(m);
      if (j == paramInt) {
        localH.setEnabled(paramBoolean);
      }
      m += 1;
    }
  }
  
  public final void setGroupVisible(int paramInt, boolean paramBoolean)
  {
    ArrayList localArrayList = j;
    int i3 = localArrayList.size();
    int m = 0;
    int i2;
    for (int i1 = 0; m < i3; i1 = i2)
    {
      h localH = (h)localArrayList.get(m);
      i2 = i1;
      if (j == paramInt)
      {
        int i4 = n;
        if (paramBoolean) {
          i2 = 0;
        } else {
          i2 = 8;
        }
        int i5 = i4 & 0xFFFFFFF7 | i2;
        n = i5;
        i2 = i1;
        if (i4 != i5) {
          i2 = 1;
        }
      }
      m += 1;
    }
    if (i1 != 0) {
      b(true);
    }
  }
  
  public void setQwertyMode(boolean paramBoolean)
  {
    k = paramBoolean;
    b(false);
  }
  
  public final int size()
  {
    return j.size();
  }
}
