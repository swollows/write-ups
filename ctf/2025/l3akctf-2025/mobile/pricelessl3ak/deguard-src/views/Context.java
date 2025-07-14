package views;

import android.util.Base64;
import java.util.List;

public final class Context
{
  public final String b;
  public final String c;
  public final String d;
  public final List e;
  public final String s;
  
  public Context(String paramString1, String paramString2, String paramString3, List paramList)
  {
    paramString1.getClass();
    b = paramString1;
    paramString2.getClass();
    c = paramString2;
    s = paramString3;
    paramList.getClass();
    e = paramList;
    paramList = new StringBuilder();
    paramList.append(paramString1);
    paramList.append("-");
    paramList.append(paramString2);
    paramList.append("-");
    paramList.append(paramString3);
    d = paramList.toString();
  }
  
  public final String toString()
  {
    StringBuilder localStringBuilder = new StringBuilder();
    Object localObject = new StringBuilder("FontRequest {mProviderAuthority: ");
    ((StringBuilder)localObject).append(b);
    ((StringBuilder)localObject).append(", mProviderPackage: ");
    ((StringBuilder)localObject).append(c);
    ((StringBuilder)localObject).append(", mQuery: ");
    ((StringBuilder)localObject).append(s);
    ((StringBuilder)localObject).append(", mCertificates:");
    localStringBuilder.append(((StringBuilder)localObject).toString());
    int i = 0;
    for (;;)
    {
      localObject = e;
      if (i >= ((List)localObject).size()) {
        break;
      }
      localStringBuilder.append(" [");
      localObject = (List)((List)localObject).get(i);
      int j = 0;
      while (j < ((List)localObject).size())
      {
        localStringBuilder.append(" \"");
        localStringBuilder.append(Base64.encodeToString((byte[])((List)localObject).get(j), 0));
        localStringBuilder.append("\"");
        j += 1;
      }
      localStringBuilder.append(" ]");
      i += 1;
    }
    localStringBuilder.append("}mCertificatesArray: 0");
    return localStringBuilder.toString();
  }
}
