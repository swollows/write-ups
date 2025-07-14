package app;

import android.content.Context;
import android.content.res.TypedArray;
import android.os.Build.VERSION;
import android.util.AttributeSet;
import android.util.Log;
import android.view.KeyEvent;
import android.view.View.AccessibilityDelegate;
import android.view.ViewParent;
import android.view.ViewTreeObserver;
import android.view.WindowInsets;
import android.view.accessibility.AccessibilityEvent;
import android.view.accessibility.AccessibilityManager;
import android.view.accessibility.AccessibilityRecord;
import androidx.appcompat.widget.AppCompatEditText;
import androidx.core.widget.b;
import java.lang.reflect.AccessibleObject;
import java.util.List;
import java.util.WeakHashMap;

public abstract class ViewCompat
{
  public static final w a;
  public static final MainActivity.2 h;
  public static java.lang.reflect.Field sMinWidthField;
  public static boolean sMinWidthFieldFetched;
  public static WeakHashMap this$0;
  
  static
  {
    throw new Runtime("d2j fail translate: java.lang.RuntimeException: \n\tat com.googlecode.dex2jar.ir.ts.NewTransformer.transform(NewTransformer.java:134)\n\tat com.googlecode.d2j.dex.Dex2jar$2.optimize(Dex2jar.java:148)\n\tat com.googlecode.d2j.dex.Dex2Asm.convertCode(Dex2Asm.java:414)\n\tat com.googlecode.d2j.dex.ExDex2Asm.convertCode(ExDex2Asm.java:42)\n\tat com.googlecode.d2j.dex.Dex2jar$2.convertCode(Dex2jar.java:128)\n\tat com.googlecode.d2j.dex.Dex2Asm.convertMethod(Dex2Asm.java:509)\n\tat com.googlecode.d2j.dex.Dex2Asm.convertClass(Dex2Asm.java:406)\n\tat com.googlecode.d2j.dex.Dex2Asm.convertDex(Dex2Asm.java:422)\n\tat com.googlecode.d2j.dex.Dex2jar.doTranslate(Dex2jar.java:172)\n\tat com.googlecode.d2j.dex.Dex2jar.to(Dex2jar.java:272)\n\tat com.googlecode.dex2jar.tools.Dex2jarCmd.doCommandLine(Dex2jarCmd.java:108)\n\tat com.googlecode.dex2jar.tools.BaseCmd.doMain(BaseCmd.java:288)\n\tat com.googlecode.dex2jar.tools.Dex2jarCmd.main(Dex2jarCmd.java:32)\n");
  }
  
  public static Item a(android.view.View paramView, Item paramItem)
  {
    if (Log.isLoggable("ViewCompat", 3))
    {
      localObject = new StringBuilder("performReceiveContent: ");
      ((StringBuilder)localObject).append(paramItem);
      ((StringBuilder)localObject).append(", view=");
      ((StringBuilder)localObject).append(paramView.getClass().getSimpleName());
      ((StringBuilder)localObject).append("[");
      ((StringBuilder)localObject).append(paramView.getId());
      ((StringBuilder)localObject).append("]");
      Log.d("ViewCompat", ((StringBuilder)localObject).toString());
    }
    if (Build.VERSION.SDK_INT >= 31) {
      return Type.a(paramView, paramItem);
    }
    b localB = (b)paramView.getTag(2131230883);
    Object localObject = a;
    if (localB != null)
    {
      paramItem = b.a(paramView, paramItem);
      if (paramItem == null) {
        return null;
      }
      if ((paramView instanceof x)) {
        localObject = (x)paramView;
      }
      return ((x)localObject).a(paramItem);
    }
    if ((paramView instanceof x)) {
      localObject = (x)paramView;
    }
    return ((x)localObject).a(paramItem);
  }
  
  public static void a(android.view.View paramView, CharSequence paramCharSequence)
  {
    new PagerSlidingTabStrip(2131230880, CharSequence.class, 8, 28, 1).write(paramView, paramCharSequence);
    MainActivity.2 local2 = h;
    if (paramCharSequence != null)
    {
      paramCharSequence = a;
      boolean bool;
      if ((paramView.isShown()) && (paramView.getWindowVisibility() == 0)) {
        bool = true;
      } else {
        bool = false;
      }
      paramCharSequence.put(paramView, Boolean.valueOf(bool));
      paramView.addOnAttachStateChangeListener(local2);
      if (paramView.isAttachedToWindow()) {
        paramView.getViewTreeObserver().addOnGlobalLayoutListener(local2);
      }
    }
    else
    {
      a.remove(paramView);
      paramView.removeOnAttachStateChangeListener(local2);
      paramView.getViewTreeObserver().removeOnGlobalLayoutListener(local2);
    }
  }
  
  public static boolean a(android.view.View paramView, KeyEvent paramKeyEvent)
  {
    throw new Runtime("d2j fail translate: java.lang.RuntimeException: \n\tat com.googlecode.dex2jar.ir.ts.NewTransformer.transform(NewTransformer.java:134)\n\tat com.googlecode.d2j.dex.Dex2jar$2.optimize(Dex2jar.java:148)\n\tat com.googlecode.d2j.dex.Dex2Asm.convertCode(Dex2Asm.java:414)\n\tat com.googlecode.d2j.dex.ExDex2Asm.convertCode(ExDex2Asm.java:42)\n\tat com.googlecode.d2j.dex.Dex2jar$2.convertCode(Dex2jar.java:128)\n\tat com.googlecode.d2j.dex.Dex2Asm.convertMethod(Dex2Asm.java:509)\n\tat com.googlecode.d2j.dex.Dex2Asm.convertClass(Dex2Asm.java:406)\n\tat com.googlecode.d2j.dex.Dex2Asm.convertDex(Dex2Asm.java:422)\n\tat com.googlecode.d2j.dex.Dex2jar.doTranslate(Dex2jar.java:172)\n\tat com.googlecode.d2j.dex.Dex2jar.to(Dex2jar.java:272)\n\tat com.googlecode.dex2jar.tools.Dex2jarCmd.doCommandLine(Dex2jarCmd.java:108)\n\tat com.googlecode.dex2jar.tools.BaseCmd.doMain(BaseCmd.java:288)\n\tat com.googlecode.dex2jar.tools.Dex2jarCmd.main(Dex2jarCmd.java:32)\n");
  }
  
  public static ViewPropertyAnimatorCompat animate(android.view.View paramView)
  {
    if (this$0 == null) {
      this$0 = new WeakHashMap();
    }
    ViewPropertyAnimatorCompat localViewPropertyAnimatorCompat2 = (ViewPropertyAnimatorCompat)this$0.get(paramView);
    ViewPropertyAnimatorCompat localViewPropertyAnimatorCompat1 = localViewPropertyAnimatorCompat2;
    if (localViewPropertyAnimatorCompat2 == null)
    {
      localViewPropertyAnimatorCompat1 = new ViewPropertyAnimatorCompat(paramView);
      this$0.put(paramView, localViewPropertyAnimatorCompat1);
    }
    return localViewPropertyAnimatorCompat1;
  }
  
  public static void apply(android.view.View paramView, TypeToken paramTypeToken)
  {
    int i = Build.VERSION.SDK_INT;
    WindowInsets localWindowInsets = paramTypeToken.unwrap();
    if (localWindowInsets != null)
    {
      if (i >= 30) {
        paramTypeToken = ViewCompat.ViewCompatImpl.onApplyWindowInsets(paramView, localWindowInsets);
      } else {
        paramTypeToken = View.dispatchApplyWindowInsets(paramView, localWindowInsets);
      }
      if (!paramTypeToken.equals(localWindowInsets)) {
        TypeToken.get(paramTypeToken, paramView);
      }
    }
  }
  
  public static String[] doInBackground(AppCompatEditText paramAppCompatEditText)
  {
    if (Build.VERSION.SDK_INT >= 31) {
      return Type.create(paramAppCompatEditText);
    }
    return (String[])paramAppCompatEditText.getTag(2131230884);
  }
  
  public static View.AccessibilityDelegate getMinimumWidth(android.view.View paramView)
  {
    if (Build.VERSION.SDK_INT >= 29) {
      return Field.getMinimumWidth(paramView);
    }
    if (sMinWidthFieldFetched) {
      return null;
    }
    if (sMinWidthField == null) {}
    try
    {
      java.lang.reflect.Field localField = android.view.View.class.getDeclaredField("mAccessibilityDelegate");
      sMinWidthField = localField;
      localField.setAccessible(true);
    }
    catch (Throwable paramView)
    {
      for (;;) {}
    }
    sMinWidthFieldFetched = true;
    return null;
    try
    {
      paramView = sMinWidthField.get(paramView);
      boolean bool = paramView instanceof View.AccessibilityDelegate;
      if (!bool) {
        break label91;
      }
      paramView = (View.AccessibilityDelegate)paramView;
      return paramView;
    }
    catch (Throwable paramView)
    {
      for (;;) {}
    }
    sMinWidthFieldFetched = true;
    return null;
    label91:
    return null;
  }
  
  public static void init(android.view.View paramView, int paramInt)
  {
    Object localObject5 = (AccessibilityManager)paramView.getContext().getSystemService("accessibility");
    if (!((AccessibilityManager)localObject5).isEnabled()) {
      return;
    }
    int k = Build.VERSION.SDK_INT;
    AccessibilityEvent localAccessibilityEvent = null;
    Object localObject3 = null;
    Object localObject1;
    if (k >= 28)
    {
      localObject1 = m.format(paramView);
    }
    else
    {
      localObject4 = paramView.getTag(2131230880);
      localObject1 = localObject4;
      if (!CharSequence.class.isInstance(localObject4)) {
        localObject1 = null;
      }
    }
    int i;
    if (((CharSequence)localObject1 != null) && (paramView.isShown()) && (paramView.getWindowVisibility() == 0)) {
      i = 1;
    } else {
      i = 0;
    }
    int m = paramView.getAccessibilityLiveRegion();
    int j = 32;
    if ((m == 0) && (i == 0))
    {
      if (paramInt == 32)
      {
        localAccessibilityEvent = AccessibilityEvent.obtain();
        paramView.onInitializeAccessibilityEvent(localAccessibilityEvent);
        localAccessibilityEvent.setEventType(32);
        localAccessibilityEvent.setContentChangeTypes(paramInt);
        localAccessibilityEvent.setSource(paramView);
        paramView.onPopulateAccessibilityEvent(localAccessibilityEvent);
        localObject4 = localAccessibilityEvent.getText();
        if (k >= 28)
        {
          paramView = m.format(paramView);
        }
        else
        {
          localObject1 = paramView.getTag(2131230880);
          paramView = localObject3;
          if (CharSequence.class.isInstance(localObject1)) {
            paramView = (android.view.View)localObject1;
          }
        }
        ((List)localObject4).add((CharSequence)paramView);
        ((AccessibilityManager)localObject5).sendAccessibilityEvent(localAccessibilityEvent);
        return;
      }
      if (paramView.getParent() == null) {
        return;
      }
      localObject1 = paramView.getParent();
      try
      {
        ((ViewParent)localObject1).notifySubtreeAccessibilityStateChanged(paramView, paramView, paramInt);
        return;
      }
      catch (AbstractMethodError localAbstractMethodError)
      {
        Log.e("ViewCompat", paramView.getParent().getClass().getSimpleName().concat(" does not fully implement ViewParent"), localAbstractMethodError);
        return;
      }
    }
    Object localObject4 = AccessibilityEvent.obtain();
    if (i == 0) {
      j = 2048;
    }
    ((AccessibilityEvent)localObject4).setEventType(j);
    ((AccessibilityEvent)localObject4).setContentChangeTypes(paramInt);
    if (i != 0)
    {
      localObject5 = ((AccessibilityRecord)localObject4).getText();
      Object localObject2;
      if (k >= 28)
      {
        localObject2 = m.format(paramView);
      }
      else
      {
        localObject3 = paramView.getTag(2131230880);
        localObject2 = localAccessibilityEvent;
        if (CharSequence.class.isInstance(localObject3)) {
          localObject2 = localObject3;
        }
      }
      ((List)localObject5).add((CharSequence)localObject2);
      if (paramView.getImportantForAccessibility() == 0) {
        paramView.setImportantForAccessibility(1);
      }
    }
    paramView.sendAccessibilityEventUnchecked((AccessibilityEvent)localObject4);
  }
  
  public static void init(android.view.View paramView, Context paramContext, int[] paramArrayOfInt, AttributeSet paramAttributeSet, TypedArray paramTypedArray, int paramInt)
  {
    if (Build.VERSION.SDK_INT >= 29) {
      Field.init(paramView, paramContext, paramArrayOfInt, paramAttributeSet, paramTypedArray, paramInt, 0);
    }
  }
  
  public static void onInitializeAccessibilityNodeInfo(android.view.View paramView, AccessibilityDelegateCompat paramAccessibilityDelegateCompat)
  {
    AccessibilityDelegateCompat localAccessibilityDelegateCompat = paramAccessibilityDelegateCompat;
    if (paramAccessibilityDelegateCompat == null)
    {
      localAccessibilityDelegateCompat = paramAccessibilityDelegateCompat;
      if ((getMinimumWidth(paramView) instanceof AccessibilityDelegateCompatJellyBean.1)) {
        localAccessibilityDelegateCompat = new AccessibilityDelegateCompat();
      }
    }
    if (paramView.getImportantForAccessibility() == 0) {
      paramView.setImportantForAccessibility(1);
    }
    if (localAccessibilityDelegateCompat == null) {
      paramAccessibilityDelegateCompat = null;
    } else {
      paramAccessibilityDelegateCompat = mBridge;
    }
    paramView.setAccessibilityDelegate(paramAccessibilityDelegateCompat);
  }
}
