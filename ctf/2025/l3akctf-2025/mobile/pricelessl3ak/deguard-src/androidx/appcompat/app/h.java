package androidx.appcompat.app;

import android.content.Context;
import android.content.DialogInterface.OnClickListener;
import android.graphics.drawable.Drawable;
import android.view.ContextThemeWrapper;
import android.view.LayoutInflater;
import android.view.View;
import menu.g;

public final class h
{
  public Drawable a;
  public final LayoutInflater b;
  public boolean c;
  public CharSequence d;
  public final ContextThemeWrapper e;
  public View p;
  public g r;
  public Object t;
  public DialogInterface.OnClickListener u;
  public int x = -1;
  
  public h(ContextThemeWrapper paramContextThemeWrapper)
  {
    e = paramContextThemeWrapper;
    b = ((LayoutInflater)paramContextThemeWrapper.getSystemService("layout_inflater"));
  }
}
