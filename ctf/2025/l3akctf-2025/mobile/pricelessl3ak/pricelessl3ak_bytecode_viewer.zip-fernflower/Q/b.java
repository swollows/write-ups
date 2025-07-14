package q;

import X.h;
import i0.g;
import java.io.Serializable;
import java.lang.reflect.Field;
import java.lang.reflect.Method;

public final class b implements i0.c, Y.a, b0.a, Serializable {
   public final b0.a a;
   public final int b;
   public int[] c;
   public int d;
   public int e;
   public int f;
   public Object g;
   public final c h;

   public b(c var1, b0.a var2) {
      this.h = var1;
      this.a = var2;
      if (var2 != null && var2.d() != b0.b.a) {
         throw new IllegalArgumentException("Coroutines with restricted suspension must have EmptyCoroutineContext");
      } else {
         this.b = 2;
      }
   }

   public final void a(Object var1) {
      Object var2 = this;

      do {
         b var4 = (b)var2;
         var2 = var4.a;
         i0.d.b(var2);

         label42: {
            Object var3;
            c0.a var5;
            try {
               var3 = var4.e(var1);
               var5 = c0.a.a;
            } catch (Throwable var7) {
               var1 = new Y.d(var7);
               break label42;
            }

            var1 = var3;
            if (var3 == var5) {
               return;
            }
         }

         var4.getClass();
      } while(var2 instanceof b);

      ((b0.a)var2).a(var1);
   }

   public final int c() {
      return this.b;
   }

   public final b0.b d() {
      return b0.b.a;
   }

   public final Object e(Object var1) {
      int var2;
      int var4;
      long var5;
      c0.a var11;
      n0.e var12;
      Integer var15;
      label72: {
         n0.e var9;
         label68: {
            long var7;
            label73: {
               label66: {
                  var11 = c0.a.a;
                  var2 = this.f;
                  c var10 = this.h;
                  var5 = var10.a;
                  var4 = var10.c;
                  var7 = var10.b;
                  int var3;
                  int[] var14;
                  if (var2 != 0) {
                     if (var2 != 1) {
                        if (var2 != 2) {
                           if (var2 != 3) {
                              throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                           }

                           var2 = this.d;
                           var9 = (n0.e)this.g;
                           C.b.I(var1);
                           var12 = var9;
                           ++var2;
                           break label72;
                        }

                        var2 = this.d;
                        var9 = (n0.e)this.g;
                        C.b.I(var1);
                        var12 = var9;
                        ++var2;
                        break label73;
                     }

                     var2 = this.e;
                     var3 = this.d;
                     var14 = this.c;
                     var9 = (n0.e)this.g;
                     C.b.I(var1);
                     ++var3;
                  } else {
                     C.b.I(var1);
                     var9 = (n0.e)this.g;
                     var14 = var10.d;
                     var12 = var9;
                     if (var14 == null) {
                        break label66;
                     }

                     var2 = var14.length;
                     var3 = 0;
                  }

                  var12 = var9;
                  if (var3 < var2) {
                     Integer var13 = new Integer(var14[var3]);
                     this.g = var9;
                     this.c = var14;
                     this.d = var3;
                     this.e = var2;
                     this.f = 1;
                     var9.b = var13;
                     var9.a = 3;
                     var9.c = this;
                     return var11;
                  }
               }

               var9 = var12;
               if (var7 == 0L) {
                  break label68;
               }

               var2 = 0;
            }

            while(true) {
               if (var2 >= 64) {
                  var9 = var12;
                  break;
               }

               if ((var7 & 1L << var2) != 0L) {
                  var15 = new Integer(var4 + var2);
                  this.g = var12;
                  this.c = null;
                  this.d = var2;
                  this.f = 2;
                  var12.b = var15;
                  var12.a = 3;
                  var12.c = this;
                  return var11;
               }

               ++var2;
            }
         }

         if (var5 == 0L) {
            return Y.f.c;
         }

         var12 = var9;
      }

      for(var2 = 0; var2 < 64; ++var2) {
         if ((var5 & 1L << var2) != 0L) {
            var15 = new Integer(var2 + 64 + var4);
            this.g = var12;
            this.c = null;
            this.d = var2;
            this.f = 3;
            var12.b = var15;
            var12.a = 3;
            var12.c = this;
            return var11;
         }
      }

      return Y.f.c;
   }

   public void f() {
   }

   public final String g() {
      StringBuilder var7 = new StringBuilder("Continuation at ");
      d0.a var8 = (d0.a)this.getClass().getAnnotation(d0.a.class);
      Object var3 = null;
      Object var5 = null;
      if (var8 != null) {
         int var1 = var8.v();
         if (var1 > 1) {
            StringBuilder var23 = new StringBuilder("Debug metadata version mismatch. Expected: 1, got ");
            var23.append(var1);
            var23.append(". Please update the Kotlin standard library.");
            throw new IllegalStateException(var23.toString().toString());
         }

         byte var2 = -1;

         label92: {
            label91: {
               label101: {
                  Integer var15;
                  boolean var10001;
                  label89: {
                     try {
                        Field var14 = this.getClass().getDeclaredField("label");
                        var14.setAccessible(true);
                        var3 = var14.get(this);
                        if (var3 instanceof Integer) {
                           var15 = (Integer)var3;
                           break label89;
                        }
                     } catch (Exception var13) {
                        var10001 = false;
                        break label101;
                     }

                     var15 = null;
                  }

                  if (var15 == null) {
                     var1 = 0;
                     break label91;
                  }

                  try {
                     var1 = var15;
                     break label91;
                  } catch (Exception var12) {
                     var10001 = false;
                  }
               }

               var1 = -1;
               break label92;
            }

            --var1;
         }

         if (var1 < 0) {
            var1 = var2;
         } else {
            var1 = var8.l()[var1];
         }

         h var6 = d0.b.b;
         h var4 = d0.b.a;
         h var18 = var6;
         Method var19;
         if (var6 == null) {
            try {
               var19 = Class.class.getDeclaredMethod("getModule", (Class[])null);
               Method var10 = this.getClass().getClassLoader().loadClass("java.lang.Module").getDeclaredMethod("getDescriptor", (Class[])null);
               Method var9 = this.getClass().getClassLoader().loadClass("java.lang.module.ModuleDescriptor").getDeclaredMethod("name", (Class[])null);
               var18 = new h(var19, var10, var9);
               d0.b.b = var18;
            } catch (Exception var11) {
               d0.b.b = var4;
               var18 = var4;
            }
         }

         String var20;
         if (var18 == var4) {
            var20 = (String)var5;
         } else {
            Method var16 = (Method)var18.a;
            Object var17;
            if (var16 != null) {
               var17 = var16.invoke(this.getClass(), (Object[])null);
            } else {
               var17 = null;
            }

            if (var17 == null) {
               var20 = (String)var5;
            } else {
               var19 = (Method)var18.b;
               if (var19 != null) {
                  var17 = var19.invoke(var17, (Object[])null);
               } else {
                  var17 = null;
               }

               if (var17 == null) {
                  var20 = (String)var5;
               } else {
                  Method var21 = (Method)var18.c;
                  if (var21 != null) {
                     var17 = var21.invoke(var17, (Object[])null);
                  } else {
                     var17 = null;
                  }

                  var20 = (String)var5;
                  if (var17 instanceof String) {
                     var20 = (String)var17;
                  }
               }
            }
         }

         if (var20 == null) {
            var20 = var8.c();
         } else {
            StringBuilder var22 = new StringBuilder();
            var22.append(var20);
            var22.append('/');
            var22.append(var8.c());
            var20 = var22.toString();
         }

         var3 = new StackTraceElement(var20, var8.m(), var8.f(), var1);
      }

      if (var3 == null) {
         var3 = this.getClass().getName();
      }

      var7.append(var3);
      return var7.toString();
   }

   public final String toString() {
      String var1;
      if (this.a == null) {
         i0.g.a.getClass();
         var1 = i0.h.a(this);
         i0.d.d(var1, "renderLambdaToString(...)");
      } else {
         var1 = this.g();
      }

      return var1;
   }
}
