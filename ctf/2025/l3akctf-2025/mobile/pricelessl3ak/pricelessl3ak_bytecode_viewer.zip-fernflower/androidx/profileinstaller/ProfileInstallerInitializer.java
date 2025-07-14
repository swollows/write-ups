package androidx.profileinstaller;

import D.z;
import P.h;
import S.b;
import android.content.Context;
import android.view.Choreographer;
import java.util.Collections;
import java.util.List;

public class ProfileInstallerInitializer implements b {
   public final List a() {
      return Collections.emptyList();
   }

   public final Object b(Context var1) {
      var1 = var1.getApplicationContext();
      Choreographer.getInstance().postFrameCallback(new h(this, var1));
      return new z(11);
   }
}
