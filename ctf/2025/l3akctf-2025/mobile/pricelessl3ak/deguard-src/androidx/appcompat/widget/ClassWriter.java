package androidx.appcompat.widget;

import Console.R.styleable;
import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.content.res.Resources.NotFoundException;
import android.content.res.TypedArray;
import android.graphics.PorterDuff.Mode;
import android.graphics.Typeface;
import android.graphics.drawable.Drawable;
import android.os.Build.VERSION;
import android.text.TextUtils;
import android.text.method.PasswordTransformationMethod;
import android.util.AttributeSet;
import android.util.DisplayMetrics;
import android.util.TypedValue;
import android.view.View;
import android.view.inputmethod.EditorInfo;
import android.view.inputmethod.InputConnection;
import android.widget.TextView;
import app.Vector;
import app.ViewCompat;
import common.Buffer;
import common.Share;
import java.lang.ref.WeakReference;
import java.util.Arrays;

public final class ClassWriter
{
  public final TextView a;
  public int b = -1;
  public final f d;
  public int e = 0;
  public TintInfo g;
  public TintInfo mBackgroundTint;
  public TintInfo n;
  public boolean p;
  public TintInfo r;
  public Typeface t;
  public TintInfo v;
  public TintInfo x;
  public TintInfo y;
  
  public ClassWriter(TextView paramTextView)
  {
    a = paramTextView;
    d = new f(paramTextView);
  }
  
  public static TintInfo get(android.content.Context paramContext, AppCompatDrawableManager paramAppCompatDrawableManager, int paramInt)
  {
    throw new Runtime("d2j fail translate: java.lang.RuntimeException: \n\tat com.googlecode.dex2jar.ir.ts.NewTransformer.transform(NewTransformer.java:134)\n\tat com.googlecode.d2j.dex.Dex2jar$2.optimize(Dex2jar.java:148)\n\tat com.googlecode.d2j.dex.Dex2Asm.convertCode(Dex2Asm.java:414)\n\tat com.googlecode.d2j.dex.ExDex2Asm.convertCode(ExDex2Asm.java:42)\n\tat com.googlecode.d2j.dex.Dex2jar$2.convertCode(Dex2jar.java:128)\n\tat com.googlecode.d2j.dex.Dex2Asm.convertMethod(Dex2Asm.java:509)\n\tat com.googlecode.d2j.dex.Dex2Asm.convertClass(Dex2Asm.java:406)\n\tat com.googlecode.d2j.dex.Dex2Asm.convertDex(Dex2Asm.java:422)\n\tat com.googlecode.d2j.dex.Dex2jar.doTranslate(Dex2jar.java:172)\n\tat com.googlecode.d2j.dex.Dex2jar.to(Dex2jar.java:272)\n\tat com.googlecode.dex2jar.tools.Dex2jarCmd.doCommandLine(Dex2jarCmd.java:108)\n\tat com.googlecode.dex2jar.tools.BaseCmd.doMain(BaseCmd.java:288)\n\tat com.googlecode.dex2jar.tools.Dex2jarCmd.main(Dex2jarCmd.java:32)\n");
  }
  
  public static void parse(EditorInfo paramEditorInfo, InputConnection paramInputConnection, TextView paramTextView)
  {
    int i = Build.VERSION.SDK_INT;
    if ((i < 30) && (paramInputConnection != null))
    {
      paramInputConnection = paramTextView.getText();
      if (i >= 30)
      {
        Share.setDescription(paramEditorInfo, paramInputConnection);
        return;
      }
      paramInputConnection.getClass();
      if (i >= 30)
      {
        Share.setDescription(paramEditorInfo, paramInputConnection);
        return;
      }
      i = initialSelStart;
      int j = initialSelEnd;
      int k;
      if (i > j) {
        k = j;
      } else {
        k = i;
      }
      if (i <= j) {
        i = j;
      }
      j = paramInputConnection.length();
      if ((k >= 0) && (i <= j))
      {
        int m = inputType & 0xFFF;
        if ((m != 129) && (m != 225) && (m != 18))
        {
          if (j <= 2048)
          {
            Buffer.write(paramEditorInfo, paramInputConnection, k, i);
            return;
          }
          int i2 = i - k;
          if (i2 > 1024) {
            j = 0;
          } else {
            j = i2;
          }
          m = paramInputConnection.length();
          int i1 = 2048 - j;
          int i3 = Math.min(m - i, i1 - Math.min(k, (int)(i1 * 0.8D)));
          m = i3;
          int i4 = Math.min(k, i1 - i3);
          i1 = i4;
          int i5 = k - i4;
          k = i5;
          if (Character.isLowSurrogate(paramInputConnection.charAt(i5)))
          {
            k = i5 + 1;
            i1 = i4 - 1;
          }
          if (Character.isHighSurrogate(paramInputConnection.charAt(i + i3 - 1))) {
            m = i3 - 1;
          }
          i3 = i1 + j;
          if (j != i2) {
            paramInputConnection = TextUtils.concat(new CharSequence[] { paramInputConnection.subSequence(k, k + i1), paramInputConnection.subSequence(i, m + i) });
          } else {
            paramInputConnection = paramInputConnection.subSequence(k, i3 + m + k);
          }
          Buffer.write(paramEditorInfo, paramInputConnection, i1, i3);
          return;
        }
        Buffer.write(paramEditorInfo, null, 0, 0);
        return;
      }
      Buffer.write(paramEditorInfo, null, 0, 0);
    }
  }
  
  public final void a()
  {
    Object localObject2 = n;
    Object localObject1 = a;
    if ((localObject2 != null) || (r != null) || (g != null) || (y != null))
    {
      localObject2 = ((TextView)localObject1).getCompoundDrawables();
      a(localObject2[0], n);
      a(localObject2[1], r);
      a(localObject2[2], g);
      a(localObject2[3], y);
    }
    if ((v != null) || (x != null))
    {
      localObject1 = ((TextView)localObject1).getCompoundDrawablesRelative();
      a(localObject1[0], v);
      a(localObject1[2], x);
    }
  }
  
  public final void a(int paramInt)
  {
    Object localObject = d;
    if (((f)localObject).d()) {
      if (paramInt != 0)
      {
        if (paramInt == 1)
        {
          DisplayMetrics localDisplayMetrics = j.getResources().getDisplayMetrics();
          ((f)localObject).a(TypedValue.applyDimension(2, 12.0F, localDisplayMetrics), TypedValue.applyDimension(2, 112.0F, localDisplayMetrics), 1.0F);
          if (((f)localObject).a()) {
            ((f)localObject).draw();
          }
        }
        else
        {
          localObject = new StringBuilder("Unknown auto-size text type: ");
          ((StringBuilder)localObject).append(paramInt);
          throw new IllegalArgumentException(((StringBuilder)localObject).toString());
        }
      }
      else
      {
        b = 0;
        n = -1.0F;
        x = -1.0F;
        y = -1.0F;
        e = new int[0];
        d = false;
      }
    }
  }
  
  public final void a(int paramInt1, int paramInt2, int paramInt3, int paramInt4)
  {
    f localF = d;
    if (localF.d())
    {
      DisplayMetrics localDisplayMetrics = j.getResources().getDisplayMetrics();
      localF.a(TypedValue.applyDimension(paramInt4, paramInt1, localDisplayMetrics), TypedValue.applyDimension(paramInt4, paramInt2, localDisplayMetrics), TypedValue.applyDimension(paramInt4, paramInt3, localDisplayMetrics));
      if (localF.a()) {
        localF.draw();
      }
    }
  }
  
  public final void a(Drawable paramDrawable, TintInfo paramTintInfo)
  {
    if ((paramDrawable != null) && (paramTintInfo != null)) {
      AppCompatDrawableManager.tintDrawable(paramDrawable, paramTintInfo, a.getDrawableState());
    }
  }
  
  public final void a(int[] paramArrayOfInt, int paramInt)
  {
    f localF = d;
    if (localF.d())
    {
      int j = paramArrayOfInt.length;
      int i = 0;
      if (j > 0)
      {
        int[] arrayOfInt = new int[j];
        Object localObject;
        if (paramInt == 0)
        {
          localObject = Arrays.copyOf(paramArrayOfInt, j);
        }
        else
        {
          DisplayMetrics localDisplayMetrics = j.getResources().getDisplayMetrics();
          for (;;)
          {
            localObject = arrayOfInt;
            if (i >= j) {
              break;
            }
            arrayOfInt[i] = Math.round(TypedValue.applyDimension(paramInt, paramArrayOfInt[i], localDisplayMetrics));
            i += 1;
          }
        }
        e = f.sort((int[])localObject);
        if (!localF.b())
        {
          localObject = new StringBuilder("None of the preset sizes is valid: ");
          ((StringBuilder)localObject).append(Arrays.toString(paramArrayOfInt));
          throw new IllegalArgumentException(((StringBuilder)localObject).toString());
        }
      }
      else
      {
        h = false;
      }
      if (localF.a()) {
        localF.draw();
      }
    }
  }
  
  public final PorterDuff.Mode getDay()
  {
    TintInfo localTintInfo = mBackgroundTint;
    if (localTintInfo != null) {
      return mTintMode;
    }
    return null;
  }
  
  public final ColorStateList getFormattedDate()
  {
    TintInfo localTintInfo = mBackgroundTint;
    if (localTintInfo != null) {
      return mTintList;
    }
    return null;
  }
  
  public final void init(android.content.Context paramContext, int paramInt)
  {
    TypedArray localTypedArray = paramContext.obtainStyledAttributes(paramInt, R.styleable.i);
    a.ClassWriter localClassWriter = new a.ClassWriter(paramContext, localTypedArray);
    boolean bool = localTypedArray.hasValue(14);
    TextView localTextView = a;
    if (bool) {
      localTextView.setAllCaps(localTypedArray.getBoolean(14, false));
    }
    paramInt = Build.VERSION.SDK_INT;
    if ((localTypedArray.hasValue(0)) && (localTypedArray.getDimensionPixelSize(0, -1) == 0)) {
      localTextView.setTextSize(0, 0.0F);
    }
    init(paramContext, localClassWriter);
    if ((paramInt >= 26) && (localTypedArray.hasValue(13)))
    {
      paramContext = localTypedArray.getString(13);
      if (paramContext != null) {
        Log.setText(localTextView, paramContext);
      }
    }
    localClassWriter.recycle();
    paramContext = t;
    if (paramContext != null) {
      localTextView.setTypeface(paramContext, e);
    }
  }
  
  public final void init(android.content.Context paramContext, a.ClassWriter paramClassWriter)
  {
    int i = e;
    TypedArray localTypedArray = (TypedArray)b;
    e = localTypedArray.getInt(2, i);
    int j = Build.VERSION.SDK_INT;
    if (j >= 28)
    {
      i = localTypedArray.getInt(11, -1);
      b = i;
      if (i != -1) {
        e &= 0x2;
      }
    }
    i = 10;
    boolean bool1 = localTypedArray.hasValue(10);
    boolean bool2 = false;
    if ((!bool1) && (!localTypedArray.hasValue(12)))
    {
      if (localTypedArray.hasValue(1))
      {
        p = false;
        i = localTypedArray.getInt(1, 1);
        if (i != 1)
        {
          if (i != 2)
          {
            if (i != 3) {
              return;
            }
            t = Typeface.MONOSPACE;
            return;
          }
          t = Typeface.SERIF;
          return;
        }
        t = Typeface.SANS_SERIF;
      }
    }
    else
    {
      t = null;
      if (localTypedArray.hasValue(12)) {
        i = 12;
      }
      int k = b;
      int m = e;
      if (!paramContext.isRestricted())
      {
        paramContext = new Type(this, k, m, new WeakReference(a));
        k = e;
      }
      try
      {
        paramContext = paramClassWriter.get(i, k, paramContext);
        if (paramContext != null) {
          if ((j >= 28) && (b != -1))
          {
            paramContext = Typeface.create(paramContext, 0);
            j = b;
            if ((e & 0x2) != 0) {
              bool1 = true;
            } else {
              bool1 = false;
            }
            paramContext = AtomicBoolean.get(paramContext, j, bool1);
            t = paramContext;
          }
          else
          {
            t = paramContext;
          }
        }
        if (t == null) {
          bool1 = true;
        } else {
          bool1 = false;
        }
        p = bool1;
      }
      catch (UnsupportedOperationException paramContext)
      {
        for (;;) {}
      }
      catch (Resources.NotFoundException paramContext)
      {
        for (;;) {}
      }
      if (t == null)
      {
        paramContext = localTypedArray.getString(i);
        if (paramContext != null)
        {
          if ((Build.VERSION.SDK_INT >= 28) && (b != -1))
          {
            paramContext = Typeface.create(paramContext, 0);
            i = b;
            bool1 = bool2;
            if ((e & 0x2) != 0) {
              bool1 = true;
            }
            t = AtomicBoolean.get(paramContext, i, bool1);
            return;
          }
          t = Typeface.create(paramContext, e);
          return;
        }
      }
    }
  }
  
  public final void init(ColorStateList paramColorStateList)
  {
    throw new Runtime("d2j fail translate: java.lang.RuntimeException: \n\tat com.googlecode.dex2jar.ir.ts.NewTransformer.transform(NewTransformer.java:134)\n\tat com.googlecode.d2j.dex.Dex2jar$2.optimize(Dex2jar.java:148)\n\tat com.googlecode.d2j.dex.Dex2Asm.convertCode(Dex2Asm.java:414)\n\tat com.googlecode.d2j.dex.ExDex2Asm.convertCode(ExDex2Asm.java:42)\n\tat com.googlecode.d2j.dex.Dex2jar$2.convertCode(Dex2jar.java:128)\n\tat com.googlecode.d2j.dex.Dex2Asm.convertMethod(Dex2Asm.java:509)\n\tat com.googlecode.d2j.dex.Dex2Asm.convertClass(Dex2Asm.java:406)\n\tat com.googlecode.d2j.dex.Dex2Asm.convertDex(Dex2Asm.java:422)\n\tat com.googlecode.d2j.dex.Dex2jar.doTranslate(Dex2jar.java:172)\n\tat com.googlecode.d2j.dex.Dex2jar.to(Dex2jar.java:272)\n\tat com.googlecode.dex2jar.tools.Dex2jarCmd.doCommandLine(Dex2jarCmd.java:108)\n\tat com.googlecode.dex2jar.tools.BaseCmd.doMain(BaseCmd.java:288)\n\tat com.googlecode.dex2jar.tools.Dex2jarCmd.main(Dex2jarCmd.java:32)\n");
  }
  
  public final void init(PorterDuff.Mode paramMode)
  {
    throw new Runtime("d2j fail translate: java.lang.RuntimeException: \n\tat com.googlecode.dex2jar.ir.ts.NewTransformer.transform(NewTransformer.java:134)\n\tat com.googlecode.d2j.dex.Dex2jar$2.optimize(Dex2jar.java:148)\n\tat com.googlecode.d2j.dex.Dex2Asm.convertCode(Dex2Asm.java:414)\n\tat com.googlecode.d2j.dex.ExDex2Asm.convertCode(ExDex2Asm.java:42)\n\tat com.googlecode.d2j.dex.Dex2jar$2.convertCode(Dex2jar.java:128)\n\tat com.googlecode.d2j.dex.Dex2Asm.convertMethod(Dex2Asm.java:509)\n\tat com.googlecode.d2j.dex.Dex2Asm.convertClass(Dex2Asm.java:406)\n\tat com.googlecode.d2j.dex.Dex2Asm.convertDex(Dex2Asm.java:422)\n\tat com.googlecode.d2j.dex.Dex2jar.doTranslate(Dex2jar.java:172)\n\tat com.googlecode.d2j.dex.Dex2jar.to(Dex2jar.java:272)\n\tat com.googlecode.dex2jar.tools.Dex2jarCmd.doCommandLine(Dex2jarCmd.java:108)\n\tat com.googlecode.dex2jar.tools.BaseCmd.doMain(BaseCmd.java:288)\n\tat com.googlecode.dex2jar.tools.Dex2jarCmd.main(Dex2jarCmd.java:32)\n");
  }
  
  public final void init(AttributeSet paramAttributeSet, int paramInt)
  {
    TextView localTextView = a;
    android.content.Context localContext = localTextView.getContext();
    Object localObject4 = AppCompatDrawableManager.get();
    Object localObject2 = R.styleable.y;
    Object localObject1 = a.ClassWriter.obtainStyledAttributes(localContext, paramAttributeSet, (int[])localObject2, paramInt);
    ViewCompat.init(localTextView, localTextView.getContext(), (int[])localObject2, paramAttributeSet, (TypedArray)b, paramInt);
    localObject2 = (TypedArray)b;
    int i = ((TypedArray)localObject2).getResourceId(0, -1);
    if (((TypedArray)localObject2).hasValue(3)) {
      n = get(localContext, (AppCompatDrawableManager)localObject4, ((TypedArray)localObject2).getResourceId(3, 0));
    }
    if (((TypedArray)localObject2).hasValue(1)) {
      r = get(localContext, (AppCompatDrawableManager)localObject4, ((TypedArray)localObject2).getResourceId(1, 0));
    }
    if (((TypedArray)localObject2).hasValue(4)) {
      g = get(localContext, (AppCompatDrawableManager)localObject4, ((TypedArray)localObject2).getResourceId(4, 0));
    }
    if (((TypedArray)localObject2).hasValue(2)) {
      y = get(localContext, (AppCompatDrawableManager)localObject4, ((TypedArray)localObject2).getResourceId(2, 0));
    }
    if (((TypedArray)localObject2).hasValue(5)) {
      v = get(localContext, (AppCompatDrawableManager)localObject4, ((TypedArray)localObject2).getResourceId(5, 0));
    }
    if (((TypedArray)localObject2).hasValue(6)) {
      x = get(localContext, (AppCompatDrawableManager)localObject4, ((TypedArray)localObject2).getResourceId(6, 0));
    }
    ((a.ClassWriter)localObject1).recycle();
    boolean bool3 = localTextView.getTransformationMethod() instanceof PasswordTransformationMethod;
    Object localObject5 = R.styleable.i;
    boolean bool1;
    if (i != -1)
    {
      localObject3 = localContext.obtainStyledAttributes(i, (int[])localObject5);
      localObject2 = new a.ClassWriter(localContext, (TypedArray)localObject3);
      if ((!bool3) && (((TypedArray)localObject3).hasValue(14)))
      {
        bool1 = ((TypedArray)localObject3).getBoolean(14, false);
        i = 1;
      }
      else
      {
        bool1 = false;
        i = 0;
      }
      init(localContext, (a.ClassWriter)localObject2);
      j = Build.VERSION.SDK_INT;
      if (((TypedArray)localObject3).hasValue(15)) {
        localObject1 = ((TypedArray)localObject3).getString(15);
      } else {
        localObject1 = null;
      }
      if ((j >= 26) && (((TypedArray)localObject3).hasValue(13))) {
        localObject3 = ((TypedArray)localObject3).getString(13);
      } else {
        localObject3 = null;
      }
      ((a.ClassWriter)localObject2).recycle();
      localObject2 = localObject1;
      localObject1 = localObject3;
    }
    else
    {
      bool1 = false;
      i = 0;
      localObject1 = null;
      localObject2 = null;
    }
    Object localObject6 = localContext.obtainStyledAttributes(paramAttributeSet, (int[])localObject5, paramInt, 0);
    localObject5 = new a.ClassWriter(localContext, (TypedArray)localObject6);
    int j = i;
    boolean bool2 = bool1;
    if (!bool3)
    {
      j = i;
      bool2 = bool1;
      if (((TypedArray)localObject6).hasValue(14))
      {
        bool2 = ((TypedArray)localObject6).getBoolean(14, false);
        j = 1;
      }
    }
    i = Build.VERSION.SDK_INT;
    if (((TypedArray)localObject6).hasValue(15)) {
      localObject2 = ((TypedArray)localObject6).getString(15);
    }
    Object localObject3 = localObject1;
    if (i >= 26)
    {
      localObject3 = localObject1;
      if (((TypedArray)localObject6).hasValue(13)) {
        localObject3 = ((TypedArray)localObject6).getString(13);
      }
    }
    if ((i >= 28) && (((TypedArray)localObject6).hasValue(0)) && (((TypedArray)localObject6).getDimensionPixelSize(0, -1) == 0)) {
      localTextView.setTextSize(0, 0.0F);
    }
    init(localContext, (a.ClassWriter)localObject5);
    ((a.ClassWriter)localObject5).recycle();
    if ((!bool3) && (j != 0)) {
      localTextView.setAllCaps(bool2);
    }
    localObject1 = t;
    if (localObject1 != null) {
      if (b == -1) {
        localTextView.setTypeface((Typeface)localObject1, e);
      } else {
        localTextView.setTypeface((Typeface)localObject1);
      }
    }
    if (localObject3 != null) {
      Log.setText(localTextView, (String)localObject3);
    }
    if (localObject2 != null) {
      Plugins.measureText(localTextView, Plugins.getString((String)localObject2));
    }
    localObject1 = R.styleable.a;
    localObject2 = d;
    localObject3 = j;
    localObject5 = ((android.content.Context)localObject3).obtainStyledAttributes(paramAttributeSet, (int[])localObject1, paramInt, 0);
    localObject6 = a;
    ViewCompat.init((View)localObject6, ((View)localObject6).getContext(), (int[])localObject1, paramAttributeSet, (TypedArray)localObject5, paramInt);
    if (((TypedArray)localObject5).hasValue(5)) {
      b = ((TypedArray)localObject5).getInt(5, 0);
    }
    if (((TypedArray)localObject5).hasValue(4)) {}
    for (float f1 = ((TypedArray)localObject5).getDimension(4, -1.0F);; f1 = -1.0F) {
      break;
    }
    if (((TypedArray)localObject5).hasValue(2)) {}
    for (float f2 = ((TypedArray)localObject5).getDimension(2, -1.0F);; f2 = -1.0F) {
      break;
    }
    if (((TypedArray)localObject5).hasValue(1)) {}
    for (float f3 = ((TypedArray)localObject5).getDimension(1, -1.0F);; f3 = -1.0F) {
      break;
    }
    if (((TypedArray)localObject5).hasValue(3))
    {
      paramInt = ((TypedArray)localObject5).getResourceId(3, 0);
      if (paramInt > 0)
      {
        localObject6 = ((TypedArray)localObject5).getResources().obtainTypedArray(paramInt);
        i = ((TypedArray)localObject6).length();
        int[] arrayOfInt = new int[i];
        if (i > 0)
        {
          paramInt = 0;
          while (paramInt < i)
          {
            arrayOfInt[paramInt] = ((TypedArray)localObject6).getDimensionPixelSize(paramInt, -1);
            paramInt += 1;
          }
          e = f.sort(arrayOfInt);
          ((f)localObject2).b();
        }
        ((TypedArray)localObject6).recycle();
      }
    }
    ((TypedArray)localObject5).recycle();
    if (((f)localObject2).d())
    {
      if (b == 1)
      {
        if (!h)
        {
          localObject3 = ((android.content.Context)localObject3).getResources().getDisplayMetrics();
          float f4 = f2;
          if (f2 == -1.0F) {
            f4 = TypedValue.applyDimension(2, 12.0F, (DisplayMetrics)localObject3);
          }
          f2 = f3;
          if (f3 == -1.0F) {
            f2 = TypedValue.applyDimension(2, 112.0F, (DisplayMetrics)localObject3);
          }
          f3 = f1;
          if (f1 == -1.0F) {
            f3 = 1.0F;
          }
          ((f)localObject2).a(f4, f2, f3);
        }
        ((f)localObject2).a();
      }
    }
    else {
      b = 0;
    }
    if ((R.id.i) && (b != 0))
    {
      localObject3 = e;
      if (localObject3.length > 0) {
        if (Log.d(localTextView) != -1.0F) {
          Log.setTime(localTextView, Math.round(n), Math.round(x), Math.round(y), 0);
        } else {
          Log.setText(localTextView, (int[])localObject3, 0);
        }
      }
    }
    localObject6 = localContext.obtainStyledAttributes(paramAttributeSet, (int[])localObject1);
    paramInt = ((TypedArray)localObject6).getResourceId(8, -1);
    if (paramInt != -1) {}
    for (localObject2 = ((AppCompatDrawableManager)localObject4).getDrawable(localContext, paramInt);; localObject2 = null) {
      break;
    }
    paramInt = ((TypedArray)localObject6).getResourceId(13, -1);
    if (paramInt != -1) {
      localObject1 = ((AppCompatDrawableManager)localObject4).getDrawable(localContext, paramInt);
    } else {
      localObject1 = null;
    }
    paramInt = ((TypedArray)localObject6).getResourceId(9, -1);
    if (paramInt != -1) {}
    for (localObject3 = ((AppCompatDrawableManager)localObject4).getDrawable(localContext, paramInt);; localObject3 = null) {
      break;
    }
    paramInt = ((TypedArray)localObject6).getResourceId(6, -1);
    if (paramInt != -1) {
      paramAttributeSet = ((AppCompatDrawableManager)localObject4).getDrawable(localContext, paramInt);
    } else {
      paramAttributeSet = null;
    }
    paramInt = ((TypedArray)localObject6).getResourceId(10, -1);
    if (paramInt != -1) {
      localObject5 = ((AppCompatDrawableManager)localObject4).getDrawable(localContext, paramInt);
    } else {
      localObject5 = null;
    }
    paramInt = ((TypedArray)localObject6).getResourceId(7, -1);
    if (paramInt != -1) {
      localObject4 = ((AppCompatDrawableManager)localObject4).getDrawable(localContext, paramInt);
    } else {
      localObject4 = null;
    }
    if ((localObject5 == null) && (localObject4 == null))
    {
      if ((localObject2 != null) || (localObject1 != null) || (localObject3 != null) || (paramAttributeSet != null))
      {
        localObject4 = localTextView.getCompoundDrawablesRelative();
        localObject5 = localObject4[0];
        if ((localObject5 != null) || (localObject4[2] == null))
        {
          localObject4 = localTextView.getCompoundDrawables();
          if (localObject2 == null) {
            localObject2 = localObject4[0];
          }
          if (localObject1 == null) {
            localObject1 = localObject4[1];
          }
          if (localObject3 == null) {
            localObject3 = localObject4[2];
          }
          if (paramAttributeSet == null) {
            paramAttributeSet = localObject4[3];
          }
          localTextView.setCompoundDrawablesWithIntrinsicBounds((Drawable)localObject2, (Drawable)localObject1, (Drawable)localObject3, paramAttributeSet);
        }
        else
        {
          if (localObject1 == null) {
            localObject1 = localObject4[1];
          }
          if (paramAttributeSet == null) {
            for (;;)
            {
              paramAttributeSet = localObject4[3];
            }
          }
          localTextView.setCompoundDrawablesRelativeWithIntrinsicBounds((Drawable)localObject5, (Drawable)localObject1, localObject4[2], paramAttributeSet);
        }
      }
    }
    else
    {
      localObject2 = localTextView.getCompoundDrawablesRelative();
      if (localObject5 == null) {
        localObject5 = localObject2[0];
      }
      if (localObject1 == null) {
        localObject1 = localObject2[1];
      }
      if (localObject4 == null) {
        localObject4 = localObject2[2];
      }
      if (paramAttributeSet == null) {
        paramAttributeSet = localObject2[3];
      }
      localTextView.setCompoundDrawablesRelativeWithIntrinsicBounds((Drawable)localObject5, (Drawable)localObject1, (Drawable)localObject4, paramAttributeSet);
    }
    if (((TypedArray)localObject6).hasValue(11))
    {
      if (((TypedArray)localObject6).hasValue(11))
      {
        paramInt = ((TypedArray)localObject6).getResourceId(11, 0);
        if (paramInt != 0)
        {
          localObject1 = drupal.Context.get(localContext, paramInt);
          paramAttributeSet = (AttributeSet)localObject1;
          if (localObject1 != null) {
            break label1659;
          }
        }
      }
      paramAttributeSet = ((TypedArray)localObject6).getColorStateList(11);
      label1659:
      localTextView.setCompoundDrawableTintList(paramAttributeSet);
    }
    if (((TypedArray)localObject6).hasValue(12)) {
      localTextView.setCompoundDrawableTintMode(Context.parseTintMode(((TypedArray)localObject6).getInt(12, -1), null));
    }
    for (;;)
    {
      break;
    }
    i = ((TypedArray)localObject6).getDimensionPixelSize(15, -1);
    j = ((TypedArray)localObject6).getDimensionPixelSize(18, -1);
    if (((TypedArray)localObject6).hasValue(19))
    {
      paramAttributeSet = ((TypedArray)localObject6).peekValue(19);
      if ((paramAttributeSet != null) && (type == 5))
      {
        paramInt = data;
        f1 = TypedValue.complexToFloat(paramInt);
        paramInt &= 0xF;
      }
      else
      {
        f1 = ((TypedArray)localObject6).getDimensionPixelSize(19, -1);
        paramInt = -1;
      }
    }
    else
    {
      paramInt = -1;
      f1 = -1.0F;
    }
    ((TypedArray)localObject6).recycle();
    if (i != -1) {
      drupal.Context.setText(localTextView, i);
    }
    if (j != -1) {
      drupal.Context.initialize(localTextView, j);
    }
    if (f1 != -1.0F)
    {
      if (paramInt == -1)
      {
        drupal.Context.init(localTextView, (int)f1);
        return;
      }
      if (Build.VERSION.SDK_INT >= 34)
      {
        Vector.set(localTextView, paramInt, f1);
        return;
      }
      drupal.Context.init(localTextView, Math.round(TypedValue.applyDimension(paramInt, f1, localTextView.getResources().getDisplayMetrics())));
    }
  }
}
