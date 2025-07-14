package androidx.fragment.asm;

import android.os.Handler;
import androidx.appcompat.app.AppCompatActivity;
import androidx.lifecycle.ClassWriter;
import androidx.lifecycle.List;
import androidx.lifecycle.PieChart;
import androidx.lifecycle.x;
import tts.h;
import ui.AbstractGalleryActivity;

public final class c
  implements List, x, tts.c
{
  public final FragmentActivity a;
  public final i d;
  public final Handler h;
  
  public c(AppCompatActivity paramAppCompatActivity) {}
  
  public final ClassWriter getLifecycle()
  {
    return k.mFragmentLifecycleRegistry;
  }
  
  public final h getSavedStateRegistry()
  {
    return k.getSavedStateRegistry();
  }
  
  public final PieChart getViewModelStore()
  {
    return k.getViewModelStore();
  }
}
