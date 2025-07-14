package androidx.appcompat.widget;

import Console.R.styleable;
import android.content.res.TypedArray;
import android.graphics.Bitmap;
import android.graphics.BitmapShader;
import android.graphics.Paint;
import android.graphics.Shader;
import android.graphics.Shader.TileMode;
import android.graphics.drawable.AnimationDrawable;
import android.graphics.drawable.BitmapDrawable;
import android.graphics.drawable.ClipDrawable;
import android.graphics.drawable.LayerDrawable;
import android.graphics.drawable.ShapeDrawable;
import android.graphics.drawable.shapes.RoundRectShape;
import android.text.method.KeyListener;
import android.text.method.NumberKeyListener;
import android.util.AttributeSet;
import android.view.View;
import android.view.inputmethod.EditorInfo;
import android.view.inputmethod.InputConnection;
import android.widget.AbsSeekBar;
import android.widget.EditText;
import android.widget.ProgressBar;
import app.f;
import home.DrawableWrapper;
import http.TCharArrayList;
import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantReadWriteLock;
import network.NumberPicker.TwoDigitFormatter;
import network.SettingsActivity.1;
import network.c;
import network.e;
import views.i;

public class Label
{
  public static final int[] a = { 16843067, 16843068 };
  public View i;
  public Object k;
  
  public Label(AbsSeekBar paramAbsSeekBar)
  {
    i = paramAbsSeekBar;
  }
  
  public Label(EditText paramEditText)
  {
    i = paramEditText;
    k = new f(paramEditText);
  }
  
  public KeyListener a(KeyListener paramKeyListener)
  {
    if (!(paramKeyListener instanceof NumberKeyListener))
    {
      ((i)k).a).getClass();
      if ((paramKeyListener instanceof e)) {
        return paramKeyListener;
      }
      if (paramKeyListener == null) {
        return null;
      }
      if ((paramKeyListener instanceof NumberKeyListener)) {
        return paramKeyListener;
      }
      return new e(paramKeyListener);
    }
    return paramKeyListener;
  }
  
  public c a(InputConnection paramInputConnection, EditorInfo paramEditorInfo)
  {
    Object localObject = (f)k;
    if (paramInputConnection == null)
    {
      localObject.getClass();
      paramInputConnection = null;
    }
    else
    {
      localObject = (i)a;
      localObject.getClass();
      if (!(paramInputConnection instanceof c)) {
        paramInputConnection = new c((EditText)a, paramInputConnection, paramEditorInfo);
      }
    }
    return (c)paramInputConnection;
  }
  
  public void a(boolean paramBoolean)
  {
    SettingsActivity.1 local1 = (SettingsActivity.1)k).a).b;
    if (c != paramBoolean)
    {
      if (a != null)
      {
        asm.ClassWriter localClassWriter = asm.ClassWriter.a();
        NumberPicker.TwoDigitFormatter localTwoDigitFormatter = a;
        localClassWriter.getClass();
        drupal.Context.get(localTwoDigitFormatter, "initCallback cannot be null");
        ReentrantReadWriteLock localReentrantReadWriteLock = d;
        localReentrantReadWriteLock.writeLock().lock();
        try
        {
          f.remove(localTwoDigitFormatter);
          localReentrantReadWriteLock.writeLock().unlock();
        }
        catch (Throwable localThrowable)
        {
          localReentrantReadWriteLock.writeLock().unlock();
          throw localThrowable;
        }
      }
      c = paramBoolean;
      if (paramBoolean)
      {
        int j = asm.ClassWriter.a().get();
        SettingsActivity.1.set(this$0, j);
      }
    }
  }
  
  public void loadFromAttributes(AttributeSet paramAttributeSet, int paramInt)
  {
    switch (e)
    {
    default: 
      paramAttributeSet = ((EditText)i).getContext().obtainStyledAttributes(paramAttributeSet, R.styleable.a, paramInt, 0);
      boolean bool1;
      try
      {
        boolean bool2 = paramAttributeSet.hasValue(14);
        bool1 = true;
        if (bool2) {
          bool1 = paramAttributeSet.getBoolean(14, true);
        }
      }
      catch (Throwable localThrowable)
      {
        break label91;
      }
      paramAttributeSet.recycle();
      a(bool1);
      return;
      label91:
      paramAttributeSet.recycle();
      throw localThrowable;
    }
    AbsSeekBar localAbsSeekBar = (AbsSeekBar)i;
    a.ClassWriter localClassWriter = a.ClassWriter.obtainStyledAttributes(localAbsSeekBar.getContext(), paramAttributeSet, a, paramInt);
    Object localObject = localClassWriter.get(0);
    paramAttributeSet = (AttributeSet)localObject;
    if (localObject != null)
    {
      if ((localObject instanceof AnimationDrawable))
      {
        localObject = (AnimationDrawable)localObject;
        int j = ((AnimationDrawable)localObject).getNumberOfFrames();
        paramAttributeSet = new AnimationDrawable();
        paramAttributeSet.setOneShot(((AnimationDrawable)localObject).isOneShot());
        paramInt = 0;
        while (paramInt < j)
        {
          android.graphics.drawable.Drawable localDrawable = tileify(((AnimationDrawable)localObject).getFrame(paramInt), true);
          localDrawable.setLevel(10000);
          paramAttributeSet.addFrame(localDrawable, ((AnimationDrawable)localObject).getDuration(paramInt));
          paramInt += 1;
        }
        paramAttributeSet.setLevel(10000);
      }
      localAbsSeekBar.setIndeterminateDrawable(paramAttributeSet);
    }
    paramAttributeSet = localClassWriter.get(1);
    if (paramAttributeSet != null) {
      localAbsSeekBar.setProgressDrawable(tileify(paramAttributeSet, false));
    }
    localClassWriter.recycle();
  }
  
  public android.graphics.drawable.Drawable tileify(android.graphics.drawable.Drawable paramDrawable, boolean paramBoolean)
  {
    if ((paramDrawable instanceof home.Drawable))
    {
      ((DrawableWrapper)paramDrawable).getClass();
      return paramDrawable;
    }
    Object localObject1;
    Object localObject2;
    if ((paramDrawable instanceof LayerDrawable))
    {
      paramDrawable = (LayerDrawable)paramDrawable;
      int n = paramDrawable.getNumberOfLayers();
      localObject1 = new android.graphics.drawable.Drawable[n];
      int m = 0;
      int j = 0;
      while (j < n)
      {
        int i1 = paramDrawable.getId(j);
        localObject2 = paramDrawable.getDrawable(j);
        if ((i1 != 16908301) && (i1 != 16908303)) {
          paramBoolean = false;
        } else {
          paramBoolean = true;
        }
        localObject1[j] = tileify((android.graphics.drawable.Drawable)localObject2, paramBoolean);
        j += 1;
      }
      localObject1 = new LayerDrawable((android.graphics.drawable.Drawable[])localObject1);
      j = m;
      while (j < n)
      {
        ((LayerDrawable)localObject1).setId(j, paramDrawable.getId(j));
        ((LayerDrawable)localObject1).setLayerGravity(j, paramDrawable.getLayerGravity(j));
        ((LayerDrawable)localObject1).setLayerWidth(j, paramDrawable.getLayerWidth(j));
        ((LayerDrawable)localObject1).setLayerHeight(j, paramDrawable.getLayerHeight(j));
        ((LayerDrawable)localObject1).setLayerInsetLeft(j, paramDrawable.getLayerInsetLeft(j));
        ((LayerDrawable)localObject1).setLayerInsetRight(j, paramDrawable.getLayerInsetRight(j));
        ((LayerDrawable)localObject1).setLayerInsetTop(j, paramDrawable.getLayerInsetTop(j));
        ((LayerDrawable)localObject1).setLayerInsetBottom(j, paramDrawable.getLayerInsetBottom(j));
        ((LayerDrawable)localObject1).setLayerInsetStart(j, paramDrawable.getLayerInsetStart(j));
        ((LayerDrawable)localObject1).setLayerInsetEnd(j, paramDrawable.getLayerInsetEnd(j));
        j += 1;
      }
      return localObject1;
    }
    if ((paramDrawable instanceof BitmapDrawable))
    {
      paramDrawable = (BitmapDrawable)paramDrawable;
      localObject2 = paramDrawable.getBitmap();
      if ((Bitmap)k == null) {
        k = localObject2;
      }
      localObject1 = new ShapeDrawable(new RoundRectShape(new float[] { 5.0F, 5.0F, 5.0F, 5.0F, 5.0F, 5.0F, 5.0F, 5.0F }, null, null));
      localObject2 = new BitmapShader((Bitmap)localObject2, Shader.TileMode.REPEAT, Shader.TileMode.CLAMP);
      ((ShapeDrawable)localObject1).getPaint().setShader((Shader)localObject2);
      ((ShapeDrawable)localObject1).getPaint().setColorFilter(paramDrawable.getPaint().getColorFilter());
      if (paramBoolean) {
        return new ClipDrawable((android.graphics.drawable.Drawable)localObject1, 3, 1);
      }
    }
    else
    {
      return paramDrawable;
    }
    return localObject1;
  }
}
