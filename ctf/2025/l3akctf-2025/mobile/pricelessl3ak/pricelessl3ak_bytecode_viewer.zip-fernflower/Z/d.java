package z;

import android.os.Trace;
import android.os.Build.VERSION;
import android.util.Log;

public abstract class d {
   public static final int a = 0;

   static {
      if (VERSION.SDK_INT < 29) {
         try {
            Trace.class.getField("TRACE_TAG_APP").getLong((Object)null);
            Class var0 = Long.TYPE;
            Trace.class.getMethod("isTagEnabled", var0);
            Class var1 = Integer.TYPE;
            Trace.class.getMethod("asyncTraceBegin", var0, String.class, var1);
            Trace.class.getMethod("asyncTraceEnd", var0, String.class, var1);
            Trace.class.getMethod("traceCounter", var0, String.class, var1);
         } catch (Exception var2) {
            Log.i("TraceCompat", "Unable to initialize via reflection.", var2);
         }
      }

   }
}
