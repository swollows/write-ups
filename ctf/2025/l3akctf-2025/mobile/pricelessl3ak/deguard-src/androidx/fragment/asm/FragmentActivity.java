package androidx.fragment.asm;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.content.IntentSender;
import android.os.Bundle;
import android.util.AttributeSet;
import android.util.Log;
import android.view.MenuItem;
import android.view.View;
import androidx.appcompat.app.AppCompatActivity;
import androidx.lifecycle.Handle;
import androidx.lifecycle.PieChart;
import androidx.lifecycle.g;
import core.File;
import http.Attribute;
import java.io.FileDescriptor;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Map;
import java.util.concurrent.CopyOnWriteArrayList;
import java.util.concurrent.atomic.AtomicInteger;
import misc.ByteVector;
import nonstiff.LoaderManager;
import nonstiff.LoaderManagerImpl;
import signature.ActivityCompat21.SharedElementCallback21;
import signature.BaseListFragment;
import ui.AbstractGalleryActivity;
import ui.Request;

public abstract class FragmentActivity
  extends AbstractGalleryActivity
{
  static final String LIFECYCLE_TAG = "android:support:lifecycle";
  boolean mCreated;
  final androidx.lifecycle.f mFragmentLifecycleRegistry;
  final FragmentController mFragments;
  boolean mResumed;
  boolean mStopped;
  
  public FragmentActivity()
  {
    AppCompatActivity localAppCompatActivity = (AppCompatActivity)this;
    mFragments = new FragmentController(new c(localAppCompatActivity));
    mFragmentLifecycleRegistry = new androidx.lifecycle.f(this);
    mStopped = true;
    getSavedStateRegistry().a("android:support:lifecycle", new e(0, localAppCompatActivity));
    addOnConfigurationChangedListener(new x(localAppCompatActivity, 0));
    addOnNewIntentListener(new x(localAppCompatActivity, 1));
    addOnContextAvailableListener(new a(localAppCompatActivity));
  }
  
  public final View dispatchFragmentsOnCreateView(View paramView, String paramString, Context paramContext, AttributeSet paramAttributeSet)
  {
    return mFragments.mFragments.d.mFragments.onCreateView(paramView, paramString, paramContext, paramAttributeSet);
  }
  
  public void dump(String paramString, FileDescriptor paramFileDescriptor, PrintWriter paramPrintWriter, String[] paramArrayOfString)
  {
    super.dump(paramString, paramFileDescriptor, paramPrintWriter, paramArrayOfString);
    if (!shouldDumpInternalState(paramArrayOfString)) {
      return;
    }
    paramPrintWriter.print(paramString);
    paramPrintWriter.print("Local FragmentActivity ");
    paramPrintWriter.print(Integer.toHexString(System.identityHashCode(this)));
    paramPrintWriter.println(" State:");
    paramFileDescriptor = new StringBuilder();
    paramFileDescriptor.append(paramString);
    paramFileDescriptor.append("  ");
    paramFileDescriptor = paramFileDescriptor.toString();
    paramPrintWriter.print(paramFileDescriptor);
    paramPrintWriter.print("mCreated=");
    paramPrintWriter.print(mCreated);
    paramPrintWriter.print(" mResumed=");
    paramPrintWriter.print(mResumed);
    paramPrintWriter.print(" mStopped=");
    paramPrintWriter.print(mStopped);
    if (getApplication() != null)
    {
      paramArrayOfString = ggetViewModelStorecaa;
      if (i > 0)
      {
        paramPrintWriter.print(paramFileDescriptor);
        paramPrintWriter.println("Loaders:");
        if (i > 0)
        {
          if (b[0] == null)
          {
            paramPrintWriter.print(paramFileDescriptor);
            paramPrintWriter.print("  #");
            paramPrintWriter.print(a[0]);
            paramPrintWriter.print(": ");
            throw new NullPointerException("Null throw statement replaced by Soot");
          }
          throw new ClassCastException();
        }
      }
    }
    paramFileDescriptor = mFragments.mFragments.d;
    paramFileDescriptor.getClass();
    paramArrayOfString = new StringBuilder();
    paramArrayOfString.append(paramString);
    paramArrayOfString.append("    ");
    paramArrayOfString = paramArrayOfString.toString();
    Object localObject1 = a;
    localObject1.getClass();
    Object localObject2 = a;
    if (!((HashMap)localObject2).isEmpty())
    {
      paramPrintWriter.print(paramString);
      paramPrintWriter.println("Active Fragments:");
      localObject2 = ((HashMap)localObject2).values().iterator();
      while (((Iterator)localObject2).hasNext())
      {
        File.write(((Iterator)localObject2).next());
        paramPrintWriter.print(paramString);
        paramPrintWriter.println("null");
      }
    }
    localObject1 = c;
    int i = ((ArrayList)localObject1).size();
    int j = 0;
    if (i > 0)
    {
      paramPrintWriter.print(paramString);
      paramPrintWriter.println("Added Fragments:");
      if (i > 0)
      {
        if (((ArrayList)localObject1).get(0) == null)
        {
          paramPrintWriter.print(paramString);
          paramPrintWriter.print("  #");
          paramPrintWriter.print(0);
          paramPrintWriter.print(": ");
          throw new NullPointerException("Null throw statement replaced by Soot");
        }
        throw new ClassCastException();
      }
    }
    localObject1 = m;
    int k;
    if (localObject1 != null)
    {
      k = ((ArrayList)localObject1).size();
      if (k > 0)
      {
        paramPrintWriter.print(paramString);
        paramPrintWriter.println("Back Stack:");
        i = 0;
        while (i < k)
        {
          localObject1 = (m)m.get(i);
          paramPrintWriter.print(paramString);
          paramPrintWriter.print("  #");
          paramPrintWriter.print(i);
          paramPrintWriter.print(": ");
          paramPrintWriter.println(((m)localObject1).toString());
          ((m)localObject1).dump(paramArrayOfString, paramPrintWriter, true);
          i += 1;
        }
      }
    }
    paramPrintWriter.print(paramString);
    paramArrayOfString = new StringBuilder("Back Stack Index: ");
    paramArrayOfString.append(w.get());
    paramPrintWriter.println(paramArrayOfString.toString());
    paramArrayOfString = l;
    try
    {
      k = l.size();
      if (k > 0)
      {
        paramPrintWriter.print(paramString);
        paramPrintWriter.println("Pending Actions:");
        i = j;
        while (i < k)
        {
          localObject1 = (m)l.get(i);
          paramPrintWriter.print(paramString);
          paramPrintWriter.print("  #");
          paramPrintWriter.print(i);
          paramPrintWriter.print(": ");
          paramPrintWriter.println(localObject1);
          i += 1;
        }
      }
      paramPrintWriter.print(paramString);
      paramPrintWriter.println("FragmentManager misc state:");
      paramPrintWriter.print(paramString);
      paramPrintWriter.print("  mHost=");
      paramPrintWriter.println(t);
      paramPrintWriter.print(paramString);
      paramPrintWriter.print("  mContainer=");
      paramPrintWriter.println(f);
      paramPrintWriter.print(paramString);
      paramPrintWriter.print("  mCurState=");
      paramPrintWriter.print(x);
      paramPrintWriter.print(" mStateSaved=");
      paramPrintWriter.print(d);
      paramPrintWriter.print(" mStopped=");
      paramPrintWriter.print(mStopped);
      paramPrintWriter.print(" mDestroyed=");
      paramPrintWriter.println(i);
      return;
    }
    catch (Throwable paramString)
    {
      for (;;) {}
    }
    throw paramString;
  }
  
  public h getSupportFragmentManager()
  {
    return mFragments.mFragments.d;
  }
  
  public LoaderManager getSupportLoaderManager()
  {
    return new LoaderManagerImpl(this, getViewModelStore());
  }
  
  public void markFragmentsCreated()
  {
    Iterator localIterator = getSupportFragmentManagera.get().iterator();
    while (localIterator.hasNext()) {
      if (localIterator.next() != null) {
        throw new ClassCastException();
      }
    }
  }
  
  public void onActivityResult(int paramInt1, int paramInt2, Intent paramIntent)
  {
    mFragments.d();
    super.onActivityResult(paramInt1, paramInt2, paramIntent);
  }
  
  public void onAttachFragment(Fragment paramFragment) {}
  
  public void onCreate(Bundle paramBundle)
  {
    super.onCreate(paramBundle);
    mFragmentLifecycleRegistry.d(Handle.ON_CREATE);
    paramBundle = mFragments.mFragments.d;
    d = false;
    mStopped = false;
    r.getClass();
    paramBundle.a(1);
  }
  
  public View onCreateView(View paramView, String paramString, Context paramContext, AttributeSet paramAttributeSet)
  {
    View localView = dispatchFragmentsOnCreateView(paramView, paramString, paramContext, paramAttributeSet);
    if (localView == null) {
      return super.onCreateView(paramView, paramString, paramContext, paramAttributeSet);
    }
    return localView;
  }
  
  public View onCreateView(String paramString, Context paramContext, AttributeSet paramAttributeSet)
  {
    View localView2 = dispatchFragmentsOnCreateView(null, paramString, paramContext, paramAttributeSet);
    View localView1 = localView2;
    if (localView2 == null) {
      localView1 = super.onCreateView(paramString, paramContext, paramAttributeSet);
    }
    return localView1;
  }
  
  public void onDestroy()
  {
    super.onDestroy();
    Object localObject1 = mFragments.mFragments.d;
    boolean bool = true;
    i = true;
    ((h)localObject1).a(true);
    Object localObject2 = ((h)localObject1).get().iterator();
    if (!((Iterator)localObject2).hasNext())
    {
      Object localObject3 = t;
      localObject2 = a;
      if (localObject3 != null)
      {
        bool = r.r;
      }
      else
      {
        localObject3 = a;
        if (localObject3 != null) {
          bool = true ^ ((Activity)localObject3).isChangingConfigurations();
        }
      }
      if (bool)
      {
        localObject3 = c.values().iterator();
        while (((Iterator)localObject3).hasNext())
        {
          Iterator localIterator = nextmSharedElementSourceNames.iterator();
          while (localIterator.hasNext())
          {
            String str = (String)localIterator.next();
            Object localObject4 = r;
            localObject4.getClass();
            if (Log.isLoggable("FragmentManager", 3))
            {
              localObject5 = new StringBuilder("Clearing non-config state for saved state of Fragment ");
              ((StringBuilder)localObject5).append(str);
              Log.d("FragmentManager", ((StringBuilder)localObject5).toString());
            }
            Object localObject5 = a;
            Type localType = (Type)((HashMap)localObject5).get(str);
            if (localType != null)
            {
              localType.d();
              ((HashMap)localObject5).remove(str);
            }
            localObject4 = c;
            localObject5 = (PieChart)((HashMap)localObject4).get(str);
            if (localObject5 != null)
            {
              ((PieChart)localObject5).a();
              ((HashMap)localObject4).remove(str);
            }
          }
        }
      }
      ((h)localObject1).a(-1);
      localObject2 = t;
      if (localObject2 != null) {
        k.removeOnTrimMemoryListener(n);
      }
      localObject2 = t;
      if (localObject2 != null) {
        k.removeOnConfigurationChangedListener(k);
      }
      localObject2 = t;
      if (localObject2 != null) {
        k.removeOnMultiWindowModeChangedListener(v);
      }
      localObject2 = t;
      if (localObject2 != null) {
        k.removeOnPictureInPictureModeChangedListener(u);
      }
      localObject2 = t;
      if (localObject2 != null) {
        k.removeMenuProvider(p);
      }
      t = null;
      f = null;
      if (B != null)
      {
        localObject2 = h.a.iterator();
        while (((Iterator)localObject2).hasNext()) {
          ((Request)((Iterator)localObject2).next()).cancel();
        }
        B = null;
      }
      localObject2 = E;
      if (localObject2 != null)
      {
        b.a(a);
        localObject2 = y;
        b.a(a);
        localObject1 = A;
        b.a(a);
      }
      mFragmentLifecycleRegistry.d(Handle.ON_DESTROY);
      return;
    }
    ((f)((Iterator)localObject2).next()).e();
    throw new NullPointerException("Null throw statement replaced by Soot");
  }
  
  public boolean onMenuItemSelected(int paramInt, MenuItem paramMenuItem)
  {
    if (super.onMenuItemSelected(paramInt, paramMenuItem)) {
      return true;
    }
    if (paramInt == 6)
    {
      paramMenuItem = mFragments.mFragments.d;
      if (x < 1) {
        return false;
      }
      paramMenuItem = a.get().iterator();
      while (paramMenuItem.hasNext()) {
        if (paramMenuItem.next() != null) {
          throw new ClassCastException();
        }
      }
    }
    return false;
  }
  
  public void onPause()
  {
    super.onPause();
    mResumed = false;
    mFragments.mFragments.d.a(5);
    mFragmentLifecycleRegistry.d(Handle.ON_PAUSE);
  }
  
  public void onPostResume()
  {
    super.onPostResume();
    onResumeFragments();
  }
  
  public void onRequestPermissionsResult(int paramInt, String[] paramArrayOfString, int[] paramArrayOfInt)
  {
    mFragments.d();
    super.onRequestPermissionsResult(paramInt, paramArrayOfString, paramArrayOfInt);
  }
  
  public void onResume()
  {
    mFragments.d();
    super.onResume();
    mResumed = true;
    mFragments.mFragments.d.a(true);
  }
  
  public void onResumeFragments()
  {
    mFragmentLifecycleRegistry.d(Handle.ON_RESUME);
    i localI = mFragments.mFragments.d;
    d = false;
    mStopped = false;
    r.getClass();
    localI.a(7);
  }
  
  public void onStart()
  {
    mFragments.d();
    super.onStart();
    mStopped = false;
    if (!mCreated)
    {
      mCreated = true;
      localI = mFragments.mFragments.d;
      d = false;
      mStopped = false;
      r.getClass();
      localI.a(4);
    }
    mFragments.mFragments.d.a(true);
    mFragmentLifecycleRegistry.d(Handle.ON_START);
    i localI = mFragments.mFragments.d;
    d = false;
    mStopped = false;
    r.getClass();
    localI.a(5);
  }
  
  public void onStateNotSaved()
  {
    mFragments.d();
  }
  
  public void onStop()
  {
    super.onStop();
    mStopped = true;
    markFragmentsCreated();
    i localI = mFragments.mFragments.d;
    mStopped = true;
    r.getClass();
    localI.a(4);
    mFragmentLifecycleRegistry.d(Handle.ON_STOP);
  }
  
  public void setEnterSharedElementCallback(ActivityCompat21.SharedElementCallback21 paramSharedElementCallback21)
  {
    setEnterSharedElementCallback(null);
  }
  
  public void setExitSharedElementCallback(ActivityCompat21.SharedElementCallback21 paramSharedElementCallback21)
  {
    setExitSharedElementCallback(null);
  }
  
  public void startActivityFromFragment(Fragment paramFragment, Intent paramIntent, int paramInt)
  {
    startActivityFromFragment(paramFragment, paramIntent, paramInt, null);
  }
  
  public void startActivityFromFragment(Fragment paramFragment, Intent paramIntent, int paramInt, Bundle paramBundle)
  {
    if (paramInt == -1)
    {
      startActivityForResult(paramIntent, -1, paramBundle);
      return;
    }
    throw new NullPointerException("Null throw statement replaced by Soot");
  }
  
  public void startIntentSenderFromFragment(Fragment paramFragment, IntentSender paramIntentSender, int paramInt1, Intent paramIntent, int paramInt2, int paramInt3, int paramInt4, Bundle paramBundle)
  {
    if (paramInt1 == -1)
    {
      startIntentSenderForResult(paramIntentSender, paramInt1, paramIntent, paramInt2, paramInt3, paramInt4, paramBundle);
      return;
    }
    throw new NullPointerException("Null throw statement replaced by Soot");
  }
  
  public void supportFinishAfterTransition()
  {
    finishAfterTransition();
  }
  
  public void supportPostponeEnterTransition()
  {
    postponeEnterTransition();
  }
  
  public void supportStartPostponedEnterTransition()
  {
    startPostponedEnterTransition();
  }
  
  public final void validateRequestPermissionsRequestCode(int paramInt) {}
}
