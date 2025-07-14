package X;

import android.content.Context;
import android.os.Handler;
import android.os.HandlerThread;
import android.os.Message;
import android.os.Parcel;
import ctf.l3akctf.pricelessl3ak.p2a1672ac;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.atomic.AtomicInteger;

public final class c {
   public a a;
   public Context b;
   public boolean c;

   public final void a(D.d var1, String var2, ArrayList var3) {
      if (!this.c) {
         this.b();
      }

      h var5 = h.k();
      p2a1672ac var8;
      if (!var3.isEmpty()) {
         var8 = new p2a1672ac(var2, var3);
      } else {
         var8 = new p2a1672ac(var2, (ArrayList)null);
      }

      b var7 = new b(var1);
      ConcurrentHashMap var9 = (ConcurrentHashMap)var5.a;
      int var4 = var8.a;
      f var11 = (f)var9.get(var4);
      if (var11 != null) {
         Parcel var6 = Parcel.obtain();
         var8.writeToParcel(var6, 0);
         Message var10 = var11.obtainMessage();
         var10.obj = var6;
         var4 = ((AtomicInteger)var5.c).incrementAndGet();
         var10.what = var4;
         ((ConcurrentHashMap)var5.b).put(var4, var7);
         var11.sendMessageDelayed(var10, 50L);
      } else {
         StringBuilder var12 = new StringBuilder("No handler registered for message type: ");
         var12.append(var4);
         var7.b(var12.toString());
      }

   }

   public final void b() {
      if (!this.c) {
         h var2 = h.k();
         this.a = (a)(new Object());
         a var1 = this.a;
         HandlerThread var3 = new HandlerThread("BackgroundProcessor", 10);
         var3.start();
         Handler var4 = new Handler(var3.getLooper());
         new WeakReference(var1);
         var4.a = this.b.getApplicationContext();
         ((ConcurrentHashMap)var2.a).put(4919, var4);
         this.c = true;
      }

   }
}
