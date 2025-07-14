package view;

import android.app.Activity;
import android.content.Context;
import android.content.ContextWrapper;
import android.content.res.Resources;
import android.content.res.XmlResourceParser;
import android.util.AttributeSet;
import android.util.Xml;
import android.view.InflateException;
import android.view.Menu;
import android.view.MenuInflater;
import java.io.IOException;
import menu.f;
import org.xmlpull.v1.XmlPullParserException;

public final class SupportMenuInflater
  extends MenuInflater
{
  public static final Class[] ACTION_PROVIDER_CONSTRUCTOR_SIGNATURE;
  public static final Class[] ACTION_VIEW_CONSTRUCTOR_SIGNATURE;
  public final Object[] mActionProviderConstructorArguments;
  public final Object[] mActionViewConstructorArguments;
  public final Context mContext;
  public Object value;
  
  static
  {
    Class[] arrayOfClass = new Class[1];
    arrayOfClass[0] = Context.class;
    ACTION_VIEW_CONSTRUCTOR_SIGNATURE = arrayOfClass;
    ACTION_PROVIDER_CONSTRUCTOR_SIGNATURE = arrayOfClass;
  }
  
  public SupportMenuInflater(Context paramContext)
  {
    super(paramContext);
    mContext = paramContext;
    Object[] arrayOfObject = new Object[1];
    arrayOfObject[0] = paramContext;
    mActionViewConstructorArguments = arrayOfObject;
    mActionProviderConstructorArguments = arrayOfObject;
  }
  
  public static Object findRealOwner(Object paramObject)
  {
    if ((paramObject instanceof Activity)) {
      return paramObject;
    }
    Object localObject = paramObject;
    if ((paramObject instanceof ContextWrapper)) {
      localObject = findRealOwner(((ContextWrapper)paramObject).getBaseContext());
    }
    return localObject;
  }
  
  public final void inflate(int paramInt, Menu paramMenu)
  {
    if (!(paramMenu instanceof f))
    {
      super.inflate(paramInt, paramMenu);
      return;
    }
    Object localObject3 = null;
    Object localObject4 = null;
    Object localObject1 = null;
    int n = 0;
    int i1 = 0;
    int i2 = 0;
    int m = 0;
    Object localObject2 = mContext;
    int i = m;
    int j = n;
    int k = i1;
    XmlResourceParser localXmlResourceParser;
    AttributeSet localAttributeSet;
    try
    {
      localXmlResourceParser = ((Context)localObject2).getResources().getLayout(paramInt);
      localObject2 = localXmlResourceParser;
      i = m;
      localObject1 = localObject2;
      j = n;
      localObject3 = localObject2;
      k = i1;
      localObject4 = localObject2;
      localAttributeSet = Xml.asAttributeSet(localXmlResourceParser);
      i = m;
      localObject1 = localObject2;
      boolean bool = paramMenu instanceof f;
      paramInt = i2;
      if (bool)
      {
        i = m;
        localObject1 = localObject2;
        f localF = (f)paramMenu;
        i = m;
        localObject1 = localObject2;
        bool = r;
        paramInt = i2;
        if (!bool)
        {
          i = m;
          localObject1 = localObject2;
          j = n;
          localObject3 = localObject2;
          k = i1;
          localObject4 = localObject2;
          localF.g();
          paramInt = 1;
        }
      }
    }
    catch (Throwable localThrowable)
    {
      break label287;
    }
    catch (IOException localIOException)
    {
      break label249;
    }
    catch (XmlPullParserException localXmlPullParserException)
    {
      break label268;
    }
    i = paramInt;
    localObject1 = localXmlPullParserException;
    j = paramInt;
    localObject3 = localXmlPullParserException;
    k = paramInt;
    localObject4 = localXmlPullParserException;
    parseMenu(localXmlResourceParser, localAttributeSet, paramMenu);
    if (paramInt != 0) {
      ((f)paramMenu).h();
    }
    localXmlResourceParser.close();
    return;
    label249:
    i = j;
    localObject1 = localObject3;
    throw new InflateException("Error inflating menu XML", localXmlPullParserException);
    label268:
    i = k;
    localObject1 = localObject4;
    throw new InflateException("Error inflating menu XML", localXmlPullParserException);
    label287:
    if (i != 0) {
      ((f)paramMenu).h();
    }
    if (localObject1 != null) {
      localObject1.close();
    }
    throw localXmlPullParserException;
  }
  
  public final void parseMenu(XmlResourceParser paramXmlResourceParser, AttributeSet paramAttributeSet, Menu paramMenu)
  {
    throw new Runtime("d2j fail translate: java.lang.RuntimeException: can not merge I and Z\n\tat com.googlecode.dex2jar.ir.TypeClass.merge(TypeClass.java:100)\n\tat com.googlecode.dex2jar.ir.ts.TypeTransformer$TypeRef.updateTypeClass(TypeTransformer.java:174)\n\tat com.googlecode.dex2jar.ir.ts.TypeTransformer$TypeAnalyze.useAs(TypeTransformer.java:868)\n\tat com.googlecode.dex2jar.ir.ts.TypeTransformer$TypeAnalyze.enexpr(TypeTransformer.java:668)\n\tat com.googlecode.dex2jar.ir.ts.TypeTransformer$TypeAnalyze.exExpr(TypeTransformer.java:719)\n\tat com.googlecode.dex2jar.ir.ts.TypeTransformer$TypeAnalyze.exExpr(TypeTransformer.java:703)\n\tat com.googlecode.dex2jar.ir.ts.TypeTransformer$TypeAnalyze.s2stmt(TypeTransformer.java:820)\n\tat com.googlecode.dex2jar.ir.ts.TypeTransformer$TypeAnalyze.sxStmt(TypeTransformer.java:843)\n\tat com.googlecode.dex2jar.ir.ts.TypeTransformer$TypeAnalyze.analyze(TypeTransformer.java:206)\n\tat com.googlecode.dex2jar.ir.ts.TypeTransformer.transform(TypeTransformer.java:44)\n\tat com.googlecode.d2j.dex.Dex2jar$2.optimize(Dex2jar.java:162)\n\tat com.googlecode.d2j.dex.Dex2Asm.convertCode(Dex2Asm.java:414)\n\tat com.googlecode.d2j.dex.ExDex2Asm.convertCode(ExDex2Asm.java:42)\n\tat com.googlecode.d2j.dex.Dex2jar$2.convertCode(Dex2jar.java:128)\n\tat com.googlecode.d2j.dex.Dex2Asm.convertMethod(Dex2Asm.java:509)\n\tat com.googlecode.d2j.dex.Dex2Asm.convertClass(Dex2Asm.java:406)\n\tat com.googlecode.d2j.dex.Dex2Asm.convertDex(Dex2Asm.java:422)\n\tat com.googlecode.d2j.dex.Dex2jar.doTranslate(Dex2jar.java:172)\n\tat com.googlecode.d2j.dex.Dex2jar.to(Dex2jar.java:272)\n\tat com.googlecode.dex2jar.tools.Dex2jarCmd.doCommandLine(Dex2jarCmd.java:108)\n\tat com.googlecode.dex2jar.tools.BaseCmd.doMain(BaseCmd.java:288)\n\tat com.googlecode.dex2jar.tools.Dex2jarCmd.main(Dex2jarCmd.java:32)\n");
  }
}
