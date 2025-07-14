package androidx.lifecycle;

import android.app.Activity;

public final class A$a extends h {
   final B this$0;

   public A$a(B var1) {
      this.this$0 = var1;
   }

   public void onActivityPostResumed(Activity var1) {
      i0.d.e(var1, "activity");
      this.this$0.a();
   }

   public void onActivityPostStarted(Activity var1) {
      i0.d.e(var1, "activity");
      B var3 = this.this$0;
      int var2 = var3.a + 1;
      var3.a = var2;
      if (var2 == 1 && var3.d) {
         var3.f.e(n.ON_START);
         var3.d = false;
      }

   }
}
