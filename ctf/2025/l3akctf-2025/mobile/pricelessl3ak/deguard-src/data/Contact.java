package data;

import History.Config;
import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.content.res.Resources.Theme;
import android.content.res.TypedArray;
import android.content.res.XmlResourceParser;
import android.graphics.Color;
import android.os.Build.VERSION;
import android.util.AttributeSet;
import android.util.StateSet;
import android.util.TypedValue;
import android.util.Xml;
import java.lang.reflect.Array;
import org.xmlpull.v1.XmlPullParser;
import org.xmlpull.v1.XmlPullParserException;

public abstract class Contact
{
  public static final ThreadLocal ids = new ThreadLocal();
  
  public static ColorStateList init(Resources paramResources, XmlResourceParser paramXmlResourceParser, Resources.Theme paramTheme)
  {
    AttributeSet localAttributeSet = Xml.asAttributeSet(paramXmlResourceParser);
    int i;
    do
    {
      i = paramXmlResourceParser.next();
    } while ((i != 2) && (i != 1));
    if (i == 2)
    {
      Object localObject1 = paramXmlResourceParser.getName();
      if (((String)localObject1).equals("selector"))
      {
        int i3 = paramXmlResourceParser.getDepth() + 1;
        Object localObject2 = new int[20][];
        Object localObject5 = new int[20];
        int k = 0;
        for (;;)
        {
          Object localObject6 = paramTheme;
          Object localObject4 = paramResources;
          i = paramXmlResourceParser.next();
          if (i == 1) {
            break;
          }
          int j = paramXmlResourceParser.getDepth();
          if ((j < i3) && (i == 3)) {
            break;
          }
          Object localObject8;
          Object localObject7;
          if ((i != 2) || (j > i3) || (paramXmlResourceParser.getName().equals("item")))
          {
            localObject1 = Config.checks;
            if (localObject6 == null) {
              localObject1 = ((Resources)localObject4).obtainAttributes(localAttributeSet, (int[])localObject1);
            } else {
              localObject1 = ((Resources.Theme)localObject6).obtainStyledAttributes(localAttributeSet, (int[])localObject1, 0, 0);
            }
            i = ((TypedArray)localObject1).getResourceId(0, -1);
            if (i != -1)
            {
              localObject8 = ids;
              localObject7 = (TypedValue)((ThreadLocal)localObject8).get();
              localObject3 = localObject7;
              if (localObject7 == null)
              {
                localObject3 = new TypedValue();
                ((ThreadLocal)localObject8).set(localObject3);
              }
              ((Resources)localObject4).getValue(i, (TypedValue)localObject3, true);
              j = type;
              if ((j >= 28) && (j <= 31)) {}
            }
          }
          try
          {
            i = init((Resources)localObject4, ((Resources)localObject4).getXml(i), (Resources.Theme)localObject6).getDefaultColor();
          }
          catch (Exception localException)
          {
            label324:
            float f1;
            float f6;
            int i4;
            int m;
            int n;
            float f2;
            float f3;
            float f5;
            float f7;
            float f4;
            float f11;
            float f9;
            float f8;
            float f10;
            float f13;
            float f14;
            float f15;
            float f16;
            float f17;
            float f12;
            for (;;) {}
          }
          i = ((TypedArray)localObject1).getColor(0, -65281);
          break label324;
          i = ((TypedArray)localObject1).getColor(0, -65281);
          if (((TypedArray)localObject1).hasValue(1)) {
            f1 = ((TypedArray)localObject1).getFloat(1, 1.0F);
          } else if (((TypedArray)localObject1).hasValue(3)) {
            f1 = ((TypedArray)localObject1).getFloat(3, 1.0F);
          } else {
            f1 = 1.0F;
          }
          if ((Build.VERSION.SDK_INT >= 31) && (((TypedArray)localObject1).hasValue(2))) {
            f6 = ((TypedArray)localObject1).getFloat(2, -1.0F);
          } else {
            f6 = ((TypedArray)localObject1).getFloat(4, -1.0F);
          }
          ((TypedArray)localObject1).recycle();
          i4 = localAttributeSet.getAttributeCount();
          localObject1 = new int[i4];
          m = 0;
          j = 0;
          while (j < i4)
          {
            int i2 = localAttributeSet.getAttributeNameResource(j);
            int i1 = i2;
            n = m;
            if (i2 != 16843173)
            {
              n = m;
              if (i2 != 16843551)
              {
                n = m;
                if (i2 != 2130903081)
                {
                  n = m;
                  if (i2 != 2130903197)
                  {
                    if (!localAttributeSet.getAttributeBooleanValue(j, false)) {
                      i1 = -i2;
                    }
                    localObject1[m] = i1;
                    n = m + 1;
                  }
                }
              }
            }
            j += 1;
            m = n;
          }
          localObject1 = StateSet.trimStateSet((int[])localObject1, m);
          localObject4 = localObject1;
          f2 = 0.0F;
          f3 = 100.0F;
          if ((f6 >= 0.0F) && (f6 <= 100.0F)) {}
          for (m = 1;; m = 0) {
            break;
          }
          if ((f1 != 1.0F) || (m != 0))
          {
            j = (int)(Color.alpha(i) * f1 + 0.5F);
            if (j < 0)
            {
              j = 0;
            }
            else
            {
              n = 255;
              if (j > 255) {
                j = n;
              }
            }
            n = i;
            localObject3 = localObject1;
            if (m != 0)
            {
              localObject3 = d.draw(i);
              localObject7 = f.h;
              f1 = i;
              f5 = f1;
              if ((f1 < 1.0D) || (Math.round(f6) <= 0.0D) || (Math.round(f6) < 100.0D))
              {
                f1 = h;
                if (f1 < 0.0F) {
                  f7 = 0.0F;
                } else {
                  f7 = Math.min(360.0F, f1);
                }
                f4 = 0.0F;
                f1 = f5;
                localObject3 = null;
                i = 1;
                localObject1 = localObject4;
                if (Math.abs(f4 - f5) >= 0.4F)
                {
                  f11 = 1000.0F;
                  f9 = f2;
                  f8 = f3;
                  f10 = 1000.0F;
                  localObject4 = null;
                  if (Math.abs(f9 - f8) > 0.01F)
                  {
                    f2 = (f8 - f9) / 2.0F + f9;
                    m = d.a(f2, f1, f7).a(f.h);
                    f3 = Label.setColor(Color.red(m));
                    f13 = Label.setColor(Color.green(m));
                    f14 = Label.setColor(Color.blue(m));
                    localObject6 = Label.h[1];
                    f15 = localObject6[0];
                    f16 = localObject6[1];
                    f17 = localObject6[2];
                    f12 = 100.0F;
                    f3 = (f14 * f17 + (f13 * f16 + f3 * f15)) / 100.0F;
                    if (f3 <= 0.008856452F) {
                      f3 *= 903.2963F;
                    } else {
                      f3 = (float)Math.cbrt(f3) * 116.0F - 16.0F;
                    }
                    f13 = Math.abs(f6 - f3);
                    if (f13 < 0.2F)
                    {
                      localObject6 = d.draw(m);
                      localObject8 = d.a(r, i, f7);
                      f14 = w - w;
                      f15 = q - q;
                      f16 = j - j;
                      f14 = (float)(Math.pow(Math.sqrt(f16 * f16 + (f15 * f15 + f14 * f14)), 0.63D) * 1.41D);
                      if (f14 <= 1.0F)
                      {
                        f10 = f14;
                        localObject4 = localObject6;
                        f11 = f13;
                      }
                    }
                    for (;;)
                    {
                      f13 = 0.0F;
                      break;
                    }
                    if ((f11 == 0.0F) && (f10 == 0.0F))
                    {
                      f2 = f13;
                      f3 = f12;
                    }
                  }
                  for (;;)
                  {
                    break label1150;
                    if (f3 < f6) {
                      f9 = f2;
                    } else {
                      f8 = f2;
                    }
                    f3 = 100.0F;
                    f2 = 0.0F;
                    break;
                  }
                  label1150:
                  if (i != 0) {
                    if (localObject4 != null) {
                      i = ((d)localObject4).a((f)localObject7);
                    }
                  }
                }
              }
              for (;;)
              {
                n = i;
                localObject3 = localObject1;
                break label1266;
                f1 = (f5 - f4) / 2.0F + f4;
                i = 0;
                for (;;)
                {
                  break;
                  if (localObject4 == null)
                  {
                    f5 = f1;
                  }
                  else
                  {
                    localObject3 = localObject4;
                    f4 = f1;
                  }
                  f1 = (f5 - f4) / 2.0F + f4;
                }
                if (localObject3 == null)
                {
                  i = Label.getColor(f6);
                }
                else
                {
                  i = ((d)localObject3).a((f)localObject7);
                  continue;
                  i = Label.getColor(f6);
                }
              }
            }
            label1266:
            i = 0xFFFFFF & n | j << 24;
            localObject1 = localObject3;
          }
          m = k + 1;
          j = localObject5.length;
          n = 8;
          Object localObject3 = localObject5;
          if (m > j)
          {
            if (k <= 4) {
              j = 8;
            } else {
              j = k * 2;
            }
            localObject3 = new int[j];
            System.arraycopy(localObject5, 0, localObject3, 0, k);
          }
          localObject3[k] = i;
          localObject4 = localObject2;
          if (m > localObject2.length)
          {
            localObject4 = localObject2.getClass().getComponentType();
            if (k <= 4) {
              i = n;
            } else {
              i = k * 2;
            }
            localObject4 = (Object[])Array.newInstance((Class)localObject4, i);
            System.arraycopy(localObject2, 0, localObject4, 0, k);
          }
          localObject4[k] = localObject1;
          localObject2 = (int[][])localObject4;
          k = m;
          localObject5 = localObject3;
        }
        paramResources = new int[k];
        paramXmlResourceParser = new int[k][];
        System.arraycopy(localObject5, 0, paramResources, 0, k);
        System.arraycopy(localObject2, 0, paramXmlResourceParser, 0, k);
        return new ColorStateList(paramXmlResourceParser, paramResources);
      }
      paramResources = new StringBuilder();
      paramResources.append(paramXmlResourceParser.getPositionDescription());
      paramResources.append(": invalid color state list tag ");
      paramResources.append((String)localObject1);
      throw new XmlPullParserException(paramResources.toString());
    }
    throw new XmlPullParserException("No start tag found");
  }
}
