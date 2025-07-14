package q;

import Z.g;
import Z.j;
import java.util.ArrayList;
import java.util.Iterator;

public final class c implements Iterable, j0.a {
   public static final c e = new c(0L, 0L, 0, (int[])null);
   public final long a;
   public final long b;
   public final int c;
   public final int[] d;

   public c(long var1, long var3, int var5, int[] var6) {
      this.a = var1;
      this.b = var3;
      this.c = var5;
      this.d = var6;
   }

   public final boolean a(int var1) {
      int var2 = var1 - this.c;
      boolean var6 = true;
      boolean var4 = true;
      boolean var3 = true;
      boolean var5 = false;
      if (var2 >= 0 && var2 < 64) {
         if ((1L << var2 & this.b) == 0L) {
            var3 = false;
         }

         return var3;
      } else if (var2 >= 64 && var2 < 128) {
         if ((1L << var2 - 64 & this.a) != 0L) {
            var3 = var6;
         } else {
            var3 = false;
         }

         return var3;
      } else if (var2 > 0) {
         return false;
      } else {
         int[] var7 = this.d;
         var3 = var5;
         if (var7 != null) {
            if (C.b.e(var7, var1) >= 0) {
               var3 = var4;
            } else {
               var3 = false;
            }
         }

         return var3;
      }
   }

   public final c b(int var1) {
      int var2 = this.c;
      int var3 = var1 - var2;
      long var8 = this.b;
      long var6;
      int[] var16;
      if (var3 >= 0 && var3 < 64) {
         var6 = 1L << var3;
         if ((var8 & var6) == 0L) {
            var16 = this.d;
            return new c(this.a, var8 | var6, var2, var16);
         }
      } else {
         var6 = this.a;
         long var10;
         if (var3 >= 64 && var3 < 128) {
            var10 = 1L << var3 - 64;
            if ((var6 & var10) == 0L) {
               return new c(var6 | var10, var8, var2, this.d);
            }
         } else {
            int[] var15 = this.d;
            if (var3 >= 128) {
               if (!this.a(var1)) {
                  int var4 = (var1 + 1) / 64 * 64;
                  var2 = this.c;
                  ArrayList var12 = null;

                  ArrayList var14;
                  while(true) {
                     if (var2 >= var4) {
                        var14 = var12;
                        break;
                     }

                     var14 = var12;
                     if (var8 != 0L) {
                        ArrayList var13 = var12;
                        if (var12 == null) {
                           var12 = new ArrayList();
                           var13 = var12;
                           if (var15 != null) {
                              int var5 = var15.length;
                              var3 = 0;

                              while(true) {
                                 var13 = var12;
                                 if (var3 >= var5) {
                                    break;
                                 }

                                 var12.add(var15[var3]);
                                 ++var3;
                              }
                           }
                        }

                        var3 = 0;

                        while(true) {
                           var14 = var13;
                           if (var3 >= 64) {
                              break;
                           }

                           if ((1L << var3 & var8) != 0L) {
                              var13.add(var3 + var2);
                           }

                           ++var3;
                        }
                     }

                     if (var6 == 0L) {
                        var2 = var4;
                        var8 = 0L;
                        break;
                     }

                     var2 += 64;
                     var10 = 0L;
                     var8 = var6;
                     var12 = var14;
                     var6 = var10;
                  }

                  var16 = var15;
                  if (var14 != null) {
                     int[] var17 = new int[var14.size()];
                     Iterator var18 = var14.iterator();
                     var3 = 0;

                     while(true) {
                        var16 = var17;
                        if (!var18.hasNext()) {
                           break;
                        }

                        var17[var3] = ((Number)var18.next()).intValue();
                        ++var3;
                     }
                  }

                  return (new c(var6, var8, var2, var16)).b(var1);
               }
            } else {
               if (var15 == null) {
                  return new c(var6, var8, var2, new int[]{var1});
               }

               var2 = C.b.e(var15, var1);
               if (var2 < 0) {
                  var2 = -(var2 + 1);
                  var3 = var15.length;
                  var16 = new int[var3 + 1];
                  g.L(0, 0, var2, var15, var16);
                  g.L(var2 + 1, var2, var3, var15, var16);
                  var16[var2] = var1;
                  var1 = this.c;
                  return new c(this.a, this.b, var1, var16);
               }
            }
         }
      }

      return this;
   }

   public final Iterator iterator() {
      Object var2 = new Object();
      b var1 = new b(this, (b0.a)var2);
      var1.g = var2;
      ((n0.e)var2).c = var1;
      return (Iterator)var2;
   }

   public final String toString() {
      StringBuilder var5 = new StringBuilder();
      var5.append(super.toString());
      var5.append(" [");
      ArrayList var6 = new ArrayList(j.L(this));
      Iterator var8 = this.iterator();

      while(true) {
         n0.e var7 = (n0.e)var8;
         if (!var7.hasNext()) {
            StringBuilder var10 = new StringBuilder();
            var10.append("");
            int var3 = var6.size();
            int var1 = 0;

            for(int var2 = 0; var1 < var3; ++var1) {
               Object var9 = var6.get(var1);
               boolean var4 = true;
               ++var2;
               if (var2 > 1) {
                  var10.append(", ");
               }

               if (var9 != null) {
                  var4 = var9 instanceof CharSequence;
               }

               if (var4) {
                  var10.append((CharSequence)var9);
               } else if (var9 instanceof Character) {
                  var10.append((Character)var9);
               } else {
                  var10.append(String.valueOf(var9));
               }
            }

            var10.append("");
            var5.append(var10.toString());
            var5.append(']');
            return var5.toString();
         }

         var6.add(String.valueOf(((Number)var7.next()).intValue()));
      }
   }
}
