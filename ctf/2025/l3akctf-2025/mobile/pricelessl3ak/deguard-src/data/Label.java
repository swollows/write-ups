package data;

import History.Config;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.content.res.XmlResourceParser;
import android.util.Base64;
import android.util.Xml;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import org.xmlpull.v1.XmlPullParser;
import org.xmlpull.v1.XmlPullParserException;
import util.ColorUtils;
import views.Context;

public abstract class Label
{
  public static final float[] a;
  public static final Object b;
  public static Method c;
  public static boolean e;
  public static final float[][] g;
  public static final float[][] h;
  public static final float[][] k;
  
  public static float evaluate()
  {
    return (float)Math.pow((50.0F + 16.0D) / 116.0D, 3.0D) * 100.0F;
  }
  
  public static int getColor(float paramFloat)
  {
    if (paramFloat < 1.0F) {
      return -16777216;
    }
    if (paramFloat > 99.0F) {
      return -1;
    }
    float f3 = (paramFloat + 16.0F) / 116.0F;
    if (paramFloat > 8.0F) {
      paramFloat = f3 * f3 * f3;
    } else {
      paramFloat /= 903.2963F;
    }
    float f1 = f3 * f3 * f3;
    int i;
    if (f1 > 0.008856452F) {
      i = 1;
    } else {
      i = 0;
    }
    float f2;
    if (i != 0) {
      f2 = f1;
    } else {
      f2 = (f3 * 116.0F - 16.0F) / 903.2963F;
    }
    if (i == 0) {
      f1 = (f3 * 116.0F - 16.0F) / 903.2963F;
    }
    float[] arrayOfFloat = a;
    return ColorUtils.XYZToColor(f2 * arrayOfFloat[0], paramFloat * arrayOfFloat[1], f1 * arrayOfFloat[2]);
  }
  
  public static Future load(XmlResourceParser paramXmlResourceParser, Resources paramResources)
  {
    int i;
    do
    {
      i = paramXmlResourceParser.next();
    } while ((i != 2) && (i != 1));
    if (i == 2)
    {
      paramXmlResourceParser.require(2, null, "font-family");
      if (paramXmlResourceParser.getName().equals("font-family"))
      {
        TypedArray localTypedArray = paramResources.obtainAttributes(Xml.asAttributeSet(paramXmlResourceParser), Config.COLUMNS);
        Object localObject1 = localTypedArray.getString(0);
        Object localObject2 = localTypedArray.getString(5);
        String str1 = localTypedArray.getString(6);
        String str3 = localTypedArray.getString(2);
        i = localTypedArray.getResourceId(1, 0);
        int j = localTypedArray.getInteger(3, 1);
        int m = localTypedArray.getInteger(4, 500);
        String str2 = localTypedArray.getString(7);
        localTypedArray.recycle();
        if ((localObject1 != null) && (localObject2 != null) && (str1 != null))
        {
          while (paramXmlResourceParser.next() != 3) {
            read(paramXmlResourceParser);
          }
          paramResources = parse(paramResources, i);
          if (str3 != null) {
            paramXmlResourceParser = new Context((String)localObject1, (String)localObject2, str3, paramResources);
          } else {
            paramXmlResourceParser = null;
          }
          return new ClassWriter(new Context((String)localObject1, (String)localObject2, str1, paramResources), paramXmlResourceParser, j, m, str2);
        }
        localObject1 = new ArrayList();
        while (paramXmlResourceParser.next() != 3) {
          if (paramXmlResourceParser.getEventType() == 2) {
            if (paramXmlResourceParser.getName().equals("font"))
            {
              localObject2 = paramResources.obtainAttributes(Xml.asAttributeSet(paramXmlResourceParser), Config.data);
              i = 8;
              if (!((TypedArray)localObject2).hasValue(8)) {
                i = 1;
              }
              m = ((TypedArray)localObject2).getInt(i, 400);
              if (((TypedArray)localObject2).hasValue(6)) {
                i = 6;
              } else {
                i = 2;
              }
              boolean bool;
              if (1 == ((TypedArray)localObject2).getInt(i, 0)) {
                bool = true;
              } else {
                bool = false;
              }
              i = 9;
              if (!((TypedArray)localObject2).hasValue(9)) {
                i = 3;
              }
              if (((TypedArray)localObject2).hasValue(7)) {
                j = 7;
              } else {
                j = 4;
              }
              str1 = ((TypedArray)localObject2).getString(j);
              j = ((TypedArray)localObject2).getInt(i, 0);
              if (((TypedArray)localObject2).hasValue(5)) {
                i = 5;
              } else {
                i = 0;
              }
              int n = ((TypedArray)localObject2).getResourceId(i, 0);
              str2 = ((TypedArray)localObject2).getString(i);
              ((TypedArray)localObject2).recycle();
              while (paramXmlResourceParser.next() != 3) {
                read(paramXmlResourceParser);
              }
              ((ArrayList)localObject1).add(new R.string(str2, m, bool, str1, j, n));
            }
            else
            {
              read(paramXmlResourceParser);
            }
          }
        }
        if (!((ArrayList)localObject1).isEmpty()) {
          return new Namespace((R.string[])((ArrayList)localObject1).toArray(new R.string[0]));
        }
      }
      else
      {
        read(paramXmlResourceParser);
      }
      return null;
    }
    throw new XmlPullParserException("No start tag found");
  }
  
  public static List parse(Resources paramResources, int paramInt)
  {
    if (paramInt == 0) {
      return Collections.emptyList();
    }
    TypedArray localTypedArray = paramResources.obtainTypedArray(paramInt);
    try
    {
      i = localTypedArray.length();
      if (i == 0)
      {
        paramResources = Collections.emptyList();
        localTypedArray.recycle();
        return paramResources;
      }
    }
    catch (Throwable paramResources)
    {
      break label210;
      ArrayList localArrayList1 = new ArrayList();
      int i = localTypedArray.getType(0);
      if (i == 1)
      {
        paramInt = 0;
        for (;;)
        {
          i = localTypedArray.length();
          if (paramInt >= i) {
            break;
          }
          i = localTypedArray.getResourceId(paramInt, 0);
          if (i != 0)
          {
            localObject = paramResources.getStringArray(i);
            ArrayList localArrayList2 = new ArrayList();
            int j = localObject.length;
            i = 0;
            while (i < j)
            {
              localArrayList2.add(Base64.decode(localObject[i], 0));
              i += 1;
            }
            localArrayList1.add(localArrayList2);
          }
          paramInt += 1;
        }
      }
      paramResources = paramResources.getStringArray(paramInt);
      Object localObject = new ArrayList();
      i = paramResources.length;
      paramInt = 0;
      while (paramInt < i)
      {
        ((ArrayList)localObject).add(Base64.decode(paramResources[paramInt], 0));
        paramInt += 1;
      }
      localArrayList1.add(localObject);
      localTypedArray.recycle();
      return localArrayList1;
      label210:
      localTypedArray.recycle();
      throw paramResources;
    }
  }
  
  public static void read(XmlResourceParser paramXmlResourceParser)
  {
    int i = 1;
    while (i > 0)
    {
      int j = paramXmlResourceParser.next();
      if (j != 2)
      {
        if (j == 3) {
          i -= 1;
        }
      }
      else {
        i += 1;
      }
    }
  }
  
  public static float setColor(int paramInt)
  {
    float f = paramInt / 255.0F;
    if (f <= 0.04045F) {}
    for (f /= 12.92F;; f = (float)Math.pow((f + 0.055F) / 1.055F, 2.4000000953674316D)) {
      return f * 100.0F;
    }
  }
}
