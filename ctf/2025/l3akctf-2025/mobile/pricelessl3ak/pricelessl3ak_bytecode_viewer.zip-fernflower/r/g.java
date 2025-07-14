package r;

import java.util.Locale;
import java.util.concurrent.CancellationException;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.Future;
import java.util.concurrent.ScheduledFuture;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;
import java.util.concurrent.locks.LockSupport;
import java.util.logging.Level;
import java.util.logging.Logger;

public abstract class g implements Future {
   public static final boolean d;
   public static final Logger e;
   public static final q.e f;
   public static final Object g;
   public volatile Object a;
   public volatile c b;
   public volatile f c;

   static {
      // $FF: Couldn't be decompiled
   }

   public static void b(g var0) {
      f var1;
      do {
         var1 = var0.c;
      } while(!f.d(var0, var1, r.f.c));

      for(; var1 != null; var1 = var1.b) {
         Thread var2 = var1.a;
         if (var2 != null) {
            var1.a = null;
            LockSupport.unpark(var2);
         }
      }

      c var6;
      do {
         var6 = var0.b;
      } while(!f.b(var0, var6));

      c var5 = null;
      c var4 = var6;

      while(true) {
         var6 = var5;
         if (var4 == null) {
            while(var6 != null) {
               var6 = var6.a;

               try {
                  throw null;
               } catch (RuntimeException var3) {
                  Level var7 = Level.SEVERE;
                  e.log(var7, "RuntimeException while executing runnable null with executor null", var3);
               }
            }

            return;
         }

         var6 = var4.a;
         var4.a = var5;
         var5 = var4;
         var4 = var6;
      }
   }

   public static Object c(Object var0) {
      if (!(var0 instanceof a)) {
         if (!(var0 instanceof b)) {
            Object var3 = var0;
            if (var0 == g) {
               var3 = null;
            }

            return var3;
         } else {
            ((b)var0).getClass();
            throw new ExecutionException((Throwable)null);
         }
      } else {
         CancellationException var1 = ((a)var0).a;
         CancellationException var2 = new CancellationException("Task was cancelled.");
         var2.initCause(var1);
         throw var2;
      }
   }

   public static Object d(g var0) {
      boolean var1 = false;

      Object var2;
      while(true) {
         boolean var5 = false;

         try {
            var5 = true;
            var2 = var0.get();
            var5 = false;
            break;
         } catch (InterruptedException var6) {
            var5 = false;
         } finally {
            if (var5) {
               if (var1) {
                  Thread.currentThread().interrupt();
               }

            }
         }

         var1 = true;
      }

      if (var1) {
         Thread.currentThread().interrupt();
      }

      return var2;
   }

   public final void a(StringBuilder var1) {
      ExecutionException var15;
      label62: {
         label63: {
            RuntimeException var10000;
            label51: {
               Object var2;
               boolean var10001;
               try {
                  var2 = d(this);
                  var1.append("SUCCESS, result=[");
               } catch (ExecutionException var9) {
                  var15 = var9;
                  var10001 = false;
                  break label62;
               } catch (CancellationException var10) {
                  var10001 = false;
                  break label63;
               } catch (RuntimeException var11) {
                  var10000 = var11;
                  var10001 = false;
                  break label51;
               }

               String var12;
               if (var2 == this) {
                  var12 = "this future";
               } else {
                  try {
                     var12 = String.valueOf(var2);
                  } catch (ExecutionException var6) {
                     var15 = var6;
                     var10001 = false;
                     break label62;
                  } catch (CancellationException var7) {
                     var10001 = false;
                     break label63;
                  } catch (RuntimeException var8) {
                     var10000 = var8;
                     var10001 = false;
                     break label51;
                  }
               }

               try {
                  var1.append(var12);
                  var1.append("]");
                  return;
               } catch (ExecutionException var3) {
                  var15 = var3;
                  var10001 = false;
                  break label62;
               } catch (CancellationException var4) {
                  var10001 = false;
                  break label63;
               } catch (RuntimeException var5) {
                  var10000 = var5;
                  var10001 = false;
               }
            }

            RuntimeException var13 = var10000;
            var1.append("UNKNOWN, cause=[");
            var1.append(var13.getClass());
            var1.append(" thrown from get()]");
            return;
         }

         var1.append("CANCELLED");
         return;
      }

      ExecutionException var14 = var15;
      var1.append("FAILURE, cause=[");
      var1.append(var14.getCause());
      var1.append("]");
   }

   public final boolean cancel(boolean var1) {
      Object var5 = this.a;
      boolean var3 = false;
      boolean var2 = var3;
      if (var5 == null) {
         a var4;
         if (d) {
            var4 = new a(var1, new CancellationException("Future.cancel() was called."));
         } else if (var1) {
            var4 = r.a.b;
         } else {
            var4 = r.a.c;
         }

         var2 = var3;
         if (f.c(this, var5, var4)) {
            b(this);
            var2 = true;
         }
      }

      return var2;
   }

   public final void e(f var1) {
      var1.a = null;

      label30:
      while(true) {
         var1 = this.c;
         if (var1 == r.f.c) {
            return;
         }

         f var3;
         for(f var2 = null; var1 != null; var2 = var3) {
            f var4 = var1.b;
            if (var1.a != null) {
               var3 = var1;
            } else if (var2 != null) {
               var2.b = var4;
               var3 = var2;
               if (var2.a == null) {
                  continue label30;
               }
            } else {
               var3 = var2;
               if (!f.d(this, var1, var4)) {
                  continue label30;
               }
            }

            var1 = var4;
         }

         return;
      }
   }

   public final Object get() {
      if (!Thread.interrupted()) {
         Object var1 = this.a;
         if (var1 != null) {
            return c(var1);
         } else {
            f var5 = this.c;
            f var4 = r.f.c;
            if (var5 != var4) {
               f var3 = new f();

               f var6;
               do {
                  q.e var2 = f;
                  var2.s(var3, var5);
                  if (var2.d(this, var5, var3)) {
                     do {
                        LockSupport.park(this);
                        if (Thread.interrupted()) {
                           this.e(var3);
                           throw new InterruptedException();
                        }

                        var1 = this.a;
                     } while(var1 == null);

                     return c(var1);
                  }

                  var6 = this.c;
                  var5 = var6;
               } while(var6 != var4);
            }

            return c(this.a);
         }
      } else {
         throw new InterruptedException();
      }
   }

   public final Object get(long var1, TimeUnit var3) {
      long var10 = var3.toNanos(var1);
      if (Thread.interrupted()) {
         throw new InterruptedException();
      } else {
         Object var12 = this.a;
         if (var12 != null) {
            return c(var12);
         } else {
            long var8;
            if (var10 > 0L) {
               var8 = System.nanoTime() + var10;
            } else {
               var8 = 0L;
            }

            long var6 = var10;
            if (var10 >= 1000L) {
               f var18 = this.c;
               f var15 = r.f.c;
               if (var18 == var15) {
                  return c(this.a);
               }

               f var14 = new f();

               while(true) {
                  q.e var13 = f;
                  var13.s(var14, var18);
                  if (var13.d(this, var18, var14)) {
                     do {
                        LockSupport.parkNanos(this, var10);
                        if (Thread.interrupted()) {
                           this.e(var14);
                           throw new InterruptedException();
                        }

                        var12 = this.a;
                        if (var12 != null) {
                           return c(var12);
                        }

                        var6 = var8 - System.nanoTime();
                        var10 = var6;
                     } while(var6 >= 1000L);

                     this.e(var14);
                     break;
                  }

                  f var19 = this.c;
                  var18 = var19;
                  if (var19 == var15) {
                     return c(this.a);
                  }
               }
            }

            while(var6 > 0L) {
               var12 = this.a;
               if (var12 != null) {
                  return c(var12);
               }

               if (Thread.interrupted()) {
                  throw new InterruptedException();
               }

               var6 = var8 - System.nanoTime();
            }

            String var24 = this.toString();
            String var20 = var3.toString();
            Locale var21 = Locale.ROOT;
            String var26 = var20.toLowerCase(var21);
            StringBuilder var22 = new StringBuilder("Waited ");
            var22.append(var1);
            var22.append(" ");
            var22.append(var3.toString().toLowerCase(var21));
            var20 = var22.toString();
            String var23 = var20;
            StringBuilder var17;
            if (var6 + 1000L < 0L) {
               StringBuilder var25 = new StringBuilder();
               var25.append(var20);
               var25.append(" (plus ");
               var23 = var25.toString();
               var6 = -var6;
               var1 = var3.convert(var6, TimeUnit.NANOSECONDS);
               var6 -= var3.toNanos(var1);
               long var27;
               int var5 = (var27 = var1 - 0L) == 0L ? 0 : (var27 < 0L ? -1 : 1);
               boolean var4;
               if (var5 != 0 && var6 <= 1000L) {
                  var4 = false;
               } else {
                  var4 = true;
               }

               String var16 = var23;
               if (var5 > 0) {
                  var17 = new StringBuilder();
                  var17.append(var23);
                  var17.append(var1);
                  var17.append(" ");
                  var17.append(var26);
                  var23 = var17.toString();
                  var16 = var23;
                  if (var4) {
                     var17 = new StringBuilder();
                     var17.append(var23);
                     var17.append(",");
                     var16 = var17.toString();
                  }

                  var25 = new StringBuilder();
                  var25.append(var16);
                  var25.append(" ");
                  var16 = var25.toString();
               }

               var23 = var16;
               if (var4) {
                  var25 = new StringBuilder();
                  var25.append(var16);
                  var25.append(var6);
                  var25.append(" nanoseconds ");
                  var23 = var25.toString();
               }

               var17 = new StringBuilder();
               var17.append(var23);
               var17.append("delay)");
               var23 = var17.toString();
            }

            if (this.isDone()) {
               var17 = new StringBuilder();
               var17.append(var23);
               var17.append(" but future completed as timeout expired");
               throw new TimeoutException(var17.toString());
            } else {
               var17 = new StringBuilder();
               var17.append(var23);
               var17.append(" for ");
               var17.append(var24);
               throw new TimeoutException(var17.toString());
            }
         }
      }
   }

   public final boolean isCancelled() {
      return this.a instanceof a;
   }

   public final boolean isDone() {
      boolean var1;
      if (this.a != null) {
         var1 = true;
      } else {
         var1 = false;
      }

      return var1;
   }

   public final String toString() {
      StringBuilder var2 = new StringBuilder();
      var2.append(super.toString());
      var2.append("[status=");
      if (this.a instanceof a) {
         var2.append("CANCELLED");
      } else if (this.isDone()) {
         this.a(var2);
      } else {
         String var1;
         label32: {
            try {
               if (this instanceof ScheduledFuture) {
                  StringBuilder var5 = new StringBuilder("remaining delay=[");
                  var5.append(((ScheduledFuture)this).getDelay(TimeUnit.MILLISECONDS));
                  var5.append(" ms]");
                  var1 = var5.toString();
                  break label32;
               }
            } catch (RuntimeException var4) {
               StringBuilder var3 = new StringBuilder("Exception thrown from implementation: ");
               var3.append(var4.getClass());
               var1 = var3.toString();
               break label32;
            }

            var1 = null;
         }

         if (var1 != null && !var1.isEmpty()) {
            var2.append("PENDING, info=[");
            var2.append(var1);
            var2.append("]");
         } else if (this.isDone()) {
            this.a(var2);
         } else {
            var2.append("PENDING");
         }
      }

      var2.append("]");
      return var2.toString();
   }
}
