package drupal;

import Client.Tuple3;
import android.app.Activity;
import android.app.Dialog;
import android.content.DialogInterface.OnKeyListener;
import android.content.res.ColorStateList;
import android.content.res.Configuration;
import android.content.res.Resources;
import android.content.res.Resources.Theme;
import android.graphics.Paint;
import android.graphics.Paint.FontMetricsInt;
import android.graphics.drawable.Drawable;
import android.os.Build.VERSION;
import android.os.Bundle;
import android.os.Trace;
import android.text.InputFilter;
import android.text.TextDirectionHeuristic;
import android.text.TextDirectionHeuristics;
import android.text.TextPaint;
import android.text.TextUtils;
import android.text.method.PasswordTransformationMethod;
import android.util.SparseArray;
import android.util.TypedValue;
import android.view.ActionMode.Callback;
import android.view.KeyEvent;
import android.view.View;
import android.view.ViewParent;
import android.view.Window;
import android.view.Window.Callback;
import android.view.inputmethod.EditorInfo;
import android.view.inputmethod.InputConnection;
import android.widget.EdgeEffect;
import android.widget.TextView;
import androidx.appcompat.widget.BubbleTextView;
import androidx.appcompat.widget.TintManager;
import androidx.core.widget.AppCompatDelegateImplV7.ActionModeCallbackWrapperV7;
import androidx.core.widget.CollapsingTextHelper;
import androidx.core.widget.NestedScrollView.OnScrollChangeListener;
import app.Preference;
import app.ViewCompat;
import app.ViewPropertyAnimatorListener;
import app.k;
import asm.g;
import data.Block;
import data.Contact;
import data.DeltaBaseCache;
import data.Game;
import fitting.a;
import java.lang.reflect.AccessibleObject;
import java.lang.reflect.Constructor;
import java.lang.reflect.Field;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.nio.MappedByteBuffer;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.Set;
import java.util.WeakHashMap;
import model.License;
import widgets.Handle;
import xml.Attributes;

public abstract class Context
  implements ViewPropertyAnimatorListener, NestedScrollView.OnScrollChangeListener
{
  public static boolean b;
  public static Class c;
  public static Method d;
  public static boolean f;
  public static boolean h;
  public static boolean i;
  public static boolean l;
  public static Field m;
  public static Method main;
  public static Field n;
  public static long perm;
  public static Field r;
  public static boolean s;
  public static Field t;
  
  public static ActionMode.Callback a(ActionMode.Callback paramCallback, TextView paramTextView)
  {
    int j = Build.VERSION.SDK_INT;
    if ((j >= 26) && (j <= 27) && (!(paramCallback instanceof AppCompatDelegateImplV7.ActionModeCallbackWrapperV7)))
    {
      if (paramCallback == null) {
        return paramCallback;
      }
      return new AppCompatDelegateImplV7.ActionModeCallbackWrapperV7(paramCallback, paramTextView);
    }
    return paramCallback;
  }
  
  public static final void a(Object paramObject)
  {
    if (!(paramObject instanceof Handle)) {
      return;
    }
    throw d;
  }
  
  public static boolean a(View paramView, KeyEvent paramKeyEvent)
  {
    throw new Runtime("d2j fail translate: java.lang.RuntimeException: \n\tat com.googlecode.dex2jar.ir.ts.NewTransformer.transform(NewTransformer.java:134)\n\tat com.googlecode.d2j.dex.Dex2jar$2.optimize(Dex2jar.java:148)\n\tat com.googlecode.d2j.dex.Dex2Asm.convertCode(Dex2Asm.java:414)\n\tat com.googlecode.d2j.dex.ExDex2Asm.convertCode(ExDex2Asm.java:42)\n\tat com.googlecode.d2j.dex.Dex2jar$2.convertCode(Dex2jar.java:128)\n\tat com.googlecode.d2j.dex.Dex2Asm.convertMethod(Dex2Asm.java:509)\n\tat com.googlecode.d2j.dex.Dex2Asm.convertClass(Dex2Asm.java:406)\n\tat com.googlecode.d2j.dex.Dex2Asm.convertDex(Dex2Asm.java:422)\n\tat com.googlecode.d2j.dex.Dex2jar.doTranslate(Dex2jar.java:172)\n\tat com.googlecode.d2j.dex.Dex2jar.to(Dex2jar.java:272)\n\tat com.googlecode.dex2jar.tools.Dex2jarCmd.doCommandLine(Dex2jarCmd.java:108)\n\tat com.googlecode.dex2jar.tools.BaseCmd.doMain(BaseCmd.java:288)\n\tat com.googlecode.dex2jar.tools.Dex2jarCmd.main(Dex2jarCmd.java:32)\n");
  }
  
  public static boolean a(k paramK, View paramView, Window.Callback paramCallback, KeyEvent paramKeyEvent)
  {
    bool2 = false;
    if (paramK == null) {
      return false;
    }
    if (Build.VERSION.SDK_INT >= 28) {
      return paramK.superDispatchKeyEvent(paramKeyEvent);
    }
    bool1 = paramCallback instanceof Activity;
    Object localObject2 = null;
    Object localObject1 = null;
    if (bool1)
    {
      paramView = (Activity)paramCallback;
      paramView.onUserInteraction();
      paramK = paramView.getWindow();
      if (paramK.hasFeature(8))
      {
        paramCallback = paramView.getActionBar();
        if ((paramKeyEvent.getKeyCode() == 82) && (paramCallback != null) && (h)) {}
      }
    }
    try
    {
      localObject2 = paramCallback.getClass();
      localObject2 = ((Class)localObject2).getMethod("onMenuKeyEvent", new Class[] { KeyEvent.class });
      d = (Method)localObject2;
    }
    catch (NoSuchMethodException localNoSuchMethodException)
    {
      for (;;) {}
    }
    h = true;
    localObject2 = d;
    bool1 = bool2;
    if (localObject2 != null) {}
    try
    {
      paramCallback = ((Method)localObject2).invoke(paramCallback, new Object[] { paramKeyEvent });
      if (paramCallback == null)
      {
        bool1 = bool2;
      }
      else
      {
        paramCallback = (Boolean)paramCallback;
        bool1 = paramCallback.booleanValue();
      }
    }
    catch (IllegalAccessException paramCallback)
    {
      for (;;)
      {
        bool1 = bool2;
      }
    }
    catch (InvocationTargetException paramCallback)
    {
      for (;;)
      {
        bool1 = bool2;
      }
    }
    if (bool1) {
      return true;
    }
    if (paramK.superDispatchKeyEvent(paramKeyEvent)) {
      return true;
    }
    paramCallback = paramK.getDecorView();
    if (ViewCompat.a(paramCallback, paramKeyEvent)) {
      return true;
    }
    paramK = localObject1;
    if (paramCallback != null) {
      paramK = paramCallback.getKeyDispatcherState();
    }
    return paramKeyEvent.dispatch(paramView, paramK, paramView);
    if ((paramCallback instanceof Dialog))
    {
      paramView = (Dialog)paramCallback;
      if (f) {}
    }
    try
    {
      paramK = Dialog.class.getDeclaredField("mOnKeyListener");
      t = paramK;
      paramK.setAccessible(true);
    }
    catch (NoSuchFieldException paramK)
    {
      for (;;) {}
    }
    f = true;
    paramK = t;
    if (paramK != null) {}
    try
    {
      paramK = paramK.get(paramView);
      paramK = (DialogInterface.OnKeyListener)paramK;
    }
    catch (IllegalAccessException paramK)
    {
      for (;;) {}
    }
    paramK = null;
    if ((paramK != null) && (paramK.onKey(paramView, paramKeyEvent.getKeyCode(), paramKeyEvent))) {
      return true;
    }
    paramK = paramView.getWindow();
    if (paramK.superDispatchKeyEvent(paramKeyEvent)) {
      return true;
    }
    paramCallback = paramK.getDecorView();
    if (ViewCompat.a(paramCallback, paramKeyEvent)) {
      return true;
    }
    paramK = (k)localObject2;
    if (paramCallback != null) {
      paramK = paramCallback.getKeyDispatcherState();
    }
    return paramKeyEvent.dispatch(paramView, paramK, paramView);
    return ((paramView != null) && (ViewCompat.a(paramView, paramKeyEvent))) || (paramK.superDispatchKeyEvent(paramKeyEvent));
  }
  
  public static final Class add(params.Item paramItem)
  {
    paramItem = paramItem.getType();
    params.Log.add(paramItem, "null cannot be cast to non-null type java.lang.Class<T of kotlin.jvm.JvmClassMappingKt.<get-java>>");
    return paramItem;
  }
  
  public static void add(String paramString)
  {
    if (paramString.length() > 127) {
      paramString = paramString.substring(0, 127);
    }
    Trace.beginSection(paramString);
  }
  
  public static void append(int paramInt1, int paramInt2, int paramInt3)
  {
    if ((paramInt1 >= 0) && (paramInt2 <= paramInt3))
    {
      if (paramInt1 <= paramInt2) {
        return;
      }
      localStringBuilder = new StringBuilder("fromIndex: ");
      localStringBuilder.append(paramInt1);
      localStringBuilder.append(" > toIndex: ");
      localStringBuilder.append(paramInt2);
      throw new IllegalArgumentException(localStringBuilder.toString());
    }
    StringBuilder localStringBuilder = new StringBuilder("fromIndex: ");
    localStringBuilder.append(paramInt1);
    localStringBuilder.append(", toIndex: ");
    localStringBuilder.append(paramInt2);
    localStringBuilder.append(", size: ");
    localStringBuilder.append(paramInt3);
    throw new IndexOutOfBoundsException(localStringBuilder.toString());
  }
  
  public static void b(View paramView, CharSequence paramCharSequence)
  {
    if (Build.VERSION.SDK_INT >= 26)
    {
      androidx.appcompat.widget.LayoutManager.a(paramView, paramCharSequence);
      return;
    }
    androidx.appcompat.widget.Item localItem = androidx.appcompat.widget.Item.h;
    if ((localItem != null) && (a == paramView)) {
      androidx.appcompat.widget.Item.a(null);
    }
    if (TextUtils.isEmpty(paramCharSequence))
    {
      paramCharSequence = androidx.appcompat.widget.Item.g;
      if ((paramCharSequence != null) && (a == paramView)) {
        paramCharSequence.a();
      }
      paramView.setOnLongClickListener(null);
      paramView.setLongClickable(false);
      paramView.setOnHoverListener(null);
      return;
    }
    new androidx.appcompat.widget.Item(paramView, paramCharSequence);
  }
  
  public static List create(Object paramObject)
  {
    paramObject = Collections.singletonList(paramObject);
    params.Log.append(paramObject, "singletonList(...)");
    return paramObject;
  }
  
  public static g doInBackground(android.content.Context paramContext)
  {
    throw new Runtime("d2j fail translate: java.lang.RuntimeException: \n\tat com.googlecode.dex2jar.ir.ts.NewTransformer.transform(NewTransformer.java:134)\n\tat com.googlecode.d2j.dex.Dex2jar$2.optimize(Dex2jar.java:148)\n\tat com.googlecode.d2j.dex.Dex2Asm.convertCode(Dex2Asm.java:414)\n\tat com.googlecode.d2j.dex.ExDex2Asm.convertCode(ExDex2Asm.java:42)\n\tat com.googlecode.d2j.dex.Dex2jar$2.convertCode(Dex2jar.java:128)\n\tat com.googlecode.d2j.dex.Dex2Asm.convertMethod(Dex2Asm.java:509)\n\tat com.googlecode.d2j.dex.Dex2Asm.convertClass(Dex2Asm.java:406)\n\tat com.googlecode.d2j.dex.Dex2Asm.convertDex(Dex2Asm.java:422)\n\tat com.googlecode.d2j.dex.Dex2jar.doTranslate(Dex2jar.java:172)\n\tat com.googlecode.d2j.dex.Dex2jar.to(Dex2jar.java:272)\n\tat com.googlecode.dex2jar.tools.Dex2jarCmd.doCommandLine(Dex2jarCmd.java:108)\n\tat com.googlecode.dex2jar.tools.BaseCmd.doMain(BaseCmd.java:288)\n\tat com.googlecode.dex2jar.tools.Dex2jarCmd.main(Dex2jarCmd.java:32)\n");
  }
  
  public static float draw(EdgeEffect paramEdgeEffect)
  {
    if (Build.VERSION.SDK_INT >= 31) {
      return CollapsingTextHelper.draw(paramEdgeEffect);
    }
    return 0.0F;
  }
  
  public static float draw(EdgeEffect paramEdgeEffect, float paramFloat1, float paramFloat2)
  {
    if (Build.VERSION.SDK_INT >= 31) {
      return CollapsingTextHelper.draw(paramEdgeEffect, paramFloat1, paramFloat2);
    }
    androidx.core.widget.LayoutManager.draw(paramEdgeEffect, paramFloat1, paramFloat2);
    return paramFloat1;
  }
  
  public static boolean execute()
  {
    if (Build.VERSION.SDK_INT >= 29) {
      return a.isEnabled();
    }
    if (main == null) {
      try
      {
        l1 = Trace.class.getField("TRACE_TAG_APP").getLong(null);
        perm = l1;
        Object localObject1 = Long.TYPE;
        localObject1 = Trace.class.getMethod("isTagEnabled", new Class[] { localObject1 });
        main = (Method)localObject1;
      }
      catch (Exception localException)
      {
        break label104;
      }
    }
    Object localObject2 = main;
    long l1 = perm;
    localObject2 = ((Method)localObject2).invoke(null, new Object[] { Long.valueOf(l1) });
    localObject2 = (Boolean)localObject2;
    boolean bool = ((Boolean)localObject2).booleanValue();
    return bool;
    label104:
    if ((localObject2 instanceof InvocationTargetException))
    {
      localObject2 = ((Throwable)localObject2).getCause();
      if ((localObject2 instanceof RuntimeException)) {
        throw ((RuntimeException)localObject2);
      }
      throw new RuntimeException((Throwable)localObject2);
    }
    android.util.Log.v("Trace", "Unable to call isTagEnabled via reflection", (Throwable)localObject2);
    return false;
  }
  
  public static ColorStateList get(android.content.Context paramContext, int paramInt)
  {
    Object localObject3 = paramContext.getResources();
    Resources.Theme localTheme = paramContext.getTheme();
    Game localGame = new Game((Resources)localObject3, localTheme);
    Object localObject2 = DeltaBaseCache.index;
    for (;;)
    {
      try
      {
        paramContext = (SparseArray)DeltaBaseCache.cache.get(localGame);
        localObject1 = null;
        if ((paramContext != null) && (paramContext.size() > 0))
        {
          localObject4 = (Block)paramContext.get(paramInt);
          if (localObject4 != null)
          {
            if (type.equals(((Resources)localObject3).getConfiguration()))
            {
              if (localTheme == null) {
                if (hash == 0) {
                  continue;
                }
              }
              if ((localTheme != null) && (hash == localTheme.hashCode()))
              {
                paramContext = key;
                continue;
              }
            }
            paramContext.remove(paramInt);
          }
        }
        paramContext = null;
        if (paramContext != null) {
          return paramContext;
        }
        localObject4 = DeltaBaseCache.table;
        localObject2 = (TypedValue)((ThreadLocal)localObject4).get();
        paramContext = (android.content.Context)localObject2;
        if (localObject2 == null)
        {
          paramContext = new TypedValue();
          ((ThreadLocal)localObject4).set(paramContext);
        }
        ((Resources)localObject3).getValue(paramInt, paramContext, true);
        int j = type;
        if ((j >= 28) && (j <= 31))
        {
          paramContext = (android.content.Context)localObject1;
        }
        else
        {
          paramContext = ((Resources)localObject3).getXml(paramInt);
          try
          {
            paramContext = Contact.init((Resources)localObject3, paramContext, localTheme);
          }
          catch (Exception paramContext)
          {
            android.util.Log.w("ResourcesCompat", "Failed to inflate ColorStateList, leaving it to the framework", paramContext);
            paramContext = (android.content.Context)localObject1;
          }
        }
        if (paramContext != null) {
          localObject3 = DeltaBaseCache.index;
        }
      }
      catch (Throwable paramContext)
      {
        Object localObject1;
        Object localObject4;
        continue;
      }
      try
      {
        localObject4 = DeltaBaseCache.cache;
        localObject2 = (SparseArray)((WeakHashMap)localObject4).get(localGame);
        localObject1 = localObject2;
        if (localObject2 == null)
        {
          localObject1 = new SparseArray();
          ((WeakHashMap)localObject4).put(localGame, localObject1);
        }
        ((SparseArray)localObject1).append(paramInt, new Block(paramContext, res.getConfiguration(), localTheme));
        return paramContext;
      }
      catch (Throwable paramContext) {}
    }
    throw paramContext;
    return ((Resources)localObject3).getColorStateList(paramInt, localTheme);
    throw paramContext;
  }
  
  public static final Bundle get(String paramString, Bundle paramBundle)
  {
    paramBundle = paramBundle.getBundle(paramString);
    if (paramBundle != null) {
      return paramBundle;
    }
    paramBundle = new StringBuilder("No valid saved state was found for the key '");
    paramBundle.append(paramString);
    paramBundle.append("'. It may be missing, null, or not of the expected type. This can occur if the value was saved with a different type or if the saved state was modified unexpectedly.");
    throw new IllegalArgumentException(paramBundle.toString());
  }
  
  public static Set get()
  {
    try
    {
      Object localObject = Class.forName("android.text.EmojiConsistency").getMethod("getEmojiConsistencySet", null).invoke(null, null);
      if (localObject == null)
      {
        localObject = Collections.emptySet();
        return localObject;
      }
      localObject = (Set)localObject;
      Iterator localIterator = ((Set)localObject).iterator();
      boolean bool;
      do
      {
        bool = localIterator.hasNext();
        if (!bool) {
          break;
        }
        bool = localIterator.next() instanceof int[];
      } while (bool);
      localObject = Collections.emptySet();
      return localObject;
    }
    catch (Throwable localThrowable)
    {
      for (;;) {}
      return localThrowable;
    }
    return Collections.emptySet();
  }
  
  public static void get(Object paramObject, String paramString)
  {
    if (paramObject != null) {
      return;
    }
    throw new NullPointerException(paramString);
  }
  
  public static Drawable getDrawable(android.content.Context paramContext, int paramInt)
  {
    return TintManager.get().getDrawable(paramContext, paramInt);
  }
  
  public static final Class getValue(Attributes paramAttributes)
  {
    params.Log.get(paramAttributes, "<this>");
    paramAttributes = ((params.Object)paramAttributes).getType();
    if (!paramAttributes.isPrimitive()) {
      return paramAttributes;
    }
    String str = paramAttributes.getName();
    switch (str.hashCode())
    {
    default: 
      return paramAttributes;
    case 109413500: 
      if (!str.equals("short")) {
        return paramAttributes;
      }
      return Short.class;
    case 97526364: 
      if (!str.equals("float")) {
        return paramAttributes;
      }
      return Float.class;
    case 64711720: 
      if (!str.equals("boolean")) {
        return paramAttributes;
      }
      return Boolean.class;
    case 3625364: 
      if (!str.equals("void")) {
        return paramAttributes;
      }
      return Void.class;
    case 3327612: 
      if (!str.equals("long")) {
        return paramAttributes;
      }
      return Long.class;
    case 3052374: 
      if (!str.equals("char")) {
        return paramAttributes;
      }
      return Character.class;
    case 3039496: 
      if (!str.equals("byte")) {
        return paramAttributes;
      }
      return Byte.class;
    case 104431: 
      if (!str.equals("int")) {
        return paramAttributes;
      }
      return Integer.class;
    }
    if (!str.equals("double")) {
      return paramAttributes;
    }
    return Double.class;
  }
  
  public static Tuple3 init(BubbleTextView paramBubbleTextView)
  {
    int i2 = Build.VERSION.SDK_INT;
    if (i2 >= 28) {
      return new Tuple3(Preference.getSharedPreferences(paramBubbleTextView));
    }
    TextPaint localTextPaint = new TextPaint(paramBubbleTextView.getPaint());
    TextDirectionHeuristic localTextDirectionHeuristic2 = TextDirectionHeuristics.FIRSTSTRONG_LTR;
    int k = paramBubbleTextView.getBreakStrategy();
    int i1 = paramBubbleTextView.getHyphenationFrequency();
    TextDirectionHeuristic localTextDirectionHeuristic1;
    if ((paramBubbleTextView.getTransformationMethod() instanceof PasswordTransformationMethod))
    {
      localTextDirectionHeuristic1 = TextDirectionHeuristics.LTR;
    }
    else
    {
      int j = 1;
      if ((i2 >= 28) && ((paramBubbleTextView.getInputType() & 0xF) == 3))
      {
        j = Character.getDirectionality(Preference.init(android.icu.text.DecimalFormatSymbols.getInstance(paramBubbleTextView.getTextLocale()))[0].codePointAt(0));
        if ((j != 1) && (j != 2)) {
          localTextDirectionHeuristic1 = TextDirectionHeuristics.LTR;
        } else {
          localTextDirectionHeuristic1 = TextDirectionHeuristics.RTL;
        }
      }
      else
      {
        if (paramBubbleTextView.getLayoutDirection() != 1) {
          j = 0;
        }
        localTextDirectionHeuristic1 = localTextDirectionHeuristic2;
        switch (paramBubbleTextView.getTextDirection())
        {
        default: 
          localTextDirectionHeuristic1 = localTextDirectionHeuristic2;
          if (j != 0) {
            localTextDirectionHeuristic1 = TextDirectionHeuristics.FIRSTSTRONG_RTL;
          }
          break;
        case 7: 
          localTextDirectionHeuristic1 = TextDirectionHeuristics.FIRSTSTRONG_RTL;
          break;
        case 5: 
          localTextDirectionHeuristic1 = TextDirectionHeuristics.LOCALE;
          break;
        case 4: 
          localTextDirectionHeuristic1 = TextDirectionHeuristics.RTL;
          break;
        case 3: 
          localTextDirectionHeuristic1 = TextDirectionHeuristics.LTR;
          break;
        case 2: 
          localTextDirectionHeuristic1 = TextDirectionHeuristics.ANYRTL_LTR;
        }
      }
    }
    return new Tuple3(localTextPaint, localTextDirectionHeuristic1, k, i1);
  }
  
  public static void init(TextView paramTextView, int paramInt)
  {
    if (paramInt >= 0)
    {
      int j = paramTextView.getPaint().getFontMetricsInt(null);
      if (paramInt != j) {
        paramTextView.setLineSpacing(paramInt - j, 1.0F);
      }
    }
    else
    {
      throw new IllegalArgumentException();
    }
  }
  
  public static void initialize(TextView paramTextView, int paramInt)
  {
    if (paramInt >= 0)
    {
      Paint.FontMetricsInt localFontMetricsInt = paramTextView.getPaint().getFontMetricsInt();
      int j;
      if (paramTextView.getIncludeFontPadding()) {
        j = bottom;
      } else {
        j = descent;
      }
      if (paramInt > Math.abs(j)) {
        paramTextView.setPadding(paramTextView.getPaddingLeft(), paramTextView.getPaddingTop(), paramTextView.getPaddingRight(), paramInt - j);
      }
    }
    else
    {
      throw new IllegalArgumentException();
    }
  }
  
  public static void matchesSafely(EditorInfo paramEditorInfo, InputConnection paramInputConnection, TextView paramTextView)
  {
    if ((paramInputConnection != null) && (hintText == null)) {
      for (paramEditorInfo = paramTextView.getParent(); (paramEditorInfo instanceof View); paramEditorInfo = paramEditorInfo.getParent()) {}
    }
  }
  
  public static ActionMode.Callback onAnimationEnd(ActionMode.Callback paramCallback)
  {
    ActionMode.Callback localCallback = paramCallback;
    if ((paramCallback instanceof AppCompatDelegateImplV7.ActionModeCallbackWrapperV7))
    {
      localCallback = paramCallback;
      if (Build.VERSION.SDK_INT >= 26) {
        localCallback = mWrapped;
      }
    }
    return localCallback;
  }
  
  public static androidx.lifecycle.Label read(Class paramClass)
  {
    try
    {
      Object localObject = paramClass.getDeclaredConstructor(null).newInstance(null);
      params.Log.get(localObject);
      return (androidx.lifecycle.Label)localObject;
    }
    catch (IllegalAccessException localIllegalAccessException) {}catch (InstantiationException localInstantiationException)
    {
      break label61;
    }
    catch (NoSuchMethodException localNoSuchMethodException) {}
    StringBuilder localStringBuilder = new StringBuilder("Cannot create an instance of ");
    localStringBuilder.append(paramClass);
    throw new RuntimeException(localStringBuilder.toString(), localNoSuchMethodException);
    label61:
    localStringBuilder = new StringBuilder("Cannot create an instance of ");
    localStringBuilder.append(paramClass);
    throw new RuntimeException(localStringBuilder.toString(), localNoSuchMethodException);
    localStringBuilder = new StringBuilder("Cannot create an instance of ");
    localStringBuilder.append(paramClass);
    throw new RuntimeException(localStringBuilder.toString(), localNoSuchMethodException);
  }
  
  public static License read(MappedByteBuffer paramMappedByteBuffer)
  {
    throw new Runtime("d2j fail translate: java.lang.RuntimeException: \n\tat com.googlecode.dex2jar.ir.ts.NewTransformer.transform(NewTransformer.java:134)\n\tat com.googlecode.d2j.dex.Dex2jar$2.optimize(Dex2jar.java:148)\n\tat com.googlecode.d2j.dex.Dex2Asm.convertCode(Dex2Asm.java:414)\n\tat com.googlecode.d2j.dex.ExDex2Asm.convertCode(ExDex2Asm.java:42)\n\tat com.googlecode.d2j.dex.Dex2jar$2.convertCode(Dex2jar.java:128)\n\tat com.googlecode.d2j.dex.Dex2Asm.convertMethod(Dex2Asm.java:509)\n\tat com.googlecode.d2j.dex.Dex2Asm.convertClass(Dex2Asm.java:406)\n\tat com.googlecode.d2j.dex.Dex2Asm.convertDex(Dex2Asm.java:422)\n\tat com.googlecode.d2j.dex.Dex2jar.doTranslate(Dex2jar.java:172)\n\tat com.googlecode.d2j.dex.Dex2jar.to(Dex2jar.java:272)\n\tat com.googlecode.dex2jar.tools.Dex2jarCmd.doCommandLine(Dex2jarCmd.java:108)\n\tat com.googlecode.dex2jar.tools.BaseCmd.doMain(BaseCmd.java:288)\n\tat com.googlecode.dex2jar.tools.Dex2jarCmd.main(Dex2jarCmd.java:32)\n");
  }
  
  public static final int remove(int[] paramArrayOfInt, int paramInt)
  {
    int k = paramArrayOfInt.length - 1;
    int j = 0;
    while (j <= k)
    {
      int i1 = j + k >>> 1;
      int i2 = paramArrayOfInt[i1];
      if (paramInt > i2) {
        j = i1 + 1;
      } else if (paramInt < i2) {
        k = i1 - 1;
      } else {
        return i1;
      }
    }
    return -(j + 1);
  }
  
  public static final void scan(Object[] paramArrayOfObject, int paramInt1, int paramInt2)
  {
    params.Log.get(paramArrayOfObject, "<this>");
    while (paramInt1 < paramInt2)
    {
      paramArrayOfObject[paramInt1] = null;
      paramInt1 += 1;
    }
  }
  
  public static void setText(TextView paramTextView, int paramInt)
  {
    if (paramInt >= 0)
    {
      if (Build.VERSION.SDK_INT >= 28)
      {
        Preference.showText(paramTextView, paramInt);
        return;
      }
      Paint.FontMetricsInt localFontMetricsInt = paramTextView.getPaint().getFontMetricsInt();
      int j;
      if (paramTextView.getIncludeFontPadding()) {
        j = top;
      } else {
        j = ascent;
      }
      if (paramInt > Math.abs(j)) {
        paramTextView.setPadding(paramTextView.getPaddingLeft(), paramInt + j, paramTextView.getPaddingRight(), paramTextView.getPaddingBottom());
      }
    }
    else
    {
      throw new IllegalArgumentException();
    }
  }
  
  public abstract void a(asm.Label paramLabel);
  
  public abstract void a(Throwable paramThrowable);
  
  public abstract void a(boolean paramBoolean);
  
  public abstract InputFilter[] a(InputFilter[] paramArrayOfInputFilter);
  
  public abstract void b(boolean paramBoolean);
  
  public void onAnimationCancel() {}
  
  public void onAnimationStart() {}
}
