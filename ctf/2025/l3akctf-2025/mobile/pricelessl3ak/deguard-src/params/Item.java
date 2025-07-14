package params;

import collections.ByteVector;
import drupal.Context;
import h0.a;
import h0.c;
import h0.d;
import h0.e;
import h0.f;
import h0.g;
import h0.h;
import h0.i;
import h0.j;
import h0.k;
import h0.l;
import h0.m;
import h0.n;
import h0.o;
import h0.p;
import h0.q;
import h0.r;
import h0.s;
import h0.t;
import h0.u;
import h0.v;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;
import skin.SkinInfo4;
import widgets.Pair;
import xml.Attributes;

public final class Item
  implements Attributes, Object
{
  public static final Map a;
  public static final HashMap b;
  public final Class type;
  
  static
  {
    java.lang.Object localObject2 = Arrays.asList(new Class[] { a.class, l.class, q.b.class, p.class, q.class, r.class, s.class, t.class, u.class, v.class, h0.b.class, c.class, d.class, e.class, f.class, g.class, h.class, i.class, j.class, k.class, m.class, n.class, o.class });
    Log.append(localObject2, "asList(...)");
    java.lang.Object localObject1 = new ArrayList(collections.Object.apply((Iterable)localObject2));
    localObject2 = ((Iterable)localObject2).iterator();
    int i = 0;
    while (((Iterator)localObject2).hasNext())
    {
      localObject3 = ((Iterator)localObject2).next();
      if (i >= 0)
      {
        ((ArrayList)localObject1).add(new Pair((Class)localObject3, Integer.valueOf(i)));
        i += 1;
      }
      else
      {
        throw new ArithmeticException("Index overflow has happened.");
      }
    }
    a = ByteVector.read((ArrayList)localObject1);
    localObject2 = new HashMap();
    ((HashMap)localObject2).put("boolean", "kotlin.Boolean");
    ((HashMap)localObject2).put("char", "kotlin.Char");
    ((HashMap)localObject2).put("byte", "kotlin.Byte");
    ((HashMap)localObject2).put("short", "kotlin.Short");
    ((HashMap)localObject2).put("int", "kotlin.Int");
    ((HashMap)localObject2).put("float", "kotlin.Float");
    ((HashMap)localObject2).put("long", "kotlin.Long");
    ((HashMap)localObject2).put("double", "kotlin.Double");
    java.lang.Object localObject3 = new HashMap();
    ((HashMap)localObject3).put("java.lang.Boolean", "kotlin.Boolean");
    ((HashMap)localObject3).put("java.lang.Character", "kotlin.Char");
    ((HashMap)localObject3).put("java.lang.Byte", "kotlin.Byte");
    ((HashMap)localObject3).put("java.lang.Short", "kotlin.Short");
    ((HashMap)localObject3).put("java.lang.Integer", "kotlin.Int");
    ((HashMap)localObject3).put("java.lang.Float", "kotlin.Float");
    ((HashMap)localObject3).put("java.lang.Long", "kotlin.Long");
    ((HashMap)localObject3).put("java.lang.Double", "kotlin.Double");
    localObject1 = new HashMap();
    ((HashMap)localObject1).put("java.lang.Object", "kotlin.Any");
    ((HashMap)localObject1).put("java.lang.String", "kotlin.String");
    ((HashMap)localObject1).put("java.lang.CharSequence", "kotlin.CharSequence");
    ((HashMap)localObject1).put("java.lang.Throwable", "kotlin.Throwable");
    ((HashMap)localObject1).put("java.lang.Cloneable", "kotlin.Cloneable");
    ((HashMap)localObject1).put("java.lang.Number", "kotlin.Number");
    ((HashMap)localObject1).put("java.lang.Comparable", "kotlin.Comparable");
    ((HashMap)localObject1).put("java.lang.Enum", "kotlin.Enum");
    ((HashMap)localObject1).put("java.lang.annotation.Annotation", "kotlin.Annotation");
    ((HashMap)localObject1).put("java.lang.Iterable", "kotlin.collections.Iterable");
    ((HashMap)localObject1).put("java.util.Iterator", "kotlin.collections.Iterator");
    ((HashMap)localObject1).put("java.util.Collection", "kotlin.collections.Collection");
    ((HashMap)localObject1).put("java.util.List", "kotlin.collections.List");
    ((HashMap)localObject1).put("java.util.Set", "kotlin.collections.Set");
    ((HashMap)localObject1).put("java.util.ListIterator", "kotlin.collections.ListIterator");
    ((HashMap)localObject1).put("java.util.Map", "kotlin.collections.Map");
    ((HashMap)localObject1).put("java.util.Map$Entry", "kotlin.collections.Map.Entry");
    ((HashMap)localObject1).put("kotlin.jvm.internal.StringCompanionObject", "kotlin.String.Companion");
    ((HashMap)localObject1).put("kotlin.jvm.internal.EnumCompanionObject", "kotlin.Enum.Companion");
    ((HashMap)localObject1).putAll((Map)localObject2);
    ((HashMap)localObject1).putAll((Map)localObject3);
    localObject2 = ((HashMap)localObject2).values();
    Log.append(localObject2, "<get-values>(...)");
    localObject2 = ((Iterable)localObject2).iterator();
    java.lang.Object localObject4;
    while (((Iterator)localObject2).hasNext())
    {
      localObject3 = (String)((Iterator)localObject2).next();
      localObject4 = new StringBuilder("kotlin.jvm.internal.");
      Log.get(localObject3);
      ((StringBuilder)localObject4).append(SkinInfo4.canonicalPath((String)localObject3));
      ((StringBuilder)localObject4).append("CompanionObject");
      ((HashMap)localObject1).put(((StringBuilder)localObject4).toString(), ((String)localObject3).concat(".Companion"));
    }
    localObject2 = a.entrySet().iterator();
    while (((Iterator)localObject2).hasNext())
    {
      localObject3 = (Map.Entry)((Iterator)localObject2).next();
      localObject4 = (Class)((Map.Entry)localObject3).getKey();
      i = ((Number)((Map.Entry)localObject3).getValue()).intValue();
      localObject3 = ((Class)localObject4).getName();
      localObject4 = new StringBuilder("kotlin.Function");
      ((StringBuilder)localObject4).append(i);
      ((HashMap)localObject1).put(localObject3, ((StringBuilder)localObject4).toString());
    }
    b = (HashMap)localObject1;
    localObject2 = new LinkedHashMap(ByteVector.capacity(((HashMap)localObject1).size()));
    localObject1 = ((HashMap)localObject1).entrySet().iterator();
    while (((Iterator)localObject1).hasNext())
    {
      localObject3 = (Map.Entry)((Iterator)localObject1).next();
      ((Map)localObject2).put(((Map.Entry)localObject3).getKey(), SkinInfo4.canonicalPath((String)((Map.Entry)localObject3).getValue()));
    }
  }
  
  public Item(Class paramClass)
  {
    type = paramClass;
  }
  
  public final boolean equals(java.lang.Object paramObject)
  {
    return ((paramObject instanceof Item)) && (Context.getValue(this).equals(Context.getValue((Attributes)paramObject)));
  }
  
  public final Class getType()
  {
    return type;
  }
  
  public final int hashCode()
  {
    return Context.getValue(this).hashCode();
  }
  
  public final String toString()
  {
    StringBuilder localStringBuilder = new StringBuilder();
    localStringBuilder.append(type.toString());
    localStringBuilder.append(" (Kotlin reflection is not available)");
    return localStringBuilder.toString();
  }
}
