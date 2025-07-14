package app;

import H.A;
import android.content.pm.PackageInfo;
import android.content.pm.PackageManager;
import android.content.pm.Signature;
import android.text.Editable;
import android.text.Selection;
import android.text.Spanned;
import android.util.Log;
import android.view.inputmethod.InputConnectionWrapper;
import asm.ByteVector;
import core.Menu;
import java.io.Serializable;
import network.c;

public class Element
  implements NumberPicker.Formatter, Menu
{
  public static Element content;
  
  public static boolean convert(c paramC, Editable paramEditable, int paramInt1, int paramInt2, boolean paramBoolean)
  {
    if ((paramEditable != null) && (paramInt1 >= 0))
    {
      if (paramInt2 < 0) {
        return false;
      }
      int i1 = Selection.getSelectionStart(paramEditable);
      int i = i1;
      int m = Selection.getSelectionEnd(paramEditable);
      int j = m;
      if ((i1 != -1) && (m != -1))
      {
        if (i1 != m) {
          return false;
        }
        int k;
        if (paramBoolean)
        {
          int n = Math.max(paramInt1, 0);
          k = n;
          paramInt1 = paramEditable.length();
          if ((i1 >= 0) && (paramInt1 >= i1))
          {
            paramInt1 = i;
            i = k;
            if (n >= 0) {}
          }
          else
          {
            paramInt1 = -1;
            break label209;
          }
          label109:
          k = 0;
          char c;
          for (;;)
          {
            if (i == 0) {
              break label209;
            }
            paramInt1 -= 1;
            if (paramInt1 < 0)
            {
              if (k != 0) {
                break;
              }
              paramInt1 = 0;
              break label209;
            }
            c = paramEditable.charAt(paramInt1);
            if (k != 0)
            {
              if (!Character.isHighSurrogate(c)) {
                break;
              }
              i -= 1;
              break label109;
            }
            if (!Character.isSurrogate(c))
            {
              i -= 1;
            }
            else
            {
              if (Character.isHighSurrogate(c)) {
                break;
              }
              k = 1;
            }
          }
          label209:
          i1 = Math.max(paramInt2, 0);
          i = i1;
          n = paramEditable.length();
          k = n;
          if ((m >= 0) && (n >= m))
          {
            paramInt2 = j;
            if (i1 >= 0) {}
          }
          else
          {
            paramInt2 = -1;
            break label368;
          }
          label260:
          j = 0;
          for (;;)
          {
            if (i == 0) {
              break label368;
            }
            if (paramInt2 >= n)
            {
              paramInt2 = k;
              if (j == 0) {
                break label368;
              }
              break;
            }
            c = paramEditable.charAt(paramInt2);
            if (j != 0)
            {
              if (!Character.isLowSurrogate(c)) {
                break;
              }
              i -= 1;
              paramInt2 += 1;
              break label260;
            }
            if (!Character.isSurrogate(c))
            {
              i -= 1;
              paramInt2 += 1;
            }
            else
            {
              if (Character.isLowSurrogate(c)) {
                break;
              }
              paramInt2 += 1;
              j = 1;
            }
          }
          label368:
          if (paramInt1 == -1) {
            break label535;
          }
          i = paramInt2;
          if (paramInt2 == -1) {
            return false;
          }
        }
        else
        {
          paramInt1 = Math.max(i1 - paramInt1, 0);
          i = Math.min(m + paramInt2, paramEditable.length());
        }
        ByteVector[] arrayOfByteVector = (ByteVector[])paramEditable.getSpans(paramInt1, i, A.class);
        if ((arrayOfByteVector != null) && (arrayOfByteVector.length > 0))
        {
          j = arrayOfByteVector.length;
          paramInt2 = 0;
          while (paramInt2 < j)
          {
            ByteVector localByteVector = arrayOfByteVector[paramInt2];
            m = paramEditable.getSpanStart(localByteVector);
            k = paramEditable.getSpanEnd(localByteVector);
            paramInt1 = Math.min(m, paramInt1);
            i = Math.max(k, i);
            paramInt2 += 1;
          }
          paramInt1 = Math.max(paramInt1, 0);
          paramInt2 = Math.min(i, paramEditable.length());
          paramC.beginBatchEdit();
          paramEditable.delete(paramInt1, paramInt2);
          paramC.endBatchEdit();
          return true;
        }
      }
    }
    label535:
    return false;
  }
  
  private final void setData(int paramInt, Serializable paramSerializable) {}
  
  private final void setQName() {}
  
  public void add(int paramInt, Serializable paramSerializable)
  {
    switch (attributes)
    {
    default: 
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
      if ((paramInt != 6) && (paramInt != 7) && (paramInt != 8))
      {
        Log.d("ProfileInstaller", str);
        return;
      }
      Log.e("ProfileInstaller", str, (Throwable)paramSerializable);
    }
  }
  
  public void clear()
  {
    switch (attributes)
    {
    default: 
      Log.d("ProfileInstaller", "DIAGNOSTIC_PROFILE_IS_COMPRESSED");
    }
  }
  
  public void format(int paramInt1, int paramInt2, int paramInt3, boolean paramBoolean) {}
  
  public Signature[] getSignature(PackageManager paramPackageManager, String paramString)
  {
    return getPackageInfo64signatures;
  }
  
  public boolean init(CharSequence paramCharSequence)
  {
    return false;
  }
  
  public void toString(int paramInt1, int paramInt2, int paramInt3, int paramInt4) {}
}
