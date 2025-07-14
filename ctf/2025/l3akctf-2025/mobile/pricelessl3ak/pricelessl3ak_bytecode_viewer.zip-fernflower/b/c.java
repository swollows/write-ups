package b;

public final class c implements Runnable {
   public final int a;
   public final androidx.fragment.app.i b;

   // $FF: synthetic method
   public c(androidx.fragment.app.i var1, int var2) {
      this.a = var2;
      this.b = var1;
   }

   public final void run() {
      switch (this.a) {
         case 0:
            this.b.invalidateMenu();
            return;
         default:
            androidx.fragment.app.i var1 = this.b;

            try {
               l.access$onBackPressed$s1027565324(var1);
            } catch (IllegalStateException var2) {
               if (!i0.d.a(var2.getMessage(), "Can not perform this action after onSaveInstanceState")) {
                  throw var2;
               }
            } catch (NullPointerException var3) {
               if (!i0.d.a(var3.getMessage(), "Attempt to invoke virtual method 'android.os.Handler android.app.FragmentHostCallback.getHandler()' on a null object reference")) {
                  throw var3;
               }
            }

      }
   }
}
