package androidx.fragment.asm;

import android.util.Log;
import java.io.PrintWriter;
import java.util.ArrayList;

public final class m
{
  public final ArrayList a = new ArrayList();
  public int b;
  public int c;
  public int d;
  public int e;
  public boolean f;
  public int g;
  public int h;
  public CharSequence k;
  public CharSequence l;
  public ArrayList m;
  public ArrayList n;
  public int p = -1;
  public String q;
  public boolean r = false;
  public final i t;
  public int y;
  
  public m(i paramI)
  {
    t = paramI;
  }
  
  public final void a(int paramInt)
  {
    if (!f) {
      return;
    }
    if (Log.isLoggable("FragmentManager", 2))
    {
      localObject = new StringBuilder("Bump nesting in ");
      ((StringBuilder)localObject).append(this);
      ((StringBuilder)localObject).append(" by ");
      ((StringBuilder)localObject).append(paramInt);
      Log.v("FragmentManager", ((StringBuilder)localObject).toString());
    }
    Object localObject = a;
    int i = ((ArrayList)localObject).size();
    paramInt = 0;
    while (paramInt < i)
    {
      ((l)((ArrayList)localObject).get(paramInt)).getClass();
      paramInt += 1;
    }
  }
  
  public final void a(ArrayList paramArrayList1, ArrayList paramArrayList2)
  {
    if (Log.isLoggable("FragmentManager", 2))
    {
      StringBuilder localStringBuilder = new StringBuilder("Run: ");
      localStringBuilder.append(this);
      Log.v("FragmentManager", localStringBuilder.toString());
    }
    paramArrayList1.add(this);
    paramArrayList2.add(Boolean.FALSE);
    if (f)
    {
      paramArrayList1 = t;
      if (m == null) {
        m = new ArrayList();
      }
      m.add(this);
    }
  }
  
  public final void dump(String paramString, PrintWriter paramPrintWriter, boolean paramBoolean)
  {
    int i = 0;
    if (paramBoolean)
    {
      paramPrintWriter.print(paramString);
      paramPrintWriter.print("mName=");
      paramPrintWriter.print(q);
      paramPrintWriter.print(" mIndex=");
      paramPrintWriter.print(p);
      paramPrintWriter.print(" mCommitted=");
      paramPrintWriter.println(false);
      if (g != 0)
      {
        paramPrintWriter.print(paramString);
        paramPrintWriter.print("mTransition=#");
        paramPrintWriter.print(Integer.toHexString(g));
      }
      if ((c != 0) || (b != 0))
      {
        paramPrintWriter.print(paramString);
        paramPrintWriter.print("mEnterAnim=#");
        paramPrintWriter.print(Integer.toHexString(c));
        paramPrintWriter.print(" mExitAnim=#");
        paramPrintWriter.println(Integer.toHexString(b));
      }
      if ((d != 0) || (e != 0))
      {
        paramPrintWriter.print(paramString);
        paramPrintWriter.print("mPopEnterAnim=#");
        paramPrintWriter.print(Integer.toHexString(d));
        paramPrintWriter.print(" mPopExitAnim=#");
        paramPrintWriter.println(Integer.toHexString(e));
      }
      if ((h != 0) || (k != null))
      {
        paramPrintWriter.print(paramString);
        paramPrintWriter.print("mBreadCrumbTitleRes=#");
        paramPrintWriter.print(Integer.toHexString(h));
        paramPrintWriter.print(" mBreadCrumbTitleText=");
        paramPrintWriter.println(k);
      }
      if ((y != 0) || (l != null))
      {
        paramPrintWriter.print(paramString);
        paramPrintWriter.print("mBreadCrumbShortTitleRes=#");
        paramPrintWriter.print(Integer.toHexString(y));
        paramPrintWriter.print(" mBreadCrumbShortTitleText=");
        paramPrintWriter.println(l);
      }
    }
    ArrayList localArrayList = a;
    if (!localArrayList.isEmpty())
    {
      paramPrintWriter.print(paramString);
      paramPrintWriter.println("Operations:");
      int j = localArrayList.size();
      while (i < j)
      {
        l localL = (l)localArrayList.get(i);
        Object localObject;
        switch (i)
        {
        default: 
          localObject = new StringBuilder("cmd=");
          ((StringBuilder)localObject).append(i);
          localObject = ((StringBuilder)localObject).toString();
          break;
        case 10: 
          localObject = "OP_SET_MAX_LIFECYCLE";
          break;
        case 9: 
          localObject = "UNSET_PRIMARY_NAV";
          break;
        case 8: 
          localObject = "SET_PRIMARY_NAV";
          break;
        case 7: 
          localObject = "ATTACH";
          break;
        case 6: 
          localObject = "DETACH";
          break;
        case 5: 
          localObject = "SHOW";
          break;
        case 4: 
          localObject = "HIDE";
          break;
        case 3: 
          localObject = "REMOVE";
          break;
        case 2: 
          localObject = "REPLACE";
          break;
        case 1: 
          localObject = "ADD";
          break;
        case 0: 
          localObject = "NULL";
        }
        paramPrintWriter.print(paramString);
        paramPrintWriter.print("  Op #");
        paramPrintWriter.print(i);
        paramPrintWriter.print(": ");
        paramPrintWriter.print((String)localObject);
        paramPrintWriter.print(" ");
        paramPrintWriter.println(null);
        if (paramBoolean)
        {
          if ((c != 0) || (b != 0))
          {
            paramPrintWriter.print(paramString);
            paramPrintWriter.print("enterAnim=#");
            paramPrintWriter.print(Integer.toHexString(c));
            paramPrintWriter.print(" exitAnim=#");
            paramPrintWriter.println(Integer.toHexString(b));
          }
          if ((d != 0) || (e != 0))
          {
            paramPrintWriter.print(paramString);
            paramPrintWriter.print("popEnterAnim=#");
            paramPrintWriter.print(Integer.toHexString(d));
            paramPrintWriter.print(" popExitAnim=#");
            paramPrintWriter.println(Integer.toHexString(e));
          }
        }
        i += 1;
      }
    }
  }
  
  public final String toString()
  {
    StringBuilder localStringBuilder = new StringBuilder(128);
    localStringBuilder.append("BackStackEntry{");
    localStringBuilder.append(Integer.toHexString(System.identityHashCode(this)));
    if (p >= 0)
    {
      localStringBuilder.append(" #");
      localStringBuilder.append(p);
    }
    if (q != null)
    {
      localStringBuilder.append(" ");
      localStringBuilder.append(q);
    }
    localStringBuilder.append("}");
    return localStringBuilder.toString();
  }
}
