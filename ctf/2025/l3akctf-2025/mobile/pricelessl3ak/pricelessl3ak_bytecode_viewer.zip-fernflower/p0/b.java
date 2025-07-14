package p0;

import i0.d;
import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;

public final class b extends q0.a implements a {
   public static final AtomicReferenceFieldUpdater c = AtomicReferenceFieldUpdater.newUpdater(b.class, Object.class, "_state");
   private volatile Object _state;
   public int b;

   public b(Object var1) {
      this._state = var1;
   }

   public final void a(Object var1) {
      Object var5 = var1;
      if (var1 == null) {
         var5 = q0.a.a;
      }

      synchronized(this){}

      Throwable var10000;
      Throwable var49;
      label510: {
         boolean var4;
         AtomicReferenceFieldUpdater var48;
         boolean var10001;
         try {
            var48 = c;
            var4 = d.a(var48.get(this), var5);
         } catch (Throwable var47) {
            var10000 = var47;
            var10001 = false;
            break label510;
         }

         if (var4) {
            return;
         }

         int var2;
         try {
            var48.set(this, var5);
            var2 = this.b;
         } catch (Throwable var46) {
            var10000 = var46;
            var10001 = false;
            break label510;
         }

         if ((var2 & 1) == 0) {
            label511: {
               ++var2;

               try {
                  this.b = var2;
               } catch (Throwable var44) {
                  var10000 = var44;
                  var10001 = false;
                  break label511;
               }

               while(true) {
                  synchronized(this){}

                  label513: {
                     int var3;
                     try {
                        var3 = this.b;
                     } catch (Throwable var43) {
                        var10000 = var43;
                        var10001 = false;
                        break label513;
                     }

                     if (var3 != var2) {
                        var2 = var3;
                        continue;
                     }

                     label477:
                     try {
                        this.b = var2 + 1;
                        return;
                     } catch (Throwable var42) {
                        var10000 = var42;
                        var10001 = false;
                        break label477;
                     }
                  }

                  var49 = var10000;
                  throw var49;
               }
            }
         } else {
            label493:
            try {
               this.b = var2 + 2;
               return;
            } catch (Throwable var45) {
               var10000 = var45;
               var10001 = false;
               break label493;
            }
         }
      }

      var49 = var10000;
      throw var49;
   }
}
