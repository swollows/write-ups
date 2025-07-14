package m;

import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.Collection;
import java.util.ConcurrentModificationException;
import java.util.Iterator;
import java.util.Set;

public final class g implements Collection, Set, j0.a {
   public int[] a;
   public Object[] b;
   public int c;

   public g() {
      this.a = n.a.a;
      this.b = n.a.b;
   }

   public final Object a(int var1) {
      int var3 = this.c;
      Object[] var8 = this.b;
      Object var6 = var8[var1];
      if (var3 <= 1) {
         this.clear();
      } else {
         int var4 = var3 - 1;
         int[] var7 = this.a;
         int var5 = var7.length;
         int var2 = 8;
         if (var5 > 8 && var3 < var7.length / 3) {
            if (var3 > 8) {
               var2 = var3 + (var3 >> 1);
            }

            int[] var9 = new int[var2];
            this.a = var9;
            this.b = new Object[var2];
            if (var1 > 0) {
               Z.g.N(var1, 6, var7, var9);
               Z.g.O(var8, this.b, 0, var1, 6);
            }

            if (var1 < var4) {
               var9 = this.a;
               var2 = var1 + 1;
               Z.g.L(var1, var2, var3, var7, var9);
               Z.g.M(var8, this.b, var1, var2, var3);
            }
         } else {
            if (var1 < var4) {
               var2 = var1 + 1;
               Z.g.L(var1, var2, var3, var7, var7);
               Object[] var10 = this.b;
               Z.g.M(var10, var10, var1, var2, var3);
            }

            this.b[var4] = null;
         }

         if (var3 != this.c) {
            throw new ConcurrentModificationException();
         }

         this.c = var4;
      }

      return var6;
   }

   public final boolean add(Object var1) {
      int var4 = this.c;
      boolean var6 = false;
      int var2;
      int var3;
      if (var1 == null) {
         var2 = i.a(this, (Object)null, 0);
         var3 = 0;
      } else {
         var3 = var1.hashCode();
         var2 = i.a(this, var1, var3);
      }

      if (var2 < 0) {
         int var5 = ~var2;
         int[] var8 = this.a;
         int[] var7;
         if (var4 >= var8.length) {
            var2 = 8;
            if (var4 >= 8) {
               var2 = (var4 >> 1) + var4;
            } else if (var4 < 4) {
               var2 = 4;
            }

            Object[] var9 = this.b;
            var7 = new int[var2];
            this.a = var7;
            this.b = new Object[var2];
            if (var4 != this.c) {
               throw new ConcurrentModificationException();
            }

            if (var7.length != 0) {
               Z.g.N(var8.length, 6, var8, var7);
               Z.g.O(var9, this.b, 0, var9.length, 6);
            }
         }

         if (var5 < var4) {
            var7 = this.a;
            var2 = var5 + 1;
            Z.g.L(var2, var5, var4, var7, var7);
            Object[] var10 = this.b;
            Z.g.M(var10, var10, var2, var5, var4);
         }

         var2 = this.c;
         if (var4 == var2) {
            var7 = this.a;
            if (var5 < var7.length) {
               var7[var5] = var3;
               this.b[var5] = var1;
               this.c = var2 + 1;
               var6 = true;
               return var6;
            }
         }

         throw new ConcurrentModificationException();
      } else {
         return var6;
      }
   }

   public final boolean addAll(Collection var1) {
      i0.d.e(var1, "elements");
      int var2 = this.c;
      int var3 = var1.size() + var2;
      var2 = this.c;
      int[] var8 = this.a;
      int var4 = var8.length;
      boolean var5 = false;
      if (var4 < var3) {
         Object[] var6 = this.b;
         int[] var7 = new int[var3];
         this.a = var7;
         this.b = new Object[var3];
         var3 = this.c;
         if (var3 > 0) {
            Z.g.N(var3, 6, var8, var7);
            Z.g.O(var6, this.b, 0, this.c, 6);
         }
      }

      if (this.c != var2) {
         throw new ConcurrentModificationException();
      } else {
         for(Iterator var9 = var1.iterator(); var9.hasNext(); var5 |= this.add(var9.next())) {
         }

         return var5;
      }
   }

   public final void clear() {
      if (this.c != 0) {
         this.a = n.a.a;
         this.b = n.a.b;
         this.c = 0;
      }

      if (this.c != 0) {
         throw new ConcurrentModificationException();
      }
   }

   public final boolean contains(Object var1) {
      boolean var3 = false;
      int var2;
      if (var1 == null) {
         var2 = i.a(this, (Object)null, 0);
      } else {
         var2 = i.a(this, var1, var1.hashCode());
      }

      if (var2 >= 0) {
         var3 = true;
      }

      return var3;
   }

   public final boolean containsAll(Collection var1) {
      i0.d.e(var1, "elements");
      Iterator var3 = var1.iterator();

      boolean var2;
      while(true) {
         if (var3.hasNext()) {
            if (this.contains(var3.next())) {
               continue;
            }

            var2 = false;
            break;
         }

         var2 = true;
         break;
      }

      return var2;
   }

   public final boolean equals(Object var1) {
      boolean var5 = true;
      boolean var4;
      if (this == var1) {
         var4 = var5;
      } else {
         if (var1 instanceof Set && this.c == ((Set)var1).size()) {
            label43: {
               boolean var10001;
               int var3;
               try {
                  var3 = this.c;
               } catch (ClassCastException | NullPointerException var8) {
                  var10001 = false;
                  break label43;
               }

               int var2 = 0;

               while(true) {
                  var4 = var5;
                  if (var2 >= var3) {
                     return var4;
                  }

                  try {
                     Object var6 = this.b[var2];
                     var4 = ((Set)var1).contains(var6);
                  } catch (ClassCastException | NullPointerException var7) {
                     var10001 = false;
                     break;
                  }

                  if (!var4) {
                     break;
                  }

                  ++var2;
               }
            }
         }

         var4 = false;
      }

      return var4;
   }

   public final int hashCode() {
      int[] var4 = this.a;
      int var3 = this.c;
      int var1 = 0;

      int var2;
      for(var2 = 0; var1 < var3; ++var1) {
         var2 += var4[var1];
      }

      return var2;
   }

   public final boolean isEmpty() {
      boolean var1;
      if (this.c <= 0) {
         var1 = true;
      } else {
         var1 = false;
      }

      return var1;
   }

   public final Iterator iterator() {
      return new b(this);
   }

   public final boolean remove(Object var1) {
      boolean var3 = false;
      int var2;
      if (var1 == null) {
         var2 = i.a(this, (Object)null, 0);
      } else {
         var2 = i.a(this, var1, var1.hashCode());
      }

      if (var2 >= 0) {
         this.a(var2);
         var3 = true;
      }

      return var3;
   }

   public final boolean removeAll(Collection var1) {
      i0.d.e(var1, "elements");
      Iterator var3 = var1.iterator();

      boolean var2;
      for(var2 = false; var3.hasNext(); var2 |= this.remove(var3.next())) {
      }

      return var2;
   }

   public final boolean retainAll(Collection var1) {
      i0.d.e(var1, "elements");
      int var2 = this.c - 1;

      boolean var3;
      for(var3 = false; -1 < var2; --var2) {
         if (!var1.contains(this.b[var2])) {
            this.a(var2);
            var3 = true;
         }
      }

      return var3;
   }

   public final int size() {
      return this.c;
   }

   public final Object[] toArray() {
      Object[] var3 = this.b;
      int var2 = this.c;
      i0.d.e(var3, "<this>");
      int var1 = var3.length;
      if (var2 <= var1) {
         var3 = Arrays.copyOfRange(var3, 0, var2);
         i0.d.d(var3, "copyOfRange(...)");
         return var3;
      } else {
         StringBuilder var4 = new StringBuilder("toIndex (");
         var4.append(var2);
         var4.append(") is greater than size (");
         var4.append(var1);
         var4.append(").");
         throw new IndexOutOfBoundsException(var4.toString());
      }
   }

   public final Object[] toArray(Object[] var1) {
      i0.d.e(var1, "array");
      int var2 = this.c;
      Object[] var3;
      if (var1.length < var2) {
         var3 = (Object[])Array.newInstance(var1.getClass().getComponentType(), var2);
      } else {
         var3 = var1;
         if (var1.length > var2) {
            var1[var2] = null;
            var3 = var1;
         }
      }

      Z.g.M(this.b, var3, 0, 0, this.c);
      return var3;
   }

   public final String toString() {
      String var3;
      if (this.isEmpty()) {
         var3 = "{}";
      } else {
         StringBuilder var5 = new StringBuilder(this.c * 14);
         var5.append('{');
         int var2 = this.c;

         for(int var1 = 0; var1 < var2; ++var1) {
            if (var1 > 0) {
               var5.append(", ");
            }

            Object var4 = this.b[var1];
            if (var4 != this) {
               var5.append(var4);
            } else {
               var5.append("(this Set)");
            }
         }

         var5.append('}');
         var3 = var5.toString();
         i0.d.d(var3, "StringBuilder(capacity).…builderAction).toString()");
      }

      return var3;
   }
}
