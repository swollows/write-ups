package views;

import android.text.Spannable;
import android.text.SpannableString;
import android.view.MenuItem;
import android.view.ViewGroup;
import android.view.Window;
import androidx.appcompat.app.AppCompatCallback;
import androidx.appcompat.app.AppCompatDelegateImplV7;
import androidx.appcompat.app.DefaultItemAnimator.6;
import app.Element;
import app.ViewCompat;
import app.ViewPropertyAnimatorCompat;
import asm.Attribute;
import asm.ByteVector;
import asm.Segment;
import asm.e;
import java.nio.Buffer;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.util.ArrayList;
import java.util.WeakHashMap;
import no.l3akctf.pricelessl3ak.v27a8612b;
import view.ActionMode;
import view.ActionMode.Callback;

public final class i
  implements e, ActionMode.Callback
{
  public Object a;
  public Object b;
  
  public static byte[] parse(byte[] paramArrayOfByte, long paramLong)
  {
    paramArrayOfByte = (byte[])paramArrayOfByte.clone();
    int i = paramArrayOfByte.length - 1;
    while (i >= 1)
    {
      paramArrayOfByte[i] = ((byte)(paramArrayOfByte[i] ^ paramArrayOfByte[(i - 1)]));
      i -= 1;
    }
    int k = 0;
    i = 0;
    int j;
    while (i < paramArrayOfByte.length)
    {
      j = i % 7 + 1;
      int m = paramArrayOfByte[i] & 0xFF;
      paramArrayOfByte[i] = ((byte)((m << 8 - j | m >>> j) & 0xFF));
      i += 1;
    }
    i = 0;
    for (;;)
    {
      j = k;
      if (i >= paramArrayOfByte.length) {
        break;
      }
      j = (int)(0xFF & paramLong);
      paramArrayOfByte[i] = ((byte)(paramArrayOfByte[i] - (i * 19 + j & 0xFF) & 0xFF));
      i += 1;
    }
    while (j < paramArrayOfByte.length)
    {
      paramArrayOfByte[j] = ((byte)((int)(paramLong >> j % 4 * 8 & 0xFF) ^ paramArrayOfByte[j]));
      j += 1;
    }
    return paramArrayOfByte;
  }
  
  public static ArrayList read(byte[] paramArrayOfByte)
  {
    ArrayList localArrayList = new ArrayList();
    paramArrayOfByte = ByteBuffer.wrap(paramArrayOfByte);
    paramArrayOfByte.order(ByteOrder.LITTLE_ENDIAN);
    while (paramArrayOfByte.remaining() >= 7) {
      localArrayList.add(new v27a8612b(paramArrayOfByte.get() & 0xFF, paramArrayOfByte.get() & 0xFF, paramArrayOfByte.get() & 0xFF, paramArrayOfByte.getInt()));
    }
    if (!localArrayList.isEmpty()) {
      return localArrayList;
    }
    throw new Exception("?");
  }
  
  public Object a()
  {
    return (Segment)a;
  }
  
  public void a(app.f paramF, String paramString, ArrayList paramArrayList)
  {
    throw new Runtime("d2j fail translate: java.lang.RuntimeException: \n\tat com.googlecode.dex2jar.ir.ts.NewTransformer.transform(NewTransformer.java:134)\n\tat com.googlecode.d2j.dex.Dex2jar$2.optimize(Dex2jar.java:148)\n\tat com.googlecode.d2j.dex.Dex2Asm.convertCode(Dex2Asm.java:414)\n\tat com.googlecode.d2j.dex.ExDex2Asm.convertCode(ExDex2Asm.java:42)\n\tat com.googlecode.d2j.dex.Dex2jar$2.convertCode(Dex2jar.java:128)\n\tat com.googlecode.d2j.dex.Dex2Asm.convertMethod(Dex2Asm.java:509)\n\tat com.googlecode.d2j.dex.Dex2Asm.convertClass(Dex2Asm.java:406)\n\tat com.googlecode.d2j.dex.Dex2Asm.convertDex(Dex2Asm.java:422)\n\tat com.googlecode.d2j.dex.Dex2jar.doTranslate(Dex2jar.java:172)\n\tat com.googlecode.d2j.dex.Dex2jar.to(Dex2jar.java:272)\n\tat com.googlecode.dex2jar.tools.Dex2jarCmd.doCommandLine(Dex2jarCmd.java:108)\n\tat com.googlecode.dex2jar.tools.BaseCmd.doMain(BaseCmd.java:288)\n\tat com.googlecode.dex2jar.tools.Dex2jarCmd.main(Dex2jarCmd.java:32)\n");
  }
  
  public boolean a(CharSequence paramCharSequence, int paramInt1, int paramInt2, Attribute paramAttribute)
  {
    if ((b & 0x4) > 0) {
      return true;
    }
    if ((Segment)a == null)
    {
      if ((paramCharSequence instanceof Spannable)) {
        paramCharSequence = (Spannable)paramCharSequence;
      } else {
        paramCharSequence = new SpannableString(paramCharSequence);
      }
      a = new Segment((Spannable)paramCharSequence);
    }
    ((Element)b).getClass();
    paramCharSequence = new ByteVector(paramAttribute);
    ((Segment)a).setSpan(paramCharSequence, paramInt1, paramInt2, 33);
    return true;
  }
  
  public void add(Type paramType)
  {
    int i = c;
    AbstractIdleService.1 local1 = (AbstractIdleService.1)b;
    app.f localF = (app.f)a;
    if (i == 0)
    {
      local1.execute(new Matrix(localF, a, 0));
      return;
    }
    local1.execute(new NumberPicker(localF, i));
  }
  
  public boolean onActionItemClicked(ActionMode paramActionMode, MenuItem paramMenuItem)
  {
    return ((ActionMode.Callback)a).onActionItemClicked(paramActionMode, paramMenuItem);
  }
  
  public boolean onCreateActionMode(ActionMode paramActionMode, menu.f paramF)
  {
    return ((ActionMode.Callback)a).onCreateActionMode(paramActionMode, paramF);
  }
  
  public void onDestroyActionMode(ActionMode paramActionMode)
  {
    ((ActionMode.Callback)a).onDestroyActionMode(paramActionMode);
    paramActionMode = (AppCompatDelegateImplV7)b;
    if (mActionModePopup != null) {
      mWindow.getDecorView().removeCallbacks(mShowActionModePopup);
    }
    if (mActionModeView != null)
    {
      localObject1 = mFadeAnim;
      if (localObject1 != null) {
        ((ViewPropertyAnimatorCompat)localObject1).cancel();
      }
      localObject1 = ViewCompat.animate(mActionModeView);
      ((ViewPropertyAnimatorCompat)localObject1).alpha(0.0F);
      mFadeAnim = ((ViewPropertyAnimatorCompat)localObject1);
      ((ViewPropertyAnimatorCompat)localObject1).setListener(new DefaultItemAnimator.6(2, this));
    }
    Object localObject1 = mActivity;
    Object localObject2 = mActionMode;
    ((AppCompatCallback)localObject1).onSupportActionModeFinished((ActionMode)localObject2);
    mActionMode = null;
    localObject1 = mSubDecor;
    localObject2 = ViewCompat.this$0;
    app.View.requestApplyInsets((android.view.View)localObject1);
    paramActionMode.d();
  }
  
  public boolean onPrepareActionMode(ActionMode paramActionMode, menu.f paramF)
  {
    ViewGroup localViewGroup = b).mSubDecor;
    WeakHashMap localWeakHashMap = ViewCompat.this$0;
    app.View.requestApplyInsets(localViewGroup);
    return ((ActionMode.Callback)a).onPrepareActionMode(paramActionMode, paramF);
  }
}
