package m;

import java.util.Arrays;
import java.util.ConcurrentModificationException;
import java.util.Map;

public class k {
   public int[] a;
   public Object[] b;
   public int c;

   public k(int var1) {
      int[] var2;
      if (var1 == 0) {
         var2 = n.a.a;
      } else {
         var2 = new int[var1];
      }

      this.a = var2;
      Object[] var3;
      if (var1 == 0) {
         var3 = n.a.b;
      } else {
         var3 = new Object[var1 << 1];
      }

      this.b = var3;
   }

   public final int a(Object var1) {
      int var3 = this.c * 2;
      Object[] var4 = this.b;
      int var2;
      if (var1 == null) {
         for(var2 = 1; var2 < var3; var2 += 2) {
            if (var4[var2] == null) {
               return var2 >> 1;
            }
         }
      } else {
         for(var2 = 1; var2 < var3; var2 += 2) {
            if (var1.equals(var4[var2])) {
               return var2 >> 1;
            }
         }
      }

      return -1;
   }

   public final int b(int var1, Object var2) {
      int var4 = this.c;
      if (var4 == 0) {
         return -1;
      } else {
         int var5 = n.a.a(var4, var1, this.a);
         if (var5 < 0) {
            return var5;
         } else if (i0.d.a(var2, this.b[var5 << 1])) {
            return var5;
         } else {
            int var3;
            for(var3 = var5 + 1; var3 < var4 && this.a[var3] == var1; ++var3) {
               if (i0.d.a(var2, this.b[var3 << 1])) {
                  return var3;
               }
            }

            for(var4 = var5 - 1; var4 >= 0 && this.a[var4] == var1; --var4) {
               if (i0.d.a(var2, this.b[var4 << 1])) {
                  return var4;
               }
            }

            return ~var3;
         }
      }
   }

   public final int c(Object var1) {
      int var2;
      if (var1 == null) {
         var2 = this.d();
      } else {
         var2 = this.b(var1.hashCode(), var1);
      }

      return var2;
   }

   public final void clear() {
      if (this.c > 0) {
         this.a = n.a.a;
         this.b = n.a.b;
         this.c = 0;
      }

      if (this.c > 0) {
         throw new ConcurrentModificationException();
      }
   }

   public boolean containsKey(Object var1) {
      boolean var2;
      if (this.c(var1) >= 0) {
         var2 = true;
      } else {
         var2 = false;
      }

      return var2;
   }

   public boolean containsValue(Object var1) {
      boolean var2;
      if (this.a(var1) >= 0) {
         var2 = true;
      } else {
         var2 = false;
      }

      return var2;
   }

   public final int d() {
      int var2 = this.c;
      if (var2 == 0) {
         return -1;
      } else {
         int var3 = n.a.a(var2, 0, this.a);
         if (var3 < 0) {
            return var3;
         } else if (this.b[var3 << 1] == null) {
            return var3;
         } else {
            int var1;
            for(var1 = var3 + 1; var1 < var2 && this.a[var1] == 0; ++var1) {
               if (this.b[var1 << 1] == null) {
                  return var1;
               }
            }

            for(var2 = var3 - 1; var2 >= 0 && this.a[var2] == 0; --var2) {
               if (this.b[var2 << 1] == null) {
                  return var2;
               }
            }

            return ~var1;
         }
      }
   }

   public final Object e(int var1) {
      if (var1 >= 0 && var1 < this.c) {
         return this.b[var1 << 1];
      } else {
         StringBuilder var2 = new StringBuilder("Expected index to be within 0..size()-1, but was ");
         var2.append(var1);
         throw new IllegalArgumentException(var2.toString().toString());
      }
   }

   public final boolean equals(Object var1) {
      if (this == var1) {
         return true;
      } else {
         boolean var10001;
         int var2;
         int var3;
         Object var5;
         Object var6;
         Object var7;
         label147: {
            try {
               if (var1 instanceof k) {
                  var3 = this.c;
                  if (var3 == ((k)var1).c) {
                     break label147;
                  }

                  return false;
               }
            } catch (ClassCastException | NullPointerException var17) {
               var10001 = false;
               return false;
            }

            try {
               if (!(var1 instanceof Map)) {
                  return false;
               }

               if (this.c != ((Map)var1).size()) {
                  return false;
               }
            } catch (ClassCastException | NullPointerException var16) {
               var10001 = false;
               return false;
            }

            try {
               var3 = this.c;
            } catch (ClassCastException | NullPointerException var14) {
               var10001 = false;
               return false;
            }

            for(var2 = 0; var2 < var3; ++var2) {
               try {
                  var7 = this.e(var2);
                  var6 = this.h(var2);
                  var5 = ((Map)var1).get(var7);
               } catch (ClassCastException | NullPointerException var12) {
                  var10001 = false;
                  return false;
               }

               if (var6 == null) {
                  if (var5 == null) {
                     try {
                        if (((Map)var1).containsKey(var7)) {
                           continue;
                        }
                     } catch (ClassCastException | NullPointerException var13) {
                        var10001 = false;
                        return false;
                     }
                  }

                  return false;
               } else {
                  boolean var4;
                  try {
                     var4 = var6.equals(var5);
                  } catch (ClassCastException | NullPointerException var11) {
                     var10001 = false;
                     return false;
                  }

                  if (!var4) {
                     return false;
                  }
               }
            }

            return true;
         }

         k var18;
         try {
            var18 = (k)var1;
         } catch (ClassCastException | NullPointerException var15) {
            var10001 = false;
            return false;
         }

         var2 = 0;

         while(true) {
            if (var2 >= var3) {
               return true;
            }

            try {
               var7 = this.e(var2);
               var6 = this.h(var2);
               var5 = var18.get(var7);
            } catch (ClassCastException | NullPointerException var9) {
               var10001 = false;
               break;
            }

            if (var6 == null) {
               label76: {
                  if (var5 == null) {
                     try {
                        if (var18.containsKey(var7)) {
                           break label76;
                        }
                     } catch (ClassCastException | NullPointerException var10) {
                        var10001 = false;
                        break;
                     }
                  }

                  return false;
               }
            } else {
               try {
                  if (!var6.equals(var5)) {
                     return false;
                  }
               } catch (ClassCastException | NullPointerException var8) {
                  var10001 = false;
                  break;
               }
            }

            ++var2;
         }

         return false;
      }
   }

   public final Object f(int var1) {
      if (var1 >= 0) {
         int var4 = this.c;
         if (var1 < var4) {
            Object[] var9 = this.b;
            int var5 = var1 << 1;
            Object var11 = var9[var5 + 1];
            if (var4 <= 1) {
               this.clear();
            } else {
               int var3 = var4 - 1;
               int[] var8 = this.a;
               int var6 = var8.length;
               int var2 = 8;
               if (var6 > 8 && var4 < var8.length / 3) {
                  if (var4 > 8) {
                     var2 = var4 + (var4 >> 1);
                  }

                  int[] var10 = Arrays.copyOf(var8, var2);
                  i0.d.d(var10, "copyOf(this, newSize)");
                  this.a = var10;
                  Object[] var13 = Arrays.copyOf(this.b, var2 << 1);
                  i0.d.d(var13, "copyOf(this, newSize)");
                  this.b = var13;
                  if (var4 != this.c) {
                     throw new ConcurrentModificationException();
                  }

                  if (var1 > 0) {
                     Z.g.L(0, 0, var1, var8, this.a);
                     Z.g.M(var9, this.b, 0, 0, var5);
                  }

                  if (var1 < var3) {
                     var10 = this.a;
                     var2 = var1 + 1;
                     Z.g.L(var1, var2, var4, var8, var10);
                     Z.g.M(var9, this.b, var5, var2 << 1, var4 << 1);
                  }
               } else {
                  Object[] var12;
                  if (var1 < var3) {
                     var2 = var1 + 1;
                     Z.g.L(var1, var2, var4, var8, var8);
                     var12 = this.b;
                     Z.g.M(var12, var12, var5, var2 << 1, var4 << 1);
                  }

                  var12 = this.b;
                  var1 = var3 << 1;
                  var12[var1] = null;
                  var12[var1 + 1] = null;
               }

               if (var4 != this.c) {
                  throw new ConcurrentModificationException();
               }

               this.c = var3;
            }

            return var11;
         }
      }

      StringBuilder var7 = new StringBuilder("Expected index to be within 0..size()-1, but was ");
      var7.append(var1);
      throw new IllegalArgumentException(var7.toString().toString());
   }

   public final Object g(int var1, Object var2) {
      if (var1 >= 0 && var1 < this.c) {
         var1 = (var1 << 1) + 1;
         Object[] var3 = this.b;
         Object var4 = var3[var1];
         var3[var1] = var2;
         return var4;
      } else {
         StringBuilder var5 = new StringBuilder("Expected index to be within 0..size()-1, but was ");
         var5.append(var1);
         throw new IllegalArgumentException(var5.toString().toString());
      }
   }

   public Object get(Object var1) {
      int var2 = this.c(var1);
      if (var2 >= 0) {
         var1 = this.b[(var2 << 1) + 1];
      } else {
         var1 = null;
      }

      return var1;
   }

   public final Object getOrDefault(Object var1, Object var2) {
      int var3 = this.c(var1);
      if (var3 >= 0) {
         var2 = this.b[(var3 << 1) + 1];
      }

      return var2;
   }

   public final Object h(int var1) {
      if (var1 >= 0 && var1 < this.c) {
         return this.b[(var1 << 1) + 1];
      } else {
         StringBuilder var2 = new StringBuilder("Expected index to be within 0..size()-1, but was ");
         var2.append(var1);
         throw new IllegalArgumentException(var2.toString().toString());
      }
   }

   public final int hashCode() {
      int[] var7 = this.a;
      Object[] var8 = this.b;
      int var5 = this.c;
      int var3 = 1;
      int var2 = 0;

      int var1;
      for(var1 = 0; var2 < var5; var3 += 2) {
         Object var9 = var8[var3];
         int var6 = var7[var2];
         int var4;
         if (var9 != null) {
            var4 = var9.hashCode();
         } else {
            var4 = 0;
         }

         var1 += var4 ^ var6;
         ++var2;
      }

      return var1;
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

   public final Object put(Object var1, Object var2) {
      int var5 = this.c;
      int var4;
      if (var1 != null) {
         var4 = var1.hashCode();
      } else {
         var4 = 0;
      }

      int var3;
      if (var1 != null) {
         var3 = this.b(var4, var1);
      } else {
         var3 = this.d();
      }

      if (var3 >= 0) {
         var3 = (var3 << 1) + 1;
         Object[] var8 = this.b;
         Object var10 = var8[var3];
         var8[var3] = var2;
         return var10;
      } else {
         int var6 = ~var3;
         int[] var7 = this.a;
         Object[] var9;
         if (var5 >= var7.length) {
            var3 = 8;
            if (var5 >= 8) {
               var3 = (var5 >> 1) + var5;
            } else if (var5 < 4) {
               var3 = 4;
            }

            var7 = Arrays.copyOf(var7, var3);
            i0.d.d(var7, "copyOf(this, newSize)");
            this.a = var7;
            var9 = Arrays.copyOf(this.b, var3 << 1);
            i0.d.d(var9, "copyOf(this, newSize)");
            this.b = var9;
            if (var5 != this.c) {
               throw new ConcurrentModificationException();
            }
         }

         if (var6 < var5) {
            var7 = this.a;
            var3 = var6 + 1;
            Z.g.L(var3, var6, var5, var7, var7);
            var9 = this.b;
            Z.g.M(var9, var9, var3 << 1, var6 << 1, this.c << 1);
         }

         var3 = this.c;
         if (var5 == var3) {
            var7 = this.a;
            if (var6 < var7.length) {
               var7[var6] = var4;
               var9 = this.b;
               var4 = var6 << 1;
               var9[var4] = var1;
               var9[var4 + 1] = var2;
               this.c = var3 + 1;
               return null;
            }
         }

         throw new ConcurrentModificationException();
      }
   }

   public final Object putIfAbsent(Object var1, Object var2) {
      Object var4 = this.get(var1);
      Object var3 = var4;
      if (var4 == null) {
         var3 = this.put(var1, var2);
      }

      return var3;
   }

   public Object remove(Object var1) {
      int var2 = this.c(var1);
      if (var2 >= 0) {
         var1 = this.f(var2);
      } else {
         var1 = null;
      }

      return var1;
   }

   public final boolean remove(Object var1, Object var2) {
      int var3 = this.c(var1);
      if (var3 >= 0 && i0.d.a(var2, this.h(var3))) {
         this.f(var3);
         return true;
      } else {
         return false;
      }
   }

   public final Object replace(Object var1, Object var2) {
      int var3 = this.c(var1);
      if (var3 >= 0) {
         var1 = this.g(var3, var2);
      } else {
         var1 = null;
      }

      return var1;
   }

   public final boolean replace(Object var1, Object var2, Object var3) {
      int var4 = this.c(var1);
      if (var4 >= 0 && i0.d.a(var2, this.h(var4))) {
         this.g(var4, var3);
         return true;
      } else {
         return false;
      }
   }

   public final int size() {
      return this.c;
   }

   public final String toString() {
      if (this.isEmpty()) {
         return "{}";
      } else {
         StringBuilder var3 = new StringBuilder(this.c * 28);
         var3.append('{');
         int var2 = this.c;

         for(int var1 = 0; var1 < var2; ++var1) {
            if (var1 > 0) {
               var3.append(", ");
            }

            Object var4 = this.e(var1);
            if (var4 != var3) {
               var3.append(var4);
            } else {
               var3.append("(this Map)");
            }

            var3.append('=');
            var4 = this.h(var1);
            if (var4 != var3) {
               var3.append(var4);
            } else {
               var3.append("(this Map)");
            }
         }

         var3.append('}');
         String var5 = var3.toString();
         i0.d.d(var5, "StringBuilder(capacity).…builderAction).toString()");
         return var5;
      }
   }
}
