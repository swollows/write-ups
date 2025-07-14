package F;

import android.content.ClipDescription;
import android.net.Uri;
import android.view.inputmethod.InputContentInfo;

public final class g implements h {
   public final InputContentInfo a;

   public g(Uri var1, ClipDescription var2, Uri var3) {
      this.a = new InputContentInfo(var1, var2, var3);
   }

   public g(Object var1) {
      this.a = (InputContentInfo)var1;
   }

   public final ClipDescription a() {
      return this.a.getDescription();
   }

   public final void b() {
      this.a.requestPermission();
   }

   public final Uri c() {
      return this.a.getLinkUri();
   }

   public final Object d() {
      return this.a;
   }

   public final Uri e() {
      return this.a.getContentUri();
   }
}
