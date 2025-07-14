package app;

import a.ClassWriter;
import a.l;
import activities.c;
import android.app.AlertDialog.Builder;
import android.content.BroadcastReceiver;
import android.content.ClipData;
import android.content.ClipDescription;
import android.net.Uri;
import android.os.Build.VERSION;
import android.os.Bundle;
import android.os.Handler;
import android.os.SystemClock;
import android.util.Log;
import android.view.ContentInfo;
import android.view.ContentInfo.Builder;
import android.view.MenuItem;
import android.view.Window.Callback;
import android.widget.EditText;
import android.widget.TextView;
import androidx.appcompat.app.ToolbarActionBar;
import androidx.appcompat.app.WindowCallbackWrapper;
import androidx.appcompat.widget.ActionMenuView;
import androidx.appcompat.widget.Product;
import androidx.appcompat.widget.Toolbar;
import androidx.profileinstaller.ProfileInstallReceiver;
import asm.ModernAsyncTask.1;
import asm.NumberPicker.BeginSoftInputOnLongPressCommand;
import collision.Sweep;
import common.MethodWriter;
import core.Menu;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.concurrent.LinkedBlockingDeque;
import java.util.concurrent.ThreadFactory;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicReference;
import menu.a;
import menu.f.a;
import menu.h;
import menu.p;
import menu.w;
import network.ByteVector;
import no.l3akctf.pricelessl3ak.h1832fla12;

public class f
  implements g, i, asm.Item, Menu, menu.Object, f.a, Product, androidx.appcompat.widget.g
{
  public Object a;
  
  public f(int paramInt)
  {
    a = new AtomicReference(Sweep.c);
  }
  
  public f(ClipData paramClipData, int paramInt)
  {
    a = d.g(paramClipData, paramInt);
  }
  
  public f(android.content.Context paramContext)
  {
    a = paramContext.getApplicationContext();
  }
  
  public f(Uri paramUri1, ClipDescription paramClipDescription, Uri paramUri2)
  {
    if (Build.VERSION.SDK_INT >= 25)
    {
      a = new MethodWriter(paramUri1, paramClipDescription, paramUri2);
      return;
    }
    a = new ClassWriter(paramUri1, paramClipDescription, paramUri2);
  }
  
  public f(ContentInfo paramContentInfo)
  {
    paramContentInfo.getClass();
    a = d.getInstance(paramContentInfo);
  }
  
  public f(EditText paramEditText) {}
  
  public f(TextView paramTextView)
  {
    a = new ByteVector(paramTextView);
  }
  
  public void a()
  {
    if (Thread.currentThread().getId() == c.h) {
      return;
    }
    ((collision.b)((AtomicReference)a).get()).getClass();
  }
  
  public void a(Uri paramUri)
  {
    d.setId((ContentInfo.Builder)a, paramUri);
  }
  
  public void a(drupal.Context paramContext)
  {
    Object localObject = new ModernAsyncTask.1("EmojiCompatInitializer");
    localObject = new ThreadPoolExecutor(0, 1, 15L, TimeUnit.SECONDS, new LinkedBlockingDeque(), (ThreadFactory)localObject);
    ((ThreadPoolExecutor)localObject).allowCoreThreadTimeOut(true);
    ((ThreadPoolExecutor)localObject).execute(new NumberPicker.BeginSoftInputOnLongPressCommand(this, paramContext, (ThreadPoolExecutor)localObject));
  }
  
  public void a(String paramString)
  {
    switch (type)
    {
    default: 
      localObject = (h1832fla12)a).c;
      new AlertDialog.Builder((android.content.Context)localObject).setTitle("Challenge").setMessage(paramString).setPositiveButton("Try Again", new l((h1832fla12)localObject, 1)).setCancelable(false).show();
      return;
    }
    Object localObject = new StringBuilder("Error: ");
    ((StringBuilder)localObject).append(paramString);
    paramString = ((StringBuilder)localObject).toString();
    ((f)a).a(paramString);
  }
  
  public void a(menu.f paramF, h paramH)
  {
    w localW = (w)a;
    Object localObject = f;
    menu.b localB = null;
    ((Handler)localObject).removeCallbacksAndMessages(null);
    localObject = c;
    int j = ((ArrayList)localObject).size();
    int i = 0;
    while (i < j)
    {
      if (paramF == getc) {
        break label75;
      }
      i += 1;
    }
    i = -1;
    label75:
    if (i == -1) {
      return;
    }
    i += 1;
    if (i < ((ArrayList)localObject).size()) {
      localB = (menu.b)((ArrayList)localObject).get(i);
    }
    paramH = new a(this, localB, paramH, paramF);
    long l = SystemClock.uptimeMillis();
    f.postAtTime(paramH, paramF, l + 200L);
  }
  
  public void a(menu.f paramF, boolean paramBoolean)
  {
    if ((paramF instanceof p)) {
      d.q().a(false);
    }
    menu.Object localObject = a).d;
    if (localObject != null) {
      localObject.a(paramF, paramBoolean);
    }
  }
  
  public boolean a(menu.f paramF)
  {
    Object localObject = (androidx.appcompat.widget.b)a;
    if (paramF == c) {
      return false;
    }
    e.getClass();
    localObject.getClass();
    localObject = d;
    if (localObject != null) {
      return ((menu.Object)localObject).a(paramF);
    }
    return false;
  }
  
  public void add(int paramInt, Serializable paramSerializable)
  {
    switch (paramInt)
    {
    default: 
      break;
    case 9: 
      str = "";
      break;
    case 11: 
      str = "RESULT_DELETE_SKIP_FILE_SUCCESS";
      break;
    case 10: 
      str = "RESULT_INSTALL_SKIP_FILE_SUCCESS";
      break;
    case 8: 
      str = "RESULT_PARSE_EXCEPTION";
      break;
    case 7: 
      str = "RESULT_IO_EXCEPTION";
      break;
    case 6: 
      str = "RESULT_BASELINE_PROFILE_NOT_FOUND";
      break;
    case 5: 
      str = "RESULT_DESIRED_FORMAT_UNSUPPORTED";
      break;
    case 4: 
      str = "RESULT_NOT_WRITABLE";
      break;
    case 3: 
      str = "RESULT_UNSUPPORTED_ART_VERSION";
      break;
    case 2: 
      str = "RESULT_ALREADY_INSTALLED";
      break;
    }
    String str = "RESULT_INSTALL_SUCCESS";
    if ((paramInt != 6) && (paramInt != 7) && (paramInt != 8)) {
      Log.d("ProfileInstaller", str);
    } else {
      Log.e("ProfileInstaller", str, (Throwable)paramSerializable);
    }
    ((ProfileInstallReceiver)a).setResultCode(paramInt);
  }
  
  public Item b()
  {
    return new Item(new f(d.getResponse((ContentInfo.Builder)a)));
  }
  
  public void b(menu.f paramF, h paramH)
  {
    a).f.removeCallbacksAndMessages(paramF);
  }
  
  public int c()
  {
    return d.c((ContentInfo)a);
  }
  
  public void clear()
  {
    Log.d("ProfileInstaller", "DIAGNOSTIC_PROFILE_IS_COMPRESSED");
  }
  
  public void clear(int paramInt) {}
  
  public void d(int paramInt)
  {
    d.c((ContentInfo.Builder)a, paramInt);
  }
  
  public void d(Bundle paramBundle)
  {
    d.c((ContentInfo.Builder)a, paramBundle);
  }
  
  public void evaluate(int paramInt) {}
  
  public void evaluate(int paramInt, float paramFloat) {}
  
  public ContentInfo f()
  {
    return (ContentInfo)a;
  }
  
  public ClipData m()
  {
    return d.getCallback((ContentInfo)a);
  }
  
  public int n()
  {
    return d.getFlags((ContentInfo)a);
  }
  
  public boolean onMenuItemSelected(menu.f paramF, MenuItem paramMenuItem)
  {
    paramF = a).mCallback;
    if (paramF != null)
    {
      paramF = this$0;
      this$0.a();
      paramF = mOnMenuItemClickListener;
      boolean bool;
      if (paramF != null) {
        bool = this$0.this$0.mWrapped.onMenuItemSelected(0, paramMenuItem);
      } else {
        bool = false;
      }
      if (bool) {
        return true;
      }
    }
    return false;
  }
  
  public void onMenuModeChange(menu.f paramF)
  {
    f.a localA = a).mMenuBuilderCallback;
    if (localA != null) {
      localA.onMenuModeChange(paramF);
    }
  }
  
  public String toString()
  {
    switch (type)
    {
    default: 
      return super.toString();
    }
    StringBuilder localStringBuilder = new StringBuilder("ContentInfoCompat{");
    localStringBuilder.append((ContentInfo)a);
    localStringBuilder.append("}");
    return localStringBuilder.toString();
  }
}
