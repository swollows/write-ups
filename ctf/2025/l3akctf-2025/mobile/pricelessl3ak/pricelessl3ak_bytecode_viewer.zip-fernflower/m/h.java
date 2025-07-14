package m;

import java.util.Arrays;

public final class h implements Cloneable {
   public boolean a;
   public long[] b;
   public Object[] c;
   public int d;

   public final void a(long var1, Object var3) {
      int var4 = n.a.b(this.b, this.d, var1);
      if (var4 >= 0) {
         this.c[var4] = var3;
      } else {
         int var5 = ~var4;
         int var7 = this.d;
         Object var8 = i.a;
         if (var5 < var7) {
            Object[] var9 = this.c;
            if (var9[var5] == var8) {
               this.b[var5] = var1;
               var9[var5] = var3;
               return;
            }
         }

         var4 = var5;
         int var6;
         if (this.a) {
            long[] var10 = this.b;
            var4 = var5;
            if (var7 >= var10.length) {
               Object[] var11 = this.c;
               var6 = 0;

               for(var4 = 0; var6 < var7; var4 = var5) {
                  Object var14 = var11[var6];
                  var5 = var4;
                  if (var14 != var8) {
                     if (var6 != var4) {
                        var10[var4] = var10[var6];
                        var11[var4] = var14;
                        var11[var6] = null;
                     }

                     var5 = var4 + 1;
                  }

                  ++var6;
               }

               this.a = false;
               this.d = var4;
               var4 = ~n.a.b(this.b, var4, var1);
            }
         }

         var5 = this.d;
         long[] var12;
         Object[] var13;
         if (var5 >= this.b.length) {
            var7 = (var5 + 1) * 8;
            var5 = 4;

            while(true) {
               var6 = var7;
               if (var5 >= 32) {
                  break;
               }

               var6 = (1 << var5) - 12;
               if (var7 <= var6) {
                  break;
               }

               ++var5;
            }

            var5 = var6 / 8;
            var12 = Arrays.copyOf(this.b, var5);
            i0.d.d(var12, "copyOf(this, newSize)");
            this.b = var12;
            var13 = Arrays.copyOf(this.c, var5);
            i0.d.d(var13, "copyOf(this, newSize)");
            this.c = var13;
         }

         var6 = this.d - var4;
         if (var6 != 0) {
            var12 = this.b;
            var5 = var4 + 1;
            i0.d.e(var12, "<this>");
            System.arraycopy(var12, var4, var12, var5, var6);
            var13 = this.c;
            Z.g.M(var13, var13, var5, var4, this.d);
         }

         this.b[var4] = var1;
         this.c[var4] = var3;
         ++this.d;
      }

   }

   public final Object clone() {
      Object var1 = super.clone();
      i0.d.c(var1, "null cannot be cast to non-null type androidx.collection.LongSparseArray<E of androidx.collection.LongSparseArray>");
      h var2 = (h)var1;
      var2.b = (long[])this.b.clone();
      var2.c = (Object[])this.c.clone();
      return var2;
   }

   public final String toString() {
      boolean var7 = this.a;
      Object var8 = i.a;
      int var1;
      int var2;
      int var3;
      int var4;
      Object[] var10;
      long[] var11;
      if (var7) {
         var4 = this.d;
         var11 = this.b;
         var10 = this.c;
         var1 = 0;

         for(var2 = 0; var1 < var4; var2 = var3) {
            Object var9 = var10[var1];
            var3 = var2;
            if (var9 != var8) {
               if (var1 != var2) {
                  var11[var2] = var11[var1];
                  var10[var2] = var9;
                  var10[var1] = null;
               }

               var3 = var2 + 1;
            }

            ++var1;
         }

         this.a = false;
         this.d = var2;
      }

      StringBuilder var13;
      label100: {
         label118: {
            var1 = this.d;
            String var14;
            if (var1 <= 0) {
               var14 = "{}";
            } else {
               StringBuilder var15 = new StringBuilder(var1 * 28);
               var15.append('{');
               int var5 = this.d;
               var1 = 0;

               while(true) {
                  if (var1 >= var5) {
                     var15.append('}');
                     var14 = var15.toString();
                     i0.d.d(var14, "StringBuilder(capacity).…builderAction).toString()");
                     break;
                  }

                  if (var1 > 0) {
                     var15.append(", ");
                  }

                  if (var1 < 0) {
                     break label118;
                  }

                  int var6 = this.d;
                  if (var1 >= var6) {
                     break label118;
                  }

                  if (this.a) {
                     var11 = this.b;
                     var10 = this.c;
                     var2 = 0;
                     var4 = 0;

                     while(true) {
                        if (var2 >= var6) {
                           this.a = false;
                           this.d = var4;
                           break;
                        }

                        Object var12 = var10[var2];
                        var3 = var4;
                        if (var12 != var8) {
                           if (var2 != var4) {
                              var11[var4] = var11[var2];
                              var10[var4] = var12;
                              var10[var2] = null;
                           }

                           var3 = var4 + 1;
                        }

                        ++var2;
                        var4 = var3;
                     }
                  }

                  var15.append(this.b[var1]);
                  var15.append('=');
                  if (var1 < 0) {
                     break label100;
                  }

                  var6 = this.d;
                  if (var1 >= var6) {
                     break label100;
                  }

                  Object var16;
                  if (this.a) {
                     long[] var18 = this.b;
                     Object[] var17 = this.c;
                     var2 = 0;

                     for(var4 = 0; var2 < var6; var4 = var3) {
                        var16 = var17[var2];
                        var3 = var4;
                        if (var16 != var8) {
                           if (var2 != var4) {
                              var18[var4] = var18[var2];
                              var17[var4] = var16;
                              var17[var2] = null;
                           }

                           var3 = var4 + 1;
                        }

                        ++var2;
                     }

                     this.a = false;
                     this.d = var4;
                  }

                  var16 = this.c[var1];
                  if (var16 != var15) {
                     var15.append(var16);
                  } else {
                     var15.append("(this Map)");
                  }

                  ++var1;
               }
            }

            return var14;
         }

         var13 = new StringBuilder("Expected index to be within 0..size()-1, but was ");
         var13.append(var1);
         throw new IllegalArgumentException(var13.toString().toString());
      }

      var13 = new StringBuilder("Expected index to be within 0..size()-1, but was ");
      var13.append(var1);
      throw new IllegalArgumentException(var13.toString().toString());
   }
}
