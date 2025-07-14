package a0;

import java.io.Serializable;
import java.util.Arrays;
import java.util.Collection;
import java.util.Iterator;
import java.util.Map;
import java.util.NoSuchElementException;
import java.util.Set;

public final class c implements Map, Serializable, j0.b {
   public static final c n;
   public Object[] a;
   public Object[] b;
   public int[] c;
   public int[] d;
   public int e;
   public int f;
   public int g;
   public int h;
   public int i;
   public d j;
   public e k;
   public d l;
   public boolean m;

   static {
      c var0 = new c(0);
      var0.m = true;
      n = var0;
   }

   public c(int var1) {
      if (var1 >= 0) {
         Object[] var4 = new Object[var1];
         int[] var5 = new int[var1];
         int var2 = var1;
         if (var1 < 1) {
            var2 = 1;
         }

         var1 = Integer.highestOneBit(var2 * 3);
         int[] var3 = new int[var1];
         super();
         this.a = var4;
         this.b = null;
         this.c = var5;
         this.d = var3;
         this.e = 2;
         this.f = 0;
         this.g = Integer.numberOfLeadingZeros(var1) + 1;
      } else {
         throw new IllegalArgumentException("capacity must be non-negative.");
      }
   }

   public final int a(Object var1) {
      this.b();

      while(true) {
         while(true) {
            int var2 = this.i(var1);
            int var4 = this.e * 2;
            int var5 = this.d.length / 2;
            int var3 = var4;
            if (var4 > var5) {
               var3 = var5;
            }

            var4 = 0;

            while(true) {
               int[] var7 = this.d;
               var5 = var7[var2];
               if (var5 <= 0) {
                  var5 = this.f;
                  Object[] var6 = this.a;
                  if (var5 < var6.length) {
                     var3 = var5 + 1;
                     this.f = var3;
                     var6[var5] = var1;
                     this.c[var5] = var2;
                     var7[var2] = var3;
                     ++this.i;
                     ++this.h;
                     if (var4 > this.e) {
                        this.e = var4;
                     }

                     return var5;
                  }

                  this.f(1);
                  break;
               }

               if (i0.d.a(this.a[var5 - 1], var1)) {
                  return -var5;
               }

               ++var4;
               if (var4 > var3) {
                  this.j(this.d.length * 2);
                  break;
               }

               if (var2 == 0) {
                  var2 = this.d.length - 1;
               } else {
                  --var2;
               }
            }
         }
      }
   }

   public final void b() {
      if (this.m) {
         throw new UnsupportedOperationException();
      }
   }

   public final void c(boolean var1) {
      Object[] var7 = this.b;
      int var2 = 0;
      int var3 = 0;

      while(true) {
         int var4 = this.f;
         if (var2 >= var4) {
            C.b.B(this.a, var3, var4);
            if (var7 != null) {
               C.b.B(var7, var3, this.f);
            }

            this.f = var3;
            return;
         }

         int[] var8 = this.c;
         int var5 = var8[var2];
         var4 = var3;
         if (var5 >= 0) {
            Object[] var6 = this.a;
            var6[var3] = var6[var2];
            if (var7 != null) {
               var7[var3] = var7[var2];
            }

            if (var1) {
               var8[var3] = var5;
               this.d[var5] = var3 + 1;
            }

            var4 = var3 + 1;
         }

         ++var2;
         var3 = var4;
      }
   }

   public final void clear() {
      this.b();
      int var2 = this.f - 1;
      if (var2 >= 0) {
         int var1 = 0;

         while(true) {
            int[] var4 = this.c;
            int var3 = var4[var1];
            if (var3 >= 0) {
               this.d[var3] = 0;
               var4[var1] = -1;
            }

            if (var1 == var2) {
               break;
            }

            ++var1;
         }
      }

      C.b.B(this.a, 0, this.f);
      Object[] var5 = this.b;
      if (var5 != null) {
         C.b.B(var5, 0, this.f);
      }

      this.i = 0;
      this.f = 0;
      ++this.h;
   }

   public final boolean containsKey(Object var1) {
      boolean var2;
      if (this.g(var1) >= 0) {
         var2 = true;
      } else {
         var2 = false;
      }

      return var2;
   }

   public final boolean containsValue(Object var1) {
      boolean var2;
      if (this.h(var1) >= 0) {
         var2 = true;
      } else {
         var2 = false;
      }

      return var2;
   }

   public final boolean d(Collection var1) {
      i0.d.e(var1, "m");
      Iterator var5 = var1.iterator();

      boolean var2;
      do {
         if (!var5.hasNext()) {
            return true;
         }

         Object var3 = var5.next();
         if (var3 == null) {
            break;
         }

         try {
            var2 = this.e((Map.Entry)var3);
         } catch (ClassCastException var4) {
            break;
         }
      } while(var2);

      return false;
   }

   public final boolean e(Map.Entry var1) {
      i0.d.e(var1, "entry");
      int var2 = this.g(var1.getKey());
      if (var2 < 0) {
         return false;
      } else {
         Object[] var3 = this.b;
         i0.d.b(var3);
         return i0.d.a(var3[var2], var1.getValue());
      }
   }

   public final Set entrySet() {
      d var2 = this.l;
      d var1 = var2;
      if (var2 == null) {
         var1 = new d(this, 0);
         this.l = var1;
      }

      return var1;
   }

   public final boolean equals(Object var1) {
      boolean var2;
      label28: {
         if (var1 != this) {
            if (!(var1 instanceof Map)) {
               break label28;
            }

            Map var3 = (Map)var1;
            if (this.i != var3.size() || !this.d(var3.entrySet())) {
               break label28;
            }
         }

         var2 = true;
         return var2;
      }

      var2 = false;
      return var2;
   }

   public final void f(int var1) {
      Object[] var6 = this.a;
      int var3 = var6.length;
      int var2 = this.f;
      int var4 = var3 - var2;
      int var5 = var2 - this.i;
      byte var7 = 1;
      if (var4 < var1 && var4 + var5 >= var1 && var5 >= var6.length / 4) {
         this.c(true);
      } else {
         var4 = var2 + var1;
         if (var4 < 0) {
            throw new OutOfMemoryError();
         }

         if (var4 > var6.length) {
            var1 = var6.length;
            var1 += var1 >> 1;
            var2 = var1;
            if (var1 - var4 < 0) {
               var2 = var4;
            }

            var1 = var2;
            if (var2 - 2147483639 > 0) {
               if (var4 > 2147483639) {
                  var1 = Integer.MAX_VALUE;
               } else {
                  var1 = 2147483639;
               }
            }

            var6 = Arrays.copyOf(var6, var1);
            i0.d.d(var6, "copyOf(...)");
            this.a = var6;
            var6 = this.b;
            if (var6 != null) {
               var6 = Arrays.copyOf(var6, var1);
               i0.d.d(var6, "copyOf(...)");
            } else {
               var6 = null;
            }

            this.b = var6;
            int[] var8 = Arrays.copyOf(this.c, var1);
            i0.d.d(var8, "copyOf(...)");
            this.c = var8;
            if (var1 < 1) {
               var1 = var7;
            }

            var1 = Integer.highestOneBit(var1 * 3);
            if (var1 > this.d.length) {
               this.j(var1);
            }
         }
      }

   }

   public final int g(Object var1) {
      int var2 = this.i(var1);
      int var3 = this.e;

      while(true) {
         int var4 = this.d[var2];
         if (var4 == 0) {
            return -1;
         }

         if (var4 > 0) {
            Object[] var5 = this.a;
            --var4;
            if (i0.d.a(var5[var4], var1)) {
               return var4;
            }
         }

         --var3;
         if (var3 < 0) {
            return -1;
         }

         if (var2 == 0) {
            var2 = this.d.length - 1;
         } else {
            --var2;
         }
      }
   }

   public final Object get(Object var1) {
      int var2 = this.g(var1);
      if (var2 < 0) {
         return null;
      } else {
         Object[] var3 = this.b;
         i0.d.b(var3);
         return var3[var2];
      }
   }

   public final int h(Object var1) {
      int var2 = this.f;

      while(true) {
         int var3 = var2 - 1;
         if (var3 < 0) {
            return -1;
         }

         var2 = var3;
         if (this.c[var3] >= 0) {
            Object[] var4 = this.b;
            i0.d.b(var4);
            var2 = var3;
            if (i0.d.a(var4[var3], var1)) {
               return var3;
            }
         }
      }
   }

   public final int hashCode() {
      a var4 = new a(this, 0);

      int var1;
      int var2;
      int var3;
      for(var1 = 0; var4.hasNext(); var1 += var2 ^ var3) {
         var2 = var4.a;
         c var5 = (c)var4.d;
         if (var2 >= var5.f) {
            throw new NoSuchElementException();
         }

         var4.a = var2 + 1;
         var4.b = var2;
         Object var6 = var5.a[var2];
         if (var6 != null) {
            var2 = var6.hashCode();
         } else {
            var2 = 0;
         }

         Object[] var7 = var5.b;
         i0.d.b(var7);
         Object var8 = var7[var4.b];
         if (var8 != null) {
            var3 = var8.hashCode();
         } else {
            var3 = 0;
         }

         var4.e();
      }

      return var1;
   }

   public final int i(Object var1) {
      int var2;
      if (var1 != null) {
         var2 = var1.hashCode();
      } else {
         var2 = 0;
      }

      return var2 * -1640531527 >>> this.g;
   }

   public final boolean isEmpty() {
      boolean var1;
      if (this.i == 0) {
         var1 = true;
      } else {
         var1 = false;
      }

      return var1;
   }

   public final void j(int var1) {
      ++this.h;
      int var4 = this.f;
      int var3 = this.i;
      int var2 = 0;
      if (var4 > var3) {
         this.c(false);
      }

      this.d = new int[var1];

      for(this.g = Integer.numberOfLeadingZeros(var1) + 1; var2 < this.f; var2 = var4) {
         var4 = var2 + 1;
         var1 = this.i(this.a[var2]);
         var3 = this.e;

         while(true) {
            int[] var5 = this.d;
            if (var5[var1] == 0) {
               var5[var1] = var4;
               this.c[var2] = var1;
               break;
            }

            --var3;
            if (var3 < 0) {
               throw new IllegalStateException("This cannot happen with fixed magic multiplier and grow-only hash array. Have object hashCodes changed?");
            }

            if (var1 == 0) {
               var1 = var5.length - 1;
            } else {
               --var1;
            }
         }
      }

   }

   public final void k(int var1) {
      Object[] var11 = this.a;
      i0.d.e(var11, "<this>");
      var11[var1] = null;
      var11 = this.b;
      if (var11 != null) {
         var11[var1] = null;
      }

      int var6 = this.c[var1];
      int var3 = this.e * 2;
      int var4 = this.d.length / 2;
      int var2 = var3;
      if (var3 > var4) {
         var2 = var4;
      }

      var3 = 0;
      int var5 = var6;
      var4 = var2;
      var2 = var6;

      while(true) {
         if (var2 == 0) {
            var2 = this.d.length - 1;
         } else {
            --var2;
         }

         int var7 = var3 + 1;
         if (var7 > this.e) {
            this.d[var5] = 0;
            break;
         }

         int[] var12 = this.d;
         int var9 = var12[var2];
         if (var9 == 0) {
            var12[var5] = 0;
            break;
         }

         label37: {
            if (var9 < 0) {
               var12[var5] = -1;
            } else {
               var11 = this.a;
               int var8 = var9 - 1;
               int var10 = this.i(var11[var8]);
               var12 = this.d;
               var6 = var5;
               var3 = var7;
               if ((var10 - var2 & var12.length - 1) < var7) {
                  break label37;
               }

               var12[var5] = var9;
               this.c[var8] = var5;
            }

            var6 = var2;
            var3 = 0;
         }

         var7 = var4 - 1;
         var5 = var6;
         var4 = var7;
         if (var7 < 0) {
            this.d[var6] = -1;
            break;
         }
      }

      this.c[var1] = -1;
      --this.i;
      ++this.h;
   }

   public final Set keySet() {
      d var2 = this.j;
      d var1 = var2;
      if (var2 == null) {
         var1 = new d(this, 1);
         this.j = var1;
      }

      return var1;
   }

   public final Object put(Object var1, Object var2) {
      this.b();
      int var4 = this.a(var1);
      Object[] var6 = this.b;
      int var3;
      if (var6 == null) {
         var3 = this.a.length;
         if (var3 < 0) {
            throw new IllegalArgumentException("capacity must be non-negative.");
         }

         var6 = new Object[var3];
         this.b = var6;
      }

      if (var4 < 0) {
         var3 = -var4 - 1;
         Object var5 = var6[var3];
         var6[var3] = var2;
         return var5;
      } else {
         var6[var4] = var2;
         return null;
      }
   }

   public final void putAll(Map var1) {
      i0.d.e(var1, "from");
      this.b();
      Set var7 = var1.entrySet();
      if (!var7.isEmpty()) {
         this.f(var7.size());
         Iterator var5 = var7.iterator();

         while(var5.hasNext()) {
            Map.Entry var4 = (Map.Entry)var5.next();
            int var3 = this.a(var4.getKey());
            Object[] var8 = this.b;
            int var2;
            if (var8 == null) {
               var2 = this.a.length;
               if (var2 < 0) {
                  throw new IllegalArgumentException("capacity must be non-negative.");
               }

               var8 = new Object[var2];
               this.b = var8;
            }

            if (var3 >= 0) {
               var8[var3] = var4.getValue();
            } else {
               var2 = -var3 - 1;
               Object var6 = var8[var2];
               if (!i0.d.a(var4.getValue(), var6)) {
                  var8[var2] = var4.getValue();
               }
            }
         }
      }

   }

   public final Object remove(Object var1) {
      this.b();
      int var2 = this.g(var1);
      if (var2 < 0) {
         return null;
      } else {
         Object[] var3 = this.b;
         i0.d.b(var3);
         var1 = var3[var2];
         this.k(var2);
         return var1;
      }
   }

   public final int size() {
      return this.i;
   }

   public final String toString() {
      StringBuilder var3 = new StringBuilder(this.i * 3 + 2);
      var3.append("{");
      a var5 = new a(this, 0);

      for(int var1 = 0; var5.hasNext(); ++var1) {
         if (var1 > 0) {
            var3.append(", ");
         }

         int var2 = var5.a;
         c var4 = (c)var5.d;
         if (var2 >= var4.f) {
            throw new NoSuchElementException();
         }

         var5.a = var2 + 1;
         var5.b = var2;
         Object var6 = var4.a[var2];
         if (var6 == var4) {
            var3.append("(this Map)");
         } else {
            var3.append(var6);
         }

         var3.append('=');
         Object[] var8 = var4.b;
         i0.d.b(var8);
         var6 = var8[var5.b];
         if (var6 == var4) {
            var3.append("(this Map)");
         } else {
            var3.append(var6);
         }

         var5.e();
      }

      var3.append("}");
      String var7 = var3.toString();
      i0.d.d(var7, "toString(...)");
      return var7;
   }

   public final Collection values() {
      e var2 = this.k;
      e var1 = var2;
      if (var2 == null) {
         var1 = new e(this);
         this.k = var1;
      }

      return var1;
   }
}
