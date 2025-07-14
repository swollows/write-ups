package ui;

import VCard.Attribute;
import android.app.Activity;
import android.app.Application;
import android.content.Intent;
import android.content.IntentSender;
import android.content.res.Configuration;
import android.os.BaseBundle;
import android.os.Bundle;
import android.os.Trace;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewTreeObserver;
import android.view.ViewTreeObserver.OnDrawListener;
import android.view.Window;
import androidx.fragment.asm.FragmentActivity;
import androidx.fragment.asm.p;
import androidx.lifecycle.Dictionary;
import androidx.lifecycle.Frame;
import androidx.lifecycle.PieChart;
import androidx.lifecycle.PlotListener;
import androidx.lifecycle.PreferenceFragment;
import androidx.lifecycle.l;
import androidx.lifecycle.x;
import app.e;
import drupal.AdView;
import handle.AnnotationVisitor;
import handle.Label;
import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.concurrent.CopyOnWriteArrayList;
import java.util.concurrent.CopyOnWriteArraySet;
import java.util.concurrent.atomic.AtomicInteger;
import misc.Subscriber;
import params.Log;
import signature.BaseListFragment;
import ssh.F;
import tts.g;
import widgets.Checkable;

public abstract class AbstractGalleryActivity
  extends BaseListFragment
  implements androidx.lifecycle.List, PlotListener, tts.c
{
  private static final String ACTIVITY_RESULT_TAG = "android:support:activity-result";
  private static final Regex.Companion Companion;
  private PieChart _viewModelStore;
  private final misc.f activityResultRegistry;
  private int contentLayoutId;
  private final VCard.c contextAwareHelper;
  private final Checkable defaultViewModelProviderFactory$delegate;
  private boolean dispatchingOnMultiWindowModeChanged;
  private boolean dispatchingOnPictureInPictureModeChanged;
  private final Checkable fullyDrawnReporter$delegate;
  private final app.b menuHostHelper;
  private final AtomicInteger nextLocalRequestCode;
  private final Checkable onBackPressedDispatcher$delegate;
  private final CopyOnWriteArrayList<C.a> onConfigurationChangedListeners;
  private final CopyOnWriteArrayList<C.a> onMultiWindowModeChangedListeners;
  private final CopyOnWriteArrayList<C.a> onNewIntentListeners;
  private final CopyOnWriteArrayList<C.a> onPictureInPictureModeChangedListeners;
  private final CopyOnWriteArrayList<C.a> onTrimMemoryListeners;
  private final CopyOnWriteArrayList<Runnable> onUserLeaveHintListeners;
  private final Scheduler reportFullyDrawnExecutor;
  private final g savedStateRegistryController;
  
  static
  {
    throw new Runtime("d2j fail translate: java.lang.RuntimeException: \n\tat com.googlecode.dex2jar.ir.ts.NewTransformer.transform(NewTransformer.java:134)\n\tat com.googlecode.d2j.dex.Dex2jar$2.optimize(Dex2jar.java:148)\n\tat com.googlecode.d2j.dex.Dex2Asm.convertCode(Dex2Asm.java:414)\n\tat com.googlecode.d2j.dex.ExDex2Asm.convertCode(ExDex2Asm.java:42)\n\tat com.googlecode.d2j.dex.Dex2jar$2.convertCode(Dex2jar.java:128)\n\tat com.googlecode.d2j.dex.Dex2Asm.convertMethod(Dex2Asm.java:509)\n\tat com.googlecode.d2j.dex.Dex2Asm.convertClass(Dex2Asm.java:406)\n\tat com.googlecode.d2j.dex.Dex2Asm.convertDex(Dex2Asm.java:422)\n\tat com.googlecode.d2j.dex.Dex2jar.doTranslate(Dex2jar.java:172)\n\tat com.googlecode.d2j.dex.Dex2jar.to(Dex2jar.java:272)\n\tat com.googlecode.dex2jar.tools.Dex2jarCmd.doCommandLine(Dex2jarCmd.java:108)\n\tat com.googlecode.dex2jar.tools.BaseCmd.doMain(BaseCmd.java:288)\n\tat com.googlecode.dex2jar.tools.Dex2jarCmd.main(Dex2jarCmd.java:32)\n");
  }
  
  public AbstractGalleryActivity() {}
  
  public static void a(FragmentActivity paramFragmentActivity, x paramX, androidx.lifecycle.Handle paramHandle)
  {
    if (paramHandle == androidx.lifecycle.Handle.ON_DESTROY)
    {
      contextAwareHelper.c = null;
      if (!paramFragmentActivity.isChangingConfigurations()) {
        paramFragmentActivity.getViewModelStore().a();
      }
      paramFragmentActivity = (Item)reportFullyDrawnExecutor;
      paramX = c;
      paramX.getWindow().getDecorView().removeCallbacks(paramFragmentActivity);
      paramX.getWindow().getDecorView().getViewTreeObserver().removeOnDrawListener(paramFragmentActivity);
    }
  }
  
  public static final void access$addObserverForBackInvoker(AbstractGalleryActivity paramAbstractGalleryActivity, i paramI)
  {
    paramAbstractGalleryActivity.getLifecycle().a(new app.ClassWriter(paramI, paramAbstractGalleryActivity, 1));
  }
  
  public static final void access$ensureViewModelStore(AbstractGalleryActivity paramAbstractGalleryActivity)
  {
    if (_viewModelStore == null)
    {
      Fragment localFragment = (Fragment)paramAbstractGalleryActivity.getLastNonConfigurationInstance();
      if (localFragment != null) {
        _viewModelStore = loginTask;
      }
      if (_viewModelStore == null) {
        _viewModelStore = new PieChart();
      }
    }
  }
  
  public static void add(FragmentActivity paramFragmentActivity, AbstractGalleryActivity paramAbstractGalleryActivity)
  {
    Log.get(paramAbstractGalleryActivity, "it");
    Bundle localBundle = paramFragmentActivity.getSavedStateRegistry().a("android:support:activity-result");
    if (localBundle != null)
    {
      paramFragmentActivity = activityResultRegistry;
      paramFragmentActivity.getClass();
      paramAbstractGalleryActivity = localBundle.getIntegerArrayList("KEY_COMPONENT_ACTIVITY_REGISTERED_RCS");
      ArrayList localArrayList = localBundle.getStringArrayList("KEY_COMPONENT_ACTIVITY_REGISTERED_KEYS");
      if (localArrayList != null)
      {
        if (paramAbstractGalleryActivity == null) {
          return;
        }
        Object localObject1 = localBundle.getStringArrayList("KEY_COMPONENT_ACTIVITY_LAUNCHED_KEYS");
        if (localObject1 != null) {
          a.addAll((Collection)localObject1);
        }
        localObject1 = localBundle.getBundle("KEY_COMPONENT_ACTIVITY_PENDING_RESULT");
        localBundle = b;
        if (localObject1 != null) {
          localBundle.putAll((Bundle)localObject1);
        }
        int j = localArrayList.size();
        int i = 0;
        while (i < j)
        {
          Object localObject2 = (String)localArrayList.get(i);
          localObject1 = c;
          boolean bool = ((Map)localObject1).containsKey(localObject2);
          LinkedHashMap localLinkedHashMap = this$0;
          if (bool)
          {
            Integer localInteger = (Integer)((Map)localObject1).remove(localObject2);
            if (!localBundle.containsKey((String)localObject2))
            {
              if (((localLinkedHashMap instanceof ssh.Object)) && (!(localLinkedHashMap instanceof F)))
              {
                if (localLinkedHashMap == null) {
                  paramFragmentActivity = "null";
                } else {
                  paramFragmentActivity = localLinkedHashMap.getClass().getName();
                }
                paramAbstractGalleryActivity = new StringBuilder();
                paramAbstractGalleryActivity.append(paramFragmentActivity);
                paramAbstractGalleryActivity.append(" cannot be cast to ");
                paramAbstractGalleryActivity.append("kotlin.collections.MutableMap");
                paramFragmentActivity = new ClassCastException(paramAbstractGalleryActivity.toString());
                Log.get(paramFragmentActivity, i0.i.class.getName());
                throw paramFragmentActivity;
              }
              localLinkedHashMap.remove(localInteger);
            }
          }
          localObject2 = paramAbstractGalleryActivity.get(i);
          Log.append(localObject2, "rcs[i]");
          int k = ((Number)localObject2).intValue();
          localObject2 = localArrayList.get(i);
          Log.append(localObject2, "keys[i]");
          localObject2 = (String)localObject2;
          localLinkedHashMap.put(Integer.valueOf(k), localObject2);
          ((Map)localObject1).put(localObject2, Integer.valueOf(k));
          i += 1;
        }
      }
    }
  }
  
  public static Bundle onSaveInstanceState(FragmentActivity paramFragmentActivity)
  {
    Bundle localBundle = new Bundle();
    paramFragmentActivity = activityResultRegistry;
    paramFragmentActivity.getClass();
    LinkedHashMap localLinkedHashMap = c;
    localBundle.putIntegerArrayList("KEY_COMPONENT_ACTIVITY_REGISTERED_RCS", new ArrayList(localLinkedHashMap.values()));
    localBundle.putStringArrayList("KEY_COMPONENT_ACTIVITY_REGISTERED_KEYS", new ArrayList(localLinkedHashMap.keySet()));
    localBundle.putStringArrayList("KEY_COMPONENT_ACTIVITY_LAUNCHED_KEYS", new ArrayList(a));
    localBundle.putBundle("KEY_COMPONENT_ACTIVITY_PENDING_RESULT", new Bundle(b));
    return localBundle;
  }
  
  public void addMenuProvider(e paramE)
  {
    Log.get(paramE, "provider");
    app.b localB = menuHostHelper;
    a.add(paramE);
    r.run();
  }
  
  public void addMenuProvider(e paramE, x paramX)
  {
    Log.get(paramE, "provider");
    Log.get(paramX, "owner");
    app.b localB = menuHostHelper;
    a.add(paramE);
    r.run();
    paramX = paramX.getLifecycle();
    HashMap localHashMap = c;
    app.c localC = (app.c)localHashMap.remove(paramE);
    if (localC != null)
    {
      a.b(b);
      b = null;
    }
    localHashMap.put(paramE, new app.c(paramX, new app.ClassWriter(localB, paramE, 0)));
  }
  
  public void addMenuProvider(e paramE, x paramX, androidx.lifecycle.c paramC)
  {
    Log.get(paramE, "provider");
    Log.get(paramX, "owner");
    Log.get(paramC, "state");
    app.b localB = menuHostHelper;
    localB.getClass();
    paramX = paramX.getLifecycle();
    HashMap localHashMap = c;
    app.c localC = (app.c)localHashMap.remove(paramE);
    if (localC != null)
    {
      a.b(b);
      b = null;
    }
    localHashMap.put(paramE, new app.c(paramX, new app.a(localB, paramC, paramE)));
  }
  
  public final void addOnConfigurationChangedListener(AdView paramAdView)
  {
    Log.get(paramAdView, "listener");
    onConfigurationChangedListeners.add(paramAdView);
  }
  
  public final void addOnContextAvailableListener(Attribute paramAttribute)
  {
    Log.get(paramAttribute, "listener");
    VCard.c localC = contextAwareHelper;
    localC.getClass();
    AbstractGalleryActivity localAbstractGalleryActivity = c;
    if (localAbstractGalleryActivity != null) {
      paramAttribute.a(localAbstractGalleryActivity);
    }
    entryList.add(paramAttribute);
  }
  
  public final void addOnMultiWindowModeChangedListener(AdView paramAdView)
  {
    Log.get(paramAdView, "listener");
    onMultiWindowModeChangedListeners.add(paramAdView);
  }
  
  public final void addOnNewIntentListener(AdView paramAdView)
  {
    Log.get(paramAdView, "listener");
    onNewIntentListeners.add(paramAdView);
  }
  
  public final void addOnPictureInPictureModeChangedListener(AdView paramAdView)
  {
    Log.get(paramAdView, "listener");
    onPictureInPictureModeChangedListeners.add(paramAdView);
  }
  
  public final void addOnTrimMemoryListener(AdView paramAdView)
  {
    Log.get(paramAdView, "listener");
    onTrimMemoryListeners.add(paramAdView);
  }
  
  public final void addOnUserLeaveHintListener(Runnable paramRunnable)
  {
    Log.get(paramRunnable, "listener");
    onUserLeaveHintListeners.add(paramRunnable);
  }
  
  public final misc.f getActivityResultRegistry()
  {
    return activityResultRegistry;
  }
  
  public handle.Handle getDefaultViewModelCreationExtras()
  {
    AnnotationVisitor localAnnotationVisitor = new AnnotationVisitor(Label.i);
    Object localObject = getApplication();
    LinkedHashMap localLinkedHashMap = c;
    if (localObject != null)
    {
      localObject = androidx.lifecycle.Item.a;
      Application localApplication = getApplication();
      Log.append(localApplication, "application");
      localLinkedHashMap.put(localObject, localApplication);
    }
    localLinkedHashMap.put(Frame.i, this);
    localLinkedHashMap.put(Frame.a, this);
    localObject = getIntent();
    if (localObject != null) {
      localObject = ((Intent)localObject).getExtras();
    } else {
      localObject = null;
    }
    if (localObject != null) {
      localLinkedHashMap.put(Frame.b, localObject);
    }
    return localAnnotationVisitor;
  }
  
  public l getDefaultViewModelProviderFactory()
  {
    return (l)((widgets.Item)defaultViewModelProviderFactory$delegate).a();
  }
  
  public Plot getFullyDrawnReporter()
  {
    return (Plot)((widgets.Item)fullyDrawnReporter$delegate).a();
  }
  
  public Object getLastCustomNonConfigurationInstance()
  {
    Fragment localFragment = (Fragment)getLastNonConfigurationInstance();
    if (localFragment != null) {
      return custom;
    }
    return null;
  }
  
  public androidx.lifecycle.ClassWriter getLifecycle()
  {
    return super.getLifecycle();
  }
  
  public final i getOnBackPressedDispatcher()
  {
    return (i)((widgets.Item)onBackPressedDispatcher$delegate).a();
  }
  
  public final tts.h getSavedStateRegistry()
  {
    return savedStateRegistryController.e;
  }
  
  public PieChart getViewModelStore()
  {
    if (getApplication() != null)
    {
      if (_viewModelStore == null)
      {
        localObject = (Fragment)getLastNonConfigurationInstance();
        if (localObject != null) {
          _viewModelStore = loginTask;
        }
        if (_viewModelStore == null) {
          _viewModelStore = new PieChart();
        }
      }
      Object localObject = _viewModelStore;
      Log.get(localObject);
      return localObject;
    }
    throw new IllegalStateException("Your activity is not yet attached to the Application instance. You can't request ViewModel before onCreate call.");
  }
  
  public void initializeViewTreeOwners()
  {
    View localView = getWindow().getDecorView();
    Log.append(localView, "window.decorView");
    localView.setTag(2131230907, this);
    localView = getWindow().getDecorView();
    Log.append(localView, "window.decorView");
    localView.setTag(2131230910, this);
    localView = getWindow().getDecorView();
    Log.append(localView, "window.decorView");
    localView.setTag(2131230909, this);
    localView = getWindow().getDecorView();
    Log.append(localView, "window.decorView");
    localView.setTag(2131230908, this);
    localView = getWindow().getDecorView();
    Log.append(localView, "window.decorView");
    localView.setTag(2131230845, this);
  }
  
  public void invalidateMenu()
  {
    invalidateOptionsMenu();
  }
  
  public void onActivityResult(int paramInt1, int paramInt2, Intent paramIntent)
  {
    if (!activityResultRegistry.a(paramInt1, paramInt2, paramIntent)) {
      super.onActivityResult(paramInt1, paramInt2, paramIntent);
    }
  }
  
  public void onBackPressed()
  {
    getOnBackPressedDispatcher().a();
  }
  
  public void onConfigurationChanged(Configuration paramConfiguration)
  {
    Log.get(paramConfiguration, "newConfig");
    super.onConfigurationChanged(paramConfiguration);
    Iterator localIterator = onConfigurationChangedListeners.iterator();
    while (localIterator.hasNext()) {
      ((AdView)localIterator.next()).a(paramConfiguration);
    }
  }
  
  public void onCreate(Bundle paramBundle)
  {
    savedStateRegistryController.a(paramBundle);
    Object localObject = contextAwareHelper;
    localObject.getClass();
    c = this;
    localObject = entryList.iterator();
    while (((Iterator)localObject).hasNext()) {
      ((Attribute)((Iterator)localObject).next()).a(this);
    }
    super.onCreate(paramBundle);
    int i = PreferenceFragment.emptyView;
    Dictionary.onCreate(this);
    i = contentLayoutId;
    if (i != 0) {
      setContentView(i);
    }
  }
  
  public boolean onCreatePanelMenu(int paramInt, android.view.Menu paramMenu)
  {
    Log.get(paramMenu, "menu");
    if (paramInt == 0)
    {
      super.onCreatePanelMenu(paramInt, paramMenu);
      paramMenu = menuHostHelper;
      getMenuInflater();
      paramMenu.b();
    }
    return true;
  }
  
  public boolean onMenuItemSelected(int paramInt, MenuItem paramMenuItem)
  {
    Log.get(paramMenuItem, "item");
    if (super.onMenuItemSelected(paramInt, paramMenuItem)) {
      return true;
    }
    if (paramInt == 0) {
      menuHostHelper.a();
    }
    return false;
  }
  
  public void onMultiWindowModeChanged(boolean paramBoolean)
  {
    if (dispatchingOnMultiWindowModeChanged) {
      return;
    }
    Iterator localIterator = onMultiWindowModeChangedListeners.iterator();
    while (localIterator.hasNext()) {
      ((AdView)localIterator.next()).a(new signature.c(paramBoolean));
    }
  }
  
  public void onMultiWindowModeChanged(boolean paramBoolean, Configuration paramConfiguration)
  {
    Log.get(paramConfiguration, "newConfig");
    dispatchingOnMultiWindowModeChanged = true;
    try
    {
      super.onMultiWindowModeChanged(paramBoolean, paramConfiguration);
      dispatchingOnMultiWindowModeChanged = false;
      paramConfiguration = onMultiWindowModeChangedListeners.iterator();
      while (paramConfiguration.hasNext()) {
        ((AdView)paramConfiguration.next()).a(new signature.c(paramBoolean));
      }
      return;
    }
    catch (Throwable paramConfiguration)
    {
      dispatchingOnMultiWindowModeChanged = false;
      throw paramConfiguration;
    }
  }
  
  public void onNewIntent(Intent paramIntent)
  {
    Log.get(paramIntent, "intent");
    super.onNewIntent(paramIntent);
    Iterator localIterator = onNewIntentListeners.iterator();
    while (localIterator.hasNext()) {
      ((AdView)localIterator.next()).a(paramIntent);
    }
  }
  
  public void onPanelClosed(int paramInt, android.view.Menu paramMenu)
  {
    Log.get(paramMenu, "menu");
    Object localObject;
    do
    {
      Iterator localIterator = menuHostHelper.a.iterator();
      while (!((Iterator)localObject).hasNext())
      {
        do
        {
          if (!localIterator.hasNext()) {
            break;
          }
          localObject = nexta;
        } while (x < 1);
        localObject = a.get().iterator();
      }
    } while (((Iterator)localObject).next() == null);
    throw new ClassCastException();
    super.onPanelClosed(paramInt, paramMenu);
  }
  
  public void onPictureInPictureModeChanged(boolean paramBoolean)
  {
    if (dispatchingOnPictureInPictureModeChanged) {
      return;
    }
    Iterator localIterator = onPictureInPictureModeChangedListeners.iterator();
    while (localIterator.hasNext()) {
      ((AdView)localIterator.next()).a(new signature.b(paramBoolean));
    }
  }
  
  public void onPictureInPictureModeChanged(boolean paramBoolean, Configuration paramConfiguration)
  {
    Log.get(paramConfiguration, "newConfig");
    dispatchingOnPictureInPictureModeChanged = true;
    try
    {
      super.onPictureInPictureModeChanged(paramBoolean, paramConfiguration);
      dispatchingOnPictureInPictureModeChanged = false;
      paramConfiguration = onPictureInPictureModeChangedListeners.iterator();
      while (paramConfiguration.hasNext()) {
        ((AdView)paramConfiguration.next()).a(new signature.b(paramBoolean));
      }
      return;
    }
    catch (Throwable paramConfiguration)
    {
      dispatchingOnPictureInPictureModeChanged = false;
      throw paramConfiguration;
    }
  }
  
  public boolean onPreparePanel(int paramInt, View paramView, android.view.Menu paramMenu)
  {
    Log.get(paramMenu, "menu");
    if (paramInt == 0)
    {
      super.onPreparePanel(paramInt, paramView, paramMenu);
      menuHostHelper.c();
    }
    return true;
  }
  
  public void onRequestPermissionsResult(int paramInt, String[] paramArrayOfString, int[] paramArrayOfInt)
  {
    Log.get(paramArrayOfString, "permissions");
    Log.get(paramArrayOfInt, "grantResults");
    if (!activityResultRegistry.a(paramInt, -1, new Intent().putExtra("androidx.activity.result.contract.extra.PERMISSIONS", paramArrayOfString).putExtra("androidx.activity.result.contract.extra.PERMISSION_GRANT_RESULTS", paramArrayOfInt))) {
      super.onRequestPermissionsResult(paramInt, paramArrayOfString, paramArrayOfInt);
    }
  }
  
  public Object onRetainCustomNonConfigurationInstance()
  {
    return null;
  }
  
  public final Object onRetainNonConfigurationInstance()
  {
    throw new Runtime("d2j fail translate: java.lang.RuntimeException: \n\tat com.googlecode.dex2jar.ir.ts.NewTransformer.transform(NewTransformer.java:134)\n\tat com.googlecode.d2j.dex.Dex2jar$2.optimize(Dex2jar.java:148)\n\tat com.googlecode.d2j.dex.Dex2Asm.convertCode(Dex2Asm.java:414)\n\tat com.googlecode.d2j.dex.ExDex2Asm.convertCode(ExDex2Asm.java:42)\n\tat com.googlecode.d2j.dex.Dex2jar$2.convertCode(Dex2jar.java:128)\n\tat com.googlecode.d2j.dex.Dex2Asm.convertMethod(Dex2Asm.java:509)\n\tat com.googlecode.d2j.dex.Dex2Asm.convertClass(Dex2Asm.java:406)\n\tat com.googlecode.d2j.dex.Dex2Asm.convertDex(Dex2Asm.java:422)\n\tat com.googlecode.d2j.dex.Dex2jar.doTranslate(Dex2jar.java:172)\n\tat com.googlecode.d2j.dex.Dex2jar.to(Dex2jar.java:272)\n\tat com.googlecode.dex2jar.tools.Dex2jarCmd.doCommandLine(Dex2jarCmd.java:108)\n\tat com.googlecode.dex2jar.tools.BaseCmd.doMain(BaseCmd.java:288)\n\tat com.googlecode.dex2jar.tools.Dex2jarCmd.main(Dex2jarCmd.java:32)\n");
  }
  
  public void onSaveInstanceState(Bundle paramBundle)
  {
    Log.get(paramBundle, "outState");
    if ((getLifecycle() instanceof androidx.lifecycle.f))
    {
      Object localObject = getLifecycle();
      Log.add(localObject, "null cannot be cast to non-null type androidx.lifecycle.LifecycleRegistry");
      localObject = (androidx.lifecycle.f)localObject;
      androidx.lifecycle.c localC = androidx.lifecycle.c.c;
      ((androidx.lifecycle.f)localObject).a("setCurrentState");
      ((androidx.lifecycle.f)localObject).a(localC);
    }
    super.onSaveInstanceState(paramBundle);
    savedStateRegistryController.b(paramBundle);
  }
  
  public void onTrimMemory(int paramInt)
  {
    super.onTrimMemory(paramInt);
    Iterator localIterator = onTrimMemoryListeners.iterator();
    while (localIterator.hasNext()) {
      ((AdView)localIterator.next()).a(Integer.valueOf(paramInt));
    }
  }
  
  public void onUserLeaveHint()
  {
    super.onUserLeaveHint();
    Iterator localIterator = onUserLeaveHintListeners.iterator();
    while (localIterator.hasNext()) {
      ((Runnable)localIterator.next()).run();
    }
  }
  
  public android.content.Context peekAvailableContext()
  {
    return contextAwareHelper.c;
  }
  
  public final Subscriber registerForActivityResult(polynomials.a paramA, misc.a paramA1)
  {
    Log.get(paramA, "contract");
    Log.get(paramA1, "callback");
    return registerForActivityResult(paramA, activityResultRegistry, paramA1);
  }
  
  public final Subscriber registerForActivityResult(polynomials.a paramA, misc.f paramF, misc.a paramA1)
  {
    throw new Runtime("d2j fail translate: java.lang.RuntimeException: \n\tat com.googlecode.dex2jar.ir.ts.NewTransformer.transform(NewTransformer.java:134)\n\tat com.googlecode.d2j.dex.Dex2jar$2.optimize(Dex2jar.java:148)\n\tat com.googlecode.d2j.dex.Dex2Asm.convertCode(Dex2Asm.java:414)\n\tat com.googlecode.d2j.dex.ExDex2Asm.convertCode(ExDex2Asm.java:42)\n\tat com.googlecode.d2j.dex.Dex2jar$2.convertCode(Dex2jar.java:128)\n\tat com.googlecode.d2j.dex.Dex2Asm.convertMethod(Dex2Asm.java:509)\n\tat com.googlecode.d2j.dex.Dex2Asm.convertClass(Dex2Asm.java:406)\n\tat com.googlecode.d2j.dex.Dex2Asm.convertDex(Dex2Asm.java:422)\n\tat com.googlecode.d2j.dex.Dex2jar.doTranslate(Dex2jar.java:172)\n\tat com.googlecode.d2j.dex.Dex2jar.to(Dex2jar.java:272)\n\tat com.googlecode.dex2jar.tools.Dex2jarCmd.doCommandLine(Dex2jarCmd.java:108)\n\tat com.googlecode.dex2jar.tools.BaseCmd.doMain(BaseCmd.java:288)\n\tat com.googlecode.dex2jar.tools.Dex2jarCmd.main(Dex2jarCmd.java:32)\n");
  }
  
  public void removeMenuProvider(e paramE)
  {
    Log.get(paramE, "provider");
    menuHostHelper.a(paramE);
  }
  
  public final void removeOnConfigurationChangedListener(AdView paramAdView)
  {
    Log.get(paramAdView, "listener");
    onConfigurationChangedListeners.remove(paramAdView);
  }
  
  public final void removeOnContextAvailableListener(Attribute paramAttribute)
  {
    Log.get(paramAttribute, "listener");
    VCard.c localC = contextAwareHelper;
    localC.getClass();
    entryList.remove(paramAttribute);
  }
  
  public final void removeOnMultiWindowModeChangedListener(AdView paramAdView)
  {
    Log.get(paramAdView, "listener");
    onMultiWindowModeChangedListeners.remove(paramAdView);
  }
  
  public final void removeOnNewIntentListener(AdView paramAdView)
  {
    Log.get(paramAdView, "listener");
    onNewIntentListeners.remove(paramAdView);
  }
  
  public final void removeOnPictureInPictureModeChangedListener(AdView paramAdView)
  {
    Log.get(paramAdView, "listener");
    onPictureInPictureModeChangedListeners.remove(paramAdView);
  }
  
  public final void removeOnTrimMemoryListener(AdView paramAdView)
  {
    Log.get(paramAdView, "listener");
    onTrimMemoryListeners.remove(paramAdView);
  }
  
  public final void removeOnUserLeaveHintListener(Runnable paramRunnable)
  {
    Log.get(paramRunnable, "listener");
    onUserLeaveHintListeners.remove(paramRunnable);
  }
  
  public void reportFullyDrawn()
  {
    try
    {
      boolean bool = drupal.Context.execute();
      if (bool) {
        drupal.Context.add("reportFullyDrawn() for ComponentActivity");
      }
    }
    catch (Throwable localThrowable1)
    {
      break label97;
    }
    super.reportFullyDrawn();
    Plot localPlot = getFullyDrawnReporter();
    Object localObject = s;
    try
    {
      l = true;
      Iterator localIterator = n.iterator();
      while (localIterator.hasNext()) {
        ((astuetz.Menu)localIterator.next()).a();
      }
      n.clear();
      Trace.endSection();
      return;
    }
    catch (Throwable localThrowable2)
    {
      for (;;) {}
    }
    throw localPlot;
    label97:
    Trace.endSection();
    throw localObject;
  }
  
  public abstract void setContentView(int paramInt);
  
  public void setContentView(View paramView)
  {
    initializeViewTreeOwners();
    Object localObject = reportFullyDrawnExecutor;
    View localView = getWindow().getDecorView();
    Log.append(localView, "window.decorView");
    localObject = (Item)localObject;
    localObject.getClass();
    if (!k)
    {
      k = true;
      localView.getViewTreeObserver().addOnDrawListener((ViewTreeObserver.OnDrawListener)localObject);
    }
    super.setContentView(paramView);
  }
  
  public void startActivityForResult(Intent paramIntent, int paramInt)
  {
    Log.get(paramIntent, "intent");
    super.startActivityForResult(paramIntent, paramInt);
  }
  
  public void startActivityForResult(Intent paramIntent, int paramInt, Bundle paramBundle)
  {
    Log.get(paramIntent, "intent");
    super.startActivityForResult(paramIntent, paramInt, paramBundle);
  }
  
  public void startIntentSenderForResult(IntentSender paramIntentSender, int paramInt1, Intent paramIntent, int paramInt2, int paramInt3, int paramInt4)
  {
    Log.get(paramIntentSender, "intent");
    super.startIntentSenderForResult(paramIntentSender, paramInt1, paramIntent, paramInt2, paramInt3, paramInt4);
  }
  
  public void startIntentSenderForResult(IntentSender paramIntentSender, int paramInt1, Intent paramIntent, int paramInt2, int paramInt3, int paramInt4, Bundle paramBundle)
  {
    Log.get(paramIntentSender, "intent");
    super.startIntentSenderForResult(paramIntentSender, paramInt1, paramIntent, paramInt2, paramInt3, paramInt4, paramBundle);
  }
}
