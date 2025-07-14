package androidx.appcompat.widget;

import android.app.Activity;
import android.content.ContextWrapper;
import android.content.res.ColorStateList;
import android.graphics.PorterDuff.Mode;
import android.graphics.drawable.Drawable;
import android.os.Build.VERSION;
import android.text.Editable;
import android.text.method.KeyListener;
import android.util.AttributeSet;
import android.util.Log;
import android.view.ActionMode.Callback;
import android.view.DragEvent;
import android.view.View;
import android.view.inputmethod.EditorInfo;
import android.view.inputmethod.InputConnection;
import android.view.inputmethod.InputMethodManager;
import android.view.textclassifier.TextClassifier;
import android.widget.EditText;
import android.widget.TextView;
import androidx.core.widget.b;
import app.Item;
import app.ViewCompat;
import app.x;

public final class AppCompatEditText
  extends EditText
  implements x
{
  public final ClassWriter a;
  public final b e;
  public final Label i;
  public final Label k;
  public ChildNumber mBackgroundTint;
  public final AppCompatBackgroundHelper mBackgroundTintHelper;
  
  public AppCompatEditText(android.content.Context paramContext, AttributeSet paramAttributeSet) {}
  
  private ChildNumber getSuperCaller()
  {
    if (mBackgroundTint == null) {
      mBackgroundTint = new ChildNumber(this);
    }
    return mBackgroundTint;
  }
  
  public final Item a(Item paramItem)
  {
    e.getClass();
    return b.a(this, paramItem);
  }
  
  public final void drawableStateChanged()
  {
    super.drawableStateChanged();
    Object localObject = mBackgroundTintHelper;
    if (localObject != null) {
      ((AppCompatBackgroundHelper)localObject).applySupportBackgroundTint();
    }
    localObject = a;
    if (localObject != null) {
      ((ClassWriter)localObject).a();
    }
  }
  
  public ActionMode.Callback getCustomSelectionActionModeCallback()
  {
    return drupal.Context.onAnimationEnd(super.getCustomSelectionActionModeCallback());
  }
  
  public ColorStateList getSupportBackgroundTintList()
  {
    AppCompatBackgroundHelper localAppCompatBackgroundHelper = mBackgroundTintHelper;
    if (localAppCompatBackgroundHelper != null) {
      return localAppCompatBackgroundHelper.getSupportBackgroundTintList();
    }
    return null;
  }
  
  public PorterDuff.Mode getSupportBackgroundTintMode()
  {
    AppCompatBackgroundHelper localAppCompatBackgroundHelper = mBackgroundTintHelper;
    if (localAppCompatBackgroundHelper != null) {
      return localAppCompatBackgroundHelper.getSupportBackgroundTintMode();
    }
    return null;
  }
  
  public ColorStateList getSupportCompoundDrawablesTintList()
  {
    return a.getFormattedDate();
  }
  
  public PorterDuff.Mode getSupportCompoundDrawablesTintMode()
  {
    return a.getDay();
  }
  
  public Editable getText()
  {
    if (Build.VERSION.SDK_INT >= 28) {
      return super.getText();
    }
    return getEditableText();
  }
  
  public TextClassifier getTextClassifier()
  {
    if (Build.VERSION.SDK_INT < 28)
    {
      Label localLabel = k;
      if (localLabel != null)
      {
        TextClassifier localTextClassifier2 = (TextClassifier)k;
        localTextClassifier1 = localTextClassifier2;
        if (localTextClassifier2 != null) {
          return localTextClassifier1;
        }
        return ImageHelper.showError((TextView)i);
      }
    }
    TextClassifier localTextClassifier1 = getSuperCalleri.getTextClassifier();
    return localTextClassifier1;
  }
  
  public final InputConnection onCreateInputConnection(EditorInfo paramEditorInfo)
  {
    throw new Runtime("d2j fail translate: java.lang.RuntimeException: fail exe a8 = a7\n\tat com.googlecode.dex2jar.ir.ts.an.BaseAnalyze.exec(BaseAnalyze.java:92)\n\tat com.googlecode.dex2jar.ir.ts.an.BaseAnalyze.exec(BaseAnalyze.java:1)\n\tat com.googlecode.dex2jar.ir.ts.Cfg.dfs(Cfg.java:255)\n\tat com.googlecode.dex2jar.ir.ts.an.BaseAnalyze.analyze0(BaseAnalyze.java:75)\n\tat com.googlecode.dex2jar.ir.ts.an.BaseAnalyze.analyze(BaseAnalyze.java:69)\n\tat com.googlecode.dex2jar.ir.ts.UnSSATransformer.transform(UnSSATransformer.java:274)\n\tat com.googlecode.d2j.dex.Dex2jar$2.optimize(Dex2jar.java:163)\n\tat com.googlecode.d2j.dex.Dex2Asm.convertCode(Dex2Asm.java:414)\n\tat com.googlecode.d2j.dex.ExDex2Asm.convertCode(ExDex2Asm.java:42)\n\tat com.googlecode.d2j.dex.Dex2jar$2.convertCode(Dex2jar.java:128)\n\tat com.googlecode.d2j.dex.Dex2Asm.convertMethod(Dex2Asm.java:509)\n\tat com.googlecode.d2j.dex.Dex2Asm.convertClass(Dex2Asm.java:406)\n\tat com.googlecode.d2j.dex.Dex2Asm.convertDex(Dex2Asm.java:422)\n\tat com.googlecode.d2j.dex.Dex2jar.doTranslate(Dex2jar.java:172)\n\tat com.googlecode.d2j.dex.Dex2jar.to(Dex2jar.java:272)\n\tat com.googlecode.dex2jar.tools.Dex2jarCmd.doCommandLine(Dex2jarCmd.java:108)\n\tat com.googlecode.dex2jar.tools.BaseCmd.doMain(BaseCmd.java:288)\n\tat com.googlecode.dex2jar.tools.Dex2jarCmd.main(Dex2jarCmd.java:32)\nCaused by: java.lang.NullPointerException\n\tat com.googlecode.dex2jar.ir.ts.UnSSATransformer$LiveA.onUseLocal(UnSSATransformer.java:552)\n\tat com.googlecode.dex2jar.ir.ts.UnSSATransformer$LiveA.onUseLocal(UnSSATransformer.java:1)\n\tat com.googlecode.dex2jar.ir.ts.an.BaseAnalyze.onUse(BaseAnalyze.java:166)\n\tat com.googlecode.dex2jar.ir.ts.an.BaseAnalyze.onUse(BaseAnalyze.java:1)\n\tat com.googlecode.dex2jar.ir.ts.Cfg.travel(Cfg.java:331)\n\tat com.googlecode.dex2jar.ir.ts.Cfg.travel(Cfg.java:387)\n\tat com.googlecode.dex2jar.ir.ts.an.BaseAnalyze.exec(BaseAnalyze.java:90)\n\t... 17 more\n");
  }
  
  public final void onDetachedFromWindow()
  {
    super.onDetachedFromWindow();
    int j = Build.VERSION.SDK_INT;
    if ((j >= 30) && (j < 33)) {
      ((InputMethodManager)getContext().getSystemService("input_method")).isActive(this);
    }
  }
  
  public final boolean onDragEvent(DragEvent paramDragEvent)
  {
    int j = Build.VERSION.SDK_INT;
    boolean bool2 = false;
    boolean bool1 = bool2;
    if (j < 31)
    {
      bool1 = bool2;
      if (paramDragEvent.getLocalState() == null) {
        if (ViewCompat.doInBackground(this) == null)
        {
          bool1 = bool2;
        }
        else
        {
          for (Object localObject = getContext(); (localObject instanceof ContextWrapper); localObject = ((ContextWrapper)localObject).getBaseContext()) {
            if ((localObject instanceof Activity))
            {
              localObject = (Activity)localObject;
              break label87;
            }
          }
          localObject = null;
          label87:
          if (localObject == null)
          {
            localObject = new StringBuilder("Can't handle drop: no activity: view=");
            ((StringBuilder)localObject).append(this);
            Log.i("ReceiveContent", ((StringBuilder)localObject).toString());
            bool1 = bool2;
          }
          else if (paramDragEvent.getAction() == 1)
          {
            bool1 = bool2;
          }
          else
          {
            bool1 = bool2;
            if (paramDragEvent.getAction() == 3) {
              bool1 = SignatureReader.a(paramDragEvent, this, (Activity)localObject);
            }
          }
        }
      }
    }
    if (bool1) {
      return true;
    }
    return super.onDragEvent(paramDragEvent);
  }
  
  public final boolean onTextContextMenuItem(int paramInt)
  {
    throw new Runtime("d2j fail translate: java.lang.RuntimeException: fail exe a8 = a7\n\tat com.googlecode.dex2jar.ir.ts.an.BaseAnalyze.exec(BaseAnalyze.java:92)\n\tat com.googlecode.dex2jar.ir.ts.an.BaseAnalyze.exec(BaseAnalyze.java:1)\n\tat com.googlecode.dex2jar.ir.ts.Cfg.dfs(Cfg.java:255)\n\tat com.googlecode.dex2jar.ir.ts.an.BaseAnalyze.analyze0(BaseAnalyze.java:75)\n\tat com.googlecode.dex2jar.ir.ts.an.BaseAnalyze.analyze(BaseAnalyze.java:69)\n\tat com.googlecode.dex2jar.ir.ts.UnSSATransformer.transform(UnSSATransformer.java:274)\n\tat com.googlecode.d2j.dex.Dex2jar$2.optimize(Dex2jar.java:163)\n\tat com.googlecode.d2j.dex.Dex2Asm.convertCode(Dex2Asm.java:414)\n\tat com.googlecode.d2j.dex.ExDex2Asm.convertCode(ExDex2Asm.java:42)\n\tat com.googlecode.d2j.dex.Dex2jar$2.convertCode(Dex2jar.java:128)\n\tat com.googlecode.d2j.dex.Dex2Asm.convertMethod(Dex2Asm.java:509)\n\tat com.googlecode.d2j.dex.Dex2Asm.convertClass(Dex2Asm.java:406)\n\tat com.googlecode.d2j.dex.Dex2Asm.convertDex(Dex2Asm.java:422)\n\tat com.googlecode.d2j.dex.Dex2jar.doTranslate(Dex2jar.java:172)\n\tat com.googlecode.d2j.dex.Dex2jar.to(Dex2jar.java:272)\n\tat com.googlecode.dex2jar.tools.Dex2jarCmd.doCommandLine(Dex2jarCmd.java:108)\n\tat com.googlecode.dex2jar.tools.BaseCmd.doMain(BaseCmd.java:288)\n\tat com.googlecode.dex2jar.tools.Dex2jarCmd.main(Dex2jarCmd.java:32)\nCaused by: java.lang.NullPointerException\n\tat com.googlecode.dex2jar.ir.ts.UnSSATransformer$LiveA.onUseLocal(UnSSATransformer.java:552)\n\tat com.googlecode.dex2jar.ir.ts.UnSSATransformer$LiveA.onUseLocal(UnSSATransformer.java:1)\n\tat com.googlecode.dex2jar.ir.ts.an.BaseAnalyze.onUse(BaseAnalyze.java:166)\n\tat com.googlecode.dex2jar.ir.ts.an.BaseAnalyze.onUse(BaseAnalyze.java:1)\n\tat com.googlecode.dex2jar.ir.ts.Cfg.travel(Cfg.java:331)\n\tat com.googlecode.dex2jar.ir.ts.Cfg.travel(Cfg.java:387)\n\tat com.googlecode.dex2jar.ir.ts.an.BaseAnalyze.exec(BaseAnalyze.java:90)\n\t... 17 more\n");
  }
  
  public void setBackgroundDrawable(Drawable paramDrawable)
  {
    super.setBackgroundDrawable(paramDrawable);
    paramDrawable = mBackgroundTintHelper;
    if (paramDrawable != null) {
      paramDrawable.setSupportBackgroundTintList();
    }
  }
  
  public void setBackgroundResource(int paramInt)
  {
    super.setBackgroundResource(paramInt);
    AppCompatBackgroundHelper localAppCompatBackgroundHelper = mBackgroundTintHelper;
    if (localAppCompatBackgroundHelper != null) {
      localAppCompatBackgroundHelper.loadFromAttributes(paramInt);
    }
  }
  
  public final void setCompoundDrawables(Drawable paramDrawable1, Drawable paramDrawable2, Drawable paramDrawable3, Drawable paramDrawable4)
  {
    super.setCompoundDrawables(paramDrawable1, paramDrawable2, paramDrawable3, paramDrawable4);
    paramDrawable1 = a;
    if (paramDrawable1 != null) {
      paramDrawable1.a();
    }
  }
  
  public final void setCompoundDrawablesRelative(Drawable paramDrawable1, Drawable paramDrawable2, Drawable paramDrawable3, Drawable paramDrawable4)
  {
    super.setCompoundDrawablesRelative(paramDrawable1, paramDrawable2, paramDrawable3, paramDrawable4);
    paramDrawable1 = a;
    if (paramDrawable1 != null) {
      paramDrawable1.a();
    }
  }
  
  public void setCustomSelectionActionModeCallback(ActionMode.Callback paramCallback)
  {
    super.setCustomSelectionActionModeCallback(drupal.Context.a(paramCallback, this));
  }
  
  public void setEmojiCompatEnabled(boolean paramBoolean)
  {
    i.a(paramBoolean);
  }
  
  public void setKeyListener(KeyListener paramKeyListener)
  {
    super.setKeyListener(i.a(paramKeyListener));
  }
  
  public void setSupportBackgroundTintList(ColorStateList paramColorStateList)
  {
    AppCompatBackgroundHelper localAppCompatBackgroundHelper = mBackgroundTintHelper;
    if (localAppCompatBackgroundHelper != null) {
      localAppCompatBackgroundHelper.setSupportBackgroundTintList(paramColorStateList);
    }
  }
  
  public void setSupportBackgroundTintMode(PorterDuff.Mode paramMode)
  {
    AppCompatBackgroundHelper localAppCompatBackgroundHelper = mBackgroundTintHelper;
    if (localAppCompatBackgroundHelper != null) {
      localAppCompatBackgroundHelper.setSupportBackgroundTintMode(paramMode);
    }
  }
  
  public void setSupportCompoundDrawablesTintList(ColorStateList paramColorStateList)
  {
    ClassWriter localClassWriter = a;
    localClassWriter.init(paramColorStateList);
    localClassWriter.a();
  }
  
  public void setSupportCompoundDrawablesTintMode(PorterDuff.Mode paramMode)
  {
    ClassWriter localClassWriter = a;
    localClassWriter.init(paramMode);
    localClassWriter.a();
  }
  
  public final void setTextAppearance(android.content.Context paramContext, int paramInt)
  {
    super.setTextAppearance(paramContext, paramInt);
    ClassWriter localClassWriter = a;
    if (localClassWriter != null) {
      localClassWriter.init(paramContext, paramInt);
    }
  }
  
  public void setTextClassifier(TextClassifier paramTextClassifier)
  {
    if (Build.VERSION.SDK_INT < 28)
    {
      Label localLabel = k;
      if (localLabel != null)
      {
        k = paramTextClassifier;
        return;
      }
    }
    getSuperCalleri.setTextClassifier(paramTextClassifier);
  }
}
