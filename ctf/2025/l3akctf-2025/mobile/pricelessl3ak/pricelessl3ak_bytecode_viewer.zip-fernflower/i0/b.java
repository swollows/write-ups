package i0;

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
import java.util.Collection;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;

public final class b implements m0.b, a {
   public static final Map b;
   public static final HashMap c;
   public final Class a;

   static {
      List var2 = Arrays.asList(h0.a.class, l.class, q.b.class, p.class, q.class, r.class, s.class, t.class, u.class, v.class, h0.b.class, h0.c.class, h0.d.class, h0.e.class, h0.f.class, h0.g.class, h0.h.class, h0.i.class, j.class, k.class, m.class, n.class, o.class);
      d.d(var2, "asList(...)");
      ArrayList var1 = new ArrayList(Z.j.L(var2));
      Iterator var3 = var2.iterator();

      int var0;
      for(var0 = 0; var3.hasNext(); ++var0) {
         Object var7 = var3.next();
         if (var0 < 0) {
            throw new ArithmeticException("Index overflow has happened.");
         }

         var1.add(new Y.c((Class)var7, var0));
      }

      b = Z.s.M(var1);
      HashMap var8 = new HashMap();
      var8.put("boolean", "kotlin.Boolean");
      var8.put("char", "kotlin.Char");
      var8.put("byte", "kotlin.Byte");
      var8.put("short", "kotlin.Short");
      var8.put("int", "kotlin.Int");
      var8.put("float", "kotlin.Float");
      var8.put("long", "kotlin.Long");
      var8.put("double", "kotlin.Double");
      HashMap var10 = new HashMap();
      var10.put("java.lang.Boolean", "kotlin.Boolean");
      var10.put("java.lang.Character", "kotlin.Char");
      var10.put("java.lang.Byte", "kotlin.Byte");
      var10.put("java.lang.Short", "kotlin.Short");
      var10.put("java.lang.Integer", "kotlin.Int");
      var10.put("java.lang.Float", "kotlin.Float");
      var10.put("java.lang.Long", "kotlin.Long");
      var10.put("java.lang.Double", "kotlin.Double");
      HashMap var5 = new HashMap();
      var5.put("java.lang.Object", "kotlin.Any");
      var5.put("java.lang.String", "kotlin.String");
      var5.put("java.lang.CharSequence", "kotlin.CharSequence");
      var5.put("java.lang.Throwable", "kotlin.Throwable");
      var5.put("java.lang.Cloneable", "kotlin.Cloneable");
      var5.put("java.lang.Number", "kotlin.Number");
      var5.put("java.lang.Comparable", "kotlin.Comparable");
      var5.put("java.lang.Enum", "kotlin.Enum");
      var5.put("java.lang.annotation.Annotation", "kotlin.Annotation");
      var5.put("java.lang.Iterable", "kotlin.collections.Iterable");
      var5.put("java.util.Iterator", "kotlin.collections.Iterator");
      var5.put("java.util.Collection", "kotlin.collections.Collection");
      var5.put("java.util.List", "kotlin.collections.List");
      var5.put("java.util.Set", "kotlin.collections.Set");
      var5.put("java.util.ListIterator", "kotlin.collections.ListIterator");
      var5.put("java.util.Map", "kotlin.collections.Map");
      var5.put("java.util.Map$Entry", "kotlin.collections.Map.Entry");
      var5.put("kotlin.jvm.internal.StringCompanionObject", "kotlin.String.Companion");
      var5.put("kotlin.jvm.internal.EnumCompanionObject", "kotlin.Enum.Companion");
      var5.putAll(var8);
      var5.putAll(var10);
      Collection var9 = var8.values();
      d.d(var9, "<get-values>(...)");
      var3 = var9.iterator();

      String var4;
      while(var3.hasNext()) {
         var4 = (String)var3.next();
         StringBuilder var11 = new StringBuilder("kotlin.jvm.internal.");
         d.b(var4);
         var11.append(o0.f.L(var4));
         var11.append("CompanionObject");
         var5.put(var11.toString(), var4.concat(".Companion"));
      }

      Iterator var12 = b.entrySet().iterator();

      while(var12.hasNext()) {
         Map.Entry var15 = (Map.Entry)var12.next();
         Class var14 = (Class)var15.getKey();
         var0 = ((Number)var15.getValue()).intValue();
         var4 = var14.getName();
         StringBuilder var16 = new StringBuilder("kotlin.Function");
         var16.append(var0);
         var5.put(var4, var16.toString());
      }

      c = var5;
      LinkedHashMap var13 = new LinkedHashMap(Z.s.L(var5.size()));
      Iterator var6 = var5.entrySet().iterator();

      while(var6.hasNext()) {
         Map.Entry var17 = (Map.Entry)var6.next();
         var13.put(var17.getKey(), o0.f.L((String)var17.getValue()));
      }

   }

   public b(Class var1) {
      this.a = var1;
   }

   public final Class a() {
      return this.a;
   }

   public final boolean equals(Object var1) {
      boolean var2;
      if (var1 instanceof b && C.b.r(this).equals(C.b.r((m0.b)var1))) {
         var2 = true;
      } else {
         var2 = false;
      }

      return var2;
   }

   public final int hashCode() {
      return C.b.r(this).hashCode();
   }

   public final String toString() {
      StringBuilder var1 = new StringBuilder();
      var1.append(this.a.toString());
      var1.append(" (Kotlin reflection is not available)");
      return var1.toString();
   }
}
