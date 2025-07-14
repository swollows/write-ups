package nonstiff;

import androidx.fragment.asm.FragmentActivity;
import androidx.lifecycle.PieChart;
import androidx.lifecycle.g;

public final class LoaderManagerImpl
  extends LoaderManager
{
  public final FragmentActivity mActivity;
  
  public LoaderManagerImpl(FragmentActivity paramFragmentActivity, PieChart paramPieChart)
  {
    super();
    mActivity = paramFragmentActivity;
    paramFragmentActivity = (c)new g(paramPieChart, c.c).a(O.c.class);
  }
  
  public final String toString()
  {
    StringBuilder localStringBuilder = new StringBuilder(128);
    localStringBuilder.append("LoaderManager{");
    localStringBuilder.append(Integer.toHexString(System.identityHashCode(this)));
    localStringBuilder.append(" in ");
    FragmentActivity localFragmentActivity = mActivity;
    String str2 = localFragmentActivity.getClass().getSimpleName();
    String str1 = str2;
    if (str2.length() <= 0)
    {
      str2 = localFragmentActivity.getClass().getName();
      str1 = str2;
      int i = str2.lastIndexOf('.');
      if (i > 0) {
        str1 = str2.substring(i + 1);
      }
    }
    localStringBuilder.append(str1);
    localStringBuilder.append('{');
    localStringBuilder.append(Integer.toHexString(System.identityHashCode(localFragmentActivity)));
    localStringBuilder.append("}}");
    return localStringBuilder.toString();
  }
}
